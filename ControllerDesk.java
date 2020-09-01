package com.company.controller;

import com.company.entity.Pizza;
import com.company.service.IServiceCommand;


public class ControllerDesk implements  IController{

    // private ServiceCommand serviceCommand = new ServiceCommand();


    public void setiServiceCommand(IServiceCommand iServiceCommand) {
        this.iServiceCommand = iServiceCommand;
    }

    IServiceCommand iServiceCommand;

    public void create(){

        iServiceCommand.placeOrder(iServiceCommand.getPizza());
    }




}
