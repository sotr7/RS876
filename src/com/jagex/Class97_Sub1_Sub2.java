package com.jagex;

import com.jagex.Class143_Sub2;
import com.jagex.Class192;
import com.jagex.Class452;
import com.jagex.Class466;
import com.jagex.RSByteBuffer;
import com.jagex.Class630;
import com.jagex.Class639_Sub1_Sub2_Sub2;
import com.jagex.Class64;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class97_Sub1;
import com.jagex.Interface12;
import com.jagex.Interface14;
import java.util.Iterator;

public class Class97_Sub1_Sub2 extends Class97_Sub1 implements Interface14 {
   Class192 aClass192_11334 = new Class192(64);
   Class466 aClass466_11333;

   public Interface12 method89(int var1, int var2) {
      Class192 var3 = this.aClass192_11334;
      synchronized(var3) {
         Class143_Sub2 var4 = (Class143_Sub2)this.aClass192_11334.method2765((long)var1);
         if(null == var4) {
            var4 = this.method10412(var1, 1270312011);
            this.aClass192_11334.method2768(var4, (long)var1);
         }

         return var4;
      }
   }

   public void method10404() {
      Class192 var1 = this.aClass192_11334;
      synchronized(var1) {
         this.aClass192_11334.method2772(1425405275);
      }
   }

   public void method10405(byte var1) {
      Class192 var2 = this.aClass192_11334;
      synchronized(var2) {
         this.aClass192_11334.method2770(1052774434);
      }
   }

   public void method10406(int var1, int var2) {
      Class192 var3 = this.aClass192_11334;
      synchronized(var3) {
         this.aClass192_11334.method2769(var1, (byte)-5);
      }
   }

   public void method10407(int var1) {
      Class192 var2 = this.aClass192_11334;
      synchronized(var2) {
         this.aClass192_11334.method2769(var1, (byte)-2);
      }
   }

   public Iterator iterator() {
      return new Class630(this);
   }

   public int method87(int var1) {
      return super.method87(2067560210);
   }

   public Interface12 method88(int var1) {
      Class192 var2 = this.aClass192_11334;
      synchronized(var2) {
         Class143_Sub2 var3 = (Class143_Sub2)this.aClass192_11334.method2765((long)var1);
         if(null == var3) {
            var3 = this.method10412(var1, 1270312011);
            this.aClass192_11334.method2768(var3, (long)var1);
         }

         return var3;
      }
   }

   public void method10408(int var1) {
      Class192 var2 = this.aClass192_11334;
      synchronized(var2) {
         this.aClass192_11334.method2769(var1, (byte)-117);
      }
   }

   public int method90() {
      return super.method87(-185501984);
   }

   public Interface12 method86(int var1) {
      Class192 var2 = this.aClass192_11334;
      synchronized(var2) {
         Class143_Sub2 var3 = (Class143_Sub2)this.aClass192_11334.method2765((long)var1);
         if(null == var3) {
            var3 = this.method10412(var1, 1270312011);
            this.aClass192_11334.method2768(var3, (long)var1);
         }

         return var3;
      }
   }

   public Iterator method10409() {
      return new Class630(this);
   }

   public void method10410(byte var1) {
      Class192 var2 = this.aClass192_11334;
      synchronized(var2) {
         this.aClass192_11334.method2772(1773885132);
      }
   }

   public Iterator method10411() {
      return new Class630(this);
   }

   Class143_Sub2 method10412(int var1, int var2) {
      byte[] var3 = this.aClass466_11333.method5536(this.aClass452_8927.method5360(-2072624703).anInt8409 * -1505451721, var1, (byte)46);
      Class143_Sub2 var4 = new Class143_Sub2(this.aClass452_8927, var1);
      if(null != var3) {
         var4.method82(new RSByteBuffer(var3), -595267770);
      }

      return var4;
   }

   public void method10413(int var1) {
      Class192 var2 = this.aClass192_11334;
      synchronized(var2) {
         this.aClass192_11334.method2769(var1, (byte)-1);
      }
   }

   public void method10414() {
      Class192 var1 = this.aClass192_11334;
      synchronized(var1) {
         this.aClass192_11334.method2772(977781485);
      }
   }

   public Class97_Sub1_Sub2(Class676 var1, Class452 var2, Class673 var3, Class466 var4) {
      super(var1, var2, var3, var4 != null?var4.method5544(var2.method5360(1118683484).anInt8409 * -1505451721, -1204173152):0);
      this.aClass466_11333 = var4;
   }

   static final void method10415(int var0, int var1, int var2, int var3) {
      String var4 = "tele " + var0 + Class64.aString738 + (var1 >> 6) + Class64.aString738 + (var2 >> 6) + Class64.aString738 + (var1 & 63) + Class64.aString738 + (var2 & 63);
      System.out.println(var4);
      Class639_Sub1_Sub2_Sub2.developerConsole(var4, true, false, (byte)-77);
   }
}
