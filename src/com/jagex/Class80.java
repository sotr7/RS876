package com.jagex;

import com.jagex.Class163;
import com.jagex.Class192;
import com.jagex.Class446;
import com.jagex.Class466;
import com.jagex.LinkableObject;
import com.jagex.Class596;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Interface7;
import com.jagex.client;

public abstract class Class80 implements Interface7 {
   static Class163 aClass163_824;
   public static Class466 aClass466_825;
   Class192 aClass192_822;
   Class466 aClass466_823;

   void method1149(int var1) {
      Class192 var2 = this.aClass192_822;
      synchronized(var2) {
         this.aClass192_822.method2770(50151379);
      }
   }

   void method1150(int var1, byte var2) {
      this.aClass192_822 = new Class192(var1);
   }

   Class80(Class466 var1, int var2) {
      this.aClass466_823 = var1;
      this.aClass192_822 = new Class192(var2);
   }

   void method1151(int var1, short var2) {
      Class192 var3 = this.aClass192_822;
      synchronized(var3) {
         this.aClass192_822.method2769(var1, (byte)-104);
      }
   }

   void method1152(byte var1) {
      Class192 var2 = this.aClass192_822;
      synchronized(var2) {
         this.aClass192_822.method2772(-116334663);
      }
   }

   void method1153(int var1) {
      this.aClass192_822 = new Class192(var1);
   }

   void method1154(int var1) {
      this.aClass192_822 = new Class192(var1);
   }

   void method1155(int var1) {
      Class192 var2 = this.aClass192_822;
      synchronized(var2) {
         this.aClass192_822.method2769(var1, (byte)-51);
      }
   }

   void method1156() {
      Class192 var1 = this.aClass192_822;
      synchronized(var1) {
         this.aClass192_822.method2772(-426982661);
      }
   }

   void method1157() {
      Class192 var1 = this.aClass192_822;
      synchronized(var1) {
         this.aClass192_822.method2772(1126367817);
      }
   }

   void method1158() {
      Class192 var1 = this.aClass192_822;
      synchronized(var1) {
         this.aClass192_822.method2772(1965653867);
      }
   }

   static final void method1159(Class639_Sub1_Sub2_Sub1 var0, byte var1) {
      if(var0.anIntArray11939 != null || var0.anIntArray11898 != null) {
         boolean var2 = true;
         Class596 var3 = client.aClass505_11204.method6128(2090494214);

         for(int var4 = 0; var4 < var0.anIntArray11939.length; ++var4) {
            int var5 = -1;
            if(var0.anIntArray11939 != null) {
               var5 = var0.anIntArray11939[var4];
            }

            if(-1 == var5) {
               if(!var0.method10775(var4, -1, 2117495103)) {
                  var2 = false;
               }
            } else {
               var2 = false;
               boolean var6 = false;
               boolean var7 = false;
               Class446 var8 = var0.method7635().aClass446_4816;
               int var9;
               int var12;
               int var13;
               if(-1073741824 == (var5 & -1073741824)) {
                  var9 = var5 & 268435455;
                  int var10 = var9 >> 14;
                  int var11 = var9 & 16383;
                  var12 = (int)var8.aFloat4917 - (256 + 512 * (var10 - -814686591 * var3.localX));
                  var13 = (int)var8.aFloat4919 - (256 + (var11 - -845789331 * var3.localY) * 512);
               } else {
                  Class446 var17;
                  if(0 != (var5 & '\u8000')) {
                     var9 = var5 & 32767;
                     Class639_Sub1_Sub2_Sub1_Sub1 var15 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var9];
                     if(null == var15) {
                        var0.method10775(var4, -1, 2117495103);
                        continue;
                     }

                     var17 = var15.method7635().aClass446_4816;
                     var12 = (int)var8.aFloat4917 - (int)var17.aFloat4917;
                     var13 = (int)var8.aFloat4919 - (int)var17.aFloat4919;
                  } else {
                     LinkableObject var14 = (LinkableObject)client.npcs.get((long)var5);
                     if(var14 == null) {
                        var0.method10775(var4, -1, 2117495103);
                        continue;
                     }

                     NPC var16 = (NPC)var14.anObject10399;
                     var17 = var16.method7635().aClass446_4816;
                     var12 = (int)var8.aFloat4917 - (int)var17.aFloat4917;
                     var13 = (int)var8.aFloat4919 - (int)var17.aFloat4919;
                  }
               }

               if(0 != var12 || var13 != 0) {
                  var0.method10775(var4, (int)(Math.atan2((double)var12, (double)var13) * 2607.5945876176133D) & 16383, 2117495103);
               }
            }
         }

         if(var2) {
            var0.anIntArray11939 = null;
            var0.anIntArray11898 = null;
         }

      }
   }
}
