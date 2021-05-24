package FileSystem.Files;

import FileSystem.Visitor.FileVisitor;

import java.util.ArrayList;

public class DirectoryDetails extends FileDetails {
    ArrayList<FileDetails> files= new ArrayList<>();

    public ArrayList<FileDetails> getFiles() {
        return files;
    }

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