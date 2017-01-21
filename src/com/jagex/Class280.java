package com.jagex;

import com.jagex.Class10;
import com.jagex.Class20;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class271;
import com.jagex.NPCDef;
import com.jagex.Class463;
import com.jagex.Class501;
import com.jagex.Class525;
import com.jagex.Class526_Sub21_Sub10;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class696;
import com.jagex.Class76;
import com.jagex.Class83;
import com.jagex.Interface61;
import java.util.HashMap;
import java.util.Map;

public class Class280 {
   static int anInt3039;
   static int anInt3035 = 0;
   static Map aMap3037 = new HashMap();
   static Class20 aClass20_3036 = new Class20(1024);
   static Class696 aClass696_3038 = new Class696();

   static int method3689() {
      return (anInt3035 += -1249653139) * -946312347 - 1;
   }

   public static int method3690() {
      return anInt3035 * -946312347 - 1;
   }

   Class280() throws Throwable {
      throw new Error();
   }

   public static int method3691(int var0) {
      Class526_Sub21_Sub10 var1 = (Class526_Sub21_Sub10)aClass20_3036.get((long)var0);
      return var1 == null?-1:(var1.aClass526_Sub21_10531 == aClass696_3038.aClass526_Sub21_8758?-1:((Class526_Sub21_Sub10)var1.aClass526_Sub21_10531).anInt11729 * 731545197);
   }

   public static int method3692() {
      return anInt3035 * -946312347 - 1;
   }

   public static int method3693() {
      return anInt3035 * -946312347 - 1;
   }

   public static int method3694(int var0) {
      Class526_Sub21_Sub10 var1 = (Class526_Sub21_Sub10)aClass20_3036.get((long)var0);
      return null == var1?-1:(aClass696_3038.aClass526_Sub21_8758 == var1.aClass526_Sub21_10532?-1:((Class526_Sub21_Sub10)var1.aClass526_Sub21_10532).anInt11729 * 731545197);
   }

   public static int method3695(int var0) {
      Class271 var1 = (Class271)aMap3037.get(Integer.valueOf(var0));
      return var1 == null?0:var1.method3599((byte)37);
   }

   public static void method3696() {
      aMap3037.clear();
      aClass20_3036.method647(929030154);
      aClass696_3038.method8135((byte)-35);
      anInt3035 = 0;
   }

   public static void method3697() {
      aMap3037.clear();
      aClass20_3036.method647(929030154);
      aClass696_3038.method8135((byte)-114);
      anInt3035 = 0;
   }

   public static void method3698() {
      aMap3037.clear();
      aClass20_3036.method647(929030154);
      aClass696_3038.method8135((byte)-8);
      anInt3035 = 0;
   }

   public static int method3699() {
      return anInt3035 * -946312347 - 1;
   }

   static final void method3700(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class242.method3323(var3, var4, var0, (byte)-15);
   }

   static final void method3701(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class83 var4 = (Class83)Class10.aClass40_Sub20_62.method89(var3, -751738319);
      if(var4.method1167(-757870152)) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((NPCDef)Class76.loader.method89(var2, -781773422)).method4052(var3, var4.aString842, -1640264047);
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((NPCDef)Class76.loader.method89(var2, 350438988)).method4051(var3, 1040538721 * var4.anInt843, (byte)59);
      }

   }

   public static void method3702(Interface61 var0, int var1) {
      if(Class501.anInterface61_5632 != null) {
         throw new IllegalStateException("");
      } else {
         Class501.anInterface61_5632 = var0;
      }
   }

   static final void method3703(Class681 var0, int var1) {
      System.out.println(var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629]);
   }

   static final void method3704(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class463.method5476(var3, var4, var0, (short)20477);
   }

   static final void method3705(Class681 var0, int var1) {
      Class526_Sub21_Sub17 var2 = Class525.method6281(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285]);
      if(null != var2 && var2.aString11838 != null) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.aString11838;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }
}
