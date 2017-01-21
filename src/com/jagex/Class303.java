package com.jagex;

import com.jagex.Class10;
import com.jagex.Class206;
import com.jagex.Class221;
import com.jagex.Class240_Sub1;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class388;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;
import com.jagex.Class83;
import com.jagex.Interface12;
import com.jagex.Interface5;
import com.jagex.client;

public class Class303 implements Interface12, Interface5 {
   public int anInt3263 = 808339800;
   public boolean aBool3262;
   public int anInt3264;
   public int anInt3265;
   public int anInt3266;
   public int anInt3270;
   public int anInt3269;
   public int anInt3268 = -643821061;
   public int anInt3272;
   public int anInt3271;
   public int anInt3267;

   void method3999(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt3263 = var1.readUnsignedShort(395430015) * 1174784299;
      } else if(var2 == 2) {
         this.aBool3262 = true;
      } else if(3 == var2) {
         this.anInt3264 = var1.readShort((byte)1) * 1800450507;
         this.anInt3265 = var1.readShort((byte)1) * -1937229493;
         this.anInt3266 = var1.readShort((byte)1) * 16545533;
      } else if(var2 == 4) {
         this.anInt3270 = var1.readUnsignedByte(-722174213) * 1977942325;
      } else if(5 == var2) {
         this.anInt3269 = var1.readBigSmart((byte)-72) * -1741102283;
      } else if(var2 == 6) {
         this.anInt3268 = var1.read24BitInt(742041327) * 727707141;
      } else if(var2 == 7) {
         this.anInt3272 = var1.readShort((byte)1) * -326855235;
         this.anInt3271 = var1.readShort((byte)1) * 378263877;
         this.anInt3267 = var1.readShort((byte)1) * -1465392723;
      }

   }

   public void method85() {
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1471071157);
         if(var2 == 0) {
            return;
         }

         this.method3999(var1, var2, -142265637);
      }
   }

   public void method49(int var1, int var2) {
   }

   public void method81(int var1) {
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(148010076);
         if(var3 == 0) {
            return;
         }

         this.method3999(var1, var3, 593056327);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1035077196);
         if(var2 == 0) {
            return;
         }

         this.method3999(var1, var2, -493206948);
      }
   }

   public void method50(int var1) {
   }

   public void method51(int var1) {
   }

   void method4000(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt3263 = var1.readUnsignedShort(1103534555) * 1174784299;
      } else if(var2 == 2) {
         this.aBool3262 = true;
      } else if(3 == var2) {
         this.anInt3264 = var1.readShort((byte)1) * 1800450507;
         this.anInt3265 = var1.readShort((byte)1) * -1937229493;
         this.anInt3266 = var1.readShort((byte)1) * 16545533;
      } else if(var2 == 4) {
         this.anInt3270 = var1.readUnsignedByte(-1518305052) * 1977942325;
      } else if(5 == var2) {
         this.anInt3269 = var1.readBigSmart((byte)-33) * -1741102283;
      } else if(var2 == 6) {
         this.anInt3268 = var1.read24BitInt(742041327) * 727707141;
      } else if(var2 == 7) {
         this.anInt3272 = var1.readShort((byte)1) * -326855235;
         this.anInt3271 = var1.readShort((byte)1) * 378263877;
         this.anInt3267 = var1.readShort((byte)1) * -1465392723;
      }

   }

   void method4001(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt3263 = var1.readUnsignedShort(465942726) * 1174784299;
      } else if(var2 == 2) {
         this.aBool3262 = true;
      } else if(3 == var2) {
         this.anInt3264 = var1.readShort((byte)1) * 1800450507;
         this.anInt3265 = var1.readShort((byte)1) * -1937229493;
         this.anInt3266 = var1.readShort((byte)1) * 16545533;
      } else if(var2 == 4) {
         this.anInt3270 = var1.readUnsignedByte(2142086751) * 1977942325;
      } else if(5 == var2) {
         this.anInt3269 = var1.readBigSmart((byte)65) * -1741102283;
      } else if(var2 == 6) {
         this.anInt3268 = var1.read24BitInt(742041327) * 727707141;
      } else if(var2 == 7) {
         this.anInt3272 = var1.readShort((byte)1) * -326855235;
         this.anInt3271 = var1.readShort((byte)1) * 378263877;
         this.anInt3267 = var1.readShort((byte)1) * -1465392723;
      }

   }

   static final void method4002(Class681 var0, short var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-86);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class240_Sub1.method9127(var3, var4, var0, (byte)1);
   }

   static final void method4003(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)19);
      int var4 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      --var4;
      if(var3.aStringArray2579 != null && var4 < var3.aStringArray2579.length && null != var3.aStringArray2579[var4]) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aStringArray2579[var4];
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static final void method4004(Class681 var0, int var1) {
   }

   static final void method4005(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).method3092(var3, (byte)-58);
   }

   static final void method4006(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class83 var4 = (Class83)Class10.aClass40_Sub20_62.method89(var3, -1933031764);
      if(var4.method1167(1338380635)) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class206)Class388.aClass40_Sub15_4063.method89(var2, -240153959)).method2902(var3, var4.aString842, 2145594414);
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class206)Class388.aClass40_Sub15_4063.method89(var2, -1701811395)).method2901(var3, 1040538721 * var4.anInt843, (byte)-8);
      }

   }
}
