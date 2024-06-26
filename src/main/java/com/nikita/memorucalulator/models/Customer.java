package com.nikita.memorucalulator.models;

public class Customer {
    private int id;
    private String cus_name;
    private String cus_pass;
    private String cus_emil;

    private createCustomer createcustomer(cus_create cus_create){
        Customer customer=new customer();
        customer.setId(cus_create_getId());
        customer.setcus_name(cus_create.getcus_name());
        customer.setcus_pass(cus_create.getcus_pass());
        customer.setcus_email(cus_create.getcus_email());
        return customer;

    }

}
