/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // the number of ounces of coffee in the cafe
    private int nSugarPackets; // the number of sugar packets in the cafe
    private int nCreams; // the number of creams in the cafe
    private int nCups; // the number of cups in the cafe
    // Constructor
    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
       super(name, address, nFloors);
         this.nCoffeeOunces = coffee;
            this.nSugarPackets = sugar;
            this.nCreams = cream;
            this.nCups = cups;
            this.address = address;
            this.nFloors = nFloors;
            this.name = name;
        System.out.println("You have built a cafe: ☕");
    }
    // Method to sell coffee
    public void sellCoffee(int size, int sugar, int cream){
        if(nCoffeeOunces < size || nSugarPackets < sugar || nCreams < cream || nCups < 1){
            restock();     
    }
        nCoffeeOunces -= size;
        this.nSugarPackets -= sugar;
        this.nCreams -= cream;
        this.nCups -= 1;
}
    // Method to restock the cafe
    public void restock(){
        this.nCoffeeOunces += 70;
        this.nSugarPackets += 10;
        this.nCreams += 100;
        this.nCups += 20;
        System.out.println("Restocked");
    }
    public static void main(String[] args) {
        Cafe LaasGeel = new Cafe("Hargeysa", "100ka jir", 2, 100, 10, 100, 20);
        LaasGeel.sellCoffee(10, 2, 3);
        System.out.println("coffee is sold!");
    }
    
}
