package com.jagex;

import com.jagex.Class103;
import com.jagex.Class258;
import com.jagex.Class292;
import com.jagex.Class293;
import com.jagex.Class295;
import com.jagex.Class309;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.RSByteBuffer;
import com.jagex.Buffer;
import com.jagex.Class642;
import com.jagex.Class689;
import com.jagex.Interface30;

public class Class689_Sub3 extends Class689 {
   Interface30 anInterface30_10950;
   boolean aBool10951;
   Class446 aClass446_10949 = new Class446();
   Class446 aClass446_10952 = new Class446(Float.NaN, Float.NaN, Float.NaN);
   Class446 aClass446_10953 = new Class446(Float.NaN, Float.NaN, Float.NaN);
   Class446 aClass446_10954 = new Class446();

   public void method10220(Interface30 var1, Class446 var2, boolean var3, int var4) {
      this.anInterface30_10950 = var1;
      this.aClass446_10949.method5267(var2);
      this.aBool10951 = var3;
      var1.method186(976428997);
   }

   public void method10221(int var1) {
      if(this.anInterface30_10950 != null) {
         this.anInterface30_10950 = this.aClass292_8691.method3912((byte)102).method225(this.anInterface30_10950.method197((byte)100), this.anInterface30_10950.method87(-297672924), (byte)126);
      }

   }

   public void method8071(float var1, byte var2) {
      if(this.anInterface30_10950 != null) {
         this.aClass446_10953.method5267(this.anInterface30_10950.method186(976428997).method9588(1428911754));
         this.aClass292_8691.method3889(false, var1, this.aClass446_10952, this.aClass292_8691.method3942(-1722582540), this.aClass446_10953, this.aClass446_10954, -332102464);
      }
   }

   public boolean method8081(short var1) {
      return !Float.isNaN(this.aClass446_10952.aFloat4917);
   }

   public void method8072(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      Class446 var6 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var6.aFloat4917 -= (float)var3;
      var6.aFloat4919 -= (float)var4;
      var6.aFloat4915 *= -1.0F;
      Class446 var7 = this.method8073(979950434);
      var7.aFloat4917 -= (float)var3;
      var7.aFloat4919 -= (float)var4;
      var7.aFloat4915 *= -1.0F;
      var2.method5217((double)var6.aFloat4917, (double)var6.aFloat4915, (double)var6.aFloat4919, (double)var7.aFloat4917, (double)var7.aFloat4915, (double)var7.aFloat4919, 0.0F, 1.0F, 0.0F);
      var6.method5278();
      var7.method5278();
   }

   public Class446 method8073(int var1) {
      Class446 var2 = Class446.method5305(this.aClass446_10952);
      Class446 var3 = Class446.method5305(this.aClass446_10949);
      if(this.aBool10951) {
         var3.method5286(this.anInterface30_10950.method198(-1845657656));
      }

      var2.method5272(var3);
      var3.method5278();
      return var2;
   }

   public void method8086(RSByteBuffer var1, int var2) {
      Class295 var3 = Class642.method7657(var1.readUnsignedByte(1254477912), (short)16773);
      int var4 = var1.readUnsignedShort(1787402289);
      this.anInterface30_10950 = this.aClass292_8691.method3912((byte)17).method225(var3, var4, (byte)49);
      this.aClass446_10949.method5306(var1);
      if(var1.readUnsignedByte(2068773264) == 1) {
         this.aBool10951 = true;
      } else {
         this.aBool10951 = false;
      }

   }

   public void method8076(float var1) {
      if(this.anInterface30_10950 != null) {
         this.aClass446_10953.method5267(this.anInterface30_10950.method186(976428997).method9588(1306128606));
         this.aClass292_8691.method3889(false, var1, this.aClass446_10952, this.aClass292_8691.method3942(1145758890), this.aClass446_10953, this.aClass446_10954, 1070571720);
      }
   }

   public void method8070(float var1) {
      if(this.anInterface30_10950 != null) {
         this.aClass446_10953.method5267(this.anInterface30_10950.method186(976428997).method9588(933617609));
         this.aClass292_8691.method3889(false, var1, this.aClass446_10952, this.aClass292_8691.method3942(1735314870), this.aClass446_10953, this.aClass446_10954, 574601476);
      }
   }

   public boolean method8078() {
      return !Float.isNaN(this.aClass446_10952.aFloat4917);
   }

   public boolean method8079() {
      return !Float.isNaN(this.aClass446_10952.aFloat4917);
   }

   public void method8083(Class309 var1, Class445 var2, int var3, int var4, float var5, int var6) {
      Class446 var7 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var7.aFloat4917 -= (float)var3;
      var7.aFloat4919 -= (float)var4;
      var7.aFloat4915 *= -1.0F;
      Class446 var8 = this.method8073(1647554243);
      var8.aFloat4917 -= (float)var3;
      var8.aFloat4919 -= (float)var4;
      var8.aFloat4915 *= -1.0F;
      var2.method5217((double)var7.aFloat4917, (double)var7.aFloat4915, (double)var7.aFloat4919, (double)var8.aFloat4917, (double)var8.aFloat4915, (double)var8.aFloat4919, 0.0F, 1.0F, 0.0F);
      var7.method5278();
      var8.method5278();
   }

   public Class689_Sub3(Class292 var1) {
      super(var1);
   }

   public Class446 method8082() {
      Class446 var1 = Class446.method5305(this.aClass446_10952);
      Class446 var2 = Class446.method5305(this.aClass446_10949);
      if(this.aBool10951) {
         var2.method5286(this.anInterface30_10950.method198(-2123703550));
      }

      var1.method5272(var2);
      var2.method5278();
      return var1;
   }

   public Class446 method8084() {
      Class446 var1 = Class446.method5305(this.aClass446_10952);
      Class446 var2 = Class446.method5305(this.aClass446_10949);
      if(this.aBool10951) {
         var2.method5286(this.anInterface30_10950.method198(1525047452));
      }

      var1.method5272(var2);
      var2.method5278();
      return var1;
   }

   public void method8074(RSByteBuffer var1) {
      Class295 var2 = Class642.method7657(var1.readUnsignedByte(-1861420766), (short)7280);
      int var3 = var1.readUnsignedShort(1984631857);
      this.anInterface30_10950 = this.aClass292_8691.method3912((byte)68).method225(var2, var3, (byte)107);
      this.aClass446_10949.method5306(var1);
      if(var1.readUnsignedByte(1545965875) == 1) {
         this.aBool10951 = true;
      } else {
         this.aBool10951 = false;
      }

   }

   public void method8085(RSByteBuffer var1) {
      Class295 var2 = Class642.method7657(var1.readUnsignedByte(-1128499517), (short)9488);
      int var3 = var1.readUnsignedShort(1917149198);
      this.anInterface30_10950 = this.aClass292_8691.method3912((byte)51).method225(var2, var3, (byte)99);
      this.aClass446_10949.method5306(var1);
      if(var1.readUnsignedByte(-1638879814) == 1) {
         this.aBool10951 = true;
      } else {
         this.aBool10951 = false;
      }

   }

   public Class446 method8087() {
      Class446 var1 = Class446.method5305(this.aClass446_10953);
      Class446 var2 = Class446.method5305(this.aClass446_10949);
      if(this.aBool10951) {
         var2.method5286(this.anInterface30_10950.method198(-684122547));
      }

      var1.method5272(var2);
      var2.method5278();
      return var1;
   }

   public Class446 method8088() {
      Class446 var1 = Class446.method5305(this.aClass446_10953);
      Class446 var2 = Class446.method5305(this.aClass446_10949);
      if(this.aBool10951) {
         var2.method5286(this.anInterface30_10950.method198(-33925293));
      }

      var1.method5272(var2);
      var2.method5278();
      return var1;
   }

   public Class446 method8075(int var1) {
      Class446 var2 = Class446.method5305(this.aClass446_10953);
      Class446 var3 = Class446.method5305(this.aClass446_10949);
      if(this.aBool10951) {
         var3.method5286(this.anInterface30_10950.method198(939103605));
      }

      var2.method5272(var3);
      var3.method5278();
      return var2;
   }

   public void method8080(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      Class446 var6 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var6.aFloat4917 -= (float)var3;
      var6.aFloat4919 -= (float)var4;
      var6.aFloat4915 *= -1.0F;
      Class446 var7 = this.method8073(2116093338);
      var7.aFloat4917 -= (float)var3;
      var7.aFloat4919 -= (float)var4;
      var7.aFloat4915 *= -1.0F;
      var2.method5217((double)var6.aFloat4917, (double)var6.aFloat4915, (double)var6.aFloat4919, (double)var7.aFloat4917, (double)var7.aFloat4915, (double)var7.aFloat4919, 0.0F, 1.0F, 0.0F);
      var6.method5278();
      var7.method5278();
   }

   public Class446 method8077() {
      Class446 var1 = Class446.method5305(this.aClass446_10952);
      Class446 var2 = Class446.method5305(this.aClass446_10949);
      if(this.aBool10951) {
         var2.method5286(this.anInterface30_10950.method198(-2097536815));
      }

      var1.method5272(var2);
      var2.method5278();
      return var1;
   }

   public Class446 method10222(int var1) {
      return this.aClass446_10952;
   }

   static final void method10223(Buffer var0, int var1, int var2) {
      Class103.anInt1275 = 0;
      Class258.method3513(var0, -1901199651);
      Class293.method3957(var0, -613447256);
      if(var0.pos * 301018015 != var1) {
         throw new RuntimeException(var0.pos * 301018015 + " " + var1);
      }
   }
}
