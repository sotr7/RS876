package com.jagex;

import com.jagex.Class143;
import com.jagex.Class143_Sub1;
import com.jagex.Class20;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class466;
import com.jagex.Class506;
import com.jagex.Class526_Sub14;
import com.jagex.Class681;
import com.jagex.Exception_Sub1;
import com.jagex.Interface18;

public final class Class600 implements Interface18 {
   static final long aLong7868 = 1L;
   static final long aLong7869 = 500L;
   static final long aLong7870 = 4611686018427387903L;
   static final long aLong7871 = 4611686018427387904L;
   public static Class466 aClass466_7873;
   Class20 aClass20_7872 = new Class20(128);
   int[] anIntArray7866;
   int[] anIntArray7867;

   public Class600() {
      this.anIntArray7866 = new int[Class506.aClass97_Sub1_Sub1_5698.method87(-172952629)];
      this.anIntArray7867 = new int[Class506.aClass97_Sub1_Sub1_5698.method87(2027613269)];
   }

   public void method128(Class317 var1, int var2) throws Exception_Sub1 {
      int var3 = var1.method4096(this.anIntArray7867[697078941 * var1.aClass143_3405.anInt1674], var2, 543063681);
      this.method111(var1.aClass143_3405, var3, (byte)24);
   }

   public void method7081(byte var1) {
      for(int var2 = 0; var2 < Class506.aClass97_Sub1_Sub1_5698.method87(-1667482498); ++var2) {
         Class143_Sub1 var3 = (Class143_Sub1)Class506.aClass97_Sub1_Sub1_5698.method89(var2, -1961223154);
         if(var3 != null) {
            this.anIntArray7866[var2] = 0;
            this.anIntArray7867[var2] = 0;
         }
      }

      this.aClass20_7872 = new Class20(128);
   }

   public int method114(Class143 var1, int var2) {
      return this.anIntArray7867[var1.anInt1674 * 697078941];
   }

   public void method111(Class143 var1, int var2, byte var3) {
      this.anIntArray7867[697078941 * var1.anInt1674] = var2;
      Class526_Sub14 var4 = (Class526_Sub14)this.aClass20_7872.get((long)(var1.anInt1674 * 697078941));
      if(var4 != null) {
         var4.aLong10455 = (Class255.time((byte)24) + 500L) * -5065934963382940101L;
      } else {
         var4 = new Class526_Sub14(Class255.time((byte)24) + 500L);
         this.aClass20_7872.put(var4, (long)(var1.anInt1674 * 697078941));
      }

   }

   public void method7082(Class143 var1, int var2, int var3) {
      this.anIntArray7866[var1.anInt1674 * 697078941] = var2;
      Class526_Sub14 var4 = (Class526_Sub14)this.aClass20_7872.get((long)(var1.anInt1674 * 697078941));
      if(var4 != null) {
         if(var4.aLong10455 * 5599099635928242931L != 4611686018427387905L) {
            var4.aLong10455 = (Class255.time((byte)24) + 500L | 4611686018427387904L) * -5065934963382940101L;
         }
      } else {
         var4 = new Class526_Sub14(4611686018427387905L);
         this.aClass20_7872.put(var4, (long)(var1.anInt1674 * 697078941));
      }

   }

   public void method7083(Class317 var1, int var2, int var3) {
      try {
         int var4 = var1.method4096(this.anIntArray7866[var1.aClass143_3405.anInt1674 * 697078941], var2, 543063681);
         this.method7082(var1.aClass143_3405, var4, 25153242);
      } catch (Exception_Sub1 var5) {
         ;
      }

   }

   public int method116(Class317 var1, byte var2) {
      return var1.method4094(this.anIntArray7867[697078941 * var1.aClass143_3405.anInt1674], -1434583520);
   }

   public void method112(Class317 var1, int var2) throws Exception_Sub1 {
      int var3 = var1.method4096(this.anIntArray7867[697078941 * var1.aClass143_3405.anInt1674], var2, 543063681);
      this.method111(var1.aClass143_3405, var3, (byte)24);
   }

   public long method121(Class143 var1, int var2) {
      throw new UnsupportedOperationException();
   }

   public void method110(Class143 var1, long var2) {
      throw new UnsupportedOperationException();
   }

   public Object method113(Class143 var1, byte var2) {
      throw new UnsupportedOperationException();
   }

   public int method7084(boolean var1, byte var2) {
      long var3 = Class255.time((byte)24);

      for(Class526_Sub14 var5 = (Class526_Sub14)(var1?this.aClass20_7872.method638(224608531):this.aClass20_7872.method639(-813935356)); var5 != null; var5 = (Class526_Sub14)this.aClass20_7872.method639(-1144412640)) {
         if((var5.aLong10455 * 5599099635928242931L & 4611686018427387903L) < var3) {
            if((5599099635928242931L * var5.aLong10455 & 4611686018427387904L) != 0L) {
               int var6 = (int)(-6805155999452426801L * var5.aLong7156);
               this.anIntArray7867[var6] = this.anIntArray7866[var6];
               var5.method6332(-1949449864);
               return var6;
            }

            var5.method6332(-1949449864);
         }
      }

      return -1;
   }

   public int method117(Class317 var1) {
      return var1.method4094(this.anIntArray7867[697078941 * var1.aClass143_3405.anInt1674], -1434583520);
   }

   public int method120(Class317 var1) {
      return var1.method4094(this.anIntArray7867[697078941 * var1.aClass143_3405.anInt1674], -1434583520);
   }

   public int method119(Class317 var1) {
      return var1.method4094(this.anIntArray7867[697078941 * var1.aClass143_3405.anInt1674], -1434583520);
   }

   public int method122(Class143 var1) {
      return this.anIntArray7867[var1.anInt1674 * 697078941];
   }

   public void method123(Class143 var1, int var2) {
      this.anIntArray7867[697078941 * var1.anInt1674] = var2;
      Class526_Sub14 var3 = (Class526_Sub14)this.aClass20_7872.get((long)(var1.anInt1674 * 697078941));
      if(var3 != null) {
         var3.aLong10455 = (Class255.time((byte)24) + 500L) * -5065934963382940101L;
      } else {
         var3 = new Class526_Sub14(Class255.time((byte)24) + 500L);
         this.aClass20_7872.put(var3, (long)(var1.anInt1674 * 697078941));
      }

   }

   public long method124(Class143 var1) {
      throw new UnsupportedOperationException();
   }

   public void method125(Class143 var1, long var2) {
      throw new UnsupportedOperationException();
   }

   public Object method126(Class143 var1) {
      throw new UnsupportedOperationException();
   }

   public void method115(Class143 var1, Object var2, byte var3) {
      throw new UnsupportedOperationException();
   }

   public void method127(Class143 var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public int method118(Class317 var1) {
      return var1.method4094(this.anIntArray7867[697078941 * var1.aClass143_3405.anInt1674], -1434583520);
   }

   public void method129(Class317 var1, int var2, int var3) throws Exception_Sub1 {
      int var4 = var1.method4096(this.anIntArray7867[697078941 * var1.aClass143_3405.anInt1674], var2, 543063681);
      this.method111(var1.aClass143_3405, var4, (byte)24);
   }

   public void method7085() {
      for(int var1 = 0; var1 < Class506.aClass97_Sub1_Sub1_5698.method87(142865686); ++var1) {
         Class143_Sub1 var2 = (Class143_Sub1)Class506.aClass97_Sub1_Sub1_5698.method89(var1, -1377872980);
         if(var2 != null) {
            this.anIntArray7866[var1] = 0;
            this.anIntArray7867[var1] = 0;
         }
      }

      this.aClass20_7872 = new Class20(128);
   }

   public void method7086() {
      for(int var1 = 0; var1 < Class506.aClass97_Sub1_Sub1_5698.method87(-653865846); ++var1) {
         Class143_Sub1 var2 = (Class143_Sub1)Class506.aClass97_Sub1_Sub1_5698.method89(var1, -1207175362);
         if(var2 != null) {
            this.anIntArray7866[var1] = 0;
            this.anIntArray7867[var1] = 0;
         }
      }

      this.aClass20_7872 = new Class20(128);
   }

   public void method7087() {
      for(int var1 = 0; var1 < Class506.aClass97_Sub1_Sub1_5698.method87(893427904); ++var1) {
         Class143_Sub1 var2 = (Class143_Sub1)Class506.aClass97_Sub1_Sub1_5698.method89(var1, 145480685);
         if(var2 != null) {
            this.anIntArray7866[var1] = 0;
            this.anIntArray7867[var1] = 0;
         }
      }

      this.aClass20_7872 = new Class20(128);
   }

   public int method7088(boolean var1) {
      long var2 = Class255.time((byte)24);

      for(Class526_Sub14 var4 = (Class526_Sub14)(var1?this.aClass20_7872.method638(-1431727829):this.aClass20_7872.method639(-1488363023)); var4 != null; var4 = (Class526_Sub14)this.aClass20_7872.method639(-687746909)) {
         if((var4.aLong10455 * 5599099635928242931L & 4611686018427387903L) < var2) {
            if((5599099635928242931L * var4.aLong10455 & 4611686018427387904L) != 0L) {
               int var5 = (int)(-6805155999452426801L * var4.aLong7156);
               this.anIntArray7867[var5] = this.anIntArray7866[var5];
               var4.method6332(-1949449864);
               return var5;
            }

            var4.method6332(-1949449864);
         }
      }

      return -1;
   }

   static final void method7089(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-10);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class143.method1667(var3, var4, var0, -1414278130);
   }

   static final void method7090(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.method4487(var2, var3, var4, -2115438543);
   }

   static final void method7091(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
   }
}
