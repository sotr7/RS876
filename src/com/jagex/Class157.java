package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class143;
import com.jagex.Class174;
import com.jagex.Class199_Sub4;
import com.jagex.Class214;
import com.jagex.Class219;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class307;
import com.jagex.Class31;
import com.jagex.Class311;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.OutFrame;
import com.jagex.Class41;
import com.jagex.Class45;
import com.jagex.Class452_Sub4;
import com.jagex.Class5;
import com.jagex.Class522;
import com.jagex.Class523;
import com.jagex.Class526_Sub2;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class526_Sub25;
import com.jagex.OutFrameBuffer;
import com.jagex.Class531_Sub1;
import com.jagex.Class569;
import com.jagex.Class573;
import com.jagex.Class594;
import com.jagex.Class609;
import com.jagex.Class65;
import com.jagex.Class679;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class709;
import com.jagex.Class711_Sub36;
import com.jagex.Class8;

public class Class157 {
   public static final int anInt1749 = -1;
   public static final int anInt1750 = 0;
   public static final int anInt1751 = 4098;
   public static final int anInt1752 = 32902;
   public static final int anInt1753 = 4318;
   public int anInt1754;
   public String aString1755;
   public int anInt1756;
   public String aString1757;
   public long aLong1758;

   public Class157(int var1, String var2, int var3, String var4, long var5, boolean var7) {
      this.anInt1754 = var1 * -1999495037;
      this.aString1755 = var2;
      this.anInt1756 = var3 * -1360687905;
      this.aString1757 = var4;
      this.aLong1758 = -6741293936693603979L * var5;
   }

   public static void method1862(Class65 var0, String var1, int var2, Throwable var3, byte var4) {
      Class709.method8305(new Class569(var0, var1, var2, var3), 2088276807);
   }

   static void method1863(String var0, String var1, String var2, boolean var3, boolean var4, byte var5) {
      Class111 var6 = Class452_Sub4.method9295((byte)123);
      if(var6.method1364(-1184311292) != null) {
         OutFrameBuffer var7 = Class115.method1414(OutFrame.aClass405_4216, var6.aClass14_1342, -1740227518);
         var7.out.writeShort(Class594.method7039(var0, -465372985) + Class594.method7039(var1, 137141071) + Class594.method7039(var2, -1795672227) + 1, -805078716);
         var7.out.method9616(var0, 462402903);
         var7.out.method9616(var1, -715307061);
         var7.out.method9616(var2, 439769154);
         int var8 = 0;
         if(var3) {
            var8 |= 1;
         }

         if(var4) {
            var8 |= 2;
         }

         var7.out.writeByte(var8, -1353220112);
         var6.write(var7, (byte)-33);
      }

   }

   static final void method1864(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)2);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class214.method2960(var3, var4, var0, (byte)70);
   }

   public static int method1865(int var0, int var1, int var2, boolean var3, int var4) {
      Class317 var5 = (Class317)Class5.aClass40_Sub2_28.method89(var2, -2092095646);
      Class143 var6 = var5.aClass143_3405;
      Class526_Sub2 var7 = Class531_Sub1.method9301(var0, var3, 1805255113);
      int var8;
      if(var7 != null && var1 >= 0 && var1 < var7.anIntArray10329.length && var7.aClass2Array10332 != null && null != var7.aClass2Array10332[var1]) {
         var8 = var7.aClass2Array10332[var1].method33(697078941 * var6.anInt1674, (byte)47);
      } else {
         var8 = ((Integer)var6.method1661(1670712414)).intValue();
      }

      return var5.method4094(var8, -1434583520);
   }

   static void method1866(Class174 var0, int var1) {
      int var2 = -10660793;
      Class522.method6258(var0, 1183999269 * Class41.anInt450, 1581495531 * Class679.anInt8602, Class219.anInt2295 * 2110689557, Class573.anInt7689 * 1622612179, var2, -16777216, (byte)74);
      Class609.aClass163_7930.method1895(Class45.aClass45_545.method920(Class26.aClass673_247, -827840379), 3 + 1183999269 * Class41.anInt450, 1581495531 * Class679.anInt8602 + 14, var2, -1, -634491534);
      int var3 = Class8.aClass547_45.method6534(-292517829);
      int var4 = Class8.aClass547_45.method6531(515018867);
      int var5;
      Class526_Sub21_Sub6 var6;
      int var7;
      if(!Class31.aBool266) {
         var5 = 0;

         for(var6 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8206((byte)90); var6 != null; var6 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8181(2096096069)) {
            var7 = Class31.anInt262 * 414128345 * (1600532433 * Class31.anInt273 - 1 - var5) + Class679.anInt8602 * 1581495531 + 31;
            Class199_Sub4.method8996(var3, var4, 1183999269 * Class41.anInt450, Class679.anInt8602 * 1581495531, Class219.anInt2295 * 2110689557, 1622612179 * Class573.anInt7689, var7, var6, Class609.aClass163_7930, Class680.aClass1_8616, -1, -256, (byte)0);
            ++var5;
         }
      } else {
         var5 = 0;

         for(Class526_Sub21_Sub7 var8 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8143((byte)-1); var8 != null; var8 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8139(68831625)) {
            var7 = 414128345 * Class31.anInt262 * var5 + 31 + 1581495531 * Class679.anInt8602;
            if(-1095890769 * var8.anInt11664 == 1) {
               Class199_Sub4.method8996(var3, var4, Class41.anInt450 * 1183999269, Class679.anInt8602 * 1581495531, 2110689557 * Class219.anInt2295, Class573.anInt7689 * 1622612179, var7, (Class526_Sub21_Sub6)var8.aClass696_11662.aClass526_Sub21_8758.aClass526_Sub21_10531, Class609.aClass163_7930, Class680.aClass1_8616, -1, -256, (byte)0);
            } else {
               Class307.method4045(var3, var4, 1183999269 * Class41.anInt450, 1581495531 * Class679.anInt8602, Class219.anInt2295 * 2110689557, Class573.anInt7689 * 1622612179, var7, var8, Class609.aClass163_7930, Class680.aClass1_8616, -1, -256, 2123315643);
            }

            ++var5;
         }

         if(Class31.aClass526_Sub21_Sub7_267 != null) {
            Class522.method6258(var0, Class711_Sub36.anInt10917 * -679993307, 660573447 * Class311.anInt3384, Class526_Sub25.anInt10551 * -1423746299, 568451999 * Class523.anInt7075, var2, -16777216, (byte)31);
            Class609.aClass163_7930.method1895(Class31.aClass526_Sub21_Sub7_267.aString11663, 3 + Class711_Sub36.anInt10917 * -679993307, Class311.anInt3384 * 660573447 + 14, var2, -1, 1793055608);
            var5 = 0;

            for(var6 = (Class526_Sub21_Sub6)Class31.aClass526_Sub21_Sub7_267.aClass696_11662.method8143((byte)-1); var6 != null; var6 = (Class526_Sub21_Sub6)Class31.aClass526_Sub21_Sub7_267.aClass696_11662.method8139(68831625)) {
               var7 = Class31.anInt262 * 414128345 * var5 + Class311.anInt3384 * 660573447 + 31;
               Class199_Sub4.method8996(var3, var4, Class711_Sub36.anInt10917 * -679993307, 660573447 * Class311.anInt3384, Class526_Sub25.anInt10551 * -1423746299, 568451999 * Class523.anInt7075, var7, var6, Class609.aClass163_7930, Class680.aClass1_8616, -1, -256, (byte)0);
               ++var5;
            }
         }
      }

   }
}
