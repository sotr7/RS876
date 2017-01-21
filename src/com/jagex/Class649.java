package com.jagex;

import com.jagex.Class173;
import com.jagex.Class181;
import com.jagex.RSByteBuffer;
import com.jagex.Class655;
import com.jagex.Class681;
import com.jagex.Interface12;

public class Class649 implements Interface12 {
   int anInt8459;
   public int anInt8461;
   public int anInt8458;
   Class655 aClass655_8460;

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(619820917);
         if(0 == var2) {
            return;
         }

         this.method7712(var1, var2, 1849611445);
      }
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-713017689);
         if(0 == var3) {
            return;
         }

         this.method7712(var1, var3, 2020825029);
      }
   }

   void method7712(RSByteBuffer var1, int var2, int var3) {
      if(1 == var2) {
         this.anInt8459 = var1.readBigSmart((byte)42) * -329975883;
      } else if(var2 == 2) {
         this.anInt8461 = var1.readUnsignedByte(-715898344) * 1972226555;
         this.anInt8458 = var1.readUnsignedByte(1739097090) * -383641509;
      }

   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-135341294);
         if(0 == var2) {
            return;
         }

         this.method7712(var1, var2, 1428266600);
      }
   }

   public void method81(int var1) {
   }

   public synchronized Class173 method7713(byte var1) {
      Class173 var2 = (Class173)this.aClass655_8460.aClass192_8487.method2765((long)(this.anInt8459 * -1883930979));
      if(var2 != null) {
         return var2;
      } else {
         var2 = Class181.method2679(this.aClass655_8460.aClass466_8486, -1883930979 * this.anInt8459, 0);
         if(null != var2) {
            this.aClass655_8460.aClass192_8487.method2768(var2, (long)(-1883930979 * this.anInt8459));
         }

         return var2;
      }
   }

   public void method85() {
   }

   void method7714(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt8459 = var1.readBigSmart((byte)31) * -329975883;
      } else if(var2 == 2) {
         this.anInt8461 = var1.readUnsignedByte(39750933) * 1972226555;
         this.anInt8458 = var1.readUnsignedByte(-227952720) * -383641509;
      }

   }

   Class649(int var1, Class655 var2) {
      this.aClass655_8460 = var2;
   }

   void method7715(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt8459 = var1.readBigSmart((byte)80) * -329975883;
      } else if(var2 == 2) {
         this.anInt8461 = var1.readUnsignedByte(328751890) * 1972226555;
         this.anInt8458 = var1.readUnsignedByte(2081105211) * -383641509;
      }

   }

   void method7716(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt8459 = var1.readBigSmart((byte)64) * -329975883;
      } else if(var2 == 2) {
         this.anInt8461 = var1.readUnsignedByte(487595636) * 1972226555;
         this.anInt8458 = var1.readUnsignedByte(-1432068519) * -383641509;
      }

   }

   static final void method7717(Class681 var0, byte var1) {
      throw new RuntimeException("");
   }
}
