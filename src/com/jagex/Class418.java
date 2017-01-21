package com.jagex;

import com.jagex.Class1;
import com.jagex.Class10;
import com.jagex.Class149;
import com.jagex.Class153;
import com.jagex.Class173;
import com.jagex.Class174;
import com.jagex.Class176;
import com.jagex.Class181;
import com.jagex.Class192;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class277;
import com.jagex.Class289;
import com.jagex.Class324;
import com.jagex.Class327;
import com.jagex.Class4;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.Class576;
import com.jagex.Class604;
import com.jagex.Class615;
import com.jagex.Class626;
import com.jagex.Class681;
import com.jagex.Class75;
import com.jagex.Class83;
import com.jagex.Interface2;
import com.jagex.Interface51;
import com.jagex.client;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class418 implements Interface2 {
   static InterfaceDef[] aClass245Array4516;
   Class174 aClass174_4508 = null;
   Map aMap4515 = null;
   Class192 aClass192_4513 = new Class192(20);
   Class192 aClass192_4511 = new Class192(20);
   Class466 aClass466_4510;
   Class466 aClass466_4509;
   int[] anIntArray4514;
   Class192 aClass192_4512;

   public Class153[] method14(Class174 var1, int var2, int var3) {
      if(this.aClass192_4512 == null) {
         return null;
      } else {
         if(var1 != null) {
            if(this.aClass174_4508 != var1) {
               this.aClass192_4512.method2770(1525761163);
            }

            this.aClass174_4508 = var1;
         } else {
            var1 = this.aClass174_4508;
         }

         if(null == var1) {
            return null;
         } else {
            Class153[] var4 = (Class153[])((Class153[])this.aClass192_4512.method2765((long)var2));
            if(null == var4) {
               Class173[] var5 = Class181.method2681(this.aClass466_4510, var2, 0);
               if(null != var5 && var5.length > 0) {
                  var4 = new Class153[var5.length];

                  for(int var6 = 0; var6 < var5.length; ++var6) {
                     var4[var6] = var1.method2310(var5[var6], true);
                  }

                  this.aClass192_4512.method2768(var4, (long)var2);
               }
            }

            return var4;
         }
      }
   }

   public void method4947(Interface51 var1, int var2) {
      this.aMap4515 = new HashMap(this.anIntArray4514.length);

      for(int var3 = 0; var3 < this.anIntArray4514.length; ++var3) {
         int var4 = this.anIntArray4514[var3];
         Class1 var5 = Class176.method2656(this.aClass466_4509, var4, this, -1747435492);
         byte[] var6 = this.aClass466_4510.method5541(var4, 16777472);
         Object var7 = var1.method362(var6, var5, true, 1882726936);
         this.aMap4515.put(Integer.valueOf(var3), new Class4(var7, var5));
      }

   }

   public void method4948(byte var1) {
      this.aMap4515 = null;
   }

   public int method4949(int var1) {
      return this.method4966(false, -438673297);
   }

   public int method4950(int var1) {
      return this.anIntArray4514 == null?0:this.anIntArray4514.length * 2;
   }

   public Object method4951(Interface51 var1, int var2, boolean var3, boolean var4, int var5) {
      if(var2 == -1) {
         return null;
      } else {
         if(this.anIntArray4514 != null) {
            for(int var6 = 0; var6 < this.anIntArray4514.length; ++var6) {
               if(var2 == this.anIntArray4514[var6]) {
                  return ((Class4)this.aMap4515.get(Integer.valueOf(var6))).anObject23;
               }
            }
         }

         Object var9 = this.aClass192_4513.method2765((long)(var2 << 1 | (var4?1:0)));
         if(null != var9) {
            return var9;
         } else {
            byte[] var7 = this.aClass466_4510.method5541(var2, 16777472);
            if(var7 == null) {
               return null;
            } else {
               Class1 var8 = this.method4963(var1, var2, var3, false, 2003264517);
               if(null == var8) {
                  return null;
               } else {
                  var9 = var1.method362(var7, var8, var4, 578662082);
                  this.aClass192_4513.method2768(var9, (long)(var2 << 1 | (var4?1:0)));
                  return var9;
               }
            }
         }
      }
   }

   public void method4952(int var1) {
      this.aClass192_4511.method2770(1052199368);
      this.aClass192_4513.method2770(1603962066);
      if(this.aClass192_4512 != null) {
         this.aClass192_4512.method2770(378233368);
      }

   }

   public void method4953(int var1, byte var2) {
      this.aClass192_4511.method2769(var1, (byte)-108);
      this.aClass192_4513.method2769(var1, (byte)-24);
      if(null != this.aClass192_4512) {
         this.aClass192_4512.method2769(var1, (byte)-96);
      }

   }

   public void method4954(int var1) {
      this.aClass192_4511.method2772(-583535979);
      this.aClass192_4513.method2772(-1180676842);
      if(this.aClass192_4512 != null) {
         this.aClass192_4512.method2772(1414492814);
      }

   }

   public int method12(int var1) {
      Class153[] var2 = this.method14(this.aClass174_4508, var1, -246260219);
      return null != var2?var2[0].method21():0;
   }

   public int method13(int var1, int var2) {
      Class153[] var3 = this.method14(this.aClass174_4508, var1, 201694906);
      return null != var3?var3[0].method21():0;
   }

   public void method4955() {
      this.aClass192_4511.method2770(858903104);
      this.aClass192_4513.method2770(243192476);
      if(this.aClass192_4512 != null) {
         this.aClass192_4512.method2770(628436122);
      }

   }

   public void method4956() {
      this.aMap4515 = null;
   }

   public int method4957() {
      return this.method4966(false, 356352815);
   }

   public int method4958() {
      return this.method4966(false, 1640956584);
   }

   public Class418(Class174 var1, Class466 var2, Class466 var3, int[] var4) {
      this.aClass174_4508 = var1;
      this.aClass466_4510 = var2;
      this.aClass466_4509 = var3;
      this.anIntArray4514 = var4;
      this.aClass192_4512 = new Class192(20);
   }

   public int method4959() {
      return this.anIntArray4514 == null?0:this.anIntArray4514.length * 2;
   }

   public void method4960() {
      this.aClass192_4511.method2770(317016098);
      this.aClass192_4513.method2770(2136024721);
      if(this.aClass192_4512 != null) {
         this.aClass192_4512.method2770(613981303);
      }

   }

   public int method4961() {
      return this.anIntArray4514 == null?0:this.anIntArray4514.length * 2;
   }

   public int method4962() {
      return this.anIntArray4514 == null?0:this.anIntArray4514.length * 2;
   }

   public Class153[] method16(Class174 var1, int var2) {
      if(this.aClass192_4512 == null) {
         return null;
      } else {
         if(var1 != null) {
            if(this.aClass174_4508 != var1) {
               this.aClass192_4512.method2770(2039905744);
            }

            this.aClass174_4508 = var1;
         } else {
            var1 = this.aClass174_4508;
         }

         if(null == var1) {
            return null;
         } else {
            Class153[] var3 = (Class153[])((Class153[])this.aClass192_4512.method2765((long)var2));
            if(null == var3) {
               Class173[] var4 = Class181.method2681(this.aClass466_4510, var2, 0);
               if(null != var4 && var4.length > 0) {
                  var3 = new Class153[var4.length];

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var3[var5] = var1.method2310(var4[var5], true);
                  }

                  this.aClass192_4512.method2768(var3, (long)var2);
               }
            }

            return var3;
         }
      }
   }

   Class1 method4963(Interface51 var1, int var2, boolean var3, boolean var4, int var5) {
      if(var2 == -1) {
         return null;
      } else {
         if(this.anIntArray4514 != null) {
            for(int var6 = 0; var6 < this.anIntArray4514.length; ++var6) {
               if(var2 == this.anIntArray4514[var6]) {
                  return (Class1)((Class4)this.aMap4515.get(Integer.valueOf(var6))).anObject24;
               }
            }
         }

         if(var4) {
            this.aClass466_4510.method5537(var2, (byte)114);
         }

         Class1 var7 = (Class1)this.aClass192_4511.method2765((long)var2);
         if(null != var7) {
            return var7;
         } else {
            var7 = Class176.method2656(this.aClass466_4509, var2, this, -513925939);
            if(null == var7) {
               return null;
            } else {
               if(var3) {
                  this.aClass192_4511.method2768(var7, (long)var2);
               }

               return var7;
            }
         }
      }
   }

   public Class1 method4964(Interface51 var1, int var2, byte var3) {
      return this.method4963(var1, var2, true, true, 2003264517);
   }

   public void method4965() {
      this.aClass192_4511.method2770(1909588933);
      this.aClass192_4513.method2770(796080759);
      if(this.aClass192_4512 != null) {
         this.aClass192_4512.method2770(1561150512);
      }

   }

   public int method4966(boolean var1, int var2) {
      if(null == this.anIntArray4514) {
         return 0;
      } else if(!var1 && null != this.aMap4515) {
         return this.anIntArray4514.length * 2;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < this.anIntArray4514.length; ++var4) {
            int var5 = this.anIntArray4514[var4];
            if(this.aClass466_4510.method5537(var5, (byte)44)) {
               ++var3;
            }

            if(this.aClass466_4509.method5537(var5, (byte)100)) {
               ++var3;
            }
         }

         return var3;
      }
   }

   public void method4967() {
      this.aClass192_4511.method2772(2078895798);
      this.aClass192_4513.method2772(217651414);
      if(this.aClass192_4512 != null) {
         this.aClass192_4512.method2772(1045707434);
      }

   }

   public void method4968() {
      this.aClass192_4511.method2772(-1033583509);
      this.aClass192_4513.method2772(610739711);
      if(this.aClass192_4512 != null) {
         this.aClass192_4512.method2772(-735513987);
      }

   }

   public int method4969(boolean var1) {
      if(null == this.anIntArray4514) {
         return 0;
      } else if(!var1 && null != this.aMap4515) {
         return this.anIntArray4514.length * 2;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < this.anIntArray4514.length; ++var3) {
            int var4 = this.anIntArray4514[var3];
            if(this.aClass466_4510.method5537(var4, (byte)71)) {
               ++var2;
            }

            if(this.aClass466_4509.method5537(var4, (byte)105)) {
               ++var2;
            }
         }

         return var2;
      }
   }

   public Class153[] method15(Class174 var1, int var2) {
      if(this.aClass192_4512 == null) {
         return null;
      } else {
         if(var1 != null) {
            if(this.aClass174_4508 != var1) {
               this.aClass192_4512.method2770(507843940);
            }

            this.aClass174_4508 = var1;
         } else {
            var1 = this.aClass174_4508;
         }

         if(null == var1) {
            return null;
         } else {
            Class153[] var3 = (Class153[])((Class153[])this.aClass192_4512.method2765((long)var2));
            if(null == var3) {
               Class173[] var4 = Class181.method2681(this.aClass466_4510, var2, 0);
               if(null != var4 && var4.length > 0) {
                  var3 = new Class153[var4.length];

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var3[var5] = var1.method2310(var4[var5], true);
                  }

                  this.aClass192_4512.method2768(var3, (long)var2);
               }
            }

            return var3;
         }
      }
   }

   public int method4970() {
      return this.anIntArray4514 == null?0:this.anIntArray4514.length * 2;
   }

   public int method17(int var1) {
      Class153[] var2 = this.method14(this.aClass174_4508, var1, -1292201798);
      return null != var2?var2[0].method21():0;
   }

   static boolean method4971(int var0) {
      try {
         Class75 var1 = new Class75();
         byte[] var2 = var1.method1115(Class289.aByteArray3113, (byte)-68);
         Class176.method2657(var2, (byte)-15);
         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   static final void method4972(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      int[] var5 = Class149.method1747(var4, var2, (byte)0);
      if(null != var5) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2622 = Class615.method7280(var4, var2, -2055449549);
      var0.anIntArray2485 = var5;
      var0.aBool2560 = true;
   }

   static final void method4973(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[540934629 * var0.anInt8625];
      String var3 = (String)var0.anObjectArray8624[1 + 540934629 * var0.anInt8625];
      if(Class451.localPlayer.aClass633_12181 != null && Class451.localPlayer.aClass633_12181.aBool8251) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2;
      }

   }

   public static final void method4974(int var0, byte var1) {
      for(int var2 = 0; var2 < 5; ++var2) {
         client.aBoolArray11263[var2] = false;
      }

      client.anInt11117 = -50532269;
      client.anInt11118 = -1469919279;
      Class83.anInt846 = 0;
      Class10.anInt63 = 0;
      Class576.anInt7740 = 1775818497;
      Class277.anInt3029 = -1852613725;
      Class327.anInt3488 = 900443573 * var0;
      if(-265840483 * Class327.anInt3488 != 2) {
         Class604.aLong7895 = 0L;
      }

   }

   static final void method4975(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2628 = Class615.method7280(var4, var2, -902231638);
      var0.aBool2560 = true;
   }

   static final void method4976(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class626.method7455(var2, 1895615023);
   }

   public static int method4977(short[] var0, int var1, Class324 var2, int var3, byte var4) throws IOException {
      int var5 = 1;
      int var6 = 0;

      for(int var7 = 0; var7 < var3; ++var7) {
         int var8 = var2.method4162(var0, var5 + var1, -2114435951);
         var5 <<= 1;
         var5 += var8;
         var6 |= var8 << var7;
      }

      return var6;
   }
}
