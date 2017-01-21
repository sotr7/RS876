package com.jagex;

import com.jagex.Class149;
import com.jagex.Class160;
import com.jagex.Class222;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class31;
import com.jagex.Class358;
import com.jagex.Class526_Sub18;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class570;
import com.jagex.Class615;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Interface21;

public class Class108 implements Interface21 {
   int anInt1318;
   int anInt1317;
   int[] anIntArray1319;

   public int method1() {
      return this.anInt1318 * 1413380721;
   }

   Class108(int var1, int var2, int[] var3) {
      this.anInt1318 = var1 * 1084098193;
      this.anInt1317 = -263623033 * var2;
      this.anIntArray1319 = var3;
   }

   public int method95() {
      return this.anInt1317 * -1392249033;
   }

   public int method94() {
      return this.anInt1317 * -1392249033;
   }

   public int method21() {
      return this.anInt1318 * 1413380721;
   }

   Class108(int var1, int var2) {
      this(var1, var2, new int[var2 * var1]);
   }

   public int method90() {
      return this.anInt1318 * 1413380721;
   }

   public int method92() {
      return this.anInt1317 * -1392249033;
   }

   public void method140() {
   }

   public int method8() {
      return this.anInt1317 * -1392249033;
   }

   public int method9() {
      return this.anInt1317 * -1392249033;
   }

   public void method141() {
   }

   static final void method1348(Class681 var0, byte var1) {
      Class358.method4584(1709033903);
   }

   public static boolean method1349(int var0, int var1) {
      return var0 == 9 || var0 == 10 || var0 == 4;
   }

   static void method1350(Class526_Sub21_Sub7 var0, int var1) {
      boolean var2 = false;
      var0.uncache(1699104197);

      for(Class526_Sub21_Sub7 var3 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8143((byte)-1); var3 != null; var3 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8139(68831625)) {
         if(Class160.method1881(var0.method10575((byte)14), var3.method10575((byte)33), 2141015592)) {
            Class222.method3096(var0, var3, (byte)112);
            var2 = true;
            break;
         }
      }

      if(!var2) {
         Class31.aClass696_287.offer(var0, (byte)-65);
      }

   }

   static final void method1351(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      int[] var5 = Class149.method1747(var4, var2, (byte)0);
      if(null != var5) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2620 = Class615.method7280(var4, var2, -625963487);
      var0.anIntArray2621 = var5;
      var0.aBool2560 = true;
   }

   public static void method1352(NPC var0, byte var1) {
      for(Class526_Sub18 var2 = (Class526_Sub18)Class526_Sub18.aClass702_10482.method8206((byte)30); null != var2; var2 = (Class526_Sub18)Class526_Sub18.aClass702_10482.method8181(1590932103)) {
         if(var2.aClass639_Sub1_Sub2_Sub1_Sub2_10495 == var0) {
            if(null != var2.aClass482_10506) {
               var2.aClass482_10506.method5770(100, -938617916);
               Class570.aClass231_7657.method3204(var2.aClass482_10506, -500884606);
               var2.aClass482_10506 = null;
            }

            var2.method6332(-1949449864);
            return;
         }
      }

   }
}
