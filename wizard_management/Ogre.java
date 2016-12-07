package wizard_management;

public class Ogre extends MythicalBeast implements Actionable{
  
  public Ogre(String name){
    super(name);
  }

  public String defend() {
    return "Me smash now! said the ogre, suggestively.";
  }

  public String attack(Village village) {
    village.destroy();
    return "smashy smashy! " + village.getName() + " has been destroyed!";
  }

  public String kidnap(Princess princess) {
    return "The nasty Ogre has kidnapped " + princess.getName() +"!";
  }

}