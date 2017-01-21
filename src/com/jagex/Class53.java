package com.jagex;

import java.applet.Applet;
import netscape.javascript.JSObject;

public class Class53 {
   public static void method967(Applet var0, String var1, int var2) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object method968(Applet var0, String var1, int var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   public static Object method969(Applet var0, String var1, Object[] var2, byte var3) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   Class53() throws Throwable {
      throw new Error();
   }
}
