import java.util.Calendar;

public class Assignment2b {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        DateTime dt1 = new DateTime(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
        System.out.println("dt1 = " + dt1);
    }
}

