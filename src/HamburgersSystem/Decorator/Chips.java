package HamburgersSystem.Decorator;

import HamburgersSystem.Hamburgers.Hamburger;

public class Chips extends HamburgerDecorator{

    public Chips(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve() + " with chips";
    }
}
