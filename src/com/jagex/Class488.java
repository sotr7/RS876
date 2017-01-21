package com.jagex;

import com.jagex.Class102;
import com.jagex.Class192;
import com.jagex.Class21;
import com.jagex.Class219;
import com.jagex.InterfaceDef;
import com.jagex.Class294;
import com.jagex.NPCDef;
import com.jagex.Class325_Sub2;
import com.jagex.Class452;
import com.jagex.Class512;
import com.jagex.Class526_Sub21_Sub18;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub32;
import com.jagex.Class526_Sub33;
import com.jagex.RSByteBuffer;
import com.jagex.Class551;
import com.jagex.Class619;
import com.jagex.Class633;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Class91;
import com.jagex.Interface11;
import com.jagex.client;
import java.io.File;
import java.io.IOException;

final class Class488 implements Interface11 {
   public Object method76(RSByteBuffer var1) {
      return new Class526_Sub32(var1);
   }

   public Object method75(RSByteBuffer var1, short var2) {
      return new Class526_Sub32(var1);
   }

   public Object method77(RSByteBuffer var1) {
      return new Class526_Sub32(var1);
   }

   public Object method78(RSByteBuffer var1) {
      return new Class526_Sub32(var1);
   }

   public Object method79(RSByteBuffer var1) {
      return new Class526_Sub32(var1);
   }

   public Object method80(RSByteBuffer var1) {
      return new Class526_Sub32(var1);
   }

   static void method5861(File var0, int var1) {
      Class512.aFile7018 = var0;
      if(!Class512.aFile7018.exists()) {
         throw new RuntimeException("");
      } else {
         Class512.aBool7017 = true;
      }
   }

   static final void method5862(InterfaceDef var0, Class681 var1, int var2) {
      int var3 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285] - 1;
      if(2 != 619744185 * var0.modelType) {
         throw new RuntimeException("");
      } else {
         NPCDef var5 = (NPCDef)Class76.loader.method89(561507777 * var0.anInt2539, 372096003);
         if(var0.aClass294_2677 == null) {
            var0.aClass294_2677 = new Class294(var5, false);
         }

         var0.aClass294_2677.aLong3183 = Class102.method1290(908498662) * 4070890070923293839L;
         if(var4 >= 0 && var4 < var5.headModels.length) {
            var0.aClass294_2677.anIntArray3185[var4] = var3;
            Class526_Sub31.method9555(var0, (byte)10);
         } else {
            throw new RuntimeException("");
         }
      }
   }

   static final void method5863(Class681 var0, int var1) {
      if(null != Class325_Sub2.aClass348_10028) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
         var0.aClass348_8633 = Class325_Sub2.aClass348_10028;
         var0.aMap8638.put(Class452.aClass452_4936, Class219.method3039(var0.aClass348_8633, 1279707834));
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method5864(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3 * var2;
   }

   static final void method5865(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var2 >= 1 && var2 <= 2) {
         Class551.method6647(var2, -1, -1, false, 1260821990);
      }
   }

   public static void method5866(int var0, int var1) {
      Class192 var2 = Class633.aClass192_8256;
      synchronized(var2) {
         Class633.aClass192_8256.method2769(var0, (byte)-90);
      }

      var2 = Class633.aClass192_8239;
      synchronized(var2) {
         Class633.aClass192_8239.method2769(var0, (byte)-12);
      }
   }

   public static Class91 method5867(int var0, byte var1) {
      Class91[] var2 = Class526_Sub21_Sub18.method10730((byte)8);
      Class91[] var3 = var2;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Class91 var5 = var3[var4];
         if(-1121779567 * var5.anInt896 == var0) {
            return var5;
         }
      }

      return null;
   }

   static Class526_Sub33 method5868(int var0) {
      Class21 var1 = null;
      Class526_Sub33 var2 = new Class526_Sub33(client.aClass676_11127, 0);

      try {
         var1 = Class619.method7340("", client.aClass676_11127.aString8591, false, 1149121394);
         byte[] var3 = new byte[(int)var1.method658((byte)-42)];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.method653(var3, var4, var3.length - var4, (byte)73);
            if(var5 == -1) {
               throw new IOException();
            }
         }

         var2 = new Class526_Sub33(new RSByteBuffer(var3), client.aClass676_11127, 0);
      } catch (Exception var7) {
         ;
      }

      try {
         if(null != var1) {
            var1.method651(609626188);
         }
      } catch (Exception var6) {
         ;
      }

      return var2;
   }

   static final int method5869(int var0, int var1) {
      return var0 >> 11 & 127;
   }
}
