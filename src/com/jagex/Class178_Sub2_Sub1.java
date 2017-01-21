package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub2;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class178_Sub2;
import com.jagex.Class184_Sub2_Sub2;
import com.jagex.Interface21;
import jaggl.OpenGL;

public class Class178_Sub2_Sub1 extends Class178_Sub2 {
   static int[] anIntArray11376 = new int[4];
   static int[] anIntArray11375 = new int[4];
   Class174_Sub2 aClass174_Sub2_11374;
   Class124_Sub2 aClass124_Sub2_11377;

   Class124_Sub2 method8591() {
      return this.aClass124_Sub2_11377;
   }

   int method10465() {
      return this.aClass124_Sub2_11377.anInt8926;
   }

   Class124_Sub2 method8589() {
      return this.aClass124_Sub2_11377;
   }

   Class178_Sub2_Sub1(Class174_Sub2 var1, int var2) {
      this.aClass174_Sub2_11374 = var1;
      this.aClass124_Sub2_11377 = new Class124_Sub2(var1, Class144.aClass144_1680, Class166.aClass166_1884, var2);
   }

   int method10466() {
      return this.aClass124_Sub2_11377.anInt8926;
   }

   boolean method10467(Class124_Sub2 var1, Class124_Sub2 var2, float var3) {
      boolean var4 = true;
      Class184_Sub2_Sub2 var5 = this.aClass174_Sub2_11374.aClass184_Sub2_Sub2_9649;
      this.aClass174_Sub2_11374.method2282(anIntArray11376);
      this.aClass174_Sub2_11374.method2278();
      this.aClass174_Sub2_11374.method2276(anIntArray11375);
      this.aClass174_Sub2_11374.method8613();
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glViewport(0, 0, this.aClass124_Sub2_11377.anInt8926, this.aClass124_Sub2_11377.anInt8926);
      this.aClass174_Sub2_11374.method8700(false);
      this.aClass174_Sub2_11374.method8646(false);
      this.aClass174_Sub2_11374.method8681(false);
      this.aClass174_Sub2_11374.method8648(false);
      this.aClass174_Sub2_11374.method8639(-2);
      this.aClass174_Sub2_11374.method8677(1);
      this.aClass174_Sub2_11374.method8640(0.0F, 0.0F, 0.0F, var3);
      this.aClass174_Sub2_11374.method8685('\u8575', '\u8575');
      this.aClass174_Sub2_11374.method8641(var2);
      this.aClass174_Sub2_11374.method8677(0);
      this.aClass174_Sub2_11374.method8672(1);
      this.aClass174_Sub2_11374.method8641(var1);
      this.aClass174_Sub2_11374.method2623(var5, (short)128);

      for(int var6 = 0; var6 < 6; ++var6) {
         int var7 = '\u8515' + var6;
         var5.method8465(0, this.aClass124_Sub2_11377.method8369(var7, 0));
         var5.method10454(0);
         if(!var5.method8466()) {
            var4 = false;
            break;
         }

         OpenGL.glBegin(7);
         switch(var7) {
         case 34069:
            OpenGL.glTexCoord3i('\uffff', '\ufffe', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', '\ufffe', '\ufffe');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\uffff', '\ufffe', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', '\ufffe', -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\uffff', -65534, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', -65534, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i('\uffff', -65534, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', -65534, '\ufffe');
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34070:
            OpenGL.glTexCoord3i(-65535, '\ufffe', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, '\ufffe', -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, '\ufffe', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, '\ufffe', '\ufffe');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, -65534, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, -65534, '\ufffe');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65535, -65534, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, -65534, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34071:
            OpenGL.glTexCoord3i(-65534, '\uffff', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\uffff', -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\uffff', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\uffff', -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\uffff', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\uffff', '\ufffe');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, '\uffff', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\uffff', '\ufffe');
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34072:
            OpenGL.glTexCoord3i(-65534, -65535, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65535, '\ufffe');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65535, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65535, '\ufffe');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65535, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65535, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65535, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65535, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34073:
            OpenGL.glTexCoord3i(-65534, '\ufffe', '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\ufffe', '\uffff');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\ufffe', '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\ufffe', '\uffff');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65534, '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65534, '\uffff');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65534, '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65534, '\uffff');
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case 34074:
            OpenGL.glTexCoord3i('\ufffe', '\ufffe', -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\ufffe', -65535);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, '\ufffe', -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\ufffe', -65535);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, -65534, -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65534, -65535);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i('\ufffe', -65534, -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65534, -65535);
            OpenGL.glVertex2f(0.0F, 1.0F);
         }

         OpenGL.glEnd();
      }

      var5.method8465(0, (Interface21)null);
      this.aClass174_Sub2_11374.method2456(var5, (byte)0);
      this.aClass174_Sub2_11374.method8677(1);
      this.aClass174_Sub2_11374.method8641((Class124)null);
      this.aClass174_Sub2_11374.method8685(8448, 8448);
      this.aClass174_Sub2_11374.method8677(0);
      this.aClass174_Sub2_11374.method8641((Class124)null);
      this.aClass174_Sub2_11374.method2538(anIntArray11376[0], anIntArray11376[1], anIntArray11376[2], anIntArray11376[3]);
      this.aClass174_Sub2_11374.method2573(anIntArray11375[0], anIntArray11375[1], anIntArray11375[2], anIntArray11375[3]);
      if(var4 && !this.aClass174_Sub2_11374.aBool9617) {
         this.aClass124_Sub2_11377.method1474();
      }

      return var4;
   }

   int method10468() {
      return this.aClass124_Sub2_11377.anInt8926;
   }

   Class124_Sub2 method8590() {
      return this.aClass124_Sub2_11377;
   }
}
