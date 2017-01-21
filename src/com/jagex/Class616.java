package com.jagex;

import com.jagex.Class149;
import com.jagex.Class198;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class313_Sub1;
import com.jagex.Class39;
import com.jagex.Class466;
import com.jagex.Class467;
import com.jagex.Buffer;
import com.jagex.Class615;
import com.jagex.Class617;
import com.jagex.Class676;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class711_Sub21;
import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class616 {
   int anInt8098;
   int anInt8094;
   boolean aBool8093;
   Class617 aClass617_8095;
   int anInt8099;
   int anInt8097;
   int anInt8096;

   public boolean method7283() {
      return -1 != this.anInt8096 * -1462146039;
   }

   int method7284(int var1) {
      return -370582845 * this.anInt8098;
   }

   public int method7285(int var1) {
      int var2 = this.aClass617_8095.method7310(var1, (byte)-39) + this.anInt8099 * 2013071043;
      return var2 > this.anInt8094 * 1368249983?this.anInt8094 * 1368249983:var2;
   }

   public int method7286(int var1) {
      return -1462146039 * this.anInt8096;
   }

   public int method7287(byte var1) {
      return this.anInt8097 * 990200079;
   }

   public boolean method7288(byte var1) {
      return -1 != this.anInt8096 * -1462146039;
   }

   public boolean method7289(byte var1) {
      return this.aBool8093;
   }

   public int method7290(int var1, int var2) {
      int var3 = var1 / 10;
      return this.method7296(var3, 256455497);
   }

   int method7291(int var1, int var2) {
      if(var1 > 1368249983 * this.anInt8094) {
         var1 = this.anInt8094 * 1368249983;
      }

      return this.aClass617_8095.method7313(var1 - this.anInt8099 * 2013071043, 322132384);
   }

   int method7292(int var1, byte var2) {
      return this.method7291(var1, -921969645) * 10;
   }

   public boolean method7293() {
      return this.aBool8093;
   }

   public int method7294() {
      return -1462146039 * this.anInt8096;
   }

   int method7295(int var1) {
      return this.method7291(var1, 1878338892) * 10;
   }

   Class616(int var1, int var2, boolean var3, boolean var4, int var5, Class617 var6, int var7) {
      this.anInt8098 = -1427200533 * var1;
      this.anInt8094 = var2 * 1394076031;
      this.aBool8093 = var3;
      this.aClass617_8095 = var6;
      this.anInt8099 = 1930123755 * var7;
      if(var3) {
         this.anInt8097 = var5 * 344821231;
         this.anInt8096 = this.method7292(var5, (byte)-7) * -532684231;
      } else {
         this.anInt8097 = -344821231;
         this.anInt8096 = 532684231;
      }

   }

   public int method7296(int var1, int var2) {
      int var3 = this.aClass617_8095.method7310(var1, (byte)98) + this.anInt8099 * 2013071043;
      return var3 > this.anInt8094 * 1368249983?this.anInt8094 * 1368249983:var3;
   }

   public int method7297(int var1) {
      int var2 = this.aClass617_8095.method7310(var1, (byte)-11) + this.anInt8099 * 2013071043;
      return var2 > this.anInt8094 * 1368249983?this.anInt8094 * 1368249983:var2;
   }

   public int method7298(int var1) {
      int var2 = var1 / 10;
      return this.method7296(var2, -1892187323);
   }

   int method7299(int var1) {
      if(var1 > 1368249983 * this.anInt8094) {
         var1 = this.anInt8094 * 1368249983;
      }

      return this.aClass617_8095.method7313(var1 - this.anInt8099 * 2013071043, -619435516);
   }

   public boolean method7300() {
      return -1 != this.anInt8096 * -1462146039;
   }

   int method7301(int var1) {
      return this.method7291(var1, -426133399) * 10;
   }

   int method7302(int var1) {
      return this.method7291(var1, 1473950899) * 10;
   }

   static void method7303(Buffer var0, byte var1) {
      Class39[] var2 = Class313_Sub1.method9058(276821095);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class39 var4 = var2[var3];
         if(Class39.aClass39_426 != var4) {
            Class466 var5 = (Class466)Class711_Sub21.aMap10876.get(var4);
            if(null == var5) {
               var0.writeInt(0, -357564953);
            } else {
               var0.writeInt(var5.method5554((byte)1), -357564953);
            }
         }
      }

   }

   static void method7304(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      TwitchWebcamDevice var3 = Class198.method2847(var2, 1389492592);
      if(var3 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -355702023 * var3.anInt1137;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString1135;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString1136;
      }

   }

   static final void method7305(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class467.method5599(var3, var4, var0, (byte)38);
   }

   static Class676[] method7306(int var0) {
      return new Class676[]{Class676.aClass676_8588, Class676.aClass676_8585, Class676.aClass676_8587, Class676.aClass676_8592, Class676.aClass676_8590, Class676.aClass676_8589};
   }

   public static short method7307(int var0, int var1) {
      int var2 = var0 >> 10 & 63;
      int var3 = var0 >> 3 & 112;
      int var4 = var0 & 127;
      var3 = var4 <= 64?var4 * var3 >> 7:var3 * (127 - var4) >> 7;
      int var5 = var4 + var3;
      int var6;
      if(var5 != 0) {
         var6 = (var3 << 8) / var5;
      } else {
         var6 = var3 << 1;
      }

      return (short)(var2 << 10 | var6 >> 4 << 7 | var5);
   }

   static void method7308(File var0, byte[] var1, int var2, byte var3) throws IOException {
      DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(var0)));

      try {
         var4.readFully(var1, 0, var2);
      } catch (EOFException var6) {
         ;
      }

      var4.close();
   }

   static final void method7309(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      int[] var5 = Class149.method1747(var4, var2, (byte)0);
      if(var5 != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2618 = Class615.method7280(var4, var2, -1104623199);
      var0.anIntArray2619 = var5;
      var0.aBool2560 = true;
   }
}
