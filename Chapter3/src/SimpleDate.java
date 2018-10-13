public class SimpleDate {

    int day;
    int month;
    int year;

    public SimpleDate(int mm, int dd, int yyyy) {
        day = dd;
        month = mm;
        year = yyyy;
    }

    public int getMonth (){
        return month;
    }
    public int getDay (){
        return day;
    }
    public int getYear (){
        return year;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public void setDay(int newDay){
        this.day = newDay;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}
