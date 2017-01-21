package com.jagex;

import com.jagex.Class114;
import com.jagex.Class153;
import com.jagex.Class242;
import com.jagex.Class28;
import com.jagex.Class304;
import com.jagex.Class304_Sub1;
import com.jagex.Class318_Sub2;
import com.jagex.Class325_Sub2;
import com.jagex.Class361_Sub2;
import com.jagex.Class375;
import com.jagex.Class397;
import com.jagex.Class417;
import com.jagex.Class418;
import com.jagex.IncomingFrame;
import com.jagex.Class474;
import com.jagex.Class479;
import com.jagex.Class525_Sub1;
import com.jagex.Class526;
import com.jagex.Class526_Sub2;
import com.jagex.Class531_Sub1;
import com.jagex.Class566;
import com.jagex.Class593;
import com.jagex.Class603;
import com.jagex.NPCDirection;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class688;
import com.jagex.client;
import java.util.HashMap;
import java.util.Iterator;

class Class158 implements Runnable {
   // $FF: synthetic field
   Class361_Sub2 this$0;

   public void method1867() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10284) {
               HashMap var1 = this.this$0.method9242(-1492910780);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(50L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5697(1741076115);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)18);
         }

         return;
      }
   }

   Class158(Class361_Sub2 var1) {
      this.this$0 = var1;
   }

   public void method1868() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10284) {
               HashMap var1 = this.this$0.method9242(-1492910780);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(50L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5697(1741076115);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)114);
         }

         return;
      }
   }

   public void run() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10284) {
               HashMap var1 = this.this$0.method9242(-1492910780);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(50L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5697(1741076115);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)48);
         }

         return;
      }
   }

   static final void method1869(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      boolean var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623] == 1;
      if(null != Class525_Sub1.aClass20_10724) {
         Class526 var4 = Class525_Sub1.aClass20_10724.get((long)var2);
         if(var4 != null && !var3) {
            var4.method6332(-1949449864);
         } else if(var4 == null && var3) {
            var4 = new Class526();
            Class525_Sub1.aClass20_10724.put(var4, (long)var2);
         }
      }

   }

   public static Class688[] method1870(int var0) {
      return new Class688[]{Class688.aClass688_8688, Class688.aClass688_8681, Class688.aClass688_8684, Class688.aClass688_8687, Class688.aClass688_8683, Class688.aClass688_8680, Class688.aClass688_8685, Class688.aClass688_8686, Class688.aClass688_8682};
   }

   static final void method1871(int var0, int var1, int var2, int var3, int var4) {
      int var5 = -2026883889 * client.anInt11133;
      int var6 = 202903831 * client.anInt11224;
      Class153 var7;
      if(-1392152109 * client.anInt11136 == 1) {
         var7 = Class28.aClass153Array258[537289409 * client.anInt11135 / 100];
         var7.method1778(var5 - 8, var6 - 8);
      }

      if(2 == -1392152109 * client.anInt11136) {
         var7 = Class28.aClass153Array258[537289409 * client.anInt11135 / 100 + 4];
         var7.method1778(var5 - 8, var6 - 8);
      }

   }

   static final void method1872(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = NPCDirection.method7981((char)var2, 1293404676)?1:0;
   }

   static void method1873(int var0, boolean var1, int var2) {
      Class526_Sub2 var3 = Class531_Sub1.method9301(var0, var1, 1600182034);
      if(null != var3) {
         var3.method6332(-1949449864);
      }
   }

   static final void method1874(int var0) {
      Class684.method8044((byte)-50);
      client.aClass505_11204.method6073(-1760285645);

      int var1;
      for(var1 = 0; var1 < client.aClass113Array11018.length; ++var1) {
         client.aClass113Array11018[var1] = null;
      }

      for(var1 = 0; var1 < client.aClass536Array11019.length; ++var1) {
         client.aClass536Array11019[var1] = null;
      }

      IncomingFrame.method4982(1858585629);

      for(var1 = 0; var1 < 2048; ++var1) {
         client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1] = null;
      }

      client.npcCount = 0;
      client.npcs.method647(929030154);
      client.anInt11051 = 0;
      client.aClass20_11259.method647(929030154);
      Class418.method4974(Class397.method4824((byte)1), (byte)37);
      client.anInt11062 = 0;
      Class242.aClass94_2456.aClass600_1154.method7081((byte)-118);
      Class325_Sub2.aClass348_10028 = null;
      Class603.aClass348_7890 = null;
      Class673.aClass526_Sub9_8581 = null;
      Class318_Sub2.aClass526_Sub9_10065 = null;
      Class566.aClass223_7610 = null;
      client.aBool11302 = true;
      Class593.aClass657_7820 = null;
      Class417.aLong4507 = 0L;
      Class114.method1400(-1479767376);
      Class304.method4018(1335196901);
   }
}
