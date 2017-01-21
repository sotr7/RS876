package com.jagex;

import com.jagex.Class149_Sub1;
import com.jagex.Class189;
import com.jagex.Class20;
import com.jagex.Class242;
import com.jagex.NPCDef;
import com.jagex.Class446;
import com.jagex.Class482;
import com.jagex.Class526;
import com.jagex.Class570;
import com.jagex.Class610;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class702;
import com.jagex.Class99;
import com.jagex.Interface19;
import com.jagex.client;

public class Class526_Sub18 extends Class526 {
   int anInt10480;
   static final int anInt10481 = 512;
   int anInt10484;
   int anInt10485;
   int anInt10487;
   int anInt10494;
   NPC aClass639_Sub1_Sub2_Sub1_Sub2_10495;
   Class639_Sub1_Sub2_Sub1_Sub1 aClass639_Sub1_Sub2_Sub1_Sub1_10496;
   static final int anInt10498 = 1;
   boolean aBool10499;
   static final int anInt10500 = 3;
   Class610 aClass610_10501;
   static final int anInt10502 = 0;
   int anInt10509;
   static final int anInt10511 = 2;
   int anInt10508;
   int anInt10488;
   int anInt10491;
   int anInt10493;
   int anInt10504;
   int anInt10503;
   int anInt10492;
   int anInt10507;
   int[] anIntArray10510;
   Class482 aClass482_10506;
   static Class702 aClass702_10505 = new Class702();
   static Class702 aClass702_10482 = new Class702();
   static Class20 aClass20_10483 = new Class20(16);
   Class482 aClass482_10497;
   Class446 aClass446_10489 = new Class446(0.0F, 0.0F, 0.0F);
   Class446 aClass446_10490 = new Class446(0.0F, 0.0F, 0.0F);
   int anInt10486 = 0;

   void method9428() {
      int var1 = 1520182179 * this.anInt10508;
      if(this.aClass610_10501 != null) {
         Class610 var2 = this.aClass610_10501.method7179(Class242.aClass94_2456, (Interface19)(4 == 378016543 * client.anInt11073?Class189.anInterface19_2154:Class242.aClass94_2456), (byte)-62);
         if(null != var2) {
            this.anInt10508 = 1429404551 * var2.anInt7992;
            this.anInt10488 = -1934557329 * (var2.anInt7935 * -715291895 << 9);
            this.anInt10493 = var2.anInt7995 * 390273931;
            this.anInt10492 = var2.anInt7972 * 1457613419;
            this.anInt10507 = var2.anInt7997 * 1146814871;
            this.anIntArray10510 = var2.anIntArray7998;
            this.anInt10504 = var2.anInt7947 * -2048547817;
            this.anInt10503 = var2.anInt8006 * -98908643;
         } else {
            this.anInt10508 = 1225578485;
            this.anInt10488 = 0;
            this.anInt10493 = 0;
            this.anInt10492 = 0;
            this.anInt10507 = 0;
            this.anIntArray10510 = null;
            this.anInt10504 = 1339953408;
            this.anInt10503 = 1121573120;
            this.anInt10491 = 0;
         }
      } else if(this.aClass639_Sub1_Sub2_Sub1_Sub2_10495 != null) {
         int var4 = Class99.method1282(this.aClass639_Sub1_Sub2_Sub1_Sub2_10495, -1958435932);
         if(var1 != var4) {
            this.anInt10508 = var4 * -1225578485;
            NPCDef var3 = this.aClass639_Sub1_Sub2_Sub1_Sub2_10495.def;
            if(var3.morphisms != null) {
               var3 = var3.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            }

            if(null != var3) {
               this.anInt10488 = (var3.anInt3332 * 824599275 << 9) * -1934557329;
               this.anInt10491 = -1137973309 * (-1944680939 * var3.anInt3326 << 9);
               this.anInt10493 = var3.anInt3359 * 1061153107;
               this.anInt10504 = var3.anInt3369 * 558118373;
               this.anInt10503 = var3.anInt3301 * 1038318735;
            } else {
               this.anInt10491 = 0;
               this.anInt10488 = 0;
               this.anInt10493 = 0;
               this.anInt10504 = 1339953408;
               this.anInt10503 = 1121573120;
            }
         }
      } else if(null != this.aClass639_Sub1_Sub2_Sub1_Sub1_10496) {
         this.anInt10508 = Class149_Sub1.method8355(this.aClass639_Sub1_Sub2_Sub1_Sub1_10496, 811221711) * -1225578485;
         this.anInt10488 = (this.aClass639_Sub1_Sub2_Sub1_Sub1_10496.anInt12179 * -1469591895 << 9) * -1934557329;
         this.anInt10491 = 0;
         this.anInt10493 = this.aClass639_Sub1_Sub2_Sub1_Sub1_10496.anInt12180 * 385174739;
         this.anInt10504 = 1339953408;
         this.anInt10503 = 1121573120;
      }

      if(1520182179 * this.anInt10508 != var1 && this.aClass482_10506 != null && null != this.aClass482_10506) {
         this.aClass482_10506.method5770(100, -938617916);
         Class570.aClass231_7657.method3204(this.aClass482_10506, 1225138705);
         this.aClass482_10506 = null;
      }

   }

   void method9429(int var1) {
      int var2 = 1520182179 * this.anInt10508;
      if(this.aClass610_10501 != null) {
         Class610 var3 = this.aClass610_10501.method7179(Class242.aClass94_2456, (Interface19)(4 == 378016543 * client.anInt11073?Class189.anInterface19_2154:Class242.aClass94_2456), (byte)-123);
         if(null != var3) {
            this.anInt10508 = 1429404551 * var3.anInt7992;
            this.anInt10488 = -1934557329 * (var3.anInt7935 * -715291895 << 9);
            this.anInt10493 = var3.anInt7995 * 390273931;
            this.anInt10492 = var3.anInt7972 * 1457613419;
            this.anInt10507 = var3.anInt7997 * 1146814871;
            this.anIntArray10510 = var3.anIntArray7998;
            this.anInt10504 = var3.anInt7947 * -2048547817;
            this.anInt10503 = var3.anInt8006 * -98908643;
         } else {
            this.anInt10508 = 1225578485;
            this.anInt10488 = 0;
            this.anInt10493 = 0;
            this.anInt10492 = 0;
            this.anInt10507 = 0;
            this.anIntArray10510 = null;
            this.anInt10504 = 1339953408;
            this.anInt10503 = 1121573120;
            this.anInt10491 = 0;
         }
      } else if(this.aClass639_Sub1_Sub2_Sub1_Sub2_10495 != null) {
         int var5 = Class99.method1282(this.aClass639_Sub1_Sub2_Sub1_Sub2_10495, -1827620468);
         if(var2 != var5) {
            this.anInt10508 = var5 * -1225578485;
            NPCDef var4 = this.aClass639_Sub1_Sub2_Sub1_Sub2_10495.def;
            if(var4.morphisms != null) {
               var4 = var4.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            }

            if(null != var4) {
               this.anInt10488 = (var4.anInt3332 * 824599275 << 9) * -1934557329;
               this.anInt10491 = -1137973309 * (-1944680939 * var4.anInt3326 << 9);
               this.anInt10493 = var4.anInt3359 * 1061153107;
               this.anInt10504 = var4.anInt3369 * 558118373;
               this.anInt10503 = var4.anInt3301 * 1038318735;
            } else {
               this.anInt10491 = 0;
               this.anInt10488 = 0;
               this.anInt10493 = 0;
               this.anInt10504 = 1339953408;
               this.anInt10503 = 1121573120;
            }
         }
      } else if(null != this.aClass639_Sub1_Sub2_Sub1_Sub1_10496) {
         this.anInt10508 = Class149_Sub1.method8355(this.aClass639_Sub1_Sub2_Sub1_Sub1_10496, 811221711) * -1225578485;
         this.anInt10488 = (this.aClass639_Sub1_Sub2_Sub1_Sub1_10496.anInt12179 * -1469591895 << 9) * -1934557329;
         this.anInt10491 = 0;
         this.anInt10493 = this.aClass639_Sub1_Sub2_Sub1_Sub1_10496.anInt12180 * 385174739;
         this.anInt10504 = 1339953408;
         this.anInt10503 = 1121573120;
      }

      if(1520182179 * this.anInt10508 != var2 && this.aClass482_10506 != null && null != this.aClass482_10506) {
         this.aClass482_10506.method5770(100, -938617916);
         Class570.aClass231_7657.method3204(this.aClass482_10506, 73297916);
         this.aClass482_10506 = null;
      }

   }

   public static void method9430(boolean var0) {
      Class526_Sub18 var1;
      for(var1 = (Class526_Sub18)aClass702_10505.method8206((byte)93); null != var1; var1 = (Class526_Sub18)aClass702_10505.method8181(219165002)) {
         if(null != var1.aClass482_10506) {
            var1.aClass482_10506.method5770(150, -938617916);
            Class570.aClass231_7657.method3204(var1.aClass482_10506, -1147184690);
            var1.aClass482_10506 = null;
         }

         if(var1.aClass482_10497 != null) {
            var1.aClass482_10497.method5770(150, -938617916);
            Class570.aClass231_7657.method3204(var1.aClass482_10497, -1859241542);
            var1.aClass482_10497 = null;
         }

         var1.method6332(-1949449864);
      }

      if(var0) {
         for(var1 = (Class526_Sub18)aClass702_10482.method8206((byte)126); var1 != null; var1 = (Class526_Sub18)aClass702_10482.method8181(-639298189)) {
            if(null != var1.aClass482_10506) {
               var1.aClass482_10506.method5770(150, -938617916);
               Class570.aClass231_7657.method3204(var1.aClass482_10506, 1567971105);
               var1.aClass482_10506 = null;
            }

            var1.method6332(-1949449864);
         }

         for(var1 = (Class526_Sub18)aClass20_10483.method638(-599373699); null != var1; var1 = (Class526_Sub18)aClass20_10483.method639(2051412896)) {
            if(var1.aClass482_10506 != null) {
               var1.aClass482_10506.method5770(150, -938617916);
               Class570.aClass231_7657.method3204(var1.aClass482_10506, 1923958780);
               var1.aClass482_10506 = null;
            }

            var1.method6332(-1949449864);
         }
      }

   }

   public static void method9431(boolean var0) {
      Class526_Sub18 var1;
      for(var1 = (Class526_Sub18)aClass702_10505.method8206((byte)67); null != var1; var1 = (Class526_Sub18)aClass702_10505.method8181(259031704)) {
         if(null != var1.aClass482_10506) {
            var1.aClass482_10506.method5770(150, -938617916);
            Class570.aClass231_7657.method3204(var1.aClass482_10506, 2104433344);
            var1.aClass482_10506 = null;
         }

         if(var1.aClass482_10497 != null) {
            var1.aClass482_10497.method5770(150, -938617916);
            Class570.aClass231_7657.method3204(var1.aClass482_10497, 1296040488);
            var1.aClass482_10497 = null;
         }

         var1.method6332(-1949449864);
      }

      if(var0) {
         for(var1 = (Class526_Sub18)aClass702_10482.method8206((byte)78); var1 != null; var1 = (Class526_Sub18)aClass702_10482.method8181(1485528612)) {
            if(null != var1.aClass482_10506) {
               var1.aClass482_10506.method5770(150, -938617916);
               Class570.aClass231_7657.method3204(var1.aClass482_10506, 704699880);
               var1.aClass482_10506 = null;
            }

            var1.method6332(-1949449864);
         }

         for(var1 = (Class526_Sub18)aClass20_10483.method638(625202483); null != var1; var1 = (Class526_Sub18)aClass20_10483.method639(1364177571)) {
            if(var1.aClass482_10506 != null) {
               var1.aClass482_10506.method5770(150, -938617916);
               Class570.aClass231_7657.method3204(var1.aClass482_10506, -17546009);
               var1.aClass482_10506 = null;
            }

            var1.method6332(-1949449864);
         }
      }

   }

   void method9432() {
      int var1 = 1520182179 * this.anInt10508;
      if(this.aClass610_10501 != null) {
         Class610 var2 = this.aClass610_10501.method7179(Class242.aClass94_2456, (Interface19)(4 == 378016543 * client.anInt11073?Class189.anInterface19_2154:Class242.aClass94_2456), (byte)-94);
         if(null != var2) {
            this.anInt10508 = 1429404551 * var2.anInt7992;
            this.anInt10488 = -1934557329 * (var2.anInt7935 * -715291895 << 9);
            this.anInt10493 = var2.anInt7995 * 390273931;
            this.anInt10492 = var2.anInt7972 * 1457613419;
            this.anInt10507 = var2.anInt7997 * 1146814871;
            this.anIntArray10510 = var2.anIntArray7998;
            this.anInt10504 = var2.anInt7947 * -2048547817;
            this.anInt10503 = var2.anInt8006 * -98908643;
         } else {
            this.anInt10508 = 1225578485;
            this.anInt10488 = 0;
            this.anInt10493 = 0;
            this.anInt10492 = 0;
            this.anInt10507 = 0;
            this.anIntArray10510 = null;
            this.anInt10504 = 1339953408;
            this.anInt10503 = 1121573120;
            this.anInt10491 = 0;
         }
      } else if(this.aClass639_Sub1_Sub2_Sub1_Sub2_10495 != null) {
         int var4 = Class99.method1282(this.aClass639_Sub1_Sub2_Sub1_Sub2_10495, -1983677771);
         if(var1 != var4) {
            this.anInt10508 = var4 * -1225578485;
            NPCDef var3 = this.aClass639_Sub1_Sub2_Sub1_Sub2_10495.def;
            if(var3.morphisms != null) {
               var3 = var3.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            }

            if(null != var3) {
               this.anInt10488 = (var3.anInt3332 * 824599275 << 9) * -1934557329;
               this.anInt10491 = -1137973309 * (-1944680939 * var3.anInt3326 << 9);
               this.anInt10493 = var3.anInt3359 * 1061153107;
               this.anInt10504 = var3.anInt3369 * 558118373;
               this.anInt10503 = var3.anInt3301 * 1038318735;
            } else {
               this.anInt10491 = 0;
               this.anInt10488 = 0;
               this.anInt10493 = 0;
               this.anInt10504 = 1339953408;
               this.anInt10503 = 1121573120;
            }
         }
      } else if(null != this.aClass639_Sub1_Sub2_Sub1_Sub1_10496) {
         this.anInt10508 = Class149_Sub1.method8355(this.aClass639_Sub1_Sub2_Sub1_Sub1_10496, 811221711) * -1225578485;
         this.anInt10488 = (this.aClass639_Sub1_Sub2_Sub1_Sub1_10496.anInt12179 * -1469591895 << 9) * -1934557329;
         this.anInt10491 = 0;
         this.anInt10493 = this.aClass639_Sub1_Sub2_Sub1_Sub1_10496.anInt12180 * 385174739;
         this.anInt10504 = 1339953408;
         this.anInt10503 = 1121573120;
      }

      if(1520182179 * this.anInt10508 != var1 && this.aClass482_10506 != null && null != this.aClass482_10506) {
         this.aClass482_10506.method5770(100, -938617916);
         Class570.aClass231_7657.method3204(this.aClass482_10506, 1661916823);
         this.aClass482_10506 = null;
      }

   }

   public static void method9433() {
      Class526_Sub18 var0;
      for(var0 = (Class526_Sub18)aClass702_10505.method8206((byte)55); null != var0; var0 = (Class526_Sub18)aClass702_10505.method8181(1110051793)) {
         if(var0.aBool10499) {
            var0.method9429(1580598696);
         }
      }

      for(var0 = (Class526_Sub18)aClass702_10482.method8206((byte)35); var0 != null; var0 = (Class526_Sub18)aClass702_10482.method8181(777714511)) {
         if(var0.aBool10499) {
            var0.method9429(1536711205);
         }
      }

   }
}
