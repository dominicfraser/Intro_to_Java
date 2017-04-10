import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{

  Bus bus;
  Person person;
  BusStop busStop;

  @Before
  public void before(){
    this.bus = new Bus(1);
    this.person = new Person();
    this.busStop = new BusStop();
  }

  @Test
  public void busHasNumber(){
    assertEquals( 1,this.bus.getNumber() );
  }

  @Test
  public void busStartsEmpty(){
    assertEquals( 0,this.bus.passengerCount() );
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i < 8; i++){
      this.bus.board(person);
    }
    assertEquals( true, this.bus.isBusFull() );
  }

  @Test 
  public void canLoadPassenger(){
    this.bus.board(person);
    assertEquals( 1,this.bus.passengerCount() );
  }

  @Test
  public void disembarkAllPassengers(){
    this.bus.board(person);
    this.bus.disembarkAll();
    assertEquals( 0,this.bus.passengerCount() );
  }

  @Test
  public void busHasSeats(){
    Person[] x = new Person[8];
    assertEquals( x, this.bus.getSeats() );
  }

}