package com.jagex;

import com.jagex.Class153;
import com.jagex.Class167;
import com.jagex.Class195;
import com.jagex.Class199_Sub1;
import com.jagex.Class20;
import com.jagex.Class21;
import com.jagex.Class304;
import com.jagex.Class391;
import com.jagex.Class471;
import com.jagex.Class526_Sub25;
import com.jagex.Class539_Sub1_Sub1_Sub1;
import com.jagex.Class614;
import com.jagex.Class661;
import com.jagex.Class681;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Class619 {
   static Class539_Sub1_Sub1_Sub1[] aClass539_Sub1_Sub1_Sub1Array8108;
   static List aList8112;
   public static Class153 aClass153_8122;
   static int anInt8119 = 0;
   static int anInt8110 = 0;
   static int anInt8109 = 0;
   static int anInt8107 = 0;
   static int anInt8114 = 0;
   static int anInt8115 = 0;
   static Class391[] aClass391Array8118 = new Class391[16];
   static int anInt8113 = 0;
   static Class20 aClass20_8111 = new Class20(16);
   static Class20 aClass20_8116 = new Class20(8);
   static int anInt8120 = 0;
   static int anInt8121 = 1278539782;
   static Class614[] aClass614Array8117;

   public static int method7327() {
      return 1865223851 * anInt8121;
   }

   Class619() throws Throwable {
      throw new Error();
   }

   static int method7328(int var0) {
      Class526_Sub25 var1 = (Class526_Sub25)aClass20_8111.get((long)var0);
      if(var1 == null) {
         Class391 var2 = Class304.anInterface46_3280.method350(var0, -1422020428);
         if(var2 == null || 2 != -1760706667 * var2.anInt4078) {
            return -1;
         }

         var1 = new Class526_Sub25(930733103 * anInt8113);
         aClass20_8111.put(var1, (long)var0);
         aClass391Array8118[(anInt8113 += -1056118065) * 930733103 - 1] = var2;
      }

      return -1044108751 * var1.anInt10550;
   }

   static int method7329(int var0) {
      Class526_Sub25 var1 = (Class526_Sub25)aClass20_8111.get((long)var0);
      if(var1 == null) {
         Class391 var2 = Class304.anInterface46_3280.method350(var0, -1778634617);
         if(var2 == null || 2 != -1760706667 * var2.anInt4078) {
            return -1;
         }

         var1 = new Class526_Sub25(930733103 * anInt8113);
         aClass20_8111.put(var1, (long)var0);
         aClass391Array8118[(anInt8113 += -1056118065) * 930733103 - 1] = var2;
      }

      return -1044108751 * var1.anInt10550;
   }

   static int method7330(int var0) {
      Class526_Sub25 var1 = (Class526_Sub25)aClass20_8111.get((long)var0);
      if(var1 == null) {
         Class391 var2 = Class304.anInterface46_3280.method350(var0, -526502794);
         if(var2 == null || 2 != -1760706667 * var2.anInt4078) {
            return -1;
         }

         var1 = new Class526_Sub25(930733103 * anInt8113);
         aClass20_8111.put(var1, (long)var0);
         aClass391Array8118[(anInt8113 += -1056118065) * 930733103 - 1] = var2;
      }

      return -1044108751 * var1.anInt10550;
   }

   public static void method7331() {
      aClass20_8116 = new Class20(8);
      anInt8120 = 0;
      Iterator var0 = aList8112.iterator();

      while(var0.hasNext()) {
         Class614 var1 = (Class614)var0.next();
         var1.method7245();
      }

   }

   public static int method7332() {
      return 1865223851 * anInt8121;
   }

   static int method7333(int var0) {
      Class526_Sub25 var1 = (Class526_Sub25)aClass20_8111.get((long)var0);
      if(var1 == null) {
         Class391 var2 = Class304.anInterface46_3280.method350(var0, 1686686737);
         if(var2 == null || 2 != -1760706667 * var2.anInt4078) {
            return -1;
         }

         var1 = new Class526_Sub25(930733103 * anInt8113);
         aClass20_8111.put(var1, (long)var0);
         aClass391Array8118[(anInt8113 += -1056118065) * 930733103 - 1] = var2;
      }

      return -1044108751 * var1.anInt10550;
   }

   public static void method7334(int var0) {
      if(var0 < 0 || var0 > 2) {
         var0 = 0;
      }

      anInt8121 = 639269891 * var0;
      aClass614Array8117 = new Class614[Class167.anIntArray1896[1865223851 * anInt8121] + 1];
      anInt8109 = 0;
      anInt8107 = 0;
   }

   public static void method7335() {
      aClass20_8116 = new Class20(8);
      anInt8120 = 0;
      Iterator var0 = aList8112.iterator();

      while(var0.hasNext()) {
         Class614 var1 = (Class614)var0.next();
         var1.method7245();
      }

   }

   public static int method7336() {
      return 1865223851 * anInt8121;
   }

   public static int method7337() {
      return 1865223851 * anInt8121;
   }

   public static int method7338() {
      return 1865223851 * anInt8121;
   }

   static final void method7339(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class195.aClass292_Sub1_2182.method3907(var2, (byte)3);
   }

   public static Class21 method7340(String var0, String var1, boolean var2, int var3) {
      File var4 = new File(Class199_Sub1.aFile9868, "preferences" + var0 + ".dat");
      if(var4.exists()) {
         try {
            Class21 var11 = new Class21(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
            ;
         }
      }

      String var5 = "";
      if(-320214517 * Class471.anInt5361 == 33) {
         var5 = "_rc";
      } else if(34 == -320214517 * Class471.anInt5361) {
         var5 = "_wip";
      }

      File var6 = new File(Class661.aString8517, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      Class21 var7;
      if(!var2 && var6.exists()) {
         try {
            var7 = new Class21(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
            ;
         }
      }

      try {
         var7 = new Class21(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }
}
