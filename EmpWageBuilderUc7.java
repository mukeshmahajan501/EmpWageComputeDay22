import java.util.*;
public class EmpWageBuilderUc7
{
		public static final int IS_FULL_TIME=1;
	    	public static final int IS_PART_TIME=2;

      		public static  int EMP_RATE_PER_HOUR;
		public static  int NUM_OF_WORKING_DAYS;
		public static  int MAX_HR_IN_MONTH;
		public static  String empCompany;


		public EmpWageBuilderUc7(String company,int empRate,int workingHrs,int maxHrs)
		{
			empCompany=company;
			EMP_RATE_PER_HOUR=empRate;
			NUM_OF_WORKING_DAYS=workingHrs;
			MAX_HR_IN_MONTH=maxHrs;
		}

public static void main(String args[])
	{


	EmpWageBuilderUc7 emp=new EmpWageBuilderUc7("DMART",20,20,100);
		int totalEmpHr=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		int empHrs=0;
		while(totalEmpHr<=emp.MAX_HR_IN_MONTH && totalWorkingDays<emp.NUM_OF_WORKING_DAYS)
		{
        		totalWorkingDays++;
        		int empCheck=(int)Math.floor(Math.random() *10 )% 3;
			switch (empCheck)
       			 {
        			case IS_FULL_TIME:
                				empHrs=8;
                				break;
        			case IS_PART_TIME:
                				empHrs=4;
                				break;
        			default:
                				empHrs=0;
        		}

        			totalEmpHr+=empHrs;
       				totalEmpWage=+totalEmpHr*emp.NUM_OF_WORKING_DAYS;
        			System.out.println("Total Working Days: "+totalWorkingDays);
        			System.out.println("total Working Hour:"+totalEmpHr);
		}
       				 System.out.println("Total Employee Wage of "+empCompany+"is: "+totalEmpWage);

	}
}
