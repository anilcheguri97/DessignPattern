package model;

public class File implements FileSystem{
    String fileName;
    public File(String fileName) {
        this.fileName=fileName;
    }

    @Override
    public void ls() {
        System.out.println("file Name is "+fileName);
    }
}
