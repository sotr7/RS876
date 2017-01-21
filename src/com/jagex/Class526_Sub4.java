package com.jagex;

import com.jagex.Class129;
import com.jagex.Class135_Sub1;
import com.jagex.Class138_Sub1;
import com.jagex.Class148_Sub3;
import com.jagex.Class171;
import com.jagex.Class172;
import com.jagex.Class174_Sub2;
import com.jagex.Class526;
import com.jagex.Class526_Sub36_Sub1;
import com.jagex.Interface15;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class526_Sub4 extends Class526 {
   NativeHeapBuffer aNativeHeapBuffer10372;
   Stream aStream10381;
   Class148_Sub3 aClass148_Sub3_10376;
   Class174_Sub2 aClass174_Sub2_10374;
   int anInt10380;
   float aFloat10375;
   Class172 aClass172_10373;
   int[] anIntArray10379;
   Class138_Sub1 aClass138_Sub1_10378;
   Class129 aClass129_10377;

   void method9318(int var1, int var2, int var3, float var4) {
      int var6;
      int var7;
      if(this.anInt10380 != -1) {
         Class171 var5 = this.aClass174_Sub2_10374.aClass169_2035.method2122(this.anInt10380, (byte)30);
         var6 = var5.aByte1969 & 255;
         int var9;
         if(var6 != 0 && var5.aByte1966 != 4) {
            if(var3 < 0) {
               var7 = 0;
            } else if(var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

            if(var6 == 256) {
               var2 = var7;
            } else {
               var9 = 256 - var6;
               var2 = ((var7 & 16711935) * var6 + (var2 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var2 & '\uff00') * var9 & 16711680) >> 8;
            }
         }

         var7 = var5.aByte2012 & 255;
         if(var7 != 0) {
            var7 += 256;
            int var8 = ((var2 & 16711680) >> 16) * var7;
            if(var8 > '\uffff') {
               var8 = '\uffff';
            }

            var9 = ((var2 & '\uff00') >> 8) * var7;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            int var10 = (var2 & 255) * var7;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var2 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
         }
      }

      if(var4 != 1.0F) {
         int var11 = var2 >> 16 & 255;
         var6 = var2 >> 8 & 255;
         var7 = var2 & 255;
         var11 = (int)((float)var11 * var4);
         if(var11 < 0) {
            var11 = 0;
         } else if(var11 > 255) {
            var11 = 255;
         }

         var6 = (int)((float)var6 * var4);
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         var7 = (int)((float)var7 * var4);
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         var2 = var11 << 16 | var6 << 8 | var7;
      }

      this.aStream10381.method1248(var1 * 4);
      this.aStream10381.method1249((byte)(var2 >> 16));
      this.aStream10381.method1249((byte)(var2 >> 8));
      this.aStream10381.method1249((byte)var2);
   }

   void method9319(int var1) {
      this.aNativeHeapBuffer10372 = this.aClass174_Sub2_10374.aNativeHeap9515.method1354(var1 * 4, true);
      this.aStream10381 = new Stream(this.aNativeHeapBuffer10372);
   }

   void method9320(int var1) {
      this.aStream10381.method1248(var1 * 4 + 3);
      this.aStream10381.method1249(-1);
   }

   void method9321(int var1, int var2, int var3) {
      this.anIntArray10379[var2 * this.aClass148_Sub3_10376.anInt1711 * 1966165105 + var1] |= 1 << var3;
   }

   Class526_Sub4(Class148_Sub3 var1, int var2, int var3, Class172 var4) {
      this.aClass148_Sub3_10376 = var1;
      this.aClass174_Sub2_10374 = this.aClass148_Sub3_10376.aClass174_Sub2_9169;
      this.anInt10380 = var2;
      this.aFloat10375 = (float)var3;
      this.aClass172_10373 = var4;
      this.anIntArray10379 = new int[this.aClass148_Sub3_10376.anInt1711 * 1966165105 * this.aClass148_Sub3_10376.anInt1713 * -810756899];
      this.aClass138_Sub1_10378 = new Class138_Sub1(this.aClass174_Sub2_10374, 5123, (byte[])null, 1);
   }

   void method9322(int var1) {
      this.aStream10381.method1252();
      Interface15 var2 = this.aClass174_Sub2_10374.method8631(4, this.aNativeHeapBuffer10372, var1 * 4, false);
      if(var2 instanceof Class135_Sub1) {
         this.aNativeHeapBuffer10372.method1228();
      }

      this.aClass129_10377 = new Class129(var2, 5121, 4, 0);
      this.aNativeHeapBuffer10372 = null;
      this.aStream10381 = null;
   }

   void method9323(int[] var1, int var2) {
      int var3 = 0;
      Class526_Sub36_Sub1 var4 = this.aClass174_Sub2_10374.aClass526_Sub36_Sub1_9655;
      var4.pos = 0;
      int var5;
      int var6;
      short[] var7;
      int var8;
      int var9;
      int var10;
      if(this.aClass174_Sub2_10374.aBool9508) {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.aClass148_Sub3_10376.aShortArrayArray9170[var6];
            var8 = this.anIntArray10379[var6];
            if(var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if((var8 & 1 << var9++) != 0) {
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      } else {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.aClass148_Sub3_10376.aShortArrayArray9170[var6];
            var8 = this.anIntArray10379[var6];
            if(var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if((var8 & 1 << var9++) != 0) {
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      }

      if(var3 > 0) {
         this.aClass138_Sub1_10378.method138(5123, var4.buffer, var4.pos * 301018015);
         this.aClass174_Sub2_10374.method8634(this.aClass148_Sub3_10376.aClass129_9180, this.aClass148_Sub3_10376.aClass129_9183, this.aClass129_10377, this.aClass148_Sub3_10376.aClass129_9186);
         this.aClass174_Sub2_10374.method8697(this.anInt10380, (this.aClass148_Sub3_10376.anInt9167 & 7) != 0, (this.aClass148_Sub3_10376.anInt9167 & 8) != 0);
         if(this.aClass174_Sub2_10374.aBool9601) {
            this.aClass174_Sub2_10374.method2353(Integer.MAX_VALUE, this.aClass172_10373);
         }

         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(1.0F / this.aFloat10375, 1.0F / this.aFloat10375, 1.0F);
         OpenGL.glMatrixMode(5888);
         this.aClass174_Sub2_10374.method8634(this.aClass148_Sub3_10376.aClass129_9180, this.aClass148_Sub3_10376.aClass129_9183, this.aClass129_10377, this.aClass148_Sub3_10376.aClass129_9186);
         this.aClass174_Sub2_10374.method8664(this.aClass138_Sub1_10378, 4, 0, var3);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      }

   }

   void method9324(int var1) {
      this.aNativeHeapBuffer10372 = this.aClass174_Sub2_10374.aNativeHeap9515.method1354(var1 * 4, true);
      this.aStream10381 = new Stream(this.aNativeHeapBuffer10372);
   }

   void method9325(int var1, int var2, int var3, float var4) {
      int var6;
      int var7;
      if(this.anInt10380 != -1) {
         Class171 var5 = this.aClass174_Sub2_10374.aClass169_2035.method2122(this.anInt10380, (byte)-21);
         var6 = var5.aByte1969 & 255;
         int var9;
         if(var6 != 0 && var5.aByte1966 != 4) {
            if(var3 < 0) {
               var7 = 0;
            } else if(var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

            if(var6 == 256) {
               var2 = var7;
            } else {
               var9 = 256 - var6;
               var2 = ((var7 & 16711935) * var6 + (var2 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var2 & '\uff00') * var9 & 16711680) >> 8;
            }
         }

         var7 = var5.aByte2012 & 255;
         if(var7 != 0) {
            var7 += 256;
            int var8 = ((var2 & 16711680) >> 16) * var7;
            if(var8 > '\uffff') {
               var8 = '\uffff';
            }

            var9 = ((var2 & '\uff00') >> 8) * var7;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            int var10 = (var2 & 255) * var7;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var2 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
         }
      }

      if(var4 != 1.0F) {
         int var11 = var2 >> 16 & 255;
         var6 = var2 >> 8 & 255;
         var7 = var2 & 255;
         var11 = (int)((float)var11 * var4);
         if(var11 < 0) {
            var11 = 0;
         } else if(var11 > 255) {
            var11 = 255;
         }

         var6 = (int)((float)var6 * var4);
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         var7 = (int)((float)var7 * var4);
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         var2 = var11 << 16 | var6 << 8 | var7;
      }

      this.aStream10381.method1248(var1 * 4);
      this.aStream10381.method1249((byte)(var2 >> 16));
      this.aStream10381.method1249((byte)(var2 >> 8));
      this.aStream10381.method1249((byte)var2);
   }

   void method9326(int var1) {
      this.aNativeHeapBuffer10372 = this.aClass174_Sub2_10374.aNativeHeap9515.method1354(var1 * 4, true);
      this.aStream10381 = new Stream(this.aNativeHeapBuffer10372);
   }

   void method9327(int[] var1, int var2) {
      int var3 = 0;
      Class526_Sub36_Sub1 var4 = this.aClass174_Sub2_10374.aClass526_Sub36_Sub1_9655;
      var4.pos = 0;
      int var5;
      int var6;
      short[] var7;
      int var8;
      int var9;
      int var10;
      if(this.aClass174_Sub2_10374.aBool9508) {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.aClass148_Sub3_10376.aShortArrayArray9170[var6];
            var8 = this.anIntArray10379[var6];
            if(var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if((var8 & 1 << var9++) != 0) {
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      } else {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.aClass148_Sub3_10376.aShortArrayArray9170[var6];
            var8 = this.anIntArray10379[var6];
            if(var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if((var8 & 1 << var9++) != 0) {
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      }

      if(var3 > 0) {
         this.aClass138_Sub1_10378.method138(5123, var4.buffer, var4.pos * 301018015);
         this.aClass174_Sub2_10374.method8634(this.aClass148_Sub3_10376.aClass129_9180, this.aClass148_Sub3_10376.aClass129_9183, this.aClass129_10377, this.aClass148_Sub3_10376.aClass129_9186);
         this.aClass174_Sub2_10374.method8697(this.anInt10380, (this.aClass148_Sub3_10376.anInt9167 & 7) != 0, (this.aClass148_Sub3_10376.anInt9167 & 8) != 0);
         if(this.aClass174_Sub2_10374.aBool9601) {
            this.aClass174_Sub2_10374.method2353(Integer.MAX_VALUE, this.aClass172_10373);
         }

         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(1.0F / this.aFloat10375, 1.0F / this.aFloat10375, 1.0F);
         OpenGL.glMatrixMode(5888);
         this.aClass174_Sub2_10374.method8634(this.aClass148_Sub3_10376.aClass129_9180, this.aClass148_Sub3_10376.aClass129_9183, this.aClass129_10377, this.aClass148_Sub3_10376.aClass129_9186);
         this.aClass174_Sub2_10374.method8664(this.aClass138_Sub1_10378, 4, 0, var3);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      }

   }

   void method9328(int var1) {
      this.aStream10381.method1248(var1 * 4 + 3);
      this.aStream10381.method1249(-1);
   }

   void method9329(int var1) {
      this.aNativeHeapBuffer10372 = this.aClass174_Sub2_10374.aNativeHeap9515.method1354(var1 * 4, true);
      this.aStream10381 = new Stream(this.aNativeHeapBuffer10372);
   }

   void method9330(int var1, int var2, int var3) {
      this.anIntArray10379[var2 * this.aClass148_Sub3_10376.anInt1711 * 1966165105 + var1] |= 1 << var3;
   }

   void method9331(int[] var1, int var2) {
      int var3 = 0;
      Class526_Sub36_Sub1 var4 = this.aClass174_Sub2_10374.aClass526_Sub36_Sub1_9655;
      var4.pos = 0;
      int var5;
      int var6;
      short[] var7;
      int var8;
      int var9;
      int var10;
      if(this.aClass174_Sub2_10374.aBool9508) {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.aClass148_Sub3_10376.aShortArrayArray9170[var6];
            var8 = this.anIntArray10379[var6];
            if(var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if((var8 & 1 << var9++) != 0) {
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                     var4.writeShort(var7[var10++] & '\uffff', -805078716);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      } else {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.aClass148_Sub3_10376.aShortArrayArray9170[var6];
            var8 = this.anIntArray10379[var6];
            if(var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if((var8 & 1 << var9++) != 0) {
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                     var4.method9610(var7[var10++] & '\uffff', (byte)0);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      }

      if(var3 > 0) {
         this.aClass138_Sub1_10378.method138(5123, var4.buffer, var4.pos * 301018015);
         this.aClass174_Sub2_10374.method8634(this.aClass148_Sub3_10376.aClass129_9180, this.aClass148_Sub3_10376.aClass129_9183, this.aClass129_10377, this.aClass148_Sub3_10376.aClass129_9186);
         this.aClass174_Sub2_10374.method8697(this.anInt10380, (this.aClass148_Sub3_10376.anInt9167 & 7) != 0, (this.aClass148_Sub3_10376.anInt9167 & 8) != 0);
         if(this.aClass174_Sub2_10374.aBool9601) {
            this.aClass174_Sub2_10374.method2353(Integer.MAX_VALUE, this.aClass172_10373);
         }

         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(1.0F / this.aFloat10375, 1.0F / this.aFloat10375, 1.0F);
         OpenGL.glMatrixMode(5888);
         this.aClass174_Sub2_10374.method8634(this.aClass148_Sub3_10376.aClass129_9180, this.aClass148_Sub3_10376.aClass129_9183, this.aClass129_10377, this.aClass148_Sub3_10376.aClass129_9186);
         this.aClass174_Sub2_10374.method8664(this.aClass138_Sub1_10378, 4, 0, var3);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      }

   }

   void method9332(int var1, int var2, int var3) {
      this.anIntArray10379[var2 * this.aClass148_Sub3_10376.anInt1711 * 1966165105 + var1] |= 1 << var3;
   }

   void method9333(int var1) {
      this.aStream10381.method1252();
      Interface15 var2 = this.aClass174_Sub2_10374.method8631(4, this.aNativeHeapBuffer10372, var1 * 4, false);
      if(var2 instanceof Class135_Sub1) {
         this.aNativeHeapBuffer10372.method1228();
      }

      this.aClass129_10377 = new Class129(var2, 5121, 4, 0);
      this.aNativeHeapBuffer10372 = null;
      this.aStream10381 = null;
   }

   void method9334(int var1) {
      this.aNativeHeapBuffer10372 = this.aClass174_Sub2_10374.aNativeHeap9515.method1354(var1 * 4, true);
      this.aStream10381 = new Stream(this.aNativeHeapBuffer10372);
   }

   void method9335(int var1) {
      this.aStream10381.method1248(var1 * 4 + 3);
      this.aStream10381.method1249(-1);
   }

   void method9336(int var1) {
      this.aStream10381.method1252();
      Interface15 var2 = this.aClass174_Sub2_10374.method8631(4, this.aNativeHeapBuffer10372, var1 * 4, false);
      if(var2 instanceof Class135_Sub1) {
         this.aNativeHeapBuffer10372.method1228();
      }

      this.aClass129_10377 = new Class129(var2, 5121, 4, 0);
      this.aNativeHeapBuffer10372 = null;
      this.aStream10381 = null;
   }
}
