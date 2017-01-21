package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class313_Sub1;
import com.jagex.Class331;
import com.jagex.Class384;
import com.jagex.Class387;
import com.jagex.Class389;
import com.jagex.Class39;
import com.jagex.Class407;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class651;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class711_Sub33;
import com.jagex.Interface61;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class501 {
   static Interface61 anInterface61_5632;

   Class501() throws Throwable {
      throw new Error();
   }

   public static boolean method6010() {
      return null != anInterface61_5632;
   }

   public static boolean method6011() {
      return null != anInterface61_5632;
   }

   public static Class387 method6012(RSByteBuffer var0, byte var1) {
      Class384 var2 = Class711_Sub33.method10141((byte)-62)[var0.readUnsignedByte(2025362093)];
      Class389 var3 = Class331.method4251((byte)15)[var0.readUnsignedByte(1716016801)];
      int var4 = var0.readShort((byte)1);
      int var5 = var0.readShort((byte)1);
      int var6 = var0.readBigSmart((byte)-56);
      int var7 = var0.readInt((byte)5);
      int var8 = var0.readUnsignedByte(-300326311);
      return new Class387(var2, var3, var4, var5, var6, var7, var8);
   }

   static final void method6013(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class651.method7780(var3, var4, var0, 1035177611);
   }

   static final void method6014(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= 379191958;
      byte var4 = 10;
      byte[] var5 = new byte[]{(byte)var2.anIntArray8622[-1730576285 * var2.anInt8623]};
      byte[] var6 = new byte[]{(byte)var2.anIntArray8622[-1730576285 * var2.anInt8623 + 1]};
      Class407.method4878(var0, var4, var5, var6, var2, 1974478879);
   }

   public static int method6015(int var0) {
      if(1952632649 * Class39.anInt444 == -1) {
         Class39[] var1 = Class313_Sub1.method9058(-526264301);

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Class39 var3 = var1[var2];
            if(-208367727 * var3.anInt442 > 1952632649 * Class39.anInt444) {
               Class39.anInt444 = var3.anInt442 * -1124919799;
            }
         }

         Class39.anInt444 += 646402809;
      }

      return Class39.anInt444 * 1952632649;
   }

   public static int method6016(int var0, int var1, int var2) {
      Class570.aTwitchWebcamFrameData7647 = new TwitchWebcamFrameData();
      return var0 >= 0 && var0 < Class570.aTwitchWebcamDeviceArray7653.length?Class570.aTwitchTV7639.StartWebcamDevice(-17931217 * Class570.aTwitchWebcamDeviceArray7653[var0].anInt1138, var1):-1;
   }
}
