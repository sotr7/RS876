package com.jagex;

import com.jagex.Class1;
import com.jagex.Class152;
import com.jagex.Class153;
import com.jagex.Class202;
import com.jagex.Class203;
import com.jagex.Class425;
import com.jagex.Class466;
import com.jagex.Class554;
import com.jagex.Class700;
import com.jagex.Interface2;
import java.awt.Container;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public abstract class Class176 {
   static void method2655(String var0, int var1) {
      Class203.aClass700_2214 = Class700.aClass700_8775;
      Class202.aString2212 = var0;
   }

   public static Class1 method2656(Class466 var0, int var1, Interface2 var2, int var3) {
      byte[] var4 = var0.method5541(var1, 16777472);
      return null == var4?null:new Class1(var4, var2);
   }

   static Class153 method2657(byte[] var0, byte var1) {
      if(null == var0) {
         throw new RuntimeException("");
      } else {
         while(true) {
            try {
               Image var2 = Toolkit.getDefaultToolkit().createImage(var0);
               Container var3 = Class152.method1757((byte)-62);
               MediaTracker var4 = new MediaTracker(var3);
               var4.addImage(var2, 0);
               var4.waitForAll();
               int var5 = var2.getWidth(var3);
               int var6 = var2.getHeight(var3);
               if(!var4.isErrorAny() && var5 >= 0 && var6 >= 0) {
                  int[] var7 = new int[var5 * var6];
                  PixelGrabber var8 = new PixelGrabber(var2, 0, 0, var5, var6, var7, 0, var5);
                  var8.grabPixels();
                  return Class554.aClass174_7475.method2515(var7, 0, var5, var5, var6, (byte)3);
               }

               throw new RuntimeException("");
            } catch (InterruptedException var9) {
               ;
            }
         }
      }
   }

   public static void method2658(int var0) {
      Class425.anInt4796 = 0;
      Class425.anInt4795 = 0;
   }
}
