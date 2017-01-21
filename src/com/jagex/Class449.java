package com.jagex;

import com.jagex.Class103;
import com.jagex.Class11;
import com.jagex.Class143_Sub1;
import com.jagex.Class162;
import com.jagex.Class189;
import com.jagex.Class2;
import com.jagex.Class215;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class279;
import com.jagex.NPCDef;
import com.jagex.Class434;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class453;
import com.jagex.Class50;
import com.jagex.Class526_Sub21_Sub15_Sub3;
import com.jagex.RSByteBuffer;
import com.jagex.Class60;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class645;
import com.jagex.Class655;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Class71;
import com.jagex.Class711_Sub31;
import com.jagex.Class76;
import com.jagex.IcmpService_Sub1;
import com.jagex.client;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class449 {
   // $FF: synthetic field
   Class453 this$0;
   byte[] aByteArray4923;

   byte[] method5335(byte var1) {
      return this.aByteArray4923;
   }

   Class449(Class453 var1, InputStream var2, Class526_Sub21_Sub15_Sub3 var3, URL var4) {
      this.this$0 = var1;
      this.aByteArray4923 = null;
      if(null != var2) {
         short var5 = 10240;
         RSByteBuffer var6 = new RSByteBuffer(var5, true);
         int var7 = 0;
         byte[] var8 = Class692.method8107(1024, -840721825);

         int var9;
         while(var7 >= 0) {
            try {
               var7 = var2.read(var8);
            } catch (IOException var12) {
               var12.printStackTrace();
               var7 = -1;
            }

            if(var7 > 0) {
               if(var7 + var6.pos * 301018015 >= var6.buffer.length) {
                  var9 = 10240 + var6.buffer.length;
                  byte[] var10 = Class692.method8104(var9, true, -1098295923);
                  System.arraycopy(var6.buffer, 0, var10, 0, 301018015 * var6.pos);
                  Class692.method8106(var6.buffer, (byte)-61);
                  var6.buffer = var10;
               }

               var6.method9619(var8, 0, var7, 1946697802);
            }
         }

         for(var9 = 0; var9 < var3.anInt12157 * 616149639; ++var9) {
            var6.writeByte(0, 1681787574);
         }

         byte[] var14 = new byte[301018015 * var6.pos];
         System.arraycopy(var6.buffer, 0, var14, 0, 301018015 * var6.pos);
         var6.method9675(-1955210666);
         var6 = null;
         Class692.method8106(var8, (byte)-69);
         Object var13 = null;
         this.aByteArray4923 = var14;

         try {
            var2.close();
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      }

      var3.waiting = false;
      var1.method5383(1978180026);
   }

   static final void method5336(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub17_10601.method10002(-1570389137)?1:0;
   }

   static void method5337(int var0, int var1, InterfaceDef var2, Class162 var3, int var4, int var5, int var6) {
      int var7 = 1609310241 * Class103.anInt1270;
      int[] var8 = Class103.anIntArray1276;

      for(int var9 = 0; var9 < var7; ++var9) {
         Class639_Sub1_Sub2_Sub1_Sub1 var10 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var8[var9]];
         if(var10 != null && var10.method10973((byte)20) && !var10.aClass624_12183.method7416((byte)69) && Class451.localPlayer != var10 && Class451.localPlayer.aByte10827 == var10.aByte10827) {
            Class446 var11 = var10.method7635().aClass446_4816;
            int var12 = (int)var11.aFloat4917 / 128 - var0 / 128;
            int var13 = (int)var11.aFloat4919 / 128 - var1 / 128;
            boolean var14 = false;

            for(int var15 = 0; var15 < -17244221 * client.anInt11130; ++var15) {
               Class50 var16 = client.aClass50Array11290[var15];
               if(var10.aString12161.equals(var16.aString659) && 0 != var16.anInt653 * 799007287) {
                  var14 = true;
                  break;
               }
            }

            boolean var17 = false;

            for(int var18 = 0; var18 < Class11.anInt145 * -190820129; ++var18) {
               if(var10.aString12161.equals(Class655.aClass107Array8488[var18].aString1311)) {
                  var17 = true;
                  break;
               }
            }

            boolean var19 = false;
            if(0 != Class451.localPlayer.anInt12174 * -587886045 && var10.anInt12174 * -587886045 != 0 && -587886045 * Class451.localPlayer.anInt12174 == var10.anInt12174 * -587886045) {
               var19 = true;
            }

            if(var10.aClass633_12181 != null && -1760242843 * var10.aClass633_12181.anInt8252 != -1 && ((NPCDef)Class76.loader.method89(-1760242843 * var10.aClass633_12181.anInt8252, -1543708610)).hidePlayer) {
               Class60.method1038(var2, var3, var4, var5, var12, var13, Class143_Sub1.aClass153Array8914[1], -540272511);
            } else if(Class215.aClass215_2269 == var10.aClass215_12182) {
               Class60.method1038(var2, var3, var4, var5, var12, var13, Class143_Sub1.aClass153Array8914[8], 1289528153);
            } else if(var10.aClass215_12182 == Class215.aClass215_2270) {
               Class60.method1038(var2, var3, var4, var5, var12, var13, Class143_Sub1.aClass153Array8914[6], -1876820138);
            } else if(var19) {
               Class60.method1038(var2, var3, var4, var5, var12, var13, Class143_Sub1.aClass153Array8914[4], -697278411);
            } else if(var10.aBool12184) {
               Class60.method1038(var2, var3, var4, var5, var12, var13, Class143_Sub1.aClass153Array8914[7], -494974379);
            } else if(var14) {
               Class60.method1038(var2, var3, var4, var5, var12, var13, Class143_Sub1.aClass153Array8914[3], 1047410287);
            } else if(var17) {
               Class60.method1038(var2, var3, var4, var5, var12, var13, Class143_Sub1.aClass153Array8914[5], 244460070);
            } else {
               Class60.method1038(var2, var3, var4, var5, var12, var13, Class143_Sub1.aClass153Array8914[2], -16896973);
            }
         }
      }

   }

   static final void method5338(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class434.method5147(var3, var4, var0, (byte)11);
   }

   public static void method5339(int var0) {
      Class189.aClass20_2152.method647(929030154);
      Class189.aClass702_2160.method8188(1270552671);
      Class279.aClass196Array3033 = null;
      Class645.aClass207Array8445 = null;
      Class189.aClass190Array2149 = null;
      Class189.aClass200Array2150 = null;
      Class189.aClass199Array2148 = null;
      Class189.anInt2153 = -445294529;
      Class189.anInt2151 = 0;
      Class189.anInt2158 = 0;
      Class189.aClass201_2159 = null;
      Class189.anInt2156 = -261471863;
      Class189.anInt2157 = 561706955;
      if(Class189.aBool2155) {
         client.aShort11280 = Class711_Sub31.aShort10899;
         client.aShort11144 = Class71.aShort798;
         client.aShort11211 = IcmpService_Sub1.aShort10845;
         client.aShort11189 = Class2.aShort18;
         Class189.aBool2155 = false;
      }

   }
}
