package pattern.chains;

public class GradeOffer extends Chain{

    @Override
    public void calculate(Order order) {

        if(order.isGradeVIP()){
            long total = order.getTotal();
            total = (long)(total * 0.95);
            order.setTotal(total);
        }

        if(this.hasNext()){
            this.getNext().calculate(order);
        }
    }
}
