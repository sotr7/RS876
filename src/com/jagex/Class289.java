package com.jagex;

import com.jagex.Class174;
import com.jagex.Class176;
import com.jagex.Class192;
import com.jagex.Class238;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class312;
import com.jagex.Class466;
import com.jagex.Class501;
import com.jagex.Class525_Sub1;
import com.jagex.Class554;
import com.jagex.Class592;
import com.jagex.Class609;
import com.jagex.Class641;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class75;
import com.jagex.Class78;
import com.jagex.Interface31;
import com.jagex.Interface33;
import com.jagex.Interface69;
import com.jagex.Interface70;

public class Class289 implements Interface31 {
   public static long aLong3116;
   public static int anInt3117;
   Class174 aClass174_3108;
   boolean aBool3114;
   Class78 aClass78_3110;
   int anInt3112;
   int anInt3115;
   Interface33[] anInterface33Array3111;
   static byte[] aByteArray3113 = new byte[]{(byte)31, (byte)-117, (byte)8, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)-5, (byte)127, (byte)-29, (byte)-1, (byte)109, (byte)6, (byte)103, (byte)6, (byte)14, (byte)54, (byte)54, (byte)118, (byte)54, (byte)86, (byte)14, (byte)118, (byte)118, (byte)118, (byte)78, (byte)78, (byte)14, (byte)46, (byte)30, (byte)17, (byte)94, (byte)30, (byte)110, (byte)110, (byte)30, (byte)73, (byte)33, (byte)97, (byte)126, (byte)17, (byte)89, (byte)41, (byte)121, (byte)57, (byte)89, (byte)41, (byte)25, (byte)25, (byte)5, (byte)21, (byte)61, (byte)117, (byte)5, (byte)37, (byte)29, (byte)101, (byte)25, (byte)25, (byte)13, (byte)115, (byte)77, (byte)29, (byte)3, (byte)67, (byte)19, (byte)19, (byte)19, (byte)121, (byte)117, (byte)75, (byte)91, (byte)11, (byte)35, (byte)27, (byte)61, (byte)99, (byte)19, (byte)35, (byte)-112, (byte)33, (byte)-116, (byte)-100, (byte)-100, (byte)-100, (byte)60, (byte)-36, (byte)60, (byte)18, (byte)-68, (byte)-68, (byte)18, (byte)70, (byte)-118, (byte)50, (byte)-118, (byte)70, (byte)36, (byte)-125, (byte)-1, (byte)7, (byte)24, (byte)68, (byte)56, (byte)24, (byte)24, (byte)25, (byte)24, (byte)89, (byte)24, (byte)-107, (byte)24, (byte)-104, (byte)4, (byte)25, (byte)-103, (byte)5, (byte)25, (byte)89, (byte)-108, (byte)24, (byte)-2, (byte)31, (byte)97, (byte)-112, (byte)103, (byte)96, (byte)96, (byte)100, (byte)101, (byte)4, (byte)3, (byte)6, (byte)40, (byte)96, (byte)100, (byte)98, (byte)102, (byte)97, (byte)101, (byte)99, (byte)-25, (byte)-32, (byte)-28, (byte)-30, (byte)6, (byte)42, (byte)-40, (byte)42, (byte)-64, (byte)-64, (byte)-60, (byte)-56, (byte)-52, (byte)-52, (byte)-60, (byte)-62, (byte)-52, (byte)-54, (byte)-54, (byte)-62, (byte)2, (byte)-108, (byte)-83, (byte)5, (byte)-54, (byte)51, (byte)-80, (byte)8, (byte)-78, (byte)10, (byte)41, (byte)26, (byte)58, (byte)-78, (byte)9, (byte)7, (byte)38, (byte)-78, (byte)43, (byte)21, (byte)-118, (byte)24, (byte)53, (byte)78, (byte)92, (byte)-56, (byte)-95, (byte)-20, (byte)-76, (byte)-15, (byte)-96, (byte)104, (byte)-48, (byte)-59, (byte)15, (byte)42, (byte)-58, (byte)73, (byte)69, (byte)77, (byte)-100, (byte)92, (byte)98, (byte)-30, (byte)18, (byte)-110, (byte)82, (byte)-86, (byte)106, (byte)-22, (byte)26, (byte)-102, (byte)90, (byte)38, (byte)-90, (byte)102, (byte)-26, (byte)22, (byte)-106, (byte)86, (byte)-50, (byte)46, (byte)-82, (byte)110, (byte)-18, (byte)30, (byte)-98, (byte)94, (byte)-63, (byte)33, (byte)-95, (byte)97, (byte)-31, (byte)17, (byte)-111, (byte)81, (byte)-55, (byte)41, (byte)-87, (byte)105, (byte)-23, (byte)25, (byte)-103, (byte)89, (byte)-59, (byte)37, (byte)-91, (byte)101, (byte)-27, (byte)21, (byte)-107, (byte)85, (byte)-51, (byte)45, (byte)-83, (byte)109, (byte)-19, (byte)29, (byte)-99, (byte)93, (byte)-109, (byte)38, (byte)79, (byte)-103, (byte)58, (byte)109, (byte)-6, (byte)-116, (byte)-103, (byte)-77, (byte)22, (byte)45, (byte)94, (byte)-78, (byte)116, (byte)-39, (byte)-14, (byte)21, (byte)43, (byte)87, (byte)109, (byte)-38, (byte)-68, (byte)101, (byte)-21, (byte)-74, (byte)-19, (byte)59, (byte)118, (byte)-18, (byte)58, (byte)116, (byte)-8, (byte)-56, (byte)-47, (byte)99, (byte)-57, (byte)79, (byte)-100, (byte)60, (byte)117, (byte)-23, (byte)-14, (byte)-107, (byte)-85, (byte)-41, (byte)-82, (byte)-33, (byte)-72, (byte)121, (byte)-21, (byte)-31, (byte)-93, (byte)-57, (byte)79, (byte)-98, (byte)62, (byte)123, (byte)-2, (byte)-30, (byte)-27, (byte)-85, (byte)-113, (byte)-97, (byte)62, (byte)127, (byte)-7, (byte)-6, (byte)-19, (byte)-5, (byte)-113, (byte)-97, (byte)-65, (byte)64, (byte)-2, (byte)98, (byte)100, (byte)96, (byte)102, (byte)-124, (byte)1, (byte)-84, (byte)-2, (byte)18, (byte)4, (byte)-6, (byte)-117, (byte)-119, (byte)-123, (byte)-123, (byte)-103, (byte)-123, (byte)29, (byte)-28, (byte)47, (byte)70, (byte)-90, (byte)114, (byte)-112, (byte)2, (byte)65, (byte)22, (byte)86, (byte)69, (byte)67, (byte)54, (byte)33, (byte)-57, (byte)64, (byte)-10, (byte)-60, (byte)66, (byte)97, (byte)37, (byte)-93, (byte)70, (byte)14, (byte)17, (byte)-89, (byte)-119, (byte)11, (byte)55, (byte)30, (byte)-28, (byte)84, (byte)54, (byte)14, (byte)-6, (byte)32, (byte)-102, (byte)84, (byte)116, (byte)-111, (byte)75, (byte)76, (byte)-59, (byte)-28, (byte)-95, (byte)-22, (byte)71, (byte)-112, (byte)-41, (byte)-64, (byte)62, (byte)35, (byte)-50, (byte)99, (byte)77, (byte)100, (byte)-7, (byte)12, (byte)-18, (byte)49, (byte)-124, (byte)-65, (byte)110, (byte)49, (byte)-16, (byte)-79, (byte)48, (byte)2, (byte)-29, (byte)15, (byte)-24, (byte)78, (byte)6, (byte)6, (byte)123, (byte)-122, (byte)-97, (byte)-1, (byte)-70, (byte)52, (byte)22, (byte)-16, (byte)-49, (byte)127, (byte)-79, (byte)-88, (byte)-21, (byte)-1, (byte)77, (byte)0, (byte)38, (byte)27, (byte)-28, (byte)10, (byte)110, (byte)2, (byte)0, (byte)0};
   static Class192 aClass192_3109 = new Class192(128, 4);

   public void method212() {
   }

   public void method150(byte var1) {
      if(Class554.aClass174_7475 != this.aClass174_3108) {
         this.aClass174_3108 = Class554.aClass174_7475;
         this.aBool3114 = true;
      }

      this.aClass174_3108.method2283(3, 0);
      Interface33[] var2 = this.anInterface33Array3111;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Interface33 var4 = var2[var3];
         if(var4 != null) {
            var4.method228(-1695571058);
         }
      }

   }

   public void method202(boolean var1, byte var2) {
      var1 = true;
      Interface33[] var3 = this.anInterface33Array3111;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Interface33 var5 = var3[var4];
         if(null != var5) {
            var5.method233(var1 || this.aBool3114, 1714476682);
         }
      }

      this.aBool3114 = false;
   }

   public int method206(int var1) {
      int var2 = 0;
      Interface33[] var3 = this.anInterface33Array3111;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Interface33 var5 = var3[var4];
         if(null == var5 || var5.method227((short)260)) {
            ++var2;
         }
      }

      return var2 * 100 / this.anInterface33Array3111.length;
   }

   public void method203(int var1) {
   }

   public boolean method220(long var1) {
      return Class255.time((byte)24) >= (long)(this.anInt3112 * 480587589) + var1;
   }

   public int method205(byte var1) {
      return 917155399 * this.anInt3115;
   }

   public boolean method214(long var1) {
      return Class255.time((byte)24) >= (long)(this.anInt3112 * 480587589) + var1;
   }

   public void method211(boolean var1) {
      var1 = true;
      Interface33[] var2 = this.anInterface33Array3111;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Interface33 var4 = var2[var3];
         if(null != var4) {
            var4.method233(var1 || this.aBool3114, 1725104617);
         }
      }

      this.aBool3114 = false;
   }

   public void method207() {
   }

   public int method217() {
      return 917155399 * this.anInt3115;
   }

   static boolean method3814() {
      try {
         Class75 var0 = new Class75();
         byte[] var1 = var0.method1115(aByteArray3113, (byte)16);
         Class176.method2657(var1, (byte)-29);
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   public void method208() {
      if(Class554.aClass174_7475 != this.aClass174_3108) {
         this.aClass174_3108 = Class554.aClass174_7475;
         this.aBool3114 = true;
      }

      this.aClass174_3108.method2283(3, 0);
      Interface33[] var1 = this.anInterface33Array3111;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Interface33 var3 = var1[var2];
         if(var3 != null) {
            var3.method228(-2038731256);
         }
      }

   }

   static boolean method3815() {
      try {
         Class75 var0 = new Class75();
         byte[] var1 = var0.method1115(aByteArray3113, (byte)64);
         Class176.method2657(var1, (byte)-60);
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   public int method216() {
      int var1 = 0;
      Interface33[] var2 = this.anInterface33Array3111;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Interface33 var4 = var2[var3];
         if(null == var4 || var4.method227((short)260)) {
            ++var1;
         }
      }

      return var1 * 100 / this.anInterface33Array3111.length;
   }

   public int method213() {
      int var1 = 0;
      Interface33[] var2 = this.anInterface33Array3111;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Interface33 var4 = var2[var3];
         if(null == var4 || var4.method227((short)260)) {
            ++var1;
         }
      }

      return var1 * 100 / this.anInterface33Array3111.length;
   }

   public int method204() {
      int var1 = 0;
      Interface33[] var2 = this.anInterface33Array3111;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Interface33 var4 = var2[var3];
         if(null == var4 || var4.method227((short)260)) {
            ++var1;
         }
      }

      return var1 * 100 / this.anInterface33Array3111.length;
   }

   public boolean method201(long var1) {
      return Class255.time((byte)24) >= (long)(this.anInt3112 * 480587589) + var1;
   }

   public int method215() {
      return 917155399 * this.anInt3115;
   }

   public int method209() {
      return 917155399 * this.anInt3115;
   }

   public int method218() {
      return 917155399 * this.anInt3115;
   }

   public int method219() {
      return 917155399 * this.anInt3115;
   }

   static void method3816() {
      aClass192_3109.method2770(1666517437);
   }

   public int method221() {
      return 917155399 * this.anInt3115;
   }

   Class289(Class78 var1, int var2, int var3, Class312 var4) {
      this.aClass78_3110 = var1;
      this.anInt3112 = var2 * 2102987661;
      this.anInt3115 = var3 * 633117559;
      this.anInterface33Array3111 = new Interface33[this.aClass78_3110.anInterface45Array816.length];

      for(int var5 = 0; var5 < this.anInterface33Array3111.length; ++var5) {
         this.anInterface33Array3111[var5] = var4.method4071(this.aClass78_3110.anInterface45Array816[var5], 1104826702);
      }

   }

   static boolean method3817() {
      try {
         Class75 var0 = new Class75();
         byte[] var1 = var0.method1115(aByteArray3113, (byte)-94);
         Class176.method2657(var1, (byte)-60);
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   static boolean method3818() {
      try {
         Class75 var0 = new Class75();
         byte[] var1 = var0.method1115(aByteArray3113, (byte)-9);
         Class176.method2657(var1, (byte)-33);
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   public void method210() {
   }

   public static Interface70 method3819(Class466 var0, int var1, Interface69 var2, boolean var3, Class192 var4, int var5) {
      return (Interface70)(null != Class641.aClass361_8348?(var3?new Class592(var0, var1, Class641.aClass361_8348, var2):new Class609(var0, var1, Class641.aClass361_8348, var2, var4)):null);
   }

   static final void method3820(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.componentItem * -77845371;
   }

   static final void method3821(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Character.toLowerCase((char)var2);
   }

   public static boolean method3822(int var0) {
      return null != Class501.anInterface61_5632;
   }

   static boolean method3823(Class238 var0, byte var1) {
      if(var0 == null) {
         return false;
      } else {
         if(null != var0.anIntArray2424) {
            var0 = var0.method3295(Class525_Sub1.anInterface17_7091, Class525_Sub1.anInterface19_7090, 500966910);
            if(null == var0) {
               return false;
            }
         }

         if(!var0.aBool2411) {
            return false;
         } else if(!var0.method3302(Class525_Sub1.anInterface17_7091, Class525_Sub1.anInterface19_7090, -1247166394)) {
            return false;
         } else if(Class525_Sub1.aClass20_10724.get((long)(var0.anInt2399 * -1510173673)) != null) {
            return false;
         } else if(Class525_Sub1.aClass20_10725.get((long)(var0.anInt2442 * 831231597)) != null) {
            return false;
         } else {
            if(null != var0.aString2398) {
               if(803087905 * var0.anInt2405 == 0 && Class525_Sub1.aBool10727) {
                  return false;
               }

               if(var0.anInt2405 * 803087905 == 1 && Class525_Sub1.aBool10728) {
                  return false;
               }

               if(2 == var0.anInt2405 * 803087905 && Class525_Sub1.aBool10730) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
