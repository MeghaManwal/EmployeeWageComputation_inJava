
public class EmpPartTimeWageUC3 {
 public static void main(String[] args) {
  int is_fulltime=1;
  int is_parttime=2;
  int fulltimeHr=8;
  int parttimeHr=4;
  int salaryPerHr=20;
  double salary=0.0;

  double empCheck=Math.floor(Math.random()*10) % 3;
   if (empCheck ==is_fulltime)
      salary=salaryPerHr*fulltimeHr;
   else if (empCheck==is_parttime)
      salary=salaryPerHr*parttimeHr;
   else
      salary=0;
   System.out.println("The Salary of the employee is: "+salary);
 }
}
