package com.jagex;

import com.jagex.Class2;
import com.jagex.Class214;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class258;
import com.jagex.Class285;
import com.jagex.Class318_Sub2;
import com.jagex.Class424;
import com.jagex.Class509;
import com.jagex.Class523;
import com.jagex.RSByteBuffer;
import com.jagex.Class531;
import com.jagex.Class561;
import com.jagex.Class588;
import com.jagex.Class602;
import com.jagex.Class604;
import com.jagex.Class606;
import com.jagex.Class625;
import com.jagex.Class673;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Interface28;
import com.jagex.Interface67;
import java.util.Iterator;

public class Class218 {
   static final int anInt2279 = 2;
   static final int anInt2281 = 1;
   Class247 aClass247_2278;
   int anInt2280;
   int anInt2285;
   boolean aBool2286;
   int anInt2288;
   boolean aBool2283;
   Class2 aClass2_2290;
   long aLong2289;
   String aString2284;
   Class625[] aClass625Array2287;
   Class2 aClass2_2282;

   public String method2993(byte var1) {
      return this.aString2284;
   }

   void method2994(Class247 var1, byte var2) {
      this.aClass247_2278 = var1;
   }

   void method2995(int var1, int var2) {
      this.anInt2280 = 414482427 * var1;
   }

   void method2996(int var1, int var2) {
      this.anInt2285 = 190497249 * var1;
   }

   void method2997(boolean var1, byte var2) {
      this.aBool2286 = var1;
   }

   void method2998(int var1) {
      this.anInt2288 = -1258375129 * var1;
   }

   void method2999(boolean var1) {
      this.aBool2286 = var1;
   }

   public int method3000(int var1) {
      return this.anInt2288 * 2145859479;
   }

   void method3001(int var1, byte var2) {
      this.anInt2288 = -1258375129 * var1;
   }

   long method3002(byte var1) {
      return 7773209579177212403L * this.aLong2289;
   }

   void method3003(int var1) {
      this.anInt2288 = -1258375129 * var1;
   }

   public Class625 method3004(int var1, int var2) {
      return this.aClass625Array2287[var1];
   }

   void method3005(Class218 var1, int var2) {
      for(int var3 = 0; var3 < this.aClass625Array2287.length; ++var3) {
         this.aClass625Array2287[var3].method7429(var1.aClass625Array2287[var3].method7441('\uff00'), -2027855413);
         this.aClass625Array2287[var3].method7432(this.aClass625Array2287[var3].method7438(528957591), -1803281206);
      }

      this.aClass2_2282.method28(-1546041482);
      Iterator var5 = var1.aClass2_2282.iterator();

      while(var5.hasNext()) {
         Class424 var4 = (Class424)var5.next();
         this.aClass2_2282.method27(var4.anInt4793 * 1602756037, var4.anObject4794, 172204199);
      }

      this.aBool2283 = var1.aBool2283;
   }

   public void method3006(Interface28 var1, int var2) {
      if(this.aClass2_2290 == null) {
         this.aClass2_2290 = new Class2(var1.method172((short)13310));
      } else {
         this.aClass2_2290.method28(-1998111227);
      }

   }

   public Class247 method3007(byte var1) {
      return this.aClass247_2278;
   }

   void method3008(int var1) {
      this.anInt2280 = 414482427 * var1;
   }

   Class218(RSByteBuffer var1, boolean var2, boolean var3, Interface28 var4) {
      if(var2) {
         this.aLong2289 = var1.method9663(629106779) * 992523757200066363L;
      } else {
         this.aLong2289 = -992523757200066363L;
      }

      if(var3) {
         this.aString2284 = var1.method9700((byte)2);
      }

      int var5 = var1.readUnsignedByte(288730038);
      this.aBool2283 = (var5 & 1) != 0;
      this.aBool2286 = (var5 & 2) != 0;
      this.aClass625Array2287 = new Class625[var4.method173(-1230183985).method7135((byte)-44)];
      int var6 = var1.readUnsignedByte(1099293644);
      if(var6 > this.aClass625Array2287.length) {
         throw new IllegalStateException("");
      } else {
         int var7;
         for(var7 = 0; var7 < this.aClass625Array2287.length; ++var7) {
            Class625 var8 = this.aClass625Array2287[var7] = new Class625(var4.method173(-1230183985).method7133(var7, -591250380), true);
            if(var7 < var6) {
               var8.method7429(var1.readInt((byte)5), 283147657);
            } else {
               var8.method7429(0, 668386777);
            }

            var8.method7432(var8.method7438(1484983852), -1010424388);
         }

         var7 = var1.readUnsignedShort(2051197855);
         this.aClass2_2282 = new Class2(var4.method172((short)-10356));

         for(int var10 = 0; var10 < var7; ++var10) {
            Class424 var9 = var4.method172((short)-4200).method8370(var1, 1460405437);
            this.aClass2_2282.method27(1602756037 * var9.anInt4793, var9.anObject4794, 172204199);
         }

         this.anInt2285 = var1.readUnsignedShort(702821378) * 190497249;
         if(this.anInt2285 * 1869693473 == '\uffff') {
            this.anInt2285 = -190497249;
         }

         this.anInt2280 = var1.readUnsignedByte(2034852613) * 414482427;
         this.aClass247_2278 = (Class247)Class561.findIdentifiable(Class247.method3393(1312231712), var1.readUnsignedByte(2047541392), (byte)-89);
         this.anInt2288 = var1.readUnsignedByte(-318594694) * -1258375129;
      }
   }

   public int method3009() {
      return 1869693473 * this.anInt2285;
   }

   void method3010(int var1) {
      this.anInt2285 = 190497249 * var1;
   }

   public boolean method3011() {
      return this.aBool2286;
   }

   public boolean method3012() {
      return this.aBool2286;
   }

   void method3013(boolean var1) {
      this.aBool2286 = var1;
   }

   void method3014(boolean var1) {
      this.aBool2286 = var1;
   }

   void method3015(boolean var1) {
      this.aBool2286 = var1;
   }

   void method3016(int var1) {
      this.anInt2288 = -1258375129 * var1;
   }

   void method3017(int var1) {
      this.anInt2280 = 414482427 * var1;
   }

   public int method3018() {
      return this.anInt2288 * 2145859479;
   }

   public int method3019() {
      return this.anInt2288 * 2145859479;
   }

   public boolean method3020() {
      return this.aBool2283;
   }

   void method3021(int var1) {
      this.anInt2285 = 190497249 * var1;
   }

   public int method3022(int var1) {
      return 1869693473 * this.anInt2285;
   }

   public int method3023(int var1) {
      return this.anInt2280 * -1605717197;
   }

   void method3024(int var1) {
      this.anInt2288 = -1258375129 * var1;
   }

   public Class2 method3025(byte var1) {
      return this.aClass2_2290;
   }

   long method3026() {
      return 7773209579177212403L * this.aLong2289;
   }

   public boolean method3027(int var1) {
      return this.aBool2286;
   }

   public boolean method3028(short var1) {
      return this.aBool2283;
   }

   public static Interface67 method3029(RSByteBuffer var0, byte var1) {
      Class588 var2 = Class509.method6165(var0.readUnsignedByte(1083210153), (byte)-93);
      return (Interface67)(var2 == Class588.aClass588_7799?Class604.method7102(var0, -1427655944):(Class588.aClass588_7801 == var2?Class531.method6376(var0, 378256267):(var2 == Class588.aClass588_7798?Class523.method6274(var0, -383391508):null)));
   }

   public static Class606[] method3030(int var0) {
      return new Class606[]{Class606.aClass606_7906, Class606.aClass606_7907, Class606.aClass606_7905, Class606.aClass606_7909, Class606.aClass606_7904, Class606.aClass606_7910};
   }

   static void method3031(Class681 var0, int var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[var0.anInt8623 * -1730576285 - 2], -27364847)).anIntArrayArray3084[var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1]][1];
      var0.anInt8623 -= -1957887669;
   }

   static final void method3032(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class602.method7096(var3, var4, var0, Class318_Sub2.aClass526_Sub9_10065 == var0.aClass526_Sub9_8646?Class258.aClass258_2827:Class258.aClass258_2825, 1340751157);
   }

   static final void method3033(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static char method3034(char var0, Class673 var1, int var2) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return '\u0041';
         }

         if(var0 == 199) {
            return '\u0043';
         }

         if(var0 >= 200 && var0 <= 203) {
            return '\u0045';
         }

         if(var0 >= 204 && var0 <= 207) {
            return '\u0049';
         }

         if(209 == var0 && Class673.aClass673_8568 != var1) {
            return '\u004e';
         }

         if(var0 >= 210 && var0 <= 214) {
            return '\u004f';
         }

         if(var0 >= 217 && var0 <= 220) {
            return '\u0055';
         }

         if(221 == var0) {
            return '\u0059';
         }

         if(var0 == 223) {
            return '\u0073';
         }

         if(var0 >= 224 && var0 <= 230) {
            return '\u0061';
         }

         if(var0 == 231) {
            return '\u0063';
         }

         if(var0 >= 232 && var0 <= 235) {
            return '\u0065';
         }

         if(var0 >= 236 && var0 <= 239) {
            return '\u0069';
         }

         if(241 == var0 && Class673.aClass673_8568 != var1) {
            return '\u006e';
         }

         if(var0 >= 242 && var0 <= 246) {
            return '\u006f';
         }

         if(var0 >= 249 && var0 <= 252) {
            return '\u0075';
         }

         if(var0 == 253 || 255 == var0) {
            return '\u0079';
         }
      }

      return 338 == var0?'\u004f':(339 == var0?'\u006f':(376 == var0?'\u0059':var0));
   }

   public static String method3035(byte[] var0, int var1) {
      return Class214.method2958(var0, 0, var0.length, 726940837);
   }
}
