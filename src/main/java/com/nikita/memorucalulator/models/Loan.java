package com.nikita.memorucalulator.models;

public class Loan {
    private String cus_name;
    private String ad_name;
    private Long p_amount;
    private Long in_rate;
    private Long year;

    public int calculatInterest(int p_amount,int year,int int in_rate){
        int interest=(p_amount*year*in_rate)/100;
        return interest;

    }
    public int totalAmount() {

        int totalamount = p_amount + interest;
    }
    public loan createFunction(int p_amount,int year,int in_rate,int cus_id) {
        Loan loan = new Loan();
        loan.setp_amount(p_amount);
        loan.setyear(year);
        loan.setcus_id(id);
        loan.setin_rate(in_rate);
        return loan;
    }

        //missing functionality
        // intrest;
        // emi
        //total amount
    public Getfunction getfunction(){







    }
}
