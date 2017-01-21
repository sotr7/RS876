package com.jagex;

import com.jagex.Class229;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class31;
import com.jagex.Class322;
import com.jagex.Class40_Sub5;
import com.jagex.Class439;
import com.jagex.Class449;
import com.jagex.Class555;
import com.jagex.Class632;
import com.jagex.Class669;
import com.jagex.Class681;
import com.jagex.Interface76;
import com.jagex.client;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Class684 implements Interface76 {
   public static Class40_Sub5 aClass40_Sub5_8673;
   Set aSet8660 = new HashSet();
   int anInt8671;
   public static Class684 aClass684_8665;
   public static Class684 aClass684_8659;
   public static Class684 aClass684_8668;
   public static Class684 aClass684_8661;
   public static Class684 aClass684_8662;
   public static Class684 aClass684_8663;
   static Class684 aClass684_8664;
   static Class684 aClass684_8669;
   static Class684 aClass684_8666;
   public static Class684 aClass684_8667;
   static Class684 aClass684_8670;
   static Class684 aClass684_8672;
   static Class684 aClass684_8658;

   Class684(String var1, int var2, Class669[] var3) {
      this.anInt8671 = var2 * 1360891417;
      Class669[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         Class669 var6 = var4[var5];
         this.aSet8660.add(var6);
      }

   }

   public static Class684[] method8039(int var0) {
      return new Class684[]{aClass684_8667, aClass684_8668, aClass684_8665, aClass684_8663, aClass684_8670, aClass684_8669, aClass684_8666, aClass684_8662, aClass684_8658, aClass684_8659, aClass684_8664, aClass684_8672, aClass684_8661};
   }

   static void method8040(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.method3181(-379563881);
   }

   public int getId() {
      return -325980631 * this.anInt8671;
   }

   public boolean method8041(Class669 var1, byte var2) {
      return this.aSet8660.contains(var1);
   }

   static {
      aClass684_8665 = new Class684("", 0, new Class669[]{Class669.aClass669_8533});
      aClass684_8659 = new Class684("", 1, new Class669[]{Class669.aClass669_8534, Class669.aClass669_8533});
      aClass684_8668 = new Class684("", 2, new Class669[]{Class669.aClass669_8534, Class669.aClass669_8535});
      aClass684_8661 = new Class684("", 3, new Class669[]{Class669.aClass669_8534});
      aClass684_8662 = new Class684("", 4);
      aClass684_8663 = new Class684("", 5, new Class669[]{Class669.aClass669_8534, Class669.aClass669_8533});
      aClass684_8664 = new Class684("", 6, new Class669[]{Class669.aClass669_8533});
      aClass684_8669 = new Class684("", 8, new Class669[]{Class669.aClass669_8534, Class669.aClass669_8533});
      aClass684_8666 = new Class684("", 9, new Class669[]{Class669.aClass669_8534, Class669.aClass669_8535});
      aClass684_8667 = new Class684("", 10, new Class669[]{Class669.aClass669_8534});
      aClass684_8670 = new Class684("", 11, new Class669[]{Class669.aClass669_8534});
      aClass684_8672 = new Class684("", 12, new Class669[]{Class669.aClass669_8534, Class669.aClass669_8533});
      aClass684_8658 = new Class684("", 13, new Class669[]{Class669.aClass669_8534});
      method8039(-2060972338);
   }

   public int method21() {
      return -325980631 * this.anInt8671;
   }

   Class684(String var1, int var2) {
      this.anInt8671 = 1360891417 * var2;
   }

   static void method8042(Class555 var0, int var1) {
      var0.aClass639_Sub1_7477 = null;
      Stack var2 = Class555.aStack7478;
      synchronized(var2) {
         if(Class555.aStack7478.size() < 200) {
            Class555.aStack7478.push(var0);
         }

      }
   }

   static final void method8043(InterfaceDef var0, Class681 var1, int var2) {
      byte var3 = 10;
      int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      Class632.method7490(var0, var3, var4, var1, 1264429708);
   }

   static final void method8044(byte var0) {
      client.anInt11072 = -238438937;
      client.anInt11073 = 404814493;
      Class322.aClass526_Sub36_3457 = null;
      Class449.method5339(-823029724);
   }

   static final void method8045(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class439.method5159(var2, var3 >> 14 & 16383, var3 & 16383, true, (byte)62);
   }

   static void method8046(InterfaceDef var0, int var1, int var2, short var3) {
      Class31.aClass245_281 = var0;
      Class31.anInt282 = var1 * 713453889;
      Class31.anInt283 = -1245503545 * var2;
   }

   static final void method8047(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)(Class229.method3177(var2, 786155340) / 60000L);
   }
}
