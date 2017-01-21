package com.jagex;

import com.jagex.Class187;
import com.jagex.Class206;
import com.jagex.Class230;
import com.jagex.Class26;
import com.jagex.Class27;
import com.jagex.Class290;
import com.jagex.Class291;
import com.jagex.Class309;
import com.jagex.Class33;
import com.jagex.Class388;
import com.jagex.Class40_Sub8;
import com.jagex.RSByteBuffer;
import com.jagex.Class594;
import com.jagex.Class610;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class652;
import com.jagex.Class681;
import com.jagex.Class704_Sub2_Sub1;
import com.jagex.Interface76;

public class Class640 implements Interface76 {
   static String aString8347;
   public static Class640 aClass640_8345 = new Class640(0);
   static Class640 aClass640_8344 = new Class640(1);
   static Class640 aClass640_8342 = new Class640(2);
   static Class640 aClass640_8341 = new Class640(3);
   static Class640 aClass640_8343 = new Class640(4);
   int anInt8346;

   public int getId() {
      return 2141628149 * this.anInt8346;
   }

   Class640(int var1) {
      this.anInt8346 = 1060001117 * var1;
   }

   public int method21() {
      return 2141628149 * this.anInt8346;
   }

   static final void method7636(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      String var3 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      boolean var4 = 1 == var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class187.method2729(var2, var3, var4, -952467138);
   }

   public static final int method7637(Class40_Sub8 var0, byte[] var1, int var2, int var3, int var4, int var5, Class652 var6, Class652 var7, int var8) {
      int var9 = 0;
      RSByteBuffer var10 = new RSByteBuffer(var1);
      int var11 = -1;

      label65:
      while(true) {
         int var12 = var10.method9683((byte)3);
         if(var12 == 0) {
            return var9;
         }

         var11 += var12;
         int var13 = 0;
         boolean var14 = false;

         while(true) {
            int var15;
            while(!var14) {
               var15 = var10.readSmart(-1417883877);
               if(var15 == 0) {
                  continue label65;
               }

               var13 += var15 - 1;
               int var16 = var13 & 63;
               int var17 = var13 >> 6 & 63;
               int var18 = var10.readUnsignedByte(-1940279615) >> 2;
               int var19 = var18 & 3;
               var18 >>= 2;
               int var20 = var2 + var17;
               int var21 = var3 + var16;
               Class610 var22 = (Class610)var0.method89(var11, -1643215375);
               int var23;
               int var24;
               if(0 == (var19 & 1)) {
                  var23 = var22.anInt7993 * -1450399027;
                  var24 = 182793117 * var22.anInt7971;
               } else {
                  var23 = var22.anInt7971 * 182793117;
                  var24 = -1450399027 * var22.anInt7993;
               }

               if(var20 < var4 && var21 < var5 && var23 + var20 >= 0 && var24 + var21 >= 0 && (var18 != -1226971375 * Class594.aClass594_7843.anInt7833 || Class230.preferences.aClass711_Sub11_10609.method9948((byte)44) != 0 || 0 != 909601847 * var22.anInt7954 || -1196711325 * var22.anInt7953 == 1 || var22.aBool7985)) {
                  if(!var22.method7175(var7, -198483229)) {
                     var6.anInt8464 = var11 * -640524961;
                     ++var9;
                  }

                  var14 = true;
               }
            }

            var15 = var10.readSmart(-1291372513);
            if(var15 == 0) {
               break;
            }

            var10.readUnsignedByte(1548207628);
         }
      }
   }

   public static void method7638(Class639_Sub1_Sub2_Sub1 var0, int[] var1, int[] var2, int[] var3, int var4) {
      for(int var5 = 0; var5 < var1.length; ++var5) {
         int var6 = var1[var5];
         int var7 = var3[var5];
         int var8 = var2[var5];

         for(int var9 = 0; 0 != var7 && var9 < var0.aClass704_Sub2_Sub1Array11916.length; var7 >>>= 1) {
            if(0 != (var7 & 1)) {
               if(var6 == -1) {
                  var0.aClass704_Sub2_Sub1Array11916[var9] = null;
               } else {
                  Class206 var10 = (Class206)Class388.aClass40_Sub15_4063.method89(var6, 392446430);
                  int var11 = 1945727809 * var10.anInt2238;
                  Class704_Sub2_Sub1 var12 = var0.aClass704_Sub2_Sub1Array11916[var9];
                  if(null != var12 && var12.method8218((byte)-79)) {
                     if(var6 == var12.method8220(-2079276214)) {
                        if(var11 == 0) {
                           var0.aClass704_Sub2_Sub1Array11916[var9] = null;
                           var12 = null;
                        } else if(var11 == 1) {
                           var12.method8236(-1730576285);
                           var12.anInt11884 = var8 * 494277197;
                        } else if(var11 == 2) {
                           var12.method8235((byte)100);
                        }
                     } else if(var10.anInt2234 * 345143167 >= var12.method8219((byte)31).anInt2234 * 345143167) {
                        var0.aClass704_Sub2_Sub1Array11916[var9] = null;
                        var12 = null;
                     }
                  }

                  if(null == var12 || !var12.method8218((byte)-55)) {
                     var12 = var0.aClass704_Sub2_Sub1Array11916[var9] = new Class704_Sub2_Sub1(var0);
                     var12.method8246(var6, (byte)-87);
                     var12.anInt11884 = 494277197 * var8;
                  }
               }
            }

            ++var9;
         }
      }

   }

   static void method7639(int var0) {
      if(Class27.aClass296_250 != null) {
         Class309.aClass290_3377 = new Class290();
         Class309.aClass290_3377.method3829(Class33.aLong368 * -2499719659792198973L, Class27.aClass296_250.aClass45_3212.method920(Class26.aClass673_247, -827840379), Class27.aClass296_250.aClass45_3212.method920(Class26.aClass673_247, -827840379), -1716976061 * Class27.aClass296_250.anInt3214, Class27.aClass296_250, 1101753182);
         Class291.aThread3134 = new Thread(Class309.aClass290_3377, "");
         Class291.aThread3134.start();
      }
   }
}
