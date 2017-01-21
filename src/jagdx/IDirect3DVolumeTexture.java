package jagdx;

import jagdx.IDirect3DBaseTexture;

public class IDirect3DVolumeTexture extends IDirect3DBaseTexture {
   private IDirect3DVolumeTexture() throws Throwable {
      throw new Error();
   }

   public static native int Upload(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11);

   public static native int Download(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11);
}
