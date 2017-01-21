package com.jagex;

import com.jagex.IsaacCipher;
import com.jagex.RSByteBuffer;

public class Buffer extends RSByteBuffer {
   IsaacCipher cipher;
   int bitPos;
   static int[] BIT_MASKS = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

   public void setCipher(IsaacCipher cipher, int var2) {
      this.cipher = cipher;
   }

   public int readOpcode(byte var1) {
      return this.buffer[(this.pos += 801976415) * 301018015 - 1] - this.cipher.peek(-1110506237) & 255;
   }

   public boolean nextIsSmart(int var1) {
      int var2 = this.buffer[301018015 * this.pos] - this.cipher.nextInt((byte)-3) & 255;
      return var2 >= 128;
   }

   public int readBit(int bits, int var2) {
      int index = -597122531 * this.bitPos >> 3;
      int shift = 8 - (-597122531 * this.bitPos & 7);
      int value = 0;

      for(this.bitPos += -320524235 * bits; bits > shift; shift = 8) {
         value += (this.buffer[index++] & BIT_MASKS[shift]) << bits - shift;
         bits -= shift;
      }

      if(shift == bits) {
         value += this.buffer[index] & BIT_MASKS[shift];
      } else {
         value += this.buffer[index] >> shift - bits & BIT_MASKS[bits];
      }

      return value;
   }

   public void readEncrypted(byte[] buffer, int offset, int length, int var4) {
      for(int index = 0; index < length; ++index) {
         buffer[offset + index] = (byte)(this.buffer[(this.pos += 801976415) * 301018015 - 1] - this.cipher.peek(-109469691));
      }
   }

   public void disableBitAccess(int var1) {
      this.bitPos = 1119272792 * this.pos;
   }

   public int available(int var1, byte var2) {
      return 8 * var1 - this.bitPos * -597122531;
   }

   public void writeOpcode(int var1, byte var2) {
      this.buffer[(this.pos += 801976415) * 301018015 - 1] = (byte)(var1 + this.cipher.peek(1874115848));
   }

   public void finishBitAccess(byte var1) {
      this.pos = 801976415 * ((7 + this.bitPos * -597122531) / 8);
   }

   public Buffer(int size) {
      super(size);
   }

	public int readEncryptedSmart(byte var1) {
		int var2 = this.buffer[(this.pos += 801976415) * 301018015 - 1] - this.cipher.peek(1733196044) & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (this.buffer[(this.pos += 801976415) * 301018015 - 1] - this.cipher.peek(-1199039363) & 255);
	}
}
