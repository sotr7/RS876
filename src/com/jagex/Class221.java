package com.jagex;

import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class348;
import com.jagex.Class681;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class221 {
   static final int anInt2299 = 8;
   static int anInt2301;
   static final int anInt2304 = 40;
   public int anInt2302;
   List aList2306;
   List aList2303;
   List aList2298;
   List aList2305;
   static Integer anInteger2300 = Integer.valueOf(-1);

   public int method3048(int var1, byte var2) {
      return this.aList2303.indexOf(Integer.valueOf(var1));
   }

   public int method3049(int var1) {
      return this.aList2306.size();
   }

   public int method3050(byte var1) {
      return this.aList2303.size();
   }

   public int method3051(int var1) {
      return this.method3058(var1, -1, -541701230);
   }

   public int method3052(int var1, byte var2) {
      return this.aList2306.indexOf(Integer.valueOf(var1));
   }

   public int method3053(int var1, int var2) {
      return ((Integer)this.aList2306.get(var1)).intValue();
   }

   public int method3054(int var1, byte var2) {
      return this.method3058(var1, -1, 124553690);
   }

   public void method3055(int var1, boolean var2, int var3) {
      this.aList2298.set(var1, var2?Integer.valueOf(var1):anInteger2300);
   }

   public void method3056(int var1, int var2, byte var3) {
      this.aList2298.set(var1, Integer.valueOf(var2));
   }

   public boolean method3057(int var1, int var2) {
      return !((Integer)this.aList2298.get(var1)).equals(anInteger2300);
   }

   public int method3058(int var1, int var2, int var3) {
      if(this.aList2306.size() == 8) {
         throw new RuntimeException("");
      } else if(this.method3052(var1, (byte)116) != -1) {
         throw new RuntimeException("");
      } else {
         if(var2 == -1) {
            var2 = this.aList2306.size();
         }

         this.aList2306.add(var2, Integer.valueOf(var1));
         Iterator var4 = this.aList2305.iterator();

         while(var4.hasNext()) {
            List var5 = (List)var4.next();
            var5.add(var2, (Object)null);
         }

         return var2;
      }
   }

   public void method3059(int var1, int var2) {
      this.aList2306.remove(var1);
      Iterator var3 = this.aList2305.iterator();

      while(var3.hasNext()) {
         List var4 = (List)var3.next();
         var4.remove(var1);
      }

   }

   public int method3060(int var1, int var2) {
      return this.method3061(var1, -1, -2037172536);
   }

   public int method3061(int var1, int var2, int var3) {
      if(this.aList2303.size() == 40) {
         throw new RuntimeException("");
      } else if(this.method3048(var1, (byte)44) != -1) {
         throw new RuntimeException("");
      } else {
         if(-1 == var2) {
            var2 = this.aList2303.size();
         }

         this.method3062(var1, var2, 397481978);

         for(int var4 = var2 + 1; var4 < this.aList2303.size(); ++var4) {
            Integer var5 = (Integer)this.aList2298.get(var4);
            if(!var5.equals(anInteger2300) && var5.intValue() < var4) {
               this.method3081(var4, var4 - 1, (byte)-43);
            }
         }

         return this.method3048(var1, (byte)21);
      }
   }

   void method3062(int var1, int var2, int var3) {
      this.aList2303.add(var2, Integer.valueOf(var1));
      this.aList2298.add(var2, anInteger2300);
      ArrayList var4 = new ArrayList();

      for(int var5 = 0; var5 < this.aList2306.size(); ++var5) {
         var4.add((Object)null);
      }

      this.aList2305.add(var2, var4);
   }

   public void method3063(int var1, int var2) {
      this.method3093(var1, 176642841);
      int var3 = var1;

      for(int var4 = var1; var4 < this.aList2303.size(); ++var4) {
         if(!this.method3057(var4, -776478280)) {
            if(var3 != var4) {
               this.method3081(var4, var3, (byte)-14);
            }

            var3 = 1 + var4;
         }
      }

   }

   public void method3064(int var1, boolean var2) {
      this.aList2298.set(var1, var2?Integer.valueOf(var1):anInteger2300);
   }

   public int method3065(int var1, int var2) {
      if(this.aList2306.size() == 8) {
         throw new RuntimeException("");
      } else if(this.method3052(var1, (byte)81) != -1) {
         throw new RuntimeException("");
      } else {
         if(var2 == -1) {
            var2 = this.aList2306.size();
         }

         this.aList2306.add(var2, Integer.valueOf(var1));
         Iterator var3 = this.aList2305.iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            var4.add(var2, (Object)null);
         }

         return var2;
      }
   }

   public void method3066(int var1) {
      this.aList2306.remove(var1);
      Iterator var2 = this.aList2305.iterator();

      while(var2.hasNext()) {
         List var3 = (List)var2.next();
         var3.remove(var1);
      }

   }

   public int method3067(int var1) {
      return this.method3058(var1, -1, -1615768610);
   }

   public int method3068(int var1) {
      return this.aList2306.indexOf(Integer.valueOf(var1));
   }

   public int method3069() {
      return this.aList2306.size();
   }

   public int method3070() {
      return this.aList2303.size();
   }

   public int method3071() {
      return this.aList2303.size();
   }

   public int method3072() {
      return this.aList2303.size();
   }

   public int method3073(int var1) {
      return this.method3058(var1, -1, -1738759215);
   }

   public int method3074(int var1) {
      return this.aList2303.indexOf(Integer.valueOf(var1));
   }

   public void method3075(int var1, int var2, byte var3) {
      this.method3081(var1, var2, (byte)-119);

      for(int var4 = 0; var4 < this.aList2298.size(); ++var4) {
         Integer var5 = (Integer)this.aList2298.get(var4);
         if(!var5.equals(anInteger2300)) {
            Integer var6 = Integer.valueOf(var4);
            if(!var5.equals(var6)) {
               this.aList2298.set(var4, var6);
            }
         }
      }

   }

   public int method3076(int var1) {
      return ((Integer)this.aList2303.get(var1)).intValue();
   }

   public Class221(int var1) {
      this.anInt2302 = 1023459273 * var1;
      this.aList2306 = new ArrayList();
      this.aList2303 = new ArrayList();
      this.aList2298 = new ArrayList();
      this.aList2305 = new ArrayList();
   }

   public int method3077(int var1) {
      return this.aList2303.indexOf(Integer.valueOf(var1));
   }

   public void method3078(int var1, int var2, int var3) {
      this.aList2306.add(var2, this.aList2306.remove(var1));
      Iterator var4 = this.aList2305.iterator();

      while(var4.hasNext()) {
         List var5 = (List)var4.next();
         var5.add(var2, var5.remove(var1));
      }

   }

   public int method3079(int var1) {
      return this.method3058(var1, -1, 1439408763);
   }

   public void method3080(int var1, boolean var2) {
      this.aList2298.set(var1, var2?Integer.valueOf(var1):anInteger2300);
   }

   void method3081(int var1, int var2, byte var3) {
      this.aList2303.add(var2, this.aList2303.remove(var1));
      this.aList2298.add(var2, this.aList2298.remove(var1));
      this.aList2305.add(var2, this.aList2305.remove(var1));
   }

   public void method3082(int var1, int var2, Object var3, byte var4) {
      ((List)this.aList2305.get(var1)).set(var2, var3);
   }

   public void method3083(int var1, int var2) {
      this.aList2298.set(var1, Integer.valueOf(var2));
   }

   public void method3084(int var1, int var2) {
      this.aList2298.set(var1, Integer.valueOf(var2));
   }

   public boolean method3085(int var1) {
      return !((Integer)this.aList2298.get(var1)).equals(anInteger2300);
   }

   public int method3086() {
      return this.aList2303.size();
   }

   public int method3087(int var1, int var2) {
      if(this.aList2306.size() == 8) {
         throw new RuntimeException("");
      } else if(this.method3052(var1, (byte)103) != -1) {
         throw new RuntimeException("");
      } else {
         if(var2 == -1) {
            var2 = this.aList2306.size();
         }

         this.aList2306.add(var2, Integer.valueOf(var1));
         Iterator var3 = this.aList2305.iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            var4.add(var2, (Object)null);
         }

         return var2;
      }
   }

   public void method3088(int var1, int var2) {
      this.method3081(var1, var2, (byte)-12);

      for(int var3 = 0; var3 < this.aList2298.size(); ++var3) {
         Integer var4 = (Integer)this.aList2298.get(var3);
         if(!var4.equals(anInteger2300)) {
            Integer var5 = Integer.valueOf(var3);
            if(!var4.equals(var5)) {
               this.aList2298.set(var3, var5);
            }
         }
      }

   }

   void method3089(int var1, int var2) {
      this.aList2303.add(var2, this.aList2303.remove(var1));
      this.aList2298.add(var2, this.aList2298.remove(var1));
      this.aList2305.add(var2, this.aList2305.remove(var1));
   }

   void method3090(int var1) {
      this.aList2303.remove(var1);
      this.aList2298.remove(var1);
      this.aList2305.remove(var1);
   }

   public Object method3091(int var1, int var2, int var3) {
      return ((List)this.aList2305.get(var1)).get(var2);
   }

   public int method3092(int var1, byte var2) {
      return ((Integer)this.aList2303.get(var1)).intValue();
   }

   void method3093(int var1, int var2) {
      this.aList2303.remove(var1);
      this.aList2298.remove(var1);
      this.aList2305.remove(var1);
   }

   static final void method3094(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
   }

   public static InterfaceDef method3095(int var0, byte var1) {
      int var2 = var0 >> 16;
      if(Class315_Sub1.aClass243Array10033[var2] == null || Class315_Sub1.aClass243Array10033[var2].method3331(var0, -1156029899) == null) {
         boolean var3 = Class348.method4525(var2, (int[])null, -1342017416);
         if(!var3) {
            return null;
         }
      }

      return Class315_Sub1.aClass243Array10033[var2].method3331(var0, -1156029899);
   }
}
