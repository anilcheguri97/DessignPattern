package controller;

import Model.Location;
import Model.Movie;
import Model.Theater;

import java.util.List;
import java.util.Map;

public class TheaterController {
    Map<Location, List<Theater>> locationListMap;
    List<Movie> movies;

    Theater theater;

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Map<Location, List<Movie>> getLocationListMap() {
        return locationListMap;
    }

    public void setLocationListMap(Map<Location, List<Movie>> locationListMap) {
        this.locationListMap = locationListMap;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
