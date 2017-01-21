package com.jagex;

import com.jagex.Class153;
import com.jagex.Class191;
import com.jagex.Class206;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class231;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class328;
import com.jagex.Class388;
import com.jagex.Class462;
import com.jagex.Class480;
import com.jagex.Class497;
import com.jagex.Class522;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub38_Sub2;
import com.jagex.Class554;
import com.jagex.Class581;
import com.jagex.Class584;
import com.jagex.Class585;
import com.jagex.Class667;
import com.jagex.Class681;
import com.jagex.Interface18;
import com.jagex.Interface76;
import com.jagex.client;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Class570 {
   static final int anInt7622 = 0;
   static final int anInt7624 = 2;
   static final int anInt7625 = 3;
   static final int anInt7626 = 0;
   static final int anInt7627 = 1;
   static final int anInt7628 = 2;
   static final int anInt7643 = 1;
   static int anInt7645;
   static final int anInt7656 = 2000;
   public static Class231 aClass231_7657;
   public static String aString7658;
   static int anInt7651 = -783098807;
   static Class153 aClass153_7642 = null;
   static TwitchTV aTwitchTV7639;
   static boolean aBool7638 = false;
   static boolean aBool7644 = false;
   static boolean aBool7636 = false;
   static boolean aBool7621 = false;
   static float aFloat7629 = 0.2F;
   static int anInt7630 = -74032383;
   static int anInt7631 = -2016286368;
   static int anInt7632 = 0;
   static int anInt7655 = -241003952;
   static int anInt7634 = 0;
   static int anInt7652 = 0;
   static boolean[] aBoolArray7623 = null;
   static String[] aStringArray7650 = null;
   static long aLong7640 = 0L;
   static long aLong7641 = 0L;
   static long aLong7633 = 0L;
   static int anInt7635 = 0;
   static TwitchWebcamFrameData aTwitchWebcamFrameData7647 = null;
   static LinkedList aLinkedList7648 = new LinkedList();
   static LinkedList aLinkedList7649 = new LinkedList();
   static TwitchWebcamDevice[] aTwitchWebcamDeviceArray7653 = null;
   static long aLong7637 = 0L;
   static boolean aBool7654 = false;
   static boolean aBool7646 = false;

   public static void method6842() {
      anInt7651 = -783098807;
   }

   public static int method6843() {
      return Class526_Sub38_Sub2.aTwitchEventLiveStreams11806 != null && 1238903303 * anInt7651 < Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.streamCount - 1?(anInt7651 += 783098807) * 1238903303:-1;
   }

   public static int method6844() {
      return Class526_Sub38_Sub2.aTwitchEventLiveStreams11806 != null && 1238903303 * anInt7651 < Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.streamCount - 1?(anInt7651 += 783098807) * 1238903303:-1;
   }

   public static int method6845() {
      Class526_Sub38_Sub2.aTwitchEventLiveStreams11806 = null;
      int var0 = aTwitchTV7639.RequestLiveStreams(client.aClass676_11127.aString8586);
      return var0;
   }

   public static boolean method6846() {
      return aTwitchTV7639 != null && aTwitchTV7639.IsStreaming();
   }

   public static void method6847(boolean var0) {
   }

   public static void method6848(boolean var0) {
   }

   public static void method6849() {
      aClass153_7642 = null;
   }

   public static int method6850() {
      return aTwitchTV7639.GetViewerCount();
   }

   public static void method6851() {
      anInt7651 = -783098807;
   }

   public static void method6852() {
      if(aBool7638) {
         int var0 = aTwitchTV7639.ShutdownTTV();
         if(var0 == 0) {
            aTwitchTV7639 = null;
            aBool7638 = false;
         }
      }

   }

   public static int method6853() {
      return aTwitchTV7639.GetLoginState();
   }

   public static int method6854() {
      return aTwitchTV7639.GetLoginState();
   }

   public static int method6855() {
      return aTwitchTV7639.GetLoginState();
   }

   public static int method6856() {
      return aTwitchTV7639.GetLoginState();
   }

   public static int method6857() {
      return aTwitchTV7639.GetLoginState();
   }

   public static int method6858() {
      return aTwitchTV7639.GetStreamState();
   }

   public static int method6859() {
      return aTwitchTV7639.GetStreamState();
   }

   Class570() throws Throwable {
      throw new Error();
   }

   public static int method6860() {
      return !Class328.method4200(1749180279)?0:anInt7635 * 884600261;
   }

   public static int method6861() {
      if(!aBool7638) {
         return 12;
      } else {
         Class462.method5474(Class554.aClass174_7475, -1451779978);
         return aTwitchTV7639.Logout();
      }
   }

   static void method6862() {
      aBool7644 = false;
      Class584.anIntArray7784 = null;
      Class191.anIntArray2168 = null;
      aLinkedList7648.clear();
      aLinkedList7649.clear();
      Class554.aClass174_7475.method2273();
   }

   public static int method6863() {
      return !Class328.method4200(1479688398)?0:anInt7635 * 884600261;
   }

   public static void method6864(boolean var0) {
      if(aBool7636 != var0) {
         Class298.method3983(-2131336089);
         aBool7636 = var0;
      }

   }

   public static void method6865(boolean var0) {
      if(aBool7636 != var0) {
         Class298.method3983(-2120063160);
         aBool7636 = var0;
      }

   }

   public static int method6866() {
      return aTwitchTV7639.GetChatState();
   }

   public static boolean method6867() {
      return Class497.aString5565.startsWith("win");
   }

   public static int method6868() {
      return Class526_Sub38_Sub2.aTwitchEventLiveStreams11806 != null && 1238903303 * anInt7651 < Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.streamCount - 1?(anInt7651 += 783098807) * 1238903303:-1;
   }

   public static int method6869() {
      if(anInt7634 * -1138125845 == 3) {
         return -1;
      } else if(anInt7634 * -1138125845 != 0) {
         return -1502505459 * anInt7652;
      } else {
         if(null == aStringArray7650) {
            if(Class497.aString5565.startsWith("mac ")) {
               if(Class497.aString5564.startsWith("ppc")) {
                  anInt7634 = 683931209;
                  return -1;
               }

               aStringArray7650 = new String[3];
               aStringArray7650[0] = "sdk-mac-dynamic";
               aStringArray7650[1] = "twitchsdk";
               aStringArray7650[2] = "twitchtv";
               aBoolArray7623 = new boolean[3];
               aBoolArray7623[0] = false;
               aBoolArray7623[1] = false;
               aBoolArray7623[2] = true;
            } else {
               if(!Class497.aString5565.startsWith("win")) {
                  anInt7634 = 683931209;
                  return -1;
               }

               aStringArray7650 = new String[6];
               aStringArray7650[0] = "avutil-ttv-51";
               aStringArray7650[1] = "libmp3lame-ttv";
               aStringArray7650[2] = "swresample-ttv-0";
               aStringArray7650[5] = "twitchtv";
               if(!Class497.aString5564.startsWith("amd64") && !Class497.aString5564.startsWith("x86_64")) {
                  if(!Class497.aString5564.startsWith("i386") && !Class497.aString5564.startsWith("i486") && !Class497.aString5564.startsWith("i586") && !Class497.aString5564.startsWith("x86")) {
                     anInt7634 = 683931209;
                     return -1;
                  }

                  aStringArray7650[3] = "libmfxsw32";
                  aStringArray7650[4] = "twitchsdk_32_release";
               } else {
                  aStringArray7650[3] = "libmfxsw64";
                  aStringArray7650[4] = "twitchsdk_64_release";
               }

               aBoolArray7623 = new boolean[6];
               aBoolArray7623[0] = true;
               aBoolArray7623[1] = true;
               aBoolArray7623[2] = true;
               aBoolArray7623[3] = false;
               aBoolArray7623[4] = true;
               aBoolArray7623[5] = true;
            }
         }

         anInt7634 = 1659632835;
         return 0;
      }
   }

   public static boolean method6870() {
      return aTwitchTV7639 != null && aTwitchTV7639.IsStreaming();
   }

   static void method6871(int var0, int var1) {
      TwitchEventResult var2 = new TwitchEventResult(var0, var1);
      Class585 var3 = var2.method4883();
      if(null != var3) {
         Class480.method5754(var3.getId(), var2, -171990075);
      }

   }

   static void method6872(int var0, int var1) {
      TwitchEventResult var2 = new TwitchEventResult(var0, var1);
      Class585 var3 = var2.method4883();
      if(null != var3) {
         Class480.method5754(var3.getId(), var2, 39458513);
      }

   }

   static void method6873(int var0, int var1) {
      TwitchEventResult var2 = new TwitchEventResult(var0, var1);
      Class585 var3 = var2.method4883();
      if(null != var3) {
         Class480.method5754(var3.getId(), var2, 1834252523);
      }

   }

   public static void method6874() {
      aClass153_7642 = null;
   }

   public static void method6875() {
      aClass153_7642 = null;
   }

   public static int method6876() {
      return aTwitchTV7639.GetWebcamState();
   }

   public static int method6877() {
      return !Class328.method4200(1109087970)?0:anInt7635 * 884600261;
   }

   static void method6878() {
      aBool7644 = false;
      Class584.anIntArray7784 = null;
      Class191.anIntArray2168 = null;
      aLinkedList7648.clear();
      aLinkedList7649.clear();
      Class554.aClass174_7475.method2273();
   }

   static void method6879() {
      aTwitchWebcamDeviceArray7653 = aTwitchTV7639.GetWebcamDevices();
   }

   static void method6880() {
      aTwitchWebcamDeviceArray7653 = aTwitchTV7639.GetWebcamDevices();
   }

   static void method6881() {
      aTwitchWebcamDeviceArray7653 = aTwitchTV7639.GetWebcamDevices();
   }

   public static int method6882() {
      return Class526_Sub38_Sub2.aTwitchEventLiveStreams11806 != null && 1238903303 * anInt7651 < Class526_Sub38_Sub2.aTwitchEventLiveStreams11806.streamCount - 1?(anInt7651 += 783098807) * 1238903303:-1;
   }

   static void method6883() {
      aTwitchWebcamDeviceArray7653 = aTwitchTV7639.GetWebcamDevices();
   }

   public static int method6884() {
      return null == aTwitchWebcamDeviceArray7653?0:aTwitchWebcamDeviceArray7653.length;
   }

   public static boolean method6885() {
      return aBool7644;
   }

   public static void method6886() {
      if(aBool7638) {
         int var0 = aTwitchTV7639.ShutdownTTV();
         if(var0 == 0) {
            aTwitchTV7639 = null;
            aBool7638 = false;
         }
      }

   }

   static void method6887() {
      aBool7644 = false;
      Class584.anIntArray7784 = null;
      Class191.anIntArray2168 = null;
      aLinkedList7648.clear();
      aLinkedList7649.clear();
      Class554.aClass174_7475.method2273();
   }

   public static boolean method6888() {
      String var3;
      if(Class497.aString5565.startsWith("win")) {
         String var8 = "msvcr110.dll";
         String var9 = "msvcp110.dll";
         String[] var11 = new String[]{var8, var9};
         var3 = System.getenv("WINDIR");
         if(var3 == "") {
            return false;
         } else {
            for(int var4 = 0; var4 < var11.length; ++var4) {
               File var5 = new File(var3 + "\\system32\\" + var11[var4]);
               if(!var5.exists() || var5.isDirectory()) {
                  return false;
               }
            }

            return true;
         }
      } else if(Class497.aString5565.startsWith("mac")) {
         try {
            Process var0 = Runtime.getRuntime().exec("ps -few");
            BufferedReader var1 = new BufferedReader(new InputStreamReader(var0.getInputStream()));

            try {
               int var2 = var0.waitFor();
               if(var2 != 0) {
                  return false;
               }
            } catch (InterruptedException var6) {
               return false;
            }

            boolean var10 = false;

            while((var3 = var1.readLine()) != null) {
               if(var3.toLowerCase().indexOf("soundflowerbed") != -1) {
                  var10 = true;
                  break;
               }
            }

            var1.close();
            return var10;
         } catch (Exception var7) {
            return false;
         }
      } else {
         return false;
      }
   }

   static final void method6889(Class681 var0, short var1) {
      Class317 var2 = (Class317)var0.aClass526_Sub21_Sub19_8629.anObjectArray11861[var0.anInt8644 * -244840757];
      Interface18 var3 = (Interface18)(0 == var0.anIntArray8642[var0.anInt8644 * -244840757]?var0.aMap8638.get(var2.aClass143_3405.aClass452_1675):var0.aMap8627.get(var2.aClass143_3405.aClass452_1675));
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.method116(var2, (byte)3);
   }

   static final void method6890(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub8_10625, var2, (short)-4090);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   public static void method6891(Iterable var0, RSByteBuffer var1, int var2) {
      int var3 = Class667.method7959(var0, (byte)14);
      var1.method9711(var3, -1128492035);
      if(0 != var3) {
         for(int var4 = 0; var4 < var3; ++var4) {
            var1.buffer[301018015 * var1.pos + var4] = 0;
         }

         int var6;
         int var7;
         for(Iterator var8 = var0.iterator(); var8.hasNext(); var1.buffer[var7 + var1.pos * 301018015] = (byte)(var1.buffer[var7 + var1.pos * 301018015] | 1 << (var6 & 7))) {
            Interface76 var5 = (Interface76)var8.next();
            var6 = var5.getId();
            var7 = var6 / 8;
         }

         var1.pos += var3 * 801976415;
      }
   }

   static final void method6892(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)10);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class581.method6972(var3, var4, var0, (byte)-66);
   }

   static final void method6893(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class206)Class388.aClass40_Sub15_4063.method89(var2, -620378587)).anInt2227 * 481833989;
   }
}
