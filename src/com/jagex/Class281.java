package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class260;
import com.jagex.Class283;
import com.jagex.Class306;
import com.jagex.Class315_Sub1;
import com.jagex.Class498;
import com.jagex.Class622;
import com.jagex.Class652;
import com.jagex.Class675;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class704;
import com.jagex.Class73;

public class Class281 {
   static boolean aBool3047;
   int anInt3042 = 1545358259;
   Class260 aClass260_3045;
   Class260 aClass260_3043;
   String aString3041;
   String aString3044;
   public int[] anIntArray3040;
   public int[] anIntArray3046;

   void method3706(Class283 var1, int var2) {
      int var3 = var1.method3714((byte)121);
      this.aClass260_3045 = Class704.method8268((short)18815)[var3];
      int var4;
      if(this.aClass260_3045 == Class260.aClass260_2839) {
         var4 = var1.method3714((byte)103);
         this.aClass260_3043 = Class704.method8268((short)21302)[var4];
         this.anInt3042 = var1.method3714((byte)32) * -1545358259;
      }

      this.aString3041 = var1.method3715(-1613649139);
      this.aString3044 = var1.method3715(-1632019628);
      var4 = var1.method3714((byte)103);
      this.anIntArray3040 = new int[var4];
      this.anIntArray3046 = new int[var4];

      for(int var5 = 0; var5 < var4; ++var5) {
         this.anIntArray3040[var5] = var1.method3714((byte)17);
         this.anIntArray3046[var5] = var1.method3714((byte)96);
      }

   }

   void method3707(Class283 var1) {
      int var2 = var1.method3714((byte)8);
      this.aClass260_3045 = Class704.method8268((short)26853)[var2];
      int var3;
      if(this.aClass260_3045 == Class260.aClass260_2839) {
         var3 = var1.method3714((byte)70);
         this.aClass260_3043 = Class704.method8268((short)23085)[var3];
         this.anInt3042 = var1.method3714((byte)117) * -1545358259;
      }

      this.aString3041 = var1.method3715(-2005047182);
      this.aString3044 = var1.method3715(-1813005548);
      var3 = var1.method3714((byte)34);
      this.anIntArray3040 = new int[var3];
      this.anIntArray3046 = new int[var3];

      for(int var4 = 0; var4 < var3; ++var4) {
         this.anIntArray3040[var4] = var1.method3714((byte)95);
         this.anIntArray3046[var4] = var1.method3714((byte)81);
      }

   }

   static final void method3708(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)15);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class306.method4038(var3, var4, var0, -1620674785);
   }

   static final void method3709(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class306.method4038(var3, var4, var0, -417332483);
   }

   static final void method3710(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      if(-1 == var3) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class622.aClass455_8143.method5398(var2, (byte)77).method10729((char)var3, 1772071050);
      }

   }

   static final void method3711(Class681 var0, int var1) {
      Class652.method7782(var0, var0.aClass639_Sub1_Sub2_Sub1_8635, (byte)32);
   }

   public static void method3712(InterfaceDef[] var0, int var1, int var2, int var3, boolean var4, int var5) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         InterfaceDef var7 = var0[var6];
         if(null != var7 && -537841755 * var7.parentId == var1) {
            Class498.method5944(var7, var2, var3, var4, (byte)53);
            Class675.method8009(var7, var2, var3, 540934629);
            if(var7.anInt2520 * 480812513 > -1379784909 * var7.anInt2522 - -99858407 * var7.anInt2510) {
               var7.anInt2520 = var7.anInt2522 * -411476077 - 2009809209 * var7.anInt2510;
            }

            if(var7.anInt2520 * 480812513 < 0) {
               var7.anInt2520 = 0;
            }

            if(-1580669593 * var7.anInt2626 > var7.anInt2523 * 1525210059 - -667181623 * var7.anInt2576) {
               var7.anInt2626 = var7.anInt2523 * -1128492035 - var7.anInt2576 * -591547057;
            }

            if(var7.anInt2626 * -1580669593 < 0) {
               var7.anInt2626 = 0;
            }

            if(0 == var7.type * -449120703) {
               Class73.method1110(var0, var7, var4, -784430999);
            }
         }
      }

   }
}
