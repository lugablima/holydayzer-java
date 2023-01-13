public class App {
    public static void main(String[] args) {
        HolidayCalendar holidayCalendar = new HolidayCalendar();

        holidayCalendar.searchForHolydayByName("01/01/2023");

        System.out.println(holidayCalendar.getAllHolidays());
    }

}

