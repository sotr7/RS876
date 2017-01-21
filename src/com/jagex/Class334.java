package com.jagex;

import com.jagex.Class195;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class255;
import com.jagex.Class298;
import com.jagex.Class307;
import com.jagex.Class315_Sub1;
import com.jagex.Class329_Sub2;
import com.jagex.Class446;
import com.jagex.Class519;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub31;
import com.jagex.LinkableObject;
import com.jagex.Class585;
import com.jagex.Class607;
import com.jagex.NPC;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class689_Sub3;
import com.jagex.Interface76;
import com.jagex.client;

public class Class334 implements Interface76 {
   static Class334 aClass334_3521 = new Class334(10, 1);
   static Class334 aClass334_3516 = new Class334(1, 2);
   static Class334 aClass334_3508 = new Class334(7, 3);
   static Class334 aClass334_3509 = new Class334(3, 4);
   static Class334 aClass334_3520 = new Class334(5, 5);
   static Class334 aClass334_3511 = new Class334(13, 6);
   static Class334 aClass334_3512 = new Class334(0, 7);
   static Class334 aClass334_3513 = new Class334(14, 8);
   static Class334 aClass334_3507 = new Class334(9, 9);
   static Class334 aClass334_3515 = new Class334(4, 10);
   static Class334 aClass334_3506 = new Class334(6, 11);
   static Class334 aClass334_3517 = new Class334(12, 12);
   static Class334 aClass334_3518 = new Class334(8, 13);
   static Class334 aClass334_3519 = new Class334(11, 14);
   static Class334 aClass334_3510 = new Class334(2, 15);
   int anInt3514;
   int anInt3522;

   public int getId() {
      return this.anInt3522 * -329388071;
   }

   Class334(int var1, int var2) {
      this.anInt3514 = -813132073 * var1;
      this.anInt3522 = var2 * -1971740567;
   }

   public int method21() {
      return this.anInt3522 * -329388071;
   }

   static final void method4261(Class681 var0, int var1) {
      if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297 && Class195.aClass292_Sub1_2182.method3940(-1828643508) == Class298.aClass298_3237) {
         Class446 var2 = ((Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(1046683647)).method9112(-618922522);
         Class446 var3 = ((Class689_Sub3)Class195.aClass292_Sub1_2182.method3938((byte)-34)).method10222(-1957887669);
         Class446 var4 = Class446.method5305(var2);
         var4.method5299(var3);
         float var5 = Class585.method6990(var4.aFloat4917, var4.aFloat4919, -1653770443);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)((double)var5 * 2607.5945876176133D) & 16383;
      } else {
         throw new RuntimeException();
      }
   }

   static final void method4262(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class607.anInt7914 * 704354843;
   }

   static final void method4263(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      if(var2.aClass245_8600.componentSlot * 1300712985 == -1) {
         if(var0.aBool8628) {
            throw new RuntimeException("");
         } else {
            throw new RuntimeException("");
         }
      } else {
         InterfaceDef var3 = var2.method8019((byte)-16);
         var3.aClass245Array2662[var2.aClass245_8600.componentSlot * 1300712985] = null;
         Class526_Sub31.method9555(var3, (byte)10);
      }
   }

   static final void method4264(int var0) {
      for(int var1 = 0; var1 < client.npcCount * 1139938345; ++var1) {
         int var2 = client.npcsIndicies[var1];
         LinkableObject var3 = (LinkableObject)client.npcs.get((long)var2);
         if(null != var3) {
            NPC var4 = (NPC)var3.anObject10399;
            Class247.method3399(var4, false, (byte)70);
         }
      }

   }

   static Class526_Sub21_Sub9 method4265(int var0) {
      Class526_Sub21_Sub9 var1 = (Class526_Sub21_Sub9)Class526_Sub21_Sub9.aClass696_11676.method8143((byte)-1);
      if(null != var1) {
         var1.method6332(-1949449864);
         var1.uncache(-1135732807);
         return var1;
      } else {
         do {
            var1 = (Class526_Sub21_Sub9)Class526_Sub21_Sub9.aClass696_11700.method8143((byte)-1);
            if(null == var1) {
               return null;
            }

            if(var1.method10587((short)-2226) > Class255.time((byte)24)) {
               return null;
            }

            var1.method6332(-1949449864);
            var1.uncache(22706650);
         } while((2384869564219888641L * var1.cachedKey & Long.MIN_VALUE) == 0L);

         return var1;
      }
   }

   static final void method4266(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-13);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class519.method6243(var3, var4, var0, 1661010706);
   }
}
