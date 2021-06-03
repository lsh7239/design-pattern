package pattern.visitor;

import pattern.composite.Directory;
import pattern.composite.File;
import pattern.composite.Node;

import java.util.ArrayList;
import java.util.List;

public class FileExtractVisitor implements Visitor{

    private List<String> files;

    public FileExtractVisitor(){
        this.files = new ArrayList<>();
    }

    @Override
    public void visit(Directory directory) {

        for(Node node : directory.getChildren()){
            node.accept(this);
        }
    }

    @Override
    public void visit(File file) {
        this.files.add(file.getName());
    }

    @Override
    public List<String> getNames() {
        return this.files;
    }

}
