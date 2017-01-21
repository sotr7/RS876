package com.jagex;

import com.jagex.Class306;
import com.jagex.Class315;
import com.jagex.Class425;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class315_Sub2 extends Class315 {
   // $FF: synthetic field
   Class306 this$0;
   boolean aBool10118;
   Font aFont10116;
   FontMetrics aFontMetrics10117;
   Color aColor10115;

   Class315_Sub2(Class306 var1, boolean var2, String var3, int var4, int var5, int var6, int var7) {
      super(var1, var6, var7);
      this.this$0 = var1;
      this.aBool10118 = var2;
      this.aFont10116 = new Font(var3, 0, var4);
      this.aFontMetrics10117 = Class425.aCanvas4798.getFontMetrics(this.aFont10116);
      this.aColor10115 = new Color(var5);
   }

   void method4087(Graphics var1, int var2) {
      String var3;
      if(this.aBool10118) {
         var3 = this.this$0.aString3291;
      } else {
         var3 = this.this$0.aString3286 + " " + this.this$0.aString3291;
      }

      var1.setFont(this.aFont10116);
      var1.setColor(this.aColor10115);
      var1.drawString(var3, this.this$0.method4027(this.aFontMetrics10117.stringWidth(var3), -1400480033) + -805732621 * this.anInt3396, this.this$0.method4029(0, 1890564681) + 488882787 * this.anInt3395);
   }

   void method4086(Graphics var1) {
      String var2;
      if(this.aBool10118) {
         var2 = this.this$0.aString3291;
      } else {
         var2 = this.this$0.aString3286 + " " + this.this$0.aString3291;
      }

      var1.setFont(this.aFont10116);
      var1.setColor(this.aColor10115);
      var1.drawString(var2, this.this$0.method4027(this.aFontMetrics10117.stringWidth(var2), -1936215754) + -805732621 * this.anInt3396, this.this$0.method4029(0, 1890564681) + 488882787 * this.anInt3395);
   }

   void method4088(Graphics var1) {
      String var2;
      if(this.aBool10118) {
         var2 = this.this$0.aString3291;
      } else {
         var2 = this.this$0.aString3286 + " " + this.this$0.aString3291;
      }

      var1.setFont(this.aFont10116);
      var1.setColor(this.aColor10115);
      var1.drawString(var2, this.this$0.method4027(this.aFontMetrics10117.stringWidth(var2), -1547301374) + -805732621 * this.anInt3396, this.this$0.method4029(0, 1890564681) + 488882787 * this.anInt3395);
   }
}
