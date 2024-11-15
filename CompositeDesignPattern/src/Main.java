import model.Directory;
import model.File;
import model.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Movie");
        FileSystem comedyMovie = new File("Boarder");
        directory.add(comedyMovie);
        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        FileSystem comedyMovie1 = new File("Hulbul");
        comedyMovieDirectory.add(comedyMovie1);
        comedyMovieDirectory.add(directory);

        comedyMovieDirectory.ls();




    }
}