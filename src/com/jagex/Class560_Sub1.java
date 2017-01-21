package com.jagex;

import com.jagex.Class242;
import com.jagex.Class285;
import com.jagex.Class32;
import com.jagex.Class544;
import com.jagex.Class554;
import com.jagex.Connection;
import com.jagex.Class594;
import com.jagex.Class681;
import com.jagex.Class76;
import java.io.IOException;
import java.net.Socket;

public class Class560_Sub1 extends Connection {
   Socket aSocket10688;
   Class554 aClass554_10689;
   Class544 aClass544_10690;

   public int method6740(byte[] var1, int var2, int var3) throws IOException {
      return this.aClass554_10689.method6674(var1, var2, var3, 1770715020);
   }

   public boolean method6727(int var1, int var2) throws IOException {
      return this.aClass554_10689.method6672(var1, 820990223);
   }

   public int available(short var1) throws IOException {
      return this.aClass554_10689.method6673(877226711);
   }

   public boolean method6731(int var1) throws IOException {
      return this.aClass554_10689.method6672(var1, 234400366);
   }

   public void write(byte[] var1, int var2, int var3, int var4) throws IOException {
      this.aClass544_10690.method6497(var1, var2, var3, 1032723070);
   }

   public void stop(short var1) {
      this.aClass544_10690.method6498(2087481860);

      try {
         this.aSocket10688.close();
      } catch (IOException var3) {
         ;
      }

      this.aClass554_10689.method6675((byte)-41);
   }

   public void method6729(int var1) {
      this.aClass554_10689.method6676((byte)-50);
      this.aClass544_10690.method6499(-2064262136);
   }

   public void finalize() {
      this.stop((short)-25552);
   }

   public void method6735() {
      this.aClass554_10689.method6676((byte)1);
      this.aClass544_10690.method6499(-2064262136);
   }

   public boolean method6732(int var1) throws IOException {
      return this.aClass554_10689.method6672(var1, -492262415);
   }

   public boolean method6730(int var1) throws IOException {
      return this.aClass554_10689.method6672(var1, -212063328);
   }

   void method9738() {
      this.stop((short)-24163);
   }

   Class560_Sub1(Socket var1, int var2) throws IOException {
      this.aSocket10688 = var1;
      this.aSocket10688.setSoTimeout(30000);
      this.aSocket10688.setTcpNoDelay(true);
      this.aSocket10688.setReceiveBufferSize(65536);
      this.aSocket10688.setSendBufferSize(65536);
      this.aClass554_10689 = new Class554(this.aSocket10688.getInputStream(), var2);
      this.aClass544_10690 = new Class544(this.aSocket10688.getOutputStream(), var2);
   }

   public int method6733() throws IOException {
      return this.aClass554_10689.method6673(877226711);
   }

   public int method6734() throws IOException {
      return this.aClass554_10689.method6673(877226711);
   }

   public int read(byte[] var1, int var2, int var3, int var4) throws IOException {
      return this.aClass554_10689.method6674(var1, var2, var3, 805573150);
   }

   public int method6736(byte[] var1, int var2, int var3) throws IOException {
      return this.aClass554_10689.method6674(var1, var2, var3, 256807387);
   }

   void method9739() {
      this.stop((short)-10611);
   }

   public int method6738(byte[] var1, int var2, int var3) throws IOException {
      return this.aClass554_10689.method6674(var1, var2, var3, 707333998);
   }

   public int method6724(byte[] var1, int var2, int var3) throws IOException {
      return this.aClass554_10689.method6674(var1, var2, var3, -915120994);
   }

   public void method6726() {
      this.aClass544_10690.method6498(1985888686);

      try {
         this.aSocket10688.close();
      } catch (IOException var2) {
         ;
      }

      this.aClass554_10689.method6675((byte)-73);
   }

   public void method6741() {
      this.aClass554_10689.method6676((byte)-104);
      this.aClass544_10690.method6499(-2064262136);
   }

   public void method6739(byte[] var1, int var2, int var3) throws IOException {
      this.aClass544_10690.method6497(var1, var2, var3, 364985935);
   }

   public void method6737() {
      this.aClass554_10689.method6676((byte)-91);
      this.aClass544_10690.method6499(-2064262136);
   }

   static boolean method9740(int var0, int var1) {
      return var0 >= Class594.aClass594_7826.anInt7833 * -1226971375 && var0 <= -1226971375 * Class594.aClass594_7830.anInt7833;
   }

   static void method9741(Class681 var0, int var1) {
      var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1], 220823611)).method3787(Class242.aClass94_2456, (byte)-72)?1:0;
   }

   static final void method9742(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class32.anInt355 * 704345463;
   }
}
