package com.jagex;

import com.jagex.Class292;
import com.jagex.Class309;
import com.jagex.Class40_Sub12;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class50;
import com.jagex.RSByteBuffer;
import com.jagex.Class566;
import com.jagex.Class681;

public abstract class Class689 {
   public static Class40_Sub12 aClass40_Sub12_8692;
   Class292 aClass292_8691;

   public abstract void method8070(float var1);

   public abstract void method8071(float var1, byte var2);

   public abstract void method8072(Class309 var1, Class445 var2, int var3, int var4, float var5);

   public abstract Class446 method8073(int var1);

   public abstract void method8074(RSByteBuffer var1);

   public abstract Class446 method8075(int var1);

   Class689(Class292 var1) {
      this.aClass292_8691 = var1;
   }

   public abstract void method8076(float var1);

   public abstract Class446 method8077();

   public abstract boolean method8078();

   public abstract boolean method8079();

   public abstract void method8080(Class309 var1, Class445 var2, int var3, int var4, float var5);

   public abstract boolean method8081(short var1);

   public abstract Class446 method8082();

   public abstract void method8083(Class309 var1, Class445 var2, int var3, int var4, float var5, int var6);

   public abstract Class446 method8084();

   public abstract void method8085(RSByteBuffer var1);

   public abstract void method8086(RSByteBuffer var1, int var2);

   public abstract Class446 method8087();

   public abstract Class446 method8088();

   static final void method8089(Class681 var0, byte var1) {
      Class50.method945(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], 1421603771);
   }

   static final void method8090(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class451.localPlayer.aClass34_11940.method817(-170372525) >> 3;
   }

   static final void method8091(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3122(var2, (byte)94).method3000(-1852848649);
   }
}
