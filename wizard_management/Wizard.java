package wizard_management;

public class Wizard {
  String name;
  Flyable ride;
  Actionable protector;

  public Wizard(String name, Flyable ride, Actionable protector){
    this.name = name;
    this.ride = ride;
    this.protector = protector;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public Actionable getProtector() {
    return this.protector;
  }

  public String defend(){
    return this.protector.defend();
  }

  public void setProtector(Actionable protector) {
    this.protector = protector;
  }
  

  public void setRide(Flyable ride) {
    this.ride = ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public String attack(Village village) {
    return this.protector.attack(village);
  }

}