package com.jagex;

import com.jagex.Class184;
import com.jagex.Class195;
import com.jagex.Class307;
import com.jagex.Class329_Sub1;
import com.jagex.Class526_Sub32;
import com.jagex.Class681;
import com.jagex.client;

public abstract class Class184_Sub1 extends Class184 {
   static String[] aStringArray9201;

   public abstract int method8451();

   public abstract int method8452();

   public abstract int method8453(int var1, int var2);

   abstract void method8454(int var1, int var2);

   abstract void method8455(int var1, int var2);

   abstract void method8456(int var1, int var2);

   public abstract int method8457(int var1, int var2);

   public abstract int method8458(int var1, int var2);

   public abstract int method8459();

   public abstract int method8460();

   static final void method8461(Class681 var0, short var1) {
      Class526_Sub32 var2 = (Class526_Sub32)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(Class195.aClass292_Sub1_2182.method3914((byte)3) != Class307.aClass307_3293) {
         throw new RuntimeException();
      } else {
         Class329_Sub1 var3 = (Class329_Sub1)Class195.aClass292_Sub1_2182.method3941(-381971001);
         var3.method9040(var2, 298431291);
         client.aBool11070 = true;
      }
   }
}
