package com.miscleneous.program;



 public class IHSMarkit {



   public static void main(String[] args) {

               System.out.print("and the value is " + getValue());

   }



   private static int getValue() {

               try {

                           String s = "5.6";

                         Integer.parseInt(s);

                           return 1;

               } catch (Exception e) {

                           System.out.print("Exception catched: "+e);

                           return 2;

               } finally {

                           System.out.print("The finally clause is executed ");

                           return 3;

               }

   }

 }


