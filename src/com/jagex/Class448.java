package com.jagex;

import com.jagex.Class115;
import com.jagex.Class174;
import com.jagex.OutFrame;
import com.jagex.Class462;
import com.jagex.OutFrameBuffer;
import com.jagex.Class549;
import com.jagex.Class594;
import com.jagex.Class614;
import com.jagex.Class619;
import com.jagex.Class666;
import com.jagex.Class681;
import com.jagex.client;
import java.util.Iterator;

public abstract class Class448 {
   static int anInt4922;

   abstract void method5322(int var1, int var2);

   abstract void method5323(int var1);

   abstract Class462 method5324(int var1);

   abstract byte[] method5325(int var1, byte var2);

   abstract int method5326(int var1, int var2);

   abstract Class462 method5327();

   abstract int method5328(int var1);

   abstract Class462 method5329();

   abstract int method5330(int var1);

   static final void method5331(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var0.aClass348_8633.aStringArray3641[var2];
   }

   public static void method5332(Class549 var0, Class174 var1, int var2) {
      Iterator var3 = Class619.aList8112.iterator();

      while(var3.hasNext()) {
         Class614 var4 = (Class614)var3.next();
         if(var4.aBool8085) {
            var4.method7262(var0, var1);
         }
      }

   }

   static final void method5333(Class681 var0, int var1) {
      var0.anInt8625 -= 2019513325;
      var0.anInt8623 -= -1578695711;
      String var2 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629];
      boolean var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285] == 1;
      boolean var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1] == 1;
      boolean var5 = 1 == var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      OutFrameBuffer var6 = Class115.method1414(OutFrame.aClass405_4281, client.aClass111_11059.aClass14_1342, 1610163187);
      var6.out.writeShort(Class594.method7039(var2, -1608580439) + 1, -805078716);
      var6.out.method9616(var2, 353235205);
      int var7 = 0;
      if(var3) {
         var7 |= 1;
      }

      if(var4) {
         var7 |= 2;
      }

      if(var5) {
         var7 |= 4;
      }

      var6.out.writeByte(var7, -440480108);
      client.aClass111_11059.write(var6, (byte)82);
   }

   public static String method5334(byte[] var0, int var1, int var2, int var3) {
      char[] var4 = new char[var2];
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var0[var1 + var6] & 255;
         if(0 != var7) {
            if(var7 >= 128 && var7 < 160) {
               char var8 = Class666.aCharArray8526[var7 - 128];
               if(var8 == 0) {
                  var8 = 63;
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }
}
