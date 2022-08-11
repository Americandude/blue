package nitwit.modules.render;

import java.util.ArrayList;

import de.Hero.settings.Setting;
import nitwit.Client;
import nitwit.modules.Module;


public class ClickGui extends Module{

        public ClickGui() {
        super("ClickGui", 0x19, Category.Render);
    }

    public void setup() {
        ArrayList<String> options = new ArrayList<>();
        options.add("New");
        options.add("test");
        Client.settingsManager.rSetting(new Setting("Design", this, "New", options));
        Client.settingsManager.rSetting(new Setting("Sound", this, false));
        Client.settingsManager.rSetting(new Setting("GuiRed", this, 255, 0, 255, true));
        Client.settingsManager.rSetting(new Setting("GuiGreen", this, 26, 0, 255, true));
        Client.settingsManager.rSetting(new Setting("GuiBlue", this, 42, 0, 255, true));
    }

    public void onEnable() {
        super.onEnable();

        mc.displayGuiScreen(Client.clickGUI);
        toggle();
    }
}