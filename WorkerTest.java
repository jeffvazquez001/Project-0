import java.util.Scanner;
public class WorkerTest
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      ProductionWorker j1 = new ProductionWorker("John Smith", "123-A", "11-15-2005",1, 23.50);
      ProductionWorker j2 = new ProductionWorker();
      ProductionWorker t1 = new ProductionWorker("Tony Gaddis","","1-23-2006",3,19.50);

      j2.setEmployeeName("Joan Jones");
      j2.setEmployeeNumber("222-L");
      j2.setHireDate("12-12-2018");
      j2.setShift(2);
      j2.setPayRate(18.50);

      System.out.println("Here's the first production worker.");
      System.out.println(j1);
      System.out.println();
      System.out.println("Here's the second production worker.");
      System.out.println(j2);
      System.out.println();
      System.out.println("Here's the third production worker.");
      System.out.println(t1);
   }
}
