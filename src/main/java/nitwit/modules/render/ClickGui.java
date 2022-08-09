package nitwit.modules.render;

import java.util.ArrayList;

import de.Hero.settings.Setting;
import nitwit.Client;
import nitwit.modules.Module;


public class ClickGui extends Module{

        public ClickGui() {
        super("ClickGui", 0x36, Category.Render);
    }

    public void setup() {
        ArrayList<String> options = new ArrayList<>();
        options.add("New");
        options.add("test");
        Client.instance.settingsManager.rSetting(new Setting("Design", this, "New", options));
        Client.instance.settingsManager.rSetting(new Setting("Sound", this, false));
        Client.instance.settingsManager.rSetting(new Setting("GuiRed", this, 255, 0, 255, true));
        Client.instance.settingsManager.rSetting(new Setting("GuiGreen", this, 26, 0, 255, true));
        Client.instance.settingsManager.rSetting(new Setting("GuiBlue", this, 42, 0, 255, true));
    }

    public void onEnable() {
        super.onEnable();

        mc.displayGuiScreen(Client.instance.clickGUI);
        toggle();
    }
}