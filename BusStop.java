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

}