package de.qvalentin;

abstract class Price { abstract
int getPriceCode();
abstract double getCharge(int daysRented);
int getFrequentRenterPoints(int daysRented){
    return 1;
}

}
class ChildrenPrice extends Price
{ int getPriceCode() {
    return Movie.CHILDREN;
}

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
class NewReleasePrice extends Price
{ int getPriceCode() {
    return Movie.NEW_RELEASE;
}
    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        if (daysRented>1) return 2;
        return super.getFrequentRenterPoints(daysRented);

    }
}
class RegularPrice extends Price
{ int getPriceCode() {
    return Movie.REGULAR;
}

    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
