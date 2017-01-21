package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class312;
import com.jagex.Class422;
import com.jagex.Class577;
import com.jagex.Class612_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import java.util.ArrayList;
import java.util.List;

public class Class216 {
   static final int anInt2277 = 5;
   List aList2276 = new ArrayList();

   public int method2967(Class221 var1, int var2) {
      return this.method2970(var1, -1, 1708154977);
   }

   public int method2968(int var1, int var2) {
      for(int var3 = 0; var3 < this.aList2276.size(); ++var3) {
         if(((Class221)this.aList2276.get(var3)).anInt2302 * 1756072569 == var1) {
            return var3;
         }
      }

      return -1;
   }

   public Class221 method2969(int var1, int var2) {
      return (Class221)this.aList2276.get(var1);
   }

   public int method2970(Class221 var1, int var2, int var3) {
      if(this.aList2276.size() == 5) {
         throw new RuntimeException("");
      } else if(this.method2968(var1.anInt2302 * 1756072569, 2041895662) != -1) {
         throw new RuntimeException("");
      } else {
         if(-1 == var2) {
            var2 = this.aList2276.size();
         }

         this.aList2276.add(var2, var1);
         return var2;
      }
   }

   public void method2971(int var1, int var2) {
      this.aList2276.remove(var1);
   }

   public void method2972(int var1) {
      this.aList2276.clear();
   }

   public int method2973() {
      return this.aList2276.size();
   }

   public int method2974(int var1) {
      for(int var2 = 0; var2 < this.aList2276.size(); ++var2) {
         if(((Class221)this.aList2276.get(var2)).anInt2302 * 1756072569 == var1) {
            return var2;
         }
      }

      return -1;
   }

   public int method2975(int var1) {
      for(int var2 = 0; var2 < this.aList2276.size(); ++var2) {
         if(((Class221)this.aList2276.get(var2)).anInt2302 * 1756072569 == var1) {
            return var2;
         }
      }

      return -1;
   }

   public int method2976(short var1) {
      return this.aList2276.size();
   }

   public void method2977() {
      this.aList2276.clear();
   }

   public void method2978(int var1) {
      this.aList2276.remove(var1);
   }

   public void method2979() {
      this.aList2276.clear();
   }

   public void method2980() {
      this.aList2276.clear();
   }

   public void method2981() {
      this.aList2276.clear();
   }

   public void method2982() {
      this.aList2276.clear();
   }

   static final void method2983(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class312.method4074(var3, var4, var0, (byte)-35);
   }

   static final void method2984(Class681 var0, int var1) {
      InterfaceDef var2 = Class221.method3095(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (byte)-108);
      if(null == var2.aClass245Array2662) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         int var3 = var2.aClass245Array2662.length;

         for(int var4 = 0; var4 < var2.aClass245Array2662.length; ++var4) {
            if(var2.aClass245Array2662[var4] == null) {
               var3 = var4;
               break;
            }
         }

         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3;
      }
   }

   public static String method2985(CharSequence var0, int var1) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if((var5 < 97 || var5 > 122) && (var5 < 65 || var5 > 90) && (var5 < 48 || var5 > 57) && var5 != 46 && var5 != 45 && 42 != var5 && var5 != 95) {
            if(var5 == 32) {
               var3.append('\u002b');
            } else {
               byte var6 = Class422.method4994(var5, (byte)32);
               var3.append('\u0025');
               int var7 = var6 >> 4 & 15;
               if(var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }

               var7 = var6 & 15;
               if(var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }
            }
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   static final void method2986(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class612_Sub1 var3 = Class577.method6943(var2, (byte)103);
      if(null != var3) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -2015558303 * var3.anInt8023;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString10816;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.method9794(573876329);
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.method9795(-101484739);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt8027 * 285278699;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -2134698331 * var3.anInt10814;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString10813;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }
}
