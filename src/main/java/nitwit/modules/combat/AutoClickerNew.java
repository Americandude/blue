package nitwit.modules.combat;

import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;
import nitwit.modules.util.time.TimeUtils;

@SuppressWarnings("all")
public class AutoClickerNew extends Module {

    private int minCPSValue = 13;
    private int maxCPSValue = 15;
    private long leftDelay;
    private long leftLastSwing;
    
    public AutoClickerNew(){
        super("AutoClickerNew", 0x17, Category.Combat);
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                if (System.currentTimeMillis() - this.leftLastSwing >= this.leftDelay) {
                        mc.thePlayer.setSprinting(true);
                        mc.clickMouse(0);
                        this.leftDelay = TimeUtils.randomClickDelay(minCPSValue, maxCPSValue);
                }
            }
        }
    }
}