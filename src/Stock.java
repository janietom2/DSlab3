// Lab3
// Name: Stocks
// Develop by: Jose Nieto (Partially) | Professor/TA (Partially)
// <summary>
//  Stock is a java class that initialize the stock characteristics and some of the functions like sum and update values for
//  and individual stock. It contains getters and setters to initialize values and return them too.
// </summary>

import java.util.Random;

public class Stock {

  //Private Variables
  private String companyName;
  private String companySymbol;
  private int numShares;
  private double purchasePrice;
  private double currentPrice;

  //Constructor
  public Stock(){

  }

  //Constructor with arguments, this will help to fill a constructor with arguments and give variables value
  public Stock(String name, String symbol, int shares, double purchase, double current){
      companyName = name;
      companySymbol = symbol;
      numShares = shares;
      purchasePrice = purchase;
      currentPrice = current;
  }
  
  //setters for all variables
  //This will set the value for each private variable
  public void setCompanyName(String newName){
    companyName = newName; 
  }

  public void setCompanySymbol(String newSymbol){
      companySymbol = newSymbol;
  }

  public void setNumShares(int newShare){
      numShares = newShare;
  }

  public void setPurchasePrice(double newPurchasePrice){
      purchasePrice = newPurchasePrice;
  }

  public void setCurrentPrice(double newCurrentPrice){
      currentPrice = newCurrentPrice;
  }
  
  
  //getters for all variables
  //This will get the value for each private variable
  public String getCompanyName(){
    return companyName;
  }

  public String getCompanySymbol(){
      return companySymbol;
  }

  public int getNumShares(){
      return numShares;
  }

  public double getPurchasePrice(){
      return purchasePrice;
  }

  public double getCurrentPrice(){
      return currentPrice;
  }

  //<summary>
    // returns the current value of this stock
    // This will return the Current Value for the stock by adding Number of shares times the current price
  //</summary>
  double getCurrentValue(){
    //return numShares + currentPrice;
    return getNumShares() * getCurrentPrice();
  }

  // <summary>
    //Generate Percentage change using random numbers. It will update the value of the current stock. This will contain
    //a double variable
  // </summary>
  public void updateValue(){
    double multiplier =  1.05 + (new Random().nextGaussian() * 0.25);
     setCurrentPrice(multiplier);
  }
}

