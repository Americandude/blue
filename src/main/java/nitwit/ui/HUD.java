package nitwit.ui;

import net.lax1dude.eaglercraft.EaglerAdapter;
import net.minecraft.client.Minecraft;
import net.minecraft.src.ScaledResolution;
import nitwit.Client;
import nitwit.modules.Module;

public class HUD{

    public static Minecraft mc = Minecraft.getMinecraft();
    public ScaledResolution sr;

    public void draw(){
        mc = Minecraft.getMinecraft();
        sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
        
        
        mc.fontRenderer.drawString(Client.name + Client.version, 4, 4, -1);

        for(Module m : Client.modules){
            if(!m.toggled)
                continue;

            mc.fontRenderer.drawString(m.name, sr.getScaledWidth() - mc.fontRenderer.getStringWidth(m.name) - 4, 4, -1);
        }

    }
}