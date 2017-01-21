package com.jagex;

import com.jagex.Class285;
import com.jagex.Class329_Sub1;
import com.jagex.Class38;
import com.jagex.Class408;
import com.jagex.Class44;
import com.jagex.Class526_Sub18;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class82;

public class Class81 {
   static final int anInt826 = 1;
   static final int anInt827 = 12;
   static char[] aCharArray828 = new char[]{'\u0020', '\u00a0', '\u005f', '\u002d', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
   static char[] aCharArray829 = new char[]{'\u005b', '\u005d', '\u0023'};

   Class81() throws Throwable {
      throw new Error();
   }

   static final boolean method1160(char var0) {
      if(Character.isISOControl(var0)) {
         return false;
      } else if(Class329_Sub1.method9044(var0, 1962919951)) {
         return true;
      } else {
         char[] var1 = aCharArray828;

         int var2;
         char var3;
         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var3 == var0) {
               return true;
            }
         }

         var1 = aCharArray829;

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var3 == var0) {
               return true;
            }
         }

         return false;
      }
   }

   static final boolean method1161(char var0) {
      if(Character.isISOControl(var0)) {
         return false;
      } else if(Class329_Sub1.method9044(var0, 1807333110)) {
         return true;
      } else {
         char[] var1 = aCharArray828;

         int var2;
         char var3;
         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var3 == var0) {
               return true;
            }
         }

         var1 = aCharArray829;

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if(var3 == var0) {
               return true;
            }
         }

         return false;
      }
   }

   static char method1162(char var0) {
      switch(var0) {
      case '\u0020':
      case '\u002d':
      case '\u005f':
      case '\u00a0':
         return '\u005f';
      case '\u0023':
      case '\u005b':
      case '\u005d':
         return var0;
      case '\u00c0':
      case '\u00c1':
      case '\u00c2':
      case '\u00c3':
      case '\u00c4':
      case '\u00e0':
      case '\u00e1':
      case '\u00e2':
      case '\u00e3':
      case '\u00e4':
         return '\u0061';
      case '\u00c7':
      case '\u00e7':
         return '\u0063';
      case '\u00c8':
      case '\u00c9':
      case '\u00ca':
      case '\u00cb':
      case '\u00e8':
      case '\u00e9':
      case '\u00ea':
      case '\u00eb':
         return '\u0065';
      case '\u00cd':
      case '\u00ce':
      case '\u00cf':
      case '\u00ed':
      case '\u00ee':
      case '\u00ef':
         return '\u0069';
      case '\u00d1':
      case '\u00f1':
         return '\u006e';
      case '\u00d2':
      case '\u00d3':
      case '\u00d4':
      case '\u00d5':
      case '\u00d6':
      case '\u00f2':
      case '\u00f3':
      case '\u00f4':
      case '\u00f5':
      case '\u00f6':
         return '\u006f';
      case '\u00d9':
      case '\u00da':
      case '\u00db':
      case '\u00dc':
      case '\u00f9':
      case '\u00fa':
      case '\u00fb':
      case '\u00fc':
         return '\u0075';
      case '\u00df':
         return '\u0062';
      case '\u00ff':
      case '\u0178':
         return '\u0079';
      default:
         return Character.toLowerCase(var0);
      }
   }

   public static void method1163(Class639_Sub1_Sub2_Sub1_Sub1 var0, byte var1) {
      Class526_Sub18 var2 = (Class526_Sub18)Class526_Sub18.aClass20_10483.get((long)(828574411 * var0.index));
      if(null == var2) {
         Class408.method4893(var0.aByte10827, var0.screenX[0], var0.screenY[0], 0, (Class610)null, (NPC)null, var0, -1056598282);
      } else {
         var2.method9429(2075144604);
      }

   }

   public static String method1164(CharSequence var0, Class82 var1, byte var2) {
      if(null == var0) {
         return null;
      } else {
         int var3 = 0;

         int var4;
         for(var4 = var0.length(); var3 < var4 && Class599.method7080(var0.charAt(var3), -1151370332); ++var3) {
            ;
         }

         while(var4 > var3 && Class599.method7080(var0.charAt(var4 - 1), -2143555418)) {
            --var4;
         }

         int var5 = var4 - var3;
         if(var5 >= 1 && var5 <= Class285.method3798(var1, (byte)-13)) {
            StringBuilder var6 = new StringBuilder(var5);

            for(int var7 = var3; var7 < var4; ++var7) {
               char var8 = var0.charAt(var7);
               if(Class38.method848(var8, (byte)0)) {
                  char var9 = Class44.method919(var8, (byte)31);
                  if(0 != var9) {
                     var6.append(var9);
                  }
               }
            }

            if(var6.length() == 0) {
               return null;
            } else {
               return var6.toString();
            }
         } else {
            return null;
         }
      }
   }

   static final void method1165(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
