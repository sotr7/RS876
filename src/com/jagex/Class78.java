package com.jagex;

import com.jagex.Class116;
import com.jagex.Class182;
import com.jagex.Class190;
import com.jagex.Class199_Sub9;
import com.jagex.Class205;
import com.jagex.Class212;
import com.jagex.Class243;
import com.jagex.Class247;
import com.jagex.Class255;
import com.jagex.Class27;
import com.jagex.Class329_Sub1;
import com.jagex.Class380_Sub3_Sub1;
import com.jagex.Class386;
import com.jagex.Class394;
import com.jagex.Class399;
import com.jagex.Class413;
import com.jagex.Class418;
import com.jagex.Class43;
import com.jagex.Class439;
import com.jagex.Class443;
import com.jagex.Class451;
import com.jagex.Class481;
import com.jagex.Class501;
import com.jagex.Class506;
import com.jagex.RSByteBuffer;
import com.jagex.Class566;
import com.jagex.Class575;
import com.jagex.Class681;
import com.jagex.Class69;
import com.jagex.Class711_Sub26;
import com.jagex.Class83;
import com.jagex.Class84;
import com.jagex.Class9_Sub1;
import com.jagex.Interface45;
import com.jagex.Interface63;
import com.jagex.client;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class78 {
   public Interface45[] anInterface45Array816;

   void method1135(RSByteBuffer var1, int var2) {
      this.anInterface45Array816 = new Interface45[var1.readUnsignedByte(-715267749)];
      Class394[] var3 = Class481.method5759(1946990753);

      for(int var4 = 0; var4 < this.anInterface45Array816.length; ++var4) {
         this.anInterface45Array816[var4] = this.method1136(var1, var3[var1.readUnsignedByte(500740353)], -77385098);
      }

   }

   Interface45 method1136(RSByteBuffer var1, Class394 var2, int var3) {
      return (Interface45)(var2 == Class394.aClass394_4107?Class247.method3394(var1, -1992865991):(Class394.aClass394_4099 == var2?Class243.method3334(var1, -861961455):(Class394.aClass394_4102 == var2?Class83.method1174(var1, 1249535875):(var2 == Class394.aClass394_4104?Class575.method6936(var1, -936337054):(Class394.aClass394_4103 == var2?Class439.method5154(var1, -2114392598):(Class394.aClass394_4100 == var2?Class451.method5359(var1, -376078617):(Class394.aClass394_4108 == var2?Class386.method4758(var1, 115777002):(Class394.aClass394_4105 == var2?Class43.method909(var1, 1634690632):(Class394.aClass394_4098 == var2?Class399.method4829(var1, 1983656844):(var2 == Class394.aClass394_4101?Class205.method2897(var1, (byte)33):(Class394.aClass394_4106 == var2?Class501.method6012(var1, (byte)90):null)))))))))));
   }

   void method1137(RSByteBuffer var1) {
      this.anInterface45Array816 = new Interface45[var1.readUnsignedByte(418625560)];
      Class394[] var2 = Class481.method5759(2011764733);

      for(int var3 = 0; var3 < this.anInterface45Array816.length; ++var3) {
         this.anInterface45Array816[var3] = this.method1136(var1, var2[var1.readUnsignedByte(-731612634)], -77385098);
      }

   }

   void method1138(RSByteBuffer var1) {
      this.anInterface45Array816 = new Interface45[var1.readUnsignedByte(1410264241)];
      Class394[] var2 = Class481.method5759(1810827863);

      for(int var3 = 0; var3 < this.anInterface45Array816.length; ++var3) {
         this.anInterface45Array816[var3] = this.method1136(var1, var2[var1.readUnsignedByte(-697449805)], -77385098);
      }

   }

   static final void method1139(Class681 var0, int var1) {
      boolean var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1;
      if(var2) {
         Class418.method4974(2, (byte)11);
      } else {
         Class418.method4974(1, (byte)22);
      }

   }

   static void method1140(byte var0) {
      if(-1447723823 * Class116.anInt1432 < 102) {
         Class116.anInt1432 += -646829786;
      }

      int var1;
      int var2;
      if(-518082495 * Class116.anInt1419 != -1 && 2691207922276871701L * Class380_Sub3_Sub1.aLong11404 < Class255.time((byte)24)) {
         for(var1 = -518082495 * Class116.anInt1419; var1 < Class506.aStringArray5696.length; ++var1) {
            if(Class506.aStringArray5696[var1].startsWith("pause")) {
               var2 = 5;

               try {
                  var2 = Integer.parseInt(Class506.aStringArray5696[var1].substring(6));
               } catch (Exception var9) {
                  ;
               }

               Class27.method722("Pausing for " + var2 + " seconds...", -315839031);
               Class116.anInt1419 = (1 + var1) * -1489674303;
               Class380_Sub3_Sub1.aLong11404 = (Class255.time((byte)24) + (long)(1000 * var2)) * 8389726955050873149L;
               return;
            }

            Class116.aString1429 = Class506.aStringArray5696[var1];
            Class711_Sub26.method10086(false, 2008958350);
         }

         Class116.anInt1419 = 1489674303;
      }

      if(0 != client.anInt11029 * -1882874795) {
         Class116.anInt1424 -= client.anInt11029 * 1764195273;
         if(Class116.anInt1424 * -56413471 >= -1674710087 * Class116.anInt1423) {
            Class116.anInt1424 = -833276967 * Class116.anInt1423 - -658140895;
         }

         if(-56413471 * Class116.anInt1424 < 0) {
            Class116.anInt1424 = 0;
         }

         client.anInt11029 = 0;
      }

      int var3;
      for(var1 = 0; var1 < -1692864865 * client.anInt11146; ++var1) {
         Interface63 var11 = client.anInterface63Array11022[var1];
         var3 = var11.method421(-1742365462);
         char var4 = var11.method427((short)725);
         int var5 = var11.method424(194832031);
         if(var3 == 84) {
            Class711_Sub26.method10086(false, 2057473164);
         }

         if(80 == var3) {
            Class711_Sub26.method10086(true, 2005888013);
         } else if(var3 == 66 && 0 != (var5 & 4)) {
            if(null != Class182.aClipboard2095) {
               String var13 = "";

               for(int var14 = Class116.aStringArray1427.length - 1; var14 >= 0; --var14) {
                  if(Class116.aStringArray1427[var14] != null && Class116.aStringArray1427[var14].length() > 0) {
                     var13 = var13 + Class116.aStringArray1427[var14] + '\n';
                  }
               }

               Class182.aClipboard2095.setContents(new StringSelection(var13), (ClipboardOwner)null);
            }
         } else if(67 == var3 && 0 != (var5 & 4)) {
            if(null != Class182.aClipboard2095) {
               try {
                  Transferable var6 = Class182.aClipboard2095.getContents((Object)null);
                  if(null != var6) {
                     String var7 = (String)var6.getTransferData(DataFlavor.stringFlavor);
                     if(null != var7) {
                        String[] var8 = Class69.method1085(var7, '\n', (byte)7);
                        Class190.method2758(var8, -1603296332);
                     }
                  }
               } catch (Exception var10) {
                  ;
               }
            }
         } else if(var3 == 85 && -2112692681 * Class116.anInt1431 > 0) {
            Class116.aString1429 = Class116.aString1429.substring(0, Class116.anInt1431 * -2112692681 - 1) + Class116.aString1429.substring(-2112692681 * Class116.anInt1431);
            Class116.anInt1431 -= -1733740665;
         } else if(101 == var3 && -2112692681 * Class116.anInt1431 < Class116.aString1429.length()) {
            Class116.aString1429 = Class116.aString1429.substring(0, Class116.anInt1431 * -2112692681) + Class116.aString1429.substring(1 + -2112692681 * Class116.anInt1431);
         } else if(var3 == 96 && Class116.anInt1431 * -2112692681 > 0) {
            Class116.anInt1431 -= -1733740665;
         } else if(var3 == 97 && -2112692681 * Class116.anInt1431 < Class116.aString1429.length()) {
            Class116.anInt1431 += -1733740665;
         } else if(var3 == 102) {
            Class116.anInt1431 = 0;
         } else if(103 == var3) {
            Class116.anInt1431 = Class116.aString1429.length() * -1733740665;
         } else if(104 == var3 && Class116.anInt1430 * -579561805 < Class116.aStringArray1427.length) {
            Class116.anInt1430 += -1918760837;
            Class413.method4926(2019513325);
            Class116.anInt1431 = Class116.aString1429.length() * -1733740665;
         } else if(105 == var3 && -579561805 * Class116.anInt1430 > 0) {
            Class116.anInt1430 -= -1918760837;
            Class413.method4926(2019513325);
            Class116.anInt1431 = Class116.aString1429.length() * -1733740665;
         } else if(Class329_Sub1.method9044(var4, 1939127004) || "\\/.:, _-+[]~@".indexOf(var4) != -1) {
            Class116.aString1429 = Class116.aString1429.substring(0, Class116.anInt1431 * -2112692681) + client.anInterface63Array11022[var1].method427((short)725) + Class116.aString1429.substring(Class116.anInt1431 * -2112692681);
            Class116.anInt1431 += -1733740665;
         }
      }

      client.anInt11146 = 0;
      client.anInt11034 = 0;
      if(1895615023 * Class566.anInt7611 >> 1 != Class199_Sub9.anIntArray9918.length) {
         Class199_Sub9.anIntArray9918 = new int[Class566.anInt7611 * 1895615023 >> 1];
      }

      for(var1 = 0; var1 < 100; ++var1) {
         Class116.anIntArray1425[var1] += Class84.anIntArray851[var1];
         if(Class116.anIntArray1425[var1] >> 4 >= 350) {
            var2 = Class212.anIntArray2265[var1] >> 4;
            var3 = Class212.anIntArray2265[var1] & 15;
            var2 += Class443.anIntArray4895[64 * ((var2 & 64) + 350) + var3 * 1023 & 16383] >> 10;
            var2 >>= 1;

            for(int var12 = -3; var12 <= 3; ++var12) {
               if(var2 + var12 >= 0 && var12 + var2 < Class199_Sub9.anIntArray9918.length) {
                  Class199_Sub9.anIntArray9918[var12 + var2] += 4 - Math.abs(var12);
               }
            }

            Class212.anIntArray2265[var1] = ((int)(Math.random() * (double)(Class566.anInt7611 * 1895615023)) << 4) + (int)(Math.random() * 15.0D);
            Class116.anIntArray1425[var1] = 0;
            Class116.anIntArray1428[var1] = (int)(Math.random() * 102.0D) + 51;
            Class84.anIntArray851[var1] = 8 + (int)(Math.random() * 48.0D);
         }
      }

      Class9_Sub1.method10244(-428000642);
   }
}
