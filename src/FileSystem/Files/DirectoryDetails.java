package FileSystem.Files;

import FileSystem.Visitor.FileVisitor;

import java.util.ArrayList;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {
    ArrayList<FileDetails> files= new ArrayList<>();
    public DirectoryDetails(String path, String name){
        super(path,name);
    }

    @Override
    public void accept(FileVisitor fv) {

        for( FileDetails fd : files){
            fd.accept(fv);
        }
        fv.visit(this);
    }

    public void addFile(FileDetails fileDetails){
       files.add(fileDetails);
    }
}