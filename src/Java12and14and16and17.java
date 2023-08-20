import java.time.DayOfWeek;
import java.time.LocalDate;

public class Java12and14and16and17 {

    public static void main(String[] args) {

        // swithc expression
        // Switch expressions will now be used as a statement as well as expressions.

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay ="";
        switch (dayOfWeek){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                typeOfDay="Working Day";
                break;
            case SUNDAY:
                typeOfDay="FunDay";
                break;
            case SATURDAY:
                typeOfDay="Football day";
                break;
            case FRIDAY:
                typeOfDay="Chill and work";
                break;
        }
        System.out.println(typeOfDay);

        // now in java 12

     typeOfDay=  switch (dayOfWeek) {
         case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
         case SUNDAY, SATURDAY -> "Day Off";
     };

        System.out.println(typeOfDay);

//        A record is a data class that stores pure data.
//        The idea behind introducing records is to quickly create simple and concise classes devoid of boilerplate code in the model POJOs.
    }
}
