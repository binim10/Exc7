package FileSystem.Visitor;

import FileSystem.Files.*;

public interface FileVisitor {

    void visit(TxtFileDetails txt);

    void visit(PptxFileDetails pptx);

    void visit(Mp3FileDetails mp3);

    void visit(JpgFileDetails jpg);

    void visit(HtmlFileDetails html);

    void visit(DocxFileDetails docs);

    void visit(DirectoryDetails directory);
}
