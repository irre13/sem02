package org.example;

import java.io.File;

public class Repeat {
    public static void main( String[] args){
        String str = "TEST";
        String repeated = str.repeat(100);
        System.out.println(repeated);
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
    }
}
