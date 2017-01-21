package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class276;
import com.jagex.Class344;
import com.jagex.Class351_Sub1;
import com.jagex.Class374;
import com.jagex.Class433;
import com.jagex.Class444;
import com.jagex.Class446;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Exception_Sub5;

public class Class351_Sub1_Sub2 extends Class351_Sub1 {
   public int anInt11570;
   public int anInt11582;
   public int anInt11584;
   public int anInt11586;
   public int anInt11590;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11585;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11563;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11560;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11566;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11568;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11571;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11573;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11575;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11577;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11579;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11581;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11583;
   Class276 aClass276_11591;
   float aFloat11587 = 0.0F;
   public Class433 aClass433_11565 = new Class433();
   public Class433 aClass433_11567 = new Class433();
   public Class446 aClass446_11569 = new Class446();
   Class444 aClass444_11572 = new Class444();
   Class444 aClass444_11564 = new Class444();
   Class444 aClass444_11576 = new Class444();
   public Class444 aClass444_11578 = new Class444();
   public Class446 aClass446_11562 = new Class446();
   public Class444 aClass444_11580 = new Class444();
   public Class446 aClass446_11574 = new Class446();
   Class344 aClass344_11561;
   boolean aBool11589;
   boolean aBool11588;

   public boolean method10544() {
      return this.aBool11588;
   }

   boolean method9176() throws Exception_Sub5 {
      if(!this.aClass344_11561.method4436()) {
         return false;
      } else {
         this.aClass526_Sub13_Sub1_11585 = this.aClass284_10182.method3750("NormalSampler", 2123497057);
         this.aClass526_Sub13_Sub1_11563 = this.aClass284_10182.method3750("EnvMapSampler", 2120116452);
         this.aClass526_Sub13_Sub1_11560 = this.aClass284_10182.method3750("WVPMatrix", 2129318538);
         this.aClass526_Sub13_Sub1_11566 = this.aClass284_10182.method3750("TexCoordMatrix", 2125021396);
         this.aClass526_Sub13_Sub1_11568 = this.aClass284_10182.method3750("EyePosAndTime", 2108062540);
         this.aClass526_Sub13_Sub1_11571 = this.aClass284_10182.method3750("SunDirectionAndExponent", 2136701073);
         this.aClass526_Sub13_Sub1_11573 = this.aClass284_10182.method3750("SunColourAndWaveExponent", 2114176548);
         this.aClass526_Sub13_Sub1_11575 = this.aClass284_10182.method3750("WaveIntensityAndBreakWaterDepthAndOffset", 2125334362);
         this.aClass526_Sub13_Sub1_11577 = this.aClass284_10182.method3750("HeightFogPlane", 2112111226);
         this.aClass526_Sub13_Sub1_11579 = this.aClass284_10182.method3750("HeightFogColour", 2138241464);
         this.aClass526_Sub13_Sub1_11581 = this.aClass284_10182.method3750("DistanceFogPlane", 2120640922);
         this.aClass526_Sub13_Sub1_11583 = this.aClass284_10182.method3750("DistanceFogColour", 2118950374);
         this.aClass276_11591 = this.aClass284_10182.method3742(this.aBool11589?"EnvMappedSea":"EnvMappedWater", (byte)15);
         this.aClass284_10182.method3757(this.aClass276_11591);
         return true;
      }
   }

   public boolean method10545(int var1) {
      return this.aBool11588;
   }

   void method9186(Class433 var1) {
      Class433 var2 = new Class433();
      var2.method5141(this.aFloat11587, this.aFloat11587, 1.0F, 1.0F);
      var2.method5118(var1, var2);
      super.method9186(var2);
   }

   public void method10546() {
      this.method10551((byte)-8);
      this.aClass284_10182.method3757(this.aClass276_11591);
      this.aClass284_10182.method3722();
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11585, 0, this.aClass344_11561.anInterface37_3566, (byte)-4);
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11563, 1, this.aClass174_Sub3_3662.method8751(), (byte)-124);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11560, this.aClass433_11565, (byte)-5);
      this.aClass284_10182.method3740(this.aClass526_Sub13_Sub1_11566, this.aClass433_11567, 569075139);
      int var1 = 1 << (this.anInt11570 * 91113147 & 3);
      this.aClass284_10182.method3735(this.aClass526_Sub13_Sub1_11568, this.aClass446_11569.aFloat4917, this.aClass446_11569.aFloat4915, this.aClass446_11569.aFloat4919, (float)(var1 * this.aClass174_Sub3_3662.anInt9820 % '\u9c40') / 40000.0F, (byte)20);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11571, this.aClass444_11572, 1774508156);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11573, this.aClass444_11564, 1523864943);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11575, this.aClass444_11576, 1492633536);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11577, this.aClass444_11578, 2023795198);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11579, this.aClass446_11562, (byte)-57);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11581, this.aClass444_11580, 2006585106);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11583, this.aClass446_11574, (byte)-120);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, this.anInt11590 * 1828866891, this.anInt11586 * -1875061189, this.anInt11582 * -564123267, this.anInt11584 * 1368052281);
   }

   public void method10547(int var1) {
      this.method10551((byte)-38);
      this.aClass284_10182.method3757(this.aClass276_11591);
      this.aClass284_10182.method3722();
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11585, 0, this.aClass344_11561.anInterface37_3566, (byte)-37);
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11563, 1, this.aClass174_Sub3_3662.method8751(), (byte)-69);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11560, this.aClass433_11565, (byte)-78);
      this.aClass284_10182.method3740(this.aClass526_Sub13_Sub1_11566, this.aClass433_11567, -1224182760);
      int var2 = 1 << (this.anInt11570 * 91113147 & 3);
      this.aClass284_10182.method3735(this.aClass526_Sub13_Sub1_11568, this.aClass446_11569.aFloat4917, this.aClass446_11569.aFloat4915, this.aClass446_11569.aFloat4919, (float)(var2 * this.aClass174_Sub3_3662.anInt9820 % '\u9c40') / 40000.0F, (byte)20);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11571, this.aClass444_11572, 1644388261);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11573, this.aClass444_11564, 976749504);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11575, this.aClass444_11576, 1742943253);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11577, this.aClass444_11578, 915137697);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11579, this.aClass446_11562, (byte)-57);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11581, this.aClass444_11580, 1897709804);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11583, this.aClass446_11574, (byte)-86);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, this.anInt11590 * 1828866891, this.anInt11586 * -1875061189, this.anInt11582 * -564123267, this.anInt11584 * 1368052281);
   }

   void method9183(boolean var1) {
      float var2 = 1.0F + (1.0F - Math.abs(this.aClass174_Sub3_3662.aFloatArray9777[1])) * 2.0F;
      float var3 = this.aClass174_Sub3_3662.aFloat9823;
      this.aClass174_Sub3_3662.aFloat9823 *= var2;
      super.method9183(var1);
      this.aClass174_Sub3_3662.aFloat9823 = var3;
   }

   boolean method9174() throws Exception_Sub5 {
      if(!this.aClass344_11561.method4436()) {
         return false;
      } else {
         this.aClass526_Sub13_Sub1_11585 = this.aClass284_10182.method3750("NormalSampler", 2115770450);
         this.aClass526_Sub13_Sub1_11563 = this.aClass284_10182.method3750("EnvMapSampler", 2118254288);
         this.aClass526_Sub13_Sub1_11560 = this.aClass284_10182.method3750("WVPMatrix", 2126339936);
         this.aClass526_Sub13_Sub1_11566 = this.aClass284_10182.method3750("TexCoordMatrix", 2135830331);
         this.aClass526_Sub13_Sub1_11568 = this.aClass284_10182.method3750("EyePosAndTime", 2120354326);
         this.aClass526_Sub13_Sub1_11571 = this.aClass284_10182.method3750("SunDirectionAndExponent", 2133260418);
         this.aClass526_Sub13_Sub1_11573 = this.aClass284_10182.method3750("SunColourAndWaveExponent", 2118124581);
         this.aClass526_Sub13_Sub1_11575 = this.aClass284_10182.method3750("WaveIntensityAndBreakWaterDepthAndOffset", 2111841211);
         this.aClass526_Sub13_Sub1_11577 = this.aClass284_10182.method3750("HeightFogPlane", 2127726847);
         this.aClass526_Sub13_Sub1_11579 = this.aClass284_10182.method3750("HeightFogColour", 2117464416);
         this.aClass526_Sub13_Sub1_11581 = this.aClass284_10182.method3750("DistanceFogPlane", 2120205738);
         this.aClass526_Sub13_Sub1_11583 = this.aClass284_10182.method3750("DistanceFogColour", 2121766458);
         this.aClass276_11591 = this.aClass284_10182.method3742(this.aBool11589?"EnvMappedSea":"EnvMappedWater", (byte)88);
         this.aClass284_10182.method3757(this.aClass276_11591);
         return true;
      }
   }

   void method9187(Class433 var1) {
      Class433 var2 = new Class433();
      var2.method5141(this.aFloat11587, this.aFloat11587, 1.0F, 1.0F);
      var2.method5118(var1, var2);
      super.method9186(var2);
   }

   void method9189(boolean var1) {
      float var2 = 1.0F + (1.0F - Math.abs(this.aClass174_Sub3_3662.aFloatArray9777[1])) * 2.0F;
      float var3 = this.aClass174_Sub3_3662.aFloat9823;
      this.aClass174_Sub3_3662.aFloat9823 *= var2;
      super.method9183(var1);
      this.aClass174_Sub3_3662.aFloat9823 = var3;
   }

   public void method10548() {
      this.method10551((byte)17);
      this.aClass284_10182.method3757(this.aClass276_11591);
      this.aClass284_10182.method3722();
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11585, 0, this.aClass344_11561.anInterface37_3566, (byte)-14);
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11563, 1, this.aClass174_Sub3_3662.method8751(), (byte)-92);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11560, this.aClass433_11565, (byte)-6);
      this.aClass284_10182.method3740(this.aClass526_Sub13_Sub1_11566, this.aClass433_11567, 1092260620);
      int var1 = 1 << (this.anInt11570 * 91113147 & 3);
      this.aClass284_10182.method3735(this.aClass526_Sub13_Sub1_11568, this.aClass446_11569.aFloat4917, this.aClass446_11569.aFloat4915, this.aClass446_11569.aFloat4919, (float)(var1 * this.aClass174_Sub3_3662.anInt9820 % '\u9c40') / 40000.0F, (byte)20);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11571, this.aClass444_11572, 1190436345);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11573, this.aClass444_11564, 1291136236);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11575, this.aClass444_11576, 1617406688);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11577, this.aClass444_11578, 1876849945);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11579, this.aClass446_11562, (byte)-19);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11581, this.aClass444_11580, 1855439900);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11583, this.aClass446_11574, (byte)-27);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, this.anInt11590 * 1828866891, this.anInt11586 * -1875061189, this.anInt11582 * -564123267, this.anInt11584 * 1368052281);
   }

   public boolean method10549() {
      return this.aBool11588;
   }

   public boolean method10550() {
      return this.aBool11588;
   }

   void method10551(byte var1) {
      this.aFloat11587 = 2.4414062E-4F;
      short var2 = 256;
      float var3 = 0.3F;
      float var4 = 0.4F;
      float var5 = 0.1F;
      byte var6 = 5;
      this.aClass433_11567.method5141(this.aFloat11587, this.aFloat11587, this.aFloat11587, this.aFloat11587);
      this.aClass444_11572.method5202(-this.aClass174_Sub3_3662.aFloatArray9777[0], -this.aClass174_Sub3_3662.aFloatArray9777[1], -this.aClass174_Sub3_3662.aFloatArray9777[2], 32.0F);
      this.aClass444_11564.method5202(this.aClass174_Sub3_3662.aFloat9708, this.aClass174_Sub3_3662.aFloat9771, this.aClass174_Sub3_3662.aFloat9760, (float)var6);
      this.aClass444_11576.method5202(var5, var4, (float)var2, var3);
   }

   public void method10552() {
      this.method10551((byte)52);
      this.aClass284_10182.method3757(this.aClass276_11591);
      this.aClass284_10182.method3722();
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11585, 0, this.aClass344_11561.anInterface37_3566, (byte)-18);
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11563, 1, this.aClass174_Sub3_3662.method8751(), (byte)-54);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11560, this.aClass433_11565, (byte)-94);
      this.aClass284_10182.method3740(this.aClass526_Sub13_Sub1_11566, this.aClass433_11567, -1778802382);
      int var1 = 1 << (this.anInt11570 * 91113147 & 3);
      this.aClass284_10182.method3735(this.aClass526_Sub13_Sub1_11568, this.aClass446_11569.aFloat4917, this.aClass446_11569.aFloat4915, this.aClass446_11569.aFloat4919, (float)(var1 * this.aClass174_Sub3_3662.anInt9820 % '\u9c40') / 40000.0F, (byte)20);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11571, this.aClass444_11572, 2012941745);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11573, this.aClass444_11564, 912976740);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11575, this.aClass444_11576, 1341933320);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11577, this.aClass444_11578, 1516314051);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11579, this.aClass446_11562, (byte)-50);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11581, this.aClass444_11580, 887150089);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11583, this.aClass446_11574, (byte)-76);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, this.anInt11590 * 1828866891, this.anInt11586 * -1875061189, this.anInt11582 * -564123267, this.anInt11584 * 1368052281);
   }

   public Class351_Sub1_Sub2(Class174_Sub3 var1, Class344 var2, boolean var3) throws Exception_Sub5 {
      super(var1);
      new Class433();
      this.aClass344_11561 = var2;
      this.aBool11589 = var3;
      if(var1.method8898() && var1.method8719()) {
         this.aBool11588 = this.method9175("EnvMappedWater");
      } else {
         this.aBool11588 = false;
      }

   }

   public void method10553() {
      this.method10551((byte)-99);
      this.aClass284_10182.method3757(this.aClass276_11591);
      this.aClass284_10182.method3722();
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11585, 0, this.aClass344_11561.anInterface37_3566, (byte)-77);
      this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11563, 1, this.aClass174_Sub3_3662.method8751(), (byte)-67);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11560, this.aClass433_11565, (byte)-27);
      this.aClass284_10182.method3740(this.aClass526_Sub13_Sub1_11566, this.aClass433_11567, -984078913);
      int var1 = 1 << (this.anInt11570 * 91113147 & 3);
      this.aClass284_10182.method3735(this.aClass526_Sub13_Sub1_11568, this.aClass446_11569.aFloat4917, this.aClass446_11569.aFloat4915, this.aClass446_11569.aFloat4919, (float)(var1 * this.aClass174_Sub3_3662.anInt9820 % '\u9c40') / 40000.0F, (byte)20);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11571, this.aClass444_11572, 2083381552);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11573, this.aClass444_11564, 1906222434);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11575, this.aClass444_11576, 1716039088);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11577, this.aClass444_11578, 1803969084);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11579, this.aClass446_11562, (byte)-41);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11581, this.aClass444_11580, 2127686915);
      this.aClass284_10182.method3756(this.aClass526_Sub13_Sub1_11583, this.aClass446_11574, (byte)-88);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, this.anInt11590 * 1828866891, this.anInt11586 * -1875061189, this.anInt11582 * -564123267, this.anInt11584 * 1368052281);
   }
}
