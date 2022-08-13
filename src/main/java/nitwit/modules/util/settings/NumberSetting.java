package nitwit.modules.util.settings;

import java.util.Arrays;
import java.util.List;
import nitwit.modules.Module;

public final class NumberSetting extends Setting {
    public double value, minimum, maximum, increment;
    public double renderPercentage, percentage;
    private Module parent;
    List<String> replacements;

    public NumberSetting(final String name, Module parent, final double value, final double minimum, final double maximum, final double increment) {
        this.name = name;
        this.parent = parent;
        this.value = value;
        this.minimum = minimum;
        this.maximum = maximum;
        this.increment = increment;
    }

    public NumberSetting(final String name, final Module parent, final double value, final double minimum, final double maximum, final double increment, final String... replacements) {
        this.name = name;
        this.parent = parent;
        this.value = value;
        this.minimum = minimum;
        this.maximum = maximum;
        this.increment = increment;
        this.replacements = Arrays.asList(replacements);
    }
}