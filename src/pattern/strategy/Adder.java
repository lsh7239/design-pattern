package pattern.strategy;

public class Adder implements BasicArithmetic{

    @Override
    public float calculate(int i, int j) {
        return i+j;
    }
}
