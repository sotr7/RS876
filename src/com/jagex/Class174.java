package com.jagex;

import com.jagex.Class1;
import com.jagex.Class144;
import com.jagex.Class148;
import com.jagex.Class153;
import com.jagex.Class157;
import com.jagex.Class161;
import com.jagex.Class162;
import com.jagex.Class163;
import com.jagex.Class164;
import com.jagex.Class166;
import com.jagex.Class168;
import com.jagex.Class169;
import com.jagex.Class170;
import com.jagex.Class172;
import com.jagex.Class173;
import com.jagex.Class176;
import com.jagex.Class177;
import com.jagex.Class178;
import com.jagex.Class184;
import com.jagex.Class184_Sub1;
import com.jagex.Class184_Sub2;
import com.jagex.Class195;
import com.jagex.Class208;
import com.jagex.Class26;
import com.jagex.Class298;
import com.jagex.Class319;
import com.jagex.Class404;
import com.jagex.Class433;
import com.jagex.Class437;
import com.jagex.Class445;
import com.jagex.Class466;
import com.jagex.Class490;
import com.jagex.Class526_Sub1;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class526_Sub8;
import com.jagex.Class617;
import com.jagex.Class668;
import com.jagex.NPCDirection;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class689_Sub2;
import com.jagex.Exception_Sub4;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.Interface24;
import com.jagex.Interface46;
import com.jagex.Interface47;
import com.jagex.Interface49;
import com.jagex.client;
import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class174 {
   public static final int anInt2027 = 1;
   public static final int anInt2028 = 2;
   public static final int anInt2029 = 3;
   static final int anInt2031 = 8;
   public static final int anInt2037 = 5;
   public static final int anInt2038 = 0;
   public static final int anInt2041 = 0;
   public static final int anInt2042 = 2;
   protected static final int anInt2043 = 4;
   protected static final int anInt2045 = 16;
   protected static final int anInt2046 = 32;
   protected static final int anInt2050 = 1;
   protected static final int anInt2051 = 2;
   static final int anInt2054 = 4;
   protected static final int anInt2057 = 8;
   public static final int anInt2059 = 1;
   protected Class184 aClass184_2049;
   protected Class184_Sub1 aClass184_Sub1_2026;
   protected int anInt2053;
   protected int anInt2044;
   protected int anInt2033;
   protected int anInt2058 = 0;
   public float aFloat2056 = 0.0F;
   public int anInt2055;
   public int anInt2039;
   int anInt2048 = -1138493599;
   protected Hashtable aHashtable2052 = new Hashtable();
   Class184_Sub2[] aClass184_Sub2Array2047 = new Class184_Sub2[4];
   public Class169 aClass169_2035;
   public Interface24 anInterface24_2034;
   public Interface47 anInterface47_2036;
   public Interface49 anInterface49_2040;
   public int anInt2030;
   static boolean[] aBoolArray2032 = new boolean[8];

   abstract void method2226(int var1, int var2, int var3, int var4, int var5);

   public abstract void method2227(boolean var1);

   public abstract Class445 method2228();

   public final void method2229(byte var1) throws Exception_Sub4 {
      this.method2230(0, 0);
   }

   abstract void method2230(int var1, int var2) throws Exception_Sub4;

   public abstract void method2231(Class433 var1);

   public void method2232(int var1) {
      aBoolArray2032[-316183255 * this.anInt2030] = false;
      Enumeration var2 = this.aHashtable2052.keys();

      while(var2.hasMoreElements()) {
         Canvas var3 = (Canvas)var2.nextElement();
         Class184_Sub1 var4 = (Class184_Sub1)this.aHashtable2052.get(var3);
         var4.method140();
      }

      this.method2233();
   }

   abstract void method2233();

   public abstract void method2234(int var1);

   public abstract boolean method2235();

   public void finalize() {
      this.method2232(1135751733);
   }

   public abstract boolean method2236();

   public abstract boolean method2237();

   public abstract boolean method2238();

   public abstract boolean method2239();

   public abstract boolean method2240();

   public abstract boolean method2241();

   public abstract boolean method2242();

   public abstract Class433 method2243();

   public abstract boolean method2244();

   public abstract String method2245();

   public abstract int[] method2246();

   public final Class184 method2247(byte var1) {
      return this.aClass184_2049;
   }

   public final Class184_Sub1 method2248(byte var1) {
      return this.aClass184_Sub1_2026;
   }

   public final void method2249(Canvas var1, int var2, int var3, int var4) {
      if(!this.aHashtable2052.containsKey(var1)) {
         Class319.method4128(var1, 1524355781);
         this.method2250(var1, this.method2606(var1, var2, var3), 1330042448);
      }

   }

   final void method2250(Canvas var1, Class184_Sub1 var2, int var3) {
      if(null == var2) {
         throw new RuntimeException("");
      } else {
         this.aHashtable2052.put(var1, var2);
      }
   }

   public final void method2251(Canvas var1, byte var2) {
      if(this.aHashtable2052.containsKey(var1)) {
         Class184_Sub1 var3 = (Class184_Sub1)this.aHashtable2052.get(var1);
         var3.method140();
         this.aHashtable2052.remove(var1);
      }

   }

   public final void method2252(Canvas var1, byte var2) {
      Class184_Sub1 var3 = (Class184_Sub1)this.aHashtable2052.get(var1);
      if(var3 == null) {
         throw new RuntimeException();
      } else if(-1238690977 * this.anInt2048 <= 0 && this.aClass184_2049 == this.aClass184_Sub1_2026) {
         if(null != this.aClass184_2049) {
            this.aClass184_2049.method2694();
         }

         if(this.anInt2048 * -1238690977 < 0) {
            this.aClass184_2049 = var3;
         }

         this.aClass184_Sub1_2026 = var3;
         var3.method363();
      } else {
         throw new RuntimeException();
      }
   }

   public final void method2253(Canvas var1, int var2, int var3, int var4) {
      Class184_Sub1 var5 = (Class184_Sub1)this.aHashtable2052.get(var1);
      if(var5 == null) {
         throw new RuntimeException("");
      } else {
         var5.method8454(var2, var3);
      }
   }

   public void method2254(boolean var1) {
   }

   public abstract void method2255(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9, int var10, int var11, int var12);

   public abstract void method2256(float var1, float var2, float var3, float[] var4);

   public abstract Class184_Sub2 method2257();

   public abstract Interface21 method2258(int var1, int var2, Class144 var3, Class166 var4, int var5);

   public abstract Interface23 method2259(int var1, int var2, int var3);

   public abstract Interface23 method2260(int var1, int var2, int var3);

   public abstract void method2261(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method2262(int var1, Class162 var2, int var3, int var4);

   public abstract Interface23 method2263(int var1, int var2);

   public abstract boolean method2264();

   public abstract boolean method2265();

   public void method2266(int[] var1) {
      if(null != this.aClass184_Sub1_2026) {
         var1[0] = this.aClass184_Sub1_2026.method2691();
         var1[1] = this.aClass184_Sub1_2026.method2693();
      } else {
         var1[1] = 0;
         var1[0] = 0;
      }

   }

   public abstract void method2267();

   public abstract void method2268(int var1, int var2, int var3);

   public abstract long method2269(int var1, int var2);

   public abstract boolean method2270();

   public abstract void method2271(int var1, int var2, int[] var3, int[] var4);

   void method2272(int var1, int var2, short var3) {
      this.anInt2053 = -1649187969 * var1;
      this.anInt2044 = var2 * 1041106681;
      float var4 = (float)this.aClass184_2049.method2691() / (float)this.aClass184_2049.method2693();
      float var5 = (float)(this.anInt2053 * -742368129) / (float)(-208544951 * this.anInt2044);
      if(var4 < var5) {
         this.anInt2033 = 976874357 * (int)(var4 * (float)(this.anInt2044 * -208544951));
         this.anInt2058 = this.anInt2044 * -1553005237;
      } else {
         this.anInt2033 = this.anInt2053 * -1172710645;
         this.anInt2058 = 87418867 * (int)((float)(this.anInt2053 * -742368129) / var4);
      }

      this.aFloat2056 = (float)(this.anInt2033 * -1550496547) / (float)this.aClass184_2049.method2691();
      this.anInt2055 = 739038337 * ((this.anInt2053 * -742368129 - this.anInt2033 * -1550496547) / 2);
      this.anInt2039 = -677232627 * ((-208544951 * this.anInt2044 - this.anInt2058 * 568592699) / 2);
   }

   public abstract void method2273();

   public abstract void method2274();

   public abstract boolean method2275();

   public abstract void method2276(int[] var1);

   public abstract void method2277();

   public abstract void method2278();

   public abstract void method2279(Class445 var1, Class164 var2, Class437 var3);

   public abstract Class148 method2280(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7);

   public void method2281(boolean var1) {
   }

   public abstract void method2282(int[] var1);

   public abstract void method2283(int var1, int var2);

   public final void method2284(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method2261(var1, var2, var3, var4, var5, 1);
   }

   public abstract void method2285(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

   abstract Class184_Sub1 method2286(Canvas var1, int var2, int var3);

   public abstract void method2287();

   public final void method2288(int var1, int var2, int var3, int var4, int var5) {
      this.method2294(var1, var2, var3, var4, 1);
   }

   public abstract void method2289(float var1, float var2);

   public abstract void method2290(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract Class433 method2291();

   public abstract void method2292(Class178 var1);

   abstract void method2293(int var1, int var2, int var3, int var4, int var5);

   abstract void method2294(int var1, int var2, int var3, int var4, int var5);

   public abstract int method2295(int var1, int var2);

   public abstract void method2296(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9);

   public abstract void method2297(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

   static synchronized Class174 method2298(int var0, Canvas var1, Class169 var2, Interface24 var3, Interface47 var4, Interface49 var5, Interface46 var6, Class466 var7, int var8, int var9, int var10, int var11) {
      if(var0 == 0) {
         return Class668.method7963(var1, var2, var3, var4, var5, var6, var9, var10, (byte)-26);
      } else if(var0 == 1) {
         return Class161.method1884(var1, var2, var3, var4, var5, var6, var8);
      } else if(5 == var0) {
         return Class490.method5870(var1, var2, var3, var4, var5, var6, var7, var8);
      } else if(var0 == 3) {
         return Class404.method4871(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public abstract boolean method2299();

   public abstract int method2300(int var1, int var2, int var3, int var4, int var5, int var6);

   public boolean method2301(int var1, int var2, Class445 var3, Class437 var4, int var5) {
      return this.method2302(var1, var2, 0, 0, var3, var4);
   }

   abstract boolean method2302(int var1, int var2, int var3, int var4, Class445 var5, Class437 var6);

   public abstract void method2303(Class445 var1, Class164 var2, Class437 var3);

   public abstract Class526_Sub8 method2304(int var1);

   public abstract void method2305(Class526_Sub8 var1);

   public Class153 method2306(int var1, int var2, boolean var3, int var4) {
      return this.method2307(var1, var2, var3, false);
   }

   public abstract Class153 method2307(int var1, int var2, boolean var3, boolean var4);

   public abstract boolean method2308();

   public abstract void method2309(int var1, Class172 var2);

   public abstract Class153 method2310(Class173 var1, boolean var2);

   public abstract Class153 method2311(int var1, int var2, int var3, int var4, boolean var5);

   public void method2312() {
   }

   public abstract Class163 method2313(Class1 var1, Class173[] var2, boolean var3);

   public void method2314() {
   }

   abstract boolean method2315(int var1, int var2, int var3, int var4, Class445 var5, Class437 var6);

   public abstract void method2316(int var1, Class162 var2, int var3, int var4);

   public abstract void method2317(int var1, int var2, int var3, int var4);

   public abstract Class433 method2318();

   public abstract Class445 method2319();

   public abstract void method2320(int var1);

   public abstract Class168 method2321(Class170 var1, int var2, int var3, int var4, int var5);

   public abstract String method2322();

   public abstract Class148 method2323(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7);

   public boolean method2324(byte var1) {
      return true;
   }

   public abstract void method2325();

   public abstract void method2326(Class445 var1);

   public abstract void method2327();

   public abstract void method2328(boolean var1);

   public abstract void method2329(Class433 var1);

   public abstract Class433 method2330();

   public abstract void method2331(float var1);

   Class174(Class169 var1, Interface24 var2, Interface47 var3, Interface49 var4, Interface46 var5) {
      this.aClass169_2035 = var1;
      this.anInterface24_2034 = var2;
      this.anInterface47_2036 = var3;
      this.anInterface49_2040 = var4;
      int var6 = -1;

      for(int var7 = 0; var7 < 8; ++var7) {
         if(!aBoolArray2032[var7]) {
            aBoolArray2032[var7] = true;
            var6 = var7;
            break;
         }
      }

      if(-1 == var6) {
         throw new IllegalStateException("");
      } else {
         this.anInt2030 = var6 * -1998094567;
      }
   }

   public abstract void method2332(int var1);

   public abstract void method2333(int var1, int var2, int var3);

   public abstract int method2334();

   public Class526_Sub16 method2335(int var1, int var2, int var3, int var4, int var5, float var6) {
      return new Class526_Sub16(var1, var2, var3, var4, var5, var6);
   }

   public abstract void method2336(int var1, Class526_Sub16[] var2);

   abstract void method2337(float var1, float var2, float var3, float var4, float var5, float var6);

   public abstract Class178 method2338(Class178 var1, Class178 var2, float var3, Class178 var4);

   public abstract void method2339();

   public abstract void method2340(int var1, int var2, int var3, int var4);

   public abstract void method2341(int var1, int var2);

   public abstract void method2342(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9, int var10, int var11, int var12);

   public abstract boolean method2343();

   public final void method2344(int var1, int var2, int var3, int var4, int var5) {
      this.method2293(var1, var2, var3, var4, 1);
   }

   public abstract Class176 method2345(int[] var1);

   public abstract Class184_Sub2 method2346();

   public abstract void method2347(Class176 var1, float var2, Class176 var3, float var4, Class176 var5, float var6);

   public abstract boolean method2348();

   public abstract void method2349();

   public void method2350(float var1, float var2, float var3, byte var4) {
      this.method2351(var1, var2, var3, 0.0F, 1.0F, 1.0F);
   }

   abstract void method2351(float var1, float var2, float var3, float var4, float var5, float var6);

   public abstract int method2352();

   public abstract void method2353(int var1, Class172 var2);

   public abstract void method2354();

   public abstract void method2355(float var1, float var2, float var3, float[] var4);

   public final void method2356(int var1, int var2, int var3, int var4, int var5, byte var6) {
      this.method2290(var1, var2, var3, var4, var5, 1);
   }

   public float[] method2357(int var1, int var2, int var3, int var4, float[] var5, int var6, int var7, int var8, short var9) {
      float[] var10 = new float[var3 * var4 * var8];
      if(var7 == 0) {
         var7 = var1 * var8;
      }

      for(int var11 = 0; var11 < var4; ++var11) {
         int var12;
         int var13;
         int var14;
         if(var11 < var2) {
            var12 = var6 + var7 * var11;

            for(var13 = 0; var13 < var1; ++var13) {
               for(var14 = 0; var14 < var8; ++var14) {
                  var10[var14 + var13 * var8 + var8 * var11 * var3] = var5[var14 + var13 * var8 + var12];
               }
            }

            float[] var16 = new float[var8];

            for(var14 = 0; var14 < var8; ++var14) {
               var16[var14] = var5[var14 + var12 + var8 * (var1 - 1)];
            }

            for(var14 = var1; var14 < var3; ++var14) {
               for(int var15 = 0; var15 < var8; ++var15) {
                  var10[var15 + var11 * var3 * var8 + var14 * var8] = var16[var15];
               }
            }
         } else {
            var12 = (var2 - 1) * var3 * var8;

            for(var13 = 0; var13 < var3; ++var13) {
               for(var14 = 0; var14 < var8; ++var14) {
                  var10[var3 * var11 * var8 + var13 * var8 + var14] = var10[var14 + var8 * var13 + var12];
               }
            }
         }
      }

      return var10;
   }

   public byte[] method2358(int var1, int var2, int var3, int var4, byte[] var5, int var6, int var7, int var8, int var9) {
      byte[] var10 = new byte[var8 * var3 * var4];
      if(0 == var7) {
         var7 = var1 * var8;
      }

      for(int var11 = 0; var11 < var4; ++var11) {
         int var12;
         int var13;
         int var14;
         if(var11 < var2) {
            var12 = var6 + var11 * var7;

            for(var13 = 0; var13 < var1; ++var13) {
               for(var14 = 0; var14 < var8; ++var14) {
                  var10[var3 * var11 * var8 + var8 * var13 + var14] = var5[var12 + var13 * var8 + var14];
               }
            }

            byte[] var16 = new byte[var8];

            for(var14 = 0; var14 < var8; ++var14) {
               var16[var14] = var5[var14 + var12 + (var1 - 1) * var8];
            }

            for(var14 = var1; var14 < var3; ++var14) {
               for(int var15 = 0; var15 < var8; ++var15) {
                  var10[var11 * var3 * var8 + var14 * var8 + var15] = var16[var15];
               }
            }
         } else {
            var12 = var8 * (var2 - 1) * var3;

            for(var13 = 0; var13 < var3; ++var13) {
               for(var14 = 0; var14 < var8; ++var14) {
                  var10[var14 + var3 * var11 * var8 + var8 * var13] = var10[var14 + var12 + var8 * var13];
               }
            }
         }
      }

      return var10;
   }

   public abstract void method2359(boolean var1);

   public abstract Class157 method2360();

   public abstract void method2361(int var1, Class162 var2, int var3, int var4);

   public abstract Class157 method2362();

   abstract void method2363(int var1, int var2) throws Exception_Sub4;

   public abstract void method2364(int var1, float var2, float var3, float var4, float var5, float var6);

   public abstract Class148 method2365(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7);

   abstract void method2366();

   abstract void method2367(int var1, int var2, int var3, int var4, int var5);

   public abstract int method2368();

   public abstract int method2369();

   public abstract boolean method2370();

   public abstract boolean method2371();

   public abstract Class445 method2372();

   public abstract boolean method2373();

   public abstract boolean method2374();

   public abstract boolean method2375();

   public void method2376(int[] var1) {
      if(null != this.aClass184_Sub1_2026) {
         var1[0] = this.aClass184_Sub1_2026.method2691();
         var1[1] = this.aClass184_Sub1_2026.method2693();
      } else {
         var1[1] = 0;
         var1[0] = 0;
      }

   }

   public abstract void method2377(Class433 var1);

   public abstract boolean method2378();

   public abstract boolean method2379();

   public abstract Class153 method2380(Class173 var1, boolean var2);

   public abstract boolean method2381();

   public abstract Class433 method2382();

   public abstract boolean method2383();

   public abstract boolean method2384();

   public abstract boolean method2385();

   public abstract boolean method2386();

   public abstract boolean method2387();

   public abstract void method2388(int var1);

   public abstract String method2389();

   public abstract int[] method2390();

   public abstract int[] method2391();

   public abstract int[] method2392();

   public abstract void method2393(boolean var1);

   public abstract void method2394(boolean var1);

   public abstract void method2395(long var1);

   public void method2396() {
   }

   public abstract int[] method2397(int var1, int var2, int var3, int var4);

   public abstract void method2398();

   public abstract void method2399();

   public abstract void method2400();

   public abstract boolean method2401();

   public void method2402(int[] var1) {
      if(null != this.aClass184_Sub1_2026) {
         var1[0] = this.aClass184_Sub1_2026.method2691();
         var1[1] = this.aClass184_Sub1_2026.method2693();
      } else {
         var1[1] = 0;
         var1[0] = 0;
      }

   }

   public abstract boolean method2403();

   public abstract boolean method2404();

   public abstract boolean method2405();

   public abstract boolean method2406();

   public abstract boolean method2407();

   public abstract boolean method2408();

   public abstract boolean method2409();

   public abstract boolean method2410();

   public abstract boolean method2411();

   public abstract boolean method2412();

   public abstract boolean method2413();

   public abstract int method2414();

   public abstract int method2415();

   public abstract boolean method2416();

   public abstract void method2417(int var1, int var2, int var3);

   public abstract void method2418();

   public abstract long method2419(int var1, int var2);

   public abstract long method2420(int var1, int var2);

   public abstract long method2421(int var1, int var2);

   public abstract void method2422(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public abstract void method2423(int var1, int var2, int[] var3, int[] var4);

   public abstract void method2424();

   public abstract void method2425();

   public abstract void method2426(long var1);

   public abstract void method2427(boolean var1);

   public abstract void method2428(float var1);

   public abstract void method2429(boolean var1);

   public abstract void method2430();

   public abstract void method2431(int var1, int var2, int var3, int var4);

   public abstract void method2432(int var1, int var2, int var3, int var4);

   public abstract void method2433(int[] var1);

   public abstract void method2434(float var1, float var2);

   public abstract void method2435(float var1, float var2);

   abstract void method2436(int var1, int var2, int var3, int var4, int var5);

   public abstract void method2437(int var1, int var2, int var3, int var4);

   public abstract void method2438(int var1, int var2, int var3, int var4);

   public abstract void method2439(int var1, int var2);

   public abstract void method2440(int var1, int var2);

   public abstract void method2441(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method2442(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method2443(boolean var1);

   public abstract Class178 method2444(int var1);

   public abstract void method2445(int var1, int var2, int var3, int var4);

   public abstract void method2446(int var1, int var2, int var3);

   abstract void method2447(int var1, int var2, int var3, int var4, int var5);

   public abstract int method2448(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method2449(Class178 var1);

   abstract void method2450(int var1, int var2, int var3, int var4, int var5);

   abstract void method2451(int var1, int var2, int var3, int var4, int var5);

   public final void method2452() throws Exception_Sub4 {
      this.method2230(0, 0);
   }

   public abstract void method2453(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

   public abstract void method2454(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method2455(float var1, float var2, float var3, float var4, float var5);

   public final void method2456(Class184_Sub2 var1, byte var2) {
      if(-1238690977 * this.anInt2048 >= 0 && var1 == this.aClass184_Sub2Array2047[-1238690977 * this.anInt2048]) {
         this.aClass184_Sub2Array2047[(this.anInt2048 -= 1138493599) * -1238690977 + 1] = null;
         var1.method2694();
         if(this.anInt2048 * -1238690977 >= 0) {
            this.aClass184_2049 = this.aClass184_Sub2Array2047[this.anInt2048 * -1238690977];
            this.aClass184_Sub2Array2047[this.anInt2048 * -1238690977].method363();
         } else {
            this.aClass184_2049 = this.aClass184_Sub1_2026;
            this.aClass184_Sub1_2026.method363();
         }

      } else {
         throw new RuntimeException();
      }
   }

   public abstract void method2457(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9);

   public abstract void method2458(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9, int var10, int var11, int var12);

   public abstract void method2459(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9, int var10, int var11, int var12);

   public abstract boolean method2460();

   public abstract void method2461(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public abstract void method2462(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public abstract int method2463(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract int method2464(int var1, int var2);

   public final void method2465(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method2630(var1, var2, var3, var4, var5, 1);
   }

   abstract boolean method2466(int var1, int var2, int var3, int var4, Class445 var5, Class437 var6);

   public abstract Class184_Sub2 method2467();

   public abstract void method2468(int var1, int var2, int var3);

   public abstract void method2469(Class445 var1, Class164 var2, Class437 var3);

   public abstract Class526_Sub8 method2470(int var1);

   public abstract Class526_Sub8 method2471(int var1);

   public void method2472(boolean var1) {
   }

   public abstract void method2473(Class526_Sub8 var1);

   public abstract void method2474(Class526_Sub8 var1);

   public abstract Class153 method2475(int var1, int var2, boolean var3, boolean var4);

   public abstract Class153 method2476(int var1, int var2, boolean var3, boolean var4);

   public abstract Class178 method2477(int var1);

   public abstract Class153 method2478(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract int[] method2479(int var1, int var2, int var3, int var4);

   public abstract Class153 method2480(int var1, int var2, int var3, int var4, boolean var5);

   public abstract Class153 method2481(int var1, int var2, int var3, int var4, boolean var5);

   public abstract boolean method2482();

   public abstract Class162 method2483(int var1, int var2, int[] var3, int[] var4);

   public void method2484() {
   }

   public abstract boolean method2485();

   public abstract void method2486(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9);

   public abstract Class178 method2487(int var1);

   public abstract void method2488(int var1, Class162 var2, int var3, int var4);

   public abstract void method2489(int var1, Class162 var2, int var3, int var4);

   public abstract Class163 method2490(Class1 var1, Class173[] var2, boolean var3);

   public abstract Class163 method2491(Class1 var1, Class173[] var2, boolean var3);

   public abstract Class163 method2492(Class1 var1, Class173[] var2, boolean var3);

   public abstract void method2493(int var1);

   public abstract void method2494(int var1);

   public abstract void method2495(int var1);

   public abstract int method2496(int var1, int var2);

   public abstract void method2497(float var1, float var2);

   public abstract void method2498(int var1);

   public abstract Class445 method2499();

   public abstract Class445 method2500();

   public abstract int method2501();

   public abstract Class157 method2502();

   public Class526_Sub16 method2503(int var1, int var2, int var3, int var4, int var5, float var6) {
      return new Class526_Sub16(var1, var2, var3, var4, var5, var6);
   }

   public abstract void method2504(int var1, Class526_Sub16[] var2);

   abstract void method2505(int var1, int var2, int var3, int var4, int var5);

   public abstract void method2506(Class177 var1);

   public abstract Class445 method2507();

   public abstract void method2508(Class433 var1);

   public abstract void method2509(Class433 var1);

   public abstract void method2510(Class433 var1);

   public abstract Class162 method2511(int var1, int var2, int[] var3, int[] var4);

   public abstract boolean method2512();

   public abstract void method2513(float var1, float var2, float var3, float[] var4);

   public abstract void method2514(int var1, int var2, int var3);

   public Class153 method2515(int[] var1, int var2, int var3, int var4, int var5, byte var6) {
      return this.method2613(var1, var2, var3, var4, var5, true);
   }

   public abstract void method2516(Class177 var1);

   public abstract void method2517(int var1);

   public void method2518() {
   }

   public void method2519(boolean var1) {
   }

   public abstract void method2520(float var1, float var2, float var3, float var4, float var5);

   public abstract void method2521(int var1, int var2, int var3);

   public abstract int method2522();

   public abstract void method2523(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract Class178 method2524(Class178 var1, Class178 var2, float var3, Class178 var4);

   public abstract Class178 method2525(Class178 var1, Class178 var2, float var3, Class178 var4);

   public abstract Class178 method2526(Class178 var1, Class178 var2, float var3, Class178 var4);

   public abstract Class178 method2527(Class178 var1, Class178 var2, float var3, Class178 var4);

   public abstract void method2528(Class178 var1);

   public abstract void method2529(float var1);

   public void method2530() {
   }

   public abstract void method2531(int var1, int var2, int var3, int var4);

   public abstract void method2532(int var1, int var2, int var3);

   public abstract int method2533(int var1, int var2);

   public abstract void method2534(int var1, int var2);

   public abstract void method2535(int var1, int var2);

   public abstract void method2536(int var1, Class172 var2);

   public abstract boolean method2537();

   public abstract void method2538(int var1, int var2, int var3, int var4);

   abstract void method2539(int var1, int var2, int var3, int var4, int var5);

   public abstract void method2540(float var1, float var2, float var3, float var4, float var5);

   public abstract Class176 method2541(int[] var1);

   public abstract void method2542(int var1, float var2, float var3, float var4, float var5, float var6);

   public abstract Class176 method2543(int[] var1);

   public abstract boolean method2544();

   public abstract boolean method2545();

   public abstract void method2546(Class176 var1, float var2, Class176 var3, float var4, Class176 var5, float var6);

   public abstract void method2547(Class176 var1, float var2, Class176 var3, float var4, Class176 var5, float var6);

   public abstract boolean method2548();

   public abstract void method2549();

   public abstract boolean method2550();

   public abstract boolean method2551();

   public abstract boolean method2552();

   abstract void method2553(float var1, float var2, float var3, float var4, float var5, float var6);

   abstract void method2554(int var1, int var2, int var3, int var4, int var5);

   public abstract void method2555(int var1, Class172 var2);

   public abstract void method2556(int var1, int var2, int var3, int var4);

   abstract boolean method2557(int var1, int var2, int var3, int var4, Class445 var5, Class437 var6);

   public abstract void method2558();

   public abstract void method2559();

   public abstract void method2560(float var1, float var2, float var3, float[] var4);

   public abstract void method2561(float var1, float var2, float var3, float[] var4);

   public abstract Class178 method2562(Class178 var1, Class178 var2, float var3, Class178 var4);

   public abstract Class184_Sub2 method2563();

   public abstract void method2564(int var1);

   public abstract Class184_Sub2 method2565();

   public abstract Class184_Sub2 method2566();

   public abstract Interface21 method2567(int var1, int var2, Class144 var3, Class166 var4, int var5);

   public abstract Interface21 method2568(int var1, int var2, Class144 var3, Class166 var4, int var5);

   public abstract Interface21 method2569(int var1, int var2, Class144 var3, Class166 var4, int var5);

   public abstract Class162 method2570(int var1, int var2, int[] var3, int[] var4);

   public abstract Interface23 method2571(int var1, int var2, int var3);

   public abstract Interface23 method2572(int var1, int var2, int var3);

   public abstract void method2573(int var1, int var2, int var3, int var4);

   void method2574() {
      this.method2232(1135751733);
   }

   void method2575() {
      this.method2232(1135751733);
   }

   public abstract boolean method2576();

   public abstract boolean method2577();

   public abstract boolean method2578();

   public abstract boolean method2579();

   public abstract boolean method2580();

   public abstract boolean method2581();

   public abstract void method2582(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

   public abstract void method2583(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

   public abstract Class168 method2584(Class170 var1, int var2, int var3, int var4, int var5);

   public abstract Class176 method2585(int[] var1);

   public abstract Class148 method2586(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7);

   public abstract Class433 method2587();

   public abstract boolean method2588();

   public abstract void method2589(int var1, Class162 var2, int var3, int var4);

   public abstract void method2590(int[] var1);

   public abstract void method2591(int[] var1);

   public abstract void method2592(Class445 var1);

   public int[] method2593(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7, int var8) {
      int[] var9 = new int[var3 * var4];
      if(var7 == 0) {
         var7 = var1;
      }

      for(int var10 = 0; var10 < var4; ++var10) {
         int var11;
         int var12;
         if(var10 >= var2) {
            var11 = (var2 - 1) * var3;

            for(var12 = 0; var12 < var3; ++var12) {
               var9[var3 * var10 + var12] = var9[var12 + var11];
            }
         } else {
            var11 = var6 + var10 * var7;

            for(var12 = 0; var12 < var1; ++var12) {
               var9[var10 * var3 + var12] = var5[var12 + var11];
            }

            var12 = var5[var11 + (var1 - 1)];

            for(int var13 = var1; var13 < var3; ++var13) {
               var9[var13 + var10 * var3] = var12;
            }
         }
      }

      return var9;
   }

   public abstract void method2594(int var1, float var2, float var3, float var4, float var5, float var6);

   public final void method2595(int var1, int var2, int var3, int var4, int var5) {
      this.method2436(var1, var2, var3, var4, 1);
   }

   public final void method2596() throws Exception_Sub4 {
      this.method2230(0, 0);
   }

   public abstract Class153 method2597(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

   public void method2598(boolean var1) {
   }

   public abstract Class157 method2599();

   public abstract void method2600(int var1, int var2, int var3, int var4);

   abstract void method2601(int var1, int var2, int var3, int var4, int var5);

   public abstract String method2602();

   public abstract boolean method2603();

   public abstract void method2604();

   public abstract Class526_Sub8 method2605(int var1);

   abstract Class184_Sub1 method2606(Canvas var1, int var2, int var3);

   public abstract void method2607(int var1, Class172 var2);

   public abstract int method2608(int var1, int var2);

   public abstract void method2609();

   public abstract boolean method2610();

   public abstract void method2611();

   public abstract boolean method2612();

   public abstract Class153 method2613(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract int method2614();

   public abstract void method2615(int var1, Class162 var2, int var3, int var4);

   public abstract void method2616(int var1, Class526_Sub16[] var2);

   public abstract void method2617(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract Class433 method2618();

   abstract Class184_Sub1 method2619(Canvas var1, int var2, int var3);

   public abstract Interface23 method2620(int var1, int var2);

   public abstract void method2621(Class178 var1);

   public abstract void method2622(int var1, int var2, int var3, int var4);

   public final void method2623(Class184_Sub2 var1, short var2) {
      if(this.anInt2048 * -1238690977 >= 3) {
         throw new RuntimeException();
      } else {
         if(-1238690977 * this.anInt2048 >= 0) {
            this.aClass184_Sub2Array2047[this.anInt2048 * -1238690977].method2694();
         } else {
            this.aClass184_Sub1_2026.method2694();
         }

         this.aClass184_2049 = this.aClass184_Sub2Array2047[(this.anInt2048 += 1138493599) * -1238690977] = var1;
         var1.method363();
      }
   }

   public void method2624() {
   }

   public void method2625() {
   }

   public void method2626() {
   }

   public void method2627() {
   }

   public void method2628() {
   }

   public abstract boolean method2629();

   public abstract void method2630(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method2631();

   static final void method2632(Class681 var0, byte var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class617.method7321((long)var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] * 60000L, Class26.aClass673_247.getId(), true, -1663212688) + " UTC";
   }

   static final void method2633(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class208.method2934((byte)-119);
      if(null != var3) {
         boolean var4 = var3.method10714(var2 >> 14 & 16383, var2 & 16383, Class680.anIntArray8612, 385861540);
         if(var4) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class680.anIntArray8612[1];
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class680.anIntArray8612[2];
         } else {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         }
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      }

   }

   public static void method2634(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Class526_Sub1 var8 = null;

      for(Class526_Sub1 var9 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8206((byte)42); var9 != null; var9 = (Class526_Sub1)Class526_Sub1.aClass702_10311.method8181(527567319)) {
         if(var0 == var9.anInt10306 * -1761255799 && var1 == var9.anInt10301 * 195793035 && var2 == var9.anInt10298 * 64888215 && var9.anInt10299 * -1514081739 == var3) {
            var8 = var9;
            break;
         }
      }

      if(var8 == null) {
         var8 = new Class526_Sub1();
         var8.anInt10306 = var0 * -108693575;
         var8.anInt10299 = var3 * 639914013;
         var8.anInt10301 = var1 * 767842083;
         var8.anInt10298 = 1139683879 * var2;
         if(var1 >= 0 && var2 >= 0 && var1 < client.aClass505_11204.method6056(-1746741811) && var2 < client.aClass505_11204.method6057(126749238)) {
            NPCDirection.method7983(var8, (byte)-95);
         }

         Class526_Sub1.aClass702_10311.method8176(var8, -1509560868);
      }

      var8.anInt10305 = var4 * 1868655893;
      var8.anInt10307 = var5 * -369321043;
      var8.anInt10312 = var6 * 1471294163;
      var8.aBool10300 = true;
      var8.aBool10310 = false;
   }

   static final void method2635(Class681 var0, short var1) {
      if(Class195.aClass292_Sub1_2182.method3940(1391602327) != Class298.aClass298_3241) {
         throw new RuntimeException();
      } else {
         ((Class689_Sub2)Class195.aClass292_Sub1_2182.method3938((byte)8)).method10203(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], 931547181);
      }
   }
}
