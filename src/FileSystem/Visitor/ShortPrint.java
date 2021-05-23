package FileSystem.Visitor;

import FileSystem.Files.*;

public class ShortPrint implements FileVisitor{
    @Override
    public void visit(TxtFileDetails txt) {
        System.out.println(txt.getName());
    }

    @Override
    public void visit(PptxFileDetails pptx) {
        System.out.println(pptx.getName());
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        System.out.println(mp3.getName());
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        System.out.println(jpg.getName());
    }

    @Override
    public void visit(HtmlFileDetails html) {
        System.out.println(html.getName());
    }

    @Override
    public void visit(DocxFileDetails docs) {
        System.out.println(docs.getName());
    }

    @Override
    public void visit(DirectoryDetails directory) {
        System.out.println(directory.getName());
    }
}
