package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3;
import com.jagex.Class184_Sub2;
import com.jagex.Class335;
import com.jagex.Class337;
import com.jagex.Class353;
import com.jagex.Class359;
import com.jagex.Class374;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.Interface35;
import com.jagex.Interface43;
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class345 {
   Class184_Sub2 aClass184_Sub2_3597;
   Interface21 anInterface21_3585;
   Interface23 anInterface23_3589;
   Class166 aClass166_3594;
   Class184_Sub2 aClass184_Sub2_3578;
   Interface43 anInterface43_3587;
   Interface21 anInterface21_3584;
   Interface43 anInterface43_3582;
   Interface21 anInterface21_3580;
   Interface43 anInterface43_3583;
   Interface21 anInterface21_3586;
   Interface23 anInterface23_3592;
   Vector aVector3596 = new Vector();
   int anInt3593 = 0;
   int anInt3599 = 0;
   int anInt3600 = 0;
   Class174_Sub3 aClass174_Sub3_3595;
   int anInt3590;
   int anInt3591;
   Interface35 anInterface35_3588;
   Class335 aClass335_3598;
   boolean aBool3579;
   int anInt3581;

   void method4444() {
      if(this.aClass184_Sub2_3597 != null) {
         this.aClass184_Sub2_3597.method140();
         this.aClass184_Sub2_3597 = null;
      }

      if(this.anInterface21_3585 != null) {
         this.anInterface21_3585.method140();
         this.anInterface21_3585 = null;
      }

      if(this.anInterface23_3589 != null) {
         this.anInterface23_3589.method140();
         this.anInterface23_3589 = null;
      }

      if(this.aClass184_Sub2_3578 != null) {
         this.aClass184_Sub2_3578.method140();
      }

      if(this.anInterface21_3584 != null) {
         this.anInterface21_3584.method140();
      }

      if(this.anInterface21_3580 != null) {
         this.anInterface21_3580.method140();
      }

      if(this.anInterface21_3586 != null) {
         this.anInterface21_3586.method140();
      }

      if(this.anInterface43_3587 != null) {
         this.anInterface43_3587.method140();
      }

      if(this.anInterface43_3582 != null) {
         this.anInterface43_3582.method140();
      }

      if(this.anInterface43_3583 != null) {
         this.anInterface43_3583.method140();
      }

      if(this.anInterface23_3592 != null) {
         this.anInterface23_3592.method140();
      }

      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class337 var3 = (Class337)this.aVector3596.elementAt(var2);
         var3.method4385();
      }

   }

   Class337 method4445(int var1) {
      return (Class337)this.aVector3596.elementAt(var1);
   }

   void method4446() {
      this.aClass174_Sub3_3595.method8820(0, this.anInterface35_3588);
      this.aClass174_Sub3_3595.method8833(this.aClass335_3598);
      this.aClass174_Sub3_3595.method8825(Class374.aClass374_3898, 0, 1);
   }

   void method4447() {
      this.method4467();
      switch(this.anInt3599) {
      case 0:
         this.aClass166_3594 = Class166.aClass166_1884;
         break;
      case 1:
         this.aClass166_3594 = Class166.aClass166_1893;
         break;
      case 2:
         this.aClass166_3594 = Class166.aClass166_1892;
         break;
      default:
         throw new RuntimeException();
      }

      this.aClass184_Sub2_3578 = this.aClass174_Sub3_3595.method2257();
      if(this.aClass174_Sub3_3595.anInt9819 > 1 && this.aClass174_Sub3_3595.aBool9794 && this.aClass174_Sub3_3595.aBool9829) {
         this.aClass184_Sub2_3597 = this.aClass174_Sub3_3595.method2257();
         this.anInterface21_3585 = this.aClass174_Sub3_3595.method2258(this.anInt3590, this.anInt3591, Class144.aClass144_1680, this.aClass166_3594, this.aClass174_Sub3_3595.anInt9819);
         this.anInterface23_3589 = this.aClass174_Sub3_3595.method2259(this.anInt3590, this.anInt3591, this.aClass174_Sub3_3595.anInt9819);
      }

      this.anInterface43_3587 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3584 = this.anInterface43_3587.method344(0);
      this.anInterface43_3582 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3580 = this.anInterface43_3582.method344(0);
      this.anInterface43_3583 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3586 = this.anInterface43_3583.method344(0);
      this.anInterface23_3592 = this.aClass174_Sub3_3595.method2263(this.anInterface43_3583.method1(), this.anInterface43_3583.method94());
      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class337 var3 = (Class337)this.aVector3596.elementAt(var2);
         var3.method4371(this.anInt3590, this.anInt3591);
      }

   }

   boolean method4448(Class337 var1) {
      Vector var2 = new Vector();
      boolean var3 = false;

      for(int var4 = 0; var4 < this.aVector3596.size(); ++var4) {
         if(!var3 && var1.method4388() < this.method4445(var4).method4388()) {
            var3 = true;
            if(!this.method4464(var2, var2.size(), var1)) {
               return false;
            }
         }

         var2.addElement(this.method4445(var4));
      }

      if(!var3 && !this.method4464(var2, var2.size(), var1)) {
         return false;
      } else {
         this.aVector3596 = var2;
         return true;
      }
   }

   void method4449(Class337 var1) {
      var1.method4385();
      var1.aBool3525 = false;
      this.aVector3596.removeElement(var1);
   }

   Class345(Class174_Sub3 var1, int var2, int var3) {
      this.aClass174_Sub3_3595 = var1;
      this.aClass166_3594 = Class166.aClass166_1884;
      this.anInt3590 = var2;
      this.anInt3591 = var3;
   }

   boolean method4450() {
      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         if(!((Class337)this.aVector3596.elementAt(var2)).method4379()) {
            return false;
         }
      }

      return true;
   }

   void method4451() {
      if(this.anInterface35_3588 == null) {
         this.anInterface35_3588 = this.aClass174_Sub3_3595.method8818(false);
         this.anInterface35_3588.method249(12, 4);
         ByteBuffer var1 = this.aClass174_Sub3_3595.aByteBuffer9684;
         var1.clear();
         var1.putFloat(0.0F);
         var1.putFloat(1.0F);
         var1.putFloat(2.0F);
         this.anInterface35_3588.method235(0, var1.position(), this.aClass174_Sub3_3595.aLong9685);
         this.aClass335_3598 = this.aClass174_Sub3_3595.method8748(new Class359[]{new Class359(Class353.aClass353_3672)});
      }
   }

   void method4452(int var1, int var2) {
      if(this.aBool3579) {
         if(this.aClass184_Sub2_3597 != null) {
            this.aClass174_Sub3_3595.method2456(this.aClass184_Sub2_3597, (byte)0);
            this.aClass174_Sub3_3595.method2623(this.aClass184_Sub2_3578, (short)128);
            this.aClass184_Sub2_3597.method8470(0, 0, this.anInt3590, this.anInt3591, 0, 0, true, this.anInterface23_3592 != null);
         }

         this.method4453(var1, var2);
         this.aBool3579 = false;
      }

   }

   void method4453(int var1, int var2) {
      this.aClass174_Sub3_3595.method2281(true);
      this.aClass174_Sub3_3595.method8848();
      this.aClass174_Sub3_3595.method8807(0);
      this.aClass174_Sub3_3595.method8793(1);
      this.aClass174_Sub3_3595.method2278();
      this.aClass184_Sub2_3578.method8476((Interface23)null);
      this.aClass174_Sub3_3595.method8752(0, 0);
      int var3 = this.aVector3596.size();
      Vector var4 = this.aVector3596;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         if(((Class337)this.aVector3596.elementAt(var5)).method4379()) {
            var4 = new Vector();

            for(int var6 = 0; var6 < var3; ++var6) {
               if(!((Class337)this.aVector3596.elementAt(var6)).method4379()) {
                  var4.addElement(this.aVector3596.elementAt(var6));
               }
            }

            var3 = var4.size();
            break;
         }
      }

      this.anInterface43_3583.method265();

      for(var5 = 0; var5 < var3; ++var5) {
         Class337 var14 = (Class337)var4.elementAt(var5);
         int var7 = var14.method4391();
         boolean var8 = var5 == var3 - 1;
         boolean var9 = false;

         for(int var10 = 0; var10 < var7; ++var10) {
            if(var10 == var7 - 1) {
               if(var8) {
                  this.aClass174_Sub3_3595.method2456(this.aClass184_Sub2_3578, (byte)0);
                  this.aClass174_Sub3_3595.method2538(this.anInt3581, this.anInt3593, this.anInt3581 + var1, this.anInt3593 + var2);
               } else {
                  var9 = true;
                  this.aClass184_Sub2_3578.method8465(0, this.anInterface21_3586);
               }
            } else {
               this.aClass184_Sub2_3578.method8465(0, this.anInterface21_3580);
            }

            Interface43 var11 = this.anInterface43_3587;
            if(var10 == 0) {
               var11 = this.anInterface43_3583;
            }

            var14.method4372(var10, this.aClass184_Sub2_3578, var11, this.anInterface23_3592, this.anInterface43_3583, var8 && var10 == var7 - 1);
            this.method4446();
            var14.method4373(var10);
            if(var9) {
               this.anInterface43_3583.method265();
            }

            Interface43 var12 = this.anInterface43_3587;
            this.anInterface43_3587 = this.anInterface43_3582;
            this.anInterface43_3582 = var12;
            Interface21 var13 = this.anInterface21_3584;
            this.anInterface21_3584 = this.anInterface21_3580;
            this.anInterface21_3580 = var13;
         }
      }

      this.aClass174_Sub3_3595.method8807(1);
      this.aClass174_Sub3_3595.method8793(0);
      this.aClass174_Sub3_3595.method2281(false);
      this.aClass174_Sub3_3595.method2278();
      var4 = null;
   }

   void method4454() {
      if(this.aClass184_Sub2_3597 != null) {
         this.aClass184_Sub2_3597.method140();
         this.aClass184_Sub2_3597 = null;
      }

      if(this.anInterface21_3585 != null) {
         this.anInterface21_3585.method140();
         this.anInterface21_3585 = null;
      }

      if(this.anInterface23_3589 != null) {
         this.anInterface23_3589.method140();
         this.anInterface23_3589 = null;
      }

      if(this.aClass184_Sub2_3578 != null) {
         this.aClass184_Sub2_3578.method140();
      }

      if(this.anInterface21_3584 != null) {
         this.anInterface21_3584.method140();
      }

      if(this.anInterface21_3580 != null) {
         this.anInterface21_3580.method140();
      }

      if(this.anInterface21_3586 != null) {
         this.anInterface21_3586.method140();
      }

      if(this.anInterface43_3587 != null) {
         this.anInterface43_3587.method140();
      }

      if(this.anInterface43_3582 != null) {
         this.anInterface43_3582.method140();
      }

      if(this.anInterface43_3583 != null) {
         this.anInterface43_3583.method140();
      }

      if(this.anInterface23_3592 != null) {
         this.anInterface23_3592.method140();
      }

      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class337 var3 = (Class337)this.aVector3596.elementAt(var2);
         var3.method4385();
      }

   }

   void method4455() {
      if(this.anInterface35_3588 == null) {
         this.anInterface35_3588 = this.aClass174_Sub3_3595.method8818(false);
         this.anInterface35_3588.method249(12, 4);
         ByteBuffer var1 = this.aClass174_Sub3_3595.aByteBuffer9684;
         var1.clear();
         var1.putFloat(0.0F);
         var1.putFloat(1.0F);
         var1.putFloat(2.0F);
         this.anInterface35_3588.method235(0, var1.position(), this.aClass174_Sub3_3595.aLong9685);
         this.aClass335_3598 = this.aClass174_Sub3_3595.method8748(new Class359[]{new Class359(Class353.aClass353_3672)});
      }
   }

   void method4456() {
      if(this.aClass184_Sub2_3597 != null) {
         this.aClass184_Sub2_3597.method140();
         this.aClass184_Sub2_3597 = null;
      }

      if(this.anInterface21_3585 != null) {
         this.anInterface21_3585.method140();
         this.anInterface21_3585 = null;
      }

      if(this.anInterface23_3589 != null) {
         this.anInterface23_3589.method140();
         this.anInterface23_3589 = null;
      }

      if(this.aClass184_Sub2_3578 != null) {
         this.aClass184_Sub2_3578.method140();
      }

      if(this.anInterface21_3584 != null) {
         this.anInterface21_3584.method140();
      }

      if(this.anInterface21_3580 != null) {
         this.anInterface21_3580.method140();
      }

      if(this.anInterface21_3586 != null) {
         this.anInterface21_3586.method140();
      }

      if(this.anInterface43_3587 != null) {
         this.anInterface43_3587.method140();
      }

      if(this.anInterface43_3582 != null) {
         this.anInterface43_3582.method140();
      }

      if(this.anInterface43_3583 != null) {
         this.anInterface43_3583.method140();
      }

      if(this.anInterface23_3592 != null) {
         this.anInterface23_3592.method140();
      }

      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class337 var3 = (Class337)this.aVector3596.elementAt(var2);
         var3.method4385();
      }

   }

   void method4457() {
      this.aClass174_Sub3_3595.method8820(0, this.anInterface35_3588);
      this.aClass174_Sub3_3595.method8833(this.aClass335_3598);
      this.aClass174_Sub3_3595.method8825(Class374.aClass374_3898, 0, 1);
   }

   void method4458() {
      this.method4467();
      switch(this.anInt3599) {
      case 0:
         this.aClass166_3594 = Class166.aClass166_1884;
         break;
      case 1:
         this.aClass166_3594 = Class166.aClass166_1893;
         break;
      case 2:
         this.aClass166_3594 = Class166.aClass166_1892;
         break;
      default:
         throw new RuntimeException();
      }

      this.aClass184_Sub2_3578 = this.aClass174_Sub3_3595.method2257();
      if(this.aClass174_Sub3_3595.anInt9819 > 1 && this.aClass174_Sub3_3595.aBool9794 && this.aClass174_Sub3_3595.aBool9829) {
         this.aClass184_Sub2_3597 = this.aClass174_Sub3_3595.method2257();
         this.anInterface21_3585 = this.aClass174_Sub3_3595.method2258(this.anInt3590, this.anInt3591, Class144.aClass144_1680, this.aClass166_3594, this.aClass174_Sub3_3595.anInt9819);
         this.anInterface23_3589 = this.aClass174_Sub3_3595.method2259(this.anInt3590, this.anInt3591, this.aClass174_Sub3_3595.anInt9819);
      }

      this.anInterface43_3587 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3584 = this.anInterface43_3587.method344(0);
      this.anInterface43_3582 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3580 = this.anInterface43_3582.method344(0);
      this.anInterface43_3583 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3586 = this.anInterface43_3583.method344(0);
      this.anInterface23_3592 = this.aClass174_Sub3_3595.method2263(this.anInterface43_3583.method1(), this.anInterface43_3583.method94());
      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class337 var3 = (Class337)this.aVector3596.elementAt(var2);
         var3.method4371(this.anInt3590, this.anInt3591);
      }

   }

   void method4459(int var1, int var2) {
      if(this.aBool3579) {
         if(this.aClass184_Sub2_3597 != null) {
            this.aClass174_Sub3_3595.method2456(this.aClass184_Sub2_3597, (byte)0);
            this.aClass174_Sub3_3595.method2623(this.aClass184_Sub2_3578, (short)128);
            this.aClass184_Sub2_3597.method8470(0, 0, this.anInt3590, this.anInt3591, 0, 0, true, this.anInterface23_3592 != null);
         }

         this.method4453(var1, var2);
         this.aBool3579 = false;
      }

   }

   boolean method4460(int var1, int var2, int var3, int var4) {
      if(!this.aVector3596.isEmpty() && !this.method4450()) {
         if(this.anInt3590 != var3 || this.anInt3591 != var4 || this.aClass174_Sub3_3595.anInt9819 != this.anInt3600) {
            this.anInt3600 = this.aClass174_Sub3_3595.anInt9819;
            this.anInt3590 = var3;
            this.anInt3591 = var4;
            this.method4454();
            this.method4447();
         }

         this.aClass184_Sub2_3578.method8465(0, this.anInterface21_3586);
         if(this.anInterface23_3592 != null) {
            this.aClass184_Sub2_3578.method8476(this.anInterface23_3592);
         }

         if(this.aClass184_Sub2_3597 != null) {
            this.aClass184_Sub2_3597.method8465(0, this.anInterface21_3585);
            this.aClass184_Sub2_3597.method8476(this.anInterface23_3589);
            this.aClass174_Sub3_3595.method2623(this.aClass184_Sub2_3597, (short)128);
         } else {
            this.aClass174_Sub3_3595.method2623(this.aClass184_Sub2_3578, (short)128);
         }

         if(!this.aClass184_Sub2_3578.method8466()) {
            this.aClass174_Sub3_3595.method2456(this.aClass184_Sub2_3597 != null?this.aClass184_Sub2_3597:this.aClass184_Sub2_3578, (byte)0);
            return false;
         } else {
            this.anInt3581 = var1;
            this.anInt3593 = var2;
            this.aClass174_Sub3_3595.method2283(3, -16777216);
            this.aClass174_Sub3_3595.method8810(15);
            this.aClass174_Sub3_3595.method8808(0);
            this.aBool3579 = true;
            return true;
         }
      } else {
         return true;
      }
   }

   boolean method4461() {
      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         if(!((Class337)this.aVector3596.elementAt(var2)).method4379()) {
            return false;
         }
      }

      return true;
   }

   void method4462() {
      this.method4467();
      switch(this.anInt3599) {
      case 0:
         this.aClass166_3594 = Class166.aClass166_1884;
         break;
      case 1:
         this.aClass166_3594 = Class166.aClass166_1893;
         break;
      case 2:
         this.aClass166_3594 = Class166.aClass166_1892;
         break;
      default:
         throw new RuntimeException();
      }

      this.aClass184_Sub2_3578 = this.aClass174_Sub3_3595.method2257();
      if(this.aClass174_Sub3_3595.anInt9819 > 1 && this.aClass174_Sub3_3595.aBool9794 && this.aClass174_Sub3_3595.aBool9829) {
         this.aClass184_Sub2_3597 = this.aClass174_Sub3_3595.method2257();
         this.anInterface21_3585 = this.aClass174_Sub3_3595.method2258(this.anInt3590, this.anInt3591, Class144.aClass144_1680, this.aClass166_3594, this.aClass174_Sub3_3595.anInt9819);
         this.anInterface23_3589 = this.aClass174_Sub3_3595.method2259(this.anInt3590, this.anInt3591, this.aClass174_Sub3_3595.anInt9819);
      }

      this.anInterface43_3587 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3584 = this.anInterface43_3587.method344(0);
      this.anInterface43_3582 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3580 = this.anInterface43_3582.method344(0);
      this.anInterface43_3583 = this.aClass174_Sub3_3595.method8789(Class144.aClass144_1680, this.aClass166_3594, this.anInt3590, this.anInt3591);
      this.anInterface21_3586 = this.anInterface43_3583.method344(0);
      this.anInterface23_3592 = this.aClass174_Sub3_3595.method2263(this.anInterface43_3583.method1(), this.anInterface43_3583.method94());
      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class337 var3 = (Class337)this.aVector3596.elementAt(var2);
         var3.method4371(this.anInt3590, this.anInt3591);
      }

   }

   boolean method4463() {
      int var1 = this.aVector3596.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         if(!((Class337)this.aVector3596.elementAt(var2)).method4379()) {
            return false;
         }
      }

      return true;
   }

   boolean method4464(Vector var1, int var2, Class337 var3) {
      if(!var3.method4384() && !var3.method4368()) {
         return false;
      } else {
         var1.insertElementAt(var3, var2);
         var3.method4371(this.anInt3590, this.anInt3591);
         int var4 = var3.method4376();
         if(var4 > this.anInt3599) {
            this.anInt3599 = var4;
         }

         var3.aBool3525 = true;
         return true;
      }
   }

   void method4465(int var1, int var2) {
      this.aClass174_Sub3_3595.method2281(true);
      this.aClass174_Sub3_3595.method8848();
      this.aClass174_Sub3_3595.method8807(0);
      this.aClass174_Sub3_3595.method8793(1);
      this.aClass174_Sub3_3595.method2278();
      this.aClass184_Sub2_3578.method8476((Interface23)null);
      this.aClass174_Sub3_3595.method8752(0, 0);
      int var3 = this.aVector3596.size();
      Vector var4 = this.aVector3596;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         if(((Class337)this.aVector3596.elementAt(var5)).method4379()) {
            var4 = new Vector();

            for(int var6 = 0; var6 < var3; ++var6) {
               if(!((Class337)this.aVector3596.elementAt(var6)).method4379()) {
                  var4.addElement(this.aVector3596.elementAt(var6));
               }
            }

            var3 = var4.size();
            break;
         }
      }

      this.anInterface43_3583.method265();

      for(var5 = 0; var5 < var3; ++var5) {
         Class337 var14 = (Class337)var4.elementAt(var5);
         int var7 = var14.method4391();
         boolean var8 = var5 == var3 - 1;
         boolean var9 = false;

         for(int var10 = 0; var10 < var7; ++var10) {
            if(var10 == var7 - 1) {
               if(var8) {
                  this.aClass174_Sub3_3595.method2456(this.aClass184_Sub2_3578, (byte)0);
                  this.aClass174_Sub3_3595.method2538(this.anInt3581, this.anInt3593, this.anInt3581 + var1, this.anInt3593 + var2);
               } else {
                  var9 = true;
                  this.aClass184_Sub2_3578.method8465(0, this.anInterface21_3586);
               }
            } else {
               this.aClass184_Sub2_3578.method8465(0, this.anInterface21_3580);
            }

            Interface43 var11 = this.anInterface43_3587;
            if(var10 == 0) {
               var11 = this.anInterface43_3583;
            }

            var14.method4372(var10, this.aClass184_Sub2_3578, var11, this.anInterface23_3592, this.anInterface43_3583, var8 && var10 == var7 - 1);
            this.method4446();
            var14.method4373(var10);
            if(var9) {
               this.anInterface43_3583.method265();
            }

            Interface43 var12 = this.anInterface43_3587;
            this.anInterface43_3587 = this.anInterface43_3582;
            this.anInterface43_3582 = var12;
            Interface21 var13 = this.anInterface21_3584;
            this.anInterface21_3584 = this.anInterface21_3580;
            this.anInterface21_3580 = var13;
         }
      }

      this.aClass174_Sub3_3595.method8807(1);
      this.aClass174_Sub3_3595.method8793(0);
      this.aClass174_Sub3_3595.method2281(false);
      this.aClass174_Sub3_3595.method2278();
      var4 = null;
   }

   void method4466(int var1, int var2) {
      this.aClass174_Sub3_3595.method2281(true);
      this.aClass174_Sub3_3595.method8848();
      this.aClass174_Sub3_3595.method8807(0);
      this.aClass174_Sub3_3595.method8793(1);
      this.aClass174_Sub3_3595.method2278();
      this.aClass184_Sub2_3578.method8476((Interface23)null);
      this.aClass174_Sub3_3595.method8752(0, 0);
      int var3 = this.aVector3596.size();
      Vector var4 = this.aVector3596;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         if(((Class337)this.aVector3596.elementAt(var5)).method4379()) {
            var4 = new Vector();

            for(int var6 = 0; var6 < var3; ++var6) {
               if(!((Class337)this.aVector3596.elementAt(var6)).method4379()) {
                  var4.addElement(this.aVector3596.elementAt(var6));
               }
            }

            var3 = var4.size();
            break;
         }
      }

      this.anInterface43_3583.method265();

      for(var5 = 0; var5 < var3; ++var5) {
         Class337 var14 = (Class337)var4.elementAt(var5);
         int var7 = var14.method4391();
         boolean var8 = var5 == var3 - 1;
         boolean var9 = false;

         for(int var10 = 0; var10 < var7; ++var10) {
            if(var10 == var7 - 1) {
               if(var8) {
                  this.aClass174_Sub3_3595.method2456(this.aClass184_Sub2_3578, (byte)0);
                  this.aClass174_Sub3_3595.method2538(this.anInt3581, this.anInt3593, this.anInt3581 + var1, this.anInt3593 + var2);
               } else {
                  var9 = true;
                  this.aClass184_Sub2_3578.method8465(0, this.anInterface21_3586);
               }
            } else {
               this.aClass184_Sub2_3578.method8465(0, this.anInterface21_3580);
            }

            Interface43 var11 = this.anInterface43_3587;
            if(var10 == 0) {
               var11 = this.anInterface43_3583;
            }

            var14.method4372(var10, this.aClass184_Sub2_3578, var11, this.anInterface23_3592, this.anInterface43_3583, var8 && var10 == var7 - 1);
            this.method4446();
            var14.method4373(var10);
            if(var9) {
               this.anInterface43_3583.method265();
            }

            Interface43 var12 = this.anInterface43_3587;
            this.anInterface43_3587 = this.anInterface43_3582;
            this.anInterface43_3582 = var12;
            Interface21 var13 = this.anInterface21_3584;
            this.anInterface21_3584 = this.anInterface21_3580;
            this.anInterface21_3580 = var13;
         }
      }

      this.aClass174_Sub3_3595.method8807(1);
      this.aClass174_Sub3_3595.method8793(0);
      this.aClass174_Sub3_3595.method2281(false);
      this.aClass174_Sub3_3595.method2278();
      var4 = null;
   }

   void method4467() {
      if(this.anInterface35_3588 == null) {
         this.anInterface35_3588 = this.aClass174_Sub3_3595.method8818(false);
         this.anInterface35_3588.method249(12, 4);
         ByteBuffer var1 = this.aClass174_Sub3_3595.aByteBuffer9684;
         var1.clear();
         var1.putFloat(0.0F);
         var1.putFloat(1.0F);
         var1.putFloat(2.0F);
         this.anInterface35_3588.method235(0, var1.position(), this.aClass174_Sub3_3595.aLong9685);
         this.aClass335_3598 = this.aClass174_Sub3_3595.method8748(new Class359[]{new Class359(Class353.aClass353_3672)});
      }
   }
}
