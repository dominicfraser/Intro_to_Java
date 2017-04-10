import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{

  BusStop busStop;
  Person person;

  @Before
  public void before(){
    this.busStop = new BusStop();
    this.person = new Person();
  }

  @Test
  public void addPersonToQueue(){
    this.busStop.add(this.person);
    assertEquals( 1, this.busStop.queueCount() );
  }

}