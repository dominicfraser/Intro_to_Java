class BusStop{

  private Person[] queue;

  public BusStop(){
    this.queue = new Person[12];
  }

  public int queueCount(){
    int count = 0;
    for(Person person : this.queue){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void add(Person person){
    int queueCount = queueCount();
    this.queue[queueCount] = person;
  }

  public void remove(){
    int queueCount = queueCount() - 1;
    if(queueCount < 0){
      return;
    }
    this.queue[queueCount] = null;
  }

  public void busArrival(Bus bus){
    // Person[] seats = bus.getSeats();
    // this just sets the copied version
    for(Person person : this.queue){
      if(bus.isBusFull()){
        return;
      }
        bus.board(person);
        remove();
      // for(Person passenger : seats){
        // if(passenger == null){
        //   passenger = person;
        //   break;
      // this just sets the copied version
        }
      }



}


