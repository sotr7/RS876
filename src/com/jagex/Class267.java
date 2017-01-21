package com.jagex;

import com.jagex.Class203;
import com.jagex.Class210;
import com.jagex.Class219;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class27;
import com.jagex.Class291;
import com.jagex.Class296;
import com.jagex.Class309;
import com.jagex.Class33;
import com.jagex.Class331;
import com.jagex.Class461;
import com.jagex.Class463;
import com.jagex.Class464;
import com.jagex.Class555;
import com.jagex.Class593;
import com.jagex.Class640;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface76;
import com.jagex.client;

public class Class267 implements Interface76 {
   public int anInt2986;
   int anInt2985;
   public static Class267 aClass267_2983 = new Class267(1, 0);
   public static Class267 aClass267_2984 = new Class267(2, 1);
   static Class267 aClass267_2987 = new Class267(0, 2);

   Class267(int var1, int var2) {
      this.anInt2986 = -1987385733 * var1;
      this.anInt2985 = 1054576569 * var2;
   }

   public int getId() {
      return this.anInt2985 * -611334519;
   }

   public int method21() {
      return this.anInt2985 * -611334519;
   }

   public static void method3572(byte var0) {
      if(null == Class291.aClass296Array3135) {
         Class291.aClass296Array3135 = Class296.method3964(-456318228);
         Class27.aClass296_250 = Class291.aClass296Array3135[0];
         Class33.aLong368 = Class255.time((byte)24) * 7724091072623226347L;
      }

      if(Class309.aClass290_3377 == null) {
         Class640.method7639(-1565137632);
      }

      Class296 var1 = Class27.aClass296_250;
      int var2 = Class331.method4249(2087699452);
      if(Class27.aClass296_250 == var1) {
         Class219.aString2293 = Class27.aClass296_250.aClass45_3212.method920(Class26.aClass673_247, -827840379);
         Class210.aString2258 = Class219.aString2293;
         if(Class27.aClass296_250.aBool3217) {
            Class464.anInt5232 = -916228115 * (-1716976061 * Class27.aClass296_250.anInt3214 + var2 * (Class27.aClass296_250.anInt3215 * -245183283 - -1716976061 * Class27.aClass296_250.anInt3214) / 100);
         }

         if(Class27.aClass296_250.aBool3216) {
            Class210.aString2258 = Class210.aString2258 + " - " + -311198235 * Class464.anInt5232 + "%";
         }
      } else if(Class296.aClass296_3194 == Class27.aClass296_250) {
         Class309.aClass290_3377 = null;
         Class593.method7031(16, (byte)79);
         if(Class291.aBool3132) {
            Class291.aBool3132 = false;
            Class461.method5470(Class463.aString5231, Class555.aString7480, "", false, -1865962701);
         }
      } else {
         Class219.aString2293 = var1.aClass45_3213.method920(Class26.aClass673_247, -827840379);
         Class210.aString2258 = Class219.aString2293;
         if(Class27.aClass296_250.aBool3216) {
            Class210.aString2258 = Class210.aString2258 + " - " + var1.anInt3215 * -245183283 + "%";
         }

         Class464.anInt5232 = var1.anInt3215 * -1913527095;
         if(Class27.aClass296_250.aBool3217 || var1.aBool3217) {
            Class33.aLong368 = Class255.time((byte)24) * 7724091072623226347L;
         }
      }

      if(null != Class309.aClass290_3377) {
         Class309.aClass290_3377.method3829(Class33.aLong368 * -2499719659792198973L, Class219.aString2293, Class210.aString2258, -311198235 * Class464.anInt5232, Class27.aClass296_250, 1101753182);
         if(Class291.anInterface31Array3130 != null) {
            for(int var3 = -1886123595 * Class291.anInt3131 + 1; var3 < Class291.anInterface31Array3130.length; ++var3) {
               if(Class291.anInterface31Array3130[var3].method206(-992938573) >= 100 && -1886123595 * Class291.anInt3131 == var3 - 1 && client.anInt11038 * -558705405 != 18 && Class309.aClass290_3377.method3827(-1213687675)) {
                  try {
                     Class291.anInterface31Array3130[var3].method150((byte)-68);
                  } catch (Exception var5) {
                     Class291.anInterface31Array3130 = null;
                     break;
                  }

                  Class309.aClass290_3377.method3835(Class291.anInterface31Array3130[var3], -2090777914);
                  Class291.anInt3131 += 1937071261;
                  if(Class291.anInt3131 * -1886123595 >= Class291.anInterface31Array3130.length - 1 && Class291.anInterface31Array3130.length > 1) {
                     Class291.anInt3131 = (Class291.aClass79_3137.method1146((byte)64)?0:-1) * 1937071261;
                  }
               }
            }
         }
      }

   }

   static final void method3573(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class203.method2887(var3, var4, var0, 2009214633);
   }

   static final void method3574(InterfaceDef var0, int var1, Class681 var2, int var3) {
      if(null == var0.aByteArrayArray2584) {
         throw new RuntimeException();
      } else {
         if(null == var0.anIntArray2582) {
            var0.anIntArray2582 = new int[var0.aByteArrayArray2584.length];
         }

         var0.anIntArray2582[var1] = Integer.MAX_VALUE;
      }
   }
}
