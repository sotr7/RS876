package com.jagex;

import com.jagex.Class10;
import com.jagex.Class199_Sub1;
import com.jagex.Class230;
import com.jagex.Class231;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class400;
import com.jagex.Class45;
import com.jagex.Class504;
import com.jagex.Class510;
import com.jagex.Class525;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.RSByteBuffer;
import com.jagex.Class606;
import com.jagex.Class64;
import com.jagex.Class654;
import com.jagex.Class681;
import com.jagex.Class696;
import com.jagex.Class711_Sub14;
import com.jagex.Class83;
import com.jagex.Class84;
import com.jagex.Interface40;
import com.jagex.client;

class Class226 implements Interface40 {
   // $FF: synthetic field
   Class231 this$0;

   public float method331() {
      return (float)Class230.preferences.aClass711_Sub29_10653.method10105((byte)21) / 255.0F;
   }

   public float method332(int var1) {
      return (float)Class230.preferences.aClass711_Sub29_10653.method10105((byte)38) / 255.0F;
   }

   Class226(Class231 var1) {
      this.this$0 = var1;
   }

   public float method333() {
      return (float)Class230.preferences.aClass711_Sub29_10653.method10105((byte)31) / 255.0F;
   }

   public static boolean method3167(byte[] var0, int var1) {
      RSByteBuffer var2 = new RSByteBuffer(var0);
      int var3 = var2.readUnsignedByte(867232672);
      if(2 != var3) {
         return false;
      } else {
         boolean var4 = var2.readUnsignedByte(698458930) == 1;
         if(var4) {
            Class400.method4835(var2, 1981457807);
         }

         Class255.method3493(var2, (byte)0);
         return true;
      }
   }

   static final void method3168(Class681 var0, int var1) {
      if(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 0) {
         var0.anInt8644 += -873681181 * var0.anIntArray8642[-244840757 * var0.anInt8644];
      }

   }

   static final void method3169(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class696 var4 = Class525.method6326(var2 >> 14 & 16383, var2 & 16383);
      boolean var5 = false;

      for(Class526_Sub21_Sub17 var6 = (Class526_Sub21_Sub17)var4.method8143((byte)-1); null != var6; var6 = (Class526_Sub21_Sub17)var4.method8139(68831625)) {
         if(var3 == var6.anInt11846 * 929626277) {
            var5 = true;
            break;
         }
      }

      if(var5) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static void method3170(InterfaceDef var0, int var1, int var2, int var3) {
      if(client.aBool11276) {
         Class83 var4 = (Class83)(20050943 * Class510.anInt6985 != -1?Class10.aClass40_Sub20_62.method89(20050943 * Class510.anInt6985, -1348133193):null);
         if(client.method10311(var0).method9464(1506073717) && 0 != (257411563 * Class199_Sub1.anInt9869 & 32) && (null == var4 || var0.method3352(Class510.anInt6985 * 20050943, var4.anInt843 * 1040538721, 855176138) != 1040538721 * var4.anInt843)) {
            Class504.method6046(client.aString11184, client.aString11271 + " " + Class64.aString741 + " " + var0.aString2593, Class606.anInt7911 * 1441183119, 58, var0.componentItem * -77845371, 0L, 1300712985 * var0.componentSlot, var0.uid * 919258769, true, false, (long)(var0.componentSlot * 1300712985 << 0 | 919258769 * var0.uid), false, (byte)-23);
         }
      }

      for(int var7 = 9; var7 >= 5; --var7) {
         String var5 = Class654.method7821(var0, var7, 1409768740);
         if(null != var5) {
            Class504.method6046(var5, var0.aString2593, Class711_Sub14.method9983(var0, var7, -1269721373), 1007, var0.componentItem * -77845371, (long)(var7 + 1), var0.componentSlot * 1300712985, 919258769 * var0.uid, true, false, (long)(var0.componentSlot * 1300712985 << 0 | 919258769 * var0.uid), false, (byte)60);
         }
      }

      String var8 = Class84.method1178(var0, 960134089);
      if(var8 != null) {
         Class504.method6046(var8, var0.aString2593, var0.anInt2597 * -491296341, 25, var0.componentItem * -77845371, 0L, 1300712985 * var0.componentSlot, 919258769 * var0.uid, true, false, (long)(1300712985 * var0.componentSlot << 0 | var0.uid * 919258769), false, (byte)25);
      }

      for(int var9 = 4; var9 >= 0; --var9) {
         String var6 = Class654.method7821(var0, var9, -1365805735);
         if(null != var6) {
            Class504.method6046(var6, var0.aString2593, Class711_Sub14.method9983(var0, var9, -969638497), 57, -77845371 * var0.componentItem, (long)(var9 + 1), var0.componentSlot * 1300712985, var0.uid * 919258769, true, false, (long)(1300712985 * var0.componentSlot << 0 | var0.uid * 919258769), false, (byte)-16);
         }
      }

      if(client.method10311(var0).method9474(2121367957)) {
         if(null != var0.aString2663) {
            Class504.method6046(var0.aString2663, "", -1, 30, -77845371 * var0.componentItem, 0L, 1300712985 * var0.componentSlot, 919258769 * var0.uid, true, false, (long)(var0.componentSlot * 1300712985 << 0 | 919258769 * var0.uid), false, (byte)-16);
         } else {
            Class504.method6046(Class45.aClass45_479.method920(Class26.aClass673_247, -827840379), "", -1, 30, -77845371 * var0.componentItem, 0L, 1300712985 * var0.componentSlot, var0.uid * 919258769, true, false, (long)(1300712985 * var0.componentSlot << 0 | 919258769 * var0.uid), false, (byte)-24);
         }
      }

   }
}
