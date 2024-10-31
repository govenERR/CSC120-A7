/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups, String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

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

    private void restock(int ncoffee, int nsugar, int ncreams, int ncups) {
        this.nCoffeeOunces += ncoffee;
        this.nSugarPackets += nsugar;
        this.nCreams += ncreams;
        this.nCups += ncups;
    }
    
    public static void main(String[] args) {
        Cafe compass = new Cafe(12,6,6, 4, "Compass Cafe", "7 Neilson Street", 1);
        System.out.println(compass.getAddress());
    }
    
}
