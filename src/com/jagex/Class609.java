package com.jagex;

import com.jagex.Class104;
import com.jagex.Class157;
import com.jagex.Class16;
import com.jagex.Class163;
import com.jagex.Class192;
import com.jagex.Class195;
import com.jagex.Class222;
import com.jagex.Class230;
import com.jagex.Class361;
import com.jagex.Class37_Sub1;
import com.jagex.Class466;
import com.jagex.Class474;
import com.jagex.Class482;
import com.jagex.Class508;
import com.jagex.Class52;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub18;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class590;
import com.jagex.Class622;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;
import com.jagex.Interface69;
import com.jagex.Interface70;
import com.jagex.client;
import java.util.ArrayList;
import java.util.List;

public class Class609 implements Interface70 {
   public static Class163 aClass163_7930;
   static int anInt7931;
   boolean aBool7926;
   int anInt7928;
   Class590 aClass590_7921;
   Class466 aClass466_7924;
   int anInt7922;
   Class361 aClass361_7927;
   Interface69 anInterface69_7925;
   Class192 aClass192_7923;
   boolean aBool7929;
   byte[] aByteArray7920;

   public RSByteBuffer method462(int var1) {
      if(this.aClass192_7923 == null) {
         return null;
      } else {
         RSByteBuffer var2 = null;
         if(null != this.anInterface69_7925) {
            this.anInterface69_7925.method438(this, (byte)-9);
         }

         Class192 var3 = this.aClass192_7923;
         synchronized(var3) {
            List var4 = this.method7164(1731488325);
            if(var4.size() > var1) {
               var2 = (RSByteBuffer)var4.get(var1);
            }

            return var2;
         }
      }
   }

   public boolean method482(int var1, int var2) {
      if(null == this.aClass192_7923) {
         return false;
      } else {
         boolean var3 = false;
         Class192 var4 = this.aClass192_7923;
         synchronized(var4) {
            List var5 = this.method7164(874331829);
            if(var5 != null && var5.size() > var1) {
               var3 = var5.get(var1) != null;
            }

            return var3;
         }
      }
   }

   public boolean method465(int var1) {
      return false;
   }

   public Class590 method443(int var1) {
      return this.aClass590_7921;
   }

   public boolean method454(byte var1) {
      if(this.aClass192_7923 == null) {
         return false;
      } else {
         List var2 = this.method7164(2025120493);
         if(null == var2 || var2.size() <= 0) {
            this.aBool7926 = false;
         }

         return this.aBool7926;
      }
   }

   void method7161(byte var1) {
   }

   public byte[] method446(int var1, byte var2) {
      if(this.anInterface69_7925 != null) {
         this.anInterface69_7925.method438(this, (byte)-71);
      }

      return this.aByteArray7920;
   }

   public int method480() {
      if(this.aClass192_7923 == null) {
         return 0;
      } else {
         int var1 = 0;
         Class192 var2 = this.aClass192_7923;
         synchronized(var2) {
            List var3 = this.method7164(1944801186);
            if(null != var3) {
               var1 = var3.size();
            }

            return var1;
         }
      }
   }

   public Class474 method448(int var1) {
      return Class474.aClass474_5365;
   }

   public int method449(byte var1) {
      return -1922129577 * this.anInt7922;
   }

   public void method450(RSByteBuffer var1, int var2) {
      if(null != this.aClass192_7923) {
         if(this.anInterface69_7925 != null) {
            this.anInterface69_7925.method438(this, (byte)-1);
         }

         if(this.aBool7926) {
            throw new RuntimeException("");
         } else {
            Class192 var3 = this.aClass192_7923;
            synchronized(var3) {
               List var4 = this.method7164(1553141519);
               if(null != var4) {
                  var4.add(var1);
                  this.anInt7928 += -2082344127 * var1.buffer.length;
                  this.method7162(var4, -2090033983 * this.anInt7928, (byte)-73);
               }

            }
         }
      }
   }

   public void method481(boolean var1) {
      if(this.anInterface69_7925 != null) {
         this.anInterface69_7925.method438(this, (byte)-89);
      }

      this.aBool7926 = var1;
   }

   public Class609(Class466 var1, int var2, Class361 var3, Interface69 var4, Class192 var5) {
      this.aClass590_7921 = Class590.aClass590_7804;
      this.aClass466_7924 = var1;
      this.anInt7922 = -1458578841 * var2;
      this.aClass361_7927 = var3;
      this.anInterface69_7925 = var4;
      this.aClass192_7923 = var5;
      this.aBool7929 = null != this.aClass192_7923;
      this.aClass590_7921 = Class590.aClass590_7803;
   }

   public RSByteBuffer method451(int var1, byte var2) {
      if(this.aClass192_7923 == null) {
         return null;
      } else {
         RSByteBuffer var3 = null;
         if(null != this.anInterface69_7925) {
            this.anInterface69_7925.method438(this, (byte)-21);
         }

         Class192 var4 = this.aClass192_7923;
         synchronized(var4) {
            List var5 = this.method7164(1899013620);
            if(var5.size() > var1) {
               var3 = (RSByteBuffer)var5.get(var1);
            }

            return var3;
         }
      }
   }

   public int method26(int var1) {
      if(this.aClass192_7923 == null) {
         return 0;
      } else {
         int var2 = 0;
         Class192 var3 = this.aClass192_7923;
         synchronized(var3) {
            List var4 = this.method7164(2036933396);
            if(null != var4) {
               var2 = var4.size();
            }

            return var2;
         }
      }
   }

   public void method453(boolean var1, int var2) {
      if(this.anInterface69_7925 != null) {
         this.anInterface69_7925.method438(this, (byte)-37);
      }

      this.aBool7926 = var1;
   }

   public boolean method477() {
      return this.aClass192_7923 != null && this.aBool7929;
   }

   void method7162(List var1, int var2, byte var3) {
      if(null != this.aClass192_7923 && var1 != null && var2 >= 0) {
         Class192 var4 = this.aClass192_7923;
         synchronized(var4) {
            this.aClass192_7923.method2766((long)(this.anInt7922 * -1922129577));
            if(var2 <= this.aClass192_7923.method2771(-362872013)) {
               this.aClass192_7923.method2781(var1, (long)(this.anInt7922 * -1922129577), var2, (byte)-99);
            } else {
               this.aBool7929 = false;
               this.aBool7926 = false;
               this.anInt7928 = 0;
            }

         }
      }
   }

   public void method208() {
      if(this.aClass590_7921 == Class590.aClass590_7803) {
         byte[] var1 = this.aClass466_7924.method5541(this.anInt7922 * -1922129577, 16777472);
         if(null != var1) {
            this.aByteArray7920 = var1;
            this.method7161((byte)-8);
            this.aClass590_7921 = Class590.aClass590_7805;
            if(null != this.anInterface69_7925) {
               this.anInterface69_7925.method440(this, var1.length, -1922129577 * this.anInt7922, false, -716123080);
            }
         }
      }

   }

   public void method212() {
      if(this.aClass590_7921 == Class590.aClass590_7803) {
         byte[] var1 = this.aClass466_7924.method5541(this.anInt7922 * -1922129577, 16777472);
         if(null != var1) {
            this.aByteArray7920 = var1;
            this.method7161((byte)3);
            this.aClass590_7921 = Class590.aClass590_7805;
            if(null != this.anInterface69_7925) {
               this.anInterface69_7925.method440(this, var1.length, -1922129577 * this.anInt7922, false, -1374726334);
            }
         }
      }

   }

   public boolean method472(byte var1) {
      return this.aClass192_7923 != null && this.aBool7929;
   }

   public Class590 method463() {
      return this.aClass590_7921;
   }

   public Class482 method457() {
      Class482 var1 = new Class482(this.aClass361_7927);
      var1.method5811(this, (byte)-78);
      return var1;
   }

   public Class482 method458() {
      Class482 var1 = new Class482(this.aClass361_7927);
      var1.method5811(this, (byte)-51);
      return var1;
   }

   public Class482 method447() {
      Class482 var1 = new Class482(this.aClass361_7927);
      var1.method5811(this, (byte)-60);
      return var1;
   }

   public Class590 method460() {
      return this.aClass590_7921;
   }

   public void method483(boolean var1) {
      if(this.anInterface69_7925 != null) {
         this.anInterface69_7925.method438(this, (byte)10);
      }

      this.aBool7926 = var1;
   }

   public Class590 method473() {
      return this.aClass590_7921;
   }

   public Class482 method474(byte var1) {
      Class482 var2 = new Class482(this.aClass361_7927);
      var2.method5811(this, (byte)-35);
      return var2;
   }

   public boolean method464() {
      return false;
   }

   void method7163() {
   }

   public int method478() {
      if(this.aClass192_7923 == null) {
         return 0;
      } else {
         int var1 = 0;
         Class192 var2 = this.aClass192_7923;
         synchronized(var2) {
            List var3 = this.method7164(1051333788);
            if(null != var3) {
               var1 = var3.size();
            }

            return var1;
         }
      }
   }

   public int method466() {
      return this.aByteArray7920 != null?this.aByteArray7920.length:0;
   }

   public Class474 method467() {
      return Class474.aClass474_5365;
   }

   public int method452() {
      return -1922129577 * this.anInt7922;
   }

   public int method469() {
      return -1922129577 * this.anInt7922;
   }

   public byte[] method461(int var1) {
      if(this.anInterface69_7925 != null) {
         this.anInterface69_7925.method438(this, (byte)36);
      }

      return this.aByteArray7920;
   }

   public void method471(RSByteBuffer var1) {
      if(null != this.aClass192_7923) {
         if(this.anInterface69_7925 != null) {
            this.anInterface69_7925.method438(this, (byte)-17);
         }

         if(this.aBool7926) {
            throw new RuntimeException("");
         } else {
            Class192 var2 = this.aClass192_7923;
            synchronized(var2) {
               List var3 = this.method7164(1686006862);
               if(null != var3) {
                  var3.add(var1);
                  this.anInt7928 += -2082344127 * var1.buffer.length;
                  this.method7162(var3, -2090033983 * this.anInt7928, (byte)-113);
               }

            }
         }
      }
   }

   public RSByteBuffer method486(int var1) {
      if(this.aClass192_7923 == null) {
         return null;
      } else {
         RSByteBuffer var2 = null;
         if(null != this.anInterface69_7925) {
            this.anInterface69_7925.method438(this, (byte)-43);
         }

         Class192 var3 = this.aClass192_7923;
         synchronized(var3) {
            List var4 = this.method7164(780388441);
            if(var4.size() > var1) {
               var2 = (RSByteBuffer)var4.get(var1);
            }

            return var2;
         }
      }
   }

   public int method456(byte var1) {
      return this.aByteArray7920 != null?this.aByteArray7920.length:0;
   }

   public RSByteBuffer method455(int var1) {
      if(this.aClass192_7923 == null) {
         return null;
      } else {
         RSByteBuffer var2 = null;
         if(null != this.anInterface69_7925) {
            this.anInterface69_7925.method438(this, (byte)28);
         }

         Class192 var3 = this.aClass192_7923;
         synchronized(var3) {
            List var4 = this.method7164(1317499274);
            if(var4.size() > var1) {
               var2 = (RSByteBuffer)var4.get(var1);
            }

            return var2;
         }
      }
   }

   public boolean method475(int var1) {
      if(null == this.aClass192_7923) {
         return false;
      } else {
         boolean var2 = false;
         Class192 var3 = this.aClass192_7923;
         synchronized(var3) {
            List var4 = this.method7164(1604473310);
            if(var4 != null && var4.size() > var1) {
               var2 = var4.get(var1) != null;
            }

            return var2;
         }
      }
   }

   List method7164(int var1) {
      if(null != this.aClass192_7923 && this.aBool7929) {
         Object var2 = null;
         Class192 var3 = this.aClass192_7923;
         synchronized(var3) {
            var2 = (List)this.aClass192_7923.method2765((long)(-1922129577 * this.anInt7922));
            if(null == var2 && this.aBool7929) {
               var2 = new ArrayList();
               this.aClass192_7923.method2781(var2, (long)(this.anInt7922 * -1922129577), 0, (byte)18);
            }

            return (List)var2;
         }
      } else {
         return null;
      }
   }

   public Class482 method444() {
      Class482 var1 = new Class482(this.aClass361_7927);
      var1.method5811(this, (byte)-115);
      return var1;
   }

   public void method470(RSByteBuffer var1) {
      if(null != this.aClass192_7923) {
         if(this.anInterface69_7925 != null) {
            this.anInterface69_7925.method438(this, (byte)-21);
         }

         if(this.aBool7926) {
            throw new RuntimeException("");
         } else {
            Class192 var2 = this.aClass192_7923;
            synchronized(var2) {
               List var3 = this.method7164(1804733167);
               if(null != var3) {
                  var3.add(var1);
                  this.anInt7928 += -2082344127 * var1.buffer.length;
                  this.method7162(var3, -2090033983 * this.anInt7928, (byte)-101);
               }

            }
         }
      }
   }

   public int method479() {
      if(this.aClass192_7923 == null) {
         return 0;
      } else {
         int var1 = 0;
         Class192 var2 = this.aClass192_7923;
         synchronized(var2) {
            List var3 = this.method7164(1628510263);
            if(null != var3) {
               var1 = var3.size();
            }

            return var1;
         }
      }
   }

   public boolean method476(int var1) {
      if(null == this.aClass192_7923) {
         return false;
      } else {
         boolean var2 = false;
         Class192 var3 = this.aClass192_7923;
         synchronized(var3) {
            List var4 = this.method7164(803745994);
            if(var4 != null && var4.size() > var1) {
               var2 = var4.get(var1) != null;
            }

            return var2;
         }
      }
   }

   public void method484(boolean var1) {
      if(this.anInterface69_7925 != null) {
         this.anInterface69_7925.method438(this, (byte)16);
      }

      this.aBool7926 = var1;
   }

   public void method445(byte var1) {
      if(this.aClass590_7921 == Class590.aClass590_7803) {
         byte[] var2 = this.aClass466_7924.method5541(this.anInt7922 * -1922129577, 16777472);
         if(null != var2) {
            this.aByteArray7920 = var2;
            this.method7161((byte)-32);
            this.aClass590_7921 = Class590.aClass590_7805;
            if(null != this.anInterface69_7925) {
               this.anInterface69_7925.method440(this, var2.length, -1922129577 * this.anInt7922, false, -2104216623);
            }
         }
      }

   }

   public Class590 method468() {
      return this.aClass590_7921;
   }

   public boolean method442() {
      if(this.aClass192_7923 == null) {
         return false;
      } else {
         List var1 = this.method7164(853148191);
         if(null == var1 || var1.size() <= 0) {
            this.aBool7926 = false;
         }

         return this.aBool7926;
      }
   }

   public boolean method485() {
      if(this.aClass192_7923 == null) {
         return false;
      } else {
         List var1 = this.method7164(1184269778);
         if(null == var1 || var1.size() <= 0) {
            this.aBool7926 = false;
         }

         return this.aBool7926;
      }
   }

   public boolean method459() {
      if(this.aClass192_7923 == null) {
         return false;
      } else {
         List var1 = this.method7164(1404846313);
         if(null == var1 || var1.size() <= 0) {
            this.aBool7926 = false;
         }

         return this.aBool7926;
      }
   }

   static final void method7165(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Character.toUpperCase((char)var2);
   }

   static final void method7166(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.publicChatStatus * -500237127;
   }

   static final void method7167(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub18 var3 = Class622.aClass455_8143.method5398(var2, (byte)50);
      if(null == var3.anIntArray11851) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anIntArray11851.length;
      }

   }

   static final void method7168(Class681 var0, int var1) throws Exception_Sub2 {
      Class195.aClass292_Sub1_2182.method3894((float)var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] / 1000.0F, (byte)-26);
   }

   public static int method7169(int var0, int var1) {
      Class570.aTwitchWebcamFrameData7647 = null;
      Class570.aClass153_7642 = null;
      return var0 >= 0 && var0 < Class570.aTwitchWebcamDeviceArray7653.length?Class570.aTwitchTV7639.StopWebcamDevice(-17931217 * Class570.aTwitchWebcamDeviceArray7653[var0].anInt1138):-1;
   }

   static Class37_Sub1 method7170(byte var0) {
      Class37_Sub1 var1 = new Class37_Sub1();
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      if(Class222.aString2308.startsWith("win")) {
         var3 = true;
         var2 = true;
         var4 = true;
      } else {
         var2 = true;
         var4 = true;
      }

      if(Class104.aBool1283) {
         var1.method9568(16, (short)-20329);
         var2 = false;
      }

      if(Class104.aBool1288) {
         var1.method9568(32, (short)2619);
         var3 = false;
      }

      if(Class104.aBool1280) {
         var1.method9568(16384, (short)-4448);
         var4 = false;
      }

      if(!var2 && !var3) {
         Class508.method6162(var1, (byte)-119);
         return var1;
      } else {
         int var5 = -1;
         int var6 = -1;
         int var7 = -1;
         if(var3) {
            try {
               Class230.preferences.method9602(Class230.preferences.aClass711_Sub40_10649, 3, (short)-8805);
               Class522.method6257(-1042127423);
               var6 = Class52.method966(3, 1000, 378095311);
               if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-95) == 3) {
                  var1.method9568(4, (short)-24444);
                  Class157 var8 = Class554.aClass174_7475.method2502();
                  long var9 = 1287546980716738269L * var8.aLong1758 & 281474976710655L;
                  boolean var11;
                  switch(-249614805 * var8.anInt1754) {
                  case 4098:
                     var11 = var9 >= 60129613779L;
                     var2 &= var11;
                     if(!var11) {
                        var1.method9568(512, (short)21898);
                     }
                     break;
                  case 4318:
                     var11 = var9 >= 64425238954L;
                     var2 &= var11;
                     if(!var11) {
                        var1.method9568(256, (short)4866);
                     }
                  }
               }
            } catch (Exception var14) {
               var1.method9568(4096, (short)-26077);
            }
         }

         if(var4) {
            try {
               Class230.preferences.method9602(Class230.preferences.aClass711_Sub40_10649, 5, (short)-13981);
               Class522.method6257(-1042127423);
               var7 = Class52.method966(5, 1000, 378095311);
               if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-98) == 5) {
                  var1.method9568(8192, (short)9599);
               }
            } catch (Exception var13) {
               var1.method9568('\u8000', (short)16722);
            }
         }

         if(var2) {
            try {
               Class230.preferences.method9602(Class230.preferences.aClass711_Sub40_10649, 4, (short)-4023);
               Class522.method6257(-1042127423);
               var5 = Class52.method966(1, 1000, 378095311);
               if(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-28) == 1) {
                  var1.method9568(2, (short)-17254);
               }
            } catch (Exception var12) {
               var1.method9568(2048, (short)2521);
            }
         }

         Class230.preferences.method9602(Class230.preferences.aClass711_Sub40_10649, 0, (short)-22115);
         if(-1 == var5 && var6 == -1) {
            Class508.method6162(var1, (byte)-90);
            return var1;
         } else {
            var1.method9570(3, var6, 1408565995);
            var1.method9570(1, var5, 902160459);
            var1.method9570(5, var7, 968063851);
            var6 = (int)((float)var6 * 1.3F);
            if((var6 <= 100000 || var5 <= 100000) && var6 <= var5) {
               Class16.method620(var1, 1, -1 == var6?var5:var6, -1987293529);
            } else {
               Class16.method620(var1, 3, var5 == -1?var6:var5, -615914692);
            }

            return var1;
         }
      }
   }
}
