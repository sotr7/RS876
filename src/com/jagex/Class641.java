package com.jagex;

import com.jagex.Class113;
import com.jagex.Class238;
import com.jagex.Class361;
import com.jagex.Class378;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class97_Sub1_Sub2;

public class Class641 {
   public static Class97_Sub1_Sub2 aClass97_Sub1_Sub2_8349;
   static Class361 aClass361_8348 = null;

   public static boolean method7640(int var0, int var1) {
      if(null != aClass361_8348 && aClass361_8348.method4617((byte)66) != null) {
         if(var0 == var1) {
            return true;
         } else {
            Class378 var2 = aClass361_8348.method4617((byte)71).method4581(var0, (byte)89);
            Class378 var3 = aClass361_8348.method4617((byte)118).method4581(var1, (byte)-46);
            Class378 var4 = var2;

            do {
               if(var4 == null) {
                  var4 = var3;

                  do {
                     if(null == var4) {
                        return false;
                     }

                     var4 = var4.method4683(1060820202);
                     if(var4 == var2) {
                        return true;
                     }
                  } while(var3 != var4);

                  return false;
               }

               var4 = var4.method4683(1086618609);
               if(var3 == var4) {
                  return true;
               }
            } while(var2 != var4);

            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean method7641(int var0, int var1) {
      if(null != aClass361_8348 && aClass361_8348.method4617((byte)111) != null) {
         if(var0 == var1) {
            return true;
         } else {
            Class378 var2 = aClass361_8348.method4617((byte)97).method4581(var0, (byte)-1);
            Class378 var3 = aClass361_8348.method4617((byte)120).method4581(var1, (byte)6);
            Class378 var4 = var2;

            do {
               if(var4 == null) {
                  var4 = var3;

                  do {
                     if(null == var4) {
                        return false;
                     }

                     var4 = var4.method4683(1297986376);
                     if(var4 == var2) {
                        return true;
                     }
                  } while(var3 != var4);

                  return false;
               }

               var4 = var4.method4683(-931678037);
               if(var3 == var4) {
                  return true;
               }
            } while(var2 != var4);

            return false;
         }
      } else {
         return false;
      }
   }

   public static void method7642() {
      if(null != aClass361_8348) {
         aClass361_8348.method4593(1489548669);
      }

   }

   public static Class378 method7643(int var0) {
      return null != aClass361_8348?aClass361_8348.method4617((byte)115).method4581(var0, (byte)46):null;
   }

   Class641() throws Throwable {
      throw new Error();
   }

   public static boolean method7644(int var0, int var1) {
      if(null != aClass361_8348 && aClass361_8348.method4617((byte)124) != null) {
         if(var0 == var1) {
            return true;
         } else {
            Class378 var2 = aClass361_8348.method4617((byte)122).method4581(var0, (byte)34);
            Class378 var3 = aClass361_8348.method4617((byte)85).method4581(var1, (byte)29);
            Class378 var4 = var2;

            do {
               if(var4 == null) {
                  var4 = var3;

                  do {
                     if(null == var4) {
                        return false;
                     }

                     var4 = var4.method4683(1096232365);
                     if(var4 == var2) {
                        return true;
                     }
                  } while(var3 != var4);

                  return false;
               }

               var4 = var4.method4683(828002052);
               if(var3 == var4) {
                  return true;
               }
            } while(var2 != var4);

            return false;
         }
      } else {
         return false;
      }
   }

   public static void method7645() {
      if(null != aClass361_8348) {
         aClass361_8348.method4593(1489548669);
      }

   }

   static final void method7646(Class681 var0, int var1) {
      NPC.method11000((byte)40);
   }

   static final void method7647(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class238 var3 = (Class238)Class113.aClass40_Sub6_1371.method89(var2, 394158371);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 803087905 * var3.anInt2405;
   }
}
