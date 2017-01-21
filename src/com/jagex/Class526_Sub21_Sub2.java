package com.jagex;

import com.jagex.Class116;
import com.jagex.Class149;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class466;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21;
import com.jagex.RSByteBuffer;
import com.jagex.Class615;
import com.jagex.Class681;
import com.jagex.Class71;
import com.jagex.Interface12;
import com.jagex.Interface5;

public class Class526_Sub21_Sub2 extends Class526_Sub21 implements Interface12, Interface5 {
   public static Class466 aClass466_11339;
   public int anInt11338 = 0;
   public int anInt11335 = 0;
   public int[] anIntArray11336;
   public int[] anIntArray11337;

   public void method81(int var1) {
   }

   public void method85() {
   }

   void method10416(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 2) {
         this.anInt11338 = var1.readUnsignedShort(1937288784) * 1106235853;
      } else if(4 == var2) {
         this.anInt11335 = var1.readUnsignedByte(-1717914170) * -1023169481;
         this.anIntArray11336 = new int[-1116747385 * this.anInt11335];
         this.anIntArray11337 = new int[-1116747385 * this.anInt11335];

         for(int var4 = 0; var4 < -1116747385 * this.anInt11335; ++var4) {
            this.anIntArray11336[var4] = var1.readUnsignedShort(349277980);
            this.anIntArray11337[var4] = var1.readUnsignedShort(2121762295);
         }
      }

   }

   public void method49(int var1, int var2) {
   }

   void method10417(RSByteBuffer var1, int var2) {
      if(var2 == 2) {
         this.anInt11338 = var1.readUnsignedShort(1201046085) * 1106235853;
      } else if(4 == var2) {
         this.anInt11335 = var1.readUnsignedByte(660032794) * -1023169481;
         this.anIntArray11336 = new int[-1116747385 * this.anInt11335];
         this.anIntArray11337 = new int[-1116747385 * this.anInt11335];

         for(int var3 = 0; var3 < -1116747385 * this.anInt11335; ++var3) {
            this.anIntArray11336[var3] = var1.readUnsignedShort(1865321648);
            this.anIntArray11337[var3] = var1.readUnsignedShort(562850058);
         }
      }

   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(445315112);
         if(0 == var2) {
            return;
         }

         this.method10416(var1, var2, 1035426122);
      }
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-847601836);
         if(0 == var2) {
            return;
         }

         this.method10416(var1, var2, -222221161);
      }
   }

   public void method50(int var1) {
   }

   public void method51(int var1) {
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1625768434);
         if(0 == var3) {
            return;
         }

         this.method10416(var1, var3, -1942791862);
      }
   }

   void method10418(RSByteBuffer var1, int var2) {
      if(var2 == 2) {
         this.anInt11338 = var1.readUnsignedShort(1363462560) * 1106235853;
      } else if(4 == var2) {
         this.anInt11335 = var1.readUnsignedByte(-1798143260) * -1023169481;
         this.anIntArray11336 = new int[-1116747385 * this.anInt11335];
         this.anIntArray11337 = new int[-1116747385 * this.anInt11335];

         for(int var3 = 0; var3 < -1116747385 * this.anInt11335; ++var3) {
            this.anIntArray11336[var3] = var1.readUnsignedShort(597159923);
            this.anIntArray11337[var3] = var1.readUnsignedShort(268616817);
         }
      }

   }

   static final void method10419(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      int[] var5 = Class149.method1747(var4, var2, (byte)0);
      if(null != var5) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2616 = Class615.method7280(var4, var2, -495492430);
      var0.anIntArray2639 = var5;
      var0.aBool2560 = true;
   }

   static void method10420(int var0) {
      if(Class71.anInt800 * -335635005 < 0) {
         Class71.anInt800 = 0;
         Class525_Sub1.anInt10710 = 608366201;
         Class525_Sub1.anInt10711 = -805427121;
      }

      if(-335635005 * Class71.anInt800 > Class525_Sub1.anInt7102) {
         Class71.anInt800 = -521323797 * Class525_Sub1.anInt7102;
         Class525_Sub1.anInt10710 = 608366201;
         Class525_Sub1.anInt10711 = -805427121;
      }

      if(Class116.anInt1438 * -623512625 < 0) {
         Class116.anInt1438 = 0;
         Class525_Sub1.anInt10710 = 608366201;
         Class525_Sub1.anInt10711 = -805427121;
      }

      if(Class116.anInt1438 * -623512625 > Class525_Sub1.anInt7110) {
         Class116.anInt1438 = -168152273 * Class525_Sub1.anInt7110;
         Class525_Sub1.anInt10710 = 608366201;
         Class525_Sub1.anInt10711 = -805427121;
      }

   }

   public static int method10421(int var0, int var1, int var2, byte var3) {
      var2 &= 3;
      return 0 == var2?var1:(var2 == 1?7 - var0:(var2 == 2?7 - var1:var0));
   }
}
