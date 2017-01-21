package com.jagex;

import com.jagex.Class265;
import com.jagex.Class318_Sub2;
import com.jagex.Class456;
import com.jagex.Class466;
import com.jagex.Class470;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.RSByteBuffer;
import com.jagex.Class546;
import com.jagex.Class552;
import com.jagex.Class63;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class642;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class692;
import com.jagex.Class705;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface59;
import com.jagex.Interface7;
import com.jagex.client;
import java.lang.reflect.Array;
import java.util.Iterator;

public class Class59 implements Interface14 {
   Interface12 anInterface12_726;
   Interface7 anInterface7_722;
   Class642 aClass642_723;
   Class466 aClass466_725;
   protected int anInt724;
   Interface12[] anInterface12Array727;

   public int method87(int var1) {
      return this.anInterface12Array727.length;
   }

   public Iterator method1029() {
      return new Class63(this);
   }

   void method1030(int var1, byte var2) {
      if(null == this.anInterface12Array727[var1]) {
         try {
            this.anInterface12Array727[var1] = this.anInterface7_722.method64(var1, this, -435085044);
         } catch (Exception var4) {
            var4.printStackTrace();
            return;
         }

         Object var3 = null;
         byte[] var5 = Class456.method5409(this.aClass466_725, this.aClass642_723, var1, 1096811986);
         if(null != var5) {
            this.anInterface12Array727[var1].method82(new RSByteBuffer(var5), -595267770);
         }

         this.anInterface12Array727[var1].method81(-1225523909);
      }
   }

   void method1031(int var1) {
      if(null == this.anInterface12Array727[var1]) {
         try {
            this.anInterface12Array727[var1] = this.anInterface7_722.method64(var1, this, -435085044);
         } catch (Exception var3) {
            var3.printStackTrace();
            return;
         }

         Object var2 = null;
         byte[] var4 = Class456.method5409(this.aClass466_725, this.aClass642_723, var1, -1551935909);
         if(null != var4) {
            this.anInterface12Array727[var1].method82(new RSByteBuffer(var4), -595267770);
         }

         this.anInterface12Array727[var1].method81(-958963875);
      }
   }

   public Iterator iterator() {
      return new Class63(this);
   }

   public Interface12 method88(int var1) {
      if(var1 < 0) {
         if(null == this.anInterface12_726) {
            this.anInterface12_726 = this.anInterface7_722.method64(-1, this, -435085044);
         }

         return this.anInterface12_726;
      } else {
         if(null == this.anInterface12Array727[var1]) {
            this.method1030(var1, (byte)66);
         }

         return this.anInterface12Array727[var1];
      }
   }

   public Interface12 method86(int var1) {
      if(var1 < 0) {
         if(null == this.anInterface12_726) {
            this.anInterface12_726 = this.anInterface7_722.method64(-1, this, -435085044);
         }

         return this.anInterface12_726;
      } else {
         if(null == this.anInterface12Array727[var1]) {
            this.method1030(var1, (byte)95);
         }

         return this.anInterface12Array727[var1];
      }
   }

   public Interface12 method89(int var1, int var2) {
      if(var1 < 0) {
         if(null == this.anInterface12_726) {
            this.anInterface12_726 = this.anInterface7_722.method64(-1, this, -435085044);
         }

         return this.anInterface12_726;
      } else {
         if(null == this.anInterface12Array727[var1]) {
            this.method1030(var1, (byte)119);
         }

         return this.anInterface12Array727[var1];
      }
   }

   public int method90() {
      return this.anInterface12Array727.length;
   }

   public Iterator method1032() {
      return new Class63(this);
   }

   void method1033(int var1) {
      if(null == this.anInterface12Array727[var1]) {
         try {
            this.anInterface12Array727[var1] = this.anInterface7_722.method64(var1, this, -435085044);
         } catch (Exception var3) {
            var3.printStackTrace();
            return;
         }

         Object var2 = null;
         byte[] var4 = Class456.method5409(this.aClass466_725, this.aClass642_723, var1, -423561940);
         if(null != var4) {
            this.anInterface12Array727[var1].method82(new RSByteBuffer(var4), -595267770);
         }

         this.anInterface12Array727[var1].method81(1358909642);
      }
   }

   Class59(Class676 var1, Class673 var2, Class642 var3, Class466 var4, Interface7 var5, boolean var6) {
      this.anInterface7_722 = var5;
      this.aClass642_723 = var3;
      this.aClass466_725 = var4;
      this.anInt724 = Class318_Sub2.method9086(this.aClass466_725, this.aClass642_723, -192791227) * 1063904943;
      this.anInterface12Array727 = (Interface12[])((Interface12[])Array.newInstance(this.anInterface7_722.method59(-1464873433), -1841352625 * this.anInt724));
      if(var6) {
         for(int var7 = 0; var7 < -1841352625 * this.anInt724; ++var7) {
            this.method1030(var7, (byte)74);
         }
      }

   }

   static final boolean method1034(Class552[][][] var0, int var1, int var2, int var3, boolean var4, byte var5) {
      byte[][][] var6 = client.aClass505_11204.method6069((byte)72);
      byte var7 = var4?1:(byte)(1242714411 * client.anInt11126 & 255);
      if(var6[Class692.anInt8703 * -395336755][var2][var3] == var7) {
         return false;
      } else {
         Class470 var8 = client.aClass505_11204.method6094((byte)-12);
         if(0 == (var8.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var2][var3] & 4)) {
            return false;
         } else {
            byte var9 = 0;
            int var10 = 0;
            client.anIntArray11085[var9] = var2;
            int var26 = var9 + 1;
            client.anIntArray11086[var9] = var3;
            var6[Class692.anInt8703 * -395336755][var2][var3] = var7;

            while(var10 != var26) {
               int var11 = client.anIntArray11085[var10] & '\uffff';
               int var12 = client.anIntArray11085[var10] >> 16 & 255;
               int var13 = client.anIntArray11085[var10] >> 24 & 255;
               int var14 = client.anIntArray11086[var10] & '\uffff';
               int var15 = client.anIntArray11086[var10] >> 16 & 255;
               var10 = var10 + 1 & 4095;
               boolean var16 = false;
               if((var8.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var11][var14] & 4) == 0) {
                  var16 = true;
               }

               boolean var17 = false;
               int var18;
               int var19;
               int var20;
               if(var0 != null) {
                  label240:
                  for(var18 = -395336755 * Class692.anInt8703 + 1; var18 <= 3; ++var18) {
                     if(null != var0[var18] && (var8.aByteArrayArrayArray5356[var18][var11][var14] & 8) == 0) {
                        Class639_Sub1_Sub2 var21;
                        int var23;
                        int var24;
                        int var25;
                        Class552 var27;
                        Class546 var28;
                        if(var16 && var0[var18][var11][var14] != null) {
                           if(null != var0[var18][var11][var14].aClass639_Sub1_Sub1_7351) {
                              var19 = Class705.method8289(var12, 1857543747);
                              if(var0[var18][var11][var14].aClass639_Sub1_Sub1_7351.aShort11794 == var19 || null != var0[var18][var11][var14].aClass639_Sub1_Sub1_7350 && var0[var18][var11][var14].aClass639_Sub1_Sub1_7350.aShort11794 == var19) {
                                 continue;
                              }

                              if(0 != var13) {
                                 var20 = Class705.method8289(var13, -808786930);
                                 if(var20 == var0[var18][var11][var14].aClass639_Sub1_Sub1_7351.aShort11794 || null != var0[var18][var11][var14].aClass639_Sub1_Sub1_7350 && var0[var18][var11][var14].aClass639_Sub1_Sub1_7350.aShort11794 == var20) {
                                    continue;
                                 }
                              }

                              if(0 != var15) {
                                 var20 = Class705.method8289(var15, -44473583);
                                 if(var0[var18][var11][var14].aClass639_Sub1_Sub1_7351.aShort11794 == var20 || null != var0[var18][var11][var14].aClass639_Sub1_Sub1_7350 && var20 == var0[var18][var11][var14].aClass639_Sub1_Sub1_7350.aShort11794) {
                                    continue;
                                 }
                              }
                           }

                           var27 = var0[var18][var11][var14];
                           if(null != var27.aClass546_7357) {
                              for(var28 = var27.aClass546_7357; var28 != null; var28 = var28.aClass546_7268) {
                                 var21 = var28.aClass639_Sub1_Sub2_7267;
                                 if(var21 instanceof Interface59) {
                                    Interface59 var22 = (Interface59)var21;
                                    var23 = var22.method87(-910136787);
                                    var24 = var22.method379((byte)39);
                                    if(21 == var23) {
                                       var23 = 19;
                                    }

                                    var25 = var23 | var24 << 6;
                                    if(var25 == var12 || 0 != var13 && var13 == var25 || 0 != var15 && var25 == var15) {
                                       continue label240;
                                    }
                                 }
                              }
                           }
                        }

                        var27 = var0[var18][var11][var14];
                        if(var27 != null && null != var27.aClass546_7357) {
                           for(var28 = var27.aClass546_7357; null != var28; var28 = var28.aClass546_7268) {
                              var21 = var28.aClass639_Sub1_Sub2_7267;
                              if(var21.aShort11803 != var21.aShort11798 || var21.aShort11799 != var21.aShort11802) {
                                 short var29 = var21.aShort11803;
                                 short var31 = var21.aShort11798;
                                 short var32 = var21.aShort11799;
                                 short var33 = var21.aShort11802;
                                 int var30 = Math.max(0, Math.min(var29, var6[var18].length - 1));
                                 var24 = Math.max(0, Math.min(var32, var6[var18][0].length - 1));
                                 var23 = Math.max(0, Math.min(var31, var6[var18].length - 1));

                                 for(var25 = Math.max(0, Math.min(var33, var6[var18][0].length - 1)); var30 <= var23; ++var30) {
                                    while(var24 <= var25) {
                                       var6[var18][var30][var24] = var7;
                                       ++var24;
                                    }
                                 }
                              }
                           }
                        }

                        var6[var18][var11][var14] = var7;
                        var17 = true;
                     }
                  }
               }

               if(var17) {
                  var18 = client.aClass505_11204.method6072(-1337164610).aClass148Array7288[1 + -395336755 * Class692.anInt8703].method1714(var11, var14, 1397809036);
                  if(client.anIntArray11142[var1] < var18) {
                     client.anIntArray11142[var1] = var18;
                  }

                  var19 = var11 << 9;
                  var20 = var14 << 9;
                  if(client.anIntArray11143[var1] > var19) {
                     client.anIntArray11143[var1] = var19;
                  } else if(client.anIntArray11279[var1] < var19) {
                     client.anIntArray11279[var1] = var19;
                  }

                  if(client.anIntArray11131[var1] > var20) {
                     client.anIntArray11131[var1] = var20;
                  } else if(client.anIntArray11145[var1] < var20) {
                     client.anIntArray11145[var1] = var20;
                  }
               }

               if(!var16) {
                  if(var11 >= 1 && var7 != var6[Class692.anInt8703 * -395336755][var11 - 1][var14]) {
                     client.anIntArray11085[var26] = var11 - 1 | 1179648 | -754974720;
                     client.anIntArray11086[var26] = var14 | 1245184;
                     var26 = var26 + 1 & 4095;
                     var6[Class692.anInt8703 * -395336755][var11 - 1][var14] = var7;
                  }

                  ++var14;
                  if(var14 < client.aClass505_11204.method6057(126749238)) {
                     if(var11 - 1 >= 0 && var6[Class692.anInt8703 * -395336755][var11 - 1][var14] != var7 && (var8.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var11][var14] & 4) == 0 && (var8.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var11 - 1][var14 - 1] & 4) == 0) {
                        client.anIntArray11085[var26] = var11 - 1 | 1179648 | 1375731712;
                        client.anIntArray11086[var26] = var14 | 1245184;
                        var26 = var26 + 1 & 4095;
                        var6[Class692.anInt8703 * -395336755][var11 - 1][var14] = var7;
                     }

                     if(var6[-395336755 * Class692.anInt8703][var11][var14] != var7) {
                        client.anIntArray11085[var26] = var11 | 5373952 | 318767104;
                        client.anIntArray11086[var26] = var14 | 5439488;
                        var26 = var26 + 1 & 4095;
                        var6[-395336755 * Class692.anInt8703][var11][var14] = var7;
                     }

                     if(var11 + 1 < client.aClass505_11204.method6056(-1746741811) && var6[-395336755 * Class692.anInt8703][var11 + 1][var14] != var7 && (var8.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var11][var14] & 4) == 0 && 0 == (var8.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][1 + var11][var14 - 1] & 4)) {
                        client.anIntArray11085[var26] = 1 + var11 | 5373952 | -1845493760;
                        client.anIntArray11086[var26] = var14 | 5439488;
                        var26 = var26 + 1 & 4095;
                        var6[Class692.anInt8703 * -395336755][var11 + 1][var14] = var7;
                     }
                  }

                  --var14;
                  if(1 + var11 < client.aClass505_11204.method6056(-1746741811) && var7 != var6[-395336755 * Class692.anInt8703][var11 + 1][var14]) {
                     client.anIntArray11085[var26] = var11 + 1 | 9568256 | 1392508928;
                     client.anIntArray11086[var26] = var14 | 9633792;
                     var26 = 1 + var26 & 4095;
                     var6[-395336755 * Class692.anInt8703][var11 + 1][var14] = var7;
                  }

                  --var14;
                  if(var14 >= 0) {
                     if(var11 - 1 >= 0 && var6[-395336755 * Class692.anInt8703][var11 - 1][var14] != var7 && (var8.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var11][var14] & 4) == 0 && 0 == (var8.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var11 - 1][1 + var14] & 4)) {
                        client.anIntArray11085[var26] = var11 - 1 | 13762560 | 301989888;
                        client.anIntArray11086[var26] = var14 | 13828096;
                        var26 = var26 + 1 & 4095;
                        var6[Class692.anInt8703 * -395336755][var11 - 1][var14] = var7;
                     }

                     if(var6[Class692.anInt8703 * -395336755][var11][var14] != var7) {
                        client.anIntArray11085[var26] = var11 | 13762560 | -1828716544;
                        client.anIntArray11086[var26] = var14 | 13828096;
                        var26 = 1 + var26 & 4095;
                        var6[Class692.anInt8703 * -395336755][var11][var14] = var7;
                     }

                     if(var11 + 1 < client.aClass505_11204.method6056(-1746741811) && var6[-395336755 * Class692.anInt8703][1 + var11][var14] != var7 && (var8.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var11][var14] & 4) == 0 && 0 == (var8.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var11 + 1][1 + var14] & 4)) {
                        client.anIntArray11085[var26] = var11 + 1 | 9568256 | -771751936;
                        client.anIntArray11086[var26] = var14 | 9633792;
                        var26 = 1 + var26 & 4095;
                        var6[Class692.anInt8703 * -395336755][var11 + 1][var14] = var7;
                     }
                  }
               }
            }

            if(-1000000 != client.anIntArray11142[var1]) {
               client.anIntArray11142[var1] += 40;
               client.anIntArray11143[var1] -= 512;
               client.anIntArray11279[var1] += 512;
               client.anIntArray11145[var1] += 512;
               client.anIntArray11131[var1] -= 512;
            }

            return true;
         }
      }
   }

   public static int method1035(int var0, int var1, int var2, byte var3) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }

   static void method1036(int var0, int var1, int var2, int var3, int var4) {
      Class526_Sub21_Sub9 var5 = Class265.method3560(10, (long)var0);
      var5.method10584(230428369);
      var5.anInt11678 = var1 * 1693201951;
      var5.anInt11680 = var2 * -1482432943;
      var5.anInt11677 = var3 * 703746177;
   }
}
