package jagdx;

public class D3DLIGHT {
   private D3DLIGHT() throws Throwable {
      throw new Error();
   }

   public static native long Create();

   public static native void Destroy(long var0);

   public static native void SetType(long var0, int var2);

   public static native void SetAmbient(long var0, float var2, float var3, float var4, float var5);

   public static native void SetSpecular(long var0, float var2, float var3, float var4, float var5);

   public static native void SetDiffuse(long var0, float var2, float var3, float var4, float var5);

   public static native void SetPosition(long var0, float var2, float var3, float var4);

   public static native void SetDirection(long var0, float var2, float var3, float var4);

   public static native void SetAttenuation(long var0, float var2, float var3, float var4);

   public static native void SetSpotParams(long var0, float var2, float var3, float var4);

   public static native void SetRange(long var0, float var2);
}
