package com.jagex;

import com.jagex.Class192;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class37;
import com.jagex.Class478;
import com.jagex.Class509;
import com.jagex.Class521;
import com.jagex.RSByteBuffer;
import com.jagex.Class612_Sub1;
import com.jagex.Class667;
import com.jagex.Class681;
import com.jagex.Interface12;
import com.jagex.Interface5;
import com.jagex.client;

public class Class84 implements Interface12, Interface5 {
   static int[] anIntArray851;
   public static int anInt852;
   public int anInt849 = 0;
   public int anInt847 = 879081472;
   public int anInt850 = -1381562368;
   public int anInt848 = 0;

   public void method81(int var1) {
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(76242089);
         if(0 == var3) {
            return;
         }

         this.method1175(var1, var3, 469748625);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1501867784);
         if(0 == var2) {
            return;
         }

         this.method1175(var1, var2, 1687970232);
      }
   }

   public void method49(int var1, int var2) {
   }

   void method1175(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt849 = var1.readUnsignedByte(872651895) * -459402409;
      } else if(2 == var2) {
         this.anInt847 = var1.readUnsignedShort(24582980) * 323390647;
      } else if(3 == var2) {
         this.anInt850 = var1.readUnsignedShort(1757952376) * -1131039519;
      } else if(var2 == 4) {
         this.anInt848 = var1.readShort((byte)1) * -1852242607;
      }

   }

   void method1176(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt849 = var1.readUnsignedByte(-870889389) * -459402409;
      } else if(2 == var2) {
         this.anInt847 = var1.readUnsignedShort(1327713155) * 323390647;
      } else if(3 == var2) {
         this.anInt850 = var1.readUnsignedShort(711758253) * -1131039519;
      } else if(var2 == 4) {
         this.anInt848 = var1.readShort((byte)1) * -1852242607;
      }

   }

   public void method85() {
   }

   public void method50(int var1) {
   }

   public void method51(int var1) {
   }

   void method1177(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt849 = var1.readUnsignedByte(582847370) * -459402409;
      } else if(2 == var2) {
         this.anInt847 = var1.readUnsignedShort(1793080323) * 323390647;
      } else if(3 == var2) {
         this.anInt850 = var1.readUnsignedShort(1348487387) * -1131039519;
      } else if(var2 == 4) {
         this.anInt848 = var1.readShort((byte)1) * -1852242607;
      }

   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(2056337951);
         if(0 == var2) {
            return;
         }

         this.method1175(var1, var2, -28256997);
      }
   }

   static String method1178(InterfaceDef var0, int var1) {
      return client.method10311(var0).method9461((byte)0) == 0?null:(null != var0.aString2624 && var0.aString2624.trim().length() != 0?var0.aString2624:(client.aBool11192?"Hidden-use":null));
   }

   static final void method1179(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      String var3 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      int var4 = Class478.method5665(Class521.aClass684_7051, Class667.aClass667_8530, var2, 1970337308);
      int var5 = Class37.method845(Class521.aClass684_7051, Class667.aClass667_8530, var2, 1117618826);
      if(0 == -558705405 * client.anInt11038 && !Class509.method6166(-1659840455)) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class298.method3982(var2, var3, var4, var5, 1673252833)?1:0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method1180(Class681 var0, byte var1) {
      Class612_Sub1 var2 = Class192.method2789(232024215);
      if(null != var2) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anInt10815 * 1896291335;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -2015558303 * var2.anInt8023;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.aString10816;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.method9794(204183475);
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.method9795(-101484739);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anInt8027 * 285278699;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anInt10814 * -2134698331;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.aString10813;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }
}
