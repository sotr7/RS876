package com.jagex;

import com.jagex.Class108;
import com.jagex.Class114;
import com.jagex.Class189;
import com.jagex.Class195;
import com.jagex.Class199;
import com.jagex.Class208;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class307;
import com.jagex.NPCDef;
import com.jagex.Class31;
import com.jagex.Class315_Sub1;
import com.jagex.Class329_Sub2;
import com.jagex.Class497;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.NPC;
import com.jagex.Class663;
import com.jagex.Class665;
import com.jagex.Class666;
import com.jagex.Class681;
import com.jagex.Class689_Sub3;
import com.jagex.client;
import java.util.Iterator;

public class Class199_Sub17 extends Class199 {
   public static Iterator anIterator9948;
   long aLong9947;
   int anInt9946;

   public void method2861() {
      Class526_Sub25 var1 = (Class526_Sub25)Class189.aClass20_2152.get(this.aLong9947 * 28342768293672619L);
      if(var1 != null) {
         var1.anInt10550 = -1559821963 * this.anInt9946;
      } else {
         Class189.aClass20_2152.put(new Class526_Sub25(-1389856411 * this.anInt9946), this.aLong9947 * 28342768293672619L);
      }
   }

   public void method2852(byte var1) {
      Class526_Sub25 var2 = (Class526_Sub25)Class189.aClass20_2152.get(this.aLong9947 * 28342768293672619L);
      if(var2 != null) {
         var2.anInt10550 = -1559821963 * this.anInt9946;
      } else {
         Class189.aClass20_2152.put(new Class526_Sub25(-1389856411 * this.anInt9946), this.aLong9947 * 28342768293672619L);
      }
   }

   public void method2859() {
      Class526_Sub25 var1 = (Class526_Sub25)Class189.aClass20_2152.get(this.aLong9947 * 28342768293672619L);
      if(var1 != null) {
         var1.anInt10550 = -1559821963 * this.anInt9946;
      } else {
         Class189.aClass20_2152.put(new Class526_Sub25(-1389856411 * this.anInt9946), this.aLong9947 * 28342768293672619L);
      }
   }

   Class199_Sub17(RSByteBuffer var1, boolean var2) {
      super(var1);
      int var3 = var1.readUnsignedShort(704526255);
      if(var2) {
         this.aLong9947 = 3563567518080816131L * (4294967296L | (long)var3);
      } else {
         this.aLong9947 = 3563567518080816131L * (long)var3;
      }

      this.anInt9946 = var1.readInt((byte)5) * -644476819;
   }

   public void method2856() {
      Class526_Sub25 var1 = (Class526_Sub25)Class189.aClass20_2152.get(this.aLong9947 * 28342768293672619L);
      if(var1 != null) {
         var1.anInt10550 = -1559821963 * this.anInt9946;
      } else {
         Class189.aClass20_2152.put(new Class526_Sub25(-1389856411 * this.anInt9946), this.aLong9947 * 28342768293672619L);
      }
   }

   public void method2857() {
      Class526_Sub25 var1 = (Class526_Sub25)Class189.aClass20_2152.get(this.aLong9947 * 28342768293672619L);
      if(var1 != null) {
         var1.anInt10550 = -1559821963 * this.anInt9946;
      } else {
         Class189.aClass20_2152.put(new Class526_Sub25(-1389856411 * this.anInt9946), this.aLong9947 * 28342768293672619L);
      }
   }

   public void method2858() {
      Class526_Sub25 var1 = (Class526_Sub25)Class189.aClass20_2152.get(this.aLong9947 * 28342768293672619L);
      if(var1 != null) {
         var1.anInt10550 = -1559821963 * this.anInt9946;
      } else {
         Class189.aClass20_2152.put(new Class526_Sub25(-1389856411 * this.anInt9946), this.aLong9947 * 28342768293672619L);
      }
   }

   public void method2855() {
      Class526_Sub25 var1 = (Class526_Sub25)Class189.aClass20_2152.get(this.aLong9947 * 28342768293672619L);
      if(var1 != null) {
         var1.anInt10550 = -1559821963 * this.anInt9946;
      } else {
         Class189.aClass20_2152.put(new Class526_Sub25(-1389856411 * this.anInt9946), this.aLong9947 * 28342768293672619L);
      }
   }

   static final void processNPCUpdate(int var0, int var1) {
      client.removedNpcCount = 0;
      client.anInt11065 = 0;
      client.anInt10980 += 317984223;
      Class666.processNPCMovement((byte)-40);
      Class497.addLocalNpc(var0, (byte)8);
      Class208.decodeNPCMask(831048488);
      boolean var2 = false;

      int var3;
      int var4;
      for(var3 = 0; var3 < client.removedNpcCount * 1035645689; ++var3) {
         var4 = client.removedNpcIndices[var3];
         LinkableObject var5 = (LinkableObject)client.npcs.get((long)var4);
         NPC var6 = (NPC)var5.anObject10399;
         if(var6.lastUpdate * -1132932469 != client.anInt10980 * 940830239) {
            if(Class31.aBool291 && Class663.method7947(var4, -1745586236)) {
               Class114.method1400(833113363);
            }

            if(var6.def.method4055(1905537292)) {
               Class108.method1352(var6, (byte)45);
            }

            var6.setDefinition((NPCDef)null, -1957887669);
            var5.method6332(-1949449864);
            var2 = true;
         }
      }

      if(var2) {
         var3 = client.anInt11051 * 2027369339;
         client.anInt11051 = client.npcs.method636(-1546258916) * 253277107;
         var4 = 0;

         LinkableObject var10;
         for(Iterator var8 = client.npcs.iterator(); var8.hasNext(); client.aClass526_Sub7Array11050[var4++] = var10) {
            var10 = (LinkableObject)var8.next();
         }

         for(int var9 = 2027369339 * client.anInt11051; var9 < var3; ++var9) {
            client.aClass526_Sub7Array11050[var9] = null;
         }

         Class307 var11 = Class195.aClass292_Sub1_2182.method3914((byte)3);
         if(var11 == Class307.aClass307_3297) {
            Class329_Sub2 var12 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(1910743697);
            var12.method9107(2027159589);
         }

         Class298 var13 = Class195.aClass292_Sub1_2182.method3940(-1481250512);
         if(var13 == Class298.aClass298_3237) {
            Class689_Sub3 var7 = (Class689_Sub3)Class195.aClass292_Sub1_2182.method3938((byte)-59);
            var7.method10221(-918373261);
         }
      }

      if(301018015 * client.aClass111_11060.buffer.pos != client.aClass111_11060.currentFrame * -1225783061) {
         throw new RuntimeException(client.aClass111_11060.buffer.pos * 301018015 + " " + client.aClass111_11060.currentFrame * -1225783061);
      } else {
         for(var3 = 0; var3 < 1139938345 * client.npcCount; ++var3) {
            if(client.npcs.get((long)client.npcsIndicies[var3]) == null) {
               throw new RuntimeException(var3 + " " + client.npcCount * 1139938345);
            }
         }

         if(0 != client.anInt11051 * 2027369339 - 1139938345 * client.npcCount) {
            throw new RuntimeException("" + (client.anInt11051 * 2027369339 - client.npcCount * 1139938345));
         } else {
            for(var3 = 0; var3 < 2027369339 * client.anInt11051; ++var3) {
               if(-1132932469 * ((Class639_Sub1_Sub2_Sub1)client.aClass526_Sub7Array11050[var3].anObject10399).lastUpdate != 940830239 * client.anInt10980) {
                  throw new RuntimeException("" + 828574411 * ((Class639_Sub1_Sub2_Sub1)client.aClass526_Sub7Array11050[var3].anObject10399).index);
               }
            }

         }
      }
   }

   static final void method9023(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var0.aString2624 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
   }

   static final void method9024(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)44);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class665.method7951(var3, var4, var0, (byte)-104);
   }
}
