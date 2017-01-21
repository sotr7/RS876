package com.jagex;

import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class3;
import com.jagex.Class300;
import com.jagex.Class309;
import com.jagex.Class312;
import com.jagex.Class458;
import com.jagex.Class526_Sub1;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub38;
import com.jagex.Class620;
import com.jagex.Class64;
import com.jagex.Class640;
import com.jagex.NPCDirection;
import com.jagex.Class681;
import com.jagex.client;

public final class Class710 {
   public static Class620 aClass620_8851;
   static int anInt8852;
   public static boolean aBool8850 = true;

   Class710() throws Throwable {
      throw new Error();
   }

   public static final void method8307(Class526_Sub38 var0, boolean var1, boolean var2, byte var3) {
      int var4 = var0.anInt10684 * -870147923;
      int var5 = (int)(var0.aLong7156 * -6805155999452426801L);
      var0.method6332(-1949449864);
      if(var1) {
         Class312.method4073(var4, (byte)-37);
      }

      Class300.method3993(var4, 1880097015);
      InterfaceDef var6 = Class221.method3095(var5, (byte)25);
      if(var6 != null) {
         Class526_Sub31.method9555(var6, (byte)10);
      }

      Class64.method1073(var4, -828606834);
      if(!var2 && -327748687 * client.anInt11186 != -1) {
         Class458.method5419(-327748687 * client.anInt11186, 1, (byte)10);
      }

      Class3 var7 = new Class3(client.aClass20_11187);

      for(Class526_Sub38 var8 = (Class526_Sub38)var7.method523(-967689587); var8 != null; var8 = (Class526_Sub38)var7.next()) {
         if(!var8.method6330((byte)-59)) {
            var8 = (Class526_Sub38)var7.method523(673187062);
            if(null == var8) {
               break;
            }
         }

         if(var8.anInt10685 * -1233131191 == 3) {
            int var9 = (int)(var8.aLong7156 * -6805155999452426801L);
            if(var9 >>> 16 == var4) {
               method8307(var8, true, var2, (byte)-7);
            }
         }
      }

   }

   public static final void method8308(byte var0) {
      Class526_Sub1 var1;
      for(var1 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8206((byte)90); null != var1; var1 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8181(1566737123)) {
         if(!var1.aBool10310) {
            var1.aBool10300 = true;
            if(195793035 * var1.anInt10301 >= 0 && 64888215 * var1.anInt10298 >= 0 && 195793035 * var1.anInt10301 < client.aClass505_11204.method6056(-1746741811) && var1.anInt10298 * 64888215 < client.aClass505_11204.method6057(126749238)) {
               NPCDirection.method7983(var1, (byte)-72);
            }
         } else {
            var1.method6332(-1949449864);
         }
      }

      for(var1 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8206((byte)100); null != var1; var1 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8181(1257564644)) {
         if(!var1.aBool10310) {
            var1.aBool10300 = true;
         } else {
            var1.method6332(-1949449864);
         }
      }

   }

   public static void method8309(boolean var0, int var1) {
      if(null == Class309.aClass290_3377) {
         Class640.method7639(-1862896847);
      }

      if(var0) {
         Class309.aClass290_3377.method3826((byte)-26);
      }

   }

   static final void method8310(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
