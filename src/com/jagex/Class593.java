package com.jagex;

import com.jagex.Class202;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class265;
import com.jagex.Class294;
import com.jagex.Class297;
import com.jagex.Class331;
import com.jagex.Class384;
import com.jagex.Class385;
import com.jagex.Class40;
import com.jagex.Class471;
import com.jagex.Class487;
import com.jagex.Class498;
import com.jagex.Class513;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class533;
import com.jagex.Class554;
import com.jagex.Class589;
import com.jagex.Class594;
import com.jagex.Class657;
import com.jagex.Class681;
import com.jagex.Interface76;
import com.jagex.client;

public class Class593 implements Interface76 {
   public static Class513 aClass513_7819;
   static Class657 aClass657_7820;
   public static Class593 aClass593_7817 = new Class593(0);
   public static Class593 aClass593_7816 = new Class593(1);
   public static Class593 aClass593_7815 = new Class593(2);
   int anInt7818;

   public int getId() {
      return -1537374285 * this.anInt7818;
   }

   Class593(int var1) {
      this.anInt7818 = var1 * 2102034299;
   }

   public int method21() {
      return -1537374285 * this.anInt7818;
   }

   static final void method7027(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-38);
      Class533.method6396(var3, var0, (byte)-114);
   }

   static final void method7028(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method7029(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub13_10647.method9968(980104599);
   }

   public static boolean method7030(char var0, int var1) {
      return var0 >= 48 && var0 <= 57;
   }

   public static void method7031(int var0, byte var1) {
      if(var0 != -558705405 * client.anInt11038) {
         client.anInt11026 = 0;
         if(9 == -558705405 * client.anInt11038 && 10 != var0) {
            Class294.method3959(-2088293700);
         }

         if(var0 == 17 || 19 == var0) {
            Class487.method5859(940505408);
         }

         if(var0 != 17 && null != Class202.aClass560_2213) {
            Class202.aClass560_2213.stop((short)-26525);
            Class202.aClass560_2213 = null;
         }

         if(16 == var0) {
            Class40.method881(-558705405 * client.anInt11038 == 11 || -558705405 * client.anInt11038 == 13 || Class331.aClass613_3498.anInt8039 * -650773539 != -327748687 * client.anInt11186, -1910637435);
            Class498.method5945((byte)81);
         }

         boolean var2;
         if(0 == var0) {
            if(-542605973 * Class331.aClass613_3498.anInt8040 != -1) {
               var2 = -327748687 * client.anInt11186 != -542605973 * Class331.aClass613_3498.anInt8040;
            } else {
               var2 = 1 == -558705405 * client.anInt11038 || client.anInt11038 * -558705405 == 4;
            }

            Class297.method3971(var2, -182448362);
         }

         if(1 != var0 && var0 != 4) {
            if(3 == var0 || 8 == var0 && 6 != -558705405 * client.anInt11038) {
               if(!Class487.method5859(940505408)) {
                  return;
               }
            } else if(13 == var0) {
               Class589.method7007(-1302345086);
            }
         } else if(!Class471.method5635(1693201951)) {
            return;
         }

         if(Class331.method4248(var0, (byte)15)) {
            client.aClass505_11204.method6075(90765031);
            client.aClass505_11204.aLong5674 = -6084225111100206199L;
         }

         if(10 == var0 || 16 == var0) {
            Class384.method4728(-1499569423);
         }

         var2 = var0 == 12 || Class594.method7038(var0, (byte)47) || Class385.method4746(var0, (byte)34);
         boolean var3 = 12 == client.anInt11038 * -558705405 || Class594.method7038(-558705405 * client.anInt11038, (byte)127) || Class385.method4746(client.anInt11038 * -558705405, (byte)34);
         if(var2 != var3) {
            Class247.aClass460_2688.sendLoginState(!var2, (short)-20393);
         }

         if(Class331.method4248(var0, (byte)5) || var0 == 17 || var0 == 19) {
            Class554.aClass174_7475.method2611();
         }

         client.anInt11038 = var0 * 871251371;
      }
   }

   public static void method7032(int var0, int var1) {
      int var2 = client.aList11261.indexOf(Integer.valueOf(var0));
      if(-1 == var2) {
         client.aList11261.add(Integer.valueOf(var0));
      }

   }

   static void method7033(int var0, int var1, int var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(5, (long)var0);
      var3.method10584(230428369);
      var3.anInt11678 = 1693201951 * var1;
   }
}
