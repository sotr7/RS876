package com.jagex;

import com.jagex.RSByteBuffer;
import jaclib.memory.Stream;

public class Class526_Sub36_Sub1 extends RSByteBuffer {
   void method10688(float var1) {
      int var2 = Stream.floatToRawIntBits(var1);
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)(var2 >> 24);
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)(var2 >> 16);
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)(var2 >> 8);
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)var2;
   }

   void method10689(float var1) {
      int var2 = Stream.floatToRawIntBits(var1);
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)var2;
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)(var2 >> 8);
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)(var2 >> 16);
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)(var2 >> 24);
   }

   Class526_Sub36_Sub1(int var1) {
      super(var1);
   }
}
