package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class276;
import com.jagex.Class284;
import com.jagex.Class320;
import com.jagex.Class374;
import com.jagex.Class433;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Exception_Sub5;

public class Class320_Sub1 extends Class320 {
   Class284 aClass284_10078;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10070;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10068;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10071;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10069;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10073;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10074;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10075;
   Class276 aClass276_10076;
   Class276 aClass276_10077;
   Class276 aClass276_10072;
   Class433 aClass433_10067 = new Class433();

   public void method4135(boolean var1) {
      this.aClass284_10078.method3757(var1?this.aClass276_10072:this.aClass276_10076);
      this.aClass284_10078.method3722();
      this.method9093(var1, false, 1833228235);
      this.aClass174_Sub3_3438.method8823();
   }

   boolean method9091(int var1) throws Exception_Sub5 {
      this.aClass284_10078 = this.aClass174_Sub3_3438.method8725("Particle");
      this.aClass526_Sub13_Sub1_10070 = this.aClass284_10078.method3750("WVPMatrix", 2135532707);
      this.aClass526_Sub13_Sub1_10068 = this.aClass284_10078.method3750("DiffuseSampler", 2128117863);
      this.aClass526_Sub13_Sub1_10071 = this.aClass284_10078.method3750("TexCoordMatrix", 2110837171);
      this.aClass526_Sub13_Sub1_10069 = this.aClass284_10078.method3750("DistanceFogPlane", 2141799719);
      this.aClass526_Sub13_Sub1_10073 = this.aClass284_10078.method3750("DistanceFogColour", 2106066391);
      this.aClass526_Sub13_Sub1_10074 = this.aClass284_10078.method3750("DistanceFogAmount", 2132073371);
      this.aClass526_Sub13_Sub1_10075 = this.aClass284_10078.method3750("DiffuseColour", 2108552162);
      this.aClass276_10076 = this.aClass284_10078.method3742("NoFog", (byte)97);
      this.aClass276_10077 = this.aClass284_10078.method3742("ParticleFog", (byte)71);
      this.aClass276_10072 = this.aClass284_10078.method3742("BillboardFog", (byte)112);
      return !this.aClass276_10076.method3638()?false:(!this.aClass276_10077.method3638()?false:this.aClass276_10072.method3638());
   }

   public void method4137(Class433 var1) {
      this.aClass433_10067.method5083(var1);
      this.aClass433_10067.method5085(this.aClass174_Sub3_3438.aClass433_9720);
   }

   public void method4134(int var1, boolean var2) {
      this.aClass284_10078.method3757(var2?this.aClass276_10077:this.aClass276_10076);
      this.aClass284_10078.method3722();
      this.method9093(var2, true, 2122298390);
      this.aClass174_Sub3_3438.method8827(Class374.aClass374_3898, 0, 4 * var1, 0, var1 * 2);
   }

   boolean method9092() throws Exception_Sub5 {
      this.aClass284_10078 = this.aClass174_Sub3_3438.method8725("Particle");
      this.aClass526_Sub13_Sub1_10070 = this.aClass284_10078.method3750("WVPMatrix", 2142234452);
      this.aClass526_Sub13_Sub1_10068 = this.aClass284_10078.method3750("DiffuseSampler", 2139541791);
      this.aClass526_Sub13_Sub1_10071 = this.aClass284_10078.method3750("TexCoordMatrix", 2102941465);
      this.aClass526_Sub13_Sub1_10069 = this.aClass284_10078.method3750("DistanceFogPlane", 2143236522);
      this.aClass526_Sub13_Sub1_10073 = this.aClass284_10078.method3750("DistanceFogColour", 2128428127);
      this.aClass526_Sub13_Sub1_10074 = this.aClass284_10078.method3750("DistanceFogAmount", 2135792101);
      this.aClass526_Sub13_Sub1_10075 = this.aClass284_10078.method3750("DiffuseColour", 2120532557);
      this.aClass276_10076 = this.aClass284_10078.method3742("NoFog", (byte)94);
      this.aClass276_10077 = this.aClass284_10078.method3742("ParticleFog", (byte)93);
      this.aClass276_10072 = this.aClass284_10078.method3742("BillboardFog", (byte)119);
      return !this.aClass276_10076.method3638()?false:(!this.aClass276_10077.method3638()?false:this.aClass276_10072.method3638());
   }

   void method9093(boolean var1, boolean var2, int var3) {
      this.aClass284_10078.method3760(this.aClass526_Sub13_Sub1_10068, 0, this.anInterface38_3439, (byte)-74);
      this.aClass284_10078.method3741(this.aClass526_Sub13_Sub1_10070, this.aClass433_10067, (byte)-108);
      this.aClass284_10078.method3740(this.aClass526_Sub13_Sub1_10071, this.aClass433_3437, -771075155);
      this.aClass284_10078.method3739(this.aClass526_Sub13_Sub1_10075, this.anInt3436, 161064544);
      if(var1) {
         if(var2) {
            this.aClass284_10078.method3735(this.aClass526_Sub13_Sub1_10069, this.aClass444_3440.aFloat4897, this.aClass444_3440.aFloat4898, this.aClass444_3440.aFloat4899, this.aClass444_3440.aFloat4900, (byte)20);
         } else {
            this.aClass284_10078.method3772(this.aClass526_Sub13_Sub1_10074, Math.min(Math.max(this.aFloat3442, 0.0F), 1.0F), 745915600);
         }

         this.aClass284_10078.method3769(this.aClass526_Sub13_Sub1_10073, this.aClass446_3441.aFloat4917, this.aClass446_3441.aFloat4915, this.aClass446_3441.aFloat4919, -1514081739);
      }

   }

   public void method4136(Class433 var1) {
      this.aClass433_10067.method5083(var1);
      this.aClass433_10067.method5085(this.aClass174_Sub3_3438.aClass433_9720);
   }

   public void method4133(Class433 var1) {
      this.aClass433_10067.method5083(var1);
      this.aClass433_10067.method5085(this.aClass174_Sub3_3438.aClass433_9720);
   }

   void method9094(boolean var1, boolean var2) {
      this.aClass284_10078.method3760(this.aClass526_Sub13_Sub1_10068, 0, this.anInterface38_3439, (byte)-93);
      this.aClass284_10078.method3741(this.aClass526_Sub13_Sub1_10070, this.aClass433_10067, (byte)-109);
      this.aClass284_10078.method3740(this.aClass526_Sub13_Sub1_10071, this.aClass433_3437, -1334029916);
      this.aClass284_10078.method3739(this.aClass526_Sub13_Sub1_10075, this.anInt3436, -520279121);
      if(var1) {
         if(var2) {
            this.aClass284_10078.method3735(this.aClass526_Sub13_Sub1_10069, this.aClass444_3440.aFloat4897, this.aClass444_3440.aFloat4898, this.aClass444_3440.aFloat4899, this.aClass444_3440.aFloat4900, (byte)20);
         } else {
            this.aClass284_10078.method3772(this.aClass526_Sub13_Sub1_10074, Math.min(Math.max(this.aFloat3442, 0.0F), 1.0F), 745915600);
         }

         this.aClass284_10078.method3769(this.aClass526_Sub13_Sub1_10073, this.aClass446_3441.aFloat4917, this.aClass446_3441.aFloat4915, this.aClass446_3441.aFloat4919, -1514081739);
      }

   }

   public void method4138(int var1, boolean var2) {
      this.aClass284_10078.method3757(var2?this.aClass276_10077:this.aClass276_10076);
      this.aClass284_10078.method3722();
      this.method9093(var2, true, 1542350546);
      this.aClass174_Sub3_3438.method8827(Class374.aClass374_3898, 0, 4 * var1, 0, var1 * 2);
   }

   public void method4139(int var1, boolean var2) {
      this.aClass284_10078.method3757(var2?this.aClass276_10077:this.aClass276_10076);
      this.aClass284_10078.method3722();
      this.method9093(var2, true, 1894841770);
      this.aClass174_Sub3_3438.method8827(Class374.aClass374_3898, 0, 4 * var1, 0, var1 * 2);
   }

   boolean method9095() throws Exception_Sub5 {
      this.aClass284_10078 = this.aClass174_Sub3_3438.method8725("Particle");
      this.aClass526_Sub13_Sub1_10070 = this.aClass284_10078.method3750("WVPMatrix", 2115058237);
      this.aClass526_Sub13_Sub1_10068 = this.aClass284_10078.method3750("DiffuseSampler", 2129374620);
      this.aClass526_Sub13_Sub1_10071 = this.aClass284_10078.method3750("TexCoordMatrix", 2113276652);
      this.aClass526_Sub13_Sub1_10069 = this.aClass284_10078.method3750("DistanceFogPlane", 2145666155);
      this.aClass526_Sub13_Sub1_10073 = this.aClass284_10078.method3750("DistanceFogColour", 2106857191);
      this.aClass526_Sub13_Sub1_10074 = this.aClass284_10078.method3750("DistanceFogAmount", 2105548284);
      this.aClass526_Sub13_Sub1_10075 = this.aClass284_10078.method3750("DiffuseColour", 2122057131);
      this.aClass276_10076 = this.aClass284_10078.method3742("NoFog", (byte)84);
      this.aClass276_10077 = this.aClass284_10078.method3742("ParticleFog", (byte)46);
      this.aClass276_10072 = this.aClass284_10078.method3742("BillboardFog", (byte)110);
      return !this.aClass276_10076.method3638()?false:(!this.aClass276_10077.method3638()?false:this.aClass276_10072.method3638());
   }

   boolean method9096() throws Exception_Sub5 {
      this.aClass284_10078 = this.aClass174_Sub3_3438.method8725("Particle");
      this.aClass526_Sub13_Sub1_10070 = this.aClass284_10078.method3750("WVPMatrix", 2118437874);
      this.aClass526_Sub13_Sub1_10068 = this.aClass284_10078.method3750("DiffuseSampler", 2135137200);
      this.aClass526_Sub13_Sub1_10071 = this.aClass284_10078.method3750("TexCoordMatrix", 2123001740);
      this.aClass526_Sub13_Sub1_10069 = this.aClass284_10078.method3750("DistanceFogPlane", 2144981750);
      this.aClass526_Sub13_Sub1_10073 = this.aClass284_10078.method3750("DistanceFogColour", 2111114557);
      this.aClass526_Sub13_Sub1_10074 = this.aClass284_10078.method3750("DistanceFogAmount", 2141504324);
      this.aClass526_Sub13_Sub1_10075 = this.aClass284_10078.method3750("DiffuseColour", 2132562220);
      this.aClass276_10076 = this.aClass284_10078.method3742("NoFog", (byte)11);
      this.aClass276_10077 = this.aClass284_10078.method3742("ParticleFog", (byte)55);
      this.aClass276_10072 = this.aClass284_10078.method3742("BillboardFog", (byte)73);
      return !this.aClass276_10076.method3638()?false:(!this.aClass276_10077.method3638()?false:this.aClass276_10072.method3638());
   }

   public Class320_Sub1(Class174_Sub3 var1) throws Exception_Sub5 {
      super(var1);
      this.method9091(244416279);
   }

   boolean method9097() throws Exception_Sub5 {
      this.aClass284_10078 = this.aClass174_Sub3_3438.method8725("Particle");
      this.aClass526_Sub13_Sub1_10070 = this.aClass284_10078.method3750("WVPMatrix", 2136726326);
      this.aClass526_Sub13_Sub1_10068 = this.aClass284_10078.method3750("DiffuseSampler", 2128101551);
      this.aClass526_Sub13_Sub1_10071 = this.aClass284_10078.method3750("TexCoordMatrix", 2135204879);
      this.aClass526_Sub13_Sub1_10069 = this.aClass284_10078.method3750("DistanceFogPlane", 2105099578);
      this.aClass526_Sub13_Sub1_10073 = this.aClass284_10078.method3750("DistanceFogColour", 2112764435);
      this.aClass526_Sub13_Sub1_10074 = this.aClass284_10078.method3750("DistanceFogAmount", 2129234803);
      this.aClass526_Sub13_Sub1_10075 = this.aClass284_10078.method3750("DiffuseColour", 2114501952);
      this.aClass276_10076 = this.aClass284_10078.method3742("NoFog", (byte)21);
      this.aClass276_10077 = this.aClass284_10078.method3742("ParticleFog", (byte)32);
      this.aClass276_10072 = this.aClass284_10078.method3742("BillboardFog", (byte)117);
      return !this.aClass276_10076.method3638()?false:(!this.aClass276_10077.method3638()?false:this.aClass276_10072.method3638());
   }

   public void method4132(Class433 var1) {
      this.aClass433_10067.method5083(var1);
      this.aClass433_10067.method5085(this.aClass174_Sub3_3438.aClass433_9720);
   }
}
