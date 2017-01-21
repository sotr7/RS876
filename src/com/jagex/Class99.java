package com.jagex;

import com.jagex.Class199_Sub18;
import com.jagex.Class230;
import com.jagex.Class242;
import com.jagex.NPCDef;
import com.jagex.Class522;
import com.jagex.RenderDef;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.client;

public class Class99 {
   int anInt1187;
   int anInt1192;
   int anInt1194;
   int anInt1195;
   float aFloat1197;
   float aFloat1193 = 1.0F;
   float aFloat1189 = 1.0F;
   int anInt1191;
   int anInt1190;
   int anInt1196;
   int anInt1188;

   Class99(int var1) {
      this.anInt1191 = var1 * -1888472453;
   }

   Class99 method1279(int var1) {
      return new Class99(this.anInt1191 * 487709875, this.aFloat1193, this.aFloat1189, this.anInt1190 * -1524619093, 1471458987 * this.anInt1196, this.anInt1188 * -236039229);
   }

   void method1280(Class99 var1, int var2) {
      this.aFloat1193 = var1.aFloat1193;
      this.aFloat1189 = var1.aFloat1189;
      this.anInt1190 = var1.anInt1190 * 1;
      this.anInt1196 = var1.anInt1196 * 1;
      this.anInt1191 = 1 * var1.anInt1191;
      this.anInt1188 = 1 * var1.anInt1188;
   }

   Class99(int var1, float var2, float var3, int var4, int var5, int var6) {
      this.anInt1191 = -1888472453 * var1;
      this.aFloat1193 = var2;
      this.aFloat1189 = var3;
      this.anInt1190 = var4 * -397766141;
      this.anInt1196 = 475388931 * var5;
      this.anInt1188 = var6 * 974959851;
   }

   static final void method1281(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10619, var2, (short)-5796);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10627, var2, (short)-22613);
      Class230.preferences.aClass711_Sub18_10619.method10014((byte)56);
      Class230.preferences.aClass711_Sub18_10627.method10014((byte)41);
      Class199_Sub18.method9026((byte)8);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static int method1282(NPC var0, int var1) {
      NPCDef var2 = var0.def;
      if(var2.morphisms != null) {
         var2 = var2.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
         if(var2 == null) {
            return -1;
         }
      }

      int var3 = var2.anInt3355 * 2040989771;
      RenderDef var4 = var0.method10786(-16777216);
      int var5 = var0.aClass704_Sub3_11914.method8220(-1590263456);
      if(-1 != var5 && !var0.aClass704_Sub3_11914.aBool10969) {
         if(var4.runAnimation * 1317568909 != var5 && var5 != var4.runRotate180Animation * -1340587369 && var5 != var4.runRotate90CounterAnimation * 84725405 && var4.runRotate90Animation * 1443182969 != var5) {
            if(var5 == 455141683 * var4.moveType1Anim || var4.type1_180 * -566579917 == var5 || var5 == -2093545587 * var4.type1_90_counter || var5 == -721906563 * var4.type1_90) {
               var3 = var2.anInt3354 * -803450199;
            }
         } else {
            var3 = var2.anInt3356 * 163458111;
         }
      } else {
         var3 = var2.anInt3313 * -1515639175;
      }

      return var3;
   }
}
