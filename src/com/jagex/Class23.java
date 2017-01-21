package com.jagex;

import com.jagex.Class21;
import com.jagex.Class242;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class285;
import com.jagex.Class407;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class681;
import com.jagex.Class76;
import java.io.EOFException;
import java.io.IOException;

public class Class23 {
   static final int anInt226 = 200000000;
   int anInt225;
   long aLong221;
   long aLong224 = 387777009426614609L;
   long aLong229;
   long aLong228;
   int anInt222 = 0;
   long aLong231 = -1921748088601202931L;
   long aLong230;
   Class21 aClass21_227;
   byte[] aByteArray223;
   byte[] aByteArray232;

   void method677() throws IOException {
      this.anInt225 = 0;
      if(this.aLong221 * -4305298252439541509L != -5491195512500654387L * this.aLong229) {
         this.aClass21_227.method654(this.aLong229 * -5491195512500654387L);
         this.aLong221 = 3998952950679227607L * this.aLong229;
      }

      int var2;
      for(this.aLong224 = -9123149754797818845L * this.aLong229; 153129613 * this.anInt225 < this.aByteArray223.length; this.anInt225 += -2126872507 * var2) {
         int var1 = this.aByteArray223.length - this.anInt225 * 153129613;
         if(var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.aClass21_227.method653(this.aByteArray223, this.anInt225 * 153129613, var1, (byte)73);
         if(var2 == -1) {
            break;
         }

         this.aLong221 += (long)var2 * 7192739745952735795L;
      }

   }

   public void method678(short var1) throws IOException {
      this.method685(1827836871);
      this.aClass21_227.method651(517990653);
   }

   public void method679(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException();
      } else {
         this.aLong229 = -453852548555100667L * var1;
      }
   }

   public long method680(int var1) {
      return 6283008802983421107L * this.aLong228;
   }

   public void method681(byte[] var1, int var2) throws IOException {
      this.method682(var1, 0, var1.length, -1946421023);
   }

   public void method682(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if(var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(-6264101060479596485L * this.aLong231 != -1L && -5491195512500654387L * this.aLong229 >= -6264101060479596485L * this.aLong231 && (long)var3 + this.aLong229 * -5491195512500654387L <= this.aLong231 * -6264101060479596485L + (long)(-952323505 * this.anInt222)) {
            System.arraycopy(this.aByteArray232, (int)(-5491195512500654387L * this.aLong229 - this.aLong231 * -6264101060479596485L), var1, var2, var3);
            this.aLong229 += -453852548555100667L * (long)var3;
            return;
         }

         long var5 = this.aLong229 * -5491195512500654387L;
         int var8 = var3;
         int var9;
         if(this.aLong229 * -5491195512500654387L >= 3862378365029376079L * this.aLong224 && this.aLong229 * -5491195512500654387L < (long)(153129613 * this.anInt225) + 3862378365029376079L * this.aLong224) {
            var9 = (int)((long)(this.anInt225 * 153129613) - (this.aLong229 * -5491195512500654387L - this.aLong224 * 3862378365029376079L));
            if(var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.aByteArray223, (int)(this.aLong229 * -5491195512500654387L - 3862378365029376079L * this.aLong224), var1, var2, var9);
            this.aLong229 += (long)var9 * -453852548555100667L;
            var2 += var9;
            var3 -= var9;
         }

         if(var3 > this.aByteArray223.length) {
            this.aClass21_227.method654(this.aLong229 * -5491195512500654387L);

            for(this.aLong221 = this.aLong229 * 3998952950679227607L; var3 > 0; var3 -= var9) {
               var9 = this.aClass21_227.method653(var1, var2, var3, (byte)73);
               if(-1 == var9) {
                  break;
               }

               this.aLong221 += (long)var9 * 7192739745952735795L;
               this.aLong229 += (long)var9 * -453852548555100667L;
               var2 += var9;
            }
         } else if(var3 > 0) {
            this.method683(20238339);
            var9 = var3;
            if(var3 > this.anInt225 * 153129613) {
               var9 = this.anInt225 * 153129613;
            }

            System.arraycopy(this.aByteArray223, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.aLong229 += -453852548555100667L * (long)var9;
         }

         if(this.aLong231 * -6264101060479596485L != -1L) {
            if(-6264101060479596485L * this.aLong231 > this.aLong229 * -5491195512500654387L && var3 > 0) {
               var9 = var2 + (int)(-6264101060479596485L * this.aLong231 - this.aLong229 * -5491195512500654387L);
               if(var9 > var2 + var3) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  this.aLong229 += -453852548555100667L;
               }
            }

            long var10 = -1L;
            long var12 = -1L;
            if(this.aLong231 * -6264101060479596485L >= var5 && -6264101060479596485L * this.aLong231 < (long)var8 + var5) {
               var10 = this.aLong231 * -6264101060479596485L;
            } else if(var5 >= this.aLong231 * -6264101060479596485L && var5 < -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505)) {
               var10 = var5;
            }

            if((long)(this.anInt222 * -952323505) + this.aLong231 * -6264101060479596485L > var5 && this.aLong231 * -6264101060479596485L + (long)(this.anInt222 * -952323505) <= (long)var8 + var5) {
               var12 = -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505);
            } else if((long)var8 + var5 > -6264101060479596485L * this.aLong231 && var5 + (long)var8 <= (long)(this.anInt222 * -952323505) + this.aLong231 * -6264101060479596485L) {
               var12 = (long)var8 + var5;
            }

            if(var10 > -1L && var12 > var10) {
               int var14 = (int)(var12 - var10);
               System.arraycopy(this.aByteArray232, (int)(var10 - this.aLong231 * -6264101060479596485L), var1, (int)(var10 - var5) + var2, var14);
               if(var12 > this.aLong229 * -5491195512500654387L) {
                  var3 = (int)((long)var3 - (var12 - -5491195512500654387L * this.aLong229));
                  this.aLong229 = var12 * -453852548555100667L;
               }
            }
         }
      } catch (IOException var16) {
         this.aLong221 = -7192739745952735795L;
         throw var16;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   void method683(int var1) throws IOException {
      this.anInt225 = 0;
      if(this.aLong221 * -4305298252439541509L != -5491195512500654387L * this.aLong229) {
         this.aClass21_227.method654(this.aLong229 * -5491195512500654387L);
         this.aLong221 = 3998952950679227607L * this.aLong229;
      }

      int var3;
      for(this.aLong224 = -9123149754797818845L * this.aLong229; 153129613 * this.anInt225 < this.aByteArray223.length; this.anInt225 += -2126872507 * var3) {
         int var2 = this.aByteArray223.length - this.anInt225 * 153129613;
         if(var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.aClass21_227.method653(this.aByteArray223, this.anInt225 * 153129613, var2, (byte)73);
         if(var3 == -1) {
            break;
         }

         this.aLong221 += (long)var3 * 7192739745952735795L;
      }

   }

   public void method684(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if((long)var3 + this.aLong229 * -5491195512500654387L > 6283008802983421107L * this.aLong228) {
            this.aLong228 = 9218975595612646011L * ((long)var3 + -5491195512500654387L * this.aLong229);
         }

         if(-1L != this.aLong231 * -6264101060479596485L && (this.aLong229 * -5491195512500654387L < -6264101060479596485L * this.aLong231 || this.aLong229 * -5491195512500654387L > -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505))) {
            this.method685(1930789500);
         }

         if(-6264101060479596485L * this.aLong231 != -1L && (long)var3 + -5491195512500654387L * this.aLong229 > this.aLong231 * -6264101060479596485L + (long)this.aByteArray232.length) {
            int var5 = (int)((long)this.aByteArray232.length - (-5491195512500654387L * this.aLong229 - -6264101060479596485L * this.aLong231));
            System.arraycopy(var1, var2, this.aByteArray232, (int)(-5491195512500654387L * this.aLong229 - this.aLong231 * -6264101060479596485L), var5);
            this.aLong229 += (long)var5 * -453852548555100667L;
            var2 += var5;
            var3 -= var5;
            this.anInt222 = this.aByteArray232.length * 1675699375;
            this.method685(1980217856);
         }

         if(var3 <= this.aByteArray232.length) {
            if(var3 > 0) {
               if(this.aLong231 * -6264101060479596485L == -1L) {
                  this.aLong231 = 9081893000474639511L * this.aLong229;
               }

               System.arraycopy(var1, var2, this.aByteArray232, (int)(-5491195512500654387L * this.aLong229 - this.aLong231 * -6264101060479596485L), var3);
               this.aLong229 += (long)var3 * -453852548555100667L;
               if(this.aLong229 * -5491195512500654387L - this.aLong231 * -6264101060479596485L > (long)(-952323505 * this.anInt222)) {
                  this.anInt222 = 1675699375 * (int)(-5491195512500654387L * this.aLong229 - -6264101060479596485L * this.aLong231);
               }

            }
         } else {
            if(this.aLong221 * -4305298252439541509L != -5491195512500654387L * this.aLong229) {
               this.aClass21_227.method654(-5491195512500654387L * this.aLong229);
               this.aLong221 = this.aLong229 * 3998952950679227607L;
            }

            this.aClass21_227.method650(var1, var2, var3, (byte)-128);
            this.aLong221 += 7192739745952735795L * (long)var3;
            if(this.aLong221 * -4305298252439541509L > -7082619646780073777L * this.aLong230) {
               this.aLong230 = this.aLong221 * 8745135752253759509L;
            }

            long var6 = -1L;
            long var8 = -1L;
            if(-5491195512500654387L * this.aLong229 >= 3862378365029376079L * this.aLong224 && this.aLong229 * -5491195512500654387L < (long)(153129613 * this.anInt225) + this.aLong224 * 3862378365029376079L) {
               var6 = -5491195512500654387L * this.aLong229;
            } else if(this.aLong224 * 3862378365029376079L >= this.aLong229 * -5491195512500654387L && 3862378365029376079L * this.aLong224 < -5491195512500654387L * this.aLong229 + (long)var3) {
               var6 = this.aLong224 * 3862378365029376079L;
            }

            if(this.aLong229 * -5491195512500654387L + (long)var3 > 3862378365029376079L * this.aLong224 && -5491195512500654387L * this.aLong229 + (long)var3 <= this.aLong224 * 3862378365029376079L + (long)(this.anInt225 * 153129613)) {
               var8 = -5491195512500654387L * this.aLong229 + (long)var3;
            } else if(this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225) > -5491195512500654387L * this.aLong229 && (long)(this.anInt225 * 153129613) + 3862378365029376079L * this.aLong224 <= (long)var3 + -5491195512500654387L * this.aLong229) {
               var8 = (long)(153129613 * this.anInt225) + this.aLong224 * 3862378365029376079L;
            }

            if(var6 > -1L && var8 > var6) {
               int var10 = (int)(var8 - var6);
               System.arraycopy(var1, (int)((long)var2 + var6 - -5491195512500654387L * this.aLong229), this.aByteArray223, (int)(var6 - this.aLong224 * 3862378365029376079L), var10);
            }

            this.aLong229 += (long)var3 * -453852548555100667L;
         }
      } catch (IOException var11) {
         this.aLong221 = -7192739745952735795L;
         throw var11;
      }
   }

   void method685(int var1) throws IOException {
      if(-6264101060479596485L * this.aLong231 != -1L) {
         if(this.aLong231 * -6264101060479596485L != this.aLong221 * -4305298252439541509L) {
            this.aClass21_227.method654(-6264101060479596485L * this.aLong231);
            this.aLong221 = this.aLong231 * -2608451284017038911L;
         }

         this.aClass21_227.method650(this.aByteArray232, 0, -952323505 * this.anInt222, (byte)-101);
         this.aLong221 += (long)this.anInt222 * -94840461095238723L;
         if(this.aLong221 * -4305298252439541509L > -7082619646780073777L * this.aLong230) {
            this.aLong230 = this.aLong221 * 8745135752253759509L;
         }

         long var2 = -1L;
         long var4 = -1L;
         if(this.aLong231 * -6264101060479596485L >= 3862378365029376079L * this.aLong224 && this.aLong231 * -6264101060479596485L < this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225)) {
            var2 = -6264101060479596485L * this.aLong231;
         } else if(this.aLong224 * 3862378365029376079L >= this.aLong231 * -6264101060479596485L && 3862378365029376079L * this.aLong224 < (long)(-952323505 * this.anInt222) + -6264101060479596485L * this.aLong231) {
            var2 = 3862378365029376079L * this.aLong224;
         }

         if(this.aLong231 * -6264101060479596485L + (long)(this.anInt222 * -952323505) > this.aLong224 * 3862378365029376079L && -6264101060479596485L * this.aLong231 + (long)(-952323505 * this.anInt222) <= 3862378365029376079L * this.aLong224 + (long)(153129613 * this.anInt225)) {
            var4 = -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505);
         } else if((long)(153129613 * this.anInt225) + 3862378365029376079L * this.aLong224 > -6264101060479596485L * this.aLong231 && 3862378365029376079L * this.aLong224 + (long)(153129613 * this.anInt225) <= -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505)) {
            var4 = this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225);
         }

         if(var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.aByteArray232, (int)(var2 - this.aLong231 * -6264101060479596485L), this.aByteArray223, (int)(var2 - 3862378365029376079L * this.aLong224), var6);
         }

         this.aLong231 = -1921748088601202931L;
         this.anInt222 = 0;
      }

   }

   public void method686() throws IOException {
      this.method685(2021716364);
      this.aClass21_227.method651(1257299894);
   }

   void method687() throws IOException {
      this.anInt225 = 0;
      if(this.aLong221 * -4305298252439541509L != -5491195512500654387L * this.aLong229) {
         this.aClass21_227.method654(this.aLong229 * -5491195512500654387L);
         this.aLong221 = 3998952950679227607L * this.aLong229;
      }

      int var2;
      for(this.aLong224 = -9123149754797818845L * this.aLong229; 153129613 * this.anInt225 < this.aByteArray223.length; this.anInt225 += -2126872507 * var2) {
         int var1 = this.aByteArray223.length - this.anInt225 * 153129613;
         if(var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.aClass21_227.method653(this.aByteArray223, this.anInt225 * 153129613, var1, (byte)73);
         if(var2 == -1) {
            break;
         }

         this.aLong221 += (long)var2 * 7192739745952735795L;
      }

   }

   void method688() throws IOException {
      if(-6264101060479596485L * this.aLong231 != -1L) {
         if(this.aLong231 * -6264101060479596485L != this.aLong221 * -4305298252439541509L) {
            this.aClass21_227.method654(-6264101060479596485L * this.aLong231);
            this.aLong221 = this.aLong231 * -2608451284017038911L;
         }

         this.aClass21_227.method650(this.aByteArray232, 0, -952323505 * this.anInt222, (byte)-57);
         this.aLong221 += (long)this.anInt222 * -94840461095238723L;
         if(this.aLong221 * -4305298252439541509L > -7082619646780073777L * this.aLong230) {
            this.aLong230 = this.aLong221 * 8745135752253759509L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.aLong231 * -6264101060479596485L >= 3862378365029376079L * this.aLong224 && this.aLong231 * -6264101060479596485L < this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225)) {
            var1 = -6264101060479596485L * this.aLong231;
         } else if(this.aLong224 * 3862378365029376079L >= this.aLong231 * -6264101060479596485L && 3862378365029376079L * this.aLong224 < (long)(-952323505 * this.anInt222) + -6264101060479596485L * this.aLong231) {
            var1 = 3862378365029376079L * this.aLong224;
         }

         if(this.aLong231 * -6264101060479596485L + (long)(this.anInt222 * -952323505) > this.aLong224 * 3862378365029376079L && -6264101060479596485L * this.aLong231 + (long)(-952323505 * this.anInt222) <= 3862378365029376079L * this.aLong224 + (long)(153129613 * this.anInt225)) {
            var3 = -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505);
         } else if((long)(153129613 * this.anInt225) + 3862378365029376079L * this.aLong224 > -6264101060479596485L * this.aLong231 && 3862378365029376079L * this.aLong224 + (long)(153129613 * this.anInt225) <= -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505)) {
            var3 = this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225);
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.aByteArray232, (int)(var1 - this.aLong231 * -6264101060479596485L), this.aByteArray223, (int)(var1 - 3862378365029376079L * this.aLong224), var5);
         }

         this.aLong231 = -1921748088601202931L;
         this.anInt222 = 0;
      }

   }

   void method689() throws IOException {
      this.anInt225 = 0;
      if(this.aLong221 * -4305298252439541509L != -5491195512500654387L * this.aLong229) {
         this.aClass21_227.method654(this.aLong229 * -5491195512500654387L);
         this.aLong221 = 3998952950679227607L * this.aLong229;
      }

      int var2;
      for(this.aLong224 = -9123149754797818845L * this.aLong229; 153129613 * this.anInt225 < this.aByteArray223.length; this.anInt225 += -2126872507 * var2) {
         int var1 = this.aByteArray223.length - this.anInt225 * 153129613;
         if(var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.aClass21_227.method653(this.aByteArray223, this.anInt225 * 153129613, var1, (byte)73);
         if(var2 == -1) {
            break;
         }

         this.aLong221 += (long)var2 * 7192739745952735795L;
      }

   }

   public void method690(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException();
      } else {
         this.aLong229 = -453852548555100667L * var1;
      }
   }

   void method691() throws IOException {
      if(-6264101060479596485L * this.aLong231 != -1L) {
         if(this.aLong231 * -6264101060479596485L != this.aLong221 * -4305298252439541509L) {
            this.aClass21_227.method654(-6264101060479596485L * this.aLong231);
            this.aLong221 = this.aLong231 * -2608451284017038911L;
         }

         this.aClass21_227.method650(this.aByteArray232, 0, -952323505 * this.anInt222, (byte)-118);
         this.aLong221 += (long)this.anInt222 * -94840461095238723L;
         if(this.aLong221 * -4305298252439541509L > -7082619646780073777L * this.aLong230) {
            this.aLong230 = this.aLong221 * 8745135752253759509L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.aLong231 * -6264101060479596485L >= 3862378365029376079L * this.aLong224 && this.aLong231 * -6264101060479596485L < this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225)) {
            var1 = -6264101060479596485L * this.aLong231;
         } else if(this.aLong224 * 3862378365029376079L >= this.aLong231 * -6264101060479596485L && 3862378365029376079L * this.aLong224 < (long)(-952323505 * this.anInt222) + -6264101060479596485L * this.aLong231) {
            var1 = 3862378365029376079L * this.aLong224;
         }

         if(this.aLong231 * -6264101060479596485L + (long)(this.anInt222 * -952323505) > this.aLong224 * 3862378365029376079L && -6264101060479596485L * this.aLong231 + (long)(-952323505 * this.anInt222) <= 3862378365029376079L * this.aLong224 + (long)(153129613 * this.anInt225)) {
            var3 = -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505);
         } else if((long)(153129613 * this.anInt225) + 3862378365029376079L * this.aLong224 > -6264101060479596485L * this.aLong231 && 3862378365029376079L * this.aLong224 + (long)(153129613 * this.anInt225) <= -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505)) {
            var3 = this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225);
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.aByteArray232, (int)(var1 - this.aLong231 * -6264101060479596485L), this.aByteArray223, (int)(var1 - 3862378365029376079L * this.aLong224), var5);
         }

         this.aLong231 = -1921748088601202931L;
         this.anInt222 = 0;
      }

   }

   void method692() throws IOException {
      if(-6264101060479596485L * this.aLong231 != -1L) {
         if(this.aLong231 * -6264101060479596485L != this.aLong221 * -4305298252439541509L) {
            this.aClass21_227.method654(-6264101060479596485L * this.aLong231);
            this.aLong221 = this.aLong231 * -2608451284017038911L;
         }

         this.aClass21_227.method650(this.aByteArray232, 0, -952323505 * this.anInt222, (byte)-14);
         this.aLong221 += (long)this.anInt222 * -94840461095238723L;
         if(this.aLong221 * -4305298252439541509L > -7082619646780073777L * this.aLong230) {
            this.aLong230 = this.aLong221 * 8745135752253759509L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.aLong231 * -6264101060479596485L >= 3862378365029376079L * this.aLong224 && this.aLong231 * -6264101060479596485L < this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225)) {
            var1 = -6264101060479596485L * this.aLong231;
         } else if(this.aLong224 * 3862378365029376079L >= this.aLong231 * -6264101060479596485L && 3862378365029376079L * this.aLong224 < (long)(-952323505 * this.anInt222) + -6264101060479596485L * this.aLong231) {
            var1 = 3862378365029376079L * this.aLong224;
         }

         if(this.aLong231 * -6264101060479596485L + (long)(this.anInt222 * -952323505) > this.aLong224 * 3862378365029376079L && -6264101060479596485L * this.aLong231 + (long)(-952323505 * this.anInt222) <= 3862378365029376079L * this.aLong224 + (long)(153129613 * this.anInt225)) {
            var3 = -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505);
         } else if((long)(153129613 * this.anInt225) + 3862378365029376079L * this.aLong224 > -6264101060479596485L * this.aLong231 && 3862378365029376079L * this.aLong224 + (long)(153129613 * this.anInt225) <= -6264101060479596485L * this.aLong231 + (long)(this.anInt222 * -952323505)) {
            var3 = this.aLong224 * 3862378365029376079L + (long)(153129613 * this.anInt225);
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.aByteArray232, (int)(var1 - this.aLong231 * -6264101060479596485L), this.aByteArray223, (int)(var1 - 3862378365029376079L * this.aLong224), var5);
         }

         this.aLong231 = -1921748088601202931L;
         this.anInt222 = 0;
      }

   }

   public Class23(Class21 var1, int var2, int var3) throws IOException {
      this.aClass21_227 = var1;
      this.aLong228 = (this.aLong230 = var1.method658((byte)-9) * -402213399861301713L) * -7113552958650916491L;
      this.aByteArray223 = new byte[var2];
      this.aByteArray232 = new byte[var3];
      this.aLong229 = 0L;
   }

   static final void method693(InterfaceDef var0, byte[] var1, byte[] var2, Class681 var3, byte var4) {
      int var5 = var3.anIntArray8622[(var3.anInt8623 -= -1957887669) * -1730576285] - 1;
      if(var5 >= 0 && var5 <= 9) {
         Class407.method4878(var0, var5, var1, var2, var3, 263668512);
      } else {
         throw new RuntimeException();
      }
   }

   static void method694(Class681 var0, int var1) {
      var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1], 350087007)).method3790(Class242.aClass94_2456, 1453293452)?1:0;
   }

   static void method695(int var0, int var1, int var2, byte var3) {
      Class526_Sub21_Sub9 var4 = Class265.method3560(9, (long)var0);
      var4.method10584(230428369);
      var4.anInt11678 = var1 * 1693201951;
      var4.anInt11680 = -1482432943 * var2;
   }
}
