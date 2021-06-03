package pattern.composite;

import pattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {

    private List<Node> children;
    private String name;
    private Node parent;

    public Node(){
        this.children = new ArrayList<>();
    }

    public Node(String name){
        this();
        this.name = name;
    }

    public void addNode(Node node){
        node.setParent(this);
        this.children.add(node);
    }

    public List<Node> getChildren(){
        return this.children;
    }

    public String getName() {
        return this.name;
    }

    public void setParent(Node node){
        this.parent = node;
    }

    public abstract void accept(Visitor visitor);

    @Override
    public String toString() {
        return "Node{" +
                "children=" + children.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}
