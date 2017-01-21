package jaclib.memory.heap;

import jaclib.memory.heap.NativeHeapBuffer;

public final class NativeHeap {
   long peer;
   private int anInt1320;
   private boolean aBool1321;

   public NativeHeap(int var1) {
      this.anInt1320 = var1 * -1390444387;
      this.allocateHeap(this.anInt1320 * -1327299147);
      this.aBool1321 = true;
   }

   synchronized boolean method1353() {
      return this.aBool1321;
   }

   public NativeHeapBuffer method1354(int var1, boolean var2) {
      if(!this.aBool1321) {
         throw new IllegalStateException();
      } else {
         return new NativeHeapBuffer(this, this.allocateBuffer(var1, var2), var1);
      }
   }

   public synchronized void method1355() {
      if(this.aBool1321) {
         this.deallocateHeap();
      }

      this.aBool1321 = false;
   }

   private native void allocateHeap(int var1);

   private native void deallocateHeap();

   synchronized native int allocateBuffer(int var1, boolean var2);

   synchronized native long getBufferAddress(int var1);

   synchronized native void get(int var1, byte[] var2, int var3, int var4, int var5);

   synchronized native void put(int var1, byte[] var2, int var3, int var4, int var5);

   synchronized native void deallocateBuffer(int var1);

   public synchronized native void copy(long var1, long var3, int var5);

   protected synchronized void finalize() throws Throwable {
      super.finalize();
      this.method1355();
   }

   protected synchronized void method1356() throws Throwable {
      super.finalize();
      this.method1355();
   }

   protected synchronized void method1357() throws Throwable {
      super.finalize();
      this.method1355();
   }

   public synchronized void method1358() {
      if(this.aBool1321) {
         this.deallocateHeap();
      }

      this.aBool1321 = false;
   }
}
