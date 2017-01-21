package com.jagex;

import com.jagex.Class105;
import com.jagex.Class143;
import com.jagex.Class184;
import com.jagex.Class202;
import com.jagex.Class221;
import com.jagex.Class242;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class32;
import com.jagex.Class334;
import com.jagex.Class476;
import com.jagex.Class509;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub24;
import com.jagex.Class526_Sub31;
import com.jagex.Class538;
import com.jagex.Class593;
import com.jagex.Class641;
import com.jagex.Class704_Sub1;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.client;

public abstract class Class184_Sub2 extends Class184 {
   protected static final int anInt9212 = 4;

   public abstract void method8464(Interface23 var1);

   public abstract void method8465(int var1, Interface21 var2);

   public abstract boolean method8466();

   public abstract boolean method8467();

   public abstract void method8468(int var1, Interface21 var2);

   public abstract void method8469(int var1, Interface21 var2);

   public abstract void method8470(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8);

   public abstract void method8471(Interface23 var1);

   public abstract boolean method8472();

   public abstract boolean method8473();

   public abstract void method8474(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8);

   public abstract void method8475(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8);

   public abstract void method8476(Interface23 var1);

   public abstract void method8477(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8);

   public static String method8478(int var0) {
      return Class202.aString2212;
   }

   static final void method8479(int var0) {
      for(int var1 = Class242.aClass94_2456.aClass600_1154.method7084(true, (byte)1); var1 != -1; var1 = Class242.aClass94_2456.aClass600_1154.method7084(false, (byte)1)) {
         Class526_Sub24.method9482(var1, (byte)13);
         client.anIntArray11217[(client.anInt11216 += 416029619) * -179696773 - 1 & 63] = var1;
      }

      for(Class526_Sub21_Sub9 var2 = Class334.method4265(-164073717); null != var2; var2 = Class334.method4265(-469126732)) {
         int var3 = var2.method10585((byte)10);
         long var4 = var2.method10586(-111393400);
         Class143 var14;
         if(var3 == 1) {
            var14 = (Class143)Class641.aClass97_Sub1_Sub2_8349.method89((int)var4, -383860382);
            Class538.aClass149_Sub1_7225.method111(var14, 1720305119 * var2.anInt11678, (byte)24);
            client.anIntArray11125[(client.anInt11313 += -874957345) * -473569 - 1 & 63] = (int)var4;
         } else if(2 == var3) {
            var14 = (Class143)Class641.aClass97_Sub1_Sub2_8349.method89((int)var4, -1142240491);
            Class538.aClass149_Sub1_7225.method115(var14, var2.aString11690, (byte)-118);
            client.anIntArray11294[(client.anInt11226 += -476661391) * 890038161 - 1 & 63] = (int)var4;
         } else {
            InterfaceDef var6;
            if(3 == var3) {
               var6 = Class221.method3095((int)var4, (byte)67);
               if(!var2.aString11690.equals(var6.aString2575)) {
                  var6.aString2575 = var2.aString11690;
                  Class526_Sub31.method9555(var6, (byte)10);
               }
            } else if(var3 == 23) {
               var6 = Class221.method3095((int)var4, (byte)-10);
               if(var2.anInt11678 * 1720305119 == 1 != var6.aBool2650) {
                  var6.aBool2650 = 1 == var2.anInt11678 * 1720305119;
                  Class526_Sub31.method9555(var6, (byte)10);
               }
            } else {
               int var7;
               int var8;
               int var9;
               if(var3 == 4) {
                  var6 = Class221.method3095((int)var4, (byte)-27);
                  var7 = var2.anInt11678 * 1720305119;
                  var8 = var2.anInt11680 * 1360669361;
                  var9 = var2.anInt11677 * -180490367;
                  if(var6.modelType * 619744185 != var7 || var6.anInt2539 * 561507777 != var8 || var9 != var6.anInt2540 * -2040010137) {
                     var6.modelType = -1940911479 * var7;
                     var6.anInt2539 = var8 * 1664688705;
                     var6.anInt2540 = var9 * -2065854121;
                     var6.aClass294_2677 = null;
                     Class526_Sub31.method9555(var6, (byte)10);
                  }
               } else if(var3 == 5) {
                  var6 = Class221.method3095((int)var4, (byte)38);
                  if(var2.anInt11678 * 1720305119 != var6.anInt2660 * 150614291) {
                     if(var2.anInt11678 * 1720305119 != -1) {
                        if(var6.aClass704_2661 == null) {
                           var6.aClass704_2661 = new Class704_Sub1();
                        }

                        var6.aClass704_2661.method8246(1720305119 * var2.anInt11678, (byte)-7);
                     } else {
                        var6.aClass704_2661 = null;
                     }

                     var6.anInt2660 = 235437445 * var2.anInt11678;
                     Class526_Sub31.method9555(var6, (byte)10);
                  }
               } else if(var3 == 6) {
                  int var13 = var2.anInt11678 * 1720305119;
                  var7 = var13 >> 10 & 31;
                  var8 = var13 >> 5 & 31;
                  var9 = var13 & 31;
                  int var10 = (var8 << 11) + (var7 << 19) + (var9 << 3);
                  InterfaceDef var11 = Class221.method3095((int)var4, (byte)88);
                  if(var11.anInt2611 * -1115067825 != var10) {
                     var11.anInt2611 = var10 * 60386479;
                     Class526_Sub31.method9555(var11, (byte)10);
                  }
               } else if(var3 == 7) {
                  var6 = Class221.method3095((int)var4, (byte)-2);
                  boolean var12 = 1 == var2.anInt11678 * 1720305119;
                  if(var6.hidden != var12) {
                     var6.hidden = var12;
                     Class526_Sub31.method9555(var6, (byte)10);
                  }
               } else if(8 == var3) {
                  var6 = Class221.method3095((int)var4, (byte)6);
                  if(656480735 * var6.anInt2544 != var2.anInt11678 * 1720305119 || 487185371 * var6.anInt2545 != 1360669361 * var2.anInt11680 || -180490367 * var2.anInt11677 != -1448987627 * var6.anInt2550) {
                     var6.anInt2544 = var2.anInt11678 * 1636094977;
                     var6.anInt2545 = 1548877667 * var2.anInt11680;
                     var6.anInt2550 = var2.anInt11677 * -361067331;
                     if(-1 != var6.componentItem * -77845371) {
                        if(var6.anInt2551 * 271174405 > 0) {
                           var6.anInt2550 = 877036192 * var6.anInt2550 / (271174405 * var6.anInt2551) * -1016726723;
                        } else if(var6.anInt2475 * -57821549 > 0) {
                           var6.anInt2550 = -1016726723 * (877036192 * var6.anInt2550 / (-57821549 * var6.anInt2475));
                        }
                     }

                     Class526_Sub31.method9555(var6, (byte)10);
                  }
               } else if(var3 == 9) {
                  var6 = Class221.method3095((int)var4, (byte)-53);
                  if(1720305119 * var2.anInt11678 != -77845371 * var6.componentItem || var2.anInt11680 * 1360669361 != 1593645501 * var6.anInt2499) {
                     var6.componentItem = -2108811245 * var2.anInt11678;
                     var6.anInt2499 = 509932037 * var2.anInt11680;
                     Class526_Sub31.method9555(var6, (byte)10);
                  }
               } else if(10 == var3) {
                  var6 = Class221.method3095((int)var4, (byte)-21);
                  if(var6.anInt2649 * 769259159 != var2.anInt11678 * 1720305119 || var2.anInt11680 * 1360669361 != var6.anInt2543 * -1115410879 || -180490367 * var2.anInt11677 != var6.anInt2546 * -1546678639) {
                     var6.anInt2649 = var2.anInt11678 * -1550771207;
                     var6.anInt2543 = var2.anInt11680 * -992886671;
                     var6.anInt2546 = var2.anInt11677 * -1047811599;
                     Class526_Sub31.method9555(var6, (byte)10);
                  }
               } else if(var3 == 11) {
                  var6 = Class221.method3095((int)var4, (byte)15);
                  var6.aByte2500 = 0;
                  var6.anInt2569 = (var6.anInt2478 = var2.anInt11678 * 535240879) * 1680119437;
                  var6.aByte2501 = 0;
                  var6.anInt2572 = (var6.anInt2505 = var2.anInt11680 * 219527897) * 912607773;
                  Class526_Sub31.method9555(var6, (byte)10);
               } else if(var3 == 12) {
                  var6 = Class221.method3095((int)var4, (byte)-3);
                  var7 = 1720305119 * var2.anInt11678;
                  if(var6 != null && var6.type * -449120703 == 0) {
                     if(var7 > var6.anInt2523 * 1525210059 - var6.anInt2576 * -667181623) {
                        var7 = 1525210059 * var6.anInt2523 - -667181623 * var6.anInt2576;
                     }

                     if(var7 < 0) {
                        var7 = 0;
                     }

                     if(var7 != -1580669593 * var6.anInt2626) {
                        var6.anInt2626 = var7 * -852138409;
                        Class526_Sub31.method9555(var6, (byte)10);
                     }
                  }
               } else if(var3 == 13) {
                  var6 = Class221.method3095((int)var4, (byte)-51);
                  var6.anInt2529 = var2.anInt11678 * -752068661;
               } else if(14 == var3) {
                  Class105.aBool1302 = true;
                  Class105.anInt1300 = 314888509 * var2.anInt11678;
                  Class105.anInt1301 = 515749983 * var2.anInt11680;
               } else if(15 == var3) {
                  var6 = Class221.method3095((int)var4, (byte)-59);
                  var6.anInt2573 = 1592144011 * var2.anInt11678;
               } else if(var3 == 21) {
                  var6 = Class221.method3095((int)var4, (byte)97);
                  var6.aBool2574 = 1 == 1720305119 * var2.anInt11678;
               } else if(var3 == 22) {
                  var6 = Class221.method3095((int)var4, (byte)112);
                  var6.aBool2637 = 1 == 1720305119 * var2.anInt11678;
               } else if(var3 == 17) {
                  var6 = Class221.method3095((int)var4, (byte)-40);
                  var7 = (int)(var4 >> 32);
                  var6.method3375(var7, (short)(var2.anInt11678 * 1720305119), (short)(1360669361 * var2.anInt11680), (short)255);
               } else if(20 == var3) {
                  var6 = Class221.method3095((int)var4, (byte)47);
                  var7 = (int)(var4 >> 32);
                  var6.method3357(var7, (short)(1720305119 * var2.anInt11678), (short)(1360669361 * var2.anInt11680), -2016985971);
               }
            }
         }
      }

   }

   public static void method8480(String var0, boolean var1, short var2) {
      if(-558705405 * client.anInt11038 == 0) {
         if(!Class509.method6166(-1586635367) && !Class476.method5657(572423609)) {
            Class32.aString334 = var0;
            Class32.aBool309 = var1;
            Class593.method7031(8, (byte)85);
         }
      }
   }

   public static Class298 method8481(int var0, int var1) {
      return Class298.aClass298_3239.anInt3243 * -38262087 == var0?Class298.aClass298_3239:(-38262087 * Class298.aClass298_3237.anInt3243 == var0?Class298.aClass298_3237:(Class298.aClass298_3238.anInt3243 * -38262087 == var0?Class298.aClass298_3238:(Class298.aClass298_3241.anInt3243 * -38262087 == var0?Class298.aClass298_3241:(var0 == -38262087 * Class298.aClass298_3240.anInt3243?Class298.aClass298_3240:(var0 == Class298.aClass298_3242.anInt3243 * -38262087?Class298.aClass298_3242:(Class298.aClass298_3236.anInt3243 * -38262087 == var0?Class298.aClass298_3236:null))))));
   }
}
