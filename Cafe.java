/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
    /*Creates an instance of a cafe */
    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups, String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    /*Uses up inventory according to the customers order, restocks the inventory if there is not enough ingridents */
    public void sellCoffee(int size, int sugar, int creams) {
        if (this.nCoffeeOunces < size) {
            restock(size + 8, 0, 0, 0);
        }
        this.nCoffeeOunces += -size;
        if (this.nSugarPackets < sugar) {
            restock(0, sugar + 5, 0, 0);
        }
        this.nSugarPackets += -sugar;
        if (this.nCreams < creams) {
            restock(0, 0, creams + 3, 0);
        }
        this.nCreams += -creams;
        if (this.nCups == 0) {
            restock(0,0,0,5);
        }
        this.nCups += -1;
    }
    /*Creates a coffee that has no sugar or cream, restocks the inventory if there isn't enough coffee or cups */
    public void sellCoffee(int size) {
        if (this.nCoffeeOunces < size) {
            restock(size + 8, 0, 0, 0);
        }
        this.nCoffeeOunces += -size;
        if (this.nCups == 0) {
            restock(0,0,0,5);
        }
        this.nCups += -1;
    }
    /*Restocks all ingridents in the inventory */
    private void restock(int ncoffee, int nsugar, int ncreams, int ncups) {
        this.nCoffeeOunces += ncoffee;
        this.nSugarPackets += nsugar;
        this.nCreams += ncreams;
        this.nCups += ncups;
    }
    /* Restocks only coffee in the inventory */
    private void restock(int ncoffee){
        this.nCoffeeOunces += ncoffee;
    }
    /*Prints all of the class methods */
    public void showOptions() {
        super.showOptions();
        System.out.println(" + sellCoffee(size, sugar, creams) \n + restock(ncoffee, nsugar, ncreams, ncups)");
    }
    /*Tells people they cannot access higher floors of the cafe. */
    public void goToFloor(int floorNum) {
        System.out.println("Employees only, no entrance");
    }
    
    public static void main(String[] args) {
        Cafe compass = new Cafe(12,6,6, 4, "Compass Cafe", "7 Neilson Street", 1);
        System.out.println(compass.getAddress());
        compass.showOptions();
        compass.restock(25);
    }
    
}
