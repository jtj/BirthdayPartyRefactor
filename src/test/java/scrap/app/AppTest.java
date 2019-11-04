package scrap.app;

import org.junit.Test;
import scrap.app.party.Balloon;
import scrap.app.party.Cake;
import scrap.app.party.Party;
import static org.junit.Assert.*;

public class AppTest {
    private static String expectedBalloonResult = "Balloons ordered: " + Balloon.Color.RED + ", " + Balloon.Material.MYLAR  + ", " + 4 + ".";
    private static String expectedCakeResult = "Cake ordered: " + Cake.Flavor.CHOLCOLATE + ", " + Cake.Flavor.CHOLCOLATE  + ", " + Cake.Shape.CIRCLE + ", " + Cake.Size.LARGE + ", " + Cake.Color.BROWN + ".";
    
    @Test public void testBalloonBuilder() {
        Balloon classUnderTest = buildTestBalloon();
        assertTrue("The expected result does not match actual result.", classUnderTest.getDescription().equals(expectedBalloonResult));
    }
    
    @Test public void testCakeBuilder() {
        Cake classUnderTest = buildTestCake();
        assertTrue("The expected result does not match actual result.", classUnderTest.getDescription().equals(expectedCakeResult));
    }
    
    @Test public void testParty() {
       Cake cake = buildTestCake();
       Balloon balloon = buildTestBalloon();
       Party classUnderTest = new Party(Party.Type.BIRTHYDAY, cake, balloon);
       String expectedResult = Party.Type.BIRTHYDAY.getGreetingWishes() + " " + balloon.getDescription() + " " + cake.getDescription();
       String msg = String.format("The expected result does not match actual result. Expected: %s Actual: %s", expectedResult, classUnderTest.getDescription()); 
       assertTrue(msg, classUnderTest.getDescription().equals(expectedResult));
    }
    
    private Cake buildTestCake() {
        Cake classUnderTest = new Cake.Builder()
                .setFlavor(Cake.Flavor.CHOLCOLATE)
                .setFrosting(Cake.Flavor.CHOLCOLATE)
                .setShape(Cake.Shape.CIRCLE)
                .setSize(Cake.Size.LARGE)
                .setColor(Cake.Color.BROWN)
                .build();
        return classUnderTest;
    }
    
    private Balloon buildTestBalloon() {
        Balloon classUnderTest = new Balloon.Builder()
                .setColor(Balloon.Color.RED).setMaterial(Balloon.Material.MYLAR)
                .setCount(4).build();
        return classUnderTest;
    }
    
}
