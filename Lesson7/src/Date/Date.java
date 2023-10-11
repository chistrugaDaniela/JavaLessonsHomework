package Date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (day < 1 || day > 31) {
            System.out.println("Invalid month day!");
        } else {
            this.day = day;
        }
        if (month < 0 || month > 12) {
            System.out.println("Invalid month!");
        } else {
            this.month = month;
        }
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("Invalid month day!");
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 0 || month > 12) {
            System.out.println("Invalid month!");
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}
