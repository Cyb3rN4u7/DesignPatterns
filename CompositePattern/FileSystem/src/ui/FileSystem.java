package ui;

import model.File;
import model.Folder;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    public static void main(String[] args) {
        List<Folder> folders = new ArrayList<>();
        Folder f1 = new Folder("Folder 1:");
        Folder f2 = new Folder("Folder 2:");

        File file1 = new File("File 1" ,"Data of file 1");
        File file2 = new File("File 2" ,"Data of file 2");
        File file3 = new File("File 3" ,"Data of file 3");

        f1.addFileComponent(file1);
        f1.addFileComponent(file2);
        f1.addFileComponent(f2);
        f2.addFileComponent(file3);

        f1.display(" ");
    }
}
