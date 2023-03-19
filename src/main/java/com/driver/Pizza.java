package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese = 70;
    private int totalPrice = 0;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){

        price=totalPrice;
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded)
        {
            totalPrice+=extraCheese;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded && isVeg)
        {
            totalPrice+=70;
            isToppingsAdded=true;
        }
        else if (!isToppingsAdded)
        {
            totalPrice+=120;
            isToppingsAdded=true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded)
        {
            totalPrice+=20;
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg)
        {
            totalPrice+=300;
            System.out.println("Base Price Of The Pizza: "+ 300);
            if(isCheeseAdded)
            {
                System.out.println("Extra Cheese Added: "+ 80);
            }
            if(isToppingsAdded)
            {
                System.out.println("Extra Toppings Added: " + 70);
                totalPrice+=70;
            }
        }
        else {
            totalPrice+=400;
            System.out.println("Base Price Of The Pizza: "+ 400);
            if(isCheeseAdded)
            {
                System.out.println("Extra Cheese Added: "+ 80);
            }
            if(isToppingsAdded)
            {
                System.out.println("Extra Toppings Added: " + 120);
                totalPrice+=70;
            }
        }
        if(isPaperBagAdded)
        {
            System.out.println("Paperbag Added: "+ 20);
        }
        bill="Total Price: ";
        return bill+totalPrice + "\n";
    }
}
