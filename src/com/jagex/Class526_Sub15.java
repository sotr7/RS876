package com.jagex;

import com.jagex.Class148_Sub2;
import com.jagex.Class171;
import com.jagex.Class172;
import com.jagex.Class174_Sub3;
import com.jagex.Class526;
import com.jagex.Interface35;
import java.nio.ByteBuffer;

public class Class526_Sub15 extends Class526 {
   int anInt10458 = 0;
   int anInt10461 = 0;
   int anInt10466 = 0;
   int anInt10462 = 0;
   Interface35 anInterface35_10464;
   ByteBuffer aByteBuffer10468;
   long aLong10465;
   Class148_Sub2 aClass148_Sub2_10457;
   Class174_Sub3 aClass174_Sub3_10467;
   int anInt10456;
   float aFloat10459;
   Class172 aClass172_10460;
   int[] anIntArray10463;

   void method9372(int[] var1, int var2) {
      this.anInt10458 = 0;
      this.anInt10461 = 32767;
      this.anInt10466 = -32768;
      ByteBuffer var3 = this.aClass174_Sub3_10467.aByteBuffer9684;

      label49:
      for(int var4 = 0; var4 < var2; ++var4) {
         int var5 = var1[var4];
         short[] var6 = this.aClass148_Sub2_10457.aShortArrayArray9128[var5];
         int var7 = this.anIntArray10463[var5];
         if(var7 != 0 && var6 != null) {
            int var8 = 0;
            int var9 = 0;

            while(true) {
               while(true) {
                  if(var9 >= var6.length) {
                     continue label49;
                  }

                  if((var7 & 1 << var8++) != 0) {
                     for(int var10 = 0; var10 < 3; ++var10) {
                        int var11 = var6[var9++] & '\uffff';
                        if(var11 > this.anInt10466) {
                           this.anInt10466 = var11;
                        }

                        if(var11 < this.anInt10461) {
                           this.anInt10461 = var11;
                        }

                        var3.putShort((short)var11);
                     }

                     this.anInt10458 += 3;
                  } else {
                     var9 += 3;
                  }
               }
            }
         }
      }

   }

   void method9373(int var1) {
      this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)(var1 * 4) + 3L, (byte)-1);
   }

   void method9374(int var1) {
      this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)(var1 * 4) + 3L, (byte)-1);
   }

   void method9375(int var1, int var2, int var3) {
      this.anIntArray10463[var2 * this.aClass148_Sub2_10457.anInt1711 * 1966165105 + var1] |= 1 << var3;
      ++this.anInt10462;
   }

   void method9376(int var1, int var2, int var3, float var4) {
      int var6;
      int var7;
      if(this.anInt10456 != -1) {
         Class171 var5 = this.aClass174_Sub3_10467.aClass169_2035.method2122(this.anInt10456, (byte)35);
         var6 = var5.aByte1969 & 255;
         int var9;
         if(var6 != 0 && var5.aByte1966 != 4) {
            if(var3 < 0) {
               var7 = 0;
            } else if(var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

            if(var6 == 256) {
               var2 = var7;
            } else {
               var9 = 256 - var6;
               var2 = ((var7 & 16711935) * var6 + (var2 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var2 & '\uff00') * var9 & 16711680) >> 8;
            }
         }

         var7 = var5.aByte2012 & 255;
         if(var7 != 0) {
            var7 += 256;
            int var8 = ((var2 & 16711680) >> 16) * var7;
            if(var8 > '\uffff') {
               var8 = '\uffff';
            }

            var9 = ((var2 & '\uff00') >> 8) * var7;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            int var10 = (var2 & 255) * var7;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var2 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
         }
      }

      if(var4 != 1.0F) {
         int var11 = var2 >> 16 & 255;
         var6 = var2 >> 8 & 255;
         var7 = var2 & 255;
         var11 = (int)((float)var11 * var4);
         if(var11 < 0) {
            var11 = 0;
         } else if(var11 > 255) {
            var11 = 255;
         }

         var6 = (int)((float)var6 * var4);
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         var7 = (int)((float)var7 * var4);
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         var2 = var11 << 16 | var6 << 8 | var7;
      }

      if(this.aClass174_Sub3_10467.anInt9729 == 0) {
         this.aByteBuffer10468.put(var1 * 4 + 0, (byte)(var2 >> 16));
         this.aByteBuffer10468.put(var1 * 4 + 1, (byte)(var2 >> 8));
         this.aByteBuffer10468.put(var1 * 4 + 2, (byte)(var2 >> 0));
      } else {
         this.aByteBuffer10468.put(var1 * 4 + 0, (byte)(var2 >> 0));
         this.aByteBuffer10468.put(var1 * 4 + 1, (byte)(var2 >> 8));
         this.aByteBuffer10468.put(var1 * 4 + 2, (byte)(var2 >> 16));
      }

   }

   void method9377(int var1) {
      this.anInterface35_10464 = this.aClass174_Sub3_10467.method8818(false);
      this.anInterface35_10464.method249(var1 * 4, 4);
      this.anInterface35_10464.method235(0, var1 * 4, this.aLong10465);
      this.aByteBuffer10468.clear();
      this.aByteBuffer10468 = null;
      this.aLong10465 = 0L;
   }

   void method9378(int[] var1, int var2) {
      this.anInt10458 = 0;
      this.anInt10461 = 32767;
      this.anInt10466 = -32768;
      ByteBuffer var3 = this.aClass174_Sub3_10467.aByteBuffer9684;

      label49:
      for(int var4 = 0; var4 < var2; ++var4) {
         int var5 = var1[var4];
         short[] var6 = this.aClass148_Sub2_10457.aShortArrayArray9128[var5];
         int var7 = this.anIntArray10463[var5];
         if(var7 != 0 && var6 != null) {
            int var8 = 0;
            int var9 = 0;

            while(true) {
               while(true) {
                  if(var9 >= var6.length) {
                     continue label49;
                  }

                  if((var7 & 1 << var8++) != 0) {
                     for(int var10 = 0; var10 < 3; ++var10) {
                        int var11 = var6[var9++] & '\uffff';
                        if(var11 > this.anInt10466) {
                           this.anInt10466 = var11;
                        }

                        if(var11 < this.anInt10461) {
                           this.anInt10461 = var11;
                        }

                        var3.putShort((short)var11);
                     }

                     this.anInt10458 += 3;
                  } else {
                     var9 += 3;
                  }
               }
            }
         }
      }

   }

   void method9379(int var1) {
      this.aByteBuffer10468 = this.aClass174_Sub3_10467.method8723(var1 * 4);
      this.aLong10465 = this.aClass174_Sub3_10467.method8724(this.aByteBuffer10468);

      for(int var2 = 3; var2 < var1 * 4; var2 += 4) {
         this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)var2, (byte)0);
      }

   }

   void method9380(int var1) {
      this.aByteBuffer10468 = this.aClass174_Sub3_10467.method8723(var1 * 4);
      this.aLong10465 = this.aClass174_Sub3_10467.method8724(this.aByteBuffer10468);

      for(int var2 = 3; var2 < var1 * 4; var2 += 4) {
         this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)var2, (byte)0);
      }

   }

   void method9381(int var1) {
      this.aByteBuffer10468 = this.aClass174_Sub3_10467.method8723(var1 * 4);
      this.aLong10465 = this.aClass174_Sub3_10467.method8724(this.aByteBuffer10468);

      for(int var2 = 3; var2 < var1 * 4; var2 += 4) {
         this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)var2, (byte)0);
      }

   }

   void method9382(int[] var1, int var2) {
      this.anInt10458 = 0;
      this.anInt10461 = 32767;
      this.anInt10466 = -32768;
      ByteBuffer var3 = this.aClass174_Sub3_10467.aByteBuffer9684;

      label49:
      for(int var4 = 0; var4 < var2; ++var4) {
         int var5 = var1[var4];
         short[] var6 = this.aClass148_Sub2_10457.aShortArrayArray9128[var5];
         int var7 = this.anIntArray10463[var5];
         if(var7 != 0 && var6 != null) {
            int var8 = 0;
            int var9 = 0;

            while(true) {
               while(true) {
                  if(var9 >= var6.length) {
                     continue label49;
                  }

                  if((var7 & 1 << var8++) != 0) {
                     for(int var10 = 0; var10 < 3; ++var10) {
                        int var11 = var6[var9++] & '\uffff';
                        if(var11 > this.anInt10466) {
                           this.anInt10466 = var11;
                        }

                        if(var11 < this.anInt10461) {
                           this.anInt10461 = var11;
                        }

                        var3.putShort((short)var11);
                     }

                     this.anInt10458 += 3;
                  } else {
                     var9 += 3;
                  }
               }
            }
         }
      }

   }

   void method9383(int var1) {
      this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)(var1 * 4) + 3L, (byte)-1);
   }

   void method9384(int var1) {
      this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)(var1 * 4) + 3L, (byte)-1);
   }

   void method9385(int var1) {
      this.anInterface35_10464 = this.aClass174_Sub3_10467.method8818(false);
      this.anInterface35_10464.method249(var1 * 4, 4);
      this.anInterface35_10464.method235(0, var1 * 4, this.aLong10465);
      this.aByteBuffer10468.clear();
      this.aByteBuffer10468 = null;
      this.aLong10465 = 0L;
   }

   void method9386(int var1, int var2, int var3) {
      this.anIntArray10463[var2 * this.aClass148_Sub2_10457.anInt1711 * 1966165105 + var1] |= 1 << var3;
      ++this.anInt10462;
   }

   void method9387(int var1, int var2, int var3, float var4) {
      int var6;
      int var7;
      if(this.anInt10456 != -1) {
         Class171 var5 = this.aClass174_Sub3_10467.aClass169_2035.method2122(this.anInt10456, (byte)-58);
         var6 = var5.aByte1969 & 255;
         int var9;
         if(var6 != 0 && var5.aByte1966 != 4) {
            if(var3 < 0) {
               var7 = 0;
            } else if(var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

            if(var6 == 256) {
               var2 = var7;
            } else {
               var9 = 256 - var6;
               var2 = ((var7 & 16711935) * var6 + (var2 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var2 & '\uff00') * var9 & 16711680) >> 8;
            }
         }

         var7 = var5.aByte2012 & 255;
         if(var7 != 0) {
            var7 += 256;
            int var8 = ((var2 & 16711680) >> 16) * var7;
            if(var8 > '\uffff') {
               var8 = '\uffff';
            }

            var9 = ((var2 & '\uff00') >> 8) * var7;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            int var10 = (var2 & 255) * var7;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var2 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
         }
      }

      if(var4 != 1.0F) {
         int var11 = var2 >> 16 & 255;
         var6 = var2 >> 8 & 255;
         var7 = var2 & 255;
         var11 = (int)((float)var11 * var4);
         if(var11 < 0) {
            var11 = 0;
         } else if(var11 > 255) {
            var11 = 255;
         }

         var6 = (int)((float)var6 * var4);
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         var7 = (int)((float)var7 * var4);
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         var2 = var11 << 16 | var6 << 8 | var7;
      }

      if(this.aClass174_Sub3_10467.anInt9729 == 0) {
         this.aByteBuffer10468.put(var1 * 4 + 0, (byte)(var2 >> 16));
         this.aByteBuffer10468.put(var1 * 4 + 1, (byte)(var2 >> 8));
         this.aByteBuffer10468.put(var1 * 4 + 2, (byte)(var2 >> 0));
      } else {
         this.aByteBuffer10468.put(var1 * 4 + 0, (byte)(var2 >> 0));
         this.aByteBuffer10468.put(var1 * 4 + 1, (byte)(var2 >> 8));
         this.aByteBuffer10468.put(var1 * 4 + 2, (byte)(var2 >> 16));
      }

   }

   void method9388(int var1) {
      this.aByteBuffer10468 = this.aClass174_Sub3_10467.method8723(var1 * 4);
      this.aLong10465 = this.aClass174_Sub3_10467.method8724(this.aByteBuffer10468);

      for(int var2 = 3; var2 < var1 * 4; var2 += 4) {
         this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)var2, (byte)0);
      }

   }

   void method9389(int var1) {
      this.aClass174_Sub3_10467.anUnsafe9670.putByte(this.aLong10465 + (long)(var1 * 4) + 3L, (byte)-1);
   }

   Class526_Sub15(Class148_Sub2 var1, int var2, int var3, Class172 var4) {
      this.aClass148_Sub2_10457 = var1;
      this.aClass174_Sub3_10467 = this.aClass148_Sub2_10457.aClass174_Sub3_9121;
      this.anInt10456 = var2;
      this.aFloat10459 = (float)var3;
      this.aClass172_10460 = var4;
      this.anIntArray10463 = new int[this.aClass148_Sub2_10457.anInt1711 * 1966165105 * this.aClass148_Sub2_10457.anInt1713 * -810756899];
   }
}
