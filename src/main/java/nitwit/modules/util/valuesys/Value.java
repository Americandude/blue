package nitwit.modules.util.valuesys;

public abstract class Value {
    private final String valueName;
    
    public Value(final String valueName) {
        this.valueName = valueName;
    }
    
    public String getValueName() {
        return this.valueName;
    }
    
    public void setValue(final Object o) {
        final Object oldValue = this.asObject();
        try {
            this.onChange(oldValue, o);
            this.setValueSilent(o);
            this.onChanged(oldValue, o);
        }
        catch (Exception e) {
        }
    }
    
    public abstract void setValueSilent(final Object p0);
    
    public abstract Object asObject();
    
    public String asString() {
        return (String)this.asObject();
    }
    
    public int asInteger() {
        return (int)this.asObject();
    }
    
    public float asFloat() {
        return (float)this.asObject();
    }
    
    public double asDouble() {
        return (double)this.asObject();
    }
    
    public boolean asBoolean() {
        return (boolean)this.asObject();
    }
    
    protected void onChange(final Object oldValue, final Object newValue) {
    }
    
    protected void onChanged(final Object oldValue, final Object newValue) {
    }
}