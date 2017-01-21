package com.jagex;

import com.jagex.IsaacCipher;
import com.jagex.Class219;
import com.jagex.Class40_Sub22;
import com.jagex.IncomingFrame;
import com.jagex.Class451;
import com.jagex.Class452;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Buffer;
import com.jagex.Connection;
import com.jagex.Class603;
import com.jagex.Class62;
import com.jagex.Class64;
import com.jagex.Class681;
import com.jagex.Class702;
import com.jagex.client;
import java.io.IOException;

public class Class111 {
   IsaacCipher aClass14_1340;
   public IsaacCipher aClass14_1342;
   IncomingFrame aClass420_1348;
   IncomingFrame aClass420_1351;
   IncomingFrame aClass420_1352;
   public static Class40_Sub22 aClass40_Sub22_1355;
   int anInt1344;
   public int anInt1345 = 0;
   public int anInt1336 = 0;
   Connection aClass560_1353;
   int anInt1338;
   int anInt1334;
   int anInt1347;
   Class702 aClass702_1335 = new Class702();
   RSByteBuffer aClass526_Sub36_1337 = new RSByteBuffer(1700);
   Buffer buffer = new Buffer('\u9c40');
   IncomingFrame CURRENT_FRAME = null;
   int currentFrame = 0;
   boolean aBool1343 = true;
   int anInt1349 = 0;
   public boolean aBool1346 = false;
   Class62 aClass62_1354 = new Class62();

   public Connection method1364(int var1) {
      return this.aClass560_1353;
   }

   public final void method1365(byte var1) throws IOException {
      if(this.aClass560_1353 != null && -123209119 * this.anInt1336 > 0) {
         this.aClass526_Sub36_1337.pos = 0;

         while(true) {
            OutFrameBuffer var2 = (OutFrameBuffer)this.aClass702_1335.method8206((byte)79);
            if(null == var2 || -2057965095 * var2.anInt10557 > this.aClass526_Sub36_1337.buffer.length - 301018015 * this.aClass526_Sub36_1337.pos) {
               this.aClass560_1353.write(this.aClass526_Sub36_1337.buffer, 0, 301018015 * this.aClass526_Sub36_1337.pos, 977152579);
               this.anInt1344 += -1822940641 * this.aClass526_Sub36_1337.pos;
               this.anInt1345 = 0;
               break;
            }

            this.aClass526_Sub36_1337.method9619(var2.out.buffer, 0, var2.anInt10557 * -2057965095, 1366938109);
            this.anInt1336 -= 1895488121 * var2.anInt10557;
            var2.method6332(-1949449864);
            var2.out.method9675(1144098392);
            var2.method9525(-446045228);
         }
      }

   }

   void method1366(Connection var1, String var2, int var3) {
      this.aClass560_1353 = var1;
      this.aClass62_1354.method1043(var2, (byte)1);
   }

   void method1367(byte var1) {
      if(0 == client.anInt11012 % 50) {
         this.anInt1338 = -1249071021 * this.anInt1344;
         this.anInt1344 = 0;
         this.anInt1334 = -394651265 * this.anInt1347;
         this.anInt1347 = 0;
      }

   }

   void method1368() {
      this.aClass560_1353 = null;
      this.aClass62_1354.method1043((String)null, (byte)1);
   }

   void method1369(int var1) {
      if(null != this.aClass560_1353) {
         this.aClass560_1353.stop((short)-17348);
         this.aClass560_1353 = null;
      }

      this.aClass62_1354.method1043((String)null, (byte)1);
   }

   void method1370(byte var1) {
      this.aClass560_1353 = null;
      this.aClass62_1354.method1043((String)null, (byte)1);
   }

   public final void write(OutFrameBuffer var1, byte var2) {
      this.aClass702_1335.method8176(var1, -1424305405);
      var1.anInt10557 = var1.out.pos * -827054537;
      var1.out.pos = 0;
      this.anInt1336 += 1895488121 * var1.anInt10557;
   }

   final void method1372() {
      this.aClass702_1335.method8188(-1553298425);
      this.anInt1336 = 0;
   }

   final void method1373() {
      this.aClass702_1335.method8188(723362382);
      this.anInt1336 = 0;
   }

   public final void method1374() throws IOException {
      if(this.aClass560_1353 != null && -123209119 * this.anInt1336 > 0) {
         this.aClass526_Sub36_1337.pos = 0;

         while(true) {
            OutFrameBuffer var1 = (OutFrameBuffer)this.aClass702_1335.method8206((byte)18);
            if(null == var1 || -2057965095 * var1.anInt10557 > this.aClass526_Sub36_1337.buffer.length - 301018015 * this.aClass526_Sub36_1337.pos) {
               this.aClass560_1353.write(this.aClass526_Sub36_1337.buffer, 0, 301018015 * this.aClass526_Sub36_1337.pos, 1614714536);
               this.anInt1344 += -1822940641 * this.aClass526_Sub36_1337.pos;
               this.anInt1345 = 0;
               break;
            }

            this.aClass526_Sub36_1337.method9619(var1.out.buffer, 0, var1.anInt10557 * -2057965095, 1721925171);
            this.anInt1336 -= 1895488121 * var1.anInt10557;
            var1.method6332(-1949449864);
            var1.out.method9675(818069181);
            var1.method9525(-264302098);
         }
      }

   }

   public final void method1375() throws IOException {
      if(this.aClass560_1353 != null && -123209119 * this.anInt1336 > 0) {
         this.aClass526_Sub36_1337.pos = 0;

         while(true) {
            OutFrameBuffer var1 = (OutFrameBuffer)this.aClass702_1335.method8206((byte)102);
            if(null == var1 || -2057965095 * var1.anInt10557 > this.aClass526_Sub36_1337.buffer.length - 301018015 * this.aClass526_Sub36_1337.pos) {
               this.aClass560_1353.write(this.aClass526_Sub36_1337.buffer, 0, 301018015 * this.aClass526_Sub36_1337.pos, -251465121);
               this.anInt1344 += -1822940641 * this.aClass526_Sub36_1337.pos;
               this.anInt1345 = 0;
               break;
            }

            this.aClass526_Sub36_1337.method9619(var1.out.buffer, 0, var1.anInt10557 * -2057965095, 1510483050);
            this.anInt1336 -= 1895488121 * var1.anInt10557;
            var1.method6332(-1949449864);
            var1.out.method9675(1340894251);
            var1.method9525(-309195964);
         }
      }

   }

   Class111() {
      Thread var1 = new Thread(this.aClass62_1354);
      var1.setDaemon(true);
      var1.setPriority(1);
      var1.start();
   }

   void method1376() {
      if(0 == client.anInt11012 % 50) {
         this.anInt1338 = -1249071021 * this.anInt1344;
         this.anInt1344 = 0;
         this.anInt1334 = -394651265 * this.anInt1347;
         this.anInt1347 = 0;
      }

   }

   void method1377() {
      if(0 == client.anInt11012 % 50) {
         this.anInt1338 = -1249071021 * this.anInt1344;
         this.anInt1344 = 0;
         this.anInt1334 = -394651265 * this.anInt1347;
         this.anInt1347 = 0;
      }

   }

   void method1378() {
      if(0 == client.anInt11012 % 50) {
         this.anInt1338 = -1249071021 * this.anInt1344;
         this.anInt1344 = 0;
         this.anInt1334 = -394651265 * this.anInt1347;
         this.anInt1347 = 0;
      }

   }

   public final void method1379() throws IOException {
      if(this.aClass560_1353 != null && -123209119 * this.anInt1336 > 0) {
         this.aClass526_Sub36_1337.pos = 0;

         while(true) {
            OutFrameBuffer var1 = (OutFrameBuffer)this.aClass702_1335.method8206((byte)98);
            if(null == var1 || -2057965095 * var1.anInt10557 > this.aClass526_Sub36_1337.buffer.length - 301018015 * this.aClass526_Sub36_1337.pos) {
               this.aClass560_1353.write(this.aClass526_Sub36_1337.buffer, 0, 301018015 * this.aClass526_Sub36_1337.pos, -698050606);
               this.anInt1344 += -1822940641 * this.aClass526_Sub36_1337.pos;
               this.anInt1345 = 0;
               break;
            }

            this.aClass526_Sub36_1337.method9619(var1.out.buffer, 0, var1.anInt10557 * -2057965095, 2117903433);
            this.anInt1336 -= 1895488121 * var1.anInt10557;
            var1.method6332(-1949449864);
            var1.out.method9675(-1446400840);
            var1.method9525(-1881143760);
         }
      }

   }

   final void method1380(byte var1) {
      this.aClass702_1335.method8188(1902320663);
      this.anInt1336 = 0;
   }

   void method1381() {
      this.aClass560_1353 = null;
      this.aClass62_1354.method1043((String)null, (byte)1);
   }

   static final void method1382(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -388625007 * Class451.localPlayer.anInt12167;
   }

   static final void method1383(Class681 var0, int var1) {
      if(Class603.aClass348_7890 != null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
         var0.aClass348_8633 = Class603.aClass348_7890;
         var0.aMap8638.put(Class452.aClass452_4936, Class219.method3039(var0.aClass348_8633, 1197164770));
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static void method1384(String[] var0, int[] var1, int var2, int var3, byte var4) {
      if(var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if(var7 == null || null != var0[var9] && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method1384(var0, var1, var2, var6 - 1, (byte)2);
         method1384(var0, var1, 1 + var6, var3, (byte)14);
      }

   }

   static final void method1385(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class64.method1071(var2, -687260078);
   }
}
