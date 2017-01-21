package com.jagex;

import com.jagex.Class143;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class32;
import com.jagex.Class323;
import com.jagex.Class327;
import com.jagex.Class334;
import com.jagex.Class381;
import com.jagex.Class452;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import com.jagex.Class635;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class698;
import com.jagex.Exception_Sub1;
import com.jagex.Interface13;
import com.jagex.Interface14;
import com.jagex.RuntimeException_Sub4;
import com.jagex.client;

public class Class317 implements Interface13 {
   String aString3406;
   public static int anInt3410;
   int anInt3408 = -993989273;
   public int anInt3404;
   Class323 aClass323_3403;
   int anInt3402;
   int anInt3401;
   Class452 aClass452_3407;
   public Class143 aClass143_3405;
   static int[] anIntArray3409 = new int[32];

   Class317(int var1, Class323 var2) {
      this.anInt3404 = 2079159921 * var1;
      this.aClass323_3403 = var2;
   }

   public void method81(int var1) {
   }

   public void method83(RSByteBuffer var1) {
      this.method4095(var1, false, -1727100224);
   }

   void method4093(RSByteBuffer var1, int var2, boolean var3, int var4) {
      Class334 var5 = (Class334)Class561.findIdentifiable(Class526_Sub31.method9554((byte)115), var2, (byte)-49);
      switch(var5.anInt3514 * -308888345) {
      case 1:
         this.anInt3402 = var1.readUnsignedByte(1245132290) * 999814993;
         this.anInt3401 = var1.readUnsignedByte(1270213201) * 1765463491;
      case 8:
      default:
         break;
      case 10:
         int var6 = var1.readUnsignedByte(928173404);
         this.aClass452_3407 = (Class452)Class561.findIdentifiable(Class452.method5363((byte)5), var6, (byte)-28);
         if(this.aClass452_3407 == null) {
            throw new IllegalStateException("");
         }

         this.anInt3408 = var1.readBigSmart((byte)5) * 993989273;
         if(null != this.aClass323_3403) {
            Interface14 var7 = (Interface14)this.aClass323_3403.aMap3459.get(this.aClass452_3407);
            if(null != var7) {
               this.aClass143_3405 = (Class143)var7.method89(-485547607 * this.anInt3408, -318493661);
            } else if(!var3) {
               throw new IllegalStateException("");
            }
         }
      }

   }

   public void method84(RSByteBuffer var1) {
      this.method4095(var1, false, 248486773);
   }

   public int method4094(int var1, int var2) {
      int var3 = anIntArray3409[-620707093 * this.anInt3401 - -851463759 * this.anInt3402];
      return var1 >> -851463759 * this.anInt3402 & var3;
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         anIntArray3409[var1] = var0 - 1;
         var0 += var0;
      }

   }

   void method4095(RSByteBuffer var1, boolean var2, int var3) {
      while(true) {
         int var4 = var1.readUnsignedByte(1820056634);
         if(0 == var4) {
            return;
         }

         this.method4093(var1, var4, var2, -1050783701);
      }
   }

   public void method85() {
   }

   public int method4096(int var1, int var2, int var3) throws Exception_Sub1 {
      int var4 = anIntArray3409[this.anInt3401 * -620707093 - this.anInt3402 * -851463759];
      if(var2 >= 0 && var2 <= var4) {
         var4 <<= this.anInt3402 * -851463759;
         return var1 & ~var4 | var2 << -851463759 * this.anInt3402 & var4;
      } else {
         throw new Exception_Sub1(this.aString3406 != null?this.aString3406:Integer.toString(-258504047 * this.anInt3404), var2, var4);
      }
   }

   public void method82(RSByteBuffer var1, int var2) {
      this.method4095(var1, false, -1083801396);
   }

   public int method4097(int var1) {
      int var2 = anIntArray3409[-620707093 * this.anInt3401 - -851463759 * this.anInt3402];
      return var1 >> -851463759 * this.anInt3402 & var2;
   }

   public int method4098(int var1) {
      int var2 = anIntArray3409[-620707093 * this.anInt3401 - -851463759 * this.anInt3402];
      return var1 >> -851463759 * this.anInt3402 & var2;
   }

   public int method4099(int var1, int var2) throws Exception_Sub1 {
      int var3 = anIntArray3409[this.anInt3401 * -620707093 - this.anInt3402 * -851463759];
      if(var2 >= 0 && var2 <= var3) {
         var3 <<= this.anInt3402 * -851463759;
         return var1 & ~var3 | var2 << -851463759 * this.anInt3402 & var3;
      } else {
         throw new Exception_Sub1(this.aString3406 != null?this.aString3406:Integer.toString(-258504047 * this.anInt3404), var2, var3);
      }
   }

   static boolean method4100(String var0, String var1, int var2) {
      Class32.anInt310 = 265638088;
      RuntimeException_Sub4.aClass111_12105 = client.aClass111_11059;
      return Class635.method7556(false, false, var0, var1, -1L);
   }

   static final void method4101(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= 1895959790;
      var0.aBool2586 = true;
      var0.anInt2570 = Math.max(Math.min(var2.anIntArray8622[var2.anInt8623 * -1730576285], 2816), 0) * 966545353;
      var0.anInt2568 = Math.max(Math.min(var2.anIntArray8622[var2.anInt8623 * -1730576285 + 1], 2816), 0) * -462379117;
      var0.anInt2602 = Math.max(Math.min(var2.anIntArray8622[var2.anInt8623 * -1730576285 + 2], 2816), 0) * -2005798855;
      int var4 = Math.max(Math.min(var2.anIntArray8622[3 + -1730576285 * var2.anInt8623], 255), 0);
      int var5 = Math.max(Math.min(var2.anIntArray8622[-1730576285 * var2.anInt8623 + 4], 255), 0);
      int var6 = Math.max(Math.min(var2.anIntArray8622[5 + -1730576285 * var2.anInt8623], 255), 0);
      var0.anInt2571 = -1582944875 * (var4 << 16 | var5 << 8 | var6);
      var0.anInt2565 = -1748538437 * var2.anIntArray8622[var2.anInt8623 * -1730576285 + 6];
      var0.anInt2590 = var2.anIntArray8622[-1730576285 * var2.anInt8623 + 7] * -560991691;
      var0.anInt2549 = var2.anIntArray8622[var2.anInt8623 * -1730576285 + 8] * -2120072989;
      var0.anInt2631 = -122830903 * var2.anIntArray8622[var2.anInt8623 * -1730576285 + 9];
      Class526_Sub31.method9555(var0, (byte)10);
   }

   static final void method4102(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class381.method4710(var3, var0, 1671092078);
   }

   public static Class698 method4103(int var0, int var1) {
      Class698[] var2 = Class327.method4198(-508685681);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class698 var4 = var2[var3];
         if(var0 == var4.anInt8766 * 2094456825) {
            return var4;
         }
      }

      return null;
   }
}
