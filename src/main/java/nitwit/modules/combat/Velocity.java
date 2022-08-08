package nitwit.modules.combat;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class Velocity extends Module{
    public Velocity(){
        super("Velocity", 0x2F, Category.Combat);
    }

    public void onEnable(){

    }

    public void onDisable(){
        super.onDisable();
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                if (mc.thePlayer.hurtResistantTime > 0 && mc.thePlayer.hurtTime > 0) {
                    mc.thePlayer.hurtResistantTime = 0;
                    mc.thePlayer.hurtTime = 0;
                    mc.thePlayer.motionX = 0.0;
                    mc.thePlayer.motionY /= 10.0;
                    mc.thePlayer.motionZ = 0.0;
                }
            }
        }
    }
}
