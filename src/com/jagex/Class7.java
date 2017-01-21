package com.jagex;

import com.jagex.Class115;
import com.jagex.Class388;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;
import com.jagex.Interface12;
import com.jagex.Interface5;
import com.jagex.client;

public class Class7 implements Interface12, Interface5 {
   int anInt37 = 0;
   public int anInt40 = 2092936823;
   public int anInt38 = -392470016;
   public boolean aBool43 = true;
   public boolean aBool36 = true;
   public int anInt42;
   public int anInt39;
   public int anInt44;
   public int anInt41;

   public void method81(int var1) {
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-2030254625);
         if(0 == var3) {
            return;
         }

         this.method552(var1, var3, (byte)-116);
      }
   }

   void method552(RSByteBuffer var1, int var2, byte var3) {
      if(var2 == 1) {
         this.anInt37 = var1.read24BitInt(742041327) * -948433503;
         this.method553(1962350177 * this.anInt37, -1689945652);
      } else if(2 == var2) {
         this.anInt40 = var1.readUnsignedShort(1690637308) * -2092936823;
         if('\uffff' == this.anInt40 * -1086622535) {
            this.anInt40 = 2092936823;
         }
      } else if(var2 == 3) {
         this.anInt38 = (var1.readUnsignedShort(1335602300) << 2) * -1921757775;
      } else if(4 == var2) {
         this.aBool43 = false;
      } else if(5 == var2) {
         this.aBool36 = false;
      }

   }

   void method553(int var1, int var2) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var5 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if(var5 < var3) {
         var9 = var5;
      }

      if(var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if(var5 > var3) {
         var11 = var5;
      }

      if(var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var11 + var9) / 2.0D;
      if(var11 != var9) {
         if(var17 < 0.5D) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if(var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if(var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if(var11 == var5) {
            var13 = 2.0D + (var7 - var3) / (var11 - var9);
         } else if(var7 == var11) {
            var13 = 4.0D + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0D;
      this.anInt42 = (int)(256.0D * var15) * 1864173423;
      this.anInt39 = -1093042531 * (int)(var17 * 256.0D);
      if(this.anInt42 * -657442929 < 0) {
         this.anInt42 = 0;
      } else if(-657442929 * this.anInt42 > 255) {
         this.anInt42 = -1377146991;
      }

      if(this.anInt39 * 1582364597 < 0) {
         this.anInt39 = 0;
      } else if(1582364597 * this.anInt39 > 255) {
         this.anInt39 = 447028835;
      }

      if(var17 > 0.5D) {
         this.anInt44 = (int)(512.0D * (1.0D - var17) * var15) * 1261725213;
      } else {
         this.anInt44 = (int)(var15 * var17 * 512.0D) * 1261725213;
      }

      if(this.anInt44 * 1113295925 < 1) {
         this.anInt44 = 1261725213;
      }

      this.anInt41 = (int)((double)(this.anInt44 * 1113295925) * var13) * 351367885;
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1819205896);
         if(0 == var2) {
            return;
         }

         this.method552(var1, var2, (byte)-89);
      }
   }

   public void method49(int var1, int var2) {
   }

   public void method85() {
   }

   public void method50(int var1) {
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(564148125);
         if(0 == var2) {
            return;
         }

         this.method552(var1, var2, (byte)44);
      }
   }

   public void method51(int var1) {
   }

   void method554(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt37 = var1.read24BitInt(742041327) * -948433503;
         this.method553(1962350177 * this.anInt37, -1510139388);
      } else if(2 == var2) {
         this.anInt40 = var1.readUnsignedShort(439903919) * -2092936823;
         if('\uffff' == this.anInt40 * -1086622535) {
            this.anInt40 = 2092936823;
         }
      } else if(var2 == 3) {
         this.anInt38 = (var1.readUnsignedShort(1689313331) << 2) * -1921757775;
      } else if(4 == var2) {
         this.aBool43 = false;
      } else if(5 == var2) {
         this.aBool36 = false;
      }

   }

   void method555(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt37 = var1.read24BitInt(742041327) * -948433503;
         this.method553(1962350177 * this.anInt37, -648694359);
      } else if(2 == var2) {
         this.anInt40 = var1.readUnsignedShort(1209966528) * -2092936823;
         if('\uffff' == this.anInt40 * -1086622535) {
            this.anInt40 = 2092936823;
         }
      } else if(var2 == 3) {
         this.anInt38 = (var1.readUnsignedShort(1631362670) << 2) * -1921757775;
      } else if(4 == var2) {
         this.aBool43 = false;
      } else if(5 == var2) {
         this.aBool36 = false;
      }

   }

   static void method556(int var0, String var1, String var2, byte var3) {
      if(null != client.aClass111_11060) {
         OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4275, client.aClass111_11060.aClass14_1342, -260179612);
         var4.out.writeShort(1 + Class388.method4767(var1, 218373896) + Class388.method4767(var2, 750203541), -805078716);
         var4.out.method9617(var1, 560709612);
         var4.out.method9617(var2, 1449201316);
         var4.out.writeByteC(var0, -802285532);
         client.aClass111_11060.write(var4, (byte)19);
      }

   }

   static final void method557(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
