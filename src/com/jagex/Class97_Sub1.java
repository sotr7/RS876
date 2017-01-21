package com.jagex;

import com.jagex.Class143;
import com.jagex.Class153;
import com.jagex.Class187;
import com.jagex.Class188;
import com.jagex.Class204;
import com.jagex.Class388;
import com.jagex.Class424;
import com.jagex.Class446;
import com.jagex.Class452;
import com.jagex.Class481;
import com.jagex.Class482;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class681;
import com.jagex.Class97;
import com.jagex.Interface10;
import com.jagex.Interface12;
import com.jagex.Interface53;

public abstract class Class97_Sub1 extends Class97 implements Interface53 {
   static Class153 aClass153_8928;
   protected Class452 aClass452_8927;

   Class97_Sub1(Class676 var1, Class452 var2, Class673 var3, int var4) {
      super(var1, var3, var4);
      this.aClass452_8927 = var2;
   }

   public int method87(int var1) {
      return this.anInt1182 * 1364693235;
   }

   public Class424 method8370(RSByteBuffer var1, int var2) {
      int var3 = var1.readUnsignedShort(554262222);
      Class143 var4 = (Class143)this.method89(var3, -2094635041);
      if(!var4.method1660(1959761214)) {
         throw new IllegalStateException("");
      } else {
         Class424 var5 = new Class424(var3);
         Class var6 = var4.aClass454_1676.method5389((byte)35).aClass5463;
         if(Integer.class == var6) {
            var5.anObject4794 = Integer.valueOf(var1.readInt((byte)5));
         } else if(var6 == Long.class) {
            var5.anObject4794 = Long.valueOf(var1.method9663(1137095576));
         } else if(String.class == var6) {
            var5.anObject4794 = var1.method9637(-1495866034);
         } else {
            if(!Interface10.class.isAssignableFrom(var6)) {
               throw new IllegalStateException();
            }

            try {
               Interface10 var7 = (Interface10)var6.newInstance();
               var7.method65(var1, -570697853);
               var5.anObject4794 = var7;
            } catch (InstantiationException var8) {
               ;
            } catch (IllegalAccessException var9) {
               ;
            }
         }

         return var5;
      }
   }

   public int method8371(Class424 var1, int var2) {
      byte var3 = 2;
      int var4;
      if(var1.anObject4794 instanceof Integer) {
         var4 = var3 + 4;
      } else if(var1.anObject4794 instanceof Long) {
         var4 = var3 + 8;
      } else if(var1.anObject4794 instanceof String) {
         var4 = var3 + Class388.method4767((String)var1.anObject4794, 240537725);
      } else {
         if(!(var1.anObject4794 instanceof Interface10)) {
            throw new IllegalStateException();
         }

         var4 = var3 + ((Interface10)var1.anObject4794).method56(1368495159);
      }

      return var4;
   }

   public Class424 method8372(RSByteBuffer var1, Class481 var2, byte var3) {
      int var4 = var1.readUnsignedShort(1661522137);
      Class424 var5 = new Class424(var4);
      Class var6 = var2.aClass5463;
      if(var6 == Integer.class) {
         var5.anObject4794 = Integer.valueOf(var1.readInt((byte)5));
      } else if(var6 == Long.class) {
         var5.anObject4794 = Long.valueOf(var1.method9663(1694353491));
      } else if(String.class == var6) {
         var5.anObject4794 = var1.method9637(-1495866034);
      } else {
         if(!Interface10.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            Interface10 var7 = (Interface10)var6.newInstance();
            var7.method65(var1, -570697853);
            var5.anObject4794 = var7;
         } catch (InstantiationException var8) {
            ;
         } catch (IllegalAccessException var9) {
            ;
         }
      }

      Class143 var10 = (Class143)this.method89(var4, -1309418532);
      return var10.method1660(2086672565) && var10.aClass454_1676.method5389((byte)-1) == var2?var5:null;
   }

   public abstract Interface12 method88(int var1);

   public Object method368(int var1, int var2) {
      Class143 var3 = (Class143)this.method89(var1, -769267930);
      return null != var3 && var3.method1660(1418647051)?var3.method1661(272426508):null;
   }

   public int method90() {
      return this.anInt1182 * 1364693235;
   }

   public abstract Interface12 method89(int var1, int var2);

   public Object method367(int var1) {
      Class143 var2 = (Class143)this.method89(var1, -616657716);
      return null != var2 && var2.method1660(1045471334)?var2.method1661(-1417629059):null;
   }

   public void method8373(RSByteBuffer var1, Class424 var2, int var3) {
      var1.writeShort(var2.anInt4793 * 1602756037, -805078716);
      if(var2.anObject4794 instanceof Integer) {
         var1.writeInt(((Integer)var2.anObject4794).intValue(), -357564953);
      } else if(var2.anObject4794 instanceof Long) {
         var1.method9621(((Long)var2.anObject4794).longValue());
      } else if(var2.anObject4794 instanceof String) {
         var1.method9617((String)var2.anObject4794, 1614007391);
      } else {
         if(!(var2.anObject4794 instanceof Interface10)) {
            throw new IllegalStateException();
         }

         ((Interface10)var2.anObject4794).method69(var1, (byte)-6);
      }

   }

   public abstract Interface12 method86(int var1);

   public Object method369(int var1) {
      Class143 var2 = (Class143)this.method89(var1, -1391164849);
      return null != var2 && var2.method1660(2110435025)?var2.method1661(707004080):null;
   }

   static final void method8374(Class681 var0, byte var1) {
      var0.anInt8623 -= 1137575874;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      int var5 = var0.anIntArray8622[3 + -1730576285 * var0.anInt8623];
      int var6 = var0.anIntArray8622[4 + var0.anInt8623 * -1730576285];
      int var7 = var0.anIntArray8622[5 + var0.anInt8623 * -1730576285];
      Class482 var8 = Class570.aClass231_7657.method3232(Class188.aClass188_2142, Class570.aClass231_7657, var2, var3, var5, Class187.aClass187_2124.method2723(-1982849586), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, var6, false, (byte)13);
      if(var8 != null) {
         Class570.aClass231_7657.method3192(var8, var7, var4, (byte)-43);
      }

   }
}
