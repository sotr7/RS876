package com.jagex;

import com.jagex.Class230;
import com.jagex.Class261;
import com.jagex.Class342;
import com.jagex.Class348;
import com.jagex.Class401;
import com.jagex.Class526_Sub23;
import com.jagex.RSByteBuffer;
import com.jagex.Connection;
import com.jagex.Class708;

public class Class526_Sub23_Sub9 extends Class526_Sub23 {
   boolean aBool11642;
   byte aByte11641;
   byte aByte11645;
   byte aByte11643;
   byte aByte11644;
   // $FF: synthetic field
   Class342 this$0;

   void method9456(RSByteBuffer var1) {
      this.aBool11642 = var1.readUnsignedByte(-82783036) == 1;
      this.aByte11641 = var1.readByte((byte)42);
      this.aByte11645 = var1.readByte((byte)103);
      this.aByte11643 = var1.readByte((byte)27);
      this.aByte11644 = var1.readByte((byte)24);
   }

   void method9451(RSByteBuffer var1, int var2) {
      this.aBool11642 = var1.readUnsignedByte(-2098102108) == 1;
      this.aByte11641 = var1.readByte((byte)80);
      this.aByte11645 = var1.readByte((byte)59);
      this.aByte11643 = var1.readByte((byte)25);
      this.aByte11644 = var1.readByte((byte)107);
   }

   Class526_Sub23_Sub9(Class342 var1) {
      this.this$0 = var1;
   }

   void method9453(RSByteBuffer var1) {
      this.aBool11642 = var1.readUnsignedByte(1013351036) == 1;
      this.aByte11641 = var1.readByte((byte)77);
      this.aByte11645 = var1.readByte((byte)82);
      this.aByte11643 = var1.readByte((byte)66);
      this.aByte11644 = var1.readByte((byte)94);
   }

   void method9454(RSByteBuffer var1) {
      this.aBool11642 = var1.readUnsignedByte(-1138074090) == 1;
      this.aByte11641 = var1.readByte((byte)52);
      this.aByte11645 = var1.readByte((byte)64);
      this.aByte11643 = var1.readByte((byte)82);
      this.aByte11644 = var1.readByte((byte)40);
   }

   void method9455(RSByteBuffer var1) {
      this.aBool11642 = var1.readUnsignedByte(-202004784) == 1;
      this.aByte11641 = var1.readByte((byte)84);
      this.aByte11645 = var1.readByte((byte)61);
      this.aByte11643 = var1.readByte((byte)120);
      this.aByte11644 = var1.readByte((byte)62);
   }

   void method9450(Class348 var1, byte var2) {
      var1.aBool3639 = this.aBool11642;
      var1.aByte3627 = this.aByte11641;
      var1.aByte3633 = this.aByte11645;
      var1.aByte3629 = this.aByte11643;
      var1.aByte3636 = this.aByte11644;
   }

   void method9452(RSByteBuffer var1) {
      this.aBool11642 = var1.readUnsignedByte(1797017959) == 1;
      this.aByte11641 = var1.readByte((byte)69);
      this.aByte11645 = var1.readByte((byte)13);
      this.aByte11643 = var1.readByte((byte)14);
      this.aByte11644 = var1.readByte((byte)73);
   }

   void method9457(Class348 var1) {
      var1.aBool3639 = this.aBool11642;
      var1.aByte3627 = this.aByte11641;
      var1.aByte3633 = this.aByte11645;
      var1.aByte3629 = this.aByte11643;
      var1.aByte3636 = this.aByte11644;
   }

   public static Class708[] method10566(byte var0) {
      if(null == Connection.aClass708Array7545) {
         Class708[] var1 = Class261.method3538(Class342.aClass690_3559, 595899495);
         Class708[] var2 = new Class708[var1.length];
         int var3 = 0;
         int var4 = Class230.preferences.aClass711_Sub43_10628.method10226(768393344);

         label71:
         for(int var5 = 0; var5 < var1.length; ++var5) {
            Class708 var6 = var1[var5];
            if((var6.anInt8838 * -1181563247 <= 0 || -1181563247 * var6.anInt8838 >= 24) && 14758297 * var6.anInt8840 >= 800 && -1823144195 * var6.anInt8839 >= 600 && (2 != var4 || var6.anInt8840 * 14758297 <= 800 && -1823144195 * var6.anInt8839 <= 600) && (1 != var4 || var6.anInt8840 * 14758297 <= 1024 && -1823144195 * var6.anInt8839 <= 768)) {
               for(int var7 = 0; var7 < var3; ++var7) {
                  Class708 var8 = var2[var7];
                  if(14758297 * var6.anInt8840 == 14758297 * var8.anInt8840 && -1823144195 * var6.anInt8839 == var8.anInt8839 * -1823144195) {
                     if(var6.anInt8838 * -1181563247 > -1181563247 * var8.anInt8838) {
                        var2[var7] = var6;
                     }
                     continue label71;
                  }
               }

               var2[var3] = var6;
               ++var3;
            }
         }

         Connection.aClass708Array7545 = new Class708[var3];
         System.arraycopy(var2, 0, Connection.aClass708Array7545, 0, var3);
         int[] var9 = new int[Connection.aClass708Array7545.length];

         for(int var10 = 0; var10 < Connection.aClass708Array7545.length; ++var10) {
            Class708 var11 = Connection.aClass708Array7545[var10];
            var9[var10] = -1823144195 * var11.anInt8839 * var11.anInt8840 * 14758297;
         }

         Class401.method4839(var9, Connection.aClass708Array7545, -1984067770);
      }

      return Connection.aClass708Array7545;
   }
}
