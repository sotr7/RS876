package com.jagex;

import com.jagex.Class113;
import com.jagex.Class114;
import com.jagex.Class184;
import com.jagex.Class199;
import com.jagex.Class199_Sub22;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class287;
import com.jagex.Class292;
import com.jagex.Class31;
import com.jagex.Class323;
import com.jagex.Class375;
import com.jagex.Class409;
import com.jagex.Class44;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class458;
import com.jagex.Class462;
import com.jagex.Class466;
import com.jagex.Class48;
import com.jagex.Class506;
import com.jagex.Class526_Sub27_Sub1;
import com.jagex.Class545;
import com.jagex.Class554;
import com.jagex.Class559;
import com.jagex.Class56;
import com.jagex.Class615;
import com.jagex.Class619;
import com.jagex.Class641;
import com.jagex.Class642;
import com.jagex.Class681;
import java.io.IOException;
import java.io.OutputStream;

public class Class507 {
   int anInt5703;
   byte[] aByteArray5700;
   int anInt5701 = 0;
   int anInt5702;
   OutputStream anOutputStream5699;

   public void method6138(int var1, int var2, int var3) throws IOException {
      int var4 = this.anInt5703 * 1963488713 - var1 - 1;
      if(var4 < 0) {
         var4 += -99673287 * this.anInt5701;
      }

      for(; 0 != var2; --var2) {
         if(var4 >= this.anInt5701 * -99673287) {
            var4 = 0;
         }

         this.aByteArray5700[(this.anInt5703 += -29903751) * 1963488713 - 1] = this.aByteArray5700[var4++];
         if(this.anInt5703 * 1963488713 >= -99673287 * this.anInt5701) {
            this.method6142((byte)47);
         }
      }

   }

   public void method6139(int var1, int var2) {
      if(this.aByteArray5700 == null || var1 != -99673287 * this.anInt5701) {
         this.aByteArray5700 = new byte[var1];
      }

      this.anInt5701 = -2139528439 * var1;
      this.anInt5703 = 0;
      this.anInt5702 = 0;
   }

   public void method6140(OutputStream var1, byte var2) throws IOException {
      this.method6141((byte)-22);
      this.anOutputStream5699 = var1;
   }

   public void method6141(byte var1) throws IOException {
      this.method6142((byte)37);
      this.anOutputStream5699 = null;
   }

   public void method6142(byte var1) throws IOException {
      int var2 = 1963488713 * this.anInt5703 - this.anInt5702 * -1815732019;
      if(0 != var2) {
         this.anOutputStream5699.write(this.aByteArray5700, this.anInt5702 * -1815732019, var2);
         if(1963488713 * this.anInt5703 >= this.anInt5701 * -99673287) {
            this.anInt5703 = 0;
         }

         this.anInt5702 = -1272153875 * this.anInt5703;
      }
   }

   public void method6143() throws IOException {
      this.method6142((byte)71);
      this.anOutputStream5699 = null;
   }

   public void method6144(byte var1) throws IOException {
      this.aByteArray5700[(this.anInt5703 += -29903751) * 1963488713 - 1] = var1;
      if(1963488713 * this.anInt5703 >= -99673287 * this.anInt5701) {
         this.method6142((byte)125);
      }

   }

   public void method6145() throws IOException {
      this.method6142((byte)41);
      this.anOutputStream5699 = null;
   }

   public byte method6146(int var1, int var2) {
      int var3 = 1963488713 * this.anInt5703 - var1 - 1;
      if(var3 < 0) {
         var3 += -99673287 * this.anInt5701;
      }

      return this.aByteArray5700[var3];
   }

   public void method6147(boolean var1, short var2) {
      if(!var1) {
         this.anInt5702 = 0;
         this.anInt5703 = 0;
      }

   }

   public void method6148(int var1, int var2) throws IOException {
      int var3 = this.anInt5703 * 1963488713 - var1 - 1;
      if(var3 < 0) {
         var3 += -99673287 * this.anInt5701;
      }

      for(; 0 != var2; --var2) {
         if(var3 >= this.anInt5701 * -99673287) {
            var3 = 0;
         }

         this.aByteArray5700[(this.anInt5703 += -29903751) * 1963488713 - 1] = this.aByteArray5700[var3++];
         if(this.anInt5703 * 1963488713 >= -99673287 * this.anInt5701) {
            this.method6142((byte)90);
         }
      }

   }

   public void method6149() throws IOException {
      this.method6142((byte)118);
      this.anOutputStream5699 = null;
   }

   public void method6150(byte var1) throws IOException {
      this.aByteArray5700[(this.anInt5703 += -29903751) * 1963488713 - 1] = var1;
      if(1963488713 * this.anInt5703 >= -99673287 * this.anInt5701) {
         this.method6142((byte)28);
      }

   }

   public void method6151(byte var1) throws IOException {
      this.aByteArray5700[(this.anInt5703 += -29903751) * 1963488713 - 1] = var1;
      if(1963488713 * this.anInt5703 >= -99673287 * this.anInt5701) {
         this.method6142((byte)55);
      }

   }

   public void method6152(byte var1, byte var2) throws IOException {
      this.aByteArray5700[(this.anInt5703 += -29903751) * 1963488713 - 1] = var1;
      if(1963488713 * this.anInt5703 >= -99673287 * this.anInt5701) {
         this.method6142((byte)23);
      }

   }

   public static void method6153(float var0, Class446 var1, Class440 var2, Class446 var3, Class446 var4, Class446 var5, Class446 var6, float var7, float var8, float var9, float var10, byte var11) {
      if(!var3.method5269(var1)) {
         Class446 var12 = Class446.method5309(0.0F, 0.0F, 0.0F);
         Class446 var13 = Class446.method5305(Class446.method5275(var3, var1));
         var13.method5286(var2);
         Class446 var14 = Class446.method5275(var13, var12);
         float var15 = var14.method5276();
         if(var7 > 0.0F) {
            var5 = Class446.method5305(var5);
            var5.method5281(var8 * (var15 / var7));
         }

         if(Float.POSITIVE_INFINITY != var5.aFloat4917 && !Float.isNaN(var1.aFloat4917) && var15 <= var9 && var15 >= var10) {
            var2.method5187();
            Class446 var16 = Class446.method5309(1.0F, 0.0F, 0.0F);
            Class446 var17 = Class446.method5309(0.0F, 1.0F, 0.0F);
            Class446 var18 = Class446.method5309(0.0F, 0.0F, 1.0F);
            var16.method5286(var2);
            var17.method5286(var2);
            var18.method5286(var2);
            Class446 var19 = Class446.method5309(Class446.method5262(var16, var4), Class446.method5262(var17, var4), Class446.method5262(var18, var4));
            Class446 var20 = Class446.method5305(var19);
            var20.method5295();
            Class446 var21 = Class446.method5283(Class446.method5280(var20, var20), Class446.method5285(var5, 2.0F));
            Class446 var22 = Class446.method5305(var14);
            var22.method5295();
            Class446 var23 = Class446.method5305(var19);
            if(var21.aFloat4917 > var22.aFloat4917) {
               if(var14.aFloat4917 < 0.0F) {
                  var23.aFloat4917 += var5.aFloat4917 * var0;
                  if(var23.aFloat4917 > 0.0F) {
                     var23.aFloat4917 = 0.0F;
                  }
               } else {
                  var23.aFloat4917 -= var5.aFloat4917 * var0;
                  if(var23.aFloat4917 < 0.0F) {
                     var23.aFloat4917 = 0.0F;
                  }
               }
            } else if(var20.aFloat4917 < var6.aFloat4917) {
               if(var14.aFloat4917 < 0.0F) {
                  var23.aFloat4917 -= var5.aFloat4917 * var0;
                  if(var23.aFloat4917 < -var6.aFloat4917) {
                     var23.aFloat4917 = -var6.aFloat4917;
                  }
               } else {
                  var23.aFloat4917 += var5.aFloat4917 * var0;
                  if(var23.aFloat4917 > var6.aFloat4917) {
                     var23.aFloat4917 = var6.aFloat4917;
                  }
               }
            }

            if(var21.aFloat4915 > var22.aFloat4915) {
               if(var14.aFloat4915 < 0.0F) {
                  var23.aFloat4915 += var0 * var5.aFloat4915;
                  if(var23.aFloat4915 > 0.0F) {
                     var23.aFloat4915 = 0.0F;
                  }
               } else {
                  var23.aFloat4915 -= var0 * var5.aFloat4915;
                  if(var23.aFloat4915 < 0.0F) {
                     var23.aFloat4915 = 0.0F;
                  }
               }
            } else if(var20.aFloat4915 < var6.aFloat4915) {
               if(var14.aFloat4915 < 0.0F) {
                  var23.aFloat4915 -= var5.aFloat4915 * var0;
                  if(var23.aFloat4915 < -var6.aFloat4915) {
                     var23.aFloat4915 = -var6.aFloat4915;
                  }
               } else {
                  var23.aFloat4915 += var0 * var5.aFloat4915;
                  if(var23.aFloat4915 > var6.aFloat4915) {
                     var23.aFloat4915 = var6.aFloat4915;
                  }
               }
            }

            if(var21.aFloat4919 > var22.aFloat4919) {
               if(var14.aFloat4919 < 0.0F) {
                  var23.aFloat4919 += var0 * var5.aFloat4919;
                  if(var23.aFloat4919 > 0.0F) {
                     var23.aFloat4919 = 0.0F;
                  }
               } else {
                  var23.aFloat4919 -= var5.aFloat4919 * var0;
                  if(var23.aFloat4919 < 0.0F) {
                     var23.aFloat4919 = 0.0F;
                  }
               }
            } else if(var20.aFloat4919 < var6.aFloat4919) {
               if(var14.aFloat4919 < 0.0F) {
                  var23.aFloat4919 -= var5.aFloat4919 * var0;
                  if(var23.aFloat4919 < -var6.aFloat4919) {
                     var23.aFloat4919 = -var6.aFloat4919;
                  }
               } else {
                  var23.aFloat4919 += var5.aFloat4919 * var0;
                  if(var23.aFloat4919 > var6.aFloat4919) {
                     var23.aFloat4919 = var6.aFloat4919;
                  }
               }
            }

            Class446 var24 = Class446.method5285(var16, var23.aFloat4917);
            var24.method5307(var17, var23.aFloat4915);
            var24.method5307(var18, var23.aFloat4919);
            var4.method5288(var24, 0.8F);
            var1.method5272(Class446.method5285(var4, var0));
            var20.method5278();
            var23.method5278();
            var22.method5278();
         } else {
            var1.method5267(var3);
            var4.method5268();
         }

      }
   }

   static void method6154(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class462.method5474(Class554.aClass174_7475, -1451779978);
   }

   static final void method6155(InterfaceDef var0, int var1, int var2, int var3, Class681 var4, int var5) {
      if(null == var0.anIntArray2609) {
         throw new RuntimeException();
      } else {
         var0.anIntArray2609[var1] = var2;
         var0.anIntArray2587[var1] = var3;
      }
   }

   static final void method6156(Class681 var0, int var1) {
      var0.anInt8623 -= -2019815548;
      Class114.method1400(1709803533);
      Class458.method5415(1425697417);
      Class409.anInt4373 = var0.anIntArray8622[var0.anInt8623 * -1730576285] * -1292656675;
      Class559.anInt7544 = -333562659 * var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      Class199_Sub22.anInt9979 = 1385233579 * var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      Class258.anInt2829 = -1014916923 * var0.anIntArray8622[var0.anInt8623 * -1730576285 + 3];
      Class375.anInt3904 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 4] * -1267913943;
      Class199.anInt2201 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 5] * 1869988859;
      Class56.anInt682 = -831080105 * var0.anIntArray8622[6 + var0.anInt8623 * -1730576285];
      Class287.anInt3106 = 1634666195 * var0.anIntArray8622[7 + var0.anInt8623 * -1730576285];
      Class466.anInt5334 = var0.anIntArray8622[8 + -1730576285 * var0.anInt8623] * -2017784099;
      Class545.anInt7266 = 882360117 * var0.anIntArray8622[-1730576285 * var0.anInt8623 + 9];
      Class292.anInt3177 = -1132364209 * var0.anIntArray8622[-1730576285 * var0.anInt8623 + 10];
      Class615.anInt8092 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 11] * 944934711;
      Class113.aClass466_1370.method5537(Class375.anInt3904 * -2015190759, (byte)28);
      Class113.aClass466_1370.method5537(-1483288781 * Class199.anInt2201, (byte)110);
      Class113.aClass466_1370.method5537(Class56.anInt682 * -767212953, (byte)47);
      Class113.aClass466_1370.method5537(-102809253 * Class287.anInt3106, (byte)35);
      Class113.aClass466_1370.method5537(2001680757 * Class466.anInt5334, (byte)59);
      Class113.aClass466_1370.method5537(Class615.anInt8092 * 1534482055, (byte)85);
      Class642.aClass466_8429.method5537(1534482055 * Class615.anInt8092, (byte)91);
      Class323.aClass153_3460 = null;
      Class506.aClass153_5697 = null;
      Class184.aClass153_2117 = null;
      Class619.aClass153_8122 = null;
      Class31.aClass153_268 = null;
      Class526_Sub27_Sub1.aClass153_11625 = null;
      Class44.aClass153_461 = null;
      Class31.aClass153_304 = null;
      Class31.aBool302 = true;
   }

   static final void method6157(Class681 var0, int var1) {
      Class48.method931(var0, Class451.localPlayer, (short)-13652);
   }

   public static void method6158(byte var0) {
      if(null != Class641.aClass361_8348) {
         Class641.aClass361_8348.method4604((byte)0);
         Class641.aClass361_8348 = null;
      }

   }
}
