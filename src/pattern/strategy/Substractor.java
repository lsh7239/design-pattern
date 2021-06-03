package pattern.strategy;

public class Substractor implements BasicArithmetic{

    @Override
    public float calculate(int i, int j) {
        return i-j;
    }
}
