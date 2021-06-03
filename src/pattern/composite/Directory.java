package pattern.composite;

import pattern.visitor.Visitor;

public class Directory extends Node{

    public Directory(String name){
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
