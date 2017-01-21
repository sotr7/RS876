package com.jagex;

import com.jagex.Class115;
import com.jagex.Class190;
import com.jagex.Class191;
import com.jagex.Class195;
import com.jagex.Class199;
import com.jagex.Class199_Sub18;
import com.jagex.Class2;
import com.jagex.Class20;
import com.jagex.Class200;
import com.jagex.Class201;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class259;
import com.jagex.Class322;
import com.jagex.Class385;
import com.jagex.OutFrame;
import com.jagex.Class443;
import com.jagex.Class449;
import com.jagex.Class487;
import com.jagex.Class526_Sub21_Sub13_Sub1;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class581;
import com.jagex.Class636;
import com.jagex.Class639_Sub1_Sub2_Sub2;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class702;
import com.jagex.Class71;
import com.jagex.Class711_Sub31;
import com.jagex.IcmpService_Sub1;
import com.jagex.Interface19;
import com.jagex.client;

public class Class189 {
   public static Class199[] aClass199Array2148;
   static Class190[] aClass190Array2149;
   static Class200[] aClass200Array2150;
   static Class201 aClass201_2159;
   public static Class702 aClass702_2160 = new Class702();
   public static Class20 aClass20_2152 = new Class20(32);
   static int anInt2153 = -445294529;
   static int anInt2151 = 0;
   static int anInt2158 = 0;
   static boolean aBool2155 = false;
   static int anInt2157 = 561706955;
   static int anInt2156 = -261471863;
   public static Interface19 anInterface19_2154 = new Class191();

   public static void method2740(boolean var0) {
      if(2 != client.anInt11073 * 378016543 && 378016543 * client.anInt11073 != 3) {
         if(!var0) {
            if(null != aClass199Array2148) {
               Class199[] var1 = aClass199Array2148;

               for(int var2 = 0; var2 < var1.length; ++var2) {
                  Class199 var3 = var1[var2];
                  var3.method2854((byte)94);
               }
            }

            if(-1 != anInt2157 * 1638664733) {
               Class570.aClass231_7657.method3236(1638664733 * anInt2157, 255, 877911551);
            }
         }

         client.anInt11073 = 1701532094;
         Class322.aClass526_Sub36_3457 = null;
         client.aBool11247 = false;
         if(-1863091385 * anInt2156 > 0) {
            Class636.method7566(Class581.aClass581_7770, anInt2156 * -1863091385, -1, 210955532);
         }

         Class449.method5339(-823029724);
         OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4220, client.aClass111_11060.aClass14_1342, 1204981873);
         var4.out.writeByte(var0?1:0, -1116620929);
         client.aClass111_11060.write(var4, (byte)18);
      }
   }

   static void method2741(RSByteBuffer var0) {
      while(true) {
         int var1 = var0.readUnsignedByte(1500003626);
         switch(var1) {
         case 0:
            anInt2151 = var0.readUnsignedShort(1984518638) * -1282576677;
            anInt2158 = var0.readUnsignedShort(1712168249) * -1539944941;
            break;
         case 255:
            return;
         }
      }
   }

   public static void method2742() {
      Class711_Sub31.aShort10899 = client.aShort11280;
      Class71.aShort798 = client.aShort11144;
      IcmpService_Sub1.aShort10845 = client.aShort11211;
      Class2.aShort18 = client.aShort11189;
      aBool2155 = true;
      anInt2157 = Class570.aClass231_7657.method3224(975230785) * -561706955;
      if(-1391743973 * anInt2158 != 0 && anInt2151 * -1627988653 != 0) {
         client.aShort11211 = 334;
         client.aShort11189 = 334;
         client.aShort11144 = client.aShort11280 = (short)(anInt2158 * 391656960 / (anInt2151 * -1627988653));
      }

   }

   Class189() throws Throwable {
      throw new Error();
   }

   static final void method2743(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2611 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 60386479;
      Class526_Sub31.method9555(var0, (byte)10);
      if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
         Class199_Sub18.method9030(919258769 * var0.uid, 2063217285);
      }

   }

   static final void method2744(Class681 var0, int var1) {
      if(Class487.anIntArray5510 != null && Class385.anInt4038 * -365562085 < Class487.anIntArray5510.length) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class487.anIntArray5510[(Class385.anInt4038 += -1867937005) * -365562085 - 1] & '\uffff';
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      }

   }

   static final void method2745(Class681 var0, int var1) {
      Class639_Sub1_Sub2_Sub2.developerConsole((String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629], false, false, (byte)-89);
   }

   public static short[] method2746(short[] var0, int var1) {
      if(var0 == null) {
         return null;
      } else {
         short[] var2 = new short[var0.length];
         System.arraycopy(var0, 0, var2, 0, var0.length);
         return var2;
      }
   }

   static final void method2747(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2];
      Class259 var5 = Class679.method8024(var2, (short)-1708);
      float var6 = (float)var3;
      if(var5 == Class259.aClass259_2830 || Class259.aClass259_2834 == var5 || Class259.aClass259_2835 == var5) {
         var6 = Class443.method5200(var3);
      }

      Class526_Sub21_Sub13_Sub1 var7 = new Class526_Sub21_Sub13_Sub1(Class195.aClass292_Sub1_2182.method9122(16711935), var5, var6, (float)var4 / 1000.0F);
      Class195.aClass292_Sub1_2182.method3906(var7, (byte)5);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var7.anInt11813 * -631717655;
   }

   static final void method2748(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)51);
      Class684.method8043(var3, var0, -1032457174);
   }
}
