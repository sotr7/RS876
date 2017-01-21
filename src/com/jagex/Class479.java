package com.jagex;

import com.jagex.Class108;
import com.jagex.Class221;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.NPCDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class361;
import com.jagex.Class376;
import com.jagex.Class378;
import com.jagex.Class474;
import com.jagex.Class475;
import com.jagex.Class480;
import com.jagex.Class482;
import com.jagex.Class493;
import com.jagex.RSByteBuffer;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Interface39;
import com.jagex.Interface56;
import com.jagex.Interface57;
import com.jagex.Interface70;

public class Class479 {
   Class475 aClass475_5426;
   float aFloat5440 = 0.0F;
   float aFloat5442 = 0.0F;
   long aLong5429 = 0L;
   long aLong5443 = 0L;
   float aFloat5402;
   byte[] aByteArray5441;
   Interface57 anInterface57_5408;
   Object anObject5431;
   int anInt5401;
   boolean aBool5405;
   int anInt5406;
   float aFloat5418;
   int anInt5409;
   int anInt5435;
   int anInt5417;
   int anInt5419;
   int anInt5422;
   int anInt5420;
   Object anObject5415;
   int[] anIntArray5421;
   int[] anIntArray5416;
   int[] anIntArray5434;
   int anInt5424;
   Class480[] aClass480Array5413;
   float[] aFloatArray5404;
   boolean aBool5447;
   boolean aBool5448;
   boolean aBool5411;
   boolean aBool5436;
   float aFloat5423;
   boolean aBool5425;
   int anInt5445 = 0;
   int anInt5449;
   int anInt5439 = 0;
   int anInt5430 = 0;
   int anInt5446 = 0;
   boolean aBool5438;
   int anInt5437 = 0;
   int anInt5427 = 0;
   int anInt5444 = 0;
   int anInt5432 = 0;
   int anInt5414;
   float aFloat5403;
   boolean aBool5450;
   Interface56 anInterface56_5400;
   boolean aBool5407;
   Class361 aClass361_5428;
   int anInt5412;
   int anInt5410;
   Interface39 anInterface39_5433;

   RSByteBuffer method5669(int var1, int var2) {
      return this.anInterface39_5433.method300(var1);
   }

   public Class475 method5670(int var1) {
      return this.aClass475_5426;
   }

   void method5671(Class475 var1, int var2) {
      this.aClass475_5426 = var1;
   }

   boolean method5672(byte var1) {
      return this.aClass475_5426 == Class475.aClass475_5382;
   }

   boolean method5673() {
      return this.aClass475_5426 == Class475.aClass475_5382;
   }

   public void method5674(int var1) {
      if(this.method5670(277661824).anInt5376 * 1403645875 >= 1403645875 * Class475.aClass475_5381.anInt5376) {
         throw new RuntimeException("");
      } else {
         this.method5671(Class475.aClass475_5381, 218456408);
      }
   }

   boolean method5675(int var1) {
      return this.aClass475_5426 == Class475.aClass475_5383;
   }

   void method5676(float var1, int var2, byte var3) {
      if(var2 <= 0) {
         this.aFloat5402 = var1;
         this.aFloat5442 = this.aFloat5402;
         this.aLong5429 = 0L;
         this.aLong5443 = 0L;
      } else {
         this.aFloat5440 = this.aFloat5402;
         this.aFloat5442 = var1;
         this.aLong5429 = Class255.time((byte)24) * -2226127564100751757L;
         this.aLong5443 = -2694178512443417729L * ((long)var2 + 9064612270242113211L * this.aLong5429);
      }

   }

   float method5677(int var1) {
      return this.aFloat5402;
   }

   boolean method5678(byte[] var1, Interface57 var2, int var3, float var4, boolean var5, boolean var6, int var7, float var8, Object var9, int var10) {
      synchronized(this) {
         if(null != var2) {
            this.aByteArray5441 = null;
            this.anInterface57_5408 = var2;
         } else {
            this.aByteArray5441 = var1;
         }

         this.anObject5431 = var9;
         this.anInt5401 = var3 * -243631195;
         this.aFloat5402 = var4;
         this.aBool5405 = var6;
         this.anInt5406 = var7 * 1459917393;
         this.aFloat5418 = var8;
         byte[] var12 = null;
         if(null != this.aByteArray5441) {
            var12 = this.aByteArray5441;
         } else if(null != this.anInterface57_5408) {
            this.anInt5409 = 0;
            var12 = this.anInterface57_5408.method373(this.anInt5409 * -600215689, (byte)-35);
         }

         if(var12 == null) {
            return null != var12;
         } else {
            RSByteBuffer var13 = new RSByteBuffer(var12);
            if(var13.readUnsignedByte(-826737840) == 74 && var13.readUnsignedByte(-343611477) == 65 && var13.readUnsignedByte(1940221136) == 71 && var13.readUnsignedByte(-70382852) == 65) {
               this.anInt5435 = var13.readInt((byte)5) * 1778551877;
               this.anInt5417 = var13.readInt((byte)5) * -987712771;
               this.anInt5419 = var13.readInt((byte)5) * 1608584281;
               this.anInt5422 = var13.readInt((byte)5) * 1245894587;
               this.anInt5420 = var13.readInt((byte)5) * 2095050879;
               if(null == this.anObject5415) {
                  this.anObject5415 = this.aClass361_5428.method4594(-1786227341 * this.anInt5422, -1719305239 * this.anInt5419, this.anInterface39_5433.method296(), this.anInterface39_5433.method297(), 244194649 * this.anInt5412, this.aFloat5418, (byte)17);
                  if(null == this.anObject5415) {
                     this.method5671(Class475.aClass475_5383, -307221011);
                     return false;
                  }
               }

               this.anIntArray5421 = new int[504352639 * this.anInt5420];
               this.anIntArray5416 = new int[this.anInt5420 * 504352639];
               this.anIntArray5434 = new int[this.anInt5420 * 504352639];
               int var14 = -260146184 * this.anInt5420 + 301018015 * var13.pos;

               int var15;
               for(var15 = 0; var15 < 504352639 * this.anInt5420; ++var15) {
                  this.anIntArray5421[var15] = var14;
                  this.anIntArray5416[var15] = var13.readInt((byte)5);
                  this.anIntArray5434[var15] = var13.readInt((byte)5);
                  var14 += this.anIntArray5416[var15];
               }

               this.anInt5424 = var13.pos * 459560653;
               this.aClass480Array5413 = new Class480[this.anInt5410 * 8736359];
               this.aFloatArray5404 = new float[2];

               for(var15 = 0; var15 < this.aFloatArray5404.length; ++var15) {
                  this.aFloatArray5404[var15] = 1.0F;
               }

               if(this.anObject5431 instanceof Class482) {
                  Interface70 var19 = ((Class482)this.anObject5431).method5820(-2024152902);
                  this.aBool5447 = var19.method472((byte)100);
                  this.aBool5448 = !this.aBool5447;
               }

               this.anInterface39_5433.method304(this.aBool5448, this.aBool5405?-382863695 * this.anInt5406:0, -1554733427 * this.anInt5435, -440894891 * this.anInt5417);
               if(null != this.anInterface57_5408) {
                  var15 = var13.buffer.length - 769922075 * this.anInt5424;
                  byte[] var16 = Class692.method8104(var15, true, -1098295923);
                  System.arraycopy(var13.buffer, this.anInt5424 * 769922075, var16, 0, var15);
                  var13.buffer = var16;
                  var13.pos = 801976415 * var15;
                  this.anInterface39_5433.method68(var13);
                  this.anInt5409 += -817882553;
               } else {
                  this.aBool5411 = true;
               }

               return true;
            } else {
               throw new RuntimeException("");
            }
         }
      }
   }

   void method5679(int var1) {
      synchronized(this) {
         this.method5688(-1316345930);
      }
   }

   public void method5680(int var1) {
      synchronized(this) {
         if(this.method5670(1720101813) != Class475.aClass475_5382 && this.method5670(2093537383).anInt5376 * 1403645875 >= 1403645875 * Class475.aClass475_5381.anInt5376) {
            this.method5671(Class475.aClass475_5382, -1017701825);
         }
      }
   }

   void method5681(short var1) {
      this.aBool5436 = true;
   }

   boolean method5682(byte var1) {
      if(this.aFloatArray5404 == null) {
         return false;
      } else {
         float var2 = 0.0F;
         float var3 = 0.0F;

         for(int var4 = 0; var4 < this.aFloatArray5404.length; ++var4) {
            float var5 = this.aFloatArray5404[var4];
            if(this.aFloat5402 * var5 > var2) {
               var2 = var5;
            }

            if(var5 > var3) {
               var3 = var5;
            }
         }

         if(var2 < 1.0E-5F) {
            if(var3 >= 1.0E-5F && this.aFloat5442 >= 1.0E-5F) {
               return true;
            } else {
               return false;
            }
         } else {
            return true;
         }
      }
   }

   void method5683(int var1) {
      synchronized(this) {
         if(this.anInterface39_5433.method293() == Class376.aClass376_3908) {
            if(null != this.anObject5415) {
               int var3 = this.aClass361_5428.method4597(this.anObject5415, -1296717601);
               if(var3 >= 244194649 * this.anInt5412) {
                  this.aClass361_5428.method4595(this.anObject5415, (byte)64);
                  this.anObject5415 = null;
                  this.method5671(Class475.aClass475_5377, -1104644798);
               }
            } else {
               this.method5671(Class475.aClass475_5377, -695562295);
            }
         }
      }

      this.method5709((byte)2);
   }

   public float method5684(int var1) {
      return this.aFloat5423;
   }

   void method5685(float var1, int var2) {
      synchronized(this) {
         this.aFloat5423 = var1;
      }
   }

   public boolean method5686(byte var1) {
      return this.aBool5450;
   }

   public void method5687(int var1) {
      synchronized(this) {
         this.method5690(50093564);
      }
   }

   void method5688(int var1) {
      if(this.method5670(-1533621413) != Class475.aClass475_5382) {
         if(this.method5670(2099540436).anInt5376 * 1403645875 < 1403645875 * Class475.aClass475_5379.anInt5376) {
            this.method5671(Class475.aClass475_5379, -466460325);
            this.aBool5425 = true;
            this.method5732(391430204);
            this.method5706(-87830426);
         }
      }
   }

   void method5689(int var1) {
      synchronized(this) {
         int var3 = this.method5702(1515996475);
         if(!this.aBool5447 || var3 <= this.anInt5446 * 1195739805 || !this.anInterface39_5433.method326()) {
            Class376 var4 = this.anInterface39_5433.method293();
            if(this.aBool5411 && var4 != Class376.aClass376_3909) {
               if(null != this.aByteArray5441) {
                  if(-1814834355 * this.anInt5445 >= this.anInt5420 * 504352639) {
                     this.anInterface39_5433.method68((RSByteBuffer)null);
                     this.anInt5445 = 0;
                  } else {
                     if(-1268618329 * this.anInt5449 < 769922075 * this.anInt5424) {
                        this.anInt5449 = this.anInt5424 * 865178221;
                     }

                     this.anInt5449 = 982486039 * (159703891 * this.anInt5439 + this.anIntArray5421[this.anInt5445 * -1814834355]);
                     int var5 = this.anIntArray5416[this.anInt5445 * -1814834355];
                     int var7 = this.anInt5439 * 159703891 + var5 > var5?var5 + this.anIntArray5421[this.anInt5445 * -1814834355]:this.anInt5449 * -1268618329 + var5;
                     this.anInt5439 += (-1268618329 * this.anInt5449 + var5 > this.aByteArray5441.length?this.aByteArray5441.length - this.anInt5449 * -1268618329:var5) * 494885083;
                     RSByteBuffer var8 = new RSByteBuffer(var7 - -1268618329 * this.anInt5449, true);
                     if(null == this.aByteArray5441) {
                        throw new RuntimeException("");
                     }

                     if(null == var8.buffer) {
                        throw new RuntimeException("");
                     }

                     var8.method9619(this.aByteArray5441, -1268618329 * this.anInt5449, var7 - -1268618329 * this.anInt5449, 2092844553);
                     this.anInterface39_5433.method68(var8);
                     this.method5696(false, -1153421344);
                     if(this.anInt5439 * 159703891 >= var5) {
                        this.anInt5445 += -1420714619;
                        this.anInt5439 = 0;
                     }
                  }
               } else if(this.anInterface57_5408 != null) {
                  if(-600215689 * this.anInt5409 >= 504352639 * this.anInt5420) {
                     this.anInt5409 = 0;
                     this.anInterface39_5433.method68((RSByteBuffer)null);
                  } else {
                     byte[] var11 = this.anInterface57_5408.method373(this.anIntArray5434[-600215689 * this.anInt5409], (byte)-127);
                     if(var11 != null) {
                        RSByteBuffer var6 = new RSByteBuffer(var11);
                        var6.pos = var11.length * 801976415;
                        this.anInterface39_5433.method68(var6);
                        this.method5696(false, -1292917584);
                        this.anInt5409 += -817882553;
                     }
                  }
               }
            }

         }
      }
   }

   void method5690(int var1) {
      if(this.method5670(-398922754).anInt5376 * 1403645875 >= Class475.aClass475_5379.anInt5376 * 1403645875) {
         if(this.method5670(128066661) == Class475.aClass475_5384) {
            this.method5683(409651835);
            return;
         }

         this.method5689(-1422130591);
         if(this.aFloat5402 != this.aFloat5442) {
            long var2 = Class255.time((byte)24);
            if(var2 > 1544171734777324671L * this.aLong5443) {
               this.aFloat5402 = this.aFloat5442;
            } else {
               float var4 = this.aFloat5442 - this.aFloat5440;
               long var5 = 1544171734777324671L * this.aLong5443 - this.aLong5429 * 9064612270242113211L;
               float var7 = var4 / (float)var5;
               this.aFloat5402 = (float)(var2 - this.aLong5429 * 9064612270242113211L) * var7 + this.aFloat5440;
               this.aFloat5402 = Math.max(0.0F, Math.min(1.0F, this.aFloat5402));
            }
         }

         this.method5706(-87830426);
         if(this.method5670(648856283).anInt5376 * 1403645875 < Class475.aClass475_5382.anInt5376 * 1403645875) {
            this.method5732(154183827);
         }
      }

   }

   void method5691() {
      synchronized(this) {
         if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
            Class482 var2 = (Class482)this.anObject5431;
            Interface70 var3 = var2.method5820(-2024152902);
            if(var3 != null) {
               var3.method453(true, 2057303859);
            }
         }

      }
   }

   void method5692(byte[] var1, int var2, int var3, byte var4) {
      int var5 = var2;
      int var6 = 0;

      for(int var7 = this.anInterface39_5433.method296().anInt4060 * 1260438277; var5 < var1.length && var5 < var3; var6 %= this.aFloatArray5404.length) {
         float var8 = this.aFloatArray5404[var6] * this.aFloat5403 * this.aFloat5402;
         if(16 == var7) {
            int var9 = (var1[1 + var5] << 8) + (var1[var5] & 255);
            var9 = (int)((float)var9 * var8 * var8);
            var1[var5++] = (byte)var9;
            var1[var5++] = (byte)(var9 >> 8);
         } else {
            if(8 != var7) {
               throw new RuntimeException("");
            }

            byte var10 = var1[var5];
            var10 = (byte)((int)((float)var10 * var8));
            var1[var5++] = var10;
         }

         ++var6;
      }

   }

   void method5693(byte var1) {
      this.aBool5436 = false;
   }

   public void method5694(byte var1) {
      if(this.method5670(-580275698).anInt5376 * 1403645875 >= 1403645875 * Class475.aClass475_5379.anInt5376 && this.method5670(-1385371029).anInt5376 * 1403645875 < Class475.aClass475_5382.anInt5376 * 1403645875 && this.method5682((byte)22)) {
         synchronized(this) {
            this.anInterface39_5433.method295();
            this.method5695((byte)-24);
         }

         Thread.yield();
      }

   }

   void method5695(byte var1) {
      if(this.aClass480Array5413 != null) {
         boolean var2 = true;
         Class376 var3 = this.anInterface39_5433.method293();
         int var4;
         int var5;
         if(this.anInterface39_5433.method326()) {
            int var7;
            int var8;
            if(this.aBool5447 && this.method5726(this.anInt5446 * 1195739805, 1976287100)) {
               if(null == this.aClass480Array5413[this.anInt5437 * -721183709]) {
                  RSByteBuffer var12 = this.method5719(this.anInt5446 * 1195739805, -1978438862);
                  if(var12 != null) {
                     this.aClass480Array5413[this.anInt5437 * -721183709] = new Class480(this, var12, false);
                     var5 = this.anInterface39_5433.method285();
                     int var13 = this.anInterface39_5433.method301(this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454.pos * 301018015 / var5);
                     this.anInt5430 += var13 * 1925888215;
                     if(!this.aBool5448 && this.aBool5405 && -192086001 * this.anInt5427 > 0) {
                        if(this.anInt5430 * 697416423 < this.anInt5435 * -1554733427) {
                           this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                        } else if(697416423 * this.anInt5430 >= this.anInt5435 * -1554733427 && this.anInt5430 * 697416423 - var13 < -1554733427 * this.anInt5435) {
                           this.aClass480Array5413[this.anInt5437 * -721183709].anInt5452 = this.anInterface39_5433.method39(var5 * (697416423 * this.anInt5430 - this.anInt5435 * -1554733427)) * 478557991;
                        }
                     }

                     this.anInt5446 += 1196247989;
                     if(!this.aBool5448 && this.aBool5405 && 697416423 * this.anInt5430 >= -440894891 * this.anInt5417 && (this.anInt5427 * -192086001 < this.anInt5406 * -382863695 || -382863695 * this.anInt5406 < 0)) {
                        var7 = this.anInt5430 * 697416423 - this.anInt5417 * -440894891;
                        var8 = var13 - var7;
                        this.aClass480Array5413[-721183709 * this.anInt5437].anInt5453 = this.anInterface39_5433.method39(var5 * var8) * -1459358351;
                        this.anInt5446 = 0;
                        this.anInt5430 = 0;
                        this.anInt5427 += -2117996817;
                     }

                     if(null != this.aClass480Array5413[-721183709 * this.anInt5437]) {
                        this.anInt5437 += 631763851;
                        this.anInt5437 = 631763851 * (-721183709 * this.anInt5437 % this.aClass480Array5413.length);
                     }
                  }
               }
            } else if(!this.method5703(-2003059911) || !this.aBool5447) {
               var4 = this.anInterface39_5433.method9();
               var5 = this.anInterface39_5433.method301(244194649 * this.anInt5412);
               if(!this.aBool5407 && null == this.aClass480Array5413[this.anInt5437 * -721183709]) {
                  if(var3 != Class376.aClass376_3910 && var4 > 0) {
                     RSByteBuffer var6 = this.method5669(var5, -2141965558);
                     this.aClass480Array5413[-721183709 * this.anInt5437] = var6 != null?new Class480(this, var6, false):null;
                     var7 = null != this.aClass480Array5413[this.anInt5437 * -721183709]?301018015 * this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454.pos:0;
                     var8 = this.anInterface39_5433.method285();
                     int var9 = this.anInterface39_5433.method301(var7 / var8);
                     this.anInt5444 += var9 * 1078651643;
                     if(-237858765 * this.anInt5444 > this.anInt5430 * 697416423) {
                        this.anInt5430 += 1925888215 * var9;
                        int var10000 = var4 - var9;
                        if(!this.aBool5448 && this.aBool5405 && this.anInt5427 * -192086001 > 0) {
                           if(697416423 * this.anInt5430 < -1554733427 * this.anInt5435) {
                              this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                           } else if(this.anInt5430 * 697416423 >= this.anInt5435 * -1554733427 && 697416423 * this.anInt5430 - var9 < this.anInt5435 * -1554733427) {
                              this.aClass480Array5413[-721183709 * this.anInt5437].anInt5452 = this.anInterface39_5433.method39(var8 * (697416423 * this.anInt5430 - -1554733427 * this.anInt5435)) * 478557991;
                           }
                        }

                        if(null != this.aClass480Array5413[this.anInt5437 * -721183709]) {
                           if(this.aBool5447 && !this.method5726(this.anInt5446 * 1195739805, 1772217143)) {
                              this.method5699(this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454, 65536);
                           }

                           if(this.aBool5448 || !this.aBool5405 || this.anInt5430 * 697416423 < this.anInt5417 * -440894891 || -192086001 * this.anInt5427 > this.anInt5406 * -382863695 && -382863695 * this.anInt5406 >= 0) {
                              this.anInt5446 += 1196247989;
                           } else {
                              int var10 = this.anInt5430 * 697416423 - -440894891 * this.anInt5417;
                              int var11 = var9 - var10;
                              this.aClass480Array5413[-721183709 * this.anInt5437].anInt5453 = this.anInterface39_5433.method39(var8 * var11) * -1459358351;
                              this.anInt5446 = 0;
                              this.anInt5427 += -2117996817;
                              this.anInt5430 = 0;
                           }

                           this.anInt5437 += 631763851;
                           this.anInt5437 = 631763851 * (-721183709 * this.anInt5437 % this.aClass480Array5413.length);
                        }
                     } else {
                        this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                     }
                  } else if(Class376.aClass376_3910 == var3 && this.aBool5405 && !this.aBool5448 && (this.anInt5427 * -192086001 < this.anInt5406 * -382863695 || this.anInt5406 * -382863695 < 0)) {
                     this.anInterface39_5433.method303(true);
                  }
               }
            }
         }

         var4 = 0;

         for(var5 = 0; var5 < this.aClass480Array5413.length; ++var5) {
            if(null != this.aClass480Array5413[var5]) {
               ++var4;
               var2 = false;
            }
         }

         if(!this.aBool5438 && this.method5684(-1120126182) >= 0.0F && (var4 >= 8736359 * this.anInt5410 || Class376.aClass376_3910 == var3 || Class376.aClass376_3909 == var3)) {
            this.aBool5438 = true;
            this.method5671(Class475.aClass475_5380, 49542314);
         }

         if(this.anInterface39_5433.method326() && var2 && (this.method5703(-2109927259) || this.aBool5407 || var3 == Class376.aClass376_3910) && (!this.aBool5405 || !this.aBool5448 && this.anInt5427 * -192086001 >= this.anInt5406 * -382863695 && this.anInt5406 * -382863695 >= 0)) {
            this.method5671(Class475.aClass475_5383, -199035311);
            this.aBool5425 = false;
            if(this.aBool5447) {
               this.method5704(1054956730);
            }
         }

      }
   }

   void method5696(boolean var1, int var2) {
      this.aBool5411 = var1;
   }

   public void method5697(int var1) {
      synchronized(this) {
         if(!this.aBool5436) {
            if(this.anObject5415 != null) {
               int var3 = this.aClass361_5428.method4597(this.anObject5415, -1296717601);
               if(var3 > 0) {
                  if(this.aClass480Array5413 != null && null != this.aClass480Array5413[-1957954909 * this.anInt5414] && this.aBool5438) {
                     int var4 = var3 + -1627305919 * this.anInt5432 > 301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos?301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos - this.anInt5432 * -1627305919:var3;
                     if(this.anInt5432 * -1627305919 < this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5452 * 1873397911 && this.anInt5432 * -1627305919 + var4 > this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5452 * 1873397911 && 1873397911 * this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5452 >= 0) {
                        this.anInt5432 += this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5452 * 1348442839 - 1 * this.anInt5432;
                        var4 = var3 + this.anInt5432 * -1627305919 > this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.pos * 301018015?301018015 * this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.pos - this.anInt5432 * -1627305919:var3;
                     }

                     if(var4 + this.anInt5432 * -1627305919 > this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5453 * 1594370961 && this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5453 * 1594370961 >= 0) {
                        var4 = this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 * 1594370961 - this.anInt5432 * -1627305919;
                     }

                     this.method5692(this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.buffer, this.anInt5432 * -1627305919, var4 + -1627305919 * this.anInt5432, (byte)88);
                     this.aClass361_5428.method4596(this.anObject5415, this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.buffer, this.anInt5432 * -1627305919, var4, (byte)-128);
                     this.anInt5432 += var4 * 1499383745;
                     int var10000 = var3 - var4;
                     if(-1627305919 * this.anInt5432 >= 301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos || this.anInt5432 * -1627305919 >= 1594370961 * this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 && this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 * 1594370961 >= 0) {
                        this.aClass480Array5413[-1957954909 * this.anInt5414].method5751(-627236050);
                        this.aClass480Array5413[-1957954909 * this.anInt5414] = null;
                        this.anInt5414 += -676755189;
                        this.anInt5414 = -676755189 * (-1957954909 * this.anInt5414 % this.aClass480Array5413.length);
                        this.anInt5432 = 0;
                     }
                  }

               }
            }
         }
      }
   }

   void method5698(boolean var1) {
      this.aBool5411 = var1;
   }

   void method5699(RSByteBuffer var1, int var2) {
      if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
         Class482 var3 = (Class482)this.anObject5431;
         Interface70 var4 = var3.method5820(-2024152902);
         byte[] var5 = new byte[var1.pos * 301018015];
         System.arraycopy(var1.buffer, 0, var5, 0, var1.pos * 301018015);
         RSByteBuffer var6 = new RSByteBuffer(var5);
         var6.pos = 1 * var1.pos;
         var4.method450(var6, -1650454155);
      }

   }

   public void method5700() {
      if(this.method5670(-294211031).anInt5376 * 1403645875 < Class475.aClass475_5381.anInt5376 * 1403645875) {
         throw new RuntimeException("");
      } else {
         this.anObject5431 = null;
         this.method5671(Class475.aClass475_5384, 756972575);
      }
   }

   void method5701() {
      if(this.aBool5425 && this.method5670(2098256840).anInt5376 * 1403645875 >= Class475.aClass475_5379.anInt5376 * 1403645875 && this.method5670(969606130).anInt5376 * 1403645875 < Class475.aClass475_5383.anInt5376 * 1403645875 && this.anInterface56_5400 != null && this.aFloat5402 == this.aFloat5442) {
         this.anInterface56_5400.method370(this.anObject5431, this.aFloatArray5404, (Object[])null, 1409270449);
      }

   }

   int method5702(int var1) {
      if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
         Class482 var2 = (Class482)this.anObject5431;
         Interface70 var3 = var2.method5820(-2024152902);
         return var3.method26(-2112075851);
      } else {
         return 0;
      }
   }

   boolean method5703(int var1) {
      synchronized(this) {
         if(this.anObject5431 != null && this.anObject5431 instanceof Class482) {
            Class482 var3 = (Class482)this.anObject5431;
            Interface70 var4 = var3.method5820(-2024152902);
            if(null != var4) {
               return var4.method454((byte)10);
            }
         }

         return false;
      }
   }

   void method5704(int var1) {
      synchronized(this) {
         if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
            Class482 var3 = (Class482)this.anObject5431;
            Interface70 var4 = var3.method5820(-2024152902);
            if(var4 != null) {
               var4.method453(true, 2057303859);
            }
         }

      }
   }

   Object method5705(int var1) {
      return this.anObject5431;
   }

   void method5706(int var1) {
      Class378 var2 = this.aClass361_5428.method4617((byte)106).method4581(this.anInt5401 * 183759917, (byte)-90);
      this.aFloat5403 = var2 != null?var2.method4680(1259891802):1.0F;
      float var3 = null != var2?var2.method4679(2142909504):0.1F;
      var3 *= this.aFloat5402;
      float var4 = this.aFloatArray5404.length > 0?0.0F:1.0F;

      for(int var5 = 0; var5 < this.aFloatArray5404.length; ++var5) {
         if(this.aFloatArray5404[var5] > var4) {
            var4 = this.aFloatArray5404[var5];
         }
      }

      var3 *= var4;
      if(!this.method5682((byte)104)) {
         var3 = -1.0F;
      }

      if(this.method5684(-1120126182) != var3) {
         this.method5685(var3, -1952477997);
         this.aBool5450 = true;
      }

   }

   void method5707() {
      if(this.method5670(-419491472).anInt5376 * 1403645875 >= Class475.aClass475_5379.anInt5376 * 1403645875) {
         if(this.method5670(1003081491) == Class475.aClass475_5384) {
            this.method5683(-1948154002);
            return;
         }

         this.method5689(-1099111576);
         if(this.aFloat5402 != this.aFloat5442) {
            long var1 = Class255.time((byte)24);
            if(var1 > 1544171734777324671L * this.aLong5443) {
               this.aFloat5402 = this.aFloat5442;
            } else {
               float var3 = this.aFloat5442 - this.aFloat5440;
               long var4 = 1544171734777324671L * this.aLong5443 - this.aLong5429 * 9064612270242113211L;
               float var6 = var3 / (float)var4;
               this.aFloat5402 = (float)(var1 - this.aLong5429 * 9064612270242113211L) * var6 + this.aFloat5440;
               this.aFloat5402 = Math.max(0.0F, Math.min(1.0F, this.aFloat5402));
            }
         }

         this.method5706(-87830426);
         if(this.method5670(159817489).anInt5376 * 1403645875 < Class475.aClass475_5382.anInt5376 * 1403645875) {
            this.method5732(-36654045);
         }
      }

   }

   void method5708(Interface56 var1, int var2) {
      this.anInterface56_5400 = var1;
      if(this.anInterface56_5400 != null) {
         this.anInterface56_5400.method370(this.anObject5431, this.aFloatArray5404, (Object[])null, 1522237314);
      }

   }

   void method5709(byte var1) {
      synchronized(this) {
         this.aByteArray5441 = null;
         this.anInt5401 = 0;
         this.aFloat5402 = 0.0F;
         this.aFloat5403 = 0.0F;
         this.aBool5405 = false;
         this.anInt5406 = 0;
         this.aFloat5418 = 1.0F;
         this.anInterface57_5408 = null;
         this.anInt5409 = 0;
         this.anInt5449 = 0;
         if(this.aClass480Array5413 != null) {
            for(int var3 = 0; var3 < this.aClass480Array5413.length; ++var3) {
               if(this.aClass480Array5413[var3] != null) {
                  this.aClass480Array5413[var3].method5751(-1878685084);
               }
            }
         }

         this.aClass480Array5413 = null;
         this.aBool5447 = false;
         this.anInt5414 = 0;
         this.anInt5435 = 0;
         this.anInt5417 = 0;
         this.anInt5422 = 0;
         this.anInt5419 = 0;
         this.anInt5420 = 0;
         this.anIntArray5421 = null;
         this.anIntArray5416 = null;
         this.anIntArray5434 = null;
         this.anInt5424 = 0;
         this.aBool5425 = false;
         this.anInterface39_5433.method298();
         this.aBool5411 = false;
         this.anInterface56_5400 = null;
         this.anObject5431 = null;
         this.anInt5432 = 0;
         this.anInt5430 = 0;
         this.anInt5444 = 0;
         this.aBool5407 = false;
         this.anInt5445 = 0;
         this.anInt5437 = 0;
         this.aBool5438 = false;
         this.anInt5439 = 0;
         this.method5685(-1.0F, -1952477997);
         this.aBool5450 = false;
         this.aFloat5442 = 0.0F;
         this.aLong5443 = 0L;
         this.aLong5429 = 0L;
         this.aFloat5440 = 0.0F;
         this.anInt5446 = 0;
         this.anInt5427 = 0;
      }
   }

   boolean method5710() {
      return this.aClass475_5426 == Class475.aClass475_5382;
   }

   boolean method5711() {
      return this.aClass475_5426 == Class475.aClass475_5383;
   }

   void method5712(boolean var1) {
      this.aBool5411 = var1;
   }

   public void method5713() {
      if(this.method5670(1653228207).anInt5376 * 1403645875 < Class475.aClass475_5381.anInt5376 * 1403645875) {
         throw new RuntimeException("");
      } else {
         this.anObject5431 = null;
         this.method5671(Class475.aClass475_5384, -1000023704);
      }
   }

   public void method5714() {
      synchronized(this) {
         if(this.method5670(186056086) != Class475.aClass475_5382 && this.method5670(2088278270).anInt5376 * 1403645875 >= 1403645875 * Class475.aClass475_5381.anInt5376) {
            this.method5671(Class475.aClass475_5382, 419704826);
         }
      }
   }

   float method5715() {
      return this.aFloat5402;
   }

   void method5716() {
      this.aBool5436 = false;
   }

   float method5717() {
      return this.aFloat5402;
   }

   void method5718() {
      synchronized(this) {
         this.method5688(-1941604916);
      }
   }

   RSByteBuffer method5719(int var1, int var2) {
      if(this.anObject5431 != null && this.anObject5431 instanceof Class482) {
         Class482 var3 = (Class482)this.anObject5431;
         Interface70 var4 = var3.method5820(-2024152902);
         RSByteBuffer var5 = var4.method451(var1, (byte)-65);
         RSByteBuffer var6 = new RSByteBuffer(301018015 * var5.pos, true);
         var6.method9697(var5, -726528018);
         return var6;
      } else {
         return null;
      }
   }

   public void method5720() {
      synchronized(this) {
         if(this.method5670(-93010726) != Class475.aClass475_5382 && this.method5670(-689376173).anInt5376 * 1403645875 >= 1403645875 * Class475.aClass475_5381.anInt5376) {
            this.method5671(Class475.aClass475_5382, 2076459105);
         }
      }
   }

   void method5721() {
      if(this.method5670(-803733917) != Class475.aClass475_5382) {
         if(this.method5670(-1260542966).anInt5376 * 1403645875 < 1403645875 * Class475.aClass475_5379.anInt5376) {
            this.method5671(Class475.aClass475_5379, -1414387760);
            this.aBool5425 = true;
            this.method5732(626751357);
            this.method5706(-87830426);
         }
      }
   }

   int method5722() {
      if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
         Class482 var1 = (Class482)this.anObject5431;
         Interface70 var2 = var1.method5820(-2024152902);
         return var2.method26(702602190);
      } else {
         return 0;
      }
   }

   void method5723() {
      if(this.method5670(1864350556).anInt5376 * 1403645875 >= Class475.aClass475_5379.anInt5376 * 1403645875) {
         if(this.method5670(-349438569) == Class475.aClass475_5384) {
            this.method5683(879555829);
            return;
         }

         this.method5689(-179352619);
         if(this.aFloat5402 != this.aFloat5442) {
            long var1 = Class255.time((byte)24);
            if(var1 > 1544171734777324671L * this.aLong5443) {
               this.aFloat5402 = this.aFloat5442;
            } else {
               float var3 = this.aFloat5442 - this.aFloat5440;
               long var4 = 1544171734777324671L * this.aLong5443 - this.aLong5429 * 9064612270242113211L;
               float var6 = var3 / (float)var4;
               this.aFloat5402 = (float)(var1 - this.aLong5429 * 9064612270242113211L) * var6 + this.aFloat5440;
               this.aFloat5402 = Math.max(0.0F, Math.min(1.0F, this.aFloat5402));
            }
         }

         this.method5706(-87830426);
         if(this.method5670(1532248248).anInt5376 * 1403645875 < Class475.aClass475_5382.anInt5376 * 1403645875) {
            this.method5732(845626205);
         }
      }

   }

   public void method5724(int var1) {
      if(this.method5670(630548646).anInt5376 * 1403645875 < Class475.aClass475_5381.anInt5376 * 1403645875) {
         throw new RuntimeException("");
      } else {
         this.anObject5431 = null;
         this.method5671(Class475.aClass475_5384, -1179399855);
      }
   }

   void method5725() {
      synchronized(this) {
         this.aByteArray5441 = null;
         this.anInt5401 = 0;
         this.aFloat5402 = 0.0F;
         this.aFloat5403 = 0.0F;
         this.aBool5405 = false;
         this.anInt5406 = 0;
         this.aFloat5418 = 1.0F;
         this.anInterface57_5408 = null;
         this.anInt5409 = 0;
         this.anInt5449 = 0;
         if(this.aClass480Array5413 != null) {
            for(int var2 = 0; var2 < this.aClass480Array5413.length; ++var2) {
               if(this.aClass480Array5413[var2] != null) {
                  this.aClass480Array5413[var2].method5751(-964395151);
               }
            }
         }

         this.aClass480Array5413 = null;
         this.aBool5447 = false;
         this.anInt5414 = 0;
         this.anInt5435 = 0;
         this.anInt5417 = 0;
         this.anInt5422 = 0;
         this.anInt5419 = 0;
         this.anInt5420 = 0;
         this.anIntArray5421 = null;
         this.anIntArray5416 = null;
         this.anIntArray5434 = null;
         this.anInt5424 = 0;
         this.aBool5425 = false;
         this.anInterface39_5433.method298();
         this.aBool5411 = false;
         this.anInterface56_5400 = null;
         this.anObject5431 = null;
         this.anInt5432 = 0;
         this.anInt5430 = 0;
         this.anInt5444 = 0;
         this.aBool5407 = false;
         this.anInt5445 = 0;
         this.anInt5437 = 0;
         this.aBool5438 = false;
         this.anInt5439 = 0;
         this.method5685(-1.0F, -1952477997);
         this.aBool5450 = false;
         this.aFloat5442 = 0.0F;
         this.aLong5443 = 0L;
         this.aLong5429 = 0L;
         this.aFloat5440 = 0.0F;
         this.anInt5446 = 0;
         this.anInt5427 = 0;
      }
   }

   boolean method5726(int var1, int var2) {
      if(this.anObject5431 != null && this.anObject5431 instanceof Class482) {
         Class482 var3 = (Class482)this.anObject5431;
         Interface70 var4 = var3.method5820(-2024152902);
         return var4.method482(var1, -1513092680);
      } else {
         return false;
      }
   }

   public Class479(Class474 var1, int var2, int var3, Interface39 var4, Class361 var5) {
      this.aClass361_5428 = var5;
      this.method5671(Class475.aClass475_5377, -1021888467);
      this.anInt5412 = 1682332393 * var2;
      this.anInt5410 = -1847857833 * var3;
      this.anInterface39_5433 = var4;
      this.anInt5414 = 0;
      this.aBool5411 = false;
      this.anInterface39_5433.method328(new Class493(this));
      this.method5709((byte)2);
   }

   void method5727() {
      if(this.aBool5425 && this.method5670(1882051270).anInt5376 * 1403645875 >= Class475.aClass475_5379.anInt5376 * 1403645875 && this.method5670(1450594850).anInt5376 * 1403645875 < Class475.aClass475_5383.anInt5376 * 1403645875 && this.anInterface56_5400 != null && this.aFloat5402 == this.aFloat5442) {
         this.anInterface56_5400.method370(this.anObject5431, this.aFloatArray5404, (Object[])null, 118070009);
      }

   }

   public void method5728() {
      synchronized(this) {
         this.method5690(1771086983);
      }
   }

   public void method5729() {
      if(this.method5670(2138773031).anInt5376 * 1403645875 >= 1403645875 * Class475.aClass475_5379.anInt5376 && this.method5670(-1219444532).anInt5376 * 1403645875 < Class475.aClass475_5382.anInt5376 * 1403645875 && this.method5682((byte)43)) {
         synchronized(this) {
            this.anInterface39_5433.method295();
            this.method5695((byte)-60);
         }

         Thread.yield();
      }

   }

   public void method5730() {
      if(this.method5670(639124413).anInt5376 * 1403645875 >= 1403645875 * Class475.aClass475_5379.anInt5376 && this.method5670(-1092997761).anInt5376 * 1403645875 < Class475.aClass475_5382.anInt5376 * 1403645875 && this.method5682((byte)126)) {
         synchronized(this) {
            this.anInterface39_5433.method295();
            this.method5695((byte)9);
         }

         Thread.yield();
      }

   }

   public void method5731() {
      if(this.method5670(-1314069491).anInt5376 * 1403645875 >= 1403645875 * Class475.aClass475_5379.anInt5376 && this.method5670(-1067660279).anInt5376 * 1403645875 < Class475.aClass475_5382.anInt5376 * 1403645875 && this.method5682((byte)15)) {
         synchronized(this) {
            this.anInterface39_5433.method295();
            this.method5695((byte)-114);
         }

         Thread.yield();
      }

   }

   void method5732(int var1) {
      if(this.aBool5425 && this.method5670(-2035213481).anInt5376 * 1403645875 >= Class475.aClass475_5379.anInt5376 * 1403645875 && this.method5670(1273271891).anInt5376 * 1403645875 < Class475.aClass475_5383.anInt5376 * 1403645875 && this.anInterface56_5400 != null && this.aFloat5402 == this.aFloat5442) {
         this.anInterface56_5400.method370(this.anObject5431, this.aFloatArray5404, (Object[])null, 2686038);
      }

   }

   void method5733() {
      if(this.aClass480Array5413 != null) {
         boolean var1 = true;
         Class376 var2 = this.anInterface39_5433.method293();
         int var3;
         int var4;
         if(this.anInterface39_5433.method326()) {
            int var6;
            int var7;
            if(this.aBool5447 && this.method5726(this.anInt5446 * 1195739805, 1360912110)) {
               if(null == this.aClass480Array5413[this.anInt5437 * -721183709]) {
                  RSByteBuffer var11 = this.method5719(this.anInt5446 * 1195739805, -1496005087);
                  if(var11 != null) {
                     this.aClass480Array5413[this.anInt5437 * -721183709] = new Class480(this, var11, false);
                     var4 = this.anInterface39_5433.method285();
                     int var12 = this.anInterface39_5433.method301(this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454.pos * 301018015 / var4);
                     this.anInt5430 += var12 * 1925888215;
                     if(!this.aBool5448 && this.aBool5405 && -192086001 * this.anInt5427 > 0) {
                        if(this.anInt5430 * 697416423 < this.anInt5435 * -1554733427) {
                           this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                        } else if(697416423 * this.anInt5430 >= this.anInt5435 * -1554733427 && this.anInt5430 * 697416423 - var12 < -1554733427 * this.anInt5435) {
                           this.aClass480Array5413[this.anInt5437 * -721183709].anInt5452 = this.anInterface39_5433.method39(var4 * (697416423 * this.anInt5430 - this.anInt5435 * -1554733427)) * 478557991;
                        }
                     }

                     this.anInt5446 += 1196247989;
                     if(!this.aBool5448 && this.aBool5405 && 697416423 * this.anInt5430 >= -440894891 * this.anInt5417 && (this.anInt5427 * -192086001 < this.anInt5406 * -382863695 || -382863695 * this.anInt5406 < 0)) {
                        var6 = this.anInt5430 * 697416423 - this.anInt5417 * -440894891;
                        var7 = var12 - var6;
                        this.aClass480Array5413[-721183709 * this.anInt5437].anInt5453 = this.anInterface39_5433.method39(var4 * var7) * -1459358351;
                        this.anInt5446 = 0;
                        this.anInt5430 = 0;
                        this.anInt5427 += -2117996817;
                     }

                     if(null != this.aClass480Array5413[-721183709 * this.anInt5437]) {
                        this.anInt5437 += 631763851;
                        this.anInt5437 = 631763851 * (-721183709 * this.anInt5437 % this.aClass480Array5413.length);
                     }
                  }
               }
            } else if(!this.method5703(-945597208) || !this.aBool5447) {
               var3 = this.anInterface39_5433.method9();
               var4 = this.anInterface39_5433.method301(244194649 * this.anInt5412);
               if(!this.aBool5407 && null == this.aClass480Array5413[this.anInt5437 * -721183709]) {
                  if(var2 != Class376.aClass376_3910 && var3 > 0) {
                     RSByteBuffer var5 = this.method5669(var4, -2137865002);
                     this.aClass480Array5413[-721183709 * this.anInt5437] = var5 != null?new Class480(this, var5, false):null;
                     var6 = null != this.aClass480Array5413[this.anInt5437 * -721183709]?301018015 * this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454.pos:0;
                     var7 = this.anInterface39_5433.method285();
                     int var8 = this.anInterface39_5433.method301(var6 / var7);
                     this.anInt5444 += var8 * 1078651643;
                     if(-237858765 * this.anInt5444 > this.anInt5430 * 697416423) {
                        this.anInt5430 += 1925888215 * var8;
                        int var10000 = var3 - var8;
                        if(!this.aBool5448 && this.aBool5405 && this.anInt5427 * -192086001 > 0) {
                           if(697416423 * this.anInt5430 < -1554733427 * this.anInt5435) {
                              this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                           } else if(this.anInt5430 * 697416423 >= this.anInt5435 * -1554733427 && 697416423 * this.anInt5430 - var8 < this.anInt5435 * -1554733427) {
                              this.aClass480Array5413[-721183709 * this.anInt5437].anInt5452 = this.anInterface39_5433.method39(var7 * (697416423 * this.anInt5430 - -1554733427 * this.anInt5435)) * 478557991;
                           }
                        }

                        if(null != this.aClass480Array5413[this.anInt5437 * -721183709]) {
                           if(this.aBool5447 && !this.method5726(this.anInt5446 * 1195739805, 1380515207)) {
                              this.method5699(this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454, 65536);
                           }

                           if(this.aBool5448 || !this.aBool5405 || this.anInt5430 * 697416423 < this.anInt5417 * -440894891 || -192086001 * this.anInt5427 > this.anInt5406 * -382863695 && -382863695 * this.anInt5406 >= 0) {
                              this.anInt5446 += 1196247989;
                           } else {
                              int var9 = this.anInt5430 * 697416423 - -440894891 * this.anInt5417;
                              int var10 = var8 - var9;
                              this.aClass480Array5413[-721183709 * this.anInt5437].anInt5453 = this.anInterface39_5433.method39(var7 * var10) * -1459358351;
                              this.anInt5446 = 0;
                              this.anInt5427 += -2117996817;
                              this.anInt5430 = 0;
                           }

                           this.anInt5437 += 631763851;
                           this.anInt5437 = 631763851 * (-721183709 * this.anInt5437 % this.aClass480Array5413.length);
                        }
                     } else {
                        this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                     }
                  } else if(Class376.aClass376_3910 == var2 && this.aBool5405 && !this.aBool5448 && (this.anInt5427 * -192086001 < this.anInt5406 * -382863695 || this.anInt5406 * -382863695 < 0)) {
                     this.anInterface39_5433.method303(true);
                  }
               }
            }
         }

         var3 = 0;

         for(var4 = 0; var4 < this.aClass480Array5413.length; ++var4) {
            if(null != this.aClass480Array5413[var4]) {
               ++var3;
               var1 = false;
            }
         }

         if(!this.aBool5438 && this.method5684(-1120126182) >= 0.0F && (var3 >= 8736359 * this.anInt5410 || Class376.aClass376_3910 == var2 || Class376.aClass376_3909 == var2)) {
            this.aBool5438 = true;
            this.method5671(Class475.aClass475_5380, -745374111);
         }

         if(this.anInterface39_5433.method326() && var1 && (this.method5703(-1878876410) || this.aBool5407 || var2 == Class376.aClass376_3910) && (!this.aBool5405 || !this.aBool5448 && this.anInt5427 * -192086001 >= this.anInt5406 * -382863695 && this.anInt5406 * -382863695 >= 0)) {
            this.method5671(Class475.aClass475_5383, 2050825197);
            this.aBool5425 = false;
            if(this.aBool5447) {
               this.method5704(1243307394);
            }
         }

      }
   }

   boolean method5734() {
      synchronized(this) {
         if(this.anObject5431 != null && this.anObject5431 instanceof Class482) {
            Class482 var2 = (Class482)this.anObject5431;
            Interface70 var3 = var2.method5820(-2024152902);
            if(null != var3) {
               return var3.method454((byte)-120);
            }
         }

         return false;
      }
   }

   public void method5735() {
      synchronized(this) {
         if(!this.aBool5436) {
            if(this.anObject5415 != null) {
               int var2 = this.aClass361_5428.method4597(this.anObject5415, -1296717601);
               if(var2 > 0) {
                  if(this.aClass480Array5413 != null && null != this.aClass480Array5413[-1957954909 * this.anInt5414] && this.aBool5438) {
                     int var3 = var2 + -1627305919 * this.anInt5432 > 301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos?301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos - this.anInt5432 * -1627305919:var2;
                     if(this.anInt5432 * -1627305919 < this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5452 * 1873397911 && this.anInt5432 * -1627305919 + var3 > this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5452 * 1873397911 && 1873397911 * this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5452 >= 0) {
                        this.anInt5432 += this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5452 * 1348442839 - 1 * this.anInt5432;
                        var3 = var2 + this.anInt5432 * -1627305919 > this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.pos * 301018015?301018015 * this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.pos - this.anInt5432 * -1627305919:var2;
                     }

                     if(var3 + this.anInt5432 * -1627305919 > this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5453 * 1594370961 && this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5453 * 1594370961 >= 0) {
                        var3 = this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 * 1594370961 - this.anInt5432 * -1627305919;
                     }

                     this.method5692(this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.buffer, this.anInt5432 * -1627305919, var3 + -1627305919 * this.anInt5432, (byte)-99);
                     this.aClass361_5428.method4596(this.anObject5415, this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.buffer, this.anInt5432 * -1627305919, var3, (byte)-69);
                     this.anInt5432 += var3 * 1499383745;
                     int var10000 = var2 - var3;
                     if(-1627305919 * this.anInt5432 >= 301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos || this.anInt5432 * -1627305919 >= 1594370961 * this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 && this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 * 1594370961 >= 0) {
                        this.aClass480Array5413[-1957954909 * this.anInt5414].method5751(-2031515521);
                        this.aClass480Array5413[-1957954909 * this.anInt5414] = null;
                        this.anInt5414 += -676755189;
                        this.anInt5414 = -676755189 * (-1957954909 * this.anInt5414 % this.aClass480Array5413.length);
                        this.anInt5432 = 0;
                     }
                  }

               }
            }
         }
      }
   }

   public void method5736() {
      synchronized(this) {
         if(!this.aBool5436) {
            if(this.anObject5415 != null) {
               int var2 = this.aClass361_5428.method4597(this.anObject5415, -1296717601);
               if(var2 > 0) {
                  if(this.aClass480Array5413 != null && null != this.aClass480Array5413[-1957954909 * this.anInt5414] && this.aBool5438) {
                     int var3 = var2 + -1627305919 * this.anInt5432 > 301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos?301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos - this.anInt5432 * -1627305919:var2;
                     if(this.anInt5432 * -1627305919 < this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5452 * 1873397911 && this.anInt5432 * -1627305919 + var3 > this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5452 * 1873397911 && 1873397911 * this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5452 >= 0) {
                        this.anInt5432 += this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5452 * 1348442839 - 1 * this.anInt5432;
                        var3 = var2 + this.anInt5432 * -1627305919 > this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.pos * 301018015?301018015 * this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.pos - this.anInt5432 * -1627305919:var2;
                     }

                     if(var3 + this.anInt5432 * -1627305919 > this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5453 * 1594370961 && this.aClass480Array5413[-1957954909 * this.anInt5414].anInt5453 * 1594370961 >= 0) {
                        var3 = this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 * 1594370961 - this.anInt5432 * -1627305919;
                     }

                     this.method5692(this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.buffer, this.anInt5432 * -1627305919, var3 + -1627305919 * this.anInt5432, (byte)-44);
                     this.aClass361_5428.method4596(this.anObject5415, this.aClass480Array5413[-1957954909 * this.anInt5414].aClass526_Sub36_5454.buffer, this.anInt5432 * -1627305919, var3, (byte)-109);
                     this.anInt5432 += var3 * 1499383745;
                     int var10000 = var2 - var3;
                     if(-1627305919 * this.anInt5432 >= 301018015 * this.aClass480Array5413[this.anInt5414 * -1957954909].aClass526_Sub36_5454.pos || this.anInt5432 * -1627305919 >= 1594370961 * this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 && this.aClass480Array5413[this.anInt5414 * -1957954909].anInt5453 * 1594370961 >= 0) {
                        this.aClass480Array5413[-1957954909 * this.anInt5414].method5751(1238059948);
                        this.aClass480Array5413[-1957954909 * this.anInt5414] = null;
                        this.anInt5414 += -676755189;
                        this.anInt5414 = -676755189 * (-1957954909 * this.anInt5414 % this.aClass480Array5413.length);
                        this.anInt5432 = 0;
                     }
                  }

               }
            }
         }
      }
   }

   int method5737() {
      if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
         Class482 var1 = (Class482)this.anObject5431;
         Interface70 var2 = var1.method5820(-2024152902);
         return var2.method26(2003201663);
      } else {
         return 0;
      }
   }

   void method5738() {
      if(this.aBool5425 && this.method5670(-1754895164).anInt5376 * 1403645875 >= Class475.aClass475_5379.anInt5376 * 1403645875 && this.method5670(-816900841).anInt5376 * 1403645875 < Class475.aClass475_5383.anInt5376 * 1403645875 && this.anInterface56_5400 != null && this.aFloat5402 == this.aFloat5442) {
         this.anInterface56_5400.method370(this.anObject5431, this.aFloatArray5404, (Object[])null, 69630077);
      }

   }

   int method5739() {
      if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
         Class482 var1 = (Class482)this.anObject5431;
         Interface70 var2 = var1.method5820(-2024152902);
         return var2.method26(-210553062);
      } else {
         return 0;
      }
   }

   void method5740() {
      synchronized(this) {
         if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
            Class482 var2 = (Class482)this.anObject5431;
            Interface70 var3 = var2.method5820(-2024152902);
            if(var3 != null) {
               var3.method453(true, 2057303859);
            }
         }

      }
   }

   void method5741() {
      synchronized(this) {
         if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
            Class482 var2 = (Class482)this.anObject5431;
            Interface70 var3 = var2.method5820(-2024152902);
            if(var3 != null) {
               var3.method453(true, 2057303859);
            }
         }

      }
   }

   void method5742() {
      if(this.aClass480Array5413 != null) {
         boolean var1 = true;
         Class376 var2 = this.anInterface39_5433.method293();
         int var3;
         int var4;
         if(this.anInterface39_5433.method326()) {
            int var6;
            int var7;
            if(this.aBool5447 && this.method5726(this.anInt5446 * 1195739805, 1435057620)) {
               if(null == this.aClass480Array5413[this.anInt5437 * -721183709]) {
                  RSByteBuffer var11 = this.method5719(this.anInt5446 * 1195739805, -1536263962);
                  if(var11 != null) {
                     this.aClass480Array5413[this.anInt5437 * -721183709] = new Class480(this, var11, false);
                     var4 = this.anInterface39_5433.method285();
                     int var12 = this.anInterface39_5433.method301(this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454.pos * 301018015 / var4);
                     this.anInt5430 += var12 * 1925888215;
                     if(!this.aBool5448 && this.aBool5405 && -192086001 * this.anInt5427 > 0) {
                        if(this.anInt5430 * 697416423 < this.anInt5435 * -1554733427) {
                           this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                        } else if(697416423 * this.anInt5430 >= this.anInt5435 * -1554733427 && this.anInt5430 * 697416423 - var12 < -1554733427 * this.anInt5435) {
                           this.aClass480Array5413[this.anInt5437 * -721183709].anInt5452 = this.anInterface39_5433.method39(var4 * (697416423 * this.anInt5430 - this.anInt5435 * -1554733427)) * 478557991;
                        }
                     }

                     this.anInt5446 += 1196247989;
                     if(!this.aBool5448 && this.aBool5405 && 697416423 * this.anInt5430 >= -440894891 * this.anInt5417 && (this.anInt5427 * -192086001 < this.anInt5406 * -382863695 || -382863695 * this.anInt5406 < 0)) {
                        var6 = this.anInt5430 * 697416423 - this.anInt5417 * -440894891;
                        var7 = var12 - var6;
                        this.aClass480Array5413[-721183709 * this.anInt5437].anInt5453 = this.anInterface39_5433.method39(var4 * var7) * -1459358351;
                        this.anInt5446 = 0;
                        this.anInt5430 = 0;
                        this.anInt5427 += -2117996817;
                     }

                     if(null != this.aClass480Array5413[-721183709 * this.anInt5437]) {
                        this.anInt5437 += 631763851;
                        this.anInt5437 = 631763851 * (-721183709 * this.anInt5437 % this.aClass480Array5413.length);
                     }
                  }
               }
            } else if(!this.method5703(-2010043627) || !this.aBool5447) {
               var3 = this.anInterface39_5433.method9();
               var4 = this.anInterface39_5433.method301(244194649 * this.anInt5412);
               if(!this.aBool5407 && null == this.aClass480Array5413[this.anInt5437 * -721183709]) {
                  if(var2 != Class376.aClass376_3910 && var3 > 0) {
                     RSByteBuffer var5 = this.method5669(var4, -2143212480);
                     this.aClass480Array5413[-721183709 * this.anInt5437] = var5 != null?new Class480(this, var5, false):null;
                     var6 = null != this.aClass480Array5413[this.anInt5437 * -721183709]?301018015 * this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454.pos:0;
                     var7 = this.anInterface39_5433.method285();
                     int var8 = this.anInterface39_5433.method301(var6 / var7);
                     this.anInt5444 += var8 * 1078651643;
                     if(-237858765 * this.anInt5444 > this.anInt5430 * 697416423) {
                        this.anInt5430 += 1925888215 * var8;
                        int var10000 = var3 - var8;
                        if(!this.aBool5448 && this.aBool5405 && this.anInt5427 * -192086001 > 0) {
                           if(697416423 * this.anInt5430 < -1554733427 * this.anInt5435) {
                              this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                           } else if(this.anInt5430 * 697416423 >= this.anInt5435 * -1554733427 && 697416423 * this.anInt5430 - var8 < this.anInt5435 * -1554733427) {
                              this.aClass480Array5413[-721183709 * this.anInt5437].anInt5452 = this.anInterface39_5433.method39(var7 * (697416423 * this.anInt5430 - -1554733427 * this.anInt5435)) * 478557991;
                           }
                        }

                        if(null != this.aClass480Array5413[this.anInt5437 * -721183709]) {
                           if(this.aBool5447 && !this.method5726(this.anInt5446 * 1195739805, 1985471008)) {
                              this.method5699(this.aClass480Array5413[-721183709 * this.anInt5437].aClass526_Sub36_5454, 65536);
                           }

                           if(this.aBool5448 || !this.aBool5405 || this.anInt5430 * 697416423 < this.anInt5417 * -440894891 || -192086001 * this.anInt5427 > this.anInt5406 * -382863695 && -382863695 * this.anInt5406 >= 0) {
                              this.anInt5446 += 1196247989;
                           } else {
                              int var9 = this.anInt5430 * 697416423 - -440894891 * this.anInt5417;
                              int var10 = var8 - var9;
                              this.aClass480Array5413[-721183709 * this.anInt5437].anInt5453 = this.anInterface39_5433.method39(var7 * var10) * -1459358351;
                              this.anInt5446 = 0;
                              this.anInt5427 += -2117996817;
                              this.anInt5430 = 0;
                           }

                           this.anInt5437 += 631763851;
                           this.anInt5437 = 631763851 * (-721183709 * this.anInt5437 % this.aClass480Array5413.length);
                        }
                     } else {
                        this.aClass480Array5413[this.anInt5437 * -721183709] = null;
                     }
                  } else if(Class376.aClass376_3910 == var2 && this.aBool5405 && !this.aBool5448 && (this.anInt5427 * -192086001 < this.anInt5406 * -382863695 || this.anInt5406 * -382863695 < 0)) {
                     this.anInterface39_5433.method303(true);
                  }
               }
            }
         }

         var3 = 0;

         for(var4 = 0; var4 < this.aClass480Array5413.length; ++var4) {
            if(null != this.aClass480Array5413[var4]) {
               ++var3;
               var1 = false;
            }
         }

         if(!this.aBool5438 && this.method5684(-1120126182) >= 0.0F && (var3 >= 8736359 * this.anInt5410 || Class376.aClass376_3910 == var2 || Class376.aClass376_3909 == var2)) {
            this.aBool5438 = true;
            this.method5671(Class475.aClass475_5380, -1493041894);
         }

         if(this.anInterface39_5433.method326() && var1 && (this.method5703(-692002746) || this.aBool5407 || var2 == Class376.aClass376_3910) && (!this.aBool5405 || !this.aBool5448 && this.anInt5427 * -192086001 >= this.anInt5406 * -382863695 && this.anInt5406 * -382863695 >= 0)) {
            this.method5671(Class475.aClass475_5383, -1579514535);
            this.aBool5425 = false;
            if(this.aBool5447) {
               this.method5704(1461548325);
            }
         }

      }
   }

   void method5743() {
      synchronized(this) {
         if(null != this.anObject5431 && this.anObject5431 instanceof Class482) {
            Class482 var2 = (Class482)this.anObject5431;
            Interface70 var3 = var2.method5820(-2024152902);
            if(var3 != null) {
               var3.method453(true, 2057303859);
            }
         }

      }
   }

   void method5744() {
      Class378 var1 = this.aClass361_5428.method4617((byte)91).method4581(this.anInt5401 * 183759917, (byte)58);
      this.aFloat5403 = var1 != null?var1.method4680(-254919589):1.0F;
      float var2 = null != var1?var1.method4679(2142909504):0.1F;
      var2 *= this.aFloat5402;
      float var3 = this.aFloatArray5404.length > 0?0.0F:1.0F;

      for(int var4 = 0; var4 < this.aFloatArray5404.length; ++var4) {
         if(this.aFloatArray5404[var4] > var3) {
            var3 = this.aFloatArray5404[var4];
         }
      }

      var2 *= var3;
      if(!this.method5682((byte)102)) {
         var2 = -1.0F;
      }

      if(this.method5684(-1120126182) != var2) {
         this.method5685(var2, -1952477997);
         this.aBool5450 = true;
      }

   }

   void method5745() {
      synchronized(this) {
         this.aByteArray5441 = null;
         this.anInt5401 = 0;
         this.aFloat5402 = 0.0F;
         this.aFloat5403 = 0.0F;
         this.aBool5405 = false;
         this.anInt5406 = 0;
         this.aFloat5418 = 1.0F;
         this.anInterface57_5408 = null;
         this.anInt5409 = 0;
         this.anInt5449 = 0;
         if(this.aClass480Array5413 != null) {
            for(int var2 = 0; var2 < this.aClass480Array5413.length; ++var2) {
               if(this.aClass480Array5413[var2] != null) {
                  this.aClass480Array5413[var2].method5751(-905793997);
               }
            }
         }

         this.aClass480Array5413 = null;
         this.aBool5447 = false;
         this.anInt5414 = 0;
         this.anInt5435 = 0;
         this.anInt5417 = 0;
         this.anInt5422 = 0;
         this.anInt5419 = 0;
         this.anInt5420 = 0;
         this.anIntArray5421 = null;
         this.anIntArray5416 = null;
         this.anIntArray5434 = null;
         this.anInt5424 = 0;
         this.aBool5425 = false;
         this.anInterface39_5433.method298();
         this.aBool5411 = false;
         this.anInterface56_5400 = null;
         this.anObject5431 = null;
         this.anInt5432 = 0;
         this.anInt5430 = 0;
         this.anInt5444 = 0;
         this.aBool5407 = false;
         this.anInt5445 = 0;
         this.anInt5437 = 0;
         this.aBool5438 = false;
         this.anInt5439 = 0;
         this.method5685(-1.0F, -1952477997);
         this.aBool5450 = false;
         this.aFloat5442 = 0.0F;
         this.aLong5443 = 0L;
         this.aLong5429 = 0L;
         this.aFloat5440 = 0.0F;
         this.anInt5446 = 0;
         this.anInt5427 = 0;
      }
   }

   public void method5746() {
      synchronized(this) {
         this.method5690(908572329);
      }
   }

   static final void method5747(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-37);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class108.method1351(var3, var4, var0, 1458949022);
   }

   static final void method5748(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      if(0 == var2) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else if(var3 == 0) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Integer.MAX_VALUE;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)Math.pow((double)var2, 1.0D / (double)var3);
      }

   }

   static final void method5749(Class681 var0, byte var1) {
      NPC var2 = (NPC)var0.aClass639_Sub1_Sub2_Sub1_8635;
      boolean var3 = false;
      NPCDef var4 = var2.def;
      if(var4.morphisms != null) {
         var4 = var4.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
      }

      if(null != var4) {
         var3 = var4.aBool3317;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3?1:0;
   }

   public static int method5750(long var0) {
      return (int)(var0 / 86400000L) - 11745;
   }
}
