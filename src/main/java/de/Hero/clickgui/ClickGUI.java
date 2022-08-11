package de.Hero.clickgui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import net.lax1dude.eaglercraft.EaglerAdapter;
import net.lax1dude.eaglercraft.glemu.EaglerAdapterGL30;
import net.minecraft.client.Minecraft;
import net.minecraft.src.Gui;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.ScaledResolution;
import nitwit.Client;
import nitwit.modules.Module;
import nitwit.modules.Module.Category;
import nitwit.modules.util.render.Color;
import de.Hero.clickgui.elements.Element;
import de.Hero.clickgui.elements.ModuleButton;
import de.Hero.clickgui.elements.menu.ElementSlider;
import de.Hero.clickgui.util.ColorUtil;
import de.Hero.clickgui.util.FontUtil;
import de.Hero.settings.SettingsManager;

 /**
  *  Made by HeroCode
  *  it's free to use
  *  but you have to credit me
  *
  *  @author HeroCode
  */
public class ClickGUI extends GuiScreen {
	public static ArrayList<Panel> panels;
	public static ArrayList<Panel> rpanels;
	private ModuleButton mb = null;
	public SettingsManager setmgr;
	public static final int KEYBOARD_SIZE = 256;
	private static final String[] keyName = new String[KEYBOARD_SIZE];
	public static synchronized String getKeyName(int key) {
		return keyName[key];
	}
	
	public ClickGUI() {
		setmgr = Client.settingsManager;
		
		FontUtil.setupFontUtils();
		panels = new ArrayList<Panel>();
		double pwidth = 80;
		double pheight = 15;
		double px = 10;
		double py = 10;
		double pyplus = pheight + 10;

		for (Category c : Category.values()) {
			String title = Character.toUpperCase(c.name().toLowerCase().charAt(0)) + c.name().toLowerCase().substring(1);
			ClickGUI.panels.add(new Panel(title, px, py, pwidth, pheight, false, this) {
						@Override
						public void setup() {
							for (Module m : Client.modules) {
								if (!m.getCategory().equals(c))continue;
								this.Elements.add(new ModuleButton(m, this));
							}
						}
			});
			py += pyplus;
		}
		
		rpanels = new ArrayList<Panel>();
		for (Panel p : panels) {
			rpanels.add(p);
		}
		Collections.reverse(rpanels);

	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {

		for (Panel p : panels) {
			p.drawScreen(mouseX, mouseY, partialTicks);
		}

		
		/*															*/ ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth,mc.displayHeight);
  		/* DO NOT REMOVE											*/ EaglerAdapter.glPushMatrix();
		/* copyright HeroCode 2017									*/ EaglerAdapter.glTranslatef(sr.getScaledWidth(), sr.getScaledHeight(), 0);EaglerAdapterGL30.glScalef(0.5F, 0.5F, 0.5F);
		/* https://www.youtube.com/channel/UCJum3PIbnYvIfIEu05GL_yQ	*/ FontUtil.drawStringWithShadow("b"+"y"+ "H"+"e"+"r"+"o"+"C"+"o"+"d"+"e", -Minecraft.getMinecraft().fontRenderer.getStringWidth("b"+"y"+ "H"+"e"+"r"+"o"+"C"+"o"+"d"+"e"), -Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT, 0xff11F86B);
		/*															*/ EaglerAdapter.glPopMatrix();
		
		mb = null;
		listen:
		for (Panel p : panels) {
			if (p != null && p.visible && p.extended && p.Elements != null
					&& p.Elements.size() > 0) {
				for (ModuleButton e : p.Elements) {
					if (e.listening) {
						mb = e;
						break listen;
					}
				}
			}
		}
		
		for (Panel panel : panels) {
			if (panel.extended && panel.visible && panel.Elements != null) {
				for (ModuleButton b : panel.Elements) {
					if (b.extended && b.menuelements != null && !b.menuelements.isEmpty()) {
						double off = 0;
						Color temp = ColorUtil.getClickGUIColor().darker();
						int outlineColor = new Color(temp.getRed(), temp.getGreen(), temp.getBlue(), 170).getRGB();
						
						for (Element e : b.menuelements) {
							e.offset = off;
							e.update();
							if(Client.settingsManager.getSettingByName("Design").getValString().equalsIgnoreCase("New")){
								Gui.drawRect(e.x, e.y, e.x + e.width + 2, e.y + e.height, outlineColor);
							}
							e.drawScreen(mouseX, mouseY, partialTicks);
							off += e.height;
						}
					}
				}
			}

		}
		
		/*
		 * Wenn mb != null ist => ein Button listening == true
		 * dann wird das Overlay gerendert mit ein paar Informationen.
		 */
		if(mb != null){
			drawRect(0, 0, this.width, this.height, 0x88101010);
			EaglerAdapterGL30.glPushMatrix();
			EaglerAdapterGL30.glTranslatef(sr.getScaledWidth() / 2, sr.getScaledHeight() / 2, 0.0F);
			EaglerAdapterGL30.glScalef(4.0F, 4.0F, 0F);
			FontUtil.drawTotalCenteredStringWithShadow("Listening...", 0, -10, 0xffffffff);
			EaglerAdapterGL30.glScalef(0.5F, 0.5F, 0F);
			FontUtil.drawTotalCenteredStringWithShadow("Press 'ESCAPE' to unbind " + mb.mod.getName() + (mb.mod.getKey() > -1 ? " (" + getKeyName(mb.mod.getKey())+ ")" : ""), 0, 0, 0xffffffff);
			EaglerAdapterGL30.glScalef(0.25F, 0.25F, 0F);
			FontUtil.drawTotalCenteredStringWithShadow("by nitwit", 0, 20, 0xffffffff);
			EaglerAdapterGL30.glPopMatrix();
		}

		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	@Override
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {

		if(mb != null)return;
		
		for (Panel panel : rpanels) {
			if (panel.extended && panel.visible && panel.Elements != null) {
				for (ModuleButton b : panel.Elements) {
					if (b.extended) {
						for (Element e : b.menuelements) {
							if (e.mouseClicked(mouseX, mouseY, mouseButton))
								return;
						}
					}
				}
			}
		}

		for (Panel p : rpanels) {
			if (p.mouseClicked(mouseX, mouseY, mouseButton))
				return;
		}
		
		super.mouseClicked(mouseX, mouseY, mouseButton);
	}

	@Override
	public void mouseMovedOrUp(int mouseX, int mouseY, int state) {
		if(mb != null)return;

		for (Panel panel : rpanels) {
			if (panel.extended && panel.visible && panel.Elements != null) {
				for (ModuleButton b : panel.Elements) {
					if (b.extended) {
						for (Element e : b.menuelements) {
							e.mouseReleased(mouseX, mouseY, state);
						}
					}
				}
			}
		}
		
		for (Panel p : rpanels) {
			p.mouseReleased(mouseX, mouseY, state);
		}

		super.mouseMovedOrUp(mouseX, mouseY, state);
	}

	@Override
	protected void keyTyped(char typedChar, int keyCode) {

		for (Panel p : rpanels) {
			if (p != null && p.visible && p.extended && p.Elements != null && p.Elements.size() > 0) {
				for (ModuleButton e : p.Elements) {
					try {
						if (e.keyTyped(typedChar, keyCode))return;
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		}

		super.keyTyped(typedChar, keyCode);
	}

	@Override
	public void initGui() {

	}

	@Override
	public void onGuiClosed() {
		/*
		 * Sliderfix
		 */
		for (Panel panel : ClickGUI.rpanels) {
			if (panel.extended && panel.visible && panel.Elements != null) {
				for (ModuleButton b : panel.Elements) {
					if (b.extended) {
						for (Element e : b.menuelements) {
							if(e instanceof ElementSlider){
								((ElementSlider)e).dragging = false;
							}
						}
					}
				}
			}
		}
	}

	public void closeAllSettings() {
		for (Panel p : rpanels) {
			if (p != null && p.visible && p.extended && p.Elements != null
					&& p.Elements.size() > 0) {
				for (ModuleButton e : p.Elements) {
					//e.extended = false;
				}
			}
		}
	}
}
