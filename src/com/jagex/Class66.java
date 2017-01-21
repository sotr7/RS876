package com.jagex;

import com.jagex.Class299;
import com.jagex.RSByteBuffer;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Class66 {
   static final int anInt749 = 2;
   static final String aString751 = "passwordchoice.ws";
   static final int anInt752 = 4;
   static final int anInt753 = 1000;
   public static final int anInt755 = 5;
   static final int anInt756 = 3;
   static final String aString757 = "m=accountappeal/login.ws";
   static final String aString758 = "services";
   static final int anInt759 = 6;
   static final int anInt760 = 7;
   static final int anInt761 = 2;
   static BigInteger aBigInteger750 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   static BigInteger aBigInteger754 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

   public static long method1077() {
      try {
         URL var0 = new URL(Class299.method3990("services", false, (byte)0) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         RSByteBuffer var4 = new RSByteBuffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.buffer, 301018015 * var4.pos, 1000 - var4.pos * 301018015);
            if(-1 == var5) {
               var4.pos = 0;
               long var6 = var4.method9663(1034528583);
               return var6;
            }

            var4.pos += var5 * 801976415;
         } while(301018015 * var4.pos < 1000);

         return 0L;
      } catch (Exception var8) {
         return 0L;
      }
   }

   Class66() throws Throwable {
      throw new Error();
   }

   public static long method1078() {
      try {
         URL var0 = new URL(Class299.method3990("services", false, (byte)0) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         RSByteBuffer var4 = new RSByteBuffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.buffer, 301018015 * var4.pos, 1000 - var4.pos * 301018015);
            if(-1 == var5) {
               var4.pos = 0;
               long var6 = var4.method9663(288085212);
               return var6;
            }

            var4.pos += var5 * 801976415;
         } while(301018015 * var4.pos < 1000);

         return 0L;
      } catch (Exception var8) {
         return 0L;
      }
   }

   public static long method1079() {
      try {
         URL var0 = new URL(Class299.method3990("services", false, (byte)0) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         RSByteBuffer var4 = new RSByteBuffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.buffer, 301018015 * var4.pos, 1000 - var4.pos * 301018015);
            if(-1 == var5) {
               var4.pos = 0;
               long var6 = var4.method9663(386765785);
               return var6;
            }

            var4.pos += var5 * 801976415;
         } while(301018015 * var4.pos < 1000);

         return 0L;
      } catch (Exception var8) {
         return 0L;
      }
   }

   static boolean method1080(String var0) {
      if(null == var0) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }
}
