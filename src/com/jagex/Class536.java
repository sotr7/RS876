package com.jagex;

import com.jagex.Class103;
import com.jagex.Class16;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class267;
import com.jagex.Class315_Sub1;
import com.jagex.Class37;
import com.jagex.Class387;
import com.jagex.Class396;
import com.jagex.Class470;
import com.jagex.Class478;
import com.jagex.Class521;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class529;
import com.jagex.Class530;
import com.jagex.Class549;
import com.jagex.Class577;
import com.jagex.Class596;
import com.jagex.RSSocket;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub5;
import com.jagex.Class667;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.client;
import java.util.Iterator;
import java.util.LinkedList;

public class Class536 {
   boolean aBool7198;
   LinkedList aLinkedList7202;
   public Class168 aClass168_7201;
   static int anInt7200 = 0;
   int anInt7197;
   int anInt7199;
   int[] anIntArray7196;
   int[] anIntArray7203;

   public void method6405(Class549 var1, int var2) {
      if(null != var1 && this.anInt7199 * 19011213 > 0) {
         this.method6407(var1, 9698181);
         Iterator var3 = this.aLinkedList7202.iterator();

         while(var3.hasNext()) {
            Class639_Sub1_Sub2_Sub5 var4 = (Class639_Sub1_Sub2_Sub5)var3.next();
            var1.method6579(var4, false, 65536);
         }

         this.aBool7198 = true;
      }

   }

   public void method6406(Class549 var1, byte var2) {
      if(null != var1 && null != this.aLinkedList7202) {
         Iterator var3 = this.aLinkedList7202.iterator();

         while(var3.hasNext()) {
            Class639_Sub1_Sub2_Sub5 var4 = (Class639_Sub1_Sub2_Sub5)var3.next();
            var1.method6628(var4.aByte10827, var4.aShort11803, var4.aShort11799, new Class530(var4), -1559629927);
         }
      }

   }

   void method6407(Class549 var1, int var2) {
      this.aLinkedList7202 = new LinkedList();
      Class470 var3 = client.aClass505_11204.method6094((byte)4);
      Class596 var4 = client.aClass505_11204.method6128(1945491709);
      Class596 var5 = new Class596(Class692.anInt8703 * -395336755, this.anIntArray7196[0], this.anIntArray7203[0]);

      for(int var6 = 1; var6 < 19011213 * this.anInt7199; ++var6) {
         Class596 var7 = new Class596(-395336755 * Class692.anInt8703, this.anIntArray7196[var6], this.anIntArray7203[var6]);

         while(-814686591 * var5.localX != -814686591 * var7.localX || -845789331 * var5.localY != var7.localY * -845789331) {
            if(-814686591 * var5.localX < -814686591 * var7.localX) {
               var5.localX += -850304639;
            } else if(-814686591 * var5.localX > -814686591 * var7.localX) {
               var5.localX -= -850304639;
            }

            if(-845789331 * var5.localY < -845789331 * var7.localY) {
               var5.localY += -108012955;
            } else if(var5.localY * -845789331 > -845789331 * var7.localY) {
               var5.localY -= -108012955;
            }

            int var8 = Class692.anInt8703 * -395336755;
            int var9 = -814686591 * var5.localX - -814686591 * var4.localX;
            int var10 = var5.localY * -845789331 - -845789331 * var4.localY;
            if(var9 >= 0 && var9 < -447634797 * var1.anInt7285 && var10 >= 0 && var10 < var1.anInt7286 * 1913648871) {
               int var11 = 256 + (var9 << 9);
               int var12 = 256 + (var10 << 9);
               if(var3.method5614(var9, var10, -292232260)) {
                  ++var8;
               }

               this.aLinkedList7202.add(new Class639_Sub1_Sub2_Sub5(var1, this, Class692.anInt8703 * -395336755, var8, var11, Class387.method4762(var11, var12, Class692.anInt8703 * -395336755, 1066816642), var12));
            }
         }

         var5 = var7;
      }

   }

   public void method6408(int var1) {
      this.aBool7198 = false;
      this.aClass168_7201 = null;
   }

   Class168 method6409(Class174 var1, byte var2) {
      Class170 var3 = Class170.method2146(Class577.aClass466_7744, -373292247 * this.anInt7197, 0);
      if(null == var3) {
         return null;
      } else {
         if(var3.anInt1942 < 13) {
            var3.method2148(2);
         }

         return var1.method2321(var3, 2048, 1917174537 * anInt7200, 64, 768);
      }
   }

   public boolean method6410(Class174 var1, int var2) {
      this.aClass168_7201 = this.method6409(var1, (byte)-112);
      return null != this.aClass168_7201;
   }

   public boolean method6411(int var1) {
      return this.aBool7198;
   }

   public static void method6412(int var0) {
      anInt7200 = var0 * 285260601;
   }

   public boolean method6413() {
      return this.aBool7198;
   }

   public void method6414() {
      this.aBool7198 = false;
      this.aClass168_7201 = null;
   }

   public Class536(Class174 var1, RSByteBuffer var2, int var3) {
      this.anInt7197 = var3 * -592361191;
      this.anInt7199 = var2.readUnsignedSmart(1264146745) * -1730503611;
      this.anIntArray7196 = new int[19011213 * this.anInt7199];
      this.anIntArray7203 = new int[19011213 * this.anInt7199];
      int var4 = var2.readUnsignedShort(1673127010);
      int var5 = var2.readUnsignedShort(616019071);

      for(int var6 = 0; var6 < 19011213 * this.anInt7199; ++var6) {
         this.anIntArray7196[var6] = var4 + var2.readByte((byte)107);
         this.anIntArray7203[var6] = var5 + var2.readByte((byte)45);
      }

      this.aClass168_7201 = this.method6409(var1, (byte)-73);
   }

   public static void method6415(int var0) {
      anInt7200 = var0 * 285260601;
   }

   public boolean method6416() {
      return this.aBool7198;
   }

   public boolean method6417() {
      return this.aBool7198;
   }

   public boolean method6418() {
      return this.aBool7198;
   }

   static final void method6419(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)7);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class396.method4818(var3, var4, var0, -1210666225);
   }

   static final void method6420(InterfaceDef var0, Class681 var1, int var2) {
      var1.anInt8623 -= -1957887669;
      int var3 = var1.anIntArray8622[var1.anInt8623 * -1730576285] - 1;
      if(var3 >= 0 && var3 <= 9) {
         Class267.method3574(var0, var3, var1, -1824735662);
      } else {
         throw new RuntimeException();
      }
   }

   static final void method6421(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)115);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class529.method6371(var3, var4, var0, -1780233408);
   }

   static final void method6422(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.anInt10984 * 405067105;
   }

   static final void method6423(Class681 var0, byte var1) {
      var0.anInt8623 -= -1957887669;
   }

   public static void method6424(String var0, int var1, int var2) {
      if(null == Class16.aClass6_179) {
         Class16.aClass6_179 = new RSSocket();
      }

      Class16.aClass6_179.address = var0;
      Class16.aClass6_179.id = (1099 + var1) * -1052717481;
      Class16.aClass6_179.port = Class478.method5665(Class521.aClass684_7051, Class667.aClass667_8529, -2107114137 * Class16.aClass6_179.id, 1728763872) * 1408805223;
      Class16.aClass6_179.securePort = Class37.method845(Class521.aClass684_7051, Class667.aClass667_8529, Class16.aClass6_179.id * -2107114137, 2100077763) * 1633433681;
   }

   static final void method6425(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      int var3 = var2 >> 16;
      if(Class315_Sub1.aClass243Array10033[var3] == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class315_Sub1.aClass243Array10033[var3].aClass245Array2459[var2].anInt2495 * 438453121;
      }

   }

   static final void method6426(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(3 == 378016543 * client.anInt11073) {
         int var8 = Class103.anInt1270 * 1609310241;
         int[] var9 = Class103.anIntArray1276;

         int var10;
         for(var10 = 0; var10 < var8; ++var10) {
            Class639_Sub1_Sub2_Sub1_Sub1 var11 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var9[var10]];
            if(var11 != null) {
               var11.method10802(var0, var1, var2, var3, var4, var5, var6, -697208540);
            }
         }

         for(var10 = 0; var10 < 1139938345 * client.npcCount; ++var10) {
            int var13 = client.npcsIndicies[var10];
            LinkableObject var12 = (LinkableObject)client.npcs.get((long)var13);
            if(null != var12) {
               ((Class639_Sub1_Sub2_Sub1)var12.anObject10399).method10802(var0, var1, var2, var3, var4, var5, var6, 1379651147);
            }
         }

      }
   }
}
