package com.jagex;

import com.jagex.Class115;
import com.jagex.Class16;
import com.jagex.OutFrame;
import com.jagex.Class44;
import com.jagex.Class497;
import com.jagex.OutFrameBuffer;
import com.jagex.Class551;
import com.jagex.Class57;
import com.jagex.Class570;
import com.jagex.Class593;
import com.jagex.Class65;
import com.jagex.Class693;
import com.jagex.Interface65;
import com.jagex.client;

public class Class569 implements Interface65 {
   Class65 aClass65_7620;
   String aString7618;
   int anInt7617;
   String aString7619;

   Class569(Class65 var1, String var2, int var3, Throwable var4) {
      this.aClass65_7620 = var1;
      this.aString7618 = var2;
      this.anInt7617 = -814906311 * var3;
      this.aString7619 = null != var4?var4.getMessage():null;
   }

   public void method228(int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4278, client.aClass111_11060.aClass14_1342, 922509735);
      int var3 = (var2.out.pos += 801976415) * 301018015;
      var2.out.writeByte(this.aClass65_7620.getId(), 265311761);
      var2.out.method9616(this.aString7618, 1729966041);
      var2.out.writeShort(-618845687 * this.anInt7617, -805078716);
      var2.out.method9616(Class497.aString5563, 2049648924);
      if(this.aString7619 != null) {
         var2.out.writeByte(1, -1281698706);
         String var4 = this.aString7619;
         if(var4.length() > 100) {
            var4 = var4.substring(0, 100);
         }

         var2.out.method9616(var4, 217431706);
      } else {
         var2.out.writeByte(0, 357534536);
      }

      var2.out.method9678(var2.out.pos * 301018015 - var3, (byte)-104);
      client.aClass111_11060.write(var2, (byte)-60);
   }

   public void method298() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4278, client.aClass111_11060.aClass14_1342, 1338235837);
      int var2 = (var1.out.pos += 801976415) * 301018015;
      var1.out.writeByte(this.aClass65_7620.getId(), 621296365);
      var1.out.method9616(this.aString7618, -819942009);
      var1.out.writeShort(-618845687 * this.anInt7617, -805078716);
      var1.out.method9616(Class497.aString5563, -1829412502);
      if(this.aString7619 != null) {
         var1.out.writeByte(1, -407592203);
         String var3 = this.aString7619;
         if(var3.length() > 100) {
            var3 = var3.substring(0, 100);
         }

         var1.out.method9616(var3, 1437524642);
      } else {
         var1.out.writeByte(0, -2093939315);
      }

      var1.out.method9678(var1.out.pos * 301018015 - var2, (byte)-73);
      client.aClass111_11060.write(var1, (byte)12);
   }

   public void method140() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4278, client.aClass111_11060.aClass14_1342, 1036441522);
      int var2 = (var1.out.pos += 801976415) * 301018015;
      var1.out.writeByte(this.aClass65_7620.getId(), 458424021);
      var1.out.method9616(this.aString7618, -593482995);
      var1.out.writeShort(-618845687 * this.anInt7617, -805078716);
      var1.out.method9616(Class497.aString5563, 1063985371);
      if(this.aString7619 != null) {
         var1.out.writeByte(1, -1698193288);
         String var3 = this.aString7619;
         if(var3.length() > 100) {
            var3 = var3.substring(0, 100);
         }

         var1.out.method9616(var3, 940164275);
      } else {
         var1.out.writeByte(0, -2064609648);
      }

      var1.out.method9678(var1.out.pos * 301018015 - var2, (byte)-25);
      client.aClass111_11060.write(var1, (byte)38);
   }

   public static boolean method6838(int var0) {
      return Class570.aBool7644;
   }

   public static void method6839(long[] var0, int[] var1, int var2) {
      Class551.method6643(var0, var1, 0, var0.length - 1, -852643235);
   }

   static boolean method6840(int var0, int var1) {
      return var0 != 9 && 10 != var0 && var0 != 11 && 12 != var0 && var0 != 13 && 1003 != var0?8 == var0:true;
   }

   static void method6841(byte var0) {
      client.aClass111_11059.method1369(2063800598);
      if(Class57.anInt686 * -2014531435 < 2) {
         Class16.aClass6_179.method548((byte)57);
         Class57.anInt683 = 0;
         Class57.anInt686 += 166238909;
         Class57.aClass44_687 = Class44.aClass44_459;
      } else {
         Class57.aClass44_687 = null;
         Class57.aClass693_684 = Class693.aClass693_8714;
         Class593.method7031(16, (byte)7);
      }

   }
}
