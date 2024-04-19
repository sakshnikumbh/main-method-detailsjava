import java.util.Date;      
public class Dateapi {
  
    public static void main(String [] x)
    {
       Date date=new Date();
        int da=date.getDate();   //line on function show that method are depricated.
     int month=date.getMonth()+1;
     int year=date.getYear() +1900;

     System.out.println(da+" "+month+"  "+year);
    }
}
