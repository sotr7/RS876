package com.jagex;

import com.jagex.Class125;
import com.jagex.Class127;
import com.jagex.Class129;
import com.jagex.Class134;
import com.jagex.Class136;
import com.jagex.Class137;
import com.jagex.Class141;
import com.jagex.Class147;
import com.jagex.Class148;
import com.jagex.Class151;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class169;
import com.jagex.Class170;
import com.jagex.Class171;
import com.jagex.Class174_Sub2;
import com.jagex.Class180;
import com.jagex.Class182;
import com.jagex.Class185;
import com.jagex.Class189;
import com.jagex.Class385;
import com.jagex.Class386;
import com.jagex.Class433;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub21_Sub5_Sub2;
import com.jagex.Class526_Sub36_Sub1;
import com.jagex.Class569;
import com.jagex.Class593;
import com.jagex.Class595;
import com.jagex.Class639_Sub1;
import com.jagex.Class661;
import com.jagex.Interface15;
import com.jagex.Interface20;
import com.jagex.Interface47;
import jaclib.memory.Stream;
import jaggl.OpenGL;

public class Class168_Sub1 extends Class168 {
   static final int anInt9042 = 7;
   static final int anInt9045 = 4;
   static final int anInt9047 = 16;
   static final int anInt9052 = 1;
   static final int anInt9068 = 8;
   static final int anInt9073 = 4;
   static final int anInt9103 = 2;
   int anInt9117;
   boolean aBool9088 = true;
   short[] aShortArray9064;
   short[] aShortArray9065;
   short[] aShortArray9094;
   byte[] aByteArray9061;
   Class151 aClass151_9089;
   byte aByte9049;
   int anInt9050;
   short aShort9056;
   short aShort9053;
   int anInt9046 = 0;
   int anInt9060 = 0;
   int anInt9063 = 0;
   int anInt9071 = 0;
   int anInt9098 = 0;
   int anInt9105;
   boolean aBool9054 = false;
   boolean aBool9055 = false;
   int[] anIntArray9058;
   int[] anIntArray9059;
   int[] anIntArray9091;
   Class129 aClass129_9081;
   short[] aShortArray9082;
   byte[] aByteArray9074;
   Class129 aClass129_9044;
   Class129 aClass129_9083;
   float[] aFloatArray9069;
   float[] aFloatArray9070;
   Class129 aClass129_9114;
   short[] aShortArray9075;
   short[] aShortArray9076;
   short[] aShortArray9077;
   Class136 aClass136_9085;
   short[] aShortArray9078;
   Class137[] aClass137Array9104;
   Class147[] aClass147Array9043;
   boolean aBool9072 = false;
   int anInt9107;
   int anInt9090;
   short aShort9051;
   short aShort9095;
   short aShort9093;
   short aShort9067;
   short aShort9096;
   short aShort9097;
   boolean aBool9041 = false;
   short aShort9099;
   int[][] anIntArrayArray9084;
   int[][] anIntArrayArray9079;
   int[][] anIntArrayArray9108;
   short[] aShortArray9102;
   int[] anIntArray9092;
   short[] aShortArray9062;
   short[] aShortArray9080;
   int[] anIntArray9100;
   Class182[] aClass182Array9066;
   Class141[] aClass141Array9057;
   static int anInt9101;
   static int anInt9115;
   static int anInt9116;
   static boolean aBool9106;
   Class174_Sub2 aClass174_Sub2_9048;
   Interface15 anInterface15_9087;
   static float[] aFloatArray9110 = new float[2];
   static int[] anIntArray9111 = new int[8];
   static int[] anIntArray9112 = new int[8];
   static int[] anIntArray9113 = new int[8];
   static long[] aLongArray9109;
   Interface20 anInterface20_9086;

   public int method2088() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.anInt9090;
   }

   public int method2016() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9051;
   }

   public int method2109() {
      if(!this.aBool9041) {
         this.method1986();
      }

      return this.aShort9099;
   }

   static byte[] method8412(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   void method8413() {
      if(this.anInt9098 != 0) {
         if(this.aByte9049 != 0) {
            this.method8420(true);
         }

         this.method8420(false);
         if(this.aClass136_9085 != null) {
            if(this.aClass136_9085.anInterface20_1650 == null) {
               this.method8425((this.aByte9049 & 16) != 0);
            }

            if(this.aClass136_9085.anInterface20_1650 != null) {
               this.aClass174_Sub2_9048.method8646(this.aClass129_9083 != null);
               this.aClass174_Sub2_9048.method8634(this.aClass129_9081, this.aClass129_9083, this.aClass129_9044, this.aClass129_9114);
               int var1 = this.anIntArray9100.length - 1;

               for(int var2 = 0; var2 < var1; ++var2) {
                  int var3 = this.anIntArray9100[var2];
                  int var4 = this.anIntArray9100[var2 + 1];
                  int var5 = this.aShortArray9078[var3] == -1?-1:this.aShortArray9078[var3] & '\uffff';
                  this.aClass174_Sub2_9048.method8643(var5, this.aClass129_9083 != null);
                  this.aClass174_Sub2_9048.method8664(this.aClass136_9085.anInterface20_1650, 4, var3 * 3, (var4 - var3) * 3);
               }
            }
         }

         this.method8419();
      }
   }

   static float[] method8414(float[] var0, int var1) {
      float[] var2 = new float[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public int method2101() {
      return this.anInt9117;
   }

   public void method2110(int var1) {
      this.anInt9117 = var1;
      if(this.aClass151_9089 != null && (this.anInt9117 & 65536) == 0) {
         this.aShortArray9064 = this.aClass151_9089.aShortArray1719;
         this.aShortArray9065 = this.aClass151_9089.aShortArray1721;
         this.aShortArray9094 = this.aClass151_9089.aShortArray1720;
         this.aByteArray9061 = this.aClass151_9089.aByteArray1722;
         this.aClass151_9089 = null;
      }

      this.aBool9088 = true;
      this.method8419();
   }

   public void method1950() {
      if(this.anInt9063 > 0 && this.anInt9098 > 0) {
         this.method8420(false);
         if((this.aByte9049 & 16) == 0 && this.aClass136_9085.anInterface20_1650 == null) {
            this.method8425(false);
         }

         this.method8419();
      }
   }

   public Class168 method1947(byte var1, int var2, boolean var3) {
      boolean var4 = false;
      Class168_Sub1 var5;
      Class168_Sub1 var6;
      if(var1 > 0 && var1 <= 8) {
         var5 = this.aClass174_Sub2_9048.aClass168_Sub1Array9648[var1 - 1];
         var6 = this.aClass174_Sub2_9048.aClass168_Sub1Array9647[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class168_Sub1(this.aClass174_Sub2_9048);
      }

      return this.method8415(var6, var5, var2, var4, var3);
   }

   Class168 method8415(Class168_Sub1 var1, Class168_Sub1 var2, int var3, boolean var4, boolean var5) {
      var1.aByte9049 = 0;
      var1.anInt9117 = var3;
      var1.anInt9050 = this.anInt9050;
      var1.aShort9056 = this.aShort9056;
      var1.aShort9053 = this.aShort9053;
      var1.anInt9046 = this.anInt9046;
      var1.anInt9060 = this.anInt9060;
      var1.anInt9063 = this.anInt9063;
      var1.anInt9071 = this.anInt9071;
      var1.anInt9098 = this.anInt9098;
      var1.anInt9105 = this.anInt9105;
      if((var3 & 256) != 0) {
         var1.aBool9054 = true;
      } else {
         var1.aBool9054 = this.aBool9054;
      }

      var1.aBool9055 = this.aBool9055;
      boolean var6 = Class127.method1538(var3, this.anInt9050);
      boolean var7 = Class127.method1551(var3, this.anInt9050);
      boolean var8 = Class127.method1526(var3, this.anInt9050);
      boolean var9 = var6 | var7 | var8;
      int var10;
      if(var9) {
         if(var6) {
            if(var2.anIntArray9058 != null && var2.anIntArray9058.length >= this.anInt9046) {
               var1.anIntArray9058 = var2.anIntArray9058;
            } else {
               var1.anIntArray9058 = var2.anIntArray9058 = new int[this.anInt9046];
            }
         } else {
            var1.anIntArray9058 = this.anIntArray9058;
         }

         if(var7) {
            if(var2.anIntArray9059 != null && var2.anIntArray9059.length >= this.anInt9046) {
               var1.anIntArray9059 = var2.anIntArray9059;
            } else {
               var1.anIntArray9059 = var2.anIntArray9059 = new int[this.anInt9046];
            }
         } else {
            var1.anIntArray9059 = this.anIntArray9059;
         }

         if(var8) {
            if(var2.anIntArray9091 != null && var2.anIntArray9091.length >= this.anInt9046) {
               var1.anIntArray9091 = var2.anIntArray9091;
            } else {
               var1.anIntArray9091 = var2.anIntArray9091 = new int[this.anInt9046];
            }
         } else {
            var1.anIntArray9091 = this.anIntArray9091;
         }

         for(var10 = 0; var10 < this.anInt9046; ++var10) {
            if(var6) {
               var1.anIntArray9058[var10] = this.anIntArray9058[var10];
            }

            if(var7) {
               var1.anIntArray9059[var10] = this.anIntArray9059[var10];
            }

            if(var8) {
               var1.anIntArray9091[var10] = this.anIntArray9091[var10];
            }
         }
      } else {
         var1.anIntArray9058 = this.anIntArray9058;
         var1.anIntArray9059 = this.anIntArray9059;
         var1.anIntArray9091 = this.anIntArray9091;
      }

      if(Class127.method1539(var3, this.anInt9050)) {
         if(var4) {
            var1.aByte9049 = (byte)(var1.aByte9049 | 1);
         }

         var1.aClass129_9081 = var2.aClass129_9081;
         var1.aClass129_9081.aByte1614 = this.aClass129_9081.aByte1614;
         var1.aClass129_9081.anInterface15_1612 = this.aClass129_9081.anInterface15_1612;
      } else if(Class127.method1560(var3, this.anInt9050)) {
         var1.aClass129_9081 = this.aClass129_9081;
      } else {
         var1.aClass129_9081 = null;
      }

      if(Class127.method1578(var3, this.anInt9050)) {
         if(var2.aShortArray9082 != null && var2.aShortArray9082.length >= this.anInt9071) {
            var1.aShortArray9082 = var2.aShortArray9082;
         } else {
            var1.aShortArray9082 = var2.aShortArray9082 = new short[this.anInt9071];
         }

         for(var10 = 0; var10 < this.anInt9071; ++var10) {
            var1.aShortArray9082[var10] = this.aShortArray9082[var10];
         }
      } else {
         var1.aShortArray9082 = this.aShortArray9082;
      }

      if(Class127.method1528(var3, this.anInt9050)) {
         if(var2.aByteArray9074 != null && var2.aByteArray9074.length >= this.anInt9071) {
            var1.aByteArray9074 = var2.aByteArray9074;
         } else {
            var1.aByteArray9074 = var2.aByteArray9074 = new byte[this.anInt9071];
         }

         for(var10 = 0; var10 < this.anInt9071; ++var10) {
            var1.aByteArray9074[var10] = this.aByteArray9074[var10];
         }
      } else {
         var1.aByteArray9074 = this.aByteArray9074;
      }

      if(Class127.method1582(var3, this.anInt9050)) {
         if(var4) {
            var1.aByte9049 = (byte)(var1.aByte9049 | 2);
         }

         var1.aClass129_9044 = var2.aClass129_9044;
         var1.aClass129_9044.aByte1614 = this.aClass129_9044.aByte1614;
         var1.aClass129_9044.anInterface15_1612 = this.aClass129_9044.anInterface15_1612;
      } else if(Class127.method1536(var3, this.anInt9050)) {
         var1.aClass129_9044 = this.aClass129_9044;
      } else {
         var1.aClass129_9044 = null;
      }

      int var11;
      if(Class127.method1603(var3, this.anInt9050)) {
         if(var2.aShortArray9064 != null && var2.aShortArray9064.length >= this.anInt9063) {
            var1.aShortArray9064 = var2.aShortArray9064;
            var1.aShortArray9065 = var2.aShortArray9065;
            var1.aShortArray9094 = var2.aShortArray9094;
         } else {
            var10 = this.anInt9063;
            var1.aShortArray9064 = var2.aShortArray9064 = new short[var10];
            var1.aShortArray9065 = var2.aShortArray9065 = new short[var10];
            var1.aShortArray9094 = var2.aShortArray9094 = new short[var10];
         }

         if(this.aClass151_9089 != null) {
            if(var2.aClass151_9089 == null) {
               var2.aClass151_9089 = new Class151();
            }

            Class151 var12 = var1.aClass151_9089 = var2.aClass151_9089;
            if(var12.aShortArray1719 == null || var12.aShortArray1719.length < this.anInt9063) {
               var11 = this.anInt9063;
               var12.aShortArray1719 = new short[var11];
               var12.aShortArray1721 = new short[var11];
               var12.aShortArray1720 = new short[var11];
               var12.aByteArray1722 = new byte[var11];
            }

            for(var11 = 0; var11 < this.anInt9063; ++var11) {
               var1.aShortArray9064[var11] = this.aShortArray9064[var11];
               var1.aShortArray9065[var11] = this.aShortArray9065[var11];
               var1.aShortArray9094[var11] = this.aShortArray9094[var11];
               var12.aShortArray1719[var11] = this.aClass151_9089.aShortArray1719[var11];
               var12.aShortArray1721[var11] = this.aClass151_9089.aShortArray1721[var11];
               var12.aShortArray1720[var11] = this.aClass151_9089.aShortArray1720[var11];
               var12.aByteArray1722[var11] = this.aClass151_9089.aByteArray1722[var11];
            }
         } else {
            for(var10 = 0; var10 < this.anInt9063; ++var10) {
               var1.aShortArray9064[var10] = this.aShortArray9064[var10];
               var1.aShortArray9065[var10] = this.aShortArray9065[var10];
               var1.aShortArray9094[var10] = this.aShortArray9094[var10];
            }
         }

         var1.aByteArray9061 = this.aByteArray9061;
      } else {
         var1.aClass151_9089 = this.aClass151_9089;
         var1.aShortArray9064 = this.aShortArray9064;
         var1.aShortArray9065 = this.aShortArray9065;
         var1.aShortArray9094 = this.aShortArray9094;
         var1.aByteArray9061 = this.aByteArray9061;
      }

      if(Class127.method1542(var3, this.anInt9050)) {
         if(var4) {
            var1.aByte9049 = (byte)(var1.aByte9049 | 4);
         }

         var1.aClass129_9083 = var2.aClass129_9083;
         var1.aClass129_9083.aByte1614 = this.aClass129_9083.aByte1614;
         var1.aClass129_9083.anInterface15_1612 = this.aClass129_9083.anInterface15_1612;
      } else if(Class127.method1535(var3, this.anInt9050)) {
         var1.aClass129_9083 = this.aClass129_9083;
      } else {
         var1.aClass129_9083 = null;
      }

      if(Class127.method1591(var3, this.anInt9050)) {
         if(var2.aFloatArray9069 != null && var2.aFloatArray9069.length >= this.anInt9071) {
            var1.aFloatArray9069 = var2.aFloatArray9069;
            var1.aFloatArray9070 = var2.aFloatArray9070;
         } else {
            var10 = this.anInt9063;
            var1.aFloatArray9069 = var2.aFloatArray9069 = new float[var10];
            var1.aFloatArray9070 = var2.aFloatArray9070 = new float[var10];
         }

         for(var10 = 0; var10 < this.anInt9063; ++var10) {
            var1.aFloatArray9069[var10] = this.aFloatArray9069[var10];
            var1.aFloatArray9070[var10] = this.aFloatArray9070[var10];
         }
      } else {
         var1.aFloatArray9069 = this.aFloatArray9069;
         var1.aFloatArray9070 = this.aFloatArray9070;
      }

      if(Class127.method1561(var3, this.anInt9050)) {
         if(var4) {
            var1.aByte9049 = (byte)(var1.aByte9049 | 8);
         }

         var1.aClass129_9114 = var2.aClass129_9114;
         var1.aClass129_9114.aByte1614 = this.aClass129_9114.aByte1614;
         var1.aClass129_9114.anInterface15_1612 = this.aClass129_9114.anInterface15_1612;
      } else if(Class127.method1537(var3, this.anInt9050)) {
         var1.aClass129_9114 = this.aClass129_9114;
      } else {
         var1.aClass129_9114 = null;
      }

      if(Class127.method1580(var3, this.anInt9050)) {
         if(var2.aShortArray9075 != null && var2.aShortArray9075.length >= this.anInt9071) {
            var1.aShortArray9075 = var2.aShortArray9075;
            var1.aShortArray9076 = var2.aShortArray9076;
            var1.aShortArray9077 = var2.aShortArray9077;
         } else {
            var10 = this.anInt9071;
            var1.aShortArray9075 = var2.aShortArray9075 = new short[var10];
            var1.aShortArray9076 = var2.aShortArray9076 = new short[var10];
            var1.aShortArray9077 = var2.aShortArray9077 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt9071; ++var10) {
            var1.aShortArray9075[var10] = this.aShortArray9075[var10];
            var1.aShortArray9076[var10] = this.aShortArray9076[var10];
            var1.aShortArray9077[var10] = this.aShortArray9077[var10];
         }
      } else {
         var1.aShortArray9075 = this.aShortArray9075;
         var1.aShortArray9076 = this.aShortArray9076;
         var1.aShortArray9077 = this.aShortArray9077;
      }

      if(Class127.method1543(var3, this.anInt9050)) {
         if(var4) {
            var1.aByte9049 = (byte)(var1.aByte9049 | 16);
         }

         var1.aClass136_9085 = var2.aClass136_9085;
         var1.aClass136_9085.anInterface20_1650 = this.aClass136_9085.anInterface20_1650;
      } else if(Class127.method1567(var3, this.anInt9050)) {
         var1.aClass136_9085 = this.aClass136_9085;
      } else {
         var1.aClass136_9085 = null;
      }

      if(Class127.method1531(var3, this.anInt9050)) {
         if(var2.aShortArray9078 != null && var2.aShortArray9078.length >= this.anInt9071) {
            var1.aShortArray9078 = var2.aShortArray9078;
         } else {
            var10 = this.anInt9071;
            var1.aShortArray9078 = var2.aShortArray9078 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt9071; ++var10) {
            var1.aShortArray9078[var10] = this.aShortArray9078[var10];
         }
      } else {
         var1.aShortArray9078 = this.aShortArray9078;
      }

      if(Class127.method1599(var3, this.anInt9050)) {
         if(var2.aClass137Array9104 != null && var2.aClass137Array9104.length >= this.anInt9105) {
            var1.aClass137Array9104 = var2.aClass137Array9104;

            for(var10 = 0; var10 < this.anInt9105; ++var10) {
               var1.aClass137Array9104[var10].method1639(this.aClass137Array9104[var10]);
            }
         } else {
            var10 = this.anInt9105;
            var1.aClass137Array9104 = var2.aClass137Array9104 = new Class137[var10];

            for(var11 = 0; var11 < this.anInt9105; ++var11) {
               var1.aClass137Array9104[var11] = this.aClass137Array9104[var11].method1640();
            }
         }
      } else {
         var1.aClass137Array9104 = this.aClass137Array9104;
      }

      var1.aClass147Array9043 = this.aClass147Array9043;
      if(this.aBool9072) {
         var1.anInt9107 = this.anInt9107;
         var1.anInt9090 = this.anInt9090;
         var1.aShort9051 = this.aShort9051;
         var1.aShort9095 = this.aShort9095;
         var1.aShort9093 = this.aShort9093;
         var1.aShort9067 = this.aShort9067;
         var1.aShort9096 = this.aShort9096;
         var1.aShort9097 = this.aShort9097;
         var1.aBool9072 = true;
      } else {
         var1.aBool9072 = false;
      }

      if(this.aBool9041) {
         var1.aShort9099 = this.aShort9099;
         var1.aBool9041 = true;
      } else {
         var1.aBool9041 = false;
      }

      var1.anIntArrayArray9084 = this.anIntArrayArray9084;
      var1.anIntArrayArray9079 = this.anIntArrayArray9079;
      var1.anIntArrayArray9108 = this.anIntArrayArray9108;
      var1.aShortArray9102 = this.aShortArray9102;
      var1.anIntArray9092 = this.anIntArray9092;
      var1.aShortArray9062 = this.aShortArray9062;
      var1.aShortArray9080 = this.aShortArray9080;
      var1.anIntArray9100 = this.anIntArray9100;
      var1.aClass182Array9066 = this.aClass182Array9066;
      var1.aClass141Array9057 = this.aClass141Array9057;
      return var1;
   }

   void method2115() {
      for(int var1 = 0; var1 < this.anInt9046; ++var1) {
         this.anIntArray9058[var1] = this.anIntArray9058[var1] + 7 >> 4;
         this.anIntArray9059[var1] = this.anIntArray9059[var1] + 7 >> 4;
         this.anIntArray9091[var1] = this.anIntArray9091[var1] + 7 >> 4;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2027(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 128) {
            this.anIntArray9058[var4] = this.anIntArray9058[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray9059[var4] = this.anIntArray9059[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 >> 7;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2076(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         int var5 = this.anIntArray9059[var4] * var3 - this.anIntArray9091[var4] * var2 >> 14;
         this.anIntArray9091[var4] = this.anIntArray9059[var4] * var2 + this.anIntArray9091[var4] * var3 >> 14;
         this.anIntArray9059[var4] = var5;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method1954(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         int var5 = this.anIntArray9059[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9059[var4] = this.anIntArray9059[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method1942(Class445 var1) {
      Class433 var2 = this.aClass174_Sub2_9048.aClass433_9558;
      var2.method5110(var1);
      int var3;
      if(this.aClass182Array9066 != null) {
         for(var3 = 0; var3 < this.aClass182Array9066.length; ++var3) {
            Class182 var4 = this.aClass182Array9066[var3];
            Class182 var5 = var4;
            if(var4.aClass182_2080 != null) {
               var5 = var4.aClass182_2080;
            }

            var5.anInt2093 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9058[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[4] * (float)this.anIntArray9059[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[8] * (float)this.anIntArray9091[var4.anInt2086 * -1235344453]) * -1678451107;
            var5.anInt2083 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9058[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[5] * (float)this.anIntArray9059[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[9] * (float)this.anIntArray9091[var4.anInt2086 * -1235344453]) * -670678921;
            var5.anInt2085 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9058[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[6] * (float)this.anIntArray9059[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[10] * (float)this.anIntArray9091[var4.anInt2086 * -1235344453]) * 438141997;
            var5.anInt2087 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9058[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[4] * (float)this.anIntArray9059[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[8] * (float)this.anIntArray9091[var4.anInt2088 * -1119018737]) * 380933187;
            var5.anInt2090 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9058[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[5] * (float)this.anIntArray9059[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[9] * (float)this.anIntArray9091[var4.anInt2088 * -1119018737]) * -1991830625;
            var5.anInt2091 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9058[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[6] * (float)this.anIntArray9059[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[10] * (float)this.anIntArray9091[var4.anInt2088 * -1119018737]) * -1592918039;
            var5.anInt2092 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9058[var4.anInt2084 * 724817697] + var2.aFloatArray4841[4] * (float)this.anIntArray9059[var4.anInt2084 * 724817697] + var2.aFloatArray4841[8] * (float)this.anIntArray9091[var4.anInt2084 * 724817697]) * -2133088645;
            var5.anInt2079 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9058[var4.anInt2084 * 724817697] + var2.aFloatArray4841[5] * (float)this.anIntArray9059[var4.anInt2084 * 724817697] + var2.aFloatArray4841[9] * (float)this.anIntArray9091[var4.anInt2084 * 724817697]) * -615490343;
            var5.anInt2094 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9058[var4.anInt2084 * 724817697] + var2.aFloatArray4841[6] * (float)this.anIntArray9059[var4.anInt2084 * 724817697] + var2.aFloatArray4841[10] * (float)this.anIntArray9091[var4.anInt2084 * 724817697]) * -1023720607;
         }
      }

      if(this.aClass141Array9057 != null) {
         for(var3 = 0; var3 < this.aClass141Array9057.length; ++var3) {
            Class141 var6 = this.aClass141Array9057[var3];
            Class141 var7 = var6;
            if(var6.aClass141_1666 != null) {
               var7 = var6.aClass141_1666;
            }

            if(var6.aClass433_1665 != null) {
               var6.aClass433_1665.method5083(var2);
            } else {
               var6.aClass433_1665 = new Class433(var2);
            }

            var7.anInt1668 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9058[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[4] * (float)this.anIntArray9059[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[8] * (float)this.anIntArray9091[var6.anInt1667 * -1043750635]) * -1843315017;
            var7.anInt1670 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9058[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[5] * (float)this.anIntArray9059[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[9] * (float)this.anIntArray9091[var6.anInt1667 * -1043750635]) * -1977850275;
            var7.anInt1669 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9058[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[6] * (float)this.anIntArray9059[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[10] * (float)this.anIntArray9091[var6.anInt1667 * -1043750635]) * 874542269;
         }
      }

   }

   public Class526_Sub21_Sub5 method1976(Class526_Sub21_Sub5 var1) {
      if(this.anInt9063 == 0) {
         return null;
      } else {
         if(!this.aBool9072) {
            this.method8426();
         }

         int var2;
         int var3;
         if(this.aClass174_Sub2_9048.anInt9591 > 0) {
            var2 = this.aShort9051 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var3 = this.aShort9095 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         } else {
            var2 = this.aShort9051 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var3 = this.aShort9095 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         }

         int var4;
         int var5;
         if(this.aClass174_Sub2_9048.anInt9566 > 0) {
            var4 = this.aShort9096 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var5 = this.aShort9097 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         } else {
            var4 = this.aShort9096 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var5 = this.aShort9097 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         Class526_Sub21_Sub5_Sub2 var8 = (Class526_Sub21_Sub5_Sub2)var1;
         Class526_Sub21_Sub5_Sub2 var9;
         if(var8 != null && var8.method10908(var6, var7)) {
            var9 = var8;
            var8.method10898();
         } else {
            var9 = new Class526_Sub21_Sub5_Sub2(this.aClass174_Sub2_9048, var6, var7);
         }

         var9.method10897(var2, var4, var3, var5);
         this.method8417(var9);
         return var9;
      }
   }

   public void method1957(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 128) {
            this.anIntArray9058[var4] = this.anIntArray9058[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray9059[var4] = this.anIntArray9059[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 >> 7;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2036(int var1, int var2, Class148 var3, Class148 var4, int var5, int var6, int var7) {
      if(!this.aBool9072) {
         this.method8426();
      }

      int var8 = var5 + this.aShort9051;
      int var9 = var5 + this.aShort9095;
      int var10 = var7 + this.aShort9096;
      int var11 = var7 + this.aShort9097;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1711 * 1966165105 && var10 >= 0 && var11 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1713 * -810756899) {
         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.anInt1710 * -586661047;
            var9 = var9 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            var10 >>= var3.anInt1710 * -586661047;
            var11 = var11 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            if(var3.method1714(var8, var10, -368445695) == var6 && var3.method1714(var9, var10, 520514694) == var6 && var3.method1714(var8, var11, 1163718626) == var6 && var3.method1714(var9, var11, 1378359986) == var6) {
               return;
            }
         } else {
            if(var4 == null) {
               return;
            }

            if(var8 < 0 || var9 + var4.anInt1712 * 1934131013 >> var4.anInt1710 * -586661047 >= var4.anInt1711 * 1966165105 || var10 < 0 || var11 + var4.anInt1712 * 1934131013 >> var4.anInt1710 * -586661047 >= var4.anInt1713 * -810756899) {
               return;
            }
         }

         int var12;
         if(var1 == 1) {
            for(var12 = 0; var12 < this.anInt9060; ++var12) {
               this.anIntArray9059[var12] = this.anIntArray9059[var12] + var3.method1724(this.anIntArray9058[var12] + var5, this.anIntArray9091[var12] + var7, (byte)26) - var6;
            }
         } else {
            int var13;
            int var14;
            if(var1 == 2) {
               short var19 = this.aShort9093;
               if(var19 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.anInt9060; ++var13) {
                  var14 = (this.anIntArray9059[var13] << 16) / var19;
                  if(var14 < var2) {
                     this.anIntArray9059[var13] += (var3.method1724(this.anIntArray9058[var13] + var5, this.anIntArray9091[var13] + var7, (byte)74) - var6) * (var2 - var14) / var2;
                  }
               }
            } else {
               int var15;
               if(var1 == 3) {
                  var12 = (var2 & 255) * 16;
                  var13 = (var2 >> 8 & 255) * 16;
                  var14 = (var2 >> 16 & 255) << 6;
                  var15 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var12 >> 1) < 0 || var5 + (var12 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1711 * 1966165105 << var3.anInt1710 * -586661047 || var7 - (var13 >> 1) < 0 || var7 + (var13 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1713 * -810756899 << var3.anInt1710 * -586661047) {
                     return;
                  }

                  this.method1966(var3, var5, var6, var7, var12, var13, var14, var15);
               } else if(var1 == 4) {
                  var12 = this.aShort9067 - this.aShort9093;

                  for(var13 = 0; var13 < this.anInt9060; ++var13) {
                     this.anIntArray9059[var13] = this.anIntArray9059[var13] + (var4.method1724(this.anIntArray9058[var13] + var5, this.anIntArray9091[var13] + var7, (byte)-8) - var6) + var12;
                  }
               } else if(var1 == 5) {
                  var12 = this.aShort9067 - this.aShort9093;

                  for(var13 = 0; var13 < this.anInt9060; ++var13) {
                     var14 = this.anIntArray9058[var13] + var5;
                     var15 = this.anIntArray9091[var13] + var7;
                     int var16 = var3.method1724(var14, var15, (byte)10);
                     int var17 = var4.method1724(var14, var15, (byte)55);
                     int var18 = var16 - var17 - var2;
                     this.anIntArray9059[var13] = ((this.anIntArray9059[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         if(this.aClass129_9081 != null) {
            this.aClass129_9081.anInterface15_1612 = null;
         }

         this.aBool9072 = false;
      }
   }

   public int method2075() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9097;
   }

   public void method1986() {
      if(!this.aBool9041) {
         if(!this.aBool9072) {
            this.method8426();
         }

         this.aShort9099 = this.aShort9093;
         this.aBool9041 = true;
      }

   }

   public int method2117() {
      return this.aShort9056;
   }

   public int method2063() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.anInt9107;
   }

   public int method2108() {
      if(!this.aBool9041) {
         this.method1986();
      }

      return this.aShort9099;
   }

   void method2033() {
   }

   public int method1981() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9093;
   }

   public int method1988() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9067;
   }

   public int method1983() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9096;
   }

   void method2031() {
   }

   public int method1985() {
      if(!this.aBool9041) {
         this.method1986();
      }

      return this.aShort9099;
   }

   public boolean method2102() {
      return this.aBool9055;
   }

   public void method1973(int var1) {
      this.aShort9053 = (short)var1;
      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

   }

   public int method1965() {
      return this.aShort9056;
   }

   public int method2083() {
      return this.aShort9053;
   }

   public int method1980() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9095;
   }

   public void method1940(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9071; ++var3) {
         if(this.aShortArray9082[var3] == var1) {
            this.aShortArray9082[var3] = var2;
         }
      }

      if(this.aClass147Array9043 != null) {
         for(var3 = 0; var3 < this.anInt9105; ++var3) {
            Class147 var4 = this.aClass147Array9043[var3];
            Class137 var5 = this.aClass137Array9104[var3];
            var5.anInt1653 = var5.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var4.anInt1703] & '\uffff'] & 16777215;
         }
      }

      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public void method2028(byte var1, byte[] var2) {
      int var3;
      if(var2 == null) {
         for(var3 = 0; var3 < this.anInt9071; ++var3) {
            this.aByteArray9074[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.anInt9071; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.aByteArray9074[var3] = (byte)var4;
         }
      }

      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public void method1992(short var1, short var2) {
      Class169 var3 = this.aClass174_Sub2_9048.aClass169_2035;

      for(int var4 = 0; var4 < this.anInt9071; ++var4) {
         if(this.aShortArray9078[var4] == var1) {
            this.aShortArray9078[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if(var1 != -1) {
         Class171 var6 = var3.method2122(var1 & '\uffff', (byte)3);
         var11 = var6.aByte1969;
         var5 = var6.aByte2012;
      }

      byte var12 = 0;
      byte var7 = 0;
      if(var2 != -1) {
         Class171 var8 = var3.method2122(var2 & '\uffff', (byte)-34);
         var12 = var8.aByte1969;
         var7 = var8.aByte2012;
         if(var8.aByte1986 != 0 || var8.aByte1963 != 0) {
            this.aBool9055 = true;
         }
      }

      if(var11 != var12 | var5 != var7) {
         if(this.aClass147Array9043 != null) {
            for(int var13 = 0; var13 < this.anInt9105; ++var13) {
               Class147 var9 = this.aClass147Array9043[var13];
               Class137 var10 = this.aClass137Array9104[var13];
               var10.anInt1653 = var10.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var9.anInt1703] & '\uffff'] & 16777215;
            }
         }

         if(this.aClass129_9044 != null) {
            this.aClass129_9044.anInterface15_1612 = null;
         }
      }

   }

   public void method2020(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.anInt9071; ++var5) {
         int var6 = this.aShortArray9082[var5] & '\uffff';
         int var7 = var6 >> 10 & 63;
         int var8 = var6 >> 7 & 7;
         int var9 = var6 & 127;
         if(var1 != -1) {
            var7 += (var1 - var7) * var4 >> 7;
         }

         if(var2 != -1) {
            var8 += (var2 - var8) * var4 >> 7;
         }

         if(var3 != -1) {
            var9 += (var3 - var9) * var4 >> 7;
         }

         this.aShortArray9082[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if(this.aClass147Array9043 != null) {
         for(var5 = 0; var5 < this.anInt9105; ++var5) {
            Class147 var10 = this.aClass147Array9043[var5];
            Class137 var11 = this.aClass137Array9104[var5];
            var11.anInt1653 = var11.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var10.anInt1703] & '\uffff'] & 16777215;
         }
      }

      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public int method2093() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9093;
   }

   public byte[] method2078() {
      return this.aByteArray9074;
   }

   public boolean method1953() {
      return this.aBool9055;
   }

   void method1960() {
   }

   void method1978() {
   }

   boolean method2072() {
      if(this.anIntArrayArray9084 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9046; ++var1) {
            this.anIntArray9058[var1] <<= 4;
            this.anIntArray9059[var1] <<= 4;
            this.anIntArray9091[var1] <<= 4;
         }

         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;
         return true;
      }
   }

   void method1970(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var49;
      int var50;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var49 = var2[var11];
            if(var49 < this.anIntArrayArray9084.length) {
               int[] var52 = this.anIntArrayArray9084[var49];

               for(var50 = 0; var50 < var52.length; ++var50) {
                  var15 = var52[var50];
                  if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var15]) != 0) {
                     anInt9101 += this.anIntArray9058[var15];
                     anInt9115 += this.anIntArray9059[var15];
                     anInt9116 += this.anIntArray9091[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            anInt9101 = anInt9101 / var10 + var3;
            anInt9115 = anInt9115 / var10 + var4;
            anInt9116 = anInt9116 / var10 + var5;
            aBool9106 = true;
         } else {
            anInt9101 = var3;
            anInt9115 = var4;
            anInt9116 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var49 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var49;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9084.length) {
                  var12 = this.anIntArrayArray9084[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var50 = var12[var13];
                     if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                        this.anIntArray9058[var50] += var3;
                        this.anIntArray9059[var50] += var4;
                        this.anIntArray9091[var50] += var5;
                     }
                  }
               }
            }

         } else {
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var26;
            int var27;
            int var28;
            int var30;
            int var32;
            int var33;
            int var34;
            int[] var35;
            int var36;
            int var37;
            int var38;
            int var39;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBool9106) {
                     var16 = var8[0] * anInt9101 + var8[3] * anInt9115 + var8[6] * anInt9116 + 8192 >> 14;
                     var17 = var8[1] * anInt9101 + var8[4] * anInt9115 + var8[7] * anInt9116 + 8192 >> 14;
                     var18 = var8[2] * anInt9101 + var8[5] * anInt9115 + var8[8] * anInt9116 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     anInt9101 = var16;
                     anInt9115 = var17;
                     anInt9116 = var18;
                     aBool9106 = false;
                  }

                  int[] var51 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var51[0] * -anInt9101 + var51[1] * -anInt9115 + var51[2] * -anInt9116 + 8192 >> 14;
                  var26 = var51[3] * -anInt9101 + var51[4] * -anInt9115 + var51[5] * -anInt9116 + 8192 >> 14;
                  var27 = var51[6] * -anInt9101 + var51[7] * -anInt9115 + var51[8] * -anInt9116 + 8192 >> 14;
                  var28 = var53 + anInt9101;
                  int var54 = var26 + anInt9115;
                  var30 = var27 + anInt9116;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var51[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var13 + var51[1] * var50 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var13 + var51[4] * var50 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var13 + var51[7] * var50 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var49;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9084.length) {
                        int[] var41 = this.anIntArrayArray9084[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9058[var43] + var35[1] * this.anIntArray9059[var43] + var35[2] * this.anIntArray9091[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9058[var43] + var35[4] * this.anIntArray9059[var43] + var35[5] * this.anIntArray9091[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9058[var43] + var35[7] * this.anIntArray9059[var43] + var35[8] * this.anIntArray9091[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9058[var43] = var44;
                              this.anIntArray9059[var43] = var45;
                              this.anIntArray9091[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9084.length) {
                        var12 = this.anIntArrayArray9084[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                              this.anIntArray9058[var50] -= anInt9101;
                              this.anIntArray9059[var50] -= anInt9115;
                              this.anIntArray9091[var50] -= anInt9116;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9059[var50] * var15 + this.anIntArray9058[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9059[var50] = this.anIntArray9059[var50] * var16 - this.anIntArray9058[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9058[var50] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9059[var50] * var16 - this.anIntArray9091[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9091[var50] = this.anIntArray9059[var50] * var15 + this.anIntArray9091[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9059[var50] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9091[var50] * var15 + this.anIntArray9058[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9091[var50] = this.anIntArray9091[var50] * var16 - this.anIntArray9058[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9058[var50] = var17;
                              }

                              this.anIntArray9058[var50] += anInt9101;
                              this.anIntArray9059[var50] += anInt9115;
                              this.anIntArray9091[var50] += anInt9116;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9084.length) {
                           var12 = this.anIntArrayArray9084[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                                 var15 = this.anIntArray9092[var50];
                                 var16 = this.anIntArray9092[var50 + 1];

                                 for(var17 = var15; var17 < var16 && this.aShortArray9102[var17] != 0; ++var17) {
                                    var18 = (this.aShortArray9102[var17] & '\uffff') - 1;
                                    if(var5 != 0) {
                                       var19 = Class443.anIntArray4895[var5];
                                       var20 = Class443.anIntArray4896[var5];
                                       var21 = this.aShortArray9065[var18] * var19 + this.aShortArray9064[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9065[var18] = (short)(this.aShortArray9065[var18] * var20 - this.aShortArray9064[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9064[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Class443.anIntArray4895[var3];
                                       var20 = Class443.anIntArray4896[var3];
                                       var21 = this.aShortArray9065[var18] * var20 - this.aShortArray9094[var18] * var19 + 16383 >> 14;
                                       this.aShortArray9094[var18] = (short)(this.aShortArray9065[var18] * var19 + this.aShortArray9094[var18] * var20 + 16383 >> 14);
                                       this.aShortArray9065[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Class443.anIntArray4895[var4];
                                       var20 = Class443.anIntArray4896[var4];
                                       var21 = this.aShortArray9094[var18] * var19 + this.aShortArray9064[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9094[var18] = (short)(this.aShortArray9094[var18] * var20 - this.aShortArray9064[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9064[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                        this.aClass129_9044.anInterface15_1612 = null;
                     }

                     if(this.aClass129_9083 != null) {
                        this.aClass129_9083.anInterface15_1612 = null;
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBool9106) {
                     var16 = var8[0] * anInt9101 + var8[3] * anInt9115 + var8[6] * anInt9116 + 8192 >> 14;
                     var17 = var8[1] * anInt9101 + var8[4] * anInt9115 + var8[7] * anInt9116 + 8192 >> 14;
                     var18 = var8[2] * anInt9101 + var8[5] * anInt9115 + var8[8] * anInt9116 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     anInt9101 = var16;
                     anInt9115 = var17;
                     anInt9116 = var18;
                     aBool9106 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -anInt9101 + 8192 >> 14;
                  var20 = var17 * -anInt9115 + 8192 >> 14;
                  var21 = var18 * -anInt9116 + 8192 >> 14;
                  var22 = var19 + anInt9101;
                  var23 = var20 + anInt9115;
                  var24 = var21 + anInt9116;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var50 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var49;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9084.length) {
                        var35 = this.anIntArrayArray9084[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9058[var37] + var29[1] * this.anIntArray9059[var37] + var29[2] * this.anIntArray9091[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9058[var37] + var29[4] * this.anIntArray9059[var37] + var29[5] * this.anIntArray9091[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9058[var37] + var29[7] * this.anIntArray9059[var37] + var29[8] * this.anIntArray9091[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9058[var37] = var38;
                              this.anIntArray9059[var37] = var39;
                              this.anIntArray9091[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9084.length) {
                        var12 = this.anIntArrayArray9084[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                              this.anIntArray9058[var50] -= anInt9101;
                              this.anIntArray9059[var50] -= anInt9115;
                              this.anIntArray9091[var50] -= anInt9116;
                              this.anIntArray9058[var50] = this.anIntArray9058[var50] * var3 >> 7;
                              this.anIntArray9059[var50] = this.anIntArray9059[var50] * var4 >> 7;
                              this.anIntArray9091[var50] = this.anIntArray9091[var50] * var5 >> 7;
                              this.anIntArray9058[var50] += anInt9101;
                              this.anIntArray9059[var50] += anInt9115;
                              this.anIntArray9091[var50] += anInt9116;
                           }
                        }
                     }
                  }
               }

            } else {
               Class147 var47;
               Class137 var48;
               if(var1 == 5) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9079.length) {
                           var12 = this.anIntArrayArray9079[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9080 == null || (var7 & this.aShortArray9080[var50]) != 0) {
                                 var15 = (this.aByteArray9074[var50] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.aByteArray9074[var50] = (byte)var15;
                                 if(this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var10 = 0; var10 < this.anInt9105; ++var10) {
                           var47 = this.aClass147Array9043[var10];
                           var48 = this.aClass137Array9104[var10];
                           var48.anInt1653 = var48.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var47.anInt1703] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9079.length) {
                           var12 = this.anIntArrayArray9079[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9080 == null || (var7 & this.aShortArray9080[var50]) != 0) {
                                 var15 = this.aShortArray9082[var50] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4 / 4;
                                 if(var17 < 0) {
                                    var17 = 0;
                                 } else if(var17 > 7) {
                                    var17 = 7;
                                 }

                                 var18 += var5;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 127) {
                                    var18 = 127;
                                 }

                                 this.aShortArray9082[var50] = (short)(var16 << 10 | var17 << 7 | var18);
                                 if(this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var10 = 0; var10 < this.anInt9105; ++var10) {
                           var47 = this.aClass147Array9043[var10];
                           var48 = this.aClass137Array9104[var10];
                           var48.anInt1653 = var48.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var47.anInt1703] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class137 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1654 += var3;
                                 var14.anInt1655 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1651 = var14.anInt1651 * var3 >> 7;
                                 var14.anInt1652 = var14.anInt1652 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1656 = var14.anInt1656 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method1971(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var10 = 0; var10 < this.anInt9060; ++var10) {
            anInt9101 += this.anIntArray9058[var10];
            anInt9115 += this.anIntArray9059[var10];
            anInt9116 += this.anIntArray9091[var10];
            ++var5;
         }

         if(var5 > 0) {
            anInt9101 = anInt9101 / var5 + var2;
            anInt9115 = anInt9115 / var5 + var3;
            anInt9116 = anInt9116 / var5 + var4;
         } else {
            anInt9101 = var2;
            anInt9115 = var3;
            anInt9116 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.anInt9060; ++var5) {
            this.anIntArray9058[var5] += var2;
            this.anIntArray9059[var5] += var3;
            this.anIntArray9091[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.anInt9060; ++var5) {
               this.anIntArray9058[var5] -= anInt9101;
               this.anIntArray9059[var5] -= anInt9115;
               this.anIntArray9091[var5] -= anInt9116;
               if(var4 != 0) {
                  var10 = Class443.anIntArray4895[var4];
                  var7 = Class443.anIntArray4896[var4];
                  var8 = this.anIntArray9059[var5] * var10 + this.anIntArray9058[var5] * var7 + 16383 >> 14;
                  this.anIntArray9059[var5] = this.anIntArray9059[var5] * var7 - this.anIntArray9058[var5] * var10 + 16383 >> 14;
                  this.anIntArray9058[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = Class443.anIntArray4895[var2];
                  var7 = Class443.anIntArray4896[var2];
                  var8 = this.anIntArray9059[var5] * var7 - this.anIntArray9091[var5] * var10 + 16383 >> 14;
                  this.anIntArray9091[var5] = this.anIntArray9059[var5] * var10 + this.anIntArray9091[var5] * var7 + 16383 >> 14;
                  this.anIntArray9059[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = Class443.anIntArray4895[var3];
                  var7 = Class443.anIntArray4896[var3];
                  var8 = this.anIntArray9091[var5] * var10 + this.anIntArray9058[var5] * var7 + 16383 >> 14;
                  this.anIntArray9091[var5] = this.anIntArray9091[var5] * var7 - this.anIntArray9058[var5] * var10 + 16383 >> 14;
                  this.anIntArray9058[var5] = var8;
               }

               this.anIntArray9058[var5] += anInt9101;
               this.anIntArray9059[var5] += anInt9115;
               this.anIntArray9091[var5] += anInt9116;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.anInt9060; ++var5) {
               this.anIntArray9058[var5] -= anInt9101;
               this.anIntArray9059[var5] -= anInt9115;
               this.anIntArray9091[var5] -= anInt9116;
               this.anIntArray9058[var5] = this.anIntArray9058[var5] * var2 / 128;
               this.anIntArray9059[var5] = this.anIntArray9059[var5] * var3 / 128;
               this.anIntArray9091[var5] = this.anIntArray9091[var5] * var4 / 128;
               this.anIntArray9058[var5] += anInt9101;
               this.anIntArray9059[var5] += anInt9115;
               this.anIntArray9091[var5] += anInt9116;
            }

         } else {
            Class147 var11;
            Class137 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt9071; ++var5) {
                  var10 = (this.aByteArray9074[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.aByteArray9074[var5] = (byte)var10;
               }

               if(this.aClass129_9044 != null) {
                  this.aClass129_9044.anInterface15_1612 = null;
               }

               if(this.aClass147Array9043 != null) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var11 = this.aClass147Array9043[var5];
                     var12 = this.aClass137Array9104[var5];
                     var12.anInt1653 = var12.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var11.anInt1703] & 255) << 24;
                  }
               }

            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt9071; ++var5) {
                  var10 = this.aShortArray9082[var5] & '\uffff';
                  var7 = var10 >> 10 & 63;
                  var8 = var10 >> 7 & 7;
                  int var9 = var10 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.aShortArray9082[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if(this.aClass129_9044 != null) {
                  this.aClass129_9044.anInterface15_1612 = null;
               }

               if(this.aClass147Array9043 != null) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var11 = this.aClass147Array9043[var5];
                     var12 = this.aClass137Array9104[var5];
                     var12.anInt1653 = var12.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var11.anInt1703] & '\uffff'] & 16777215;
                  }
               }

            } else {
               Class137 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var6 = this.aClass137Array9104[var5];
                     var6.anInt1654 += var2;
                     var6.anInt1655 += var3;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var6 = this.aClass137Array9104[var5];
                     var6.anInt1651 = var6.anInt1651 * var2 >> 7;
                     var6.anInt1652 = var6.anInt1652 * var3 >> 7;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var6 = this.aClass137Array9104[var5];
                     var6.anInt1656 = var6.anInt1656 + var2 & 16383;
                  }

               }
            }
         }
      }
   }

   Class168_Sub1(Class174_Sub2 var1) {
      this.aClass174_Sub2_9048 = var1;
      this.aClass129_9081 = new Class129((Interface15)null, 5126, 3, 0);
      this.aClass129_9114 = new Class129((Interface15)null, 5126, 2, 0);
      this.aClass129_9083 = new Class129((Interface15)null, 5126, 3, 0);
      this.aClass129_9044 = new Class129((Interface15)null, 5121, 4, 0);
      this.aClass136_9085 = new Class136();
   }

   public void method1948(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9062 != null) {
         Class445 var4 = var1;
         if(var3) {
            var4 = this.aClass174_Sub2_9048.aClass445_9557;
            var4.method5223(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt9060; ++var6) {
            if((var2 & this.aShortArray9062[var6]) != 0) {
               var4.method5233((float)this.anIntArray9058[var6], (float)this.anIntArray9059[var6], (float)this.anIntArray9091[var6], var5);
               this.anIntArray9058[var6] = (int)var5[0];
               this.anIntArray9059[var6] = (int)var5[1];
               this.anIntArray9091[var6] = (int)var5[2];
            }
         }

      }
   }

   public Class141[] method2064() {
      return this.aClass141Array9057;
   }

   public Class182[] method1997() {
      return this.aClass182Array9066;
   }

   public void method1996(Class445 var1) {
      Class433 var2 = this.aClass174_Sub2_9048.aClass433_9558;
      var2.method5110(var1);
      int var3;
      if(this.aClass182Array9066 != null) {
         for(var3 = 0; var3 < this.aClass182Array9066.length; ++var3) {
            Class182 var4 = this.aClass182Array9066[var3];
            Class182 var5 = var4;
            if(var4.aClass182_2080 != null) {
               var5 = var4.aClass182_2080;
            }

            var5.anInt2093 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9058[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[4] * (float)this.anIntArray9059[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[8] * (float)this.anIntArray9091[var4.anInt2086 * -1235344453]) * -1678451107;
            var5.anInt2083 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9058[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[5] * (float)this.anIntArray9059[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[9] * (float)this.anIntArray9091[var4.anInt2086 * -1235344453]) * -670678921;
            var5.anInt2085 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9058[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[6] * (float)this.anIntArray9059[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[10] * (float)this.anIntArray9091[var4.anInt2086 * -1235344453]) * 438141997;
            var5.anInt2087 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9058[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[4] * (float)this.anIntArray9059[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[8] * (float)this.anIntArray9091[var4.anInt2088 * -1119018737]) * 380933187;
            var5.anInt2090 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9058[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[5] * (float)this.anIntArray9059[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[9] * (float)this.anIntArray9091[var4.anInt2088 * -1119018737]) * -1991830625;
            var5.anInt2091 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9058[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[6] * (float)this.anIntArray9059[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[10] * (float)this.anIntArray9091[var4.anInt2088 * -1119018737]) * -1592918039;
            var5.anInt2092 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9058[var4.anInt2084 * 724817697] + var2.aFloatArray4841[4] * (float)this.anIntArray9059[var4.anInt2084 * 724817697] + var2.aFloatArray4841[8] * (float)this.anIntArray9091[var4.anInt2084 * 724817697]) * -2133088645;
            var5.anInt2079 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9058[var4.anInt2084 * 724817697] + var2.aFloatArray4841[5] * (float)this.anIntArray9059[var4.anInt2084 * 724817697] + var2.aFloatArray4841[9] * (float)this.anIntArray9091[var4.anInt2084 * 724817697]) * -615490343;
            var5.anInt2094 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9058[var4.anInt2084 * 724817697] + var2.aFloatArray4841[6] * (float)this.anIntArray9059[var4.anInt2084 * 724817697] + var2.aFloatArray4841[10] * (float)this.anIntArray9091[var4.anInt2084 * 724817697]) * -1023720607;
         }
      }

      if(this.aClass141Array9057 != null) {
         for(var3 = 0; var3 < this.aClass141Array9057.length; ++var3) {
            Class141 var6 = this.aClass141Array9057[var3];
            Class141 var7 = var6;
            if(var6.aClass141_1666 != null) {
               var7 = var6.aClass141_1666;
            }

            if(var6.aClass433_1665 != null) {
               var6.aClass433_1665.method5083(var2);
            } else {
               var6.aClass433_1665 = new Class433(var2);
            }

            var7.anInt1668 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9058[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[4] * (float)this.anIntArray9059[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[8] * (float)this.anIntArray9091[var6.anInt1667 * -1043750635]) * -1843315017;
            var7.anInt1670 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9058[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[5] * (float)this.anIntArray9059[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[9] * (float)this.anIntArray9091[var6.anInt1667 * -1043750635]) * -1977850275;
            var7.anInt1669 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9058[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[6] * (float)this.anIntArray9059[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[10] * (float)this.anIntArray9091[var6.anInt1667 * -1043750635]) * 874542269;
         }
      }

   }

   public boolean method1975(int var1, int var2, Class445 var3, boolean var4, int var5) {
      Class433 var6 = this.aClass174_Sub2_9048.aClass433_9558;
      var6.method5110(var3);
      var6.method5085(this.aClass174_Sub2_9048.aClass433_9546);
      boolean var7 = false;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;
      int var10 = Integer.MAX_VALUE;
      int var11 = Integer.MIN_VALUE;
      if(!this.aBool9072) {
         this.method8426();
      }

      int var12 = this.aShort9095 - this.aShort9051 >> 1;
      int var13 = this.aShort9067 - this.aShort9093 >> 1;
      int var14 = this.aShort9097 - this.aShort9096 >> 1;
      int var15 = this.aShort9051 + var12;
      int var16 = this.aShort9093 + var13;
      int var17 = this.aShort9096 + var14;
      int var18 = var15 - (var12 << var5);
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var15 + (var12 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      anIntArray9111[0] = var18;
      anIntArray9112[0] = var19;
      anIntArray9113[0] = var20;
      anIntArray9111[1] = var21;
      anIntArray9112[1] = var19;
      anIntArray9113[1] = var20;
      anIntArray9111[2] = var18;
      anIntArray9112[2] = var22;
      anIntArray9113[2] = var20;
      anIntArray9111[3] = var21;
      anIntArray9112[3] = var22;
      anIntArray9113[3] = var20;
      anIntArray9111[4] = var18;
      anIntArray9112[4] = var19;
      anIntArray9113[4] = var23;
      anIntArray9111[5] = var21;
      anIntArray9112[5] = var19;
      anIntArray9113[5] = var23;
      anIntArray9111[6] = var18;
      anIntArray9112[6] = var22;
      anIntArray9113[6] = var23;
      anIntArray9111[7] = var21;
      anIntArray9112[7] = var22;
      anIntArray9113[7] = var23;

      int var25;
      int var26;
      int var27;
      float var28;
      float var29;
      float var30;
      float var31;
      int var33;
      for(int var24 = 0; var24 < 8; ++var24) {
         var25 = anIntArray9111[var24];
         var26 = anIntArray9112[var24];
         var27 = anIntArray9113[var24];
         var28 = var6.aFloatArray4841[2] * (float)var25 + var6.aFloatArray4841[6] * (float)var26 + var6.aFloatArray4841[10] * (float)var27 + var6.aFloatArray4841[14];
         var29 = var6.aFloatArray4841[3] * (float)var25 + var6.aFloatArray4841[7] * (float)var26 + var6.aFloatArray4841[11] * (float)var27 + var6.aFloatArray4841[15];
         if(var28 >= -var29) {
            var30 = var6.aFloatArray4841[0] * (float)var25 + var6.aFloatArray4841[4] * (float)var26 + var6.aFloatArray4841[8] * (float)var27 + var6.aFloatArray4841[12];
            var31 = var6.aFloatArray4841[1] * (float)var25 + var6.aFloatArray4841[5] * (float)var26 + var6.aFloatArray4841[9] * (float)var27 + var6.aFloatArray4841[13];
            int var32 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var29);
            var33 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var29);
            if(var32 < var8) {
               var8 = var32;
            }

            if(var32 > var9) {
               var9 = var32;
            }

            if(var33 < var10) {
               var10 = var33;
            }

            if(var33 > var11) {
               var11 = var33;
            }

            var7 = true;
         }
      }

      if(var7 && var1 > var8 && var1 < var9 && var2 > var10 && var2 < var11) {
         if(var4) {
            return true;
         }

         if(this.aClass174_Sub2_9048.anIntArray9656.length < this.anInt9063) {
            this.aClass174_Sub2_9048.anIntArray9656 = new int[this.anInt9063];
            this.aClass174_Sub2_9048.anIntArray9506 = new int[this.anInt9063];
         }

         int[] var38 = this.aClass174_Sub2_9048.anIntArray9656;
         int[] var39 = this.aClass174_Sub2_9048.anIntArray9506;

         for(var33 = 0; var33 < this.anInt9060; ++var33) {
            var25 = this.anIntArray9058[var33];
            var26 = this.anIntArray9059[var33];
            var27 = this.anIntArray9091[var33];
            var28 = var6.aFloatArray4841[2] * (float)var25 + var6.aFloatArray4841[6] * (float)var26 + var6.aFloatArray4841[10] * (float)var27 + var6.aFloatArray4841[14];
            var29 = var6.aFloatArray4841[3] * (float)var25 + var6.aFloatArray4841[7] * (float)var26 + var6.aFloatArray4841[11] * (float)var27 + var6.aFloatArray4841[15];
            int var34;
            int var35;
            int var36;
            int var37;
            if(var28 >= -var29) {
               var30 = var6.aFloatArray4841[0] * (float)var25 + var6.aFloatArray4841[4] * (float)var26 + var6.aFloatArray4841[8] * (float)var27 + var6.aFloatArray4841[12];
               var31 = var6.aFloatArray4841[1] * (float)var25 + var6.aFloatArray4841[5] * (float)var26 + var6.aFloatArray4841[9] * (float)var27 + var6.aFloatArray4841[13];
               var34 = this.anIntArray9092[var33];
               var35 = this.anIntArray9092[var33 + 1];

               for(var36 = var34; var36 < var35 && this.aShortArray9102[var36] != 0; ++var36) {
                  var37 = (this.aShortArray9102[var36] & '\uffff') - 1;
                  var38[var37] = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var29);
                  var39[var37] = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var29);
               }
            } else {
               var34 = this.anIntArray9092[var33];
               var35 = this.anIntArray9092[var33 + 1];

               for(var36 = var34; var36 < var35 && this.aShortArray9102[var36] != 0; ++var36) {
                  var37 = (this.aShortArray9102[var36] & '\uffff') - 1;
                  var38[var37] = -999999;
               }
            }
         }

         for(var33 = 0; var33 < this.anInt9071; ++var33) {
            if(var38[this.aShortArray9075[var33] & '\uffff'] != -999999 && var38[this.aShortArray9076[var33] & '\uffff'] != -999999 && var38[this.aShortArray9077[var33] & '\uffff'] != -999999 && this.method8416(var1, var2, var39[this.aShortArray9075[var33] & '\uffff'], var39[this.aShortArray9076[var33] & '\uffff'], var39[this.aShortArray9077[var33] & '\uffff'], var38[this.aShortArray9075[var33] & '\uffff'], var38[this.aShortArray9076[var33] & '\uffff'], var38[this.aShortArray9077[var33] & '\uffff'])) {
               return true;
            }
         }
      }

      return false;
   }

   void method2023() {
      for(int var1 = 0; var1 < this.anInt9046; ++var1) {
         this.anIntArray9058[var1] = this.anIntArray9058[var1] + 7 >> 4;
         this.anIntArray9059[var1] = this.anIntArray9059[var1] + 7 >> 4;
         this.anIntArray9091[var1] = this.anIntArray9091[var1] + 7 >> 4;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   boolean method8416(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var2 < var3 && var2 < var4 && var2 < var5?false:(var2 > var3 && var2 > var4 && var2 > var5?false:(var1 < var6 && var1 < var7 && var1 < var8?false:var1 <= var6 || var1 <= var7 || var1 <= var8));
   }

   void method8417(Class526_Sub21_Sub5_Sub2 var1) {
      if(this.aClass174_Sub2_9048.anIntArray9656.length < this.anInt9063) {
         this.aClass174_Sub2_9048.anIntArray9656 = new int[this.anInt9063];
         this.aClass174_Sub2_9048.anIntArray9506 = new int[this.anInt9063];
      }

      int[] var2 = this.aClass174_Sub2_9048.anIntArray9656;
      int[] var3 = this.aClass174_Sub2_9048.anIntArray9506;

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var4 = 0; var4 < this.anInt9060; ++var4) {
         var5 = (this.anIntArray9058[var4] - (this.anIntArray9059[var4] * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662) - var1.anInt12077;
         var6 = (this.anIntArray9091[var4] - (this.anIntArray9059[var4] * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662) - var1.anInt12078;
         var7 = this.anIntArray9092[var4];
         var8 = this.anIntArray9092[var4 + 1];

         for(var9 = var7; var9 < var8 && this.aShortArray9102[var9] != 0; ++var9) {
            var10 = (this.aShortArray9102[var9] & '\uffff') - 1;
            var2[var10] = var5;
            var3[var10] = var6;
         }
      }

      for(var4 = 0; var4 < this.anInt9098; ++var4) {
         if(this.aByteArray9074 == null || this.aByteArray9074[var4] <= 128) {
            var5 = this.aShortArray9075[var4] & '\uffff';
            var6 = this.aShortArray9076[var4] & '\uffff';
            var7 = this.aShortArray9077[var4] & '\uffff';
            var8 = var2[var5];
            var9 = var2[var6];
            var10 = var2[var7];
            int var11 = var3[var5];
            int var12 = var3[var6];
            int var13 = var3[var7];
            if((var8 - var9) * (var12 - var13) - (var12 - var11) * (var10 - var9) > 0) {
               var1.method10907(var11, var12, var13, var8, var9, var10);
            }
         }
      }

   }

   public byte[] method2085() {
      return this.aByteArray9074;
   }

   public Class141[] method2094() {
      return this.aClass141Array9057;
   }

   void method8418(Class433 var1) {
      if(this.aClass147Array9043 != null) {
         Class433 var2 = this.aClass174_Sub2_9048.aClass433_9519;
         this.aClass174_Sub2_9048.method8609();
         this.aClass174_Sub2_9048.method2328(!this.aBool9054);
         this.aClass174_Sub2_9048.method8646(false);
         this.aClass174_Sub2_9048.method8634(this.aClass174_Sub2_9048.aClass129_9650, (Class129)null, (Class129)null, this.aClass174_Sub2_9048.aClass129_9651);

         for(int var3 = 0; var3 < this.anInt9105; ++var3) {
            Class147 var4 = this.aClass147Array9043[var3];
            Class137 var5 = this.aClass137Array9104[var3];
            if(!var4.aBool1708 || !this.aClass174_Sub2_9048.method2548()) {
               float var6 = (float)(this.anIntArray9058[var4.anInt1701] + this.anIntArray9058[var4.anInt1702] + this.anIntArray9058[var4.anInt1700]) * 0.3333333F;
               float var7 = (float)(this.anIntArray9059[var4.anInt1701] + this.anIntArray9059[var4.anInt1702] + this.anIntArray9059[var4.anInt1700]) * 0.3333333F;
               float var8 = (float)(this.anIntArray9091[var4.anInt1701] + this.anIntArray9091[var4.anInt1702] + this.anIntArray9091[var4.anInt1700]) * 0.3333333F;
               float var9 = var1.aFloatArray4841[0] * var6 + var1.aFloatArray4841[4] * var7 + var1.aFloatArray4841[8] * var8 + var1.aFloatArray4841[12];
               float var10 = var1.aFloatArray4841[1] * var6 + var1.aFloatArray4841[5] * var7 + var1.aFloatArray4841[9] * var8 + var1.aFloatArray4841[13];
               float var11 = var1.aFloatArray4841[2] * var6 + var1.aFloatArray4841[6] * var7 + var1.aFloatArray4841[10] * var8 + var1.aFloatArray4841[14];
               float var12 = (float)(1.0D / Math.sqrt((double)(var9 * var9 + var10 * var10 + var11 * var11))) * (float)var4.anInt1706;
               var2.method5114(var5.anInt1656, var5.anInt1651 * var4.aShort1704 >> 7, var5.anInt1652 * var4.aShort1705 >> 7, var9 + (float)var5.anInt1654 - var9 * var12, var10 + (float)var5.anInt1655 - var10 * var12, var11 - var11 * var12);
               this.aClass174_Sub2_9048.method8610(var2);
               int var13 = var5.anInt1653;
               OpenGL.glColor4ub((byte)(var13 >> 16), (byte)(var13 >> 8), (byte)var13, (byte)(var13 >> 24));
               this.aClass174_Sub2_9048.method8639(var4.aShort1709);
               this.aClass174_Sub2_9048.method8651(var4.aByte1707);
               this.aClass174_Sub2_9048.method8676(7, 0, 4);
            }
         }

         this.aClass174_Sub2_9048.method2328(true);
         this.aClass174_Sub2_9048.method8611();
      }

   }

   void method8419() {
      if(this.aBool9088) {
         this.aBool9088 = false;
         if(this.aClass182Array9066 == null && this.aClass141Array9057 == null && this.aClass147Array9043 == null && !Class127.method1557(this.anInt9117, this.anInt9050)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if(this.anIntArray9058 != null && !Class127.method1568(this.anInt9117, this.anInt9050)) {
               if(this.aClass129_9081 != null && this.aClass129_9081.anInterface15_1612 == null) {
                  this.aBool9088 = true;
               } else {
                  if(!this.aBool9072) {
                     this.method8426();
                  }

                  var1 = true;
               }
            }

            if(this.anIntArray9059 != null && !Class127.method1545(this.anInt9117, this.anInt9050)) {
               if(this.aClass129_9081 != null && this.aClass129_9081.anInterface15_1612 == null) {
                  this.aBool9088 = true;
               } else {
                  if(!this.aBool9072) {
                     this.method8426();
                  }

                  var2 = true;
               }
            }

            if(this.anIntArray9091 != null && !Class127.method1546(this.anInt9117, this.anInt9050)) {
               if(this.aClass129_9081 != null && this.aClass129_9081.anInterface15_1612 == null) {
                  this.aBool9088 = true;
               } else {
                  if(!this.aBool9072) {
                     this.method8426();
                  }

                  var3 = true;
               }
            }

            if(var1) {
               this.anIntArray9058 = null;
            }

            if(var2) {
               this.anIntArray9059 = null;
            }

            if(var3) {
               this.anIntArray9091 = null;
            }
         }

         if(this.aShortArray9102 != null && this.anIntArray9058 == null && this.anIntArray9059 == null && this.anIntArray9091 == null) {
            this.aShortArray9102 = null;
            this.anIntArray9092 = null;
         }

         if(this.aByteArray9061 != null && !Class127.method1547(this.anInt9117, this.anInt9050)) {
            if(this.aClass129_9083 != null) {
               if(this.aClass129_9083.anInterface15_1612 != null) {
                  this.aShortArray9094 = null;
                  this.aShortArray9065 = null;
                  this.aShortArray9064 = null;
                  this.aByteArray9061 = null;
               } else {
                  this.aBool9088 = true;
               }
            } else if(this.aClass129_9044 != null && this.aClass129_9044.anInterface15_1612 == null) {
               this.aBool9088 = true;
            } else {
               this.aShortArray9094 = null;
               this.aShortArray9065 = null;
               this.aShortArray9064 = null;
               this.aByteArray9061 = null;
            }
         }

         if(this.aShortArray9082 != null && !Class127.method1548(this.anInt9117, this.anInt9050)) {
            if(this.aClass129_9044 != null && this.aClass129_9044.anInterface15_1612 == null) {
               this.aBool9088 = true;
            } else {
               this.aShortArray9082 = null;
            }
         }

         if(this.aByteArray9074 != null && !Class127.method1549(this.anInt9117, this.anInt9050)) {
            if(this.aClass129_9044 != null && this.aClass129_9044.anInterface15_1612 == null) {
               this.aBool9088 = true;
            } else {
               this.aByteArray9074 = null;
            }
         }

         if(this.aFloatArray9069 != null && !Class127.method1550(this.anInt9117, this.anInt9050)) {
            if(this.aClass129_9114 != null && this.aClass129_9114.anInterface15_1612 == null) {
               this.aBool9088 = true;
            } else {
               this.aFloatArray9070 = null;
               this.aFloatArray9069 = null;
            }
         }

         if(this.aShortArray9078 != null && !Class127.method1554(this.anInt9117, this.anInt9050)) {
            if(this.aClass129_9044 != null && this.aClass129_9044.anInterface15_1612 == null) {
               this.aBool9088 = true;
            } else {
               this.aShortArray9078 = null;
            }
         }

         if(this.aShortArray9075 != null && !Class127.method1527(this.anInt9117, this.anInt9050)) {
            if(this.aClass136_9085 != null && this.aClass136_9085.anInterface20_1650 == null || this.aClass129_9044 != null && this.aClass129_9044.anInterface15_1612 == null) {
               this.aBool9088 = true;
            } else {
               this.aShortArray9077 = null;
               this.aShortArray9076 = null;
               this.aShortArray9075 = null;
            }
         }

         if(this.anIntArrayArray9079 != null && !Class127.method1540(this.anInt9117, this.anInt9050)) {
            this.anIntArrayArray9079 = (int[][])null;
            this.aShortArray9080 = null;
         }

         if(this.anIntArrayArray9084 != null && !Class127.method1553(this.anInt9117, this.anInt9050)) {
            this.anIntArrayArray9084 = (int[][])null;
            this.aShortArray9062 = null;
         }

         if(this.anIntArrayArray9108 != null && !Class127.method1552(this.anInt9117, this.anInt9050)) {
            this.anIntArrayArray9108 = (int[][])null;
         }

         if(this.anIntArray9100 != null && (this.anInt9117 & 2048) == 0 && (this.anInt9117 & 262144) == 0) {
            this.anIntArray9100 = null;
         }

      }
   }

   void method8420(boolean var1) {
      boolean var2 = this.aClass129_9044 != null && this.aClass129_9044.anInterface15_1612 == null;
      boolean var3 = this.aClass129_9083 != null && this.aClass129_9083.anInterface15_1612 == null;
      boolean var4 = this.aClass129_9081 != null && this.aClass129_9081.anInterface15_1612 == null;
      boolean var5 = this.aClass129_9114 != null && this.aClass129_9114.anInterface15_1612 == null;
      if(var1) {
         var2 &= (this.aByte9049 & 2) != 0;
         var3 &= (this.aByte9049 & 4) != 0;
         var4 &= (this.aByte9049 & 1) != 0;
         var5 &= (this.aByte9049 & 8) != 0;
      }

      byte var6 = 0;
      byte var7 = 0;
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      if(var4) {
         var7 = var6;
         var6 = (byte)(var6 + 12);
      }

      if(var2) {
         var8 = var6;
         var6 = (byte)(var6 + 4);
      }

      if(var3) {
         var9 = var6;
         var6 = (byte)(var6 + 12);
      }

      if(var5) {
         var10 = var6;
         var6 = (byte)(var6 + 8);
      }

      if(var6 != 0) {
         if(this.aClass174_Sub2_9048.aClass526_Sub36_Sub1_9655.buffer.length < this.anInt9063 * var6) {
            this.aClass174_Sub2_9048.aClass526_Sub36_Sub1_9655 = new Class526_Sub36_Sub1((this.anInt9063 + 100) * var6);
         } else {
            this.aClass174_Sub2_9048.aClass526_Sub36_Sub1_9655.pos = 0;
         }

         Class526_Sub36_Sub1 var11 = this.aClass174_Sub2_9048.aClass526_Sub36_Sub1_9655;
         int var12;
         int var13;
         int var18;
         int var19;
         if(var4) {
            int var14;
            int var15;
            int var16;
            int var17;
            if(this.aClass174_Sub2_9048.aBool9508) {
               for(var12 = 0; var12 < this.anInt9060; ++var12) {
                  var13 = Stream.floatToRawIntBits((float)this.anIntArray9058[var12]);
                  var14 = Stream.floatToRawIntBits((float)this.anIntArray9059[var12]);
                  var15 = Stream.floatToRawIntBits((float)this.anIntArray9091[var12]);
                  var16 = this.anIntArray9092[var12];
                  var17 = this.anIntArray9092[var12 + 1];

                  for(var18 = var16; var18 < var17 && this.aShortArray9102[var18] != 0; ++var18) {
                     var19 = (this.aShortArray9102[var18] & '\uffff') - 1;
                     var11.pos = var19 * var6 * 801976415;
                     var11.writeInt(var13, -357564953);
                     var11.writeInt(var14, -357564953);
                     var11.writeInt(var15, -357564953);
                  }
               }
            } else {
               for(var12 = 0; var12 < this.anInt9060; ++var12) {
                  var13 = Stream.floatToRawIntBits((float)this.anIntArray9058[var12]);
                  var14 = Stream.floatToRawIntBits((float)this.anIntArray9059[var12]);
                  var15 = Stream.floatToRawIntBits((float)this.anIntArray9091[var12]);
                  var16 = this.anIntArray9092[var12];
                  var17 = this.anIntArray9092[var12 + 1];

                  for(var18 = var16; var18 < var17 && this.aShortArray9102[var18] != 0; ++var18) {
                     var19 = (this.aShortArray9102[var18] & '\uffff') - 1;
                     var11.pos = var19 * var6 * 801976415;
                     var11.method9613(var13, 1847743588);
                     var11.method9613(var14, 1701170448);
                     var11.method9613(var15, -39649437);
                  }
               }
            }
         }

         float var28;
         short[] var34;
         short[] var35;
         short[] var36;
         byte[] var37;
         float var40;
         if(var2) {
            if(this.aClass129_9083 == null) {
               if(this.aClass151_9089 != null) {
                  var34 = this.aClass151_9089.aShortArray1719;
                  var35 = this.aClass151_9089.aShortArray1721;
                  var36 = this.aClass151_9089.aShortArray1720;
                  var37 = this.aClass151_9089.aByteArray1722;
               } else {
                  var34 = this.aShortArray9064;
                  var35 = this.aShortArray9065;
                  var36 = this.aShortArray9094;
                  var37 = this.aByteArray9061;
               }

               float var20 = this.aClass174_Sub2_9048.aFloatArray9657[0];
               float var21 = this.aClass174_Sub2_9048.aFloatArray9657[1];
               float var22 = this.aClass174_Sub2_9048.aFloatArray9657[2];
               float var23 = this.aClass174_Sub2_9048.aFloat9585;
               float var24 = this.aClass174_Sub2_9048.aFloat9464 * 768.0F / (float)this.aShort9053;
               float var25 = this.aClass174_Sub2_9048.aFloat9587 * 768.0F / (float)this.aShort9053;

               for(int var26 = 0; var26 < this.anInt9071; ++var26) {
                  int var27 = this.method8421(this.aShortArray9082[var26], this.aShortArray9078[var26], this.aShort9056, this.aByteArray9074[var26]);
                  float var42 = (float)(var27 >>> 24) * this.aClass174_Sub2_9048.aFloat9567;
                  var28 = (float)(var27 >> 16 & 255) * this.aClass174_Sub2_9048.aFloat9583;
                  float var29 = (float)(var27 >> 8 & 255) * this.aClass174_Sub2_9048.aFloat9626;
                  int var30 = this.aShortArray9075[var26] & '\uffff';
                  short var38 = (short)var37[var30];
                  if(var38 == 0) {
                     var40 = (var20 * (float)var34[var30] + var21 * (float)var35[var30] + var22 * (float)var36[var30]) * 0.0026041667F;
                  } else {
                     var40 = (var20 * (float)var34[var30] + var21 * (float)var35[var30] + var22 * (float)var36[var30]) / (float)(var38 * 256);
                  }

                  float var41 = var23 + var40 * (var40 < 0.0F?var25:var24);
                  int var31 = (int)(var42 * var41);
                  if(var31 < 0) {
                     var31 = 0;
                  } else if(var31 > 255) {
                     var31 = 255;
                  }

                  int var32 = (int)(var28 * var41);
                  if(var32 < 0) {
                     var32 = 0;
                  } else if(var32 > 255) {
                     var32 = 255;
                  }

                  int var33 = (int)(var29 * var41);
                  if(var33 < 0) {
                     var33 = 0;
                  } else if(var33 > 255) {
                     var33 = 255;
                  }

                  var11.pos = (var8 + var30 * var6) * 801976415;
                  var11.writeByte(var31, 810684449);
                  var11.writeByte(var32, -1251504813);
                  var11.writeByte(var33, -502250399);
                  var11.writeByte(255 - (this.aByteArray9074[var26] & 255), 841682878);
                  var30 = this.aShortArray9076[var26] & '\uffff';
                  var38 = (short)var37[var30];
                  if(var38 == 0) {
                     var40 = (var20 * (float)var34[var30] + var21 * (float)var35[var30] + var22 * (float)var36[var30]) * 0.0026041667F;
                  } else {
                     var40 = (var20 * (float)var34[var30] + var21 * (float)var35[var30] + var22 * (float)var36[var30]) / (float)(var38 * 256);
                  }

                  var41 = var23 + var40 * (var40 < 0.0F?var25:var24);
                  var31 = (int)(var42 * var41);
                  if(var31 < 0) {
                     var31 = 0;
                  } else if(var31 > 255) {
                     var31 = 255;
                  }

                  var32 = (int)(var28 * var41);
                  if(var32 < 0) {
                     var32 = 0;
                  } else if(var32 > 255) {
                     var32 = 255;
                  }

                  var33 = (int)(var29 * var41);
                  if(var33 < 0) {
                     var33 = 0;
                  } else if(var33 > 255) {
                     var33 = 255;
                  }

                  var11.pos = (var8 + var30 * var6) * 801976415;
                  var11.writeByte(var31, 1392691360);
                  var11.writeByte(var32, 796870714);
                  var11.writeByte(var33, -1401196491);
                  var11.writeByte(255 - (this.aByteArray9074[var26] & 255), 1511206777);
                  var30 = this.aShortArray9077[var26] & '\uffff';
                  var38 = (short)var37[var30];
                  if(var38 == 0) {
                     var40 = (var20 * (float)var34[var30] + var21 * (float)var35[var30] + var22 * (float)var36[var30]) * 0.0026041667F;
                  } else {
                     var40 = (var20 * (float)var34[var30] + var21 * (float)var35[var30] + var22 * (float)var36[var30]) / (float)(var38 * 256);
                  }

                  var41 = var23 + var40 * (var40 < 0.0F?var25:var24);
                  var31 = (int)(var42 * var41);
                  if(var31 < 0) {
                     var31 = 0;
                  } else if(var31 > 255) {
                     var31 = 255;
                  }

                  var32 = (int)(var28 * var41);
                  if(var32 < 0) {
                     var32 = 0;
                  } else if(var32 > 255) {
                     var32 = 255;
                  }

                  var33 = (int)(var29 * var41);
                  if(var33 < 0) {
                     var33 = 0;
                  } else if(var33 > 255) {
                     var33 = 255;
                  }

                  var11.pos = (var8 + var30 * var6) * 801976415;
                  var11.writeByte(var31, -33338009);
                  var11.writeByte(var32, -745266515);
                  var11.writeByte(var33, -699954233);
                  var11.writeByte(255 - (this.aByteArray9074[var26] & 255), 1247448663);
               }
            } else {
               for(var12 = 0; var12 < this.anInt9071; ++var12) {
                  var13 = this.method8421(this.aShortArray9082[var12], this.aShortArray9078[var12], this.aShort9056, this.aByteArray9074[var12]);
                  var11.pos = (var8 + (this.aShortArray9075[var12] & '\uffff') * var6) * 801976415;
                  var11.writeInt(var13, -357564953);
                  var11.pos = (var8 + (this.aShortArray9076[var12] & '\uffff') * var6) * 801976415;
                  var11.writeInt(var13, -357564953);
                  var11.pos = (var8 + (this.aShortArray9077[var12] & '\uffff') * var6) * 801976415;
                  var11.writeInt(var13, -357564953);
               }
            }
         }

         if(var3) {
            if(this.aClass151_9089 != null) {
               var34 = this.aClass151_9089.aShortArray1719;
               var35 = this.aClass151_9089.aShortArray1721;
               var36 = this.aClass151_9089.aShortArray1720;
               var37 = this.aClass151_9089.aByteArray1722;
            } else {
               var34 = this.aShortArray9064;
               var35 = this.aShortArray9065;
               var36 = this.aShortArray9094;
               var37 = this.aByteArray9061;
            }

            float var39 = 3.0F / (float)this.aShort9053;
            var40 = 3.0F / (float)(this.aShort9053 + this.aShort9053 / 2);
            var11.pos = var9 * 801976415;
            if(this.aClass174_Sub2_9048.aBool9508) {
               for(var18 = 0; var18 < this.anInt9063; ++var18) {
                  var19 = var37[var18] & 255;
                  if(var19 == 0) {
                     var11.method10688((float)var34[var18] * var40);
                     var11.method10688((float)var35[var18] * var40);
                     var11.method10688((float)var36[var18] * var40);
                  } else {
                     var28 = var39 / (float)var19;
                     var11.method10688((float)var34[var18] * var28);
                     var11.method10688((float)var35[var18] * var28);
                     var11.method10688((float)var36[var18] * var28);
                  }

                  var11.pos += (var6 - 12) * 801976415;
               }
            } else {
               for(var18 = 0; var18 < this.anInt9063; ++var18) {
                  var19 = var37[var18] & 255;
                  if(var19 == 0) {
                     var11.method10689((float)var34[var18] * var40);
                     var11.method10689((float)var35[var18] * var40);
                     var11.method10689((float)var36[var18] * var40);
                  } else {
                     var28 = var39 / (float)var19;
                     var11.method10689((float)var34[var18] * var28);
                     var11.method10689((float)var35[var18] * var28);
                     var11.method10689((float)var36[var18] * var28);
                  }

                  var11.pos += (var6 - 12) * 801976415;
               }
            }
         }

         if(var5) {
            var11.pos = var10 * 801976415;
            if(this.aClass174_Sub2_9048.aBool9508) {
               for(var12 = 0; var12 < this.anInt9063; ++var12) {
                  var11.method10688(this.aFloatArray9069[var12]);
                  var11.method10688(this.aFloatArray9070[var12]);
                  var11.pos += (var6 - 8) * 801976415;
               }
            } else {
               for(var12 = 0; var12 < this.anInt9063; ++var12) {
                  var11.method10689(this.aFloatArray9069[var12]);
                  var11.method10689(this.aFloatArray9070[var12]);
                  var11.pos += (var6 - 8) * 801976415;
               }
            }
         }

         var11.pos = var6 * this.anInt9063 * 801976415;
         Interface15 var43;
         if(var1) {
            if(this.anInterface15_9087 == null) {
               this.anInterface15_9087 = this.aClass174_Sub2_9048.method8680(var6, var11.buffer, var11.pos * 301018015, true);
            } else {
               this.anInterface15_9087.method91(var6, var11.buffer, var11.pos * 301018015);
            }

            var43 = this.anInterface15_9087;
            this.aByte9049 = 0;
         } else {
            var43 = this.aClass174_Sub2_9048.method8680(var6, var11.buffer, var11.pos * 301018015, false);
            this.aBool9088 = true;
         }

         if(var4) {
            this.aClass129_9081.anInterface15_1612 = var43;
            this.aClass129_9081.aByte1614 = var7;
         }

         if(var5) {
            this.aClass129_9114.anInterface15_1612 = var43;
            this.aClass129_9114.aByte1614 = var10;
         }

         if(var2) {
            this.aClass129_9044.anInterface15_1612 = var43;
            this.aClass129_9044.aByte1614 = var8;
         }

         if(var3) {
            this.aClass129_9083.anInterface15_1612 = var43;
            this.aClass129_9083.aByte1614 = var9;
         }

      }
   }

   int method8421(int var1, short var2, int var3, byte var4) {
      int var5 = Class661.anIntArray8516[method8422(var1, var3)];
      if(var2 != -1) {
         Class171 var6 = this.aClass174_Sub2_9048.aClass169_2035.method2122(var2 & '\uffff', (byte)72);
         int var7 = var6.aByte1969 & 255;
         int var8;
         int var10;
         if(var7 != 0) {
            if(var3 < 0) {
               var8 = 0;
            } else if(var3 > 127) {
               var8 = 16777215;
            } else {
               var8 = 131586 * var3;
            }

            if(var7 == 256) {
               var5 = var8;
            } else {
               var10 = 256 - var7;
               var5 = ((var8 & 16711935) * var7 + (var5 & 16711935) * var10 & -16711936) + ((var8 & '\uff00') * var7 + (var5 & '\uff00') * var10 & 16711680) >> 8;
            }
         }

         var8 = var6.aByte2012 & 255;
         if(var8 != 0) {
            var8 += 256;
            int var9 = ((var5 & 16711680) >> 16) * var8;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            var10 = ((var5 & '\uff00') >> 8) * var8;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            int var11 = (var5 & 255) * var8;
            if(var11 > '\uffff') {
               var11 = '\uffff';
            }

            var5 = (var9 << 8 & 16711680) + (var10 & '\uff00') + (var11 >> 8);
         }
      }

      return var5 << 8 | 255 - (var4 & 255);
   }

   static final int method8422(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   public int method2084() {
      return this.aShort9053;
   }

   public Class168 method2002(byte var1, int var2, boolean var3) {
      boolean var4 = false;
      Class168_Sub1 var5;
      Class168_Sub1 var6;
      if(var1 > 0 && var1 <= 8) {
         var5 = this.aClass174_Sub2_9048.aClass168_Sub1Array9648[var1 - 1];
         var6 = this.aClass174_Sub2_9048.aClass168_Sub1Array9647[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class168_Sub1(this.aClass174_Sub2_9048);
      }

      return this.method8415(var6, var5, var2, var4, var3);
   }

   void method8423() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.anInt9060; ++var9) {
         int var10 = this.anIntArray9058[var9];
         int var11 = this.anIntArray9059[var9];
         int var12 = this.anIntArray9091[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.aShort9051 = (short)var1;
      this.aShort9095 = (short)var4;
      this.aShort9093 = (short)var2;
      this.aShort9067 = (short)var5;
      this.aShort9096 = (short)var3;
      this.aShort9097 = (short)var6;
      this.anInt9090 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.anInt9107 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.aBool9072 = true;
   }

   public int method1977() {
      return this.anInt9117;
   }

   public void method1999(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub1 var6 = (Class168_Sub1)var1;
      if(this.anInt9071 != 0 && var6.anInt9071 != 0) {
         int var7 = var6.anInt9060;
         int[] var8 = var6.anIntArray9058;
         int[] var9 = var6.anIntArray9059;
         int[] var10 = var6.anIntArray9091;
         short[] var11 = var6.aShortArray9064;
         short[] var12 = var6.aShortArray9065;
         short[] var13 = var6.aShortArray9094;
         byte[] var14 = var6.aByteArray9061;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if(this.aClass151_9089 != null) {
            var15 = this.aClass151_9089.aShortArray1719;
            var16 = this.aClass151_9089.aShortArray1721;
            var17 = this.aClass151_9089.aShortArray1720;
            var18 = this.aClass151_9089.aByteArray1722;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var20;
         short[] var21;
         byte[] var22;
         if(var6.aClass151_9089 != null) {
            var19 = var6.aClass151_9089.aShortArray1719;
            var20 = var6.aClass151_9089.aShortArray1721;
            var21 = var6.aClass151_9089.aShortArray1720;
            var22 = var6.aClass151_9089.aByteArray1722;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray9092;
         short[] var24 = var6.aShortArray9102;
         if(!var6.aBool9072) {
            var6.method8426();
         }

         short var25 = var6.aShort9093;
         short var26 = var6.aShort9067;
         short var27 = var6.aShort9051;
         short var28 = var6.aShort9095;
         short var29 = var6.aShort9096;
         short var30 = var6.aShort9097;

         for(int var31 = 0; var31 < this.anInt9060; ++var31) {
            int var32 = this.anIntArray9059[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.anIntArray9058[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.anIntArray9091[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray9092[var31];
                     int var37 = this.anIntArray9092[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37 && this.aShortArray9102[var38] != 0; ++var38) {
                        var35 = (this.aShortArray9102[var38] & '\uffff') - 1;
                        if(this.aByteArray9061[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37 && var24[var40] != 0; ++var40) {
                                 var39 = (var24[var40] & '\uffff') - 1;
                                 if(var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass151_9089 = new Class151();
                                    var15 = this.aClass151_9089.aShortArray1719 = Class189.method2746(this.aShortArray9064, -1679963812);
                                    var16 = this.aClass151_9089.aShortArray1721 = Class189.method2746(this.aShortArray9065, -1150876137);
                                    var17 = this.aClass151_9089.aShortArray1720 = Class189.method2746(this.aShortArray9094, -1484548468);
                                    var18 = this.aClass151_9089.aByteArray1722 = Class639_Sub1.method9870(this.aByteArray9061, (byte)-34);
                                 }

                                 if(var19 == null) {
                                    Class151 var46 = var6.aClass151_9089 = new Class151();
                                    var19 = var46.aShortArray1719 = Class189.method2746(var11, -831806848);
                                    var20 = var46.aShortArray1721 = Class189.method2746(var12, -1882976452);
                                    var21 = var46.aShortArray1720 = Class189.method2746(var13, -1413765917);
                                    var22 = var46.aByteArray1722 = Class639_Sub1.method9870(var14, (byte)-48);
                                 }

                                 short var47 = this.aShortArray9064[var35];
                                 short var41 = this.aShortArray9065[var35];
                                 short var42 = this.aShortArray9094[var35];
                                 byte var43 = this.aByteArray9061[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var47;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var47 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray9092[var31];
                                 var37 = this.anIntArray9092[var31 + 1];

                                 for(var44 = var36; var44 < var37 && this.aShortArray9102[var44] != 0; ++var44) {
                                    var45 = (this.aShortArray9102[var44] & '\uffff') - 1;
                                    if(var18[var45] != 0) {
                                       var15[var45] += var47;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }

                                 if(this.aClass129_9083 != null) {
                                    this.aClass129_9083.anInterface15_1612 = null;
                                 }

                                 if(var6.aClass129_9083 == null && var6.aClass129_9044 != null) {
                                    var6.aClass129_9044.anInterface15_1612 = null;
                                 }

                                 if(var6.aClass129_9083 != null) {
                                    var6.aClass129_9083.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method2005(int var1) {
      this.anInt9117 = var1;
      if(this.aClass151_9089 != null && (this.anInt9117 & 65536) == 0) {
         this.aShortArray9064 = this.aClass151_9089.aShortArray1719;
         this.aShortArray9065 = this.aClass151_9089.aShortArray1721;
         this.aShortArray9094 = this.aClass151_9089.aShortArray1720;
         this.aByteArray9061 = this.aClass151_9089.aByteArray1722;
         this.aClass151_9089 = null;
      }

      this.aBool9088 = true;
      this.method8419();
   }

   public void method2006(int var1) {
      this.anInt9117 = var1;
      if(this.aClass151_9089 != null && (this.anInt9117 & 65536) == 0) {
         this.aShortArray9064 = this.aClass151_9089.aShortArray1719;
         this.aShortArray9065 = this.aClass151_9089.aShortArray1721;
         this.aShortArray9094 = this.aClass151_9089.aShortArray1720;
         this.aByteArray9061 = this.aClass151_9089.aByteArray1722;
         this.aClass151_9089 = null;
      }

      this.aBool9088 = true;
      this.method8419();
   }

   public void method2007(int var1) {
      this.anInt9117 = var1;
      if(this.aClass151_9089 != null && (this.anInt9117 & 65536) == 0) {
         this.aShortArray9064 = this.aClass151_9089.aShortArray1719;
         this.aShortArray9065 = this.aClass151_9089.aShortArray1721;
         this.aShortArray9094 = this.aClass151_9089.aShortArray1720;
         this.aByteArray9061 = this.aClass151_9089.aByteArray1722;
         this.aClass151_9089 = null;
      }

      this.aBool9088 = true;
      this.method8419();
   }

   public void method2008() {
      if(this.anInt9063 > 0 && this.anInt9098 > 0) {
         this.method8420(false);
         if((this.aByte9049 & 16) == 0 && this.aClass136_9085.anInterface20_1650 == null) {
            this.method8425(false);
         }

         this.method8419();
      }
   }

   public void method2009() {
      if(this.anInt9063 > 0 && this.anInt9098 > 0) {
         this.method8420(false);
         if((this.aByte9049 & 16) == 0 && this.aClass136_9085.anInterface20_1650 == null) {
            this.method8425(false);
         }

         this.method8419();
      }
   }

   public void method1968(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub1 var6 = (Class168_Sub1)var1;
      if(this.anInt9071 != 0 && var6.anInt9071 != 0) {
         int var7 = var6.anInt9060;
         int[] var8 = var6.anIntArray9058;
         int[] var9 = var6.anIntArray9059;
         int[] var10 = var6.anIntArray9091;
         short[] var11 = var6.aShortArray9064;
         short[] var12 = var6.aShortArray9065;
         short[] var13 = var6.aShortArray9094;
         byte[] var14 = var6.aByteArray9061;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if(this.aClass151_9089 != null) {
            var15 = this.aClass151_9089.aShortArray1719;
            var16 = this.aClass151_9089.aShortArray1721;
            var17 = this.aClass151_9089.aShortArray1720;
            var18 = this.aClass151_9089.aByteArray1722;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var20;
         short[] var21;
         byte[] var22;
         if(var6.aClass151_9089 != null) {
            var19 = var6.aClass151_9089.aShortArray1719;
            var20 = var6.aClass151_9089.aShortArray1721;
            var21 = var6.aClass151_9089.aShortArray1720;
            var22 = var6.aClass151_9089.aByteArray1722;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray9092;
         short[] var24 = var6.aShortArray9102;
         if(!var6.aBool9072) {
            var6.method8426();
         }

         short var25 = var6.aShort9093;
         short var26 = var6.aShort9067;
         short var27 = var6.aShort9051;
         short var28 = var6.aShort9095;
         short var29 = var6.aShort9096;
         short var30 = var6.aShort9097;

         for(int var31 = 0; var31 < this.anInt9060; ++var31) {
            int var32 = this.anIntArray9059[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.anIntArray9058[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.anIntArray9091[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray9092[var31];
                     int var37 = this.anIntArray9092[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37 && this.aShortArray9102[var38] != 0; ++var38) {
                        var35 = (this.aShortArray9102[var38] & '\uffff') - 1;
                        if(this.aByteArray9061[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37 && var24[var40] != 0; ++var40) {
                                 var39 = (var24[var40] & '\uffff') - 1;
                                 if(var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass151_9089 = new Class151();
                                    var15 = this.aClass151_9089.aShortArray1719 = Class189.method2746(this.aShortArray9064, -783594279);
                                    var16 = this.aClass151_9089.aShortArray1721 = Class189.method2746(this.aShortArray9065, -722425306);
                                    var17 = this.aClass151_9089.aShortArray1720 = Class189.method2746(this.aShortArray9094, -1721477916);
                                    var18 = this.aClass151_9089.aByteArray1722 = Class639_Sub1.method9870(this.aByteArray9061, (byte)-1);
                                 }

                                 if(var19 == null) {
                                    Class151 var46 = var6.aClass151_9089 = new Class151();
                                    var19 = var46.aShortArray1719 = Class189.method2746(var11, -992786303);
                                    var20 = var46.aShortArray1721 = Class189.method2746(var12, -1140728921);
                                    var21 = var46.aShortArray1720 = Class189.method2746(var13, -1732872665);
                                    var22 = var46.aByteArray1722 = Class639_Sub1.method9870(var14, (byte)-45);
                                 }

                                 short var47 = this.aShortArray9064[var35];
                                 short var41 = this.aShortArray9065[var35];
                                 short var42 = this.aShortArray9094[var35];
                                 byte var43 = this.aByteArray9061[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var47;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var47 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray9092[var31];
                                 var37 = this.anIntArray9092[var31 + 1];

                                 for(var44 = var36; var44 < var37 && this.aShortArray9102[var44] != 0; ++var44) {
                                    var45 = (this.aShortArray9102[var44] & '\uffff') - 1;
                                    if(var18[var45] != 0) {
                                       var15[var45] += var47;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }

                                 if(this.aClass129_9083 != null) {
                                    this.aClass129_9083.anInterface15_1612 = null;
                                 }

                                 if(var6.aClass129_9083 == null && var6.aClass129_9044 != null) {
                                    var6.aClass129_9044.anInterface15_1612 = null;
                                 }

                                 if(var6.aClass129_9083 != null) {
                                    var6.aClass129_9083.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method2011(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         int var5 = this.anIntArray9091[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2041() {
      int var1;
      for(var1 = 0; var1 < this.anInt9060; ++var1) {
         this.anIntArray9091[var1] = -this.anIntArray9091[var1];
      }

      for(var1 = 0; var1 < this.anInt9063; ++var1) {
         this.aShortArray9094[var1] = (short)(-this.aShortArray9094[var1]);
      }

      for(var1 = 0; var1 < this.anInt9071; ++var1) {
         short var2 = this.aShortArray9075[var1];
         this.aShortArray9075[var1] = this.aShortArray9077[var1];
         this.aShortArray9077[var1] = var2;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      if(this.aClass136_9085 != null) {
         this.aClass136_9085.anInterface20_1650 = null;
      }

      this.aBool9072 = false;
   }

   public void method2013(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.anInt9060; ++var4) {
         var5 = this.anIntArray9091[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      for(var4 = 0; var4 < this.anInt9063; ++var4) {
         var5 = this.aShortArray9094[var4] * var2 + this.aShortArray9064[var4] * var3 >> 14;
         this.aShortArray9094[var4] = (short)(this.aShortArray9094[var4] * var3 - this.aShortArray9064[var4] * var2 >> 14);
         this.aShortArray9064[var4] = (short)var5;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method1969(int var1) {
      this.aShort9056 = (short)var1;
      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public void method2015(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         int var5 = this.anIntArray9059[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9059[var4] = this.anIntArray9059[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method1998(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         int var5 = this.anIntArray9059[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9059[var4] = this.anIntArray9059[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2051(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 0) {
            this.anIntArray9058[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9059[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9091[var4] += var3;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2018(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 0) {
            this.anIntArray9058[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9059[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9091[var4] += var3;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2080(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 0) {
            this.anIntArray9058[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9059[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9091[var4] += var3;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public int method2047() {
      return this.aShort9056;
   }

   public void method2022() {
      int var1;
      for(var1 = 0; var1 < this.anInt9060; ++var1) {
         this.anIntArray9091[var1] = -this.anIntArray9091[var1];
      }

      for(var1 = 0; var1 < this.anInt9063; ++var1) {
         this.aShortArray9094[var1] = (short)(-this.aShortArray9094[var1]);
      }

      for(var1 = 0; var1 < this.anInt9071; ++var1) {
         short var2 = this.aShortArray9075[var1];
         this.aShortArray9075[var1] = this.aShortArray9077[var1];
         this.aShortArray9077[var1] = var2;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      if(this.aClass136_9085 != null) {
         this.aClass136_9085.anInterface20_1650 = null;
      }

      this.aBool9072 = false;
   }

   public void method2050() {
      int var1;
      for(var1 = 0; var1 < this.anInt9060; ++var1) {
         this.anIntArray9091[var1] = -this.anIntArray9091[var1];
      }

      for(var1 = 0; var1 < this.anInt9063; ++var1) {
         this.aShortArray9094[var1] = (short)(-this.aShortArray9094[var1]);
      }

      for(var1 = 0; var1 < this.anInt9071; ++var1) {
         short var2 = this.aShortArray9075[var1];
         this.aShortArray9075[var1] = this.aShortArray9077[var1];
         this.aShortArray9077[var1] = var2;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      if(this.aClass136_9085 != null) {
         this.aClass136_9085.anInterface20_1650 = null;
      }

      this.aBool9072 = false;
   }

   public void method2024() {
      int var1;
      for(var1 = 0; var1 < this.anInt9060; ++var1) {
         this.anIntArray9091[var1] = -this.anIntArray9091[var1];
      }

      for(var1 = 0; var1 < this.anInt9063; ++var1) {
         this.aShortArray9094[var1] = (short)(-this.aShortArray9094[var1]);
      }

      for(var1 = 0; var1 < this.anInt9071; ++var1) {
         short var2 = this.aShortArray9075[var1];
         this.aShortArray9075[var1] = this.aShortArray9077[var1];
         this.aShortArray9077[var1] = var2;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      if(this.aClass136_9085 != null) {
         this.aClass136_9085.anInterface20_1650 = null;
      }

      this.aBool9072 = false;
   }

   public void method2025() {
      int var1;
      for(var1 = 0; var1 < this.anInt9060; ++var1) {
         this.anIntArray9091[var1] = -this.anIntArray9091[var1];
      }

      for(var1 = 0; var1 < this.anInt9063; ++var1) {
         this.aShortArray9094[var1] = (short)(-this.aShortArray9094[var1]);
      }

      for(var1 = 0; var1 < this.anInt9071; ++var1) {
         short var2 = this.aShortArray9075[var1];
         this.aShortArray9075[var1] = this.aShortArray9077[var1];
         this.aShortArray9077[var1] = var2;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      if(this.aClass136_9085 != null) {
         this.aClass136_9085.anInterface20_1650 = null;
      }

      this.aBool9072 = false;
   }

   public void method2026() {
      int var1;
      for(var1 = 0; var1 < this.anInt9060; ++var1) {
         this.anIntArray9091[var1] = -this.anIntArray9091[var1];
      }

      for(var1 = 0; var1 < this.anInt9063; ++var1) {
         this.aShortArray9094[var1] = (short)(-this.aShortArray9094[var1]);
      }

      for(var1 = 0; var1 < this.anInt9071; ++var1) {
         short var2 = this.aShortArray9075[var1];
         this.aShortArray9075[var1] = this.aShortArray9077[var1];
         this.aShortArray9077[var1] = var2;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      if(this.aClass136_9085 != null) {
         this.aClass136_9085.anInterface20_1650 = null;
      }

      this.aBool9072 = false;
   }

   public boolean method2096() {
      if(this.aShortArray9078 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9078.length; ++var1) {
            if(this.aShortArray9078[var1] != -1) {
               Class171 var2 = this.aClass174_Sub2_9048.aClass169_2035.method2122(this.aShortArray9078[var1] & '\uffff', (byte)26);
               if(var2.aBool1987 && !this.aClass174_Sub2_9048.aClass154_9500.method1832(Class595.aClass595_7846, var2, -1)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public void method2069(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 128) {
            this.anIntArray9058[var4] = this.anIntArray9058[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray9059[var4] = this.anIntArray9059[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 >> 7;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2029(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 128) {
            this.anIntArray9058[var4] = this.anIntArray9058[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray9059[var4] = this.anIntArray9059[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 >> 7;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2030(int var1, int var2, Class148 var3, Class148 var4, int var5, int var6, int var7) {
      if(!this.aBool9072) {
         this.method8426();
      }

      int var8 = var5 + this.aShort9051;
      int var9 = var5 + this.aShort9095;
      int var10 = var7 + this.aShort9096;
      int var11 = var7 + this.aShort9097;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1711 * 1966165105 && var10 >= 0 && var11 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1713 * -810756899) {
         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.anInt1710 * -586661047;
            var9 = var9 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            var10 >>= var3.anInt1710 * -586661047;
            var11 = var11 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            if(var3.method1714(var8, var10, 1057936053) == var6 && var3.method1714(var9, var10, -321741851) == var6 && var3.method1714(var8, var11, 1741945604) == var6 && var3.method1714(var9, var11, -123156901) == var6) {
               return;
            }
         } else {
            if(var4 == null) {
               return;
            }

            if(var8 < 0 || var9 + var4.anInt1712 * 1934131013 >> var4.anInt1710 * -586661047 >= var4.anInt1711 * 1966165105 || var10 < 0 || var11 + var4.anInt1712 * 1934131013 >> var4.anInt1710 * -586661047 >= var4.anInt1713 * -810756899) {
               return;
            }
         }

         int var12;
         if(var1 == 1) {
            for(var12 = 0; var12 < this.anInt9060; ++var12) {
               this.anIntArray9059[var12] = this.anIntArray9059[var12] + var3.method1724(this.anIntArray9058[var12] + var5, this.anIntArray9091[var12] + var7, (byte)60) - var6;
            }
         } else {
            int var13;
            int var14;
            if(var1 == 2) {
               short var19 = this.aShort9093;
               if(var19 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.anInt9060; ++var13) {
                  var14 = (this.anIntArray9059[var13] << 16) / var19;
                  if(var14 < var2) {
                     this.anIntArray9059[var13] += (var3.method1724(this.anIntArray9058[var13] + var5, this.anIntArray9091[var13] + var7, (byte)69) - var6) * (var2 - var14) / var2;
                  }
               }
            } else {
               int var15;
               if(var1 == 3) {
                  var12 = (var2 & 255) * 16;
                  var13 = (var2 >> 8 & 255) * 16;
                  var14 = (var2 >> 16 & 255) << 6;
                  var15 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var12 >> 1) < 0 || var5 + (var12 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1711 * 1966165105 << var3.anInt1710 * -586661047 || var7 - (var13 >> 1) < 0 || var7 + (var13 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1713 * -810756899 << var3.anInt1710 * -586661047) {
                     return;
                  }

                  this.method1966(var3, var5, var6, var7, var12, var13, var14, var15);
               } else if(var1 == 4) {
                  var12 = this.aShort9067 - this.aShort9093;

                  for(var13 = 0; var13 < this.anInt9060; ++var13) {
                     this.anIntArray9059[var13] = this.anIntArray9059[var13] + (var4.method1724(this.anIntArray9058[var13] + var5, this.anIntArray9091[var13] + var7, (byte)-74) - var6) + var12;
                  }
               } else if(var1 == 5) {
                  var12 = this.aShort9067 - this.aShort9093;

                  for(var13 = 0; var13 < this.anInt9060; ++var13) {
                     var14 = this.anIntArray9058[var13] + var5;
                     var15 = this.anIntArray9091[var13] + var7;
                     int var16 = var3.method1724(var14, var15, (byte)-55);
                     int var17 = var4.method1724(var14, var15, (byte)-56);
                     int var18 = var16 - var17 - var2;
                     this.anIntArray9059[var13] = ((this.anIntArray9059[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         if(this.aClass129_9081 != null) {
            this.aClass129_9081.anInterface15_1612 = null;
         }

         this.aBool9072 = false;
      }
   }

   public void method2001(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub1 var6 = (Class168_Sub1)var1;
      if(this.anInt9071 != 0 && var6.anInt9071 != 0) {
         int var7 = var6.anInt9060;
         int[] var8 = var6.anIntArray9058;
         int[] var9 = var6.anIntArray9059;
         int[] var10 = var6.anIntArray9091;
         short[] var11 = var6.aShortArray9064;
         short[] var12 = var6.aShortArray9065;
         short[] var13 = var6.aShortArray9094;
         byte[] var14 = var6.aByteArray9061;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if(this.aClass151_9089 != null) {
            var15 = this.aClass151_9089.aShortArray1719;
            var16 = this.aClass151_9089.aShortArray1721;
            var17 = this.aClass151_9089.aShortArray1720;
            var18 = this.aClass151_9089.aByteArray1722;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var20;
         short[] var21;
         byte[] var22;
         if(var6.aClass151_9089 != null) {
            var19 = var6.aClass151_9089.aShortArray1719;
            var20 = var6.aClass151_9089.aShortArray1721;
            var21 = var6.aClass151_9089.aShortArray1720;
            var22 = var6.aClass151_9089.aByteArray1722;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray9092;
         short[] var24 = var6.aShortArray9102;
         if(!var6.aBool9072) {
            var6.method8426();
         }

         short var25 = var6.aShort9093;
         short var26 = var6.aShort9067;
         short var27 = var6.aShort9051;
         short var28 = var6.aShort9095;
         short var29 = var6.aShort9096;
         short var30 = var6.aShort9097;

         for(int var31 = 0; var31 < this.anInt9060; ++var31) {
            int var32 = this.anIntArray9059[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.anIntArray9058[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.anIntArray9091[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray9092[var31];
                     int var37 = this.anIntArray9092[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37 && this.aShortArray9102[var38] != 0; ++var38) {
                        var35 = (this.aShortArray9102[var38] & '\uffff') - 1;
                        if(this.aByteArray9061[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37 && var24[var40] != 0; ++var40) {
                                 var39 = (var24[var40] & '\uffff') - 1;
                                 if(var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass151_9089 = new Class151();
                                    var15 = this.aClass151_9089.aShortArray1719 = Class189.method2746(this.aShortArray9064, -703886964);
                                    var16 = this.aClass151_9089.aShortArray1721 = Class189.method2746(this.aShortArray9065, -1576492657);
                                    var17 = this.aClass151_9089.aShortArray1720 = Class189.method2746(this.aShortArray9094, -1736063501);
                                    var18 = this.aClass151_9089.aByteArray1722 = Class639_Sub1.method9870(this.aByteArray9061, (byte)74);
                                 }

                                 if(var19 == null) {
                                    Class151 var46 = var6.aClass151_9089 = new Class151();
                                    var19 = var46.aShortArray1719 = Class189.method2746(var11, -1115985071);
                                    var20 = var46.aShortArray1721 = Class189.method2746(var12, -821622197);
                                    var21 = var46.aShortArray1720 = Class189.method2746(var13, -1413542444);
                                    var22 = var46.aByteArray1722 = Class639_Sub1.method9870(var14, (byte)58);
                                 }

                                 short var47 = this.aShortArray9064[var35];
                                 short var41 = this.aShortArray9065[var35];
                                 short var42 = this.aShortArray9094[var35];
                                 byte var43 = this.aByteArray9061[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var47;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var47 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray9092[var31];
                                 var37 = this.anIntArray9092[var31 + 1];

                                 for(var44 = var36; var44 < var37 && this.aShortArray9102[var44] != 0; ++var44) {
                                    var45 = (this.aShortArray9102[var44] & '\uffff') - 1;
                                    if(var18[var45] != 0) {
                                       var15[var45] += var47;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }

                                 if(this.aClass129_9083 != null) {
                                    this.aClass129_9083.anInterface15_1612 = null;
                                 }

                                 if(var6.aClass129_9083 == null && var6.aClass129_9044 != null) {
                                    var6.aClass129_9044.anInterface15_1612 = null;
                                 }

                                 if(var6.aClass129_9083 != null) {
                                    var6.aClass129_9083.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method2073(int var1) {
      this.aShort9056 = (short)var1;
      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public boolean method2014() {
      return this.aBool9054;
   }

   boolean method2034() {
      if(this.anIntArrayArray9084 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9046; ++var1) {
            this.anIntArray9058[var1] <<= 4;
            this.anIntArray9059[var1] <<= 4;
            this.anIntArray9091[var1] <<= 4;
         }

         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;
         return true;
      }
   }

   boolean method2035() {
      if(this.anIntArrayArray9084 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9046; ++var1) {
            this.anIntArray9058[var1] <<= 4;
            this.anIntArray9059[var1] <<= 4;
            this.anIntArray9091[var1] <<= 4;
         }

         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;
         return true;
      }
   }

   boolean method2103() {
      if(this.anIntArrayArray9084 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9046; ++var1) {
            this.anIntArray9058[var1] <<= 4;
            this.anIntArray9059[var1] <<= 4;
            this.anIntArray9091[var1] <<= 4;
         }

         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;
         return true;
      }
   }

   boolean method2037() {
      if(this.anIntArrayArray9084 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9046; ++var1) {
            this.anIntArray9058[var1] <<= 4;
            this.anIntArray9059[var1] <<= 4;
            this.anIntArray9091[var1] <<= 4;
         }

         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;
         return true;
      }
   }

   boolean method2068() {
      if(this.anIntArrayArray9084 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9046; ++var1) {
            this.anIntArray9058[var1] <<= 4;
            this.anIntArray9059[var1] <<= 4;
            this.anIntArray9091[var1] <<= 4;
         }

         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;
         return true;
      }
   }

   void method2039(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var23;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var24 = var2[var10];
            if(var24 < this.anIntArrayArray9084.length) {
               int[] var25 = this.anIntArrayArray9084[var24];

               for(var23 = 0; var23 < var25.length; ++var23) {
                  var14 = var25[var23];
                  anInt9101 += this.anIntArray9058[var14];
                  anInt9115 += this.anIntArray9059[var14];
                  anInt9116 += this.anIntArray9091[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            anInt9101 = anInt9101 / var9 + var3;
            anInt9115 = anInt9115 / var9 + var4;
            anInt9116 = anInt9116 / var9 + var5;
         } else {
            anInt9101 = var3;
            anInt9115 = var4;
            anInt9116 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9084.length) {
                  var11 = this.anIntArrayArray9084[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var23 = var11[var12];
                     this.anIntArray9058[var23] += var3;
                     this.anIntArray9059[var23] += var4;
                     this.anIntArray9091[var23] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            int var17;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9084.length) {
                     var11 = this.anIntArrayArray9084[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray9058[var23] -= anInt9101;
                           this.anIntArray9059[var23] -= anInt9115;
                           this.anIntArray9091[var23] -= anInt9116;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9059[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = this.anIntArray9059[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9059[var23] * var15 - this.anIntArray9091[var23] * var14 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9059[var23] * var14 + this.anIntArray9091[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9091[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9091[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           this.anIntArray9058[var23] += anInt9101;
                           this.anIntArray9059[var23] += anInt9115;
                           this.anIntArray9091[var23] += anInt9116;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray9058[var23] -= anInt9101;
                           this.anIntArray9059[var23] -= anInt9115;
                           this.anIntArray9091[var23] -= anInt9116;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9059[var23] * var15 - this.anIntArray9091[var23] * var14 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9059[var23] * var14 + this.anIntArray9091[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9059[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = this.anIntArray9059[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9091[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9091[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           this.anIntArray9058[var23] += anInt9101;
                           this.anIntArray9059[var23] += anInt9115;
                           this.anIntArray9091[var23] += anInt9116;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray9084.length) {
                        var11 = this.anIntArrayArray9084[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           var14 = this.anIntArray9092[var23];
                           var15 = this.anIntArray9092[var23 + 1];

                           for(var16 = var14; var16 < var15 && this.aShortArray9102[var16] != 0; ++var16) {
                              var17 = (this.aShortArray9102[var16] & '\uffff') - 1;
                              int var18;
                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class443.anIntArray4895[var5];
                                 var19 = Class443.anIntArray4896[var5];
                                 var20 = this.aShortArray9065[var17] * var18 + this.aShortArray9064[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9065[var17] = (short)(this.aShortArray9065[var17] * var19 - this.aShortArray9064[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9064[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class443.anIntArray4895[var3];
                                 var19 = Class443.anIntArray4896[var3];
                                 var20 = this.aShortArray9065[var17] * var19 - this.aShortArray9094[var17] * var18 + 16383 >> 14;
                                 this.aShortArray9094[var17] = (short)(this.aShortArray9065[var17] * var18 + this.aShortArray9094[var17] * var19 + 16383 >> 14);
                                 this.aShortArray9065[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class443.anIntArray4895[var4];
                                 var19 = Class443.anIntArray4896[var4];
                                 var20 = this.aShortArray9094[var17] * var18 + this.aShortArray9064[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9094[var17] = (short)(this.aShortArray9094[var17] * var19 - this.aShortArray9064[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9064[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                     this.aClass129_9044.anInterface15_1612 = null;
                  }

                  if(this.aClass129_9083 != null) {
                     this.aClass129_9083.anInterface15_1612 = null;
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9084.length) {
                     var11 = this.anIntArrayArray9084[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var23 = var11[var12];
                        this.anIntArray9058[var23] -= anInt9101;
                        this.anIntArray9059[var23] -= anInt9115;
                        this.anIntArray9091[var23] -= anInt9116;
                        this.anIntArray9058[var23] = this.anIntArray9058[var23] * var3 >> 7;
                        this.anIntArray9059[var23] = this.anIntArray9059[var23] * var4 >> 7;
                        this.anIntArray9091[var23] = this.anIntArray9091[var23] * var5 >> 7;
                        this.anIntArray9058[var23] += anInt9101;
                        this.anIntArray9059[var23] += anInt9115;
                        this.anIntArray9091[var23] += anInt9116;
                     }
                  }
               }

            } else {
               Class147 var21;
               Class137 var22;
               if(var1 == 5) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9079.length) {
                           var11 = this.anIntArrayArray9079[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = (this.aByteArray9074[var23] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray9074[var23] = (byte)var14;
                           }

                           if(var11.length > 0 && this.aClass129_9044 != null) {
                              this.aClass129_9044.anInterface15_1612 = null;
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var9 = 0; var9 < this.anInt9105; ++var9) {
                           var21 = this.aClass147Array9043[var9];
                           var22 = this.aClass137Array9104[var9];
                           var22.anInt1653 = var22.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var21.anInt1703] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9079.length) {
                           var11 = this.anIntArrayArray9079[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = this.aShortArray9082[var23] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4 / 4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray9082[var23] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           if(var11.length > 0 && this.aClass129_9044 != null) {
                              this.aClass129_9044.anInterface15_1612 = null;
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var9 = 0; var9 < this.anInt9105; ++var9) {
                           var21 = this.aClass147Array9043[var9];
                           var22 = this.aClass137Array9104[var9];
                           var22.anInt1653 = var22.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var21.anInt1703] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class137 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1654 += var3;
                                 var13.anInt1655 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1651 = var13.anInt1651 * var3 >> 7;
                                 var13.anInt1652 = var13.anInt1652 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1656 = var13.anInt1656 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2067(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var23;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var24 = var2[var10];
            if(var24 < this.anIntArrayArray9084.length) {
               int[] var25 = this.anIntArrayArray9084[var24];

               for(var23 = 0; var23 < var25.length; ++var23) {
                  var14 = var25[var23];
                  anInt9101 += this.anIntArray9058[var14];
                  anInt9115 += this.anIntArray9059[var14];
                  anInt9116 += this.anIntArray9091[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            anInt9101 = anInt9101 / var9 + var3;
            anInt9115 = anInt9115 / var9 + var4;
            anInt9116 = anInt9116 / var9 + var5;
         } else {
            anInt9101 = var3;
            anInt9115 = var4;
            anInt9116 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9084.length) {
                  var11 = this.anIntArrayArray9084[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var23 = var11[var12];
                     this.anIntArray9058[var23] += var3;
                     this.anIntArray9059[var23] += var4;
                     this.anIntArray9091[var23] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            int var17;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9084.length) {
                     var11 = this.anIntArrayArray9084[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray9058[var23] -= anInt9101;
                           this.anIntArray9059[var23] -= anInt9115;
                           this.anIntArray9091[var23] -= anInt9116;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9059[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = this.anIntArray9059[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9059[var23] * var15 - this.anIntArray9091[var23] * var14 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9059[var23] * var14 + this.anIntArray9091[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9091[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9091[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           this.anIntArray9058[var23] += anInt9101;
                           this.anIntArray9059[var23] += anInt9115;
                           this.anIntArray9091[var23] += anInt9116;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray9058[var23] -= anInt9101;
                           this.anIntArray9059[var23] -= anInt9115;
                           this.anIntArray9091[var23] -= anInt9116;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9059[var23] * var15 - this.anIntArray9091[var23] * var14 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9059[var23] * var14 + this.anIntArray9091[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9059[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = this.anIntArray9059[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9091[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9091[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           this.anIntArray9058[var23] += anInt9101;
                           this.anIntArray9059[var23] += anInt9115;
                           this.anIntArray9091[var23] += anInt9116;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray9084.length) {
                        var11 = this.anIntArrayArray9084[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           var14 = this.anIntArray9092[var23];
                           var15 = this.anIntArray9092[var23 + 1];

                           for(var16 = var14; var16 < var15 && this.aShortArray9102[var16] != 0; ++var16) {
                              var17 = (this.aShortArray9102[var16] & '\uffff') - 1;
                              int var18;
                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class443.anIntArray4895[var5];
                                 var19 = Class443.anIntArray4896[var5];
                                 var20 = this.aShortArray9065[var17] * var18 + this.aShortArray9064[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9065[var17] = (short)(this.aShortArray9065[var17] * var19 - this.aShortArray9064[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9064[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class443.anIntArray4895[var3];
                                 var19 = Class443.anIntArray4896[var3];
                                 var20 = this.aShortArray9065[var17] * var19 - this.aShortArray9094[var17] * var18 + 16383 >> 14;
                                 this.aShortArray9094[var17] = (short)(this.aShortArray9065[var17] * var18 + this.aShortArray9094[var17] * var19 + 16383 >> 14);
                                 this.aShortArray9065[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class443.anIntArray4895[var4];
                                 var19 = Class443.anIntArray4896[var4];
                                 var20 = this.aShortArray9094[var17] * var18 + this.aShortArray9064[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9094[var17] = (short)(this.aShortArray9094[var17] * var19 - this.aShortArray9064[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9064[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                     this.aClass129_9044.anInterface15_1612 = null;
                  }

                  if(this.aClass129_9083 != null) {
                     this.aClass129_9083.anInterface15_1612 = null;
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9084.length) {
                     var11 = this.anIntArrayArray9084[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var23 = var11[var12];
                        this.anIntArray9058[var23] -= anInt9101;
                        this.anIntArray9059[var23] -= anInt9115;
                        this.anIntArray9091[var23] -= anInt9116;
                        this.anIntArray9058[var23] = this.anIntArray9058[var23] * var3 >> 7;
                        this.anIntArray9059[var23] = this.anIntArray9059[var23] * var4 >> 7;
                        this.anIntArray9091[var23] = this.anIntArray9091[var23] * var5 >> 7;
                        this.anIntArray9058[var23] += anInt9101;
                        this.anIntArray9059[var23] += anInt9115;
                        this.anIntArray9091[var23] += anInt9116;
                     }
                  }
               }

            } else {
               Class147 var21;
               Class137 var22;
               if(var1 == 5) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9079.length) {
                           var11 = this.anIntArrayArray9079[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = (this.aByteArray9074[var23] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray9074[var23] = (byte)var14;
                           }

                           if(var11.length > 0 && this.aClass129_9044 != null) {
                              this.aClass129_9044.anInterface15_1612 = null;
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var9 = 0; var9 < this.anInt9105; ++var9) {
                           var21 = this.aClass147Array9043[var9];
                           var22 = this.aClass137Array9104[var9];
                           var22.anInt1653 = var22.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var21.anInt1703] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9079.length) {
                           var11 = this.anIntArrayArray9079[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = this.aShortArray9082[var23] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4 / 4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray9082[var23] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           if(var11.length > 0 && this.aClass129_9044 != null) {
                              this.aClass129_9044.anInterface15_1612 = null;
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var9 = 0; var9 < this.anInt9105; ++var9) {
                           var21 = this.aClass147Array9043[var9];
                           var22 = this.aClass137Array9104[var9];
                           var22.anInt1653 = var22.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var21.anInt1703] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class137 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1654 += var3;
                                 var13.anInt1655 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1651 = var13.anInt1651 * var3 >> 7;
                                 var13.anInt1652 = var13.anInt1652 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1656 = var13.anInt1656 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   public int method2017() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.anInt9090;
   }

   void method2119(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var49;
      int var50;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var49 = var2[var11];
            if(var49 < this.anIntArrayArray9084.length) {
               int[] var52 = this.anIntArrayArray9084[var49];

               for(var50 = 0; var50 < var52.length; ++var50) {
                  var15 = var52[var50];
                  if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var15]) != 0) {
                     anInt9101 += this.anIntArray9058[var15];
                     anInt9115 += this.anIntArray9059[var15];
                     anInt9116 += this.anIntArray9091[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            anInt9101 = anInt9101 / var10 + var3;
            anInt9115 = anInt9115 / var10 + var4;
            anInt9116 = anInt9116 / var10 + var5;
            aBool9106 = true;
         } else {
            anInt9101 = var3;
            anInt9115 = var4;
            anInt9116 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var49 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var49;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9084.length) {
                  var12 = this.anIntArrayArray9084[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var50 = var12[var13];
                     if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                        this.anIntArray9058[var50] += var3;
                        this.anIntArray9059[var50] += var4;
                        this.anIntArray9091[var50] += var5;
                     }
                  }
               }
            }

         } else {
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var26;
            int var27;
            int var28;
            int var30;
            int var32;
            int var33;
            int var34;
            int[] var35;
            int var36;
            int var37;
            int var38;
            int var39;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBool9106) {
                     var16 = var8[0] * anInt9101 + var8[3] * anInt9115 + var8[6] * anInt9116 + 8192 >> 14;
                     var17 = var8[1] * anInt9101 + var8[4] * anInt9115 + var8[7] * anInt9116 + 8192 >> 14;
                     var18 = var8[2] * anInt9101 + var8[5] * anInt9115 + var8[8] * anInt9116 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     anInt9101 = var16;
                     anInt9115 = var17;
                     anInt9116 = var18;
                     aBool9106 = false;
                  }

                  int[] var51 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var51[0] * -anInt9101 + var51[1] * -anInt9115 + var51[2] * -anInt9116 + 8192 >> 14;
                  var26 = var51[3] * -anInt9101 + var51[4] * -anInt9115 + var51[5] * -anInt9116 + 8192 >> 14;
                  var27 = var51[6] * -anInt9101 + var51[7] * -anInt9115 + var51[8] * -anInt9116 + 8192 >> 14;
                  var28 = var53 + anInt9101;
                  int var54 = var26 + anInt9115;
                  var30 = var27 + anInt9116;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var51[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var13 + var51[1] * var50 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var13 + var51[4] * var50 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var13 + var51[7] * var50 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var49;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9084.length) {
                        int[] var41 = this.anIntArrayArray9084[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9058[var43] + var35[1] * this.anIntArray9059[var43] + var35[2] * this.anIntArray9091[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9058[var43] + var35[4] * this.anIntArray9059[var43] + var35[5] * this.anIntArray9091[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9058[var43] + var35[7] * this.anIntArray9059[var43] + var35[8] * this.anIntArray9091[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9058[var43] = var44;
                              this.anIntArray9059[var43] = var45;
                              this.anIntArray9091[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9084.length) {
                        var12 = this.anIntArrayArray9084[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                              this.anIntArray9058[var50] -= anInt9101;
                              this.anIntArray9059[var50] -= anInt9115;
                              this.anIntArray9091[var50] -= anInt9116;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9059[var50] * var15 + this.anIntArray9058[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9059[var50] = this.anIntArray9059[var50] * var16 - this.anIntArray9058[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9058[var50] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9059[var50] * var16 - this.anIntArray9091[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9091[var50] = this.anIntArray9059[var50] * var15 + this.anIntArray9091[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9059[var50] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9091[var50] * var15 + this.anIntArray9058[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9091[var50] = this.anIntArray9091[var50] * var16 - this.anIntArray9058[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9058[var50] = var17;
                              }

                              this.anIntArray9058[var50] += anInt9101;
                              this.anIntArray9059[var50] += anInt9115;
                              this.anIntArray9091[var50] += anInt9116;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9084.length) {
                           var12 = this.anIntArrayArray9084[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                                 var15 = this.anIntArray9092[var50];
                                 var16 = this.anIntArray9092[var50 + 1];

                                 for(var17 = var15; var17 < var16 && this.aShortArray9102[var17] != 0; ++var17) {
                                    var18 = (this.aShortArray9102[var17] & '\uffff') - 1;
                                    if(var5 != 0) {
                                       var19 = Class443.anIntArray4895[var5];
                                       var20 = Class443.anIntArray4896[var5];
                                       var21 = this.aShortArray9065[var18] * var19 + this.aShortArray9064[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9065[var18] = (short)(this.aShortArray9065[var18] * var20 - this.aShortArray9064[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9064[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Class443.anIntArray4895[var3];
                                       var20 = Class443.anIntArray4896[var3];
                                       var21 = this.aShortArray9065[var18] * var20 - this.aShortArray9094[var18] * var19 + 16383 >> 14;
                                       this.aShortArray9094[var18] = (short)(this.aShortArray9065[var18] * var19 + this.aShortArray9094[var18] * var20 + 16383 >> 14);
                                       this.aShortArray9065[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Class443.anIntArray4895[var4];
                                       var20 = Class443.anIntArray4896[var4];
                                       var21 = this.aShortArray9094[var18] * var19 + this.aShortArray9064[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9094[var18] = (short)(this.aShortArray9094[var18] * var20 - this.aShortArray9064[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9064[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                        this.aClass129_9044.anInterface15_1612 = null;
                     }

                     if(this.aClass129_9083 != null) {
                        this.aClass129_9083.anInterface15_1612 = null;
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBool9106) {
                     var16 = var8[0] * anInt9101 + var8[3] * anInt9115 + var8[6] * anInt9116 + 8192 >> 14;
                     var17 = var8[1] * anInt9101 + var8[4] * anInt9115 + var8[7] * anInt9116 + 8192 >> 14;
                     var18 = var8[2] * anInt9101 + var8[5] * anInt9115 + var8[8] * anInt9116 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     anInt9101 = var16;
                     anInt9115 = var17;
                     anInt9116 = var18;
                     aBool9106 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -anInt9101 + 8192 >> 14;
                  var20 = var17 * -anInt9115 + 8192 >> 14;
                  var21 = var18 * -anInt9116 + 8192 >> 14;
                  var22 = var19 + anInt9101;
                  var23 = var20 + anInt9115;
                  var24 = var21 + anInt9116;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var50 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var49;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9084.length) {
                        var35 = this.anIntArrayArray9084[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9058[var37] + var29[1] * this.anIntArray9059[var37] + var29[2] * this.anIntArray9091[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9058[var37] + var29[4] * this.anIntArray9059[var37] + var29[5] * this.anIntArray9091[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9058[var37] + var29[7] * this.anIntArray9059[var37] + var29[8] * this.anIntArray9091[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9058[var37] = var38;
                              this.anIntArray9059[var37] = var39;
                              this.anIntArray9091[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9084.length) {
                        var12 = this.anIntArrayArray9084[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                              this.anIntArray9058[var50] -= anInt9101;
                              this.anIntArray9059[var50] -= anInt9115;
                              this.anIntArray9091[var50] -= anInt9116;
                              this.anIntArray9058[var50] = this.anIntArray9058[var50] * var3 >> 7;
                              this.anIntArray9059[var50] = this.anIntArray9059[var50] * var4 >> 7;
                              this.anIntArray9091[var50] = this.anIntArray9091[var50] * var5 >> 7;
                              this.anIntArray9058[var50] += anInt9101;
                              this.anIntArray9059[var50] += anInt9115;
                              this.anIntArray9091[var50] += anInt9116;
                           }
                        }
                     }
                  }
               }

            } else {
               Class147 var47;
               Class137 var48;
               if(var1 == 5) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9079.length) {
                           var12 = this.anIntArrayArray9079[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9080 == null || (var7 & this.aShortArray9080[var50]) != 0) {
                                 var15 = (this.aByteArray9074[var50] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.aByteArray9074[var50] = (byte)var15;
                                 if(this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var10 = 0; var10 < this.anInt9105; ++var10) {
                           var47 = this.aClass147Array9043[var10];
                           var48 = this.aClass137Array9104[var10];
                           var48.anInt1653 = var48.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var47.anInt1703] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9079.length) {
                           var12 = this.anIntArrayArray9079[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9080 == null || (var7 & this.aShortArray9080[var50]) != 0) {
                                 var15 = this.aShortArray9082[var50] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4 / 4;
                                 if(var17 < 0) {
                                    var17 = 0;
                                 } else if(var17 > 7) {
                                    var17 = 7;
                                 }

                                 var18 += var5;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 127) {
                                    var18 = 127;
                                 }

                                 this.aShortArray9082[var50] = (short)(var16 << 10 | var17 << 7 | var18);
                                 if(this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var10 = 0; var10 < this.anInt9105; ++var10) {
                           var47 = this.aClass147Array9043[var10];
                           var48 = this.aClass137Array9104[var10];
                           var48.anInt1653 = var48.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var47.anInt1703] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class137 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1654 += var3;
                                 var14.anInt1655 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1651 = var14.anInt1651 * var3 >> 7;
                                 var14.anInt1652 = var14.anInt1652 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1656 = var14.anInt1656 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2043(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var49;
      int var50;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var49 = var2[var11];
            if(var49 < this.anIntArrayArray9084.length) {
               int[] var52 = this.anIntArrayArray9084[var49];

               for(var50 = 0; var50 < var52.length; ++var50) {
                  var15 = var52[var50];
                  if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var15]) != 0) {
                     anInt9101 += this.anIntArray9058[var15];
                     anInt9115 += this.anIntArray9059[var15];
                     anInt9116 += this.anIntArray9091[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            anInt9101 = anInt9101 / var10 + var3;
            anInt9115 = anInt9115 / var10 + var4;
            anInt9116 = anInt9116 / var10 + var5;
            aBool9106 = true;
         } else {
            anInt9101 = var3;
            anInt9115 = var4;
            anInt9116 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var49 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var49;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9084.length) {
                  var12 = this.anIntArrayArray9084[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var50 = var12[var13];
                     if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                        this.anIntArray9058[var50] += var3;
                        this.anIntArray9059[var50] += var4;
                        this.anIntArray9091[var50] += var5;
                     }
                  }
               }
            }

         } else {
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var26;
            int var27;
            int var28;
            int var30;
            int var32;
            int var33;
            int var34;
            int[] var35;
            int var36;
            int var37;
            int var38;
            int var39;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBool9106) {
                     var16 = var8[0] * anInt9101 + var8[3] * anInt9115 + var8[6] * anInt9116 + 8192 >> 14;
                     var17 = var8[1] * anInt9101 + var8[4] * anInt9115 + var8[7] * anInt9116 + 8192 >> 14;
                     var18 = var8[2] * anInt9101 + var8[5] * anInt9115 + var8[8] * anInt9116 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     anInt9101 = var16;
                     anInt9115 = var17;
                     anInt9116 = var18;
                     aBool9106 = false;
                  }

                  int[] var51 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var51[0] * -anInt9101 + var51[1] * -anInt9115 + var51[2] * -anInt9116 + 8192 >> 14;
                  var26 = var51[3] * -anInt9101 + var51[4] * -anInt9115 + var51[5] * -anInt9116 + 8192 >> 14;
                  var27 = var51[6] * -anInt9101 + var51[7] * -anInt9115 + var51[8] * -anInt9116 + 8192 >> 14;
                  var28 = var53 + anInt9101;
                  int var54 = var26 + anInt9115;
                  var30 = var27 + anInt9116;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var51[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var13 + var51[1] * var50 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var13 + var51[4] * var50 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var13 + var51[7] * var50 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var49;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9084.length) {
                        int[] var41 = this.anIntArrayArray9084[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9058[var43] + var35[1] * this.anIntArray9059[var43] + var35[2] * this.anIntArray9091[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9058[var43] + var35[4] * this.anIntArray9059[var43] + var35[5] * this.anIntArray9091[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9058[var43] + var35[7] * this.anIntArray9059[var43] + var35[8] * this.anIntArray9091[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9058[var43] = var44;
                              this.anIntArray9059[var43] = var45;
                              this.anIntArray9091[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9084.length) {
                        var12 = this.anIntArrayArray9084[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                              this.anIntArray9058[var50] -= anInt9101;
                              this.anIntArray9059[var50] -= anInt9115;
                              this.anIntArray9091[var50] -= anInt9116;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9059[var50] * var15 + this.anIntArray9058[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9059[var50] = this.anIntArray9059[var50] * var16 - this.anIntArray9058[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9058[var50] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9059[var50] * var16 - this.anIntArray9091[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9091[var50] = this.anIntArray9059[var50] * var15 + this.anIntArray9091[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9059[var50] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9091[var50] * var15 + this.anIntArray9058[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9091[var50] = this.anIntArray9091[var50] * var16 - this.anIntArray9058[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9058[var50] = var17;
                              }

                              this.anIntArray9058[var50] += anInt9101;
                              this.anIntArray9059[var50] += anInt9115;
                              this.anIntArray9091[var50] += anInt9116;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9084.length) {
                           var12 = this.anIntArrayArray9084[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                                 var15 = this.anIntArray9092[var50];
                                 var16 = this.anIntArray9092[var50 + 1];

                                 for(var17 = var15; var17 < var16 && this.aShortArray9102[var17] != 0; ++var17) {
                                    var18 = (this.aShortArray9102[var17] & '\uffff') - 1;
                                    if(var5 != 0) {
                                       var19 = Class443.anIntArray4895[var5];
                                       var20 = Class443.anIntArray4896[var5];
                                       var21 = this.aShortArray9065[var18] * var19 + this.aShortArray9064[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9065[var18] = (short)(this.aShortArray9065[var18] * var20 - this.aShortArray9064[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9064[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Class443.anIntArray4895[var3];
                                       var20 = Class443.anIntArray4896[var3];
                                       var21 = this.aShortArray9065[var18] * var20 - this.aShortArray9094[var18] * var19 + 16383 >> 14;
                                       this.aShortArray9094[var18] = (short)(this.aShortArray9065[var18] * var19 + this.aShortArray9094[var18] * var20 + 16383 >> 14);
                                       this.aShortArray9065[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Class443.anIntArray4895[var4];
                                       var20 = Class443.anIntArray4896[var4];
                                       var21 = this.aShortArray9094[var18] * var19 + this.aShortArray9064[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9094[var18] = (short)(this.aShortArray9094[var18] * var20 - this.aShortArray9064[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9064[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                        this.aClass129_9044.anInterface15_1612 = null;
                     }

                     if(this.aClass129_9083 != null) {
                        this.aClass129_9083.anInterface15_1612 = null;
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(aBool9106) {
                     var16 = var8[0] * anInt9101 + var8[3] * anInt9115 + var8[6] * anInt9116 + 8192 >> 14;
                     var17 = var8[1] * anInt9101 + var8[4] * anInt9115 + var8[7] * anInt9116 + 8192 >> 14;
                     var18 = var8[2] * anInt9101 + var8[5] * anInt9115 + var8[8] * anInt9116 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     anInt9101 = var16;
                     anInt9115 = var17;
                     anInt9116 = var18;
                     aBool9106 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -anInt9101 + 8192 >> 14;
                  var20 = var17 * -anInt9115 + 8192 >> 14;
                  var21 = var18 * -anInt9116 + 8192 >> 14;
                  var22 = var19 + anInt9101;
                  var23 = var20 + anInt9115;
                  var24 = var21 + anInt9116;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var50 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var49;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9084.length) {
                        var35 = this.anIntArrayArray9084[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9058[var37] + var29[1] * this.anIntArray9059[var37] + var29[2] * this.anIntArray9091[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9058[var37] + var29[4] * this.anIntArray9059[var37] + var29[5] * this.anIntArray9091[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9058[var37] + var29[7] * this.anIntArray9059[var37] + var29[8] * this.anIntArray9091[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9058[var37] = var38;
                              this.anIntArray9059[var37] = var39;
                              this.anIntArray9091[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9084.length) {
                        var12 = this.anIntArrayArray9084[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9062 == null || (var7 & this.aShortArray9062[var50]) != 0) {
                              this.anIntArray9058[var50] -= anInt9101;
                              this.anIntArray9059[var50] -= anInt9115;
                              this.anIntArray9091[var50] -= anInt9116;
                              this.anIntArray9058[var50] = this.anIntArray9058[var50] * var3 >> 7;
                              this.anIntArray9059[var50] = this.anIntArray9059[var50] * var4 >> 7;
                              this.anIntArray9091[var50] = this.anIntArray9091[var50] * var5 >> 7;
                              this.anIntArray9058[var50] += anInt9101;
                              this.anIntArray9059[var50] += anInt9115;
                              this.anIntArray9091[var50] += anInt9116;
                           }
                        }
                     }
                  }
               }

            } else {
               Class147 var47;
               Class137 var48;
               if(var1 == 5) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9079.length) {
                           var12 = this.anIntArrayArray9079[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9080 == null || (var7 & this.aShortArray9080[var50]) != 0) {
                                 var15 = (this.aByteArray9074[var50] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.aByteArray9074[var50] = (byte)var15;
                                 if(this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var10 = 0; var10 < this.anInt9105; ++var10) {
                           var47 = this.aClass147Array9043[var10];
                           var48 = this.aClass137Array9104[var10];
                           var48.anInt1653 = var48.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var47.anInt1703] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9079.length) {
                           var12 = this.anIntArrayArray9079[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9080 == null || (var7 & this.aShortArray9080[var50]) != 0) {
                                 var15 = this.aShortArray9082[var50] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4 / 4;
                                 if(var17 < 0) {
                                    var17 = 0;
                                 } else if(var17 > 7) {
                                    var17 = 7;
                                 }

                                 var18 += var5;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 127) {
                                    var18 = 127;
                                 }

                                 this.aShortArray9082[var50] = (short)(var16 << 10 | var17 << 7 | var18);
                                 if(this.aClass129_9044 != null) {
                                    this.aClass129_9044.anInterface15_1612 = null;
                                 }
                              }
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var10 = 0; var10 < this.anInt9105; ++var10) {
                           var47 = this.aClass147Array9043[var10];
                           var48 = this.aClass137Array9104[var10];
                           var48.anInt1653 = var48.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var47.anInt1703] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class137 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1654 += var3;
                                 var14.anInt1655 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1651 = var14.anInt1651 * var3 >> 7;
                                 var14.anInt1652 = var14.anInt1652 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9108.length) {
                              var12 = this.anIntArrayArray9108[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass137Array9104[var12[var13]];
                                 var14.anInt1656 = var14.anInt1656 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2044(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var10 = 0; var10 < this.anInt9060; ++var10) {
            anInt9101 += this.anIntArray9058[var10];
            anInt9115 += this.anIntArray9059[var10];
            anInt9116 += this.anIntArray9091[var10];
            ++var5;
         }

         if(var5 > 0) {
            anInt9101 = anInt9101 / var5 + var2;
            anInt9115 = anInt9115 / var5 + var3;
            anInt9116 = anInt9116 / var5 + var4;
         } else {
            anInt9101 = var2;
            anInt9115 = var3;
            anInt9116 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.anInt9060; ++var5) {
            this.anIntArray9058[var5] += var2;
            this.anIntArray9059[var5] += var3;
            this.anIntArray9091[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.anInt9060; ++var5) {
               this.anIntArray9058[var5] -= anInt9101;
               this.anIntArray9059[var5] -= anInt9115;
               this.anIntArray9091[var5] -= anInt9116;
               if(var4 != 0) {
                  var10 = Class443.anIntArray4895[var4];
                  var7 = Class443.anIntArray4896[var4];
                  var8 = this.anIntArray9059[var5] * var10 + this.anIntArray9058[var5] * var7 + 16383 >> 14;
                  this.anIntArray9059[var5] = this.anIntArray9059[var5] * var7 - this.anIntArray9058[var5] * var10 + 16383 >> 14;
                  this.anIntArray9058[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = Class443.anIntArray4895[var2];
                  var7 = Class443.anIntArray4896[var2];
                  var8 = this.anIntArray9059[var5] * var7 - this.anIntArray9091[var5] * var10 + 16383 >> 14;
                  this.anIntArray9091[var5] = this.anIntArray9059[var5] * var10 + this.anIntArray9091[var5] * var7 + 16383 >> 14;
                  this.anIntArray9059[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = Class443.anIntArray4895[var3];
                  var7 = Class443.anIntArray4896[var3];
                  var8 = this.anIntArray9091[var5] * var10 + this.anIntArray9058[var5] * var7 + 16383 >> 14;
                  this.anIntArray9091[var5] = this.anIntArray9091[var5] * var7 - this.anIntArray9058[var5] * var10 + 16383 >> 14;
                  this.anIntArray9058[var5] = var8;
               }

               this.anIntArray9058[var5] += anInt9101;
               this.anIntArray9059[var5] += anInt9115;
               this.anIntArray9091[var5] += anInt9116;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.anInt9060; ++var5) {
               this.anIntArray9058[var5] -= anInt9101;
               this.anIntArray9059[var5] -= anInt9115;
               this.anIntArray9091[var5] -= anInt9116;
               this.anIntArray9058[var5] = this.anIntArray9058[var5] * var2 / 128;
               this.anIntArray9059[var5] = this.anIntArray9059[var5] * var3 / 128;
               this.anIntArray9091[var5] = this.anIntArray9091[var5] * var4 / 128;
               this.anIntArray9058[var5] += anInt9101;
               this.anIntArray9059[var5] += anInt9115;
               this.anIntArray9091[var5] += anInt9116;
            }

         } else {
            Class147 var11;
            Class137 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt9071; ++var5) {
                  var10 = (this.aByteArray9074[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.aByteArray9074[var5] = (byte)var10;
               }

               if(this.aClass129_9044 != null) {
                  this.aClass129_9044.anInterface15_1612 = null;
               }

               if(this.aClass147Array9043 != null) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var11 = this.aClass147Array9043[var5];
                     var12 = this.aClass137Array9104[var5];
                     var12.anInt1653 = var12.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var11.anInt1703] & 255) << 24;
                  }
               }

            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt9071; ++var5) {
                  var10 = this.aShortArray9082[var5] & '\uffff';
                  var7 = var10 >> 10 & 63;
                  var8 = var10 >> 7 & 7;
                  int var9 = var10 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.aShortArray9082[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if(this.aClass129_9044 != null) {
                  this.aClass129_9044.anInterface15_1612 = null;
               }

               if(this.aClass147Array9043 != null) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var11 = this.aClass147Array9043[var5];
                     var12 = this.aClass137Array9104[var5];
                     var12.anInt1653 = var12.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var11.anInt1703] & '\uffff'] & 16777215;
                  }
               }

            } else {
               Class137 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var6 = this.aClass137Array9104[var5];
                     var6.anInt1654 += var2;
                     var6.anInt1655 += var3;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var6 = this.aClass137Array9104[var5];
                     var6.anInt1651 = var6.anInt1651 * var2 >> 7;
                     var6.anInt1652 = var6.anInt1652 * var3 >> 7;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt9105; ++var5) {
                     var6 = this.aClass137Array9104[var5];
                     var6.anInt1656 = var6.anInt1656 + var2 & 16383;
                  }

               }
            }
         }
      }
   }

   public void method1955(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 0) {
            this.anIntArray9058[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9059[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9091[var4] += var3;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2046(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9062 != null) {
         Class445 var4 = var1;
         if(var3) {
            var4 = this.aClass174_Sub2_9048.aClass445_9557;
            var4.method5223(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt9060; ++var6) {
            if((var2 & this.aShortArray9062[var6]) != 0) {
               var4.method5233((float)this.anIntArray9058[var6], (float)this.anIntArray9059[var6], (float)this.anIntArray9091[var6], var5);
               this.anIntArray9058[var6] = (int)var5[0];
               this.anIntArray9059[var6] = (int)var5[1];
               this.anIntArray9091[var6] = (int)var5[2];
            }
         }

      }
   }

   public void method1995(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9062 != null) {
         Class445 var4 = var1;
         if(var3) {
            var4 = this.aClass174_Sub2_9048.aClass445_9557;
            var4.method5223(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt9060; ++var6) {
            if((var2 & this.aShortArray9062[var6]) != 0) {
               var4.method5233((float)this.anIntArray9058[var6], (float)this.anIntArray9059[var6], (float)this.anIntArray9091[var6], var5);
               this.anIntArray9058[var6] = (int)var5[0];
               this.anIntArray9059[var6] = (int)var5[1];
               this.anIntArray9091[var6] = (int)var5[2];
            }
         }

      }
   }

   public void method2048(Class445 var1, Class164 var2, int var3) {
      if((var3 & 2) != 0) {
         OpenGL.glPolygonMode(1032, 6913);
      }

      if(this.anInt9063 != 0) {
         Class433 var4 = this.aClass174_Sub2_9048.aClass433_9544;
         Class433 var5 = this.aClass174_Sub2_9048.aClass433_9558;
         Class433 var6 = this.aClass174_Sub2_9048.aClass433_9559;
         var5.method5110(var1);
         var6.method5083(var5);
         var6.method5085(this.aClass174_Sub2_9048.aClass433_9546);
         if(!this.aBool9072) {
            this.method8426();
         }

         float[] var7 = this.aClass174_Sub2_9048.aFloatArray9468;
         var5.method5089(0.0F, (float)this.aShort9093, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method5089(0.0F, (float)this.aShort9067, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var16;
         float var17;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.aClass174_Sub2_9048.aFloatArrayArray9547[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.anInt9090;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.anInt9090;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.aShort9051 + this.aShort9095 >> 1;
            int var21 = this.aShort9096 + this.aShort9097 >> 1;
            short var23 = this.aShort9093;
            float var33 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var34 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            var16 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            var17 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var16 >= -var17) {
               var2.anInt1789 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var33 / var17);
               var2.anInt1786 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var34 / var17);
            } else {
               var18 = true;
            }

            var23 = this.aShort9067;
            float var25 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var26 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            float var27 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            float var28 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var27 >= -var28) {
               var2.anInt1785 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var25 / var28);
               var2.anInt1788 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var26 / var28);
            } else {
               var18 = true;
            }

            float var29;
            float var30;
            if(var18) {
               if(var16 < -var17 && var27 < -var28) {
                  var19 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var33 + var29 * (var25 - var33);
                     var31 = var34 + var29 * (var26 - var34);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.anInt1789 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var32);
                     var2.anInt1786 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var33 - var25);
                     var31 = var26 + var29 * (var34 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.anInt1785 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var32);
                     var2.anInt1788 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var32);
                  }
               }
            }

            if(var19) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var33 + var4.aFloatArray4841[0] * (float)this.anInt9090 + var4.aFloatArray4841[12];
                  var30 = var17 + var4.aFloatArray4841[3] * (float)this.anInt9090 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub2_9048.aFloat9549 - (float)var2.anInt1789 + this.aClass174_Sub2_9048.aFloat9550 * var29 / var30);
               } else {
                  var29 = var25 + var4.aFloatArray4841[0] * (float)this.anInt9090 + var4.aFloatArray4841[12];
                  var30 = var28 + var4.aFloatArray4841[3] * (float)this.anInt9090 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub2_9048.aFloat9549 - (float)var2.anInt1785 + this.aClass174_Sub2_9048.aFloat9550 * var29 / var30);
               }

               var2.aBool1784 = true;
            }
         }

         this.aClass174_Sub2_9048.method8638();
         this.aClass174_Sub2_9048.method8688(var5);
         this.method8413();
         this.aClass174_Sub2_9048.method8611();
         var5.method5085(this.aClass174_Sub2_9048.aClass433_9496);
         this.method8418(var5);
         if((var3 & 2) != 0) {
            OpenGL.glPolygonMode(1028, 6914);
         }

      }
   }

   public boolean method2116(int var1, int var2, Class445 var3, boolean var4, int var5) {
      Class433 var6 = this.aClass174_Sub2_9048.aClass433_9558;
      var6.method5110(var3);
      var6.method5085(this.aClass174_Sub2_9048.aClass433_9546);
      boolean var7 = false;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;
      int var10 = Integer.MAX_VALUE;
      int var11 = Integer.MIN_VALUE;
      if(!this.aBool9072) {
         this.method8426();
      }

      int var12 = this.aShort9095 - this.aShort9051 >> 1;
      int var13 = this.aShort9067 - this.aShort9093 >> 1;
      int var14 = this.aShort9097 - this.aShort9096 >> 1;
      int var15 = this.aShort9051 + var12;
      int var16 = this.aShort9093 + var13;
      int var17 = this.aShort9096 + var14;
      int var18 = var15 - (var12 << var5);
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var15 + (var12 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      anIntArray9111[0] = var18;
      anIntArray9112[0] = var19;
      anIntArray9113[0] = var20;
      anIntArray9111[1] = var21;
      anIntArray9112[1] = var19;
      anIntArray9113[1] = var20;
      anIntArray9111[2] = var18;
      anIntArray9112[2] = var22;
      anIntArray9113[2] = var20;
      anIntArray9111[3] = var21;
      anIntArray9112[3] = var22;
      anIntArray9113[3] = var20;
      anIntArray9111[4] = var18;
      anIntArray9112[4] = var19;
      anIntArray9113[4] = var23;
      anIntArray9111[5] = var21;
      anIntArray9112[5] = var19;
      anIntArray9113[5] = var23;
      anIntArray9111[6] = var18;
      anIntArray9112[6] = var22;
      anIntArray9113[6] = var23;
      anIntArray9111[7] = var21;
      anIntArray9112[7] = var22;
      anIntArray9113[7] = var23;

      int var25;
      int var26;
      int var27;
      float var28;
      float var29;
      float var30;
      float var31;
      int var33;
      for(int var24 = 0; var24 < 8; ++var24) {
         var25 = anIntArray9111[var24];
         var26 = anIntArray9112[var24];
         var27 = anIntArray9113[var24];
         var28 = var6.aFloatArray4841[2] * (float)var25 + var6.aFloatArray4841[6] * (float)var26 + var6.aFloatArray4841[10] * (float)var27 + var6.aFloatArray4841[14];
         var29 = var6.aFloatArray4841[3] * (float)var25 + var6.aFloatArray4841[7] * (float)var26 + var6.aFloatArray4841[11] * (float)var27 + var6.aFloatArray4841[15];
         if(var28 >= -var29) {
            var30 = var6.aFloatArray4841[0] * (float)var25 + var6.aFloatArray4841[4] * (float)var26 + var6.aFloatArray4841[8] * (float)var27 + var6.aFloatArray4841[12];
            var31 = var6.aFloatArray4841[1] * (float)var25 + var6.aFloatArray4841[5] * (float)var26 + var6.aFloatArray4841[9] * (float)var27 + var6.aFloatArray4841[13];
            int var32 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var29);
            var33 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var29);
            if(var32 < var8) {
               var8 = var32;
            }

            if(var32 > var9) {
               var9 = var32;
            }

            if(var33 < var10) {
               var10 = var33;
            }

            if(var33 > var11) {
               var11 = var33;
            }

            var7 = true;
         }
      }

      if(var7 && var1 > var8 && var1 < var9 && var2 > var10 && var2 < var11) {
         if(var4) {
            return true;
         }

         if(this.aClass174_Sub2_9048.anIntArray9656.length < this.anInt9063) {
            this.aClass174_Sub2_9048.anIntArray9656 = new int[this.anInt9063];
            this.aClass174_Sub2_9048.anIntArray9506 = new int[this.anInt9063];
         }

         int[] var38 = this.aClass174_Sub2_9048.anIntArray9656;
         int[] var39 = this.aClass174_Sub2_9048.anIntArray9506;

         for(var33 = 0; var33 < this.anInt9060; ++var33) {
            var25 = this.anIntArray9058[var33];
            var26 = this.anIntArray9059[var33];
            var27 = this.anIntArray9091[var33];
            var28 = var6.aFloatArray4841[2] * (float)var25 + var6.aFloatArray4841[6] * (float)var26 + var6.aFloatArray4841[10] * (float)var27 + var6.aFloatArray4841[14];
            var29 = var6.aFloatArray4841[3] * (float)var25 + var6.aFloatArray4841[7] * (float)var26 + var6.aFloatArray4841[11] * (float)var27 + var6.aFloatArray4841[15];
            int var34;
            int var35;
            int var36;
            int var37;
            if(var28 >= -var29) {
               var30 = var6.aFloatArray4841[0] * (float)var25 + var6.aFloatArray4841[4] * (float)var26 + var6.aFloatArray4841[8] * (float)var27 + var6.aFloatArray4841[12];
               var31 = var6.aFloatArray4841[1] * (float)var25 + var6.aFloatArray4841[5] * (float)var26 + var6.aFloatArray4841[9] * (float)var27 + var6.aFloatArray4841[13];
               var34 = this.anIntArray9092[var33];
               var35 = this.anIntArray9092[var33 + 1];

               for(var36 = var34; var36 < var35 && this.aShortArray9102[var36] != 0; ++var36) {
                  var37 = (this.aShortArray9102[var36] & '\uffff') - 1;
                  var38[var37] = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var29);
                  var39[var37] = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var29);
               }
            } else {
               var34 = this.anIntArray9092[var33];
               var35 = this.anIntArray9092[var33 + 1];

               for(var36 = var34; var36 < var35 && this.aShortArray9102[var36] != 0; ++var36) {
                  var37 = (this.aShortArray9102[var36] & '\uffff') - 1;
                  var38[var37] = -999999;
               }
            }
         }

         for(var33 = 0; var33 < this.anInt9071; ++var33) {
            if(var38[this.aShortArray9075[var33] & '\uffff'] != -999999 && var38[this.aShortArray9076[var33] & '\uffff'] != -999999 && var38[this.aShortArray9077[var33] & '\uffff'] != -999999 && this.method8416(var1, var2, var39[this.aShortArray9075[var33] & '\uffff'], var39[this.aShortArray9076[var33] & '\uffff'], var39[this.aShortArray9077[var33] & '\uffff'], var38[this.aShortArray9075[var33] & '\uffff'], var38[this.aShortArray9076[var33] & '\uffff'], var38[this.aShortArray9077[var33] & '\uffff'])) {
               return true;
            }
         }
      }

      return false;
   }

   public Class526_Sub21_Sub5 method2052(Class526_Sub21_Sub5 var1) {
      if(this.anInt9063 == 0) {
         return null;
      } else {
         if(!this.aBool9072) {
            this.method8426();
         }

         int var2;
         int var3;
         if(this.aClass174_Sub2_9048.anInt9591 > 0) {
            var2 = this.aShort9051 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var3 = this.aShort9095 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         } else {
            var2 = this.aShort9051 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var3 = this.aShort9095 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         }

         int var4;
         int var5;
         if(this.aClass174_Sub2_9048.anInt9566 > 0) {
            var4 = this.aShort9096 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var5 = this.aShort9097 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         } else {
            var4 = this.aShort9096 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var5 = this.aShort9097 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         Class526_Sub21_Sub5_Sub2 var8 = (Class526_Sub21_Sub5_Sub2)var1;
         Class526_Sub21_Sub5_Sub2 var9;
         if(var8 != null && var8.method10908(var6, var7)) {
            var9 = var8;
            var8.method10898();
         } else {
            var9 = new Class526_Sub21_Sub5_Sub2(this.aClass174_Sub2_9048, var6, var7);
         }

         var9.method10897(var2, var4, var3, var5);
         this.method8417(var9);
         return var9;
      }
   }

   public Class526_Sub21_Sub5 method2060(Class526_Sub21_Sub5 var1) {
      if(this.anInt9063 == 0) {
         return null;
      } else {
         if(!this.aBool9072) {
            this.method8426();
         }

         int var2;
         int var3;
         if(this.aClass174_Sub2_9048.anInt9591 > 0) {
            var2 = this.aShort9051 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var3 = this.aShort9095 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         } else {
            var2 = this.aShort9051 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var3 = this.aShort9095 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9591 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         }

         int var4;
         int var5;
         if(this.aClass174_Sub2_9048.anInt9566 > 0) {
            var4 = this.aShort9096 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var5 = this.aShort9097 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         } else {
            var4 = this.aShort9096 - (this.aShort9093 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
            var5 = this.aShort9097 - (this.aShort9067 * this.aClass174_Sub2_9048.anInt9566 >> 8) >> this.aClass174_Sub2_9048.anInt9662;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         Class526_Sub21_Sub5_Sub2 var8 = (Class526_Sub21_Sub5_Sub2)var1;
         Class526_Sub21_Sub5_Sub2 var9;
         if(var8 != null && var8.method10908(var6, var7)) {
            var9 = var8;
            var8.method10898();
         } else {
            var9 = new Class526_Sub21_Sub5_Sub2(this.aClass174_Sub2_9048, var6, var7);
         }

         var9.method10897(var2, var4, var3, var5);
         this.method8417(var9);
         return var9;
      }
   }

   public void method2054() {
      if(!this.aBool9041) {
         if(!this.aBool9072) {
            this.method8426();
         }

         this.aShort9099 = this.aShort9093;
         this.aBool9041 = true;
      }

   }

   public void method2055() {
      if(!this.aBool9041) {
         if(!this.aBool9072) {
            this.method8426();
         }

         this.aShort9099 = this.aShort9093;
         this.aBool9041 = true;
      }

   }

   public void method2056() {
      if(!this.aBool9041) {
         if(!this.aBool9072) {
            this.method8426();
         }

         this.aShort9099 = this.aShort9093;
         this.aBool9041 = true;
      }

   }

   public int method2057() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.anInt9090;
   }

   public void method1967(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.anInt9060; ++var4) {
         var5 = this.anIntArray9091[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      for(var4 = 0; var4 < this.anInt9063; ++var4) {
         var5 = this.aShortArray9094[var4] * var2 + this.aShortArray9064[var4] * var3 >> 14;
         this.aShortArray9094[var4] = (short)(this.aShortArray9094[var4] * var3 - this.aShortArray9064[var4] * var2 >> 14);
         this.aShortArray9064[var4] = (short)var5;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method1987(int var1) {
      this.aShort9056 = (short)var1;
      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public int method2059() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.anInt9107;
   }

   public int method2042() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.anInt9107;
   }

   public void method1974(Class445 var1, Class164 var2, int var3) {
      if((var3 & 2) != 0) {
         OpenGL.glPolygonMode(1032, 6913);
      }

      if(this.anInt9063 != 0) {
         Class433 var4 = this.aClass174_Sub2_9048.aClass433_9544;
         Class433 var5 = this.aClass174_Sub2_9048.aClass433_9558;
         Class433 var6 = this.aClass174_Sub2_9048.aClass433_9559;
         var5.method5110(var1);
         var6.method5083(var5);
         var6.method5085(this.aClass174_Sub2_9048.aClass433_9546);
         if(!this.aBool9072) {
            this.method8426();
         }

         float[] var7 = this.aClass174_Sub2_9048.aFloatArray9468;
         var5.method5089(0.0F, (float)this.aShort9093, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method5089(0.0F, (float)this.aShort9067, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var16;
         float var17;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.aClass174_Sub2_9048.aFloatArrayArray9547[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.anInt9090;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.anInt9090;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.aShort9051 + this.aShort9095 >> 1;
            int var21 = this.aShort9096 + this.aShort9097 >> 1;
            short var23 = this.aShort9093;
            float var33 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var34 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            var16 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            var17 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var16 >= -var17) {
               var2.anInt1789 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var33 / var17);
               var2.anInt1786 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var34 / var17);
            } else {
               var18 = true;
            }

            var23 = this.aShort9067;
            float var25 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var26 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            float var27 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            float var28 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var27 >= -var28) {
               var2.anInt1785 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var25 / var28);
               var2.anInt1788 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var26 / var28);
            } else {
               var18 = true;
            }

            float var29;
            float var30;
            if(var18) {
               if(var16 < -var17 && var27 < -var28) {
                  var19 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var33 + var29 * (var25 - var33);
                     var31 = var34 + var29 * (var26 - var34);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.anInt1789 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var32);
                     var2.anInt1786 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var33 - var25);
                     var31 = var26 + var29 * (var34 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.anInt1785 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var32);
                     var2.anInt1788 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var32);
                  }
               }
            }

            if(var19) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var33 + var4.aFloatArray4841[0] * (float)this.anInt9090 + var4.aFloatArray4841[12];
                  var30 = var17 + var4.aFloatArray4841[3] * (float)this.anInt9090 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub2_9048.aFloat9549 - (float)var2.anInt1789 + this.aClass174_Sub2_9048.aFloat9550 * var29 / var30);
               } else {
                  var29 = var25 + var4.aFloatArray4841[0] * (float)this.anInt9090 + var4.aFloatArray4841[12];
                  var30 = var28 + var4.aFloatArray4841[3] * (float)this.anInt9090 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub2_9048.aFloat9549 - (float)var2.anInt1785 + this.aClass174_Sub2_9048.aFloat9550 * var29 / var30);
               }

               var2.aBool1784 = true;
            }
         }

         this.aClass174_Sub2_9048.method8638();
         this.aClass174_Sub2_9048.method8688(var5);
         this.method8413();
         this.aClass174_Sub2_9048.method8611();
         var5.method5085(this.aClass174_Sub2_9048.aClass433_9496);
         this.method8418(var5);
         if((var3 & 2) != 0) {
            OpenGL.glPolygonMode(1028, 6914);
         }

      }
   }

   Class168_Sub1(Class174_Sub2 var1, Class170 var2, int var3, int var4, int var5, int var6) {
      this.aClass174_Sub2_9048 = var1;
      this.anInt9117 = var3;
      this.anInt9050 = var6;
      if(Class127.method1560(var3, var6)) {
         this.aClass129_9081 = new Class129((Interface15)null, 5126, 3, 0);
      }

      if(Class127.method1537(var3, var6)) {
         this.aClass129_9114 = new Class129((Interface15)null, 5126, 2, 0);
      }

      if(Class127.method1535(var3, var6)) {
         this.aClass129_9083 = new Class129((Interface15)null, 5126, 3, 0);
      }

      if(Class127.method1536(var3, var6)) {
         this.aClass129_9044 = new Class129((Interface15)null, 5121, 4, 0);
      }

      if(Class127.method1567(var3, var6)) {
         this.aClass136_9085 = new Class136();
      }

      Class169 var7 = var1.aClass169_2035;
      Interface47 var8 = var1.anInterface47_2036;
      int[] var9 = new int[var2.anInt1929];
      this.anIntArray9092 = new int[var2.anInt1919 + 1];

      for(int var10 = 0; var10 < var2.anInt1929; ++var10) {
         if(var2.aByteArray1936 == null || var2.aByteArray1936[var10] != 2) {
            if(var2.aShortArray1941 != null && var2.aShortArray1941[var10] != -1) {
               Class171 var11 = var7.method2122(var2.aShortArray1941[var10] & '\uffff', (byte)28);
               if(((this.anInt9050 & 64) == 0 || !var11.aBool1981) && var11.aBool2010) {
                  continue;
               }
            }

            var9[this.anInt9071++] = var10;
            ++this.anIntArray9092[var2.aShortArray1930[var10]];
            ++this.anIntArray9092[var2.aShortArray1931[var10]];
            ++this.anIntArray9092[var2.aShortArray1932[var10]];
         }
      }

      this.anInt9098 = this.anInt9071;
      long[] var80 = new long[this.anInt9071];
      boolean var81 = (this.anInt9117 & 256) != 0;

      int var13;
      int var15;
      int var20;
      int var85;
      short var92;
      for(int var12 = 0; var12 < this.anInt9071; ++var12) {
         var13 = var9[var12];
         Class171 var14 = null;
         var15 = 0;
         byte var16 = 0;
         byte var17 = 0;
         byte var18 = 0;
         boolean var19;
         if(var2.aClass185Array1962 != null) {
            var19 = false;

            for(var20 = 0; var20 < var2.aClass185Array1962.length; ++var20) {
               Class185 var21 = var2.aClass185Array1962[var20];
               if(var13 == var21.anInt2119 * 900019051) {
                  Class386 var22 = var8.method352(var21.anInt2121 * 1134790901, 1970717945);
                  if(var22.aBool4046) {
                     var19 = true;
                  }

                  if(var22.anInt4040 * 781750353 != -1) {
                     Class171 var23 = var7.method2122(var22.anInt4040 * 781750353, (byte)-35);
                     if(var23.aClass593_1982 == Class593.aClass593_7815) {
                        this.aBool9054 = true;
                     }
                  }
               }
            }

            if(var19) {
               var80[var12] = Long.MAX_VALUE;
               --this.anInt9098;
               continue;
            }
         }

         if(var2.aClass182Array1960 != null) {
            var19 = false;

            for(var20 = 0; var20 < var2.aClass182Array1960.length; ++var20) {
               Class182 var94 = var2.aClass182Array1960[var20];
               if(var13 == var94.anInt2081 * -664328139) {
                  Class385 var99 = this.aClass174_Sub2_9048.anInterface49_2040.method353(var94.anInt2082 * 274808845, (byte)1);
                  if(var99.aBool4012) {
                     var19 = true;
                  }
               }
            }

            if(var19) {
               var80[var12] = Long.MAX_VALUE;
               --this.anInt9098;
               continue;
            }
         }

         var92 = -1;
         if(var2.aShortArray1941 != null) {
            var92 = var2.aShortArray1941[var13];
            if(var92 != -1) {
               var14 = var7.method2122(var92 & '\uffff', (byte)-42);
               if((this.anInt9050 & 64) != 0 && var14.aBool1981) {
                  var92 = -1;
                  var14 = null;
               } else {
                  var17 = var14.aByte1966;
                  var18 = var14.aByte1970;
                  if(var14.aByte1986 != 0 || var14.aByte1963 != 0) {
                     this.aBool9055 = true;
                  }
               }
            }
         }

         boolean var93 = var2.aByteArray1938 != null && var2.aByteArray1938[var13] != 0 || var14 != null && var14.aClass593_1982 != Class593.aClass593_7817;
         if((var81 || var93) && var2.aByteArray1937 != null) {
            var15 += var2.aByteArray1937[var13] << 17;
         }

         if(var93) {
            var15 += 65536;
         }

         var15 += (var17 & 255) << 8;
         var15 += var18 & 255;
         var85 = var16 + ((var92 & '\uffff') << 16);
         var85 += var12 & '\uffff';
         var80[var12] = ((long)var15 << 32) + (long)var85;
         this.aBool9054 |= var93;
         this.aBool9055 |= var14 != null && (var14.aByte1986 != 0 || var14.aByte1963 != 0);
      }

      Class569.method6839(var80, var9, -1891332186);
      this.anInt9046 = var2.anInt1918;
      this.anInt9060 = var2.anInt1919;
      this.anIntArray9058 = var2.anIntArray1920;
      this.anIntArray9059 = var2.anIntArray1921;
      this.anIntArray9091 = var2.anIntArray1939;
      this.aShortArray9062 = var2.aShortArray1925;
      Class125[] var82 = new Class125[this.anInt9060];
      this.aClass182Array9066 = var2.aClass182Array1960;
      this.aClass141Array9057 = var2.aClass141Array1961;
      int var87;
      if(var2.aClass185Array1962 != null) {
         this.anInt9105 = var2.aClass185Array1962.length;
         this.aClass147Array9043 = new Class147[this.anInt9105];
         this.aClass137Array9104 = new Class137[this.anInt9105];

         for(var13 = 0; var13 < this.anInt9105; ++var13) {
            Class185 var83 = var2.aClass185Array1962[var13];
            Class386 var86 = var8.method352(var83.anInt2121 * 1134790901, 1952006112);
            var85 = -1;

            for(var87 = 0; var87 < this.anInt9071; ++var87) {
               if(var9[var87] == var83.anInt2119 * 900019051) {
                  var85 = var87;
                  break;
               }
            }

            if(var85 == -1) {
               throw new RuntimeException();
            }

            var87 = Class661.anIntArray8516[var2.aShortArray1940[var83.anInt2119 * 900019051] & '\uffff'] & 16777215;
            var87 |= 255 - (var2.aByteArray1938 != null?var2.aByteArray1938[var83.anInt2119 * 900019051]:0) << 24;
            this.aClass147Array9043[var13] = new Class147(var85, var2.aShortArray1930[var83.anInt2119 * 900019051], var2.aShortArray1931[var83.anInt2119 * 900019051], var2.aShortArray1932[var83.anInt2119 * 900019051], var86.anInt4041 * 511067987, var86.anInt4039 * -1102518277, var86.anInt4040 * 781750353, var86.anInt4043 * 580363603, var86.anInt4042 * 992174873, var86.aBool4046, var86.aBool4045, var83.anInt2118 * 641681561);
            this.aClass137Array9104[var13] = new Class137(var87);
         }
      }

      var13 = this.anInt9071 * 3;
      this.aShortArray9064 = new short[var13];
      this.aShortArray9065 = new short[var13];
      this.aShortArray9094 = new short[var13];
      this.aByteArray9061 = new byte[var13];
      this.aFloatArray9069 = new float[var13];
      this.aFloatArray9070 = new float[var13];
      this.aShortArray9082 = new short[this.anInt9071];
      this.aByteArray9074 = new byte[this.anInt9071];
      this.aShortArray9075 = new short[this.anInt9071];
      this.aShortArray9076 = new short[this.anInt9071];
      this.aShortArray9077 = new short[this.anInt9071];
      this.aShortArray9078 = new short[this.anInt9071];
      if(var2.aShortArray1917 != null) {
         this.aShortArray9080 = new short[this.anInt9071];
      }

      this.aShort9056 = (short)var4;
      this.aShort9053 = (short)var5;
      this.aShortArray9102 = new short[var13];
      aLongArray9109 = new long[var13];
      int var84 = 0;

      for(var15 = 0; var15 < var2.anInt1919; ++var15) {
         var85 = this.anIntArray9092[var15];
         this.anIntArray9092[var15] = var84;
         var84 += var85;
         var82[var15] = new Class125();
      }

      this.anIntArray9092[var2.anInt1919] = var84;
      Class180 var88 = this.method1945(var2, var9, this.anInt9071);
      Class134[] var89 = new Class134[var2.anInt1929];

      short var90;
      short var95;
      int var96;
      int var100;
      for(var87 = 0; var87 < var2.anInt1929; ++var87) {
         var90 = var2.aShortArray1930[var87];
         var92 = var2.aShortArray1931[var87];
         var95 = var2.aShortArray1932[var87];
         var96 = this.anIntArray9058[var92] - this.anIntArray9058[var90];
         var100 = this.anIntArray9059[var92] - this.anIntArray9059[var90];
         int var102 = this.anIntArray9091[var92] - this.anIntArray9091[var90];
         int var24 = this.anIntArray9058[var95] - this.anIntArray9058[var90];
         int var25 = this.anIntArray9059[var95] - this.anIntArray9059[var90];
         int var26 = this.anIntArray9091[var95] - this.anIntArray9091[var90];
         int var27 = var100 * var26 - var25 * var102;
         int var28 = var102 * var24 - var26 * var96;

         int var29;
         for(var29 = var96 * var25 - var24 * var100; var27 > 8192 || var28 > 8192 || var29 > 8192 || var27 < -8192 || var28 < -8192 || var29 < -8192; var29 >>= 1) {
            var27 >>= 1;
            var28 >>= 1;
         }

         int var30 = (int)Math.sqrt((double)(var27 * var27 + var28 * var28 + var29 * var29));
         if(var30 <= 0) {
            var30 = 1;
         }

         var27 = var27 * 256 / var30;
         var28 = var28 * 256 / var30;
         var29 = var29 * 256 / var30;
         byte var31 = var2.aByteArray1936 == null?0:var2.aByteArray1936[var87];
         if(var31 == 0) {
            Class125 var32 = var82[var90];
            var32.anInt1596 += var27;
            var32.anInt1594 += var28;
            var32.anInt1595 += var29;
            ++var32.anInt1597;
            var32 = var82[var92];
            var32.anInt1596 += var27;
            var32.anInt1594 += var28;
            var32.anInt1595 += var29;
            ++var32.anInt1597;
            var32 = var82[var95];
            var32.anInt1596 += var27;
            var32.anInt1594 += var28;
            var32.anInt1595 += var29;
            ++var32.anInt1597;
         } else if(var31 == 1) {
            Class134 var107 = var89[var87] = new Class134();
            var107.anInt1638 = var27;
            var107.anInt1639 = var28;
            var107.anInt1640 = var29;
         }
      }

      int var97;
      for(var87 = 0; var87 < this.anInt9071; ++var87) {
         int var91 = var9[var87];
         var97 = var2.aShortArray1940[var91] & '\uffff';
         var20 = var2.aByteArray1938 != null?var2.aByteArray1938[var91] & 255:0;
         short var98 = var2.aShortArray1941 == null?-1:var2.aShortArray1941[var91];
         if(var98 != -1 && (this.anInt9050 & 64) != 0 && var7.method2122(var98, (byte)-83).aBool1981) {
            var98 = -1;
         }

         float var103 = 0.0F;
         float var104 = 0.0F;
         float var105 = 0.0F;
         float var106 = 0.0F;
         float var108 = 0.0F;
         float var33 = 0.0F;
         long var38;
         long var40;
         long var42;
         short var45;
         if(var98 != -1) {
            short var34 = var2.aShortArray1943 != null?var2.aShortArray1943[var91]:-1;
            int var35;
            if(var34 == 32766) {
               var35 = var2.aByteArray1933[var91] & 255;
               int var36 = var2.aByteArray1934[var91] & 255;
               int var37 = var2.aByteArray1952[var91] & 255;
               var35 += var2.anIntArray1923[var2.aShortArray1930[var91]];
               var38 = (long)var35;
               var36 += var2.anIntArray1923[var2.aShortArray1931[var91]];
               var40 = (long)var35;
               var37 += var2.anIntArray1923[var2.aShortArray1932[var91]];
               var42 = (long)var35;
               var103 = var2.aFloatArray1914[var35];
               var104 = var2.aFloatArray1928[var35];
               var105 = var2.aFloatArray1914[var36];
               var106 = var2.aFloatArray1928[var36];
               var108 = var2.aFloatArray1914[var37];
               var33 = var2.aFloatArray1928[var37];
            } else if(var34 == -1) {
               var103 = 0.0F;
               var104 = 1.0F;
               var38 = 65535L;
               var105 = 1.0F;
               var106 = 1.0F;
               var40 = 131071L;
               var108 = 0.0F;
               var33 = 0.0F;
               var42 = 196607L;
            } else {
               int var109 = var34 & '\uffff';
               var35 = 0;
               byte var111 = 0;
               byte var113 = 0;
               byte var44 = var2.aByteArray1948[var109];
               short var46;
               short var47;
               float var53;
               float var54;
               float var55;
               float var65;
               float var66;
               float var67;
               float var68;
               float var69;
               float var70;
               if(var44 == 0) {
                  var45 = var2.aShortArray1930[var91];
                  var46 = var2.aShortArray1931[var91];
                  var47 = var2.aShortArray1932[var91];
                  short var48 = var2.aShortArray1944[var109];
                  short var49 = var2.aShortArray1927[var109];
                  short var50 = var2.aShortArray1953[var109];
                  float var51 = (float)var2.anIntArray1920[var48];
                  float var52 = (float)var2.anIntArray1921[var48];
                  var53 = (float)var2.anIntArray1939[var48];
                  var54 = (float)var2.anIntArray1920[var49] - var51;
                  var55 = (float)var2.anIntArray1921[var49] - var52;
                  float var56 = (float)var2.anIntArray1939[var49] - var53;
                  float var57 = (float)var2.anIntArray1920[var50] - var51;
                  float var58 = (float)var2.anIntArray1921[var50] - var52;
                  float var59 = (float)var2.anIntArray1939[var50] - var53;
                  float var60 = (float)var2.anIntArray1920[var45] - var51;
                  float var61 = (float)var2.anIntArray1921[var45] - var52;
                  float var62 = (float)var2.anIntArray1939[var45] - var53;
                  float var63 = (float)var2.anIntArray1920[var46] - var51;
                  float var64 = (float)var2.anIntArray1921[var46] - var52;
                  var65 = (float)var2.anIntArray1939[var46] - var53;
                  var66 = (float)var2.anIntArray1920[var47] - var51;
                  var67 = (float)var2.anIntArray1921[var47] - var52;
                  var68 = (float)var2.anIntArray1939[var47] - var53;
                  var69 = var55 * var59 - var56 * var58;
                  var70 = var56 * var57 - var54 * var59;
                  float var71 = var54 * var58 - var55 * var57;
                  float var72 = var58 * var71 - var59 * var70;
                  float var73 = var59 * var69 - var57 * var71;
                  float var74 = var57 * var70 - var58 * var69;
                  float var75 = 1.0F / (var72 * var54 + var73 * var55 + var74 * var56);
                  var103 = (var72 * var60 + var73 * var61 + var74 * var62) * var75;
                  var105 = (var72 * var63 + var73 * var64 + var74 * var65) * var75;
                  var108 = (var72 * var66 + var73 * var67 + var74 * var68) * var75;
                  var72 = var55 * var71 - var56 * var70;
                  var73 = var56 * var69 - var54 * var71;
                  var74 = var54 * var70 - var55 * var69;
                  var75 = 1.0F / (var72 * var57 + var73 * var58 + var74 * var59);
                  var104 = (var72 * var60 + var73 * var61 + var74 * var62) * var75;
                  var106 = (var72 * var63 + var73 * var64 + var74 * var65) * var75;
                  var33 = (var72 * var66 + var73 * var67 + var74 * var68) * var75;
               } else {
                  var45 = var2.aShortArray1930[var91];
                  var46 = var2.aShortArray1931[var91];
                  var47 = var2.aShortArray1932[var91];
                  int var117 = var88.anIntArray2075[var109];
                  int var118 = var88.anIntArray2072[var109];
                  int var119 = var88.anIntArray2073[var109];
                  float[] var120 = var88.aFloatArrayArray2074[var109];
                  byte var121 = var2.aByteArray1959[var109];
                  var53 = (float)var2.anIntArray1955[var109] / 256.0F;
                  if(var44 == 1) {
                     var54 = (float)var2.anIntArray1954[var109] / 1024.0F;
                     method1961(var2.anIntArray1920[var45], var2.anIntArray1921[var45], var2.anIntArray1939[var45], var117, var118, var119, var120, var54, var121, var53, aFloatArray9110);
                     var103 = aFloatArray9110[0];
                     var104 = aFloatArray9110[1];
                     method1961(var2.anIntArray1920[var46], var2.anIntArray1921[var46], var2.anIntArray1939[var46], var117, var118, var119, var120, var54, var121, var53, aFloatArray9110);
                     var105 = aFloatArray9110[0];
                     var106 = aFloatArray9110[1];
                     method1961(var2.anIntArray1920[var47], var2.anIntArray1921[var47], var2.anIntArray1939[var47], var117, var118, var119, var120, var54, var121, var53, aFloatArray9110);
                     var108 = aFloatArray9110[0];
                     var33 = aFloatArray9110[1];
                     var55 = var54 / 2.0F;
                     if((var121 & 1) == 0) {
                        if(var105 - var103 > var55) {
                           var105 -= var54;
                           var111 = 1;
                        } else if(var103 - var105 > var55) {
                           var105 += var54;
                           var111 = 2;
                        }

                        if(var108 - var103 > var55) {
                           var108 -= var54;
                           var113 = 1;
                        } else if(var103 - var108 > var55) {
                           var108 += var54;
                           var113 = 2;
                        }
                     } else {
                        if(var106 - var104 > var55) {
                           var106 -= var54;
                           var111 = 1;
                        } else if(var104 - var106 > var55) {
                           var106 += var54;
                           var111 = 2;
                        }

                        if(var33 - var104 > var55) {
                           var33 -= var54;
                           var113 = 1;
                        } else if(var104 - var33 > var55) {
                           var33 += var54;
                           var113 = 2;
                        }
                     }
                  } else if(var44 == 2) {
                     var54 = (float)var2.anIntArray1956[var109] / 256.0F;
                     var55 = (float)var2.anIntArray1957[var109] / 256.0F;
                     int var122 = var2.anIntArray1920[var46] - var2.anIntArray1920[var45];
                     int var123 = var2.anIntArray1921[var46] - var2.anIntArray1921[var45];
                     int var124 = var2.anIntArray1939[var46] - var2.anIntArray1939[var45];
                     int var125 = var2.anIntArray1920[var47] - var2.anIntArray1920[var45];
                     int var126 = var2.anIntArray1921[var47] - var2.anIntArray1921[var45];
                     int var127 = var2.anIntArray1939[var47] - var2.anIntArray1939[var45];
                     int var128 = var123 * var127 - var126 * var124;
                     int var129 = var124 * var125 - var127 * var122;
                     int var130 = var122 * var126 - var125 * var123;
                     var65 = 64.0F / (float)var2.anIntArray1945[var109];
                     var66 = 64.0F / (float)var2.anIntArray1935[var109];
                     var67 = 64.0F / (float)var2.anIntArray1954[var109];
                     var68 = ((float)var128 * var120[0] + (float)var129 * var120[1] + (float)var130 * var120[2]) / var65;
                     var69 = ((float)var128 * var120[3] + (float)var129 * var120[4] + (float)var130 * var120[5]) / var66;
                     var70 = ((float)var128 * var120[6] + (float)var129 * var120[7] + (float)var130 * var120[8]) / var67;
                     var35 = method1943(var68, var69, var70);
                     method1944(var2.anIntArray1920[var45], var2.anIntArray1921[var45], var2.anIntArray1939[var45], var117, var118, var119, var35, var120, var121, var53, var54, var55, aFloatArray9110);
                     var103 = aFloatArray9110[0];
                     var104 = aFloatArray9110[1];
                     method1944(var2.anIntArray1920[var46], var2.anIntArray1921[var46], var2.anIntArray1939[var46], var117, var118, var119, var35, var120, var121, var53, var54, var55, aFloatArray9110);
                     var105 = aFloatArray9110[0];
                     var106 = aFloatArray9110[1];
                     method1944(var2.anIntArray1920[var47], var2.anIntArray1921[var47], var2.anIntArray1939[var47], var117, var118, var119, var35, var120, var121, var53, var54, var55, aFloatArray9110);
                     var108 = aFloatArray9110[0];
                     var33 = aFloatArray9110[1];
                  } else if(var44 == 3) {
                     method2062(var2.anIntArray1920[var45], var2.anIntArray1921[var45], var2.anIntArray1939[var45], var117, var118, var119, var120, var121, var53, aFloatArray9110);
                     var103 = aFloatArray9110[0];
                     var104 = aFloatArray9110[1];
                     method2062(var2.anIntArray1920[var46], var2.anIntArray1921[var46], var2.anIntArray1939[var46], var117, var118, var119, var120, var121, var53, aFloatArray9110);
                     var105 = aFloatArray9110[0];
                     var106 = aFloatArray9110[1];
                     method2062(var2.anIntArray1920[var47], var2.anIntArray1921[var47], var2.anIntArray1939[var47], var117, var118, var119, var120, var121, var53, aFloatArray9110);
                     var108 = aFloatArray9110[0];
                     var33 = aFloatArray9110[1];
                     if((var121 & 1) == 0) {
                        if(var105 - var103 > 0.5F) {
                           --var105;
                           var111 = 1;
                        } else if(var103 - var105 > 0.5F) {
                           ++var105;
                           var111 = 2;
                        }

                        if(var108 - var103 > 0.5F) {
                           --var108;
                           var113 = 1;
                        } else if(var103 - var108 > 0.5F) {
                           ++var108;
                           var113 = 2;
                        }
                     } else {
                        if(var106 - var104 > 0.5F) {
                           --var106;
                           var111 = 1;
                        } else if(var104 - var106 > 0.5F) {
                           ++var106;
                           var111 = 2;
                        }

                        if(var33 - var104 > 0.5F) {
                           --var33;
                           var113 = 1;
                        } else if(var104 - var33 > 0.5F) {
                           ++var33;
                           var113 = 2;
                        }
                     }
                  }
               }

               var38 = (long)(var35 << 16 | var109);
               var40 = (long)(var111 << 19) | var38;
               var42 = (long)(var113 << 19) | var38;
            }
         } else {
            var42 = 0L;
            var40 = 0L;
            var38 = 0L;
         }

         byte var110 = var2.aByteArray1936 != null?var2.aByteArray1936[var91]:0;
         if(var110 == 0) {
            long var76 = (long)((var97 << 8) + var20);
            short var114 = var2.aShortArray1930[var91];
            short var115 = var2.aShortArray1931[var91];
            var45 = var2.aShortArray1932[var91];
            Class125 var116 = var82[var114];
            this.aShortArray9075[var87] = this.method8428(var2, var114, var76 | var38 << 24, var116.anInt1596, var116.anInt1594, var116.anInt1595, var116.anInt1597, var103, var104);
            var116 = var82[var115];
            this.aShortArray9076[var87] = this.method8428(var2, var115, var76 | var40 << 24, var116.anInt1596, var116.anInt1594, var116.anInt1595, var116.anInt1597, var105, var106);
            var116 = var82[var45];
            this.aShortArray9077[var87] = this.method8428(var2, var45, var76 | var42 << 24, var116.anInt1596, var116.anInt1594, var116.anInt1595, var116.anInt1597, var108, var33);
         } else if(var110 == 1) {
            Class134 var112 = var89[var91];
            long var78 = ((long)(var112.anInt1638 & Integer.MIN_VALUE) << 9) + ((long)(var112.anInt1639 + 256) << 32) + ((long)(var112.anInt1640 + 256) << 24) + (long)(var97 << 8) + (long)var20;
            this.aShortArray9075[var87] = this.method8428(var2, var2.aShortArray1930[var91], var78 | var38 << 41, var112.anInt1638, var112.anInt1639, var112.anInt1640, 0, var103, var104);
            this.aShortArray9076[var87] = this.method8428(var2, var2.aShortArray1931[var91], var78 | var38 << 41, var112.anInt1638, var112.anInt1639, var112.anInt1640, 0, var105, var106);
            this.aShortArray9077[var87] = this.method8428(var2, var2.aShortArray1932[var91], var78 | var38 << 41, var112.anInt1638, var112.anInt1639, var112.anInt1640, 0, var108, var33);
         }

         if(var2.aByteArray1938 != null) {
            this.aByteArray9074[var87] = var2.aByteArray1938[var91];
         }

         if(var2.aShortArray1917 != null) {
            this.aShortArray9080[var87] = var2.aShortArray1917[var91];
         }

         this.aShortArray9082[var87] = var2.aShortArray1940[var91];
         this.aShortArray9078[var87] = var98;
      }

      var87 = 0;
      var90 = -10000;

      for(var97 = 0; var97 < this.anInt9098; ++var97) {
         var95 = this.aShortArray9078[var97];
         if(var95 != var90) {
            ++var87;
            var90 = var95;
         }
      }

      this.anIntArray9100 = new int[var87 + 1];
      var87 = 0;
      var90 = -10000;

      for(var97 = 0; var97 < this.anInt9098; ++var97) {
         var95 = this.aShortArray9078[var97];
         if(var95 != var90) {
            this.anIntArray9100[var87++] = var97;
            var90 = var95;
         }
      }

      this.anIntArray9100[var87] = this.anInt9098;
      aLongArray9109 = null;
      this.aShortArray9064 = method8424(this.aShortArray9064, this.anInt9063);
      this.aShortArray9065 = method8424(this.aShortArray9065, this.anInt9063);
      this.aShortArray9094 = method8424(this.aShortArray9094, this.anInt9063);
      this.aByteArray9061 = method8412(this.aByteArray9061, this.anInt9063);
      this.aFloatArray9069 = method8414(this.aFloatArray9069, this.anInt9063);
      this.aFloatArray9070 = method8414(this.aFloatArray9070, this.anInt9063);
      if(var2.anIntArray1924 != null && Class127.method1553(var3, this.anInt9050)) {
         this.anIntArrayArray9084 = var2.method2136(false);
      }

      if(var2.aClass185Array1962 != null && Class127.method1552(var3, this.anInt9050)) {
         this.anIntArrayArray9108 = var2.method2145();
      }

      if(var2.anIntArray1949 != null && Class127.method1540(var3, this.anInt9050)) {
         var97 = 0;
         int[] var101 = new int[256];

         for(var96 = 0; var96 < this.anInt9071; ++var96) {
            var100 = var2.anIntArray1949[var9[var96]];
            if(var100 >= 0) {
               ++var101[var100];
               if(var100 > var97) {
                  var97 = var100;
               }
            }
         }

         this.anIntArrayArray9079 = new int[var97 + 1][];

         for(var96 = 0; var96 <= var97; ++var96) {
            this.anIntArrayArray9079[var96] = new int[var101[var96]];
            var101[var96] = 0;
         }

         for(var96 = 0; var96 < this.anInt9071; ++var96) {
            var100 = var2.anIntArray1949[var9[var96]];
            if(var100 >= 0) {
               this.anIntArrayArray9079[var100][var101[var100]++] = var96;
            }
         }
      }

   }

   public int method2118() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9051;
   }

   public int method1991() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9095;
   }

   public void method2019(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         if(var1 != 0) {
            this.anIntArray9058[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9059[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9091[var4] += var3;
         }
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method1959(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         int var5 = this.anIntArray9059[var4] * var3 - this.anIntArray9091[var4] * var2 >> 14;
         this.anIntArray9091[var4] = this.anIntArray9059[var4] * var2 + this.anIntArray9091[var4] * var3 >> 14;
         this.anIntArray9059[var4] = var5;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public boolean method2100() {
      return this.aBool9054;
   }

   static short[] method8424(short[] var0, int var1) {
      short[] var2 = new short[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public int method1941() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9067;
   }

   public int method2070() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9097;
   }

   public int method2071() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9097;
   }

   void method8425(boolean var1) {
      if(this.aClass174_Sub2_9048.aClass526_Sub36_Sub1_9655.buffer.length < this.anInt9098 * 6) {
         this.aClass174_Sub2_9048.aClass526_Sub36_Sub1_9655 = new Class526_Sub36_Sub1((this.anInt9098 + 100) * 6);
      } else {
         this.aClass174_Sub2_9048.aClass526_Sub36_Sub1_9655.pos = 0;
      }

      Class526_Sub36_Sub1 var2 = this.aClass174_Sub2_9048.aClass526_Sub36_Sub1_9655;
      int var3;
      if(this.aClass174_Sub2_9048.aBool9508) {
         for(var3 = 0; var3 < this.anInt9098; ++var3) {
            var2.writeShort(this.aShortArray9075[var3], -805078716);
            var2.writeShort(this.aShortArray9076[var3], -805078716);
            var2.writeShort(this.aShortArray9077[var3], -805078716);
         }
      } else {
         for(var3 = 0; var3 < this.anInt9098; ++var3) {
            var2.method9610(this.aShortArray9075[var3], (byte)0);
            var2.method9610(this.aShortArray9076[var3], (byte)0);
            var2.method9610(this.aShortArray9077[var3], (byte)0);
         }
      }

      if(var2.pos * 301018015 != 0) {
         if(var1) {
            if(this.anInterface20_9086 == null) {
               this.anInterface20_9086 = this.aClass174_Sub2_9048.method8630(5123, var2.buffer, var2.pos * 301018015, true);
            } else {
               this.anInterface20_9086.method138(5123, var2.buffer, var2.pos * 301018015);
            }

            this.aClass136_9085.anInterface20_1650 = this.anInterface20_9086;
         } else {
            this.aClass136_9085.anInterface20_1650 = this.aClass174_Sub2_9048.method8630(5123, var2.buffer, var2.pos * 301018015, false);
         }

         if(!var1) {
            this.aBool9088 = true;
         }

      }
   }

   public int method1979() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9051;
   }

   void method2012(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var23;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var24 = var2[var10];
            if(var24 < this.anIntArrayArray9084.length) {
               int[] var25 = this.anIntArrayArray9084[var24];

               for(var23 = 0; var23 < var25.length; ++var23) {
                  var14 = var25[var23];
                  anInt9101 += this.anIntArray9058[var14];
                  anInt9115 += this.anIntArray9059[var14];
                  anInt9116 += this.anIntArray9091[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            anInt9101 = anInt9101 / var9 + var3;
            anInt9115 = anInt9115 / var9 + var4;
            anInt9116 = anInt9116 / var9 + var5;
         } else {
            anInt9101 = var3;
            anInt9115 = var4;
            anInt9116 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9084.length) {
                  var11 = this.anIntArrayArray9084[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var23 = var11[var12];
                     this.anIntArray9058[var23] += var3;
                     this.anIntArray9059[var23] += var4;
                     this.anIntArray9091[var23] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            int var17;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9084.length) {
                     var11 = this.anIntArrayArray9084[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray9058[var23] -= anInt9101;
                           this.anIntArray9059[var23] -= anInt9115;
                           this.anIntArray9091[var23] -= anInt9116;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9059[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = this.anIntArray9059[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9059[var23] * var15 - this.anIntArray9091[var23] * var14 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9059[var23] * var14 + this.anIntArray9091[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9091[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9091[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           this.anIntArray9058[var23] += anInt9101;
                           this.anIntArray9059[var23] += anInt9115;
                           this.anIntArray9091[var23] += anInt9116;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray9058[var23] -= anInt9101;
                           this.anIntArray9059[var23] -= anInt9115;
                           this.anIntArray9091[var23] -= anInt9116;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9059[var23] * var15 - this.anIntArray9091[var23] * var14 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9059[var23] * var14 + this.anIntArray9091[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9059[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = this.anIntArray9059[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9091[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9091[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           this.anIntArray9058[var23] += anInt9101;
                           this.anIntArray9059[var23] += anInt9115;
                           this.anIntArray9091[var23] += anInt9116;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray9084.length) {
                        var11 = this.anIntArrayArray9084[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           var14 = this.anIntArray9092[var23];
                           var15 = this.anIntArray9092[var23 + 1];

                           for(var16 = var14; var16 < var15 && this.aShortArray9102[var16] != 0; ++var16) {
                              var17 = (this.aShortArray9102[var16] & '\uffff') - 1;
                              int var18;
                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class443.anIntArray4895[var5];
                                 var19 = Class443.anIntArray4896[var5];
                                 var20 = this.aShortArray9065[var17] * var18 + this.aShortArray9064[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9065[var17] = (short)(this.aShortArray9065[var17] * var19 - this.aShortArray9064[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9064[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class443.anIntArray4895[var3];
                                 var19 = Class443.anIntArray4896[var3];
                                 var20 = this.aShortArray9065[var17] * var19 - this.aShortArray9094[var17] * var18 + 16383 >> 14;
                                 this.aShortArray9094[var17] = (short)(this.aShortArray9065[var17] * var18 + this.aShortArray9094[var17] * var19 + 16383 >> 14);
                                 this.aShortArray9065[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class443.anIntArray4895[var4];
                                 var19 = Class443.anIntArray4896[var4];
                                 var20 = this.aShortArray9094[var17] * var18 + this.aShortArray9064[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9094[var17] = (short)(this.aShortArray9094[var17] * var19 - this.aShortArray9064[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9064[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                     this.aClass129_9044.anInterface15_1612 = null;
                  }

                  if(this.aClass129_9083 != null) {
                     this.aClass129_9083.anInterface15_1612 = null;
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9084.length) {
                     var11 = this.anIntArrayArray9084[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var23 = var11[var12];
                        this.anIntArray9058[var23] -= anInt9101;
                        this.anIntArray9059[var23] -= anInt9115;
                        this.anIntArray9091[var23] -= anInt9116;
                        this.anIntArray9058[var23] = this.anIntArray9058[var23] * var3 >> 7;
                        this.anIntArray9059[var23] = this.anIntArray9059[var23] * var4 >> 7;
                        this.anIntArray9091[var23] = this.anIntArray9091[var23] * var5 >> 7;
                        this.anIntArray9058[var23] += anInt9101;
                        this.anIntArray9059[var23] += anInt9115;
                        this.anIntArray9091[var23] += anInt9116;
                     }
                  }
               }

            } else {
               Class147 var21;
               Class137 var22;
               if(var1 == 5) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9079.length) {
                           var11 = this.anIntArrayArray9079[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = (this.aByteArray9074[var23] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray9074[var23] = (byte)var14;
                           }

                           if(var11.length > 0 && this.aClass129_9044 != null) {
                              this.aClass129_9044.anInterface15_1612 = null;
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var9 = 0; var9 < this.anInt9105; ++var9) {
                           var21 = this.aClass147Array9043[var9];
                           var22 = this.aClass137Array9104[var9];
                           var22.anInt1653 = var22.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var21.anInt1703] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9079.length) {
                           var11 = this.anIntArrayArray9079[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = this.aShortArray9082[var23] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4 / 4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray9082[var23] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           if(var11.length > 0 && this.aClass129_9044 != null) {
                              this.aClass129_9044.anInterface15_1612 = null;
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var9 = 0; var9 < this.anInt9105; ++var9) {
                           var21 = this.aClass147Array9043[var9];
                           var22 = this.aClass137Array9104[var9];
                           var22.anInt1653 = var22.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var21.anInt1703] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class137 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1654 += var3;
                                 var13.anInt1655 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1651 = var13.anInt1651 * var3 >> 7;
                                 var13.anInt1652 = var13.anInt1652 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1656 = var13.anInt1656 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   public void method2086(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9071; ++var3) {
         if(this.aShortArray9082[var3] == var1) {
            this.aShortArray9082[var3] = var2;
         }
      }

      if(this.aClass147Array9043 != null) {
         for(var3 = 0; var3 < this.anInt9105; ++var3) {
            Class147 var4 = this.aClass147Array9043[var3];
            Class137 var5 = this.aClass137Array9104[var3];
            var5.anInt1653 = var5.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var4.anInt1703] & '\uffff'] & 16777215;
         }
      }

      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   void method2000(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var23;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         anInt9101 = 0;
         anInt9115 = 0;
         anInt9116 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var24 = var2[var10];
            if(var24 < this.anIntArrayArray9084.length) {
               int[] var25 = this.anIntArrayArray9084[var24];

               for(var23 = 0; var23 < var25.length; ++var23) {
                  var14 = var25[var23];
                  anInt9101 += this.anIntArray9058[var14];
                  anInt9115 += this.anIntArray9059[var14];
                  anInt9116 += this.anIntArray9091[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            anInt9101 = anInt9101 / var9 + var3;
            anInt9115 = anInt9115 / var9 + var4;
            anInt9116 = anInt9116 / var9 + var5;
         } else {
            anInt9101 = var3;
            anInt9115 = var4;
            anInt9116 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9084.length) {
                  var11 = this.anIntArrayArray9084[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var23 = var11[var12];
                     this.anIntArray9058[var23] += var3;
                     this.anIntArray9059[var23] += var4;
                     this.anIntArray9091[var23] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            int var17;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9084.length) {
                     var11 = this.anIntArrayArray9084[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray9058[var23] -= anInt9101;
                           this.anIntArray9059[var23] -= anInt9115;
                           this.anIntArray9091[var23] -= anInt9116;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9059[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = this.anIntArray9059[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9059[var23] * var15 - this.anIntArray9091[var23] * var14 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9059[var23] * var14 + this.anIntArray9091[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9091[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9091[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           this.anIntArray9058[var23] += anInt9101;
                           this.anIntArray9059[var23] += anInt9115;
                           this.anIntArray9091[var23] += anInt9116;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           this.anIntArray9058[var23] -= anInt9101;
                           this.anIntArray9059[var23] -= anInt9115;
                           this.anIntArray9091[var23] -= anInt9116;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9059[var23] * var15 - this.anIntArray9091[var23] * var14 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9059[var23] * var14 + this.anIntArray9091[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9059[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9059[var23] = this.anIntArray9059[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9091[var23] * var14 + this.anIntArray9058[var23] * var15 + 16383 >> 14;
                              this.anIntArray9091[var23] = this.anIntArray9091[var23] * var15 - this.anIntArray9058[var23] * var14 + 16383 >> 14;
                              this.anIntArray9058[var23] = var16;
                           }

                           this.anIntArray9058[var23] += anInt9101;
                           this.anIntArray9059[var23] += anInt9115;
                           this.anIntArray9091[var23] += anInt9116;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray9084.length) {
                        var11 = this.anIntArrayArray9084[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var23 = var11[var12];
                           var14 = this.anIntArray9092[var23];
                           var15 = this.anIntArray9092[var23 + 1];

                           for(var16 = var14; var16 < var15 && this.aShortArray9102[var16] != 0; ++var16) {
                              var17 = (this.aShortArray9102[var16] & '\uffff') - 1;
                              int var18;
                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class443.anIntArray4895[var5];
                                 var19 = Class443.anIntArray4896[var5];
                                 var20 = this.aShortArray9065[var17] * var18 + this.aShortArray9064[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9065[var17] = (short)(this.aShortArray9065[var17] * var19 - this.aShortArray9064[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9064[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class443.anIntArray4895[var3];
                                 var19 = Class443.anIntArray4896[var3];
                                 var20 = this.aShortArray9065[var17] * var19 - this.aShortArray9094[var17] * var18 + 16383 >> 14;
                                 this.aShortArray9094[var17] = (short)(this.aShortArray9065[var17] * var18 + this.aShortArray9094[var17] * var19 + 16383 >> 14);
                                 this.aShortArray9065[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class443.anIntArray4895[var4];
                                 var19 = Class443.anIntArray4896[var4];
                                 var20 = this.aShortArray9094[var17] * var18 + this.aShortArray9064[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9094[var17] = (short)(this.aShortArray9094[var17] * var19 - this.aShortArray9064[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9064[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
                     this.aClass129_9044.anInterface15_1612 = null;
                  }

                  if(this.aClass129_9083 != null) {
                     this.aClass129_9083.anInterface15_1612 = null;
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9084.length) {
                     var11 = this.anIntArrayArray9084[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var23 = var11[var12];
                        this.anIntArray9058[var23] -= anInt9101;
                        this.anIntArray9059[var23] -= anInt9115;
                        this.anIntArray9091[var23] -= anInt9116;
                        this.anIntArray9058[var23] = this.anIntArray9058[var23] * var3 >> 7;
                        this.anIntArray9059[var23] = this.anIntArray9059[var23] * var4 >> 7;
                        this.anIntArray9091[var23] = this.anIntArray9091[var23] * var5 >> 7;
                        this.anIntArray9058[var23] += anInt9101;
                        this.anIntArray9059[var23] += anInt9115;
                        this.anIntArray9091[var23] += anInt9116;
                     }
                  }
               }

            } else {
               Class147 var21;
               Class137 var22;
               if(var1 == 5) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9079.length) {
                           var11 = this.anIntArrayArray9079[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = (this.aByteArray9074[var23] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray9074[var23] = (byte)var14;
                           }

                           if(var11.length > 0 && this.aClass129_9044 != null) {
                              this.aClass129_9044.anInterface15_1612 = null;
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var9 = 0; var9 < this.anInt9105; ++var9) {
                           var21 = this.aClass147Array9043[var9];
                           var22 = this.aClass137Array9104[var9];
                           var22.anInt1653 = var22.anInt1653 & 16777215 | 255 - (this.aByteArray9074[var21.anInt1703] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9079 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9079.length) {
                           var11 = this.anIntArrayArray9079[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var23 = var11[var12];
                              var14 = this.aShortArray9082[var23] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4 / 4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray9082[var23] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           if(var11.length > 0 && this.aClass129_9044 != null) {
                              this.aClass129_9044.anInterface15_1612 = null;
                           }
                        }
                     }

                     if(this.aClass147Array9043 != null) {
                        for(var9 = 0; var9 < this.anInt9105; ++var9) {
                           var21 = this.aClass147Array9043[var9];
                           var22 = this.aClass137Array9104[var9];
                           var22.anInt1653 = var22.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var21.anInt1703] & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Class137 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1654 += var3;
                                 var13.anInt1655 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1651 = var13.anInt1651 * var3 >> 7;
                                 var13.anInt1652 = var13.anInt1652 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9108 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9108.length) {
                              var11 = this.anIntArrayArray9108[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass137Array9104[var11[var12]];
                                 var13.anInt1656 = var13.anInt1656 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   public int method2077() {
      return this.aShort9056;
   }

   void method2113() {
      for(int var1 = 0; var1 < this.anInt9046; ++var1) {
         this.anIntArray9058[var1] = this.anIntArray9058[var1] + 7 >> 4;
         this.anIntArray9059[var1] = this.anIntArray9059[var1] + 7 >> 4;
         this.anIntArray9091[var1] = this.anIntArray9091[var1] + 7 >> 4;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public int method2079() {
      return this.aShort9056;
   }

   public int method1993() {
      return this.aShort9056;
   }

   public void method2010(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         int var5 = this.anIntArray9091[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public int method2081() {
      return this.aShort9053;
   }

   public int method2082() {
      return this.aShort9053;
   }

   public int method2114() {
      return this.aShort9053;
   }

   public int method2058() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.anInt9107;
   }

   void method2074() {
      for(int var1 = 0; var1 < this.anInt9046; ++var1) {
         this.anIntArray9058[var1] = this.anIntArray9058[var1] + 7 >> 4;
         this.anIntArray9059[var1] = this.anIntArray9059[var1] + 7 >> 4;
         this.anIntArray9091[var1] = this.anIntArray9091[var1] + 7 >> 4;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2121(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9071; ++var3) {
         if(this.aShortArray9082[var3] == var1) {
            this.aShortArray9082[var3] = var2;
         }
      }

      if(this.aClass147Array9043 != null) {
         for(var3 = 0; var3 < this.anInt9105; ++var3) {
            Class147 var4 = this.aClass147Array9043[var3];
            Class137 var5 = this.aClass137Array9104[var3];
            var5.anInt1653 = var5.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var4.anInt1703] & '\uffff'] & 16777215;
         }
      }

      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public void method2087(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9071; ++var3) {
         if(this.aShortArray9082[var3] == var1) {
            this.aShortArray9082[var3] = var2;
         }
      }

      if(this.aClass147Array9043 != null) {
         for(var3 = 0; var3 < this.anInt9105; ++var3) {
            Class147 var4 = this.aClass147Array9043[var3];
            Class137 var5 = this.aClass137Array9104[var3];
            var5.anInt1653 = var5.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var4.anInt1703] & '\uffff'] & 16777215;
         }
      }

      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public int method2065() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9093;
   }

   public void method2089(byte var1, byte[] var2) {
      int var3;
      if(var2 == null) {
         for(var3 = 0; var3 < this.anInt9071; ++var3) {
            this.aByteArray9074[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.anInt9071; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.aByteArray9074[var3] = (byte)var4;
         }
      }

      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   public void method2053(short var1, short var2) {
      Class169 var3 = this.aClass174_Sub2_9048.aClass169_2035;

      for(int var4 = 0; var4 < this.anInt9071; ++var4) {
         if(this.aShortArray9078[var4] == var1) {
            this.aShortArray9078[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if(var1 != -1) {
         Class171 var6 = var3.method2122(var1 & '\uffff', (byte)73);
         var11 = var6.aByte1969;
         var5 = var6.aByte2012;
      }

      byte var12 = 0;
      byte var7 = 0;
      if(var2 != -1) {
         Class171 var8 = var3.method2122(var2 & '\uffff', (byte)20);
         var12 = var8.aByte1969;
         var7 = var8.aByte2012;
         if(var8.aByte1986 != 0 || var8.aByte1963 != 0) {
            this.aBool9055 = true;
         }
      }

      if(var11 != var12 | var5 != var7) {
         if(this.aClass147Array9043 != null) {
            for(int var13 = 0; var13 < this.anInt9105; ++var13) {
               Class147 var9 = this.aClass147Array9043[var13];
               Class137 var10 = this.aClass137Array9104[var13];
               var10.anInt1653 = var10.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var9.anInt1703] & '\uffff'] & 16777215;
            }
         }

         if(this.aClass129_9044 != null) {
            this.aClass129_9044.anInterface15_1612 = null;
         }
      }

   }

   public void method2120(short var1, short var2) {
      Class169 var3 = this.aClass174_Sub2_9048.aClass169_2035;

      for(int var4 = 0; var4 < this.anInt9071; ++var4) {
         if(this.aShortArray9078[var4] == var1) {
            this.aShortArray9078[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if(var1 != -1) {
         Class171 var6 = var3.method2122(var1 & '\uffff', (byte)-41);
         var11 = var6.aByte1969;
         var5 = var6.aByte2012;
      }

      byte var12 = 0;
      byte var7 = 0;
      if(var2 != -1) {
         Class171 var8 = var3.method2122(var2 & '\uffff', (byte)33);
         var12 = var8.aByte1969;
         var7 = var8.aByte2012;
         if(var8.aByte1986 != 0 || var8.aByte1963 != 0) {
            this.aBool9055 = true;
         }
      }

      if(var11 != var12 | var5 != var7) {
         if(this.aClass147Array9043 != null) {
            for(int var13 = 0; var13 < this.anInt9105; ++var13) {
               Class147 var9 = this.aClass147Array9043[var13];
               Class137 var10 = this.aClass137Array9104[var13];
               var10.anInt1653 = var10.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var9.anInt1703] & '\uffff'] & 16777215;
            }
         }

         if(this.aClass129_9044 != null) {
            this.aClass129_9044.anInterface15_1612 = null;
         }
      }

   }

   public void method2091(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.anInt9071; ++var5) {
         int var6 = this.aShortArray9082[var5] & '\uffff';
         int var7 = var6 >> 10 & 63;
         int var8 = var6 >> 7 & 7;
         int var9 = var6 & 127;
         if(var1 != -1) {
            var7 += (var1 - var7) * var4 >> 7;
         }

         if(var2 != -1) {
            var8 += (var2 - var8) * var4 >> 7;
         }

         if(var3 != -1) {
            var9 += (var3 - var9) * var4 >> 7;
         }

         this.aShortArray9082[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if(this.aClass147Array9043 != null) {
         for(var5 = 0; var5 < this.anInt9105; ++var5) {
            Class147 var10 = this.aClass147Array9043[var5];
            Class137 var11 = this.aClass137Array9104[var5];
            var11.anInt1653 = var11.anInt1653 & -16777216 | Class661.anIntArray8516[this.aShortArray9082[var10.anInt1703] & '\uffff'] & 16777215;
         }
      }

      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

   }

   void method8426() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.anInt9060; ++var9) {
         int var10 = this.anIntArray9058[var9];
         int var11 = this.anIntArray9059[var9];
         int var12 = this.anIntArray9091[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.aShort9051 = (short)var1;
      this.aShort9095 = (short)var4;
      this.aShort9093 = (short)var2;
      this.aShort9067 = (short)var5;
      this.aShort9096 = (short)var3;
      this.aShort9097 = (short)var6;
      this.anInt9090 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.anInt9107 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.aBool9072 = true;
   }

   public Class182[] method2040() {
      return this.aClass182Array9066;
   }

   public void method1958(int var1) {
      this.aShort9053 = (short)var1;
      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

   }

   public boolean method2095() {
      if(this.aShortArray9078 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9078.length; ++var1) {
            if(this.aShortArray9078[var1] != -1) {
               Class171 var2 = this.aClass174_Sub2_9048.aClass169_2035.method2122(this.aShortArray9078[var1] & '\uffff', (byte)40);
               if(var2.aBool1987 && !this.aClass174_Sub2_9048.aClass154_9500.method1832(Class595.aClass595_7846, var2, -1)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public void method1951(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9060; ++var4) {
         int var5 = this.anIntArray9091[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public boolean method2097() {
      if(this.aShortArray9078 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9078.length; ++var1) {
            if(this.aShortArray9078[var1] != -1) {
               Class171 var2 = this.aClass174_Sub2_9048.aClass169_2035.method2122(this.aShortArray9078[var1] & '\uffff', (byte)-92);
               if(var2.aBool1987 && !this.aClass174_Sub2_9048.aClass154_9500.method1832(Class595.aClass595_7846, var2, -1)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean method2098() {
      return this.aBool9054;
   }

   public int method2038() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9093;
   }

   public boolean method1982() {
      return this.aBool9054;
   }

   public int method1949() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9093;
   }

   public boolean method2049() {
      return this.aBool9055;
   }

   public int method2061() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9051;
   }

   public boolean method2104() {
      return this.aBool9055;
   }

   public void method2045(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9062 != null) {
         Class445 var4 = var1;
         if(var3) {
            var4 = this.aClass174_Sub2_9048.aClass445_9557;
            var4.method5223(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt9060; ++var6) {
            if((var2 & this.aShortArray9062[var6]) != 0) {
               var4.method5233((float)this.anIntArray9058[var6], (float)this.anIntArray9059[var6], (float)this.anIntArray9091[var6], var5);
               this.anIntArray9058[var6] = (int)var5[0];
               this.anIntArray9059[var6] = (int)var5[1];
               this.anIntArray9091[var6] = (int)var5[2];
            }
         }

      }
   }

   public boolean method2099() {
      return this.aBool9054;
   }

   public boolean method1994() {
      if(this.aShortArray9078 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9078.length; ++var1) {
            if(this.aShortArray9078[var1] != -1) {
               Class171 var2 = this.aClass174_Sub2_9048.aClass169_2035.method2122(this.aShortArray9078[var1] & '\uffff', (byte)97);
               if(var2.aBool1987 && !this.aClass174_Sub2_9048.aClass154_9500.method1832(Class595.aClass595_7846, var2, -1)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   void method8427() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.anInt9060; ++var9) {
         int var10 = this.anIntArray9058[var9];
         int var11 = this.anIntArray9059[var9];
         int var12 = this.anIntArray9091[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.aShort9051 = (short)var1;
      this.aShort9095 = (short)var4;
      this.aShort9093 = (short)var2;
      this.aShort9067 = (short)var5;
      this.aShort9096 = (short)var3;
      this.aShort9097 = (short)var6;
      this.anInt9090 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.anInt9107 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.aBool9072 = true;
   }

   void method1972() {
      for(int var1 = 0; var1 < this.anInt9046; ++var1) {
         this.anIntArray9058[var1] = this.anIntArray9058[var1] + 7 >> 4;
         this.anIntArray9059[var1] = this.anIntArray9059[var1] + 7 >> 4;
         this.anIntArray9091[var1] = this.anIntArray9091[var1] + 7 >> 4;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public int method2106() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9096;
   }

   public int method2105() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9096;
   }

   public int method2107() {
      if(!this.aBool9041) {
         this.method1986();
      }

      return this.aShort9099;
   }

   public void method2004(int var1) {
      this.anInt9117 = var1;
      if(this.aClass151_9089 != null && (this.anInt9117 & 65536) == 0) {
         this.aShortArray9064 = this.aClass151_9089.aShortArray1719;
         this.aShortArray9065 = this.aClass151_9089.aShortArray1721;
         this.aShortArray9094 = this.aClass151_9089.aShortArray1720;
         this.aByteArray9061 = this.aClass151_9089.aByteArray1722;
         this.aClass151_9089 = null;
      }

      this.aBool9088 = true;
      this.method8419();
   }

   public Class182[] method2090() {
      return this.aClass182Array9066;
   }

   public int method2112() {
      if(!this.aBool9041) {
         this.method1986();
      }

      return this.aShort9099;
   }

   void method2111() {
      for(int var1 = 0; var1 < this.anInt9046; ++var1) {
         this.anIntArray9058[var1] = this.anIntArray9058[var1] + 7 >> 4;
         this.anIntArray9059[var1] = this.anIntArray9059[var1] + 7 >> 4;
         this.anIntArray9091[var1] = this.anIntArray9091[var1] + 7 >> 4;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   short method8428(Class170 var1, int var2, long var3, int var5, int var6, int var7, int var8, float var9, float var10) {
      int var11 = this.anIntArray9092[var2];
      int var12 = this.anIntArray9092[var2 + 1];
      int var13 = 0;

      for(int var14 = var11; var14 < var12; ++var14) {
         if(this.aShortArray9102[var14] == 0) {
            var13 = var14;
            break;
         }

         int var15 = (this.aShortArray9102[var14] & '\uffff') - 1;
         if(aLongArray9109[var14] == var3) {
            return (short)var15;
         }
      }

      this.aShortArray9102[var13] = (short)(this.anInt9063 + 1);
      aLongArray9109[var13] = var3;
      this.aShortArray9064[this.anInt9063] = (short)var5;
      this.aShortArray9065[this.anInt9063] = (short)var6;
      this.aShortArray9094[this.anInt9063] = (short)var7;
      this.aByteArray9061[this.anInt9063] = (byte)var8;
      this.aFloatArray9069[this.anInt9063] = var9;
      this.aFloatArray9070[this.anInt9063] = var10;
      return (short)(this.anInt9063++);
   }

   public void method1952(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.anInt9060; ++var4) {
         var5 = this.anIntArray9091[var4] * var2 + this.anIntArray9058[var4] * var3 >> 14;
         this.anIntArray9091[var4] = this.anIntArray9091[var4] * var3 - this.anIntArray9058[var4] * var2 >> 14;
         this.anIntArray9058[var4] = var5;
      }

      for(var4 = 0; var4 < this.anInt9063; ++var4) {
         var5 = this.aShortArray9094[var4] * var2 + this.aShortArray9064[var4] * var3 >> 14;
         this.aShortArray9094[var4] = (short)(this.aShortArray9094[var4] * var3 - this.aShortArray9064[var4] * var2 >> 14);
         this.aShortArray9064[var4] = (short)var5;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      this.aBool9072 = false;
   }

   public void method2092(Class445 var1, Class164 var2, int var3) {
      if((var3 & 2) != 0) {
         OpenGL.glPolygonMode(1032, 6913);
      }

      if(this.anInt9063 != 0) {
         Class433 var4 = this.aClass174_Sub2_9048.aClass433_9544;
         Class433 var5 = this.aClass174_Sub2_9048.aClass433_9558;
         Class433 var6 = this.aClass174_Sub2_9048.aClass433_9559;
         var5.method5110(var1);
         var6.method5083(var5);
         var6.method5085(this.aClass174_Sub2_9048.aClass433_9546);
         if(!this.aBool9072) {
            this.method8426();
         }

         float[] var7 = this.aClass174_Sub2_9048.aFloatArray9468;
         var5.method5089(0.0F, (float)this.aShort9093, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method5089(0.0F, (float)this.aShort9067, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var16;
         float var17;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.aClass174_Sub2_9048.aFloatArrayArray9547[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.anInt9090;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.anInt9090;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.aShort9051 + this.aShort9095 >> 1;
            int var21 = this.aShort9096 + this.aShort9097 >> 1;
            short var23 = this.aShort9093;
            float var33 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var34 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            var16 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            var17 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var16 >= -var17) {
               var2.anInt1789 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var33 / var17);
               var2.anInt1786 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var34 / var17);
            } else {
               var18 = true;
            }

            var23 = this.aShort9067;
            float var25 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var26 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            float var27 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            float var28 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var27 >= -var28) {
               var2.anInt1785 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var25 / var28);
               var2.anInt1788 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var26 / var28);
            } else {
               var18 = true;
            }

            float var29;
            float var30;
            if(var18) {
               if(var16 < -var17 && var27 < -var28) {
                  var19 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var33 + var29 * (var25 - var33);
                     var31 = var34 + var29 * (var26 - var34);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.anInt1789 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var32);
                     var2.anInt1786 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var33 - var25);
                     var31 = var26 + var29 * (var34 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.anInt1785 = (int)(this.aClass174_Sub2_9048.aFloat9549 + this.aClass174_Sub2_9048.aFloat9550 * var30 / var32);
                     var2.anInt1788 = (int)(this.aClass174_Sub2_9048.aFloat9498 + this.aClass174_Sub2_9048.aFloat9552 * var31 / var32);
                  }
               }
            }

            if(var19) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var33 + var4.aFloatArray4841[0] * (float)this.anInt9090 + var4.aFloatArray4841[12];
                  var30 = var17 + var4.aFloatArray4841[3] * (float)this.anInt9090 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub2_9048.aFloat9549 - (float)var2.anInt1789 + this.aClass174_Sub2_9048.aFloat9550 * var29 / var30);
               } else {
                  var29 = var25 + var4.aFloatArray4841[0] * (float)this.anInt9090 + var4.aFloatArray4841[12];
                  var30 = var28 + var4.aFloatArray4841[3] * (float)this.anInt9090 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub2_9048.aFloat9549 - (float)var2.anInt1785 + this.aClass174_Sub2_9048.aFloat9550 * var29 / var30);
               }

               var2.aBool1784 = true;
            }
         }

         this.aClass174_Sub2_9048.method8638();
         this.aClass174_Sub2_9048.method8688(var5);
         this.method8413();
         this.aClass174_Sub2_9048.method8611();
         var5.method5085(this.aClass174_Sub2_9048.aClass433_9496);
         this.method8418(var5);
         if((var3 & 2) != 0) {
            OpenGL.glPolygonMode(1028, 6914);
         }

      }
   }

   void method8429() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.anInt9060; ++var9) {
         int var10 = this.anIntArray9058[var9];
         int var11 = this.anIntArray9059[var9];
         int var12 = this.anIntArray9091[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.aShort9051 = (short)var1;
      this.aShort9095 = (short)var4;
      this.aShort9093 = (short)var2;
      this.aShort9067 = (short)var5;
      this.aShort9096 = (short)var3;
      this.aShort9097 = (short)var6;
      this.anInt9090 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.anInt9107 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.aBool9072 = true;
   }

   void method2032() {
   }

   void method8430() {
      if(this.anInt9098 != 0) {
         if(this.aByte9049 != 0) {
            this.method8420(true);
         }

         this.method8420(false);
         if(this.aClass136_9085 != null) {
            if(this.aClass136_9085.anInterface20_1650 == null) {
               this.method8425((this.aByte9049 & 16) != 0);
            }

            if(this.aClass136_9085.anInterface20_1650 != null) {
               this.aClass174_Sub2_9048.method8646(this.aClass129_9083 != null);
               this.aClass174_Sub2_9048.method8634(this.aClass129_9081, this.aClass129_9083, this.aClass129_9044, this.aClass129_9114);
               int var1 = this.anIntArray9100.length - 1;

               for(int var2 = 0; var2 < var1; ++var2) {
                  int var3 = this.anIntArray9100[var2];
                  int var4 = this.anIntArray9100[var2 + 1];
                  int var5 = this.aShortArray9078[var3] == -1?-1:this.aShortArray9078[var3] & '\uffff';
                  this.aClass174_Sub2_9048.method8643(var5, this.aClass129_9083 != null);
                  this.aClass174_Sub2_9048.method8664(this.aClass136_9085.anInterface20_1650, 4, var3 * 3, (var4 - var3) * 3);
               }
            }
         }

         this.method8419();
      }
   }

   void method8431() {
      if(this.anInt9098 != 0) {
         if(this.aByte9049 != 0) {
            this.method8420(true);
         }

         this.method8420(false);
         if(this.aClass136_9085 != null) {
            if(this.aClass136_9085.anInterface20_1650 == null) {
               this.method8425((this.aByte9049 & 16) != 0);
            }

            if(this.aClass136_9085.anInterface20_1650 != null) {
               this.aClass174_Sub2_9048.method8646(this.aClass129_9083 != null);
               this.aClass174_Sub2_9048.method8634(this.aClass129_9081, this.aClass129_9083, this.aClass129_9044, this.aClass129_9114);
               int var1 = this.anIntArray9100.length - 1;

               for(int var2 = 0; var2 < var1; ++var2) {
                  int var3 = this.anIntArray9100[var2];
                  int var4 = this.anIntArray9100[var2 + 1];
                  int var5 = this.aShortArray9078[var3] == -1?-1:this.aShortArray9078[var3] & '\uffff';
                  this.aClass174_Sub2_9048.method8643(var5, this.aClass129_9083 != null);
                  this.aClass174_Sub2_9048.method8664(this.aClass136_9085.anInterface20_1650, 4, var3 * 3, (var4 - var3) * 3);
               }
            }
         }

         this.method8419();
      }
   }

   public int method2003() {
      return this.anInt9117;
   }

   public int method1984() {
      if(!this.aBool9072) {
         this.method8426();
      }

      return this.aShort9097;
   }

   public void method1956() {
      int var1;
      for(var1 = 0; var1 < this.anInt9060; ++var1) {
         this.anIntArray9091[var1] = -this.anIntArray9091[var1];
      }

      for(var1 = 0; var1 < this.anInt9063; ++var1) {
         this.aShortArray9094[var1] = (short)(-this.aShortArray9094[var1]);
      }

      for(var1 = 0; var1 < this.anInt9071; ++var1) {
         short var2 = this.aShortArray9075[var1];
         this.aShortArray9075[var1] = this.aShortArray9077[var1];
         this.aShortArray9077[var1] = var2;
      }

      if(this.aClass129_9083 == null && this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

      if(this.aClass129_9081 != null) {
         this.aClass129_9081.anInterface15_1612 = null;
      }

      if(this.aClass136_9085 != null) {
         this.aClass136_9085.anInterface20_1650 = null;
      }

      this.aBool9072 = false;
   }

   public void method2021(int var1) {
      this.aShort9053 = (short)var1;
      if(this.aClass129_9044 != null) {
         this.aClass129_9044.anInterface15_1612 = null;
      }

      if(this.aClass129_9083 != null) {
         this.aClass129_9083.anInterface15_1612 = null;
      }

   }

   static final int method8432(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }
}
