//;import java.util.*;
import java.text.*;
import java.text.DecimalFormat;

public class Simulation {
  
  public static void main(String[]args){

    // variables
      Portfolio p1 = new Portfolio(5);
      DecimalFormat df = new DecimalFormat("#.####");


      // loop for the required number of experiments
      for(int j = 0; j < 30; j++ ) {
          System.out.println("Year " + (j+1) + ": " +df.format(p1.totalValue()));
          // update the portfolio for the required number of years
          p1.update();
          // record the max, min, and total values
          // end loop
      }
          // calculate averages

    // print results

  }
}
