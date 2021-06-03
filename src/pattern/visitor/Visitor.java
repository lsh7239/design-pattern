package pattern.visitor;

import pattern.composite.Directory;
import pattern.composite.File;

import java.util.List;

public interface Visitor {

    void visit(Directory directory);
    void visit(File file);

    List<String> getNames();
}
