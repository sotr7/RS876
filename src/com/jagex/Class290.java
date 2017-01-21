package com.jagex;

import com.jagex.Class153;
import com.jagex.Class171;
import com.jagex.Class184_Sub2;
import com.jagex.Class195;
import com.jagex.Class207;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class285;
import com.jagex.Class291;
import com.jagex.Class296;
import com.jagex.Class298;
import com.jagex.Class304_Sub1;
import com.jagex.Class306;
import com.jagex.Class307;
import com.jagex.Class315_Sub1;
import com.jagex.Class329_Sub2;
import com.jagex.Class375;
import com.jagex.Class382;
import com.jagex.Class425;
import com.jagex.Class446;
import com.jagex.Class461;
import com.jagex.Class497;
import com.jagex.Class499;
import com.jagex.Class526_Sub24;
import com.jagex.Class542;
import com.jagex.Class554;
import com.jagex.Class566;
import com.jagex.Class605;
import com.jagex.Class636;
import com.jagex.Class681;
import com.jagex.Class689_Sub3;
import com.jagex.Class74;
import com.jagex.Class8;
import com.jagex.Exception_Sub4;
import com.jagex.Interface31;
import com.jagex.client;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public class Class290 implements Runnable {
   volatile boolean aBool3125;
   boolean aBool3119;
   long aLong3120;
   String aString3118;
   String aString3126;
   int anInt3127;
   Class296 aClass296_3128;
   Interface31 anInterface31_3124 = null;
   Interface31 anInterface31_3121 = new Class306();
   long aLong3122;
   int anInt3123;

   void method3824(int var1) {
      this.aBool3125 = true;
   }

   int method3825(byte var1) {
      return 1165416003 * this.anInt3123;
   }

   synchronized void method3826(byte var1) {
      this.aBool3119 = true;
   }

   synchronized boolean method3827(int var1) {
      return this.anInterface31_3121.method220(-8291405423796141703L * this.aLong3122);
   }

   public long method3828() {
      return this.aLong3120 * -61282540661625265L;
   }

   synchronized void method3829(long var1, String var3, String var4, int var5, Class296 var6, int var7) {
      this.aLong3120 = 866054289409058991L * var1;
      this.aString3118 = var3;
      this.aString3126 = var4;
      this.anInt3127 = 250567991 * var5;
      this.aClass296_3128 = var6;
   }

   public int method3830(short var1) {
      if(this.aClass296_3128 == null) {
         return 0;
      } else {
         int var2 = this.aClass296_3128.anInt3204 * -264913027;
         return this.aClass296_3128.aBool3217 && this.anInt3127 * -317396857 < this.aClass296_3128.anInt3215 * -245183283?1 + -317396857 * this.anInt3127:(var2 >= 0 && var2 < Class291.aClass296Array3135.length - 1?(-317396857 * this.anInt3127 == -1716976061 * this.aClass296_3128.anInt3214?this.aClass296_3128.anInt3215 * -245183283:this.aClass296_3128.anInt3214 * -1716976061):100);
      }
   }

   public int method3831(byte var1) {
      return this.anInt3127 * -317396857;
   }

   public String method3832(byte var1) {
      return this.aString3126;
   }

   public String method3833(int var1) {
      return this.aString3118;
   }

   public int method3834() {
      return this.anInt3127 * -317396857;
   }

   synchronized void method3835(Interface31 var1, int var2) {
      this.anInterface31_3124 = this.anInterface31_3121;
      this.anInterface31_3121 = var1;
      this.aLong3122 = Class255.time((byte)24) * -2823277574721808183L;
   }

   public void run() {
      while(!this.aBool3125) {
         long var1 = Class255.time((byte)24);
         synchronized(this) {
            try {
               this.anInt3123 += -1606965653;
               if(this.anInterface31_3121 instanceof Class306) {
                  this.anInterface31_3121.method202(this.aBool3119, (byte)96);
               } else {
                  long var4 = Class255.time((byte)24);
                  if(null != Class554.aClass174_7475 && null != this.anInterface31_3124 && this.anInterface31_3124.method205((byte)-123) != 0 && -8291405423796141703L * this.aLong3122 >= var4 - (long)this.anInterface31_3124.method205((byte)-22)) {
                     int var6 = (int)(255L * (var4 - -8291405423796141703L * this.aLong3122) / (long)this.anInterface31_3124.method205((byte)-56));
                     int var7 = 255 - var6;
                     var6 = var6 << 24 | 16777215;
                     var7 = var7 << 24 | 16777215;
                     Class74.method1112(220517929);
                     Class554.aClass174_7475.method2283(1, 0);
                     Class153 var8 = Class554.aClass174_7475.method2306(1895615023 * Class566.anInt7611, 974996221 * Class526_Sub24.anInt10549, true, 1676625790);
                     Class184_Sub2 var9 = Class554.aClass174_7475.method2257();
                     var9.method8465(0, var8.method1773());
                     Class554.aClass174_7475.method2623(var9, (short)128);
                     this.anInterface31_3124.method202(true, (byte)-25);
                     Class554.aClass174_7475.method2456(var9, (byte)0);
                     var8.method1774(0, 0, 0, var7, 1);
                     Class554.aClass174_7475.method2623(var9, (short)128);
                     Class554.aClass174_7475.method2283(1, 0);
                     this.anInterface31_3121.method202(true, (byte)76);
                     Class554.aClass174_7475.method2456(var9, (byte)0);
                     var8.method1774(0, 0, 0, var6, 1);
                  } else {
                     if(null != this.anInterface31_3124) {
                        this.aBool3119 = true;
                        this.anInterface31_3124.method203(-1364063862);
                        this.anInterface31_3124 = null;
                     }

                     if(this.aBool3119) {
                        Class74.method1112(644024882);
                        if(Class554.aClass174_7475 != null) {
                           Class554.aClass174_7475.method2283(1, 0);
                        }
                     }

                     this.anInterface31_3121.method202(this.aBool3119 || null != Class554.aClass174_7475 && Class554.aClass174_7475.method2237(), (byte)22);
                  }

                  try {
                     if(Class554.aClass174_7475 != null && !(this.anInterface31_3121 instanceof Class306)) {
                        Class554.aClass174_7475.method2229((byte)52);
                     }
                  } catch (Exception_Sub4 var15) {
                     Class375.method4671(var15.getMessage() + Class636.aclient8310.method5959((byte)3), var15, (byte)64);
                     Class285.method3799(0, true, (byte)55);
                  }
               }

               this.aBool3119 = false;
               if(Class554.aClass174_7475 != null && !(this.anInterface31_3121 instanceof Class306) && -264913027 * this.aClass296_3128.anInt3204 < -264913027 * Class296.aClass296_3211.anInt3204) {
                  Class207.method2924(407014271);
               }
            } catch (Exception var16) {
               continue;
            }
         }

         long var12 = Class255.time((byte)24);
         int var14 = (int)(20L - (var12 - var1));
         if(var14 > 0) {
            Class304_Sub1.method9089((long)var14);
         }
      }

   }

   public void method3836() {
      while(!this.aBool3125) {
         long var1 = Class255.time((byte)24);
         synchronized(this) {
            try {
               this.anInt3123 += -1606965653;
               if(this.anInterface31_3121 instanceof Class306) {
                  this.anInterface31_3121.method202(this.aBool3119, (byte)-4);
               } else {
                  long var4 = Class255.time((byte)24);
                  if(null != Class554.aClass174_7475 && null != this.anInterface31_3124 && this.anInterface31_3124.method205((byte)-74) != 0 && -8291405423796141703L * this.aLong3122 >= var4 - (long)this.anInterface31_3124.method205((byte)-82)) {
                     int var6 = (int)(255L * (var4 - -8291405423796141703L * this.aLong3122) / (long)this.anInterface31_3124.method205((byte)-104));
                     int var7 = 255 - var6;
                     var6 = var6 << 24 | 16777215;
                     var7 = var7 << 24 | 16777215;
                     Class74.method1112(-1182141278);
                     Class554.aClass174_7475.method2283(1, 0);
                     Class153 var8 = Class554.aClass174_7475.method2306(1895615023 * Class566.anInt7611, 974996221 * Class526_Sub24.anInt10549, true, 1676625790);
                     Class184_Sub2 var9 = Class554.aClass174_7475.method2257();
                     var9.method8465(0, var8.method1773());
                     Class554.aClass174_7475.method2623(var9, (short)128);
                     this.anInterface31_3124.method202(true, (byte)22);
                     Class554.aClass174_7475.method2456(var9, (byte)0);
                     var8.method1774(0, 0, 0, var7, 1);
                     Class554.aClass174_7475.method2623(var9, (short)128);
                     Class554.aClass174_7475.method2283(1, 0);
                     this.anInterface31_3121.method202(true, (byte)30);
                     Class554.aClass174_7475.method2456(var9, (byte)0);
                     var8.method1774(0, 0, 0, var6, 1);
                  } else {
                     if(null != this.anInterface31_3124) {
                        this.aBool3119 = true;
                        this.anInterface31_3124.method203(1518548614);
                        this.anInterface31_3124 = null;
                     }

                     if(this.aBool3119) {
                        Class74.method1112(1668810761);
                        if(Class554.aClass174_7475 != null) {
                           Class554.aClass174_7475.method2283(1, 0);
                        }
                     }

                     this.anInterface31_3121.method202(this.aBool3119 || null != Class554.aClass174_7475 && Class554.aClass174_7475.method2237(), (byte)-62);
                  }

                  try {
                     if(Class554.aClass174_7475 != null && !(this.anInterface31_3121 instanceof Class306)) {
                        Class554.aClass174_7475.method2229((byte)-20);
                     }
                  } catch (Exception_Sub4 var15) {
                     Class375.method4671(var15.getMessage() + Class636.aclient8310.method5959((byte)3), var15, (byte)112);
                     Class285.method3799(0, true, (byte)117);
                  }
               }

               this.aBool3119 = false;
               if(Class554.aClass174_7475 != null && !(this.anInterface31_3121 instanceof Class306) && -264913027 * this.aClass296_3128.anInt3204 < -264913027 * Class296.aClass296_3211.anInt3204) {
                  Class207.method2924(407014271);
               }
            } catch (Exception var16) {
               continue;
            }
         }

         long var12 = Class255.time((byte)24);
         int var14 = (int)(20L - (var12 - var1));
         if(var14 > 0) {
            Class304_Sub1.method9089((long)var14);
         }
      }

   }

   public void method3837() {
      while(!this.aBool3125) {
         long var1 = Class255.time((byte)24);
         synchronized(this) {
            try {
               this.anInt3123 += -1606965653;
               if(this.anInterface31_3121 instanceof Class306) {
                  this.anInterface31_3121.method202(this.aBool3119, (byte)23);
               } else {
                  long var4 = Class255.time((byte)24);
                  if(null != Class554.aClass174_7475 && null != this.anInterface31_3124 && this.anInterface31_3124.method205((byte)-49) != 0 && -8291405423796141703L * this.aLong3122 >= var4 - (long)this.anInterface31_3124.method205((byte)-2)) {
                     int var6 = (int)(255L * (var4 - -8291405423796141703L * this.aLong3122) / (long)this.anInterface31_3124.method205((byte)-39));
                     int var7 = 255 - var6;
                     var6 = var6 << 24 | 16777215;
                     var7 = var7 << 24 | 16777215;
                     Class74.method1112(-459820006);
                     Class554.aClass174_7475.method2283(1, 0);
                     Class153 var8 = Class554.aClass174_7475.method2306(1895615023 * Class566.anInt7611, 974996221 * Class526_Sub24.anInt10549, true, 1676625790);
                     Class184_Sub2 var9 = Class554.aClass174_7475.method2257();
                     var9.method8465(0, var8.method1773());
                     Class554.aClass174_7475.method2623(var9, (short)128);
                     this.anInterface31_3124.method202(true, (byte)-26);
                     Class554.aClass174_7475.method2456(var9, (byte)0);
                     var8.method1774(0, 0, 0, var7, 1);
                     Class554.aClass174_7475.method2623(var9, (short)128);
                     Class554.aClass174_7475.method2283(1, 0);
                     this.anInterface31_3121.method202(true, (byte)-7);
                     Class554.aClass174_7475.method2456(var9, (byte)0);
                     var8.method1774(0, 0, 0, var6, 1);
                  } else {
                     if(null != this.anInterface31_3124) {
                        this.aBool3119 = true;
                        this.anInterface31_3124.method203(-510361095);
                        this.anInterface31_3124 = null;
                     }

                     if(this.aBool3119) {
                        Class74.method1112(405235318);
                        if(Class554.aClass174_7475 != null) {
                           Class554.aClass174_7475.method2283(1, 0);
                        }
                     }

                     this.anInterface31_3121.method202(this.aBool3119 || null != Class554.aClass174_7475 && Class554.aClass174_7475.method2237(), (byte)59);
                  }

                  try {
                     if(Class554.aClass174_7475 != null && !(this.anInterface31_3121 instanceof Class306)) {
                        Class554.aClass174_7475.method2229((byte)-49);
                     }
                  } catch (Exception_Sub4 var15) {
                     Class375.method4671(var15.getMessage() + Class636.aclient8310.method5959((byte)3), var15, (byte)59);
                     Class285.method3799(0, true, (byte)55);
                  }
               }

               this.aBool3119 = false;
               if(Class554.aClass174_7475 != null && !(this.anInterface31_3121 instanceof Class306) && -264913027 * this.aClass296_3128.anInt3204 < -264913027 * Class296.aClass296_3211.anInt3204) {
                  Class207.method2924(407014271);
               }
            } catch (Exception var16) {
               continue;
            }
         }

         long var12 = Class255.time((byte)24);
         int var14 = (int)(20L - (var12 - var1));
         if(var14 > 0) {
            Class304_Sub1.method9089((long)var14);
         }
      }

   }

   public long method3838(int var1) {
      return this.aLong3120 * -61282540661625265L;
   }

   public int method3839() {
      if(this.aClass296_3128 == null) {
         return 0;
      } else {
         int var1 = this.aClass296_3128.anInt3204 * -264913027;
         return this.aClass296_3128.aBool3217 && this.anInt3127 * -317396857 < this.aClass296_3128.anInt3215 * -245183283?1 + -317396857 * this.anInt3127:(var1 >= 0 && var1 < Class291.aClass296Array3135.length - 1?(-317396857 * this.anInt3127 == -1716976061 * this.aClass296_3128.anInt3214?this.aClass296_3128.anInt3215 * -245183283:this.aClass296_3128.anInt3214 * -1716976061):100);
      }
   }

   synchronized void method3840() {
      this.aBool3119 = true;
   }

   public int method3841() {
      return this.anInt3127 * -317396857;
   }

   public int method3842() {
      if(this.aClass296_3128 == null) {
         return 0;
      } else {
         int var1 = this.aClass296_3128.anInt3204 * -264913027;
         return this.aClass296_3128.aBool3217 && this.anInt3127 * -317396857 < this.aClass296_3128.anInt3215 * -245183283?1 + -317396857 * this.anInt3127:(var1 >= 0 && var1 < Class291.aClass296Array3135.length - 1?(-317396857 * this.anInt3127 == -1716976061 * this.aClass296_3128.anInt3214?this.aClass296_3128.anInt3215 * -245183283:this.aClass296_3128.anInt3214 * -1716976061):100);
      }
   }

   synchronized void method3843() {
      this.aBool3119 = true;
   }

   public int method3844() {
      if(this.aClass296_3128 == null) {
         return 0;
      } else {
         int var1 = this.aClass296_3128.anInt3204 * -264913027;
         return this.aClass296_3128.aBool3217 && this.anInt3127 * -317396857 < this.aClass296_3128.anInt3215 * -245183283?1 + -317396857 * this.anInt3127:(var1 >= 0 && var1 < Class291.aClass296Array3135.length - 1?(-317396857 * this.anInt3127 == -1716976061 * this.aClass296_3128.anInt3214?this.aClass296_3128.anInt3215 * -245183283:this.aClass296_3128.anInt3214 * -1716976061):100);
      }
   }

   public Class296 method3845(int var1) {
      return this.aClass296_3128;
   }

   public long method3846() {
      return this.aLong3120 * -61282540661625265L;
   }

   int method3847() {
      return 1165416003 * this.anInt3123;
   }

   void method3848() {
      this.aBool3125 = true;
   }

   void method3849() {
      this.aBool3125 = true;
   }

   public static final void method3850(int var0, String var1, Color var2, Color var3, Color var4, int var5) {
      try {
         Graphics var6 = Class425.aCanvas4798.getGraphics();
         if(Class497.aFont5566 == null) {
            Class497.aFont5566 = new Font("Helvetica", 1, 13);
         }

         if(null == var2) {
            var2 = new Color(140, 17, 17);
         }

         if(var3 == null) {
            var3 = new Color(140, 17, 17);
         }

         if(var4 == null) {
            var4 = new Color(255, 255, 255);
         }

         int var8;
         int var9;
         try {
            if(null == Class461.anImage5204) {
               Class461.anImage5204 = Class425.aCanvas4798.createImage(Class566.anInt7611 * 1895615023, 974996221 * Class526_Sub24.anInt10549);
            }

            Graphics var7 = Class461.anImage5204.getGraphics();
            var7.setColor(Color.black);
            var7.fillRect(0, 0, Class566.anInt7611 * 1895615023, 974996221 * Class526_Sub24.anInt10549);
            var8 = 1895615023 * Class566.anInt7611 / 2 - 152;
            var9 = 974996221 * Class526_Sub24.anInt10549 / 2 - 18;
            var7.setColor(var3);
            var7.drawRect(var8, var9, 303, 33);
            var7.setColor(var2);
            var7.fillRect(var8 + 2, var9 + 2, var0 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(var8 + 1, var9 + 1, 301, 31);
            var7.fillRect(var8 + 2 + var0 * 3, 2 + var9, 300 - 3 * var0, 30);
            var7.setFont(Class497.aFont5566);
            var7.setColor(var4);
            var7.drawString(var1, var8 + (304 - var1.length() * 6) / 2, 22 + var9);
            if(null != Class499.aString5604) {
               var7.setFont(Class497.aFont5566);
               var7.setColor(var4);
               var7.drawString(Class499.aString5604, Class566.anInt7611 * 1895615023 / 2 - Class499.aString5604.length() * 6 / 2, 974996221 * Class526_Sub24.anInt10549 / 2 - 26);
            }

            var6.drawImage(Class461.anImage5204, 0, 0, (ImageObserver)null);
         } catch (Exception var10) {
            var6.setColor(Color.black);
            var6.fillRect(0, 0, 1895615023 * Class566.anInt7611, 974996221 * Class526_Sub24.anInt10549);
            var8 = 1895615023 * Class566.anInt7611 / 2 - 152;
            var9 = Class526_Sub24.anInt10549 * 974996221 / 2 - 18;
            var6.setColor(var3);
            var6.drawRect(var8, var9, 303, 33);
            var6.setColor(var2);
            var6.fillRect(var8 + 2, 2 + var9, 3 * var0, 30);
            var6.setColor(Color.black);
            var6.drawRect(var8 + 1, 1 + var9, 301, 31);
            var6.fillRect(2 + var8 + 3 * var0, var9 + 2, 300 - 3 * var0, 30);
            var6.setFont(Class497.aFont5566);
            var6.setColor(var4);
            if(null != Class499.aString5604) {
               var6.setFont(Class497.aFont5566);
               var6.setColor(var4);
               var6.drawString(Class499.aString5604, 1895615023 * Class566.anInt7611 / 2 - Class499.aString5604.length() * 6 / 2, Class526_Sub24.anInt10549 * 974996221 / 2 - 26);
            }

            var6.drawString(var1, var8 + (304 - var1.length() * 6) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         Class425.aCanvas4798.repaint();
      }

   }

   static final void method3851(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)88);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class605.method7130(var3, var4, var0, (byte)88);
   }

   static final void method3852(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -2059731097 * client.aClass492ArrayArray11265[var3][var2].anInt5521;
   }

   static final void method3853(Class681 var0, byte var1) {
      if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297 && Class195.aClass292_Sub1_2182.method3940(-96577813) == Class298.aClass298_3237) {
         Class446 var2 = ((Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(-1021560947)).method9112(752062561);
         Class446 var3 = ((Class689_Sub3)Class195.aClass292_Sub1_2182.method3938((byte)16)).method10222(-1957887669);
         Class446 var4 = Class446.method5305(var2);
         var4.method5299(var3);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)var4.method5276();
      } else {
         throw new RuntimeException();
      }
   }

   static void method3854(int var0) {
      Class171.aClass553_2016.method6655(731138947);
      Class8.aClass547_45.method6530(1718863819);
      Class636.aclient8310.method5955((byte)-56);
      Class425.aCanvas4798.setBackground(Color.black);
      client.anInt11180 = -1125202889;
      Class171.aClass553_2016 = Class382.method4713(Class425.aCanvas4798, -960126262);
      Class8.aClass547_45 = Class542.method6484(Class425.aCanvas4798, true, 1592447538);
   }

   public static int method3855(byte var0) {
      return 10;
   }
}
