package com.jagex;

import com.jagex.Class195;
import com.jagex.Class199_Sub7;
import com.jagex.Class230;
import com.jagex.Class3;
import com.jagex.Class32;
import com.jagex.Class397;
import com.jagex.Class417;
import com.jagex.Class418;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.Class499;
import com.jagex.RSByteBuffer;
import com.jagex.Class529;
import com.jagex.Class538;
import com.jagex.Class573;
import com.jagex.Class593;
import com.jagex.Class622;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.RuntimeException_Sub4;
import com.jagex.client;

public class Class635 {
   public static final int anInt8277 = 2;
   public static final int anInt8278 = 1;
   public static final int anInt8280 = 3;
   public static final int anInt8281 = 0;
   public static final int anInt8282 = 1;
   public static final int anInt8283 = 2;
   public static final int anInt8284 = 3;
   public static final int anInt8285 = 4;
   public static final int anInt8286 = 5;
   static final int anInt8288 = 100;
   public static final int anInt8293 = 0;
   static final int anInt8294 = 3;
   public static Class466 aClass466_8297;
   public int anInt8289;
   public int anInt8290;
   public int anInt8291;
   public int anInt8292;
   public int anInt8279;
   public int anInt8287;
   public int anInt8295;
   public int[][] anIntArrayArray8296 = new int[3][5];

   void method7550(RSByteBuffer var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-259236183);
         if(0 == var3) {
            return;
         }

         if(1 == var3) {
            this.anInt8289 = var1.readInt((byte)5) * -865284593;
         } else if(2 == var3) {
            this.anInt8290 = var1.readInt((byte)5) * -2101861615;
         } else if(var3 == 3) {
            this.anInt8291 = var1.readInt((byte)5) * -1137497787;
         } else if(4 == var3) {
            this.anInt8292 = var1.readUnsignedByte(1005431081) * -614246189;
         } else if(var3 == 5) {
            this.anInt8279 = var1.readUnsignedByte(1581835160) * -1499048369;
         } else if(var3 == 6) {
            this.anInt8287 = var1.readInt((byte)5) * 1664056203;
         } else if(var3 == 7) {
            this.anInt8295 = var1.readInt((byte)5) * 2125037133;
         } else if(var3 >= 100) {
            var3 -= 100;
            this.anIntArrayArray8296[var3 & (int)(Math.pow(2.0D, 3.0D) - 1.0D)][var3 >> 3] = var1.readUnsignedShort(1245932623);
         }
      }
   }

   void method7551(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1469815039);
         if(0 == var2) {
            return;
         }

         if(1 == var2) {
            this.anInt8289 = var1.readInt((byte)5) * -865284593;
         } else if(2 == var2) {
            this.anInt8290 = var1.readInt((byte)5) * -2101861615;
         } else if(var2 == 3) {
            this.anInt8291 = var1.readInt((byte)5) * -1137497787;
         } else if(4 == var2) {
            this.anInt8292 = var1.readUnsignedByte(1540132090) * -614246189;
         } else if(var2 == 5) {
            this.anInt8279 = var1.readUnsignedByte(-1851626595) * -1499048369;
         } else if(var2 == 6) {
            this.anInt8287 = var1.readInt((byte)5) * 1664056203;
         } else if(var2 == 7) {
            this.anInt8295 = var1.readInt((byte)5) * 2125037133;
         } else if(var2 >= 100) {
            var2 -= 100;
            this.anIntArrayArray8296[var2 & (int)(Math.pow(2.0D, 3.0D) - 1.0D)][var2 >> 3] = var1.readUnsignedShort(1607315442);
         }
      }
   }

   void method7552(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1017071345);
         if(0 == var2) {
            return;
         }

         if(1 == var2) {
            this.anInt8289 = var1.readInt((byte)5) * -865284593;
         } else if(2 == var2) {
            this.anInt8290 = var1.readInt((byte)5) * -2101861615;
         } else if(var2 == 3) {
            this.anInt8291 = var1.readInt((byte)5) * -1137497787;
         } else if(4 == var2) {
            this.anInt8292 = var1.readUnsignedByte(1672213983) * -614246189;
         } else if(var2 == 5) {
            this.anInt8279 = var1.readUnsignedByte(-977960993) * -1499048369;
         } else if(var2 == 6) {
            this.anInt8287 = var1.readInt((byte)5) * 1664056203;
         } else if(var2 == 7) {
            this.anInt8295 = var1.readInt((byte)5) * 2125037133;
         } else if(var2 >= 100) {
            var2 -= 100;
            this.anIntArrayArray8296[var2 & (int)(Math.pow(2.0D, 3.0D) - 1.0D)][var2 >> 3] = var1.readUnsignedShort(213050181);
         }
      }
   }

   public Class635(Class466 var1) {
      byte[] var2 = var1.method5541(Class622.aClass622_8142.anInt8139 * 127490303, 16777472);
      if(null == var2) {
         ;
      }

      this.method7550(new RSByteBuffer(var2), (byte)-73);
   }

   static final void method7553(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub11_10609.method9948((byte)117) == 1?1:0;
   }

   static final void method7554(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub5_10612.method9888(1427294417);
   }

   static void method7555(byte var0) {
      RuntimeException_Sub4.aClass111_12105.method1380((byte)-105);
      RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
      RuntimeException_Sub4.aClass111_12105.CURRENT_FRAME = null;
      RuntimeException_Sub4.aClass111_12105.aClass420_1348 = null;
      RuntimeException_Sub4.aClass111_12105.aClass420_1351 = null;
      RuntimeException_Sub4.aClass111_12105.aClass420_1352 = null;
      RuntimeException_Sub4.aClass111_12105.currentFrame = 0;
      RuntimeException_Sub4.aClass111_12105.anInt1349 = 0;
      client.anInt11159 = 0;
      Class3.method536(-227053614);
      Class195.method2826((byte)-9);

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1] = null;
      }

      Class451.localPlayer = null;

      for(var1 = 0; var1 < client.anInt11051 * 2027369339; ++var1) {
         Class639_Sub1_Sub2_Sub1 var2 = (Class639_Sub1_Sub2_Sub1)client.aClass526_Sub7Array11050[var1].anObject10399;
         if(null != var2) {
            var2.anInt11911 = 790295043;
         }
      }

      Class199_Sub7.method9005(198546004);
      Class418.method4974(Class397.method4824((byte)1), (byte)53);
      Class593.method7031(9, (byte)86);

      for(var1 = 0; var1 < 111; ++var1) {
         client.aBoolArray11236[var1] = true;
      }

      Class529.method6373(RuntimeException_Sub4.aClass111_12105, -34064670);
      Class593.aClass657_7820 = null;
      Class417.aLong4507 = 0L;
      Class684.method8044((byte)-62);
      Class538.aClass149_Sub1_7225.method8340(1716603022);
   }

   static boolean method7556(boolean var0, boolean var1, String var2, String var3, long var4) {
      Class32.aBool336 = var0;
      if(!var1) {
         Class32.anInt312 = 206732105;
      }

      Class32.aBool351 = var1;
      Class32.aString315 = var2;
      Class32.aString344 = var3;
      Class32.aLong313 = var4 * -8857201640932667085L;
      if(Class32.aBool351 || !Class32.aString315.equals("") && !Class32.aString344.equals("")) {
         if(184 != Class32.anInt310 * 327983535) {
            Class32.anInt354 = 0;
            Class32.anInt356 = -1325949865;
            Class32.anInt355 = -39580743;
         }

         RuntimeException_Sub4.aClass111_12105.aBool1346 = false;
         Class499.method6008(-3, 967644322);
         Class32.anInt341 = 923071676;
         Class32.anInt347 = 0;
         Class32.anInt348 = 0;
         return true;
      } else {
         Class499.method6008(3, 1227455418);
         Class573.method6918(-222651429);
         return false;
      }
   }
}
