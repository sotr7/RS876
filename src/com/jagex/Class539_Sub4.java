package com.jagex;

import com.jagex.Class199_Sub18;
import com.jagex.Class255;
import com.jagex.Class438;
import com.jagex.Class526_Sub2;
import com.jagex.Class531_Sub1;
import com.jagex.Class539;
import com.jagex.Class640;
import com.jagex.client;

public class Class539_Sub4 extends Class539 {
   int anInt10342 = (int)(Class255.time((byte)24) / 1000L) * -353768827;
   String aString10341;
   short aShort10343;

   Class539_Sub4(String var1, int var2) {
      this.aString10341 = var1;
      this.aShort10343 = (short)var2;
   }

   public static int method9293(int var0, int var1, boolean var2, short var3) {
      Class526_Sub2 var4 = Class531_Sub1.method9301(var0, var2, 2029444977);
      return var4 == null?0:(var1 >= 0 && var1 < var4.anIntArray10329.length?var4.anIntArray10329[var1]:0);
   }

   public static final void method9294(int var0) {
      String var1 = null != Class640.aString8347?Class640.aString8347:Class199_Sub18.method9027(1502622018);
      Class438.openJSURL(var1, false, client.aBool10997, 1164199360);
   }
}
