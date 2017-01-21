package com.jagex;

import com.jagex.Class174;
import com.jagex.Class446;
import com.jagex.Class526_Sub16;
import com.jagex.Class549;
import com.jagex.Class639_Sub1;

public abstract class Class639_Sub1_Sub3 extends Class639_Sub1 {
   int anInt11835 = 0;
   Class526_Sub16[] aClass526_Sub16Array11833 = new Class526_Sub16[4];
   public short aShort11834;

   boolean method9867(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6763(this.aByte10828, (int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> 1705818315 * this.aClass549_10826.anInt7316);
   }

   int method9817(Class526_Sub16[] var1, int var2) {
      if(this.aBool8337) {
         Class446 var3 = this.method7635().aClass446_4816;
         this.anInt11835 = this.method9839((int)var3.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var3.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315, this.aClass526_Sub16Array11833, -1804399211) * -1363536549;
         this.aBool8337 = false;
      }

      for(int var4 = 0; var4 < this.anInt11835 * -1084222765; ++var4) {
         var1[var4] = this.aClass526_Sub16Array11833[var4];
      }

      return this.anInt11835 * -1084222765;
   }

   boolean method9824(Class174 var1, int var2) {
      Class446 var3 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6763(this.aByte10828, (int)var3.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var3.aFloat4919 >> 1705818315 * this.aClass549_10826.anInt7316);
   }

   boolean method9830(byte var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aBoolArrayArray7337[this.aClass549_10826.anInt7304 * 1190212893 + (((int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316) - this.aClass549_10826.anInt7311 * -522241111)][this.aClass549_10826.anInt7304 * 1190212893 + (((int)var2.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315) - this.aClass549_10826.anInt7312 * 446938063)];
   }

   boolean method9866() {
      Class446 var1 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aBoolArrayArray7337[this.aClass549_10826.anInt7304 * 1190212893 + (((int)var1.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316) - this.aClass549_10826.anInt7311 * -522241111)][this.aClass549_10826.anInt7304 * 1190212893 + (((int)var1.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315) - this.aClass549_10826.anInt7312 * 446938063)];
   }

   boolean method9862(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6763(this.aByte10828, (int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> 1705818315 * this.aClass549_10826.anInt7316);
   }

   boolean method9863(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6763(this.aByte10828, (int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> 1705818315 * this.aClass549_10826.anInt7316);
   }

   Class639_Sub1_Sub3(Class549 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1);
      this.aByte10827 = (byte)var5;
      this.aByte10828 = (byte)var6;
      this.aShort11834 = (short)var7;
      this.method7632(new Class446((float)var2, (float)var3, (float)var4));

      for(int var8 = 0; var8 < 4; ++var8) {
         this.aClass526_Sub16Array11833[var8] = null;
      }

   }

   boolean method9865(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      return this.aClass549_10826.aClass562_7300.method6763(this.aByte10828, (int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> 1705818315 * this.aClass549_10826.anInt7316);
   }

   int method9861(Class526_Sub16[] var1) {
      if(this.aBool8337) {
         Class446 var2 = this.method7635().aClass446_4816;
         this.anInt11835 = this.method9839((int)var2.aFloat4917 >> 1705818315 * this.aClass549_10826.anInt7316, (int)var2.aFloat4919 >> this.aClass549_10826.anInt7316 * 1705818315, this.aClass526_Sub16Array11833, -1706125464) * -1363536549;
         this.aBool8337 = false;
      }

      for(int var3 = 0; var3 < this.anInt11835 * -1084222765; ++var3) {
         var1[var3] = this.aClass526_Sub16Array11833[var3];
      }

      return this.anInt11835 * -1084222765;
   }
}
