package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppingsPrice;
    private boolean isCheeseAdded;
    private boolean isPapperBagAdded;
    private boolean isBillGenerated;

    private int cheesePrice;
    private boolean isToppingsAdded;

    private int totalPrice;
    private int paperBagPrice;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here

        if (isVeg){
            this.price=300;
           this.toppingsPrice=70;
        }
        else{
           this.price=400;
            this.toppingsPrice=120;
        }

        bill="Base Price Of The Pizza: "+this.price+"\n";

        this.isCheeseAdded=false;
        this.isToppingsAdded=false;
        this.isPapperBagAdded=false;
        this.isBillGenerated=false;
        this.cheesePrice=80;
        this.totalPrice=this.price;
        this.paperBagPrice=20;

    }

    public int getPrice(){


        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded)
            return;
        totalPrice+=cheesePrice;
        isCheeseAdded=true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded)
            return;

        totalPrice+=toppingsPrice;
        isToppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(isPapperBagAdded)
            return;

        totalPrice+=paperBagPrice;
        isPapperBagAdded=true;


    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {

            if (isCheeseAdded)
                bill += "Extra Cheese Added: " + cheesePrice + "\n";

            if (isToppingsAdded)
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";

            if (isPapperBagAdded)
                bill += "Paperbag Added: " + paperBagPrice + "\n";

            bill += "Total Price: " + totalPrice + "\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
