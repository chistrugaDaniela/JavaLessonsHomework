public enum Weekday {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    public boolean isWeekDay;

    Weekday(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }

    public boolean isHolidayDay() {
        return !isWeekDay;
    }
}
