package com.epam.design_pats;
public final class MySingleton {
   private static final MySingleton singleton=new MySingleton();

   private MySingleton(){
      System.out.println("object created...");
   }

   public static MySingleton getInstance(){
      return singleton;
   }
}