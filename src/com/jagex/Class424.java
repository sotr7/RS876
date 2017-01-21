package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class25;
import com.jagex.Class26;
import com.jagex.Class277;
import com.jagex.Class283;
import com.jagex.Class327;
import com.jagex.OutFrame;
import com.jagex.Class413;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class452_Sub4;
import com.jagex.Class50;
import com.jagex.Class525_Sub1;
import com.jagex.OutFrameBuffer;
import com.jagex.Class576;
import com.jagex.Class583;
import com.jagex.Class594;
import com.jagex.Class681;
import com.jagex.Class81;
import com.jagex.client;

public class Class424 {
   public int anInt4793;
   public Object anObject4794;

   public boolean equals(Object var1) {
      if(!(var1 instanceof Class424)) {
         return false;
      } else {
         Class424 var2 = (Class424)var1;
         return null == var2.anObject4794 && null != this.anObject4794?false:(null == this.anObject4794 && null != var2.anObject4794?false:var2.anInt4793 * 1602756037 == this.anInt4793 * 1602756037 && var2.anObject4794.equals(this.anObject4794));
      }
   }

   public Class424(int var1, Object var2) {
      this.anInt4793 = 1972984077 * var1;
      this.anObject4794 = var2;
   }

   public Class424(int var1) {
      this.anInt4793 = 1972984077 * var1;
   }

   public boolean method4996(Object var1) {
      if(!(var1 instanceof Class424)) {
         return false;
      } else {
         Class424 var2 = (Class424)var1;
         return null == var2.anObject4794 && null != this.anObject4794?false:(null == this.anObject4794 && null != var2.anObject4794?false:var2.anInt4793 * 1602756037 == this.anInt4793 * 1602756037 && var2.anObject4794.equals(this.anObject4794));
      }
   }

   public boolean method4997(Object var1) {
      if(!(var1 instanceof Class424)) {
         return false;
      } else {
         Class424 var2 = (Class424)var1;
         return null == var2.anObject4794 && null != this.anObject4794?false:(null == this.anObject4794 && null != var2.anObject4794?false:var2.anInt4793 * 1602756037 == this.anInt4793 * 1602756037 && var2.anObject4794.equals(this.anObject4794));
      }
   }

   public boolean method4998(Object var1) {
      if(!(var1 instanceof Class424)) {
         return false;
      } else {
         Class424 var2 = (Class424)var1;
         return null == var2.anObject4794 && null != this.anObject4794?false:(null == this.anObject4794 && null != var2.anObject4794?false:var2.anInt4793 * 1602756037 == this.anInt4793 * 1602756037 && var2.anObject4794.equals(this.anObject4794));
      }
   }

   static final void method4999(Class681 var0, int var1) {
      boolean var2 = true;
      if(client.aBool10981) {
         try {
            Object var3 = Class413.aClass413_4446.method4913((short)24495);
            if(var3 != null) {
               var2 = ((Boolean)var3).booleanValue();
            }
         } catch (Throwable var4) {
            ;
         }
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2?1:0;
   }

   static final void method5000(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method5001(Class681 var0, short var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   public static final void method5002(String var0, byte var1) {
      int var2 = client.aBool11157?400:200;
      if(null != var0) {
         if(-17244221 * client.anInt11130 >= var2) {
            Class283.method3718(4, client.aBool11157?Class45.aClass45_526.method920(Class26.aClass673_247, -827840379):Class45.aClass45_500.method920(Class26.aClass673_247, -827840379), 505725440);
         } else {
            String var3 = Class81.method1164(var0, Class583.aClass82_7781, (byte)1);
            if(null != var3) {
               int var4;
               String var6;
               String var7;
               for(var4 = 0; var4 < -17244221 * client.anInt11130; ++var4) {
                  Class50 var5 = client.aClass50Array11290[var4];
                  var6 = Class81.method1164(var5.aString659, Class583.aClass82_7781, (byte)1);
                  if(null != var6 && var6.equals(var3)) {
                     Class283.method3718(4, var0 + Class45.aClass45_595.method920(Class26.aClass673_247, -827840379), 1718356692);
                     return;
                  }

                  if(var5.aString652 != null) {
                     var7 = Class81.method1164(var5.aString652, Class583.aClass82_7781, (byte)1);
                     if(null != var7 && var7.equals(var3)) {
                        Class283.method3718(4, var0 + Class45.aClass45_595.method920(Class26.aClass673_247, -827840379), 1906529187);
                        return;
                     }
                  }
               }

               for(var4 = 0; var4 < client.anInt11218 * -87727903; ++var4) {
                  Class25 var8 = client.aClass25Array11169[var4];
                  var6 = Class81.method1164(var8.aString243, Class583.aClass82_7781, (byte)1);
                  if(null != var6 && var6.equals(var3)) {
                     Class283.method3718(4, Class45.aClass45_616.method920(Class26.aClass673_247, -827840379) + var0 + Class45.aClass45_622.method920(Class26.aClass673_247, -827840379), 1361038030);
                     return;
                  }

                  if(null != var8.aString245) {
                     var7 = Class81.method1164(var8.aString245, Class583.aClass82_7781, (byte)1);
                     if(null != var7 && var7.equals(var3)) {
                        Class283.method3718(4, Class45.aClass45_616.method920(Class26.aClass673_247, -827840379) + var0 + Class45.aClass45_622.method920(Class26.aClass673_247, -827840379), 1718757617);
                        return;
                     }
                  }
               }

               if(Class81.method1164(Class451.localPlayer.aString12161, Class583.aClass82_7781, (byte)1).equals(var3)) {
                  Class283.method3718(4, Class45.aClass45_483.method920(Class26.aClass673_247, -827840379), -6090643);
               } else {
                  Class111 var9 = Class452_Sub4.method9295((byte)56);
                  OutFrameBuffer var10 = Class115.method1414(OutFrame.aClass405_4172, var9.aClass14_1342, 1833088837);
                  var10.out.writeByte(Class594.method7039(var0, -765330974), -1731190976);
                  var10.out.method9616(var0, 1233122759);
                  var9.write(var10, (byte)39);
               }
            }
         }
      }
   }

   static final void method5003(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      boolean var3 = 1 == var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      if(var2 == 0) {
         Class525_Sub1.aBool10727 = var3;
      } else if(var2 == 1) {
         Class525_Sub1.aBool10728 = var3;
      } else {
         if(2 != var2) {
            throw new RuntimeException();
         }

         Class525_Sub1.aBool10730 = var3;
      }

   }

   static final void method5004(Class681 var0, int var1) {
      var0.anInt8623 -= 1137575874;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      if(var2 >= 2) {
         throw new RuntimeException();
      } else {
         client.anInt11117 = 50532269 * var2;
         int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
         if(1 + var3 >= client.anIntArrayArrayArray11100[1760635941 * client.anInt11117].length >> 1) {
            throw new RuntimeException();
         } else {
            client.anInt11119 = var3 * -197246087;
            client.anInt11121 = 0;
            client.anInt11122 = 320527873 * var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2];
            client.anInt11219 = 285885521 * var0.anIntArray8622[3 + var0.anInt8623 * -1730576285];
            int var4 = var0.anIntArray8622[4 + -1730576285 * var0.anInt8623];
            if(var4 >= 2) {
               throw new RuntimeException();
            } else {
               client.anInt11118 = var4 * 1469919279;
               int var5 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 5];
               if(var5 + 1 >= client.anIntArrayArrayArray11100[-1277290801 * client.anInt11118].length >> 1) {
                  throw new RuntimeException();
               } else {
                  client.anInt11208 = -961492071 * var5;
                  Class327.anInt3488 = -693193004;
                  Class576.anInt7740 = 1775818497;
                  Class277.anInt3029 = -1852613725;
               }
            }
         }
      }
   }
}
