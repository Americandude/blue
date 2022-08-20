package nitwit.modules.util.render;

public class Rainbow {

    /**
     * Create getRainbow() method
     * 
     * @param x Rainbow delay in seconds
     * @param y Rainbow saturation
     * @param z Rainbow Brightness
     * 
     * @return 
     * 
     */

    public static int getRainbow(float x, float y, float z) {
        float seconds = 4;
        float hue = (System.currentTimeMillis() % (int) (seconds * 1000)) / (float) (seconds * 1000f);
        int color = Color.HSBtoRGB(hue, 0.7F, 0.675F);
        return color;
    }
}
