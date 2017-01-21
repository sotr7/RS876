package com.jagex;

import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Interface34;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class Class486 implements Interface34 {
   static final int anInt5493 = 34963;
   static final int anInt5495 = 34962;
   int anInt5497 = -1;
   int anInt5500;
   NativeHeapBuffer aNativeHeapBuffer5501;
   int anInt5499;
   static int[] anIntArray5498 = new int[1];
   Class174_Sub3_Sub2 aClass174_Sub3_Sub2_5494;
   int anInt5492;
   boolean aBool5496;

   long method5843() {
      return this.anInt5497 == 0?this.aNativeHeapBuffer5501.method2():0L;
   }

   void method5844() {
      if(this.anInt5497 < 0) {
         if(this.aClass174_Sub3_Sub2_5494.aBool11518) {
            OpenGL.glGenBuffersARB(1, anIntArray5498, 0);
            this.anInt5497 = anIntArray5498[0];
            OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
         } else {
            this.anInt5497 = 0;
         }

      }
   }

   public int method95() {
      return this.anInt5500;
   }

   public boolean method241(int var1, int var2, long var3) {
      this.method5844();
      if(this.anInt5497 > 0) {
         OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
         OpenGL.glBufferSubDataARBa(this.anInt5492, var1, var2, var3);
      } else {
         this.aNativeHeapBuffer5501.aNativeHeap1115.copy(this.aNativeHeapBuffer5501.method2() + (long)var1, var3, var2);
      }

      return true;
   }

   void method5845() {
      if(this.aClass174_Sub3_Sub2_5494.aBool11518) {
         OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
      }

   }

   void method340(int var1) {
      if(var1 > this.anInt5499) {
         this.method5844();
         if(this.anInt5497 > 0) {
            OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
            OpenGL.glBufferDataARBub(this.anInt5492, var1, (byte[])null, 0, this.aBool5496?'\u88e0':'\u88e4');
            this.aClass174_Sub3_Sub2_5494.anInt9692 += var1 - this.anInt5499;
         } else {
            this.aNativeHeapBuffer5501 = this.aClass174_Sub3_Sub2_5494.method8745(var1, false);
         }

         this.anInt5499 = var1;
      }

      this.anInt5500 = var1;
   }

   public long method236(int var1, int var2) {
      OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
      return OpenGL.glMapBufferARB(this.anInt5492, '\u88b9') + (long)var1;
   }

   public void method234() {
      OpenGL.glUnmapBufferARB(this.anInt5492);
   }

   public boolean method235(int var1, int var2, long var3) {
      this.method5844();
      if(this.anInt5497 > 0) {
         OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
         OpenGL.glBufferSubDataARBa(this.anInt5492, var1, var2, var3);
      } else {
         this.aNativeHeapBuffer5501.aNativeHeap1115.copy(this.aNativeHeapBuffer5501.method2() + (long)var1, var3, var2);
      }

      return true;
   }

   void method140() {
      if(this.anInt5497 > 0) {
         this.aClass174_Sub3_Sub2_5494.method10522(this.anInt5497, this.anInt5500);
         this.anInt5497 = -1;
      }

   }

   public void finalize() throws Throwable {
      this.method140();
      super.finalize();
   }

   public int method243() {
      return this.anInt5500;
   }

   long method5846() {
      return this.anInt5497 == 0?this.aNativeHeapBuffer5501.method2():0L;
   }

   void method5847() throws Throwable {
      this.method140();
      super.finalize();
   }

   public long method238(int var1, int var2) {
      OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
      return OpenGL.glMapBufferARB(this.anInt5492, '\u88b9') + (long)var1;
   }

   public long method239(int var1, int var2) {
      OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
      return OpenGL.glMapBufferARB(this.anInt5492, '\u88b9') + (long)var1;
   }

   public void method240() {
      OpenGL.glUnmapBufferARB(this.anInt5492);
   }

   void method342(int var1) {
      if(var1 > this.anInt5499) {
         this.method5844();
         if(this.anInt5497 > 0) {
            OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
            OpenGL.glBufferDataARBub(this.anInt5492, var1, (byte[])null, 0, this.aBool5496?'\u88e0':'\u88e4');
            this.aClass174_Sub3_Sub2_5494.anInt9692 += var1 - this.anInt5499;
         } else {
            this.aNativeHeapBuffer5501 = this.aClass174_Sub3_Sub2_5494.method8745(var1, false);
         }

         this.anInt5499 = var1;
      }

      this.anInt5500 = var1;
   }

   public int method237() {
      return this.anInt5500;
   }

   public int method244() {
      return this.anInt5500;
   }

   public int method242() {
      return this.anInt5500;
   }

   void method141() {
      if(this.anInt5497 > 0) {
         this.aClass174_Sub3_Sub2_5494.method10522(this.anInt5497, this.anInt5500);
         this.anInt5497 = -1;
      }

   }

   public boolean method245(int var1, int var2, long var3) {
      this.method5844();
      if(this.anInt5497 > 0) {
         OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
         OpenGL.glBufferSubDataARBa(this.anInt5492, var1, var2, var3);
      } else {
         this.aNativeHeapBuffer5501.aNativeHeap1115.copy(this.aNativeHeapBuffer5501.method2() + (long)var1, var3, var2);
      }

      return true;
   }

   Class486(Class174_Sub3_Sub2 var1, int var2, boolean var3) {
      this.aClass174_Sub3_Sub2_5494 = var1;
      this.anInt5492 = var2;
      this.aBool5496 = var3;
   }

   void method5848() throws Throwable {
      this.method140();
      super.finalize();
   }

   long method5849() {
      return this.anInt5497 == 0?this.aNativeHeapBuffer5501.method2():0L;
   }

   void method5850() {
      if(this.anInt5497 < 0) {
         if(this.aClass174_Sub3_Sub2_5494.aBool11518) {
            OpenGL.glGenBuffersARB(1, anIntArray5498, 0);
            this.anInt5497 = anIntArray5498[0];
            OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
         } else {
            this.anInt5497 = 0;
         }

      }
   }

   void method5851() {
      if(this.aClass174_Sub3_Sub2_5494.aBool11518) {
         OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
      }

   }

   void method5852() {
      if(this.aClass174_Sub3_Sub2_5494.aBool11518) {
         OpenGL.glBindBufferARB(this.anInt5492, this.anInt5497);
      }

   }
}
