import java.text.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Simulation {
  
  public static void main(String[]args){

    // variables
      DecimalFormat df = new DecimalFormat("#.####");
      Scanner sc = new Scanner(System.in);
      double[] portfolios = new double[30];
      double yearTotalValue = 0;
      double max = 0;
      double min = 0;

      System.out.println("Please set a number of stocks: \n");
      int selection = sc.nextInt();
      // loop for the required number of experiments
      for(int i = 0; i < 100; i++ ) {

          //New portfolio por each iteration
          Portfolio p1 = new Portfolio(selection);
          //Reset the final sum
          yearTotalValue = 0;

          //Year of the stocks
          for (int j = 0; j < 30; j++){
              p1.update();

              //sum the total values
              yearTotalValue += p1.totalValue();

              //Check where is the max value and the min value
              if(min == 0){
                  min = p1.totalValue();
              }
              else if(min > p1.totalValue()){
                  min = p1.totalValue();
              }
              if(max == 0){
                  max = p1.totalValue();
              }
              else if(max < p1.totalValue()){
                  max = p1.totalValue();
              }
              System.out.println("Average => " + df.format(yearTotalValue/100));
              System.out.println("Min => " + df.format(min));
              System.out.println("Max => " + df.format(max));
              System.out.println("Percent of change: " + df.format(((min/max)*100))+"%");
              System.out.println("---------------------------------");
          }

      }

  }
}
/*
* -- Observation ---
*
* My Observations about the experiment being looped 100 times and the results on it that
* are during 30 years are that the averages, min and max can change depending on a single
* mathematical operation, which is the update calculation. Because the given operation in the
* Stock class (for each individual in the array) ( UpdateValue ) contains a Random number on the
* multiplication between factors like the current price and number of shares, the final average
* changes. If we can think of this like 100 people having stocks during a 30 years period at same
 * initial value we can observe that some of the investors can have different averages and earnings
 * When different stocks are given, like 1 or 5, it increases the value of them. When 5 stocks
 * are given the values are certainly high, however when 10 or 100 is given, the values goes even
  * further. The conclusion is that more stocks more earning the investor will have, also this
  * includes all the updated values that can go better than other investors.
  *
* */