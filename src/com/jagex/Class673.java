package com.jagex;

import com.jagex.Class143_Sub1;
import com.jagex.Class218;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class313_Sub1;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class451;
import com.jagex.Class5;
import com.jagex.Class504;
import com.jagex.Class506;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub9;
import com.jagex.Class549;
import com.jagex.Class566;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Interface76;
import com.jagex.client;
import java.util.Locale;

public class Class673 implements Interface76 {
   public static final int anInt8569 = 7;
   public static Class526_Sub9 aClass526_Sub9_8581;
   String aString8575;
   String aString8577;
   public int anInt8576;
   Locale aLocale8580;
   public static Class673 aClass673_8579;
   public static Class673 aClass673_8573;
   public static Class673 aClass673_8570;
   public static Class673 aClass673_8571;
   static Class673 aClass673_8572;
   public static Class673 aClass673_8568;
   public static Class673 aClass673_8574;
   static Class673[] aClass673Array8578;

   static final void method7996(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      int var4 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285];
      var0.componentItem = 569578419;
      if(var0.anInt2529 * 1700151229 != var4) {
         var0.anInt2529 = var4 * 671576981;
         Class526_Sub31.method9555(var0, (byte)10);
      }

      if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
         Class313_Sub1.method9059(919258769 * var0.uid, (byte)2);
      }

   }

   Class673(String var1, String var2, String var3, Class684 var4, int var5, String var6) {
      this.aString8575 = var1;
      this.aString8577 = var2;
      this.anInt8576 = var5 * 969583941;
      if(null != var6) {
         this.aLocale8580 = new Locale(var2.substring(0, 2), var6);
      } else {
         this.aLocale8580 = new Locale(var2.substring(0, 2));
      }

   }

   public static Class673[] method7997(int var0) {
      return new Class673[]{aClass673_8572, aClass673_8568, aClass673_8571, aClass673_8579, aClass673_8574, aClass673_8570, aClass673_8573};
   }

   String method7998(int var1) {
      return this.aString8577;
   }

   public Locale method7999(int var1) {
      return this.aLocale8580;
   }

   public static Class673 method8000(int var0, int var1) {
      return var0 >= 0 && var0 < aClass673Array8578.length?aClass673Array8578[var0]:null;
   }

   public int getId() {
      return -398271091 * this.anInt8576;
   }

   public int method21() {
      return -398271091 * this.anInt8576;
   }

   public String method8001() {
      return this.method7998(622576897).toLowerCase(Locale.ENGLISH);
   }

   static final void method8002(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      boolean var3 = 1 == var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      Class218 var5 = Class566.aClass223_7610.method3122(var2, (byte)71);
      if(var5.method3025((byte)-8) == null) {
         var5.method3006(client.anInterface28_11266, 927505291);
      }

      if(var3) {
         Class143_Sub1 var6 = (Class143_Sub1)Class506.aClass97_Sub1_Sub1_5698.method89(var4, -1717853283);
         switch(var6.aClass454_1676.aClass481_5149.anInt5462 * -1546867669) {
         case 0:
            var0.aLongArray8626[(var0.anInt8630 += 1112803603) * -1032509157 - 1] = var5.method3025((byte)-58).method24(var6.anInt1674 * 697078941, -1095890769);
            break;
         case 4:
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.method3025((byte)-81).method33(var6.anInt1674 * 697078941, (byte)-82);
            break;
         default:
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var5.method3025((byte)-81).method22(697078941 * var6.anInt1674, -1408892386);
         }
      } else {
         Class317 var7 = (Class317)Class5.aClass40_Sub2_28.method89(var4, -1924865879);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var7.method4094(var5.method3025((byte)-59).method33(697078941 * var7.aClass143_3405.anInt1674, (byte)9), -1434583520);
      }

   }

   static float method8003(float var0, float var1, float var2, float var3, float var4, float var5, int var6, byte var7) {
      float var8 = 0.0F;
      float var9 = var3 - var0;
      float var10 = var4 - var1;
      float var11 = var5 - var2;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;

      for(Class549 var15 = client.aClass505_11204.method6072(1329468522); var8 < 1.1F; var8 += 0.1F) {
         float var16 = var0 + var8 * var9;
         float var17 = var1 + var10 * var8;
         float var18 = var2 + var8 * var11;
         int var19 = (int)var16 >> 9;
         int var20 = (int)var18 >> 9;
         if(var19 > 0 && var20 > 0 && var19 < client.aClass505_11204.method6056(-1746741811) && var20 < client.aClass505_11204.method6057(126749238)) {
            int var21 = Class451.localPlayer.aByte10827;
            if(var21 < 3 && (client.aClass505_11204.method6094((byte)27).aByteArrayArrayArray5356[1][var19][var20] & 2) != 0) {
               ++var21;
            }

            int var22 = var15.aClass148Array7290[var21].method1707((int)var16, (int)var18, 1052431039);
            if((float)var22 < var17) {
               if(var6 >= 2) {
                  return var8 - 0.1F + method8003(var12, var13, var14, var16, var17, var18, var6 - 1, (byte)-77) * 0.1F;
               }

               return var8;
            }
         }

         var12 = var16;
         var13 = var17;
         var14 = var18;
      }

      return -1.0F;
   }

   static final void method8004(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-125);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class504.method6047(var3, var4, var0, -1837406611);
   }

   public String toString() {
      return this.method7998(1187536931).toLowerCase(Locale.ENGLISH);
   }

   static {
      aClass673_8579 = new Class673("EN", "en", "English", Class684.aClass684_8665, 0, "GB");
      aClass673_8573 = new Class673("DE", "de", "German", Class684.aClass684_8665, 1, "DE");
      aClass673_8570 = new Class673("FR", "fr", "French", Class684.aClass684_8665, 2, "FR");
      aClass673_8571 = new Class673("PT", "pt", "Portuguese", Class684.aClass684_8665, 3, "BR");
      aClass673_8572 = new Class673("NL", "nl", "Dutch", Class684.aClass684_8661, 4, "NL");
      aClass673_8568 = new Class673("ES", "es", "Spanish", Class684.aClass684_8661, 5, "ES");
      aClass673_8574 = new Class673("ES_MX", "es-mx", "Spanish (Latin American)", Class684.aClass684_8665, 6, "MX");
      Class673[] var0 = method7997(2146924876);
      aClass673Array8578 = new Class673[var0.length];
      Class673[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Class673 var3 = var1[var2];
         if(aClass673Array8578[var3.anInt8576 * -398271091] != null) {
            throw new IllegalStateException();
         }

         aClass673Array8578[var3.anInt8576 * -398271091] = var3;
      }

   }

   static final void method8005(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class525_Sub1.aBool10723?1:0;
   }
}
