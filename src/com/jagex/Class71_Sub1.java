package com.jagex;

import com.jagex.Class115;
import com.jagex.Class230;
import com.jagex.OutFrame;
import com.jagex.Class522;
import com.jagex.OutFrameBuffer;
import com.jagex.Class681;
import com.jagex.Class71;
import com.jagex.Interface65;
import com.jagex.client;

public class Class71_Sub1 extends Class71 implements Interface65 {
   public void method140() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4164, client.aClass111_11060.aClass14_1342, -92136217);
      var1.out.write128Byte(848666353 * this.anInt794, (byte)-71);
      var1.out.writeByteC(-121198185 * this.anInt793, -802285532);
      var1.out.write128Byte(this.anInt795 * -1802738073, 1535671028);
      var1.out.writeLEShort128(this.anInt790 * -610717749, -885167448);
      var1.out.writeIntV1(-624277775 * this.anInt791, -2063401121);
      var1.out.writeByteC(703092121 * this.anInt792, -802285532);
      var1.out.writeIntV2(this.anInt797 * 1500980675, (byte)-83);
      int var2 = (this.aBool799?2:0) | (this.aBool796?1:0);
      var1.out.write128Byte(var2, (byte)77);
      client.aClass111_11060.write(var1, (byte)-44);
   }

   public void method228(int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4164, client.aClass111_11060.aClass14_1342, 1804654555);
      var2.out.write128Byte(848666353 * this.anInt794, (byte)51);
      var2.out.writeByteC(-121198185 * this.anInt793, -802285532);
      var2.out.write128Byte(this.anInt795 * -1802738073, 1657127014);
      var2.out.writeLEShort128(this.anInt790 * -610717749, 1758965635);
      var2.out.writeIntV1(-624277775 * this.anInt791, -350254319);
      var2.out.writeByteC(703092121 * this.anInt792, -802285532);
      var2.out.writeIntV2(this.anInt797 * 1500980675, (byte)-26);
      int var3 = (this.aBool799?2:0) | (this.aBool796?1:0);
      var2.out.write128Byte(var3, (byte)-50);
      client.aClass111_11060.write(var2, (byte)33);
   }

   public void method298() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4164, client.aClass111_11060.aClass14_1342, 1421789023);
      var1.out.write128Byte(848666353 * this.anInt794, (byte)105);
      var1.out.writeByteC(-121198185 * this.anInt793, -802285532);
      var1.out.write128Byte(this.anInt795 * -1802738073, -269579305);
      var1.out.writeLEShort128(this.anInt790 * -610717749, -1636136580);
      var1.out.writeIntV1(-624277775 * this.anInt791, 831136239);
      var1.out.writeByteC(703092121 * this.anInt792, -802285532);
      var1.out.writeIntV2(this.anInt797 * 1500980675, (byte)-24);
      int var2 = (this.aBool799?2:0) | (this.aBool796?1:0);
      var1.out.write128Byte(var2, (byte)-1);
      client.aClass111_11060.write(var1, (byte)-54);
   }

   Class71_Sub1(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, int var9) {
      super(var1, var2, var3 > '\uffff'?'\uffff':var3, var4, var5 > 255?255:var5, var6, var7, var8, var9 > 255?255:var9);
   }

   static final void method9726(Class681 var0, byte var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub27_10648, 0, (short)-19566);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }
}
