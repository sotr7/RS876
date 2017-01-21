package com.jagex;

import com.jagex.Class122;
import com.jagex.Class124;
import com.jagex.Class126;
import com.jagex.Class132;
import com.jagex.Class139;
import com.jagex.Class174_Sub2;
import com.jagex.Class357;
import jaggl.OpenGL;

public class Class126_Sub9 extends Class126 {
   static final char aChar8997 = '\u0000';
   static final String aString8998 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
   static final char aChar9001 = '\u0001';
   Class139 aClass139_8999;
   float aFloat8996;
   int anInt9000;
   static float[] aFloatArray9005 = new float[4];
   Class132 aClass132_9004;
   Class122 aClass122_9003;
   float[] aFloatArray9002;

   void method1519(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   boolean method1505() {
      return true;
   }

   void method8394() {
      this.aClass139_8999 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8999.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8644(-16777216);
      this.aClass174_Sub2_1598.method8685(260, 7681);
      this.aClass174_Sub2_1598.method8674(0, '\u8576', 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', this.aClass122_9003.anInt1568);
      OpenGL.glEnable('\u8620');
      this.aClass139_8999.method1648();
      this.aClass139_8999.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      this.aClass174_Sub2_1598.method8672(0);
      this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', 0);
      OpenGL.glDisable('\u8620');
      this.aClass139_8999.method1648();
   }

   void method1506(boolean var1) {
      if(this.aClass139_8999 != null) {
         this.aClass139_8999.method1645('\u0000');
         this.aClass174_Sub2_1598.method8677(1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.aClass174_Sub2_1598.aClass433_9543.aFloatArray4841, 0);
         OpenGL.glMatrixMode(5888);
         this.aClass174_Sub2_1598.method8677(0);
         if(this.anInt9000 != this.aClass174_Sub2_1598.anInt9473) {
            int var2 = this.aClass174_Sub2_1598.anInt9473 % 5000 * 128 / 5000;

            for(int var3 = 0; var3 < 64; ++var3) {
               OpenGL.glProgramLocalParameter4fvARB('\u8620', var3, this.aFloatArray9002, var2);
               var2 += 2;
            }

            if(this.aClass132_9004.aBool1624) {
               this.aFloat8996 = (float)(this.aClass174_Sub2_1598.anInt9473 % 4000) / 4000.0F;
            } else {
               OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }

            this.anInt9000 = this.aClass174_Sub2_1598.anInt9473;
         }

      }
   }

   void method1507(boolean var1) {
   }

   void method1514() {
      if(this.aClass139_8999 != null) {
         this.aClass139_8999.method1645('\u0001');
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
      }
   }

   void method1509(int var1, int var2) {
      if(this.aClass139_8999 != null) {
         this.aClass174_Sub2_1598.method8677(1);
         int var3;
         if((var1 & 128) == 0) {
            if((var2 & 1) == 1) {
               if(!this.aClass132_9004.aBool1624) {
                  var3 = this.aClass174_Sub2_1598.anInt9473 % 4000 * 16 / 4000;
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub1Array1627[var3]);
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
               } else {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub4_1634);
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, this.aFloat8996, 0.0F, 0.0F, 1.0F);
               }
            } else {
               if(this.aClass132_9004.aBool1624) {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub4_1634);
               } else {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub1Array1627[0]);
               }

               OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            this.aClass174_Sub2_1598.method8641((Class124)null);
         }

         this.aClass174_Sub2_1598.method8677(0);
         if((var1 & 64) == 0) {
            aFloatArray9005[0] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9567;
            aFloatArray9005[1] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9583;
            aFloatArray9005[2] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9626;
            OpenGL.glProgramLocalParameter4fvARB('\u8620', 66, aFloatArray9005, 0);
         } else {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 66, 1.0F, 1.0F, 1.0F, 1.0F);
         }

         var3 = var1 & 3;
         if(var3 == 2) {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.05F, 1.0F, 1.0F, 1.0F);
         } else if(var3 == 3) {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.1F, 1.0F, 1.0F, 1.0F);
         } else {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.025F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   void method1518(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method1515(int var1, int var2) {
      if(this.aClass139_8999 != null) {
         this.aClass174_Sub2_1598.method8677(1);
         int var3;
         if((var1 & 128) == 0) {
            if((var2 & 1) == 1) {
               if(!this.aClass132_9004.aBool1624) {
                  var3 = this.aClass174_Sub2_1598.anInt9473 % 4000 * 16 / 4000;
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub1Array1627[var3]);
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
               } else {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub4_1634);
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, this.aFloat8996, 0.0F, 0.0F, 1.0F);
               }
            } else {
               if(this.aClass132_9004.aBool1624) {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub4_1634);
               } else {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub1Array1627[0]);
               }

               OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            this.aClass174_Sub2_1598.method8641((Class124)null);
         }

         this.aClass174_Sub2_1598.method8677(0);
         if((var1 & 64) == 0) {
            aFloatArray9005[0] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9567;
            aFloatArray9005[1] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9583;
            aFloatArray9005[2] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9626;
            OpenGL.glProgramLocalParameter4fvARB('\u8620', 66, aFloatArray9005, 0);
         } else {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 66, 1.0F, 1.0F, 1.0F, 1.0F);
         }

         var3 = var1 & 3;
         if(var3 == 2) {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.05F, 1.0F, 1.0F, 1.0F);
         } else if(var3 == 3) {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.1F, 1.0F, 1.0F, 1.0F);
         } else {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.025F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   void method8395() {
      this.aClass139_8999 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8999.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8644(-16777216);
      this.aClass174_Sub2_1598.method8685(260, 7681);
      this.aClass174_Sub2_1598.method8674(0, '\u8576', 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', this.aClass122_9003.anInt1568);
      OpenGL.glEnable('\u8620');
      this.aClass139_8999.method1648();
      this.aClass139_8999.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      this.aClass174_Sub2_1598.method8672(0);
      this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', 0);
      OpenGL.glDisable('\u8620');
      this.aClass139_8999.method1648();
   }

   void method1508() {
      if(this.aClass139_8999 != null) {
         this.aClass139_8999.method1645('\u0001');
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
      }
   }

   void method8396() {
      this.aClass139_8999 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8999.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8644(-16777216);
      this.aClass174_Sub2_1598.method8685(260, 7681);
      this.aClass174_Sub2_1598.method8674(0, '\u8576', 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', this.aClass122_9003.anInt1568);
      OpenGL.glEnable('\u8620');
      this.aClass139_8999.method1648();
      this.aClass139_8999.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      this.aClass174_Sub2_1598.method8672(0);
      this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', 0);
      OpenGL.glDisable('\u8620');
      this.aClass139_8999.method1648();
   }

   void method8397() {
      this.aClass139_8999 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8999.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8644(-16777216);
      this.aClass174_Sub2_1598.method8685(260, 7681);
      this.aClass174_Sub2_1598.method8674(0, '\u8576', 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', this.aClass122_9003.anInt1568);
      OpenGL.glEnable('\u8620');
      this.aClass139_8999.method1648();
      this.aClass139_8999.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      this.aClass174_Sub2_1598.method8672(0);
      this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', 0);
      OpenGL.glDisable('\u8620');
      this.aClass139_8999.method1648();
   }

   void method1510(boolean var1) {
      if(this.aClass139_8999 != null) {
         this.aClass139_8999.method1645('\u0000');
         this.aClass174_Sub2_1598.method8677(1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.aClass174_Sub2_1598.aClass433_9543.aFloatArray4841, 0);
         OpenGL.glMatrixMode(5888);
         this.aClass174_Sub2_1598.method8677(0);
         if(this.anInt9000 != this.aClass174_Sub2_1598.anInt9473) {
            int var2 = this.aClass174_Sub2_1598.anInt9473 % 5000 * 128 / 5000;

            for(int var3 = 0; var3 < 64; ++var3) {
               OpenGL.glProgramLocalParameter4fvARB('\u8620', var3, this.aFloatArray9002, var2);
               var2 += 2;
            }

            if(this.aClass132_9004.aBool1624) {
               this.aFloat8996 = (float)(this.aClass174_Sub2_1598.anInt9473 % 4000) / 4000.0F;
            } else {
               OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }

            this.anInt9000 = this.aClass174_Sub2_1598.anInt9473;
         }

      }
   }

   void method1504(boolean var1) {
   }

   void method1516(int var1, int var2) {
      if(this.aClass139_8999 != null) {
         this.aClass174_Sub2_1598.method8677(1);
         int var3;
         if((var1 & 128) == 0) {
            if((var2 & 1) == 1) {
               if(!this.aClass132_9004.aBool1624) {
                  var3 = this.aClass174_Sub2_1598.anInt9473 % 4000 * 16 / 4000;
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub1Array1627[var3]);
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
               } else {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub4_1634);
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, this.aFloat8996, 0.0F, 0.0F, 1.0F);
               }
            } else {
               if(this.aClass132_9004.aBool1624) {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub4_1634);
               } else {
                  this.aClass174_Sub2_1598.method8641(this.aClass132_9004.aClass124_Sub1Array1627[0]);
               }

               OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            this.aClass174_Sub2_1598.method8641((Class124)null);
         }

         this.aClass174_Sub2_1598.method8677(0);
         if((var1 & 64) == 0) {
            aFloatArray9005[0] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9567;
            aFloatArray9005[1] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9583;
            aFloatArray9005[2] = this.aClass174_Sub2_1598.aFloat9585 * this.aClass174_Sub2_1598.aFloat9626;
            OpenGL.glProgramLocalParameter4fvARB('\u8620', 66, aFloatArray9005, 0);
         } else {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 66, 1.0F, 1.0F, 1.0F, 1.0F);
         }

         var3 = var1 & 3;
         if(var3 == 2) {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.05F, 1.0F, 1.0F, 1.0F);
         } else if(var3 == 3) {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.1F, 1.0F, 1.0F, 1.0F);
         } else {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.025F, 1.0F, 1.0F, 1.0F);
         }

      }
   }

   boolean method1511() {
      return true;
   }

   void method8398() {
      this.aClass139_8999 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8999.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8644(-16777216);
      this.aClass174_Sub2_1598.method8685(260, 7681);
      this.aClass174_Sub2_1598.method8674(0, '\u8576', 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', this.aClass122_9003.anInt1568);
      OpenGL.glEnable('\u8620');
      this.aClass139_8999.method1648();
      this.aClass139_8999.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      this.aClass174_Sub2_1598.method8672(0);
      this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glBindProgramARB('\u8620', 0);
      OpenGL.glDisable('\u8620');
      this.aClass139_8999.method1648();
   }

   void method1512() {
      if(this.aClass139_8999 != null) {
         this.aClass139_8999.method1645('\u0001');
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
      }
   }

   void method1517(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method1520(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   Class126_Sub9(Class174_Sub2 var1, Class132 var2) {
      super(var1);
      this.aClass132_9004 = var2;
      if(this.aClass174_Sub2_1598.aBool9609 && this.aClass174_Sub2_1598.anInt9621 >= 2) {
         this.aClass122_9003 = Class122.method1473(this.aClass174_Sub2_1598, '\u8620', "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
         if(this.aClass122_9003 == null) {
            return;
         }

         int[][] var3 = Class357.method4576(64, 256, 0, 4, 4, 3, 0.4F, false, 1496606519);
         int[][] var4 = Class357.method4576(64, 256, 8, 4, 4, 3, 0.4F, false, 1496606519);
         int var5 = 0;
         this.aFloatArray9002 = new float['\u8000'];

         for(int var6 = 0; var6 < 256; ++var6) {
            int[] var7 = var3[var6];
            int[] var8 = var4[var6];

            for(int var9 = 0; var9 < 64; ++var9) {
               this.aFloatArray9002[var5++] = (float)var7[var9] / 4096.0F;
               this.aFloatArray9002[var5++] = (float)var8[var9] / 4096.0F;
            }
         }

         this.method8394();
      }

   }

   void method1513(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }
}
