package com.jagex;

import com.jagex.Class141;
import com.jagex.Class167;
import com.jagex.Class174;
import com.jagex.Class177;
import com.jagex.Class182;
import com.jagex.Class304;
import com.jagex.Class526_Sub30;
import com.jagex.Class539_Sub1_Sub1_Sub1;
import com.jagex.Class549;
import com.jagex.Class619;
import com.jagex.Class631;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class614 {
   boolean aBool8081 = false;
   public boolean aBool8074 = false;
   int anInt8075 = 0;
   List aList8080 = new LinkedList();
   int anInt8086 = 0;
   List aList8082 = new LinkedList();
   int anInt8083 = 0;
   long aLong8087;
   long aLong8078;
   boolean aBool8085 = false;
   boolean aBool8079 = false;
   int anInt8077;
   Class177 aClass177_8084 = new Class177();
   Class539_Sub1_Sub1_Sub1[] aClass539_Sub1_Sub1_Sub1Array8076 = new Class539_Sub1_Sub1_Sub1[8192];
   static boolean[] aBoolArray8088 = new boolean[64];
   static boolean[] aBoolArray8089 = new boolean[16];

   public void method7241() {
      this.aBool8081 = true;
   }

   void method7242() {
      this.aBool8074 = true;
      Iterator var1 = this.aList8082.iterator();

      while(var1.hasNext()) {
         Class526_Sub30 var2 = (Class526_Sub30)var1.next();
         if(var2.aClass391_10569.anInt4078 * -1760706667 == 1) {
            var2.method6332(-1949449864);
         }
      }

      for(int var3 = 0; var3 < this.aClass539_Sub1_Sub1_Sub1Array8076.length; ++var3) {
         if(this.aClass539_Sub1_Sub1_Sub1Array8076[var3] != null) {
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3].method10923();
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3] = null;
         }
      }

      this.anInt8075 = 0;
      this.aList8080 = new LinkedList();
      this.anInt8086 = 0;
      this.aList8082 = new LinkedList();
      this.anInt8083 = 0;
   }

   void method7243(int var1, boolean var2) {
      Class619.aList8112.add(this);
      this.aLong8087 = (long)var1;
      this.aLong8078 = (long)var1;
      this.aBool8081 = true;
      this.aBool8085 = var2;
   }

   public void method7244() {
      this.aBool8081 = true;
   }

   void method7245() {
      this.aBool8074 = true;
      Iterator var1 = this.aList8082.iterator();

      while(var1.hasNext()) {
         Class526_Sub30 var2 = (Class526_Sub30)var1.next();
         if(var2.aClass391_10569.anInt4078 * -1760706667 == 1) {
            var2.method6332(-1949449864);
         }
      }

      for(int var3 = 0; var3 < this.aClass539_Sub1_Sub1_Sub1Array8076.length; ++var3) {
         if(this.aClass539_Sub1_Sub1_Sub1Array8076[var3] != null) {
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3].method10923();
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3] = null;
         }
      }

      this.anInt8075 = 0;
      this.aList8080 = new LinkedList();
      this.anInt8086 = 0;
      this.aList8082 = new LinkedList();
      this.anInt8083 = 0;
   }

   public void method7246() {
      this.aBool8079 = true;
   }

   void method7247() {
      this.aBool8079 = false;
   }

   boolean method7248(Class174 var1, long var2) {
      if(this.aLong8087 != this.aLong8078) {
         this.method7246();
      } else {
         this.method7247();
      }

      if(var2 - this.aLong8087 > 750L) {
         this.method7245();
         return false;
      } else {
         int var4 = (int)(var2 - this.aLong8078);
         Iterator var5;
         Class631 var6;
         if(this.aBool8081) {
            var5 = this.aList8080.iterator();

            while(var5.hasNext()) {
               var6 = (Class631)var5.next();

               for(int var7 = 0; var7 < var6.aClass385_8220.anInt3995 * -1905021841; ++var7) {
                  var6.method7483(var1, var2, 1, !this.aBool8079, 537026915);
               }
            }

            this.aBool8081 = false;
         }

         var5 = this.aList8080.iterator();

         while(var5.hasNext()) {
            var6 = (Class631)var5.next();
            var6.method7483(var1, var2, var4, !this.aBool8079, -818682351);
         }

         this.aLong8078 = var2;
         return true;
      }
   }

   public Class177 method7249() {
      this.aClass177_8084.aClass687_2068.method8062(224418990);

      for(int var1 = 0; var1 < this.aClass539_Sub1_Sub1_Sub1Array8076.length; ++var1) {
         if(this.aClass539_Sub1_Sub1_Sub1Array8076[var1] != null && this.aClass539_Sub1_Sub1_Sub1Array8076[var1].aClass631_12098 != null) {
            this.aClass177_8084.aClass687_2068.method8060(this.aClass539_Sub1_Sub1_Sub1Array8076[var1], 1645669179);
         }
      }

      return this.aClass177_8084;
   }

   public void method7250(Class174 var1, long var2, Class182[] var4, Class141[] var5, boolean var6) {
      if(!this.aBool8074) {
         this.method7251(var1, var4, var6);
         this.method7252(var5, var6);
         this.aLong8087 = var2;
      }
   }

   void method7251(Class174 var1, Class182[] var2, boolean var3) {
      for(int var4 = 0; var4 < 64; ++var4) {
         aBoolArray8088[var4] = false;
      }

      Iterator var7 = this.aList8080.iterator();

      while(true) {
         label65:
         while(var7.hasNext()) {
            Class631 var5 = (Class631)var7.next();
            if(var2 != null) {
               for(int var6 = 0; var6 < var2.length && var6 != 64; ++var6) {
                  if(var5.aClass182_8226 == var2[var6] || var5.aClass182_8226 == var2[var6].aClass182_2080) {
                     aBoolArray8088[var6] = true;
                     var5.method7482(-1664956639);
                     var5.aBool8229 = false;
                     continue label65;
                  }
               }
            }

            if(!var3) {
               if(var5.anInt8224 * 915562815 == 0) {
                  var7.remove();
                  --this.anInt8086;
               } else {
                  var5.aBool8229 = true;
               }
            }
         }

         if(var2 != null) {
            for(int var8 = 0; var8 < var2.length && var8 != 64 && this.anInt8086 != 64; ++var8) {
               if(!aBoolArray8088[var8]) {
                  Class631 var9 = new Class631(var1, var2[var8], this, this.aLong8087);
                  this.aList8080.add(var9);
                  ++this.anInt8086;
                  aBoolArray8088[var8] = true;
               }
            }
         }

         return;
      }
   }

   void method7252(Class141[] var1, boolean var2) {
      int var3;
      for(var3 = 0; var3 < 16; ++var3) {
         aBoolArray8089[var3] = false;
      }

      Iterator var6 = this.aList8082.iterator();

      while(true) {
         Class526_Sub30 var4;
         label70:
         while(var6.hasNext()) {
            var4 = (Class526_Sub30)var6.next();
            if(var1 != null) {
               for(int var5 = 0; var5 < var1.length; ++var5) {
                  if(var4.aClass141_10568 == var1[var5] || var4.aClass141_10568 == var1[var5].aClass141_1666) {
                     aBoolArray8089[var5] = true;
                     var4.method9550(-2126404457);
                     continue label70;
                  }
               }
            }

            if(!var2) {
               var4.method6332(-1949449864);
               --this.anInt8083;
               if(var4.method6330((byte)-28)) {
                  var4.method6332(-1949449864);
                  Class619.anInt8120 -= -187798847;
               }
            }
         }

         if(var1 != null) {
            for(var3 = 0; var3 < var1.length && var3 != 16 && this.anInt8083 != 16; ++var3) {
               if(!aBoolArray8089[var3]) {
                  var4 = null;
                  if(var1[var3].method1652(Class304.anInterface46_3280, (byte)68).anInt4078 * -1760706667 == 1 && Class619.anInt8120 * 2036933953 < 32) {
                     var4 = new Class526_Sub30(var1[var3], this);
                     Class619.aClass20_8116.put(var4, (long)(var1[var3].anInt1671 * -202255101));
                     Class619.anInt8120 += -187798847;
                  }

                  if(var4 == null) {
                     var4 = new Class526_Sub30(var1[var3], this);
                  }

                  this.aList8082.add(var4);
                  ++this.anInt8083;
                  aBoolArray8089[var3] = true;
               }
            }
         }

         return;
      }
   }

   public Class177 method7253() {
      return this.aClass177_8084;
   }

   public void method7254(int var1, int var2, int var3, int var4, int var5) {
      this.anInt8077 = var1;
   }

   public void method7255() {
      this.aBool8079 = true;
   }

   Class614(int var1, boolean var2) {
      this.method7243(var1, var2);
   }

   void method7256() {
      this.aBool8074 = true;
      Iterator var1 = this.aList8082.iterator();

      while(var1.hasNext()) {
         Class526_Sub30 var2 = (Class526_Sub30)var1.next();
         if(var2.aClass391_10569.anInt4078 * -1760706667 == 1) {
            var2.method6332(-1949449864);
         }
      }

      for(int var3 = 0; var3 < this.aClass539_Sub1_Sub1_Sub1Array8076.length; ++var3) {
         if(this.aClass539_Sub1_Sub1_Sub1Array8076[var3] != null) {
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3].method10923();
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3] = null;
         }
      }

      this.anInt8075 = 0;
      this.aList8080 = new LinkedList();
      this.anInt8086 = 0;
      this.aList8082 = new LinkedList();
      this.anInt8083 = 0;
   }

   public void method7257() {
      this.aBool8081 = true;
   }

   public void method7258() {
      this.aBool8081 = true;
   }

   void method7259() {
      this.aBool8074 = true;
      Iterator var1 = this.aList8082.iterator();

      while(var1.hasNext()) {
         Class526_Sub30 var2 = (Class526_Sub30)var1.next();
         if(var2.aClass391_10569.anInt4078 * -1760706667 == 1) {
            var2.method6332(-1949449864);
         }
      }

      for(int var3 = 0; var3 < this.aClass539_Sub1_Sub1_Sub1Array8076.length; ++var3) {
         if(this.aClass539_Sub1_Sub1_Sub1Array8076[var3] != null) {
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3].method10923();
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3] = null;
         }
      }

      this.anInt8075 = 0;
      this.aList8080 = new LinkedList();
      this.anInt8086 = 0;
      this.aList8082 = new LinkedList();
      this.anInt8083 = 0;
   }

   void method7260() {
      this.aBool8074 = true;
      Iterator var1 = this.aList8082.iterator();

      while(var1.hasNext()) {
         Class526_Sub30 var2 = (Class526_Sub30)var1.next();
         if(var2.aClass391_10569.anInt4078 * -1760706667 == 1) {
            var2.method6332(-1949449864);
         }
      }

      for(int var3 = 0; var3 < this.aClass539_Sub1_Sub1_Sub1Array8076.length; ++var3) {
         if(this.aClass539_Sub1_Sub1_Sub1Array8076[var3] != null) {
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3].method10923();
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3] = null;
         }
      }

      this.anInt8075 = 0;
      this.aList8080 = new LinkedList();
      this.anInt8086 = 0;
      this.aList8082 = new LinkedList();
      this.anInt8083 = 0;
   }

   void method7261() {
      this.aBool8074 = true;
      Iterator var1 = this.aList8082.iterator();

      while(var1.hasNext()) {
         Class526_Sub30 var2 = (Class526_Sub30)var1.next();
         if(var2.aClass391_10569.anInt4078 * -1760706667 == 1) {
            var2.method6332(-1949449864);
         }
      }

      for(int var3 = 0; var3 < this.aClass539_Sub1_Sub1_Sub1Array8076.length; ++var3) {
         if(this.aClass539_Sub1_Sub1_Sub1Array8076[var3] != null) {
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3].method10923();
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3] = null;
         }
      }

      this.anInt8075 = 0;
      this.aList8080 = new LinkedList();
      this.anInt8086 = 0;
      this.aList8082 = new LinkedList();
      this.anInt8083 = 0;
   }

   void method7262(Class549 var1, Class174 var2) {
      this.aClass177_8084.aClass687_2068.method8062(224418990);
      Iterator var3 = this.aList8080.iterator();

      while(var3.hasNext()) {
         Class631 var4 = (Class631)var3.next();
         var4.method7484(var1, var2, this.aLong8078);
      }

   }

   public static Class614 method7263(int var0, boolean var1) {
      if(Class619.anInt8107 * 1316620805 != Class619.anInt8109 * 1668299831) {
         Class614 var2 = Class619.aClass614Array8117[Class619.anInt8109 * 1668299831];
         Class619.anInt8109 = (Class619.anInt8109 * 1668299831 + 1 & Class167.anIntArray1896[Class619.anInt8121 * 1865223851]) * 1557674375;
         var2.method7243(var0, var1);
         return var2;
      } else {
         return new Class614(var0, var1);
      }
   }

   void method7264() {
      this.aBool8079 = false;
   }

   void method7265() {
      this.aBool8079 = false;
   }

   public void method7266() {
      this.aBool8079 = true;
   }

   void method7267() {
      this.aBool8074 = true;
      Iterator var1 = this.aList8082.iterator();

      while(var1.hasNext()) {
         Class526_Sub30 var2 = (Class526_Sub30)var1.next();
         if(var2.aClass391_10569.anInt4078 * -1760706667 == 1) {
            var2.method6332(-1949449864);
         }
      }

      for(int var3 = 0; var3 < this.aClass539_Sub1_Sub1_Sub1Array8076.length; ++var3) {
         if(this.aClass539_Sub1_Sub1_Sub1Array8076[var3] != null) {
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3].method10923();
            this.aClass539_Sub1_Sub1_Sub1Array8076[var3] = null;
         }
      }

      this.anInt8075 = 0;
      this.aList8080 = new LinkedList();
      this.anInt8086 = 0;
      this.aList8082 = new LinkedList();
      this.anInt8083 = 0;
   }

   public void method7268(long var1) {
      this.aLong8087 = var1;
   }

   public void method7269(int var1, int var2, int var3, int var4, int var5) {
      this.anInt8077 = var1;
   }

   public void method7270() {
      this.aBool8079 = true;
   }
}
