package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class153;
import com.jagex.Class174;
import com.jagex.Class317;
import com.jagex.Class32;
import com.jagex.Class35;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub33;
import com.jagex.Class539_Sub6;
import com.jagex.Class610;
import com.jagex.Class681;
import com.jagex.Class698;
import com.jagex.Class711;
import com.jagex.client;

public class Class711_Sub28 extends Class711 {
   public static final int anInt10889 = 3;
   public static final int anInt10890 = 0;
   public static final int anInt10891 = 2;
   public static final int anInt10892 = 1;
   public static final int anInt10893 = 4;

   public int method10095() {
      return this.anInt8853 * 1174126091;
   }

   public int method10096(byte var1) {
      return this.anInt8853 * 1174126091;
   }

   public void method10097(int var1) {
      if(this.anInt8853 * 1174126091 < 0 && 1174126091 * this.anInt8853 > 4) {
         this.anInt8853 = this.method8320((byte)62) * 1568955811;
      }

   }

   int method8320(byte var1) {
      return this.aClass526_Sub33_8856.method9599((byte)-14).method8271((short)-4062) > 1?4:2;
   }

   int method8313(int var1, int var2) {
      return 1;
   }

   void method8315(int var1, int var2) {
      this.anInt8853 = 1568955811 * var1;
   }

   public Class711_Sub28(Class526_Sub33 var1) {
      super(var1);
   }

   public void method10098() {
      if(this.anInt8853 * 1174126091 < 0 && 1174126091 * this.anInt8853 > 4) {
         this.anInt8853 = this.method8320((byte)23) * 1568955811;
      }

   }

   int method8317(int var1) {
      return 1;
   }

   int method8316(int var1) {
      return 1;
   }

   void method8319(int var1) {
      this.anInt8853 = 1568955811 * var1;
   }

   int method8311() {
      return this.aClass526_Sub33_8856.method9599((byte)-10).method8271((short)-13815) > 1?4:2;
   }

   public Class711_Sub28(int var1, Class526_Sub33 var2) {
      super(var1, var2);
   }

   public int method10099() {
      return this.anInt8853 * 1174126091;
   }

   static final void method10100(Class681 var0, byte var1) {
      var0.anInt8623 -= -1578695711;
      client.publicTradeStatus = var0.anIntArray8622[-1730576285 * var0.anInt8623] * 1544740565;
      Class539_Sub6.aClass698_10363 = Class317.method4103(var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1], 1744931332);
      if(Class539_Sub6.aClass698_10363 == null) {
         Class539_Sub6.aClass698_10363 = Class698.aClass698_8763;
      }

      client.publicChatStatus = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2] * 68831625;
      Class111 var2 = Class452_Sub4.method9295((byte)117);
      OutFrameBuffer var3 = Class115.method1414(OutFrame.GAMEBAR_UPDATE, var2.aClass14_1342, -72927795);
      var3.out.writeByte(client.publicTradeStatus * -1527682435, -182507090);
      var3.out.writeByte(Class539_Sub6.aClass698_10363.anInt8766 * 2094456825, -1622100000);
      var3.out.writeByte(client.publicChatStatus * -500237127, 92093153);
      var2.write(var3, (byte)46);
   }

   static void method10101(Class174 var0, Class610 var1, int var2, int var3, int var4, int var5) {
      Class35 var6 = (Class35)Class32.aClass40_Sub3_361.method89(-549491903 * var1.anInt7970, -523496687);
      if(-1 != 322011983 * var6.anInt373) {
         if(var1.aBool7975) {
            var2 += -1365382275 * var1.anInt7958;
            var2 &= 3;
         } else {
            var2 = 0;
         }

         Class153 var7 = var6.method830(var0, var2, var1.aBool7973, 44128669);
         if(null != var7) {
            int var8 = var1.anInt7993 * -1450399027;
            int var9 = var1.anInt7971 * 182793117;
            if((var2 & 1) == 1) {
               var8 = 182793117 * var1.anInt7971;
               var9 = -1450399027 * var1.anInt7993;
            }

            int var10 = var7.method21();
            int var11 = var7.method1788();
            if(var6.aBool376) {
               var10 = var8 * 4;
               var11 = 4 * var9;
            }

            if(0 != var6.anInt372 * 799991657) {
               var7.method1781(var3, var4 - (var9 - 1) * 4, var10, var11, 0, -16777216 | var6.anInt372 * 799991657, 1);
            } else {
               var7.method1772(var3, var4 - (var9 - 1) * 4, var10, var11);
            }

         }
      }
   }
}
