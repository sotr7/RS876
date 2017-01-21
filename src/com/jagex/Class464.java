package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class143;
import com.jagex.Class157;
import com.jagex.Class174;
import com.jagex.Class273;
import com.jagex.Class380_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class452;
import com.jagex.Class452_Sub4;
import com.jagex.Class459;
import com.jagex.Class480;
import com.jagex.Class481;
import com.jagex.Class526_Sub21_Sub3;
import com.jagex.OutFrameBuffer;
import com.jagex.Class561;
import com.jagex.Class570;
import com.jagex.Class585;
import com.jagex.Class594;
import com.jagex.Class611;
import com.jagex.Class622;
import com.jagex.Class65;
import com.jagex.Class655;
import com.jagex.Class681;
import com.jagex.Class685;
import com.jagex.Class711_Sub12;
import com.jagex.Exception_Sub3;
import com.jagex.Interface18;
import com.jagex.client;
import com.jagex.twitchtv.TwitchEvent;

public class Class464 {
   static int anInt5232;

   public static int method5480(int var0, int var1, int var2) {
      var2 &= 3;
      return 0 == var2?var1:(1 == var2?4095 - var0:(2 == var2?4095 - var1:var0));
   }

   public static int method5481(int var0, int var1, int var2) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }

   public static int method5482(int var0, int var1, int var2) {
      var2 &= 3;
      return 0 == var2?var1:(var2 == 1?7 - var0:(var2 == 2?7 - var1:var0));
   }

   Class464() throws Throwable {
      throw new Error();
   }

   public static int method5483(int var0, int var1, int var2) {
      var2 &= 3;
      return 0 == var2?var0:(var2 == 1?var1:(var2 == 2?4095 - var0:4095 - var1));
   }

   public static int method5484(int var0, int var1, int var2) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }

   public static int method5485(int var0, int var1, int var2) {
      var2 &= 3;
      return 0 == var2?var1:(1 == var2?4095 - var0:(2 == var2?4095 - var1:var0));
   }

   public static int method5486(int var0, int var1, int var2) {
      var2 &= 3;
      return 0 == var2?var1:(var2 == 1?7 - var0:(var2 == 2?7 - var1:var0));
   }

   public static void method5487(Class174 var0, long var1) {
      if(3 != Class570.anInt7634 * -1138125845 && Class570.anInt7634 * -1138125845 != 0) {
         int var4;
         if(1 == Class570.anInt7634 * -1138125845) {
            if(Class570.aStringArray7650 == null || 0 == Class570.aStringArray7650.length) {
               throw new RuntimeException("");
            }

            int var3 = 0;

            for(var4 = 0; var4 < Class570.aStringArray7650.length; ++var4) {
               if(null != Class570.aStringArray7650[var4]) {
                  try {
                     var3 += Class611.aClass520_8020.method6247(Class570.aStringArray7650[var4], 527986610);
                  } catch (Exception_Sub3 var7) {
                     Class157.method1862(Class65.aClass65_748, var7.aString11353, 1675998541 * var7.anInt11354, var7.getCause(), (byte)71);
                     Class570.anInt7634 = 683931209;
                     return;
                  }
               } else {
                  var3 += 100;
               }
            }

            Class570.anInt7652 = 1339795653 * (var3 / Class570.aStringArray7650.length);
            if(Class570.anInt7652 * -1502505459 != 100) {
               return;
            }

            Class570.anInt7634 = Class685.method8049(243562845) * 1659632835;
            if(2 != -1138125845 * Class570.anInt7634) {
               return;
            }
         }

         TwitchEvent[] var8 = Class570.aTwitchTV7639.Service();
         if(null != var8) {
            for(var4 = 0; var4 < var8.length; ++var4) {
               TwitchEvent var5 = var8[var4];
               if(var5 != null && Class459.method5421(var5, var1)) {
                  Class585 var6 = var5.method4883();
                  if(var6 != null) {
                     Class480.method5754(var6.getId(), var5, 216547802);
                  }
               }
            }
         }

         if(Class570.aTwitchTV7639.IsStreaming() && var1 - 7469632089352811399L * Class570.aLong7640 > -1195489500385517635L * Class561.aLong7557) {
            Class570.aLong7640 = 5208146885053227575L * var1;
            if(var0.method2299()) {
               Class570.aBool7644 = true;
            }
         }

         if(Class570.aTwitchTV7639.IsStreaming()) {
            if(var1 - Class570.aLong7641 * 8933543401554381359L < (long)(1976642135 * Class570.anInt7631)) {
               Class570.anInt7635 = 86905370;
            } else if(var1 - Class570.aLong7633 * 1177678582283212285L < (long)(1976642135 * Class570.anInt7631)) {
               Class570.anInt7635 = 43452685;
            } else {
               Class570.anInt7635 = 0;
            }
         } else {
            Class570.anInt7635 = 0;
         }

         if(var1 - Class570.aLong7637 * -1720179505655838517L > (long)(Class570.anInt7655 * 1608906361) && Class570.aTwitchTV7639.GetWebcamState() == 5) {
            Class570.aTwitchTV7639.RestartWebcamDevice();
            Class570.aLong7637 = -27567453160858397L * var1;
         }

      }
   }

   static final void method5488(Class681 var0, int var1) {
      Class143 var2 = (Class143)var0.aClass526_Sub21_Sub19_8629.anObjectArray11861[-244840757 * var0.anInt8644];
      Interface18 var3 = (Interface18)(var0.anIntArray8642[-244840757 * var0.anInt8644] == 0?var0.aMap8638.get(var2.aClass452_1675):var0.aMap8627.get(var2.aClass452_1675));
      Class481 var4 = var2.aClass454_1676.method5389((byte)36);
      if(var4 == Class481.aClass481_5461) {
         if(var2.aClass452_1675 == Class452.aClass452_4938) {
            Class526_Sub21_Sub3.method10428(var2, 1131125973);
         }

         var3.method111(var2, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (byte)24);
      } else if(var4 == Class481.aClass481_5457) {
         var3.method110(var2, var0.aLongArray8626[(var0.anInt8630 -= 1112803603) * -1032509157]);
      } else {
         if(var4 != Class481.aClass481_5458) {
            throw new RuntimeException();
         }

         if(var2.aClass452_1675 == Class452.aClass452_4938) {
            Class711_Sub12.method9966(var2, -1478791206);
         }

         var3.method115(var2, var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629], (byte)-4);
      }

   }

   static final void method5489(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class622.aClass455_8143.method5398(var2, (byte)69).aString11849;
   }

   static final void method5490(Class681 var0, byte var1) {
      Class273.method3612(0, 0, -99858407 * client.aClass245_11194.anInt2510, -667181623 * client.aClass245_11194.anInt2576, false, (byte)116);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 553698849 * client.anInt11284;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.anInt11285 * 2102424733;
   }

   static final void method5491(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aBool11161 && !client.aBool11162?1:0;
   }

   static final void method5492(Class681 var0, byte var1) {
      Class380_Sub1.aClass269_10121.method3586(2060631948);
   }

   public static final void method5493(String var0, short var1) {
      if(null != Class655.aClass107Array8488) {
         Class111 var2 = Class452_Sub4.method9295((byte)115);
         OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4260, var2.aClass14_1342, 511300341);
         var3.out.writeByte(Class594.method7039(var0, -535256214), -1942856052);
         var3.out.method9616(var0, 1430998184);
         var2.write(var3, (byte)2);
      }
   }

   static final void method5494(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).method3091(var3, var4, 1962451992) == null?0:1;
   }
}
