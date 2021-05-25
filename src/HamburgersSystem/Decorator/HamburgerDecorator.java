package HamburgersSystem.Decorator;

import HamburgersSystem.Hamburgers.Hamburger;

public abstract class HamburgerDecorator implements Hamburger {
    private Hamburger hamburger;

    public HamburgerDecorator(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String serve() {
       return hamburger.serve();
    }


}
