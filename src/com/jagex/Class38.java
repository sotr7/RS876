package com.jagex;

import com.jagex.Class1;
import com.jagex.Class181;
import com.jagex.Class329_Sub1;
import com.jagex.Class554;
import com.jagex.Class568;
import com.jagex.Class703;
import com.jagex.Class81;
import com.jagex.Interface51;

final class Class38 implements Interface51 {
   public Object method361(byte[] var1, Class1 var2, boolean var3) {
      return Class554.aClass174_7475.method2313(var2, Class181.method2683(var1), var3);
   }

   public Object method362(byte[] var1, Class1 var2, boolean var3, int var4) {
      return Class554.aClass174_7475.method2313(var2, Class181.method2683(var1), var3);
   }

   public Object method360(byte[] var1, Class1 var2, boolean var3) {
      return Class554.aClass174_7475.method2313(var2, Class181.method2683(var1), var3);
   }

   public static Class703 method847(int var0) {
      return null == Class568.aClass703_7616?Class703.aClass703_8799:Class568.aClass703_7616;
   }

   static final boolean method848(char var0, byte var1) {
      if(Character.isISOControl(var0)) {
         return false;
      } else if(Class329_Sub1.method9044(var0, 1717175169)) {
         return true;
      } else {
         char[] var2 = Class81.aCharArray828;

         int var3;
         char var4;
         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if(var4 == var0) {
               return true;
            }
         }

         var2 = Class81.aCharArray829;

         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if(var4 == var0) {
               return true;
            }
         }

         return false;
      }
   }
}
