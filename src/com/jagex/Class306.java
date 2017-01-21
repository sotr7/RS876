package com.jagex;

import com.jagex.Class113;
import com.jagex.Class149;
import com.jagex.Class153;
import com.jagex.Class206;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class290;
import com.jagex.Class294;
import com.jagex.Class309;
import com.jagex.Class315;
import com.jagex.Class315_Sub1;
import com.jagex.Class315_Sub1_Sub1;
import com.jagex.Class315_Sub2;
import com.jagex.Class422;
import com.jagex.Class425;
import com.jagex.Class434;
import com.jagex.Class461;
import com.jagex.Class492;
import com.jagex.Class526_Sub24;
import com.jagex.Class545;
import com.jagex.Class566;
import com.jagex.Class661;
import com.jagex.Class681;
import com.jagex.Class69;
import com.jagex.Interface31;
import com.jagex.client;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class306 implements Interface31 {
   boolean aBool3290;
   boolean aBool3289;
   String aString3291;
   String aString3286;
   boolean aBool3287;
   boolean aBool3288;
   List aList3284 = new ArrayList();
   AffineTransform anAffineTransform3285 = new AffineTransform();

   public void method211(boolean var1) {
      if(!this.aBool3289 && !this.aBool3290) {
         this.aBool3290 = true;

         try {
            String[] var2 = Class69.method1085(client.aString11134, '\u007c', (byte)7);
            if(var2.length < 3) {
               this.aBool3289 = true;
            } else {
               MediaTracker var3 = new MediaTracker(Class425.aCanvas4798);
               int var4 = 0;

               for(int var5 = 0; var5 < var2.length; ++var5) {
                  String[] var6 = Class69.method1085(var2[var5].trim(), '\u003d', (byte)7);
                  if(var6[0].equals("halign")) {
                     this.aBool3287 = Boolean.parseBoolean(var6[1]);
                  } else if(var6[0].equals("valign")) {
                     this.aBool3288 = Boolean.parseBoolean(var6[1]);
                  } else {
                     String[] var7;
                     Image var8;
                     if(var6[0].equals("image")) {
                        var7 = Class69.method1085(var6[1], '\u002c', (byte)7);

                        try {
                           var8 = this.method4030(var7[0], -1922225393);
                        } catch (Exception var11) {
                           var8 = null;
                        }

                        if(null != var8) {
                           var3.addImage(var8, var4++);
                           this.aList3284.add(new Class315_Sub1(this, var8, Class661.method7925(var7[1], (byte)86), Class661.method7925(var7[2], (byte)82)));
                        }
                     } else if(var6[0].equals("rotatingimage")) {
                        var7 = Class69.method1085(var6[1], '\u002c', (byte)7);

                        try {
                           var8 = this.method4030(var7[0], -1922225393);
                        } catch (Exception var10) {
                           var8 = null;
                        }

                        if(null != var8) {
                           var3.addImage(var8, var4++);
                           this.aList3284.add(new Class315_Sub1_Sub1(this, var8, Class661.method7925(var7[1], (byte)72), Class661.method7925(var7[2], (byte)53), Float.parseFloat(var7[3])));
                        }
                     } else if(var6[0].equals("progress")) {
                        var7 = Class69.method1085(var6[1], '\u002c', (byte)7);
                        this.aList3284.add(new Class315_Sub2(this, Boolean.parseBoolean(var7[0]), var7[1], Class661.method7925(var7[2], (byte)25), Integer.decode(var7[3]).intValue(), Class661.method7925(var7[4], (byte)69), Class661.method7925(var7[5], (byte)45)));
                     }
                  }
               }

               var3.waitForAll();
            }
         } catch (Exception var13) {
            this.aBool3289 = true;
         }
      }

      if(this.aBool3289) {
         this.method4028(-1114903112);
      } else {
         Graphics var14 = Class425.aCanvas4798.getGraphics();
         if(var14 != null) {
            try {
               this.aString3291 = "" + Class309.aClass290_3377.method3831((byte)-10) + "%";
               this.aString3286 = Class309.aClass290_3377.method3832((byte)15);
               if(Class461.anImage5204 == null) {
                  Class461.anImage5204 = Class425.aCanvas4798.createImage(1895615023 * Class566.anInt7611, 974996221 * Class526_Sub24.anInt10549);
               }

               Graphics var15 = Class461.anImage5204.getGraphics();
               var15.setColor(Color.BLACK);
               var15.fillRect(0, 0, Class566.anInt7611 * 1895615023, 974996221 * Class526_Sub24.anInt10549);
               Iterator var16 = this.aList3284.iterator();

               while(var16.hasNext()) {
                  Class315 var17 = (Class315)var16.next();
                  var17.method4087(var15, -2108394432);
               }

               var14.drawImage(Class461.anImage5204, 0, 0, (ImageObserver)null);
            } catch (Exception var12) {
               this.aBool3289 = true;
            }
         } else {
            Class425.aCanvas4798.repaint();
         }

      }
   }

   final int method4027(int var1, int var2) {
      return this.aBool3287?(1895615023 * Class566.anInt7611 - var1) / 2:0;
   }

   public void method207() {
      Class206.method2906(-998922218);
   }

   public void method202(boolean var1, byte var2) {
      if(!this.aBool3289 && !this.aBool3290) {
         this.aBool3290 = true;

         try {
            String[] var3 = Class69.method1085(client.aString11134, '\u007c', (byte)7);
            if(var3.length < 3) {
               this.aBool3289 = true;
            } else {
               MediaTracker var4 = new MediaTracker(Class425.aCanvas4798);
               int var5 = 0;

               for(int var6 = 0; var6 < var3.length; ++var6) {
                  String[] var7 = Class69.method1085(var3[var6].trim(), '\u003d', (byte)7);
                  if(var7[0].equals("halign")) {
                     this.aBool3287 = Boolean.parseBoolean(var7[1]);
                  } else if(var7[0].equals("valign")) {
                     this.aBool3288 = Boolean.parseBoolean(var7[1]);
                  } else {
                     String[] var8;
                     Image var9;
                     if(var7[0].equals("image")) {
                        var8 = Class69.method1085(var7[1], '\u002c', (byte)7);

                        try {
                           var9 = this.method4030(var8[0], -1922225393);
                        } catch (Exception var12) {
                           var9 = null;
                        }

                        if(null != var9) {
                           var4.addImage(var9, var5++);
                           this.aList3284.add(new Class315_Sub1(this, var9, Class661.method7925(var8[1], (byte)25), Class661.method7925(var8[2], (byte)52)));
                        }
                     } else if(var7[0].equals("rotatingimage")) {
                        var8 = Class69.method1085(var7[1], '\u002c', (byte)7);

                        try {
                           var9 = this.method4030(var8[0], -1922225393);
                        } catch (Exception var11) {
                           var9 = null;
                        }

                        if(null != var9) {
                           var4.addImage(var9, var5++);
                           this.aList3284.add(new Class315_Sub1_Sub1(this, var9, Class661.method7925(var8[1], (byte)102), Class661.method7925(var8[2], (byte)57), Float.parseFloat(var8[3])));
                        }
                     } else if(var7[0].equals("progress")) {
                        var8 = Class69.method1085(var7[1], '\u002c', (byte)7);
                        this.aList3284.add(new Class315_Sub2(this, Boolean.parseBoolean(var8[0]), var8[1], Class661.method7925(var8[2], (byte)16), Integer.decode(var8[3]).intValue(), Class661.method7925(var8[4], (byte)76), Class661.method7925(var8[5], (byte)58)));
                     }
                  }
               }

               var4.waitForAll();
            }
         } catch (Exception var14) {
            this.aBool3289 = true;
         }
      }

      if(this.aBool3289) {
         this.method4028(-1185287765);
      } else {
         Graphics var15 = Class425.aCanvas4798.getGraphics();
         if(var15 != null) {
            try {
               this.aString3291 = "" + Class309.aClass290_3377.method3831((byte)-2) + "%";
               this.aString3286 = Class309.aClass290_3377.method3832((byte)15);
               if(Class461.anImage5204 == null) {
                  Class461.anImage5204 = Class425.aCanvas4798.createImage(1895615023 * Class566.anInt7611, 974996221 * Class526_Sub24.anInt10549);
               }

               Graphics var16 = Class461.anImage5204.getGraphics();
               var16.setColor(Color.BLACK);
               var16.fillRect(0, 0, Class566.anInt7611 * 1895615023, 974996221 * Class526_Sub24.anInt10549);
               Iterator var17 = this.aList3284.iterator();

               while(var17.hasNext()) {
                  Class315 var18 = (Class315)var17.next();
                  var18.method4087(var16, -1257028085);
               }

               var15.drawImage(Class461.anImage5204, 0, 0, (ImageObserver)null);
            } catch (Exception var13) {
               this.aBool3289 = true;
            }
         } else {
            Class425.aCanvas4798.repaint();
         }

      }
   }

   public int method213() {
      return 100;
   }

   void method4028(int var1) {
      Class290.method3850(Class309.aClass290_3377.method3831((byte)-48), Class309.aClass290_3377.method3832((byte)15), client.aColorArray11036[client.anInt10986 * -949066349], client.aColorArray11037[-949066349 * client.anInt10986], client.aColorArray11032[-949066349 * client.anInt10986], -878928266);
   }

   public void method203(int var1) {
      Class206.method2906(-2020171457);
   }

   public void method150(byte var1) {
   }

   public int method206(int var1) {
      return 100;
   }

   public boolean method220(long var1) {
      return true;
   }

   public int method205(byte var1) {
      return 0;
   }

   final int method4029(int var1, int var2) {
      return this.aBool3288?(974996221 * Class526_Sub24.anInt10549 - var1) / 2:0;
   }

   Image method4030(String var1, int var2) throws IOException {
      InputStream var3 = null;

      try {
         Image var8;
         try {
            var3 = Class492.anApplet5526.getClass().getClassLoader().getResourceAsStream(var1);
            byte[] var4 = new byte[12000];
            int var5 = 0;

            while(true) {
               int var6;
               if((var6 = var3.read()) == -1) {
                  Image var7 = Toolkit.getDefaultToolkit().createImage(var4);
                  var3.close();
                  var8 = var7;
                  break;
               }

               var4[var5++] = (byte)var6;
            }
         } catch (Exception var12) {
            throw new IOException();
         }

         if(var3 != null) {
            var3.close();
         }

         return var8;
      } finally {
         if(var3 != null) {
            var3.close();
         }

      }
   }

   final int method4031(int var1) {
      return this.aBool3287?(1895615023 * Class566.anInt7611 - var1) / 2:0;
   }

   final int method4032(int var1) {
      return this.aBool3288?(974996221 * Class526_Sub24.anInt10549 - var1) / 2:0;
   }

   final int method4033(int var1) {
      return this.aBool3287?(1895615023 * Class566.anInt7611 - var1) / 2:0;
   }

   void method4034() {
      Class290.method3850(Class309.aClass290_3377.method3831((byte)-64), Class309.aClass290_3377.method3832((byte)15), client.aColorArray11036[client.anInt10986 * -949066349], client.aColorArray11037[-949066349 * client.anInt10986], client.aColorArray11032[-949066349 * client.anInt10986], -2144120448);
   }

   public void method210() {
      Class206.method2906(252129632);
   }

   final int method4035(int var1) {
      return this.aBool3287?(1895615023 * Class566.anInt7611 - var1) / 2:0;
   }

   public void method208() {
   }

   public int method204() {
      return 100;
   }

   public int method221() {
      return 0;
   }

   public int method219() {
      return 0;
   }

   public boolean method214(long var1) {
      return true;
   }

   public boolean method201(long var1) {
      return true;
   }

   public int method215() {
      return 0;
   }

   public int method209() {
      return 0;
   }

   public int method216() {
      return 100;
   }

   public void method212() {
      Class206.method2906(289223075);
   }

   public int method217() {
      return 0;
   }

   public int method218() {
      return 0;
   }

   public static Class422[] method4036(int var0) {
      return new Class422[]{Class422.aClass422_4725, Class422.aClass422_4734, Class422.aClass422_4726, Class422.aClass422_4727, Class422.aClass422_4728, Class422.aClass422_4736, Class422.aClass422_4730, Class422.aClass422_4729, Class422.aClass422_4732, Class422.aClass422_4731, Class422.aClass422_4735, Class422.aClass422_4724, Class422.aClass422_4733, Class422.aClass422_4737, Class422.aClass422_4738};
   }

   static final void method4037(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-11);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class434.method5144(var3, var4, var0, (byte)-66);
   }

   static final void method4038(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.modelType = -1527767141;
      var0.anInt2539 = -1697811977 * client.localPlayerIndex;
      var0.anInt2540 = 0;
      if(var0.componentSlot * 1300712985 == -1 && !var1.aBool2458) {
         Class545.method6515(var0.uid * 919258769, (byte)75);
      }

   }

   static final void method4039(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Class113[] var7 = client.aClass113Array11018;

      for(int var8 = 0; var8 < var7.length; ++var8) {
         Class113 var9 = var7[var8];
         if(var9 != null && -941650287 * var9.anInt1367 == 2) {
            Class149.method1751(var9.anInt1362 * -1089095561, var9.anInt1363 * 998231709, var9.anInt1365 * 1251476749, 0, 1202078098 * var9.anInt1364, false, false, -579745226);
            if(client.aFloatArray11132[0] > -1.0F && client.anInt11012 % 20 < 10) {
               Class153 var10 = Class294.aClass153Array3188[var9.anInt1360 * -236252675];
               int var11 = (int)((float)var0 + client.aFloatArray11132[0] - 12.0F);
               int var12 = (int)((float)var1 + client.aFloatArray11132[1] - 28.0F);
               var10.method1778(var11, var12);
            }
         }
      }

   }
}
