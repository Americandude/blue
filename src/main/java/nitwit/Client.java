package nitwit;

import java.util.ArrayList;

import nitwit.modules.Module;

public class Client {

    public static ArrayList<Module> modules = new ArrayList<Module>();
    public static String name = "NitClient", version = "v-2.0";

    public static void startUp(){
        System.out.println("Test startup hook");
    }
}