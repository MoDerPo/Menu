import java.lang.reflect.Method;

public class Option {
    public String label;
    public String shortcut;
    public String description;

    public Option(String label, String shortcut, String description) {
        this.label = label;
        this.shortcut = shortcut;
        this.description = description;
    }

    public Option(String label, String description) {
        this(label, genShortcut(label), description);
    }

    public Option(String label){
        this(label, genShortcut(label), label);
    }
}
