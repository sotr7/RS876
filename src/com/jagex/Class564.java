package com.jagex;

import com.jagex.Class221;
import com.jagex.Class23;
import com.jagex.Class235;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class333;
import com.jagex.Class415;
import com.jagex.Class481;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import java.io.EOFException;
import java.io.IOException;

public final class Class564 {
   static int anInt7598;
   static byte[] aByteArray7596 = new byte[520];
   Class23 aClass23_7593 = null;
   Class23 aClass23_7595 = null;
   int anInt7597 = -1336028808;
   int anInt7594;

   public byte[] method6785(int var1, byte var2) {
      Class23 var3 = this.aClass23_7593;
      synchronized(var3) {
         try {
            if(this.aClass23_7595.method680(-1980900166) < (long)(6 * var1 + 6)) {
               return null;
            } else {
               this.aClass23_7595.method679((long)(var1 * 6));
               this.aClass23_7595.method682(aByteArray7596, 0, 6, -869661168);
               int var4 = ((aByteArray7596[0] & 255) << 16) + ((aByteArray7596[1] & 255) << 8) + (aByteArray7596[2] & 255);
               int var5 = (aByteArray7596[5] & 255) + ((aByteArray7596[3] & 255) << 16) + ((aByteArray7596[4] & 255) << 8);
               if(var4 >= 0 && var4 <= this.anInt7597 * 411649491) {
                  if(var5 > 0 && (long)var5 <= this.aClass23_7593.method680(-1940319455) / 520L) {
                     byte[] var6 = new byte[var4];
                     int var7 = 0;
                     int var8 = 0;

                     while(var7 < var4) {
                        if(0 == var5) {
                           return null;
                        }

                        this.aClass23_7593.method679((long)var5 * 520L);
                        int var9 = var4 - var7;
                        byte var10;
                        int var11;
                        int var12;
                        int var13;
                        int var14;
                        if(var1 > '\uffff') {
                           if(var9 > 510) {
                              var9 = 510;
                           }

                           var10 = 10;
                           this.aClass23_7593.method682(aByteArray7596, 0, var10 + var9, -2146163319);
                           var11 = ((aByteArray7596[2] & 255) << 8) + ((aByteArray7596[1] & 255) << 16) + ((aByteArray7596[0] & 255) << 24) + (aByteArray7596[3] & 255);
                           var12 = ((aByteArray7596[4] & 255) << 8) + (aByteArray7596[5] & 255);
                           var13 = (aByteArray7596[8] & 255) + ((aByteArray7596[7] & 255) << 8) + ((aByteArray7596[6] & 255) << 16);
                           var14 = aByteArray7596[9] & 255;
                        } else {
                           if(var9 > 512) {
                              var9 = 512;
                           }

                           var10 = 8;
                           this.aClass23_7593.method682(aByteArray7596, 0, var10 + var9, -1151606010);
                           var11 = ((aByteArray7596[0] & 255) << 8) + (aByteArray7596[1] & 255);
                           var12 = (aByteArray7596[3] & 255) + ((aByteArray7596[2] & 255) << 8);
                           var13 = (aByteArray7596[6] & 255) + ((aByteArray7596[5] & 255) << 8) + ((aByteArray7596[4] & 255) << 16);
                           var14 = aByteArray7596[7] & 255;
                        }

                        if(var11 == var1 && var12 == var8 && var14 == this.anInt7594 * 238890945) {
                           if(var13 >= 0 && (long)var13 <= this.aClass23_7593.method680(-2139891065) / 520L) {
                              int var15 = var10 + var9;

                              for(int var16 = var10; var16 < var15; ++var16) {
                                 var6[var7++] = aByteArray7596[var16];
                              }

                              var5 = var13;
                              ++var8;
                              continue;
                           }

                           return null;
                        }

                        return null;
                     }

                     byte[] var10000 = var6;
                     return var10000;
                  } else {
                     return null;
                  }
               } else {
                  return null;
               }
            }
         } catch (IOException var18) {
            return null;
         }
      }
   }

   public boolean method6786(int var1, byte[] var2, int var3, byte var4) {
      Class23 var5 = this.aClass23_7593;
      synchronized(var5) {
         if(var3 >= 0 && var3 <= 411649491 * this.anInt7597) {
            boolean var6 = this.method6789(var1, var2, var3, true, 1284324462);
            if(!var6) {
               var6 = this.method6789(var1, var2, var3, false, 1221702957);
            }

            return var6;
         } else {
            throw new IllegalArgumentException("" + this.anInt7594 * 238890945 + '\u002c' + var1 + '\u002c' + var3);
         }
      }
   }

   public String method6787() {
      return "" + this.anInt7594 * 238890945;
   }

   public byte[] method6788(int var1) {
      Class23 var2 = this.aClass23_7593;
      synchronized(var2) {
         try {
            if(this.aClass23_7595.method680(-2076708277) < (long)(6 * var1 + 6)) {
               return null;
            } else {
               this.aClass23_7595.method679((long)(var1 * 6));
               this.aClass23_7595.method682(aByteArray7596, 0, 6, -1157988943);
               int var3 = ((aByteArray7596[0] & 255) << 16) + ((aByteArray7596[1] & 255) << 8) + (aByteArray7596[2] & 255);
               int var4 = (aByteArray7596[5] & 255) + ((aByteArray7596[3] & 255) << 16) + ((aByteArray7596[4] & 255) << 8);
               if(var3 >= 0 && var3 <= this.anInt7597 * 411649491) {
                  if(var4 > 0 && (long)var4 <= this.aClass23_7593.method680(-2037823354) / 520L) {
                     byte[] var5 = new byte[var3];
                     int var6 = 0;
                     int var7 = 0;

                     while(var6 < var3) {
                        if(0 == var4) {
                           return null;
                        }

                        this.aClass23_7593.method679((long)var4 * 520L);
                        int var8 = var3 - var6;
                        byte var9;
                        int var10;
                        int var11;
                        int var12;
                        int var13;
                        if(var1 > '\uffff') {
                           if(var8 > 510) {
                              var8 = 510;
                           }

                           var9 = 10;
                           this.aClass23_7593.method682(aByteArray7596, 0, var9 + var8, -224536555);
                           var10 = ((aByteArray7596[2] & 255) << 8) + ((aByteArray7596[1] & 255) << 16) + ((aByteArray7596[0] & 255) << 24) + (aByteArray7596[3] & 255);
                           var11 = ((aByteArray7596[4] & 255) << 8) + (aByteArray7596[5] & 255);
                           var12 = (aByteArray7596[8] & 255) + ((aByteArray7596[7] & 255) << 8) + ((aByteArray7596[6] & 255) << 16);
                           var13 = aByteArray7596[9] & 255;
                        } else {
                           if(var8 > 512) {
                              var8 = 512;
                           }

                           var9 = 8;
                           this.aClass23_7593.method682(aByteArray7596, 0, var9 + var8, -306702872);
                           var10 = ((aByteArray7596[0] & 255) << 8) + (aByteArray7596[1] & 255);
                           var11 = (aByteArray7596[3] & 255) + ((aByteArray7596[2] & 255) << 8);
                           var12 = (aByteArray7596[6] & 255) + ((aByteArray7596[5] & 255) << 8) + ((aByteArray7596[4] & 255) << 16);
                           var13 = aByteArray7596[7] & 255;
                        }

                        if(var10 == var1 && var11 == var7 && var13 == this.anInt7594 * 238890945) {
                           if(var12 >= 0 && (long)var12 <= this.aClass23_7593.method680(-2131398594) / 520L) {
                              int var14 = var9 + var8;

                              for(int var15 = var9; var15 < var14; ++var15) {
                                 var5[var6++] = aByteArray7596[var15];
                              }

                              var4 = var12;
                              ++var7;
                              continue;
                           }

                           return null;
                        }

                        return null;
                     }

                     byte[] var10000 = var5;
                     return var10000;
                  } else {
                     return null;
                  }
               } else {
                  return null;
               }
            }
         } catch (IOException var17) {
            return null;
         }
      }
   }

   public Class564(int var1, Class23 var2, Class23 var3, int var4) {
      this.anInt7594 = var1 * 1143922753;
      this.aClass23_7593 = var2;
      this.aClass23_7595 = var3;
      this.anInt7597 = var4 * -1212655013;
   }

   public String toString() {
      return "" + this.anInt7594 * 238890945;
   }

   boolean method6789(int var1, byte[] var2, int var3, boolean var4, int var5) {
      Class23 var6 = this.aClass23_7593;
      synchronized(var6) {
         try {
            int var7;
            if(var4) {
               if(this.aClass23_7595.method680(-2128740885) < (long)(6 * var1 + 6)) {
                  return false;
               }

               this.aClass23_7595.method679((long)(6 * var1));
               this.aClass23_7595.method682(aByteArray7596, 0, 6, -1942744374);
               var7 = (aByteArray7596[5] & 255) + ((aByteArray7596[4] & 255) << 8) + ((aByteArray7596[3] & 255) << 16);
               if(var7 <= 0 || (long)var7 > this.aClass23_7593.method680(-1960592480) / 520L) {
                  return false;
               }
            } else {
               var7 = (int)((this.aClass23_7593.method680(-1938788793) + 519L) / 520L);
               if(var7 == 0) {
                  var7 = 1;
               }
            }

            aByteArray7596[0] = (byte)(var3 >> 16);
            aByteArray7596[1] = (byte)(var3 >> 8);
            aByteArray7596[2] = (byte)var3;
            aByteArray7596[3] = (byte)(var7 >> 16);
            aByteArray7596[4] = (byte)(var7 >> 8);
            aByteArray7596[5] = (byte)var7;
            this.aClass23_7595.method679((long)(var1 * 6));
            this.aClass23_7595.method684(aByteArray7596, 0, 6, -1630459595);
            int var8 = 0;
            int var9 = 0;

            while(true) {
               if(var8 < var3) {
                  label127: {
                     int var10 = 0;
                     int var12;
                     if(var4) {
                        this.aClass23_7593.method679(520L * (long)var7);
                        int var13;
                        int var14;
                        if(var1 > '\uffff') {
                           try {
                              this.aClass23_7593.method682(aByteArray7596, 0, 10, -395152807);
                           } catch (EOFException var17) {
                              break label127;
                           }

                           var12 = ((aByteArray7596[0] & 255) << 24) + ((aByteArray7596[1] & 255) << 16) + ((aByteArray7596[2] & 255) << 8) + (aByteArray7596[3] & 255);
                           var13 = (aByteArray7596[5] & 255) + ((aByteArray7596[4] & 255) << 8);
                           var10 = (aByteArray7596[8] & 255) + ((aByteArray7596[7] & 255) << 8) + ((aByteArray7596[6] & 255) << 16);
                           var14 = aByteArray7596[9] & 255;
                        } else {
                           try {
                              this.aClass23_7593.method682(aByteArray7596, 0, 8, -242987784);
                           } catch (EOFException var16) {
                              break label127;
                           }

                           var12 = (aByteArray7596[1] & 255) + ((aByteArray7596[0] & 255) << 8);
                           var13 = ((aByteArray7596[2] & 255) << 8) + (aByteArray7596[3] & 255);
                           var10 = (aByteArray7596[6] & 255) + ((aByteArray7596[5] & 255) << 8) + ((aByteArray7596[4] & 255) << 16);
                           var14 = aByteArray7596[7] & 255;
                        }

                        if(var1 != var12 || var13 != var9 || var14 != this.anInt7594 * 238890945) {
                           return false;
                        }

                        if(var10 < 0 || (long)var10 > this.aClass23_7593.method680(-2030265691) / 520L) {
                           return false;
                        }
                     }

                     if(var10 == 0) {
                        var4 = false;
                        var10 = (int)((this.aClass23_7593.method680(-2061279098) + 519L) / 520L);
                        if(0 == var10) {
                           ++var10;
                        }

                        if(var7 == var10) {
                           ++var10;
                        }
                     }

                     if(var1 > '\uffff') {
                        if(var3 - var8 <= 510) {
                           var10 = 0;
                        }

                        aByteArray7596[0] = (byte)(var1 >> 24);
                        aByteArray7596[1] = (byte)(var1 >> 16);
                        aByteArray7596[2] = (byte)(var1 >> 8);
                        aByteArray7596[3] = (byte)var1;
                        aByteArray7596[4] = (byte)(var9 >> 8);
                        aByteArray7596[5] = (byte)var9;
                        aByteArray7596[6] = (byte)(var10 >> 16);
                        aByteArray7596[7] = (byte)(var10 >> 8);
                        aByteArray7596[8] = (byte)var10;
                        aByteArray7596[9] = (byte)(this.anInt7594 * 238890945);
                        this.aClass23_7593.method679(520L * (long)var7);
                        this.aClass23_7593.method684(aByteArray7596, 0, 10, -928998512);
                        var12 = var3 - var8;
                        if(var12 > 510) {
                           var12 = 510;
                        }

                        this.aClass23_7593.method684(var2, var8, var12, -1561369666);
                        var8 += var12;
                     } else {
                        if(var3 - var8 <= 512) {
                           var10 = 0;
                        }

                        aByteArray7596[0] = (byte)(var1 >> 8);
                        aByteArray7596[1] = (byte)var1;
                        aByteArray7596[2] = (byte)(var9 >> 8);
                        aByteArray7596[3] = (byte)var9;
                        aByteArray7596[4] = (byte)(var10 >> 16);
                        aByteArray7596[5] = (byte)(var10 >> 8);
                        aByteArray7596[6] = (byte)var10;
                        aByteArray7596[7] = (byte)(238890945 * this.anInt7594);
                        this.aClass23_7593.method679((long)var7 * 520L);
                        this.aClass23_7593.method684(aByteArray7596, 0, 8, -955549619);
                        var12 = var3 - var8;
                        if(var12 > 512) {
                           var12 = 512;
                        }

                        this.aClass23_7593.method684(var2, var8, var12, -76754165);
                        var8 += var12;
                     }

                     var7 = var10;
                     ++var9;
                     continue;
                  }
               }

               boolean var10000 = true;
               return var10000;
            }
         } catch (IOException var18) {
            return false;
         }
      }
   }

   static final void method6790(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class333.method4256(var3, var4, var0, 1333189992);
   }

   public static Class235 method6791(RSByteBuffer var0, byte var1) {
      int var2 = var0.readUnsignedByte(-2013201067);
      if(0 == var2) {
         return null;
      } else {
         --var2;
         var0.pos += 801976415;
         int var3 = var0.readInt((byte)5);
         Object[] var4 = new Object[var2];

         for(int var5 = 0; var5 < var2; ++var5) {
            int var6 = var0.readUnsignedByte(-1594593278);
            if(var6 == 0) {
               var4[var5] = Class481.method5756(Integer.class, 1275090087).method75(var0, (short)21932);
            } else {
               if(var6 != 1) {
                  throw new IllegalStateException("Unrecognised type ID in deserialise: " + var6);
               }

               var4[var5] = Class481.method5756(String.class, 1275090087).method75(var0, (short)20535);
            }
         }

         return new Class235(var3, var4);
      }
   }

   static long method6792(CharSequence var0, byte var1) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if(var6 >= 65 && var6 <= 90) {
            var2 += (long)(1 + var6 - 65);
         } else if(var6 >= 97 && var6 <= 122) {
            var2 += (long)(var6 + 1 - 97);
         } else if(var6 >= 48 && var6 <= 57) {
            var2 += (long)(27 + var6 - 48);
         }

         if(var2 >= 177917621779460413L) {
            break;
         }
      }

      while(var2 % 37L == 0L && var2 != 0L) {
         var2 /= 37L;
      }

      return var2;
   }

   static final void method6793(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)107);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class415.method4932(var3, var4, var0, -883534973);
   }

   static final void method6794(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      int var4 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] - 1;
      if(var4 >= 0 && var4 <= 9) {
         var0.method3350(var4, (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629], (byte)78);
      } else {
         var2.anInt8625 -= 2019513325;
      }
   }
}
