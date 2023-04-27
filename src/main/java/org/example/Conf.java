package org.example;

public class Conf {
String downloads;
String input_dir;
String output_dir;
String direction;
    public Conf(String dir_downloads, String input_dir, String output_dir, String direction) {
        this.downloads = dir_downloads;
        this.input_dir = input_dir;
        this.output_dir = output_dir;
        this.direction = direction;
    }
}
