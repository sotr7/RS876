package com.jagex;

import com.jagex.Class115;
import com.jagex.Class149;
import com.jagex.Class218;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class285;
import com.jagex.OutFrame;
import com.jagex.Class488;
import com.jagex.Class526_Sub21_Sub8;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class60;
import com.jagex.Class615;
import com.jagex.Class639_Sub1_Sub2_Sub6;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Class94;
import com.jagex.Interface27;
import com.jagex.client;
import java.awt.Frame;
import java.util.Iterator;

public class Class242 implements Interface27 {
   protected static Frame aFrame2454;
   static int anInt2455;
   public static Class94 aClass94_2456;
   // $FF: synthetic field
   Class232 this$0;
   Class218 aClass218_2453;

   public void method169(Class223 var1) {
      var1.method3113(this.aClass218_2453, -1329741137);
   }

   public void method168(Class223 var1, byte var2) {
      var1.method3113(this.aClass218_2453, -1329741137);
   }

   public void method167(Class223 var1) {
      var1.method3113(this.aClass218_2453, -1329741137);
   }

   public void method165(Class223 var1) {
      var1.method3113(this.aClass218_2453, -1329741137);
   }

   Class242(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      boolean var3 = var2.readUnsignedByte(1481435969) != 255;
      if(var3) {
         var2.pos -= 801976415;
      }

      this.aClass218_2453 = new Class218(var2, var3, true, var1.anInterface28_2365);
   }

   public void method166(Class223 var1) {
      var1.method3113(this.aClass218_2453, -1329741137);
   }

   static final void method3323(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2605 = Class615.method7280(var4, var2, -1267779275);
      var0.aBool2560 = true;
   }

   static final void method3324(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class488.method5862(var3, var0, -1676546015);
   }

   static void method3325(Class681 var0, int var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1], -1667789795)).method3793(aClass94_2456, -1735632767)?1:0;
   }

   static final void method3326(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= -1578695711;
      int var4 = var2.anIntArray8622[-1730576285 * var2.anInt8623];
      short var5 = (short)var2.anIntArray8622[-1730576285 * var2.anInt8623 + 1];
      short var6 = (short)var2.anIntArray8622[2 + var2.anInt8623 * -1730576285];
      if(var4 >= 0 && var4 < 5) {
         var0.method3375(var4, var5, var6, (short)255);
         Class526_Sub31.method9555(var0, (byte)10);
         if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
            Class60.method1040(var0.uid * 919258769, var4, 824368108);
         }

      }
   }

   static final void method3327(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2545 * 487185371;
   }

   static final void method3328(byte var0) {
      Iterator var1 = client.aClass20_11160.iterator();

      while(var1.hasNext()) {
         Class526_Sub21_Sub8 var2 = (Class526_Sub21_Sub8)var1.next();
         Class639_Sub1_Sub2_Sub6 var3 = var2.aClass639_Sub1_Sub2_Sub6_11665;
         var3.method10947(1, -2072244326);
         if(var3.method10948((byte)114)) {
            var2.method6332(-1949449864);
            var3.method10952(-1938230138);
         }
      }

   }

   public static void method3329(int var0, int var1, byte var2) {
      OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4276, client.aClass111_11060.aClass14_1342, 622771156);
      var3.out.writeLEShort128(var1, 909510808);
      var3.out.writeIntLE(var0, (byte)39);
      client.aClass111_11060.write(var3, (byte)-45);
   }
}
