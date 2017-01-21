package com.jagex;

import com.jagex.Class143;
import com.jagex.Class171;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class292_Sub1;
import com.jagex.Class315_Sub1;
import com.jagex.Class329_Sub1;
import com.jagex.Class331;
import com.jagex.Class382;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class411;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class493;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class539_Sub6;
import com.jagex.RenderDef;
import com.jagex.Class581;
import com.jagex.Class596;
import com.jagex.Class632;
import com.jagex.Class653;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class689_Sub2;
import com.jagex.Class711_Sub33;
import com.jagex.Class8;
import com.jagex.Exception_Sub2;
import com.jagex.client;

public class Class43 {
   static boolean aBool457 = false;
   static Class292_Sub1 aClass292_Sub1_458;
   static int anInt456;

   static boolean method901() {
      return aBool457;
   }

   static boolean method902() {
      return aBool457;
   }

   static void method903() {
      aClass292_Sub1_458 = null;
      aBool457 = false;
   }

   static void method904() {
      aClass292_Sub1_458 = null;
      aBool457 = false;
   }

   Class43() throws Throwable {
      throw new Error();
   }

   static void method905() {
      Class329_Sub1 var0 = (Class329_Sub1)aClass292_Sub1_458.method3941(114166659);
      Class689_Sub2 var1 = (Class689_Sub2)aClass292_Sub1_458.method3938((byte)83);
      Class446 var2 = var0.method4204(-1322185741);
      Class440 var3 = var1.method10208((byte)28);
      if(client.aClass245_11194 != null) {
         int var4 = client.aClass245_11194.anInt2510 * -99858407;
         int var5 = -667181623 * client.aClass245_11194.anInt2576;
         float var6 = 1000.0F;
         float var7 = (float)(2.0D * Math.atan((double)((float)var4 / 2.0F / var6)));
         float var8 = (float)(2.0D * Math.atan((double)((float)var5 / 2.0F / var6)));

         try {
            aClass292_Sub1_458.method3926(var7, var8, (byte)-40);
         } catch (Exception_Sub2 var10) {
            ;
         }
      }

      if(Class8.aClass547_45.method6547(1305328919)) {
         Class440 var11 = Class440.method5192();
         var11.method5193(1.0F, 0.0F, 0.0F, (float)(Class8.aClass547_45.method6531(-826325693) - -87662467 * Class632.anInt8238) / 200.0F);
         var3.method5194(var11);
         Class446 var13 = Class446.method5309(0.0F, 1.0F, 0.0F);
         var13.method5286(var3);
         Class440 var16 = Class440.method5192();
         var16.method5188(var13, (float)(-1754354777 * anInt456 - Class8.aClass547_45.method6534(633589542)) / 200.0F);
         var3.method5194(var16);
         var1.method10210(var3, 1960734086);
      }

      anInt456 = Class8.aClass547_45.method6534(1359894317) * -734049257;
      Class632.anInt8238 = Class8.aClass547_45.method6531(1779400498) * 979245269;
      var3.method5187();
      Class446 var12;
      if(Class171.aClass553_2016.method6666(98, 1489035948)) {
         var12 = Class446.method5309(0.0F, 0.0F, 25.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(99, 1972155380)) {
         var12 = Class446.method5309(0.0F, 0.0F, -25.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(96, 463963893)) {
         var12 = Class446.method5309(-25.0F, 0.0F, 0.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(97, 1479965188)) {
         var12 = Class446.method5309(25.0F, 0.0F, 0.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      Class526_Sub32 var15 = new Class526_Sub32(0, (int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919);
      var0.method9040(var15, -230490640);
      Class596 var14 = client.aClass505_11204.method6128(2105837136);
      int var17 = -814686591 * var14.localX << 9;
      int var18 = var14.localY * -845789331 << 9;
      aClass292_Sub1_458.method3905(0.02F, client.aClass505_11204.method6125(-2090247701).anIntArrayArrayArray5312, client.aClass505_11204.method6094((byte)-21), var17, var18, 2028386226);
   }

   static void method906() {
      Class329_Sub1 var0 = (Class329_Sub1)aClass292_Sub1_458.method3941(-1169482858);
      Class689_Sub2 var1 = (Class689_Sub2)aClass292_Sub1_458.method3938((byte)2);
      Class446 var2 = var0.method4204(-559097865);
      Class440 var3 = var1.method10208((byte)-30);
      if(client.aClass245_11194 != null) {
         int var4 = client.aClass245_11194.anInt2510 * -99858407;
         int var5 = -667181623 * client.aClass245_11194.anInt2576;
         float var6 = 1000.0F;
         float var7 = (float)(2.0D * Math.atan((double)((float)var4 / 2.0F / var6)));
         float var8 = (float)(2.0D * Math.atan((double)((float)var5 / 2.0F / var6)));

         try {
            aClass292_Sub1_458.method3926(var7, var8, (byte)-121);
         } catch (Exception_Sub2 var10) {
            ;
         }
      }

      if(Class8.aClass547_45.method6547(1305328919)) {
         Class440 var11 = Class440.method5192();
         var11.method5193(1.0F, 0.0F, 0.0F, (float)(Class8.aClass547_45.method6531(709765580) - -87662467 * Class632.anInt8238) / 200.0F);
         var3.method5194(var11);
         Class446 var13 = Class446.method5309(0.0F, 1.0F, 0.0F);
         var13.method5286(var3);
         Class440 var16 = Class440.method5192();
         var16.method5188(var13, (float)(-1754354777 * anInt456 - Class8.aClass547_45.method6534(-654831570)) / 200.0F);
         var3.method5194(var16);
         var1.method10210(var3, 1960734086);
      }

      anInt456 = Class8.aClass547_45.method6534(-799613429) * -734049257;
      Class632.anInt8238 = Class8.aClass547_45.method6531(237608776) * 979245269;
      var3.method5187();
      Class446 var12;
      if(Class171.aClass553_2016.method6666(98, 1101861550)) {
         var12 = Class446.method5309(0.0F, 0.0F, 25.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(99, 885789516)) {
         var12 = Class446.method5309(0.0F, 0.0F, -25.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(96, 429883979)) {
         var12 = Class446.method5309(-25.0F, 0.0F, 0.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(97, 1761644837)) {
         var12 = Class446.method5309(25.0F, 0.0F, 0.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      Class526_Sub32 var15 = new Class526_Sub32(0, (int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919);
      var0.method9040(var15, -2049692996);
      Class596 var14 = client.aClass505_11204.method6128(2061545067);
      int var17 = -814686591 * var14.localX << 9;
      int var18 = var14.localY * -845789331 << 9;
      aClass292_Sub1_458.method3905(0.02F, client.aClass505_11204.method6125(-2031026431).anIntArrayArrayArray5312, client.aClass505_11204.method6094((byte)43), var17, var18, 2028386226);
   }

   static void method907() {
      Class329_Sub1 var0 = (Class329_Sub1)aClass292_Sub1_458.method3941(1578308017);
      Class689_Sub2 var1 = (Class689_Sub2)aClass292_Sub1_458.method3938((byte)-18);
      Class446 var2 = var0.method4204(-1619096);
      Class440 var3 = var1.method10208((byte)-83);
      if(client.aClass245_11194 != null) {
         int var4 = client.aClass245_11194.anInt2510 * -99858407;
         int var5 = -667181623 * client.aClass245_11194.anInt2576;
         float var6 = 1000.0F;
         float var7 = (float)(2.0D * Math.atan((double)((float)var4 / 2.0F / var6)));
         float var8 = (float)(2.0D * Math.atan((double)((float)var5 / 2.0F / var6)));

         try {
            aClass292_Sub1_458.method3926(var7, var8, (byte)-28);
         } catch (Exception_Sub2 var10) {
            ;
         }
      }

      if(Class8.aClass547_45.method6547(1305328919)) {
         Class440 var11 = Class440.method5192();
         var11.method5193(1.0F, 0.0F, 0.0F, (float)(Class8.aClass547_45.method6531(-586701256) - -87662467 * Class632.anInt8238) / 200.0F);
         var3.method5194(var11);
         Class446 var13 = Class446.method5309(0.0F, 1.0F, 0.0F);
         var13.method5286(var3);
         Class440 var16 = Class440.method5192();
         var16.method5188(var13, (float)(-1754354777 * anInt456 - Class8.aClass547_45.method6534(2134704454)) / 200.0F);
         var3.method5194(var16);
         var1.method10210(var3, 1960734086);
      }

      anInt456 = Class8.aClass547_45.method6534(1937917912) * -734049257;
      Class632.anInt8238 = Class8.aClass547_45.method6531(-422015134) * 979245269;
      var3.method5187();
      Class446 var12;
      if(Class171.aClass553_2016.method6666(98, 977844040)) {
         var12 = Class446.method5309(0.0F, 0.0F, 25.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(99, 1775259130)) {
         var12 = Class446.method5309(0.0F, 0.0F, -25.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(96, 1225836671)) {
         var12 = Class446.method5309(-25.0F, 0.0F, 0.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(97, 815834601)) {
         var12 = Class446.method5309(25.0F, 0.0F, 0.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      Class526_Sub32 var15 = new Class526_Sub32(0, (int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919);
      var0.method9040(var15, -190865856);
      Class596 var14 = client.aClass505_11204.method6128(1953232033);
      int var17 = -814686591 * var14.localX << 9;
      int var18 = var14.localY * -845789331 << 9;
      aClass292_Sub1_458.method3905(0.02F, client.aClass505_11204.method6125(-2138393130).anIntArrayArrayArray5312, client.aClass505_11204.method6094((byte)81), var17, var18, 2028386226);
   }

   static void method908() {
      Class329_Sub1 var0 = (Class329_Sub1)aClass292_Sub1_458.method3941(1209821859);
      Class689_Sub2 var1 = (Class689_Sub2)aClass292_Sub1_458.method3938((byte)-43);
      Class446 var2 = var0.method4204(-1252696439);
      Class440 var3 = var1.method10208((byte)-3);
      if(client.aClass245_11194 != null) {
         int var4 = client.aClass245_11194.anInt2510 * -99858407;
         int var5 = -667181623 * client.aClass245_11194.anInt2576;
         float var6 = 1000.0F;
         float var7 = (float)(2.0D * Math.atan((double)((float)var4 / 2.0F / var6)));
         float var8 = (float)(2.0D * Math.atan((double)((float)var5 / 2.0F / var6)));

         try {
            aClass292_Sub1_458.method3926(var7, var8, (byte)-21);
         } catch (Exception_Sub2 var10) {
            ;
         }
      }

      if(Class8.aClass547_45.method6547(1305328919)) {
         Class440 var11 = Class440.method5192();
         var11.method5193(1.0F, 0.0F, 0.0F, (float)(Class8.aClass547_45.method6531(-465566355) - -87662467 * Class632.anInt8238) / 200.0F);
         var3.method5194(var11);
         Class446 var13 = Class446.method5309(0.0F, 1.0F, 0.0F);
         var13.method5286(var3);
         Class440 var16 = Class440.method5192();
         var16.method5188(var13, (float)(-1754354777 * anInt456 - Class8.aClass547_45.method6534(2106534443)) / 200.0F);
         var3.method5194(var16);
         var1.method10210(var3, 1960734086);
      }

      anInt456 = Class8.aClass547_45.method6534(1333098768) * -734049257;
      Class632.anInt8238 = Class8.aClass547_45.method6531(-530585892) * 979245269;
      var3.method5187();
      Class446 var12;
      if(Class171.aClass553_2016.method6666(98, 1495746829)) {
         var12 = Class446.method5309(0.0F, 0.0F, 25.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(99, 403931201)) {
         var12 = Class446.method5309(0.0F, 0.0F, -25.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(96, 655432647)) {
         var12 = Class446.method5309(-25.0F, 0.0F, 0.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      if(Class171.aClass553_2016.method6666(97, 391259242)) {
         var12 = Class446.method5309(25.0F, 0.0F, 0.0F);
         var12.method5286(var3);
         var12.aFloat4915 *= -1.0F;
         var2.method5272(var12);
      }

      Class526_Sub32 var15 = new Class526_Sub32(0, (int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919);
      var0.method9040(var15, 1507937766);
      Class596 var14 = client.aClass505_11204.method6128(1951172217);
      int var17 = -814686591 * var14.localX << 9;
      int var18 = var14.localY * -845789331 << 9;
      aClass292_Sub1_458.method3905(0.02F, client.aClass505_11204.method6125(-2128775476).anIntArrayArrayArray5312, client.aClass505_11204.method6094((byte)-98), var17, var18, 2028386226);
   }

   public static Class382 method909(RSByteBuffer var0, int var1) {
      String var2 = var0.readString(602479436);
      Class384 var3 = Class711_Sub33.method10141((byte)-1)[var0.readUnsignedByte(-1758795236)];
      Class389 var4 = Class331.method4251((byte)15)[var0.readUnsignedByte(555299155)];
      int var5 = var0.readShort((byte)1);
      int var6 = var0.readShort((byte)1);
      int var7 = var0.readUnsignedByte(-412844980);
      int var8 = var0.readUnsignedByte(1921710744);
      int var9 = var0.readUnsignedByte(2101060650);
      int var10 = var0.readUnsignedShort(2080568679);
      int var11 = var0.readUnsignedShort(354686710);
      int var12 = var0.readBigSmart((byte)39);
      int var13 = var0.readInt((byte)5);
      int var14 = var0.readInt((byte)5);
      return new Class382(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   public static Class411[] method910(int var0) {
      return new Class411[]{Class411.aClass411_4405, Class411.aClass411_4397, Class411.aClass411_4429, Class411.aClass411_4431, Class411.aClass411_4381, Class411.aClass411_4387, Class411.aClass411_4379, Class411.aClass411_4409, Class411.aClass411_4407, Class411.aClass411_4423, Class411.aClass411_4426, Class411.aClass411_4428, Class411.aClass411_4412, Class411.aClass411_4402, Class411.aClass411_4390, Class411.aClass411_4425, Class411.aClass411_4398, Class411.aClass411_4386, Class411.aClass411_4406, Class411.aClass411_4422, Class411.aClass411_4392, Class411.aClass411_4413, Class411.aClass411_4395, Class411.aClass411_4384, Class411.aClass411_4401, Class411.aClass411_4404, Class411.aClass411_4391, Class411.aClass411_4421, Class411.aClass411_4414, Class411.aClass411_4430, Class411.aClass411_4389, Class411.aClass411_4411, Class411.aClass411_4427, Class411.aClass411_4388, Class411.aClass411_4410, Class411.aClass411_4419, Class411.aClass411_4394, Class411.aClass411_4400, Class411.aClass411_4393, Class411.aClass411_4382, Class411.aClass411_4417, Class411.aClass411_4396, Class411.aClass411_4403, Class411.aClass411_4416, Class411.aClass411_4420, Class411.aClass411_4383, Class411.aClass411_4415, Class411.aClass411_4418, Class411.aClass411_4399, Class411.aClass411_4385, Class411.aClass411_4380, Class411.aClass411_4424};
   }

   public static int method911(int var0, int var1, int var2) {
      int var3 = var1 >>> 24;
      int var4 = 255 - var3;
      var1 = ((var1 & 16711935) * var3 & -16711936 | (var1 & '\uff00') * var3 & 16711680) >>> 8;
      return ((var4 * (var0 & 16711935) & -16711936 | var4 * (var0 & '\uff00') & 16711680) >>> 8) + var1;
   }

   public static void method912(int var0, String var1, int var2, int var3) {
      Class526_Sub21_Sub19 var4 = Class493.method5892(Class581.aClass581_7763, var0, -1, -1617312077);
      if(var4 != null) {
         Class681 var5 = RenderDef.method6932((byte)-75);
         var5.anIntArray8643 = new int[-2142922607 * var4.anInt11865];
         var5.anObjectArray8618 = new String[var4.anInt11869 * -790376653];
         var5.anObjectArray8618[0] = var1;
         var5.anIntArray8643[0] = var2;
         Class653.method7792(var4, 500000, var5, (byte)-108);
      }
   }

   static final void method913(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class143.method1667(var3, var4, var0, -2031850345);
   }

   static final void method914(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class684.method8043(var3, var0, 1225188839);
   }

   static final void method915(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)28);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class539_Sub6.method9312(var3, var4, var0, -1831917879);
   }

   static final void method916(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)(Math.random() * (double)(var2 + 1));
   }
}
