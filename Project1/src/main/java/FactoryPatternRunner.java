/*
Name: Megan Brandreth
Group: N/A
Pattern: Factory Pattern
Project: simple implementation for demonstration, using the main aspects present
in programs using factory pattern.
*/

public class FactoryPatternRunner {
    /*
    The runner class is the 'main' class. the program runs out of it,
    but its functionality exists in allowing the controller class to
    process its calls to create objects. It does not deal with the interface
    or subclasses directly.
    */

    public static void main (String[] args) {

        FactoryPatternController FPC = new FactoryPatternController();
        // instantiates a new instance of the controller class

        // testing call for ChickenOrder
        Interface chicken = FPC.getBill("Chicken");
        chicken.bill();

        // testing call for BarOnly
        Interface bar = FPC.getBill("Bar");
        bar.bill();

        // testing call for SteakOrder
        Interface steak = FPC.getBill("Steak");
        steak.bill();

    } // end main
} // end class