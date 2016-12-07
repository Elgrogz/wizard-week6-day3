import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Dragon dragon;
  Ogre ogre;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    dragon = new Dragon("Jim");
    ogre = new Ogre("Bob");
    wizard = new Wizard("Toby", broomstick, dragon);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void canSetRide() {
    Dragon dragon = new Dragon("Erik");
    wizard.setRide(dragon);
    assertEquals(wizard.fly(), "Standing up tall, beating wings, lift off!");
  }

  @Test
  public void hasBroomstick(){
    Broomstick broomstick = (Broomstick) wizard.getRide();
    assertEquals("Nimbus", broomstick.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon() {
    Dragon dragon = new Dragon("Tilly");
    wizard = new Wizard("Dumbledore", dragon, dragon); 
    assertEquals(wizard.fly(), "Standing up tall, beating wings, lift off!");
  }

  @Test
  public void canBeDefendedByDragon(){
    assertEquals(wizard.defend(), "Get tae f**k ya dobber! said the dragon, kindly.");

  }

  @Test
  public void canBeDefendedByOgre(){
    wizard = new Wizard("Dumbledore", dragon, ogre); 
    assertEquals(wizard.defend(), "Me smash now! said the ogre, suggestively.");
  }

  @Test
  public void canSetProtector(){
    wizard.setProtector(ogre);
    assertEquals(wizard.defend(), "Me smash now! said the ogre, suggestively.");
  }

  @Test
  public void canAttackVillage(){
    Village village = new Village("London");
    wizard = new Wizard("Dumbledore", dragon, ogre); 
    assertEquals(wizard.attack(village), "smashy smashy! London has been destroyed!");
  }

  @Test
  public void dragonCanAttackVillage(){
    Village village = new Village("London");
    wizard = new Wizard("Dumbledore", dragon, dragon); 
    assertEquals(wizard.attack(village), "burny burny! London has been burnt to the ground!");
  }

  @Test
  public void villageHasBeenDestroyed(){
    Village village = new Village("London");
    wizard = new Wizard("Dumbledore", dragon, dragon);
    wizard.attack(village);
    assertEquals(true, village.getDestroyed());
  }

  @Test
  public void pricessHasBeenKidnapped(){
    Princess princess = new Princess("Peach");
    Ogre ogre = new Ogre("James");
    assertEquals("The nasty Ogre has kidnapped Peach!", ogre.kidnap(princess));
  }

}