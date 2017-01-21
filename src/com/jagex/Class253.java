package com.jagex;

import com.jagex.Class199_Sub1;
import com.jagex.Class26;
import com.jagex.NPCDef;
import com.jagex.Class31;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class504;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class588;
import com.jagex.Class592;
import com.jagex.Class606;
import com.jagex.Class618;
import com.jagex.Class627;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class64;
import com.jagex.Class676;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Interface76;
import com.jagex.client;

public class Class253 implements Interface76 {
   public static Class627 aClass627_2794;
   int anInt2792;
   int anInt2793;
   static Class253 aClass253_2785 = new Class253(8, 1);
   static Class253 aClass253_2788 = new Class253(3, 2);
   static Class253 aClass253_2780 = new Class253(4, 3);
   static Class253 aClass253_2779 = new Class253(10, 4);
   static Class253 aClass253_2782 = new Class253(1, 5);
   static Class253 aClass253_2783 = new Class253(5, 6);
   static Class253 aClass253_2784 = new Class253(0, 7);
   static Class253 aClass253_2778 = new Class253(2, 8);
   static Class253 aClass253_2786 = new Class253(7, 9);
   static Class253 aClass253_2787 = new Class253(13, 10);
   static Class253 aClass253_2790 = new Class253(6, 11);
   static Class253 aClass253_2789 = new Class253(9, 12);
   static Class253 aClass253_2781 = new Class253(12, 13);
   static Class253 aClass253_2791 = new Class253(11, 14);

   public int getId() {
      return -1238935103 * this.anInt2793;
   }

   Class253(int var1, int var2) {
      this.anInt2792 = var1 * -852997411;
      this.anInt2793 = var2 * -1795967423;
   }

   public int method21() {
      return -1238935103 * this.anInt2793;
   }

   static Class253[] method3470(int var0) {
      return new Class253[]{aClass253_2784, aClass253_2782, aClass253_2778, aClass253_2788, aClass253_2780, aClass253_2783, aClass253_2790, aClass253_2786, aClass253_2785, aClass253_2789, aClass253_2779, aClass253_2791, aClass253_2781, aClass253_2787};
   }

   static String method3471(Class526_Sub21_Sub6 var0, byte var1) {
      return var0.aString11660 != null && var0.aString11660.length() != 0?(null != var0.aString11650 && var0.aString11650.length() > 0?var0.aString11652 + Class45.aClass45_602.method920(Class26.aClass673_247, -827840379) + var0.aString11650 + Class45.aClass45_602.method920(Class26.aClass673_247, -827840379) + var0.aString11660:var0.aString11652 + Class45.aClass45_602.method920(Class26.aClass673_247, -827840379) + var0.aString11660):(null != var0.aString11650 && var0.aString11650.length() > 0?var0.aString11652 + Class45.aClass45_602.method920(Class26.aClass673_247, -827840379) + var0.aString11650:var0.aString11652);
   }

   static void method3472(Class639_Sub1_Sub2_Sub1_Sub1 var0, boolean var1, int var2) {
      if(1600532433 * Class31.anInt273 < 401) {
         if(var0 == Class451.localPlayer) {
            if(client.aBool11276 && (257411563 * Class199_Sub1.anInt9869 & 16) != 0) {
               Class504.method6046(client.aString11184, client.aString11271 + " " + Class64.aString741 + " " + Class592.method7026(16777215, 1034940770) + Class45.aClass45_608.method920(Class26.aClass673_247, -827840379), 1441183119 * Class606.anInt7911, 16, -1, 0L, 0, 0, true, false, (long)(828574411 * var0.index), false, (byte)8);
            }

         } else {
            boolean var3;
            int var4;
            String var6;
            if(186410261 * var0.anInt12171 == 0) {
               var3 = true;
               if(Class451.localPlayer.anInt12168 * -1240797325 != -1 && -1 != -1240797325 * var0.anInt12168) {
                  var4 = Class451.localPlayer.anInt12168 * -1240797325 < -1240797325 * var0.anInt12168?-1240797325 * Class451.localPlayer.anInt12168:var0.anInt12168 * -1240797325;
                  int var5 = Class451.localPlayer.anInt12167 * -388625007 - -388625007 * var0.anInt12167;
                  if(var5 < 0) {
                     var5 = -var5;
                  }

                  if(var5 > var4) {
                     var3 = false;
                  }
               }

               String var10 = Class676.aClass676_8592 == client.aClass676_11127?Class45.aClass45_548.method920(Class26.aClass673_247, -827840379):Class45.aClass45_597.method920(Class26.aClass673_247, -827840379);
               if(-388625007 * var0.anInt12167 >= var0.anInt12169 * 1547128563) {
                  var6 = var0.method10977(true, (byte)31) + (var3?Class588.method7002(var0.anInt12167 * -388625007, Class451.localPlayer.anInt12167 * -388625007, 2120184245):Class592.method7026(16777215, -1022178090)) + Class64.aString737 + var10 + var0.anInt12167 * -388625007 + Class64.aString739;
               } else {
                  var6 = var0.method10977(true, (byte)62) + (var3?Class588.method7002(var0.anInt12167 * -388625007, Class451.localPlayer.anInt12167 * -388625007, 2111927433):Class592.method7026(16777215, 678555283)) + Class64.aString737 + var10 + var0.anInt12167 * -388625007 + "+" + (var0.anInt12169 * 1547128563 - var0.anInt12167 * -388625007) + Class64.aString739;
               }
            } else if(-1 == var0.anInt12171 * 186410261) {
               var6 = var0.method10977(true, (byte)45);
            } else {
               var6 = var0.method10977(true, (byte)11) + Class64.aString737 + Class45.aClass45_598.method920(Class26.aClass673_247, -827840379) + var0.anInt12171 * 186410261 + Class64.aString739;
            }

            var3 = false;
            if(null != var0.aClass633_12181 && -1760242843 * var0.aClass633_12181.anInt8252 != -1) {
               NPCDef var11 = (NPCDef)Class76.loader.method89(-1760242843 * var0.aClass633_12181.anInt8252, -1096433190);
               if(var11.hidePlayer) {
                  var3 = true;
                  var6 = ((NPCDef)Class76.loader.method89(-1760242843 * var0.aClass633_12181.anInt8252, -2030303912)).name;
                  if(0 != -1324462825 * var11.combatLevel) {
                     String var13 = client.aClass676_11127 == Class676.aClass676_8592?Class45.aClass45_548.method920(Class26.aClass673_247, -827840379):Class45.aClass45_597.method920(Class26.aClass673_247, -827840379);
                     var6 = var6 + Class588.method7002(-1324462825 * var11.combatLevel, Class451.localPlayer.anInt12167 * -388625007, 2100130156) + Class64.aString737 + var13 + var11.combatLevel * -1324462825 + Class64.aString739;
                  }
               }
            }

            if(client.aBool11276 && !var1 && 0 != (Class199_Sub1.anInt9869 * 257411563 & 8)) {
               Class504.method6046(client.aString11184, client.aString11271 + " " + Class64.aString741 + " " + Class592.method7026(16777215, 1059852954) + var6, Class606.anInt7911 * 1441183119, 15, -1, (long)(var0.index * 828574411), 0, 0, true, false, (long)(var0.index * 828574411), false, (byte)-2);
            }

            if(!var1) {
               for(var4 = 7; var4 >= 0; --var4) {
                  if(client.aStringArray11158[var4] != null) {
                     short var14 = 0;
                     if(client.aClass676_11127 == Class676.aClass676_8589 && client.aStringArray11158[var4].equalsIgnoreCase(Class45.aClass45_592.method920(Class26.aClass673_247, -827840379))) {
                        if(Class618.aClass618_8102 == client.aClass618_11164) {
                           var14 = 2000;
                        } else if(Class618.aClass618_8104 == client.aClass618_11164 && var0.anInt12167 * -388625007 > Class451.localPlayer.anInt12167 * -388625007) {
                           var14 = 2000;
                        }

                        if(Class451.localPlayer.anInt12174 * -587886045 != 0 && 0 != -587886045 * var0.anInt12174) {
                           if(-587886045 * var0.anInt12174 == -587886045 * Class451.localPlayer.anInt12174) {
                              var14 = 2000;
                           } else {
                              var14 = 0;
                           }
                        } else if(var0.aBool12184) {
                           var14 = 2000;
                        }
                     } else if(client.aBoolArray11170[var4]) {
                        var14 = 2000;
                     }

                     short var7 = (short)(client.aShortArray11167[var4] + var14);
                     int var8 = -1 != client.anIntArray11168[var4]?client.anIntArray11168[var4]:85637115 * client.anInt10987;
                     int var9 = var3?16776960:16777215;
                     Class504.method6046(client.aStringArray11158[var4], Class592.method7026(var9, -901764570) + var6, var8, var7, -1, (long)(828574411 * var0.index), 0, 0, true, false, (long)(828574411 * var0.index), false, (byte)-52);
                  }
               }
            } else if(!var3) {
               Class504.method6046(Class592.method7026(13421772, 1237134096) + var6, "", -1, -1, 0, 0L, 0, 0, false, true, (long)(828574411 * var0.index), false, (byte)20);
            }

            if(!var1 && !var3) {
               for(Class526_Sub21_Sub6 var12 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8206((byte)36); var12 != null; var12 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8181(251724243)) {
                  if(var12.anInt11659 * 976428997 == 23) {
                     var12.aString11660 = Class592.method7026(16777215, -1574428199) + var6;
                     break;
                  }
               }
            }

         }
      }
   }

   public static byte[][][] method3473(int var0, int var1) {
      byte[][][] var2 = new byte[8][4][];
      int var3 = var0;
      int var4 = var0;
      byte[] var5 = new byte[var0 * var0];
      int var6 = 0;

      int var7;
      int var8;
      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][0] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var4; ++var8) {
            if(var8 <= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][1] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][2] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][3] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var6 >= 0 && var6 < var5.length) {
               if(var8 >= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            } else {
               ++var6;
            }
         }
      }

      var2[1][1] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][3] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][0] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][2] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][3] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][1] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][3] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][1] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][3] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var3 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var7 <= var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var3 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][2] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var7 >= var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][3] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][0] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][3] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][0] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][2] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][3] = var5;
      return var2;
   }

   static final void method3474(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(null != var2) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.length();
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method3475(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -365891393 * client.anInt10991;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1998657043 * client.anInt10990;
   }

   public static void method3476(int var0) {
      Class525_Sub1.aHashMap10718.clear();
      Class525_Sub1.aHashMap10719.clear();
   }
}
