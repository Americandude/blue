package nitwit.modules.render;

import java.util.ArrayList;

import de.Hero.settings.Setting;
import nitwit.Client;
import nitwit.modules.Module;


public class ClickGui extends Module{

        public ClickGui() {
        super("ClickGui", 0x19, Category.Render);

        ArrayList<String> options = new ArrayList<>();
        options.add("default");
        Client.settingsManager.rSetting(new Setting("Design", this, "New", options));
        Client.settingsManager.rSetting(new Setting("Sound", this, false));
        Client.settingsManager.rSetting(new Setting("GuiRed", this, 255, 0, 255, true));
        Client.settingsManager.rSetting(new Setting("GuiGreen", this, 255, 0, 255, true));
        Client.settingsManager.rSetting(new Setting("GuiBlue", this, 255, 0, 255, true));
    }

    public void onDisable(){
        mc.displayGuiScreen(null);
    }

    public void onEnable() {
        mc.displayGuiScreen(Client.clickGUI);
    }
}