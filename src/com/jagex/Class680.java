package com.jagex;

import com.jagex.Class1;
import com.jagex.Class10;
import com.jagex.Class158;
import com.jagex.Class163_Sub1;
import com.jagex.Class192;
import com.jagex.Class306;
import com.jagex.Class319;
import com.jagex.Class32;
import com.jagex.Class425;
import com.jagex.Class446;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class695;
import java.util.ArrayList;

public final class Class680 {
   static final int anInt8605 = 5000000;
   static final int anInt8611 = 500000;
   static int[] anIntArray8615;
   static Class1 aClass1_8616;
   static int anInt8606 = 0;
   static int[] anIntArray8612 = new int[3];
   public static Class192 aClass192_8608 = new Class192(4);
   static Class446[] aClass446Array8609 = new Class446[2];
   static boolean aBool8610 = false;
   static String aString8604 = null;
   static ArrayList anArrayList8607 = new ArrayList();
   static int anInt8613 = 0;
   static int anInt8614 = 0;

   Class680() throws Throwable {
      throw new Error();
   }

   static final void method8025(int var0, int var1, int var2, int var3, byte var4) {
      Class425.method5008(Class554.aClass174_7475, (byte)-18);
      Class319.method4131(var0, var1, var2, var3, 256, 256, 769652605);
      Class163_Sub1.method8450(var0, var1, var2, var3, 256, 256, (byte)-14);
      Class306.method4039(var0, var1, var2, var3, 256, 256, 193027773);
      Class158.method1871(var0, var1, var2, var3, -153593086);
   }

   static void method8026(RSByteBuffer var0, long var1) {
      Class10 var3;
      if(null != Class32.aString334 && Class32.aString334.length() == 6) {
         if(Class32.aBool309) {
            var3 = Class10.aClass10_57;
         } else {
            var3 = Class10.aClass10_56;
         }
      } else if(Class695.aClass51_8757.method949(var1)) {
         var3 = Class10.aClass10_59;
      } else {
         var3 = Class10.aClass10_58;
      }

      var0.writeByte(var3.getId(), 1102996224);
      switch(-1961186447 * var3.anInt60) {
      case 0:
      case 2:
         var0.writeTriByte(Integer.parseInt(Class32.aString334), -1793794791);
         var0.pos += 801976415;
         break;
      case 1:
         var0.writeInt(Class695.aClass51_8757.method952(var1), -357564953);
         break;
      case 3:
         var0.pos += -1087061636;
      }

   }
}
