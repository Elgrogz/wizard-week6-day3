package wizard_management;

public class Dragon extends MythicalBeast implements Flyable, Actionable {

  public Dragon(String name){
    super(name);
  }

  public String fly(){
    return "Standing up tall, beating wings, lift off!";
  }

  public String defend() {
    return "Get tae f**k ya dobber! said the dragon, kindly.";
  }

  public String attack(Village village) {
    village.destroy();
    return "burny burny! " + village.getName() + " has been burnt to the ground!";
  }
}