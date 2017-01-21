package com.jagex;

import com.jagex.IsaacCipher;
import com.jagex.Class16;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class231;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class29;
import com.jagex.Class294;
import com.jagex.Class300;
import com.jagex.Class315_Sub1;
import com.jagex.Class381;
import com.jagex.Class390;
import com.jagex.Class403;
import com.jagex.IncomingFrame;
import com.jagex.Class44;
import com.jagex.Class45;
import com.jagex.Class509;
import com.jagex.Class512;
import com.jagex.OutFrameBuffer;
import com.jagex.Class561;
import com.jagex.Class569;
import com.jagex.Class57;
import com.jagex.Class590;
import com.jagex.Class593;
import com.jagex.Class663;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class693;
import com.jagex.Interface40;
import com.jagex.client;
import java.io.IOException;

class Class194 implements Interface40 {
   // $FF: synthetic field
   Class231 this$0;

   public float method331() {
      return (float)Class230.preferences.aClass711_Sub29_10605.method10105((byte)57) / 255.0F;
   }

   public float method332(int var1) {
      return (float)Class230.preferences.aClass711_Sub29_10605.method10105((byte)101) / 255.0F;
   }

   public float method333() {
      return (float)Class230.preferences.aClass711_Sub29_10605.method10105((byte)94) / 255.0F;
   }

   Class194(Class231 var1) {
      this.this$0 = var1;
   }

   static void method2809(byte var0) {
      if(Class57.aClass44_687 != null) {
         try {
            short var1;
            if(-2014531435 * Class57.anInt686 == 0) {
               var1 = 250;
            } else {
               var1 = 2000;
            }

            Class57.anInt683 += 1750647843;
            if(-1591735413 * Class57.anInt683 > var1) {
               Class569.method6841((byte)26);
            }

            int var3;
            if(Class57.aClass44_687 == Class44.aClass44_459) {
               client.aClass111_11059.method1366(Class45.method925(Class16.aClass6_179.method549(-1532818671), '\u9c40', -2143352821), Class16.aClass6_179.address, -232643111);
               client.aClass111_11059.method1380((byte)5);
               OutFrameBuffer var2 = IncomingFrame.method4985(-1862155005);
               var2.out.writeByte(Class403.aClass403_4155.anInt4153 * -636933581, 100626475);
               var2.out.writeShort(0, -805078716);
               var3 = var2.out.pos * 301018015;
               var2.out.writeShort(876, -805078716);
               var2.out.writeShort(1, -805078716);
               Class57.anIntArray685 = Class512.method6186(var2, -353791464);
               int var4 = 301018015 * var2.out.pos;
               var2.out.method9616(client.aString11002, 1427405332);
               var2.out.writeShort(-264476799 * client.anInt10985, -805078716);
               var2.out.writeInt(client.anInt10989 * -885338537, -357564953);
               var2.out.writeInt(372500803 * client.anInt11260, -357564953);
               var2.out.method9616(Class381.aString3943, -1624982850);
               var2.out.writeByte(Class26.aClass673_247.getId(), -46604236);
               var2.out.writeByte(-767001605 * client.aClass676_11127.anInt8593, 1526878562);
               Class294.method3958(var2.out, (byte)-6);
               String var5 = client.aString10994;
               var2.out.writeByte(null == var5?0:1, 669247187);
               if(null != var5) {
                  var2.out.method9616(var5, 2119090324);
               }

               Class663.aClass526_Sub40_8522.method9759(var2.out, (byte)-11);
               var2.out.pos += 1318867609;
               var2.out.method9622(Class57.anIntArray685, var4, 301018015 * var2.out.pos, (short)768);
               var2.out.method9620(var2.out.pos * 301018015 - var3, (byte)-1);
               client.aClass111_11059.write(var2, (byte)46);
               client.aClass111_11059.method1365((byte)-98);
               Class57.aClass44_687 = Class44.aClass44_460;
            }

            if(Class44.aClass44_460 == Class57.aClass44_687) {
               if(client.aClass111_11059.method1364(-1184311292) == null) {
                  Class569.method6841((byte)-28);
                  return;
               }

               if(!client.aClass111_11059.method1364(-1184311292).method6727(1, -200161544)) {
                  return;
               }

               client.aClass111_11059.method1364(-1184311292).read(client.aClass111_11059.buffer.buffer, 0, 1, -143347500);
               Class57.aClass693_684 = (Class693)Class561.findIdentifiable(Class390.method4776((byte)-97), client.aClass111_11059.buffer.buffer[0] & 255, (byte)-74);
               if(Class57.aClass693_684 != Class693.aClass693_8709) {
                  client.aClass111_11059.method1369(2048370661);
               } else {
                  client.aClass111_11059.aClass14_1342 = new IsaacCipher(Class57.anIntArray685);
                  int[] var7 = new int[4];

                  for(var3 = 0; var3 < 4; ++var3) {
                     var7[var3] = 50 + Class57.anIntArray685[var3];
                  }

                  client.aClass111_11059.aClass14_1340 = new IsaacCipher(var7);
                  new IsaacCipher(var7);
                  client.aClass111_11059.buffer.setCipher(client.aClass111_11059.aClass14_1340, 438752233);
                  Class593.method7031(11, (byte)9);
                  client.aClass111_11059.method1380((byte)-100);
                  client.aClass111_11059.buffer.pos = 0;
                  client.aClass111_11059.aClass420_1348 = null;
                  client.aClass111_11059.aClass420_1351 = null;
                  client.aClass111_11059.aClass420_1352 = null;
                  client.aClass111_11059.anInt1349 = 0;
                  Class242.aClass94_2456.aClass600_1154.method7081((byte)-116);
                  Class590.method7012(-1009802275);
               }

               client.aClass111_11059.CURRENT_FRAME = null;
               Class57.aClass44_687 = null;
            }
         } catch (IOException var6) {
            Class569.method6841((byte)12);
         }

      }
   }

   static final void method2810(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)25);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class29.method733(var3, var4, var0, -1949329710);
   }

   static final void method2811(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1449227059 * client.anInt11111 - client.anInt11110 * -662273649;
   }

   static final void method2812(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      Class690.method8098(2, var2, var3, "", -193929211);
   }

   static final void method2813(Class681 var0, int var1) {
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < Class300.aClass448_Sub1Array3253.length; ++var4) {
         if(Class300.aClass448_Sub1Array3253[var4] != null && Class300.aClass448_Sub1Array3253[var4].method9204((byte)121)) {
            var2 += Class300.aClass448_Sub1Array3253[var4].method9200((byte)0);
            var3 += Class300.aClass448_Sub1Array3253[var4].method9218(1864543890);
         }
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 == 0?0:100 * var3 / var2;
   }

   static final void method2814(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class509.method6166(21851305)?1:0;
   }

   static final void method2815(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
