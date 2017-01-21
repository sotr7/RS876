package com.jagex;

import com.jagex.Canvas_Sub1;
import com.jagex.Class10;
import com.jagex.Class143_Sub2;
import com.jagex.Class149_Sub1;
import com.jagex.Class152;
import com.jagex.Class18;
import com.jagex.Class184_Sub1;
import com.jagex.Class199;
import com.jagex.Class199_Sub1;
import com.jagex.Class199_Sub9;
import com.jagex.Class21;
import com.jagex.Class217;
import com.jagex.Class219;
import com.jagex.Class222;
import com.jagex.Class23;
import com.jagex.Class242;
import com.jagex.Class255;
import com.jagex.Class280;
import com.jagex.Class289;
import com.jagex.Class304_Sub1;
import com.jagex.NPCDef;
import com.jagex.Class313_Sub1;
import com.jagex.Class32;
import com.jagex.Class332;
import com.jagex.Class339;
import com.jagex.Class342;
import com.jagex.Class375;
import com.jagex.Class380;
import com.jagex.Class425;
import com.jagex.Class446;
import com.jagex.Class454;
import com.jagex.Class461;
import com.jagex.Class471;
import com.jagex.Class484;
import com.jagex.Class488;
import com.jagex.Class492;
import com.jagex.Class495;
import com.jagex.Class497;
import com.jagex.Class500;
import com.jagex.Class503;
import com.jagex.Class504;
import com.jagex.Class520;
import com.jagex.Class526_Sub18;
import com.jagex.Class526_Sub24;
import com.jagex.RSByteBuffer;
import com.jagex.Class53;
import com.jagex.Class566;
import com.jagex.Class570;
import com.jagex.RenderDef;
import com.jagex.Class585;
import com.jagex.Class586;
import com.jagex.Class593;
import com.jagex.Class595;
import com.jagex.Class620;
import com.jagex.Class661;
import com.jagex.Class662;
import com.jagex.Class665;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class710;
import com.jagex.Class77;
import com.jagex.Class99;
import com.jagex.Exception_Sub7;
import com.jagex.Interface62;
import com.jagex.RuntimeException_Sub3;
import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public abstract class Class499 implements Interface62, Runnable, FocusListener, WindowListener {
   static final int anInt5597 = 32;
   public static int anInt5601;
   public static Frame aFrame5603;
   static final int anInt5610 = 1048576;
   static final long aLong5612 = 3221225472L;
   static final String aString5613 = "main_file_cache.idx255";
   static final String aString5614 = "rw";
   static final String aString5615 = "main_file_cache.dat2";
   static final String aString5617 = "random.dat";
   static final String aString5620 = "main_file_cache.idx";
   static final int anInt5622 = 0;
   static final int anInt5623 = 1;
   static Class23 aClass23_5619 = null;
   protected static Class23 aClass23_5595 = null;
   protected static Class23 aClass23_5621 = null;
   protected static volatile boolean aBool5606 = true;
   protected static volatile boolean aBool5608 = false;
   static boolean aBool5626 = false;
   static long aLong5625 = 0L;
   protected static boolean aBool5593 = false;
   boolean aBool5616 = false;
   static volatile boolean aBool5611 = true;
   static volatile long aLong5609 = 0L;
   boolean aBool5596 = false;
   static long aLong5602 = -7005309302959976704L;
   public static int anInt5627 = 0;
   public static int anInt5618 = 0;
   static long[] aLongArray5598 = new long[32];
   static long[] aLongArray5600 = new long[32];
   public static int anInt5594 = 0;
   public static int anInt5605 = 0;
   protected static String aString5604 = null;
   static int anInt5607 = -1721286148;
   static Class504 aClass504_5624 = null;
   public static int anInt5628 = -2040371281;
   public static int anInt5629 = 943957533;
   static int anInt5630;
   static int anInt5599;

   void method5947() {
      long var1 = Class255.time((byte)24);
      long var3 = aLongArray5600[205105959 * Class280.anInt3039];
      aLongArray5600[Class280.anInt3039 * 205105959] = var1;
      Class280.anInt3039 = 412816535 * (Class280.anInt3039 * 205105959 + 1 & 31);
      if(var3 != 0L && var1 > var3) {
         ;
      }

      synchronized(this) {
         Class10.aBool64 = aBool5611;
      }

      this.method5965((byte)-75);
   }

   abstract void method5948();

   static void method5949() {
      try {
         File var0 = new File(Class661.aString8517, "random.dat");
         int var2;
         if(var0.exists()) {
            aClass23_5619 = new Class23(new Class21(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var1 = 0; var1 < Class313_Sub1.aStringArray10013.length; ++var1) {
               for(var2 = 0; var2 < Class184_Sub1.aStringArray9201.length; ++var2) {
                  File var3 = new File(Class184_Sub1.aStringArray9201[var2] + Class313_Sub1.aStringArray10013[var1] + File.separatorChar + "random.dat");
                  if(var3.exists()) {
                     aClass23_5619 = new Class23(new Class21(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if(aClass23_5619 == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            aClass23_5619 = new Class23(new Class21(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var4) {
         ;
      }

   }

   final void method5950(String var1, String var2, int var3, int var4, int var5, int var6, int var7) throws Exception {
      Class199.anInt2200 = var4 * -359522127;
      Class471.anInt5361 = var3 * 2014826915;
      RuntimeException_Sub3.anInt12068 = -333195369 * var5;
      RuntimeException_Sub3.anInt12066 = -1022312157 * var6;
      Class484.aString5485 = "Unknown";
      Class595.aString7849 = "1.1";

      try {
         Class484.aString5485 = System.getProperty("java.vendor");
         Class595.aString7849 = System.getProperty("java.version");
      } catch (Exception var20) {
         ;
      }

      try {
         Class339.aString3529 = System.getProperty("os.name");
      } catch (Exception var19) {
         Class339.aString3529 = "Unknown";
      }

      Class222.aString2308 = Class339.aString3529.toLowerCase();

      try {
         Class679.aString8601 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var18) {
         Class679.aString8601 = "";
      }

      try {
         Class570.aString7658 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var17) {
         Class570.aString7658 = "";
      }

      try {
         Class661.aString8517 = System.getProperty("user.home");
         if(null != Class661.aString8517) {
            Class661.aString8517 = Class661.aString8517 + "/";
         }
      } catch (Exception var16) {
         ;
      }

      try {
         if(Class222.aString2308.startsWith("win")) {
            if(Class661.aString8517 == null) {
               Class661.aString8517 = System.getenv("USERPROFILE");
            }
         } else if(null == Class661.aString8517) {
            Class661.aString8517 = System.getenv("HOME");
         }

         if(null != Class661.aString8517) {
            Class661.aString8517 = Class661.aString8517 + "/";
         }
      } catch (Exception var15) {
         ;
      }

      if(null == Class661.aString8517) {
         Class661.aString8517 = "~/";
      }

      try {
         Class495.anEventQueue5540 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var14) {
         ;
      }

      Class184_Sub1.aStringArray9201 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class661.aString8517, "/tmp/", ""};
      Class313_Sub1.aStringArray10013 = new String[]{".jagex_cache_" + Class471.anInt5361 * -320214517, ".file_store_" + Class471.anInt5361 * -320214517};
      int var8 = 0;

      int var11;
      label131:
      while(var8 < 4) {
         Class199_Sub1.aFile9868 = this.method5951(var1, var2, var8, -1019384485);
         if(!Class199_Sub1.aFile9868.exists()) {
            Class199_Sub1.aFile9868.mkdirs();
         }

         File[] var9 = Class199_Sub1.aFile9868.listFiles();
         if(var9 == null) {
            break;
         }

         File[] var10 = var9;
         var11 = 0;

         while(true) {
            if(var11 >= var10.length) {
               break label131;
            }

            File var12 = var10[var11];
            if(!this.method5953(var12, false, -1659933871)) {
               ++var8;
               break;
            }

            ++var11;
         }
      }

      Class488.method5861(Class199_Sub1.aFile9868, 173713324);
      Class217.method2988(206305741);
      aClass23_5595 = new Class23(new Class21(Class526_Sub24.method9481("main_file_cache.dat2", 1446483889), "rw", 3221225472L), 5200, 0);
      aClass23_5621 = new Class23(new Class21(Class526_Sub24.method9481("main_file_cache.idx255", 913308700), "rw", 1048576L), 6000, 0);
      Class679.aClass23Array8603 = new Class23[120072273 * Class199.anInt2200];

      for(var8 = 0; var8 < Class199.anInt2200 * 120072273; ++var8) {
         Class679.aClass23Array8603[var8] = new Class23(new Class21(Class526_Sub24.method9481("main_file_cache.idx" + var8, 21949972), "rw", 1048576L), 6000, 0);
      }

      try {
         Class342.aClass690_3559 = new Class690();
      } catch (Exception var13) {
         Class710.aBool8850 = false;
      }

      Class662.aClass500_8521 = new Class500();
      ThreadGroup var21 = Thread.currentThread().getThreadGroup();

      for(ThreadGroup var22 = var21.getParent(); null != var22; var22 = var22.getParent()) {
         var21 = var22;
      }

      Thread[] var24 = new Thread[1000];
      var21.enumerate(var24);

      for(var11 = 0; var11 < var24.length; ++var11) {
         if(var24[var11] != null && var24[var11].getName().startsWith("AWT")) {
            var24[var11].setPriority(1);
         }
      }

      Thread var23 = new Thread(this);
      var23.setDaemon(true);
      var23.start();
      var23.setPriority(1);
   }

   File method5951(String var1, String var2, int var3, int var4) {
      String var5 = 0 == var3?"":"" + var3;
      Class143_Sub2.aFile8965 = new File(Class661.aString8517, "jagex_cl_" + var1 + "_" + var2 + var5 + ".dat");
      String var6 = null;
      String var7 = null;
      boolean var8 = false;
      File var21;
      if(Class143_Sub2.aFile8965.exists()) {
         try {
            Class21 var9 = new Class21(Class143_Sub2.aFile8965, "rw", 10000L);

            RSByteBuffer var10;
            int var11;
            for(var10 = new RSByteBuffer((int)var9.method658((byte)-44)); var10.pos * 301018015 < var10.buffer.length; var10.pos += var11 * 801976415) {
               var11 = var9.method653(var10.buffer, var10.pos * 301018015, var10.buffer.length - 301018015 * var10.pos, (byte)73);
               if(-1 == var11) {
                  throw new IOException();
               }
            }

            var10.pos = 0;
            var11 = var10.readUnsignedByte(-195482503);
            if(var11 < 1 || var11 > 3) {
               throw new IOException("" + var11);
            }

            int var12 = 0;
            if(var11 > 1) {
               var12 = var10.readUnsignedByte(-1454172855);
            }

            if(var11 <= 2) {
               var6 = var10.method9637(-1495866034);
               if(var12 == 1) {
                  var7 = var10.method9637(-1495866034);
               }
            } else {
               var6 = var10.method9638(-131225323);
               if(1 == var12) {
                  var7 = var10.method9638(-638539755);
               }
            }

            var9.method651(630484824);
         } catch (IOException var18) {
            var18.printStackTrace();
         }

         if(var6 != null) {
            var21 = new File(var6);
            if(!var21.exists()) {
               var6 = null;
            }
         }

         if(null != var6) {
            var21 = new File(var6, "test.dat");
            if(!this.method5953(var21, true, -2095304365)) {
               var6 = null;
            }
         }
      }

      if(var6 == null && 0 == var3) {
         label103:
         for(int var19 = 0; var19 < Class313_Sub1.aStringArray10013.length; ++var19) {
            for(int var22 = 0; var22 < Class184_Sub1.aStringArray9201.length; ++var22) {
               File var23 = new File(Class184_Sub1.aStringArray9201[var22] + Class313_Sub1.aStringArray10013[var19] + File.separatorChar + var1 + File.separatorChar);
               if(var23.exists() && this.method5953(new File(var23, "test.dat"), true, -2036306055)) {
                  var6 = var23.toString();
                  var8 = true;
                  break label103;
               }
            }
         }
      }

      if(var6 == null) {
         var6 = Class661.aString8517 + File.separatorChar + "jagexcache" + var5 + File.separatorChar + var1 + File.separatorChar + var2 + File.separatorChar;
         var8 = true;
      }

      if(null != var7) {
         File var20 = new File(var7);
         var21 = new File(var6);

         try {
            File[] var24 = var20.listFiles();
            File[] var25 = var24;

            for(int var13 = 0; var13 < var25.length; ++var13) {
               File var14 = var25[var13];
               File var15 = new File(var21, var14.getName());
               boolean var16 = var14.renameTo(var15);
               if(!var16) {
                  throw new IOException();
               }
            }
         } catch (Exception var17) {
            var17.printStackTrace();
         }

         var8 = true;
      }

      if(var8) {
         this.method6004(new File(var6), (File)null, (byte)8);
      }

      return new File(var6);
   }

   synchronized void method5952() {
      this.method5998((byte)0);
      Container var1 = Class152.method1757((byte)7);
      Class425.aCanvas4798 = new Canvas_Sub1(var1);
      this.method5968(var1, (byte)28);
   }

   boolean method5953(File var1, boolean var2, int var3) {
      try {
         RandomAccessFile var4 = new RandomAccessFile(var1, "rw");
         int var5 = var4.read();
         var4.seek(0L);
         var4.write(var5);
         var4.seek(0L);
         var4.close();
         if(var2) {
            var1.delete();
         }

         return true;
      } catch (Exception var6) {
         return false;
      }
   }

   synchronized void method5954(String var1, int var2) {
      Class242.aFrame2454 = new Frame();
      Class242.aFrame2454.setTitle(var1);
      Class242.aFrame2454.setResizable(true);
      Class242.aFrame2454.addWindowListener(this);
      Class242.aFrame2454.setBackground(Color.black);
      Class242.aFrame2454.setVisible(true);
      Class242.aFrame2454.toFront();
      Insets var3 = Class242.aFrame2454.getInsets();
      Class242.aFrame2454.setSize(Class332.anInt3505 * 1405944805 + var3.left + var3.right, 542147681 * Class586.anInt7792 + var3.top + var3.bottom);
   }

   synchronized void method5955(byte var1) {
      this.method5998((byte)0);
      Container var2 = Class152.method1757((byte)4);
      Class425.aCanvas4798 = new Canvas_Sub1(var2);
      this.method5968(var2, (byte)37);
   }

   abstract void method5956();

   final boolean method5957(int var1) {
      String var2 = Class492.anApplet5526.getDocumentBase().getHost().toLowerCase();
      if(!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if(!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if(!var2.equals("stellardawn.com") && !var2.endsWith(".stellardawn.com")) {
               if(var2.endsWith("127.0.0.1") || var2.endsWith("192.99.38.108")) {
                  return true;
               } else {
                  while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48 && var2.charAt(var2.length() - 1) <= 57) {
                     var2 = var2.substring(0, var2.length() - 1);
                  }

                  if(var2.endsWith("192.168.1.")) {
                     return true;
                  } else {
                     this.method5963("invalidhost", -845113385);
                     return false;
                  }
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public final synchronized void paint(Graphics var1) {
      if(!aBool5626) {
         aBool5606 = true;
         if(Class255.time((byte)24) - aLong5609 * 7003511818984948745L > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= 1405944805 * Class332.anInt3505 && var2.height >= Class586.anInt7792 * 542147681) {
               aBool5608 = true;
            }
         }

      }
   }

   abstract void method5958();

   String method5959(byte var1) {
      return null;
   }

   final void method5960(boolean var1, int var2) {
      synchronized(this) {
         if(aBool5626) {
            return;
         }

         aBool5626 = true;
      }

      try {
         this.method5985(-362607704);
      } catch (Exception var7) {
         ;
      }

      try {
         aClass23_5595.method678((short)31450);

         for(int var3 = 0; var3 < Class199.anInt2200 * 120072273; ++var3) {
            Class679.aClass23Array8603[var3].method678((short)13354);
         }

         aClass23_5621.method678((short)28649);
         aClass23_5619.method678((short)20311);
      } catch (Exception var8) {
         ;
      }

      if(this.aBool5596) {
         try {
            QueryPerformanceCounter.quit();
         } catch (Throwable var6) {
            ;
         }
      }

      if(Class289.method3822(-1288806778)) {
         Class520.method6248(-494731560).method398(-1181563247);
      }

      if(null != Class425.aCanvas4798) {
         try {
            Class425.aCanvas4798.removeFocusListener(this);
            Class425.aCanvas4798.getParent().remove(Class425.aCanvas4798);
         } catch (Exception var5) {
            ;
         }
      }

      if(Class242.aFrame2454 != null) {
         Class242.aFrame2454.setVisible(false);
         Class242.aFrame2454.dispose();
         Class242.aFrame2454 = null;
      }

   }

   public void start() {
      if(!aBool5626) {
         aLong5625 = 0L;
      }
   }

   public void stop() {
      if(!aBool5626) {
         aLong5625 = (Class255.time((byte)24) + 4000L) * -1101171135082973491L;
      }
   }

   public final void windowClosing(WindowEvent var1) {
      aBool5593 = true;
      this.destroy();
   }

   public static final void method5961() {
      Class461.anImage5204 = null;
      Class497.aFont5566 = null;
   }

   synchronized void method5962(String var1) {
      Class242.aFrame2454 = new Frame();
      Class242.aFrame2454.setTitle(var1);
      Class242.aFrame2454.setResizable(true);
      Class242.aFrame2454.addWindowListener(this);
      Class242.aFrame2454.setBackground(Color.black);
      Class242.aFrame2454.setVisible(true);
      Class242.aFrame2454.toFront();
      Insets var2 = Class242.aFrame2454.getInsets();
      Class242.aFrame2454.setSize(Class332.anInt3505 * 1405944805 + var2.left + var2.right, 542147681 * Class586.anInt7792 + var2.top + var2.bottom);
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   void method5963(String var1, int var2) {
      if(!this.aBool5616) {
         this.aBool5616 = true;
         System.out.println("error_game_" + var1);

         try {
            Class53.method968(Class492.anApplet5526, "loggedout", -451212906);
         } catch (Throwable var5) {
            ;
         }

         try {
            Class492.anApplet5526.getAppletContext().showDocument(new URL(Class492.anApplet5526.getCodeBase(), "error_game_" + var1 + ".ws"), "_top");
         } catch (Exception var4) {
            ;
         }

      }
   }

   public abstract void init();

   abstract void method5964(byte var1);

   abstract void method5965(byte var1);

   abstract void method5966(int var1);

   String method5967() {
      return null;
   }

   void method5968(Container var1, byte var2) {
      var1.setBackground(Color.black);
      var1.setLayout((LayoutManager)null);
      var1.add(Class425.aCanvas4798);
      Class425.aCanvas4798.setSize(1895615023 * Class566.anInt7611, Class526_Sub24.anInt10549 * 974996221);
      Class425.aCanvas4798.setVisible(true);
      if(var1 == Class242.aFrame2454) {
         Insets var3 = Class242.aFrame2454.getInsets();
         Class425.aCanvas4798.setLocation(anInt5594 * -1115728897 + var3.left, var3.top + anInt5605 * 1208004069);
      } else {
         Class425.aCanvas4798.setLocation(anInt5594 * -1115728897, anInt5605 * 1208004069);
      }

      Class425.aCanvas4798.addFocusListener(this);
      Class425.aCanvas4798.requestFocus();
      Class10.aBool64 = true;
      aBool5611 = true;
      Class425.aCanvas4798.setFocusTraversalKeysEnabled(false);
      aBool5606 = true;
      aBool5608 = false;
      aLong5609 = Class255.time((byte)24) * 7992522160537586233L;
   }

   public void method5969(int var1) throws Exception_Sub7 {
      if(!this.aBool5596) {
         Class520.method6248(-84557362).method403("jaclib", (byte)30);

         try {
            QueryPerformanceCounter.init();
         } catch (Throwable var3) {
            if(Class222.aString2308.startsWith("win")) {
               throw new Exception_Sub7(128, "jaclib");
            }
         }

         this.aBool5596 = true;
      }
   }

   public void method5970() {
      try {
         try {
            this.method5997(1913526047);
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            Class375.method4671(this.method5959((byte)3), var7, (byte)22);
            this.method5963("crash", -209946050);
            this.method5960(true, 1510429463);
            return;
         }

         this.method5960(true, 1510429463);
      } finally {
         this.method5960(true, 1510429463);
      }
   }

   public void method5971() {
      try {
         try {
            this.method5997(1770140861);
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            Class375.method4671(this.method5959((byte)3), var7, (byte)85);
            this.method5963("crash", -618928860);
            this.method5960(true, 1510429463);
            return;
         }

         this.method5960(true, 1510429463);
      } finally {
         this.method5960(true, 1510429463);
      }
   }

   abstract void method5972();

   abstract void method5973();

   public final void focusLost(FocusEvent var1) {
      aBool5611 = false;
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   abstract void method5974();

   abstract void method5975();

   public void method409(Applet var1) {
      Class492.anApplet5526 = var1;
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   abstract void method5976();

   public final void method5977(FocusEvent var1) {
      aBool5611 = true;
      aBool5606 = true;
   }

   public static void method5978(RSByteBuffer var0) {
      byte[] var1 = new byte[24];

      try {
         aClass23_5619.method679(0L);
         aClass23_5619.method681(var1, -1422843058);

         int var2;
         for(var2 = 0; var2 < 24 && var1[var2] == 0; ++var2) {
            ;
         }

         if(var2 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var3 = 0; var3 < 24; ++var3) {
            var1[var3] = -1;
         }
      }

      var0.method9619(var1, 0, 24, 1242834630);
   }

   public static void method5979(RSByteBuffer var0) {
      byte[] var1 = new byte[24];

      try {
         aClass23_5619.method679(0L);
         aClass23_5619.method681(var1, -1422843058);

         int var2;
         for(var2 = 0; var2 < 24 && var1[var2] == 0; ++var2) {
            ;
         }

         if(var2 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var3 = 0; var3 < 24; ++var3) {
            var1[var3] = -1;
         }
      }

      var0.method9619(var1, 0, 24, 1816974636);
   }

   void method5980() {
      if(null != Class425.aCanvas4798) {
         Class425.aCanvas4798.removeFocusListener(this);
         Class425.aCanvas4798.getParent().setBackground(Color.black);
         Class425.aCanvas4798.getParent().remove(Class425.aCanvas4798);
      }

   }

   synchronized void method5981(String var1) {
      Class242.aFrame2454 = new Frame();
      Class242.aFrame2454.setTitle(var1);
      Class242.aFrame2454.setResizable(true);
      Class242.aFrame2454.addWindowListener(this);
      Class242.aFrame2454.setBackground(Color.black);
      Class242.aFrame2454.setVisible(true);
      Class242.aFrame2454.toFront();
      Insets var2 = Class242.aFrame2454.getInsets();
      Class242.aFrame2454.setSize(Class332.anInt3505 * 1405944805 + var2.left + var2.right, 542147681 * Class586.anInt7792 + var2.top + var2.bottom);
   }

   synchronized void method5982() {
      this.method5998((byte)0);
      Container var1 = Class152.method1757((byte)-78);
      Class425.aCanvas4798 = new Canvas_Sub1(var1);
      this.method5968(var1, (byte)110);
   }

   synchronized void method5983() {
      this.method5998((byte)0);
      Container var1 = Class152.method1757((byte)-4);
      Class425.aCanvas4798 = new Canvas_Sub1(var1);
      this.method5968(var1, (byte)53);
   }

   void method5984(int var1) {
      long var2 = Class255.time((byte)24);
      long var4 = aLongArray5600[205105959 * Class280.anInt3039];
      aLongArray5600[Class280.anInt3039 * 205105959] = var2;
      Class280.anInt3039 = 412816535 * (Class280.anInt3039 * 205105959 + 1 & 31);
      if(var4 != 0L && var2 > var4) {
         ;
      }

      synchronized(this) {
         Class10.aBool64 = aBool5611;
      }

      this.method5965((byte)29);
   }

   abstract void method5985(int var1);

   void method5986() {
      if(null != Class425.aCanvas4798) {
         Class425.aCanvas4798.removeFocusListener(this);
         Class425.aCanvas4798.getParent().setBackground(Color.black);
         Class425.aCanvas4798.getParent().remove(Class425.aCanvas4798);
      }

   }

   void method5987() {
      if(null != Class425.aCanvas4798) {
         Class425.aCanvas4798.removeFocusListener(this);
         Class425.aCanvas4798.getParent().setBackground(Color.black);
         Class425.aCanvas4798.getParent().remove(Class425.aCanvas4798);
      }

   }

   public final void windowClosed(WindowEvent var1) {
   }

   void method5988() {
      if(null != Class484.aString5485) {
         String var1 = Class484.aString5485.toLowerCase();
         if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
            String var2 = Class595.aString7849;
            if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
               this.method5963("wrongjava", -632913418);
               return;
            }

            if(var2.startsWith("1.6.0_")) {
               int var3;
               for(var3 = 6; var3 < var2.length() && Class593.method7030(var2.charAt(var3), -584166481); ++var3) {
                  ;
               }

               String var4 = var2.substring(6, var3);
               if(Class620.method7346(var4, 914412867) && Class661.method7925(var4, (byte)71) < 10) {
                  this.method5963("wrongjava", -1682943019);
                  return;
               }
            }
         }
      }

      Class152.method1757((byte)-11).setFocusCycleRoot(true);
      anInt5628 = ((int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 2040371281;
      anInt5629 = Runtime.getRuntime().availableProcessors() * 943957533;
      this.method5955((byte)-17);
      this.method5964((byte)1);
      Class593.aClass513_7819 = Class380.method4703(904930923);

      while(0L == aLong5625 * 4962512506555704837L || Class255.time((byte)24) < aLong5625 * 4962512506555704837L) {
         anInt5630 = Class593.aClass513_7819.method6189(aLong5602 * -3030308582349352637L) * 212032041;

         for(int var5 = 0; var5 < anInt5630 * 1364517401; ++var5) {
            this.method5984(546844348);
         }

         this.method5995((byte)75);
         Class199_Sub9.method9008(Class425.aCanvas4798, (byte)-11);
      }

   }

   void method5989() {
      long var1 = Class255.time((byte)24);
      long var3 = aLongArray5598[155294985 * anInt5599 - 1 & 31];
      long var5 = aLongArray5598[155294985 * anInt5599];
      aLongArray5598[155294985 * anInt5599] = var1;
      anInt5599 = (anInt5599 * 155294985 + 1 & 31) * -1320222407;
      if(var5 != 0L && var1 > var5) {
         int var7 = (int)(var1 - var5);
         anInt5618 = (int)(var1 - var3) * -165791743;
         anInt5627 = 2031188447 * (((var7 >> 1) + 32000) / var7);
      }

      if((anInt5607 += 537723307) * -86642429 - 1 > 50) {
         anInt5607 -= 1116361574;
         aBool5606 = true;
         Class425.aCanvas4798.setSize(Class566.anInt7611 * 1895615023, 974996221 * Class526_Sub24.anInt10549);
         Class425.aCanvas4798.setVisible(true);
         if(Class242.aFrame2454 != null && aFrame5603 == null) {
            Insets var8 = Class242.aFrame2454.getInsets();
            Class425.aCanvas4798.setLocation(var8.left + -1115728897 * anInt5594, var8.top + 1208004069 * anInt5605);
         } else {
            Class425.aCanvas4798.setLocation(-1115728897 * anInt5594, 1208004069 * anInt5605);
         }
      }

      this.method5966(2012463358);
   }

   void method5990() {
      long var1 = Class255.time((byte)24);
      long var3 = aLongArray5598[155294985 * anInt5599 - 1 & 31];
      long var5 = aLongArray5598[155294985 * anInt5599];
      aLongArray5598[155294985 * anInt5599] = var1;
      anInt5599 = (anInt5599 * 155294985 + 1 & 31) * -1320222407;
      if(var5 != 0L && var1 > var5) {
         int var7 = (int)(var1 - var5);
         anInt5618 = (int)(var1 - var3) * -165791743;
         anInt5627 = 2031188447 * (((var7 >> 1) + 32000) / var7);
      }

      if((anInt5607 += 537723307) * -86642429 - 1 > 50) {
         anInt5607 -= 1116361574;
         aBool5606 = true;
         Class425.aCanvas4798.setSize(Class566.anInt7611 * 1895615023, 974996221 * Class526_Sub24.anInt10549);
         Class425.aCanvas4798.setVisible(true);
         if(Class242.aFrame2454 != null && aFrame5603 == null) {
            Insets var8 = Class242.aFrame2454.getInsets();
            Class425.aCanvas4798.setLocation(var8.left + -1115728897 * anInt5594, var8.top + 1208004069 * anInt5605);
         } else {
            Class425.aCanvas4798.setLocation(-1115728897 * anInt5594, 1208004069 * anInt5605);
         }
      }

      this.method5966(617434798);
   }

   public static final int method5991() {
      return (int)(1000000000L / (-3030308582349352637L * aLong5602));
   }

   public static final int method5992() {
      return (int)(1000000000L / (-3030308582349352637L * aLong5602));
   }

   public static final int method5993() {
      return (int)(1000000000L / (-3030308582349352637L * aLong5602));
   }

   public void method408() {
      if(!aBool5626) {
         aLong5625 = 0L;
      }
   }

   public void method417() {
      if(!aBool5626) {
         aLong5625 = 0L;
      }
   }

   public void method411() {
      if(!aBool5626) {
         aLong5625 = 0L;
      }
   }

   public void method412() {
      if(!aBool5626) {
         aLong5625 = 0L;
      }
   }

   public void method413() {
      if(!aBool5626) {
         aLong5625 = Class255.time((byte)24) * -1101171135082973491L;
         Class304_Sub1.method9089(5000L);
         this.method5960(false, 1510429463);
      }
   }

   public void method414() {
      if(!aBool5626) {
         aLong5625 = Class255.time((byte)24) * -1101171135082973491L;
         Class304_Sub1.method9089(5000L);
         this.method5960(false, 1510429463);
      }
   }

   public final void focusGained(FocusEvent var1) {
      aBool5611 = true;
      aBool5606 = true;
   }

   public final synchronized void method410(Graphics var1) {
      if(!aBool5626) {
         aBool5606 = true;
         if(Class255.time((byte)24) - aLong5609 * 7003511818984948745L > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= 1405944805 * Class332.anInt3505 && var2.height >= Class586.anInt7792 * 542147681) {
               aBool5608 = true;
            }
         }

      }
   }

   public final synchronized void method416(Graphics var1) {
      if(!aBool5626) {
         aBool5606 = true;
         if(Class255.time((byte)24) - aLong5609 * 7003511818984948745L > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= 1405944805 * Class332.anInt3505 && var2.height >= Class586.anInt7792 * 542147681) {
               aBool5608 = true;
            }
         }

      }
   }

   public final void method5994(FocusEvent var1) {
      aBool5611 = false;
   }

   void method5995(byte var1) {
      long var2 = Class255.time((byte)24);
      long var4 = aLongArray5598[155294985 * anInt5599 - 1 & 31];
      long var6 = aLongArray5598[155294985 * anInt5599];
      aLongArray5598[155294985 * anInt5599] = var2;
      anInt5599 = (anInt5599 * 155294985 + 1 & 31) * -1320222407;
      if(var6 != 0L && var2 > var6) {
         int var8 = (int)(var2 - var6);
         anInt5618 = (int)(var2 - var4) * -165791743;
         anInt5627 = 2031188447 * (((var8 >> 1) + 32000) / var8);
      }

      if((anInt5607 += 537723307) * -86642429 - 1 > 50) {
         anInt5607 -= 1116361574;
         aBool5606 = true;
         Class425.aCanvas4798.setSize(Class566.anInt7611 * 1895615023, 974996221 * Class526_Sub24.anInt10549);
         Class425.aCanvas4798.setVisible(true);
         if(Class242.aFrame2454 != null && aFrame5603 == null) {
            Insets var9 = Class242.aFrame2454.getInsets();
            Class425.aCanvas4798.setLocation(var9.left + -1115728897 * anInt5594, var9.top + 1208004069 * anInt5605);
         } else {
            Class425.aCanvas4798.setLocation(-1115728897 * anInt5594, 1208004069 * anInt5605);
         }
      }

      this.method5966(1493614968);
   }

   final void method5996(Class503 var1, String var2, String var3, int var4, int var5, int var6, int var7, boolean var8, short var9) {
      try {
         this.method6003(Class504.aClass504_5649, var8, (byte)106);
         Class332.anInt3505 = (Class566.anInt7611 = var1.method6028(240129793) * 1363328207) * -618668925;
         Class586.anInt7792 = (Class526_Sub24.anInt10549 = var1.method6029(2020327310) * -193172907) * 237290525;
         anInt5594 = 0;
         anInt5605 = 0;
         if(Class585.method6988((byte)-18) == Class504.aClass504_5650) {
            Class332.anInt3505 += -1024261158 * var1.method6030(-1908785408);
            Class586.anInt7792 += 451559234 * var1.method6031(-183105264);
            this.method5954(var1.method6027((byte)-1), 1838506217);
         }

         RuntimeException_Sub3.anApplet12070 = Class492.anApplet5526;
         this.method5950(var2, var3, var4, var5, var6, var7, -626227413);
      } catch (Throwable var11) {
         Class375.method4671((String)null, var11, (byte)20);
         this.method5963("crash", -778496036);
      }

   }

   void method5997(int var1) {
      if(null != Class484.aString5485) {
         String var2 = Class484.aString5485.toLowerCase();
         if(var2.indexOf("sun") != -1 || var2.indexOf("apple") != -1) {
            String var3 = Class595.aString7849;
            if(var3.equals("1.1") || var3.startsWith("1.1.") || var3.equals("1.2") || var3.startsWith("1.2.") || var3.equals("1.3") || var3.startsWith("1.3.") || var3.equals("1.4") || var3.startsWith("1.4.") || var3.equals("1.5") || var3.startsWith("1.5.") || var3.equals("1.6.0")) {
               this.method5963("wrongjava", -1042756044);
               return;
            }

            if(var3.startsWith("1.6.0_")) {
               int var4;
               for(var4 = 6; var4 < var3.length() && Class593.method7030(var3.charAt(var4), -1202916796); ++var4) {
                  ;
               }

               String var5 = var3.substring(6, var4);
               if(Class620.method7346(var5, -1975237408) && Class661.method7925(var5, (byte)111) < 10) {
                  this.method5963("wrongjava", -1307703678);
                  return;
               }
            }
         }
      }

      Class152.method1757((byte)-71).setFocusCycleRoot(true);
      anInt5628 = ((int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 2040371281;
      anInt5629 = Runtime.getRuntime().availableProcessors() * 943957533;
      this.method5955((byte)-1);
      this.method5964((byte)1);
      Class593.aClass513_7819 = Class380.method4703(40259192);

      while(0L == aLong5625 * 4962512506555704837L || Class255.time((byte)24) < aLong5625 * 4962512506555704837L) {
         anInt5630 = Class593.aClass513_7819.method6189(aLong5602 * -3030308582349352637L) * 212032041;

         for(int var6 = 0; var6 < anInt5630 * 1364517401; ++var6) {
            this.method5984(584610652);
         }

         this.method5995((byte)20);
         Class199_Sub9.method9008(Class425.aCanvas4798, (byte)-29);
      }

   }

   public abstract void method419();

   void method5998(byte var1) {
      if(null != Class425.aCanvas4798) {
         Class425.aCanvas4798.removeFocusListener(this);
         Class425.aCanvas4798.getParent().setBackground(Color.black);
         Class425.aCanvas4798.getParent().remove(Class425.aCanvas4798);
      }

   }

   public void run() {
      try {
         try {
            this.method5997(1315518659);
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            Class375.method4671(this.method5959((byte)3), var7, (byte)113);
            this.method5963("crash", -1640590765);
            this.method5960(true, 1510429463);
            return;
         }

         this.method5960(true, 1510429463);
      } finally {
         this.method5960(true, 1510429463);
      }
   }

   public abstract void method418();

   public abstract void method420();

   abstract void method5999();

   public void supplyApplet(Applet var1) {
      Class492.anApplet5526 = var1;
   }

   void method6000(String var1, String var2, int var3) {
      if(!this.aBool5616) {
         this.aBool5616 = true;
         System.out.println("error_game_" + var1);

         try {
            Class53.method968(Class492.anApplet5526, "loggedout", -2134076677);
         } catch (Throwable var6) {
            ;
         }

         try {
            Class492.anApplet5526.getAppletContext().showDocument(new URL(Class492.anApplet5526.getCodeBase(), "error_game_" + var1 + ".ws?" + var2), "_top");
         } catch (Exception var5) {
            ;
         }

      }
   }

   public final void method6001(FocusEvent var1) {
      aBool5611 = true;
      aBool5606 = true;
   }

   public void destroy() {
      if(!aBool5626) {
         aLong5625 = Class255.time((byte)24) * -1101171135082973491L;
         Class304_Sub1.method9089(5000L);
         this.method5960(false, 1510429463);
      }
   }

   public void method6002() throws Exception_Sub7 {
      if(!this.aBool5596) {
         Class520.method6248(-658205370).method403("jaclib", (byte)67);

         try {
            QueryPerformanceCounter.init();
         } catch (Throwable var2) {
            if(Class222.aString2308.startsWith("win")) {
               throw new Exception_Sub7(128, "jaclib");
            }
         }

         this.aBool5596 = true;
      }
   }

   void method6003(Class504 var1, boolean var2, byte var3) {
      if(null == var1) {
         throw new NullPointerException();
      } else if(var1 != Class504.aClass504_5649 && Class504.aClass504_5648 != var1) {
         throw new IllegalStateException();
      } else {
         aClass504_5624 = var1;
         if(aClass504_5624 != Class504.aClass504_5648) {
            if(var2) {
               aClass504_5624 = Class504.aClass504_5650;
            }

         }
      }
   }

   void method6004(File var1, File var2, byte var3) {
      try {
         Class21 var4 = new Class21(Class143_Sub2.aFile8965, "rw", 10000L);
         RSByteBuffer var5 = new RSByteBuffer(500);
         var5.writeByte(3, 1107001816);
         var5.writeByte(var2 != null?1:0, 1193236831);
         var5.method9618(var1.getPath(), -2051231468);
         if(var2 != null) {
            var5.method9618(var2.getPath(), -1345924706);
         }

         var4.method650(var5.buffer, 0, 301018015 * var5.pos, (byte)-9);
         var4.method651(1402361279);
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public final void method6005(FocusEvent var1) {
      aBool5611 = true;
      aBool5606 = true;
   }

   public final void method415(Graphics var1) {
      this.paint(var1);
   }

   public final void method6006(FocusEvent var1) {
      aBool5611 = true;
      aBool5606 = true;
   }

   public static void method6007(int var0, int var1, int var2, int var3, int var4) {
      Class526_Sub18 var5;
      for(var5 = (Class526_Sub18)Class526_Sub18.aClass702_10505.method8206((byte)25); null != var5; var5 = (Class526_Sub18)Class526_Sub18.aClass702_10505.method8181(1450866210)) {
         Class665.method7952(var5, var0, var1, var2, var3, (byte)0);
      }

      byte var6;
      RenderDef var7;
      int var8;
      int var9;
      Class446 var12;
      for(var5 = (Class526_Sub18)Class526_Sub18.aClass702_10482.method8206((byte)18); var5 != null; var5 = (Class526_Sub18)Class526_Sub18.aClass702_10482.method8181(384317500)) {
         var6 = 1;
         var7 = var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495.method10786(-16777216);
         var8 = var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495.aClass704_Sub3_11914.method8220(-1793767494);
         if(-1 != var8 && !var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495.aClass704_Sub3_11914.aBool10969) {
            if(var8 != 1317568909 * var7.runAnimation && var8 != var7.runRotate180Animation * -1340587369 && var7.runRotate90CounterAnimation * 84725405 != var8 && 1443182969 * var7.runRotate90Animation != var8) {
               if(var8 == var7.moveType1Anim * 455141683 || var8 == var7.type1_180 * -566579917 || var8 == -2093545587 * var7.type1_90_counter || var8 == -721906563 * var7.type1_90) {
                  var6 = 3;
               }
            } else {
               var6 = 2;
            }
         } else {
            var6 = 0;
         }

         if(var6 != 1820686807 * var5.anInt10486) {
            var9 = Class99.method1282(var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495, -1922353248);
            NPCDef var10 = var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495.def;
            if(null != var10.morphisms) {
               var10 = var10.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            }

            if(null != var10 && var9 != -1) {
               if(var5.anInt10508 * 1520182179 != var9) {
                  boolean var11 = false;
                  if(null != var5.aClass482_10506) {
                     var5.anInt10493 -= -856008192;
                     if(var5.anInt10493 * 618519205 <= 0) {
                        var5.aClass482_10506.method5770(100, -938617916);
                        Class570.aClass231_7657.method3204(var5.aClass482_10506, 1995114575);
                        var5.aClass482_10506 = null;
                        var11 = true;
                     }
                  } else {
                     var11 = true;
                  }

                  if(var11) {
                     var5.anInt10493 = 1061153107 * var10.anInt3359;
                     var5.anInt10508 = -1225578485 * var9;
                     var5.anInt10486 = var6 * -400717337;
                  }
               } else {
                  var5.anInt10486 = -400717337 * var6;
                  var5.anInt10493 = 1061153107 * var10.anInt3359;
               }
            } else {
               var5.anInt10508 = 1225578485;
               var5.anInt10486 = -400717337 * var6;
            }
         }

         var12 = var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495.method7635().aClass446_4816;
         var5.anInt10485 = -502332253 * (int)var12.aFloat4917;
         var5.anInt10487 = ((int)var12.aFloat4917 + (var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495.method10781(-627148024) << 8)) * -119810509;
         var5.anInt10480 = (int)var12.aFloat4919 * -967064791;
         var5.anInt10509 = ((int)var12.aFloat4919 + (var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495.method10781(-627148024) << 8)) * -1425665381;
         var5.anInt10484 = 435094121 * var5.aClass639_Sub1_Sub2_Sub1_Sub2_10495.aByte10827;
         Class665.method7952(var5, var0, var1, var2, var3, (byte)0);
      }

      for(var5 = (Class526_Sub18)Class526_Sub18.aClass20_10483.method638(328636832); null != var5; var5 = (Class526_Sub18)Class526_Sub18.aClass20_10483.method639(2038204079)) {
         var6 = 1;
         var7 = var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.method10786(-16777216);
         var8 = var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.aClass704_Sub3_11914.method8220(-1289092162);
         if(var8 != -1 && !var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.aClass704_Sub3_11914.aBool10969) {
            if(var8 != 1317568909 * var7.runAnimation && -1340587369 * var7.runRotate180Animation != var8 && var8 != 84725405 * var7.runRotate90CounterAnimation && var7.runRotate90Animation * 1443182969 != var8) {
               if(455141683 * var7.moveType1Anim == var8 || var8 == var7.type1_180 * -566579917 || var7.type1_90_counter * -2093545587 == var8 || -721906563 * var7.type1_90 == var8) {
                  var6 = 3;
               }
            } else {
               var6 = 2;
            }
         } else {
            var6 = 0;
         }

         if(var6 != var5.anInt10486 * 1820686807) {
            var9 = Class149_Sub1.method8355(var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496, 811221711);
            if(1520182179 * var5.anInt10508 != var9) {
               boolean var13 = false;
               if(null != var5.aClass482_10506) {
                  var5.anInt10493 -= -856008192;
                  if(618519205 * var5.anInt10493 <= 0) {
                     var5.aClass482_10506.method5770(100, -938617916);
                     Class570.aClass231_7657.method3204(var5.aClass482_10506, 1085088123);
                     var5.aClass482_10506 = null;
                     var13 = true;
                  }
               } else {
                  var13 = true;
               }

               if(var13) {
                  var5.anInt10493 = var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.anInt12180 * 385174739;
                  var5.anInt10508 = var9 * -1225578485;
                  var5.anInt10486 = -400717337 * var6;
               }
            } else {
               var5.anInt10493 = var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.anInt12180 * 385174739;
               var5.anInt10486 = var6 * -400717337;
            }
         }

         var12 = var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.method7635().aClass446_4816;
         var5.anInt10485 = (int)var12.aFloat4917 * -502332253;
         var5.anInt10487 = ((int)var12.aFloat4917 + (var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.method10781(-627148024) << 8)) * -119810509;
         var5.anInt10480 = (int)var12.aFloat4919 * -967064791;
         var5.anInt10509 = ((int)var12.aFloat4919 + (var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.method10781(-627148024) << 8)) * -1425665381;
         var5.anInt10484 = 435094121 * var5.aClass639_Sub1_Sub2_Sub1_Sub1_10496.aByte10827;
         Class665.method7952(var5, var0, var1, var2, var3, (byte)0);
      }

   }

   static void method6008(int var0, int var1) {
      if(327983535 * Class32.anInt310 == 184) {
         Class32.anInt349 = var0 * 1080918919;
      } else if(327983535 * Class32.anInt310 == 221) {
         Class32.anInt345 = -1186334541 * var0;
      }

   }

   static final void method6009(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = 0;
      int var5 = var3 >>> 8;
      int var6 = var3 & 255;
      Class18 var7 = (Class18)Class219.aClass40_2294.method89(var2, -847200527);
      Class77 var8 = (Class77)Class304_Sub1.aClass40_10066.method89(var5, -771404093);
      Class454[] var9 = var8.aClass454ArrayArray815[var6];
      Object[] var10 = var7.method629(var6, 1637747565);
      if(var10 == null && var8.anObjectArrayArray814 != null) {
         var10 = var8.anObjectArrayArray814[var6];
      }

      if(var10 != null) {
         var4 = var10.length / var9.length;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4;
   }
}
