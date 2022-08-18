package nitwit.modules.combat;

import de.Hero.settings.Setting;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityAnimal;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityMob;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityVillager;
import net.minecraft.src.MathHelper;
import nitwit.Client;
import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;
import nitwit.modules.util.misc.RandomUtils;
import nitwit.modules.util.player.RotationUtil;
import nitwit.modules.util.settings.NumberSetting;

@SuppressWarnings("all")
public class AimAssist extends Module {

    public AimAssist() {
        super("AimAssist", 0, Category.Combat);

        Client.settingsManager.rSetting(new Setting("Strength", this, 40, 1, 50, false));
        Client.settingsManager.rSetting(new Setting("Range", this, 6, 1, 10, false));
    }

    public static EntityLiving target;
    public static int deltaX, deltaY;
    public static float yaw, pitch, lastYaw, lastPitch, serverYaw, serverPitch;

    public void onEvent(Event e) {
        if (e instanceof EventUpdate) {
            if (e.isPre()) {

                final double range = Client.settingsManager.getSettingByName("Range").getValDouble();
                final double strength = Client.settingsManager.getSettingByName("Strength").getValDouble();
                target = getClosest(range);
                yaw = mc.thePlayer.rotationYaw;
                pitch = mc.thePlayer.rotationPitch;

                final float s = (float) (50 - strength) + 1;

                final float[] rotations = getRotations();

                final float targetYaw = (float) (rotations[0] + Math.random());
                final float targetPitch = (float) (rotations[1] + Math.random());

                final float Yaw1 = (targetYaw - mc.thePlayer.rotationYaw) / Math.max(2, s);
                final float Pitch1 = (targetPitch - mc.thePlayer.rotationPitch) / Math.max(2, s);

                final float f = mc.gameSettings.mouseSensitivity * 0.6F + 0.2F;
                final float gcd = f * f * f * 8.0F;

                deltaX = Math.round(Yaw1 / gcd);

            }
        }
    }

    public void onDisable() {
        deltaX = 0;
        deltaY = 0;
    }

    /**
     * Gets the closest target in a range for the aura to decide which entity it
     * will attack.
     *
     * @param range The maximum range the closest entity will be searched for.
     * @return The closest entity in a range.
     */

    private EntityLiving getClosest(final double range) {
        if (mc.theWorld == null)
            return null;

        double dist = range;
        EntityLiving target = null;

        return target;
    }

    private boolean canAttack(final EntityLiving player) {

        if (player.ticksExisted < 2)
            return false;

        return mc.thePlayer != player;
    }

    private float[] getRotations() {

        if (target != null) {

            double var4 = (target.posX - (target.lastTickPosX - target.posX)) + 0.01 - mc.thePlayer.posX;
            double var6 = (target.posZ - (target.lastTickPosZ - target.posZ)) - mc.thePlayer.posZ;
            double var8 = (target.posY - (target.lastTickPosY - target.posY)) + 0.4 + target.getEyeHeight() / 1.3
                    - (mc.thePlayer.posY + mc.thePlayer.getEyeHeight());
            double var14 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
            float yaw = (float) (Math.atan2(var6, var4) * 180.0D / Math.PI) - 90.0F;
            float pitch = (float) -(Math.atan2(var8, var14) * 180.0D / Math.PI);

            yaw = mc.thePlayer.rotationYaw + MathHelper.wrapAngleTo180_float(yaw - mc.thePlayer.rotationYaw);
            pitch = mc.thePlayer.rotationPitch + MathHelper.wrapAngleTo180_float(pitch - mc.thePlayer.rotationPitch);

            final float[] rotations = new float[] { yaw, pitch };
            final float[] lastRotations = new float[] { yaw, pitch };

            final float[] fixedRotations = RotationUtil.getFixedRotation(rotations, lastRotations);

            yaw = fixedRotations[0];
            pitch = fixedRotations[1];

            pitch = MathHelper.clamp_float(pitch, -90.0F, 90.0F);
        }

        return new float[] { yaw, pitch };
    }

    public double randomBetween(final double min, final double max) {
        return ((Math.random() * ((RandomUtils.nextDouble(max, max + 1)) - RandomUtils.nextDouble(min, min + 1)) + 1)
                + min);
    }
}
