package com.jagex;

import com.jagex.Class101;
import com.jagex.Class105;
import com.jagex.Class108;
import com.jagex.Class113;
import com.jagex.Class115;
import com.jagex.Class148;
import com.jagex.Class163;
import com.jagex.Class186;
import com.jagex.Class189;
import com.jagex.Class199_Sub18;
import com.jagex.Class199_Sub23;
import com.jagex.Class199_Sub3;
import com.jagex.Class201;
import com.jagex.Class210;
import com.jagex.Class229;
import com.jagex.Class230;
import com.jagex.Class247;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class27;
import com.jagex.Class273;
import com.jagex.Class289;
import com.jagex.Class296;
import com.jagex.Class297;
import com.jagex.Class3;
import com.jagex.NPCDef;
import com.jagex.Class327;
import com.jagex.Class380_Sub3_Sub1;
import com.jagex.Class397;
import com.jagex.OutFrame;
import com.jagex.Class40_Sub8;
import com.jagex.Class418;
import com.jagex.Class422;
import com.jagex.Class439;
import com.jagex.Class446;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class460;
import com.jagex.Class461;
import com.jagex.Class465_Sub1;
import com.jagex.Class47;
import com.jagex.Class470;
import com.jagex.Class482;
import com.jagex.Class502;
import com.jagex.Class504;
import com.jagex.Class509;
import com.jagex.Class515;
import com.jagex.Class516;
import com.jagex.Class519;
import com.jagex.Class52;
import com.jagex.Class525;
import com.jagex.Class526_Sub1;
import com.jagex.Class526_Sub10;
import com.jagex.Class526_Sub20;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Buffer;
import com.jagex.Class526_Sub5;
import com.jagex.LinkableObject;
import com.jagex.Class540;
import com.jagex.Class549;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class571;
import com.jagex.Class583;
import com.jagex.Class585;
import com.jagex.Class593;
import com.jagex.Class596;
import com.jagex.Class604;
import com.jagex.Class607;
import com.jagex.Class610;
import com.jagex.Class613;
import com.jagex.Class623;
import com.jagex.Class637;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class64;
import com.jagex.Class640;
import com.jagex.Class646;
import com.jagex.Class652;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Class710;
import com.jagex.Class76;
import com.jagex.Class92;
import com.jagex.client;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class GameMap {
   public long aLong5692;
   Class502 aClass502_5653;
   public int renderDistance;
   Class502 aClass502_5693;
   int[] regionIds;
   int[] mapIds;
   byte[][] aByteArrayArray5685;
   byte[][] aByteArrayArray5686;
   byte[][] aByteArrayArray5687;
   byte[][] aByteArrayArray5688;
   byte[][] aByteArrayArray5657;
   int regionCount = 0;
   public long aLong5674 = -6084225111100206199L;
   Class470 aClass470_5665;
   Class623 aClass623_5664;
   int[][][] anIntArrayArrayArray5690;
   int anInt5666;
   int anInt5681;
   Class526_Sub21_Sub17 aClass526_Sub21_Sub17_5668;
   Class519 aClass519_5669;
   int[][] anIntArrayArray5673;
   int[][] anIntArrayArray5662;
   byte[][][] aByteArrayArrayArray5658;
   Class273 aClass273_5654;
   Class596 aClass596_5667 = new Class596();
   Class596 aClass596_5663 = new Class596();
   int anInt5675;
   int anInt5660;
   int mapWidth;
   int mapLength;
   HashMap aHashMap5651 = new HashMap();
   Class549 aClass549_5652;
   Class515 aClass515_5676;
   int anInt5661 = 0;
   int anInt5678 = 226043907;
   int anInt5679 = 0;
   int anInt5680 = -55046317;
   int anInt5694;
   boolean aBool5659;
   Class465_Sub1 aClass465_Sub1_5655;
   Class465_Sub1 aClass465_Sub1_5656;
   Class516 aClass516_5670 = new Class516(0, 0, 0, 0);
   float aFloat5671;
   public boolean aBool5691 = false;
   Class40_Sub8 aClass40_Sub8_5672;

   public Class502 method6051(int var1) {
      return this.aClass502_5693;
   }

   void method6052() {
      if(Class502.staticMapBuffer != this.aClass502_5693 && this.aClass502_5653 != Class502.staticMapBuffer) {
         if(Class502.CONSTRUCTED == this.aClass502_5693 || this.aClass502_5693 == Class502.aClass502_5638 || this.aClass502_5653 != this.aClass502_5693 && (this.aClass502_5693 == Class502.STATIC || Class502.STATIC == this.aClass502_5653)) {
            Iterator var1 = client.npcs.iterator();

            while(var1.hasNext()) {
               LinkableObject var2 = (LinkableObject)var1.next();
               Class108.method1352((NPC)var2.anObject10399, (byte)67);
            }

            client.npcCount = 0;
            client.anInt11051 = 0;
            client.npcs.method647(929030154);
         }

         this.aClass502_5653 = this.aClass502_5693;
      }
   }

   public int method6053(byte var1) {
      return 100 - this.anInt5661 * 1966350116 / (1698742955 * this.anInt5678);
   }

   public int method6054(int var1) {
      return 100 - 2141344644 * this.anInt5679 / (394333403 * this.anInt5680);
   }

   void method6055(Buffer var1, int var2) {
      int var3 = var1.readUnsignedByte(724129071);
      boolean force = (var3 & 1) != 0;
      int centerY = var1.readUnsignedShortLE128((short)5888);
      int size = var1.readUnsignedByte128((byte)36);
      this.renderDistance = var1.readUnsignedByte(-781566292) * 2068706387;
      int centerX = var1.readUnsignedShort128((short)13853);
      int type = var1.readByteC((byte)8);
      if(1 == type) {
         this.aClass502_5693 = Class502.CONSTRUCTED;
      } else if(type == 2) {
         this.aClass502_5693 = Class502.aClass502_5634;
      } else if(type == 3) {
         this.aClass502_5693 = Class502.aClass502_5638;
      } else if(4 == type) {
         this.aClass502_5693 = Class502.aClass502_5639;
      }

      if(!this.aBool5659) {
         this.method6084(-1551433919);
      }

      this.method6081(Class540.valueOf(size, 1673900306), -1503306677);
      var1.disableBitAccess(385105555);
      HashSet var9 = new HashSet();

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      for(var10 = 0; var10 < 4; ++var10) {
         for(var11 = 0; var11 < this.mapWidth * -734235429 >> 3; ++var11) {
            for(var12 = 0; var12 < -1790811353 * this.mapLength >> 3; ++var12) {
               var13 = var1.readBit(1, 673441488);
               if(1 == var13) {
                  var14 = var1.readBit(26, 673441488);
                  this.anIntArrayArrayArray5690[var10][var11][var12] = var14;
                  var15 = var14 >> 14 & 1023;
                  var16 = var14 >> 3 & 2047;
                  var17 = var15 >> 3 << 8 | var16 >> 3;
                  var9.add(Integer.valueOf(var17));
               } else {
                  this.anIntArrayArrayArray5690[var10][var11][var12] = -1;
               }
            }
         }
      }

      var1.finishBitAccess((byte)113);
      var10 = var9.size();
      this.regionIds = new int[var10];
      this.mapIds = new int[var10];
      this.aByteArrayArray5685 = new byte[var10][];
      this.aByteArrayArray5686 = new byte[var10][];
      this.aByteArrayArray5687 = (byte[][])null;
      this.aByteArrayArray5688 = new byte[var10][];
      this.aByteArrayArray5657 = new byte[var10][];
      var10 = 0;

      for(var11 = 0; var11 < 4; ++var11) {
         for(var12 = 0; var12 < this.mapWidth * -734235429 >> 3; ++var12) {
            for(var13 = 0; var13 < this.mapLength * -1790811353 >> 3; ++var13) {
               var14 = this.anIntArrayArrayArray5690[var11][var12][var13];
               if(-1 != var14) {
                  var15 = var14 >> 14 & 1023;
                  var16 = var14 >> 3 & 2047;
                  var17 = var16 / 8 + (var15 / 8 << 8);

                  int var18;
                  for(var18 = 0; var18 < var10; ++var18) {
                     if(var17 == this.regionIds[var18]) {
                        var17 = -1;
                        break;
                     }
                  }

                  if(-1 != var17) {
                     var18 = var17 >> 8 & 255;
                     int var19 = var17 & 255;
                     if(Class380_Sub3_Sub1.maps.validChild(this.method6082(var18, var19, -892475015), -1751036255 * Class461.aClass461_5194.anInt5203, (byte)0)) {
                        this.regionIds[var10] = var17;
                        this.mapIds[var10] = this.method6082(var18, var19, -892475015);
                        ++var10;
                     }
                  }
               }
            }
         }
      }

      this.regionCount = 1086225245 * var10;
      this.updateMapArea(centerX, centerY, 10, force, (byte)33);
   }

   public int method6056(int var1) {
      return this.mapWidth * -734235429;
   }

   public int method6057(int var1) {
      return this.mapLength * -1790811353;
   }

   public Class519 method6058(byte var1) {
      return this.aClass519_5669;
   }

   public float method6059(int var1) {
      return this.aFloat5671;
   }

   void method6060(int var1) {
      this.aClass502_5653 = this.aClass502_5693;
      this.method6081(Class273.aClass273_3000, -1503306677);

      int var2;
      int var3;
      int var4;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < -734235429 * this.mapWidth >> 3; ++var3) {
            for(var4 = 0; var4 < this.mapLength * -1790811353 >> 3; ++var4) {
               this.anIntArrayArrayArray5690[var2][var3][var4] = -1;
            }
         }
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(Class526_Sub10 var20 = (Class526_Sub10)Class189.aClass702_2160.method8206((byte)57); null != var20; var20 = (Class526_Sub10)Class189.aClass702_2160.method8181(1813094305)) {
         var3 = 1849877797 * var20.anInt10417;
         boolean var22 = (var3 & 1) == 1;
         var5 = 1649931673 * var20.anInt10410 >> 3;
         var6 = -990036815 * var20.anInt10415 >> 3;
         var7 = 1451231669 * var20.anInt10413;
         var8 = 1900443381 * var20.anInt10411;
         var9 = -1901865493 * var20.anInt10409;
         var10 = var20.anInt10412 * -1703808861;
         var11 = var20.anInt10414 * -674258075;
         int var12 = 1661101633 * var20.anInt10416;
         int var13 = 0;
         int var14 = 0;
         byte var15 = 1;
         byte var16 = 1;
         if(1 == var3) {
            var14 = var11 - 1;
            var15 = -1;
         } else if(var3 == 2) {
            var14 = var11 - 1;
            var13 = var12 - 1;
            var15 = -1;
            var16 = -1;
         } else if(3 == var3) {
            var13 = var12 - 1;
            var15 = 1;
            var16 = -1;
         }

         for(int var17 = var6; var17 < var12 + var6; var13 += var16) {
            int var18 = var14;

            for(int var19 = var5; var19 < var11 + var5; var18 += var15) {
               if(var22) {
                  this.anIntArrayArrayArray5690[var10][var7 + var13][var8 + var18] = (var17 << 3) + (var19 << 14) + (var9 << 24) + (var3 << 1);
               } else {
                  this.anIntArrayArrayArray5690[var10][var18 + var7][var13 + var8] = (var3 << 1) + (var9 << 24) + (var19 << 14) + (var17 << 3);
               }

               ++var19;
            }

            ++var17;
         }
      }

      var2 = client.anInt11077 * 1223854915;
      this.regionIds = new int[var2];
      this.mapIds = new int[var2];
      this.aByteArrayArray5685 = new byte[var2][];
      this.aByteArrayArray5686 = new byte[var2][];
      this.aByteArrayArray5687 = (byte[][])null;
      this.aByteArrayArray5688 = new byte[var2][];
      this.aByteArrayArray5657 = new byte[var2][];
      var2 = 0;

      for(Class526_Sub10 var21 = (Class526_Sub10)Class189.aClass702_2160.method8206((byte)90); var21 != null; var21 = (Class526_Sub10)Class189.aClass702_2160.method8181(-535268330)) {
         var4 = 1649931673 * var21.anInt10410 >>> 3;
         var5 = var21.anInt10415 * -990036815 >>> 3;
         var6 = var4 + -674258075 * var21.anInt10414;
         if((var6 & 7) == 0) {
            --var6;
         }

         var6 >>>= 3;
         var7 = var5 + 1661101633 * var21.anInt10416;
         if((var7 & 7) == 0) {
            --var7;
         }

         var7 >>>= 3;

         for(var8 = var4 >>> 3; var8 <= var6; ++var8) {
            label84:
            for(var9 = var5 >>> 3; var9 <= var7; ++var9) {
               var10 = var8 << 8 | var9;

               for(var11 = 0; var11 < var2; ++var11) {
                  if(var10 == this.regionIds[var11]) {
                     continue label84;
                  }
               }

               if(Class380_Sub3_Sub1.maps.validChild(this.method6082(var8, var9, -892475015), -1751036255 * Class461.aClass461_5194.anInt5203, (byte)0)) {
                  this.regionIds[var2] = var10;
                  this.mapIds[var2] = this.method6082(var8, var9, -892475015);
                  ++var2;
               }
            }
         }
      }

      this.regionCount = var2 * 1086225245;
      this.updateMapArea(this.mapWidth * -734235429 >> 4, -1790811353 * this.mapLength >> 4, 10, false, (byte)-4);
   }

   public int method6061(byte var1) {
      return this.anInt5681 * 1925969269;
   }

   public void method6062() {
      if(this.aBool5659) {
         this.method6075(1284404407);
         this.aLong5674 = -6084225111100206199L;
         GameMap var1 = client.aClass505_11204;
         this.regionCount = var1.regionCount * 1;
         this.regionIds = var1.regionIds;
         this.mapIds = var1.mapIds;
         this.aByteArrayArray5685 = var1.aByteArrayArray5685;
         this.aByteArrayArray5686 = var1.aByteArrayArray5686;
         this.aByteArrayArray5687 = var1.aByteArrayArray5687;
         this.aByteArrayArray5688 = var1.aByteArrayArray5688;
         this.aByteArrayArray5657 = var1.aByteArrayArray5657;
         this.aClass470_5665 = var1.aClass470_5665;
         this.aClass623_5664 = var1.aClass623_5664;
         this.anIntArrayArrayArray5690 = var1.anIntArrayArrayArray5690;
         this.anInt5666 = var1.anInt5666 * 1;
         this.anInt5681 = 1 * var1.anInt5681;
         this.aClass526_Sub21_Sub17_5668 = var1.aClass526_Sub21_Sub17_5668;
         this.aClass519_5669 = var1.aClass519_5669;
         this.anIntArrayArray5673 = var1.anIntArrayArray5673;
         this.anIntArrayArray5662 = var1.anIntArrayArray5662;
         this.aByteArrayArrayArray5658 = var1.aByteArrayArrayArray5658;
         this.aClass502_5693 = var1.aClass502_5693;
         this.aClass273_5654 = var1.aClass273_5654;
         this.aClass596_5667 = var1.aClass596_5667;
         this.aClass596_5663 = var1.aClass596_5663;
         this.anInt5675 = var1.anInt5675 * 1;
         this.anInt5660 = var1.anInt5660 * 1;
         this.mapWidth = var1.mapWidth * 1;
         this.mapLength = var1.mapLength * 1;
      } else if(-558705405 * client.anInt11038 == 16) {
         Class593.method7031(7, (byte)62);
      } else if(client.anInt11038 * -558705405 == 0) {
         Class593.method7031(14, (byte)101);
      } else if(client.anInt11038 * -558705405 == 8) {
         Class593.method7031(6, (byte)87);
      } else if(client.anInt11038 * -558705405 == 9) {
         Class593.method7031(10, (byte)54);
      } else if(-558705405 * client.anInt11038 == 11) {
         Class593.method7031(5, (byte)109);
      }

   }

   public byte[][] method6063(int var1, int var2) {
      return null != this.aClass465_Sub1_5656 && this.aClass465_Sub1_5656.aByteArrayArrayArray5248 != null && this.aClass465_Sub1_5656.aByteArrayArrayArray5248[var1] != null?this.aClass465_Sub1_5656.aByteArrayArrayArray5248[var1]:(byte[][])null;
   }

   public int method6064() {
      return 100 - this.anInt5661 * 1966350116 / (1698742955 * this.anInt5678);
   }

   public int method6065() {
      return this.anInt5666 * 533540903;
   }

   public Class40_Sub8 method6066(int var1) {
      return this.aClass40_Sub8_5672;
   }

   public int[][] method6067(short var1) {
      return this.anIntArrayArray5673;
   }

   public int[][] method6068(int var1) {
      return this.anIntArrayArray5662;
   }

   public byte[][][] method6069(byte var1) {
      return this.aByteArrayArrayArray5658;
   }

   public void method6070(byte[][][] var1, byte var2) {
      this.aByteArrayArrayArray5658 = var1;
   }

   public int method6071() {
      return this.anInt5666 * 533540903;
   }

   public Class549 method6072(int var1) {
      return this.aClass549_5652;
   }

   public void method6073(int var1) {
      this.aClass596_5667 = new Class596();
      this.anInt5660 = 0;
      this.anInt5675 = 0;
   }

   public void method6074(int var1) {
      if(null != this.aClass549_5652) {
         Class519.method6242((byte)119);
         this.aHashMap5651 = this.aClass549_5652.method6623((byte)1);
         this.aClass549_5652.aClass559_7318.method6718((byte)6);
         this.aClass549_5652 = null;
      }

   }

   public void method6075(int var1) {
      this.aClass515_5676 = Class515.aClass515_7028;
      this.anInt5661 = 0;
      this.anInt5678 = 226043907;
      this.anInt5679 = 0;
      this.anInt5680 = -55046317;
      this.anInt5694 = 0;
   }

   public void method6076(boolean var1, int var2) {
      Class637 var3 = null;
      if(null != this.aClass623_5664 && var1) {
         var3 = this.aClass623_5664.method7365(-1928549693);
      }

      this.aClass623_5664 = new Class623(Class554.aClass174_7475, Class113.aClass466_1370, -734235429 * this.mapWidth >> 3, -1790811353 * this.mapLength >> 3);
      if(var3 != null) {
         this.aClass623_5664.method7364(this, var3, 0, (byte)-48);
      }

   }

   void method6077(GameMap var1, int var2) {
      boolean var3 = var1.aBool5659;
      var1.aBool5659 = this.aBool5659;
      this.aBool5659 = var3;
      Class502 var4 = var1.aClass502_5653;
      var1.aClass502_5653 = this.aClass502_5653;
      this.aClass502_5653 = var4;
      var1.aClass596_5663 = this.aClass596_5667;
      this.aClass596_5663 = var1.aClass596_5667;
      this.aClass623_5664.method7367(var1.method6100((byte)2), 171168369);
   }

   public void method6078(int var1) {
      if(this.aBool5659) {
         this.method6075(1412348883);
         this.aLong5674 = -6084225111100206199L;
         GameMap var2 = client.aClass505_11204;
         this.regionCount = var2.regionCount * 1;
         this.regionIds = var2.regionIds;
         this.mapIds = var2.mapIds;
         this.aByteArrayArray5685 = var2.aByteArrayArray5685;
         this.aByteArrayArray5686 = var2.aByteArrayArray5686;
         this.aByteArrayArray5687 = var2.aByteArrayArray5687;
         this.aByteArrayArray5688 = var2.aByteArrayArray5688;
         this.aByteArrayArray5657 = var2.aByteArrayArray5657;
         this.aClass470_5665 = var2.aClass470_5665;
         this.aClass623_5664 = var2.aClass623_5664;
         this.anIntArrayArrayArray5690 = var2.anIntArrayArrayArray5690;
         this.anInt5666 = var2.anInt5666 * 1;
         this.anInt5681 = 1 * var2.anInt5681;
         this.aClass526_Sub21_Sub17_5668 = var2.aClass526_Sub21_Sub17_5668;
         this.aClass519_5669 = var2.aClass519_5669;
         this.anIntArrayArray5673 = var2.anIntArrayArray5673;
         this.anIntArrayArray5662 = var2.anIntArrayArray5662;
         this.aByteArrayArrayArray5658 = var2.aByteArrayArrayArray5658;
         this.aClass502_5693 = var2.aClass502_5693;
         this.aClass273_5654 = var2.aClass273_5654;
         this.aClass596_5667 = var2.aClass596_5667;
         this.aClass596_5663 = var2.aClass596_5663;
         this.anInt5675 = var2.anInt5675 * 1;
         this.anInt5660 = var2.anInt5660 * 1;
         this.mapWidth = var2.mapWidth * 1;
         this.mapLength = var2.mapLength * 1;
      } else if(-558705405 * client.anInt11038 == 16) {
         Class593.method7031(7, (byte)123);
      } else if(client.anInt11038 * -558705405 == 0) {
         Class593.method7031(14, (byte)43);
      } else if(client.anInt11038 * -558705405 == 8) {
         Class593.method7031(6, (byte)98);
      } else if(client.anInt11038 * -558705405 == 9) {
         Class593.method7031(10, (byte)78);
      } else if(-558705405 * client.anInt11038 == 11) {
         Class593.method7031(5, (byte)92);
      }

   }

   void method6079(byte var1) {
      int var2 = this.aByteArrayArray5687.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         if(null != this.aByteArrayArray5687[var3]) {
            int var4 = -1;

            for(int var5 = 0; var5 < 740276897 * client.anInt11281; ++var5) {
               if(client.anIntArray11069[var5] == this.regionIds[var3]) {
                  var4 = var5;
                  break;
               }
            }

            if(-1 == var4) {
               client.anIntArray11069[740276897 * client.anInt11281] = this.regionIds[var3];
               var4 = (client.anInt11281 += 906406241) * 740276897 - 1;
            }

            RSByteBuffer var18 = new RSByteBuffer(this.aByteArrayArray5687[var3]);
            int var6 = 0;

            while(var18.pos * 301018015 < this.aByteArrayArray5687[var3].length && var6 < 511 && client.npcCount * 1139938345 < 1023) {
               int var7 = var4 | var6++ << 6;
               int var8 = var18.readUnsignedShort(1988009320);
               int var9 = var8 >> 14;
               int var10 = var8 >> 7 & 63;
               int var11 = var8 & 63;
               int var12 = var10 + (64 * (this.regionIds[var3] >> 8) - this.aClass596_5667.localX * -814686591);
               int var13 = (this.regionIds[var3] & 255) * 64 - this.aClass596_5667.localY * -845789331 + var11;
               NPCDef var14 = (NPCDef)Class76.loader.method89(var18.readUnsignedShort(1859799936), -1173238490);
               LinkableObject var15 = (LinkableObject)client.npcs.get((long)var7);
               if(var15 == null && (var14.movementCapabilities & 1) > 0 && var12 >= 0 && var12 + 459047587 * var14.boundSize < this.mapWidth * -734235429 && var13 >= 0 && 459047587 * var14.boundSize + var13 < this.mapLength * -1790811353) {
                  NPC var16 = new NPC(this.aClass549_5652);
                  var16.index = 1016367843 * var7;
                  LinkableObject var17 = new LinkableObject(var16);
                  client.npcs.put(var17, (long)var7);
                  client.aClass526_Sub7Array11050[(client.anInt11051 += 253277107) * 2027369339 - 1] = var17;
                  client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = var7;
                  var16.lastUpdate = client.anInt11012 * 577471779;
                  var16.setDefinition(var14, -1957887669);
                  var16.setBoundSize(var16.def.boundSize * 459047587, (byte)-100);
                  var16.anInt11938 = (var16.def.contrast * -739260225 << 3) * 446106299;
                  var16.turn(var16.def.respawnDirection.opposite(978966546).getId() << 11 & 16383, true, -729446779);
                  var16.move(var9, var12, var13, true, var16.method10781(-627148024), -1242415576);
               }
            }
         }
      }

   }

   public void method6080() {
      this.aClass515_5676 = Class515.aClass515_7028;
      this.anInt5661 = 0;
      this.anInt5678 = 226043907;
      this.anInt5679 = 0;
      this.anInt5680 = -55046317;
      this.anInt5694 = 0;
   }

   void method6081(Class273 var1, int var2) {
      if(var1 != this.aClass273_5654) {
         this.mapWidth = (this.mapLength = var1.anInt3002 * -1111650755) * -1231759707;
         this.anIntArrayArrayArray5690 = new int[4][-734235429 * this.mapWidth >> 3][this.mapLength * -1790811353 >> 3];
         this.anIntArrayArray5673 = new int[-734235429 * this.mapWidth][-1790811353 * this.mapLength];
         this.anIntArrayArray5662 = new int[this.mapWidth * -734235429][-1790811353 * this.mapLength];
         this.aByteArrayArrayArray5658 = new byte[4][-734235429 * this.mapWidth][-1790811353 * this.mapLength];
         this.aClass470_5665 = new Class470(4, -734235429 * this.mapWidth, this.mapLength * -1790811353);
         this.method6076(false, 240477088);
         Class607.method7148((byte)44);
         this.aClass273_5654 = var1;
      }
   }

   int method6082(int var1, int var2, int var3) {
      return var1 | var2 << 7;
   }

   void method6083(Class465_Sub1 var1, byte[][] var2, int var3) {
      for(int var4 = 0; var4 < var1.anInt5269 * -1917803745; ++var4) {
         if(!this.aBool5659) {
            Class570.aClass231_7657.method3190((byte)-93);
         }

         for(int var5 = 0; var5 < this.mapWidth * -734235429 >> 3; ++var5) {
            for(int var6 = 0; var6 < this.mapLength * -1790811353 >> 3; ++var6) {
               int var7 = this.anIntArrayArrayArray5690[var4][var5][var6];
               if(-1 != var7) {
                  int var8 = var7 >> 24 & 3;
                  if(!var1.aBool5246 || 0 == var8) {
                     int var9 = var7 >> 1 & 3;
                     int var10 = var7 >> 14 & 1023;
                     int var11 = var7 >> 3 & 2047;
                     int var12 = var11 / 8 + (var10 / 8 << 8);

                     for(int var13 = 0; var13 < this.regionIds.length; ++var13) {
                        if(var12 == this.regionIds[var13] && null != var2[var13]) {
                           var1.method9271(Class554.aClass174_7475, var2[var13], var4, 8 * var5, var6 * 8, var8, 8 * (var10 & 7), 8 * (var11 & 7), var9, -819720799);
                           break;
                        }
                     }
                  }
               }

               if(this.aBool5659) {
                  this.method6117(5, 1229055719);
               }
            }
         }
      }

   }

   void method6084(int var1) {
      if(Class502.staticMapBuffer != this.aClass502_5693 && this.aClass502_5653 != Class502.staticMapBuffer) {
         if(Class502.CONSTRUCTED == this.aClass502_5693 || this.aClass502_5693 == Class502.aClass502_5638 || this.aClass502_5653 != this.aClass502_5693 && (this.aClass502_5693 == Class502.STATIC || Class502.STATIC == this.aClass502_5653)) {
            Iterator var2 = client.npcs.iterator();

            while(var2.hasNext()) {
               LinkableObject var3 = (LinkableObject)var2.next();
               Class108.method1352((NPC)var3.anObject10399, (byte)-77);
            }

            client.npcCount = 0;
            client.anInt11051 = 0;
            client.npcs.method647(929030154);
         }

         this.aClass502_5653 = this.aClass502_5693;
      }
   }

   void updateMapArea(int var1, int var2, int var3, boolean var4, byte var5) {
      if(2 == client.anInt11073 * 378016543) {
         if(this.aBool5659) {
            throw new IllegalStateException();
         }

         client.anInt11073 = 404814493;
         client.anInt11072 = -238438937;
      }

      if(var4 || this.anInt5675 * -1649731861 != var1 || this.anInt5660 * 607535919 != var2) {
         this.anInt5675 = -1503927869 * var1;
         this.anInt5660 = var2 * -16522289;
         if(!this.aBool5659) {
            Class593.method7031(var3, (byte)120);
            Class52.method965(Class45.aClass45_560.method920(Class26.aClass673_247, -827840379), true, Class554.aClass174_7475, Class422.aClass163_4740, Class199_Sub3.aClass1_9887, (byte)-79);
         }

         if(this.aClass596_5667 != null) {
            this.aClass596_5663 = this.aClass596_5667;
         } else {
            this.aClass596_5663 = new Class596(0, 0, 0);
         }

         this.aClass596_5667 = new Class596(0, 8 * (-1649731861 * this.anInt5675 - (-734235429 * this.mapWidth >> 4)), (607535919 * this.anInt5660 - (-1790811353 * this.mapLength >> 4)) * 8);
         this.aClass526_Sub21_Sub17_5668 = Class525.method6289(-814686591 * this.aClass596_5667.localX + -734235429 * this.mapWidth / 2, this.mapWidth * -734235429 / 2 + -845789331 * this.aClass596_5667.localY);
         this.aClass519_5669 = null;
         this.aLong5674 = -6084225111100206199L;
         if(!this.aBool5659) {
            this.method6086(var3, (byte)37);
         }

      }
   }

   void method6086(int var1, byte var2) {
      int var3 = this.aClass596_5667.localX * -814686591 - -814686591 * this.aClass596_5663.localX;
      int var4 = -845789331 * this.aClass596_5667.localY - this.aClass596_5663.localY * -845789331;
      int var5;
      int var8;
      int var15;
      int var17;
      if(10 == var1) {
         for(var5 = 0; var5 < client.anInt11051 * 2027369339; ++var5) {
            LinkableObject var6 = client.aClass526_Sub7Array11050[var5];
            if(null != var6) {
               NPC var7 = (NPC)var6.anObject10399;

               for(var8 = 0; var8 < var7.screenX.length; ++var8) {
                  var7.screenX[var8] -= var3;
                  var7.screenY[var8] -= var4;
               }

               Class446 var23 = Class446.method5305(var7.method7635().aClass446_4816);
               var23.aFloat4917 -= (float)(512 * var3);
               var23.aFloat4919 -= (float)(512 * var4);
               var7.method7632(var23);
               var23.method5278();
            }
         }
      } else {
         boolean var14 = false;
         client.npcCount = 0;
         var15 = 2028582400 * this.mapWidth - 512;
         var17 = this.mapLength * -2067378688 - 512;

         for(var8 = 0; var8 < 2027369339 * client.anInt11051; ++var8) {
            LinkableObject var9 = client.aClass526_Sub7Array11050[var8];
            if(var9 != null) {
               NPC var10 = (NPC)var9.anObject10399;
               Class446 var11 = Class446.method5305(var10.method7635().aClass446_4816);
               var11.aFloat4917 -= (float)(var3 * 512);
               var11.aFloat4919 -= (float)(var4 * 512);
               var10.method7632(var11);
               if((int)var11.aFloat4917 >= 0 && (int)var11.aFloat4917 <= var15 && (int)var11.aFloat4919 >= 0 && (int)var11.aFloat4919 <= var17) {
                  boolean var12 = true;

                  for(int var13 = 0; var13 < var10.screenX.length; ++var13) {
                     var10.screenX[var13] -= var3;
                     var10.screenY[var13] -= var4;
                     if(var10.screenX[var13] < 0 || var10.screenX[var13] >= this.mapWidth * -734235429 || var10.screenY[var13] < 0 || var10.screenY[var13] >= this.mapLength * -1790811353) {
                        var12 = false;
                     }
                  }

                  if(var12) {
                     client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = 828574411 * var10.index;
                  } else {
                     var10.setDefinition((NPCDef)null, -1957887669);
                     var9.method6332(-1949449864);
                     var14 = true;
                  }
               } else {
                  var10.setDefinition((NPCDef)null, -1957887669);
                  var9.method6332(-1949449864);
                  var14 = true;
               }

               var11.method5278();
            }
         }

         if(var14) {
            client.anInt11051 = client.npcs.method636(-1523214292) * 253277107;
            var8 = 0;

            LinkableObject var27;
            for(Iterator var25 = client.npcs.iterator(); var25.hasNext(); client.aClass526_Sub7Array11050[var8++] = var27) {
               var27 = (LinkableObject)var25.next();
            }
         }
      }

      for(var5 = 0; var5 < 2048; ++var5) {
         Class639_Sub1_Sub2_Sub1_Sub1 var16 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var5];
         if(var16 != null) {
            for(var17 = 0; var17 < var16.screenX.length; ++var17) {
               var16.screenX[var17] -= var3;
               var16.screenY[var17] -= var4;
            }

            Class446 var21 = Class446.method5305(var16.method7635().aClass446_4816);
            var21.aFloat4917 -= (float)(var3 * 512);
            var21.aFloat4919 -= (float)(var4 * 512);
            var16.method7632(var21);
            var21.method5278();
         }
      }

      Class113[] var18 = client.aClass113Array11018;

      for(var15 = 0; var15 < var18.length; ++var15) {
         Class113 var24 = var18[var15];
         if(null != var24) {
            var24.anInt1363 -= var3 * -95458816;
            var24.anInt1365 -= -1365014016 * var4;
         }
      }

      Class526_Sub1 var19;
      Class610 var20;
      for(var19 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8206((byte)113); var19 != null; var19 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8181(-518535483)) {
         var19.anInt10301 -= var3 * 767842083;
         var19.anInt10298 -= 1139683879 * var4;
         var20 = (Class610)this.aClass40_Sub8_5672.method89(-1915127235 * var19.anInt10305, -288818017);
         if(0 == (var19.anInt10312 * -341852837 & 1)) {
            var17 = -1450399027 * var20.anInt7993;
            var8 = var20.anInt7971 * 182793117;
         } else {
            var17 = 182793117 * var20.anInt7971;
            var8 = var20.anInt7993 * -1450399027;
         }

         if(this.aClass502_5693 != Class502.aClass502_5639 && (var17 + 195793035 * var19.anInt10301 <= 0 || var8 + 64888215 * var19.anInt10298 <= 0 || var19.anInt10301 * 195793035 >= -734235429 * this.mapWidth || 64888215 * var19.anInt10298 >= this.mapLength * -1790811353)) {
            var19.method6332(-1949449864);
         }
      }

      for(var19 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8206((byte)99); null != var19; var19 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8181(-600278576)) {
         var19.anInt10301 -= 767842083 * var3;
         var19.anInt10298 -= 1139683879 * var4;
         var20 = (Class610)this.aClass40_Sub8_5672.method89(-1915127235 * var19.anInt10305, -1512799854);
         if(0 == (-341852837 * var19.anInt10312 & 1)) {
            var17 = var20.anInt7993 * -1450399027;
            var8 = 182793117 * var20.anInt7971;
         } else {
            var17 = 182793117 * var20.anInt7971;
            var8 = var20.anInt7993 * -1450399027;
         }

         if(Class502.aClass502_5639 != this.aClass502_5693 && (var17 + var19.anInt10301 * 195793035 <= 0 || var8 + 64888215 * var19.anInt10298 <= 0 || var19.anInt10301 * 195793035 >= -734235429 * this.mapWidth || var19.anInt10298 * 64888215 >= -1790811353 * this.mapLength)) {
            var19.method6332(-1949449864);
         }
      }

      for(Class526_Sub20 var22 = (Class526_Sub20)client.aClass20_11259.method638(1461000109); null != var22; var22 = (Class526_Sub20)client.aClass20_11259.method639(1209636883)) {
         var17 = (int)(var22.aLong7156 * -6805155999452426801L >> 28 & 3L);
         var8 = (int)(var22.aLong7156 * -6805155999452426801L & 16383L);
         int var26 = var8 - this.aClass596_5667.localX * -814686591;
         int var28 = (int)(-6805155999452426801L * var22.aLong7156 >> 14 & 16383L);
         int var29 = var28 - this.aClass596_5667.localY * -845789331;
         if(this.aClass549_5652 != null) {
            if(var26 >= 0 && var29 >= 0 && var26 < -734235429 * this.mapWidth && var29 < -1790811353 * this.mapLength && var26 < this.aClass549_5652.anInt7285 * -447634797 && var29 < this.aClass549_5652.anInt7286 * 1913648871) {
               if(this.aClass549_5652.aClass552ArrayArrayArray7287 != null) {
                  this.aClass549_5652.method6587(var17, var26, var29, (byte)-40);
               }
            } else if(Class502.aClass502_5639 != this.aClass502_5693) {
               var22.method6332(-1949449864);
            }
         }
      }

      if(0 != 1653075275 * Class105.anInt1300) {
         Class105.anInt1300 -= -2110507933 * var3;
         Class105.anInt1301 -= -1654212593 * var4;
      }

      Class201.method2878(false, 511911452);
      if(10 == var1) {
         client.anInt11321 -= var3 * 1315062272;
         client.anInt11043 -= var4 * 404092416;
         Class45.anInt639 -= var3 * -488196608;
         Class186.anInt2122 -= var4 * -1062815232;
         if(6 != -265840483 * Class327.anInt3488 && -265840483 * Class327.anInt3488 != 2) {
            Class418.method4974(Class397.method4824((byte)1), (byte)86);
         }
      } else {
         Class583.anInt7782 -= 206279661 * var3;
         Class526_Sub5.anInt10388 -= var4 * -945894401;
         Class289.anInt3117 -= var3 * 199800795;
         Class482.anInt5484 -= -2013496173 * var4;
         Class439.anInt4866 -= -507129344 * var3;
         Class210.anInt2259 -= var4 * -195987968;
         if(Math.abs(var3) > -734235429 * this.mapWidth || Math.abs(var4) > this.mapLength * -1790811353) {
            this.aClass623_5664.method7377((byte)0);
         }
      }

      Class3.method536(-227053614);
      Class613.method7239((byte)3);
      client.aClass20_11160.method647(929030154);
      client.aClass702_11173.method8188(-1678889933);
      client.aClass686_11103.method8050((short)-520);
      Class604.method7101((byte)8);
   }

   void method6087(int var1) {
      this.aClass465_Sub1_5655 = null;
      this.aClass465_Sub1_5656 = null;
      if(null != this.aClass470_5665) {
         this.aClass470_5665.method5618(-1502044359);
      }

      if(this.aClass623_5664 != null) {
         this.aClass623_5664.method7394(-1993215506);
      }

      if(this.aClass549_5652 != null) {
         this.aClass549_5652.aClass559_7318.method6718((byte)-3);
         this.aClass549_5652 = null;
      }

   }

   public void method6088() {
      this.aClass596_5667 = new Class596();
      this.anInt5660 = 0;
      this.anInt5675 = 0;
   }

   public boolean method6089(int var1) {
      if(!this.aBool5659) {
         Class199_Sub23.method9038(false, 919814550);
      }

      if(-1L == -808407276727046841L * this.aLong5674) {
         this.aLong5674 = Class255.time((byte)24) * 6084225111100206199L;
      }

      this.anInt5661 = 0;

      int var2;
      for(var2 = 0; var2 < this.regionCount * -1103843083; ++var2) {
         if(!Class380_Sub3_Sub1.maps.method5538(this.mapIds[var2], (byte)51)) {
            this.anInt5661 += -1550582319;
         }
      }

      if(this.aClass519_5669 == null) {
         if(this.aClass526_Sub21_Sub17_5668 != null && client.aClass466_11041.method5548(this.aClass526_Sub21_Sub17_5668.aString11837, 780710299)) {
            if(!client.aClass466_11041.method5552(this.aClass526_Sub21_Sub17_5668.aString11837, (byte)-16)) {
               this.anInt5661 += -1550582319;
            } else {
               this.aClass519_5669 = Class460.method5460(client.aClass466_11041, this.aClass526_Sub21_Sub17_5668.aString11837, client.aBool11230, 1180595835);
            }
         } else {
            this.aClass519_5669 = new Class519(0);
         }
      }

      if(this.anInt5661 * -1956021455 > 0) {
         if(this.anInt5678 * 1698742955 < this.anInt5661 * -1956021455) {
            this.anInt5678 = -727377517 * this.anInt5661;
         }

         this.aClass515_5676 = Class515.aClass515_7031;
         return false;
      } else {
         for(var2 = 0; var2 < -1103843083 * this.regionCount; ++var2) {
            if(null == this.aByteArrayArray5685[var2]) {
               this.aByteArrayArray5685[var2] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var2], -1751036255 * Class461.aClass461_5194.anInt5203, (byte)20);
            }

            if(this.aByteArrayArray5686[var2] == null) {
               this.aByteArrayArray5686[var2] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var2], -1751036255 * Class461.aClass461_5197.anInt5203, (byte)56);
            }

            if(this.aByteArrayArray5688[var2] == null) {
               this.aByteArrayArray5688[var2] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var2], Class461.aClass461_5198.anInt5203 * -1751036255, (byte)15);
            }

            if(null == this.aByteArrayArray5657[var2]) {
               this.aByteArrayArray5657[var2] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var2], Class461.aClass461_5195.anInt5203 * -1751036255, (byte)-72);
            }

            if(null != this.aByteArrayArray5687 && null == this.aByteArrayArray5687[var2]) {
               this.aByteArrayArray5687[var2] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var2], -1751036255 * Class461.aClass461_5196.anInt5203, (byte)43);
            }
         }

         var2 = this.anInt5679 * 493859849;
         Class652 var3 = new Class652(-1);
         Class652 var4 = new Class652(-1);
         this.anInt5679 = 0;

         int var5;
         int var8;
         int var9;
         for(var5 = 0; var5 < this.regionCount * -1103843083; ++var5) {
            byte[] var6 = this.aByteArrayArray5686[var5];
            int var7;
            if(null != var6) {
               var7 = (this.regionIds[var5] >> 8) * 64 - this.aClass596_5667.localX * -814686591;
               var8 = (this.regionIds[var5] & 255) * 64 - this.aClass596_5667.localY * -845789331;
               if(this.aClass502_5693.method6022((byte)77)) {
                  var7 = 10;
                  var8 = 10;
               }

               var9 = Class640.method7637(this.aClass40_Sub8_5672, var6, var7, var8, -734235429 * this.mapWidth, this.mapLength * -1790811353, var4, var3, 1989076880);
               if(var9 > 0) {
                  this.anInt5679 += -1323820487 * var9;
               }
            }

            var6 = this.aByteArrayArray5657[var5];
            if(null != var6) {
               var7 = (this.regionIds[var5] >> 8) * 64 - -814686591 * this.aClass596_5667.localX;
               var8 = (this.regionIds[var5] & 255) * 64 - -845789331 * this.aClass596_5667.localY;
               if(this.aClass502_5693.method6022((byte)50)) {
                  var7 = 10;
                  var8 = 10;
               }

               var9 = Class640.method7637(this.aClass40_Sub8_5672, var6, var7, var8, this.mapWidth * -734235429, this.mapLength * -1790811353, var4, var3, 1868409354);
               if(var9 > 0) {
                  this.anInt5679 += -1323820487 * var9;
               }
            }
         }

         if(this.anInt5679 * 493859849 > 0) {
            if(var2 == this.anInt5679 * 493859849) {
               if(0 != this.anInt5694 * -814525561 && client.anInt11012 - this.anInt5694 * -814525561 == 1000) {
                  Class247.method3398(var4.anInt8464 * -618316129, var3.anInt8464 * -618316129, this.anInt5679 * 493859849, -1296079507);
                  Class296.method3966((byte)-43);
               }
            } else {
               this.anInt5694 = client.anInt11012 * 1147011639;
            }

            if(394333403 * this.anInt5680 < 493859849 * this.anInt5679) {
               this.anInt5680 = this.anInt5679 * 1497097707;
            }

            this.aClass515_5676 = Class515.aClass515_7030;
            return false;
         } else {
            if(!this.aBool5659 && this.aClass515_5676 != Class515.aClass515_7028) {
               Class52.method965(Class45.aClass45_560.method920(Class26.aClass673_247, -827840379) + Class64.aString742 + "(100%)", true, Class554.aClass174_7475, Class422.aClass163_4740, Class199_Sub3.aClass1_9887, (byte)-123);
            }

            this.aClass515_5676 = Class515.aClass515_7029;
            if(!this.aBool5659 && Class570.aClass231_7657 != null) {
               Class570.aClass231_7657.method3190((byte)-26);
            }

            if(!this.aBool5659) {
               for(var5 = 0; var5 < 2048; ++var5) {
                  Class639_Sub1_Sub2_Sub1_Sub1 var20 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var5];
                  if(var20 != null) {
                     var20.aClass549_10826 = null;
                  }
               }

               for(var5 = 0; var5 < client.aClass526_Sub7Array11050.length; ++var5) {
                  LinkableObject var22 = client.aClass526_Sub7Array11050[var5];
                  if(null != var22) {
                     ((Class639_Sub1)var22.anObject10399).aClass549_10826 = null;
                  }
               }
            }

            if(!this.aBool5659) {
               Class571.method6896(true, 1264555570);
            }

            boolean var21 = false;
            int var23;
            if(Class230.preferences.aClass711_Sub16_10634.method9997((byte)3) == 2) {
               for(var23 = 0; var23 < -1103843083 * this.regionCount; ++var23) {
                  if(null != this.aByteArrayArray5657[var23] || this.aByteArrayArray5688[var23] != null) {
                     var21 = true;
                     break;
                  }
               }
            }

            var23 = Class101.method1286(Class230.preferences.aClass711_Sub22_10615.method10054((byte)67), 1821453706).anInt3256 * -382698840;
            if(Class554.aClass174_7475.method2244()) {
               ++var23;
            }

            this.method6093(1291529102);
            this.method6087(1101394165);
            this.aClass549_5652 = new Class549(Class554.aClass174_7475, 9, 4, -734235429 * this.mapWidth, this.mapLength * -1790811353, var23, var21, Class554.aClass174_7475.method2334() > 0);
            this.aClass549_5652.method6564(false, 1784701829);
            this.aClass549_5652.method6622(-692471739 * client.anInt11025, 1825216941);
            this.aClass549_5652.method6621(this.aHashMap5651, 1563036098);
            if(-692471739 * client.anInt11025 != 0) {
               this.aClass549_5652.method6563(Class47.aClass163_643, (byte)6);
            } else {
               this.aClass549_5652.method6563((Class163)null, (byte)-62);
            }

            this.aClass516_5670 = new Class516();
            this.aFloat5671 = -0.05F + (float)(Math.random() / 10.0D);
            this.aClass465_Sub1_5656 = new Class465_Sub1(this.aClass549_5652, this.aClass40_Sub8_5672, 4, this.mapWidth * -734235429, -1790811353 * this.mapLength, false, this.aClass470_5665, this.aClass623_5664);
            this.aClass465_Sub1_5656.method5506((byte)84);
            this.aClass465_Sub1_5656.anInt5238 = Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) * -616868277;
            this.aClass465_Sub1_5656.aBool5239 = Class230.preferences.aClass711_Sub16_10634.method9997((byte)3) == 2;
            this.aClass465_Sub1_5656.aBool5233 = Class230.preferences.aClass711_Sub9_10618.method9924(1583628776) == 1;
            this.aClass465_Sub1_5656.aBool5274 = Class230.preferences.aClass711_Sub31_10635.method10119(2023872689) == 1;
            this.aClass465_Sub1_5656.aBool5242 = Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1;
            if(!this.aClass502_5693.method6022((byte)15)) {
               this.method6090(this.aClass465_Sub1_5656, this.aByteArrayArray5685, (byte)1);
            } else {
               this.method6091(this.aClass465_Sub1_5656, this.aByteArrayArray5685, -1381690257);
            }

            if(this.aBool5659) {
               this.method6117(50, -1825193188);
            }

            this.aClass623_5664.method7385(-734235429 * this.mapWidth >> 4, -1790811353 * this.mapLength >> 4, -574454667);
            this.aClass623_5664.method7362(this, -2027793996);
            if(var21) {
               this.aClass549_5652.method6564(true, 1610583069);
               this.aClass465_Sub1_5655 = new Class465_Sub1(this.aClass549_5652, this.aClass40_Sub8_5672, 1, -734235429 * this.mapWidth, -1790811353 * this.mapLength, true, this.aClass470_5665, this.aClass623_5664);
               this.aClass465_Sub1_5655.method5506((byte)113);
               this.aClass465_Sub1_5655.anInt5238 = Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) * -616868277;
               this.aClass465_Sub1_5655.aBool5239 = Class230.preferences.aClass711_Sub16_10634.method9997((byte)3) == 2;
               this.aClass465_Sub1_5655.aBool5233 = Class230.preferences.aClass711_Sub9_10618.method9924(1619138670) == 1;
               this.aClass465_Sub1_5655.aBool5274 = Class230.preferences.aClass711_Sub31_10635.method10119(1212547047) == 1;
               this.aClass465_Sub1_5655.aBool5242 = Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1;
               if(!this.aClass502_5693.method6022((byte)22)) {
                  this.method6090(this.aClass465_Sub1_5655, this.aByteArrayArray5688, (byte)1);
                  if(!this.aBool5659) {
                     Class199_Sub23.method9038(true, -282427811);
                  }
               } else {
                  this.method6091(this.aClass465_Sub1_5655, this.aByteArrayArray5688, -1170289572);
                  if(!this.aBool5659) {
                     Class199_Sub23.method9038(true, -185251449);
                  }
               }

               this.aClass465_Sub1_5655.method5500(0, this.aClass465_Sub1_5656.anIntArrayArrayArray5312[0], (byte)0);
               this.aClass465_Sub1_5655.method5501(Class554.aClass174_7475, (int[][][])null, 1262209940);
               this.aClass549_5652.method6564(false, -1466367911);
               if(this.aBool5659) {
                  this.method6117(50, -1584025176);
               }
            }

            this.aClass465_Sub1_5656.method5501(Class554.aClass174_7475, var21?this.aClass465_Sub1_5655.anIntArrayArrayArray5312:(int[][][])null, 1262209940);
            if(!this.aClass502_5693.method6022((byte)65)) {
               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, -287259531);
               }

               this.method6092(this.aClass465_Sub1_5656, this.aByteArrayArray5686, -1539369160);
               if(null != this.aByteArrayArray5687) {
                  this.method6079((byte)28);
               }
            } else {
               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, -1213738173);
               }

               this.method6083(this.aClass465_Sub1_5656, this.aByteArrayArray5686, -1957887669);
            }

            if(!this.aBool5659) {
               Class199_Sub23.method9038(true, 1808382015);
            }

            this.aClass465_Sub1_5656.method5516(Class554.aClass174_7475, var21?this.aClass549_5652.aClass148Array7292[0]:null, (Class148)null, 1565026061);
            if(this.aBool5659) {
               this.method6117(75, -2008106960);
            }

            this.aClass465_Sub1_5656.method9276(Class554.aClass174_7475, false, 986534229);
            if(this.aBool5659) {
               this.method6117(75, 801924176);
            }

            if(!this.aBool5659) {
               Class199_Sub23.method9038(true, -1292029318);
            }

            if(var21) {
               this.aClass549_5652.method6564(true, 1406694697);
               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, 262124069);
               }

               if(!this.aClass502_5693.method6022((byte)55)) {
                  this.method6092(this.aClass465_Sub1_5655, this.aByteArrayArray5657, 1738965810);
               } else {
                  this.method6083(this.aClass465_Sub1_5655, this.aByteArrayArray5657, -1957887669);
               }

               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, -1567228496);
               }

               this.aClass465_Sub1_5655.method5516(Class554.aClass174_7475, (Class148)null, this.aClass549_5652.aClass148Array7290[0], 1863153278);
               this.aClass465_Sub1_5655.method9276(Class554.aClass174_7475, true, 986534229);
               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, -1122575278);
               }

               this.aClass549_5652.method6564(false, -1783999752);
               if(this.aBool5659) {
                  this.method6117(50, -915362762);
               }
            }

            this.aClass465_Sub1_5656.method5509((byte)0);
            if(null != this.aClass465_Sub1_5655) {
               this.aClass465_Sub1_5655.method5509((byte)0);
            }

            this.aClass549_5652.method6567(2042194475);
            if(this.aBool5659) {
               Class255.time((byte)24);

               while(!Class554.aClass174_7475.method2324((byte)-21)) {
                  this.method6117(1, 1743914795);
               }
            }

            boolean var24 = false;
            if(this.aBool5659) {
               GameMap var26 = client.aClass505_11204;
               this.method6077(var26, -1504018329);
               Class297.aClass517_3235.method6219(var26, 523101507);
               var24 = true;
               Class255.time((byte)24);
               Object var25 = client.anObject11223;
               synchronized(var25) {
                  client.aBool11066 = true;

                  try {
                     client.anObject11223.wait();
                  } catch (InterruptedException var18) {
                     ;
                  }
               }

               client.aClass505_11204 = this;
               var26.method6087(539981522);
               this.method6086(10, (byte)4);
               this.method6084(-1394006457);
            } else {
               Class570.aClass231_7657.method3190((byte)-103);
               this.aClass623_5664.method7381((byte)112);
               Class229.method3179(2119164506);
            }

            int var10;
            for(var8 = 0; var8 < 4; ++var8) {
               for(var9 = 0; var9 < -734235429 * this.mapWidth; ++var9) {
                  for(var10 = 0; var10 < this.mapLength * -1790811353; ++var10) {
                     Class646.method7691(var8, var9, var10, 366981887);
                  }
               }
            }

            for(var8 = 0; var8 < client.aClass536Array11019.length; ++var8) {
               if(client.aClass536Array11019[var8] != null) {
                  client.aClass536Array11019[var8].method6408(706031571);
               }
            }

            Class199_Sub18.method9026((byte)1);
            Class710.method8308((byte)1);
            if(Class585.method6988((byte)30) == Class504.aClass504_5648 && client.aClass111_11060.method1364(-1184311292) != null && 10 == client.anInt11038 * -558705405) {
               OutFrameBuffer var29 = Class115.method1414(OutFrame.aClass405_4285, client.aClass111_11060.aClass14_1342, 1484524531);
               var29.out.writeInt(1057001181, -357564953);
               client.aClass111_11060.write(var29, (byte)68);
            }

            if(!this.aClass502_5693.method6022((byte)96)) {
               var8 = (-1649731861 * this.anInt5675 - (-734235429 * this.mapWidth >> 4)) / 8;
               var9 = ((this.mapWidth * -734235429 >> 4) + -1649731861 * this.anInt5675) / 8;
               var10 = (607535919 * this.anInt5660 - (-1790811353 * this.mapLength >> 4)) / 8;
               int var11 = ((-1790811353 * this.mapLength >> 4) + this.anInt5660 * 607535919) / 8;

               for(int var12 = var8 - 1; var12 <= var9 + 1; ++var12) {
                  for(int var13 = var10 - 1; var13 <= 1 + var11; ++var13) {
                     if(var12 < var8 || var12 > var9 || var13 < var10 || var13 > var11) {
                        Class380_Sub3_Sub1.maps.method5534(this.method6082(var12, var13, -892475015), 2011323686);
                     }
                  }
               }
            }

            long var14 = Class255.time((byte)24) - -808407276727046841L * this.aLong5674;
            if(client.anInt11038 * -558705405 == 7) {
               Class593.method7031(16, (byte)125);
            } else if(14 == -558705405 * client.anInt11038) {
               Class593.method7031(0, (byte)113);
            } else if(6 == -558705405 * client.anInt11038) {
               Class593.method7031(8, (byte)56);
            } else if(client.anInt11038 * -558705405 == 5) {
               Class593.method7031(11, (byte)107);
            } else {
               Class593.method7031(9, (byte)11);
               if(client.aClass111_11060.method1364(-1184311292) != null) {
                  OutFrameBuffer var27 = Class115.method1414(OutFrame.aClass405_4239, client.aClass111_11060.aClass14_1342, 1895294959);
                  var27.out.writeInt((int)var14, -357564953);
                  client.aClass111_11060.write(var27, (byte)32);
               }
            }

            if(this.aBool5691) {
               Class27.method722(Long.toString(Class255.time((byte)24) - this.aLong5692 * -3308752273515262715L), -315839031);
               this.aBool5691 = false;
            }

            if(var24) {
               Object var28 = client.anObject11067;
               synchronized(var28) {
                  client.anObject11067.notify();
               }
            }

            return true;
         }
      }
   }

   void method6090(Class465_Sub1 var1, byte[][] var2, byte var3) {
      int var4 = var2.length;

      int var5;
      for(var5 = 0; var5 < var4; ++var5) {
         byte[] var6 = var2[var5];
         if(null != var6) {
            RSByteBuffer var7 = new RSByteBuffer(var6);
            int var8 = this.regionIds[var5] >> 8;
            int var9 = this.regionIds[var5] & 255;
            int var10 = var8 * 64 - -814686591 * this.aClass596_5667.localX;
            int var11 = var9 * 64 - -845789331 * this.aClass596_5667.localY;
            if(!this.aBool5659 && null != Class570.aClass231_7657) {
               Class570.aClass231_7657.method3190((byte)-41);
            }

            var1.method5497(var7, var10, var11, -814686591 * this.aClass596_5667.localX, -845789331 * this.aClass596_5667.localY, -1993989779);
            var1.method9269(Class554.aClass174_7475, var7, var10, var11, -385386001);
         }
      }

      for(var5 = 0; var5 < var4; ++var5) {
         int var12 = (this.regionIds[var5] >> 8) * 64 - -814686591 * this.aClass596_5667.localX;
         int var13 = 64 * (this.regionIds[var5] & 255) - this.aClass596_5667.localY * -845789331;
         byte[] var14 = var2[var5];
         if(null == var14 && this.anInt5660 * 607535919 < 800) {
            if(!this.aBool5659 && Class570.aClass231_7657 != null) {
               Class570.aClass231_7657.method3190((byte)-47);
            }

            var1.method5495(var12, var13, 64, 64, (byte)23);
         }
      }

   }

   void method6091(Class465_Sub1 var1, byte[][] var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      for(var4 = 0; var4 < -1917803745 * var1.anInt5269; ++var4) {
         if(!this.aBool5659) {
            Class570.aClass231_7657.method3190((byte)-120);
         }

         for(var5 = 0; var5 < -734235429 * this.mapWidth >> 3; ++var5) {
            for(var6 = 0; var6 < -1790811353 * this.mapLength >> 3; ++var6) {
               var7 = this.anIntArrayArrayArray5690[var4][var5][var6];
               if(-1 != var7) {
                  int var8 = var7 >> 24 & 3;
                  if(!var1.aBool5246 || 0 == var8) {
                     int var9 = var7 >> 1 & 3;
                     int var10 = var7 >> 14 & 1023;
                     int var11 = var7 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     for(int var13 = 0; var13 < this.regionIds.length; ++var13) {
                        if(var12 == this.regionIds[var13] && null != var2[var13]) {
                           RSByteBuffer var14 = new RSByteBuffer(var2[var13]);
                           var1.method5498(var14, var4, 8 * var5, 8 * var6, var8, var10, var11, var9, 2007391436);
                           var1.method9270(Class554.aClass174_7475, var14, var4, var5 * 8, 8 * var6, var8, var10, var11, var9, -2117890789);
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      for(var4 = 0; var4 < var1.anInt5269 * -1917803745; ++var4) {
         if(!this.aBool5659) {
            Class570.aClass231_7657.method3190((byte)-20);
         }

         for(var5 = 0; var5 < -734235429 * this.mapWidth >> 3; ++var5) {
            for(var6 = 0; var6 < -1790811353 * this.mapLength >> 3; ++var6) {
               var7 = this.anIntArrayArrayArray5690[var4][var5][var6];
               if(-1 == var7) {
                  var1.method5496(var4, var5 * 8, 8 * var6, 8, 8, 1446774848);
               }
            }
         }
      }

   }

   void method6092(Class465_Sub1 var1, byte[][] var2, int var3) {
      for(int var4 = 0; var4 < this.regionCount * -1103843083; ++var4) {
         byte[] var5 = var2[var4];
         if(var5 != null) {
            int var6 = 64 * (this.regionIds[var4] >> 8) - this.aClass596_5667.localX * -814686591;
            int var7 = (this.regionIds[var4] & 255) * 64 - this.aClass596_5667.localY * -845789331;
            if(!this.aBool5659) {
               Class570.aClass231_7657.method3190((byte)-35);
            }

            var1.method9278(Class554.aClass174_7475, var5, var6, var7, (byte)98);
            if(this.aBool5659) {
               this.method6117(10, 697891891);
            }
         }
      }

   }

   public void method6093(int var1) {
      this.anInt5666 = 423210488;
      if(-734235429 * this.mapWidth == 0) {
         this.anInt5681 = 1598746422;
      } else {
         this.anInt5681 = -515673379 * (int)((double)(-734235429 * this.mapWidth) * 34.46D);
      }

      this.anInt5681 = (1925969269 * this.anInt5681 << 2) * -515673379;
      if(Class554.aClass174_7475.method2244()) {
         this.anInt5681 += -2031764992;
      }

   }

   public Class470 method6094(byte var1) {
      return this.aClass470_5665;
   }

   public int method6095() {
      return 100 - this.anInt5661 * 1966350116 / (1698742955 * this.anInt5678);
   }

   public void method6096() {
      this.aClass515_5676 = Class515.aClass515_7028;
      this.anInt5661 = 0;
      this.anInt5678 = 226043907;
      this.anInt5679 = 0;
      this.anInt5680 = -55046317;
      this.anInt5694 = 0;
   }

   public int method6097() {
      return 100 - 2141344644 * this.anInt5679 / (394333403 * this.anInt5680);
   }

   public int method6098() {
      return 100 - 2141344644 * this.anInt5679 / (394333403 * this.anInt5680);
   }

   void method6099(Buffer buffer, short var2) {
      int centerX = buffer.readUnsignedShort(1798837150);
      int size = buffer.readUnsignedByte(1439342522);
      int count = buffer.readUnsignedByte(-1508333174);
      boolean force = buffer.readUnsigned128Byte((byte)-96) == 1;
      this.renderDistance = buffer.readByteC((byte)8) * 2068706387;
      int centerY = buffer.readUnsignedShort128((short)7884);
      if(!this.aBool5659) {
         this.method6084(-1554934311);
      }

      this.method6081(Class540.valueOf(size, -1268603121), -1503306677);
      this.regionIds = new int[count];
      this.mapIds = new int[count];
      this.aByteArrayArray5685 = new byte[count][];
      this.aByteArrayArray5686 = new byte[count][];
      this.aByteArrayArray5687 = (byte[][])null;
      this.aByteArrayArray5688 = new byte[count][];
      this.aByteArrayArray5657 = new byte[count][];
      count = 0;

      for(int var8 = (centerX - (this.mapWidth * -734235429 >> 4)) / 8; var8 <= ((-734235429 * this.mapWidth >> 4) + centerX) / 8; ++var8) {
         for(int var9 = (centerY - (-1790811353 * this.mapLength >> 4)) / 8; var9 <= (centerY + (-1790811353 * this.mapLength >> 4)) / 8; ++var9) {
            if(Class380_Sub3_Sub1.maps.validChild(this.method6082(var8, var9, -892475015), -1751036255 * Class461.aClass461_5194.anInt5203, (byte)0)) {
               this.regionIds[count] = var9 + (var8 << 8);
               this.mapIds[count] = this.method6082(var8, var9, -892475015);
               ++count;
            }
         }
      }

      this.regionCount = count * 1086225245;
      this.updateMapArea(centerX, centerY, 10, force, (byte)45);
   }

   public Class623 method6100(byte var1) {
      return this.aClass623_5664;
   }

   public Class515 method6101(int var1) {
      return this.aClass515_5676;
   }

   public int method6102() {
      return this.anInt5681 * 1925969269;
   }

   public int method6103() {
      return this.mapLength * -1790811353;
   }

   public void method6104(byte var1) {
      this.aClass623_5664.method7364(this, (Class637)null, 0, (byte)-47);
   }

   public int method6105() {
      return this.mapWidth * -734235429;
   }

   public Class516 method6106(byte var1) {
      return this.aClass516_5670;
   }

   public int method6107(int var1) {
      return this.anInt5666 * 533540903;
   }

   public void method6108() {
      if(null != this.aClass549_5652) {
         Class519.method6242((byte)58);
         this.aHashMap5651 = this.aClass549_5652.method6623((byte)1);
         this.aClass549_5652.aClass559_7318.method6718((byte)-15);
         this.aClass549_5652 = null;
      }

   }

   public void method6109() {
      if(null != this.aClass549_5652) {
         Class519.method6242((byte)23);
         this.aHashMap5651 = this.aClass549_5652.method6623((byte)1);
         this.aClass549_5652.aClass559_7318.method6718((byte)39);
         this.aClass549_5652 = null;
      }

   }

   public void method6110() {
      if(null != this.aClass549_5652) {
         Class519.method6242((byte)53);
         this.aHashMap5651 = this.aClass549_5652.method6623((byte)1);
         this.aClass549_5652.aClass559_7318.method6718((byte)-79);
         this.aClass549_5652 = null;
      }

   }

   public boolean method6111() {
      if(!this.aBool5659) {
         Class199_Sub23.method9038(false, -1046243989);
      }

      if(-1L == -808407276727046841L * this.aLong5674) {
         this.aLong5674 = Class255.time((byte)24) * 6084225111100206199L;
      }

      this.anInt5661 = 0;

      int var1;
      for(var1 = 0; var1 < this.regionCount * -1103843083; ++var1) {
         if(!Class380_Sub3_Sub1.maps.method5538(this.mapIds[var1], (byte)41)) {
            this.anInt5661 += -1550582319;
         }
      }

      if(this.aClass519_5669 == null) {
         if(this.aClass526_Sub21_Sub17_5668 != null && client.aClass466_11041.method5548(this.aClass526_Sub21_Sub17_5668.aString11837, 780710299)) {
            if(!client.aClass466_11041.method5552(this.aClass526_Sub21_Sub17_5668.aString11837, (byte)-18)) {
               this.anInt5661 += -1550582319;
            } else {
               this.aClass519_5669 = Class460.method5460(client.aClass466_11041, this.aClass526_Sub21_Sub17_5668.aString11837, client.aBool11230, 996357002);
            }
         } else {
            this.aClass519_5669 = new Class519(0);
         }
      }

      if(this.anInt5661 * -1956021455 > 0) {
         if(this.anInt5678 * 1698742955 < this.anInt5661 * -1956021455) {
            this.anInt5678 = -727377517 * this.anInt5661;
         }

         this.aClass515_5676 = Class515.aClass515_7031;
         return false;
      } else {
         for(var1 = 0; var1 < -1103843083 * this.regionCount; ++var1) {
            if(null == this.aByteArrayArray5685[var1]) {
               this.aByteArrayArray5685[var1] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var1], -1751036255 * Class461.aClass461_5194.anInt5203, (byte)5);
            }

            if(this.aByteArrayArray5686[var1] == null) {
               this.aByteArrayArray5686[var1] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var1], -1751036255 * Class461.aClass461_5197.anInt5203, (byte)36);
            }

            if(this.aByteArrayArray5688[var1] == null) {
               this.aByteArrayArray5688[var1] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var1], Class461.aClass461_5198.anInt5203 * -1751036255, (byte)-48);
            }

            if(null == this.aByteArrayArray5657[var1]) {
               this.aByteArrayArray5657[var1] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var1], Class461.aClass461_5195.anInt5203 * -1751036255, (byte)-82);
            }

            if(null != this.aByteArrayArray5687 && null == this.aByteArrayArray5687[var1]) {
               this.aByteArrayArray5687[var1] = Class380_Sub3_Sub1.maps.method5536(this.mapIds[var1], -1751036255 * Class461.aClass461_5196.anInt5203, (byte)30);
            }
         }

         var1 = this.anInt5679 * 493859849;
         Class652 var2 = new Class652(-1);
         Class652 var3 = new Class652(-1);
         this.anInt5679 = 0;

         int var4;
         int var7;
         int var8;
         for(var4 = 0; var4 < this.regionCount * -1103843083; ++var4) {
            byte[] var5 = this.aByteArrayArray5686[var4];
            int var6;
            if(null != var5) {
               var6 = (this.regionIds[var4] >> 8) * 64 - this.aClass596_5667.localX * -814686591;
               var7 = (this.regionIds[var4] & 255) * 64 - this.aClass596_5667.localY * -845789331;
               if(this.aClass502_5693.method6022((byte)116)) {
                  var6 = 10;
                  var7 = 10;
               }

               var8 = Class640.method7637(this.aClass40_Sub8_5672, var5, var6, var7, -734235429 * this.mapWidth, this.mapLength * -1790811353, var3, var2, 2099341063);
               if(var8 > 0) {
                  this.anInt5679 += -1323820487 * var8;
               }
            }

            var5 = this.aByteArrayArray5657[var4];
            if(null != var5) {
               var6 = (this.regionIds[var4] >> 8) * 64 - -814686591 * this.aClass596_5667.localX;
               var7 = (this.regionIds[var4] & 255) * 64 - -845789331 * this.aClass596_5667.localY;
               if(this.aClass502_5693.method6022((byte)65)) {
                  var6 = 10;
                  var7 = 10;
               }

               var8 = Class640.method7637(this.aClass40_Sub8_5672, var5, var6, var7, this.mapWidth * -734235429, this.mapLength * -1790811353, var3, var2, 1875739115);
               if(var8 > 0) {
                  this.anInt5679 += -1323820487 * var8;
               }
            }
         }

         if(this.anInt5679 * 493859849 > 0) {
            if(var1 == this.anInt5679 * 493859849) {
               if(0 != this.anInt5694 * -814525561 && client.anInt11012 - this.anInt5694 * -814525561 == 1000) {
                  Class247.method3398(var3.anInt8464 * -618316129, var2.anInt8464 * -618316129, this.anInt5679 * 493859849, -1456754069);
                  Class296.method3966((byte)-18);
               }
            } else {
               this.anInt5694 = client.anInt11012 * 1147011639;
            }

            if(394333403 * this.anInt5680 < 493859849 * this.anInt5679) {
               this.anInt5680 = this.anInt5679 * 1497097707;
            }

            this.aClass515_5676 = Class515.aClass515_7030;
            return false;
         } else {
            if(!this.aBool5659 && this.aClass515_5676 != Class515.aClass515_7028) {
               Class52.method965(Class45.aClass45_560.method920(Class26.aClass673_247, -827840379) + Class64.aString742 + "(100%)", true, Class554.aClass174_7475, Class422.aClass163_4740, Class199_Sub3.aClass1_9887, (byte)-61);
            }

            this.aClass515_5676 = Class515.aClass515_7029;
            if(!this.aBool5659 && Class570.aClass231_7657 != null) {
               Class570.aClass231_7657.method3190((byte)-78);
            }

            if(!this.aBool5659) {
               for(var4 = 0; var4 < 2048; ++var4) {
                  Class639_Sub1_Sub2_Sub1_Sub1 var19 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var4];
                  if(var19 != null) {
                     var19.aClass549_10826 = null;
                  }
               }

               for(var4 = 0; var4 < client.aClass526_Sub7Array11050.length; ++var4) {
                  LinkableObject var21 = client.aClass526_Sub7Array11050[var4];
                  if(null != var21) {
                     ((Class639_Sub1)var21.anObject10399).aClass549_10826 = null;
                  }
               }
            }

            if(!this.aBool5659) {
               Class571.method6896(true, -491958625);
            }

            boolean var20 = false;
            int var22;
            if(Class230.preferences.aClass711_Sub16_10634.method9997((byte)3) == 2) {
               for(var22 = 0; var22 < -1103843083 * this.regionCount; ++var22) {
                  if(null != this.aByteArrayArray5657[var22] || this.aByteArrayArray5688[var22] != null) {
                     var20 = true;
                     break;
                  }
               }
            }

            var22 = Class101.method1286(Class230.preferences.aClass711_Sub22_10615.method10054((byte)67), 1986477658).anInt3256 * -382698840;
            if(Class554.aClass174_7475.method2244()) {
               ++var22;
            }

            this.method6093(-1537310188);
            this.method6087(400549034);
            this.aClass549_5652 = new Class549(Class554.aClass174_7475, 9, 4, -734235429 * this.mapWidth, this.mapLength * -1790811353, var22, var20, Class554.aClass174_7475.method2334() > 0);
            this.aClass549_5652.method6564(false, 1704806873);
            this.aClass549_5652.method6622(-692471739 * client.anInt11025, 1825216941);
            this.aClass549_5652.method6621(this.aHashMap5651, 1563036098);
            if(-692471739 * client.anInt11025 != 0) {
               this.aClass549_5652.method6563(Class47.aClass163_643, (byte)-1);
            } else {
               this.aClass549_5652.method6563((Class163)null, (byte)-83);
            }

            this.aClass516_5670 = new Class516();
            this.aFloat5671 = -0.05F + (float)(Math.random() / 10.0D);
            this.aClass465_Sub1_5656 = new Class465_Sub1(this.aClass549_5652, this.aClass40_Sub8_5672, 4, this.mapWidth * -734235429, -1790811353 * this.mapLength, false, this.aClass470_5665, this.aClass623_5664);
            this.aClass465_Sub1_5656.method5506((byte)104);
            this.aClass465_Sub1_5656.anInt5238 = Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) * -616868277;
            this.aClass465_Sub1_5656.aBool5239 = Class230.preferences.aClass711_Sub16_10634.method9997((byte)3) == 2;
            this.aClass465_Sub1_5656.aBool5233 = Class230.preferences.aClass711_Sub9_10618.method9924(1395335928) == 1;
            this.aClass465_Sub1_5656.aBool5274 = Class230.preferences.aClass711_Sub31_10635.method10119(640551033) == 1;
            this.aClass465_Sub1_5656.aBool5242 = Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1;
            if(!this.aClass502_5693.method6022((byte)14)) {
               this.method6090(this.aClass465_Sub1_5656, this.aByteArrayArray5685, (byte)1);
            } else {
               this.method6091(this.aClass465_Sub1_5656, this.aByteArrayArray5685, 702029776);
            }

            if(this.aBool5659) {
               this.method6117(50, 1668743064);
            }

            this.aClass623_5664.method7385(-734235429 * this.mapWidth >> 4, -1790811353 * this.mapLength >> 4, -1964517903);
            this.aClass623_5664.method7362(this, 182112304);
            if(var20) {
               this.aClass549_5652.method6564(true, -1029565633);
               this.aClass465_Sub1_5655 = new Class465_Sub1(this.aClass549_5652, this.aClass40_Sub8_5672, 1, -734235429 * this.mapWidth, -1790811353 * this.mapLength, true, this.aClass470_5665, this.aClass623_5664);
               this.aClass465_Sub1_5655.method5506((byte)92);
               this.aClass465_Sub1_5655.anInt5238 = Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) * -616868277;
               this.aClass465_Sub1_5655.aBool5239 = Class230.preferences.aClass711_Sub16_10634.method9997((byte)3) == 2;
               this.aClass465_Sub1_5655.aBool5233 = Class230.preferences.aClass711_Sub9_10618.method9924(1210528789) == 1;
               this.aClass465_Sub1_5655.aBool5274 = Class230.preferences.aClass711_Sub31_10635.method10119(1440706425) == 1;
               this.aClass465_Sub1_5655.aBool5242 = Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1;
               if(!this.aClass502_5693.method6022((byte)31)) {
                  this.method6090(this.aClass465_Sub1_5655, this.aByteArrayArray5688, (byte)1);
                  if(!this.aBool5659) {
                     Class199_Sub23.method9038(true, -1050668797);
                  }
               } else {
                  this.method6091(this.aClass465_Sub1_5655, this.aByteArrayArray5688, -700003591);
                  if(!this.aBool5659) {
                     Class199_Sub23.method9038(true, 977434522);
                  }
               }

               this.aClass465_Sub1_5655.method5500(0, this.aClass465_Sub1_5656.anIntArrayArrayArray5312[0], (byte)0);
               this.aClass465_Sub1_5655.method5501(Class554.aClass174_7475, (int[][][])null, 1262209940);
               this.aClass549_5652.method6564(false, -256702757);
               if(this.aBool5659) {
                  this.method6117(50, 1537165548);
               }
            }

            this.aClass465_Sub1_5656.method5501(Class554.aClass174_7475, var20?this.aClass465_Sub1_5655.anIntArrayArrayArray5312:(int[][][])null, 1262209940);
            if(!this.aClass502_5693.method6022((byte)11)) {
               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, -849243218);
               }

               this.method6092(this.aClass465_Sub1_5656, this.aByteArrayArray5686, -1897696056);
               if(null != this.aByteArrayArray5687) {
                  this.method6079((byte)89);
               }
            } else {
               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, 1414466636);
               }

               this.method6083(this.aClass465_Sub1_5656, this.aByteArrayArray5686, -1957887669);
            }

            if(!this.aBool5659) {
               Class199_Sub23.method9038(true, 594427840);
            }

            this.aClass465_Sub1_5656.method5516(Class554.aClass174_7475, var20?this.aClass549_5652.aClass148Array7292[0]:null, (Class148)null, 2050937993);
            if(this.aBool5659) {
               this.method6117(75, 1446388242);
            }

            this.aClass465_Sub1_5656.method9276(Class554.aClass174_7475, false, 986534229);
            if(this.aBool5659) {
               this.method6117(75, 1903960483);
            }

            if(!this.aBool5659) {
               Class199_Sub23.method9038(true, 18623801);
            }

            if(var20) {
               this.aClass549_5652.method6564(true, -1034899149);
               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, -163494291);
               }

               if(!this.aClass502_5693.method6022((byte)99)) {
                  this.method6092(this.aClass465_Sub1_5655, this.aByteArrayArray5657, 964176205);
               } else {
                  this.method6083(this.aClass465_Sub1_5655, this.aByteArrayArray5657, -1957887669);
               }

               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, 1489195909);
               }

               this.aClass465_Sub1_5655.method5516(Class554.aClass174_7475, (Class148)null, this.aClass549_5652.aClass148Array7290[0], 1716812524);
               this.aClass465_Sub1_5655.method9276(Class554.aClass174_7475, true, 986534229);
               if(!this.aBool5659) {
                  Class199_Sub23.method9038(true, -354108234);
               }

               this.aClass549_5652.method6564(false, -2014458962);
               if(this.aBool5659) {
                  this.method6117(50, 775801436);
               }
            }

            this.aClass465_Sub1_5656.method5509((byte)0);
            if(null != this.aClass465_Sub1_5655) {
               this.aClass465_Sub1_5655.method5509((byte)0);
            }

            this.aClass549_5652.method6567(2028771627);
            if(this.aBool5659) {
               Class255.time((byte)24);

               while(!Class554.aClass174_7475.method2324((byte)9)) {
                  this.method6117(1, -1416437812);
               }
            }

            boolean var23 = false;
            if(this.aBool5659) {
               GameMap var25 = client.aClass505_11204;
               this.method6077(var25, -650192971);
               Class297.aClass517_3235.method6219(var25, 1694613267);
               var23 = true;
               Class255.time((byte)24);
               Object var24 = client.anObject11223;
               synchronized(var24) {
                  client.aBool11066 = true;

                  try {
                     client.anObject11223.wait();
                  } catch (InterruptedException var17) {
                     ;
                  }
               }

               client.aClass505_11204 = this;
               var25.method6087(-429209698);
               this.method6086(10, (byte)57);
               this.method6084(-1664554973);
            } else {
               Class570.aClass231_7657.method3190((byte)-38);
               this.aClass623_5664.method7381((byte)99);
               Class229.method3179(1809675312);
            }

            int var9;
            for(var7 = 0; var7 < 4; ++var7) {
               for(var8 = 0; var8 < -734235429 * this.mapWidth; ++var8) {
                  for(var9 = 0; var9 < this.mapLength * -1790811353; ++var9) {
                     Class646.method7691(var7, var8, var9, -1397463119);
                  }
               }
            }

            for(var7 = 0; var7 < client.aClass536Array11019.length; ++var7) {
               if(client.aClass536Array11019[var7] != null) {
                  client.aClass536Array11019[var7].method6408(-1198964437);
               }
            }

            Class199_Sub18.method9026((byte)55);
            Class710.method8308((byte)1);
            if(Class585.method6988((byte)-55) == Class504.aClass504_5648 && client.aClass111_11060.method1364(-1184311292) != null && 10 == client.anInt11038 * -558705405) {
               OutFrameBuffer var28 = Class115.method1414(OutFrame.aClass405_4285, client.aClass111_11060.aClass14_1342, -1182378152);
               var28.out.writeInt(1057001181, -357564953);
               client.aClass111_11060.write(var28, (byte)-95);
            }

            if(!this.aClass502_5693.method6022((byte)122)) {
               var7 = (-1649731861 * this.anInt5675 - (-734235429 * this.mapWidth >> 4)) / 8;
               var8 = ((this.mapWidth * -734235429 >> 4) + -1649731861 * this.anInt5675) / 8;
               var9 = (607535919 * this.anInt5660 - (-1790811353 * this.mapLength >> 4)) / 8;
               int var10 = ((-1790811353 * this.mapLength >> 4) + this.anInt5660 * 607535919) / 8;

               for(int var11 = var7 - 1; var11 <= var8 + 1; ++var11) {
                  for(int var12 = var9 - 1; var12 <= 1 + var10; ++var12) {
                     if(var11 < var7 || var11 > var8 || var12 < var9 || var12 > var10) {
                        Class380_Sub3_Sub1.maps.method5534(this.method6082(var11, var12, -892475015), -2016512091);
                     }
                  }
               }
            }

            long var13 = Class255.time((byte)24) - -808407276727046841L * this.aLong5674;
            if(client.anInt11038 * -558705405 == 7) {
               Class593.method7031(16, (byte)69);
            } else if(14 == -558705405 * client.anInt11038) {
               Class593.method7031(0, (byte)67);
            } else if(6 == -558705405 * client.anInt11038) {
               Class593.method7031(8, (byte)58);
            } else if(client.anInt11038 * -558705405 == 5) {
               Class593.method7031(11, (byte)60);
            } else {
               Class593.method7031(9, (byte)66);
               if(client.aClass111_11060.method1364(-1184311292) != null) {
                  OutFrameBuffer var26 = Class115.method1414(OutFrame.aClass405_4239, client.aClass111_11060.aClass14_1342, -1706202592);
                  var26.out.writeInt((int)var13, -357564953);
                  client.aClass111_11060.write(var26, (byte)-29);
               }
            }

            if(this.aBool5691) {
               Class27.method722(Long.toString(Class255.time((byte)24) - this.aLong5692 * -3308752273515262715L), -315839031);
               this.aBool5691 = false;
            }

            if(var23) {
               Object var27 = client.anObject11067;
               synchronized(var27) {
                  client.anObject11067.notify();
               }
            }

            return true;
         }
      }
   }

   void method6112() {
      this.method6081(Class540.valueOf(Class230.preferences.aClass711_Sub12_10613.method9960(-363729149), 851321984), -1503306677);
      int var1 = this.aClass596_5667.localX * -814686591;
      int var2 = this.aClass596_5667.localY * -845789331;
      int var3 = (822351193 * Class439.anInt4866 >> 12) + (var1 >> 3);
      int var4 = (Class210.anInt2259 * 1215159411 >> 12) + (var2 >> 3);
      Class451.localPlayer.aByte10827 = 0;
      Class692.anInt8703 = 0;
      Class451.localPlayer.method10971(8, 8, 1547978218);
      byte var5 = 18;
      this.regionIds = new int[var5];
      this.mapIds = new int[var5];
      this.aByteArrayArray5685 = new byte[var5][];
      this.aByteArrayArray5686 = new byte[var5][];
      this.aByteArrayArray5687 = new byte[var5][];
      this.aByteArrayArray5688 = new byte[var5][];
      this.aByteArrayArray5657 = new byte[var5][];
      int var9 = 0;

      for(int var6 = (var3 - (this.mapWidth * -734235429 >> 4)) / 8; var6 <= ((-734235429 * this.mapWidth >> 4) + var3) / 8; ++var6) {
         for(int var7 = (var4 - (this.mapLength * -1790811353 >> 4)) / 8; var7 <= ((this.mapLength * -1790811353 >> 4) + var4) / 8; ++var7) {
            int var8 = var7 + (var6 << 8);
            if(Class380_Sub3_Sub1.maps.validChild(this.method6082(var6, var7, -892475015), -1751036255 * Class461.aClass461_5194.anInt5203, (byte)0)) {
               this.regionIds[var9] = var8;
               this.mapIds[var9] = this.method6082(var6, var7, -892475015);
               ++var9;
            }
         }
      }

      this.regionCount = var9 * 1086225245;
      byte var10;
      if(-558705405 * client.anInt11038 == 16) {
         var10 = 7;
      } else if(-558705405 * client.anInt11038 == 8) {
         var10 = 6;
      } else if(0 == client.anInt11038 * -558705405) {
         var10 = 14;
      } else {
         if(-558705405 * client.anInt11038 != 11) {
            throw new RuntimeException("" + -558705405 * client.anInt11038);
         }

         var10 = 5;
      }

      this.updateMapArea(var3, var4, var10, false, (byte)-26);
   }

   public void method6113() {
      this.aClass623_5664.method7364(this, (Class637)null, 0, (byte)-45);
   }

   public void method6114() {
      this.aClass623_5664.method7364(this, (Class637)null, 0, (byte)-78);
   }

   public void method6115() {
      this.anInt5666 = 423210488;
      if(-734235429 * this.mapWidth == 0) {
         this.anInt5681 = 1598746422;
      } else {
         this.anInt5681 = -515673379 * (int)((double)(-734235429 * this.mapWidth) * 34.46D);
      }

      this.anInt5681 = (1925969269 * this.anInt5681 << 2) * -515673379;
      if(Class554.aClass174_7475.method2244()) {
         this.anInt5681 += -2031764992;
      }

   }

   public void method6116() {
      this.anInt5666 = 423210488;
      if(-734235429 * this.mapWidth == 0) {
         this.anInt5681 = 1598746422;
      } else {
         this.anInt5681 = -515673379 * (int)((double)(-734235429 * this.mapWidth) * 34.46D);
      }

      this.anInt5681 = (1925969269 * this.anInt5681 << 2) * -515673379;
      if(Class554.aClass174_7475.method2244()) {
         this.anInt5681 += -2031764992;
      }

   }

   void method6117(int var1, int var2) {
      try {
         Thread.sleep((long)var1);
      } catch (InterruptedException var4) {
         ;
      }

   }

   public void method6118() {
      if(this.aBool5659) {
         this.method6075(-1511946364);
         this.aLong5674 = -6084225111100206199L;
         GameMap var1 = client.aClass505_11204;
         this.regionCount = var1.regionCount * 1;
         this.regionIds = var1.regionIds;
         this.mapIds = var1.mapIds;
         this.aByteArrayArray5685 = var1.aByteArrayArray5685;
         this.aByteArrayArray5686 = var1.aByteArrayArray5686;
         this.aByteArrayArray5687 = var1.aByteArrayArray5687;
         this.aByteArrayArray5688 = var1.aByteArrayArray5688;
         this.aByteArrayArray5657 = var1.aByteArrayArray5657;
         this.aClass470_5665 = var1.aClass470_5665;
         this.aClass623_5664 = var1.aClass623_5664;
         this.anIntArrayArrayArray5690 = var1.anIntArrayArrayArray5690;
         this.anInt5666 = var1.anInt5666 * 1;
         this.anInt5681 = 1 * var1.anInt5681;
         this.aClass526_Sub21_Sub17_5668 = var1.aClass526_Sub21_Sub17_5668;
         this.aClass519_5669 = var1.aClass519_5669;
         this.anIntArrayArray5673 = var1.anIntArrayArray5673;
         this.anIntArrayArray5662 = var1.anIntArrayArray5662;
         this.aByteArrayArrayArray5658 = var1.aByteArrayArrayArray5658;
         this.aClass502_5693 = var1.aClass502_5693;
         this.aClass273_5654 = var1.aClass273_5654;
         this.aClass596_5667 = var1.aClass596_5667;
         this.aClass596_5663 = var1.aClass596_5663;
         this.anInt5675 = var1.anInt5675 * 1;
         this.anInt5660 = var1.anInt5660 * 1;
         this.mapWidth = var1.mapWidth * 1;
         this.mapLength = var1.mapLength * 1;
      } else if(-558705405 * client.anInt11038 == 16) {
         Class593.method7031(7, (byte)119);
      } else if(client.anInt11038 * -558705405 == 0) {
         Class593.method7031(14, (byte)120);
      } else if(client.anInt11038 * -558705405 == 8) {
         Class593.method7031(6, (byte)99);
      } else if(client.anInt11038 * -558705405 == 9) {
         Class593.method7031(10, (byte)45);
      } else if(-558705405 * client.anInt11038 == 11) {
         Class593.method7031(5, (byte)94);
      }

   }

   void method6119() {
      this.method6081(Class540.valueOf(Class230.preferences.aClass711_Sub12_10613.method9960(-607912707), 1550477927), -1503306677);
      int var1 = this.aClass596_5667.localX * -814686591;
      int var2 = this.aClass596_5667.localY * -845789331;
      int var3 = (822351193 * Class439.anInt4866 >> 12) + (var1 >> 3);
      int var4 = (Class210.anInt2259 * 1215159411 >> 12) + (var2 >> 3);
      Class451.localPlayer.aByte10827 = 0;
      Class692.anInt8703 = 0;
      Class451.localPlayer.method10971(8, 8, 1920406417);
      byte var5 = 18;
      this.regionIds = new int[var5];
      this.mapIds = new int[var5];
      this.aByteArrayArray5685 = new byte[var5][];
      this.aByteArrayArray5686 = new byte[var5][];
      this.aByteArrayArray5687 = new byte[var5][];
      this.aByteArrayArray5688 = new byte[var5][];
      this.aByteArrayArray5657 = new byte[var5][];
      int var9 = 0;

      for(int var6 = (var3 - (this.mapWidth * -734235429 >> 4)) / 8; var6 <= ((-734235429 * this.mapWidth >> 4) + var3) / 8; ++var6) {
         for(int var7 = (var4 - (this.mapLength * -1790811353 >> 4)) / 8; var7 <= ((this.mapLength * -1790811353 >> 4) + var4) / 8; ++var7) {
            int var8 = var7 + (var6 << 8);
            if(Class380_Sub3_Sub1.maps.validChild(this.method6082(var6, var7, -892475015), -1751036255 * Class461.aClass461_5194.anInt5203, (byte)0)) {
               this.regionIds[var9] = var8;
               this.mapIds[var9] = this.method6082(var6, var7, -892475015);
               ++var9;
            }
         }
      }

      this.regionCount = var9 * 1086225245;
      byte var10;
      if(-558705405 * client.anInt11038 == 16) {
         var10 = 7;
      } else if(-558705405 * client.anInt11038 == 8) {
         var10 = 6;
      } else if(0 == client.anInt11038 * -558705405) {
         var10 = 14;
      } else {
         if(-558705405 * client.anInt11038 != 11) {
            throw new RuntimeException("" + -558705405 * client.anInt11038);
         }

         var10 = 5;
      }

      this.updateMapArea(var3, var4, var10, false, (byte)-90);
   }

   public GameMap(boolean var1) {
      this.aBool5659 = var1;
   }

   public void method6120(Class509 var1, byte var2) {
      this.aClass502_5693 = var1.aClass502_6977;
      if(this.aClass502_5693 == Class502.aClass502_5637) {
         this.method6129((byte)-46);
      } else if(Class502.STATIC == this.aClass502_5693) {
         this.method6099(var1.aClass526_Sub36_Sub2_6978, (short)14333);
      } else if(Class502.staticMapBuffer == this.aClass502_5693) {
         this.method6060(1321981376);
      } else if(this.aClass502_5693.method6022((byte)27)) {
         this.method6055(var1.aClass526_Sub36_Sub2_6978, 327003137);
      }

   }

   public void method6121(Class40_Sub8 var1, int var2) {
      this.aClass40_Sub8_5672 = var1;
   }

   void method6122(int var1) {
      int var2 = this.aClass596_5667.localX * -814686591 - -814686591 * this.aClass596_5663.localX;
      int var3 = -845789331 * this.aClass596_5667.localY - this.aClass596_5663.localY * -845789331;
      int var4;
      int var7;
      int var14;
      int var16;
      if(10 == var1) {
         for(var4 = 0; var4 < client.anInt11051 * 2027369339; ++var4) {
            LinkableObject var5 = client.aClass526_Sub7Array11050[var4];
            if(null != var5) {
               NPC var6 = (NPC)var5.anObject10399;

               for(var7 = 0; var7 < var6.screenX.length; ++var7) {
                  var6.screenX[var7] -= var2;
                  var6.screenY[var7] -= var3;
               }

               Class446 var22 = Class446.method5305(var6.method7635().aClass446_4816);
               var22.aFloat4917 -= (float)(512 * var2);
               var22.aFloat4919 -= (float)(512 * var3);
               var6.method7632(var22);
               var22.method5278();
            }
         }
      } else {
         boolean var13 = false;
         client.npcCount = 0;
         var14 = 2028582400 * this.mapWidth - 512;
         var16 = this.mapLength * -2067378688 - 512;

         for(var7 = 0; var7 < 2027369339 * client.anInt11051; ++var7) {
            LinkableObject var8 = client.aClass526_Sub7Array11050[var7];
            if(var8 != null) {
               NPC var9 = (NPC)var8.anObject10399;
               Class446 var10 = Class446.method5305(var9.method7635().aClass446_4816);
               var10.aFloat4917 -= (float)(var2 * 512);
               var10.aFloat4919 -= (float)(var3 * 512);
               var9.method7632(var10);
               if((int)var10.aFloat4917 >= 0 && (int)var10.aFloat4917 <= var14 && (int)var10.aFloat4919 >= 0 && (int)var10.aFloat4919 <= var16) {
                  boolean var11 = true;

                  for(int var12 = 0; var12 < var9.screenX.length; ++var12) {
                     var9.screenX[var12] -= var2;
                     var9.screenY[var12] -= var3;
                     if(var9.screenX[var12] < 0 || var9.screenX[var12] >= this.mapWidth * -734235429 || var9.screenY[var12] < 0 || var9.screenY[var12] >= this.mapLength * -1790811353) {
                        var11 = false;
                     }
                  }

                  if(var11) {
                     client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = 828574411 * var9.index;
                  } else {
                     var9.setDefinition((NPCDef)null, -1957887669);
                     var8.method6332(-1949449864);
                     var13 = true;
                  }
               } else {
                  var9.setDefinition((NPCDef)null, -1957887669);
                  var8.method6332(-1949449864);
                  var13 = true;
               }

               var10.method5278();
            }
         }

         if(var13) {
            client.anInt11051 = client.npcs.method636(-143135312) * 253277107;
            var7 = 0;

            LinkableObject var26;
            for(Iterator var24 = client.npcs.iterator(); var24.hasNext(); client.aClass526_Sub7Array11050[var7++] = var26) {
               var26 = (LinkableObject)var24.next();
            }
         }
      }

      for(var4 = 0; var4 < 2048; ++var4) {
         Class639_Sub1_Sub2_Sub1_Sub1 var15 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var4];
         if(var15 != null) {
            for(var16 = 0; var16 < var15.screenX.length; ++var16) {
               var15.screenX[var16] -= var2;
               var15.screenY[var16] -= var3;
            }

            Class446 var20 = Class446.method5305(var15.method7635().aClass446_4816);
            var20.aFloat4917 -= (float)(var2 * 512);
            var20.aFloat4919 -= (float)(var3 * 512);
            var15.method7632(var20);
            var20.method5278();
         }
      }

      Class113[] var17 = client.aClass113Array11018;

      for(var14 = 0; var14 < var17.length; ++var14) {
         Class113 var23 = var17[var14];
         if(null != var23) {
            var23.anInt1363 -= var2 * -95458816;
            var23.anInt1365 -= -1365014016 * var3;
         }
      }

      Class526_Sub1 var18;
      Class610 var19;
      for(var18 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8206((byte)36); var18 != null; var18 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8181(-469000338)) {
         var18.anInt10301 -= var2 * 767842083;
         var18.anInt10298 -= 1139683879 * var3;
         var19 = (Class610)this.aClass40_Sub8_5672.method89(-1915127235 * var18.anInt10305, -363901903);
         if(0 == (var18.anInt10312 * -341852837 & 1)) {
            var16 = -1450399027 * var19.anInt7993;
            var7 = var19.anInt7971 * 182793117;
         } else {
            var16 = 182793117 * var19.anInt7971;
            var7 = var19.anInt7993 * -1450399027;
         }

         if(this.aClass502_5693 != Class502.aClass502_5639 && (var16 + 195793035 * var18.anInt10301 <= 0 || var7 + 64888215 * var18.anInt10298 <= 0 || var18.anInt10301 * 195793035 >= -734235429 * this.mapWidth || 64888215 * var18.anInt10298 >= this.mapLength * -1790811353)) {
            var18.method6332(-1949449864);
         }
      }

      for(var18 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8206((byte)28); null != var18; var18 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8181(368569736)) {
         var18.anInt10301 -= 767842083 * var2;
         var18.anInt10298 -= 1139683879 * var3;
         var19 = (Class610)this.aClass40_Sub8_5672.method89(-1915127235 * var18.anInt10305, 182881553);
         if(0 == (-341852837 * var18.anInt10312 & 1)) {
            var16 = var19.anInt7993 * -1450399027;
            var7 = 182793117 * var19.anInt7971;
         } else {
            var16 = 182793117 * var19.anInt7971;
            var7 = var19.anInt7993 * -1450399027;
         }

         if(Class502.aClass502_5639 != this.aClass502_5693 && (var16 + var18.anInt10301 * 195793035 <= 0 || var7 + 64888215 * var18.anInt10298 <= 0 || var18.anInt10301 * 195793035 >= -734235429 * this.mapWidth || var18.anInt10298 * 64888215 >= -1790811353 * this.mapLength)) {
            var18.method6332(-1949449864);
         }
      }

      for(Class526_Sub20 var21 = (Class526_Sub20)client.aClass20_11259.method638(-831708804); null != var21; var21 = (Class526_Sub20)client.aClass20_11259.method639(2005473828)) {
         var16 = (int)(var21.aLong7156 * -6805155999452426801L >> 28 & 3L);
         var7 = (int)(var21.aLong7156 * -6805155999452426801L & 16383L);
         int var25 = var7 - this.aClass596_5667.localX * -814686591;
         int var27 = (int)(-6805155999452426801L * var21.aLong7156 >> 14 & 16383L);
         int var28 = var27 - this.aClass596_5667.localY * -845789331;
         if(this.aClass549_5652 != null) {
            if(var25 >= 0 && var28 >= 0 && var25 < -734235429 * this.mapWidth && var28 < -1790811353 * this.mapLength && var25 < this.aClass549_5652.anInt7285 * -447634797 && var28 < this.aClass549_5652.anInt7286 * 1913648871) {
               if(this.aClass549_5652.aClass552ArrayArrayArray7287 != null) {
                  this.aClass549_5652.method6587(var16, var25, var28, (byte)-34);
               }
            } else if(Class502.aClass502_5639 != this.aClass502_5693) {
               var21.method6332(-1949449864);
            }
         }
      }

      if(0 != 1653075275 * Class105.anInt1300) {
         Class105.anInt1300 -= -2110507933 * var2;
         Class105.anInt1301 -= -1654212593 * var3;
      }

      Class201.method2878(false, 231999257);
      if(10 == var1) {
         client.anInt11321 -= var2 * 1315062272;
         client.anInt11043 -= var3 * 404092416;
         Class45.anInt639 -= var2 * -488196608;
         Class186.anInt2122 -= var3 * -1062815232;
         if(6 != -265840483 * Class327.anInt3488 && -265840483 * Class327.anInt3488 != 2) {
            Class418.method4974(Class397.method4824((byte)1), (byte)94);
         }
      } else {
         Class583.anInt7782 -= 206279661 * var2;
         Class526_Sub5.anInt10388 -= var3 * -945894401;
         Class289.anInt3117 -= var2 * 199800795;
         Class482.anInt5484 -= -2013496173 * var3;
         Class439.anInt4866 -= -507129344 * var2;
         Class210.anInt2259 -= var3 * -195987968;
         if(Math.abs(var2) > -734235429 * this.mapWidth || Math.abs(var3) > this.mapLength * -1790811353) {
            this.aClass623_5664.method7377((byte)0);
         }
      }

      Class3.method536(-227053614);
      Class613.method7239((byte)103);
      client.aClass20_11160.method647(929030154);
      client.aClass702_11173.method8188(456122277);
      client.aClass686_11103.method8050((short)-12894);
      Class604.method7101((byte)105);
   }

   void method6123(int var1) {
      int var2 = this.aClass596_5667.localX * -814686591 - -814686591 * this.aClass596_5663.localX;
      int var3 = -845789331 * this.aClass596_5667.localY - this.aClass596_5663.localY * -845789331;
      int var4;
      int var7;
      int var14;
      int var16;
      if(10 == var1) {
         for(var4 = 0; var4 < client.anInt11051 * 2027369339; ++var4) {
            LinkableObject var5 = client.aClass526_Sub7Array11050[var4];
            if(null != var5) {
               NPC var6 = (NPC)var5.anObject10399;

               for(var7 = 0; var7 < var6.screenX.length; ++var7) {
                  var6.screenX[var7] -= var2;
                  var6.screenY[var7] -= var3;
               }

               Class446 var22 = Class446.method5305(var6.method7635().aClass446_4816);
               var22.aFloat4917 -= (float)(512 * var2);
               var22.aFloat4919 -= (float)(512 * var3);
               var6.method7632(var22);
               var22.method5278();
            }
         }
      } else {
         boolean var13 = false;
         client.npcCount = 0;
         var14 = 2028582400 * this.mapWidth - 512;
         var16 = this.mapLength * -2067378688 - 512;

         for(var7 = 0; var7 < 2027369339 * client.anInt11051; ++var7) {
            LinkableObject var8 = client.aClass526_Sub7Array11050[var7];
            if(var8 != null) {
               NPC var9 = (NPC)var8.anObject10399;
               Class446 var10 = Class446.method5305(var9.method7635().aClass446_4816);
               var10.aFloat4917 -= (float)(var2 * 512);
               var10.aFloat4919 -= (float)(var3 * 512);
               var9.method7632(var10);
               if((int)var10.aFloat4917 >= 0 && (int)var10.aFloat4917 <= var14 && (int)var10.aFloat4919 >= 0 && (int)var10.aFloat4919 <= var16) {
                  boolean var11 = true;

                  for(int var12 = 0; var12 < var9.screenX.length; ++var12) {
                     var9.screenX[var12] -= var2;
                     var9.screenY[var12] -= var3;
                     if(var9.screenX[var12] < 0 || var9.screenX[var12] >= this.mapWidth * -734235429 || var9.screenY[var12] < 0 || var9.screenY[var12] >= this.mapLength * -1790811353) {
                        var11 = false;
                     }
                  }

                  if(var11) {
                     client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = 828574411 * var9.index;
                  } else {
                     var9.setDefinition((NPCDef)null, -1957887669);
                     var8.method6332(-1949449864);
                     var13 = true;
                  }
               } else {
                  var9.setDefinition((NPCDef)null, -1957887669);
                  var8.method6332(-1949449864);
                  var13 = true;
               }

               var10.method5278();
            }
         }

         if(var13) {
            client.anInt11051 = client.npcs.method636(1154382395) * 253277107;
            var7 = 0;

            LinkableObject var26;
            for(Iterator var24 = client.npcs.iterator(); var24.hasNext(); client.aClass526_Sub7Array11050[var7++] = var26) {
               var26 = (LinkableObject)var24.next();
            }
         }
      }

      for(var4 = 0; var4 < 2048; ++var4) {
         Class639_Sub1_Sub2_Sub1_Sub1 var15 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var4];
         if(var15 != null) {
            for(var16 = 0; var16 < var15.screenX.length; ++var16) {
               var15.screenX[var16] -= var2;
               var15.screenY[var16] -= var3;
            }

            Class446 var20 = Class446.method5305(var15.method7635().aClass446_4816);
            var20.aFloat4917 -= (float)(var2 * 512);
            var20.aFloat4919 -= (float)(var3 * 512);
            var15.method7632(var20);
            var20.method5278();
         }
      }

      Class113[] var17 = client.aClass113Array11018;

      for(var14 = 0; var14 < var17.length; ++var14) {
         Class113 var23 = var17[var14];
         if(null != var23) {
            var23.anInt1363 -= var2 * -95458816;
            var23.anInt1365 -= -1365014016 * var3;
         }
      }

      Class526_Sub1 var18;
      Class610 var19;
      for(var18 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8206((byte)103); var18 != null; var18 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8181(-163685713)) {
         var18.anInt10301 -= var2 * 767842083;
         var18.anInt10298 -= 1139683879 * var3;
         var19 = (Class610)this.aClass40_Sub8_5672.method89(-1915127235 * var18.anInt10305, -1777467823);
         if(0 == (var18.anInt10312 * -341852837 & 1)) {
            var16 = -1450399027 * var19.anInt7993;
            var7 = var19.anInt7971 * 182793117;
         } else {
            var16 = 182793117 * var19.anInt7971;
            var7 = var19.anInt7993 * -1450399027;
         }

         if(this.aClass502_5693 != Class502.aClass502_5639 && (var16 + 195793035 * var18.anInt10301 <= 0 || var7 + 64888215 * var18.anInt10298 <= 0 || var18.anInt10301 * 195793035 >= -734235429 * this.mapWidth || 64888215 * var18.anInt10298 >= this.mapLength * -1790811353)) {
            var18.method6332(-1949449864);
         }
      }

      for(var18 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8206((byte)27); null != var18; var18 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8181(703618272)) {
         var18.anInt10301 -= 767842083 * var2;
         var18.anInt10298 -= 1139683879 * var3;
         var19 = (Class610)this.aClass40_Sub8_5672.method89(-1915127235 * var18.anInt10305, -300941480);
         if(0 == (-341852837 * var18.anInt10312 & 1)) {
            var16 = var19.anInt7993 * -1450399027;
            var7 = 182793117 * var19.anInt7971;
         } else {
            var16 = 182793117 * var19.anInt7971;
            var7 = var19.anInt7993 * -1450399027;
         }

         if(Class502.aClass502_5639 != this.aClass502_5693 && (var16 + var18.anInt10301 * 195793035 <= 0 || var7 + 64888215 * var18.anInt10298 <= 0 || var18.anInt10301 * 195793035 >= -734235429 * this.mapWidth || var18.anInt10298 * 64888215 >= -1790811353 * this.mapLength)) {
            var18.method6332(-1949449864);
         }
      }

      for(Class526_Sub20 var21 = (Class526_Sub20)client.aClass20_11259.method638(-865648723); null != var21; var21 = (Class526_Sub20)client.aClass20_11259.method639(-1225502136)) {
         var16 = (int)(var21.aLong7156 * -6805155999452426801L >> 28 & 3L);
         var7 = (int)(var21.aLong7156 * -6805155999452426801L & 16383L);
         int var25 = var7 - this.aClass596_5667.localX * -814686591;
         int var27 = (int)(-6805155999452426801L * var21.aLong7156 >> 14 & 16383L);
         int var28 = var27 - this.aClass596_5667.localY * -845789331;
         if(this.aClass549_5652 != null) {
            if(var25 >= 0 && var28 >= 0 && var25 < -734235429 * this.mapWidth && var28 < -1790811353 * this.mapLength && var25 < this.aClass549_5652.anInt7285 * -447634797 && var28 < this.aClass549_5652.anInt7286 * 1913648871) {
               if(this.aClass549_5652.aClass552ArrayArrayArray7287 != null) {
                  this.aClass549_5652.method6587(var16, var25, var28, (byte)-77);
               }
            } else if(Class502.aClass502_5639 != this.aClass502_5693) {
               var21.method6332(-1949449864);
            }
         }
      }

      if(0 != 1653075275 * Class105.anInt1300) {
         Class105.anInt1300 -= -2110507933 * var2;
         Class105.anInt1301 -= -1654212593 * var3;
      }

      Class201.method2878(false, 1218057068);
      if(10 == var1) {
         client.anInt11321 -= var2 * 1315062272;
         client.anInt11043 -= var3 * 404092416;
         Class45.anInt639 -= var2 * -488196608;
         Class186.anInt2122 -= var3 * -1062815232;
         if(6 != -265840483 * Class327.anInt3488 && -265840483 * Class327.anInt3488 != 2) {
            Class418.method4974(Class397.method4824((byte)1), (byte)14);
         }
      } else {
         Class583.anInt7782 -= 206279661 * var2;
         Class526_Sub5.anInt10388 -= var3 * -945894401;
         Class289.anInt3117 -= var2 * 199800795;
         Class482.anInt5484 -= -2013496173 * var3;
         Class439.anInt4866 -= -507129344 * var2;
         Class210.anInt2259 -= var3 * -195987968;
         if(Math.abs(var2) > -734235429 * this.mapWidth || Math.abs(var3) > this.mapLength * -1790811353) {
            this.aClass623_5664.method7377((byte)0);
         }
      }

      Class3.method536(-227053614);
      Class613.method7239((byte)99);
      client.aClass20_11160.method647(929030154);
      client.aClass702_11173.method8188(458429799);
      client.aClass686_11103.method8050((short)-272);
      Class604.method7101((byte)26);
   }

   void method6124() {
      this.aClass465_Sub1_5655 = null;
      this.aClass465_Sub1_5656 = null;
      if(null != this.aClass470_5665) {
         this.aClass470_5665.method5618(-1712031620);
      }

      if(this.aClass623_5664 != null) {
         this.aClass623_5664.method7394(-1708506248);
      }

      if(this.aClass549_5652 != null) {
         this.aClass549_5652.aClass559_7318.method6718((byte)-16);
         this.aClass549_5652 = null;
      }

   }

   public Class465_Sub1 method6125(int var1) {
      return this.aClass465_Sub1_5656;
   }

   void method6126(int var1) {
      try {
         Thread.sleep((long)var1);
      } catch (InterruptedException var3) {
         ;
      }

   }

   void method6127(int var1) {
      try {
         Thread.sleep((long)var1);
      } catch (InterruptedException var3) {
         ;
      }

   }

   public Class596 method6128(int var1) {
      return this.aClass596_5667;
   }

   void method6129(byte var1) {
      this.method6081(Class540.valueOf(Class230.preferences.aClass711_Sub12_10613.method9960(-734372554), -1189092057), -1503306677);
      int var2 = this.aClass596_5667.localX * -814686591;
      int var3 = this.aClass596_5667.localY * -845789331;
      int var4 = (822351193 * Class439.anInt4866 >> 12) + (var2 >> 3);
      int var5 = (Class210.anInt2259 * 1215159411 >> 12) + (var3 >> 3);
      Class451.localPlayer.aByte10827 = 0;
      Class692.anInt8703 = 0;
      Class451.localPlayer.method10971(8, 8, 1324245841);
      byte var6 = 18;
      this.regionIds = new int[var6];
      this.mapIds = new int[var6];
      this.aByteArrayArray5685 = new byte[var6][];
      this.aByteArrayArray5686 = new byte[var6][];
      this.aByteArrayArray5687 = new byte[var6][];
      this.aByteArrayArray5688 = new byte[var6][];
      this.aByteArrayArray5657 = new byte[var6][];
      int var10 = 0;

      for(int var7 = (var4 - (this.mapWidth * -734235429 >> 4)) / 8; var7 <= ((-734235429 * this.mapWidth >> 4) + var4) / 8; ++var7) {
         for(int var8 = (var5 - (this.mapLength * -1790811353 >> 4)) / 8; var8 <= ((this.mapLength * -1790811353 >> 4) + var5) / 8; ++var8) {
            int var9 = var8 + (var7 << 8);
            if(Class380_Sub3_Sub1.maps.validChild(this.method6082(var7, var8, -892475015), -1751036255 * Class461.aClass461_5194.anInt5203, (byte)0)) {
               this.regionIds[var10] = var9;
               this.mapIds[var10] = this.method6082(var7, var8, -892475015);
               ++var10;
            }
         }
      }

      this.regionCount = var10 * 1086225245;
      byte var11;
      if(-558705405 * client.anInt11038 == 16) {
         var11 = 7;
      } else if(-558705405 * client.anInt11038 == 8) {
         var11 = 6;
      } else if(0 == client.anInt11038 * -558705405) {
         var11 = 14;
      } else {
         if(-558705405 * client.anInt11038 != 11) {
            throw new RuntimeException("" + -558705405 * client.anInt11038);
         }

         var11 = 5;
      }

      this.updateMapArea(var4, var5, var11, false, (byte)5);
   }

   void method6130() {
      int var1 = this.aByteArrayArray5687.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(null != this.aByteArrayArray5687[var2]) {
            int var3 = -1;

            for(int var4 = 0; var4 < 740276897 * client.anInt11281; ++var4) {
               if(client.anIntArray11069[var4] == this.regionIds[var2]) {
                  var3 = var4;
                  break;
               }
            }

            if(-1 == var3) {
               client.anIntArray11069[740276897 * client.anInt11281] = this.regionIds[var2];
               var3 = (client.anInt11281 += 906406241) * 740276897 - 1;
            }

            RSByteBuffer var17 = new RSByteBuffer(this.aByteArrayArray5687[var2]);
            int var5 = 0;

            while(var17.pos * 301018015 < this.aByteArrayArray5687[var2].length && var5 < 511 && client.npcCount * 1139938345 < 1023) {
               int var6 = var3 | var5++ << 6;
               int var7 = var17.readUnsignedShort(2110789431);
               int var8 = var7 >> 14;
               int var9 = var7 >> 7 & 63;
               int var10 = var7 & 63;
               int var11 = var9 + (64 * (this.regionIds[var2] >> 8) - this.aClass596_5667.localX * -814686591);
               int var12 = (this.regionIds[var2] & 255) * 64 - this.aClass596_5667.localY * -845789331 + var10;
               NPCDef var13 = (NPCDef)Class76.loader.method89(var17.readUnsignedShort(1922121672), -1808258973);
               LinkableObject var14 = (LinkableObject)client.npcs.get((long)var6);
               if(var14 == null && (var13.movementCapabilities & 1) > 0 && var11 >= 0 && var11 + 459047587 * var13.boundSize < this.mapWidth * -734235429 && var12 >= 0 && 459047587 * var13.boundSize + var12 < this.mapLength * -1790811353) {
                  NPC var15 = new NPC(this.aClass549_5652);
                  var15.index = 1016367843 * var6;
                  LinkableObject var16 = new LinkableObject(var15);
                  client.npcs.put(var16, (long)var6);
                  client.aClass526_Sub7Array11050[(client.anInt11051 += 253277107) * 2027369339 - 1] = var16;
                  client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = var6;
                  var15.lastUpdate = client.anInt11012 * 577471779;
                  var15.setDefinition(var13, -1957887669);
                  var15.setBoundSize(var15.def.boundSize * 459047587, (byte)51);
                  var15.anInt11938 = (var15.def.contrast * -739260225 << 3) * 446106299;
                  var15.turn(var15.def.respawnDirection.opposite(1171473118).getId() << 11 & 16383, true, -844359094);
                  var15.move(var8, var11, var12, true, var15.method10781(-627148024), -884886335);
               }
            }
         }
      }

   }

   static int method6131(byte[][] var0, byte[][] var1, int[] var2, byte[] var3, int[] var4, int var5, int var6, int var7) {
      int var8 = var2[var5];
      int var9 = var4[var5] + var8;
      int var10 = var2[var6];
      int var11 = var10 + var4[var6];
      int var12 = var8;
      if(var10 > var8) {
         var12 = var10;
      }

      int var13 = var9;
      if(var11 < var9) {
         var13 = var11;
      }

      int var14 = var3[var5] & 255;
      if((var3[var6] & 255) < var14) {
         var14 = var3[var6] & 255;
      }

      byte[] var15 = var1[var5];
      byte[] var16 = var0[var6];
      int var17 = var12 - var8;
      int var18 = var12 - var10;

      for(int var19 = var12; var19 < var13; ++var19) {
         int var20 = var15[var17++] + var16[var18++];
         if(var20 < var14) {
            var14 = var20;
         }
      }

      return -var14;
   }

   static final void method6132(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class92.method1214(var2, -565835962);
   }
}
