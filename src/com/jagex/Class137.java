package com.jagex;

public class Class137 {
   int anInt1651 = 128;
   int anInt1652 = 128;
   int anInt1653;
   int anInt1654;
   int anInt1655;
   int anInt1656;

   Class137(int var1) {
      this.anInt1653 = var1;
   }

   Class137(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.anInt1653 = var1;
      this.anInt1651 = var2;
      this.anInt1652 = var3;
      this.anInt1654 = var4;
      this.anInt1655 = var5;
      this.anInt1656 = var6;
   }

   void method1639(Class137 var1) {
      this.anInt1651 = var1.anInt1651;
      this.anInt1652 = var1.anInt1652;
      this.anInt1654 = var1.anInt1654;
      this.anInt1655 = var1.anInt1655;
      this.anInt1653 = var1.anInt1653;
      this.anInt1656 = var1.anInt1656;
   }

   Class137 method1640() {
      return new Class137(this.anInt1653, this.anInt1651, this.anInt1652, this.anInt1654, this.anInt1655, this.anInt1656);
   }
}
