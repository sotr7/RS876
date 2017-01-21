package com.jagex;

import com.jagex.Class331;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class397;
import com.jagex.Class454;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import com.jagex.Class69;
import com.jagex.Class711_Sub33;
import com.jagex.Interface12;
import com.jagex.Interface5;

public class Class83 implements Interface12, Interface5 {
   static int anInt846;
   Class454 aClass454_845;
   public int anInt843;
   public boolean aBool844 = true;
   public String aString842;

   public boolean method1167(int var1) {
      return Class454.aClass454_4997 == this.aClass454_845;
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-592914654);
         if(var3 == 0) {
            return;
         }

         this.method1173(var1, var3, (byte)98);
      }
   }

   public void method81(int var1) {
   }

   public void method49(int var1, int var2) {
   }

   public void method85() {
   }

   public boolean method1168() {
      return Class454.aClass454_4997 == this.aClass454_845;
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1114545041);
         if(var2 == 0) {
            return;
         }

         this.method1173(var1, var2, (byte)57);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1965634942);
         if(var2 == 0) {
            return;
         }

         this.method1173(var1, var2, (byte)121);
      }
   }

   public boolean method1169() {
      return Class454.aClass454_4997 == this.aClass454_845;
   }

   public void method50(int var1) {
   }

   public void method51(int var1) {
   }

   void method1170(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         char var3 = Class69.method1087(var1.readByte((byte)25), (short)10053);
         this.aClass454_845 = Class454.method5388(var3, -1900017564);
      } else if(var2 == 2) {
         this.anInt843 = var1.readInt((byte)5) * 1363298209;
      } else if(4 == var2) {
         this.aBool844 = false;
      } else if(var2 == 5) {
         this.aString842 = var1.readString(1918846472);
      } else if(101 == var2) {
         this.aClass454_845 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-1627453226), (byte)0);
      }

   }

   void method1171(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         char var3 = Class69.method1087(var1.readByte((byte)117), (short)6622);
         this.aClass454_845 = Class454.method5388(var3, -1786913459);
      } else if(var2 == 2) {
         this.anInt843 = var1.readInt((byte)5) * 1363298209;
      } else if(4 == var2) {
         this.aBool844 = false;
      } else if(var2 == 5) {
         this.aString842 = var1.readString(426890634);
      } else if(101 == var2) {
         this.aClass454_845 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-140175129), (byte)-80);
      }

   }

   public boolean method1172() {
      return Class454.aClass454_4997 == this.aClass454_845;
   }

   void method1173(RSByteBuffer var1, int var2, byte var3) {
      if(1 == var2) {
         char var4 = Class69.method1087(var1.readByte((byte)42), (short)1796);
         this.aClass454_845 = Class454.method5388(var4, -1478341284);
      } else if(var2 == 2) {
         this.anInt843 = var1.readInt((byte)5) * 1363298209;
      } else if(4 == var2) {
         this.aBool844 = false;
      } else if(var2 == 5) {
         this.aString842 = var1.readString(1832610513);
      } else if(101 == var2) {
         this.aClass454_845 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(-1917782367), (byte)-126);
      }

   }

   public static Class397 method1174(RSByteBuffer var0, int var1) {
      int var2 = var0.readUnsignedByte(-1188710561);
      Class384 var3 = Class711_Sub33.method10141((byte)-5)[var0.readUnsignedByte(-1487628862)];
      Class389 var4 = Class331.method4251((byte)15)[var0.readUnsignedByte(2086366966)];
      int var5 = var0.readShort((byte)1);
      int var6 = var0.readShort((byte)1);
      int var7 = var0.readUnsignedShort(730547771);
      int var8 = var0.readUnsignedShort(717944758);
      int var9 = var0.readInt((byte)5);
      int var10 = var0.readInt((byte)5);
      int var11 = var0.readInt((byte)5);
      boolean var12 = var0.readUnsignedByte(1565516935) == 1;
      return new Class397(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }
}
