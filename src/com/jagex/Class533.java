package com.jagex;

import com.jagex.Class174;
import com.jagex.Class228;
import com.jagex.InterfaceDef;
import com.jagex.Class31;
import com.jagex.Class518;
import com.jagex.Class523;
import com.jagex.Class526_Sub39;
import com.jagex.Class612_Sub1;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class711_Sub41;
import com.jagex.client;

public class Class533 {
   int anInt7188;
   int anInt7189;
   int anInt7187;
   Class518[] aClass518Array7190;
   // $FF: synthetic field
   Class523 this$0;

   void method6385(int var1, int var2, int var3) {
      if(null == this.aClass518Array7190 || var2 != this.anInt7187 * 374969593 || var1 != 701805461 * this.anInt7188) {
         this.anInt7188 = var1 * 2101280701;
         this.anInt7189 = ((1 << var1) - 1) * -1179230409;
         this.anInt7187 = var2 * 1650126153;
         int var4 = 1 << this.anInt7188 * 701805461 + this.anInt7187 * 374969593;
         this.aClass518Array7190 = new Class518[var4];

         for(int var5 = 0; var5 < var4; ++var5) {
            this.aClass518Array7190[var5] = new Class518(this);
         }

      }
   }

   void method6386(int var1, int var2) {
      if(null == this.aClass518Array7190 || var2 != this.anInt7187 * 374969593 || var1 != 701805461 * this.anInt7188) {
         this.anInt7188 = var1 * 2101280701;
         this.anInt7189 = ((1 << var1) - 1) * -1179230409;
         this.anInt7187 = var2 * 1650126153;
         int var3 = 1 << this.anInt7188 * 701805461 + this.anInt7187 * 374969593;
         this.aClass518Array7190 = new Class518[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.aClass518Array7190[var4] = new Class518(this);
         }

      }
   }

   void method6387(int var1) {
      int var2 = 1 << 701805461 * this.anInt7188 + 374969593 * this.anInt7187;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aClass518Array7190[var3].method6240(557110912);
      }

   }

   void method6388(int var1, int var2) {
      if(null == this.aClass518Array7190 || var2 != this.anInt7187 * 374969593 || var1 != 701805461 * this.anInt7188) {
         this.anInt7188 = var1 * 2101280701;
         this.anInt7189 = ((1 << var1) - 1) * -1179230409;
         this.anInt7187 = var2 * 1650126153;
         int var3 = 1 << this.anInt7188 * 701805461 + this.anInt7187 * 374969593;
         this.aClass518Array7190 = new Class518[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.aClass518Array7190[var4] = new Class518(this);
         }

      }
   }

   void method6389(int var1, int var2) {
      if(null == this.aClass518Array7190 || var2 != this.anInt7187 * 374969593 || var1 != 701805461 * this.anInt7188) {
         this.anInt7188 = var1 * 2101280701;
         this.anInt7189 = ((1 << var1) - 1) * -1179230409;
         this.anInt7187 = var2 * 1650126153;
         int var3 = 1 << this.anInt7188 * 701805461 + this.anInt7187 * 374969593;
         this.aClass518Array7190 = new Class518[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.aClass518Array7190[var4] = new Class518(this);
         }

      }
   }

   Class518 method6390(int var1, byte var2, int var3) {
      return this.aClass518Array7190[((var1 & 694912647 * this.anInt7189) << this.anInt7187 * 374969593) + ((var2 & 255) >>> 8 - this.anInt7187 * 374969593)];
   }

   void method6391() {
      int var1 = 1 << 701805461 * this.anInt7188 + 374969593 * this.anInt7187;

      for(int var2 = 0; var2 < var1; ++var2) {
         this.aClass518Array7190[var2].method6240(-1723833426);
      }

   }

   void method6392(int var1, int var2) {
      if(null == this.aClass518Array7190 || var2 != this.anInt7187 * 374969593 || var1 != 701805461 * this.anInt7188) {
         this.anInt7188 = var1 * 2101280701;
         this.anInt7189 = ((1 << var1) - 1) * -1179230409;
         this.anInt7187 = var2 * 1650126153;
         int var3 = 1 << this.anInt7188 * 701805461 + this.anInt7187 * 374969593;
         this.aClass518Array7190 = new Class518[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.aClass518Array7190[var4] = new Class518(this);
         }

      }
   }

   Class533(Class523 var1) {
      this.this$0 = var1;
   }

   static final void method6393(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      Class690.method8098(6, var2, var3, "", -1602049965);
   }

   static int method6394(Class612_Sub1 var0, Class612_Sub1 var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      int var7 = Class612_Sub1.method9799(var0, var1, var2, var3, -48867370);
      if(0 != var7) {
         return var3?-var7:var7;
      } else if(var4 == -1) {
         return 0;
      } else {
         int var8 = Class612_Sub1.method9799(var0, var1, var4, var5, -48867370);
         return var5?-var8:var8;
      }
   }

   static void method6395(Class174 var0, int var1) {
      if(Class31.aBool291) {
         Class228.method3175(var0, -1918111015);
      } else {
         Class711_Sub41.method10192(var0, 695299896);
      }

   }

   static final void method6396(InterfaceDef var0, Class681 var1, byte var2) {
      if(-2026007005 * var1.anInt8640 >= 10) {
         throw new RuntimeException();
      } else if(var0.anObjectArray2643 != null) {
         Class526_Sub39 var3 = new Class526_Sub39();
         var3.aClass245_10694 = var0;
         var3.anObjectArray10701 = var0.anObjectArray2643;
         var3.anInt10702 = -11509655 + 1484764251 * var1.anInt8640;
         client.aClass702_11239.method8176(var3, -950309571);
      }
   }
}
