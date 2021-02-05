package project;

public class FizzBuzzQix {

    public String interpret(int numberToInterpret) {
        String thingToSay = "" + numberToInterpret;
        if (numberToInterpret%3==0) {
            thingToSay = "Fizz";
        }
        if (numberToInterpret%5==0) {
            if (thingToSay.equals("Fizz")) {
                thingToSay = thingToSay + "Buzz";
            } else {
                thingToSay = "Buzz";
            }
        }
        if (numberToInterpret%7==0) {
            if (thingToSay.equals("Buzz") || thingToSay.equals("Fizz") || thingToSay.equals("FizzBuzz")) {
                thingToSay = thingToSay + "Qix";
            } else {
                thingToSay = "Qix";
            }

        }
        return thingToSay;

    }
}
