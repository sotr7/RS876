package jagdx;

import jagdx.IDirect3DBaseTexture;

public class IDirect3DTexture extends IDirect3DBaseTexture {
   private IDirect3DTexture() throws Throwable {
      throw new Error();
   }

   public static native long GetSurfaceLevel(long var0, int var2);

   public static native int Upload(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

   public static native int Download(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);
}
