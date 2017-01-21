package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class20;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class577;
import com.jagex.Class614;
import com.jagex.Class619;
import com.jagex.client;
import java.net.Socket;
import java.util.Iterator;

public class Class604 {
   String aString7892;
   int anInt7893;
   static Socket aSocket7894;
   static long aLong7895;

   public static void method7101(byte var0) {
      Class619.aClass20_8116 = new Class20(8);
      Class619.anInt8120 = 0;
      Iterator var1 = Class619.aList8112.iterator();

      while(var1.hasNext()) {
         Class614 var2 = (Class614)var1.next();
         var2.method7245();
      }

   }

   static Class577 method7102(RSByteBuffer var0, int var1) {
      int var2 = var0.readUnsignedByte(816429075);
      int var3 = var0.readUnsignedByte(453380270);
      int var4 = var0.readUnsignedByte(149157105);
      int[] var5 = new int[var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         var5[var6] = var0.readUnsignedByte(1263715411);
      }

      return new Class577(var2, var3, var5);
   }

   static void method7103(Class111 var0, int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4185, var0.aClass14_1342, -545566482);
      var0.write(var2, (byte)63);
      client.aBool11302 = true;
   }
}
