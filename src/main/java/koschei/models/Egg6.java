package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private Needle7 needle;

    public Egg6() {
        this.needle = new Needle7();
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
