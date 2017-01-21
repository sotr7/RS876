package com.jagex;

import com.jagex.Class104;
import com.jagex.Class143;
import com.jagex.Class143_Sub1;
import com.jagex.Class242;
import com.jagex.Class488;
import com.jagex.Class506;
import com.jagex.Class512;
import com.jagex.Class526;
import com.jagex.client;
import java.io.File;
import java.io.RandomAccessFile;

public final class Class526_Sub24 extends Class526 {
   public static final int anInt10539 = 64;
   public static final int anInt10540 = 2;
   public static final int anInt10541 = 4;
   public static final int anInt10542 = 8;
   public static final int anInt10543 = 16;
   public static final int anInt10544 = 32;
   public static final int anInt10546 = 1;
   public static int anInt10549;
   static Class526_Sub24 aClass526_Sub24_10545 = new Class526_Sub24(0, -1);
   public int anInt10547;
   public int anInt10548;

   public final boolean method9458(int var1) {
      return (this.anInt10547 * -798296491 >> 23 & 1) != 0;
   }

   public final boolean method9459() {
      return (this.anInt10547 * -798296491 >> 23 & 1) != 0;
   }

   public final boolean method9460(int var1, int var2) {
      return 0 != (-798296491 * this.anInt10547 >> var1 + 1 & 1);
   }

   public final int method9461(byte var1) {
      return Class488.method5869(this.anInt10547 * -798296491, -1115378221);
   }

   public final int method9462(int var1) {
      return -798296491 * this.anInt10547 >> 18 & 7;
   }

   public final boolean method9463(byte var1) {
      return (-798296491 * this.anInt10547 >> 21 & 1) != 0;
   }

   public final boolean method9464(int var1) {
      return 0 != (-798296491 * this.anInt10547 >> 22 & 1);
   }

   public final boolean method9465() {
      return 0 != (-798296491 * this.anInt10547 >> 22 & 1);
   }

   public final boolean method9466() {
      return (-798296491 * this.anInt10547 >> 21 & 1) != 0;
   }

   public final boolean method9467(int var1) {
      return 0 != (-798296491 * this.anInt10547 >> var1 + 1 & 1);
   }

   public final boolean method9468(int var1) {
      return 0 != (-798296491 * this.anInt10547 >> var1 + 1 & 1);
   }

   static final int method9469(int var0) {
      return var0 >> 11 & 127;
   }

   static final int method9470(int var0) {
      return var0 >> 11 & 127;
   }

   public final int method9471() {
      return -798296491 * this.anInt10547 >> 18 & 7;
   }

   static final int method9472(int var0) {
      return var0 >> 11 & 127;
   }

   public final boolean method9473() {
      return (this.anInt10547 * -798296491 & 1) != 0;
   }

   public Class526_Sub24(int var1, int var2) {
      this.anInt10547 = -1620945155 * var1;
      this.anInt10548 = var2 * 764408633;
   }

   public final boolean method9474(int var1) {
      return (this.anInt10547 * -798296491 & 1) != 0;
   }

   static final int method9475(int var0) {
      return var0 >> 11 & 127;
   }

   static final int method9476(int var0) {
      return var0 >> 11 & 127;
   }

   public final boolean method9477() {
      return 0 != (-798296491 * this.anInt10547 >> 22 & 1);
   }

   public final boolean method9478() {
      return 0 != (-798296491 * this.anInt10547 >> 22 & 1);
   }

   public final int method9479() {
      return -798296491 * this.anInt10547 >> 18 & 7;
   }

   public final boolean method9480() {
      return (this.anInt10547 * -798296491 >> 23 & 1) != 0;
   }

   public static File method9481(String var0, int var1) {
      if(!Class512.aBool7017) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)Class512.aHashtable7019.get(var0);
         if(null != var2) {
            return var2;
         } else {
            File var3 = new File(Class512.aFile7018, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if(!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  Class512.aHashtable7019.put(var0, var3);
                  return var3;
               }
            } catch (Exception var8) {
               try {
                  if(var4 != null) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   static final void method9482(int var0, byte var1) {
      Class104.method1315((byte)0);
      int var2 = ((Class143_Sub1)Class506.aClass97_Sub1_Sub1_5698.method89(var0, 352886342)).anInt8915 * -311757671;
      if(0 != var2) {
         int var3 = Class242.aClass94_2456.method114((Class143)Class506.aClass97_Sub1_Sub1_5698.method89(var0, 93335606), -1193293358);
         if(var2 == 5) {
            client.anInt11176 = var3 * 477899117;
         }

         if(var2 == 6) {
            client.anInt11188 = var3 * -401127451;
         }

      }
   }
}
