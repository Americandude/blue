package nitwit;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import nitwit.events.Event;
import nitwit.modules.Module;
import nitwit.modules.movement.AutoSprint;
import nitwit.modules.movement.Fly;
import nitwit.modules.render.Fullbright;
import nitwit.ui.HUD;

@SuppressWarnings("all")
public class Client {

    public static ArrayList<Module> modules = new ArrayList<Module>();
    public static String name = "NitClient", version = "v1.1";
    public static HUD hud = new HUD();
    private static Minecraft mc = Minecraft.getMinecraft();
    public static void startUp(){
        System.out.println("Test startup hook");
        modules.add(new Fly());
        modules.add(new Fullbright());
        modules.add(new AutoSprint());
    }

    public static void onEvent(Event e){
        for(Module m : modules){
            if(!m.toggled)
                continue;
                
            m.onEvent(e);
        }
    }

    public static void keyPress(int key){
        for(Module m : modules){
            if(m.getKey() == key){
                m.toggle();
            }
        }
    }
}