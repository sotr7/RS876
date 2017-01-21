package com.jagex;

import com.jagex.Class446;
import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub3;
import com.jagex.RSByteBuffer;
import com.jagex.Interface10;

public class Class526_Sub32 extends Class526 implements Interface10 {
   static int anInt10596;
   public int anInt10598;
   public int anInt10599;
   public int anInt10597;
   public int anInt10600;
   static Class526_Sub32[] aClass526_Sub32Array10595 = new Class526_Sub32[0];

   void method9584(Class526_Sub32 var1, byte var2) {
      this.anInt10598 = 1 * var1.anInt10598;
      this.anInt10599 = var1.anInt10599 * 1;
      this.anInt10597 = var1.anInt10597 * 1;
      this.anInt10600 = var1.anInt10600 * 1;
   }

   public Class526_Sub32(int var1, int var2, int var3, int var4) {
      this.anInt10598 = var1 * -215261577;
      this.anInt10599 = -1304809903 * var2;
      this.anInt10597 = -2016339049 * var3;
      this.anInt10600 = var4 * -255916441;
   }

   Class526_Sub32(Class526_Sub32 var1) {
      this.anInt10598 = var1.anInt10598 * 1;
      this.anInt10599 = 1 * var1.anInt10599;
      this.anInt10597 = var1.anInt10597 * 1;
      this.anInt10600 = var1.anInt10600 * 1;
   }

   Class526_Sub32(int var1, boolean var2) {
      if(var1 == -1) {
         this.anInt10598 = 215261577;
      } else {
         this.anInt10598 = (var1 >> 28 & 3) * -215261577;
         this.anInt10599 = ((var1 >> 14 & 16383) << 9) * -1304809903;
         this.anInt10597 = 0;
         this.anInt10600 = ((var1 & 16383) << 9) * -255916441;
         if(var2) {
            this.anInt10599 += 976113920;
            this.anInt10600 += -1090099456;
         }
      }

   }

   void method9585(int var1, int var2, int var3, int var4, int var5) {
      this.anInt10598 = var1 * -215261577;
      this.anInt10599 = var2 * -1304809903;
      this.anInt10597 = var3 * -2016339049;
      this.anInt10600 = var4 * -255916441;
   }

   static int method9586() {
      return 13;
   }

   void method9587(int var1, boolean var2, byte var3) {
      if(-1 == var1) {
         this.anInt10598 = 215261577;
      } else {
         this.anInt10598 = -215261577 * (var1 >> 28 & 3);
         this.anInt10599 = -1304809903 * ((var1 >> 14 & 16383) << 9);
         this.anInt10597 = 0;
         this.anInt10600 = ((var1 & 16383) << 9) * -255916441;
         if(var2) {
            this.anInt10599 += 976113920;
            this.anInt10600 += -1090099456;
         }
      }

   }

   public Class446 method9588(int var1) {
      return new Class446((float)(-1228547407 * this.anInt10599), (float)(this.anInt10597 * -1299508185), (float)(this.anInt10600 * 524465495));
   }

   void method9589(RSByteBuffer var1, byte var2) {
      var1.writeByte(-1855988921 * this.anInt10598, 1326120815);
      var1.writeInt(this.anInt10599 * -1228547407, -357564953);
      var1.writeInt(this.anInt10597 * -1299508185, -357564953);
      var1.writeInt(this.anInt10600 * 524465495, -357564953);
   }

   public int method21() {
      return Class526_Sub21_Sub3.method10427(1454729566);
   }

   public int method56(int var1) {
      return Class526_Sub21_Sub3.method10427(1172623301);
   }

   public void method69(RSByteBuffer var1, byte var2) {
      this.method9589(var1, (byte)-64);
   }

   public void method65(RSByteBuffer var1, int var2) {
      this.anInt10598 = var1.readUnsignedByte(-2033373460) * -215261577;
      this.anInt10599 = var1.readInt((byte)5) * -1304809903;
      this.anInt10597 = var1.readInt((byte)5) * -2016339049;
      this.anInt10600 = var1.readInt((byte)5) * -255916441;
   }

   public String method9590() {
      return "Level: " + this.anInt10598 * -1855988921 + " Coord: " + -1228547407 * this.anInt10599 + "," + this.anInt10597 * -1299508185 + "," + this.anInt10600 * 524465495 + " Coord Split: " + (-1228547407 * this.anInt10599 >> 15) + "," + (524465495 * this.anInt10600 >> 15) + "," + (-1228547407 * this.anInt10599 >> 9 & 63) + "," + (this.anInt10600 * 524465495 >> 9 & 63) + "," + (this.anInt10599 * -1228547407 & 511) + "," + (524465495 * this.anInt10600 & 511);
   }

   static int method9591() {
      return 13;
   }

   public void method74(RSByteBuffer var1) {
      this.anInt10598 = var1.readUnsignedByte(-887514769) * -215261577;
      this.anInt10599 = var1.readInt((byte)5) * -1304809903;
      this.anInt10597 = var1.readInt((byte)5) * -2016339049;
      this.anInt10600 = var1.readInt((byte)5) * -255916441;
   }

   public Class526_Sub32(RSByteBuffer var1) {
      this.method65(var1, -570697853);
   }

   public void method67(RSByteBuffer var1) {
      this.anInt10598 = var1.readUnsignedByte(32612761) * -215261577;
      this.anInt10599 = var1.readInt((byte)5) * -1304809903;
      this.anInt10597 = var1.readInt((byte)5) * -2016339049;
      this.anInt10600 = var1.readInt((byte)5) * -255916441;
   }

   public String toString() {
      return "Level: " + this.anInt10598 * -1855988921 + " Coord: " + -1228547407 * this.anInt10599 + "," + this.anInt10597 * -1299508185 + "," + this.anInt10600 * 524465495 + " Coord Split: " + (-1228547407 * this.anInt10599 >> 15) + "," + (524465495 * this.anInt10600 >> 15) + "," + (-1228547407 * this.anInt10599 >> 9 & 63) + "," + (this.anInt10600 * 524465495 >> 9 & 63) + "," + (this.anInt10599 * -1228547407 & 511) + "," + (524465495 * this.anInt10600 & 511);
   }

   public void method71(RSByteBuffer var1) {
      this.method9589(var1, (byte)-101);
   }

   public Class526_Sub32() {
      this.anInt10598 = 215261577;
   }

   public void method68(RSByteBuffer var1) {
      this.method9589(var1, (byte)-103);
   }

   public void method70(RSByteBuffer var1) {
      this.method9589(var1, (byte)-57);
   }

   public void method72(RSByteBuffer var1) {
      this.anInt10598 = var1.readUnsignedByte(1486635932) * -215261577;
      this.anInt10599 = var1.readInt((byte)5) * -1304809903;
      this.anInt10597 = var1.readInt((byte)5) * -2016339049;
      this.anInt10600 = var1.readInt((byte)5) * -255916441;
   }

   public void method73(RSByteBuffer var1) {
      this.anInt10598 = var1.readUnsignedByte(1352290415) * -215261577;
      this.anInt10599 = var1.readInt((byte)5) * -1304809903;
      this.anInt10597 = var1.readInt((byte)5) * -2016339049;
      this.anInt10600 = var1.readInt((byte)5) * -255916441;
   }

   public void method66(RSByteBuffer var1) {
      this.method9589(var1, (byte)-73);
   }

   public static long method9592(CharSequence var0, int var1) {
      int var2 = var0.length();
      long var3 = 0L;

      for(int var5 = 0; var5 < var2; ++var5) {
         var3 = (var3 << 5) - var3 + (long)var0.charAt(var5);
      }

      return var3;
   }
}
