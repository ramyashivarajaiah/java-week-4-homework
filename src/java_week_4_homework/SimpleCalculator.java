package java_week_4_homework;

/**
 * Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 * TEST EXAMPLE
 * TEST CODE: Write the bellow code into main method
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * <p>
 * OUTPUT
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * TIPS:
 * ● add= 9.0 is printed because 5.0 + 4 is 9.0
 * ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * ● divide= 0.0 is printed because secondNumber is set to 0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */

public class SimpleCalculator {
    // instance variables
    double firstNumber;
    double secondNumber;

    //Method named getFirstNumber without any parameters, it needs to return the value of the
    //firstNumber field.
    public double getFirstNumber() {
        return firstNumber;
    }

    //Method named getSecondNumber without any parameters, it needs to return the value of
    //the secondNumber field.
    public double getSecondNumber() {
        return secondNumber;
    }

    //Method named setFirstNumber with one parameter of type double, it needs to set the value
    //of the firstNumber field.
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //Method named setSecondNumber with one parameter of type double, it needs to set the
    //value of the secondNumber field.
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Method named getAdditionResult without any parameters, it needs to return the result of
//adding the field values of firstNumber and secondNumber.
    public double getAdditionResult() {
        double result = (firstNumber + secondNumber);
        System.out.println(result);
        return result;
    }

    // Method named getSubtractionResult without any parameters, it needs to return the result of
//subtracting the field values of the secondNumber from the firstNumber.
    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    //Method named getMultiplicationResult without any parameters, it needs to return the result
//of multiplying the field values of firstNumber and secondNumber.
    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    //Method named getDivisionResult without any parameters, it needs to return the result of
//dividing the field values of firstNumber by the secondNumber. In case the value of
//secondNumber is 0 then return 0.
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return (firstNumber / secondNumber);
    }

    //main method
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        System.out.println("add= " + simpleCalculator.getAdditionResult());
        System.out.println("subtract= " + simpleCalculator.getSubtractionResult());
        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        System.out.println("multiply= " + simpleCalculator.getMultiplicationResult());
        System.out.println("divide= " + simpleCalculator.getDivisionResult());


    }


}
