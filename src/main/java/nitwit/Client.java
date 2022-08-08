package nitwit;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import nitwit.events.Event;
import nitwit.modules.Module;
import nitwit.modules.Module.Category;
import nitwit.modules.combat.*;
import nitwit.modules.movement.*;
import nitwit.modules.player.*;
import nitwit.modules.render.*;
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
        modules.add(new NoFall());
        modules.add(new KillAura());
        modules.add(new AutoWalk());
        modules.add(new Speed());
        modules.add(new Velocity());
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

    public List<Module> getModulesByCategory(Category c){
         List<Module> modules = new ArrayList<Module>();

         for(Module m : this.modules){
            if(m.category == c)
            modules.add(m);

         }
         return modules;
    }
}