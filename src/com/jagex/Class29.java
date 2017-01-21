package com.jagex;

import com.jagex.Class149;
import com.jagex.Class16;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class525_Sub1;
import com.jagex.Class577;
import com.jagex.Class598;
import com.jagex.Class612_Sub1;
import com.jagex.Class615;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub5_Sub1;
import com.jagex.Class667;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Interface59;
import com.jagex.Interface64;

final class Class29 implements Interface64 {
   public boolean method431(Class639_Sub1_Sub2 var1) {
      return var1 instanceof Interface59 && ((Interface59)var1).method384((byte)-4);
   }

   public boolean method433(Class639_Sub1_Sub2 var1, int var2) {
      return var1 instanceof Interface59 && ((Interface59)var1).method384((byte)-125);
   }

   public boolean method432(Class639_Sub1_Sub2 var1) {
      return var1 instanceof Interface59 && ((Interface59)var1).method384((byte)-96);
   }

   public static Class598[] method732(int var0) {
      return new Class598[]{Class598.aClass598_7861, Class598.aClass598_7859, Class598.aClass598_7858};
   }

   static final void method733(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      Class615.method7280(var4, var2, -916596086);
   }

   static final void method734(Class681 var0, int var1) {
      Class639_Sub1_Sub5_Sub1.method10829(Class525_Sub1.anInt10707 * 677502969, (byte)-24);
   }

   public static int method735(Class684 var0, Class667 var1, int var2, byte var3) {
      return Class684.aClass684_8665 == var0?80:(Class667.aClass667_8529 == var1?12000 + var2:7000 + var2);
   }

   public static Class612_Sub1 method736(byte var0) {
      return Class577.method6943(-2107114137 * Class16.aClass6_171.id, (byte)43);
   }
}
