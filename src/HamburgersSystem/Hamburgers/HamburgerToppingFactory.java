package HamburgersSystem.Hamburgers;

import HamburgersSystem.Decorator.Chips;
import HamburgersSystem.Decorator.FriedEgg;
import HamburgersSystem.Decorator.OnionRings;
import HamburgersSystem.Decorator.Salad;

public class HamburgerToppingFactory {

    public static Hamburger createToppingHamburger(String code, Hamburger hamburger) {
        switch (code) {
            case "ch":
                return new Chips(hamburger);
            case "or":
                return new OnionRings(hamburger);
            case "sa":
                return new Salad(hamburger);
            case "fe":
                return new FriedEgg(hamburger);
            default:
                throw new RuntimeException("wrong topping");
        }
    }
}
