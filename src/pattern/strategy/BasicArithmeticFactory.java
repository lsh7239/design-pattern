package pattern.strategy;

public class BasicArithmeticFactory {

    public static BasicArithmetic create(String symbol){
        BasicArithmetic arithmetic = null;
        switch (symbol){
            case "+":
                arithmetic = new Adder();
                break;
            case "-":
                arithmetic = new Substractor();
                break;
            case "*":
                arithmetic = new Multiplier();
                break;
            case "/":
                arithmetic = new Divider();
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return arithmetic;
    }
}
