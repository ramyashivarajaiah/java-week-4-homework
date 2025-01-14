package carpetcostcalculator;

/**
 * 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 * The class needs to have one constructor with parameters width and length of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length
 * parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (width * length).
 */

public class Floor {
    //instance variable
    double width;
    double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        /* if (width <=0){
        this.width=0;}
        if(length<=0){
        this.length = 0;}    */
    }

    //method without parameters with return type
    public double getArea() {
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
        double area = (width * length);
        return area;
    }
}
