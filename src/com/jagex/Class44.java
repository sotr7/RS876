package com.jagex;

import com.jagex.Class153;
import com.jagex.Class41;
import com.jagex.Class546;
import com.jagex.Class627;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class681;

public class Class44 {
   public static Class153 aClass153_461;
   static Class44 aClass44_459 = new Class44();
   static Class44 aClass44_460 = new Class44();

   static final void method917(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      int var3 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2 + Class627.method7463(var3, true, 1889784342);
   }

   static Class546 method918(Class639_Sub1_Sub2 var0, int var1) {
      Class546 var2;
      if(null == Class41.aClass546_454) {
         var2 = new Class546();
      } else {
         var2 = Class41.aClass546_454;
         Class41.aClass546_454 = Class41.aClass546_454.aClass546_7268;
         var2.aClass546_7268 = null;
         Class546.anInt7269 -= 467401855;
      }

      var2.aClass639_Sub1_Sub2_7267 = var0;
      return var2;
   }

   static char method919(char var0, byte var1) {
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
}
