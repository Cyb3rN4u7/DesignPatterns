package model;

public class Mp3 extends File {
    public Mp3(String name, String data) {
        super(name, data);
    }

    @Override
    public void display(String indent) {
        indent += indent;
        System.out.println(indent+getName()+" Mp3 data : "+getData());
    }
}
