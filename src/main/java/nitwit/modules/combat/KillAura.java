package nitwit.modules.combat;

import java.util.Iterator;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayerSP;
import nitwit.events.Event;
import nitwit.events.listeners.EventMotion;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class KillAura extends Module{
    public KillAura(){
        super("KillAura", 0x25, Category.Combat);
    }

    public void onDisable(){
        
    }

    public void onEvent(Event e){
        if(e instanceof EventMotion){
            if(e.isPre()){

                for(Iterator<Entity> entities = mc.theWorld.loadedEntityList.iterator(); entities.hasNext();) {
                    Object theObject = entities.next();
                    if(theObject instanceof EntityLiving) {
                        EntityLiving entity = (EntityLiving) theObject;  
                        if(entity instanceof EntityPlayerSP) continue;

                        if(mc.thePlayer.getDistanceToEntity(entity) <= 6.2173613F) {
                            if(entity.isEntityAlive()) {
                                mc.playerController.attackEntity(mc.thePlayer, entity);
                                mc.thePlayer.swingItem();
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }
}
