package com.jagex;

import com.jagex.Class149;
import com.jagex.Class2;
import com.jagex.Class218;
import com.jagex.Class220;
import com.jagex.Class247;
import com.jagex.Class424;
import com.jagex.Class452;
import com.jagex.Class52;
import com.jagex.RSByteBuffer;
import com.jagex.Buffer;
import com.jagex.Class526_Sub42;
import com.jagex.Class681;
import com.jagex.Interface18;
import com.jagex.Interface28;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class223 {
   static final int anInt2309 = 1;
   static final int anInt2310 = 1;
   static final int anInt2312 = 4;
   static final int anInt2314 = 2;
   int anInt2324;
   int anInt2323 = 593648609;
   long aLong2313;
   boolean aBool2316;
   boolean aBool2321;
   boolean aBool2322;
   long aLong2311;
   String aString2315;
   int anInt2317;
   ArrayList anArrayList2319;
   ArrayList anArrayList2320;
   Class2 aClass2_2318;

   public long method3099(int var1) {
      return -2399775223669174781L * this.aLong2311;
   }

   public List method3100(int var1) {
      return Collections.unmodifiableList(this.anArrayList2319);
   }

   void method3101(int var1, int var2, byte var3) {
      Class218 var4 = (Class218)this.anArrayList2319.get(var1);
      var4.method2996(var2, 149649099);
      var4.method2997(true, (byte)62);
   }

   int method3102(int var1) {
      return this.anInt2324 * -135076455;
   }

   void method3103(int var1) {
      this.anInt2324 += 1371709097;
   }

   public boolean method3104(byte var1) {
      return this.aBool2316;
   }

   public boolean method3105() {
      return this.aBool2316;
   }

   void method3106(int var1, int var2) {
      Class218 var3 = (Class218)this.anArrayList2319.get(var1);
      var3.method2997(false, (byte)33);
   }

   void method3107(int var1) {
      int var2 = -1;
      int var3 = -1;

      for(int var4 = 0; var4 < this.anArrayList2319.size(); ++var4) {
         Class218 var5 = (Class218)this.anArrayList2319.get(var4);
         int var6 = var5.method3023(2007988579);
         if(var6 > var2) {
            var2 = var6;
            var3 = var4;
         }
      }

      this.anInt2323 = -593648609 * var3;
   }

   public List method3108(int var1) {
      return Collections.unmodifiableList(this.anArrayList2320);
   }

   public int method3109(int var1) {
      return this.anInt2323 * 388552671;
   }

   public int method3110() {
      return (int)(-4769375660468969133L * this.aLong2313);
   }

   public String method3111(int var1) {
      return this.aString2315;
   }

   public Interface18 method3112(int var1) {
      return new Class149(Class452.aClass452_4944, this.aClass2_2318);
   }

   void method3113(Class218 var1, int var2) {
      this.anArrayList2319.add(var1);
      this.method3107(1302970238);
   }

   public Class247 method3114(byte var1) {
      if(this.anArrayList2319.isEmpty()) {
         return Class247.aClass247_2687;
      } else {
         Class247 var2 = ((Class218)this.anArrayList2319.get(0)).method3007((byte)1);
         switch(var2.anInt2686 * -1879057085) {
         case 1:
         case 3:
            return var2;
         default:
            Iterator var3 = this.anArrayList2319.iterator();

            Class218 var4;
            do {
               if(!var3.hasNext()) {
                  return Class247.aClass247_2685;
               }

               var4 = (Class218)var3.next();
            } while(var4.method3007((byte)1) != Class247.aClass247_2687);

            return Class247.aClass247_2687;
         }
      }
   }

   void method3115(Class220 var1, int var2) {
      this.anArrayList2320.add(var1);
   }

   void method3116(int var1, byte var2) {
      this.anArrayList2320.remove(var1);
   }

   void method3117(int var1, int var2, int var3) {
      ((Class218)this.anArrayList2319.get(var1)).method2995(var2, 1182458895);
      this.method3107(1302970238);
   }

   void method3118(int var1) {
      this.anArrayList2320.remove(var1);
   }

   void method3119(int var1, boolean var2, int var3) {
      Class218 var4 = (Class218)this.anArrayList2319.get(var1);
      var4.method2994(var2?Class247.aClass247_2685:Class247.aClass247_2687, (byte)67);
   }

   int method3120() {
      return this.anInt2324 * -135076455;
   }

   void method3121(int var1) {
      Iterator var2 = this.anArrayList2319.iterator();

      while(var2.hasNext()) {
         Class218 var3 = (Class218)var2.next();
         var3.method2994(Class247.aClass247_2682, (byte)5);
      }

   }

   public Class223(long var1, RSByteBuffer var3, boolean var4, Interface28 var5) {
      this.aLong2313 = var1 * 170741165143395035L;
      int var6 = var3.readUnsignedByte(-511530519);
      if(var6 == 1) {
         int var7 = var3.readUnsignedByte(1343051303);
         this.aBool2316 = (var7 & 1) != 0;
         this.aBool2321 = (var7 & 2) != 0;
         this.aBool2322 = (var7 & 4) != 0;
         this.anInt2324 = var3.readInt((byte)5) * 1371709097;
         this.aLong2311 = var3.method9663(1751164804) * -7510494508165411669L;
         this.aString2315 = var3.readString(1672040192);
         this.anInt2317 = var3.readShort((byte)1) * -403209255;
         var3.readInt((byte)5);
         var3.method9663(1939376428);
         int var8 = var3.readUnsignedShort(1724638856);
         this.anArrayList2319 = new ArrayList(var8);

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            this.anArrayList2319.add(new Class218(var3, this.aBool2321, this.aBool2322, var5));
         }

         var9 = var3.readUnsignedShort(123486567);
         this.anArrayList2320 = new ArrayList(var9);

         int var10;
         for(var10 = 0; var10 < var9; ++var10) {
            this.anArrayList2320.add(new Class220(var3, this.aBool2321, this.aBool2322));
         }

         this.aClass2_2318 = new Class2(var5.method171(-1286680521));
         var10 = var3.readUnsignedShort(362393873);

         for(int var11 = 0; var11 < var10; ++var11) {
            Class424 var12 = var5.method171(-474071754).method8370(var3, -305662750);
            this.aClass2_2318.method27(var12.anInt4793 * 1602756037, var12.anObject4794, 172204199);
         }

         if(!var4) {
            var3.readUnsignedShort(682813106);
            var3.readUnsignedShort(1294442814);
            var3.readUnsignedShort(1061696747);
            var3.readUnsignedShort(713327313);
            var3.readUnsignedShort(988392021);
         }

         this.method3107(1302970238);
      }

   }

   public Class218 method3122(int var1, byte var2) {
      return var1 == -1?null:(Class218)this.anArrayList2319.get(var1);
   }

   int method3123() {
      return this.anInt2324 * -135076455;
   }

   public int method3124(byte var1) {
      return 1903873129 * this.anInt2317;
   }

   void method3125() {
      this.anInt2324 += 1371709097;
   }

   void method3126() {
      this.anInt2324 += 1371709097;
   }

   public boolean method3127() {
      return this.aBool2316;
   }

   public boolean method3128() {
      return this.aBool2316;
   }

   public int method3129() {
      return 1903873129 * this.anInt2317;
   }

   public int method3130() {
      return 1903873129 * this.anInt2317;
   }

   void method3131(int var1, int var2) {
      ((Class218)this.anArrayList2319.get(var1)).method2995(var2, 598559212);
      this.method3107(1302970238);
   }

   public int method3132() {
      return 1903873129 * this.anInt2317;
   }

   public long method3133() {
      return -2399775223669174781L * this.aLong2311;
   }

   public int method3134() {
      return this.anInt2323 * 388552671;
   }

   int method3135() {
      return this.anInt2324 * -135076455;
   }

   void method3136() {
      int var1 = -1;
      int var2 = -1;

      for(int var3 = 0; var3 < this.anArrayList2319.size(); ++var3) {
         Class218 var4 = (Class218)this.anArrayList2319.get(var3);
         int var5 = var4.method3023(2007988579);
         if(var5 > var1) {
            var1 = var5;
            var2 = var3;
         }
      }

      this.anInt2323 = -593648609 * var2;
   }

   public int method3137() {
      return this.anInt2323 * 388552671;
   }

   public int method3138() {
      return (int)(-4769375660468969133L * this.aLong2313);
   }

   void method3139(int var1, int var2) {
      this.anArrayList2319.remove(var1);
      this.method3107(1302970238);
   }

   public int hashCode() {
      return (int)(-4769375660468969133L * this.aLong2313);
   }

   void method3140(int var1, int var2, byte var3) {
      ((Class218)this.anArrayList2319.get(var1)).method3001(var2, (byte)-63);
   }

   void method3141(int var1) {
      this.anArrayList2320.remove(var1);
   }

   void method3142(int var1) {
      Iterator var2 = this.anArrayList2319.iterator();

      while(var2.hasNext()) {
         Class218 var3 = (Class218)var2.next();
         var3.method2994(Class247.aClass247_2684, (byte)2);
      }

   }

   void method3143(int var1, int var2) {
      Class218 var3 = (Class218)this.anArrayList2319.get(var1);
      var3.method2996(var2, 1933201981);
      var3.method2997(true, (byte)-20);
   }

   void method3144(int var1) {
      Class218 var2 = (Class218)this.anArrayList2319.get(var1);
      var2.method2997(false, (byte)27);
   }

   void method3145(int var1) {
      Class218 var2 = (Class218)this.anArrayList2319.get(var1);
      var2.method2997(false, (byte)26);
   }

   void method3146(int var1, Class218 var2, byte var3) {
      Class218 var4 = (Class218)this.anArrayList2319.get(var1);
      var4.method3005(var2, -290270703);
   }

   void method3147() {
      Iterator var1 = this.anArrayList2319.iterator();

      while(var1.hasNext()) {
         Class218 var2 = (Class218)var1.next();
         var2.method2994(Class247.aClass247_2684, (byte)50);
      }

   }

   void method3148() {
      Iterator var1 = this.anArrayList2319.iterator();

      while(var1.hasNext()) {
         Class218 var2 = (Class218)var1.next();
         var2.method2994(Class247.aClass247_2684, (byte)86);
      }

   }

   public static void method3149(Buffer var0, byte var1) {
      Class526_Sub42 var2 = (Class526_Sub42)Class52.aClass702_664.method8206((byte)54);
      if(null != var2) {
         int var3 = 301018015 * var0.pos;
         var0.writeInt(var2.anInt10800 * -918935199, -357564953);

         for(int var4 = 0; var4 < var2.anInt10799 * 1056443493; ++var4) {
            if(var2.anIntArray10798[var4] != 0) {
               var0.writeByte(var2.anIntArray10798[var4], 1769656496);
            } else {
               try {
                  int var5 = var2.anIntArray10801[var4];
                  Field var6;
                  int var7;
                  if(var5 == 0) {
                     var6 = var2.aFieldArray10802[var4];
                     var7 = var6.getInt((Object)null);
                     var0.writeByte(0, 1547690701);
                     var0.writeInt(var7, -357564953);
                  } else if(1 == var5) {
                     var6 = var2.aFieldArray10802[var4];
                     var6.setInt((Object)null, var2.anIntArray10805[var4]);
                     var0.writeByte(0, 1589111017);
                  } else if(var5 == 2) {
                     var6 = var2.aFieldArray10802[var4];
                     var7 = var6.getModifiers();
                     var0.writeByte(0, 13496446);
                     var0.writeInt(var7, -357564953);
                  }

                  Method var23;
                  if(var5 != 3) {
                     if(4 == var5) {
                        var23 = var2.aMethodArray10804[var4];
                        var7 = var23.getModifiers();
                        var0.writeByte(0, -881041651);
                        var0.writeInt(var7, -357564953);
                     }
                  } else {
                     var23 = var2.aMethodArray10804[var4];
                     byte[][] var24 = var2.aByteArrayArrayArray10803[var4];
                     Object[] var8 = new Object[var24.length];

                     for(int var9 = 0; var9 < var24.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var25 = var23.invoke((Object)null, var8);
                     if(var25 == null) {
                        var0.writeByte(0, -2019683587);
                     } else if(var25 instanceof Number) {
                        var0.writeByte(1, 1569183478);
                        var0.method9621(((Number)var25).longValue());
                     } else if(var25 instanceof String) {
                        var0.writeByte(2, 2083768408);
                        var0.method9616((String)var25, 625772840);
                     } else {
                        var0.writeByte(4, -1828622359);
                     }
                  }
               } catch (ClassNotFoundException var11) {
                  var0.writeByte(-10, 1426315776);
               } catch (InvalidClassException var12) {
                  var0.writeByte(-11, -1712978003);
               } catch (StreamCorruptedException var13) {
                  var0.writeByte(-12, -1617644758);
               } catch (OptionalDataException var14) {
                  var0.writeByte(-13, 1200085015);
               } catch (IllegalAccessException var15) {
                  var0.writeByte(-14, -1596676119);
               } catch (IllegalArgumentException var16) {
                  var0.writeByte(-15, 201569096);
               } catch (InvocationTargetException var17) {
                  var0.writeByte(-16, -1447712857);
               } catch (SecurityException var18) {
                  var0.writeByte(-17, -1387471319);
               } catch (IOException var19) {
                  var0.writeByte(-18, -180482560);
               } catch (NullPointerException var20) {
                  var0.writeByte(-19, -1747906210);
               } catch (Exception var21) {
                  var0.writeByte(-20, 437457175);
               } catch (Throwable var22) {
                  var0.writeByte(-21, 1989072924);
               }
            }
         }

         var0.method9624(var3, 2024445014);
         var2.method6332(-1949449864);
      }
   }

   static final void method3150(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
