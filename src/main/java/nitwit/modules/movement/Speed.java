package nitwit.modules.movement;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class Speed extends Module{
    public Speed(){
        super("Speed", 0x30, Category.Movement);
    }

    public void onEnable(){

    }

    public void onDisable(){
        mc.thePlayer.motionX *= 1.0F;
        mc.thePlayer.motionY *= 1.0F;
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                if(mc.thePlayer.onGround) {
                    mc.thePlayer.motionX *= 1.30f;
                    mc.thePlayer.motionZ *= 1.30f;
                }
            }
        }
    }
}

