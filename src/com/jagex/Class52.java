package com.jagex;

import com.jagex.Class1;
import com.jagex.Class101;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class163;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class199_Sub3;
import com.jagex.Class205;
import com.jagex.Class230;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class281;
import com.jagex.Class325;
import com.jagex.Class331;
import com.jagex.Class376;
import com.jagex.Class422;
import com.jagex.Class425;
import com.jagex.Class433;
import com.jagex.Class45;
import com.jagex.Class526_Sub21_Sub14;
import com.jagex.Buffer;
import com.jagex.Class526_Sub42;
import com.jagex.Class554;
import com.jagex.Class577;
import com.jagex.Class661;
import com.jagex.Class675;
import com.jagex.Class687;
import com.jagex.Class702;
import com.jagex.Class97_Sub1_Sub2;
import com.jagex.Exception_Sub4;
import com.jagex.IcmpService_Sub1;
import com.jagex.Interface3;
import com.jagex.client;
import java.awt.Dimension;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class52 {
   public static Class97_Sub1_Sub2 aClass97_Sub1_Sub2_665;
   static Class702 aClass702_664 = new Class702();

   Class52() throws Throwable {
      throw new Error();
   }

   public static void method958() {
      aClass702_664 = new Class702();
   }

   public static void method959() {
      aClass702_664 = new Class702();
   }

   public static void method960() {
      aClass702_664 = new Class702();
   }

   public static void method961() {
      aClass702_664 = new Class702();
   }

   public static void method962(Buffer var0) {
      Class526_Sub42 var1 = (Class526_Sub42)aClass702_664.method8206((byte)92);
      if(null != var1) {
         int var2 = 301018015 * var0.pos;
         var0.writeInt(var1.anInt10800 * -918935199, -357564953);

         for(int var3 = 0; var3 < var1.anInt10799 * 1056443493; ++var3) {
            if(var1.anIntArray10798[var3] != 0) {
               var0.writeByte(var1.anIntArray10798[var3], 425313507);
            } else {
               try {
                  int var4 = var1.anIntArray10801[var3];
                  Field var5;
                  int var6;
                  if(var4 == 0) {
                     var5 = var1.aFieldArray10802[var3];
                     var6 = var5.getInt((Object)null);
                     var0.writeByte(0, -1786704913);
                     var0.writeInt(var6, -357564953);
                  } else if(1 == var4) {
                     var5 = var1.aFieldArray10802[var3];
                     var5.setInt((Object)null, var1.anIntArray10805[var3]);
                     var0.writeByte(0, -1650261119);
                  } else if(var4 == 2) {
                     var5 = var1.aFieldArray10802[var3];
                     var6 = var5.getModifiers();
                     var0.writeByte(0, 1165245849);
                     var0.writeInt(var6, -357564953);
                  }

                  Method var22;
                  if(var4 != 3) {
                     if(4 == var4) {
                        var22 = var1.aMethodArray10804[var3];
                        var6 = var22.getModifiers();
                        var0.writeByte(0, -157385706);
                        var0.writeInt(var6, -357564953);
                     }
                  } else {
                     var22 = var1.aMethodArray10804[var3];
                     byte[][] var23 = var1.aByteArrayArrayArray10803[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if(var24 == null) {
                        var0.writeByte(0, -779384191);
                     } else if(var24 instanceof Number) {
                        var0.writeByte(1, 1658313424);
                        var0.method9621(((Number)var24).longValue());
                     } else if(var24 instanceof String) {
                        var0.writeByte(2, 1157537081);
                        var0.method9616((String)var24, -1400394102);
                     } else {
                        var0.writeByte(4, 376037660);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.writeByte(-10, -1011290718);
               } catch (InvalidClassException var11) {
                  var0.writeByte(-11, 1773863145);
               } catch (StreamCorruptedException var12) {
                  var0.writeByte(-12, -1956283920);
               } catch (OptionalDataException var13) {
                  var0.writeByte(-13, -1384927179);
               } catch (IllegalAccessException var14) {
                  var0.writeByte(-14, 1254626775);
               } catch (IllegalArgumentException var15) {
                  var0.writeByte(-15, -1540911227);
               } catch (InvocationTargetException var16) {
                  var0.writeByte(-16, -449876433);
               } catch (SecurityException var17) {
                  var0.writeByte(-17, 1210716344);
               } catch (IOException var18) {
                  var0.writeByte(-18, 21360819);
               } catch (NullPointerException var19) {
                  var0.writeByte(-19, 14246484);
               } catch (Exception var20) {
                  var0.writeByte(-20, 744217796);
               } catch (Throwable var21) {
                  var0.writeByte(-21, -1901628207);
               }
            }
         }

         var0.method9624(var2, 1915856684);
         var1.method6332(-1949449864);
      }
   }

   public static void method963() {
      aClass702_664 = new Class702();
   }

   static String method964(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = Class675.aCharArray8583[(int)(var6 - var0 * 37L)];
               if(var8 == 95) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   public static void method965(String var0, boolean var1, Class174 var2, Class163 var3, Class1 var4, byte var5) {
      boolean var6 = !Class281.aBool3047 || Class325.method4179((byte)-94);
      if(var6) {
         int var7;
         int var8;
         int var10;
         int var11;
         if(Class281.aBool3047 && var6) {
            var4 = Class101.aClass1_1209;
            var3 = var2.method2313(var4, Class376.aClass173_Sub2Array3912, true);
            var7 = var4.method515(var0, 250, (Interface3[])null, (byte)35);
            var8 = var4.method513(var0, 250, -730103023 * var4.anInt11, (Interface3[])null, (byte)-76);
            int var14 = Class526_Sub21_Sub14.aClass173_11824.method2168();
            var10 = var14 + 4;
            var7 += var10 * 2;
            var8 += var10 * 2;
            if(var7 < -395327035 * Class101.anInt1210) {
               var7 = Class101.anInt1210 * -395327035;
            }

            if(var8 < Class101.anInt1211 * 830631323) {
               var8 = Class101.anInt1211 * 830631323;
            }

            var11 = Class101.aClass384_1215.method4725(var7, client.anInt11229 * 1969269047, (byte)50) + -243416225 * IcmpService_Sub1.anInt10844;
            int var12 = Class101.aClass389_1208.method4771(var8, 172204199 * client.anInt11240, (byte)0) + Class101.anInt1214 * -542024849;
            var2.method2310(Class687.aClass173_8678, false).method1784(var11 + Class101.aClass173_1213.method2168(), var12 + Class101.aClass173_1213.method2175(), var7 - Class101.aClass173_1213.method2168() * 2, var8 - Class101.aClass173_1213.method2175() * 2, 1, -1, 0);
            var2.method2310(Class101.aClass173_1213, true).method1778(var11, var12);
            Class101.aClass173_1213.method2183();
            var2.method2310(Class101.aClass173_1213, true).method1778(var7 + var11 - var14, var12);
            Class101.aClass173_1213.method2207();
            var2.method2310(Class101.aClass173_1213, true).method1778(var11 + var7 - var14, var12 + var8 - var14);
            Class101.aClass173_1213.method2183();
            var2.method2310(Class101.aClass173_1213, true).method1778(var11, var12 + var8 - var14);
            Class101.aClass173_1213.method2207();
            var2.method2310(Class526_Sub21_Sub14.aClass173_11824, true).method1783(var11, var12 + Class101.aClass173_1213.method2175(), var14, var8 - Class101.aClass173_1213.method2175() * 2);
            Class526_Sub21_Sub14.aClass173_11824.method2208();
            var2.method2310(Class526_Sub21_Sub14.aClass173_11824, true).method1783(var11 + Class101.aClass173_1213.method2168(), var12, var7 - Class101.aClass173_1213.method2168() * 2, var14);
            Class526_Sub21_Sub14.aClass173_11824.method2208();
            var2.method2310(Class526_Sub21_Sub14.aClass173_11824, true).method1783(var11 + var7 - var14, var12 + Class101.aClass173_1213.method2175(), var14, var8 - Class101.aClass173_1213.method2175() * 2);
            Class526_Sub21_Sub14.aClass173_11824.method2208();
            var2.method2310(Class526_Sub21_Sub14.aClass173_11824, true).method1783(var11 + Class101.aClass173_1213.method2168(), var8 + var12 - var14, var7 - Class101.aClass173_1213.method2168() * 2, var14);
            Class526_Sub21_Sub14.aClass173_11824.method2208();
            var3.method1915(var0, var11 + var10, var10 + var12, var7 - var10 * 2, var8 - var10 * 2, 1268140515 * Class101.anInt1207 | -16777216, -1, 1, 1, 0, (Class153[])null, (int[])null, (Class162)null, 0, 0, (byte)33);
            Class205.method2895(var11, var12, var7, var8, -925506563);
         } else {
            var7 = var4.method515(var0, 250, (Interface3[])null, (byte)74);
            var8 = var4.method506(var0, 250, (Interface3[])null, (short)-187) * 13;
            byte var9 = 4;
            var10 = var9 + 6;
            var11 = 6 + var9;
            var2.method2290(var10 - var9, var11 - var9, var7 + var9 + var9, var9 + var8 + var9, -16777216, 0);
            var2.method2261(var10 - var9, var11 - var9, var9 + var7 + var9, var9 + var8 + var9, -1, 0);
            var3.method1915(var0, var10, var11, var7, var8, -1, -1, 1, 1, 0, (Class153[])null, (int[])null, (Class162)null, 0, 0, (byte)-51);
            Class205.method2895(var10 - var9, var11 - var9, var7 + var9 + var9, var9 + var8 + var9, -1349204612);
         }

         if(var1) {
            try {
               var2.method2312();
               var2.method2229((byte)-16);
            } catch (Exception_Sub4 var13) {
               ;
            }
         }

      }
   }

   public static int method966(int var0, int var1, int var2) {
      if(Class331.aClass613_3498.anInt8052 * -721675347 == -1) {
         return 1;
      } else {
         if(var0 != Class230.preferences.aClass711_Sub19_10633.method10022((byte)-110)) {
            Class661.method7926(var0, Class45.aClass45_604.method920(Class26.aClass673_247, -827840379), true, 1228368577);
            if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-37) != var0) {
               return -1;
            }
         }

         try {
            Dimension var3 = Class425.aCanvas4798.getSize();
            method965(Class45.aClass45_604.method920(Class26.aClass673_247, -827840379), true, Class554.aClass174_7475, Class422.aClass163_4740, Class199_Sub3.aClass1_9887, (byte)-110);
            Class170 var4 = Class170.method2146(Class577.aClass466_7744, Class331.aClass613_3498.anInt8052 * -721675347, 0);
            long var5 = Class255.time((byte)24);
            Class554.aClass174_7475.method2278();
            client.aClass445_11024.method5229(0.0F, 256.0F, 0.0F);
            Class554.aClass174_7475.method2326(client.aClass445_11024);
            Class433 var7 = Class554.aClass174_7475.method2318();
            var7.method5096((float)(var3.width / 2), (float)(var3.height / 2), 512.0F, 512.0F, (float)client.aClass505_11204.method6107(855180657), (float)client.aClass505_11204.method6061((byte)-22), (float)var3.width, (float)var3.height);
            Class554.aClass174_7475.method2231(var7);
            Class554.aClass174_7475.method2331(1.0F);
            Class554.aClass174_7475.method2364(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            Class168 var8 = Class554.aClass174_7475.method2321(var4, 2048, 64, 64, 768);
            int var9 = 0;

            label42:
            for(int var10 = 0; var10 < 500; ++var10) {
               Class554.aClass174_7475.method2283(3, 0);

               for(int var11 = 15; var11 >= 0; --var11) {
                  for(int var12 = 0; var12 <= var11; ++var12) {
                     client.aClass445_11007.method5229((float)((int)(512.0F * ((float)var12 - (float)var11 / 2.0F))), 0.0F, (float)((1 + var11) * 512));
                     var8.method1974(client.aClass445_11007, (Class164)null, 0);
                     ++var9;
                     if(Class255.time((byte)24) - var5 >= (long)var1) {
                        break label42;
                     }
                  }
               }
            }

            Class554.aClass174_7475.method2327();
            long var13 = (long)(var9 * 1000) / (Class255.time((byte)24) - var5);
            Class554.aClass174_7475.method2283(3, 0);
            return (int)var13;
         } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
         }
      }
   }
}
