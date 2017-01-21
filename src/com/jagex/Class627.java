package com.jagex;

import com.jagex.Class214;
import com.jagex.Class218;
import com.jagex.Class242;
import com.jagex.Class285;
import com.jagex.Class418;
import com.jagex.Class466;
import com.jagex.Class523;
import com.jagex.RSByteBuffer;
import com.jagex.Class582;
import com.jagex.Class622;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Interface67;

public class Class627 {
   public static Class418 aClass418_8195;
   public static int anInt8196;
   public Interface67 anInterface67_8189;
   public Interface67 anInterface67_8186;
   public Interface67 anInterface67_8187;
   public Interface67 anInterface67_8188;
   public Class582 aClass582_8193;
   public Class582 aClass582_8185;
   public Class582 aClass582_8191;
   public boolean aBool8194;
   public int anInt8192;
   public int anInt8190;

   void method7458(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-476337056);
         if(0 == var3) {
            return;
         }

         if(1 == var3) {
            this.anInterface67_8189 = Class218.method3029(var1, (byte)3);
         } else if(var3 == 2) {
            this.anInterface67_8186 = Class218.method3029(var1, (byte)3);
         } else if(var3 == 3) {
            this.anInterface67_8187 = Class218.method3029(var1, (byte)3);
         } else if(4 == var3) {
            this.anInterface67_8188 = Class218.method3029(var1, (byte)3);
         } else if(5 == var3) {
            this.aClass582_8193 = Class523.method6274(var1, 238336924);
         } else if(6 == var3) {
            this.aClass582_8185 = Class523.method6274(var1, 1363029616);
         } else if(var3 == 7) {
            this.aClass582_8191 = Class523.method6274(var1, -1154784707);
         } else if(8 == var3) {
            Class218.method3029(var1, (byte)3);
         } else if(var3 == 9) {
            Class218.method3029(var1, (byte)3);
         } else if(10 == var3) {
            Class218.method3029(var1, (byte)3);
         } else if(var3 == 11) {
            this.aBool8194 = true;
         } else if(var3 == 12) {
            this.anInt8192 = var1.readInt((byte)5) * 515865761;
         } else if(13 == var3) {
            this.anInt8190 = var1.readInt((byte)5) * 1080113927;
         }
      }
   }

   public Class627(Class466 var1) {
      byte[] var2 = var1.method5541(Class622.aClass622_8138.anInt8139 * 127490303, 16777472);
      this.method7458(new RSByteBuffer(var2), -1696170982);
   }

   void method7459(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-2042046717);
         if(0 == var2) {
            return;
         }

         if(1 == var2) {
            this.anInterface67_8189 = Class218.method3029(var1, (byte)3);
         } else if(var2 == 2) {
            this.anInterface67_8186 = Class218.method3029(var1, (byte)3);
         } else if(var2 == 3) {
            this.anInterface67_8187 = Class218.method3029(var1, (byte)3);
         } else if(4 == var2) {
            this.anInterface67_8188 = Class218.method3029(var1, (byte)3);
         } else if(5 == var2) {
            this.aClass582_8193 = Class523.method6274(var1, 1632228424);
         } else if(6 == var2) {
            this.aClass582_8185 = Class523.method6274(var1, -1113438042);
         } else if(var2 == 7) {
            this.aClass582_8191 = Class523.method6274(var1, -1768433396);
         } else if(8 == var2) {
            Class218.method3029(var1, (byte)3);
         } else if(var2 == 9) {
            Class218.method3029(var1, (byte)3);
         } else if(10 == var2) {
            Class218.method3029(var1, (byte)3);
         } else if(var2 == 11) {
            this.aBool8194 = true;
         } else if(var2 == 12) {
            this.anInt8192 = var1.readInt((byte)5) * 515865761;
         } else if(13 == var2) {
            this.anInt8190 = var1.readInt((byte)5) * 1080113927;
         }
      }
   }

   void method7460(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1048746267);
         if(0 == var2) {
            return;
         }

         if(1 == var2) {
            this.anInterface67_8189 = Class218.method3029(var1, (byte)3);
         } else if(var2 == 2) {
            this.anInterface67_8186 = Class218.method3029(var1, (byte)3);
         } else if(var2 == 3) {
            this.anInterface67_8187 = Class218.method3029(var1, (byte)3);
         } else if(4 == var2) {
            this.anInterface67_8188 = Class218.method3029(var1, (byte)3);
         } else if(5 == var2) {
            this.aClass582_8193 = Class523.method6274(var1, 1378403632);
         } else if(6 == var2) {
            this.aClass582_8185 = Class523.method6274(var1, -1382541443);
         } else if(var2 == 7) {
            this.aClass582_8191 = Class523.method6274(var1, 635503012);
         } else if(8 == var2) {
            Class218.method3029(var1, (byte)3);
         } else if(var2 == 9) {
            Class218.method3029(var1, (byte)3);
         } else if(10 == var2) {
            Class218.method3029(var1, (byte)3);
         } else if(var2 == 11) {
            this.aBool8194 = true;
         } else if(var2 == 12) {
            this.anInt8192 = var1.readInt((byte)5) * 515865761;
         } else if(13 == var2) {
            this.anInt8190 = var1.readInt((byte)5) * 1080113927;
         }
      }
   }

   static final void method7461(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
   }

   static void method7462(Class681 var0, int var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2], -2101405822)).method3794(Class242.aClass94_2456, var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1], -774159316)?1:0;
      var0.anInt8623 -= -1957887669;
   }

   public static String method7463(int var0, boolean var1, int var2) {
      return var1 && var0 >= 0?Class214.method2957(var0, 10, var1, (byte)87):Integer.toString(var0);
   }
}
