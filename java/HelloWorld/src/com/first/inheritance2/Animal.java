package com.first.inheritance2;
public interface Animal {
   public void eat();
   public void travel();
}

//인터페이스 구현
class Mammal implements Animal {
   @Override
   public void eat() {
      System.out.println("Mammal eats");
   }
   @Override
   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      Mammal m = new Mammal();
      m.eat();
      m.travel();
   }
}
