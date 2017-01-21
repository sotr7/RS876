package com.jagex;

import com.jagex.Class115;
import com.jagex.Class148;
import com.jagex.Class163;
import com.jagex.Class172;
import com.jagex.Class174;
import com.jagex.Class195;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class272;
import com.jagex.Class285;
import com.jagex.Class30;
import com.jagex.Class307;
import com.jagex.Class313_Sub1;
import com.jagex.Class329_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class44;
import com.jagex.Class446;
import com.jagex.Class448;
import com.jagex.Class451;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.OutFrameBuffer;
import com.jagex.Class546;
import com.jagex.Class552;
import com.jagex.Class555;
import com.jagex.Class556;
import com.jagex.Class559;
import com.jagex.Class562;
import com.jagex.Class594;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub1;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub3;
import com.jagex.Class639_Sub1_Sub4;
import com.jagex.Class639_Sub1_Sub5;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class76;
import com.jagex.Interface64;
import com.jagex.client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Class549 {
   static final int anInt7298 = 4;
   public Class552[][][] aClass552ArrayArrayArray7287;
   public Class148[] aClass148Array7288;
   public int anInt7284;
   int anInt7299 = 0;
   boolean aBool7282;
   int anInt7311;
   int anInt7312;
   int anInt7313;
   int anInt7314;
   int anInt7315;
   int anInt7319;
   int anInt7306;
   int anInt7322;
   int anInt7323;
   int anInt7321;
   int anInt7305;
   boolean[][] aBoolArrayArray7338;
   boolean[][] aBoolArrayArray7335;
   boolean[][] aBoolArrayArray7337;
   int anInt7332;
   int anInt7331;
   int anInt7274;
   int anInt7328;
   HashMap aHashMap7276 = new HashMap();
   int anInt7281 = 16;
   int anInt7275 = 10017;
   int anInt7301 = 5023;
   int anInt7297 = 5015;
   float[] aFloatArray7324 = new float[3];
   Class526_Sub16[] aClass526_Sub16Array7325 = new Class526_Sub16[8];
   int anInt7326 = '\ufeb8';
   HashMap aHashMap7327 = new HashMap();
   Class174 aClass174_7279;
   boolean aBool7334;
   public int anInt7316;
   int anInt7333;
   int anInt7320;
   public int anInt7285;
   public int anInt7286;
   int anInt7304;
   Class30 aClass30_7280;
   public Class562 aClass562_7300;
   public Class552[][][] aClass552ArrayArrayArray7289;
   public Class148[] aClass148Array7290;
   int[][] anIntArrayArray7302;
   byte[][] aByteArrayArray7295;
   short[][] aShortArrayArray7294;
   byte[][] aByteArrayArray7296;
   byte[][] aByteArrayArray7317;
   byte[][] aByteArrayArray7283;
   public Class552[][][] aClass552ArrayArrayArray7277;
   public Class148[] aClass148Array7292;
   long[][][] aLongArrayArrayArray7329;
   Class556[] aClass556Array7330;
   boolean[] aBoolArray7278;
   Class639_Sub1[] aClass639_Sub1Array7303;
   Class639_Sub1[] aClass639_Sub1Array7293;
   Class639_Sub1[] aClass639_Sub1Array7307;
   Class639_Sub1[] aClass639_Sub1Array7309;
   Class639_Sub1[] aClass639_Sub1Array7308;
   Class639_Sub1_Sub2[] aClass639_Sub1_Sub2Array7310;
   int[] anIntArray7336;
   public Class559 aClass559_7318;
   public static boolean aBool7291 = true;

   public void method6562(int var1, int var2, int var3, int var4) {
      boolean var5 = this.aClass552ArrayArrayArray7287[0][var2][var3] != null && this.aClass552ArrayArrayArray7287[0][var2][var3].aClass552_7359 != null;

      for(int var6 = var1; var6 >= 0; --var6) {
         if(this.aClass552ArrayArrayArray7287[var6][var2][var3] == null) {
            Class552 var7 = this.aClass552ArrayArrayArray7287[var6][var2][var3] = new Class552(var6);
            if(var5) {
               ++var7.aByte7354;
            }
         }
      }

   }

   public void method6563(Class163 var1, byte var2) {
   }

   public void method6564(boolean var1, int var2) {
      if(var1) {
         this.aClass552ArrayArrayArray7287 = this.aClass552ArrayArrayArray7277;
         this.aClass148Array7288 = this.aClass148Array7292;
      } else {
         this.aClass552ArrayArrayArray7287 = this.aClass552ArrayArrayArray7289;
         this.aClass148Array7288 = this.aClass148Array7290;
      }

      this.anInt7284 = 1257855037 * this.aClass552ArrayArrayArray7287.length;
   }

   public int method6565(int var1, int var2) {
      return null != this.aShortArrayArray7294?this.aShortArrayArray7294[var1][var2] & '\uffff':0;
   }

   Class552 method6566(int var1, int var2, int var3, int var4) {
      return this.method6618(var1, Math.min(this.anInt7285 * -447634797 - 1, Math.max(0, var2)), Math.min(1913648871 * this.anInt7286 - 1, Math.max(0, var3)), (byte)8);
   }

   public void method6567(int var1) {
      for(int var2 = 0; var2 < -447634797 * this.anInt7285; ++var2) {
         for(int var3 = 0; var3 < this.anInt7286 * 1913648871; ++var3) {
            if(this.aClass552ArrayArrayArray7287[0][var2][var3] == null) {
               this.aClass552ArrayArrayArray7287[0][var2][var3] = new Class552(0);
            }
         }
      }

   }

   public void method6568(int var1, Class148 var2, byte var3) {
      this.aClass148Array7288[var1] = var2;
   }

   public int method6569(int var1, int var2, byte var3) {
      return null != this.aShortArrayArray7294?this.aShortArrayArray7294[var1][var2] & '\uffff':0;
   }

   public Class639_Sub1_Sub4 method6570(int var1, int var2, int var3, int var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      return null == var5?null:var5.aClass639_Sub1_Sub4_7349;
   }

   public int method6571(int var1, int var2, int var3) {
      return null != this.aByteArrayArray7295?this.aByteArrayArray7295[var1][var2] & 255:0;
   }

   public int method6572(int var1, int var2, int var3) {
      return null != this.aByteArrayArray7296?this.aByteArrayArray7296[var1][var2] & 255:0;
   }

   public void method6573(int var1, int var2, int var3, Class639_Sub1_Sub5 var4, Class639_Sub1_Sub5 var5, byte var6) {
      Class552 var7 = this.method6618(var1, var2, var3, (byte)8);
      if(null != var7) {
         var7.aClass639_Sub1_Sub5_7353 = var4;
         var7.aClass639_Sub1_Sub5_7352 = var5;
         int var8 = this.aClass148Array7292 == this.aClass148Array7288?1:0;
         if(var4.method9821('\uffff')) {
            if(var4.method9822(85956966)) {
               var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7293[var8];
               this.aClass639_Sub1Array7293[var8] = var4;
            } else {
               var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7303[var8];
               this.aClass639_Sub1Array7303[var8] = var4;
            }
         } else {
            var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7307[var8];
            this.aClass639_Sub1Array7307[var8] = var4;
         }

         if(var5 != null) {
            if(var5.method9821('\uffff')) {
               if(var5.method9822(-725882852)) {
                  var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7293[var8];
                  this.aClass639_Sub1Array7293[var8] = var5;
               } else {
                  var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7303[var8];
                  this.aClass639_Sub1Array7303[var8] = var5;
               }
            } else {
               var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7307[var8];
               this.aClass639_Sub1Array7307[var8] = var5;
            }
         }
      }

   }

   public int method6574(int var1, int var2, short var3) {
      return null != this.aByteArrayArray7283?this.aByteArrayArray7283[var1][var2] & 255:0;
   }

   public void method6575(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(null != this.anIntArrayArray7302) {
         this.anIntArrayArray7302[var1][var2] = -16777216 | var3;
      }

      if(null != this.aShortArrayArray7294) {
         this.aShortArrayArray7294[var1][var2] = (short)var4;
      }

      if(null != this.aByteArrayArray7295) {
         this.aByteArrayArray7295[var1][var2] = (byte)var5;
      }

      if(this.aByteArrayArray7296 != null) {
         this.aByteArrayArray7296[var1][var2] = (byte)var6;
      }

      if(null != this.aByteArrayArray7317) {
         this.aByteArrayArray7317[var1][var2] = (byte)var7;
      }

      if(null != this.aByteArrayArray7283) {
         this.aByteArrayArray7283[var1][var2] = (byte)var8;
      }

   }

   public void method6576(int var1, int var2, int var3, Class639_Sub1_Sub3 var4, byte var5) {
      Class552 var6 = this.method6618(var1, var2, var3, (byte)8);
      if(var6 != null) {
         var6.aClass639_Sub1_Sub3_7355 = var4;
         int var7 = this.aClass148Array7288 == this.aClass148Array7292?1:0;
         if(var4.method9821('\uffff')) {
            if(var4.method9822(718465636)) {
               var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7293[var7];
               this.aClass639_Sub1Array7293[var7] = var4;
            } else {
               var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7303[var7];
               this.aClass639_Sub1Array7303[var7] = var4;
            }
         } else {
            var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7307[var7];
            this.aClass639_Sub1Array7307[var7] = var4;
         }
      }

   }

   public void method6577(int var1, int var2, int var3, int var4, Class639_Sub1_Sub4 var5, int var6) {
      Class552 var7 = this.method6618(var1, var2, var3, (byte)8);
      if(var7 != null) {
         var5.method7632(new Class446((float)(374552189 * this.anInt7320 + (var2 << 1705818315 * this.anInt7316)), (float)var4, (float)(374552189 * this.anInt7320 + (var3 << this.anInt7316 * 1705818315))));
         var7.aClass639_Sub1_Sub4_7349 = var5;
         int var8 = this.aClass148Array7292 == this.aClass148Array7288?1:0;
         if(var5.method9821('\uffff')) {
            if(var5.method9822(-562662660)) {
               var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7293[var8];
               this.aClass639_Sub1Array7293[var8] = var5;
            } else {
               var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7303[var8];
               this.aClass639_Sub1Array7303[var8] = var5;
            }
         } else {
            var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7307[var8];
            this.aClass639_Sub1Array7307[var8] = var5;
         }
      }

   }

   public void method6578(int var1, int var2, int var3, Class639_Sub1_Sub1 var4, Class639_Sub1_Sub1 var5, byte var6) {
      Class552 var7 = this.method6618(var1, var2, var3, (byte)8);
      if(null != var7) {
         var7.aClass639_Sub1_Sub1_7351 = var4;
         var7.aClass639_Sub1_Sub1_7350 = var5;
         int var8 = this.aClass148Array7288 == this.aClass148Array7292?1:0;
         if(var4.method9821('\uffff')) {
            if(var4.method9822(-1300528191)) {
               var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7293[var8];
               this.aClass639_Sub1Array7293[var8] = var4;
            } else {
               var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7303[var8];
               this.aClass639_Sub1Array7303[var8] = var4;
            }
         } else {
            var4.aClass639_Sub1_10825 = this.aClass639_Sub1Array7307[var8];
            this.aClass639_Sub1Array7307[var8] = var4;
         }

         if(null != var5) {
            if(var5.method9821('\uffff')) {
               if(var5.method9822(-436676351)) {
                  var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7293[var8];
                  this.aClass639_Sub1Array7293[var8] = var5;
               } else {
                  var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7303[var8];
                  this.aClass639_Sub1Array7303[var8] = var5;
               }
            } else {
               var5.aClass639_Sub1_10825 = this.aClass639_Sub1Array7307[var8];
               this.aClass639_Sub1Array7307[var8] = var5;
            }
         }
      }

   }

   public boolean method6579(Class639_Sub1_Sub2 var1, boolean var2, int var3) {
      boolean var4 = this.aClass148Array7288 == this.aClass148Array7292;
      int var5 = 0;
      short var6 = 0;
      byte var7 = 0;
      var1.method10670(-226800375);
      short var8 = 0;
      int var9 = Math.min(-447634797 * this.anInt7285 - 1, Math.max(0, var1.aShort11803));
      int var10 = Math.min(this.anInt7285 * -447634797 - 1, Math.max(0, var1.aShort11798));
      int var11 = Math.min(1913648871 * this.anInt7286 - 1, Math.max(0, var1.aShort11799));
      int var12 = Math.min(this.anInt7286 * 1913648871 - 1, Math.max(0, var1.aShort11802));

      int var13;
      int var14;
      for(var13 = var9; var13 <= var10; ++var13) {
         for(var14 = var11; var14 <= var12; ++var14) {
            Class552 var15 = this.method6566(var1.aByte10827, var13, var14, -494661616);
            if(var15 != null) {
               Class546 var16 = Class44.method918(var1, -740027385);
               Class546 var17 = var15.aClass546_7357;
               if(null == var17) {
                  var15.aClass546_7357 = var16;
               } else {
                  while(null != var17.aClass546_7268) {
                     var17 = var17.aClass546_7268;
                  }

                  var17.aClass546_7268 = var16;
               }

               if(var4 && (this.anIntArrayArray7302[var13][var14] & -16777216) != 0) {
                  var5 = this.anIntArrayArray7302[var13][var14];
                  var6 = this.aShortArrayArray7294[var13][var14];
                  var7 = this.aByteArrayArray7295[var13][var14];
               }

               if(!var2 && null != var15.aClass639_Sub1_Sub3_7355 && var15.aClass639_Sub1_Sub3_7355.aShort11834 > var8) {
                  var8 = var15.aClass639_Sub1_Sub3_7355.aShort11834;
               }
            }
         }
      }

      if(var4 && 0 != (var5 & -16777216)) {
         for(var13 = var9; var13 <= var10; ++var13) {
            for(var14 = var11; var14 <= var12; ++var14) {
               if(0 == (this.anIntArrayArray7302[var13][var14] & -16777216)) {
                  this.anIntArrayArray7302[var13][var14] = var5;
                  this.aShortArrayArray7294[var13][var14] = var6;
                  this.aByteArrayArray7295[var13][var14] = var7;
               }
            }
         }
      }

      if(var2) {
         this.aClass639_Sub1_Sub2Array7310[(this.anInt7299 += 1081501219) * 265320843 - 1] = var1;
         var1.aClass549_10826 = this;
      } else {
         var13 = this.aClass148Array7292 == this.aClass148Array7288?1:0;
         if(var1.method9821('\uffff')) {
            if(var1.method9822(-606683203)) {
               var1.aClass639_Sub1_10825 = this.aClass639_Sub1Array7293[var13];
               this.aClass639_Sub1Array7293[var13] = var1;
            } else {
               var1.aClass639_Sub1_10825 = this.aClass639_Sub1Array7303[var13];
               this.aClass639_Sub1Array7303[var13] = var1;
            }
         } else {
            var1.aClass639_Sub1_10825 = this.aClass639_Sub1Array7307[var13];
            this.aClass639_Sub1Array7307[var13] = var1;
         }
      }

      if(var2) {
         Class446 var18 = Class446.method5305(var1.method7635().aClass446_4816);
         var18.aFloat4915 -= (float)var8;
         var1.method7632(var18);
         var18.method5278();
      }

      return true;
   }

   boolean method6580(Class639_Sub1 var1, boolean var2, byte[][][] var3, int var4, byte var5) {
      if(!this.aBool7282) {
         return false;
      } else if(var1 instanceof Class639_Sub1_Sub2) {
         short var12 = ((Class639_Sub1_Sub2)var1).aShort11798;
         short var13 = ((Class639_Sub1_Sub2)var1).aShort11802;
         short var14 = ((Class639_Sub1_Sub2)var1).aShort11803;
         short var9 = ((Class639_Sub1_Sub2)var1).aShort11799;

         for(int var10 = var14; var10 <= var12; ++var10) {
            for(int var11 = var9; var11 <= var13; ++var11) {
               if(var1.aByte10828 < this.anInt7284 * 1756626709 && var10 >= this.anInt7319 * 1758481353 && var10 < this.anInt7321 * -1780744123 && var11 >= 1873467129 * this.anInt7322 && var11 < this.anInt7305 * -1998708937) {
                  if((null == var3 || var1.aByte10827 < var4 || var3[var1.aByte10827][var10][var11] != var5) && var1.method9830((byte)-121) && !var1.method9824(this.aClass174_7279, -1273683397)) {
                     return false;
                  }

                  if(!var2 && var10 >= -522241111 * this.anInt7311 - 16 && var10 <= this.anInt7311 * -522241111 + 16 && var11 >= this.anInt7312 * 446938063 - 16 && var11 <= this.anInt7312 * 446938063 + 16) {
                     var1.method9834(this.aClass174_7279, 1437571469);
                  }

                  return true;
               }
            }
         }

         return true;
      } else {
         Class446 var6 = var1.method7635().aClass446_4816;
         int var7 = (int)var6.aFloat4917 >> 1705818315 * this.anInt7316;
         int var8 = (int)var6.aFloat4919 >> this.anInt7316 * 1705818315;
         if(var1.aByte10828 < 1756626709 * this.anInt7284 && var7 >= 1758481353 * this.anInt7319 && var7 < -1780744123 * this.anInt7321 && var8 >= 1873467129 * this.anInt7322 && var8 < this.anInt7305 * -1998708937) {
            if((null == var3 || var1.aByte10827 < var4 || var3[var1.aByte10827][var7][var8] != var5) && var1.method9830((byte)-52) && !var1.method9824(this.aClass174_7279, -1947155863)) {
               return false;
            } else {
               if(!var2 && var7 >= this.anInt7311 * -522241111 - 16 && var7 <= this.anInt7311 * -522241111 + 16 && var8 >= this.anInt7312 * 446938063 - 16 && var8 <= 446938063 * this.anInt7312 + 16) {
                  var1.method9834(this.aClass174_7279, 546992801);
               }

               return true;
            }
         } else {
            return true;
         }
      }
   }

   public void method6581(int var1) {
      for(int var2 = 0; var2 < this.anInt7299 * 265320843; ++var2) {
         Class639_Sub1_Sub2 var3 = this.aClass639_Sub1_Sub2Array7310[var2];
         this.method6627(var3, true, 79489243);
         this.aClass639_Sub1_Sub2Array7310[var2] = null;
      }

      this.anInt7299 = 0;
   }

   public Class639_Sub1_Sub1 method6582(int var1, int var2, int var3, int var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(null != var5) {
         this.method6588(var5.aClass639_Sub1_Sub1_7351, -2038059516);
         if(null != var5.aClass639_Sub1_Sub1_7351) {
            Class639_Sub1_Sub1 var6 = var5.aClass639_Sub1_Sub1_7351;
            var5.aClass639_Sub1_Sub1_7351 = null;
            return var6;
         }
      }

      return null;
   }

   public Class639_Sub1_Sub1 method6583(int var1, int var2, int var3, int var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(null != var5) {
         this.method6588(var5.aClass639_Sub1_Sub1_7350, -2038059516);
         if(null != var5.aClass639_Sub1_Sub1_7350) {
            Class639_Sub1_Sub1 var6 = var5.aClass639_Sub1_Sub1_7350;
            var5.aClass639_Sub1_Sub1_7350 = null;
            return var6;
         }
      }

      return null;
   }

   public void method6584(int var1) {
      this.method6619(1, 1756626709 * this.anInt7284, -641312050);
   }

   public Class639_Sub1_Sub5 method6585(int var1, int var2, int var3, int var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(var5 != null) {
         this.method6588(var5.aClass639_Sub1_Sub5_7352, -2038059516);
         if(var5.aClass639_Sub1_Sub5_7352 != null) {
            Class639_Sub1_Sub5 var6 = var5.aClass639_Sub1_Sub5_7352;
            var5.aClass639_Sub1_Sub5_7352 = null;
            return var6;
         }
      }

      return null;
   }

   public Class639_Sub1_Sub3 method6586(int var1, int var2, int var3, short var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(null == var5) {
         return null;
      } else {
         this.method6588(var5.aClass639_Sub1_Sub3_7355, -2038059516);
         if(null != var5.aClass639_Sub1_Sub3_7355) {
            Class639_Sub1_Sub3 var6 = var5.aClass639_Sub1_Sub3_7355;
            var5.aClass639_Sub1_Sub3_7355 = null;
            return var6;
         } else {
            return null;
         }
      }
   }

   public Class639_Sub1_Sub4 method6587(int var1, int var2, int var3, byte var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(var5 == null) {
         return null;
      } else {
         Class639_Sub1_Sub4 var6 = var5.aClass639_Sub1_Sub4_7349;
         var5.aClass639_Sub1_Sub4_7349 = null;
         this.method6588(var6, -2038059516);
         return var6;
      }
   }

   void method6588(Class639_Sub1 var1, int var2) {
      if(null != var1) {
         var1.method7622();

         for(int var3 = 0; var3 < 2; ++var3) {
            Class639_Sub1 var4 = null;

            Class639_Sub1 var5;
            for(var5 = this.aClass639_Sub1Array7303[var3]; null != var5; var5 = var5.aClass639_Sub1_10825) {
               if(var5 == var1) {
                  if(null != var4) {
                     var4.aClass639_Sub1_10825 = var5.aClass639_Sub1_10825;
                  } else {
                     this.aClass639_Sub1Array7303[var3] = var5.aClass639_Sub1_10825;
                  }

                  return;
               }

               var4 = var5;
            }

            var4 = null;

            for(var5 = this.aClass639_Sub1Array7293[var3]; null != var5; var5 = var5.aClass639_Sub1_10825) {
               if(var1 == var5) {
                  if(var4 != null) {
                     var4.aClass639_Sub1_10825 = var5.aClass639_Sub1_10825;
                  } else {
                     this.aClass639_Sub1Array7293[var3] = var5.aClass639_Sub1_10825;
                  }

                  return;
               }

               var4 = var5;
            }

            var4 = null;

            for(var5 = this.aClass639_Sub1Array7307[var3]; null != var5; var5 = var5.aClass639_Sub1_10825) {
               if(var1 == var5) {
                  if(null != var4) {
                     var4.aClass639_Sub1_10825 = var5.aClass639_Sub1_10825;
                  } else {
                     this.aClass639_Sub1Array7307[var3] = var5.aClass639_Sub1_10825;
                  }

                  return;
               }

               var4 = var5;
            }
         }

      }
   }

   public Class639_Sub1_Sub1 method6589(int var1, int var2, int var3, byte var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      return null == var5?null:var5.aClass639_Sub1_Sub1_7351;
   }

   public Class639_Sub1_Sub5 method6590(int var1, int var2, int var3, int var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      return var5 == null?null:var5.aClass639_Sub1_Sub5_7353;
   }

   public Class639_Sub1_Sub2 method6591(int var1, int var2, int var3, Interface64 var4, int var5) {
      Class552 var6 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(var6 == null) {
         return null;
      } else {
         for(Class546 var7 = var6.aClass546_7357; var7 != null; var7 = var7.aClass546_7268) {
            Class639_Sub1_Sub2 var8 = var7.aClass639_Sub1_Sub2_7267;
            if((null == var4 || var4.method433(var8, 953808173)) && var2 == var8.aShort11803 && var8.aShort11799 == var3) {
               return var8;
            }
         }

         return null;
      }
   }

   public Class546 method6592(int var1, int var2, int var3, int var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      return var5 == null?null:var5.aClass546_7357;
   }

   public Class639_Sub1_Sub3 method6593(int var1, int var2, int var3, int var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      return var5 != null && null != var5.aClass639_Sub1_Sub3_7355?var5.aClass639_Sub1_Sub3_7355:null;
   }

   public void method6594() {
      for(int var1 = 0; var1 < this.anInt7284 * 1756626709; ++var1) {
         for(int var2 = 0; var2 < this.anInt7285 * -447634797; ++var2) {
            for(int var3 = 0; var3 < 1913648871 * this.anInt7286; ++var3) {
               Class552 var4 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
               if(null != var4) {
                  Class639_Sub1_Sub1 var5 = var4.aClass639_Sub1_Sub1_7351;
                  Class639_Sub1_Sub1 var6 = var4.aClass639_Sub1_Sub1_7350;
                  if(null != var5 && var5.method9864((byte)0)) {
                     this.method6596(var5, var1, var2, var3, 1, 1);
                     if(var6 != null && var6.method9864((byte)0)) {
                        this.method6596(var6, var1, var2, var3, 1, 1);
                        var6.method9823(this.aClass174_7279, var5, 0, 0, 0, false, 951026693);
                        var6.method9842(-836067875);
                     }

                     var5.method9842(-840625425);
                  }

                  for(Class546 var7 = var4.aClass546_7357; null != var7; var7 = var7.aClass546_7268) {
                     Class639_Sub1_Sub2 var8 = var7.aClass639_Sub1_Sub2_7267;
                     if(null != var8 && var8.method9864((byte)0)) {
                        this.method6596(var8, var1, var2, var3, var8.aShort11798 - var8.aShort11803 + 1, 1 + (var8.aShort11802 - var8.aShort11799));
                        var8.method9842(-1415910666);
                     }
                  }

                  Class639_Sub1_Sub3 var9 = var4.aClass639_Sub1_Sub3_7355;
                  if(var9 != null && var9.method9864((byte)0)) {
                     this.method6615(var9, var1, var2, var3, (byte)-23);
                     var9.method9842(-818008010);
                  }
               }
            }
         }
      }

   }

   public boolean method6595(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, boolean[] var5, int var6) {
      boolean var7 = false;
      if(this.aClass148Array7292 != this.aClass148Array7288) {
         int var8 = this.aClass148Array7290[var2].method1707(var3, var4, -94563013);

         for(int var9 = 0; var9 <= var2; ++var9) {
            Class148 var10 = this.aClass148Array7290[var9];
            if(null != var10) {
               int var11 = var8 - var10.method1707(var3, var4, -832402852);
               if(null != var5) {
                  var5[var9] = var10.method1711(var1, var3, var11, var4, 0, false);
                  if(!var5[var9]) {
                     continue;
                  }
               }

               var10.method1741(var1, var3, var11, var4, 0, false);
               var7 = true;
            }
         }
      }

      return var7;
   }

   void method6596(Class639_Sub1 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= 1 + var2; ++var12) {
         if(var12 != 1756626709 * this.anInt7284) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.anInt7285 * -447634797) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.anInt7286 * 1913648871 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        Class552 var15 = this.aClass552ArrayArrayArray7287[var12][var13][var14];
                        if(null != var15) {
                           int var16 = (this.aClass148Array7288[var12].method1714(var13, var14, -1841924345) + this.aClass148Array7288[var12].method1714(var13 + 1, var14, 1379965383) + this.aClass148Array7288[var12].method1714(var13, 1 + var14, -1512663757) + this.aClass148Array7288[var12].method1714(1 + var13, var14 + 1, 1646185813)) / 4 - (this.aClass148Array7288[var2].method1714(var3, var4, -762947274) + this.aClass148Array7288[var2].method1714(var3 + 1, var4, -1035089115) + this.aClass148Array7288[var2].method1714(var3, var4 + 1, -1039536905) + this.aClass148Array7288[var2].method1714(1 + var3, var4 + 1, -583288325)) / 4;
                           Class639_Sub1_Sub1 var17 = var15.aClass639_Sub1_Sub1_7351;
                           Class639_Sub1_Sub1 var18 = var15.aClass639_Sub1_Sub1_7350;
                           if(var17 != null && var17.method9864((byte)0)) {
                              var1.method9823(this.aClass174_7279, var17, 776633539 * this.anInt7333 * (var13 - var3) + (1 - var5) * this.anInt7320 * 374552189, var16, (var14 - var4) * this.anInt7333 * 776633539 + (1 - var6) * 374552189 * this.anInt7320, var7, 1348694554);
                           }

                           if(null != var18 && var18.method9864((byte)0)) {
                              var1.method9823(this.aClass174_7279, var18, this.anInt7333 * 776633539 * (var13 - var3) + 374552189 * this.anInt7320 * (1 - var5), var16, (1 - var6) * 374552189 * this.anInt7320 + this.anInt7333 * 776633539 * (var14 - var4), var7, 2094276734);
                           }

                           for(Class546 var19 = var15.aClass546_7357; var19 != null; var19 = var19.aClass546_7268) {
                              Class639_Sub1_Sub2 var20 = var19.aClass639_Sub1_Sub2_7267;
                              if(null != var20 && var20.method9864((byte)0) && (var20.aShort11803 == var13 || var8 == var13) && (var14 == var20.aShort11799 || var14 == var10)) {
                                 int var21 = 1 + (var20.aShort11798 - var20.aShort11803);
                                 int var22 = 1 + (var20.aShort11802 - var20.aShort11799);
                                 var1.method9823(this.aClass174_7279, var20, (var20.aShort11803 - var3) * 776633539 * this.anInt7333 + 374552189 * this.anInt7320 * (var21 - var5), var16, (var22 - var6) * this.anInt7320 * 374552189 + this.anInt7333 * 776633539 * (var20.aShort11799 - var4), var7, 1787370234);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   public void method6597(int var1, int var2, int var3, int var4, byte[][][] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, byte var12, int var13, int var14, boolean var15, boolean var16, int var17, boolean var18) {
      this.aClass562_7300.aBool7559 = true;
      this.aBool7282 = var16;
      this.anInt7311 = 1736546457 * (var2 >> 1705818315 * this.anInt7316);
      this.anInt7312 = (var4 >> this.anInt7316 * 1705818315) * -473994449;
      this.anInt7313 = 1475976901 * var2;
      this.anInt7314 = var4 * -1149459773;
      this.anInt7315 = var3 * 1289707367;
      this.anInt7319 = this.anInt7311 * -1736990495 - this.anInt7304 * 618569909;
      if(1758481353 * this.anInt7319 < 0) {
         this.anInt7306 = -(this.anInt7319 * -802463109);
         this.anInt7319 = 0;
      } else {
         this.anInt7306 = 0;
      }

      this.anInt7322 = this.anInt7312 * -1122602233 - -1605606331 * this.anInt7304;
      if(1873467129 * this.anInt7322 < 0) {
         this.anInt7323 = -(-1522189499 * this.anInt7322);
         this.anInt7322 = 0;
      } else {
         this.anInt7323 = 0;
      }

      this.anInt7321 = -1125299463 * this.anInt7304 + this.anInt7311 * 18923029;
      if(-1780744123 * this.anInt7321 > -447634797 * this.anInt7285) {
         this.anInt7321 = 236839159 * this.anInt7285;
      }

      this.anInt7305 = this.anInt7312 * -952425431 + this.anInt7304 * -528846773;
      if(-1998708937 * this.anInt7305 > this.anInt7286 * 1913648871) {
         this.anInt7305 = -1318396463 * this.anInt7286;
      }

      boolean[][] var19 = this.aBoolArrayArray7337;
      boolean[][] var20 = this.aBoolArrayArray7335;
      int var21;
      int var22;
      if(this.aBool7282) {
         for(var21 = 0; var21 < 2 + 1190212893 * this.anInt7304 + 1190212893 * this.anInt7304; ++var21) {
            var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < 2 + 1190212893 * this.anInt7304 + this.anInt7304 * 1190212893; ++var24) {
               if(var24 > 1) {
                  this.anIntArray7336[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = this.anInt7311 * -522241111 - this.anInt7304 * 1190212893 + var21;
               int var26 = var24 + (this.anInt7312 * 446938063 - this.anInt7304 * 1190212893);
               int var27;
               if(var25 >= 0 && var26 >= 0 && var25 < -447634797 * this.anInt7285 && var26 < 1913648871 * this.anInt7286) {
                  var27 = var25 << this.anInt7316 * 1705818315;
                  int var28 = var26 << this.anInt7316 * 1705818315;
                  int var29 = this.aClass148Array7290[this.aClass148Array7290.length - 1].method1714(var25, var26, -1621554910) - (1000 << this.anInt7316 * 1705818315 - 7);
                  int var30 = (null != this.aClass148Array7292?this.aClass148Array7292[0].method1714(var25, var26, -26203374) + this.anInt7333 * 776633539:this.aClass148Array7290[0].method1714(var25, var26, 1163950271) + 776633539 * this.anInt7333) + (1000 << 1705818315 * this.anInt7316 - 7);
                  var23 = this.aClass174_7279.method2300(var27, var29, var28, var27, var30, var28);
                  this.aBoolArrayArray7335[var21][var24] = 0 == var23;
               } else {
                  var23 = -1;
                  this.aBoolArrayArray7335[var21][var24] = false;
               }

               if(var21 > 0 && var24 > 0) {
                  var27 = this.anIntArray7336[var24 - 1] & this.anIntArray7336[var24] & var22 & var23;
                  this.aBoolArrayArray7337[var21 - 1][var24 - 1] = 0 == var27;
               }
            }

            this.anIntArray7336[this.anInt7304 * 1190212893 + this.anInt7304 * 1190212893] = var22;
            this.anIntArray7336[1 + this.anInt7304 * 1190212893 + 1190212893 * this.anInt7304] = var23;
         }

         if(!var18) {
            this.aClass562_7300.aBool7559 = false;
         } else {
            this.aClass562_7300.anIntArray7571 = var6;
            this.aClass562_7300.anIntArray7578 = var7;
            this.aClass562_7300.anIntArray7577 = var8;
            this.aClass562_7300.anIntArray7580 = var9;
            this.aClass562_7300.anIntArray7581 = var10;
            this.aClass562_7300.method6761(this.aClass174_7279, var11);
         }
      } else {
         if(null == this.aBoolArrayArray7338) {
            this.aBoolArrayArray7338 = new boolean[2 + 1190212893 * this.anInt7304 + this.anInt7304 * 1190212893][2 + this.anInt7304 * 1190212893 + this.anInt7304 * 1190212893];
         }

         for(var21 = 0; var21 < this.aBoolArrayArray7338.length; ++var21) {
            for(var22 = 0; var22 < this.aBoolArrayArray7338[0].length; ++var22) {
               this.aBoolArrayArray7338[var21][var22] = true;
            }
         }

         this.aBoolArrayArray7335 = this.aBoolArrayArray7338;
         this.aBoolArrayArray7337 = this.aBoolArrayArray7338;
         this.anInt7319 = 0;
         this.anInt7322 = 0;
         this.anInt7321 = 236839159 * this.anInt7285;
         this.anInt7305 = this.anInt7286 * -1318396463;
         this.aClass562_7300.aBool7559 = false;
      }

      Class448.method5332(this, this.aClass174_7279, -778741704);
      if(!this.aClass559_7318.aBool7543) {
         Iterator var31 = this.aClass559_7318.aList7541.iterator();

         while(var31.hasNext()) {
            Class555 var32 = (Class555)var31.next();
            var31.remove();
            Class684.method8042(var32, 1725252460);
         }
      }

      if(this.aBool7334) {
         for(var21 = 0; var21 < 1326548865 * this.anInt7328; ++var21) {
            this.aClass556Array7330[var21].method6694(var1, var15, 1724172444);
         }
      }

      if(this.aClass552ArrayArrayArray7277 != null) {
         this.method6564(true, -849701198);
         this.aClass174_7279.method2536(-1, new Class172(1583160, 40, 127, 63, 0, 0, 0));
         this.method6598(true, var5, var11, var12, var17);
         this.aClass174_7279.method2354();
         this.method6564(false, 499269983);
      }

      this.method6598(false, var5, var11, var12, var17);
      if(!this.aBool7282) {
         this.aBoolArrayArray7337 = var19;
         this.aBoolArrayArray7335 = var20;
      }

   }

   void method6598(boolean var1, byte[][][] var2, int var3, byte var4, int var5) {
      int var6 = var1?1:0;
      this.anInt7332 = 0;
      this.anInt7331 = 0;
      this.anInt7274 += 1697133219;
      Class639_Sub1 var7;
      if((var5 & 2) == 0) {
         for(var7 = this.aClass639_Sub1Array7303[var6]; null != var7; var7 = var7.aClass639_Sub1_10825) {
            this.method6599(var7, 864092610);
            if(-1949413091 * var7.anInt10830 != -1 && !this.method6580(var7, var1, var2, var3, var4)) {
               this.aClass639_Sub1Array7309[(this.anInt7332 += -1775064375) * -1410363527 - 1] = var7;
            }
         }
      }

      int var16;
      if(0 == (var5 & 1)) {
         for(var7 = this.aClass639_Sub1Array7293[var6]; null != var7; var7 = var7.aClass639_Sub1_10825) {
            this.method6599(var7, 864092610);
            if(var7.anInt10830 * -1949413091 != -1 && !this.method6580(var7, var1, var2, var3, var4)) {
               this.aClass639_Sub1Array7308[(this.anInt7331 += -1390317801) * 174635175 - 1] = var7;
            }
         }

         for(var7 = this.aClass639_Sub1Array7307[var6]; null != var7; var7 = var7.aClass639_Sub1_10825) {
            this.method6599(var7, 864092610);
            if(-1 != -1949413091 * var7.anInt10830 && !this.method6580(var7, var1, var2, var3, var4)) {
               if(var7.method9822(-380262649)) {
                  this.aClass639_Sub1Array7308[(this.anInt7331 += -1390317801) * 174635175 - 1] = var7;
               } else {
                  this.aClass639_Sub1Array7309[(this.anInt7332 += -1775064375) * -1410363527 - 1] = var7;
               }
            }
         }

         if(!var1) {
            for(var16 = 0; var16 < 265320843 * this.anInt7299; ++var16) {
               this.method6599(this.aClass639_Sub1_Sub2Array7310[var16], 864092610);
               if(-1949413091 * this.aClass639_Sub1_Sub2Array7310[var16].anInt10830 != -1 && !this.method6580(this.aClass639_Sub1_Sub2Array7310[var16], var1, var2, var3, var4)) {
                  if(this.aClass639_Sub1_Sub2Array7310[var16].method9822(-1631910522)) {
                     this.aClass639_Sub1Array7308[(this.anInt7331 += -1390317801) * 174635175 - 1] = this.aClass639_Sub1_Sub2Array7310[var16];
                  } else {
                     this.aClass639_Sub1Array7309[(this.anInt7332 += -1775064375) * -1410363527 - 1] = this.aClass639_Sub1_Sub2Array7310[var16];
                  }
               }
            }
         }
      }

      if(-1410363527 * this.anInt7332 > 0) {
         this.method6600(this.aClass639_Sub1Array7309, 0, -1410363527 * this.anInt7332 - 1);

         for(var16 = 0; var16 < this.anInt7332 * -1410363527; ++var16) {
            this.method6624(this.aClass639_Sub1Array7309[var16], this.aClass526_Sub16Array7325);
         }
      }

      if(this.aBool7334) {
         this.aClass174_7279.method2336(0, (Class526_Sub16[])null);
      }

      if((var5 & 2) == 0) {
         for(var16 = 0; var16 < 1756626709 * this.anInt7284; ++var16) {
            int var8;
            int var9;
            boolean[][] var10;
            int var11;
            int var12;
            int var13;
            if(var16 >= var3 && null != var2) {
               var8 = this.aBoolArrayArray7337.length;
               if(this.anInt7319 * 1758481353 + this.aBoolArrayArray7337.length > this.anInt7285 * -447634797) {
                  var8 -= this.aBoolArrayArray7337.length + this.anInt7319 * 1758481353 - -447634797 * this.anInt7285;
               }

               var9 = this.aBoolArrayArray7337[0].length;
               if(this.aBoolArrayArray7337[0].length + this.anInt7322 * 1873467129 > 1913648871 * this.anInt7286) {
                  var9 -= this.anInt7322 * 1873467129 + this.aBoolArrayArray7337[0].length - 1913648871 * this.anInt7286;
               }

               var10 = this.aBoolArrayArray7335;
               if(this.aBool7282) {
                  for(var11 = 1984596363 * this.anInt7306; var11 < var8; ++var11) {
                     var12 = var11 + this.anInt7319 * 1758481353 - this.anInt7306 * 1984596363;

                     for(var13 = 649432613 * this.anInt7323; var13 < var9; ++var13) {
                        var10[var11][var13] = false;
                        if(this.aBoolArrayArray7337[var11][var13]) {
                           int var14 = var13 + 1873467129 * this.anInt7322 - this.anInt7323 * 649432613;

                           for(int var15 = var16; var15 >= 0; --var15) {
                              if(null != this.aClass552ArrayArrayArray7287[var15][var12][var14] && this.aClass552ArrayArrayArray7287[var15][var12][var14].aByte7354 == var16) {
                                 if((var15 < var3 || var2[var15][var12][var14] != var4) && !this.aClass562_7300.method6763(var16, var12, var14)) {
                                    var10[var11][var13] = true;
                                    break;
                                 }

                                 var10[var11][var13] = false;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               this.aClass148Array7288[var16].method1709(-522241111 * this.anInt7311, this.anInt7312 * 446938063, this.anInt7304 * 1190212893, this.aBoolArrayArray7335, false, var5);
            } else {
               var8 = this.aBoolArrayArray7337.length;
               if(this.aBoolArrayArray7337.length + this.anInt7319 * 1758481353 > -447634797 * this.anInt7285) {
                  var8 -= this.anInt7319 * 1758481353 + this.aBoolArrayArray7337.length - -447634797 * this.anInt7285;
               }

               var9 = this.aBoolArrayArray7337[0].length;
               if(1873467129 * this.anInt7322 + this.aBoolArrayArray7337[0].length > 1913648871 * this.anInt7286) {
                  var9 -= this.aBoolArrayArray7337[0].length + 1873467129 * this.anInt7322 - this.anInt7286 * 1913648871;
               }

               var10 = this.aBoolArrayArray7335;
               if(this.aBool7282) {
                  for(var11 = this.anInt7306 * 1984596363; var11 < var8; ++var11) {
                     var12 = this.anInt7319 * 1758481353 + var11 - this.anInt7306 * 1984596363;

                     for(var13 = this.anInt7323 * 649432613; var13 < var9; ++var13) {
                        if(this.aBoolArrayArray7337[var11][var13] && !this.aClass562_7300.method6763(var16, var12, var13 + 1873467129 * this.anInt7322 - 649432613 * this.anInt7323)) {
                           var10[var11][var13] = true;
                        } else {
                           var10[var11][var13] = false;
                        }
                     }
                  }
               }

               this.aClass148Array7288[var16].method1709(-522241111 * this.anInt7311, this.anInt7312 * 446938063, 1190212893 * this.anInt7304, this.aBoolArrayArray7335, true, var5);
            }
         }
      }

      if(this.anInt7331 * 174635175 > 0) {
         this.method6631(this.aClass639_Sub1Array7308, 0, 174635175 * this.anInt7331 - 1);

         for(var16 = 0; var16 < 174635175 * this.anInt7331; ++var16) {
            this.method6624(this.aClass639_Sub1Array7308[var16], this.aClass526_Sub16Array7325);
         }
      }

   }

   void method6599(Class639_Sub1 var1, int var2) {
      Class446 var3 = var1.method7635().aClass446_4816;
      this.aClass174_7279.method2513((float)((int)var3.aFloat4917), (float)((int)var3.aFloat4915 + (var1.method9832((byte)19) >> 1)), (float)((int)var3.aFloat4919), this.aFloatArray7324);
      var1.anInt10830 = 1840576821 * (int)this.aFloatArray7324[2];
   }

   void method6600(Class639_Sub1[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         Class639_Sub1 var6 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var6;
         int var7 = -1949413091 * var6.anInt10830;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(var1[var8].anInt10830 * -1949413091 < (var8 & 1) + var7) {
               Class639_Sub1 var9 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var9;
            }
         }

         var1[var3] = var1[var5];
         var1[var5] = var6;
         this.method6600(var1, var2, var5 - 1);
         this.method6600(var1, 1 + var5, var3);
      }

   }

   public void method6601(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, boolean[] var5, byte var6) {
      if(this.aClass148Array7288 != this.aClass148Array7292) {
         int var7 = this.aClass148Array7290[var2].method1707(var3, var4, -1702502953);

         for(int var8 = 0; var8 <= var2; ++var8) {
            if(var5 == null || var5[var8]) {
               Class148 var9 = this.aClass148Array7290[var8];
               if(null != var9) {
                  var9.method1710(var1, var3, var7 - var9.method1707(var3, var4, 333704680), var4, 0, false);
               }
            }
         }
      }

   }

   public void method6602(Class556 var1, int var2) {
      if(this.anInt7328 * 1326548865 < '\ufeb8') {
         Class526_Sub16 var3 = var1.aClass526_Sub16_7504;
         this.aClass556Array7330[1326548865 * this.anInt7328] = var1;
         this.aBoolArray7278[this.anInt7328 * 1326548865] = false;
         this.anInt7328 += 1103542401;
         int var4 = var1.anInt7507 * 130215759;
         if(var1.aBool7501) {
            var4 = 0;
         }

         int var5 = var1.anInt7507 * 130215759;
         if(var1.aBool7505) {
            var5 = 1756626709 * this.anInt7284 - 1;
         }

         for(int var6 = var4; var6 <= var5; ++var6) {
            int var7 = 0;
            int var8 = var3.method9392((byte)-19) - var3.method9422((short)8192) + 374552189 * this.anInt7320 >> 1705818315 * this.anInt7316;
            if(var8 < 0) {
               var7 -= var8;
               var8 = 0;
            }

            int var9 = var3.method9392((byte)-47) + var3.method9422((short)8192) - this.anInt7320 * 374552189 >> this.anInt7316 * 1705818315;
            if(var9 >= this.anInt7286 * 1913648871) {
               var9 = this.anInt7286 * 1913648871 - 1;
            }

            for(int var10 = var8; var10 <= var9; ++var10) {
               short var11 = var1.aShortArray7485[var7++];
               int var12 = (var3.method9390((byte)-43) - var3.method9422((short)8192) + this.anInt7320 * 374552189 >> 1705818315 * this.anInt7316) + (var11 >>> 8);
               int var13 = var12 + (var11 & 255) - 1;
               if(var12 < 0) {
                  var12 = 0;
               }

               if(var13 >= this.anInt7285 * -447634797) {
                  var13 = this.anInt7285 * -447634797 - 1;
               }

               for(int var14 = var12; var14 <= var13; ++var14) {
                  long var15 = this.aLongArrayArrayArray7329[var6][var14][var10];
                  if(0L == (var15 & 65535L)) {
                     this.aLongArrayArrayArray7329[var6][var14][var10] = var15 | (long)(this.anInt7328 * 1326548865);
                  } else if((var15 & 4294901760L) == 0L) {
                     this.aLongArrayArrayArray7329[var6][var14][var10] = var15 | (long)(1326548865 * this.anInt7328) << 16;
                  } else if(0L == (var15 & 281470681743360L)) {
                     this.aLongArrayArrayArray7329[var6][var14][var10] = var15 | (long)(1326548865 * this.anInt7328) << 32;
                  } else if(0L == (var15 & -281474976710656L)) {
                     this.aLongArrayArrayArray7329[var6][var14][var10] = var15 | (long)(this.anInt7328 * 1326548865) << 48;
                  }
               }
            }
         }

         if(-474514879 * var1.anInt7500 != -1) {
            Object var17 = (List)this.aHashMap7327.get(Integer.valueOf(-474514879 * var1.anInt7500));
            if(null == var17) {
               var17 = new ArrayList();
               this.aHashMap7327.put(Integer.valueOf(-474514879 * var1.anInt7500), var17);
            }

            ((List)var17).add(var1);
            Class526_Sub16 var18 = (Class526_Sub16)this.aHashMap7276.get(Integer.valueOf(-474514879 * var1.anInt7500));
            if(var18 != null) {
               var1.aClass526_Sub16_7504.method9400(var18.method9394(-167852239), (byte)-96);
               var1.aClass526_Sub16_7504.method9396(var18.method9398(1807736207), var18.method9399(1610830903), -313185339);
            }
         }

      }
   }

   public void method6603(byte var1) {
      for(int var2 = 0; var2 < this.anInt7328 * 1326548865; ++var2) {
         if(!this.aBoolArray7278[var2]) {
            Class556 var3 = this.aClass556Array7330[var2];
            Class526_Sub16 var4 = var3.aClass526_Sub16_7504;
            int var5 = var3.anInt7507 * 130215759;
            int var6 = var4.method9422((short)8192) - this.anInt7320 * 374552189;
            int var7 = 1 + (2 * var6 >> 1705818315 * this.anInt7316);
            int var8 = 0;
            int[] var9 = new int[var7 * var7];
            int var10 = var4.method9390((byte)-118) - var6 >> 1705818315 * this.anInt7316;
            int var11 = var4.method9392((byte)-34) - var6 >> this.anInt7316 * 1705818315;
            int var12 = var4.method9392((byte)-47) + var6 >> 1705818315 * this.anInt7316;
            if(var11 < 0) {
               var8 -= var11;
               var11 = 0;
            }

            if(var12 >= this.anInt7286 * 1913648871) {
               var12 = 1913648871 * this.anInt7286 - 1;
            }

            for(int var13 = var11; var13 <= var12; ++var13) {
               short var14 = var3.aShortArray7485[var8];
               int var15 = var14 >>> 8;
               int var16 = var8 * var7 + var15;
               int var17 = (var14 >>> 8) + var10;
               int var18 = (var14 & 255) + var17 - 1;
               if(var17 < 0) {
                  var16 -= var17;
                  var17 = 0;
               }

               if(var18 >= -447634797 * this.anInt7285) {
                  var18 = this.anInt7285 * -447634797 - 1;
               }

               for(int var19 = var17; var19 <= var18; ++var19) {
                  byte var20 = 1;
                  Class639_Sub1_Sub2 var21 = this.method6591(var5, var19, var13, (Interface64)null, 1739430101);
                  if(var21 != null && 0 != var21.aByte11797) {
                     boolean var22;
                     boolean var23;
                     short var24;
                     int var25;
                     int var26;
                     if(var21.aByte11797 == 1) {
                        var22 = var19 - 1 >= var17;
                        var23 = 1 + var19 <= var18;
                        if(!var22 && var13 + 1 <= var12) {
                           var24 = var3.aShortArray7485[1 + var8];
                           var25 = (var24 >>> 8) + var10;
                           var26 = (var24 & 255) + var25;
                           var22 = var19 > var25 && var19 < var26;
                        }

                        if(!var23 && var13 - 1 >= var11) {
                           var24 = var3.aShortArray7485[var8 - 1];
                           var25 = (var24 >>> 8) + var10;
                           var26 = (var24 & 255) + var25;
                           var23 = var19 > var25 && var19 < var26;
                        }

                        if(var22 && !var23) {
                           var20 = 4;
                        } else if(var23 && !var22) {
                           var20 = 2;
                        }
                     } else {
                        var22 = var19 - 1 >= var17;
                        var23 = 1 + var19 <= var18;
                        if(!var22 && var13 - 1 >= var11) {
                           var24 = var3.aShortArray7485[var8 - 1];
                           var25 = var10 + (var24 >>> 8);
                           var26 = var25 + (var24 & 255);
                           var22 = var19 > var25 && var19 < var26;
                        }

                        if(!var23 && var13 + 1 <= var12) {
                           var24 = var3.aShortArray7485[var8 + 1];
                           var25 = (var24 >>> 8) + var10;
                           var26 = (var24 & 255) + var25;
                           var23 = var19 > var25 && var19 < var26;
                        }

                        if(var22 && !var23) {
                           var20 = 3;
                        } else if(var23 && !var22) {
                           var20 = 5;
                        }
                     }
                  }

                  var9[var16++] = var20;
               }

               ++var8;
            }

            this.aBoolArray7278[var2] = true;
            if(aBool7291) {
               this.aClass148Array7288[var5].method1742(var4, var9);
            }
         }
      }

   }

   public void method6604(int var1, int var2, int var3, byte var4) {
      List var5 = (List)this.aHashMap7327.get(Integer.valueOf(var1));
      if(null != var5) {
         Iterator var6 = var5.iterator();

         while(var6.hasNext()) {
            Class556 var7 = (Class556)var6.next();
            var7.aClass526_Sub16_7504.method9396(var2, var3, 1739215415);
         }

      }
   }

   public void method6605(int var1) {
   }

   public void method6606(int var1) {
   }

   public void method6607(int var1) {
   }

   public void method6608() {
      for(int var1 = 0; var1 < -447634797 * this.anInt7285; ++var1) {
         for(int var2 = 0; var2 < this.anInt7286 * 1913648871; ++var2) {
            if(this.aClass552ArrayArrayArray7287[0][var1][var2] == null) {
               this.aClass552ArrayArrayArray7287[0][var1][var2] = new Class552(0);
            }
         }
      }

   }

   public void method6609() {
      for(int var1 = 0; var1 < -447634797 * this.anInt7285; ++var1) {
         for(int var2 = 0; var2 < this.anInt7286 * 1913648871; ++var2) {
            if(this.aClass552ArrayArrayArray7287[0][var1][var2] == null) {
               this.aClass552ArrayArrayArray7287[0][var1][var2] = new Class552(0);
            }
         }
      }

   }

   public void method6610(int var1, int var2) {
      Class552 var3 = this.aClass552ArrayArrayArray7287[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         Class552 var5 = this.aClass552ArrayArrayArray7287[var4][var1][var2] = this.aClass552ArrayArrayArray7287[var4 + 1][var1][var2];
         if(null != var5) {
            for(Class546 var6 = var5.aClass546_7357; var6 != null; var6 = var6.aClass546_7268) {
               Class639_Sub1_Sub2 var7 = var6.aClass639_Sub1_Sub2_7267;
               if(var1 == var7.aShort11803 && var7.aShort11799 == var2) {
                  --var7.aByte10827;
               }
            }

            if(var5.aClass639_Sub1_Sub3_7355 != null) {
               --var5.aClass639_Sub1_Sub3_7355.aByte10827;
            }

            if(var5.aClass639_Sub1_Sub1_7351 != null) {
               --var5.aClass639_Sub1_Sub1_7351.aByte10827;
            }

            if(null != var5.aClass639_Sub1_Sub1_7350) {
               --var5.aClass639_Sub1_Sub1_7350.aByte10827;
            }

            if(null != var5.aClass639_Sub1_Sub5_7353) {
               --var5.aClass639_Sub1_Sub5_7353.aByte10827;
            }

            if(var5.aClass639_Sub1_Sub5_7352 != null) {
               --var5.aClass639_Sub1_Sub5_7352.aByte10827;
            }
         }
      }

      if(this.aClass552ArrayArrayArray7287[0][var1][var2] == null) {
         this.aClass552ArrayArrayArray7287[0][var1][var2] = new Class552(0);
         this.aClass552ArrayArrayArray7287[0][var1][var2].aByte7354 = 1;
      }

      this.aClass552ArrayArrayArray7287[0][var1][var2].aClass552_7359 = var3;
      this.aClass552ArrayArrayArray7287[3][var1][var2] = null;
   }

   public void method6611(int var1, int var2, int var3, int var4, int var5) {
      Class552 var6 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(null != var6) {
         Class639_Sub1_Sub5 var7 = var6.aClass639_Sub1_Sub5_7353;
         Class639_Sub1_Sub5 var8 = var6.aClass639_Sub1_Sub5_7352;
         if(var7 != null) {
            var7.aShort11854 = (short)(var4 * var7.aShort11854 / (16 << 1705818315 * this.anInt7316 - 7));
            var7.aShort11856 = (short)(var7.aShort11856 * var4 / (16 << 1705818315 * this.anInt7316 - 7));
         }

         if(var8 != null) {
            var8.aShort11854 = (short)(var4 * var8.aShort11854 / (16 << this.anInt7316 * 1705818315 - 7));
            var8.aShort11856 = (short)(var8.aShort11856 * var4 / (16 << this.anInt7316 * 1705818315 - 7));
         }

      }
   }

   public Class639_Sub1_Sub1 method6612(int var1, int var2, int var3, byte var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      return null == var5?null:var5.aClass639_Sub1_Sub1_7350;
   }

   public int method6613(int var1, int var2, int var3) {
      return null != this.anIntArrayArray7302?this.anIntArrayArray7302[var1][var2] & 16777215:0;
   }

   public int method6614(int var1, int var2, byte var3) {
      return null != this.aByteArrayArray7317?this.aByteArrayArray7317[var1][var2] & 255:0;
   }

   void method6615(Class639_Sub1 var1, int var2, int var3, int var4, byte var5) {
      Class552 var6;
      int var7;
      if(var3 < this.anInt7285 * -447634797) {
         var6 = this.aClass552ArrayArrayArray7287[var2][1 + var3][var4];
         if(null != var6 && null != var6.aClass639_Sub1_Sub3_7355 && var6.aClass639_Sub1_Sub3_7355.method9864((byte)0)) {
            var7 = (this.aClass148Array7288[var2].method1714(var3 + 1, var4, 595260659) + this.aClass148Array7288[var2].method1714(1 + 1 + var3, var4, -731047223) + this.aClass148Array7288[var2].method1714(var3 + 1, var4 + 1, -1200343242) + this.aClass148Array7288[var2].method1714(1 + var3 + 1, var4 + 1, 1648228024)) / 4 - (this.aClass148Array7288[var2].method1714(var3, var4, 1187562686) + this.aClass148Array7288[var2].method1714(1 + var3, var4, 1232915821) + this.aClass148Array7288[var2].method1714(var3, 1 + var4, -1754312862) + this.aClass148Array7288[var2].method1714(var3 + 1, 1 + var4, 1939924769)) / 4;
            var1.method9823(this.aClass174_7279, var6.aClass639_Sub1_Sub3_7355, this.anInt7333 * 776633539, var7, 0, true, 1671865848);
         }
      }

      if(var4 < -447634797 * this.anInt7285) {
         var6 = this.aClass552ArrayArrayArray7287[var2][var3][1 + var4];
         if(null != var6 && null != var6.aClass639_Sub1_Sub3_7355 && var6.aClass639_Sub1_Sub3_7355.method9864((byte)0)) {
            var7 = (this.aClass148Array7288[var2].method1714(var3, var4, -1788041536) + this.aClass148Array7288[var2].method1714(var3 + 1, 1 + var4, -831152772) + this.aClass148Array7288[var2].method1714(var3, 1 + 1 + var4, 961489871) + this.aClass148Array7288[var2].method1714(1 + var3, 1 + var4 + 1, 1245733290)) / 4 - (this.aClass148Array7288[var2].method1714(var3, var4, -922489487) + this.aClass148Array7288[var2].method1714(1 + var3, var4, 1363612516) + this.aClass148Array7288[var2].method1714(var3, var4 + 1, 56032766) + this.aClass148Array7288[var2].method1714(1 + var3, var4 + 1, -120932089)) / 4;
            var1.method9823(this.aClass174_7279, var6.aClass639_Sub1_Sub3_7355, 0, var7, 776633539 * this.anInt7333, true, 881721169);
         }
      }

      if(var3 < this.anInt7285 * -447634797 && var4 < 1913648871 * this.anInt7286) {
         var6 = this.aClass552ArrayArrayArray7287[var2][var3 + 1][1 + var4];
         if(var6 != null && null != var6.aClass639_Sub1_Sub3_7355 && var6.aClass639_Sub1_Sub3_7355.method9864((byte)0)) {
            var7 = (this.aClass148Array7288[var2].method1714(1 + var3, 1 + var4, 1207538138) + this.aClass148Array7288[var2].method1714(1 + var3 + 1, 1 + var4, 1589356704) + this.aClass148Array7288[var2].method1714(var3 + 1, 1 + var4 + 1, -1241417984) + this.aClass148Array7288[var2].method1714(var3 + 1 + 1, 1 + 1 + var4, 1017983484)) / 4 - (this.aClass148Array7288[var2].method1714(var3, var4, -58821228) + this.aClass148Array7288[var2].method1714(var3 + 1, var4, -1059071555) + this.aClass148Array7288[var2].method1714(var3, 1 + var4, 737880436) + this.aClass148Array7288[var2].method1714(var3 + 1, var4 + 1, 1520055648)) / 4;
            var1.method9823(this.aClass174_7279, var6.aClass639_Sub1_Sub3_7355, 776633539 * this.anInt7333, var7, 776633539 * this.anInt7333, true, 2062184889);
         }
      }

      if(var3 < this.anInt7285 * -447634797 && var4 > 0) {
         var6 = this.aClass552ArrayArrayArray7287[var2][var3 + 1][var4 - 1];
         if(null != var6 && null != var6.aClass639_Sub1_Sub3_7355 && var6.aClass639_Sub1_Sub3_7355.method9864((byte)0)) {
            var7 = (this.aClass148Array7288[var2].method1714(var3 + 1, var4 - 1, -980949819) + this.aClass148Array7288[var2].method1714(var3 + 1 + 1, var4 - 1, -2005305257) + this.aClass148Array7288[var2].method1714(var3 + 1, 1 + var4 - 1, -1522062454) + this.aClass148Array7288[var2].method1714(1 + 1 + var3, var4 + 1 - 1, 518242836)) / 4 - (this.aClass148Array7288[var2].method1714(var3, var4, -463710166) + this.aClass148Array7288[var2].method1714(var3 + 1, var4, 995573020) + this.aClass148Array7288[var2].method1714(var3, 1 + var4, -1584006907) + this.aClass148Array7288[var2].method1714(var3 + 1, var4 + 1, -1879957744)) / 4;
            var1.method9823(this.aClass174_7279, var6.aClass639_Sub1_Sub3_7355, 776633539 * this.anInt7333, var7, -(this.anInt7333 * 776633539), true, 2070511967);
         }
      }

   }

   public void method6616() {
      for(int var1 = 0; var1 < this.anInt7299 * 265320843; ++var1) {
         Class639_Sub1_Sub2 var2 = this.aClass639_Sub1_Sub2Array7310[var1];
         this.method6627(var2, true, 2025997174);
         this.aClass639_Sub1_Sub2Array7310[var1] = null;
      }

      this.anInt7299 = 0;
   }

   public void method6617() {
      for(int var1 = 0; var1 < this.anInt7299 * 265320843; ++var1) {
         Class639_Sub1_Sub2 var2 = this.aClass639_Sub1_Sub2Array7310[var1];
         this.method6627(var2, true, -492790400);
         this.aClass639_Sub1_Sub2Array7310[var1] = null;
      }

      this.anInt7299 = 0;
   }

   Class552 method6618(int var1, int var2, int var3, byte var4) {
      if(this.aClass552ArrayArrayArray7287[var1][var2][var3] == null) {
         boolean var5 = null != this.aClass552ArrayArrayArray7287[0][var2][var3] && this.aClass552ArrayArrayArray7287[0][var2][var3].aClass552_7359 != null;
         if(var5 && var1 >= this.anInt7284 * 1756626709 - 1) {
            return null;
         }

         this.method6562(var1, var2, var3, -2026070575);
      }

      return this.aClass552ArrayArrayArray7287[var1][var2][var3];
   }

   void method6619(int var1, int var2, int var3) {
      Class526_Sub21_Sub5 var4 = null;

      for(int var5 = var1; var5 < var2; ++var5) {
         Class148 var6 = this.aClass148Array7290[var5];
         if(null != var6) {
            for(int var7 = 0; var7 < 1913648871 * this.anInt7286; ++var7) {
               for(int var8 = 0; var8 < -447634797 * this.anInt7285; ++var8) {
                  var4 = var6.method1708(var8, var7, var4);
                  if(null != var4) {
                     int var9 = var8 << this.anInt7316 * 1705818315;
                     int var10 = var7 << this.anInt7316 * 1705818315;

                     for(int var11 = var5 - 1; var11 >= 0; --var11) {
                        Class148 var12 = this.aClass148Array7290[var11];
                        if(var12 != null) {
                           int var13 = var6.method1714(var8, var7, -1525764060) - var12.method1714(var8, var7, -1234287168);
                           int var14 = var6.method1714(var8 + 1, var7, -1359822212) - var12.method1714(1 + var8, var7, -945152371);
                           int var15 = var6.method1714(var8 + 1, 1 + var7, -1224144122) - var12.method1714(var8 + 1, 1 + var7, -1769700197);
                           int var16 = var6.method1714(var8, 1 + var7, 1304107870) - var12.method1714(var8, var7 + 1, -2011147278);
                           var12.method1741(var4, var9, (var16 + var14 + var13 + var15) / 4, var10, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public int method6620(int var1, int var2) {
      return null != this.aShortArrayArray7294?this.aShortArrayArray7294[var1][var2] & '\uffff':0;
   }

   public void method6621(HashMap var1, int var2) {
      this.aHashMap7276 = var1;
   }

   public Class549(Class174 var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      this.aClass174_7279 = var1;
      this.aBool7334 = this.aClass174_7279.method2334() > 0;
      this.anInt7316 = var2 * -505942813;
      this.anInt7333 = (1 << this.anInt7316 * 1705818315) * -1168174101;
      this.anInt7320 = -1602194731 * (this.anInt7333 * 776633539 >> 1);
      this.anInt7284 = var3 * 1257855037;
      this.anInt7285 = var4 * 1723386779;
      this.anInt7286 = var5 * -271926057;
      this.anInt7304 = 1753560373 * var6;
      this.aClass30_7280 = new Class30();
      this.aClass562_7300 = new Class562(this);
      this.aClass552ArrayArrayArray7289 = new Class552[var3][-447634797 * this.anInt7285][1913648871 * this.anInt7286];
      this.aClass148Array7290 = new Class148[var3];
      if(var7) {
         this.anIntArrayArray7302 = new int[this.anInt7285 * -447634797][1913648871 * this.anInt7286];
         this.aByteArrayArray7295 = new byte[this.anInt7285 * -447634797][1913648871 * this.anInt7286];
         this.aShortArrayArray7294 = new short[this.anInt7285 * -447634797][this.anInt7286 * 1913648871];
         this.aByteArrayArray7296 = new byte[this.anInt7285 * -447634797][1913648871 * this.anInt7286];
         this.aByteArrayArray7317 = new byte[this.anInt7285 * -447634797][1913648871 * this.anInt7286];
         this.aByteArrayArray7283 = new byte[-447634797 * this.anInt7285][this.anInt7286 * 1913648871];
         this.aClass552ArrayArrayArray7277 = new Class552[1][-447634797 * this.anInt7285][1913648871 * this.anInt7286];
         this.aClass148Array7292 = new Class148[1];
      }

      if(var8) {
         this.aLongArrayArrayArray7329 = new long[var3][var4][var5];
         this.aClass556Array7330 = new Class556['\ufeb8'];
         this.aBoolArray7278 = new boolean['\ufeb8'];
         this.anInt7328 = 0;
      }

      this.method6564(false, 1037569681);
      this.aClass639_Sub1Array7303 = new Class639_Sub1[2];
      this.aClass639_Sub1Array7293 = new Class639_Sub1[2];
      this.aClass639_Sub1Array7307 = new Class639_Sub1[2];
      this.aClass639_Sub1Array7309 = new Class639_Sub1[10017];
      this.anInt7332 = 0;
      this.aClass639_Sub1Array7308 = new Class639_Sub1[5023];
      this.anInt7331 = 0;
      this.aClass639_Sub1_Sub2Array7310 = new Class639_Sub1_Sub2[5015];
      this.anInt7299 = 0;
      this.aBoolArrayArray7337 = new boolean[1 + this.anInt7304 * 1190212893 + 1190212893 * this.anInt7304][this.anInt7304 * 1190212893 + this.anInt7304 * 1190212893 + 1];
      this.aBoolArrayArray7335 = new boolean[1190212893 * this.anInt7304 + this.anInt7304 * 1190212893 + 2][this.anInt7304 * 1190212893 + 1190212893 * this.anInt7304 + 2];
      this.anIntArray7336 = new int[2 + this.anInt7304 * 1190212893 + this.anInt7304 * 1190212893];
      this.aClass559_7318 = new Class559(false);
   }

   public void method6622(int var1, int var2) {
   }

   public HashMap method6623(byte var1) {
      this.aHashMap7276.clear();
      Iterator var2 = this.aHashMap7327.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         this.aHashMap7276.put(var3.getKey(), ((Class556)((List)var3.getValue()).get(0)).aClass526_Sub16_7504);
      }

      return this.aHashMap7276;
   }

   void method6624(Class639_Sub1 var1, Class526_Sub16[] var2) {
      int var3;
      if(this.aBool7334) {
         var3 = var1.method9817(var2, 837798775);
         this.aClass174_7279.method2336(var3, var2);
      }

      if(this.aClass148Array7292 == this.aClass148Array7288) {
         boolean var7 = false;
         boolean var4 = false;
         Class446 var5 = var1.method7635().aClass446_4816;
         int var8;
         if(var1 instanceof Class639_Sub1_Sub2) {
            var3 = ((Class639_Sub1_Sub2)var1).aShort11803;
            var8 = ((Class639_Sub1_Sub2)var1).aShort11799;
         } else {
            var3 = (int)var5.aFloat4917 >> 1705818315 * this.anInt7316;
            var8 = (int)var5.aFloat4919 >> 1705818315 * this.anInt7316;
         }

         var3 = Math.min(this.anInt7285 * -447634797 - 1, Math.max(0, var3));
         var8 = Math.min(1913648871 * this.anInt7286 - 1, Math.max(0, var8));
         Class172 var6 = new Class172();
         var6.anInt2019 = this.method6613(var3, var8, -1040105921) * -1687600729;
         var6.anInt2020 = this.method6569(var3, var8, (byte)114) * 440036469;
         var6.anInt2018 = this.method6571(var3, var8, -2070233570) * -1588695373;
         var6.anInt2022 = this.method6572(var3, var8, 1688592518) * -1126721515;
         var6.anInt2023 = this.method6614(var3, var8, (byte)1) * 137365799;
         var6.anInt2024 = this.method6574(var3, var8, (short)11960) * 66315777;
         this.aClass174_7279.method2353(this.aClass148Array7290[0].method1707((int)var5.aFloat4917, (int)var5.aFloat4919, -1512888088), var6);
      }

      Class555 var9 = var1.method9825(this.aClass174_7279, 2115892005);
      if(var9 != null) {
         if(var9.aBool7479) {
            var9.aClass639_Sub1_7477 = var1;
            this.aClass559_7318.method6719(var9, (byte)59);
         } else {
            Class684.method8042(var9, 1645591282);
         }
      }

   }

   public void method6625() {
      for(int var1 = 0; var1 < this.anInt7284 * 1756626709; ++var1) {
         for(int var2 = 0; var2 < this.anInt7285 * -447634797; ++var2) {
            for(int var3 = 0; var3 < 1913648871 * this.anInt7286; ++var3) {
               Class552 var4 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
               if(null != var4) {
                  Class639_Sub1_Sub1 var5 = var4.aClass639_Sub1_Sub1_7351;
                  Class639_Sub1_Sub1 var6 = var4.aClass639_Sub1_Sub1_7350;
                  if(null != var5 && var5.method9864((byte)0)) {
                     this.method6596(var5, var1, var2, var3, 1, 1);
                     if(var6 != null && var6.method9864((byte)0)) {
                        this.method6596(var6, var1, var2, var3, 1, 1);
                        var6.method9823(this.aClass174_7279, var5, 0, 0, 0, false, 1046382535);
                        var6.method9842(-60810603);
                     }

                     var5.method9842(-1742689088);
                  }

                  for(Class546 var7 = var4.aClass546_7357; null != var7; var7 = var7.aClass546_7268) {
                     Class639_Sub1_Sub2 var8 = var7.aClass639_Sub1_Sub2_7267;
                     if(null != var8 && var8.method9864((byte)0)) {
                        this.method6596(var8, var1, var2, var3, var8.aShort11798 - var8.aShort11803 + 1, 1 + (var8.aShort11802 - var8.aShort11799));
                        var8.method9842(-1063245963);
                     }
                  }

                  Class639_Sub1_Sub3 var9 = var4.aClass639_Sub1_Sub3_7355;
                  if(var9 != null && var9.method9864((byte)0)) {
                     this.method6615(var9, var1, var2, var3, (byte)-106);
                     var9.method9842(-1174302234);
                  }
               }
            }
         }
      }

   }

   public Class639_Sub1_Sub5 method6626(int var1, int var2, int var3, int var4) {
      Class552 var5 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(null != var5) {
         this.method6588(var5.aClass639_Sub1_Sub5_7353, -2038059516);
         if(null != var5.aClass639_Sub1_Sub5_7353) {
            Class639_Sub1_Sub5 var6 = var5.aClass639_Sub1_Sub5_7353;
            var5.aClass639_Sub1_Sub5_7353 = null;
            return var6;
         }
      }

      return null;
   }

   void method6627(Class639_Sub1_Sub2 var1, boolean var2, int var3) {
      int var4 = Math.min(-447634797 * this.anInt7285 - 1, Math.max(0, var1.aShort11803));
      int var5 = Math.min(-447634797 * this.anInt7285 - 1, Math.max(0, var1.aShort11798));
      int var6 = Math.min(1913648871 * this.anInt7286 - 1, Math.max(0, var1.aShort11799));
      int var7 = Math.min(this.anInt7286 * 1913648871 - 1, Math.max(0, var1.aShort11802));

      for(int var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = var6; var9 <= var7; ++var9) {
            Class552 var10 = this.aClass552ArrayArrayArray7287[var1.aByte10827][var8][var9];
            if(null != var10) {
               Class546 var11 = var10.aClass546_7357;

               for(Class546 var12 = null; null != var11; var11 = var11.aClass546_7268) {
                  if(var11.aClass639_Sub1_Sub2_7267 == var1) {
                     if(null != var12) {
                        var12.aClass546_7268 = var11.aClass546_7268;
                     } else {
                        var10.aClass546_7357 = var11.aClass546_7268;
                     }

                     var11.method6516(1031107158);
                     break;
                  }

                  var12 = var11;
               }
            }
         }
      }

      if(!var2) {
         this.method6588(var1, -2038059516);
      }

   }

   public Class639_Sub1_Sub2 method6628(int var1, int var2, int var3, Interface64 var4, int var5) {
      Class552 var6 = this.aClass552ArrayArrayArray7287[var1][var2][var3];
      if(var6 == null) {
         return null;
      } else {
         for(Class546 var7 = var6.aClass546_7357; null != var7; var7 = var7.aClass546_7268) {
            Class639_Sub1_Sub2 var8 = var7.aClass639_Sub1_Sub2_7267;
            if((null == var4 || var4.method433(var8, 953808173)) && var2 == var8.aShort11803 && var8.aShort11799 == var3) {
               this.method6627(var8, false, -808532040);
               return var8;
            }
         }

         return null;
      }
   }

   public int method6629(int var1, int var2) {
      return null != this.aShortArrayArray7294?this.aShortArrayArray7294[var1][var2] & '\uffff':0;
   }

   public void method6630(int var1, int var2, int var3) {
      Class552 var4 = this.aClass552ArrayArrayArray7287[0][var1][var2];

      for(int var5 = 0; var5 < 3; ++var5) {
         Class552 var6 = this.aClass552ArrayArrayArray7287[var5][var1][var2] = this.aClass552ArrayArrayArray7287[var5 + 1][var1][var2];
         if(null != var6) {
            for(Class546 var7 = var6.aClass546_7357; var7 != null; var7 = var7.aClass546_7268) {
               Class639_Sub1_Sub2 var8 = var7.aClass639_Sub1_Sub2_7267;
               if(var1 == var8.aShort11803 && var8.aShort11799 == var2) {
                  --var8.aByte10827;
               }
            }

            if(var6.aClass639_Sub1_Sub3_7355 != null) {
               --var6.aClass639_Sub1_Sub3_7355.aByte10827;
            }

            if(var6.aClass639_Sub1_Sub1_7351 != null) {
               --var6.aClass639_Sub1_Sub1_7351.aByte10827;
            }

            if(null != var6.aClass639_Sub1_Sub1_7350) {
               --var6.aClass639_Sub1_Sub1_7350.aByte10827;
            }

            if(null != var6.aClass639_Sub1_Sub5_7353) {
               --var6.aClass639_Sub1_Sub5_7353.aByte10827;
            }

            if(var6.aClass639_Sub1_Sub5_7352 != null) {
               --var6.aClass639_Sub1_Sub5_7352.aByte10827;
            }
         }
      }

      if(this.aClass552ArrayArrayArray7287[0][var1][var2] == null) {
         this.aClass552ArrayArrayArray7287[0][var1][var2] = new Class552(0);
         this.aClass552ArrayArrayArray7287[0][var1][var2].aByte7354 = 1;
      }

      this.aClass552ArrayArrayArray7287[0][var1][var2].aClass552_7359 = var4;
      this.aClass552ArrayArrayArray7287[3][var1][var2] = null;
   }

   void method6631(Class639_Sub1[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         Class639_Sub1 var6 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var6;
         int var7 = -1949413091 * var6.anInt10830;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(-1949413091 * var1[var8].anInt10830 > (var8 & 1) + var7) {
               Class639_Sub1 var9 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var9;
            }
         }

         var1[var3] = var1[var5];
         var1[var5] = var6;
         this.method6631(var1, var2, var5 - 1);
         this.method6631(var1, 1 + var5, var3);
      }

   }

   static void method6632(Class681 var0, int var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2], -1694995311)).aStringArray3093[var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1]];
      var0.anInt8623 -= 379191958;
   }

   static final void method6633(Class681 var0, short var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class272.method3608(var3, var4, var0, (short)255);
   }

   static final void method6634(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      String var3 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4267, client.aClass111_11059.aClass14_1342, 903168386);
      var4.out.writeShort(Class594.method7039(var2, -1735512330) + Class594.method7039(var3, -1739721757), -805078716);
      var4.out.method9616(var2, 614770089);
      var4.out.method9616(var3, -15167718);
      client.aClass111_11059.write(var4, (byte)-5);
   }

   static final void method6635(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class313_Sub1.aByte10012;
   }

   static final void method6636(Class681 var0, byte var1) {
      var0.anInt8623 -= -1957887669;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class451.localPlayer.method10796((byte)-87).method7047(118492360);
   }

   public static int method6637(int var0, int var1, int var2, int var3) {
      var2 &= 3;
      return 0 == var2?var1:(1 == var2?4095 - var0:(2 == var2?4095 - var1:var0));
   }

   static final void method6638(Class681 var0, byte var1) {
      if(Class195.aClass292_Sub1_2182.method3914((byte)3) != Class307.aClass307_3293) {
         throw new RuntimeException();
      } else {
         ((Class329_Sub1)Class195.aClass292_Sub1_2182.method3941(-674810310)).method9042(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1, (short)220);
      }
   }
}
