/**
 Lab3
 Name: Portfolio
 Develop by: Jose Nieto (Partially)
 <summary>
  This class porfolio will hold some calculation for array of stocks. This will include a counter for the array of stacks,
 a counter for the value of all the portfolio, will set the value (Static value/initial value) for the stocks, and also
  update the value for the portfolio
</summary>
**/
public class Portfolio {

  //Array of Stocks objects
  Stock[] stocks;

  // create the array and create the individual stocks with the initial values
  public Portfolio(int numberOfStocks){
      stocks = new Stock[numberOfStocks];

      //This will set the number of the purchase and current price to 100$ USD
      for(int i = 0; i < stocks.length; i++){
          stocks[i] = new Stock();
          stocks[i].setPurchasePrice(100);
          stocks[i].setCurrentPrice(100);
          stocks[i].setNumShares(10000 / stocks.length);

      }
  }

 //Return the sum/value of all stocks in the array for this portfolio
 public double totalValue(){
     //Initialize the sum double-type variable, this will get into a for loop to sum each element of the array
     double sum = 0;

     //For loop that will sum up the values on a double variable
     for (int i = 0; i < stocks.length; i++){
        sum += stocks[i].getCurrentValue();
     }

     return sum;
 }
    
  //Updates all after one year
  public void update(){
      //For loop will update each array space
      for (int i = 0; i < stocks.length; i++){
          stocks[i].updateValue();
      }

  }

}