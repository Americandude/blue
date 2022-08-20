package nitwit.modules.combat;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class AutoClicker extends Module{
    public AutoClicker(){
        super("AutoClicker", 0x18, Category.Combat);
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){

            /*
             * If module is enabled, continue
             */

            if(e.isPre()){
                try {

                    /*
                     * Click the mouse about once every tick
                     */

                    mc.thePlayer.setSprinting(true);
                    mc.clickMouse(0);
                } catch (Exception ex) {

                    /*
                     * Debugging purposes in case it fucks up
                     */

                    ex.printStackTrace();
                }
            }
        }
    }
}
