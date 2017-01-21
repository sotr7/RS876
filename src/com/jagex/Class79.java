package com.jagex;

import com.jagex.Class292_Sub1;
import com.jagex.Class293;
import com.jagex.Class298;
import com.jagex.Class307;
import com.jagex.Class329_Sub1;
import com.jagex.Class394;
import com.jagex.Class43;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class466;
import com.jagex.Class481;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class535;
import com.jagex.Class632;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class689_Sub2;
import com.jagex.Class74;
import com.jagex.Class78;
import com.jagex.Class8;
import com.jagex.Class87;
import com.jagex.Exception_Sub2;
import com.jagex.client;
import java.util.Random;

public class Class79 {
   static final int anInt819 = 0;
   public static int anInt821;
   Class466 aClass466_820;
   Class87[] aClass87Array818;
   int anInt817;

   Class87 method1141(int var1, int var2, int var3) {
      if(-1 == 1400112455 * this.anInt817) {
         return new Class87(false, new Class74[0]);
      } else {
         Class74 var4 = new Class74(this.anInt817 * 1400112455, var1, var2);
         return new Class87(false, new Class74[]{var4});
      }
   }

   public Class78 method1142(int var1, int var2) {
      byte[] var3 = this.aClass466_820.method5536(var1, 0, (byte)-20);
      Class78 var4 = new Class78();
      var4.method1135(new RSByteBuffer(var3), 1344700612);
      return var4;
   }

   public Class74[] method1143(int var1, int var2) {
      if(var1 >= 0 && var1 < this.aClass87Array818.length) {
         Class87 var3 = this.aClass87Array818[var1];
         if(var3.aBool856 && var3.aClass74Array857.length > 1) {
            int var4 = 1400112455 * this.anInt817 == -1?0:1;
            Random var5 = new Random();
            Class74[] var6 = new Class74[var3.aClass74Array857.length];
            System.arraycopy(var3.aClass74Array857, 0, var6, 0, var6.length);

            for(int var7 = var4; var7 < var6.length; ++var7) {
               int var8 = Class535.method6402(var5, var6.length - var4, (short)16416) + var4;
               Class74 var9 = var3.aClass74Array857[var7];
               var6[var7] = var6[var8];
               var6[var8] = var9;
            }

            return var6;
         } else {
            return var3.aClass74Array857;
         }
      } else {
         return this.method1141(0, 0, -2143288909).aClass74Array857;
      }
   }

   public boolean method1144() {
      return 1400112455 * this.anInt817 != -1;
   }

   public boolean method1145() {
      return 1400112455 * this.anInt817 != -1;
   }

   public boolean method1146(byte var1) {
      return 1400112455 * this.anInt817 != -1;
   }

   public Class79(Class676 var1, Class673 var2, Class466 var3) {
      this.aClass466_820 = var3;
      RSByteBuffer var4 = new RSByteBuffer(this.aClass466_820.method5536(0, 0, (byte)-63));
      int var5 = null != var4.buffer && var4.buffer.length >= 1?var4.readUnsignedByte(-121123364):-1;
      if(var5 < 4) {
         this.aClass87Array818 = new Class87[0];
         this.anInt817 = -706221175;
      } else {
         int var6 = var4.readUnsignedByte(-480917115);
         Class394[] var7 = Class481.method5759(463549998);
         boolean var8 = true;
         int var9;
         int var10;
         if(var7.length != var6) {
            var8 = false;
         } else {
            for(var9 = 0; var9 < var7.length; ++var9) {
               var10 = var4.readUnsignedByte(268356056);
               if(var10 != 1490392849 * var7[var9].anInt4109) {
                  var8 = false;
                  break;
               }
            }
         }

         if(var8) {
            var9 = var4.readUnsignedByte(401063126);
            var10 = var4.readUnsignedByte(-1770652083);
            int var11;
            int var12;
            if(var5 > 2) {
               this.anInt817 = var4.readShort((byte)1) * 706221175;
               var11 = var4.read24BitInt(742041327);
               var12 = var4.readUnsignedShort(1472065399);
            } else {
               this.anInt817 = -706221175;
               var11 = 0;
               var12 = 0;
            }

            this.aClass87Array818 = new Class87[var10 + 1];

            int var13;
            for(var13 = 0; var13 < var9; ++var13) {
               int var14 = var4.readUnsignedByte(-1471414224);
               boolean var15 = var4.readUnsignedByte(-772950257) == 1;
               int var16 = var4.readUnsignedShort(949199615);
               Class74[] var17;
               int var18;
               int var19;
               int var20;
               int var21;
               if(-1 != 1400112455 * this.anInt817) {
                  var17 = new Class74[1 + var16];
                  var17[0] = new Class74(this.anInt817 * 1400112455, var11, var12);

                  for(var18 = 0; var18 < var16; ++var18) {
                     var19 = var4.readUnsignedShort(2073980426);
                     var20 = var4.read24BitInt(742041327);
                     var21 = var4.readUnsignedShort(1596454939);
                     var17[1 + var18] = new Class74(var19, var20, var21);
                  }
               } else {
                  var17 = new Class74[var16];

                  for(var18 = 0; var18 < var16; ++var18) {
                     var19 = var4.readUnsignedShort(1556248664);
                     var20 = var4.read24BitInt(742041327);
                     var21 = var4.readUnsignedShort(1699000933);
                     var17[var18] = new Class74(var19, var20, var21);
                  }

                  this.aClass87Array818[var14] = new Class87(var15, var17);
               }

               this.aClass87Array818[var14] = new Class87(var15, var17);
            }

            for(var13 = 0; var13 < 1 + var10; ++var13) {
               if(this.aClass87Array818[var13] == null) {
                  this.aClass87Array818[var13] = this.method1141(var11, var12, -2143288909);
               }
            }
         } else {
            this.aClass87Array818 = new Class87[0];
            this.anInt817 = -706221175;
         }
      }

   }

   public boolean method1147() {
      return 1400112455 * this.anInt817 != -1;
   }

   static void method1148(Class526_Sub32 var0, int var1) {
      Class43.aClass292_Sub1_458 = new Class292_Sub1(client.aClass61_11267);
      Class43.aClass292_Sub1_458.method3890(Class293.aClass293_3179, -2067882070);

      try {
         Class329_Sub1 var2 = (Class329_Sub1)Class43.aClass292_Sub1_458.method3892(Class307.aClass307_3293, false, 603794603);
         Class689_Sub2 var3 = (Class689_Sub2)Class43.aClass292_Sub1_458.method3891(Class298.aClass298_3241, false, (byte)1);
         var2.method9040(var0, 141435003);
         var3.method10210(new Class440(0.0F, 0.0F, 0.0F), 1960734086);
         Class43.aClass292_Sub1_458.method3899(Class446.method5309(99999.0F, 99999.0F, 99999.0F), (byte)21);
         Class43.aClass292_Sub1_458.method3935(Class446.method5309(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -1209503832);
         Class43.aClass292_Sub1_458.method3937(Class446.method5309(99999.0F, 99999.0F, 99999.0F), -1274508793);
         Class43.aClass292_Sub1_458.method3896(Class446.method5309(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (byte)107);
      } catch (Exception_Sub2 var4) {
         ;
      }

      Class43.anInt456 = Class8.aClass547_45.method6534(1117250330) * -734049257;
      Class632.anInt8238 = Class8.aClass547_45.method6531(2137307775) * 979245269;
      Class43.aBool457 = true;
   }
}
