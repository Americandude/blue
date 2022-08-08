package nitwit.modules.movement;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class AutoWalk extends Module{
    public AutoWalk(){
        super("AutoWalk", 0x26, Category.Movement);
    }

    public void onEnable(){

    }

    public void onDisable(){
        mc.gameSettings.keyBindForward.pressed = false;
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                mc.gameSettings.keyBindForward.pressed = true;
            }
        }
    }
}

