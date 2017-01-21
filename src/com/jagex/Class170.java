package com.jagex;

import com.jagex.Class141;
import com.jagex.Class172;
import com.jagex.Class182;
import com.jagex.Class185;
import com.jagex.Class443;
import com.jagex.Class466;
import com.jagex.RSByteBuffer;

public class Class170 {
   static final int anInt1915 = 26;
   public static final short aShort1916 = -1;
   static final int anInt1922 = 1;
   static final int anInt1926 = 3;
   public static final short aShort1946 = 32766;
   public int anInt1942 = 12;
   public int anInt1918 = 0;
   public int anInt1919 = 0;
   public int anInt1929 = 0;
   byte aByte1950 = 0;
   int anInt1947 = 0;
   public byte[] aByteArray1948;
   int anInt1951;
   public int[] anIntArray1920;
   public int[] anIntArray1921;
   public int[] anIntArray1939;
   public short[] aShortArray1930;
   public short[] aShortArray1931;
   public short[] aShortArray1932;
   public int[] anIntArray1924;
   public byte[] aByteArray1936;
   public byte[] aByteArray1937;
   public byte[] aByteArray1938;
   public int[] anIntArray1949;
   public short[] aShortArray1941;
   public short[] aShortArray1940;
   public short[] aShortArray1943;
   public short[] aShortArray1944;
   public short[] aShortArray1927;
   public short[] aShortArray1953;
   public int[] anIntArray1945;
   public int[] anIntArray1935;
   public int[] anIntArray1954;
   byte[] aByteArray1958;
   public byte[] aByteArray1959;
   public int[] anIntArray1955;
   public int[] anIntArray1956;
   public int[] anIntArray1957;
   public int[] anIntArray1923;
   public byte[] aByteArray1933;
   public byte[] aByteArray1934;
   public byte[] aByteArray1952;
   public float[] aFloatArray1914;
   public float[] aFloatArray1928;
   public Class182[] aClass182Array1960;
   public Class141[] aClass141Array1961;
   public Class185[] aClass185Array1962;
   public short[] aShortArray1925;
   public short[] aShortArray1917;

   public Class170(byte[] var1) {
      RSByteBuffer var2 = new RSByteBuffer(var1);
      RSByteBuffer var3 = new RSByteBuffer(var1);
      RSByteBuffer var4 = new RSByteBuffer(var1);
      RSByteBuffer var5 = new RSByteBuffer(var1);
      RSByteBuffer var6 = new RSByteBuffer(var1);
      RSByteBuffer var7 = new RSByteBuffer(var1);
      RSByteBuffer var8 = new RSByteBuffer(var1);
      int var9 = var2.readUnsignedByte(308233061);
      if(var9 != 1) {
      } else {
         var2.readUnsignedByte(-610895758);
         this.anInt1942 = var2.readUnsignedByte(-443821441);
         var2.pos = (var1.length - 26) * 801976415;
         this.anInt1918 = var2.readUnsignedShort(1260996165);
         this.anInt1929 = var2.readUnsignedShort(316131554);
         this.anInt1947 = var2.readUnsignedShort(1154203080);
         int var10 = var2.readUnsignedByte(-1598266479);
         boolean var11 = (var10 & 1) == 1;
         boolean var12 = (var10 & 2) == 2;
         boolean var13 = (var10 & 4) == 4;
         boolean var14 = (var10 & 16) == 16;
         boolean var15 = (var10 & 32) == 32;
         boolean var16 = (var10 & 64) == 64;
         boolean var17 = (var10 & 128) == 128;
         int var18 = var2.readUnsignedByte(-419261189);
         int var19 = var2.readUnsignedByte(14720026);
         int var20 = var2.readUnsignedByte(-1584815157);
         int var21 = var2.readUnsignedByte(598917720);
         int var22 = var2.readUnsignedByte(466791511);
         int var23 = var2.readUnsignedShort(137575961);
         int var24 = var2.readUnsignedShort(1420642492);
         int var25 = var2.readUnsignedShort(1150743265);
         int var26 = var2.readUnsignedShort(965186486);
         int var27 = var2.readUnsignedShort(25623979);
         int var28 = var2.readUnsignedShort(1833298730);
         int var29 = var2.readUnsignedShort(1180108786);
         if(!var14) {
            if(var22 == 1) {
               var28 = this.anInt1918;
            } else {
               var28 = 0;
            }
         }

         if(!var15) {
            if(var20 == 1) {
               var29 = this.anInt1929;
            } else {
               var29 = 0;
            }
         }

         int var30 = 0;
         int var31 = 0;
         int var32 = 0;
         int var33;
         if(this.anInt1947 > 0) {
            this.aByteArray1948 = new byte[this.anInt1947];
            var2.pos = -1889038051;

            for(var33 = 0; var33 < this.anInt1947; ++var33) {
               byte var34 = this.aByteArray1948[var33] = var2.readByte((byte)66);
               if(var34 == 0) {
                  ++var30;
               }

               if(var34 >= 1 && var34 <= 3) {
                  ++var31;
               }

               if(var34 == 2) {
                  ++var32;
               }
            }
         }

         var33 = 3 + this.anInt1947;
         int var69 = var33;
         var33 += this.anInt1918;
         int var35 = var33;
         if(var11) {
            var33 += this.anInt1929;
         }

         int var36 = var33;
         var33 += this.anInt1929;
         int var37 = var33;
         if(var18 == 255) {
            var33 += this.anInt1929;
         }

         int var38 = var33;
         var33 += var29;
         int var39 = var33;
         var33 += var28;
         int var40 = var33;
         if(var19 == 1) {
            var33 += this.anInt1929;
         }

         int var41 = var33;
         var33 += var26;
         int var42 = var33;
         if(var21 == 1) {
            var33 += this.anInt1929 * 2;
         }

         int var43 = var33;
         var33 += var27;
         int var44 = var33;
         var33 += this.anInt1929 * 2;
         int var45 = var33;
         var33 += var23;
         int var46 = var33;
         var33 += var24;
         int var47 = var33;
         var33 += var25;
         int var48 = var33;
         var33 += var30 * 6;
         int var49 = var33;
         var33 += var31 * 6;
         byte var50 = 6;
         if(this.anInt1942 == 14) {
            var50 = 7;
         } else if(this.anInt1942 >= 15) {
            var50 = 9;
         }

         int var51 = var33;
         var33 += var31 * var50;
         int var52 = var33;
         var33 += var31;
         int var53 = var33;
         var33 += var31;
         int var54 = var33;
         var33 += var31 + var32 * 2;
         int var56 = var1.length;
         int var57 = var1.length;
         int var58 = var1.length;
         int var59 = var1.length;
         int var61;
         int var62;
         if(var17) {
            RSByteBuffer var60 = new RSByteBuffer(var1);
            var60.pos = (var1.length - 26) * 801976415;
            var60.pos -= var1[var60.pos * 301018015 - 1] * 801976415;
            this.anInt1951 = var60.readUnsignedShort(62701662);
            var61 = var60.readUnsignedShort(1676499284);
            var62 = var60.readUnsignedShort(1338821312);
            var56 = var33 + var61;
            var57 = var56 + var62;
            var58 = var57 + this.anInt1918;
            var59 = var58 + this.anInt1951 * 2;
         }

         this.anIntArray1920 = new int[this.anInt1918];
         this.anIntArray1921 = new int[this.anInt1918];
         this.anIntArray1939 = new int[this.anInt1918];
         this.aShortArray1930 = new short[this.anInt1929];
         this.aShortArray1931 = new short[this.anInt1929];
         this.aShortArray1932 = new short[this.anInt1929];
         if(var22 == 1) {
            this.anIntArray1924 = new int[this.anInt1918];
         }

         if(var11) {
            this.aByteArray1936 = new byte[this.anInt1929];
         }

         if(var18 == 255) {
            this.aByteArray1937 = new byte[this.anInt1929];
         } else {
            this.aByte1950 = (byte)var18;
         }

         if(var19 == 1) {
            this.aByteArray1938 = new byte[this.anInt1929];
         }

         if(var20 == 1) {
            this.anIntArray1949 = new int[this.anInt1929];
         }

         if(var21 == 1) {
            this.aShortArray1941 = new short[this.anInt1929];
         }

         if(var21 == 1 && (this.anInt1947 > 0 || this.anInt1951 > 0)) {
            this.aShortArray1943 = new short[this.anInt1929];
         }

         this.aShortArray1940 = new short[this.anInt1929];
         if(this.anInt1947 > 0) {
            this.aShortArray1944 = new short[this.anInt1947];
            this.aShortArray1927 = new short[this.anInt1947];
            this.aShortArray1953 = new short[this.anInt1947];
            if(var31 > 0) {
               this.anIntArray1945 = new int[var31];
               this.anIntArray1935 = new int[var31];
               this.anIntArray1954 = new int[var31];
               this.aByteArray1958 = new byte[var31];
               this.aByteArray1959 = new byte[var31];
               this.anIntArray1955 = new int[var31];
            }

            if(var32 > 0) {
               this.anIntArray1956 = new int[var32];
               this.anIntArray1957 = new int[var32];
            }
         }

         var2.pos = var69 * 801976415;
         var3.pos = var45 * 801976415;
         var4.pos = var46 * 801976415;
         var5.pos = var47 * 801976415;
         var6.pos = var39 * 801976415;
         int var70 = 0;
         var61 = 0;
         var62 = 0;

         int var63;
         int var64;
         int var65;
         int var66;
         int var67;
         for(var63 = 0; var63 < this.anInt1918; ++var63) {
            var64 = var2.readUnsignedByte(-105966024);
            var65 = 0;
            if((var64 & 1) != 0) {
               var65 = var3.readUnsignedSmart(1763020678);
            }

            var66 = 0;
            if((var64 & 2) != 0) {
               var66 = var4.readUnsignedSmart(309081655);
            }

            var67 = 0;
            if((var64 & 4) != 0) {
               var67 = var5.readUnsignedSmart(-203969797);
            }

            this.anIntArray1920[var63] = var70 + var65;
            this.anIntArray1921[var63] = var61 + var66;
            this.anIntArray1939[var63] = var62 + var67;
            var70 = this.anIntArray1920[var63];
            var61 = this.anIntArray1921[var63];
            var62 = this.anIntArray1939[var63];
            if(var22 == 1) {
               if(var14) {
                  this.anIntArray1924[var63] = var6.readDecoratedSmart(1468535137);
               } else {
                  this.anIntArray1924[var63] = var6.readUnsignedByte(-954654957);
                  if(this.anIntArray1924[var63] == 255) {
                     this.anIntArray1924[var63] = -1;
                  }
               }
            }
         }

         if(this.anInt1951 > 0) {
            var2.pos = var57 * 801976415;
            var3.pos = var58 * 801976415;
            var4.pos = var59 * 801976415;
            this.anIntArray1923 = new int[this.anInt1918];
            var63 = 0;

            for(var64 = 0; var63 < this.anInt1918; ++var63) {
               this.anIntArray1923[var63] = var64;
               var64 += var2.readUnsignedByte(-19845032);
            }

            this.aByteArray1933 = new byte[this.anInt1929];
            this.aByteArray1934 = new byte[this.anInt1929];
            this.aByteArray1952 = new byte[this.anInt1929];
            this.aFloatArray1914 = new float[this.anInt1951];
            this.aFloatArray1928 = new float[this.anInt1951];

            for(var63 = 0; var63 < this.anInt1951; ++var63) {
               this.aFloatArray1914[var63] = (float)var3.readShort((byte)1) / 4096.0F;
               this.aFloatArray1928[var63] = (float)var4.readShort((byte)1) / 4096.0F;
            }
         }

         var2.pos = var44 * 801976415;
         var3.pos = var35 * 801976415;
         var4.pos = var37 * 801976415;
         var5.pos = var40 * 801976415;
         var6.pos = var38 * 801976415;
         var7.pos = var42 * 801976415;
         var8.pos = var43 * 801976415;

         for(var63 = 0; var63 < this.anInt1929; ++var63) {
            this.aShortArray1940[var63] = (short)var2.readUnsignedShort(1291000520);
            if(var11) {
               this.aByteArray1936[var63] = var3.readByte((byte)82);
            }

            if(var18 == 255) {
               this.aByteArray1937[var63] = var4.readByte((byte)40);
            }

            if(var19 == 1) {
               this.aByteArray1938[var63] = var5.readByte((byte)71);
            }

            if(var20 == 1) {
               if(var15) {
                  this.anIntArray1949[var63] = var6.readDecoratedSmart(743703420);
               } else {
                  this.anIntArray1949[var63] = var6.readUnsignedByte(-72698103);
                  if(this.anIntArray1949[var63] == 255) {
                     this.anIntArray1949[var63] = -1;
                  }
               }
            }

            if(var21 == 1) {
               this.aShortArray1941[var63] = (short)(var7.readUnsignedShort(1140011476) - 1);
            }

            if(this.aShortArray1943 != null) {
               if(this.aShortArray1941[var63] != -1) {
                  if(this.anInt1942 >= 16) {
                     this.aShortArray1943[var63] = (short)(var8.readSmart(-1055118320) - 1);
                  } else {
                     this.aShortArray1943[var63] = (short)(var8.readUnsignedByte(-1176552427) - 1);
                  }
               } else {
                  this.aShortArray1943[var63] = -1;
               }
            }
         }

         this.anInt1919 = -1;
         var2.pos = var41 * 801976415;
         var3.pos = var36 * 801976415;
         var4.pos = var56 * 801976415;
         this.method2131(var2, var3, var4);
         var2.pos = var48 * 801976415;
         var3.pos = var49 * 801976415;
         var4.pos = var51 * 801976415;
         var5.pos = var52 * 801976415;
         var6.pos = var53 * 801976415;
         var7.pos = var54 * 801976415;
         this.method2132(var2, var3, var4, var5, var6, var7);
         var2.pos = var33 * 801976415;
         if(var12) {
            var63 = var2.readUnsignedByte(621210223);
            if(var63 > 0) {
               this.aClass182Array1960 = new Class182[var63];

               for(var64 = 0; var64 < var63; ++var64) {
                  var65 = var2.readUnsignedShort(555266228);
                  var66 = var2.readUnsignedShort(824733232);
                  byte var71;
                  if(var18 == 255) {
                     var71 = this.aByteArray1937[var66];
                  } else {
                     var71 = (byte)var18;
                  }

                  this.aClass182Array1960[var64] = new Class182(var65, var66, this.aShortArray1930[var66], this.aShortArray1931[var66], this.aShortArray1932[var66], var71);
               }
            }

            var64 = var2.readUnsignedByte(-2051751267);
            if(var64 > 0) {
               this.aClass141Array1961 = new Class141[var64];

               for(var65 = 0; var65 < var64; ++var65) {
                  var66 = var2.readUnsignedShort(2124807231);
                  var67 = var2.readUnsignedShort(161156909);
                  this.aClass141Array1961[var65] = new Class141(var66, var67);
               }
            }
         }

         if(var13) {
            var63 = var2.readUnsignedByte(-1552231373);
            if(var63 > 0) {
               this.aClass185Array1962 = new Class185[var63];

               for(var64 = 0; var64 < var63; ++var64) {
                  var65 = var2.readUnsignedShort(1009492192);
                  var66 = var2.readUnsignedShort(637730575);
                  if(var16) {
                     var67 = var2.readDecoratedSmart(1521842542);
                  } else {
                     var67 = var2.readUnsignedByte(123016962);
                     if(var67 == 255) {
                        var67 = -1;
                     }
                  }

                  byte var68 = var2.readByte((byte)30);
                  this.aClass185Array1962[var64] = new Class185(var65, var66, var67, var68);
               }
            }
         }

      }
   }

   public void method2129(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt1918; ++var4) {
         this.anIntArray1920[var4] += var1;
         this.anIntArray1921[var4] += var2;
         this.anIntArray1939[var4] += var3;
      }

   }

   public Class170(Class170[] var1, int var2) {
      this.anInt1918 = 0;
      this.anInt1929 = 0;
      this.anInt1947 = 0;
      this.anInt1951 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      this.aByte1950 = -1;

      for(int var12 = 0; var12 < var2; ++var12) {
         Class170 var13 = var1[var12];
         if(var13 != null) {
            this.anInt1918 += var13.anInt1918;
            this.anInt1929 += var13.anInt1929;
            this.anInt1947 += var13.anInt1947;
            this.anInt1951 += var13.anInt1951;
            if(var13.aClass182Array1960 != null) {
               var3 += var13.aClass182Array1960.length;
            }

            if(var13.aClass141Array1961 != null) {
               var4 += var13.aClass141Array1961.length;
            }

            if(var13.aClass185Array1962 != null) {
               var5 += var13.aClass185Array1962.length;
            }

            var6 |= var13.aByteArray1936 != null;
            if(var13.aByteArray1937 != null) {
               var7 = true;
            } else {
               if(this.aByte1950 == -1) {
                  this.aByte1950 = var13.aByte1950;
               }

               if(this.aByte1950 != var13.aByte1950) {
                  var7 = true;
               }
            }

            var8 |= var13.aByteArray1938 != null;
            var9 |= var13.aShortArray1943 != null;
            var10 |= var13.aShortArray1941 != null;
            var11 |= var13.anIntArray1949 != null;
         }
      }

      this.anIntArray1920 = new int[this.anInt1918];
      this.anIntArray1921 = new int[this.anInt1918];
      this.anIntArray1939 = new int[this.anInt1918];
      this.anIntArray1924 = new int[this.anInt1918];
      this.aShortArray1925 = new short[this.anInt1918];
      this.aShortArray1930 = new short[this.anInt1929];
      this.aShortArray1931 = new short[this.anInt1929];
      this.aShortArray1932 = new short[this.anInt1929];
      if(var6) {
         this.aByteArray1936 = new byte[this.anInt1929];
      }

      if(var7) {
         this.aByteArray1937 = new byte[this.anInt1929];
      }

      if(var8) {
         this.aByteArray1938 = new byte[this.anInt1929];
      }

      if(var9) {
         this.aShortArray1943 = new short[this.anInt1929];
      }

      this.aShortArray1940 = new short[this.anInt1929];
      if(var10) {
         this.aShortArray1941 = new short[this.anInt1929];
      }

      if(var11) {
         this.anIntArray1949 = new int[this.anInt1929];
      }

      this.aShortArray1917 = new short[this.anInt1929];
      if(this.anInt1947 > 0) {
         this.aByteArray1948 = new byte[this.anInt1947];
         this.aShortArray1944 = new short[this.anInt1947];
         this.aShortArray1927 = new short[this.anInt1947];
         this.aShortArray1953 = new short[this.anInt1947];
         this.anIntArray1945 = new int[this.anInt1947];
         this.anIntArray1935 = new int[this.anInt1947];
         this.anIntArray1954 = new int[this.anInt1947];
         this.aByteArray1958 = new byte[this.anInt1947];
         this.aByteArray1959 = new byte[this.anInt1947];
         this.anIntArray1955 = new int[this.anInt1947];
         this.anIntArray1956 = new int[this.anInt1947];
         this.anIntArray1957 = new int[this.anInt1947];
      }

      if(var5 > 0) {
         this.aClass185Array1962 = new Class185[var5];
      }

      if(var3 > 0) {
         this.aClass182Array1960 = new Class182[var3];
      }

      if(var4 > 0) {
         this.aClass141Array1961 = new Class141[var4];
      }

      if(this.anInt1951 > 0) {
         this.aFloatArray1914 = new float[this.anInt1951];
         this.aFloatArray1928 = new float[this.anInt1951];
         this.anIntArray1923 = new int[this.anInt1918];
         this.aByteArray1933 = new byte[this.anInt1929];
         this.aByteArray1934 = new byte[this.anInt1929];
         this.aByteArray1952 = new byte[this.anInt1929];
      }

      int[] var31 = new int[this.anInt1918];
      int[] var32 = new int[this.anInt1951];
      int[] var14 = new int[this.anInt1918];
      int[] var15 = new int[this.anInt1918];
      int[] var16 = new int[3];
      this.anInt1918 = 0;
      this.anInt1929 = 0;
      this.anInt1947 = 0;
      this.anInt1951 = 0;
      var3 = 0;
      var4 = 0;
      var5 = 0;

      int var17;
      for(var17 = 0; var17 < var2; ++var17) {
         short var18 = (short)(1 << var17);
         Class170 var19 = var1[var17];
         int var20 = this.anInt1929;
         if(var19 != null) {
            boolean[] var21 = new boolean[var19.anInt1918];
            int var22;
            if(var19.aClass185Array1962 != null) {
               for(var22 = 0; var22 < var19.aClass185Array1962.length; ++var22) {
                  Class185 var23 = var19.aClass185Array1962[var22];
                  this.aClass185Array1962[var5++] = var23.method2712(var23.anInt2119 * 900019051 + this.anInt1929, 674221929);
               }
            }

            int var24;
            int var25;
            int var37;
            for(var22 = 0; var22 < var19.anInt1929; ++var22) {
               var16[0] = var19.aShortArray1930[var22];
               var16[1] = var19.aShortArray1931[var22];
               var16[2] = var19.aShortArray1932[var22];

               for(var37 = 0; var37 < 3; ++var37) {
                  var24 = var16[var37];
                  var25 = var19.anIntArray1920[var24];
                  int var26 = var19.anIntArray1921[var24];
                  int var27 = var19.anIntArray1939[var24];

                  int var28;
                  for(var28 = 0; var28 < this.anInt1918; ++var28) {
                     if(var25 == this.anIntArray1920[var28] && var26 == this.anIntArray1921[var28] && var27 == this.anIntArray1939[var28]) {
                        this.aShortArray1925[var28] |= var18;
                        var14[var24] = var28;
                        break;
                     }
                  }

                  if(var19.anInt1951 > 0 && !var21[var24]) {
                     int var29 = (var24 < var19.anInt1918 - 1?var19.anIntArray1923[var24 + 1]:var19.anInt1951) - var19.anIntArray1923[var24];

                     for(int var30 = 0; var30 < var29; ++var30) {
                        this.aFloatArray1914[this.anInt1951] = var19.aFloatArray1914[var19.anIntArray1923[var24] + var30];
                        this.aFloatArray1928[this.anInt1951] = var19.aFloatArray1928[var19.anIntArray1923[var24] + var30];
                        var32[this.anInt1951] = var28 << 16 | var31[var28] + var30;
                        ++this.anInt1951;
                     }

                     var15[var24] = var31[var28];
                     var31[var28] += var29;
                     var21[var24] = true;
                  }

                  if(var28 >= this.anInt1918) {
                     this.anIntArray1920[this.anInt1918] = var25;
                     this.anIntArray1921[this.anInt1918] = var26;
                     this.anIntArray1939[this.anInt1918] = var27;
                     this.aShortArray1925[this.anInt1918] = var18;
                     this.anIntArray1924[this.anInt1918] = var19.anIntArray1924 != null?var19.anIntArray1924[var24]:-1;
                     var14[var24] = this.anInt1918++;
                  }
               }
            }

            for(var22 = 0; var22 < var19.anInt1929; ++var22) {
               if(var6 && var19.aByteArray1936 != null) {
                  this.aByteArray1936[this.anInt1929] = var19.aByteArray1936[var22];
               }

               if(var7) {
                  if(var19.aByteArray1937 != null) {
                     this.aByteArray1937[this.anInt1929] = var19.aByteArray1937[var22];
                  } else {
                     this.aByteArray1937[this.anInt1929] = var19.aByte1950;
                  }
               }

               if(var8 && var19.aByteArray1938 != null) {
                  this.aByteArray1938[this.anInt1929] = var19.aByteArray1938[var22];
               }

               if(var10) {
                  if(var19.aShortArray1941 != null) {
                     this.aShortArray1941[this.anInt1929] = var19.aShortArray1941[var22];
                  } else {
                     this.aShortArray1941[this.anInt1929] = -1;
                  }
               }

               if(var11) {
                  if(var19.anIntArray1949 != null) {
                     this.anIntArray1949[this.anInt1929] = var19.anIntArray1949[var22];
                  } else {
                     this.anIntArray1949[this.anInt1929] = -1;
                  }
               }

               if(var19.anInt1951 > 0) {
                  this.aByteArray1933[this.anInt1929] = (byte)(var19.aByteArray1933[var22] + var15[var19.aShortArray1930[var22]]);
                  this.aByteArray1934[this.anInt1929] = (byte)(var19.aByteArray1934[var22] + var15[var19.aShortArray1931[var22]]);
                  this.aByteArray1952[this.anInt1929] = (byte)(var19.aByteArray1952[var22] + var15[var19.aShortArray1932[var22]]);
               }

               this.aShortArray1930[this.anInt1929] = (short)var14[var19.aShortArray1930[var22]];
               this.aShortArray1931[this.anInt1929] = (short)var14[var19.aShortArray1931[var22]];
               this.aShortArray1932[this.anInt1929] = (short)var14[var19.aShortArray1932[var22]];
               this.aShortArray1917[this.anInt1929] = var18;
               this.aShortArray1940[this.anInt1929] = var19.aShortArray1940[var22];
               ++this.anInt1929;
            }

            if(var19.aClass182Array1960 != null) {
               for(var22 = 0; var22 < var19.aClass182Array1960.length; ++var22) {
                  var37 = var14[var19.aClass182Array1960[var22].anInt2086 * -1235344453];
                  var24 = var14[var19.aClass182Array1960[var22].anInt2088 * -1119018737];
                  var25 = var14[var19.aClass182Array1960[var22].anInt2084 * 724817697];
                  this.aClass182Array1960[var3] = var19.aClass182Array1960[var22].method2685(var19.aClass182Array1960[var22].anInt2081 * -664328139 + var20, var37, var24, var25, (byte)-1);
                  ++var3;
               }
            }

            if(var19.aClass141Array1961 != null) {
               for(var22 = 0; var22 < var19.aClass141Array1961.length; ++var22) {
                  var37 = var14[var19.aClass141Array1961[var22].anInt1667 * -1043750635];
                  this.aClass141Array1961[var4] = var19.aClass141Array1961[var22].method1653(var37, (byte)3);
                  ++var4;
               }
            }
         }
      }

      this.anInt1919 = this.anInt1918;
      int var33;
      if(this.anInt1951 > 0) {
         Class172.method2159(var32, this.aFloatArray1914, this.aFloatArray1928, 971372758);
         var17 = 0;

         for(var33 = 0; var17 < this.anInt1918; ++var17) {
            this.anIntArray1923[var17] = var33;
            var33 += var31[var17];
         }
      }

      var17 = 0;

      for(var33 = 0; var17 < var2; ++var17) {
         short var34 = (short)(1 << var17);
         Class170 var35 = var1[var17];
         if(var35 != null) {
            int var36;
            if(var9) {
               for(var36 = 0; var36 < var35.anInt1929; ++var33) {
                  this.aShortArray1943[var33] = var35.aShortArray1943 != null?var35.aShortArray1943[var36]:-1;
                  if(this.aShortArray1943[var33] > -1 && this.aShortArray1943[var33] < 32766) {
                     this.aShortArray1943[var33] = (short)(this.aShortArray1943[var33] + this.anInt1947);
                  }

                  ++var36;
               }
            }

            for(var36 = 0; var36 < var35.anInt1947; ++var36) {
               byte var38 = this.aByteArray1948[this.anInt1947] = var35.aByteArray1948[var36];
               if(var38 == 0) {
                  this.aShortArray1944[this.anInt1947] = (short)this.method2130(var35, var35.aShortArray1944[var36], var34);
                  this.aShortArray1927[this.anInt1947] = (short)this.method2130(var35, var35.aShortArray1927[var36], var34);
                  this.aShortArray1953[this.anInt1947] = (short)this.method2130(var35, var35.aShortArray1953[var36], var34);
               } else if(var38 >= 1 && var38 <= 3) {
                  this.aShortArray1944[this.anInt1947] = var35.aShortArray1944[var36];
                  this.aShortArray1927[this.anInt1947] = var35.aShortArray1927[var36];
                  this.aShortArray1953[this.anInt1947] = var35.aShortArray1953[var36];
                  this.anIntArray1945[this.anInt1947] = var35.anIntArray1945[var36];
                  this.anIntArray1935[this.anInt1947] = var35.anIntArray1935[var36];
                  this.anIntArray1954[this.anInt1947] = var35.anIntArray1954[var36];
                  this.aByteArray1958[this.anInt1947] = var35.aByteArray1958[var36];
                  this.aByteArray1959[this.anInt1947] = var35.aByteArray1959[var36];
                  this.anIntArray1955[this.anInt1947] = var35.anIntArray1955[var36];
               } else if(var38 == 2) {
                  this.anIntArray1956[this.anInt1947] = var35.anIntArray1956[var36];
                  this.anIntArray1957[this.anInt1947] = var35.anIntArray1957[var36];
               }

               ++this.anInt1947;
            }
         }
      }

   }

   final int method2130(Class170 var1, int var2, short var3) {
      int var4 = var1.anIntArray1920[var2];
      int var5 = var1.anIntArray1921[var2];
      int var6 = var1.anIntArray1939[var2];

      for(int var7 = 0; var7 < this.anInt1918; ++var7) {
         if(var4 == this.anIntArray1920[var7] && var5 == this.anIntArray1921[var7] && var6 == this.anIntArray1939[var7]) {
            this.aShortArray1925[var7] |= var3;
            return var7;
         }
      }

      this.anIntArray1920[this.anInt1918] = var4;
      this.anIntArray1921[this.anInt1918] = var5;
      this.anIntArray1939[this.anInt1918] = var6;
      this.aShortArray1925[this.anInt1918] = var3;
      this.anIntArray1924[this.anInt1918] = var1.anIntArray1924 != null?var1.anIntArray1924[var2]:-1;
      return this.anInt1918++;
   }

   void method2131(RSByteBuffer var1, RSByteBuffer var2, RSByteBuffer var3) {
      short var4 = 0;
      short var5 = 0;
      short var6 = 0;
      short var7 = 0;

      for(int var8 = 0; var8 < this.anInt1929; ++var8) {
         int var9 = var2.readUnsignedByte(-1209522551);
         int var10 = var9 & 7;
         if(var10 == 1) {
            this.aShortArray1930[var8] = var4 = (short)(var1.readUnsignedSmart(245077510) + var7);
            this.aShortArray1931[var8] = var5 = (short)(var1.readUnsignedSmart(1854653299) + var4);
            this.aShortArray1932[var8] = var6 = (short)(var1.readUnsignedSmart(1748514274) + var5);
            var7 = var6;
            if(var4 > this.anInt1919) {
               this.anInt1919 = var4;
            }

            if(var5 > this.anInt1919) {
               this.anInt1919 = var5;
            }

            if(var6 > this.anInt1919) {
               this.anInt1919 = var6;
            }
         }

         if(var10 == 2) {
            var5 = var6;
            var6 = (short)(var1.readUnsignedSmart(276671371) + var7);
            var7 = var6;
            this.aShortArray1930[var8] = var4;
            this.aShortArray1931[var8] = var5;
            this.aShortArray1932[var8] = var6;
            if(var6 > this.anInt1919) {
               this.anInt1919 = var6;
            }
         }

         if(var10 == 3) {
            var4 = var6;
            var6 = (short)(var1.readUnsignedSmart(-203565491) + var7);
            var7 = var6;
            this.aShortArray1930[var8] = var4;
            this.aShortArray1931[var8] = var5;
            this.aShortArray1932[var8] = var6;
            if(var6 > this.anInt1919) {
               this.anInt1919 = var6;
            }
         }

         if(var10 == 4) {
            short var11 = var4;
            var4 = var5;
            var5 = var11;
            var6 = (short)(var1.readUnsignedSmart(1471886096) + var7);
            var7 = var6;
            this.aShortArray1930[var8] = var4;
            this.aShortArray1931[var8] = var11;
            this.aShortArray1932[var8] = var6;
            if(var6 > this.anInt1919) {
               this.anInt1919 = var6;
            }
         }

         if(this.anInt1951 > 0 && (var9 & 8) != 0) {
            this.aByteArray1933[var8] = (byte)var3.readUnsignedByte(-570526908);
            this.aByteArray1934[var8] = (byte)var3.readUnsignedByte(-1598114173);
            this.aByteArray1952[var8] = (byte)var3.readUnsignedByte(-621291931);
         }
      }

      ++this.anInt1919;
   }

   void method2132(RSByteBuffer var1, RSByteBuffer var2, RSByteBuffer var3, RSByteBuffer var4, RSByteBuffer var5, RSByteBuffer var6) {
      for(int var7 = 0; var7 < this.anInt1947; ++var7) {
         int var8 = this.aByteArray1948[var7] & 255;
         if(var8 == 0) {
            this.aShortArray1944[var7] = (short)var1.readUnsignedShort(786663197);
            this.aShortArray1927[var7] = (short)var1.readUnsignedShort(162513727);
            this.aShortArray1953[var7] = (short)var1.readUnsignedShort(988360915);
         }

         if(var8 == 1) {
            this.aShortArray1944[var7] = (short)var2.readUnsignedShort(1261373686);
            this.aShortArray1927[var7] = (short)var2.readUnsignedShort(518363813);
            this.aShortArray1953[var7] = (short)var2.readUnsignedShort(1775786003);
            if(this.anInt1942 < 15) {
               this.anIntArray1945[var7] = var3.readUnsignedShort(246940650);
               if(this.anInt1942 < 14) {
                  this.anIntArray1935[var7] = var3.readUnsignedShort(513190740);
               } else {
                  this.anIntArray1935[var7] = var3.read24BitInt(742041327);
               }

               this.anIntArray1954[var7] = var3.readUnsignedShort(678300143);
            } else {
               this.anIntArray1945[var7] = var3.read24BitInt(742041327);
               this.anIntArray1935[var7] = var3.read24BitInt(742041327);
               this.anIntArray1954[var7] = var3.read24BitInt(742041327);
            }

            this.aByteArray1958[var7] = var4.readByte((byte)106);
            this.aByteArray1959[var7] = var5.readByte((byte)110);
            this.anIntArray1955[var7] = var6.readByte((byte)104);
         }

         if(var8 == 2) {
            this.aShortArray1944[var7] = (short)var2.readUnsignedShort(1385597642);
            this.aShortArray1927[var7] = (short)var2.readUnsignedShort(1623016226);
            this.aShortArray1953[var7] = (short)var2.readUnsignedShort(783804444);
            if(this.anInt1942 < 15) {
               this.anIntArray1945[var7] = var3.readUnsignedShort(1135129717);
               if(this.anInt1942 < 14) {
                  this.anIntArray1935[var7] = var3.readUnsignedShort(1127367729);
               } else {
                  this.anIntArray1935[var7] = var3.read24BitInt(742041327);
               }

               this.anIntArray1954[var7] = var3.readUnsignedShort(1419183712);
            } else {
               this.anIntArray1945[var7] = var3.read24BitInt(742041327);
               this.anIntArray1935[var7] = var3.read24BitInt(742041327);
               this.anIntArray1954[var7] = var3.read24BitInt(742041327);
            }

            this.aByteArray1958[var7] = var4.readByte((byte)77);
            this.aByteArray1959[var7] = var5.readByte((byte)71);
            this.anIntArray1955[var7] = var6.readByte((byte)102);
            this.anIntArray1956[var7] = var6.readByte((byte)23);
            this.anIntArray1957[var7] = var6.readByte((byte)73);
         }

         if(var8 == 3) {
            this.aShortArray1944[var7] = (short)var2.readUnsignedShort(781398826);
            this.aShortArray1927[var7] = (short)var2.readUnsignedShort(1357027534);
            this.aShortArray1953[var7] = (short)var2.readUnsignedShort(1098913380);
            if(this.anInt1942 < 15) {
               this.anIntArray1945[var7] = var3.readUnsignedShort(1822296445);
               if(this.anInt1942 < 14) {
                  this.anIntArray1935[var7] = var3.readUnsignedShort(1272439972);
               } else {
                  this.anIntArray1935[var7] = var3.read24BitInt(742041327);
               }

               this.anIntArray1954[var7] = var3.readUnsignedShort(357664467);
            } else {
               this.anIntArray1945[var7] = var3.read24BitInt(742041327);
               this.anIntArray1935[var7] = var3.read24BitInt(742041327);
               this.anIntArray1954[var7] = var3.read24BitInt(742041327);
            }

            this.aByteArray1958[var7] = var4.readByte((byte)109);
            this.aByteArray1959[var7] = var5.readByte((byte)100);
            this.anIntArray1955[var7] = var6.readByte((byte)64);
         }
      }

   }

   public int method2133(int var1, int var2, int var3, byte var4, byte var5, short var6, byte var7, short var8) {
      this.aShortArray1930[this.anInt1929] = (short)var1;
      this.aShortArray1931[this.anInt1929] = (short)var2;
      this.aShortArray1932[this.anInt1929] = (short)var3;
      this.aByteArray1936[this.anInt1929] = var4;
      this.aShortArray1943[this.anInt1929] = (short)var5;
      this.aShortArray1940[this.anInt1929] = var6;
      this.aByteArray1938[this.anInt1929] = var7;
      this.aShortArray1941[this.anInt1929] = var8;
      return this.anInt1929++;
   }

   public byte method2134(short var1, short var2, short var3) {
      if(this.anInt1947 >= 255) {
         throw new IllegalStateException();
      } else {
         this.aByteArray1948[this.anInt1947] = 0;
         this.aShortArray1944[this.anInt1947] = var1;
         this.aShortArray1927[this.anInt1947] = var2;
         this.aShortArray1953[this.anInt1947] = var3;
         return (byte)(this.anInt1947++);
      }
   }

   public byte method2135(short var1, short var2, short var3, short var4, short var5, short var6, byte var7, byte var8, byte var9) {
      if(this.anInt1947 >= 255) {
         throw new IllegalStateException();
      } else {
         this.aByteArray1948[this.anInt1947] = 3;
         this.aShortArray1944[this.anInt1947] = var1;
         this.aShortArray1927[this.anInt1947] = var2;
         this.aShortArray1953[this.anInt1947] = var3;
         this.anIntArray1945[this.anInt1947] = var4;
         this.anIntArray1935[this.anInt1947] = var5;
         this.anIntArray1954[this.anInt1947] = var6;
         this.aByteArray1958[this.anInt1947] = var7;
         this.aByteArray1959[this.anInt1947] = var8;
         this.anIntArray1955[this.anInt1947] = var9;
         return (byte)(this.anInt1947++);
      }
   }

   public int[][] method2136(boolean var1) {
      int[] var2 = new int[400];
      int var3 = 0;
      int var4 = var1?this.anInt1918:this.anInt1919;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.anIntArray1924[var5];
         if(var6 >= 0) {
            ++var2[var6];
            if(var6 > var3) {
               var3 = var6;
            }
         }
      }

      int[][] var8 = new int[var3 + 1][];

      for(var6 = 0; var6 <= var3; ++var6) {
         var8[var6] = new int[var2[var6]];
         var2[var6] = 0;
      }

      for(var6 = 0; var6 < var4; ++var6) {
         int var7 = this.anIntArray1924[var6];
         if(var7 >= 0) {
            var8[var7][var2[var7]++] = var6;
         }
      }

      return var8;
   }

   public int[][] method2137() {
      int[] var1 = new int[256];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < this.anInt1929; ++var3) {
         var4 = this.anIntArray1949[var3];
         if(var4 >= 0) {
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var6 = new int[var2 + 1][];

      for(var4 = 0; var4 <= var2; ++var4) {
         var6[var4] = new int[var1[var4]];
         var1[var4] = 0;
      }

      for(var4 = 0; var4 < this.anInt1929; ++var4) {
         int var5 = this.anIntArray1949[var4];
         if(var5 >= 0) {
            var6[var5][var1[var5]++] = var4;
         }
      }

      return var6;
   }

   public void method2138(short var1, short var2) {
      for(int var3 = 0; var3 < this.anInt1929; ++var3) {
         if(this.aShortArray1940[var3] == var1) {
            this.aShortArray1940[var3] = var2;
         }
      }

   }

   public void method2139(short var1, short var2) {
      if(this.aShortArray1941 != null) {
         for(int var3 = 0; var3 < this.anInt1929; ++var3) {
            if(this.aShortArray1941[var3] == var1) {
               this.aShortArray1941[var3] = var2;
            }
         }

      }
   }

   public void method2140(int var1, int var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if(var3 != 0) {
         var4 = Class443.anIntArray4895[var3];
         var5 = Class443.anIntArray4896[var3];

         for(var6 = 0; var6 < this.anInt1918; ++var6) {
            var7 = this.anIntArray1921[var6] * var4 + this.anIntArray1920[var6] * var5 >> 14;
            this.anIntArray1921[var6] = this.anIntArray1921[var6] * var5 - this.anIntArray1920[var6] * var4 >> 14;
            this.anIntArray1920[var6] = var7;
         }
      }

      if(var1 != 0) {
         var4 = Class443.anIntArray4895[var1];
         var5 = Class443.anIntArray4896[var1];

         for(var6 = 0; var6 < this.anInt1918; ++var6) {
            var7 = this.anIntArray1921[var6] * var5 - this.anIntArray1939[var6] * var4 >> 14;
            this.anIntArray1939[var6] = this.anIntArray1921[var6] * var4 + this.anIntArray1939[var6] * var5 >> 14;
            this.anIntArray1921[var6] = var7;
         }
      }

      if(var2 != 0) {
         var4 = Class443.anIntArray4895[var2];
         var5 = Class443.anIntArray4896[var2];

         for(var6 = 0; var6 < this.anInt1918; ++var6) {
            var7 = this.anIntArray1939[var6] * var4 + this.anIntArray1920[var6] * var5 >> 14;
            this.anIntArray1939[var6] = this.anIntArray1939[var6] * var5 - this.anIntArray1920[var6] * var4 >> 14;
            this.anIntArray1920[var6] = var7;
         }
      }

   }

   public void method2141(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt1918; ++var4) {
         this.anIntArray1920[var4] += var1;
         this.anIntArray1921[var4] += var2;
         this.anIntArray1939[var4] += var3;
      }

   }

   public int method2142(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt1918; ++var4) {
         if(this.anIntArray1920[var4] == var1 && this.anIntArray1921[var4] == var2 && this.anIntArray1939[var4] == var3) {
            return var4;
         }
      }

      this.anIntArray1920[this.anInt1918] = var1;
      this.anIntArray1921[this.anInt1918] = var2;
      this.anIntArray1939[this.anInt1918] = var3;
      this.anInt1919 = this.anInt1918 + 1;
      return this.anInt1918++;
   }

   public int method2143(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt1918; ++var4) {
         if(this.anIntArray1920[var4] == var1 && this.anIntArray1921[var4] == var2 && this.anIntArray1939[var4] == var3) {
            return var4;
         }
      }

      this.anIntArray1920[this.anInt1918] = var1;
      this.anIntArray1921[this.anInt1918] = var2;
      this.anIntArray1939[this.anInt1918] = var3;
      this.anInt1919 = this.anInt1918 + 1;
      return this.anInt1918++;
   }

   public int method2144(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt1918; ++var4) {
         if(this.anIntArray1920[var4] == var1 && this.anIntArray1921[var4] == var2 && this.anIntArray1939[var4] == var3) {
            return var4;
         }
      }

      this.anIntArray1920[this.anInt1918] = var1;
      this.anIntArray1921[this.anInt1918] = var2;
      this.anIntArray1939[this.anInt1918] = var3;
      this.anInt1919 = this.anInt1918 + 1;
      return this.anInt1918++;
   }

   public int[][] method2145() {
      int[] var1 = new int[256];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < this.aClass185Array1962.length; ++var3) {
         var4 = this.aClass185Array1962[var3].anInt2120 * -331338413;
         if(var4 >= 0) {
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var6 = new int[var2 + 1][];

      for(var4 = 0; var4 <= var2; ++var4) {
         var6[var4] = new int[var1[var4]];
         var1[var4] = 0;
      }

      for(var4 = 0; var4 < this.aClass185Array1962.length; ++var4) {
         int var5 = this.aClass185Array1962[var4].anInt2120 * -331338413;
         if(var5 >= 0) {
            var6[var5][var1[var5]++] = var4;
         }
      }

      return var6;
   }

   public static Class170 method2146(Class466 var0, int var1, int var2) {
      byte[] var3 = var0.method5536(var1, var2, (byte)18);
      return var3 == null?null:new Class170(var3);
   }

   public void method2147(float var1) {
      int var2;
      for(var2 = 0; var2 < this.anInt1918; ++var2) {
         this.anIntArray1920[var2] = (int)((float)this.anIntArray1920[var2] * var1);
         this.anIntArray1921[var2] = (int)((float)this.anIntArray1921[var2] * var1);
         this.anIntArray1939[var2] = (int)((float)this.anIntArray1939[var2] * var1);
      }

      if(this.anInt1947 > 0 && this.anIntArray1945 != null) {
         for(var2 = 0; var2 < this.anIntArray1945.length; ++var2) {
            this.anIntArray1945[var2] = (int)((float)this.anIntArray1945[var2] * var1);
            this.anIntArray1935[var2] = (int)((float)this.anIntArray1935[var2] * var1);
            if(this.aByteArray1948[var2] != 1) {
               this.anIntArray1954[var2] = (int)((float)this.anIntArray1954[var2] * var1);
            }
         }
      }

   }

   public Class170(int var1, int var2, int var3) {
      this.anIntArray1920 = new int[var1];
      this.anIntArray1921 = new int[var1];
      this.anIntArray1939 = new int[var1];
      this.anIntArray1924 = new int[var1];
      this.aShortArray1930 = new short[var2];
      this.aShortArray1931 = new short[var2];
      this.aShortArray1932 = new short[var2];
      this.aByteArray1936 = new byte[var2];
      this.aByteArray1937 = new byte[var2];
      this.aByteArray1938 = new byte[var2];
      this.aShortArray1943 = new short[var2];
      this.aShortArray1940 = new short[var2];
      this.aShortArray1941 = new short[var2];
      this.anIntArray1949 = new int[var2];
      if(var3 > 0) {
         this.aByteArray1948 = new byte[var3];
         this.aShortArray1944 = new short[var3];
         this.aShortArray1927 = new short[var3];
         this.aShortArray1953 = new short[var3];
         this.anIntArray1945 = new int[var3];
         this.anIntArray1935 = new int[var3];
         this.anIntArray1954 = new int[var3];
         this.aByteArray1958 = new byte[var3];
         this.aByteArray1959 = new byte[var3];
         this.anIntArray1955 = new int[var3];
         this.anIntArray1956 = new int[var3];
         this.anIntArray1957 = new int[var3];
      }

   }

   public void method2148(int var1) {
      int var2;
      for(var2 = 0; var2 < this.anInt1918; ++var2) {
         this.anIntArray1920[var2] <<= var1;
         this.anIntArray1921[var2] <<= var1;
         this.anIntArray1939[var2] <<= var1;
      }

      if(this.anInt1947 > 0 && this.anIntArray1945 != null) {
         for(var2 = 0; var2 < this.anIntArray1945.length; ++var2) {
            this.anIntArray1945[var2] <<= var1;
            this.anIntArray1935[var2] <<= var1;
            if(this.aByteArray1948[var2] != 1) {
               this.anIntArray1954[var2] <<= var1;
            }
         }
      }

   }

   public void method2149(int var1, int var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if(var3 != 0) {
         var4 = Class443.anIntArray4895[var3];
         var5 = Class443.anIntArray4896[var3];

         for(var6 = 0; var6 < this.anInt1918; ++var6) {
            var7 = this.anIntArray1921[var6] * var4 + this.anIntArray1920[var6] * var5 >> 14;
            this.anIntArray1921[var6] = this.anIntArray1921[var6] * var5 - this.anIntArray1920[var6] * var4 >> 14;
            this.anIntArray1920[var6] = var7;
         }
      }

      if(var1 != 0) {
         var4 = Class443.anIntArray4895[var1];
         var5 = Class443.anIntArray4896[var1];

         for(var6 = 0; var6 < this.anInt1918; ++var6) {
            var7 = this.anIntArray1921[var6] * var5 - this.anIntArray1939[var6] * var4 >> 14;
            this.anIntArray1939[var6] = this.anIntArray1921[var6] * var4 + this.anIntArray1939[var6] * var5 >> 14;
            this.anIntArray1921[var6] = var7;
         }
      }

      if(var2 != 0) {
         var4 = Class443.anIntArray4895[var2];
         var5 = Class443.anIntArray4896[var2];

         for(var6 = 0; var6 < this.anInt1918; ++var6) {
            var7 = this.anIntArray1939[var6] * var4 + this.anIntArray1920[var6] * var5 >> 14;
            this.anIntArray1939[var6] = this.anIntArray1939[var6] * var5 - this.anIntArray1920[var6] * var4 >> 14;
            this.anIntArray1920[var6] = var7;
         }
      }

   }

   public int method2150(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt1918; ++var4) {
         if(this.anIntArray1920[var4] == var1 && this.anIntArray1921[var4] == var2 && this.anIntArray1939[var4] == var3) {
            return var4;
         }
      }

      this.anIntArray1920[this.anInt1918] = var1;
      this.anIntArray1921[this.anInt1918] = var2;
      this.anIntArray1939[this.anInt1918] = var3;
      this.anInt1919 = this.anInt1918 + 1;
      return this.anInt1918++;
   }
}
