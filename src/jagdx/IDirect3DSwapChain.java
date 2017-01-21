package jagdx;

import jagdx.IUnknown;

public class IDirect3DSwapChain extends IUnknown {
   private IDirect3DSwapChain() throws Throwable {
      throw new Error();
   }

   public static native long GetBackBuffer(long var0, int var2, int var3);

   public static native int Present(long var0, int var2);
}
