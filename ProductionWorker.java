//Jeff Vazquez
//CS1400, section 05
//Project 8 - Employee Inheritance
//11/16/2020
public class ProductionWorker 
extends Employee
{
   private int shift;
   private double payRate;
   public ProductionWorker()
   {
      super();
      shift = 1;
      payRate = 0.0;
   }
   public ProductionWorker(String eName, String eNumber, String hDate, int s, double rate)
   {
      super(eName, eNumber, hDate);
      shift = s;
      payRate = rate;
   } 
   public void setShift(int s)
   {
      shift = s;
   }
   public void setPayRate(double rate)
   {
      payRate = rate;
   }
   public int getShift(int s)
   {
      return shift;
   }
   public double getPayRate(int rate)
   {
      return payRate;
   }
   public String toString()
   {
      String str = super.toString();
      String decimalPlace = String.format("%.2f",payRate);
  
      str += "\nShift: ";

      if(shift == 1)
         str += "Day";
      else if(shift == 2)
         str += "Night";
      else
         str += "INVALID SHIFT NUMBER";

      str += "\nHourly Pay Rate: $"; 
         str += decimalPlace;
      return str;
   }
}
