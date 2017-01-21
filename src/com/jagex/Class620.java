package com.jagex;

import com.jagex.Class195;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class278;
import com.jagex.Class466;
import com.jagex.Class493;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class571;
import com.jagex.Class581;
import com.jagex.Class585;
import com.jagex.Class622;
import com.jagex.Class653;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class8;
import com.jagex.Exception_Sub2;

public class Class620 {
   public static final int anInt8124 = 1;
   static final int anInt8125 = 2;
   public static final int anInt8126 = 0;
   public int anInt8127 = 2128399901;
   public int anInt8128 = 1419602187;
   public int[] anIntArray8123;
   public int[] anIntArray8129;
   public int[] anIntArray8130;

   public Class620(Class466 var1) {
      byte[] var2 = var1.method5541(127490303 * Class622.aClass622_8137.anInt8139, 16777472);
      this.method7341(new RSByteBuffer(var2), -470315754);
   }

   void method7341(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(598134754);
         if(var3 == 0) {
            if(null == this.anIntArray8123) {
               throw new RuntimeException("");
            }

            return;
         }

         int var4;
         if(1 == var3) {
            var4 = var1.readUnsignedByte(1086971386);
            this.anIntArray8123 = new int[var4];

            for(int var5 = 0; var5 < this.anIntArray8123.length; ++var5) {
               this.anIntArray8123[var5] = var1.readUnsignedByte(1979860137);
               if(this.anIntArray8123[var5] != 0 && 2 == this.anIntArray8123[var5]) {
                  ;
               }
            }
         } else if(3 == var3) {
            this.anInt8127 = var1.readUnsignedByte(1117718965) * -2128399901;
         } else if(4 == var3) {
            this.anInt8128 = var1.readUnsignedByte(830792687) * -1419602187;
         } else if(5 == var3) {
            this.anIntArray8129 = new int[var1.readUnsignedByte(-618732437)];

            for(var4 = 0; var4 < this.anIntArray8129.length; ++var4) {
               this.anIntArray8129[var4] = var1.readUnsignedByte(1772061159);
            }
         } else if(6 == var3) {
            this.anIntArray8130 = new int[var1.readUnsignedByte(1569757727)];

            for(var4 = 0; var4 < this.anIntArray8130.length; ++var4) {
               this.anIntArray8130[var4] = var1.readUnsignedByte(1306604963);
            }
         }
      }
   }

   void method7342(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(2040609746);
         if(var2 == 0) {
            if(null == this.anIntArray8123) {
               throw new RuntimeException("");
            }

            return;
         }

         int var3;
         if(1 == var2) {
            var3 = var1.readUnsignedByte(-2097803877);
            this.anIntArray8123 = new int[var3];

            for(int var4 = 0; var4 < this.anIntArray8123.length; ++var4) {
               this.anIntArray8123[var4] = var1.readUnsignedByte(-1528205673);
               if(this.anIntArray8123[var4] != 0 && 2 == this.anIntArray8123[var4]) {
                  ;
               }
            }
         } else if(3 == var2) {
            this.anInt8127 = var1.readUnsignedByte(-1991082690) * -2128399901;
         } else if(4 == var2) {
            this.anInt8128 = var1.readUnsignedByte(1065679779) * -1419602187;
         } else if(5 == var2) {
            this.anIntArray8129 = new int[var1.readUnsignedByte(-251784309)];

            for(var3 = 0; var3 < this.anIntArray8129.length; ++var3) {
               this.anIntArray8129[var3] = var1.readUnsignedByte(1935233371);
            }
         } else if(6 == var2) {
            this.anIntArray8130 = new int[var1.readUnsignedByte(1418267282)];

            for(var3 = 0; var3 < this.anIntArray8130.length; ++var3) {
               this.anIntArray8130[var3] = var1.readUnsignedByte(-798423709);
            }
         }
      }
   }

   static void method7343(Class581 var0, int var1, int var2, Class681 var3, byte var4) {
      Class526_Sub21_Sub19 var5 = Class493.method5892(var0, var1, var2, 1076719591);
      if(var5 == null) {
         Class571.method6894((byte)0);
      } else {
         var3.anIntArray8643 = new int[var5.anInt11865 * -2142922607];
         var3.anObjectArray8618 = new Object[-790376653 * var5.anInt11869];
         if(Class581.aClass581_7758 != var5.aClass581_11863 && Class581.aClass581_7759 != var5.aClass581_11863 && var5.aClass581_11863 != Class581.aClass581_7771) {
            if(Class581.aClass581_7754 != var5.aClass581_11863 && var5.aClass581_11863 != Class581.aClass581_7757 && var5.aClass581_11863 != Class581.aClass581_7766 && Class581.aClass581_7755 != var5.aClass581_11863 && Class581.aClass581_7756 != var5.aClass581_11863) {
               if(Class581.aClass581_7765 == var5.aClass581_11863) {
                  var3.anIntArray8643[0] = var3.anInt8641 * 1750703981;
               }
            } else {
               var3.anIntArray8643[0] = var1;
            }
         } else {
            var3.anIntArray8643[0] = var1;
            var3.anIntArray8643[1] = Class8.aClass547_45.method6534(1397327973);
            var3.anIntArray8643[2] = Class8.aClass547_45.method6531(1822425352);
         }

         Class653.method7792(var5, 500000, var3, (byte)-20);
      }
   }

   static final void method7344(Class681 var0, short var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class278.method3683(var3, var4, var0, -2142961191);
   }

   static final void method7345(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      Class570.aClass231_7657.method3236(var0.anIntArray8622[var0.anInt8623 * -1730576285], var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2], 877911551);
   }

   public static boolean method7346(CharSequence var0, int var1) {
      return Class585.method6989(var0, 10, true, (byte)-1);
   }

   static final void method7347(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2527 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 1554408579;
      Class526_Sub31.method9555(var0, (byte)10);
   }

   static final void method7348(Class681 var0, byte var1) throws Exception_Sub2 {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      Class195.aClass292_Sub1_2182.method3926((float)(2.0D * (double)var2 * 3.141592653589793D / 16384.0D), (float)(2.0D * 3.141592653589793D * (double)var3 / 16384.0D), (byte)-45);
   }

   public static boolean method7349(boolean var0, int var1) {
      boolean var2 = Class554.aClass174_7475.method2548();
      if(var0 != var2) {
         if(var0) {
            if(!Class554.aClass174_7475.method2348()) {
               var0 = false;
            }
         } else {
            Class554.aClass174_7475.method2604();
         }

         if(var0 != var2) {
            Class230.preferences.method9602(Class230.preferences.aClass711_Sub26_10611, var0?1:0, (short)-1516);
            Class522.method6257(-1042127423);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
