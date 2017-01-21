package com.jagex;

import com.RS3Applet;
import com.jagex.Class105;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class231;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class267;
import com.jagex.Class286;
import com.jagex.Class325_Sub2;
import com.jagex.Class40_Sub8;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class610;
import com.jagex.Class681;
import com.jagex.Interface59;
import com.jagex.client;
import java.math.BigInteger;

public class Class60 {
   static BigInteger RSA_UPDATE_EXPONENT;
   static BigInteger LOGIN_MODULUS;
   public static BigInteger LOGIN_EXPONENT;
   public static BigInteger RSA_UPDATE_MODULUS;
   
   Class60() throws Throwable {
      throw new Error();
   }

	static {
		
		RSA_UPDATE_EXPONENT = LOGIN_EXPONENT = new BigInteger("10001", 16);
		LOGIN_MODULUS = new BigInteger(
				"826245b9420b77bf7e7558ad119b4f1f64067e86a7588468ad926b4aecd56a8f48220c5560106598134876e5b0293057a7c71a737b95a61263560e0e9b1a4cfdd8f4b9d458bd449674420eb6152c6cbbd62caf2d180473c2d2b458dcf4cefb20a826fc55920c176773e5fd26d472c82aae7708d8be8b0f3362fbddacb223f95d",
				16);
		RSA_UPDATE_MODULUS = new BigInteger(
				"8287102833de9b4831f7800153cff1a64e05778cb3920e93cd99176e356f4d7cc2df510be174fde0c9c22b9461f41f5ec319d35a6f73f76798cf91b9a4c51ce1b1fa1c43cd145290db89c47c51bd67e498b1d1f318bbdd1cd4b3fbbde65d828a225565a9a27c9f40d5d3cfe6f9b2323f7359cc426b40668e5505682650e97384d59b189b355f8f4bc038cdcf4d7523b1c98b49184ac08703a00cf60ad1c23f38bd485b6191706ede35a91aa22f7ca0375cd5577466440fa7e6201b7c07d182553a77ee1c7806223a5528ec12079380ef0931204992b7538685c2cc95bcbc631020cc72715e721d034304d381183e0fdf59fc9c843c863ef4f5874311d749a87313deefce93c3f30f16a536988662afcdd92441049f81f646e4d1507cc693cfb4b3eb0416a6f278d6407f682304718cbd5a395a8e4b812c66e34db1d15b13597f52ed42671be388b9215968d2ba01bc49c97c4b2ecf216d371110c181273f4d0e386dd37ab53faeaaac2bf8b7c73314442fff07c1de0e0441f1a0ac1184758159faceb3e2ffbf85ee03f9bf5faf7ad19b9e499e7dff91c5a6cacfe44d8cd3410d45bb94b2d2e50b6f20f80091390893844fe64f760394398da7ad72732e3386c83f08133fffd6588112eccad4b263633fddcaecf4a9070f2411cfcca12b9631be85174c8d1ed0b3fd86684c26b13df15735e3072ded14e50f99e3e1d8ab853ead",
				16);

		if (RS3Applet.RSPS) {
			RSA_UPDATE_EXPONENT = LOGIN_EXPONENT = new BigInteger("65537");
			RSA_UPDATE_MODULUS = LOGIN_MODULUS = new BigInteger(
					"7871143687424538864202557352915826277422468068412262873090751715633185803551126047872098304035825036280420995543699421150200902637147867439970995255532811");
		}
	}

   static boolean method1037(Interface59 var0, Class40_Sub8 var1, int var2, int var3, byte var4) {
      if(var0 == null) {
         return false;
      } else {
         Class610 var5 = (Class610)var1.method89(var0.method56(273406506), -366493525);
         if(var5.aBool8002 && !client.aBool11230) {
            return false;
         } else {
            int var6 = var5.anInt7969 * -1569917235;
            if(null != var5.anIntArray7989) {
               for(int var7 = 0; var7 < var5.anIntArray7989.length; ++var7) {
                  if(-1 != var5.anIntArray7989[var7]) {
                     Class610 var8 = (Class610)var1.method89(var5.anIntArray7989[var7], -468087933);
                     if(var8.anInt7969 * -1569917235 >= 0) {
                        var6 = -1569917235 * var8.anInt7969;
                     }
                  }
               }
            }

            if(var6 >= 0) {
               Class105.anIntArray1298[-1398482913 * Class105.anInt1295] = 445039693 * var5.anInt7959;
               Class105.anIntArray1296[Class105.anInt1295 * -1398482913] = var2;
               Class105.anIntArray1292[Class105.anInt1295 * -1398482913] = var3;
               Class105.anInt1295 += 800367583;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   static void method1038(InterfaceDef var0, Class162 var1, int var2, int var3, int var4, int var5, Class153 var6, int var7) {
      Class231.method3255(var0, var1, var2, var3, var4, var5, var6, 100.0D, Class286.aClass286_3096, Class267.aClass267_2984, 1997164371);
   }

   static final void method1039(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      boolean var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285] == 1;
      if(!Class325_Sub2.method9070(var2, var3, 51578677)) {
         throw new RuntimeException();
      }
   }

   public static void method1040(int var0, int var1, int var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(17, (long)var1 << 32 | (long)var0);
      var3.method10583((byte)0);
   }
}
