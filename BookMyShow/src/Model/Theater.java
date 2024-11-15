package Model;

import java.util.List;

public class Theater {
    List<Movie> movies;
    List<Screen> screens;
    List<Show> showsList;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShowsList() {
        return showsList;
    }

    public void setShowsList(List<Show> showsList) {
        this.showsList = showsList;
    }

}
