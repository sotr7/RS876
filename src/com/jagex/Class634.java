package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class174;
import com.jagex.Class178;
import com.jagex.Class230;
import com.jagex.Class300;
import com.jagex.OutFrame;
import com.jagex.Class446;
import com.jagex.Class452_Sub4;
import com.jagex.Class498;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class594;
import com.jagex.Class623;
import com.jagex.Class627;
import com.jagex.Class637;
import com.jagex.Class658;
import com.jagex.Class681;
import com.jagex.Class704_Sub3;
import com.jagex.Class8;
import com.jagex.client;

public class Class634 {
   int anInt8264;
   float aFloat8266;
   float aFloat8261;
   float aFloat8259;
   float aFloat8268;
   float aFloat8275;
   float aFloat8267;
   int anInt8263;
   int anInt8260;
   Class178 aClass178_8265;
   float aFloat8270 = 1.0F;
   float aFloat8271 = 0.0F;
   float aFloat8274 = 1.0F;
   float aFloat8273 = 0.0F;
   float aFloat8272 = 1.0F;
   Class498 aClass498_8269;
   int[] anIntArray8258 = new int[]{-1, -1, -1};
   float[] aFloatArray8276 = new float[]{0.0F, 0.0F, 0.0F};
   Class446 aClass446_8262;

   void method7530(Class174 var1, Class634 var2, Class634 var3, float var4, int var5) {
      this.anInt8264 = Class300.method3992(var2.anInt8264 * 1455764081, var3.anInt8264 * 1455764081, 255.0F * var4, 1484904021) * -1410314607;
      this.aFloat8266 = var2.aFloat8266 + var4 * (var3.aFloat8266 - var2.aFloat8266);
      this.aFloat8261 = var4 * (var3.aFloat8261 - var2.aFloat8261) + var2.aFloat8261;
      this.aFloat8259 = (var3.aFloat8259 - var2.aFloat8259) * var4 + var2.aFloat8259;
      this.aFloat8268 = var4 * (var3.aFloat8268 - var2.aFloat8268) + var2.aFloat8268;
      this.aFloat8275 = var2.aFloat8275 + (var3.aFloat8275 - var2.aFloat8275) * var4;
      this.aFloat8267 = var4 * (var3.aFloat8267 - var2.aFloat8267) + var2.aFloat8267;
      this.anInt8263 = Class300.method3992(669202103 * var2.anInt8263, var3.anInt8263 * 669202103, var4 * 255.0F, -1414851226) * -1450604793;
      this.anInt8260 = -191158023 * (int)((float)(var3.anInt8260 * -402056887 - -402056887 * var2.anInt8260) * var4 + (float)(var2.anInt8260 * -402056887));
      if(var2.aClass178_8265 != var3.aClass178_8265) {
         this.aClass178_8265 = var1.method2338(var2.aClass178_8265, var3.aClass178_8265, var4, this.aClass178_8265);
      }

      if(var2.aClass498_8269 != var3.aClass498_8269) {
         if(null == var2.aClass498_8269) {
            this.aClass498_8269 = var3.aClass498_8269;
            if(null != this.aClass498_8269) {
               this.aClass498_8269.method5938((int)(255.0F * var4), 0, (byte)106);
            }
         } else {
            this.aClass498_8269 = var2.aClass498_8269;
            if(null != this.aClass498_8269) {
               this.aClass498_8269.method5938((int)(var4 * 255.0F), 255, (byte)86);
            }
         }
      }

      this.aFloat8270 = (var3.aFloat8270 - var2.aFloat8270) * var4 + var2.aFloat8270;
      this.aFloat8271 = (var3.aFloat8271 - var2.aFloat8271) * var4 + var2.aFloat8271;
      this.aFloat8274 = var4 * (var3.aFloat8274 - var2.aFloat8274) + var2.aFloat8274;
      this.aFloat8273 = var4 * (var3.aFloat8273 - var2.aFloat8273) + var2.aFloat8273;
      this.aFloat8272 = var2.aFloat8272 + var4 * (var3.aFloat8272 - var2.aFloat8272);
      float var6 = var2.aFloatArray8276[2] + var2.aFloatArray8276[0] + var2.aFloatArray8276[1];
      float var7 = var3.aFloatArray8276[1] + var3.aFloatArray8276[0] + var3.aFloatArray8276[2];
      float var8 = var6 + (var7 - var6) * var4;
      float[] var12;
      if(var8 == 0.0F) {
         int[] var9 = this.anIntArray8258;
         int[] var10 = this.anIntArray8258;
         this.anIntArray8258[2] = -1;
         var10[1] = -1;
         var9[0] = -1;
         float[] var11 = this.aFloatArray8276;
         var12 = this.aFloatArray8276;
         this.aFloatArray8276[2] = 0.0F;
         var12[1] = 0.0F;
         var11[0] = 0.0F;
      } else {
         int var20;
         if(-1 == var2.anIntArray8258[0] && -1 == var2.anIntArray8258[1] && -1 == var2.anIntArray8258[2]) {
            for(var20 = 0; var20 < 3; ++var20) {
               this.anIntArray8258[var20] = var3.anIntArray8258[var20];
               if(this.anIntArray8258[var20] == -1) {
                  this.aFloatArray8276[var20] = 0.0F;
               } else {
                  this.aFloatArray8276[var20] = var3.aFloatArray8276[var20] * var4;
               }
            }
         } else if(var3.anIntArray8258[0] == -1 && -1 == var3.anIntArray8258[1] && -1 == var3.anIntArray8258[2]) {
            for(var20 = 0; var20 < 3; ++var20) {
               this.anIntArray8258[var20] = var2.anIntArray8258[var20];
               if(this.anIntArray8258[var20] == -1) {
                  this.aFloatArray8276[var20] = 0.0F;
               } else {
                  this.aFloatArray8276[var20] = (1.0F - var4) * var2.aFloatArray8276[var20];
               }
            }
         } else {
            float var19 = 1.0F - var4;
            int var21 = 0;
            int[] var22 = new int[]{-1, -1, -1, -1, -1, -1};
            var12 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};

            int var13;
            for(var13 = 0; var13 < 3; ++var13) {
               if(var2.anIntArray8258[var13] > -1) {
                  var22[var21] = var2.anIntArray8258[var13];
                  var12[var21++] = var19 * var2.aFloatArray8276[var13];
               }
            }

            var13 = var21;

            int var14;
            for(var14 = 0; var14 < 3; ++var14) {
               if(var3.anIntArray8258[var14] > -1) {
                  float var15 = var4 * var3.aFloatArray8276[var14];

                  for(int var16 = 0; var16 < var13; ++var16) {
                     if(var22[var16] == var3.anIntArray8258[var14]) {
                        var12[var16] += var15;
                        break;
                     }

                     if(var13 - 1 == var16) {
                        var22[var21] = var3.anIntArray8258[var14];
                        var12[var21++] = var15;
                     }
                  }
               }
            }

            if(var21 > 3) {
               float var23 = 0.0F;
               float var24 = 0.0F;

               int var17;
               for(var17 = 0; var17 < var21; ++var17) {
                  var23 += var12[var17];
               }

               Class704_Sub3.method10273(var12, var22, 0, var21 - 1, (byte)-51);

               for(var17 = 0; var17 < 3; ++var17) {
                  var24 += var12[var17];
               }

               float var25 = var23 / var24;

               for(int var18 = 0; var18 < 3; ++var18) {
                  var12[var18] *= var25;
               }
            }

            for(var14 = 0; var14 < 3; ++var14) {
               this.anIntArray8258[var14] = var22[var14];
               this.aFloatArray8276[var14] = var12[var14];
            }
         }
      }

   }

   public Class634(RSByteBuffer var1, Class623 var2) {
      this.method7534(var1, var2, -1897721075);
   }

   void method7531(int var1) {
      this.anInt8264 = -451956369;
      this.aClass446_8262 = Class446.method5309(-50.0F, -60.0F, -50.0F);
      this.aFloat8259 = 1.1523438F;
      this.aFloat8266 = 0.69921875F;
      this.aFloat8261 = 1.2F;
      this.anInt8263 = -453124968;
      this.anInt8260 = 0;
      this.aClass178_8265 = Class623.aClass178_8157;
      this.aFloat8275 = 1.0F;
      this.aFloat8267 = 0.25F;
      this.aFloat8268 = 1.0F;
      this.aClass498_8269 = Class623.aClass498_8146;
      this.aFloat8270 = 1.0F;
      this.aFloat8271 = 0.0F;
      this.aFloat8274 = 1.0F;
      this.aFloat8273 = 0.0F;
      this.aFloat8272 = 1.0F;
      int[] var2 = this.anIntArray8258;
      int[] var3 = this.anIntArray8258;
      this.anIntArray8258[2] = -1;
      var3[1] = -1;
      var2[0] = -1;
      float[] var4 = this.aFloatArray8276;
      float[] var5 = this.aFloatArray8276;
      this.aFloatArray8276[2] = 0.0F;
      var5[1] = 0.0F;
      var4[0] = 0.0F;
   }

   void method7532(Class623 var1, Class637 var2, int var3) {
      if(Class230.preferences.aClass711_Sub9_10618.method9924(1241277847) == 1 && Class554.aClass174_7475.method2334() > 0) {
         if(var2.method7576((byte)0) != -1) {
            this.anInt8264 = var2.method7576((byte)0) * -1410314607;
         }

         if(var2.method7571((byte)69) != -1.0F) {
            this.aFloat8259 = var2.method7571((byte)119);
         }

         if(var2.method7594(-840087895) != -1.0F) {
            this.aFloat8266 = var2.method7594(-1680086613);
         }

         if(var2.method7573(-2124865854) != -1.0F) {
            this.aFloat8261 = var2.method7573(-1947878236);
         }
      }

      if(var2.method7574(-1732202948) != null) {
         this.aClass446_8262.method5267(var2.method7574(-1786998740));
      }

      if(var2.method7575(-1349776645) != -1) {
         this.anInt8263 = var2.method7575(-1349776645) * -1450604793;
      }

      if(var2.method7597((byte)5) != -1) {
         this.anInt8260 = var2.method7597((byte)59) * -191158023;
      }

      if(var2.method7599(-555568373) != -1.0F) {
         this.aFloat8267 = var2.method7599(-555568373);
      }

      if(var2.method7577(-1730576285) != -1.0F) {
         this.aFloat8268 = var2.method7577(-1730576285);
      }

      if(var2.method7578((byte)0) != -1.0F) {
         this.aFloat8275 = var2.method7578((byte)0);
      }

      if(var2.method7587(2003893048) != -1) {
         this.aClass178_8265 = var1.method7369(var2.method7587(1936378485), -1739415010);
      }

      if(var2.method7580(2020935622) != -1) {
         int var4 = var2.method7580(2083973960);
         int var5 = var2.method7572((byte)-9);
         int var6 = var2.method7581((byte)40);
         int var7 = var2.method7582(16711935);
         int var8 = var2.method7583(-614549121);
         Class627.anInt8196 = -1959578101 * var8;
         this.aClass498_8269 = var1.method7370(var4, var5, var6, var7, 459047587);
      }

      if(var2.method7596(0, (byte)27) != -1) {
         this.anIntArray8258[0] = var2.method7596(0, (byte)49);
         this.aFloatArray8276[0] = var2.method7584(0, (byte)64);
      }

      if(var2.method7596(1, (byte)36) != -1) {
         this.anIntArray8258[1] = var2.method7596(1, (byte)31);
         this.aFloatArray8276[1] = var2.method7584(1, (byte)105);
      }

      if(var2.method7596(2, (byte)44) != -1) {
         this.anIntArray8258[2] = var2.method7596(2, (byte)109);
         this.aFloatArray8276[2] = var2.method7584(2, (byte)60);
      }

   }

   public void method7533(RSByteBuffer var1, short var2) {
      this.method7536(var1, 0, -733909459);
   }

   public void method7534(RSByteBuffer var1, Class623 var2, int var3) {
      int var4 = var1.readUnsignedByte(-1067368430);
      if(Class230.preferences.aClass711_Sub9_10618.method9924(1892033686) == 1 && Class554.aClass174_7475.method2334() > 0) {
         if((var4 & Class658.aClass658_8505.anInt8507 * 342550689) != 0) {
            this.anInt8264 = var1.readInt((byte)5) * -1410314607;
         } else {
            this.anInt8264 = -451956369;
         }

         if(0 != (var4 & Class658.aClass658_8493.anInt8507 * 342550689)) {
            this.aFloat8259 = (float)var1.readUnsignedShort(702382574) / 256.0F;
         } else {
            this.aFloat8259 = 1.1523438F;
         }

         if((var4 & 342550689 * Class658.aClass658_8494.anInt8507) != 0) {
            this.aFloat8266 = (float)var1.readUnsignedShort(192039650) / 256.0F;
         } else {
            this.aFloat8266 = 0.69921875F;
         }

         if((var4 & Class658.aClass658_8495.anInt8507 * 342550689) != 0) {
            this.aFloat8261 = (float)var1.readUnsignedShort(478287727) / 256.0F;
         } else {
            this.aFloat8261 = 1.2F;
         }
      } else {
         if(0 != (var4 & Class658.aClass658_8505.anInt8507 * 342550689)) {
            var1.readInt((byte)5);
         }

         if(0 != (var4 & 342550689 * Class658.aClass658_8493.anInt8507)) {
            var1.readUnsignedShort(1070563690);
         }

         if(0 != (var4 & 342550689 * Class658.aClass658_8494.anInt8507)) {
            var1.readUnsignedShort(2086939817);
         }

         if(0 != (var4 & 342550689 * Class658.aClass658_8495.anInt8507)) {
            var1.readUnsignedShort(1049969384);
         }

         this.anInt8264 = -451956369;
         this.aFloat8261 = 1.2F;
         this.aFloat8266 = 0.69921875F;
         this.aFloat8259 = 1.1523438F;
      }

      if(0 != (var4 & 342550689 * Class658.aClass658_8496.anInt8507)) {
         this.aClass446_8262 = Class446.method5309((float)var1.readShort((byte)1), (float)var1.readShort((byte)1), (float)var1.readShort((byte)1));
      } else {
         this.aClass446_8262 = Class446.method5309(-50.0F, -60.0F, -50.0F);
      }

      if((var4 & Class658.aClass658_8497.anInt8507 * 342550689) != 0) {
         this.anInt8263 = var1.readInt((byte)5) * -1450604793;
      } else {
         this.anInt8263 = -453124968;
      }

      if(0 != (var4 & 342550689 * Class658.aClass658_8498.anInt8507)) {
         this.anInt8260 = var1.readUnsignedShort(1849480632) * -191158023;
      } else {
         this.anInt8260 = 0;
      }

      if(0 != (var4 & 342550689 * Class658.aClass658_8503.anInt8507)) {
         int var5 = var1.readUnsignedShort(422956921);
         this.aClass178_8265 = var2.method7369(var5, -1121112905);
      } else {
         this.aClass178_8265 = Class623.aClass178_8157;
      }

   }

   public void method7535(RSByteBuffer var1, short var2) {
      this.aFloat8275 = var1.method9634((byte)1);
      this.aFloat8267 = var1.method9634((byte)1);
      this.aFloat8268 = var1.method9634((byte)1);
   }

   void method7536(RSByteBuffer var1, int var2, int var3) {
      this.anIntArray8258[var2] = var1.readUnsignedShort(521632463);
      this.aFloatArray8276[var2] = var1.method9634((byte)1);
   }

   public Class634() {
      this.method7531(-1285593629);
   }

   public Class498 method7537(int var1) {
      return this.aClass498_8269;
   }

   public int method7538(int var1) {
      return 669202103 * this.anInt8263;
   }

   public int method7539() {
      return 669202103 * this.anInt8263;
   }

   void method7540() {
      this.anInt8264 = -451956369;
      this.aClass446_8262 = Class446.method5309(-50.0F, -60.0F, -50.0F);
      this.aFloat8259 = 1.1523438F;
      this.aFloat8266 = 0.69921875F;
      this.aFloat8261 = 1.2F;
      this.anInt8263 = -453124968;
      this.anInt8260 = 0;
      this.aClass178_8265 = Class623.aClass178_8157;
      this.aFloat8275 = 1.0F;
      this.aFloat8267 = 0.25F;
      this.aFloat8268 = 1.0F;
      this.aClass498_8269 = Class623.aClass498_8146;
      this.aFloat8270 = 1.0F;
      this.aFloat8271 = 0.0F;
      this.aFloat8274 = 1.0F;
      this.aFloat8273 = 0.0F;
      this.aFloat8272 = 1.0F;
      int[] var1 = this.anIntArray8258;
      int[] var2 = this.anIntArray8258;
      this.anIntArray8258[2] = -1;
      var2[1] = -1;
      var1[0] = -1;
      float[] var3 = this.aFloatArray8276;
      float[] var4 = this.aFloatArray8276;
      this.aFloatArray8276[2] = 0.0F;
      var4[1] = 0.0F;
      var3[0] = 0.0F;
   }

   boolean method7541(Class634 var1, int var2) {
      return this.anInt8264 * 1455764081 == var1.anInt8264 * 1455764081 && this.aFloat8259 == var1.aFloat8259 && this.aFloat8266 == var1.aFloat8266 && this.aFloat8261 == var1.aFloat8261 && this.aFloat8267 == var1.aFloat8267 && this.aFloat8275 == var1.aFloat8275 && this.aFloat8268 == var1.aFloat8268 && this.anInt8263 * 669202103 == var1.anInt8263 * 669202103 && this.anInt8260 * -402056887 == -402056887 * var1.anInt8260 && var1.aClass178_8265 == this.aClass178_8265 && this.aClass498_8269 == var1.aClass498_8269 && var1.aFloat8270 == this.aFloat8270 && this.aFloat8271 == var1.aFloat8271 && this.aFloat8274 == var1.aFloat8274 && var1.aFloat8273 == this.aFloat8273 && this.aFloat8272 == var1.aFloat8272 && var1.anIntArray8258[0] == this.anIntArray8258[0] && var1.anIntArray8258[1] == this.anIntArray8258[1] && var1.anIntArray8258[2] == this.anIntArray8258[2] && this.aFloatArray8276[0] == var1.aFloatArray8276[0] && this.aFloatArray8276[1] == var1.aFloatArray8276[1] && this.aFloatArray8276[2] == var1.aFloatArray8276[2];
   }

   void method7542(RSByteBuffer var1, int var2) {
      this.anIntArray8258[var2] = var1.readUnsignedShort(506833844);
      this.aFloatArray8276[var2] = var1.method9634((byte)1);
   }

   void method7543(Class634 var1, int var2) {
      this.anInt8264 = 1 * var1.anInt8264;
      this.aFloat8259 = var1.aFloat8259;
      this.aFloat8266 = var1.aFloat8266;
      this.aFloat8261 = var1.aFloat8261;
      this.aClass446_8262.method5267(var1.aClass446_8262);
      this.anInt8263 = 1 * var1.anInt8263;
      this.anInt8260 = 1 * var1.anInt8260;
      this.aClass178_8265 = var1.aClass178_8265;
      this.aFloat8275 = var1.aFloat8275;
      this.aFloat8267 = var1.aFloat8267;
      this.aFloat8268 = var1.aFloat8268;
      this.aClass498_8269 = var1.aClass498_8269;
      this.aFloat8270 = var1.aFloat8270;
      this.aFloat8271 = var1.aFloat8271;
      this.aFloat8274 = var1.aFloat8274;
      this.aFloat8273 = var1.aFloat8273;
      this.aFloat8272 = var1.aFloat8272;
      this.anIntArray8258[0] = var1.anIntArray8258[0];
      this.anIntArray8258[1] = var1.anIntArray8258[1];
      this.anIntArray8258[2] = var1.anIntArray8258[2];
      this.aFloatArray8276[0] = var1.aFloatArray8276[0];
      this.aFloatArray8276[1] = var1.aFloatArray8276[1];
      this.aFloatArray8276[2] = var1.aFloatArray8276[2];
   }

   public void method7544(RSByteBuffer var1, Class623 var2, int var3) {
      int var4 = var1.readUnsignedShort(708244299);
      int var5 = var1.readShort((byte)1);
      int var6 = var1.readShort((byte)1);
      int var7 = var1.readShort((byte)1);
      int var8 = var1.readUnsignedShort(1589721704);
      Class627.anInt8196 = -1959578101 * var8;
      this.aClass498_8269 = var2.method7370(var4, var5, var6, var7, 459047587);
   }

   public int method7545() {
      return 669202103 * this.anInt8263;
   }

   static final void method7546(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var2 < 0) {
         var2 = 0;
      }

      client.anInt11111 = -1065631749 * (-662273649 * client.anInt11110 + var2);
   }

   static final void method7547(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ~var2;
   }

   public static final void method7548(String var0, String var1, int var2) {
      Class111 var3 = Class452_Sub4.method9295((byte)37);
      OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4257, var3.aClass14_1342, -329273245);
      if(var1.length() > 30) {
         var1 = var1.substring(0, 30);
      }

      var4.out.writeByte(Class594.method7039(var0, -624962492) + Class594.method7039(var1, -1782057179), -1037945078);
      var4.out.method9616(var0, 1960947642);
      var4.out.method9616(var1, -1750850235);
      var3.write(var4, (byte)62);
   }

   static final void method7549(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class8.method558(-2044413293);
   }
}
