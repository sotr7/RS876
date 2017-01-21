package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class361_Sub1;
import com.jagex.Class565;
import com.jagex.Class665;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface76;
import com.jagex.client;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class Class561 {
   static long aLong7557;
   // $FF: synthetic field
   Class361_Sub1 this$0;
   int anInt7554;
   int anInt7556;
   List aList7555;
   float aFloat7553;
   SourceDataLine aSourceDataLine7547;
   byte[] aByteArray7552;
   byte[] aByteArray7549;
   int anInt7546;
   boolean aBool7548;
   int anInt7550;
   int anInt7551;

   Class561(Class361_Sub1 var1, float var2, int var3) {
      this.this$0 = var1;
      this.anInt7554 = 717092656;
      this.anInt7556 = 1388809190;
      this.aList7555 = new ArrayList();
      if(!this.aBool7548) {
         this.aFloat7553 = var2;
         if(853368251 * this.anInt7554 > 16) {
            throw new RuntimeException("");
         } else {
            try {
               AudioFormat var4 = new AudioFormat(this.aFloat7553, 853368251 * this.anInt7554, 2076990267 * this.anInt7556, true, false);

               try {
                  Info var5 = new Info(SourceDataLine.class, var4, var3);
                  this.aSourceDataLine7547 = (SourceDataLine)AudioSystem.getLine(var5);
               } catch (IllegalArgumentException var6) {
                  return;
               }

               this.aSourceDataLine7547.open(var4, var3);
               this.aSourceDataLine7547.start();
            } catch (LineUnavailableException var7) {
               return;
            }

            this.aByteArray7552 = new byte[var3];
            this.aByteArray7549 = new byte[853368251 * this.anInt7554 / 8];
            this.anInt7546 = 0;
            this.aBool7548 = true;
         }
      }
   }

   void method6744(int var1) {
      if(this.aBool7548) {
         if(null != this.aSourceDataLine7547) {
            this.anInt7550 = this.aSourceDataLine7547.available() * -608018719;
         }

      }
   }

   void method6745() {
      synchronized(this) {
         int var2 = Integer.MAX_VALUE;
         double var3 = (double)(853368251 * this.anInt7554 / 8 * 2076990267 * this.anInt7556);
         boolean var5 = false;
         Iterator var6 = this.aList7555.iterator();

         while(var6.hasNext()) {
            Class565 var7 = (Class565)var6.next();
            int var8 = var7.aByteArray7600.length - var7.anInt7606 * 887823061;
            if(this.aFloat7553 != var7.aFloat7604) {
               var8 = (int)((float)var8 * (this.aFloat7553 / var7.aFloat7604));
               var8 = (int)(var3 * Math.ceil((double)var8 / var3));
            }

            var7.anInt7599 = var8 * -1137481613;
            if(var8 > 0 && var8 < var2) {
               var5 = true;
               var2 = var8;
            }
         }

         if(var2 > 1004758305 * this.anInt7550) {
            var2 = this.anInt7550 * 1004758305;
         }

         if(0 != var2 && var5) {
            int var36 = 853368251 * this.anInt7554 / 8;
            Iterator var37 = this.aList7555.iterator();

            while(true) {
               Class565 var38;
               do {
                  if(!var37.hasNext()) {
                     this.anInt7551 = -1059090167 * var2;
                     return;
                  }

                  var38 = (Class565)var37.next();
               } while(var38.anInt7599 * -654738245 < var2);

               int var9 = this.anInt7546 * -1425846047;
               int var10 = 0;
               int var11 = 909672281 * var38.anInt7607 / 8;
               double var12 = 0.0D;
               int var14 = 0;
               double var15 = (double)this.aFloat7553;
               double var17 = (double)var38.aFloat7604;

               for(int var19 = -1294760419 * var38.anInt7602; -654738245 * var38.anInt7599 > 0 && var10 < var2; var10 += var11) {
                  short var20 = 0;
                  short var21 = 0;
                  byte[] var22 = this.aByteArray7549;

                  for(int var23 = 0; var23 < var22.length; ++var23) {
                     var22[var23] = this.aByteArray7552[var9 + var23];
                     var20 = (short)(var20 | (var22[var23] & 255) << var23 * 8);
                  }

                  byte[] var40;
                  if(this.aFloat7553 != var38.aFloat7604) {
                     var40 = var38.aByteArray7601;
                     float var24 = (float)(var17 * (var12 / var15));
                     float var25 = (float)Math.floor((double)var24);
                     short var26 = 0;
                     short var27 = 0;
                     int var28 = (int)Math.floor((double)var24);
                     int var29 = (int)Math.ceil((double)var24);
                     var28 = var28 * 1262120971 * var38.anInt7608 * var40.length + var40.length * var14;
                     var29 = var40.length * var38.anInt7608 * 1262120971 * var29 + var40.length * var14;
                     var28 += var19;
                     var29 += var19;
                     var28 %= var38.aByteArray7600.length;
                     var29 %= var38.aByteArray7600.length;

                     int var30;
                     for(var30 = 0; var30 < var40.length; ++var30) {
                        var40[var30] = var38.aByteArray7600[var30 + var28];
                        var26 = (short)(var26 | (var40[var30] & 255) << 8 * var30);
                     }

                     for(var30 = 0; var30 < var40.length; ++var30) {
                        var40[var30] = var38.aByteArray7600[var29 + var30];
                        var27 = (short)(var27 | (var40[var30] & 255) << var30 * 8);
                     }

                     float var42 = var24 - var25;
                     if(var42 < 0.0F || var42 > 1.0F) {
                        throw new RuntimeException("");
                     }

                     float var31 = (float)(var27 - var26);
                     var21 = (short)((int)(var42 * var31 + (float)var26));
                     ++var14;
                     var14 %= 1262120971 * var38.anInt7608;
                     if(var14 == 0) {
                        ++var12;
                     }
                  } else {
                     var40 = var38.aByteArray7601;

                     for(int var41 = 0; var41 < var40.length; ++var41) {
                        var40[var41] = var38.aByteArray7600[-1294760419 * var38.anInt7602 + var41];
                        var21 = (short)(var21 | (var40[var41] & 255) << 8 * var41);
                     }

                     var38.anInt7602 += var11 * 777350197;
                     var38.anInt7602 = 777350197 * (-1294760419 * var38.anInt7602 % var38.aByteArray7600.length);
                     var38.anInt7606 += var11 * 275467901;
                  }

                  var21 += var20;
                  if(var21 > 32767) {
                     var21 = 32767;
                  }

                  if(var21 < -32768) {
                     var21 = -32768;
                  }

                  this.aByteArray7552[var9] = (byte)var21;
                  this.aByteArray7552[var9 + 1] = (byte)(var21 >> 8);
                  var9 += var36;
                  var9 %= this.aByteArray7552.length;
               }

               if(var38.aFloat7604 != this.aFloat7553) {
                  double var32 = var17 / var15 * (double)var2;
                  int var39 = (int)(var3 * Math.ceil(var32 / var3));
                  var38.anInt7602 += 777350197 * var39;
                  var38.anInt7602 = -1294760419 * var38.anInt7602 % var38.aByteArray7600.length * 777350197;
                  var38.anInt7606 += 275467901 * var39;
               }
            }
         }
      }
   }

   void method6746(int var1) {
      synchronized(this) {
         int var3 = Integer.MAX_VALUE;
         double var4 = (double)(853368251 * this.anInt7554 / 8 * 2076990267 * this.anInt7556);
         boolean var6 = false;
         Iterator var7 = this.aList7555.iterator();

         while(var7.hasNext()) {
            Class565 var8 = (Class565)var7.next();
            int var9 = var8.aByteArray7600.length - var8.anInt7606 * 887823061;
            if(this.aFloat7553 != var8.aFloat7604) {
               var9 = (int)((float)var9 * (this.aFloat7553 / var8.aFloat7604));
               var9 = (int)(var4 * Math.ceil((double)var9 / var4));
            }

            var8.anInt7599 = var9 * -1137481613;
            if(var9 > 0 && var9 < var3) {
               var6 = true;
               var3 = var9;
            }
         }

         if(var3 > 1004758305 * this.anInt7550) {
            var3 = this.anInt7550 * 1004758305;
         }

         if(0 != var3 && var6) {
            int var37 = 853368251 * this.anInt7554 / 8;
            Iterator var38 = this.aList7555.iterator();

            while(true) {
               Class565 var39;
               do {
                  if(!var38.hasNext()) {
                     this.anInt7551 = -1059090167 * var3;
                     return;
                  }

                  var39 = (Class565)var38.next();
               } while(var39.anInt7599 * -654738245 < var3);

               int var10 = this.anInt7546 * -1425846047;
               int var11 = 0;
               int var12 = 909672281 * var39.anInt7607 / 8;
               double var13 = 0.0D;
               int var15 = 0;
               double var16 = (double)this.aFloat7553;
               double var18 = (double)var39.aFloat7604;

               for(int var20 = -1294760419 * var39.anInt7602; -654738245 * var39.anInt7599 > 0 && var11 < var3; var11 += var12) {
                  short var21 = 0;
                  short var22 = 0;
                  byte[] var23 = this.aByteArray7549;

                  for(int var24 = 0; var24 < var23.length; ++var24) {
                     var23[var24] = this.aByteArray7552[var10 + var24];
                     var21 = (short)(var21 | (var23[var24] & 255) << var24 * 8);
                  }

                  byte[] var41;
                  if(this.aFloat7553 != var39.aFloat7604) {
                     var41 = var39.aByteArray7601;
                     float var25 = (float)(var18 * (var13 / var16));
                     float var26 = (float)Math.floor((double)var25);
                     short var27 = 0;
                     short var28 = 0;
                     int var29 = (int)Math.floor((double)var25);
                     int var30 = (int)Math.ceil((double)var25);
                     var29 = var29 * 1262120971 * var39.anInt7608 * var41.length + var41.length * var15;
                     var30 = var41.length * var39.anInt7608 * 1262120971 * var30 + var41.length * var15;
                     var29 += var20;
                     var30 += var20;
                     var29 %= var39.aByteArray7600.length;
                     var30 %= var39.aByteArray7600.length;

                     int var31;
                     for(var31 = 0; var31 < var41.length; ++var31) {
                        var41[var31] = var39.aByteArray7600[var31 + var29];
                        var27 = (short)(var27 | (var41[var31] & 255) << 8 * var31);
                     }

                     for(var31 = 0; var31 < var41.length; ++var31) {
                        var41[var31] = var39.aByteArray7600[var30 + var31];
                        var28 = (short)(var28 | (var41[var31] & 255) << var31 * 8);
                     }

                     float var43 = var25 - var26;
                     if(var43 < 0.0F || var43 > 1.0F) {
                        throw new RuntimeException("");
                     }

                     float var32 = (float)(var28 - var27);
                     var22 = (short)((int)(var43 * var32 + (float)var27));
                     ++var15;
                     var15 %= 1262120971 * var39.anInt7608;
                     if(var15 == 0) {
                        ++var13;
                     }
                  } else {
                     var41 = var39.aByteArray7601;

                     for(int var42 = 0; var42 < var41.length; ++var42) {
                        var41[var42] = var39.aByteArray7600[-1294760419 * var39.anInt7602 + var42];
                        var22 = (short)(var22 | (var41[var42] & 255) << 8 * var42);
                     }

                     var39.anInt7602 += var12 * 777350197;
                     var39.anInt7602 = 777350197 * (-1294760419 * var39.anInt7602 % var39.aByteArray7600.length);
                     var39.anInt7606 += var12 * 275467901;
                  }

                  var22 += var21;
                  if(var22 > 32767) {
                     var22 = 32767;
                  }

                  if(var22 < -32768) {
                     var22 = -32768;
                  }

                  this.aByteArray7552[var10] = (byte)var22;
                  this.aByteArray7552[var10 + 1] = (byte)(var22 >> 8);
                  var10 += var37;
                  var10 %= this.aByteArray7552.length;
               }

               if(var39.aFloat7604 != this.aFloat7553) {
                  double var33 = var18 / var16 * (double)var3;
                  int var40 = (int)(var4 * Math.ceil(var33 / var4));
                  var39.anInt7602 += 777350197 * var40;
                  var39.anInt7602 = -1294760419 * var39.anInt7602 % var39.aByteArray7600.length * 777350197;
                  var39.anInt7606 += 275467901 * var40;
               }
            }
         }
      }
   }

   void method6747() {
      if(this.aBool7548) {
         if(null != this.aSourceDataLine7547) {
            this.anInt7550 = this.aSourceDataLine7547.available() * -608018719;
         }

      }
   }

   void method6748(Class565 var1, int var2) {
      this.aList7555.remove(var1);
   }

   void method6749() {
      if(this.aBool7548) {
         if(null != this.aSourceDataLine7547) {
            this.anInt7550 = this.aSourceDataLine7547.available() * -608018719;
         }

      }
   }

   void method6750() {
      if(this.aBool7548) {
         if(null != this.aSourceDataLine7547) {
            this.anInt7550 = this.aSourceDataLine7547.available() * -608018719;
         }

      }
   }

   void method6751(int var1) {
      this.anInt7551 = 0;
      this.method6746(-706967364);

      while(this.anInt7551 * 1041321273 > 0) {
         int var2 = this.anInt7551 * 1041321273;
         if(var2 + -1425846047 * this.anInt7546 >= this.aByteArray7552.length) {
            var2 = this.aByteArray7552.length - -1425846047 * this.anInt7546;
         }

         this.aSourceDataLine7547.write(this.aByteArray7552, -1425846047 * this.anInt7546, var2);

         for(int var3 = 0; var3 < var2; ++var3) {
            this.aByteArray7552[var3 + -1425846047 * this.anInt7546] = 0;
         }

         this.anInt7546 += var2 * 1064170273;
         this.anInt7546 = 1064170273 * (this.anInt7546 * -1425846047 % this.aByteArray7552.length);
         this.anInt7551 -= -1059090167 * var2;
      }

   }

   void method6752(Class565 var1, int var2) {
      this.aList7555.add(var1);
   }

   public static Interface76 findIdentifiable(Interface76[] var0, int var1, byte var2) {
      Interface76[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Interface76 var5 = var3[var4];
         if(var1 == var5.getId()) {
            return var5;
         }
      }

      return null;
   }

   static final void method6754(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class665.method7951(var3, var4, var0, (byte)13);
   }

   static final void method6755(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).method3053(var3, 1804571190);
   }
}
