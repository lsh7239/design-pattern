package pattern;

import pattern.composite.Directory;
import pattern.composite.File;
import pattern.composite.Node;
import pattern.composite.TreeNode;
import pattern.visitor.FileExtractVisitor;
import pattern.visitor.Visitor;

public class PatternMain {

    public static void main(String[] args) {

        Node fileSystem = new Directory("ROOT");

        Node planning = new Directory("Planning");
        fileSystem.addNode(planning);

        Node design = new Directory("Design");
        fileSystem.addNode(design);

        Node sampleFile = new File("sample.psd");
        design.addNode(sampleFile);

        TreeNode tree = new TreeNode(fileSystem);
        printTree(tree, 0);

        Visitor visitor = new FileExtractVisitor();
        fileSystem.accept(visitor);
        System.out.println(visitor.getNames());

    }

    private static void printTree(TreeNode treeNode, int depth){

        String indentation = "";
        for(int i = 0; i<depth;i++){indentation += "\t";}

        System.out.println(indentation+"+ " + treeNode.getName());
        for(TreeNode child : treeNode.getChildren()){
            printTree(child, depth+1);
        }
    }
}
