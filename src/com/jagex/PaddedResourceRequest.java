package com.jagex;

import com.jagex.Class526_Sub21_Sub15;
import com.jagex.RSByteBuffer;

public class PaddedResourceRequest extends Class526_Sub21_Sub15 {
   byte padding;
   RSByteBuffer buffer;

   int method10705() {
      return null == this.buffer?0:37030428 * this.buffer.pos / (this.buffer.buffer.length - this.padding);
   }

   byte[] method10704(int var1) {
      if(!this.waiting && this.buffer.pos * 301018015 >= this.buffer.buffer.length - this.padding) {
         return this.buffer.buffer;
      } else {
         throw new RuntimeException();
      }
   }

   int method10703(int var1) {
      return null == this.buffer?0:37030428 * this.buffer.pos / (this.buffer.buffer.length - this.padding);
   }

   byte[] method10706() {
      if(!this.waiting && this.buffer.pos * 301018015 >= this.buffer.buffer.length - this.padding) {
         return this.buffer.buffer;
      } else {
         throw new RuntimeException();
      }
   }

   int method10708() {
      return null == this.buffer?0:37030428 * this.buffer.pos / (this.buffer.buffer.length - this.padding);
   }

   byte[] method10707() {
      if(!this.waiting && this.buffer.pos * 301018015 >= this.buffer.buffer.length - this.padding) {
         return this.buffer.buffer;
      } else {
         throw new RuntimeException();
      }
   }
}
