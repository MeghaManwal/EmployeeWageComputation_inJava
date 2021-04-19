
class empWageObject {
  public static final int is_fulltime=1;
  public static final int is_parttime=2;

  private final String company;
  private int  totalEmpWage;
  private final int no_of_working_days;
  private final int max_Hr_inMonth;
  private final int salaryPerHr;

  public empWageObject(String company, int salaryPerHr, int no_of_working_days, int max_Hr_inMonth) {
  this.company=company;
  this.salaryPerHr=salaryPerHr;
  this.no_of_working_days=no_of_working_days;
  this. max_Hr_inMonth=max_Hr_inMonth;
}

public void computeEmpWage() {
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
     totalEmpWage= totalEmpHr * salaryPerHr;
  }

  @Override
  public String toString() {
  return "Total Emp Wage for company: "+company+"is:"+totalEmpWage;
  }
}

public class EmpWageusingOOPsUC9 {
 public static void main(String[] args) {

   empWageObject dMart=new empWageObject("DMart", 20, 20, 100 );
   dMart.computeEmpWage();
   System.out.println(dMart);

   empWageObject JioMart=new empWageObject("JioMart", 50, 15, 80 );
   JioMart.computeEmpWage();
   System.out.println(JioMart);
 }
}
