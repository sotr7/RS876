package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub33;
import com.jagex.Class594;
import com.jagex.Class681;
import com.jagex.Class711;

public class Class711_Sub18 extends Class711 {
   public static final int anInt10866 = 1;
   public static final int anInt10867 = 2;
   public static final int anInt10868 = 3;
   public static final int anInt10869 = 0;

   public void method10013() {
      if(this.aClass526_Sub33_8856.aClass711_Sub13_10647.method9968(195332170) == 2 && 2 == this.anInt8853 * 1174126091) {
         this.anInt8853 = 1568955811;
      }

      if(1174126091 * this.anInt8853 < 0 || 1174126091 * this.anInt8853 > 3) {
         this.anInt8853 = this.method8320((byte)120) * 1568955811;
      }

   }

   public Class711_Sub18(int var1, Class526_Sub33 var2) {
      super(var1, var2);
   }

   int method8320(byte var1) {
      return 2;
   }

   public Class711_Sub18(Class526_Sub33 var1) {
      super(var1);
   }

   public void method10014(byte var1) {
      if(this.aClass526_Sub33_8856.aClass711_Sub13_10647.method9968(-1985472691) == 2 && 2 == this.anInt8853 * 1174126091) {
         this.anInt8853 = 1568955811;
      }

      if(1174126091 * this.anInt8853 < 0 || 1174126091 * this.anInt8853 > 3) {
         this.anInt8853 = this.method8320((byte)33) * 1568955811;
      }

   }

   void method8315(int var1, int var2) {
      this.anInt8853 = 1568955811 * var1;
   }

   public int method10015(int var1) {
      return 1174126091 * this.anInt8853;
   }

   int method8311() {
      return 2;
   }

   int method8317(int var1) {
      return 1;
   }

   int method8316(int var1) {
      return 1;
   }

   void method8319(int var1) {
      this.anInt8853 = 1568955811 * var1;
   }

   int method8313(int var1, int var2) {
      return 1;
   }

   public int method10016() {
      return 1174126091 * this.anInt8853;
   }

   public int method10017() {
      return 1174126091 * this.anInt8853;
   }

   static final void method10018(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629];
      String var3 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629 + 1];
      var0.anInt8623 -= 379191958;
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var5 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      if(var3 == null) {
         var3 = "";
      }

      if(var3.length() > 80) {
         var3 = var3.substring(0, 80);
      }

      Class111 var6 = Class452_Sub4.method9295((byte)45);
      OutFrameBuffer var7 = Class115.method1414(OutFrame.aClass405_4166, var6.aClass14_1342, 1153150153);
      var7.out.writeByte(Class594.method7039(var2, -376195811) + 2 + Class594.method7039(var3, -624845731), -1045238707);
      var7.out.method9616(var2, 1662549689);
      var7.out.writeByte(var4 - 1, -443399694);
      var7.out.writeByte(var5, -1611764171);
      var7.out.method9616(var3, -2031448580);
      var6.write(var7, (byte)44);
   }
}
