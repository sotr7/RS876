package com.jagex;

import com.jagex.Class11;
import com.jagex.Class115;
import com.jagex.Class149;
import com.jagex.Class198;
import com.jagex.Class20;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.OutFrame;
import com.jagex.Class448_Sub1;
import com.jagex.Class523;
import com.jagex.Class526_Sub13;
import com.jagex.OutFrameBuffer;
import com.jagex.Class567;
import com.jagex.Class615;
import com.jagex.Class681;
import com.jagex.Class93;
import com.jagex.Interface29;
import com.jagex.client;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class278 {
   Class20 aClass20_3032;
   Class526_Sub13[] aClass526_Sub13Array3031;
   Interface29 anInterface29_3030;

   void method3678(int var1) {
      Class526_Sub13 var2 = this.method3682(var1, (byte)-31);
      if(null != var2) {
         var2.method6332(-1949449864);
         this.aClass526_Sub13Array3031[var2.anInt10453 * 961762425] = null;
      }

   }

   public void method3679(int var1, String var2, Class526_Sub13 var3, byte var4) {
      Class526_Sub13 var5 = this.method3680(var2, (byte)56);
      if(var5 != null && 961762425 * var5.anInt10453 != var1) {
         throw new IllegalArgumentException(var2);
      } else {
         this.method3681(var1, 652212987);
         if(var1 >= this.aClass526_Sub13Array3031.length) {
            int var6;
            for(var6 = this.aClass526_Sub13Array3031.length; var1 >= var6; var6 += var6) {
               ;
            }

            this.aClass20_3032 = new Class20(var6);

            for(int var7 = 0; var7 < this.aClass526_Sub13Array3031.length; ++var7) {
               Class526_Sub13 var8 = this.aClass526_Sub13Array3031[var7];
               if(var8 != null) {
                  this.aClass20_3032.put(var8, -6805155999452426801L * var8.aLong7156);
               }
            }

            Class526_Sub13[] var9 = new Class526_Sub13[var6];

            for(int var10 = 0; var10 < this.aClass526_Sub13Array3031.length; ++var10) {
               var9[var10] = this.aClass526_Sub13Array3031[var10];
            }

            this.aClass526_Sub13Array3031 = var9;
         }

         var3.anInt10453 = var1 * -1273309751;
         var3.aString10454 = var2;
         this.aClass20_3032.put(var3, this.anInterface29_3030.method183(var2, -2060653498));
         this.aClass526_Sub13Array3031[var1] = var3;
      }
   }

   public Class526_Sub13 method3680(String var1, byte var2) {
      long var3 = this.anInterface29_3030.method183(var1, -2012552678);

      for(Class526_Sub13 var5 = (Class526_Sub13)this.aClass20_3032.get(var3); var5 != null; var5 = (Class526_Sub13)this.aClass20_3032.method635(-1734407897)) {
         if(var5.aString10454.equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   void method3681(int var1, int var2) {
      Class526_Sub13 var3 = this.method3682(var1, (byte)-117);
      if(null != var3) {
         var3.method6332(-1949449864);
         this.aClass526_Sub13Array3031[var3.anInt10453 * 961762425] = null;
      }

   }

   public Class526_Sub13 method3682(int var1, byte var2) {
      return var1 >= this.aClass526_Sub13Array3031.length?null:this.aClass526_Sub13Array3031[var1];
   }

   public Class278(int var1, Interface29 var2) {
      int var3;
      for(var3 = 1; var3 < var1; var3 += var3) {
         ;
      }

      this.aClass20_3032 = new Class20(var3);
      this.aClass526_Sub13Array3031 = new Class526_Sub13[var3];
      this.anInterface29_3030 = var2;
   }

   static final void method3683(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2608 = Class615.method7280(var4, var2, -527732405);
      var0.aBool2560 = true;
   }

   static final void method3684(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4176, client.aClass111_11060.aClass14_1342, 362051647);
      var3.out.writeShort(var2, -805078716);
      client.aClass111_11060.write(var3, (byte)4);
   }

   static final void method3685(InterfaceDef var0, Class243 var1, boolean var2, int var3, Class681 var4, int var5) {
      var4.anInt8623 -= 379191958;
      int var6 = var4.anIntArray8622[-1730576285 * var4.anInt8623];
      int var7 = var4.anIntArray8622[1 + var4.anInt8623 * -1730576285];
      if(-1 == 1300712985 * var0.componentSlot && !var1.aBool2458) {
         Class523.method6275(919258769 * var0.uid, (short)5218);
         Class567.method6821(var0.uid * 919258769, (byte)15);
         Class93.method1218(919258769 * var0.uid, (byte)22);
      }

      if(-1 == var6) {
         var0.modelType = -1940911479;
         var0.anInt2539 = -1664688705;
         var0.componentItem = 569578419;
      } else {
         var0.componentItem = -569578419 * var6;
         var0.anInt2499 = var7 * -2080380523;
         var0.aBool2652 = var2;
         Class11 var8 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var6, -676092908);
         var0.anInt2544 = -1847372063 * var8.anInt90;
         var0.anInt2545 = var8.anInt71 * -62648209;
         var0.anInt2546 = var8.anInt87 * 1276623617;
         var0.anInt2649 = var8.anInt141 * 1042531517;
         var0.anInt2543 = -888648937 * var8.anInt121;
         var0.anInt2550 = -51270895 * var8.anInt84;
         var0.anInt2555 = 304884557 * var3;
         if(var0.anInt2551 * 271174405 > 0) {
            var0.anInt2550 = -1016726723 * (var0.anInt2550 * 877036192 / (271174405 * var0.anInt2551));
         } else if(var0.anInt2475 * -57821549 > 0) {
            var0.anInt2550 = 877036192 * var0.anInt2550 / (var0.anInt2475 * -57821549) * -1016726723;
         }

      }
   }

   static void method3686(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      TwitchWebcamDevice var4 = Class198.method2847(var2, 15310891);
      TwitchWebcamDeviceCapability var5 = null;
      if(null != var4) {
         var5 = var4.method1241(var3);
      }

      if(null == var5) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.anInt1146 * -387611777;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1476702293 * var5.anInt1147;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.anInt1148 * 1817722091;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -657337259 * var5.anInt1149;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.anInt1150 * 381854419;
      }

   }
}
