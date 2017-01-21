package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class116;
import com.jagex.Class149_Sub1;
import com.jagex.Class157;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class177;
import com.jagex.Class185;
import com.jagex.Class187;
import com.jagex.Class190;
import com.jagex.Class195;
import com.jagex.Class199_Sub12;
import com.jagex.Class201;
import com.jagex.Class204;
import com.jagex.Class210;
import com.jagex.Class214;
import com.jagex.Class230;
import com.jagex.Class242;
import com.jagex.InterfaceDef;
import com.jagex.Class246;
import com.jagex.Class247;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class264;
import com.jagex.Class265;
import com.jagex.Class27;
import com.jagex.Class279;
import com.jagex.Class285;
import com.jagex.Class289;
import com.jagex.Class294;
import com.jagex.Class31;
import com.jagex.Class322;
import com.jagex.Class327;
import com.jagex.Class380;
import com.jagex.Class387;
import com.jagex.Class397;
import com.jagex.OutFrame;
import com.jagex.Class40_Sub8;
import com.jagex.Class430;
import com.jagex.Class438;
import com.jagex.Class439;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class452;
import com.jagex.Class452_Sub4;
import com.jagex.Class461;
import com.jagex.Class463;
import com.jagex.Class475;
import com.jagex.Class482;
import com.jagex.Class499;
import com.jagex.Class509;
import com.jagex.Class521;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub24;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub31;
import com.jagex.LinkableObject;
import com.jagex.Class529;
import com.jagex.Class536;
import com.jagex.Class54;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class551;
import com.jagex.Class554;
import com.jagex.Class555;
import com.jagex.Connection;
import com.jagex.Class57;
import com.jagex.Class582;
import com.jagex.Class592;
import com.jagex.Class596;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class625;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class684;
import com.jagex.Class69;
import com.jagex.Class690;
import com.jagex.Class693;
import com.jagex.Class710;
import com.jagex.Class84;
import com.jagex.Class90;
import com.jagex.Class97_Sub1_Sub2;
import com.jagex.Interface59;
import com.jagex.client;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Class639_Sub1_Sub2_Sub2 extends Class639_Sub1_Sub2 implements Interface59 {
   boolean aBool11977 = true;
   Class550 aClass550_11976;
   public Class529 aClass529_11978;
   boolean aBool11974;
   boolean aBool11975;

   final void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   boolean method9821(int var1) {
      return false;
   }

   boolean method9822(int var1) {
      return this.aBool11977;
   }

   public boolean method378() {
      return this.aBool11975;
   }

   public Class550 method9827(Class174 var1, int var2) {
      return this.aClass550_11976;
   }

   public int method9859(byte var1) {
      return this.aClass529_11978.method6352((byte)17);
   }

   Class555 method9825(Class174 var1, int var2) {
      Class168 var3 = this.aClass529_11978.method6354(var1, 2048, false, true, 2107897858);
      if(var3 == null) {
         return null;
      } else {
         Class445 var4 = this.method7623();
         Class555 var5 = Class463.method5475(this.aBool11974, (short)18523);
         this.aClass529_11978.method6370(var1, var3, var4, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, true, 1075488610);
         Class610 var6 = this.aClass529_11978.method6353(761439681);
         if(var6.aClass437_8007 != null) {
            var3.method1974(var4, (Class164)null, 0);
            var1.method2303(var4, this.aClass164Array10829[0], var6.aClass437_8007);
         } else {
            var3.method1974(var4, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_11978.aClass614_7178 != null) {
            Class177 var7 = this.aClass529_11978.aClass614_7178.method7253();
            var1.method2516(var7);
         }

         this.aBool11977 = var3.method2014() || this.aClass529_11978.aClass614_7178 != null;
         Class430 var8 = this.method7635();
         if(null == this.aClass550_11976) {
            this.aClass550_11976 = Class625.method7449((int)var8.aClass446_4816.aFloat4917, (int)var8.aClass446_4816.aFloat4915, (int)var8.aClass446_4816.aFloat4919, var3, -2147371678);
         } else {
            Class54.method983(this.aClass550_11976, (int)var8.aClass446_4816.aFloat4917, (int)var8.aClass446_4816.aFloat4915, (int)var8.aClass446_4816.aFloat4919, var3, -1741187402);
         }

         return var5;
      }
   }

   public void method393(Class174 var1) {
      this.aClass529_11978.method6367(var1, (short)-2834);
   }

   public void method10831(Class599 var1, int var2) {
      this.aClass529_11978.method6358(var1, -1730576285);
   }

   void method9834(Class174 var1, int var2) {
      Class168 var3 = this.aClass529_11978.method6354(var1, 262144, true, true, 2107897858);
      if(var3 != null) {
         this.aClass529_11978.method6370(var1, var3, this.method7623(), this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, false, 1075488610);
      }

   }

   final boolean method9864(byte var1) {
      return false;
   }

   final void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   public void method388(int var1) {
   }

   public void method386() {
   }

   public int method87(int var1) {
      return -65698791 * this.aClass529_11978.anInt7162;
   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      Class610 var5 = this.aClass529_11978.method6353(-1241624126);
      if(null != var5.aClass437_8007) {
         return var1.method2301(var2, var3, this.method7623(), var5.aClass437_8007, -1353234919);
      } else {
         Class168 var6 = this.aClass529_11978.method6354(var1, 131072, false, false, 2107897858);
         return null == var6?false:var6.method1975(var2, var3, this.method7623(), false, 0);
      }
   }

   public Class550 method9856(Class174 var1) {
      return this.aClass550_11976;
   }

   public int method9838() {
      return this.aClass529_11978.method6350((byte)-76);
   }

   public boolean method387() {
      return this.aBool11975;
   }

   public void method382(Class174 var1, int var2) {
      this.aClass529_11978.method6362(var1, (byte)1);
   }

   public void method381(Class174 var1, byte var2) {
      this.aClass529_11978.method6367(var1, (short)28464);
   }

   public int method9() {
      return this.aClass529_11978.anInt7163 * -544650689;
   }

   public int method137() {
      return this.aClass529_11978.anInt7163 * -544650689;
   }

   public int method130() {
      return this.aClass529_11978.anInt7163 * -544650689;
   }

   public int method139() {
      return -65698791 * this.aClass529_11978.anInt7162;
   }

   public int method394() {
      return 936783279 * this.aClass529_11978.anInt7168;
   }

   public int method379(byte var1) {
      return 936783279 * this.aClass529_11978.anInt7168;
   }

   public boolean method385() {
      return this.aClass529_11978.method6356((short)29503);
   }

   public boolean method265() {
      return this.aClass529_11978.method6356((short)30512);
   }

   final void method9842(int var1) {
      throw new IllegalStateException();
   }

   public int method9845() {
      return this.aClass529_11978.method6352((byte)-54);
   }

   public boolean method384(byte var1) {
      return this.aBool11975;
   }

   public void method390(Class174 var1) {
      this.aClass529_11978.method6362(var1, (byte)1);
   }

   public void method391(Class174 var1) {
      this.aClass529_11978.method6367(var1, (short)-6391);
   }

   public void method389(Class174 var1) {
      this.aClass529_11978.method6362(var1, (byte)1);
   }

   public Class550 method9840(Class174 var1) {
      return this.aClass550_11976;
   }

   public void method383(Class174 var1) {
      this.aClass529_11978.method6367(var1, (short)-18025);
   }

   boolean method9836() {
      return false;
   }

   boolean method9841() {
      return this.aBool11977;
   }

   public boolean method380(byte var1) {
      return this.aClass529_11978.method6356((short)16436);
   }

   public int method9833() {
      return this.aClass529_11978.method6350((byte)-53);
   }

   Class555 method9828(Class174 var1) {
      Class168 var2 = this.aClass529_11978.method6354(var1, 2048, false, true, 2107897858);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class555 var4 = Class463.method5475(this.aBool11974, (short)13671);
         this.aClass529_11978.method6370(var1, var2, var3, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, true, 1075488610);
         Class610 var5 = this.aClass529_11978.method6353(1115072847);
         if(var5.aClass437_8007 != null) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var5.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_11978.aClass614_7178 != null) {
            Class177 var6 = this.aClass529_11978.aClass614_7178.method7253();
            var1.method2516(var6);
         }

         this.aBool11977 = var2.method2014() || this.aClass529_11978.aClass614_7178 != null;
         Class430 var7 = this.method7635();
         if(null == this.aClass550_11976) {
            this.aClass550_11976 = Class625.method7449((int)var7.aClass446_4816.aFloat4917, (int)var7.aClass446_4816.aFloat4915, (int)var7.aClass446_4816.aFloat4919, var2, -1958743901);
         } else {
            Class54.method983(this.aClass550_11976, (int)var7.aClass446_4816.aFloat4917, (int)var7.aClass446_4816.aFloat4915, (int)var7.aClass446_4816.aFloat4919, var2, -959054072);
         }

         return var4;
      }
   }

   public Class550 method9829(Class174 var1) {
      return this.aClass550_11976;
   }

   public void method392(Class174 var1) {
      this.aClass529_11978.method6367(var1, (short)19435);
   }

   public int method56(int var1) {
      return this.aClass529_11978.anInt7163 * -544650689;
   }

   public int method9846() {
      return this.aClass529_11978.method6352((byte)-18);
   }

   public int method9832(byte var1) {
      return this.aClass529_11978.method6350((byte)-56);
   }

   Class555 method9858(Class174 var1) {
      Class168 var2 = this.aClass529_11978.method6354(var1, 2048, false, true, 2107897858);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class555 var4 = Class463.method5475(this.aBool11974, (short)27298);
         this.aClass529_11978.method6370(var1, var2, var3, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, true, 1075488610);
         Class610 var5 = this.aClass529_11978.method6353(1074910214);
         if(var5.aClass437_8007 != null) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var5.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_11978.aClass614_7178 != null) {
            Class177 var6 = this.aClass529_11978.aClass614_7178.method7253();
            var1.method2516(var6);
         }

         this.aBool11977 = var2.method2014() || this.aClass529_11978.aClass614_7178 != null;
         Class430 var7 = this.method7635();
         if(null == this.aClass550_11976) {
            this.aClass550_11976 = Class625.method7449((int)var7.aClass446_4816.aFloat4917, (int)var7.aClass446_4816.aFloat4915, (int)var7.aClass446_4816.aFloat4919, var2, -920015859);
         } else {
            Class54.method983(this.aClass550_11976, (int)var7.aClass446_4816.aFloat4917, (int)var7.aClass446_4816.aFloat4915, (int)var7.aClass446_4816.aFloat4919, var2, -61083703);
         }

         return var4;
      }
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      Class610 var4 = this.aClass529_11978.method6353(-1962524757);
      if(null != var4.aClass437_8007) {
         return var1.method2301(var2, var3, this.method7623(), var4.aClass437_8007, -891872406);
      } else {
         Class168 var5 = this.aClass529_11978.method6354(var1, 131072, false, false, 2107897858);
         return null == var5?false:var5.method1975(var2, var3, this.method7623(), false, 0);
      }
   }

   Class555 method9844(Class174 var1) {
      Class168 var2 = this.aClass529_11978.method6354(var1, 2048, false, true, 2107897858);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class555 var4 = Class463.method5475(this.aBool11974, (short)9881);
         this.aClass529_11978.method6370(var1, var2, var3, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, true, 1075488610);
         Class610 var5 = this.aClass529_11978.method6353(1551913033);
         if(var5.aClass437_8007 != null) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var5.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_11978.aClass614_7178 != null) {
            Class177 var6 = this.aClass529_11978.aClass614_7178.method7253();
            var1.method2516(var6);
         }

         this.aBool11977 = var2.method2014() || this.aClass529_11978.aClass614_7178 != null;
         Class430 var7 = this.method7635();
         if(null == this.aClass550_11976) {
            this.aClass550_11976 = Class625.method7449((int)var7.aClass446_4816.aFloat4917, (int)var7.aClass446_4816.aFloat4915, (int)var7.aClass446_4816.aFloat4919, var2, -951923318);
         } else {
            Class54.method983(this.aClass550_11976, (int)var7.aClass446_4816.aFloat4917, (int)var7.aClass446_4816.aFloat4915, (int)var7.aClass446_4816.aFloat4919, var2, -777115427);
         }

         return var4;
      }
   }

   public Class639_Sub1_Sub2_Sub2(Class549 var1, Class174 var2, Class40_Sub8 var3, Class610 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, boolean var19) {
      super(var1, var5, var6, var7, var8, var9, var11, var12, var13, var14, var4.anInt7987 * 86646899 == 1, Class214.method2961(var15, var16, (byte)-125));
      this.aClass529_11978 = new Class529(var2, var3, var4, var15, var16, var6, this, var10, var17, var18);
      this.aBool11974 = 909601847 * var4.anInt7954 != 0 && !var10;
      this.aBool11975 = var19;
      this.method9835(1, 38854106);
   }

   public Class550 method9843(Class174 var1) {
      return this.aClass550_11976;
   }

   final boolean method9850() {
      return false;
   }

   void method9848(Class174 var1) {
      Class168 var2 = this.aClass529_11978.method6354(var1, 262144, true, true, 2107897858);
      if(var2 != null) {
         this.aClass529_11978.method6370(var1, var2, this.method7623(), this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, false, 1075488610);
      }

   }

   final boolean method9851() {
      return false;
   }

   final void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   final void method9847() {
      throw new IllegalStateException();
   }

   static void method10832(Class526_Sub21_Sub6 var0, int var1, int var2, boolean var3, int var4) {
      if(null != var0 && var0 != Class31.aClass702_292.aClass526_8788) {
         int var5 = var0.anInt11654 * -2014967153;
         int var6 = 1182196211 * var0.anInt11655;
         int var7 = var0.anInt11659 * 976428997;
         int var8 = (int)(var0.aLong11653 * 7424828564598113295L);
         long var9 = var0.aLong11653 * 7424828564598113295L;
         if(var7 >= 2000) {
            var7 -= 2000;
         }

         Class596 var11 = client.aClass505_11204.method6128(2070967429);
         OutFrame var12 = null;
         if(var7 == 3) {
            var12 = OutFrame.aClass405_4223;
         } else if(var7 == 4) {
            var12 = OutFrame.aClass405_4241;
         } else if(var7 == 5) {
            var12 = OutFrame.aClass405_4203;
         } else if(var7 == 6) {
            var12 = OutFrame.aClass405_4200;
         } else if(1001 == var7) {
            var12 = OutFrame.aClass405_4225;
         } else if(var7 == 1002) {
            var12 = OutFrame.aClass405_4174;
         }

         if(var12 != null) {
            client.anInt11133 = var1 * -167488977;
            client.anInt11224 = var2 * 941504167;
            client.anInt11136 = -1462100810;
            client.anInt11135 = 0;
            OutFrameBuffer var13 = Class115.method1414(var12, client.aClass111_11060.aClass14_1342, 1385669221);
            var13.out.writeLEShort(var11.localX * -814686591 + var5, (byte)0);
            var13.out.writeShort128(var6 + -845789331 * var11.localY, (byte)43);
            var13.out.writeIntV1((int)(var9 >>> 32) & Integer.MAX_VALUE, -1173433064);
            var13.out.write128Byte(Class279.crtlClick((byte)20)?1:0, (byte)66);
            client.aClass111_11060.write(var13, (byte)-26);
            Class693.method8112(var5, var6, 572617255);
         }

         OutFrame var18 = null;
         if(9 == var7) {
            var18 = OutFrame.aClass405_4222;
         } else if(10 == var7) {
            var18 = OutFrame.aClass405_4228;
         } else if(11 == var7) {
            var18 = OutFrame.aClass405_4175;
         } else if(var7 == 12) {
            var18 = OutFrame.aClass405_4218;
         } else if(var7 == 13) {
            var18 = OutFrame.aClass405_4205;
         } else if(var7 == 1003) {
            var18 = OutFrame.aClass405_4201;
         }

         OutFrameBuffer var16;
         if(null != var18) {
            LinkableObject var14 = (LinkableObject)client.npcs.get((long)var8);
            if(null != var14) {
               NPC var15 = (NPC)var14.anObject10399;
               client.anInt11133 = var1 * -167488977;
               client.anInt11224 = var2 * 941504167;
               client.anInt11136 = -1462100810;
               client.anInt11135 = 0;
               var16 = Class115.method1414(var18, client.aClass111_11060.aClass14_1342, -913830456);
               var16.out.writeByteC(Class279.crtlClick((byte)84)?1:0, -802285532);
               var16.out.writeLEShort128(var8, 218706250);
               client.aClass111_11060.write(var16, (byte)26);
               Class693.method8112(var15.screenX[0], var15.screenY[0], 484167167);
            }
         }

         OutFrame var19 = null;
         if(var7 == 44) {
            var19 = OutFrame.aClass405_4263;
         } else if(45 == var7) {
            var19 = OutFrame.aClass405_4231;
         } else if(46 == var7) {
            var19 = OutFrame.aClass405_4206;
         } else if(var7 == 47) {
            var19 = OutFrame.aClass405_4180;
         } else if(var7 == 48) {
            var19 = OutFrame.aClass405_4212;
         } else if(var7 == 49) {
            var19 = OutFrame.aClass405_4230;
         } else if(var7 == 50) {
            var19 = OutFrame.aClass405_4170;
         } else if(var7 == 51) {
            var19 = OutFrame.aClass405_4217;
         } else if(var7 == 52) {
            var19 = OutFrame.aClass405_4219;
         } else if(53 == var7) {
            var19 = OutFrame.aClass405_4264;
         }

         Class639_Sub1_Sub2_Sub1_Sub1 var20;
         if(null != var19) {
            var20 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var8];
            if(var20 != null) {
               client.anInt11133 = var1 * -167488977;
               client.anInt11224 = var2 * 941504167;
               client.anInt11136 = -1462100810;
               client.anInt11135 = 0;
               var16 = Class115.method1414(var19, client.aClass111_11060.aClass14_1342, -1300953531);
               var16.out.writeLEShort(var8, (byte)0);
               var16.out.write128Byte(Class279.crtlClick((byte)88)?1:0, (byte)75);
               client.aClass111_11060.write(var16, (byte)-61);
               Class693.method8112(var20.screenX[0], var20.screenY[0], 1714958253);
            }
         }

         if(8 == var7) {
            LinkableObject var21 = (LinkableObject)client.npcs.get((long)var8);
            if(var21 != null) {
               NPC var23 = (NPC)var21.anObject10399;
               client.anInt11133 = var1 * -167488977;
               client.anInt11224 = 941504167 * var2;
               client.anInt11136 = -1462100810;
               client.anInt11135 = 0;
               OutFrameBuffer var17 = Class115.method1414(OutFrame.aClass405_4195, client.aClass111_11060.aClass14_1342, 2091843241);
               var17.out.writeLEShort(1280409375 * client.slot, (byte)0);
               var17.out.writeShort128(client.item * 1394971083, (byte)93);
               var17.out.writeByteC(Class279.crtlClick((byte)126)?1:0, -802285532);
               var17.out.writeLEShort(var8, (byte)0);
               var17.out.writeIntV2(Class149_Sub1.uid * -367921651, (byte)-37);
               client.aClass111_11060.write(var17, (byte)54);
               Class693.method8112(var23.screenX[0], var23.screenY[0], -579890527);
            }
         }

         OutFrameBuffer var22;
         if(var7 == 16) {
            client.anInt11133 = -167488977 * var1;
            client.anInt11224 = 941504167 * var2;
            client.anInt11136 = -1462100810;
            client.anInt11135 = 0;
            var22 = Class115.method1414(OutFrame.aClass405_4248, client.aClass111_11060.aClass14_1342, 1254804863);
            var22.out.writeInt(Class149_Sub1.uid * -367921651, -357564953);
            var22.out.writeShort128(client.item * 1394971083, (byte)26);
            var22.out.writeByte(Class279.crtlClick((byte)22)?1:0, 1922904376);
            var22.out.writeLEShort128(828574411 * Class451.localPlayer.index, 1744333483);
            var22.out.writeShort(1280409375 * client.slot, -805078716);
            client.aClass111_11060.write(var22, (byte)54);
         }

         if(var7 == 59) {
            client.anInt11133 = var1 * -167488977;
            client.anInt11224 = 941504167 * var2;
            client.anInt11136 = -731050405;
            client.anInt11135 = 0;
            var22 = Class115.method1414(OutFrame.aClass405_4269, client.aClass111_11060.aClass14_1342, 1850052421);
            var22.out.writeIntLE(-367921651 * Class149_Sub1.uid, (byte)121);
            var22.out.writeLEShort128(var5 + var11.localX * -814686591, 1135997194);
            var22.out.writeShort(var6 + var11.localY * -845789331, -805078716);
            var22.out.writeLEShort(1394971083 * client.item, (byte)0);
            var22.out.writeShort(client.slot * 1280409375, -805078716);
            client.aClass111_11060.write(var22, (byte)-83);
            Class693.method8112(var5, var6, 1076322112);
         }

         if(1008 == var7 || 1009 == var7 || 1010 == var7 || var7 == 1011 || var7 == 1012) {
            Class201.method2879(var7, var8, var5, (byte)-46);
         }

         if(var7 == 15) {
            var20 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var8];
            if(var20 != null) {
               client.anInt11133 = var1 * -167488977;
               client.anInt11224 = 941504167 * var2;
               client.anInt11136 = -1462100810;
               client.anInt11135 = 0;
               var16 = Class115.method1414(OutFrame.aClass405_4248, client.aClass111_11060.aClass14_1342, 2088941939);
               var16.out.writeInt(-367921651 * Class149_Sub1.uid, -357564953);
               var16.out.writeShort128(1394971083 * client.item, (byte)24);
               var16.out.writeByte(Class279.crtlClick((byte)47)?1:0, 1804200701);
               var16.out.writeLEShort128(var8, -300894143);
               var16.out.writeShort(client.slot * 1280409375, -805078716);
               client.aClass111_11060.write(var16, (byte)23);
               Class693.method8112(var20.screenX[0], var20.screenY[0], -12257235);
            }
         }

         if(var7 == 57 || var7 == 1007) {
            Class690.method8098(var8, var6, var5, var0.aString11650, 440305876);
         }

         OutFrame var24 = null;
         if(18 == var7) {
            var24 = OutFrame.aClass405_4187;
         } else if(var7 == 19) {
            var24 = OutFrame.aClass405_4233;
         } else if(20 == var7) {
            var24 = OutFrame.aClass405_4189;
         } else if(var7 == 21) {
            var24 = OutFrame.aClass405_4253;
         } else if(var7 == 22) {
            var24 = OutFrame.aClass405_4168;
         } else if(var7 == 1004) {
            var24 = OutFrame.aClass405_4171;
         }

         if(null != var24) {
            client.anInt11133 = -167488977 * var1;
            client.anInt11224 = var2 * 941504167;
            client.anInt11136 = -1462100810;
            client.anInt11135 = 0;
            var16 = Class115.method1414(var24, client.aClass111_11060.aClass14_1342, -382741033);
            var16.out.write128Byte((var3?2:0) | (Class279.crtlClick((byte)115)?1:0), 306888791);
            var16.out.writeLEShort(-814686591 * var11.localX + var5, (byte)0);
            var16.out.writeShort128(var6 + -845789331 * var11.localY, (byte)92);
            var16.out.writeShort128(var8, (byte)58);
            client.aClass111_11060.write(var16, (byte)-46);
            Class693.method8112(var5, var6, -1616374831);
         }

         InterfaceDef var26;
         if(58 == var7) {
            var26 = Class204.method2893(var6, var5, 1297587788);
            if(null != var26) {
               Connection.method6743(var26, 2141746107);
            }
         }

         if(var7 == 2) {
            client.anInt11133 = var1 * -167488977;
            client.anInt11224 = 941504167 * var2;
            client.anInt11136 = -1462100810;
            client.anInt11135 = 0;
            var16 = Class115.method1414(OutFrame.aClass405_4237, client.aClass111_11060.aClass14_1342, -982632709);
            var16.out.writeLEShort128(var11.localX * -814686591 + var5, -939447226);
            var16.out.writeIntLE(-367921651 * Class149_Sub1.uid, (byte)54);
            var16.out.writeLEShort128(var6 + var11.localY * -845789331, -317136606);
            var16.out.writeIntV1((int)(var9 >>> 32) & Integer.MAX_VALUE, -631732658);
            var16.out.writeLEShort128(1394971083 * client.item, 782349144);
            var16.out.write128Byte(Class279.crtlClick((byte)47)?1:0, -730038066);
            var16.out.writeShort128(client.slot * 1280409375, (byte)81);
            client.aClass111_11060.write(var16, (byte)-24);
            Class693.method8112(var5, var6, 1577597069);
         }

         if(60 == var7) {
            if(client.anInt11064 * -1395039251 > 0 && Class397.method4823(1483768752)) {
               Class97_Sub1_Sub2.method10415(Class451.localPlayer.aByte10827, var5 + -814686591 * var11.localX, var6 + var11.localY * -845789331, -25062006);
            } else {
               client.anInt11133 = -167488977 * var1;
               client.anInt11224 = 941504167 * var2;
               client.anInt11136 = -731050405;
               client.anInt11135 = 0;
               var16 = Class115.method1414(OutFrame.aClass405_4226, client.aClass111_11060.aClass14_1342, -2123761865);
               var16.out.writeShort128(var6 + var11.localY * -845789331, (byte)95);
               var16.out.writeShort128(var5 + -814686591 * var11.localX, (byte)111);
               client.aClass111_11060.write(var16, (byte)-71);
            }
         }

         if(25 == var7) {
            var26 = Class204.method2893(var6, var5, 1241163527);
            if(var26 != null) {
               Class438.method5153(913447165);
               Class526_Sub24 var27 = client.method10311(var26);
               Class475.method5654(var26, var27.method9461((byte)0), 1231358729 * var27.anInt10548, 1024066429);
               client.aString11184 = Class84.method1178(var26, 1211322709);
               if(client.aString11184 == null) {
                  client.aString11184 = "Null";
               }

               client.aString11271 = var26.aString2593 + Class592.method7026(16777215, -78410560);
            }

         } else {
            if(30 == var7 && client.aClass245_11213 == null) {
               Class242.method3329(var6, var5, (byte)-58);
               client.aClass245_11213 = Class204.method2893(var6, var5, 2062127943);
               if(client.aClass245_11213 != null) {
                  Class526_Sub31.method9555(client.aClass245_11213, (byte)10);
               }
            }

            if(var7 == 23) {
               if(client.anInt11064 * -1395039251 > 0 && Class397.method4823(1916517988)) {
                  Class97_Sub1_Sub2.method10415(Class451.localPlayer.aByte10827, var11.localX * -814686591 + var5, var6 + var11.localY * -845789331, -639992615);
               } else {
                  var16 = Class246.method3389(var5, var6, var8, 1535267486);
                  if(1 == var8) {
                     var16.out.writeByte(-1, 999089071);
                     var16.out.writeByte(-1, 2039651692);
                     var16.out.writeShort((int)client.aFloat11105, -805078716);
                     var16.out.writeByte(57, 393505881);
                     var16.out.writeByte(client.anInt11076 * -502966983, -989853614);
                     var16.out.writeByte(client.anInt11097 * 1163477879, -1779223729);
                     var16.out.writeByte(89, -94181988);
                     Class446 var25 = Class451.localPlayer.method7635().aClass446_4816;
                     var16.out.writeShort((int)var25.aFloat4917, -805078716);
                     var16.out.writeShort((int)var25.aFloat4919, -805078716);
                     var16.out.writeByte(63, -134830589);
                  } else {
                     client.anInt11133 = var1 * -167488977;
                     client.anInt11224 = 941504167 * var2;
                     client.anInt11136 = -731050405;
                     client.anInt11135 = 0;
                  }

                  client.aClass111_11060.write(var16, (byte)-13);
                  Class693.method8112(var5, var6, -1793645725);
               }
            }

            if(17 == var7) {
               client.anInt11133 = var1 * -167488977;
               client.anInt11224 = 941504167 * var2;
               client.anInt11136 = -1462100810;
               client.anInt11135 = 0;
               var16 = Class115.method1414(OutFrame.aClass405_4227, client.aClass111_11060.aClass14_1342, 1060044026);
               var16.out.writeShort128(1280409375 * client.slot, (byte)113);
               var16.out.writeIntV1(-367921651 * Class149_Sub1.uid, 694497658);
               var16.out.writeShort128(var6 + var11.localY * -845789331, (byte)57);
               var16.out.writeLEShort128(-814686591 * var11.localX + var5, -1315575478);
               var16.out.writeShort(var8, -805078716);
               var16.out.writeLEShort(client.item * 1394971083, (byte)0);
               var16.out.write128Byte(Class279.crtlClick((byte)68)?1:0, -1297321700);
               client.aClass111_11060.write(var16, (byte)8);
               Class693.method8112(var5, var6, -1198573152);
            }

            if(client.aBool11276) {
               Class438.method5153(329978495);
            }

            if(null != Class264.aClass245_2969 && client.anInt11137 * 1856109425 == 0) {
               Class526_Sub31.method9555(Class264.aClass245_2969, (byte)10);
            }

         }
      }
   }

   public static void developerConsole(String var0, boolean var1, boolean var2, byte var3) {
      String var20;
      try {
         if(var0.equalsIgnoreCase("commands") || var0.equalsIgnoreCase("help")) {
            Class27.method722("commands - This command", -315839031);
            Class27.method722("cls - Clear console", -315839031);
            Class27.method722("displayfps - Toggle FPS and other information", -315839031);
            Class27.method722("renderer - Print graphics renderer information", -315839031);
            Class27.method722("heap - Print java memory information", -315839031);
            Class27.method722("getcamerapos - Print location and direction of camera for use in bug reports", -315839031);
            return;
         }

         if(var0.equalsIgnoreCase("cls")) {
            Class116.anInt1423 = 0;
            Class116.anInt1424 = 0;
            return;
         }

         if(var0.equalsIgnoreCase("displayfps")) {
            client.aBool11015 = !client.aBool11015;
            if(client.aBool11015) {
               Class27.method722("FPS on", -315839031);
            } else {
               Class27.method722("FPS off", -315839031);
            }

            return;
         }

         if(var0.equals("renderer")) {
            Class157 var26 = Class554.aClass174_7475.method2502();
            Class27.method722("Toolkit ID: " + Class230.preferences.aClass711_Sub19_10633.method10022((byte)-121), -315839031);
            Class27.method722("Vendor: " + var26.anInt1754 * -249614805, -315839031);
            Class27.method722("Name: " + var26.aString1755, -315839031);
            Class27.method722("Version: " + var26.anInt1756 * -158781665, -315839031);
            Class27.method722("Device: " + var26.aString1757, -315839031);
            Class27.method722("Driver Version: " + var26.aLong1758 * 1287546980716738269L, -315839031);
            var20 = Class554.aClass174_7475.method2245();
            if(var20.length() > 0) {
               Class27.method722(var20, -315839031);
            }

            return;
         }

         if(var0.equals("heap")) {
            Class27.method722("Heap: " + -642600783 * Class499.anInt5628 + "MB", -315839031);
            return;
         }

         if(var0.equalsIgnoreCase("getcamerapos")) {
            Class596 var25 = client.aClass505_11204.method6128(2045069782);
            if(-265840483 * Class327.anInt3488 == 2) {
               Class446 var22 = Class195.aClass292_Sub1_2182.method3944(-1957887669);
               Class446 var23 = Class195.aClass292_Sub1_2182.method3916(-1488926957);
               Class27.method722("Pos: " + (new Class596(Class451.localPlayer.aByte10827, (int)var22.aFloat4917 >> 9, (int)var22.aFloat4919 >> 9)).toString() + " Height: " + (Class387.method4762((int)var22.aFloat4917 - (-814686591 * var25.localX << 9), (int)var22.aFloat4919 - (-845789331 * var25.localY << 9), Class451.localPlayer.aByte10827, 2112505689) + (int)var22.aFloat4915), -315839031);
               Class27.method722("Look: " + (new Class596(Class451.localPlayer.aByte10827, (int)var23.aFloat4917 >> 9, (int)var23.aFloat4919 >> 9)).toString() + " Height: " + (Class387.method4762((int)var23.aFloat4917 - (-814686591 * var25.localX << 9), (int)var22.aFloat4919 - (-845789331 * var25.localY << 9), Class451.localPlayer.aByte10827, 1381535679) + (int)var22.aFloat4915), -315839031);
            } else {
               Class27.method722("Pos: " + Class451.localPlayer.aByte10827 + "," + ((Class439.anInt4866 * 822351193 >> 9) + var25.localX * -814686591 >> 6) + "," + ((Class210.anInt2259 * 1215159411 >> 9) + -845789331 * var25.localY >> 6) + "," + ((Class439.anInt4866 * 822351193 >> 9) + var25.localX * -814686591 & 63) + "," + ((1215159411 * Class210.anInt2259 >> 9) + var25.localY * -845789331 & 63) + " Height: " + (Class387.method4762(822351193 * Class439.anInt4866, 1215159411 * Class210.anInt2259, Class451.localPlayer.aByte10827, 1335332359) - Class322.anInt3458 * 1323364505), -315839031);
               Class27.method722("Look: " + Class451.localPlayer.aByte10827 + "," + (-814686591 * var25.localX + Class289.anInt3117 * 280259667 >> 6) + "," + (Class482.anInt5484 * -968097381 + var25.localY * -845789331 >> 6) + "," + (280259667 * Class289.anInt3117 + var25.localX * -814686591 & 63) + "," + (-845789331 * var25.localY + -968097381 * Class482.anInt5484 & 63) + " Height: " + (Class387.method4762(Class289.anInt3117 * 280259667, -968097381 * Class482.anInt5484, Class451.localPlayer.aByte10827, 1083671431) - Class265.anInt2975 * -1207730477), -315839031);
            }

            return;
         }
      } catch (Exception var12) {
         Class27.method722(Class45.aClass45_463.method920(Class26.aClass673_247, -827840379), -315839031);
         return;
      }

      if(Class684.aClass684_8665 != Class521.aClass684_7051 || -1395039251 * client.anInt11064 >= 2) {
         try {
            if(var0.equalsIgnoreCase("wm1")) {
               Class551.method6647(1, -1, -1, false, -1890486013);
               if(Class57.method1014(-835792618) == 1) {
                  Class27.method722("Success", -315839031);
               } else {
                  Class27.method722("Failure", -315839031);
               }

               return;
            }

            if(var0.equalsIgnoreCase("wm2")) {
               Class551.method6647(2, -1, -1, false, -298895537);
               if(Class57.method1014(-452620289) == 2) {
                  Class27.method722("Success", -315839031);
               } else {
                  Class27.method722("Failure", -315839031);
               }

               return;
            }

            if(Class710.aBool8850 && var0.equalsIgnoreCase("wm3")) {
               Class551.method6647(3, 1024, 768, false, -1311748250);
               if(Class57.method1014(869181911) == 3) {
                  Class27.method722("Success", -315839031);
               } else {
                  Class27.method722("Failure", -315839031);
               }

               return;
            }

            OutFrameBuffer var14;
            int var21;
            if(var0.startsWith("setlobby ")) {
               if(16 != -558705405 * client.anInt11038) {
                  Class27.method722("Failure", -315839031);
                  return;
               }

               var21 = -1;
               var14 = null;
               var0 = var0.substring(9);
               int var19 = var0.indexOf(32);
               if(-1 == var19) {
                  Class27.method722("Failure", -315839031);
                  return;
               }

               try {
                  var21 = Integer.parseInt(var0.substring(0, var19));
               } catch (NumberFormatException var8) {
                  ;
               }

               if(-1 == var21) {
                  Class27.method722("Failure", -315839031);
                  return;
               }

               var20 = var0.substring(var19 + 1).trim() + ".runescape.com";
               Class536.method6424(var20, var21, -1599589675);
               Class27.method722("Success", -315839031);
               return;
            }

            if(var0.equalsIgnoreCase("tk0")) {
               Class285.method3799(0, false, (byte)98);
               if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-99) == 0) {
                  Class27.method722("Success", -315839031);
                  Class230.preferences.method9602(Class230.preferences.aClass711_Sub19_10632, 0, (short)-6579);
                  Class522.method6257(-1042127423);
                  client.aBool11013 = false;
               } else {
                  Class27.method722("Failure", -315839031);
               }

               return;
            }

            if(var0.equalsIgnoreCase("tk1")) {
               Class285.method3799(1, false, (byte)95);
               if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-107) == 1) {
                  Class27.method722("Success", -315839031);
                  Class230.preferences.method9602(Class230.preferences.aClass711_Sub19_10632, 1, (short)-14752);
                  Class522.method6257(-1042127423);
                  client.aBool11013 = false;
               } else {
                  Class27.method722("Failure", -315839031);
               }

               return;
            }

            if(var0.equalsIgnoreCase("tk3")) {
               Class285.method3799(3, false, (byte)6);
               if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-110) == 3) {
                  Class27.method722("Success", -315839031);
                  Class230.preferences.method9602(Class230.preferences.aClass711_Sub19_10632, 3, (short)-18906);
                  Class522.method6257(-1042127423);
                  client.aBool11013 = false;
               } else {
                  Class27.method722("Failure", -315839031);
               }

               return;
            }

            if(var0.equalsIgnoreCase("tk5")) {
               Class285.method3799(5, false, (byte)51);
               if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-52) == 5) {
                  Class27.method722("Success", -315839031);
                  Class230.preferences.method9602(Class230.preferences.aClass711_Sub19_10632, 5, (short)-14214);
                  Class522.method6257(-1042127423);
                  client.aBool11013 = false;
               } else {
                  Class27.method722("Failure", -315839031);
               }

               return;
            }

            if(var0.equalsIgnoreCase("clientdrop")) {
               if(client.anInt11038 * -558705405 == 9) {
                  Class199_Sub12.method9012(625099327);
               } else if(-558705405 * client.anInt11038 == 10) {
                  client.aClass111_11060.aBool1346 = true;
               }

               return;
            }

            int var15;
            if(var0.equalsIgnoreCase("breakcon")) {
               Class111[] var24 = client.aClass111Array11061;

               for(var15 = 0; var15 < var24.length; ++var15) {
                  Class111 var18 = var24[var15];
                  if(var18.method1364(-1184311292) != null) {
                     var18.method1364(-1184311292).method6729(-1380708557);
                  }
               }

               Class247.aClass460_2688.method5437(1821723509);
               return;
            }

            if(var0.startsWith("getclientvarpbit")) {
               var21 = Integer.parseInt(var0.substring(17));
               Class27.method722("varpbit=" + Class242.aClass94_2456.method116(Class242.aClass94_2456.method109(var21, '\uff00'), (byte)60), -315839031);
               return;
            }

            if(var0.startsWith("getclientvarp")) {
               var21 = Integer.parseInt(var0.substring(14));
               Class27.method722("varp=" + Class242.aClass94_2456.method114(Class242.aClass94_2456.method106(Class452.aClass452_4946, var21, 950617682), 1053101524), -315839031);
               return;
            }

            String[] var16;
            if(var0.startsWith("directlogin")) {
               var16 = Class69.method1085(var0.substring(12), '\u0020', (byte)7);
               if(2 == var16.length || var16.length == 3) {
                  if(Class509.method6166(-504814383)) {
                     Class294.method3960(-838600902);
                  }

                  Class461.method5470(var16[0], var16[1], var16.length > 2?var16[2]:"", true, -65466181);
               }

               return;
            }

            if(var0.startsWith("snlogin ")) {
               var16 = Class69.method1085(var0.substring(8), '\u0020', (byte)7);
               var15 = Integer.parseInt(var16[0]);
               String var17 = var16.length > 1?var16[1]:"";
               Class187.method2729(var15, var17, true, -952467138);
               return;
            }

            File var4;
            if(var0.startsWith("setoutput ")) {
               var4 = new File(var0.substring(10));
               if(var4.exists()) {
                  var4 = new File(var0.substring(10) + "." + Class255.time((byte)24) + ".log");
                  if(var4.exists()) {
                     Class27.method722("file already exists!", -315839031);
                     return;
                  }
               }

               if(null != Class90.aFileOutputStream863) {
                  Class90.aFileOutputStream863.close();
                  Class90.aFileOutputStream863 = null;
               }

               try {
                  Class90.aFileOutputStream863 = new FileOutputStream(var4);
                  return;
               } catch (FileNotFoundException var9) {
                  Class27.method722("Could not create " + var4.getName(), -315839031);
                  return;
               } catch (SecurityException var10) {
                  Class27.method722("Cannot write to " + var4.getName(), -315839031);
                  return;
               }
            }

            if(var0.equals("closeoutput")) {
               if(null != Class90.aFileOutputStream863) {
                  Class90.aFileOutputStream863.close();
               }

               Class90.aFileOutputStream863 = null;
               return;
            }

            if(var0.startsWith("runscript ")) {
               var4 = new File(var0.substring(10));
               if(!var4.exists()) {
                  Class27.method722("No such file", -315839031);
                  return;
               }

               byte[] var5 = Class185.method2716(var4, 994651432);
               if(null == var5) {
                  Class27.method722("Failed to read file", -315839031);
                  return;
               }

               String[] var6 = Class69.method1085(Class380.method4704(Class582.method6974(var5, (byte)52), '\r', "", (byte)-68), '\n', (byte)7);
               Class190.method2758(var6, -1653619480);
            }

            if(var0.equalsIgnoreCase("togglesnow")) {
               Class116.aBool1426 = !Class116.aBool1426;
               Class27.method722("Success", -315839031);
               return;
            }

            if(9 == -558705405 * client.anInt11038 || client.anInt11038 * -558705405 == 0) {
               Class111 var13 = Class452_Sub4.method9295((byte)70);
               var14 = Class115.method1414(OutFrame.aClass405_4272, var13.aClass14_1342, -618887074);
               var14.out.writeByte(var0.length() + 3, 486024075);
               var14.out.writeByte(var1?1:0, -825478151);
               var14.out.writeByte(var2?1:0, 1798824298);
               var14.out.method9616(var0, 2043864375);
               var13.write(var14, (byte)-4);
            }
         } catch (Exception var11) {
            Class27.method722(Class45.aClass45_463.method920(Class26.aClass673_247, -827840379), -315839031);
            return;
         }
      }

      if(9 != client.anInt11038 * -558705405 && -558705405 * client.anInt11038 != 0) {
         Class27.method722(Class45.aClass45_465.method920(Class26.aClass673_247, -827840379) + var0, -315839031);
      }

   }
}
