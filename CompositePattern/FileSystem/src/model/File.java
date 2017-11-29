package model;

public class File implements FileComponent {
    private String name,data;

    public File(String name, String data){
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    @Override
    public void display(String indent) {
        indent += indent;
        System.out.println(indent+name+" data : "+data);
    }
}
