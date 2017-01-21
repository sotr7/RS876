package jaclib.ping;

public abstract class IcmpService implements Runnable {
   protected abstract void notify(int var1);

   protected abstract void notify(int var1, int var2, int var3);

   public native void run();

   public native void quit();

   public static native boolean available();

   public native void c();

   public native void r();

   protected abstract void method1235(int var1);

   protected abstract void method1236(int var1);

   protected abstract void method1237(int var1);

   protected abstract void method1238(int var1, int var2, int var3);

   protected abstract void method1239(int var1, int var2, int var3);
}
