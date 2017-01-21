package com.jagex;

import com.jagex.Class185;
import com.jagex.Class255;
import com.jagex.Class417;
import com.jagex.Class526_Sub37;
import com.jagex.Class553;
import com.jagex.Class702;
import com.jagex.Interface63;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class553_Sub1 extends Class553 implements KeyListener, FocusListener {
   static final int anInt10806 = 112;
   static final int anInt10810 = 128;
   Component aComponent10811;
   static int[] anIntArray10812 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   Class702 aClass702_10808 = new Class702();
   Class702 aClass702_10809 = new Class702();
   boolean[] aBoolArray10807 = new boolean[112];

   void method9777(Component var1, int var2) {
      this.method9781(1363209583);
      this.aComponent10811 = var1;
      this.aComponent10811.addKeyListener(this);
      this.aComponent10811.addFocusListener(this);
   }

   void method9778(int var1, char var2, int var3, int var4) {
      Class526_Sub37 var5 = new Class526_Sub37();
      var5.anInt10679 = var1 * -253591105;
      var5.aChar10682 = var2;
      var5.anInt10681 = var3 * -1544044973;
      var5.aLong10678 = Class255.time((byte)24) * 7525865541340779273L;
      this.aClass702_10809.method8176(var5, -1863165101);
   }

   public Interface63 method6654(byte var1) {
      return (Interface63)this.aClass702_10808.method8177((short)-474);
   }

   public boolean method6666(int var1, int var2) {
      return var1 >= 0 && var1 < 112?this.aBoolArray10807[var1]:false;
   }

   public synchronized void method6652(int var1) {
      this.aClass702_10808.method8188(-1712310135);

      for(Class526_Sub37 var2 = (Class526_Sub37)this.aClass702_10809.method8177((short)-5055); null != var2; var2 = (Class526_Sub37)this.aClass702_10809.method8177((short)-4581)) {
         var2.anInt10683 = this.method9779(-678914693) * 1224918497;
         if(-1744933313 * var2.anInt10679 == 0) {
            if(!this.aBoolArray10807[1569928667 * var2.anInt10681]) {
               Class526_Sub37 var5 = new Class526_Sub37();
               var5.anInt10679 = 0;
               var5.aChar10682 = '\uffff';
               var5.anInt10681 = 1 * var2.anInt10681;
               var5.aLong10678 = 1L * var2.aLong10678;
               var5.anInt10683 = var2.anInt10683 * 1;
               this.aClass702_10808.method8176(var5, -2129789113);
               this.aBoolArray10807[var2.anInt10681 * 1569928667] = true;
            }

            var2.anInt10679 = -507182210;
            this.aClass702_10808.method8176(var2, -637374887);
         } else if(var2.anInt10679 * -1744933313 == 1) {
            if(this.aBoolArray10807[1569928667 * var2.anInt10681]) {
               this.aClass702_10808.method8176(var2, -1983115611);
               this.aBoolArray10807[1569928667 * var2.anInt10681] = false;
            }
         } else if(-1 == var2.anInt10679 * -1744933313) {
            for(int var3 = 0; var3 < 112; ++var3) {
               if(this.aBoolArray10807[var3]) {
                  Class526_Sub37 var4 = new Class526_Sub37();
                  var4.anInt10679 = -253591105;
                  var4.aChar10682 = '\uffff';
                  var4.anInt10681 = -1544044973 * var3;
                  var4.aLong10678 = 1L * var2.aLong10678;
                  var4.anInt10683 = var2.anInt10683 * 1;
                  this.aClass702_10808.method8176(var4, -78130330);
                  this.aBoolArray10807[var3] = false;
               }
            }
         } else if(3 == var2.anInt10679 * -1744933313) {
            this.aClass702_10808.method8176(var2, -1772530841);
         }
      }

   }

   int method9779(int var1) {
      int var2 = 0;
      if(this.aBoolArray10807[81]) {
         var2 |= 1;
      }

      if(this.aBoolArray10807[82]) {
         var2 |= 4;
      }

      if(this.aBoolArray10807[86]) {
         var2 |= 2;
      }

      return var2;
   }

   public void method6661() {
      this.method9781(463117002);
   }

   void method9780(KeyEvent var1, int var2, int var3) {
      int var4 = var1.getKeyCode();
      if(0 != var4) {
         if(var4 >= 0 && var4 < anIntArray10812.length) {
            var4 = anIntArray10812[var4];
            if(var2 == 0 && 0 != (var4 & 128)) {
               var4 = 0;
            } else {
               var4 &= -129;
            }
         } else {
            var4 = 0;
         }
      } else {
         var4 = 0;
      }

      if(var4 != 0) {
         this.method9778(var2, '\uffff', var4, -431782755);
         var1.consume();
      }
   }

   public synchronized void keyPressed(KeyEvent var1) {
      this.method9780(var1, 0, 1784995245);
   }

   public Interface63 method6651() {
      return (Interface63)this.aClass702_10808.method8177((short)-5351);
   }

   void method9781(int var1) {
      if(this.aComponent10811 != null) {
         this.aComponent10811.removeKeyListener(this);
         this.aComponent10811.removeFocusListener(this);
         this.aComponent10811 = null;

         for(int var2 = 0; var2 < 112; ++var2) {
            this.aBoolArray10807[var2] = false;
         }

         this.aClass702_10808.method8188(482299805);
         this.aClass702_10809.method8188(-1968885043);
      }
   }

   public synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if(var2 != '\uffff' && Class185.method2717(var2, 1316147582)) {
         this.method9778(3, var2, -1, -1988776363);
         var1.consume();
      }
   }

   public void focusGained(FocusEvent var1) {
   }

   static void method9782() {
      anIntArray10812[44] = 71;
      anIntArray10812[45] = 26;
      anIntArray10812[46] = 72;
      anIntArray10812[47] = 73;
      anIntArray10812[59] = 57;
      anIntArray10812[61] = 27;
      anIntArray10812[91] = 42;
      anIntArray10812[92] = 74;
      anIntArray10812[93] = 43;
      anIntArray10812[192] = 28;
      anIntArray10812[222] = 58;
      anIntArray10812[520] = 59;
   }

   static void method9783() {
      anIntArray10812[44] = 71;
      anIntArray10812[45] = 26;
      anIntArray10812[46] = 72;
      anIntArray10812[47] = 73;
      anIntArray10812[59] = 57;
      anIntArray10812[61] = 27;
      anIntArray10812[91] = 42;
      anIntArray10812[92] = 74;
      anIntArray10812[93] = 43;
      anIntArray10812[192] = 28;
      anIntArray10812[222] = 58;
      anIntArray10812[520] = 59;
   }

   static void method9784() {
      anIntArray10812[44] = 71;
      anIntArray10812[45] = 26;
      anIntArray10812[46] = 72;
      anIntArray10812[47] = 73;
      anIntArray10812[59] = 57;
      anIntArray10812[61] = 27;
      anIntArray10812[91] = 42;
      anIntArray10812[92] = 74;
      anIntArray10812[93] = 43;
      anIntArray10812[192] = 28;
      anIntArray10812[222] = 58;
      anIntArray10812[520] = 59;
   }

   void method9785() {
      if(this.aComponent10811 != null) {
         this.aComponent10811.removeKeyListener(this);
         this.aComponent10811.removeFocusListener(this);
         this.aComponent10811 = null;

         for(int var1 = 0; var1 < 112; ++var1) {
            this.aBoolArray10807[var1] = false;
         }

         this.aClass702_10808.method8188(-202183285);
         this.aClass702_10809.method8188(1664729934);
      }
   }

   public synchronized void method6653() {
      this.aClass702_10808.method8188(-1306705776);

      for(Class526_Sub37 var1 = (Class526_Sub37)this.aClass702_10809.method8177((short)30062); null != var1; var1 = (Class526_Sub37)this.aClass702_10809.method8177((short)324)) {
         var1.anInt10683 = this.method9779(816600306) * 1224918497;
         if(-1744933313 * var1.anInt10679 == 0) {
            if(!this.aBoolArray10807[1569928667 * var1.anInt10681]) {
               Class526_Sub37 var4 = new Class526_Sub37();
               var4.anInt10679 = 0;
               var4.aChar10682 = '\uffff';
               var4.anInt10681 = 1 * var1.anInt10681;
               var4.aLong10678 = 1L * var1.aLong10678;
               var4.anInt10683 = var1.anInt10683 * 1;
               this.aClass702_10808.method8176(var4, -1732713412);
               this.aBoolArray10807[var1.anInt10681 * 1569928667] = true;
            }

            var1.anInt10679 = -507182210;
            this.aClass702_10808.method8176(var1, -793402147);
         } else if(var1.anInt10679 * -1744933313 == 1) {
            if(this.aBoolArray10807[1569928667 * var1.anInt10681]) {
               this.aClass702_10808.method8176(var1, -862922764);
               this.aBoolArray10807[1569928667 * var1.anInt10681] = false;
            }
         } else if(-1 == var1.anInt10679 * -1744933313) {
            for(int var2 = 0; var2 < 112; ++var2) {
               if(this.aBoolArray10807[var2]) {
                  Class526_Sub37 var3 = new Class526_Sub37();
                  var3.anInt10679 = -253591105;
                  var3.aChar10682 = '\uffff';
                  var3.anInt10681 = -1544044973 * var2;
                  var3.aLong10678 = 1L * var1.aLong10678;
                  var3.anInt10683 = var1.anInt10683 * 1;
                  this.aClass702_10808.method8176(var3, -1766102344);
                  this.aBoolArray10807[var2] = false;
               }
            }
         } else if(3 == var1.anInt10679 * -1744933313) {
            this.aClass702_10808.method8176(var1, -1510685928);
         }
      }

   }

   public boolean method6656(int var1) {
      return var1 >= 0 && var1 < 112?this.aBoolArray10807[var1]:false;
   }

   public void method6655(int var1) {
      this.method9781(695853494);
   }

   public Interface63 method6657() {
      return (Interface63)this.aClass702_10808.method8177((short)-29922);
   }

   public void method6659() {
      this.method9781(-1786657367);
   }

   void method9786() {
      if(this.aComponent10811 != null) {
         this.aComponent10811.removeKeyListener(this);
         this.aComponent10811.removeFocusListener(this);
         this.aComponent10811 = null;

         for(int var1 = 0; var1 < 112; ++var1) {
            this.aBoolArray10807[var1] = false;
         }

         this.aClass702_10808.method8188(-1376741617);
         this.aClass702_10809.method8188(-148522027);
      }
   }

   public synchronized void keyReleased(KeyEvent var1) {
      this.method9780(var1, 1, 1927451564);
   }

   public void method6664() {
      this.method9781(-2104440778);
   }

   public boolean method6658(int var1) {
      return var1 >= 0 && var1 < 112?this.aBoolArray10807[var1]:false;
   }

   public synchronized void method6662() {
      this.aClass702_10808.method8188(1812796976);

      for(Class526_Sub37 var1 = (Class526_Sub37)this.aClass702_10809.method8177((short)-12274); null != var1; var1 = (Class526_Sub37)this.aClass702_10809.method8177((short)-6597)) {
         var1.anInt10683 = this.method9779(503537595) * 1224918497;
         if(-1744933313 * var1.anInt10679 == 0) {
            if(!this.aBoolArray10807[1569928667 * var1.anInt10681]) {
               Class526_Sub37 var4 = new Class526_Sub37();
               var4.anInt10679 = 0;
               var4.aChar10682 = '\uffff';
               var4.anInt10681 = 1 * var1.anInt10681;
               var4.aLong10678 = 1L * var1.aLong10678;
               var4.anInt10683 = var1.anInt10683 * 1;
               this.aClass702_10808.method8176(var4, -97565549);
               this.aBoolArray10807[var1.anInt10681 * 1569928667] = true;
            }

            var1.anInt10679 = -507182210;
            this.aClass702_10808.method8176(var1, -2089759889);
         } else if(var1.anInt10679 * -1744933313 == 1) {
            if(this.aBoolArray10807[1569928667 * var1.anInt10681]) {
               this.aClass702_10808.method8176(var1, -738072068);
               this.aBoolArray10807[1569928667 * var1.anInt10681] = false;
            }
         } else if(-1 == var1.anInt10679 * -1744933313) {
            for(int var2 = 0; var2 < 112; ++var2) {
               if(this.aBoolArray10807[var2]) {
                  Class526_Sub37 var3 = new Class526_Sub37();
                  var3.anInt10679 = -253591105;
                  var3.aChar10682 = '\uffff';
                  var3.anInt10681 = -1544044973 * var2;
                  var3.aLong10678 = 1L * var1.aLong10678;
                  var3.anInt10683 = var1.anInt10683 * 1;
                  this.aClass702_10808.method8176(var3, -1960764112);
                  this.aBoolArray10807[var2] = false;
               }
            }
         } else if(3 == var1.anInt10679 * -1744933313) {
            this.aClass702_10808.method8176(var1, -1238501118);
         }
      }

   }

   public synchronized void focusLost(FocusEvent var1) {
      this.method9778(-1, '\u0000', 0, 2090653251);
   }

   Class553_Sub1(Component var1) {
      Class417.method4943(-1655265277);
      this.method9777(var1, 1459418958);
   }

   public synchronized void method9787(FocusEvent var1) {
      this.method9778(-1, '\u0000', 0, 342183948);
   }

   public void method9788(FocusEvent var1) {
   }

   public void method9789(FocusEvent var1) {
   }

   public void method9790(FocusEvent var1) {
   }

   public void method9791(FocusEvent var1) {
   }

   public void method6660() {
      this.method9781(724830729);
   }

   public synchronized void method6663() {
      this.aClass702_10808.method8188(1890936629);

      for(Class526_Sub37 var1 = (Class526_Sub37)this.aClass702_10809.method8177((short)27411); null != var1; var1 = (Class526_Sub37)this.aClass702_10809.method8177((short)6017)) {
         var1.anInt10683 = this.method9779(1719894867) * 1224918497;
         if(-1744933313 * var1.anInt10679 == 0) {
            if(!this.aBoolArray10807[1569928667 * var1.anInt10681]) {
               Class526_Sub37 var4 = new Class526_Sub37();
               var4.anInt10679 = 0;
               var4.aChar10682 = '\uffff';
               var4.anInt10681 = 1 * var1.anInt10681;
               var4.aLong10678 = 1L * var1.aLong10678;
               var4.anInt10683 = var1.anInt10683 * 1;
               this.aClass702_10808.method8176(var4, -1961989959);
               this.aBoolArray10807[var1.anInt10681 * 1569928667] = true;
            }

            var1.anInt10679 = -507182210;
            this.aClass702_10808.method8176(var1, -841648697);
         } else if(var1.anInt10679 * -1744933313 == 1) {
            if(this.aBoolArray10807[1569928667 * var1.anInt10681]) {
               this.aClass702_10808.method8176(var1, -187735622);
               this.aBoolArray10807[1569928667 * var1.anInt10681] = false;
            }
         } else if(-1 == var1.anInt10679 * -1744933313) {
            for(int var2 = 0; var2 < 112; ++var2) {
               if(this.aBoolArray10807[var2]) {
                  Class526_Sub37 var3 = new Class526_Sub37();
                  var3.anInt10679 = -253591105;
                  var3.aChar10682 = '\uffff';
                  var3.anInt10681 = -1544044973 * var2;
                  var3.aLong10678 = 1L * var1.aLong10678;
                  var3.anInt10683 = var1.anInt10683 * 1;
                  this.aClass702_10808.method8176(var3, -281276430);
                  this.aBoolArray10807[var2] = false;
               }
            }
         } else if(3 == var1.anInt10679 * -1744933313) {
            this.aClass702_10808.method8176(var1, -278211595);
         }
      }

   }

   public synchronized void method6665() {
      this.aClass702_10808.method8188(-1876258586);

      for(Class526_Sub37 var1 = (Class526_Sub37)this.aClass702_10809.method8177((short)6411); null != var1; var1 = (Class526_Sub37)this.aClass702_10809.method8177((short)12371)) {
         var1.anInt10683 = this.method9779(1879452570) * 1224918497;
         if(-1744933313 * var1.anInt10679 == 0) {
            if(!this.aBoolArray10807[1569928667 * var1.anInt10681]) {
               Class526_Sub37 var4 = new Class526_Sub37();
               var4.anInt10679 = 0;
               var4.aChar10682 = '\uffff';
               var4.anInt10681 = 1 * var1.anInt10681;
               var4.aLong10678 = 1L * var1.aLong10678;
               var4.anInt10683 = var1.anInt10683 * 1;
               this.aClass702_10808.method8176(var4, -535763733);
               this.aBoolArray10807[var1.anInt10681 * 1569928667] = true;
            }

            var1.anInt10679 = -507182210;
            this.aClass702_10808.method8176(var1, -763342469);
         } else if(var1.anInt10679 * -1744933313 == 1) {
            if(this.aBoolArray10807[1569928667 * var1.anInt10681]) {
               this.aClass702_10808.method8176(var1, -1936609364);
               this.aBoolArray10807[1569928667 * var1.anInt10681] = false;
            }
         } else if(-1 == var1.anInt10679 * -1744933313) {
            for(int var2 = 0; var2 < 112; ++var2) {
               if(this.aBoolArray10807[var2]) {
                  Class526_Sub37 var3 = new Class526_Sub37();
                  var3.anInt10679 = -253591105;
                  var3.aChar10682 = '\uffff';
                  var3.anInt10681 = -1544044973 * var2;
                  var3.aLong10678 = 1L * var1.aLong10678;
                  var3.anInt10683 = var1.anInt10683 * 1;
                  this.aClass702_10808.method8176(var3, -1106271653);
                  this.aBoolArray10807[var2] = false;
               }
            }
         } else if(3 == var1.anInt10679 * -1744933313) {
            this.aClass702_10808.method8176(var1, -152383517);
         }
      }

   }
}
