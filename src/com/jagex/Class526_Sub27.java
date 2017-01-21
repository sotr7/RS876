package com.jagex;

import com.jagex.Class526;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub9;

public abstract class Class526_Sub27 extends Class526 {
   abstract void method9516(RSByteBuffer var1);

   abstract void method9517(RSByteBuffer var1, byte var2);

   abstract void method9518(RSByteBuffer var1);

   abstract void method9519(Class526_Sub9 var1, int var2);

   abstract void method9520(Class526_Sub9 var1);

   abstract void method9521(Class526_Sub9 var1);

   abstract void method9522(Class526_Sub9 var1);

   abstract void method9523(Class526_Sub9 var1);

   public static String method9524(Object[] var0, int var1, int var2, byte var3) {
      if(var2 == 0) {
         return "";
      } else if(1 == var2) {
         CharSequence var9 = (CharSequence)var0[var1];
         return null == var9?"null":var9.toString();
      } else {
         int var4 = var1 + var2;
         int var5 = 0;

         for(int var6 = var1; var6 < var4; ++var6) {
            CharSequence var7 = (CharSequence)var0[var6];
            if(var7 == null) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var5);

         for(int var11 = var1; var11 < var4; ++var11) {
            CharSequence var8 = (CharSequence)var0[var11];
            if(null == var8) {
               var10.append("null");
            } else {
               var10.append(var8);
            }
         }

         return var10.toString();
      }
   }
}
