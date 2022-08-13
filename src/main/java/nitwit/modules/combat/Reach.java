package nitwit.modules.combat;

import java.text.DecimalFormat;
import java.util.ArrayList;

import de.Hero.settings.Setting;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerSP;
import nitwit.Client;
import nitwit.events.Event;
import nitwit.events.EventReach;
import nitwit.events.EventType;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;
import nitwit.modules.util.settings.NumberSetting;

@SuppressWarnings("all")
public class Reach extends Module{

    String distance;
    private double reach;

    public Reach(){
        super("Reach", 0x23, Category.Combat);

        ArrayList<String> options = new ArrayList<>();
            options.add("Reach");
            Client.settingsManager.rSetting(new Setting("Reach", this, 3.23, 3, 6, false));
            Client.settingsManager.rSetting(new Setting("Misplace", this, true));
    }  

    public void setReach(double reach) {
		this.reach = reach;
	}

    public void onDisable(){
        
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                if(mc.thePlayer.onGround) {
                    for(int i = 0; i < Client.settingsManager.getSettingByName("Reach").getValDouble(); i++){

                    boolean a = true;
                    if(a = Client.settingsManager.getSettingByName("Misplace").getValBoolean()){
                        for (final Object object : mc.theWorld.loadedEntityList) {
                            final Entity o = (Entity)object;
                            if (o.getEntityName() == mc.thePlayer.getEntityName()) {
                                continue;
                            }
                            final double oldX = o.posX;
                            final double oldY = o.posY;
                            final double oldZ = o.posZ;
                            if (mc.thePlayer.getDistanceToEntity(o) > Client.settingsManager.getSettingByName("Reach").getValDouble() || mc.thePlayer.getDistanceToEntity(o) <= 2.0f) {
                                continue;
                            }
                            final double mx = Math.cos(Math.toRadians(mc.thePlayer.rotationYaw + 90.0f));
                            final double mz = Math.sin(Math.toRadians(mc.thePlayer.rotationYaw + 90.0f));
                            o.setPosition(oldX - mx / mc.thePlayer.getDistanceToEntity(o) * 0.5, oldY, oldZ - mz / mc.thePlayer.getDistanceToEntity(o) * 0.5);
                            }
                        }else {
                            setReach(Client.settingsManager.getSettingByName("Reach").getValDouble());
                        }
                    }
                }
            }
        }
    }
}

