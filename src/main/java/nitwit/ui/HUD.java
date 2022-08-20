package nitwit.ui;

import java.util.Comparator;

import net.lax1dude.eaglercraft.glemu.EaglerAdapterGL30;
import net.minecraft.client.Minecraft;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.ScaledResolution;
import nitwit.Client;
import nitwit.modules.Module;
import nitwit.modules.util.render.Color;
import nitwit.modules.util.render.Rainbow;

public class HUD {

    public static Minecraft mc = Minecraft.getMinecraft();
    public ScaledResolution sr;
    public FontRenderer fr;

    /*
     * use if java 1.6:
     * public static class ModuleOrder implements Comparator<Module>{
     * 
     * @Override
     * public int compare(Module arg0, Module arg1){
     * if(Minecraft.getMinecraft().fontRenderer.getStringWidth(arg0.name) >
     * Minecraft.getMinecraft().fontRenderer.getStringWidth(arg1.name)) {
     * return -1;
     * }
     * if(Minecraft.getMinecraft().fontRenderer.getStringWidth(arg0.name) <
     * Minecraft.getMinecraft().fontRenderer.getStringWidth(arg1.name)) {
     * return 1;
     * }
     * return 0;
     * }
     * }
     */

    public void draw() {

        mc = Minecraft.getMinecraft();
        sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
        fr = mc.fontRenderer;
        int var69 = sr.getScaledWidth();

        EaglerAdapterGL30.glTranslatef(4, 4, 0);
        EaglerAdapterGL30.glScalef(1.5F, 1.5F, 1);
        EaglerAdapterGL30.glTranslatef(-4, -4, 0);
        fr.drawString(Client.name + " " + Client.version, 4, 4, 0x255188, true);
        EaglerAdapterGL30.glScalef(1, 1, 1);
        fr.drawString(Minecraft.debugFPS + " FPS", 4, 15, 0x255188, true);
        EaglerAdapterGL30.glTranslatef(4, 4, 0);
        EaglerAdapterGL30.glScalef(0.80F, 0.80F, 1);
        EaglerAdapterGL30.glTranslatef(-4, -4, 0);

        // use if java 1.6: Collections.sort(Client.modules, new ModuleOrder());

        Client.modules.sort(Comparator.comparingInt(m -> fr.getStringWidth(((Module) m).name)).reversed());

        int mcount = 0;

        for (Module m : Client.modules) {
            if (!m.toggled)
                continue;

            // Gui.drawRect(sr.getScaledWidth() - mc.fontRenderer.getStringWidth(m.name)
            // -20, 4, sr.getScaledWidth(), 4 + mc.fontRenderer.FONT_HEIGHT, 0xFF90004);
            fr.drawString(m.name, var69 - fr.getStringWidth(m.name) + 60, 20 + (mcount * fr.FONT_HEIGHT + 4),
                    Rainbow.getRainbow(4f, 0.8f, 0.75f), true);

            mcount++;
        }
    }
}