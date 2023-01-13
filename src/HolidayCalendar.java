import java.util.ArrayList;
import java.util.List;

public class HolidayCalendar {
    private List<Holyday> holidays = new ArrayList<>();
    private String[][] holidayDates = {
        { "01/01/2023", "Confraternização mundial" },
        { "21/02/2023",  "Carnaval" },
        { "17/04/2023", "Páscoa" },
        { "21/04/2023", "Tiradentes" },
        { "01/05/2023", "Dia do trabalho" },
        { "08/06/2023", "Corpus Christi" },
        { "07/09/2023", "Independência do Brasil" },
        { "12/10/2023", "Nossa Senhora Aparecida" },
        { "02/11/2023", "Finados" },
        { "15/11/2023", "Proclamação da República"},
        { "25/12/2023", "Natal" }, 
    };
    
    public HolidayCalendar() { 
        for(int i = 0; i < holidayDates.length; i++) {
            holidays.add(new Holyday(holidayDates[i][0], holidayDates[i][1]));
        }
    }

    public void searchForHolydayByName(String date) {
        String holydayName = "";

        for(int i = 0; i < holidays.size(); i++) {
            Holyday holyday = holidays.get(i); 

            if(holyday.getDate().equals(date)) {
                holydayName = holyday.getName();
                break;
            }
        }
        
        if(holydayName.isEmpty()) {
            System.out.println("Não existe feriado na data " + date);
        } else {
            System.out.println("A data " + date + " se refere ao feriado " + holydayName);
        }
    }

    public List<Holyday> getAllHolidays() {
        return this.holidays;
    }
}
