package nitwit.modules.movement;

import java.util.ArrayList;

import de.Hero.settings.Setting;
import nitwit.Client;
import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class Speed extends Module{
    public Speed(){
        super("Speed", 0x30, Category.Movement);
        ArrayList<String> options = new ArrayList<>();
            options.add("Speed");
            Client.settingsManager.rSetting(new Setting("Speed", this, 1.1, 1, 20, false));
    }

    public void onDisable(){
        mc.thePlayer.motionX *= 1.0F;
        mc.thePlayer.motionY *= 1.0F;
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                if(mc.thePlayer.onGround) {
        
                    for(int i = 0; i < Client.settingsManager.getSettingByName("Speed").getValDouble(); i++){
                    mc.thePlayer.motionX *= 1.1f;
                    mc.thePlayer.motionZ *= 1.1f;
                    mc.thePlayer.motionY *= 1.1f;
                    }
                }
            }
        }
    }
}

