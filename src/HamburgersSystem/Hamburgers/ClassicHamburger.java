package HamburgersSystem.Hamburgers;

import HamburgersSystem.Hamburgers.Hamburger;

public class ClassicHamburger implements Hamburger {
    @Override
    public String serve() {
        return "ClassicHamburger";
    }
}
