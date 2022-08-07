package nitwit;
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
import java.util.ArrayList;
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
import net.minecraft.client.Minecraft;
import nitwit.events.Event;
import nitwit.modules.Module;
import nitwit.modules.movement.AutoSprint;
import nitwit.modules.movement.Fly;
import nitwit.modules.render.Fullbright;
import nitwit.ui.HUD;
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
@SuppressWarnings("all")
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
public class Client {/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    public/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/ static ArrayList<Module> modules = new ArrayList<Module>();/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    public/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/ static String name = "NitClient", version = "v1.1";
    public static/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/ HUD hud = new HUD();
    private static Minecraft mc = Minecraft.getMinecraft();/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    public static void startUp(){
        /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/System.out.println("Test startup hook");
        modules.add(new Fly());
        modules.add(new AutoSprint());
        modules.add(new Fullbright());
    }/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    public static void onEvent(Event e){
        for(Module m : modules){
            if(!m.toggled)
                continue;
               

/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
            m.onEvent(e);
        }
    }/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/

    public static void keyPress(int key){
        for(Module m : modules){/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
            /*ass ass ass ass ass ass public static void ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
            /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
            /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
            /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
            /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
            if(m.getKey() == key){/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
                /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
                /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
                /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
                /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
                /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
                /*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/ m.toggle();
            }
        }/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
    }/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*//*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
/*ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass ass*/
}