package com.jagex;

import com.jagex.Class153;
import com.jagex.Class219;
import com.jagex.NPCDef;
import com.jagex.Class32;
import com.jagex.Class40_Sub13;
import com.jagex.Class462;
import com.jagex.Class499;
import com.jagex.Class525_Sub1;
import com.jagex.Class526;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class573;
import com.jagex.Class681;
import com.jagex.RuntimeException_Sub4;
import java.io.IOException;

public class Class294 {
   static Class153[] aClass153Array3188;
   public static Class40_Sub13 aClass40_Sub13_3189;
   public int[] anIntArray3185;
   float[] aFloatArray3187;
   int[][] anIntArrayArray3184;
   int[][] anIntArrayArray3181;
   public short[] aShortArray3186;
   public short[] aShortArray3182;
   public long aLong3183;

   public Class294(NPCDef var1, boolean var2) {
      if(var2) {
         this.anIntArray3185 = new int[var1.models.length];
         this.aFloatArray3187 = new float[var1.models.length];
         this.anIntArrayArray3184 = new int[var1.models.length][3];
         this.anIntArrayArray3181 = new int[var1.models.length][3];
         System.arraycopy(var1.models, 0, this.anIntArray3185, 0, this.anIntArray3185.length);
      } else {
         this.anIntArray3185 = new int[var1.headModels.length];
         this.aFloatArray3187 = new float[var1.headModels.length];
         this.anIntArrayArray3184 = new int[var1.headModels.length][3];
         this.anIntArrayArray3181 = new int[var1.headModels.length][3];
         System.arraycopy(var1.headModels, 0, this.anIntArray3185, 0, this.anIntArray3185.length);
      }

      if(var1.replacementColours != null) {
         this.aShortArray3186 = new short[var1.replacementColours.length];
         System.arraycopy(var1.replacementColours, 0, this.aShortArray3186, 0, this.aShortArray3186.length);
      }

      if(null != var1.replacementTextures) {
         this.aShortArray3182 = new short[var1.replacementTextures.length];
         System.arraycopy(var1.replacementTextures, 0, this.aShortArray3182, 0, this.aShortArray3182.length);
      }

   }

   public Class294(long var1, int[] var3, float[] var4, int[][] var5, int[][] var6, short[] var7, short[] var8) {
      this.aLong3183 = var1 * 4070890070923293839L;
      this.anIntArray3185 = var3;
      this.aFloatArray3187 = var4;
      this.anIntArrayArray3184 = var5;
      this.anIntArrayArray3181 = var6;
      this.aShortArray3186 = var7;
      this.aShortArray3182 = var8;
   }

   public static void method3958(RSByteBuffer var0, byte var1) {
      byte[] var2 = new byte[24];

      try {
         Class499.aClass23_5619.method679(0L);
         Class499.aClass23_5619.method681(var2, -1422843058);

         int var3;
         for(var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
            ;
         }

         if(var3 >= 24) {
            throw new IOException();
         }
      } catch (Exception var5) {
         for(int var4 = 0; var4 < 24; ++var4) {
            var2[var4] = -1;
         }
      }

      var0.method9619(var2, 0, 24, 1572243635);
   }

   public static int method3959(int var0) {
      if(!Class570.aBool7638) {
         return 12;
      } else {
         Class462.method5474(Class554.aClass174_7475, -1451779978);
         return Class570.aTwitchTV7639.Logout();
      }
   }

   public static final void method3960(int var0) {
      if(-1216905875 * Class32.anInt341 != 7) {
         RuntimeException_Sub4.aClass111_12105.method1369(2109830147);
         Class219.method3036(-1901711837);
         Class573.method6918(-757622529);
      }

   }

   static final void method3961(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(Class525_Sub1.aClass20_10724 != null) {
         Class526 var3 = Class525_Sub1.aClass20_10724.get((long)var2);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3 != null?1:0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }
}
