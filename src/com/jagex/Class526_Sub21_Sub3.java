package com.jagex;

import com.jagex.Class143;
import com.jagex.Class189;
import com.jagex.Class20;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class526;
import com.jagex.Class526_Sub21;
import com.jagex.Class526_Sub21_Sub18;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Connection;
import com.jagex.Class622;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Interface12;
import com.jagex.Interface5;

public class Class526_Sub21_Sub3 extends Class526_Sub21 implements Interface12, Interface5 {
   static Connection aClass560_11341;
   Class20 aClass20_11340;

   public int method10422(int var1, int var2, byte var3) {
      if(null == this.aClass20_11340) {
         return var2;
      } else {
         Class526_Sub25 var4 = (Class526_Sub25)this.aClass20_11340.get((long)var1);
         return var4 == null?var2:-1044108751 * var4.anInt10550;
      }
   }

   public void method81(int var1) {
   }

   void method10423(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 249) {
         int var4 = var1.readUnsignedByte(-1685147874);
         int var5;
         if(this.aClass20_11340 == null) {
            var5 = Class692.method8110(var4, -413212092);
            this.aClass20_11340 = new Class20(var5);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            boolean var6 = var1.readUnsignedByte(698747314) == 1;
            int var7 = var1.read24BitInt(742041327);
            Object var8;
            if(var6) {
               var8 = new LinkableObject(var1.readString(-1726839110));
            } else {
               var8 = new Class526_Sub25(var1.readInt((byte)5));
            }

            this.aClass20_11340.put((Class526)var8, (long)var7);
         }
      }

   }

   public int method10424(int var1, int var2) {
      if(null == this.aClass20_11340) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_11340.get((long)var1);
         return var3 == null?var2:-1044108751 * var3.anInt10550;
      }
   }

   public String method10425(int var1, String var2, byte var3) {
      if(this.aClass20_11340 == null) {
         return var2;
      } else {
         LinkableObject var4 = (LinkableObject)this.aClass20_11340.get((long)var1);
         return var4 == null?var2:(String)var4.anObject10399;
      }
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1019488373);
         if(var3 == 0) {
            return;
         }

         this.method10423(var1, var3, -8664489);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1658941845);
         if(var2 == 0) {
            return;
         }

         this.method10423(var1, var2, 190367469);
      }
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(507919151);
         if(var2 == 0) {
            return;
         }

         this.method10423(var1, var2, 585608807);
      }
   }

   public void method85() {
   }

   public void method50(int var1) {
   }

   public void method51(int var1) {
   }

   public void method49(int var1, int var2) {
   }

   public int method10426(int var1, int var2) {
      if(null == this.aClass20_11340) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_11340.get((long)var1);
         return var3 == null?var2:-1044108751 * var3.anInt10550;
      }
   }

   static int method10427(int var0) {
      return 13;
   }

   public static void method10428(Class143 var0, int var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(1, (long)(697078941 * var0.anInt1674));
      var2.method10583((byte)-49);
   }

   static final void method10429(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class189.method2743(var3, var4, var0, -2006117115);
   }

   static final void method10430(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class526_Sub21_Sub18 var4 = Class622.aClass455_8143.method5398(var2, (byte)40);
      int var5 = var4.anIntArray11848[var3];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5;
   }
}
