package com.jagex;

import com.jagex.Class146;
import com.jagex.Class152;
import com.jagex.Class158;
import com.jagex.Class163;
import com.jagex.Class174;
import com.jagex.Class199_Sub3;
import com.jagex.Class248;
import com.jagex.Class255;
import com.jagex.Class270;
import com.jagex.Class28;
import com.jagex.Class304_Sub1;
import com.jagex.Class31;
import com.jagex.Class358;
import com.jagex.Class361;
import com.jagex.Class375;
import com.jagex.Class378;
import com.jagex.Class388;
import com.jagex.Class422;
import com.jagex.Class47;
import com.jagex.Class474;
import com.jagex.Class475;
import com.jagex.Class479;
import com.jagex.Class526_Sub21_Sub13;
import com.jagex.Class526_Sub21_Sub13_Sub1;
import com.jagex.Class526_Sub21_Sub13_Sub2;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub8;
import com.jagex.Class578;
import com.jagex.Class609;
import com.jagex.Class627;
import com.jagex.Class648;
import com.jagex.Class680;
import com.jagex.Class701;
import com.jagex.client;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class361_Sub2 extends Class361 {
   static final float aFloat10283 = 2.0F;
   volatile boolean aBool10284 = false;
   long aLong10279 = Class255.time((byte)24) * 7473684833315492297L;
   Runnable aRunnable10286 = new Class158(this);
   Runnable aRunnable10287 = new Class152(this);
   Class358 aClass358_10281 = new Class358(this);
   HashMap aHashMap10280 = new HashMap();
   Thread aThread10285;
   Thread aThread10282;

   public Object method4600(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6) {
      return new Object();
   }

   public Class361_Sub2(Class648 var1) {
      Iterator var2 = var1.aHashMap8455.keySet().iterator();

      Class474 var3;
      while(var2.hasNext()) {
         var3 = (Class474)var2.next();
         this.aHashMap10280.put(var3, new Class479[((Integer)var1.aHashMap8455.get(var3)).intValue()]);
      }

      var2 = this.aHashMap10280.keySet().iterator();

      while(var2.hasNext()) {
         var3 = (Class474)var2.next();
         Class479[] var4 = (Class479[])((Class479[])this.aHashMap10280.get(var3));

         for(int var5 = 0; var5 < var4.length; ++var5) {
            Class248 var6 = new Class248(2.0F);
            var6.method307(0, Class388.aClass388_4057, Class375.aClass375_3902, 2);
            var4[var5] = new Class479(var3, '\u8000', 3, var6, this);
         }
      }

      this.aThread10285 = new Thread(this.aRunnable10287);
      this.aThread10282 = new Thread(this.aRunnable10286);
      this.aThread10285.setPriority(1);
      this.aThread10282.setPriority(1);
      this.aThread10285.start();
      this.aThread10282.start();
   }

   public void method4593(int var1) {
      if(null != this.aClass358_10281) {
         this.aClass358_10281.method4580(-380607387);
      }

      Iterator var2 = this.aHashMap10280.keySet().iterator();

      while(true) {
         Class479[] var4;
         int var7;
         byte var10;
         do {
            if(!var2.hasNext()) {
               return;
            }

            Class474 var3 = (Class474)var2.next();
            var4 = (Class479[])((Class479[])this.aHashMap10280.get(var3));
            if(!var3.aBool5374) {
               boolean var5 = false;

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  var4[var6].method5687(-1848296176);
                  var5 |= var4[var6].method5686((byte)-18);
               }

               if(var5) {
                  Arrays.sort(var4, new Class146(this));
               }
            }

            var10 = 3;
            boolean var11 = false;
            var7 = var4.length - 1;

            while(!var11) {
               float var8 = var4[var7].method5684(-1120126182);
               Class475 var9 = var4[var7].method5670(1427914913);
               if(var8 < 0.0F) {
                  if(Class475.aClass475_5380 == var9 || var9 == Class475.aClass475_5379 || Class475.aClass475_5385 == var9) {
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
            Class475 var12 = var4[var7].method5670(1343171909);
            if(Class475.aClass475_5380 == var12) {
               var4[var7].method5680(-200345854);
            }
         }
      }
   }

   public Object method4606(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6) {
      return new Object();
   }

   public Object method4594(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6, byte var7) {
      return new Object();
   }

   public void method4595(Object var1, byte var2) {
   }

   public Class358 method4617(byte var1) {
      return this.aClass358_10281;
   }

   public Class479 method4612(Class474 var1, int var2) {
      HashMap var3 = this.aHashMap10280;
      synchronized(var3) {
         Class479[] var4 = (Class479[])((Class479[])this.aHashMap10280.get(var1));
         if(null == var4) {
            return null;
         } else {
            for(int var5 = 0; var5 < var4.length; ++var5) {
               Class479 var6 = var4[var5];
               Class475 var7 = var6.method5670(683560793);
               if(var7 == Class475.aClass475_5377) {
                  var6.method5674(933254014);
                  return var6;
               }
            }

            return null;
         }
      }
   }

   public int method4597(Object var1, int var2) {
      long var3 = Class255.time((byte)24);
      int var5 = (int)(180000.0F / ((float)(var3 - this.aLong10279 * -1254748564189325191L) / 1000.0F));
      this.aLong10279 = var3 * 7473684833315492297L;
      return var5;
   }

   Object method4599(Class378 var1, int var2) {
      return null;
   }

   public void method4604(byte var1) {
      HashMap var2 = this.method9242(-1492910780);
      synchronized(var2) {
         Iterator var4 = var2.keySet().iterator();

         while(var4.hasNext()) {
            Class474 var14 = (Class474)var4.next();
            Class479[] var15 = (Class479[])((Class479[])var2.get(var14));

            for(int var16 = 0; var16 < var15.length; ++var16) {
               if(var15[var16].method5670(295559917) != Class475.aClass475_5377) {
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
                  if(var7[var8].method5670(-281410887) != Class475.aClass475_5377) {
                     var7[var8].method5687(-1848296176);
                     var3 = false;
                  }
               }
            }
         }
      }

      this.aBool10284 = true;

      try {
         this.aThread10285.join();
      } catch (InterruptedException var11) {
         var11.printStackTrace();
      }

      try {
         this.aThread10282.join();
      } catch (InterruptedException var10) {
         var10.printStackTrace();
      }

   }

   HashMap method9241() {
      return this.aHashMap10280;
   }

   public void method4602() {
      if(null != this.aClass358_10281) {
         this.aClass358_10281.method4580(-380607387);
      }

      Iterator var1 = this.aHashMap10280.keySet().iterator();

      while(true) {
         Class479[] var3;
         int var6;
         byte var9;
         do {
            if(!var1.hasNext()) {
               return;
            }

            Class474 var2 = (Class474)var1.next();
            var3 = (Class479[])((Class479[])this.aHashMap10280.get(var2));
            if(!var2.aBool5374) {
               boolean var4 = false;

               for(int var5 = 0; var5 < var3.length; ++var5) {
                  var3[var5].method5687(-1848296176);
                  var4 |= var3[var5].method5686((byte)-43);
               }

               if(var4) {
                  Arrays.sort(var3, new Class146(this));
               }
            }

            var9 = 3;
            boolean var10 = false;
            var6 = var3.length - 1;

            while(!var10) {
               float var7 = var3[var6].method5684(-1120126182);
               Class475 var8 = var3[var6].method5670(1524207715);
               if(var7 < 0.0F) {
                  if(Class475.aClass475_5380 == var8 || var8 == Class475.aClass475_5379 || Class475.aClass475_5385 == var8) {
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
            Class475 var11 = var3[var6].method5670(697454394);
            if(Class475.aClass475_5380 == var11) {
               var3[var6].method5680(-200345854);
            }
         }
      }
   }

   public int method4601(Object var1) {
      long var2 = Class255.time((byte)24);
      int var4 = (int)(180000.0F / ((float)(var2 - this.aLong10279 * -1254748564189325191L) / 1000.0F));
      this.aLong10279 = var2 * 7473684833315492297L;
      return var4;
   }

   public Class358 method4614() {
      return this.aClass358_10281;
   }

   public void method4607(Object var1, byte[] var2, int var3, int var4) {
   }

   public Object method4598(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6) {
      return new Object();
   }

   public void method4619(Object var1) {
   }

   public void method4608(Object var1, byte[] var2, int var3, int var4) {
   }

   public Class479 method4609(Class474 var1) {
      HashMap var2 = this.aHashMap10280;
      synchronized(var2) {
         Class479[] var3 = (Class479[])((Class479[])this.aHashMap10280.get(var1));
         if(null == var3) {
            return null;
         } else {
            for(int var4 = 0; var4 < var3.length; ++var4) {
               Class479 var5 = var3[var4];
               Class475 var6 = var5.method5670(759380105);
               if(var6 == Class475.aClass475_5377) {
                  var5.method5674(1225022847);
                  return var5;
               }
            }

            return null;
         }
      }
   }

   public Class479 method4605(Class474 var1) {
      HashMap var2 = this.aHashMap10280;
      synchronized(var2) {
         Class479[] var3 = (Class479[])((Class479[])this.aHashMap10280.get(var1));
         if(null == var3) {
            return null;
         } else {
            for(int var4 = 0; var4 < var3.length; ++var4) {
               Class479 var5 = var3[var4];
               Class475 var6 = var5.method5670(1522283930);
               if(var6 == Class475.aClass475_5377) {
                  var5.method5674(-692646810);
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

   HashMap method9242(int var1) {
      return this.aHashMap10280;
   }

   public Class358 method4603() {
      return this.aClass358_10281;
   }

   public Class358 method4615() {
      return this.aClass358_10281;
   }

   public void method4616() {
      HashMap var1 = this.method9242(-1492910780);
      synchronized(var1) {
         Iterator var3 = var1.keySet().iterator();

         while(var3.hasNext()) {
            Class474 var13 = (Class474)var3.next();
            Class479[] var14 = (Class479[])((Class479[])var1.get(var13));

            for(int var15 = 0; var15 < var14.length; ++var15) {
               if(var14[var15].method5670(-386033521) != Class475.aClass475_5377) {
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
                  if(var6[var7].method5670(673784365) != Class475.aClass475_5377) {
                     var6[var7].method5687(-1848296176);
                     var2 = false;
                  }
               }
            }
         }
      }

      this.aBool10284 = true;

      try {
         this.aThread10285.join();
      } catch (InterruptedException var10) {
         var10.printStackTrace();
      }

      try {
         this.aThread10282.join();
      } catch (InterruptedException var9) {
         var9.printStackTrace();
      }

   }

   public void method4592(Object var1) {
   }

   public void method4618(Object var1) {
   }

   public void method4596(Object var1, byte[] var2, int var3, int var4, byte var5) {
   }

   public static void method9243(Class174 var0, byte var1) {
      Class47.aClass163_643 = (Class163)Class627.aClass418_8195.method4951(client.anInterface51_11046, 1031233005 * Class28.anInt255, true, true, -1730576285);
      Class701.aClass1_8786 = Class627.aClass418_8195.method4964(client.anInterface51_11046, Class28.anInt255 * 1031233005, (byte)2);
      Class422.aClass163_4740 = (Class163)Class627.aClass418_8195.method4951(client.anInterface51_11046, Class28.anInt253 * 828252213, true, true, -1730576285);
      Class199_Sub3.aClass1_9887 = Class627.aClass418_8195.method4964(client.anInterface51_11046, Class28.anInt253 * 828252213, (byte)2);
      Class609.aClass163_7930 = (Class163)Class627.aClass418_8195.method4951(client.anInterface51_11046, -321022145 * Class28.anInt254, true, true, -1730576285);
      Class680.aClass1_8616 = Class627.aClass418_8195.method4964(client.anInterface51_11046, Class28.anInt254 * -321022145, (byte)2);
   }

   public static String method9244(Class526_Sub21_Sub6 var0, int var1) {
      if(!Class31.aBool291 && var0 != null) {
         int[] var2 = Class578.method6947(var0, -1532409718);
         return null == var2?"":Class526_Sub8.method9341(var2, -723416876);
      } else {
         return "";
      }
   }

   public static Class526_Sub21_Sub13 method9245(int var0, Class270 var1, RSByteBuffer var2, int var3) {
      return (Class526_Sub21_Sub13)(var1 == Class270.aClass270_2994?new Class526_Sub21_Sub13_Sub1(var0, var2):(var1 == Class270.aClass270_2993?new Class526_Sub21_Sub13_Sub2(var0, var2):null));
   }
}
