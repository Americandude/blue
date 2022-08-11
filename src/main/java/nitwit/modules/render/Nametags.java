package nitwit.modules.render;

import net.lax1dude.eaglercraft.EaglerAdapter;
import net.lax1dude.eaglercraft.adapter.Tessellator;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.RenderManager;
import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;

@SuppressWarnings("all")
public class Nametags extends Module{
    public Nametags(){
        super("Nametags", 0, Category.Render);
    }

    public void onEnable(){

    }

    public void onDisable(){
        mc.thePlayer.setSprinting(mc.gameSettings.keyBindSprint.isPressed());
    }

    public void onEvent(Event e){
    }

    public void render() {
            for (Object e : mc.theWorld.loadedEntityList){
                if (e instanceof EntityPlayer){
                    renderTag((Entity) e, ((EntityPlayer) e).posX, ((EntityPlayer) e).posY, ((EntityPlayer) e).posZ);
                }
            }
    }

    private void renderTag(Entity entity, double x, double y, double z) {
        String name = entity.getEntityName();
        if (entity instanceof EntityLiving) {
            name = name + " \247a" + ((double)Math.round((((EntityLiving) entity).getHealth() * 100) / 100) / 2);
        }
        float var13 = 1.6F;
        float var14 = (float) (0.016666668F * (mc.thePlayer.getDistanceToEntity(entity)) / 2);
        EaglerAdapter.glPushMatrix();
        EaglerAdapter.glTranslatef((float) x, (float) y + entity.height + 0.5F, (float) z);
        EaglerAdapter.glNormal3f(0.0F, 1.0F, 0.0F);
        EaglerAdapter.glRotatef(-RenderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        EaglerAdapter.glRotatef(RenderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        EaglerAdapter.glScalef(-var14, -var14, var14);
        EaglerAdapter.glDepthMask(false);
        EaglerAdapter.glDisable(EaglerAdapter.GL_LIGHTING);
        Tessellator var15 = Tessellator.instance;
        
        int var16 = (int) -mc.thePlayer.getDistanceToEntity(entity) / (int) var13;
        if (entity.isSneaking()) {
            var16 += 4;
        } else if (var16 < -14) {
            var16 = -14;
        }

        EaglerAdapter.glDisable(EaglerAdapter.GL_TEXTURE_2D);
        int var17 = mc.fontRenderer.getStringWidth(name);
        mc.fontRenderer.drawStringWithShadow(name, -var17, var16, 0xFFFFFF);

        mc.entityRenderer.disableLightmap(0);
        EaglerAdapter.glLineWidth(1.0F);
        EaglerAdapter.glEnable(EaglerAdapter.GL_TEXTURE_2D);
        EaglerAdapter.glDisable(EaglerAdapter.GL_BLEND);
        EaglerAdapter.glDisable(EaglerAdapter.GL_LIGHTING);
        EaglerAdapter.glBlendFunc(EaglerAdapter.GL_SRC_ALPHA, EaglerAdapter.GL_ONE_MINUS_SRC_ALPHA);
        EaglerAdapter.glEnable(EaglerAdapter.GL_DEPTH_TEST);
        EaglerAdapter.glDepthMask(true);

        EaglerAdapter.glPopMatrix();
    }
}
