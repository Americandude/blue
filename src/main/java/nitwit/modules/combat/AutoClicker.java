package nitwit.modules.combat;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class AutoClicker extends Module{
    public AutoClicker(){
        super("AutoClicker", 0x18, Category.Combat);
    }

    public void onEnable(){

    }

    public void onDisable(){

    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                try {
                    mc.thePlayer.setSprinting(true);
                    mc.clickMouse(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
