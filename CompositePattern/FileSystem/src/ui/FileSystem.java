package ui;

import model.File;
import model.Folder;

public class FileSystem {
    public static void main(String[] args) {

        Folder f1 = new Folder("Folder 1:");
        Folder f2 = new Folder("Folder 2:");
        Folder f3 = new Folder("Folder 3:");

        File file1 = new File("File 1" ,"Data of file 1");
        File file2 = new File("File 2" ,"Data of file 2");
        File file3 = new File("File 3" ,"Data of file 3");
        File file4 = new File("File 4" ,"Data of file 4");
        File file5 = new File("File 5" ,"Data of file 5");

        f1.addFileComponent(file1);
        f1.addFileComponent(file2);
        f1.addFileComponent(f2);
        f2.addFileComponent(file3);
        f2.addFileComponent(f3);
        f3.addFileComponent(file4);
        f3.addFileComponent(file5);

        f1.display(" ");
    }
}
