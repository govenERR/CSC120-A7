/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  
  private boolean hasDiningRoom;
  private ArrayList<String> residents;
  private boolean hasElevator;

  public House(boolean hasDiningRoom, ArrayList<String> residents, boolean hasElevator, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = residents;
    this.hasElevator = hasElevator;
    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
  public boolean hasElevator() {
    return this.hasElevator;
  }
  public int numResidents() {
    return this.residents.size();
  }
  public void moveIn(String name) {
    this.residents.add(name);
  }
  public void moveIn(String name1, String name2) {
    this.residents.add(name1);
    this.residents.add(name2);
  }
  public void moveOut(String name) {
    this.residents.remove(name);
  }
  public void moveOut(String name1, String name2) {
    this.residents.remove(name1);
    this.residents.remove(name2);
  }
  public boolean isResident(String name) {
    return this.residents.contains(name);
  }
  public void showOptions() {
    super.showOptions();
    System.out.println( " + hasDiningRoom() \n + numResidents() \n + moveIn(name) \n + moveOut(name) \n + isResident(name)");
  }
  public void goToFloor(int floorNum) {
    if (floorNum - 1 != activeFloor && floorNum + 1 != activeFloor) {
      if (this.hasElevator == false) {
        System.out.println("You cannot go directly to this floor because your house does not have an elevator! Please take the stairs one at a time.");
        return;
      }
      else {
        super.goToFloor(floorNum);
      }
    }
    else {
      super.goToFloor(floorNum);
    }
  }


  public static void main(String[] args) {
    ArrayList<String> gspotResidents = new ArrayList<String>();
    gspotResidents.add("Molly");
    gspotResidents.add("Alex");
    House gardinerHouse = new House(false,gspotResidents, false, "Gardiner", "1 Paradise Rd", 4);
    System.out.println(gardinerHouse.hasDiningRoom());
    System.out.println(gardinerHouse.numResidents());
    gardinerHouse.moveIn("Lucia");
    gardinerHouse.moveOut("Alex");
    System.out.println(gardinerHouse.isResident("Alex"));
    System.out.println(gardinerHouse.isResident("Lucia"));
    gardinerHouse.showOptions();
    gardinerHouse.enter();
    gardinerHouse.goToFloor(2);
    gardinerHouse.goUp();
    gardinerHouse.goDown();
    gardinerHouse.moveIn("Lily", "Sabina");
    System.out.println(gspotResidents);
  }

}
