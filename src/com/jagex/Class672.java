package com.jagex;

import com.jagex.Class596;
import com.jagex.Class681;
import com.jagex.Interface59;
import com.jagex.client;

public class Class672 {
   Class596 aClass596_8565;
   int anInt8566;
   int anInt8567;

   int method7987() {
      return client.anIntArray11071[-337245371 * this.anInt8566];
   }

   public Class672(Class596 var1, int var2, int var3, int var4) {
      this.aClass596_8565 = var1;
      this.anInt8566 = 1575210893 * var2;
      this.anInt8567 = 998490637 * var4;
   }

   public Interface59 method7988(byte var1) {
      Interface59 var2 = this.method7989(-1826438674);
      return null == var2?null:(var2.method56(918495700) != -862233403 * this.anInt8567?null:var2);
   }

   Interface59 method7989(int var1) {
      int var2 = this.aClass596_8565.anInt7850 * 1837438465;
      Class596 var3 = client.aClass505_11204.method6128(2146791762);
      int var4 = -814686591 * this.aClass596_8565.localX - -814686591 * var3.localX;
      int var5 = this.aClass596_8565.localY * -845789331 - -845789331 * var3.localY;
      if(var4 >= 0 && var5 >= 0 && var4 < client.aClass505_11204.method6056(-1746741811) && var5 < client.aClass505_11204.method6057(126749238) && client.aClass505_11204.method6072(399076227) != null) {
         switch(this.method7991((byte)0)) {
         case 0:
            return (Interface59)client.aClass505_11204.method6072(742044871).method6589(var2, var4, var5, (byte)24);
         case 1:
            return (Interface59)client.aClass505_11204.method6072(-315011705).method6590(var2, var4, var5, 719775838);
         case 2:
            return (Interface59)client.aClass505_11204.method6072(-296613552).method6591(var2, var4, var5, client.anInterface64_11296, 1739430101);
         case 3:
            return (Interface59)client.aClass505_11204.method6072(1558727592).method6593(var2, var4, var5, -1064604983);
         default:
            return null;
         }
      } else {
         return null;
      }
   }

   int method7990() {
      return client.anIntArray11071[-337245371 * this.anInt8566];
   }

   int method7991(byte var1) {
      return client.anIntArray11071[-337245371 * this.anInt8566];
   }

   int method7992() {
      return client.anIntArray11071[-337245371 * this.anInt8566];
   }

   int method7993() {
      return client.anIntArray11071[-337245371 * this.anInt8566];
   }

   int method7994() {
      return client.anIntArray11071[-337245371 * this.anInt8566];
   }

   static final void method7995(Class681 var0, byte var1) {
      var0.anInt8630 -= -2069360090;
      if(var0.aLongArray8626[-1032509157 * var0.anInt8630] >= var0.aLongArray8626[1 + var0.anInt8630 * -1032509157]) {
         var0.anInt8644 += var0.anIntArray8642[var0.anInt8644 * -244840757] * -873681181;
      }

   }
}
