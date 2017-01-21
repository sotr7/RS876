package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class45;
import com.jagex.Class526_Sub31;
import com.jagex.Class579;
import com.jagex.Class681;
import com.jagex.Interface65;
import com.jagex.client;

public class Class296 {
   public int anInt3204;
   Class45 aClass45_3212;
   Class45 aClass45_3213;
   int anInt3214;
   int anInt3215;
   boolean aBool3216;
   boolean aBool3217;
   static Class296 aClass296_3197;
   static Class296 aClass296_3205;
   static Class296 aClass296_3195;
   static Class296 aClass296_3196;
   static Class296 aClass296_3208;
   static Class296 aClass296_3210;
   static Class296 aClass296_3199;
   static Class296 aClass296_3200;
   static Class296 aClass296_3201;
   static Class296 aClass296_3202;
   static Class296 aClass296_3203;
   static Class296 aClass296_3206;
   static Class296 aClass296_3207;
   static Class296 aClass296_3193;
   static Class296 aClass296_3198;
   static Class296 aClass296_3211;
   static Class296 aClass296_3209;
   static Class296 aClass296_3194;

   Class296(int var1, Class45 var2, int var3) {
      this(var1, var2, var2, var3, var3, true, false);
   }

   static Class296[] method3964(int var0) {
      return new Class296[]{aClass296_3197, aClass296_3205, aClass296_3195, aClass296_3196, aClass296_3208, aClass296_3210, aClass296_3199, aClass296_3200, aClass296_3201, aClass296_3202, aClass296_3203, aClass296_3206, aClass296_3207, aClass296_3193, aClass296_3198, aClass296_3211, aClass296_3209, aClass296_3194};
   }

   Class296(int var1, Class45 var2, Class45 var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, true, false);
   }

   Class296(int var1, Class45 var2, Class45 var3, int var4, int var5, boolean var6, boolean var7) {
      this.anInt3204 = -1484787243 * var1;
      this.aClass45_3212 = var2;
      this.aClass45_3213 = var3;
      this.anInt3214 = var4 * 1710421611;
      this.anInt3215 = 1834614789 * var5;
      this.aBool3216 = var6;
      this.aBool3217 = var7;
   }

   static {
      aClass296_3197 = new Class296(0, Class45.aClass45_564, 2);
      aClass296_3205 = new Class296(1, Class45.aClass45_564, Class45.aClass45_564, 2, 3);
      aClass296_3195 = new Class296(2, Class45.aClass45_564, 3);
      aClass296_3196 = new Class296(3, Class45.aClass45_564, Class45.aClass45_564, 3, 4);
      aClass296_3208 = new Class296(4, Class45.aClass45_564, 4);
      aClass296_3210 = new Class296(5, Class45.aClass45_564, Class45.aClass45_564, 4, 5);
      aClass296_3199 = new Class296(6, Class45.aClass45_564, Class45.aClass45_564, 5, 98, true, true);
      aClass296_3200 = new Class296(7, Class45.aClass45_564, 99);
      aClass296_3201 = new Class296(8, Class45.aClass45_564, 100);
      aClass296_3202 = new Class296(9, Class45.aClass45_565, Class45.aClass45_565, 0, 92, true, true);
      aClass296_3203 = new Class296(10, Class45.aClass45_565, Class45.aClass45_565, 92, 93);
      aClass296_3206 = new Class296(11, Class45.aClass45_565, Class45.aClass45_565, 94, 95);
      aClass296_3207 = new Class296(12, Class45.aClass45_565, Class45.aClass45_565, 96, 97);
      aClass296_3193 = new Class296(13, Class45.aClass45_565, 97);
      aClass296_3198 = new Class296(14, Class45.aClass45_565, 97);
      aClass296_3211 = new Class296(15, Class45.aClass45_565, 100);
      aClass296_3209 = new Class296(16, Class45.aClass45_565, 100);
      aClass296_3194 = new Class296(17, Class45.aClass45_565, 100);
   }

   static final void method3965(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.aBool2562 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class526_Sub31.method9555(var0, (byte)10);
   }

   public static void method3966(byte var0) {
      if((-558705405 * client.anInt11038 == 9 || 10 == -558705405 * client.anInt11038) && null != client.aClass111_11060) {
         while(true) {
            Interface65 var1 = (Interface65)Class579.aLinkedList7745.poll();
            if(null == var1) {
               return;
            }

            var1.method228(1019280197);
         }
      }
   }

   static final void method3967(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.anInt11012;
   }
}
