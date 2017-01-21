package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class270;
import com.jagex.Class306;
import com.jagex.Class315;
import com.jagex.Class458;
import com.jagex.Class526_Sub38;
import com.jagex.Class526_Sub39;
import com.jagex.client;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Class315_Sub1 extends Class315 {
   public static Class243[] aClass243Array10033;
   // $FF: synthetic field
   Class306 this$0;
   Image anImage10032;

   void method4088(Graphics var1) {
      int var2 = this.this$0.method4027(this.anImage10032.getWidth((ImageObserver)null), -735938843) + this.anInt3396 * -805732621;
      int var3 = this.this$0.method4029(this.anImage10032.getHeight((ImageObserver)null), 1890564681) + 488882787 * this.anInt3395;
      var1.drawImage(this.anImage10032, var2, var3, (ImageObserver)null);
   }

   void method4087(Graphics var1, int var2) {
      int var3 = this.this$0.method4027(this.anImage10032.getWidth((ImageObserver)null), -1061308935) + this.anInt3396 * -805732621;
      int var4 = this.this$0.method4029(this.anImage10032.getHeight((ImageObserver)null), 1890564681) + 488882787 * this.anInt3395;
      var1.drawImage(this.anImage10032, var3, var4, (ImageObserver)null);
   }

   void method4086(Graphics var1) {
      int var2 = this.this$0.method4027(this.anImage10032.getWidth((ImageObserver)null), -1135467259) + this.anInt3396 * -805732621;
      int var3 = this.this$0.method4029(this.anImage10032.getHeight((ImageObserver)null), 1890564681) + 488882787 * this.anInt3395;
      var1.drawImage(this.anImage10032, var2, var3, (ImageObserver)null);
   }

   Class315_Sub1(Class306 var1, Image var2, int var3, int var4) {
      super(var1, var3, var4);
      this.this$0 = var1;
      this.anImage10032 = var2;
   }

   static final void method9077(InterfaceDef[] var0, int var1, byte var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         InterfaceDef var4 = var0[var3];
         if(null != var4) {
            if(-449120703 * var4.type == 0) {
               if(var4.aClass245Array2530 != null) {
                  method9077(var4.aClass245Array2530, var1, (byte)-40);
               }

               Class526_Sub38 var5 = (Class526_Sub38)client.aClass20_11187.get((long)(919258769 * var4.uid));
               if(null != var5) {
                  Class458.method5419(var5.anInt10684 * -870147923, var1, (byte)10);
               }
            }

            Class526_Sub39 var6;
            if(var1 == 0 && var4.anObjectArray2640 != null) {
               var6 = new Class526_Sub39();
               var6.aClass245_10694 = var4;
               var6.anObjectArray10701 = var4.anObjectArray2640;
               Class270.method3594(var6, 245905514);
            }

            if(1 == var1 && var4.anObjectArray2521 != null) {
               if(1300712985 * var4.componentSlot >= 0) {
                  InterfaceDef var7 = Class221.method3095(var4.uid * 919258769, (byte)-13);
                  if(null == var7 || var7.aClass245Array2662 == null || 1300712985 * var4.componentSlot >= var7.aClass245Array2662.length || var4 != var7.aClass245Array2662[var4.componentSlot * 1300712985]) {
                     continue;
                  }
               }

               var6 = new Class526_Sub39();
               var6.aClass245_10694 = var4;
               var6.anObjectArray10701 = var4.anObjectArray2521;
               Class270.method3594(var6, -17089079);
            }
         }
      }

   }
}
