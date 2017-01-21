package com.jagex;

import com.jagex.Class173;

public class Class173_Sub2 extends Class173 {
   int anInt9856;
   public int anInt9855;
   int anInt9854;
   public int anInt9853;
   public byte[] aByteArray9859;
   int anInt9851;
   int anInt9852;
   public byte[] aByteArray9858;
   public int[] anIntArray9857;

   public int method2191() {
      return this.anInt9851 + this.anInt9853 + this.anInt9854;
   }

   public boolean method2166() {
      return true;
   }

   public boolean method2224() {
      return this.aByteArray9859 != null;
   }

   public int method2168() {
      return this.anInt9851;
   }

   public int method2175() {
      return this.anInt9852;
   }

   public int method2214() {
      return this.anInt9851 + this.anInt9853 + this.anInt9854;
   }

   public int method2176() {
      return this.anInt9852 + this.anInt9855 + this.anInt9856;
   }

   public int method2193() {
      return this.anInt9853;
   }

   public int method2171() {
      return this.anInt9854;
   }

   public int method2221() {
      return this.anInt9852;
   }

   public int method2173() {
      return this.anInt9856;
   }

   public void method2174() {
      this.anInt9856 = 0;
      this.anInt9855 = 0;
      this.anInt9854 = 0;
      this.anInt9853 = 0;
   }

   public void method2177(int var1) {
      int var2 = this.method2214();
      int var3 = this.method2176();
      if(this.anInt9851 != var2 || this.anInt9852 != var3) {
         int var4 = var1;
         if(var1 > this.anInt9853) {
            var4 = this.anInt9853;
         }

         int var5 = var1;
         if(var1 + this.anInt9853 + this.anInt9851 > var2) {
            var5 = var2 - this.anInt9853 - this.anInt9851;
         }

         int var6 = var1;
         if(var1 > this.anInt9855) {
            var6 = this.anInt9855;
         }

         int var7 = var1;
         if(var1 + this.anInt9855 + this.anInt9852 > var3) {
            var7 = var3 - this.anInt9855 - this.anInt9852;
         }

         int var8 = this.anInt9851 + var4 + var5;
         int var9 = this.anInt9852 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         int var12;
         int var13;
         int var14;
         if(this.aByteArray9859 == null) {
            for(int var11 = 0; var11 < this.anInt9852; ++var11) {
               var12 = var11 * this.anInt9851;
               var13 = (var11 + var6) * var8 + var4;

               for(var14 = 0; var14 < this.anInt9851; ++var14) {
                  var10[var13++] = this.aByteArray9858[var12++];
               }
            }
         } else {
            byte[] var16 = new byte[var8 * var9];

            for(var12 = 0; var12 < this.anInt9852; ++var12) {
               var13 = var12 * this.anInt9851;
               var14 = (var12 + var6) * var8 + var4;

               for(int var15 = 0; var15 < this.anInt9851; ++var15) {
                  var16[var14] = this.aByteArray9859[var13];
                  var10[var14++] = this.aByteArray9858[var13++];
               }
            }

            this.aByteArray9859 = var16;
         }

         this.anInt9853 -= var4;
         this.anInt9855 -= var6;
         this.anInt9854 -= var5;
         this.anInt9856 -= var7;
         this.anInt9851 = var8;
         this.anInt9852 = var9;
         this.aByteArray9858 = var10;
      }
   }

   public int method2195() {
      return this.anInt9855;
   }

   public void method2180(int var1) {
      int var2 = -1;
      int var3;
      int var4;
      int var5;
      if(this.anIntArray9857.length < 255) {
         for(var3 = 0; var3 < this.anIntArray9857.length; ++var3) {
            if(this.anIntArray9857[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.anIntArray9857.length;
            int[] var16 = new int[this.anIntArray9857.length + 1];
            System.arraycopy(this.anIntArray9857, 0, var16, 0, this.anIntArray9857.length);
            this.anIntArray9857 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         int var6 = var1 & 255;

         for(int var7 = 0; var7 < this.anIntArray9857.length; ++var7) {
            int var8 = this.anIntArray9857[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      for(var3 = this.anInt9852 - 1; var3 > 0; --var3) {
         var4 = var3 * this.anInt9851;

         for(var5 = this.anInt9851 - 1; var5 > 0; --var5) {
            if(this.anIntArray9857[this.aByteArray9858[var5 + var4] & 255] == 0 && this.anIntArray9857[this.aByteArray9858[var5 + var4 - 1 - this.anInt9851] & 255] != 0) {
               this.aByteArray9858[var5 + var4] = (byte)var2;
            }
         }
      }

   }

   public void method2205(int var1) {
      int var2 = -1;
      int var3;
      int var5;
      int var6;
      int var7;
      if(this.anIntArray9857.length < 255) {
         for(var3 = 0; var3 < this.anIntArray9857.length; ++var3) {
            if(this.anIntArray9857[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.anIntArray9857.length;
            int[] var16 = new int[this.anIntArray9857.length + 1];
            System.arraycopy(this.anIntArray9857, 0, var16, 0, this.anIntArray9857.length);
            this.anIntArray9857 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         int var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         var6 = var1 & 255;

         for(var7 = 0; var7 < this.anIntArray9857.length; ++var7) {
            int var8 = this.anIntArray9857[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      var3 = 0;
      byte[] var17 = new byte[this.anInt9851 * this.anInt9852];

      for(var5 = 0; var5 < this.anInt9852; ++var5) {
         for(var6 = 0; var6 < this.anInt9851; ++var6) {
            var7 = this.aByteArray9858[var3] & 255;
            if(this.anIntArray9857[var7] == 0) {
               if(var6 > 0 && this.anIntArray9857[this.aByteArray9858[var3 - 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 > 0 && this.anIntArray9857[this.aByteArray9858[var3 - this.anInt9851] & 255] != 0) {
                  var7 = var2;
               } else if(var6 < this.anInt9851 - 1 && this.anIntArray9857[this.aByteArray9858[var3 + 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 < this.anInt9852 - 1 && this.anIntArray9857[this.aByteArray9858[var3 + this.anInt9851] & 255] != 0) {
                  var7 = var2;
               }
            }

            var17[var3++] = (byte)var7;
         }
      }

      this.aByteArray9858 = var17;
   }

   public void method2207() {
      byte[] var1 = this.aByteArray9858;
      int var2;
      int var3;
      int var4;
      int var5;
      byte var6;
      if(this.aByteArray9859 == null) {
         for(var2 = (this.anInt9852 >> 1) - 1; var2 >= 0; --var2) {
            var3 = var2 * this.anInt9851;
            var4 = (this.anInt9852 - var2 - 1) * this.anInt9851;

            for(var5 = -this.anInt9851; var5 < 0; ++var5) {
               var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var8 = this.aByteArray9859;

         for(var3 = (this.anInt9852 >> 1) - 1; var3 >= 0; --var3) {
            var4 = var3 * this.anInt9851;
            var5 = (this.anInt9852 - var3 - 1) * this.anInt9851;

            for(int var7 = -this.anInt9851; var7 < 0; ++var7) {
               var6 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5] = var6;
               var6 = var8[var4];
               var8[var4] = var8[var5];
               var8[var5] = var6;
               ++var4;
               ++var5;
            }
         }
      }

      var2 = this.anInt9855;
      this.anInt9855 = this.anInt9856;
      this.anInt9856 = var2;
   }

   public void method2208() {
      byte[] var1 = new byte[this.anInt9851 * this.anInt9852];
      int var2 = 0;
      int var3;
      int var4;
      if(this.aByteArray9859 == null) {
         for(var3 = 0; var3 < this.anInt9851; ++var3) {
            for(var4 = this.anInt9852 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.aByteArray9858[var3 + var4 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
      } else {
         byte[] var6 = new byte[this.anInt9851 * this.anInt9852];

         for(var4 = 0; var4 < this.anInt9851; ++var4) {
            for(int var5 = this.anInt9852 - 1; var5 >= 0; --var5) {
               var1[var2] = this.aByteArray9858[var4 + var5 * this.anInt9851];
               var6[var2++] = this.aByteArray9859[var4 + var5 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
         this.aByteArray9859 = var6;
      }

      var3 = this.anInt9855;
      this.anInt9855 = this.anInt9853;
      this.anInt9853 = this.anInt9856;
      this.anInt9856 = this.anInt9854;
      this.anInt9854 = var3;
      var3 = this.anInt9852;
      this.anInt9852 = this.anInt9851;
      this.anInt9851 = var3;
   }

   public int[] method2204(boolean var1) {
      int var2;
      int[] var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if(var1) {
         var2 = this.method2214();
         var3 = new int[var2 * this.method2176()];
         if(this.aByteArray9859 != null) {
            for(var4 = 0; var4 < this.anInt9852; ++var4) {
               var5 = var4 * this.anInt9851;
               var6 = this.anInt9853 + (var4 + this.anInt9855) * var2;

               for(var7 = 0; var7 < this.anInt9851; ++var7) {
                  var3[var6++] = this.aByteArray9859[var5] << 24 | this.anIntArray9857[this.aByteArray9858[var5] & 255];
                  ++var5;
               }
            }
         } else {
            for(var4 = 0; var4 < this.anInt9852; ++var4) {
               var5 = var4 * this.anInt9851;
               var6 = this.anInt9853 + (var4 + this.anInt9855) * var2;

               for(var7 = 0; var7 < this.anInt9851; ++var7) {
                  int var8 = this.anIntArray9857[this.aByteArray9858[var5++] & 255];
                  if(var8 != 0) {
                     var3[var6++] = -16777216 | var8;
                  } else {
                     var3[var6++] = 0;
                  }
               }
            }
         }
      } else {
         var3 = new int[this.anInt9851 * this.anInt9852];
         var2 = 0;
         var4 = 0;
         if(this.aByteArray9859 != null) {
            for(var5 = 0; var5 < this.anInt9852; ++var5) {
               for(var6 = 0; var6 < this.anInt9851; ++var6) {
                  var3[var4++] = this.aByteArray9859[var2] << 24 | this.anIntArray9857[this.aByteArray9858[var2] & 255];
                  ++var2;
               }
            }
         } else {
            for(var5 = 0; var5 < this.anInt9852; ++var5) {
               for(var6 = 0; var6 < this.anInt9851; ++var6) {
                  var7 = this.anIntArray9857[this.aByteArray9858[var2++] & 255];
                  var3[var4++] = var7 != 0?-16777216 | var7:0;
               }
            }
         }
      }

      return var3;
   }

   public void method2184(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9857.length; ++var4) {
         if(this.anIntArray9857[var4] != 1 && this.anIntArray9857[var4] != 16711935) {
            int var5 = this.anIntArray9857[var4] >> 16 & 255;
            var5 += var1;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > 255) {
               var5 = 255;
            }

            int var6 = this.anIntArray9857[var4] >> 8 & 255;
            var6 += var2;
            if(var6 < 0) {
               var6 = 0;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var7 = this.anIntArray9857[var4] >> 0 & 255;
            var7 += var3;
            if(var7 < 0) {
               var7 = 0;
            } else if(var7 > 255) {
               var7 = 255;
            }

            this.anIntArray9857[var4] = var5 << 16 | var6 << 8 | var7;
         }
      }

   }

   public int method2199(int var1, int var2) {
      return this.anIntArray9857[this.aByteArray9858[var1 + var2 * this.anInt9851] & 255];
   }

   public boolean method2186() {
      return true;
   }

   public void method2218(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9857.length; ++var4) {
         if(this.anIntArray9857[var4] != 1 && this.anIntArray9857[var4] != 16711935) {
            int var5 = this.anIntArray9857[var4] >> 16 & 255;
            var5 += var1;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > 255) {
               var5 = 255;
            }

            int var6 = this.anIntArray9857[var4] >> 8 & 255;
            var6 += var2;
            if(var6 < 0) {
               var6 = 0;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var7 = this.anIntArray9857[var4] >> 0 & 255;
            var7 += var3;
            if(var7 < 0) {
               var7 = 0;
            } else if(var7 > 255) {
               var7 = 255;
            }

            this.anIntArray9857[var4] = var5 << 16 | var6 << 8 | var7;
         }
      }

   }

   public boolean method2188() {
      return this.aByteArray9859 != null;
   }

   public int method2198() {
      return this.anInt9856;
   }

   public int method2190() {
      return this.anInt9851 + this.anInt9853 + this.anInt9854;
   }

   public int method2170() {
      return this.anInt9853;
   }

   public int method2192() {
      return this.anInt9852 + this.anInt9855 + this.anInt9856;
   }

   public int method2189() {
      return this.anInt9851;
   }

   public int method2187() {
      return this.anInt9853;
   }

   public int method2178() {
      return this.anInt9854;
   }

   public int method2210() {
      return this.anInt9854;
   }

   public int method2196() {
      return this.anInt9854;
   }

   public void method2179(int var1) {
      int var2 = -1;
      int var3;
      int var5;
      int var6;
      int var7;
      if(this.anIntArray9857.length < 255) {
         for(var3 = 0; var3 < this.anIntArray9857.length; ++var3) {
            if(this.anIntArray9857[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.anIntArray9857.length;
            int[] var16 = new int[this.anIntArray9857.length + 1];
            System.arraycopy(this.anIntArray9857, 0, var16, 0, this.anIntArray9857.length);
            this.anIntArray9857 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         int var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         var6 = var1 & 255;

         for(var7 = 0; var7 < this.anIntArray9857.length; ++var7) {
            int var8 = this.anIntArray9857[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      var3 = 0;
      byte[] var17 = new byte[this.anInt9851 * this.anInt9852];

      for(var5 = 0; var5 < this.anInt9852; ++var5) {
         for(var6 = 0; var6 < this.anInt9851; ++var6) {
            var7 = this.aByteArray9858[var3] & 255;
            if(this.anIntArray9857[var7] == 0) {
               if(var6 > 0 && this.anIntArray9857[this.aByteArray9858[var3 - 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 > 0 && this.anIntArray9857[this.aByteArray9858[var3 - this.anInt9851] & 255] != 0) {
                  var7 = var2;
               } else if(var6 < this.anInt9851 - 1 && this.anIntArray9857[this.aByteArray9858[var3 + 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 < this.anInt9852 - 1 && this.anIntArray9857[this.aByteArray9858[var3 + this.anInt9851] & 255] != 0) {
                  var7 = var2;
               }
            }

            var17[var3++] = (byte)var7;
         }
      }

      this.aByteArray9858 = var17;
   }

   public void method2203(int var1) {
      int var2 = this.method2214();
      int var3 = this.method2176();
      if(this.anInt9851 != var2 || this.anInt9852 != var3) {
         int var4 = var1;
         if(var1 > this.anInt9853) {
            var4 = this.anInt9853;
         }

         int var5 = var1;
         if(var1 + this.anInt9853 + this.anInt9851 > var2) {
            var5 = var2 - this.anInt9853 - this.anInt9851;
         }

         int var6 = var1;
         if(var1 > this.anInt9855) {
            var6 = this.anInt9855;
         }

         int var7 = var1;
         if(var1 + this.anInt9855 + this.anInt9852 > var3) {
            var7 = var3 - this.anInt9855 - this.anInt9852;
         }

         int var8 = this.anInt9851 + var4 + var5;
         int var9 = this.anInt9852 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         int var12;
         int var13;
         int var14;
         if(this.aByteArray9859 == null) {
            for(int var11 = 0; var11 < this.anInt9852; ++var11) {
               var12 = var11 * this.anInt9851;
               var13 = (var11 + var6) * var8 + var4;

               for(var14 = 0; var14 < this.anInt9851; ++var14) {
                  var10[var13++] = this.aByteArray9858[var12++];
               }
            }
         } else {
            byte[] var16 = new byte[var8 * var9];

            for(var12 = 0; var12 < this.anInt9852; ++var12) {
               var13 = var12 * this.anInt9851;
               var14 = (var12 + var6) * var8 + var4;

               for(int var15 = 0; var15 < this.anInt9851; ++var15) {
                  var16[var14] = this.aByteArray9859[var13];
                  var10[var14++] = this.aByteArray9858[var13++];
               }
            }

            this.aByteArray9859 = var16;
         }

         this.anInt9853 -= var4;
         this.anInt9855 -= var6;
         this.anInt9854 -= var5;
         this.anInt9856 -= var7;
         this.anInt9851 = var8;
         this.anInt9852 = var9;
         this.aByteArray9858 = var10;
      }
   }

   public int method2182() {
      return this.anInt9856;
   }

   public void method2200() {
      this.anInt9856 = 0;
      this.anInt9855 = 0;
      this.anInt9854 = 0;
      this.anInt9853 = 0;
   }

   public void method2194(int var1) {
      int var2 = this.method2214();
      int var3 = this.method2176();
      if(this.anInt9851 != var2 || this.anInt9852 != var3) {
         int var4 = var1;
         if(var1 > this.anInt9853) {
            var4 = this.anInt9853;
         }

         int var5 = var1;
         if(var1 + this.anInt9853 + this.anInt9851 > var2) {
            var5 = var2 - this.anInt9853 - this.anInt9851;
         }

         int var6 = var1;
         if(var1 > this.anInt9855) {
            var6 = this.anInt9855;
         }

         int var7 = var1;
         if(var1 + this.anInt9855 + this.anInt9852 > var3) {
            var7 = var3 - this.anInt9855 - this.anInt9852;
         }

         int var8 = this.anInt9851 + var4 + var5;
         int var9 = this.anInt9852 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         int var12;
         int var13;
         int var14;
         if(this.aByteArray9859 == null) {
            for(int var11 = 0; var11 < this.anInt9852; ++var11) {
               var12 = var11 * this.anInt9851;
               var13 = (var11 + var6) * var8 + var4;

               for(var14 = 0; var14 < this.anInt9851; ++var14) {
                  var10[var13++] = this.aByteArray9858[var12++];
               }
            }
         } else {
            byte[] var16 = new byte[var8 * var9];

            for(var12 = 0; var12 < this.anInt9852; ++var12) {
               var13 = var12 * this.anInt9851;
               var14 = (var12 + var6) * var8 + var4;

               for(int var15 = 0; var15 < this.anInt9851; ++var15) {
                  var16[var14] = this.aByteArray9859[var13];
                  var10[var14++] = this.aByteArray9858[var13++];
               }
            }

            this.aByteArray9859 = var16;
         }

         this.anInt9853 -= var4;
         this.anInt9855 -= var6;
         this.anInt9854 -= var5;
         this.anInt9856 -= var7;
         this.anInt9851 = var8;
         this.anInt9852 = var9;
         this.aByteArray9858 = var10;
      }
   }

   public void method2202(int var1) {
      int var2 = this.method2214();
      int var3 = this.method2176();
      if(this.anInt9851 != var2 || this.anInt9852 != var3) {
         int var4 = var1;
         if(var1 > this.anInt9853) {
            var4 = this.anInt9853;
         }

         int var5 = var1;
         if(var1 + this.anInt9853 + this.anInt9851 > var2) {
            var5 = var2 - this.anInt9853 - this.anInt9851;
         }

         int var6 = var1;
         if(var1 > this.anInt9855) {
            var6 = this.anInt9855;
         }

         int var7 = var1;
         if(var1 + this.anInt9855 + this.anInt9852 > var3) {
            var7 = var3 - this.anInt9855 - this.anInt9852;
         }

         int var8 = this.anInt9851 + var4 + var5;
         int var9 = this.anInt9852 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         int var12;
         int var13;
         int var14;
         if(this.aByteArray9859 == null) {
            for(int var11 = 0; var11 < this.anInt9852; ++var11) {
               var12 = var11 * this.anInt9851;
               var13 = (var11 + var6) * var8 + var4;

               for(var14 = 0; var14 < this.anInt9851; ++var14) {
                  var10[var13++] = this.aByteArray9858[var12++];
               }
            }
         } else {
            byte[] var16 = new byte[var8 * var9];

            for(var12 = 0; var12 < this.anInt9852; ++var12) {
               var13 = var12 * this.anInt9851;
               var14 = (var12 + var6) * var8 + var4;

               for(int var15 = 0; var15 < this.anInt9851; ++var15) {
                  var16[var14] = this.aByteArray9859[var13];
                  var10[var14++] = this.aByteArray9858[var13++];
               }
            }

            this.aByteArray9859 = var16;
         }

         this.anInt9853 -= var4;
         this.anInt9855 -= var6;
         this.anInt9854 -= var5;
         this.anInt9856 -= var7;
         this.anInt9851 = var8;
         this.anInt9852 = var9;
         this.aByteArray9858 = var10;
      }
   }

   public void method2213() {
      byte[] var1 = new byte[this.anInt9851 * this.anInt9852];
      int var2 = 0;
      int var3;
      int var4;
      if(this.aByteArray9859 == null) {
         for(var3 = 0; var3 < this.anInt9851; ++var3) {
            for(var4 = this.anInt9852 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.aByteArray9858[var3 + var4 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
      } else {
         byte[] var6 = new byte[this.anInt9851 * this.anInt9852];

         for(var4 = 0; var4 < this.anInt9851; ++var4) {
            for(int var5 = this.anInt9852 - 1; var5 >= 0; --var5) {
               var1[var2] = this.aByteArray9858[var4 + var5 * this.anInt9851];
               var6[var2++] = this.aByteArray9859[var4 + var5 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
         this.aByteArray9859 = var6;
      }

      var3 = this.anInt9855;
      this.anInt9855 = this.anInt9853;
      this.anInt9853 = this.anInt9856;
      this.anInt9856 = this.anInt9854;
      this.anInt9854 = var3;
      var3 = this.anInt9852;
      this.anInt9852 = this.anInt9851;
      this.anInt9851 = var3;
   }

   public void method2223(int var1) {
      int var2 = -1;
      int var3;
      int var5;
      int var6;
      int var7;
      if(this.anIntArray9857.length < 255) {
         for(var3 = 0; var3 < this.anIntArray9857.length; ++var3) {
            if(this.anIntArray9857[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.anIntArray9857.length;
            int[] var16 = new int[this.anIntArray9857.length + 1];
            System.arraycopy(this.anIntArray9857, 0, var16, 0, this.anIntArray9857.length);
            this.anIntArray9857 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         int var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         var6 = var1 & 255;

         for(var7 = 0; var7 < this.anIntArray9857.length; ++var7) {
            int var8 = this.anIntArray9857[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      var3 = 0;
      byte[] var17 = new byte[this.anInt9851 * this.anInt9852];

      for(var5 = 0; var5 < this.anInt9852; ++var5) {
         for(var6 = 0; var6 < this.anInt9851; ++var6) {
            var7 = this.aByteArray9858[var3] & 255;
            if(this.anIntArray9857[var7] == 0) {
               if(var6 > 0 && this.anIntArray9857[this.aByteArray9858[var3 - 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 > 0 && this.anIntArray9857[this.aByteArray9858[var3 - this.anInt9851] & 255] != 0) {
                  var7 = var2;
               } else if(var6 < this.anInt9851 - 1 && this.anIntArray9857[this.aByteArray9858[var3 + 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 < this.anInt9852 - 1 && this.anIntArray9857[this.aByteArray9858[var3 + this.anInt9851] & 255] != 0) {
                  var7 = var2;
               }
            }

            var17[var3++] = (byte)var7;
         }
      }

      this.aByteArray9858 = var17;
   }

   public int method2197() {
      return this.anInt9854;
   }

   public void method2206(int var1) {
      int var2 = -1;
      int var3;
      int var4;
      int var5;
      if(this.anIntArray9857.length < 255) {
         for(var3 = 0; var3 < this.anIntArray9857.length; ++var3) {
            if(this.anIntArray9857[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.anIntArray9857.length;
            int[] var16 = new int[this.anIntArray9857.length + 1];
            System.arraycopy(this.anIntArray9857, 0, var16, 0, this.anIntArray9857.length);
            this.anIntArray9857 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         int var6 = var1 & 255;

         for(int var7 = 0; var7 < this.anIntArray9857.length; ++var7) {
            int var8 = this.anIntArray9857[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      for(var3 = this.anInt9852 - 1; var3 > 0; --var3) {
         var4 = var3 * this.anInt9851;

         for(var5 = this.anInt9851 - 1; var5 > 0; --var5) {
            if(this.anIntArray9857[this.aByteArray9858[var5 + var4] & 255] == 0 && this.anIntArray9857[this.aByteArray9858[var5 + var4 - 1 - this.anInt9851] & 255] != 0) {
               this.aByteArray9858[var5 + var4] = (byte)var2;
            }
         }
      }

   }

   public void method2167() {
      byte[] var1 = this.aByteArray9858;
      int var2;
      int var3;
      int var4;
      byte var5;
      if(this.aByteArray9859 == null) {
         for(var2 = this.anInt9852 - 1; var2 >= 0; --var2) {
            var3 = var2 * this.anInt9851;

            for(var4 = (var2 + 1) * this.anInt9851; var3 < var4; ++var3) {
               --var4;
               var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
            }
         }
      } else {
         byte[] var7 = this.aByteArray9859;

         for(var3 = this.anInt9852 - 1; var3 >= 0; --var3) {
            var4 = var3 * this.anInt9851;

            for(int var6 = (var3 + 1) * this.anInt9851; var4 < var6; ++var4) {
               --var6;
               var5 = var1[var4];
               var1[var4] = var1[var6];
               var1[var6] = var5;
               var5 = var7[var4];
               var7[var4] = var7[var6];
               var7[var6] = var5;
            }
         }
      }

      var2 = this.anInt9853;
      this.anInt9853 = this.anInt9854;
      this.anInt9854 = var2;
   }

   public void method2169() {
      byte[] var1 = this.aByteArray9858;
      int var2;
      int var3;
      int var4;
      int var5;
      byte var6;
      if(this.aByteArray9859 == null) {
         for(var2 = (this.anInt9852 >> 1) - 1; var2 >= 0; --var2) {
            var3 = var2 * this.anInt9851;
            var4 = (this.anInt9852 - var2 - 1) * this.anInt9851;

            for(var5 = -this.anInt9851; var5 < 0; ++var5) {
               var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var8 = this.aByteArray9859;

         for(var3 = (this.anInt9852 >> 1) - 1; var3 >= 0; --var3) {
            var4 = var3 * this.anInt9851;
            var5 = (this.anInt9852 - var3 - 1) * this.anInt9851;

            for(int var7 = -this.anInt9851; var7 < 0; ++var7) {
               var6 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5] = var6;
               var6 = var8[var4];
               var8[var4] = var8[var5];
               var8[var5] = var6;
               ++var4;
               ++var5;
            }
         }
      }

      var2 = this.anInt9855;
      this.anInt9855 = this.anInt9856;
      this.anInt9856 = var2;
   }

   public void method2219(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9857.length; ++var4) {
         if(this.anIntArray9857[var4] != 1 && this.anIntArray9857[var4] != 16711935) {
            int var5 = this.anIntArray9857[var4] >> 16 & 255;
            var5 += var1;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > 255) {
               var5 = 255;
            }

            int var6 = this.anIntArray9857[var4] >> 8 & 255;
            var6 += var2;
            if(var6 < 0) {
               var6 = 0;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var7 = this.anIntArray9857[var4] >> 0 & 255;
            var7 += var3;
            if(var7 < 0) {
               var7 = 0;
            } else if(var7 > 255) {
               var7 = 255;
            }

            this.anIntArray9857[var4] = var5 << 16 | var6 << 8 | var7;
         }
      }

   }

   public void method2212() {
      byte[] var1 = new byte[this.anInt9851 * this.anInt9852];
      int var2 = 0;
      int var3;
      int var4;
      if(this.aByteArray9859 == null) {
         for(var3 = 0; var3 < this.anInt9851; ++var3) {
            for(var4 = this.anInt9852 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.aByteArray9858[var3 + var4 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
      } else {
         byte[] var6 = new byte[this.anInt9851 * this.anInt9852];

         for(var4 = 0; var4 < this.anInt9851; ++var4) {
            for(int var5 = this.anInt9852 - 1; var5 >= 0; --var5) {
               var1[var2] = this.aByteArray9858[var4 + var5 * this.anInt9851];
               var6[var2++] = this.aByteArray9859[var4 + var5 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
         this.aByteArray9859 = var6;
      }

      var3 = this.anInt9855;
      this.anInt9855 = this.anInt9853;
      this.anInt9853 = this.anInt9856;
      this.anInt9856 = this.anInt9854;
      this.anInt9854 = var3;
      var3 = this.anInt9852;
      this.anInt9852 = this.anInt9851;
      this.anInt9851 = var3;
   }

   public void method2211() {
      byte[] var1 = this.aByteArray9858;
      int var2;
      int var3;
      int var4;
      int var5;
      byte var6;
      if(this.aByteArray9859 == null) {
         for(var2 = (this.anInt9852 >> 1) - 1; var2 >= 0; --var2) {
            var3 = var2 * this.anInt9851;
            var4 = (this.anInt9852 - var2 - 1) * this.anInt9851;

            for(var5 = -this.anInt9851; var5 < 0; ++var5) {
               var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var8 = this.aByteArray9859;

         for(var3 = (this.anInt9852 >> 1) - 1; var3 >= 0; --var3) {
            var4 = var3 * this.anInt9851;
            var5 = (this.anInt9852 - var3 - 1) * this.anInt9851;

            for(int var7 = -this.anInt9851; var7 < 0; ++var7) {
               var6 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5] = var6;
               var6 = var8[var4];
               var8[var4] = var8[var5];
               var8[var5] = var6;
               ++var4;
               ++var5;
            }
         }
      }

      var2 = this.anInt9855;
      this.anInt9855 = this.anInt9856;
      this.anInt9856 = var2;
   }

   public int method2222() {
      return this.anInt9852;
   }

   public void method2183() {
      byte[] var1 = this.aByteArray9858;
      int var2;
      int var3;
      int var4;
      byte var5;
      if(this.aByteArray9859 == null) {
         for(var2 = this.anInt9852 - 1; var2 >= 0; --var2) {
            var3 = var2 * this.anInt9851;

            for(var4 = (var2 + 1) * this.anInt9851; var3 < var4; ++var3) {
               --var4;
               var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
            }
         }
      } else {
         byte[] var7 = this.aByteArray9859;

         for(var3 = this.anInt9852 - 1; var3 >= 0; --var3) {
            var4 = var3 * this.anInt9851;

            for(int var6 = (var3 + 1) * this.anInt9851; var4 < var6; ++var4) {
               --var6;
               var5 = var1[var4];
               var1[var4] = var1[var6];
               var1[var6] = var5;
               var5 = var7[var4];
               var7[var4] = var7[var6];
               var7[var6] = var5;
            }
         }
      }

      var2 = this.anInt9853;
      this.anInt9853 = this.anInt9854;
      this.anInt9854 = var2;
   }

   public boolean method2217() {
      return this.aByteArray9859 != null;
   }

   public void method2215() {
      byte[] var1 = new byte[this.anInt9851 * this.anInt9852];
      int var2 = 0;
      int var3;
      int var4;
      if(this.aByteArray9859 == null) {
         for(var3 = 0; var3 < this.anInt9851; ++var3) {
            for(var4 = this.anInt9852 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.aByteArray9858[var3 + var4 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
      } else {
         byte[] var6 = new byte[this.anInt9851 * this.anInt9852];

         for(var4 = 0; var4 < this.anInt9851; ++var4) {
            for(int var5 = this.anInt9852 - 1; var5 >= 0; --var5) {
               var1[var2] = this.aByteArray9858[var4 + var5 * this.anInt9851];
               var6[var2++] = this.aByteArray9859[var4 + var5 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
         this.aByteArray9859 = var6;
      }

      var3 = this.anInt9855;
      this.anInt9855 = this.anInt9853;
      this.anInt9853 = this.anInt9856;
      this.anInt9856 = this.anInt9854;
      this.anInt9854 = var3;
      var3 = this.anInt9852;
      this.anInt9852 = this.anInt9851;
      this.anInt9851 = var3;
   }

   public void method2216(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9857.length; ++var4) {
         if(this.anIntArray9857[var4] != 1 && this.anIntArray9857[var4] != 16711935) {
            int var5 = this.anIntArray9857[var4] >> 16 & 255;
            var5 += var1;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > 255) {
               var5 = 255;
            }

            int var6 = this.anIntArray9857[var4] >> 8 & 255;
            var6 += var2;
            if(var6 < 0) {
               var6 = 0;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var7 = this.anIntArray9857[var4] >> 0 & 255;
            var7 += var3;
            if(var7 < 0) {
               var7 = 0;
            } else if(var7 > 255) {
               var7 = 255;
            }

            this.anIntArray9857[var4] = var5 << 16 | var6 << 8 | var7;
         }
      }

   }

   public void method2181(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9857.length; ++var4) {
         if(this.anIntArray9857[var4] != 1 && this.anIntArray9857[var4] != 16711935) {
            int var5 = this.anIntArray9857[var4] >> 16 & 255;
            var5 += var1;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > 255) {
               var5 = 255;
            }

            int var6 = this.anIntArray9857[var4] >> 8 & 255;
            var6 += var2;
            if(var6 < 0) {
               var6 = 0;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var7 = this.anIntArray9857[var4] >> 0 & 255;
            var7 += var3;
            if(var7 < 0) {
               var7 = 0;
            } else if(var7 > 255) {
               var7 = 255;
            }

            this.anIntArray9857[var4] = var5 << 16 | var6 << 8 | var7;
         }
      }

   }

   public void method2201() {
      byte[] var1 = new byte[this.anInt9851 * this.anInt9852];
      int var2 = 0;
      int var3;
      int var4;
      if(this.aByteArray9859 == null) {
         for(var3 = 0; var3 < this.anInt9851; ++var3) {
            for(var4 = this.anInt9852 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.aByteArray9858[var3 + var4 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
      } else {
         byte[] var6 = new byte[this.anInt9851 * this.anInt9852];

         for(var4 = 0; var4 < this.anInt9851; ++var4) {
            for(int var5 = this.anInt9852 - 1; var5 >= 0; --var5) {
               var1[var2] = this.aByteArray9858[var4 + var5 * this.anInt9851];
               var6[var2++] = this.aByteArray9859[var4 + var5 * this.anInt9851];
            }
         }

         this.aByteArray9858 = var1;
         this.aByteArray9859 = var6;
      }

      var3 = this.anInt9855;
      this.anInt9855 = this.anInt9853;
      this.anInt9853 = this.anInt9856;
      this.anInt9856 = this.anInt9854;
      this.anInt9854 = var3;
      var3 = this.anInt9852;
      this.anInt9852 = this.anInt9851;
      this.anInt9851 = var3;
   }

   public int method2220(int var1, int var2) {
      return this.anIntArray9857[this.aByteArray9858[var1 + var2 * this.anInt9851] & 255];
   }

   public void method2165() {
      byte[] var1 = this.aByteArray9858;
      int var2;
      int var3;
      int var4;
      int var5;
      byte var6;
      if(this.aByteArray9859 == null) {
         for(var2 = (this.anInt9852 >> 1) - 1; var2 >= 0; --var2) {
            var3 = var2 * this.anInt9851;
            var4 = (this.anInt9852 - var2 - 1) * this.anInt9851;

            for(var5 = -this.anInt9851; var5 < 0; ++var5) {
               var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var8 = this.aByteArray9859;

         for(var3 = (this.anInt9852 >> 1) - 1; var3 >= 0; --var3) {
            var4 = var3 * this.anInt9851;
            var5 = (this.anInt9852 - var3 - 1) * this.anInt9851;

            for(int var7 = -this.anInt9851; var7 < 0; ++var7) {
               var6 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5] = var6;
               var6 = var8[var4];
               var8[var4] = var8[var5];
               var8[var5] = var6;
               ++var4;
               ++var5;
            }
         }
      }

      var2 = this.anInt9855;
      this.anInt9855 = this.anInt9856;
      this.anInt9856 = var2;
   }

   public int method2172() {
      return this.anInt9855;
   }

   public void method2209() {
      byte[] var1 = this.aByteArray9858;
      int var2;
      int var3;
      int var4;
      int var5;
      byte var6;
      if(this.aByteArray9859 == null) {
         for(var2 = (this.anInt9852 >> 1) - 1; var2 >= 0; --var2) {
            var3 = var2 * this.anInt9851;
            var4 = (this.anInt9852 - var2 - 1) * this.anInt9851;

            for(var5 = -this.anInt9851; var5 < 0; ++var5) {
               var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var8 = this.aByteArray9859;

         for(var3 = (this.anInt9852 >> 1) - 1; var3 >= 0; --var3) {
            var4 = var3 * this.anInt9851;
            var5 = (this.anInt9852 - var3 - 1) * this.anInt9851;

            for(int var7 = -this.anInt9851; var7 < 0; ++var7) {
               var6 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5] = var6;
               var6 = var8[var4];
               var8[var4] = var8[var5];
               var8[var5] = var6;
               ++var4;
               ++var5;
            }
         }
      }

      var2 = this.anInt9855;
      this.anInt9855 = this.anInt9856;
      this.anInt9856 = var2;
   }

   public int[] method2185(boolean var1) {
      int var2;
      int[] var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if(var1) {
         var2 = this.method2214();
         var3 = new int[var2 * this.method2176()];
         if(this.aByteArray9859 != null) {
            for(var4 = 0; var4 < this.anInt9852; ++var4) {
               var5 = var4 * this.anInt9851;
               var6 = this.anInt9853 + (var4 + this.anInt9855) * var2;

               for(var7 = 0; var7 < this.anInt9851; ++var7) {
                  var3[var6++] = this.aByteArray9859[var5] << 24 | this.anIntArray9857[this.aByteArray9858[var5] & 255];
                  ++var5;
               }
            }
         } else {
            for(var4 = 0; var4 < this.anInt9852; ++var4) {
               var5 = var4 * this.anInt9851;
               var6 = this.anInt9853 + (var4 + this.anInt9855) * var2;

               for(var7 = 0; var7 < this.anInt9851; ++var7) {
                  int var8 = this.anIntArray9857[this.aByteArray9858[var5++] & 255];
                  if(var8 != 0) {
                     var3[var6++] = -16777216 | var8;
                  } else {
                     var3[var6++] = 0;
                  }
               }
            }
         }
      } else {
         var3 = new int[this.anInt9851 * this.anInt9852];
         var2 = 0;
         var4 = 0;
         if(this.aByteArray9859 != null) {
            for(var5 = 0; var5 < this.anInt9852; ++var5) {
               for(var6 = 0; var6 < this.anInt9851; ++var6) {
                  var3[var4++] = this.aByteArray9859[var2] << 24 | this.anIntArray9857[this.aByteArray9858[var2] & 255];
                  ++var2;
               }
            }
         } else {
            for(var5 = 0; var5 < this.anInt9852; ++var5) {
               for(var6 = 0; var6 < this.anInt9851; ++var6) {
                  var7 = this.anIntArray9857[this.aByteArray9858[var2++] & 255];
                  var3[var4++] = var7 != 0?-16777216 | var7:0;
               }
            }
         }
      }

      return var3;
   }

   public int[] method2225(boolean var1) {
      int var2;
      int[] var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if(var1) {
         var2 = this.method2214();
         var3 = new int[var2 * this.method2176()];
         if(this.aByteArray9859 != null) {
            for(var4 = 0; var4 < this.anInt9852; ++var4) {
               var5 = var4 * this.anInt9851;
               var6 = this.anInt9853 + (var4 + this.anInt9855) * var2;

               for(var7 = 0; var7 < this.anInt9851; ++var7) {
                  var3[var6++] = this.aByteArray9859[var5] << 24 | this.anIntArray9857[this.aByteArray9858[var5] & 255];
                  ++var5;
               }
            }
         } else {
            for(var4 = 0; var4 < this.anInt9852; ++var4) {
               var5 = var4 * this.anInt9851;
               var6 = this.anInt9853 + (var4 + this.anInt9855) * var2;

               for(var7 = 0; var7 < this.anInt9851; ++var7) {
                  int var8 = this.anIntArray9857[this.aByteArray9858[var5++] & 255];
                  if(var8 != 0) {
                     var3[var6++] = -16777216 | var8;
                  } else {
                     var3[var6++] = 0;
                  }
               }
            }
         }
      } else {
         var3 = new int[this.anInt9851 * this.anInt9852];
         var2 = 0;
         var4 = 0;
         if(this.aByteArray9859 != null) {
            for(var5 = 0; var5 < this.anInt9852; ++var5) {
               for(var6 = 0; var6 < this.anInt9851; ++var6) {
                  var3[var4++] = this.aByteArray9859[var2] << 24 | this.anIntArray9857[this.aByteArray9858[var2] & 255];
                  ++var2;
               }
            }
         } else {
            for(var5 = 0; var5 < this.anInt9852; ++var5) {
               for(var6 = 0; var6 < this.anInt9851; ++var6) {
                  var7 = this.anIntArray9857[this.aByteArray9858[var2++] & 255];
                  var3[var4++] = var7 != 0?-16777216 | var7:0;
               }
            }
         }
      }

      return var3;
   }
}
