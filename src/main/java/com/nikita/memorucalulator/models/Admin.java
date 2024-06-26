package com.nikita.memorucalulator.models;

import lombok.Getter;



public class Admin {
    private int id;
    private String ad_name;
    private String ad_pass;

    private CreateAdminm createAdminm(Admincreate admincreate){
        Admin admin=new Admin();
        admin.setId(admincreate.getId());
        admin.setad_name(admincreate.getad_name());
        admin.setad_pass(admincreate.getad_pass());
        return admin;


    }


}
