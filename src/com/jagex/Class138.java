package com.jagex;

import com.jagex.Class174_Sub2;
import jaclib.memory.Buffer;

public class Class138 {
   Buffer aBuffer1658;
   Class174_Sub2 aClass174_Sub2_1657;

   void method1641(byte[] var1, int var2) {
      if(this.aBuffer1658 == null || this.aBuffer1658.method1() < var2) {
         this.aBuffer1658 = this.aClass174_Sub2_1657.aNativeHeap9515.method1354(var2, false);
      }

      this.aBuffer1658.method3(var1, 0, 0, var2);
   }

   Class138(Class174_Sub2 var1, Buffer var2) {
      this.aClass174_Sub2_1657 = var1;
      this.aBuffer1658 = var2;
   }

   Class138(Class174_Sub2 var1, byte[] var2, int var3) {
      this.aClass174_Sub2_1657 = var1;
      this.aBuffer1658 = this.aClass174_Sub2_1657.aNativeHeap9515.method1354(var3, false);
      if(var2 != null) {
         this.aBuffer1658.method3(var2, 0, 0, var3);
      }

   }

   void method1642(byte[] var1, int var2) {
      if(this.aBuffer1658 == null || this.aBuffer1658.method1() < var2) {
         this.aBuffer1658 = this.aClass174_Sub2_1657.aNativeHeap9515.method1354(var2, false);
      }

      this.aBuffer1658.method3(var1, 0, 0, var2);
   }
}
