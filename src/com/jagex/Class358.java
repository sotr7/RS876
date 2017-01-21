package com.jagex;

import com.jagex.Class157;
import com.jagex.Class16;
import com.jagex.Class230;
import com.jagex.Class297;
import com.jagex.Class298;
import com.jagex.Class361;
import com.jagex.Class378;
import com.jagex.Class452_Sub5;
import com.jagex.Class499;
import com.jagex.Class522;
import com.jagex.Class681;
import com.jagex.Interface40;
import com.jagex.client;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class358 {
   Map aMap3819 = new HashMap();
   Class361 aClass361_3820;

   public Class358(Class361 var1) {
      this.aClass361_3820 = var1;
   }

   public Class378 method4577(int var1, int var2, float var3, Interface40 var4, int var5) {
      if(this.method4581(var1, (byte)6) != null) {
         return null;
      } else {
         Class378 var6 = null;
         if(var2 != -1) {
            var6 = this.method4581(var2, (byte)-41);
         }

         Object var7 = this.aClass361_3820.method4599(var6, -858863047);
         Class378 var8 = new Class378(var1, var3, var7, this, var4, var6);
         this.aMap3819.put(Integer.valueOf(var1), var8);
         return var8;
      }
   }

   public void method4578() {
      Iterator var1 = this.aMap3819.values().iterator();

      while(var1.hasNext()) {
         Class378 var2 = (Class378)var1.next();
         var2.method4682(-1627063173);
      }

   }

   public void method4579() {
      Iterator var1 = this.aMap3819.values().iterator();

      while(var1.hasNext()) {
         Class378 var2 = (Class378)var1.next();
         var2.method4682(-1838041931);
      }

   }

   public void method4580(int var1) {
      Iterator var2 = this.aMap3819.values().iterator();

      while(var2.hasNext()) {
         Class378 var3 = (Class378)var2.next();
         var3.method4682(-1869889865);
      }

   }

   public Class378 method4581(int var1, byte var2) {
      return (Class378)this.aMap3819.get(Integer.valueOf(var1));
   }

   public Class378 method4582(int var1) {
      return (Class378)this.aMap3819.get(Integer.valueOf(var1));
   }

   static final void method4583(Class681 var0, byte var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub17_10601, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1?1:0, (short)-12402);
      Class522.method6257(-1042127423);
      Class452_Sub5.method9307(1112258471);
      Class297.method3972(-1007745989);
      client.aBool11013 = false;
   }

   public static void method4584(int var0) {
      if(Class16.aClass6_172.id * -2107114137 != -1) {
         Class298.method3982(-2107114137 * Class16.aClass6_172.id, Class16.aClass6_172.address, Class16.aClass6_172.port * -720149929, 2050494641 * Class16.aClass6_172.securePort, 1732256514);
      }

   }

   static final void method4585(Class681 var0, byte var1) {
      var0.anInt8625 -= 1763572679;
      Class157.method1863((String)var0.anObjectArray8624[540934629 * var0.anInt8625], (String)var0.anObjectArray8624[1 + 540934629 * var0.anInt8625], (String)var0.anObjectArray8624[2 + var0.anInt8625 * 540934629], var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1, true, (byte)113);
   }

   static void method4586(byte var0) {
      if(Class499.anInt5629 * -536458187 > 1) {
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub28_10656, 4, (short)-24118);
      } else {
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub28_10656, 2, (short)-6482);
      }

   }
}
