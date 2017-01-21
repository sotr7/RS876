package com.jagex;

import com.jagex.Class144;
import com.jagex.Class153;
import com.jagex.Class157;
import com.jagex.Class166;
import com.jagex.Class169;
import com.jagex.Class174_Sub3;
import com.jagex.Class178;
import com.jagex.Class184_Sub1;
import com.jagex.Class184_Sub1_Sub2_Sub2;
import com.jagex.Class184_Sub2;
import com.jagex.Class184_Sub2_Sub1_Sub1;
import com.jagex.Class255;
import com.jagex.Class274;
import com.jagex.Class276_Sub2;
import com.jagex.Class284;
import com.jagex.Class284_Sub2;
import com.jagex.Class304_Sub1;
import com.jagex.Class335;
import com.jagex.Class335_Sub2;
import com.jagex.Class353;
import com.jagex.Class359;
import com.jagex.Class363;
import com.jagex.Class369;
import com.jagex.Class370;
import com.jagex.Class372;
import com.jagex.Class374;
import com.jagex.Class433;
import com.jagex.Class466;
import com.jagex.Class485;
import com.jagex.Class486_Sub1;
import com.jagex.Class486_Sub2;
import com.jagex.Class494_Sub1;
import com.jagex.Class494_Sub2;
import com.jagex.Class494_Sub3;
import com.jagex.Class497;
import com.jagex.Class526;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub25;
import com.jagex.Class620;
import com.jagex.Class661;
import com.jagex.Class69;
import com.jagex.Class702;
import com.jagex.Exception_Sub4;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.Interface24;
import com.jagex.Interface35;
import com.jagex.Interface37;
import com.jagex.Interface38;
import com.jagex.Interface41;
import com.jagex.Interface42;
import com.jagex.Interface43;
import com.jagex.Interface44;
import com.jagex.Interface46;
import com.jagex.Interface47;
import com.jagex.Interface49;
import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;

public final class Class174_Sub3_Sub2 extends Class174_Sub3 {
   static final int anInt11495 = 3;
   boolean aBool11509;
   Class276_Sub2 aClass276_Sub2_11512;
   Class702 aClass702_11479 = new Class702();
   Class702 aClass702_11480 = new Class702();
   Class702 aClass702_11488 = new Class702();
   Class702 aClass702_11482 = new Class702();
   Class702 aClass702_11483 = new Class702();
   Class702 aClass702_11484 = new Class702();
   Class702 aClass702_11485 = new Class702();
   int[] anIntArray11487 = new int[1000];
   Class486_Sub1[] aClass486_Sub1Array11491 = new Class486_Sub1[16];
   float[] aFloatArray11510;
   float[] aFloatArray11511;
   Class153 aClass153_11513;
   Class153 aClass153_11514;
   Class184_Sub2 aClass184_Sub2_11515;
   int[] anIntArray11502;
   long[] aLongArray11517;
   int[] anIntArray11516;
   int anInt11519;
   int anInt11520;
   OpenGL anOpenGL11492;
   String aString11478;
   String aString11497;
   int anInt11499;
   boolean aBool11518;
   boolean aBool11501;
   boolean aBool11481;
   boolean aBool11503;
   boolean aBool11504;
   boolean aBool11505;
   boolean aBool11506;
   boolean aBool11508;
   int[] anIntArray11494;
   int anInt11489;
   boolean aBool11486;
   Class486_Sub2 aClass486_Sub2_11493;
   boolean aBool11490;
   boolean aBool11496;
   boolean aBool11500;
   int anInt11498;
   long aLong11507;

   void method8781() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.aClass433_9753.aFloatArray4841, 0);

      int var1;
      for(var1 = 0; var1 < this.anInt9766; ++var1) {
         Class526_Sub16 var2 = this.aClass526_Sub16Array9764[var1];
         int var3 = var2.method9394(1620314230);
         int var4 = 16386 + var1;
         float var5 = var2.method9419(1613563498) / 255.0F;
         this.aFloatArray11510[0] = (float)var2.method9390((byte)-29);
         this.aFloatArray11510[1] = (float)var2.method9391(1150602208);
         this.aFloatArray11510[2] = (float)var2.method9392((byte)-29);
         this.aFloatArray11510[3] = 1.0F;
         OpenGL.glLightfv(var4, 4611, this.aFloatArray11510, 0);
         this.aFloatArray11510[0] = (float)(var3 >> 16 & 255) * var5;
         this.aFloatArray11510[1] = (float)(var3 >> 8 & 255) * var5;
         this.aFloatArray11510[2] = (float)(var3 & 255) * var5;
         this.aFloatArray11510[3] = 1.0F;
         OpenGL.glLightfv(var4, 4609, this.aFloatArray11510, 0);
         OpenGL.glLightf(var4, 4617, 1.0F / (float)(var2.method9422((short)8192) * var2.method9422((short)8192)));
         OpenGL.glEnable(var4);
      }

      while(var1 < this.anInt9765) {
         OpenGL.glDisable(16386 + var1);
         ++var1;
      }

   }

   Class184_Sub1 method2606(Canvas var1, int var2, int var3) {
      return new Class184_Sub1_Sub2_Sub2(this, var1);
   }

   public boolean method8898() {
      return this.aBool11503;
   }

   public boolean method8719() {
      return this.aBool11505;
   }

   public boolean method8720(boolean var1) {
      return true;
   }

   Class174_Sub3_Sub2(OpenGL var1, Canvas var2, long var3, Class169 var5, Interface24 var6, Interface47 var7, Interface49 var8, Interface46 var9, Class466 var10, int var11) {
      super(var5, var6, var7, var8, var9, var10, var11, 1);
      new MapBuffer();
      new MapBuffer();
      this.aFloatArray11510 = new float[4];
      this.aFloatArray11511 = new float[16];
      this.aClass153_11513 = null;
      this.aClass153_11514 = null;
      this.aClass184_Sub2_11515 = null;
      this.anIntArray11502 = new int[3];
      this.aLongArray11517 = new long[3];
      this.anIntArray11516 = new int[3];
      this.anInt11519 = 0;
      this.anInt11520 = 0;
      int[] var12 = new int[1];

      try {
         this.anOpenGL11492 = var1;
         this.anOpenGL11492.method1220();
         this.aString11478 = OpenGL.glGetString(7936).toLowerCase();
         this.aString11497 = OpenGL.glGetString(7937).toLowerCase();
         if(this.aString11478.indexOf("microsoft") == -1 && this.aString11478.indexOf("brian paul") == -1 && this.aString11478.indexOf("mesa") == -1) {
            String var13 = OpenGL.glGetString(7938);
            String[] var14 = Class69.method1085(var13.replace('\u002e', '\u0020'), '\u0020', (byte)7);
            if(var14.length >= 2) {
               int var15;
               try {
                  var15 = Class661.method7925(var14[0], (byte)80);
                  int var16 = Class661.method7925(var14[1], (byte)126);
                  this.anInt11499 = var15 * 10 + var16;
               } catch (NumberFormatException var24) {
                  throw new RuntimeException("");
               }

               if(this.anInt11499 < 12) {
                  throw new RuntimeException("");
               } else {
                  OpenGL.glGetIntegerv('\u84e2', var12, 0);
                  this.anInt9683 = var12[0];
                  if(this.anInt9683 < 2) {
                     throw new RuntimeException("");
                  } else {
                     this.anInt9719 = 8;
                     this.aBool11518 = this.anOpenGL11492.method1219("GL_ARB_vertex_buffer_object");
                     this.aBool9830 = this.anOpenGL11492.method1219("GL_ARB_multisample");
                     this.aBool9834 = this.anOpenGL11492.method1219("GL_EXT_blend_func_separate");
                     this.aBool11501 = this.anOpenGL11492.method1219("GL_ARB_texture_rectangle");
                     this.aBool9831 = this.anOpenGL11492.method1219("GL_ARB_texture_cube_map");
                     this.aBool11481 = this.anOpenGL11492.method1219("GL_ARB_texture_non_power_of_two");
                     this.aBool9832 = true;
                     this.aBool11503 = this.anOpenGL11492.method1219("GL_ARB_vertex_shader");
                     this.aBool11504 = this.anOpenGL11492.method1219("GL_ARB_vertex_program");
                     this.aBool11505 = this.anOpenGL11492.method1219("GL_ARB_fragment_shader");
                     this.aBool11506 = this.anOpenGL11492.method1219("GL_ARB_fragment_program");
                     this.aBool9827 = this.anOpenGL11492.method1219("GL_EXT_framebuffer_object");
                     this.aBool9724 = this.aBool9827;
                     this.aBool9794 = this.anOpenGL11492.method1219("GL_EXT_framebuffer_blit");
                     this.aBool9829 = this.anOpenGL11492.method1219("GL_EXT_framebuffer_multisample");
                     this.aBool11508 = this.anUnsafe9670 != null && (this.anInt11499 >= 32 || this.anOpenGL11492.method1219("GL_ARB_sync"));
                     this.anIntArray11494 = new int[this.anInt9683];
                     if(!this.method8898() || !this.method8719()) {
                        if(!this.anOpenGL11492.method1219("GL_ARB_multitexture")) {
                           throw new RuntimeException("");
                        }

                        if(!this.anOpenGL11492.method1219("GL_ARB_texture_env_combine")) {
                           throw new RuntimeException("");
                        }
                     }

                     Class497.aString5565.startsWith("mac");
                     this.anInt11489 = Stream.method1253()?'\u8367':5121;
                     if(this.aString11497.indexOf("radeon") != -1 || this.aString11478.indexOf("intel") != -1) {
                        var15 = 0;
                        boolean var27 = this.aString11478.indexOf("intel") != -1;
                        boolean var17 = false;
                        boolean var18 = false;
                        String[] var19 = Class69.method1085(this.aString11497.replace('\u002f', '\u0020'), '\u0020', (byte)7);

                        for(int var20 = 0; var20 < var19.length; ++var20) {
                           String var21 = var19[var20];

                           try {
                              if(var21.length() > 0) {
                                 if(var21.charAt(0) == 120 && var21.length() >= 3 && Class620.method7346(var21.substring(1, 3), -39368645)) {
                                    var21 = var21.substring(1);
                                    var18 = true;
                                 }

                                 if(var21.equals("hd")) {
                                    var17 = true;
                                 } else {
                                    if(var21.startsWith("hd")) {
                                       var21 = var21.substring(2);
                                       var17 = true;
                                    }

                                    if(var21.length() >= 4 && Class620.method7346(var21.substring(0, 4), 1601919624)) {
                                       var15 = Class661.method7925(var21.substring(0, 4), (byte)106);
                                       break;
                                    }
                                 }
                              }
                           } catch (Exception var25) {
                              ;
                           }
                        }

                        if(var27) {
                           if(!var17) {
                              this.aBool9827 = false;
                           }
                        } else {
                           if(!var18 && !var17) {
                              if(var15 >= 7000 && var15 <= 7999) {
                                 this.aBool11518 = false;
                              }

                              if(var15 >= 7000 && var15 <= 9250) {
                                 this.aBool9832 = false;
                              }
                           }

                           this.aBool11501 &= this.anOpenGL11492.method1219("GL_ARB_half_float_pixel");
                           this.aBool11486 = true;
                        }
                     }

                     if(this.aBool11518) {
                        try {
                           int[] var28 = new int[1];
                           OpenGL.glGenBuffersARB(1, var28, 0);
                        } catch (Throwable var23) {
                           throw new RuntimeException("");
                        }

                        this.method2250(var2, new Class184_Sub1_Sub2_Sub2(this, var2, var3), 646139371);
                        this.method2252(var2, (byte)85);
                        this.method8745('\u8000', false);
                        this.method8745('\u8000', false);
                     } else {
                        throw new RuntimeException("");
                     }
                  }
               }
            } else {
               throw new RuntimeException("");
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var26) {
         var26.printStackTrace();
         this.method2232(1135751733);
         if(var26 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var26;
         } else {
            throw new RuntimeException("");
         }
      }
   }

   void method8729() {
      OpenGL.glDepthFunc(515);
      this.method10529();
      OpenGL.glClearDepth(1.0F);
      OpenGL.glAlphaFunc(516, 0.0F);
      OpenGL.glPolygonMode(1028, 6914);
      if(this.aBool9830) {
         this.method8869(this.anInt9819 > 1);
         OpenGL.glDisable('\u809e');
      }

      for(int var1 = this.anInt9683 - 1; var1 >= 0; --var1) {
         OpenGL.glActiveTexture('\u84c0' + var1);
         OpenGL.glTexEnvi(8960, 8704, '\u8570');
         OpenGL.glTexEnvi(8960, '\u8571', 8448);
         OpenGL.glTexEnvi(8960, '\u8582', '\u8576');
         OpenGL.glTexEnvi(8960, '\u8572', 8448);
         OpenGL.glTexEnvi(8960, '\u858a', '\u8576');
      }

      OpenGL.glTexEnvi(8960, '\u858a', '\u8578');
      OpenGL.glShadeModel(7425);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var2 = 0; var2 < 8; ++var2) {
         int var3 = 16384 + var2;
         OpenGL.glLightfv(var3, 4608, var4, 0);
         OpenGL.glLightf(var3, 4615, 0.0F);
         OpenGL.glLightf(var3, 4616, 0.0F);
      }

      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      this.anOpenGL11492.setSwapInterval(0);
      super.method8729();
   }

   void method8804() {
      OpenGL.glTexEnvi(8960, '\u8572', method10527(this.aClass372Array9776[this.anInt9787]));
   }

   void method2230(int var1, int var2) throws Exception_Sub4 {
      this.aClass184_Sub1_2026.method8451();
      if(this.anInterface24_2034 != null) {
         this.anInterface24_2034.method150((byte)1);
      }

   }

   public void method2327() {
      OpenGL.glFinish();
   }

   void method2233() {
      super.method2233();
      if(this.anOpenGL11492 != null) {
         this.anOpenGL11492.method1221();
         this.anOpenGL11492.release();
         this.anOpenGL11492 = null;
      }

   }

   void method8951() {
      OpenGL.glActiveTexture('\u84c0' + this.anInt9787);
   }

   public Class184_Sub2 method2257() {
      return new Class184_Sub2_Sub1_Sub1(this);
   }

   final synchronized void method10522(int var1, int var2) {
      Class526_Sub25 var3 = new Class526_Sub25(var2);
      var3.aLong7156 = (long)var1 * -7608595443915499217L;
      this.aClass702_11480.method8176(var3, -554121483);
   }

   public Interface23 method2263(int var1, int var2) {
      return new Class485(this, Class144.aClass144_1684, Class166.aClass166_1889, var1, var2);
   }

   public Interface21 method2568(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return new Class485(this, var3, var4, var1, var2, var5);
   }

   public void method2325() {
      OpenGL.glFinish();
   }

   public void method2611() {
      if(this.aClass184_2049 != null) {
         int var1 = this.aClass184_2049.method2691();
         int var2 = this.aClass184_2049.method2693();
         if(var1 > 0 || var2 > 0) {
            int var3 = this.anInt9740;
            int var4 = this.anInt9738;
            int var5 = this.anInt9742;
            int var6 = this.anInt9743;
            this.method2274();
            int var7 = this.anInt9682;
            int var8 = this.anInt9735;
            int var9 = this.anInt9732;
            int var10 = this.anInt9789;
            this.method2278();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method8762();
            this.method8814(false);
            this.method8871(false);
            this.method8867(false);
            this.method8782(false);
            this.method8841((Interface41)null);
            this.method8793(1);
            this.method8807(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glDisable(3553);
            OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
            OpenGL.glEnable(3553);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method2538(var7, var9, var8, var10);
            this.method2573(var3, var4, var5, var6);
         }
      }
   }

   public boolean method2416() {
      return this.aBool11508;
   }

   void method8913() {
      this.aFloatArray11510[0] = this.aFloat9669 * this.aFloat9708;
      this.aFloatArray11510[1] = this.aFloat9669 * this.aFloat9771;
      this.aFloatArray11510[2] = this.aFloat9669 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.aFloatArray11510, 0);
   }

   void method8986(Interface42 var1) {
      this.aClass486_Sub2_11493 = (Class486_Sub2)var1;
      this.aClass486_Sub2_11493.method5845();
   }

   public int method2352() {
      if(this.aBool11508) {
         if(this.aLongArray11517[this.anInt11519] == 0L) {
            return -1;
         } else {
            int var1 = OpenGL.glClientWaitSync(this.aLongArray11517[this.anInt11519], 0, 0);
            if(var1 == '\u911d') {
               this.method2267();
               return -1;
            } else {
               return var1 != '\u911b'?this.anIntArray11516[this.anInt11519]:-1;
            }
         }
      } else {
         return -1;
      }
   }

   public void method2268(int var1, int var2, int var3) {
      this.method2396();
      if(this.aClass184_Sub2_11515 == null) {
         this.method10524(var2, var3);
      }

      if(this.aClass153_11513 == null) {
         this.aClass153_11513 = this.method2311(0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), false);
      } else {
         this.aClass153_11513.method1776(0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), 0, 0);
      }

      this.method2623(this.aClass184_Sub2_11515, (short)128);
      this.method2283(1, -16777216);
      this.aClass153_11513.method1772(this.anInt2055 * 1228368769, this.anInt2039 * 1714687685, this.anInt2033 * -1550496547, this.anInt2058 * 568592699);
      OpenGL.glBindBufferARB('\u88eb', this.anIntArray11502[this.anInt11520]);
      OpenGL.glReadPixelsub(0, 0, this.anInt2053 * -742368129, this.anInt2044 * -208544951, '\u80e1', 5121, (byte[])null, 0);
      OpenGL.glBindBufferARB('\u88eb', 0);
      this.method2456(this.aClass184_Sub2_11515, (byte)0);
      this.aLongArray11517[this.anInt11520] = OpenGL.glFenceSync('\u9117', 0);
      this.anIntArray11516[this.anInt11520] = var1;
      if(++this.anInt11520 >= 3) {
         this.anInt11520 = 0;
      }

      this.method2314();
   }

   public void method2267() {
      for(int var1 = 0; var1 < 3; ++var1) {
         if(this.aLongArray11517[var1] != 0L) {
            OpenGL.glDeleteSync(this.aLongArray11517[var1]);
            this.aLongArray11517[var1] = 0L;
         }
      }

      this.anInt11520 = 0;
      this.anInt11519 = 0;
   }

   public long method2269(int var1, int var2) {
      return this.method10523(var1, var2, (int[])null, (int[])null);
   }

   long method10523(int var1, int var2, int[] var3, int[] var4) {
      if(this.aBool11508) {
         if(this.aLongArray11517[this.anInt11519] != 0L) {
            OpenGL.glDeleteSync(this.aLongArray11517[this.anInt11519]);
            this.aLongArray11517[this.anInt11519] = 0L;
         }

         OpenGL.glBindBufferARB('\u88eb', this.anIntArray11502[this.anInt11519]);
         long var5 = OpenGL.glMapBufferARB('\u88eb', '\u88b8');
         if(var3 != null) {
            for(int var7 = 0; var7 < var1 * var2; ++var7) {
               var3[var7] = this.anUnsafe9670.getInt(var5 + (long)(var7 * 4));
            }

            if(!OpenGL.glUnmapBufferARB('\u88eb')) {
               ;
            }

            OpenGL.glBindBufferARB('\u88eb', 0);
            var5 = 0L;
         }

         if(++this.anInt11519 >= 3) {
            this.anInt11519 = 0;
         }

         return var5;
      } else {
         if(this.aClass153_11514 == null) {
            this.method10524(var1, var2);
         }

         if(this.aClass153_11513 == null) {
            this.aClass153_11513 = this.method2311(0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), false);
         } else {
            this.aClass153_11513.method1776(0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), 0, 0);
         }

         this.method2623(this.aClass184_Sub2_11515, (short)128);
         this.method2283(1, -16777216);
         this.aClass153_11513.method1772(this.anInt2055 * 1228368769, this.anInt2039 * 1714687685, this.anInt2033 * -1550496547, this.anInt2058 * 568592699);
         this.aClass153_11514.method1768(0, 0, var1, var2, var3, var4, 0, var1);
         this.method2456(this.aClass184_Sub2_11515, (byte)0);
         return 0L;
      }
   }

   void method8816() {
      this.aFloat9677 = this.aFloat9731 - (float)this.anInt9809;
      this.aFloat9810 = this.aFloat9677 - (float)this.anInt9675;
      if(this.aFloat9810 < this.aFloat9730) {
         this.aFloat9810 = this.aFloat9730;
      }

      if(this.aBool9761) {
         OpenGL.glFogf(2915, this.aFloat9810);
         OpenGL.glFogf(2916, this.aFloat9677);
         this.aFloatArray11510[0] = (float)(this.anInt9722 & 16711680) / 1.671168E7F;
         this.aFloatArray11510[1] = (float)(this.anInt9722 & '\uff00') / 65280.0F;
         this.aFloatArray11510[2] = (float)(this.anInt9722 & 255) / 255.0F;
         OpenGL.glFogfv(2918, this.aFloatArray11510, 0);
      }

   }

   public void method2273() {
      if(this.aBool11508) {
         this.aClass153_11513 = null;
         if(this.aClass184_Sub2_11515 != null) {
            this.aClass184_Sub2_11515.method140();
            this.aClass184_Sub2_11515 = null;
         }

         OpenGL.glDeleteBuffersARB(3, this.anIntArray11502, 0);

         for(int var1 = 0; var1 < 3; ++var1) {
            this.anIntArray11502[var1] = 0;
            if(this.aLongArray11517[var1] != 0L) {
               OpenGL.glDeleteSync(this.aLongArray11517[var1]);
               this.aLongArray11517[var1] = 0L;
            }
         }
      } else {
         this.aClass184_Sub2_11515 = null;
         this.aClass153_11514 = null;
         this.aClass153_11513 = null;
      }

      this.anInt11520 = 0;
      this.anInt11519 = 0;
   }

   void method10524(int var1, int var2) {
      this.method2273();
      this.method2272(var1, var2, (short)20836);
      if(this.aBool11508) {
         this.aClass153_11514 = this.method2307(var1, var2, false, true);
         this.aClass184_Sub2_11515 = this.method2257();
         this.aClass184_Sub2_11515.method8465(0, this.aClass153_11514.method1773());
         OpenGL.glGenBuffersARB(3, this.anIntArray11502, 0);

         for(int var3 = 0; var3 < 3; ++var3) {
            OpenGL.glBindBufferARB('\u88eb', this.anIntArray11502[var3]);
            OpenGL.glBufferDataARBa('\u88eb', var1 * var2 * 4, 0L, '\u88e1');
            OpenGL.glBindBufferARB('\u88eb', 0);
         }
      } else {
         this.aClass153_11514 = this.method2307(var1, var2, false, true);
         this.aClass184_Sub2_11515 = this.method2257();
         this.aClass184_Sub2_11515.method8465(0, this.aClass153_11514.method1773());
      }

   }

   public Class178 method2338(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   void method8811() {
      if(this.aBool9816) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

      OpenGL.glAlphaFunc(516, (float)(this.aByte9824 & 255) / 255.0F);
      if(this.anInt9819 > 1) {
         if(this.aByte9824 != 0) {
            OpenGL.glEnable('\u809e');
         } else {
            OpenGL.glDisable('\u809e');
         }
      }

   }

   void method8753() {
      if(this.aClass184_2049 != null) {
         OpenGL.glViewport(this.anInt9698 + this.anInt9740, this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9738 - this.anInt9743, this.anInt9742, this.anInt9743);
      }

      OpenGL.glDepthRange(this.aFloat9726, this.aFloat9727);
   }

   void method8754() {
      if(this.aClass184_2049 != null) {
         int var1 = this.anInt9698 + this.anInt9682;
         int var2 = this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9789;
         int var3 = this.anInt9735 - this.anInt9682;
         int var4 = this.anInt9789 - this.anInt9732;
         if(var3 < 0) {
            var3 = 0;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   void method8929() {
      if(this.aBool9686) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   public void method8727(Class433 var1, Class433 var2, Class433 var3) {
      OpenGL.glMatrixMode(5888);
      this.aClass433_9705.method5118(var1, var2);
      OpenGL.glLoadMatrixf(this.aClass433_9705.aFloatArray4841, 0);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var3.aFloatArray4841, 0);
   }

   public Class184_Sub2 method2563() {
      return new Class184_Sub2_Sub1_Sub1(this);
   }

   void method8770() {
      if(this.aBool9748 && this.aBool9749) {
         OpenGL.glEnable(2929);
      } else {
         OpenGL.glDisable(2929);
      }

   }

   Class335 method8748(Class359[] var1) {
      return new Class335_Sub2(var1);
   }

   void method8775() {
      if(this.aBool9744 && !this.aBool9768) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   byte[] method10525(String var1) {
      return this.method8861("gl", var1);
   }

   void method8738() {
      this.aFloatArray11510[0] = this.aFloat9823 * this.aFloat9708;
      this.aFloatArray11510[1] = this.aFloat9823 * this.aFloat9771;
      this.aFloatArray11510[2] = this.aFloat9823 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightfv(16384, 4609, this.aFloatArray11510, 0);
      this.aFloatArray11510[0] = -this.aFloat9763 * this.aFloat9708;
      this.aFloatArray11510[1] = -this.aFloat9763 * this.aFloat9771;
      this.aFloatArray11510[2] = -this.aFloat9763 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, this.aFloatArray11510, 0);
   }

   void method8778() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.aClass433_9753.aFloatArray4841, 0);
      OpenGL.glLightfv(16384, 4611, this.aFloatArray9777, 0);
      OpenGL.glLightfv(16385, 4611, this.aFloatArray9701, 0);
   }

   public Class284 method8725(String var1) {
      byte[] var2 = this.method10525(var1);
      if(var2 == null) {
         return null;
      } else {
         Class274 var3 = this.method8726(var2);
         return new Class284_Sub2(this, var3);
      }
   }

   public long method2421(int var1, int var2) {
      return this.method10523(var1, var2, (int[])null, (int[])null);
   }

   void method8910() {
      if(this.aBool9744 && !this.aBool9768) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   public long method2419(int var1, int var2) {
      return this.method10523(var1, var2, (int[])null, (int[])null);
   }

   boolean method8844(Class144 var1, Class166 var2) {
      return this.aBool9832;
   }

   Interface38 method8955(Class144 var1, Class166 var2, int var3, int var4) {
      return this.method8789(var1, var2, var3, var4);
   }

   Interface38 method8883(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6);
   }

   public Class157 method2362() {
      int var1 = -1;
      if(this.aString11478.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if(this.aString11478.indexOf("intel") != -1) {
         var1 = '\u8086';
      } else if(this.aString11478.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new Class157(var1, this.method8721()?"OpenGL FF":"OpenGL", this.anInt11499, this.aString11497, 0L, this.method8721());
   }

   Interface38 method8856(Class144 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6, var7);
   }

   void method8850() {
      OpenGL.glTexEnvi(8960, '\u8571', method10527(this.aClass372Array9835[this.anInt9787]));
   }

   Interface38 method8931(Class144 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6, var7);
   }

   Interface38 method8930(Class144 var1, Class166 var2, int var3, int var4) {
      return this.method8789(var1, var2, var3, var4);
   }

   public Class284 method8921(String var1) {
      byte[] var2 = this.method10525(var1);
      if(var2 == null) {
         return null;
      } else {
         Class274 var3 = this.method8726(var2);
         return new Class284_Sub2(this, var3);
      }
   }

   void method8837() {
      OpenGL.glActiveTexture('\u84c0' + this.anInt9787);
   }

   Interface38 method8984(Class144 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6, var7);
   }

   final void method8897(int var1, Class370 var2, boolean var3, boolean var4) {
      OpenGL.glTexEnvi(8960, '\u8580' + var1, method10528(var2));
      if(var3) {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?771:770);
      } else {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?769:768);
      }

   }

   final synchronized void method10526(int var1, int var2) {
      Class526_Sub25 var3 = new Class526_Sub25(var2);
      var3.aLong7156 = (long)var1 * -7608595443915499217L;
      this.aClass702_11483.method8176(var3, -1546323358);
   }

   void method8982() {
      if(this.aBool9686) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   static final int method10527(Class372 var0) {
      if(var0 == Class372.aClass372_3891) {
         return 7681;
      } else if(var0 == Class372.aClass372_3888) {
         return 8448;
      } else if(var0 == Class372.aClass372_3890) {
         return '\u8575';
      } else if(var0 == Class372.aClass372_3889) {
         return 260;
      } else if(var0 == Class372.aClass372_3892) {
         return '\u84e7';
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final int method10528(Class370 var0) {
      if(var0 == Class370.aClass370_3878) {
         return 5890;
      } else if(var0 == Class370.aClass370_3879) {
         return '\u8577';
      } else if(var0 == Class370.aClass370_3880) {
         return '\u8578';
      } else if(var0 == Class370.aClass370_3881) {
         return '\u8576';
      } else {
         throw new IllegalArgumentException();
      }
   }

   void method8810(int var1) {
      OpenGL.glColorMask((var1 & 1) != 0, (var1 & 2) != 0, (var1 & 4) != 0, (var1 & 8) != 0);
   }

   Interface38 method8888(Class144 var1, Class166 var2, int var3, int var4) {
      return this.method8789(var1, var2, var3, var4);
   }

   void method8840() {
      this.aFloatArray11510[0] = this.aFloat9669 * this.aFloat9708;
      this.aFloatArray11510[1] = this.aFloat9669 * this.aFloat9771;
      this.aFloatArray11510[2] = this.aFloat9669 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.aFloatArray11510, 0);
   }

   void method8813() {
      if(this.aBool9778) {
         OpenGL.glEnable(3042);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   void method10529() {
      if(this.anInt9818 == 1) {
         OpenGL.glDisable(2884);
      } else {
         OpenGL.glEnable(2884);
         if(this.anInt9818 == 2) {
            OpenGL.glCullFace(1029);
         } else if(this.anInt9818 == 3) {
            OpenGL.glCullFace(1028);
         }
      }

   }

   void method8817() {
      if(this.aBool9806 && this.aBool9805 && this.anInt9675 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   public Interface23 method2259(int var1, int var2, int var3) {
      return new Class485(this, Class144.aClass144_1684, Class166.aClass166_1889, var1, var2, var3);
   }

   void method8869(boolean var1) {
      if(var1) {
         OpenGL.glEnable('\u809d');
      } else {
         OpenGL.glDisable('\u809d');
      }

   }

   final Interface35 method8818(boolean var1) {
      return new Class486_Sub1(this, var1);
   }

   final Interface42 method8805(boolean var1) {
      return new Class486_Sub2(this, Class166.aClass166_1888, var1);
   }

   public void method2426(long var1) {
      if(var1 != 0L) {
         if(!OpenGL.glUnmapBufferARB('\u88eb')) {
            ;
         }

         OpenGL.glBindBufferARB('\u88eb', 0);
      }
   }

   public void method8820(int var1, Interface35 var2) {
      this.aClass486_Sub1Array11491[var1] = (Class486_Sub1)var2;
   }

   final void method8852(int var1, Class370 var2, boolean var3, boolean var4) {
      OpenGL.glTexEnvi(8960, '\u8580' + var1, method10528(var2));
      if(var3) {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?771:770);
      } else {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?769:768);
      }

   }

   public void method8833(Class335 var1) {
      Class359[] var2 = var1.aClass359Array3523;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < var2.length; ++var7) {
         Class359 var8 = var2[var7];
         Class486_Sub1 var9 = this.aClass486_Sub1Array11491[var7];
         int var10 = 0;
         int var11 = var9.method9145();
         long var12 = var9.method5843();
         var9.method5845();

         for(int var14 = 0; var14 < var8.method4587(); ++var14) {
            Class353 var15 = var8.method4588(var14);
            switch(var15.anInt3681) {
            case 3:
               OpenGL.glVertexPointer(3, 5126, var11, var12 + (long)var10);
               var6 = true;
               break;
            case 4:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long)var10);
               break;
            case 5:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long)var10);
               break;
            case 6:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long)var10);
            case 7:
            case 8:
            default:
               break;
            case 9:
               OpenGL.glColorPointer(4, 5121, var11, var12 + (long)var10);
               var4 = true;
               break;
            case 10:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long)var10);
               break;
            case 11:
               OpenGL.glNormalPointer(5126, var11, var12 + (long)var10);
               var5 = true;
            }

            var10 += var15.anInt3671;
         }
      }

      if(this.aBool11490 != var6) {
         if(var6) {
            OpenGL.glEnableClientState('\u8074');
         } else {
            OpenGL.glDisableClientState('\u8074');
         }

         this.aBool11490 = var6;
      }

      if(this.aBool11496 != var5) {
         if(var5) {
            OpenGL.glEnableClientState('\u8075');
         } else {
            OpenGL.glDisableClientState('\u8075');
         }

         this.aBool11496 = var5;
      }

      if(this.aBool11500 != var4) {
         if(var4) {
            OpenGL.glEnableClientState('\u8076');
         } else {
            OpenGL.glDisableClientState('\u8076');
         }

         this.aBool11500 = var4;
      }

      if(this.anInt11498 < var3) {
         for(var7 = this.anInt11498; var7 < var3; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glEnableClientState('\u8078');
         }

         this.anInt11498 = var3;
      } else if(this.anInt11498 > var3) {
         for(var7 = var3; var7 < this.anInt11498; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glDisableClientState('\u8078');
         }

         this.anInt11498 = var3;
      }

   }

   public final void method8825(Class374 var1, int var2, int var3) {
      byte var4;
      int var5;
      if(var1 == Class374.aClass374_3901) {
         var4 = 1;
         var5 = var3 * 2;
      } else if(var1 == Class374.aClass374_3896) {
         var4 = 3;
         var5 = var3 + 1;
      } else if(var1 == Class374.aClass374_3898) {
         var4 = 4;
         var5 = var3 * 3;
      } else if(var1 == Class374.aClass374_3899) {
         var4 = 6;
         var5 = var3 + 2;
      } else if(var1 == Class374.aClass374_3900) {
         var4 = 5;
         var5 = var3 + 2;
      } else {
         var4 = 0;
         var5 = var3;
      }

      OpenGL.glDrawArrays(var4, var2, var5);
   }

   final void method8826(Interface42 var1, Class374 var2, int var3, int var4, int var5, int var6) {
      byte var7;
      int var8;
      if(var2 == Class374.aClass374_3901) {
         var7 = 1;
         var8 = var6 * 2;
      } else if(var2 == Class374.aClass374_3896) {
         var7 = 3;
         var8 = var6 + 1;
      } else if(var2 == Class374.aClass374_3898) {
         var7 = 4;
         var8 = var6 * 3;
      } else if(var2 == Class374.aClass374_3899) {
         var7 = 6;
         var8 = var6 + 2;
      } else if(var2 == Class374.aClass374_3900) {
         var7 = 5;
         var8 = var6 + 2;
      } else {
         var7 = 0;
         var8 = var6;
      }

      Class166 var9 = var1.method341();
      Class486_Sub2 var10 = (Class486_Sub2)var1;
      var10.method5845();
      OpenGL.glDrawElements(var7, var8, method10532(var9), var10.method5843() + (long)(var5 * var9.anInt1891 * 1990758583));
   }

   public final void method8827(Class374 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if(var1 == Class374.aClass374_3901) {
         var6 = 1;
         var7 = var5 * 2;
      } else if(var1 == Class374.aClass374_3896) {
         var6 = 3;
         var7 = var5 + 1;
      } else if(var1 == Class374.aClass374_3898) {
         var6 = 4;
         var7 = var5 * 3;
      } else if(var1 == Class374.aClass374_3899) {
         var6 = 6;
         var7 = var5 + 2;
      } else if(var1 == Class374.aClass374_3900) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      Class166 var8 = this.aClass486_Sub2_11493.method341();
      OpenGL.glDrawElements(var6, var7, method10532(var8), this.aClass486_Sub2_11493.method5843() + (long)(var4 * var8.anInt1891 * 1990758583));
   }

   public final synchronized void method2234(int var1) {
      try {
         this.method10535();
      } catch (Exception var4) {
         return;
      }

      int var2 = 0;
      var1 &= Integer.MAX_VALUE;

      Class526_Sub25 var3;
      while(!this.aClass702_11480.method8209(-1577511346)) {
         var3 = (Class526_Sub25)this.aClass702_11480.method8177((short)-14552);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9692 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11488.method8209(-894083730)) {
         var3 = (Class526_Sub25)this.aClass702_11488.method8177((short)-15397);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9691 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteTextures(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteTextures(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11482.method8209(1312080859)) {
         var3 = (Class526_Sub25)this.aClass702_11482.method8177((short)30240);
         this.anIntArray11487[var2++] = var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11483.method8209(-1408912634)) {
         var3 = (Class526_Sub25)this.aClass702_11483.method8177((short)-24538);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9693 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray11487, 0);
         boolean var6 = false;
      }

      while(!this.aClass702_11479.method8209(-609574726)) {
         var3 = (Class526_Sub25)this.aClass702_11479.method8177((short)6039);
         OpenGL.glDeleteLists((int)(var3.aLong7156 * -6805155999452426801L), var3.anInt10550 * -1044108751);
      }

      Class526 var5;
      while(!this.aClass702_11484.method8209(1234732571)) {
         var5 = this.aClass702_11484.method8177((short)-1377);
         OpenGL.glDeleteProgram((int)(var5.aLong7156 * -6805155999452426801L));
      }

      while(!this.aClass702_11485.method8209(-2039761959)) {
         var5 = this.aClass702_11485.method8177((short)-13794);
         OpenGL.glDeleteShader((int)(var5.aLong7156 * -6805155999452426801L));
      }

      while(!this.aClass702_11479.method8209(-1316165446)) {
         var3 = (Class526_Sub25)this.aClass702_11479.method8177((short)-1356);
         OpenGL.glDeleteLists((int)(var3.aLong7156 * -6805155999452426801L), var3.anInt10550 * -1044108751);
      }

      if(this.method2522() > 100663296 && Class255.time((byte)24) > this.aLong11507 + 60000L) {
         System.gc();
         this.aLong11507 = Class255.time((byte)24);
      }

      super.method2234(var1);
   }

   boolean method8903(Class144 var1, Class166 var2) {
      return true;
   }

   public void method8761(Class433 var1) {
      float[] var2 = var1.aFloatArray4841;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   final synchronized void method10530(int var1) {
      Class526_Sub25 var2 = new Class526_Sub25(var1);
      this.aClass702_11482.method8176(var2, -227136292);
   }

   public Class178 method2562(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   void method8952() {
      OpenGL.glActiveTexture('\u84c0' + this.anInt9787);
   }

   final synchronized void method10531(int var1) {
      Class526 var2 = new Class526();
      var2.aLong7156 = (long)var1 * -7608595443915499217L;
      this.aClass702_11484.method8176(var2, -1710478119);
   }

   static final int method10532(Class166 var0) {
      switch(var0.anInt1887 * 1222994579) {
      case 0:
         return 5126;
      case 1:
         return 5131;
      case 2:
         return 5120;
      case 3:
         return 5122;
      case 4:
         return 5123;
      case 5:
         return 5125;
      case 6:
         return 5121;
      case 7:
         return 5124;
      default:
         return 5121;
      }
   }

   static int method10533(Class144 var0) {
      switch(var0.anInt1688 * 357285953) {
      case 2:
         return 6408;
      case 3:
         return 6406;
      case 4:
      case 8:
      default:
         throw new IllegalStateException();
      case 5:
         return 6407;
      case 6:
         return 6410;
      case 7:
         return 6402;
      case 9:
         return 6409;
      }
   }

   static int method10534(Class144 var0, Class166 var1) {
      if(var1 == Class166.aClass166_1884) {
         switch(var0.anInt1688 * 357285953) {
         case 1:
            return '\u83f1';
         case 2:
            return 6408;
         case 3:
            return 6406;
         case 4:
         case 7:
         default:
            throw new IllegalArgumentException();
         case 5:
            return 6407;
         case 6:
            return 6410;
         case 8:
            return '\u83f3';
         case 9:
            return 6409;
         }
      } else if(var1 == Class166.aClass166_1888) {
         switch(var0.anInt1688 * 357285953) {
         case 2:
            return '\u805b';
         case 3:
            return '\u803e';
         case 4:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 5:
            return '\u8054';
         case 6:
            return '\u8d7b';
         case 7:
            return '\u81a5';
         case 9:
            return '\u8042';
         }
      } else if(var1 == Class166.aClass166_1889) {
         switch(var0.anInt1688 * 357285953) {
         case 7:
            return '\u81a6';
         default:
            throw new IllegalArgumentException();
         }
      } else if(var1 == Class166.aClass166_1894) {
         switch(var0.anInt1688 * 357285953) {
         case 7:
            return '\u81a7';
         default:
            throw new IllegalArgumentException();
         }
      } else if(var1 == Class166.aClass166_1893) {
         switch(var0.anInt1688 * 357285953) {
         case 2:
            return '\u881a';
         case 3:
            return '\u881c';
         case 4:
         case 7:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 5:
            return '\u881b';
         case 6:
            return '\u881f';
         case 9:
            return '\u881e';
         }
      } else if(var1 == Class166.aClass166_1892) {
         switch(var0.anInt1688 * 357285953) {
         case 2:
            return '\u8814';
         case 3:
            return '\u8816';
         case 4:
         case 7:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 5:
            return '\u8815';
         case 6:
            return '\u8819';
         case 9:
            return '\u8818';
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method2359(boolean var1) {
   }

   void method10535() {
      int var1 = 0;

      while(!this.anOpenGL11492.method1220()) {
         if(var1++ > 5) {
            throw new RuntimeException("");
         }

         Class304_Sub1.method9089(1000L);
      }

   }

   void method8830(int var1) {
      if(!this.aBool11509) {
         OpenGL.glPolygonMode(1028, (var1 & 2) != 0?6913:6914);
      }

   }

   public String method2245() {
      String var1 = "Caps: 4:";
      String var2 = ":";
      var1 = var1 + this.anInt9819 + var2;
      var1 = var1 + this.anInt11489 + var2;
      var1 = var1 + this.anInt9683 + var2;
      var1 = var1 + this.anInt9719 + var2;
      var1 = var1 + (this.aBool11518?1:0) + var2;
      var1 = var1 + (this.aBool9830?1:0) + var2;
      var1 = var1 + (this.aBool11504?1:0) + var2;
      var1 = var1 + (this.aBool11506?1:0) + var2;
      var1 = var1 + (this.aBool11503?1:0) + var2;
      var1 = var1 + (this.aBool11505?1:0) + var2;
      var1 = var1 + (this.aBool9832?1:0) + var2;
      var1 = var1 + (this.aBool11501?1:0) + var2;
      var1 = var1 + (this.aBool9831?1:0) + var2;
      var1 = var1 + (this.aBool11481?1:0) + var2;
      var1 = var1 + (this.aBool9827?1:0) + var2;
      var1 = var1 + (this.aBool9794?1:0) + var2;
      var1 = var1 + (this.aBool9829?1:0) + var2;
      var1 = var1 + (this.aBool9834?1:0) + var2;
      var1 = var1 + OpenGL.glGetString('\u8b8c').toLowerCase();
      return var1;
   }

   Interface43 method8858(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class494_Sub2(this, var1, var2, var3, var4);
   }

   public Class157 method2599() {
      int var1 = -1;
      if(this.aString11478.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if(this.aString11478.indexOf("intel") != -1) {
         var1 = '\u8086';
      } else if(this.aString11478.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new Class157(var1, this.method8721()?"OpenGL FF":"OpenGL", this.anInt11499, this.aString11497, 0L, this.method8721());
   }

   void method2363(int var1, int var2) throws Exception_Sub4 {
      this.aClass184_Sub1_2026.method8451();
      if(this.anInterface24_2034 != null) {
         this.anInterface24_2034.method150((byte)1);
      }

   }

   Interface38 method8983(Class144 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6, var7);
   }

   public boolean method2408() {
      return !this.aBool11508 || this.aLongArray11517[this.anInt11520] == 0L;
   }

   void method2366() {
      super.method2233();
      if(this.anOpenGL11492 != null) {
         this.anOpenGL11492.method1221();
         this.anOpenGL11492.release();
         this.anOpenGL11492 = null;
      }

   }

   public final synchronized void method2498(int var1) {
      try {
         this.method10535();
      } catch (Exception var4) {
         return;
      }

      int var2 = 0;
      var1 &= Integer.MAX_VALUE;

      Class526_Sub25 var3;
      while(!this.aClass702_11480.method8209(385410199)) {
         var3 = (Class526_Sub25)this.aClass702_11480.method8177((short)-1026);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9692 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11488.method8209(1518964459)) {
         var3 = (Class526_Sub25)this.aClass702_11488.method8177((short)-16452);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9691 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteTextures(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteTextures(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11482.method8209(615017754)) {
         var3 = (Class526_Sub25)this.aClass702_11482.method8177((short)-5785);
         this.anIntArray11487[var2++] = var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11483.method8209(1942999431)) {
         var3 = (Class526_Sub25)this.aClass702_11483.method8177((short)1686);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9693 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray11487, 0);
         boolean var6 = false;
      }

      while(!this.aClass702_11479.method8209(-108125793)) {
         var3 = (Class526_Sub25)this.aClass702_11479.method8177((short)-3223);
         OpenGL.glDeleteLists((int)(var3.aLong7156 * -6805155999452426801L), var3.anInt10550 * -1044108751);
      }

      Class526 var5;
      while(!this.aClass702_11484.method8209(1883901440)) {
         var5 = this.aClass702_11484.method8177((short)-4352);
         OpenGL.glDeleteProgram((int)(var5.aLong7156 * -6805155999452426801L));
      }

      while(!this.aClass702_11485.method8209(1495194822)) {
         var5 = this.aClass702_11485.method8177((short)-1950);
         OpenGL.glDeleteShader((int)(var5.aLong7156 * -6805155999452426801L));
      }

      while(!this.aClass702_11479.method8209(-1077005511)) {
         var3 = (Class526_Sub25)this.aClass702_11479.method8177((short)12801);
         OpenGL.glDeleteLists((int)(var3.aLong7156 * -6805155999452426801L), var3.anInt10550 * -1044108751);
      }

      if(this.method2522() > 100663296 && Class255.time((byte)24) > this.aLong11507 + 60000L) {
         System.gc();
         this.aLong11507 = Class255.time((byte)24);
      }

      super.method2234(var1);
   }

   public final synchronized void method2564(int var1) {
      try {
         this.method10535();
      } catch (Exception var4) {
         return;
      }

      int var2 = 0;
      var1 &= Integer.MAX_VALUE;

      Class526_Sub25 var3;
      while(!this.aClass702_11480.method8209(603742436)) {
         var3 = (Class526_Sub25)this.aClass702_11480.method8177((short)7205);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9692 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11488.method8209(-1299559603)) {
         var3 = (Class526_Sub25)this.aClass702_11488.method8177((short)-5036);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9691 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteTextures(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteTextures(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11482.method8209(-891552172)) {
         var3 = (Class526_Sub25)this.aClass702_11482.method8177((short)-26997);
         this.anIntArray11487[var2++] = var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, this.anIntArray11487, 0);
         var2 = 0;
      }

      while(!this.aClass702_11483.method8209(975032938)) {
         var3 = (Class526_Sub25)this.aClass702_11483.method8177((short)-1296);
         this.anIntArray11487[var2++] = (int)(var3.aLong7156 * -6805155999452426801L);
         this.anInt9693 -= var3.anInt10550 * -1044108751;
         if(var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray11487, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, this.anIntArray11487, 0);
         boolean var6 = false;
      }

      while(!this.aClass702_11479.method8209(1297043139)) {
         var3 = (Class526_Sub25)this.aClass702_11479.method8177((short)-5046);
         OpenGL.glDeleteLists((int)(var3.aLong7156 * -6805155999452426801L), var3.anInt10550 * -1044108751);
      }

      Class526 var5;
      while(!this.aClass702_11484.method8209(-1086346603)) {
         var5 = this.aClass702_11484.method8177((short)6616);
         OpenGL.glDeleteProgram((int)(var5.aLong7156 * -6805155999452426801L));
      }

      while(!this.aClass702_11485.method8209(73094536)) {
         var5 = this.aClass702_11485.method8177((short)103);
         OpenGL.glDeleteShader((int)(var5.aLong7156 * -6805155999452426801L));
      }

      while(!this.aClass702_11479.method8209(2130541699)) {
         var3 = (Class526_Sub25)this.aClass702_11479.method8177((short)6981);
         OpenGL.glDeleteLists((int)(var3.aLong7156 * -6805155999452426801L), var3.anInt10550 * -1044108751);
      }

      if(this.method2522() > 100663296 && Class255.time((byte)24) > this.aLong11507 + 60000L) {
         System.gc();
         this.aLong11507 = Class255.time((byte)24);
      }

      super.method2234(var1);
   }

   public Class178 method2525(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   public String method2389() {
      String var1 = "Caps: 4:";
      String var2 = ":";
      var1 = var1 + this.anInt9819 + var2;
      var1 = var1 + this.anInt11489 + var2;
      var1 = var1 + this.anInt9683 + var2;
      var1 = var1 + this.anInt9719 + var2;
      var1 = var1 + (this.aBool11518?1:0) + var2;
      var1 = var1 + (this.aBool9830?1:0) + var2;
      var1 = var1 + (this.aBool11504?1:0) + var2;
      var1 = var1 + (this.aBool11506?1:0) + var2;
      var1 = var1 + (this.aBool11503?1:0) + var2;
      var1 = var1 + (this.aBool11505?1:0) + var2;
      var1 = var1 + (this.aBool9832?1:0) + var2;
      var1 = var1 + (this.aBool11501?1:0) + var2;
      var1 = var1 + (this.aBool9831?1:0) + var2;
      var1 = var1 + (this.aBool11481?1:0) + var2;
      var1 = var1 + (this.aBool9827?1:0) + var2;
      var1 = var1 + (this.aBool9794?1:0) + var2;
      var1 = var1 + (this.aBool9829?1:0) + var2;
      var1 = var1 + (this.aBool9834?1:0) + var2;
      var1 = var1 + OpenGL.glGetString('\u8b8c').toLowerCase();
      return var1;
   }

   public String method2602() {
      String var1 = "Caps: 4:";
      String var2 = ":";
      var1 = var1 + this.anInt9819 + var2;
      var1 = var1 + this.anInt11489 + var2;
      var1 = var1 + this.anInt9683 + var2;
      var1 = var1 + this.anInt9719 + var2;
      var1 = var1 + (this.aBool11518?1:0) + var2;
      var1 = var1 + (this.aBool9830?1:0) + var2;
      var1 = var1 + (this.aBool11504?1:0) + var2;
      var1 = var1 + (this.aBool11506?1:0) + var2;
      var1 = var1 + (this.aBool11503?1:0) + var2;
      var1 = var1 + (this.aBool11505?1:0) + var2;
      var1 = var1 + (this.aBool9832?1:0) + var2;
      var1 = var1 + (this.aBool11501?1:0) + var2;
      var1 = var1 + (this.aBool9831?1:0) + var2;
      var1 = var1 + (this.aBool11481?1:0) + var2;
      var1 = var1 + (this.aBool9827?1:0) + var2;
      var1 = var1 + (this.aBool9794?1:0) + var2;
      var1 = var1 + (this.aBool9829?1:0) + var2;
      var1 = var1 + (this.aBool9834?1:0) + var2;
      var1 = var1 + OpenGL.glGetString('\u8b8c').toLowerCase();
      return var1;
   }

   public void method2393(boolean var1) {
   }

   public void method2394(boolean var1) {
   }

   Class184_Sub1 method2286(Canvas var1, int var2, int var3) {
      return new Class184_Sub1_Sub2_Sub2(this, var1);
   }

   Class184_Sub1 method2619(Canvas var1, int var2, int var3) {
      return new Class184_Sub1_Sub2_Sub2(this, var1);
   }

   public int[] method2397(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];
      int var6 = this.aClass184_2049.method2693();

      for(int var7 = 0; var7 < var4; ++var7) {
         OpenGL.glReadPixelsi(var1, var6 - var2 - var7 - 1, var3, 1, '\u80e1', this.anInt11489, var5, var7 * var3);
      }

      return var5;
   }

   public void method2398() {
      if(this.aClass184_2049 != null) {
         int var1 = this.aClass184_2049.method2691();
         int var2 = this.aClass184_2049.method2693();
         if(var1 > 0 || var2 > 0) {
            int var3 = this.anInt9740;
            int var4 = this.anInt9738;
            int var5 = this.anInt9742;
            int var6 = this.anInt9743;
            this.method2274();
            int var7 = this.anInt9682;
            int var8 = this.anInt9735;
            int var9 = this.anInt9732;
            int var10 = this.anInt9789;
            this.method2278();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method8762();
            this.method8814(false);
            this.method8871(false);
            this.method8867(false);
            this.method8782(false);
            this.method8841((Interface41)null);
            this.method8793(1);
            this.method8807(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glDisable(3553);
            OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
            OpenGL.glEnable(3553);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method2538(var7, var9, var8, var10);
            this.method2573(var3, var4, var5, var6);
         }
      }
   }

   public Class178 method2526(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   public void method2399() {
      if(this.aClass184_2049 != null) {
         int var1 = this.aClass184_2049.method2691();
         int var2 = this.aClass184_2049.method2693();
         if(var1 > 0 || var2 > 0) {
            int var3 = this.anInt9740;
            int var4 = this.anInt9738;
            int var5 = this.anInt9742;
            int var6 = this.anInt9743;
            this.method2274();
            int var7 = this.anInt9682;
            int var8 = this.anInt9735;
            int var9 = this.anInt9732;
            int var10 = this.anInt9789;
            this.method2278();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method8762();
            this.method8814(false);
            this.method8871(false);
            this.method8867(false);
            this.method8782(false);
            this.method8841((Interface41)null);
            this.method8793(1);
            this.method8807(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glDisable(3553);
            OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
            OpenGL.glEnable(3553);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method2538(var7, var9, var8, var10);
            this.method2573(var3, var4, var5, var6);
         }
      }
   }

   void method8949() {
      OpenGL.glMatrixMode(5890);
      if(this.aClass363Array9774[this.anInt9787] != Class363.aClass363_3844) {
         OpenGL.glLoadMatrixf(this.aClass433Array9773[this.anInt9787].method5107(this.aFloatArray11511), 0);
      } else {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glMatrixMode(5888);
   }

   public boolean method2404() {
      return this.aBool11508;
   }

   public boolean method2264() {
      return !this.aBool11508 || this.aLongArray11517[this.anInt11520] == 0L;
   }

   public boolean method2406() {
      return !this.aBool11508 || this.aLongArray11517[this.anInt11520] == 0L;
   }

   public boolean method2407() {
      return !this.aBool11508 || this.aLongArray11517[this.anInt11520] == 0L;
   }

   void method8771() {
      OpenGL.glDepthMask(this.aBool9808 && this.aBool9784);
   }

   public Class157 method2502() {
      int var1 = -1;
      if(this.aString11478.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if(this.aString11478.indexOf("intel") != -1) {
         var1 = '\u8086';
      } else if(this.aString11478.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new Class157(var1, this.method8721()?"OpenGL FF":"OpenGL", this.anInt11499, this.aString11497, 0L, this.method8721());
   }

   public boolean method2410() {
      return true;
   }

   public boolean method2411() {
      return false;
   }

   public boolean method2412() {
      return false;
   }

   public boolean method2413() {
      return false;
   }

   public int method2414() {
      if(this.aBool11508) {
         if(this.aLongArray11517[this.anInt11519] == 0L) {
            return -1;
         } else {
            int var1 = OpenGL.glClientWaitSync(this.aLongArray11517[this.anInt11519], 0, 0);
            if(var1 == '\u911d') {
               this.method2267();
               return -1;
            } else {
               return var1 != '\u911b'?this.anIntArray11516[this.anInt11519]:-1;
            }
         }
      } else {
         return -1;
      }
   }

   public int method2415() {
      if(this.aBool11508) {
         if(this.aLongArray11517[this.anInt11519] == 0L) {
            return -1;
         } else {
            int var1 = OpenGL.glClientWaitSync(this.aLongArray11517[this.anInt11519], 0, 0);
            if(var1 == '\u911d') {
               this.method2267();
               return -1;
            } else {
               return var1 != '\u911b'?this.anIntArray11516[this.anInt11519]:-1;
            }
         }
      } else {
         return -1;
      }
   }

   public void method2532(int var1, int var2, int var3) {
      this.method2396();
      if(this.aClass184_Sub2_11515 == null) {
         this.method10524(var2, var3);
      }

      if(this.aClass153_11513 == null) {
         this.aClass153_11513 = this.method2311(0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), false);
      } else {
         this.aClass153_11513.method1776(0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), 0, 0);
      }

      this.method2623(this.aClass184_Sub2_11515, (short)128);
      this.method2283(1, -16777216);
      this.aClass153_11513.method1772(this.anInt2055 * 1228368769, this.anInt2039 * 1714687685, this.anInt2033 * -1550496547, this.anInt2058 * 568592699);
      OpenGL.glBindBufferARB('\u88eb', this.anIntArray11502[this.anInt11520]);
      OpenGL.glReadPixelsub(0, 0, this.anInt2053 * -742368129, this.anInt2044 * -208544951, '\u80e1', 5121, (byte[])null, 0);
      OpenGL.glBindBufferARB('\u88eb', 0);
      this.method2456(this.aClass184_Sub2_11515, (byte)0);
      this.aLongArray11517[this.anInt11520] = OpenGL.glFenceSync('\u9117', 0);
      this.anIntArray11516[this.anInt11520] = var1;
      if(++this.anInt11520 >= 3) {
         this.anInt11520 = 0;
      }

      this.method2314();
   }

   public void method2417(int var1, int var2, int var3) {
      this.method2396();
      if(this.aClass184_Sub2_11515 == null) {
         this.method10524(var2, var3);
      }

      if(this.aClass153_11513 == null) {
         this.aClass153_11513 = this.method2311(0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), false);
      } else {
         this.aClass153_11513.method1776(0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), 0, 0);
      }

      this.method2623(this.aClass184_Sub2_11515, (short)128);
      this.method2283(1, -16777216);
      this.aClass153_11513.method1772(this.anInt2055 * 1228368769, this.anInt2039 * 1714687685, this.anInt2033 * -1550496547, this.anInt2058 * 568592699);
      OpenGL.glBindBufferARB('\u88eb', this.anIntArray11502[this.anInt11520]);
      OpenGL.glReadPixelsub(0, 0, this.anInt2053 * -742368129, this.anInt2044 * -208544951, '\u80e1', 5121, (byte[])null, 0);
      OpenGL.glBindBufferARB('\u88eb', 0);
      this.method2456(this.aClass184_Sub2_11515, (byte)0);
      this.aLongArray11517[this.anInt11520] = OpenGL.glFenceSync('\u9117', 0);
      this.anIntArray11516[this.anInt11520] = var1;
      if(++this.anInt11520 >= 3) {
         this.anInt11520 = 0;
      }

      this.method2314();
   }

   public void method2418() {
      for(int var1 = 0; var1 < 3; ++var1) {
         if(this.aLongArray11517[var1] != 0L) {
            OpenGL.glDeleteSync(this.aLongArray11517[var1]);
            this.aLongArray11517[var1] = 0L;
         }
      }

      this.anInt11520 = 0;
      this.anInt11519 = 0;
   }

   void method8776() {
      this.aFloatArray11510[0] = this.aFloat9669 * this.aFloat9708;
      this.aFloatArray11510[1] = this.aFloat9669 * this.aFloat9771;
      this.aFloatArray11510[2] = this.aFloat9669 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.aFloatArray11510, 0);
   }

   public long method2420(int var1, int var2) {
      return this.method10523(var1, var2, (int[])null, (int[])null);
   }

   Interface38 method8932(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6);
   }

   void method8954() {
      if(this.aBool9834) {
         byte var1 = 0;
         byte var2 = 0;
         if(this.anInt9840 == 0) {
            var1 = 0;
            var2 = 0;
         } else if(this.anInt9840 == 1) {
            var1 = 1;
            var2 = 0;
         } else if(this.anInt9840 == 2) {
            var1 = 1;
            var2 = 1;
         } else if(this.anInt9840 == 3) {
            var1 = 0;
            var2 = 1;
         }

         if(this.aClass369_9814 == Class369.aClass369_3876) {
            OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
         } else if(this.aClass369_9814 == Class369.aClass369_3874) {
            OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
         } else if(this.aClass369_9814 == Class369.aClass369_3873) {
            OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
         } else if(this.aClass369_9814 == Class369.aClass369_3877) {
            OpenGL.glBlendFuncSeparate(1, 0, var1, var2);
         }
      } else if(this.aClass369_9814 == Class369.aClass369_3876) {
         OpenGL.glEnable(3042);
         OpenGL.glBlendFunc(770, 771);
      } else if(this.aClass369_9814 == Class369.aClass369_3874) {
         OpenGL.glEnable(3042);
         OpenGL.glBlendFunc(1, 1);
      } else if(this.aClass369_9814 == Class369.aClass369_3873) {
         OpenGL.glEnable(3042);
         OpenGL.glBlendFunc(774, 1);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   public void method2423(int var1, int var2, int[] var3, int[] var4) {
      this.method10523(var1, var2, var3, var4);
   }

   public void method2424() {
      if(this.aBool11508) {
         this.aClass153_11513 = null;
         if(this.aClass184_Sub2_11515 != null) {
            this.aClass184_Sub2_11515.method140();
            this.aClass184_Sub2_11515 = null;
         }

         OpenGL.glDeleteBuffersARB(3, this.anIntArray11502, 0);

         for(int var1 = 0; var1 < 3; ++var1) {
            this.anIntArray11502[var1] = 0;
            if(this.aLongArray11517[var1] != 0L) {
               OpenGL.glDeleteSync(this.aLongArray11517[var1]);
               this.aLongArray11517[var1] = 0L;
            }
         }
      } else {
         this.aClass184_Sub2_11515 = null;
         this.aClass153_11514 = null;
         this.aClass153_11513 = null;
      }

      this.anInt11520 = 0;
      this.anInt11519 = 0;
   }

   public void method2609() {
      if(this.aBool11508) {
         this.aClass153_11513 = null;
         if(this.aClass184_Sub2_11515 != null) {
            this.aClass184_Sub2_11515.method140();
            this.aClass184_Sub2_11515 = null;
         }

         OpenGL.glDeleteBuffersARB(3, this.anIntArray11502, 0);

         for(int var1 = 0; var1 < 3; ++var1) {
            this.anIntArray11502[var1] = 0;
            if(this.aLongArray11517[var1] != 0L) {
               OpenGL.glDeleteSync(this.aLongArray11517[var1]);
               this.aLongArray11517[var1] = 0L;
            }
         }
      } else {
         this.aClass184_Sub2_11515 = null;
         this.aClass153_11514 = null;
         this.aClass153_11513 = null;
      }

      this.anInt11520 = 0;
      this.anInt11519 = 0;
   }

   public void method2439(int var1, int var2) {
      int var3 = 0;
      if((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if((var1 & 2) != 0) {
         this.method8782(true);
         var3 |= 256;
      }

      if((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   public void method2440(int var1, int var2) {
      int var3 = 0;
      if((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if((var1 & 2) != 0) {
         this.method8782(true);
         var3 |= 256;
      }

      if((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   public Interface23 method2572(int var1, int var2, int var3) {
      return new Class485(this, Class144.aClass144_1684, Class166.aClass166_1889, var1, var2, var3);
   }

   public Class178 method2524(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   final synchronized void method10536(long var1) {
      Class526 var3 = new Class526();
      var3.aLong7156 = var1 * -7608595443915499217L;
      this.aClass702_11485.method8176(var3, -1240021899);
   }

   public Class178 method2527(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   public Class184_Sub2 method2467() {
      return new Class184_Sub2_Sub1_Sub1(this);
   }

   public boolean method2401() {
      return true;
   }

   public Class184_Sub2 method2346() {
      return new Class184_Sub2_Sub1_Sub1(this);
   }

   public Class184_Sub2 method2565() {
      return new Class184_Sub2_Sub1_Sub1(this);
   }

   public Class184_Sub2 method2566() {
      return new Class184_Sub2_Sub1_Sub1(this);
   }

   Interface44 method8896(int var1, boolean var2, int[][] var3) {
      return new Class494_Sub1(this, var1, var2, var3);
   }

   final void method8834() {
      this.aFloatArray11510[0] = (float)(this.anInt9813 & 16711680) / 1.671168E7F;
      this.aFloatArray11510[1] = (float)(this.anInt9813 & '\uff00') / 65280.0F;
      this.aFloatArray11510[2] = (float)(this.anInt9813 & 255) / 255.0F;
      this.aFloatArray11510[3] = (float)(this.anInt9813 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray11510, 0);
   }

   Class335 method8968(Class359[] var1) {
      return new Class335_Sub2(var1);
   }

   void method8893() {
      if(this.aClass184_2049 != null) {
         OpenGL.glViewport(this.anInt9698 + this.anInt9740, this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9738 - this.anInt9743, this.anInt9742, this.anInt9743);
      }

      OpenGL.glDepthRange(this.aFloat9726, this.aFloat9727);
   }

   public Interface23 method2571(int var1, int var2, int var3) {
      return new Class485(this, Class144.aClass144_1684, Class166.aClass166_1889, var1, var2, var3);
   }

   void method8922() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.aClass433_9753.aFloatArray4841, 0);

      int var1;
      for(var1 = 0; var1 < this.anInt9766; ++var1) {
         Class526_Sub16 var2 = this.aClass526_Sub16Array9764[var1];
         int var3 = var2.method9394(1674676844);
         int var4 = 16386 + var1;
         float var5 = var2.method9419(1613563498) / 255.0F;
         this.aFloatArray11510[0] = (float)var2.method9390((byte)-64);
         this.aFloatArray11510[1] = (float)var2.method9391(1493952372);
         this.aFloatArray11510[2] = (float)var2.method9392((byte)-60);
         this.aFloatArray11510[3] = 1.0F;
         OpenGL.glLightfv(var4, 4611, this.aFloatArray11510, 0);
         this.aFloatArray11510[0] = (float)(var3 >> 16 & 255) * var5;
         this.aFloatArray11510[1] = (float)(var3 >> 8 & 255) * var5;
         this.aFloatArray11510[2] = (float)(var3 & 255) * var5;
         this.aFloatArray11510[3] = 1.0F;
         OpenGL.glLightfv(var4, 4609, this.aFloatArray11510, 0);
         OpenGL.glLightf(var4, 4617, 1.0F / (float)(var2.method9422((short)8192) * var2.method9422((short)8192)));
         OpenGL.glEnable(var4);
      }

      while(var1 < this.anInt9765) {
         OpenGL.glDisable(16386 + var1);
         ++var1;
      }

   }

   public Interface23 method2260(int var1, int var2, int var3) {
      return new Class485(this, Class144.aClass144_1684, Class166.aClass166_1889, var1, var2, var3);
   }

   public void method8940() {
      int var1 = this.anIntArray11494[this.anInt9787];
      if(var1 != 0) {
         this.anIntArray11494[this.anInt9787] = 0;
         OpenGL.glBindTexture(var1, 0);
         OpenGL.glDisable(var1);
      }

   }

   public boolean method8866() {
      return this.aBool11503;
   }

   public boolean method8736() {
      return this.aBool11503;
   }

   public boolean method8846() {
      return this.aBool11505;
   }

   public boolean method8868() {
      return this.aBool11505;
   }

   void method8838() {
      if(this.aBool9751) {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      } else {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      }

   }

   public boolean method8870(boolean var1) {
      return true;
   }

   public Class284 method8873(String var1) {
      byte[] var2 = this.method10525(var1);
      if(var2 == null) {
         return null;
      } else {
         Class274 var3 = this.method8726(var2);
         return new Class284_Sub2(this, var3);
      }
   }

   public Class284 method8874(String var1) {
      byte[] var2 = this.method10525(var1);
      if(var2 == null) {
         return null;
      } else {
         Class274 var3 = this.method8726(var2);
         return new Class284_Sub2(this, var3);
      }
   }

   void method8803() {
      OpenGL.glTexEnvi(8960, '\u8571', method10527(this.aClass372Array9835[this.anInt9787]));
   }

   public void method8876(Class433 var1, Class433 var2, Class433 var3) {
      OpenGL.glMatrixMode(5888);
      this.aClass433_9705.method5118(var1, var2);
      OpenGL.glLoadMatrixf(this.aClass433_9705.aFloatArray4841, 0);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var3.aFloatArray4841, 0);
   }

   void method8878() {
      OpenGL.glDepthFunc(515);
      this.method10529();
      OpenGL.glClearDepth(1.0F);
      OpenGL.glAlphaFunc(516, 0.0F);
      OpenGL.glPolygonMode(1028, 6914);
      if(this.aBool9830) {
         this.method8869(this.anInt9819 > 1);
         OpenGL.glDisable('\u809e');
      }

      for(int var1 = this.anInt9683 - 1; var1 >= 0; --var1) {
         OpenGL.glActiveTexture('\u84c0' + var1);
         OpenGL.glTexEnvi(8960, 8704, '\u8570');
         OpenGL.glTexEnvi(8960, '\u8571', 8448);
         OpenGL.glTexEnvi(8960, '\u8582', '\u8576');
         OpenGL.glTexEnvi(8960, '\u8572', 8448);
         OpenGL.glTexEnvi(8960, '\u858a', '\u8576');
      }

      OpenGL.glTexEnvi(8960, '\u858a', '\u8578');
      OpenGL.glShadeModel(7425);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var2 = 0; var2 < 8; ++var2) {
         int var3 = 16384 + var2;
         OpenGL.glLightfv(var3, 4608, var4, 0);
         OpenGL.glLightf(var3, 4615, 0.0F);
         OpenGL.glLightf(var3, 4616, 0.0F);
      }

      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      this.anOpenGL11492.setSwapInterval(0);
      super.method8729();
   }

   void method8879() {
      OpenGL.glDepthFunc(515);
      this.method10529();
      OpenGL.glClearDepth(1.0F);
      OpenGL.glAlphaFunc(516, 0.0F);
      OpenGL.glPolygonMode(1028, 6914);
      if(this.aBool9830) {
         this.method8869(this.anInt9819 > 1);
         OpenGL.glDisable('\u809e');
      }

      for(int var1 = this.anInt9683 - 1; var1 >= 0; --var1) {
         OpenGL.glActiveTexture('\u84c0' + var1);
         OpenGL.glTexEnvi(8960, 8704, '\u8570');
         OpenGL.glTexEnvi(8960, '\u8571', 8448);
         OpenGL.glTexEnvi(8960, '\u8582', '\u8576');
         OpenGL.glTexEnvi(8960, '\u8572', 8448);
         OpenGL.glTexEnvi(8960, '\u858a', '\u8576');
      }

      OpenGL.glTexEnvi(8960, '\u858a', '\u8578');
      OpenGL.glShadeModel(7425);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var2 = 0; var2 < 8; ++var2) {
         int var3 = 16384 + var2;
         OpenGL.glLightfv(var3, 4608, var4, 0);
         OpenGL.glLightf(var3, 4615, 0.0F);
         OpenGL.glLightf(var3, 4616, 0.0F);
      }

      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      this.anOpenGL11492.setSwapInterval(0);
      super.method8729();
   }

   public float method8886() {
      return 0.0F;
   }

   void method8891() {
      if(this.aClass184_2049 != null) {
         OpenGL.glViewport(this.anInt9698 + this.anInt9740, this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9738 - this.anInt9743, this.anInt9742, this.anInt9743);
      }

      OpenGL.glDepthRange(this.aFloat9726, this.aFloat9727);
   }

   void method8892() {
      if(this.aClass184_2049 != null) {
         OpenGL.glViewport(this.anInt9698 + this.anInt9740, this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9738 - this.anInt9743, this.anInt9742, this.anInt9743);
      }

      OpenGL.glDepthRange(this.aFloat9726, this.aFloat9727);
   }

   Interface43 method8789(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class494_Sub2(this, var1, var2, var3, var4);
   }

   void method8787() {
      if(this.aClass184_2049 != null) {
         int var1 = this.anInt9698 + this.anInt9682;
         int var2 = this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9789;
         int var3 = this.anInt9735 - this.anInt9682;
         int var4 = this.anInt9789 - this.anInt9732;
         if(var3 < 0) {
            var3 = 0;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   void method8894() {
      if(this.aClass184_2049 != null) {
         int var1 = this.anInt9698 + this.anInt9682;
         int var2 = this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9789;
         int var3 = this.anInt9735 - this.anInt9682;
         int var4 = this.anInt9789 - this.anInt9732;
         if(var3 < 0) {
            var3 = 0;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   void method8785() {
      if(this.aBool9816) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

      OpenGL.glAlphaFunc(516, (float)(this.aByte9824 & 255) / 255.0F);
      if(this.anInt9819 > 1) {
         if(this.aByte9824 != 0) {
            OpenGL.glEnable('\u809e');
         } else {
            OpenGL.glDisable('\u809e');
         }
      }

   }

   final void method8851(int var1, Class370 var2, boolean var3, boolean var4) {
      OpenGL.glTexEnvi(8960, '\u8580' + var1, method10528(var2));
      if(var3) {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?771:770);
      } else {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?769:768);
      }

   }

   void method8806(boolean var1) {
      if(var1) {
         OpenGL.glEnable('\u809d');
      } else {
         OpenGL.glDisable('\u809d');
      }

   }

   public void method8900(Class433 var1) {
      float[] var2 = var1.aFloatArray4841;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   public void method8901(Class433 var1) {
      float[] var2 = var1.aFloatArray4841;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   void method8855() {
      if(this.aBool9748 && this.aBool9749) {
         OpenGL.glEnable(2929);
      } else {
         OpenGL.glDisable(2929);
      }

   }

   void method8908() {
      OpenGL.glDepthMask(this.aBool9808 && this.aBool9784);
   }

   public void method8741(int var1, Interface35 var2) {
      this.aClass486_Sub1Array11491[var1] = (Class486_Sub1)var2;
   }

   public boolean method2299() {
      return !this.aBool11508 || this.aLongArray11517[this.anInt11520] == 0L;
   }

   void method8912() {
      if(this.aBool9744 && !this.aBool9768) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   void method8963(boolean var1) {
      if(var1) {
         OpenGL.glEnable('\u809d');
      } else {
         OpenGL.glDisable('\u809d');
      }

   }

   public int[] method2479(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];
      int var6 = this.aClass184_2049.method2693();

      for(int var7 = 0; var7 < var4; ++var7) {
         OpenGL.glReadPixelsi(var1, var6 - var2 - var7 - 1, var3, 1, '\u80e1', this.anInt11489, var5, var7 * var3);
      }

      return var5;
   }

   void method8914() {
      this.aFloatArray11510[0] = this.aFloat9669 * this.aFloat9708;
      this.aFloatArray11510[1] = this.aFloat9669 * this.aFloat9771;
      this.aFloatArray11510[2] = this.aFloat9669 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.aFloatArray11510, 0);
   }

   void method8915() {
      this.aFloatArray11510[0] = this.aFloat9669 * this.aFloat9708;
      this.aFloatArray11510[1] = this.aFloat9669 * this.aFloat9771;
      this.aFloatArray11510[2] = this.aFloat9669 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.aFloatArray11510, 0);
   }

   void method8916() {
      this.aFloatArray11510[0] = this.aFloat9669 * this.aFloat9708;
      this.aFloatArray11510[1] = this.aFloat9669 * this.aFloat9771;
      this.aFloatArray11510[2] = this.aFloat9669 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.aFloatArray11510, 0);
   }

   void method8918() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.aClass433_9753.aFloatArray4841, 0);
      OpenGL.glLightfv(16384, 4611, this.aFloatArray9777, 0);
      OpenGL.glLightfv(16385, 4611, this.aFloatArray9701, 0);
   }

   void method8919() {
      if(this.aBool9751) {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      } else {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      }

   }

   boolean method8923(Class144 var1, Class166 var2) {
      return true;
   }

   public final void method8835(Class374 var1, int var2, int var3) {
      byte var4;
      int var5;
      if(var1 == Class374.aClass374_3901) {
         var4 = 1;
         var5 = var3 * 2;
      } else if(var1 == Class374.aClass374_3896) {
         var4 = 3;
         var5 = var3 + 1;
      } else if(var1 == Class374.aClass374_3898) {
         var4 = 4;
         var5 = var3 * 3;
      } else if(var1 == Class374.aClass374_3899) {
         var4 = 6;
         var5 = var3 + 2;
      } else if(var1 == Class374.aClass374_3900) {
         var4 = 5;
         var5 = var3 + 2;
      } else {
         var4 = 0;
         var5 = var3;
      }

      OpenGL.glDrawArrays(var4, var2, var5);
   }

   void method8769(Interface42 var1) {
      this.aClass486_Sub2_11493 = (Class486_Sub2)var1;
      this.aClass486_Sub2_11493.method5845();
   }

   public float method8737() {
      return 0.0F;
   }

   boolean method8924(Class144 var1, Class166 var2) {
      return true;
   }

   public boolean method8863() {
      return this.aBool11505;
   }

   void method8911() {
      if(this.aBool9744 && !this.aBool9768) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   boolean method8794(Class144 var1, Class166 var2) {
      return this.aBool9832;
   }

   boolean method8832(Class144 var1, Class166 var2) {
      return this.aBool9832;
   }

   boolean method8927(Class144 var1, Class166 var2) {
      return this.aBool9832;
   }

   Interface38 method8907(Class144 var1, Class166 var2, int var3, int var4) {
      return this.method8789(var1, var2, var3, var4);
   }

   void method8917() {
      this.aFloatArray11510[0] = this.aFloat9823 * this.aFloat9708;
      this.aFloatArray11510[1] = this.aFloat9823 * this.aFloat9771;
      this.aFloatArray11510[2] = this.aFloat9823 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightfv(16384, 4609, this.aFloatArray11510, 0);
      this.aFloatArray11510[0] = -this.aFloat9763 * this.aFloat9708;
      this.aFloatArray11510[1] = -this.aFloat9763 * this.aFloat9771;
      this.aFloatArray11510[2] = -this.aFloat9763 * this.aFloat9760;
      this.aFloatArray11510[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, this.aFloatArray11510, 0);
   }

   public boolean method2265() {
      return false;
   }

   public boolean method2409() {
      return true;
   }

   final Interface35 method8966(boolean var1) {
      return new Class486_Sub1(this, var1);
   }

   Interface38 method8799(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6);
   }

   Interface44 method8933(int var1, boolean var2, int[][] var3) {
      return new Class494_Sub1(this, var1, var2, var3);
   }

   void method8956() {
      OpenGL.glTexEnvi(8960, '\u8572', method10527(this.aClass372Array9776[this.anInt9787]));
   }

   Interface37 method8937(Class144 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new Class494_Sub3(this, var1, var2, var3, var4, var5, var6);
   }

   Interface44 method8791(int var1, boolean var2, int[][] var3) {
      return new Class494_Sub1(this, var1, var2, var3);
   }

   public void method2400() {
      if(this.aClass184_2049 != null) {
         int var1 = this.aClass184_2049.method2691();
         int var2 = this.aClass184_2049.method2693();
         if(var1 > 0 || var2 > 0) {
            int var3 = this.anInt9740;
            int var4 = this.anInt9738;
            int var5 = this.anInt9742;
            int var6 = this.anInt9743;
            this.method2274();
            int var7 = this.anInt9682;
            int var8 = this.anInt9735;
            int var9 = this.anInt9732;
            int var10 = this.anInt9789;
            this.method2278();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method8762();
            this.method8814(false);
            this.method8871(false);
            this.method8867(false);
            this.method8782(false);
            this.method8841((Interface41)null);
            this.method8793(1);
            this.method8807(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glDisable(3553);
            OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
            OpenGL.glEnable(3553);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method2538(var7, var9, var8, var10);
            this.method2573(var3, var4, var5, var6);
         }
      }
   }

   Interface43 method8936(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class494_Sub2(this, var1, var2, var3, var4);
   }

   public void method8795() {
      int var1 = this.anIntArray11494[this.anInt9787];
      if(var1 != 0) {
         this.anIntArray11494[this.anInt9787] = 0;
         OpenGL.glBindTexture(var1, 0);
         OpenGL.glDisable(var1);
      }

   }

   public void method8821() {
      int var1 = this.anIntArray11494[this.anInt9787];
      if(var1 != 0) {
         this.anIntArray11494[this.anInt9787] = 0;
         OpenGL.glBindTexture(var1, 0);
         OpenGL.glDisable(var1);
      }

   }

   public void method8860() {
      int var1 = this.anIntArray11494[this.anInt9787];
      if(var1 != 0) {
         this.anIntArray11494[this.anInt9787] = 0;
         OpenGL.glBindTexture(var1, 0);
         OpenGL.glDisable(var1);
      }

   }

   final void method8939(int var1, Class370 var2, boolean var3, boolean var4) {
      OpenGL.glTexEnvi(8960, '\u8580' + var1, method10528(var2));
      if(var3) {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?771:770);
      } else {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?769:768);
      }

   }

   void method8960() {
      this.aFloat9677 = this.aFloat9731 - (float)this.anInt9809;
      this.aFloat9810 = this.aFloat9677 - (float)this.anInt9675;
      if(this.aFloat9810 < this.aFloat9730) {
         this.aFloat9810 = this.aFloat9730;
      }

      if(this.aBool9761) {
         OpenGL.glFogf(2915, this.aFloat9810);
         OpenGL.glFogf(2916, this.aFloat9677);
         this.aFloatArray11510[0] = (float)(this.anInt9722 & 16711680) / 1.671168E7F;
         this.aFloatArray11510[1] = (float)(this.anInt9722 & '\uff00') / 65280.0F;
         this.aFloatArray11510[2] = (float)(this.anInt9722 & 255) / 255.0F;
         OpenGL.glFogfv(2918, this.aFloatArray11510, 0);
      }

   }

   boolean method8972(Class144 var1, Class166 var2) {
      return true;
   }

   public void method2283(int var1, int var2) {
      int var3 = 0;
      if((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if((var1 & 2) != 0) {
         this.method8782(true);
         var3 |= 256;
      }

      if((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   final void method8942(int var1, Class370 var2, boolean var3) {
      OpenGL.glTexEnvi(8960, '\u8588' + var1, method10528(var2));
      OpenGL.glTexEnvi(8960, '\u8598' + var1, var3?771:770);
   }

   final void method8947() {
      this.aFloatArray11510[0] = (float)(this.anInt9813 & 16711680) / 1.671168E7F;
      this.aFloatArray11510[1] = (float)(this.anInt9813 & '\uff00') / 65280.0F;
      this.aFloatArray11510[2] = (float)(this.anInt9813 & 255) / 255.0F;
      this.aFloatArray11510[3] = (float)(this.anInt9813 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray11510, 0);
   }

   final void method8943() {
      this.aFloatArray11510[0] = (float)(this.anInt9813 & 16711680) / 1.671168E7F;
      this.aFloatArray11510[1] = (float)(this.anInt9813 & '\uff00') / 65280.0F;
      this.aFloatArray11510[2] = (float)(this.anInt9813 & 255) / 255.0F;
      this.aFloatArray11510[3] = (float)(this.anInt9813 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray11510, 0);
   }

   void method8973() {
      OpenGL.glMatrixMode(5890);
      if(this.aClass363Array9774[this.anInt9787] != Class363.aClass363_3844) {
         OpenGL.glLoadMatrixf(this.aClass433Array9773[this.anInt9787].method5107(this.aFloatArray11511), 0);
      } else {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glMatrixMode(5888);
   }

   void method8981() {
      OpenGL.glMatrixMode(5890);
      if(this.aClass363Array9774[this.anInt9787] != Class363.aClass363_3844) {
         OpenGL.glLoadMatrixf(this.aClass433Array9773[this.anInt9787].method5107(this.aFloatArray11511), 0);
      } else {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glMatrixMode(5888);
   }

   public void method8991(Class433 var1) {
      float[] var2 = var1.aFloatArray4841;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   void method8950() {
      OpenGL.glActiveTexture('\u84c0' + this.anInt9787);
   }

   void method8957() {
      if(this.aBool9751) {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      } else {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      }

   }

   void method8735() {
      OpenGL.glActiveTexture('\u84c0' + this.anInt9787);
   }

   void method8909() {
      OpenGL.glActiveTexture('\u84c0' + this.anInt9787);
   }

   void method8895() {
      if(this.aClass184_2049 != null) {
         int var1 = this.anInt9698 + this.anInt9682;
         int var2 = this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9789;
         int var3 = this.anInt9735 - this.anInt9682;
         int var4 = this.anInt9789 - this.anInt9732;
         if(var3 < 0) {
            var3 = 0;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   final void method8941(int var1, Class370 var2, boolean var3) {
      OpenGL.glTexEnvi(8960, '\u8588' + var1, method10528(var2));
      OpenGL.glTexEnvi(8960, '\u8598' + var1, var3?771:770);
   }

   void method8828() {
      OpenGL.glTexEnvi(8960, '\u8572', method10527(this.aClass372Array9776[this.anInt9787]));
   }

   void method8777(int var1) {
      OpenGL.glColorMask((var1 & 1) != 0, (var1 & 2) != 0, (var1 & 4) != 0, (var1 & 8) != 0);
   }

   public Interface21 method2567(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return new Class485(this, var3, var4, var1, var2, var5);
   }

   void method8843() {
      if(this.aBool9816) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

      OpenGL.glAlphaFunc(516, (float)(this.aByte9824 & 255) / 255.0F);
      if(this.anInt9819 > 1) {
         if(this.aByte9824 != 0) {
            OpenGL.glEnable('\u809e');
         } else {
            OpenGL.glDisable('\u809e');
         }
      }

   }

   void method8847() {
      if(this.aBool9834) {
         byte var1 = 0;
         byte var2 = 0;
         if(this.anInt9840 == 0) {
            var1 = 0;
            var2 = 0;
         } else if(this.anInt9840 == 1) {
            var1 = 1;
            var2 = 0;
         } else if(this.anInt9840 == 2) {
            var1 = 1;
            var2 = 1;
         } else if(this.anInt9840 == 3) {
            var1 = 0;
            var2 = 1;
         }

         if(this.aClass369_9814 == Class369.aClass369_3876) {
            OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
         } else if(this.aClass369_9814 == Class369.aClass369_3874) {
            OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
         } else if(this.aClass369_9814 == Class369.aClass369_3873) {
            OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
         } else if(this.aClass369_9814 == Class369.aClass369_3877) {
            OpenGL.glBlendFuncSeparate(1, 0, var1, var2);
         }
      } else if(this.aClass369_9814 == Class369.aClass369_3876) {
         OpenGL.glEnable(3042);
         OpenGL.glBlendFunc(770, 771);
      } else if(this.aClass369_9814 == Class369.aClass369_3874) {
         OpenGL.glEnable(3042);
         OpenGL.glBlendFunc(1, 1);
      } else if(this.aClass369_9814 == Class369.aClass369_3873) {
         OpenGL.glEnable(3042);
         OpenGL.glBlendFunc(774, 1);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   void method8958() {
      if(this.aBool9778) {
         OpenGL.glEnable(3042);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   void method8959() {
      if(this.aBool9778) {
         OpenGL.glEnable(3042);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   Interface38 method8801(Class144 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6, var7);
   }

   Interface37 method8953(Class144 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new Class494_Sub3(this, var1, var2, var3, var4, var5, var6);
   }

   void method8920() {
      if(this.aBool9751) {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      } else {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      }

   }

   public boolean method8865() {
      return this.aBool11503;
   }

   void method8962(boolean var1) {
      if(var1) {
         OpenGL.glEnable('\u809d');
      } else {
         OpenGL.glDisable('\u809d');
      }

   }

   public void method2339() {
      if(this.aBool11508) {
         this.aClass153_11513 = null;
         if(this.aClass184_Sub2_11515 != null) {
            this.aClass184_Sub2_11515.method140();
            this.aClass184_Sub2_11515 = null;
         }

         OpenGL.glDeleteBuffersARB(3, this.anIntArray11502, 0);

         for(int var1 = 0; var1 < 3; ++var1) {
            this.anIntArray11502[var1] = 0;
            if(this.aLongArray11517[var1] != 0L) {
               OpenGL.glDeleteSync(this.aLongArray11517[var1]);
               this.aLongArray11517[var1] = 0L;
            }
         }
      } else {
         this.aClass184_Sub2_11515 = null;
         this.aClass153_11514 = null;
         this.aClass153_11513 = null;
      }

      this.anInt11520 = 0;
      this.anInt11519 = 0;
   }

   final Interface42 method8964(boolean var1) {
      return new Class486_Sub2(this, Class166.aClass166_1888, var1);
   }

   final Interface42 method8965(boolean var1) {
      return new Class486_Sub2(this, Class166.aClass166_1888, var1);
   }

   public String method2322() {
      String var1 = "Caps: 4:";
      String var2 = ":";
      var1 = var1 + this.anInt9819 + var2;
      var1 = var1 + this.anInt11489 + var2;
      var1 = var1 + this.anInt9683 + var2;
      var1 = var1 + this.anInt9719 + var2;
      var1 = var1 + (this.aBool11518?1:0) + var2;
      var1 = var1 + (this.aBool9830?1:0) + var2;
      var1 = var1 + (this.aBool11504?1:0) + var2;
      var1 = var1 + (this.aBool11506?1:0) + var2;
      var1 = var1 + (this.aBool11503?1:0) + var2;
      var1 = var1 + (this.aBool11505?1:0) + var2;
      var1 = var1 + (this.aBool9832?1:0) + var2;
      var1 = var1 + (this.aBool11501?1:0) + var2;
      var1 = var1 + (this.aBool9831?1:0) + var2;
      var1 = var1 + (this.aBool11481?1:0) + var2;
      var1 = var1 + (this.aBool9827?1:0) + var2;
      var1 = var1 + (this.aBool9794?1:0) + var2;
      var1 = var1 + (this.aBool9829?1:0) + var2;
      var1 = var1 + (this.aBool9834?1:0) + var2;
      var1 = var1 + OpenGL.glGetString('\u8b8c').toLowerCase();
      return var1;
   }

   final Interface35 method8967(boolean var1) {
      return new Class486_Sub1(this, var1);
   }

   final Interface35 method8849(boolean var1) {
      return new Class486_Sub1(this, var1);
   }

   void method8961() {
      if(this.aBool9806 && this.aBool9805 && this.anInt9675 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   public void method8969(Class335 var1) {
      Class359[] var2 = var1.aClass359Array3523;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < var2.length; ++var7) {
         Class359 var8 = var2[var7];
         Class486_Sub1 var9 = this.aClass486_Sub1Array11491[var7];
         int var10 = 0;
         int var11 = var9.method9145();
         long var12 = var9.method5843();
         var9.method5845();

         for(int var14 = 0; var14 < var8.method4587(); ++var14) {
            Class353 var15 = var8.method4588(var14);
            switch(var15.anInt3681) {
            case 3:
               OpenGL.glVertexPointer(3, 5126, var11, var12 + (long)var10);
               var6 = true;
               break;
            case 4:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long)var10);
               break;
            case 5:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long)var10);
               break;
            case 6:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long)var10);
            case 7:
            case 8:
            default:
               break;
            case 9:
               OpenGL.glColorPointer(4, 5121, var11, var12 + (long)var10);
               var4 = true;
               break;
            case 10:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long)var10);
               break;
            case 11:
               OpenGL.glNormalPointer(5126, var11, var12 + (long)var10);
               var5 = true;
            }

            var10 += var15.anInt3671;
         }
      }

      if(this.aBool11490 != var6) {
         if(var6) {
            OpenGL.glEnableClientState('\u8074');
         } else {
            OpenGL.glDisableClientState('\u8074');
         }

         this.aBool11490 = var6;
      }

      if(this.aBool11496 != var5) {
         if(var5) {
            OpenGL.glEnableClientState('\u8075');
         } else {
            OpenGL.glDisableClientState('\u8075');
         }

         this.aBool11496 = var5;
      }

      if(this.aBool11500 != var4) {
         if(var4) {
            OpenGL.glEnableClientState('\u8076');
         } else {
            OpenGL.glDisableClientState('\u8076');
         }

         this.aBool11500 = var4;
      }

      if(this.anInt11498 < var3) {
         for(var7 = this.anInt11498; var7 < var3; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glEnableClientState('\u8078');
         }

         this.anInt11498 = var3;
      } else if(this.anInt11498 > var3) {
         for(var7 = var3; var7 < this.anInt11498; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glDisableClientState('\u8078');
         }

         this.anInt11498 = var3;
      }

   }

   public void method8970(Class335 var1) {
      Class359[] var2 = var1.aClass359Array3523;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < var2.length; ++var7) {
         Class359 var8 = var2[var7];
         Class486_Sub1 var9 = this.aClass486_Sub1Array11491[var7];
         int var10 = 0;
         int var11 = var9.method9145();
         long var12 = var9.method5843();
         var9.method5845();

         for(int var14 = 0; var14 < var8.method4587(); ++var14) {
            Class353 var15 = var8.method4588(var14);
            switch(var15.anInt3681) {
            case 3:
               OpenGL.glVertexPointer(3, 5126, var11, var12 + (long)var10);
               var6 = true;
               break;
            case 4:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long)var10);
               break;
            case 5:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long)var10);
               break;
            case 6:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long)var10);
            case 7:
            case 8:
            default:
               break;
            case 9:
               OpenGL.glColorPointer(4, 5121, var11, var12 + (long)var10);
               var4 = true;
               break;
            case 10:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long)var10);
               break;
            case 11:
               OpenGL.glNormalPointer(5126, var11, var12 + (long)var10);
               var5 = true;
            }

            var10 += var15.anInt3671;
         }
      }

      if(this.aBool11490 != var6) {
         if(var6) {
            OpenGL.glEnableClientState('\u8074');
         } else {
            OpenGL.glDisableClientState('\u8074');
         }

         this.aBool11490 = var6;
      }

      if(this.aBool11496 != var5) {
         if(var5) {
            OpenGL.glEnableClientState('\u8075');
         } else {
            OpenGL.glDisableClientState('\u8075');
         }

         this.aBool11496 = var5;
      }

      if(this.aBool11500 != var4) {
         if(var4) {
            OpenGL.glEnableClientState('\u8076');
         } else {
            OpenGL.glDisableClientState('\u8076');
         }

         this.aBool11500 = var4;
      }

      if(this.anInt11498 < var3) {
         for(var7 = this.anInt11498; var7 < var3; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glEnableClientState('\u8078');
         }

         this.anInt11498 = var3;
      } else if(this.anInt11498 > var3) {
         for(var7 = var3; var7 < this.anInt11498; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glDisableClientState('\u8078');
         }

         this.anInt11498 = var3;
      }

   }

   public void method8971(Class335 var1) {
      Class359[] var2 = var1.aClass359Array3523;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < var2.length; ++var7) {
         Class359 var8 = var2[var7];
         Class486_Sub1 var9 = this.aClass486_Sub1Array11491[var7];
         int var10 = 0;
         int var11 = var9.method9145();
         long var12 = var9.method5843();
         var9.method5845();

         for(int var14 = 0; var14 < var8.method4587(); ++var14) {
            Class353 var15 = var8.method4588(var14);
            switch(var15.anInt3681) {
            case 3:
               OpenGL.glVertexPointer(3, 5126, var11, var12 + (long)var10);
               var6 = true;
               break;
            case 4:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long)var10);
               break;
            case 5:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long)var10);
               break;
            case 6:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long)var10);
            case 7:
            case 8:
            default:
               break;
            case 9:
               OpenGL.glColorPointer(4, 5121, var11, var12 + (long)var10);
               var4 = true;
               break;
            case 10:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long)var10);
               break;
            case 11:
               OpenGL.glNormalPointer(5126, var11, var12 + (long)var10);
               var5 = true;
            }

            var10 += var15.anInt3671;
         }
      }

      if(this.aBool11490 != var6) {
         if(var6) {
            OpenGL.glEnableClientState('\u8074');
         } else {
            OpenGL.glDisableClientState('\u8074');
         }

         this.aBool11490 = var6;
      }

      if(this.aBool11496 != var5) {
         if(var5) {
            OpenGL.glEnableClientState('\u8075');
         } else {
            OpenGL.glDisableClientState('\u8075');
         }

         this.aBool11496 = var5;
      }

      if(this.aBool11500 != var4) {
         if(var4) {
            OpenGL.glEnableClientState('\u8076');
         } else {
            OpenGL.glDisableClientState('\u8076');
         }

         this.aBool11500 = var4;
      }

      if(this.anInt11498 < var3) {
         for(var7 = this.anInt11498; var7 < var3; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glEnableClientState('\u8078');
         }

         this.anInt11498 = var3;
      } else if(this.anInt11498 > var3) {
         for(var7 = var3; var7 < this.anInt11498; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glDisableClientState('\u8078');
         }

         this.anInt11498 = var3;
      }

   }

   public Class157 method2360() {
      int var1 = -1;
      if(this.aString11478.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if(this.aString11478.indexOf("intel") != -1) {
         var1 = '\u8086';
      } else if(this.aString11478.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new Class157(var1, this.method8721()?"OpenGL FF":"OpenGL", this.anInt11499, this.aString11497, 0L, this.method8721());
   }

   public boolean method2403() {
      return this.aBool11508;
   }

   final void method8976(Interface42 var1, Class374 var2, int var3, int var4, int var5, int var6) {
      byte var7;
      int var8;
      if(var2 == Class374.aClass374_3901) {
         var7 = 1;
         var8 = var6 * 2;
      } else if(var2 == Class374.aClass374_3896) {
         var7 = 3;
         var8 = var6 + 1;
      } else if(var2 == Class374.aClass374_3898) {
         var7 = 4;
         var8 = var6 * 3;
      } else if(var2 == Class374.aClass374_3899) {
         var7 = 6;
         var8 = var6 + 2;
      } else if(var2 == Class374.aClass374_3900) {
         var7 = 5;
         var8 = var6 + 2;
      } else {
         var7 = 0;
         var8 = var6;
      }

      Class166 var9 = var1.method341();
      Class486_Sub2 var10 = (Class486_Sub2)var1;
      var10.method5845();
      OpenGL.glDrawElements(var7, var8, method10532(var9), var10.method5843() + (long)(var5 * var9.anInt1891 * 1990758583));
   }

   final void method8977(Interface42 var1, Class374 var2, int var3, int var4, int var5, int var6) {
      byte var7;
      int var8;
      if(var2 == Class374.aClass374_3901) {
         var7 = 1;
         var8 = var6 * 2;
      } else if(var2 == Class374.aClass374_3896) {
         var7 = 3;
         var8 = var6 + 1;
      } else if(var2 == Class374.aClass374_3898) {
         var7 = 4;
         var8 = var6 * 3;
      } else if(var2 == Class374.aClass374_3899) {
         var7 = 6;
         var8 = var6 + 2;
      } else if(var2 == Class374.aClass374_3900) {
         var7 = 5;
         var8 = var6 + 2;
      } else {
         var7 = 0;
         var8 = var6;
      }

      Class166 var9 = var1.method341();
      Class486_Sub2 var10 = (Class486_Sub2)var1;
      var10.method5845();
      OpenGL.glDrawElements(var7, var8, method10532(var9), var10.method5843() + (long)(var5 * var9.anInt1891 * 1990758583));
   }

   public final void method8783(Class374 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if(var1 == Class374.aClass374_3901) {
         var6 = 1;
         var7 = var5 * 2;
      } else if(var1 == Class374.aClass374_3896) {
         var6 = 3;
         var7 = var5 + 1;
      } else if(var1 == Class374.aClass374_3898) {
         var6 = 4;
         var7 = var5 * 3;
      } else if(var1 == Class374.aClass374_3899) {
         var6 = 6;
         var7 = var5 + 2;
      } else if(var1 == Class374.aClass374_3900) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      Class166 var8 = this.aClass486_Sub2_11493.method341();
      OpenGL.glDrawElements(var6, var7, method10532(var8), this.aClass486_Sub2_11493.method5843() + (long)(var4 * var8.anInt1891 * 1990758583));
   }

   public final void method8925(Class374 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if(var1 == Class374.aClass374_3901) {
         var6 = 1;
         var7 = var5 * 2;
      } else if(var1 == Class374.aClass374_3896) {
         var6 = 3;
         var7 = var5 + 1;
      } else if(var1 == Class374.aClass374_3898) {
         var6 = 4;
         var7 = var5 * 3;
      } else if(var1 == Class374.aClass374_3899) {
         var6 = 6;
         var7 = var5 + 2;
      } else if(var1 == Class374.aClass374_3900) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      Class166 var8 = this.aClass486_Sub2_11493.method341();
      OpenGL.glDrawElements(var6, var7, method10532(var8), this.aClass486_Sub2_11493.method5843() + (long)(var4 * var8.anInt1891 * 1990758583));
   }

   public final void method8979(Class374 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if(var1 == Class374.aClass374_3901) {
         var6 = 1;
         var7 = var5 * 2;
      } else if(var1 == Class374.aClass374_3896) {
         var6 = 3;
         var7 = var5 + 1;
      } else if(var1 == Class374.aClass374_3898) {
         var6 = 4;
         var7 = var5 * 3;
      } else if(var1 == Class374.aClass374_3899) {
         var6 = 6;
         var7 = var5 + 2;
      } else if(var1 == Class374.aClass374_3900) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      Class166 var8 = this.aClass486_Sub2_11493.method341();
      OpenGL.glDrawElements(var6, var7, method10532(var8), this.aClass486_Sub2_11493.method5843() + (long)(var4 * var8.anInt1891 * 1990758583));
   }

   void method8772() {
      if(this.aBool9686) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   void method8779() {
   }

   public Interface21 method2569(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return new Class485(this, var3, var4, var1, var2, var5);
   }

   boolean method8744(Class144 var1, Class166 var2) {
      return true;
   }

   Interface38 method8985(Class144 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class494_Sub2(this, var1, var2, var3, var4, var5, var6, var7);
   }

   final synchronized void method10537(int var1, int var2) {
      Class526_Sub25 var3 = new Class526_Sub25(var2);
      var3.aLong7156 = (long)var1 * -7608595443915499217L;
      this.aClass702_11488.method8176(var3, -1713434521);
   }

   void method8987(Interface42 var1) {
      this.aClass486_Sub2_11493 = (Class486_Sub2)var1;
      this.aClass486_Sub2_11493.method5845();
   }

   void method8988(int var1) {
      if(!this.aBool11509) {
         OpenGL.glPolygonMode(1028, (var1 & 2) != 0?6913:6914);
      }

   }

   void method8989(int var1) {
      if(!this.aBool11509) {
         OpenGL.glPolygonMode(1028, (var1 & 2) != 0?6913:6914);
      }

   }

   void method8948(int var1) {
      if(!this.aBool11509) {
         OpenGL.glPolygonMode(1028, (var1 & 2) != 0?6913:6914);
      }

   }

   void method8717(int var1) {
      if(!this.aBool11509) {
         OpenGL.glPolygonMode(1028, (var1 & 2) != 0?6913:6914);
      }

   }

   void method8773(int var1) {
      if(!this.aBool11509) {
         OpenGL.glPolygonMode(1028, (var1 & 2) != 0?6913:6914);
      }

   }

   byte[] method10538(String var1) {
      return this.method8861("gl", var1);
   }

   void method8889() {
      if(this.aClass184_2049 != null) {
         int var1 = this.anInt9698 + this.anInt9682;
         int var2 = this.anInt9745 + this.aClass184_2049.method2693() - this.anInt9789;
         int var3 = this.anInt9735 - this.anInt9682;
         int var4 = this.anInt9789 - this.anInt9732;
         if(var3 < 0) {
            var3 = 0;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   public Interface23 method2620(int var1, int var2) {
      return new Class485(this, Class144.aClass144_1684, Class166.aClass166_1889, var1, var2);
   }

   public Interface21 method2258(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return new Class485(this, var3, var4, var1, var2, var5);
   }

   public void method2271(int var1, int var2, int[] var3, int[] var4) {
      this.method10523(var1, var2, var3, var4);
   }

   public void method2395(long var1) {
      if(var1 != 0L) {
         if(!OpenGL.glUnmapBufferARB('\u88eb')) {
            ;
         }

         OpenGL.glBindBufferARB('\u88eb', 0);
      }
   }

   void method8774() {
      this.aFloat9677 = this.aFloat9731 - (float)this.anInt9809;
      this.aFloat9810 = this.aFloat9677 - (float)this.anInt9675;
      if(this.aFloat9810 < this.aFloat9730) {
         this.aFloat9810 = this.aFloat9730;
      }

      if(this.aBool9761) {
         OpenGL.glFogf(2915, this.aFloat9810);
         OpenGL.glFogf(2916, this.aFloat9677);
         this.aFloatArray11510[0] = (float)(this.anInt9722 & 16711680) / 1.671168E7F;
         this.aFloatArray11510[1] = (float)(this.anInt9722 & '\uff00') / 65280.0F;
         this.aFloatArray11510[2] = (float)(this.anInt9722 & 255) / 255.0F;
         OpenGL.glFogfv(2918, this.aFloatArray11510, 0);
      }

   }

   public void method2349() {
      OpenGL.glFinish();
   }

   final void method8926(int var1, Class370 var2, boolean var3) {
      OpenGL.glTexEnvi(8960, '\u8588' + var1, method10528(var2));
      OpenGL.glTexEnvi(8960, '\u8598' + var1, var3?771:770);
   }

   Interface37 method8934(Class144 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new Class494_Sub3(this, var1, var2, var3, var4, var5, var6);
   }

   void method8802() {
      OpenGL.glMatrixMode(5890);
      if(this.aClass363Array9774[this.anInt9787] != Class363.aClass363_3844) {
         OpenGL.glLoadMatrixf(this.aClass433Array9773[this.anInt9787].method5107(this.aFloatArray11511), 0);
      } else {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glMatrixMode(5888);
   }
}
