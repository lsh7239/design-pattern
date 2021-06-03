package pattern.strategy;

public class Multiplier implements BasicArithmetic{
    @Override
    public float calculate(int i, int j) {
        return i*j;
    }
}
