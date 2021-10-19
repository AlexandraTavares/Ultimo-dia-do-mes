package dia;

import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import java.util.Date;  

public class dia {
    public static void main(String[] args) {  

        Date today = new Date();  

        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(today);  

        calendar.add(Calendar.MONTH, 1);  
        calendar.set(Calendar.DAY_OF_MONTH, 1);  
        calendar.add(Calendar.DATE, -1);  
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        Date UltimoDiaDoMes = calendar.getTime();  

        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
        System.out.println("" + sdf.format(UltimoDiaDoMes));  
    }  

} 
