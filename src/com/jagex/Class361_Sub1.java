package com.jagex;

import com.jagex.Class10;
import com.jagex.Class208;
import com.jagex.Class221;
import com.jagex.Class228;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class248;
import com.jagex.Class304_Sub1;
import com.jagex.Class315_Sub1;
import com.jagex.Class358;
import com.jagex.Class361;
import com.jagex.Class375;
import com.jagex.Class378;
import com.jagex.Class388;
import com.jagex.Class474;
import com.jagex.Class475;
import com.jagex.Class479;
import com.jagex.Class548;
import com.jagex.Class551;
import com.jagex.Class561;
import com.jagex.Class565;
import com.jagex.Class566;
import com.jagex.Class648;
import com.jagex.Class681;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class361_Sub1 extends Class361 {
   static final float aFloat10273 = 2.0F;
   volatile boolean aBool10272 = false;
   List aList10275 = new ArrayList();
   Runnable aRunnable10276 = new Class566(this);
   Runnable aRunnable10277 = new Class551(this);
   Class358 aClass358_10271 = new Class358(this);
   HashMap aHashMap10270 = new HashMap();
   Thread aThread10274;
   Thread aThread10269;

   public Class361_Sub1(Class648 var1) {
      Iterator var2 = var1.aHashMap8455.keySet().iterator();

      Class474 var3;
      while(var2.hasNext()) {
         var3 = (Class474)var2.next();
         this.aHashMap10270.put(var3, new Class479[((Integer)var1.aHashMap8455.get(var3)).intValue()]);
      }

      var2 = this.aHashMap10270.keySet().iterator();

      while(var2.hasNext()) {
         var3 = (Class474)var2.next();
         Class479[] var4 = (Class479[])((Class479[])this.aHashMap10270.get(var3));

         for(int var5 = 0; var5 < var4.length; ++var5) {
            Class248 var6 = new Class248(2.0F);
            var6.method307(0, Class388.aClass388_4057, Class375.aClass375_3902, 2);
            var4[var5] = new Class479(var3, 8192, 3, var6, this);
         }
      }

      Class561 var7 = new Class561(this, 44100.0F, '\u8000');
      Class561 var8 = new Class561(this, 22050.0F, 16384);
      this.aList10275.add(var7);
      this.aList10275.add(var8);
      this.aThread10274 = new Thread(this.aRunnable10277);
      this.aThread10269 = new Thread(this.aRunnable10276);
      this.aThread10274.setPriority(10);
      this.aThread10269.setPriority(10);
      this.aThread10274.start();
      this.aThread10269.start();
   }

   public void method4593(int var1) {
      if(null != this.aClass358_10271) {
         this.aClass358_10271.method4580(-380607387);
      }

      Iterator var2 = this.aHashMap10270.keySet().iterator();

      while(true) {
         Class479[] var4;
         int var7;
         byte var10;
         do {
            if(!var2.hasNext()) {
               return;
            }

            Class474 var3 = (Class474)var2.next();
            var4 = (Class479[])((Class479[])this.aHashMap10270.get(var3));
            if(!var3.aBool5374) {
               boolean var5 = false;

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  var4[var6].method5687(-1848296176);
                  var5 |= var4[var6].method5686((byte)87);
               }

               if(var5) {
                  Arrays.sort(var4, new Class548(this));
               }
            }

            var10 = 6;
            boolean var11 = false;
            var7 = var4.length - 1;

            while(!var11) {
               float var8 = var4[var7].method5684(-1120126182);
               Class475 var9 = var4[var7].method5670(189226945);
               if(var8 < 0.0F) {
                  if(Class475.aClass475_5380 == var9 || Class475.aClass475_5379 == var9 || var9 == Class475.aClass475_5385) {
                     var4[var7].method5680(-200345854);
                  }
               } else {
                  var11 = true;
               }

               --var7;
               if(var7 < 0) {
                  var11 = true;
               }
            }
         } while(var7 < var4.length - var10);

         for(; var7 >= var4.length - var10; --var7) {
            Class475 var12 = var4[var7].method5670(1846931756);
            if(var12 == Class475.aClass475_5380) {
               var4[var7].method5680(-200345854);
            }
         }
      }
   }

   public int method4597(Object var1, int var2) {
      if(var1 != null && var1 instanceof Class565) {
         Class565 var3 = (Class565)var1;
         Class561 var4 = var3.aClass561_7603;
         synchronized(var4) {
            return var3.method6795(-1637102043);
         }
      } else {
         return 0;
      }
   }

   Class561 method9235(float var1, int var2) {
      float var3 = -1.0F;
      float var4 = Float.MAX_VALUE;
      Class561 var5 = null;
      Iterator var6 = this.aList10275.iterator();

      while(true) {
         Class561 var7;
         float var8;
         float var9;
         do {
            if(!var6.hasNext()) {
               return var5;
            }

            var7 = (Class561)var6.next();
            var8 = var7.aFloat7553;
            var9 = Math.abs(var8 - var1);
         } while(var3 >= 0.0F && var9 >= var4);

         var3 = var8;
         var4 = var9;
         var5 = var7;
      }
   }

   public Class358 method4614() {
      return this.aClass358_10271;
   }

   public void method4595(Object var1, byte var2) {
      if(null != var1 && var1 instanceof Class565) {
         Class565 var3 = (Class565)var1;
         Class561 var4 = var3.aClass561_7603;
         synchronized(var4) {
            var3.aClass561_7603.method6748(var3, -1855376715);
         }
      }

   }

   public void method4596(Object var1, byte[] var2, int var3, int var4, byte var5) {
      if(var1 != null && var1 instanceof Class565) {
         Class565 var6 = (Class565)var1;
         Class561 var7 = var6.aClass561_7603;
         synchronized(var7) {
            var6.method6796(var2, var3, var4, -2128706223);
         }
      }

   }

   public Class479 method4612(Class474 var1, int var2) {
      HashMap var3 = this.aHashMap10270;
      synchronized(var3) {
         Class479[] var4 = (Class479[])((Class479[])this.aHashMap10270.get(var1));
         if(var4 == null) {
            return null;
         } else {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               Class479 var6 = var4[var5];
               Class475 var7 = var6.method5670(1997476950);
               if(Class475.aClass475_5377 == var7) {
                  var6.method5674(693925677);
                  return var6;
               }
            }

            return null;
         }
      }
   }

   Object method4599(Class378 var1, int var2) {
      return null;
   }

   public Class358 method4617(byte var1) {
      return this.aClass358_10271;
   }

   public void method4608(Object var1, byte[] var2, int var3, int var4) {
      if(var1 != null && var1 instanceof Class565) {
         Class565 var5 = (Class565)var1;
         Class561 var6 = var5.aClass561_7603;
         synchronized(var6) {
            var5.method6796(var2, var3, var4, -2018131367);
         }
      }

   }

   public void method4618(Object var1) {
      if(null != var1 && var1 instanceof Class565) {
         Class565 var2 = (Class565)var1;
         Class561 var3 = var2.aClass561_7603;
         synchronized(var3) {
            var2.aClass561_7603.method6748(var2, -1882812169);
         }
      }

   }

   public int method4601(Object var1) {
      if(var1 != null && var1 instanceof Class565) {
         Class565 var2 = (Class565)var1;
         Class561 var3 = var2.aClass561_7603;
         synchronized(var3) {
            return var2.method6795(-1498069953);
         }
      } else {
         return 0;
      }
   }

   public Object method4600(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6) {
      Class561 var7 = this.method9235(var6 * (float)var2, -2050676706);
      Class565 var8 = new Class565(this, var7, var5, var6 * (float)var2, var3.anInt4060 * 1260438277, var1 < 2?2:var1, var3 == Class388.aClass388_4057 || var3 == Class388.aClass388_4059, Class375.aClass375_3903 == var4);
      Class561 var9 = var8.aClass561_7603;
      synchronized(var9) {
         var8.aClass561_7603.method6752(var8, -1179437280);
         return var8;
      }
   }

   public Object method4598(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6) {
      Class561 var7 = this.method9235(var6 * (float)var2, -1167904731);
      Class565 var8 = new Class565(this, var7, var5, var6 * (float)var2, var3.anInt4060 * 1260438277, var1 < 2?2:var1, var3 == Class388.aClass388_4057 || var3 == Class388.aClass388_4059, Class375.aClass375_3903 == var4);
      Class561 var9 = var8.aClass561_7603;
      synchronized(var9) {
         var8.aClass561_7603.method6752(var8, 1847984834);
         return var8;
      }
   }

   public void method4619(Object var1) {
      if(null != var1 && var1 instanceof Class565) {
         Class565 var2 = (Class565)var1;
         Class561 var3 = var2.aClass561_7603;
         synchronized(var3) {
            var2.aClass561_7603.method6748(var2, -2141854719);
         }
      }

   }

   public void method4607(Object var1, byte[] var2, int var3, int var4) {
      if(var1 != null && var1 instanceof Class565) {
         Class565 var5 = (Class565)var1;
         Class561 var6 = var5.aClass561_7603;
         synchronized(var6) {
            var5.method6796(var2, var3, var4, -1755429369);
         }
      }

   }

   public void method4616() {
      HashMap var1 = this.method9236(1031487430);
      synchronized(var1) {
         Iterator var3 = var1.keySet().iterator();

         while(var3.hasNext()) {
            Class474 var13 = (Class474)var3.next();
            Class479[] var14 = (Class479[])((Class479[])var1.get(var13));

            for(int var15 = 0; var15 < var14.length; ++var15) {
               if(var14[var15].method5670(1705450378) != Class475.aClass475_5377) {
                  var14[var15].method5680(-200345854);
                  var14[var15].method5724(301018015);
               }
            }
         }
      }

      for(boolean var2 = false; !var2; Class304_Sub1.method9089(10L)) {
         var2 = true;
         synchronized(var1) {
            Iterator var4 = var1.keySet().iterator();

            while(var4.hasNext()) {
               Class474 var5 = (Class474)var4.next();
               Class479[] var6 = (Class479[])((Class479[])var1.get(var5));

               for(int var7 = 0; var7 < var6.length; ++var7) {
                  if(var6[var7].method5670(376397037) != Class475.aClass475_5377) {
                     var6[var7].method5687(-1848296176);
                     var2 = false;
                  }
               }
            }
         }
      }

      this.aBool10272 = true;

      try {
         this.aThread10274.join();
      } catch (InterruptedException var10) {
         var10.printStackTrace();
      }

      try {
         this.aThread10269.join();
      } catch (InterruptedException var9) {
         var9.printStackTrace();
      }

   }

   public Class479 method4609(Class474 var1) {
      HashMap var2 = this.aHashMap10270;
      synchronized(var2) {
         Class479[] var3 = (Class479[])((Class479[])this.aHashMap10270.get(var1));
         if(var3 == null) {
            return null;
         } else {
            for(int var4 = 0; var4 < var3.length; ++var4) {
               Class479 var5 = var3[var4];
               Class475 var6 = var5.method5670(1918991320);
               if(Class475.aClass475_5377 == var6) {
                  var5.method5674(2198739);
                  return var5;
               }
            }

            return null;
         }
      }
   }

   public Class479 method4605(Class474 var1) {
      HashMap var2 = this.aHashMap10270;
      synchronized(var2) {
         Class479[] var3 = (Class479[])((Class479[])this.aHashMap10270.get(var1));
         if(var3 == null) {
            return null;
         } else {
            for(int var4 = 0; var4 < var3.length; ++var4) {
               Class479 var5 = var3[var4];
               Class475 var6 = var5.method5670(-81819237);
               if(Class475.aClass475_5377 == var6) {
                  var5.method5674(1203373014);
                  return var5;
               }
            }

            return null;
         }
      }
   }

   Object method4611(Class378 var1) {
      return null;
   }

   Object method4613(Class378 var1) {
      return null;
   }

   Object method4610(Class378 var1) {
      return null;
   }

   public void method4604(byte var1) {
      HashMap var2 = this.method9236(-1529041560);
      synchronized(var2) {
         Iterator var4 = var2.keySet().iterator();

         while(var4.hasNext()) {
            Class474 var14 = (Class474)var4.next();
            Class479[] var15 = (Class479[])((Class479[])var2.get(var14));

            for(int var16 = 0; var16 < var15.length; ++var16) {
               if(var15[var16].method5670(-651958269) != Class475.aClass475_5377) {
                  var15[var16].method5680(-200345854);
                  var15[var16].method5724(301018015);
               }
            }
         }
      }

      for(boolean var3 = false; !var3; Class304_Sub1.method9089(10L)) {
         var3 = true;
         synchronized(var2) {
            Iterator var5 = var2.keySet().iterator();

            while(var5.hasNext()) {
               Class474 var6 = (Class474)var5.next();
               Class479[] var7 = (Class479[])((Class479[])var2.get(var6));

               for(int var8 = 0; var8 < var7.length; ++var8) {
                  if(var7[var8].method5670(745436485) != Class475.aClass475_5377) {
                     var7[var8].method5687(-1848296176);
                     var3 = false;
                  }
               }
            }
         }
      }

      this.aBool10272 = true;

      try {
         this.aThread10274.join();
      } catch (InterruptedException var11) {
         var11.printStackTrace();
      }

      try {
         this.aThread10269.join();
      } catch (InterruptedException var10) {
         var10.printStackTrace();
      }

   }

   public Class358 method4615() {
      return this.aClass358_10271;
   }

   public void method4602() {
      if(null != this.aClass358_10271) {
         this.aClass358_10271.method4580(-380607387);
      }

      Iterator var1 = this.aHashMap10270.keySet().iterator();

      while(true) {
         Class479[] var3;
         int var6;
         byte var9;
         do {
            if(!var1.hasNext()) {
               return;
            }

            Class474 var2 = (Class474)var1.next();
            var3 = (Class479[])((Class479[])this.aHashMap10270.get(var2));
            if(!var2.aBool5374) {
               boolean var4 = false;

               for(int var5 = 0; var5 < var3.length; ++var5) {
                  var3[var5].method5687(-1848296176);
                  var4 |= var3[var5].method5686((byte)-4);
               }

               if(var4) {
                  Arrays.sort(var3, new Class548(this));
               }
            }

            var9 = 6;
            boolean var10 = false;
            var6 = var3.length - 1;

            while(!var10) {
               float var7 = var3[var6].method5684(-1120126182);
               Class475 var8 = var3[var6].method5670(-406457436);
               if(var7 < 0.0F) {
                  if(Class475.aClass475_5380 == var8 || Class475.aClass475_5379 == var8 || var8 == Class475.aClass475_5385) {
                     var3[var6].method5680(-200345854);
                  }
               } else {
                  var10 = true;
               }

               --var6;
               if(var6 < 0) {
                  var10 = true;
               }
            }
         } while(var6 < var3.length - var9);

         for(; var6 >= var3.length - var9; --var6) {
            Class475 var11 = var3[var6].method5670(-1058526958);
            if(var11 == Class475.aClass475_5380) {
               var3[var6].method5680(-200345854);
            }
         }
      }
   }

   public void method4592(Object var1) {
      if(null != var1 && var1 instanceof Class565) {
         Class565 var2 = (Class565)var1;
         Class561 var3 = var2.aClass561_7603;
         synchronized(var3) {
            var2.aClass561_7603.method6748(var2, -1997449916);
         }
      }

   }

   public Object method4594(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6, byte var7) {
      Class561 var8 = this.method9235(var6 * (float)var2, -1044386187);
      Class565 var9 = new Class565(this, var8, var5, var6 * (float)var2, var3.anInt4060 * 1260438277, var1 < 2?2:var1, var3 == Class388.aClass388_4057 || var3 == Class388.aClass388_4059, Class375.aClass375_3903 == var4);
      Class561 var10 = var9.aClass561_7603;
      synchronized(var10) {
         var9.aClass561_7603.method6752(var9, 1991726118);
         return var9;
      }
   }

   HashMap method9236(int var1) {
      return this.aHashMap10270;
   }

   HashMap method9237() {
      return this.aHashMap10270;
   }

   public Object method4606(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6) {
      Class561 var7 = this.method9235(var6 * (float)var2, -54036390);
      Class565 var8 = new Class565(this, var7, var5, var6 * (float)var2, var3.anInt4060 * 1260438277, var1 < 2?2:var1, var3 == Class388.aClass388_4057 || var3 == Class388.aClass388_4059, Class375.aClass375_3903 == var4);
      Class561 var9 = var8.aClass561_7603;
      synchronized(var9) {
         var8.aClass561_7603.method6752(var8, 1590416136);
         return var8;
      }
   }

   public Class358 method4603() {
      return this.aClass358_10271;
   }

   static final void method9238(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)86);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class228.method3174(var3, var4, var0, 1643375407);
   }

   static final void method9239(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class10.aBool64?1:0;
   }

   public static void method9240(long[] var0, Object[] var1, byte var2) {
      Class208.method2927(var0, var1, 0, var0.length - 1, 141648135);
   }
}
