package com.jagex;

import com.jagex.Class103;
import com.jagex.Class387;
import com.jagex.Class451;
import com.jagex.Class526_Sub21_Sub4;
import com.jagex.Buffer;
import com.jagex.LinkableObject;
import com.jagex.RenderDef;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub4;
import com.jagex.Class681;
import com.jagex.Class704;
import com.jagex.Class711;
import com.jagex.client;

public class Class293 {
   static Class293 aClass293_3178 = new Class293(0);
   public static Class293 aClass293_3179 = new Class293(1);
   public int anInt3180;

   Class293(int var1) {
      this.anInt3180 = var1 * 1595995991;
   }

   static final int method3953(int var0, int var1) {
      return var0 < 7?9:11;
   }

   static final void method3954(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0 != (var2 & 1 << var3)?1:0;
   }

   static void method3955(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, boolean var14, int var15, int var16) {
      if(0 != var1 && -1 != var3) {
         Object var17 = null;
         int var18;
         if(var1 < 0) {
            var18 = -var1 - 1;
            if(var18 == client.localPlayerIndex * -1204447689) {
               var17 = Class451.localPlayer;
            } else {
               var17 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var18];
            }
         } else {
            var18 = var1 - 1;
            LinkableObject var19 = (LinkableObject)client.npcs.get((long)var18);
            if(null != var19) {
               var17 = (Class639_Sub1_Sub2_Sub1)var19.anObject10399;
            }
         }

         if(var17 != null) {
            RenderDef var21 = ((Class639_Sub1_Sub2_Sub1)var17).method10786(-16777216);
            if(null != var21.anIntArrayArray7704 && var21.anIntArrayArray7704[var3] != null) {
               var4 -= var21.anIntArrayArray7704[var3][1];
            }

            if(var21.anIntArrayArray7698 != null && var21.anIntArrayArray7698[var3] != null) {
               var4 -= var21.anIntArrayArray7698[var3][1];
            }
         }
      }

      Class639_Sub1_Sub2_Sub4 var20 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(-1653127450), var0, 1728196755 * Class711.anInt8858, 1728196755 * Class711.anInt8858, var6, var7, var4, client.anInt11012 + var10, client.anInt11012 + var11, var12, var13, var1, var2, var5, var14, var3, var15);
      var20.method10925(var8, var9, Class387.method4762(var8, var9, 1728196755 * Class711.anInt8858, 2051009290) - var5, client.anInt11012 + var10, -496725025);
      client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var20), -450503438);
   }

   static final void method3956(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method3957(Buffer var0, int var1) {
      for(int var2 = 0; var2 < Class103.anInt1275 * 187285165; ++var2) {
         var0.readUnsignedShort(603559121);
         int var3 = Class103.anIntArray1269[var2];
         Class639_Sub1_Sub2_Sub1_Sub1 var4 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var3];
         int var5 = var0.readUnsignedByte(950974430);
         if(0 != (var5 & 128)) {
            var5 += var0.readUnsignedByte(319208836) << 8;
         }

         if(0 != (var5 & 2048)) {
            var5 += var0.readUnsignedByte(2054108970) << 16;
         }

         Class704.decodePlayerUpdateFlags(var0, var3, var4, var5, 469660674);
      }

   }
}
