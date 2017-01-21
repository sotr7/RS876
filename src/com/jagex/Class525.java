package com.jagex;

import com.jagex.Class149_Sub1;
import com.jagex.Class153;
import com.jagex.Class169;
import com.jagex.Class174;
import com.jagex.Class175;
import com.jagex.Class192;
import com.jagex.Class20;
import com.jagex.Class238;
import com.jagex.Class255;
import com.jagex.Class258;
import com.jagex.Class35;
import com.jagex.Class40_Sub10;
import com.jagex.Class40_Sub18;
import com.jagex.Class40_Sub3;
import com.jagex.Class40_Sub6;
import com.jagex.Class40_Sub8;
import com.jagex.Class466;
import com.jagex.Class519;
import com.jagex.Class522;
import com.jagex.Class524;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class526_Sub34;
import com.jagex.Class526_Sub35;
import com.jagex.RSByteBuffer;
import com.jagex.Class544;
import com.jagex.Class594;
import com.jagex.Class610;
import com.jagex.Class616;
import com.jagex.Class635;
import com.jagex.Class639_Sub1;
import com.jagex.Class640;
import com.jagex.Class653;
import com.jagex.Class654;
import com.jagex.NPCDirection;
import com.jagex.Class696;
import com.jagex.Class7;
import com.jagex.Class702;
import com.jagex.Class87;
import com.jagex.Interface14;
import com.jagex.Interface17;
import com.jagex.Interface19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class525 {
   public static Class635 aClass635_7092;
   protected static int anInt7100;
   protected static int anInt7102;
   public static float aFloat7103;
   protected static byte[][][] aByteArrayArrayArray7105;
   public static int anInt7107;
   protected static int anInt7110;
   protected static Class519 aClass519_7117;
   static final int anInt7134 = 64;
   public static float aFloat7144;
   public static int anInt7150;
   static Class466 aClass466_7094;
   protected static Class466 aClass466_7095;
   static Interface14 anInterface14_7119 = null;
   static Interface14 anInterface14_7086 = null;
   protected static Class40_Sub8 aClass40_Sub8_7118;
   protected static Class40_Sub6 aClass40_Sub6_7088;
   protected static Class40_Sub3 aClass40_Sub3_7112;
   protected static Interface17 anInterface17_7091;
   protected static Interface19 anInterface19_7090;
   static short[] aShortArray7121;
   static short[] aShortArray7115;
   static byte[] aByteArray7101;
   static Object[] anObjectArray7108;
   static byte[] aByteArray7114;
   static HashMap[][][] aHashMapArrayArrayArray7130;
   static int[] anIntArray7111;
   static boolean[][] aBoolArrayArray7120;
   static byte[] aByteArray7113;
   static short[] aShortArray7099;
   public static Class526_Sub21_Sub17 aClass526_Sub21_Sub17_7093;
   protected static boolean aBool7116 = true;
   static RSByteBuffer aClass526_Sub36_7140;
   static int[] anIntArray7104;
   static RSByteBuffer aClass526_Sub36_7141;
   protected static int anInt7085;
   static int[] anIntArray7087;
   static int anInt7153;
   static int anInt7154;
   static int[] anIntArray7137;
   protected static int anInt7138;
   protected static int anInt7146;
   protected static int anInt7131;
   protected static int anInt7148;
   protected static int anInt7149;
   protected static int anInt7143;
   protected static int anInt7109;
   protected static int anInt7152;
   static Class20 aClass20_7096 = new Class20(16);
   protected static int anInt7097 = (int)(Math.random() * 11.0D) - 5;
   protected static int anInt7098 = (int)(Math.random() * 17.0D) - 8;
   static int[] anIntArray7151 = new int[1];
   static byte[] aByteArray7145 = new byte[1];
   protected static Class702 aClass702_7106 = new Class702();
   static int[][] anIntArrayArray7125 = new int[][]{{2, 2, 0, 0, 0, 0}, {2, 2, 2, 0, 0, 0}, {1, 2, 2, 2, 0, 0}, {1, 1, 1, 2, 2, 0}, {1, 1, 1, 2, 2, 2}, {1, 1, 1, 1, 2, 2}};
   static int anInt7122;
   static int anInt7123;
   static int anInt7124;
   static int anInt7147;
   static int anInt7126;
   static int anInt7127;
   static int anInt7128;
   static int anInt7129;
   protected static Class192 aClass192_7089;
   protected static Class192 aClass192_7132;
   protected static Class192 aClass192_7133;
   static ArrayList anArrayList7135;
   static int anInt7136;
   static int anInt7139;
   protected static boolean aBool7142;
   static boolean[] aBoolArray7155;

   public static void method6276(Class466 var0, Class466 var1, Class40_Sub10 var2, Class40_Sub18 var3, Class40_Sub8 var4, Class40_Sub6 var5, Class40_Sub3 var6, Interface17 var7, Interface19 var8) {
      aClass466_7094 = var0;
      aClass466_7095 = var1;
      anInterface14_7119 = var2;
      anInterface14_7086 = var3;
      aClass40_Sub8_7118 = var4;
      aClass40_Sub6_7088 = var5;
      aClass40_Sub3_7112 = var6;
      anInterface17_7091 = var7;
      anInterface19_7090 = var8;
      aClass20_7096.method647(929030154);
      int[] var9 = aClass466_7094.method5542(Class640.aClass640_8345.getId(), (byte)-61);
      if(var9 != null) {
         for(int var10 = 0; var10 < var9.length; ++var10) {
            Class526_Sub21_Sub17 var11 = Class149_Sub1.method8357(aClass466_7094, var9[var10], -753402198);
            aClass20_7096.put(var11, (long)(var11.anInt11846 * 929626277));
         }
      }

      Class654.method7818(true, false, (byte)50);
   }

   static void method6277() {
      aShortArray7121 = new short[anInt7102 * anInt7110];
      aShortArray7115 = new short[anInt7102 * anInt7110];
      aByteArray7101 = new byte[anInt7102 * anInt7110];
      anObjectArray7108 = new Object[anInt7102 * anInt7110];
      aByteArray7114 = new byte[anInt7102 * anInt7110];
      aHashMapArrayArrayArray7130 = new HashMap[3][anInt7102 >> 6][anInt7110 >> 6];
      anIntArray7111 = new int[anInterface14_7119.method87(458804970) + 1];
      aBoolArrayArray7120 = new boolean[anInt7102 / 8][anInt7110 / 8];
   }

   static void method6278() {
      aShortArray7121 = null;
      aByteArray7113 = null;
      aShortArray7099 = null;
      aShortArray7115 = null;
      aByteArray7101 = null;
      anObjectArray7108 = null;
      aByteArray7114 = null;
      aHashMapArrayArrayArray7130 = (HashMap[][][])null;
      anIntArray7111 = null;
      aBoolArrayArray7120 = (boolean[][])null;
   }

   static boolean method6279(Class526_Sub21_Sub17 var0) {
      if(var0 != null && var0 != aClass526_Sub21_Sub17_7093) {
         aClass526_Sub21_Sub17_7093 = var0;
         aBool7116 = aClass526_Sub21_Sub17_7093.anInt11846 * 929626277 == aClass635_7092.anInt8289 * 2054840559;
         return true;
      } else {
         return false;
      }
   }

   static void method6280() {
      int[] var0 = new int[3];

      for(int var1 = 0; var1 < aClass519_7117.anInt7044 * -1277967837; ++var1) {
         boolean var2 = aClass526_Sub21_Sub17_7093.method10717(aClass519_7117.anIntArray7043[var1] >> 28 & 3, aClass519_7117.anIntArray7043[var1] >> 14 & 16383, aClass519_7117.anIntArray7043[var1] & 16383, var0, 1602276121);
         if(var2) {
            Class526_Sub35 var3 = new Class526_Sub35(aClass519_7117.anIntArray7045[var1]);
            var3.anInt10665 = (var0[1] - anInt7107) * 2077397041;
            var3.anInt10662 = (var0[2] - anInt7150) * 1376149239;
            aClass702_7106.method8176(var3, -679531033);
         }
      }

   }

   public static Class526_Sub21_Sub17 method6281(int var0) {
      return (Class526_Sub21_Sub17)aClass20_7096.get((long)var0);
   }

   static void method6282(Class169 var0, int var1, int var2) {
      for(int var3 = 0; var3 < anInterface14_7119.method87(643764006); ++var3) {
         anIntArray7111[var3 + 1] = method6283(var0, var3, var1, var2);
      }

   }

   static int method6283(Class169 var0, int var1, int var2, int var3) {
      return method6284(anInterface14_7119, var0, var1, var2, var3);
   }

   static int method6284(Interface14 var0, Class169 var1, int var2, int var3, int var4) {
      Class653 var5 = (Class653)var0.method89(var2, -1905131400);
      if(var5 == null) {
         return 0;
      } else {
         int var6 = var5.anInt8468 * -1072075383;
         if(var6 >= 0 && var1.method2122(var6, (byte)119).aBool1981) {
            var6 = -1;
         }

         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.anInt8470 * -1893458545 >= 0) {
            var7 = var5.anInt8470 * -1893458545;
            var8 = (var7 & 127) + var4;
            if(var8 < 0) {
               var8 = 0;
            } else if(var8 > 127) {
               var8 = 127;
            }

            var9 = (var7 + var3 & '\ufc00') + (var7 & 896) + var8;
            var10 = -16777216 | Class87.anIntArray855[Class616.method7307(Class654.method7819(var9, 96, 1380817422), 963952488) & '\uffff'];
         } else if(var6 >= 0) {
            var10 = -16777216 | Class87.anIntArray855[Class616.method7307(Class654.method7819(var1.method2122(var6, (byte)105).aShort2015, 96, -536952763), -292332564) & '\uffff'];
         } else if(var5.anInt8467 * -1097883379 == -1) {
            var10 = 0;
         } else {
            var7 = var5.anInt8467 * -1097883379;
            var8 = (var7 & 127) + var4;
            if(var8 < 0) {
               var8 = 0;
            } else if(var8 > 127) {
               var8 = 127;
            }

            var9 = (var7 + var3 & '\ufc00') + (var7 & 896) + var8;
            var10 = -16777216 | Class87.anIntArray855[Class616.method7307(Class654.method7819(var9, 96, -666828646), -2080914472) & '\uffff'];
         }

         return var10;
      }
   }

   static boolean method6285(Class174 var0, int var1, int var2, boolean var3) {
      long var4 = Class255.time((byte)24);
      int var6;
      int var7;
      int var8;
      if(anInt7085 == 0) {
         if(aClass526_Sub21_Sub17_7093.anInt11846 * 929626277 == aClass635_7092.anInt8287 * 1559876643) {
            var6 = aClass466_7095.method5546(aClass526_Sub21_Sub17_7093.aString11837, (byte)4);
            if(aClass526_Sub36_7141 == null) {
               aClass526_Sub36_7141 = new RSByteBuffer(aClass466_7095.method5536(var6, 0, (byte)74));
            }

            aClass526_Sub36_7140 = aClass526_Sub36_7141;
            aClass526_Sub36_7140.pos = 0;
         } else {
            var6 = aClass466_7095.method5546(aClass526_Sub21_Sub17_7093.aString11837, (byte)4);
            aClass526_Sub36_7140 = new RSByteBuffer(aClass466_7095.method5536(var6, 0, (byte)31));
         }

         var6 = aClass526_Sub36_7140.readUnsignedByte(-976363069);
         anIntArray7104 = new int[var6];

         for(var7 = 0; var7 < var6; ++var7) {
            anIntArray7104[var7] = aClass526_Sub36_7140.readSmart(-294134958);
         }

         var7 = aClass526_Sub36_7140.readUnsignedByte(-364003122);
         anIntArray7087 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            anIntArray7087[var8] = aClass526_Sub36_7140.readSmart(-389803118);
         }
      }

      int var9;
      int var13;
      while(aClass526_Sub36_7140 != null && aClass526_Sub36_7140.pos * 301018015 < aClass526_Sub36_7140.buffer.length && (!var3 || Class255.time((byte)24) < var4 + (long)anInt7139)) {
         int var10;
         int var11;
         int var12;
         if(aClass526_Sub36_7140.readUnsignedByte(-494919167) == 0) {
            var6 = aClass526_Sub36_7140.readUnsignedByte(310234339);
            var7 = aClass526_Sub36_7140.readUnsignedByte(-1291869994);

            for(var8 = 0; var8 < 8; ++var8) {
               var9 = aClass526_Sub36_7140.readUnsignedByte(-1201878452);
               var10 = var6 * 8 + var8 - anInt7107 / 8;

               for(var11 = 0; var11 < 8; ++var11) {
                  var12 = var7 * 8 + var11 - anInt7150 / 8;
                  aBoolArrayArray7120[var10][var12] = (var9 & 1 << var11) != 0;
               }
            }

            for(var8 = 0; var8 < 64; ++var8) {
               for(var9 = 0; var9 < 64; ++var9) {
                  var10 = var6 * 64 + var8 - anInt7107;
                  var11 = var7 * 64 + var9 - anInt7150;
                  method6307(var0, aClass526_Sub36_7140, var6, var7, var10, var11, anIntArray7104, anIntArray7087);
               }
            }
         } else {
            var6 = aClass526_Sub36_7140.readUnsignedByte(-984434912);
            var7 = aClass526_Sub36_7140.readUnsignedByte(-763111237);
            var8 = aClass526_Sub36_7140.readUnsignedByte(310014863);
            var9 = aClass526_Sub36_7140.readUnsignedByte(635098272);
            aBoolArrayArray7120[var6 * 8 + var8 - anInt7107 / 8][var7 * 8 + var9 - anInt7150 / 8] = aClass526_Sub36_7140.readUnsignedByte(511870641) != 0;

            for(var10 = 0; var10 < 8; ++var10) {
               for(var11 = 0; var11 < 8; ++var11) {
                  var12 = var6 * 64 + var8 * 8 + var10 - anInt7107;
                  var13 = var7 * 64 + var9 * 8 + var11 - anInt7150;
                  method6307(var0, aClass526_Sub36_7140, var6, var7, var12, var13, anIntArray7104, anIntArray7087);
               }
            }
         }
      }

      if(aClass526_Sub36_7140 != null) {
         anInt7085 = aClass526_Sub36_7140.pos * 301018015;
         if(aClass526_Sub36_7140.pos * 301018015 < aClass526_Sub36_7140.buffer.length) {
            return false;
         }
      }

      aClass526_Sub36_7140 = null;
      anIntArray7087 = null;
      anIntArray7104 = null;
      if(aShortArray7121 != null) {
         aByteArray7113 = new byte[anInt7102 * anInt7110];
         aShortArray7099 = new short[anInt7102 * anInt7110];

         for(var6 = 0; var6 < 3; ++var6) {
            short[] var14 = new short[anInt7102 * anInt7110];

            HashMap var15;
            Iterator var16;
            Class524 var17;
            for(var8 = 0; var8 < aHashMapArrayArrayArray7130[var6].length; ++var8) {
               for(var9 = 0; var9 < aHashMapArrayArrayArray7130[var6][0].length; ++var9) {
                  var15 = aHashMapArrayArrayArray7130[var6][var8][var9];
                  if(var15 != null) {
                     for(var16 = var15.values().iterator(); var16.hasNext(); var14[var8 * 64 + var17.aByte7080 + (var9 * 64 + var17.aByte7082) * anInt7102] = (short)var17.anInt7079) {
                        var17 = (Class524)var16.next();
                     }
                  }
               }
            }

            method6287(var14, aByteArray7113, aShortArray7099, var1, var2);

            for(var8 = 0; var8 < aHashMapArrayArrayArray7130[var6].length; ++var8) {
               for(var9 = 0; var9 < aHashMapArrayArrayArray7130[var6][0].length; ++var9) {
                  var15 = aHashMapArrayArrayArray7130[var6][var8][var9];
                  if(var15 != null) {
                     var16 = var15.values().iterator();

                     while(var16.hasNext()) {
                        var17 = (Class524)var16.next();
                        var13 = var8 * 64 + var17.aByte7080 + (var9 * 64 + var17.aByte7082) * anInt7102;
                        var17.anInt7079 = (aByteArray7113[var13] & 255) << 16 | aShortArray7099[var13] & '\uffff';
                        if(var17.anInt7079 != 0) {
                           var17.anInt7079 |= -16777216;
                        }
                     }
                  }
               }
            }
         }

         method6287(aShortArray7121, aByteArray7113, aShortArray7099, var1, var2);
         aShortArray7121 = null;
      }

      if(var3 && Class255.time((byte)24) >= var4 + (long)anInt7139) {
         return false;
      } else {
         method6286();
         return true;
      }
   }

   static void method6286() {
      int var0;
      int var1;
      int var16;
      for(var0 = 0; var0 < anInt7102; ++var0) {
         for(var1 = 0; var1 < anInt7110; ++var1) {
            Object var2 = anObjectArray7108[var0 + var1 * anInt7102];
            if(var2 != null) {
               if(var2 instanceof Class526_Sub34) {
                  Class526_Sub34 var11 = (Class526_Sub34)var2;
                  if(var11 != null) {
                     for(int var13 = 0; var13 < var11.anIntArray10661.length; ++var13) {
                        Class610 var15 = (Class610)aClass40_Sub8_7118.method89(var11.anIntArray10661[var13], -2097208777);
                        var16 = var15.anInt7969 * -1569917235;
                        if(var15.anIntArray7989 != null) {
                           var15 = var15.method7179(anInterface17_7091, anInterface19_7090, (byte)-111);
                           if(var15 != null) {
                              var16 = var15.anInt7969 * -1569917235;
                           }
                        }

                        if(var16 != -1) {
                           Class526_Sub35 var7 = new Class526_Sub35(var16);
                           var7.anInt10665 = var0 * 2077397041;
                           var7.anInt10662 = var1 * 1376149239;
                           aClass702_7106.method8176(var7, -1662720270);
                        }
                     }
                  }
               } else {
                  Integer var3 = (Integer)var2;
                  Class610 var4 = (Class610)aClass40_Sub8_7118.method89(var3.intValue(), 114429011);
                  int var5 = var4.anInt7969 * -1569917235;
                  if(var4.anIntArray7989 != null) {
                     var4 = var4.method7179(anInterface17_7091, anInterface19_7090, (byte)-107);
                     if(var4 != null) {
                        var5 = var4.anInt7969 * -1569917235;
                     }
                  }

                  if(var5 != -1) {
                     Class526_Sub35 var6 = new Class526_Sub35(var5);
                     var6.anInt10665 = var0 * 2077397041;
                     var6.anInt10662 = var1 * 1376149239;
                     aClass702_7106.method8176(var6, -1513308910);
                  }
               }
            }
         }
      }

      for(var0 = 0; var0 < 3; ++var0) {
         for(var1 = 0; var1 < aHashMapArrayArrayArray7130[0].length; ++var1) {
            label89:
            for(int var10 = 0; var10 < aHashMapArrayArrayArray7130[0][0].length; ++var10) {
               HashMap var12 = aHashMapArrayArrayArray7130[var0][var1][var10];
               if(var12 != null) {
                  Iterator var14 = var12.values().iterator();

                  while(true) {
                     Class524 var17;
                     do {
                        if(!var14.hasNext()) {
                           continue label89;
                        }

                        var17 = (Class524)var14.next();
                     } while(var17.anIntArray7083 == null);

                     for(var16 = 0; var16 < var17.anIntArray7083.length; ++var16) {
                        Class610 var18 = (Class610)aClass40_Sub8_7118.method89(var17.anIntArray7083[var16], -1692057408);
                        int var8 = var18.anInt7969 * -1569917235;
                        if(var18.anIntArray7989 != null) {
                           var18 = var18.method7179(anInterface17_7091, anInterface19_7090, (byte)-109);
                           if(var18 != null) {
                              var8 = var18.anInt7969 * -1569917235;
                           }
                        }

                        if(var8 != -1) {
                           Class526_Sub35 var9 = new Class526_Sub35(var8);
                           var9.anInt10665 = ((var1 + (anInt7107 >> 6)) * 64 + var17.aByte7080 - anInt7107) * 2077397041;
                           var9.anInt10662 = ((var10 + (anInt7150 >> 6)) * 64 + var17.aByte7082 - anInt7150) * 1376149239;
                           aClass702_7106.method8176(var9, -2058245932);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method6287(short[] var0, byte[] var1, short[] var2, int var3, int var4) {
      int[] var5 = new int[anInt7110];
      int[] var6 = new int[anInt7110];
      int[] var7 = new int[anInt7110];
      int[] var8 = new int[anInt7110];
      int[] var9 = new int[anInt7110];

      for(int var10 = -5; var10 < anInt7102; ++var10) {
         int var11 = var10 + 5;
         int var12 = var10 - 5;

         int var13;
         for(var13 = 0; var13 < anInt7110; ++var13) {
            short var14;
            Class7 var15;
            if(var11 < anInt7102) {
               var14 = var0[var11 + var13 * anInt7102];
               if(var14 > 0) {
                  var15 = (Class7)anInterface14_7086.method89(var14 - 1, -380920177);
                  var5[var13] += var15.anInt41 * -1686124027;
                  var6[var13] += var15.anInt42 * -657442929;
                  var7[var13] += var15.anInt39 * 1582364597;
                  var8[var13] += var15.anInt44 * 1113295925;
                  ++var9[var13];
               }
            }

            if(var12 >= 0) {
               var14 = var0[var12 + var13 * anInt7102];
               if(var14 > 0) {
                  var15 = (Class7)anInterface14_7086.method89(var14 - 1, -755798247);
                  var5[var13] -= var15.anInt41 * -1686124027;
                  var6[var13] -= var15.anInt42 * -657442929;
                  var7[var13] -= var15.anInt39 * 1582364597;
                  var8[var13] -= var15.anInt44 * 1113295925;
                  --var9[var13];
               }
            }
         }

         if(var10 >= 0) {
            var13 = 0;
            int var26 = 0;
            int var27 = 0;
            int var16 = 0;
            int var17 = 0;

            for(int var18 = -5; var18 < anInt7110; ++var18) {
               int var19 = var18 + 5;
               if(var19 < anInt7110) {
                  var13 += var5[var19];
                  var26 += var6[var19];
                  var27 += var7[var19];
                  var16 += var8[var19];
                  var17 += var9[var19];
               }

               int var20 = var18 - 5;
               if(var20 >= 0) {
                  var13 -= var5[var20];
                  var26 -= var6[var20];
                  var27 -= var7[var20];
                  var16 -= var8[var20];
                  var17 -= var9[var20];
               }

               if(var18 >= 0 && var17 > 0) {
                  int var21;
                  if(var0[var10 + var18 * anInt7102] == 0) {
                     var21 = var10 + var18 * anInt7102;
                     var1[var21] = 0;
                     var2[var21] = 0;
                  } else {
                     var21 = var16 == 0?0:Class544.method6509(var13 * 256 / var16, var26 / var17, var27 / var17, 1148880983);
                     int var22 = (var21 & 127) + var4;
                     if(var22 < 0) {
                        var22 = 0;
                     } else if(var22 > 127) {
                        var22 = 127;
                     }

                     int var23 = (var21 + var3 & '\ufc00') + (var21 & 896) + var22;
                     int var24 = var10 + var18 * anInt7102;
                     int var25 = Class87.anIntArray855[Class616.method7307(Class639_Sub1.method9869(var23, 96, -1474663652), -1724154904) & '\uffff'];
                     var1[var24] = (byte)(var25 >> 16 & 255);
                     var2[var24] = (short)(var25 & '\uffff');
                  }
               }
            }
         }
      }

   }

   static int method6288(long var0) {
      Class153 var2 = (Class153)aClass192_7133.method2765(var0);
      return var2 != null?var2.method1825():-1;
   }

   public static Class526_Sub21_Sub17 method6289(int var0, int var1) {
      for(Class526_Sub21_Sub17 var2 = (Class526_Sub21_Sub17)aClass20_7096.method638(-1313715197); var2 != null; var2 = (Class526_Sub21_Sub17)aClass20_7096.method639(1451641737)) {
         if(var2.aBool11845 && var2.method10713(var0, var1, 1782689526)) {
            return var2;
         }
      }

      return null;
   }

   static void method6290(Class174 var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      int var5 = anInt7131 - anInt7138;
      int var6 = anInt7146 - anInt7148;
      int var7 = (anInt7109 - anInt7149 << 16) / var5;
      int var8 = (anInt7152 - anInt7143 << 16) / var6;
      method6291(var0, var1, var2, var7, var8, 0, 0, var3, var4);
   }

   static void method6291(Class174 var0, boolean var1, boolean var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      int var9 = anInt7131 - anInt7138;
      int var10 = anInt7146 - anInt7148;
      if(anInt7131 < anInt7102) {
         ++var9;
      }

      if(anInt7146 < anInt7110) {
         ++var10;
      }

      int var11 = anInt7138 / 64;
      int var12 = anInt7148 / 64;
      int var13 = (anInt7138 + var9) / 64;
      int var14 = (anInt7148 + var10) / 64;
      int var15;
      int var16;
      if(var8) {
         var15 = (anInt7109 - anInt7149) / ((anInt7131 - anInt7138) / 64);
         var16 = var15;
      } else {
         var15 = method6298();
         var16 = (int)Math.ceil((double)(64.0F * aFloat7103 / 2.0F));
      }

      anArrayList7135.clear();
      int var17 = 0;
      int var18 = var15 * var15;

      int var19;
      int var20;
      int var21;
      int var22;
      for(var19 = var11; var19 <= var13; ++var19) {
         for(var20 = var12; var20 <= var14; ++var20) {
            var21 = (var19 << 16) + var20;
            var22 = method6288((long)var21);
            if(var22 != var15) {
               if(var19 >= 0 && var19 * 64 < anInt7102 && var20 >= 0 && var20 * 64 < anInt7110) {
                  if(var22 == -1) {
                     method6329(var19, var20, var15, var21, var1, var2, var7, var0);
                     var17 += var18;
                  } else {
                     anArrayList7135.add(Integer.valueOf(var21));
                  }
               } else {
                  method6325(var0, var19, var20, var15, var21);
               }
            }
         }
      }

      if(!anArrayList7135.isEmpty() && var17 < anInt7136) {
         for(Iterator var33 = anArrayList7135.iterator(); var17 < anInt7136 && var33.hasNext(); var17 += var18) {
            var20 = ((Integer)var33.next()).intValue();
            var21 = var20 >> 16 & '\uffff';
            var22 = var20 & '\uffff';
            method6329(var21, var22, var15, var20, var1, var2, var7, var0);
         }
      }

      for(var19 = var11; var19 <= var13; ++var19) {
         var20 = var19 * 64;
         var21 = var20 - anInt7138;
         var22 = var16;
         int var23 = (var5 + var3 * var21 >> 16) + anInt7149;
         int var24 = (var5 + var3 * (var21 + 64) >> 16) + anInt7149;
         if(var23 + var16 != var24) {
            var22 = var24 - var23;
         }

         for(int var25 = var12; var25 <= var14; ++var25) {
            int var26 = var25 * 64;
            int var27 = var26 - anInt7148;
            int var28 = (var19 << 16) + var25;
            int var29 = var16;
            int var30 = anInt7152 - (var6 + var4 * var27 >> 16);
            int var31 = anInt7152 - (var6 + var4 * (var27 + 64) >> 16);
            if(var30 - var16 != var31) {
               var29 = var30 - var31;
            }

            var30 -= var29;
            Class153 var32 = (Class153)aClass192_7133.method2765((long)var28);
            if(var32 == null) {
               throw new RuntimeException();
            }

            if(var32.method1825() == var22 && var32.method1771() == var29) {
               var32.method1778(var23, var30);
            } else {
               var32.method1772(var23, var30, var22, var29);
            }
         }
      }

   }

   static boolean method6292(int var0, int var1) {
      int var2 = var0 >> 3;
      int var3 = var1 >> 3;
      return var2 >= 0 && var3 >= 0 && var2 < aBoolArrayArray7120.length && var3 < aBoolArrayArray7120[var2].length?aBoolArrayArray7120[var2][var3]:false;
   }

   Class525() throws Throwable {
      throw new Error();
   }

   static void method6293(Class174 var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Object var8 = anObjectArray7108[var7];
      if(var8 != null) {
         if(var8 instanceof Class526_Sub34) {
            Class526_Sub34 var9 = (Class526_Sub34)var8;
            if(var9 != null) {
               method6294(var0, var1, var2, var3, var4, var9.anIntArray10661, var9.aByteArray10660);
            }
         } else {
            Integer var10 = (Integer)var8;
            anIntArray7151[0] = var10.intValue();
            aByteArray7145[0] = aByteArray7114[var5 + var6 * anInt7102];
            method6294(var0, var1, var2, var3, var4, anIntArray7151, aByteArray7145);
         }
      }

   }

   static void method6294(Class174 var0, int[] var1, int var2, int var3, int var4, int[] var5, byte[] var6) {
      if(var5 != null) {
         for(int var7 = 0; var7 < var5.length; ++var7) {
            Class610 var8 = (Class610)aClass40_Sub8_7118.method89(var5[var7], -880543233);
            int var9 = var8.anInt7970 * -549491903;
            if(var9 != -1) {
               Class35 var10 = (Class35)aClass40_Sub3_7112.method89(var9, -1779549608);
               Class153 var11 = var10.method830(var0, var8.aBool7975?var6[var7] >> 6 & 3:0, var8.aBool7973?var8.aBool7966:false, -920196903);
               int[] var12 = var10.method833(var0, var8.aBool7975?var6[var7] >> 6 & 3:0, var8.aBool7973?var8.aBool7966:false, -1015408822);
               if(var11 != null) {
                  int var13 = var11.method21();
                  int var14 = var11.method1788();
                  int var15 = var2 * var13 / 64 >> 2;
                  int var16 = var2 * var14 / 64 >> 2;
                  int var17;
                  int var18;
                  int var19;
                  if(var10.aBool376) {
                     var17 = var8.anInt7993 * -1450399027;
                     var18 = var8.anInt7971 * 182793117;
                     if((var6[var7] >> 6 & 1) == 1) {
                        var19 = var17;
                        var17 = var18;
                        var18 = var19;
                     }

                     var15 = var17 * var2 / 64;
                     var16 = var18 * var2 / 64;
                  }

                  if(var15 != 0 && var16 != 0) {
                     var17 = var3 * var2 / 64;
                     var18 = (64 - var4) * var2 / 64 - var16 + 1;

                     for(var19 = 0; var19 < var15; ++var19) {
                        int var20 = var19 + var17;
                        if(var20 >= 0) {
                           if(var20 >= var2) {
                              break;
                           }

                           for(int var21 = 0; var21 < var16; ++var21) {
                              int var22 = var21 + var18;
                              if(var22 >= 0) {
                                 if(var22 >= var2) {
                                    break;
                                 }

                                 int var23 = var12[var19 * var13 / var15 + var13 * (var21 * var14 / var16)];
                                 int var24 = var23 >> 24 & 255;
                                 if(var24 != 0) {
                                    var1[var20 + var2 * var22] = var23;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static Class702 method6295(Class174 var0) {
      int var1 = anInt7131 - anInt7138;
      int var2 = anInt7146 - anInt7148;
      int var3 = (anInt7109 - anInt7149 << 16) / var1;
      int var4 = (anInt7152 - anInt7143 << 16) / var2;
      return method6321(var0, var3, var4, 0, 0);
   }

   static void method6296(Class174 var0, Class526_Sub35 var1, int var2, int var3, int var4, int var5) {
      var1.anInt10666 = (anInt7149 + (var4 + var2 * (var1.anInt10665 * 1427294417 - anInt7138) >> 16)) * 948329975;
      var1.anInt10667 = (anInt7152 - (var5 + var3 * (var1.anInt10662 * -1722563897 - anInt7148) >> 16)) * -425871817;
   }

   static void method6297(Class174 var0, Class526_Sub35 var1, Class238 var2) {
      if(var2.anIntArray2432 != null) {
         int[] var3 = new int[var2.anIntArray2432.length];

         int var4;
         int var5;
         int var6;
         for(var4 = 0; var4 < var3.length / 2; ++var4) {
            var5 = var2.anIntArray2432[var4 * 2] + var1.anInt10665 * 1427294417;
            var6 = var2.anIntArray2432[var4 * 2 + 1] + var1.anInt10662 * -1722563897;
            var3[var4 * 2] = anInt7149 + (anInt7109 - anInt7149) * (var5 - anInt7138) / (anInt7131 - anInt7138);
            var3[var4 * 2 + 1] = anInt7152 - (anInt7152 - anInt7143) * (var6 - anInt7148) / (anInt7146 - anInt7148);
         }

         Class175.method2653(var0, var3, var2.anInt2436 * -832815201);
         if(var2.anInt2402 * 1831267885 > 0) {
            int var7;
            int var8;
            int var9;
            for(var4 = 0; var4 < var3.length / 2 - 1; ++var4) {
               var5 = var3[var4 * 2];
               var6 = var3[var4 * 2 + 1];
               var7 = var3[(var4 + 1) * 2];
               var8 = var3[(var4 + 1) * 2 + 1];
               if(var7 < var5) {
                  var9 = var5;
                  int var10 = var6;
                  var5 = var7;
                  var6 = var8;
                  var7 = var9;
                  var8 = var10;
               } else if(var7 == var5 && var8 < var6) {
                  var9 = var6;
                  var6 = var8;
                  var8 = var9;
               }

               var0.method2297(var5, var6, var7, var8, var2.anIntArray2438[var2.aByteArray2439[var4] & 255], 1, var2.anInt2402 * 1831267885, var2.anInt2410 * 2127339551, var2.anInt2433 * -262321473);
            }

            var4 = var3[var3.length - 2];
            var5 = var3[var3.length - 1];
            var6 = var3[0];
            var7 = var3[1];
            if(var6 < var4) {
               var8 = var4;
               var9 = var5;
               var4 = var6;
               var5 = var7;
               var6 = var8;
               var7 = var9;
            } else if(var6 == var4 && var7 < var5) {
               var8 = var5;
               var5 = var7;
               var7 = var8;
            }

            var0.method2297(var4, var5, var6, var7, var2.anIntArray2438[var2.aByteArray2439[var2.aByteArray2439.length - 1] & 255], 1, var2.anInt2402 * 1831267885, var2.anInt2410 * 2127339551, var2.anInt2433 * -262321473);
         } else {
            for(var4 = 0; var4 < var3.length / 2 - 1; ++var4) {
               var0.method2465(var3[var4 * 2], var3[var4 * 2 + 1], var3[(var4 + 1) * 2], var3[(var4 + 1) * 2 + 1], var2.anIntArray2438[var2.aByteArray2439[var4] & 255], -1413172216);
            }

            var0.method2465(var3[var3.length - 2], var3[var3.length - 1], var3[0], var3[1], var2.anIntArray2438[var2.aByteArray2439[var2.aByteArray2439.length - 1] & 255], -1942837454);
         }
      }

   }

   static int method6298() {
      return (int)(64.0F * aFloat7144 / 2.0F);
   }

   static void method6299() {
      int var0;
      int var1;
      int var16;
      for(var0 = 0; var0 < anInt7102; ++var0) {
         for(var1 = 0; var1 < anInt7110; ++var1) {
            Object var2 = anObjectArray7108[var0 + var1 * anInt7102];
            if(var2 != null) {
               if(var2 instanceof Class526_Sub34) {
                  Class526_Sub34 var11 = (Class526_Sub34)var2;
                  if(var11 != null) {
                     for(int var13 = 0; var13 < var11.anIntArray10661.length; ++var13) {
                        Class610 var15 = (Class610)aClass40_Sub8_7118.method89(var11.anIntArray10661[var13], 182261215);
                        var16 = var15.anInt7969 * -1569917235;
                        if(var15.anIntArray7989 != null) {
                           var15 = var15.method7179(anInterface17_7091, anInterface19_7090, (byte)-73);
                           if(var15 != null) {
                              var16 = var15.anInt7969 * -1569917235;
                           }
                        }

                        if(var16 != -1) {
                           Class526_Sub35 var7 = new Class526_Sub35(var16);
                           var7.anInt10665 = var0 * 2077397041;
                           var7.anInt10662 = var1 * 1376149239;
                           aClass702_7106.method8176(var7, -1366832911);
                        }
                     }
                  }
               } else {
                  Integer var3 = (Integer)var2;
                  Class610 var4 = (Class610)aClass40_Sub8_7118.method89(var3.intValue(), -425621600);
                  int var5 = var4.anInt7969 * -1569917235;
                  if(var4.anIntArray7989 != null) {
                     var4 = var4.method7179(anInterface17_7091, anInterface19_7090, (byte)-58);
                     if(var4 != null) {
                        var5 = var4.anInt7969 * -1569917235;
                     }
                  }

                  if(var5 != -1) {
                     Class526_Sub35 var6 = new Class526_Sub35(var5);
                     var6.anInt10665 = var0 * 2077397041;
                     var6.anInt10662 = var1 * 1376149239;
                     aClass702_7106.method8176(var6, -695688472);
                  }
               }
            }
         }
      }

      for(var0 = 0; var0 < 3; ++var0) {
         for(var1 = 0; var1 < aHashMapArrayArrayArray7130[0].length; ++var1) {
            label89:
            for(int var10 = 0; var10 < aHashMapArrayArrayArray7130[0][0].length; ++var10) {
               HashMap var12 = aHashMapArrayArrayArray7130[var0][var1][var10];
               if(var12 != null) {
                  Iterator var14 = var12.values().iterator();

                  while(true) {
                     Class524 var17;
                     do {
                        if(!var14.hasNext()) {
                           continue label89;
                        }

                        var17 = (Class524)var14.next();
                     } while(var17.anIntArray7083 == null);

                     for(var16 = 0; var16 < var17.anIntArray7083.length; ++var16) {
                        Class610 var18 = (Class610)aClass40_Sub8_7118.method89(var17.anIntArray7083[var16], -694039719);
                        int var8 = var18.anInt7969 * -1569917235;
                        if(var18.anIntArray7989 != null) {
                           var18 = var18.method7179(anInterface17_7091, anInterface19_7090, (byte)-103);
                           if(var18 != null) {
                              var8 = var18.anInt7969 * -1569917235;
                           }
                        }

                        if(var8 != -1) {
                           Class526_Sub35 var9 = new Class526_Sub35(var8);
                           var9.anInt10665 = ((var1 + (anInt7107 >> 6)) * 64 + var17.aByte7080 - anInt7107) * 2077397041;
                           var9.anInt10662 = ((var10 + (anInt7150 >> 6)) * 64 + var17.aByte7082 - anInt7150) * 1376149239;
                           aClass702_7106.method8176(var9, -2125658135);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method6300(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = aClass635_7092.anInt8290 * -525521423 >> 24 & 255;
      int var7 = 255 - var6;
      if(aBoolArray7155[anInt7122] && (aBoolArray7155[anInt7124] || aBoolArray7155[anInt7128]) || aBoolArray7155[anInt7126] && (aBoolArray7155[anInt7124] || aBoolArray7155[anInt7128])) {
         if(aBoolArray7155[anInt7122] && aBoolArray7155[anInt7124]) {
            method6303(var0, var2 - aClass635_7092.anInt8279 * -549125969 + 1, var4 - aClass635_7092.anInt8279 * -549125969 + 1, var5, var6, var7, anInt7123);
         } else {
            method6302(var0, var2 - aClass635_7092.anInt8279 * -549125969 + 1, var2, var4 - aClass635_7092.anInt8279 * -549125969 + 1, var4, var5, var6, var7, true, true, false, false);
            if(aBoolArray7155[anInt7123]) {
               var0[(var5 - var4 - 1) * var5 + var2] = aClass635_7092.anInt8291 * -636157555;
               var0[(var5 - var4) * var5 + var2] = aClass635_7092.anInt8291 * -636157555;
               var0[(var5 - var4 - 1) * var5 + var2 - 1] = aClass635_7092.anInt8291 * -636157555;
            }
         }

         if(aBoolArray7155[anInt7126] && aBoolArray7155[anInt7124]) {
            method6303(var0, var2 - aClass635_7092.anInt8279 * -549125969 + 1, var3, var5, var6, var7, anInt7147);
         } else {
            method6302(var0, var2 - aClass635_7092.anInt8279 * -549125969 + 1, var2, var3, var3 + aClass635_7092.anInt8279 * -549125969 - 1, var5, var6, var7, false, true, true, false);
            if(aBoolArray7155[anInt7147]) {
               var0[(var5 - var3 - 1) * var5 + var2] = aClass635_7092.anInt8291 * -636157555;
               var0[(var5 - var3 - 2) * var5 + var2] = aClass635_7092.anInt8291 * -636157555;
               var0[(var5 - var3 - 1) * var5 + var2 - 1] = aClass635_7092.anInt8291 * -636157555;
            }
         }

         if(aBoolArray7155[anInt7126] && aBoolArray7155[anInt7128]) {
            method6303(var0, var1, var3, var5, var6, var7, anInt7127);
         } else {
            method6302(var0, var1, var1 + aClass635_7092.anInt8279 * -549125969 - 1, var3, var3 + aClass635_7092.anInt8279 * -549125969 - 1, var5, var6, var7, false, false, true, true);
            if(aBoolArray7155[anInt7127]) {
               var0[(var5 - var3 - 1) * var5 + var1] = aClass635_7092.anInt8291 * -636157555;
               var0[(var5 - var3 - 2) * var5 + var1] = aClass635_7092.anInt8291 * -636157555;
               var0[(var5 - var3 - 1) * var5 + var1 + 1] = aClass635_7092.anInt8291 * -636157555;
            }
         }

         if(aBoolArray7155[anInt7122] && aBoolArray7155[anInt7128]) {
            method6303(var0, var1, var4 - aClass635_7092.anInt8279 * -549125969 + 1, var5, var6, var7, anInt7129);
         } else {
            method6302(var0, var1, var1 + aClass635_7092.anInt8279 * -549125969 - 1, var4 - aClass635_7092.anInt8279 * -549125969 + 1, var4, var5, var6, var7, true, false, false, true);
            if(aBoolArray7155[anInt7129]) {
               var0[(var5 - var4 - 1) * var5 + var1] = aClass635_7092.anInt8291 * -636157555;
               var0[(var5 - var4) * var5 + var1] = aClass635_7092.anInt8291 * -636157555;
               var0[(var5 - var4 - 1) * var5 + var1 + 1] = aClass635_7092.anInt8291 * -636157555;
            }
         }

         if(var1 + aClass635_7092.anInt8279 * -549125969 < var2 - aClass635_7092.anInt8279 * -549125969) {
            method6302(var0, var1 + aClass635_7092.anInt8279 * -549125969, var2 - aClass635_7092.anInt8279 * -549125969, var3, var4, var5, var6, var7, true, false, true, false);
         }

         if(var3 + aClass635_7092.anInt8279 * -549125969 + 1 < var4 - aClass635_7092.anInt8279 * -549125969 - 1) {
            method6302(var0, var1, var1 + aClass635_7092.anInt8279 * -549125969 - 1, var3 + aClass635_7092.anInt8279 * -549125969, var4 - aClass635_7092.anInt8279 * -549125969, var5, var6, var7, false, false, false, true);
            method6302(var0, var2 - aClass635_7092.anInt8279 * -549125969 + 1, var2, var3 + aClass635_7092.anInt8279 * -549125969, var4 - aClass635_7092.anInt8279 * -549125969, var5, var6, var7, false, true, false, false);
         }

      } else {
         method6302(var0, var1, var2, var3, var4, var5, var6, var7, true, true, true, true);
         if(aBoolArray7155[anInt7123]) {
            var0[(var5 - var4 - 1) * var5 + var2] = aClass635_7092.anInt8291 * -636157555;
            var0[(var5 - var4) * var5 + var2] = aClass635_7092.anInt8291 * -636157555;
            var0[(var5 - var4 - 1) * var5 + var2 - 1] = aClass635_7092.anInt8291 * -636157555;
         }

         if(aBoolArray7155[anInt7147]) {
            var0[(var5 - var3 - 1) * var5 + var2] = aClass635_7092.anInt8291 * -636157555;
            var0[(var5 - var3 - 2) * var5 + var2] = aClass635_7092.anInt8291 * -636157555;
            var0[(var5 - var3 - 1) * var5 + var2 - 1] = aClass635_7092.anInt8291 * -636157555;
         }

         if(aBoolArray7155[anInt7127]) {
            var0[(var5 - var3 - 1) * var5 + var1] = aClass635_7092.anInt8291 * -636157555;
            var0[(var5 - var3 - 2) * var5 + var1] = aClass635_7092.anInt8291 * -636157555;
            var0[(var5 - var3 - 1) * var5 + var1 + 1] = aClass635_7092.anInt8291 * -636157555;
         }

         if(aBoolArray7155[anInt7129]) {
            var0[(var5 - var4 - 1) * var5 + var1] = aClass635_7092.anInt8291 * -636157555;
            var0[(var5 - var4) * var5 + var1] = aClass635_7092.anInt8291 * -636157555;
            var0[(var5 - var4 - 1) * var5 + var1 + 1] = aClass635_7092.anInt8291 * -636157555;
         }

      }
   }

   static void method6301() {
      int[] var0 = new int[3];

      for(int var1 = 0; var1 < aClass519_7117.anInt7044 * -1277967837; ++var1) {
         boolean var2 = aClass526_Sub21_Sub17_7093.method10717(aClass519_7117.anIntArray7043[var1] >> 28 & 3, aClass519_7117.anIntArray7043[var1] >> 14 & 16383, aClass519_7117.anIntArray7043[var1] & 16383, var0, 1282211373);
         if(var2) {
            Class526_Sub35 var3 = new Class526_Sub35(aClass519_7117.anIntArray7045[var1]);
            var3.anInt10665 = (var0[1] - anInt7107) * 2077397041;
            var3.anInt10662 = (var0[2] - anInt7150) * 1376149239;
            aClass702_7106.method8176(var3, -2115809698);
         }
      }

   }

   static void method6302(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      for(int var12 = var1; var12 <= var2; ++var12) {
         boolean var13 = var9?aBoolArray7155[anInt7124] && var2 - var12 < aClass635_7092.anInt8292 * 1202634587:false;
         boolean var14 = var11?aBoolArray7155[anInt7128] && var12 - var1 < aClass635_7092.anInt8292 * 1202634587:false;

         for(int var15 = var3; var15 <= var4; ++var15) {
            if(!var13 && !var14) {
               boolean var16 = var8?aBoolArray7155[anInt7122] && var4 - var15 < aClass635_7092.anInt8292 * 1202634587:false;
               boolean var17 = var10?aBoolArray7155[anInt7126] && var15 - var3 < aClass635_7092.anInt8292 * 1202634587:false;
               if(!var16 && !var17) {
                  int var18 = var0[(var5 - var15 - 1) * var5 + var12];
                  if(var18 != anInt7153) {
                     anInt7153 = var18;
                     anInt7154 = -16777216 | ((aClass635_7092.anInt8290 * -525521423 & 16711935) * var6 + (var18 & 16711935) * var7 & -16711936) + ((aClass635_7092.anInt8290 * -525521423 & '\uff00') * var6 + (var18 & '\uff00') * var7 & 16711680) >> 8;
                  }

                  var0[(var5 - var15 - 1) * var5 + var12] = anInt7154;
               } else {
                  var0[(var5 - var15 - 1) * var5 + var12] = aClass635_7092.anInt8291 * -636157555;
               }
            } else {
               var0[(var5 - var15 - 1) * var5 + var12] = aClass635_7092.anInt8291 * -636157555;
            }
         }
      }

   }

   static void method6303(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < aClass635_7092.anInt8279 * -549125969; ++var7) {
         int var8 = var7;
         if(var6 == anInt7123 || var6 == anInt7147) {
            var8 = aClass635_7092.anInt8279 * -549125969 - var7 - 1;
         }

         for(int var9 = 0; var9 < aClass635_7092.anInt8279 * -549125969; ++var9) {
            int var10 = var9;
            if(var6 == anInt7147 || var6 == anInt7127) {
               var10 = aClass635_7092.anInt8279 * -549125969 - var9 - 1;
            }

            int var11 = anIntArrayArray7125[var8][var10];
            if(var11 != 0) {
               if(var11 == 1) {
                  int var12 = var0[(var3 - var2 - var9 - 1) * var3 + var1 + var7];
                  if(var12 != anInt7153) {
                     anInt7153 = var12;
                     anInt7154 = -16777216 | ((aClass635_7092.anInt8290 * -525521423 & 16711935) * var4 + (var12 & 16711935) * var5 & -16711936) + ((aClass635_7092.anInt8290 * -525521423 & '\uff00') * var4 + (var12 & '\uff00') * var5 & 16711680) >> 8;
                  }

                  var0[(var3 - var2 - var9 - 1) * var3 + var1 + var7] = anInt7154;
               } else if(var11 == 2) {
                  var0[(var3 - var2 - var9 - 1) * var3 + var1 + var7] = aClass635_7092.anInt8291 * -636157555;
               }
            }
         }
      }

   }

   static void method6304(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte[] var9, int var10, int var11) {
      int var12 = 0;
      int var13 = 0;
      int var14 = var2 - var1 + 1;
      int var15 = var4 - var3 + 1;
      int var16 = (var10 << 16) / var14;
      int var17 = (var9.length / var10 << 16) / var15;
      int var18 = var1 + (var6 - var4 - 1) * var5;
      int var19 = var7 >> 24;
      int var20 = var8 >> 24;
      int var21;
      int var22;
      int var23;
      int var24;
      if(var11 != 0 && (var11 != 1 || var19 != 255 || var20 != 255)) {
         if(var11 != 1) {
            throw new IllegalArgumentException();
         }

         var21 = var12;

         for(var22 = -var15; var22 < 0; ++var22) {
            var23 = (var13 >> 16) * var10;

            for(var24 = -var14; var24 < 0; ++var24) {
               int var25 = var7;
               if(var9[(var12 >> 16) + var23] != 0) {
                  var25 = var8;
               }

               int var26 = var25 >>> 24;
               int var27 = 255 - var26;
               int var28 = var0[var18];
               var0[var18++] = -16777216 | ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & '\uff00') * var26 + (var28 & '\uff00') * var27 & 16711680) >> 8;
               var12 += var16;
            }

            var13 += var17;
            var12 = var21;
            var18 += var5 - var14;
         }
      } else {
         var21 = var12;

         for(var22 = -var15; var22 < 0; ++var22) {
            var23 = (var13 >> 16) * var10;

            for(var24 = -var14; var24 < 0; ++var24) {
               if(var9[(var12 >> 16) + var23] != 0) {
                  var0[var18++] = var8;
               } else {
                  var0[var18++] = var7;
               }

               var12 += var16;
            }

            var13 += var17;
            var12 = var21;
            var18 += var5 - var14;
         }
      }

   }

   static void method6305(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + (var4 - var2 - 1) * var4;

      for(int var7 = 0; var7 < var3; ++var7) {
         var0[var6 + var7] = var5;
      }

   }

   static void method6306(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + (var4 - var2 - 1) * var4;

      for(int var7 = 0; var7 < var3; ++var7) {
         var0[var6 + var7 * var4] = var5;
      }

   }

   static void method6307(Class174 var0, RSByteBuffer var1, int var2, int var3, int var4, int var5, int[] var6, int[] var7) {
      int var8 = var1.readUnsignedByte(-782710352);
      if((var8 & 1) == 0) {
         boolean var9 = (var8 & 2) == 0;
         int var10 = var8 >> 2 & 63;
         if(var10 == 62) {
            return;
         }

         if(var10 == 63) {
            var10 = var1.readSmart(-205119381);
         } else if(var9) {
            var10 = var6[var10];
         } else {
            var10 = var7[var10];
         }

         if(var9) {
            aShortArray7121[var4 + var5 * anInt7102] = (short)var10;
            aShortArray7115[var4 + var5 * anInt7102] = 0;
         } else {
            aShortArray7115[var4 + var5 * anInt7102] = (short)var10;
            aByteArray7101[var4 + var5 * anInt7102] = 0;
            aShortArray7121[var4 + var5 * anInt7102] = (short)var1.readSmart(-96181540);
         }
      } else {
         int var21 = (var8 >> 1 & 3) + 1;
         boolean var22 = (var8 & 8) != 0;
         boolean var11 = (var8 & 16) != 0;

         for(int var12 = 0; var12 < var21; ++var12) {
            int var13 = var1.readSmart(-919086874);
            int var14 = 0;
            int var15 = 0;
            if(var22) {
               var14 = var1.readSmart(-1069909362);
               var15 = var1.readUnsignedByte(82436104);
            }

            int var16 = 0;
            if(var11) {
               var16 = var1.readUnsignedByte(-1592852869);
            }

            int[] var17;
            byte[] var18;
            int var19;
            if(var12 == 0) {
               aShortArray7121[var4 + var5 * anInt7102] = (short)var13;
               aShortArray7115[var4 + var5 * anInt7102] = (short)var14;
               aByteArray7101[var4 + var5 * anInt7102] = (byte)var15;
               if(var16 == 1) {
                  anObjectArray7108[var4 + var5 * anInt7102] = new Integer(var1.readBigSmart((byte)10));
                  aByteArray7114[var4 + var5 * anInt7102] = var1.readByte((byte)58);
               } else if(var16 > 1) {
                  var17 = new int[var16];
                  var18 = new byte[var16];

                  for(var19 = 0; var19 < var16; ++var19) {
                     var17[var19] = var1.readBigSmart((byte)38);
                     var18[var19] = var1.readByte((byte)95);
                  }

                  anObjectArray7108[var4 + var5 * anInt7102] = new Class526_Sub34(var17, var18);
               }
            } else {
               var17 = null;
               var18 = null;
               if(var16 > 0) {
                  var17 = new int[var16];
                  var18 = new byte[var16];

                  for(var19 = 0; var19 < var16; ++var19) {
                     var17[var19] = var1.readBigSmart((byte)-5);
                     var18[var19] = var1.readByte((byte)59);
                  }
               }

               if(aHashMapArrayArrayArray7130[var12 - 1][var2 - (anInt7107 >> 6)][var3 - (anInt7150 >> 6)] == null) {
                  aHashMapArrayArrayArray7130[var12 - 1][var2 - (anInt7107 >> 6)][var3 - (anInt7150 >> 6)] = new HashMap();
               }

               var19 = ((var4 & 63) << 8) + (var5 & 63);
               Class524 var20 = new Class524(var4 & 63, var5 & 63, var13, var14, var15, var17, var18);
               aHashMapArrayArrayArray7130[var12 - 1][var2 - (anInt7107 >> 6)][var3 - (anInt7150 >> 6)].put(Integer.valueOf(var19), var20);
            }
         }
      }

   }

   static void method6308() {
      aShortArray7121 = new short[anInt7102 * anInt7110];
      aShortArray7115 = new short[anInt7102 * anInt7110];
      aByteArray7101 = new byte[anInt7102 * anInt7110];
      anObjectArray7108 = new Object[anInt7102 * anInt7110];
      aByteArray7114 = new byte[anInt7102 * anInt7110];
      aHashMapArrayArrayArray7130 = new HashMap[3][anInt7102 >> 6][anInt7110 >> 6];
      anIntArray7111 = new int[anInterface14_7119.method87(706296872) + 1];
      aBoolArrayArray7120 = new boolean[anInt7102 / 8][anInt7110 / 8];
   }

   static void method6309() {
      aShortArray7121 = new short[anInt7102 * anInt7110];
      aShortArray7115 = new short[anInt7102 * anInt7110];
      aByteArray7101 = new byte[anInt7102 * anInt7110];
      anObjectArray7108 = new Object[anInt7102 * anInt7110];
      aByteArray7114 = new byte[anInt7102 * anInt7110];
      aHashMapArrayArrayArray7130 = new HashMap[3][anInt7102 >> 6][anInt7110 >> 6];
      anIntArray7111 = new int[anInterface14_7119.method87(-1112068801) + 1];
      aBoolArrayArray7120 = new boolean[anInt7102 / 8][anInt7110 / 8];
   }

   static void method6310() {
      aShortArray7121 = null;
      aByteArray7113 = null;
      aShortArray7099 = null;
      aShortArray7115 = null;
      aByteArray7101 = null;
      anObjectArray7108 = null;
      aByteArray7114 = null;
      aHashMapArrayArrayArray7130 = (HashMap[][][])null;
      anIntArray7111 = null;
      aBoolArrayArray7120 = (boolean[][])null;
   }

   static void method6311(int var0) {
      Class526_Sub21_Sub17 var1 = (Class526_Sub21_Sub17)aClass20_7096.get((long)var0);
      if(var1 != null && var1 != aClass526_Sub21_Sub17_7093) {
         aClass526_Sub21_Sub17_7093 = var1;
         aBool7116 = aClass526_Sub21_Sub17_7093.anInt11846 * 929626277 == aClass635_7092.anInt8289 * 2054840559;
      }

   }

   static int method6312() {
      return (int)(64.0F * aFloat7144 / 2.0F);
   }

   static void method6313(int var0) {
      Class526_Sub21_Sub17 var1 = (Class526_Sub21_Sub17)aClass20_7096.get((long)var0);
      if(var1 != null && var1 != aClass526_Sub21_Sub17_7093) {
         aClass526_Sub21_Sub17_7093 = var1;
         aBool7116 = aClass526_Sub21_Sub17_7093.anInt11846 * 929626277 == aClass635_7092.anInt8289 * 2054840559;
      }

   }

   static boolean method6314(int var0, int var1) {
      int var2 = var0 >> 3;
      int var3 = var1 >> 3;
      return var2 >= 0 && var3 >= 0 && var2 < aBoolArrayArray7120.length && var3 < aBoolArrayArray7120[var2].length?aBoolArrayArray7120[var2][var3]:false;
   }

   static void method6315(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = aClass635_7092.anInt8290 * -525521423 >> 24 & 255;
      int var7 = 255 - var6;

      for(int var8 = var1; var8 <= var2; ++var8) {
         for(int var9 = var3; var9 <= var4; ++var9) {
            int var10 = var0[(var5 - var9 - 1) * var5 + var8];
            if(var10 != anInt7153) {
               anInt7153 = var10;
               anInt7154 = -16777216 | ((aClass635_7092.anInt8290 * -525521423 & 16711935) * var6 + (var10 & 16711935) * var7 & -16711936) + ((aClass635_7092.anInt8290 * -525521423 & '\uff00') * var6 + (var10 & '\uff00') * var7 & 16711680) >> 8;
            }

            var0[(var5 - var9 - 1) * var5 + var8] = anInt7154;
         }
      }

   }

   static void method6316() {
      int var0;
      int var1;
      int var16;
      for(var0 = 0; var0 < anInt7102; ++var0) {
         for(var1 = 0; var1 < anInt7110; ++var1) {
            Object var2 = anObjectArray7108[var0 + var1 * anInt7102];
            if(var2 != null) {
               if(var2 instanceof Class526_Sub34) {
                  Class526_Sub34 var11 = (Class526_Sub34)var2;
                  if(var11 != null) {
                     for(int var13 = 0; var13 < var11.anIntArray10661.length; ++var13) {
                        Class610 var15 = (Class610)aClass40_Sub8_7118.method89(var11.anIntArray10661[var13], -757898958);
                        var16 = var15.anInt7969 * -1569917235;
                        if(var15.anIntArray7989 != null) {
                           var15 = var15.method7179(anInterface17_7091, anInterface19_7090, (byte)-122);
                           if(var15 != null) {
                              var16 = var15.anInt7969 * -1569917235;
                           }
                        }

                        if(var16 != -1) {
                           Class526_Sub35 var7 = new Class526_Sub35(var16);
                           var7.anInt10665 = var0 * 2077397041;
                           var7.anInt10662 = var1 * 1376149239;
                           aClass702_7106.method8176(var7, -1638035334);
                        }
                     }
                  }
               } else {
                  Integer var3 = (Integer)var2;
                  Class610 var4 = (Class610)aClass40_Sub8_7118.method89(var3.intValue(), -74679528);
                  int var5 = var4.anInt7969 * -1569917235;
                  if(var4.anIntArray7989 != null) {
                     var4 = var4.method7179(anInterface17_7091, anInterface19_7090, (byte)-5);
                     if(var4 != null) {
                        var5 = var4.anInt7969 * -1569917235;
                     }
                  }

                  if(var5 != -1) {
                     Class526_Sub35 var6 = new Class526_Sub35(var5);
                     var6.anInt10665 = var0 * 2077397041;
                     var6.anInt10662 = var1 * 1376149239;
                     aClass702_7106.method8176(var6, -623952523);
                  }
               }
            }
         }
      }

      for(var0 = 0; var0 < 3; ++var0) {
         for(var1 = 0; var1 < aHashMapArrayArrayArray7130[0].length; ++var1) {
            label89:
            for(int var10 = 0; var10 < aHashMapArrayArrayArray7130[0][0].length; ++var10) {
               HashMap var12 = aHashMapArrayArrayArray7130[var0][var1][var10];
               if(var12 != null) {
                  Iterator var14 = var12.values().iterator();

                  while(true) {
                     Class524 var17;
                     do {
                        if(!var14.hasNext()) {
                           continue label89;
                        }

                        var17 = (Class524)var14.next();
                     } while(var17.anIntArray7083 == null);

                     for(var16 = 0; var16 < var17.anIntArray7083.length; ++var16) {
                        Class610 var18 = (Class610)aClass40_Sub8_7118.method89(var17.anIntArray7083[var16], 143934888);
                        int var8 = var18.anInt7969 * -1569917235;
                        if(var18.anIntArray7989 != null) {
                           var18 = var18.method7179(anInterface17_7091, anInterface19_7090, (byte)-10);
                           if(var18 != null) {
                              var8 = var18.anInt7969 * -1569917235;
                           }
                        }

                        if(var8 != -1) {
                           Class526_Sub35 var9 = new Class526_Sub35(var8);
                           var9.anInt10665 = ((var1 + (anInt7107 >> 6)) * 64 + var17.aByte7080 - anInt7107) * 2077397041;
                           var9.anInt10662 = ((var10 + (anInt7150 >> 6)) * 64 + var17.aByte7082 - anInt7150) * 1376149239;
                           aClass702_7106.method8176(var9, -116532813);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method6317() {
      int var0;
      int var1;
      int var16;
      for(var0 = 0; var0 < anInt7102; ++var0) {
         for(var1 = 0; var1 < anInt7110; ++var1) {
            Object var2 = anObjectArray7108[var0 + var1 * anInt7102];
            if(var2 != null) {
               if(var2 instanceof Class526_Sub34) {
                  Class526_Sub34 var11 = (Class526_Sub34)var2;
                  if(var11 != null) {
                     for(int var13 = 0; var13 < var11.anIntArray10661.length; ++var13) {
                        Class610 var15 = (Class610)aClass40_Sub8_7118.method89(var11.anIntArray10661[var13], -1133498402);
                        var16 = var15.anInt7969 * -1569917235;
                        if(var15.anIntArray7989 != null) {
                           var15 = var15.method7179(anInterface17_7091, anInterface19_7090, (byte)-88);
                           if(var15 != null) {
                              var16 = var15.anInt7969 * -1569917235;
                           }
                        }

                        if(var16 != -1) {
                           Class526_Sub35 var7 = new Class526_Sub35(var16);
                           var7.anInt10665 = var0 * 2077397041;
                           var7.anInt10662 = var1 * 1376149239;
                           aClass702_7106.method8176(var7, -359612618);
                        }
                     }
                  }
               } else {
                  Integer var3 = (Integer)var2;
                  Class610 var4 = (Class610)aClass40_Sub8_7118.method89(var3.intValue(), -1734606237);
                  int var5 = var4.anInt7969 * -1569917235;
                  if(var4.anIntArray7989 != null) {
                     var4 = var4.method7179(anInterface17_7091, anInterface19_7090, (byte)-55);
                     if(var4 != null) {
                        var5 = var4.anInt7969 * -1569917235;
                     }
                  }

                  if(var5 != -1) {
                     Class526_Sub35 var6 = new Class526_Sub35(var5);
                     var6.anInt10665 = var0 * 2077397041;
                     var6.anInt10662 = var1 * 1376149239;
                     aClass702_7106.method8176(var6, -848282902);
                  }
               }
            }
         }
      }

      for(var0 = 0; var0 < 3; ++var0) {
         for(var1 = 0; var1 < aHashMapArrayArrayArray7130[0].length; ++var1) {
            label89:
            for(int var10 = 0; var10 < aHashMapArrayArrayArray7130[0][0].length; ++var10) {
               HashMap var12 = aHashMapArrayArrayArray7130[var0][var1][var10];
               if(var12 != null) {
                  Iterator var14 = var12.values().iterator();

                  while(true) {
                     Class524 var17;
                     do {
                        if(!var14.hasNext()) {
                           continue label89;
                        }

                        var17 = (Class524)var14.next();
                     } while(var17.anIntArray7083 == null);

                     for(var16 = 0; var16 < var17.anIntArray7083.length; ++var16) {
                        Class610 var18 = (Class610)aClass40_Sub8_7118.method89(var17.anIntArray7083[var16], -285910303);
                        int var8 = var18.anInt7969 * -1569917235;
                        if(var18.anIntArray7989 != null) {
                           var18 = var18.method7179(anInterface17_7091, anInterface19_7090, (byte)-26);
                           if(var18 != null) {
                              var8 = var18.anInt7969 * -1569917235;
                           }
                        }

                        if(var8 != -1) {
                           Class526_Sub35 var9 = new Class526_Sub35(var8);
                           var9.anInt10665 = ((var1 + (anInt7107 >> 6)) * 64 + var17.aByte7080 - anInt7107) * 2077397041;
                           var9.anInt10662 = ((var10 + (anInt7150 >> 6)) * 64 + var17.aByte7082 - anInt7150) * 1376149239;
                           aClass702_7106.method8176(var9, -1189222545);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method6318() {
      int[] var0 = new int[3];

      for(int var1 = 0; var1 < aClass519_7117.anInt7044 * -1277967837; ++var1) {
         boolean var2 = aClass526_Sub21_Sub17_7093.method10717(aClass519_7117.anIntArray7043[var1] >> 28 & 3, aClass519_7117.anIntArray7043[var1] >> 14 & 16383, aClass519_7117.anIntArray7043[var1] & 16383, var0, -370977855);
         if(var2) {
            Class526_Sub35 var3 = new Class526_Sub35(aClass519_7117.anIntArray7045[var1]);
            var3.anInt10665 = (var0[1] - anInt7107) * 2077397041;
            var3.anInt10662 = (var0[2] - anInt7150) * 1376149239;
            aClass702_7106.method8176(var3, -1230476635);
         }
      }

   }

   static void method6319() {
      int var0;
      int var1;
      int var16;
      for(var0 = 0; var0 < anInt7102; ++var0) {
         for(var1 = 0; var1 < anInt7110; ++var1) {
            Object var2 = anObjectArray7108[var0 + var1 * anInt7102];
            if(var2 != null) {
               if(var2 instanceof Class526_Sub34) {
                  Class526_Sub34 var11 = (Class526_Sub34)var2;
                  if(var11 != null) {
                     for(int var13 = 0; var13 < var11.anIntArray10661.length; ++var13) {
                        Class610 var15 = (Class610)aClass40_Sub8_7118.method89(var11.anIntArray10661[var13], 222878460);
                        var16 = var15.anInt7969 * -1569917235;
                        if(var15.anIntArray7989 != null) {
                           var15 = var15.method7179(anInterface17_7091, anInterface19_7090, (byte)-103);
                           if(var15 != null) {
                              var16 = var15.anInt7969 * -1569917235;
                           }
                        }

                        if(var16 != -1) {
                           Class526_Sub35 var7 = new Class526_Sub35(var16);
                           var7.anInt10665 = var0 * 2077397041;
                           var7.anInt10662 = var1 * 1376149239;
                           aClass702_7106.method8176(var7, -516474739);
                        }
                     }
                  }
               } else {
                  Integer var3 = (Integer)var2;
                  Class610 var4 = (Class610)aClass40_Sub8_7118.method89(var3.intValue(), -365865745);
                  int var5 = var4.anInt7969 * -1569917235;
                  if(var4.anIntArray7989 != null) {
                     var4 = var4.method7179(anInterface17_7091, anInterface19_7090, (byte)-53);
                     if(var4 != null) {
                        var5 = var4.anInt7969 * -1569917235;
                     }
                  }

                  if(var5 != -1) {
                     Class526_Sub35 var6 = new Class526_Sub35(var5);
                     var6.anInt10665 = var0 * 2077397041;
                     var6.anInt10662 = var1 * 1376149239;
                     aClass702_7106.method8176(var6, -1782145383);
                  }
               }
            }
         }
      }

      for(var0 = 0; var0 < 3; ++var0) {
         for(var1 = 0; var1 < aHashMapArrayArrayArray7130[0].length; ++var1) {
            label89:
            for(int var10 = 0; var10 < aHashMapArrayArrayArray7130[0][0].length; ++var10) {
               HashMap var12 = aHashMapArrayArrayArray7130[var0][var1][var10];
               if(var12 != null) {
                  Iterator var14 = var12.values().iterator();

                  while(true) {
                     Class524 var17;
                     do {
                        if(!var14.hasNext()) {
                           continue label89;
                        }

                        var17 = (Class524)var14.next();
                     } while(var17.anIntArray7083 == null);

                     for(var16 = 0; var16 < var17.anIntArray7083.length; ++var16) {
                        Class610 var18 = (Class610)aClass40_Sub8_7118.method89(var17.anIntArray7083[var16], -1716357489);
                        int var8 = var18.anInt7969 * -1569917235;
                        if(var18.anIntArray7989 != null) {
                           var18 = var18.method7179(anInterface17_7091, anInterface19_7090, (byte)-109);
                           if(var18 != null) {
                              var8 = var18.anInt7969 * -1569917235;
                           }
                        }

                        if(var8 != -1) {
                           Class526_Sub35 var9 = new Class526_Sub35(var8);
                           var9.anInt10665 = ((var1 + (anInt7107 >> 6)) * 64 + var17.aByte7080 - anInt7107) * 2077397041;
                           var9.anInt10662 = ((var10 + (anInt7150 >> 6)) * 64 + var17.aByte7082 - anInt7150) * 1376149239;
                           aClass702_7106.method8176(var9, -891979990);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method6320(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = var1; var8 <= var2; ++var8) {
         for(int var9 = var3; var9 <= var4; ++var9) {
            var0[(var6 - var9 - 1) * var5 + var8] = var7;
         }
      }

   }

   static Class702 method6321(Class174 var0, int var1, int var2, int var3, int var4) {
      for(Class526_Sub35 var5 = (Class526_Sub35)aClass702_7106.method8206((byte)113); var5 != null; var5 = (Class526_Sub35)aClass702_7106.method8181(-760981728)) {
         method6296(var0, var5, var1, var2, var3, var4);
      }

      return aClass702_7106;
   }

   static void method6322() {
      int[] var0 = new int[3];

      for(int var1 = 0; var1 < aClass519_7117.anInt7044 * -1277967837; ++var1) {
         boolean var2 = aClass526_Sub21_Sub17_7093.method10717(aClass519_7117.anIntArray7043[var1] >> 28 & 3, aClass519_7117.anIntArray7043[var1] >> 14 & 16383, aClass519_7117.anIntArray7043[var1] & 16383, var0, 1857098296);
         if(var2) {
            Class526_Sub35 var3 = new Class526_Sub35(aClass519_7117.anIntArray7045[var1]);
            var3.anInt10665 = (var0[1] - anInt7107) * 2077397041;
            var3.anInt10662 = (var0[2] - anInt7150) * 1376149239;
            aClass702_7106.method8176(var3, -1220866944);
         }
      }

   }

   static boolean method6323(int var0, int var1) {
      int var2 = var0 >> 3;
      int var3 = var1 >> 3;
      return var2 >= 0 && var3 >= 0 && var2 < aBoolArrayArray7120.length && var3 < aBoolArrayArray7120[var2].length?aBoolArrayArray7120[var2][var3]:false;
   }

   static boolean method6324(int var0, int var1) {
      int var2 = var0 >> 3;
      int var3 = var1 >> 3;
      return var2 >= 0 && var3 >= 0 && var2 < aBoolArrayArray7120.length && var3 < aBoolArrayArray7120[var2].length?aBoolArrayArray7120[var2][var3]:false;
   }

   static void method6325(Class174 var0, int var1, int var2, int var3, int var4) {
      Class153 var5 = (Class153)aClass192_7133.method2765(-1L);
      if(var5 == null || var5.method1825() != var3) {
         int var6;
         if(aClass526_Sub21_Sub17_7093.anInt11847 * -146946371 != -1) {
            var6 = -16777216 | aClass526_Sub21_Sub17_7093.anInt11847 * -146946371;
         } else {
            var6 = -16777216;
         }

         if(anIntArray7137 == null || anIntArray7137.length != var3 * var3) {
            anIntArray7137 = new int[var3 * var3];
         }

         Arrays.fill(anIntArray7137, var6);
         var5 = var0.method2613(anIntArray7137, 0, var3, var3, var3, true);
         aClass192_7133.method2768(var5, -1L);
      }

      aClass192_7133.method2768(var5, (long)var4);
   }

   public static Class696 method6326(int var0, int var1) {
      Class696 var2 = new Class696();

      for(Class526_Sub21_Sub17 var3 = (Class526_Sub21_Sub17)aClass20_7096.method638(-1804697795); var3 != null; var3 = (Class526_Sub21_Sub17)aClass20_7096.method639(-1798782044)) {
         if(var3.aBool11845 && var3.method10713(var0, var1, 1782689526)) {
            var2.offer(var3, (byte)-8);
         }
      }

      return var2;
   }

   static void method6327(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      anInt7138 = var0 - anInt7107;
      anInt7146 = var1 - anInt7150;
      anInt7131 = var2 - anInt7107;
      anInt7148 = var3 - anInt7150;
      anInt7149 = var4;
      anInt7143 = var5;
      anInt7109 = var6;
      anInt7152 = var7;
   }

   static {
      anInt7122 = NPCDirection.EAST.getId();
      anInt7123 = NPCDirection.SOUTH_WEST.getId();
      anInt7124 = NPCDirection.NORTH_WEST.getId();
      anInt7147 = NPCDirection.NORTH.getId();
      anInt7126 = NPCDirection.NORTH_EAST.getId();
      anInt7127 = NPCDirection.SOUTH.getId();
      anInt7128 = NPCDirection.WEST.getId();
      anInt7129 = NPCDirection.SOUTH_EAST.getId();
      aClass192_7089 = new Class192(4096, 256);
      aClass192_7132 = new Class192(4096, 1024);
      aClass192_7133 = aClass192_7089;
      anArrayList7135 = new ArrayList();
      anInt7136 = 262144;
      anInt7085 = 0;
      anInt7139 = 5;
      aClass526_Sub36_7140 = null;
      aClass526_Sub36_7141 = null;
      aBool7142 = true;
      new Date();
      anInt7153 = 0;
      anInt7154 = 0;
      aBoolArray7155 = new boolean[8];
   }

   static void method6328(int[] var0, int var1, int var2, int var3, int var4, int var5, boolean var6, int var7, int var8, int var9, int[] var10, byte[] var11, boolean var12) {
      int var13;
      int var14;
      int var15;
      if(var12 || var7 != 0 || var8 > 0) {
         if(var8 == 0) {
            method6320(var0, var1, var2, var3, var4, var5, var5, var7 | -16777216);
         } else {
            var13 = var9 & 63;
            if(var13 != 0 && anInt7100 != 0) {
               var14 = var12?0:1;
               var15 = Class522.method6259(var9 >> 6 & 3, var13, 730853599);
               var13 = Class258.method3516(var13, -887331694);
               method6304(var0, var1, var2, var3, var4, var5, var5, var7, anIntArray7111[var8], aByteArrayArrayArray7105[var13 - 1][var15], anInt7100, var14);
            } else {
               var14 = anIntArray7111[var8];
               if(var12 || var14 != 0) {
                  method6320(var0, var1, var2, var3, var4, var5, var5, var14 | -16777216);
               }
            }
         }
      }

      if(var6 && var10 != null) {
         var13 = var2 - var1 + 1;
         var14 = var4 - var3 + 1;

         for(var15 = 0; var15 < var10.length; ++var15) {
            int var16 = var11[var15] & 63;
            if(var16 == Class594.aClass594_7822.anInt7833 * -1226971375 || var16 == Class594.aClass594_7823.anInt7833 * -1226971375 || var16 == Class594.aClass594_7824.anInt7833 * -1226971375 || var16 == Class594.aClass594_7844.anInt7833 * -1226971375) {
               Class610 var17 = (Class610)aClass40_Sub8_7118.method89(var10[var15], -842474892);
               if(var17.anInt7970 * -549491903 == -1) {
                  int var18 = -3355444;
                  if(var17.anInt7954 * 909601847 == 1) {
                     var18 = -3407872;
                  }

                  int var19 = var11[var15] >> 6 & 3;
                  if(var16 == Class594.aClass594_7822.anInt7833 * -1226971375) {
                     if(var19 == 0) {
                        method6306(var0, var1, var4, var14, var5, var18);
                     } else if(var19 == 1) {
                        method6305(var0, var1, var4, var13, var5, var18);
                     } else if(var19 == 2) {
                        method6306(var0, var2, var4, var14, var5, var18);
                     } else {
                        method6305(var0, var1, var3, var13, var5, var18);
                     }
                  } else if(var16 == Class594.aClass594_7823.anInt7833 * -1226971375) {
                     if(var19 == 0) {
                        method6306(var0, var1, var4, var14, var5, -1);
                        method6305(var0, var1, var4, var13, var5, var18);
                     } else if(var19 == 1) {
                        method6306(var0, var2, var4, var14, var5, -1);
                        method6305(var0, var1, var4, var13, var5, var18);
                     } else if(var19 == 2) {
                        method6306(var0, var2, var4, var14, var5, -1);
                        method6305(var0, var1, var3, var13, var5, var18);
                     } else {
                        method6306(var0, var1, var4, var14, var5, -1);
                        method6305(var0, var1, var3, var13, var5, var18);
                     }
                  } else if(var16 == Class594.aClass594_7824.anInt7833 * -1226971375) {
                     if(var19 == 0) {
                        method6305(var0, var1, var4, 1, var5, var18);
                     } else if(var19 == 1) {
                        method6305(var0, var2, var4, 1, var5, var18);
                     } else if(var19 == 2) {
                        method6305(var0, var2, var3, 1, var5, var18);
                     } else {
                        method6305(var0, var1, var3, 1, var5, var18);
                     }
                  } else if(var16 == Class594.aClass594_7844.anInt7833 * -1226971375) {
                     int var20;
                     if(var19 != 0 && var19 != 2) {
                        for(var20 = 0; var20 < var14; ++var20) {
                           method6305(var0, var1 + var20, var4 - var20, 1, var5, var18);
                        }
                     } else {
                        for(var20 = 0; var20 < var14; ++var20) {
                           method6305(var0, var1 + var20, var3 + var20, 1, var5, var18);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static void method6329(int var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6, Class174 var7) {
      int var8 = var0 * 64;
      int var9 = var1 * 64;
      if(anIntArray7137 == null || anIntArray7137.length != var2 * var2) {
         anIntArray7137 = new int[var2 * var2];
      }

      boolean var10 = aBool7116 && !var6;

      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var18;
      int var22;
      int var23;
      int var31;
      for(var11 = 0; var11 < 64; ++var11) {
         var12 = var8 + var11;
         var13 = var11 * var2 / 64;
         var14 = (var11 + 1) * var2 / 64 - 1;
         if(var14 < var13) {
            var14 = var13;
         }

         for(var15 = 0; var15 < 64; ++var15) {
            var16 = var9 + var15;
            boolean var17 = var4;
            if(var10 && !method6314(var12, var16)) {
               var17 = false;
            }

            var18 = var12 + var16 * anInt7102;
            boolean var19 = false;
            boolean var20 = false;
            Object var21 = null;
            var31 = (aByteArray7113[var18] & 255) << 16 | aShortArray7099[var18] & '\uffff';
            if(var31 != 0) {
               var31 |= -16777216;
            }

            short var32 = aShortArray7115[var18];
            var21 = anObjectArray7108[var18];
            var22 = var15 * var2 / 64;
            var23 = (var15 + 1) * var2 / 64 - 1;
            if(var23 < var22) {
               var23 = var22;
            }

            if(var21 != null) {
               if(var21 instanceof Class526_Sub34) {
                  Class526_Sub34 var24 = (Class526_Sub34)var21;
                  if(var24 != null) {
                     method6328(anIntArray7137, var13, var14, var22, var23, var2, var17, var31, var32, aByteArray7101[var18], var24.anIntArray10661, var24.aByteArray10660, true);
                  }
               } else {
                  Integer var38 = (Integer)var21;
                  anIntArray7151[0] = var38.intValue();
                  aByteArray7145[0] = aByteArray7114[var18];
                  method6328(anIntArray7137, var13, var14, var22, var23, var2, var17, var31, var32, aByteArray7101[var18], anIntArray7151, aByteArray7145, true);
               }
            } else {
               method6328(anIntArray7137, var13, var14, var22, var23, var2, var17, var31, var32, aByteArray7101[var18], (int[])null, (byte[])null, true);
            }
         }
      }

      int var30;
      if(var5) {
         for(var11 = 0; var11 < 64; ++var11) {
            var12 = var8 + var11;
            boolean var27 = var11 == 0 && var12 != 0;

            for(var14 = 0; var14 < 64; ++var14) {
               var15 = var9 + var14;
               if(!var10 || method6314(var12, var15)) {
                  boolean var29 = var14 == 0 && var15 != 0;
                  var30 = var12 + var15 * anInt7102;
                  if(var27 && var29) {
                     method6293(var7, anIntArray7137, var2, -1, -1, var12 - 1, var15 - 1, var30 - 1 - anInt7102);
                  }

                  if(var27) {
                     method6293(var7, anIntArray7137, var2, -1, var14, var12 - 1, var15, var30 - 1);
                  }

                  if(var29) {
                     method6293(var7, anIntArray7137, var2, var11, -1, var12, var15 - 1, var30 - anInt7102);
                  }

                  method6293(var7, anIntArray7137, var2, var11, var14, var12, var15, var30);
               }
            }
         }
      }

      var11 = var0 * 64 / 64;
      var12 = var1 * 64 / 64;

      int var33;
      for(var13 = 0; var13 < 3; ++var13) {
         for(var14 = 0; var14 < 64; ++var14) {
            var15 = var8 + var14;
            var16 = var15 & 63;
            var30 = var14 * var2 / 64;
            var18 = (var14 + 1) * var2 / 64 - 1;
            if(var18 < var30) {
               var18 = var30;
            }

            for(var31 = 0; var31 < 64; ++var31) {
               var33 = var9 + var31;
               boolean var35 = var4;
               if(var10 && !method6314(var15, var33)) {
                  var35 = false;
               }

               var22 = var33 & 63;
               var23 = var31 * var2 / 64;
               int var39 = (var31 + 1) * var2 / 64 - 1;
               if(var39 < var23) {
                  var39 = var23;
               }

               HashMap var25 = aHashMapArrayArrayArray7130[var13][var11][var12];
               if(var25 != null) {
                  Class524 var26 = (Class524)var25.get(Integer.valueOf((var16 << 8) + var22));
                  if(var26 != null) {
                     method6328(anIntArray7137, var30, var18, var23, var39, var2, var35, var26.anInt7079, var26.aShort7078, var26.aByte7081, var26.anIntArray7083, var26.aByteArray7084, false);
                  }
               }
            }
         }

         for(var14 = 0; var14 < 64; ++var14) {
            var15 = var8 + var14;
            var16 = var15 & 63;

            for(var30 = 0; var30 < 64; ++var30) {
               var18 = var9 + var30;
               if(!var10 || method6314(var15, var18)) {
                  var31 = var18 & 63;
                  HashMap var34 = aHashMapArrayArrayArray7130[var13][var11][var12];
                  if(var34 != null) {
                     Class524 var36 = (Class524)var34.get(Integer.valueOf((var16 << 8) + var31));
                     if(var36 != null) {
                        method6294(var7, anIntArray7137, var2, var14, var30, var36.anIntArray7083, var36.aByteArray7084);
                     }
                  }
               }
            }
         }
      }

      if(var10) {
         byte var28 = 8;

         for(var14 = 0; var14 < var28; ++var14) {
            var15 = var8 + var14 * 8;
            var16 = var14 * var2 / var28;
            var30 = (var14 + 1) * var2 / var28 - 1;

            for(var18 = 0; var18 < var28; ++var18) {
               var31 = var9 + var18 * 8;
               if(!method6314(var15, var31)) {
                  var33 = var18 * var2 / var28;
                  int var37 = (var18 + 1) * var2 / var28 - 1;
                  if(var2 < 64) {
                     method6315(anIntArray7137, var16, var30, var33, var37, var2);
                  } else {
                     aBoolArray7155[anInt7122] = method6314(var15, var31 + 8);
                     aBoolArray7155[anInt7123] = method6314(var15 + 8, var31 + 8);
                     aBoolArray7155[anInt7124] = method6314(var15 + 8, var31);
                     aBoolArray7155[anInt7147] = method6314(var15 + 8, var31 - 8);
                     aBoolArray7155[anInt7126] = method6314(var15, var31 - 8);
                     aBoolArray7155[anInt7127] = method6314(var15 - 8, var31 - 8);
                     aBoolArray7155[anInt7128] = method6314(var15 - 8, var31);
                     aBoolArray7155[anInt7129] = method6314(var15 - 8, var31 + 8);
                     method6300(anIntArray7137, var16, var30, var33, var37, var2);
                  }
               }
            }
         }
      }

      aClass192_7133.method2768(var7.method2613(anIntArray7137, 0, var2, var2, var2, true), (long)var3);
   }
}
