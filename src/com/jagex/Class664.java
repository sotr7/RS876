package com.jagex;

import com.jagex.Class162;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class526_Sub20;
import com.jagex.Class526_Sub3;
import com.jagex.Class596;
import com.jagex.Class639_Sub1_Sub4_Sub1;
import com.jagex.Class681;
import com.jagex.client;

public class Class664 {
   Class596 aClass596_8525;
   int anInt8524;

   public Class664(Class596 var1, int var2) {
      this.aClass596_8525 = var1;
      this.anInt8524 = var2 * 1615348631;
   }

   public Class639_Sub1_Sub4_Sub1 method7948(byte var1) {
      Class526_Sub20 var2 = (Class526_Sub20)client.aClass20_11259.get((long)(this.aClass596_8525.anInt7850 * 1837438465 << 28 | -845789331 * this.aClass596_8525.localY << 14 | this.aClass596_8525.localX * -814686591));
      if(null == var2) {
         return null;
      } else {
         Class596 var3 = client.aClass505_11204.method6128(2025863703);
         int var4 = -814686591 * this.aClass596_8525.localX - var3.localX * -814686591;
         int var5 = -845789331 * this.aClass596_8525.localY - var3.localY * -845789331;
         if(var4 >= 0 && var5 >= 0 && var4 < client.aClass505_11204.method6056(-1746741811) && var5 < client.aClass505_11204.method6057(126749238) && client.aClass505_11204.method6072(1424314184) != null) {
            for(Class526_Sub3 var6 = (Class526_Sub3)var2.aClass702_10529.method8206((byte)69); var6 != null; var6 = (Class526_Sub3)var2.aClass702_10529.method8181(-587176105)) {
               if(-1804739063 * var6.anInt10370 == this.anInt8524 * 1922460711) {
                  return (Class639_Sub1_Sub4_Sub1)client.aClass505_11204.method6072(-139411).method6570(this.aClass596_8525.anInt7850 * 1837438465, var4, var5, 621313350);
               }
            }
         }

         return null;
      }
   }

   static final void method7949(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-103);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class162.method1887(var3, var4, var0, (byte)63);
   }

   static final void method7950(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)42);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 769259159 * var3.anInt2649;
   }
}
