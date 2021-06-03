package pattern.chains;

public class TimeOffer extends Chain{

    @Override
    public void calculate(Order order) {

        if(this.hasNext()){
            this.getNext().calculate(order);
        }
    }
}
