package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeap;

public final class NativeHeapBuffer implements Buffer, Source {
   private boolean aBool1117 = true;
   public NativeHeap aNativeHeap1115;
   private int anInt1116;
   private int anInt1114;

   NativeHeapBuffer(NativeHeap var1, int var2, int var3) {
      this.aNativeHeap1115 = var1;
      this.anInt1116 = var2 * -1280480885;
      this.anInt1114 = var3 * 2124559587;
   }

   private final synchronized boolean method1227() {
      return this.aNativeHeap1115.method1353() && this.aBool1117;
   }

   public final long method2() {
      return this.aNativeHeap1115.getBufferAddress(696120867 * this.anInt1116);
   }

   public final int method1() {
      return 1043116235 * this.anInt1114;
   }

   public final synchronized void method3(byte[] var1, int var2, int var3, int var4) {
      if(!this.method1227() | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.anInt1114 * 1043116235) {
         throw new RuntimeException();
      } else {
         this.aNativeHeap1115.put(696120867 * this.anInt1116, var1, var2, var3, var4);
      }
   }

   public final synchronized void method1228() {
      if(this.method1227()) {
         this.aNativeHeap1115.deallocateBuffer(696120867 * this.anInt1116);
      }

      this.aBool1117 = false;
   }

   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method1228();
   }

   public final synchronized void method4(byte[] var1, int var2, int var3, int var4) {
      if(!this.method1227() | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.anInt1114 * 1043116235) {
         throw new RuntimeException();
      } else {
         this.aNativeHeap1115.put(696120867 * this.anInt1116, var1, var2, var3, var4);
      }
   }

   public final synchronized void method5(byte[] var1, int var2, int var3, int var4) {
      if(!this.method1227() | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.anInt1114 * 1043116235) {
         throw new RuntimeException();
      } else {
         this.aNativeHeap1115.put(696120867 * this.anInt1116, var1, var2, var3, var4);
      }
   }

   public final synchronized void method6(byte[] var1, int var2, int var3, int var4) {
      if(!this.method1227() | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.anInt1114 * 1043116235) {
         throw new RuntimeException();
      } else {
         this.aNativeHeap1115.put(696120867 * this.anInt1116, var1, var2, var3, var4);
      }
   }

   public final synchronized void method7(byte[] var1, int var2, int var3, int var4) {
      if(!this.method1227() | var1 == null | var2 < 0 | var2 + var4 > var1.length | var3 < 0 | var4 + var3 > this.anInt1114 * 1043116235) {
         throw new RuntimeException();
      } else {
         this.aNativeHeap1115.put(696120867 * this.anInt1116, var1, var2, var3, var4);
      }
   }

   protected final synchronized void method1229() throws Throwable {
      super.finalize();
      this.method1228();
   }

   protected final synchronized void method1230() throws Throwable {
      super.finalize();
      this.method1228();
   }

   public final int method8() {
      return 1043116235 * this.anInt1114;
   }

   public final int method9() {
      return 1043116235 * this.anInt1114;
   }

   public final long method10() {
      return this.aNativeHeap1115.getBufferAddress(696120867 * this.anInt1116);
   }

   public final long method11() {
      return this.aNativeHeap1115.getBufferAddress(696120867 * this.anInt1116);
   }

   private final synchronized boolean method1231() {
      return this.aNativeHeap1115.method1353() && this.aBool1117;
   }

   private final synchronized boolean method1232() {
      return this.aNativeHeap1115.method1353() && this.aBool1117;
   }

   public final synchronized void method1233() {
      if(this.method1227()) {
         this.aNativeHeap1115.deallocateBuffer(696120867 * this.anInt1116);
      }

      this.aBool1117 = false;
   }

   public final synchronized void method1234() {
      if(this.method1227()) {
         this.aNativeHeap1115.deallocateBuffer(696120867 * this.anInt1116);
      }

      this.aBool1117 = false;
   }
}
