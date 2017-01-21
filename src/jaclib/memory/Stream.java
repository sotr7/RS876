package jaclib.memory;

import jaclib.memory.Buffer;

public final class Stream {
   private byte[] aByteArray1144;
   private Buffer aBuffer1140;
   private int anInt1142;
   private int anInt1141;
   private int anInt1143;
   private static boolean aBool1145 = getLSB(-65536) == -1;

   public Stream() {
      this(4096);
   }

   private Stream(int var1) {
      this.aByteArray1144 = new byte[var1];
   }

   public Stream(Buffer var1) {
      this(var1, 0, var1.method1());
   }

   private Stream(Buffer var1, int var2, int var3) {
      this(var1.method1() < 4096?var1.method1():4096);
      this.method1246(var1, var2, var3);
   }

   private void method1246(Buffer var1, int var2, int var3) {
      this.method1252();
      this.aBuffer1140 = var1;
      this.anInt1142 = -243908149 * var2;
      this.anInt1141 = 474868213 * (var3 + var2);
      if(this.anInt1141 * 1293859421 > var1.method1()) {
         throw new RuntimeException();
      }
   }

   public int method1247() {
      return 640801763 * this.anInt1142 + this.anInt1143 * 1381890691;
   }

   public void method1248(int var1) {
      this.method1252();
      this.anInt1142 = var1 * -243908149;
   }

   public void method1249(int var1) {
      if(1381890691 * this.anInt1143 >= this.aByteArray1144.length) {
         this.method1252();
      }

      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)var1;
   }

   public void method1250(float var1) {
      if(1381890691 * this.anInt1143 + 3 >= this.aByteArray1144.length) {
         this.method1252();
      }

      int var2 = floatToRawIntBits(var1);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 24);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 16);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 8);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)var2;
   }

   public void method1251(float var1) {
      if(3 + this.anInt1143 * 1381890691 >= this.aByteArray1144.length) {
         this.method1252();
      }

      int var2 = floatToRawIntBits(var1);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)var2;
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 8);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 16);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 24);
   }

   public void method1252() {
      if(this.anInt1143 * 1381890691 > 0) {
         if(this.anInt1143 * 1381890691 + 640801763 * this.anInt1142 > 1293859421 * this.anInt1141) {
            throw new RuntimeException();
         }

         this.aBuffer1140.method3(this.aByteArray1144, 0, 640801763 * this.anInt1142, 1381890691 * this.anInt1143);
         this.anInt1142 += -125638431 * this.anInt1143;
         this.anInt1143 = 0;
      }

   }

   public static final boolean method1253() {
      return aBool1145;
   }

   public static native int floatToRawIntBits(float var0);

   private static final native byte getLSB(int var0);

   public int method1254() {
      return 640801763 * this.anInt1142 + this.anInt1143 * 1381890691;
   }

   public int method1255() {
      return 640801763 * this.anInt1142 + this.anInt1143 * 1381890691;
   }

   public void method1256(int var1) {
      this.method1252();
      this.anInt1142 = var1 * -243908149;
   }

   public void method1257(int var1) {
      this.method1252();
      this.anInt1142 = var1 * -243908149;
   }

   public void method1258(int var1) {
      if(1381890691 * this.anInt1143 >= this.aByteArray1144.length) {
         this.method1252();
      }

      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)var1;
   }

   public void method1259(float var1) {
      if(3 + this.anInt1143 * 1381890691 >= this.aByteArray1144.length) {
         this.method1252();
      }

      int var2 = floatToRawIntBits(var1);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)var2;
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 8);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 16);
      this.aByteArray1144[(this.anInt1143 += 308913195) * 1381890691 - 1] = (byte)(var2 >> 24);
   }
}
