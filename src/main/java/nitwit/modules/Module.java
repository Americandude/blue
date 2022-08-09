package nitwit.modules;

import net.minecraft.client.Minecraft;
import nitwit.events.Event;
import nitwit.events.listeners.EventUpdate;

@SuppressWarnings("all")
public class Module {
    public String name;
    public boolean toggled;
    public int keyBind;
    public Category category;
    public Minecraft mc = Minecraft.getMinecraft();
    private int key;
    
    public Module(String name, int key, Category c){
        this.name = name;
        this.keyBind = key;
        this.category = c;
        category = c;
        name = name;
    }

    public String getName() {
		return name;
	}

    public boolean isToggled(){
        return toggled;
    }

    public void onEvent(Event e){

    }

    public int getKey(){
        return keyBind;
    }

    public void setKey(int key) {
		this.key = key;
	}

    public void toggle(){
        toggled = !toggled;
        if(toggled){
            onEnable();
        }else{onDisable();
        }
    }

    public void onEnable(){
        
    }

    public void onDisable(){

    }

    public enum Category {
        Combat("Combat"),
        Movement("Movement"),
        Render("Render"),
        Player("Player");

        public String name;

        Category(String name){
            this.name = name;
        }
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public void setup(){

    }
}
