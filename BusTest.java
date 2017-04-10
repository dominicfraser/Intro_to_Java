import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{

  Bus bus;
  Person person;

  @Before
  public void before(){
    this.bus = new Bus(1);
  }

  @Test
  public void busHasNumber(){
    assertEquals( 1,this.bus.getNumber() );
  }

}