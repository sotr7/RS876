package com.jagex;

import com.jagex.Class265;
import com.jagex.Class454;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import com.jagex.Class71;
import com.jagex.Interface12;
import com.jagex.Interface5;

public class Class77 implements Interface12, Interface5 {
   public Class454[][] aClass454ArrayArray815;
   public Object[][] anObjectArrayArray814;

   public void method49(int var1, int var2) {
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-828034253);
         if(0 == var3) {
            return;
         }

         this.method1132(var1, var3, 1340061706);
      }
   }

   public void method81(int var1) {
   }

   void method1132(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         int var4 = var1.readUnsignedByte(393447465);
         if(this.aClass454ArrayArray815 == null) {
            this.aClass454ArrayArray815 = new Class454[var4][];
         }

         for(int var5 = var1.readUnsignedByte(649721904); var5 != 255; var5 = var1.readUnsignedByte(2113972846)) {
            int var6 = var5 & 127;
            boolean var7 = 0 != (var5 & 128);
            Class454[] var8 = new Class454[var1.readUnsignedByte(-1883165666)];

            for(int var9 = 0; var9 < var8.length; ++var9) {
               var8[var9] = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-1736382149), (byte)-104);
            }

            this.aClass454ArrayArray815[var6] = var8;
            if(var7) {
               if(null == this.anObjectArrayArray814) {
                  this.anObjectArrayArray814 = new Object[this.aClass454ArrayArray815.length][];
               }

               this.anObjectArrayArray814[var6] = Class71.method1098(var1, var8, (byte)-117);
            }
         }
      }

   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1978551730);
         if(0 == var2) {
            return;
         }

         this.method1132(var1, var2, 1395208206);
      }
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-175697598);
         if(0 == var2) {
            return;
         }

         this.method1132(var1, var2, -153177727);
      }
   }

   public void method85() {
   }

   public void method50(int var1) {
   }

   public void method51(int var1) {
   }

   void method1133(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         int var3 = var1.readUnsignedByte(1243569153);
         if(this.aClass454ArrayArray815 == null) {
            this.aClass454ArrayArray815 = new Class454[var3][];
         }

         for(int var4 = var1.readUnsignedByte(2047743316); var4 != 255; var4 = var1.readUnsignedByte(-363191077)) {
            int var5 = var4 & 127;
            boolean var6 = 0 != (var4 & 128);
            Class454[] var7 = new Class454[var1.readUnsignedByte(-1120292726)];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-863523669), (byte)-57);
            }

            this.aClass454ArrayArray815[var5] = var7;
            if(var6) {
               if(null == this.anObjectArrayArray814) {
                  this.anObjectArrayArray814 = new Object[this.aClass454ArrayArray815.length][];
               }

               this.anObjectArrayArray814[var5] = Class71.method1098(var1, var7, (byte)-80);
            }
         }
      }

   }

   static void method1134(int var0, int var1, int var2, int var3, byte var4) {
      Class526_Sub21_Sub9 var5 = Class265.method3560(8, (long)var0);
      var5.method10584(230428369);
      var5.anInt11678 = var1 * 1693201951;
      var5.anInt11680 = -1482432943 * var2;
      var5.anInt11677 = 703746177 * var3;
   }
}
