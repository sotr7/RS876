package com.jagex;

import com.jagex.Class124_Sub4;
import com.jagex.Class133;
import com.jagex.Class140;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class184_Sub2_Sub2;
import com.jagex.Class526_Sub21_Sub1;
import com.jagex.Interface21;
import jaggl.OpenGL;

public class Class150 {
   static final String aString1717 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
   Class174_Sub2 aClass174_Sub2_1716;
   Class133 aClass133_1718;

   Class150(Class174_Sub2 var1) {
      this.aClass174_Sub2_1716 = var1;
   }

   boolean method1752(Class124_Sub4 var1, Class124_Sub4 var2, float var3) {
      if(!this.method1754()) {
         return false;
      } else {
         Class184_Sub2_Sub2 var4 = this.aClass174_Sub2_1716.aClass184_Sub2_Sub2_9649;
         Class526_Sub21_Sub1 var5 = new Class526_Sub21_Sub1(this.aClass174_Sub2_1716, Class144.aClass144_1680, Class166.aClass166_1884, var1.anInt8994, var1.anInt8993);
         boolean var6 = false;
         this.aClass174_Sub2_1716.method2623(var4, (short)128);
         var4.method8465(0, var5);
         if(var4.method8466()) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, var1.anInt8994, var1.anInt8993);
            OpenGL.glUseProgram(this.aClass133_1718.anInt1635);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass133_1718.anInt1635, "heightMap"), 0);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass133_1718.anInt1635, "rcpRelief"), 1.0F / var3);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass133_1718.anInt1635, "sampleSize"), 1.0F / (float)var2.anInt8994, 1.0F / (float)var2.anInt8993);

            for(int var7 = 0; var7 < var1.anInt8995; ++var7) {
               float var8 = (float)var7 / (float)var1.anInt8995;
               this.aClass174_Sub2_1716.method8641(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord3f(0.0F, 0.0F, var8);
               OpenGL.glVertex2f(0.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 0.0F, var8);
               OpenGL.glVertex2f(1.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 1.0F, var8);
               OpenGL.glVertex2f(1.0F, 1.0F);
               OpenGL.glTexCoord3f(0.0F, 1.0F, var8);
               OpenGL.glVertex2f(0.0F, 1.0F);
               OpenGL.glEnd();
               var1.method8393(0, 0, var7, var1.anInt8994, var1.anInt8993, 0, 0);
            }

            OpenGL.glUseProgram(0);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var6 = true;
         }

         var4.method8465(0, (Interface21)null);
         this.aClass174_Sub2_1716.method2456(var4, (byte)0);
         return var6;
      }
   }

   boolean method1753() {
      if(this.aClass174_Sub2_1716.aBool9638 && this.aClass174_Sub2_1716.aBool9641 && this.aClass133_1718 == null) {
         Class140 var1 = Class140.method1651(this.aClass174_Sub2_1716, '\u8b30', "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
         if(var1 != null) {
            this.aClass133_1718 = Class133.method1629(this.aClass174_Sub2_1716, new Class140[]{var1});
         }
      }

      return this.aClass133_1718 != null;
   }

   boolean method1754() {
      if(this.aClass174_Sub2_1716.aBool9638 && this.aClass174_Sub2_1716.aBool9641 && this.aClass133_1718 == null) {
         Class140 var1 = Class140.method1651(this.aClass174_Sub2_1716, '\u8b30', "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
         if(var1 != null) {
            this.aClass133_1718 = Class133.method1629(this.aClass174_Sub2_1716, new Class140[]{var1});
         }
      }

      return this.aClass133_1718 != null;
   }
}
