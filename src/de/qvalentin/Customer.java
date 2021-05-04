package de.qvalentin;


import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {

        Enumeration enum_rentals = rentals.elements();
        String result = "de.qvalentin.Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle()+ "\t" + "\t" + rental.getDaysRented() + "\t" + String.valueOf(rental.getCharge()) + "\n";

        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRentalPoints()) + " frequent renter points";
        return result;
    }

    private double getTotalCharge(){
        double totalAmount = 0;
        Enumeration enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            //show figures for this rental
            totalAmount += rental.getCharge();
        }
        return totalAmount;
    }

    private int getFrequentRentalPoints(){
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            //show figures for this rental
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }


}

