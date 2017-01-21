package com.jagex;

import com.jagex.Class186;
import com.jagex.Class199_Sub20;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class266;
import com.jagex.Class281;
import com.jagex.Class283;
import com.jagex.Class326;
import com.jagex.Class45;
import com.jagex.Class470;
import com.jagex.Class526_Sub31;
import com.jagex.Class616;
import com.jagex.Class676;
import com.jagex.Class681;
import com.jagex.Exception_Sub6;
import com.jagex.client;

public class Class274 {
   static final int anInt3009 = 2;
   static final int anInt3011 = 256;
   static final int anInt3015 = 4;
   String aString3010;
   Class281[] aClass281Array3012;
   Class281[] aClass281Array3013;
   Class266[] aClass266Array3014;

   public Class274(byte[] var1) throws Exception_Sub6 {
      this.method3614(var1, (byte)-5);
   }

   void method3614(byte[] var1, byte var2) throws Exception_Sub6 {
      Class283 var3 = new Class283(var1);
      int var4 = var3.method3714((byte)9);
      if(4 != var4) {
         throw new Exception_Sub6(this, var4, 4);
      } else {
         this.aString3010 = var3.method3715(-1596493451);
         this.aClass281Array3012 = new Class281[var3.method3714((byte)27)];
         this.aClass281Array3013 = new Class281[var3.method3714((byte)118)];
         this.aClass266Array3014 = new Class266[var3.method3714((byte)27)];

         int var5;
         for(var5 = 0; var5 < this.aClass281Array3012.length; ++var5) {
            this.aClass281Array3012[var5] = new Class281();
            this.aClass281Array3012[var5].method3706(var3, -85689867);
         }

         for(var5 = 0; var5 < this.aClass281Array3013.length; ++var5) {
            this.aClass281Array3013[var5] = new Class281();
            this.aClass281Array3013[var5].method3706(var3, -707025856);
         }

         for(var5 = 0; var5 < this.aClass266Array3014.length; ++var5) {
            this.aClass266Array3014[var5] = new Class266();
            this.aClass266Array3014[var5].method3561(var3, (byte)-44);
         }

      }
   }

   static final void method3615(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      boolean var4 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] == 1;
      if(var0.hidden != var4) {
         var0.hidden = var4;
         Class526_Sub31.method9555(var0, (byte)10);
      }

      if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
         Class326.method4195(var0.uid * 919258769, -700889798);
      }

   }

   public static Class676 method3616(int var0, int var1) {
      Class676[] var2 = Class616.method7306(2011068645);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class676 var4 = var2[var3];
         if(var0 == -767001605 * var4.anInt8593) {
            return var4;
         }
      }

      return null;
   }

   static final void method3617(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub29_10655.method10105((byte)93);
   }

   static final void method3618(long var0) {
      int var2 = -253127967 * client.anInt11321;
      int var3 = -182161357 * client.anInt11043;
      int var4;
      int var5;
      if(Class45.anInt639 * -445020973 != var2) {
         var4 = var2 - Class45.anInt639 * -445020973;
         var5 = (int)((long)var4 * var0 / 320L);
         if(var4 > 0) {
            if(0 == var5) {
               var5 = 1;
            } else if(var5 > var4) {
               var5 = var4;
            }
         } else if(0 == var5) {
            var5 = -1;
         } else if(var5 < var4) {
            var5 = var4;
         }

         Class45.anInt639 += 846295899 * var5;
      }

      if(Class186.anInt2122 * 1090885877 != var3) {
         var4 = var3 - 1090885877 * Class186.anInt2122;
         var5 = (int)(var0 * (long)var4 / 320L);
         if(var4 > 0) {
            if(0 == var5) {
               var5 = 1;
            } else if(var5 > var4) {
               var5 = var4;
            }
         } else if(var5 == 0) {
            var5 = -1;
         } else if(var5 < var4) {
            var5 = var4;
         }

         Class186.anInt2122 += var5 * -1830792355;
      }

      client.aFloat11105 += client.aFloat11106 * (float)var0 / 40.0F * 8.0F;
      client.aFloat11210 += 8.0F * (client.aFloat10992 * (float)var0 / 40.0F);
      Class199_Sub20.method9034(190461033);
   }

   public static final int method3619(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(client.aClass505_11204.method6072(1378435244) == null) {
         return 0;
      } else {
         if(var4 < 3) {
            Class470 var6 = client.aClass505_11204.method6094((byte)-113);
            int var7 = var0 >> 9;
            int var8 = var1 >> 9;
            if(var2 < 0 || var3 < 0 || var2 > client.aClass505_11204.method6056(-1746741811) - 1 || var3 > client.aClass505_11204.method6057(126749238) - 1) {
               return 0;
            }

            if(var7 < 1 || var8 < 1 || var7 > client.aClass505_11204.method6056(-1746741811) - 1 || var8 > client.aClass505_11204.method6057(126749238) - 1) {
               return 0;
            }

            boolean var9 = (var6.aByteArrayArrayArray5356[1][var0 >> 9][var1 >> 9] & 2) != 0;
            boolean var10;
            boolean var11;
            if((var0 & 511) == 0) {
               var10 = 0 != (var6.aByteArrayArrayArray5356[1][var7 - 1][var1 >> 9] & 2);
               var11 = (var6.aByteArrayArrayArray5356[1][var7][var1 >> 9] & 2) != 0;
               if(var11 != var10) {
                  var9 = 0 != (var6.aByteArrayArrayArray5356[1][var2][var3] & 2);
               }
            }

            if((var1 & 511) == 0) {
               var10 = (var6.aByteArrayArrayArray5356[1][var0 >> 9][var8 - 1] & 2) != 0;
               var11 = 0 != (var6.aByteArrayArrayArray5356[1][var0 >> 9][var8] & 2);
               if(var10 != var11) {
                  var9 = (var6.aByteArrayArrayArray5356[1][var2][var3] & 2) != 0;
               }
            }

            if(var9) {
               ++var4;
            }
         }

         return client.aClass505_11204.method6072(1269515568).aClass148Array7288[var4].method1707(var0, var1, 1103413164);
      }
   }
}
