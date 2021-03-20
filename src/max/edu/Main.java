package max.edu;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2005, Month.JULY , 27);
        System.out.println(date.getDayOfWeek());
        LocalDate jan = LocalDate.of(2021 , Month.JANUARY , 1);
        System.out.println(jan.plusDays(255));

        Person max = new Person();
        max.setFirstName("Max");
        max.setMidName("Valeriyovych");
        max.setLastName("Hohol");
        max.setCity("Chernovtsy");
        max.setStreet("st.Green");
        max.setHouseNumber("12");
        max.setPhoneNumber("0669223550");
        max.setDateOfBirth(LocalDate.of(2005 , 6 ,27));
        System.out.println(max);
    }
}
