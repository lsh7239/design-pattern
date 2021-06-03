package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    private String name;
    private List<TreeNode> children;

    public TreeNode(){
        this.children = new ArrayList<>();
    }

    public TreeNode(Node node){

        this();
        this.name = node.getName();

        for(Node item : node.getChildren()){
            this.children.add(new TreeNode(item));
        }
    }

    public String getName() {
        return name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }
}
