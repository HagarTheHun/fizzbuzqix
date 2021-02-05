package project;

public class FizzBuzzQix {

    public String interpret(int numberToInterpret) {
        String thingToSay = "" + numberToInterpret;
        if (numberToInterpret%3==0) {
            thingToSay = "Fizz";
        }
        return thingToSay;

    }
}
