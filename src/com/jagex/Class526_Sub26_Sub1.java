package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub1;
import com.jagex.Class133;
import com.jagex.Class140;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class184_Sub2_Sub2;
import com.jagex.Class526_Sub26;
import com.jagex.Class568;
import jaggl.OpenGL;

public class Class526_Sub26_Sub1 extends Class526_Sub26 {
   static final String aString11524 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
   static final String aString11528 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
   static final String aString11529 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
   static final String aString11530 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
   static final int anInt11539 = 256;
   int anInt11542;
   int anInt11544;
   Class184_Sub2_Sub2 aClass184_Sub2_Sub2_11533;
   Class124_Sub1[] aClass124_Sub1Array11536;
   Class184_Sub2_Sub2 aClass184_Sub2_Sub2_11532;
   Class124_Sub1 aClass124_Sub1_11525;
   Class124_Sub1 aClass124_Sub1_11535;
   Class133 aClass133_11531;
   Class133 aClass133_11543;
   Class133 aClass133_11527;
   Class133 aClass133_11541;
   int anInt11540;
   int anInt11538;
   static float aFloat11537 = 0.25F;
   static float aFloat11526 = 1.0F;
   static float aFloat11534 = 1.0F;

   void method9500() {
      this.anInt11542 = -1;
      this.anInt11544 = -1;
      this.aClass184_Sub2_Sub2_11533 = null;
      this.aClass124_Sub1Array11536 = null;
      this.aClass184_Sub2_Sub2_11532 = null;
      this.aClass124_Sub1_11525 = null;
      this.aClass124_Sub1_11535 = null;
      this.aClass133_11531 = null;
      this.aClass133_11543 = null;
      this.aClass133_11527 = null;
      this.aClass133_11541 = null;
   }

   boolean method10539() {
      return this.aClass174_Sub2_10552.aBool9638 && this.aClass174_Sub2_10552.aBool9641 && this.aClass174_Sub2_10552.aBool9636;
   }

   Class526_Sub26_Sub1(Class174_Sub2 var1) {
      super(var1);
   }

   boolean method9484() {
      return this.aClass184_Sub2_Sub2_11532 != null;
   }

   void method9487(int var1, int var2) {
      this.anInt11540 = var1;
      this.anInt11538 = var2;
      int var3 = Class568.method6836(this.anInt11540, 318628098);
      int var4 = Class568.method6836(this.anInt11538, 966349907);
      if(this.anInt11544 != var3 || this.anInt11542 != var4) {
         int var5;
         if(this.aClass124_Sub1Array11536 != null) {
            for(var5 = 0; var5 < this.aClass124_Sub1Array11536.length; ++var5) {
               this.aClass124_Sub1Array11536[var5].method1493();
            }

            this.aClass124_Sub1Array11536 = null;
         }

         if(var3 <= 256 && var4 <= 256) {
            this.aClass184_Sub2_Sub2_11533 = null;
         } else {
            var5 = var3;
            int var6 = var4;
            int var7 = 0;

            label59:
            while(true) {
               if(var5 <= 256 && var6 <= 256) {
                  if(this.aClass184_Sub2_Sub2_11533 == null) {
                     this.aClass184_Sub2_Sub2_11533 = new Class184_Sub2_Sub2(this.aClass174_Sub2_10552);
                  }

                  this.aClass124_Sub1Array11536 = new Class124_Sub1[var7];
                  var5 = var3;
                  var6 = var4;
                  var7 = 0;

                  while(true) {
                     if(var5 <= 256 && var6 <= 256) {
                        break label59;
                     }

                     this.aClass124_Sub1Array11536[var7++] = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), var5, var6);
                     if(var5 > 256) {
                        var5 >>= 1;
                     }

                     if(var6 > 256) {
                        var6 >>= 1;
                     }
                  }
               }

               if(var5 > 256) {
                  var5 >>= 1;
               }

               if(var6 > 256) {
                  var6 >>= 1;
               }

               ++var7;
            }
         }

         this.anInt11544 = var3;
         this.anInt11542 = var4;
      }

   }

   void method9486() {
      this.anInt11542 = -1;
      this.anInt11544 = -1;
      this.aClass184_Sub2_Sub2_11533 = null;
      this.aClass124_Sub1Array11536 = null;
      this.aClass184_Sub2_Sub2_11532 = null;
      this.aClass124_Sub1_11525 = null;
      this.aClass124_Sub1_11535 = null;
      this.aClass133_11531 = null;
      this.aClass133_11543 = null;
      this.aClass133_11527 = null;
      this.aClass133_11541 = null;
   }

   void method9513(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      int var6;
      int var7;
      if(this.aClass124_Sub1Array11536 != null) {
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11533, (short)128);
         var6 = Class568.method6836(this.anInt11540, 1334191861);
         var7 = Class568.method6836(this.anInt11538, 1831575840);

         int var8;
         for(var8 = 0; var6 > 256 || var7 > 256; ++var8) {
            OpenGL.glViewport(0, 0, var6, var7);
            this.aClass184_Sub2_Sub2_11533.method8465(0, this.aClass124_Sub1Array11536[var8].method8334(0));
            if(var8 == 0) {
               this.aClass174_Sub2_10552.method8641(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, (float)(this.anInt11538 - var4));
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)(0 + var5), (float)(this.anInt11538 - var4));
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)(0 + var5), (float)this.anInt11538);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.anInt11538);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1Array11536[var8 - 1]);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            }

            if(var6 > 256) {
               var6 >>= 1;
            }

            if(var7 > 256) {
               var7 >>= 1;
            }
         }

         this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11533, (byte)0);
         this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1Array11536[var8 - 1]);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var9 = this.aClass133_11543.anInt1635;
         OpenGL.glUseProgram(var9);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var9, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var9, "params"), aFloat11534, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         this.aClass174_Sub2_10552.method8641(var2);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         OpenGL.glViewport(0, 0, 256, 256);
         var6 = this.aClass133_11531.anInt1635;
         OpenGL.glUseProgram(var6);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "params"), aFloat11534, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)this.anInt11540, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)this.anInt11540, (float)this.anInt11538);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)this.anInt11538);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      this.aClass184_Sub2_Sub2_11532.method10454(1);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11525);
      var6 = this.aClass133_11541.anInt1635;
      OpenGL.glUseProgram(var6);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      this.aClass184_Sub2_Sub2_11532.method10454(0);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11535);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
      var7 = this.aClass133_11527.anInt1635;
      OpenGL.glUseProgram(var7);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), aFloat11537, aFloat11526, 0.0F);
      this.aClass174_Sub2_10552.method8677(1);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11525);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641(var2);
   }

   void method9489(int var1) {
      OpenGL.glUseProgram(0);
      this.aClass174_Sub2_10552.method8677(1);
      this.aClass174_Sub2_10552.method8641((Class124)null);
      this.aClass174_Sub2_10552.method8677(0);
   }

   boolean method9490() {
      if(this.aClass174_Sub2_10552.aBool9638 && this.aClass174_Sub2_10552.aBool9641 && this.aClass174_Sub2_10552.aBool9636) {
         this.aClass184_Sub2_Sub2_11532 = new Class184_Sub2_Sub2(this.aClass174_Sub2_10552);
         this.aClass124_Sub1_11525 = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), 256, 256);
         this.aClass124_Sub1_11525.method8335(false, false);
         this.aClass124_Sub1_11535 = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), 256, 256);
         this.aClass124_Sub1_11535.method8335(false, false);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method8465(0, this.aClass124_Sub1_11525.method8334(0));
         this.aClass184_Sub2_Sub2_11532.method8465(1, this.aClass124_Sub1_11535.method8334(0));
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         if(!this.aClass184_Sub2_Sub2_11532.method8466()) {
            this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
            return false;
         } else {
            this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
            this.aClass133_11531 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.aClass133_11543 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.aClass133_11527 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n")});
            this.aClass133_11541 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
            return this.aClass133_11543 != null && this.aClass133_11531 != null && this.aClass133_11527 != null && this.aClass133_11541 != null;
         }
      } else {
         return false;
      }
   }

   int method9491() {
      return 0;
   }

   boolean method9495() {
      return false;
   }

   Class166 method9498() {
      return Class166.aClass166_1893;
   }

   void method9506(int var1) {
      OpenGL.glUseProgram(0);
      this.aClass174_Sub2_10552.method8677(1);
      this.aClass174_Sub2_10552.method8641((Class124)null);
      this.aClass174_Sub2_10552.method8677(0);
   }

   boolean method9497() {
      if(this.aClass174_Sub2_10552.aBool9638 && this.aClass174_Sub2_10552.aBool9641 && this.aClass174_Sub2_10552.aBool9636) {
         this.aClass184_Sub2_Sub2_11532 = new Class184_Sub2_Sub2(this.aClass174_Sub2_10552);
         this.aClass124_Sub1_11525 = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), 256, 256);
         this.aClass124_Sub1_11525.method8335(false, false);
         this.aClass124_Sub1_11535 = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), 256, 256);
         this.aClass124_Sub1_11535.method8335(false, false);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method8465(0, this.aClass124_Sub1_11525.method8334(0));
         this.aClass184_Sub2_Sub2_11532.method8465(1, this.aClass124_Sub1_11535.method8334(0));
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         if(!this.aClass184_Sub2_Sub2_11532.method8466()) {
            this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
            return false;
         } else {
            this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
            this.aClass133_11531 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.aClass133_11543 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.aClass133_11527 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n")});
            this.aClass133_11541 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
            return this.aClass133_11543 != null && this.aClass133_11531 != null && this.aClass133_11527 != null && this.aClass133_11541 != null;
         }
      } else {
         return false;
      }
   }

   void method9509() {
      this.anInt11542 = -1;
      this.anInt11544 = -1;
      this.aClass184_Sub2_Sub2_11533 = null;
      this.aClass124_Sub1Array11536 = null;
      this.aClass184_Sub2_Sub2_11532 = null;
      this.aClass124_Sub1_11525 = null;
      this.aClass124_Sub1_11535 = null;
      this.aClass133_11531 = null;
      this.aClass133_11543 = null;
      this.aClass133_11527 = null;
      this.aClass133_11541 = null;
   }

   void method9488() {
      this.anInt11542 = -1;
      this.anInt11544 = -1;
      this.aClass184_Sub2_Sub2_11533 = null;
      this.aClass124_Sub1Array11536 = null;
      this.aClass184_Sub2_Sub2_11532 = null;
      this.aClass124_Sub1_11525 = null;
      this.aClass124_Sub1_11535 = null;
      this.aClass133_11531 = null;
      this.aClass133_11543 = null;
      this.aClass133_11527 = null;
      this.aClass133_11541 = null;
   }

   void method9501() {
      this.anInt11542 = -1;
      this.anInt11544 = -1;
      this.aClass184_Sub2_Sub2_11533 = null;
      this.aClass124_Sub1Array11536 = null;
      this.aClass184_Sub2_Sub2_11532 = null;
      this.aClass124_Sub1_11525 = null;
      this.aClass124_Sub1_11535 = null;
      this.aClass133_11531 = null;
      this.aClass133_11543 = null;
      this.aClass133_11527 = null;
      this.aClass133_11541 = null;
   }

   boolean method9496() {
      if(this.aClass174_Sub2_10552.aBool9638 && this.aClass174_Sub2_10552.aBool9641 && this.aClass174_Sub2_10552.aBool9636) {
         this.aClass184_Sub2_Sub2_11532 = new Class184_Sub2_Sub2(this.aClass174_Sub2_10552);
         this.aClass124_Sub1_11525 = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), 256, 256);
         this.aClass124_Sub1_11525.method8335(false, false);
         this.aClass124_Sub1_11535 = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), 256, 256);
         this.aClass124_Sub1_11535.method8335(false, false);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method8465(0, this.aClass124_Sub1_11525.method8334(0));
         this.aClass184_Sub2_Sub2_11532.method8465(1, this.aClass124_Sub1_11535.method8334(0));
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         if(!this.aClass184_Sub2_Sub2_11532.method8466()) {
            this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
            return false;
         } else {
            this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
            this.aClass133_11531 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.aClass133_11543 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.aClass133_11527 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n")});
            this.aClass133_11541 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
            return this.aClass133_11543 != null && this.aClass133_11531 != null && this.aClass133_11527 != null && this.aClass133_11541 != null;
         }
      } else {
         return false;
      }
   }

   void method9502(int var1, int var2) {
      this.anInt11540 = var1;
      this.anInt11538 = var2;
      int var3 = Class568.method6836(this.anInt11540, 1399351925);
      int var4 = Class568.method6836(this.anInt11538, 1212778446);
      if(this.anInt11544 != var3 || this.anInt11542 != var4) {
         int var5;
         if(this.aClass124_Sub1Array11536 != null) {
            for(var5 = 0; var5 < this.aClass124_Sub1Array11536.length; ++var5) {
               this.aClass124_Sub1Array11536[var5].method1493();
            }

            this.aClass124_Sub1Array11536 = null;
         }

         if(var3 <= 256 && var4 <= 256) {
            this.aClass184_Sub2_Sub2_11533 = null;
         } else {
            var5 = var3;
            int var6 = var4;
            int var7 = 0;

            label59:
            while(true) {
               if(var5 <= 256 && var6 <= 256) {
                  if(this.aClass184_Sub2_Sub2_11533 == null) {
                     this.aClass184_Sub2_Sub2_11533 = new Class184_Sub2_Sub2(this.aClass174_Sub2_10552);
                  }

                  this.aClass124_Sub1Array11536 = new Class124_Sub1[var7];
                  var5 = var3;
                  var6 = var4;
                  var7 = 0;

                  while(true) {
                     if(var5 <= 256 && var6 <= 256) {
                        break label59;
                     }

                     this.aClass124_Sub1Array11536[var7++] = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), var5, var6);
                     if(var5 > 256) {
                        var5 >>= 1;
                     }

                     if(var6 > 256) {
                        var6 >>= 1;
                     }
                  }
               }

               if(var5 > 256) {
                  var5 >>= 1;
               }

               if(var6 > 256) {
                  var6 >>= 1;
               }

               ++var7;
            }
         }

         this.anInt11544 = var3;
         this.anInt11542 = var4;
      }

   }

   void method9507(int var1, int var2) {
      this.anInt11540 = var1;
      this.anInt11538 = var2;
      int var3 = Class568.method6836(this.anInt11540, 710022511);
      int var4 = Class568.method6836(this.anInt11538, 1693816365);
      if(this.anInt11544 != var3 || this.anInt11542 != var4) {
         int var5;
         if(this.aClass124_Sub1Array11536 != null) {
            for(var5 = 0; var5 < this.aClass124_Sub1Array11536.length; ++var5) {
               this.aClass124_Sub1Array11536[var5].method1493();
            }

            this.aClass124_Sub1Array11536 = null;
         }

         if(var3 <= 256 && var4 <= 256) {
            this.aClass184_Sub2_Sub2_11533 = null;
         } else {
            var5 = var3;
            int var6 = var4;
            int var7 = 0;

            label59:
            while(true) {
               if(var5 <= 256 && var6 <= 256) {
                  if(this.aClass184_Sub2_Sub2_11533 == null) {
                     this.aClass184_Sub2_Sub2_11533 = new Class184_Sub2_Sub2(this.aClass174_Sub2_10552);
                  }

                  this.aClass124_Sub1Array11536 = new Class124_Sub1[var7];
                  var5 = var3;
                  var6 = var4;
                  var7 = 0;

                  while(true) {
                     if(var5 <= 256 && var6 <= 256) {
                        break label59;
                     }

                     this.aClass124_Sub1Array11536[var7++] = new Class124_Sub1(this.aClass174_Sub2_10552, 3553, Class144.aClass144_1680, this.method9498(), var5, var6);
                     if(var5 > 256) {
                        var5 >>= 1;
                     }

                     if(var6 > 256) {
                        var6 >>= 1;
                     }
                  }
               }

               if(var5 > 256) {
                  var5 >>= 1;
               }

               if(var6 > 256) {
                  var6 >>= 1;
               }

               ++var7;
            }
         }

         this.anInt11544 = var3;
         this.anInt11542 = var4;
      }

   }

   void method9504(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      int var6;
      int var7;
      if(this.aClass124_Sub1Array11536 != null) {
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11533, (short)128);
         var6 = Class568.method6836(this.anInt11540, 1357367626);
         var7 = Class568.method6836(this.anInt11538, 1150342009);

         int var8;
         for(var8 = 0; var6 > 256 || var7 > 256; ++var8) {
            OpenGL.glViewport(0, 0, var6, var7);
            this.aClass184_Sub2_Sub2_11533.method8465(0, this.aClass124_Sub1Array11536[var8].method8334(0));
            if(var8 == 0) {
               this.aClass174_Sub2_10552.method8641(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, (float)(this.anInt11538 - var4));
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)(0 + var5), (float)(this.anInt11538 - var4));
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)(0 + var5), (float)this.anInt11538);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.anInt11538);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1Array11536[var8 - 1]);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            }

            if(var6 > 256) {
               var6 >>= 1;
            }

            if(var7 > 256) {
               var7 >>= 1;
            }
         }

         this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11533, (byte)0);
         this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1Array11536[var8 - 1]);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var9 = this.aClass133_11543.anInt1635;
         OpenGL.glUseProgram(var9);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var9, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var9, "params"), aFloat11534, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         this.aClass174_Sub2_10552.method8641(var2);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         OpenGL.glViewport(0, 0, 256, 256);
         var6 = this.aClass133_11531.anInt1635;
         OpenGL.glUseProgram(var6);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "params"), aFloat11534, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)this.anInt11540, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)this.anInt11540, (float)this.anInt11538);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)this.anInt11538);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      this.aClass184_Sub2_Sub2_11532.method10454(1);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11525);
      var6 = this.aClass133_11541.anInt1635;
      OpenGL.glUseProgram(var6);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      this.aClass184_Sub2_Sub2_11532.method10454(0);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11535);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
      var7 = this.aClass133_11527.anInt1635;
      OpenGL.glUseProgram(var7);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), aFloat11537, aFloat11526, 0.0F);
      this.aClass174_Sub2_10552.method8677(1);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11525);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641(var2);
   }

   void method9505(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      int var6;
      int var7;
      if(this.aClass124_Sub1Array11536 != null) {
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11533, (short)128);
         var6 = Class568.method6836(this.anInt11540, 1416439041);
         var7 = Class568.method6836(this.anInt11538, 1821099098);

         int var8;
         for(var8 = 0; var6 > 256 || var7 > 256; ++var8) {
            OpenGL.glViewport(0, 0, var6, var7);
            this.aClass184_Sub2_Sub2_11533.method8465(0, this.aClass124_Sub1Array11536[var8].method8334(0));
            if(var8 == 0) {
               this.aClass174_Sub2_10552.method8641(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, (float)(this.anInt11538 - var4));
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)(0 + var5), (float)(this.anInt11538 - var4));
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)(0 + var5), (float)this.anInt11538);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.anInt11538);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1Array11536[var8 - 1]);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            }

            if(var6 > 256) {
               var6 >>= 1;
            }

            if(var7 > 256) {
               var7 >>= 1;
            }
         }

         this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11533, (byte)0);
         this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1Array11536[var8 - 1]);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var9 = this.aClass133_11543.anInt1635;
         OpenGL.glUseProgram(var9);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var9, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var9, "params"), aFloat11534, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         this.aClass174_Sub2_10552.method8641(var2);
         this.aClass174_Sub2_10552.method2623(this.aClass184_Sub2_Sub2_11532, (short)128);
         this.aClass184_Sub2_Sub2_11532.method10454(0);
         OpenGL.glViewport(0, 0, 256, 256);
         var6 = this.aClass133_11531.anInt1635;
         OpenGL.glUseProgram(var6);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "params"), aFloat11534, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)this.anInt11540, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)this.anInt11540, (float)this.anInt11538);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)this.anInt11538);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      this.aClass184_Sub2_Sub2_11532.method10454(1);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11525);
      var6 = this.aClass133_11541.anInt1635;
      OpenGL.glUseProgram(var6);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      this.aClass184_Sub2_Sub2_11532.method10454(0);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11535);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var6, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      this.aClass174_Sub2_10552.method2456(this.aClass184_Sub2_Sub2_11532, (byte)0);
      var7 = this.aClass133_11527.anInt1635;
      OpenGL.glUseProgram(var7);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), aFloat11537, aFloat11526, 0.0F);
      this.aClass174_Sub2_10552.method8677(1);
      this.aClass174_Sub2_10552.method8641(this.aClass124_Sub1_11525);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641(var2);
   }

   void method9503(int var1) {
      OpenGL.glUseProgram(0);
      this.aClass174_Sub2_10552.method8677(1);
      this.aClass174_Sub2_10552.method8641((Class124)null);
      this.aClass174_Sub2_10552.method8677(0);
   }

   int method9499() {
      return 0;
   }

   Class166 method9514() {
      return Class166.aClass166_1893;
   }

   boolean method9510() {
      return false;
   }

   boolean method9515() {
      return this.aClass184_Sub2_Sub2_11532 != null;
   }

   boolean method10540() {
      return this.aClass174_Sub2_10552.aBool9638 && this.aClass174_Sub2_10552.aBool9641 && this.aClass174_Sub2_10552.aBool9636;
   }

   boolean method10541() {
      return this.aClass174_Sub2_10552.aBool9638 && this.aClass174_Sub2_10552.aBool9641 && this.aClass174_Sub2_10552.aBool9636;
   }
}
