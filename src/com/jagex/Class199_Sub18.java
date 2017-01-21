package com.jagex;

import com.jagex.Class157;
import com.jagex.Class199;
import com.jagex.Class206;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class299;
import com.jagex.Class325_Sub2;
import com.jagex.Class388;
import com.jagex.Class446;
import com.jagex.Class521;
import com.jagex.Class526_Sub21_Sub4;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class567;
import com.jagex.Class581_Sub1;
import com.jagex.Class588;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub4;
import com.jagex.Class645;
import com.jagex.Class670;
import com.jagex.Class681;
import com.jagex.Class689;
import com.jagex.Class692;
import com.jagex.Class93;
import com.jagex.client;

public class Class199_Sub18 extends Class199 {
   static final int anInt9959 = 1;
   static final int anInt9962 = 0;
   int anInt9953;
   int anInt9955;
   int anInt9952;
   int anInt9949;
   int anInt9958;
   int anInt9963;
   int anInt9951;
   int anInt9960;
   int anInt9956;
   int anInt9957;
   int anInt9961;
   int anInt9954;
   int anInt9950;

   public void method2856() {
      int var1;
      int var2;
      int var3;
      Class639_Sub1_Sub2_Sub1 var4;
      Class446 var5;
      if(782457123 * this.anInt9953 >= 0) {
         var1 = 256 + this.anInt9953 * 1186088448;
         var2 = 256 + this.anInt9955 * 1874271744;
         var3 = this.anInt9951 * 329893903;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9952 * 2056964141].method2913((byte)43);
         var5 = var4.method7635().aClass446_4816;
         var1 = (int)var5.aFloat4917;
         var2 = (int)var5.aFloat4919;
         var3 = var4.aByte10827;
      }

      int var6;
      int var7;
      if(this.anInt9955 * -1539843185 >= 0) {
         var6 = this.anInt9949 * -527564288 + 256;
         var7 = 256 + this.anInt9958 * 828989952;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9963 * -306996639].method2913((byte)49);
         var5 = var4.method7635().aClass446_4816;
         var6 = (int)var5.aFloat4917;
         var7 = (int)var5.aFloat4919;
         if(var3 < 0) {
            var3 = var4.aByte10827;
         }
      }

      int var8 = this.anInt9950 * 810871001 << 2;
      Class639_Sub1_Sub2_Sub4 var9 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(-576348207), 662257429 * this.anInt9960, var3, var3, var1, var2, -233630571 * this.anInt9956 << 2, client.anInt11012, -917226589 * this.anInt9961 + client.anInt11012, this.anInt9954 * 2066799381, var8, this.anInt9952 * 2056964141 + 1, 1 + this.anInt9963 * -306996639, this.anInt9957 * -653253623 << 2, false, 0, 0);
      var9.method10925(var6, var7, this.anInt9957 * -653253623 << 2, this.anInt9961 * -917226589 + client.anInt11012, 921169372);
      client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var9), -953608972);
   }

   public void method2855() {
      int var1;
      int var2;
      int var3;
      Class639_Sub1_Sub2_Sub1 var4;
      Class446 var5;
      if(782457123 * this.anInt9953 >= 0) {
         var1 = 256 + this.anInt9953 * 1186088448;
         var2 = 256 + this.anInt9955 * 1874271744;
         var3 = this.anInt9951 * 329893903;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9952 * 2056964141].method2913((byte)106);
         var5 = var4.method7635().aClass446_4816;
         var1 = (int)var5.aFloat4917;
         var2 = (int)var5.aFloat4919;
         var3 = var4.aByte10827;
      }

      int var6;
      int var7;
      if(this.anInt9955 * -1539843185 >= 0) {
         var6 = this.anInt9949 * -527564288 + 256;
         var7 = 256 + this.anInt9958 * 828989952;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9963 * -306996639].method2913((byte)51);
         var5 = var4.method7635().aClass446_4816;
         var6 = (int)var5.aFloat4917;
         var7 = (int)var5.aFloat4919;
         if(var3 < 0) {
            var3 = var4.aByte10827;
         }
      }

      int var8 = this.anInt9950 * 810871001 << 2;
      Class639_Sub1_Sub2_Sub4 var9 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(-803692339), 662257429 * this.anInt9960, var3, var3, var1, var2, -233630571 * this.anInt9956 << 2, client.anInt11012, -917226589 * this.anInt9961 + client.anInt11012, this.anInt9954 * 2066799381, var8, this.anInt9952 * 2056964141 + 1, 1 + this.anInt9963 * -306996639, this.anInt9957 * -653253623 << 2, false, 0, 0);
      var9.method10925(var6, var7, this.anInt9957 * -653253623 << 2, this.anInt9961 * -917226589 + client.anInt11012, -48265905);
      client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var9), -1518460317);
   }

   boolean method2853(byte var1) {
      Class670 var2 = (Class670)Class689.aClass40_Sub12_8692.method89(662257429 * this.anInt9960, 21765041);
      boolean var3 = var2.method7966(470774803);
      Class206 var4 = (Class206)Class388.aClass40_Sub15_4063.method89(var2.anInt8550 * 1305328919, -1896755061);
      var3 &= var4.method2900(404092416);
      return var3;
   }

   boolean method2860() {
      Class670 var1 = (Class670)Class689.aClass40_Sub12_8692.method89(662257429 * this.anInt9960, -1875609047);
      boolean var2 = var1.method7966(470774803);
      Class206 var3 = (Class206)Class388.aClass40_Sub15_4063.method89(var1.anInt8550 * 1305328919, 367080619);
      var2 &= var3.method2900(404092416);
      return var2;
   }

   Class199_Sub18(RSByteBuffer var1, int var2, int var3) {
      super(var1);
      int var4;
      if(var2 == 0) {
         var4 = var1.readInt((byte)5);
         this.anInt9953 = (var4 >>> 16) * -424042869;
         this.anInt9955 = (var4 & '\uffff') * -831986833;
         this.anInt9952 = 1637169243;
      } else {
         this.anInt9953 = 424042869;
         this.anInt9955 = 831986833;
         this.anInt9952 = var1.readUnsignedShort(1226812195) * -1637169243;
      }

      if(0 == var3) {
         var4 = var1.readInt((byte)5);
         this.anInt9949 = (var4 >>> 16) * 1707129089;
         this.anInt9958 = -1075768239 * (var4 & '\uffff');
         this.anInt9963 = -120490401;
      } else {
         this.anInt9949 = -1707129089;
         this.anInt9958 = 1075768239;
         this.anInt9963 = var1.readUnsignedShort(462041068) * 120490401;
      }

      if(0 == var2 && var3 == 0) {
         this.anInt9951 = var1.readUnsignedByte(-1885738607) * -1770772753;
      } else {
         this.anInt9951 = 1770772753;
      }

      this.anInt9960 = var1.readUnsignedShort(325691690) * -1914038211;
      this.anInt9956 = var1.readUnsignedByte(793634131) * 1565595325;
      this.anInt9957 = var1.readUnsignedByte(-1221393276) * 975874617;
      this.anInt9961 = var1.read24BitInt(742041327) * -1842360309;
      this.anInt9954 = var1.readUnsignedShort(561094034) * -886072259;
      this.anInt9950 = var1.readUnsignedByte(480256776) * 1571362665;
   }

   boolean method2862() {
      Class670 var1 = (Class670)Class689.aClass40_Sub12_8692.method89(662257429 * this.anInt9960, -1269970229);
      boolean var2 = var1.method7966(470774803);
      Class206 var3 = (Class206)Class388.aClass40_Sub15_4063.method89(var1.anInt8550 * 1305328919, 276243133);
      var2 &= var3.method2900(404092416);
      return var2;
   }

   public void method2857() {
      int var1;
      int var2;
      int var3;
      Class639_Sub1_Sub2_Sub1 var4;
      Class446 var5;
      if(782457123 * this.anInt9953 >= 0) {
         var1 = 256 + this.anInt9953 * 1186088448;
         var2 = 256 + this.anInt9955 * 1874271744;
         var3 = this.anInt9951 * 329893903;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9952 * 2056964141].method2913((byte)36);
         var5 = var4.method7635().aClass446_4816;
         var1 = (int)var5.aFloat4917;
         var2 = (int)var5.aFloat4919;
         var3 = var4.aByte10827;
      }

      int var6;
      int var7;
      if(this.anInt9955 * -1539843185 >= 0) {
         var6 = this.anInt9949 * -527564288 + 256;
         var7 = 256 + this.anInt9958 * 828989952;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9963 * -306996639].method2913((byte)70);
         var5 = var4.method7635().aClass446_4816;
         var6 = (int)var5.aFloat4917;
         var7 = (int)var5.aFloat4919;
         if(var3 < 0) {
            var3 = var4.aByte10827;
         }
      }

      int var8 = this.anInt9950 * 810871001 << 2;
      Class639_Sub1_Sub2_Sub4 var9 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(2047743189), 662257429 * this.anInt9960, var3, var3, var1, var2, -233630571 * this.anInt9956 << 2, client.anInt11012, -917226589 * this.anInt9961 + client.anInt11012, this.anInt9954 * 2066799381, var8, this.anInt9952 * 2056964141 + 1, 1 + this.anInt9963 * -306996639, this.anInt9957 * -653253623 << 2, false, 0, 0);
      var9.method10925(var6, var7, this.anInt9957 * -653253623 << 2, this.anInt9961 * -917226589 + client.anInt11012, 1014058539);
      client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var9), -1743903928);
   }

   public void method2858() {
      int var1;
      int var2;
      int var3;
      Class639_Sub1_Sub2_Sub1 var4;
      Class446 var5;
      if(782457123 * this.anInt9953 >= 0) {
         var1 = 256 + this.anInt9953 * 1186088448;
         var2 = 256 + this.anInt9955 * 1874271744;
         var3 = this.anInt9951 * 329893903;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9952 * 2056964141].method2913((byte)79);
         var5 = var4.method7635().aClass446_4816;
         var1 = (int)var5.aFloat4917;
         var2 = (int)var5.aFloat4919;
         var3 = var4.aByte10827;
      }

      int var6;
      int var7;
      if(this.anInt9955 * -1539843185 >= 0) {
         var6 = this.anInt9949 * -527564288 + 256;
         var7 = 256 + this.anInt9958 * 828989952;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9963 * -306996639].method2913((byte)80);
         var5 = var4.method7635().aClass446_4816;
         var6 = (int)var5.aFloat4917;
         var7 = (int)var5.aFloat4919;
         if(var3 < 0) {
            var3 = var4.aByte10827;
         }
      }

      int var8 = this.anInt9950 * 810871001 << 2;
      Class639_Sub1_Sub2_Sub4 var9 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(-1040515059), 662257429 * this.anInt9960, var3, var3, var1, var2, -233630571 * this.anInt9956 << 2, client.anInt11012, -917226589 * this.anInt9961 + client.anInt11012, this.anInt9954 * 2066799381, var8, this.anInt9952 * 2056964141 + 1, 1 + this.anInt9963 * -306996639, this.anInt9957 * -653253623 << 2, false, 0, 0);
      var9.method10925(var6, var7, this.anInt9957 * -653253623 << 2, this.anInt9961 * -917226589 + client.anInt11012, -1207086310);
      client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var9), -1107353332);
   }

   public void method2859() {
      int var1;
      int var2;
      int var3;
      Class639_Sub1_Sub2_Sub1 var4;
      Class446 var5;
      if(782457123 * this.anInt9953 >= 0) {
         var1 = 256 + this.anInt9953 * 1186088448;
         var2 = 256 + this.anInt9955 * 1874271744;
         var3 = this.anInt9951 * 329893903;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9952 * 2056964141].method2913((byte)127);
         var5 = var4.method7635().aClass446_4816;
         var1 = (int)var5.aFloat4917;
         var2 = (int)var5.aFloat4919;
         var3 = var4.aByte10827;
      }

      int var6;
      int var7;
      if(this.anInt9955 * -1539843185 >= 0) {
         var6 = this.anInt9949 * -527564288 + 256;
         var7 = 256 + this.anInt9958 * 828989952;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9963 * -306996639].method2913((byte)53);
         var5 = var4.method7635().aClass446_4816;
         var6 = (int)var5.aFloat4917;
         var7 = (int)var5.aFloat4919;
         if(var3 < 0) {
            var3 = var4.aByte10827;
         }
      }

      int var8 = this.anInt9950 * 810871001 << 2;
      Class639_Sub1_Sub2_Sub4 var9 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(1623278864), 662257429 * this.anInt9960, var3, var3, var1, var2, -233630571 * this.anInt9956 << 2, client.anInt11012, -917226589 * this.anInt9961 + client.anInt11012, this.anInt9954 * 2066799381, var8, this.anInt9952 * 2056964141 + 1, 1 + this.anInt9963 * -306996639, this.anInt9957 * -653253623 << 2, false, 0, 0);
      var9.method10925(var6, var7, this.anInt9957 * -653253623 << 2, this.anInt9961 * -917226589 + client.anInt11012, 1324631884);
      client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var9), -693813670);
   }

   public void method2861() {
      int var1;
      int var2;
      int var3;
      Class639_Sub1_Sub2_Sub1 var4;
      Class446 var5;
      if(782457123 * this.anInt9953 >= 0) {
         var1 = 256 + this.anInt9953 * 1186088448;
         var2 = 256 + this.anInt9955 * 1874271744;
         var3 = this.anInt9951 * 329893903;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9952 * 2056964141].method2913((byte)73);
         var5 = var4.method7635().aClass446_4816;
         var1 = (int)var5.aFloat4917;
         var2 = (int)var5.aFloat4919;
         var3 = var4.aByte10827;
      }

      int var6;
      int var7;
      if(this.anInt9955 * -1539843185 >= 0) {
         var6 = this.anInt9949 * -527564288 + 256;
         var7 = 256 + this.anInt9958 * 828989952;
      } else {
         var4 = Class645.aClass207Array8445[this.anInt9963 * -306996639].method2913((byte)7);
         var5 = var4.method7635().aClass446_4816;
         var6 = (int)var5.aFloat4917;
         var7 = (int)var5.aFloat4919;
         if(var3 < 0) {
            var3 = var4.aByte10827;
         }
      }

      int var8 = this.anInt9950 * 810871001 << 2;
      Class639_Sub1_Sub2_Sub4 var9 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(-775392016), 662257429 * this.anInt9960, var3, var3, var1, var2, -233630571 * this.anInt9956 << 2, client.anInt11012, -917226589 * this.anInt9961 + client.anInt11012, this.anInt9954 * 2066799381, var8, this.anInt9952 * 2056964141 + 1, 1 + this.anInt9963 * -306996639, this.anInt9957 * -653253623 << 2, false, 0, 0);
      var9.method10925(var6, var7, this.anInt9957 * -653253623 << 2, this.anInt9961 * -917226589 + client.anInt11012, -2041349917);
      client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var9), -1443430138);
   }

   boolean method2851() {
      Class670 var1 = (Class670)Class689.aClass40_Sub12_8692.method89(662257429 * this.anInt9960, 265188202);
      boolean var2 = var1.method7966(470774803);
      Class206 var3 = (Class206)Class388.aClass40_Sub15_4063.method89(var1.anInt8550 * 1305328919, -2144205224);
      var2 &= var3.method2900(404092416);
      return var2;
   }

   public void method2852(byte var1) {
      int var2;
      int var3;
      int var4;
      Class639_Sub1_Sub2_Sub1 var5;
      Class446 var6;
      if(782457123 * this.anInt9953 >= 0) {
         var2 = 256 + this.anInt9953 * 1186088448;
         var3 = 256 + this.anInt9955 * 1874271744;
         var4 = this.anInt9951 * 329893903;
      } else {
         var5 = Class645.aClass207Array8445[this.anInt9952 * 2056964141].method2913((byte)68);
         var6 = var5.method7635().aClass446_4816;
         var2 = (int)var6.aFloat4917;
         var3 = (int)var6.aFloat4919;
         var4 = var5.aByte10827;
      }

      int var7;
      int var8;
      if(this.anInt9955 * -1539843185 >= 0) {
         var7 = this.anInt9949 * -527564288 + 256;
         var8 = 256 + this.anInt9958 * 828989952;
      } else {
         var5 = Class645.aClass207Array8445[this.anInt9963 * -306996639].method2913((byte)37);
         var6 = var5.method7635().aClass446_4816;
         var7 = (int)var6.aFloat4917;
         var8 = (int)var6.aFloat4919;
         if(var4 < 0) {
            var4 = var5.aByte10827;
         }
      }

      int var9 = this.anInt9950 * 810871001 << 2;
      Class639_Sub1_Sub2_Sub4 var10 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(-1088402759), 662257429 * this.anInt9960, var4, var4, var2, var3, -233630571 * this.anInt9956 << 2, client.anInt11012, -917226589 * this.anInt9961 + client.anInt11012, this.anInt9954 * 2066799381, var9, this.anInt9952 * 2056964141 + 1, 1 + this.anInt9963 * -306996639, this.anInt9957 * -653253623 << 2, false, 0, 0);
      var10.method10925(var7, var8, this.anInt9957 * -653253623 << 2, this.anInt9961 * -917226589 + client.anInt11012, 1384386853);
      client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var10), -228493089);
   }

   static final void method9025(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= 1137575874;
      var0.anInt2649 = var2.anIntArray8622[-1730576285 * var2.anInt8623] * 2013587751;
      var0.anInt2543 = var2.anIntArray8622[var2.anInt8623 * -1730576285 + 1] * 1781719489;
      var0.anInt2544 = var2.anIntArray8622[2 + var2.anInt8623 * -1730576285] * -1464212961;
      var0.anInt2545 = var2.anIntArray8622[var2.anInt8623 * -1730576285 + 3] * -2106415021;
      var0.anInt2546 = var2.anIntArray8622[4 + var2.anInt8623 * -1730576285] * 1800270449;
      var0.anInt2550 = -1016726723 * var2.anIntArray8622[-1730576285 * var2.anInt8623 + 5];
      Class526_Sub31.method9555(var0, (byte)10);
      if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
         Class567.method6821(var0.uid * 919258769, (byte)17);
         Class93.method1218(var0.uid * 919258769, (byte)-102);
      }

   }

   public static final void method9026(byte var0) {
      int var1 = Class230.preferences.aClass711_Sub18_10627.method10015(28060436);
      if(var1 == 0) {
         client.aClass505_11204.method6070((byte[][][])null, (byte)-22);
         Class521.method6254(0, -1299097489);
      } else if(1 != var1 && 3 != var1) {
         Class325_Sub2.method9069((byte)(1242714411 * client.anInt11126 - 4 & 255), 1867211412);
         Class521.method6254(2, -1299097489);
      } else {
         Class325_Sub2.method9069((byte)0, 1876665447);
         Class521.method6254(512, -1299097489);
         if(client.aClass505_11204.method6072(-1115412114) != null) {
            Class581_Sub1.method9725((byte)-80);
         }
      }

      client.anInt11141 = Class692.anInt8703 * -1321919813;
   }

   public static String method9027(int var0) {
      return Class299.method3990("www", false, (byte)0);
   }

   static final void method9028(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class157.method1865(var2, var3, var4, true, -663103989);
   }

   static Class588[] method9029(byte var0) {
      return new Class588[]{Class588.aClass588_7801, Class588.aClass588_7799, Class588.aClass588_7798};
   }

   public static void method9030(int var0, int var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(6, (long)var0);
      var2.method10583((byte)-60);
   }
}
