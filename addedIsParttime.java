package employewagecomputation;

public class addedIsParttime {

    public static final int isFullTime = 0;
    public static final int isPartTime = 1;

    public static void main(String args[]) {
        
      System.out.println("Welcome to the Employee Wage Computation");
      
      int isPresent = 1, wagePerHour = 20, workingHours = 0;
      
      int value = (int) Math.floor(Math.random()*10) % 2;
      
      if (value == isPresent){
          
         int empcheck = (int) Math.floor(Math.random()*10) % 2;
                
                switch (empcheck){

                    case isFullTime:
                        workingHours = 8;
                        System.out.println("Employee isFullTime: ");
                        break;
                      
                    case isPartTime:
                        workingHours = 4;
                        System.out.println("Employee isPartTime: ");
                        break;
                    
                }
                 System.out.println("Daily Employee Wage: " + (workingHours * wagePerHour));
      }
      else{
          System.out.println("Employee is Absent: ");
      }
    }
}