package com.jagex;

import com.jagex.Class129;
import com.jagex.Class148_Sub3;
import com.jagex.Class174_Sub2;
import com.jagex.Class20;
import com.jagex.Class526;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub17;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub36_Sub1;
import com.jagex.Class692;
import com.jagex.Interface15;
import com.jagex.Interface20;

public class Class526_Sub12 extends Class526 {
   int anInt10441;
   Class174_Sub2 aClass174_Sub2_10434;
   Class526_Sub16 aClass526_Sub16_10436;
   Class148_Sub3 aClass148_Sub3_10443;
   int anInt10437;
   int anInt10438;
   int anInt10435;
   int anInt10440;
   float[][] aFloatArrayArray10439;
   float[][] aFloatArrayArray10444;
   float[][] aFloatArrayArray10449;
   Interface20 anInterface20_10450;
   Interface15 anInterface15_10448;
   Class129 aClass129_10445;
   Class129 aClass129_10446;
   RSByteBuffer aClass526_Sub36_10452;
   Class526_Sub36_Sub1 aClass526_Sub36_Sub1_10451;
   Class20 aClass20_10447;
   int anInt10442;

   void method9365(short var1) {
      if(this.aClass174_Sub2_10434.aBool9508) {
         this.aClass526_Sub36_10452.writeShort(var1, -805078716);
      } else {
         this.aClass526_Sub36_10452.method9610(var1, (byte)0);
      }

   }

   void method9366(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = -1L;
      int var9 = var5 + (var3 << this.aClass148_Sub3_10443.anInt1710 * -586661047);
      int var10 = var6 + (var4 << this.aClass148_Sub3_10443.anInt1710 * -586661047);
      int var11 = this.aClass148_Sub3_10443.method1707(var9, var10, 1902815664);
      if((var5 & 127) == 0 || (var6 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         Class526_Sub17 var12 = (Class526_Sub17)this.aClass20_10447.get(var7);
         if(var12 != null) {
            this.method9365(var12.aShort10479);
            return;
         }
      }

      short var29 = (short)(this.anInt10441++);
      if(var7 != -1L) {
         this.aClass20_10447.put(new Class526_Sub17(var29), var7);
      }

      float var13;
      float var14;
      float var15;
      float var16;
      float var17;
      float var18;
      float var19;
      float var20;
      float var21;
      float var22;
      float var23;
      if(var5 == 0 && var6 == 0) {
         var13 = this.aFloatArrayArray10439[var1][var2];
         var14 = this.aFloatArrayArray10444[var1][var2];
         var15 = this.aFloatArrayArray10449[var1][var2];
      } else if(var5 == this.aClass148_Sub3_10443.anInt1712 * 1934131013 && var6 == 0) {
         var13 = this.aFloatArrayArray10439[var1 + 1][var2];
         var14 = this.aFloatArrayArray10444[var1 + 1][var2];
         var15 = this.aFloatArrayArray10449[var1 + 1][var2];
      } else if(var5 == this.aClass148_Sub3_10443.anInt1712 * 1934131013 && var6 == this.aClass148_Sub3_10443.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10439[var1 + 1][var2 + 1];
         var14 = this.aFloatArrayArray10444[var1 + 1][var2 + 1];
         var15 = this.aFloatArrayArray10449[var1 + 1][var2 + 1];
      } else if(var5 == 0 && var6 == this.aClass148_Sub3_10443.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10439[var1][var2 + 1];
         var14 = this.aFloatArrayArray10444[var1][var2 + 1];
         var15 = this.aFloatArrayArray10449[var1][var2 + 1];
      } else {
         var16 = (float)var5 / (float)(this.aClass148_Sub3_10443.anInt1712 * 1934131013);
         var17 = (float)var6 / (float)(this.aClass148_Sub3_10443.anInt1712 * 1934131013);
         var18 = this.aFloatArrayArray10439[var1][var2];
         var19 = this.aFloatArrayArray10444[var1][var2];
         var20 = this.aFloatArrayArray10449[var1][var2];
         var21 = this.aFloatArrayArray10439[var1 + 1][var2];
         var22 = this.aFloatArrayArray10444[var1 + 1][var2];
         var23 = this.aFloatArrayArray10449[var1 + 1][var2];
         var18 += (this.aFloatArrayArray10439[var1][var2 + 1] - var18) * var16;
         var19 += (this.aFloatArrayArray10444[var1][var2 + 1] - var19) * var16;
         var20 += (this.aFloatArrayArray10449[var1][var2 + 1] - var20) * var16;
         var21 += (this.aFloatArrayArray10439[var1 + 1][var2 + 1] - var21) * var16;
         var22 += (this.aFloatArrayArray10444[var1 + 1][var2 + 1] - var22) * var16;
         var23 += (this.aFloatArrayArray10449[var1 + 1][var2 + 1] - var23) * var16;
         var13 = var18 + (var21 - var18) * var17;
         var14 = var19 + (var22 - var19) * var17;
         var15 = var20 + (var23 - var20) * var17;
      }

      var16 = (float)(this.aClass526_Sub16_10436.method9390((byte)-29) - var9);
      var17 = (float)(this.aClass526_Sub16_10436.method9391(-83693587) - var11);
      var18 = (float)(this.aClass526_Sub16_10436.method9392((byte)-113) - var10);
      var19 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      var20 = 1.0F / var19;
      var16 *= var20;
      var17 *= var20;
      var18 *= var20;
      var21 = var19 / (float)this.aClass526_Sub16_10436.method9422((short)8192);
      var22 = 1.0F - var21 * var21;
      if(var22 < 0.0F) {
         var22 = 0.0F;
      }

      var23 = var16 * var13 + var17 * var14 + var18 * var15;
      if(var23 < 0.0F) {
         var23 = 0.0F;
      }

      float var24 = var23 * var22 * 2.0F;
      if(var24 > 1.0F) {
         var24 = 1.0F;
      }

      int var25 = this.aClass526_Sub16_10436.method9394(-1240908892);
      int var26 = (int)(var24 * (float)(var25 >> 16 & 255));
      if(var26 > 255) {
         var26 = 255;
      }

      int var27 = (int)(var24 * (float)(var25 >> 8 & 255));
      if(var27 > 255) {
         var27 = 255;
      }

      int var28 = (int)(var24 * (float)(var25 & 255));
      if(var28 > 255) {
         var28 = 255;
      }

      if(this.aClass174_Sub2_10434.aBool9508) {
         this.aClass526_Sub36_Sub1_10451.method10688((float)var9);
         this.aClass526_Sub36_Sub1_10451.method10688((float)var11);
         this.aClass526_Sub36_Sub1_10451.method10688((float)var10);
      } else {
         this.aClass526_Sub36_Sub1_10451.method10689((float)var9);
         this.aClass526_Sub36_Sub1_10451.method10689((float)var11);
         this.aClass526_Sub36_Sub1_10451.method10689((float)var10);
      }

      this.aClass526_Sub36_Sub1_10451.writeByte(var26, -2125574476);
      this.aClass526_Sub36_Sub1_10451.writeByte(var27, -737548408);
      this.aClass526_Sub36_Sub1_10451.writeByte(var28, 812506783);
      this.aClass526_Sub36_Sub1_10451.writeByte(255, 1407912953);
      this.method9365(var29);
   }

   void method9367(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = -1L;
      int var9 = var5 + (var3 << this.aClass148_Sub3_10443.anInt1710 * -586661047);
      int var10 = var6 + (var4 << this.aClass148_Sub3_10443.anInt1710 * -586661047);
      int var11 = this.aClass148_Sub3_10443.method1707(var9, var10, 1086833046);
      if((var5 & 127) == 0 || (var6 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         Class526_Sub17 var12 = (Class526_Sub17)this.aClass20_10447.get(var7);
         if(var12 != null) {
            this.method9365(var12.aShort10479);
            return;
         }
      }

      short var29 = (short)(this.anInt10441++);
      if(var7 != -1L) {
         this.aClass20_10447.put(new Class526_Sub17(var29), var7);
      }

      float var13;
      float var14;
      float var15;
      float var16;
      float var17;
      float var18;
      float var19;
      float var20;
      float var21;
      float var22;
      float var23;
      if(var5 == 0 && var6 == 0) {
         var13 = this.aFloatArrayArray10439[var1][var2];
         var14 = this.aFloatArrayArray10444[var1][var2];
         var15 = this.aFloatArrayArray10449[var1][var2];
      } else if(var5 == this.aClass148_Sub3_10443.anInt1712 * 1934131013 && var6 == 0) {
         var13 = this.aFloatArrayArray10439[var1 + 1][var2];
         var14 = this.aFloatArrayArray10444[var1 + 1][var2];
         var15 = this.aFloatArrayArray10449[var1 + 1][var2];
      } else if(var5 == this.aClass148_Sub3_10443.anInt1712 * 1934131013 && var6 == this.aClass148_Sub3_10443.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10439[var1 + 1][var2 + 1];
         var14 = this.aFloatArrayArray10444[var1 + 1][var2 + 1];
         var15 = this.aFloatArrayArray10449[var1 + 1][var2 + 1];
      } else if(var5 == 0 && var6 == this.aClass148_Sub3_10443.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10439[var1][var2 + 1];
         var14 = this.aFloatArrayArray10444[var1][var2 + 1];
         var15 = this.aFloatArrayArray10449[var1][var2 + 1];
      } else {
         var16 = (float)var5 / (float)(this.aClass148_Sub3_10443.anInt1712 * 1934131013);
         var17 = (float)var6 / (float)(this.aClass148_Sub3_10443.anInt1712 * 1934131013);
         var18 = this.aFloatArrayArray10439[var1][var2];
         var19 = this.aFloatArrayArray10444[var1][var2];
         var20 = this.aFloatArrayArray10449[var1][var2];
         var21 = this.aFloatArrayArray10439[var1 + 1][var2];
         var22 = this.aFloatArrayArray10444[var1 + 1][var2];
         var23 = this.aFloatArrayArray10449[var1 + 1][var2];
         var18 += (this.aFloatArrayArray10439[var1][var2 + 1] - var18) * var16;
         var19 += (this.aFloatArrayArray10444[var1][var2 + 1] - var19) * var16;
         var20 += (this.aFloatArrayArray10449[var1][var2 + 1] - var20) * var16;
         var21 += (this.aFloatArrayArray10439[var1 + 1][var2 + 1] - var21) * var16;
         var22 += (this.aFloatArrayArray10444[var1 + 1][var2 + 1] - var22) * var16;
         var23 += (this.aFloatArrayArray10449[var1 + 1][var2 + 1] - var23) * var16;
         var13 = var18 + (var21 - var18) * var17;
         var14 = var19 + (var22 - var19) * var17;
         var15 = var20 + (var23 - var20) * var17;
      }

      var16 = (float)(this.aClass526_Sub16_10436.method9390((byte)-22) - var9);
      var17 = (float)(this.aClass526_Sub16_10436.method9391(-1152382437) - var11);
      var18 = (float)(this.aClass526_Sub16_10436.method9392((byte)-122) - var10);
      var19 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      var20 = 1.0F / var19;
      var16 *= var20;
      var17 *= var20;
      var18 *= var20;
      var21 = var19 / (float)this.aClass526_Sub16_10436.method9422((short)8192);
      var22 = 1.0F - var21 * var21;
      if(var22 < 0.0F) {
         var22 = 0.0F;
      }

      var23 = var16 * var13 + var17 * var14 + var18 * var15;
      if(var23 < 0.0F) {
         var23 = 0.0F;
      }

      float var24 = var23 * var22 * 2.0F;
      if(var24 > 1.0F) {
         var24 = 1.0F;
      }

      int var25 = this.aClass526_Sub16_10436.method9394(-354085114);
      int var26 = (int)(var24 * (float)(var25 >> 16 & 255));
      if(var26 > 255) {
         var26 = 255;
      }

      int var27 = (int)(var24 * (float)(var25 >> 8 & 255));
      if(var27 > 255) {
         var27 = 255;
      }

      int var28 = (int)(var24 * (float)(var25 & 255));
      if(var28 > 255) {
         var28 = 255;
      }

      if(this.aClass174_Sub2_10434.aBool9508) {
         this.aClass526_Sub36_Sub1_10451.method10688((float)var9);
         this.aClass526_Sub36_Sub1_10451.method10688((float)var11);
         this.aClass526_Sub36_Sub1_10451.method10688((float)var10);
      } else {
         this.aClass526_Sub36_Sub1_10451.method10689((float)var9);
         this.aClass526_Sub36_Sub1_10451.method10689((float)var11);
         this.aClass526_Sub36_Sub1_10451.method10689((float)var10);
      }

      this.aClass526_Sub36_Sub1_10451.writeByte(var26, 1839594033);
      this.aClass526_Sub36_Sub1_10451.writeByte(var27, -424877238);
      this.aClass526_Sub36_Sub1_10451.writeByte(var28, 580850876);
      this.aClass526_Sub36_Sub1_10451.writeByte(255, 1788502437);
      this.method9365(var29);
   }

   void method9368(int var1, int var2, int var3, boolean[][] var4) {
      if(this.anInterface20_10450 != null) {
         if(this.anInt10437 <= var1 + var3) {
            if(this.anInt10438 >= var1 - var3) {
               if(this.anInt10435 <= var2 + var3) {
                  if(this.anInt10440 >= var2 - var3) {
                     for(int var5 = this.anInt10435; var5 <= this.anInt10440; ++var5) {
                        for(int var6 = this.anInt10437; var6 <= this.anInt10438; ++var6) {
                           int var7 = var6 - var1;
                           int var8 = var5 - var2;
                           if(var7 > -var3 && var7 < var3 && var8 > -var3 && var8 < var3 && var4[var7 + var3][var8 + var3]) {
                              this.aClass174_Sub2_10434.method8644((int)(this.aClass526_Sub16_10436.method9419(1613563498) * 255.0F) << 24);
                              this.aClass174_Sub2_10434.method8634(this.aClass129_10445, (Class129)null, this.aClass129_10446, (Class129)null);
                              this.aClass174_Sub2_10434.method8664(this.anInterface20_10450, 4, 0, this.anInt10442);
                              return;
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method9369(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = -1L;
      int var9 = var5 + (var3 << this.aClass148_Sub3_10443.anInt1710 * -586661047);
      int var10 = var6 + (var4 << this.aClass148_Sub3_10443.anInt1710 * -586661047);
      int var11 = this.aClass148_Sub3_10443.method1707(var9, var10, 344390915);
      if((var5 & 127) == 0 || (var6 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         Class526_Sub17 var12 = (Class526_Sub17)this.aClass20_10447.get(var7);
         if(var12 != null) {
            this.method9365(var12.aShort10479);
            return;
         }
      }

      short var29 = (short)(this.anInt10441++);
      if(var7 != -1L) {
         this.aClass20_10447.put(new Class526_Sub17(var29), var7);
      }

      float var13;
      float var14;
      float var15;
      float var16;
      float var17;
      float var18;
      float var19;
      float var20;
      float var21;
      float var22;
      float var23;
      if(var5 == 0 && var6 == 0) {
         var13 = this.aFloatArrayArray10439[var1][var2];
         var14 = this.aFloatArrayArray10444[var1][var2];
         var15 = this.aFloatArrayArray10449[var1][var2];
      } else if(var5 == this.aClass148_Sub3_10443.anInt1712 * 1934131013 && var6 == 0) {
         var13 = this.aFloatArrayArray10439[var1 + 1][var2];
         var14 = this.aFloatArrayArray10444[var1 + 1][var2];
         var15 = this.aFloatArrayArray10449[var1 + 1][var2];
      } else if(var5 == this.aClass148_Sub3_10443.anInt1712 * 1934131013 && var6 == this.aClass148_Sub3_10443.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10439[var1 + 1][var2 + 1];
         var14 = this.aFloatArrayArray10444[var1 + 1][var2 + 1];
         var15 = this.aFloatArrayArray10449[var1 + 1][var2 + 1];
      } else if(var5 == 0 && var6 == this.aClass148_Sub3_10443.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10439[var1][var2 + 1];
         var14 = this.aFloatArrayArray10444[var1][var2 + 1];
         var15 = this.aFloatArrayArray10449[var1][var2 + 1];
      } else {
         var16 = (float)var5 / (float)(this.aClass148_Sub3_10443.anInt1712 * 1934131013);
         var17 = (float)var6 / (float)(this.aClass148_Sub3_10443.anInt1712 * 1934131013);
         var18 = this.aFloatArrayArray10439[var1][var2];
         var19 = this.aFloatArrayArray10444[var1][var2];
         var20 = this.aFloatArrayArray10449[var1][var2];
         var21 = this.aFloatArrayArray10439[var1 + 1][var2];
         var22 = this.aFloatArrayArray10444[var1 + 1][var2];
         var23 = this.aFloatArrayArray10449[var1 + 1][var2];
         var18 += (this.aFloatArrayArray10439[var1][var2 + 1] - var18) * var16;
         var19 += (this.aFloatArrayArray10444[var1][var2 + 1] - var19) * var16;
         var20 += (this.aFloatArrayArray10449[var1][var2 + 1] - var20) * var16;
         var21 += (this.aFloatArrayArray10439[var1 + 1][var2 + 1] - var21) * var16;
         var22 += (this.aFloatArrayArray10444[var1 + 1][var2 + 1] - var22) * var16;
         var23 += (this.aFloatArrayArray10449[var1 + 1][var2 + 1] - var23) * var16;
         var13 = var18 + (var21 - var18) * var17;
         var14 = var19 + (var22 - var19) * var17;
         var15 = var20 + (var23 - var20) * var17;
      }

      var16 = (float)(this.aClass526_Sub16_10436.method9390((byte)-115) - var9);
      var17 = (float)(this.aClass526_Sub16_10436.method9391(-553179788) - var11);
      var18 = (float)(this.aClass526_Sub16_10436.method9392((byte)-18) - var10);
      var19 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      var20 = 1.0F / var19;
      var16 *= var20;
      var17 *= var20;
      var18 *= var20;
      var21 = var19 / (float)this.aClass526_Sub16_10436.method9422((short)8192);
      var22 = 1.0F - var21 * var21;
      if(var22 < 0.0F) {
         var22 = 0.0F;
      }

      var23 = var16 * var13 + var17 * var14 + var18 * var15;
      if(var23 < 0.0F) {
         var23 = 0.0F;
      }

      float var24 = var23 * var22 * 2.0F;
      if(var24 > 1.0F) {
         var24 = 1.0F;
      }

      int var25 = this.aClass526_Sub16_10436.method9394(833904799);
      int var26 = (int)(var24 * (float)(var25 >> 16 & 255));
      if(var26 > 255) {
         var26 = 255;
      }

      int var27 = (int)(var24 * (float)(var25 >> 8 & 255));
      if(var27 > 255) {
         var27 = 255;
      }

      int var28 = (int)(var24 * (float)(var25 & 255));
      if(var28 > 255) {
         var28 = 255;
      }

      if(this.aClass174_Sub2_10434.aBool9508) {
         this.aClass526_Sub36_Sub1_10451.method10688((float)var9);
         this.aClass526_Sub36_Sub1_10451.method10688((float)var11);
         this.aClass526_Sub36_Sub1_10451.method10688((float)var10);
      } else {
         this.aClass526_Sub36_Sub1_10451.method10689((float)var9);
         this.aClass526_Sub36_Sub1_10451.method10689((float)var11);
         this.aClass526_Sub36_Sub1_10451.method10689((float)var10);
      }

      this.aClass526_Sub36_Sub1_10451.writeByte(var26, -549008496);
      this.aClass526_Sub36_Sub1_10451.writeByte(var27, -1966706229);
      this.aClass526_Sub36_Sub1_10451.writeByte(var28, 826165495);
      this.aClass526_Sub36_Sub1_10451.writeByte(255, 1498320893);
      this.method9365(var29);
   }

   Class526_Sub12(Class174_Sub2 var1, Class148_Sub3 var2, Class526_Sub16 var3, int[] var4) {
      this.aClass174_Sub2_10434 = var1;
      this.aClass526_Sub16_10436 = var3;
      this.aClass148_Sub3_10443 = var2;
      int var5 = this.aClass526_Sub16_10436.method9422((short)8192) - (var2.anInt1712 * 1934131013 >> 1);
      this.anInt10437 = this.aClass526_Sub16_10436.method9390((byte)-77) - var5 >> var2.anInt1710 * -586661047;
      this.anInt10438 = this.aClass526_Sub16_10436.method9390((byte)-48) + var5 >> var2.anInt1710 * -586661047;
      this.anInt10435 = this.aClass526_Sub16_10436.method9392((byte)-44) - var5 >> var2.anInt1710 * -586661047;
      this.anInt10440 = this.aClass526_Sub16_10436.method9392((byte)-7) + var5 >> var2.anInt1710 * -586661047;
      int var6 = this.anInt10438 - this.anInt10437 + 1;
      int var7 = this.anInt10440 - this.anInt10435 + 1;
      this.aFloatArrayArray10439 = new float[var6 + 1][var7 + 1];
      this.aFloatArrayArray10444 = new float[var6 + 1][var7 + 1];
      this.aFloatArrayArray10449 = new float[var6 + 1][var7 + 1];

      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var8 = 0; var8 <= var7; ++var8) {
         var9 = var8 + this.anInt10435;
         if(var9 > 0 && var9 < this.aClass148_Sub3_10443.anInt1713 * -810756899 - 1) {
            for(var10 = 0; var10 <= var6; ++var10) {
               var11 = var10 + this.anInt10437;
               if(var11 > 0 && var11 < this.aClass148_Sub3_10443.anInt1711 * 1966165105 - 1) {
                  var12 = var2.method1714(var11 + 1, var9, -1053663705) - var2.method1714(var11 - 1, var9, 1059893768);
                  var13 = var2.method1714(var11, var9 + 1, 1985779461) - var2.method1714(var11, var9 - 1, 1946186168);
                  float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 65536 + var13 * var13)));
                  this.aFloatArrayArray10439[var10][var8] = (float)var12 * var14;
                  this.aFloatArrayArray10444[var10][var8] = -256.0F * var14;
                  this.aFloatArrayArray10449[var10][var8] = (float)var13 * var14;
               }
            }
         }
      }

      var8 = 0;

      for(var9 = this.anInt10435; var9 <= this.anInt10440; ++var9) {
         if(var9 >= 0 && var9 < var2.anInt1713 * -810756899) {
            for(var10 = this.anInt10437; var10 <= this.anInt10438; ++var10) {
               if(var10 >= 0 && var10 < var2.anInt1711 * 1966165105) {
                  var11 = var4[var8];
                  int[] var18 = var2.anIntArrayArrayArray9172[var10][var9];
                  if(var18 != null && var11 != 0) {
                     if(var11 == 1) {
                        for(var13 = 0; var13 < var18.length; var13 += 3) {
                           if(var18[var13] != -1 && var18[var13 + 1] != -1 && var18[var13 + 2] != -1) {
                              this.anInt10442 += 3;
                           }
                        }
                     } else {
                        this.anInt10442 += 3;
                     }
                  }
               }

               ++var8;
            }
         } else {
            var8 += this.anInt10438 - this.anInt10437;
         }
      }

      if(this.anInt10442 > 0) {
         this.aClass526_Sub36_10452 = new RSByteBuffer(this.anInt10442 * 2);
         this.aClass526_Sub36_Sub1_10451 = new Class526_Sub36_Sub1(this.anInt10442 * 16);
         this.aClass20_10447 = new Class20(Class692.method8110(this.anInt10442, 1978225703));
         var9 = 0;
         var8 = 0;

         for(var10 = this.anInt10435; var10 <= this.anInt10440; ++var10) {
            if(var10 >= 0 && var10 < var2.anInt1713 * -810756899) {
               var11 = 0;

               for(var12 = this.anInt10437; var12 <= this.anInt10438; ++var12) {
                  if(var12 >= 0 && var12 < var2.anInt1711 * 1966165105) {
                     var13 = var4[var8];
                     int[] var19 = var2.anIntArrayArrayArray9172[var12][var10];
                     if(var19 != null && var13 != 0) {
                        if(var13 != 1) {
                           if(var13 == 3) {
                              this.method9367(var11, var9, var12, var10, 0, 0);
                              this.method9367(var11, var9, var12, var10, var2.anInt1712 * 1934131013, 0);
                              this.method9367(var11, var9, var12, var10, 0, var2.anInt1712 * 1934131013);
                           } else if(var13 == 2) {
                              this.method9367(var11, var9, var12, var10, var2.anInt1712 * 1934131013, 0);
                              this.method9367(var11, var9, var12, var10, var2.anInt1712 * 1934131013, var2.anInt1712 * 1934131013);
                              this.method9367(var11, var9, var12, var10, 0, 0);
                           } else if(var13 == 5) {
                              this.method9367(var11, var9, var12, var10, var2.anInt1712 * 1934131013, var2.anInt1712 * 1934131013);
                              this.method9367(var11, var9, var12, var10, 0, var2.anInt1712 * 1934131013);
                              this.method9367(var11, var9, var12, var10, var2.anInt1712 * 1934131013, 0);
                           } else if(var13 == 4) {
                              this.method9367(var11, var9, var12, var10, 0, var2.anInt1712 * 1934131013);
                              this.method9367(var11, var9, var12, var10, 0, 0);
                              this.method9367(var11, var9, var12, var10, var2.anInt1712 * 1934131013, var2.anInt1712 * 1934131013);
                           }
                        } else {
                           int[] var15 = var2.anIntArrayArrayArray9189[var12][var10];
                           int[] var16 = var2.anIntArrayArrayArray9175[var12][var10];
                           int var17 = 0;

                           label110:
                           while(true) {
                              while(true) {
                                 if(var17 >= var19.length) {
                                    break label110;
                                 }

                                 if(var19[var17] != -1 && var19[var17 + 1] != -1 && var19[var17 + 2] != -1) {
                                    this.method9367(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                    this.method9367(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                    this.method9367(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                 } else {
                                    var17 += 3;
                                 }
                              }
                           }
                        }
                     }
                  }

                  ++var8;
                  ++var11;
               }
            } else {
               var8 += this.anInt10438 - this.anInt10437;
            }

            ++var9;
         }

         this.anInterface20_10450 = this.aClass174_Sub2_10434.method8630(5123, this.aClass526_Sub36_10452.buffer, this.aClass526_Sub36_10452.pos * 301018015, false);
         this.anInterface15_10448 = this.aClass174_Sub2_10434.method8680(16, this.aClass526_Sub36_Sub1_10451.buffer, this.aClass526_Sub36_Sub1_10451.pos * 301018015, false);
         this.aClass129_10445 = new Class129(this.anInterface15_10448, 5126, 3, 0);
         this.aClass129_10446 = new Class129(this.anInterface15_10448, 5121, 4, 12);
      } else {
         this.anInterface20_10450 = null;
         this.anInterface15_10448 = null;
         this.aClass129_10445 = null;
         this.aClass129_10446 = null;
      }

      this.aClass526_Sub36_Sub1_10451 = null;
      this.aClass526_Sub36_10452 = null;
      this.aClass20_10447 = null;
      this.aFloatArrayArray10449 = (float[][])null;
      this.aFloatArrayArray10444 = (float[][])null;
      this.aFloatArrayArray10439 = (float[][])null;
   }
}
