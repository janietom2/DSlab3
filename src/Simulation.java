//;import java.util.*;
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
              System.out.println("Average => " + yearTotalValue/100);
              System.out.println("Min => " + min);
              System.out.println("Max => " + max);
              System.out.println("---------------------------------");
          }

      }

  }
}
