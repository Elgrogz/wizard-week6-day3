import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class VillageTest {

  Village village;

  @Before
  public void before(){
    village = new Village("London");
  }

  @Test
  public void hasName(){
    assertEquals("London", village.getName());
  }
}