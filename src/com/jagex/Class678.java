package com.jagex;

public class Class678 {
   static char[] aCharArray8595 = new char[64];
   static char[] aCharArray8596;
   static char[] aCharArray8597;
   static int[] anIntArray8598;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         aCharArray8595[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aCharArray8595[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aCharArray8595[var0] = (char)(var0 + 48 - 52);
      }

      aCharArray8595[62] = 43;
      aCharArray8595[63] = 47;
      aCharArray8596 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         aCharArray8596[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aCharArray8596[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aCharArray8596[var0] = (char)(var0 + 48 - 52);
      }

      aCharArray8596[62] = 42;
      aCharArray8596[63] = 45;
      aCharArray8597 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         aCharArray8597[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aCharArray8597[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aCharArray8597[var0] = (char)(var0 + 48 - 52);
      }

      aCharArray8597[62] = 45;
      aCharArray8597[63] = 95;
      anIntArray8598 = new int[128];

      for(var0 = 0; var0 < anIntArray8598.length; ++var0) {
         anIntArray8598[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         anIntArray8598[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         anIntArray8598[var0] = 26 + (var0 - 97);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         anIntArray8598[var0] = var0 - 48 + 52;
      }

      int[] var2 = anIntArray8598;
      anIntArray8598[43] = 62;
      var2[42] = 62;
      int[] var1 = anIntArray8598;
      anIntArray8598[47] = 63;
      var1[45] = 63;
   }

   Class678() throws Throwable {
      throw new Error();
   }
}
