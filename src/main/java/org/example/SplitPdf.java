package org.example;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

public class SplitPdf {
    public static void exec(Conf conf) throws IOException
    {
        File input_path = new File(conf.downloads, conf.input_dir + conf.direction);
//        for (int i = 0; i < input_path.list().length; i++) {
//            File pdffile = new File(conf.downloads + conf.input_dir + conf.direction + input_path.list()[i]);
//            PDDocument document = PDDocument.load(pdffile);
//            Splitter splitting = new Splitter();
//
//            List<PDDocument> Page = splitting.split(document);
//            Iterator<PDDocument> iteration
//                    = Page.listIterator();
//
//            int j = 1;
//            while (iteration.hasNext()) {
//                PDDocument pd = iteration.next();
//                pd.save(conf.downloads + conf.output_dir+ conf.direction + i + "-" + j +"(" + conf.direction.substring(0, conf.direction.length()-1) + ").pdf");
////                pd.save(conf.downloads + conf.output_dir+ conf.direction + i + "-" + j +"(" + conf.direction + ").pdf");
//                j++;
//                pd.close();
//            }
//            System.out.println(input_path.list()[i]);
//            System.out.println("Splitted Pdf Successfully.");
//            document.close();
        }
    public static void exec(String inputFilename, String outputFilename) throws IOException
    {
        File input_path = new File(inputFilename);
        File pdffile = new File(inputFilename);
        PDDocument document = PDDocument.load(pdffile);
        Splitter splitting = new Splitter();

        List<PDDocument> Page = splitting.split(document);
        Iterator<PDDocument> iteration
                = Page.listIterator();

        int j = 1;
        while (iteration.hasNext()) {
            PDDocument pd = iteration.next();
            pd.save(outputFilename + "-" + j +"().pdf");
            j++;
            pd.close();
        }
        System.out.println("Splitted Pdf Successfully.");
        document.close();
    }
}


