package wizard_management;

public class Village {
  private String name;
  private boolean destroyed;

  public Village(String name) {
    this.name = name;
    this.destroyed = false;
  }

  public String getName() {
    return this.name;
  }

   public boolean getDestroyed() {
    return this.destroyed;
   }

  public void destroy() {
    this.destroyed = true;
  } 
}