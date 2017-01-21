package jagdx;

import jagdx.D3DSURFACE_DESC;
import jagdx.IUnknown;

public class IDirect3DSurface extends IUnknown {
   private IDirect3DSurface() throws Throwable {
      throw new Error();
   }

   public static native int Upload(long var0, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

   public static native int Download(long var0, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

   public static native int GetDesc(long var0, D3DSURFACE_DESC var2);
}
