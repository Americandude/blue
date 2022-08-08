package nitwit.modules.player;

import net.minecraft.src.Packet13PlayerLookMove;
import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class NoFall extends Module{
    public NoFall(){
        super("NoFall", 0x22, Category.Player);
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate && e.isPre()){
            if(mc.thePlayer.fallDistance > 2){
                mc.thePlayer.fallDistance = 0.0F;
                mc.thePlayer.onGround = true;
                double stance = mc.thePlayer.boundingBox.minY - 0.0001D;
                mc.thePlayer.sendQueue.addToSendQueue(new Packet13PlayerLookMove(mc.thePlayer.posX, stance, mc.thePlayer.posY, mc.thePlayer.posZ, mc.thePlayer.rotationYaw, mc.thePlayer.rotationPitch, true));
            }
        }
    }
}
