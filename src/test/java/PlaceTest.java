import org.junit.*;
import static org.junit.Assert.*;

public class PlaceTest {

  @Test
  public void Place_instantiatesCorrectly_true() {
    Place myPlace = new Place("Sherman, TX");
    assertEquals(true, myPlace instanceof Place);
  }

  @Test
  public void Place_instantiatesWithDescription_true() {
    Place myPlace = new Place("Sherman, TX");
    assertEquals("Sherman, TX", myPlace.getDescription());
  }
}
