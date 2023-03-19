package com.driver;

public class Pizza {

    private int basePrice;
    private int toppingsPrice;
    private int paperbagPrice;
    private String bill;
    private int totalPrice;
    private Boolean isVeg;
    private int extraCheese;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            basePrice=300;
            toppingsPrice= 70;
        }
        else {
            basePrice=400;
            toppingsPrice = 120;
        }
        extraCheese = 80;

        paperbagPrice = 20;

        isCheeseAdded=false;
        isToppingsAdded=false;
        isPaperBagAdded=false;
        totalPrice=basePrice;
        bill="Base Price Of The Pizza: "+ basePrice+ "\n";
    }

    public int getPrice(){

        return totalPrice;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded)
        {
            totalPrice+=extraCheese;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded)
        {
            totalPrice+=toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded)
        {
            totalPrice+=paperbagPrice;
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        if(!isBillGenerated)
        {
//            totalPrice=300;
            if(isCheeseAdded)
            {
                bill=bill + "Extra Cheese Added: " + extraCheese  + "\n";
            }
            if(isToppingsAdded)
            {
                bill= bill + "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(isPaperBagAdded)
            {
                bill = bill + "Paperbag Added: " + paperbagPrice + "\n";
            }
            bill = bill + "Total Price: " + totalPrice + "\n";
            isBillGenerated=true;
        }
//        else
//        {
//            return bill;
//        }
        return bill;
    }
}
