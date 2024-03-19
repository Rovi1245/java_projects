public class pizza {
    private int price;
    private Boolean veg;
    private int extracheeseprice = 100;
    private int extratopingsprice = 50;
    private int takeawayprice = 20;
    private int baseprice;
    private boolean isextracheeseadded = false;
    private boolean isextratopingsadded = false;
    private boolean istakeawayopted = false;

    public pizza(Boolean veg)
    {
        this.veg = veg;
        if(this.veg)
        {
            this.price = 300;
        }
        else
        {
            this.price = 400;
        }
        baseprice = this.price;
    }

   public void addExtraCheese()
   {
       isextracheeseadded = true;
     System.out.println("Extra Cheese added!");
     this.price += extracheeseprice;
   }

   public void addExtraTopings()
   {
       isextratopingsadded = true;
     System.out.println("Extra topings added!");
     this.price += extratopingsprice;
   }

   public void addTakeAway()
   {
       istakeawayopted = true;
       System.out.println("TakeAway added!");
       this.price += takeawayprice;

   }

   public void getbill()
   {
      String bill = "";
      System.out.println("pizza: " +baseprice);
      if(isextracheeseadded)
      {
        bill += "Extra cheese added: "+extracheeseprice+ "\n";
      }
       if(isextratopingsadded)
       {
           bill += "Extra topings added: "+extratopingsprice+ "\n";
       }
       if(istakeawayopted)
       {
           bill += "Opted for takeaway: "+takeawayprice+ "\n";
       }
       bill += "Total bill: "+ this.price+ "\n";
       System.out.println(bill);
   }





}
