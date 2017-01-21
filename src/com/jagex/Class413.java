package com.jagex;

import com.jagex.Class115;
import com.jagex.Class116;
import com.jagex.Class199_Sub17;
import com.jagex.Class230;
import com.jagex.Class24;
import com.jagex.OutFrame;
import com.jagex.Class454;
import com.jagex.Class465;
import com.jagex.Class492;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub38;
import com.jagex.Class53;
import com.jagex.Class681;
import com.jagex.Class710;
import com.jagex.client;

public class Class413 {
   int anInt4451;
   public static Class413 aClass413_4442 = new Class413(2);
   public static Class413 aClass413_4439 = new Class413(3);
   public static Class413 aClass413_4440 = new Class413(4);
   public static Class413 aClass413_4441 = new Class413(6);
   public static Class413 aClass413_4444 = new Class413(10);
   public static Class413 aClass413_4445 = new Class413(1);
   public static Class413 aClass413_4450 = new Class413(11);
   public static Class413 aClass413_4443 = new Class413(13);
   public static Class413 aClass413_4446 = new Class413(12);
   public static Class413 aClass413_4447 = new Class413(7);
   public static Class413 aClass413_4449 = new Class413(5);
   static Class413 aClass413_4438 = new Class413(9);
   static Class413 aClass413_4448 = new Class413(8);

   public String method4911(int var1) {
      return "_" + this.anInt4451 * 441872963;
   }

   public Object method4912(Object[] var1, byte var2) throws Throwable {
      return Class53.method969(Class492.anApplet5526, this.method4911(-728785532), var1, (byte)8);
   }

   public Object method4913(short var1) throws Throwable {
      return Class53.method968(Class492.anApplet5526, this.method4911(-1915605982), 1065151787);
   }

   public void method4914(Object[] var1, byte var2) {
      try {
         this.method4912(var1, (byte)1);
      } catch (Throwable var4) {
         ;
      }

   }

   public void method4915(byte var1) {
      try {
         this.method4913((short)11744);
      } catch (Throwable var3) {
         ;
      }

   }

   public String method4916() {
      return "_" + this.anInt4451 * 441872963;
   }

   public String method4917() {
      return "_" + this.anInt4451 * 441872963;
   }

   Class413(int var1) {
      this.anInt4451 = -493884821 * var1;
   }

   public Object method4918() throws Throwable {
      return Class53.method968(Class492.anApplet5526, this.method4911(-714859289), -1621065947);
   }

   public void method4919() {
      try {
         this.method4913((short)30784);
      } catch (Throwable var2) {
         ;
      }

   }

   public void method4920() {
      try {
         this.method4913((short)13314);
      } catch (Throwable var2) {
         ;
      }

   }

   public Object method4921() throws Throwable {
      return Class53.method968(Class492.anApplet5526, this.method4911(-992836408), -892053979);
   }

   static final void method4922(Class681 var0, int var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      int var5 = var0.anIntArray8622[3 + -1730576285 * var0.anInt8623];
      Class24 var6 = (Class24)Class465.aClass40_Sub17_5321.method89(var4, -2085361822);
      if(var6.aClass454_233.getId() == var2 && var6.aClass454_234.getId() == var3) {
         if(var3 == Class454.aClass454_4997.getId()) {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var6.method712(var5, 1734679744);
         } else {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var6.method706(var5, -176783735);
         }

      } else {
         throw new RuntimeException(var4 + " " + var5);
      }
   }

   static final void method4923(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub39_10617.method10173(1559049302);
   }

   public static final void method4924(boolean var0, int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4268, client.aClass111_11060.aClass14_1342, 549523693);
      client.aClass111_11060.write(var2, (byte)-85);

      for(Class526_Sub38 var3 = (Class526_Sub38)client.aClass20_11187.method638(-1031497200); null != var3; var3 = (Class526_Sub38)client.aClass20_11187.method639(-1830788242)) {
         if(!var3.method6330((byte)-106)) {
            var3 = (Class526_Sub38)client.aClass20_11187.method638(-478985751);
            if(var3 == null) {
               break;
            }
         }

         if(0 == -1233131191 * var3.anInt10685) {
            Class710.method8307(var3, true, var0, (byte)43);
         }
      }

      if(client.aClass245_11213 != null) {
         Class526_Sub31.method9555(client.aClass245_11213, (byte)10);
         client.aClass245_11213 = null;
      }

   }

   static final boolean method4925(int[][] var0, int[][] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = var3; var8 <= var5; ++var8) {
         for(int var9 = var4; var9 <= var6; ++var9) {
            if(var2 == var0[var8][var9] && var1[var8][var9] <= 1) {
               return true;
            }
         }
      }

      return false;
   }

   static void method4926(int var0) {
      if(Class116.anInt1430 * -579561805 > 0) {
         int var1 = 0;

         for(int var2 = 0; var2 < Class116.aStringArray1427.length; ++var2) {
            if(Class116.aStringArray1427[var2].indexOf("--> ") != -1) {
               ++var1;
               if(var1 == -579561805 * Class116.anInt1430) {
                  Class116.aString1429 = Class116.aStringArray1427[var2].substring(Class116.aStringArray1427[var2].indexOf(62) + 2);
                  break;
               }
            }
         }
      } else {
         Class116.aString1429 = "";
      }

   }

   static final void method4927(Class681 var0, int var1) {
      if(Class199_Sub17.anIterator9948 != null && Class199_Sub17.anIterator9948.hasNext()) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Integer)Class199_Sub17.anIterator9948.next()).intValue();
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      }

   }
}
