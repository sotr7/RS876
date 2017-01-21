package com.jagex;

import com.jagex.Class122;
import com.jagex.Class124;
import com.jagex.Class124_Sub1;
import com.jagex.Class126;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class433;
import jaggl.OpenGL;

public class Class126_Sub3 extends Class126 {
   static final String aString8900 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
   static final String aString8902 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
   static final String aString8903 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
   static final String aString8912 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
   boolean aBool8909;
   boolean aBool8905;
   boolean aBool8907 = false;
   static float[] aFloatArray8913 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   boolean aBool8904;
   Class122 aClass122_8908;
   Class122 aClass122_8911;
   Class122 aClass122_8910;
   Class122 aClass122_8906;
   Class124_Sub1 aClass124_Sub1_8901;

   void method1510(boolean var1) {
      this.aBool8909 = var1;
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8641(this.aClass124_Sub1_8901);
      this.aClass174_Sub2_1598.method8685('\u8575', 7681);
      this.aClass174_Sub2_1598.method8665(0, '\u8576', 768);
      this.aClass174_Sub2_1598.method8665(2, 5890, 770);
      this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
      this.aClass174_Sub2_1598.method8677(0);
      this.method8361();
   }

   boolean method1505() {
      return this.aBool8904;
   }

   void method8358() {
      if(this.aBool8905) {
         float var1 = this.aClass174_Sub2_1598.aFloat9556;
         float var2 = this.aClass174_Sub2_1598.aFloat9555;
         float var3 = var1 - (var1 - var2) * 0.125F;
         float var4 = var1 - (var1 - var2) * 0.25F;
         OpenGL.glProgramLocalParameter4fARB('\u8620', 0, var4, var3, 256.0F / (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2020 * -1648426019), (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2018 * 1590947963) / 255.0F);
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8644(this.aClass174_Sub2_1598.aClass172_9480.anInt2019 * -1808050665);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   void method1507(boolean var1) {
   }

   void method1508() {
      if(this.aBool8905) {
         OpenGL.glBindProgramARB('\u8620', 0);
         OpenGL.glDisable('\u8804');
         OpenGL.glDisable('\u8620');
         this.aBool8905 = false;
      }

      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8641((Class124)null);
      this.aClass174_Sub2_1598.method8685(8448, 8448);
      this.aClass174_Sub2_1598.method8665(0, 5890, 768);
      this.aClass174_Sub2_1598.method8665(2, '\u8576', 770);
      this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      this.aClass174_Sub2_1598.method8677(0);
      if(this.aBool8907) {
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
         this.aBool8907 = false;
      }

   }

   void method1519(Class124 var1, int var2) {
      if(var1 == null) {
         if(!this.aBool8907) {
            this.aClass174_Sub2_1598.method8641(this.aClass174_Sub2_1598.aClass124_Sub1_9613);
            this.aClass174_Sub2_1598.method8672(1);
            this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
            this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
            this.aBool8907 = true;
         }
      } else {
         if(this.aBool8907) {
            this.aClass174_Sub2_1598.method8665(0, 5890, 768);
            this.aClass174_Sub2_1598.method8674(0, 5890, 770);
            this.aBool8907 = false;
         }

         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method8359() {
      if(this.aBool8905) {
         float var1 = this.aClass174_Sub2_1598.aFloat9556;
         float var2 = this.aClass174_Sub2_1598.aFloat9555;
         float var3 = var1 - (var1 - var2) * 0.125F;
         float var4 = var1 - (var1 - var2) * 0.25F;
         OpenGL.glProgramLocalParameter4fARB('\u8620', 0, var4, var3, 256.0F / (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2020 * -1648426019), (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2018 * 1590947963) / 255.0F);
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8644(this.aClass174_Sub2_1598.aClass172_9480.anInt2019 * -1808050665);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   void method1518(Class124 var1, int var2) {
      if(var1 == null) {
         if(!this.aBool8907) {
            this.aClass174_Sub2_1598.method8641(this.aClass174_Sub2_1598.aClass124_Sub1_9613);
            this.aClass174_Sub2_1598.method8672(1);
            this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
            this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
            this.aBool8907 = true;
         }
      } else {
         if(this.aBool8907) {
            this.aClass174_Sub2_1598.method8665(0, 5890, 768);
            this.aClass174_Sub2_1598.method8674(0, 5890, 770);
            this.aBool8907 = false;
         }

         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method1509(int var1, int var2) {
   }

   void method8360() {
      Class433 var1 = this.aClass174_Sub2_1598.aClass433_9496;
      if(this.aBool8909) {
         OpenGL.glBindProgramARB('\u8620', this.aClass174_Sub2_1598.anInt9603 == Integer.MAX_VALUE?this.aClass122_8911.anInt1568:this.aClass122_8906.anInt1568);
      } else {
         OpenGL.glBindProgramARB('\u8620', this.aClass174_Sub2_1598.anInt9603 == Integer.MAX_VALUE?this.aClass122_8908.anInt1568:this.aClass122_8910.anInt1568);
      }

      float var2 = (float)this.aClass174_Sub2_1598.anInt9603;
      float var3 = var1.aFloatArray4841[4] * var2 + var1.aFloatArray4841[12];
      float var4 = var1.aFloatArray4841[5] * var2 + var1.aFloatArray4841[13];
      float var5 = var1.aFloatArray4841[6] * var2 + var1.aFloatArray4841[14];
      aFloatArray8913[0] = -var1.aFloatArray4841[4];
      aFloatArray8913[1] = -var1.aFloatArray4841[5];
      aFloatArray8913[2] = -var1.aFloatArray4841[6];
      aFloatArray8913[3] = -(aFloatArray8913[0] * var3 + aFloatArray8913[1] * var4 + aFloatArray8913[2] * var5);
      OpenGL.glProgramLocalParameter4fARB('\u8620', 1, aFloatArray8913[0], aFloatArray8913[1], aFloatArray8913[2], aFloatArray8913[3]);
      OpenGL.glEnable('\u8620');
      this.aBool8905 = true;
      this.method8359();
   }

   boolean method1511() {
      return this.aBool8904;
   }

   void method1513(Class124 var1, int var2) {
      if(var1 == null) {
         if(!this.aBool8907) {
            this.aClass174_Sub2_1598.method8641(this.aClass174_Sub2_1598.aClass124_Sub1_9613);
            this.aClass174_Sub2_1598.method8672(1);
            this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
            this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
            this.aBool8907 = true;
         }
      } else {
         if(this.aBool8907) {
            this.aClass174_Sub2_1598.method8665(0, 5890, 768);
            this.aClass174_Sub2_1598.method8674(0, 5890, 770);
            this.aBool8907 = false;
         }

         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method1512() {
      if(this.aBool8905) {
         OpenGL.glBindProgramARB('\u8620', 0);
         OpenGL.glDisable('\u8804');
         OpenGL.glDisable('\u8620');
         this.aBool8905 = false;
      }

      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8641((Class124)null);
      this.aClass174_Sub2_1598.method8685(8448, 8448);
      this.aClass174_Sub2_1598.method8665(0, 5890, 768);
      this.aClass174_Sub2_1598.method8665(2, '\u8576', 770);
      this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      this.aClass174_Sub2_1598.method8677(0);
      if(this.aBool8907) {
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
         this.aBool8907 = false;
      }

   }

   void method1517(Class124 var1, int var2) {
      if(var1 == null) {
         if(!this.aBool8907) {
            this.aClass174_Sub2_1598.method8641(this.aClass174_Sub2_1598.aClass124_Sub1_9613);
            this.aClass174_Sub2_1598.method8672(1);
            this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
            this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
            this.aBool8907 = true;
         }
      } else {
         if(this.aBool8907) {
            this.aClass174_Sub2_1598.method8665(0, 5890, 768);
            this.aClass174_Sub2_1598.method8674(0, 5890, 770);
            this.aBool8907 = false;
         }

         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method1515(int var1, int var2) {
   }

   void method1516(int var1, int var2) {
   }

   void method1514() {
      if(this.aBool8905) {
         OpenGL.glBindProgramARB('\u8620', 0);
         OpenGL.glDisable('\u8804');
         OpenGL.glDisable('\u8620');
         this.aBool8905 = false;
      }

      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8641((Class124)null);
      this.aClass174_Sub2_1598.method8685(8448, 8448);
      this.aClass174_Sub2_1598.method8665(0, 5890, 768);
      this.aClass174_Sub2_1598.method8665(2, '\u8576', 770);
      this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      this.aClass174_Sub2_1598.method8677(0);
      if(this.aBool8907) {
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
         this.aBool8907 = false;
      }

   }

   void method1520(Class124 var1, int var2) {
      if(var1 == null) {
         if(!this.aBool8907) {
            this.aClass174_Sub2_1598.method8641(this.aClass174_Sub2_1598.aClass124_Sub1_9613);
            this.aClass174_Sub2_1598.method8672(1);
            this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
            this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
            this.aBool8907 = true;
         }
      } else {
         if(this.aBool8907) {
            this.aClass174_Sub2_1598.method8665(0, 5890, 768);
            this.aClass174_Sub2_1598.method8674(0, 5890, 770);
            this.aBool8907 = false;
         }

         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method1504(boolean var1) {
   }

   void method8361() {
      Class433 var1 = this.aClass174_Sub2_1598.aClass433_9496;
      if(this.aBool8909) {
         OpenGL.glBindProgramARB('\u8620', this.aClass174_Sub2_1598.anInt9603 == Integer.MAX_VALUE?this.aClass122_8911.anInt1568:this.aClass122_8906.anInt1568);
      } else {
         OpenGL.glBindProgramARB('\u8620', this.aClass174_Sub2_1598.anInt9603 == Integer.MAX_VALUE?this.aClass122_8908.anInt1568:this.aClass122_8910.anInt1568);
      }

      float var2 = (float)this.aClass174_Sub2_1598.anInt9603;
      float var3 = var1.aFloatArray4841[4] * var2 + var1.aFloatArray4841[12];
      float var4 = var1.aFloatArray4841[5] * var2 + var1.aFloatArray4841[13];
      float var5 = var1.aFloatArray4841[6] * var2 + var1.aFloatArray4841[14];
      aFloatArray8913[0] = -var1.aFloatArray4841[4];
      aFloatArray8913[1] = -var1.aFloatArray4841[5];
      aFloatArray8913[2] = -var1.aFloatArray4841[6];
      aFloatArray8913[3] = -(aFloatArray8913[0] * var3 + aFloatArray8913[1] * var4 + aFloatArray8913[2] * var5);
      OpenGL.glProgramLocalParameter4fARB('\u8620', 1, aFloatArray8913[0], aFloatArray8913[1], aFloatArray8913[2], aFloatArray8913[3]);
      OpenGL.glEnable('\u8620');
      this.aBool8905 = true;
      this.method8359();
   }

   void method1506(boolean var1) {
      this.aBool8909 = var1;
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8641(this.aClass124_Sub1_8901);
      this.aClass174_Sub2_1598.method8685('\u8575', 7681);
      this.aClass174_Sub2_1598.method8665(0, '\u8576', 768);
      this.aClass174_Sub2_1598.method8665(2, 5890, 770);
      this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
      this.aClass174_Sub2_1598.method8677(0);
      this.method8361();
   }

   void method8362() {
      Class433 var1 = this.aClass174_Sub2_1598.aClass433_9496;
      if(this.aBool8909) {
         OpenGL.glBindProgramARB('\u8620', this.aClass174_Sub2_1598.anInt9603 == Integer.MAX_VALUE?this.aClass122_8911.anInt1568:this.aClass122_8906.anInt1568);
      } else {
         OpenGL.glBindProgramARB('\u8620', this.aClass174_Sub2_1598.anInt9603 == Integer.MAX_VALUE?this.aClass122_8908.anInt1568:this.aClass122_8910.anInt1568);
      }

      float var2 = (float)this.aClass174_Sub2_1598.anInt9603;
      float var3 = var1.aFloatArray4841[4] * var2 + var1.aFloatArray4841[12];
      float var4 = var1.aFloatArray4841[5] * var2 + var1.aFloatArray4841[13];
      float var5 = var1.aFloatArray4841[6] * var2 + var1.aFloatArray4841[14];
      aFloatArray8913[0] = -var1.aFloatArray4841[4];
      aFloatArray8913[1] = -var1.aFloatArray4841[5];
      aFloatArray8913[2] = -var1.aFloatArray4841[6];
      aFloatArray8913[3] = -(aFloatArray8913[0] * var3 + aFloatArray8913[1] * var4 + aFloatArray8913[2] * var5);
      OpenGL.glProgramLocalParameter4fARB('\u8620', 1, aFloatArray8913[0], aFloatArray8913[1], aFloatArray8913[2], aFloatArray8913[3]);
      OpenGL.glEnable('\u8620');
      this.aBool8905 = true;
      this.method8359();
   }

   void method8363() {
      Class433 var1 = this.aClass174_Sub2_1598.aClass433_9496;
      if(this.aBool8909) {
         OpenGL.glBindProgramARB('\u8620', this.aClass174_Sub2_1598.anInt9603 == Integer.MAX_VALUE?this.aClass122_8911.anInt1568:this.aClass122_8906.anInt1568);
      } else {
         OpenGL.glBindProgramARB('\u8620', this.aClass174_Sub2_1598.anInt9603 == Integer.MAX_VALUE?this.aClass122_8908.anInt1568:this.aClass122_8910.anInt1568);
      }

      float var2 = (float)this.aClass174_Sub2_1598.anInt9603;
      float var3 = var1.aFloatArray4841[4] * var2 + var1.aFloatArray4841[12];
      float var4 = var1.aFloatArray4841[5] * var2 + var1.aFloatArray4841[13];
      float var5 = var1.aFloatArray4841[6] * var2 + var1.aFloatArray4841[14];
      aFloatArray8913[0] = -var1.aFloatArray4841[4];
      aFloatArray8913[1] = -var1.aFloatArray4841[5];
      aFloatArray8913[2] = -var1.aFloatArray4841[6];
      aFloatArray8913[3] = -(aFloatArray8913[0] * var3 + aFloatArray8913[1] * var4 + aFloatArray8913[2] * var5);
      OpenGL.glProgramLocalParameter4fARB('\u8620', 1, aFloatArray8913[0], aFloatArray8913[1], aFloatArray8913[2], aFloatArray8913[3]);
      OpenGL.glEnable('\u8620');
      this.aBool8905 = true;
      this.method8359();
   }

   void method8364() {
      if(this.aBool8905) {
         float var1 = this.aClass174_Sub2_1598.aFloat9556;
         float var2 = this.aClass174_Sub2_1598.aFloat9555;
         float var3 = var1 - (var1 - var2) * 0.125F;
         float var4 = var1 - (var1 - var2) * 0.25F;
         OpenGL.glProgramLocalParameter4fARB('\u8620', 0, var4, var3, 256.0F / (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2020 * -1648426019), (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2018 * 1590947963) / 255.0F);
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8644(this.aClass174_Sub2_1598.aClass172_9480.anInt2019 * -1808050665);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   Class126_Sub3(Class174_Sub2 var1) {
      super(var1);
      if(this.aClass174_Sub2_1598.aBool9609) {
         this.aClass122_8908 = Class122.method1473(this.aClass174_Sub2_1598, '\u8620', "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
         this.aClass122_8911 = Class122.method1473(this.aClass174_Sub2_1598, '\u8620', "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
         this.aClass122_8910 = Class122.method1473(this.aClass174_Sub2_1598, '\u8620', "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
         this.aClass122_8906 = Class122.method1473(this.aClass174_Sub2_1598, '\u8620', "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
         if(this.aClass122_8908 != null & this.aClass122_8911 != null & this.aClass122_8910 != null & this.aClass122_8906 != null) {
            this.aClass124_Sub1_8901 = new Class124_Sub1(var1, 3553, Class144.aClass144_1681, Class166.aClass166_1884, 2, 1, false, new byte[]{(byte)0, (byte)-1}, Class144.aClass144_1681, false);
            this.aClass124_Sub1_8901.method8335(false, false);
            this.aBool8904 = true;
         } else {
            this.aBool8904 = false;
         }
      } else {
         this.aBool8904 = false;
      }

   }

   void method8365() {
      if(this.aBool8905) {
         float var1 = this.aClass174_Sub2_1598.aFloat9556;
         float var2 = this.aClass174_Sub2_1598.aFloat9555;
         float var3 = var1 - (var1 - var2) * 0.125F;
         float var4 = var1 - (var1 - var2) * 0.25F;
         OpenGL.glProgramLocalParameter4fARB('\u8620', 0, var4, var3, 256.0F / (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2020 * -1648426019), (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2018 * 1590947963) / 255.0F);
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8644(this.aClass174_Sub2_1598.aClass172_9480.anInt2019 * -1808050665);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   void method8366() {
      if(this.aBool8905) {
         float var1 = this.aClass174_Sub2_1598.aFloat9556;
         float var2 = this.aClass174_Sub2_1598.aFloat9555;
         float var3 = var1 - (var1 - var2) * 0.125F;
         float var4 = var1 - (var1 - var2) * 0.25F;
         OpenGL.glProgramLocalParameter4fARB('\u8620', 0, var4, var3, 256.0F / (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2020 * -1648426019), (float)(this.aClass174_Sub2_1598.aClass172_9480.anInt2018 * 1590947963) / 255.0F);
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8644(this.aClass174_Sub2_1598.aClass172_9480.anInt2019 * -1808050665);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }
}
