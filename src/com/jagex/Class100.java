package com.jagex;

import com.jagex.Class303;
import com.jagex.Class498;
import com.jagex.Class511;
import com.jagex.Class580;
import com.jagex.Interface14;
import com.jagex.client;

public class Class100 {
   static boolean[] aBoolArray1206;
   int anInt1201;
   short aShort1200;
   short aShort1198;
   short aShort1205;
   byte aByte1203;
   byte aByte1202;
   boolean aBool1204;
   int anInt1199;

   Class100(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
      this.anInt1201 = 1166306917 * var1;
      this.aShort1200 = (short)var5;
      this.aShort1198 = (short)var6;
      this.aShort1205 = (short)var7;
      this.aByte1203 = (byte)var8;
      this.aByte1202 = (byte)var9;
      this.aBool1204 = var10;
      this.anInt1199 = 68909111 * var11;
   }

   public static Class498 method1283(int var0, int var1, int var2, int var3, Interface14 var4, Interface14 var5, int var6) {
      Class511[] var7 = null;
      Class580 var8 = (Class580)var4.method89(var0, 37518042);
      if(null != var8.anIntArray7746) {
         var7 = new Class511[var8.anIntArray7746.length];

         for(int var9 = 0; var9 < var7.length; ++var9) {
            Class303 var10 = (Class303)var5.method89(var8.anIntArray7746[var9], -1927321996);
            var7[var9] = new Class511(var10.anInt3270 * 1551108381, 1017288477 * var10.anInt3269, var10.anInt3264 * 18344931, var10.anInt3265 * 1063684195, var10.anInt3266 * -1441147307, var10.anInt3263 * 172535171, var10.anInt3268 * 612085453, var10.aBool3262, var10.anInt3272 * -1641591403, var10.anInt3271 * -1279733363, -632411611 * var10.anInt3267);
         }
      }

      return new Class498(var8.anInt7748 * 859118145, var7, -1953145977 * var8.anInt7747, var1, var2, var3, var8.aClass583_7749, -359223957 * var8.anInt7750);
   }

   public static final void method1284(int var0) {
      client.aBool11047 = true;
   }
}
