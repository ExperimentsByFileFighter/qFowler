package de.qvalentin;

public class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    double getCharge() {

        return movie.getCharge(getDaysRented());

    }

    int getFrequentRenterPoints() {
        //determine amounts for each line
        // add frequent renter points
        // add bonus for a two day new release rental
       return movie.getFrequentRenterPoints(daysRented);}

}
