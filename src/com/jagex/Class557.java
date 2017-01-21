package com.jagex;

import com.jagex.Class153;
import com.jagex.Class173;
import com.jagex.Class174;
import com.jagex.Class181;
import com.jagex.Class195;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class332;
import com.jagex.Class446;
import com.jagex.Class466;
import com.jagex.Class526_Sub24;
import com.jagex.RSByteBuffer;
import com.jagex.Class566;
import com.jagex.Class567;
import com.jagex.Class586;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;
import com.jagex.Interface12;
import com.jagex.client;

public class Class557 implements Interface12 {
   static final int anInt7518 = 70;
   public int anInt7519 = 195971185;
   public int anInt7520 = 1615066201;
   public int anInt7526 = -1081898997;
   public int anInt7523 = -1938158874;
   public int anInt7521 = 1185497767;
   public int anInt7525 = 506842161;
   public int anInt7527 = 332936955;
   public int anInt7524 = 1034629875;
   public int anInt7528 = -1636617413;
   public int anInt7529 = 989457219;
   public int anInt7522 = -540689637;
   Class567 aClass567_7517;

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1570274285);
         if(0 == var2) {
            return;
         }

         this.method6706(var1, var2, 62801406);
      }
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(555599401);
         if(0 == var3) {
            return;
         }

         this.method6706(var1, var3, -622337771);
      }
   }

   public Class153 method6703(Class174 var1, int var2, int var3) {
      if(var2 < 0) {
         return null;
      } else {
         Class153 var4 = (Class153)this.aClass567_7517.aClass192_7612.method2765((long)var2);
         if(null == var4) {
            this.method6705(var1, 1534025574);
            var4 = (Class153)this.aClass567_7517.aClass192_7612.method2765((long)var2);
         }

         return var4;
      }
   }

   void method6704(Class174 var1, int var2, int var3) {
      Class466 var4 = this.aClass567_7517.aClass466_7613;
      if(var2 >= 0 && this.aClass567_7517.aClass192_7612.method2765((long)var2) == null && var4.method5537(var2, (byte)40)) {
         Class173 var5 = Class181.method2680(var4, var2);
         this.aClass567_7517.aClass192_7612.method2768(var1.method2310(var5, true), (long)var2);
      }

   }

   void method6705(Class174 var1, int var2) {
      this.method6704(var1, this.anInt7521 * 670284521, -1623874661);
      this.method6704(var1, this.anInt7525 * -1377963217, 117431443);
      this.method6704(var1, this.anInt7527 * 454466509, 1329510684);
      this.method6704(var1, 620480965 * this.anInt7524, -1548696889);
      this.method6704(var1, this.anInt7528 * -631188979, -931338353);
      this.method6704(var1, 1882687125 * this.anInt7529, 156583867);
   }

   public void method81(int var1) {
   }

   public void method85() {
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-2045057648);
         if(0 == var2) {
            return;
         }

         this.method6706(var1, var2, 359882611);
      }
   }

   void method6706(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         var1.readUnsignedShort(1379416167);
      } else if(var2 == 2) {
         this.anInt7519 = var1.readUnsignedByte(110374780) * -1936177521;
      } else if(var2 == 3) {
         this.anInt7520 = var1.readUnsignedByte(-1003237657) * 242135719;
      } else if(var2 == 4) {
         this.anInt7526 = 0;
      } else if(var2 == 5) {
         this.anInt7523 = var1.readUnsignedShort(627083734) * 524522097;
      } else if(var2 == 6) {
         var1.readUnsignedByte(-866819159);
      } else if(7 == var2) {
         this.anInt7521 = var1.readBigSmart((byte)-34) * -1185497767;
      } else if(var2 == 8) {
         this.anInt7525 = var1.readBigSmart((byte)14) * -506842161;
      } else if(9 == var2) {
         this.anInt7527 = var1.readBigSmart((byte)26) * -332936955;
      } else if(10 == var2) {
         this.anInt7524 = var1.readBigSmart((byte)-72) * -1034629875;
      } else if(11 == var2) {
         this.anInt7526 = var1.readUnsignedShort(1130468638) * 1081898997;
      } else if(12 == var2) {
         this.anInt7528 = var1.readBigSmart((byte)-102) * 1636617413;
      } else if(13 == var2) {
         this.anInt7529 = var1.readBigSmart((byte)8) * -989457219;
      }

   }

   void method6707(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         var1.readUnsignedShort(1026693307);
      } else if(var2 == 2) {
         this.anInt7519 = var1.readUnsignedByte(1422644484) * -1936177521;
      } else if(var2 == 3) {
         this.anInt7520 = var1.readUnsignedByte(-2090307537) * 242135719;
      } else if(var2 == 4) {
         this.anInt7526 = 0;
      } else if(var2 == 5) {
         this.anInt7523 = var1.readUnsignedShort(101278259) * 524522097;
      } else if(var2 == 6) {
         var1.readUnsignedByte(881603001);
      } else if(7 == var2) {
         this.anInt7521 = var1.readBigSmart((byte)-80) * -1185497767;
      } else if(var2 == 8) {
         this.anInt7525 = var1.readBigSmart((byte)85) * -506842161;
      } else if(9 == var2) {
         this.anInt7527 = var1.readBigSmart((byte)35) * -332936955;
      } else if(10 == var2) {
         this.anInt7524 = var1.readBigSmart((byte)-18) * -1034629875;
      } else if(11 == var2) {
         this.anInt7526 = var1.readUnsignedShort(2029164430) * 1081898997;
      } else if(12 == var2) {
         this.anInt7528 = var1.readBigSmart((byte)-12) * 1636617413;
      } else if(13 == var2) {
         this.anInt7529 = var1.readBigSmart((byte)-10) * -989457219;
      }

   }

   public Class153 method6708(Class174 var1, int var2) {
      if(var2 < 0) {
         return null;
      } else {
         Class153 var3 = (Class153)this.aClass567_7517.aClass192_7612.method2765((long)var2);
         if(null == var3) {
            this.method6705(var1, 501450871);
            var3 = (Class153)this.aClass567_7517.aClass192_7612.method2765((long)var2);
         }

         return var3;
      }
   }

   public Class153 method6709(Class174 var1, int var2) {
      if(var2 < 0) {
         return null;
      } else {
         Class153 var3 = (Class153)this.aClass567_7517.aClass192_7612.method2765((long)var2);
         if(null == var3) {
            this.method6705(var1, 611762434);
            var3 = (Class153)this.aClass567_7517.aClass192_7612.method2765((long)var2);
         }

         return var3;
      }
   }

   Class557(int var1, Class567 var2) {
      this.aClass567_7517 = var2;
   }

   static final void method6710(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2537 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 1883403165;
      var0.anInt2557 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 712704219;
   }

   static final void method6711(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-4);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1448987627 * var3.anInt2550;
   }

   static void method6712(byte var0) {
      int var1 = 0;
      if(null != Class230.preferences) {
         var1 = Class230.preferences.aClass711_Sub43_10628.method10226(768393344);
      }

      int var2;
      int var3;
      if(2 == var1) {
         var2 = 1405944805 * Class332.anInt3505 > 800?800:1405944805 * Class332.anInt3505;
         var3 = 542147681 * Class586.anInt7792 > 600?600:Class586.anInt7792 * 542147681;
         Class566.anInt7611 = 1363328207 * var2;
         client.anInt5594 = -1896829953 * ((1405944805 * Class332.anInt3505 - var2) / 2);
         Class526_Sub24.anInt10549 = var3 * -193172907;
         client.anInt5605 = 0;
      } else if(1 == var1) {
         var2 = 1405944805 * Class332.anInt3505 > 1024?1024:Class332.anInt3505 * 1405944805;
         var3 = 542147681 * Class586.anInt7792 > 768?768:542147681 * Class586.anInt7792;
         Class566.anInt7611 = var2 * 1363328207;
         client.anInt5594 = (Class332.anInt3505 * 1405944805 - var2) / 2 * -1896829953;
         Class526_Sub24.anInt10549 = var3 * -193172907;
         client.anInt5605 = 0;
      } else {
         Class566.anInt7611 = Class332.anInt3505 * -945008085;
         client.anInt5594 = 0;
         Class526_Sub24.anInt10549 = Class586.anInt7792 * -1534583243;
         client.anInt5605 = 0;
      }

   }

   static final void method6713(Class681 var0, int var1) throws Exception_Sub2 {
      var0.anInt8623 -= 758383916;
      float var2 = (float)var0.anIntArray8622[var0.anInt8623 * -1730576285];
      float var3 = (float)var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      float var4 = (float)var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2];
      float var5 = (float)var0.anIntArray8622[var0.anInt8623 * -1730576285 + 3] / 1000.0F;
      Class195.aClass292_Sub1_2182.method3900(Class446.method5309(var2, var3, var4), var5, (byte)-88);
   }

   static final void method6714(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
   }
}
