package com.jagex;

import com.jagex.Class11;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class448_Sub1;
import com.jagex.Class526;
import com.jagex.Class526_Sub27;
import com.jagex.Class526_Sub27_Sub1;
import com.jagex.Class526_Sub27_Sub2;
import com.jagex.Class526_Sub27_Sub3;
import com.jagex.Class526_Sub27_Sub4;
import com.jagex.Class526_Sub27_Sub5;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub9;
import com.jagex.Class542;
import com.jagex.Class681;
import com.jagex.Class702;

public class Class340 {
   static final int anInt3534 = 1;
   static final int anInt3535 = 5;
   static final int anInt3536 = 3;
   static final int anInt3537 = 4;
   static final int anInt3538 = 2;
   static int anInt3539;
   long aLong3531;
   long aLong3532 = -3472558928925231643L;
   Class702 aClass702_3533 = new Class702();

   public void method4412(Class526_Sub9 var1, int var2) {
      if(8035651270061588445L * this.aLong3531 == -6805155999452426801L * var1.aLong7156 && this.aLong3532 * 7582174351194505235L == var1.aLong10406 * -6020431222359694977L) {
         for(Class526_Sub27 var3 = (Class526_Sub27)this.aClass702_3533.method8206((byte)46); null != var3; var3 = (Class526_Sub27)this.aClass702_3533.method8181(-13031381)) {
            var3.method9519(var1, 1483516687);
         }

         var1.aLong10406 += -8971307007232876929L;
      } else {
         throw new RuntimeException("");
      }
   }

   void method4413(RSByteBuffer var1, int var2) {
      this.aLong3531 = var1.method9663(602359259) * 699922159939047541L;
      this.aLong3532 = var1.method9663(446217175) * 3472558928925231643L;

      for(int var3 = var1.readUnsignedByte(570624707); 0 != var3; var3 = var1.readUnsignedByte(250657736)) {
         Object var4;
         if(var3 == 1) {
            var4 = new Class526_Sub27_Sub5(this);
         } else if(var3 == 4) {
            var4 = new Class526_Sub27_Sub3(this);
         } else if(var3 == 3) {
            var4 = new Class526_Sub27_Sub2(this);
         } else if(2 == var3) {
            var4 = new Class526_Sub27_Sub4(this);
         } else {
            if(var3 != 5) {
               throw new RuntimeException("");
            }

            var4 = new Class526_Sub27_Sub1(this);
         }

         ((Class526_Sub27)var4).method9517(var1, (byte)62);
         this.aClass702_3533.method8176((Class526)var4, -1977518662);
      }

   }

   public void method4414(Class526_Sub9 var1) {
      if(8035651270061588445L * this.aLong3531 == -6805155999452426801L * var1.aLong7156 && this.aLong3532 * 7582174351194505235L == var1.aLong10406 * -6020431222359694977L) {
         for(Class526_Sub27 var2 = (Class526_Sub27)this.aClass702_3533.method8206((byte)53); null != var2; var2 = (Class526_Sub27)this.aClass702_3533.method8181(1237931244)) {
            var2.method9519(var1, 1001126564);
         }

         var1.aLong10406 += -8971307007232876929L;
      } else {
         throw new RuntimeException("");
      }
   }

   void method4415(RSByteBuffer var1) {
      this.aLong3531 = var1.method9663(245883361) * 699922159939047541L;
      this.aLong3532 = var1.method9663(220928878) * 3472558928925231643L;

      for(int var2 = var1.readUnsignedByte(-1508281340); 0 != var2; var2 = var1.readUnsignedByte(-713595808)) {
         Object var3;
         if(var2 == 1) {
            var3 = new Class526_Sub27_Sub5(this);
         } else if(var2 == 4) {
            var3 = new Class526_Sub27_Sub3(this);
         } else if(var2 == 3) {
            var3 = new Class526_Sub27_Sub2(this);
         } else if(2 == var2) {
            var3 = new Class526_Sub27_Sub4(this);
         } else {
            if(var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new Class526_Sub27_Sub1(this);
         }

         ((Class526_Sub27)var3).method9517(var1, (byte)62);
         this.aClass702_3533.method8176((Class526)var3, -1274943419);
      }

   }

   void method4416(RSByteBuffer var1) {
      this.aLong3531 = var1.method9663(170739348) * 699922159939047541L;
      this.aLong3532 = var1.method9663(1958549175) * 3472558928925231643L;

      for(int var2 = var1.readUnsignedByte(-941396719); 0 != var2; var2 = var1.readUnsignedByte(1293641514)) {
         Object var3;
         if(var2 == 1) {
            var3 = new Class526_Sub27_Sub5(this);
         } else if(var2 == 4) {
            var3 = new Class526_Sub27_Sub3(this);
         } else if(var2 == 3) {
            var3 = new Class526_Sub27_Sub2(this);
         } else if(2 == var2) {
            var3 = new Class526_Sub27_Sub4(this);
         } else {
            if(var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new Class526_Sub27_Sub1(this);
         }

         ((Class526_Sub27)var3).method9517(var1, (byte)62);
         this.aClass702_3533.method8176((Class526)var3, -1506133908);
      }

   }

   public Class340(RSByteBuffer var1) {
      this.method4413(var1, -175503439);
   }

   public void method4417(Class526_Sub9 var1) {
      if(8035651270061588445L * this.aLong3531 == -6805155999452426801L * var1.aLong7156 && this.aLong3532 * 7582174351194505235L == var1.aLong10406 * -6020431222359694977L) {
         for(Class526_Sub27 var2 = (Class526_Sub27)this.aClass702_3533.method8206((byte)35); null != var2; var2 = (Class526_Sub27)this.aClass702_3533.method8181(-279573914)) {
            var2.method9519(var1, 1075058069);
         }

         var1.aLong10406 += -8971307007232876929L;
      } else {
         throw new RuntimeException("");
      }
   }

   static final void method4418(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)46);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class542.method6486(var3, var4, var0, -1428460021);
   }

   static final void method4419(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class11 var3 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -1488869540);
      if(var3.anInt124 * 2102653097 >= 0 && var3.anInt123 * 2121068701 >= 0) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt123 * 2121068701;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2;
      }

   }

   static final void method4420(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub10_10623.method9930((byte)17)?1:0;
   }
}
