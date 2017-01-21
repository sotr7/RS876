package com.jagex;

import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class260;
import com.jagex.Class266;
import com.jagex.Class276;
import com.jagex.Class284_Sub1;
import com.jagex.Class433;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Class526_Sub13_Sub1_Sub1;
import com.jagex.Class691;
import com.jagex.IllegalArgumentException_Sub1;
import com.jagex.Interface41;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class276_Sub1 extends Class276 {
   static final int anInt10018 = 1;
   static final int anInt10024 = 0;
   long aLong10025;
   long aLong10019;
   boolean aBool10017;
   float[][] aFloatArrayArray10016;
   boolean[] aBoolArray10027;
   byte[] aByteArray10022;
   byte[] aByteArray10020;
   static float[] aFloatArray10021 = new float[16];
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_10026;
   Class284_Sub1 aClass284_Sub1_10023;

   public boolean method3639() {
      if(this.aBool10017) {
         return true;
      } else {
         this.aLong10025 = this.aByteArray10022 == null?0L:IDirect3DDevice.CreateVertexShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10022);
         this.aLong10019 = this.aByteArray10020 == null?0L:IDirect3DDevice.CreatePixelShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10020);
         if(this.aLong10025 == 0L && this.aLong10019 == 0L) {
            return false;
         } else {
            int var1 = -1;

            int var2;
            for(var2 = 0; var2 < this.aClass284_Sub1_10023.method3727(920773945); ++var2) {
               if(this.aClass284_Sub1_10023.method3755(var2, -1570975292) == this) {
                  var1 = var2;
                  break;
               }
            }

            var2 = this.aClass284_Sub1_10023.method3753(-2104547028);
            int var3 = this.aClass284_Sub1_10023.method3751((short)-9555);

            int var4;
            Class526_Sub13_Sub1 var5;
            for(var4 = 0; var4 < var2; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3777(var4, 622303961);
               var5.method10626(var1);
            }

            for(var4 = 0; var4 < var3; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3770(var4, 1670772149);
               var5.method10626(var1);
            }

            var4 = 0;
            int var12 = 0;
            int var6 = this.aClass284_Sub1_10023.method3774(this, -774520167);

            for(int var7 = 0; var7 < var2 + var3; ++var7) {
               Class526_Sub13_Sub1_Sub1 var8 = (Class526_Sub13_Sub1_Sub1)(var7 < var2?this.aClass284_Sub1_10023.method3777(var7, -945719961):this.aClass284_Sub1_10023.method3770(var7 - var2, 1670772149));
               Class260 var9 = var8.method10632(-1503163777);
               int var10 = 1;
               if(var9 == Class260.aClass260_2839) {
                  var9 = var8.method10629(1692019529);
                  var10 = var8.method10628((byte)-29);
               }

               switch(var9.anInt2962 * -38035463) {
               case 8:
               case 13:
               case 21:
               case 80:
                  var10 *= 4;
                  break;
               case 15:
               case 16:
               case 24:
               case 35:
                  var10 *= 2;
                  break;
               case 25:
               case 83:
               case 107:
               case 113:
                  var10 *= 3;
               case 39:
               case 78:
               case 87:
               case 101:
               case 116:
                  break;
               default:
                  var10 = 0;
               }

               int var11;
               if(var8.anIntArray12034[var6] >= 0) {
                  var11 = var8.anIntArray12034[var6] + var10;
                  if(var4 < var11) {
                     var4 = var11;
                  }
               }

               if(var8.anIntArray12036[var6] >= 0) {
                  var11 = var8.anIntArray12036[var6] + var10;
                  if(var12 < var11) {
                     var12 = var11;
                  }
               }
            }

            this.aFloatArrayArray10016[0] = new float[var4 * 4];
            this.aFloatArrayArray10016[1] = new float[var12 * 4];
            this.aBool10017 = true;
            return true;
         }
      }
   }

   Class276_Sub1(Class174_Sub3_Sub1 var1, Class266 var2) {
      this.aBool10017 = false;
      this.aFloatArrayArray10016 = new float[2][];
      this.aBoolArray10027 = new boolean[2];
      this.aString3020 = var2.aString2977;
      if(var2.aString2976 != null) {
         this.aString3021 = var2.aString2976;
         this.aByteArray10022 = var1.method10521(this.aString3021);
      }

      if(var2.aString2978 != null) {
         this.aString3022 = var2.aString2978;
         this.aByteArray10020 = var1.method10521(this.aString3022);
      }

      var1.method8819(this);
   }

   public boolean method3638() {
      if(this.aBool10017) {
         return true;
      } else {
         this.aLong10025 = this.aByteArray10022 == null?0L:IDirect3DDevice.CreateVertexShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10022);
         this.aLong10019 = this.aByteArray10020 == null?0L:IDirect3DDevice.CreatePixelShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10020);
         if(this.aLong10025 == 0L && this.aLong10019 == 0L) {
            return false;
         } else {
            int var1 = -1;

            int var2;
            for(var2 = 0; var2 < this.aClass284_Sub1_10023.method3727(1257970408); ++var2) {
               if(this.aClass284_Sub1_10023.method3755(var2, -1604619369) == this) {
                  var1 = var2;
                  break;
               }
            }

            var2 = this.aClass284_Sub1_10023.method3753(-1162896390);
            int var3 = this.aClass284_Sub1_10023.method3751((short)-831);

            int var4;
            Class526_Sub13_Sub1 var5;
            for(var4 = 0; var4 < var2; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3777(var4, -1979608289);
               var5.method10626(var1);
            }

            for(var4 = 0; var4 < var3; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3770(var4, 1670772149);
               var5.method10626(var1);
            }

            var4 = 0;
            int var12 = 0;
            int var6 = this.aClass284_Sub1_10023.method3774(this, -902869586);

            for(int var7 = 0; var7 < var2 + var3; ++var7) {
               Class526_Sub13_Sub1_Sub1 var8 = (Class526_Sub13_Sub1_Sub1)(var7 < var2?this.aClass284_Sub1_10023.method3777(var7, -1814615609):this.aClass284_Sub1_10023.method3770(var7 - var2, 1670772149));
               Class260 var9 = var8.method10632(-2020700187);
               int var10 = 1;
               if(var9 == Class260.aClass260_2839) {
                  var9 = var8.method10629(672270983);
                  var10 = var8.method10628((byte)30);
               }

               switch(var9.anInt2962 * -38035463) {
               case 8:
               case 13:
               case 21:
               case 80:
                  var10 *= 4;
                  break;
               case 15:
               case 16:
               case 24:
               case 35:
                  var10 *= 2;
                  break;
               case 25:
               case 83:
               case 107:
               case 113:
                  var10 *= 3;
               case 39:
               case 78:
               case 87:
               case 101:
               case 116:
                  break;
               default:
                  var10 = 0;
               }

               int var11;
               if(var8.anIntArray12034[var6] >= 0) {
                  var11 = var8.anIntArray12034[var6] + var10;
                  if(var4 < var11) {
                     var4 = var11;
                  }
               }

               if(var8.anIntArray12036[var6] >= 0) {
                  var11 = var8.anIntArray12036[var6] + var10;
                  if(var12 < var11) {
                     var12 = var11;
                  }
               }
            }

            this.aFloatArrayArray10016[0] = new float[var4 * 4];
            this.aFloatArrayArray10016[1] = new float[var12 * 4];
            this.aBool10017 = true;
            return true;
         }
      }
   }

   void method3640(Class526_Sub13_Sub1 var1, float var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1141748518) != Class260.aClass260_2853 && var1.method10632(-1294215296) != Class260.aClass260_2907) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            var3 *= 4;
            this.aFloatArrayArray10016[0][var3] = var2;
            this.aBoolArray10027[0] = true;
         }

         if(var4 >= 0) {
            var4 *= 4;
            this.aFloatArrayArray10016[1][var4] = var2;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   void method3627(Class526_Sub13_Sub1 var1, float var2, float var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var5 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1891312150) != Class260.aClass260_2842) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var4 >= 0) {
            var4 *= 4;
            this.aFloatArrayArray10016[0][var4 + 0] = var2;
            this.aFloatArrayArray10016[0][var4 + 1] = var3;
            this.aBoolArray10027[0] = true;
         }

         if(var5 >= 0) {
            var5 *= 4;
            this.aFloatArrayArray10016[1][var5 + 0] = var2;
            this.aFloatArrayArray10016[1][var5 + 1] = var3;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   void method3658(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5112(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 8);
      this.aBoolArray10027[var3] = true;
   }

   void method3628(Class526_Sub13_Sub1 var1, Class433 var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1000390045) != Class260.aClass260_2878) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            this.method9061(var3, var2.method5112(aFloatArray10021), 8);
         }

         if(var4 >= 0) {
            this.method9062(var4, var2.method5112(aFloatArray10021), 8);
         }

      }
   }

   void method3629(Class526_Sub13_Sub1 var1, Class433 var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1123076814) != Class260.aClass260_2880) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            this.method9061(var3, var2.method5088(aFloatArray10021), 16);
         }

         if(var4 >= 0) {
            this.method9062(var4, var2.method5088(aFloatArray10021), 16);
         }

      }
   }

   void method3660(Class526_Sub13_Sub1 var1, float[] var2, int var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var5 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1603343236) != Class260.aClass260_2839) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var4 >= 0) {
            this.method9061(var4, var2, var3);
         }

         if(var5 >= 0) {
            this.method9062(var5, var2, var3);
         }

      }
   }

   void method3630(Class526_Sub13_Sub1 var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub1_10026.method8788(var2);
      this.aClass174_Sub3_Sub1_10026.method8841(var3);
   }

   void method3631(int var1, float var2, float var3, float var4) {
      int var5 = var1 >> 16;
      int var6 = (var1 & '\uffff') * 4;
      this.aFloatArrayArray10016[var5][var6] = var2;
      this.aFloatArrayArray10016[var5][var6 + 1] = var3;
      this.aFloatArrayArray10016[var5][var6 + 2] = var4;
      this.aBoolArray10027[var5] = true;
   }

   void method3632(int var1, float var2, float var3, float var4, float var5) {
      int var6 = var1 >> 16;
      int var7 = (var1 & '\uffff') * 4;
      this.aFloatArrayArray10016[var6][var7] = var2;
      this.aFloatArrayArray10016[var6][var7 + 1] = var3;
      this.aFloatArrayArray10016[var6][var7 + 2] = var4;
      this.aFloatArrayArray10016[var6][var7 + 3] = var5;
      this.aBoolArray10027[var6] = true;
   }

   void method3634(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5088(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 12);
      this.aBoolArray10027[var3] = true;
   }

   void method3650(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5112(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 8);
      this.aBoolArray10027[var3] = true;
   }

   void method3633(int var1, float[] var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = (var1 & '\uffff') * 4;
      System.arraycopy(var2, 0, this.aFloatArrayArray10016[var4], var5, var3);
      this.aBoolArray10027[var4] = true;
   }

   final void method9061(int var1, float[] var2, int var3) {
      Class691.method8100(var2, 0, this.aFloatArrayArray10016[0], var1 * 4, var3);
      this.aBoolArray10027[0] = true;
   }

   final void method9062(int var1, float[] var2, int var3) {
      Class691.method8100(var2, 0, this.aFloatArrayArray10016[1], var1 * 4, var3);
      this.aBoolArray10027[1] = true;
   }

   void method3637(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub1_10026.method8788(var2);
      this.aClass174_Sub3_Sub1_10026.method8841(var3);
   }

   void method3626(Class526_Sub13_Sub1 var1, float var2, float var3, float var4, float var5) {
      int var6 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var7 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1962278761) != Class260.aClass260_2889) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var6 >= 0) {
            var6 *= 4;
            this.aFloatArrayArray10016[0][var6 + 0] = var2;
            this.aFloatArrayArray10016[0][var6 + 1] = var3;
            this.aFloatArrayArray10016[0][var6 + 2] = var4;
            this.aFloatArrayArray10016[0][var6 + 3] = var5;
            this.aBoolArray10027[0] = true;
         }

         if(var7 >= 0) {
            var7 *= 4;
            this.aFloatArrayArray10016[1][var7 + 0] = var2;
            this.aFloatArrayArray10016[1][var7 + 1] = var3;
            this.aFloatArrayArray10016[1][var7 + 2] = var4;
            this.aFloatArrayArray10016[1][var7 + 3] = var5;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   public void method140() {
      if(this.aLong10025 != 0L) {
         IUnknown.Release(this.aLong10025);
         this.aLong10025 = 0L;
      }

      if(this.aLong10019 != 0L) {
         IUnknown.Release(this.aLong10019);
         this.aLong10019 = 0L;
      }

      this.aClass174_Sub3_Sub1_10026.method8716(this);
   }

   void method3655(int var1, float var2, float var3, float var4, float var5) {
      int var6 = var1 >> 16;
      int var7 = (var1 & '\uffff') * 4;
      this.aFloatArrayArray10016[var6][var7] = var2;
      this.aFloatArrayArray10016[var6][var7 + 1] = var3;
      this.aFloatArrayArray10016[var6][var7 + 2] = var4;
      this.aFloatArrayArray10016[var6][var7 + 3] = var5;
      this.aBoolArray10027[var6] = true;
   }

   public void finalize() {
      this.method9063();
   }

   void method9063() {
      if(this.aLong10025 != 0L) {
         this.aClass174_Sub3_Sub1_10026.method10508(this.aLong10025);
         this.aLong10025 = 0L;
      }

      if(this.aLong10019 != 0L) {
         this.aClass174_Sub3_Sub1_10026.method10508(this.aLong10019);
         this.aLong10019 = 0L;
      }

   }

   public void method141() {
      if(this.aLong10025 != 0L) {
         IUnknown.Release(this.aLong10025);
         this.aLong10025 = 0L;
      }

      if(this.aLong10019 != 0L) {
         IUnknown.Release(this.aLong10019);
         this.aLong10019 = 0L;
      }

      this.aClass174_Sub3_Sub1_10026.method8716(this);
   }

   void method9064() {
      this.method9063();
   }

   void method9065() {
      this.method9063();
   }

   void method3651(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub1_10026.method8788(var2);
      this.aClass174_Sub3_Sub1_10026.method8841(var3);
   }

   public boolean method3647() {
      if(this.aBool10017) {
         return true;
      } else {
         this.aLong10025 = this.aByteArray10022 == null?0L:IDirect3DDevice.CreateVertexShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10022);
         this.aLong10019 = this.aByteArray10020 == null?0L:IDirect3DDevice.CreatePixelShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10020);
         if(this.aLong10025 == 0L && this.aLong10019 == 0L) {
            return false;
         } else {
            int var1 = -1;

            int var2;
            for(var2 = 0; var2 < this.aClass284_Sub1_10023.method3727(628049994); ++var2) {
               if(this.aClass284_Sub1_10023.method3755(var2, -1826253843) == this) {
                  var1 = var2;
                  break;
               }
            }

            var2 = this.aClass284_Sub1_10023.method3753(928012208);
            int var3 = this.aClass284_Sub1_10023.method3751((short)-20461);

            int var4;
            Class526_Sub13_Sub1 var5;
            for(var4 = 0; var4 < var2; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3777(var4, 490403553);
               var5.method10626(var1);
            }

            for(var4 = 0; var4 < var3; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3770(var4, 1670772149);
               var5.method10626(var1);
            }

            var4 = 0;
            int var12 = 0;
            int var6 = this.aClass284_Sub1_10023.method3774(this, -756769292);

            for(int var7 = 0; var7 < var2 + var3; ++var7) {
               Class526_Sub13_Sub1_Sub1 var8 = (Class526_Sub13_Sub1_Sub1)(var7 < var2?this.aClass284_Sub1_10023.method3777(var7, -339073330):this.aClass284_Sub1_10023.method3770(var7 - var2, 1670772149));
               Class260 var9 = var8.method10632(-1055601672);
               int var10 = 1;
               if(var9 == Class260.aClass260_2839) {
                  var9 = var8.method10629(254123643);
                  var10 = var8.method10628((byte)24);
               }

               switch(var9.anInt2962 * -38035463) {
               case 8:
               case 13:
               case 21:
               case 80:
                  var10 *= 4;
                  break;
               case 15:
               case 16:
               case 24:
               case 35:
                  var10 *= 2;
                  break;
               case 25:
               case 83:
               case 107:
               case 113:
                  var10 *= 3;
               case 39:
               case 78:
               case 87:
               case 101:
               case 116:
                  break;
               default:
                  var10 = 0;
               }

               int var11;
               if(var8.anIntArray12034[var6] >= 0) {
                  var11 = var8.anIntArray12034[var6] + var10;
                  if(var4 < var11) {
                     var4 = var11;
                  }
               }

               if(var8.anIntArray12036[var6] >= 0) {
                  var11 = var8.anIntArray12036[var6] + var10;
                  if(var12 < var11) {
                     var12 = var11;
                  }
               }
            }

            this.aFloatArrayArray10016[0] = new float[var4 * 4];
            this.aFloatArrayArray10016[1] = new float[var12 * 4];
            this.aBool10017 = true;
            return true;
         }
      }
   }

   public boolean method3625() {
      if(this.aBool10017) {
         return true;
      } else {
         this.aLong10025 = this.aByteArray10022 == null?0L:IDirect3DDevice.CreateVertexShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10022);
         this.aLong10019 = this.aByteArray10020 == null?0L:IDirect3DDevice.CreatePixelShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10020);
         if(this.aLong10025 == 0L && this.aLong10019 == 0L) {
            return false;
         } else {
            int var1 = -1;

            int var2;
            for(var2 = 0; var2 < this.aClass284_Sub1_10023.method3727(1563973166); ++var2) {
               if(this.aClass284_Sub1_10023.method3755(var2, -2034916901) == this) {
                  var1 = var2;
                  break;
               }
            }

            var2 = this.aClass284_Sub1_10023.method3753(372623599);
            int var3 = this.aClass284_Sub1_10023.method3751((short)-20030);

            int var4;
            Class526_Sub13_Sub1 var5;
            for(var4 = 0; var4 < var2; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3777(var4, 188145029);
               var5.method10626(var1);
            }

            for(var4 = 0; var4 < var3; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3770(var4, 1670772149);
               var5.method10626(var1);
            }

            var4 = 0;
            int var12 = 0;
            int var6 = this.aClass284_Sub1_10023.method3774(this, -3782697);

            for(int var7 = 0; var7 < var2 + var3; ++var7) {
               Class526_Sub13_Sub1_Sub1 var8 = (Class526_Sub13_Sub1_Sub1)(var7 < var2?this.aClass284_Sub1_10023.method3777(var7, -1651193794):this.aClass284_Sub1_10023.method3770(var7 - var2, 1670772149));
               Class260 var9 = var8.method10632(-1154622070);
               int var10 = 1;
               if(var9 == Class260.aClass260_2839) {
                  var9 = var8.method10629(1090595460);
                  var10 = var8.method10628((byte)88);
               }

               switch(var9.anInt2962 * -38035463) {
               case 8:
               case 13:
               case 21:
               case 80:
                  var10 *= 4;
                  break;
               case 15:
               case 16:
               case 24:
               case 35:
                  var10 *= 2;
                  break;
               case 25:
               case 83:
               case 107:
               case 113:
                  var10 *= 3;
               case 39:
               case 78:
               case 87:
               case 101:
               case 116:
                  break;
               default:
                  var10 = 0;
               }

               int var11;
               if(var8.anIntArray12034[var6] >= 0) {
                  var11 = var8.anIntArray12034[var6] + var10;
                  if(var4 < var11) {
                     var4 = var11;
                  }
               }

               if(var8.anIntArray12036[var6] >= 0) {
                  var11 = var8.anIntArray12036[var6] + var10;
                  if(var12 < var11) {
                     var12 = var11;
                  }
               }
            }

            this.aFloatArrayArray10016[0] = new float[var4 * 4];
            this.aFloatArrayArray10016[1] = new float[var12 * 4];
            this.aBool10017 = true;
            return true;
         }
      }
   }

   public boolean method3643() {
      if(this.aBool10017) {
         return true;
      } else {
         this.aLong10025 = this.aByteArray10022 == null?0L:IDirect3DDevice.CreateVertexShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10022);
         this.aLong10019 = this.aByteArray10020 == null?0L:IDirect3DDevice.CreatePixelShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10020);
         if(this.aLong10025 == 0L && this.aLong10019 == 0L) {
            return false;
         } else {
            int var1 = -1;

            int var2;
            for(var2 = 0; var2 < this.aClass284_Sub1_10023.method3727(186402038); ++var2) {
               if(this.aClass284_Sub1_10023.method3755(var2, -1994082077) == this) {
                  var1 = var2;
                  break;
               }
            }

            var2 = this.aClass284_Sub1_10023.method3753(-317221722);
            int var3 = this.aClass284_Sub1_10023.method3751((short)6672);

            int var4;
            Class526_Sub13_Sub1 var5;
            for(var4 = 0; var4 < var2; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3777(var4, -125410637);
               var5.method10626(var1);
            }

            for(var4 = 0; var4 < var3; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3770(var4, 1670772149);
               var5.method10626(var1);
            }

            var4 = 0;
            int var12 = 0;
            int var6 = this.aClass284_Sub1_10023.method3774(this, -818531633);

            for(int var7 = 0; var7 < var2 + var3; ++var7) {
               Class526_Sub13_Sub1_Sub1 var8 = (Class526_Sub13_Sub1_Sub1)(var7 < var2?this.aClass284_Sub1_10023.method3777(var7, -2019850085):this.aClass284_Sub1_10023.method3770(var7 - var2, 1670772149));
               Class260 var9 = var8.method10632(-1048848944);
               int var10 = 1;
               if(var9 == Class260.aClass260_2839) {
                  var9 = var8.method10629(1576394774);
                  var10 = var8.method10628((byte)31);
               }

               switch(var9.anInt2962 * -38035463) {
               case 8:
               case 13:
               case 21:
               case 80:
                  var10 *= 4;
                  break;
               case 15:
               case 16:
               case 24:
               case 35:
                  var10 *= 2;
                  break;
               case 25:
               case 83:
               case 107:
               case 113:
                  var10 *= 3;
               case 39:
               case 78:
               case 87:
               case 101:
               case 116:
                  break;
               default:
                  var10 = 0;
               }

               int var11;
               if(var8.anIntArray12034[var6] >= 0) {
                  var11 = var8.anIntArray12034[var6] + var10;
                  if(var4 < var11) {
                     var4 = var11;
                  }
               }

               if(var8.anIntArray12036[var6] >= 0) {
                  var11 = var8.anIntArray12036[var6] + var10;
                  if(var12 < var11) {
                     var12 = var11;
                  }
               }
            }

            this.aFloatArrayArray10016[0] = new float[var4 * 4];
            this.aFloatArrayArray10016[1] = new float[var12 * 4];
            this.aBool10017 = true;
            return true;
         }
      }
   }

   void method3644(Class526_Sub13_Sub1 var1, float var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1267153156) != Class260.aClass260_2853 && var1.method10632(-1899476577) != Class260.aClass260_2907) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            var3 *= 4;
            this.aFloatArrayArray10016[0][var3] = var2;
            this.aBoolArray10027[0] = true;
         }

         if(var4 >= 0) {
            var4 *= 4;
            this.aFloatArrayArray10016[1][var4] = var2;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   void method3645(Class526_Sub13_Sub1 var1, float var2, float var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var5 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1242510457) != Class260.aClass260_2842) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var4 >= 0) {
            var4 *= 4;
            this.aFloatArrayArray10016[0][var4 + 0] = var2;
            this.aFloatArrayArray10016[0][var4 + 1] = var3;
            this.aBoolArray10027[0] = true;
         }

         if(var5 >= 0) {
            var5 *= 4;
            this.aFloatArrayArray10016[1][var5 + 0] = var2;
            this.aFloatArrayArray10016[1][var5 + 1] = var3;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   void method3646(Class526_Sub13_Sub1 var1, float var2, float var3, float var4) {
      int var5 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var6 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1162173322) != Class260.aClass260_2863) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var5 >= 0) {
            var5 *= 4;
            this.aFloatArrayArray10016[0][var5 + 0] = var2;
            this.aFloatArrayArray10016[0][var5 + 1] = var3;
            this.aFloatArrayArray10016[0][var5 + 2] = var4;
            this.aBoolArray10027[0] = true;
         }

         if(var6 >= 0) {
            var6 *= 4;
            this.aFloatArrayArray10016[1][var6 + 0] = var2;
            this.aFloatArrayArray10016[1][var6 + 1] = var3;
            this.aFloatArrayArray10016[1][var6 + 2] = var4;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   void method3623(Class526_Sub13_Sub1 var1, float var2, float var3, float var4) {
      int var5 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var6 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1975914512) != Class260.aClass260_2863) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var5 >= 0) {
            var5 *= 4;
            this.aFloatArrayArray10016[0][var5 + 0] = var2;
            this.aFloatArrayArray10016[0][var5 + 1] = var3;
            this.aFloatArrayArray10016[0][var5 + 2] = var4;
            this.aBoolArray10027[0] = true;
         }

         if(var6 >= 0) {
            var6 *= 4;
            this.aFloatArrayArray10016[1][var6 + 0] = var2;
            this.aFloatArrayArray10016[1][var6 + 1] = var3;
            this.aFloatArrayArray10016[1][var6 + 2] = var4;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   void method3649(Class526_Sub13_Sub1 var1, float[] var2, int var3) {
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var5 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1450341271) != Class260.aClass260_2839) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var4 >= 0) {
            this.method9061(var4, var2, var3);
         }

         if(var5 >= 0) {
            this.method9062(var5, var2, var3);
         }

      }
   }

   void method3620(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5112(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 8);
      this.aBoolArray10027[var3] = true;
   }

   void method3653(int var1, float var2, float var3, float var4) {
      int var5 = var1 >> 16;
      int var6 = (var1 & '\uffff') * 4;
      this.aFloatArrayArray10016[var5][var6] = var2;
      this.aFloatArrayArray10016[var5][var6 + 1] = var3;
      this.aFloatArrayArray10016[var5][var6 + 2] = var4;
      this.aBoolArray10027[var5] = true;
   }

   void method3636(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5088(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 16);
      this.aBoolArray10027[var3] = true;
   }

   void method3642(Class526_Sub13_Sub1 var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub1_10026.method8788(var2);
      this.aClass174_Sub3_Sub1_10026.method8841(var3);
   }

   void method3652(int var1, float var2, float var3, float var4) {
      int var5 = var1 >> 16;
      int var6 = (var1 & '\uffff') * 4;
      this.aFloatArrayArray10016[var5][var6] = var2;
      this.aFloatArrayArray10016[var5][var6 + 1] = var3;
      this.aFloatArrayArray10016[var5][var6 + 2] = var4;
      this.aBoolArray10027[var5] = true;
   }

   void method3624(Class526_Sub13_Sub1 var1, Class433 var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1866048979) != Class260.aClass260_2878) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            this.method9061(var3, var2.method5112(aFloatArray10021), 8);
         }

         if(var4 >= 0) {
            this.method9062(var4, var2.method5112(aFloatArray10021), 8);
         }

      }
   }

   void method3665(Class526_Sub13_Sub1 var1, Class433 var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1153088029) != Class260.aClass260_2880) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            this.method9061(var3, var2.method5088(aFloatArray10021), 16);
         }

         if(var4 >= 0) {
            this.method9062(var4, var2.method5088(aFloatArray10021), 16);
         }

      }
   }

   void method9066() {
      if(this.aBoolArray10027[0]) {
         this.aClass174_Sub3_Sub1_10026.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_10026.aByteBuffer9684.asFloatBuffer().put(this.aFloatArrayArray10016[0]);
         IDirect3DDevice.SetVertexShaderConstantF(this.aClass174_Sub3_Sub1_10026.aLong11450, 0, this.aClass174_Sub3_Sub1_10026.aLong9685, this.aFloatArrayArray10016[0].length / 4);
         this.aBoolArray10027[0] = false;
      }

      if(this.aBoolArray10027[1]) {
         this.aClass174_Sub3_Sub1_10026.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_10026.aByteBuffer9684.asFloatBuffer().put(this.aFloatArrayArray10016[1]);
         IDirect3DDevice.SetPixelShaderConstantF(this.aClass174_Sub3_Sub1_10026.aLong11450, 0, this.aClass174_Sub3_Sub1_10026.aLong9685, this.aFloatArrayArray10016[1].length / 4);
         this.aBoolArray10027[1] = false;
      }

   }

   void method3656(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5088(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 12);
      this.aBoolArray10027[var3] = true;
   }

   void method3648(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5088(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 16);
      this.aBoolArray10027[var3] = true;
   }

   void method3657(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5088(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 12);
      this.aBoolArray10027[var3] = true;
   }

   void method3659(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5112(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 8);
      this.aBoolArray10027[var3] = true;
   }

   Class276_Sub1(Class174_Sub3_Sub1 var1, Class284_Sub1 var2, Class266 var3) {
      this(var1, var3);
      this.aClass174_Sub3_Sub1_10026 = var1;
      this.aClass284_Sub1_10023 = var2;
   }

   void method9067() {
      if(this.aLong10025 != 0L) {
         this.aClass174_Sub3_Sub1_10026.method10508(this.aLong10025);
         this.aLong10025 = 0L;
      }

      if(this.aLong10019 != 0L) {
         this.aClass174_Sub3_Sub1_10026.method10508(this.aLong10019);
         this.aLong10019 = 0L;
      }

   }

   void method3635(Class526_Sub13_Sub1 var1, float var2, float var3, float var4) {
      int var5 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var6 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1596458675) != Class260.aClass260_2863) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var5 >= 0) {
            var5 *= 4;
            this.aFloatArrayArray10016[0][var5 + 0] = var2;
            this.aFloatArrayArray10016[0][var5 + 1] = var3;
            this.aFloatArrayArray10016[0][var5 + 2] = var4;
            this.aBoolArray10027[0] = true;
         }

         if(var6 >= 0) {
            var6 *= 4;
            this.aFloatArrayArray10016[1][var6 + 0] = var2;
            this.aFloatArrayArray10016[1][var6 + 1] = var3;
            this.aFloatArrayArray10016[1][var6 + 2] = var4;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   void method3663(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5088(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 16);
      this.aBoolArray10027[var3] = true;
   }

   void method3664(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub1_10026.method8788(var2);
      this.aClass174_Sub3_Sub1_10026.method8841(var3);
   }

   public boolean method3641() {
      if(this.aBool10017) {
         return true;
      } else {
         this.aLong10025 = this.aByteArray10022 == null?0L:IDirect3DDevice.CreateVertexShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10022);
         this.aLong10019 = this.aByteArray10020 == null?0L:IDirect3DDevice.CreatePixelShader(this.aClass174_Sub3_Sub1_10026.aLong11450, this.aByteArray10020);
         if(this.aLong10025 == 0L && this.aLong10019 == 0L) {
            return false;
         } else {
            int var1 = -1;

            int var2;
            for(var2 = 0; var2 < this.aClass284_Sub1_10023.method3727(1123046769); ++var2) {
               if(this.aClass284_Sub1_10023.method3755(var2, -2005036990) == this) {
                  var1 = var2;
                  break;
               }
            }

            var2 = this.aClass284_Sub1_10023.method3753(1225547965);
            int var3 = this.aClass284_Sub1_10023.method3751((short)-22259);

            int var4;
            Class526_Sub13_Sub1 var5;
            for(var4 = 0; var4 < var2; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3777(var4, -1235354697);
               var5.method10626(var1);
            }

            for(var4 = 0; var4 < var3; ++var4) {
               var5 = this.aClass284_Sub1_10023.method3770(var4, 1670772149);
               var5.method10626(var1);
            }

            var4 = 0;
            int var12 = 0;
            int var6 = this.aClass284_Sub1_10023.method3774(this, -1049420283);

            for(int var7 = 0; var7 < var2 + var3; ++var7) {
               Class526_Sub13_Sub1_Sub1 var8 = (Class526_Sub13_Sub1_Sub1)(var7 < var2?this.aClass284_Sub1_10023.method3777(var7, 581894722):this.aClass284_Sub1_10023.method3770(var7 - var2, 1670772149));
               Class260 var9 = var8.method10632(-2064225613);
               int var10 = 1;
               if(var9 == Class260.aClass260_2839) {
                  var9 = var8.method10629(2108688387);
                  var10 = var8.method10628((byte)-26);
               }

               switch(var9.anInt2962 * -38035463) {
               case 8:
               case 13:
               case 21:
               case 80:
                  var10 *= 4;
                  break;
               case 15:
               case 16:
               case 24:
               case 35:
                  var10 *= 2;
                  break;
               case 25:
               case 83:
               case 107:
               case 113:
                  var10 *= 3;
               case 39:
               case 78:
               case 87:
               case 101:
               case 116:
                  break;
               default:
                  var10 = 0;
               }

               int var11;
               if(var8.anIntArray12034[var6] >= 0) {
                  var11 = var8.anIntArray12034[var6] + var10;
                  if(var4 < var11) {
                     var4 = var11;
                  }
               }

               if(var8.anIntArray12036[var6] >= 0) {
                  var11 = var8.anIntArray12036[var6] + var10;
                  if(var12 < var11) {
                     var12 = var11;
                  }
               }
            }

            this.aFloatArrayArray10016[0] = new float[var4 * 4];
            this.aFloatArrayArray10016[1] = new float[var12 * 4];
            this.aBool10017 = true;
            return true;
         }
      }
   }

   void method3666(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub1_10026.method8788(var2);
      this.aClass174_Sub3_Sub1_10026.method8841(var3);
   }

   void method3667(int var1, int var2, Interface41 var3) {
      this.aClass174_Sub3_Sub1_10026.method8788(var2);
      this.aClass174_Sub3_Sub1_10026.method8841(var3);
   }

   void method3668(Class526_Sub13_Sub1 var1, float var2, float var3, float var4, float var5) {
      int var6 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var7 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1754186768) != Class260.aClass260_2889) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var6 >= 0) {
            var6 *= 4;
            this.aFloatArrayArray10016[0][var6 + 0] = var2;
            this.aFloatArrayArray10016[0][var6 + 1] = var3;
            this.aFloatArrayArray10016[0][var6 + 2] = var4;
            this.aFloatArrayArray10016[0][var6 + 3] = var5;
            this.aBoolArray10027[0] = true;
         }

         if(var7 >= 0) {
            var7 *= 4;
            this.aFloatArrayArray10016[1][var7 + 0] = var2;
            this.aFloatArrayArray10016[1][var7 + 1] = var3;
            this.aFloatArrayArray10016[1][var7 + 2] = var4;
            this.aFloatArrayArray10016[1][var7 + 3] = var5;
            this.aBoolArray10027[1] = true;
         }

      }
   }

   void method3669(int var1, float[] var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = (var1 & '\uffff') * 4;
      System.arraycopy(var2, 0, this.aFloatArrayArray10016[var4], var5, var3);
      this.aBoolArray10027[var4] = true;
   }

   void method3662(Class526_Sub13_Sub1 var1, Class433 var2) {
      int var3 = ((Class526_Sub13_Sub1_Sub1)var1).method10865();
      int var4 = ((Class526_Sub13_Sub1_Sub1)var1).method10866();
      if(var1.method10632(-1407072729) != Class260.aClass260_2878) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            this.method9061(var3, var2.method5112(aFloatArray10021), 8);
         }

         if(var4 >= 0) {
            this.method9062(var4, var2.method5112(aFloatArray10021), 8);
         }

      }
   }

   void method3654(int var1, float var2, float var3, float var4, float var5) {
      int var6 = var1 >> 16;
      int var7 = (var1 & '\uffff') * 4;
      this.aFloatArrayArray10016[var6][var7] = var2;
      this.aFloatArrayArray10016[var6][var7 + 1] = var3;
      this.aFloatArrayArray10016[var6][var7 + 2] = var4;
      this.aFloatArrayArray10016[var6][var7 + 3] = var5;
      this.aBoolArray10027[var6] = true;
   }

   void method3670(int var1, float[] var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = (var1 & '\uffff') * 4;
      System.arraycopy(var2, 0, this.aFloatArrayArray10016[var4], var5, var3);
      this.aBoolArray10027[var4] = true;
   }

   void method9068() {
      if(this.aBoolArray10027[0]) {
         this.aClass174_Sub3_Sub1_10026.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_10026.aByteBuffer9684.asFloatBuffer().put(this.aFloatArrayArray10016[0]);
         IDirect3DDevice.SetVertexShaderConstantF(this.aClass174_Sub3_Sub1_10026.aLong11450, 0, this.aClass174_Sub3_Sub1_10026.aLong9685, this.aFloatArrayArray10016[0].length / 4);
         this.aBoolArray10027[0] = false;
      }

      if(this.aBoolArray10027[1]) {
         this.aClass174_Sub3_Sub1_10026.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_10026.aByteBuffer9684.asFloatBuffer().put(this.aFloatArrayArray10016[1]);
         IDirect3DDevice.SetPixelShaderConstantF(this.aClass174_Sub3_Sub1_10026.aLong11450, 0, this.aClass174_Sub3_Sub1_10026.aLong9685, this.aFloatArrayArray10016[1].length / 4);
         this.aBoolArray10027[1] = false;
      }

   }

   void method3622(int var1, Class433 var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method5088(aFloatArray10021), 0, this.aFloatArrayArray10016[var3], var4, 12);
      this.aBoolArray10027[var3] = true;
   }
}
