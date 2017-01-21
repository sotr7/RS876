package com.jagex;

import com.jagex.Class105;
import com.jagex.Class152;
import com.jagex.Class195;
import com.jagex.Class232;
import com.jagex.Class291;
import com.jagex.Class307;
import com.jagex.Class32;
import com.jagex.Class384;
import com.jagex.Class399;
import com.jagex.Class440;
import com.jagex.Class443;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class46;
import com.jagex.Class460;
import com.jagex.Class526_Sub21;
import com.jagex.RSByteBuffer;
import com.jagex.Class532;
import com.jagex.Class56;
import com.jagex.Class58;
import com.jagex.Class59_Sub2;
import com.jagex.Class635;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class674;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.Class709;
import com.jagex.Class71_Sub1;
import com.jagex.Class80;
import com.jagex.Interface76;
import com.jagex.RuntimeException_Sub4;
import com.jagex.client;
import java.util.HashMap;
import java.util.Map;

public class Class247 implements Interface76 {
   public static Class460 aClass460_2688;
   public static Class59_Sub2 aClass59_Sub2_2689;
   int anInt2686;
   int anInt2683;
   static Class247 aClass247_2687 = new Class247(0, 0);
   static Class247 aClass247_2685 = new Class247(2, 1);
   static Class247 aClass247_2684 = new Class247(3, 2);
   static Class247 aClass247_2682 = new Class247(1, 3);

   Class247(int var1, int var2) {
      this.anInt2686 = 444897131 * var1;
      this.anInt2683 = 1101696873 * var2;
   }

   public int getId() {
      return 1256911065 * this.anInt2683;
   }

   public int method21() {
      return 1256911065 * this.anInt2683;
   }

   static Class247[] method3393(int var0) {
      return new Class247[]{aClass247_2687, aClass247_2682, aClass247_2685, aClass247_2684};
   }

   public static Class399 method3394(RSByteBuffer var0, int var1) {
      int var2 = var0.readInt((byte)5);
      return new Class399(var2);
   }

   static boolean method3395(String var0, String var1, int var2) {
      Class32.anInt310 = 1696245043;
      RuntimeException_Sub4.aClass111_12105 = client.aClass111_11060;
      return Class635.method7556(false, false, var0, var1, -1L);
   }

   static final void method3396(Class681 var0, int var1) {
      if(Class195.aClass292_Sub1_2182.method3914((byte)3) != Class307.aClass307_3293) {
         throw new RuntimeException();
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class195.aClass292_Sub1_2182.method3917((byte)-77);
      }
   }

   public static Interface76 method3397(Class var0, int var1, int var2) {
      Map var3 = Class674.aMap8582;
      synchronized(var3) {
         Object var4 = (Map)Class674.aMap8582.get(var0);
         if(null == var4) {
            var4 = new HashMap();
            Interface76[] var5 = (Interface76[])((Interface76[])var0.getEnumConstants());

            for(int var6 = 0; var6 < var5.length; ++var6) {
               Interface76 var7 = var5[var6];
               ((Map)var4).put(Integer.valueOf(var7.getId()), var7);
            }

            Class674.aMap8582.put(var0, var4);
         }

         return (Interface76)((Map)var4).get(Integer.valueOf(var1));
      }
   }

   public static void method3398(int var0, int var1, int var2, int var3) {
      Class709.method8305(new Class71_Sub1(var0, var1, var2, client.anInt11039 * 1421601765, aClass460_2688.errors * -4719749, 1878857085 * aClass460_2688.status, aClass460_2688.method5428(-1871382260), aClass460_2688.method5427(1231226212), Class56.aClass451_681.method5348((byte)-62)), 1981657580);
   }

   static final void method3399(Class639_Sub1_Sub2_Sub1 var0, boolean var1, byte var2) {
      int var3 = MovementDirection.aClass683_8651.id;
      int var4 = 0;
      if(-1021573293 * var0.anInt11923 > client.anInt11012) {
         Class105.method1332(var0, -1738148684);
      } else if(1228606331 * var0.anInt11924 >= client.anInt11012) {
         Class384.method4727(var0, (byte)-8);
      } else {
         Class152.method1766(var0, var1, 2039768277);
         var3 = 2078041367 * Class232.anInt2367;
         var4 = -1275644263 * Class58.anInt721;
      }

      Class446 var5 = var0.method7635().aClass446_4816;
      int var6;
      if((int)var5.aFloat4917 < 512 || (int)var5.aFloat4919 < 512 || (int)var5.aFloat4917 >= (client.aClass505_11204.method6056(-1746741811) - 1) * 512 || (int)var5.aFloat4919 >= (client.aClass505_11204.method6057(126749238) - 1) * 512) {
         var0.aClass704_11915.method8246(-1, (byte)-69);

         for(var6 = 0; var6 < var0.aClass510Array11906.length; ++var6) {
            var0.aClass510Array11906[var6].anInt6980 = -2069804113;
            var0.aClass510Array11906[var6].aClass704_6979.method8246(-1, (byte)-8);
         }

         var0.anIntArray11935 = null;
         var0.anInt11923 = 0;
         var0.anInt11924 = 0;
         var3 = MovementDirection.aClass683_8651.id;
         var4 = 0;
         var0.method7618((float)(512 * var0.screenX[0] + var0.method10781(-627148024) * 256), var5.aFloat4915, (float)(512 * var0.screenY[0] + var0.method10781(-627148024) * 256));
         var0.method10819(1813344048);
      }

      if(var0 == Class451.localPlayer && ((int)var5.aFloat4917 < 6144 || (int)var5.aFloat4919 < 6144 || (int)var5.aFloat4917 >= (client.aClass505_11204.method6056(-1746741811) - 12) * 512 || (int)var5.aFloat4919 >= (client.aClass505_11204.method6057(126749238) - 12) * 512)) {
         var0.aClass704_11915.method8246(-1, (byte)-33);

         for(var6 = 0; var6 < var0.aClass510Array11906.length; ++var6) {
            var0.aClass510Array11906[var6].anInt6980 = -2069804113;
            var0.aClass510Array11906[var6].aClass704_6979.method8246(-1, (byte)-97);
         }

         var0.anIntArray11935 = null;
         var0.anInt11923 = 0;
         var0.anInt11924 = 0;
         var3 = MovementDirection.aClass683_8651.id;
         var4 = 0;
         var0.method7618((float)(512 * var0.screenX[0] + var0.method10781(-627148024) * 256), var5.aFloat4915, (float)(512 * var0.screenY[0] + var0.method10781(-627148024) * 256));
         var0.method10819(1491280631);
      }

      var6 = Class291.method3885(var0, (byte)117);
      Class80.method1159(var0, (byte)-110);
      Class32.method801(var0, var3, var4, var6, 447695927);
      Class526_Sub21.method9446(var0, var3, 76546883);
      Class532.method6383(var0, (byte)0);
      Class440 var7 = Class440.method5192();
      var7.method5160(Class443.method5200(var0.aClass34_11940.method817(1182694638)), Class443.method5200(var0.aClass34_11942.method817(316959727)), Class443.method5200(var0.aClass34_11941.method817(237937348)));
      var0.method7626(var7);
      var7.method5163();
   }

   static final void method3400(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class46.anInt642 * 914845809 & 1;
   }
}
