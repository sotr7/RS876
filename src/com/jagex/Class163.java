package com.jagex;

import com.jagex.Class1;
import com.jagex.Class153;
import com.jagex.Class159;
import com.jagex.Class162;
import com.jagex.Class174;
import com.jagex.Class230;
import com.jagex.Class285;
import com.jagex.Class422;
import com.jagex.Class442;
import com.jagex.Class522;
import com.jagex.Class526_Sub32;
import com.jagex.Class627;
import com.jagex.Class661;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.client;
import java.util.Random;

public abstract class Class163 {
   public static final int anInt1770 = 0;
   public static final int anInt1773 = 1;
   public static final int anInt1775 = 0;
   Class174 aClass174_1771;
   Class1 aClass1_1781;
   static int anInt1782 = 0;
   static int anInt1772 = 0;
   static int anInt1783 = -198547297;
   static int anInt1776 = 1435773413;
   static int anInt1779 = 0;
   static int anInt1778 = 0;
   static int anInt1774 = 0;
   static int anInt1780 = 0;
   static String[] aStringArray1777 = new String[100];

   public void method1895(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(null != var1) {
         this.method1903(var4, var5, (byte)25);
         this.method1897(var1, var2, var3, (Class153[])null, (int[])null, (Class162)null, 0, 0, 1661828142);
      }
   }

   public void method1896(String var1, int var2, int var3, int var4, int var5, byte var6) {
      if(var1 != null) {
         this.method1903(var4, var5, (byte)46);
         this.method1897(var1, var2 - this.aClass1_1781.method509(var1, 294581563), var3, (Class153[])null, (int[])null, (Class162)null, 0, 0, 1661828142);
      }
   }

   Class163(Class174 var1, Class1 var2) {
      this.aClass174_1771 = var1;
      this.aClass1_1781 = var2;
   }

   void method1897(String var1, int var2, int var3, Class153[] var4, int[] var5, Class162 var6, int var7, int var8, int var9) {
      var3 -= this.aClass1_1781.anInt11 * -730103023;
      int var10 = -1;
      int var11 = -1;
      int var12 = var1.length();

      for(int var13 = 0; var13 < var12; ++var13) {
         char var14 = (char)(Class422.method4994(var1.charAt(var13), (byte)8) & 255);
         if(60 == var14) {
            var10 = var13;
         } else {
            if(62 == var14 && var10 != -1) {
               String var15 = var1.substring(var10 + 1, var13);
               var10 = -1;
               if(var15.equals("lt")) {
                  var14 = 60;
               } else if(var15.equals("gt")) {
                  var14 = 62;
               } else if(var15.equals("nbsp")) {
                  var14 = 160;
               } else if(var15.equals("shy")) {
                  var14 = 173;
               } else if(var15.equals("times")) {
                  var14 = 215;
               } else if(var15.equals("euro")) {
                  var14 = 128;
               } else if(var15.equals("copy")) {
                  var14 = 169;
               } else {
                  if(!var15.equals("reg")) {
                     int var16;
                     int var18;
                     if(var15.startsWith("img=")) {
                        try {
                           var16 = Class661.method7925(var15.substring(4), (byte)17);
                           Class153 var17 = var4[var16];
                           var18 = null != var5?var5[var16]:var17.method1788();
                           if(-16777216 == (anInt1778 * 86431895 & -16777216)) {
                              var17.method1774(var2, -730103023 * this.aClass1_1781.anInt11 + var3 - var18, 1, -1, 1);
                           } else {
                              var17.method1774(var2, var3 + -730103023 * this.aClass1_1781.anInt11 - var18, 0, anInt1778 * 86431895 & -16777216 | 16777215, 1);
                           }

                           var2 += var4[var16].method21();
                           var11 = -1;
                        } catch (Exception var22) {
                           ;
                        }
                     } else if(var15.startsWith("sprite=")) {
                        if(null != this.aClass1_1781.anInterface2_13) {
                           try {
                              boolean var24 = true;
                              int var25 = 0;
                              var18 = var15.indexOf(44);
                              if(var18 == -1) {
                                 var16 = Class661.method7925(var15.substring(7), (byte)110);
                              } else {
                                 var16 = Class661.method7925(var15.substring(7, var18), (byte)98);
                                 var25 = Class661.method7925(var15.substring(var18 + 1), (byte)39);
                              }

                              Class153[] var19 = this.aClass1_1781.anInterface2_13.method14(this.aClass174_1771, var16, -1064742462);
                              if(null != var19) {
                                 int var20 = Math.min(var19[var25].method1788(), -1329402501 * this.aClass1_1781.anInt14 + this.aClass1_1781.anInt12 * 96898447);
                                 if(-16777216 == (86431895 * anInt1778 & -16777216)) {
                                    var19[var25].method1774(var2, var3 + 2 + -730103023 * this.aClass1_1781.anInt11 - var20, 1, -1, 1);
                                 } else {
                                    var19[var25].method1774(var2, var3 + 2 + -730103023 * this.aClass1_1781.anInt11 - var20, 0, 86431895 * anInt1778 & -16777216 | 16777215, 1);
                                 }

                                 var2 += var19[var25].method21();
                              }

                              var11 = -1;
                           } catch (Exception var21) {
                              ;
                           }
                        }
                     } else {
                        this.method1904(var15, 1465295951);
                     }
                     continue;
                  }

                  var14 = 174;
               }
            }

            if(-1 == var10) {
               if(var11 != -1) {
                  var2 += this.aClass1_1781.method512(var11, var14, -2053315778);
               }

               if(var14 != 32) {
                  if(var6 == null) {
                     if((795566401 * anInt1780 & -16777216) != 0) {
                        this.method1908(var14, var2 + 1, 1 + var3, 795566401 * anInt1780, true);
                     }

                     this.method1908(var14, var2, var3, anInt1778 * 86431895, false);
                  } else {
                     if((795566401 * anInt1780 & -16777216) != 0) {
                        this.method1922(var14, var2 + 1, 1 + var3, anInt1780 * 795566401, true, var6, var7, var8);
                     }

                     this.method1922(var14, var2, var3, 86431895 * anInt1778, false, var6, var7, var8);
                  }
               } else if(955990879 * anInt1772 > 0) {
                  anInt1782 += -1987761337 * anInt1772;
                  var2 += 1668186921 * anInt1782 >> 8;
                  anInt1782 = (1668186921 * anInt1782 & 255) * -1934964455;
               }

               int var23 = this.aClass1_1781.method505(var14, -1623623189);
               if(1050365089 * anInt1783 != -1) {
                  this.aClass174_1771.method2344(var2, (int)(0.7D * (double)(-730103023 * this.aClass1_1781.anInt11)) + var3, var23, 1050365089 * anInt1783, 1019996381);
               }

               if(-1 != 2036755 * anInt1776) {
                  this.aClass174_1771.method2344(var2, 1 + -730103023 * this.aClass1_1781.anInt11 + var3, var23, anInt1776 * 2036755, -598593302);
               }

               var2 += var23;
               var11 = var14;
            }
         }
      }

   }

   public int method1898(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class153[] var12, int[] var13, Class162 var14, int var15, int var16, byte var17) {
      if(null == var1) {
         return 0;
      } else {
         this.method1903(var6, var7, (byte)16);
         if(var10 == 0) {
            var10 = this.aClass1_1781.anInt11 * -730103023;
         }

         int[] var18;
         if(var5 < this.aClass1_1781.anInt12 * 96898447 + this.aClass1_1781.anInt14 * -1329402501 + var10 && var5 < var10 + var10) {
            var18 = null;
         } else {
            var18 = new int[]{var4};
         }

         int var19 = this.aClass1_1781.method502(var1, var18, aStringArray1777, var12, 1887129676);
         if(-1 == var11) {
            var11 = var5 / var10;
            if(var11 <= 0) {
               var11 = 1;
            }
         }

         if(var11 > 0 && var19 >= var11) {
            aStringArray1777[var11 - 1] = this.aClass1_1781.method501(aStringArray1777[var11 - 1], var4, var12, 665796333);
            var19 = var11;
         }

         if(var9 == 3 && var19 == 1) {
            var9 = 1;
         }

         int var20;
         int var21;
         if(var9 == 0) {
            var20 = var3 + 96898447 * this.aClass1_1781.anInt12;
         } else if(1 == var9) {
            var20 = var3 + this.aClass1_1781.anInt12 * 96898447 + (var5 - 96898447 * this.aClass1_1781.anInt12 - this.aClass1_1781.anInt14 * -1329402501 - (var19 - 1) * var10) / 2;
         } else if(2 == var9) {
            var20 = var5 + var3 - -1329402501 * this.aClass1_1781.anInt14 - (var19 - 1) * var10;
         } else {
            var21 = (var5 - this.aClass1_1781.anInt12 * 96898447 - this.aClass1_1781.anInt14 * -1329402501 - var10 * (var19 - 1)) / (var19 + 1);
            if(var21 < 0) {
               var21 = 0;
            }

            var20 = this.aClass1_1781.anInt12 * 96898447 + var3 + var21;
            var10 += var21;
         }

         for(var21 = 0; var21 < var19; ++var21) {
            if(var8 == 0) {
               this.method1897(aStringArray1777[var21], var2, var20, var12, var13, var14, var15, var16, 1661828142);
            } else if(1 == var8) {
               this.method1897(aStringArray1777[var21], var2 + (var4 - this.aClass1_1781.method509(aStringArray1777[var21], 294581563)) / 2, var20, var12, var13, var14, var15, var16, 1661828142);
            } else if(2 == var8) {
               this.method1897(aStringArray1777[var21], var2 + var4 - this.aClass1_1781.method509(aStringArray1777[var21], 294581563), var20, var12, var13, var14, var15, var16, 1661828142);
            } else if(var21 == var19 - 1) {
               this.method1897(aStringArray1777[var21], var2, var20, var12, var13, var14, var15, var16, 1661828142);
            } else {
               this.method1905(aStringArray1777[var21], var4, 781984974);
               this.method1897(aStringArray1777[var21], var2, var20, var12, var13, var14, var15, var16, 1661828142);
               anInt1772 = 0;
            }

            var20 += var10;
         }

         return var19;
      }
   }

   void method1899(int var1, int var2) {
      anInt1783 = -198547297;
      anInt1776 = 1435773413;
      anInt1778 = (anInt1779 = var1 * -2002962345) * 1543996849;
      anInt1772 = 0;
      anInt1782 = 0;
      if(var2 == -1) {
         var2 = 0;
      }

      anInt1780 = (anInt1774 = 1624152845 * var2) * 334357893;
   }

   public void method1900(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(null != var1) {
         this.method1903(var4, var5, (byte)25);
         int var8 = var1.length();
         int[] var9 = new int[var8];
         int[] var10 = new int[var8];

         for(int var11 = 0; var11 < var8; ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var6 / 5.0D + (double)var11 / 3.0D) * 5.0D);
         }

         this.method1914(var1, var2 - this.aClass1_1781.method509(var1, 294581563) / 2, var3, (Class153[])null, (int[])null, var9, var10, -1128279734);
      }
   }

   public int method1901(String var1, int var2, int var3, int var4, int var5, Random var6, int var7, Class153[] var8, int[] var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         var6.setSeed((long)var7);
         int var11 = 192 + (var6.nextInt() & 31);
         this.method1903(var11 << 24 | var4 & 16777215, var11 << 24 | var5 & 16777215, (byte)48);
         int var12 = var1.length();
         int[] var13 = new int[var12];
         int var14 = 0;

         for(int var15 = 0; var15 < var12; ++var15) {
            var13[var15] = var14;
            if((var6.nextInt() & 3) == 0) {
               ++var14;
            }
         }

         this.method1914(var1, var2, var3, var8, var9, var13, (int[])null, 1325443567);
         return var14;
      }
   }

   public int method1902(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Random var10, int var11, int[] var12, Class153[] var13, int[] var14, byte var15) {
      if(null == var1) {
         return 0;
      } else {
         var10.setSeed((long)var11);
         int var16 = 192 + (var10.nextInt() & 31);
         this.method1903(var16 << 24 | var6 & 16777215, -1 == var7?0:var16 << 24 | var7 & 16777215, (byte)83);
         int var17 = var1.length();
         int[] var18 = new int[var17];
         int var19 = 0;

         int var20;
         for(var20 = 0; var20 < var17; ++var20) {
            var18[var20] = var19;
            if((var10.nextInt() & 3) == 0) {
               ++var19;
            }
         }

         var20 = var2;
         int var21 = 96898447 * this.aClass1_1781.anInt12 + var3;
         int var22 = -1;
         if(1 == var9) {
            var21 += (var5 - this.aClass1_1781.anInt12 * 96898447 - this.aClass1_1781.anInt14 * -1329402501) / 2;
         } else if(var9 == 2) {
            var21 = var5 + var3 - this.aClass1_1781.anInt14 * -1329402501;
         }

         if(var8 == 1) {
            var22 = this.aClass1_1781.method509(var1, 294581563) + var19;
            var20 = var2 + (var4 - var22) / 2;
         } else if(var8 == 2) {
            var22 = this.aClass1_1781.method509(var1, 294581563) + var19;
            var20 = var2 + (var4 - var22);
         }

         this.method1914(var1, var20, var21, var13, var14, var18, (int[])null, -679608858);
         if(var12 != null) {
            if(-1 == var22) {
               var22 = this.aClass1_1781.method509(var1, 294581563) + var19;
            }

            var12[0] = var20;
            var12[1] = var21 - 96898447 * this.aClass1_1781.anInt12;
            var12[2] = var22;
            var12[3] = -1329402501 * this.aClass1_1781.anInt14 + this.aClass1_1781.anInt12 * 96898447;
         }

         return var19;
      }
   }

   void method1903(int var1, int var2, byte var3) {
      anInt1783 = -198547297;
      anInt1776 = 1435773413;
      anInt1778 = (anInt1779 = var1 * -2002962345) * 1543996849;
      anInt1772 = 0;
      anInt1782 = 0;
      if(var2 == -1) {
         var2 = 0;
      }

      anInt1780 = (anInt1774 = 1624152845 * var2) * 334357893;
   }

   void method1904(String var1, int var2) {
      try {
         if(var1.startsWith("col=")) {
            anInt1778 = (anInt1778 * 86431895 & -16777216 | Class159.method1877(var1.substring(4), 16, -1056112012) & 16777215) * -245749977;
         } else if(var1.equals("/col")) {
            anInt1778 = (86431895 * anInt1778 & -16777216 | -293391513 * anInt1779 & 16777215) * -245749977;
         }

         if(var1.startsWith("argb=")) {
            anInt1778 = Class159.method1877(var1.substring(5), 16, -1153662099) * -245749977;
         } else if(var1.equals("/argb")) {
            anInt1778 = 1543996849 * anInt1779;
         } else if(var1.startsWith("str=")) {
            anInt1783 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(4), 16, -871214476)) * 198547297;
         } else if(var1.equals("str")) {
            anInt1783 = 198547297 * (anInt1778 * 86431895 & -16777216 | 8388608);
         } else if(var1.equals("/str")) {
            anInt1783 = -198547297;
         } else if(var1.startsWith("u=")) {
            anInt1776 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(2), 16, -739283390)) * -1435773413;
         } else if(var1.equals("u")) {
            anInt1776 = -1435773413 * (anInt1778 * 86431895 & -16777216);
         } else if(var1.equals("/u")) {
            anInt1776 = 1435773413;
         } else if(var1.equalsIgnoreCase("shad=-1")) {
            anInt1780 = 0;
         } else if(var1.startsWith("shad=")) {
            anInt1780 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(5), 16, -1879953541)) * -1642975551;
         } else if(var1.equals("shad")) {
            anInt1780 = -1642975551 * (86431895 * anInt1778 & -16777216);
         } else if(var1.equals("/shad")) {
            anInt1780 = 334357893 * anInt1774;
         } else if(var1.equals("br")) {
            this.method1903(anInt1779 * -293391513, -1930056763 * anInt1774, (byte)66);
         }
      } catch (Exception var4) {
         ;
      }

   }

   void method1905(String var1, int var2, int var3) {
      int var4 = 0;
      boolean var5 = false;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         char var7 = var1.charAt(var6);
         if(var7 == 60) {
            var5 = true;
         } else if(var7 == 62) {
            var5 = false;
         } else if(!var5 && var7 == 32) {
            ++var4;
         }
      }

      if(var4 > 0) {
         anInt1772 = (var2 - this.aClass1_1781.method509(var1, 294581563) << 8) / var4 * 1820842143;
      }

   }

   abstract void method1906(char var1, int var2, int var3, int var4, boolean var5);

   abstract void method1907(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8);

   abstract void method1908(char var1, int var2, int var3, int var4, boolean var5);

   abstract void method1909(char var1, int var2, int var3, int var4, boolean var5);

   abstract void method1910(char var1, int var2, int var3, int var4, boolean var5);

   public void method1911(String var1, int var2, int var3, int var4, int var5, byte var6) {
      if(var1 != null) {
         this.method1903(var4, var5, (byte)105);
         this.method1897(var1, var2 - this.aClass1_1781.method509(var1, 294581563) / 2, var3, (Class153[])null, (int[])null, (Class162)null, 0, 0, 1661828142);
      }
   }

   abstract void method1912(char var1, int var2, int var3, int var4, boolean var5);

   abstract void method1913(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8);

   void method1914(String var1, int var2, int var3, Class153[] var4, int[] var5, int[] var6, int[] var7, int var8) {
      var3 -= this.aClass1_1781.anInt11 * -730103023;
      int var9 = -1;
      int var10 = -1;
      int var11 = 0;
      int var12 = var1.length();

      for(int var13 = 0; var13 < var12; ++var13) {
         char var14 = (char)(Class422.method4994(var1.charAt(var13), (byte)100) & 255);
         if(60 == var14) {
            var9 = var13;
         } else {
            int var16;
            int var17;
            if(62 == var14 && var9 != -1) {
               String var15 = var1.substring(var9 + 1, var13);
               var9 = -1;
               if(var15.equals("lt")) {
                  var14 = 60;
               } else if(var15.equals("gt")) {
                  var14 = 62;
               } else if(var15.equals("nbsp")) {
                  var14 = 160;
               } else if(var15.equals("shy")) {
                  var14 = 173;
               } else if(var15.equals("times")) {
                  var14 = 215;
               } else if(var15.equals("euro")) {
                  var14 = 128;
               } else if(var15.equals("copy")) {
                  var14 = 169;
               } else {
                  if(!var15.equals("reg")) {
                     int var18;
                     int var20;
                     if(var15.startsWith("img=")) {
                        try {
                           if(null != var6) {
                              var16 = var6[var11];
                           } else {
                              var16 = 0;
                           }

                           if(var7 != null) {
                              var17 = var7[var11];
                           } else {
                              var17 = 0;
                           }

                           ++var11;
                           var18 = Class661.method7925(var15.substring(4), (byte)66);
                           Class153 var19 = var4[var18];
                           var20 = var5 != null?var5[var18]:var19.method1788();
                           var19.method1774(var16 + var2, this.aClass1_1781.anInt11 * -730103023 + var3 - var20 + var17, 1, -1, 1);
                           var2 += var4[var18].method21();
                           var10 = -1;
                        } catch (Exception var24) {
                           ;
                        }
                     } else if(var15.startsWith("sprite=")) {
                        if(null != this.aClass1_1781.anInterface2_13) {
                           try {
                              boolean var26 = true;
                              var17 = 0;
                              var18 = var15.indexOf(44);
                              if(-1 == var18) {
                                 var16 = Class661.method7925(var15.substring(7), (byte)90);
                              } else {
                                 var16 = Class661.method7925(var15.substring(7, var18), (byte)74);
                                 var17 = Class661.method7925(var15.substring(1 + var18), (byte)8);
                              }

                              int var27;
                              if(null != var6) {
                                 var27 = var6[var11];
                              } else {
                                 var27 = 0;
                              }

                              if(var7 != null) {
                                 var20 = var7[var11];
                              } else {
                                 var20 = 0;
                              }

                              ++var11;
                              Class153[] var21 = this.aClass1_1781.anInterface2_13.method14(this.aClass174_1771, var16, 347161333);
                              if(var21 != null) {
                                 int var22 = Math.min(var21[var17].method1788(), this.aClass1_1781.anInt12 * 96898447 + this.aClass1_1781.anInt14 * -1329402501);
                                 var21[var17].method1774(var27 + var2, this.aClass1_1781.anInt11 * -730103023 + 3 + var3 - var22 + var20, 1, -1, 1);
                                 var2 += var21[var17].method21();
                              }

                              var10 = -1;
                           } catch (Exception var23) {
                              ;
                           }
                        }
                     } else {
                        this.method1904(var15, 1113337159);
                     }
                     continue;
                  }

                  var14 = 174;
               }
            }

            if(-1 == var9) {
               if(var10 != -1) {
                  var2 += this.aClass1_1781.method512(var10, var14, -1959451974);
               }

               int var25;
               if(null != var6) {
                  var25 = var6[var11];
               } else {
                  var25 = 0;
               }

               if(null != var7) {
                  var16 = var7[var11];
               } else {
                  var16 = 0;
               }

               ++var11;
               if(var14 != 32) {
                  if(0 != (795566401 * anInt1780 & -16777216)) {
                     this.method1908(var14, 1 + var2 + var25, 1 + var3 + var16, anInt1780 * 795566401, true);
                  }

                  this.method1908(var14, var2 + var25, var16 + var3, 86431895 * anInt1778, false);
               } else if(955990879 * anInt1772 > 0) {
                  anInt1782 += anInt1772 * -1987761337;
                  var2 += 1668186921 * anInt1782 >> 8;
                  anInt1782 = -1934964455 * (anInt1782 * 1668186921 & 255);
               }

               var17 = this.aClass1_1781.method505(var14, -1527197000);
               if(-1 != 1050365089 * anInt1783) {
                  this.aClass174_1771.method2344(var2, var3 + (int)((double)(this.aClass1_1781.anInt11 * -730103023) * 0.7D), var17, 1050365089 * anInt1783, 1256724043);
               }

               if(2036755 * anInt1776 != -1) {
                  this.aClass174_1771.method2344(var2, var3 + this.aClass1_1781.anInt11 * -730103023, var17, 2036755 * anInt1776, 1740097251);
               }

               var2 += var17;
               var10 = var14;
            }
         }
      }

   }

   public int method1915(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class153[] var11, int[] var12, Class162 var13, int var14, int var15, byte var16) {
      return this.method1898(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 0, var11, var12, var13, var14, var15, (byte)43);
   }

   public void method1916(String var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      if(var1 != null) {
         this.method1903(var4, var5, (byte)111);
         int var8 = var1.length();
         int[] var9 = new int[var8];

         for(int var10 = 0; var10 < var8; ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method1914(var1, var2 - this.aClass1_1781.method509(var1, 294581563) / 2, var3, (Class153[])null, (int[])null, (int[])null, var9, 87891368);
      }
   }

   void method1917(int var1, int var2) {
      anInt1783 = -198547297;
      anInt1776 = 1435773413;
      anInt1778 = (anInt1779 = var1 * -2002962345) * 1543996849;
      anInt1772 = 0;
      anInt1782 = 0;
      if(var2 == -1) {
         var2 = 0;
      }

      anInt1780 = (anInt1774 = 1624152845 * var2) * 334357893;
   }

   void method1918(int var1, int var2) {
      anInt1783 = -198547297;
      anInt1776 = 1435773413;
      anInt1778 = (anInt1779 = var1 * -2002962345) * 1543996849;
      anInt1772 = 0;
      anInt1782 = 0;
      if(var2 == -1) {
         var2 = 0;
      }

      anInt1780 = (anInt1774 = 1624152845 * var2) * 334357893;
   }

   void method1919(String var1) {
      try {
         if(var1.startsWith("col=")) {
            anInt1778 = (anInt1778 * 86431895 & -16777216 | Class159.method1877(var1.substring(4), 16, -1359080427) & 16777215) * -245749977;
         } else if(var1.equals("/col")) {
            anInt1778 = (86431895 * anInt1778 & -16777216 | -293391513 * anInt1779 & 16777215) * -245749977;
         }

         if(var1.startsWith("argb=")) {
            anInt1778 = Class159.method1877(var1.substring(5), 16, -852751932) * -245749977;
         } else if(var1.equals("/argb")) {
            anInt1778 = 1543996849 * anInt1779;
         } else if(var1.startsWith("str=")) {
            anInt1783 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(4), 16, -1277970706)) * 198547297;
         } else if(var1.equals("str")) {
            anInt1783 = 198547297 * (anInt1778 * 86431895 & -16777216 | 8388608);
         } else if(var1.equals("/str")) {
            anInt1783 = -198547297;
         } else if(var1.startsWith("u=")) {
            anInt1776 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(2), 16, -1524398701)) * -1435773413;
         } else if(var1.equals("u")) {
            anInt1776 = -1435773413 * (anInt1778 * 86431895 & -16777216);
         } else if(var1.equals("/u")) {
            anInt1776 = 1435773413;
         } else if(var1.equalsIgnoreCase("shad=-1")) {
            anInt1780 = 0;
         } else if(var1.startsWith("shad=")) {
            anInt1780 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(5), 16, -1178417220)) * -1642975551;
         } else if(var1.equals("shad")) {
            anInt1780 = -1642975551 * (86431895 * anInt1778 & -16777216);
         } else if(var1.equals("/shad")) {
            anInt1780 = 334357893 * anInt1774;
         } else if(var1.equals("br")) {
            this.method1903(anInt1779 * -293391513, -1930056763 * anInt1774, (byte)39);
         }
      } catch (Exception var3) {
         ;
      }

   }

   void method1920(String var1) {
      try {
         if(var1.startsWith("col=")) {
            anInt1778 = (anInt1778 * 86431895 & -16777216 | Class159.method1877(var1.substring(4), 16, -1056003858) & 16777215) * -245749977;
         } else if(var1.equals("/col")) {
            anInt1778 = (86431895 * anInt1778 & -16777216 | -293391513 * anInt1779 & 16777215) * -245749977;
         }

         if(var1.startsWith("argb=")) {
            anInt1778 = Class159.method1877(var1.substring(5), 16, -301686408) * -245749977;
         } else if(var1.equals("/argb")) {
            anInt1778 = 1543996849 * anInt1779;
         } else if(var1.startsWith("str=")) {
            anInt1783 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(4), 16, -536756306)) * 198547297;
         } else if(var1.equals("str")) {
            anInt1783 = 198547297 * (anInt1778 * 86431895 & -16777216 | 8388608);
         } else if(var1.equals("/str")) {
            anInt1783 = -198547297;
         } else if(var1.startsWith("u=")) {
            anInt1776 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(2), 16, -675120851)) * -1435773413;
         } else if(var1.equals("u")) {
            anInt1776 = -1435773413 * (anInt1778 * 86431895 & -16777216);
         } else if(var1.equals("/u")) {
            anInt1776 = 1435773413;
         } else if(var1.equalsIgnoreCase("shad=-1")) {
            anInt1780 = 0;
         } else if(var1.startsWith("shad=")) {
            anInt1780 = (86431895 * anInt1778 & -16777216 | Class159.method1877(var1.substring(5), 16, -1966028022)) * -1642975551;
         } else if(var1.equals("shad")) {
            anInt1780 = -1642975551 * (86431895 * anInt1778 & -16777216);
         } else if(var1.equals("/shad")) {
            anInt1780 = 334357893 * anInt1774;
         } else if(var1.equals("br")) {
            this.method1903(anInt1779 * -293391513, -1930056763 * anInt1774, (byte)104);
         }
      } catch (Exception var3) {
         ;
      }

   }

   public void method1921(String var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      if(var1 != null) {
         this.method1903(var4, var5, (byte)39);
         double var9 = 7.0D - (double)var7 / 8.0D;
         if(var9 < 0.0D) {
            var9 = 0.0D;
         }

         int var11 = var1.length();
         int[] var12 = new int[var11];

         for(int var13 = 0; var13 < var11; ++var13) {
            var12[var13] = (int)(Math.sin((double)var6 / 1.0D + (double)var13 / 1.5D) * var9);
         }

         this.method1914(var1, var2 - this.aClass1_1781.method509(var1, 294581563) / 2, var3, (Class153[])null, (int[])null, (int[])null, var12, 1794985710);
      }
   }

   abstract void method1922(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8);

   static void method1923(Class681 var0, byte var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[var0.anInt8623 * -1730576285 - 2], 265716331)).anIntArray3076[var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1]];
      var0.anInt8623 -= -1957887669;
   }

   static final void method1924(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub29_10653, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-781);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   public static Class526_Sub32 method1925(int var0, int var1, int var2, int var3, byte var4) {
      Class526_Sub32[] var5 = Class526_Sub32.aClass526_Sub32Array10595;
      synchronized(var5) {
         if(-47844285 * Class526_Sub32.anInt10596 == 0) {
            return new Class526_Sub32(var0, var1, var2, var3);
         } else {
            Class526_Sub32.aClass526_Sub32Array10595[(Class526_Sub32.anInt10596 -= 1247213675) * -47844285].method9585(var0, var1, var2, var3, -1501333290);
            return Class526_Sub32.aClass526_Sub32Array10595[Class526_Sub32.anInt10596 * -47844285];
         }
      }
   }

   static final void method1926(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anInt8623 -= 379191958;
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class1 var5 = Class627.aClass418_8195.method4964(client.anInterface51_11046, var4, (byte)2);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.method506(var2, var3, Class442.aClass153Array4878, (short)-26086);
   }
}
