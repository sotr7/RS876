package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class295;
import com.jagex.Class414;
import com.jagex.Class415;
import com.jagex.Class650;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface74;
import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IcmpService_Sub1 extends IcmpService {
   static int anInt10844;
   static short aShort10845;
   static volatile IcmpService_Sub1 anIcmpService_Sub1_10842;
   List aList10843 = new ArrayList();

   protected void method1238(int var1, int var2, int var3) {
      Iterator var4 = this.aList10843.iterator();

      while(var4.hasNext()) {
         Interface74 var5 = (Interface74)var4.next();
         var5.method494(var1, var2, var3, 330435175);
      }

   }

   protected void notify(int var1) {
      Iterator var2 = this.aList10843.iterator();

      while(var2.hasNext()) {
         Interface74 var3 = (Interface74)var2.next();
         var3.method496(var1 == 0, -2036892426);
      }

   }

   protected void notify(int var1, int var2, int var3) {
      Iterator var4 = this.aList10843.iterator();

      while(var4.hasNext()) {
         Interface74 var5 = (Interface74)var4.next();
         var5.method494(var1, var2, var3, -290370456);
      }

   }

   public static boolean method9916() {
      try {
         if(!available()) {
            return false;
         }
      } catch (Throwable var1) {
         return false;
      }

      if(anIcmpService_Sub1_10842 != null) {
         throw new IllegalStateException("");
      } else {
         anIcmpService_Sub1_10842 = new IcmpService_Sub1();
         Thread var0 = new Thread(new Class650());
         var0.setDaemon(true);
         var0.start();
         return true;
      }
   }

   public static boolean method9917() {
      try {
         if(!available()) {
            return false;
         }
      } catch (Throwable var1) {
         return false;
      }

      if(anIcmpService_Sub1_10842 != null) {
         throw new IllegalStateException("");
      } else {
         anIcmpService_Sub1_10842 = new IcmpService_Sub1();
         Thread var0 = new Thread(new Class650());
         var0.setDaemon(true);
         var0.start();
         return true;
      }
   }

   public static boolean method9918() {
      try {
         if(!available()) {
            return false;
         }
      } catch (Throwable var1) {
         return false;
      }

      if(anIcmpService_Sub1_10842 != null) {
         throw new IllegalStateException("");
      } else {
         anIcmpService_Sub1_10842 = new IcmpService_Sub1();
         Thread var0 = new Thread(new Class650());
         var0.setDaemon(true);
         var0.start();
         return true;
      }
   }

   public static void method9919() {
      if(null != anIcmpService_Sub1_10842) {
         try {
            anIcmpService_Sub1_10842.quit();
         } catch (Throwable var1) {
            ;
         }

         anIcmpService_Sub1_10842 = null;
      }
   }

   protected void method1236(int var1) {
      Iterator var2 = this.aList10843.iterator();

      while(var2.hasNext()) {
         Interface74 var3 = (Interface74)var2.next();
         var3.method496(var1 == 0, -1243837919);
      }

   }

   protected void method1235(int var1) {
      Iterator var2 = this.aList10843.iterator();

      while(var2.hasNext()) {
         Interface74 var3 = (Interface74)var2.next();
         var3.method496(var1 == 0, -1813186353);
      }

   }

   protected void method1237(int var1) {
      Iterator var2 = this.aList10843.iterator();

      while(var2.hasNext()) {
         Interface74 var3 = (Interface74)var2.next();
         var3.method496(var1 == 0, -1543205614);
      }

   }

   protected void method1239(int var1, int var2, int var3) {
      Iterator var4 = this.aList10843.iterator();

      while(var4.hasNext()) {
         Interface74 var5 = (Interface74)var4.next();
         var5.method494(var1, var2, var3, -2063057132);
      }

   }

   static final void method9920(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class415.method4932(var3, var4, var0, -1978126683);
   }

   static final void method9921(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)38);
      Class295.method3962(var3, var0, (byte)8);
   }

   static final void method9922(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = null != Class414.aClass149_4465?1:0;
   }
}
