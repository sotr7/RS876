package com.jagex;

import com.jagex.Class454;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import com.jagex.Class71;
import com.jagex.Interface12;
import com.jagex.Interface5;

public class Class18 implements Interface12, Interface5 {
   Object[][] anObjectArrayArray184;
   Class454[][] aClass454ArrayArray185;

   void method627(RSByteBuffer var1, int var2) {
      if(var2 == 3) {
         int var3 = var1.readUnsignedByte(520834722);
         if(null == this.anObjectArrayArray184) {
            this.anObjectArrayArray184 = new Object[var3][];
            this.aClass454ArrayArray185 = new Class454[var3][];
         }

         for(int var4 = var1.readUnsignedByte(1502482750); var4 != 255; var4 = var1.readUnsignedByte(524976110)) {
            int var5 = var1.readUnsignedByte(623233252);
            Class454[] var6 = new Class454[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-281162376), (byte)-9);
            }

            this.anObjectArrayArray184[var4] = Class71.method1098(var1, var6, (byte)-21);
            this.aClass454ArrayArray185[var4] = var6;
         }
      }

   }

   void method628(RSByteBuffer var1, int var2) {
      if(var2 == 3) {
         int var3 = var1.readUnsignedByte(-2090225019);
         if(null == this.anObjectArrayArray184) {
            this.anObjectArrayArray184 = new Object[var3][];
            this.aClass454ArrayArray185 = new Class454[var3][];
         }

         for(int var4 = var1.readUnsignedByte(1082437887); var4 != 255; var4 = var1.readUnsignedByte(-1956776481)) {
            int var5 = var1.readUnsignedByte(-1964081159);
            Class454[] var6 = new Class454[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-90228024), (byte)-20);
            }

            this.anObjectArrayArray184[var4] = Class71.method1098(var1, var6, (byte)-104);
            this.aClass454ArrayArray185[var4] = var6;
         }
      }

   }

   public Object[] method629(int var1, int var2) {
      return this.anObjectArrayArray184 == null?null:this.anObjectArrayArray184[var1];
   }

   void method630(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 3) {
         int var4 = var1.readUnsignedByte(1234528173);
         if(null == this.anObjectArrayArray184) {
            this.anObjectArrayArray184 = new Object[var4][];
            this.aClass454ArrayArray185 = new Class454[var4][];
         }

         for(int var5 = var1.readUnsignedByte(1299896565); var5 != 255; var5 = var1.readUnsignedByte(-1793462305)) {
            int var6 = var1.readUnsignedByte(-641057793);
            Class454[] var7 = new Class454[var6];

            for(int var8 = 0; var8 < var6; ++var8) {
               var7[var8] = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-159679640), (byte)-82);
            }

            this.anObjectArrayArray184[var5] = Class71.method1098(var1, var7, (byte)-120);
            this.aClass454ArrayArray185[var5] = var7;
         }
      }

   }

   public void method81(int var1) {
   }

   public void method49(int var1, int var2) {
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-2020898673);
         if(0 == var2) {
            return;
         }

         this.method630(var1, var2, -234427867);
      }
   }

   public void method85() {
   }

   void method631(RSByteBuffer var1, int var2) {
      if(var2 == 3) {
         int var3 = var1.readUnsignedByte(-2025537114);
         if(null == this.anObjectArrayArray184) {
            this.anObjectArrayArray184 = new Object[var3][];
            this.aClass454ArrayArray185 = new Class454[var3][];
         }

         for(int var4 = var1.readUnsignedByte(853611339); var4 != 255; var4 = var1.readUnsignedByte(-1250724526)) {
            int var5 = var1.readUnsignedByte(-1535381901);
            Class454[] var6 = new Class454[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-1023501232), (byte)-54);
            }

            this.anObjectArrayArray184[var4] = Class71.method1098(var1, var6, (byte)-122);
            this.aClass454ArrayArray185[var4] = var6;
         }
      }

   }

   public void method51(int var1) {
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1253596729);
         if(0 == var3) {
            return;
         }

         this.method630(var1, var3, -234427867);
      }
   }

   public void method50(int var1) {
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(33566461);
         if(0 == var2) {
            return;
         }

         this.method630(var1, var2, -234427867);
      }
   }
}
