package com.jagex;

import com.jagex.Class264;
import com.jagex.Class329_Sub3_Sub1;
import com.jagex.RSByteBuffer;
import com.jagex.Connection;
import com.jagex.Class681;
import com.jagex.Interface12;
import com.jagex.Interface5;

public class Class202 implements Interface12, Interface5 {
   static String aString2212;
   static Connection aClass560_2213;
   public boolean[] aBoolArray2211;

   void method2880(RSByteBuffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 2) {
         this.aBoolArray2211 = new boolean[400];
         var3 = var1.readSmart(-634755195);

         for(var4 = 0; var4 < var3; ++var4) {
            this.aBoolArray2211[var1.readSmart(-1018788327)] = true;
         }
      } else if(var2 == 3) {
         var1.readUnsignedByte(1381641099);
         var3 = var1.readSmart(-686062766);

         for(var4 = 0; var4 < var3; ++var4) {
            var1.readSmart(-704130306);
            var1.readUnsignedByte(-686070742);
         }
      }

   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1043349641);
         if(var3 == 0) {
            return;
         }

         this.method2881(var1, var3, (byte)25);
      }
   }

   void method2881(RSByteBuffer var1, int var2, byte var3) {
      int var4;
      int var5;
      if(var2 == 2) {
         this.aBoolArray2211 = new boolean[400];
         var4 = var1.readSmart(-528509583);

         for(var5 = 0; var5 < var4; ++var5) {
            this.aBoolArray2211[var1.readSmart(-1691735943)] = true;
         }
      } else if(var2 == 3) {
         var1.readUnsignedByte(-73513974);
         var4 = var1.readSmart(-1916141843);

         for(var5 = 0; var5 < var4; ++var5) {
            var1.readSmart(-1685234155);
            var1.readUnsignedByte(-1417180120);
         }
      }

   }

   public void method51(int var1) {
   }

   public void method49(int var1, int var2) {
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1786529425);
         if(var2 == 0) {
            return;
         }

         this.method2881(var1, var2, (byte)23);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(555183806);
         if(var2 == 0) {
            return;
         }

         this.method2881(var1, var2, (byte)-48);
      }
   }

   public void method85() {
   }

   public void method81(int var1) {
   }

   public void method50(int var1) {
   }

   void method2882(RSByteBuffer var1, int var2) {
      int var3;
      int var4;
      if(var2 == 2) {
         this.aBoolArray2211 = new boolean[400];
         var3 = var1.readSmart(-877559993);

         for(var4 = 0; var4 < var3; ++var4) {
            this.aBoolArray2211[var1.readSmart(-1784602746)] = true;
         }
      } else if(var2 == 3) {
         var1.readUnsignedByte(-2018337314);
         var3 = var1.readSmart(-1842464005);

         for(var4 = 0; var4 < var3; ++var4) {
            var1.readSmart(-501340725);
            var1.readUnsignedByte(-883608522);
         }
      }

   }

   static final void method2883(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      long var3 = Class264.method3549((byte)2);
      if(0L == var3) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 5;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class329_Sub3_Sub1.method10492(var3, var2, 1738067432);
      }
   }

   static final void method2884(Class681 var0, int var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var0.aClass526_Sub9_8646.aString10403;
   }
}
