package Files;

import java.util.ArrayList;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {
    ArrayList<FileDetails> files= new ArrayList<>();
    public DirectoryDetails(String path, String name){
        super(path,name);
    }
    public void addFile(FileDetails fileDetails){
       files.add(fileDetails);
    }
}