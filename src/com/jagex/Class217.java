package com.jagex;

import com.jagex.Class100;
import com.jagex.Class103;
import com.jagex.Class167;
import com.jagex.Class174;
import com.jagex.Class184_Sub1;
import com.jagex.Class195;
import com.jagex.Class21;
import com.jagex.Class23;
import com.jagex.Class230;
import com.jagex.Class231;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class313_Sub1;
import com.jagex.Class315_Sub1;
import com.jagex.Class466;
import com.jagex.Class499;
import com.jagex.Buffer;
import com.jagex.Class561;
import com.jagex.Class596;
import com.jagex.Class614;
import com.jagex.Class619;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class64;
import com.jagex.Class661;
import com.jagex.Class666;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.Class70;
import com.jagex.Exception_Sub2;
import com.jagex.Interface40;
import com.jagex.client;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

class Class217 implements Interface40 {
   // $FF: synthetic field
   Class231 this$0;

   public float method332(int var1) {
      return (float)Class230.preferences.aClass711_Sub29_10631.method10105((byte)110) / 255.0F;
   }

   Class217(Class231 var1) {
      this.this$0 = var1;
   }

   public float method331() {
      return (float)Class230.preferences.aClass711_Sub29_10631.method10105((byte)76) / 255.0F;
   }

   public float method333() {
      return (float)Class230.preferences.aClass711_Sub29_10631.method10105((byte)108) / 255.0F;
   }

   public static void method2987(Class466 var0, Class466 var1, Class466 var2, Class466 var3, int var4) {
      Class64.aClass466_744 = var0;
      Class666.aClass466_8527 = var1;
      InterfaceDef.aClass466_2567 = var2;
      Class315_Sub1.aClass243Array10033 = new Class243[Class64.aClass466_744.method5573(-2078609059)];
      Class100.aBoolArray1206 = new boolean[Class64.aClass466_744.method5573(-2104119023)];
   }

   static void method2988(int var0) {
      try {
         File var1 = new File(Class661.aString8517, "random.dat");
         int var3;
         if(var1.exists()) {
            Class499.aClass23_5619 = new Class23(new Class21(var1, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var2 = 0; var2 < Class313_Sub1.aStringArray10013.length; ++var2) {
               for(var3 = 0; var3 < Class184_Sub1.aStringArray9201.length; ++var3) {
                  File var4 = new File(Class184_Sub1.aStringArray9201[var3] + Class313_Sub1.aStringArray10013[var2] + File.separatorChar + "random.dat");
                  if(var4.exists()) {
                     Class499.aClass23_5619 = new Class23(new Class21(var4, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if(Class499.aClass23_5619 == null) {
            RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
            var3 = var6.read();
            var6.seek(0L);
            var6.write(var3);
            var6.seek(0L);
            var6.close();
            Class499.aClass23_5619 = new Class23(new Class21(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
         ;
      }

   }

   static final void method2989(Class681 var0, byte var1) throws Exception_Sub2 {
      var0.anInt8623 -= 379191958;
      boolean var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285] == 1;
      boolean var3 = 1 == var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class195.aClass292_Sub1_2182.method3904(var2, var3, 1934131013);
   }

   static final void method2990(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub22_10615.method10054((byte)-17);
   }

   public static void method2991(Class174 var0, long var1) {
      Class619.anInt8115 = Class619.anInt8114 * -953683545;
      Class619.anInt8114 = 0;
      Class255.time((byte)24);
      Iterator var3 = Class619.aList8112.iterator();

      while(var3.hasNext()) {
         Class614 var4 = (Class614)var3.next();
         boolean var5 = var4.method7248(var0, var1);
         if(!var5) {
            var3.remove();
            Class619.aClass614Array8117[Class619.anInt8107 * 1316620805] = var4;
            Class619.anInt8107 = -1126354227 * (1316620805 * Class619.anInt8107 + 1 & Class167.anIntArray1896[Class619.anInt8121 * 1865223851]);
         }
      }

   }

   static boolean method2992(Buffer var0, int var1, int var2) {
      int var3 = var0.readBit(2, 673441488);
      int var4;
      int var5;
      int var9;
      int var10;
      int var11;
      int var12;
      if(0 == var3) {
         if(var0.readBit(1, 673441488) != 0) {
            method2992(var0, var1, 1788163620);
         }

         var4 = var0.readBit(6, 673441488);
         var5 = var0.readBit(6, 673441488);
         boolean var16 = var0.readBit(1, 673441488) == 1;
         if(var16) {
            Class103.anIntArray1269[(Class103.anInt1275 += 1044927781) * 187285165 - 1] = var1;
         }

         if(null != client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1]) {
            throw new RuntimeException();
         } else {
            Class70 var17 = Class103.aClass70Array1274[var1];
            Class639_Sub1_Sub2_Sub1_Sub1 var18 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1] = new Class639_Sub1_Sub2_Sub1_Sub1(client.aClass505_11204.method6072(-112109902));
            var18.index = var1 * 1016367843;
            if(null != Class103.aClass526_Sub36Array1268[var1]) {
               var18.decodeAppearance(Class103.aClass526_Sub36Array1268[var1], -1957887669);
            }

            if(null != Class103.aClass526_Sub36Array1264[var1]) {
               var18.method10966(Class103.aClass526_Sub36Array1264[var1], (byte)29);
            }

            var18.turn(var17.anInt785 * -1497357151, true, 218828038);
            var18.anInt11911 = var17.anInt786 * 1025896121;
            var9 = var17.anInt784 * -1586234375;
            var10 = var9 >> 28;
            var11 = var9 >> 14 & 255;
            var12 = var9 & 255;
            Class596 var13 = client.aClass505_11204.method6128(2107692724);
            int var14 = var4 + (var11 << 6) - -814686591 * var13.localX;
            int var15 = var5 + (var12 << 6) - -845789331 * var13.localY;
            var18.aClass215_12182 = var17.aClass215_787;
            var18.aBool12184 = var17.aBool788;
            var18.aByteArray11946[0] = Class103.aByteArray1267[var1];
            var18.aByte10827 = var18.aByte10828 = (byte)var10;
            if(client.aClass505_11204.method6094((byte)70).method5614(var14, var15, 26623153)) {
               ++var18.aByte10828;
            }

            var18.method10971(var14, var15, 1480624387);
            Class103.aClass70Array1274[var1] = null;
            return true;
         }
      } else if(var3 == 1) {
         var4 = var0.readBit(2, 673441488);
         var5 = -1586234375 * Class103.aClass70Array1274[var1].anInt784;
         Class103.aClass70Array1274[var1].anInt784 = 274978377 * ((var5 & 268435455) + ((var4 + (var5 >> 28) & 3) << 28));
         return false;
      } else {
         int var6;
         int var7;
         int var8;
         if(var3 == 2) {
            var4 = var0.readBit(5, 673441488);
            var5 = var4 >> 3 & 3;
            var6 = var4 & 7;
            var7 = Class103.aClass70Array1274[var1].anInt784 * -1586234375;
            if(Class103.$assertionsDisabled || Class103.aByteArray1267[var1] >= 0 && Class103.aByteArray1267[var1] <= 3) {
               var8 = var5 + (var7 >> 28) & 3;
               var9 = var7 >> 14 & 255;
               var10 = var7 & 255;
               if(var6 == 0) {
                  --var9;
                  --var10;
               }

               if(var6 == 1) {
                  --var10;
               }

               if(2 == var6) {
                  ++var9;
                  --var10;
               }

               if(var6 == 3) {
                  --var9;
               }

               if(var6 == 4) {
                  ++var9;
               }

               if(var6 == 5) {
                  --var9;
                  ++var10;
               }

               if(var6 == 6) {
                  ++var10;
               }

               if(7 == var6) {
                  ++var9;
                  ++var10;
               }

               Class561.findIdentifiable(MovementDirection.method8035(1103904047), Class103.aByteArray1267[var1], (byte)-74);
               Class103.aClass70Array1274[var1].anInt784 = 274978377 * ((var9 << 14) + (var8 << 28) + var10);
               return false;
            } else {
               throw new AssertionError();
            }
         } else {
            var4 = var0.readBit(20, 673441488);
            var5 = var4 >> 18 & 3;
            var6 = var4 >> 16 & 3;
            var7 = var4 >> 8 & 255;
            var8 = var4 & 255;
            var9 = -1586234375 * Class103.aClass70Array1274[var1].anInt784;
            Class103.aByteArray1267[var1] = (byte)(var5 - 1);
            if(Class103.$assertionsDisabled || Class103.aByteArray1267[var1] >= 0 && Class103.aByteArray1267[var1] <= 3) {
               var10 = var6 + (var9 >> 28) & 3;
               var11 = var7 + (var9 >> 14) & 255;
               var12 = var9 + var8 & 255;
               Class561.findIdentifiable(MovementDirection.method8035(629510269), var5 - 1, (byte)-63);
               Class103.aClass70Array1274[var1].anInt784 = ((var10 << 28) + (var11 << 14) + var12) * 274978377;
               return false;
            } else {
               throw new AssertionError();
            }
         }
      }
   }
}
