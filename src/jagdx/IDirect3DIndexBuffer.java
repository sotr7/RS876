package jagdx;

import jagdx.IUnknown;

public class IDirect3DIndexBuffer extends IUnknown {
   private IDirect3DIndexBuffer() throws Throwable {
      throw new Error();
   }

   public static native long Lock(long var0, int var2, int var3, int var4);

   public static native void Unlock(long var0);

   public static native int Upload(long var0, int var2, int var3, int var4, long var5);

   public static native int Download(long var0, int var2, int var3, int var4, long var5);
}
