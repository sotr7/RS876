package com.jagex;

import com.jagex.Class192;
import com.jagex.Class239;
import com.jagex.Class244;
import com.jagex.Class249;
import com.jagex.Class250;
import com.jagex.Class254;
import com.jagex.Class257;
import com.jagex.Class375;
import com.jagex.Class376;
import com.jagex.Class388;
import com.jagex.Class390;
import com.jagex.Class452;
import com.jagex.RSByteBuffer;
import com.jagex.Interface39;
import com.jagex.Interface48;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class248 implements Interface39 {
   Class376 aClass376_2697;
   Interface48 anInterface48_2695;
   int anInt2700;
   Class388 aClass388_2691;
   Class375 aClass375_2699;
   int anInt2747;
   int anInt2701;
   int anInt2735;
   int anInt2692;
   int anInt2693;
   int anInt2694;
   int anInt2745;
   int anInt2705;
   boolean aBool2732;
   int anInt2737;
   Class239[] aClass239Array2716;
   Class254[] aClass254Array2707;
   Class257[] aClass257Array2704;
   Class244[] aClass244Array2709;
   Class239 aClass239_2717;
   Class239 aClass239_2718;
   Class239 aClass239_2719;
   int[] anIntArray2723;
   Class239 aClass239_2690;
   Class239 aClass239_2721;
   Class239 aClass239_2722;
   int[] anIntArray2724;
   boolean[] aBoolArray2710;
   int[] anIntArray2711;
   Class239[] aClass239Array2749;
   Class239[] aClass239Array2712;
   int anInt2748;
   int anInt2714;
   boolean[] aBoolArray2734;
   boolean aBool2725;
   int anInt2728;
   int anInt2729;
   RSByteBuffer aClass526_Sub36_2727;
   int anInt2733;
   boolean aBool2731;
   int anInt2740;
   int anInt2741;
   int anInt2743;
   boolean aBool2751;
   int anInt2715;
   int anInt2702;
   int anInt2742;
   int anInt2706;
   int anInt2736;
   int anInt2730;
   int anInt2738;
   boolean aBool2698;
   List aList2726 = new ArrayList();
   List aList2744;
   List aList2739;
   List aList2720;
   List aList2696;
   AtomicReference anAtomicReference2746;
   int anInt2708;
   boolean[] aBoolArray2757;
   boolean[] aBoolArray2758;
   boolean[] aBoolArray2759;
   float aFloat2703;
   int anInt2756;
   int anInt2755;
   boolean aBool2750;
   Class249[] aClass249Array2713;
   byte[] aByteArray2754;
   static List aList2752 = new ArrayList();
   static Class192 aClass192_2753 = new Class192(524288, 1024);

   public void method303(boolean var1) {
      if(!var1) {
         this.method298();
      } else if(this.method293() == Class376.aClass376_3910) {
         this.method3410(true);
         this.method3401(Class376.aClass376_3905);
      }

   }

   public int method318(int var1) {
      return var1 / (this.method296().anInt4060 * 1260438277 / 8);
   }

   public void method298() {
      if(this.method293() != Class376.aClass376_3907) {
         this.method3410(false);
         this.method3401(Class376.aClass376_3908);
      } else {
         this.method3410(false);
         this.method3401(Class376.aClass376_3911);
      }

   }

   public Class376 method293() {
      return this.aClass376_2697;
   }

   void method3401(Class376 var1) {
      this.aClass376_2697 = var1;
   }

   public void method328(Interface48 var1) {
      this.anInterface48_2695 = var1;
   }

   public void method68(RSByteBuffer var1) {
      if(this.method293() != Class376.aClass376_3909 && this.method293() != Class376.aClass376_3910) {
         if(var1 != null) {
            this.method3417(var1);
         } else {
            boolean var2 = this.aBool2698 && (this.anInt2742 > 0 && this.anInt2743 < this.anInt2742 || this.anInt2742 < 0);
            if(this.aList2739.isEmpty()) {
               if(!var2) {
                  this.method3435();
                  this.method3401(Class376.aClass376_3910);
               }
            } else if(!var2) {
               this.method3435();
               this.method3401(Class376.aClass376_3909);
            }

            if(var2) {
               this.method3410(true);
            }

         }
      } else {
         if(var1 != null) {
            var1.method9675(-1909994213);
         }

      }
   }

   public void method295() {
      if(this.method293() == Class376.aClass376_3911 || this.method293() == Class376.aClass376_3908 || this.method293() == Class376.aClass376_3905) {
         this.method3401(Class376.aClass376_3907);
         this.method3434();
      }
   }

   public int method9() {
      return this.method3427();
   }

   public int method301(int var1) {
      return var1 / (this.method296().anInt4060 * 1260438277 / 8);
   }

   public void method327(RSByteBuffer var1) {
      if(this.method293() != Class376.aClass376_3909 && this.method293() != Class376.aClass376_3910) {
         if(var1 != null) {
            this.method3417(var1);
         } else {
            boolean var2 = this.aBool2698 && (this.anInt2742 > 0 && this.anInt2743 < this.anInt2742 || this.anInt2742 < 0);
            if(this.aList2739.isEmpty()) {
               if(!var2) {
                  this.method3435();
                  this.method3401(Class376.aClass376_3910);
               }
            } else if(!var2) {
               this.method3435();
               this.method3401(Class376.aClass376_3909);
            }

            if(var2) {
               this.method3410(true);
            }

         }
      } else {
         if(var1 != null) {
            var1.method9675(-755676483);
         }

      }
   }

   int method3402() {
      if(this.method326()) {
         return this.anInt2735;
      } else {
         throw new RuntimeException("");
      }
   }

   public Class388 method296() {
      return this.aClass388_2691;
   }

   public void method307(int var1, Class388 var2, Class375 var3, int var4) {
      this.anInt2700 = var4;
      if(this.method3403(var1, var2, var3)) {
         this.aClass388_2691 = var2;
         this.aClass375_2699 = var3;
      } else {
         throw new RuntimeException("");
      }
   }

   boolean method3403(int var1, Class388 var2, Class375 var3) {
      return var2 == Class388.aClass388_4057?true:(var2 == Class388.aClass388_4059?true:(var2 == Class388.aClass388_4062?true:var2 == Class388.aClass388_4058));
   }

   void method3404(byte[] var1, int var2) {
      this.anInt2747 = 0;
      if(!this.method326()) {
         if(var1 == null) {
            throw new RuntimeException("");
         } else {
            byte var3 = 0;
            if(this.method3414(var1, var2, 1)) {
               var3 = 1;
            } else if(this.method3414(var1, var2, 3)) {
               var3 = 3;
            } else {
               if(!this.method3414(var1, var2, 5)) {
                  throw new RuntimeException("" + var3);
               }

               var3 = 5;
            }

            int var4;
            int var5;
            if(var3 == 1) {
               this.method3424(var1, var2 + 7);
               var4 = this.method3418(32);
               this.anInt2701 = this.method3418(8);
               this.anInt2735 = this.method3418(32);
               this.anInt2692 = this.method3418(32);
               this.anInt2693 = this.method3418(32);
               this.anInt2694 = this.method3418(32);
               this.anInt2745 = 1 << this.method3418(4);
               this.anInt2705 = 1 << this.method3418(4);
               var5 = 1 << this.method3418(1);
               if(var4 != 0 || var5 == 0) {
                  throw new RuntimeException("");
               }

               this.aBool2732 = true;
               ++this.anInt2737;
            } else if(var3 != 3 && var3 == 5) {
               if(!this.method3414(var1, var2, 5)) {
                  throw new RuntimeException("");
               }

               this.method3424(var1, var2 + 7);
               if(this.aClass239Array2716 != null) {
                  this.method3409(this.aClass239Array2716);
                  this.aClass239Array2716 = null;
               }

               this.aClass239Array2716 = this.method3406(this.anInt2701, this.anInt2705);

               int var6;
               int var7;
               int var8;
               for(var4 = 0; var4 < 2; ++var4) {
                  var5 = var4 != 0?this.anInt2705:this.anInt2745;
                  var6 = var5 >> 1;
                  var7 = var5 >> 2;
                  var8 = var5 >> 3;
                  Class239 var9 = this.method3407(var6);

                  for(int var10 = 0; var10 < var7; ++var10) {
                     var9.aFloatArray2446[2 * var10] = (float)Math.cos((double)(4 * var10) * 3.141592653589793D / (double)var5);
                     var9.aFloatArray2446[2 * var10 + 1] = -((float)Math.sin((double)(4 * var10) * 3.141592653589793D / (double)var5));
                  }

                  Class239 var15 = this.method3407(var6);

                  for(int var11 = 0; var11 < var7; ++var11) {
                     var15.aFloatArray2446[2 * var11] = (float)Math.cos((double)(2 * var11 + 1) * 3.141592653589793D / (double)(2 * var5));
                     var15.aFloatArray2446[2 * var11 + 1] = (float)Math.sin((double)(2 * var11 + 1) * 3.141592653589793D / (double)(2 * var5));
                  }

                  Class239 var16 = this.method3407(var7);

                  for(int var12 = 0; var12 < var8; ++var12) {
                     var16.aFloatArray2446[2 * var12] = (float)Math.cos((double)(4 * var12 + 2) * 3.141592653589793D / (double)var5);
                     var16.aFloatArray2446[2 * var12 + 1] = -((float)Math.sin((double)(4 * var12 + 2) * 3.141592653589793D / (double)var5));
                  }

                  int[] var17 = new int[var8];
                  int var13 = Class452.method5370(var8 - 1, (byte)-34);

                  for(int var14 = 0; var14 < var8; ++var14) {
                     var17[var14] = Class390.method4774(var14, var13, 1456351666);
                  }

                  if(var4 != 0) {
                     this.aClass239_2690 = var9;
                     this.aClass239_2721 = var15;
                     this.aClass239_2722 = var16;
                     this.anIntArray2724 = var17;
                  } else {
                     this.aClass239_2717 = var9;
                     this.aClass239_2718 = var15;
                     this.aClass239_2719 = var16;
                     this.anIntArray2723 = var17;
                  }
               }

               this.method3420();
               var4 = this.method3418(6) + 1;

               for(var5 = 0; var5 < var4; ++var5) {
                  this.method3418(16);
               }

               var4 = this.method3418(6) + 1;
               if(this.aClass254Array2707 == null || this.aClass254Array2707.length != var4) {
                  this.aClass254Array2707 = new Class254[var4];
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  if(this.aClass254Array2707[var5] == null) {
                     this.aClass254Array2707[var5] = new Class254();
                  }

                  this.aClass254Array2707[var5].method3477(this, this.anInt2701);
               }

               var5 = this.method3418(6) + 1;
               if(this.aClass257Array2704 == null || this.aClass257Array2704.length != var5) {
                  this.aClass257Array2704 = new Class257[var5];
               }

               for(var6 = 0; var6 < var5; ++var6) {
                  if(this.aClass257Array2704[var6] == null) {
                     this.aClass257Array2704[var6] = new Class257();
                  }

                  this.aClass257Array2704[var6].method3508(this);
               }

               var6 = this.method3418(6) + 1;
               if(this.aClass244Array2709 == null || this.aClass244Array2709.length != var6) {
                  this.aClass244Array2709 = new Class244[var6];
               }

               for(var7 = 0; var7 < var6; ++var7) {
                  if(this.aClass244Array2709[var7] == null) {
                     this.aClass244Array2709[var7] = new Class244();
                  }

                  this.aClass244Array2709[var7].method3337(this);
               }

               var7 = this.method3418(6) + 1;
               this.aBoolArray2710 = new boolean[var7];
               this.anIntArray2711 = new int[var7];

               for(var8 = 0; var8 < var7; ++var8) {
                  this.aBoolArray2710[var8] = this.method3454() != 0;
                  this.method3418(16);
                  this.method3418(16);
                  this.anIntArray2711[var8] = this.method3418(8);
               }

               this.method3419(true);
            }

         }
      }
   }

   public synchronized boolean method326() {
      return this.aBool2750;
   }

   int method3405() {
      return this.anInt2756;
   }

   Class239[] method3406(int var1, int var2) {
      Class239[] var3 = new Class239[var1];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = this.method3407(var2);
      }

      return var3;
   }

   Class239 method3407(int var1) {
      Class192 var2 = aClass192_2753;
      synchronized(var2) {
         Class239 var3 = null;
         var3 = (Class239)aClass192_2753.method2773(1088230042);
         Class239 var4 = null;

         for(int var5 = var1; var3 != null; var3 = (Class239)aClass192_2753.method2775(398497249)) {
            if(var3.aFloatArray2446.length > var1 && !var3.aBool2447 && (var4 == null || var3.aFloatArray2446.length < var5)) {
               var4 = var3;
               var5 = var3.aFloatArray2446.length;
            }

            if(var3.aFloatArray2446.length == var1 && !var3.aBool2447) {
               break;
            }
         }

         if(var3 == null) {
            var3 = var4;
         }

         int var8;
         if(var3 == null) {
            var3 = new Class239(this);
            var8 = 0;
            boolean var9 = false;

            while(!var9 && var8 < 1000) {
               if(aClass192_2753.method2765((long)var8) != null) {
                  ++var8;
               } else {
                  var9 = true;
               }
            }

            var3.anInt2448 = var8;
            float[] var10 = new float[var1];
            var3.aFloatArray2446 = var10;
            var3.aBool2447 = true;
            var3.anInt2445 = var1;
            if(aClass192_2753.method2785(-289923479) < var1 * 4) {
               ;
            }

            aClass192_2753.method2781(var3, (long)var3.anInt2448, var10.length * 4, (byte)-25);
         } else {
            for(var8 = 0; var8 < var3.aFloatArray2446.length; ++var8) {
               var3.aFloatArray2446[var8] = 0.0F;
            }

            var3.anInt2445 = var1;
         }

         var3.aBool2447 = true;
         return var3;
      }
   }

   void method3408(Class239 var1) {
      if(var1 != null) {
         Class192 var2 = aClass192_2753;
         synchronized(var2) {
            var1.aBool2447 = false;
         }
      }
   }

   void method3409(Class239[] var1) {
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            this.method3408(var1[var2]);
         }

      }
   }

   synchronized void method3410(boolean var1) {
      if(!var1) {
         this.anInt2745 = 0;
         this.anInt2705 = 0;
         this.aBoolArray2710 = null;
         this.anIntArray2711 = null;
         this.method3409(this.aClass239Array2749);
         this.aClass239Array2749 = null;
         this.method3409(this.aClass239Array2712);
         this.aClass239Array2712 = null;
         this.anInt2748 = 0;
         this.anInt2714 = 0;
         this.aBoolArray2734 = null;
         this.method3409(this.aClass239Array2716);
         this.aClass239Array2716 = null;
         this.method3408(this.aClass239_2717);
         this.method3408(this.aClass239_2718);
         this.method3408(this.aClass239_2719);
         this.method3408(this.aClass239_2690);
         this.method3408(this.aClass239_2721);
         this.method3408(this.aClass239_2722);
         this.aClass239_2717 = null;
         this.aClass239_2718 = null;
         this.aClass239_2719 = null;
         this.aClass239_2690 = null;
         this.aClass239_2721 = null;
         this.aClass239_2722 = null;
         this.anIntArray2723 = null;
         this.anIntArray2724 = null;
      }

      this.anInt2747 = 0;
      Iterator var2 = this.aList2744.iterator();

      while(var2.hasNext()) {
         RSByteBuffer var3 = (RSByteBuffer)var2.next();
         var3.method9675(-1048067521);
      }

      this.aList2744.clear();
      this.aBool2725 = false;
      if(this.aClass526_Sub36_2727 != null) {
         RSByteBuffer var10 = this.aClass526_Sub36_2727;
         synchronized(var10) {
            this.aClass526_Sub36_2727.method9675(1144529370);
            this.aClass526_Sub36_2727 = null;
         }
      }

      this.anInt2728 = 0;
      this.anInt2729 = 0;
      RSByteBuffer var4;
      List var11;
      Iterator var12;
      if(!var1) {
         var11 = this.aList2739;
         synchronized(var11) {
            var12 = this.aList2739.iterator();

            while(var12.hasNext()) {
               var4 = (RSByteBuffer)var12.next();
               var4.method9675(-246967531);
            }

            this.aList2739.clear();
         }

         this.anInt2733 = 0;
      }

      var11 = this.aList2726;
      synchronized(var11) {
         var12 = this.aList2726.iterator();

         while(true) {
            if(!var12.hasNext()) {
               this.aList2726.clear();
               break;
            }

            var4 = (RSByteBuffer)var12.next();
            var4.method9675(1276891551);
         }
      }

      this.aBool2731 = false;
      this.anInt2740 = 0;
      this.anInt2737 = -1;
      this.anInt2741 = -1;
      if(!var1) {
         this.method3419(false);
         this.aBool2732 = false;
         this.anInt2715 = -1;
         this.anInt2702 = -1;
         this.anInt2742 = 0;
         this.anInt2743 = 0;
         this.anInt2706 = -1;
         this.anInt2736 = -1;
         this.anInt2730 = -1;
         this.anInt2738 = -1;
         this.aBool2751 = false;
         this.aBool2698 = false;
      } else {
         ++this.anInt2743;
         this.aBool2751 = true;
      }

   }

   public Class248(float var1) {
      this.aClass376_2697 = Class376.aClass376_3908;
      this.aList2744 = new ArrayList();
      this.aClass526_Sub36_2727 = null;
      this.anInt2728 = 0;
      this.anInt2729 = 0;
      this.aList2739 = new ArrayList();
      this.aList2720 = new ArrayList();
      this.aList2696 = new ArrayList();
      this.anAtomicReference2746 = new AtomicReference((Object)null);
      this.anInt2708 = 0;
      this.aBool2698 = false;
      this.anInt2733 = 0;
      this.aBoolArray2757 = null;
      this.aBoolArray2758 = null;
      this.aBoolArray2759 = null;
      this.aFloat2703 = var1;
      this.aClass388_2691 = Class388.aClass388_4057;
      this.aClass375_2699 = Class375.aClass375_3902;
      this.method3410(false);
   }

   void method3411(RSByteBuffer var1) {
      this.aList2744.add(var1);
   }

   boolean method3412() {
      return this.aBool2725;
   }

   boolean method3413(RSByteBuffer var1) {
      return var1.readUnsignedByte(1749961179) == 79 && var1.readUnsignedByte(-558946419) == 103 && var1.readUnsignedByte(993745489) == 103 && var1.readUnsignedByte(1683371017) == 83;
   }

   boolean method3414(byte[] var1, int var2, int var3) {
      return var1[var2] != var3?false:var1[var2 + 1] == 118 && var1[var2 + 2] == 111 && var1[var2 + 3] == 114 && var1[var2 + 4] == 98 && var1[var2 + 5] == 105 && var1[var2 + 6] == 115;
   }

   float method3415(int var1) {
      int var2 = var1 & 2097151;
      int var3 = var1 & Integer.MIN_VALUE;
      int var4 = (var1 & 2145386496) >> 21;
      if(var3 != 0) {
         var2 = -var2;
      }

      return (float)((double)var2 * Math.pow(2.0D, (double)(var4 - 788)));
   }

   int method3416() {
      return this.anInt2756;
   }

   public Class388 method319() {
      return this.aClass388_2691;
   }

   synchronized void method3417(RSByteBuffer var1) {
      this.aList2726.add(var1);
      this.method3401(Class376.aClass376_3905);
   }

   int method3418(int var1) {
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var1 >= 8 - this.anInt2756; var1 -= var4) {
         var4 = 8 - this.anInt2756;
         int var5 = (1 << var4) - 1;
         var2 += (this.aByteArray2754[this.anInt2755] >> this.anInt2756 & var5) << var3;
         this.anInt2756 = 0;
         ++this.anInt2755;
         var3 += var4;
      }

      if(var1 > 0) {
         var4 = (1 << var1) - 1;
         var2 += (this.aByteArray2754[this.anInt2755] >> this.anInt2756 & var4) << var3;
         this.anInt2756 += var1;
      }

      return var2;
   }

   synchronized void method3419(boolean var1) {
      this.aBool2750 = var1;
   }

   void method3420() {
      int var1 = this.method3418(8) + 1;
      Iterator var2 = aList2752.iterator();

      Class250 var3;
      do {
         if(!var2.hasNext()) {
            this.aClass249Array2713 = new Class249[var1];

            for(int var5 = 0; var5 < var1; ++var5) {
               if(this.aClass249Array2713[var5] == null) {
                  this.aClass249Array2713[var5] = new Class249();
               }

               this.aClass249Array2713[var5].method3458(this);
            }

            Class250 var6 = new Class250(this.anInt2701, this.anInt2735, this.anInt2692, this.anInt2694, this.anInt2693, this.aClass249Array2713);
            aList2752.add(var6);
            return;
         }

         var3 = (Class250)var2.next();
      } while(var3.anInt2770 != 0 || var3.anInt2771 != 0 || var3.aClass249Array2773.length != var1 || var3.anInt2772 != this.anInt2701 || var3.anInt2768 != this.anInt2735 || var3.anInt2769 != this.anInt2693);

      this.aClass249Array2713 = var3.aClass249Array2773;

      for(int var4 = 0; var4 < this.aClass249Array2713.length; ++var4) {
         this.aClass249Array2713[var4].method3464(this);
      }

   }

   void method3421() {
      if(this.method293() != Class376.aClass376_3911) {
         if(this.method293() != Class376.aClass376_3906) {
            if(!this.aBool2750 || (float)(this.anInt2733 / this.method3402()) <= this.aFloat2703) {
               if(!this.method3412()) {
                  RSByteBuffer var1 = (RSByteBuffer)(this.aList2726 != null && !this.aList2726.isEmpty()?this.aList2726.get(0):null);
                  if(var1 == null) {
                     if(!this.aBool2731) {
                        this.method3401(Class376.aClass376_3906);
                        this.anInterface48_2695.method228(803682885);
                        this.aBool2731 = true;
                     }

                     return;
                  }

                  this.aBool2731 = false;
                  this.aBool2725 = true;
                  this.aList2726.remove(0);
                  this.method3411(var1);
               }

               this.method3437();
            }
         }
      }
   }

   int method3422() {
      if(this.aBool2732) {
         return this.anInt2701;
      } else {
         throw new RuntimeException("");
      }
   }

   int method3423(float var1) {
      int var2 = (int)(var1 * 32767.0F);
      return var2 > 32767?32767:(var2 < -32768?-32768:var2);
   }

   void method3424(byte[] var1, int var2) {
      this.aByteArray2754 = var1;
      this.anInt2755 = var2;
      this.anInt2756 = 0;
   }

   RSByteBuffer method3425(int var1) {
      RSByteBuffer var2 = this.method3426(this.method39(var1));
      int var3 = var1;
      List var4 = this.aList2739;
      synchronized(var4) {
         while(!this.aList2739.isEmpty()) {
            RSByteBuffer var5 = (RSByteBuffer)this.aList2739.remove(0);
            this.anInt2733 -= this.method301(var5.pos * 301018015) / this.method285();
            int var6 = this.method39(var3);
            int var7 = var5.pos * 301018015 < var6?var5.pos * 301018015:var6;
            var2.method9619(var5.buffer, 0, var7, 1295531040);
            var3 -= this.method301(var7);
            int var8 = var5.pos * 301018015 - var7;
            if(var8 != 0) {
               System.arraycopy(var5.buffer, var7, var5.buffer, 0, var8);
               var5.pos = var8 * 801976415;
               this.anInt2733 += this.method301(var8) / this.method285();
               this.aList2739.add(0, var5);
            } else {
               var5.method9675(-1746711283);
            }

            if(var3 <= 0) {
               break;
            }
         }

         if(this.aList2739.isEmpty() && this.method293() == Class376.aClass376_3909) {
            this.method3401(Class376.aClass376_3910);
         }

         return var2;
      }
   }

   RSByteBuffer method3426(int var1) {
      return new RSByteBuffer(var1, true);
   }

   int method3427() {
      return this.anInt2733;
   }

   public void method304(boolean var1, int var2, int var3, int var4) {
      this.aBool2698 = var1;
      this.anInt2742 = var2;
      this.anInt2715 = var3;
      this.anInt2702 = var4;
   }

   void method3428() {
      if(this.method293() != Class376.aClass376_3909) {
         this.method3421();
         if(this.method293() == Class376.aClass376_3907) {
            this.method3401(Class376.aClass376_3905);
         }

      }
   }

   public int method285() {
      if(this.aBool2732) {
         return this.method3455() < this.anInt2700?this.anInt2700:this.method3455();
      } else {
         throw new RuntimeException("");
      }
   }

   public void method306(boolean var1) {
      if(!var1) {
         this.method298();
      } else if(this.method293() == Class376.aClass376_3910) {
         this.method3410(true);
         this.method3401(Class376.aClass376_3905);
      }

   }

   public void method330() {
      if(this.method293() != Class376.aClass376_3907) {
         this.method3410(false);
         this.method3401(Class376.aClass376_3908);
      } else {
         this.method3410(false);
         this.method3401(Class376.aClass376_3911);
      }

   }

   public Class376 method308() {
      return this.aClass376_2697;
   }

   public Class376 method311() {
      return this.aClass376_2697;
   }

   void method3429() {
      if(this.method293() != Class376.aClass376_3909) {
         this.method3421();
         if(this.method293() == Class376.aClass376_3907) {
            this.method3401(Class376.aClass376_3905);
         }

      }
   }

   public void method310(Interface48 var1) {
      this.anInterface48_2695 = var1;
   }

   public void method324(int var1, Class388 var2, Class375 var3, int var4) {
      this.anInt2700 = var4;
      if(this.method3403(var1, var2, var3)) {
         this.aClass388_2691 = var2;
         this.aClass375_2699 = var3;
      } else {
         throw new RuntimeException("");
      }
   }

   boolean method3430(byte[] var1, int var2, int var3, AtomicReference var4) {
      if(var1 == null) {
         throw new RuntimeException("");
      } else if(var2 + var3 > var1.length) {
         return false;
      } else {
         this.method3424(var1, var2);
         int var5 = this.method3454();
         if(var5 != 0) {
            this.method3404(var1, var2);
            return false;
         } else if(!this.method326()) {
            throw new RuntimeException();
         } else {
            int var6 = this.method3418(this.method3439(this.anIntArray2711.length - 1));
            boolean var7 = this.aBoolArray2710[var6];
            int var8 = var7?this.anInt2705:this.anInt2745;
            boolean var9 = false;
            boolean var10 = false;
            if(var7) {
               var9 = this.method3454() != 0;
               var10 = this.method3454() != 0;
            }

            int var11 = var8 >> 1;
            int var12;
            int var13;
            int var14;
            if(var7 && !var9) {
               var12 = (var8 >> 2) - (this.anInt2745 >> 2);
               var13 = (var8 >> 2) + (this.anInt2745 >> 2);
               var14 = this.anInt2745 >> 1;
            } else {
               var12 = 0;
               var13 = var11;
               var14 = var8 >> 1;
            }

            int var15;
            int var16;
            int var17;
            if(var7 && !var10) {
               var15 = var8 - (var8 >> 2) - (this.anInt2745 >> 2);
               var16 = var8 - (var8 >> 2) + (this.anInt2745 >> 2);
               var17 = this.anInt2745 >> 1;
            } else {
               var15 = var11;
               var16 = var8;
               var17 = var8 >> 1;
            }

            Class244 var18 = this.aClass244Array2709[this.anIntArray2711[var6]];
            if(this.aBoolArray2757 == null || this.aBoolArray2757.length != this.anInt2701) {
               this.aBoolArray2757 = new boolean[this.anInt2701];
               this.aBoolArray2758 = new boolean[this.anInt2701];
            }

            int var19;
            int var20;
            int var22;
            for(var19 = 0; var19 < this.anInt2701; ++var19) {
               var20 = var18.anIntArray2462 != null?var18.anIntArray2462[var19]:0;
               var22 = var18.anIntArray2463[var20];
               this.aBoolArray2757[var19] = !this.aClass254Array2707[var22].method3482(var19);
               this.aBoolArray2758[var19] = this.aBoolArray2757[var19];
            }

            for(var19 = 0; var19 < var18.anInt2461; ++var19) {
               if(!this.aBoolArray2757[var18.anIntArray2460[var19]] || !this.aBoolArray2757[var18.anIntArray2467[var19]]) {
                  this.aBoolArray2757[var18.anIntArray2460[var19]] = false;
                  this.aBoolArray2757[var18.anIntArray2467[var19]] = false;
               }
            }

            if(this.aBoolArray2759 == null || this.aBoolArray2759.length != this.anInt2701) {
               this.aBoolArray2759 = new boolean[this.anInt2701];
            }

            int var21;
            int var24;
            int var51;
            for(var19 = 0; var19 < var18.anInt2466; ++var19) {
               var20 = 0;

               for(var21 = 0; var21 < this.anInt2701; ++var21) {
                  var22 = var18.anIntArray2462 != null?var18.anIntArray2462[var21]:var19;
                  if(var22 == var19) {
                     this.aBoolArray2759[var20++] = this.aBoolArray2757[var21];
                  }
               }

               Class257 var46 = this.aClass257Array2704[var18.anIntArray2464[var19]];
               Class239[] var48 = null;
               if(var46.anInt2814 != 2) {
                  var48 = var46.method3509(this.aClass239Array2716, var8 >> 1, this.aBoolArray2759);
               } else {
                  Class239[] var23 = this.method3406(1, this.anInt2701 * var8);
                  var24 = 0;

                  while(true) {
                     int var25;
                     if(var24 >= var8) {
                        var23 = var46.method3509(var23, var8 >> 1, this.aBoolArray2759);
                        var48 = this.aClass239Array2716;

                        for(var24 = 0; var24 < var8; ++var24) {
                           for(var25 = 0; var25 < this.anInt2701; ++var25) {
                              try {
                                 var48[var25].aFloatArray2446[var24] = var23[0].aFloatArray2446[this.anInt2701 * var24 + var25];
                              } catch (ArrayIndexOutOfBoundsException var43) {
                                 var43.printStackTrace();
                              }
                           }
                        }

                        this.method3409(var23);
                        var23 = null;
                        break;
                     }

                     for(var25 = 0; var25 < this.anInt2701; ++var25) {
                        try {
                           var23[0].aFloatArray2446[var24 * this.anInt2701 + var25] = this.aClass239Array2716[var25].aFloatArray2446[var24];
                        } catch (ArrayIndexOutOfBoundsException var44) {
                           var44.printStackTrace();
                        }
                     }

                     ++var24;
                  }
               }

               if(var18.anIntArray2462 != null) {
                  var20 = 0;

                  for(var51 = 0; var51 < this.anInt2701; ++var51) {
                     var24 = var18.anIntArray2462[var51];
                     if(var24 == var19) {
                        this.aClass239Array2716[var51] = var48[var20++];
                     }
                  }
               } else {
                  if(this.aClass239Array2716 != var48) {
                     this.method3409(this.aClass239Array2716);
                  }

                  this.aClass239Array2716 = var48;
               }
            }

            for(var19 = var18.anInt2461 - 1; var19 >= 0; --var19) {
               Class239 var45 = this.aClass239Array2716[var18.anIntArray2460[var19]];
               Class239 var47 = this.aClass239Array2716[var18.anIntArray2467[var19]];

               for(var22 = 0; var22 < var45.anInt2445; ++var22) {
                  float var52 = var45.aFloatArray2446[var22];
                  float var54 = var47.aFloatArray2446[var22];
                  float var26;
                  float var55;
                  if(var52 > 0.0F) {
                     if(var54 > 0.0F) {
                        var55 = var52;
                        var26 = var52 - var54;
                     } else {
                        var26 = var52;
                        var55 = var52 + var54;
                     }
                  } else if(var54 > 0.0F) {
                     var55 = var52;
                     var26 = var52 + var54;
                  } else {
                     var26 = var52;
                     var55 = var52 - var54;
                  }

                  var45.aFloatArray2446[var22] = var55;
                  var47.aFloatArray2446[var22] = var26;
               }
            }

            for(var19 = 0; var19 < this.aBoolArray2757.length; ++var19) {
               this.aBoolArray2757[var19] = this.aBoolArray2758[var19];
            }

            for(var19 = 0; var19 < this.anInt2701; ++var19) {
               if(!this.aBoolArray2757[var19]) {
                  var20 = var18.anIntArray2462 != null?var18.anIntArray2462[var19]:0;
                  var22 = var18.anIntArray2463[var20];
                  this.aClass254Array2707[var22].method3483(var19);
                  this.aClass254Array2707[var22].method3484(this.aClass239Array2716[var19], var8 >> 1, var19);
               }
            }

            for(var19 = 0; var19 < this.anInt2701; ++var19) {
               if(this.aBoolArray2757[var19]) {
                  for(var20 = var8 >> 1; var20 < var8; ++var20) {
                     this.aClass239Array2716[var19].aFloatArray2446[var20] = 0.0F;
                  }
               } else {
                  var20 = var8 >> 1;
                  var21 = var8 >> 2;
                  var22 = var8 >> 3;
                  Class239 var53 = this.aClass239Array2716[var19];

                  for(var24 = 0; var24 < var20; ++var24) {
                     var53.aFloatArray2446[var24] *= 0.5F;
                  }

                  for(var24 = var20; var24 < var8; ++var24) {
                     var53.aFloatArray2446[var24] = -var53.aFloatArray2446[var8 - var24 - 1];
                  }

                  Class239 var56 = var7?this.aClass239_2690:this.aClass239_2717;
                  Class239 var58 = var7?this.aClass239_2721:this.aClass239_2718;
                  Class239 var57 = var7?this.aClass239_2722:this.aClass239_2719;
                  int[] var27 = var7?this.anIntArray2724:this.anIntArray2723;

                  int var28;
                  float var29;
                  float var30;
                  float var31;
                  float var32;
                  for(var28 = 0; var28 < var21; ++var28) {
                     var29 = var53.aFloatArray2446[4 * var28] - var53.aFloatArray2446[var8 - 4 * var28 - 1];
                     var30 = var53.aFloatArray2446[4 * var28 + 2] - var53.aFloatArray2446[var8 - 4 * var28 - 3];
                     var31 = var56.aFloatArray2446[2 * var28];
                     var32 = var56.aFloatArray2446[2 * var28 + 1];
                     var53.aFloatArray2446[var8 - 4 * var28 - 1] = var29 * var31 - var30 * var32;
                     var53.aFloatArray2446[var8 - 4 * var28 - 3] = var29 * var32 + var30 * var31;
                  }

                  float var33;
                  float var34;
                  for(var28 = 0; var28 < var22; ++var28) {
                     var29 = var53.aFloatArray2446[var20 + 3 + 4 * var28];
                     var30 = var53.aFloatArray2446[var20 + 1 + 4 * var28];
                     var31 = var53.aFloatArray2446[4 * var28 + 3];
                     var32 = var53.aFloatArray2446[4 * var28 + 1];
                     var53.aFloatArray2446[var20 + 3 + 4 * var28] = var29 + var31;
                     var53.aFloatArray2446[var20 + 1 + 4 * var28] = var30 + var32;
                     var33 = var56.aFloatArray2446[var20 - 4 - 4 * var28];
                     var34 = var56.aFloatArray2446[var20 - 3 - 4 * var28];
                     var53.aFloatArray2446[4 * var28 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
                     var53.aFloatArray2446[4 * var28 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
                  }

                  var28 = Class452.method5370(var8 - 1, (byte)29);

                  int var59;
                  int var60;
                  int var61;
                  int var62;
                  for(var59 = 0; var59 < var28 - 3; ++var59) {
                     var60 = var8 >> var59 + 2;
                     var61 = 8 << var59;

                     for(var62 = 0; var62 < 2 << var59; ++var62) {
                        int var63 = var8 - var60 * 2 * var62;
                        int var64 = var8 - var60 * (2 * var62 + 1);

                        for(int var35 = 0; var35 < var8 >> var59 + 4; ++var35) {
                           int var36 = 4 * var35;
                           float var37 = var53.aFloatArray2446[var63 - 1 - var36];
                           float var38 = var53.aFloatArray2446[var63 - 3 - var36];
                           float var39 = var53.aFloatArray2446[var64 - 1 - var36];
                           float var40 = var53.aFloatArray2446[var64 - 3 - var36];
                           var53.aFloatArray2446[var63 - 1 - var36] = var37 + var39;
                           var53.aFloatArray2446[var63 - 3 - var36] = var38 + var40;
                           float var41 = var56.aFloatArray2446[var35 * var61];
                           float var42 = var56.aFloatArray2446[var35 * var61 + 1];
                           var53.aFloatArray2446[var64 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                           var53.aFloatArray2446[var64 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
                        }
                     }
                  }

                  for(var59 = 1; var59 < var22 - 1; ++var59) {
                     var60 = var27[var59];
                     if(var59 < var60) {
                        var61 = 8 * var59;
                        var62 = 8 * var60;
                        var33 = var53.aFloatArray2446[var61 + 1];
                        var53.aFloatArray2446[var61 + 1] = var53.aFloatArray2446[var62 + 1];
                        var53.aFloatArray2446[var62 + 1] = var33;
                        var33 = var53.aFloatArray2446[var61 + 3];
                        var53.aFloatArray2446[var61 + 3] = var53.aFloatArray2446[var62 + 3];
                        var53.aFloatArray2446[var62 + 3] = var33;
                        var33 = var53.aFloatArray2446[var61 + 5];
                        var53.aFloatArray2446[var61 + 5] = var53.aFloatArray2446[var62 + 5];
                        var53.aFloatArray2446[var62 + 5] = var33;
                        var33 = var53.aFloatArray2446[var61 + 7];
                        var53.aFloatArray2446[var61 + 7] = var53.aFloatArray2446[var62 + 7];
                        var53.aFloatArray2446[var62 + 7] = var33;
                     }
                  }

                  for(var59 = 0; var59 < var20; ++var59) {
                     var53.aFloatArray2446[var59] = var53.aFloatArray2446[2 * var59 + 1];
                  }

                  for(var59 = 0; var59 < var22; ++var59) {
                     var53.aFloatArray2446[var8 - 1 - 2 * var59] = var53.aFloatArray2446[4 * var59];
                     var53.aFloatArray2446[var8 - 2 - 2 * var59] = var53.aFloatArray2446[4 * var59 + 1];
                     var53.aFloatArray2446[var8 - var21 - 1 - 2 * var59] = var53.aFloatArray2446[4 * var59 + 2];
                     var53.aFloatArray2446[var8 - var21 - 2 - 2 * var59] = var53.aFloatArray2446[4 * var59 + 3];
                  }

                  for(var59 = 0; var59 < var22; ++var59) {
                     var30 = var57.aFloatArray2446[2 * var59];
                     var31 = var57.aFloatArray2446[2 * var59 + 1];
                     var32 = var53.aFloatArray2446[var20 + 2 * var59];
                     var33 = var53.aFloatArray2446[var20 + 2 * var59 + 1];
                     var34 = var53.aFloatArray2446[var8 - 2 - 2 * var59];
                     float var65 = var53.aFloatArray2446[var8 - 1 - 2 * var59];
                     float var66 = var31 * (var32 - var34) + var30 * (var33 + var65);
                     var53.aFloatArray2446[var20 + 2 * var59] = (var32 + var34 + var66) * 0.5F;
                     var53.aFloatArray2446[var8 - 2 - 2 * var59] = (var32 + var34 - var66) * 0.5F;
                     var66 = var31 * (var33 + var65) - var30 * (var32 - var34);
                     var53.aFloatArray2446[var20 + 2 * var59 + 1] = (var33 - var65 + var66) * 0.5F;
                     var53.aFloatArray2446[var8 - 1 - 2 * var59] = (-var33 + var65 + var66) * 0.5F;
                  }

                  for(var59 = 0; var59 < var21; ++var59) {
                     var53.aFloatArray2446[var59] = var53.aFloatArray2446[2 * var59 + var20] * var58.aFloatArray2446[2 * var59] + var53.aFloatArray2446[2 * var59 + 1 + var20] * var58.aFloatArray2446[2 * var59 + 1];
                     var53.aFloatArray2446[var20 - 1 - var59] = var53.aFloatArray2446[2 * var59 + var20] * var58.aFloatArray2446[2 * var59 + 1] - var53.aFloatArray2446[2 * var59 + 1 + var20] * var58.aFloatArray2446[2 * var59];
                  }

                  for(var59 = 0; var59 < var21; ++var59) {
                     var53.aFloatArray2446[var8 - var21 + var59] = -var53.aFloatArray2446[var59];
                  }

                  for(var59 = 0; var59 < var21; ++var59) {
                     var53.aFloatArray2446[var59] = var53.aFloatArray2446[var21 + var59];
                  }

                  for(var59 = 0; var59 < var21; ++var59) {
                     var53.aFloatArray2446[var21 + var59] = -var53.aFloatArray2446[var21 - var59 - 1];
                  }

                  for(var59 = 0; var59 < var21; ++var59) {
                     var53.aFloatArray2446[var20 + var59] = var53.aFloatArray2446[var8 - var59 - 1];
                  }

                  for(var59 = var12; var59 < var13; ++var59) {
                     var30 = (float)Math.sin(((double)(var59 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D);
                     this.aClass239Array2716[var19].aFloatArray2446[var59] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
                  }

                  for(var59 = var15; var59 < var16; ++var59) {
                     var30 = (float)Math.sin(((double)(var59 - var15) + 0.5D) / (double)var17 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                     this.aClass239Array2716[var19].aFloatArray2446[var59] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
                  }
               }
            }

            Class239[] var49 = null;
            if(this.anInt2748 > 0) {
               var20 = this.anInt2748 + var8 >> 2;
               var49 = this.method3406(this.anInt2701, var20);

               for(var21 = 0; var21 < this.anInt2701; ++var21) {
                  if(!this.aBoolArray2734[var21]) {
                     for(var22 = 0; var22 < this.anInt2714; ++var22) {
                        var51 = (this.anInt2748 >> 1) + var22;
                        var49[var21].aFloatArray2446[var22] += this.aClass239Array2712[var21].aFloatArray2446[var51];
                     }
                  }

                  if(!this.aBoolArray2757[var21]) {
                     for(var22 = var12; var22 < var8 >> 1; ++var22) {
                        var51 = var49[var21].anInt2445 - (var8 >> 1) + var22;
                        var49[var21].aFloatArray2446[var51] += this.aClass239Array2716[var21].aFloatArray2446[var22];
                     }
                  }
               }
            }

            Class239[] var50 = this.aClass239Array2712;
            this.aClass239Array2712 = this.aClass239Array2716;
            this.aClass239Array2716 = var50;
            this.anInt2748 = var8;
            this.anInt2714 = var16 - (var8 >> 1);
            this.aBoolArray2734 = this.aBoolArray2757;
            var4.set(var49);
            return true;
         }
      }
   }

   public void method305(boolean var1) {
      if(!var1) {
         this.method298();
      } else if(this.method293() == Class376.aClass376_3910) {
         this.method3410(true);
         this.method3401(Class376.aClass376_3905);
      }

   }

   public RSByteBuffer method309(int var1) {
      RSByteBuffer var2 = this.method3425(var1);
      return var2;
   }

   public int method316() {
      return this.method3427();
   }

   public int method302(int var1) {
      return var1 / (this.method296().anInt4060 * 1260438277 / 8);
   }

   int method3431(float var1) {
      int var2 = (int)(var1 * 127.0F);
      return var2 > 127?127:(var2 < -128?-128:var2);
   }

   int method3432() {
      if(this.method326()) {
         return this.anInt2735;
      } else {
         throw new RuntimeException("");
      }
   }

   int method3433() {
      if(this.method326()) {
         return this.anInt2735;
      } else {
         throw new RuntimeException("");
      }
   }

   public void method312() {
      if(this.method293() == Class376.aClass376_3911 || this.method293() == Class376.aClass376_3908 || this.method293() == Class376.aClass376_3905) {
         this.method3401(Class376.aClass376_3907);
         this.method3434();
      }
   }

   void method3434() {
      if(this.method293() != Class376.aClass376_3909) {
         this.method3421();
         if(this.method293() == Class376.aClass376_3907) {
            this.method3401(Class376.aClass376_3905);
         }

      }
   }

   void method3435() {
      this.aByteArray2754 = null;
   }

   public Class375 method299() {
      return this.aClass375_2699;
   }

   public Class388 method320() {
      return this.aClass388_2691;
   }

   public Class388 method292() {
      return this.aClass388_2691;
   }

   void method3436() {
      this.aByteArray2754 = null;
   }

   public int method323() {
      if(this.aBool2732) {
         return this.method3455() < this.anInt2700?this.anInt2700:this.method3455();
      } else {
         throw new RuntimeException("");
      }
   }

   public int method39(int var1) {
      return var1 * (this.method296().anInt4060 * 1260438277 / 8);
   }

   synchronized void method3437() {
      int var1 = this.aClass526_Sub36_2727 != null?this.aClass526_Sub36_2727.pos * 301018015:0;
      int var2 = 0;

      Iterator var3;
      RSByteBuffer var4;
      for(var3 = this.aList2744.iterator(); var3.hasNext(); var2 += var4.pos * 301018015) {
         var4 = (RSByteBuffer)var3.next();
      }

      if(this.aClass526_Sub36_2727 != null) {
         if(this.aClass526_Sub36_2727.buffer.length - this.aClass526_Sub36_2727.pos * 301018015 < var2) {
            RSByteBuffer var34 = this.method3426(var2 + this.anInt2728);
            var34.method9619(this.aClass526_Sub36_2727.buffer, this.aClass526_Sub36_2727.pos * 301018015 - this.anInt2729, this.anInt2728, 1898444932);
            this.aClass526_Sub36_2727.method9675(-57406471);
            this.aClass526_Sub36_2727 = var34;
            var1 = this.anInt2729;
         }
      } else {
         this.aClass526_Sub36_2727 = this.method3426(var2);
         this.anInt2728 = 0;
         var1 = 0;
      }

      var3 = this.aList2744.iterator();

      while(var3.hasNext()) {
         var4 = (RSByteBuffer)var3.next();
         this.aClass526_Sub36_2727.method9619(var4.buffer, 0, var4.pos * 301018015, 1840637911);
         this.anInt2728 += var4.pos * 301018015;
         var4.method9675(1495780945);
      }

      this.aClass526_Sub36_2727.pos = (var1 - this.anInt2729) * 801976415;
      this.anInt2729 = 0;
      this.aList2744.clear();

      label284:
      while(true) {
         if(this.aBool2725) {
            if(this.aClass526_Sub36_2727.pos * 301018015 < this.aClass526_Sub36_2727.buffer.length) {
               if(this.aBool2750 && (float)(this.anInt2733 / this.method3402()) > this.aFloat2703) {
                  return;
               }

               if(this.aClass526_Sub36_2727 != null && this.anInt2728 >= 27) {
                  int var35 = this.aClass526_Sub36_2727.pos * 301018015;
                  byte var36 = 0;
                  int var5 = 0;
                  if(!this.method3413(this.aClass526_Sub36_2727)) {
                     return;
                  }

                  ++this.anInt2741;
                  if(this.anInt2738 < 0) {
                     ++this.anInt2730;
                  }

                  this.aList2720.clear();
                  this.aList2696.clear();
                  this.aClass526_Sub36_2727.readUnsignedByte(1054406372);
                  int var6 = this.aClass526_Sub36_2727.readUnsignedByte(-908769166);
                  int var7 = this.aClass526_Sub36_2727.readUnsignedByte(-440045437) & 255 | (this.aClass526_Sub36_2727.readUnsignedByte(-281357458) & 255) << 8 | (this.aClass526_Sub36_2727.readUnsignedByte(-1675317166) & 255) << 16 | this.aClass526_Sub36_2727.readUnsignedByte(1840442630) << 24;
                  int var37 = var7 - var36;
                  this.aClass526_Sub36_2727.pos += -53279248;
                  int var8 = this.aClass526_Sub36_2727.readUnsignedByte(-1673338303);
                  int var9 = this.aClass526_Sub36_2727.pos * 301018015;
                  int var10 = var9 + var8;
                  if(var10 > var35 + this.anInt2728) {
                     this.aClass526_Sub36_2727.pos = (var35 + this.anInt2728) * 801976415;
                     this.anInt2729 = this.aClass526_Sub36_2727.pos * 301018015 - var35;
                     this.aBool2725 = false;
                  }

                  int var11 = var10;
                  int var12 = 0;
                  int var14;
                  if(this.aBool2725) {
                     for(int var13 = 0; var13 < var8; ++var13) {
                        var14 = this.aClass526_Sub36_2727.buffer[var9++] & 255;
                        var10 += var14;
                        var12 += var14;
                        if(var10 > var35 + this.anInt2728) {
                           this.aClass526_Sub36_2727.pos = (var35 + this.anInt2728) * 801976415;
                           this.anInt2729 = this.aClass526_Sub36_2727.pos * 301018015 - var35;
                           this.aBool2725 = false;
                           break;
                        }

                        if(var14 < 255) {
                           this.aList2720.add(Integer.valueOf(var11));
                           this.aList2696.add(Integer.valueOf(var12));
                           var11 = var10;
                           var12 = 0;
                        }
                     }
                  }

                  if(!this.aBool2725) {
                     continue;
                  }

                  var14 = -1;
                  Iterator var15 = this.aList2720.iterator();
                  Iterator var16 = this.aList2696.iterator();
                  boolean var17 = false;
                  this.anInt2708 = 0;

                  while(true) {
                     while(var15.hasNext()) {
                        Integer var18 = (Integer)var15.next();
                        Integer var19 = (Integer)var16.next();
                        ++var14;
                        if(this.method326() && this.aBool2751 && this.anInt2741 < this.anInt2730 && var14 < this.anInt2738) {
                           this.anInt2740 += var17?0:var37;
                           var17 = true;
                        } else {
                           this.anAtomicReference2746.set((Object)null);
                           boolean var20 = this.method3430(this.aClass526_Sub36_2727.buffer, var18.intValue(), var19.intValue(), this.anAtomicReference2746);
                           Class239[] var21 = (Class239[])((Class239[])this.anAtomicReference2746.get());
                           if(var20 && (!this.aBool2751 || this.anInt2741 >= this.anInt2730 || var14 >= this.anInt2738)) {
                              if(var21 != null) {
                                 int var22 = var21[0].anInt2445;
                                 this.anInt2747 += var22;
                                 if(this.anInt2747 > var7 && var6 == 4) {
                                    this.anInt2708 = this.anInt2747 - var7 - this.anInt2708;
                                    var22 -= this.anInt2708;
                                    if(this.anInt2708 > var21[0].anInt2445) {
                                       this.anInt2708 = var21[0].anInt2445;
                                    }

                                    if(var22 < 0) {
                                       var22 = 0;
                                    }
                                 }

                                 int var23 = 0;
                                 int var24 = this.method39(var22) * var21.length;
                                 int var25;
                                 if(this.aBool2751 && this.anInt2740 < this.anInt2715) {
                                    var25 = var24;
                                    var24 -= this.method39(this.anInt2715 - this.anInt2740);
                                    if(var24 <= 0) {
                                       this.anInt2740 += this.method301(var25);
                                       this.method3409(var21);
                                       var21 = null;
                                       continue;
                                    }

                                    var23 += this.anInt2715 - this.anInt2740;
                                 }

                                 if(this.anInt2740 + var22 > this.anInt2702 && (this.anInt2743 < this.anInt2742 || this.anInt2742 < 0) && this.aBool2698) {
                                    var24 -= this.method39(this.anInt2740 + var22 - this.anInt2702 - 1);
                                    if(var24 <= 0) {
                                       this.method3409(var21);
                                       var21 = null;
                                       continue;
                                    }
                                 }

                                 var25 = this.method285();
                                 if(this.method3455() < this.method285()) {
                                    int var26 = this.method285() - this.method3455();
                                    var24 += var24 / this.method3455() * var26;
                                 }

                                 RSByteBuffer var38 = this.method3426(var24);

                                 for(int var27 = var23; var27 < var22; ++var27) {
                                    boolean var28 = this.aBool2751;
                                    if(this.anInt2742 != 0) {
                                       if(this.anInt2740 == this.anInt2715) {
                                          if(this.anInt2706 < 0) {
                                             this.anInt2706 = this.anInt2737;
                                             this.anInt2738 = var14;
                                          }

                                          this.aBool2751 = false;
                                       }

                                       if(this.anInt2740 == this.anInt2702 && this.anInt2736 < 0) {
                                          this.anInt2736 = this.anInt2737;
                                       }

                                       if(this.anInt2740 > this.anInt2702 && (this.anInt2743 < this.anInt2742 || this.anInt2742 < 0) && this.aBool2698) {
                                          var28 = true;
                                       }
                                    }

                                    if(var28 && (this.anInt2740 < this.anInt2715 || this.anInt2740 > this.anInt2702)) {
                                       ++this.anInt2740;
                                       ++var5;
                                       if(var5 > var37) {
                                          throw new RuntimeException();
                                       }
                                    } else {
                                       for(int var29 = 0; var29 < var25; ++var29) {
                                          float var30;
                                          if(var29 < var21.length) {
                                             var30 = var21[var29].aFloatArray2446[var27];
                                          } else {
                                             var30 = var21[var29 % this.method3455()].aFloatArray2446[var27];
                                          }

                                          int var31;
                                          if(this.aClass388_2691 == Class388.aClass388_4057) {
                                             var31 = this.method3423(var30);
                                             if(this.aClass375_2699 == Class375.aClass375_3902) {
                                                var38.method9610(var31, (byte)0);
                                             } else {
                                                var38.writeShort(var31, -805078716);
                                             }
                                          } else if(this.aClass388_2691 == Class388.aClass388_4062) {
                                             var31 = this.method3447(var30);
                                             if(this.aClass375_2699 == Class375.aClass375_3902) {
                                                var38.method9610(var31, (byte)0);
                                             } else {
                                                var38.writeShort(var31, -805078716);
                                             }
                                          } else if(this.aClass388_2691 == Class388.aClass388_4059) {
                                             var31 = this.method3431(var30);
                                             var38.writeByte(var31, -1276928194);
                                          } else if(this.aClass388_2691 == Class388.aClass388_4058) {
                                             var31 = this.method3451(var30);
                                             var38.writeByte(var31, 995176702);
                                          }
                                       }

                                       ++this.anInt2740;
                                       ++var5;
                                    }
                                 }

                                 List var39 = this.aList2739;
                                 synchronized(var39) {
                                    this.anInt2733 += this.method301(var38.pos * 301018015) / this.method285();
                                    this.aList2739.add(var38);
                                 }
                              }
                           } else if(this.method326()) {
                              this.anInt2748 = 0;
                              if(this.aClass239Array2712 == null || this.aClass239Array2712 != null && (this.aClass239Array2712.length != this.anInt2701 || this.aClass239Array2712[0].anInt2445 != this.anInt2705)) {
                                 if(this.aClass239Array2712 != null) {
                                    this.method3409(this.aClass239Array2712);
                                 }

                                 this.aClass239Array2712 = this.method3406(this.anInt2701, this.anInt2705);
                              }
                           }

                           this.method3409(var21);
                           var21 = null;
                        }
                     }

                     this.aClass526_Sub36_2727.pos = var10 * 801976415;
                     this.anInt2728 -= var10 - var35;
                     continue label284;
                  }
               }

               if(this.aClass526_Sub36_2727 != null) {
                  this.anInt2729 = this.anInt2728;
                  this.aClass526_Sub36_2727.pos += this.anInt2728 * 801976415;
               }

               this.aBool2725 = false;
               return;
            }

            this.aBool2725 = false;
         }

         return;
      }
   }

   int method3438() {
      if(this.aBool2732) {
         return this.anInt2701;
      } else {
         throw new RuntimeException("");
      }
   }

   int method3439(int var1) {
      int var2;
      for(var2 = 0; var1 > 0; var1 >>= 1) {
         ++var2;
      }

      return var2;
   }

   int method3440() {
      return this.anInt2755;
   }

   public RSByteBuffer method300(int var1) {
      RSByteBuffer var2 = this.method3425(var1);
      return var2;
   }

   public Class388 method294() {
      return this.aClass388_2691;
   }

   public Class388 method321() {
      return this.aClass388_2691;
   }

   public synchronized boolean method315() {
      return this.aBool2750;
   }

   int method3441() {
      return this.anInt2755;
   }

   int method3442() {
      int var1 = this.aByteArray2754[this.anInt2755] >> this.anInt2756 & 1;
      ++this.anInt2756;
      this.anInt2755 += this.anInt2756 >> 3;
      this.anInt2756 &= 7;
      return var1;
   }

   int method3443() {
      int var1 = this.aByteArray2754[this.anInt2755] >> this.anInt2756 & 1;
      ++this.anInt2756;
      this.anInt2755 += this.anInt2756 >> 3;
      this.anInt2756 &= 7;
      return var1;
   }

   public void method313() {
      if(this.method293() == Class376.aClass376_3911 || this.method293() == Class376.aClass376_3908 || this.method293() == Class376.aClass376_3905) {
         this.method3401(Class376.aClass376_3907);
         this.method3434();
      }
   }

   void method3444() {
      this.aByteArray2754 = null;
   }

   void method3445() {
      this.aByteArray2754 = null;
   }

   int method3446() {
      if(this.aBool2732) {
         return this.anInt2701;
      } else {
         throw new RuntimeException("");
      }
   }

   int method3447(float var1) {
      int var2 = (int)(var1 * 32767.0F + 32768.0F);
      return var2 > '\uffff'?'\uffff':(var2 < 0?0:var2);
   }

   void method3448() {
      if(this.method293() != Class376.aClass376_3911) {
         if(this.method293() != Class376.aClass376_3906) {
            if(!this.aBool2750 || (float)(this.anInt2733 / this.method3402()) <= this.aFloat2703) {
               if(!this.method3412()) {
                  RSByteBuffer var1 = (RSByteBuffer)(this.aList2726 != null && !this.aList2726.isEmpty()?this.aList2726.get(0):null);
                  if(var1 == null) {
                     if(!this.aBool2731) {
                        this.method3401(Class376.aClass376_3906);
                        this.anInterface48_2695.method228(1636157686);
                        this.aBool2731 = true;
                     }

                     return;
                  }

                  this.aBool2731 = false;
                  this.aBool2725 = true;
                  this.aList2726.remove(0);
                  this.method3411(var1);
               }

               this.method3437();
            }
         }
      }
   }

   public Class375 method297() {
      return this.aClass375_2699;
   }

   synchronized void method3449() {
      int var1 = this.aClass526_Sub36_2727 != null?this.aClass526_Sub36_2727.pos * 301018015:0;
      int var2 = 0;

      Iterator var3;
      RSByteBuffer var4;
      for(var3 = this.aList2744.iterator(); var3.hasNext(); var2 += var4.pos * 301018015) {
         var4 = (RSByteBuffer)var3.next();
      }

      if(this.aClass526_Sub36_2727 != null) {
         if(this.aClass526_Sub36_2727.buffer.length - this.aClass526_Sub36_2727.pos * 301018015 < var2) {
            RSByteBuffer var34 = this.method3426(var2 + this.anInt2728);
            var34.method9619(this.aClass526_Sub36_2727.buffer, this.aClass526_Sub36_2727.pos * 301018015 - this.anInt2729, this.anInt2728, 1998091613);
            this.aClass526_Sub36_2727.method9675(-893748495);
            this.aClass526_Sub36_2727 = var34;
            var1 = this.anInt2729;
         }
      } else {
         this.aClass526_Sub36_2727 = this.method3426(var2);
         this.anInt2728 = 0;
         var1 = 0;
      }

      var3 = this.aList2744.iterator();

      while(var3.hasNext()) {
         var4 = (RSByteBuffer)var3.next();
         this.aClass526_Sub36_2727.method9619(var4.buffer, 0, var4.pos * 301018015, 1463988073);
         this.anInt2728 += var4.pos * 301018015;
         var4.method9675(1171679734);
      }

      this.aClass526_Sub36_2727.pos = (var1 - this.anInt2729) * 801976415;
      this.anInt2729 = 0;
      this.aList2744.clear();

      label284:
      while(true) {
         if(this.aBool2725) {
            if(this.aClass526_Sub36_2727.pos * 301018015 < this.aClass526_Sub36_2727.buffer.length) {
               if(this.aBool2750 && (float)(this.anInt2733 / this.method3402()) > this.aFloat2703) {
                  return;
               }

               if(this.aClass526_Sub36_2727 != null && this.anInt2728 >= 27) {
                  int var35 = this.aClass526_Sub36_2727.pos * 301018015;
                  byte var36 = 0;
                  int var5 = 0;
                  if(!this.method3413(this.aClass526_Sub36_2727)) {
                     return;
                  }

                  ++this.anInt2741;
                  if(this.anInt2738 < 0) {
                     ++this.anInt2730;
                  }

                  this.aList2720.clear();
                  this.aList2696.clear();
                  this.aClass526_Sub36_2727.readUnsignedByte(-808250593);
                  int var6 = this.aClass526_Sub36_2727.readUnsignedByte(188844053);
                  int var7 = this.aClass526_Sub36_2727.readUnsignedByte(-1414837751) & 255 | (this.aClass526_Sub36_2727.readUnsignedByte(-568154758) & 255) << 8 | (this.aClass526_Sub36_2727.readUnsignedByte(2118629060) & 255) << 16 | this.aClass526_Sub36_2727.readUnsignedByte(691627141) << 24;
                  int var37 = var7 - var36;
                  this.aClass526_Sub36_2727.pos += -53279248;
                  int var8 = this.aClass526_Sub36_2727.readUnsignedByte(908344912);
                  int var9 = this.aClass526_Sub36_2727.pos * 301018015;
                  int var10 = var9 + var8;
                  if(var10 > var35 + this.anInt2728) {
                     this.aClass526_Sub36_2727.pos = (var35 + this.anInt2728) * 801976415;
                     this.anInt2729 = this.aClass526_Sub36_2727.pos * 301018015 - var35;
                     this.aBool2725 = false;
                  }

                  int var11 = var10;
                  int var12 = 0;
                  int var14;
                  if(this.aBool2725) {
                     for(int var13 = 0; var13 < var8; ++var13) {
                        var14 = this.aClass526_Sub36_2727.buffer[var9++] & 255;
                        var10 += var14;
                        var12 += var14;
                        if(var10 > var35 + this.anInt2728) {
                           this.aClass526_Sub36_2727.pos = (var35 + this.anInt2728) * 801976415;
                           this.anInt2729 = this.aClass526_Sub36_2727.pos * 301018015 - var35;
                           this.aBool2725 = false;
                           break;
                        }

                        if(var14 < 255) {
                           this.aList2720.add(Integer.valueOf(var11));
                           this.aList2696.add(Integer.valueOf(var12));
                           var11 = var10;
                           var12 = 0;
                        }
                     }
                  }

                  if(!this.aBool2725) {
                     continue;
                  }

                  var14 = -1;
                  Iterator var15 = this.aList2720.iterator();
                  Iterator var16 = this.aList2696.iterator();
                  boolean var17 = false;
                  this.anInt2708 = 0;

                  while(true) {
                     while(var15.hasNext()) {
                        Integer var18 = (Integer)var15.next();
                        Integer var19 = (Integer)var16.next();
                        ++var14;
                        if(this.method326() && this.aBool2751 && this.anInt2741 < this.anInt2730 && var14 < this.anInt2738) {
                           this.anInt2740 += var17?0:var37;
                           var17 = true;
                        } else {
                           this.anAtomicReference2746.set((Object)null);
                           boolean var20 = this.method3430(this.aClass526_Sub36_2727.buffer, var18.intValue(), var19.intValue(), this.anAtomicReference2746);
                           Class239[] var21 = (Class239[])((Class239[])this.anAtomicReference2746.get());
                           if(var20 && (!this.aBool2751 || this.anInt2741 >= this.anInt2730 || var14 >= this.anInt2738)) {
                              if(var21 != null) {
                                 int var22 = var21[0].anInt2445;
                                 this.anInt2747 += var22;
                                 if(this.anInt2747 > var7 && var6 == 4) {
                                    this.anInt2708 = this.anInt2747 - var7 - this.anInt2708;
                                    var22 -= this.anInt2708;
                                    if(this.anInt2708 > var21[0].anInt2445) {
                                       this.anInt2708 = var21[0].anInt2445;
                                    }

                                    if(var22 < 0) {
                                       var22 = 0;
                                    }
                                 }

                                 int var23 = 0;
                                 int var24 = this.method39(var22) * var21.length;
                                 int var25;
                                 if(this.aBool2751 && this.anInt2740 < this.anInt2715) {
                                    var25 = var24;
                                    var24 -= this.method39(this.anInt2715 - this.anInt2740);
                                    if(var24 <= 0) {
                                       this.anInt2740 += this.method301(var25);
                                       this.method3409(var21);
                                       var21 = null;
                                       continue;
                                    }

                                    var23 += this.anInt2715 - this.anInt2740;
                                 }

                                 if(this.anInt2740 + var22 > this.anInt2702 && (this.anInt2743 < this.anInt2742 || this.anInt2742 < 0) && this.aBool2698) {
                                    var24 -= this.method39(this.anInt2740 + var22 - this.anInt2702 - 1);
                                    if(var24 <= 0) {
                                       this.method3409(var21);
                                       var21 = null;
                                       continue;
                                    }
                                 }

                                 var25 = this.method285();
                                 if(this.method3455() < this.method285()) {
                                    int var26 = this.method285() - this.method3455();
                                    var24 += var24 / this.method3455() * var26;
                                 }

                                 RSByteBuffer var38 = this.method3426(var24);

                                 for(int var27 = var23; var27 < var22; ++var27) {
                                    boolean var28 = this.aBool2751;
                                    if(this.anInt2742 != 0) {
                                       if(this.anInt2740 == this.anInt2715) {
                                          if(this.anInt2706 < 0) {
                                             this.anInt2706 = this.anInt2737;
                                             this.anInt2738 = var14;
                                          }

                                          this.aBool2751 = false;
                                       }

                                       if(this.anInt2740 == this.anInt2702 && this.anInt2736 < 0) {
                                          this.anInt2736 = this.anInt2737;
                                       }

                                       if(this.anInt2740 > this.anInt2702 && (this.anInt2743 < this.anInt2742 || this.anInt2742 < 0) && this.aBool2698) {
                                          var28 = true;
                                       }
                                    }

                                    if(var28 && (this.anInt2740 < this.anInt2715 || this.anInt2740 > this.anInt2702)) {
                                       ++this.anInt2740;
                                       ++var5;
                                       if(var5 > var37) {
                                          throw new RuntimeException();
                                       }
                                    } else {
                                       for(int var29 = 0; var29 < var25; ++var29) {
                                          float var30;
                                          if(var29 < var21.length) {
                                             var30 = var21[var29].aFloatArray2446[var27];
                                          } else {
                                             var30 = var21[var29 % this.method3455()].aFloatArray2446[var27];
                                          }

                                          int var31;
                                          if(this.aClass388_2691 == Class388.aClass388_4057) {
                                             var31 = this.method3423(var30);
                                             if(this.aClass375_2699 == Class375.aClass375_3902) {
                                                var38.method9610(var31, (byte)0);
                                             } else {
                                                var38.writeShort(var31, -805078716);
                                             }
                                          } else if(this.aClass388_2691 == Class388.aClass388_4062) {
                                             var31 = this.method3447(var30);
                                             if(this.aClass375_2699 == Class375.aClass375_3902) {
                                                var38.method9610(var31, (byte)0);
                                             } else {
                                                var38.writeShort(var31, -805078716);
                                             }
                                          } else if(this.aClass388_2691 == Class388.aClass388_4059) {
                                             var31 = this.method3431(var30);
                                             var38.writeByte(var31, 492443021);
                                          } else if(this.aClass388_2691 == Class388.aClass388_4058) {
                                             var31 = this.method3451(var30);
                                             var38.writeByte(var31, -1629291246);
                                          }
                                       }

                                       ++this.anInt2740;
                                       ++var5;
                                    }
                                 }

                                 List var39 = this.aList2739;
                                 synchronized(var39) {
                                    this.anInt2733 += this.method301(var38.pos * 301018015) / this.method285();
                                    this.aList2739.add(var38);
                                 }
                              }
                           } else if(this.method326()) {
                              this.anInt2748 = 0;
                              if(this.aClass239Array2712 == null || this.aClass239Array2712 != null && (this.aClass239Array2712.length != this.anInt2701 || this.aClass239Array2712[0].anInt2445 != this.anInt2705)) {
                                 if(this.aClass239Array2712 != null) {
                                    this.method3409(this.aClass239Array2712);
                                 }

                                 this.aClass239Array2712 = this.method3406(this.anInt2701, this.anInt2705);
                              }
                           }

                           this.method3409(var21);
                           var21 = null;
                        }
                     }

                     this.aClass526_Sub36_2727.pos = var10 * 801976415;
                     this.anInt2728 -= var10 - var35;
                     continue label284;
                  }
               }

               if(this.aClass526_Sub36_2727 != null) {
                  this.anInt2729 = this.anInt2728;
                  this.aClass526_Sub36_2727.pos += this.anInt2728 * 801976415;
               }

               this.aBool2725 = false;
               return;
            }

            this.aBool2725 = false;
         }

         return;
      }
   }

   synchronized void method3450() {
      int var1 = this.aClass526_Sub36_2727 != null?this.aClass526_Sub36_2727.pos * 301018015:0;
      int var2 = 0;

      Iterator var3;
      RSByteBuffer var4;
      for(var3 = this.aList2744.iterator(); var3.hasNext(); var2 += var4.pos * 301018015) {
         var4 = (RSByteBuffer)var3.next();
      }

      if(this.aClass526_Sub36_2727 != null) {
         if(this.aClass526_Sub36_2727.buffer.length - this.aClass526_Sub36_2727.pos * 301018015 < var2) {
            RSByteBuffer var34 = this.method3426(var2 + this.anInt2728);
            var34.method9619(this.aClass526_Sub36_2727.buffer, this.aClass526_Sub36_2727.pos * 301018015 - this.anInt2729, this.anInt2728, 2134370098);
            this.aClass526_Sub36_2727.method9675(773317766);
            this.aClass526_Sub36_2727 = var34;
            var1 = this.anInt2729;
         }
      } else {
         this.aClass526_Sub36_2727 = this.method3426(var2);
         this.anInt2728 = 0;
         var1 = 0;
      }

      var3 = this.aList2744.iterator();

      while(var3.hasNext()) {
         var4 = (RSByteBuffer)var3.next();
         this.aClass526_Sub36_2727.method9619(var4.buffer, 0, var4.pos * 301018015, 1541780988);
         this.anInt2728 += var4.pos * 301018015;
         var4.method9675(-230949612);
      }

      this.aClass526_Sub36_2727.pos = (var1 - this.anInt2729) * 801976415;
      this.anInt2729 = 0;
      this.aList2744.clear();

      label284:
      while(true) {
         if(this.aBool2725) {
            if(this.aClass526_Sub36_2727.pos * 301018015 < this.aClass526_Sub36_2727.buffer.length) {
               if(this.aBool2750 && (float)(this.anInt2733 / this.method3402()) > this.aFloat2703) {
                  return;
               }

               if(this.aClass526_Sub36_2727 != null && this.anInt2728 >= 27) {
                  int var35 = this.aClass526_Sub36_2727.pos * 301018015;
                  byte var36 = 0;
                  int var5 = 0;
                  if(!this.method3413(this.aClass526_Sub36_2727)) {
                     return;
                  }

                  ++this.anInt2741;
                  if(this.anInt2738 < 0) {
                     ++this.anInt2730;
                  }

                  this.aList2720.clear();
                  this.aList2696.clear();
                  this.aClass526_Sub36_2727.readUnsignedByte(1895736125);
                  int var6 = this.aClass526_Sub36_2727.readUnsignedByte(-2077864702);
                  int var7 = this.aClass526_Sub36_2727.readUnsignedByte(1809661229) & 255 | (this.aClass526_Sub36_2727.readUnsignedByte(-843361506) & 255) << 8 | (this.aClass526_Sub36_2727.readUnsignedByte(2005975663) & 255) << 16 | this.aClass526_Sub36_2727.readUnsignedByte(-371688870) << 24;
                  int var37 = var7 - var36;
                  this.aClass526_Sub36_2727.pos += -53279248;
                  int var8 = this.aClass526_Sub36_2727.readUnsignedByte(1897828288);
                  int var9 = this.aClass526_Sub36_2727.pos * 301018015;
                  int var10 = var9 + var8;
                  if(var10 > var35 + this.anInt2728) {
                     this.aClass526_Sub36_2727.pos = (var35 + this.anInt2728) * 801976415;
                     this.anInt2729 = this.aClass526_Sub36_2727.pos * 301018015 - var35;
                     this.aBool2725 = false;
                  }

                  int var11 = var10;
                  int var12 = 0;
                  int var14;
                  if(this.aBool2725) {
                     for(int var13 = 0; var13 < var8; ++var13) {
                        var14 = this.aClass526_Sub36_2727.buffer[var9++] & 255;
                        var10 += var14;
                        var12 += var14;
                        if(var10 > var35 + this.anInt2728) {
                           this.aClass526_Sub36_2727.pos = (var35 + this.anInt2728) * 801976415;
                           this.anInt2729 = this.aClass526_Sub36_2727.pos * 301018015 - var35;
                           this.aBool2725 = false;
                           break;
                        }

                        if(var14 < 255) {
                           this.aList2720.add(Integer.valueOf(var11));
                           this.aList2696.add(Integer.valueOf(var12));
                           var11 = var10;
                           var12 = 0;
                        }
                     }
                  }

                  if(!this.aBool2725) {
                     continue;
                  }

                  var14 = -1;
                  Iterator var15 = this.aList2720.iterator();
                  Iterator var16 = this.aList2696.iterator();
                  boolean var17 = false;
                  this.anInt2708 = 0;

                  while(true) {
                     while(var15.hasNext()) {
                        Integer var18 = (Integer)var15.next();
                        Integer var19 = (Integer)var16.next();
                        ++var14;
                        if(this.method326() && this.aBool2751 && this.anInt2741 < this.anInt2730 && var14 < this.anInt2738) {
                           this.anInt2740 += var17?0:var37;
                           var17 = true;
                        } else {
                           this.anAtomicReference2746.set((Object)null);
                           boolean var20 = this.method3430(this.aClass526_Sub36_2727.buffer, var18.intValue(), var19.intValue(), this.anAtomicReference2746);
                           Class239[] var21 = (Class239[])((Class239[])this.anAtomicReference2746.get());
                           if(var20 && (!this.aBool2751 || this.anInt2741 >= this.anInt2730 || var14 >= this.anInt2738)) {
                              if(var21 != null) {
                                 int var22 = var21[0].anInt2445;
                                 this.anInt2747 += var22;
                                 if(this.anInt2747 > var7 && var6 == 4) {
                                    this.anInt2708 = this.anInt2747 - var7 - this.anInt2708;
                                    var22 -= this.anInt2708;
                                    if(this.anInt2708 > var21[0].anInt2445) {
                                       this.anInt2708 = var21[0].anInt2445;
                                    }

                                    if(var22 < 0) {
                                       var22 = 0;
                                    }
                                 }

                                 int var23 = 0;
                                 int var24 = this.method39(var22) * var21.length;
                                 int var25;
                                 if(this.aBool2751 && this.anInt2740 < this.anInt2715) {
                                    var25 = var24;
                                    var24 -= this.method39(this.anInt2715 - this.anInt2740);
                                    if(var24 <= 0) {
                                       this.anInt2740 += this.method301(var25);
                                       this.method3409(var21);
                                       var21 = null;
                                       continue;
                                    }

                                    var23 += this.anInt2715 - this.anInt2740;
                                 }

                                 if(this.anInt2740 + var22 > this.anInt2702 && (this.anInt2743 < this.anInt2742 || this.anInt2742 < 0) && this.aBool2698) {
                                    var24 -= this.method39(this.anInt2740 + var22 - this.anInt2702 - 1);
                                    if(var24 <= 0) {
                                       this.method3409(var21);
                                       var21 = null;
                                       continue;
                                    }
                                 }

                                 var25 = this.method285();
                                 if(this.method3455() < this.method285()) {
                                    int var26 = this.method285() - this.method3455();
                                    var24 += var24 / this.method3455() * var26;
                                 }

                                 RSByteBuffer var38 = this.method3426(var24);

                                 for(int var27 = var23; var27 < var22; ++var27) {
                                    boolean var28 = this.aBool2751;
                                    if(this.anInt2742 != 0) {
                                       if(this.anInt2740 == this.anInt2715) {
                                          if(this.anInt2706 < 0) {
                                             this.anInt2706 = this.anInt2737;
                                             this.anInt2738 = var14;
                                          }

                                          this.aBool2751 = false;
                                       }

                                       if(this.anInt2740 == this.anInt2702 && this.anInt2736 < 0) {
                                          this.anInt2736 = this.anInt2737;
                                       }

                                       if(this.anInt2740 > this.anInt2702 && (this.anInt2743 < this.anInt2742 || this.anInt2742 < 0) && this.aBool2698) {
                                          var28 = true;
                                       }
                                    }

                                    if(var28 && (this.anInt2740 < this.anInt2715 || this.anInt2740 > this.anInt2702)) {
                                       ++this.anInt2740;
                                       ++var5;
                                       if(var5 > var37) {
                                          throw new RuntimeException();
                                       }
                                    } else {
                                       for(int var29 = 0; var29 < var25; ++var29) {
                                          float var30;
                                          if(var29 < var21.length) {
                                             var30 = var21[var29].aFloatArray2446[var27];
                                          } else {
                                             var30 = var21[var29 % this.method3455()].aFloatArray2446[var27];
                                          }

                                          int var31;
                                          if(this.aClass388_2691 == Class388.aClass388_4057) {
                                             var31 = this.method3423(var30);
                                             if(this.aClass375_2699 == Class375.aClass375_3902) {
                                                var38.method9610(var31, (byte)0);
                                             } else {
                                                var38.writeShort(var31, -805078716);
                                             }
                                          } else if(this.aClass388_2691 == Class388.aClass388_4062) {
                                             var31 = this.method3447(var30);
                                             if(this.aClass375_2699 == Class375.aClass375_3902) {
                                                var38.method9610(var31, (byte)0);
                                             } else {
                                                var38.writeShort(var31, -805078716);
                                             }
                                          } else if(this.aClass388_2691 == Class388.aClass388_4059) {
                                             var31 = this.method3431(var30);
                                             var38.writeByte(var31, -854171040);
                                          } else if(this.aClass388_2691 == Class388.aClass388_4058) {
                                             var31 = this.method3451(var30);
                                             var38.writeByte(var31, -1019053391);
                                          }
                                       }

                                       ++this.anInt2740;
                                       ++var5;
                                    }
                                 }

                                 List var39 = this.aList2739;
                                 synchronized(var39) {
                                    this.anInt2733 += this.method301(var38.pos * 301018015) / this.method285();
                                    this.aList2739.add(var38);
                                 }
                              }
                           } else if(this.method326()) {
                              this.anInt2748 = 0;
                              if(this.aClass239Array2712 == null || this.aClass239Array2712 != null && (this.aClass239Array2712.length != this.anInt2701 || this.aClass239Array2712[0].anInt2445 != this.anInt2705)) {
                                 if(this.aClass239Array2712 != null) {
                                    this.method3409(this.aClass239Array2712);
                                 }

                                 this.aClass239Array2712 = this.method3406(this.anInt2701, this.anInt2705);
                              }
                           }

                           this.method3409(var21);
                           var21 = null;
                        }
                     }

                     this.aClass526_Sub36_2727.pos = var10 * 801976415;
                     this.anInt2728 -= var10 - var35;
                     continue label284;
                  }
               }

               if(this.aClass526_Sub36_2727 != null) {
                  this.anInt2729 = this.anInt2728;
                  this.aClass526_Sub36_2727.pos += this.anInt2728 * 801976415;
               }

               this.aBool2725 = false;
               return;
            }

            this.aBool2725 = false;
         }

         return;
      }
   }

   int method3451(float var1) {
      int var2 = (int)(var1 * 127.0F + 128.0F);
      return var2 > 255?255:(var2 < 0?0:var2);
   }

   int method3452() {
      if(this.aBool2732) {
         return this.anInt2701;
      } else {
         throw new RuntimeException("");
      }
   }

   int method3453() {
      if(this.aBool2732) {
         return this.anInt2701;
      } else {
         throw new RuntimeException("");
      }
   }

   public RSByteBuffer method317(int var1) {
      RSByteBuffer var2 = this.method3425(var1);
      return var2;
   }

   int method3454() {
      int var1 = this.aByteArray2754[this.anInt2755] >> this.anInt2756 & 1;
      ++this.anInt2756;
      this.anInt2755 += this.anInt2756 >> 3;
      this.anInt2756 &= 7;
      return var1;
   }

   int method3455() {
      if(this.aBool2732) {
         return this.anInt2701;
      } else {
         throw new RuntimeException("");
      }
   }

   public void method314(boolean var1, int var2, int var3, int var4) {
      this.aBool2698 = var1;
      this.anInt2742 = var2;
      this.anInt2715 = var3;
      this.anInt2702 = var4;
   }

   public void method325(boolean var1, int var2, int var3, int var4) {
      this.aBool2698 = var1;
      this.anInt2742 = var2;
      this.anInt2715 = var3;
      this.anInt2702 = var4;
   }

   public int method329(int var1) {
      return var1 * (this.method296().anInt4060 * 1260438277 / 8);
   }

   public int method322(int var1) {
      return var1 * (this.method296().anInt4060 * 1260438277 / 8);
   }
}
