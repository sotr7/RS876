package com.jagex;

import com.jagex.Class115;
import com.jagex.Class184_Sub2;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class272;
import com.jagex.Class304_Sub1;
import com.jagex.Class315_Sub1;
import com.jagex.Class325_Sub3;
import com.jagex.Class361_Sub1;
import com.jagex.Class375;
import com.jagex.OutFrame;
import com.jagex.Class474;
import com.jagex.Class479;
import com.jagex.OutFrameBuffer;
import com.jagex.Class554;
import com.jagex.Class57;
import com.jagex.Class583;
import com.jagex.Class681;
import com.jagex.Class700;
import com.jagex.Class93;
import com.jagex.client;
import java.util.HashMap;
import java.util.Iterator;

class Class551 implements Runnable {
   // $FF: synthetic field
   Class361_Sub1 this$0;

   public void run() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10272) {
               HashMap var1 = this.this$0.method9236(721130963);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(10L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5694((byte)112);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)38);
            var6.printStackTrace();
         }

         return;
      }
   }

   Class551(Class361_Sub1 var1) {
      this.this$0 = var1;
   }

   public void method6641() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10272) {
               HashMap var1 = this.this$0.method9236(897394727);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(10L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5694((byte)67);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)103);
            var6.printStackTrace();
         }

         return;
      }
   }

   public void method6642() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10272) {
               HashMap var1 = this.this$0.method9236(-1894356313);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(10L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5694((byte)56);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)46);
            var6.printStackTrace();
         }

         return;
      }
   }

   static void method6643(long[] var0, int[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         long var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var9 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var9;
         int var10 = Long.MAX_VALUE == var7?0:1;

         for(int var11 = var2; var11 < var3; ++var11) {
            if(var0[var11] < var7 + (long)(var11 & var10)) {
               long var12 = var0[var11];
               var0[var11] = var0[var6];
               var0[var6] = var12;
               int var14 = var1[var11];
               var1[var11] = var1[var6];
               var1[var6++] = var14;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var9;
         method6643(var0, var1, var2, var6 - 1, -673109357);
         method6643(var0, var1, var6 + 1, var3, 1556918908);
      }

   }

   static final void method6644(Class681 var0, byte var1) {
      Class700 var2 = Class93.method1217(-346367561);
      String var3 = Class184_Sub2.method8478(398242335);
      if(null == var3) {
         var3 = "";
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.getId();
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3;
   }

   static final void method6645(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4184, client.aClass111_11060.aClass14_1342, -876567687);
      var3.out.writeByte(var2.length() + 1, -1134351903);
      var3.out.method9616(var2, -1159612390);
      client.aClass111_11060.write(var3, (byte)76);
   }

   static final void method6646(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-74);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class583.method6978(var3, var4, var0, 961520947);
   }

   public static void method6647(int var0, int var1, int var2, boolean var3, int var4) {
      client.aLong11151 = 0L;
      int var5 = Class57.method1014(-1517924666);
      if(var0 == 3 || 3 == var5) {
         var3 = true;
      }

      if(!Class554.aClass174_7475.method2238()) {
         var3 = true;
      }

      Class325_Sub3.method9131(var5, var0, var1, var2, var3, 178600896);
   }

   static final void method6648(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)29);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class272.method3608(var3, var4, var0, (short)255);
   }
}
