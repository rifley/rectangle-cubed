import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {
  @Test
  public void Rectangle_instantiatesCorrectly(){
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

  @Test
  public void Rectangle_getsLength_2(){
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(2, testRectangle.getLength());
  }

  @Test
  public void Rectangle_getWidth_4(){
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(4, testRectangle.getWidth());
  }

  @Test
  public void Rectangle_whenNotSquare_false(){
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(false, testRectangle.isSquare());
  }

  @Test
  public void Rectangle_whenSquare_true(){
    Rectangle testRectangle = new Rectangle(2,2);
    assertEquals(true, testRectangle.isSquare());
  }
}
