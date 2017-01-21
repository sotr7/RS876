package com.jagex;

import com.jagex.Class114;
import com.jagex.Class152;
import com.jagex.Class196;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class32;
import com.jagex.Class332;
import com.jagex.Class425;
import com.jagex.Class474;
import com.jagex.Class521;
import com.jagex.Class526_Sub24;
import com.jagex.Class526_Sub31;
import com.jagex.Class554;
import com.jagex.Class557;
import com.jagex.Class566;
import com.jagex.Class57;
import com.jagex.Class570;
import com.jagex.Class586;
import com.jagex.Class635;
import com.jagex.Class636;
import com.jagex.Class639_Sub1_Sub5_Sub1;
import com.jagex.NPCDirection;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class711_Sub6;
import com.jagex.Class74;
import com.jagex.Class82;
import com.jagex.Interface76;
import com.jagex.RuntimeException_Sub4;
import com.jagex.client;
import java.awt.Container;
import java.awt.Insets;

public class Class583 implements Interface76 {
   static Class82 aClass82_7781;
   public static int anInt7782;
   static Class583 aClass583_7779 = new Class583(0);
   public static Class583 aClass583_7780 = new Class583(1);
   int anInt7778;

   public int getId() {
      return -893519047 * this.anInt7778;
   }

   public int method21() {
      return -893519047 * this.anInt7778;
   }

   Class583(int var1) {
      this.anInt7778 = 837059337 * var1;
   }

   static final void method6978(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= -1578695711;
      int var4 = var2.anIntArray8622[-1730576285 * var2.anInt8623];
      short var5 = (short)var2.anIntArray8622[1 + -1730576285 * var2.anInt8623];
      short var6 = (short)var2.anIntArray8622[2 + var2.anInt8623 * -1730576285];
      if(var4 >= 0 && var4 < 5) {
         var0.method3357(var4, var5, var6, -1011453743);
         Class526_Sub31.method9555(var0, (byte)10);
         if(var0.componentSlot * 1300712985 == -1 && !var1.aBool2458) {
            Class711_Sub6.method9897(var0.uid * 919258769, var4, (byte)9);
         }

      }
   }

   static final void method6979(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class196.method2831(var2, var3, false, -217416947);
   }

   static final void method6980(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class639_Sub1_Sub5_Sub1.method10829(var2, (byte)-39);
   }

   static final void method6981(Class681 var0, int var1) {
      throw new RuntimeException("");
   }

   static final void method6982(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      Class570.aClass231_7657.method3237(var2, -1721976666);
   }

   static boolean method6983(int var0) {
      Class32.anInt310 = 265638088;
      RuntimeException_Sub4.aClass111_12105 = client.aClass111_11059;
      return Class635.method7556(Class32.aLong313 * -5590316573601377797L == -1L, true, "", "", Class32.aLong313 * -5590316573601377797L);
   }

   static void method6984(byte var0) {
      client var1 = Class636.aclient8310;
      synchronized(var1) {
         if(client.aFrame5603 == null) {
            Container var2 = Class152.method1757((byte)41);
            if(var2 != null) {
               Class332.anInt3505 = var2.getSize().width * -512130579;
               Class586.anInt7792 = var2.getSize().height * -1921704031;
               Insets var3;
               if(Class242.aFrame2454 == var2) {
                  var3 = Class242.aFrame2454.getInsets();
                  Class332.anInt3505 -= (var3.left + var3.right) * -512130579;
                  Class586.anInt7792 -= -1921704031 * (var3.top + var3.bottom);
               }

               if(1405944805 * Class332.anInt3505 <= 0) {
                  Class332.anInt3505 = -512130579;
               }

               if(542147681 * Class586.anInt7792 <= 0) {
                  Class586.anInt7792 = -1921704031;
               }

               if(Class57.method1014(-1236277827) != 1) {
                  Class557.method6712((byte)85);
               } else {
                  Class566.anInt7611 = client.anInt11229 * -325372039;
                  client.anInt5594 = -1896829953 * ((Class332.anInt3505 * 1405944805 - 1969269047 * client.anInt11229) / 2);
                  Class526_Sub24.anInt10549 = 1709014387 * client.anInt11240;
                  client.anInt5605 = 0;
               }

               if(Class684.aClass684_8665 != Class521.aClass684_7051 && Class566.anInt7611 * 1895615023 < 1024 && Class526_Sub24.anInt10549 * 974996221 < 768) {
                  ;
               }

               Class425.aCanvas4798.setSize(1895615023 * Class566.anInt7611, 974996221 * Class526_Sub24.anInt10549);
               if(null != Class554.aClass174_7475) {
                  Class554.aClass174_7475.method2253(Class425.aCanvas4798, Class566.anInt7611 * 1895615023, Class526_Sub24.anInt10549 * 974996221, -2014815565);
                  Class114.method1402(Class554.aClass174_7475, Class255.time((byte)24));
               }

               if(Class242.aFrame2454 == var2) {
                  var3 = Class242.aFrame2454.getInsets();
                  Class425.aCanvas4798.setLocation(var3.left + client.anInt5594 * -1115728897, var3.top + 1208004069 * client.anInt5605);
               } else {
                  Class425.aCanvas4798.setLocation(client.anInt5594 * -1115728897, client.anInt5605 * 1208004069);
               }

               NPCDirection.method7984((byte)108);
               if(client.anInt11186 * -327748687 != -1) {
                  Class474.method5652(true, (short)16865);
               }

               Class74.method1112(-1825906070);
            }
         }
      }
   }
}
