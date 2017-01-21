package com.jagex;

import com.jagex.Class1;
import com.jagex.Class160;
import com.jagex.Class174;
import com.jagex.Class184;
import com.jagex.Class219;
import com.jagex.Class231;
import com.jagex.Class31;
import com.jagex.Class311;
import com.jagex.Class41;
import com.jagex.Class458;
import com.jagex.Class523;
import com.jagex.Class525;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class526_Sub24;
import com.jagex.Class526_Sub25;
import com.jagex.Class526_Sub33;
import com.jagex.Class526_Sub35;
import com.jagex.Class526_Sub6;
import com.jagex.Class549;
import com.jagex.Class566;
import com.jagex.Class57;
import com.jagex.Class570;
import com.jagex.Class594;
import com.jagex.Class610;
import com.jagex.Class681;
import com.jagex.Class687;
import com.jagex.Class693;
import com.jagex.Class711_Sub28;
import com.jagex.Class711_Sub36;
import com.jagex.Interface59;
import com.jagex.Interface69;
import com.jagex.Interface70;
import com.jagex.client;

class Class230 implements Interface69 {
   public static Class526_Sub33 preferences;
   // $FF: synthetic field
   Class231 this$0;

   public void method441(Interface70 var1) {
      if(var1 != null) {
         this.this$0.method3187(-1305285430).method2765((long)var1.method449((byte)20));
      }
   }

   public void method440(Interface70 var1, int var2, int var3, boolean var4, int var5) {
      this.this$0.method3216(1307040911).add(var1);
      if(var4) {
         this.this$0.method3206(-1730576285).method2768(var1, (long)var3);
      } else {
         this.this$0.method3187(-1305285430).method2781(var1, (long)var3, var1.method456((byte)16), (byte)21);
      }

   }

   public void method438(Interface70 var1, byte var2) {
      if(var1 != null) {
         this.this$0.method3187(-1305285430).method2765((long)var1.method449((byte)48));
      }
   }

   Class230(Class231 var1) {
      this.this$0 = var1;
   }

   public void method437(Interface70 var1) {
      if(var1 != null) {
         this.this$0.method3187(-1305285430).method2765((long)var1.method449((byte)50));
      }
   }

   public void method439(Interface70 var1, int var2, int var3, boolean var4) {
      this.this$0.method3216(1307040911).add(var1);
      if(var4) {
         this.this$0.method3206(-1730576285).method2768(var1, (long)var3);
      } else {
         this.this$0.method3187(-1305285430).method2781(var1, (long)var3, var1.method456((byte)16), (byte)-19);
      }

   }

   static void method3180(Class174 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Class549 var9 = client.aClass505_11204.method6072(-2018633192);
      Interface59 var10 = (Interface59)var9.method6589(var1, var2, var3, (byte)24);
      Class610 var11;
      int var12;
      int var13;
      int var14;
      if(var10 != null) {
         var11 = (Class610)client.aClass505_11204.method6066(-631188979).method89(var10.method56(743105945), -796382422);
         var12 = var10.method379((byte)17) & 3;
         var13 = var10.method87(-102558605);
         if(var11.anInt7970 * -549491903 != -1) {
            Class711_Sub28.method10101(var0, var11, var12, var4, var5, 209323357);
         } else {
            var14 = var6;
            if(909601847 * var11.anInt7954 > 0) {
               var14 = var7;
            }

            if(var13 == -1226971375 * Class594.aClass594_7822.anInt7833 || var13 == Class594.aClass594_7823.anInt7833 * -1226971375) {
               if(0 == var12) {
                  var0.method2288(var4, var5, 4, var14, 358934923);
               } else if(var12 == 1) {
                  var0.method2344(var4, var5, 4, var14, -88779280);
               } else if(var12 == 2) {
                  var0.method2288(3 + var4, var5, 4, var14, -1976648958);
               } else if(var12 == 3) {
                  var0.method2344(var4, 3 + var5, 4, var14, -835982351);
               }
            }

            if(var13 == -1226971375 * Class594.aClass594_7824.anInt7833) {
               if(0 == var12) {
                  var0.method2356(var4, var5, 1, 1, var14, (byte)47);
               } else if(1 == var12) {
                  var0.method2356(var4 + 3, var5, 1, 1, var14, (byte)74);
               } else if(2 == var12) {
                  var0.method2356(var4 + 3, 3 + var5, 1, 1, var14, (byte)101);
               } else if(3 == var12) {
                  var0.method2356(var4, 3 + var5, 1, 1, var14, (byte)89);
               }
            }

            if(-1226971375 * Class594.aClass594_7823.anInt7833 == var13) {
               if(0 == var12) {
                  var0.method2344(var4, var5, 4, var14, -1378863218);
               } else if(var12 == 1) {
                  var0.method2288(var4 + 3, var5, 4, var14, -6963226);
               } else if(2 == var12) {
                  var0.method2344(var4, var5 + 3, 4, var14, 1745100436);
               } else if(3 == var12) {
                  var0.method2288(var4, var5, 4, var14, -164134863);
               }
            }
         }
      }

      var10 = (Interface59)var9.method6591(var1, var2, var3, client.anInterface64_11296, 1739430101);
      if(null != var10) {
         var11 = (Class610)client.aClass505_11204.method6066(-631188979).method89(var10.method56(809593933), -1934400221);
         var12 = var10.method379((byte)28) & 3;
         var13 = var10.method87(215375324);
         if(var11.anInt7970 * -549491903 != -1) {
            Class711_Sub28.method10101(var0, var11, var12, var4, var5, -1651473398);
         } else if(var13 == Class594.aClass594_7844.anInt7833 * -1226971375) {
            var14 = -1118482;
            if(var11.anInt7954 * 909601847 > 0) {
               var14 = -1179648;
            }

            if(0 != var12 && var12 != 2) {
               var0.method2465(var4, var5, var4 + 3, 3 + var5, var14, -1018700093);
            } else {
               var0.method2465(var4, var5 + 3, var4 + 3, var5, var14, -939491223);
            }
         }
      }

      var10 = (Interface59)var9.method6593(var1, var2, var3, -589937347);
      if(null != var10) {
         var11 = (Class610)client.aClass505_11204.method6066(-631188979).method89(var10.method56(2074335665), 288310652);
         var12 = var10.method379((byte)-83) & 3;
         if(-549491903 * var11.anInt7970 != -1) {
            Class711_Sub28.method10101(var0, var11, var12, var4, var5, -1054041700);
         }
      }

   }

   public static int method3181(int var0) {
      return Class570.anInt7634 * -1138125845;
   }

   static final void method3182(Class681 var0, byte var1) {
      Class526_Sub35 var2 = Class160.method1882((byte)19);
      if(null == var2) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1572922363 * var2.anInt10664;
         int var3 = var2.anInt10663 * 325515905 << 28 | 1427294417 * var2.anInt10665 + Class525.anInt7107 << 14 | var2.anInt10662 * -1722563897 + Class525.anInt7150;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3;
      }

   }

   static final void method3183(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.anInt11186 * -327748687;
   }

   static void method3184(Class526_Sub21_Sub7 var0, int var1, byte var2) {
      if(Class31.aBool291) {
         Class1 var3 = Class526_Sub6.method9340(-1758658441);
         int var4 = 0;

         int var6;
         for(Class526_Sub21_Sub6 var5 = (Class526_Sub21_Sub6)var0.aClass696_11662.method8143((byte)-1); var5 != null; var5 = (Class526_Sub21_Sub6)var0.aClass696_11662.method8139(68831625)) {
            var6 = Class458.method5416(var5, var3, (byte)24);
            if(var6 > var4) {
               var4 = var6;
            }
         }

         var4 += 8;
         int var9 = 21 + var0.anInt11664 * -1095890769 * Class31.anInt262 * 414128345;
         Class523.anInt7075 = ((Class31.aBool302?26:22) + var0.anInt11664 * -1095890769 * 414128345 * Class31.anInt262) * -1824098209;
         var6 = Class41.anInt450 * 1183999269 + 2110689557 * Class219.anInt2295;
         if(var4 + var6 > Class566.anInt7611 * 1895615023) {
            var6 = 1183999269 * Class41.anInt450 - var4;
         }

         if(var6 < 0) {
            var6 = 0;
         }

         int var7 = Class31.aBool302?96898447 * var3.anInt12 + 20 + 1:31;
         int var8 = 1 + var1 - var7 + var3.anInt12 * 96898447;
         if(var9 + var8 > Class526_Sub24.anInt10549 * 974996221) {
            var8 = Class526_Sub24.anInt10549 * 974996221 - var9;
         }

         if(var8 < 0) {
            var8 = 0;
         }

         Class711_Sub36.anInt10917 = 448199597 * var6;
         Class311.anInt3384 = var8 * 73420983;
         Class526_Sub25.anInt10551 = var4 * 863779277;
         Class31.aClass526_Sub21_Sub7_267 = var0;
      }
   }

   public static Class693 method3185(int var0) {
      return Class57.aClass693_684 == null?Class693.aClass693_8705:Class57.aClass693_684;
   }

   static final void method3186(Class681 var0, int var1) {
      if(Class184.anIntArray2116 != null && Class687.anInt8679 * -1164197563 < Class184.anIntArray2116.length) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class184.anIntArray2116[(Class687.anInt8679 += -1725912691) * -1164197563 - 1] & '\uffff';
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      }

   }
}
