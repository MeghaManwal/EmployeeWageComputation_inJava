public class EmpWageTotalHoursUC6 {
 public static void main(String[] args) {
  int is_fulltime=1;
  int is_parttime=2;
  int empHr=0;
  int salaryPerHr=20;
  double salary=0.0;
 for(int day=0;day<20;day++)
{
 for(int Hr=0;Hr<100;Hr++)
{
 double empCheck=Math.floor(Math.random()*10) % 3;
   if (empCheck ==is_fulltime)
      empHr=8;
//salary=salaryPerHr*fulltimeHr;
   else if (empCheck==is_parttime)
      empHr=4;
//salary=salaryPerHr*parttimeHr;
   else
      empHr=0;
salary=salary+(empHr*salaryPerHr);
}
}
  System.out.println("The Salary of the employee is: "+salary);
 }
}
