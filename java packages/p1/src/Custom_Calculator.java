class maxInputException extends Exception {

    @Override
    public String toString() {
        return "Invalid input";
    }
}

class myCalculator {

    public double addition (double a, double b)throws maxInputException {
        if(a>100000||b>100000){
            throw new maxInputException ();
        }
        else {
            return a + b;
        }
    }
    public double division (double a, double b){

        return a/b;
    }
    public double multiplication (double a, double b) {

        return a*b;
    }
    public double subtraction (double a, double b) {

        return a-b;
    }
}


public class Custom_Calculator {
    public static void main(String[] args)throws maxInputException {

        myCalculator calculate = new myCalculator();
        System.out.println(calculate.addition(1000000,9));
          System.out.println("we won");



//        calculate.subtraction(11000000,5.2);
//
//        calculate.multiplication(8000,5);

    }
}
