package nitwit.modules.combat;

import java.util.ArrayList;

import de.Hero.settings.Setting;
import de.Hero.settings.SettingsManager;
import net.lax1dude.eaglercraft.EaglerAdapter;
import net.minecraft.client.Minecraft;
import nitwit.Client;
import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;
import nitwit.modules.Module;
import nitwit.modules.util.time.TimeUtils;
import nitwit.modules.util.valuesys.BoolValue;
import nitwit.modules.util.valuesys.IntegerValue;

@SuppressWarnings("all")
public class AutoClickerNew extends Module {

    private final IntegerValue maxCPSValue;
    private final IntegerValue minCPSValue;
    private final BoolValue leftValue;
    private long leftDelay;
    private long leftLastSwing;
    
    public AutoClickerNew() {

        super("AutoClickerNew", 0, Category.Combat);

        this.maxCPSValue = new IntegerValue("MaxCPS", 2, 1, 20) {
            @Override
            protected void onChanged(final Object oldValue, final Object newValue) {
                int minCPS = AutoClickerNew.this.minCPSValue.asInteger();
                if (minCPS > Integer.parseInt(String.valueOf(newValue))) {
                    this.setValue(Client.settingsManager.getSettingByName("Min CPS").getValDouble());
                }
            }
        };
        
        this.minCPSValue = new IntegerValue("MinCPS", 112, 1, 20) {
            @Override
            protected void onChanged(final Object oldValue, final Object newValue) {
                int maxCPS = AutoClickerNew.this.maxCPSValue.asInteger();
                if (maxCPS < Integer.parseInt(String.valueOf(newValue))) {
                    this.setValue(Client.settingsManager.getSettingByName("Max CPS").getValDouble());
                }
            }
        };

        this.leftValue = new BoolValue("Left", true);
        this.leftDelay = TimeUtils.randomClickDelay(this.minCPSValue.asInteger(), this.maxCPSValue.asInteger());

        ArrayList<String> options = new ArrayList<>();
        options.add("Min CPS");
        options.add("Max CPS");
        Client.settingsManager.rSetting(new Setting("Min CPS", this, 1, 1, 20, false));
        Client.settingsManager.rSetting(new Setting("Max CPS", this, 2, 1, 20, false));
    }

    public void onEvent(Event e){
        if(e instanceof EventUpdate){
            this.minCPSValue.setValue(Client.settingsManager.getSettingByName("Min CPS").getValDouble());
            this.maxCPSValue.setValue(Client.settingsManager.getSettingByName("Max CPS").getValDouble());
            if(e.isPre()){
                if (System.currentTimeMillis() - this.leftLastSwing >= this.leftDelay) {
                    if (this.leftValue.asBoolean() && System.currentTimeMillis() - this.leftLastSwing >= this.leftDelay) {
                        mc.clickMouse(0);
                        this.leftLastSwing = System.currentTimeMillis();
                        this.leftDelay = TimeUtils.randomClickDelay(this.minCPSValue.asInteger(), this.maxCPSValue.asInteger());
                    }
                }
                
            }
        }
    }
}