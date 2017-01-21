package com.jagex;

import com.jagex.Class115;
import com.jagex.Class16;
import com.jagex.Class163_Sub2;
import com.jagex.Class169;
import com.jagex.Class203;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class27;
import com.jagex.Class311;
import com.jagex.Class315_Sub1;
import com.jagex.Class329_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class425;
import com.jagex.Class446;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class499;
import com.jagex.OutFrameBuffer;
import com.jagex.Class554;
import com.jagex.Class555;
import com.jagex.Class562;
import com.jagex.Class571;
import com.jagex.Class611;
import com.jagex.Class681;
import com.jagex.Class9_Sub1;
import com.jagex.Interface76;
import com.jagex.client;
import java.util.Stack;

public class Class463 implements Interface76 {
   static String aString5231;
   static Class463 aClass463_5230 = new Class463(0);
   static Class463 aClass463_5228 = new Class463(1);
   static Class463 aClass463_5229 = new Class463(2);
   int anInt5227;

   public int method21() {
      return 1627882715 * this.anInt5227;
   }

   public int getId() {
      return 1627882715 * this.anInt5227;
   }

   Class463(int var1) {
      this.anInt5227 = var1 * 1890899795;
   }

   public static Class555 method5475(boolean var0, short var1) {
      Stack var2 = Class555.aStack7478;
      synchronized(var2) {
         Class555 var3;
         if(Class555.aStack7478.isEmpty()) {
            var3 = new Class555();
         } else {
            var3 = (Class555)Class555.aStack7478.pop();
         }

         var3.aBool7479 = var0;
         return var3;
      }
   }

   static final void method5476(InterfaceDef var0, Class243 var1, Class681 var2, short var3) {
      var0.anInt2600 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 291325009;
   }

   static final void method5477(Class681 var0, short var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)95);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class203.method2887(var3, var4, var0, 1289834404);
   }

   static final void method5478(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4202, client.aClass111_11060.aClass14_1342, 310802668);
      var3.out.writeByte(var2.length() + 1, -2038943445);
      var3.out.method9616(var2, -725670120);
      client.aClass111_11060.write(var3, (byte)42);
   }

   static void method5479(int var0, int var1) {
      if(var0 == 21) {
         throw new Error();
      } else if(var0 == 9) {
         throw new OutOfMemoryError();
      } else {
         try {
            if(6 == var0) {
               Class169.method2125(1937156722);
            } else if(16 == var0) {
               Class27.method722("" + Class499.anInt5627 * -421428705, -315839031);
            } else if(3 == var0) {
               Class562 var2 = client.aClass505_11204.method6072(-456100047).aClass562_7300;
               var2.aBool7586 = !var2.aBool7586;
            } else if(var0 == 24) {
               client.aBool11015 = true;
            } else if(var0 == 23) {
               client.aBool11015 = false;
            } else if(19 == var0) {
               client.aClass686_11103.method8050((short)-10108);
            } else {
               int var3;
               int var6;
               Runtime var7;
               if(29 == var0) {
                  Class329_Sub1.method9043(1893859630);

                  for(var6 = 0; var6 < 10; ++var6) {
                     System.gc();
                  }

                  var7 = Runtime.getRuntime();
                  var3 = (int)((var7.totalMemory() - var7.freeMemory()) / 1024L);
                  Class27.method722("" + var3, -315839031);
               } else if(var0 == 27) {
                  Class329_Sub1.method9043(-1724408276);

                  for(var6 = 0; var6 < 10; ++var6) {
                     System.gc();
                  }

                  var7 = Runtime.getRuntime();
                  var3 = (int)((var7.totalMemory() - var7.freeMemory()) / 1024L);
                  Class27.method722("" + var3, -315839031);
                  Class311.method4069((byte)1);
                  Class329_Sub1.method9043(1320792814);

                  for(int var4 = 0; var4 < 10; ++var4) {
                     System.gc();
                  }

                  var3 = (int)((var7.totalMemory() - var7.freeMemory()) / 1024L);
                  Class27.method722("" + var3, -315839031);
               } else if(5 == var0) {
                  Class27.method722(Class611.aClass520_8020.method398(-1181563247)?"Success":"Failure", -315839031);
               } else if(28 == var0) {
                  Class16.aClass6_171.method548((byte)121);
               } else if(22 == var0) {
                  Class247.aClass460_2688.method5436(-106371828);
               } else if(var0 == 13) {
                  Class247.aClass460_2688.method5435(-1308370036);
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
                  Class446 var8;
                  if(10 == var0) {
                     var8 = Class451.localPlayer.method7635().aClass446_4816;
                     Class27.method722(((int)var8.aFloat4917 >> 9) + " " + ((int)var8.aFloat4919 >> 9), -315839031);
                  } else if(var0 == 11) {
                     var8 = Class451.localPlayer.method7635().aClass446_4816;
                     Class27.method722("" + client.aClass505_11204.method6072(1935554160).aClass148Array7288[Class451.localPlayer.aByte10827].method1714((int)var8.aFloat4917 >> 9, (int)var8.aFloat4919 >> 9, 1878782439), -315839031);
                  } else if(var0 == 1) {
                     Class27.method722(InterfaceDef.aClass192_2489.method2785(-289923479) + " " + InterfaceDef.aClass192_2489.method2771(1648830741), -315839031);
                     Class27.method722(InterfaceDef.aClass192_2492.method2785(-289923479) + " " + InterfaceDef.aClass192_2492.method2771(-518561881), -315839031);
                  } else if(4 == var0) {
                     Class571.method6896(false, 515483928);
                  } else {
                     if(20 == var0) {
                        client.aBool11016 = !client.aBool11016;
                        Class554.aClass174_7475.method2359(client.aBool11016);
                        Class163_Sub2.method8597(206133712);
                        return;
                     }

                     if(14 == var0) {
                        client.anInt11025 = 0;
                        client.aClass505_11204.method6078(-2064895149);
                     } else if(15 == var0) {
                        client.anInt11025 = -349398387;
                        client.aClass505_11204.method6078(-2039510512);
                     } else if(var0 == 26) {
                        client.anInt11025 = -698796774;
                        client.aClass505_11204.method6078(-2062225463);
                     }
                  }
               }
            }

         } catch (Exception var5) {
            Class27.method722(Class45.aClass45_463.method920(Class26.aClass673_247, -827840379), -315839031);
         }
      }
   }
}
