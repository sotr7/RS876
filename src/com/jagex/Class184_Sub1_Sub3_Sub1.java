package com.jagex;

import com.jagex.Class174_Sub1;
import com.jagex.Class184_Sub1_Sub3;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class184_Sub1_Sub3_Sub1 extends Class184_Sub1_Sub3 {
   Image anImage12064;

   public int method8451() {
      return this.method8453(0, 0);
   }

   void method10470(short var1) {
      super.method10470((short)27622);
      DataBufferInt var2 = new DataBufferInt(this.anIntArray11384, this.anIntArray11384.length);
      DirectColorModel var3 = new DirectColorModel(32, 16711680, '\uff00', 255);
      WritableRaster var4 = Raster.createWritableRaster(var3.createCompatibleSampleModel(-1771348043 * this.anInt11381, 1471952865 * this.anInt11383), var2, (Point)null);
      this.anImage12064 = new BufferedImage(var3, var4, false, new Hashtable());
   }

   public void method208() {
   }

   public final int method8453(int var1, int var2) {
      Graphics var3 = this.aCanvas11386.getGraphics();
      if(null == var3) {
         return 0;
      } else {
         var3.drawImage(this.anImage12064, var1, var2, this.aCanvas11386);
         return 0;
      }
   }

   public int method8460() {
      return this.method8453(0, 0);
   }

   Class184_Sub1_Sub3_Sub1(Class174_Sub1 var1, Canvas var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      new Rectangle();
      this.method10470((short)2935);
   }

   void method10471() {
      super.method10470((short)7545);
      DataBufferInt var1 = new DataBufferInt(this.anIntArray11384, this.anIntArray11384.length);
      DirectColorModel var2 = new DirectColorModel(32, 16711680, '\uff00', 255);
      WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(-1771348043 * this.anInt11381, 1471952865 * this.anInt11383), var1, (Point)null);
      this.anImage12064 = new BufferedImage(var2, var3, false, new Hashtable());
   }

   public final int method8457(int var1, int var2) {
      Graphics var3 = this.aCanvas11386.getGraphics();
      if(null == var3) {
         return 0;
      } else {
         var3.drawImage(this.anImage12064, var1, var2, this.aCanvas11386);
         return 0;
      }
   }

   public final int method8458(int var1, int var2) {
      Graphics var3 = this.aCanvas11386.getGraphics();
      if(null == var3) {
         return 0;
      } else {
         var3.drawImage(this.anImage12064, var1, var2, this.aCanvas11386);
         return 0;
      }
   }

   public int method8452() {
      return this.method8453(0, 0);
   }

   public void method140() {
   }

   public int method8459() {
      return this.method8453(0, 0);
   }
}
