/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double taxRate;
   private double purchase;
   private double taxablePurchase;
   private double payment;
   private double dailyTotal = 0;
   private double dailySales = 0;

   /**
      Constructs a cash register with no money in it.
      @param rate the tax rate for taxable purchases
   */
   public CashRegister(double rate)
   {
      taxRate = rate;
      purchase = 0;
      payment = 0;
   }

   /**
      Records the sale of a tax-free item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
      dailyTotal+=purchase;
      dailySales++;
      
   }

   /**
      Records the sale of a taxable item.
      @param amount the price of the item
   */
   public void recordTaxablePurchase(double amount)
   {
      taxablePurchase = taxablePurchase + amount;
      dailyTotal+=taxablePurchase;
      dailySales++;
   }

   /**
      Processes a payment received from the customer.
      @param amount the amount of the payment
   */
   public void receivePayment(double amount)
   {
      payment = payment + amount;
   }

   /**
      Processes the sales tax due.
      @return the sales tax due
   */
   public double getSalesTax()
   {
      return taxablePurchase * taxRate / 100;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double salesTax = taxablePurchase * taxRate / 100;
	   double change = payment - purchase - salesTax;
      purchase = 0;
      payment = 0;
      return change;
   }
   
   public double getSalesTotal() {
	   return dailyTotal;
   }
   
   public double getSalesCount() {
	   return dailySales;
   }
   
   public void reset() {
	   dailySales = 0;
	   dailyTotal = 0;
   }
}
