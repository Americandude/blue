package nitwit.modules.movement;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class AutoSprint extends Module{
    public AutoSprint(){
        super("Sprint", 36, Category.Movement);
    }

    public void onEnable(){

    }

    public void onDisable(){
        mc.thePlayer.setSprinting(mc.gameSettings.keyBindSprint.isPressed());
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                if(!mc.thePlayer.isCollidedHorizontally && !mc.thePlayer.isUsingItem() && !mc.thePlayer.isSneaking()){
                    mc.thePlayer.setSprinting(true);
                }
            }
        }
    }
}
