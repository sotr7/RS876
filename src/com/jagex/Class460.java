package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class221;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class285;
import com.jagex.Class315_Sub1;
import com.jagex.Class318_Sub2;
import com.jagex.Class339;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.Class466;
import com.jagex.Class519;
import com.jagex.PaddedResourceRequest;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub39;
import com.jagex.Class534;
import com.jagex.Class542;
import com.jagex.RenderDef;
import com.jagex.Class594;
import com.jagex.Class622;
import com.jagex.Class653;
import com.jagex.Class681;
import com.jagex.Class696;
import com.jagex.Class76;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class460 {
   int latency;
   static final int anInt5173 = 500;
   static final int anInt5174 = 500;
   static final int anInt5175 = 102400;
   static final int anInt5177 = 5;
   static final int anInt5178 = 5;
   static final int anInt5188 = 4;
   long lastAttempt;
   Class696 aClass696_5185 = new Class696();
   Class696 waitingPriorities = new Class696();
   Class696 aClass696_5180 = new Class696();
   Class696 waitingExtras = new Class696();
   RSByteBuffer outgoing = new RSByteBuffer(6);
   byte encryptionKey = 0;
   public volatile int errors = 0;
   public volatile int status = 0;
   public volatile int anInt5176 = 1045407701;
   public volatile int anInt5189 = 862227025;
   RSByteBuffer header = new RSByteBuffer(5);
   RSByteBuffer meta = new RSByteBuffer(5);
   int currentBlock = 0;
   PaddedResourceRequest current = null;

   public abstract boolean pulse(byte var1);

   public abstract boolean method5426();

   public boolean method5427(int var1) {
      return this.extras(-1892838366) >= 500;
   }

   public boolean method5428(int var1) {
      return this.priorities(-653337628) >= 500;
   }

   int extras(int var1) {
      return this.aClass696_5180.method8136(-1738203640) + this.waitingExtras.method8136(-2103762580);
   }

   public boolean method5430() {
      return this.priorities(-1893766703) >= 500;
   }

   int method5431() {
      return this.aClass696_5180.method8136(-1691334988) + this.waitingExtras.method8136(-1721533775);
   }

   abstract void method5432(int var1, int var2);

   public abstract void init(Object var1, boolean var2, int var3);

   public abstract void sendLoginState(boolean var1, short var2);

   public abstract void method5435(int var1);

   public abstract void method5436(int var1);

   public abstract void method5437(int var1);

   public boolean method5438() {
      return this.priorities(1159488834) >= 500;
   }

   public boolean method5439() {
      return this.extras(-1098389009) >= 500;
   }

   public boolean method5440() {
      return this.extras(-1986088690) >= 500;
   }

   public abstract boolean method5441();

   public int method5442() {
      return this.aClass696_5185.method8136(-1259305395) + this.waitingPriorities.method8136(-1492805158);
   }

   public boolean method5443() {
      return this.priorities(-1777403392) >= 500;
   }

   abstract void method5444(int var1, int var2, byte var3);

   PaddedResourceRequest method5445(int var1, int var2, byte var3, boolean var4, int var5) {
      long var6 = ((long)var1 << 32) + (long)var2;
      PaddedResourceRequest var8 = new PaddedResourceRequest();
      var8.cachedKey = -6405544204082582527L * var6;
      var8.padding = var3;
      var8.aBool11829 = var4;
      if(var4) {
         if(this.priorities(1190446234) >= 500) {
            throw new RuntimeException();
         }

         this.aClass696_5185.offer(var8, (byte)-73);
      } else {
         if(this.extras(-2018366494) >= 500) {
            throw new RuntimeException();
         }

         this.aClass696_5180.offer(var8, (byte)-26);
      }

      return var8;
   }

   public abstract void method5446(boolean var1);

   public int method5447() {
      return this.aClass696_5185.method8136(-1297956957) + this.waitingPriorities.method8136(-1443072666);
   }

   public abstract boolean method5448();

   public abstract boolean method5449();

   public abstract void method5450();

   public abstract void method5451(Object var1, boolean var2);

   public abstract void method5452(Object var1, boolean var2);

   public int priorities(int var1) {
      return this.aClass696_5185.method8136(-1806321980) + this.waitingPriorities.method8136(-1498292456);
   }

   int method5454() {
      return this.aClass696_5180.method8136(-2016024321) + this.waitingExtras.method8136(-1616220784);
   }

   public abstract void method5455();

   public abstract void method5456();

   public boolean method5457() {
      return this.extras(-2034249566) >= 500;
   }

   public abstract void method5458();

   public abstract void method5459(boolean var1);

   public static Class519 method5460(Class466 var0, String var1, boolean var2, int var3) {
      int var4 = var0.method5546(var1, (byte)4);
      if(var4 == -1) {
         return new Class519(0);
      } else {
         byte[] var5 = var0.method5536(var4, 1, (byte)-4);
         if(var5 == null) {
            return new Class519(0);
         } else {
            RSByteBuffer var6 = new RSByteBuffer(var5);
            int var7 = var6.readUnsignedShort(854602403);
            Class519 var8 = new Class519(var7);
            int var9 = 0;

            while(true) {
               while(var9 < -1277967837 * var8.anInt7044) {
                  int var10 = var6.readInt((byte)5);
                  int var11 = var6.readUnsignedShort(191530913);
                  int var12 = var6.readUnsignedByte(-1832669944);
                  if(!var2 && 1 == var12) {
                     var8.anInt7044 -= 38010251;
                  } else {
                     var8.anIntArray7043[var9] = var10;
                     var8.anIntArray7045[var9] = var11;
                     ++var9;
                  }
               }

               return var8;
            }
         }
      }
   }

   static final void method5461(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)19);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class534.method6397(var3, var4, var0, 2143840933);
   }

   static final void method5462(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 - var3;
   }

   static final void method5463(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class622.aClass455_8143.method5398(var2, (byte)105).aCharArray11850[var3];
   }

   public static byte[] method5464(Object var0, boolean var1, int var2) {
      if(null == var0) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var5 = (byte[])((byte[])var0);
         return var1?Arrays.copyOf(var5, var5.length):var5;
      } else if(var0 instanceof ByteBuffer) {
         ByteBuffer var3 = (ByteBuffer)var0;
         byte[] var4 = new byte[var3.capacity()];
         var3.position(0);
         var3.get(var4);
         return var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static void method5465(Class681 var0, int var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[var0.anInt8623 * -1730576285 - 2], -727680493)).method3792(Class242.aClass94_2456, var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1], 1339850390)?1:0;
      var0.anInt8623 -= -1957887669;
   }

   public static final void method5466(int var0, byte var1) {
      if(null != Class318_Sub2.aClass526_Sub9_10065) {
         if(var0 >= 0 && var0 < Class318_Sub2.aClass526_Sub9_10065.anInt10400 * 1763792899) {
            Class339 var2 = Class318_Sub2.aClass526_Sub9_10065.aClass339Array10402[var0];
            if(-1 == var2.aByte3526) {
               Class111 var3 = Class452_Sub4.method9295((byte)51);
               OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4190, var3.aClass14_1342, -10023661);
               var4.out.writeByte(2 + Class594.method7039(var2.aString3528, -865120945), -750118822);
               var4.out.writeShort(var0, -805078716);
               var4.out.method9616(var2.aString3528, 27097978);
               var3.write(var4, (byte)19);
            }
         }
      }
   }

   static void method5467(Class526_Sub39 var0, int var1, int var2) {
      Object[] var3 = var0.anObjectArray10701;
      int var4 = ((Integer)var3[0]).intValue();
      Class526_Sub21_Sub19 var5 = Class542.method6485(var4, -1398482913);
      if(var5 != null) {
         Class681 var6 = RenderDef.method6932((byte)-76);
         var6.anIntArray8643 = new int[var5.anInt11865 * -2142922607];
         int var7 = 0;
         var6.anObjectArray8618 = new String[-790376653 * var5.anInt11869];
         int var8 = 0;
         var6.aLongArray8619 = new long[-1134111333 * var5.anInt11864];
         int var9 = 0;

         for(int var10 = 1; var10 < var3.length; ++var10) {
            if(var3[var10] instanceof Integer) {
               int var11 = ((Integer)var3[var10]).intValue();
               if(-2147483647 == var11) {
                  var11 = -766601427 * var0.anInt10695;
               }

               if(var11 == -2147483646) {
                  var11 = -1512111997 * var0.anInt10696;
               }

               if(-2147483645 == var11) {
                  var11 = var0.aClass245_10694 != null?var0.aClass245_10694.uid * 919258769:-1;
               }

               if(-2147483644 == var11) {
                  var11 = var0.anInt10692 * 287085743;
               }

               if(var11 == -2147483643) {
                  var11 = var0.aClass245_10694 != null?1300712985 * var0.aClass245_10694.componentSlot:-1;
               }

               if(-2147483642 == var11) {
                  var11 = var0.aClass245_10698 != null?919258769 * var0.aClass245_10698.uid:-1;
               }

               if(var11 == -2147483641) {
                  var11 = var0.aClass245_10698 != null?1300712985 * var0.aClass245_10698.componentSlot:-1;
               }

               if(-2147483640 == var11) {
                  var11 = var0.anInt10699 * 46050575;
               }

               if(var11 == -2147483639) {
                  var11 = var0.anInt10700 * 1184373421;
               }

               var6.anIntArray8643[var7++] = var11;
            } else if(var3[var10] instanceof String) {
               String var14 = (String)var3[var10];
               if(var14.equals("event_opbase")) {
                  var14 = var0.aString10697;
               }

               var6.anObjectArray8618[var8++] = var14;
            } else if(var3[var10] instanceof Long) {
               long var12 = ((Long)var3[var10]).longValue();
               var6.aLongArray8619[var9++] = var12;
            }
         }

         var6.anInt8640 = var0.anInt10702 * 1720081363;
         Class653.method7792(var5, var1, var6, (byte)-72);
         var6.anInt8640 = 0;
      }
   }
}
