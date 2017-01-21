package com.jagex;

import com.jagex.Class124_Sub1;
import com.jagex.Class138_Sub1;
import com.jagex.Class144;
import com.jagex.Class145;
import com.jagex.Class148_Sub3;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.RSByteBuffer;
import com.jagex.Interface20;

public class Class128 {
   static final int anInt1601 = 128;
   static final int anInt1602 = 7;
   boolean aBool1599 = true;
   int anInt1606 = -1;
   Class124_Sub1 aClass124_Sub1_1600;
   Class174_Sub2 aClass174_Sub2_1605;
   Class145 aClass145_1610;
   int anInt1603;
   int anInt1604;
   int anInt1607;
   Interface20 anInterface20_1608;
   Class138_Sub1 aClass138_Sub1_1609;

   void method1617() {
      if(this.aBool1599) {
         this.aBool1599 = false;
         byte[] var1 = this.aClass145_1610.aByteArray1695;
         byte[] var2 = this.aClass174_Sub2_1605.aByteArray9502;
         int var3 = 0;
         int var4 = this.aClass145_1610.anInt1691;
         int var5 = this.anInt1603 + this.anInt1604 * this.aClass145_1610.anInt1691;

         int var6;
         int var7;
         for(var6 = -128; var6 < 0; ++var6) {
            var3 = (var3 << 8) - var3;

            for(var7 = -128; var7 < 0; ++var7) {
               if(var1[var5++] != 0) {
                  ++var3;
               }
            }

            var5 += var4 - 128;
         }

         if(this.aClass124_Sub1_1600 != null && this.anInt1606 == var3) {
            this.aBool1599 = false;
         } else {
            this.anInt1606 = var3;
            var6 = 0;
            var5 = this.anInt1603 + this.anInt1604 * var4;

            for(var7 = -128; var7 < 0; ++var7) {
               for(int var8 = -128; var8 < 0; ++var8) {
                  if(var1[var5] != 0) {
                     var2[var6++] = 68;
                  } else {
                     int var9 = 0;
                     if(var1[var5 - 1] != 0) {
                        ++var9;
                     }

                     if(var1[var5 + 1] != 0) {
                        ++var9;
                     }

                     if(var1[var5 - var4] != 0) {
                        ++var9;
                     }

                     if(var1[var5 + var4] != 0) {
                        ++var9;
                     }

                     var2[var6++] = (byte)(17 * var9);
                  }

                  ++var5;
               }

               var5 += this.aClass145_1610.anInt1691 - 128;
            }

            if(this.aClass124_Sub1_1600 == null) {
               this.aClass124_Sub1_1600 = new Class124_Sub1(this.aClass174_Sub2_1605, 3553, Class144.aClass144_1681, Class166.aClass166_1884, 128, 128, false, this.aClass174_Sub2_1605.aByteArray9502, Class144.aClass144_1681, false);
               this.aClass124_Sub1_1600.method8335(false, false);
               this.aClass124_Sub1_1600.method1475(true);
            } else {
               this.aClass124_Sub1_1600.method8336(0, 0, 128, 128, this.aClass174_Sub2_1605.aByteArray9502, Class144.aClass144_1681, 0, 0, false);
            }

         }
      }
   }

   void method1618() {
      this.method1620(this.anInterface20_1608, this.anInt1607);
   }

   void method1619(byte[] var1, int var2) {
      this.aClass138_Sub1_1609.method138(5123, var1, var2 * 2);
      this.method1620(this.aClass138_Sub1_1609, var2);
   }

   void method1620(Interface20 var1, int var2) {
      if(var2 != 0) {
         this.method1617();
         this.aClass174_Sub2_1605.method8641(this.aClass124_Sub1_1600);
         this.aClass174_Sub2_1605.method8664(var1, 4, 0, var2);
      }
   }

   void method1621() {
      if(this.aBool1599) {
         this.aBool1599 = false;
         byte[] var1 = this.aClass145_1610.aByteArray1695;
         byte[] var2 = this.aClass174_Sub2_1605.aByteArray9502;
         int var3 = 0;
         int var4 = this.aClass145_1610.anInt1691;
         int var5 = this.anInt1603 + this.anInt1604 * this.aClass145_1610.anInt1691;

         int var6;
         int var7;
         for(var6 = -128; var6 < 0; ++var6) {
            var3 = (var3 << 8) - var3;

            for(var7 = -128; var7 < 0; ++var7) {
               if(var1[var5++] != 0) {
                  ++var3;
               }
            }

            var5 += var4 - 128;
         }

         if(this.aClass124_Sub1_1600 != null && this.anInt1606 == var3) {
            this.aBool1599 = false;
         } else {
            this.anInt1606 = var3;
            var6 = 0;
            var5 = this.anInt1603 + this.anInt1604 * var4;

            for(var7 = -128; var7 < 0; ++var7) {
               for(int var8 = -128; var8 < 0; ++var8) {
                  if(var1[var5] != 0) {
                     var2[var6++] = 68;
                  } else {
                     int var9 = 0;
                     if(var1[var5 - 1] != 0) {
                        ++var9;
                     }

                     if(var1[var5 + 1] != 0) {
                        ++var9;
                     }

                     if(var1[var5 - var4] != 0) {
                        ++var9;
                     }

                     if(var1[var5 + var4] != 0) {
                        ++var9;
                     }

                     var2[var6++] = (byte)(17 * var9);
                  }

                  ++var5;
               }

               var5 += this.aClass145_1610.anInt1691 - 128;
            }

            if(this.aClass124_Sub1_1600 == null) {
               this.aClass124_Sub1_1600 = new Class124_Sub1(this.aClass174_Sub2_1605, 3553, Class144.aClass144_1681, Class166.aClass166_1884, 128, 128, false, this.aClass174_Sub2_1605.aByteArray9502, Class144.aClass144_1681, false);
               this.aClass124_Sub1_1600.method8335(false, false);
               this.aClass124_Sub1_1600.method1475(true);
            } else {
               this.aClass124_Sub1_1600.method8336(0, 0, 128, 128, this.aClass174_Sub2_1605.aByteArray9502, Class144.aClass144_1681, 0, 0, false);
            }

         }
      }
   }

   void method1622() {
      this.method1620(this.anInterface20_1608, this.anInt1607);
   }

   void method1623() {
      this.method1620(this.anInterface20_1608, this.anInt1607);
   }

   void method1624() {
      this.method1620(this.anInterface20_1608, this.anInt1607);
   }

   void method1625() {
      if(this.aBool1599) {
         this.aBool1599 = false;
         byte[] var1 = this.aClass145_1610.aByteArray1695;
         byte[] var2 = this.aClass174_Sub2_1605.aByteArray9502;
         int var3 = 0;
         int var4 = this.aClass145_1610.anInt1691;
         int var5 = this.anInt1603 + this.anInt1604 * this.aClass145_1610.anInt1691;

         int var6;
         int var7;
         for(var6 = -128; var6 < 0; ++var6) {
            var3 = (var3 << 8) - var3;

            for(var7 = -128; var7 < 0; ++var7) {
               if(var1[var5++] != 0) {
                  ++var3;
               }
            }

            var5 += var4 - 128;
         }

         if(this.aClass124_Sub1_1600 != null && this.anInt1606 == var3) {
            this.aBool1599 = false;
         } else {
            this.anInt1606 = var3;
            var6 = 0;
            var5 = this.anInt1603 + this.anInt1604 * var4;

            for(var7 = -128; var7 < 0; ++var7) {
               for(int var8 = -128; var8 < 0; ++var8) {
                  if(var1[var5] != 0) {
                     var2[var6++] = 68;
                  } else {
                     int var9 = 0;
                     if(var1[var5 - 1] != 0) {
                        ++var9;
                     }

                     if(var1[var5 + 1] != 0) {
                        ++var9;
                     }

                     if(var1[var5 - var4] != 0) {
                        ++var9;
                     }

                     if(var1[var5 + var4] != 0) {
                        ++var9;
                     }

                     var2[var6++] = (byte)(17 * var9);
                  }

                  ++var5;
               }

               var5 += this.aClass145_1610.anInt1691 - 128;
            }

            if(this.aClass124_Sub1_1600 == null) {
               this.aClass124_Sub1_1600 = new Class124_Sub1(this.aClass174_Sub2_1605, 3553, Class144.aClass144_1681, Class166.aClass166_1884, 128, 128, false, this.aClass174_Sub2_1605.aByteArray9502, Class144.aClass144_1681, false);
               this.aClass124_Sub1_1600.method8335(false, false);
               this.aClass124_Sub1_1600.method1475(true);
            } else {
               this.aClass124_Sub1_1600.method8336(0, 0, 128, 128, this.aClass174_Sub2_1605.aByteArray9502, Class144.aClass144_1681, 0, 0, false);
            }

         }
      }
   }

   Class128(Class174_Sub2 var1, Class145 var2, Class148_Sub3 var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass174_Sub2_1605 = var1;
      this.aClass145_1610 = var2;
      this.anInt1603 = var7;
      this.anInt1604 = var8;
      int var9 = 1 << var6;
      int var10 = 0;
      int var11 = var4 << var6;
      int var12 = var5 << var6;

      int var14;
      int var15;
      for(int var13 = 0; var13 < var9; ++var13) {
         var14 = (var12 + var13) * var3.anInt1711 * 1966165105 + var11;

         for(var15 = 0; var15 < var9; ++var15) {
            short[] var16 = var3.aShortArrayArray9170[var14++];
            if(var16 != null) {
               var10 += var16.length;
            }
         }
      }

      this.anInt1607 = var10;
      if(var10 > 0) {
         RSByteBuffer var19 = new RSByteBuffer(var10 * 2);
         short[] var17;
         int var18;
         int var20;
         if(this.aClass174_Sub2_1605.aBool9508) {
            for(var14 = 0; var14 < var9; ++var14) {
               var15 = (var12 + var14) * var3.anInt1711 * 1966165105 + var11;

               for(var20 = 0; var20 < var9; ++var20) {
                  var17 = var3.aShortArrayArray9170[var15++];
                  if(var17 != null) {
                     for(var18 = 0; var18 < var17.length; ++var18) {
                        var19.writeShort(var17[var18] & '\uffff', -805078716);
                     }
                  }
               }
            }
         } else {
            for(var14 = 0; var14 < var9; ++var14) {
               var15 = (var12 + var14) * var3.anInt1711 * 1966165105 + var11;

               for(var20 = 0; var20 < var9; ++var20) {
                  var17 = var3.aShortArrayArray9170[var15++];
                  if(var17 != null) {
                     for(var18 = 0; var18 < var17.length; ++var18) {
                        var19.method9610(var17[var18] & '\uffff', (byte)0);
                     }
                  }
               }
            }
         }

         this.anInterface20_1608 = this.aClass174_Sub2_1605.method8630(5123, var19.buffer, var19.pos * 301018015, false);
         this.aClass138_Sub1_1609 = new Class138_Sub1(this.aClass174_Sub2_1605, 5123, (byte[])null, 1);
      } else {
         this.aClass124_Sub1_1600 = null;
      }

   }
}
