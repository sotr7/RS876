package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class204;
import com.jagex.Class234;
import com.jagex.InterfaceDef;
import com.jagex.Class270;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub39;
import com.jagex.Class594;
import com.jagex.client;
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class690 {
   DisplayMode aDisplayMode8694;
   GraphicsDevice aGraphicsDevice8693;

   void method8092(Frame var1, int var2) {
      boolean var3 = false;

      Field var4;
      try {
         var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
         var4.setAccessible(true);
         boolean var5 = ((Boolean)var4.get(this.aGraphicsDevice8693)).booleanValue();
         if(var5) {
            var4.set(this.aGraphicsDevice8693, Boolean.FALSE);
            var3 = true;
         }
      } catch (Throwable var14) {
         ;
      }

      try {
         this.aGraphicsDevice8693.setFullScreenWindow(var1);
         if(var3) {
            try {
               var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
               var4.set(this.aGraphicsDevice8693, Boolean.TRUE);
            } catch (Throwable var13) {
               ;
            }
         }

      } finally {
         if(var3) {
            try {
               Field var7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
               var7.set(this.aGraphicsDevice8693, Boolean.TRUE);
            } catch (Throwable var12) {
               ;
            }
         }

      }
   }

   int[] method8093(byte var1) {
      DisplayMode[] var2 = this.aGraphicsDevice8693.getDisplayModes();
      int[] var3 = new int[var2.length << 2];

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var3[var4 << 2] = var2[var4].getWidth();
         var3[1 + (var4 << 2)] = var2[var4].getHeight();
         var3[2 + (var4 << 2)] = var2[var4].getBitDepth();
         var3[(var4 << 2) + 3] = var2[var4].getRefreshRate();
      }

      return var3;
   }

   void method8094() {
      if(null != this.aDisplayMode8694) {
         DisplayMode[] var1 = this.aGraphicsDevice8693.getDisplayModes();
         boolean var2 = false;
         DisplayMode[] var3 = var1;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            DisplayMode var5 = var3[var4];
            if(var5.equals(this.aDisplayMode8694)) {
               this.aGraphicsDevice8693.setDisplayMode(this.aDisplayMode8694);
               var2 = true;
               break;
            }
         }

         if(!var2) {
            try {
               Field var7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
               var7.setAccessible(true);
               var7.set(this.aGraphicsDevice8693, (Object)null);
            } catch (Throwable var6) {
               ;
            }
         }

         this.aDisplayMode8694 = null;
      }

      this.method8092((Frame)null, 1573028629);
   }

   void method8095(int var1) {
      if(null != this.aDisplayMode8694) {
         DisplayMode[] var2 = this.aGraphicsDevice8693.getDisplayModes();
         boolean var3 = false;
         DisplayMode[] var4 = var2;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            DisplayMode var6 = var4[var5];
            if(var6.equals(this.aDisplayMode8694)) {
               this.aGraphicsDevice8693.setDisplayMode(this.aDisplayMode8694);
               var3 = true;
               break;
            }
         }

         if(!var3) {
            try {
               Field var8 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
               var8.setAccessible(true);
               var8.set(this.aGraphicsDevice8693, (Object)null);
            } catch (Throwable var7) {
               ;
            }
         }

         this.aDisplayMode8694 = null;
      }

      this.method8092((Frame)null, 1573028629);
   }

   public Class690() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.aGraphicsDevice8693 = var1.getDefaultScreenDevice();
      if(!this.aGraphicsDevice8693.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if(null != var5 && var5.isFullScreenSupported()) {
               this.aGraphicsDevice8693 = var5;
               return;
            }
         }

         throw new Exception();
      }
   }

   void method8096() {
      if(null != this.aDisplayMode8694) {
         DisplayMode[] var1 = this.aGraphicsDevice8693.getDisplayModes();
         boolean var2 = false;
         DisplayMode[] var3 = var1;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            DisplayMode var5 = var3[var4];
            if(var5.equals(this.aDisplayMode8694)) {
               this.aGraphicsDevice8693.setDisplayMode(this.aDisplayMode8694);
               var2 = true;
               break;
            }
         }

         if(!var2) {
            try {
               Field var7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
               var7.setAccessible(true);
               var7.set(this.aGraphicsDevice8693, (Object)null);
            } catch (Throwable var6) {
               ;
            }
         }

         this.aDisplayMode8694 = null;
      }

      this.method8092((Frame)null, 1573028629);
   }

   void method8097(Frame var1, int var2, int var3, int var4, int var5, int var6) {
      this.aDisplayMode8694 = this.aGraphicsDevice8693.getDisplayMode();
      if(this.aDisplayMode8694 == null) {
         throw new NullPointerException();
      } else {
         var1.setUndecorated(true);
         var1.enableInputMethods(false);
         this.method8092(var1, 1573028629);
         if(var5 == 0) {
            int var7 = this.aDisplayMode8694.getRefreshRate();
            DisplayMode[] var8 = this.aGraphicsDevice8693.getDisplayModes();
            boolean var9 = false;

            for(int var10 = 0; var10 < var8.length; ++var10) {
               if(var8[var10].getWidth() == var2 && var8[var10].getHeight() == var3 && var8[var10].getBitDepth() == var4) {
                  int var11 = var8[var10].getRefreshRate();
                  if(!var9 || Math.abs(var11 - var7) < Math.abs(var5 - var7)) {
                     var5 = var11;
                     var9 = true;
                  }
               }
            }

            if(!var9) {
               var5 = var7;
            }
         }

         this.aGraphicsDevice8693.setDisplayMode(new DisplayMode(var2, var3, var4, var5));
      }
   }

   public static void method8098(int var0, int var1, int var2, String var3, int var4) {
      InterfaceDef var5 = Class204.method2893(var1, var2, -625803534);
      if(var5 != null) {
         if(null != var5.anObjectArray2491) {
            Class526_Sub39 var6 = new Class526_Sub39();
            var6.aClass245_10694 = var5;
            var6.anInt10692 = var0 * -1409858993;
            var6.aString10697 = var3;
            var6.anObjectArray10701 = var5.anObjectArray2491;
            Class270.method3594(var6, -861751206);
         }

         if(client.method10311(var5).method9460(var0 - 1, 1397881778)) {
            Class111 var8 = Class452_Sub4.method9295((byte)65);
            if(0 == -558705405 * client.anInt11038 || 9 == -558705405 * client.anInt11038 || client.anInt11038 * -558705405 == 11) {
               if(null != var5.aString2675 && null != var5.aClass258_2651) {
                  OutFrameBuffer var7 = Class115.method1414(OutFrame.aClass405_4179, var8.aClass14_1342, -2055794071);
                  var7.out.writeByte(7 + Class594.method7039(var5.aString2675, 65044188) + 1, 1277684706);
                  var7.out.writeByte(var0, 1957671138);
                  var7.out.writeIntV2(var1, (byte)-72);
                  var7.out.writeShort128(var2, (byte)21);
                  var7.out.method9616(var5.aString2675, 919360756);
                  var7.out.write128Byte(var5.aClass258_2651.getId(), (byte)-66);
                  var8.write(var7, (byte)-5);
               } else {
                  Class234.method3279(var8, var5, var0, var1, var2, 140760939);
               }

            }
         }
      }
   }
}
