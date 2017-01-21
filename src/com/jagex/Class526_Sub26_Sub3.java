package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub1;
import com.jagex.Class133;
import com.jagex.Class140;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class176_Sub2;
import com.jagex.Class526_Sub26;
import jaggl.OpenGL;

public class Class526_Sub26_Sub3 extends Class526_Sub26 {
   static final String aString11605 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
   static final String aString11606 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
   static final String aString11607 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
   static final String aString11608 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
   static final String aString11609 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
   static final String aString11610 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
   static final String aString11611 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
   static final String aString11613 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
   static float[] aFloatArray11614 = new float[]{0.0F, 0.0F, 0.0F};
   static float aFloat11603 = 1.0F;
   static int anInt11604 = 1;
   static Class176_Sub2[] aClass176_Sub2Array11602 = new Class176_Sub2[]{null, null, null};
   Class133[] aClass133Array11612 = null;

   void method9506(int var1) {
      OpenGL.glUseProgram(0);

      for(int var2 = anInt11604; var2 >= 0; --var2) {
         this.aClass174_Sub2_10552.method8677(var2);
         this.aClass174_Sub2_10552.method8641((Class124)null);
      }

   }

   boolean method10560() {
      return this.aClass174_Sub2_10552.aBool9641;
   }

   boolean method9484() {
      return this.aClass133Array11612 != null;
   }

   void method9489(int var1) {
      OpenGL.glUseProgram(0);

      for(int var2 = anInt11604; var2 >= 0; --var2) {
         this.aClass174_Sub2_10552.method8677(var2);
         this.aClass174_Sub2_10552.method8641((Class124)null);
      }

   }

   void method9487(int var1, int var2) {
   }

   void method9505(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      if(anInt11604 >= 1 && anInt11604 <= 3) {
         int var6 = this.aClass133Array11612[anInt11604 - 1].anInt1635;
         OpenGL.glUseProgram(var6);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var6, "paramsWeightings"), aFloat11603, aFloatArray11614[0], aFloatArray11614[1], aFloatArray11614[2]);
         this.aClass174_Sub2_10552.method8677(0);
         this.aClass174_Sub2_10552.method8641(var2);

         for(int var7 = anInt11604 - 1; var7 >= 0; --var7) {
            if(aClass176_Sub2Array11602[var7] != null) {
               if(var7 == 0) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_1"), 1);
               }

               if(var7 == 1) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_2"), 2);
               }

               if(var7 == 2) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_3"), 3);
               }

               this.aClass174_Sub2_10552.method8677(var7 + 1);
               Class124 var8 = aClass176_Sub2Array11602[var7].method8482();
               if(var8 != null) {
                  this.aClass174_Sub2_10552.method8641(var8);
               }
            }
         }

      }
   }

   boolean method9495() {
      return aFloat11603 == 1.0F || aFloatArray11614[0] + aFloatArray11614[1] + aFloatArray11614[2] == 0.0F || aClass176_Sub2Array11602[0] == null && aClass176_Sub2Array11602[1] == null && aClass176_Sub2Array11602[2] == null;
   }

   void method9507(int var1, int var2) {
   }

   Class166 method9498() {
      return Class166.aClass166_1884;
   }

   boolean method9510() {
      return aFloat11603 == 1.0F || aFloatArray11614[0] + aFloatArray11614[1] + aFloatArray11614[2] == 0.0F || aClass176_Sub2Array11602[0] == null && aClass176_Sub2Array11602[1] == null && aClass176_Sub2Array11602[2] == null;
   }

   Class526_Sub26_Sub3(Class174_Sub2 var1) {
      super(var1);
   }

   boolean method9496() {
      if(!this.aClass174_Sub2_10552.aBool9641) {
         return false;
      } else {
         this.aClass133Array11612 = new Class133[3];
         int var1;
         if(this.aClass174_Sub2_10552.aBool9632) {
            this.aClass133Array11612[0] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[1] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[2] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});

            for(var1 = 0; var1 < 3; ++var1) {
               if(this.aClass133Array11612[var1] == null) {
                  return false;
               }
            }
         } else {
            this.aClass133Array11612[0] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[1] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[2] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});

            for(var1 = 0; var1 < 3; ++var1) {
               if(this.aClass133Array11612[var1] == null) {
                  return false;
               }
            }
         }

         return this.aClass133Array11612 != null;
      }
   }

   boolean method9497() {
      if(!this.aClass174_Sub2_10552.aBool9641) {
         return false;
      } else {
         this.aClass133Array11612 = new Class133[3];
         int var1;
         if(this.aClass174_Sub2_10552.aBool9632) {
            this.aClass133Array11612[0] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[1] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[2] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});

            for(var1 = 0; var1 < 3; ++var1) {
               if(this.aClass133Array11612[var1] == null) {
                  return false;
               }
            }
         } else {
            this.aClass133Array11612[0] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[1] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[2] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});

            for(var1 = 0; var1 < 3; ++var1) {
               if(this.aClass133Array11612[var1] == null) {
                  return false;
               }
            }
         }

         return this.aClass133Array11612 != null;
      }
   }

   void method9513(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      if(anInt11604 >= 1 && anInt11604 <= 3) {
         int var6 = this.aClass133Array11612[anInt11604 - 1].anInt1635;
         OpenGL.glUseProgram(var6);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var6, "paramsWeightings"), aFloat11603, aFloatArray11614[0], aFloatArray11614[1], aFloatArray11614[2]);
         this.aClass174_Sub2_10552.method8677(0);
         this.aClass174_Sub2_10552.method8641(var2);

         for(int var7 = anInt11604 - 1; var7 >= 0; --var7) {
            if(aClass176_Sub2Array11602[var7] != null) {
               if(var7 == 0) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_1"), 1);
               }

               if(var7 == 1) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_2"), 2);
               }

               if(var7 == 2) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_3"), 3);
               }

               this.aClass174_Sub2_10552.method8677(var7 + 1);
               Class124 var8 = aClass176_Sub2Array11602[var7].method8482();
               if(var8 != null) {
                  this.aClass174_Sub2_10552.method8641(var8);
               }
            }
         }

      }
   }

   void method9488() {
      if(this.aClass133Array11612 != null) {
         for(int var1 = 0; var1 < this.aClass133Array11612.length; ++var1) {
            this.aClass133Array11612[var1] = null;
         }

         this.aClass133Array11612 = null;
      }

   }

   void method9500() {
      if(this.aClass133Array11612 != null) {
         for(int var1 = 0; var1 < this.aClass133Array11612.length; ++var1) {
            this.aClass133Array11612[var1] = null;
         }

         this.aClass133Array11612 = null;
      }

   }

   void method9501() {
      if(this.aClass133Array11612 != null) {
         for(int var1 = 0; var1 < this.aClass133Array11612.length; ++var1) {
            this.aClass133Array11612[var1] = null;
         }

         this.aClass133Array11612 = null;
      }

   }

   void method9502(int var1, int var2) {
   }

   boolean method9515() {
      return this.aClass133Array11612 != null;
   }

   void method9504(int var1, Class124_Sub1 var2, Class124_Sub1 var3, int var4, int var5) {
      if(anInt11604 >= 1 && anInt11604 <= 3) {
         int var6 = this.aClass133Array11612[anInt11604 - 1].anInt1635;
         OpenGL.glUseProgram(var6);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var6, "paramsWeightings"), aFloat11603, aFloatArray11614[0], aFloatArray11614[1], aFloatArray11614[2]);
         this.aClass174_Sub2_10552.method8677(0);
         this.aClass174_Sub2_10552.method8641(var2);

         for(int var7 = anInt11604 - 1; var7 >= 0; --var7) {
            if(aClass176_Sub2Array11602[var7] != null) {
               if(var7 == 0) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_1"), 1);
               }

               if(var7 == 1) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_2"), 2);
               }

               if(var7 == 2) {
                  OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_3"), 3);
               }

               this.aClass174_Sub2_10552.method8677(var7 + 1);
               Class124 var8 = aClass176_Sub2Array11602[var7].method8482();
               if(var8 != null) {
                  this.aClass174_Sub2_10552.method8641(var8);
               }
            }
         }

      }
   }

   int method9491() {
      return 2;
   }

   void method9503(int var1) {
      OpenGL.glUseProgram(0);

      for(int var2 = anInt11604; var2 >= 0; --var2) {
         this.aClass174_Sub2_10552.method8677(var2);
         this.aClass174_Sub2_10552.method8641((Class124)null);
      }

   }

   boolean method9490() {
      if(!this.aClass174_Sub2_10552.aBool9641) {
         return false;
      } else {
         this.aClass133Array11612 = new Class133[3];
         int var1;
         if(this.aClass174_Sub2_10552.aBool9632) {
            this.aClass133Array11612[0] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[1] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[2] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});

            for(var1 = 0; var1 < 3; ++var1) {
               if(this.aClass133Array11612[var1] == null) {
                  return false;
               }
            }
         } else {
            this.aClass133Array11612[0] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[1] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});
            this.aClass133Array11612[2] = Class133.method1629(this.aClass174_Sub2_10552, new Class140[]{Class140.method1651(this.aClass174_Sub2_10552, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))});

            for(var1 = 0; var1 < 3; ++var1) {
               if(this.aClass133Array11612[var1] == null) {
                  return false;
               }
            }
         }

         return this.aClass133Array11612 != null;
      }
   }

   int method9499() {
      return 2;
   }

   Class166 method9514() {
      return Class166.aClass166_1884;
   }

   void method9486() {
      if(this.aClass133Array11612 != null) {
         for(int var1 = 0; var1 < this.aClass133Array11612.length; ++var1) {
            this.aClass133Array11612[var1] = null;
         }

         this.aClass133Array11612 = null;
      }

   }

   void method9509() {
      if(this.aClass133Array11612 != null) {
         for(int var1 = 0; var1 < this.aClass133Array11612.length; ++var1) {
            this.aClass133Array11612[var1] = null;
         }

         this.aClass133Array11612 = null;
      }

   }

   boolean method10561() {
      return this.aClass174_Sub2_10552.aBool9641;
   }
}
