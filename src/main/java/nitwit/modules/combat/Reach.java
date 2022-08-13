package nitwit.modules.combat;

import java.util.ArrayList;

import de.Hero.settings.Setting;
import nitwit.Client;
import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;
import nitwit.modules.util.settings.NumberSetting;

@SuppressWarnings("all")
public class Reach extends Module{
    public Reach(){
        super("Reach", 0x23, Category.Combat);

        ArrayList<String> options = new ArrayList<>();
            options.add("Reach");
            Client.settingsManager.rSetting(new Setting("Reach", this, 3.23, 3, 6, false));
            final NumberSetting reach = new NumberSetting("Reach", this, 3.0, 3.0, 4.0, 0.01);
    }

    public void onDisable(){
        
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                if(mc.thePlayer.onGround) {
                    for(int i = 0; i < Client.settingsManager.getSettingByName("Reach").getValDouble(); i++){
                    }
                }
            }
        }
    }
}

