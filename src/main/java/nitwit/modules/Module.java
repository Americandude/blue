package nitwit.modules;

public class Module {
    public String name;
    public boolean toggled;
    public int keyBind;
    public Category category;

    public Module(String name, int key, Category cat){
        this.name = name;
        this.keyBind = key;
        this.category = cat;
    }

    public boolean isEnabled(){
        return toggled;
    }

    public int getKey(){
        return keyBind;
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
        COMBAT,
        MOVEMENT,
        RENDER,
        Player;
    }
}
