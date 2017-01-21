package com.jagex;

import com.jagex.Class1;
import com.jagex.Class113;
import com.jagex.Class144;
import com.jagex.Class163;
import com.jagex.Class174;
import com.jagex.Class181;
import com.jagex.Class196;
import com.jagex.Class206;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class260;
import com.jagex.Class28;
import com.jagex.Class315_Sub1;
import com.jagex.Class342;
import com.jagex.Class376;
import com.jagex.Class389;
import com.jagex.PacketFrameDecoder;
import com.jagex.Class40_Sub11;
import com.jagex.Class418;
import com.jagex.Class425;
import com.jagex.Class45;
import com.jagex.Class493;
import com.jagex.Class52;
import com.jagex.Class522;
import com.jagex.Class526_Sub8;
import com.jagex.Class554;
import com.jagex.Connection;
import com.jagex.Class580;
import com.jagex.Class59_Sub1;
import com.jagex.Class602;
import com.jagex.Class607;
import com.jagex.Class620;
import com.jagex.Class627;
import com.jagex.Class642;
import com.jagex.Class658;
import com.jagex.Class663;
import com.jagex.Class68;
import com.jagex.Class681;
import com.jagex.Class70;
import com.jagex.Class72;
import com.jagex.Class74;
import com.jagex.RuntimeException_Sub1;
import com.jagex.WeakReference_Sub1;
import com.jagex.client;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class76 {
   public static Class40_Sub11 loader;
   public static Class59_Sub1 aClass59_Sub1_813;
   int anInt810;
   ReferenceQueue aReferenceQueue811 = new ReferenceQueue();
   WeakReference_Sub1[] aWeakReference_Sub1Array809 = new WeakReference_Sub1[16];

   public void method1119(Object var1, byte var2) {
      if(null == var1) {
         throw new NullPointerException();
      } else {
         this.method1123(926919852);
         int var3 = System.identityHashCode(var1);
         int var4 = var3 & this.aWeakReference_Sub1Array809.length - 1;
         WeakReference_Sub1 var5 = this.aWeakReference_Sub1Array809[var4];
         if(null != var5) {
            if(var5.get() == var1) {
               this.aWeakReference_Sub1Array809[var4] = var5.aWeakReference_Sub1_11885;
               this.anInt810 -= 438401139;
            } else {
               while(true) {
                  WeakReference_Sub1 var6 = var5.aWeakReference_Sub1_11885;
                  if(null == var6) {
                     break;
                  }

                  if(var6.get() == var1) {
                     var5.aWeakReference_Sub1_11885 = var6.aWeakReference_Sub1_11885;
                     this.anInt810 -= 438401139;
                     break;
                  }

                  var5 = var6;
               }
            }

         }
      }
   }

   public void method1120(Object var1, Object var2, int var3) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.method1123(926919852);
         int var4 = System.identityHashCode(var1);
         int var5 = var4 & this.aWeakReference_Sub1Array809.length - 1;
         WeakReference_Sub1 var6 = this.aWeakReference_Sub1Array809[var5];
         if(null == var6) {
            this.aWeakReference_Sub1Array809[var5] = new WeakReference_Sub1(var1, this.aReferenceQueue811, var4, var2);
            this.anInt810 += 438401139;
            if(this.anInt810 * 1571941563 >= this.aWeakReference_Sub1Array809.length) {
               this.method1127(-1958526541);
            }
         } else {
            while(var6.get() != var1) {
               if(var6.aWeakReference_Sub1_11885 == null) {
                  var6.aWeakReference_Sub1_11885 = new WeakReference_Sub1(var1, this.aReferenceQueue811, var4, var2);
                  this.anInt810 += 438401139;
                  if(this.anInt810 * 1571941563 >= this.aWeakReference_Sub1Array809.length) {
                     this.method1127(83935993);
                  }
                  break;
               }

               var6 = var6.aWeakReference_Sub1_11885;
            }
         }

      }
   }

   public ArrayList method1121(byte var1) {
      this.method1123(926919852);
      ArrayList var2 = new ArrayList(this.anInt810 * 1571941563);
      WeakReference_Sub1[] var3 = this.aWeakReference_Sub1Array809;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         for(WeakReference_Sub1 var5 = var3[var4]; var5 != null; var5 = var5.aWeakReference_Sub1_11885) {
            Object var6 = var5.get();
            if(var6 != null) {
               var2.add(var6);
            }
         }
      }

      return var2;
   }

   void method1122() {
      while(true) {
         WeakReference_Sub1 var1 = (WeakReference_Sub1)this.aReferenceQueue811.poll();
         if(var1 == null) {
            return;
         }

         int var2 = 1402679065 * var1.anInt11886 & this.aWeakReference_Sub1Array809.length - 1;
         WeakReference_Sub1 var3 = this.aWeakReference_Sub1Array809[var2];
         if(var3 == var1) {
            this.aWeakReference_Sub1Array809[var2] = var1.aWeakReference_Sub1_11885;
            this.anInt810 -= 438401139;
         } else {
            while(null != var3 && var1 != var3.aWeakReference_Sub1_11885) {
               var3 = var3.aWeakReference_Sub1_11885;
            }

            if(var3 != null) {
               var3.aWeakReference_Sub1_11885 = var1.aWeakReference_Sub1_11885;
               this.anInt810 -= 438401139;
            }
         }
      }
   }

   void method1123(int var1) {
      while(true) {
         WeakReference_Sub1 var2 = (WeakReference_Sub1)this.aReferenceQueue811.poll();
         if(var2 == null) {
            return;
         }

         int var3 = 1402679065 * var2.anInt11886 & this.aWeakReference_Sub1Array809.length - 1;
         WeakReference_Sub1 var4 = this.aWeakReference_Sub1Array809[var3];
         if(var4 == var2) {
            this.aWeakReference_Sub1Array809[var3] = var2.aWeakReference_Sub1_11885;
            this.anInt810 -= 438401139;
         } else {
            while(null != var4 && var2 != var4.aWeakReference_Sub1_11885) {
               var4 = var4.aWeakReference_Sub1_11885;
            }

            if(var4 != null) {
               var4.aWeakReference_Sub1_11885 = var2.aWeakReference_Sub1_11885;
               this.anInt810 -= 438401139;
            }
         }
      }
   }

   void method1124() {
      WeakReference_Sub1[] var1 = this.aWeakReference_Sub1Array809;
      this.aWeakReference_Sub1Array809 = new WeakReference_Sub1[var1.length * 2];
      WeakReference_Sub1[] var2 = var1;

      WeakReference_Sub1 var5;
      for(int var3 = 0; var3 < var2.length; ++var3) {
         for(WeakReference_Sub1 var4 = var2[var3]; var4 != null; var4 = var5) {
            var5 = var4.aWeakReference_Sub1_11885;
            int var6 = 1402679065 * var4.anInt11886 & this.aWeakReference_Sub1Array809.length - 1;
            var4.aWeakReference_Sub1_11885 = this.aWeakReference_Sub1Array809[var6];
            this.aWeakReference_Sub1Array809[var6] = var4;
         }
      }

   }

   void method1125() {
      WeakReference_Sub1[] var1 = this.aWeakReference_Sub1Array809;
      this.aWeakReference_Sub1Array809 = new WeakReference_Sub1[var1.length * 2];
      WeakReference_Sub1[] var2 = var1;

      WeakReference_Sub1 var5;
      for(int var3 = 0; var3 < var2.length; ++var3) {
         for(WeakReference_Sub1 var4 = var2[var3]; var4 != null; var4 = var5) {
            var5 = var4.aWeakReference_Sub1_11885;
            int var6 = 1402679065 * var4.anInt11886 & this.aWeakReference_Sub1Array809.length - 1;
            var4.aWeakReference_Sub1_11885 = this.aWeakReference_Sub1Array809[var6];
            this.aWeakReference_Sub1Array809[var6] = var4;
         }
      }

   }

   void method1126() {
      WeakReference_Sub1[] var1 = this.aWeakReference_Sub1Array809;
      this.aWeakReference_Sub1Array809 = new WeakReference_Sub1[var1.length * 2];
      WeakReference_Sub1[] var2 = var1;

      WeakReference_Sub1 var5;
      for(int var3 = 0; var3 < var2.length; ++var3) {
         for(WeakReference_Sub1 var4 = var2[var3]; var4 != null; var4 = var5) {
            var5 = var4.aWeakReference_Sub1_11885;
            int var6 = 1402679065 * var4.anInt11886 & this.aWeakReference_Sub1Array809.length - 1;
            var4.aWeakReference_Sub1_11885 = this.aWeakReference_Sub1Array809[var6];
            this.aWeakReference_Sub1Array809[var6] = var4;
         }
      }

   }

   void method1127(int var1) {
      WeakReference_Sub1[] var2 = this.aWeakReference_Sub1Array809;
      this.aWeakReference_Sub1Array809 = new WeakReference_Sub1[var2.length * 2];
      WeakReference_Sub1[] var3 = var2;

      WeakReference_Sub1 var6;
      for(int var4 = 0; var4 < var3.length; ++var4) {
         for(WeakReference_Sub1 var5 = var3[var4]; var5 != null; var5 = var6) {
            var6 = var5.aWeakReference_Sub1_11885;
            int var7 = 1402679065 * var5.anInt11886 & this.aWeakReference_Sub1Array809.length - 1;
            var5.aWeakReference_Sub1_11885 = this.aWeakReference_Sub1Array809[var7];
            this.aWeakReference_Sub1Array809[var7] = var5;
         }
      }

   }

   public static void method1128(int var0, String var1, boolean var2, byte var3) {
      if(var0 == 0) {
         Class554.aClass174_7475 = Class72.method1104(0, Class425.aCanvas4798, Class658.aClass169_8508, Class580.anInterface24_7751, Class376.aClass400_3913, Class196.aClass395_2191, Class206.aClass396_2246, Class342.aClass466_3560, Class230.preferences.aClass711_Sub33_10645.method10135((byte)120) * 2, (byte)-23);
         if(var1 != null) {
            Class554.aClass174_7475.method2283(1, 0);
            Class1 var4 = Class260.method3525(Class642.aClass466_8429, 828252213 * Class28.anInt253, 0, Class627.aClass418_8195, (byte)1);
            Class163 var5 = Class554.aClass174_7475.method2313(var4, Class181.method2681(Class113.aClass466_1370, Class28.anInt253 * 828252213, 0), true);
            Class74.method1112(-483537135);
            Class52.method965(var1, true, Class554.aClass174_7475, var5, var4, (byte)0);
         }
      } else {
         Class174 var27 = null;
         if(null != var1) {
            var27 = Class72.method1104(0, Class425.aCanvas4798, Class658.aClass169_8508, Class580.anInterface24_7751, Class376.aClass400_3913, Class196.aClass395_2191, Class206.aClass396_2246, Class342.aClass466_3560, 0, (byte)-57);
            var27.method2283(1, 0);
            Class1 var28 = Class493.method5894(Class642.aClass466_8429, 828252213 * Class28.anInt253, 0, (short)-22988);
            Class163 var6 = var27.method2313(var28, Class181.method2681(Class113.aClass466_1370, 828252213 * Class28.anInt253, 0), true);
            Class74.method1112(1575561376);
            Class52.method965(var1, true, var27, var6, var28, (byte)-113);

            try {
               var27.method2232(1135751733);
               var27 = null;
            } catch (Throwable var24) {
               ;
            }
         }

         boolean var18 = false;

         try {
            try {
               var18 = true;
               Class70.method1095((short)623);
               System.gc();
               Class554.aClass174_7475 = Class72.method1104(var0, Class425.aCanvas4798, Class658.aClass169_8508, Class580.anInterface24_7751, Class376.aClass400_3913, Class196.aClass395_2191, Class206.aClass396_2246, Class342.aClass466_3560, Class230.preferences.aClass711_Sub33_10645.method10135((byte)97) * 2, (byte)-72);
               Class627.aClass418_8195 = new Class418(Class554.aClass174_7475, Class113.aClass466_1370, Class642.aClass466_8429, Class144.method1671(-1204410494));
               if(Class554.aClass174_7475.method2236()) {
                  boolean var29 = true;

                  try {
                     var29 = -1274232769 * Class663.aClass526_Sub40_8522.anInt10774 > 256;
                  } catch (Throwable var23) {
                     ;
                  }

                  Class526_Sub8 var31;
                  if(var29) {
                     var31 = Class554.aClass174_7475.method2304(146800640);
                  } else {
                     var31 = Class554.aClass174_7475.method2304(104857600);
                  }

                  Class554.aClass174_7475.method2305(var31);
               }
            } catch (Throwable var25) {
               switch(var0) {
               case 1:
                  PacketFrameDecoder.method4792(Class68.aClass68_780, -2114724603);
                  break;
               case 3:
                  PacketFrameDecoder.method4792(Class68.aClass68_771, -2034200314);
               }

               if(var25 instanceof RuntimeException_Sub1) {
                  Class230.preferences.aClass711_Sub33_10608.method8315(0, -1436243515);
                  Class230.preferences.aClass711_Sub33_10645.method8315(0, 1804679309);
               }

               int var30 = Class230.preferences.aClass711_Sub19_10633.method10022((byte)-5);
               Class230.preferences.method9602(Class230.preferences.aClass711_Sub19_10633, 0, (short)-4107);
               if(null != var27) {
                  try {
                     var27.method2232(1135751733);
                     var27 = null;
                  } catch (Throwable var21) {
                     ;
                  }
               }

               Class70.method1095((short)623);
               System.gc();
               method1128(var30, var1, var2, (byte)81);
               if(var27 != null) {
                  try {
                     var27.method2232(1135751733);
                  } catch (Throwable var20) {
                     ;
                  }
               }

               return;
            }

            if(var27 != null) {
               try {
                  var27.method2232(1135751733);
                  var18 = false;
               } catch (Throwable var22) {
                  var18 = false;
               }
            } else {
               var18 = false;
            }
         } finally {
            if(var18) {
               if(var27 != null) {
                  try {
                     var27.method2232(1135751733);
                  } catch (Throwable var19) {
                     ;
                  }
               }

            }
         }
      }

      if(var2) {
         Class230.preferences.method9593(Class230.preferences.aClass711_Sub19_10633, !var2, 876168763);
      }

      Class230.preferences.method9602(Class230.preferences.aClass711_Sub19_10633, var0, (short)-11574);
      if(!var2) {
         Class230.preferences.method9593(Class230.preferences.aClass711_Sub19_10633, !var2, -1753623467);
      }

      Class389.method4772((byte)40);
      Class554.aClass174_7475.method2320(20000);
      Class554.aClass174_7475.method2332(32);
      client.aClass505_11204.method6093(692410995);
      if(Class554.aClass174_7475.method2240()) {
         Class620.method7349(Class230.preferences.aClass711_Sub26_10611.method10079(-1978742657) == 1, 5176765);
      }

      client.aClass505_11204.method6076(true, 476850461);
      client.aClass505_11204.method6100((byte)-21).method7377((byte)0);
      Class607.method7148((byte)39);
      client.aBool11013 = false;
      client.aBool11014 = false;
      client.aBool11104 = true;
      Connection.aClass708Array7545 = null;
      Class554.aClass174_7475.method2497(0.0F, 1.0F);
   }

   static final void method1129(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub39_10617, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-1483);
      Class522.method6257(-1042127423);
   }

   static final void method1130(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-4);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class602.method7096(var3, var4, var0, Class258.aClass258_2824, 1340751157);
   }

   static final void method1131(Class681 var0, int var1) {
      Class45.method926(-2032243199);
   }
}
