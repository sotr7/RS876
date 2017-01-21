package com.jagex;

import com.jagex.Class102;
import com.jagex.Class107;
import com.jagex.Class108;
import com.jagex.Class115;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class186;
import com.jagex.Class187;
import com.jagex.Class188;
import com.jagex.Class192;
import com.jagex.Class194;
import com.jagex.Class195;
import com.jagex.Class197;
import com.jagex.Class198;
import com.jagex.Class203;
import com.jagex.Class204;
import com.jagex.Class205;
import com.jagex.Class206;
import com.jagex.Class208;
import com.jagex.Class209;
import com.jagex.Class211;
import com.jagex.Class217;
import com.jagex.Class226;
import com.jagex.Class229;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class267;
import com.jagex.Class286;
import com.jagex.Class289;
import com.jagex.Class294;
import com.jagex.NPCDef;
import com.jagex.Class327;
import com.jagex.Class357;
import com.jagex.Class378;
import com.jagex.Class385;
import com.jagex.OutFrame;
import com.jagex.IncomingFrame;
import com.jagex.Class443;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class478;
import com.jagex.Class482;
import com.jagex.Class507;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub31;
import com.jagex.Class625;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.NPC;
import com.jagex.Class639_Sub1_Sub2_Sub4;
import com.jagex.Class639_Sub1_Sub2_Sub6;
import com.jagex.Class648;
import com.jagex.Class65;
import com.jagex.Class659;
import com.jagex.Class681;
import com.jagex.Class72;
import com.jagex.Class76;
import com.jagex.Interface40;
import com.jagex.Interface56;
import com.jagex.Interface70;
import com.jagex.client;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class231 {
   static final int anInt2334 = 8192;
   static final int anInt2335 = 16384;
   static final int anInt2336 = 8192;
   static final int anInt2337 = 4096;
   static final int anInt2339 = 4096;
   static final int anInt2341 = 16384;
   Class192 aClass192_2348;
   static final int anInt2358 = 0;
   List aList2349 = new ArrayList();
   List aList2342 = new ArrayList();
   HashMap aHashMap2343 = new HashMap();
   HashMap aHashMap2333 = new HashMap();
   List aList2353 = new ArrayList();
   HashMap aHashMap2338 = new HashMap();
   Class482 aClass482_2354 = null;
   boolean aBool2355 = false;
   Interface56 anInterface56_2345 = new Class203(this);
   Interface56 anInterface56_2360 = new Class186(this);
   Interface56 anInterface56_2361 = new Class205(this);
   Interface56 anInterface56_2362 = new Class208(this);
   int anInt2350;
   Class192 aClass192_2356;
   Class192 aClass192_2347;
   int anInt2352;
   boolean aBool2340;
   Class446 aClass446_2344;
   int anInt2357;
   boolean aBool2346;
   Class482 aClass482_2351;
   int anInt2359;

   Class192 method3187(int var1) {
      return this.aClass192_2356;
   }

   Class446 method3188(int var1) {
      return this.aClass446_2344;
   }

   public void method3189(int var1, int var2, int var3) {
      if(!this.aBool2340) {
         this.anInt2350 = var1 * -530356653;
         this.aClass192_2356 = new Class192(var2, 100);
         this.aClass192_2347 = new Class192(10);
         this.aClass192_2356.method2778(new Class198(this), -433641298);
         Class648 var4 = new Class648(Class357.aClass357_3818);
         Class65.method1074(var4, 969858971);
         this.method3196(-784670674);
         this.anInt2352 = 335328751;
         this.aBool2340 = true;
      }
   }

   public void method3190(byte var1) {
      if(this.aBool2340) {
         Class659.method7846((byte)-123);
         if(Class451.localPlayer != null && Class451.localPlayer.method7635() != null) {
            if(this.aClass446_2344 == null) {
               this.aClass446_2344 = new Class446();
            }

            this.aClass446_2344.aFloat4917 = Class451.localPlayer.method7635().aClass446_4816.aFloat4917;
            this.aClass446_2344.aFloat4915 = 0.0F;
            this.aClass446_2344.aFloat4919 = Class451.localPlayer.method7635().aClass446_4816.aFloat4919;
         }

         Iterator var2 = this.aHashMap2343.values().iterator();

         Interface70 var3;
         while(var2.hasNext()) {
            var3 = (Interface70)var2.next();
            var3.method445((byte)-65);
         }

         var2 = this.aHashMap2333.values().iterator();

         while(var2.hasNext()) {
            var3 = (Interface70)var2.next();
            var3.method445((byte)-13);
         }

         var2 = this.aList2353.iterator();

         while(var2.hasNext()) {
            var3 = (Interface70)var2.next();
            if(var3.method465(-1938244362)) {
               this.aHashMap2333.remove(Integer.valueOf(var3.method449((byte)118)));
            } else {
               this.aHashMap2343.remove(Integer.valueOf(var3.method449((byte)107)));
            }
         }

         this.aList2353.clear();
         if(this.aClass482_2354 != null && this.aClass482_2354.method5765(-1188101131) == Class478.aClass478_5393 && !this.aBool2355 && client.aClass111_11060.aClass14_1342 != null && Class108.method1349(client.anInt11038 * -558705405, -1728513157)) {
            OutFrameBuffer var10 = Class115.method1414(OutFrame.MUSIC_REQUEST, client.aClass111_11060.aClass14_1342, -2043862771);
            var10.out.writeInt(this.aClass482_2354.method5820(-2024152902).method449((byte)122), -357564953);
            client.aClass111_11060.write(var10, (byte)29);
            this.aBool2355 = true;
         }

         var2 = this.aList2349.iterator();

         while(true) {
            label162:
            while(true) {
               Class478 var4;
               Class482 var11;
               do {
                  if(!var2.hasNext()) {
                     return;
                  }

                  var11 = (Class482)var2.next();
                  var11.method5810(530810090);
                  var11.method5774((byte)-112);
                  var4 = var11.method5765(-1818989335);
               } while(var11.method5775(480428144) != this);

               if(Class478.aClass478_5395 != var4 && var4 != Class478.aClass478_5396) {
                  if(var11.method5765(-451035183) != Class478.aClass478_5392 && var11.method5780(1973510260) == Class187.aClass187_2125.method2723(-2073273886)) {
                     boolean var13 = this.method3199(Class187.aClass187_2125.method2723(-2135194258), (byte)16) > 1.0E-4F;
                     if(!var13) {
                        var11.method5770(150, -938617916);
                     }
                  }
               } else if(var11.method5779((byte)123) != Class188.aClass188_2144 && var11.method5779((byte)13) != Class188.aClass188_2145) {
                  Iterator var12 = this.aHashMap2338.keySet().iterator();

                  while(var12.hasNext()) {
                     int var14 = ((Integer)var12.next()).intValue();
                     Class211 var15 = (Class211)this.aHashMap2338.get(Integer.valueOf(var14));
                     if(var15.method2942(16777472).contains(var11)) {
                        var15.method2941(var11, (short)-903);
                        break;
                     }
                  }

                  var11.method5807((byte)46);
                  this.aList2342.remove(var11);
               } else if(var11 == this.aClass482_2354) {
                  this.aBool2355 = false;
                  this.aClass482_2354 = null;
                  var11.method5807((byte)-84);
                  this.aList2342.remove(var11);
               } else {
                  int var5 = var11.method5820(-2024152902).method449((byte)78);
                  boolean var6 = this.method3199(Class187.aClass187_2125.method2723(-2049397470), (byte)-36) > 0.0F;
                  if(!this.aBool2346 && var6) {
                     if(446490353 * this.anInt2352 == var5) {
                        this.method3225(var5, (byte)101);
                        this.anInt2352 = 335328751;
                     }

                     var11.method5807((byte)-21);
                     this.aList2342.remove(var11);
                  } else if(var5 == -1883592735 * this.anInt2357) {
                     this.anInt2357 = -436984865;
                     this.aBool2346 = false;
                     var11.method5807((byte)5);
                     this.aList2342.remove(var11);
                     Iterator var7 = this.aList2349.iterator();

                     Class482 var8;
                     int var9;
                     do {
                        do {
                           if(!var7.hasNext()) {
                              continue label162;
                           }

                           var8 = (Class482)var7.next();
                        } while(var8.method5779((byte)7) != Class188.aClass188_2144);

                        var9 = var8.method5820(-2024152902).method449((byte)49);
                     } while((var9 != this.anInt2352 * 446490353 || var8.method5765(-1757849964) != Class478.aClass478_5395) && var8.method5765(-2065479992) != Class478.aClass478_5398 && var8.method5765(-27084429) != Class478.aClass478_5391 && var8.method5765(-1984183742) != Class478.aClass478_5393);

                     if(var8.method5765(-439120166) == Class478.aClass478_5395) {
                        var8.method5772((byte)94);
                     } else {
                        var8.method5769(-2129180882);
                     }
                  } else if(var6) {
                     if(!this.aBool2346 || 446490353 * this.anInt2352 != var5) {
                        var11.method5807((byte)-78);
                        this.aList2342.remove(var11);
                     }

                     if(!this.aBool2346 && 446490353 * this.anInt2352 == var5) {
                        this.anInt2352 = 335328751;
                        this.aClass482_2351 = null;
                     }
                  }
               }
            }
         }
      }
   }

   public void method3191(int var1) {
      Class211 var2 = (Class211)this.aHashMap2338.get(Integer.valueOf(var1));
      if(null != var2) {
         List var3 = var2.method2942(16777472);
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            Class482 var5 = (Class482)var4.next();
            var5.method5805(2038354002);
         }

      }
   }

   public void method3192(Class482 var1, int var2, int var3, byte var4) {
      if(var1 != null) {
         Class211 var5 = (Class211)this.aHashMap2338.get(Integer.valueOf(var2));
         if(null == var5) {
            var5 = new Class211(this);
            this.aHashMap2338.put(Integer.valueOf(var2), var5);
         }

         if(!var5.method2943(var1, (byte)13)) {
            var1.method5789(var3, true, 659748616);
            var5.method2940(var1, 1974263759);
         }

      }
   }

   public void method3193(int var1, byte var2) {
      Class211 var3 = (Class211)this.aHashMap2338.get(Integer.valueOf(var1));
      if(var3 != null) {
         List var4 = var3.method2942(16777472);
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            Class482 var6 = (Class482)var5.next();
            if(!var6.method5790(-1061081427)) {
               var6.method5769(-2132511189);
            }
         }

      }
   }

   public void method3194() {
      Iterator var1 = this.aList2342.iterator();

      while(var1.hasNext()) {
         Class482 var2 = (Class482)var1.next();
         if(var2.method5779((byte)97) == Class188.aClass188_2144) {
            var2.method5770(500, -938617916);
            if(var2.method5820(-2024152902).method449((byte)98) == 446490353 * this.anInt2352) {
               this.method3225(446490353 * this.anInt2352, (byte)116);
               break;
            }
         }
      }

      this.aClass482_2351 = null;
      this.anInt2352 = 335328751;
   }

   public void method3195(int var1, int var2) {
      Class211 var3 = (Class211)this.aHashMap2338.get(Integer.valueOf(var1));
      if(null != var3) {
         List var4 = var3.method2942(16777472);
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            Class482 var6 = (Class482)var5.next();
            var6.method5805(1253825407);
         }

      }
   }

   void method3196(int var1) {
      Class194 var2 = new Class194(this);
      Class209 var3 = new Class209(this);
      Class217 var4 = new Class217(this);
      Class226 var5 = new Class226(this);
      Class229 var6 = new Class229(this);
      IncomingFrame.method4980(Class197.aClass197_2193.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 0.2F, var2, (byte)1);
      IncomingFrame.method4980(Class197.aClass197_2197.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 1.0F, var3, (byte)1);
      IncomingFrame.method4980(Class197.aClass197_2195.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 1.0F, var4, (byte)1);
      IncomingFrame.method4980(Class197.aClass197_2196.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 0.8F, var5, (byte)1);
      IncomingFrame.method4980(Class197.aClass197_2198.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 1.0F, var6, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2125.method2723(-1995454999), Class197.aClass197_2197.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2131.method2723(-1762311311), Class197.aClass197_2198.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2124.method2723(-1774482761), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2126.method2723(-1794315135), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2127.method2723(-2124448671), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2133.method2723(-2138880934), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2129.method2723(-2121438610), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2130.method2723(-1779067920), Class197.aClass197_2196.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2132.method2723(-2116384282), Class187.aClass187_2130.method2723(-2128252052), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2123.method2723(-2132373624), Class187.aClass187_2130.method2723(-2066066137), 1.0F, (Interface40)null, (byte)1);
      Class625.method7450(Class187.aClass187_2125.method2723(-2093774933), (byte)-18).method4694(0.75F, (byte)10);
   }

   public void method3197(int var1, int var2, int var3, byte var4) {
      int var5 = Class197.aClass197_2194.method2836(-1681327621);
      if(Class625.method7450(var1, (byte)-15) == null && (var5 == var2 || Class625.method7450(var2, (byte)-62) != null)) {
         float var6 = 1.5258789E-5F * (float)var3;
         IncomingFrame.method4980(var1, var2 == var5?-1:var2, var6, (Interface40)null, (byte)1);
      }
   }

   public void method3198(int var1, int var2, int var3) {
      Class378 var4 = Class625.method7450(var1, (byte)-88);
      if(var4 != null) {
         float var5 = 1.5258789E-5F * (float)var2;
         var4.method4694(var5, (byte)-17);
      }

   }

   float method3199(int var1, byte var2) {
      Class378 var3 = Class625.method7450(var1, (byte)-4);

      float var4;
      for(var4 = 1.0F; null != var3; var3 = var3.method4683(884041335)) {
         var4 *= var3.method4681((byte)3);
      }

      return var4;
   }

   public void method3200(int var1, int var2) {
      Iterator var3 = this.aList2342.iterator();

      while(var3.hasNext()) {
         Class482 var4 = (Class482)var3.next();
         int var5 = var4.method5780(1520212355);
         boolean var6 = Class385.method4747(var5, var1, (byte)4);
         if(var6) {
            var4.method5770(50, -938617916);
         }
      }

   }

   void method3201(int[] var1, int var2) {
      if(this.aBool2340) {
         if(null != var1) {
            int[] var3 = var1;

            for(int var4 = 0; var4 < var3.length; ++var4) {
               int var5 = var3[var4];
               this.method3239(var5, -2147483647);
            }

         }
      }
   }

   Interface70 method3202(int var1, boolean var2, int var3) {
      if(!this.aBool2340) {
         return null;
      } else {
         Interface70 var4 = (Interface70)(var2?this.aClass192_2347.method2765((long)var1):this.aClass192_2356.method2765((long)var1));
         if(var4 == null) {
            if(var2) {
               var4 = (Interface70)this.aHashMap2333.get(Integer.valueOf(var1));
            } else {
               var4 = (Interface70)this.aHashMap2343.get(Integer.valueOf(var1));
            }
         }

         return var4;
      }
   }

   Class482 method3203(Interface70 var1, int var2) {
      if(!this.aBool2340) {
         return null;
      } else {
         int var3 = 0;
         Iterator var4 = this.aList2349.iterator();

         Class482 var5;
         do {
            if(!var4.hasNext()) {
               if(var3 >= this.anInt2350 * 654167515) {
                  return null;
               }

               Class482 var6 = var1.method474((byte)76);
               this.aList2349.add(var6);
               return var6;
            }

            var5 = (Class482)var4.next();
            ++var3;
         } while(var5.method5765(-462345746) != Class478.aClass478_5389);

         var5.method5811(var1, (byte)-21);
         return var5;
      }
   }

   public void method3204(Class482 var1, int var2) {
      var1.method5776(this, 64807218);
      this.aList2342.add(var1);
   }

   boolean method3205(Class446 var1, Class446 var2, float var3, byte var4) {
      Class446 var5 = Class446.method5275(var2, var1);
      return var5.method5276() < var3;
   }

   Class192 method3206(int var1) {
      return this.aClass192_2347;
   }

   public void method3207(int var1, int var2, int var3) {
      if(446490353 * this.anInt2352 != var1) {
         if(this.aClass482_2354 != null) {
            this.aClass482_2354.method5770(0, -938617916);
            this.method3204(this.aClass482_2354, 1595784817);
            this.aClass482_2354 = null;
         }

         Class482 var4 = this.method3232(Class188.aClass188_2144, this, var1, 0, var2, Class187.aClass187_2125.method2723(-1811627041), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, 255, true, (byte)13);
         if(var4 != null) {
            var4.method5805(-2092749615);
            this.aClass482_2354 = var4;
         }

         this.aBool2355 = false;
      }
   }

   public void method3208(int var1, int var2) {
      Class378 var3 = Class625.method7450(var1, (byte)76);
      if(var3 != null) {
         float var4 = 1.5258789E-5F * (float)var2;
         var3.method4694(var4, (byte)32);
      }

   }

   public void method3209(int var1) {
      this.anInt2359 = var1 * 150552847;
   }

   public void method3210(int var1, int var2) {
      this.method3236(var1, 255, 877911551);
   }

   public void method3211(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(this.aBool2340) {
         if(this.anInt2352 * 446490353 != var1) {
            if(this.aBool2346 && this.aClass482_2351 != null && this.anInt2352 * 446490353 != var1) {
               this.aClass482_2351.method5772((byte)3);
               this.aClass482_2351.method5807((byte)-9);
               this.aList2342.remove(this.aClass482_2351);
            }

            Class482 var10 = this.method3249(-1732182308);
            if(null != var10 && var10.method5820(-2024152902).method449((byte)55) == var1) {
               this.aClass482_2351 = var10;
               this.anInt2352 = var10.method5820(-2024152902).method449((byte)37) * -335328751;
            } else {
               boolean var11 = false;
               if(446490353 * this.anInt2352 >= 0) {
                  Iterator var12 = this.aList2342.iterator();

                  while(var12.hasNext()) {
                     Class482 var13 = (Class482)var12.next();
                     if(var13.method5779((byte)114) == Class188.aClass188_2144) {
                        var13.method5770(2000, -938617916);
                        var11 = true;
                     }
                  }
               }

               this.aClass482_2351 = null;
               this.anInt2352 = 335328751;
               Class482 var16 = null;
               if(null != this.aClass482_2354 && this.aClass482_2354.method5820(-2024152902) != null && this.aClass482_2354.method5820(-2024152902).method449((byte)26) == var1 && this.aClass482_2354.method5765(-294330532) == Class478.aClass478_5393) {
                  var16 = this.aClass482_2354;
                  this.aClass482_2354 = null;
                  this.aBool2355 = false;
               }

               float var17;
               if(null == var16) {
                  if(var3) {
                     var17 = (float)var7;
                     float var14 = (float)var8;
                     Class446 var15 = new Class446((float)var5, 0.0F, (float)var6);
                     var16 = this.method3232(Class188.aClass188_2144, this, var1, 0, var11?0:var2, var1 == this.anInt2359 * 1142525423?Class197.aClass197_2195.method2836(-1681327621):Class187.aClass187_2125.method2723(-1874516907), Class204.aClass204_2218, var17, var14, var15, var4, 255, true, (byte)13);
                  } else {
                     var16 = this.method3232(Class188.aClass188_2144, this, var1, 0, var11?0:var2, 1142525423 * this.anInt2359 == var1?Class197.aClass197_2195.method2836(-1681327621):Class187.aClass187_2125.method2723(-2036502013), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, 255, true, (byte)13);
                  }
               }

               if(var16 != null) {
                  if(var11) {
                     var17 = (float)var2 / 255.0F;
                     var16.method5777(var17, 2000, -1162662041);
                  }

                  var16.method5769(-2121206065);
                  this.method3204(var16, 1955040127);
                  this.aClass482_2351 = var16;
                  this.anInt2352 = -335328751 * var1;
                  if(this.aBool2346) {
                     this.aClass482_2351.method5771(2101395465);
                  }

                  if(client.aClass111_11060.aClass14_1342 != null && Class108.method1349(-558705405 * client.anInt11038, -1728513157)) {
                     OutFrameBuffer var18 = Class115.method1414(OutFrame.MUSIC_REQUEST, client.aClass111_11060.aClass14_1342, 626420843);
                     var18.out.writeInt(446490353 * this.anInt2352, -357564953);
                     client.aClass111_11060.write(var18, (byte)31);
                  }
               }

            }
         }
      }
   }

   List method3212(int var1) {
      return this.aList2342;
   }

   public void method3213(int var1) {
      Iterator var2 = this.aList2342.iterator();

      while(var2.hasNext()) {
         Class482 var3 = (Class482)var2.next();
         if(var3.method5779((byte)74) == Class188.aClass188_2144) {
            var3.method5770(500, -938617916);
            if(var3.method5820(-2024152902).method449((byte)51) == 446490353 * this.anInt2352) {
               this.method3225(446490353 * this.anInt2352, (byte)44);
               break;
            }
         }
      }

      this.aClass482_2351 = null;
      this.anInt2352 = 335328751;
   }

   public void method3214(int var1, int var2, byte var3) {
      if(this.aBool2340) {
         if(!this.aBool2346 || this.anInt2357 * -1883592735 != var1) {
            if(this.aBool2346 && -1883592735 * this.anInt2357 != var1) {
               Iterator var4 = this.aList2349.iterator();

               while(var4.hasNext()) {
                  Class482 var5 = (Class482)var4.next();
                  if(var5.method5779((byte)27) == Class188.aClass188_2145) {
                     var5.method5807((byte)-27);
                     this.aList2342.remove(var5);
                     this.aBool2346 = false;
                     break;
                  }
               }
            }

            if(0 != var2 && -1 != var1) {
               if(!this.aBool2346 && this.aClass482_2351 != null) {
                  this.aClass482_2351.method5771(37962856);
               }

               Class482 var6 = this.method3232(Class188.aClass188_2145, this, var1, 0, var2, Class187.aClass187_2125.method2723(-1996998589), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, 255, true, (byte)13);
               if(null != var6) {
                  var6.method5769(-2129414551);
                  this.method3204(var6, 1063194323);
                  this.aBool2346 = true;
                  this.anInt2357 = 436984865 * var1;
               }
            }

         }
      }
   }

   public void method3215(Class206 var1, int var2, Class639_Sub1 var3, int var4) {
      if(var1 != null && var1.anIntArrayArray2228 != null && var2 < var1.anIntArrayArray2228.length && null != var1.anIntArrayArray2228[var2]) {
         if(var3.aByte10827 == Class451.localPlayer.aByte10827) {
            if(var3.method9820(1637720264)) {
               int var5 = var1.anIntArrayArray2228[var2][0];
               int var6 = var5 >> 8;
               int var7 = var5 >> 5 & 7;
               int var8 = var5 & 31;
               int var9;
               if(var1.anIntArrayArray2228[var2].length > 1) {
                  var9 = (int)(Math.random() * (double)var1.anIntArrayArray2228[var2].length);
                  if(var9 > 0) {
                     var6 = var1.anIntArrayArray2228[var2][var9];
                  }
               }

               var9 = 256;
               if(var1.anIntArray2242 != null && var1.anIntArray2233 != null) {
                  var9 = (int)(Math.random() * (double)(var1.anIntArray2233[var2] - var1.anIntArray2242[var2])) + var1.anIntArray2242[var2];
               }

               int var10 = null == var1.anIntArray2241?255:var1.anIntArray2241[var2];
               if(var8 == 0) {
                  if(var3 == Class451.localPlayer) {
                     this.method3246(Class188.aClass188_2139, var6, var7, var10, Class187.aClass187_2126.method2723(-1821370384), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, var3.aByte10827, var9, 0, -1403586723);
                  }

               } else {
                  if(var3 == Class451.localPlayer) {
                     if(Class230.preferences.aClass711_Sub29_10605.method10105((byte)78) == 0) {
                        return;
                     }
                  } else if(Class230.preferences.aClass711_Sub29_10653.method10105((byte)86) == 0) {
                     return;
                  }

                  if(var1.anInt2245 * -48889639 != -1) {
                     int var11 = 0;
                     if(var3 instanceof Class639_Sub1_Sub2_Sub1) {
                        var11 = ((Class639_Sub1_Sub2_Sub1)var3).method10795(1082970490);
                     } else if(var3 instanceof Class639_Sub1_Sub2_Sub6) {
                        var11 = ((Class639_Sub1_Sub2_Sub6)var3).method10946(1498876311);
                     } else if(var3 instanceof Class639_Sub1_Sub2_Sub4) {
                        var11 = ((Class639_Sub1_Sub2_Sub4)var3).method10928(242410739);
                     }

                     if(0 != var11 && var11 != Class451.localPlayer.method10795(1082970490) && var11 != client.anInt11000 * -134681015) {
                        var10 = var10 * -48889639 * var1.anInt2245 / 100;
                        if(var10 < 0) {
                           var10 = 0;
                        } else if(var10 > 255) {
                           var10 = 255;
                        }
                     }
                  }

                  Class446 var16 = var3.method7635().aClass446_4816;
                  int var12 = (int)var16.aFloat4917 - 256 >> 9;
                  int var13 = (int)var16.aFloat4919 - 256 >> 9;
                  Class446 var14 = new Class446((float)(var12 << 9), 0.0F, (float)(var13 << 9));
                  int var15 = var3.aByte10827 << 24;
                  this.method3246(Class188.aClass188_2143, var6, var7, var10, Class187.aClass187_2127.method2723(-1810627779), Class451.localPlayer != var3?Class204.aClass204_2217:Class204.aClass204_2219, 0.0F, (float)(var8 << 9), var14, var15, var9, 0, -775960984);
               }
            }
         }
      }
   }

   List method3216(int var1) {
      return this.aList2353;
   }

   public void method3217(byte var1) {
      Class507.method6158((byte)82);
   }

   public void method3218(int var1) {
      if(this.aBool2340) {
         if(var1 >= 0) {
            this.method3226(var1, false, 379411275);
         }
      }
   }

   public void method3219(int var1, int var2) {
      if(!this.aBool2340) {
         this.anInt2350 = var1 * -530356653;
         this.aClass192_2356 = new Class192(var2, 100);
         this.aClass192_2347 = new Class192(10);
         this.aClass192_2356.method2778(new Class198(this), -2007267455);
         Class648 var3 = new Class648(Class357.aClass357_3818);
         Class65.method1074(var3, -1533321299);
         this.method3196(-262519373);
         this.anInt2352 = 335328751;
         this.aBool2340 = true;
      }
   }

   public void method3220() {
      if(this.aBool2340) {
         Class659.method7846((byte)-63);
         if(Class451.localPlayer != null && Class451.localPlayer.method7635() != null) {
            if(this.aClass446_2344 == null) {
               this.aClass446_2344 = new Class446();
            }

            this.aClass446_2344.aFloat4917 = Class451.localPlayer.method7635().aClass446_4816.aFloat4917;
            this.aClass446_2344.aFloat4915 = 0.0F;
            this.aClass446_2344.aFloat4919 = Class451.localPlayer.method7635().aClass446_4816.aFloat4919;
         }

         Iterator var1 = this.aHashMap2343.values().iterator();

         Interface70 var2;
         while(var1.hasNext()) {
            var2 = (Interface70)var1.next();
            var2.method445((byte)-21);
         }

         var1 = this.aHashMap2333.values().iterator();

         while(var1.hasNext()) {
            var2 = (Interface70)var1.next();
            var2.method445((byte)-40);
         }

         var1 = this.aList2353.iterator();

         while(var1.hasNext()) {
            var2 = (Interface70)var1.next();
            if(var2.method465(-1684461563)) {
               this.aHashMap2333.remove(Integer.valueOf(var2.method449((byte)124)));
            } else {
               this.aHashMap2343.remove(Integer.valueOf(var2.method449((byte)90)));
            }
         }

         this.aList2353.clear();
         if(this.aClass482_2354 != null && this.aClass482_2354.method5765(-887775024) == Class478.aClass478_5393 && !this.aBool2355 && client.aClass111_11060.aClass14_1342 != null && Class108.method1349(client.anInt11038 * -558705405, -1728513157)) {
            OutFrameBuffer var9 = Class115.method1414(OutFrame.MUSIC_REQUEST, client.aClass111_11060.aClass14_1342, -721568395);
            var9.out.writeInt(this.aClass482_2354.method5820(-2024152902).method449((byte)113), -357564953);
            client.aClass111_11060.write(var9, (byte)-41);
            this.aBool2355 = true;
         }

         var1 = this.aList2349.iterator();

         while(true) {
            label162:
            while(true) {
               Class478 var3;
               Class482 var10;
               do {
                  if(!var1.hasNext()) {
                     return;
                  }

                  var10 = (Class482)var1.next();
                  var10.method5810(1438083165);
                  var10.method5774((byte)-116);
                  var3 = var10.method5765(-974851200);
               } while(var10.method5775(1449665431) != this);

               if(Class478.aClass478_5395 != var3 && var3 != Class478.aClass478_5396) {
                  if(var10.method5765(-1720010712) != Class478.aClass478_5392 && var10.method5780(1628880000) == Class187.aClass187_2125.method2723(-1852231477)) {
                     boolean var12 = this.method3199(Class187.aClass187_2125.method2723(-1917994442), (byte)63) > 1.0E-4F;
                     if(!var12) {
                        var10.method5770(150, -938617916);
                     }
                  }
               } else if(var10.method5779((byte)51) != Class188.aClass188_2144 && var10.method5779((byte)64) != Class188.aClass188_2145) {
                  Iterator var11 = this.aHashMap2338.keySet().iterator();

                  while(var11.hasNext()) {
                     int var13 = ((Integer)var11.next()).intValue();
                     Class211 var14 = (Class211)this.aHashMap2338.get(Integer.valueOf(var13));
                     if(var14.method2942(16777472).contains(var10)) {
                        var14.method2941(var10, (short)-11085);
                        break;
                     }
                  }

                  var10.method5807((byte)-60);
                  this.aList2342.remove(var10);
               } else if(var10 == this.aClass482_2354) {
                  this.aBool2355 = false;
                  this.aClass482_2354 = null;
                  var10.method5807((byte)-105);
                  this.aList2342.remove(var10);
               } else {
                  int var4 = var10.method5820(-2024152902).method449((byte)111);
                  boolean var5 = this.method3199(Class187.aClass187_2125.method2723(-1873672526), (byte)24) > 0.0F;
                  if(!this.aBool2346 && var5) {
                     if(446490353 * this.anInt2352 == var4) {
                        this.method3225(var4, (byte)5);
                        this.anInt2352 = 335328751;
                     }

                     var10.method5807((byte)-33);
                     this.aList2342.remove(var10);
                  } else if(var4 == -1883592735 * this.anInt2357) {
                     this.anInt2357 = -436984865;
                     this.aBool2346 = false;
                     var10.method5807((byte)-47);
                     this.aList2342.remove(var10);
                     Iterator var6 = this.aList2349.iterator();

                     Class482 var7;
                     int var8;
                     do {
                        do {
                           if(!var6.hasNext()) {
                              continue label162;
                           }

                           var7 = (Class482)var6.next();
                        } while(var7.method5779((byte)14) != Class188.aClass188_2144);

                        var8 = var7.method5820(-2024152902).method449((byte)2);
                     } while((var8 != this.anInt2352 * 446490353 || var7.method5765(-1595312576) != Class478.aClass478_5395) && var7.method5765(-1764399438) != Class478.aClass478_5398 && var7.method5765(-1290543033) != Class478.aClass478_5391 && var7.method5765(-405474327) != Class478.aClass478_5393);

                     if(var7.method5765(-2123423156) == Class478.aClass478_5395) {
                        var7.method5772((byte)-98);
                     } else {
                        var7.method5769(-2132049878);
                     }
                  } else if(var5) {
                     if(!this.aBool2346 || 446490353 * this.anInt2352 != var4) {
                        var10.method5807((byte)-18);
                        this.aList2342.remove(var10);
                     }

                     if(!this.aBool2346 && 446490353 * this.anInt2352 == var4) {
                        this.anInt2352 = 335328751;
                        this.aClass482_2351 = null;
                     }
                  }
               }
            }
         }
      }
   }

   public void method3221() {
      Class507.method6158((byte)73);
   }

   public void method3222() {
      Class507.method6158((byte)47);
   }

   public void method3223() {
      Class507.method6158((byte)102);
   }

   public int method3224(int var1) {
      return this.anInt2352 * 446490353;
   }

   void method3225(int var1, byte var2) {
      if(client.aClass111_11060.aClass14_1342 != null && Class108.method1349(client.anInt11038 * -558705405, -1728513157)) {
         OutFrameBuffer var3 = Class115.method1414(OutFrame.REPLAY_MUSIC, client.aClass111_11060.aClass14_1342, -489140918);
         var3.out.writeInt(var1, -357564953);
         client.aClass111_11060.write(var3, (byte)67);
      }
   }

   Interface70 method3226(int var1, boolean var2, int var3) {
      if(!this.aBool2340) {
         return null;
      } else {
         Interface70 var4 = this.method3202(var1, var2, 1095512628);
         if(null == var4) {
            Class230 var5 = new Class230(this);
            var4 = Class289.method3819(var2?Class107.aClass466_1316:Class72.aClass466_801, var1, var5, var2, this.aClass192_2348, 988475331);
            if(var2) {
               this.aHashMap2333.put(Integer.valueOf(var1), var4);
            } else {
               this.aHashMap2343.put(Integer.valueOf(var1), var4);
            }
         }

         return var4;
      }
   }

   public void method3227(int var1, int var2) {
      this.anInt2359 = var1 * 150552847;
   }

   public void method3228(int var1) {
      Class211 var2 = (Class211)this.aHashMap2338.get(Integer.valueOf(var1));
      if(null != var2) {
         List var3 = var2.method2942(16777472);
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            Class482 var5 = (Class482)var4.next();
            var5.method5805(-122749652);
         }

      }
   }

   public void method3229(int var1) {
      Class211 var2 = (Class211)this.aHashMap2338.get(Integer.valueOf(var1));
      if(var2 != null) {
         List var3 = var2.method2942(16777472);
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            Class482 var5 = (Class482)var4.next();
            if(!var5.method5790(-1061081427)) {
               var5.method5769(-2121316190);
            }
         }

      }
   }

   public void method3230(Class206 var1, int var2, int var3) {
      if(var1 != null && null != var1.anIntArrayArray2228 && var2 < var1.anIntArrayArray2228.length && null != var1.anIntArrayArray2228[var2]) {
         int var4 = var1.anIntArrayArray2228[var2][0];
         int var5 = var4 >> 8;
         int var6 = var4 >> 5 & 7;
         int var7;
         if(var1.anIntArrayArray2228[var2].length > 1) {
            var7 = (int)(Math.random() * (double)var1.anIntArrayArray2228[var2].length);
            if(var7 > 0) {
               var5 = var1.anIntArrayArray2228[var2][var7];
            }
         }

         var7 = 256;
         if(null != var1.anIntArray2242 && var1.anIntArray2233 != null) {
            var7 = (int)((double)var1.anIntArray2242[var2] + Math.random() * (double)(var1.anIntArray2233[var2] - var1.anIntArray2242[var2]));
         }

         int var8 = var1.anIntArray2241 == null?255:var1.anIntArray2241[var2];
         this.method3246(Class188.aClass188_2142, var5, var6, var8, Class187.aClass187_2127.method2723(-1754831062), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, var7, 0, 27945277);
      }
   }

   public void method3231(int var1) {
      Iterator var2 = this.aList2342.iterator();

      while(var2.hasNext()) {
         Class482 var3 = (Class482)var2.next();
         int var4 = var3.method5780(1307138989);
         boolean var5 = Class385.method4747(var4, var1, (byte)46);
         if(var5) {
            var3.method5770(50, -938617916);
         }
      }

   }

   public Class482 method3232(Class188 var1, Object var2, int var3, int var4, int var5, int var6, Class204 var7, float var8, float var9, Class446 var10, int var11, int var12, boolean var13, byte var14) {
      if(!this.aBool2340) {
         return null;
      } else if(null == var2) {
         return null;
      } else {
         var5 = Math.max(0, Math.min(var5, 255));
         var12 = Math.max(0, var12);
         if(var7 != Class204.aClass204_2219 && !this.method3205(this.aClass446_2344, var10, var9, (byte)-15)) {
            return null;
         } else {
            if(var12 <= 0) {
               var12 = 255;
            }

            float var15 = (float)var5 / 255.0F;
            float var16 = (float)var12 / 255.0F;
            Interface70 var17 = this.method3226(var3, var13, 1921140162);
            Class482 var18 = this.method3203(var17, -1440180138);
            if(null == var18) {
               return null;
            } else {
               var18.method5776(var2, 441785167);
               var18.method5781(var6, (byte)0);
               if(Class204.aClass204_2219 != var7) {
                  var18.method5782(true, 2130561295);
                  var18.method5797(var10, (short)4096);
                  var18.method5812(var8, (byte)-83);
                  var18.method5804(var9, (byte)-5);
                  if(var7 == Class204.aClass204_2216) {
                     var18.method5773(this.anInterface56_2360, -1545034109);
                  } else if(Class204.aClass204_2215 == var7) {
                     var18.method5773(this.anInterface56_2362, -1584986233);
                  } else if(var7 == Class204.aClass204_2217) {
                     var18.method5773(this.anInterface56_2345, -644464914);
                  } else if(var7 == Class204.aClass204_2218) {
                     var18.method5773(this.anInterface56_2361, 452252077);
                  } else {
                     var18.method5782(false, -633471483);
                  }
               }

               var18.method5777(var15, 0, -1162662041);
               var18.method5793(var4 > 1 || var4 < 0, var4 > 0?var4 - 1:var4, 1654500190);
               var18.method5794(var16, (byte)46);
               var18.method5778(var1, (byte)-5);
               return var18;
            }
         }
      }
   }

   public int method3233() {
      return this.anInt2359 * 1142525423;
   }

   public void method3234(int var1) {
      Iterator var2 = this.aList2342.iterator();

      while(var2.hasNext()) {
         Class482 var3 = (Class482)var2.next();
         int var4 = var3.method5780(1835685649);
         boolean var5 = Class385.method4747(var4, var1, (byte)-64);
         if(var5) {
            var3.method5770(50, -938617916);
         }
      }

   }

   public void method3235(int var1, int var2) {
      this.method3211(var1, var2, false, 0, 0, 0, 0, 0, 357823558);
   }

   public void method3236(int var1, int var2, int var3) {
      this.method3211(var1, var2, false, 0, 0, 0, 0, 0, 1994504035);
   }

   public void method3237(int var1, int var2) {
      Class211 var3 = (Class211)this.aHashMap2338.get(Integer.valueOf(var1));
      if(null != var3) {
         List var4 = var3.method2942(16777472);
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            Class482 var6 = (Class482)var5.next();
            var6.method5770(50, -938617916);
         }

      }
   }

   public void method3238(int var1) {
      Class211 var2 = (Class211)this.aHashMap2338.get(Integer.valueOf(var1));
      if(null != var2) {
         List var3 = var2.method2942(16777472);
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            Class482 var5 = (Class482)var4.next();
            var5.method5770(50, -938617916);
         }

      }
   }

   public void method3239(int var1, int var2) {
      if(this.aBool2340) {
         if(var1 >= 0) {
            this.method3226(var1, false, 1956375953);
         }
      }
   }

   public void method3240(int var1, int var2) {
      if(446490353 * this.anInt2352 != var1) {
         if(this.aClass482_2354 != null) {
            this.aClass482_2354.method5770(0, -938617916);
            this.method3204(this.aClass482_2354, 1641023328);
            this.aClass482_2354 = null;
         }

         Class482 var3 = this.method3232(Class188.aClass188_2144, this, var1, 0, var2, Class187.aClass187_2125.method2723(-2010851756), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, 255, true, (byte)13);
         if(var3 != null) {
            var3.method5805(-1146704239);
            this.aClass482_2354 = var3;
         }

         this.aBool2355 = false;
      }
   }

   public void method3241(int var1, int var2) {
      if(446490353 * this.anInt2352 != var1) {
         if(this.aClass482_2354 != null) {
            this.aClass482_2354.method5770(0, -938617916);
            this.method3204(this.aClass482_2354, -1242720740);
            this.aClass482_2354 = null;
         }

         Class482 var3 = this.method3232(Class188.aClass188_2144, this, var1, 0, var2, Class187.aClass187_2125.method2723(-1816383588), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, 255, true, (byte)13);
         if(var3 != null) {
            var3.method5805(-436098597);
            this.aClass482_2354 = var3;
         }

         this.aBool2355 = false;
      }
   }

   public int method3242() {
      return this.anInt2352 * 446490353;
   }

   public void method3243(int var1) {
      Iterator var2 = this.aList2342.iterator();

      while(var2.hasNext()) {
         Class482 var3 = (Class482)var2.next();
         int var4 = var3.method5780(1792943795);
         boolean var5 = Class385.method4747(var4, var1, (byte)90);
         if(var5) {
            var3.method5770(50, -938617916);
         }
      }

   }

   public int method3244() {
      return this.anInt2359 * 1142525423;
   }

   public int method3245() {
      return this.anInt2359 * 1142525423;
   }

   public void method3246(Class188 var1, int var2, int var3, int var4, int var5, Class204 var6, float var7, float var8, Class446 var9, int var10, int var11, int var12, int var13) {
      if(this.aBool2340) {
         Class482 var14 = this.method3232(var1, this, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, false, (byte)13);
         if(var14 != null) {
            if(0 == var12) {
               var14.method5769(-2137226035);
            } else {
               var14.method5789(var12, false, 1470675136);
            }

            this.method3204(var14, -455916695);
         }

      }
   }

   void method3247(int var1) {
      if(client.aClass111_11060.aClass14_1342 != null && Class108.method1349(client.anInt11038 * -558705405, -1728513157)) {
         OutFrameBuffer var2 = Class115.method1414(OutFrame.REPLAY_MUSIC, client.aClass111_11060.aClass14_1342, 1145171605);
         var2.out.writeInt(var1, -357564953);
         client.aClass111_11060.write(var2, (byte)38);
      }
   }

   void method3248() {
      Class194 var1 = new Class194(this);
      Class209 var2 = new Class209(this);
      Class217 var3 = new Class217(this);
      Class226 var4 = new Class226(this);
      Class229 var5 = new Class229(this);
      IncomingFrame.method4980(Class197.aClass197_2193.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 0.2F, var1, (byte)1);
      IncomingFrame.method4980(Class197.aClass197_2197.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 1.0F, var2, (byte)1);
      IncomingFrame.method4980(Class197.aClass197_2195.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 1.0F, var3, (byte)1);
      IncomingFrame.method4980(Class197.aClass197_2196.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 0.8F, var4, (byte)1);
      IncomingFrame.method4980(Class197.aClass197_2198.method2836(-1681327621), Class197.aClass197_2194.method2836(-1681327621), 1.0F, var5, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2125.method2723(-1989410064), Class197.aClass197_2197.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2131.method2723(-1783199652), Class197.aClass197_2198.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2124.method2723(-1990408109), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2126.method2723(-1855326207), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2127.method2723(-1802578669), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2133.method2723(-1966988672), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2129.method2723(-1930723275), Class197.aClass197_2193.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2130.method2723(-2111959543), Class197.aClass197_2196.method2836(-1681327621), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2132.method2723(-2006452442), Class187.aClass187_2130.method2723(-1757726814), 1.0F, (Interface40)null, (byte)1);
      IncomingFrame.method4980(Class187.aClass187_2123.method2723(-2136898577), Class187.aClass187_2130.method2723(-1752949601), 1.0F, (Interface40)null, (byte)1);
      Class625.method7450(Class187.aClass187_2125.method2723(-1809822349), (byte)-34).method4694(0.75F, (byte)-2);
   }

   Class482 method3249(int var1) {
      Iterator var2 = this.aList2342.iterator();

      Class482 var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (Class482)var2.next();
      } while(var3.method5779((byte)68) != Class188.aClass188_2144 || var3.method5765(-1708699052) != Class478.aClass478_5394);

      return var3;
   }

   public void method3250() {
      Iterator var1 = this.aList2342.iterator();

      while(var1.hasNext()) {
         Class482 var2 = (Class482)var1.next();
         if(var2.method5779((byte)18) == Class188.aClass188_2144) {
            var2.method5770(500, -938617916);
            if(var2.method5820(-2024152902).method449((byte)35) == 446490353 * this.anInt2352) {
               this.method3225(446490353 * this.anInt2352, (byte)114);
               break;
            }
         }
      }

      this.aClass482_2351 = null;
      this.anInt2352 = 335328751;
   }

   public int method3251(int var1) {
      return this.anInt2359 * 1142525423;
   }

   public void method3252() {
      Iterator var1 = this.aList2342.iterator();

      while(var1.hasNext()) {
         Class482 var2 = (Class482)var1.next();
         if(var2.method5779((byte)92) == Class188.aClass188_2144) {
            var2.method5770(500, -938617916);
            if(var2.method5820(-2024152902).method449((byte)45) == 446490353 * this.anInt2352) {
               this.method3225(446490353 * this.anInt2352, (byte)47);
               break;
            }
         }
      }

      this.aClass482_2351 = null;
      this.anInt2352 = 335328751;
   }

   static final void method3253(InterfaceDef var0, Class681 var1, int var2) {
      int var3 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285] - 1;
      int var5 = var4;
      if(6 != var0.modelType * 619744185 && 2 != 619744185 * var0.modelType) {
         throw new RuntimeException("");
      } else {
         NPCDef var6 = (NPCDef)Class76.loader.method89(var0.anInt2539 * 561507777, -1351368127);
         if(null == var0.aClass294_2677) {
            var0.aClass294_2677 = new Class294(var6, 619744185 * var0.modelType == 6);
         }

         var0.aClass294_2677.aLong3183 = Class102.method1290(908498662) * 4070890070923293839L;
         if(var6.aByteArray3366 != null) {
            if(var4 < 0 || var4 >= var6.aByteArray3366.length) {
               throw new RuntimeException("");
            }

            var5 = var6.aByteArray3366[var4];
         }

         if(null != var6.replacementTextures && var5 >= 0 && var5 < var6.replacementTextures.length) {
            var0.aClass294_2677.aShortArray3182[var5] = (short)var3;
            Class526_Sub31.method9555(var0, (byte)10);
         } else {
            throw new RuntimeException("");
         }
      }
   }

   static final void method3254(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((NPC)var0.aClass639_Sub1_Sub2_Sub1_8635).def.anInt3304 * 430699907;
   }

   static void method3255(InterfaceDef var0, Class162 var1, int var2, int var3, int var4, int var5, Class153 var6, double var7, Class286 var9, Class267 var10, int var11) {
      if(var6 != null) {
         int var12;
         if(-265840483 * Class327.anInt3488 == 2) {
            var12 = (int)((double)Class195.aClass292_Sub1_2182.method3919(1832226064) * 2607.5945876176133D) + -502966983 * client.anInt11076 & 16383;
         } else if(6 == -265840483 * Class327.anInt3488) {
            var12 = (int)client.aFloat11105 & 16383;
         } else {
            var12 = (int)client.aFloat11105 + -502966983 * client.anInt11076 & 16383;
         }

         int var13 = Math.max(-99858407 * var0.anInt2510 / 2, var0.anInt2576 * -667181623 / 2) + 10;
         int var14 = var4 * var4 + var5 * var5;
         if(var14 <= var13 * var13) {
            int var15 = Class443.anIntArray4895[var12];
            int var16 = Class443.anIntArray4896[var12];
            if(6 != Class327.anInt3488 * -265840483) {
               var15 = 256 * var15 / (256 + client.anInt11097 * 1163477879);
               var16 = var16 * 256 / (256 + client.anInt11097 * 1163477879);
            }

            int var17 = var4 * var16 + var5 * var15 >> 14;
            int var18 = var5 * var16 - var4 * var15 >> 14;
            double var19 = var7 / 100.0D;
            switch(var9.anInt3099 * 1811490829) {
            case 0:
               var2 = var17 + -99858407 * var0.anInt2510 / 2 + var2;
               break;
            case 1:
               var2 = -99858407 * var0.anInt2510 / 2 + var2 + var17 - (int)((double)var6.method21() * var19);
               break;
            case 2:
               var2 = var2 + var0.anInt2510 * -99858407 / 2 + var17 - (int)((double)(var6.method21() / 2) * var19);
            }

            switch(var10.anInt2986 * -1795749709) {
            case 0:
               var3 = var0.anInt2576 * -667181623 / 2 + var3 - var18 - (int)((double)var6.method1788() * var19);
               break;
            case 1:
               var3 = -667181623 * var0.anInt2576 / 2 + var3 - var18;
               break;
            case 2:
               var3 = var3 + -667181623 * var0.anInt2576 / 2 - var18 - (int)((double)(var6.method1788() / 2) * var19);
            }

            if(null != var1) {
               if(1.0D == var19) {
                  var6.method1779(var2, var3, var1, var2, var3);
               } else {
                  var6.method1772(var2, var3, (int)((double)var6.method21() * var19), (int)((double)var6.method1788() * var19));
               }
            } else {
               if(1.0D == var19) {
                  var6.method1778(var2, var3);
               }

               var6.method1772(var2, var3, (int)((double)var6.method21() * var19), (int)((double)var6.method1788() * var19));
            }

         }
      }
   }

   static void method3256(int var0, String var1, byte var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(3, (long)var0);
      var3.method10584(230428369);
      var3.aString11690 = var1;
   }

   static int method3257(CharSequence var0, int var1, boolean var2, byte var3) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if(var8 == 0) {
               if(45 == var9) {
                  var4 = true;
                  continue;
               }

               if(var9 == 43 && var2) {
                  continue;
               }
            }

            int var11;
            if(var9 >= 48 && var9 <= 57) {
               var11 = var9 - 48;
            } else if(var9 >= 65 && var9 <= 90) {
               var11 = var9 - 55;
            } else {
               if(var9 < 97 || var9 > 122) {
                  throw new NumberFormatException();
               }

               var11 = var9 - 87;
            }

            if(var11 >= var1) {
               throw new NumberFormatException();
            }

            if(var4) {
               var11 = -var11;
            }

            int var10 = var11 + var6 * var1;
            if(var10 / var1 != var6) {
               throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
         }

         if(!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
