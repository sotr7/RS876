package com.jagex;

import com.jagex.Class11;
import com.jagex.Class116;
import com.jagex.Class255;
import com.jagex.Class296;
import com.jagex.Class394;
import com.jagex.Class448_Sub1;
import com.jagex.Class465;
import com.jagex.Class681;
import com.jagex.Class69;
import com.jagex.Class90;
import com.jagex.client;
import java.io.IOException;
import java.net.Socket;
import java.util.Date;

public abstract class Class27 {
   String aString248;
   int anInt249;
   static Class296 aClass296_250;
   public static int anInt251;

   public abstract Socket method719(short var1) throws IOException;

   Socket method720(short var1) throws IOException {
      return new Socket(this.aString248, -1674168277 * this.anInt249);
   }

   public abstract Socket method721() throws IOException;

   public static void method722(String var0, int var1) {
      if(Class116.aStringArray1427 == null) {
         Class394.method4807(641637611);
      }

      client.aCalendar11257.setTime(new Date(Class255.time((byte)24)));
      int var2 = client.aCalendar11257.get(11);
      int var3 = client.aCalendar11257.get(12);
      int var4 = client.aCalendar11257.get(13);
      String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
      String[] var6 = Class69.method1085(var0, '\n', (byte)7);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         for(int var8 = -1674710087 * Class116.anInt1423; var8 > 0; --var8) {
            Class116.aStringArray1427[var8] = Class116.aStringArray1427[var8 - 1];
         }

         Class116.aStringArray1427[0] = var5 + ": " + var6[var7];
         if(Class90.aFileOutputStream863 != null) {
            try {
               Class90.aFileOutputStream863.write(Class465.method5527(Class116.aStringArray1427[0] + "\n", (byte)-56));
            } catch (IOException var9) {
               ;
            }
         }

         if(Class116.anInt1423 * -1674710087 < Class116.aStringArray1427.length - 1) {
            Class116.anInt1423 += -1302715767;
            if(-56413471 * Class116.anInt1424 > 0) {
               Class116.anInt1424 += -658140895;
            }
         }
      }

   }

   static final void method723(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -1227384415)).aBool93?1:0;
   }
}
