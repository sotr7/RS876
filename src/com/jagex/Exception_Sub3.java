package com.jagex;

public class Exception_Sub3 extends Exception {
   static int anInt11355;
   public String aString11353;
   public int anInt11354;

   Exception_Sub3(int var1, String var2) {
      this(var1, var2, (Throwable)null);
   }

   Exception_Sub3(int var1, String var2, Throwable var3) {
      super(var3);
      this.aString11353 = var2;
      this.anInt11354 = 1696107397 * var1;
   }
}
