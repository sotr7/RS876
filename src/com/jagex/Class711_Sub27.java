package com.jagex;

import com.jagex.Class143_Sub1;
import com.jagex.Class162;
import com.jagex.Class174;
import com.jagex.Class195;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.NPCDef;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class526_Sub33;
import com.jagex.LinkableObject;
import com.jagex.Class534;
import com.jagex.Class60;
import com.jagex.Class616;
import com.jagex.NPC;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class711;
import com.jagex.client;

public class Class711_Sub27 extends Class711 {
   public static final int anInt10884 = 2;
   public static final int anInt10885 = 3;
   public static final int anInt10886 = 4;
   public static final int anInt10887 = 1;
   public static final int anInt10888 = 0;

   int method8320(byte var1) {
      return 0;
   }

   public int method10087() {
      return 1174126091 * this.anInt8853;
   }

   public void method10088(byte var1) {
      if(1174126091 * this.anInt8853 < 0 || this.anInt8853 * 1174126091 > 4) {
         this.anInt8853 = this.method8320((byte)53) * 1568955811;
      }

   }

   public Class711_Sub27(int var1, Class526_Sub33 var2) {
      super(var1, var2);
   }

   public void method10089() {
      if(1174126091 * this.anInt8853 < 0 || this.anInt8853 * 1174126091 > 4) {
         this.anInt8853 = this.method8320((byte)121) * 1568955811;
      }

   }

   void method8315(int var1, int var2) {
      this.anInt8853 = var1 * 1568955811;
   }

   public int method10090(int var1) {
      return 1174126091 * this.anInt8853;
   }

   int method8311() {
      return 0;
   }

   public Class711_Sub27(Class526_Sub33 var1) {
      super(var1);
   }

   int method8316(int var1) {
      return 1;
   }

   void method8319(int var1) {
      this.anInt8853 = var1 * 1568955811;
   }

   int method8313(int var1, int var2) {
      return 1;
   }

   public int method10091() {
      return 1174126091 * this.anInt8853;
   }

   int method8317(int var1) {
      return 1;
   }

   static void method10092(Class174 var0, int var1, int var2, InterfaceDef var3, Class162 var4, int var5, int var6, byte var7) {
      for(int var8 = 0; var8 < client.npcCount * 1139938345; ++var8) {
         LinkableObject var9 = (LinkableObject)client.npcs.get((long)client.npcsIndicies[var8]);
         if(null != var9) {
            NPC var10 = (NPC)var9.anObject10399;
            if(var10.method10992(-857914069) && Class451.localPlayer.aByte10827 == var10.aByte10827) {
               NPCDef var11 = var10.def;
               if(null != var11 && null != var11.morphisms) {
                  var11 = var11.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
               }

               if(var11 != null && var11.drawMapdot && var11.aBool3317) {
                  Class446 var12 = var10.method7635().aClass446_4816;
                  int var13 = (int)var12.aFloat4917 / 128 - var1 / 128;
                  int var14 = (int)var12.aFloat4919 / 128 - var2 / 128;
                  if(-1584480307 * var11.mapFunction != -1) {
                     Class534.method6399(var0, var4, var3, var5, var6, var13, var14, -1584480307 * var11.mapFunction, -1957887669);
                  } else {
                     Class60.method1038(var3, var4, var5, var6, var13, var14, Class143_Sub1.aClass153Array8914[1], -167576972);
                  }
               }
            }
         }
      }

   }

   static final void method10093(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class616.method7309(var3, var4, var0, (byte)-99);
   }

   static final void method10094(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class195.aClass292_Sub1_2182.method3940(-1908021508) == null?-1:Class195.aClass292_Sub1_2182.method3940(145510549).anInt3243 * -38262087;
   }
}
