package com.jagex;

import com.jagex.Class115;
import com.jagex.Class237;
import com.jagex.OutFrame;
import com.jagex.Class451;
import com.jagex.OutFrameBuffer;
import com.jagex.Class568;
import com.jagex.Class57;
import com.jagex.Class570;
import com.jagex.Class681;
import com.jagex.Class703;
import com.jagex.client;

public class Class263 {
   String aString2968;
   int anInt2966;
   int anInt2967;

   Class263(String var1, int var2, int var3) {
      this.aString2968 = var1;
      this.anInt2966 = var2 * -195089603;
      this.anInt2967 = var3 * 1751725351;
   }

   static final void method3545(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      if(null != Class451.localPlayer.aClass633_12181) {
         Class451.localPlayer.aClass633_12181.method7496(var2, var3, -233257673);
      }
   }

   static void method3546(int var0) {
      Class570.aTwitchWebcamDeviceArray7653 = Class570.aTwitchTV7639.GetWebcamDevices();
   }

   public static void method3547(String var0, String var1, int var2, boolean var3, String var4, int var5) {
      if(11 == -558705405 * client.anInt11038) {
         OutFrameBuffer var6 = Class115.method1414(OutFrame.aClass405_4259, client.aClass111_11059.aClass14_1342, 835037903);
         var6.out.writeShort(0, -805078716);
         int var7 = var6.out.pos * 301018015;
         var6.out.method9616(var0, -2059709035);
         var6.out.method9616(var1, 528060403);
         var6.out.writeByte(var2, 400914431);
         var6.out.writeByte(var3?1:0, -1117141601);
         var6.out.method9616(var4, -873751743);
         var6.out.pos += 1318867609;
         var6.out.method9622(Class57.anIntArray685, var7, var6.out.pos * 301018015, (short)768);
         var6.out.method9620(var6.out.pos * 301018015 - var7, (byte)-1);
         client.aClass111_11059.write(var6, (byte)-80);
         if(var2 < 13) {
            client.aBool11035 = true;
            Class237.method3286(-1192325312);
         }

         Class568.aClass703_7616 = Class703.aClass703_8790;
      }
   }
}
