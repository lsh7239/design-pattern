package pattern.composite;

import pattern.visitor.Visitor;

public class File extends Node{

    public File(String name){
        super(name);
    }

    @Override
    public void addNode(Node node) {
        throw new UnsupportedOperationException(" ");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
