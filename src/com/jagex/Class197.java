package com.jagex;

import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class526_Sub21_Sub8;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub41;
import com.jagex.Class566;
import com.jagex.Class639_Sub1_Sub2_Sub6;
import com.jagex.Class681;
import com.jagex.client;
import java.util.Iterator;

public class Class197 {
   static Class197 aClass197_2194 = new Class197(4);
   static Class197 aClass197_2193 = new Class197(2);
   static Class197 aClass197_2197 = new Class197(5);
   static Class197 aClass197_2195 = new Class197(1);
   static Class197 aClass197_2196 = new Class197(3);
   static Class197 aClass197_2198 = new Class197(0);
   int anInt2192;

   int method2836(int var1) {
      return aClass197_2194 == this?-1:16777216 | this.anInt2192 * 1286792759;
   }

   int method2837() {
      return aClass197_2194 == this?-1:16777216 | this.anInt2192 * 1286792759;
   }

   Class197(int var1) {
      this.anInt2192 = var1 * -612388985;
   }

   int method2838() {
      return aClass197_2194 == this?-1:16777216 | this.anInt2192 * 1286792759;
   }

   static final void method2839(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3124((byte)0);
   }

   public static void method2840(Class526 var0, Class526 var1, short var2) {
      if(null != var0.aClass526_7158) {
         var0.method6332(-1949449864);
      }

      var0.aClass526_7158 = var1.aClass526_7158;
      var0.aClass526_7157 = var1;
      var0.aClass526_7158.aClass526_7157 = var0;
      var0.aClass526_7157.aClass526_7158 = var0;
   }

   static final void method2841(byte var0) {
      Iterator var1 = client.aClass20_11160.iterator();

      while(var1.hasNext()) {
         Class526_Sub21_Sub8 var2 = (Class526_Sub21_Sub8)var1.next();
         Class639_Sub1_Sub2_Sub6 var3 = var2.aClass639_Sub1_Sub2_Sub6_11665;
         if(client.aClass505_11204.method6072(330119789) != null && var3.method10953((byte)14)) {
            client.aClass505_11204.method6072(-1611915829).method6579(var3, true, 65536);
         }
      }

   }

   static final void method2842(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = null == Class566.aClass223_7610?0:1;
   }

   static Class526_Sub21_Sub17 method2843(RSByteBuffer var0, int var1, int var2) {
      Class526_Sub21_Sub17 var3 = new Class526_Sub21_Sub17(var1, var0.readString(105189872), var0.readString(-407480638), var0.readInt((byte)5), var0.readInt((byte)5), var0.readUnsignedByte(1989618859) == 1, var0.readUnsignedByte(29485823), var0.readUnsignedByte(-1990236471));
      int var4 = var0.readUnsignedByte(1344654041);

      for(int var5 = 0; var5 < var4; ++var5) {
         var3.aClass702_11839.method8176(new Class526_Sub41(var0.readUnsignedByte(-755597712), var0.readUnsignedShort(981171378), var0.readUnsignedShort(1384910198), var0.readUnsignedShort(1375004568), var0.readUnsignedShort(723674221), var0.readUnsignedShort(510585730), var0.readUnsignedShort(1002889201), var0.readUnsignedShort(1574015892), var0.readUnsignedShort(1724477354)), -2061173333);
      }

      var3.method10718((byte)87);
      return var3;
   }
}
