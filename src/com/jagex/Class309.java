package com.jagex;

import com.jagex.Class174;
import com.jagex.Class191;
import com.jagex.Class277;
import com.jagex.Class290;
import com.jagex.Class325;
import com.jagex.Class57;
import com.jagex.Class570;
import com.jagex.Class575;
import com.jagex.Class576;
import com.jagex.Class584;
import com.jagex.Class596;
import com.jagex.Class681;
import com.jagex.client;
import java.util.LinkedList;

public class Class309 {
   public int anInt3374;
   public int anInt3375;
   public int anInt3376;
   public static Class290 aClass290_3377;
   public static int anInt3378;

   public static void method4066(Class174 var0, long var1, int var3, int var4, int var5) {
      int var6;
      if(var0.method2416() && var0.method2352() > -1) {
         var6 = var0.method2352();
         Class575 var7 = null;
         if(!Class570.aLinkedList7649.isEmpty()) {
            var7 = (Class575)Class570.aLinkedList7649.getFirst();
         }

         if(var7 != null && var7.anInt7734 * 1982341413 == var6) {
            Class570.aLinkedList7649.removeFirst();
            var0.method2396();
            boolean var8 = false;
            int var11;
            if(var7.aLinkedList7738.isEmpty() && var0.method2401()) {
               long var9 = var0.method2269(Class570.anInt7645 * 80613351, 518132729 * Class325.anInt3475);
               var11 = Class570.aTwitchTV7639.SubmitFrame(var9, var0.method2265(), Class570.aBool7636, var3, var4);
               var0.method2395(var9);
            } else {
               var0.method2271(80613351 * Class570.anInt7645, Class325.anInt3475 * 518132729, Class584.anIntArray7784, Class191.anIntArray2168);
               Class57.method1011(Class584.anIntArray7784, var7.aLinkedList7738, 1097315483 * var7.anInt7735, var7.anInt7736 * 1032044623, var7.aFloat7737, 582011271);
               var11 = Class570.aTwitchTV7639.SubmitFrameRaw(Class584.anIntArray7784, Class570.aBool7636, var3, var4);
            }

            var0.method2314();
            if(2072 == var11) {
               Class570.aLong7641 = 2064918773935668431L * var1;
            } else if(23 == var11) {
               Class570.aLong7633 = -1664751272028737707L * var1;
            } else if(var11 != -995 && var11 != 0) {
               ;
            }
         } else {
            var0.method2267();
            Class570.aLinkedList7649.clear();
         }
      }

      if(Class570.aBool7644) {
         if(null == Class584.anIntArray7784) {
            Class584.anIntArray7784 = new int[Class570.aBool7636?var4 * var3:518132729 * Class325.anInt3475 * Class570.anInt7645 * 80613351];
            Class191.anIntArray2168 = new int[Class570.aBool7636?var4 * var3:Class325.anInt3475 * 518132729 * 80613351 * Class570.anInt7645];
         }

         if(!var0.method2416()) {
            var0.method2396();
            var0.method2271(80613351 * Class570.anInt7645, 518132729 * Class325.anInt3475, Class584.anIntArray7784, Class191.anIntArray2168);
            Class57.method1011(Class584.anIntArray7784, Class570.aLinkedList7648, var0.anInt2055 * 1228368769, 1714687685 * var0.anInt2039, var0.aFloat2056, -346510463);
            var6 = Class570.aTwitchTV7639.SubmitFrameRaw(Class584.anIntArray7784, Class570.aBool7636, var3, var4);
            var0.method2314();
            Class570.aLinkedList7648.clear();
            if(2072 == var6) {
               Class570.aLong7641 = 2064918773935668431L * var1;
            } else if(23 == var6) {
               Class570.aLong7633 = var1 * -1664751272028737707L;
            } else if(var6 != -995 && 0 != var6) {
               ;
            }
         } else {
            var0.method2268(client.anInt11012, Class570.anInt7645 * 80613351, 518132729 * Class325.anInt3475);
            Class570.aLinkedList7649.add(new Class575(client.anInt11012, Class570.aLinkedList7648, var0.anInt2055 * 1228368769, 1714687685 * var0.anInt2039, var0.aFloat2056));
            Class570.aLinkedList7648 = new LinkedList();
         }

         Class570.aBool7644 = false;
      }
   }

   static final void method4067(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(-1 != var2) {
         int var3 = var2 >> 14 & 16383;
         int var4 = var2 & 16383;
         Class596 var5 = client.aClass505_11204.method6128(2134983017);
         var3 -= -814686591 * var5.localX;
         if(var3 < 0) {
            var3 = 0;
         } else if(var3 >= client.aClass505_11204.method6056(-1746741811)) {
            var3 = client.aClass505_11204.method6056(-1746741811);
         }

         var4 -= var5.localY * -845789331;
         if(var4 < 0) {
            var4 = 0;
         } else if(var4 >= client.aClass505_11204.method6057(126749238)) {
            var4 = client.aClass505_11204.method6057(126749238);
         }

         Class277.anInt3029 = 1852613725 * ((var3 << 9) + 256);
         Class576.anInt7740 = -1775818497 * (256 + (var4 << 9));
      } else {
         Class277.anInt3029 = -1852613725;
         Class576.anInt7740 = 1775818497;
      }

   }
}
