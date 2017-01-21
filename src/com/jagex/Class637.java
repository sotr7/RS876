package com.jagex;

import com.jagex.Class103;
import com.jagex.Class217;
import com.jagex.Class230;
import com.jagex.Class31;
import com.jagex.Class398;
import com.jagex.Class433;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class491;
import com.jagex.RSByteBuffer;
import com.jagex.Buffer;
import com.jagex.Class596;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class658;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.Class692;
import com.jagex.Class70;
import com.jagex.Class701;
import com.jagex.client;

public class Class637 {
   int anInt8326;
   float aFloat8312;
   float aFloat8313;
   float aFloat8323;
   Class446 aClass446_8315;
   int anInt8329;
   int anInt8316;
   float aFloat8318;
   float aFloat8319;
   float aFloat8320;
   int anInt8321;
   int anInt8322;
   int anInt8311;
   int anInt8324;
   int anInt8325;
   int anInt8317;
   int anInt8314;
   int[] anIntArray8327 = new int[3];
   float[] aFloatArray8328 = new float[3];

   public int method7567() {
      return 715973913 * this.anInt8317;
   }

   void method7568(int var1) {
      this.anInt8326 = 1446596901;
      this.aFloat8312 = -1.0F;
      this.aFloat8313 = -1.0F;
      this.aFloat8323 = -1.0F;
      this.aClass446_8315 = null;
      this.anInt8329 = -2028036427;
      this.anInt8316 = 1078026219;
      this.aFloat8318 = -1.0F;
      this.aFloat8319 = -1.0F;
      this.aFloat8320 = -1.0F;
      this.anInt8321 = 2119764079;
      this.anInt8322 = 183947903;
      this.anInt8311 = -240060281;
      this.anInt8324 = -1781474553;
      this.anInt8325 = -66062039;
      this.anInt8317 = -121415465;

      for(int var2 = 0; var2 < this.anIntArray8327.length; ++var2) {
         this.anIntArray8327[var2] = -1;
         this.aFloatArray8328[var2] = 0.0F;
      }

      this.anInt8314 = -1342107368;
   }

   public boolean method7569(RSByteBuffer var1, int var2) {
      int var3 = var1.readUnsignedShort(513011200);
      if(var3 == 0) {
         this.anInt8314 = var1.readUnsignedShort(102158939) * 1831964627;
         return false;
      } else {
         if((var3 & 342550689 * Class658.aClass658_8505.anInt8507) != 0) {
            this.anInt8326 = var1.readInt((byte)5) * -1446596901;
         }

         if((var3 & Class658.aClass658_8493.anInt8507 * 342550689) != 0) {
            this.aFloat8312 = var1.method9634((byte)1);
         }

         if(0 != (var3 & Class658.aClass658_8494.anInt8507 * 342550689)) {
            this.aFloat8313 = var1.method9634((byte)1);
         }

         if((var3 & 342550689 * Class658.aClass658_8495.anInt8507) != 0) {
            this.aFloat8323 = var1.method9634((byte)1);
         }

         if((var3 & 342550689 * Class658.aClass658_8496.anInt8507) != 0) {
            this.aClass446_8315 = Class446.method5263(var1);
         }

         if((var3 & 342550689 * Class658.aClass658_8497.anInt8507) != 0) {
            this.anInt8329 = var1.readInt((byte)5) * 2028036427;
         }

         if(0 != (var3 & 342550689 * Class658.aClass658_8498.anInt8507)) {
            this.anInt8316 = var1.readUnsignedShort(1714102248) * -1078026219;
         }

         if(0 != (var3 & 342550689 * Class658.aClass658_8503.anInt8507)) {
            this.anInt8321 = var1.readUnsignedShort(148383286) * -2119764079;
         }

         if(0 != (var3 & Class658.aClass658_8500.anInt8507 * 342550689)) {
            this.aFloat8318 = var1.method9634((byte)1);
         }

         if((var3 & 342550689 * Class658.aClass658_8501.anInt8507) != 0) {
            this.aFloat8319 = var1.method9634((byte)1);
         }

         if((var3 & 342550689 * Class658.aClass658_8502.anInt8507) != 0) {
            this.aFloat8320 = var1.method9634((byte)1);
         }

         if(0 != (var3 & Class658.aClass658_8499.anInt8507 * 342550689)) {
            this.anInt8322 = var1.readUnsignedShort(1566994019) * -183947903;
            this.anInt8311 = var1.readShort((byte)1) * 240060281;
            this.anInt8324 = var1.readShort((byte)1) * 1781474553;
            this.anInt8325 = var1.readShort((byte)1) * 66062039;
            this.anInt8317 = var1.readUnsignedShort(489614578) * 121415465;
         }

         if(0 != (var3 & Class658.aClass658_8492.anInt8507 * 342550689)) {
            this.anIntArray8327[0] = var1.readUnsignedShort(776133336);
            this.aFloatArray8328[0] = var1.method9634((byte)1);
         }

         if((var3 & 342550689 * Class658.aClass658_8504.anInt8507) != 0) {
            this.anIntArray8327[1] = var1.readUnsignedShort(1634807048);
            this.aFloatArray8328[1] = var1.method9634((byte)1);
         }

         if((var3 & 342550689 * Class658.aClass658_8506.anInt8507) != 0) {
            this.anIntArray8327[2] = var1.readUnsignedShort(1527695992);
            this.aFloatArray8328[2] = var1.method9634((byte)1);
         }

         this.anInt8314 = var1.readUnsignedShort(2119100701) * 1831964627;
         return true;
      }
   }

   public int method7570() {
      return this.anInt8324 * 18898249;
   }

   public float method7571(byte var1) {
      return this.aFloat8312;
   }

   public int method7572(byte var1) {
      return 428454601 * this.anInt8311;
   }

   public float method7573(int var1) {
      return this.aFloat8323;
   }

   public Class446 method7574(int var1) {
      return this.aClass446_8315;
   }

   public int method7575(int var1) {
      return this.anInt8329 * -1085661085;
   }

   public int method7576(byte var1) {
      return this.anInt8326 * 1926995283;
   }

   public float method7577(int var1) {
      return this.aFloat8319;
   }

   public float method7578(byte var1) {
      return this.aFloat8320;
   }

   public int method7579() {
      return this.anInt8329 * -1085661085;
   }

   public int method7580(int var1) {
      return -1582493055 * this.anInt8322;
   }

   public int method7581(byte var1) {
      return this.anInt8324 * 18898249;
   }

   public int method7582(int var1) {
      return this.anInt8325 * -1066513177;
   }

   public int method7583(int var1) {
      return 715973913 * this.anInt8317;
   }

   public Class637() {
      this.method7568(537626648);
   }

   public float method7584(int var1, byte var2) {
      return this.aFloatArray8328[var1];
   }

   public int method7585(int var1) {
      return this.anInt8314 * -1010130853;
   }

   void method7586() {
      this.anInt8326 = 1446596901;
      this.aFloat8312 = -1.0F;
      this.aFloat8313 = -1.0F;
      this.aFloat8323 = -1.0F;
      this.aClass446_8315 = null;
      this.anInt8329 = -2028036427;
      this.anInt8316 = 1078026219;
      this.aFloat8318 = -1.0F;
      this.aFloat8319 = -1.0F;
      this.aFloat8320 = -1.0F;
      this.anInt8321 = 2119764079;
      this.anInt8322 = 183947903;
      this.anInt8311 = -240060281;
      this.anInt8324 = -1781474553;
      this.anInt8325 = -66062039;
      this.anInt8317 = -121415465;

      for(int var1 = 0; var1 < this.anIntArray8327.length; ++var1) {
         this.anIntArray8327[var1] = -1;
         this.aFloatArray8328[var1] = 0.0F;
      }

      this.anInt8314 = -1342107368;
   }

   public int method7587(int var1) {
      return 1258203505 * this.anInt8321;
   }

   public int method7588() {
      return this.anInt8326 * 1926995283;
   }

   public int method7589() {
      return this.anInt8329 * -1085661085;
   }

   public int method7590() {
      return -1582493055 * this.anInt8322;
   }

   public int method7591() {
      return this.anInt8329 * -1085661085;
   }

   public int method7592() {
      return this.anInt8316 * -344969411;
   }

   public float method7593() {
      return this.aFloat8318;
   }

   public float method7594(int var1) {
      return this.aFloat8313;
   }

   public int method7595() {
      return -1582493055 * this.anInt8322;
   }

   public int method7596(int var1, byte var2) {
      return this.anIntArray8327[var1];
   }

   public int method7597(byte var1) {
      return this.anInt8316 * -344969411;
   }

   public int method7598() {
      return this.anInt8324 * 18898249;
   }

   public float method7599(int var1) {
      return this.aFloat8318;
   }

   public int method7600() {
      return this.anInt8325 * -1066513177;
   }

   public int method7601() {
      return this.anInt8325 * -1066513177;
   }

   public int method7602() {
      return 715973913 * this.anInt8317;
   }

   public int method7603() {
      return 428454601 * this.anInt8311;
   }

   public int method7604() {
      return 715973913 * this.anInt8317;
   }

   public int method7605(int var1) {
      return this.anIntArray8327[var1];
   }

   public int method7606(int var1) {
      return this.anIntArray8327[var1];
   }

   public int method7607() {
      return this.anInt8324 * 18898249;
   }

   public int method7608(int var1) {
      return this.anIntArray8327[var1];
   }

   public int method7609() {
      return this.anInt8314 * -1010130853;
   }

   static final void method7610(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub21_10629.method10045(-260208467);
   }

   static void method7611(Class445 var0, Class433 var1, int var2, int var3, byte var4) {
      if(null == Class31.aClass433_288) {
         Class31.aClass433_288 = new Class433(var1);
      } else {
         Class31.aClass433_288.method5083(var1);
      }

      Class31.aClass445_260.method5242(var0);
      Class31.anInt286 = var2 * -550823529;
      Class31.anInt294 = 413475097 * var3;
   }

   static void method7612(Buffer var0, int var1, int var2) {
      Class596 var3 = client.aClass505_11204.method6128(2140871169);
      boolean var4 = var0.readBit(1, 673441488) == 1;
      if(var4) {
         Class103.anIntArray1269[(Class103.anInt1275 += 1044927781) * 187285165 - 1] = var1;
      }

      int var5 = var0.readBit(2, 673441488);
      Class639_Sub1_Sub2_Sub1_Sub1 var6 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1];
      if(0 == var5) {
         if(!var4) {
            if(var1 == -1204447689 * client.localPlayerIndex) {
               throw new RuntimeException();
            } else {
               Class70 var15 = Class103.aClass70Array1274[var1] = new Class70();
               MovementDirection.method8035(-647518007);
               var15.anInt784 = 274978377 * ((var3.localX * -814686591 + var6.screenX[0] >> 6 << 14) + (var6.aByte10827 << 28) + (var6.screenY[0] + var3.localY * -845789331 >> 6));
               if(-1 != var6.anInt12172 * 986534229) {
                  var15.anInt785 = -428852171 * var6.anInt12172;
               } else {
                  var15.anInt785 = var6.aClass34_11940.method817(497779782) * 1260306273;
               }

               var15.anInt786 = var6.anInt11911 * 1123399561;
               var15.aClass215_787 = var6.aClass215_12182;
               var15.aBool788 = var6.aBool12184;
               if(var6.anInt12179 * -1469591895 > 0) {
                  Class491.method5875(var6, 1403901021);
               }

               client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1] = null;
               if(var0.readBit(1, 673441488) != 0) {
                  Class217.method2992(var0, var1, 1788163620);
               }

            }
         }
      } else {
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         if(1 == var5) {
            var7 = var0.readBit(3, 673441488);
            var8 = var0.readBit(1, 673441488);
            var9 = var6.screenX[0];
            var10 = var6.screenY[0];
            if(1 == var8) {
               Class103.aByteArray1267[var1] = MovementDirection.RUNNING.id;
               var11 = var0.readBit(2, 673441488);
               switch(var11) {
               case 0:
                  var6.method10970(var9, 1 + var10, Class103.aByteArray1267[var1], (byte)-10);
                  break;
               case 1:
                  var6.method10970(var9 - 1, var10, Class103.aByteArray1267[var1], (byte)1);
                  break;
               case 2:
                  var6.method10970(var9 + 1, var10, Class103.aByteArray1267[var1], (byte)-110);
                  break;
               case 3:
                  var6.method10970(var9, var10 - 1, Class103.aByteArray1267[var1], (byte)-55);
               }
            }

            if(var7 == 0) {
               --var9;
               --var10;
            } else if(1 == var7) {
               --var10;
            } else if(var7 == 2) {
               ++var9;
               --var10;
            } else if(var7 == 3) {
               --var9;
            } else if(4 == var7) {
               ++var9;
            } else if(5 == var7) {
               --var9;
               ++var10;
            } else if(6 == var7) {
               ++var10;
            } else if(var7 == 7) {
               ++var9;
               ++var10;
            }

            var6.method10970(var9, var10, Class103.aByteArray1267[var1], (byte)-17);
         } else if(var5 == 2) {
            var7 = var0.readBit(4, 673441488);
            var8 = var6.screenX[0];
            var9 = var6.screenY[0];
            if(var7 == 0) {
               var8 -= 2;
               var9 -= 2;
            } else if(1 == var7) {
               --var8;
               var9 -= 2;
            } else if(var7 == 2) {
               var9 -= 2;
            } else if(var7 == 3) {
               ++var8;
               var9 -= 2;
            } else if(var7 == 4) {
               var8 += 2;
               var9 -= 2;
            } else if(var7 == 5) {
               var8 -= 2;
               --var9;
            } else if(6 == var7) {
               var8 += 2;
               --var9;
            } else if(7 == var7) {
               var8 -= 2;
            } else if(var7 == 8) {
               var8 += 2;
            } else if(var7 == 9) {
               var8 -= 2;
               ++var9;
            } else if(10 == var7) {
               var8 += 2;
               ++var9;
            } else if(var7 == 11) {
               var8 -= 2;
               var9 += 2;
            } else if(var7 == 12) {
               --var8;
               var9 += 2;
            } else if(var7 == 13) {
               var9 += 2;
            } else if(14 == var7) {
               ++var8;
               var9 += 2;
            } else if(15 == var7) {
               var8 += 2;
               var9 += 2;
            }

            var6.method10970(var8, var9, Class103.aByteArray1267[var1], (byte)-41);
         } else {
            var7 = var0.readBit(1, 673441488);
            int var12;
            int var13;
            int var14;
            if(var7 == 0) {
               var8 = var0.readBit(15, 673441488);
               var9 = var8 >> 12 & 7;
               var10 = (byte)(var8 >> 10) & 3;
               var11 = var8 >> 5 & 31;
               if(var11 > 15) {
                  var11 -= 32;
               }

               var12 = var8 & 31;
               if(var12 > 15) {
                  var12 -= 32;
               }

               var13 = var6.screenX[0] + var11;
               var14 = var6.screenY[0] + var12;
               if(var9 == -736743521 * MovementDirection.aClass683_8650.anInt8655) {
                  var6.method10971(var13, var14, 1799561567);
               } else {
                  Class103.aByteArray1267[var1] = (byte)(var9 - 1);
                  var6.method10970(var13, var14, Class103.aByteArray1267[var1], (byte)-39);
               }

               var6.aByte10827 = var6.aByte10828 = (byte)(var6.aByte10827 + var10 & 3);
               if(client.aClass505_11204.method6094((byte)-6).method5614(var13, var14, -1198378856)) {
                  ++var6.aByte10828;
               }

               if(client.localPlayerIndex * -1204447689 == var1 && var6.aByte10827 != Class692.anInt8703 * -395336755) {
                  Class692.anInt8703 = var6.aByte10827 * 1290141957;
               }

            } else {
               var8 = var0.readBit(3, 673441488);
               var9 = var0.readBit(30, 673441488);
               var10 = var9 >> 28 & 3;
               var11 = var9 >> 14 & 16383;
               var12 = var9 & 16383;
               var13 = (var6.screenX[0] + -814686591 * var3.localX + var11 & 16383) - -814686591 * var3.localX;
               var14 = (var6.screenY[0] + var3.localY * -845789331 + var12 & 16383) - var3.localY * -845789331;
               if(-736743521 * MovementDirection.aClass683_8650.anInt8655 == var8) {
                  var6.method10971(var13, var14, 1384729515);
               } else {
                  Class103.aByteArray1267[var1] = (byte)(var8 - 1);
                  var6.method10970(var13, var14, Class103.aByteArray1267[var1], (byte)-19);
               }

               var6.aByte10827 = var6.aByte10828 = (byte)(var6.aByte10827 + var10 & 3);
               if(client.aClass505_11204.method6094((byte)33).method5614(var13, var14, -35061622)) {
                  ++var6.aByte10828;
               }

               if(-1204447689 * client.localPlayerIndex == var1) {
                  Class692.anInt8703 = var6.aByte10827 * 1290141957;
               }

            }
         }
      }
   }

   public static Class701 method7613(int var0, byte var1) {
      Class701[] var2 = Class398.method4828((short)14720);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class701 var4 = var2[var3];
         if(var0 == var4.anInt8785 * 1729626771) {
            return var4;
         }
      }

      return null;
   }
}
