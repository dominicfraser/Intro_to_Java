public class Bus{
  private int number;
  private Person[] seats;

  public Bus(int number){
    this.number = number;
    this.seats = new Person[8];
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount(){
    int count = 0;
    for(Person person : this.seats){
      if(person != null){
        count++;
      }
    }
    return count;
  }

}