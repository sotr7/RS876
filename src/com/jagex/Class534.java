package com.jagex;

import com.jagex.Class1;
import com.jagex.Class113;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class163;
import com.jagex.Class174;
import com.jagex.Class175;
import com.jagex.Class195;
import com.jagex.Class199_Sub3;
import com.jagex.Class231;
import com.jagex.Class237;
import com.jagex.Class238;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class327;
import com.jagex.Class331;
import com.jagex.Class422;
import com.jagex.Class443;
import com.jagex.Class47;
import com.jagex.Class476;
import com.jagex.Class526_Sub31;
import com.jagex.Class609;
import com.jagex.Class61;
import com.jagex.Class624;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class701;
import com.jagex.client;

public class Class534 {
   Class534() throws Throwable {
      throw new Error();
   }

   static final void method6397(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.aString2675 = null;
      var0.aClass258_2651 = null;
   }

   static final void method6398(Class681 var0, byte var1) {
      var0.anInt8625 -= -255940646;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class476.method5660((String)var0.anObjectArray8624[var0.anInt8625 * 540934629], (String)var0.anObjectArray8624[var0.anInt8625 * 540934629 + 1], Class26.aClass673_247, -890184022);
   }

   static void method6399(Class174 var0, Class162 var1, InterfaceDef var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Class238 var9 = (Class238)Class113.aClass40_Sub6_1371.method89(var7, -1165274415);
      if(null != var9 && var9.anIntArray2424 != null && var9.method3302(Class242.aClass94_2456, Class242.aClass94_2456, 2043128457)) {
         var9 = var9.method3295(Class242.aClass94_2456, Class242.aClass94_2456, -875093691);
      }

      if(var9 != null && var9.aBool2412 && var9.method3302(Class242.aClass94_2456, Class242.aClass94_2456, 992264218)) {
         int var11;
         if(var9.anIntArray2432 != null) {
            int[] var10 = new int[var9.anIntArray2432.length];

            int var12;
            int var13;
            int var14;
            for(var11 = 0; var11 < var10.length / 2; ++var11) {
               if(-265840483 * Class327.anInt3488 == 2) {
                  var12 = (int)((double)Class195.aClass292_Sub1_2182.method3919(2136944615) * 2607.5945876176133D) + client.anInt11076 * -502966983 & 16383;
               } else if(6 == -265840483 * Class327.anInt3488) {
                  var12 = (int)client.aFloat11105 & 16383;
               } else {
                  var12 = (int)client.aFloat11105 + client.anInt11076 * -502966983 & 16383;
               }

               var13 = Class443.anIntArray4895[var12];
               var14 = Class443.anIntArray4896[var12];
               if(-265840483 * Class327.anInt3488 != 6) {
                  var13 = 256 * var13 / (client.anInt11097 * 1163477879 + 256);
                  var14 = var14 * 256 / (256 + client.anInt11097 * 1163477879);
               }

               var10[var11 * 2] = var2.anInt2510 * -99858407 / 2 + var3 + ((var9.anIntArray2432[2 * var11] * 4 + var5) * var14 + (var6 + 4 * var9.anIntArray2432[2 * var11 + 1]) * var13 >> 14);
               var10[2 * var11 + 1] = var2.anInt2576 * -667181623 / 2 + var4 - (var14 * (var6 + 4 * var9.anIntArray2432[var11 * 2 + 1]) - var13 * (4 * var9.anIntArray2432[var11 * 2] + var5) >> 14);
            }

            Class237 var20 = var2.method3351(var0, (byte)45);
            if(null != var20) {
               Class175.method2650(var0, var10, -832815201 * var9.anInt2436, var20.anIntArray2394, var20.anIntArray2391);
            }

            if(1831267885 * var9.anInt2402 > 0) {
               int var15;
               int var16;
               int var17;
               for(var12 = 0; var12 < var10.length / 2 - 1; ++var12) {
                  var13 = var10[var12 * 2];
                  var14 = var10[2 * var12 + 1];
                  var15 = var10[(1 + var12) * 2];
                  var16 = var10[(1 + var12) * 2 + 1];
                  if(var15 < var13) {
                     var17 = var13;
                     int var18 = var14;
                     var13 = var15;
                     var14 = var16;
                     var15 = var17;
                     var16 = var18;
                  } else if(var15 == var13 && var16 < var14) {
                     var17 = var14;
                     var14 = var16;
                     var16 = var17;
                  }

                  if(null != var1) {
                     var0.method2342(var13, var14, var15, var16, var9.anIntArray2438[var9.aByteArray2439[var12] & 255], 1, var1, var3, var4, var9.anInt2402 * 1831267885, 2127339551 * var9.anInt2410, -262321473 * var9.anInt2433);
                  } else {
                     var0.method2297(var13, var14, var15, var16, var9.anIntArray2438[var9.aByteArray2439[var12] & 255], 1, var9.anInt2402 * 1831267885, var9.anInt2410 * 2127339551, var9.anInt2433 * -262321473);
                  }
               }

               var12 = var10[var10.length - 2];
               var13 = var10[var10.length - 1];
               var14 = var10[0];
               var15 = var10[1];
               if(var14 < var12) {
                  var16 = var12;
                  var17 = var13;
                  var12 = var14;
                  var13 = var15;
                  var14 = var16;
                  var15 = var17;
               } else if(var14 == var12 && var15 < var13) {
                  var16 = var13;
                  var13 = var15;
                  var15 = var16;
               }

               if(var1 != null) {
                  var0.method2342(var12, var13, var14, var15, var9.anIntArray2438[var9.aByteArray2439[var9.aByteArray2439.length - 1] & 255], 1, var1, var3, var4, var9.anInt2402 * 1831267885, var9.anInt2410 * 2127339551, var9.anInt2433 * -262321473);
               } else {
                  var0.method2297(var12, var13, var14, var15, var9.anIntArray2438[var9.aByteArray2439[var9.aByteArray2439.length - 1] & 255], 1, var9.anInt2402 * 1831267885, 2127339551 * var9.anInt2410, var9.anInt2433 * -262321473);
               }
            } else if(var1 != null) {
               for(var12 = 0; var12 < var10.length / 2 - 1; ++var12) {
                  var0.method2296(var10[var12 * 2], var10[1 + 2 * var12], var10[(var12 + 1) * 2], var10[1 + 2 * (var12 + 1)], var9.anIntArray2438[var9.aByteArray2439[var12] & 255], 1, var1, var3, var4);
               }

               var0.method2296(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.anIntArray2438[var9.aByteArray2439[var9.aByteArray2439.length - 1] & 255], 1, var1, var3, var4);
            } else {
               for(var12 = 0; var12 < var10.length / 2 - 1; ++var12) {
                  var0.method2630(var10[2 * var12], var10[1 + 2 * var12], var10[2 * (var12 + 1)], var10[2 * (var12 + 1) + 1], var9.anIntArray2438[var9.aByteArray2439[var12] & 255], 1);
               }

               var0.method2630(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.anIntArray2438[var9.aByteArray2439[var9.aByteArray2439.length - 1] & 255], 1);
            }
         }

         Class153 var19 = null;
         if(-1 != var9.anInt2400 * -1056556293) {
            var19 = var9.method3296(var0, false, 2115066782);
            if(var19 != null) {
               var11 = 872867955 * var9.anInt2407 > 0?872867955 * var9.anInt2407:-1017065493 * Class331.aClass613_3498.anInt8062;
               Class231.method3255(var2, var1, var3, var4, var5, var6, var19, (double)var11, var9.aClass286_2408, var9.aClass267_2441, -2124375965);
            }
         }

         if(var9.aString2398 != null) {
            var11 = 0;
            if(var19 != null) {
               var11 = var19.method1771();
            }

            Class163 var21 = Class47.aClass163_643;
            Class1 var22 = Class701.aClass1_8786;
            if(803087905 * var9.anInt2405 == 1) {
               var21 = Class422.aClass163_4740;
               var22 = Class199_Sub3.aClass1_9887;
            }

            if(803087905 * var9.anInt2405 == 2) {
               var21 = Class609.aClass163_7930;
               var22 = Class680.aClass1_8616;
            }

            Class61.method1042(var2, var1, var3, var4, var5, var6, var11, var9.aString2398, var21, var22, var9.anInt2403 * 830418303, -228576968);
         }
      }

   }

	static final void method6400(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
		String var4 = (String) var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
		try {
			if (!var4.equals(var0.aString2575)) {
				var0.aString2575 = var4;
				Class526_Sub31.method9555(var0, (byte) 10);
			}

			if (var0.componentSlot * 1300712985 == -1 && !var1.aBool2458) {
				Class624.method7424(var0.uid * 919258769, 2141435139);
			}
		} catch (NullPointerException e) {
		}

	}
}
