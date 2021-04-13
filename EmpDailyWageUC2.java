
public class EmpDailyWageUC2 {
   public static void main(String [] args) {
   int is_Present=1;
   int fulltimeHr=8;
   int SalaryPerHr=50; 
   double salary=0.0;
   double empCheck=Math.floor(Math.random()*10) % 2;
   if (empCheck == is_Present) 
     salary=(SalaryPerHr*fulltimeHr);
   else
     salary=0;
  System.out.println("The Salary of the employee is: "+salary);
  }
}
