package com.jagex;

import com.jagex.Class143_Sub1;
import com.jagex.Class192;
import com.jagex.Class241;
import com.jagex.Class452;
import com.jagex.Class466;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class97_Sub1;
import com.jagex.Interface12;
import com.jagex.Interface14;
import java.util.Iterator;

public class Class97_Sub1_Sub1 extends Class97_Sub1 implements Interface14 {
   public static Class466 aClass466_11324;
   Class192 aClass192_11322 = new Class192(64);
   Class466 aClass466_11323;

   public Class97_Sub1_Sub1(Class676 var1, Class452 var2, Class673 var3, Class466 var4) {
      super(var1, var2, var3, var4 != null?var4.method5544(var2.method5360(-93884711).anInt8409 * -1505451721, -200948463):0);
      this.aClass466_11323 = var4;
   }

   public Interface12 method89(int var1, int var2) {
      Class192 var3 = this.aClass192_11322;
      synchronized(var3) {
         Class143_Sub1 var4 = (Class143_Sub1)this.aClass192_11322.method2765((long)var1);
         if(var4 == null) {
            var4 = this.method10384(var1, (byte)-17);
            this.aClass192_11322.method2768(var4, (long)var1);
         }

         return var4;
      }
   }

   Class143_Sub1 method10384(int var1, byte var2) {
      byte[] var3 = this.aClass466_11323.method5536(this.aClass452_8927.method5360(-1149113192).anInt8409 * -1505451721, var1, (byte)4);
      
      
      if (var1 == 22406)
    	  throw new RuntimeException();
      
      Class143_Sub1 var4 = new Class143_Sub1(this.aClass452_8927, var1);
      if(var3 != null) {
         var4.method82(new RSByteBuffer(var3), -595267770);
      }

      return var4;
   }

   public void method10385(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         this.aClass192_11322.method2770(25682525);
      }
   }

   public void method10386(int var1, int var2) {
      Class192 var3 = this.aClass192_11322;
      synchronized(var3) {
         this.aClass192_11322.method2769(var1, (byte)-65);
      }
   }

   public void method10387(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         this.aClass192_11322.method2772(-2087171545);
      }
   }

   public Iterator iterator() {
      return new Class241(this);
   }

   public int method90() {
      return super.method87(-1314334353);
   }

   public Interface12 method88(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         Class143_Sub1 var3 = (Class143_Sub1)this.aClass192_11322.method2765((long)var1);
         if(var3 == null) {
            var3 = this.method10384(var1, (byte)-121);
            this.aClass192_11322.method2768(var3, (long)var1);
         }

         return var3;
      }
   }

   public Interface12 method86(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         Class143_Sub1 var3 = (Class143_Sub1)this.aClass192_11322.method2765((long)var1);
         if(var3 == null) {
            var3 = this.method10384(var1, (byte)16);
            this.aClass192_11322.method2768(var3, (long)var1);
         }

         return var3;
      }
   }

   public void method10388(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         this.aClass192_11322.method2769(var1, (byte)-85);
      }
   }

   public int method87(int var1) {
      return super.method87(912757857);
   }

   public void method10389() {
      Class192 var1 = this.aClass192_11322;
      synchronized(var1) {
         this.aClass192_11322.method2770(349042461);
      }
   }

   public void method10390() {
      Class192 var1 = this.aClass192_11322;
      synchronized(var1) {
         this.aClass192_11322.method2770(403320673);
      }
   }

   public void method10391(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         this.aClass192_11322.method2769(var1, (byte)-15);
      }
   }

   public void method10392(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         this.aClass192_11322.method2769(var1, (byte)-104);
      }
   }

   public void method10393() {
      Class192 var1 = this.aClass192_11322;
      synchronized(var1) {
         this.aClass192_11322.method2770(1184995165);
      }
   }

   public void method10394(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         this.aClass192_11322.method2769(var1, (byte)-92);
      }
   }

   public void method10395(int var1) {
      Class192 var2 = this.aClass192_11322;
      synchronized(var2) {
         this.aClass192_11322.method2769(var1, (byte)-16);
      }
   }

   public void method10396() {
      Class192 var1 = this.aClass192_11322;
      synchronized(var1) {
         this.aClass192_11322.method2772(-1654228998);
      }
   }

   public Iterator method10397() {
      return new Class241(this);
   }

   public Iterator method10398() {
      return new Class241(this);
   }

   static void writeButtonPacket(OutFrameBuffer buffer, int var1, int var2, int var3, int var4) {
      buffer.out.writeLEShort(var2, (byte)0);
      buffer.out.writeInt(var1, -357564953);
      buffer.out.writeLEShort128(var3, -14781458);
   }
}
