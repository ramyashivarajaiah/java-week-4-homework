package carpetcostcalculator;

/**
 * 2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double.
 * <p>
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * <p>
 * Write the following methods (instance methods):
 */

public class Carpet {
    //instance variable
    double cost = 0;

    //constructor with parameter
    public Carpet(double cost) {
        this.cost = cost;
        if (cost < 0) {
            this.cost = cost;
        }
    }

    // method without any parameter and return type
    public double getCost() {
        return this.cost;
    }
}
