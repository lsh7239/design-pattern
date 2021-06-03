package pattern.chains;

public abstract class Chain {

    private Chain nextChain;

    public void setNext(Chain chain){
        this.nextChain = chain;
    }

    public Chain getNext(){
        return this.nextChain;
    }

    protected boolean hasNext(){
        return this.nextChain != null;
    }

    public abstract void calculate(Order order);

}
