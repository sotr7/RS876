package com.jagex;

import com.jagex.Class255;
import com.jagex.Class449;
import com.jagex.Class453;
import com.jagex.Class526_Sub21_Sub15_Sub3;
import com.jagex.Class639_Sub1_Sub3_Sub1;
import com.jagex.Class681;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Class473 implements Callable {
   // $FF: synthetic field
   Class453 this$0;
   URL anURL5362;
   Class526_Sub21_Sub15_Sub3 aClass526_Sub21_Sub15_Sub3_5363;

   public Object call() throws Exception {
      URLConnection var1 = this.anURL5362.openConnection();
      var1.setConnectTimeout(10000);
      var1.setReadTimeout('\uea60');
      boolean var2 = true;

      try {
         var1.connect();
      } catch (IOException var4) {
         this.this$0.aLong4954 = Class255.time((byte)24) * 952043930319436493L;
         var2 = false;
      }

      return new Class449(this.this$0, var2?var1.getInputStream():null, this.aClass526_Sub21_Sub15_Sub3_5363, this.anURL5362);
   }

   Class473(Class453 var1, URL var2, Class526_Sub21_Sub15_Sub3 var3) {
      this.this$0 = var1;
      this.anURL5362 = var2;
      this.aClass526_Sub21_Sub15_Sub3_5363 = var3;
   }

   static final void method5645(Class681 var0, int var1) {
      var0.anInt8625 -= 1763572679;
      String var2 = (String)var0.anObjectArray8624[540934629 * var0.anInt8625];
      String var3 = (String)var0.anObjectArray8624[540934629 * var0.anInt8625 + 1];
      String var4 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629 + 2];
      boolean var5 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class639_Sub1_Sub3_Sub1.method10850(var2, var3, var4, var5, -229998519);
   }

   static final void method5646(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method5647(Class681 var0, int var1) {
   }
}
