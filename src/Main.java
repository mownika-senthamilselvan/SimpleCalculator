import java.util.Scanner;

public class Main {
    private static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean continueCalculation=true;

        while(continueCalculation){
            System.out.println("choose the operation want to perfrom");
            char operation=sc.next().charAt(0);

            double result=getInputNumber(operation);
            System.out.println(result);

            System.out.println("Do you want to continue yes or no");
            String choice=sc.next();
            continueCalculation=choice.equalsIgnoreCase("yes");

        }

        System.out.println("Thank you for using the calculator");
    }

    private static double getInputNumber(char operation) {
        boolean input=true;
        double total=0;
        String num;

        while(true){
            System.out.println("Enter the Number");
            num=sc.next();

             if(num.equalsIgnoreCase("stop")){
                 break;
             }

             try {
                 double number = Double.parseDouble(num);
                 total=perfromOperation(total,number,operation);
             } catch (NumberFormatException e) {
                 System.out.println("Invalid number");
             }
        }
        return total;
    }

    static double perfromOperation(double total,double number , char operation){
      Caculator calculator=new PerfromCalculation();
      switch (operation) {
          case '+':
              return calculator.add(total, number);
          case '-':
              return calculator.sub(total, number);
          case '*':
              return calculator.mul(total, number);
          case '/':
              return calculator.div(total, number);
          default:
              throw new IllegalArgumentException("Invalid operation");
      }

    }



}
