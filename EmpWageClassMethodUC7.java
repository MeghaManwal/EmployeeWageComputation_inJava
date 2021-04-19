
public class EmpWageClassMethodUC7 {

  public static final int is_fulltime=1;
  public static final int is_parttime=2;
  public static final int no_of_working_days=20;
  public static final int max_Hr_inMonth=100;
  public static final int salaryPerHr=20;

public static int computeEmpWage() {
    int empHr=0;
    int totalEmpHr=0;
    int totalWorkingdays=0;
    while (totalEmpHr <= max_Hr_inMonth && totalWorkingdays < no_of_working_days) {
         totalWorkingdays++;
           int empCheck=(int)Math.floor(Math.random()*10) % 3;
             switch (empCheck) {
                case is_fulltime:      
                  empHr=8;
                 break;
                case is_parttime:
                  empHr=4;
                 break;
                default:
                 empHr=0;
                 break;
              }

          totalEmpHr += empHr;
          System.out.println("Day: "+totalWorkingdays+ "Emp Hr:"+empHr);
     }
    int totalEmpWage= totalEmpHr * salaryPerHr;
     System.out.println("Total Employee Wage: "+totalEmpWage);
     return totalEmpWage;
}

public static void main(String[] args) {
  computeEmpWage();
 }
}
