package com.jagex;

import com.jagex.Class186;
import com.jagex.Class199_Sub20;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class443;
import com.jagex.Class446;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.RSByteBuffer;
import com.jagex.Class605;
import com.jagex.Class676;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.client;

public class Class391 {
   static final int anInt4068 = 1;
   public static final int anInt4069 = 2;
   static final int anInt4070 = 0;
   public static final int anInt4071 = 1;
   public static final int anInt4072 = 2;
   public static final int anInt4073 = 0;
   static final int anInt4074 = 1;
   public int anInt4077;
   public static final int anInt4085 = 0;
   public static final int anInt4089 = 1;
   public int anInt4079;
   public int anInt4080;
   public int anInt4081;
   public int anInt4083;
   public int anInt4082;
   public int anInt4076;
   public int anInt4078;
   public int anInt4075 = 0;
   public int anInt4084 = 0;
   boolean aBool4087 = false;
   public int anInt4090;
   public int anInt4088;
   public long aLong4086;

   void method4778(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt4079 = var1.readUnsignedShort(1934709041) * 2022155427;
      } else if(2 == var2) {
         var1.readUnsignedByte(829322838);
      } else if(var2 == 3) {
         this.anInt4080 = var1.readInt((byte)5) * -926384961;
         this.anInt4081 = var1.readInt((byte)5) * 2065723945;
         this.anInt4083 = var1.readInt((byte)5) * -1638562013;
      } else if(4 == var2) {
         this.anInt4082 = var1.readUnsignedByte(2052579156) * 1751664971;
         this.anInt4076 = var1.readInt((byte)5) * -931541147;
      } else if(var2 == 6) {
         this.anInt4078 = var1.readUnsignedByte(173170392) * 347837373;
      } else if(var2 == 8) {
         this.anInt4075 = -222946743;
      } else if(var2 == 9) {
         this.anInt4084 = 1640750917;
      } else if(10 == var2) {
         this.aBool4087 = true;
      }

   }

   void method4779(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1514257535);
         if(var3 == 0) {
            return;
         }

         this.method4778(var1, var3, -1422361596);
      }
   }

   void method4780(int var1) {
      this.anInt4090 = 1101102597 * Class443.anIntArray4896[-2040123637 * this.anInt4079 << 3];
      long var2 = (long)(this.anInt4080 * -2017397953);
      long var4 = (long)(2127383065 * this.anInt4081);
      long var6 = (long)(this.anInt4083 * -1493442421);
      this.anInt4088 = (int)Math.sqrt((double)(var2 * var2 + var4 * var4 + var6 * var6)) * 912360687;
      if(this.anInt4076 * -449197459 == 0) {
         this.anInt4076 = -931541147;
      }

      if(-1306396573 * this.anInt4082 == 0) {
         this.aLong4086 = 6998097931471572697L;
      } else if(this.anInt4082 * -1306396573 == 1) {
         this.aLong4086 = (long)(this.anInt4088 * -651079560 / (this.anInt4076 * -449197459)) * -9187172172307779289L;
         this.aLong4086 *= 3268215641058619031L * this.aLong4086;
      } else if(2 == -1306396573 * this.anInt4082) {
         this.aLong4086 = -9187172172307779289L * (long)(this.anInt4088 * -651079560 / (-449197459 * this.anInt4076));
      }

      if(this.aBool4087) {
         this.anInt4088 *= -1;
      }

   }

   void method4781(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1751090672);
         if(var2 == 0) {
            return;
         }

         this.method4778(var1, var2, -1751739095);
      }
   }

   void method4782(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-348628144);
         if(var2 == 0) {
            return;
         }

         this.method4778(var1, var2, -969945223);
      }
   }

   void method4783(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(556291721);
         if(var2 == 0) {
            return;
         }

         this.method4778(var1, var2, -1902856956);
      }
   }

   void method4784(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt4079 = var1.readUnsignedShort(1213089590) * 2022155427;
      } else if(2 == var2) {
         var1.readUnsignedByte(-823261046);
      } else if(var2 == 3) {
         this.anInt4080 = var1.readInt((byte)5) * -926384961;
         this.anInt4081 = var1.readInt((byte)5) * 2065723945;
         this.anInt4083 = var1.readInt((byte)5) * -1638562013;
      } else if(4 == var2) {
         this.anInt4082 = var1.readUnsignedByte(-841312095) * 1751664971;
         this.anInt4076 = var1.readInt((byte)5) * -931541147;
      } else if(var2 == 6) {
         this.anInt4078 = var1.readUnsignedByte(129105222) * 347837373;
      } else if(var2 == 8) {
         this.anInt4075 = -222946743;
      } else if(var2 == 9) {
         this.anInt4084 = 1640750917;
      } else if(10 == var2) {
         this.aBool4087 = true;
      }

   }

   void method4785(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt4079 = var1.readUnsignedShort(1187219151) * 2022155427;
      } else if(2 == var2) {
         var1.readUnsignedByte(1830593885);
      } else if(var2 == 3) {
         this.anInt4080 = var1.readInt((byte)5) * -926384961;
         this.anInt4081 = var1.readInt((byte)5) * 2065723945;
         this.anInt4083 = var1.readInt((byte)5) * -1638562013;
      } else if(4 == var2) {
         this.anInt4082 = var1.readUnsignedByte(1490211022) * 1751664971;
         this.anInt4076 = var1.readInt((byte)5) * -931541147;
      } else if(var2 == 6) {
         this.anInt4078 = var1.readUnsignedByte(1430877169) * 347837373;
      } else if(var2 == 8) {
         this.anInt4075 = -222946743;
      } else if(var2 == 9) {
         this.anInt4084 = 1640750917;
      } else if(10 == var2) {
         this.aBool4087 = true;
      }

   }

   void method4786() {
      this.anInt4090 = 1101102597 * Class443.anIntArray4896[-2040123637 * this.anInt4079 << 3];
      long var1 = (long)(this.anInt4080 * -2017397953);
      long var3 = (long)(2127383065 * this.anInt4081);
      long var5 = (long)(this.anInt4083 * -1493442421);
      this.anInt4088 = (int)Math.sqrt((double)(var1 * var1 + var3 * var3 + var5 * var5)) * 912360687;
      if(this.anInt4076 * -449197459 == 0) {
         this.anInt4076 = -931541147;
      }

      if(-1306396573 * this.anInt4082 == 0) {
         this.aLong4086 = 6998097931471572697L;
      } else if(this.anInt4082 * -1306396573 == 1) {
         this.aLong4086 = (long)(this.anInt4088 * -651079560 / (this.anInt4076 * -449197459)) * -9187172172307779289L;
         this.aLong4086 *= 3268215641058619031L * this.aLong4086;
      } else if(2 == -1306396573 * this.anInt4082) {
         this.aLong4086 = -9187172172307779289L * (long)(this.anInt4088 * -651079560 / (-449197459 * this.anInt4076));
      }

      if(this.aBool4087) {
         this.anInt4088 *= -1;
      }

   }

   void method4787() {
      this.anInt4090 = 1101102597 * Class443.anIntArray4896[-2040123637 * this.anInt4079 << 3];
      long var1 = (long)(this.anInt4080 * -2017397953);
      long var3 = (long)(2127383065 * this.anInt4081);
      long var5 = (long)(this.anInt4083 * -1493442421);
      this.anInt4088 = (int)Math.sqrt((double)(var1 * var1 + var3 * var3 + var5 * var5)) * 912360687;
      if(this.anInt4076 * -449197459 == 0) {
         this.anInt4076 = -931541147;
      }

      if(-1306396573 * this.anInt4082 == 0) {
         this.aLong4086 = 6998097931471572697L;
      } else if(this.anInt4082 * -1306396573 == 1) {
         this.aLong4086 = (long)(this.anInt4088 * -651079560 / (this.anInt4076 * -449197459)) * -9187172172307779289L;
         this.aLong4086 *= 3268215641058619031L * this.aLong4086;
      } else if(2 == -1306396573 * this.anInt4082) {
         this.aLong4086 = -9187172172307779289L * (long)(this.anInt4088 * -651079560 / (-449197459 * this.anInt4076));
      }

      if(this.aBool4087) {
         this.anInt4088 *= -1;
      }

   }

   static final void method4788(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class605.method7130(var3, var4, var0, (byte)4);
   }

   static final void method4789(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1357024915 * Class676.anInt8594;
   }

   static final void method4790(long var0) {
      Class446 var2 = Class451.localPlayer.method7635().aClass446_4816;
      int var3 = client.anInt11088 * -2095210217 + (int)var2.aFloat4917;
      int var4 = (int)var2.aFloat4919 + client.anInt11090 * 471803279;
      if(-445020973 * Class45.anInt639 - var3 < -2000 || -445020973 * Class45.anInt639 - var3 > 2000 || 1090885877 * Class186.anInt2122 - var4 < -2000 || 1090885877 * Class186.anInt2122 - var4 > 2000) {
         Class45.anInt639 = 846295899 * var3;
         Class186.anInt2122 = var4 * -1830792355;
      }

      int var5;
      int var6;
      if(Class45.anInt639 * -445020973 != var3) {
         var5 = var3 - -445020973 * Class45.anInt639;
         var6 = (int)(var0 * (long)var5 / 320L);
         if(var5 > 0) {
            if(0 == var6) {
               var6 = 1;
            } else if(var6 > var5) {
               var6 = var5;
            }
         } else if(var6 == 0) {
            var6 = -1;
         } else if(var6 < var5) {
            var6 = var5;
         }

         Class45.anInt639 += var6 * 846295899;
      }

      if(var4 != 1090885877 * Class186.anInt2122) {
         var5 = var4 - 1090885877 * Class186.anInt2122;
         var6 = (int)((long)var5 * var0 / 320L);
         if(var5 > 0) {
            if(var6 == 0) {
               var6 = 1;
            } else if(var6 > var5) {
               var6 = var5;
            }
         } else if(var6 == 0) {
            var6 = -1;
         } else if(var6 < var5) {
            var6 = var5;
         }

         Class186.anInt2122 += -1830792355 * var6;
      }

      client.aFloat11105 += (float)var0 * client.aFloat11106 / 6.0F;
      client.aFloat11210 += (float)var0 * client.aFloat10992 / 6.0F;
      Class199_Sub20.method9034(190461033);
   }
}
