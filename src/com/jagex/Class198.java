package com.jagex;

import com.jagex.Class100;
import com.jagex.Class230;
import com.jagex.Class231;
import com.jagex.InterfaceDef;
import com.jagex.Class482;
import com.jagex.Class570;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface25;
import com.jagex.Interface70;
import com.jagex.twitchtv.TwitchWebcamDevice;
import java.util.Iterator;

class Class198 implements Interface25 {
   // $FF: synthetic field
   Class231 this$0;

   public void method163(Object var1) {
      this.method2844((Interface70)var1, 1067626557);
   }

   void method2844(Interface70 var1, int var2) {
      Iterator var3 = this.this$0.method3212(-1957887669).iterator();

      while(var3.hasNext()) {
         Class482 var4 = (Class482)var3.next();
         if(var4.method5820(-2024152902) == var1) {
            var4.method5807((byte)65);
            var3.remove();
         }
      }

   }

   public void method164(Object var1, int var2) {
      this.method2844((Interface70)var1, -1460505682);
   }

   void method2845(Interface70 var1) {
      Iterator var2 = this.this$0.method3212(-1957887669).iterator();

      while(var2.hasNext()) {
         Class482 var3 = (Class482)var2.next();
         if(var3.method5820(-2024152902) == var1) {
            var3.method5807((byte)110);
            var2.remove();
         }
      }

   }

   Class198(Class231 var1) {
      this.this$0 = var1;
   }

   void method2846(Interface70 var1) {
      Iterator var2 = this.this$0.method3212(-1957887669).iterator();

      while(var2.hasNext()) {
         Class482 var3 = (Class482)var2.next();
         if(var3.method5820(-2024152902) == var1) {
            var3.method5807((byte)26);
            var2.remove();
         }
      }

   }

   public static TwitchWebcamDevice method2847(int var0, int var1) {
      if(null == Class570.aTwitchWebcamDeviceArray7653) {
         return null;
      } else {
         for(int var2 = 0; var2 < Class570.aTwitchWebcamDeviceArray7653.length; ++var2) {
            if(-355702023 * Class570.aTwitchWebcamDeviceArray7653[var2].anInt1137 == var0) {
               return Class570.aTwitchWebcamDeviceArray7653[var2];
            }
         }

         return null;
      }
   }

   static final void method2848(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.parentId * -537841755;
   }

   static final void method2849(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub7_10637.method9899((byte)79);
   }

   static final void method2850(Class681 var0, int var1) {
      Class100.method1284(-174970343);
   }
}
