import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building {
  
  private Hashtable<String, Boolean> collection;
  private String headLibrarian;
  /*Creates an instance of a library */
  public Library(Hashtable<String, Boolean> collection, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = collection;
    System.out.println("You have built a library: 📖");
    }
/*Creates an instance of a library with a head librarian */
  public Library(Hashtable<String, Boolean> collection, String name, String address, int nFloors, String headLibrarian) {
    super(name, address, nFloors);
    this.collection = collection;
    this.headLibrarian = headLibrarian;
    System.out.println("You have built a library: 📖");
  }
  /*Adds a book to the collection */
  public void addTitle(String title) {
    this.collection.put(title, true);
  }
  /*Adds a book to the collection when it isn't avalible yet */
  public void addTitle(String title, boolean status) {
    this.collection.put(title, status);
  }
  /*Removes a book from the collection */
  public void removeTitle(String title) {
    this.collection.remove(title);
  }
  /*Checks the collection to see if it contains a book */
  public boolean containsTitle(String title) {
    return this.collection.contains(title);
  }
  /*Checks the collection to see if that book is avalible */
  public boolean isAvaliable(String title) {
    return this.collection.get(title);
  }
  /* Returns the name of the head librarian */
  public String getLibrarian() {
    return this.headLibrarian;
  }
  /*Prints collection of the library */
  public void printCollection() {
    System.out.println(this.collection);
  }
  /* Prints a list of methods for the class */
  public void showOptions() {
    super.showOptions();
    System.out.println(" + addTitle(title) \n + removeTitle(title) \n + containsTitle(title) \n + isAvaliable(title) \n + printCollection()");
  }
  /*Transports you to the floor you are headed towards, and an elevator voice prints out what floor you are on */
  public void goToFloor(int floorNum) {
    int floorChange = this.activeFloor - floorNum;
    
    if (floorChange != 0)
    {
      if (floorChange < 0) {
        System.out.println("Going up!");
        for (int elevatorPos = this.activeFloor; elevatorPos < floorNum; elevatorPos ++ ) {
          System.out.println("Beep! Floor " + elevatorPos);
        }
      }
      else {
        System.out.println("Going Down!");
        for (int elevatorPos = this.activeFloor; elevatorPos > floorNum; elevatorPos -- ) {
          System.out.println("Beep! Floor " + elevatorPos);
      }
    }
      this.activeFloor = floorNum;
      System.out.println("You have reached floor " + this.activeFloor);
  }
    else {
      System.out.println("You are already on that floor!");
    }
  }
  public static void main(String[] args) {
    Hashtable<String, Boolean> neilsonBooks = new Hashtable<>();
    neilsonBooks.put("The Hunger Games", true);
    neilsonBooks.put("Cell Energetics", false);
    Library neilson = new Library(neilsonBooks, "Neilson", "7 Neilson Dr", 4);
    neilson.printCollection();
    neilson.addTitle("House of Leaves");
    neilson.printCollection();
    System.out.println(neilson.getAddress());
    neilson.showOptions();
    neilson.enter();
    neilson.goToFloor(4);
  }
  
  }
