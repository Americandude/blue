package nitwit.modules.util.render;

import net.lax1dude.eaglercraft.EaglerAdapter;
import net.lax1dude.eaglercraft.glemu.EaglerAdapterGL30;
import net.minecraft.client.Minecraft;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Entity;
import net.minecraft.src.RenderGlobal;
import net.minecraft.src.RenderManager;

public class MobESPUtils {

	public static Minecraft mc = Minecraft.getMinecraft();

	public static void entityESPBox(Entity entity, int mode) {

		EaglerAdapterGL30.glBlendFunc(770, 771);
		EaglerAdapterGL30.glEnable(EaglerAdapterGL30.GL_BLEND);
		EaglerAdapterGL30.glLineWidth(2.0F);
		EaglerAdapterGL30.glDisable(EaglerAdapterGL30.GL_TEXTURE_2D);
		EaglerAdapterGL30.glDisable(EaglerAdapterGL30.GL_DEPTH_TEST);
		EaglerAdapterGL30.glDepthMask(false);
		if(mode == 0) //Enemy
			EaglerAdapterGL30.glColor4d(
					1 - mc.thePlayer.getDistanceSqToEntity(entity) / 40,
					 mc.thePlayer.getDistanceSqToEntity(entity) / 40,
					0, 0.5F);
					
		
		else if(mode == 1)//friend
			EaglerAdapterGL30.glColor4d(0, 0, 1, 0.5F);
		else if(mode == 2)//Other
			EaglerAdapterGL30.glColor4d(1, 1, 0, 0.5F);
		else if(mode == 3)// Target
			EaglerAdapterGL30.glColor4d(1, 0, 0, 0.5F);
		else if(mode == 4)//Team
			EaglerAdapterGL30.glColor4d(0, 1, 0, 0.5F);
		mc.getRenderManager();
		mc.getRenderManager();
				new AxisAlignedBB(
						entity.boundingBox.minX
							-0.05
							- entity.posX
							+ (entity.posX - mc.getRenderManager().renderPosX),
						entity.boundingBox.minY
							-0.05
							- entity.posY
							+ (entity.posY - mc.getRenderManager().renderPosY),
						entity.boundingBox.minZ
							-0.05
							- entity.posZ
							+ (entity.posZ - mc.getRenderManager().renderPosZ),
						entity.boundingBox.maxX
							+0.05
							- entity.posX
							+ (entity.posX - mc.getRenderManager().renderPosX),
						entity.boundingBox.maxY
							+0.1
							- entity.posY
							+ (entity.posY - mc.getRenderManager().renderPosY),
						entity.boundingBox.maxZ
							+0.05
							- entity.posZ
							+ (entity.posZ - RenderManager.renderPosZ));
		
		EaglerAdapterGL30.glEnable(EaglerAdapterGL30.GL_TEXTURE_2D);
		EaglerAdapterGL30.glEnable(EaglerAdapterGL30.GL_DEPTH_TEST);
		EaglerAdapterGL30.glDepthMask(true);
		EaglerAdapterGL30.glDisable(EaglerAdapterGL30.GL_BLEND);
	}

}