package com.jagex;

import com.jagex.Class1;
import com.jagex.Class225;
import com.jagex.Class380;
import com.jagex.Class380_Sub3;
import com.jagex.Class442;
import com.jagex.RSByteBuffer;
import com.jagex.Class627;
import com.jagex.Class681;
import com.jagex.client;

public class Class386 {
   static final int anInt4044 = 0;
   public int anInt4040 = 609568591;
   public int anInt4041 = 501561024;
   public int anInt4039 = -1182610240;
   public int anInt4042 = -1139371438;
   public int anInt4043 = -2102401317;
   public boolean aBool4045 = false;
   public boolean aBool4046 = false;

   void method4750(RSByteBuffer var1, int var2, int var3) {
      while(true) {
         int var4 = var1.readUnsignedByte(-28764912);
         if(0 == var4) {
            return;
         }

         this.method4752(var1, var4, var2, (short)-6718);
      }
   }

   void method4751(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-286707719);
         if(0 == var3) {
            return;
         }

         this.method4752(var1, var3, var2, (short)-30738);
      }
   }

   void method4752(RSByteBuffer var1, int var2, int var3, short var4) {
      if(var2 == 1) {
         this.anInt4040 = var1.readUnsignedShort(191910011) * -609568591;
         if('\uffff' == this.anInt4040 * 781750353) {
            this.anInt4040 = 609568591;
         }
      } else if(var2 == 2) {
         this.anInt4041 = (var1.readUnsignedShort(1568876207) + 1) * -126380837;
         this.anInt4039 = (var1.readUnsignedShort(905910120) + 1) * 2129005363;
      } else if(var2 == 3) {
         var1.readByte((byte)57);
      } else if(var2 == 4) {
         this.anInt4042 = var1.readUnsignedByte(870313278) * 1577797929;
      } else if(var2 == 5) {
         this.anInt4043 = var1.readUnsignedByte(1268181937) * -2102401317;
      } else if(var2 == 6) {
         this.aBool4045 = true;
      } else if(var2 == 7) {
         this.aBool4046 = true;
      }

   }

   void method4753(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt4040 = var1.readUnsignedShort(1658554852) * -609568591;
         if('\uffff' == this.anInt4040 * 781750353) {
            this.anInt4040 = 609568591;
         }
      } else if(var2 == 2) {
         this.anInt4041 = (var1.readUnsignedShort(1223032718) + 1) * -126380837;
         this.anInt4039 = (var1.readUnsignedShort(499390626) + 1) * 2129005363;
      } else if(var2 == 3) {
         var1.readByte((byte)48);
      } else if(var2 == 4) {
         this.anInt4042 = var1.readUnsignedByte(-2097288786) * 1577797929;
      } else if(var2 == 5) {
         this.anInt4043 = var1.readUnsignedByte(-1310327639) * -2102401317;
      } else if(var2 == 6) {
         this.aBool4045 = true;
      } else if(var2 == 7) {
         this.aBool4046 = true;
      }

   }

   void method4754(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt4040 = var1.readUnsignedShort(1214650989) * -609568591;
         if('\uffff' == this.anInt4040 * 781750353) {
            this.anInt4040 = 609568591;
         }
      } else if(var2 == 2) {
         this.anInt4041 = (var1.readUnsignedShort(693689749) + 1) * -126380837;
         this.anInt4039 = (var1.readUnsignedShort(366977190) + 1) * 2129005363;
      } else if(var2 == 3) {
         var1.readByte((byte)76);
      } else if(var2 == 4) {
         this.anInt4042 = var1.readUnsignedByte(-403127401) * 1577797929;
      } else if(var2 == 5) {
         this.anInt4043 = var1.readUnsignedByte(478671643) * -2102401317;
      } else if(var2 == 6) {
         this.aBool4045 = true;
      } else if(var2 == 7) {
         this.aBool4046 = true;
      }

   }

   void method4755(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt4040 = var1.readUnsignedShort(441960376) * -609568591;
         if('\uffff' == this.anInt4040 * 781750353) {
            this.anInt4040 = 609568591;
         }
      } else if(var2 == 2) {
         this.anInt4041 = (var1.readUnsignedShort(708381776) + 1) * -126380837;
         this.anInt4039 = (var1.readUnsignedShort(727318301) + 1) * 2129005363;
      } else if(var2 == 3) {
         var1.readByte((byte)27);
      } else if(var2 == 4) {
         this.anInt4042 = var1.readUnsignedByte(-1912163969) * 1577797929;
      } else if(var2 == 5) {
         this.anInt4043 = var1.readUnsignedByte(-2092536410) * -2102401317;
      } else if(var2 == 6) {
         this.aBool4045 = true;
      } else if(var2 == 7) {
         this.aBool4046 = true;
      }

   }

   static final void method4756(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.aByteArray3643[var2];
   }

   static final void method4757(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anInt8623 -= 379191958;
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class1 var5 = Class627.aClass418_8195.method4964(client.anInterface51_11046, var4, (byte)2);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.method515(var2, var3, Class442.aClass153Array4878, (byte)52);
   }

   public static Class380 method4758(RSByteBuffer var0, int var1) {
      Class380 var2 = Class225.method3157(var0, -1361309039);
      int var3 = var0.readBigSmart((byte)41);
      int var4 = var0.readBigSmart((byte)-14);
      int var5 = var0.readBigSmart((byte)79);
      int var6 = var0.readBigSmart((byte)-23);
      int var7 = var0.readBigSmart((byte)-15);
      int var8 = var0.readBigSmart((byte)-4);
      return new Class380_Sub3(var2.aClass384_3932, var2.aClass389_3929, 1035562863 * var2.anInt3930, var2.anInt3931 * 26479163, var2.anInt3936 * -219376461, 874500417 * var2.anInt3933, var2.anInt3934 * -1403557073, var2.anInt3935 * 2079046623, var2.anInt3928 * 252950473, var3, var4, var5, var6, var7, var8);
   }

   static final int method4759(int var0, int var1, int var2, int var3) {
      if(var0 == var1) {
         return var0;
      } else {
         int var4 = 128 - var2;
         int var5 = var2 * (var1 & 127) + var4 * (var0 & 127) >> 7;
         int var6 = (var0 & 896) * var4 + var2 * (var1 & 896) >> 7;
         int var7 = var4 * (var0 & '\ufc00') + var2 * (var1 & '\ufc00') >> 7;
         return var7 & '\ufc00' | var6 & 896 | var5 & 127;
      }
   }
}
