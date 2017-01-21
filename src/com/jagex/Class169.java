package com.jagex;

import com.jagex.Class116;
import com.jagex.Class153;
import com.jagex.Class171;
import com.jagex.Class174;
import com.jagex.Class174_Sub1;
import com.jagex.Class174_Sub3;
import com.jagex.Class199_Sub11;
import com.jagex.Class212;
import com.jagex.Class230;
import com.jagex.Class238;
import com.jagex.Class277;
import com.jagex.Class291;
import com.jagex.Class312;
import com.jagex.Class380;
import com.jagex.PacketFrameDecoder;
import com.jagex.Class46;
import com.jagex.Class466;
import com.jagex.Class522;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub35;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub6;
import com.jagex.Class566;
import com.jagex.RenderDef;
import com.jagex.Class581;
import com.jagex.Class620;
import com.jagex.Class639_Sub1_Sub4_Sub1;
import com.jagex.Class664;
import com.jagex.Class681;
import com.jagex.Class84;
import com.jagex.Class9_Sub1;
import com.jagex.Interface3;
import com.jagex.client;

public class Class169 {
   int anInt1912;
   Class171[] aClass171Array1913;

   public Class169(Class466 var1) {
      this.anInt1912 = var1.method5544(0, -838013860) * -1174050929;
      this.aClass171Array1913 = new Class171[669112175 * this.anInt1912];

      for(int var2 = 0; var2 < this.anInt1912 * 669112175; ++var2) {
         RSByteBuffer var3 = new RSByteBuffer(var1.method5536(0, var2, (byte)27));
         if(var3.buffer == null) {
            this.aClass171Array1913[var2] = null;
         } else {
            try {
               Class171 var4 = new Class171();
               var4.method2154(var2, var3, -1602917044);
               this.aClass171Array1913[var2] = var4;
            } catch (Exception var5) {
               this.aClass171Array1913[var2] = null;
            }
         }
      }

   }

   public Class171 method2122(int var1, byte var2) {
      return this.aClass171Array1913[var1];
   }

   public static void method2123(int[] var0, int[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         int var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;
         int var9 = var7 == Integer.MAX_VALUE?0:1;

         for(int var10 = var2; var10 < var3; ++var10) {
            if(var0[var10] < (var10 & var9) + var7) {
               int var11 = var0[var10];
               var0[var10] = var0[var6];
               var0[var6] = var11;
               int var12 = var1[var10];
               var1[var10] = var1[var6];
               var1[var6++] = var12;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method2123(var0, var1, var2, var6 - 1, -1677268547);
         method2123(var0, var1, var6 + 1, var3, 711485060);
      }

   }

   static final void method2124(Class681 var0, int var1) {
      var0.aClass392_8632 = new PacketFrameDecoder();
      var0.aClass392_8632.anInt4092 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] * -211921753;
      var0.aClass392_8632.aClass526_Sub21_Sub12_4093 = Class277.aClass56_3028.method994(-1382935785 * var0.aClass392_8632.anInt4092, (byte)0);
      var0.aClass392_8632.anIntArray4091 = new int[var0.aClass392_8632.aClass526_Sub21_Sub12_4093.method10679(-68010004)];
   }

   static void method2125(int var0) {
      Class116.aBool1433 = false;
      Class212.anIntArray2265 = null;
      Class116.anIntArray1425 = null;
      Class116.anIntArray1428 = null;
      Class84.anIntArray851 = null;
      Class9_Sub1.method10244(1203338267);
   }

   static final void method2126(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var2 > 255 || var2 < 0) {
         var2 = 0;
      }

      if(var2 != Class230.preferences.aClass711_Sub23_10630.method10062(697538942)) {
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub23_10630, var2, (short)-786);
         Class522.method6257(-1042127423);
         client.aBool11013 = false;
      }

   }

   static boolean method2127(Class174 var0, Class526_Sub35 var1, Class238 var2, int var3, int var4, byte var5) {
      if(Class525_Sub1.aBool7116 && !client.aBool11230 && !Class525_Sub1.method6314(1427294417 * var1.anInt10665, -1722563897 * var1.anInt10662)) {
         return false;
      } else {
         if(null != var2.anIntArray2424) {
            var2 = var2.method3295(Class525_Sub1.anInterface17_7091, Class525_Sub1.anInterface19_7090, 333459980);
            if(null == var2) {
               return false;
            }
         }

         int var6 = Integer.MAX_VALUE;
         int var7 = Integer.MIN_VALUE;
         int var8 = Integer.MAX_VALUE;
         int var9 = Integer.MIN_VALUE;
         if(var2.anIntArray2432 != null) {
            var6 = (Class525_Sub1.anInt7109 - Class525_Sub1.anInt7149) * (var2.anInt2426 * 349750275 + var1.anInt10665 * 1427294417 - Class525_Sub1.anInt7138) / (Class525_Sub1.anInt7131 - Class525_Sub1.anInt7138) + Class525_Sub1.anInt7149;
            var7 = Class525_Sub1.anInt7149 + (-1735224795 * var2.anInt2435 + var1.anInt10665 * 1427294417 - Class525_Sub1.anInt7138) * (Class525_Sub1.anInt7109 - Class525_Sub1.anInt7149) / (Class525_Sub1.anInt7131 - Class525_Sub1.anInt7138);
            var9 = Class525_Sub1.anInt7152 - (var1.anInt10662 * -1722563897 + -1261408391 * var2.anInt2427 - Class525_Sub1.anInt7148) * (Class525_Sub1.anInt7152 - Class525_Sub1.anInt7143) / (Class525_Sub1.anInt7146 - Class525_Sub1.anInt7148);
            var8 = Class525_Sub1.anInt7152 - (-1722563897 * var1.anInt10662 + 759879505 * var2.anInt2429 - Class525_Sub1.anInt7148) * (Class525_Sub1.anInt7152 - Class525_Sub1.anInt7143) / (Class525_Sub1.anInt7146 - Class525_Sub1.anInt7148);
         }

         Class153 var10 = null;
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         if(-1 != var2.anInt2400 * -1056556293) {
            if(var1.aBool10668 && -1 != var2.anInt2417 * -1019706033) {
               var10 = var2.method3296(var0, true, 150238659);
            } else {
               var10 = var2.method3296(var0, false, 153260064);
            }

            if(var10 != null) {
               switch(var2.aClass286_2408.anInt3099 * 1811490829) {
               case 0:
                  var11 = 2107732935 * var1.anInt10666;
                  var12 = var1.anInt10666 * 2107732935 + var10.method21();
                  break;
               case 1:
                  var11 = var1.anInt10666 * 2107732935 - var10.method21();
                  var12 = 2107732935 * var1.anInt10666;
                  break;
               case 2:
                  var11 = 2107732935 * var1.anInt10666 - (var10.method21() + 1 >> 1);
                  var12 = var1.anInt10666 * 2107732935 + (var10.method21() + 1 >> 1);
               }

               switch(-1795749709 * var2.aClass267_2441.anInt2986) {
               case 0:
                  var13 = 440262535 * var1.anInt10667 - var10.method1788();
                  var14 = 440262535 * var1.anInt10667;
                  break;
               case 1:
                  var13 = 440262535 * var1.anInt10667;
                  var14 = var1.anInt10667 * 440262535 + var10.method1788();
                  break;
               case 2:
                  var13 = var1.anInt10667 * 440262535 - (var10.method1788() + 1 >> 1);
                  var14 = var1.anInt10667 * 440262535 + (var10.method1788() + 1 >> 1);
               }

               if(var11 < var6) {
                  var6 = var11;
               }

               if(var12 > var7) {
                  var7 = var12;
               }

               if(var13 < var8) {
                  var8 = var13;
               }

               if(var14 > var9) {
                  var9 = var14;
               }
            }
         }

         Class153 var15 = null;
         if(var2.anInt2444 * -598360317 != -1) {
            var15 = var2.method3287(var0, 1022517016);
         }

         int var16 = 0;
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         int var22 = 0;
         int var23 = 0;
         if(null != var2.aString2398) {
            Class291.method3886(803087905 * var2.anInt2405, (byte)0);
            if(Class174_Sub1.aClass163_9281 != null) {
               var23 = Class199_Sub11.aClass1_9926.method513(var2.aString2398, 1895615023 * Class566.anInt7611, 0, (Interface3[])null, (byte)-29);
               var18 = Class199_Sub11.aClass1_9926.method515(var2.aString2398, Class566.anInt7611 * 1895615023, (Interface3[])null, (byte)81);
               var16 = var2.anInt2409 * 1456048617 * (Class525_Sub1.anInt7109 - Class525_Sub1.anInt7149) / (Class525_Sub1.anInt7131 - Class525_Sub1.anInt7138) + (2107732935 * var1.anInt10666 - var18 / 2);
               var17 = var1.anInt10667 * 440262535 - var2.anInt2437 * -1891113645 * (Class525_Sub1.anInt7152 - Class525_Sub1.anInt7143) / (Class525_Sub1.anInt7146 - Class525_Sub1.anInt7148);
               if(null == var10) {
                  var17 -= var23 / 2;
               } else {
                  var17 -= (var10.method1788() >> 1) + var23;
               }

               var19 = var16 + var3;
               if(var19 < var6) {
                  var6 = var19;
               }

               var20 = var18 + var16 + var3;
               if(var20 > var7) {
                  var7 = var20;
               }

               var21 = var4 + var17;
               if(var21 < var8) {
                  var8 = var21;
               }

               var22 = var4 + var17 + var23;
               if(var22 > var9) {
                  var9 = var22;
               }
            }
         }

         if(var7 >= Class525_Sub1.anInt7149 && var6 <= Class525_Sub1.anInt7109 && var9 >= Class525_Sub1.anInt7143 && var8 <= Class525_Sub1.anInt7152) {
            Class525_Sub1.method6297(var0, var1, var2);
            if(null != var10) {
               int var24 = 0;
               int var25 = 0;
               int var26 = 0;
               int var27 = 0;
               int var28 = 0;
               int var29 = 0;
               switch(1811490829 * var2.aClass286_2408.anInt3099) {
               case 0:
                  var25 = -(var10.method1825() + 1) / 2;
                  break;
               case 1:
                  var24 = var10.method1825();
                  var25 = (var10.method1825() + 1) / 2;
                  var26 = var10.method21();
                  break;
               case 2:
                  var24 = var10.method1825() / 2;
                  var26 = var10.method21() >> 1;
               }

               switch(-1795749709 * var2.aClass267_2441.anInt2986) {
               case 0:
                  var27 = var10.method1825();
                  var28 = (var10.method1825() + 1) / 2;
                  var29 = var10.method1788();
                  break;
               case 1:
                  var28 = -(var10.method1825() + 1) / 2;
                  break;
               case 2:
                  var27 = var10.method1825() / 2;
                  var29 = var10.method1788() >> 1;
               }

               Class46 var30 = (Class46)Class525_Sub1.aHashMap10718.get(Integer.valueOf(var1.anInt10664 * -1572922363));
               if(null == var30) {
                  var30 = (Class46)Class525_Sub1.aHashMap10719.get(Integer.valueOf(var2.anInt2442 * 831231597));
               }

               int var31;
               int var32;
               if(null != var30 && -1 == -598360317 * var2.anInt2444) {
                  if(var30.anInt640 * -1446591407 > Class525_Sub1.anInt10721 * 1058088167 / 2) {
                     var31 = (Class525_Sub1.anInt10721 * -770457063 - 486378671 * var30.anInt640) / (Class525_Sub1.anInt10721 * 1058088167);
                  } else {
                     var31 = 486378671 * var30.anInt640 / (Class525_Sub1.anInt10721 * 1058088167);
                  }

                  var32 = var31 << 24 | 16776960;
                  if(var0 instanceof Class174_Sub3) {
                     var0.method2356(2107732935 * var1.anInt10666 - var24 - 7, var1.anInt10667 * 440262535 - var27 - 7, var10.method1825() + 14, var10.method1825() + 14, var32, (byte)43);
                     var0.method2356(2107732935 * var1.anInt10666 - var24 - 5, 440262535 * var1.anInt10667 - var27 - 5, var10.method1825() + 10, var10.method1825() + 10, var32, (byte)20);
                     var0.method2356(var1.anInt10666 * 2107732935 - var24 - 3, 440262535 * var1.anInt10667 - var27 - 3, var10.method1825() + 6, var10.method1825() + 6, var32, (byte)46);
                     var0.method2356(2107732935 * var1.anInt10666 - var24 - 1, var1.anInt10667 * 440262535 - var27 - 1, var10.method1825() + 2, var10.method1825() + 2, var32, (byte)126);
                     var0.method2356(2107732935 * var1.anInt10666 - var24, var1.anInt10667 * 440262535 - var27, var10.method1825(), var10.method1825(), var32, (byte)15);
                  } else {
                     var0.method2595(2107732935 * var1.anInt10666 - var25, 440262535 * var1.anInt10667 - var28, var10.method1825() / 2 + 7, var32, -879877757);
                     var0.method2595(var1.anInt10666 * 2107732935 - var25, 440262535 * var1.anInt10667 - var28 - var28 != 0?1:0, var10.method1825() / 2 + 5, var32, -879877757);
                     var0.method2595(var1.anInt10666 * 2107732935 - var25, 0 != 440262535 * var1.anInt10667 - var28 - var28?1:0, var10.method1825() / 2 + 3, var32, -879877757);
                     var0.method2595(var1.anInt10666 * 2107732935 - var25, var1.anInt10667 * 440262535 - var28 - var28 != 0?1:0, var10.method1825() / 2 + 1, var32, -879877757);
                     var0.method2595(var1.anInt10666 * 2107732935 - var25, 0 != 440262535 * var1.anInt10667 - var28 - var28?1:0, var10.method1825() / 2, var32, -879877757);
                  }
               }

               var10.method1778(2107732935 * var1.anInt10666 - var26, var1.anInt10667 * 440262535 - var29);
               var31 = 0;
               var32 = 0;
               if(var30 != null && var15 != null) {
                  switch(1811490829 * var2.aClass286_2408.anInt3099) {
                  case 0:
                     var31 = var15.method21();
                  case 1:
                  default:
                     break;
                  case 2:
                     var31 = var15.method21() >> 1;
                  }

                  switch(-1795749709 * var2.aClass267_2441.anInt2986) {
                  case 0:
                     var32 = (var15.method1788() + var10.method1788()) / 2;
                  case 1:
                  default:
                     break;
                  case 2:
                     var32 = (var15.method1788() / 2 + var10.method1788()) / 2;
                  }

                  int var33;
                  if(var30.anInt640 * -1446591407 > Class525_Sub1.anInt10721 * 1058088167 / 2) {
                     var33 = (Class525_Sub1.anInt10721 * -770457063 - 486378671 * var30.anInt640) / (1058088167 * Class525_Sub1.anInt10721);
                  } else {
                     var33 = var30.anInt640 * 486378671 / (1058088167 * Class525_Sub1.anInt10721);
                  }

                  int var34 = var33 << 24 | 16776960;
                  var15.method1774(var1.anInt10666 * 2107732935 - var31, var1.anInt10667 * 440262535 - var32, 0, var34, 1);
               }
            }

            if(null != var2.aString2398 && null != Class174_Sub1.aClass163_9281) {
               Class312.method4077(var0, var1, var2, var16, var17, var23, var18, -1811899900);
            }

            if(-1056556293 * var2.anInt2400 != -1 || var2.aString2398 != null) {
               Class526_Sub6 var35 = new Class526_Sub6(var1);
               var35.anInt10393 = -1366428311 * var11;
               var35.anInt10390 = 2015688915 * var12;
               var35.anInt10395 = 1681889935 * var13;
               var35.anInt10392 = -1855090363 * var14;
               var35.anInt10394 = var19 * -191578163;
               var35.anInt10389 = -4385927 * var20;
               var35.anInt10391 = var21 * -1817666603;
               var35.anInt10396 = var22 * -1739627043;
               Class380.aClass702_3937.method8176(var35, -495413992);
            }

            return false;
         } else {
            return true;
         }
      }
   }

   public static void method2128(Class581 var0, int var1, int var2, Class664 var3, Class639_Sub1_Sub4_Sub1 var4, int var5) {
      Class681 var6 = RenderDef.method6932((byte)-54);
      var6.aClass639_Sub1_Sub4_Sub1_8637 = var4;
      Class620.method7343(var0, var1, var2, var6, (byte)-42);
      var6.aClass639_Sub1_Sub4_Sub1_8637 = null;
   }
}
