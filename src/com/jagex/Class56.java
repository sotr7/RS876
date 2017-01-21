package com.jagex;

import com.jagex.Class11;
import com.jagex.Class192;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class315_Sub1;
import com.jagex.Class385;
import com.jagex.Class448_Sub1;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.Class487;
import com.jagex.Class517;
import com.jagex.Class526_Sub21_Sub12;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.RSByteBuffer;
import com.jagex.Class628;
import com.jagex.Class662_Sub1;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.Interface72;
import java.util.Iterator;
import java.util.LinkedList;

public class Class56 {
   static final int anInt678 = 1;
   static final int anInt679 = 32768;
   public static Class451 aClass451_681;
   public static int anInt682;
   public int anInt677 = 0;
   public int anInt676 = 0;
   Class192 aClass192_673 = new Class192(64);
   Interface72 anInterface72_674 = null;
   Class466 aClass466_680;
   Class466 aClass466_675;

   public Class526_Sub21_Sub12 method994(int var1, byte var2) {
      Class526_Sub21_Sub12 var3 = (Class526_Sub21_Sub12)this.aClass192_673.method2765((long)var1);
      if(var3 != null) {
         return var3;
      } else {
         byte[] var4;
         if(var1 >= '\u8000') {
            var4 = this.aClass466_675.method5536(1, var1 & 32767, (byte)45);
         } else {
            var4 = this.aClass466_680.method5536(1, var1, (byte)22);
         }

         var3 = new Class526_Sub21_Sub12();
         var3.aClass56_11810 = this;
         if(null != var4) {
            var3.method10674(new RSByteBuffer(var4), (short)32767);
         }

         if(var1 >= '\u8000') {
            var3.method10687(-2013953597);
         }

         this.aClass192_673.method2768(var3, (long)var1);
         return var3;
      }
   }

   String method995(Class628 var1, int[] var2, long var3) {
      if(null != this.anInterface72_674) {
         String var5 = this.anInterface72_674.method492(var1, var2, var3);
         if(var5 != null) {
            return var5;
         }
      }

      return Long.toString(var3);
   }

   public Class56(Class673 var1, Class466 var2, Class466 var3, Interface72 var4) {
      this.aClass466_680 = var2;
      this.aClass466_675 = var3;
      this.anInterface72_674 = var4;
      if(null != this.aClass466_680) {
         this.anInt677 = this.aClass466_680.method5544(1, 2122225394) * 939462485;
      }

      if(null != this.aClass466_675) {
         this.anInt676 = this.aClass466_675.method5544(1, 2002284084) * 690974935;
      }

   }

   static final void method996(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-64);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class517.method6229(var3, var4, var0, 840695763);
   }

   public static int method997(String var0, boolean var1, short var2) {
      var0 = var0.toLowerCase();
      Class487.anIntArray5510 = null;
      Class385.anInt4038 = 0;
      LinkedList var3 = new LinkedList();
      LinkedList var4 = new LinkedList();

      int var5;
      for(var5 = 0; var5 < 483728625 * Class448_Sub1.aClass40_Sub1_10233.anInt447; ++var5) {
         Class11 var6 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var5, -5394141);
         if((!var1 || var6.aBool133) && var6.anInt86 * 1201332159 == -1 && -1 == var6.anInt122 * -1514407873 && 1235395399 * var6.anInt88 == -1 && 0 == var6.anInt138 * 251154279 && var6.aString76.toLowerCase().indexOf(var0) != -1) {
            if(var3.size() >= 250) {
               return -1;
            }

            var3.add(Integer.valueOf(var5));
            var4.add(var6.aString76);
         }
      }

      Class487.anIntArray5510 = new int[var3.size()];
      var5 = 0;

      Integer var7;
      for(Iterator var8 = var3.iterator(); var8.hasNext(); Class487.anIntArray5510[var5++] = var7.intValue()) {
         var7 = (Integer)var8.next();
      }

      String[] var9 = (String[])((String[])var4.toArray(new String[Class487.anIntArray5510.length]));
      Class662_Sub1.method9941(var9, Class487.anIntArray5510, -1541309869);
      return var3.size();
   }

   static void method998(int var0, int var1, byte var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(12, (long)var0);
      var3.method10584(230428369);
      var3.anInt11678 = 1693201951 * var1;
   }
}
