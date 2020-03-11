package com.epam.design_pats;
public class TestSingletonPattern1 {
   public static void main(String[] args) {
      MySingleton s1=MySingleton.getInstance();
      MySingleton s2=MySingleton.getInstance();
   }
}