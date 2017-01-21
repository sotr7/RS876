package com.jagex;

import com.jagex.Class223;
import com.jagex.Class230;
import com.jagex.Class232;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class504;
import com.jagex.Class522;
import com.jagex.RSByteBuffer;
import com.jagex.Class566;
import com.jagex.Class594;
import com.jagex.Class678;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class93;
import com.jagex.Interface26;
import com.jagex.client;

public class Class214 implements Interface26 {
   // $FF: synthetic field
   Class232 this$0;
   int anInt2268;
   boolean aBool2267;

   public void method168(Class223 var1, byte var2) {
      var1.method3119(-1368082029 * this.anInt2268, this.aBool2267, -2006436914);
      var1.method3122(this.anInt2268 * -1368082029, (byte)13).method3002((byte)60);
   }

   public void method165(Class223 var1) {
      var1.method3119(-1368082029 * this.anInt2268, this.aBool2267, -1889086029);
      var1.method3122(this.anInt2268 * -1368082029, (byte)83).method3002((byte)68);
   }

   Class214(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      this.anInt2268 = var2.readUnsignedShort(1368245659) * 1549028507;
      this.aBool2267 = var2.readUnsignedByte(1327933242) == 1;
   }

   public void method167(Class223 var1) {
      var1.method3119(-1368082029 * this.anInt2268, this.aBool2267, -2014529111);
      var1.method3122(this.anInt2268 * -1368082029, (byte)109).method3002((byte)58);
   }

   public void method166(Class223 var1) {
      var1.method3119(-1368082029 * this.anInt2268, this.aBool2267, -1954337562);
      var1.method3122(this.anInt2268 * -1368082029, (byte)61).method3002((byte)7);
   }

   public void method169(Class223 var1) {
      var1.method3119(-1368082029 * this.anInt2268, this.aBool2267, -2121662676);
      var1.method3122(this.anInt2268 * -1368082029, (byte)118).method3002((byte)35);
   }

   public static void method2953(boolean var0, byte var1) {
   }

   static final void method2954(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class504.method6047(var3, var4, var0, 1712117322);
   }

   static final void method2955(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3122(var2, (byte)23).method3027(-377167278)?1:0;
   }

   static final void method2956(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub43_10628, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-31046);
      Class522.method6257(-1042127423);
      client.aBool11104 = true;
   }

   static String method2957(int var0, int var1, boolean var2, byte var3) {
      if(var1 >= 2 && var1 <= 36) {
         if(var2 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / var1; var5 != 0; ++var4) {
               var5 /= var1;
            }

            char[] var6 = new char[var4];
            var6[0] = 43;

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var0;
               var0 /= var1;
               int var9 = var8 - var0 * var1;
               if(var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(48 + var9);
               }
            }

            return new String(var6);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static String method2958(byte[] var0, int var1, int var2, int var3) {
      StringBuilder var4 = new StringBuilder();

      for(int var5 = var1; var5 < var2 + var1; var5 += 3) {
         int var6 = var0[var5] & 255;
         var4.append(Class678.aCharArray8595[var6 >>> 2]);
         if(var5 < var2 - 1) {
            int var7 = var0[var5 + 1] & 255;
            var4.append(Class678.aCharArray8595[(var6 & 3) << 4 | var7 >>> 4]);
            if(var5 < var2 - 2) {
               int var8 = var0[var5 + 2] & 255;
               var4.append(Class678.aCharArray8595[(var7 & 15) << 2 | var8 >>> 6]).append(Class678.aCharArray8595[var8 & 63]);
            } else {
               var4.append(Class678.aCharArray8595[(var7 & 15) << 2]).append('\u003d');
            }
         } else {
            var4.append(Class678.aCharArray8595[(var6 & 3) << 4]).append('\u003d').append('\u003d');
         }
      }

      return var4.toString();
   }

   static final void method2959(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub16_10634, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1?2:0, (short)-28551);
      client.aClass505_11204.method6078(-2012359654);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static final void method2960(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      int var4 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285];
      if(305104009 * InterfaceDef.anInt2629 == var4 || InterfaceDef.anInt2469 * 1479590611 == var4 || InterfaceDef.anInt2547 * -1092992397 == var4 || var4 == -1448563083 * InterfaceDef.anInt2508) {
         var0.anInt2601 = var4 * -1243758593;
      }
   }

   static byte method2961(int var0, int var1, byte var2) {
      return (byte)(var0 != -1226971375 * Class594.aClass594_7844.anInt7833?0:((var1 & 1) == 0?1:2));
   }

   public static String method2962(long var0, int var2, int var3) {
      Class258.method3514(var0);
      int var4 = Class93.aCalendar899.get(11);
      int var5 = Class93.aCalendar899.get(12);
      int var6 = Class93.aCalendar899.get(13);
      return Integer.toString(var4 / 10) + var4 % 10 + ":" + var5 / 10 + var5 % 10 + ":" + var6 / 10 + var6 % 10;
   }
}
