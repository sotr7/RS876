package com.jagex;

import com.jagex.Class10;
import com.jagex.Class223;
import com.jagex.Class304_Sub1;
import com.jagex.Class361_Sub1;
import com.jagex.Class375;
import com.jagex.Class474;
import com.jagex.Class479;
import com.jagex.Class561;
import com.jagex.Class610;
import com.jagex.Class681;
import com.jagex.Class83;
import com.jagex.client;
import java.util.HashMap;
import java.util.Iterator;

class Class566 implements Runnable {
   public static Class223 aClass223_7610;
   public static int anInt7611;
   // $FF: synthetic field
   Class361_Sub1 this$0;

   public void run() {
      label54:
      while(true) {
         try {
            if(!this.this$0.aBool10272) {
               Iterator var1 = this.this$0.aList10275.iterator();

               while(var1.hasNext()) {
                  Class561 var2 = (Class561)var1.next();
                  var2.method6744(270187031);
               }

               HashMap var7 = this.this$0.method9236(1223245803);
               Iterator var8 = var7.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var8.hasNext()) {
                        var8 = this.this$0.aList10275.iterator();

                        while(var8.hasNext()) {
                           Class561 var9 = (Class561)var8.next();
                           var9.method6751(-1212325693);
                        }

                        Class304_Sub1.method9089(6L);
                        continue label54;
                     }

                     var3 = (Class474)var8.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var7.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5697(1741076115);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)50);
            var6.printStackTrace();
         }

         return;
      }
   }

   Class566(Class361_Sub1 var1) {
      this.this$0 = var1;
   }

   public void method6803() {
      label54:
      while(true) {
         try {
            if(!this.this$0.aBool10272) {
               Iterator var1 = this.this$0.aList10275.iterator();

               while(var1.hasNext()) {
                  Class561 var2 = (Class561)var1.next();
                  var2.method6744(934190096);
               }

               HashMap var7 = this.this$0.method9236(-1885323289);
               Iterator var8 = var7.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var8.hasNext()) {
                        var8 = this.this$0.aList10275.iterator();

                        while(var8.hasNext()) {
                           Class561 var9 = (Class561)var8.next();
                           var9.method6751(-2139669969);
                        }

                        Class304_Sub1.method9089(6L);
                        continue label54;
                     }

                     var3 = (Class474)var8.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var7.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5697(1741076115);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)76);
            var6.printStackTrace();
         }

         return;
      }
   }

   public void method6804() {
      label54:
      while(true) {
         try {
            if(!this.this$0.aBool10272) {
               Iterator var1 = this.this$0.aList10275.iterator();

               while(var1.hasNext()) {
                  Class561 var2 = (Class561)var1.next();
                  var2.method6744(1405468315);
               }

               HashMap var7 = this.this$0.method9236(-327114770);
               Iterator var8 = var7.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var8.hasNext()) {
                        var8 = this.this$0.aList10275.iterator();

                        while(var8.hasNext()) {
                           Class561 var9 = (Class561)var8.next();
                           var9.method6751(-2053469871);
                        }

                        Class304_Sub1.method9089(6L);
                        continue label54;
                     }

                     var3 = (Class474)var8.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var7.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5697(1741076115);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)13);
            var6.printStackTrace();
         }

         return;
      }
   }

   static final void method6805(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(client.anInt11288 * 2029719417 == 2 && var2 < client.anInt11130 * -17244221) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 878965703 * client.aClass50Array11290[var2].anInt657;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method6806(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method6807(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class83 var4 = (Class83)Class10.aClass40_Sub20_62.method89(var3, -1243162388);
      if(var4.method1167(177663840)) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class610)client.aClass505_11204.method6066(-631188979).method89(var2, -1499613859)).method7189(var3, var4.aString842, (byte)10);
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class610)client.aClass505_11204.method6066(-631188979).method89(var2, 23051565)).method7171(var3, var4.anInt843 * 1040538721, 1040694255);
      }

   }
}
