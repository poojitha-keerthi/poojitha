import java.time.LocalDate;
import java.time.LocalTime;
class Test2
{
  public static void main(String[] args)
  {
     LocalDate date = LocalDate.of(95,10,12);
	 LocalTime time = LocalTime.now();
	 System.out.println(date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());
	 System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
	 }
	 }