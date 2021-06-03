package pattern.strategy;

public class Divider implements BasicArithmetic{
    @Override
    public float calculate(int i, int j) {
        if(j != 0){
            return i/j;
        }else{
            throw new IllegalArgumentException("분모는 0일 수 없습니다.");
        }
    }
}
