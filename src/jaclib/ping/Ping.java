package jaclib.ping;

public class Ping {
   private Ping() throws Throwable {
      throw new Error();
   }

   public static native boolean init();

   public static int method579(byte var0, byte var1, byte var2, byte var3, long var4) throws Throwable {
      int var6 = ping0(var0, var1, var2, var3, var4);
      if(var6 < 0) {
         throw new Exception(String.valueOf(var6));
      } else {
         return var6;
      }
   }

   private static native int ping0(byte var0, byte var1, byte var2, byte var3, long var4);

   public static native void quit();
}
