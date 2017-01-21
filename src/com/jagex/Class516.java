package com.jagex;

import com.jagex.Class230;
import com.jagex.Class317;
import com.jagex.Class329_Sub2;
import com.jagex.Class508;
import com.jagex.Class522;
import com.jagex.RSSocket;
import com.jagex.Class600;
import com.jagex.Class681;
import com.jagex.Exception_Sub1;
import com.jagex.Interface18;
import com.jagex.client;

public class Class516 {
   public static RSSocket aClass6_7036;
   public int anInt7034;
   public int anInt7033;
   public int anInt7032;
   public int anInt7035;

   Class516(int var1, int var2, int var3, int var4) {
      this.anInt7034 = -941202423 * var1;
      this.anInt7033 = 2026714999 * var2;
      this.anInt7032 = -1609512027 * var3;
      this.anInt7035 = -1957603085 * var4;
   }

   Class516() {
      this.anInt7034 = (32 + (int)(Math.random() * 4.0D)) * -941202423;
      this.anInt7033 = (3 + (int)(Math.random() * 2.0D)) * 2026714999;
      this.anInt7032 = (16 + (int)(Math.random() * 3.0D)) * -1609512027;
      if(Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1) {
         this.anInt7035 = (int)(Math.random() * 6.0D) * -1957603085;
      } else {
         this.anInt7035 = (int)(Math.random() * 12.0D) * -1957603085;
      }

   }

   static final void method6212(Class681 var0, byte var1) throws Exception_Sub1 {
      Class317 var2 = (Class317)var0.aClass526_Sub21_Sub19_8629.anObjectArray11861[var0.anInt8644 * -244840757];
      Interface18 var3 = (Interface18)(0 == var0.anIntArray8642[-244840757 * var0.anInt8644]?var0.aMap8638.get(var2.aClass143_3405.aClass452_1675):var0.aMap8627.get(var2.aClass143_3405.aClass452_1675));

      try {
         var3.method129(var2, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], 164301929);
      } catch (Exception_Sub1 var5) {
         if(!(var3 instanceof Class600)) {
            throw var5;
         }

         Class329_Sub2.method9120(var0, Class508.aClass508_6065, var5, "VO", 1409321102);
      }

   }

   static final void method6213(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub39_10617, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-5859);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static final void method6214(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method6215(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = client.aClass492ArrayArray11265[var3][var2].method5878((byte)-15);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4 == 5?1:0;
   }
}
