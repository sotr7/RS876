package jagdx;

import jagdx.IUnknown;

public class IDirect3DEventQuery extends IUnknown {
   private IDirect3DEventQuery() throws Throwable {
      throw new Error();
   }

   public static native int Issue(long var0);

   public static native int IsSignaled(long var0);
}
