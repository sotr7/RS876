package com.jagex;

import com.jagex.Class167;
import com.jagex.Class304;
import com.jagex.Class466;
import com.jagex.RSByteBuffer;
import com.jagex.Class539_Sub1_Sub1_Sub1;
import com.jagex.Class614;
import com.jagex.Class619;
import com.jagex.Interface46;
import com.jagex.Interface49;
import java.util.LinkedList;
import java.util.zip.Inflater;

public class Class75 {
   public static Class466 aClass466_808;
   Inflater anInflater807;

   public void method1114(RSByteBuffer var1, byte[] var2, int var3) {
      if(var1.buffer[301018015 * var1.pos] == 31 && var1.buffer[1 + var1.pos * 301018015] == -117) {
         if(null == this.anInflater807) {
            this.anInflater807 = new Inflater(true);
         }

         try {
            this.anInflater807.setInput(var1.buffer, 10 + 301018015 * var1.pos, var1.buffer.length - (8 + var1.pos * 301018015 + 10));
            this.anInflater807.inflate(var2);
         } catch (Exception var5) {
            this.anInflater807.reset();
            throw new RuntimeException("");
         }

         this.anInflater807.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   Class75(int var1, int var2, int var3) {
   }

   public byte[] method1115(byte[] var1, byte var2) {
      RSByteBuffer var3 = new RSByteBuffer(var1);
      var3.pos = (var1.length - 4) * 801976415;
      int var4 = var3.method9630((byte)0);
      byte[] var5 = new byte[var4];
      var3.pos = 0;
      this.method1114(var3, var5, -1216432778);
      return var5;
   }

   public byte[] method1116(byte[] var1) {
      RSByteBuffer var2 = new RSByteBuffer(var1);
      var2.pos = (var1.length - 4) * 801976415;
      int var3 = var2.method9630((byte)0);
      byte[] var4 = new byte[var3];
      var2.pos = 0;
      this.method1114(var2, var4, -103495397);
      return var4;
   }

   public Class75() {
      this(-1, 1000000, 1000000);
   }

   public byte[] method1117(byte[] var1) {
      RSByteBuffer var2 = new RSByteBuffer(var1);
      var2.pos = (var1.length - 4) * 801976415;
      int var3 = var2.method9630((byte)0);
      byte[] var4 = new byte[var3];
      var2.pos = 0;
      this.method1114(var2, var4, 273018832);
      return var4;
   }

   public static void method1118(Interface49 var0, Interface46 var1, int var2) {
      Class619.anInt8119 = 0;
      Class619.anInt8110 = 0;
      Class619.aList8112 = new LinkedList();
      Class619.aClass539_Sub1_Sub1_Sub1Array8108 = new Class539_Sub1_Sub1_Sub1[1024];
      Class619.aClass614Array8117 = new Class614[Class167.anIntArray1896[Class619.anInt8121 * 1865223851] + 1];
      Class619.anInt8109 = 0;
      Class619.anInt8107 = 0;
      Class304.anInterface46_3280 = var1;
   }
}
