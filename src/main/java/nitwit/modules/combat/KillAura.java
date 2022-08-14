package nitwit.modules.combat;

import java.util.ArrayList;
import java.util.Iterator;

import de.Hero.settings.Setting;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayerSP;
import nitwit.Client;
import nitwit.events.Event;
import nitwit.events.listeners.EventMotion;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;
import nitwit.modules.util.valuesys.Value;

@SuppressWarnings("all")
public class KillAura extends Module{

    public KillAura(){
        super("KillAura", 0x25, Category.Combat);

        ArrayList<String> options = new ArrayList<>();
        Client.settingsManager.rSetting(new Setting("Distance", this, 4, 3, 5, true));
        Client.settingsManager.rSetting(new Setting("BlatantMulti", this, 1, 1, 3, false));
        options.add("Distance");
        options.add("BlatantMulti");
    }

    public void onEnable(){

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
                        
                        for(int i = 0; i< Client.settingsManager.getSettingByName("Distance").getValDouble(); i++){
                        double dist = 3;
                        for(int i1 = 0; i1 < Client.settingsManager.getSettingByName("BlatantMulti").getValDouble(); i1++){
                        double blatantmulti = 1;

                        if(mc.thePlayer.getDistanceToEntity(entity) <= dist*2.072453779*blatantmulti) {
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
    }
}
