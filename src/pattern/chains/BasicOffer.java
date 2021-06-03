package pattern.chains;

public class BasicOffer extends Chain{

    @Override
    public void calculate(Order order) {

        long total = order.getTotal();
        total = (long)(total * 0.93);
        order.setTotal(total);

        if(this.hasNext()){
            this.getNext().calculate(order);
        }
    }
}
