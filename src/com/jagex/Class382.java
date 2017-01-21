package com.jagex;

import com.jagex.Class208;
import com.jagex.Class221;
import com.jagex.Class23;
import com.jagex.InterfaceDef;
import com.jagex.Class286;
import com.jagex.Class33;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class394;
import com.jagex.Class413;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class553;
import com.jagex.Class553_Sub1;
import com.jagex.Class679;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Interface45;
import java.awt.Component;

public class Class382 implements Interface45 {
   public String aString3952;
   public Class384 aClass384_3945;
   public Class389 aClass389_3946;
   public int anInt3947;
   public int anInt3951;
   public int anInt3949;
   public int anInt3953;
   public int anInt3956;
   public int anInt3950;
   public int anInt3944;
   public int anInt3954;
   public int anInt3955;
   public int anInt3948;

   public Class394 method345() {
      return Class394.aClass394_4105;
   }

   public Class394 method346(int var1) {
      return Class394.aClass394_4105;
   }

   Class382(String var1, Class384 var2, Class389 var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      this.aString3952 = var1;
      this.aClass384_3945 = var2;
      this.aClass389_3946 = var3;
      this.anInt3947 = -239025431 * var4;
      this.anInt3951 = var5 * 401562977;
      this.anInt3949 = var6 * 1844338523;
      this.anInt3953 = 1854798713 * var7;
      this.anInt3956 = 68180977 * var8;
      this.anInt3950 = -1102209687 * var9;
      this.anInt3944 = var10 * -1813102051;
      this.anInt3954 = var11 * 779070277;
      this.anInt3955 = var12 * -2010895841;
      this.anInt3948 = var13 * -1708126459;
   }

   public static Class553 method4713(Component var0, int var1) {
      return new Class553_Sub1(var0);
   }

   static final void method4714(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      byte[] var2 = new byte[]{(byte)var0.anIntArray8622[-1730576285 * var0.anInt8623]};
      byte[] var3 = new byte[]{(byte)var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1]};
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2];
      InterfaceDef var5 = Class221.method3095(var4, (byte)-51);
      Class23.method693(var5, var2, var3, var0, (byte)23);
   }

   static final void method4715(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1681327621 * var3.anInt2524;
   }

   static final void method4716(Class681 var0, byte var1) {
      Class413.method4924(true, 1498950531);
   }

   static final void method4717(Class681 var0, byte var1) {
      Class286.method3803(-1896830157);
   }

   static final void method4718(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class208.method2934((byte)-60);
      if(null != var3) {
         boolean var4 = var3.method10717(var2 >> 28 & 3, var2 >> 14 & 16383, var2 & 16383, Class680.anIntArray8612, 1681885965);
         if(var4) {
            Class33.method813(Class680.anIntArray8612[1], Class680.anIntArray8612[2], (short)1319);
         }
      }

   }
}
