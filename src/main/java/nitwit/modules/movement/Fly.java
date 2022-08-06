package nitwit.modules.movement;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class Fly extends Module{
    public Fly(){
        super("Fly", 33, Category.MOVEMENT);
    }

    public void onEnable(){
        mc.thePlayer.capabilities.allowFlying = true;
        mc.thePlayer.capabilities.isFlying = true;
    }

    public void onDisable(){
        mc.thePlayer.capabilities.allowFlying = false;
        mc.thePlayer.capabilities.isFlying = false;
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){

            }
        }
    }
}
