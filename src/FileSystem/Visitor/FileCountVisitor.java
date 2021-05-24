package FileSystem.Visitor;

import FileSystem.Files.*;
import FileSystem.Visitor.FileVisitor;

public class FileCountVisitor implements FileVisitor {

    private int totalFiles = 0;

    public int getTotalFiles() {
        return totalFiles;
    }

    public void setTotalFiles(int totalFiles) {
        this.totalFiles = totalFiles;
    }

    @Override
    public void visit(TxtFileDetails txt) {
        totalFiles += 1;
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        totalFiles += 1;
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        totalFiles += 1;
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        totalFiles += 1;
    }

    @Override
    public void visit(HtmlFileDetails html) {
        totalFiles += 1;
    }

    @Override
    public void visit(DocxFileDetails docs) {
        totalFiles += 1;
    }

    @Override
    public void visit(DirectoryDetails directory) {}
}
