package com.jagex;

import com.jagex.Class173;
import com.jagex.Class173_Sub1;
import com.jagex.Class173_Sub2;
import com.jagex.Class466;
import com.jagex.RSByteBuffer;

public class Class181 {
   static final int anInt2076 = 0;
   static final int anInt2077 = 1;
   static final int anInt2078 = 0;

   public static Class173 method2679(Class466 var0, int var1, int var2) {
      byte[] var3 = var0.method5536(var1, var2, (byte)-86);
      return var3 == null?null:method2683(var3)[0];
   }

   public static Class173 method2680(Class466 var0, int var1) {
      byte[] var2 = var0.method5541(var1, 16777472);
      return var2 == null?null:method2683(var2)[0];
   }

   public static Class173[] method2681(Class466 var0, int var1, int var2) {
      byte[] var3 = var0.method5536(var1, var2, (byte)-18);
      return var3 == null?null:method2683(var3);
   }

   public static Class173[] method2682(Class466 var0, int var1) {
      byte[] var2 = var0.method5541(var1, 16777472);
      return var2 == null?null:method2683(var2);
   }

   Class181() throws Throwable {
      throw new Error();
   }

   public static Class173[] method2683(byte[] var0) {
      RSByteBuffer var1 = new RSByteBuffer(var0);
      var1.pos = (var0.length - 2) * 801976415;
      int var2 = var1.readUnsignedShort(1278837877);
      int var3 = var2 >> 15;
      int var4 = var2 & 32767;
      int var6;
      int var8;
      int var9;
      int var10;
      int var12;
      if(var3 == 0) {
         Class173_Sub2[] var18 = new Class173_Sub2[var4];

         for(var6 = 0; var6 < var4; ++var6) {
            var18[var6] = new Class173_Sub2();
         }

         var1.pos = (var0.length - 7 - var4 * 8) * 801976415;
         var6 = var1.readUnsignedShort(1104202854);
         int var19 = var1.readUnsignedShort(1971682447);
         var8 = (var1.readUnsignedByte(1802449446) & 255) + 1;

         for(var9 = 0; var9 < var4; ++var9) {
            var18[var9].anInt9853 = var1.readUnsignedShort(1423964530);
         }

         for(var9 = 0; var9 < var4; ++var9) {
            var18[var9].anInt9855 = var1.readUnsignedShort(650564886);
         }

         for(var9 = 0; var9 < var4; ++var9) {
            var18[var9].anInt9851 = var1.readUnsignedShort(1623324387);
         }

         for(var9 = 0; var9 < var4; ++var9) {
            var18[var9].anInt9852 = var1.readUnsignedShort(283728997);
         }

         for(var9 = 0; var9 < var4; ++var9) {
            Class173_Sub2 var20 = var18[var9];
            var20.anInt9854 = var6 - var20.anInt9851 - var20.anInt9853;
            var20.anInt9856 = var19 - var20.anInt9852 - var20.anInt9855;
         }

         var1.pos = (var0.length - 7 - var4 * 8 - (var8 - 1) * 3) * 801976415;
         int[] var22 = new int[var8];

         for(var10 = 1; var10 < var8; ++var10) {
            var22[var10] = var1.read24BitInt(742041327);
            if(var22[var10] == 0) {
               var22[var10] = 1;
            }
         }

         for(var10 = 0; var10 < var4; ++var10) {
            var18[var10].anIntArray9857 = var22;
         }

         var1.pos = 0;

         for(var10 = 0; var10 < var4; ++var10) {
            Class173_Sub2 var21 = var18[var10];
            var12 = var21.anInt9851 * var21.anInt9852;
            var21.aByteArray9858 = new byte[var12];
            int var13 = var1.readUnsignedByte(1739997825);
            int var15;
            if((var13 & 2) == 0) {
               int var23;
               if((var13 & 1) == 0) {
                  for(var23 = 0; var23 < var12; ++var23) {
                     var21.aByteArray9858[var23] = var1.readByte((byte)35);
                  }
               } else {
                  for(var23 = 0; var23 < var21.anInt9851; ++var23) {
                     for(var15 = 0; var15 < var21.anInt9852; ++var15) {
                        var21.aByteArray9858[var23 + var15 * var21.anInt9851] = var1.readByte((byte)126);
                     }
                  }
               }
            } else {
               boolean var14 = false;
               var21.aByteArray9859 = new byte[var12];
               if((var13 & 1) == 0) {
                  for(var15 = 0; var15 < var12; ++var15) {
                     var21.aByteArray9858[var15] = var1.readByte((byte)46);
                  }

                  for(var15 = 0; var15 < var12; ++var15) {
                     byte var16 = var21.aByteArray9859[var15] = var1.readByte((byte)119);
                     var14 |= var16 != -1;
                  }
               } else {
                  int var24;
                  for(var15 = 0; var15 < var21.anInt9851; ++var15) {
                     for(var24 = 0; var24 < var21.anInt9852; ++var24) {
                        var21.aByteArray9858[var15 + var24 * var21.anInt9851] = var1.readByte((byte)66);
                     }
                  }

                  for(var15 = 0; var15 < var21.anInt9851; ++var15) {
                     for(var24 = 0; var24 < var21.anInt9852; ++var24) {
                        byte var17 = var21.aByteArray9859[var15 + var24 * var21.anInt9851] = var1.readByte((byte)71);
                        var14 |= var17 != -1;
                     }
                  }
               }

               if(!var14) {
                  var21.aByteArray9859 = null;
               }
            }
         }

         return var18;
      } else {
         Class173_Sub1[] var5 = new Class173_Sub1[var4];
         var1.pos = 0;
         var6 = var1.readUnsignedByte(1180678334);
         if(var6 != 0) {
            if(var6 == 1) {
               throw new UnsupportedOperationException();
            } else {
               throw new RuntimeException();
            }
         } else {
            boolean var7 = var1.readUnsignedByte(-1001859491) == 1;
            var8 = var1.readUnsignedShort(1276488681);
            var9 = var1.readUnsignedShort(541707479);

            for(var10 = 0; var10 < var4; ++var10) {
               int[] var11 = new int[var8 * var9];

               for(var12 = 0; var12 < var8 * var9; ++var12) {
                  var11[var12] = -16777216 | var1.read24BitInt(742041327);
                  if(var11[var12] == -65281) {
                     var11[var12] = 0;
                  }
               }

               if(var7) {
                  for(var12 = 0; var12 < var8 * var9; ++var12) {
                     var11[var12] &= 16777215;
                     var11[var12] |= var1.readUnsignedByte(1449287264) << 24;
                  }
               }

               var5[var10] = new Class173_Sub1(var8, var9, var11);
            }

            return var5;
         }
      }
   }
}
