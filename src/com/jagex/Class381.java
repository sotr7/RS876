package com.jagex;

import com.jagex.Class102;
import com.jagex.Class11;
import com.jagex.InterfaceDef;
import com.jagex.Class286;
import com.jagex.Class294;
import com.jagex.NPCDef;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class394;
import com.jagex.Class448_Sub1;
import com.jagex.Class526_Sub31;
import com.jagex.Class681;
import com.jagex.Class694;
import com.jagex.Class76;
import com.jagex.Interface45;

public class Class381 implements Interface45 {
   static String aString3943;
   public int anInt3942;
   public Class384 aClass384_3939;
   public Class389 aClass389_3940;
   public int anInt3941;
   public int anInt3938;

   public Class394 method346(int var1) {
      return Class394.aClass394_4103;
   }

   public Class394 method345() {
      return Class394.aClass394_4103;
   }

   Class381(int var1, Class384 var2, Class389 var3, int var4, int var5) {
      this.anInt3942 = -1183398907 * var1;
      this.aClass384_3939 = var2;
      this.aClass389_3940 = var3;
      this.anInt3941 = 182865053 * var4;
      this.anInt3938 = var5 * -646801681;
   }

   static final void method4708(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -2085253024)).anInt99 * 519408489;
   }

   static final void method4709(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
   }

   static final void method4710(InterfaceDef var0, Class681 var1, int var2) {
      int var3 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285] - 1;
      if(619744185 * var0.modelType != 6) {
         throw new RuntimeException("");
      } else {
         NPCDef var5 = (NPCDef)Class76.loader.method89(var0.anInt2539 * 561507777, -786421179);
         if(var0.aClass294_2677 == null) {
            var0.aClass294_2677 = new Class294(var5, true);
         }

         var0.aClass294_2677.aLong3183 = Class102.method1290(908498662) * 4070890070923293839L;
         if(var4 >= 0 && var4 < var5.models.length) {
            var0.aClass294_2677.anIntArray3185[var4] = var3;
            Class526_Sub31.method9555(var0, (byte)10);
         } else {
            throw new RuntimeException("" + var4);
         }
      }
   }

   static final void method4711(Class681 var0, short var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class694.method8116(var2, var3, -972737897)?1:0;
   }

   static Class286[] method4712(byte var0) {
      return new Class286[]{Class286.aClass286_3100, Class286.aClass286_3098, Class286.aClass286_3096};
   }
}
