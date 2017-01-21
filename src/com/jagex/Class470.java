package com.jagex;

import com.jagex.Class159;
import com.jagex.Class169;
import com.jagex.Class466;
import com.jagex.Class546;
import com.jagex.Class585;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface24;

public class Class470 {
   public static final int anInt5350 = 4;
   static final int anInt5351 = 2;
   static final int anInt5352 = 2;
   public static final int anInt5353 = 2;
   public static final int anInt5354 = 8;
   static final int anInt5355 = 16;
   public byte[][][] aByteArrayArrayArray5356;

   public void method5612() {
      for(int var1 = 0; var1 < this.aByteArrayArrayArray5356.length; ++var1) {
         for(int var2 = 0; var2 < this.aByteArrayArrayArray5356[0].length; ++var2) {
            for(int var3 = 0; var3 < this.aByteArrayArrayArray5356[0][0].length; ++var3) {
               this.aByteArrayArrayArray5356[var1][var2][var3] = 0;
            }
         }
      }

   }

   public void method5613() {
      for(int var1 = 0; var1 < this.aByteArrayArrayArray5356.length; ++var1) {
         for(int var2 = 0; var2 < this.aByteArrayArrayArray5356[0].length; ++var2) {
            for(int var3 = 0; var3 < this.aByteArrayArrayArray5356[0][0].length; ++var3) {
               this.aByteArrayArrayArray5356[var1][var2][var3] = 0;
            }
         }
      }

   }

   public Class470(int var1, int var2, int var3) {
      this.aByteArrayArrayArray5356 = new byte[var1][var2][var3];
   }

   public boolean method5614(int var1, int var2, int var3) {
      return var1 >= 0 && var2 >= 0 && var1 < this.aByteArrayArrayArray5356[1].length && var2 < this.aByteArrayArrayArray5356[1][var1].length?(this.aByteArrayArrayArray5356[1][var1][var2] & 2) != 0:false;
   }

   public boolean method5615(int var1, int var2, int var3, int var4, int var5) {
      return 0 != (this.aByteArrayArrayArray5356[0][var3][var4] & 2)?true:(0 != (this.aByteArrayArrayArray5356[var2][var3][var4] & 16)?false:this.method5616(var2, var3, var4, -1518315609) == var1);
   }

   int method5616(int var1, int var2, int var3, int var4) {
      return (this.aByteArrayArrayArray5356[var1][var2][var3] & 8) != 0?0:(var1 > 0 && (this.aByteArrayArrayArray5356[1][var2][var3] & 2) != 0?var1 - 1:var1);
   }

   public void method5617() {
      for(int var1 = 0; var1 < this.aByteArrayArrayArray5356.length; ++var1) {
         for(int var2 = 0; var2 < this.aByteArrayArrayArray5356[0].length; ++var2) {
            for(int var3 = 0; var3 < this.aByteArrayArrayArray5356[0][0].length; ++var3) {
               this.aByteArrayArrayArray5356[var1][var2][var3] = 0;
            }
         }
      }

   }

   public void method5618(int var1) {
      for(int var2 = 0; var2 < this.aByteArrayArrayArray5356.length; ++var2) {
         for(int var3 = 0; var3 < this.aByteArrayArrayArray5356[0].length; ++var3) {
            for(int var4 = 0; var4 < this.aByteArrayArrayArray5356[0][0].length; ++var4) {
               this.aByteArrayArrayArray5356[var2][var3][var4] = 0;
            }
         }
      }

   }

   public boolean method5619(int var1, int var2, int var3) {
      return var1 >= 0 && var2 >= 0 && var1 < this.aByteArrayArrayArray5356[3].length && var2 < this.aByteArrayArrayArray5356[3][var1].length?(this.aByteArrayArrayArray5356[3][var1][var2] & 2) != 0:false;
   }

   public void method5620() {
      for(int var1 = 0; var1 < this.aByteArrayArrayArray5356.length; ++var1) {
         for(int var2 = 0; var2 < this.aByteArrayArrayArray5356[0].length; ++var2) {
            for(int var3 = 0; var3 < this.aByteArrayArrayArray5356[0][0].length; ++var3) {
               this.aByteArrayArrayArray5356[var1][var2][var3] = 0;
            }
         }
      }

   }

   public void method5621() {
      for(int var1 = 0; var1 < this.aByteArrayArrayArray5356.length; ++var1) {
         for(int var2 = 0; var2 < this.aByteArrayArrayArray5356[0].length; ++var2) {
            for(int var3 = 0; var3 < this.aByteArrayArrayArray5356[0][0].length; ++var3) {
               this.aByteArrayArrayArray5356[var1][var2][var3] = 0;
            }
         }
      }

   }

   public boolean method5622(int var1, int var2) {
      return var1 >= 0 && var2 >= 0 && var1 < this.aByteArrayArrayArray5356[1].length && var2 < this.aByteArrayArrayArray5356[1][var1].length?(this.aByteArrayArrayArray5356[1][var1][var2] & 2) != 0:false;
   }

   public boolean method5623(int var1, int var2, int var3, int var4) {
      return 0 != (this.aByteArrayArrayArray5356[0][var3][var4] & 2)?true:(0 != (this.aByteArrayArrayArray5356[var2][var3][var4] & 16)?false:this.method5616(var2, var3, var4, -1612401651) == var1);
   }

   public boolean method5624(int var1, int var2, int var3, int var4) {
      return 0 != (this.aByteArrayArrayArray5356[0][var3][var4] & 2)?true:(0 != (this.aByteArrayArrayArray5356[var2][var3][var4] & 16)?false:this.method5616(var2, var3, var4, -26063701) == var1);
   }

   int method5625(int var1, int var2, int var3) {
      return (this.aByteArrayArrayArray5356[var1][var2][var3] & 8) != 0?0:(var1 > 0 && (this.aByteArrayArrayArray5356[1][var2][var3] & 2) != 0?var1 - 1:var1);
   }

   public static void method5626(Class466 var0, Class169 var1, Interface24 var2, byte var3) {
      Class585.aClass466_7791 = var0;
      Class159.aClass169_1769 = var1;
      Class546.anInterface24_7270 = var2;
   }

   static final void method5627(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class679 var3;
      if(var0.aBool8628) {
         var3 = var0.aClass679_8631;
      } else {
         var3 = var0.aClass679_8621;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.method8020(var2, -1, (byte)-97)?1:0;
   }
}
