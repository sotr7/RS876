package com.jagex;

import com.jagex.Class113;
import com.jagex.Class152;
import com.jagex.Class174;
import com.jagex.Class181;
import com.jagex.Class196;
import com.jagex.Class206;
import com.jagex.Class230;
import com.jagex.Class28;
import com.jagex.Class331;
import com.jagex.Class342;
import com.jagex.Class376;
import com.jagex.Class41;
import com.jagex.Class448_Sub1;
import com.jagex.Class451;
import com.jagex.Class47;
import com.jagex.Class493;
import com.jagex.Class526_Sub5;
import com.jagex.Class549;
import com.jagex.Class570;
import com.jagex.Class580;
import com.jagex.Class642;
import com.jagex.Class658;
import com.jagex.Class681;
import com.jagex.Class72;
import com.jagex.Class9_Sub1;
import com.jagex.Interface59;
import com.jagex.Interface76;
import com.jagex.client;
import java.awt.Canvas;

public class Class618 implements Interface76 {
   int anInt8105;
   int anInt8106;
   static Class618 aClass618_8103 = new Class618(1, 0);
   public static Class618 aClass618_8104 = new Class618(2, 1);
   public static Class618 aClass618_8102 = new Class618(0, 2);

   Class618(int var1, int var2) {
      this.anInt8105 = -568410319 * var1;
      this.anInt8106 = var2 * -69411725;
   }

   static boolean method7322(int var0, int var1, int var2, byte var3) {
      Class549 var4 = client.aClass505_11204.method6072(-624361615);
      boolean var5 = true;
      Interface59 var6 = (Interface59)var4.method6589(var0, var1, var2, (byte)24);
      if(null != var6) {
         var5 &= Class152.method1764(var6, 2109967241);
      }

      var6 = (Interface59)var4.method6591(var0, var1, var2, client.anInterface64_11296, 1739430101);
      if(null != var6) {
         var5 &= Class152.method1764(var6, 2117963401);
      }

      var6 = (Interface59)var4.method6593(var0, var1, var2, -780535946);
      if(null != var6) {
         var5 &= Class152.method1764(var6, 2137926959);
      }

      return var5;
   }

   public int method21() {
      return this.anInt8106 * -1029494597;
   }

   public int getId() {
      return this.anInt8106 * -1029494597;
   }

   public static Class618[] method7323(int var0) {
      return new Class618[]{aClass618_8102, aClass618_8103, aClass618_8104};
   }

   static final void method7324(Class681 var0, byte var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      Class570.aClass231_7657.method3197(var2, var3, var4, (byte)57);
   }

   static void method7325(Class174 var0, int var1) {
      if(Class41.aClass702_452.method8183(-1977279152) != 0) {
         Class526_Sub5 var2;
         if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-106) == 0) {
            for(var2 = (Class526_Sub5)Class41.aClass702_452.method8206((byte)38); var2 != null; var2 = (Class526_Sub5)Class41.aClass702_452.method8181(-144714739)) {
               Class448_Sub1.aClass40_Sub1_10233.method10234(var0, var0, var2.anInt10385 * -194176819, var2.anInt10383 * 529789599, var2.anInt10384 * 238445489, var2.anInt10386 * -425230757, false, false, var2.anInt10382 * 1711454513, Class47.aClass163_643, var2.aBool10387?Class451.localPlayer.aClass633_12181:null, Class331.aClass613_3498, 728349643);
               var2.method6332(-1949449864);
            }

            Class9_Sub1.method10244(318415039);
         } else {
            if(null == Class41.aClass174_451) {
               Canvas var3 = new Canvas();
               var3.setSize(36, 32);
               Class41.aClass174_451 = Class72.method1104(0, var3, Class658.aClass169_8508, Class580.anInterface24_7751, Class376.aClass400_3913, Class196.aClass395_2191, Class206.aClass396_2246, Class342.aClass466_3560, 0, (byte)-49);
               Class41.aClass163_453 = Class41.aClass174_451.method2313(Class493.method5894(Class642.aClass466_8429, 1031233005 * Class28.anInt255, 0, (short)-22425), Class181.method2681(Class113.aClass466_1370, Class28.anInt255 * 1031233005, 0), true);
            }

            for(var2 = (Class526_Sub5)Class41.aClass702_452.method8206((byte)25); var2 != null; var2 = (Class526_Sub5)Class41.aClass702_452.method8181(847336530)) {
               Class448_Sub1.aClass40_Sub1_10233.method10234(Class41.aClass174_451, var0, var2.anInt10385 * -194176819, var2.anInt10383 * 529789599, 238445489 * var2.anInt10384, var2.anInt10386 * -425230757, false, false, 1711454513 * var2.anInt10382, Class41.aClass163_453, var2.aBool10387?Class451.localPlayer.aClass633_12181:null, Class331.aClass613_3498, 978890830);
               var2.method6332(-1949449864);
            }
         }

      }
   }

   public static boolean method7326(int var0, byte var1) {
      return 0 == var0 || 1 == var0 || 2 == var0;
   }
}
