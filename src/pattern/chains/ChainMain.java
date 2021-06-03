package pattern.chains;

public class ChainMain {

    public static void main(String[] args) {

        Chain offer = ChainFactory.createChain();

        Customer customer = new Customer("posco", Grade.VIP);
        Order order = new Order(customer, 10000);

        offer.calculate(order);
        System.out.println(order.getTotal());

    }
}
