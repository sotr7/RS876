package com.jagex;

import com.jagex.Class216;
import com.jagex.Class218;
import com.jagex.InterfaceDef;
import com.jagex.Class292;
import com.jagex.Class294;
import com.jagex.Class299;
import com.jagex.Class329_Sub3;
import com.jagex.Class438;
import com.jagex.Class446;
import com.jagex.RSByteBuffer;
import com.jagex.Class594;
import com.jagex.Class66;
import com.jagex.client;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class329_Sub3_Sub1 extends Class329_Sub3 {
   float[] aFloatArray11425;
   float[] aFloatArray11426;
   int anInt11427 = 0;

   float method9160(float var1, float var2, float var3, int var4) {
      float var5 = this.aFloat10165 / (float)this.aClass432Array10168[this.anInt11427 * -766326167].method5075();
      float var6 = var5 * (this.aFloatArray11426[this.anInt11427 * -766326167] - this.aFloatArray11425[this.anInt11427 * -766326167]) + this.aFloatArray11425[-766326167 * this.anInt11427];
      return var6;
   }

   public float method4207(byte var1) {
      return this.aClass432Array10168[this.anInt11427 * -766326167].method5071(this.aFloat10165);
   }

   float method9163(float var1, float var2, float var3) {
      float var4 = this.aFloat10165 / (float)this.aClass432Array10168[this.anInt11427 * -766326167].method5075();
      float var5 = var4 * (this.aFloatArray11426[this.anInt11427 * -766326167] - this.aFloatArray11425[this.anInt11427 * -766326167]) + this.aFloatArray11425[-766326167 * this.anInt11427];
      return var5;
   }

   void method9168(float var1, float var2, int var3) {
      this.aFloat10165 += var1;
      if(this.aFloat10165 > (float)this.aClass432Array10168[-766326167 * this.anInt11427].method5075()) {
         this.aFloat10165 = (float)this.aClass432Array10168[this.anInt11427 * -766326167].method5075();
      }

   }

   public Class446 method4204(int var1) {
      Class446 var2 = Class446.method5312();
      double[] var3 = this.aClass432Array10168[this.anInt11427 * -766326167].method5065(this.aFloat10165);
      var2.aFloat4917 = (float)var3[0];
      var2.aFloat4915 = (float)var3[1];
      var2.aFloat4919 = (float)var3[2];
      return var2;
   }

   public double[] method4205(byte var1) {
      return this.aClass432Array10168[-766326167 * this.anInt11427].method5065(this.aFloat10165);
   }

   public float method9162(byte var1) {
      return this.aFloat10165;
   }

   public float method4208() {
      return this.aClass432Array10168[this.anInt11427 * -766326167].method5071(this.aFloat10165);
   }

   void method9167(RSByteBuffer var1, int var2, byte var3) {
      this.aFloatArray11425 = new float[var2];
      this.aFloatArray11426 = new float[var2];
      this.anInt11427 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         this.aFloatArray11425[var4] = var1.method9634((byte)1);
         this.aFloatArray11426[var4] = var1.method9634((byte)1);
      }

   }

   public Class329_Sub3_Sub1(Class292 var1) {
      super(var1);
   }

   public float method9169() {
      return this.aFloat10165;
   }

   void method9165(RSByteBuffer var1, int var2) {
      this.aFloatArray11425 = new float[var2];
      this.aFloatArray11426 = new float[var2];
      this.anInt11427 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aFloatArray11425[var3] = var1.method9634((byte)1);
         this.aFloatArray11426[var3] = var1.method9634((byte)1);
      }

   }

   void method9166(RSByteBuffer var1, int var2) {
      this.aFloatArray11425 = new float[var2];
      this.aFloatArray11426 = new float[var2];
      this.anInt11427 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aFloatArray11425[var3] = var1.method9634((byte)1);
         this.aFloatArray11426[var3] = var1.method9634((byte)1);
      }

   }

   public Class446 method4214() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10168[this.anInt11427 * -766326167].method5065(this.aFloat10165);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public Class446 method4215() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10168[this.anInt11427 * -766326167].method5065(this.aFloat10165);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public double[] method4218() {
      return this.aClass432Array10168[-766326167 * this.anInt11427].method5065(this.aFloat10165);
   }

   public double[] method4217() {
      return this.aClass432Array10168[-766326167 * this.anInt11427].method5065(this.aFloat10165);
   }

   void method9164() {
      this.anInt11427 += 1230988761;
   }

   public double[] method4219() {
      return this.aClass432Array10168[-766326167 * this.anInt11427].method5065(this.aFloat10165);
   }

   public double[] method4223() {
      return this.aClass432Array10168[-766326167 * this.anInt11427].method5065(this.aFloat10165);
   }

   void method9170(float var1, float var2) {
      this.aFloat10165 += var1;
      if(this.aFloat10165 > (float)this.aClass432Array10168[-766326167 * this.anInt11427].method5075()) {
         this.aFloat10165 = (float)this.aClass432Array10168[this.anInt11427 * -766326167].method5075();
      }

   }

   public float method4203() {
      return this.aClass432Array10168[this.anInt11427 * -766326167].method5071(this.aFloat10165);
   }

   public float method4224() {
      return this.aClass432Array10168[this.anInt11427 * -766326167].method5071(this.aFloat10165);
   }

   public float method4220() {
      return this.aClass432Array10168[this.anInt11427 * -766326167].method5071(this.aFloat10165);
   }

   public float method4226() {
      return this.aClass432Array10168[this.anInt11427 * -766326167].method5071(this.aFloat10165);
   }

   void method9171(float var1, float var2) {
      this.aFloat10165 += var1;
      if(this.aFloat10165 > (float)this.aClass432Array10168[-766326167 * this.anInt11427].method5075()) {
         this.aFloat10165 = (float)this.aClass432Array10168[this.anInt11427 * -766326167].method5075();
      }

   }

   void method9172(float var1, float var2) {
      this.aFloat10165 += var1;
      if(this.aFloat10165 > (float)this.aClass432Array10168[-766326167 * this.anInt11427].method5075()) {
         this.aFloat10165 = (float)this.aClass432Array10168[this.anInt11427 * -766326167].method5075();
      }

   }

   public double[] method4221() {
      return this.aClass432Array10168[-766326167 * this.anInt11427].method5065(this.aFloat10165);
   }

   void method9161(int var1) {
      this.anInt11427 += 1230988761;
   }

   public static final int method10492(long var0, String var2, int var3) {
      Random var4 = new Random();
      RSByteBuffer var5 = new RSByteBuffer(128);
      RSByteBuffer var6 = new RSByteBuffer(128);
      int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
      var5.writeByte(10, -1931662668);

      int var8;
      for(var8 = 0; var8 < 4; ++var8) {
         var5.writeInt(var4.nextInt(), -357564953);
      }

      var5.writeInt(var7[0], -357564953);
      var5.writeInt(var7[1], -357564953);
      var5.method9621(var0);
      var5.method9621(0L);

      for(var8 = 0; var8 < 4; ++var8) {
         var5.writeInt(var4.nextInt(), -357564953);
      }

      var5.method9651(Class66.aBigInteger750, Class66.aBigInteger754, (byte)-41);
      var6.writeByte(10, 1719173481);

      for(var8 = 0; var8 < 3; ++var8) {
         var6.writeInt(var4.nextInt(), -357564953);
      }

      var6.method9621(var4.nextLong());
      var6.method9680(var4.nextLong());
      Class294.method3958(var6, (byte)-71);
      var6.method9621(var4.nextLong());
      var6.method9651(Class66.aBigInteger750, Class66.aBigInteger754, (byte)-66);
      var8 = Class594.method7039(var2, -165984328);
      if(var8 % 8 != 0) {
         var8 += 8 - var8 % 8;
      }

      RSByteBuffer var9 = new RSByteBuffer(var8);
      var9.method9616(var2, 1751343093);
      var9.pos = var8 * 801976415;
      var9.method9647(var7, 1600505743);
      RSByteBuffer var10 = new RSByteBuffer(var5.pos * 301018015 + 5 + var6.pos * 301018015 + 301018015 * var9.pos);
      var10.writeByte(2, 2067946807);
      var10.writeByte(var5.pos * 301018015, -1058635367);
      var10.method9619(var5.buffer, 0, var5.pos * 301018015, 1419085347);
      var10.writeByte(301018015 * var6.pos, -817521557);
      var10.method9619(var6.buffer, 0, var6.pos * 301018015, 1925856565);
      var10.writeShort(301018015 * var9.pos, -805078716);
      var10.method9619(var9.buffer, 0, 301018015 * var9.pos, 1492700457);
      String var11 = Class218.method3035(var10.buffer, -1742122938);

      try {
         URL var12 = new URL(Class299.method3990("services", false, (byte)0) + "m=accountappeal/login.ws");
         URLConnection var13 = var12.openConnection();
         var13.setDoInput(true);
         var13.setDoOutput(true);
         var13.setConnectTimeout(5000);
         OutputStreamWriter var14 = new OutputStreamWriter(var13.getOutputStream());
         var14.write("data2=" + Class216.method2985(var11, -1735112219) + "&dest=" + Class216.method2985("passwordchoice.ws", -2075158281));
         var14.flush();
         InputStream var15 = var13.getInputStream();
         var10 = new RSByteBuffer(new byte[1000]);

         do {
            int var16 = var15.read(var10.buffer, 301018015 * var10.pos, 1000 - var10.pos * 301018015);
            if(-1 == var16) {
               var14.close();
               var15.close();
               String var18 = new String(var10.buffer);
               if(var18.startsWith("OFFLINE")) {
                  return 4;
               } else if(var18.startsWith("WRONG")) {
                  return 7;
               } else if(var18.startsWith("RELOAD")) {
                  return 3;
               } else if(var18.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var10.method9648(var7, 1739260197);

                  while(301018015 * var10.pos > 0 && var10.buffer[var10.pos * 301018015 - 1] == 0) {
                     var10.pos -= 801976415;
                  }

                  var18 = new String(var10.buffer, 0, 301018015 * var10.pos);
                  if(InterfaceDef.method3384(var18, -976635300)) {
                     Class438.openJSURL(var18, true, client.aBool10997, 1321179463);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var10.pos += 801976415 * var16;
         } while(var10.pos * 301018015 < 1000);

         return 5;
      } catch (Throwable var17) {
         var17.printStackTrace();
         return 5;
      }
   }
}
