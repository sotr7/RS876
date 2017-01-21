package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class331;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class452;
import com.jagex.Class526_Sub33;
import com.jagex.Class681;
import com.jagex.Class691;
import com.jagex.Class711;
import com.jagex.Class711_Sub33;

public class Class711_Sub1 extends Class711 {
   public static final int anInt10819 = 1;
   public static final int anInt10820 = 2;
   public static final int anInt10821 = 0;

   public int method9802() {
      return 1174126091 * this.anInt8853;
   }

   int method8320(byte var1) {
      return 2;
   }

   public void method9803(int var1) {
      if(this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) == 0) {
         this.anInt8853 = 0;
      }

      if(this.anInt8853 * 1174126091 < 0 || 1174126091 * this.anInt8853 > 2) {
         this.anInt8853 = this.method8320((byte)65) * 1568955811;
      }

   }

   public Class711_Sub1(Class526_Sub33 var1) {
      super(var1);
   }

   public boolean method9804(int var1) {
      return this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) != 0;
   }

   public int method8313(int var1, int var2) {
      return this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) == 0?3:1;
   }

   void method8315(int var1, int var2) {
      this.anInt8853 = 1568955811 * var1;
   }

   public int method9805(int var1) {
      return 1174126091 * this.anInt8853;
   }

   int method8311() {
      return 2;
   }

   public int method8317(int var1) {
      return this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) == 0?3:1;
   }

   public int method8316(int var1) {
      return this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) == 0?3:1;
   }

   void method8319(int var1) {
      this.anInt8853 = 1568955811 * var1;
   }

   public void method9806() {
      if(this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) == 0) {
         this.anInt8853 = 0;
      }

      if(this.anInt8853 * 1174126091 < 0 || 1174126091 * this.anInt8853 > 2) {
         this.anInt8853 = this.method8320((byte)68) * 1568955811;
      }

   }

   public void method9807() {
      if(this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) == 0) {
         this.anInt8853 = 0;
      }

      if(this.anInt8853 * 1174126091 < 0 || 1174126091 * this.anInt8853 > 2) {
         this.anInt8853 = this.method8320((byte)56) * 1568955811;
      }

   }

   public boolean method9808() {
      return this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) != 0;
   }

   public boolean method9809() {
      return this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) != 0;
   }

   public Class711_Sub1(int var1, Class526_Sub33 var2) {
      super(var1, var2);
   }

   public boolean method9810() {
      return this.aClass526_Sub33_8856.aClass711_Sub17_10601.method10004(29768870) != 0;
   }

   static void method9811(Class243 var0, InterfaceDef var1, int var2) {
      if(null != var1) {
         int var4;
         if(1300712985 * var1.componentSlot != -1) {
            InterfaceDef var3 = var0.method3331(-537841755 * var1.parentId, -1156029899);
            if(null != var3) {
               if(var3.aClass245Array2662 == var3.aClass245Array2530) {
                  var3.aClass245Array2530 = new InterfaceDef[var3.aClass245Array2662.length];
                  var3.aClass245Array2530[var3.aClass245Array2530.length - 1] = var1;
                  Class691.method8101(var3.aClass245Array2662, 0, var3.aClass245Array2530, 0, 1300712985 * var1.componentSlot);
                  Class691.method8101(var3.aClass245Array2662, 1 + var1.componentSlot * 1300712985, var3.aClass245Array2530, 1300712985 * var1.componentSlot, var3.aClass245Array2662.length - 1300712985 * var1.componentSlot - 1);
               } else {
                  var4 = 0;

                  InterfaceDef[] var5;
                  for(var5 = var3.aClass245Array2530; var4 < var5.length && var5[var4] != var1; ++var4) {
                     ;
                  }

                  if(var4 >= var5.length) {
                     return;
                  }

                  Class691.method8101(var5, 1 + var4, var5, var4, var5.length - var4 - 1);
                  var5[var3.aClass245Array2530.length - 1] = var1;
               }
            }
         } else {
            InterfaceDef[] var6 = var0.method3332((byte)55);

            for(var4 = 0; var4 < var6.length && var6[var4] != var1; ++var4) {
               ;
            }

            if(var4 >= var6.length) {
               return;
            }

            Class691.method8101(var6, var4 + 1, var6, var4, var6.length - var4 - 1);
            var6[var6.length - 1] = var1;
         }
      }

   }

   static final void method9812(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)27);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -387736425 * var3.anInt2526;
   }

   static final void method9813(Class681 var0, byte var1) {
      var0.anInt8623 -= -61927879;
      Class384[] var2 = Class711_Sub33.method10141((byte)-63);
      Class389[] var3 = Class331.method4251((byte)15);
      Class452.method5367(var2[var0.anIntArray8622[var0.anInt8623 * -1730576285]], var3[var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1]], var0.anIntArray8622[2 + var0.anInt8623 * -1730576285], var0.anIntArray8622[-1730576285 * var0.anInt8623 + 3], var0.anIntArray8622[var0.anInt8623 * -1730576285 + 4], var0.anIntArray8622[-1730576285 * var0.anInt8623 + 5], var0.anIntArray8622[var0.anInt8623 * -1730576285 + 6], var0.anIntArray8622[-1730576285 * var0.anInt8623 + 7], var0.anIntArray8622[var0.anInt8623 * -1730576285 + 8], var0.anIntArray8622[9 + -1730576285 * var0.anInt8623], var0.anIntArray8622[10 + -1730576285 * var0.anInt8623], (byte)-28);
   }
}
