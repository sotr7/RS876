package com.jagex;

import com.jagex.Class10;
import com.jagex.Class425;
import com.jagex.Class526_Sub24;
import com.jagex.Class526_Sub29_Sub1;
import com.jagex.Class566;
import com.jagex.Class618;
import com.jagex.Class646;
import java.awt.Point;
import java.util.Queue;

public class Class46 {
   int anInt640;
   int anInt641;
   public static int anInt642;

   static void method927(int var0) {
      Queue var1 = Class646.aQueue8451;
      synchronized(var1) {
         Point var2;
         if(Class425.aCanvas4798.isShowing()) {
            var2 = Class425.aCanvas4798.getLocationOnScreen();
         } else {
            var2 = null;
         }

         while(true) {
            while(true) {
               Class526_Sub29_Sub1 var3 = (Class526_Sub29_Sub1)Class646.aQueue8451.poll();
               if(var3 == null) {
                  return;
               }

               if(null != var2 && Class425.aCanvas4798.isShowing() && Class10.aBool64) {
                  var3.method10653(var2, (byte)0);
                  if(!var3.method10652((byte)127) && var3.method9527((byte)86) < Class566.anInt7611 * 1895615023 && var3.method9530(1762748637) < 974996221 * Class526_Sub24.anInt10549 && var3.method9527((byte)108) >= 0 && var3.method9530(1762748637) >= 0) {
                     int var4 = var3.method9528((byte)-2);
                     if(var3.method9528((byte)-48) == -1) {
                        Class646.aClass654_Sub1_8450.method7814(var3, 1367916571);
                     } else if(Class618.method7326(var4, (byte)-86)) {
                        Class646.aClass654_Sub1_8450.method9884(var3, (byte)32);
                     }
                  }
               } else {
                  var3.method9533((byte)-70);
               }
            }
         }
      }
   }
}
