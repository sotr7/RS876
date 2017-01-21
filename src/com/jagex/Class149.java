package com.jagex;

import com.jagex.Class143;
import com.jagex.Class2;
import com.jagex.Class200;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class317;
import com.jagex.Class387;
import com.jagex.Class452;
import com.jagex.Class526_Sub29_Sub2;
import com.jagex.Class529;
import com.jagex.Class539_Sub3;
import com.jagex.Class554;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class97_Sub1;
import com.jagex.Exception_Sub1;
import com.jagex.Interface18;
import com.jagex.Interface4;
import com.jagex.client;

public class Class149 implements Interface18 {
   public Interface4 anInterface4_1715;

   public int method118(Class317 var1) {
      return var1.method4094(this.method114(var1.aClass143_3405, 1304273184), -1434583520);
   }

   Class149(Class97_Sub1 var1, Class2 var2) {
      this(var1.aClass452_8927, var2);
   }

   public Class149(Class452 var1, Class2 var2) {
      this.anInterface4_1715 = var2;
   }

   public void method128(Class317 var1, int var2) throws Exception_Sub1 {
      this.method111(var1.aClass143_3405, var1.method4096(this.method114(var1.aClass143_3405, 1994633421), var2, 543063681), (byte)24);
   }

   public int method114(Class143 var1, int var2) {
      return this.anInterface4_1715.method33(697078941 * var1.anInt1674, (byte)61);
   }

   public long method121(Class143 var1, int var2) {
      return this.anInterface4_1715.method24(697078941 * var1.anInt1674, -1095890769);
   }

   public void method110(Class143 var1, long var2) {
      this.anInterface4_1715.method25(697078941 * var1.anInt1674, var2);
   }

   public void method111(Class143 var1, int var2, byte var3) {
      this.anInterface4_1715.method23(697078941 * var1.anInt1674, var2, 274872779);
   }

   public void method115(Class143 var1, Object var2, byte var3) {
      this.anInterface4_1715.method27(var1.anInt1674 * 697078941, var2, 172204199);
   }

   public int method116(Class317 var1, byte var2) {
      return var1.method4094(this.method114(var1.aClass143_3405, -1775981690), -1434583520);
   }

   public void method129(Class317 var1, int var2, int var3) throws Exception_Sub1 {
      this.method111(var1.aClass143_3405, var1.method4096(this.method114(var1.aClass143_3405, 242785103), var2, 543063681), (byte)24);
   }

   public Class149(Class97_Sub1 var1) {
      this(var1, new Class2(var1));
   }

   public int method117(Class317 var1) {
      return var1.method4094(this.method114(var1.aClass143_3405, 1820110362), -1434583520);
   }

   public int method120(Class317 var1) {
      return var1.method4094(this.method114(var1.aClass143_3405, 1841220668), -1434583520);
   }

   public int method119(Class317 var1) {
      return var1.method4094(this.method114(var1.aClass143_3405, 1445838384), -1434583520);
   }

   public int method122(Class143 var1) {
      return this.anInterface4_1715.method33(697078941 * var1.anInt1674, (byte)116);
   }

   public Object method126(Class143 var1) {
      return this.anInterface4_1715.method22(var1.anInt1674 * 697078941, -1730756378);
   }

   public long method124(Class143 var1) {
      return this.anInterface4_1715.method24(697078941 * var1.anInt1674, -1095890769);
   }

   public void method125(Class143 var1, long var2) {
      this.anInterface4_1715.method25(697078941 * var1.anInt1674, var2);
   }

   public Object method113(Class143 var1, byte var2) {
      return this.anInterface4_1715.method22(var1.anInt1674 * 697078941, -297068481);
   }

   public void method127(Class143 var1, Object var2) {
      this.anInterface4_1715.method27(var1.anInt1674 * 697078941, var2, 172204199);
   }

   public void method123(Class143 var1, int var2) {
      this.anInterface4_1715.method23(697078941 * var1.anInt1674, var2, 274872779);
   }

   public void method112(Class317 var1, int var2) throws Exception_Sub1 {
      this.method111(var1.aClass143_3405, var1.method4096(this.method114(var1.aClass143_3405, -180734095), var2, 543063681), (byte)24);
   }

   static final void method1746(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class529.method6372(var3, var4, var0, -648287085);
   }

   static final int[] method1747(String var0, Class681 var1, byte var2) {
      int[] var3 = null;
      if(var0.length() > 0 && var0.charAt(var0.length() - 1) == 89) {
         int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
         if(var4 > 0) {
            for(var3 = new int[var4]; var4-- > 0; var3[var4] = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285]) {
               ;
            }
         }
      }

      return var3;
   }

   static final void method1748(byte var0) {
      for(Class539_Sub3 var1 = (Class539_Sub3)client.aClass686_11083.method8052(1115407576); var1 != null; var1 = (Class539_Sub3)client.aClass686_11083.method8052(1115407576)) {
         Class200.method2874(var1, (byte)-62);
      }

      byte var4 = 0;
      byte var2 = 3;
      int var3;
      if(4 == 378016543 * client.anInt11073) {
         for(var3 = var4; var3 <= var2; ++var3) {
            client.method10309(var3);
         }

         client.method10343();
      } else {
         client.method10307();

         for(var3 = var4; var3 <= var2; ++var3) {
            client.method10339();
            client.method10308(var3);
            client.method10309(var3);
         }

         client.method10357();
         client.method10343();
      }

   }

   static final void method1749(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class265.method3558(var3, var0, 880834101);
   }

   static Class526_Sub29_Sub2 method1750(int var0, int var1, int var2, long var3, int var5, int var6) {
      Class526_Sub29_Sub2[] var7 = Class526_Sub29_Sub2.aClass526_Sub29_Sub2Array11815;
      synchronized(var7) {
         Class526_Sub29_Sub2 var8;
         if(-394363573 * Class526_Sub29_Sub2.anInt11817 == 0) {
            var8 = new Class526_Sub29_Sub2();
         } else {
            var8 = Class526_Sub29_Sub2.aClass526_Sub29_Sub2Array11815[(Class526_Sub29_Sub2.anInt11817 -= -1325063069) * -394363573];
         }

         var8.anInt11818 = -1323515715 * var0;
         var8.anInt11819 = var1 * -1781710229;
         var8.anInt11822 = var2 * 97977203;
         var8.aLong11821 = var3 * 4005382988645257991L;
         var8.anInt11820 = var5 * -170002667;
         return var8;
      }
   }

   static final void method1751(int var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6, int var7) {
      if(!var5 && (var1 < 512 || var2 < 512 || var1 > (client.aClass505_11204.method6056(-1746741811) - 2) * 512 || var2 > (client.aClass505_11204.method6057(126749238) - 2) * 512)) {
         float[] var9 = client.aFloatArray11132;
         client.aFloatArray11132[1] = -1.0F;
         var9[0] = -1.0F;
      } else {
         int var8 = Class387.method4762(var1, var2, var0, 1560917143) - var4;
         client.aClass445_11024.method5242(Class554.aClass174_7475.method2372());
         client.aClass445_11024.method5251((float)var3, 0.0F, 0.0F);
         Class554.aClass174_7475.method2326(client.aClass445_11024);
         if(var5) {
            Class554.aClass174_7475.method2513((float)var1, (float)var8, (float)var2, client.aFloatArray11132);
         } else {
            Class554.aClass174_7475.method2355((float)var1, (float)var8, (float)var2, client.aFloatArray11132);
         }

         client.aClass445_11024.method5251((float)(-var3), 0.0F, 0.0F);
         Class554.aClass174_7475.method2326(client.aClass445_11024);
         if(!var6) {
            client.aFloatArray11132[0] -= (float)(client.anInt11282 * 1133414285);
            client.aFloatArray11132[1] -= (float)(client.anInt11283 * 932092123);
         }

      }
   }
}
