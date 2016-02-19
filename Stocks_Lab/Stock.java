package Stocks_Lab;
import java.util.Random;

public class Stock {
  
  private String companyName;
  private String companySymbol;
  private int numShares;
  private double purchasePrice;
  private double currentPrice;
  
  public Stock(String name, String symbol, int shares, double purchase, double current){ 
    // add initializations
  }
  
  //setters for all variables 
  public void setCompanyName(String newName){
    companyName = newName; 
  }

  // add setters for remaining variables
  
  
  //getters for all variables
  public String getCompanyName(){
    return companyName;
  }

  // add getters for remaining variables

  // returns the current value of this stock
  double getCurrentValue(){
    // implement
  }

  // updates the value of the stock as described in the assignment
  public void updateValue(){  
    // implement
  }
}

