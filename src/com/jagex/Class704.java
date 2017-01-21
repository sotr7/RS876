package com.jagex;

import com.jagex.Class103;
import com.jagex.Class168;
import com.jagex.Class177;
import com.jagex.Class178;
import com.jagex.Class204;
import com.jagex.Class206;
import com.jagex.Class215;
import com.jagex.Class24;
import com.jagex.InterfaceDef;
import com.jagex.Class260;
import com.jagex.Class415;
import com.jagex.Class424;
import com.jagex.Class438;
import com.jagex.Class451;
import com.jagex.Class461;
import com.jagex.Class465;
import com.jagex.Class475;
import com.jagex.Class481;
import com.jagex.Class506;
import com.jagex.Class52;
import com.jagex.Class526_Sub24;
import com.jagex.RSByteBuffer;
import com.jagex.Buffer;
import com.jagex.Class526_Sub42;
import com.jagex.Class561;
import com.jagex.Class581;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class640;
import com.jagex.Class681;
import com.jagex.Class699;
import com.jagex.client;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class704 {
   public static final int anInt8811 = 2;
   public static final int anInt8812 = 0;
   public static final int anInt8819 = 1;
   Class206 aClass206_8823;
   int anInt8815;
   int anInt8814;
   int anInt8820 = 0;
   boolean aBool8809 = false;
   int anInt8816;
   int anInt8813;
   int anInt8817;
   boolean aBool8818 = false;
   boolean aBool8821 = false;
   Class699 aClass699_8822;
   Class699 aClass699_8810;

   final boolean method8216(int var1) {
      if(null != this.aClass206_8823) {
         boolean var2 = this.aClass699_8822.method8166(Class461.aClass40_Sub15_5206, this.aClass206_8823, this.anInt8816 * 507434409, -1732048289 * this.anInt8817, this.aClass206_8823.anIntArray2232, 43392617);
         if(var2 && this.aBool8821 && null != this.aClass206_8823.anIntArray2225) {
            this.aClass699_8810.method8166(Class461.aClass40_Sub15_5206, this.aClass206_8823, this.anInt8816 * 507434409, -1732048289 * this.anInt8817, this.aClass206_8823.anIntArray2225, 43392617);
         }

         return var2;
      } else {
         return false;
      }
   }

   public final void method8217(int var1) {
      this.method8225(var1, 0, 0, false, -1768573693);
   }

   public final boolean method8218(byte var1) {
      return this.aClass206_8823 != null;
   }

   public final Class206 method8219(byte var1) {
      return this.aClass206_8823;
   }

   public final int method8220(int var1) {
      return this.aClass206_8823 != null?-94319135 * this.aClass206_8823.anInt2222:-1;
   }

   public final int method8221(byte var1) {
      if(this.method8216(-2132491042)) {
         int var2 = 0;
         if(this.method8216(-2132491042)) {
            var2 |= -329479277 * this.aClass699_8822.anInt8769;
            if(this.aBool8821 && null != this.aClass206_8823.anIntArray2225) {
               var2 |= -329479277 * this.aClass699_8810.anInt8769;
            }
         }

         return var2;
      } else {
         return 0;
      }
   }

   public final void method8222(int var1, int var2, int var3) {
      this.method8225(var1, var2, 0, false, -676912022);
   }

   public final void method8223(int var1, boolean var2, byte var3) {
      this.method8225(var1, 0, 0, var2, -385798773);
   }

   public final void method8224(int var1, boolean var2, boolean var3, int var4) {
      this.method8226(var1, 0, 0, var2, var3, 1034532305);
   }

   public final void method8225(int var1, int var2, int var3, boolean var4, int var5) {
      this.method8226(var1, var2, var3, var4, false, 247350113);
   }

   final void method8226(int var1, int var2, int var3, boolean var4, boolean var5, int var6) {
      if(var1 != this.method8220(-2101856722)) {
         if(var1 == -1) {
            this.aClass206_8823 = null;
         } else {
            if(this.aClass206_8823 != null && var1 == -94319135 * this.aClass206_8823.anInt2222) {
               if(this.aClass206_8823.anInt2238 * 1945727809 == 0) {
                  return;
               }
            } else {
               this.aClass206_8823 = (Class206)Class461.aClass40_Sub15_5206.method89(var1, -1874324967);
               if(this.aClass206_8823 == null || this.aClass206_8823.anIntArray2232 == null) {
                  this.aClass206_8823 = null;
                  return;
               }
            }

            this.anInt8815 = 0;
            this.anInt8814 = -69291909 * var2;
            this.anInt8820 = -1814870601 * var3;
            this.aBool8809 = var5;
            if(var4) {
               this.anInt8816 = (int)(Math.random() * (double)this.aClass206_8823.anIntArray2232.length) * 880058009;
               this.anInt8813 = (int)(Math.random() * (double)this.aClass206_8823.anIntArray2226[this.anInt8816 * 507434409]) * 1428648123;
            } else {
               this.anInt8816 = 0;
               this.anInt8813 = 0;
            }

            this.anInt8817 = -1329868385 + this.anInt8816 * 1474866423;
            if(-1732048289 * this.anInt8817 < 0 || this.anInt8817 * -1732048289 >= this.aClass206_8823.anIntArray2232.length) {
               this.anInt8817 = 1329868385;
            }

            if(0 == this.anInt8814 * -1009406285) {
               this.method8240(this.aClass206_8823, this.anInt8816 * 507434409, 1708417431);
            }

            this.aBool8818 = false;
         }

         this.method8241((byte)-24);
      }

   }

   public final boolean method8227(byte var1) {
      return -1009406285 * this.anInt8814 != 0;
   }

   public final int method8228(byte var1) {
      return -1009406285 * this.anInt8814;
   }

   public final boolean method8229() {
      return -1009406285 * this.anInt8814 != 0;
   }

   public final void method8230(int var1) {
      this.anInt8814 = var1 * -69291909;
   }

   public final void method8231(Class168 var1, int var2, int var3) {
      if(this.aClass206_8823 != null) {
         if(null != this.aClass206_8823.anIntArray2232 && this.method8216(-2132491042)) {
            var1.method1962(this.aClass699_8822.aClass526_Sub21_Sub11_8770, -212153941 * this.aClass699_8822.anInt8768, this.aClass699_8822.aClass526_Sub21_Sub11_8771, this.aClass699_8822.anInt8772 * 1819333767, this.anInt8813 * 1202803827, this.aClass206_8823.anIntArray2226[this.anInt8816 * 507434409], var2, this.aClass206_8823.aBool2239);
            if(this.aBool8821 && null != this.aClass206_8823.anIntArray2225 && this.aClass699_8810.aBool8767) {
               var1.method1962(this.aClass699_8810.aClass526_Sub21_Sub11_8770, this.aClass699_8810.anInt8768 * -212153941, this.aClass699_8810.aClass526_Sub21_Sub11_8771, 1819333767 * this.aClass699_8810.anInt8772, this.anInt8813 * 1202803827, this.aClass206_8823.anIntArray2226[507434409 * this.anInt8816], var2, this.aClass206_8823.aBool2239);
            }
         }

      }
   }

   public final boolean method8232() {
      return this.aBool8818;
   }

   public final void method8233(Class168 var1, int var2) {
      if(null != this.aClass206_8823.anIntArray2232 && this.method8216(-2132491042)) {
         var1.method1990(this.aClass699_8822.aClass526_Sub21_Sub11_8770, -212153941 * this.aClass699_8822.anInt8768);
         if(this.aBool8821 && this.aClass206_8823.anIntArray2225 != null && this.aClass699_8810.aBool8767) {
            var1.method1990(this.aClass699_8810.aClass526_Sub21_Sub11_8770, this.aClass699_8810.anInt8768 * -212153941);
         }
      }

   }

   public final boolean method8234(int var1, byte var2) {
      return this.aClass206_8823 == null | (var1 -= this.anInt8814 * -1009406285) <= 0?false:this.aClass206_8823.aBool2223 | var1 + this.anInt8813 * 1202803827 > this.aClass206_8823.anIntArray2226[507434409 * this.anInt8816];
   }

   public final void method8235(byte var1) {
      this.anInt8815 = 0;
   }

   public final void method8236(int var1) {
      this.method8237(0, (short)8192);
   }

   public final void method8237(int var1, short var2) {
      this.anInt8816 = 0;
      this.anInt8817 = (this.aClass206_8823.anIntArray2232.length > 1?1:-1) * -1329868385;
      this.anInt8813 = 0;
      this.aBool8818 = false;
      this.anInt8814 = var1 * -69291909;
      this.anInt8815 = 0;
      if(null != this.aClass206_8823 & null != this.aClass206_8823.anIntArray2232) {
         this.method8240(this.aClass206_8823, 507434409 * this.anInt8816, 1647158423);
         this.method8241((byte)15);
      }

   }

   public final boolean method8238(int var1) {
      return this.aClass206_8823 == null | (var1 -= this.anInt8814 * -1009406285) <= 0?false:this.aClass206_8823.aBool2223 | var1 + this.anInt8813 * 1202803827 > this.aClass206_8823.anIntArray2226[507434409 * this.anInt8816];
   }

   public final int method8239() {
      return this.aClass206_8823 != null?-94319135 * this.aClass206_8823.anInt2222:-1;
   }

   void method8240(Class206 var1, int var2, int var3) {
   }

   final void method8241(byte var1) {
      this.aClass699_8822.method8167(-885763836);
      if(this.aBool8821) {
         this.aClass699_8810.method8167(-4816794);
      }

   }

   void method8242(Class206 var1, int var2) {
   }

   public final boolean method8243() {
      return this.aClass206_8823 != null;
   }

   public final void method8244() {
      this.anInt8815 = 0;
   }

   public final int method8245() {
      return -1009406285 * this.anInt8814;
   }

   public final void method8246(int var1, byte var2) {
      this.method8225(var1, 0, 0, false, 617773105);
   }

   public final boolean method8247(int var1, byte var2) {
      if(this.aClass206_8823 != null && 0 != var1) {
         if(-1009406285 * this.anInt8814 > 0) {
            if(-1009406285 * this.anInt8814 > var1) {
               this.anInt8814 -= var1 * -69291909;
               return false;
            }

            var1 -= this.anInt8814 * -1009406285;
            this.anInt8814 = 0;
            this.method8240(this.aClass206_8823, 507434409 * this.anInt8816, 1825602559);
         }

         var1 += this.anInt8813 * 1202803827;
         boolean var3 = this.aClass206_8823.aBool2223 | Class206.aBool2224;
         if(var1 > 100 && this.aClass206_8823.anInt2243 * -707488625 > 0) {
            int var4;
            for(var4 = this.aClass206_8823.anIntArray2232.length - this.aClass206_8823.anInt2243 * -707488625; this.anInt8816 * 507434409 < var4 && var1 > this.aClass206_8823.anIntArray2226[507434409 * this.anInt8816]; this.anInt8816 += 880058009) {
               var1 -= this.aClass206_8823.anIntArray2226[this.anInt8816 * 507434409];
            }

            if(this.anInt8816 * 507434409 >= var4) {
               int var5 = 0;

               for(int var6 = var4; var6 < this.aClass206_8823.anIntArray2232.length; ++var6) {
                  var5 += this.aClass206_8823.anIntArray2226[var6];
               }

               if(this.anInt8820 * -1806718969 == 0) {
                  this.anInt8815 += var1 / var5 * 699232793;
               }

               var1 %= var5;
            }

            this.anInt8817 = -1329868385 + this.anInt8816 * 1474866423;
            if(this.anInt8817 * -1732048289 >= this.aClass206_8823.anIntArray2232.length) {
               if(-1 == this.aClass206_8823.anInt2243 * -707488625 && this.aBool8809) {
                  this.anInt8817 = 0;
               } else {
                  this.anInt8817 -= 818283473 * this.aClass206_8823.anInt2243;
               }

               if(this.anInt8817 * -1732048289 < 0 || -1732048289 * this.anInt8817 >= this.aClass206_8823.anIntArray2232.length) {
                  this.anInt8817 = 1329868385;
               }
            }

            var3 = true;
         }

         while(var1 > this.aClass206_8823.anIntArray2226[507434409 * this.anInt8816]) {
            var3 = true;
            var1 -= this.aClass206_8823.anIntArray2226[(this.anInt8816 += 880058009) * 507434409 - 1];
            if(this.anInt8816 * 507434409 >= this.aClass206_8823.anIntArray2232.length) {
               if(-1 != this.aClass206_8823.anInt2243 * -707488625 && this.anInt8820 * -1806718969 != 2) {
                  this.anInt8816 -= this.aClass206_8823.anInt2243 * 1552485239;
                  if(0 == this.anInt8820 * -1806718969) {
                     this.anInt8815 += 699232793;
                  }
               }

               if(-1059468759 * this.anInt8815 >= -1192552155 * this.aClass206_8823.anInt2235 || 507434409 * this.anInt8816 < 0 || this.anInt8816 * 507434409 >= this.aClass206_8823.anIntArray2232.length) {
                  this.aBool8818 = true;
                  break;
               }
            }

            this.method8240(this.aClass206_8823, this.anInt8816 * 507434409, 1694203490);
            this.anInt8817 = 1474866423 * this.anInt8816 + -1329868385;
            if(-1732048289 * this.anInt8817 >= this.aClass206_8823.anIntArray2232.length) {
               if(-707488625 * this.aClass206_8823.anInt2243 == -1 && this.aBool8809) {
                  this.anInt8817 = 0;
               } else {
                  this.anInt8817 -= this.aClass206_8823.anInt2243 * 818283473;
               }

               if(this.anInt8817 * -1732048289 < 0 || this.anInt8817 * -1732048289 >= this.aClass206_8823.anIntArray2232.length) {
                  this.anInt8817 = 1329868385;
               }
            }
         }

         this.anInt8813 = var1 * 1428648123;
         if(var3) {
            this.method8241((byte)-77);
         }

         return var3;
      } else {
         return false;
      }
   }

   public final void method8248(Class168 var1, int var2, int var3, int var4) {
      if(null != this.aClass206_8823.anIntArray2232 && this.method8216(-2132491042)) {
         var1.method1963(this.aClass699_8822.aClass526_Sub21_Sub11_8770, this.aClass699_8822.anInt8768 * -212153941, this.aClass699_8822.aClass526_Sub21_Sub11_8771, this.aClass699_8822.anInt8772 * 1819333767, this.anInt8813 * 1202803827, this.aClass206_8823.anIntArray2226[507434409 * this.anInt8816], var2, var3, this.aClass206_8823.aBool2239, (int[])null);
         if(this.aBool8821 && null != this.aClass206_8823.anIntArray2225 && this.aClass699_8810.aBool8767) {
            var1.method1963(this.aClass699_8810.aClass526_Sub21_Sub11_8770, -212153941 * this.aClass699_8810.anInt8768, this.aClass699_8810.aClass526_Sub21_Sub11_8771, this.aClass699_8810.anInt8772 * 1819333767, this.anInt8813 * 1202803827, this.aClass206_8823.anIntArray2226[this.anInt8816 * 507434409], var2, var3, this.aClass206_8823.aBool2239, (int[])null);
         }
      }

   }

   public final boolean method8249(int var1) {
      return this.aBool8818;
   }

   public final int method8250() {
      return -1009406285 * this.anInt8814;
   }

   public final void method8251(int var1) {
      this.method8225(var1, 0, 0, false, -1807560376);
   }

   public final void method8252(int var1, byte var2) {
      this.anInt8814 = var1 * -69291909;
   }

   Class704(boolean var1) {
      this.aBool8821 = var1;
      this.aClass699_8822 = new Class699();
      if(this.aBool8821) {
         this.aClass699_8810 = new Class699();
      } else {
         this.aClass699_8810 = null;
      }

   }

   public final boolean method8253() {
      return this.aBool8818;
   }

   public final boolean method8254() {
      return this.aBool8818;
   }

   public final void method8255(Class704 var1, byte var2) {
      this.aClass206_8823 = var1.aClass206_8823;
      this.aBool8818 = var1.aBool8818;
      this.aBool8821 = var1.aBool8821;
      this.anInt8814 = var1.anInt8814 * 1;
      this.anInt8815 = var1.anInt8815 * 1;
      this.anInt8816 = var1.anInt8816 * 1;
      this.anInt8817 = var1.anInt8817 * 1;
      this.anInt8813 = var1.anInt8813 * 1;
      this.method8241((byte)-24);
   }

   public final void method8256() {
      this.method8237(0, (short)8192);
   }

   public final void method8257() {
      this.method8237(0, (short)8192);
   }

   public final void method8258() {
      this.method8237(0, (short)8192);
   }

   public final void method8259(int var1) {
      this.anInt8816 = 0;
      this.anInt8817 = (this.aClass206_8823.anIntArray2232.length > 1?1:-1) * -1329868385;
      this.anInt8813 = 0;
      this.aBool8818 = false;
      this.anInt8814 = var1 * -69291909;
      this.anInt8815 = 0;
      if(null != this.aClass206_8823 & null != this.aClass206_8823.anIntArray2232) {
         this.method8240(this.aClass206_8823, 507434409 * this.anInt8816, 1885149641);
         this.method8241((byte)75);
      }

   }

   public final int method8260() {
      if(this.method8216(-2132491042)) {
         int var1 = 0;
         if(this.method8216(-2132491042)) {
            var1 |= -329479277 * this.aClass699_8822.anInt8769;
            if(this.aBool8821 && null != this.aClass206_8823.anIntArray2225) {
               var1 |= -329479277 * this.aClass699_8810.anInt8769;
            }
         }

         return var1;
      } else {
         return 0;
      }
   }

   final void method8261() {
      this.aClass699_8822.method8167(-769157655);
      if(this.aBool8821) {
         this.aClass699_8810.method8167(-1017355847);
      }

   }

   final void method8262() {
      this.aClass699_8822.method8167(-1797048189);
      if(this.aBool8821) {
         this.aClass699_8810.method8167(-91261507);
      }

   }

   final void method8263() {
      this.aClass699_8822.method8167(-338937896);
      if(this.aBool8821) {
         this.aClass699_8810.method8167(-1584921841);
      }

   }

   static final void method8264(Class681 var0, byte var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      if(-1 == var3) {
         throw new RuntimeException();
      } else {
         Class24 var5 = (Class24)Class465.aClass40_Sub17_5321.method89(var3, -933908072);
         if(var5.aClass454_234.getId() != var2) {
            throw new RuntimeException();
         } else {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.method701(Integer.valueOf(var4), (short)5890)?1:0;
         }
      }
   }

   public static void method8265(RSByteBuffer var0, int var1, byte var2) {
      Class526_Sub42 var3 = new Class526_Sub42();
      var3.anInt10799 = var0.readUnsignedByte(950707010) * -1889155731;
      var3.anInt10800 = var0.readInt((byte)5) * 613169825;
      var3.anIntArray10801 = new int[var3.anInt10799 * 1056443493];
      var3.anIntArray10798 = new int[1056443493 * var3.anInt10799];
      var3.aFieldArray10802 = new Field[1056443493 * var3.anInt10799];
      var3.anIntArray10805 = new int[var3.anInt10799 * 1056443493];
      var3.aMethodArray10804 = new Method[var3.anInt10799 * 1056443493];
      var3.aByteArrayArrayArray10803 = new byte[1056443493 * var3.anInt10799][][];

      for(int var4 = 0; var4 < var3.anInt10799 * 1056443493; ++var4) {
         try {
            int var5 = var0.readUnsignedByte(-8399090);
            String var6;
            String var7;
            int var8;
            if(0 != var5 && 1 != var5 && var5 != 2) {
               if(3 == var5 || var5 == 4) {
                  var6 = var0.readString(-747045135);
                  var7 = var0.readString(-1315475984);
                  var8 = var0.readUnsignedByte(-2125387448);
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.readString(-1225456241);
                  }

                  String var26 = var0.readString(-1357068777);
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if(3 == var5) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = var0.readInt((byte)5);
                        var11[var12] = new byte[var13];
                        var0.writeBytes(var11[var12], 0, var13, -1223264119);
                     }
                  }

                  var3.anIntArray10801[var4] = var5;
                  Class[] var27 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var27[var13] = Class178.method2665(var9[var13], (byte)-1);
                  }

                  Class var28 = Class178.method2665(var26, (byte)-1);
                  if(Class178.method2665(var6, (byte)-1).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = Class178.method2665(var6, (byte)-1).getDeclaredMethods();
                  Method[] var15 = var14;

                  for(int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if(var17.getName().equals(var7)) {
                        Class[] var18 = var17.getParameterTypes();
                        if(var27.length == var18.length) {
                           boolean var19 = true;

                           for(int var20 = 0; var20 < var27.length; ++var20) {
                              if(var18[var20] != var27[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if(var19 && var28 == var17.getReturnType()) {
                              var3.aMethodArray10804[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.aByteArrayArrayArray10803[var4] = var11;
               }
            } else {
               var6 = var0.readString(-883054690);
               var7 = var0.readString(868136339);
               var8 = 0;
               if(1 == var5) {
                  var8 = var0.readInt((byte)5);
               }

               var3.anIntArray10801[var4] = var5;
               var3.anIntArray10805[var4] = var8;
               if(Class178.method2665(var6, (byte)-1).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.aFieldArray10802[var4] = Class178.method2665(var6, (byte)-1).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var21) {
            var3.anIntArray10798[var4] = -1;
         } catch (SecurityException var22) {
            var3.anIntArray10798[var4] = -2;
         } catch (NullPointerException var23) {
            var3.anIntArray10798[var4] = -3;
         } catch (Exception var24) {
            var3.anIntArray10798[var4] = -4;
         } catch (Throwable var25) {
            var3.anIntArray10798[var4] = -5;
         }
      }

      Class52.aClass702_664.method8176(var3, -43955660);
   }

   static final void decodePlayerUpdateFlags(Buffer var0, int var1, Class639_Sub1_Sub2_Sub1_Sub1 player, int var3, int var4) {
      int var5;
      int[] var6;
      int[] var7;
      int var8;
      int var9;
      int var10;
      if((var3 & 524288) != 0) {
         var5 = var0.readUnsigned128Byte((byte)-103);
         var6 = new int[var5];
         var7 = new int[var5];

         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var0.readUnsignedLEShort((byte)107);
            if((var9 & '\uc000') == '\uc000') {
               var10 = var0.readUnsignedShort(1595162354);
               var6[var8] = var9 << 16 | var10;
            } else {
               var6[var8] = var9;
            }

            var7[var8] = var0.readUnsignedLEShort((byte)22);
         }

         player.method10774(var6, var7, -1637990165);
      }

      int var13;
      int var14;
      boolean var20;
      if((var3 & 4096) != 0) {
         var5 = var0.readUnsignedShort128((short)28253);
         var13 = var0.readInt((byte)5);
         if('\uffff' == var5) {
            var5 = -1;
         }

         var14 = var0.readUnsignedByte128((byte)36);
         var8 = var14 & 7;
         var9 = var14 >> 3 & 15;
         if(var9 == 15) {
            var9 = -1;
         }

         var20 = 1 == (var14 >> 7 & 1);
         player.method10777(var5, var13, var8, var9, var20, 1, 79056171);
      }

      if((var3 & 8388608) != 0) {
         player.aBool12184 = var0.readByteC((byte)8) == 1;
      }

      Class481 var18;
      Class424 var21;
      if((var3 & 262144) != 0) {
         player.anInterface4_11887.method28(-1519165566);
         var0.pos += 1603952830;
         var5 = var0.buffer[(var0.pos += 801976415) * 301018015 - 1] & 255;

         for(var13 = 0; var13 < var5; ++var13) {
            var14 = var0.readUnsignedByte(-1950062120);
            var18 = (Class481)Class561.findIdentifiable(Class481.method5758((byte)34), var14, (byte)-117);
            var21 = Class506.aClass97_Sub1_Sub1_5698.method8372(var0, var18, (byte)0);
            player.anInterface4_11887.method27(var21.anInt4793 * 1602756037, var21.anObject4794, 172204199);
         }
      }

      byte[] var15;
      RSByteBuffer var16;
      if((var3 & 8192) != 0) {
         var5 = var0.readUnsigned128Byte((byte)-89);
         var15 = new byte[var5];
         var16 = new RSByteBuffer(var15);
         var0.writeBytes(var15, 0, var5, -1565680750);
         Class103.aClass526_Sub36Array1264[var1] = var16;
         player.method10966(var16, (byte)-60);
      }

      if((var3 & 4) != 0) {
         var5 = var0.readUnsignedLEShort((byte)48);
         var13 = var0.readInt((byte)5);
         if(var5 == '\uffff') {
            var5 = -1;
         }

         var14 = var0.readUnsigned128Byte((byte)-108);
         var8 = var14 & 7;
         var9 = var14 >> 3 & 15;
         if(15 == var9) {
            var9 = -1;
         }

         var20 = 1 == (var14 >> 7 & 1);
         player.method10777(var5, var13, var8, var9, var20, 0, 79056171);
      }

      if(0 != (var3 & 64)) {
         player.anInt12172 = var0.readUnsignedLEShort((byte)118) * 1830298621;
         if(0 == -577323399 * player.anInt11943) {
            player.method10771(player.anInt12172 * 986534229, 388570738);
            player.anInt12172 = -1830298621;
         }
      }

      if(0 != (var3 & 512)) {
         var5 = var0.readUnsignedByte(370315890);
         var6 = new int[var5];
         var7 = new int[var5];
         int[] var19 = new int[var5];

         for(var9 = 0; var9 < var5; ++var9) {
            var6[var9] = var0.readBigSmart((byte)8);
            var7[var9] = var0.readUnsigned128Byte((byte)-100);
            var19[var9] = var0.readUnsignedShort(385967527);
         }

         Class640.method7638(player, var6, var7, var19, 1244879266);
      }

      String var17;
      if((var3 & 16384) != 0) {
         var17 = var0.readString(1029664322);
         if(player == Class451.localPlayer) {
            Class177.method2659(2, 0, player.method10977(true, (byte)12), player.method10969(false, -420511574), player.aString12175, var17, (Class415)null, 662232666);
         }

         player.method10974(var17, 0, 0, (byte)48);
      }

      if((var3 & 1048576) != 0) {
         player.aByte11928 = var0.readByte((byte)126);
         player.aByte11929 = var0.readByteC(-2087725885);
         player.aByte11899 = var0.readByte((byte)127);
         player.aByte11893 = (byte)var0.readUnsignedByte128((byte)36);
         player.anInt11926 = (client.anInt11012 + var0.readUnsignedShort(1328933051)) * -1462749463;
         player.anInt11933 = (client.anInt11012 + var0.readUnsignedShort(753269799)) * 1238611391;
      }

      if(0 != (var3 & 2097152)) {
         var5 = var0.readUnsignedShort(1694121303);
         var13 = var0.readInt((byte)5);
         if('\uffff' == var5) {
            var5 = -1;
         }

         var14 = var0.readUnsigned128Byte((byte)-14);
         var8 = var14 & 7;
         var9 = var14 >> 3 & 15;
         if(15 == var9) {
            var9 = -1;
         }

         var20 = 1 == (var14 >> 7 & 1);
         player.method10777(var5, var13, var8, var9, var20, 3, 79056171);
      }

      if((var3 & 131072) != 0) {
         var0.pos += 1603952830;
         var5 = var0.buffer[(var0.pos += 801976415) * 301018015 - 1] & 255;

         for(var13 = 0; var13 < var5; ++var13) {
            var14 = var0.readUnsignedByte128((byte)36);
            var18 = (Class481)Class561.findIdentifiable(Class481.method5758((byte)58), var14, (byte)-84);
            var21 = Class506.aClass97_Sub1_Sub1_5698.method8372(var0, var18, (byte)0);
            player.anInterface4_11887.method27(1602756037 * var21.anInt4793, var21.anObject4794, 172204199);
         }
      }

      if(0 != (var3 & 32)) {
         var5 = var0.readUnsignedShort128((short)24294);
         if('\uffff' == var5) {
            var5 = -1;
         }

         player.anInt11911 = -790295043 * var5;
      }

      if((var3 & 1024) != 0) {
         player.aClass215_12182 = (Class215)Class561.findIdentifiable(Class215.method2963(374413013), var0.readUnsigned128Byte((byte)-37), (byte)-27);
         if(null == player.aClass215_12182) {
            player.aClass215_12182 = Class215.aClass215_2271;
         }
      }

      if(0 != (var3 & '\u8000')) {
         var5 = var0.readUnsignedLEShort((byte)39);
         var13 = var0.readIntV1(-630628485);
         if('\uffff' == var5) {
            var5 = -1;
         }

         var14 = var0.readUnsignedByte(536310636);
         var8 = var14 & 7;
         var9 = var14 >> 3 & 15;
         if(var9 == 15) {
            var9 = -1;
         }

         var20 = 1 == (var14 >> 7 & 1);
         player.method10777(var5, var13, var8, var9, var20, 2, 79056171);
      }

      if(0 != (var3 & 16)) {
         int[] var22 = new int[4];

         for(var13 = 0; var13 < 4; ++var13) {
            var22[var13] = var0.readBigSmart((byte)12);
         }

         var13 = var0.readUnsignedByte(1847466169);
         Class581.method6971(player, var22, var13, false, (byte)0);
      }

      if((var3 & 65536) != 0) { //TARGET RETICULE UPDATE
         var5 = var0.readUnsignedShort128((short)28968);
         var13 = var0.readIntLE(232797085);
         if(var5 == '\uffff') {
            var5 = -1;
         }

         var14 = var0.readUnsigned128Byte((byte)-8);
         var8 = var14 & 7;
         var9 = var14 >> 3 & 15;
         if(15 == var9) {
            var9 = -1;
         }

         var20 = (var14 >> 7 & 1) == 1;
         player.method10777(var5, var13, var8, var9, var20, 4, 79056171);
      }

      if(0 != (var3 & 2)) { //FORCE MOVEMENT
    	 System.out.println("Forcemovement Mask");
         player.anInt11912 = var0.readByte((byte)104) * -1923326237;
         player.anInt11919 = var0.read128Byte((byte)-48) * 1573028629;
         player.anInt11920 = var0.readByte((byte)110) * -1475013205;
         player.anInt11954 = var0.readByte((byte)109) * 193059349;
         player.anInt11921 = var0.readByte((byte)43) * -1199325289;
         player.anInt11922 = var0.readByteC(-2087725885) * -1820207517;
         player.anInt11923 = (var0.readUnsignedLEShort((byte)112) + client.anInt11012) * 1436013787;
         player.anInt11924 = (var0.readUnsignedLEShort((byte)15) + client.anInt11012) * 1479744435;
         player.anInt11925 = var0.readUnsignedShort128((short)28290) * -47812659;
         player.anInt11943 = -808498231;
         player.anInt11948 = 0;
         player.anInt11912 += player.screenX[0] * -1923326237;
         player.anInt11919 += 1573028629 * player.screenY[0];
         player.anInt11920 += -1475013205 * player.screenX[0];
         player.anInt11954 += player.screenY[0] * 193059349;
         player.anInt11921 += -1199325289 * player.aByte10827;
         player.anInt11922 += player.aByte10827 * -1820207517;
      }

      if(0 != (var3 & 8)) {
         var5 = var0.readUnsignedByte128((byte)36);
         var15 = new byte[var5];
         var16 = new RSByteBuffer(var15);
         var0.writeBytes128Reverse(var15, 0, var5, -1677737517);
         Class103.aClass526_Sub36Array1268[var1] = var16;
         player.decodeAppearance(var16, -1957887669);
      }

      if((var3 & 4194304) != 0) {
         var17 = var0.readString(-623568098);
         var13 = var0.readUnsignedByte128((byte)36);
         if(0 != (var13 & 1)) {
            Class177.method2659(2, var13, player.method10977(true, (byte)113), player.method10969(false, 1818546390), player.aString12175, var17, (Class415)null, -1502325641);
         }

         player.method10974(var17, 0, 0, (byte)94);
      }

      if((var3 & 1) != 0) {
         var5 = var0.readUnsignedByte128((byte)36);
         int var11;
         if(var5 > 0) {
            for(var13 = 0; var13 < var5; ++var13) {
               var8 = -1;
               boolean var23 = true;
               var10 = -1;
               var14 = var0.readSmart(-1393093789);
               if(var14 == 32767) {
                  var14 = var0.readSmart(-267671713);
                  var9 = var0.readSmart(-1504770390);
                  var8 = var0.readSmart(-1216497786);
                  var10 = var0.readSmart(-761330460);
               } else if(32766 != var14) {
                  var9 = var0.readSmart(-2026059313);
               } else {
                  var14 = -1;
                  var9 = var0.readUnsigned128Byte((byte)-6);
               }

               var11 = var0.readSmart(-1221276040);
               player.method10785(var14, var9, var8, var10, client.anInt11012, var11, -1909329713);
            }
         }

         var13 = var0.readUnsigned128Byte((byte)-23);
         if(var13 > 0) {
            for(var14 = 0; var14 < var13; ++var14) {
               var8 = var0.readSmart(-517512593);
               var9 = var0.readSmart(-491074776);
               if(32767 != var9) {
                  var10 = var0.readSmart(-1059868287);
                  var11 = var0.readUnsignedByte128((byte)36);
                  int var12 = var9 > 0?var0.readUnsignedByte(-1390836333):var11;
                  player.method10769(var8, client.anInt11012, var9, var10, var11, var12, -846648823);
               } else {
                  player.method10779(var8, (byte)8);
               }
            }
         }
      }

   }

   static final void method8267(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      InterfaceDef var4 = Class204.method2893(var2, var3, 1994597924);
      Class438.method5153(444321972);
      Class526_Sub24 var5 = client.method10311(var4);
      Class475.method5654(var4, var5.method9461((byte)0), 1231358729 * var5.anInt10548, 1618508744);
   }

   static Class260[] method8268(short var0) {
      return new Class260[]{Class260.aClass260_2935, Class260.aClass260_2838, Class260.aClass260_2839, Class260.aClass260_2840, Class260.aClass260_2921, Class260.aClass260_2919, Class260.aClass260_2867, Class260.aClass260_2895, Class260.aClass260_2949, Class260.aClass260_2846, Class260.aClass260_2847, Class260.aClass260_2868, Class260.aClass260_2849, Class260.aClass260_2933, Class260.aClass260_2851, Class260.aClass260_2852, Class260.aClass260_2857, Class260.aClass260_2854, Class260.aClass260_2855, Class260.aClass260_2856, Class260.aClass260_2957, Class260.aClass260_2858, Class260.aClass260_2859, Class260.aClass260_2845, Class260.aClass260_2853, Class260.aClass260_2842, Class260.aClass260_2863, Class260.aClass260_2889, Class260.aClass260_2881, Class260.aClass260_2925, Class260.aClass260_2865, Class260.aClass260_2869, Class260.aClass260_2902, Class260.aClass260_2948, Class260.aClass260_2871, Class260.aClass260_2872, Class260.aClass260_2873, Class260.aClass260_2911, Class260.aClass260_2874, Class260.aClass260_2860, Class260.aClass260_2864, Class260.aClass260_2878, Class260.aClass260_2941, Class260.aClass260_2880, Class260.aClass260_2932, Class260.aClass260_2918, Class260.aClass260_2883, Class260.aClass260_2884, Class260.aClass260_2885, Class260.aClass260_2875, Class260.aClass260_2887, Class260.aClass260_2888, Class260.aClass260_2937, Class260.aClass260_2890, Class260.aClass260_2891, Class260.aClass260_2892, Class260.aClass260_2893, Class260.aClass260_2844, Class260.aClass260_2837, Class260.aClass260_2896, Class260.aClass260_2897, Class260.aClass260_2898, Class260.aClass260_2899, Class260.aClass260_2900, Class260.aClass260_2901, Class260.aClass260_2931, Class260.aClass260_2903, Class260.aClass260_2960, Class260.aClass260_2905, Class260.aClass260_2906, Class260.aClass260_2907, Class260.aClass260_2908, Class260.aClass260_2909, Class260.aClass260_2910, Class260.aClass260_2947, Class260.aClass260_2912, Class260.aClass260_2913, Class260.aClass260_2914, Class260.aClass260_2915, Class260.aClass260_2916, Class260.aClass260_2917, Class260.aClass260_2843, Class260.aClass260_2924, Class260.aClass260_2920, Class260.aClass260_2954, Class260.aClass260_2877, Class260.aClass260_2923, Class260.aClass260_2870, Class260.aClass260_2862, Class260.aClass260_2926, Class260.aClass260_2927, Class260.aClass260_2928, Class260.aClass260_2929, Class260.aClass260_2930, Class260.aClass260_2886, Class260.aClass260_2866, Class260.aClass260_2894, Class260.aClass260_2934, Class260.aClass260_2952, Class260.aClass260_2850, Class260.aClass260_2882, Class260.aClass260_2938, Class260.aClass260_2939, Class260.aClass260_2940, Class260.aClass260_2904, Class260.aClass260_2942, Class260.aClass260_2943, Class260.aClass260_2944, Class260.aClass260_2945, Class260.aClass260_2946, Class260.aClass260_2922, Class260.aClass260_2848, Class260.aClass260_2841, Class260.aClass260_2950, Class260.aClass260_2951, Class260.aClass260_2876, Class260.aClass260_2953, Class260.aClass260_2879, Class260.aClass260_2955, Class260.aClass260_2956, Class260.aClass260_2936, Class260.aClass260_2958, Class260.aClass260_2959, Class260.aClass260_2861, Class260.aClass260_2961};
   }
}
