package employewagecomputation;

public class DailyWage {
    public static void main(String args[]) {
      System.out.println("Welcome to the Employee Wage Computation");
      int isPresent = 1, wagePerHour = 20, isFullTime = 8;
      int value = (int) Math.floor(Math.random()*10) % 2;
      if (value == isPresent){
          System.out.println("Employee is Present: " +value);
          System.out.println("Daily Employee Wage: " + (isFullTime * wagePerHour));
      }
      else{
          System.out.println("Employee is Absent: " +value);
      }
    }
}