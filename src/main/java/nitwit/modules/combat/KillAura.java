package nitwit.modules.combat;

import java.util.ArrayList;
import java.util.Iterator;

import de.Hero.settings.Setting;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityAnimal;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityMob;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.EntityVillager;
import net.minecraft.src.ItemSword;
import net.minecraft.src.MathHelper;
import nitwit.Client;
import nitwit.events.Event;
import nitwit.events.listeners.EventMotion;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;
import nitwit.modules.util.valuesys.Value;

@SuppressWarnings("all")
public class KillAura extends Module{

    private EntityLiving target;
    private long current, last;
    private int delay = 8;
    private float yaw, pitch;
    private boolean others;

    public KillAura(){
        super("KillAura", 0x25, Category.Combat);

        ArrayList<String> options = new ArrayList<>();
        Client.instance.settingsManager.rSetting(new Setting("particle multiplier", this, 5, 0, 15, true));
        Client.instance.settingsManager.rSetting(new Setting("Distance", this, 4, 3, 5, true));
        Client.instance.settingsManager.rSetting(new Setting("BlatantMulti", this, 1, 1, 3, false));
        Client.instance.settingsManager.rSetting(new Setting("Players", this, true));
        Client.instance.settingsManager.rSetting(new Setting("Animals", this, false));
        Client.instance.settingsManager.rSetting(new Setting("Mobs", this, false));
        Client.instance.settingsManager.rSetting(new Setting("Invisibles", this, false));
        Client.instance.settingsManager.rSetting(new Setting("Existed", this, 30, 0, 500, true));
        Client.instance.settingsManager.rSetting(new Setting("AutoBlock", this, true));
    }

    private boolean canAttack(EntityLiving player) {
        if(player instanceof EntityPlayer || player instanceof EntityAnimal || player instanceof EntityMob || player instanceof EntityVillager) {
            if (player instanceof EntityPlayer && !Client.instance.settingsManager.getSettingByName("Players").getValBoolean())
                return false;
                    if (player instanceof EntityAnimal && !Client.instance.settingsManager.getSettingByName("Animals").getValBoolean())
                        return false;
                            if (player instanceof EntityMob && !Client.instance.settingsManager.getSettingByName("Mobs").getValBoolean())
                                return false;
        }
        if(player.isInvisible() && !Client.instance.settingsManager.getSettingByName("Invisibles").getValBoolean())
            return false;
                return player != mc.thePlayer && player.isEntityAlive() && mc.thePlayer.getDistanceToEntity(player) <= mc.playerController.getBlockReachDistance() && player.ticksExisted > Client.instance.settingsManager.getSettingByName("Existed").getValDouble();
    }

    private void attack(Entity entity) {
        for(int i = 0; i < Client.instance.settingsManager.getSettingByName("particle multiplier").getValDouble(); i++)
            mc.thePlayer.onCriticalHit(entity);
            mc.thePlayer.swingItem();
            mc.playerController.attackEntity(mc.thePlayer, entity);
    }

    private void updateTime() {
        current = (System.nanoTime() / 1000000L);
    }

    private void resetTime() {
        last = (System.nanoTime() / 1000000L);
    }

    private EntityLiving getClosest(double range) {
        double dist = range;
        EntityLiving target = null;
        for (Object object : mc.theWorld.loadedEntityList) {
            Entity entity = (Entity) object;
            if (entity instanceof EntityLiving) {
                EntityLiving player = (EntityLiving) entity;
                if (canAttack(player)) {
                    double currentDist = mc.thePlayer.getDistanceToEntity(player);
                    if (currentDist <= dist) {
                        dist = currentDist;
                        target = player;
                    }
                }
            }
        }
        return target;
    }

    private float getAngleDifference(float dir, float yaw) {
        float f = Math.abs(yaw - dir) % 360F;
        float dist = f > 180F ? 360F - f : f;
        return dist;
    }

    private float[] getRotations(double x, double y, double z) {
        double diffX = x + .5D - mc.thePlayer.posX;
        double diffY = (y + .5D) / 2D - (mc.thePlayer.posY + mc.thePlayer.getEyeHeight());
        double diffZ = z + .5D - mc.thePlayer.posZ;
        double dist = MathHelper.sqrt_double(diffX * diffX + diffZ * diffZ);
        float yaw = (float)(Math.atan2(diffZ, diffX) * 180D / Math.PI) - 90F;
        float pitch = (float)-(Math.atan2(diffY, dist) * 180D / Math.PI);
        return new float[] { yaw, pitch };
    }

    public void onEvent(Event e){
        if(e instanceof EventMotion){
            if(e.isPre()){
                target = getClosest(mc.playerController.getBlockReachDistance());
                    if(target == null)
                        return;
                        updateTime();
                            yaw = mc.thePlayer.rotationYaw;
                            pitch = mc.thePlayer.rotationPitch;
                            boolean block = target != null && Client.instance.settingsManager.getSettingByName("AutoBlock").getValBoolean() && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemSword;
                            if(block && target.getDistanceToEntity(mc.thePlayer) < 8F)
                                mc.playerController.sendUseItem(mc.thePlayer, mc.theWorld, mc.thePlayer.inventory.getCurrentItem());
                                    if(current - last > 1000 / delay) {
                                        attack(target);
                                            resetTime();
                }
            }
        }
    }
}
