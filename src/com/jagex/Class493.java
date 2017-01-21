package com.jagex;

import com.jagex.Class1;
import com.jagex.Class115;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class260;
import com.jagex.Class267;
import com.jagex.Class273;
import com.jagex.Class315_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class466;
import com.jagex.Class476;
import com.jagex.Class479;
import com.jagex.Class509;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class526_Sub23_Sub9;
import com.jagex.OutFrameBuffer;
import com.jagex.Class581;
import com.jagex.Class620;
import com.jagex.Class645;
import com.jagex.Class681;
import com.jagex.Class708;
import com.jagex.Class710;
import com.jagex.Interface2;
import com.jagex.Interface48;
import com.jagex.client;

class Class493 implements Interface48 {
   // $FF: synthetic field
   Class479 this$0;

   Class493(Class479 var1) {
      this.this$0 = var1;
   }

   public void method140() {
      this.this$0.method5696(true, -1531101855);
   }

   public void method298() {
      this.this$0.method5696(true, -640751867);
   }

   public void method228(int var1) {
      this.this$0.method5696(true, -540046858);
   }

   static final void method5889(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-91);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class620.method7347(var3, var4, var0, 2067581144);
   }

   static Class267[] method5890(int var0) {
      return new Class267[]{Class267.aClass267_2987, Class267.aClass267_2983, Class267.aClass267_2984};
   }

   static boolean method5891(byte var0) {
      return 16 != client.anInt11038 * -558705405?false:!Class509.method6166(345437076) && !Class476.method5657(572423609);
   }

   static Class526_Sub21_Sub19 method5892(Class581 var0, int var1, int var2, int var3) {
      int var4 = var0.anInt7774 * -1796694797 | var1 << 10;
      Class526_Sub21_Sub19 var5 = (Class526_Sub21_Sub19)Class645.aClass195_8444.method2816((long)var4 << 16);
      if(null != var5) {
         return var5;
      } else {
         byte[] var6 = Class526_Sub21_Sub2.aClass466_11339.method5541(Class526_Sub21_Sub2.aClass466_11339.method5581(var4, 1207667673), 16777472);
         if(null != var6) {
            if(var6.length <= 1) {
               return null;
            } else {
               try {
                  var5 = Class273.method3611(var6, (byte)-19);
               } catch (Exception var8) {
                  throw new RuntimeException(var8.getMessage() + " " + var4);
               }

               var5.aClass581_11863 = var0;
               Class645.aClass195_8444.method2817(var5, (long)var4 << 16);
               return var5;
            }
         } else {
            var4 = var0.anInt7774 * -1796694797 | var2 + 65536 << 10;
            var5 = (Class526_Sub21_Sub19)Class645.aClass195_8444.method2816((long)var4 << 16);
            if(null != var5) {
               return var5;
            } else {
               var6 = Class526_Sub21_Sub2.aClass466_11339.method5541(Class526_Sub21_Sub2.aClass466_11339.method5581(var4, 1898620731), 16777472);
               if(null != var6) {
                  if(var6.length <= 1) {
                     return null;
                  } else {
                     try {
                        var5 = Class273.method3611(var6, (byte)58);
                     } catch (Exception var9) {
                        throw new RuntimeException(var9.getMessage() + " " + var4);
                     }

                     var5.aClass581_11863 = var0;
                     Class645.aClass195_8444.method2817(var5, (long)var4 << 16);
                     return var5;
                  }
               } else {
                  var4 = -1796694797 * var0.anInt7774 | 67107840;
                  var5 = (Class526_Sub21_Sub19)Class645.aClass195_8444.method2816((long)var4 << 16);
                  if(var5 != null) {
                     return var5;
                  } else {
                     var6 = Class526_Sub21_Sub2.aClass466_11339.method5541(Class526_Sub21_Sub2.aClass466_11339.method5581(var4, 1689475305), 16777472);
                     if(var6 != null) {
                        if(var6.length <= 1) {
                           return null;
                        } else {
                           try {
                              var5 = Class273.method3611(var6, (byte)-6);
                           } catch (Exception var10) {
                              throw new RuntimeException(var10.getMessage() + " " + var4);
                           }

                           var5.aClass581_11863 = var0;
                           Class645.aClass195_8444.method2817(var5, (long)var4 << 16);
                           return var5;
                        }
                     } else {
                        return null;
                     }
                  }
               }
            }
         }
      }
   }

   static final void method5893(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(Class710.aBool8850) {
         Class708[] var3 = Class526_Sub23_Sub9.method10566((byte)7);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 14758297 * var3[var2].anInt8840;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1823144195 * var3[var2].anInt8839;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   public static Class1 method5894(Class466 var0, int var1, int var2, short var3) {
      return Class260.method3525(var0, var1, var2, (Interface2)null, (byte)1);
   }

   static final void method5895(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4254, client.aClass111_11060.aClass14_1342, 354306748);
      var3.out.writeShort(var2, -805078716);
      client.aClass111_11060.write(var3, (byte)-90);
   }
}
