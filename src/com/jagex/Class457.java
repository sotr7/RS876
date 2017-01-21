package com.jagex;

import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class458;
import com.jagex.Class581;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Interface76;

public class Class457 implements Interface76 {
   static boolean aBool5160;
   static Class457 UNCOMPRESSED = new Class457("UNCOMPRESSED", 0);
   static Class457 aClass457_5166 = new Class457("BZIP2", 1);
   static Class457 aClass457_5162 = new Class457("GZIP", 2);
   static Class457 aClass457_5163 = new Class457("LZMA", 3);
   String aString5164;
   int anInt5165;

   Class457(String var1, int var2) {
      this.aString5164 = var1;
      this.anInt5165 = var2 * 634385151;
   }

   static Class457[] method5410(int var0) {
      return new Class457[]{aClass457_5163, aClass457_5162, aClass457_5166, UNCOMPRESSED};
   }

   public int getId() {
      return this.anInt5165 * -1903751937;
   }

   public int method21() {
      return this.anInt5165 * -1903751937;
   }

   public static Class458[] method5411(int var0) {
      return new Class458[]{Class458.aClass458_5168, Class458.aClass458_5169, Class458.aClass458_5167};
   }

   static final void method5412(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class242.method3326(var3, var4, var0, 1235314647);
   }

   static final void method5413(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class690.method8098(9, var2, var3, "", -1987287735);
   }

   static final void method5414(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class581.method6972(var3, var4, var0, (byte)63);
   }
}
