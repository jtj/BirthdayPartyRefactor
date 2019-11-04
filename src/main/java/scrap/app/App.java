package scrap.app;

import scrap.app.party.Balloon;
import scrap.app.party.Cake;
import scrap.app.party.Party;

public class App {
    public static void main(String[] args) 
    { 
        Balloon balloon = new Balloon.Builder()
                .setColor(Balloon.Color.RED).setMaterial(Balloon.Material.MYLAR)
                .setCount(4).build();
        Cake cake = new Cake.Builder()
                .setFlavor(Cake.Flavor.CHOLCOLATE)
                .setFrosting(Cake.Flavor.CHOLCOLATE)
                .setShape(Cake.Shape.CIRCLE)
                .setSize(Cake.Size.LARGE)
                .setColor(Cake.Color.BROWN)
                .build();
        
        Party party = new Party(Party.Type.BIRTHYDAY, cake, balloon);
        System.out.println(party.getDescription());

        
        balloon = new Balloon.Builder()
                .setColor(Balloon.Color.BLUE)
                .setMaterial(Balloon.Material.LATEX)
                .setCount(7)
                .build();
        cake = new Cake.Builder()
                .setFlavor(Cake.Flavor.VANILLA)
                .setFrosting(Cake.Flavor.CHOLCOLATE)
                .setShape(Cake.Shape.SQUARE)
                .setSize(Cake.Size.MEDIUM)
                .setColor(Cake.Color.BROWN)
                .build();
        party = new Party(Party.Type.BIRTHYDAY, cake, balloon);
        System.out.println(party.getDescription());

        
        balloon = new Balloon.Builder()
                .setColor(Balloon.Color.YELLOW)
                .setMaterial(Balloon.Material.MYLAR)
                .setCount(4)
                .build();
        party = new Party(Party.Type.BIRTHYDAY, cake, balloon);
        System.out.println(party.getDescription());
    }
}
