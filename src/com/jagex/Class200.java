package com.jagex;

import com.jagex.Class100;
import com.jagex.Class2;
import com.jagex.Class207;
import com.jagex.Class22;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class29;
import com.jagex.Class299;
import com.jagex.Class315_Sub1;
import com.jagex.Class424;
import com.jagex.Class481;
import com.jagex.RSByteBuffer;
import com.jagex.Class539_Sub3;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class64;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.Class97_Sub1;

public class Class200 {
   static final int anInt2202 = 0;
   static final int anInt2203 = 2;
   public static short[][] aShortArrayArray2206;
   int[] anIntArray2204;
   int[] anIntArray2205;

   Class200(RSByteBuffer var1) {
      int var2 = var1.readSmart(-1252257290);
      this.anIntArray2204 = new int[var2];
      this.anIntArray2205 = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1.readUnsignedByte(1525380440);
         this.anIntArray2204[var3] = var4;
         int var5 = var1.readUnsignedShort(799301060);
         int var6 = var1.readUnsignedShort(1033429848);
         this.anIntArray2205[var3] = (var5 << 16) + var6;
      }

   }

   void method2867(Class207 var1, int var2, int var3) {
      int var4 = this.anIntArray2205[0];
      var1.method2919(var2, var4 >>> 16, var4 & '\uffff', (byte)122);
      Class639_Sub1_Sub2_Sub1 var5 = var1.method2913((byte)101);
      var5.anInt11943 = 0;

      for(int var6 = this.anIntArray2204.length - 1; var6 >= 0; --var6) {
         int var7 = this.anIntArray2204[var6];
         int var8 = this.anIntArray2205[var6];
         var5.screenX[var5.anInt11943 * -577323399] = var8 >> 16;
         var5.screenY[var5.anInt11943 * -577323399] = var8 & '\uffff';
         byte var9 = MovementDirection.WALKING.id;
         if(0 == var7) {
            var9 = MovementDirection.TELEPORTING.id;
         } else if(2 == var7) {
            var9 = MovementDirection.RUNNING.id;
         }

         var5.aByteArray11946[-577323399 * var5.anInt11943] = var9;
         var5.anInt11943 += -808498231;
      }

   }

   public static void method2868(short var0) {
      Class315_Sub1.aClass243Array10033 = new Class243[Class64.aClass466_744.method5573(-2020448683)];
      Class100.aBoolArray1206 = new boolean[Class64.aClass466_744.method5573(-2017485367)];
   }

   static final void method2869(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.aStringArray2579 = null;
   }

   static final void method2870(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class29.method733(var3, var4, var0, -1958150464);
   }

   static final void method2871(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class299.method3989(var3, var4, var0, 716546968);
   }

   public static byte[] method2872(byte[] var0, int var1, int var2, int var3) {
      byte[] var4;
      if(var1 > 0) {
         var4 = new byte[var2];

         for(int var5 = 0; var5 < var2; ++var5) {
            var4[var5] = var0[var5 + var1];
         }
      } else {
         var4 = var0;
      }

      Class22 var7 = new Class22();
      var7.method669((byte)120);
      var7.method670(var4, (long)(8 * var2));
      byte[] var6 = new byte[64];
      var7.method667(var6, 0, (byte)70);
      return var6;
   }

   static Class2 method2873(RSByteBuffer var0, Class97_Sub1 var1, int var2) {
      Class2 var3 = new Class2(var1);

      while(true) {
         int var4 = var0.readUnsignedByte(-1077692226);
         if(255 == var4) {
            return var3;
         }

         Class481 var5 = (Class481)Class247.method3397(Class481.class, var4, -1658698442);

         while(true) {
            int var6 = var0.readUnsignedByte(-1535438978);
            if(255 == var6) {
               break;
            }

            var0.pos -= 801976415;
            Class424 var7 = var1.method8372(var0, var5, (byte)0);
            if(null != var7) {
               var3.method27(1602756037 * var7.anInt4793, var7.anObject4794, 172204199);
            }
         }
      }
   }

   static void method2874(Class539_Sub3 var0, byte var1) {
      var0.aClass639_Sub1_Sub2_Sub1_10336 = null;
      if(1335013439 * Class539_Sub3.anInt10335 < 20) {
         Class539_Sub3.aClass686_10338.method8058(var0, (byte)-89);
         Class539_Sub3.anInt10335 += 739327935;
      }

   }
}
