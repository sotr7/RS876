package com.jagex;

import com.jagex.Class199_Sub14;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class357;
import com.jagex.Class361;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class474;
import com.jagex.RSByteBuffer;
import com.jagex.Class533;
import com.jagex.Class612_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import java.util.HashMap;

public class Class648 {
   static RSByteBuffer aClass526_Sub36_8457;
   public HashMap aHashMap8455;
   Class357 aClass357_8456;

   void method7703(int var1) {
      this.aHashMap8455 = new HashMap();
      this.aHashMap8455.put(Class474.aClass474_5365, Integer.valueOf(50));
   }

   void method7704() {
      this.aHashMap8455 = new HashMap();
      this.aHashMap8455.put(Class474.aClass474_5365, Integer.valueOf(50));
   }

   public Class648(Class357 var1) {
      this.method7703(1552810690);
      this.aClass357_8456 = var1;
   }

   void method7705() {
      this.aHashMap8455 = new HashMap();
      this.aHashMap8455.put(Class474.aClass474_5365, Integer.valueOf(50));
   }

   void method7706() {
      this.aHashMap8455 = new HashMap();
      this.aHashMap8455.put(Class474.aClass474_5365, Integer.valueOf(50));
   }

   static final void method7707(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)59);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class199_Sub14.method9017(var3, var4, var0, (byte)107);
   }

   static final void method7708(Class681 var0, int var1) {
   }

   public static int method7709(Class440 var0, byte var1) {
      Class446 var2 = Class446.method5309(0.0F, 0.0F, 1.0F);
      var2.method5286(var0);
      double var3 = 1.5707963267948966D - Math.acos((double)var2.aFloat4915);
      var2.method5278();
      if(var3 < 0.0D) {
         var3 = 3.141592653589793D + 3.141592653589793D + var3;
      }

      return (int)(16384.0D * (var3 / 6.283185307179586D)) & 16383;
   }

   static final void method7710(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class533.method6396(var3, var0, (byte)-106);
   }

   static final void method7711(Class681 var0, int var1) {
      Class612_Sub1 var2 = Class361.method4621(-1159782499);
      if(null != var2) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1896291335 * var2.anInt10815;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -2015558303 * var2.anInt8023;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.aString10816;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.method9794(355636156);
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.method9795(-101484739);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anInt8027 * 285278699;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -2134698331 * var2.anInt10814;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.aString10813;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }
}
