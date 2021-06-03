package pattern.chains;

public class Order {

    private Customer customer;
    private long total;

    public Order(Customer customer, long total) {
        this.customer = customer;
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isGradeVIP(){
        return this.customer.getGrade() == Grade.VIP;
    }
}
