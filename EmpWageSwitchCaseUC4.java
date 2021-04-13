
public class EmpWageSwitchCaseUC4 {
  public static void main(String[] args) {
  int is_fulltime=1;
  int is_parttime=2;
  int fulltimeHr=8;
  int parttimeHr=4;
  int salaryPerHr=20;
  double salary=0.0;

  double empCheck=Math.floor(Math.random()*10) % 3;
  int num=(int)Math.round(empCheck);
switch (num) {
      case 1:
      salary=salaryPerHr*fulltimeHr;
      break;
      case 2:
      salary=salaryPerHr*parttimeHr;
      break;
      case 0:
      salary=0;
      break;
     }
  System.out.println("The Salary of the employee is: "+salary);
 }
}

