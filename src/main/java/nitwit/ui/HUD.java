package nitwit.ui;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ScaledResolution;
import nitwit.Client;

@SuppressWarnings("all")
public class HUD {

    public int x;
    public int y;
    public int z;
    public Minecraft mc = Minecraft.getMinecraft();
    public static ArrayList<Minecraft> mine = new ArrayList<Minecraft>();

    public void draw(){
        Minecraft.getMinecraft().fontRenderer.drawString(Client.name, 0, -5, -1);
    }

}
