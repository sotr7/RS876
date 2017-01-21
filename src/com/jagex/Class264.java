package com.jagex;

import com.jagex.Class1;
import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class219;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class299;
import com.jagex.Class31;
import com.jagex.Class331;
import com.jagex.OutFrame;
import com.jagex.Class40_Sub9;
import com.jagex.Class41;
import com.jagex.Class45;
import com.jagex.Class452_Sub4;
import com.jagex.Class457;
import com.jagex.Class458;
import com.jagex.Class517;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class526_Sub24;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub6;
import com.jagex.Class566;
import com.jagex.Class573;
import com.jagex.Class594;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class700;
import com.jagex.Interface29;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

final class Class264 implements Interface29 {
   static InterfaceDef aClass245_2969;
   public static Class40_Sub9 aClass40_Sub9_2970;

   public long method182(String var1) {
      return Class526_Sub32.method9592(var1, -1967340263);
   }

   public long method184(String var1) {
      return Class526_Sub32.method9592(var1, -1967340263);
   }

   public long method183(String var1, int var2) {
      return Class526_Sub32.method9592(var1, -1967340263);
   }

   static void method3548(int var0, int var1, byte var2) {
      if(!Class331.aClass613_3498.aBool8041) {
         if(1 == Class31.anInt273 * 1600532433) {
            return;
         }

         if(Class457.aBool5160 && 2 == Class31.anInt273 * 1600532433 && Class517.aClass526_Sub21_Sub6_7040.aString11652.equals(Class45.aClass45_613.method920(Class26.aClass673_247, -827840379))) {
            return;
         }
      }

      Class1 var3 = Class526_Sub6.method9340(-1732982294);
      int var4 = var3.method509(Class45.aClass45_545.method920(Class26.aClass673_247, -827840379), 294581563);
      int var6;
      int var7;
      if(!Class31.aBool266) {
         for(Class526_Sub21_Sub6 var5 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8206((byte)63); null != var5; var5 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8181(203293648)) {
            var6 = Class458.method5416(var5, var3, (byte)11);
            if(var6 > var4) {
               var4 = var6;
            }
         }

         var4 += 8;
         var7 = 21 + Class31.anInt262 * 414128345 * Class31.anInt273 * 1600532433;
         Class573.anInt7689 = ((Class31.aBool302?26:22) + Class31.anInt273 * 1600532433 * 414128345 * Class31.anInt262) * -1877934245;
      } else {
         for(Class526_Sub21_Sub7 var8 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8143((byte)-1); var8 != null; var8 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8139(68831625)) {
            if(var8.anInt11664 * -1095890769 == 1) {
               var6 = Class458.method5416((Class526_Sub21_Sub6)var8.aClass696_11662.aClass526_Sub21_8758.aClass526_Sub21_10531, var3, (byte)35);
            } else {
               var6 = Class700.method8174(var8, var3, -250844871);
            }

            if(var6 > var4) {
               var4 = var6;
            }
         }

         var4 += 8;
         var7 = Class31.anInt274 * -1345788195 * 414128345 * Class31.anInt262 + 21;
         Class573.anInt7689 = -1877934245 * ((Class31.aBool302?26:22) + Class31.anInt262 * 414128345 * -1345788195 * Class31.anInt274);
      }

      var4 += 10;
      int var9 = var0 - var4 / 2;
      if(var4 + var9 > Class566.anInt7611 * 1895615023) {
         var9 = 1895615023 * Class566.anInt7611 - var4;
      }

      if(var9 < 0) {
         var9 = 0;
      }

      var6 = var1;
      if(var7 + var1 > Class526_Sub24.anInt10549 * 974996221) {
         var6 = 974996221 * Class526_Sub24.anInt10549 - var7;
      }

      if(var6 < 0) {
         var6 = 0;
      }

      Class41.anInt450 = -1061081427 * var9;
      Class679.anInt8602 = -1357950013 * var6;
      Class219.anInt2295 = var4 * -273074627;
      Class31.anInt303 = (int)(Math.random() * 24.0D) * 1477815941;
      Class31.aBool291 = true;
   }

   public static long method3549(byte var0) {
      try {
         URL var1 = new URL(Class299.method3990("services", false, (byte)0) + "m=accountappeal/login.ws");
         URLConnection var2 = var1.openConnection();
         var2.setRequestProperty("connection", "close");
         var2.setDoInput(true);
         var2.setDoOutput(true);
         var2.setConnectTimeout(5000);
         OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
         var3.write("data1=req");
         var3.flush();
         InputStream var4 = var2.getInputStream();
         RSByteBuffer var5 = new RSByteBuffer(new byte[1000]);

         do {
            int var6 = var4.read(var5.buffer, 301018015 * var5.pos, 1000 - var5.pos * 301018015);
            if(-1 == var6) {
               var5.pos = 0;
               long var7 = var5.method9663(1962633041);
               return var7;
            }

            var5.pos += var6 * 801976415;
         } while(301018015 * var5.pos < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }

   public static final void method3550(String var0, int var1, int var2) {
      Class111 var3 = Class452_Sub4.method9295((byte)119);
      OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4266, var3.aClass14_1342, -35659902);
      var4.out.writeByte(1 + Class594.method7039(var0, -8658033), -2099336009);
      var4.out.method9616(var0, 846852712);
      var4.out.writeByteC(var1, -802285532);
      var3.write(var4, (byte)31);
   }

   static final void method3551(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.method4486((String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629], (byte)23);
   }
}
