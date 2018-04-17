package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import java.io.Serializable;

public class Card1 extends Card implements Serializable {

    private static final long serialVersionUID = 1L;

    //public class evento();
 public void evento(int dia){
     
     switch(dia){
         case 1:
             System.out.println("dia1");
             break;
         case 2:
                          System.out.println("dia2");
             break;
         case 3:
             break;
     }
}
}
