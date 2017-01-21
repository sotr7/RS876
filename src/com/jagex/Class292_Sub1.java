package com.jagex;

import com.jagex.Class104;
import com.jagex.Class159;
import com.jagex.Class184_Sub2;
import com.jagex.Class187;
import com.jagex.Class190;
import com.jagex.InterfaceDef;
import com.jagex.Class270;
import com.jagex.Class292;
import com.jagex.Class297;
import com.jagex.Class298;
import com.jagex.Class302;
import com.jagex.Class307;
import com.jagex.Class361_Sub2;
import com.jagex.Class520;
import com.jagex.Class526_Sub21_Sub13;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class711_Sub34;
import com.jagex.Exception_Sub2;
import com.jagex.Interface32;
import java.util.Iterator;

public class Class292_Sub1 extends Class292 {
   int anInt10108 = 0;

   public int method9121() {
      this.anInt10108 += 1932500777;
      if(126 == this.anInt10108 * 1351445785) {
         this.anInt10108 = 0;
      }

      return 1351445785 * this.anInt10108;
   }

   public Class292_Sub1(Interface32 var1) {
      super(Class302.aClass302_3260, var1);
   }

   public int method9122(int var1) {
      this.anInt10108 += 1932500777;
      if(126 == this.anInt10108 * 1351445785) {
         this.anInt10108 = 0;
      }

      return 1351445785 * this.anInt10108;
   }

   public void method9123(RSByteBuffer var1, int var2, int var3) {
      int var4 = var1.pos * 301018015;
      int var5 = var1.readUnsignedByte(1089865784);
      this.method3890(Class187.method2734(var5 & 1, -1319501165), -2093455919);
      if((var5 & 8) != 0) {
         Class298 var6 = Class184_Sub2.method8481(var1.readUnsignedByte(1263519108), -2144462310);
         if(this.aClass298_3143 != var6) {
            try {
               this.method3891(var6, true, (byte)1);
            } catch (Exception_Sub2 var16) {
               var16.printStackTrace();
            }
         }
      }

      if(0 != (var5 & 16)) {
         Class307 var17 = Class520.method6249(var1.readUnsignedByte(1903922377), (byte)0);
         if(this.aClass307_3145 != var17) {
            try {
               this.method3892(var17, true, -2009740123);
            } catch (Exception_Sub2 var15) {
               var15.printStackTrace();
            }
         }
      }

      if(1 == (var5 >> 7 & 1)) {
         int var18 = var1.readUnsignedShort(1918946210);
         if(1 == (var18 >> 720305871 * Class297.aClass297_3223.anInt3233 & 1)) {
            this.aClass446_3150.method5306(var1);
         }

         if(1 == (var18 >> 720305871 * Class297.aClass297_3219.anInt3233 & 1)) {
            this.aClass446_3157.method5306(var1);
         }

         if(1 == (var18 >> 720305871 * Class297.aClass297_3220.anInt3233 & 1)) {
            this.aClass446_3154.method5306(var1);
         }

         if((var18 >> Class297.aClass297_3221.anInt3233 * 720305871 & 1) == 1) {
            this.aClass446_3174.method5306(var1);
         }

         if((var18 >> 720305871 * Class297.aClass297_3232.anInt3233 & 1) == 1) {
            this.aFloat3166 = var1.method9634((byte)1);
            this.aFloat3167 = var1.method9634((byte)1);
         }

         if((var18 >> 720305871 * Class297.aClass297_3226.anInt3233 & 1) == 1) {
            this.aFloat3176 = var1.method9634((byte)1);
            this.aFloat3171 = var1.method9634((byte)1);
         }

         if((var18 >> 720305871 * Class297.aClass297_3224.anInt3233 & 1) == 1) {
            this.aClass299_3140 = Class711_Sub34.method10146(var1.readUnsignedByte(-203796962), (short)255);
         }

         if((var18 >> Class297.aClass297_3225.anInt3233 * 720305871 & 1) == 1) {
            this.anInt3170 = var1.read24BitInt(742041327) * 1295817789;
            var1.readUnsignedByte(321979791);
         }

         int var7;
         if(1 == (var18 >> 720305871 * Class297.aClass297_3218.anInt3233 & 1)) {
            var7 = var1.readUnsignedByte(-855940465);
            this.aBool3173 = 1 == (var7 & 1);
            this.aBool3142 = 2 == (var7 & 2);
         }

         if((var18 >> Class297.aClass297_3227.anInt3233 * 720305871 & 1) == 1) {
            var7 = var1.readUnsignedByte(-36922458);

            for(int var8 = 0; var8 < var7; ++var8) {
               int var9 = var1.readUnsignedByte(1455100416);
               int var10 = var1.readUnsignedByte(-1814421112);
               if(var9 == 0) {
                  this.method3907(var10, (byte)3);
               } else {
                  Class270 var11 = Class104.method1311(var1.readUnsignedByte(1891719963), 760946292);
                  boolean var12 = true;
                  Iterator var13 = this.aClass20_3146.iterator();

                  while(var13.hasNext()) {
                     Class526_Sub21_Sub13 var14 = (Class526_Sub21_Sub13)var13.next();
                     if(var10 == -631717655 * var14.anInt11813) {
                        var14.method10693(var1, (byte)28);
                        var12 = false;
                        break;
                     }
                  }

                  if(var12) {
                     this.method3906(Class361_Sub2.method9245(var10, var11, var1, 1058114158), (byte)5);
                  }
               }
            }
         }

         if((var18 >> Class297.aClass297_3228.anInt3233 * 720305871 & 1) == 1) {
            this.anInt3159 = var1.readUnsignedShort(1383273334) * 714712383;
            this.aFloat3175 = var1.method9634((byte)1);
         }

         if((var18 >> Class297.aClass297_3229.anInt3233 * 720305871 & 1) == 1) {
            this.aClass287_3148 = Class190.method2757(var1.readUnsignedByte(876195731), -685880275);
         }

         if(1 == (var18 >> 720305871 * Class297.aClass297_3230.anInt3233 & 1)) {
            this.aClass446_3162.method5306(var1);
            this.aClass446_3163.method5306(var1);
            this.aFloat3164 = var1.method9634((byte)1);
            this.aFloat3165 = var1.method9634((byte)1);
         }

         if(1 == (var18 >> 720305871 * Class297.aClass297_3231.anInt3233 & 1)) {
            var1.method9634((byte)1);
         }

         if(1 == (var18 >> 720305871 * Class297.aClass297_3222.anInt3233 & 1)) {
            this.aFloat3160 = var1.method9634((byte)1);
         }
      }

      if(this.aClass689_3151 != null && (var5 >> 5 & 1) == 1) {
         this.aClass689_3151.method8086(var1, 1213487286);
      }

      if(this.aClass329_3149 != null && 1 == (var5 >> 6 & 1)) {
         this.aClass329_3149.method4209(var1, -233141715);
      }

      if(var1.pos * 301018015 - var4 != var2) {
         throw new RuntimeException(var1.pos * 301018015 - var4 + "," + var2);
      }
   }

   static final void method9124(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static Class159[] method9125(int var0) {
      return new Class159[]{Class159.aClass159_1764, Class159.aClass159_1763, Class159.aClass159_1759, Class159.aClass159_1760, Class159.aClass159_1761, Class159.aClass159_1762, Class159.aClass159_1765};
   }

   static final void method9126(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      int var4 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      --var4;
      if(var3.aStringArray2579 != null && var4 < var3.aStringArray2579.length && null != var3.aStringArray2579[var4]) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aStringArray2579[var4];
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }
}
