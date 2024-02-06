public class Date {
    int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day; 
        this.month = month; 
        this.year = year;
    }

    public void printDate(){
        System.out.println(day + "-" + month + "-" + year);
    }
}
