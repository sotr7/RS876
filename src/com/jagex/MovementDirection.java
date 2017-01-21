package com.jagex;

import com.jagex.Class681;
import com.jagex.Interface76;
import com.jagex.client;

public class MovementDirection implements Interface76 {
   public static final int anInt8656 = 4;
   public int anInt8655;
   public byte id;
   public static MovementDirection aClass683_8651 = new MovementDirection(0, (byte)-1);
   public static MovementDirection TELEPORTING = new MovementDirection(1, (byte)0);
   public static MovementDirection WALKING = new MovementDirection(2, (byte)1);
   public static MovementDirection RUNNING = new MovementDirection(3, (byte)2);
   public static MovementDirection aClass683_8650 = new MovementDirection(4, (byte)3);

   public static MovementDirection[] method8035(int var0) {
      return new MovementDirection[]{aClass683_8651, TELEPORTING, WALKING, RUNNING, aClass683_8650};
   }

   MovementDirection(int var1, byte var2) {
      this.anInt8655 = var1 * 2018192479;
      this.id = var2;
   }

   public int getId() {
      return this.id;
   }

   public int method21() {
      return this.id;
   }

   public int method8036(byte var1) {
      return this.id + 1;
   }

   public int method8037() {
      return this.id + 1;
   }

   static final void method8038(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      client.aShort11274 = (short)var0.anIntArray8622[var0.anInt8623 * -1730576285];
      if(client.aShort11274 <= 0) {
         client.aShort11274 = 256;
      }

      client.aShort11275 = (short)var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      if(client.aShort11275 <= 0) {
         client.aShort11275 = 205;
      }

   }
}
