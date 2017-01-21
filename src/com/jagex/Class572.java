package com.jagex;

import com.jagex.Class143;
import com.jagex.Class153;
import com.jagex.Class173;
import com.jagex.Class174;
import com.jagex.Class181;
import com.jagex.Class195;
import com.jagex.InterfaceDef;
import com.jagex.Class317;
import com.jagex.Class446;
import com.jagex.Class452;
import com.jagex.Class466;
import com.jagex.RSByteBuffer;
import com.jagex.Class568;
import com.jagex.Class627;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class709;
import com.jagex.Exception_Sub2;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface17;
import com.jagex.Interface19;

public class Class572 implements Interface12 {
   public static final int anInt7662 = 0;
   public static final int anInt7663 = 1;
   static final int anInt7664 = 16777215;
   static final int anInt7665 = 70;
   public static final int anInt7666 = -1;
   public boolean aBool7676 = false;
   public int anInt7667 = 474758487;
   public int anInt7668 = 1617311089;
   public int anInt7659 = -319022946;
   int anInt7670 = -516923433;
   int anInt7680 = -2053729221;
   int anInt7672 = -240868153;
   int anInt7673 = -200565215;
   public int anInt7674 = 0;
   public int anInt7675 = 0;
   public int anInt7661 = -1781610977;
   String aString7677 = "";
   public int anInt7678 = 1285170025;
   public int anInt7679 = 0;
   public int anInt7684 = 0;
   public int anInt7681 = 0;
   int anInt7685 = 250037475;
   int anInt7671 = -2117352017;
   int anInt7669 = -470199233;
   int anInt7686 = 275785829;
   Class568 aClass568_7660;
   Interface14 anInterface14_7683;
   public int[] anIntArray7682;

   public void method85() {
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(602978055);
         if(var3 == 0) {
            return;
         }

         this.method6897(var1, var3, -1134957729);
      }
   }

   Class572(int var1, Class568 var2, Interface14 var3) {
      this.aClass568_7660 = var2;
      this.anInterface14_7683 = var3;
   }

   void method6897(RSByteBuffer var1, int var2, int var3) {
      if(1 == var2) {
         this.anInt7667 = var1.readBigSmart((byte)41) * -474758487;
      } else if(var2 == 2) {
         this.anInt7668 = var1.read24BitInt(742041327) * 781830799;
         this.aBool7676 = true;
      } else if(3 == var2) {
         this.anInt7670 = var1.readBigSmart((byte)50) * 516923433;
      } else if(var2 == 4) {
         this.anInt7672 = var1.readBigSmart((byte)67) * 240868153;
      } else if(var2 == 5) {
         this.anInt7680 = var1.readBigSmart((byte)-93) * 2053729221;
      } else if(6 == var2) {
         this.anInt7673 = var1.readBigSmart((byte)14) * 200565215;
      } else if(7 == var2) {
         this.anInt7674 = var1.readShort((byte)1) * 1877771469;
      } else if(var2 == 8) {
         this.aString7677 = var1.method9637(-1495866034);
      } else if(9 == var2) {
         this.anInt7659 = var1.readUnsignedShort(407693423) * -2090684443;
      } else if(10 == var2) {
         this.anInt7675 = var1.readShort((byte)1) * -1391672435;
      } else if(var2 == 11) {
         this.anInt7661 = 0;
      } else if(var2 == 12) {
         this.anInt7678 = var1.readUnsignedByte(-375880016) * -1285170025;
      } else if(13 == var2) {
         this.anInt7679 = var1.readShort((byte)1) * -488836807;
      } else if(var2 == 14) {
         this.anInt7661 = var1.readUnsignedShort(1057741457) * 1781610977;
      } else if(16 == var2) {
         this.anInt7684 = var1.readShort((byte)1) * 1583251245;
         this.anInt7681 = var1.readShort((byte)1) * 1240812145;
      } else if(17 != var2 && 18 != var2) {
         if(var2 == 19) {
            this.anInt7669 = var1.readUnsignedShort(1319728577) * -470199233;
         } else if(20 == var2) {
            this.anInt7686 = var1.readUnsignedShort(828095802) * 275785829;
         }
      } else {
         this.anInt7685 = var1.readUnsignedShort(1608189325) * -250037475;
         if('\uffff' == this.anInt7685 * 2113920821) {
            this.anInt7685 = 250037475;
         }

         this.anInt7671 = var1.readUnsignedShort(2111430280) * 2117352017;
         if(this.anInt7671 * 460279473 == '\uffff') {
            this.anInt7671 = -2117352017;
         }

         int var4 = -1;
         if(var2 == 18) {
            var4 = var1.readUnsignedShort(1164814881);
            if(var4 == '\uffff') {
               var4 = -1;
            }
         }

         int var5 = var1.readUnsignedByte(2132631827);
         this.anIntArray7682 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.anIntArray7682[var6] = var1.readUnsignedShort(894219570);
            if(this.anIntArray7682[var6] == '\uffff') {
               this.anIntArray7682[var6] = -1;
            }
         }

         this.anIntArray7682[var5 + 1] = var4;
      }

   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(633748326);
         if(var2 == 0) {
            return;
         }

         this.method6897(var1, var2, 1792140282);
      }
   }

   public Class153 method6898(Class174 var1) {
      if(this.anInt7670 * -106300391 < 0) {
         return null;
      } else {
         Class153 var2 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7670 * -106300391));
         if(var2 == null) {
            this.method6900(var1, 1705818315);
            var2 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(-106300391 * this.anInt7670));
         }

         return var2;
      }
   }

   public Class153 method6899(Class174 var1, int var2) {
      if(-1770481121 * this.anInt7673 < 0) {
         return null;
      } else {
         Class153 var3 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7673 * -1770481121));
         if(null == var3) {
            this.method6900(var1, 1705818315);
            var3 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7673 * -1770481121));
         }

         return var3;
      }
   }

   void method6900(Class174 var1, int var2) {
      Class466 var3 = this.aClass568_7660.aClass466_7615;
      Class173 var4;
      if(this.anInt7670 * -106300391 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(-106300391 * this.anInt7670)) == null && var3.method5537(-106300391 * this.anInt7670, (byte)70)) {
         var4 = Class181.method2680(var3, -106300391 * this.anInt7670);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var4, true), (long)(-106300391 * this.anInt7670));
      }

      if(this.anInt7680 * 115661581 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7680 * 115661581)) == null && var3.method5537(this.anInt7680 * 115661581, (byte)44)) {
         var4 = Class181.method2680(var3, this.anInt7680 * 115661581);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var4, true), (long)(115661581 * this.anInt7680));
      }

      if(517546761 * this.anInt7672 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(517546761 * this.anInt7672)) == null && var3.method5537(this.anInt7672 * 517546761, (byte)45)) {
         var4 = Class181.method2680(var3, 517546761 * this.anInt7672);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var4, true), (long)(this.anInt7672 * 517546761));
      }

      if(-1770481121 * this.anInt7673 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(-1770481121 * this.anInt7673)) == null && var3.method5537(-1770481121 * this.anInt7673, (byte)71)) {
         var4 = Class181.method2680(var3, this.anInt7673 * -1770481121);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var4, true), (long)(this.anInt7673 * -1770481121));
      }

   }

   public void method81(int var1) {
   }

   public String method6901(int var1, int var2) {
      String var3 = this.aString7677;
      var1 = var1 * this.anInt7669 * 1862835135 / (221399405 * this.anInt7686);

      while(true) {
         int var4 = var3.indexOf("%1");
         if(var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + Class627.method7463(var1, false, 1889784342) + var3.substring(var4 + 2);
      }
   }

   public Class153 method6902(Class174 var1, int var2) {
      if(517546761 * this.anInt7672 < 0) {
         return null;
      } else {
         Class153 var3 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(517546761 * this.anInt7672));
         if(var3 == null) {
            this.method6900(var1, 1705818315);
            var3 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7672 * 517546761));
         }

         return var3;
      }
   }

   public final Class572 method6903(Interface17 var1, Interface19 var2, int var3) {
      int var4 = -1;
      if(this.anIntArray7682 == null) {
         return this;
      } else if(var1 != null && var2 != null) {
         if(2113920821 * this.anInt7685 != -1) {
            Class317 var5 = var1.method109(2113920821 * this.anInt7685, '\uff00');
            if(null != var5) {
               var4 = var2.method116(var5, (byte)18);
            }
         } else if(-1 != 460279473 * this.anInt7671) {
            Class143 var6 = var1.method106(Class452.aClass452_4946, this.anInt7671 * 460279473, -88956845);
            if(var6 != null) {
               var4 = var2.method114(var6, 1784578086);
            }
         }

         if(var4 >= 0 && var4 < this.anIntArray7682.length - 1) {
            return this.anIntArray7682[var4] == -1?null:(Class572)this.anInterface14_7683.method89(this.anIntArray7682[var4], 94718028);
         } else {
            int var7 = this.anIntArray7682[this.anIntArray7682.length - 1];
            return var7 != -1?(Class572)this.anInterface14_7683.method89(var7, -99184431):null;
         }
      } else {
         return null;
      }
   }

   public Class153 method6904(Class174 var1, byte var2) {
      if(this.anInt7670 * -106300391 < 0) {
         return null;
      } else {
         Class153 var3 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7670 * -106300391));
         if(var3 == null) {
            this.method6900(var1, 1705818315);
            var3 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(-106300391 * this.anInt7670));
         }

         return var3;
      }
   }

   public Class153 method6905(Class174 var1) {
      if(this.anInt7670 * -106300391 < 0) {
         return null;
      } else {
         Class153 var2 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7670 * -106300391));
         if(var2 == null) {
            this.method6900(var1, 1705818315);
            var2 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(-106300391 * this.anInt7670));
         }

         return var2;
      }
   }

   void method6906(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt7667 = var1.readBigSmart((byte)-1) * -474758487;
      } else if(var2 == 2) {
         this.anInt7668 = var1.read24BitInt(742041327) * 781830799;
         this.aBool7676 = true;
      } else if(3 == var2) {
         this.anInt7670 = var1.readBigSmart((byte)5) * 516923433;
      } else if(var2 == 4) {
         this.anInt7672 = var1.readBigSmart((byte)43) * 240868153;
      } else if(var2 == 5) {
         this.anInt7680 = var1.readBigSmart((byte)-10) * 2053729221;
      } else if(6 == var2) {
         this.anInt7673 = var1.readBigSmart((byte)-12) * 200565215;
      } else if(7 == var2) {
         this.anInt7674 = var1.readShort((byte)1) * 1877771469;
      } else if(var2 == 8) {
         this.aString7677 = var1.method9637(-1495866034);
      } else if(9 == var2) {
         this.anInt7659 = var1.readUnsignedShort(1862168774) * -2090684443;
      } else if(10 == var2) {
         this.anInt7675 = var1.readShort((byte)1) * -1391672435;
      } else if(var2 == 11) {
         this.anInt7661 = 0;
      } else if(var2 == 12) {
         this.anInt7678 = var1.readUnsignedByte(-1805333726) * -1285170025;
      } else if(13 == var2) {
         this.anInt7679 = var1.readShort((byte)1) * -488836807;
      } else if(var2 == 14) {
         this.anInt7661 = var1.readUnsignedShort(1596492609) * 1781610977;
      } else if(16 == var2) {
         this.anInt7684 = var1.readShort((byte)1) * 1583251245;
         this.anInt7681 = var1.readShort((byte)1) * 1240812145;
      } else if(17 != var2 && 18 != var2) {
         if(var2 == 19) {
            this.anInt7669 = var1.readUnsignedShort(128730235) * -470199233;
         } else if(20 == var2) {
            this.anInt7686 = var1.readUnsignedShort(1866757983) * 275785829;
         }
      } else {
         this.anInt7685 = var1.readUnsignedShort(1331895881) * -250037475;
         if('\uffff' == this.anInt7685 * 2113920821) {
            this.anInt7685 = 250037475;
         }

         this.anInt7671 = var1.readUnsignedShort(1399098755) * 2117352017;
         if(this.anInt7671 * 460279473 == '\uffff') {
            this.anInt7671 = -2117352017;
         }

         int var3 = -1;
         if(var2 == 18) {
            var3 = var1.readUnsignedShort(99290090);
            if(var3 == '\uffff') {
               var3 = -1;
            }
         }

         int var4 = var1.readUnsignedByte(-570478089);
         this.anIntArray7682 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.anIntArray7682[var5] = var1.readUnsignedShort(1105551541);
            if(this.anIntArray7682[var5] == '\uffff') {
               this.anIntArray7682[var5] = -1;
            }
         }

         this.anIntArray7682[var4 + 1] = var3;
      }

   }

   public Class153 method6907(Class174 var1, int var2) {
      if(this.anInt7680 * 115661581 < 0) {
         return null;
      } else {
         Class153 var3 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7680 * 115661581));
         if(null == var3) {
            this.method6900(var1, 1705818315);
            var3 = (Class153)this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7680 * 115661581));
         }

         return var3;
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1357746081);
         if(var2 == 0) {
            return;
         }

         this.method6897(var1, var2, -251948890);
      }
   }

   void method6908(Class174 var1) {
      Class466 var2 = this.aClass568_7660.aClass466_7615;
      Class173 var3;
      if(this.anInt7670 * -106300391 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(-106300391 * this.anInt7670)) == null && var2.method5537(-106300391 * this.anInt7670, (byte)81)) {
         var3 = Class181.method2680(var2, -106300391 * this.anInt7670);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var3, true), (long)(-106300391 * this.anInt7670));
      }

      if(this.anInt7680 * 115661581 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7680 * 115661581)) == null && var2.method5537(this.anInt7680 * 115661581, (byte)42)) {
         var3 = Class181.method2680(var2, this.anInt7680 * 115661581);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var3, true), (long)(115661581 * this.anInt7680));
      }

      if(517546761 * this.anInt7672 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(517546761 * this.anInt7672)) == null && var2.method5537(this.anInt7672 * 517546761, (byte)74)) {
         var3 = Class181.method2680(var2, 517546761 * this.anInt7672);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var3, true), (long)(this.anInt7672 * 517546761));
      }

      if(-1770481121 * this.anInt7673 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(-1770481121 * this.anInt7673)) == null && var2.method5537(-1770481121 * this.anInt7673, (byte)35)) {
         var3 = Class181.method2680(var2, this.anInt7673 * -1770481121);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var3, true), (long)(this.anInt7673 * -1770481121));
      }

   }

   void method6909(Class174 var1) {
      Class466 var2 = this.aClass568_7660.aClass466_7615;
      Class173 var3;
      if(this.anInt7670 * -106300391 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(-106300391 * this.anInt7670)) == null && var2.method5537(-106300391 * this.anInt7670, (byte)104)) {
         var3 = Class181.method2680(var2, -106300391 * this.anInt7670);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var3, true), (long)(-106300391 * this.anInt7670));
      }

      if(this.anInt7680 * 115661581 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(this.anInt7680 * 115661581)) == null && var2.method5537(this.anInt7680 * 115661581, (byte)56)) {
         var3 = Class181.method2680(var2, this.anInt7680 * 115661581);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var3, true), (long)(115661581 * this.anInt7680));
      }

      if(517546761 * this.anInt7672 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(517546761 * this.anInt7672)) == null && var2.method5537(this.anInt7672 * 517546761, (byte)117)) {
         var3 = Class181.method2680(var2, 517546761 * this.anInt7672);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var3, true), (long)(this.anInt7672 * 517546761));
      }

      if(-1770481121 * this.anInt7673 >= 0 && this.aClass568_7660.aClass192_7614.method2765((long)(-1770481121 * this.anInt7673)) == null && var2.method5537(-1770481121 * this.anInt7673, (byte)114)) {
         var3 = Class181.method2680(var2, this.anInt7673 * -1770481121);
         this.aClass568_7660.aClass192_7614.method2768(var1.method2310(var3, true), (long)(this.anInt7673 * -1770481121));
      }

   }

   static final void method6910(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2626 * -1580669593;
   }

   static final void method6911(Class681 var0, byte var1) throws Exception_Sub2 {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      Class446 var4 = Class446.method5309((float)var2, (float)var2, (float)var2);
      if(-1.0F == var4.aFloat4917) {
         var4.aFloat4917 = Float.POSITIVE_INFINITY;
      }

      if(-1.0F == var4.aFloat4915) {
         var4.aFloat4915 = Float.POSITIVE_INFINITY;
      }

      if(-1.0F == var4.aFloat4919) {
         var4.aFloat4919 = Float.POSITIVE_INFINITY;
      }

      Class195.aClass292_Sub1_2182.method3935(var4, -1209503832);
      Class195.aClass292_Sub1_2182.method3894((float)var3 / 1000.0F, (byte)-48);
      var4.method5278();
   }

   public static Class709[] method6912(byte var0) {
      return new Class709[]{Class709.aClass709_8847, Class709.aClass709_8843, Class709.aClass709_8845, Class709.aClass709_8842, Class709.aClass709_8846, Class709.aClass709_8844};
   }
}
