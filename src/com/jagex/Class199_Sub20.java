package com.jagex;

import com.jagex.Class186;
import com.jagex.Class199;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class387;
import com.jagex.Class45;
import com.jagex.Class466;
import com.jagex.Class470;
import com.jagex.RSByteBuffer;
import com.jagex.Class549;
import com.jagex.Class552;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Class70;
import com.jagex.client;

public class Class199_Sub20 extends Class199 {
   public static Class466 aClass466_9971;
   int anInt9970;
   int anInt9967;
   String aString9968;
   int anInt9969;
   int anInt9966;

   Class199_Sub20(RSByteBuffer var1) {
      super(var1);
      this.anInt9970 = var1.readUnsignedShort(164951172) * -340739891;
      this.anInt9967 = var1.readUnsignedShort(1864310671) * -1796912369;
      this.aString9968 = var1.readString(-20295985);
      this.anInt9969 = var1.readInt((byte)5) * 1820068345;
      this.anInt9966 = var1.readUnsignedShort(789409525) * 1656396575;
   }

   public void method2861() {
      Class70.method1096(Class692.anInt8703 * -395336755, -552733691 * this.anInt9970, this.anInt9967 * -132758545, Class387.method4762(this.anInt9970 * -552733691, -132758545 * this.anInt9967, -395336755 * Class692.anInt8703, 1304960035), -1055842081 * this.anInt9966, this.anInt9969 * 1446275145, this.aString9968, (byte)-27);
   }

   public void method2859() {
      Class70.method1096(Class692.anInt8703 * -395336755, -552733691 * this.anInt9970, this.anInt9967 * -132758545, Class387.method4762(this.anInt9970 * -552733691, -132758545 * this.anInt9967, -395336755 * Class692.anInt8703, 1125029205), -1055842081 * this.anInt9966, this.anInt9969 * 1446275145, this.aString9968, (byte)-17);
   }

   public void method2855() {
      Class70.method1096(Class692.anInt8703 * -395336755, -552733691 * this.anInt9970, this.anInt9967 * -132758545, Class387.method4762(this.anInt9970 * -552733691, -132758545 * this.anInt9967, -395336755 * Class692.anInt8703, 1035946927), -1055842081 * this.anInt9966, this.anInt9969 * 1446275145, this.aString9968, (byte)71);
   }

   public void method2856() {
      Class70.method1096(Class692.anInt8703 * -395336755, -552733691 * this.anInt9970, this.anInt9967 * -132758545, Class387.method4762(this.anInt9970 * -552733691, -132758545 * this.anInt9967, -395336755 * Class692.anInt8703, 1841913354), -1055842081 * this.anInt9966, this.anInt9969 * 1446275145, this.aString9968, (byte)59);
   }

   public void method2857() {
      Class70.method1096(Class692.anInt8703 * -395336755, -552733691 * this.anInt9970, this.anInt9967 * -132758545, Class387.method4762(this.anInt9970 * -552733691, -132758545 * this.anInt9967, -395336755 * Class692.anInt8703, 1124892505), -1055842081 * this.anInt9966, this.anInt9969 * 1446275145, this.aString9968, (byte)102);
   }

   public void method2852(byte var1) {
      Class70.method1096(Class692.anInt8703 * -395336755, -552733691 * this.anInt9970, this.anInt9967 * -132758545, Class387.method4762(this.anInt9970 * -552733691, -132758545 * this.anInt9967, -395336755 * Class692.anInt8703, 1366540232), -1055842081 * this.anInt9966, this.anInt9969 * 1446275145, this.aString9968, (byte)44);
   }

   public void method2858() {
      Class70.method1096(Class692.anInt8703 * -395336755, -552733691 * this.anInt9970, this.anInt9967 * -132758545, Class387.method4762(this.anInt9970 * -552733691, -132758545 * this.anInt9967, -395336755 * Class692.anInt8703, 1973653659), -1055842081 * this.anInt9966, this.anInt9969 * 1446275145, this.aString9968, (byte)-65);
   }

   static final void method9034(int var0) {
      if(client.aFloat11210 < 1099.0F) {
         client.aFloat11210 = 1099.0F;
      }

      if(client.aFloat11210 > 2818.0F) {
         client.aFloat11210 = 2818.0F;
      }

      while(client.aFloat11105 >= 16384.0F) {
         client.aFloat11105 -= 16384.0F;
      }

      while(client.aFloat11105 < 0.0F) {
         client.aFloat11105 += 16384.0F;
      }

      Class470 var1 = client.aClass505_11204.method6094((byte)-72);
      Class549 var2 = client.aClass505_11204.method6072(-549827581);
      int var3 = -445020973 * Class45.anInt639 >> 9;
      int var4 = 1090885877 * Class186.anInt2122 >> 9;
      int var5 = Class387.method4762(-445020973 * Class45.anInt639, Class186.anInt2122 * 1090885877, -395336755 * Class692.anInt8703, 1549970122);
      int var6 = 0;
      int var7;
      if(var3 > 3 && var4 > 3 && var3 < client.aClass505_11204.method6056(-1746741811) - 4 && var4 < client.aClass505_11204.method6057(126749238) - 4) {
         for(var7 = var3 - 4; var7 <= 4 + var3; ++var7) {
            for(int var8 = var4 - 4; var8 <= 4 + var4; ++var8) {
               int var9 = Class692.anInt8703 * -395336755;
               if(var9 < 3 && var1.method5614(var7, var8, 1717666255)) {
                  ++var9;
               }

               int var10 = 0;
               byte[][] var11 = client.aClass505_11204.method6063(var9, -228800253);
               if(var11 != null) {
                  var10 = 8 * (var11[var7][var8] & 255) << 2;
               }

               if(var2.aClass148Array7288 != null && var2.aClass148Array7288[var9] != null) {
                  int var12 = var5 - (var2.aClass148Array7288[var9].method1714(var7, var8, 369911990) - var10);
                  if(var12 > var6) {
                     var6 = var12;
                  }
               }
            }
         }
      }

      var7 = 1536 * (var6 >> 2);
      if(var7 > 786432) {
         var7 = 786432;
      }

      if(var7 < 262144) {
         var7 = 262144;
      }

      if(var7 > client.anInt11113 * 1723323455) {
         client.anInt11113 += (var7 - 1723323455 * client.anInt11113) / 24 * -1861608513;
      } else if(var7 < 1723323455 * client.anInt11113) {
         client.anInt11113 += (var7 - client.anInt11113 * 1723323455) / 80 * -1861608513;
      }

   }

   static final void method9035(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class552.method6649(var3, var4, var0, -1700951235);
   }
}
