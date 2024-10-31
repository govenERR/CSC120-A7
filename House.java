/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  
  private boolean hasDiningRoom;
  private ArrayList<String> residents;

  public House(boolean hasDiningRoom, ArrayList<String> residents, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = residents;
    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }
  public int numResidents() {
    return this.residents.size();
  }
  public void moveIn(String name) {
    this.residents.add(name);
  }
  public void moveOut(String name) {
    this.residents.remove(name);
  }
  public boolean isResident(String name) {
    return this.residents.contains(name);
  }


  public static void main(String[] args) {
    ArrayList<String> gspotResidents = new ArrayList<String>();
    gspotResidents.add("Lily");
    gspotResidents.add("Sabina");
    gspotResidents.add("Moly");
    House gardinerHouse = new House(false,gspotResidents, "Gardiner", "1 Paradise Rd", 4);
    System.out.println(gardinerHouse.getAddress());

  }

}