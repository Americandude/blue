package nitwit.modules.util.valuesys;

public class IntegerValue extends Value {
    private int value;
    private final int min;
    private final int max;
    
    public IntegerValue(final String name, final int value) {
        super(name);
        this.value = value;
        this.min = 0;
        this.max = Integer.MAX_VALUE;
    }
    
    public IntegerValue(final String name, final int value, final int min, final int max) {
        super(name);
        this.value = value;
        this.min = min;
        this.max = max;
    }
    
    public void setValueSilent(final Object value) {
        this.value = Integer.parseInt(String.valueOf(value));
    }
    
    public Object asObject() {
        return this.value;
    }
    
    public int asInteger() {
        return this.value;
    }
    
    public double asDouble() {
        return this.value;
    }
    
    public float asFloat() {
        return (float)this.value;
    }
    
    public int getMaximum() {
        return this.max;
    }
    
    public int getMinimum() {
        return this.min;
    }
}