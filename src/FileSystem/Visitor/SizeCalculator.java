package FileSystem.Visitor;

import FileSystem.Files.*;

public class SizeCalculator implements FileVisitor{

    public int sizeBite = 0;

    @Override
    public void visit(TxtFileDetails txt) {
        sizeBite += txt.getSize();
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        sizeBite += pptx.getSize();
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        sizeBite += mp3.getSize();
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        sizeBite += jpg.getSize();
    }

    @Override
    public void visit(HtmlFileDetails html) {
        sizeBite += html.getSize();
    }

    @Override
    public void visit(DocxFileDetails docs) {
        sizeBite += docs.getSize();
    }

    @Override
    public void visit(DirectoryDetails txt) {

    }
}
