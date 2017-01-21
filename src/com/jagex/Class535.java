package com.jagex;

import com.jagex.Class1;
import com.jagex.Class10;
import com.jagex.Class113;
import com.jagex.Class115;
import com.jagex.Class238;
import com.jagex.Class277;
import com.jagex.Class322;
import com.jagex.Class333;
import com.jagex.Class380_Sub1;
import com.jagex.PacketFrameDecoder;
import com.jagex.Class521;
import com.jagex.RSByteBuffer;
import com.jagex.Class528;
import com.jagex.Class531_Sub1;
import com.jagex.Class681;
import com.jagex.Class83;
import com.jagex.Class89;
import java.util.Random;

public class Class535 {
   static final int anInt7193 = 4096;
   static int anInt7195;
   Class528[] aClass528Array7194;
   Class333[] aClass333Array7191;
   static byte[] aByteArray7192 = new byte[2048];

   Class535() {
      Class380_Sub1.method9143((byte)4);
      this.aClass528Array7194 = new Class528[4096];
      new Class322();
      this.aClass333Array7191 = new Class333[4];
      new Class333(4);
      new Class531_Sub1(this);
      new Class531_Sub1(this);
      new Class521(this);

      int var1;
      for(var1 = 0; var1 < 4096; ++var1) {
         this.aClass528Array7194[var1] = new Class528(this);
      }

      for(var1 = 0; var1 < 4; ++var1) {
         this.aClass333Array7191[var1] = new Class333(6);
      }

   }

   static {
      byte var0 = 22;
      int var1 = 2;
      aByteArray7192[0] = 0;
      aByteArray7192[1] = 1;

      for(int var2 = 2; var2 < var0; ++var2) {
         int var3 = 1 << (var2 >> 1) - 1;

         for(int var4 = 0; var4 < var3; ++var1) {
            aByteArray7192[var1] = (byte)var2;
            ++var4;
         }
      }

   }

   static final void method6401(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class83 var4 = (Class83)Class10.aClass40_Sub20_62.method89(var3, -1733888413);
      if(var4.method1167(138209473)) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class238)Class113.aClass40_Sub6_1371.method89(var2, -232712134)).method3294(var3, var4.aString842, -491837257);
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class238)Class113.aClass40_Sub6_1371.method89(var2, 9002834)).method3299(var3, var4.anInt843 * 1040538721, (byte)30);
      }

   }

   public static int method6402(Random var0, int var1, short var2) {
      if(null == var0) {
         var0 = Class89.aRandom858;
         if(var0 == null) {
            Object var3 = Class89.anObject859;
            synchronized(var3) {
               if(Class89.aRandom858 == null) {
                  Class89.aRandom858 = new Random();
               }

               var0 = Class89.aRandom858;
            }
         }
      }

      if(var1 <= 0) {
         throw new IllegalArgumentException();
      } else if(Class1.method517(var1, 348792153)) {
         return (int)(((long)var0.nextInt() & 4294967295L) * (long)var1 >> 32);
      } else {
         int var6 = Integer.MIN_VALUE - (int)(4294967296L % (long)var1);

         int var4;
         do {
            var4 = var0.nextInt();
         } while(var4 >= var6);

         return Class115.method1411(var4, var1, 899356369);
      }
   }

   static final void method6403(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
   }

   public static PacketFrameDecoder method6404(RSByteBuffer var0, short var1) {
      PacketFrameDecoder var2 = new PacketFrameDecoder();
      var2.anInt4092 = var0.readUnsignedShort(979517918) * -211921753;
      var2.aClass526_Sub21_Sub12_4093 = Class277.aClass56_3028.method994(-1382935785 * var2.anInt4092, (byte)0);
      return var2;
   }
}
