package com.jagex;

import com.jagex.Class103;
import com.jagex.Class166;
import com.jagex.Class179;
import com.jagex.Class207;
import com.jagex.Class214;
import com.jagex.Class217;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class458;
import com.jagex.Class482;
import com.jagex.Class515;
import com.jagex.Class526_Sub21_Sub10;
import com.jagex.LinkableObject;
import com.jagex.Class533;
import com.jagex.Class54;
import com.jagex.Class554;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class645;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class88;
import com.jagex.Interface57;
import com.jagex.client;
import java.awt.EventQueue;

class Class495 implements Interface57 {
   static EventQueue anEventQueue5540;
   // $FF: synthetic field
   Class482 this$0;

   public byte[] method377(int var1) {
      return this.this$0.anInterface70_5469.method446(var1, (byte)0);
   }

   public byte[] method373(int var1, byte var2) {
      return this.this$0.anInterface70_5469.method446(var1, (byte)0);
   }

   public byte[] method374(int var1) {
      return this.this$0.anInterface70_5469.method446(var1, (byte)0);
   }

   public byte[] method376(int var1) {
      return this.this$0.anInterface70_5469.method446(var1, (byte)0);
   }

   public byte[] method375(int var1) {
      return this.this$0.anInterface70_5469.method446(var1, (byte)0);
   }

   public byte[] method372(int var1) {
      return this.this$0.anInterface70_5469.method446(var1, (byte)0);
   }

   Class495(Class482 var1) {
      this.this$0 = var1;
   }

   public static int method5910(int var0, int var1) {
      double var2 = (double)(var0 >> 16 & 255) / 256.0D;
      double var4 = (double)(var0 >> 8 & 255) / 256.0D;
      double var6 = (double)(var0 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if(var8 != var10) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if(var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      int var18 = (int)(var12 * 256.0D);
      int var19 = (int)(var14 * 256.0D);
      int var20 = (int)(256.0D * var16);
      if(var19 < 0) {
         var19 = 0;
      } else if(var19 > 255) {
         var19 = 255;
      }

      if(var20 < 0) {
         var20 = 0;
      } else if(var20 > 255) {
         var20 = 255;
      }

      if(var20 > 243) {
         var19 >>= 4;
      } else if(var20 > 217) {
         var19 >>= 3;
      } else if(var20 > 192) {
         var19 >>= 2;
      } else if(var20 > 179) {
         var19 >>= 1;
      }

      return (var20 >> 1) + ((var18 & 255) >> 2 << 10) + (var19 >> 5 << 7);
   }

   static final void method5911(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class179.method2674(var3, var4, var0, 1511023883);
   }

   static final void method5912(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class526_Sub21_Sub10 var4 = Class515.method6210(var2, var3, (byte)42);
      if(null != var4) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4.anInt11729 * 731545197;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class214.method2962(var4.aLong11722 * 9208759340883999679L, -398271091 * Class26.aClass673_247.anInt8576, '\uffff');
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4.anInt11723 * -1204898995;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = null != var4.aString11724?var4.aString11724:"";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = null != var4.aString11725?var4.aString11725:"";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = null != var4.aString11726?var4.aString11726:"";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var4.aString11727 != null?var4.aString11727:"";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1683330373 * var4.anInt11730;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var4.aString11728 != null?var4.aString11728:"";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4.aClass415_11720 != null?var4.aClass415_11720.getId():-1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      }

   }

   static final void method5913(byte var0) {
      int[] var1 = Class103.anIntArray1276;

      int var2;
      for(var2 = 0; var2 < 1609310241 * Class103.anInt1270; ++var2) {
         Class639_Sub1_Sub2_Sub1_Sub1 var3 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1[var2]];
         if(null != var3) {
            var3.method10789(-1516189765);
         }
      }

      for(var2 = 0; var2 < 1139938345 * client.npcCount; ++var2) {
         long var4 = (long)client.npcsIndicies[var2];
         LinkableObject var6 = (LinkableObject)client.npcs.get(var4);
         if(var6 != null) {
            ((Class639_Sub1_Sub2_Sub1)var6.anObject10399).method10789(-1516189765);
         }
      }

      if(4 == 378016543 * client.anInt11073) {
         for(var2 = 0; var2 < Class645.aClass207Array8445.length; ++var2) {
            Class207 var7 = Class645.aClass207Array8445[var2];
            if(var7.aBool2251) {
               var7.method2913((byte)107).method10789(-1516189765);
            }
         }
      }

   }

   static final void method5914(short var0) {
      Class217.method2991(Class554.aClass174_7475, (long)client.anInt11012);
      if(-1 != -327748687 * client.anInt11186) {
         Class88.method1189(client.anInt11186 * -327748687, (byte)-1);
      }

      int var1;
      for(var1 = 0; var1 < -178271659 * client.anInt11244; ++var1) {
         client.aBoolArray11195[var1] = client.aBoolArray11236[var1];
         client.aBoolArray11236[var1] = false;
      }

      client.anInt11245 = client.anInt11012 * 680446439;
      if(-327748687 * client.anInt11186 != -1) {
         client.anInt11244 = 0;
         Class54.method982(-434163642);
      }

      Class554.aClass174_7475.method2278();
      Class533.method6395(Class554.aClass174_7475, 816868066);
      var1 = Class166.method1932(-4831732);
      if(var1 == -1) {
         var1 = -877016159 * client.anInt11178;
      }

      if(-1 == var1) {
         var1 = client.anInt11177 * -385022107;
      }

      Class458.method5417(var1, -1778941237);
      client.anInt11225 = 0;
   }
}
