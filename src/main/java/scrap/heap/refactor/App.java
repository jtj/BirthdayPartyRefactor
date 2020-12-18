package scrap.heap.refactor;

import scrap.heap.model.Balloon;
import scrap.heap.model.Cake;
import scrap.heap.model.Order;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*
        Maintenance & Ease of Usage:
        New Property in Product --> Add new setter in product, no other changes needed
        New Product             --> Add new model, no other changes needed
        New items in Order      --> No changes needed
        New Order in Party      --> No changes needed
        New Party               --> Add new App/Driver/Party class, no other changes needed

        Conventions:
        method setter do not has word 'set' in name
        */

        Balloon redBalloon = new Balloon().color("red").material("mylar");
        Cake chocolateCake = new Cake().flavor("chocolate").frosting("chocolate").shape("circle").size("large").color("brown");
        new Order().addItems(
                Arrays.asList(
                        new Order.Item().product(redBalloon).quantity(4),
                        new Order.Item().product(chocolateCake)
                )
        ).order();

        Balloon blueBalloon = new Balloon().color("blue").material("latex");
        Cake vanillaChocolateCake = new Cake().flavor("vanilla").frosting("chocolate").shape("square").size("med").color("brown");

        new Order().addItems(
                Arrays.asList(
                        new Order.Item().product(blueBalloon).quantity(7),
                        new Order.Item().product(vanillaChocolateCake)
                )
        ).order();

        Balloon yellowBalloon = new Balloon().color("yellow").material("mylar");
        Cake vanillaCake = new Cake().flavor("vanilla").frosting("vanilla").shape("square").size("small").color("yellow");
        new Order().addItems(
                Arrays.asList(
                        new Order.Item().product(yellowBalloon).quantity(4),
                        new Order.Item().product(vanillaCake)
                )
        ).order();
    }

    public String getGreeting() {
        return "Hello world.";
    }

}
