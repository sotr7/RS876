package com.jagex;

import com.jagex.Class11;
import com.jagex.Class16;
import com.jagex.Class163_Sub2;
import com.jagex.Class169;
import com.jagex.Class182;
import com.jagex.Class190;
import com.jagex.Class199_Sub3;
import com.jagex.Class199_Sub9;
import com.jagex.Class212;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class27;
import com.jagex.Class297;
import com.jagex.Class311;
import com.jagex.Class329_Sub1;
import com.jagex.Class380_Sub3_Sub1;
import com.jagex.Class394;
import com.jagex.Class413;
import com.jagex.Class425;
import com.jagex.Class443;
import com.jagex.Class446;
import com.jagex.Class448_Sub1;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class465;
import com.jagex.Class499;
import com.jagex.Class502;
import com.jagex.Class506;
import com.jagex.Class509;
import com.jagex.Buffer;
import com.jagex.Class554;
import com.jagex.Class562;
import com.jagex.Class566;
import com.jagex.Class571;
import com.jagex.Class611;
import com.jagex.Class613;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class69;
import com.jagex.Class711_Sub26;
import com.jagex.Class84;
import com.jagex.Class90;
import com.jagex.Class9_Sub1;
import com.jagex.Interface63;
import com.jagex.client;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Date;

public class Class116 {
   static final int anInt1420 = 100;
   static final String aString1422 = "Failure";
   static final String aString1435 = "\\/.:, _-+[]~@";
   static final String aString1436 = "Success";
   static final int anInt1437 = 350;
   public static int anInt1438;
   static int anInt1423 = 0;
   static int anInt1424 = 0;
   static boolean aBool1426 = true;
   static String aString1429 = "";
   static int anInt1430 = 0;
   static int anInt1431 = 0;
   static int anInt1432 = 0;
   static boolean aBool1433 = false;
   static int anInt1419 = 1489674303;
   static int[] anIntArray1425;
   static int[] anIntArray1428;
   static int anInt1434;
   static int anInt1421;
   static String[] aStringArray1427;

   static void method1416() {
      if(Class16.method622(-769603614)) {
         if(null == aStringArray1427) {
            Class394.method4807(800720083);
         }

         aBool1433 = true;
         anInt1432 = 0;
         Class212.anIntArray2265 = new int[100];
         anIntArray1425 = new int[100];
         anIntArray1428 = new int[100];
         Class84.anIntArray851 = new int[100];

         for(int var0 = 0; var0 < 100; ++var0) {
            Class212.anIntArray2265[var0] = ((int)(Math.random() * (double)(1895615023 * Class566.anInt7611)) << 4) + (int)(Math.random() * 15.0D);
            anIntArray1425[var0] = (int)(Math.random() * 350.0D) << 4;
            anIntArray1428[var0] = (int)(Math.random() * 102.0D) + 51;
            Class84.anIntArray851[var0] = 8 + (int)(Math.random() * 48.0D);
         }

         Class199_Sub9.anIntArray9918 = new int[Class566.anInt7611 * 1895615023 >> 1];
      }

   }

   static void method1417() {
      if(Class16.method622(636305069)) {
         if(null == aStringArray1427) {
            Class394.method4807(39316568);
         }

         aBool1433 = true;
         anInt1432 = 0;
         Class212.anIntArray2265 = new int[100];
         anIntArray1425 = new int[100];
         anIntArray1428 = new int[100];
         Class84.anIntArray851 = new int[100];

         for(int var0 = 0; var0 < 100; ++var0) {
            Class212.anIntArray2265[var0] = ((int)(Math.random() * (double)(1895615023 * Class566.anInt7611)) << 4) + (int)(Math.random() * 15.0D);
            anIntArray1425[var0] = (int)(Math.random() * 350.0D) << 4;
            anIntArray1428[var0] = (int)(Math.random() * 102.0D) + 51;
            Class84.anIntArray851[var0] = 8 + (int)(Math.random() * 48.0D);
         }

         Class199_Sub9.anIntArray9918 = new int[Class566.anInt7611 * 1895615023 >> 1];
      }

   }

   static boolean method1418() {
      return aBool1433;
   }

   static void method1419() {
      anInt1434 = 699087438 + Class680.aClass1_8616.anInt14 * -1397908291 + -1710537783 * Class680.aClass1_8616.anInt12;
      anInt1421 = -1258169735 * Class199_Sub3.aClass1_9887.anInt14 + -612007275 * Class199_Sub3.aClass1_9887.anInt12 + 628213558;
      aStringArray1427 = new String[500];

      for(int var0 = 0; var0 < aStringArray1427.length; ++var0) {
         aStringArray1427[var0] = "";
      }

      Class27.method722(Class45.aClass45_530.method920(Class26.aClass673_247, -827840379), -315839031);
   }

   static void method1420() {
      if(null != Class90.aFileOutputStream863) {
         try {
            Class90.aFileOutputStream863.close();
         } catch (IOException var1) {
            ;
         }
      }

      Class90.aFileOutputStream863 = null;
   }

   static void method1421() {
      anInt1434 = 699087438 + Class680.aClass1_8616.anInt14 * -1397908291 + -1710537783 * Class680.aClass1_8616.anInt12;
      anInt1421 = -1258169735 * Class199_Sub3.aClass1_9887.anInt14 + -612007275 * Class199_Sub3.aClass1_9887.anInt12 + 628213558;
      aStringArray1427 = new String[500];

      for(int var0 = 0; var0 < aStringArray1427.length; ++var0) {
         aStringArray1427[var0] = "";
      }

      Class27.method722(Class45.aClass45_530.method920(Class26.aClass673_247, -827840379), -315839031);
   }

   Class116() throws Throwable {
      throw new Error();
   }

   static void method1422() {
      anInt1434 = 699087438 + Class680.aClass1_8616.anInt14 * -1397908291 + -1710537783 * Class680.aClass1_8616.anInt12;
      anInt1421 = -1258169735 * Class199_Sub3.aClass1_9887.anInt14 + -612007275 * Class199_Sub3.aClass1_9887.anInt12 + 628213558;
      aStringArray1427 = new String[500];

      for(int var0 = 0; var0 < aStringArray1427.length; ++var0) {
         aStringArray1427[var0] = "";
      }

      Class27.method722(Class45.aClass45_530.method920(Class26.aClass673_247, -827840379), -315839031);
   }

   static void method1423() {
      aBool1433 = false;
      Class212.anIntArray2265 = null;
      anIntArray1425 = null;
      anIntArray1428 = null;
      Class84.anIntArray851 = null;
      Class9_Sub1.method10244(257083053);
   }

   static void method1424() {
      aBool1433 = false;
      Class212.anIntArray2265 = null;
      anIntArray1425 = null;
      anIntArray1428 = null;
      Class84.anIntArray851 = null;
      Class9_Sub1.method10244(20198667);
   }

   static void method1425() {
      anInt1434 = 699087438 + Class680.aClass1_8616.anInt14 * -1397908291 + -1710537783 * Class680.aClass1_8616.anInt12;
      anInt1421 = -1258169735 * Class199_Sub3.aClass1_9887.anInt14 + -612007275 * Class199_Sub3.aClass1_9887.anInt12 + 628213558;
      aStringArray1427 = new String[500];

      for(int var0 = 0; var0 < aStringArray1427.length; ++var0) {
         aStringArray1427[var0] = "";
      }

      Class27.method722(Class45.aClass45_530.method920(Class26.aClass673_247, -827840379), -315839031);
   }

   static boolean method1426() {
      return aBool1433;
   }

   static void method1427() {
      if(null != Class90.aFileOutputStream863) {
         try {
            Class90.aFileOutputStream863.close();
         } catch (IOException var1) {
            ;
         }
      }

      Class90.aFileOutputStream863 = null;
   }

   static void method1428() {
   }

   static void method1429() {
      anInt1434 = 699087438 + Class680.aClass1_8616.anInt14 * -1397908291 + -1710537783 * Class680.aClass1_8616.anInt12;
      anInt1421 = -1258169735 * Class199_Sub3.aClass1_9887.anInt14 + -612007275 * Class199_Sub3.aClass1_9887.anInt12 + 628213558;
      aStringArray1427 = new String[500];

      for(int var0 = 0; var0 < aStringArray1427.length; ++var0) {
         aStringArray1427[var0] = "";
      }

      Class27.method722(Class45.aClass45_530.method920(Class26.aClass673_247, -827840379), -315839031);
   }

   static void method1430() {
      aBool1433 = false;
      Class212.anIntArray2265 = null;
      anIntArray1425 = null;
      anIntArray1428 = null;
      Class84.anIntArray851 = null;
      Class9_Sub1.method10244(2126149333);
   }

   public static void method1431(String var0) {
      if(aStringArray1427 == null) {
         Class394.method4807(395664979);
      }

      client.aCalendar11257.setTime(new Date(Class255.time((byte)24)));
      int var1 = client.aCalendar11257.get(11);
      int var2 = client.aCalendar11257.get(12);
      int var3 = client.aCalendar11257.get(13);
      String var4 = Integer.toString(var1 / 10) + var1 % 10 + ":" + var2 / 10 + var2 % 10 + ":" + var3 / 10 + var3 % 10;
      String[] var5 = Class69.method1085(var0, '\n', (byte)7);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         for(int var7 = -1674710087 * anInt1423; var7 > 0; --var7) {
            aStringArray1427[var7] = aStringArray1427[var7 - 1];
         }

         aStringArray1427[0] = var4 + ": " + var5[var6];
         if(Class90.aFileOutputStream863 != null) {
            try {
               Class90.aFileOutputStream863.write(Class465.method5527(aStringArray1427[0] + "\n", (byte)-70));
            } catch (IOException var8) {
               ;
            }
         }

         if(anInt1423 * -1674710087 < aStringArray1427.length - 1) {
            anInt1423 += -1302715767;
            if(-56413471 * anInt1424 > 0) {
               anInt1424 += -658140895;
            }
         }
      }

   }

   public static void method1432(String var0) {
      if(aStringArray1427 == null) {
         Class394.method4807(178874329);
      }

      client.aCalendar11257.setTime(new Date(Class255.time((byte)24)));
      int var1 = client.aCalendar11257.get(11);
      int var2 = client.aCalendar11257.get(12);
      int var3 = client.aCalendar11257.get(13);
      String var4 = Integer.toString(var1 / 10) + var1 % 10 + ":" + var2 / 10 + var2 % 10 + ":" + var3 / 10 + var3 % 10;
      String[] var5 = Class69.method1085(var0, '\n', (byte)7);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         for(int var7 = -1674710087 * anInt1423; var7 > 0; --var7) {
            aStringArray1427[var7] = aStringArray1427[var7 - 1];
         }

         aStringArray1427[0] = var4 + ": " + var5[var6];
         if(Class90.aFileOutputStream863 != null) {
            try {
               Class90.aFileOutputStream863.write(Class465.method5527(aStringArray1427[0] + "\n", (byte)-27));
            } catch (IOException var8) {
               ;
            }
         }

         if(anInt1423 * -1674710087 < aStringArray1427.length - 1) {
            anInt1423 += -1302715767;
            if(-56413471 * anInt1424 > 0) {
               anInt1424 += -658140895;
            }
         }
      }

   }

   static void method1433() {
      aBool1433 = false;
      Class212.anIntArray2265 = null;
      anIntArray1425 = null;
      anIntArray1428 = null;
      Class84.anIntArray851 = null;
      Class9_Sub1.method10244(-355010092);
   }

   static void method1434() {
      if(null != Class90.aFileOutputStream863) {
         try {
            Class90.aFileOutputStream863.close();
         } catch (IOException var1) {
            ;
         }
      }

      Class90.aFileOutputStream863 = null;
   }

   static void method1435() {
      if(-1447723823 * anInt1432 < 102) {
         anInt1432 += -646829786;
      }

      int var0;
      int var1;
      if(-518082495 * anInt1419 != -1 && 2691207922276871701L * Class380_Sub3_Sub1.aLong11404 < Class255.time((byte)24)) {
         for(var0 = -518082495 * anInt1419; var0 < Class506.aStringArray5696.length; ++var0) {
            if(Class506.aStringArray5696[var0].startsWith("pause")) {
               var1 = 5;

               try {
                  var1 = Integer.parseInt(Class506.aStringArray5696[var0].substring(6));
               } catch (Exception var8) {
                  ;
               }

               Class27.method722("Pausing for " + var1 + " seconds...", -315839031);
               anInt1419 = (1 + var0) * -1489674303;
               Class380_Sub3_Sub1.aLong11404 = (Class255.time((byte)24) + (long)(1000 * var1)) * 8389726955050873149L;
               return;
            }

            aString1429 = Class506.aStringArray5696[var0];
            Class711_Sub26.method10086(false, 1719415815);
         }

         anInt1419 = 1489674303;
      }

      if(0 != client.anInt11029 * -1882874795) {
         anInt1424 -= client.anInt11029 * 1764195273;
         if(anInt1424 * -56413471 >= -1674710087 * anInt1423) {
            anInt1424 = -833276967 * anInt1423 - -658140895;
         }

         if(-56413471 * anInt1424 < 0) {
            anInt1424 = 0;
         }

         client.anInt11029 = 0;
      }

      int var2;
      for(var0 = 0; var0 < -1692864865 * client.anInt11146; ++var0) {
         Interface63 var10 = client.anInterface63Array11022[var0];
         var2 = var10.method421(-1838133209);
         char var3 = var10.method427((short)725);
         int var4 = var10.method424(799566286);
         if(var2 == 84) {
            Class711_Sub26.method10086(false, 1890107395);
         }

         if(80 == var2) {
            Class711_Sub26.method10086(true, 1912618780);
         } else if(var2 == 66 && 0 != (var4 & 4)) {
            if(null != Class182.aClipboard2095) {
               String var12 = "";

               for(int var13 = aStringArray1427.length - 1; var13 >= 0; --var13) {
                  if(aStringArray1427[var13] != null && aStringArray1427[var13].length() > 0) {
                     var12 = var12 + aStringArray1427[var13] + '\n';
                  }
               }

               Class182.aClipboard2095.setContents(new StringSelection(var12), (ClipboardOwner)null);
            }
         } else if(67 == var2 && 0 != (var4 & 4)) {
            if(null != Class182.aClipboard2095) {
               try {
                  Transferable var5 = Class182.aClipboard2095.getContents((Object)null);
                  if(null != var5) {
                     String var6 = (String)var5.getTransferData(DataFlavor.stringFlavor);
                     if(null != var6) {
                        String[] var7 = Class69.method1085(var6, '\n', (byte)7);
                        Class190.method2758(var7, -1328519147);
                     }
                  }
               } catch (Exception var9) {
                  ;
               }
            }
         } else if(var2 == 85 && -2112692681 * anInt1431 > 0) {
            aString1429 = aString1429.substring(0, anInt1431 * -2112692681 - 1) + aString1429.substring(-2112692681 * anInt1431);
            anInt1431 -= -1733740665;
         } else if(101 == var2 && -2112692681 * anInt1431 < aString1429.length()) {
            aString1429 = aString1429.substring(0, anInt1431 * -2112692681) + aString1429.substring(1 + -2112692681 * anInt1431);
         } else if(var2 == 96 && anInt1431 * -2112692681 > 0) {
            anInt1431 -= -1733740665;
         } else if(var2 == 97 && -2112692681 * anInt1431 < aString1429.length()) {
            anInt1431 += -1733740665;
         } else if(var2 == 102) {
            anInt1431 = 0;
         } else if(103 == var2) {
            anInt1431 = aString1429.length() * -1733740665;
         } else if(104 == var2 && anInt1430 * -579561805 < aStringArray1427.length) {
            anInt1430 += -1918760837;
            Class413.method4926(2019513325);
            anInt1431 = aString1429.length() * -1733740665;
         } else if(105 == var2 && -579561805 * anInt1430 > 0) {
            anInt1430 -= -1918760837;
            Class413.method4926(2019513325);
            anInt1431 = aString1429.length() * -1733740665;
         } else if(Class329_Sub1.method9044(var3, 1684501034) || "\\/.:, _-+[]~@".indexOf(var3) != -1) {
            aString1429 = aString1429.substring(0, anInt1431 * -2112692681) + client.anInterface63Array11022[var0].method427((short)725) + aString1429.substring(anInt1431 * -2112692681);
            anInt1431 += -1733740665;
         }
      }

      client.anInt11146 = 0;
      client.anInt11034 = 0;
      if(1895615023 * Class566.anInt7611 >> 1 != Class199_Sub9.anIntArray9918.length) {
         Class199_Sub9.anIntArray9918 = new int[Class566.anInt7611 * 1895615023 >> 1];
      }

      for(var0 = 0; var0 < 100; ++var0) {
         anIntArray1425[var0] += Class84.anIntArray851[var0];
         if(anIntArray1425[var0] >> 4 >= 350) {
            var1 = Class212.anIntArray2265[var0] >> 4;
            var2 = Class212.anIntArray2265[var0] & 15;
            var1 += Class443.anIntArray4895[64 * ((var1 & 64) + 350) + var2 * 1023 & 16383] >> 10;
            var1 >>= 1;

            for(int var11 = -3; var11 <= 3; ++var11) {
               if(var1 + var11 >= 0 && var11 + var1 < Class199_Sub9.anIntArray9918.length) {
                  Class199_Sub9.anIntArray9918[var11 + var1] += 4 - Math.abs(var11);
               }
            }

            Class212.anIntArray2265[var0] = ((int)(Math.random() * (double)(Class566.anInt7611 * 1895615023)) << 4) + (int)(Math.random() * 15.0D);
            anIntArray1425[var0] = 0;
            anIntArray1428[var0] = (int)(Math.random() * 102.0D) + 51;
            Class84.anIntArray851[var0] = 8 + (int)(Math.random() * 48.0D);
         }
      }

      Class9_Sub1.method10244(2131784328);
   }

   static void method1436(int var0) {
      if(var0 == 21) {
         throw new Error();
      } else if(var0 == 9) {
         throw new OutOfMemoryError();
      } else {
         try {
            if(6 == var0) {
               Class169.method2125(1258125151);
            } else if(16 == var0) {
               Class27.method722("" + Class499.anInt5627 * -421428705, -315839031);
            } else if(3 == var0) {
               Class562 var1 = client.aClass505_11204.method6072(740567523).aClass562_7300;
               var1.aBool7586 = !var1.aBool7586;
            } else if(var0 == 24) {
               client.aBool11015 = true;
            } else if(var0 == 23) {
               client.aBool11015 = false;
            } else if(19 == var0) {
               client.aClass686_11103.method8050((short)-10022);
            } else {
               int var2;
               int var5;
               Runtime var6;
               if(29 == var0) {
                  Class329_Sub1.method9043(1326278026);

                  for(var5 = 0; var5 < 10; ++var5) {
                     System.gc();
                  }

                  var6 = Runtime.getRuntime();
                  var2 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
                  Class27.method722("" + var2, -315839031);
               } else if(var0 == 27) {
                  Class329_Sub1.method9043(-1465647834);

                  for(var5 = 0; var5 < 10; ++var5) {
                     System.gc();
                  }

                  var6 = Runtime.getRuntime();
                  var2 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
                  Class27.method722("" + var2, -315839031);
                  Class311.method4069((byte)1);
                  Class329_Sub1.method9043(454611425);

                  for(int var3 = 0; var3 < 10; ++var3) {
                     System.gc();
                  }

                  var2 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
                  Class27.method722("" + var2, -315839031);
               } else if(5 == var0) {
                  Class27.method722(Class611.aClass520_8020.method398(-1181563247)?"Success":"Failure", -315839031);
               } else if(28 == var0) {
                  Class16.aClass6_171.method548((byte)104);
               } else if(22 == var0) {
                  Class247.aClass460_2688.method5436(25631353);
               } else if(var0 == 13) {
                  Class247.aClass460_2688.method5435(246253467);
               } else if(7 == var0) {
                  Class425.aCanvas4798.setLocation(50, 50);
               } else if(25 == var0) {
                  Class425.aCanvas4798.setLocation(Class499.anInt5594 * -1115728897, Class499.anInt5605 * 1208004069);
               } else if(17 == var0) {
                  Class9_Sub1.method10245(776633539);
               } else if(8 == var0) {
                  client.aClass505_11204.aLong5692 = Class255.time((byte)24) * 3409037048711903181L;
                  client.aClass505_11204.aBool5691 = true;
                  Class9_Sub1.method10245(776633539);
               } else {
                  Class446 var7;
                  if(10 == var0) {
                     var7 = Class451.localPlayer.method7635().aClass446_4816;
                     Class27.method722(((int)var7.aFloat4917 >> 9) + " " + ((int)var7.aFloat4919 >> 9), -315839031);
                  } else if(var0 == 11) {
                     var7 = Class451.localPlayer.method7635().aClass446_4816;
                     Class27.method722("" + client.aClass505_11204.method6072(363701015).aClass148Array7288[Class451.localPlayer.aByte10827].method1714((int)var7.aFloat4917 >> 9, (int)var7.aFloat4919 >> 9, 1335986454), -315839031);
                  } else if(var0 == 1) {
                     Class27.method722(InterfaceDef.aClass192_2489.method2785(-289923479) + " " + InterfaceDef.aClass192_2489.method2771(1196473194), -315839031);
                     Class27.method722(InterfaceDef.aClass192_2492.method2785(-289923479) + " " + InterfaceDef.aClass192_2492.method2771(1901584590), -315839031);
                  } else if(4 == var0) {
                     Class571.method6896(false, 1485534069);
                  } else {
                     if(20 == var0) {
                        client.aBool11016 = !client.aBool11016;
                        Class554.aClass174_7475.method2359(client.aBool11016);
                        Class163_Sub2.method8597(-1770979538);
                        return;
                     }

                     if(14 == var0) {
                        client.anInt11025 = 0;
                        client.aClass505_11204.method6078(-2134412612);
                     } else if(15 == var0) {
                        client.anInt11025 = -349398387;
                        client.aClass505_11204.method6078(-2054312017);
                     } else if(var0 == 26) {
                        client.anInt11025 = -698796774;
                        client.aClass505_11204.method6078(-2087435091);
                     }
                  }
               }
            }

         } catch (Exception var4) {
            Class27.method722(Class45.aClass45_463.method920(Class26.aClass673_247, -827840379), -315839031);
         }
      }
   }

   static void method1437(int var0) {
      if(var0 == 21) {
         throw new Error();
      } else if(var0 == 9) {
         throw new OutOfMemoryError();
      } else {
         try {
            if(6 == var0) {
               Class169.method2125(-663647282);
            } else if(16 == var0) {
               Class27.method722("" + Class499.anInt5627 * -421428705, -315839031);
            } else if(3 == var0) {
               Class562 var1 = client.aClass505_11204.method6072(-1758959062).aClass562_7300;
               var1.aBool7586 = !var1.aBool7586;
            } else if(var0 == 24) {
               client.aBool11015 = true;
            } else if(var0 == 23) {
               client.aBool11015 = false;
            } else if(19 == var0) {
               client.aClass686_11103.method8050((short)12708);
            } else {
               int var2;
               int var5;
               Runtime var6;
               if(29 == var0) {
                  Class329_Sub1.method9043(-192411991);

                  for(var5 = 0; var5 < 10; ++var5) {
                     System.gc();
                  }

                  var6 = Runtime.getRuntime();
                  var2 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
                  Class27.method722("" + var2, -315839031);
               } else if(var0 == 27) {
                  Class329_Sub1.method9043(-296552049);

                  for(var5 = 0; var5 < 10; ++var5) {
                     System.gc();
                  }

                  var6 = Runtime.getRuntime();
                  var2 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
                  Class27.method722("" + var2, -315839031);
                  Class311.method4069((byte)1);
                  Class329_Sub1.method9043(1485158471);

                  for(int var3 = 0; var3 < 10; ++var3) {
                     System.gc();
                  }

                  var2 = (int)((var6.totalMemory() - var6.freeMemory()) / 1024L);
                  Class27.method722("" + var2, -315839031);
               } else if(5 == var0) {
                  Class27.method722(Class611.aClass520_8020.method398(-1181563247)?"Success":"Failure", -315839031);
               } else if(28 == var0) {
                  Class16.aClass6_171.method548((byte)110);
               } else if(22 == var0) {
                  Class247.aClass460_2688.method5436(1618435288);
               } else if(var0 == 13) {
                  Class247.aClass460_2688.method5435(-861486657);
               } else if(7 == var0) {
                  Class425.aCanvas4798.setLocation(50, 50);
               } else if(25 == var0) {
                  Class425.aCanvas4798.setLocation(Class499.anInt5594 * -1115728897, Class499.anInt5605 * 1208004069);
               } else if(17 == var0) {
                  Class9_Sub1.method10245(776633539);
               } else if(8 == var0) {
                  client.aClass505_11204.aLong5692 = Class255.time((byte)24) * 3409037048711903181L;
                  client.aClass505_11204.aBool5691 = true;
                  Class9_Sub1.method10245(776633539);
               } else {
                  Class446 var7;
                  if(10 == var0) {
                     var7 = Class451.localPlayer.method7635().aClass446_4816;
                     Class27.method722(((int)var7.aFloat4917 >> 9) + " " + ((int)var7.aFloat4919 >> 9), -315839031);
                  } else if(var0 == 11) {
                     var7 = Class451.localPlayer.method7635().aClass446_4816;
                     Class27.method722("" + client.aClass505_11204.method6072(1560044670).aClass148Array7288[Class451.localPlayer.aByte10827].method1714((int)var7.aFloat4917 >> 9, (int)var7.aFloat4919 >> 9, -653214173), -315839031);
                  } else if(var0 == 1) {
                     Class27.method722(InterfaceDef.aClass192_2489.method2785(-289923479) + " " + InterfaceDef.aClass192_2489.method2771(-739091750), -315839031);
                     Class27.method722(InterfaceDef.aClass192_2492.method2785(-289923479) + " " + InterfaceDef.aClass192_2492.method2771(-1968036595), -315839031);
                  } else if(4 == var0) {
                     Class571.method6896(false, 1939561587);
                  } else {
                     if(20 == var0) {
                        client.aBool11016 = !client.aBool11016;
                        Class554.aClass174_7475.method2359(client.aBool11016);
                        Class163_Sub2.method8597(851197616);
                        return;
                     }

                     if(14 == var0) {
                        client.anInt11025 = 0;
                        client.aClass505_11204.method6078(-2085801913);
                     } else if(15 == var0) {
                        client.anInt11025 = -349398387;
                        client.aClass505_11204.method6078(-2014550285);
                     } else if(var0 == 26) {
                        client.anInt11025 = -698796774;
                        client.aClass505_11204.method6078(-2095616391);
                     }
                  }
               }
            }

         } catch (Exception var4) {
            Class27.method722(Class45.aClass45_463.method920(Class26.aClass673_247, -827840379), -315839031);
         }
      }
   }

   static void method1438() {
      if(Class230.preferences.aClass711_Sub25_10626.method10074((byte)-126) == 1) {
         Class297.aClass517_3235.method6217(new Class509(Class502.aClass502_5640, (Buffer)null), 1080181502);
      } else {
         client.aClass505_11204.method6078(-2058170910);
         Class613.method7239((byte)79);
      }

   }

   static void method1439() {
      if(Class230.preferences.aClass711_Sub25_10626.method10074((byte)-125) == 1) {
         Class297.aClass517_3235.method6217(new Class509(Class502.aClass502_5640, (Buffer)null), 1735720576);
      } else {
         client.aClass505_11204.method6078(-2112122125);
         Class613.method7239((byte)64);
      }

   }

   static void method1440() {
      if(Class230.preferences.aClass711_Sub25_10626.method10074((byte)-123) == 1) {
         Class297.aClass517_3235.method6217(new Class509(Class502.aClass502_5640, (Buffer)null), -187792093);
      } else {
         client.aClass505_11204.method6078(-2010115552);
         Class613.method7239((byte)59);
      }

   }

   static final void method1441(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-67);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1115410879 * var3.anInt2543;
   }

   static final void method1442(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class11 var3 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -227348167);
      if(var3.anInt86 * 1201332159 == -1 && 1447315211 * var3.anInt120 >= 0) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt120 * 1447315211;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2;
      }

   }
}
