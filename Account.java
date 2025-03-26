class Account{
    public int accountNumber;
    public String customerName;
    private double Balance;
    private static float rateOfInterest;
    
    public void setaccountNumber(int aN){
        accountNumber=aN;
    }
    public void setcustomerName(String cN){
        customerName = cN;
    }
    private void setBalance(double balance) {
        Balance = balance;
    }
    private static void setrateOfInterest(float roI){
        rateOfInterest=roI;
    }
    public int getaccountNumber(){
        return accountNumber;
    }
    public String getcustomerName(){
        return customerName;
    }
    private double getbalance(){
        return Balance;
    }
    private static float getrateOfInterest(){
        return rateOfInterest;
    }
    public double getsimpleinterest(int time){
        return Balance*rateOfInterest*time/100.0;
    }
    public static void main(String[] args) {
      Account a1 = new Account();
      a1.setaccountNumber(250);
      a1.setcustomerName("Waleedkhan");
      a1.setBalance(25550);
      a1.setrateOfInterest(5);
      System.out.println();
      System.out.println("Account number: "+a1.getaccountNumber());
      System.out.println("Customername: "+a1.getcustomerName());
      System.out.println("Balance: "+a1.getbalance());
      System.out.println("Simple interest: "+a1.getsimpleinterest(2));
    }
}