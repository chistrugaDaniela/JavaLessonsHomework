public class Main {
    public static void main(String[] args) {
        System.out.println(Weekday.MONDAY.isWeekDay());
        System.out.println(Weekday.SUNDAY.isWeekDay());

        System.out.println(Weekday.TUESDAY.isHolidayDay());
        System.out.println(Weekday.SATURDAY.isHolidayDay());
    }
}