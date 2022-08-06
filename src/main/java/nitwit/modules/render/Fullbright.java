package nitwit.modules.render;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class Fullbright extends Module{
    public Fullbright(){
        super("Fullbright", 50, Category.Render);
    }

    public void onEnable(){
        mc.gameSettings.gammaSetting = 100F;
    }

    public void onDisable(){
        mc.gameSettings.gammaSetting = 1F;
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
            }
        }
    }
}
