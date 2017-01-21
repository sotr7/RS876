package com.jagex;

import com.jagex.Class174;
import com.jagex.Class446;
import com.jagex.Class526_Sub16;
import com.jagex.Class549;
import com.jagex.Class639_Sub1;

public abstract class Class639_Sub1_Sub1 extends Class639_Sub1 {
   public static final int anInt11785 = 16;
   public static final int anInt11786 = 2;
   public static final int anInt11787 = 4;
   public static final int anInt11789 = 8;
   public static final int anInt11790 = 32;
   public static final int anInt11791 = 64;
   public static final int anInt11792 = 128;
   public static final int anInt11796 = 1;
   int anInt11795 = 0;
   Class526_Sub16[] aClass526_Sub16Array11788 = new Class526_Sub16[4];
   public short aShort11794;
   static int[] anIntArray11793 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};

   boolean method9824(Class174 var1, int var2) {
      Class446 var3 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6764(this, this.aByte10828, (int)var3.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var3.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315);
   }

   boolean method9862(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6764(this, this.aByte10828, (int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315);
   }

   int method9817(Class526_Sub16[] var1, int var2) {
      if(this.aBool8337) {
         Class446 var3 = this.method7635().aClass446_4816;
         int var4 = (int)var3.aFloat4917 >> this.aClass549_10826.anInt7316 * 1705818315;
         int var5 = (int)var3.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315;
         int var6 = 0;
         if(var4 == -522241111 * this.aClass549_10826.anInt7311) {
            ++var6;
         } else if(this.aClass549_10826.anInt7311 * -522241111 < var4) {
            var6 += 2;
         }

         if(446938063 * this.aClass549_10826.anInt7312 == var5) {
            var6 += 3;
         } else if(this.aClass549_10826.anInt7312 * 446938063 > var5) {
            var6 += 6;
         }

         int var7 = anIntArray11793[var6];
         if((this.aShort11794 & var7) == 0) {
            if(1 == this.aShort11794 && var4 > 0) {
               --var4;
            } else if(4 == this.aShort11794 && var4 <= -447634797 * this.aClass549_10826.anInt7285) {
               ++var4;
            } else if(8 == this.aShort11794 && var5 > 0) {
               --var5;
            } else if(this.aShort11794 == 2 && var5 <= this.aClass549_10826.anInt7286 * 1913648871) {
               ++var5;
            } else if(this.aShort11794 == 16 && var4 > 0 && var5 <= 1913648871 * this.aClass549_10826.anInt7286) {
               --var4;
               ++var5;
            } else if(32 == this.aShort11794 && var4 <= -447634797 * this.aClass549_10826.anInt7285 && var5 <= this.aClass549_10826.anInt7286 * 1913648871) {
               ++var4;
               ++var5;
            } else if(128 == this.aShort11794 && var4 > 0 && var5 > 0) {
               --var4;
               --var5;
            } else {
               if(this.aShort11794 != 64 || var4 > this.aClass549_10826.anInt7285 * -447634797 || var5 <= 0) {
                  throw new RuntimeException("");
               }

               ++var4;
               --var5;
            }
         }

         this.anInt11795 = this.method9839(var4, var5, this.aClass526_Sub16Array11788, 1415100369) * 1790061429;
         this.aBool8337 = false;
      }

      for(int var8 = 0; var8 < this.anInt11795 * 397085917; ++var8) {
         var1[var8] = this.aClass526_Sub16Array11788[var8];
      }

      return this.anInt11795 * 397085917;
   }

   Class639_Sub1_Sub1(Class549 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1);
      this.aByte10827 = (byte)var5;
      this.aByte10828 = (byte)var6;
      this.aShort11794 = (short)var7;
      this.method7632(new Class446((float)var2, (float)var3, (float)var4));

      for(int var8 = 0; var8 < 4; ++var8) {
         this.aClass526_Sub16Array11788[var8] = null;
      }

   }

   int method9861(Class526_Sub16[] var1) {
      if(this.aBool8337) {
         Class446 var2 = this.method7635().aClass446_4816;
         int var3 = (int)var2.aFloat4917 >> this.aClass549_10826.anInt7316 * 1705818315;
         int var4 = (int)var2.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315;
         int var5 = 0;
         if(var3 == -522241111 * this.aClass549_10826.anInt7311) {
            ++var5;
         } else if(this.aClass549_10826.anInt7311 * -522241111 < var3) {
            var5 += 2;
         }

         if(446938063 * this.aClass549_10826.anInt7312 == var4) {
            var5 += 3;
         } else if(this.aClass549_10826.anInt7312 * 446938063 > var4) {
            var5 += 6;
         }

         int var6 = anIntArray11793[var5];
         if((this.aShort11794 & var6) == 0) {
            if(1 == this.aShort11794 && var3 > 0) {
               --var3;
            } else if(4 == this.aShort11794 && var3 <= -447634797 * this.aClass549_10826.anInt7285) {
               ++var3;
            } else if(8 == this.aShort11794 && var4 > 0) {
               --var4;
            } else if(this.aShort11794 == 2 && var4 <= this.aClass549_10826.anInt7286 * 1913648871) {
               ++var4;
            } else if(this.aShort11794 == 16 && var3 > 0 && var4 <= 1913648871 * this.aClass549_10826.anInt7286) {
               --var3;
               ++var4;
            } else if(32 == this.aShort11794 && var3 <= -447634797 * this.aClass549_10826.anInt7285 && var4 <= this.aClass549_10826.anInt7286 * 1913648871) {
               ++var3;
               ++var4;
            } else if(128 == this.aShort11794 && var3 > 0 && var4 > 0) {
               --var3;
               --var4;
            } else {
               if(this.aShort11794 != 64 || var3 > this.aClass549_10826.anInt7285 * -447634797 || var4 <= 0) {
                  throw new RuntimeException("");
               }

               ++var3;
               --var4;
            }
         }

         this.anInt11795 = this.method9839(var3, var4, this.aClass526_Sub16Array11788, -805561654) * 1790061429;
         this.aBool8337 = false;
      }

      for(int var7 = 0; var7 < this.anInt11795 * 397085917; ++var7) {
         var1[var7] = this.aClass526_Sub16Array11788[var7];
      }

      return this.anInt11795 * 397085917;
   }

   boolean method9830(byte var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aBoolArrayArray7337[1190212893 * this.aClass549_10826.anInt7304 + (((int)var2.aFloat4917 >> this.aClass549_10826.anInt7316 * 1705818315) - this.aClass549_10826.anInt7311 * -522241111)][((int)var2.aFloat4919 >> 1705818315 * this.aClass549_10826.anInt7316) - 446938063 * this.aClass549_10826.anInt7312 + 1190212893 * this.aClass549_10826.anInt7304];
   }

   boolean method9863(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6764(this, this.aByte10828, (int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315);
   }

   boolean method9867(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6764(this, this.aByte10828, (int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315);
   }

   boolean method9865(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6764(this, this.aByte10828, (int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315);
   }

   boolean method9866() {
      Class446 var1 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aBoolArrayArray7337[1190212893 * this.aClass549_10826.anInt7304 + (((int)var1.aFloat4917 >> this.aClass549_10826.anInt7316 * 1705818315) - this.aClass549_10826.anInt7311 * -522241111)][((int)var1.aFloat4919 >> 1705818315 * this.aClass549_10826.anInt7316) - 446938063 * this.aClass549_10826.anInt7312 + 1190212893 * this.aClass549_10826.anInt7304];
   }
}
