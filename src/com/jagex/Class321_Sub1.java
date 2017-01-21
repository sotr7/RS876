package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class276;
import com.jagex.Class284;
import com.jagex.Class321;
import com.jagex.Class374;
import com.jagex.Class444;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Class681;
import com.jagex.Exception_Sub5;

public final class Class321_Sub1 extends Class321 {
   static final int anInt9991 = 1;
   static final int anInt9994 = 2;
   static final int anInt9995 = 3;
   static final int anInt9997 = 0;
   static final int anInt9998 = 6;
   static final int anInt9999 = 7;
   static final int anInt10000 = 0;
   static final int anInt10001 = 1;
   static final int anInt10002 = 2;
   static final int anInt10003 = 3;
   static final int anInt10004 = 5;
   static final int anInt10005 = 4;
   int[] anIntArray10006;
   Class276[] aClass276Array9996 = new Class276[3];
   int[][] anIntArrayArray9992 = new int[3][7];
   Class444 aClass444_9993 = new Class444(1.0F, 1.0F, 1.0F, 1.0F);
   Class444 aClass444_10008 = new Class444(0.0F, 0.0F, 0.0F, 0.0F);
   Class284 aClass284_10007;

   public void method4145() {
      this.aClass284_10007.method3757(this.aClass276Array9996[1]);
      this.aClass284_10007.method3722();
      this.anIntArray10006 = this.anIntArrayArray9992[this.aClass284_10007.method3732(-1575612483)];
      this.aClass284_10007.method3749(this.anIntArray10006[2], 1, this.anInterface38_3445, 959289949);
      this.aClass284_10007.method3747(this.anIntArray10006[4], this.aClass433_3448, 789961294);
      this.method9048(-1813588790);
   }

   void method9045() {
      this.aClass284_10007.method3749(this.anIntArray10006[1], 0, this.anInterface38_3444, 959289949);
      this.aClass174_Sub3_3447.method8761(this.aClass433_3449);
      this.aClass284_10007.method3748(this.anIntArray10006[0], this.aClass433_3449, 16777215);
      this.aClass284_10007.method3747(this.anIntArray10006[3], this.aClass433_3446, 921393617);
      this.aClass284_10007.method3743(this.anIntArray10006[5], this.aClass444_9993.aFloat4897, this.aClass444_9993.aFloat4898, this.aClass444_9993.aFloat4899, this.aClass444_9993.aFloat4900, -1733727764);
      this.aClass284_10007.method3743(this.anIntArray10006[6], this.aClass444_10008.aFloat4897, this.aClass444_10008.aFloat4898, this.aClass444_10008.aFloat4899, this.aClass444_10008.aFloat4900, 184418355);
      this.aClass174_Sub3_3447.method8820(0, this.anInterface35_3443);
      this.aClass174_Sub3_3447.method8833(this.aClass335_3451);
      this.aClass174_Sub3_3447.method8825(Class374.aClass374_3899, this.anInt3450, 2);
   }

   public Class321_Sub1(Class174_Sub3 var1) throws Exception_Sub5 {
      super(var1);
      this.method9047(1896426558);
   }

   boolean method9046() throws Exception_Sub5 {
      this.aClass284_10007 = this.aClass174_Sub3_3447.method8725("Sprite");
      Class526_Sub13_Sub1 var1 = this.aClass284_10007.method3750("WVPMatrix", 2112079813);
      Class526_Sub13_Sub1 var2 = this.aClass284_10007.method3750("SpriteSampler", 2110488641);
      Class526_Sub13_Sub1 var3 = this.aClass284_10007.method3750("MaskSampler", 2140512480);
      Class526_Sub13_Sub1 var4 = this.aClass284_10007.method3750("MulColour", 2142213557);
      Class526_Sub13_Sub1 var5 = this.aClass284_10007.method3750("AddColour", 2124026094);
      Class526_Sub13_Sub1 var6 = this.aClass284_10007.method3750("SpriteTexCoordMatrix", 2140017881);
      Class526_Sub13_Sub1 var7 = this.aClass284_10007.method3750("MaskTexCoordMatrix", 2124691615);
      this.aClass276Array9996[0] = this.aClass284_10007.method3742("Normal", (byte)93);
      this.aClass276Array9996[1] = this.aClass284_10007.method3742("Masked", (byte)84);
      this.aClass276Array9996[2] = this.aClass284_10007.method3742("AlphaTex", (byte)93);

      for(int var8 = 0; var8 < 3; ++var8) {
         int var9 = this.aClass284_10007.method3774(this.aClass276Array9996[var8], -696989138);
         this.anIntArrayArray9992[var8][0] = var1.method10625(var9);
         this.anIntArrayArray9992[var8][1] = var2.method10625(var9);
         this.anIntArrayArray9992[var8][2] = var3.method10625(var9);
         this.anIntArrayArray9992[var8][5] = var4.method10625(var9);
         this.anIntArrayArray9992[var8][6] = var5.method10625(var9);
         this.anIntArrayArray9992[var8][3] = var6.method10625(var9);
         this.anIntArrayArray9992[var8][4] = var7.method10625(var9);
      }

      this.aClass284_10007.method3757(this.aClass276Array9996[0]);
      return true;
   }

   boolean method9047(int var1) throws Exception_Sub5 {
      this.aClass284_10007 = this.aClass174_Sub3_3447.method8725("Sprite");
      Class526_Sub13_Sub1 var2 = this.aClass284_10007.method3750("WVPMatrix", 2105948064);
      Class526_Sub13_Sub1 var3 = this.aClass284_10007.method3750("SpriteSampler", 2112235606);
      Class526_Sub13_Sub1 var4 = this.aClass284_10007.method3750("MaskSampler", 2106026257);
      Class526_Sub13_Sub1 var5 = this.aClass284_10007.method3750("MulColour", 2117558039);
      Class526_Sub13_Sub1 var6 = this.aClass284_10007.method3750("AddColour", 2107774542);
      Class526_Sub13_Sub1 var7 = this.aClass284_10007.method3750("SpriteTexCoordMatrix", 2130736457);
      Class526_Sub13_Sub1 var8 = this.aClass284_10007.method3750("MaskTexCoordMatrix", 2117161844);
      this.aClass276Array9996[0] = this.aClass284_10007.method3742("Normal", (byte)22);
      this.aClass276Array9996[1] = this.aClass284_10007.method3742("Masked", (byte)106);
      this.aClass276Array9996[2] = this.aClass284_10007.method3742("AlphaTex", (byte)95);

      for(int var9 = 0; var9 < 3; ++var9) {
         int var10 = this.aClass284_10007.method3774(this.aClass276Array9996[var9], -1838248523);
         this.anIntArrayArray9992[var9][0] = var2.method10625(var10);
         this.anIntArrayArray9992[var9][1] = var3.method10625(var10);
         this.anIntArrayArray9992[var9][2] = var4.method10625(var10);
         this.anIntArrayArray9992[var9][5] = var5.method10625(var10);
         this.anIntArrayArray9992[var9][6] = var6.method10625(var10);
         this.anIntArrayArray9992[var9][3] = var7.method10625(var10);
         this.anIntArrayArray9992[var9][4] = var8.method10625(var10);
      }

      this.aClass284_10007.method3757(this.aClass276Array9996[0]);
      return true;
   }

   public void method4143() {
      this.aClass284_10007.method3757(this.aClass276Array9996[1]);
      this.aClass284_10007.method3722();
      this.anIntArray10006 = this.anIntArrayArray9992[this.aClass284_10007.method3732(-506518805)];
      this.aClass284_10007.method3749(this.anIntArray10006[2], 1, this.anInterface38_3445, 959289949);
      this.aClass284_10007.method3747(this.anIntArray10006[4], this.aClass433_3448, -1196048242);
      this.method9048(-731121302);
   }

   public void method4144(int var1, int var2) {
      switch(var1) {
      case 0:
         this.aClass444_9993.method5204(var2);
         this.aClass444_10008.method5204(0);
         break;
      case 1:
         this.aClass444_9993.method5204(-1);
         this.aClass444_10008.method5204(0);
         break;
      case 2:
         this.aClass444_9993.method5204(var2);
         this.aClass444_10008.method5204(0);
         break;
      case 3:
         this.aClass444_9993.method5204(16777215 | var2 & -16777216);
         this.aClass444_10008.method5204(var2 & 16777215);
         break;
      case 4:
         this.aClass444_9993.method5204(-1);
         this.aClass444_10008.method5204(var2);
         this.aClass444_10008.method5201();
      }

   }

   public void method4149() {
      this.aClass284_10007.method3757(this.aClass276Array9996[0]);
      this.aClass284_10007.method3722();
      this.anIntArray10006 = this.anIntArrayArray9992[this.aClass284_10007.method3732(-1315975514)];
      this.method9048(-687155858);
   }

   public void method4146() {
      this.aClass284_10007.method3757(this.aClass276Array9996[1]);
      this.aClass284_10007.method3722();
      this.anIntArray10006 = this.anIntArrayArray9992[this.aClass284_10007.method3732(-464533378)];
      this.aClass284_10007.method3749(this.anIntArray10006[2], 1, this.anInterface38_3445, 959289949);
      this.aClass284_10007.method3747(this.anIntArray10006[4], this.aClass433_3448, 728339382);
      this.method9048(93669031);
   }

   public void method4140() {
      this.aClass284_10007.method3757(this.aClass276Array9996[1]);
      this.aClass284_10007.method3722();
      this.anIntArray10006 = this.anIntArrayArray9992[this.aClass284_10007.method3732(128184356)];
      this.aClass284_10007.method3749(this.anIntArray10006[2], 1, this.anInterface38_3445, 959289949);
      this.aClass284_10007.method3747(this.anIntArray10006[4], this.aClass433_3448, -1926322247);
      this.method9048(79882238);
   }

   public void method4142() {
      this.aClass284_10007.method3757(this.aClass276Array9996[0]);
      this.aClass284_10007.method3722();
      this.anIntArray10006 = this.anIntArrayArray9992[this.aClass284_10007.method3732(-1466809761)];
      this.method9048(-894543224);
   }

   void method9048(int var1) {
      this.aClass284_10007.method3749(this.anIntArray10006[1], 0, this.anInterface38_3444, 959289949);
      this.aClass174_Sub3_3447.method8761(this.aClass433_3449);
      this.aClass284_10007.method3748(this.anIntArray10006[0], this.aClass433_3449, 16777215);
      this.aClass284_10007.method3747(this.anIntArray10006[3], this.aClass433_3446, 905936994);
      this.aClass284_10007.method3743(this.anIntArray10006[5], this.aClass444_9993.aFloat4897, this.aClass444_9993.aFloat4898, this.aClass444_9993.aFloat4899, this.aClass444_9993.aFloat4900, -130483670);
      this.aClass284_10007.method3743(this.anIntArray10006[6], this.aClass444_10008.aFloat4897, this.aClass444_10008.aFloat4898, this.aClass444_10008.aFloat4899, this.aClass444_10008.aFloat4900, 995470550);
      this.aClass174_Sub3_3447.method8820(0, this.anInterface35_3443);
      this.aClass174_Sub3_3447.method8833(this.aClass335_3451);
      this.aClass174_Sub3_3447.method8825(Class374.aClass374_3899, this.anInt3450, 2);
   }

   public void method4148() {
      this.aClass284_10007.method3757(this.aClass276Array9996[1]);
      this.aClass284_10007.method3722();
      this.anIntArray10006 = this.anIntArrayArray9992[this.aClass284_10007.method3732(-1240207597)];
      this.aClass284_10007.method3749(this.anIntArray10006[2], 1, this.anInterface38_3445, 959289949);
      this.aClass284_10007.method3747(this.anIntArray10006[4], this.aClass433_3448, -1158591235);
      this.method9048(1254487718);
   }

   boolean method9049() throws Exception_Sub5 {
      this.aClass284_10007 = this.aClass174_Sub3_3447.method8725("Sprite");
      Class526_Sub13_Sub1 var1 = this.aClass284_10007.method3750("WVPMatrix", 2142165539);
      Class526_Sub13_Sub1 var2 = this.aClass284_10007.method3750("SpriteSampler", 2133150470);
      Class526_Sub13_Sub1 var3 = this.aClass284_10007.method3750("MaskSampler", 2112420015);
      Class526_Sub13_Sub1 var4 = this.aClass284_10007.method3750("MulColour", 2137772663);
      Class526_Sub13_Sub1 var5 = this.aClass284_10007.method3750("AddColour", 2129572227);
      Class526_Sub13_Sub1 var6 = this.aClass284_10007.method3750("SpriteTexCoordMatrix", 2125251555);
      Class526_Sub13_Sub1 var7 = this.aClass284_10007.method3750("MaskTexCoordMatrix", 2145079785);
      this.aClass276Array9996[0] = this.aClass284_10007.method3742("Normal", (byte)45);
      this.aClass276Array9996[1] = this.aClass284_10007.method3742("Masked", (byte)55);
      this.aClass276Array9996[2] = this.aClass284_10007.method3742("AlphaTex", (byte)101);

      for(int var8 = 0; var8 < 3; ++var8) {
         int var9 = this.aClass284_10007.method3774(this.aClass276Array9996[var8], -1786845956);
         this.anIntArrayArray9992[var8][0] = var1.method10625(var9);
         this.anIntArrayArray9992[var8][1] = var2.method10625(var9);
         this.anIntArrayArray9992[var8][2] = var3.method10625(var9);
         this.anIntArrayArray9992[var8][5] = var4.method10625(var9);
         this.anIntArrayArray9992[var8][6] = var5.method10625(var9);
         this.anIntArrayArray9992[var8][3] = var6.method10625(var9);
         this.anIntArrayArray9992[var8][4] = var7.method10625(var9);
      }

      this.aClass284_10007.method3757(this.aClass276Array9996[0]);
      return true;
   }

   public void method4141(int var1, int var2) {
      switch(var1) {
      case 0:
         this.aClass444_9993.method5204(var2);
         this.aClass444_10008.method5204(0);
         break;
      case 1:
         this.aClass444_9993.method5204(-1);
         this.aClass444_10008.method5204(0);
         break;
      case 2:
         this.aClass444_9993.method5204(var2);
         this.aClass444_10008.method5204(0);
         break;
      case 3:
         this.aClass444_9993.method5204(16777215 | var2 & -16777216);
         this.aClass444_10008.method5204(var2 & 16777215);
         break;
      case 4:
         this.aClass444_9993.method5204(-1);
         this.aClass444_10008.method5204(var2);
         this.aClass444_10008.method5201();
      }

   }

   boolean method9050() throws Exception_Sub5 {
      this.aClass284_10007 = this.aClass174_Sub3_3447.method8725("Sprite");
      Class526_Sub13_Sub1 var1 = this.aClass284_10007.method3750("WVPMatrix", 2102057539);
      Class526_Sub13_Sub1 var2 = this.aClass284_10007.method3750("SpriteSampler", 2140859071);
      Class526_Sub13_Sub1 var3 = this.aClass284_10007.method3750("MaskSampler", 2105346201);
      Class526_Sub13_Sub1 var4 = this.aClass284_10007.method3750("MulColour", 2118917451);
      Class526_Sub13_Sub1 var5 = this.aClass284_10007.method3750("AddColour", 2110138237);
      Class526_Sub13_Sub1 var6 = this.aClass284_10007.method3750("SpriteTexCoordMatrix", 2136978247);
      Class526_Sub13_Sub1 var7 = this.aClass284_10007.method3750("MaskTexCoordMatrix", 2114271256);
      this.aClass276Array9996[0] = this.aClass284_10007.method3742("Normal", (byte)94);
      this.aClass276Array9996[1] = this.aClass284_10007.method3742("Masked", (byte)47);
      this.aClass276Array9996[2] = this.aClass284_10007.method3742("AlphaTex", (byte)41);

      for(int var8 = 0; var8 < 3; ++var8) {
         int var9 = this.aClass284_10007.method3774(this.aClass276Array9996[var8], -2078532639);
         this.anIntArrayArray9992[var8][0] = var1.method10625(var9);
         this.anIntArrayArray9992[var8][1] = var2.method10625(var9);
         this.anIntArrayArray9992[var8][2] = var3.method10625(var9);
         this.anIntArrayArray9992[var8][5] = var4.method10625(var9);
         this.anIntArrayArray9992[var8][6] = var5.method10625(var9);
         this.anIntArrayArray9992[var8][3] = var6.method10625(var9);
         this.anIntArrayArray9992[var8][4] = var7.method10625(var9);
      }

      this.aClass284_10007.method3757(this.aClass276Array9996[0]);
      return true;
   }

   boolean method9051() throws Exception_Sub5 {
      this.aClass284_10007 = this.aClass174_Sub3_3447.method8725("Sprite");
      Class526_Sub13_Sub1 var1 = this.aClass284_10007.method3750("WVPMatrix", 2115756601);
      Class526_Sub13_Sub1 var2 = this.aClass284_10007.method3750("SpriteSampler", 2132547033);
      Class526_Sub13_Sub1 var3 = this.aClass284_10007.method3750("MaskSampler", 2115909690);
      Class526_Sub13_Sub1 var4 = this.aClass284_10007.method3750("MulColour", 2129286520);
      Class526_Sub13_Sub1 var5 = this.aClass284_10007.method3750("AddColour", 2108782088);
      Class526_Sub13_Sub1 var6 = this.aClass284_10007.method3750("SpriteTexCoordMatrix", 2109313484);
      Class526_Sub13_Sub1 var7 = this.aClass284_10007.method3750("MaskTexCoordMatrix", 2144157882);
      this.aClass276Array9996[0] = this.aClass284_10007.method3742("Normal", (byte)11);
      this.aClass276Array9996[1] = this.aClass284_10007.method3742("Masked", (byte)92);
      this.aClass276Array9996[2] = this.aClass284_10007.method3742("AlphaTex", (byte)50);

      for(int var8 = 0; var8 < 3; ++var8) {
         int var9 = this.aClass284_10007.method3774(this.aClass276Array9996[var8], -2021502815);
         this.anIntArrayArray9992[var8][0] = var1.method10625(var9);
         this.anIntArrayArray9992[var8][1] = var2.method10625(var9);
         this.anIntArrayArray9992[var8][2] = var3.method10625(var9);
         this.anIntArrayArray9992[var8][5] = var4.method10625(var9);
         this.anIntArrayArray9992[var8][6] = var5.method10625(var9);
         this.anIntArrayArray9992[var8][3] = var6.method10625(var9);
         this.anIntArrayArray9992[var8][4] = var7.method10625(var9);
      }

      this.aClass284_10007.method3757(this.aClass276Array9996[0]);
      return true;
   }

   void method9052() {
      this.aClass284_10007.method3749(this.anIntArray10006[1], 0, this.anInterface38_3444, 959289949);
      this.aClass174_Sub3_3447.method8761(this.aClass433_3449);
      this.aClass284_10007.method3748(this.anIntArray10006[0], this.aClass433_3449, 16777215);
      this.aClass284_10007.method3747(this.anIntArray10006[3], this.aClass433_3446, 36171870);
      this.aClass284_10007.method3743(this.anIntArray10006[5], this.aClass444_9993.aFloat4897, this.aClass444_9993.aFloat4898, this.aClass444_9993.aFloat4899, this.aClass444_9993.aFloat4900, -1767237534);
      this.aClass284_10007.method3743(this.anIntArray10006[6], this.aClass444_10008.aFloat4897, this.aClass444_10008.aFloat4898, this.aClass444_10008.aFloat4899, this.aClass444_10008.aFloat4900, 1057520665);
      this.aClass174_Sub3_3447.method8820(0, this.anInterface35_3443);
      this.aClass174_Sub3_3447.method8833(this.aClass335_3451);
      this.aClass174_Sub3_3447.method8825(Class374.aClass374_3899, this.anInt3450, 2);
   }

   public void method4147() {
      this.aClass284_10007.method3757(this.aClass276Array9996[1]);
      this.aClass284_10007.method3722();
      this.anIntArray10006 = this.anIntArrayArray9992[this.aClass284_10007.method3732(25720253)];
      this.aClass284_10007.method3749(this.anIntArray10006[2], 1, this.anInterface38_3445, 959289949);
      this.aClass284_10007.method3747(this.anIntArray10006[4], this.aClass433_3448, 1479258594);
      this.method9048(-749420067);
   }

   static boolean method9053(int var0, int var1) {
      return var0 == 0 || 8 == var0;
   }

   static final void method9054(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629];
      String var3 = (String)var0.anObjectArray8624[1 + var0.anInt8625 * 540934629];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2 + var3;
   }
}
