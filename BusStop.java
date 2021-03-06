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

  public void remove(Person person){
    int position = 0;
    for(Person waiting : this.queue){
      if(person == waiting){
        this.queue[position] = null;
      }
      position++;
    }
  }

  public void busArrival(Bus bus){

    for(Person person : this.queue){
      if(bus.isBusFull()){
        return;
      }
        bus.board(person);
        remove(person);
        }
      }

  



}


