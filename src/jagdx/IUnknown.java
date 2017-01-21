package jagdx;

public class IUnknown {
   IUnknown() throws Throwable {
      throw new Error();
   }

   public static native int AddRef(long var0);

   public static native int Release(long var0);
}
