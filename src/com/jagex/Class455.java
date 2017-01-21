package com.jagex;

import com.jagex.Class179;
import com.jagex.Class192;
import com.jagex.Class195;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class446;
import com.jagex.Class466;
import com.jagex.Class526_Sub21_Sub18;
import com.jagex.RSByteBuffer;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;

public class Class455 {
   static final int anInt5153 = 32768;
   static final int anInt5155 = 0;
   Class192 aClass192_5154 = new Class192(64);
   Class466 aClass466_5152;
   Class466 aClass466_5156;

   public Class526_Sub21_Sub18 method5398(int var1, byte var2) {
      Class526_Sub21_Sub18 var3 = (Class526_Sub21_Sub18)this.aClass192_5154.method2765((long)var1);
      if(null != var3) {
         return var3;
      } else {
         byte[] var4;
         if(var1 >= '\u8000') {
            var4 = this.aClass466_5156.method5536(0, var1 & 32767, (byte)-25);
         } else {
            var4 = this.aClass466_5152.method5536(0, var1, (byte)-96);
         }

         var3 = new Class526_Sub21_Sub18();
         if(var4 != null) {
            var3.method10721(new RSByteBuffer(var4), (byte)50);
         }

         if(var1 >= '\u8000') {
            var3.method10724((byte)16);
         }

         this.aClass192_5154.method2768(var3, (long)var1);
         return var3;
      }
   }

   public Class455(Class673 var1, Class466 var2, Class466 var3) {
      this.aClass466_5152 = var2;
      this.aClass466_5156 = var3;
      if(null != this.aClass466_5152) {
         this.aClass466_5152.method5544(0, 1520745339);
      }

      if(this.aClass466_5156 != null) {
         this.aClass466_5156.method5544(0, -1768208291);
      }

   }

   static final void method5399(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)84);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class179.method2674(var3, var4, var0, 1511023883);
   }

   static final void method5400(Class681 var0, short var1) throws Exception_Sub2 {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      Class446 var3 = Class446.method5309((float)var2, (float)var2, (float)var2);
      Class195.aClass292_Sub1_2182.method3937(var3, -1274508793);
      var3.method5278();
   }
}
