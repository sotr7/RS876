package com.jagex;

import com.jagex.Class187;
import com.jagex.Class188;
import com.jagex.Class204;
import com.jagex.Class225;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class273;
import com.jagex.Class375;
import com.jagex.Class380;
import com.jagex.Class380_Sub2;
import com.jagex.Class446;
import com.jagex.Class526_Sub21_Sub15_Sub1;
import com.jagex.RSByteBuffer;
import com.jagex.Class534;
import com.jagex.Class564;
import com.jagex.Class570;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class696;

public class Class451 implements Runnable {
   public static Class639_Sub1_Sub2_Sub1_Sub1 localPlayer;
   int anInt4934 = 0;
   Class696 aClass696_4932 = new Class696();
   boolean aBool4933 = false;
   Thread aThread4931 = new Thread(this);

   Class526_Sub21_Sub15_Sub1 method5345(int var1, Class564 var2, int var3) {
      Class526_Sub21_Sub15_Sub1 var4 = new Class526_Sub21_Sub15_Sub1();
      var4.anInt12084 = -2020610303;
      Class696 var5 = this.aClass696_4932;
      synchronized(var5) {
         Class526_Sub21_Sub15_Sub1 var6 = (Class526_Sub21_Sub15_Sub1)this.aClass696_4932.method8143((byte)-1);

         while(true) {
            if(null == var6) {
               break;
            }

            if((long)var1 == 2384869564219888641L * var6.cachedKey && var2 == var6.aClass564_12085 && 2 == var6.anInt12084 * -1970204415) {
               var4.aByteArray12086 = var6.aByteArray12086;
               var4.waiting = false;
               return var4;
            }

            var6 = (Class526_Sub21_Sub15_Sub1)this.aClass696_4932.method8139(68831625);
         }
      }

      var4.aByteArray12086 = var2.method6785(var1, (byte)-78);
      var4.waiting = false;
      var4.aBool11829 = true;
      return var4;
   }

   public void run() {
      while(!this.aBool4933) {
         Class696 var1 = this.aClass696_4932;
         Class526_Sub21_Sub15_Sub1 var2;
         synchronized(var1) {
            var2 = (Class526_Sub21_Sub15_Sub1)this.aClass696_4932.poll(1412975846);
            if(null == var2) {
               try {
                  this.aClass696_4932.wait();
               } catch (InterruptedException var6) {
                  ;
               }
               continue;
            }

            this.anInt4934 -= 1609932439;
         }

         try {
            if(2 == -1970204415 * var2.anInt12084) {
               var2.aClass564_12085.method6786((int)(var2.cachedKey * 2384869564219888641L), var2.aByteArray12086, var2.aByteArray12086.length, (byte)5);
            } else if(3 == -1970204415 * var2.anInt12084) {
               var2.aByteArray12086 = var2.aClass564_12085.method6785((int)(2384869564219888641L * var2.cachedKey), (byte)-43);
            }
         } catch (Exception var5) {
            Class375.method4671((String)null, var5, (byte)99);
         }

         var2.waiting = false;
      }

   }

   Class526_Sub21_Sub15_Sub1 method5346(int var1, Class564 var2, byte var3) {
      Class526_Sub21_Sub15_Sub1 var4 = new Class526_Sub21_Sub15_Sub1();
      var4.anInt12084 = -1766863613;
      var4.cachedKey = (long)var1 * -6405544204082582527L;
      var4.aClass564_12085 = var2;
      var4.aBool11829 = false;
      this.method5347(var4, (byte)3);
      return var4;
   }

   void method5347(Class526_Sub21_Sub15_Sub1 var1, byte var2) {
      Class696 var3 = this.aClass696_4932;
      synchronized(var3) {
         this.aClass696_4932.offer(var1, (byte)-50);
         this.anInt4934 += 1609932439;
         this.aClass696_4932.notifyAll();
      }
   }

   public Class451() {
      this.aThread4931.setDaemon(true);
      this.aThread4931.start();
      this.aThread4931.setPriority(1);
   }

   public int method5348(byte var1) {
      Class696 var2 = this.aClass696_4932;
      synchronized(var2) {
         return this.anInt4934 * -658259673;
      }
   }

   public void method5349(byte var1) {
      this.aBool4933 = true;
      Class696 var2 = this.aClass696_4932;
      synchronized(var2) {
         this.aClass696_4932.notifyAll();
      }

      try {
         this.aThread4931.join();
      } catch (InterruptedException var4) {
         ;
      }

      this.aThread4931 = null;
   }

   public void method5350() {
      while(!this.aBool4933) {
         Class696 var1 = this.aClass696_4932;
         Class526_Sub21_Sub15_Sub1 var2;
         synchronized(var1) {
            var2 = (Class526_Sub21_Sub15_Sub1)this.aClass696_4932.poll(1390327185);
            if(null == var2) {
               try {
                  this.aClass696_4932.wait();
               } catch (InterruptedException var6) {
                  ;
               }
               continue;
            }

            this.anInt4934 -= 1609932439;
         }

         try {
            if(2 == -1970204415 * var2.anInt12084) {
               var2.aClass564_12085.method6786((int)(var2.cachedKey * 2384869564219888641L), var2.aByteArray12086, var2.aByteArray12086.length, (byte)46);
            } else if(3 == -1970204415 * var2.anInt12084) {
               var2.aByteArray12086 = var2.aClass564_12085.method6785((int)(2384869564219888641L * var2.cachedKey), (byte)-19);
            }
         } catch (Exception var5) {
            Class375.method4671((String)null, var5, (byte)110);
         }

         var2.waiting = false;
      }

   }

   public void method5351() {
      this.aBool4933 = true;
      Class696 var1 = this.aClass696_4932;
      synchronized(var1) {
         this.aClass696_4932.notifyAll();
      }

      try {
         this.aThread4931.join();
      } catch (InterruptedException var3) {
         ;
      }

      this.aThread4931 = null;
   }

   Class526_Sub21_Sub15_Sub1 method5352(int var1, byte[] var2, Class564 var3, byte var4) {
      Class526_Sub21_Sub15_Sub1 var5 = new Class526_Sub21_Sub15_Sub1();
      var5.anInt12084 = 253746690;
      var5.cachedKey = -6405544204082582527L * (long)var1;
      var5.aByteArray12086 = var2;
      var5.aClass564_12085 = var3;
      var5.aBool11829 = false;
      this.method5347(var5, (byte)-99);
      return var5;
   }

   public int method5353() {
      Class696 var1 = this.aClass696_4932;
      synchronized(var1) {
         return this.anInt4934 * -658259673;
      }
   }

   public int method5354() {
      Class696 var1 = this.aClass696_4932;
      synchronized(var1) {
         return this.anInt4934 * -658259673;
      }
   }

   public void method5355() {
      while(!this.aBool4933) {
         Class696 var1 = this.aClass696_4932;
         Class526_Sub21_Sub15_Sub1 var2;
         synchronized(var1) {
            var2 = (Class526_Sub21_Sub15_Sub1)this.aClass696_4932.poll(1419696977);
            if(null == var2) {
               try {
                  this.aClass696_4932.wait();
               } catch (InterruptedException var6) {
                  ;
               }
               continue;
            }

            this.anInt4934 -= 1609932439;
         }

         try {
            if(2 == -1970204415 * var2.anInt12084) {
               var2.aClass564_12085.method6786((int)(var2.cachedKey * 2384869564219888641L), var2.aByteArray12086, var2.aByteArray12086.length, (byte)32);
            } else if(3 == -1970204415 * var2.anInt12084) {
               var2.aByteArray12086 = var2.aClass564_12085.method6785((int)(2384869564219888641L * var2.cachedKey), (byte)-63);
            }
         } catch (Exception var5) {
            Class375.method4671((String)null, var5, (byte)36);
         }

         var2.waiting = false;
      }

   }

   static final void method5356(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class534.method6400(var3, var4, var0, 1582277363);
   }

   static final void method5357(Class681 var0, int var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      int var5 = var0.anIntArray8622[3 + var0.anInt8623 * -1730576285];
      short var6 = 256;
      Class570.aClass231_7657.method3246(Class188.aClass188_2135, var2, var3, var5, Class187.aClass187_2124.method2723(-1909662660), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, var6, var4, -1603508560);
   }

   static void method5358(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class273.method3610((byte)19);
   }

   public static Class380 method5359(RSByteBuffer var0, int var1) {
      Class380 var2 = Class225.method3157(var0, -1361309039);
      int var3 = var0.readInt((byte)5);
      int var4 = var0.readInt((byte)5);
      int var5 = var0.readBigSmart((byte)25);
      return new Class380_Sub2(var2.aClass384_3932, var2.aClass389_3929, 1035562863 * var2.anInt3930, var2.anInt3931 * 26479163, var2.anInt3936 * -219376461, var2.anInt3933 * 874500417, -1403557073 * var2.anInt3934, var2.anInt3935 * 2079046623, 252950473 * var2.anInt3928, var3, var4, var5);
   }
}
