package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub33;
import com.jagex.Class594;
import com.jagex.Class676;
import com.jagex.Class711;

public class Class711_Sub39 extends Class711 {
   static final int anInt10924 = 2;
   public static final int anInt10925 = 0;
   public static final int anInt10926 = 1;

   public void method10172() {
      if(this.aClass526_Sub33_8856.method9598((byte)8) == Class676.aClass676_8592) {
         this.anInt8853 = -1157055674;
      }

      if(this.anInt8853 * 1174126091 < 0 || this.anInt8853 * 1174126091 > 2) {
         this.anInt8853 = this.method8320((byte)91) * 1568955811;
      }

   }

   int method8317(int var1) {
      return 1;
   }

   public Class711_Sub39(Class526_Sub33 var1) {
      super(var1);
   }

   int method8313(int var1, int var2) {
      return 1;
   }

   public Class711_Sub39(int var1, Class526_Sub33 var2) {
      super(var1, var2);
   }

   void method8315(int var1, int var2) {
      this.anInt8853 = var1 * 1568955811;
   }

   public int method10173(int var1) {
      return this.anInt8853 * 1174126091;
   }

   int method8311() {
      return 1;
   }

   public void method10174(int var1) {
      if(this.aClass526_Sub33_8856.method9598((byte)8) == Class676.aClass676_8592) {
         this.anInt8853 = -1157055674;
      }

      if(this.anInt8853 * 1174126091 < 0 || this.anInt8853 * 1174126091 > 2) {
         this.anInt8853 = this.method8320((byte)42) * 1568955811;
      }

   }

   int method8316(int var1) {
      return 1;
   }

   void method8319(int var1) {
      this.anInt8853 = var1 * 1568955811;
   }

   int method8320(byte var1) {
      return 1;
   }

   public void method10175() {
      if(this.aClass526_Sub33_8856.method9598((byte)8) == Class676.aClass676_8592) {
         this.anInt8853 = -1157055674;
      }

      if(this.anInt8853 * 1174126091 < 0 || this.anInt8853 * 1174126091 > 2) {
         this.anInt8853 = this.method8320((byte)106) * 1568955811;
      }

   }

   public int method10176() {
      return this.anInt8853 * 1174126091;
   }

   public static final void method10177(String var0, String var1, int var2) {
      Class111 var3 = Class452_Sub4.method9295((byte)60);
      OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4279, var3.aClass14_1342, -384090215);
      if(var1.length() > 30) {
         var1 = var1.substring(0, 30);
      }

      var4.out.writeByte(Class594.method7039(var0, -1746502426) + Class594.method7039(var1, -1745590621), 1875546262);
      var4.out.method9616(var1, -1522002603);
      var4.out.method9616(var0, -1253250941);
      var3.write(var4, (byte)-26);
   }
}
