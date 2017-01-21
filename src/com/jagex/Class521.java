package com.jagex;

import com.jagex.Class11;
import com.jagex.Class230;
import com.jagex.Class24;
import com.jagex.Class260;
import com.jagex.Class285;
import com.jagex.Class290;
import com.jagex.Class325;
import com.jagex.Class425;
import com.jagex.Class448_Sub1;
import com.jagex.Class452_Sub2;
import com.jagex.Class454;
import com.jagex.Class465;
import com.jagex.Class526_Sub1;
import com.jagex.Class535;
import com.jagex.Class554;
import com.jagex.Class591;
import com.jagex.Class599;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class9_Sub1;
import com.jagex.client;
import java.awt.Dimension;

public class Class521 {
   public static Class684 aClass684_7051;
   // $FF: synthetic field
   Class535 this$0;

   Class521(Class535 var1) {
      this.this$0 = var1;
   }

   public static Class591[] method6250(int var0) {
      return new Class591[]{Class591.aClass591_7807, Class591.aClass591_7806, Class591.aClass591_7808};
   }

   static final void method6251(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      String var5 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(var3 == -1) {
         throw new RuntimeException();
      } else {
         Class24 var6 = (Class24)Class465.aClass40_Sub17_5321.method89(var3, -228910213);
         if(var6.aClass454_233.getId() != var2) {
            throw new RuntimeException();
         } else if(var6.aClass454_234.getId() != Class454.aClass454_4997.getId()) {
            throw new RuntimeException();
         } else {
            int[] var7 = var6.method702(var5, -1859808892);
            if(var4 >= 0 && var7 != null && var7.length > var4) {
               var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var7[var4];
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   static final void method6252(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class11 var4 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -400189100);
      if(var3 >= 1 && var3 <= 5 && var4.aStringArray94[var3 - 1] != null) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var4.aStringArray94[var3 - 1];
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static void method6253(int var0) {
      if(Class554.aClass174_7475.method2270()) {
         Class554.aClass174_7475.method2251(Class425.aCanvas4798, (byte)8);
         Class290.method3854(-1380188059);
         Dimension var1 = Class425.aCanvas4798.getSize();
         Class554.aClass174_7475.method2249(Class425.aCanvas4798, var1.width, var1.height, 18163540);
         Class554.aClass174_7475.method2252(Class425.aCanvas4798, (byte)95);
      } else {
         Class285.method3799(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-99), false, (byte)25);
      }

      Class9_Sub1.method10244(206323955);
   }

   static final void method6254(int var0, int var1) {
      client.anIntArray11142 = new int[var0];
      client.anIntArray11143 = new int[var0];
      client.anIntArray11279 = new int[var0];
      client.anIntArray11145 = new int[var0];
      client.anIntArray11131 = new int[var0];
   }

   static final void method6255(Class526_Sub1 var0, boolean var1, int var2) {
      if(var0.aBool10310) {
         if(1266354199 * var0.anInt10302 < 0 || Class325.method4181(client.aClass505_11204.method6066(-631188979), 1266354199 * var0.anInt10302, 503928371 * var0.anInt10304, (byte)0)) {
            if(!var1) {
               Class452_Sub2.method9259(var0.anInt10306 * -1761255799, -1514081739 * var0.anInt10299, 195793035 * var0.anInt10301, var0.anInt10298 * 64888215, 1266354199 * var0.anInt10302, var0.anInt10303 * -2005433095, 503928371 * var0.anInt10304, -1, 0, 703033711);
            } else {
               Class260.method3528(-1761255799 * var0.anInt10306, -1514081739 * var0.anInt10299, 195793035 * var0.anInt10301, var0.anInt10298 * 64888215, (Class599)null, 1277872673);
            }

            var0.method6332(-1949449864);
         }
      } else if(var0.aBool10300 && 195793035 * var0.anInt10301 >= 1 && 64888215 * var0.anInt10298 >= 1 && var0.anInt10301 * 195793035 <= client.aClass505_11204.method6056(-1746741811) - 2 && 64888215 * var0.anInt10298 <= client.aClass505_11204.method6057(126749238) - 2 && (var0.anInt10305 * -1915127235 < 0 || Class325.method4181(client.aClass505_11204.method6066(-631188979), -1915127235 * var0.anInt10305, -131891163 * var0.anInt10307, (byte)0))) {
         if(!var1) {
            Class452_Sub2.method9259(-1761255799 * var0.anInt10306, -1514081739 * var0.anInt10299, var0.anInt10301 * 195793035, 64888215 * var0.anInt10298, var0.anInt10305 * -1915127235, var0.anInt10312 * -341852837, var0.anInt10307 * -131891163, -1, 0, 2011432190);
         } else {
            Class260.method3528(var0.anInt10306 * -1761255799, var0.anInt10299 * -1514081739, 195793035 * var0.anInt10301, 64888215 * var0.anInt10298, var0.aClass599_10308, 339292264);
         }

         var0.aBool10300 = false;
         if(!var1 && -1915127235 * var0.anInt10305 == var0.anInt10302 * 1266354199 && -1 == 1266354199 * var0.anInt10302) {
            var0.method6332(-1949449864);
         } else if(!var1 && 1266354199 * var0.anInt10302 == var0.anInt10305 * -1915127235 && var0.anInt10312 * -341852837 == var0.anInt10303 * -2005433095 && var0.anInt10304 * 503928371 == var0.anInt10307 * -131891163) {
            var0.method6332(-1949449864);
         }
      }

   }
}
