package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Conf conf = new Conf(
                "/Users/dmitriyivkov/Downloads/",
                "scans/",
                "output-scans/",
                "left/"
        );
        try {
//            SplitPdf.exec(conf);
            SplitPdf.exec();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}