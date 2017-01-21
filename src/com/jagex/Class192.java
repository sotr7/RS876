package com.jagex;

import com.jagex.Class16;
import com.jagex.Class20;
import com.jagex.Class204;
import com.jagex.Class221;
import com.jagex.Class222;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class418;
import com.jagex.Class439;
import com.jagex.Class526_Sub21_Sub14;
import com.jagex.Class526_Sub21_Sub14_Sub1;
import com.jagex.Class526_Sub21_Sub14_Sub2;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub38_Sub2;
import com.jagex.Class538;
import com.jagex.Class612_Sub1;
import com.jagex.Class659;
import com.jagex.Class681;
import com.jagex.Class696;
import com.jagex.Interface25;
import com.jagex.client;

public final class Class192 {
   Class696 aClass696_2172;
   int anInt2171;
   int anInt2170;
   Class20 aClass20_2169;
   Interface25 anInterface25_2173;

   public int method2763() {
      return this.anInt2171 * -242478357;
   }

   public int method2764(byte var1) {
      int var2 = 0;

      for(Class526_Sub21_Sub14 var3 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); var3 != null; var3 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(!var3.method10698((byte)36)) {
            ++var2;
         }
      }

      return var2;
   }

   public Class192(int var1, int var2) {
      this.aClass696_2172 = new Class696();
      this.anInt2171 = var1 * -267582013;
      this.anInt2170 = var1 * -422120285;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.aClass20_2169 = new Class20(var3);
   }

   public Object method2765(long var1) {
      Class526_Sub21_Sub14 var3 = (Class526_Sub21_Sub14)this.aClass20_2169.get(var1);
      if(null == var3) {
         return null;
      } else {
         Object var4 = var3.method10699(-647278881);
         if(null == var4) {
            var3.method6332(-1949449864);
            var3.uncache(-1856607511);
            this.anInt2170 += var3.anInt11823 * -875292301;
            return null;
         } else {
            if(var3.method10698((byte)30)) {
               Class526_Sub21_Sub14_Sub2 var5 = new Class526_Sub21_Sub14_Sub2(var4, -287718159 * var3.anInt11823);
               this.aClass20_2169.put(var5, var3.aLong7156 * -6805155999452426801L);
               this.aClass696_2172.offer(var5, (byte)-3);
               var5.cachedKey = 0L;
               var3.method6332(-1949449864);
               var3.uncache(-633238494);
            } else {
               this.aClass696_2172.offer(var3, (byte)-21);
               var3.cachedKey = 0L;
            }

            return var4;
         }
      }
   }

   public void method2766(long var1) {
      Class526_Sub21_Sub14 var3 = (Class526_Sub21_Sub14)this.aClass20_2169.get(var1);
      this.method2767(var3, 1620552011);
   }

   void method2767(Class526_Sub21_Sub14 var1, int var2) {
      if(null != var1) {
         var1.method6332(-1949449864);
         var1.uncache(-1989597432);
         this.anInt2170 += -875292301 * var1.anInt11823;
      }

   }

   public void method2768(Object var1, long var2) {
      this.method2781(var1, var2, 1, (byte)-4);
   }

   public void method2769(int var1, byte var2) {
      for(Class526_Sub21_Sub14 var3 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); null != var3; var3 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(var3.method10698((byte)-9)) {
            if(var3.method10699(636591606) == null) {
               var3.method6332(-1949449864);
               var3.uncache(1394387341);
               this.anInt2170 += var3.anInt11823 * -875292301;
            }
         } else if((var3.cachedKey += -6405544204082582527L) * 2384869564219888641L > (long)var1) {
            Class526_Sub21_Sub14_Sub1 var4 = new Class526_Sub21_Sub14_Sub1(var3.method10699(2033070397), var3.anInt11823 * -287718159);
            this.aClass20_2169.put(var4, var3.aLong7156 * -6805155999452426801L);
            Class222.method3096(var4, var3, (byte)121);
            var3.method6332(-1949449864);
            var3.uncache(1095390789);
         }
      }

   }

   public void method2770(int var1) {
      this.aClass696_2172.method8135((byte)-125);
      this.aClass20_2169.method647(929030154);
      this.anInt2170 = 1084884897 * this.anInt2171;
   }

   public int method2771(int var1) {
      return this.anInt2171 * -242478357;
   }

   public Class192(int var1) {
      this(var1, var1);
   }

   public void method2772(int var1) {
      for(Class526_Sub21_Sub14 var2 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); null != var2; var2 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(var2.method10698((byte)47)) {
            var2.method6332(-1949449864);
            var2.uncache(1104283616);
            this.anInt2170 += var2.anInt11823 * -875292301;
         }
      }

   }

   public Object method2773(int var1) {
      Class526_Sub21_Sub14 var4;
      for(Class526_Sub21_Sub14 var2 = (Class526_Sub21_Sub14)this.aClass20_2169.method638(1861375336); var2 != null; this.anInt2170 += -875292301 * var4.anInt11823) {
         Object var3 = var2.method10699(-698508852);
         if(var3 != null) {
            return var3;
         }

         var4 = var2;
         var2 = (Class526_Sub21_Sub14)this.aClass20_2169.method639(1783806141);
         var4.method6332(-1949449864);
         var4.uncache(-917892457);
      }

      return null;
   }

   public int method2774() {
      return this.anInt2171 * -242478357;
   }

   public Object method2775(int var1) {
      Class526_Sub21_Sub14 var4;
      for(Class526_Sub21_Sub14 var2 = (Class526_Sub21_Sub14)this.aClass20_2169.method639(237161705); null != var2; this.anInt2170 += -875292301 * var4.anInt11823) {
         Object var3 = var2.method10699(-413603468);
         if(null != var3) {
            return var3;
         }

         var4 = var2;
         var2 = (Class526_Sub21_Sub14)this.aClass20_2169.method639(39012897);
         var4.method6332(-1949449864);
         var4.uncache(423491243);
      }

      return null;
   }

   public void method2776() {
      this.aClass696_2172.method8135((byte)-13);
      this.aClass20_2169.method647(929030154);
      this.anInt2170 = 1084884897 * this.anInt2171;
   }

   public void method2777(int var1) {
      for(Class526_Sub21_Sub14 var2 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); null != var2; var2 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(var2.method10698((byte)-86)) {
            if(var2.method10699(-802991519) == null) {
               var2.method6332(-1949449864);
               var2.uncache(28401047);
               this.anInt2170 += var2.anInt11823 * -875292301;
            }
         } else if((var2.cachedKey += -6405544204082582527L) * 2384869564219888641L > (long)var1) {
            Class526_Sub21_Sub14_Sub1 var3 = new Class526_Sub21_Sub14_Sub1(var2.method10699(1813914294), var2.anInt11823 * -287718159);
            this.aClass20_2169.put(var3, var2.aLong7156 * -6805155999452426801L);
            Class222.method3096(var3, var2, (byte)112);
            var2.method6332(-1949449864);
            var2.uncache(630524608);
         }
      }

   }

   public void method2778(Interface25 var1, int var2) {
      this.anInterface25_2173 = var1;
   }

   public void method2779() {
      for(Class526_Sub21_Sub14 var1 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); null != var1; var1 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(var1.method10698((byte)-44)) {
            var1.method6332(-1949449864);
            var1.uncache(-1572336390);
            this.anInt2170 += var1.anInt11823 * -875292301;
         }
      }

   }

   public int method2780() {
      int var1 = 0;

      for(Class526_Sub21_Sub14 var2 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); var2 != null; var2 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(!var2.method10698((byte)-46)) {
            ++var1;
         }
      }

      return var1;
   }

   public void method2781(Object var1, long var2, int var4, byte var5) {
      if(var4 > -242478357 * this.anInt2171) {
         throw new IllegalStateException();
      } else {
         this.method2766(var2);
         this.anInt2170 -= var4 * -422120285;

         while(this.anInt2170 * -1798742261 < 0) {
            Class526_Sub21_Sub14 var6 = (Class526_Sub21_Sub14)this.aClass696_2172.poll(782293429);
            if(null == var6) {
               throw new RuntimeException("");
            }

            if(!var6.method10698((byte)41)) {
               ;
            }

            this.method2767(var6, -1429477944);
            if(null != this.anInterface25_2173) {
               this.anInterface25_2173.method164(var6.method10699(-118132872), 438141997);
            }
         }

         Class526_Sub21_Sub14_Sub2 var7 = new Class526_Sub21_Sub14_Sub2(var1, var4);
         this.aClass20_2169.put(var7, var2);
         this.aClass696_2172.offer(var7, (byte)-37);
         var7.cachedKey = 0L;
      }
   }

   public int method2782() {
      int var1 = 0;

      for(Class526_Sub21_Sub14 var2 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); var2 != null; var2 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(!var2.method10698((byte)74)) {
            ++var1;
         }
      }

      return var1;
   }

   public void method2783() {
      for(Class526_Sub21_Sub14 var1 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); null != var1; var1 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(var1.method10698((byte)39)) {
            var1.method6332(-1949449864);
            var1.uncache(486088611);
            this.anInt2170 += var1.anInt11823 * -875292301;
         }
      }

   }

   public void method2784() {
      for(Class526_Sub21_Sub14 var1 = (Class526_Sub21_Sub14)this.aClass696_2172.method8143((byte)-1); null != var1; var1 = (Class526_Sub21_Sub14)this.aClass696_2172.method8139(68831625)) {
         if(var1.method10698((byte)41)) {
            var1.method6332(-1949449864);
            var1.uncache(292388341);
            this.anInt2170 += var1.anInt11823 * -875292301;
         }
      }

   }

   public int method2785(int var1) {
      return -1798742261 * this.anInt2170;
   }

   static void method2786(Class681 var0, int var1) {
      int var2 = Class538.method6447(-1730576285);
      if(var2 < 0) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.viewerCounts[var2];
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.channelUrls[var2];
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.previewUrlTemplates[var2];
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.streamTitles[var2];
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.channelDisplayNames[var2];
      }

   }

   static final void method2787(Class681 var0, int var1) {
      if(0 != 1253690475 * var0.anInt8617) {
         Class659 var2 = var0.aClass659Array8639[(var0.anInt8617 -= 1811841091) * 1253690475];
         var0.aClass526_Sub21_Sub19_8629 = var2.aClass526_Sub21_Sub19_8509;
         var0.aClass508Array8634 = var0.aClass526_Sub21_Sub19_8629.aClass508Array11859;
         var0.anIntArray8642 = var0.aClass526_Sub21_Sub19_8629.anIntArray11860;
         var0.anInt8644 = 403364201 * var2.anInt8510;
         var0.anIntArray8643 = var2.anIntArray8513;
         var0.anObjectArray8618 = var2.anObjectArray8512;
         var0.aLongArray8619 = var2.aLongArray8511;
      }
   }

   static final void method2788(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-80);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class418.method4972(var3, var4, var0, -1940695821);
   }

   public static Class612_Sub1 method2789(int var0) {
      return 2059938929 * Class16.anInt176 < Class16.aClass612_Sub1Array175.length?Class16.aClass612_Sub1Array175[(Class16.anInt176 += 1854280849) * 2059938929 - 1]:null;
   }

   static final void method2790(InterfaceDef var0, Class681 var1, int var2) {
      if(client.method10311(var0).method9474(-1982351485) && client.aClass245_11213 == null) {
         Class242.method3329(var0.uid * 919258769, var0.componentSlot * 1300712985, (byte)101);
         client.aClass245_11213 = Class204.method2893(var0.uid * 919258769, 1300712985 * var0.componentSlot, -49899397);
         Class526_Sub31.method9555(client.aClass245_11213, (byte)10);
      }

   }

   static final void method2791(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      Class439.method5159(var2, var3 >> 14 & 16383, var3 & 16383, false, (byte)-3);
   }
}
