package com.jagex;

import com.jagex.Class107;
import com.jagex.Class141;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class182;
import com.jagex.Class187;
import com.jagex.Class199_Sub2;
import com.jagex.Class2;
import com.jagex.Class205;
import com.jagex.Class206;
import com.jagex.Class227;
import com.jagex.Class243;
import com.jagex.Class251;
import com.jagex.Class274;
import com.jagex.Class281;
import com.jagex.Class331;
import com.jagex.Class34;
import com.jagex.Class388;
import com.jagex.Class40_Sub16;
import com.jagex.Class430;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class510;
import com.jagex.Class526_Sub32;
import com.jagex.Class526_Sub33;
import com.jagex.Class537;
import com.jagex.Class539_Sub2;
import com.jagex.Class541;
import com.jagex.Class549;
import com.jagex.Class552;
import com.jagex.Class557;
import com.jagex.Class572;
import com.jagex.RenderDef;
import com.jagex.Class596;
import com.jagex.Class614;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class670;
import com.jagex.Class686;
import com.jagex.Class689;
import com.jagex.Class704;
import com.jagex.Class704_Sub2;
import com.jagex.Class704_Sub2_Sub1;
import com.jagex.Class704_Sub3;
import com.jagex.Class710;
import com.jagex.Class97_Sub1;
import com.jagex.Interface18;
import com.jagex.Interface30;
import com.jagex.Interface4;
import com.jagex.client;

public abstract class Class639_Sub1_Sub2_Sub1 extends Class639_Sub1_Sub2 implements Interface30 {
   public int anInt11891;
   public boolean aBool11895;
   public byte aByte11899;
   public int anInt11912;
   public int anInt11919;
   public int anInt11920;
   public int anInt11921;
   public int anInt11922;
   public int anInt11923;
   public int anInt11924;
   public int anInt11925;
   static final int anInt11927 = 5;
   public byte aByte11928;
   public byte aByte11929;
   static final int anInt11952 = 20;
   public int anInt11954;
   public int anInt11931;
   public int anInt11937;
   public int[] anIntArray11939;
   public int[] anIntArray11898;
   Class614 aClass614_11950;
   boolean aBool11930;
   int anInt11890;
   Class541 aClass541_11903;
   byte aByte11956;
   Class243 aClass243_11955;
   int anInt11905;
   public int anInt11943;
   public int anInt11948;
   int anInt11889;
   int anInt11900;
   int anInt11901;
   public int index;
   int anInt11892;
   int anInt11918;
   public boolean aBool11894;
   public int anInt11896;
   public int anInt11897;
   public int anInt11904;
   int anInt11902;
   public int[] anIntArray11947;
   public int[] anIntArray11888;
   public int[] anIntArray11907;
   public int[] anIntArray11958;
   public int[] anIntArray11909;
   public Class686 aClass686_11908;
   public int anInt11911;
   public int[] anIntArray11935;
   public Class704_Sub3 aClass704_Sub3_11914;
   public Class704 aClass704_11915;
   public int anInt11926;
   public int anInt11933;
   public byte aByte11893;
   int anInt11932;
   int anInt11917;
   public int lastUpdate;
   public int anInt11938;
   public Class34 aClass34_11940;
   public Class34 aClass34_11941;
   public Class34 aClass34_11942;
   public int anInt11957;
   public int anInt11949;
   boolean aBool11913;
   int anInt11944;
   public Interface18 anInterface18_11936;
   public int[] screenX;
   public int[] screenY;
   public byte[] aByteArray11946;
   public Class168[] aClass168Array11953;
   public Class510[] aClass510Array11906;
   public Class704_Sub2_Sub1[] aClass704_Sub2_Sub1Array11916;
   public Interface4 anInterface4_11887;

   boolean method9836() {
      return false;
   }

   public final void method10769(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Class557 var8 = (Class557)Class199_Sub2.aClass40_Sub19_9875.method89(var1, -2105458751);
      Class539_Sub2 var9 = null;
      Class539_Sub2 var10 = null;
      int var11 = 628086039 * var8.anInt7520;
      int var12 = 0;

      Class539_Sub2 var13;
      for(var13 = (Class539_Sub2)this.aClass686_11908.method8053((byte)1); null != var13; var13 = (Class539_Sub2)this.aClass686_11908.method8054(1292138670)) {
         ++var12;
         if(var8 == var13.aClass557_10315) {
            var13.method9266(var4 + var2, var5, var6, var3, -2085088586);
            return;
         }

         if(var13.aClass557_10315.anInt7519 * 1424234607 <= var8.anInt7519 * 1424234607) {
            var9 = var13;
         }

         if(628086039 * var13.aClass557_10315.anInt7520 > var11) {
            var10 = var13;
            var11 = var13.aClass557_10315.anInt7520 * 628086039;
         }
      }

      if(var10 != null || var12 < 234526419 * Class331.aClass613_3498.anInt8044) {
         var13 = new Class539_Sub2(var8);
         if(null == var9) {
            this.aClass686_11908.method8051(var13, 1064405326);
         } else {
            Class251.method3466(var13, var9, 2094853749);
         }

         var13.method9266(var2 + var4, var5, var6, var3, -2133492864);
         if(var12 >= Class331.aClass613_3498.anInt8044 * 234526419) {
            var10.method6448(-702766562);
         }

      }
   }

   abstract int method10770();

   public void method10771(int var1, int var2) {
      RenderDef var3 = this.method10786(-16777216);
      if(0 != var3.anInt7716 * -1676243435 || 0 != this.anInt11938 * -1313691021) {
         this.aClass34_11940.method819(-1067809639);
         int var4 = var1 - this.aClass34_11940.anInt370 * 604797385 & 16383;
         if(var4 > 8192) {
            this.anInt11931 = (604797385 * this.aClass34_11940.anInt370 - (16384 - var4)) * 1705419461;
         } else {
            this.anInt11931 = (604797385 * this.aClass34_11940.anInt370 + var4) * 1705419461;
         }

      }
   }

   abstract int method10772();

   public int method10773(int var1) {
      RenderDef var2 = this.method10786(-16777216);
      int var3 = this.aClass34_11940.anInt370 * 604797385;
      boolean var4;
      if(0 != -1676243435 * var2.anInt7716) {
         var4 = this.aClass34_11940.method816(2144242701 * this.anInt11931, -1676243435 * var2.anInt7716, var2.anInt7724 * -447806709, -1745490412);
      } else {
         var4 = this.aClass34_11940.method816(this.anInt11931 * 2144242701, -1313691021 * this.anInt11938, this.anInt11938 * -1313691021, -1745490412);
      }

      int var5 = 604797385 * this.aClass34_11940.anInt370 - var3;
      if(var5 != 0) {
         this.anInt11937 += -1553990561;
      } else {
         this.anInt11937 = 0;
         this.aClass34_11940.method820(this.anInt11931 * 2144242701, -493577858);
      }

      if(var4) {
         if(0 != -1102953743 * var2.anInt7723) {
            if(var5 > 0) {
               this.aClass34_11941.method816(-1326543223 * var2.anInt7727, -1102953743 * var2.anInt7723, 421215203 * var2.anInt7700, -1745490412);
            } else {
               this.aClass34_11941.method816(-(var2.anInt7727 * -1326543223), -1102953743 * var2.anInt7723, var2.anInt7700 * 421215203, -1745490412);
            }
         }

         if(-1651459263 * var2.anInt7720 != 0) {
            this.aClass34_11942.method816(var2.anInt7730 * 359293787, var2.anInt7720 * -1651459263, var2.anInt7729 * 1885438995, -1745490412);
         }
      } else {
         if(var2.anInt7723 * -1102953743 != 0) {
            this.aClass34_11941.method816(0, var2.anInt7723 * -1102953743, 421215203 * var2.anInt7700, -1745490412);
         } else {
            this.aClass34_11941.method820(0, -695497982);
         }

         if(0 != -1651459263 * var2.anInt7720) {
            this.aClass34_11942.method816(0, -1651459263 * var2.anInt7720, var2.anInt7729 * 1885438995, -1745490412);
         } else {
            this.aClass34_11942.method820(0, 387600113);
         }
      }

      return var5;
   }

   public void method10774(int[] var1, int[] var2, int var3) {
      if(this.anIntArray11939 == null && null != var1) {
         this.anIntArray11939 = new int[Class710.aClass620_8851.anIntArray8123.length];
      } else if(null == var1) {
         this.anIntArray11939 = null;
         return;
      }

      int var4;
      for(var4 = 0; var4 < this.anIntArray11939.length; ++var4) {
         this.anIntArray11939[var4] = -1;
      }

      for(var4 = 0; var4 < var1.length; ++var4) {
         int var5 = var2[var4];

         for(int var6 = 0; var6 < this.anIntArray11939.length; var5 >>= 1) {
            if((var5 & 1) != 0) {
               this.anIntArray11939[var6] = var1[var4];
            }

            ++var6;
         }
      }

   }

   public boolean method10775(int var1, int var2, int var3) {
      if(null == this.anIntArray11898) {
         if(var2 == -1) {
            return true;
         }

         this.anIntArray11898 = new int[Class710.aClass620_8851.anIntArray8123.length];

         for(int var4 = 0; var4 < Class710.aClass620_8851.anIntArray8123.length; ++var4) {
            this.anIntArray11898[var4] = -1;
         }
      }

      RenderDef var10 = this.method10786(-16777216);
      int var5 = 256;
      if(var10.anIntArray7699 != null && var10.anIntArray7699[var1] > 0) {
         var5 = var10.anIntArray7699[var1];
      }

      int var6;
      int var7;
      if(var2 == -1) {
         if(-1 == this.anIntArray11898[var1]) {
            return true;
         } else {
            var6 = this.aClass34_11940.method817(-1289254067);
            var7 = this.anIntArray11898[var1];
            int var8 = var6 - var7;
            if(var8 >= -var5 && var8 <= var5) {
               this.anIntArray11898[var1] = -1;

               for(int var9 = 0; var9 < Class710.aClass620_8851.anIntArray8123.length; ++var9) {
                  if(-1 != this.anIntArray11898[var9]) {
                     return true;
                  }
               }

               this.anIntArray11898 = null;
               return true;
            } else {
               if((var8 <= 0 || var8 > 8192) && var8 > -8192) {
                  this.anIntArray11898[var1] = var7 - var5 & 16383;
               } else {
                  this.anIntArray11898[var1] = var7 + var5 & 16383;
               }

               return false;
            }
         }
      } else {
         if(this.anIntArray11898[var1] == -1) {
            this.anIntArray11898[var1] = this.aClass34_11940.method817(1012314446);
         }

         var6 = this.anIntArray11898[var1];
         var7 = var2 - var6;
         if(var7 >= -var5 && var7 <= var5) {
            this.anIntArray11898[var1] = var2;
            return true;
         } else {
            if((var7 <= 0 || var7 > 8192) && var7 > -8192) {
               this.anIntArray11898[var1] = var6 - var5 & 16383;
            } else {
               this.anIntArray11898[var1] = var5 + var6 & 16383;
            }

            return false;
         }
      }
   }

   void method10776(Class174 var1, Class168[] var2, Class445 var3, boolean var4, byte var5) {
      if(!var4) {
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = -1;
         int var11 = -1;
         Class182[][] var12 = new Class182[var2.length][];
         Class141[][] var13 = new Class141[var2.length][];

         for(int var14 = 0; var14 < var2.length; ++var14) {
            if(var2[var14] != null) {
               var2[var14].method1996(var3);
               var12[var14] = var2[var14].method1997();
               var13[var14] = var2[var14].method2064();
               if(var12[var14] != null) {
                  var10 = var14;
                  ++var7;
                  var6 += var12[var14].length;
               }

               if(var13[var14] != null) {
                  var11 = var14;
                  ++var9;
                  var8 += var13[var14].length;
               }
            }
         }

         if((null == this.aClass614_11950 || this.aClass614_11950.aBool8074) && (var7 > 0 || var9 > 0)) {
            this.aClass614_11950 = Class614.method7263(client.anInt11012, true);
         }

         if(null != this.aClass614_11950) {
            Class182[] var18 = null;
            int var16;
            if(1 == var7) {
               var18 = var12[var10];
            } else {
               var18 = new Class182[var6];
               int var15 = 0;

               for(var16 = 0; var16 < var2.length; ++var16) {
                  if(var12[var16] != null) {
                     System.arraycopy(var12[var16], 0, var18, var15, var12[var16].length);
                     var15 += var12[var16].length;
                  }
               }
            }

            Class141[] var19 = null;
            if(var9 == 1) {
               var19 = var13[var11];
            } else {
               var19 = new Class141[var8];
               var16 = 0;

               for(int var17 = 0; var17 < var2.length; ++var17) {
                  if(null != var13[var17]) {
                     System.arraycopy(var13[var17], 0, var19, var16, var13[var17].length);
                     var16 += var13[var17].length;
                  }
               }
            }

            this.aClass614_11950.method7250(var1, (long)client.anInt11012, var18, var19, false);
            this.aBool11930 = true;
         }
      } else if(null != this.aClass614_11950) {
         this.aClass614_11950.method7268((long)client.anInt11012);
      }

      if(this.aClass614_11950 != null) {
         this.aClass614_11950.method7254(this.aByte10827, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802);
      }

   }

   public final void method10777(int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      Class510 var8 = this.aClass510Array11906[var6];
      int var9 = 901715121 * var8.anInt6980;
      if(-1 != var1 && -1 != var9) {
         Class670 var10;
         if(var1 == var9) {
            var10 = (Class670)Class689.aClass40_Sub12_8692.method89(var1, -856676382);
            if(var10.aBool8552 && -1 != var10.anInt8550 * 1305328919) {
               Class206 var11 = (Class206)Class388.aClass40_Sub15_4063.method89(1305328919 * var10.anInt8550, 126581626);
               int var12 = 1945727809 * var11.anInt2238;
               if(var12 == 0) {
                  return;
               }

               if(var12 == 2) {
                  var8.aClass704_6979.method8235((byte)122);
                  return;
               }
            }
         } else {
            var10 = (Class670)Class689.aClass40_Sub12_8692.method89(var1, -870244063);
            Class670 var15 = (Class670)Class689.aClass40_Sub12_8692.method89(var9, 234876520);
            if(-1 != 1305328919 * var10.anInt8550 && -1 != var15.anInt8550 * 1305328919) {
               Class206 var16 = (Class206)Class388.aClass40_Sub15_4063.method89(1305328919 * var10.anInt8550, 36356711);
               Class206 var13 = (Class206)Class388.aClass40_Sub15_4063.method89(var15.anInt8550 * 1305328919, 306148685);
               if(345143167 * var16.anInt2234 < 345143167 * var13.anInt2234) {
                  return;
               }
            }
         }
      }

      byte var14 = 0;
      if(var1 != -1 && !((Class670)Class689.aClass40_Sub12_8692.method89(var1, -1906831183)).aBool8552) {
         var14 = 2;
      }

      if(var1 != -1 && var5) {
         var14 = 1;
      }

      var8.anInt6980 = 2069804113 * var1;
      var8.anInt6981 = var4 * -338309057;
      var8.anInt6983 = (var2 >> 16) * -2102835649;
      var8.anInt6982 = -1597807015 * var3;
      var8.aClass704_6979.method8225(var1 != -1?((Class670)Class689.aClass40_Sub12_8692.method89(var1, -445559138)).anInt8550 * 1305328919:-1, var2 & '\uffff', var14, false, 43258578);
   }

   Class639_Sub1_Sub2_Sub1(Class549 var1, Class97_Sub1 var2) {
      this(var1, 10, var2);
   }

   public void setBoundSize(int var1, byte var2) {
      this.anInt11890 = 654488621 * var1;
   }

   boolean method9822(int var1) {
      return this.aBool11913;
   }

   public final void method10779(int var1, byte var2) {
      Class557 var3 = (Class557)Class199_Sub2.aClass40_Sub19_9875.method89(var1, 92612923);

      for(Class539_Sub2 var4 = (Class539_Sub2)this.aClass686_11908.method8053((byte)1); null != var4; var4 = (Class539_Sub2)this.aClass686_11908.method8054(1471168788)) {
         if(var3 == var4.aClass557_10315) {
            var4.method6448(-1728085677);
            return;
         }
      }

   }

   public int method9859(byte var1) {
      RenderDef var2 = this.method10786(-16777216);
      int var3;
      if(1828964807 * var2.anInt7732 != -1) {
         var3 = var2.anInt7732 * 1828964807;
      } else if(-235918189 * this.anInt11918 == -32768) {
         var3 = 200;
      } else {
         var3 = -(this.anInt11918 * -235918189);
      }

      Class430 var4 = this.method7635();
      int var5 = (int)var4.aClass446_4816.aFloat4917 >> 9;
      int var6 = (int)var4.aClass446_4816.aFloat4919 >> 9;
      if(null != this.aClass549_10826 && var5 >= 1 && var6 >= 1 && var5 <= client.aClass505_11204.method6056(-1746741811) - 1 && var6 <= client.aClass505_11204.method6057(126749238) - 1) {
         Class552 var7 = this.aClass549_10826.aClass552ArrayArrayArray7287[this.aByte10827][var5][var6];
         if(var7 != null && var7.aClass639_Sub1_Sub3_7355 != null) {
            return var3 + var7.aClass639_Sub1_Sub3_7355.aShort11834;
         }
      }

      return var3;
   }

   public void method10780(String var1, int var2, int var3, int var4, int var5) {
      if(null == this.aClass541_11903) {
         this.aClass541_11903 = new Class541();
      }

      this.aClass541_11903.aString7228 = var1;
      this.aClass541_11903.anInt7229 = -1441143723 * var2;
      this.aClass541_11903.anInt7230 = 1640899535 * var3;
      this.aClass541_11903.anInt7231 = (this.aClass541_11903.anInt7232 = var4 * 462787675) * 325249733;
   }

   public int method10781(int var1) {
      return this.anInt11890 * -161891419;
   }

   public abstract boolean method10782(int var1);

   void method10783(Class168 var1, int var2) {
      int var3 = this.aClass34_11941.anInt370 * 604797385;
      int var4 = 604797385 * this.aClass34_11942.anInt370;
      if(var3 != 0 || var4 != 0) {
         int var5 = var1.method1981() / 2;
         var1.method1955(0, -var5, 0);
         var1.method1954(var3 & 16383);
         var1.method2076(var4 & 16383);
         var1.method1955(0, var5, 0);
      }

   }

   void method10784(Class174 var1, RenderDef var2, int var3, int var4, int var5, int var6, byte var7) {
      for(int var8 = 0; var8 < this.aClass510Array11906.length; ++var8) {
         byte var9 = 0;
         if(var8 == 0) {
            var9 = 2;
         } else if(1 == var8) {
            var9 = 5;
         } else if(2 == var8) {
            var9 = 1;
         } else if(var8 == 3) {
            var9 = 7;
         } else if(var8 == 4) {
            var9 = 8;
         }

         Class510 var10 = this.aClass510Array11906[var8];
         if(-1 != 901715121 * var10.anInt6980 && !var10.aClass704_6979.method8227((byte)-22)) {
            Class670 var11 = (Class670)Class689.aClass40_Sub12_8692.method89(901715121 * var10.anInt6980, -1708910266);
            int var12 = var3;
            if(0 != -1415740951 * var10.anInt6982) {
               var12 = var3 | 5;
            }

            if(var10.anInt6983 * -1737774657 != 0) {
               var12 |= 2;
            }

            if(var10.anInt6981 * 1212030911 >= 0) {
               var12 |= 7;
            }

            Class168 var13;
            if(var10.anInt6981 * 1212030911 >= 0 && null != var2.anIntArrayArray7704 && null != var2.anIntArrayArray7704[1212030911 * var10.anInt6981]) {
               var13 = this.aClass168Array11953[var8 + 1] = var11.method7969(var1, var12, var10.aClass704_6979, var9, -990603662);
               if(var13 != null) {
                  int var14 = 0;
                  int var15 = 0;
                  int var16 = 0;
                  if(var2.anIntArrayArray7704 != null && var2.anIntArrayArray7704[1212030911 * var10.anInt6981] != null) {
                     var14 += var2.anIntArrayArray7704[var10.anInt6981 * 1212030911][0];
                     var15 += var2.anIntArrayArray7704[var10.anInt6981 * 1212030911][1];
                     var16 += var2.anIntArrayArray7704[1212030911 * var10.anInt6981][2];
                  }

                  if(var2.anIntArrayArray7698 != null && var2.anIntArrayArray7698[1212030911 * var10.anInt6981] != null) {
                     var14 += var2.anIntArrayArray7698[1212030911 * var10.anInt6981][0];
                     var15 += var2.anIntArrayArray7698[var10.anInt6981 * 1212030911][1];
                     var16 += var2.anIntArrayArray7698[var10.anInt6981 * 1212030911][2];
                  }

                  if(0 != var16 || var14 != 0) {
                     int var17 = var6;
                     if(null != this.anIntArray11898 && this.anIntArray11898[1212030911 * var10.anInt6981] != -1) {
                        var17 = this.anIntArray11898[1212030911 * var10.anInt6981];
                     }

                     int var18 = -334542848 * var10.anInt6982 + var17 - var6 & 16383;
                     if(0 != var18) {
                        var13.method1951(var18);
                     }

                     int var19 = Class443.anIntArray4895[var18];
                     int var20 = Class443.anIntArray4896[var18];
                     int var21 = var20 * var14 + var19 * var16 >> 14;
                     var16 = var16 * var20 - var14 * var19 >> 14;
                     var14 = var21;
                  }

                  var13.method1955(var14, var15, var16);
                  if(0 != var10.anInt6983 * -1737774657) {
                     var13.method1955(0, -(-1737774657 * var10.anInt6983) << 2, 0);
                  }

                  var13.aBool1909 = false;
               }
            } else {
               var13 = this.aClass168Array11953[1 + var8] = var11.method7968(var1, var12, -334542848 * var10.anInt6982, 1194917821 * this.anInt11889, -1966848677 * this.anInt11900, 361060487 * this.anInt11901, var10.aClass704_6979, var9, (byte)-5);
               if(var13 != null) {
                  if(var10.anInt6983 * -1737774657 != 0) {
                     var13.method1955(0, -(-1737774657 * var10.anInt6983) << 2, 0);
                  }

                  var13.aBool1909 = false;
               }
            }
         } else {
            this.aClass168Array11953[1 + var8] = null;
         }
      }

   }

   public final void method10785(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < -137814315 * Class331.aClass613_3498.anInt8029; ++var10) {
         if(this.anIntArray11907[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if(var1 >= 0) {
         Class572 var13 = (Class572)Class526_Sub33.aClass40_Sub14_10659.method89(var1, -1573791703);
         var11 = 1054565159 * var13.anInt7678;
         var12 = var13.anInt7659 * -2025196051;
      }

      int var15;
      if(var9) {
         if(var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if(var11 == 0) {
            var15 = this.anIntArray11907[0];
         } else if(var11 == 1) {
            var15 = this.anIntArray11888[0];
         }

         for(int var14 = 1; var14 < Class331.aClass613_3498.anInt8029 * -137814315; ++var14) {
            if(0 == var11) {
               if(this.anIntArray11907[var14] < var15) {
                  var10 = var14;
                  var15 = this.anIntArray11907[var14];
               }
            } else if(1 == var11 && this.anIntArray11888[var14] < var15) {
               var10 = var14;
               var15 = this.anIntArray11888[var14];
            }
         }

         if(var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if(var8) {
            this.aByte11956 = 0;
         }

         for(var15 = 0; var15 < -137814315 * Class331.aClass613_3498.anInt8029; ++var15) {
            byte var16 = this.aByte11956;
            this.aByte11956 = (byte)((this.aByte11956 + 1) % (Class331.aClass613_3498.anInt8029 * -137814315));
            if(this.anIntArray11907[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if(var10 >= 0) {
         this.anIntArray11947[var10] = var1;
         this.anIntArray11888[var10] = var2;
         this.anIntArray11958[var10] = var3;
         this.anIntArray11909[var10] = var4;
         this.anIntArray11907[var10] = var5 + var12 + var6;
      }
   }

   public RenderDef method10786(int var1) {
      int var2 = this.method10787((byte)-20);
      return var2 == -1?Class40_Sub16.aClass574_10972:(RenderDef)Class227.aClass40_Sub16_2327.method89(var2, -1358277462);
   }

   abstract int method10787(byte var1);

   public abstract int method10788(int var1);

   public void method10789(int var1) {
      if(this.aClass541_11903 != null && this.aClass541_11903.aString7228 != null) {
         this.aClass541_11903.anInt7231 -= 2139904007;
         if(0 == this.aClass541_11903.anInt7231 * 449287607) {
            this.aClass541_11903.aString7228 = null;
         }
      }

   }

   public abstract Class541 method10790(byte var1);

   boolean method10791(int var1) {
      return -1 == 572643371 * this.anInt11944?false:this.method10792(572643371 * this.anInt11944, (byte)95);
   }

   boolean method10792(int var1, byte var2) {
      if(1476983511 * this.anInt11905 == var1) {
         return true;
      } else {
         this.aClass243_11955 = Class187.method2725(var1, (int[])null, (Class243)null, true, 1817326691);
         if(null == this.aClass243_11955) {
            return false;
         } else {
            this.anInt11905 = var1 * 1140496615;
            Class107.method1345(this.aClass243_11955.aClass245Array2459, 1971813126);
            return true;
         }
      }
   }

   public void method10793(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(this.method10791(-2082419023)) {
         client.method10310(this.aClass243_11955, this.aClass243_11955.method3330((byte)-92), -1, var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   public void method10794(int var1, int var2, boolean var3, int var4) {
      if(this.method10791(-2083906702)) {
         Class281.method3712(this.aClass243_11955.aClass245Array2459, -1, var1, var2, var3, -2076703988);
      }
   }

   public abstract int method10795(int var1);

   public Class596 method10796(byte var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      Class596 var3 = client.aClass505_11204.method6128(2042900592);
      int var4 = -814686591 * var3.localX + ((int)var2.aFloat4917 >> 9);
      int var5 = ((int)var2.aFloat4919 >> 9) + var3.localY * -845789331;
      return new Class596(this.aByte10827, var4, var5);
   }

   public void method10797(int var1) {
      RenderDef var2 = this.method10786(-16777216);
      if(0 != var2.anInt7716 * -1676243435 || 0 != this.anInt11938 * -1313691021) {
         this.aClass34_11940.method819(-889305656);
         int var3 = var1 - this.aClass34_11940.anInt370 * 604797385 & 16383;
         if(var3 > 8192) {
            this.anInt11931 = (604797385 * this.aClass34_11940.anInt370 - (16384 - var3)) * 1705419461;
         } else {
            this.anInt11931 = (604797385 * this.aClass34_11940.anInt370 + var3) * 1705419461;
         }

      }
   }

   public void finalize() {
      if(this.aClass614_11950 != null) {
         this.aClass614_11950.method7246();
      }

   }

   void method10798() {
      if(this.aClass614_11950 != null) {
         this.aClass614_11950.method7246();
      }

   }

   boolean method9841() {
      return this.aBool11913;
   }

   public int method9838() {
      return this.anInt11892 * 616758809 == -32768?0:this.anInt11892 * 616758809;
   }

   public int method9833() {
      return this.anInt11892 * 616758809 == -32768?0:this.anInt11892 * 616758809;
   }

   public int method9846() {
      RenderDef var1 = this.method10786(-16777216);
      int var2;
      if(1828964807 * var1.anInt7732 != -1) {
         var2 = var1.anInt7732 * 1828964807;
      } else if(-235918189 * this.anInt11918 == -32768) {
         var2 = 200;
      } else {
         var2 = -(this.anInt11918 * -235918189);
      }

      Class430 var3 = this.method7635();
      int var4 = (int)var3.aClass446_4816.aFloat4917 >> 9;
      int var5 = (int)var3.aClass446_4816.aFloat4919 >> 9;
      if(null != this.aClass549_10826 && var4 >= 1 && var5 >= 1 && var4 <= client.aClass505_11204.method6056(-1746741811) - 1 && var5 <= client.aClass505_11204.method6057(126749238) - 1) {
         Class552 var6 = this.aClass549_10826.aClass552ArrayArrayArray7287[this.aByte10827][var4][var5];
         if(var6 != null && var6.aClass639_Sub1_Sub3_7355 != null) {
            return var2 + var6.aClass639_Sub1_Sub3_7355.aShort11834;
         }
      }

      return var2;
   }

   public int method9845() {
      RenderDef var1 = this.method10786(-16777216);
      int var2;
      if(1828964807 * var1.anInt7732 != -1) {
         var2 = var1.anInt7732 * 1828964807;
      } else if(-235918189 * this.anInt11918 == -32768) {
         var2 = 200;
      } else {
         var2 = -(this.anInt11918 * -235918189);
      }

      Class430 var3 = this.method7635();
      int var4 = (int)var3.aClass446_4816.aFloat4917 >> 9;
      int var5 = (int)var3.aClass446_4816.aFloat4919 >> 9;
      if(null != this.aClass549_10826 && var4 >= 1 && var5 >= 1 && var4 <= client.aClass505_11204.method6056(-1746741811) - 1 && var5 <= client.aClass505_11204.method6057(126749238) - 1) {
         Class552 var6 = this.aClass549_10826.aClass552ArrayArrayArray7287[this.aByte10827][var4][var5];
         if(var6 != null && var6.aClass639_Sub1_Sub3_7355 != null) {
            return var2 + var6.aClass639_Sub1_Sub3_7355.aShort11834;
         }
      }

      return var2;
   }

   public final void method10799() {
      this.anInt11943 = 0;
      this.anInt11948 = 0;
   }

   public void method10800() {
      if(this.aClass541_11903 != null && this.aClass541_11903.aString7228 != null) {
         this.aClass541_11903.anInt7231 -= 2139904007;
         if(0 == this.aClass541_11903.anInt7231 * 449287607) {
            this.aClass541_11903.aString7228 = null;
         }
      }

   }

   void method10801(int var1, int var2, int var3, int var4, int var5, byte var6) {
      Class446 var7 = this.method7635().aClass446_4816;
      int var8 = this.aShort11803 + this.aShort11798 >> 1;
      int var9 = this.aShort11802 + this.aShort11799 >> 1;
      int var10 = Class443.anIntArray4895[var1];
      int var11 = Class443.anIntArray4896[var1];
      int var12 = -var2 / 2;
      int var13 = -var3 / 2;
      int var14 = var10 * var13 + var11 * var12 >> 14;
      int var15 = var13 * var11 - var12 * var10 >> 14;
      int var16 = Class274.method3619(var14 + (int)var7.aFloat4917, var15 + (int)var7.aFloat4919, var8, var9, this.aByte10827, -683131427);
      int var17 = var2 / 2;
      int var18 = -var3 / 2;
      int var19 = var11 * var17 + var18 * var10 >> 14;
      int var20 = var11 * var18 - var10 * var17 >> 14;
      int var21 = Class274.method3619((int)var7.aFloat4917 + var19, (int)var7.aFloat4919 + var20, var8, var9, this.aByte10827, -1838719696);
      int var22 = -var2 / 2;
      int var23 = var3 / 2;
      int var24 = var10 * var23 + var22 * var11 >> 14;
      int var25 = var23 * var11 - var22 * var10 >> 14;
      int var26 = Class274.method3619((int)var7.aFloat4917 + var24, (int)var7.aFloat4919 + var25, var8, var9, this.aByte10827, -1378780305);
      int var27 = var2 / 2;
      int var28 = var3 / 2;
      int var29 = var10 * var28 + var27 * var11 >> 14;
      int var30 = var11 * var28 - var27 * var10 >> 14;
      int var31 = Class274.method3619(var29 + (int)var7.aFloat4917, var30 + (int)var7.aFloat4919, var8, var9, this.aByte10827, 807465936);
      int var32 = var16 < var21?var16:var21;
      int var33 = var26 < var31?var26:var31;
      int var34 = var21 < var31?var21:var31;
      int var35 = var16 < var26?var16:var26;
      this.anInt11889 = ((int)(Math.atan2((double)(var32 - var33), (double)var3) * 2607.5945876176133D) & 16383) * 1814737813;
      this.anInt11900 = ((int)(Math.atan2((double)(var35 - var34), (double)var2) * 2607.5945876176133D) & 16383) * 845832915;
      int var36;
      if(0 != 1194917821 * this.anInt11889 && 0 != var4) {
         var36 = 16384 - var4;
         if(1194917821 * this.anInt11889 > 8192) {
            if(1194917821 * this.anInt11889 < var36) {
               this.anInt11889 = var36 * 1814737813;
            }
         } else if(1194917821 * this.anInt11889 > var4) {
            this.anInt11889 = 1814737813 * var4;
         }
      }

      if(-1966848677 * this.anInt11900 != 0 && 0 != var5) {
         var36 = 16384 - var5;
         if(-1966848677 * this.anInt11900 > 8192) {
            if(-1966848677 * this.anInt11900 < var36) {
               this.anInt11900 = var36 * 845832915;
            }
         } else if(this.anInt11900 * -1966848677 > var5) {
            this.anInt11900 = var5 * 845832915;
         }
      }

      this.anInt11901 = -2118914761 * (var16 + var31);
      if(var21 + var26 < this.anInt11901 * 361060487) {
         this.anInt11901 = -2118914761 * (var21 + var26);
      }

      this.anInt11901 = -2118914761 * ((this.anInt11901 * 361060487 >> 1) - (int)var7.aFloat4915);
   }

   public void method10802(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.method10791(-2057222365)) {
         Class205.method2898(this.aClass243_11955.method3330((byte)-30), -1, var2, var3, var4, var5, var6, var7, var1, false, (byte)-30);
      } else {
         if(-1 != var1) {
            client.aBoolArray11236[var1] = true;
         } else {
            for(int var9 = 0; var9 < 111; ++var9) {
               client.aBoolArray11236[var9] = true;
            }
         }

      }
   }

   public final void method10803() {
      this.anInt11943 = 0;
      this.anInt11948 = 0;
   }

   public abstract int method10804();

   public void method10670(int var1) {
      int var2 = (this.anInt11890 * -161891419 - 1 << 8) + 240;
      Class446 var3 = this.method7635().aClass446_4816;
      this.aShort11803 = (short)((int)var3.aFloat4917 - var2 >> 9);
      this.aShort11799 = (short)((int)var3.aFloat4919 - var2 >> 9);
      this.aShort11798 = (short)(var2 + (int)var3.aFloat4917 >> 9);
      this.aShort11802 = (short)((int)var3.aFloat4919 + var2 >> 9);
   }

   public final void method10805() {
      this.anInt11943 = 0;
      this.anInt11948 = 0;
   }

   public int method10806() {
      return this.anInt11890 * -161891419;
   }

   public int method10807() {
      return this.anInt11890 * -161891419;
   }

   public int method10808() {
      return this.anInt11890 * -161891419;
   }

   public void method10671() {
      int var1 = (this.anInt11890 * -161891419 - 1 << 8) + 240;
      Class446 var2 = this.method7635().aClass446_4816;
      this.aShort11803 = (short)((int)var2.aFloat4917 - var1 >> 9);
      this.aShort11799 = (short)((int)var2.aFloat4919 - var1 >> 9);
      this.aShort11798 = (short)(var1 + (int)var2.aFloat4917 >> 9);
      this.aShort11802 = (short)((int)var2.aFloat4919 + var1 >> 9);
   }

   public void method10672() {
      int var1 = (this.anInt11890 * -161891419 - 1 << 8) + 240;
      Class446 var2 = this.method7635().aClass446_4816;
      this.aShort11803 = (short)((int)var2.aFloat4917 - var1 >> 9);
      this.aShort11799 = (short)((int)var2.aFloat4919 - var1 >> 9);
      this.aShort11798 = (short)(var1 + (int)var2.aFloat4917 >> 9);
      this.aShort11802 = (short)((int)var2.aFloat4919 + var1 >> 9);
   }

   public abstract Class541 method10809();

   public abstract boolean method10810();

   abstract int method10811();

   abstract int method10812();

   public abstract int method10813();

   public void method10814() {
      if(this.aClass541_11903 != null && this.aClass541_11903.aString7228 != null) {
         this.aClass541_11903.anInt7231 -= 2139904007;
         if(0 == this.aClass541_11903.anInt7231 * 449287607) {
            this.aClass541_11903.aString7228 = null;
         }
      }

   }

   public void turn(int var1, boolean var2, int var3) {
      RenderDef var4 = this.method10786(-16777216);
      if(var2 || -1676243435 * var4.anInt7716 != 0 || 0 != -1313691021 * this.anInt11938) {
         this.anInt11931 = 1705419461 * (var1 & 16383);
         this.aClass34_11940.method820(2144242701 * this.anInt11931, 1297381404);
      }
   }

   boolean method9821(int var1) {
      return false;
   }

   public abstract boolean method10816();

   public int method9832(byte var1) {
      return this.anInt11892 * 616758809 == -32768?0:this.anInt11892 * 616758809;
   }

   void method10817() {
      if(this.aClass614_11950 != null) {
         this.aClass614_11950.method7246();
      }

   }

   public abstract boolean method10818();

   public final void method10819(int var1) {
      this.anInt11943 = 0;
      this.anInt11948 = 0;
   }

   Class639_Sub1_Sub2_Sub1(Class549 var1, int var2, Class97_Sub1 var3) {
      super(var1, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte)0);
      this.index = -1016367843;
      this.anInt11890 = 654488621;
      this.anInt11892 = 1089175552;
      this.anInt11918 = 389185536;
      this.aBool11894 = true;
      this.anInt11896 = 0;
      this.anInt11897 = 853478075;
      this.anInt11904 = 0;
      this.anInt11902 = 0;
      this.aByte11956 = 0;
      this.anIntArray11947 = new int[Class331.aClass613_3498.anInt8029 * -137814315];
      this.anIntArray11888 = new int[-137814315 * Class331.aClass613_3498.anInt8029];
      this.anIntArray11907 = new int[Class331.aClass613_3498.anInt8029 * -137814315];
      this.anIntArray11958 = new int[Class331.aClass613_3498.anInt8029 * -137814315];
      this.anIntArray11909 = new int[Class331.aClass613_3498.anInt8029 * -137814315];
      this.aClass686_11908 = new Class686();
      this.anInt11911 = 790295043;
      this.anIntArray11935 = null;
      this.aClass704_Sub3_11914 = new Class704_Sub3(this, false);
      this.aClass704_11915 = new Class704_Sub2(this, false);
      this.anInt11926 = 1462749463;
      this.anInt11933 = -1238611391;
      this.aByte11893 = 0;
      this.anInt11932 = 972218431;
      this.anInt11917 = 0;
      this.lastUpdate = 0;
      this.anInt11937 = 0;
      this.anInt11938 = -1760904448;
      this.aClass34_11940 = new Class34();
      this.aClass34_11941 = new Class34();
      this.aClass34_11942 = new Class34();
      this.anInt11943 = 0;
      this.anInt11957 = 0;
      this.anInt11948 = 0;
      this.anInt11949 = 0;
      this.aBool11930 = false;
      this.aBool11913 = false;
      this.anInt11905 = -1140496615;
      this.anInt11944 = -1674061443;
      this.anInterface18_11936 = new Class537(this);
      this.screenX = new int[var2];
      this.screenY = new int[var2];
      this.aByteArray11946 = new byte[var2];
      this.aClass168Array11953 = new Class168[6];
      this.aClass510Array11906 = new Class510[5];

      for(int var4 = 0; var4 < 5; ++var4) {
         this.aClass510Array11906[var4] = new Class510(this);
      }

      this.aClass704_Sub2_Sub1Array11916 = new Class704_Sub2_Sub1[Class710.aClass620_8851.anIntArray8123.length];
      this.anInterface4_11887 = new Class2(var3);
   }

   public Class526_Sub32 method10820(int var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      Class596 var3 = client.aClass505_11204.method6128(2040170065);
      int var4 = -507706880 * var3.localX + (int)var2.aFloat4917;
      int var5 = (int)var2.aFloat4915;
      int var6 = 747559424 * var3.localY + (int)var2.aFloat4919;
      return new Class526_Sub32(this.aByte10827, var4, var5, var6);
   }

   public abstract int method10821();

   public int method10822() {
      RenderDef var1 = this.method10786(-16777216);
      int var2 = this.aClass34_11940.anInt370 * 604797385;
      boolean var3;
      if(0 != -1676243435 * var1.anInt7716) {
         var3 = this.aClass34_11940.method816(2144242701 * this.anInt11931, -1676243435 * var1.anInt7716, var1.anInt7724 * -447806709, -1745490412);
      } else {
         var3 = this.aClass34_11940.method816(this.anInt11931 * 2144242701, -1313691021 * this.anInt11938, this.anInt11938 * -1313691021, -1745490412);
      }

      int var4 = 604797385 * this.aClass34_11940.anInt370 - var2;
      if(var4 != 0) {
         this.anInt11937 += -1553990561;
      } else {
         this.anInt11937 = 0;
         this.aClass34_11940.method820(this.anInt11931 * 2144242701, -1476740932);
      }

      if(var3) {
         if(0 != -1102953743 * var1.anInt7723) {
            if(var4 > 0) {
               this.aClass34_11941.method816(-1326543223 * var1.anInt7727, -1102953743 * var1.anInt7723, 421215203 * var1.anInt7700, -1745490412);
            } else {
               this.aClass34_11941.method816(-(var1.anInt7727 * -1326543223), -1102953743 * var1.anInt7723, var1.anInt7700 * 421215203, -1745490412);
            }
         }

         if(-1651459263 * var1.anInt7720 != 0) {
            this.aClass34_11942.method816(var1.anInt7730 * 359293787, var1.anInt7720 * -1651459263, var1.anInt7729 * 1885438995, -1745490412);
         }
      } else {
         if(var1.anInt7723 * -1102953743 != 0) {
            this.aClass34_11941.method816(0, var1.anInt7723 * -1102953743, 421215203 * var1.anInt7700, -1745490412);
         } else {
            this.aClass34_11941.method820(0, -539452511);
         }

         if(0 != -1651459263 * var1.anInt7720) {
            this.aClass34_11942.method816(0, -1651459263 * var1.anInt7720, var1.anInt7729 * 1885438995, -1745490412);
         } else {
            this.aClass34_11942.method820(0, -1908546498);
         }
      }

      return var4;
   }
}
