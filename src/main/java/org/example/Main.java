package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
// very helpful comments aqui \/ my redundent config class ¯\_(ツ)_/¯
        Conf conf = new Conf(
                "/Users/dmitriyivkov/Downloads/",
                "scans/",
                "output-scans/",
                "left/"
        );
        try {
//            SplitPdf.exec(conf);
            // runs default option w/ no conifg -> I gave up modifying config for every tiny variation in dirs etc so I did it inline
            SplitPdf.exec();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
