package nitwit.modules.movement;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class Fly extends Module{
    public Fly(){
        super("Fly", 33, Category.Movement);
    }

    public void onDisable(){
        mc.thePlayer.capabilities.isFlying = false;
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                mc.thePlayer.capabilities.isFlying = true;
            }
        }
    }
}
