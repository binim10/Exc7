package FileSystem.Files;

import FileSystem.Visitor.FileVisitor;

import java.util.ArrayList;

public class DirectoryDetails extends FileDetails {
    ArrayList<FileDetails> files= new ArrayList<>();

    public int getNumOfFiles() {
        int count = 0;
        for(FileDetails fileDetails : files){
            if(fileDetails.getClass() != DirectoryDetails.class)
                count += 1;
            else{
              count +=  ((DirectoryDetails) fileDetails).getNumOfFiles() ;
            }
        }
        return count;
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