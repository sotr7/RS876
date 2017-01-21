package com.jagex;

import com.jagex.Class11;
import com.jagex.Class210;
import com.jagex.Class317;
import com.jagex.Class322;
import com.jagex.Class439;
import com.jagex.Class487;
import com.jagex.Class547;
import com.jagex.Class596;
import com.jagex.client;

public class Class19 {
   static final int anInt187 = 1;
   static final int anInt188 = 2;
   static final int anInt190 = 8;
   static final int anInt192 = 2;
   static final int anInt193 = 4;
   public int[] anIntArray186 = new int[3];
   public int[] anIntArray189 = new int[3];
   public int[] anIntArray191 = new int[2];
   public int[] anIntArray194 = new int[2];
   public short[] aShortArray195;
   public short[] aShortArray196;

   Class19(Class11 var1) {
      this.anIntArray186[0] = 336005055 * var1.anInt101;
      this.anIntArray186[1] = var1.anInt107 * -354629827;
      this.anIntArray186[2] = var1.anInt105 * -1541563083;
      this.anIntArray189[0] = -604097173 * var1.anInt103;
      this.anIntArray189[1] = var1.anInt104 * -2120012891;
      this.anIntArray189[2] = -490299957 * var1.anInt106;
      this.anIntArray191[0] = 1305047677 * var1.anInt113;
      this.anIntArray191[1] = var1.anInt81 * 2061744057;
      this.anIntArray194[0] = 1143563993 * var1.anInt115;
      this.anIntArray194[1] = 1299296681 * var1.anInt97;
      if(null != var1.aShortArray78) {
         this.aShortArray195 = new short[var1.aShortArray78.length];
         System.arraycopy(var1.aShortArray78, 0, this.aShortArray195, 0, this.aShortArray195.length);
      }

      if(null != var1.aShortArray85) {
         this.aShortArray196 = new short[var1.aShortArray85.length];
         System.arraycopy(var1.aShortArray85, 0, this.aShortArray196, 0, this.aShortArray196.length);
      }

   }

   public static final void method632(byte var0) {
      if(1760635941 * client.anInt11117 != -1 && -1277290801 * client.anInt11118 != -1) {
         int var1 = (1401041029 * client.anInt11121 * (-677542735 * client.anInt11219 - 1298735617 * client.anInt11122) >> 16) + client.anInt11122 * 1298735617;
         client.anInt11121 += var1 * -1828042675;
         if(client.anInt11121 * 1401041029 >= '\uffff') {
            client.anInt11121 = -1253918797;
            if(!client.aBool11074) {
               client.aBool11124 = true;
            } else {
               client.aBool11124 = false;
            }

            client.aBool11074 = true;
         } else {
            client.aBool11124 = false;
            client.aBool11074 = false;
         }

         float var2 = (float)(client.anInt11121 * 1401041029) / 65535.0F;
         float[] var3 = new float[3];
         int var4 = client.anInt11119 * -1273270894;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         for(int var5 = 0; var5 < 3; ++var5) {
            int var6 = client.anIntArrayArrayArray11100[1760635941 * client.anInt11117][var4][var5] * 3;
            var7 = 3 * client.anIntArrayArrayArray11100[1760635941 * client.anInt11117][1 + var4][var5];
            var8 = 3 * (client.anIntArrayArrayArray11100[1760635941 * client.anInt11117][var4 + 2][var5] - (client.anIntArrayArrayArray11100[client.anInt11117 * 1760635941][var4 + 3][var5] - client.anIntArrayArrayArray11100[1760635941 * client.anInt11117][2 + var4][var5]));
            var9 = client.anIntArrayArrayArray11100[client.anInt11117 * 1760635941][var4][var5];
            var10 = var7 - var6;
            var11 = var8 + (var6 - var7 * 2);
            var12 = var7 + (client.anIntArrayArrayArray11100[1760635941 * client.anInt11117][2 + var4][var5] - var9) - var8;
            var3[var5] = var2 * (var2 * ((float)var11 + (float)var12 * var2) + (float)var10) + (float)var9;
         }

         Class596 var18 = client.aClass505_11204.method6128(1959477866);
         Class439.anInt4866 = ((int)var3[0] - -507706880 * var18.localX) * 1307632361;
         Class322.anInt3458 = -1608934313 * (int)var3[1];
         Class210.anInt2259 = -2013648709 * ((int)var3[2] - var18.localY * 747559424);
         float[] var19 = new float[3];
         var7 = client.anInt11208 * 598389074;

         for(var8 = 0; var8 < 3; ++var8) {
            var9 = client.anIntArrayArrayArray11100[-1277290801 * client.anInt11118][var7][var8] * 3;
            var10 = 3 * client.anIntArrayArrayArray11100[client.anInt11118 * -1277290801][var7 + 1][var8];
            var11 = 3 * (client.anIntArrayArrayArray11100[client.anInt11118 * -1277290801][2 + var7][var8] - (client.anIntArrayArrayArray11100[-1277290801 * client.anInt11118][3 + var7][var8] - client.anIntArrayArrayArray11100[client.anInt11118 * -1277290801][var7 + 2][var8]));
            var12 = client.anIntArrayArrayArray11100[-1277290801 * client.anInt11118][var7][var8];
            int var13 = var10 - var9;
            int var14 = var11 + (var9 - 2 * var10);
            int var15 = var10 + (client.anIntArrayArrayArray11100[client.anInt11118 * -1277290801][var7 + 2][var8] - var12) - var11;
            var19[var8] = (float)var12 + var2 * ((var2 * (float)var15 + (float)var14) * var2 + (float)var13);
         }

         float var20 = var19[0] - var3[0];
         float var21 = -1.0F * (var19[1] - var3[1]);
         float var22 = var19[2] - var3[2];
         double var16 = Math.sqrt((double)(var20 * var20 + var22 * var22));
         Class487.anInt5511 = ((int)(Math.atan2((double)var21, var16) * 2607.5945876176133D) & 16383) * -567045205;
         Class317.anInt3410 = ((int)(-Math.atan2((double)var20, (double)var22) * 2607.5945876176133D) & 16383) * -1157073499;
         Class547.anInt7272 = 1696715943 * ((1401041029 * client.anInt11121 * (client.anIntArrayArrayArray11100[client.anInt11117 * 1760635941][var4 + 2][3] - client.anIntArrayArrayArray11100[client.anInt11117 * 1760635941][var4][3]) >> 16) + client.anIntArrayArrayArray11100[1760635941 * client.anInt11117][var4][3]);
      }
   }
}
