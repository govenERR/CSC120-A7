import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building {
  
  private Hashtable<String, Boolean> collection;
  
  public Library(Hashtable<String, Boolean> collection, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = collection;
    System.out.println("You have built a library: 📖");
    }
  
  public void addTitle(String title) {
    this.collection.put(title, true);
  }

  public void removeTitle(String title) {
    this.collection.remove(title);
  }

  public boolean containsTitle(String title) {
    return this.collection.contains(title);
  }
  
  public boolean isAvaliable(String title) {
    return this.collection.get(title);
  }

  public void printCollection() {
    System.out.println(this.collection);
  }
  
  public static void main(String[] args) {
    Hashtable<String, Boolean> neilsonBooks = new Hashtable<>();
    neilsonBooks.put("The Hunger Games", true);
    neilsonBooks.put("Cell Energetics", false);
    Library neilson = new Library(neilsonBooks, "Neilson", "7 Neilson Dr", 4);
    System.out.println(neilson.getAddress());
  }
  
  }