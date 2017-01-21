package com.jagex;

import com.jagex.Class10;
import com.jagex.Class195;
import com.jagex.Class210;
import com.jagex.Class220;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class277;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class322;
import com.jagex.Class327;
import com.jagex.Class397;
import com.jagex.Class439;
import com.jagex.Class476;
import com.jagex.Class487;
import com.jagex.Class513;
import com.jagex.Class517;
import com.jagex.Class526_Sub6;
import com.jagex.Class566;
import com.jagex.Class576;
import com.jagex.Class596;
import com.jagex.Class636;
import com.jagex.Class651;
import com.jagex.Class655;
import com.jagex.Class667;
import com.jagex.Class681;
import com.jagex.Class83;
import com.jagex.Interface76;
import com.jagex.client;

public class Class602 implements Interface76 {
   static Class602 aClass602_7883 = new Class602(0);
   static Class602 aClass602_7884 = new Class602(1);
   public static Class602 aClass602_7885 = new Class602(2);
   int anInt7886;

   public int getId() {
      return -101562321 * this.anInt7886;
   }

   Class602(int var1) {
      this.anInt7886 = var1 * -1093140785;
   }

   public int method21() {
      return -101562321 * this.anInt7886;
   }

   static final void method7096(InterfaceDef var0, Class243 var1, Class681 var2, Class258 var3, int var4) {
      int var5 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285];
      switch(var3.anInt2821 * 1428903097) {
      case 0:
         if(null != Class655.aClass107Array8488 && var5 < Class655.aClass107Array8488.length) {
            var0.aString2675 = Class655.aClass107Array8488[var5].aString1310;
         }
         break;
      case 1:
         var0.aString2675 = Class566.aClass223_7610.method3122(var5, (byte)94).method2993((byte)0);
         break;
      case 2:
      case 3:
         var0.aString2675 = var2.aClass526_Sub9_8646.aClass339Array10402[var5].aString3528;
         break;
      case 4:
         if(client.anInt11288 * 2029719417 != 2 || var5 >= -17244221 * client.anInt11130) {
            return;
         }

         var0.aString2675 = client.aClass50Array11290[var5].aString659;
         break;
      case 5:
         var0.aString2675 = ((Class220)Class566.aClass223_7610.method3108(1691615210).get(var5)).method3041(-1758297575);
         break;
      default:
         throw new IllegalStateException();
      }

      var0.aClass258_2651 = var3;
   }

   static final void method7097(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      boolean var2 = 1 == var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      InterfaceDef var4 = Class221.method3095(var3, (byte)-25);
      Class243 var5 = Class315_Sub1.aClass243Array10033[var3 >> 16];
      method7096(var4, var5, var0, var2?Class258.aClass258_2822:Class258.aClass258_2826, 1340751157);
   }

   public static final void method7098(byte var0) {
      for(int var1 = 0; var1 < 5; ++var1) {
         client.aBoolArray11263[var1] = false;
      }

      client.anInt11117 = -50532269;
      client.anInt11118 = -1469919279;
      Class83.anInt846 = 0;
      Class10.anInt63 = 0;
      Class327.anInt3488 = 207250569;
      if(Class397.method4824((byte)1) == 2) {
         Class596 var5 = client.aClass505_11204.method6128(2066851371);
         int var2 = var5.localX * -814686591 << 9;
         int var3 = -845789331 * var5.localY << 9;
         int var4 = 1000 / Class636.method7565(1102671983);
         Class195.aClass292_Sub1_2182.method3905((float)var4 / 1000.0F, client.aClass505_11204.method6125(-2097595167).anIntArrayArrayArray5312, client.aClass505_11204.method6094((byte)-21), var2, var3, 2028386226);
      }

      Class576.anInt7740 = 1775818497;
      Class277.anInt3029 = -1852613725;
      client.anInt11148 = 1349034911 * client.anInt11012;
      Class517.anInt7041 = Class439.anInt4866 * 1680413835;
      Class526_Sub6.anInt10398 = 1227300885 * Class322.anInt3458;
      Class513.anInt7021 = -1668624133 * Class210.anInt2259;
      Class476.anInt5388 = Class487.anInt5511 * -1151483665;
      Class667.anInt8531 = -767165579 * Class317.anInt3410;
      Class651.anInt8463 = 1547047273 * client.anInt11292;
   }
}
