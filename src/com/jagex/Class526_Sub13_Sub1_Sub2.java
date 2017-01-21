package com.jagex;

import com.jagex.Class276_Sub2;
import com.jagex.Class281;
import com.jagex.Class284_Sub2;
import com.jagex.Class526_Sub13_Sub1;
import jaggl.OpenGL;

public class Class526_Sub13_Sub1_Sub2 extends Class526_Sub13_Sub1 {
   int[] anIntArray12049 = null;
   Class284_Sub2 aClass284_Sub2_12050;

   public final int method10638(int var1) {
      return this.anIntArray12049[var1];
   }

   final int method10886() {
      return this.anIntArray12049[this.aClass284_Sub2_12050.method3732(-758055399)];
   }

   public boolean method10626(int var1) {
      if(this.anIntArray12049 == null) {
         this.anIntArray12049 = new int[this.aClass284_Sub2_12050.method3727(1375513178)];
      }

      Class276_Sub2 var2 = (Class276_Sub2)this.aClass284_Sub2_12050.method3755(var1, -1714409951);
      this.anIntArray12049[var1] = OpenGL.glGetUniformLocation(var2.anInt10084, this.method10627(-1142111798));
      return this.anIntArray12049[var1] != -1;
   }

   Class526_Sub13_Sub1_Sub2(Class284_Sub2 var1, Class281 var2) {
      super(var2);
      this.aClass284_Sub2_12050 = var1;
   }

   public final int method10625(int var1) {
      return this.anIntArray12049[var1];
   }

   public boolean method10631(int var1) {
      if(this.anIntArray12049 == null) {
         this.anIntArray12049 = new int[this.aClass284_Sub2_12050.method3727(1689800888)];
      }

      Class276_Sub2 var2 = (Class276_Sub2)this.aClass284_Sub2_12050.method3755(var1, -1770015788);
      this.anIntArray12049[var1] = OpenGL.glGetUniformLocation(var2.anInt10084, this.method10627(-1640766658));
      return this.anIntArray12049[var1] != -1;
   }

   public boolean method10634(int var1) {
      if(this.anIntArray12049 == null) {
         this.anIntArray12049 = new int[this.aClass284_Sub2_12050.method3727(1024704375)];
      }

      Class276_Sub2 var2 = (Class276_Sub2)this.aClass284_Sub2_12050.method3755(var1, -2102006126);
      this.anIntArray12049[var1] = OpenGL.glGetUniformLocation(var2.anInt10084, this.method10627(-503849536));
      return this.anIntArray12049[var1] != -1;
   }

   public boolean method10630(int var1) {
      if(this.anIntArray12049 == null) {
         this.anIntArray12049 = new int[this.aClass284_Sub2_12050.method3727(1365519129)];
      }

      Class276_Sub2 var2 = (Class276_Sub2)this.aClass284_Sub2_12050.method3755(var1, -1975387341);
      this.anIntArray12049[var1] = OpenGL.glGetUniformLocation(var2.anInt10084, this.method10627(499584018));
      return this.anIntArray12049[var1] != -1;
   }

   final int method10887() {
      return this.anIntArray12049[this.aClass284_Sub2_12050.method3732(121593826)];
   }
}
