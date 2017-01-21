package com.jagex;

import com.jagex.Class309;
import com.jagex.Class433;
import com.jagex.Class445;
import com.jagex.Class526_Sub21_Sub13;
import com.jagex.RSByteBuffer;

public class Class526_Sub21_Sub13_Sub2 extends Class526_Sub21_Sub13 {
   float aFloat12080 = 0.0F;

   Class526_Sub21_Sub13_Sub2(int var1, RSByteBuffer var2) {
      super(var1);
      this.aFloat12080 = var2.method9634((byte)1);
   }

   public Class526_Sub21_Sub13_Sub2(int var1, float var2) {
      super(var1);
      this.aFloat12080 = var2;
   }

   public void method10911(float var1, byte var2) {
      this.aFloat12080 = var1;
   }

   public void method10696(float var1, int var2) {
   }

   public void method10692(Class309 var1, Class445 var2, Class433 var3, byte var4) {
      var2.method5237(0.0F, 0.0F, 1.0F, this.aFloat12080);
   }

   public void method10693(RSByteBuffer var1, byte var2) {
      this.aFloat12080 = var1.method9634((byte)1);
   }

   public void method10695(RSByteBuffer var1) {
      this.aFloat12080 = var1.method9634((byte)1);
   }

   public void method10694(Class309 var1, Class445 var2, Class433 var3) {
      var2.method5237(0.0F, 0.0F, 1.0F, this.aFloat12080);
   }

   public void method10690(Class309 var1, Class445 var2, Class433 var3) {
      var2.method5237(0.0F, 0.0F, 1.0F, this.aFloat12080);
   }

   public void method10691(float var1) {
   }
}
