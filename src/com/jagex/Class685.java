package com.jagex;

import com.jagex.Class291;
import com.jagex.Class309;
import com.jagex.Class32;
import com.jagex.Class375;
import com.jagex.Class520;
import com.jagex.Class570;
import com.jagex.Class64;
import com.jagex.Exception_Sub7;
import com.jagex.twitchtv.TwitchTV;

public final class Class685 {
   Class685() throws Throwable {
      throw new Error();
   }

   public static void method8048(byte var0) {
      if(null != Class309.aClass290_3377) {
         Class309.aClass290_3377.method3824(520964823);
      }

      if(null != Class291.aThread3134) {
         while(true) {
            try {
               Class291.aThread3134.join();
               break;
            } catch (InterruptedException var2) {
               ;
            }
         }
      }

   }

   static int method8049(int var0) {
      int var1;
      try {
         for(var1 = 0; var1 < Class570.aStringArray7650.length; ++var1) {
            if(null != Class570.aStringArray7650[var1] && Class570.aBoolArray7623[var1]) {
               Class520.method6248(242698352).method403(Class570.aStringArray7650[var1], (byte)0);
            }
         }
      } catch (Exception_Sub7 var2) {
         return 3;
      }

      Class570.aTwitchTV7639 = new TwitchTV();
      var1 = Class570.aTwitchTV7639.InitialiseTTV(Class32.method802((short)15152));
      if(0 == var1) {
         Class570.aBool7638 = true;
      } else {
         Class375.method4671(10 + Class64.aString738 + var1, new RuntimeException(), (byte)123);
      }

      return 2;
   }
}
