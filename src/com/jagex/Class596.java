package com.jagex;

import com.jagex.Class103;
import com.jagex.Class115;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class278;
import com.jagex.Class283;
import com.jagex.OutFrame;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub32;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class661;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class87;
import com.jagex.client;

public class Class596 {
   public static Class466 aClass466_7853;
   public int anInt7850;
   public int localX;
   public int localY;

   public String method7044() {
      return this.anInt7850 * 1837438465 + "," + (this.localX * -814686591 >> 6) + "," + (this.localY * -845789331 >> 6) + "," + (-814686591 * this.localX & 63) + "," + (this.localY * -845789331 & 63);
   }

   public Class596(int var1, int var2, int var3) {
      this.anInt7850 = var1 * -664868351;
      this.localX = -850304639 * var2;
      this.localY = -108012955 * var3;
   }

   public Class596(int var1) {
      if(var1 == -1) {
         this.anInt7850 = 664868351;
      } else {
         this.anInt7850 = (var1 >> 28 & 3) * -664868351;
         this.localX = (var1 >> 14 & 16383) * -850304639;
         this.localY = (var1 & 16383) * -108012955;
      }

   }

   public void method7045(Class526_Sub32 var1, int var2) {
      this.anInt7850 = -1679769273 * var1.anInt10598;
      this.localX = (-1228547407 * var1.anInt10599 >> 9) * -850304639;
      this.localY = -108012955 * (var1.anInt10600 * 524465495 >> 9);
   }

   public int method7046() {
      return this.method7047(118492360);
   }

   public boolean equals(Object var1) {
      return var1 == this?true:(!(var1 instanceof Class596)?false:this.method7048((Class596)var1, 1182422232));
   }

   public int hashCode() {
      return this.method7047(118492360);
   }

   public int method7047(int var1) {
      return this.anInt7850 * 1837438465 << 28 | this.localX * -814686591 << 14 | this.localY * -845789331;
   }

   boolean method7048(Class596 var1, int var2) {
      return 1837438465 * var1.anInt7850 != 1837438465 * this.anInt7850?false:(-814686591 * var1.localX != this.localX * -814686591?false:-845789331 * this.localY == var1.localY * -845789331);
   }

   public boolean method7049(Object var1) {
      return var1 == this?true:(!(var1 instanceof Class596)?false:this.method7048((Class596)var1, 437141162));
   }

   public String toString() {
      return this.anInt7850 * 1837438465 + "," + (this.localX * -814686591 >> 6) + "," + (this.localY * -845789331 >> 6) + "," + (-814686591 * this.localX & 63) + "," + (this.localY * -845789331 & 63);
   }

   public boolean method7050(Object var1) {
      return var1 == this?true:(!(var1 instanceof Class596)?false:this.method7048((Class596)var1, -1232318916));
   }

   public int method7051() {
      return this.method7047(118492360);
   }

   public boolean method7052(Object var1) {
      return var1 == this?true:(!(var1 instanceof Class596)?false:this.method7048((Class596)var1, 780568027));
   }

   public int method7053() {
      return this.anInt7850 * 1837438465 << 28 | this.localX * -814686591 << 14 | this.localY * -845789331;
   }

   public int method7054() {
      return this.anInt7850 * 1837438465 << 28 | this.localX * -814686591 << 14 | this.localY * -845789331;
   }

   public Class596() {
      this.anInt7850 = 664868351;
   }

   public static void method7055(boolean var0, boolean var1, int var2) {
      if(var0) {
         Class661.anInt8515 -= 759532629;
         if(0 == Class661.anInt8515 * -1300033283) {
            Class87.anIntArray855 = null;
         }
      }

      if(var1) {
         Class661.anInt8514 -= 1534686479;
         if(0 == 2021579247 * Class661.anInt8514) {
            Class661.anIntArray8516 = null;
         }
      }

   }

   static final void method7056(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class278.method3685(var3, var4, false, 2, var0, -775370718);
   }

   static final void method7057(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aBool11004?1:0;
   }

   static final void method7058(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class242.aClass94_2456.method1265(var2, -720149929);
   }

   public static void method7059(int var0, String var1, int var2) {
      int var3 = Class103.anInt1270 * 1609310241;
      int[] var4 = Class103.anIntArray1276;
      boolean var5 = false;

      for(int var6 = 0; var6 < var3; ++var6) {
         Class639_Sub1_Sub2_Sub1_Sub1 var7 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var4[var6]];
         if(var7 != null && Class451.localPlayer != var7 && null != var7.aString12161 && var7.aString12161.equalsIgnoreCase(var1)) {
            OutFrame var8 = null;
            if(1 == var0) {
               var8 = OutFrame.aClass405_4263;
            } else if(2 == var0) {
               var8 = OutFrame.aClass405_4231;
            } else if(3 == var0) {
               var8 = OutFrame.aClass405_4206;
            } else if(var0 == 4) {
               var8 = OutFrame.aClass405_4180;
            } else if(var0 == 5) {
               var8 = OutFrame.aClass405_4212;
            } else if(6 == var0) {
               var8 = OutFrame.aClass405_4230;
            } else if(7 == var0) {
               var8 = OutFrame.aClass405_4170;
            } else if(8 == var0) {
               var8 = OutFrame.aClass405_4217;
            } else if(9 == var0) {
               var8 = OutFrame.aClass405_4219;
            } else if(10 == var0) {
               var8 = OutFrame.aClass405_4264;
            }

            if(null != var8) {
               OutFrameBuffer var9 = Class115.method1414(var8, client.aClass111_11060.aClass14_1342, -366247978);
               var9.out.writeLEShort(var4[var6], (byte)0);
               var9.out.write128Byte(0, (byte)22);
               client.aClass111_11060.write(var9, (byte)24);
            }

            var5 = true;
            break;
         }
      }

      if(!var5) {
         Class283.method3718(4, Class45.aClass45_587.method920(Class26.aClass673_247, -827840379) + var1, 1954454466);
      }

   }

   static final int method7060(int var0, int var1, byte var2) {
      int var3 = InterfaceDef.method3380('\ub135' + var0, var1 + 91923, 4, -1491456321) - 128 + (InterfaceDef.method3380(10294 + var0, '\u93bd' + var1, 2, -1970922957) - 128 >> 1) + (InterfaceDef.method3380(var0, var1, 1, -1720308800) - 128 >> 2);
      var3 = 35 + (int)(0.3D * (double)var3);
      if(var3 < 10) {
         var3 = 10;
      } else if(var3 > 60) {
         var3 = 60;
      }

      return var3;
   }
}
