package nitwit.modules.movement;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class AutoSprint extends Module{
    public AutoSprint(){
        super("Sprint", 36, Category.MOVEMENT);
    }

    public void onEnable(){

    }

    public void onDisable(){
        mc.thePlayer.setSprinting(false);
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                mc.thePlayer.setSprinting(true);
            }
        }
    }
}
