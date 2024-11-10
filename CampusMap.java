import java.util.ArrayList;
import java.util.Hashtable;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Cafe(25, 10, 10, 5, "Compass Cafe", "7 Neilson Street", 1));
        Hashtable<String, Boolean> neilsonBooks = new Hashtable<>();
        neilsonBooks.put("The Hunger Games", true);
        neilsonBooks.put("Cell Energetics", false);
        myMap.addBuilding(new Library(neilsonBooks, "Neilson Library", "7 Neilson Street", 4));
        ArrayList<String> gspotResidents = new ArrayList<String>();
        gspotResidents.add("Molly");
        gspotResidents.add("Lily");
        myMap.addBuilding(new House(false, gspotResidents, false, "Gardiner House", "1 Paradise Rd", 4));
        ArrayList<String> czResidents = new ArrayList<String>();
        czResidents.add("Rook");
        czResidents.add("Ada");
        czResidents.add("Soph");
        czResidents.add("Fake Lily");
        myMap.addBuilding(new House(true, czResidents, true, "Cutter House", "79 Elm St", 3));
        myMap.addBuilding(new Building("CC", "100 Elm Street", 2));
        myMap.addBuilding(new Building("Ainsworth Gym", "102 Lower College Lane", 6));
        ArrayList<String> KingResidents = new ArrayList<String>();
        KingResidents.add("Ronny");
        KingResidents.add("Victoria Mills");
        KingResidents.add("Alex");
        myMap.addBuilding(new House(true,KingResidents, true, "King House", "180 Elm Street", 4 ));
        myMap.addBuilding(new Cafe(100, 30, 30, 25, "Familiars", "6 Strong Avenue", 1));
        System.out.println(myMap);
    }
    
}
