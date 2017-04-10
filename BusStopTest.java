import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{

  BusStop busStop;
  Person person;
  Bus bus;

  @Before
  public void before(){
    this.busStop = new BusStop();
    this.person = new Person();
    this.bus = new Bus(1);
  }

  @Test
  public void addPersonToQueue(){
    this.busStop.add(this.person);
    assertEquals( 1, this.busStop.queueCount() );
  }

  @Test
  public void removePersonFromQueue(){
    this.busStop.add(this.person);
    this.busStop.remove();
    assertEquals( 0,this.busStop.queueCount() );
  }  

  @Test
  public void boardsPassengersFromBusStop(){
    this.busStop.add(this.person);
    this.busStop.busArrival(this.bus);
    assertEquals( 1,this.bus.passengerCount() );
    // assertEquals( 0,this.busStop.queueCount() );
  }

}