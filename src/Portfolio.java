// Lab3
// Name: Portfolio
// Develop by: Jose Nieto (Partially)
// <summary>
//  This class porfolio will hold some calculation for array of stocks. This will include a counter for the array of stacks,
//  a counter for the value of all the portfolio, will set the value (Static value/initial value) for the stocks, and also
//  update the value for the portfolio
// </summary>

public class Portfolio {

  //Array of Stocks objects
  Stock[] stocks;


  // create the array and create the individual stocks with the initial values
  public Portfolio(int numberOfStocks){

  }

  //This will count the stocks, it will return the number of stocks. Which is the size of the array of the stocks
  public int countStocks(Stock[] stocks){
      return stocks.length;
  }

  public Stock[] stockPurchasePrice(Stock[] stocks){
    //This is a temporal Stock-type variable to hold the values and then return them
    Stock temp[] = new Stock[stocks.length];

    for (int i = 0; i < stocks.length; i++){
        temp[i].setPurchasePrice(100);
        temp[i].setCurrentPrice(100);
    }
    return temp;
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

  // update each individual stock
  public void update(){
    // implement
  }


}