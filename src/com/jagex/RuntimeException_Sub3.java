package com.jagex;

import com.jagex.Interface60;
import java.applet.Applet;

public class RuntimeException_Sub3 extends RuntimeException {
   public static int anInt12066;
   static long aLong12067;
   public static int anInt12068;
   public static String aString12069;
   public static Applet anApplet12070;
   static Interface60 anInterface60_12071 = null;
   String aString12072;
   Throwable aThrowable12073;

   RuntimeException_Sub3(Throwable var1, String var2) {
      this.aString12072 = var2;
      this.aThrowable12073 = var1;
      this.initCause(var1);
   }
}
