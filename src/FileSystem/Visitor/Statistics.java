package FileSystem.Visitor;

import FileSystem.Files.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

//TODO implementation
public class Statistics implements FileVisitor {

    NumberFormat formatter = new DecimalFormat("0.000000");
    @Override
    public void visit(TxtFileDetails txt) {
        System.out.println("The file " + txt.getName() + " contains " + txt.getWords() + " words.");

    }

    @Override
    public void visit(PptxFileDetails pptx) {
        System.out.println("The average slide size in Presentation " + pptx.getName() + " is " + formatter.format(Math.round(((double) pptx.getSize() / (double) pptx.getSlides()) * 1000000d) / 1000000d) + ".");
    }

    @Override
    public void visit(Mp3FileDetails mp3) {
        System.out.println("The bitrate of " + mp3.getName() + " is " + Math.round((double) mp3.getSize() / (double) mp3.getLengthSec() * 1000000d) / 1000000d + " bytes per second.");
    }

    @Override
    public void visit(JpgFileDetails jpg) {
        System.out.println("The picture " + jpg.getName() + " has an average of " + Math.round((double) jpg.getSize() / (double) (jpg.getHeight() * jpg.getWidth()) * 1000000d) / 1000000d + " bytes per pixel.");

    }

    @Override
    public void visit(HtmlFileDetails html) {
        System.out.println("The file " + html.getName() + " contains " + html.getLines() + " lines.");
    }

    @Override
    public void visit(DocxFileDetails docs) {
        System.out.println("The file " + docs.getName() + " has an average of " +  formatter.format(Math.round((double) docs.getWords() / (double) (docs.getPages()) * 1000000d) / 1000000d) + " words per page.");
    }

    @Override
    public void visit(DirectoryDetails directory) {
        //TODO in the test case print "Directory root has 5 files." instead of "7 files"
        System.out.println("Directory " + directory.getName() + " has " + directory.getNumOfFiles() + " files.");
    }
}
