package com.jagex;

import com.jagex.Class174;
import com.jagex.Class446;
import com.jagex.Class526_Sub16;
import com.jagex.Class549;
import com.jagex.Class556;
import com.jagex.Class639_Sub1;

public abstract class Class639_Sub1_Sub2 extends Class639_Sub1 {
   int anInt11801 = 0;
   Class526_Sub16[] aClass526_Sub16Array11804 = new Class526_Sub16[4];
   public short aShort11803;
   public short aShort11798;
   public short aShort11799;
   public short aShort11802;
   public boolean aBool11800;
   byte aByte11797;

   void method10670(int var1) {
   }

   int method9861(Class526_Sub16[] var1) {
      int var2;
      if(this.aBool8337) {
         this.anInt11801 = 0;
         var2 = Math.max(0, this.aShort11803);
         int var3 = Math.min(this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827].length - 1, this.aShort11798);
         int var4 = Math.max(0, this.aShort11799);

         int var10;
         int var12;
         label127:
         for(int var5 = Math.min(this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var2].length - 1, this.aShort11802); var2 <= var3; ++var2) {
            label124:
            for(; var4 <= var5; ++var4) {
               long var6 = this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var2][var4];
               long var8 = 0L;

               while(true) {
                  label119:
                  while(true) {
                     if(var8 > 48L) {
                        continue label124;
                     }

                     var10 = (int)(var6 >>> (int)var8 & 65535L);
                     if(var10 <= 0) {
                        continue label124;
                     }

                     Class556 var11 = this.aClass549_10826.aClass556Array7330[var10 - 1];

                     for(var12 = 0; var12 < this.anInt11801 * 1431273689; ++var12) {
                        if(this.aClass526_Sub16Array11804[var12] == var11.aClass526_Sub16_7504) {
                           var8 += 16L;
                           continue label119;
                        }
                     }

                     this.aClass526_Sub16Array11804[(this.anInt11801 += -1309868183) * 1431273689 - 1] = var11.aClass526_Sub16_7504;
                     if(4 == this.anInt11801 * 1431273689) {
                        break label127;
                     }

                     var8 += 16L;
                  }
               }
            }
         }

         for(int var13 = this.anInt11801 * 1431273689; var13 < 4; ++var13) {
            this.aClass526_Sub16Array11804[var13] = null;
         }

         if(0 != this.aByte11797) {
            var10 = this.aShort11803 - this.aClass549_10826.anInt7311 * -522241111;
            int var20 = this.aShort11799 - 446938063 * this.aClass549_10826.anInt7312;
            int var14;
            int var15;
            short var16;
            short var21;
            if(this.aByte11797 == 1) {
               if(var20 > var10) {
                  var21 = this.aShort11803;
                  var14 = this.aShort11799 - 1;
                  var15 = 1 + this.aShort11803;
                  var16 = this.aShort11799;
               } else {
                  var21 = this.aShort11803;
                  var14 = 1 + this.aShort11799;
                  var15 = this.aShort11803 - 1;
                  var16 = this.aShort11799;
               }
            } else if(var20 > -var10) {
               var21 = this.aShort11803;
               var14 = this.aShort11799 - 1;
               var15 = this.aShort11803 - 1;
               var16 = this.aShort11799;
            } else {
               var21 = this.aShort11803;
               var14 = 1 + this.aShort11799;
               var15 = 1 + this.aShort11803;
               var16 = this.aShort11799;
            }

            label91:
            for(var12 = 0; var12 < 1431273689 * this.anInt11801; ++var12) {
               long var17 = this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var21][var14];

               Class556 var19;
               while(var17 != 0L) {
                  var19 = this.aClass549_10826.aClass556Array7330[(int)((var17 & 65535L) - 1L)];
                  var17 >>>= 16;
                  if(this.aClass526_Sub16Array11804[var12] == var19.aClass526_Sub16_7504) {
                     continue label91;
                  }
               }

               var17 = this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var15][var16];

               while(var17 != 0L) {
                  var19 = this.aClass549_10826.aClass556Array7330[(int)((var17 & 65535L) - 1L)];
                  var17 >>>= 16;
                  if(this.aClass526_Sub16Array11804[var12] == var19.aClass526_Sub16_7504) {
                     continue label91;
                  }
               }

               for(int var22 = var12; var22 < 1431273689 * this.anInt11801 - 1; ++var22) {
                  this.aClass526_Sub16Array11804[var22] = this.aClass526_Sub16Array11804[1 + var22];
               }

               this.anInt11801 -= -1309868183;
            }
         }

         this.aBool8337 = false;
      }

      for(var2 = 0; var2 < 1431273689 * this.anInt11801; ++var2) {
         var1[var2] = this.aClass526_Sub16Array11804[var2];
      }

      return 1431273689 * this.anInt11801;
   }

   int method9817(Class526_Sub16[] var1, int var2) {
      int var3;
      if(this.aBool8337) {
         this.anInt11801 = 0;
         var3 = Math.max(0, this.aShort11803);
         int var4 = Math.min(this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827].length - 1, this.aShort11798);
         int var5 = Math.max(0, this.aShort11799);

         int var11;
         int var13;
         label127:
         for(int var6 = Math.min(this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var3].length - 1, this.aShort11802); var3 <= var4; ++var3) {
            label124:
            for(; var5 <= var6; ++var5) {
               long var7 = this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var3][var5];
               long var9 = 0L;

               while(true) {
                  label119:
                  while(true) {
                     if(var9 > 48L) {
                        continue label124;
                     }

                     var11 = (int)(var7 >>> (int)var9 & 65535L);
                     if(var11 <= 0) {
                        continue label124;
                     }

                     Class556 var12 = this.aClass549_10826.aClass556Array7330[var11 - 1];

                     for(var13 = 0; var13 < this.anInt11801 * 1431273689; ++var13) {
                        if(this.aClass526_Sub16Array11804[var13] == var12.aClass526_Sub16_7504) {
                           var9 += 16L;
                           continue label119;
                        }
                     }

                     this.aClass526_Sub16Array11804[(this.anInt11801 += -1309868183) * 1431273689 - 1] = var12.aClass526_Sub16_7504;
                     if(4 == this.anInt11801 * 1431273689) {
                        break label127;
                     }

                     var9 += 16L;
                  }
               }
            }
         }

         for(int var14 = this.anInt11801 * 1431273689; var14 < 4; ++var14) {
            this.aClass526_Sub16Array11804[var14] = null;
         }

         if(0 != this.aByte11797) {
            var11 = this.aShort11803 - this.aClass549_10826.anInt7311 * -522241111;
            int var21 = this.aShort11799 - 446938063 * this.aClass549_10826.anInt7312;
            int var15;
            int var16;
            short var17;
            short var22;
            if(this.aByte11797 == 1) {
               if(var21 > var11) {
                  var22 = this.aShort11803;
                  var15 = this.aShort11799 - 1;
                  var16 = 1 + this.aShort11803;
                  var17 = this.aShort11799;
               } else {
                  var22 = this.aShort11803;
                  var15 = 1 + this.aShort11799;
                  var16 = this.aShort11803 - 1;
                  var17 = this.aShort11799;
               }
            } else if(var21 > -var11) {
               var22 = this.aShort11803;
               var15 = this.aShort11799 - 1;
               var16 = this.aShort11803 - 1;
               var17 = this.aShort11799;
            } else {
               var22 = this.aShort11803;
               var15 = 1 + this.aShort11799;
               var16 = 1 + this.aShort11803;
               var17 = this.aShort11799;
            }

            label91:
            for(var13 = 0; var13 < 1431273689 * this.anInt11801; ++var13) {
               long var18 = this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var22][var15];

               Class556 var20;
               while(var18 != 0L) {
                  var20 = this.aClass549_10826.aClass556Array7330[(int)((var18 & 65535L) - 1L)];
                  var18 >>>= 16;
                  if(this.aClass526_Sub16Array11804[var13] == var20.aClass526_Sub16_7504) {
                     continue label91;
                  }
               }

               var18 = this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var16][var17];

               while(var18 != 0L) {
                  var20 = this.aClass549_10826.aClass556Array7330[(int)((var18 & 65535L) - 1L)];
                  var18 >>>= 16;
                  if(this.aClass526_Sub16Array11804[var13] == var20.aClass526_Sub16_7504) {
                     continue label91;
                  }
               }

               for(int var23 = var13; var23 < 1431273689 * this.anInt11801 - 1; ++var23) {
                  this.aClass526_Sub16Array11804[var23] = this.aClass526_Sub16Array11804[1 + var23];
               }

               this.anInt11801 -= -1309868183;
            }
         }

         this.aBool8337 = false;
      }

      for(var3 = 0; var3 < 1431273689 * this.anInt11801; ++var3) {
         var1[var3] = this.aClass526_Sub16Array11804[var3];
      }

      return 1431273689 * this.anInt11801;
   }

   boolean method9824(Class174 var1, int var2) {
      return this.aClass549_10826.aClass562_7300.method6765(this.aByte10828, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, this.method9827(var1, -1758640349));
   }

   boolean method9830(byte var1) {
      for(int var2 = this.aShort11803; var2 <= this.aShort11798; ++var2) {
         for(int var3 = this.aShort11799; var3 <= this.aShort11802; ++var3) {
            int var4 = var2 - -522241111 * this.aClass549_10826.anInt7311 + 1190212893 * this.aClass549_10826.anInt7304;
            if(var4 >= 0 && var4 < this.aClass549_10826.aBoolArrayArray7337.length) {
               int var5 = 1190212893 * this.aClass549_10826.anInt7304 + (var3 - 446938063 * this.aClass549_10826.anInt7312);
               if(var5 >= 0 && var5 < this.aClass549_10826.aBoolArrayArray7337.length && this.aClass549_10826.aBoolArrayArray7337[var4][var5]) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   void method10671() {
   }

   boolean method9866() {
      for(int var1 = this.aShort11803; var1 <= this.aShort11798; ++var1) {
         for(int var2 = this.aShort11799; var2 <= this.aShort11802; ++var2) {
            int var3 = var1 - -522241111 * this.aClass549_10826.anInt7311 + 1190212893 * this.aClass549_10826.anInt7304;
            if(var3 >= 0 && var3 < this.aClass549_10826.aBoolArrayArray7337.length) {
               int var4 = 1190212893 * this.aClass549_10826.anInt7304 + (var2 - 446938063 * this.aClass549_10826.anInt7312);
               if(var4 >= 0 && var4 < this.aClass549_10826.aBoolArrayArray7337.length && this.aClass549_10826.aBoolArrayArray7337[var3][var4]) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   Class639_Sub1_Sub2(Class549 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, byte var12) {
      super(var1);
      this.aByte10827 = (byte)var2;
      this.aByte10828 = (byte)var3;
      this.method7632(new Class446((float)var4, (float)var5, (float)var6));
      this.aShort11803 = (short)var7;
      this.aShort11798 = (short)var8;
      this.aShort11799 = (short)var9;
      this.aShort11802 = (short)var10;
      this.aBool11800 = var11;
      this.aByte11797 = var12;

      for(int var13 = 0; var13 < 4; ++var13) {
         this.aClass526_Sub16Array11804[var13] = null;
      }

   }

   boolean method9862(Class174 var1) {
      return this.aClass549_10826.aClass562_7300.method6765(this.aByte10828, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, this.method9827(var1, -1144284134));
   }

   boolean method9863(Class174 var1) {
      return this.aClass549_10826.aClass562_7300.method6765(this.aByte10828, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, this.method9827(var1, -1733105539));
   }

   boolean method9867(Class174 var1) {
      return this.aClass549_10826.aClass562_7300.method6765(this.aByte10828, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, this.method9827(var1, -1114654419));
   }

   boolean method9865(Class174 var1) {
      return this.aClass549_10826.aClass562_7300.method6765(this.aByte10828, this.aShort11803, this.aShort11798, this.aShort11799, this.aShort11802, this.method9827(var1, -1504110859));
   }

   void method10672() {
   }
}
