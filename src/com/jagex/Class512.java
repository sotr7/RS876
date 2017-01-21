package com.jagex;

import com.jagex.Class27_Sub1;
import com.jagex.Class525;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub35;
import com.jagex.RSByteBuffer;
import com.jagex.Class596;
import com.jagex.Class60;
import com.jagex.Class605_Sub1;
import com.jagex.Class620;
import com.jagex.Class681;
import com.jagex.client;
import java.io.File;
import java.util.Hashtable;

public class Class512 {
   static File aFile7018;
   static boolean aBool7017 = false;
   static Hashtable aHashtable7019 = new Hashtable(16);

   Class512() throws Throwable {
      throw new Error();
   }

   public static String method6183() {
      return aFile7018.getAbsolutePath();
   }

   static final void method6184(Class681 var0, int var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      int var5 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 3];
      Class596 var6 = client.aClass505_11204.method6128(2109640016);
      Class605_Sub1.method9745((var2 >> 14 & 16383) - var6.localX * -814686591, (var2 & 16383) - var6.localY * -845789331, var3 << 2, var4, var5, (byte)-35);
      client.aBool11070 = true;
   }

   static final void method6185(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var2 < 0 || var2 > 1) {
         var2 = 0;
      }

      Class620.method7349(1 == var2, 1989575259);
   }

   static int[] method6186(OutFrameBuffer var0, int var1) {
      RSByteBuffer var2 = new RSByteBuffer(518);
      int[] var3 = new int[4];

      int var4;
      for(var4 = 0; var4 < 4; ++var4) {
         var3[var4] = (int)(Math.random() * 9.9999999E7D);
      }

      var2.writeByte(10, 1035594945);
      var2.writeInt(var3[0], -357564953);
      var2.writeInt(var3[1], -357564953);
      var2.writeInt(var3[2], -357564953);
      var2.writeInt(var3[3], -357564953);

      for(var4 = 0; var4 < 10; ++var4) {
         var2.writeInt((int)(Math.random() * 9.9999999E7D), -357564953);
      }

      var2.writeShort((int)(Math.random() * 9.9999999E7D), -805078716);
      var2.method9651(Class60.RSA_UPDATE_EXPONENT, Class60.LOGIN_MODULUS, (byte)-10);
      var0.out.method9619(var2.buffer, 0, var2.pos * 301018015, 1246598118);
      return var3;
   }

   static final void method6187(Class681 var0, int var1) {
      Class526_Sub35 var2 = Class27_Sub1.method10277(-2022481008);
      if(var2 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anInt10664 * -1572922363;
         int var3 = 325515905 * var2.anInt10663 << 28 | 1427294417 * var2.anInt10665 + Class525.anInt7107 << 14 | var2.anInt10662 * -1722563897 + Class525.anInt7150;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3;
      }

   }
}
