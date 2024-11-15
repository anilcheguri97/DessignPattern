import Model.Genre;
import Model.Location;
import Model.Movie;
import controller.TheaterController;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Location location1 = new Location();
        location1.setAddress("Banglore");
        location1.setCity("Banglore");
        Movie bahubaliMovie = new Movie();
        bahubaliMovie.setMovieName("Bahubali");
        bahubaliMovie.setDuration("3hrs25min");
        List<Genre> genreList = new ArrayList<>();
        genreList.add(Genre.DRAMA);
        genreList.add(Genre.THRILLER);
        bahubaliMovie.setGenres(genreList);
        TheaterController theaterController = new TheaterController();
        List<Movie> movies = new ArrayList<>();
        movies.add(bahubaliMovie);
        theaterController.setMovies(movies);

        Movie bahubaliMovie1 = new Movie();
        bahubaliMovie1.setMovieName("Bahubali 2");
        bahubaliMovie1.setDuration("3hrs25min");
        List<Genre> genreList1 = new ArrayList<>();
        genreList1.add(Genre.DRAMA);
        genreList1.add(Genre.THRILLER);
        bahubaliMovie.setGenres(genreList1);
        movies.add(bahubaliMovie1);


        Location loc2 = new Location();
        loc2.setAddress("HYD");
        loc2.setCity("HYD");


        HashMap<Location,List<Movie>> hm = new HashMap<>();
        hm.put(location1,movies);
        hm.put(loc2,movies);

        System.out.println("... start slecting location and movies");

        List<Movie> movies1 = hm.get(location1);



    }
}