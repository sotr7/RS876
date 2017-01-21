package com.jagex;

import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class335;
import com.jagex.Class353;
import com.jagex.Class359;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;

public class Class335_Sub1 extends Class335 {
   long aLong10123 = 0L;
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_10124;

   Class335_Sub1(Class174_Sub3_Sub1 var1, Class359[] var2) {
      super(var2);
      this.aClass174_Sub3_Sub1_10124 = var1;
      byte var3 = 0;
      ByteBuffer var4 = this.aClass174_Sub3_Sub1_10124.aByteBuffer9684;
      var4.clear();

      for(short var5 = 0; var5 < this.aClass359Array3523.length; ++var5) {
         short var6 = 0;
         Class359 var7 = this.aClass359Array3523[var5];

         for(int var8 = 0; var8 < var7.method4587(); ++var8) {
            Class353 var9 = var7.method4588(var8);
            if(var9 == Class353.aClass353_3685) {
               this.method9147(var4, var5, var6, (byte)2, (byte)0, (byte)0, (byte)0);
            } else if(var9 == Class353.aClass353_3673) {
               this.method9147(var4, var5, var6, (byte)2, (byte)0, (byte)3, (byte)0);
            } else if(var9 == Class353.aClass353_3679) {
               this.method9147(var4, var5, var6, (byte)4, (byte)0, (byte)10, (byte)0);
            } else if(var9 == Class353.aClass353_3672) {
               this.method9147(var4, var5, var6, (byte)0, (byte)0, (byte)5, var3++);
            } else if(var9 == Class353.aClass353_3683) {
               this.method9147(var4, var5, var6, (byte)1, (byte)0, (byte)5, var3++);
            } else if(var9 == Class353.aClass353_3674) {
               this.method9147(var4, var5, var6, (byte)2, (byte)0, (byte)5, var3++);
            } else if(var9 == Class353.aClass353_3675) {
               this.method9147(var4, var5, var6, (byte)3, (byte)0, (byte)5, var3++);
            }

            var6 = (short)(var6 + var9.anInt3671);
         }
      }

      this.method9147(var4, (short)255, (short)0, (byte)17, (byte)0, (byte)0, (byte)0);
      this.aLong10123 = IDirect3DDevice.CreateVertexDeclaration(this.aClass174_Sub3_Sub1_10124.aLong11450, this.aClass174_Sub3_Sub1_10124.aLong9685);
      this.aClass174_Sub3_Sub1_10124.method8819(this);
   }

   void method9147(ByteBuffer var1, short var2, short var3, byte var4, byte var5, byte var6, byte var7) {
      var1.putShort(var2);
      var1.putShort(var3);
      var1.put(var4);
      var1.put(var5);
      var1.put(var6);
      var1.put(var7);
   }

   public void method140() {
      if(this.aLong10123 != 0L) {
         IUnknown.Release(this.aLong10123);
         this.aLong10123 = 0L;
      }

      this.aClass174_Sub3_Sub1_10124.method8716(this);
   }

   void method9148() {
      if(this.aLong10123 != 0L) {
         this.aClass174_Sub3_Sub1_10124.method10508(this.aLong10123);
         this.aLong10123 = 0L;
      }

   }

   public void finalize() {
      this.method9148();
   }

   public void method141() {
      if(this.aLong10123 != 0L) {
         IUnknown.Release(this.aLong10123);
         this.aLong10123 = 0L;
      }

      this.aClass174_Sub3_Sub1_10124.method8716(this);
   }

   void method9149() {
      this.method9148();
   }

   void method9150() {
      this.method9148();
   }

   void method9151() {
      if(this.aLong10123 != 0L) {
         this.aClass174_Sub3_Sub1_10124.method10508(this.aLong10123);
         this.aLong10123 = 0L;
      }

   }

   void method9152() {
      if(this.aLong10123 != 0L) {
         this.aClass174_Sub3_Sub1_10124.method10508(this.aLong10123);
         this.aLong10123 = 0L;
      }

   }

   void method9153() {
      if(this.aLong10123 != 0L) {
         this.aClass174_Sub3_Sub1_10124.method10508(this.aLong10123);
         this.aLong10123 = 0L;
      }

   }
}
