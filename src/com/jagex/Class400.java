package com.jagex;

import com.jagex.Class190;
import com.jagex.Class192;
import com.jagex.Class199_Sub18;
import com.jagex.Class230;
import com.jagex.Class253;
import com.jagex.Class319;
import com.jagex.Class340;
import com.jagex.Class386;
import com.jagex.Class438;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.Class499;
import com.jagex.RSByteBuffer;
import com.jagex.Class55;
import com.jagex.Class551;
import com.jagex.Class57;
import com.jagex.Class582;
import com.jagex.Class604;
import com.jagex.Class608;
import com.jagex.Class612_Sub1;
import com.jagex.Class633;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class707;
import com.jagex.Class710;
import com.jagex.Interface47;
import com.jagex.client;

public class Class400 implements Interface47 {
   Class192 aClass192_4132 = new Class192(64);
   Class466 aClass466_4131;

   public Class400(Class466 var1) {
      this.aClass466_4131 = var1;
   }

   public Class386 method352(int var1, int var2) {
      Class386 var3 = (Class386)this.aClass192_4132.method2765((long)var1);
      if(null != var3) {
         return var3;
      } else {
         byte[] var4 = this.aClass466_4131.method5536(0, var1, (byte)-68);
         var3 = new Class386();
         if(var4 != null) {
            var3.method4750(new RSByteBuffer(var4), var1, 823716478);
         }

         this.aClass192_4132.method2768(var3, (long)var1);
         return var3;
      }
   }

   public Class386 method351(int var1) {
      Class386 var2 = (Class386)this.aClass192_4132.method2765((long)var1);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = this.aClass466_4131.method5536(0, var1, (byte)-2);
         var2 = new Class386();
         if(var3 != null) {
            var2.method4750(new RSByteBuffer(var3), var1, -2030928400);
         }

         this.aClass192_4132.method2768(var2, (long)var1);
         return var2;
      }
   }

   static void method4834(Class639_Sub1_Sub2_Sub1 var0, int var1) {
      if(var0 instanceof NPC) {
         NPC var2 = (NPC)var0;
         if(var2.def != null) {
            Class319.method4127(var2, Class451.localPlayer.aByte10827 != var2.aByte10827, -1186334541);
         }
      } else if(var0 instanceof Class639_Sub1_Sub2_Sub1_Sub1) {
         Class639_Sub1_Sub2_Sub1_Sub1 var3 = (Class639_Sub1_Sub2_Sub1_Sub1)var0;
         Class253.method3472(var3, var3.aByte10827 != Class451.localPlayer.aByte10827, 2137510253);
      }

   }

   static void method4835(RSByteBuffer var0, int var1) {
      int var2 = var0.readSmart(-142716110);
      Class55.aClass604Array672 = new Class604[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         Class55.aClass604Array672[var3] = new Class604();
         Class55.aClass604Array672[var3].anInt7893 = var0.readSmart(-1346721112) * -1570788607;
         Class55.aClass604Array672[var3].aString7892 = var0.method9637(-1495866034);
      }

      Class608.anInt7919 = var0.readSmart(-555538150) * -1751881449;
      Class57.anInt691 = var0.readSmart(-1663048342) * -299349253;
      Class190.anInt2167 = var0.readSmart(-1829051782) * -2106884845;
      Class707.aClass612_Sub1Array8837 = new Class612_Sub1[1 + (-610389965 * Class57.anInt691 - Class608.anInt7919 * 1255104167)];

      for(var3 = 0; var3 < 841209115 * Class190.anInt2167; ++var3) {
         int var4 = var0.readSmart(-1018737150);
         Class612_Sub1 var5 = Class707.aClass612_Sub1Array8837[var4] = new Class612_Sub1();
         var5.anInt8021 = var0.readUnsignedByte(-1923292183) * 396590733;
         var5.anInt8023 = var0.readInt((byte)5) * 1573281441;
         var5.anInt10817 = var0.readSmart(-1285899839) * 1897388675;
         if(0 != var5.anInt10817 * 619103275) {
            var5.aString10818 = var0.method9637(-1495866034);
         }

         var5.anInt10815 = (var4 + 1255104167 * Class608.anInt7919) * 1843237303;
         var5.aString10816 = var0.method9637(-1495866034);
         var5.aString10813 = var0.method9637(-1495866034);
      }

      Class582.anInt7777 = var0.readInt((byte)5) * 2084764791;
      Class608.aBool7915 = true;
   }

   public static void method4836(int var0, int var1) {
      Class340.anInt3539 = 1247682365 * var0;
      Class192 var2 = Class633.aClass192_8239;
      synchronized(var2) {
         Class633.aClass192_8239.method2770(963433179);
      }

      var2 = Class633.aClass192_8256;
      synchronized(var2) {
         Class633.aClass192_8256.method2770(865727939);
      }
   }

   static final void method4837(Class681 var0, int var1) {
      if(Class710.aBool8850 && null != Class499.aFrame5603) {
         Class551.method6647(Class230.preferences.aClass711_Sub7_10637.method9899((byte)71), -1, -1, false, 1570011979);
      }

      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      boolean var3 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1;
      String var4 = Class199_Sub18.method9027(1262762246) + var2;
      Class438.openJSURL(var4, var3, client.aBool10997, -724484489);
   }

   static final void method4838(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub33_10645.method10135((byte)57);
   }
}
