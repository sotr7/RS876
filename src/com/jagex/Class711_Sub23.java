package com.jagex;

import com.jagex.Class526_Sub33;
import com.jagex.RSByteBuffer;
import com.jagex.Buffer;
import com.jagex.Class570;
import com.jagex.Class711;

public class Class711_Sub23 extends Class711 {
   int method8311() {
      return 0;
   }

   int method8316(int var1) {
      return 1;
   }

   public void method10060(short var1) {
   }

   public void method10061() {
   }

   int method8313(int var1, int var2) {
      return 1;
   }

   void method8315(int var1, int var2) {
      this.anInt8853 = var1 * 1568955811;
   }

   public int method10062(int var1) {
      return 1174126091 * this.anInt8853;
   }

   public Class711_Sub23(int var1, Class526_Sub33 var2) {
      super(var1, var2);
   }

   int method8317(int var1) {
      return 1;
   }

   public void method10063() {
   }

   void method8319(int var1) {
      this.anInt8853 = var1 * 1568955811;
   }

   int method8320(byte var1) {
      return 0;
   }

   public void method10064() {
   }

   public void method10065() {
   }

   public Class711_Sub23(Class526_Sub33 var1) {
      super(var1);
   }

   static int method10066(Buffer var0, int var1) {
      int var2 = var0.readBit(2, 673441488);
      int var3;
      if(var2 == 0) {
         var3 = 0;
      } else if(var2 == 1) {
         var3 = var0.readBit(5, 673441488);
      } else if(var2 == 2) {
         var3 = var0.readBit(8, 673441488);
      } else {
         var3 = var0.readBit(11, 673441488);
      }

      return var3;
   }

   static void method10067(byte[] var0, int var1) {
      RSByteBuffer var2 = new RSByteBuffer(var0);

      while(true) {
         int var3 = var2.readUnsignedByte(-398809731);
         if(var3 == 0) {
            return;
         }

         if(1 == var3) {
            int var4 = var2.readUnsignedShort(1509435224);
            Class570.aClass231_7657.method3227(var4, 1008663835);
         }
      }
   }
}
