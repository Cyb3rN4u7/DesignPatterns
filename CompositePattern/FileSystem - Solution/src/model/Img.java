package model;

public class Img implements FileComponent {
    private String name;
    private int data;

    public Img(String name, int data){
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public int getData() {
        return data;
    }

    @Override
    public void display(String indent) {
        indent += indent;
        System.out.println(indent+name+" Img data : "+data);
    }
}
