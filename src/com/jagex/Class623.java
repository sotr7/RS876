package com.jagex;

import com.jagex.Class100;
import com.jagex.Class173;
import com.jagex.Class174;
import com.jagex.Class176;
import com.jagex.Class178;
import com.jagex.Class181;
import com.jagex.Class192;
import com.jagex.Class199_Sub1;
import com.jagex.Class210;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class274;
import com.jagex.Class285;
import com.jagex.Class294;
import com.jagex.Class315_Sub1;
import com.jagex.Class32;
import com.jagex.Class385;
import com.jagex.Class439;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.Class498;
import com.jagex.GameMap;
import com.jagex.Class594;
import com.jagex.Class633;
import com.jagex.Class634;
import com.jagex.Class637;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class76;
import com.jagex.client;

public class Class623 {
   Class637 aClass637_8159;
   Class634 aClass634_8150;
   long aLong8147 = 0L;
   int anInt8169 = 0;
   int anInt8160 = 1530518447;
   boolean aBool8165 = false;
   boolean aBool8153 = false;
   boolean aBool8168 = false;
   float aFloat8170;
   float aFloat8152;
   float aFloat8171;
   float aFloat8172;
   float aFloat8173;
   Class446 aClass446_8144 = new Class446(-50.0F, -60.0F, -50.0F);
   Class192 aClass192_8161 = new Class192(9);
   Class192 aClass192_8162 = new Class192(8);
   Class192 aClass192_8163 = new Class192(8);
   int[] anIntArray8166 = new int[]{-1, -1, -1};
   float[] aFloatArray8167 = new float[]{0.0F, 0.0F, 0.0F};
   Class174 aClass174_8148;
   Class466 aClass466_8164;
   Class634[][] aClass634ArrayArray8149;
   static Class178 aClass178_8157;
   static Class498 aClass498_8146;
   Class634 aClass634_8154;
   Class634 aClass634_8155;
   Class634 aClass634_8156;
   Class634 aClass634_8158;
   public static int anInt8151 = 1554148609;
   static int anInt8145 = -1567010352;

   public void method7361(int var1) {
      this.aClass192_8161.method2770(1296595613);
      this.aClass192_8162.method2770(1425415222);
      this.aClass192_8163.method2770(266644989);
   }

   public void method7362(GameMap var1, int var2) {
      Class634 var3 = this.method7387(var1, 339331970);
      if(null != this.aClass637_8159) {
         this.aClass634_8150.method7543(var3, -47729408);
         this.aClass634_8150.method7532(this, this.aClass637_8159, 1432479957);
         this.method7375(this.aClass634_8150, this.aClass637_8159.method7585(-2110864949), -619150553);
      } else {
         this.method7375(var3, -1745201291 * anInt8145, -2031005203);
      }

      this.method7383(-599519702);
      this.method7391((byte)-20);
      this.method7381((byte)111);
   }

   public void method7363(GameMap var1, short var2) {
      Class634 var3 = this.method7387(var1, 1853804855);
      if(this.aClass637_8159 != null) {
         this.aClass634_8150.method7543(var3, -47729408);
         this.aClass634_8150.method7532(this, this.aClass637_8159, -1221088518);
         this.method7375(this.aClass634_8150, this.aClass637_8159.method7585(-2110864949), -522448120);
      } else {
         this.method7375(var3, -1745201291 * anInt8145, -1380579064);
      }

      this.method7383(-1446176989);
      this.method7380(-2132920252);
      this.method7378('\uff00');
      this.method7386(462945053);
   }

   public void method7364(GameMap var1, Class637 var2, int var3, byte var4) {
      this.aClass637_8159 = var2;
      Class634 var5 = this.method7387(var1, -116485728);
      if(null != this.aClass637_8159) {
         if(this.aClass634_8150 == null) {
            this.aClass634_8150 = new Class634();
         }

         this.aClass634_8150.method7543(var5, -47729408);
         this.aClass634_8150.method7532(this, this.aClass637_8159, 499654972);
         this.method7375(this.aClass634_8150, var3, -723516404);
      } else {
         this.method7375(var5, var3, -1976491416);
         this.aClass634_8150 = null;
      }

   }

   public Class637 method7365(int var1) {
      return this.aClass637_8159;
   }

   public Class634 method7366(int var1) {
      return this.aClass634_8155;
   }

   public void method7367(Class623 var1, int var2) {
      this.aClass634_8155.method7543(var1.aClass634_8155, -47729408);
      this.aClass634_8156.method7543(var1.aClass634_8156, -47729408);
      this.aClass634_8158.method7543(var1.aClass634_8158, -47729408);
      this.aLong8147 = 1L * var1.aLong8147;
      this.anInt8169 = 1 * var1.anInt8169;
      this.anInt8160 = 1 * var1.anInt8160;
   }

   void method7368(int var1) {
      this.aBool8165 = false;
      int[] var2 = this.anIntArray8166;
      int[] var3 = this.anIntArray8166;
      this.anIntArray8166[2] = -1;
      var3[1] = -1;
      var2[0] = -1;
      float[] var4 = this.aFloatArray8167;
      float[] var5 = this.aFloatArray8167;
      this.aFloatArray8167[2] = 0.0F;
      var5[1] = 0.0F;
      var4[0] = 0.0F;
   }

   Class178 method7369(int var1, int var2) {
      Class178 var3 = (Class178)this.aClass192_8161.method2765((long)var1);
      if(null != var3) {
         return var3;
      } else {
         var3 = this.aClass174_8148.method2477(var1);
         this.aClass192_8161.method2768(var3, (long)var1);
         return var3;
      }
   }

   Class498 method7370(int var1, int var2, int var3, int var4, int var5) {
      long var6 = ((long)var2 & 65535L) << 48 | ((long)var3 & 65535L) << 32 | ((long)var4 & 65535L) << 16 | (long)var1 & 65535L;
      Class498 var8 = (Class498)this.aClass192_8162.method2765(var6);
      if(null == var8) {
         var8 = Class100.method1283(var1, var2, var3, var4, Class294.aClass40_Sub13_3189, Class199_Sub1.aClass40_Sub4_9867, -409209397);
         this.aClass192_8162.method2768(var8, var6);
      }

      return var8;
   }

   Class176 method7371(int var1, int var2) {
      Class176 var3 = (Class176)this.aClass192_8163.method2765((long)var1);
      if(var3 != null) {
         return var3;
      } else {
         Class173 var4 = Class181.method2680(this.aClass466_8164, var1);
         if(var4 != null && var4.method2168() == 256 && var4.method2175() == 16) {
            int[] var5 = var4.method2204(false);
            var3 = this.aClass174_8148.method2345(var5);
            if(null != var3) {
               this.aClass192_8163.method2768(var3, (long)var1);
            }
         }

         return var3;
      }
   }

   public void method7372(int var1, int var2, Class634 var3, int var4) {
      this.aClass634ArrayArray8149[var1][var2] = var3;
   }

   void method7373() {
      if(this.aClass174_8148.method2343()) {
         if(this.aBool8168) {
            this.aClass174_8148.method2455(this.aFloat8170, this.aFloat8152, this.aFloat8171, this.aFloat8172, this.aFloat8173);
         } else {
            this.aClass174_8148.method2455(this.aClass634_8155.aFloat8270, this.aClass634_8155.aFloat8271, this.aClass634_8155.aFloat8274, this.aClass634_8155.aFloat8273, this.aClass634_8155.aFloat8272);
         }

      }
   }

   void method7374() {
      this.aBool8165 = false;
      int[] var1 = this.anIntArray8166;
      int[] var2 = this.anIntArray8166;
      this.anIntArray8166[2] = -1;
      var2[1] = -1;
      var1[0] = -1;
      float[] var3 = this.aFloatArray8167;
      float[] var4 = this.aFloatArray8167;
      this.aFloatArray8167[2] = 0.0F;
      var4[1] = 0.0F;
      var3[0] = 0.0F;
   }

   void method7375(Class634 var1, int var2, int var3) {
      if(this.aBool8153) {
         this.aBool8153 = false;
         var2 = 0;
      }

      if(!this.aClass634_8158.method7541(var1, 884277901)) {
         this.aClass634_8158.method7543(var1, -47729408);
         this.aLong8147 = Class255.time((byte)24) * 1142735217672133987L;
         this.anInt8169 = (this.anInt8160 = -1530518447 * var2) * 758158601;
         if(0 != this.anInt8169 * 92365929) {
            this.aClass634_8156.method7543(this.aClass634_8155, -47729408);
            if(this.aClass634_8155.aClass498_8269 != null) {
               if(this.aClass634_8155.aClass498_8269.method5935(1017702877)) {
                  this.aClass634_8155.aClass498_8269 = this.aClass634_8156.aClass498_8269 = this.aClass634_8155.aClass498_8269.method5926(1590798613);
               }

               if(null != this.aClass634_8155.aClass498_8269 && this.aClass634_8158.aClass498_8269 != this.aClass634_8155.aClass498_8269) {
                  this.aClass634_8155.aClass498_8269.method5924(this.aClass634_8158.aClass498_8269, -1744933313);
               }
            }
         }
      }

   }

   void method7376() {
      this.aBool8165 = false;
      int[] var1 = this.anIntArray8166;
      int[] var2 = this.anIntArray8166;
      this.anIntArray8166[2] = -1;
      var2[1] = -1;
      var1[0] = -1;
      float[] var3 = this.aFloatArray8167;
      float[] var4 = this.aFloatArray8167;
      this.aFloatArray8167[2] = 0.0F;
      var4[1] = 0.0F;
      var3[0] = 0.0F;
   }

   public void method7377(byte var1) {
      this.aBool8153 = true;
   }

   void method7378(int var1) {
      if(this.aClass174_8148.method2343()) {
         if(this.aBool8168) {
            this.aClass174_8148.method2455(this.aFloat8170, this.aFloat8152, this.aFloat8171, this.aFloat8172, this.aFloat8173);
         } else {
            this.aClass174_8148.method2455(this.aClass634_8155.aFloat8270, this.aClass634_8155.aFloat8271, this.aClass634_8155.aFloat8274, this.aClass634_8155.aFloat8273, this.aClass634_8155.aFloat8272);
         }

      }
   }

   public void method7379(float var1, float var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.aClass174_8148.method2331((0.7F + (float)Class230.preferences.aClass711_Sub5_10612.method9888(1427294417) * 0.1F + client.aClass505_11204.method6059(34037815)) * var1);
      this.aClass174_8148.method2364(var4, var2, var3, (float)(var5 << 2), (float)(var6 << 2), (float)(var7 << 2));
      this.aClass174_8148.method2621(this.method7369(var8, -1608266525));
   }

   void method7380(int var1) {
      this.aClass174_8148.method2350(this.aClass634_8155.aFloat8268, this.aClass634_8155.aFloat8275, this.aClass634_8155.aFloat8267, (byte)-103);
   }

   public void method7381(byte var1) {
      byte var2 = 0;
      int var3 = var2 + (this.aClass634_8155.anInt8260 * -402056887 + 256 << 2);
      this.aClass174_8148.method2333(669202103 * this.aClass634_8155.anInt8263, Class230.preferences.aClass711_Sub15_10610.method9986((short)255) == 1?var3:-1, 0);
   }

   void method7382(int var1) {
      this.aBool8168 = false;
      this.aFloat8170 = 1.0F;
      this.aFloat8152 = 0.0F;
      this.aFloat8171 = 1.0F;
      this.aFloat8172 = 0.0F;
      this.aFloat8173 = 1.0F;
   }

   void method7383(int var1) {
      if(-911366991 * this.anInt8160 >= 0) {
         long var2 = Class255.time((byte)24);
         this.anInt8160 = (int)((long)this.anInt8160 - (var2 - -542333990730380213L * this.aLong8147) * -1530518447L);
         if(-911366991 * this.anInt8160 > 0) {
            this.aClass634_8155.method7530(this.aClass174_8148, this.aClass634_8156, this.aClass634_8158, (float)(this.anInt8169 * 92365929 - -911366991 * this.anInt8160) / (float)(this.anInt8169 * 92365929), 156212273);
         } else {
            this.aClass634_8155.method7543(this.aClass634_8158, -47729408);
            if(this.aClass634_8155.aClass498_8269 != null) {
               this.aClass634_8155.aClass498_8269.method5925(-841320172);
            }

            this.anInt8160 = 1530518447;
         }

         this.aLong8147 = 1142735217672133987L * var2;
      }

   }

   public void method7384(int var1) {
      this.aClass174_8148.method2331((0.7F + (float)Class230.preferences.aClass711_Sub5_10612.method9888(1427294417) * 0.1F + client.aClass505_11204.method6059(1547588884)) * 1.1523438F);
      this.aClass174_8148.method2364(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
      this.aClass174_8148.method2333(13156520, -1, 0);
      this.aClass174_8148.method2621(aClass178_8157);
   }

   public void method7385(int var1, int var2, int var3) {
      Class634 var4 = this.aClass634ArrayArray8149[var1][var2];
      if(null != var4) {
         this.aClass446_8144.method5267(var4.aClass446_8262);
      }

      this.method7391((byte)-104);
   }

   void method7386(int var1) {
      if(this.aClass174_8148.method2537()) {
         Class176 var2 = null;
         Class176 var3 = null;
         Class176 var4 = null;
         if(this.aBool8165) {
            if(this.anIntArray8166[0] > -1) {
               var2 = this.method7371(this.anIntArray8166[0], -679804287);
            }

            if(this.anIntArray8166[1] > -1) {
               var3 = this.method7371(this.anIntArray8166[1], -679804287);
            }

            if(this.anIntArray8166[2] > -1) {
               var4 = this.method7371(this.anIntArray8166[2], -679804287);
            }

            this.aClass174_8148.method2347(var2, this.aFloatArray8167[0], var3, this.aFloatArray8167[1], var4, this.aFloatArray8167[2]);
         } else {
            if(this.aClass634_8155.anIntArray8258[0] > -1) {
               var2 = this.method7371(this.aClass634_8155.anIntArray8258[0], -679804287);
            }

            if(this.aClass634_8155.anIntArray8258[1] > -1) {
               var3 = this.method7371(this.aClass634_8155.anIntArray8258[1], -679804287);
            }

            if(this.aClass634_8155.anIntArray8258[2] > -1) {
               var4 = this.method7371(this.aClass634_8155.anIntArray8258[2], -679804287);
            }

            this.aClass174_8148.method2347(var2, this.aClass634_8155.aFloatArray8276[0], var3, this.aClass634_8155.aFloatArray8276[1], var4, this.aClass634_8155.aFloatArray8276[2]);
         }

      }
   }

   public Class623(Class174 var1, Class466 var2, int var3, int var4) {
      this.aClass174_8148 = var1;
      this.aClass466_8164 = var2;
      this.aClass634ArrayArray8149 = new Class634[var3][var4];
      if(-281449217 * anInt8151 != -1) {
         aClass178_8157 = this.method7369(-281449217 * anInt8151, -1857086852);
      }

      aClass498_8146 = null;
      this.aClass634_8154 = new Class634();
      this.aClass634_8155 = new Class634();
      this.aClass634_8156 = new Class634();
      this.aClass634_8158 = new Class634();
      this.method7377((byte)0);
      this.method7368(1710713959);
      this.method7382(-1730576285);
   }

   Class634 method7387(GameMap var1, int var2) {
      Class634 var3 = null;
      int var4 = -1;
      int var5 = -1;
      if(!Class594.method7038(client.anInt11038 * -558705405, (byte)27) && !Class385.method4746(client.anInt11038 * -558705405, (byte)34)) {
         if(null != Class451.localPlayer) {
            var4 = Class451.localPlayer.screenX[0] >> 3;
            var5 = Class451.localPlayer.screenY[0] >> 3;
         }

         if(var4 < 0 || var4 >= var1.method6056(-1746741811) >> 3 || var5 < 0 || var5 >= var1.method6057(126749238) >> 3) {
            var4 = var1.method6056(-1746741811) >> 4;
            var5 = var1.method6057(126749238) >> 4;
         }
      } else {
         var4 = 822351193 * Class439.anInt4866 >> 12;
         var5 = Class210.anInt2259 * 1215159411 >> 12;
      }

      var3 = this.aClass634ArrayArray8149[var4][var5];
      if(null == var3) {
         var3 = this.aClass634_8154;
      }

      return var3;
   }

   public void method7388() {
      this.aClass192_8161.method2770(1488076471);
      this.aClass192_8162.method2770(1093573190);
      this.aClass192_8163.method2770(14339034);
   }

   public void method7389() {
      this.aClass192_8161.method2770(1451946656);
      this.aClass192_8162.method2770(720259884);
      this.aClass192_8163.method2770(1498998230);
   }

   public void method7390() {
      for(int var1 = 0; var1 < this.aClass634ArrayArray8149.length; ++var1) {
         for(int var2 = 0; var2 < this.aClass634ArrayArray8149[var1].length; ++var2) {
            this.aClass634ArrayArray8149[var1][var2] = this.aClass634_8154;
         }
      }

   }

   void method7391(byte var1) {
      this.aClass174_8148.method2331((0.7F + (float)Class230.preferences.aClass711_Sub5_10612.method9888(1427294417) * 0.1F + client.aClass505_11204.method6059(1524370682)) * this.aClass634_8155.aFloat8259);
      this.aClass174_8148.method2364(1455764081 * this.aClass634_8155.anInt8264, this.aClass634_8155.aFloat8266, this.aClass634_8155.aFloat8261, (float)((int)this.aClass446_8144.aFloat4917 << 2), (float)((int)this.aClass446_8144.aFloat4915 << 2), (float)((int)this.aClass446_8144.aFloat4919 << 2));
      this.aClass174_8148.method2621(this.aClass634_8155.aClass178_8265);
   }

   public void method7392() {
      for(int var1 = 0; var1 < this.aClass634ArrayArray8149.length; ++var1) {
         for(int var2 = 0; var2 < this.aClass634ArrayArray8149[var1].length; ++var2) {
            this.aClass634ArrayArray8149[var1][var2] = this.aClass634_8154;
         }
      }

   }

   public void method7393() {
      for(int var1 = 0; var1 < this.aClass634ArrayArray8149.length; ++var1) {
         for(int var2 = 0; var2 < this.aClass634ArrayArray8149[var1].length; ++var2) {
            this.aClass634ArrayArray8149[var1][var2] = this.aClass634_8154;
         }
      }

   }

   public void method7394(int var1) {
      for(int var2 = 0; var2 < this.aClass634ArrayArray8149.length; ++var2) {
         for(int var3 = 0; var3 < this.aClass634ArrayArray8149[var2].length; ++var3) {
            this.aClass634ArrayArray8149[var2][var3] = this.aClass634_8154;
         }
      }

   }

   public void method7395() {
      this.aBool8153 = true;
   }

   void method7396() {
      this.aClass174_8148.method2331((0.7F + (float)Class230.preferences.aClass711_Sub5_10612.method9888(1427294417) * 0.1F + client.aClass505_11204.method6059(220137257)) * this.aClass634_8155.aFloat8259);
      this.aClass174_8148.method2364(1455764081 * this.aClass634_8155.anInt8264, this.aClass634_8155.aFloat8266, this.aClass634_8155.aFloat8261, (float)((int)this.aClass446_8144.aFloat4917 << 2), (float)((int)this.aClass446_8144.aFloat4915 << 2), (float)((int)this.aClass446_8144.aFloat4919 << 2));
      this.aClass174_8148.method2621(this.aClass634_8155.aClass178_8265);
   }

   void method7397() {
      this.aClass174_8148.method2331((0.7F + (float)Class230.preferences.aClass711_Sub5_10612.method9888(1427294417) * 0.1F + client.aClass505_11204.method6059(258618400)) * this.aClass634_8155.aFloat8259);
      this.aClass174_8148.method2364(1455764081 * this.aClass634_8155.anInt8264, this.aClass634_8155.aFloat8266, this.aClass634_8155.aFloat8261, (float)((int)this.aClass446_8144.aFloat4917 << 2), (float)((int)this.aClass446_8144.aFloat4915 << 2), (float)((int)this.aClass446_8144.aFloat4919 << 2));
      this.aClass174_8148.method2621(this.aClass634_8155.aClass178_8265);
   }

   void method7398() {
      this.aClass174_8148.method2331((0.7F + (float)Class230.preferences.aClass711_Sub5_10612.method9888(1427294417) * 0.1F + client.aClass505_11204.method6059(515811799)) * this.aClass634_8155.aFloat8259);
      this.aClass174_8148.method2364(1455764081 * this.aClass634_8155.anInt8264, this.aClass634_8155.aFloat8266, this.aClass634_8155.aFloat8261, (float)((int)this.aClass446_8144.aFloat4917 << 2), (float)((int)this.aClass446_8144.aFloat4915 << 2), (float)((int)this.aClass446_8144.aFloat4919 << 2));
      this.aClass174_8148.method2621(this.aClass634_8155.aClass178_8265);
   }

   public void method7399() {
      byte var1 = 0;
      int var2 = var1 + (this.aClass634_8155.anInt8260 * -402056887 + 256 << 2);
      this.aClass174_8148.method2333(669202103 * this.aClass634_8155.anInt8263, Class230.preferences.aClass711_Sub15_10610.method9986((short)255) == 1?var2:-1, 0);
   }

   void method7400() {
      this.aClass174_8148.method2350(this.aClass634_8155.aFloat8268, this.aClass634_8155.aFloat8275, this.aClass634_8155.aFloat8267, (byte)-23);
   }

   void method7401() {
      this.aClass174_8148.method2350(this.aClass634_8155.aFloat8268, this.aClass634_8155.aFloat8275, this.aClass634_8155.aFloat8267, (byte)-88);
   }

   void method7402() {
      if(this.aClass174_8148.method2343()) {
         if(this.aBool8168) {
            this.aClass174_8148.method2455(this.aFloat8170, this.aFloat8152, this.aFloat8171, this.aFloat8172, this.aFloat8173);
         } else {
            this.aClass174_8148.method2455(this.aClass634_8155.aFloat8270, this.aClass634_8155.aFloat8271, this.aClass634_8155.aFloat8274, this.aClass634_8155.aFloat8273, this.aClass634_8155.aFloat8272);
         }

      }
   }

   void method7403() {
      if(this.aClass174_8148.method2537()) {
         Class176 var1 = null;
         Class176 var2 = null;
         Class176 var3 = null;
         if(this.aBool8165) {
            if(this.anIntArray8166[0] > -1) {
               var1 = this.method7371(this.anIntArray8166[0], -679804287);
            }

            if(this.anIntArray8166[1] > -1) {
               var2 = this.method7371(this.anIntArray8166[1], -679804287);
            }

            if(this.anIntArray8166[2] > -1) {
               var3 = this.method7371(this.anIntArray8166[2], -679804287);
            }

            this.aClass174_8148.method2347(var1, this.aFloatArray8167[0], var2, this.aFloatArray8167[1], var3, this.aFloatArray8167[2]);
         } else {
            if(this.aClass634_8155.anIntArray8258[0] > -1) {
               var1 = this.method7371(this.aClass634_8155.anIntArray8258[0], -679804287);
            }

            if(this.aClass634_8155.anIntArray8258[1] > -1) {
               var2 = this.method7371(this.aClass634_8155.anIntArray8258[1], -679804287);
            }

            if(this.aClass634_8155.anIntArray8258[2] > -1) {
               var3 = this.method7371(this.aClass634_8155.anIntArray8258[2], -679804287);
            }

            this.aClass174_8148.method2347(var1, this.aClass634_8155.aFloatArray8276[0], var2, this.aClass634_8155.aFloatArray8276[1], var3, this.aClass634_8155.aFloatArray8276[2]);
         }

      }
   }

   void method7404() {
      if(this.aClass174_8148.method2537()) {
         Class176 var1 = null;
         Class176 var2 = null;
         Class176 var3 = null;
         if(this.aBool8165) {
            if(this.anIntArray8166[0] > -1) {
               var1 = this.method7371(this.anIntArray8166[0], -679804287);
            }

            if(this.anIntArray8166[1] > -1) {
               var2 = this.method7371(this.anIntArray8166[1], -679804287);
            }

            if(this.anIntArray8166[2] > -1) {
               var3 = this.method7371(this.anIntArray8166[2], -679804287);
            }

            this.aClass174_8148.method2347(var1, this.aFloatArray8167[0], var2, this.aFloatArray8167[1], var3, this.aFloatArray8167[2]);
         } else {
            if(this.aClass634_8155.anIntArray8258[0] > -1) {
               var1 = this.method7371(this.aClass634_8155.anIntArray8258[0], -679804287);
            }

            if(this.aClass634_8155.anIntArray8258[1] > -1) {
               var2 = this.method7371(this.aClass634_8155.anIntArray8258[1], -679804287);
            }

            if(this.aClass634_8155.anIntArray8258[2] > -1) {
               var3 = this.method7371(this.aClass634_8155.anIntArray8258[2], -679804287);
            }

            this.aClass174_8148.method2347(var1, this.aClass634_8155.aFloatArray8276[0], var2, this.aClass634_8155.aFloatArray8276[1], var3, this.aClass634_8155.aFloatArray8276[2]);
         }

      }
   }

   void method7405() {
      this.aBool8165 = false;
      int[] var1 = this.anIntArray8166;
      int[] var2 = this.anIntArray8166;
      this.anIntArray8166[2] = -1;
      var2[1] = -1;
      var1[0] = -1;
      float[] var3 = this.aFloatArray8167;
      float[] var4 = this.aFloatArray8167;
      this.aFloatArray8167[2] = 0.0F;
      var4[1] = 0.0F;
      var3[0] = 0.0F;
   }

   void method7406() {
      if(this.aClass174_8148.method2537()) {
         Class176 var1 = null;
         Class176 var2 = null;
         Class176 var3 = null;
         if(this.aBool8165) {
            if(this.anIntArray8166[0] > -1) {
               var1 = this.method7371(this.anIntArray8166[0], -679804287);
            }

            if(this.anIntArray8166[1] > -1) {
               var2 = this.method7371(this.anIntArray8166[1], -679804287);
            }

            if(this.anIntArray8166[2] > -1) {
               var3 = this.method7371(this.anIntArray8166[2], -679804287);
            }

            this.aClass174_8148.method2347(var1, this.aFloatArray8167[0], var2, this.aFloatArray8167[1], var3, this.aFloatArray8167[2]);
         } else {
            if(this.aClass634_8155.anIntArray8258[0] > -1) {
               var1 = this.method7371(this.aClass634_8155.anIntArray8258[0], -679804287);
            }

            if(this.aClass634_8155.anIntArray8258[1] > -1) {
               var2 = this.method7371(this.aClass634_8155.anIntArray8258[1], -679804287);
            }

            if(this.aClass634_8155.anIntArray8258[2] > -1) {
               var3 = this.method7371(this.aClass634_8155.anIntArray8258[2], -679804287);
            }

            this.aClass174_8148.method2347(var1, this.aClass634_8155.aFloatArray8276[0], var2, this.aClass634_8155.aFloatArray8276[1], var3, this.aClass634_8155.aFloatArray8276[2]);
         }

      }
   }

   public void method7407() {
      this.aClass174_8148.method2331((0.7F + (float)Class230.preferences.aClass711_Sub5_10612.method9888(1427294417) * 0.1F + client.aClass505_11204.method6059(1038858701)) * 1.1523438F);
      this.aClass174_8148.method2364(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
      this.aClass174_8148.method2333(13156520, -1, 0);
      this.aClass174_8148.method2621(aClass178_8157);
   }

   public void method7408() {
      this.aClass174_8148.method2331((0.7F + (float)Class230.preferences.aClass711_Sub5_10612.method9888(1427294417) * 0.1F + client.aClass505_11204.method6059(674695219)) * 1.1523438F);
      this.aClass174_8148.method2364(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
      this.aClass174_8148.method2333(13156520, -1, 0);
      this.aClass174_8148.method2621(aClass178_8157);
   }

   public static void method7409(byte var0) {
      Class192 var1 = Class633.aClass192_8256;
      synchronized(var1) {
         Class633.aClass192_8256.method2772(-886147951);
      }

      var1 = Class633.aClass192_8239;
      synchronized(var1) {
         Class633.aClass192_8239.method2772(-169896862);
      }
   }

   static final void method7410(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-14);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class274.method3615(var3, var4, var0, (byte)12);
   }

   static final void method7411(int var0, InterfaceDef var1, Class681 var2, int var3) {
      if(var0 >= 1 && var0 <= 10) {
         Class690.method8098(var0, var1.uid * 919258769, var1.componentSlot * 1300712985, "", -181468848);
      } else {
         throw new RuntimeException();
      }
   }

   static void method7412(Class681 var0, int var1) {
      Class285 var2 = (Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], -381938803);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anIntArrayArray3084 == null?0:var2.anIntArrayArray3084.length;
   }

   static void method7413(byte var0) {
      Class32.aString334 = "";
      Class32.aString344 = "";
      Class32.aString315 = "";
      Class32.aBool309 = true;
   }
}
