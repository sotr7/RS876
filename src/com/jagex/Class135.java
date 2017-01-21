package com.jagex;

import com.jagex.Class174_Sub2;
import jaclib.memory.Buffer;
import jaggl.OpenGL;

public abstract class Class135 {
   static final int anInt1642 = 34963;
   static final int anInt1647 = 34962;
   static int[] anIntArray1644 = new int[1];
   boolean aBool1648 = false;
   Class174_Sub2 aClass174_Sub2_1641;
   int anInt1643;
   int anInt1646;
   boolean aBool1649;
   int anInt1645;

   Class135(Class174_Sub2 var1, int var2, Buffer var3, int var4, boolean var5) {
      this.aClass174_Sub2_1641 = var1;
      this.anInt1643 = var2;
      this.anInt1646 = var4;
      this.aBool1649 = var5;
      OpenGL.glGenBuffersARB(1, anIntArray1644, 0);
      this.anInt1645 = anIntArray1644[0];
      this.method1632();
      OpenGL.glBufferDataARBa(var2, this.anInt1646, var3.method2(), this.aBool1649?'\u88e0':'\u88e4');
      this.aClass174_Sub2_1641.anInt9484 += this.anInt1646;
   }

   abstract void method1632();

   abstract void method1633();

   public void finalize() throws Throwable {
      if(!this.aBool1648) {
         this.aClass174_Sub2_1641.method8656(this.anInt1645, this.anInt1646);
         this.aBool1648 = true;
      }

      super.finalize();
   }

   abstract void method1634();

   abstract void method1635();

   void method1636() throws Throwable {
      if(!this.aBool1648) {
         this.aClass174_Sub2_1641.method8656(this.anInt1645, this.anInt1646);
         this.aBool1648 = true;
      }

      super.finalize();
   }

   void method1637(byte[] var1, int var2) {
      this.method1632();
      if(var2 > this.anInt1646) {
         OpenGL.glBufferDataARBub(this.anInt1643, var2, var1, 0, this.aBool1649?'\u88e0':'\u88e4');
         this.aClass174_Sub2_1641.anInt9484 += var2 - this.anInt1646;
         this.anInt1646 = var2;
      } else {
         OpenGL.glBufferSubDataARBub(this.anInt1643, 0, var2, var1, 0);
      }

   }

   void method1638() throws Throwable {
      if(!this.aBool1648) {
         this.aClass174_Sub2_1641.method8656(this.anInt1645, this.anInt1646);
         this.aBool1648 = true;
      }

      super.finalize();
   }

   Class135(Class174_Sub2 var1, int var2, byte[] var3, int var4, boolean var5) {
      this.aClass174_Sub2_1641 = var1;
      this.anInt1643 = var2;
      this.anInt1646 = var4;
      this.aBool1649 = var5;
      OpenGL.glGenBuffersARB(1, anIntArray1644, 0);
      this.anInt1645 = anIntArray1644[0];
      this.method1632();
      OpenGL.glBufferDataARBub(var2, this.anInt1646, var3, 0, this.aBool1649?'\u88e0':'\u88e4');
      this.aClass174_Sub2_1641.anInt9484 += this.anInt1646;
   }
}
