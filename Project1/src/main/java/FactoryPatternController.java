/*
Creates the objects for the program. Can have other functionality aside from this,
but that is its most basic purpose. Does not have a main function, but
it does have get methods (and optionally, set methods, delete methods, etc.)
*/

public class FactoryPatternController { // controls the creation of the bill
    // and related objects. Calls interface and subclasses, gets called by the runner.

    // gets the bill depending on specification
    public static Interface getBill(String billNum){

        /*
        The Interface specification here is in reference to Interface.java,
        and this is done here because we want our getBill() calls to point to
        a new object that exists within the Interface subclasses.
        */

        if (billNum == "Chicken") {
            return new ChickenOrder();
            // points to a new object created in ChickenOrder (chicken order bill)
        } // end if
        else if (billNum == "Bar") {
            return new BarOnly();
            // points to a new object created in BarOnly (bar only bill)
        } // end else if
        else if (billNum == "Steak") {
            return new SteakOrder();
            // points to a new object created in SteakOrder (steak order bill)
        } // end else if
        return null; // method requires a return
    } // end getBill
} // end class