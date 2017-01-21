package com.jagex;

import com.jagex.Class169;
import com.jagex.Class174;
import com.jagex.Class238;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class289;
import com.jagex.Class299;
import com.jagex.Class304;
import com.jagex.NPCDef;
import com.jagex.Class332;
import com.jagex.Class380;
import com.jagex.Class40;
import com.jagex.Class466;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub35;
import com.jagex.Class620;
import com.jagex.Class639_Sub1;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class702;
import com.jagex.Class711_Sub20;
import com.jagex.Interface12;
import com.jagex.Interface14;

public class Class304_Sub1 extends Class304 {
   public static Class40 aClass40_10066;

   public Class method62() {
      return NPCDef.class;
   }

   public Interface12 method61(int var1, Interface14 var2) {
      return new NPCDef(var1, this, var2);
   }

   public Class method59(int var1) {
      return NPCDef.class;
   }

   public Class method63() {
      return NPCDef.class;
   }

   public Interface12 method64(int var1, Interface14 var2, int var3) {
      return new NPCDef(var1, this, var2);
   }

   Class304_Sub1(boolean var1, Class466 var2, Class673 var3, Class676 var4) {
      super(var1, var2, var3, var4);
   }

   public Class method60() {
      return NPCDef.class;
   }

   public static final void method9087(Class639_Sub1 var0, int var1, boolean var2, byte var3) {
      Class332.method4254(var0, var1, true, var2, '\uff00');
   }

   static void method9088(Class174 var0, Class702 var1, int var2, int var3, int var4) {
      Class380.aClass702_3937.method8188(-1149615502);
      if(!Class525_Sub1.aBool10723) {
         for(Class526_Sub35 var5 = (Class526_Sub35)var1.method8206((byte)19); null != var5; var5 = (Class526_Sub35)var1.method8181(432472597)) {
            Class238 var6 = (Class238)Class525_Sub1.aClass40_Sub6_7088.method89(var5.anInt10664 * -1572922363, -662852382);
            if(Class289.method3823(var6, (byte)20)) {
               boolean var7 = Class169.method2127(var0, var5, var6, var2, var3, (byte)1);
               if(var7) {
                  Class299.method3991(var0, var5, var6, (byte)75);
               }
            }
         }

      }
   }

   public static final void method9089(long var0) {
      if(var0 > 0L) {
         if(0L == var0 % 10L) {
            Class711_Sub20.method10041(var0 - 1L);
            Class711_Sub20.method10041(1L);
         } else {
            Class711_Sub20.method10041(var0);
         }

      }
   }

   static final void method9090(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class620.method7347(var3, var4, var0, 2135878266);
   }
}
