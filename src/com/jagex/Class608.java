package com.jagex;

import com.jagex.Class190;
import com.jagex.Class25;
import com.jagex.Class476;
import com.jagex.Class509;
import com.jagex.RSByteBuffer;
import com.jagex.Class55;
import com.jagex.Class566;
import com.jagex.Class57;
import com.jagex.Class582;
import com.jagex.Class593;
import com.jagex.Class604;
import com.jagex.Class612_Sub1;
import com.jagex.Class681;
import com.jagex.Class707;
import com.jagex.client;

public class Class608 {
   static final int anInt7916 = 1;
   static final int anInt7917 = -1;
   static final int anInt7918 = 2;
   static boolean aBool7915 = false;
   public static int anInt7919;

   Class608() throws Throwable {
      throw new Error();
   }

   static void method7150(RSByteBuffer var0) {
      for(int var1 = 0; var1 < Class190.anInt2167 * 841209115; ++var1) {
         int var2 = var0.readSmart(-813253771);
         int var3 = var0.readUnsignedShort(272438529);
         if(var3 == '\uffff') {
            var3 = -1;
         }

         if(null != Class707.aClass612_Sub1Array8837[var2]) {
            Class707.aClass612_Sub1Array8837[var2].anInt8027 = -2021253437 * var3;
         }
      }

   }

   public static Class612_Sub1 method7151(int var0) {
      return aBool7915 && var0 >= 1255104167 * anInt7919 && var0 <= -610389965 * Class57.anInt691?Class707.aClass612_Sub1Array8837[var0 - anInt7919 * 1255104167]:null;
   }

   static void method7152(RSByteBuffer var0) {
      int var1 = var0.readSmart(-1866362665);
      Class55.aClass604Array672 = new Class604[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         Class55.aClass604Array672[var2] = new Class604();
         Class55.aClass604Array672[var2].anInt7893 = var0.readSmart(-1925973298) * -1570788607;
         Class55.aClass604Array672[var2].aString7892 = var0.method9637(-1495866034);
      }

      anInt7919 = var0.readSmart(-433269959) * -1751881449;
      Class57.anInt691 = var0.readSmart(-842938325) * -299349253;
      Class190.anInt2167 = var0.readSmart(-153663150) * -2106884845;
      Class707.aClass612_Sub1Array8837 = new Class612_Sub1[1 + (-610389965 * Class57.anInt691 - anInt7919 * 1255104167)];

      for(var2 = 0; var2 < 841209115 * Class190.anInt2167; ++var2) {
         int var3 = var0.readSmart(-224607411);
         Class612_Sub1 var4 = Class707.aClass612_Sub1Array8837[var3] = new Class612_Sub1();
         var4.anInt8021 = var0.readUnsignedByte(-1031646232) * 396590733;
         var4.anInt8023 = var0.readInt((byte)5) * 1573281441;
         var4.anInt10817 = var0.readSmart(-1210595208) * 1897388675;
         if(0 != var4.anInt10817 * 619103275) {
            var4.aString10818 = var0.method9637(-1495866034);
         }

         var4.anInt10815 = (var3 + 1255104167 * anInt7919) * 1843237303;
         var4.aString10816 = var0.method9637(-1495866034);
         var4.aString10813 = var0.method9637(-1495866034);
      }

      Class582.anInt7777 = var0.readInt((byte)5) * 2084764791;
      aBool7915 = true;
   }

   static void method7153(RSByteBuffer var0) {
      int var1 = var0.readSmart(-1859787110);
      Class55.aClass604Array672 = new Class604[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         Class55.aClass604Array672[var2] = new Class604();
         Class55.aClass604Array672[var2].anInt7893 = var0.readSmart(-804571783) * -1570788607;
         Class55.aClass604Array672[var2].aString7892 = var0.method9637(-1495866034);
      }

      anInt7919 = var0.readSmart(-1323585630) * -1751881449;
      Class57.anInt691 = var0.readSmart(-242233242) * -299349253;
      Class190.anInt2167 = var0.readSmart(-1508534371) * -2106884845;
      Class707.aClass612_Sub1Array8837 = new Class612_Sub1[1 + (-610389965 * Class57.anInt691 - anInt7919 * 1255104167)];

      for(var2 = 0; var2 < 841209115 * Class190.anInt2167; ++var2) {
         int var3 = var0.readSmart(-230908576);
         Class612_Sub1 var4 = Class707.aClass612_Sub1Array8837[var3] = new Class612_Sub1();
         var4.anInt8021 = var0.readUnsignedByte(-2033668798) * 396590733;
         var4.anInt8023 = var0.readInt((byte)5) * 1573281441;
         var4.anInt10817 = var0.readSmart(-894943530) * 1897388675;
         if(0 != var4.anInt10817 * 619103275) {
            var4.aString10818 = var0.method9637(-1495866034);
         }

         var4.anInt10815 = (var3 + 1255104167 * anInt7919) * 1843237303;
         var4.aString10816 = var0.method9637(-1495866034);
         var4.aString10813 = var0.method9637(-1495866034);
      }

      Class582.anInt7777 = var0.readInt((byte)5) * 2084764791;
      aBool7915 = true;
   }

   static void method7154(RSByteBuffer var0) {
      int var1 = var0.readSmart(-616655441);
      Class55.aClass604Array672 = new Class604[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         Class55.aClass604Array672[var2] = new Class604();
         Class55.aClass604Array672[var2].anInt7893 = var0.readSmart(-717271302) * -1570788607;
         Class55.aClass604Array672[var2].aString7892 = var0.method9637(-1495866034);
      }

      anInt7919 = var0.readSmart(-2068899174) * -1751881449;
      Class57.anInt691 = var0.readSmart(-936202683) * -299349253;
      Class190.anInt2167 = var0.readSmart(-1014160115) * -2106884845;
      Class707.aClass612_Sub1Array8837 = new Class612_Sub1[1 + (-610389965 * Class57.anInt691 - anInt7919 * 1255104167)];

      for(var2 = 0; var2 < 841209115 * Class190.anInt2167; ++var2) {
         int var3 = var0.readSmart(-752912944);
         Class612_Sub1 var4 = Class707.aClass612_Sub1Array8837[var3] = new Class612_Sub1();
         var4.anInt8021 = var0.readUnsignedByte(873266705) * 396590733;
         var4.anInt8023 = var0.readInt((byte)5) * 1573281441;
         var4.anInt10817 = var0.readSmart(-736550426) * 1897388675;
         if(0 != var4.anInt10817 * 619103275) {
            var4.aString10818 = var0.method9637(-1495866034);
         }

         var4.anInt10815 = (var3 + 1255104167 * anInt7919) * 1843237303;
         var4.aString10816 = var0.method9637(-1495866034);
         var4.aString10813 = var0.method9637(-1495866034);
      }

      Class582.anInt7777 = var0.readInt((byte)5) * 2084764791;
      aBool7915 = true;
   }

   static void method7155(RSByteBuffer var0) {
      for(int var1 = 0; var1 < Class190.anInt2167 * 841209115; ++var1) {
         int var2 = var0.readSmart(-1919983766);
         int var3 = var0.readUnsignedShort(558597906);
         if(var3 == '\uffff') {
            var3 = -1;
         }

         if(null != Class707.aClass612_Sub1Array8837[var2]) {
            Class707.aClass612_Sub1Array8837[var2].anInt8027 = -2021253437 * var3;
         }
      }

   }

   public static Class612_Sub1 method7156(int var0) {
      return aBool7915 && var0 >= 1255104167 * anInt7919 && var0 <= -610389965 * Class57.anInt691?Class707.aClass612_Sub1Array8837[var0 - anInt7919 * 1255104167]:null;
   }

   static final void method7157(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3104((byte)10)?1:0;
   }

   static final void method7158(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
   }

   public static void method7159(int var0) {
      if(16 == client.anInt11038 * -558705405) {
         if(!Class509.method6166(-287379389) && !Class476.method5657(572423609)) {
            Class593.method7031(13, (byte)14);
         }
      }
   }

   static final void method7160(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(0 != client.anInt11288 * 2029719417 && var2 < client.anInt11218 * -87727903) {
         Class25 var3 = client.aClass25Array11169[var2];
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString243;
         if(null != var3.aString245) {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString245;
         } else {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         }
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }
}
