package com.jagex;

import com.jagex.Class116;
import com.jagex.Class162_Sub2;
import com.jagex.Class232;
import com.jagex.Class28;
import com.jagex.RSByteBuffer;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Class144 {
   public static Class144 aClass144_1689 = new Class144(5, 3);
   public static Class144 aClass144_1680 = new Class144(2, 4);
   public static Class144 aClass144_1681 = new Class144(3, 1);
   public static Class144 aClass144_1682 = new Class144(9, 1);
   public static Class144 aClass144_1683 = new Class144(6, 2);
   public static Class144 aClass144_1684 = new Class144(7, 1);
   static Class144 aClass144_1685 = new Class144(4, 3);
   static Class144 aClass144_1686 = new Class144(0, 4);
   public static Class144 aClass144_1687 = new Class144(1, 1);
   public static Class144 aClass144_1690 = new Class144(8, 1);
   public int anInt1688;
   public int anInt1679;

   Class144(int var1, int var2) {
      this.anInt1688 = 764432321 * var1;
      this.anInt1679 = var2 * -1182284181;
   }

   public static void method1668(String var0, int var1) {
      Class116.aString1429 = var0;
      Class116.anInt1431 = Class116.aString1429.length() * -1733740665;
   }

   public static byte[] method1669(RSByteBuffer var0, int var1, int var2) throws IOException {
      ByteArrayInputStream var3 = new ByteArrayInputStream(var0.buffer);
      var3.skip((long)(301018015 * var0.pos));
      return Class162_Sub2.method8463(var3, var1, -1665038317);
   }

   public static boolean method1670(int var0, byte var1) {
      return 0 == var0 || 2 == var0;
   }

   public static int[] method1671(int var0) {
      return new int[]{1031233005 * Class28.anInt255, Class28.anInt253 * 828252213, Class28.anInt254 * -321022145};
   }

   static boolean method1672(String var0, int var1, int var2) {
      return Class232.method3261(var0, var1, "openjs", -1514081739);
   }
}
