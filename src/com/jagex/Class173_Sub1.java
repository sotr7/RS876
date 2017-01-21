package com.jagex;

import com.jagex.Class173;

public class Class173_Sub1 extends Class173 {
   boolean aBool9205 = false;
   int[] anIntArray9206;
   int anInt9207;
   int anInt9208;
   int anInt9202;
   int anInt9204;
   int anInt9203;
   int anInt9209;

   public void method2180(int var1) {
      for(int var2 = this.anInt9203 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.anInt9209;

         for(int var4 = this.anInt9209 - 1; var4 > 0; --var4) {
            if((this.anIntArray9206[var4 + var3] & -16777216) == 0 && (this.anIntArray9206[var4 + var3 - 1 - this.anInt9209] & -16777216) != 0) {
               this.anIntArray9206[var4 + var3] = var1;
            }
         }
      }

   }

   public int[] method2204(boolean var1) {
      if(!var1 || this.method2214() == this.anInt9209 && this.method2176() == this.anInt9203) {
         return this.anIntArray9206;
      } else {
         int var2 = this.method2214();
         int[] var3 = new int[var2 * this.method2176()];

         for(int var4 = 0; var4 < this.anInt9203; ++var4) {
            int var5 = var4 * this.anInt9209;
            int var6 = this.anInt9204 + (var4 + this.anInt9208) * var2;

            for(int var7 = 0; var7 < this.anInt9209; ++var7) {
               var3[var6++] = this.anIntArray9206[var5];
               ++var5;
            }
         }

         return var3;
      }
   }

   public boolean method2224() {
      return this.aBool9205;
   }

   public void method2218(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9206.length; ++var4) {
         int var5 = this.anIntArray9206[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.anIntArray9206[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.anIntArray9206[var4] >> 0 & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.anIntArray9206[var4] = this.anIntArray9206[var4] & -16777216 | var5 << 16 | var6 << 8 | var7;
      }

   }

   public void method2184(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9206.length; ++var4) {
         int var5 = this.anIntArray9206[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.anIntArray9206[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.anIntArray9206[var4] >> 0 & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.anIntArray9206[var4] = this.anIntArray9206[var4] & -16777216 | var5 << 16 | var6 << 8 | var7;
      }

   }

   public int method2214() {
      return this.anInt9209 + this.anInt9204 + this.anInt9202;
   }

   public int method2176() {
      return this.anInt9203 + this.anInt9208 + this.anInt9207;
   }

   public int method2170() {
      return this.anInt9204;
   }

   public int method2171() {
      return this.anInt9202;
   }

   public int method2172() {
      return this.anInt9208;
   }

   public void method2223(int var1) {
      int var2 = 0;
      this.aBool9205 = false;
      int[] var3 = new int[this.anInt9209 * this.anInt9203];

      for(int var4 = 0; var4 < this.anInt9203; ++var4) {
         for(int var5 = 0; var5 < this.anInt9209; ++var5) {
            int var6 = this.anIntArray9206[var2];
            if((var6 & -16777216) == 0) {
               if(var5 > 0 && (this.anIntArray9206[var2 - 1] & -16777216) != 0) {
                  var6 = var1;
               } else if(var4 > 0 && (this.anIntArray9206[var2 - this.anInt9209] & -16777216) != 0) {
                  var6 = var1;
               } else if(var5 < this.anInt9209 - 1 && (this.anIntArray9206[var2 + 1] & -16777216) != 0) {
                  var6 = var1;
               } else if(var4 < this.anInt9203 - 1 && (this.anIntArray9206[var2 + this.anInt9209] & -16777216) != 0) {
                  var6 = var1;
               }
            }

            if((var6 & -16777216) != -16777216) {
               this.aBool9205 = true;
            }

            var3[var2++] = var6;
         }
      }

      this.anIntArray9206 = var3;
   }

   public void method2174() {
      this.anInt9207 = 0;
      this.anInt9208 = 0;
      this.anInt9202 = 0;
      this.anInt9204 = 0;
   }

   public void method2167() {
      int[] var1 = this.anIntArray9206;

      int var2;
      for(var2 = this.anInt9203 - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.anInt9209;

         for(int var4 = (var2 + 1) * this.anInt9209; var3 < var4; ++var3) {
            --var4;
            int var5 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var5;
         }
      }

      var2 = this.anInt9204;
      this.anInt9204 = this.anInt9202;
      this.anInt9202 = var2;
   }

   public void method2179(int var1) {
      int var2 = 0;
      this.aBool9205 = false;
      int[] var3 = new int[this.anInt9209 * this.anInt9203];

      for(int var4 = 0; var4 < this.anInt9203; ++var4) {
         for(int var5 = 0; var5 < this.anInt9209; ++var5) {
            int var6 = this.anIntArray9206[var2];
            if((var6 & -16777216) == 0) {
               if(var5 > 0 && (this.anIntArray9206[var2 - 1] & -16777216) != 0) {
                  var6 = var1;
               } else if(var4 > 0 && (this.anIntArray9206[var2 - this.anInt9209] & -16777216) != 0) {
                  var6 = var1;
               } else if(var5 < this.anInt9209 - 1 && (this.anIntArray9206[var2 + 1] & -16777216) != 0) {
                  var6 = var1;
               } else if(var4 < this.anInt9203 - 1 && (this.anIntArray9206[var2 + this.anInt9209] & -16777216) != 0) {
                  var6 = var1;
               }
            }

            if((var6 & -16777216) != -16777216) {
               this.aBool9205 = true;
            }

            var3[var2++] = var6;
         }
      }

      this.anIntArray9206 = var3;
   }

   public int method2198() {
      return this.anInt9207;
   }

   public void method2183() {
      int[] var1 = this.anIntArray9206;

      int var2;
      for(var2 = this.anInt9203 - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.anInt9209;

         for(int var4 = (var2 + 1) * this.anInt9209; var3 < var4; ++var3) {
            --var4;
            int var5 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var5;
         }
      }

      var2 = this.anInt9204;
      this.anInt9204 = this.anInt9202;
      this.anInt9202 = var2;
   }

   public void method2207() {
      int[] var1 = this.anIntArray9206;

      int var2;
      for(var2 = (this.anInt9203 >> 1) - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.anInt9209;
         int var4 = (this.anInt9203 - var2 - 1) * this.anInt9209;

         for(int var5 = -this.anInt9209; var5 < 0; ++var5) {
            int var6 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var6;
            ++var3;
            ++var4;
         }
      }

      var2 = this.anInt9208;
      this.anInt9208 = this.anInt9207;
      this.anInt9207 = var2;
   }

   public void method2208() {
      int[] var1 = new int[this.anInt9209 * this.anInt9203];
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.anInt9209; ++var3) {
         for(int var4 = this.anInt9203 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.anIntArray9206[var3 + var4 * this.anInt9209];
         }
      }

      this.anIntArray9206 = var1;
      var3 = this.anInt9208;
      this.anInt9208 = this.anInt9204;
      this.anInt9204 = this.anInt9207;
      this.anInt9207 = this.anInt9202;
      this.anInt9202 = var3;
      var3 = this.anInt9203;
      this.anInt9203 = this.anInt9209;
      this.anInt9209 = var3;
   }

   public void method2209() {
      int[] var1 = this.anIntArray9206;

      int var2;
      for(var2 = (this.anInt9203 >> 1) - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.anInt9209;
         int var4 = (this.anInt9203 - var2 - 1) * this.anInt9209;

         for(int var5 = -this.anInt9209; var5 < 0; ++var5) {
            int var6 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var6;
            ++var3;
            ++var4;
         }
      }

      var2 = this.anInt9208;
      this.anInt9208 = this.anInt9207;
      this.anInt9207 = var2;
   }

   public void method2211() {
      int[] var1 = this.anIntArray9206;

      int var2;
      for(var2 = (this.anInt9203 >> 1) - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.anInt9209;
         int var4 = (this.anInt9203 - var2 - 1) * this.anInt9209;

         for(int var5 = -this.anInt9209; var5 < 0; ++var5) {
            int var6 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var6;
            ++var3;
            ++var4;
         }
      }

      var2 = this.anInt9208;
      this.anInt9208 = this.anInt9207;
      this.anInt9207 = var2;
   }

   public int method2199(int var1, int var2) {
      return this.anIntArray9206[var1 + var2 * this.anInt9209];
   }

   public void method2212() {
      int[] var1 = new int[this.anInt9209 * this.anInt9203];
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.anInt9209; ++var3) {
         for(int var4 = this.anInt9203 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.anIntArray9206[var3 + var4 * this.anInt9209];
         }
      }

      this.anIntArray9206 = var1;
      var3 = this.anInt9208;
      this.anInt9208 = this.anInt9204;
      this.anInt9204 = this.anInt9207;
      this.anInt9207 = this.anInt9202;
      this.anInt9202 = var3;
      var3 = this.anInt9203;
      this.anInt9203 = this.anInt9209;
      this.anInt9209 = var3;
   }

   public void method2200() {
      this.anInt9207 = 0;
      this.anInt9208 = 0;
      this.anInt9202 = 0;
      this.anInt9204 = 0;
   }

   public boolean method2188() {
      return this.aBool9205;
   }

   public int method2189() {
      return this.anInt9209;
   }

   public int method2190() {
      return this.anInt9209 + this.anInt9204 + this.anInt9202;
   }

   public void method2205(int var1) {
      int var2 = 0;
      this.aBool9205 = false;
      int[] var3 = new int[this.anInt9209 * this.anInt9203];

      for(int var4 = 0; var4 < this.anInt9203; ++var4) {
         for(int var5 = 0; var5 < this.anInt9209; ++var5) {
            int var6 = this.anIntArray9206[var2];
            if((var6 & -16777216) == 0) {
               if(var5 > 0 && (this.anIntArray9206[var2 - 1] & -16777216) != 0) {
                  var6 = var1;
               } else if(var4 > 0 && (this.anIntArray9206[var2 - this.anInt9209] & -16777216) != 0) {
                  var6 = var1;
               } else if(var5 < this.anInt9209 - 1 && (this.anIntArray9206[var2 + 1] & -16777216) != 0) {
                  var6 = var1;
               } else if(var4 < this.anInt9203 - 1 && (this.anIntArray9206[var2 + this.anInt9209] & -16777216) != 0) {
                  var6 = var1;
               }
            }

            if((var6 & -16777216) != -16777216) {
               this.aBool9205 = true;
            }

            var3[var2++] = var6;
         }
      }

      this.anIntArray9206 = var3;
   }

   public int method2192() {
      return this.anInt9203 + this.anInt9208 + this.anInt9207;
   }

   public int method2193() {
      return this.anInt9204;
   }

   public int method2187() {
      return this.anInt9204;
   }

   public int method2178() {
      return this.anInt9202;
   }

   public boolean method2186() {
      return false;
   }

   public int method2196() {
      return this.anInt9202;
   }

   public int method2197() {
      return this.anInt9202;
   }

   public int method2221() {
      return this.anInt9203;
   }

   public int method2182() {
      return this.anInt9207;
   }

   public boolean method2166() {
      return false;
   }

   public void method2194(int var1) {
      int var2 = this.method2214();
      int var3 = this.method2176();
      if(this.anInt9209 != var2 || this.anInt9203 != var3) {
         int var4 = var1;
         if(var1 > this.anInt9204) {
            var4 = this.anInt9204;
         }

         int var5 = var1;
         if(var1 + this.anInt9204 + this.anInt9209 > var2) {
            var5 = var2 - this.anInt9204 - this.anInt9209;
         }

         int var6 = var1;
         if(var1 > this.anInt9208) {
            var6 = this.anInt9208;
         }

         int var7 = var1;
         if(var1 + this.anInt9208 + this.anInt9203 > var3) {
            var7 = var3 - this.anInt9208 - this.anInt9203;
         }

         int var8 = this.anInt9209 + var4 + var5;
         int var9 = this.anInt9203 + var6 + var7;
         int[] var10 = new int[var8 * var9];
         this.aBool9205 = false;

         for(int var11 = 0; var11 < this.anInt9203; ++var11) {
            int var12 = var11 * this.anInt9209;
            int var13 = (var11 + var6) * var8 + var4;

            for(int var14 = 0; var14 < this.anInt9209; ++var14) {
               if((this.anIntArray9206[var12] & -16777216) != -16777216) {
                  this.aBool9205 = true;
               }

               var10[var13++] = this.anIntArray9206[var12++];
            }
         }

         this.anInt9204 -= var4;
         this.anInt9208 -= var6;
         this.anInt9202 -= var5;
         this.anInt9207 -= var7;
         this.anInt9209 = var8;
         this.anInt9203 = var9;
         this.anIntArray9206 = var10;
      }
   }

   public void method2202(int var1) {
      int var2 = this.method2214();
      int var3 = this.method2176();
      if(this.anInt9209 != var2 || this.anInt9203 != var3) {
         int var4 = var1;
         if(var1 > this.anInt9204) {
            var4 = this.anInt9204;
         }

         int var5 = var1;
         if(var1 + this.anInt9204 + this.anInt9209 > var2) {
            var5 = var2 - this.anInt9204 - this.anInt9209;
         }

         int var6 = var1;
         if(var1 > this.anInt9208) {
            var6 = this.anInt9208;
         }

         int var7 = var1;
         if(var1 + this.anInt9208 + this.anInt9203 > var3) {
            var7 = var3 - this.anInt9208 - this.anInt9203;
         }

         int var8 = this.anInt9209 + var4 + var5;
         int var9 = this.anInt9203 + var6 + var7;
         int[] var10 = new int[var8 * var9];
         this.aBool9205 = false;

         for(int var11 = 0; var11 < this.anInt9203; ++var11) {
            int var12 = var11 * this.anInt9209;
            int var13 = (var11 + var6) * var8 + var4;

            for(int var14 = 0; var14 < this.anInt9209; ++var14) {
               if((this.anIntArray9206[var12] & -16777216) != -16777216) {
                  this.aBool9205 = true;
               }

               var10[var13++] = this.anIntArray9206[var12++];
            }
         }

         this.anInt9204 -= var4;
         this.anInt9208 -= var6;
         this.anInt9202 -= var5;
         this.anInt9207 -= var7;
         this.anInt9209 = var8;
         this.anInt9203 = var9;
         this.anIntArray9206 = var10;
      }
   }

   public void method2203(int var1) {
      int var2 = this.method2214();
      int var3 = this.method2176();
      if(this.anInt9209 != var2 || this.anInt9203 != var3) {
         int var4 = var1;
         if(var1 > this.anInt9204) {
            var4 = this.anInt9204;
         }

         int var5 = var1;
         if(var1 + this.anInt9204 + this.anInt9209 > var2) {
            var5 = var2 - this.anInt9204 - this.anInt9209;
         }

         int var6 = var1;
         if(var1 > this.anInt9208) {
            var6 = this.anInt9208;
         }

         int var7 = var1;
         if(var1 + this.anInt9208 + this.anInt9203 > var3) {
            var7 = var3 - this.anInt9208 - this.anInt9203;
         }

         int var8 = this.anInt9209 + var4 + var5;
         int var9 = this.anInt9203 + var6 + var7;
         int[] var10 = new int[var8 * var9];
         this.aBool9205 = false;

         for(int var11 = 0; var11 < this.anInt9203; ++var11) {
            int var12 = var11 * this.anInt9209;
            int var13 = (var11 + var6) * var8 + var4;

            for(int var14 = 0; var14 < this.anInt9209; ++var14) {
               if((this.anIntArray9206[var12] & -16777216) != -16777216) {
                  this.aBool9205 = true;
               }

               var10[var13++] = this.anIntArray9206[var12++];
            }
         }

         this.anInt9204 -= var4;
         this.anInt9208 -= var6;
         this.anInt9202 -= var5;
         this.anInt9207 -= var7;
         this.anInt9209 = var8;
         this.anInt9203 = var9;
         this.anIntArray9206 = var10;
      }
   }

   Class173_Sub1(int var1, int var2, int[] var3) {
      this.anInt9209 = var1;
      this.anInt9203 = var2;
      this.anIntArray9206 = var3;

      for(int var4 = 0; var4 < this.anIntArray9206.length; ++var4) {
         if((this.anIntArray9206[var4] & -16777216) != -16777216) {
            this.aBool9205 = true;
            break;
         }
      }

   }

   public int[] method2225(boolean var1) {
      if(!var1 || this.method2214() == this.anInt9209 && this.method2176() == this.anInt9203) {
         return this.anIntArray9206;
      } else {
         int var2 = this.method2214();
         int[] var3 = new int[var2 * this.method2176()];

         for(int var4 = 0; var4 < this.anInt9203; ++var4) {
            int var5 = var4 * this.anInt9209;
            int var6 = this.anInt9204 + (var4 + this.anInt9208) * var2;

            for(int var7 = 0; var7 < this.anInt9209; ++var7) {
               var3[var6++] = this.anIntArray9206[var5];
               ++var5;
            }
         }

         return var3;
      }
   }

   public void method2206(int var1) {
      for(int var2 = this.anInt9203 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.anInt9209;

         for(int var4 = this.anInt9209 - 1; var4 > 0; --var4) {
            if((this.anIntArray9206[var4 + var3] & -16777216) == 0 && (this.anIntArray9206[var4 + var3 - 1 - this.anInt9209] & -16777216) != 0) {
               this.anIntArray9206[var4 + var3] = var1;
            }
         }
      }

   }

   public int method2173() {
      return this.anInt9207;
   }

   public void method2169() {
      int[] var1 = this.anIntArray9206;

      int var2;
      for(var2 = (this.anInt9203 >> 1) - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.anInt9209;
         int var4 = (this.anInt9203 - var2 - 1) * this.anInt9209;

         for(int var5 = -this.anInt9209; var5 < 0; ++var5) {
            int var6 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var6;
            ++var3;
            ++var4;
         }
      }

      var2 = this.anInt9208;
      this.anInt9208 = this.anInt9207;
      this.anInt9207 = var2;
   }

   public int method2175() {
      return this.anInt9203;
   }

   public int method2191() {
      return this.anInt9209 + this.anInt9204 + this.anInt9202;
   }

   public int method2210() {
      return this.anInt9202;
   }

   public int method2195() {
      return this.anInt9208;
   }

   public void method2213() {
      int[] var1 = new int[this.anInt9209 * this.anInt9203];
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.anInt9209; ++var3) {
         for(int var4 = this.anInt9203 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.anIntArray9206[var3 + var4 * this.anInt9209];
         }
      }

      this.anIntArray9206 = var1;
      var3 = this.anInt9208;
      this.anInt9208 = this.anInt9204;
      this.anInt9204 = this.anInt9207;
      this.anInt9207 = this.anInt9202;
      this.anInt9202 = var3;
      var3 = this.anInt9203;
      this.anInt9203 = this.anInt9209;
      this.anInt9209 = var3;
   }

   public void method2201() {
      int[] var1 = new int[this.anInt9209 * this.anInt9203];
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.anInt9209; ++var3) {
         for(int var4 = this.anInt9203 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.anIntArray9206[var3 + var4 * this.anInt9209];
         }
      }

      this.anIntArray9206 = var1;
      var3 = this.anInt9208;
      this.anInt9208 = this.anInt9204;
      this.anInt9204 = this.anInt9207;
      this.anInt9207 = this.anInt9202;
      this.anInt9202 = var3;
      var3 = this.anInt9203;
      this.anInt9203 = this.anInt9209;
      this.anInt9209 = var3;
   }

   public void method2215() {
      int[] var1 = new int[this.anInt9209 * this.anInt9203];
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.anInt9209; ++var3) {
         for(int var4 = this.anInt9203 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.anIntArray9206[var3 + var4 * this.anInt9209];
         }
      }

      this.anIntArray9206 = var1;
      var3 = this.anInt9208;
      this.anInt9208 = this.anInt9204;
      this.anInt9204 = this.anInt9207;
      this.anInt9207 = this.anInt9202;
      this.anInt9202 = var3;
      var3 = this.anInt9203;
      this.anInt9203 = this.anInt9209;
      this.anInt9209 = var3;
   }

   public void method2216(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9206.length; ++var4) {
         int var5 = this.anIntArray9206[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.anIntArray9206[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.anIntArray9206[var4] >> 0 & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.anIntArray9206[var4] = this.anIntArray9206[var4] & -16777216 | var5 << 16 | var6 << 8 | var7;
      }

   }

   public void method2181(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9206.length; ++var4) {
         int var5 = this.anIntArray9206[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.anIntArray9206[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.anIntArray9206[var4] >> 0 & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.anIntArray9206[var4] = this.anIntArray9206[var4] & -16777216 | var5 << 16 | var6 << 8 | var7;
      }

   }

   public int method2168() {
      return this.anInt9209;
   }

   public void method2219(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray9206.length; ++var4) {
         int var5 = this.anIntArray9206[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.anIntArray9206[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.anIntArray9206[var4] >> 0 & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.anIntArray9206[var4] = this.anIntArray9206[var4] & -16777216 | var5 << 16 | var6 << 8 | var7;
      }

   }

   public int method2220(int var1, int var2) {
      return this.anIntArray9206[var1 + var2 * this.anInt9209];
   }

   public void method2165() {
      int[] var1 = this.anIntArray9206;

      int var2;
      for(var2 = (this.anInt9203 >> 1) - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.anInt9209;
         int var4 = (this.anInt9203 - var2 - 1) * this.anInt9209;

         for(int var5 = -this.anInt9209; var5 < 0; ++var5) {
            int var6 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var6;
            ++var3;
            ++var4;
         }
      }

      var2 = this.anInt9208;
      this.anInt9208 = this.anInt9207;
      this.anInt9207 = var2;
   }

   public int method2222() {
      return this.anInt9203;
   }

   public void method2177(int var1) {
      int var2 = this.method2214();
      int var3 = this.method2176();
      if(this.anInt9209 != var2 || this.anInt9203 != var3) {
         int var4 = var1;
         if(var1 > this.anInt9204) {
            var4 = this.anInt9204;
         }

         int var5 = var1;
         if(var1 + this.anInt9204 + this.anInt9209 > var2) {
            var5 = var2 - this.anInt9204 - this.anInt9209;
         }

         int var6 = var1;
         if(var1 > this.anInt9208) {
            var6 = this.anInt9208;
         }

         int var7 = var1;
         if(var1 + this.anInt9208 + this.anInt9203 > var3) {
            var7 = var3 - this.anInt9208 - this.anInt9203;
         }

         int var8 = this.anInt9209 + var4 + var5;
         int var9 = this.anInt9203 + var6 + var7;
         int[] var10 = new int[var8 * var9];
         this.aBool9205 = false;

         for(int var11 = 0; var11 < this.anInt9203; ++var11) {
            int var12 = var11 * this.anInt9209;
            int var13 = (var11 + var6) * var8 + var4;

            for(int var14 = 0; var14 < this.anInt9209; ++var14) {
               if((this.anIntArray9206[var12] & -16777216) != -16777216) {
                  this.aBool9205 = true;
               }

               var10[var13++] = this.anIntArray9206[var12++];
            }
         }

         this.anInt9204 -= var4;
         this.anInt9208 -= var6;
         this.anInt9202 -= var5;
         this.anInt9207 -= var7;
         this.anInt9209 = var8;
         this.anInt9203 = var9;
         this.anIntArray9206 = var10;
      }
   }

   public int[] method2185(boolean var1) {
      if(!var1 || this.method2214() == this.anInt9209 && this.method2176() == this.anInt9203) {
         return this.anIntArray9206;
      } else {
         int var2 = this.method2214();
         int[] var3 = new int[var2 * this.method2176()];

         for(int var4 = 0; var4 < this.anInt9203; ++var4) {
            int var5 = var4 * this.anInt9209;
            int var6 = this.anInt9204 + (var4 + this.anInt9208) * var2;

            for(int var7 = 0; var7 < this.anInt9209; ++var7) {
               var3[var6++] = this.anIntArray9206[var5];
               ++var5;
            }
         }

         return var3;
      }
   }

   public boolean method2217() {
      return this.aBool9205;
   }
}
