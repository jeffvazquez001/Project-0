//Jeff Vazquez
//CS1400, section 05
//Project 8 - Employee Inheritance
//11/16/2020
public class Employee
{
   private String employeeName;
   private String employeeNumber;
   private String hireDate;
   private boolean isValidEmployeeNumber(String employeeNumber)
   {
      boolean statement= true;
      
      if(employeeNumber.length()!=5)
         statement = false;
      else
      {
         if((!Character.isDigit(employeeNumber.charAt(0)))
            || (!Character.isDigit(employeeNumber.charAt(1)))
            || (!Character.isDigit(employeeNumber.charAt(2)))
            || (employeeNumber.charAt(3) != '-')
            || (!Character.isLetter(employeeNumber.charAt(4))))

            statement = false;
            
      }
      return statement;
   }
   public Employee()
   {
      employeeName = "";
      employeeNumber = "";
      hireDate = "";
   }
   public Employee(String eName, String eNumber, String hDate)
   {
      employeeName = eName;
      employeeNumber = eNumber;
      hireDate = hDate;
   }
   public String getEmployeeName(String employeeName)
   {
   
      return employeeName;
   }
   public String getEmployeeNumber(String employeeNumber)
   {
   
      return employeeNumber;
   }
   public String getHireDate(String hireDate)
   {
   
      return hireDate;
   }
   public void setEmployeeName(String eName)
   {
         
      employeeName = eName;
 
   }
   public void setEmployeeNumber(String eNumber)
   {
      if(isValidEmployeeNumber(eNumber))
      {
         employeeNumber = eNumber;
      }
      else
      {
         employeeNumber="";
      }
   }
   public void setHireDate(String hireDate)
   {
   
      this.hireDate = hireDate;
 
   }
   public String toString()
   {
      String str = "Name: " + employeeName + "\nEmployeeNumber: ";
      if(employeeNumber == "")
      {
         str+= "INVALID EMPLOYEE NUMBER";
      }
      else
      {
         str += employeeNumber;
      }
      str+=("\nHire Date: " + hireDate);
      return str;
   }
}
