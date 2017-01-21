package com.jagex;

import com.jagex.Class153;
import com.jagex.Class173;
import com.jagex.Class174;
import com.jagex.Class181;
import com.jagex.InterfaceDef;
import com.jagex.RSByteBuffer;
import com.jagex.Class536;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class80;
import com.jagex.Interface12;

public class Class35 implements Interface12 {
   public boolean aBool376 = false;
   Class80 aClass80_375;
   public int anInt373;
   public int anInt372;
   int[] anIntArray374;

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-858617021);
         if(var3 == 0) {
            return;
         }

         this.method825(var1, var3, 571020969);
      }
   }

   Class35(int var1, Class80 var2) {
      this.aClass80_375 = var2;
   }

   void method825(RSByteBuffer var1, int var2, int var3) {
      if(1 == var2) {
         this.anInt373 = var1.readBigSmart((byte)100) * 779727791;
      } else if(var2 == 2) {
         this.anInt372 = var1.read24BitInt(742041327) * 19667161;
      } else if(var2 == 3) {
         this.aBool376 = true;
      } else if(4 == var2) {
         this.anInt373 = -779727791;
      } else if(5 == var2) {
         ;
      }

   }

   public boolean method826() {
      return this.aClass80_375.aClass466_823.method5537(this.anInt373 * 322011983, (byte)123);
   }

   void method827(Class174 var1, int var2, boolean var3, long var4) {
      if(this.aClass80_375.aClass466_823.method5537(this.anInt373 * 322011983, (byte)30)) {
         Class173 var6 = Class181.method2679(this.aClass80_375.aClass466_823, 322011983 * this.anInt373, 0);
         if(var6 != null) {
            var6.method2174();
            if(var3) {
               var6.method2207();
            }

            int var7;
            for(var7 = 0; var7 < var2; ++var7) {
               var6.method2208();
            }

            this.anIntArray374 = var6.method2204(false);
            if(this.anInt372 * 799991657 != 0) {
               var7 = (799991657 * this.anInt372 & 16711680) >> 16;
               int var8 = (799991657 * this.anInt372 & '\uff00') >> 8;
               int var9 = this.anInt372 * 799991657 & 255;

               for(int var10 = 0; var10 < this.anIntArray374.length; ++var10) {
                  int var11 = this.anIntArray374[var10] >> 24 & 255;
                  int var12 = 256 - var11;
                  if(0 != var11) {
                     int var13 = -16777216 * var7 * (this.anIntArray374[var10] & 16711680);
                     int var14 = (this.anIntArray374[var10] & '\uff00') * var8 * 16711680;
                     int var15 = '\uff00' * var9 * (this.anIntArray374[var10] & 255);
                     int var16 = (var13 | var14 | var15) >>> 8;
                     if(255 == var11) {
                        this.anIntArray374[var10] = var16;
                     } else {
                        int var17 = this.anIntArray374[var10];
                        this.anIntArray374[var10] = var11 << 24 | ((var16 & 16711935) * var12 + var11 * (var17 & 16711935) & -16711936) + ((var17 & '\uff00') * var11 + var12 * (var16 & '\uff00') & 16711680) >> 8;
                     }
                  }
               }
            }
         }

         Class153 var18 = var1.method2310(var6, true);
         if(var18 != null) {
            this.aClass80_375.aClass192_822.method2768(var18, var4);
         }

      }
   }

   public boolean method828(int var1) {
      return this.aClass80_375.aClass466_823.method5537(this.anInt373 * 322011983, (byte)88);
   }

   public void method81(int var1) {
   }

   public boolean method829() {
      return this.aClass80_375.aClass466_823.method5537(this.anInt373 * 322011983, (byte)59);
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-2145388889);
         if(var2 == 0) {
            return;
         }

         this.method825(var1, var2, 571020969);
      }
   }

   public Class153 method830(Class174 var1, int var2, boolean var3, int var4) {
      long var5 = (long)(this.anInt373 * 322011983 | var2 << 16 | (var3?262144:0) | -316183255 * var1.anInt2030 << 19);
      Class153 var7 = (Class153)this.aClass80_375.aClass192_822.method2765(var5);
      if(var7 != null) {
         return var7;
      } else {
         this.method827(var1, var2, var3, var5);
         return (Class153)this.aClass80_375.aClass192_822.method2765(var5);
      }
   }

   void method831(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt373 = var1.readBigSmart((byte)-43) * 779727791;
      } else if(var2 == 2) {
         this.anInt372 = var1.read24BitInt(742041327) * 19667161;
      } else if(var2 == 3) {
         this.aBool376 = true;
      } else if(4 == var2) {
         this.anInt373 = -779727791;
      } else if(5 == var2) {
         ;
      }

   }

   void method832(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt373 = var1.readBigSmart((byte)94) * 779727791;
      } else if(var2 == 2) {
         this.anInt372 = var1.read24BitInt(742041327) * 19667161;
      } else if(var2 == 3) {
         this.aBool376 = true;
      } else if(4 == var2) {
         this.anInt373 = -779727791;
      } else if(5 == var2) {
         ;
      }

   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(2083195715);
         if(var2 == 0) {
            return;
         }

         this.method825(var1, var2, 571020969);
      }
   }

   public int[] method833(Class174 var1, int var2, boolean var3, int var4) {
      if(null != this.anIntArray374) {
         return this.anIntArray374;
      } else {
         long var5 = (long)(this.anInt373 * 322011983 | var2 << 16 | (var3?262144:0) | var1.anInt2030 * -316183255 << 19);
         this.method827(var1, var2, var3, var5);
         return this.anIntArray374;
      }
   }

   public boolean method834() {
      return this.aClass80_375.aClass466_823.method5537(this.anInt373 * 322011983, (byte)30);
   }

   public boolean method835() {
      return this.aClass80_375.aClass466_823.method5537(this.anInt373 * 322011983, (byte)83);
   }

   void method836(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt373 = var1.readBigSmart((byte)22) * 779727791;
      } else if(var2 == 2) {
         this.anInt372 = var1.read24BitInt(742041327) * 19667161;
      } else if(var2 == 3) {
         this.aBool376 = true;
      } else if(4 == var2) {
         this.anInt373 = -779727791;
      } else if(5 == var2) {
         ;
      }

   }

   public void method85() {
   }

   static final void method837(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class536.method6420(var3, var0, -1608831661);
   }
}
