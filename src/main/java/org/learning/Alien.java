package com.learning.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

   @Autowired // feild injection
   @Qualifier("factory") //instance variable name
   // @primanry to give more prefernce without choice
   // @qualifier to give the developer the choice to use the obj for dependency

    private Manufacture manu;

    // constructor injection
   // public Alien(Factory factory) {
     //   this.factory = factory;
    //}

 //   @Autowired  //setter injection
 //   public void setFactory(Factory factory) {
   //     this.factory = factory;
   // }


    public void build(){

        manu.check();

        System.out.println("creating candy world !!!");
    }
}
