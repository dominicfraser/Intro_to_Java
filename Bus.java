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

  public Person[] getSeats(){
    return this.seats;
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

  public boolean isBusFull(){
    return passengerCount() == this.seats.length;
  }

  public void board(Person person){
    if(isBusFull()){
      return; 
    }
    int passengerCount = passengerCount();
    this.seats[passengerCount] = person;
  }

  public void disembarkAll(){
    for(int i = 0; i < seats.length; i++){
      this.seats[i] = null;
    }
  }


}