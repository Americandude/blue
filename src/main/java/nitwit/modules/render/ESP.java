package nitwit.modules.render;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;
import nitwit.modules.util.render.RenderUtil;

public class ESP extends Module{
    public ESP(){
        super("ESP", 0, Category.Render);
    }

    public void onEnable(){

    }

    public void onDisable(){
        
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            if(e.isPre()){
                for(Object o : mc.theWorld.loadedEntityList) {
                    if(o instanceof Entity) {
                        Entity e1 = (Entity) o;
                        if(e1 == mc.thePlayer) {
                            if (o instanceof EntityLiving) {
                                Minecraft.getMinecraft().entityRenderer.orientCamera(mc.timer.elapsedPartialTicks);
                                RenderUtil.drawWallHack(e1, 1.0f, 1.0f, 0.0f, 1.0f);
                            }
                        }
                    }
                }
            }
        }
    }
}
