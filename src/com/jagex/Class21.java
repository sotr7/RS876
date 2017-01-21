package com.jagex;

import com.jagex.Class200;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class29;
import com.jagex.Class315_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.client;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class21 {
   long aLong205;
   RandomAccessFile aRandomAccessFile203;
   long aLong204;

   public final int method649(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.aRandomAccessFile203.read(var1, var2, var3);
      if(var4 > 0) {
         this.aLong205 += -8668985780420691763L * (long)var4;
      }

      return var4;
   }

   public final void method650(byte[] var1, int var2, int var3, byte var4) throws IOException {
      if((long)var3 + this.aLong205 * -8770396136012647419L > -5071195712197850359L * this.aLong204) {
         this.aRandomAccessFile203.seek(-5071195712197850359L * this.aLong204);
         this.aRandomAccessFile203.write(1);
         throw new EOFException();
      } else {
         this.aRandomAccessFile203.write(var1, var2, var3);
         this.aLong205 += -8668985780420691763L * (long)var3;
      }
   }

   public final void method651(int var1) throws IOException {
      if(null != this.aRandomAccessFile203) {
         this.aRandomAccessFile203.close();
         this.aRandomAccessFile203 = null;
      }

   }

   public final long method652() throws IOException {
      return this.aRandomAccessFile203.length();
   }

   public final int method653(byte[] var1, int var2, int var3, byte var4) throws IOException {
      int var5 = this.aRandomAccessFile203.read(var1, var2, var3);
      if(var5 > 0) {
         this.aLong205 += -8668985780420691763L * (long)var5;
      }

      return var5;
   }

   final void method654(long var1) throws IOException {
      this.aRandomAccessFile203.seek(var1);
      this.aLong205 = var1 * -8668985780420691763L;
   }

   void method655() throws Throwable {
      if(null != this.aRandomAccessFile203) {
         System.out.println("");
         this.method651(1000472510);
      }

   }

   public Class21(File var1, String var2, long var3) throws IOException {
      if(-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if(var1.length() > var3) {
         var1.delete();
      }

      this.aRandomAccessFile203 = new RandomAccessFile(var1, var2);
      this.aLong204 = -2281232276652657863L * var3;
      this.aLong205 = 0L;
      int var5 = this.aRandomAccessFile203.read();
      if(var5 != -1 && !var2.equals("r")) {
         this.aRandomAccessFile203.seek(0L);
         this.aRandomAccessFile203.write(var5);
      }

      this.aRandomAccessFile203.seek(0L);
   }

   final void method656(long var1) throws IOException {
      this.aRandomAccessFile203.seek(var1);
      this.aLong205 = var1 * -8668985780420691763L;
   }

   final void method657(long var1) throws IOException {
      this.aRandomAccessFile203.seek(var1);
      this.aLong205 = var1 * -8668985780420691763L;
   }

   public final long method658(byte var1) throws IOException {
      return this.aRandomAccessFile203.length();
   }

   final void method659(long var1) throws IOException {
      this.aRandomAccessFile203.seek(var1);
      this.aLong205 = var1 * -8668985780420691763L;
   }

   public final void method660() throws IOException {
      if(null != this.aRandomAccessFile203) {
         this.aRandomAccessFile203.close();
         this.aRandomAccessFile203 = null;
      }

   }

   public final void method661() throws IOException {
      if(null != this.aRandomAccessFile203) {
         this.aRandomAccessFile203.close();
         this.aRandomAccessFile203 = null;
      }

   }

   void method662() throws Throwable {
      if(null != this.aRandomAccessFile203) {
         System.out.println("");
         this.method651(659999760);
      }

   }

   public final int method663(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.aRandomAccessFile203.read(var1, var2, var3);
      if(var4 > 0) {
         this.aLong205 += -8668985780420691763L * (long)var4;
      }

      return var4;
   }

   public void finalize() throws Throwable {
      if(null != this.aRandomAccessFile203) {
         System.out.println("");
         this.method651(1480107685);
      }

   }

   static final void method664(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 172478073 * client.anInt11180;
   }

   static final void method665(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class200.method2869(var3, var4, var0, -604224895);
   }

   static final void method666(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)20);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class29.method733(var3, var4, var0, -2043859898);
   }
}
