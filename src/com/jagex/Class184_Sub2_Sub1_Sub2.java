package com.jagex;

import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class184_Sub2_Sub1;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.Interface50;
import com.jagex.Interface54;
import jagdx.Class367;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class184_Sub2_Sub1_Sub2 extends Class184_Sub2_Sub1 {
   static final int anInt12090 = 16;
   int anInt12091;
   Interface50 anInterface50_12093 = null;
   int anInt12089;
   int anInt12092;
   boolean aBool12087;
   Interface54[] anInterface54Array12094 = new Interface54[4];
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_12088;

   public void method8474(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7) {
         long var9 = IDirect3DDevice.GetRenderTarget(this.aClass174_Sub3_Sub1_12088.aLong11450, 0);
         IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_12088.aLong11450, this.anInterface54Array12094[0].method11(), var1, var2, var3, var4, var9, var5, var6, var3, var4, 0);
         IUnknown.Release(var9);
      }

   }

   public int method2693() {
      return this.anInt12089;
   }

   public void method8476(Interface23 var1) {
      Interface50 var2 = (Interface50)var1;
      if(var1 != null) {
         if(this.anInt12091 != 0) {
            if(this.anInt12092 != var2.method1() || this.anInt12089 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12089 = var2.method94();
            this.anInt12092 = var2.method1();
            this.method10445();
         }

         this.anInt12091 |= 16;
         this.anInterface50_12093 = var2;
         if(this.aBool12087) {
            this.method10913(var2.method11());
         }
      } else {
         this.anInt12091 &= -17;
         this.anInterface50_12093 = null;
         if(this.aBool12087) {
            this.method10913(0L);
         }

         if(this.anInt12091 == 0) {
            this.anInt12089 = 0;
            this.anInt12092 = 0;
         }
      }

   }

   public void method8465(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface54 var4 = (Interface54)var2;
      if(var2 != null) {
         if(this.anInt12091 != 0) {
            if(this.anInt12092 != var4.method1() || this.anInt12089 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12089 = var4.method94();
            this.anInt12092 = var4.method1();
            this.method10445();
         }

         this.anInt12091 |= var3;
         this.anInterface54Array12094[var1] = var4;
         if(this.aBool12087) {
            this.method10912(var1, var4.method11());
         }
      } else {
         this.anInt12091 &= ~var3;
         this.anInterface54Array12094[var1] = null;
         if(this.aBool12087) {
            this.method10912(var1, 0L);
         }

         if(this.anInt12091 == 0) {
            this.anInt12089 = 0;
            this.anInt12092 = 0;
         }
      }

   }

   boolean method10912(int var1, long var2) {
      return Class367.method4652(IDirect3DDevice.SetRenderTarget(this.aClass174_Sub3_Sub1_12088.aLong11450, var1, var2));
   }

   boolean method10913(long var1) {
      return Class367.method4652(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_12088.aLong11450, var1));
   }

   public boolean method8466() {
      return this.anInterface54Array12094[0] != null;
   }

   boolean method363() {
      for(int var1 = 0; var1 < 4; ++var1) {
         Interface54 var2 = this.anInterface54Array12094[var1];
         if(var2 != null) {
            long var3 = var2.method11();
            this.method10912(var1, var3);
         }
      }

      if(this.anInterface50_12093 != null) {
         this.method10913(this.anInterface50_12093.method11());
      }

      this.aBool12087 = true;
      return super.method363();
   }

   boolean method2694() {
      for(int var1 = 1; var1 < 4; ++var1) {
         Interface54 var2 = this.anInterface54Array12094[var1];
         if(var2 != null) {
            this.method10912(var1, 0L);
         }
      }

      if(this.anInterface50_12093 != null) {
         this.method10913(0L);
      }

      this.aBool12087 = false;
      return true;
   }

   public void method8470(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7) {
         long var9 = IDirect3DDevice.GetRenderTarget(this.aClass174_Sub3_Sub1_12088.aLong11450, 0);
         IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_12088.aLong11450, this.anInterface54Array12094[0].method11(), var1, var2, var3, var4, var9, var5, var6, var3, var4, 0);
         IUnknown.Release(var9);
      }

   }

   public void method140() {
      if(this.anInterface50_12093 != null) {
         this.anInterface50_12093.method140();
      }

      for(int var1 = 0; var1 < this.anInterface54Array12094.length; ++var1) {
         if(this.anInterface54Array12094[var1] != null) {
            this.anInterface54Array12094[var1].method140();
         }
      }

   }

   public int method2698() {
      return this.anInt12092;
   }

   public int method2702() {
      return this.anInt12089;
   }

   void method10914() {
      if(this.anInterface50_12093 != null) {
         this.anInterface50_12093.method356();
      }

      for(int var1 = 0; var1 < this.anInterface54Array12094.length; ++var1) {
         if(this.anInterface54Array12094[var1] != null) {
            this.anInterface54Array12094[var1].method356();
         }
      }

   }

   public int method2695() {
      return this.anInt12092;
   }

   public void method8477(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7) {
         long var9 = IDirect3DDevice.GetRenderTarget(this.aClass174_Sub3_Sub1_12088.aLong11450, 0);
         IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_12088.aLong11450, this.anInterface54Array12094[0].method11(), var1, var2, var3, var4, var9, var5, var6, var3, var4, 0);
         IUnknown.Release(var9);
      }

   }

   public void method8475(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7) {
         long var9 = IDirect3DDevice.GetRenderTarget(this.aClass174_Sub3_Sub1_12088.aLong11450, 0);
         IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_12088.aLong11450, this.anInterface54Array12094[0].method11(), var1, var2, var3, var4, var9, var5, var6, var3, var4, 0);
         IUnknown.Release(var9);
      }

   }

   public int method2699() {
      return this.anInt12092;
   }

   public void method8464(Interface23 var1) {
      Interface50 var2 = (Interface50)var1;
      if(var1 != null) {
         if(this.anInt12091 != 0) {
            if(this.anInt12092 != var2.method1() || this.anInt12089 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12089 = var2.method94();
            this.anInt12092 = var2.method1();
            this.method10445();
         }

         this.anInt12091 |= 16;
         this.anInterface50_12093 = var2;
         if(this.aBool12087) {
            this.method10913(var2.method11());
         }
      } else {
         this.anInt12091 &= -17;
         this.anInterface50_12093 = null;
         if(this.aBool12087) {
            this.method10913(0L);
         }

         if(this.anInt12091 == 0) {
            this.anInt12089 = 0;
            this.anInt12092 = 0;
         }
      }

   }

   public int method2701() {
      return this.anInt12089;
   }

   boolean method2696() {
      for(int var1 = 1; var1 < 4; ++var1) {
         Interface54 var2 = this.anInterface54Array12094[var1];
         if(var2 != null) {
            this.method10912(var1, 0L);
         }
      }

      if(this.anInterface50_12093 != null) {
         this.method10913(0L);
      }

      this.aBool12087 = false;
      return true;
   }

   public void method8468(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface54 var4 = (Interface54)var2;
      if(var2 != null) {
         if(this.anInt12091 != 0) {
            if(this.anInt12092 != var4.method1() || this.anInt12089 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12089 = var4.method94();
            this.anInt12092 = var4.method1();
            this.method10445();
         }

         this.anInt12091 |= var3;
         this.anInterface54Array12094[var1] = var4;
         if(this.aBool12087) {
            this.method10912(var1, var4.method11());
         }
      } else {
         this.anInt12091 &= ~var3;
         this.anInterface54Array12094[var1] = null;
         if(this.aBool12087) {
            this.method10912(var1, 0L);
         }

         if(this.anInt12091 == 0) {
            this.anInt12089 = 0;
            this.anInt12092 = 0;
         }
      }

   }

   public void method8471(Interface23 var1) {
      Interface50 var2 = (Interface50)var1;
      if(var1 != null) {
         if(this.anInt12091 != 0) {
            if(this.anInt12092 != var2.method1() || this.anInt12089 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12089 = var2.method94();
            this.anInt12092 = var2.method1();
            this.method10445();
         }

         this.anInt12091 |= 16;
         this.anInterface50_12093 = var2;
         if(this.aBool12087) {
            this.method10913(var2.method11());
         }
      } else {
         this.anInt12091 &= -17;
         this.anInterface50_12093 = null;
         if(this.aBool12087) {
            this.method10913(0L);
         }

         if(this.anInt12091 == 0) {
            this.anInt12089 = 0;
            this.anInt12092 = 0;
         }
      }

   }

   public int method2691() {
      return this.anInt12092;
   }

   public int method2697() {
      return this.anInt12092;
   }

   public int method2703() {
      return this.anInt12089;
   }

   public boolean method8473() {
      return this.anInterface54Array12094[0] != null;
   }

   public boolean method8467() {
      return this.anInterface54Array12094[0] != null;
   }

   boolean method364() {
      for(int var1 = 0; var1 < 4; ++var1) {
         Interface54 var2 = this.anInterface54Array12094[var1];
         if(var2 != null) {
            long var3 = var2.method11();
            this.method10912(var1, var3);
         }
      }

      if(this.anInterface50_12093 != null) {
         this.method10913(this.anInterface50_12093.method11());
      }

      this.aBool12087 = true;
      return super.method363();
   }

   boolean method2692() {
      for(int var1 = 1; var1 < 4; ++var1) {
         Interface54 var2 = this.anInterface54Array12094[var1];
         if(var2 != null) {
            this.method10912(var1, 0L);
         }
      }

      if(this.anInterface50_12093 != null) {
         this.method10913(0L);
      }

      this.aBool12087 = false;
      return true;
   }

   public boolean method8472() {
      return this.anInterface54Array12094[0] != null;
   }

   Class184_Sub2_Sub1_Sub2(Class174_Sub3_Sub1 var1) {
      super(var1);
      this.aClass174_Sub3_Sub1_12088 = var1;
   }

   boolean method2706() {
      for(int var1 = 1; var1 < 4; ++var1) {
         Interface54 var2 = this.anInterface54Array12094[var1];
         if(var2 != null) {
            this.method10912(var1, 0L);
         }
      }

      if(this.anInterface50_12093 != null) {
         this.method10913(0L);
      }

      this.aBool12087 = false;
      return true;
   }

   boolean method2705() {
      for(int var1 = 1; var1 < 4; ++var1) {
         Interface54 var2 = this.anInterface54Array12094[var1];
         if(var2 != null) {
            this.method10912(var1, 0L);
         }
      }

      if(this.anInterface50_12093 != null) {
         this.method10913(0L);
      }

      this.aBool12087 = false;
      return true;
   }

   void method10915() throws Throwable {
      this.method10914();
      super.finalize();
   }

   public void finalize() throws Throwable {
      this.method10914();
      super.finalize();
   }

   public int method2700() {
      return this.anInt12092;
   }

   public void method208() {
      if(this.anInterface50_12093 != null) {
         this.anInterface50_12093.method140();
      }

      for(int var1 = 0; var1 < this.anInterface54Array12094.length; ++var1) {
         if(this.anInterface54Array12094[var1] != null) {
            this.anInterface54Array12094[var1].method140();
         }
      }

   }

   void method10916() throws Throwable {
      this.method10914();
      super.finalize();
   }

   boolean method2704() {
      for(int var1 = 1; var1 < 4; ++var1) {
         Interface54 var2 = this.anInterface54Array12094[var1];
         if(var2 != null) {
            this.method10912(var1, 0L);
         }
      }

      if(this.anInterface50_12093 != null) {
         this.method10913(0L);
      }

      this.aBool12087 = false;
      return true;
   }

   public void method8469(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface54 var4 = (Interface54)var2;
      if(var2 != null) {
         if(this.anInt12091 != 0) {
            if(this.anInt12092 != var4.method1() || this.anInt12089 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12089 = var4.method94();
            this.anInt12092 = var4.method1();
            this.method10445();
         }

         this.anInt12091 |= var3;
         this.anInterface54Array12094[var1] = var4;
         if(this.aBool12087) {
            this.method10912(var1, var4.method11());
         }
      } else {
         this.anInt12091 &= ~var3;
         this.anInterface54Array12094[var1] = null;
         if(this.aBool12087) {
            this.method10912(var1, 0L);
         }

         if(this.anInt12091 == 0) {
            this.anInt12089 = 0;
            this.anInt12092 = 0;
         }
      }

   }

   void method10917() {
      if(this.anInterface50_12093 != null) {
         this.anInterface50_12093.method356();
      }

      for(int var1 = 0; var1 < this.anInterface54Array12094.length; ++var1) {
         if(this.anInterface54Array12094[var1] != null) {
            this.anInterface54Array12094[var1].method356();
         }
      }

   }

   void method10918() {
      if(this.anInterface50_12093 != null) {
         this.anInterface50_12093.method356();
      }

      for(int var1 = 0; var1 < this.anInterface54Array12094.length; ++var1) {
         if(this.anInterface54Array12094[var1] != null) {
            this.anInterface54Array12094[var1].method356();
         }
      }

   }
}
