// Lab3
// Name: Portfolio
// Develop by: Jose Nieto (Partially)
// <summary>
//  This class porfolio will hold some calculation for array of stocks. This will include a counter for the array of stacks,
//  a counter for the value of all the portfolio, will set the value (Static value/initial value) for the stocks, and also
//  update the value for the portfolio
// </summary>
import java.util.Random;
public class Portfolio {

  //Array of Stocks objects
  Stock[] stocks;

  // create the array and create the individual stocks with the initial values
  public Portfolio(int numberOfStocks){
        Stock[] temp = new Stock[numberOfStocks];

      //This will set the number of the purchase and current price to 100$ USD
      for (int i = 0; i < temp.length; i++){
          temp[i].setPurchasePrice(100);
          temp[i].setCurrentPrice(100);
          temp[i].setNumShares(10000/temp.length);
      }

  }


 //Return the sum/value of all stocks in the array for this portfolio
 public double totalValue(Stock[] stocks){
     //This is a temporal Stock-type variable to hold the values and then return them
     Stock temp = new Stock();
     //Initialize the sum double-type variable, this will get into a for loop to sum each element of the array
     double sum = 0;

     for (int i = 0; i < stocks.length; i++){
        sum += temp.getCurrentPrice();
     }

     return sum;
 }
    
  //Updates all after one year
  public void update(){
      for (int i = 0; i < stocks.length; i++){
          stocks[i].updateValue();
      }

  }


}