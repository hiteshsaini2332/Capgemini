package exception;

public class RethrowingExceptions {
    public static  int performDivision(int numerator, int denominator) throws ArithmeticException
    {
        try {
            if(denominator==0)throw new ArithmeticException();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Number cannot be divided by 0");
        }
        return numerator/denominator;
    }
    public  static int calculate(int numerator, int denominator) throws ArithmeticException
    {
        try{
            return  performDivision(numerator,denominator);
        } catch (ArithmeticException e) {
            System.out.println("Calculate");
        }
        return 0;
    }

    static void main() {
        System.out.println((calculate(10,0)));
    }
}
