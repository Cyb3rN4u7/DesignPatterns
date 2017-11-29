package model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String name;
    private List<FileComponent> contents;

    public Folder(String name){
        this.name = name;
        this.contents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFileComponent(FileComponent fc){
        if(!contents.contains(fc)){
            contents.add(fc);
        }
    }

    @Override
    public void display(String indent) {
        indent +=indent;
        System.out.println(indent+name);
        for(FileComponent fileComponent: contents){
            fileComponent.display(indent);
        }
    }
}
