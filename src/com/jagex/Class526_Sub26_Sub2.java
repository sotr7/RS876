package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub1;
import com.jagex.Class133;
import com.jagex.Class140;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class526_Sub26;
import jaggl.OpenGL;

public class Class526_Sub26_Sub2 extends Class526_Sub26 {
   static final String aString11597 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
   Class133 aClass133_11598;
   static float aFloat11592 = 1.0F;
   static float aFloat11593 = 0.0F;
   static float aFloat11594 = 1.0F;
   static float aFloat11595 = 0.0F;
   static float aFloat11596 = 1.0F;

   void method9501() {
      this.aClass133_11598 = null;
   }

   boolean method10554() {
      return this.aClass174_Sub2_10552.aBool9641;
   }

   boolean method9484() {
      return this.aClass133_11598 != null;
   }

   void method9488() {
      this.aClass133_11598 = null;
   }

   void method9487(int var1, int var2) {
   }

   void method9486() {
      this.aClass133_11598 = null;
   }

   boolean method10555() {
      return this.aClass174_Sub2_10552.aBool9641;
   }

   void method9489(int var1) {
      OpenGL.glUseProgram(0);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641((Class124)null);
   }

   Class166 method9498() {
      return Class166.aClass166_1884;
   }

   int method9491() {
      return 1;
   }

   boolean method9495() {
      return aFloat11592 == 1.0F && aFloat11593 == 0.0F && aFloat11594 == 1.0F && aFloat11595 == 0.0F && aFloat11596 == 1.0F;
   }

   void method9504(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      int var6 = this.aClass133_11598.anInt1635;
      OpenGL.glUseProgram(var6);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
      OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var6, "paramsGamma"), aFloat11592);
      OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var6, "paramsRanges"), aFloat11593, aFloat11594, aFloat11595, aFloat11596);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641(var2);
   }

   boolean method9497() {
      if(this.aClass174_Sub2_10552.aBool9641) {
         this.aClass133_11598 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n")});
         return this.aClass133_11598 != null;
      } else {
         return false;
      }
   }

   void method9509() {
      this.aClass133_11598 = null;
   }

   boolean method9510() {
      return aFloat11592 == 1.0F && aFloat11593 == 0.0F && aFloat11594 == 1.0F && aFloat11595 == 0.0F && aFloat11596 == 1.0F;
   }

   void method9500() {
      this.aClass133_11598 = null;
   }

   boolean method9496() {
      if(this.aClass174_Sub2_10552.aBool9641) {
         this.aClass133_11598 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n")});
         return this.aClass133_11598 != null;
      } else {
         return false;
      }
   }

   Class166 method9514() {
      return Class166.aClass166_1884;
   }

   void method9507(int var1, int var2) {
   }

   void method9513(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      int var6 = this.aClass133_11598.anInt1635;
      OpenGL.glUseProgram(var6);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
      OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var6, "paramsGamma"), aFloat11592);
      OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var6, "paramsRanges"), aFloat11593, aFloat11594, aFloat11595, aFloat11596);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641(var2);
   }

   void method9505(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      int var6 = this.aClass133_11598.anInt1635;
      OpenGL.glUseProgram(var6);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
      OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var6, "paramsGamma"), aFloat11592);
      OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var6, "paramsRanges"), aFloat11593, aFloat11594, aFloat11595, aFloat11596);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641(var2);
   }

   void method9503(int var1) {
      OpenGL.glUseProgram(0);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641((Class124)null);
   }

   void method9502(int var1, int var2) {
   }

   int method9499() {
      return 1;
   }

   void method9506(int var1) {
      OpenGL.glUseProgram(0);
      this.aClass174_Sub2_10552.method8677(0);
      this.aClass174_Sub2_10552.method8641((Class124)null);
   }

   boolean method10556() {
      return this.aClass174_Sub2_10552.aBool9641;
   }

   boolean method10557() {
      return this.aClass174_Sub2_10552.aBool9641;
   }

   Class526_Sub26_Sub2(Class174_Sub2 var1) {
      super(var1);
   }

   boolean method9490() {
      if(this.aClass174_Sub2_10552.aBool9641) {
         this.aClass133_11598 = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n")});
         return this.aClass133_11598 != null;
      } else {
         return false;
      }
   }

   boolean method10558() {
      return this.aClass174_Sub2_10552.aBool9641;
   }

   boolean method10559() {
      return this.aClass174_Sub2_10552.aBool9641;
   }

   boolean method9515() {
      return this.aClass133_11598 != null;
   }
}
