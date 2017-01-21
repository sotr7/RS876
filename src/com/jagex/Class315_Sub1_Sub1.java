package com.jagex;

import com.jagex.Class306;
import com.jagex.Class315_Sub1;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;

public class Class315_Sub1_Sub1 extends Class315_Sub1 {
   // $FF: synthetic field
   Class306 this$0;
   float aFloat11395;
   float aFloat11394;

   Class315_Sub1_Sub1(Class306 var1, Image var2, int var3, int var4, float var5) {
      super(var1, var2, var3, var4);
      this.this$0 = var1;
      this.aFloat11395 = var5;
      this.aFloat11394 = -this.aFloat11395;
   }

   void method4087(Graphics var1, int var2) {
      this.aFloat11394 += this.aFloat11395;
      if(this.aFloat11394 < 0.0F) {
         this.aFloat11394 += 360.0F;
      }

      this.aFloat11394 %= 360.0F;
      double var3 = Math.toRadians((double)this.aFloat11394);
      int var5 = this.anImage10032.getWidth((ImageObserver)null);
      int var6 = this.anImage10032.getHeight((ImageObserver)null);
      Graphics2D var7 = (Graphics2D)var1;
      var7.rotate(var3, (double)(this.this$0.method4027(var5, -1236160534) + var5 / 2 + this.anInt3396 * -805732621), (double)(this.this$0.method4029(var6, 1890564681) + var6 / 2 + this.anInt3395 * 488882787));
      var7.translate(this.this$0.method4027(var5, -2070209309) + this.anInt3396 * -805732621, this.this$0.method4029(var6, 1890564681) + this.anInt3395 * 488882787);
      var7.drawImage(this.anImage10032, (AffineTransform)null, (ImageObserver)null);
      var7.setTransform(this.this$0.anAffineTransform3285);
   }

   void method4086(Graphics var1) {
      this.aFloat11394 += this.aFloat11395;
      if(this.aFloat11394 < 0.0F) {
         this.aFloat11394 += 360.0F;
      }

      this.aFloat11394 %= 360.0F;
      double var2 = Math.toRadians((double)this.aFloat11394);
      int var4 = this.anImage10032.getWidth((ImageObserver)null);
      int var5 = this.anImage10032.getHeight((ImageObserver)null);
      Graphics2D var6 = (Graphics2D)var1;
      var6.rotate(var2, (double)(this.this$0.method4027(var4, -1542186038) + var4 / 2 + this.anInt3396 * -805732621), (double)(this.this$0.method4029(var5, 1890564681) + var5 / 2 + this.anInt3395 * 488882787));
      var6.translate(this.this$0.method4027(var4, -769662778) + this.anInt3396 * -805732621, this.this$0.method4029(var5, 1890564681) + this.anInt3395 * 488882787);
      var6.drawImage(this.anImage10032, (AffineTransform)null, (ImageObserver)null);
      var6.setTransform(this.this$0.anAffineTransform3285);
   }

   void method4088(Graphics var1) {
      this.aFloat11394 += this.aFloat11395;
      if(this.aFloat11394 < 0.0F) {
         this.aFloat11394 += 360.0F;
      }

      this.aFloat11394 %= 360.0F;
      double var2 = Math.toRadians((double)this.aFloat11394);
      int var4 = this.anImage10032.getWidth((ImageObserver)null);
      int var5 = this.anImage10032.getHeight((ImageObserver)null);
      Graphics2D var6 = (Graphics2D)var1;
      var6.rotate(var2, (double)(this.this$0.method4027(var4, -615945101) + var4 / 2 + this.anInt3396 * -805732621), (double)(this.this$0.method4029(var5, 1890564681) + var5 / 2 + this.anInt3395 * 488882787));
      var6.translate(this.this$0.method4027(var4, -1962879004) + this.anInt3396 * -805732621, this.this$0.method4029(var5, 1890564681) + this.anInt3395 * 488882787);
      var6.drawImage(this.anImage10032, (AffineTransform)null, (ImageObserver)null);
      var6.setTransform(this.this$0.anAffineTransform3285);
   }
}
