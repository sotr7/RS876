package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class246;
import com.jagex.Class315_Sub1;
import com.jagex.Class443;
import com.jagex.Class448_Sub1;
import com.jagex.Class451;
import com.jagex.Class453;
import com.jagex.Class459;
import com.jagex.Class460;
import com.jagex.Class469;
import com.jagex.PaddedResourceRequest;
import com.jagex.Class526_Sub21_Sub15_Sub3;
import com.jagex.RSByteBuffer;
import com.jagex.Class545;
import com.jagex.Class564;
import com.jagex.Class570;
import com.jagex.Class655;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class691;
import com.jagex.Class694;
import com.jagex.twitchtv.TwitchWebcamDevice;
import java.math.BigInteger;

public class Class429 {
   Class526_Sub21_Sub15_Sub3 aClass526_Sub21_Sub15_Sub3_4813;
   Class459 aClass459_4811;
   boolean aBool4809 = false;
   PaddedResourceRequest aClass526_Sub21_Sub15_Sub2_4810;
   Class459 aClass459_4812;
   Class448_Sub1[] aClass448_Sub1Array4815;
   Class460 aClass460_4814;
   Class453 aClass453_4806;
   Class451 aClass451_4807;
   BigInteger aBigInteger4808;
   BigInteger aBigInteger4805;

   public void method5039() {
      if(this.aClass448_Sub1Array4815 != null) {
         int var1;
         for(var1 = 0; var1 < this.aClass448_Sub1Array4815.length; ++var1) {
            if(this.aClass448_Sub1Array4815[var1] != null) {
               this.aClass448_Sub1Array4815[var1].method9199((byte)-95);
            }
         }

         for(var1 = 0; var1 < this.aClass448_Sub1Array4815.length; ++var1) {
            if(this.aClass448_Sub1Array4815[var1] != null) {
               this.aClass448_Sub1Array4815[var1].method9197(1879837183);
            }
         }

         if(null == this.aClass459_4812) {
            this.method5040(-1515228778);
         } else if(this.aClass453_4806 != null && !this.aBool4809) {
            if(null == this.aClass526_Sub21_Sub15_Sub3_4813) {
               this.aClass526_Sub21_Sub15_Sub3_4813 = this.aClass453_4806.method5376((byte)27);
            } else if(!this.aClass526_Sub21_Sub15_Sub3_4813.waiting) {
               byte[] var5 = this.aClass526_Sub21_Sub15_Sub3_4813.method10704(-366175704);

               try {
                  this.aClass459_4811 = new Class459(new RSByteBuffer(var5), this.aBigInteger4808, this.aBigInteger4805);

                  for(int var2 = 0; var2 < this.aClass448_Sub1Array4815.length; ++var2) {
                     if(this.aClass448_Sub1Array4815[var2] != null && this.aClass448_Sub1Array4815[var2].method9203(-49274007)) {
                        Class469 var6 = this.aClass459_4811.aClass469Array5171[var2];
                        this.aClass448_Sub1Array4815[var2].method9195(this.aClass448_Sub1Array4815[var2].method9194(-588386867 * var6.anInt5348, var6.aByteArray5349, var6.anInt5346 * -222582121, var6.anInt5347 * -1470399799, -1171776340), (byte)-14);
                     }
                  }
               } catch (Exception var4) {
                  for(int var3 = 0; var3 < this.aClass448_Sub1Array4815.length; ++var3) {
                     if(this.aClass448_Sub1Array4815[var3] != null && this.aClass448_Sub1Array4815[var3].method9203(-49274007)) {
                        this.aClass448_Sub1Array4815[var3].method9195(false, (byte)-114);
                     }
                  }
               }

               this.aClass526_Sub21_Sub15_Sub3_4813 = null;
               this.aBool4809 = true;
            }
         }

      }
   }

   public boolean method5040(int var1) {
      if(this.aClass459_4812 != null) {
         return true;
      } else {
         if(this.aClass526_Sub21_Sub15_Sub2_4810 == null) {
            if(this.aClass460_4814.method5428(-1871382260)) {
               return false;
            }

            this.aClass526_Sub21_Sub15_Sub2_4810 = this.aClass460_4814.method5445(255, 255, (byte)0, true, -1963943817);
         }

         if(this.aClass526_Sub21_Sub15_Sub2_4810.waiting) {
            return false;
         } else {
            RSByteBuffer var2 = new RSByteBuffer(this.aClass526_Sub21_Sub15_Sub2_4810.method10704(-897374106));
            this.aClass459_4812 = new Class459(var2, this.aBigInteger4808, this.aBigInteger4805);
            if(this.aClass448_Sub1Array4815 == null) {
               this.aClass448_Sub1Array4815 = new Class448_Sub1[this.aClass459_4812.aClass469Array5171.length];
            } else {
               for(int var3 = 0; var3 < this.aClass448_Sub1Array4815.length; ++var3) {
                  if(null != this.aClass448_Sub1Array4815[var3]) {
                     Class469 var4 = this.aClass459_4812.aClass469Array5171[var3];
                     this.aClass448_Sub1Array4815[var3].method9193(var4.anInt5348 * -588386867, var4.aByteArray5349, var4.anInt5346 * -222582121, var4.anInt5347 * -1470399799, 802660808);
                     if(this.aClass448_Sub1Array4815[var3].method9203(-49274007)) {
                        this.aClass448_Sub1Array4815[var3].method9195(false, (byte)-52);
                     }
                  }
               }
            }

            this.aBool4809 = false;
            return true;
         }
      }
   }

   public void method5041(byte var1) {
      if(this.aClass448_Sub1Array4815 != null) {
         int var2;
         for(var2 = 0; var2 < this.aClass448_Sub1Array4815.length; ++var2) {
            if(this.aClass448_Sub1Array4815[var2] != null) {
               this.aClass448_Sub1Array4815[var2].method9199((byte)-14);
            }
         }

         for(var2 = 0; var2 < this.aClass448_Sub1Array4815.length; ++var2) {
            if(this.aClass448_Sub1Array4815[var2] != null) {
               this.aClass448_Sub1Array4815[var2].method9197(-1547375273);
            }
         }

         if(null == this.aClass459_4812) {
            this.method5040(-1518188388);
         } else if(this.aClass453_4806 != null && !this.aBool4809) {
            if(null == this.aClass526_Sub21_Sub15_Sub3_4813) {
               this.aClass526_Sub21_Sub15_Sub3_4813 = this.aClass453_4806.method5376((byte)30);
            } else if(!this.aClass526_Sub21_Sub15_Sub3_4813.waiting) {
               byte[] var6 = this.aClass526_Sub21_Sub15_Sub3_4813.method10704(-1374521854);

               try {
                  this.aClass459_4811 = new Class459(new RSByteBuffer(var6), this.aBigInteger4808, this.aBigInteger4805);

                  for(int var3 = 0; var3 < this.aClass448_Sub1Array4815.length; ++var3) {
                     if(this.aClass448_Sub1Array4815[var3] != null && this.aClass448_Sub1Array4815[var3].method9203(-49274007)) {
                        Class469 var7 = this.aClass459_4811.aClass469Array5171[var3];
                        this.aClass448_Sub1Array4815[var3].method9195(this.aClass448_Sub1Array4815[var3].method9194(-588386867 * var7.anInt5348, var7.aByteArray5349, var7.anInt5346 * -222582121, var7.anInt5347 * -1470399799, 811285826), (byte)-106);
                     }
                  }
               } catch (Exception var5) {
                  for(int var4 = 0; var4 < this.aClass448_Sub1Array4815.length; ++var4) {
                     if(this.aClass448_Sub1Array4815[var4] != null && this.aClass448_Sub1Array4815[var4].method9203(-49274007)) {
                        this.aClass448_Sub1Array4815[var4].method9195(false, (byte)-78);
                     }
                  }
               }

               this.aClass526_Sub21_Sub15_Sub3_4813 = null;
               this.aBool4809 = true;
            }
         }

      }
   }

   public Class448_Sub1 method5042(int var1, Class564 var2, Class564 var3, boolean var4, int var5) {
      return this.method5044(var1, var2, var3, true, var4, (byte)1);
   }

   public boolean method5043() {
      if(this.aClass459_4812 != null) {
         return true;
      } else {
         if(this.aClass526_Sub21_Sub15_Sub2_4810 == null) {
            if(this.aClass460_4814.method5428(-1871382260)) {
               return false;
            }

            this.aClass526_Sub21_Sub15_Sub2_4810 = this.aClass460_4814.method5445(255, 255, (byte)0, true, -1325828976);
         }

         if(this.aClass526_Sub21_Sub15_Sub2_4810.waiting) {
            return false;
         } else {
            RSByteBuffer var1 = new RSByteBuffer(this.aClass526_Sub21_Sub15_Sub2_4810.method10704(1714151351));
            this.aClass459_4812 = new Class459(var1, this.aBigInteger4808, this.aBigInteger4805);
            if(this.aClass448_Sub1Array4815 == null) {
               this.aClass448_Sub1Array4815 = new Class448_Sub1[this.aClass459_4812.aClass469Array5171.length];
            } else {
               for(int var2 = 0; var2 < this.aClass448_Sub1Array4815.length; ++var2) {
                  if(null != this.aClass448_Sub1Array4815[var2]) {
                     Class469 var3 = this.aClass459_4812.aClass469Array5171[var2];
                     this.aClass448_Sub1Array4815[var2].method9193(var3.anInt5348 * -588386867, var3.aByteArray5349, var3.anInt5346 * -222582121, var3.anInt5347 * -1470399799, 802660808);
                     if(this.aClass448_Sub1Array4815[var2].method9203(-49274007)) {
                        this.aClass448_Sub1Array4815[var2].method9195(false, (byte)-109);
                     }
                  }
               }
            }

            this.aBool4809 = false;
            return true;
         }
      }
   }

   Class448_Sub1 method5044(int var1, Class564 var2, Class564 var3, boolean var4, boolean var5, byte var6) {
      if(null == this.aClass459_4812) {
         throw new RuntimeException();
      } else if(var1 >= 0 && var1 < this.aClass448_Sub1Array4815.length) {
         if(this.aClass448_Sub1Array4815[var1] != null) {
            return this.aClass448_Sub1Array4815[var1];
         } else {
            Class469 var7 = this.aClass459_4812.aClass469Array5171[var1];
            Class448_Sub1 var8 = new Class448_Sub1(var1, var2, var3, this.aClass460_4814, var5?this.aClass453_4806:null, this.aClass451_4807, var7.anInt5348 * -588386867, var7.aByteArray5349, var7.anInt5346 * -222582121, var4, var7.anInt5347 * -1470399799);
            this.aClass448_Sub1Array4815[var1] = var8;
            if(null != this.aClass459_4811 && var5) {
               Class469 var9 = this.aClass459_4811.aClass469Array5171[var1];
               this.aClass448_Sub1Array4815[var1].method9195(this.aClass448_Sub1Array4815[var1].method9194(var9.anInt5348 * -588386867, var9.aByteArray5349, var9.anInt5346 * -222582121, -1470399799 * var9.anInt5347, 1721900098), (byte)-117);
            }

            return var8;
         }
      } else {
         throw new RuntimeException();
      }
   }

   public Class429(Class460 var1, Class453 var2, Class451 var3, BigInteger var4, BigInteger var5) {
      this.aClass460_4814 = var1;
      this.aClass453_4806 = var2;
      this.aClass451_4807 = var3;
      this.aBigInteger4808 = var4;
      this.aBigInteger4805 = var5;
      if(!this.aClass460_4814.method5428(-1871382260)) {
         this.aClass526_Sub21_Sub15_Sub2_4810 = this.aClass460_4814.method5445(255, 255, (byte)0, true, -1714519006);
      }

      if(null != this.aClass453_4806) {
         this.aClass526_Sub21_Sub15_Sub3_4813 = this.aClass453_4806.method5376((byte)124);
      }

   }

   public boolean method5045() {
      if(this.aClass459_4812 != null) {
         return true;
      } else {
         if(this.aClass526_Sub21_Sub15_Sub2_4810 == null) {
            if(this.aClass460_4814.method5428(-1871382260)) {
               return false;
            }

            this.aClass526_Sub21_Sub15_Sub2_4810 = this.aClass460_4814.method5445(255, 255, (byte)0, true, -124191037);
         }

         if(this.aClass526_Sub21_Sub15_Sub2_4810.waiting) {
            return false;
         } else {
            RSByteBuffer var1 = new RSByteBuffer(this.aClass526_Sub21_Sub15_Sub2_4810.method10704(2131998502));
            this.aClass459_4812 = new Class459(var1, this.aBigInteger4808, this.aBigInteger4805);
            if(this.aClass448_Sub1Array4815 == null) {
               this.aClass448_Sub1Array4815 = new Class448_Sub1[this.aClass459_4812.aClass469Array5171.length];
            } else {
               for(int var2 = 0; var2 < this.aClass448_Sub1Array4815.length; ++var2) {
                  if(null != this.aClass448_Sub1Array4815[var2]) {
                     Class469 var3 = this.aClass459_4812.aClass469Array5171[var2];
                     this.aClass448_Sub1Array4815[var2].method9193(var3.anInt5348 * -588386867, var3.aByteArray5349, var3.anInt5346 * -222582121, var3.anInt5347 * -1470399799, 802660808);
                     if(this.aClass448_Sub1Array4815[var2].method9203(-49274007)) {
                        this.aClass448_Sub1Array4815[var2].method9195(false, (byte)-78);
                     }
                  }
               }
            }

            this.aBool4809 = false;
            return true;
         }
      }
   }

   public void method5046() {
      if(this.aClass448_Sub1Array4815 != null) {
         int var1;
         for(var1 = 0; var1 < this.aClass448_Sub1Array4815.length; ++var1) {
            if(this.aClass448_Sub1Array4815[var1] != null) {
               this.aClass448_Sub1Array4815[var1].method9199((byte)-123);
            }
         }

         for(var1 = 0; var1 < this.aClass448_Sub1Array4815.length; ++var1) {
            if(this.aClass448_Sub1Array4815[var1] != null) {
               this.aClass448_Sub1Array4815[var1].method9197(-646890231);
            }
         }

         if(null == this.aClass459_4812) {
            this.method5040(-1169829053);
         } else if(this.aClass453_4806 != null && !this.aBool4809) {
            if(null == this.aClass526_Sub21_Sub15_Sub3_4813) {
               this.aClass526_Sub21_Sub15_Sub3_4813 = this.aClass453_4806.method5376((byte)88);
            } else if(!this.aClass526_Sub21_Sub15_Sub3_4813.waiting) {
               byte[] var5 = this.aClass526_Sub21_Sub15_Sub3_4813.method10704(1122921972);

               try {
                  this.aClass459_4811 = new Class459(new RSByteBuffer(var5), this.aBigInteger4808, this.aBigInteger4805);

                  for(int var2 = 0; var2 < this.aClass448_Sub1Array4815.length; ++var2) {
                     if(this.aClass448_Sub1Array4815[var2] != null && this.aClass448_Sub1Array4815[var2].method9203(-49274007)) {
                        Class469 var6 = this.aClass459_4811.aClass469Array5171[var2];
                        this.aClass448_Sub1Array4815[var2].method9195(this.aClass448_Sub1Array4815[var2].method9194(-588386867 * var6.anInt5348, var6.aByteArray5349, var6.anInt5346 * -222582121, var6.anInt5347 * -1470399799, -514769872), (byte)-66);
                     }
                  }
               } catch (Exception var4) {
                  for(int var3 = 0; var3 < this.aClass448_Sub1Array4815.length; ++var3) {
                     if(this.aClass448_Sub1Array4815[var3] != null && this.aClass448_Sub1Array4815[var3].method9203(-49274007)) {
                        this.aClass448_Sub1Array4815[var3].method9195(false, (byte)-103);
                     }
                  }
               }

               this.aClass526_Sub21_Sub15_Sub3_4813 = null;
               this.aBool4809 = true;
            }
         }

      }
   }

   public void method5047() {
      if(this.aClass448_Sub1Array4815 != null) {
         int var1;
         for(var1 = 0; var1 < this.aClass448_Sub1Array4815.length; ++var1) {
            if(this.aClass448_Sub1Array4815[var1] != null) {
               this.aClass448_Sub1Array4815[var1].method9199((byte)-99);
            }
         }

         for(var1 = 0; var1 < this.aClass448_Sub1Array4815.length; ++var1) {
            if(this.aClass448_Sub1Array4815[var1] != null) {
               this.aClass448_Sub1Array4815[var1].method9197(-844775561);
            }
         }

         if(null == this.aClass459_4812) {
            this.method5040(1852567050);
         } else if(this.aClass453_4806 != null && !this.aBool4809) {
            if(null == this.aClass526_Sub21_Sub15_Sub3_4813) {
               this.aClass526_Sub21_Sub15_Sub3_4813 = this.aClass453_4806.method5376((byte)13);
            } else if(!this.aClass526_Sub21_Sub15_Sub3_4813.waiting) {
               byte[] var5 = this.aClass526_Sub21_Sub15_Sub3_4813.method10704(951263587);

               try {
                  this.aClass459_4811 = new Class459(new RSByteBuffer(var5), this.aBigInteger4808, this.aBigInteger4805);

                  for(int var2 = 0; var2 < this.aClass448_Sub1Array4815.length; ++var2) {
                     if(this.aClass448_Sub1Array4815[var2] != null && this.aClass448_Sub1Array4815[var2].method9203(-49274007)) {
                        Class469 var6 = this.aClass459_4811.aClass469Array5171[var2];
                        this.aClass448_Sub1Array4815[var2].method9195(this.aClass448_Sub1Array4815[var2].method9194(-588386867 * var6.anInt5348, var6.aByteArray5349, var6.anInt5346 * -222582121, var6.anInt5347 * -1470399799, -385261886), (byte)-112);
                     }
                  }
               } catch (Exception var4) {
                  for(int var3 = 0; var3 < this.aClass448_Sub1Array4815.length; ++var3) {
                     if(this.aClass448_Sub1Array4815[var3] != null && this.aClass448_Sub1Array4815[var3].method9203(-49274007)) {
                        this.aClass448_Sub1Array4815[var3].method9195(false, (byte)-22);
                     }
                  }
               }

               this.aClass526_Sub21_Sub15_Sub3_4813 = null;
               this.aBool4809 = true;
            }
         }

      }
   }

   static final int method5048(int var0, int var1, int var2, int var3, int var4) {
      int var5 = 65536 - Class443.anIntArray4896[8192 * var2 / var3] >> 1;
      return (var5 * var1 >> 16) + ((65536 - var5) * var0 >> 16);
   }

   public static TwitchWebcamDevice method5049(String var0, int var1) {
      if(Class570.aTwitchWebcamDeviceArray7653 == null) {
         return null;
      } else {
         for(int var2 = 0; var2 < Class570.aTwitchWebcamDeviceArray7653.length; ++var2) {
            if(Class570.aTwitchWebcamDeviceArray7653[var2].aString1135.equals(var0)) {
               return Class570.aTwitchWebcamDeviceArray7653[var2];
            }
         }

         return null;
      }
   }

   static final void method5050(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-23);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class655.method7833(var3, var4, var0, 1934131013);
   }

   static final void method5051(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      int[] var3 = Class694.method8113(var2, 2115863352);
      Class691.method8099(var3, 0, var0.anIntArray8622, var0.anInt8623 * -1730576285, 3);
      var0.anInt8623 += -1578695711;
   }

   static final void method5052(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.modelType = 1239433014;
      var0.aClass294_2677 = null;
      var0.anInt2539 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 1664688705;
      if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
         Class545.method6515(var0.uid * 919258769, (byte)6);
      }

   }

   static final void method5053(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class246.method3390(var3, var4, var0, 1987207124);
   }

   static final void method5054(Class681 var0, int var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var0.aClass348_8633.aString3624;
   }
}
