package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class394;
import com.jagex.Class456;
import com.jagex.Class526_Sub38;
import com.jagex.Class56;
import com.jagex.Class681;
import com.jagex.Class693;
import com.jagex.Class704_Sub1;
import com.jagex.Class88;
import com.jagex.Interface45;
import com.jagex.client;

public class Class390 implements Interface45 {
   public int anInt4067;

   Class390(int var1) {
      this.anInt4067 = 885998279 * var1;
   }

   public Class394 method345() {
      return Class394.aClass394_4098;
   }

   public Class394 method346(int var1) {
      return Class394.aClass394_4098;
   }

   static final void method4773(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-52);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class456.method5404(var3, var4, var0, 609716058);
   }

   public static int method4774(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }

   static final void method4775(InterfaceDef[] var0, int var1, int var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         InterfaceDef var4 = var0[var3];
         if(var4 != null && -537841755 * var4.parentId == var1 && !client.method10312(var4)) {
            if(var4.type * -449120703 == 0) {
               method4775(var0, 919258769 * var4.uid, -1842311517);
               if(var4.aClass245Array2530 != null) {
                  method4775(var4.aClass245Array2530, 919258769 * var4.uid, -237111290);
               }

               Class526_Sub38 var5 = (Class526_Sub38)client.aClass20_11187.get((long)(919258769 * var4.uid));
               if(var5 != null) {
                  Class88.method1189(-870147923 * var5.anInt10684, (byte)-1);
               }
            }

            if(6 == -449120703 * var4.type && 150614291 * var4.anInt2660 != -1) {
               if(null == var4.aClass704_2661) {
                  var4.aClass704_2661 = new Class704_Sub1();
                  var4.aClass704_2661.method8246(150614291 * var4.anInt2660, (byte)-27);
               }

               if(var4.aClass704_2661.method8247(client.anInt11225 * 101025109, (byte)51) && var4.aClass704_2661.method8249(1859480808)) {
                  var4.aClass704_2661.method8236(-1730576285);
               }
            }
         }
      }

   }

   public static Class693[] method4776(byte var0) {
      return new Class693[]{Class693.aClass693_8708, Class693.aClass693_8707, Class693.aClass693_8705, Class693.aClass693_8706, Class693.aClass693_8709, Class693.aClass693_8704, Class693.aClass693_8714, Class693.aClass693_8710, Class693.aClass693_8711, Class693.aClass693_8712};
   }

   static final void method4777(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      int var3 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class56.method997(var2, var3 == 1, (short)2916);
   }
}
