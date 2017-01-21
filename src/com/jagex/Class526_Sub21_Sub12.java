package com.jagex;

import com.jagex.Class456;
import com.jagex.Class526_Sub21;
import com.jagex.RSByteBuffer;
import com.jagex.Class56;
import com.jagex.Class628;
import com.jagex.Class69;

public class Class526_Sub21_Sub12 extends Class526_Sub21 {
   Class56 aClass56_11810;
   String[] aStringArray11808;
   public int[] anIntArray11807;
   int[] anIntArray11809;
   int[][] anIntArrayArray11811;
   public boolean aBool11812 = true;

   public void method10673(RSByteBuffer var1, int[] var2, int var3) {
      if(this.anIntArray11809 != null) {
         for(int var4 = 0; var4 < this.anIntArray11809.length && var4 < var2.length; ++var4) {
            int var5 = this.method10680(var4, (byte)8).anInt8212 * 1812869305;
            if(var5 > 0) {
               var1.method9653((long)var2[var4], var5, -2050130909);
            }
         }

      }
   }

   void method10674(RSByteBuffer var1, short var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1456580679);
         if(var3 == 0) {
            return;
         }

         this.method10676(var1, var3, 1899314742);
      }
   }

   public int method10675(int var1, int var2, int var3) {
      return this.anIntArray11809 != null && var1 >= 0 && var1 <= this.anIntArray11809.length?(this.anIntArrayArray11811[var1] != null && var2 >= 0 && var2 <= this.anIntArrayArray11811[var1].length?this.anIntArrayArray11811[var1][var2]:-1):-1;
   }

   void method10676(RSByteBuffer var1, int var2, int var3) {
      if(1 == var2) {
         this.aStringArray11808 = Class69.method1085(var1.readString(-738463993), '\u003c', (byte)7);
      } else {
         int var4;
         int var5;
         if(var2 == 2) {
            var4 = var1.readUnsignedByte(1354197364);
            this.anIntArray11807 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray11807[var5] = var1.readUnsignedShort(264508812);
            }
         } else if(3 == var2) {
            var4 = var1.readUnsignedByte(1029407600);
            this.anIntArray11809 = new int[var4];
            this.anIntArrayArray11811 = new int[var4][];

            for(var5 = 0; var5 < var4; ++var5) {
               int var6 = var1.readUnsignedShort(1720070658);
               Class628 var7 = Class456.method5401(var6, (byte)-31);
               if(null != var7) {
                  this.anIntArray11809[var5] = var6;
                  this.anIntArrayArray11811[var5] = new int[var7.anInt8200 * 250805173];

                  for(int var8 = 0; var8 < var7.anInt8200 * 250805173; ++var8) {
                     this.anIntArrayArray11811[var5][var8] = var1.readUnsignedShort(1881411687);
                  }
               }
            }
         } else if(var2 == 4) {
            this.aBool11812 = false;
         }
      }

   }

   public String method10677(RSByteBuffer var1, byte var2) {
      StringBuilder var3 = new StringBuilder(80);
      if(this.anIntArray11809 != null) {
         for(int var4 = 0; var4 < this.anIntArray11809.length; ++var4) {
            var3.append(this.aStringArray11808[var4]);
            var3.append(this.aClass56_11810.method995(this.method10680(var4, (byte)8), this.anIntArrayArray11811[var4], var1.method9633(Class456.method5401(this.anIntArray11809[var4], (byte)43).anInt8213 * -2059930911, -1299934837)));
         }
      }

      var3.append(this.aStringArray11808[this.aStringArray11808.length - 1]);
      return var3.toString();
   }

   public String method10678(byte var1) {
      StringBuilder var2 = new StringBuilder(80);
      if(null == this.aStringArray11808) {
         return "";
      } else {
         var2.append(this.aStringArray11808[0]);

         for(int var3 = 1; var3 < this.aStringArray11808.length; ++var3) {
            for(int var4 = 0; var4 < 3; ++var4) {
               var2.append('\u002e');
            }

            var2.append(this.aStringArray11808[var3]);
         }

         return var2.toString();
      }
   }

   public int method10679(int var1) {
      return null == this.anIntArray11809?0:this.anIntArray11809.length;
   }

   public Class628 method10680(int var1, byte var2) {
      return this.anIntArray11809 != null && var1 >= 0 && var1 <= this.anIntArray11809.length?Class456.method5401(this.anIntArray11809[var1], (byte)-32):null;
   }

   public int method10681(int var1, int var2) {
      return this.anIntArray11809 != null && var1 >= 0 && var1 <= this.anIntArray11809.length?(this.anIntArrayArray11811[var1] != null && var2 >= 0 && var2 <= this.anIntArrayArray11811[var1].length?this.anIntArrayArray11811[var1][var2]:-1):-1;
   }

   void method10682(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1433755954);
         if(var2 == 0) {
            return;
         }

         this.method10676(var1, var2, 1758839140);
      }
   }

   void method10683(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(758572338);
         if(var2 == 0) {
            return;
         }

         this.method10676(var1, var2, 545402189);
      }
   }

   void method10684(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.aStringArray11808 = Class69.method1085(var1.readString(-916816990), '\u003c', (byte)7);
      } else {
         int var3;
         int var4;
         if(var2 == 2) {
            var3 = var1.readUnsignedByte(658265445);
            this.anIntArray11807 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArray11807[var4] = var1.readUnsignedShort(1550580940);
            }
         } else if(3 == var2) {
            var3 = var1.readUnsignedByte(2025702070);
            this.anIntArray11809 = new int[var3];
            this.anIntArrayArray11811 = new int[var3][];

            for(var4 = 0; var4 < var3; ++var4) {
               int var5 = var1.readUnsignedShort(181110575);
               Class628 var6 = Class456.method5401(var5, (byte)-91);
               if(null != var6) {
                  this.anIntArray11809[var4] = var5;
                  this.anIntArrayArray11811[var4] = new int[var6.anInt8200 * 250805173];

                  for(int var7 = 0; var7 < var6.anInt8200 * 250805173; ++var7) {
                     this.anIntArrayArray11811[var4][var7] = var1.readUnsignedShort(1931699300);
                  }
               }
            }
         } else if(var2 == 4) {
            this.aBool11812 = false;
         }
      }

   }

   public String method10685() {
      StringBuilder var1 = new StringBuilder(80);
      if(null == this.aStringArray11808) {
         return "";
      } else {
         var1.append(this.aStringArray11808[0]);

         for(int var2 = 1; var2 < this.aStringArray11808.length; ++var2) {
            for(int var3 = 0; var3 < 3; ++var3) {
               var1.append('\u002e');
            }

            var1.append(this.aStringArray11808[var2]);
         }

         return var1.toString();
      }
   }

   public int method10686() {
      return null == this.anIntArray11809?0:this.anIntArray11809.length;
   }

   void method10687(int var1) {
      if(this.anIntArray11807 != null) {
         for(int var2 = 0; var2 < this.anIntArray11807.length; ++var2) {
            this.anIntArray11807[var2] |= '\u8000';
         }
      }

   }
}
