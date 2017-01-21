package com.jagex;

import com.jagex.Class144;
import com.jagex.Class157;
import com.jagex.Class166;
import com.jagex.Class169;
import com.jagex.Class174;
import com.jagex.Class174_Sub3;
import com.jagex.Class178;
import com.jagex.Class184_Sub1;
import com.jagex.Class184_Sub1_Sub2_Sub1;
import com.jagex.Class184_Sub2;
import com.jagex.Class184_Sub2_Sub1_Sub2;
import com.jagex.Class274;
import com.jagex.Class276_Sub1;
import com.jagex.Class284;
import com.jagex.Class284_Sub1;
import com.jagex.Class319;
import com.jagex.Class335;
import com.jagex.Class335_Sub1;
import com.jagex.Class341;
import com.jagex.Class359;
import com.jagex.Class363;
import com.jagex.Class370;
import com.jagex.Class372;
import com.jagex.Class374;
import com.jagex.Class406;
import com.jagex.Class410;
import com.jagex.Class410_Sub1;
import com.jagex.Class410_Sub1_Sub1;
import com.jagex.Class410_Sub2;
import com.jagex.Class410_Sub3;
import com.jagex.Class412;
import com.jagex.Class419;
import com.jagex.Class421;
import com.jagex.Class433;
import com.jagex.Class445;
import com.jagex.Class466;
import com.jagex.Class526_Sub16;
import com.jagex.LinkableObject;
import com.jagex.Class702;
import com.jagex.Exception_Sub4;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.Interface24;
import com.jagex.Interface35;
import com.jagex.Interface37;
import com.jagex.Interface38;
import com.jagex.Interface42;
import com.jagex.Interface43;
import com.jagex.Interface44;
import com.jagex.Interface46;
import com.jagex.Interface47;
import com.jagex.Interface49;
import com.jagex.Interface52;
import jagdx.Class282;
import jagdx.Class367;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.RuntimeException_Sub5;
import java.awt.Canvas;

public class Class174_Sub3_Sub1 extends Class174_Sub3 {
   boolean aBool11433;
   Class276_Sub1 aClass276_Sub1_11452;
   static final int anInt11469 = 3;
   long aLong11461 = 0L;
   long aLong11450 = 0L;
   Class702 aClass702_11439 = new Class702();
   boolean aBool11440 = false;
   long aLong11441 = 0L;
   long aLong11463 = 0L;
   long aLong11443 = 0L;
   boolean aBool11444 = false;
   float[] aFloatArray11465 = new float[16];
   int anInt11466 = 128;
   int anInt11467 = 0;
   long[] aLongArray11459;
   long aLong11470;
   long[] aLongArray11454;
   long[] aLongArray11472;
   int[] anIntArray11473;
   int anInt11474;
   int anInt11475;
   int anInt11436;
   int anInt11447;
   D3DDISPLAYMODE aD3DDISPLAYMODE11438;
   D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11437;
   D3DCAPS aD3DCAPS11468;
   boolean aBool11455;
   boolean aBool11442;
   boolean aBool11457;
   boolean aBool11456;
   boolean aBool11462;
   boolean aBool11460;
   boolean aBool11453;
   boolean aBool11435;
   boolean aBool11434;
   boolean[] aBoolArray11449;
   boolean[] aBoolArray11446;
   boolean[] aBoolArray11464;
   Class341[] aClass341Array11477;
   boolean[] aBoolArray11448;
   int[] anIntArray11445;
   Class433 aClass433_11451;
   long aLong11458;
   static int[] anIntArray11476 = new int[]{77, 80};
   static int[] anIntArray11471 = new int[]{22, 23};

   public boolean method8719() {
      return (this.aD3DCAPS11468.PixelShaderVersion & '\uffff') >= 257;
   }

   public boolean method8720(boolean var1) {
      return var1?this.aBool11435:this.aBool11435 && this.aBool11434;
   }

   static Class174 method10500(Canvas var0, Class169 var1, Interface24 var2, Interface47 var3, Interface49 var4, Interface46 var5, Class466 var6, Integer var7) {
      Class174_Sub3_Sub1 var8 = null;

      try {
         byte var9 = 0;
         byte var10 = 1;
         long var11 = IDirect3D.Direct3DCreate();
         D3DCAPS var13 = new D3DCAPS();
         IDirect3D.GetDeviceCaps(var11, var9, var10, var13);
         if((var13.RasterCaps & 16777216) == 0) {
            throw new RuntimeException("");
         } else if(var13.MaxSimultaneousTextures < 2) {
            throw new RuntimeException("");
         } else if((var13.TextureOpCaps & 2) == 0) {
            throw new RuntimeException("");
         } else if((var13.TextureOpCaps & 8) == 0) {
            throw new RuntimeException("");
         } else if((var13.TextureOpCaps & 64) == 0) {
            throw new RuntimeException("");
         } else if((var13.TextureOpCaps & 512) == 0) {
            throw new RuntimeException("");
         } else if((var13.TextureOpCaps & 33554432) == 0) {
            throw new RuntimeException("");
         } else if((var13.SrcBlendCaps & var13.DestBlendCaps & 16) == 0) {
            throw new RuntimeException("");
         } else if((var13.SrcBlendCaps & var13.DestBlendCaps & 32) == 0) {
            throw new RuntimeException("");
         } else if((var13.SrcBlendCaps & var13.DestBlendCaps & 2) == 0) {
            throw new RuntimeException("");
         } else if(var13.MaxActiveLights > 0 && var13.MaxActiveLights < 2) {
            throw new RuntimeException("");
         } else if(var13.MaxStreams < 5) {
            throw new RuntimeException("");
         } else {
            D3DPRESENT_PARAMETERS var14 = new D3DPRESENT_PARAMETERS(var0);
            var14.Windowed = true;
            var14.EnableAutoDepthStencil = true;
            var14.BackBufferWidth = var0.getWidth();
            var14.BackBufferHeight = var0.getHeight();
            var14.BackBufferCount = 1;
            var14.PresentationInterval = Integer.MIN_VALUE;
            D3DDISPLAYMODE var15 = new D3DDISPLAYMODE();
            if(!method10516(var9, var10, var11, var7.intValue(), var15, var14)) {
               throw new RuntimeException("");
            } else {
               int var16 = 0;
               if((var13.DevCaps & 1048576) != 0) {
                  var16 |= 16;
               }

               long var17 = 0L;

               try {
                  var17 = IDirect3D.CreateDeviceContext(var11, var9, var10, var0, var16 | 64, var14);
               } catch (RuntimeException_Sub5 var20) {
                  var17 = IDirect3D.CreateDeviceContext(var11, var9, var10, var0, var16 & -1048577 | 32, var14);
               }

               var8 = new Class174_Sub3_Sub1(var9, var10, var11, var17, var15, var14, var13, var1, var2, var3, var4, var5, var6, var7.intValue());
               if(!var8.aHashtable2052.containsKey(var0)) {
                  Class319.method4128(var0, 31458020);
                  var8.method2250(var0, new Class184_Sub1_Sub2_Sub1(var8, var0, var0.getWidth(), var0.getHeight(), true), -312337736);
               }

               var8.method2252(var0, (byte)83);
               var8.method8728();
               return var8;
            }
         }
      } catch (RuntimeException var21) {
         if(var8 != null) {
            var8.method2233();
         }

         throw var21;
      }
   }

   Class174_Sub3_Sub1(int var1, int var2, long var3, long var5, D3DDISPLAYMODE var7, D3DPRESENT_PARAMETERS var8, D3DCAPS var9, Class169 var10, Interface24 var11, Interface47 var12, Interface49 var13, Interface46 var14, Class466 var15, int var16) {
      super(var10, var11, var12, var13, var14, var15, var16, 0);
      this.aLongArray11459 = new long[this.anInt11466];
      this.aLong11470 = 0L;
      this.aLongArray11454 = new long[3];
      this.aLongArray11472 = new long[3];
      this.anIntArray11473 = new int[3];
      this.anInt11474 = 0;
      this.anInt11475 = 0;

      try {
         this.anInt11436 = var1;
         this.anInt11447 = var2;
         this.aLong11461 = var3;
         this.aLong11450 = var5;
         this.aD3DDISPLAYMODE11438 = var7;
         this.aD3DPRESENT_PARAMETERS11437 = var8;
         this.aD3DCAPS11468 = var9;
         this.aLong11441 = D3DLIGHT.Create();
         this.aLong11463 = D3DLIGHT.Create();
         this.aLong11443 = D3DLIGHT.Create();
         this.anInt9683 = this.aD3DCAPS11468.MaxSimultaneousTextures;
         this.anInt9719 = this.aD3DCAPS11468.MaxActiveLights > 0?this.aD3DCAPS11468.MaxActiveLights:8;
         this.aBool11455 = (this.aD3DCAPS11468.TextureCaps & 2) == 0;
         this.aBool9831 = (this.aD3DCAPS11468.TextureCaps & 2048) != 0;
         this.aBool9832 = (this.aD3DCAPS11468.TextureCaps & 8192) != 0;
         this.aBool11442 = (this.aD3DCAPS11468.TextureCaps & '\u8000') != 0;
         this.aBool11457 = (this.aD3DCAPS11468.TextureCaps & 65536) != 0;
         this.aBool11456 = (this.aD3DCAPS11468.TextureCaps & 16384) != 0;
         this.aBool9827 = this.aD3DCAPS11468.NumSimultaneousRTs > 0;
         this.aBool9724 = this.aBool9827;
         this.aBool9794 = this.aD3DCAPS11468.NumSimultaneousRTs > 0;
         this.aBool9830 = this.anInt9819 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong11461, this.anInt11436, this.anInt11447, this.aD3DPRESENT_PARAMETERS11437.BackBufferFormat, true, 2) == 0;
         this.aBool9829 = this.aD3DCAPS11468.NumSimultaneousRTs > 0 && this.anInt9819 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong11461, this.anInt11436, this.anInt11447, 113, true, 2) == 0;
         this.aBool11462 = IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, this.aD3DPRESENT_PARAMETERS11437.BackBufferFormat, 0, 1, method8750('\u0041', '\u0054', '\u004f', '\u0043')) == 0;
         this.aBool11460 = IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, this.aD3DPRESENT_PARAMETERS11437.BackBufferFormat, 0, 1, method8750('\u0041', '\u0032', '\u004d', '\u0031')) == 0;
         this.aBool11453 = IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, this.aD3DPRESENT_PARAMETERS11437.BackBufferFormat, 0, 1, method8750('\u0053', '\u0053', '\u0041', '\u0041')) == 0;
         this.aBool9834 = (this.aD3DCAPS11468.PrimitiveMiscCaps & 131072) != 0;
         this.aBool11435 = IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, this.aD3DDISPLAYMODE11438.Format, 524288, 3, 113) == 0;
         this.aBool11434 = IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, this.aD3DDISPLAYMODE11438.Format, 524288, 3, 116) == 0;
         this.aBoolArray11449 = new boolean[this.anInt9683];
         this.aBoolArray11446 = new boolean[this.anInt9683];
         this.aBoolArray11464 = new boolean[this.anInt9683];
         this.aClass341Array11477 = new Class341[this.anInt9683];
         this.aBoolArray11448 = new boolean[this.anInt9683];
         this.anIntArray11445 = new int[this.anInt9683];
         Class445 var17 = new Class445();
         var17.method5256(1.0F, -1.0F, 0.5F);
         var17.method5251(0.0F, 0.0F, 0.5F);
         this.aClass433_11451 = new Class433();
         this.aClass433_11451.method5110(var17);
         IDirect3DDevice.BeginScene(this.aLong11450);
      } catch (Throwable var18) {
         var18.printStackTrace();
         this.method2232(1135751733);
         throw new RuntimeException("");
      }
   }

   void method8732() {
      for(LinkableObject var1 = (LinkableObject)this.aClass702_11439.method8206((byte)98); var1 != null; var1 = (LinkableObject)this.aClass702_11439.method8181(25107011)) {
         Interface52 var2 = (Interface52)var1.anObject10399;
         var2.method365();
         if(var2 == this.aClass184_2049) {
            var2.method363();
         }
      }

      super.method8732();
   }

   void method10501(int var1, int var2) {
      this.method2273();
      this.method2272(var1, var2, (short)-3763);
      this.aLong11470 = IDirect3DDevice.CreateRenderTarget(this.aLong11450, var1, var2, method10502(Class144.aClass144_1680, Class166.aClass166_1884), 0, 0, false);

      for(int var3 = 0; var3 < 3; ++var3) {
         this.aLongArray11472[var3] = IDirect3DDevice.CreateOffscreenPlainSurface(this.aLong11450, var1, var2, method10502(Class144.aClass144_1680, Class166.aClass166_1884), 2);
      }

      this.method8722(var1 * var2 * 4);
   }

   static final int method10502(Class144 var0, Class166 var1) {
      switch(var1.anInt1887 * 1222994579) {
      case 0:
         if(var0 == Class144.aClass144_1680) {
            return 116;
         }
         break;
      case 1:
         if(var0 == Class144.aClass144_1680) {
            return 113;
         }
         break;
      case 6:
         switch(var0.anInt1688 * 357285953) {
         case 1:
            return Class282.anInt3061 * -836343957;
         case 2:
            return 21;
         case 3:
            return 28;
         case 4:
         default:
            break;
         case 5:
            return 22;
         case 6:
            return 51;
         case 7:
            return 77;
         case 8:
            return Class282.anInt3062 * 1525056119;
         case 9:
            return 50;
         }
      }

      throw new IllegalArgumentException("");
   }

   public Class157 method2502() {
      D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
      IDirect3D.GetAdapterIdentifier(this.aLong11461, this.anInt11436, 0, var1);
      return new Class157(var1.VendorID, this.method8721()?"Direct3D FF":"Direct3D", 9, var1.Description, var1.DriverVersion, this.method8721());
   }

   void method2230(int var1, int var2) throws Exception_Sub4 {
      if(this.aBool11440) {
         if(!this.method10503(this.aClass184_Sub1_2026.method2691(), this.aClass184_Sub1_2026.method2693())) {
            return;
         }

         ((Class184_Sub1_Sub2_Sub1)this.aClass184_Sub1_2026).method365();
      } else {
         IDirect3DDevice.EndScene(this.aLong11450);
      }

      int var3 = this.aClass184_Sub1_2026.method8451();
      if(Class367.method4651(var3)) {
         this.aBool11440 = true;
         this.aClass184_Sub1_2026.method140();
      } else {
         IDirect3DDevice.BeginScene(this.aLong11450);
         if(this.anInterface24_2034 != null) {
            this.anInterface24_2034.method150((byte)1);
         }

      }
   }

   public void method2327() {
      long var1 = IDirect3DDevice.CreateEventQuery(this.aLong11450);
      if(Class367.method4652(IDirect3DEventQuery.Issue(var1))) {
         while(true) {
            int var3 = IDirect3DEventQuery.IsSignaled(var1);
            if(var3 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      IUnknown.Release(var1);
   }

   public Class284 method8874(String var1) {
      byte[] var2 = this.method10521(var1);
      if(var2 == null) {
         return null;
      } else {
         Class274 var3 = this.method8726(var2);
         return new Class284_Sub1(this, var3);
      }
   }

   void method8956() {
      if(this.aBool9761) {
         int var1 = this.aBoolArray11464[this.anInt9787]?method10512(this.aClass372Array9776[this.anInt9787]):1;
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 4, var1);
      }

   }

   public String method2602() {
      String var1 = "Caps: 4:";
      String var2 = ":";
      var1 = var1 + this.anInt9819 + var2;
      var1 = var1 + this.anInt9683 + var2;
      var1 = var1 + this.anInt9719 + var2;
      var1 = var1 + (this.aBool9830?1:0) + var2;
      var1 = var1 + (this.method8898()?1:0) + var2;
      var1 = var1 + (this.method8719()?1:0) + var2;
      var1 = var1 + (this.aBool9832?1:0) + var2;
      var1 = var1 + (this.aBool9831?1:0) + var2;
      var1 = var1 + (this.aBool11455?1:0) + var2;
      var1 = var1 + (this.aBool11442?1:0) + var2;
      var1 = var1 + (this.aBool11457?1:0) + var2;
      var1 = var1 + (this.aBool11456?1:0) + var2;
      var1 = var1 + (this.aBool9827?1:0) + var2;
      var1 = var1 + (this.aBool9794?1:0) + var2;
      var1 = var1 + (this.aBool9829?1:0) + var2;
      var1 = var1 + (this.aBool11462?1:0) + var2;
      var1 = var1 + (this.aBool11460?1:0) + var2;
      var1 = var1 + (this.aBool11453?1:0) + var2;
      var1 = var1 + (this.aBool9834?1:0) + var2;
      var1 = var1 + (this.aBool11435?1:0) + var2;
      var1 = var1 + (this.aBool11434?1:0);
      return var1;
   }

   public boolean method2410() {
      return true;
   }

   boolean method10503(int var1, int var2) {
      int var3 = IDirect3DDevice.TestCooperativeLevel(this.aLong11450);
      if(var3 == 0 || var3 == -2005530519) {
         IDirect3DDevice.SetDepthStencilSurface(this.aLong11450, 0L);

         int var4;
         for(var4 = 1; var4 < 4; ++var4) {
            IDirect3DDevice.SetRenderTarget(this.aLong11450, var4, 0L);
         }

         for(var4 = 0; var4 < 4; ++var4) {
            IDirect3DDevice.SetStreamSource(this.aLong11450, var4, 0L, 0, 0);
         }

         for(var4 = 0; var4 < 4; ++var4) {
            IDirect3DDevice.SetTexture(this.aLong11450, var4, 0L);
         }

         IDirect3DDevice.SetIndices(this.aLong11450, 0L);
         this.method8731();
         this.aD3DPRESENT_PARAMETERS11437.BackBufferWidth = var1;
         this.aD3DPRESENT_PARAMETERS11437.BackBufferHeight = var2;
         this.aD3DPRESENT_PARAMETERS11437.BackBufferCount = 1;
         if(method10516(this.anInt11436, this.anInt11447, this.aLong11461, this.anInt9819, this.aD3DDISPLAYMODE11438, this.aD3DPRESENT_PARAMETERS11437)) {
            var4 = IDirect3DDevice.Reset(this.aLong11450, this.aD3DPRESENT_PARAMETERS11437);
            if(Class367.method4652(var4)) {
               this.aBool11440 = false;
               this.method8732();
               this.method8729();
               return true;
            }
         }
      }

      return false;
   }

   public Interface23 method2263(int var1, int var2) {
      return new Class406(this, Class166.aClass166_1889, var1, var2, 0);
   }

   public Interface23 method2259(int var1, int var2, int var3) {
      return new Class406(this, Class166.aClass166_1889, var1, var2, var3);
   }

   boolean method8924(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 3, method10502(var1, var2)));
   }

   void method10504(Interface52 var1) {
      if(this.method10520(var1) == null) {
         this.aClass702_11439.method8176(new LinkableObject(var1), -1873059547);
      }

   }

   void method8773(int var1) {
      if(!this.aBool11433) {
         int var2 = (var1 & 2) != 0?2:3;
         IDirect3DDevice.SetRenderState(this.aLong11450, 8, var2);
      }

   }

   public int[] method2479(int var1, int var2, int var3, int var4) {
      this.method2312();
      int[] var5 = null;
      long var6 = IDirect3DDevice.GetRenderTarget(this.aLong11450, 0);
      long var8 = IDirect3DDevice.CreateRenderTarget(this.aLong11450, var3, var4, 21, 0, 0, true);
      int var10 = IDirect3DDevice.StretchRect(this.aLong11450, var6, var1, var2, var3, var4, var8, 0, 0, var3, var4, 1);
      this.method8722(var3 * var4 * 4);
      if(Class367.method4652(var10)) {
         var5 = new int[var3 * var4];
         IDirect3DSurface.Download(var8, 0, 0, var3, var4, var3 * 4, 16, this.aLong9685);
         this.aByteBuffer9684.clear();
         this.aByteBuffer9684.asIntBuffer().get(var5);
      }

      IUnknown.Release(var6);
      IUnknown.Release(var8);
      return var5;
   }

   public void method2359(boolean var1) {
   }

   public void method2325() {
      long var1 = IDirect3DDevice.CreateEventQuery(this.aLong11450);
      if(Class367.method4652(IDirect3DEventQuery.Issue(var1))) {
         while(true) {
            int var3 = IDirect3DEventQuery.IsSignaled(var1);
            if(var3 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      IUnknown.Release(var1);
   }

   Class184_Sub1 method2606(Canvas var1, int var2, int var3) {
      return new Class184_Sub1_Sub2_Sub1(this, var1, var2, var3, false);
   }

   public boolean method2299() {
      return this.aBool11440?false:this.aLongArray11454[this.anInt11475] == 0L;
   }

   public void method8860() {
      if(this.aBoolArray11464[this.anInt9787]) {
         this.aBoolArray11464[this.anInt9787] = false;
         IDirect3DDevice.SetTexture(this.aLong11450, this.anInt9787, 0L);
         this.method8804();
         this.method8803();
      }

   }

   public boolean method2265() {
      return false;
   }

   public void method2268(int var1, int var2, int var3) {
      if(this.aLong11470 == 0L) {
         this.method10501(var2, var3);
      }

      long var4 = IDirect3DDevice.GetRenderTarget(this.aLong11450, 0);
      if(Class367.method4651(IDirect3DDevice.StretchRect(this.aLong11450, var4, 0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), this.aLong11470, this.anInt2055 * 1228368769, this.anInt2039 * 1714687685, this.anInt2033 * -1550496547, this.anInt2058 * 568592699, 2))) {
         ;
      }

      IUnknown.Release(var4);
      IDirect3DDevice.GetRenderTargetData(this.aLong11450, this.aLong11470, this.aLongArray11472[this.anInt11475]);
      long var6 = IDirect3DDevice.CreateEventQuery(this.aLong11450);
      if(Class367.method4652(IDirect3DEventQuery.Issue(var6))) {
         this.aLongArray11454[this.anInt11475] = var6;
      }

      this.anIntArray11473[this.anInt11475] = var1;
      if(++this.anInt11475 >= 3) {
         this.anInt11475 = 0;
      }

   }

   public int method2352() {
      return this.aLongArray11454[this.anInt11474] == 0L?-1:(Class367.method4652(IDirect3DEventQuery.IsSignaled(this.aLongArray11454[this.anInt11474]))?this.anIntArray11473[this.anInt11474]:-1);
   }

   Interface38 method8883(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6);
   }

   public long method2269(int var1, int var2) {
      return this.method10505(var1, var2, (int[])null, (int[])null);
   }

   public String method2389() {
      String var1 = "Caps: 4:";
      String var2 = ":";
      var1 = var1 + this.anInt9819 + var2;
      var1 = var1 + this.anInt9683 + var2;
      var1 = var1 + this.anInt9719 + var2;
      var1 = var1 + (this.aBool9830?1:0) + var2;
      var1 = var1 + (this.method8898()?1:0) + var2;
      var1 = var1 + (this.method8719()?1:0) + var2;
      var1 = var1 + (this.aBool9832?1:0) + var2;
      var1 = var1 + (this.aBool9831?1:0) + var2;
      var1 = var1 + (this.aBool11455?1:0) + var2;
      var1 = var1 + (this.aBool11442?1:0) + var2;
      var1 = var1 + (this.aBool11457?1:0) + var2;
      var1 = var1 + (this.aBool11456?1:0) + var2;
      var1 = var1 + (this.aBool9827?1:0) + var2;
      var1 = var1 + (this.aBool9794?1:0) + var2;
      var1 = var1 + (this.aBool9829?1:0) + var2;
      var1 = var1 + (this.aBool11462?1:0) + var2;
      var1 = var1 + (this.aBool11460?1:0) + var2;
      var1 = var1 + (this.aBool11453?1:0) + var2;
      var1 = var1 + (this.aBool9834?1:0) + var2;
      var1 = var1 + (this.aBool11435?1:0) + var2;
      var1 = var1 + (this.aBool11434?1:0);
      return var1;
   }

   long method10505(int var1, int var2, int[] var3, int[] var4) {
      if(this.aLongArray11454[this.anInt11474] != 0L) {
         IUnknown.Release(this.aLongArray11454[this.anInt11474]);
         this.aLongArray11454[this.anInt11474] = 0L;
      }

      this.aByteBuffer9684.clear();
      IDirect3DSurface.Download(this.aLongArray11472[this.anInt11474], 0, 0, var1, var2, var1 * 4, 0, this.aLong9685);
      if(++this.anInt11474 >= 3) {
         this.anInt11474 = 0;
      }

      if(var3 != null) {
         this.aByteBuffer9684.asIntBuffer().get(var3);
         return 0L;
      } else {
         return this.aLong9685;
      }
   }

   void method8958() {
      IDirect3DDevice.method9229(this.aLong11450, 27, this.aBool9778);
   }

   public void method2273() {
      if(this.aLong11470 != 0L) {
         IUnknown.Release(this.aLong11470);
         this.aLong11470 = 0L;
      }

      for(int var1 = 0; var1 < 3; ++var1) {
         if(this.aLongArray11454[var1] != 0L) {
            IUnknown.Release(this.aLongArray11454[var1]);
            this.aLongArray11454[var1] = 0L;
         }

         if(this.aLongArray11472[var1] != 0L) {
            IUnknown.Release(this.aLongArray11472[var1]);
            this.aLongArray11472[var1] = 0L;
         }
      }

      this.anInt11475 = 0;
      this.anInt11474 = 0;
   }

   public Class178 method2338(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   void method8753() {
      if(this.aClass184_2049 != null) {
         IDirect3DDevice.SetViewport(this.aLong11450, this.anInt9698 + this.anInt9740, this.anInt9745 + this.anInt9738, this.anInt9742, this.anInt9743, this.aFloat9726, this.aFloat9727);
      }

   }

   void method8754() {
      IDirect3DDevice.SetScissorRect(this.aLong11450, this.anInt9698 + this.anInt9682, this.anInt9745 + this.anInt9732, this.anInt9735, this.anInt9789);
   }

   void method8914() {
      if(this.aBool9761) {
         D3DLIGHT.SetAmbient(this.aLong11441, this.aFloat9708 * this.aFloat9669, this.aFloat9771 * this.aFloat9669, this.aFloat9760 * this.aFloat9669, 0.0F);
         this.aBool11444 = false;
      }

   }

   final void method10506(long var1) {
      this.aLong11458 = var1;
      IDirect3DDevice.SetVertexShader(this.aLong11450, var1);
   }

   final void method10507(long var1) {
      IDirect3DDevice.SetPixelShader(this.aLong11450, var1);
   }

   public void method8727(Class433 var1, Class433 var2, Class433 var3) {
      IDirect3DDevice.SetTransform(this.aLong11450, 256, var1.aFloatArray4841);
      IDirect3DDevice.SetTransform(this.aLong11450, 2, var2.aFloatArray4841);
      IDirect3DDevice.SetTransform(this.aLong11450, 3, var3.aFloatArray4841);
   }

   void method8770() {
      IDirect3DDevice.method9229(this.aLong11450, 7, this.aBool9748 && this.aBool9749);
   }

   void method8771() {
      IDirect3DDevice.method9229(this.aLong11450, 14, this.aBool9808 && this.aBool9784);
   }

   void method8775() {
      if(this.aBool9761) {
         IDirect3DDevice.method9229(this.aLong11450, 137, this.aBool9744 && !this.aBool9768);
      }

   }

   void method8776() {
      if(this.aBool9761) {
         D3DLIGHT.SetAmbient(this.aLong11441, this.aFloat9708 * this.aFloat9669, this.aFloat9771 * this.aFloat9669, this.aFloat9760 * this.aFloat9669, 0.0F);
         this.aBool11444 = false;
      }

   }

   void method8917() {
      if(this.aBool9761) {
         float var1 = this.aBool9751?this.aFloat9823:0.0F;
         float var2 = this.aBool9751?-this.aFloat9763:0.0F;
         D3DLIGHT.SetDiffuse(this.aLong11441, var1 * this.aFloat9708, var1 * this.aFloat9771, var1 * this.aFloat9760, 0.0F);
         D3DLIGHT.SetDiffuse(this.aLong11463, var2 * this.aFloat9708, var2 * this.aFloat9771, var2 * this.aFloat9760, 0.0F);
         this.aBool11444 = false;
      }

   }

   void method8787() {
      IDirect3DDevice.SetScissorRect(this.aLong11450, this.anInt9698 + this.anInt9682, this.anInt9745 + this.anInt9732, this.anInt9735, this.anInt9789);
   }

   void method8838() {
      this.method8738();
      this.method8779();
   }

   public void method8940() {
      if(this.aBoolArray11464[this.anInt9787]) {
         this.aBoolArray11464[this.anInt9787] = false;
         IDirect3DDevice.SetTexture(this.aLong11450, this.anInt9787, 0L);
         this.method8804();
         this.method8803();
      }

   }

   void method8781() {
      int var1;
      for(var1 = 0; var1 < this.anInt9766; ++var1) {
         Class526_Sub16 var2 = this.aClass526_Sub16Array9764[var1];
         int var3 = var1 + 2;
         int var4 = var2.method9394(947806951);
         float var5 = var2.method9419(1613563498) / 255.0F;
         D3DLIGHT.SetPosition(this.aLong11443, (float)var2.method9390((byte)-62), (float)var2.method9391(-1509161227), (float)var2.method9392((byte)-49));
         D3DLIGHT.SetDiffuse(this.aLong11443, (float)(var4 >> 16 & 255) * var5, (float)(var4 >> 8 & 255) * var5, (float)(var4 & 255) * var5, 0.0F);
         D3DLIGHT.SetAttenuation(this.aLong11443, 0.0F, 0.0F, 1.0F / (float)(var2.method9422((short)8192) * var2.method9422((short)8192)));
         D3DLIGHT.SetRange(this.aLong11443, (float)var2.method9422((short)8192));
         IDirect3DDevice.SetLight(this.aLong11450, var3, this.aLong11443);
         IDirect3DDevice.LightEnable(this.aLong11450, var3, true);
      }

      while(var1 < this.anInt9765) {
         IDirect3DDevice.LightEnable(this.aLong11450, var1 + 2, false);
         ++var1;
      }

   }

   boolean method8744(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 3, method10502(var1, var2)));
   }

   synchronized void method10508(long var1) {
      if(this.anInt11467 == this.anInt11466) {
         this.anInt11466 *= 2;
         long[] var3 = new long[this.anInt11466];
         System.arraycopy(this.aLongArray11459, 0, var3, 0, this.anInt11467);
         this.aLongArray11459 = var3;
      }

      this.aLongArray11459[this.anInt11467] = var1;
      ++this.anInt11467;
   }

   void method8855() {
      IDirect3DDevice.method9229(this.aLong11450, 7, this.aBool9748 && this.aBool9749);
   }

   Interface38 method8801(Class144 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6, var7);
   }

   Interface38 method8856(Class144 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6, var7);
   }

   public boolean method8863() {
      return (this.aD3DCAPS11468.PixelShaderVersion & '\uffff') >= 257;
   }

   public Class184_Sub2 method2566() {
      return new Class184_Sub2_Sub1_Sub2(this);
   }

   Interface37 method8953(Class144 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new Class410_Sub2(this, var1, var2, var3, var4, var5, var6);
   }

   final void method10509(Class410 var1) {
      IDirect3DDevice.SetTexture(this.aLong11450, this.anInt9787, var1.method4899());
      if(this.aBool9761 && !this.aBoolArray11464[this.anInt9787]) {
         this.aBoolArray11464[this.anInt9787] = true;
         this.method8804();
         this.method8803();
      }

   }

   final void method10510(Class410_Sub1 var1) {
      this.method10509(var1);
      if(this.aBoolArray11449[this.anInt9787] != var1.aBool10153) {
         IDirect3DDevice.SetSamplerState(this.aLong11450, this.anInt9787, 1, var1.aBool10153?1:3);
         this.aBoolArray11449[this.anInt9787] = var1.aBool10153;
      }

      if(this.aBoolArray11446[this.anInt9787] != var1.aBool10157) {
         IDirect3DDevice.SetSamplerState(this.aLong11450, this.anInt9787, 2, var1.aBool10157?1:3);
         this.aBoolArray11446[this.anInt9787] = var1.aBool10157;
      }

   }

   final void method10511(Class410_Sub2 var1) {
      this.method10509(var1);
      if(!this.aBoolArray11449[this.anInt9787]) {
         IDirect3DDevice.SetSamplerState(this.aLong11450, this.anInt9787, 1, 1);
         this.aBoolArray11449[this.anInt9787] = true;
      }

      if(!this.aBoolArray11446[this.anInt9787]) {
         IDirect3DDevice.SetSamplerState(this.aLong11450, this.anInt9787, 2, 1);
         this.aBoolArray11446[this.anInt9787] = true;
      }

   }

   Interface43 method8936(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class410_Sub1_Sub1(this, var1, var2, var3, var4);
   }

   void method8802() {
      if(this.aLong11458 == 0L && this.aClass363Array9774[this.anInt9787] != Class363.aClass363_3844) {
         if(this.aClass363Array9774[this.anInt9787] == Class363.aClass363_3840) {
            IDirect3DDevice.SetTransform(this.aLong11450, 16 + this.anInt9787, this.aClass433Array9773[this.anInt9787].method5113(this.aFloatArray11465));
         } else {
            IDirect3DDevice.SetTransform(this.aLong11450, 16 + this.anInt9787, this.aClass433Array9773[this.anInt9787].method5107(this.aFloatArray11465));
         }

         int var1 = method10513(this.aClass363Array9774[this.anInt9787]);
         if(var1 != this.anIntArray11445[this.anInt9787]) {
            IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 24, var1);
            this.anIntArray11445[this.anInt9787] = var1;
         }
      } else {
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 24, 0);
         this.anIntArray11445[this.anInt9787] = 0;
      }

   }

   void method8837() {
   }

   void method8803() {
      if(this.aBool9761) {
         int var1 = this.aBoolArray11464[this.anInt9787]?method10512(this.aClass372Array9835[this.anInt9787]):1;
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 1, var1);
      }

   }

   public void method8833(Class335 var1) {
      Class335_Sub1 var2 = (Class335_Sub1)var1;
      IDirect3DDevice.SetVertexDeclaration(this.aLong11450, var2.aLong10123);
   }

   final void method8897(int var1, Class370 var2, boolean var3, boolean var4) {
      if(this.aBool9761) {
         int var5 = 0;
         byte var6;
         switch(var1) {
         case 1:
            var6 = 3;
            break;
         case 2:
            var6 = 26;
            break;
         default:
            var6 = 2;
         }

         if(var3) {
            var5 |= 32;
         }

         if(var4) {
            var5 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, var6, method10518(var2) | var5);
      }

   }

   final void method8926(int var1, Class370 var2, boolean var3) {
      if(this.aBool9761) {
         int var4 = 0;
         byte var5;
         switch(var1) {
         case 1:
            var5 = 6;
            break;
         case 2:
            var5 = 27;
            break;
         default:
            var5 = 5;
         }

         if(var3) {
            var4 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, var5, method10518(var2) | var4);
      }

   }

   final void method8834() {
      if(this.aBool9761) {
         IDirect3DDevice.SetRenderState(this.aLong11450, 60, this.anInt9813);
      }

   }

   static final int method10512(Class372 var0) {
      switch(var0.anInt3887) {
      case 0:
         return 2;
      case 1:
         return 7;
      case 2:
         return 4;
      case 3:
         return 26;
      case 4:
         return 10;
      default:
         throw new IllegalArgumentException();
      }
   }

   public float method8737() {
      return -0.5F;
   }

   static final int method10513(Class363 var0) {
      switch(var0.anInt3842) {
      case 1:
         return 3;
      case 2:
         return 2;
      case 3:
         return 256;
      case 4:
         return 4;
      case 5:
         return 1;
      default:
         return 0;
      }
   }

   void method8810(int var1) {
      IDirect3DDevice.SetRenderState(this.aLong11450, 168, var1);
   }

   public Interface23 method2572(int var1, int var2, int var3) {
      return new Class406(this, Class166.aClass166_1889, var1, var2, var3);
   }

   void method8954() {
      switch(this.aClass369_9814.anInt3875) {
      case 0:
         IDirect3DDevice.SetRenderState(this.aLong11450, 19, 2);
         IDirect3DDevice.SetRenderState(this.aLong11450, 20, 2);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.aLong11450, 19, 2);
         IDirect3DDevice.SetRenderState(this.aLong11450, 20, 1);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.aLong11450, 19, 5);
         IDirect3DDevice.SetRenderState(this.aLong11450, 20, 6);
         break;
      case 3:
         IDirect3DDevice.SetRenderState(this.aLong11450, 19, 9);
         IDirect3DDevice.SetRenderState(this.aLong11450, 20, 2);
      }

      switch(this.anInt9840) {
      case 0:
         IDirect3DDevice.SetRenderState(this.aLong11450, 207, 1);
         IDirect3DDevice.SetRenderState(this.aLong11450, 208, 1);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.aLong11450, 207, 2);
         IDirect3DDevice.SetRenderState(this.aLong11450, 208, 1);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.aLong11450, 207, 2);
         IDirect3DDevice.SetRenderState(this.aLong11450, 208, 2);
         break;
      case 3:
         IDirect3DDevice.SetRenderState(this.aLong11450, 207, 1);
         IDirect3DDevice.SetRenderState(this.aLong11450, 208, 2);
      }

   }

   void method10514() {
      IDirect3DDevice.SetRenderState(this.aLong11450, 22, this.anInt9818);
   }

   public void method2400() {
   }

   void method8816() {
      this.aFloat9677 = this.aFloat9731 - (float)this.anInt9809;
      this.aFloat9810 = this.aFloat9677 - (float)this.anInt9675;
      if(this.aFloat9810 < this.aFloat9730) {
         this.aFloat9810 = this.aFloat9730;
      }

      if(this.aBool9761) {
         IDirect3DDevice.method9228(this.aLong11450, 36, this.aFloat9810);
         IDirect3DDevice.method9228(this.aLong11450, 37, this.aFloat9677);
         IDirect3DDevice.SetRenderState(this.aLong11450, 34, this.anInt9722);
      }

   }

   void method8869(boolean var1) {
      IDirect3DDevice.method9229(this.aLong11450, 161, var1);
   }

   Interface38 method8984(Class144 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6, var7);
   }

   final Interface35 method8818(boolean var1) {
      return new Class421(this, var1);
   }

   Class335 method8748(Class359[] var1) {
      return new Class335_Sub1(this, var1);
   }

   void method8881() {
      for(LinkableObject var1 = (LinkableObject)this.aClass702_11439.method8206((byte)65); var1 != null; var1 = (LinkableObject)this.aClass702_11439.method8181(-706882912)) {
         Interface52 var2 = (Interface52)var1.anObject10399;
         var2.method365();
         if(var2 == this.aClass184_2049) {
            var2.method363();
         }
      }

      super.method8732();
   }

   public void method8820(int var1, Interface35 var2) {
      Class421 var3 = (Class421)var2;
      IDirect3DDevice.SetStreamSource(this.aLong11450, var1, var3.aLong4723, 0, var3.method4991());
   }

   void method8769(Interface42 var1) {
      IDirect3DDevice.SetIndices(this.aLong11450, ((Class412)var1).aLong4435);
   }

   public final void method8825(Class374 var1, int var2, int var3) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawPrimitive(this.aLong11450, method10515(var1), var2, var3);
   }

   final void method8826(Interface42 var1, Class374 var2, int var3, int var4, int var5, int var6) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong11450, ((Class412)var1).aLong4435, 4, 0, var3, var4, var5, var6);
   }

   public void method2393(boolean var1) {
   }

   void method8880() {
      this.method2273();

      for(LinkableObject var1 = (LinkableObject)this.aClass702_11439.method8206((byte)54); var1 != null; var1 = (LinkableObject)this.aClass702_11439.method8181(-594518391)) {
         Interface52 var2 = (Interface52)var1.anObject10399;
         var2.method140();
      }

      super.method8731();
   }

   public final synchronized void method2234(int var1) {
      for(int var2 = 0; var2 < this.anInt11467; ++var2) {
         IUnknown.Release(this.aLongArray11459[var2]);
      }

      this.anInt11467 = 0;
      super.method2234(var1);
   }

   public int method2414() {
      return this.aLongArray11454[this.anInt11474] == 0L?-1:(Class367.method4652(IDirect3DEventQuery.IsSignaled(this.aLongArray11454[this.anInt11474]))?this.anIntArray11473[this.anInt11474]:-1);
   }

   public void method8795() {
      if(this.aBoolArray11464[this.anInt9787]) {
         this.aBoolArray11464[this.anInt9787] = false;
         IDirect3DDevice.SetTexture(this.aLong11450, this.anInt9787, 0L);
         this.method8804();
         this.method8803();
      }

   }

   static final int method10515(Class374 var0) {
      switch(var0.anInt3895) {
      case 0:
         return 3;
      case 1:
         return 1;
      case 2:
         return 4;
      case 3:
         return 5;
      case 4:
         return 2;
      case 5:
         return 6;
      default:
         throw new IllegalArgumentException("");
      }
   }

   void method8850() {
      if(this.aBool9761) {
         int var1 = this.aBoolArray11464[this.anInt9787]?method10512(this.aClass372Array9835[this.anInt9787]):1;
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 1, var1);
      }

   }

   static boolean method10516(int var0, int var1, long var2, int var4, D3DDISPLAYMODE var5, D3DPRESENT_PARAMETERS var6) {
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      try {
         if(Class367.method4651(IDirect3D.GetAdapterDisplayMode(var2, var0, var5))) {
            return false;
         } else {
            label72:
            for(; var4 >= 0; --var4) {
               if(var4 != 1) {
                  var9 = 0 + var4;

                  for(int var10 = 0; var10 < anIntArray11471.length; ++var10) {
                     if(IDirect3D.CheckDeviceType(var2, var0, var1, var5.Format, anIntArray11471[var10], true) == 0 && IDirect3D.CheckDeviceFormat(var2, var0, var1, var5.Format, 1, 1, anIntArray11471[var10]) == 0 && (var4 == 0 || IDirect3D.CheckDeviceMultiSampleType(var2, var0, var1, anIntArray11471[var10], true, var9) == 0)) {
                        for(int var11 = 0; var11 < anIntArray11476.length; ++var11) {
                           if(IDirect3D.CheckDeviceFormat(var2, var0, var1, var5.Format, 2, 1, anIntArray11476[var11]) == 0 && IDirect3D.CheckDepthStencilMatch(var2, var0, var1, var5.Format, anIntArray11471[var10], anIntArray11476[var11]) == 0 && (var4 == 0 || IDirect3D.CheckDeviceMultiSampleType(var2, var0, var1, anIntArray11476[var10], true, var9) == 0)) {
                              var8 = anIntArray11471[var10];
                              var7 = anIntArray11476[var11];
                              break label72;
                           }
                        }
                     }
                  }
               }
            }

            if(var4 >= 0 && var8 != 0 && var7 != 0) {
               var6.BackBufferFormat = var8;
               var6.AutoDepthStencilFormat = var7;
               var6.MultiSampleType = var9;
               var6.MultiSampleQuality = 0;
               return true;
            } else {
               return false;
            }
         }
      } catch (Throwable var12) {
         return false;
      }
   }

   void method8830(int var1) {
      if(!this.aBool11433) {
         int var2 = (var1 & 2) != 0?2:3;
         IDirect3DDevice.SetRenderState(this.aLong11450, 8, var2);
      }

   }

   public String method2245() {
      String var1 = "Caps: 4:";
      String var2 = ":";
      var1 = var1 + this.anInt9819 + var2;
      var1 = var1 + this.anInt9683 + var2;
      var1 = var1 + this.anInt9719 + var2;
      var1 = var1 + (this.aBool9830?1:0) + var2;
      var1 = var1 + (this.method8898()?1:0) + var2;
      var1 = var1 + (this.method8719()?1:0) + var2;
      var1 = var1 + (this.aBool9832?1:0) + var2;
      var1 = var1 + (this.aBool9831?1:0) + var2;
      var1 = var1 + (this.aBool11455?1:0) + var2;
      var1 = var1 + (this.aBool11442?1:0) + var2;
      var1 = var1 + (this.aBool11457?1:0) + var2;
      var1 = var1 + (this.aBool11456?1:0) + var2;
      var1 = var1 + (this.aBool9827?1:0) + var2;
      var1 = var1 + (this.aBool9794?1:0) + var2;
      var1 = var1 + (this.aBool9829?1:0) + var2;
      var1 = var1 + (this.aBool11462?1:0) + var2;
      var1 = var1 + (this.aBool11460?1:0) + var2;
      var1 = var1 + (this.aBool11453?1:0) + var2;
      var1 = var1 + (this.aBool9834?1:0) + var2;
      var1 = var1 + (this.aBool11435?1:0) + var2;
      var1 = var1 + (this.aBool11434?1:0);
      return var1;
   }

   void method8847() {
      switch(this.aClass369_9814.anInt3875) {
      case 0:
         IDirect3DDevice.SetRenderState(this.aLong11450, 19, 2);
         IDirect3DDevice.SetRenderState(this.aLong11450, 20, 2);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.aLong11450, 19, 2);
         IDirect3DDevice.SetRenderState(this.aLong11450, 20, 1);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.aLong11450, 19, 5);
         IDirect3DDevice.SetRenderState(this.aLong11450, 20, 6);
         break;
      case 3:
         IDirect3DDevice.SetRenderState(this.aLong11450, 19, 9);
         IDirect3DDevice.SetRenderState(this.aLong11450, 20, 2);
      }

      switch(this.anInt9840) {
      case 0:
         IDirect3DDevice.SetRenderState(this.aLong11450, 207, 1);
         IDirect3DDevice.SetRenderState(this.aLong11450, 208, 1);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.aLong11450, 207, 2);
         IDirect3DDevice.SetRenderState(this.aLong11450, 208, 1);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.aLong11450, 207, 2);
         IDirect3DDevice.SetRenderState(this.aLong11450, 208, 2);
         break;
      case 3:
         IDirect3DDevice.SetRenderState(this.aLong11450, 207, 1);
         IDirect3DDevice.SetRenderState(this.aLong11450, 208, 2);
      }

   }

   public Class157 method2360() {
      D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
      IDirect3D.GetAdapterIdentifier(this.aLong11461, this.anInt11436, 0, var1);
      return new Class157(var1.VendorID, this.method8721()?"Direct3D FF":"Direct3D", 9, var1.Description, var1.DriverVersion, this.method8721());
   }

   void method8952() {
   }

   public Class157 method2362() {
      D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
      IDirect3D.GetAdapterIdentifier(this.aLong11461, this.anInt11436, 0, var1);
      return new Class157(var1.VendorID, this.method8721()?"Direct3D FF":"Direct3D", 9, var1.Description, var1.DriverVersion, this.method8721());
   }

   public void finalize() {
      super.finalize();
   }

   public void method2349() {
      long var1 = IDirect3DDevice.CreateEventQuery(this.aLong11450);
      if(Class367.method4652(IDirect3DEventQuery.Issue(var1))) {
         while(true) {
            int var3 = IDirect3DEventQuery.IsSignaled(var1);
            if(var3 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      IUnknown.Release(var1);
   }

   void method2366() {
      super.method2233();
      if(this.aLong11441 != 0L) {
         D3DLIGHT.Destroy(this.aLong11441);
         this.aLong11441 = 0L;
      }

      if(this.aLong11463 != 0L) {
         D3DLIGHT.Destroy(this.aLong11463);
         this.aLong11463 = 0L;
      }

      if(this.aLong11443 != 0L) {
         D3DLIGHT.Destroy(this.aLong11443);
         this.aLong11443 = 0L;
      }

      if(this.aLong11450 != 0L) {
         IDirect3DDevice.Destroy(this.aLong11450);
         this.aLong11450 = 0L;
      }

      if(this.aLong11461 != 0L) {
         IUnknown.Release(this.aLong11461);
         this.aLong11461 = 0L;
      }

   }

   public final synchronized void method2498(int var1) {
      for(int var2 = 0; var2 < this.anInt11467; ++var2) {
         IUnknown.Release(this.aLongArray11459[var2]);
      }

      this.anInt11467 = 0;
      super.method2234(var1);
   }

   Interface43 method8858(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class410_Sub1_Sub1(this, var1, var2, var3, var4);
   }

   public String method2322() {
      String var1 = "Caps: 4:";
      String var2 = ":";
      var1 = var1 + this.anInt9819 + var2;
      var1 = var1 + this.anInt9683 + var2;
      var1 = var1 + this.anInt9719 + var2;
      var1 = var1 + (this.aBool9830?1:0) + var2;
      var1 = var1 + (this.method8898()?1:0) + var2;
      var1 = var1 + (this.method8719()?1:0) + var2;
      var1 = var1 + (this.aBool9832?1:0) + var2;
      var1 = var1 + (this.aBool9831?1:0) + var2;
      var1 = var1 + (this.aBool11455?1:0) + var2;
      var1 = var1 + (this.aBool11442?1:0) + var2;
      var1 = var1 + (this.aBool11457?1:0) + var2;
      var1 = var1 + (this.aBool11456?1:0) + var2;
      var1 = var1 + (this.aBool9827?1:0) + var2;
      var1 = var1 + (this.aBool9794?1:0) + var2;
      var1 = var1 + (this.aBool9829?1:0) + var2;
      var1 = var1 + (this.aBool11462?1:0) + var2;
      var1 = var1 + (this.aBool11460?1:0) + var2;
      var1 = var1 + (this.aBool11453?1:0) + var2;
      var1 = var1 + (this.aBool9834?1:0) + var2;
      var1 = var1 + (this.aBool11435?1:0) + var2;
      var1 = var1 + (this.aBool11434?1:0);
      return var1;
   }

   public final void method8827(Class374 var1, int var2, int var3, int var4, int var5) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawIndexedPrimitive(this.aLong11450, method10515(var1), 0, var2, var3, var4, var5);
   }

   public boolean method2406() {
      return this.aBool11440?false:this.aLongArray11454[this.anInt11475] == 0L;
   }

   final void method8941(int var1, Class370 var2, boolean var3) {
      if(this.aBool9761) {
         int var4 = 0;
         byte var5;
         switch(var1) {
         case 1:
            var5 = 6;
            break;
         case 2:
            var5 = 27;
            break;
         default:
            var5 = 5;
         }

         if(var3) {
            var4 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, var5, method10518(var2) | var4);
      }

   }

   public void method2394(boolean var1) {
   }

   void method8981() {
      if(this.aLong11458 == 0L && this.aClass363Array9774[this.anInt9787] != Class363.aClass363_3844) {
         if(this.aClass363Array9774[this.anInt9787] == Class363.aClass363_3840) {
            IDirect3DDevice.SetTransform(this.aLong11450, 16 + this.anInt9787, this.aClass433Array9773[this.anInt9787].method5113(this.aFloatArray11465));
         } else {
            IDirect3DDevice.SetTransform(this.aLong11450, 16 + this.anInt9787, this.aClass433Array9773[this.anInt9787].method5107(this.aFloatArray11465));
         }

         int var1 = method10513(this.aClass363Array9774[this.anInt9787]);
         if(var1 != this.anIntArray11445[this.anInt9787]) {
            IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 24, var1);
            this.anIntArray11445[this.anInt9787] = var1;
         }
      } else {
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 24, 0);
         this.anIntArray11445[this.anInt9787] = 0;
      }

   }

   void method8731() {
      this.method2273();

      for(LinkableObject var1 = (LinkableObject)this.aClass702_11439.method8206((byte)118); var1 != null; var1 = (LinkableObject)this.aClass702_11439.method8181(1116465199)) {
         Interface52 var2 = (Interface52)var1.anObject10399;
         var2.method140();
      }

      super.method8731();
   }

   public int[] method2397(int var1, int var2, int var3, int var4) {
      this.method2312();
      int[] var5 = null;
      long var6 = IDirect3DDevice.GetRenderTarget(this.aLong11450, 0);
      long var8 = IDirect3DDevice.CreateRenderTarget(this.aLong11450, var3, var4, 21, 0, 0, true);
      int var10 = IDirect3DDevice.StretchRect(this.aLong11450, var6, var1, var2, var3, var4, var8, 0, 0, var3, var4, 1);
      this.method8722(var3 * var4 * 4);
      if(Class367.method4652(var10)) {
         var5 = new int[var3 * var4];
         IDirect3DSurface.Download(var8, 0, 0, var3, var4, var3 * 4, 16, this.aLong9685);
         this.aByteBuffer9684.clear();
         this.aByteBuffer9684.asIntBuffer().get(var5);
      }

      IUnknown.Release(var6);
      IUnknown.Release(var8);
      return var5;
   }

   public boolean method2264() {
      return this.aBool11440?false:this.aLongArray11454[this.anInt11475] == 0L;
   }

   public void method2399() {
   }

   public boolean method2416() {
      return true;
   }

   public boolean method2403() {
      return true;
   }

   public boolean method2404() {
      return true;
   }

   void method8950() {
   }

   public void method2611() {
   }

   public boolean method2407() {
      return this.aBool11440?false:this.aLongArray11454[this.anInt11475] == 0L;
   }

   public boolean method2408() {
      return this.aBool11440?false:this.aLongArray11454[this.anInt11475] == 0L;
   }

   public boolean method2409() {
      return true;
   }

   public Interface23 method2571(int var1, int var2, int var3) {
      return new Class406(this, Class166.aClass166_1889, var1, var2, var3);
   }

   public boolean method2411() {
      return false;
   }

   public boolean method2412() {
      return false;
   }

   public boolean method2413() {
      return false;
   }

   public Class157 method2599() {
      D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
      IDirect3D.GetAdapterIdentifier(this.aLong11461, this.anInt11436, 0, var1);
      return new Class157(var1.VendorID, this.method8721()?"Direct3D FF":"Direct3D", 9, var1.Description, var1.DriverVersion, this.method8721());
   }

   public int method2415() {
      return this.aLongArray11454[this.anInt11474] == 0L?-1:(Class367.method4652(IDirect3DEventQuery.IsSignaled(this.aLongArray11454[this.anInt11474]))?this.anIntArray11473[this.anInt11474]:-1);
   }

   public void method2532(int var1, int var2, int var3) {
      if(this.aLong11470 == 0L) {
         this.method10501(var2, var3);
      }

      long var4 = IDirect3DDevice.GetRenderTarget(this.aLong11450, 0);
      if(Class367.method4651(IDirect3DDevice.StretchRect(this.aLong11450, var4, 0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), this.aLong11470, this.anInt2055 * 1228368769, this.anInt2039 * 1714687685, this.anInt2033 * -1550496547, this.anInt2058 * 568592699, 2))) {
         ;
      }

      IUnknown.Release(var4);
      IDirect3DDevice.GetRenderTargetData(this.aLong11450, this.aLong11470, this.aLongArray11472[this.anInt11475]);
      long var6 = IDirect3DDevice.CreateEventQuery(this.aLong11450);
      if(Class367.method4652(IDirect3DEventQuery.Issue(var6))) {
         this.aLongArray11454[this.anInt11475] = var6;
      }

      this.anIntArray11473[this.anInt11475] = var1;
      if(++this.anInt11475 >= 3) {
         this.anInt11475 = 0;
      }

   }

   boolean method8844(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 4, method10502(var1, var2)));
   }

   public void method2418() {
      for(int var1 = 0; var1 < 3; ++var1) {
         if(this.aLongArray11454[var1] != 0L) {
            IUnknown.Release(this.aLongArray11454[var1]);
            this.aLongArray11454[var1] = 0L;
         }
      }

      this.anInt11475 = 0;
      this.anInt11474 = 0;
   }

   public long method2419(int var1, int var2) {
      return this.method10505(var1, var2, (int[])null, (int[])null);
   }

   public void method2417(int var1, int var2, int var3) {
      if(this.aLong11470 == 0L) {
         this.method10501(var2, var3);
      }

      long var4 = IDirect3DDevice.GetRenderTarget(this.aLong11450, 0);
      if(Class367.method4651(IDirect3DDevice.StretchRect(this.aLong11450, var4, 0, 0, this.aClass184_2049.method2691(), this.aClass184_2049.method2693(), this.aLong11470, this.anInt2055 * 1228368769, this.anInt2039 * 1714687685, this.anInt2033 * -1550496547, this.anInt2058 * 568592699, 2))) {
         ;
      }

      IUnknown.Release(var4);
      IDirect3DDevice.GetRenderTargetData(this.aLong11450, this.aLong11470, this.aLongArray11472[this.anInt11475]);
      long var6 = IDirect3DDevice.CreateEventQuery(this.aLong11450);
      if(Class367.method4652(IDirect3DEventQuery.Issue(var6))) {
         this.aLongArray11454[this.anInt11475] = var6;
      }

      this.anIntArray11473[this.anInt11475] = var1;
      if(++this.anInt11475 >= 3) {
         this.anInt11475 = 0;
      }

   }

   public long method2421(int var1, int var2) {
      return this.method10505(var1, var2, (int[])null, (int[])null);
   }

   public void method2271(int var1, int var2, int[] var3, int[] var4) {
      this.method10505(var1, var2, var3, var4);
   }

   public void method2423(int var1, int var2, int[] var3, int[] var4) {
      this.method10505(var1, var2, var3, var4);
   }

   public void method2424() {
      if(this.aLong11470 != 0L) {
         IUnknown.Release(this.aLong11470);
         this.aLong11470 = 0L;
      }

      for(int var1 = 0; var1 < 3; ++var1) {
         if(this.aLongArray11454[var1] != 0L) {
            IUnknown.Release(this.aLongArray11454[var1]);
            this.aLongArray11454[var1] = 0L;
         }

         if(this.aLongArray11472[var1] != 0L) {
            IUnknown.Release(this.aLongArray11472[var1]);
            this.aLongArray11472[var1] = 0L;
         }
      }

      this.anInt11475 = 0;
      this.anInt11474 = 0;
   }

   static final int method10517(Class166 var0) {
      if(var0 == Class166.aClass166_1888) {
         return 80;
      } else if(var0 == Class166.aClass166_1889) {
         return 77;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   void method8929() {
      IDirect3DDevice.method9229(this.aLong11450, 174, this.aBool9686);
   }

   public void method2439(int var1, int var2) {
      IDirect3DDevice.Clear(this.aLong11450, var1, var2, 1.0F, 0);
   }

   public void method2440(int var1, int var2) {
      IDirect3DDevice.Clear(this.aLong11450, var1, var2, 1.0F, 0);
   }

   public void method2395(long var1) {
   }

   public Class178 method2524(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   public Class178 method2525(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   public Class178 method2526(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   public Interface21 method2569(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return new Class419(this, var3, var4, var1, var2, var5);
   }

   public Class284 method8725(String var1) {
      byte[] var2 = this.method10521(var1);
      if(var2 == null) {
         return null;
      } else {
         Class274 var3 = this.method8726(var2);
         return new Class284_Sub1(this, var3);
      }
   }

   public Class184_Sub2 method2563() {
      return new Class184_Sub2_Sub1_Sub2(this);
   }

   public Class178 method2527(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   public Class184_Sub2 method2565() {
      return new Class184_Sub2_Sub1_Sub2(this);
   }

   static final int method10518(Class370 var0) {
      switch(var0.anInt3882) {
      case 0:
         return 2;
      case 1:
         return 0;
      case 2:
         return 3;
      case 3:
         return 1;
      default:
         throw new IllegalArgumentException();
      }
   }

   public Interface21 method2567(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return new Class419(this, var3, var4, var1, var2, var5);
   }

   public Interface21 method2568(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return new Class419(this, var3, var4, var1, var2, var5);
   }

   Interface44 method8896(int var1, boolean var2, int[][] var3) {
      return new Class410_Sub3(this, var1, var2, var3);
   }

   public Interface23 method2620(int var1, int var2) {
      return new Class406(this, Class166.aClass166_1889, var1, var2, 0);
   }

   Interface38 method8955(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class410_Sub1(this, var1, var2, var3, var4);
   }

   public Interface23 method2260(int var1, int var2, int var3) {
      return new Class406(this, Class166.aClass166_1889, var1, var2, var3);
   }

   void method2574() {
      super.finalize();
   }

   void method2575() {
      super.finalize();
   }

   public boolean method8865() {
      return (this.aD3DCAPS11468.VertexShaderVersion & '\uffff') >= 257;
   }

   public boolean method8866() {
      return (this.aD3DCAPS11468.VertexShaderVersion & '\uffff') >= 257;
   }

   public boolean method8736() {
      return (this.aD3DCAPS11468.VertexShaderVersion & '\uffff') >= 257;
   }

   public boolean method8846() {
      return (this.aD3DCAPS11468.PixelShaderVersion & '\uffff') >= 257;
   }

   public boolean method8868() {
      return (this.aD3DCAPS11468.PixelShaderVersion & '\uffff') >= 257;
   }

   void method8817() {
      if(this.aBool9761) {
         IDirect3DDevice.method9229(this.aLong11450, 28, this.aBool9806 && this.aBool9805 && this.anInt9675 >= 0);
      }

   }

   public Class284 method8873(String var1) {
      byte[] var2 = this.method10521(var1);
      if(var2 == null) {
         return null;
      } else {
         Class274 var3 = this.method8726(var2);
         return new Class284_Sub1(this, var3);
      }
   }

   public final void method8835(Class374 var1, int var2, int var3) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawPrimitive(this.aLong11450, method10515(var1), var2, var3);
   }

   public Class284 method8921(String var1) {
      byte[] var2 = this.method10521(var1);
      if(var2 == null) {
         return null;
      } else {
         Class274 var3 = this.method8726(var2);
         return new Class284_Sub1(this, var3);
      }
   }

   void method10519(Interface52 var1) {
      LinkableObject var2 = this.method10520(var1);
      if(var2 != null) {
         var2.method6332(-1949449864);
      }

   }

   void method8878() {
      for(int var1 = 0; var1 < this.anInt9683; ++var1) {
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 7, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 6, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 5, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 1, 1);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 2, 1);
         this.aClass341Array11477[var1] = Class341.aClass341_3541;
         boolean[] var2 = this.aBoolArray11449;
         this.aBoolArray11446[var1] = true;
         var2[var1] = true;
         this.aBoolArray11448[var1] = false;
         this.anIntArray11445[var1] = 0;
      }

      IDirect3DDevice.SetTextureStageState(this.aLong11450, 0, 6, 1);
      IDirect3DDevice.SetRenderState(this.aLong11450, 9, 2);
      IDirect3DDevice.SetRenderState(this.aLong11450, 23, 4);
      IDirect3DDevice.SetRenderState(this.aLong11450, 25, 5);
      IDirect3DDevice.SetRenderState(this.aLong11450, 24, 0);
      IDirect3DDevice.method9229(this.aLong11450, 206, this.aBool9834);
      IDirect3DDevice.SetRenderState(this.aLong11450, 181, 0);
      this.method10514();
      IDirect3DDevice.SetRenderState(this.aLong11450, 147, 1);
      IDirect3DDevice.SetRenderState(this.aLong11450, 145, 1);
      IDirect3DDevice.method9228(this.aLong11450, 38, 0.95F);
      IDirect3DDevice.SetRenderState(this.aLong11450, 35, 3);
      IDirect3DDevice.method9228(this.aLong11450, 154, 1.0F);
      D3DLIGHT.SetType(this.aLong11441, 3);
      D3DLIGHT.SetType(this.aLong11463, 3);
      D3DLIGHT.SetType(this.aLong11443, 1);
      this.aBool11444 = false;
      super.method8729();
   }

   void method8879() {
      for(int var1 = 0; var1 < this.anInt9683; ++var1) {
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 7, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 6, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 5, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 1, 1);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 2, 1);
         this.aClass341Array11477[var1] = Class341.aClass341_3541;
         boolean[] var2 = this.aBoolArray11449;
         this.aBoolArray11446[var1] = true;
         var2[var1] = true;
         this.aBoolArray11448[var1] = false;
         this.anIntArray11445[var1] = 0;
      }

      IDirect3DDevice.SetTextureStageState(this.aLong11450, 0, 6, 1);
      IDirect3DDevice.SetRenderState(this.aLong11450, 9, 2);
      IDirect3DDevice.SetRenderState(this.aLong11450, 23, 4);
      IDirect3DDevice.SetRenderState(this.aLong11450, 25, 5);
      IDirect3DDevice.SetRenderState(this.aLong11450, 24, 0);
      IDirect3DDevice.method9229(this.aLong11450, 206, this.aBool9834);
      IDirect3DDevice.SetRenderState(this.aLong11450, 181, 0);
      this.method10514();
      IDirect3DDevice.SetRenderState(this.aLong11450, 147, 1);
      IDirect3DDevice.SetRenderState(this.aLong11450, 145, 1);
      IDirect3DDevice.method9228(this.aLong11450, 38, 0.95F);
      IDirect3DDevice.SetRenderState(this.aLong11450, 35, 3);
      IDirect3DDevice.method9228(this.aLong11450, 154, 1.0F);
      D3DLIGHT.SetType(this.aLong11441, 3);
      D3DLIGHT.SetType(this.aLong11463, 3);
      D3DLIGHT.SetType(this.aLong11443, 1);
      this.aBool11444 = false;
      super.method8729();
   }

   final void method8852(int var1, Class370 var2, boolean var3, boolean var4) {
      if(this.aBool9761) {
         int var5 = 0;
         byte var6;
         switch(var1) {
         case 1:
            var6 = 3;
            break;
         case 2:
            var6 = 26;
            break;
         default:
            var6 = 2;
         }

         if(var3) {
            var5 |= 32;
         }

         if(var4) {
            var5 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, var6, method10518(var2) | var5);
      }

   }

   public void method2267() {
      for(int var1 = 0; var1 < 3; ++var1) {
         if(this.aLongArray11454[var1] != 0L) {
            IUnknown.Release(this.aLongArray11454[var1]);
            this.aLongArray11454[var1] = 0L;
         }
      }

      this.anInt11475 = 0;
      this.anInt11474 = 0;
   }

   void method8882() {
      for(LinkableObject var1 = (LinkableObject)this.aClass702_11439.method8206((byte)36); var1 != null; var1 = (LinkableObject)this.aClass702_11439.method8181(2006551172)) {
         Interface52 var2 = (Interface52)var1.anObject10399;
         var2.method365();
         if(var2 == this.aClass184_2049) {
            var2.method363();
         }
      }

      super.method8732();
   }

   void method8854() {
      for(LinkableObject var1 = (LinkableObject)this.aClass702_11439.method8206((byte)60); var1 != null; var1 = (LinkableObject)this.aClass702_11439.method8181(1804327858)) {
         Interface52 var2 = (Interface52)var1.anObject10399;
         var2.method365();
         if(var2 == this.aClass184_2049) {
            var2.method363();
         }
      }

      super.method8732();
   }

   void method8891() {
      if(this.aClass184_2049 != null) {
         IDirect3DDevice.SetViewport(this.aLong11450, this.anInt9698 + this.anInt9740, this.anInt9745 + this.anInt9738, this.anInt9742, this.anInt9743, this.aFloat9726, this.aFloat9727);
      }

   }

   void method8892() {
      if(this.aClass184_2049 != null) {
         IDirect3DDevice.SetViewport(this.aLong11450, this.anInt9698 + this.anInt9740, this.anInt9745 + this.anInt9738, this.anInt9742, this.anInt9743, this.aFloat9726, this.aFloat9727);
      }

   }

   void method8948(int var1) {
      if(!this.aBool11433) {
         int var2 = (var1 & 2) != 0?2:3;
         IDirect3DDevice.SetRenderState(this.aLong11450, 8, var2);
      }

   }

   Interface44 method8933(int var1, boolean var2, int[][] var3) {
      return new Class410_Sub3(this, var1, var2, var3);
   }

   void method8894() {
      IDirect3DDevice.SetScissorRect(this.aLong11450, this.anInt9698 + this.anInt9682, this.anInt9745 + this.anInt9732, this.anInt9735, this.anInt9789);
   }

   void method8895() {
      IDirect3DDevice.SetScissorRect(this.aLong11450, this.anInt9698 + this.anInt9682, this.anInt9745 + this.anInt9732, this.anInt9735, this.anInt9789);
   }

   void method8889() {
      IDirect3DDevice.SetScissorRect(this.aLong11450, this.anInt9698 + this.anInt9682, this.anInt9745 + this.anInt9732, this.anInt9735, this.anInt9789);
   }

   Interface38 method8932(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6);
   }

   public void method8900(Class433 var1) {
      var1.method5085(this.aClass433_11451);
   }

   public void method8901(Class433 var1) {
      var1.method5085(this.aClass433_11451);
   }

   final void method8939(int var1, Class370 var2, boolean var3, boolean var4) {
      if(this.aBool9761) {
         int var5 = 0;
         byte var6;
         switch(var1) {
         case 1:
            var6 = 3;
            break;
         case 2:
            var6 = 26;
            break;
         default:
            var6 = 2;
         }

         if(var3) {
            var5 |= 32;
         }

         if(var4) {
            var5 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, var6, method10518(var2) | var5);
      }

   }

   void method8908() {
      IDirect3DDevice.method9229(this.aLong11450, 14, this.aBool9808 && this.aBool9784);
   }

   void method8910() {
      if(this.aBool9761) {
         IDirect3DDevice.method9229(this.aLong11450, 137, this.aBool9744 && !this.aBool9768);
      }

   }

   void method8911() {
      if(this.aBool9761) {
         IDirect3DDevice.method9229(this.aLong11450, 137, this.aBool9744 && !this.aBool9768);
      }

   }

   void method8912() {
      if(this.aBool9761) {
         IDirect3DDevice.method9229(this.aLong11450, 137, this.aBool9744 && !this.aBool9768);
      }

   }

   void method8913() {
      if(this.aBool9761) {
         D3DLIGHT.SetAmbient(this.aLong11441, this.aFloat9708 * this.aFloat9669, this.aFloat9771 * this.aFloat9669, this.aFloat9760 * this.aFloat9669, 0.0F);
         this.aBool11444 = false;
      }

   }

   public float method8886() {
      return -0.5F;
   }

   public final void method8979(Class374 var1, int var2, int var3, int var4, int var5) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawIndexedPrimitive(this.aLong11450, method10515(var1), 0, var2, var3, var4, var5);
   }

   final void method8977(Interface42 var1, Class374 var2, int var3, int var4, int var5, int var6) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong11450, ((Class412)var1).aLong4435, 4, 0, var3, var4, var5, var6);
   }

   void method8893() {
      if(this.aClass184_2049 != null) {
         IDirect3DDevice.SetViewport(this.aLong11450, this.anInt9698 + this.anInt9740, this.anInt9745 + this.anInt9738, this.anInt9742, this.anInt9743, this.aFloat9726, this.aFloat9727);
      }

   }

   void method8918() {
      if(this.aBool9761) {
         D3DLIGHT.SetDirection(this.aLong11441, -this.aFloatArray9777[0], -this.aFloatArray9777[1], -this.aFloatArray9777[2]);
         D3DLIGHT.SetDirection(this.aLong11463, -this.aFloatArray9701[0], -this.aFloatArray9701[1], -this.aFloatArray9701[2]);
         this.aBool11444 = false;
      }

   }

   void method8919() {
      this.method8738();
      this.method8779();
   }

   void method8920() {
      this.method8738();
      this.method8779();
   }

   void method8957() {
      this.method8738();
      this.method8779();
   }

   void method8922() {
      int var1;
      for(var1 = 0; var1 < this.anInt9766; ++var1) {
         Class526_Sub16 var2 = this.aClass526_Sub16Array9764[var1];
         int var3 = var1 + 2;
         int var4 = var2.method9394(1095806685);
         float var5 = var2.method9419(1613563498) / 255.0F;
         D3DLIGHT.SetPosition(this.aLong11443, (float)var2.method9390((byte)-9), (float)var2.method9391(1893494482), (float)var2.method9392((byte)-27));
         D3DLIGHT.SetDiffuse(this.aLong11443, (float)(var4 >> 16 & 255) * var5, (float)(var4 >> 8 & 255) * var5, (float)(var4 & 255) * var5, 0.0F);
         D3DLIGHT.SetAttenuation(this.aLong11443, 0.0F, 0.0F, 1.0F / (float)(var2.method9422((short)8192) * var2.method9422((short)8192)));
         D3DLIGHT.SetRange(this.aLong11443, (float)var2.method9422((short)8192));
         IDirect3DDevice.SetLight(this.aLong11450, var3, this.aLong11443);
         IDirect3DDevice.LightEnable(this.aLong11450, var3, true);
      }

      while(var1 < this.anInt9765) {
         IDirect3DDevice.LightEnable(this.aLong11450, var1 + 2, false);
         ++var1;
      }

   }

   public void method2283(int var1, int var2) {
      IDirect3DDevice.Clear(this.aLong11450, var1, var2, 1.0F, 0);
   }

   boolean method8903(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 3, method10502(var1, var2)));
   }

   boolean method8972(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 3, method10502(var1, var2)));
   }

   boolean method8794(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 4, method10502(var1, var2)));
   }

   boolean method8832(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 4, method10502(var1, var2)));
   }

   void method8779() {
      if(this.aBool9761 && !this.aBool11444) {
         IDirect3DDevice.LightEnable(this.aLong11450, 0, false);
         IDirect3DDevice.LightEnable(this.aLong11450, 1, false);
         IDirect3DDevice.SetLight(this.aLong11450, 0, this.aLong11441);
         IDirect3DDevice.SetLight(this.aLong11450, 1, this.aLong11463);
         IDirect3DDevice.LightEnable(this.aLong11450, 0, true);
         IDirect3DDevice.LightEnable(this.aLong11450, 1, true);
         this.aBool11444 = true;
      }

   }

   Interface38 method8907(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class410_Sub1(this, var1, var2, var3, var4);
   }

   Interface38 method8930(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class410_Sub1(this, var1, var2, var3, var4);
   }

   Interface38 method8888(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class410_Sub1(this, var1, var2, var3, var4);
   }

   Interface38 method8931(Class144 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6, var7);
   }

   Interface38 method8799(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6);
   }

   public boolean method8870(boolean var1) {
      return var1?this.aBool11435:this.aBool11435 && this.aBool11434;
   }

   Interface44 method8791(int var1, boolean var2, int[][] var3) {
      return new Class410_Sub3(this, var1, var2, var3);
   }

   Interface37 method8937(Class144 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new Class410_Sub2(this, var1, var2, var3, var4, var5, var6);
   }

   Interface37 method8934(Class144 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new Class410_Sub2(this, var1, var2, var3, var4, var5, var6);
   }

   Interface43 method8789(Class144 var1, Class166 var2, int var3, int var4) {
      return new Class410_Sub1_Sub1(this, var1, var2, var3, var4);
   }

   public void method8821() {
      if(this.aBoolArray11464[this.anInt9787]) {
         this.aBoolArray11464[this.anInt9787] = false;
         IDirect3DDevice.SetTexture(this.aLong11450, this.anInt9787, 0L);
         this.method8804();
         this.method8803();
      }

   }

   public long method2420(int var1, int var2) {
      return this.method10505(var1, var2, (int[])null, (int[])null);
   }

   void method8738() {
      if(this.aBool9761) {
         float var1 = this.aBool9751?this.aFloat9823:0.0F;
         float var2 = this.aBool9751?-this.aFloat9763:0.0F;
         D3DLIGHT.SetDiffuse(this.aLong11441, var1 * this.aFloat9708, var1 * this.aFloat9771, var1 * this.aFloat9760, 0.0F);
         D3DLIGHT.SetDiffuse(this.aLong11463, var2 * this.aFloat9708, var2 * this.aFloat9771, var2 * this.aFloat9760, 0.0F);
         this.aBool11444 = false;
      }

   }

   final void method8851(int var1, Class370 var2, boolean var3, boolean var4) {
      if(this.aBool9761) {
         int var5 = 0;
         byte var6;
         switch(var1) {
         case 1:
            var6 = 3;
            break;
         case 2:
            var6 = 26;
            break;
         default:
            var6 = 2;
         }

         if(var3) {
            var5 |= 32;
         }

         if(var4) {
            var5 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, var6, method10518(var2) | var5);
      }

   }

   public void method8876(Class433 var1, Class433 var2, Class433 var3) {
      IDirect3DDevice.SetTransform(this.aLong11450, 256, var1.aFloatArray4841);
      IDirect3DDevice.SetTransform(this.aLong11450, 2, var2.aFloatArray4841);
      IDirect3DDevice.SetTransform(this.aLong11450, 3, var3.aFloatArray4841);
   }

   void method8916() {
      if(this.aBool9761) {
         D3DLIGHT.SetAmbient(this.aLong11441, this.aFloat9708 * this.aFloat9669, this.aFloat9771 * this.aFloat9669, this.aFloat9760 * this.aFloat9669, 0.0F);
         this.aBool11444 = false;
      }

   }

   final void method8942(int var1, Class370 var2, boolean var3) {
      if(this.aBool9761) {
         int var4 = 0;
         byte var5;
         switch(var1) {
         case 1:
            var5 = 6;
            break;
         case 2:
            var5 = 27;
            break;
         default:
            var5 = 5;
         }

         if(var3) {
            var4 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, var5, method10518(var2) | var4);
      }

   }

   final void method8947() {
      if(this.aBool9761) {
         IDirect3DDevice.SetRenderState(this.aLong11450, 60, this.anInt9813);
      }

   }

   final void method8943() {
      if(this.aBool9761) {
         IDirect3DDevice.SetRenderState(this.aLong11450, 60, this.anInt9813);
      }

   }

   void method8973() {
      if(this.aLong11458 == 0L && this.aClass363Array9774[this.anInt9787] != Class363.aClass363_3844) {
         if(this.aClass363Array9774[this.anInt9787] == Class363.aClass363_3840) {
            IDirect3DDevice.SetTransform(this.aLong11450, 16 + this.anInt9787, this.aClass433Array9773[this.anInt9787].method5113(this.aFloatArray11465));
         } else {
            IDirect3DDevice.SetTransform(this.aLong11450, 16 + this.anInt9787, this.aClass433Array9773[this.anInt9787].method5107(this.aFloatArray11465));
         }

         int var1 = method10513(this.aClass363Array9774[this.anInt9787]);
         if(var1 != this.anIntArray11445[this.anInt9787]) {
            IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 24, var1);
            this.anIntArray11445[this.anInt9787] = var1;
         }
      } else {
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 24, 0);
         this.anIntArray11445[this.anInt9787] = 0;
      }

   }

   final Interface42 method8805(boolean var1) {
      return new Class412(this, Class166.aClass166_1888, var1);
   }

   void method8949() {
      if(this.aLong11458 == 0L && this.aClass363Array9774[this.anInt9787] != Class363.aClass363_3844) {
         if(this.aClass363Array9774[this.anInt9787] == Class363.aClass363_3840) {
            IDirect3DDevice.SetTransform(this.aLong11450, 16 + this.anInt9787, this.aClass433Array9773[this.anInt9787].method5113(this.aFloatArray11465));
         } else {
            IDirect3DDevice.SetTransform(this.aLong11450, 16 + this.anInt9787, this.aClass433Array9773[this.anInt9787].method5107(this.aFloatArray11465));
         }

         int var1 = method10513(this.aClass363Array9774[this.anInt9787]);
         if(var1 != this.anIntArray11445[this.anInt9787]) {
            IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 24, var1);
            this.anIntArray11445[this.anInt9787] = var1;
         }
      } else {
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 24, 0);
         this.anIntArray11445[this.anInt9787] = 0;
      }

   }

   void method8804() {
      if(this.aBool9761) {
         int var1 = this.aBoolArray11464[this.anInt9787]?method10512(this.aClass372Array9776[this.anInt9787]):1;
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 4, var1);
      }

   }

   void method8951() {
   }

   void method8735() {
   }

   void method8840() {
      if(this.aBool9761) {
         D3DLIGHT.SetAmbient(this.aLong11441, this.aFloat9708 * this.aFloat9669, this.aFloat9771 * this.aFloat9669, this.aFloat9760 * this.aFloat9669, 0.0F);
         this.aBool11444 = false;
      }

   }

   void method8909() {
   }

   boolean method8923(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 3, method10502(var1, var2)));
   }

   Class184_Sub1 method2619(Canvas var1, int var2, int var3) {
      return new Class184_Sub1_Sub2_Sub1(this, var1, var2, var3, false);
   }

   void method8828() {
      if(this.aBool9761) {
         int var1 = this.aBoolArray11464[this.anInt9787]?method10512(this.aClass372Array9776[this.anInt9787]):1;
         IDirect3DDevice.SetTextureStageState(this.aLong11450, this.anInt9787, 4, var1);
      }

   }

   void method8777(int var1) {
      IDirect3DDevice.SetRenderState(this.aLong11450, 168, var1);
   }

   void method8785() {
      IDirect3DDevice.method9229(this.aLong11450, 15, this.aBool9816);
      IDirect3DDevice.SetRenderState(this.aLong11450, 24, this.aByte9824 & 255);
      if(this.aD3DPRESENT_PARAMETERS11437.MultiSampleType > 0) {
         if(this.aBool9816 && this.aByte9824 != 0) {
            if(this.aBool11453) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 181, method8750('\u0053', '\u0053', '\u0041', '\u0041'));
            } else if(this.aBool11462) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 181, method8750('\u0041', '\u0054', '\u004f', '\u0043'));
            } else if(this.aBool11460) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 154, method8750('\u0041', '\u0032', '\u004d', '\u0031'));
            }
         } else if(!this.aBool11453 && !this.aBool11462) {
            if(this.aBool11460) {
               IDirect3DDevice.method9228(this.aLong11450, 154, 1.0F);
            }
         } else {
            IDirect3DDevice.SetRenderState(this.aLong11450, 181, 0);
         }
      }

   }

   void method8843() {
      IDirect3DDevice.method9229(this.aLong11450, 15, this.aBool9816);
      IDirect3DDevice.SetRenderState(this.aLong11450, 24, this.aByte9824 & 255);
      if(this.aD3DPRESENT_PARAMETERS11437.MultiSampleType > 0) {
         if(this.aBool9816 && this.aByte9824 != 0) {
            if(this.aBool11453) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 181, method8750('\u0053', '\u0053', '\u0041', '\u0041'));
            } else if(this.aBool11462) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 181, method8750('\u0041', '\u0054', '\u004f', '\u0043'));
            } else if(this.aBool11460) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 154, method8750('\u0041', '\u0032', '\u004d', '\u0031'));
            }
         } else if(!this.aBool11453 && !this.aBool11462) {
            if(this.aBool11460) {
               IDirect3DDevice.method9228(this.aLong11450, 154, 1.0F);
            }
         } else {
            IDirect3DDevice.SetRenderState(this.aLong11450, 181, 0);
         }
      }

   }

   public void method2339() {
      if(this.aLong11470 != 0L) {
         IUnknown.Release(this.aLong11470);
         this.aLong11470 = 0L;
      }

      for(int var1 = 0; var1 < 3; ++var1) {
         if(this.aLongArray11454[var1] != 0L) {
            IUnknown.Release(this.aLongArray11454[var1]);
            this.aLongArray11454[var1] = 0L;
         }

         if(this.aLongArray11472[var1] != 0L) {
            IUnknown.Release(this.aLongArray11472[var1]);
            this.aLongArray11472[var1] = 0L;
         }
      }

      this.anInt11475 = 0;
      this.anInt11474 = 0;
   }

   void method8988(int var1) {
      if(!this.aBool11433) {
         int var2 = (var1 & 2) != 0?2:3;
         IDirect3DDevice.SetRenderState(this.aLong11450, 8, var2);
      }

   }

   void method8959() {
      IDirect3DDevice.method9229(this.aLong11450, 27, this.aBool9778);
   }

   void method8774() {
      this.aFloat9677 = this.aFloat9731 - (float)this.anInt9809;
      this.aFloat9810 = this.aFloat9677 - (float)this.anInt9675;
      if(this.aFloat9810 < this.aFloat9730) {
         this.aFloat9810 = this.aFloat9730;
      }

      if(this.aBool9761) {
         IDirect3DDevice.method9228(this.aLong11450, 36, this.aFloat9810);
         IDirect3DDevice.method9228(this.aLong11450, 37, this.aFloat9677);
         IDirect3DDevice.SetRenderState(this.aLong11450, 34, this.anInt9722);
      }

   }

   void method8960() {
      this.aFloat9677 = this.aFloat9731 - (float)this.anInt9809;
      this.aFloat9810 = this.aFloat9677 - (float)this.anInt9675;
      if(this.aFloat9810 < this.aFloat9730) {
         this.aFloat9810 = this.aFloat9730;
      }

      if(this.aBool9761) {
         IDirect3DDevice.method9228(this.aLong11450, 36, this.aFloat9810);
         IDirect3DDevice.method9228(this.aLong11450, 37, this.aFloat9677);
         IDirect3DDevice.SetRenderState(this.aLong11450, 34, this.anInt9722);
      }

   }

   void method8961() {
      if(this.aBool9761) {
         IDirect3DDevice.method9229(this.aLong11450, 28, this.aBool9806 && this.aBool9805 && this.anInt9675 >= 0);
      }

   }

   void method8806(boolean var1) {
      IDirect3DDevice.method9229(this.aLong11450, 161, var1);
   }

   void method8962(boolean var1) {
      IDirect3DDevice.method9229(this.aLong11450, 161, var1);
   }

   void method8963(boolean var1) {
      IDirect3DDevice.method9229(this.aLong11450, 161, var1);
   }

   final Interface42 method8964(boolean var1) {
      return new Class412(this, Class166.aClass166_1888, var1);
   }

   final Interface35 method8966(boolean var1) {
      return new Class421(this, var1);
   }

   final Interface35 method8967(boolean var1) {
      return new Class421(this, var1);
   }

   final Interface35 method8849(boolean var1) {
      return new Class421(this, var1);
   }

   Class335 method8968(Class359[] var1) {
      return new Class335_Sub1(this, var1);
   }

   public void method8969(Class335 var1) {
      Class335_Sub1 var2 = (Class335_Sub1)var1;
      IDirect3DDevice.SetVertexDeclaration(this.aLong11450, var2.aLong10123);
   }

   public void method8970(Class335 var1) {
      Class335_Sub1 var2 = (Class335_Sub1)var1;
      IDirect3DDevice.SetVertexDeclaration(this.aLong11450, var2.aLong10123);
   }

   void method2233() {
      super.method2233();
      if(this.aLong11441 != 0L) {
         D3DLIGHT.Destroy(this.aLong11441);
         this.aLong11441 = 0L;
      }

      if(this.aLong11463 != 0L) {
         D3DLIGHT.Destroy(this.aLong11463);
         this.aLong11463 = 0L;
      }

      if(this.aLong11443 != 0L) {
         D3DLIGHT.Destroy(this.aLong11443);
         this.aLong11443 = 0L;
      }

      if(this.aLong11450 != 0L) {
         IDirect3DDevice.Destroy(this.aLong11450);
         this.aLong11450 = 0L;
      }

      if(this.aLong11461 != 0L) {
         IUnknown.Release(this.aLong11461);
         this.aLong11461 = 0L;
      }

   }

   public void method8741(int var1, Interface35 var2) {
      Class421 var3 = (Class421)var2;
      IDirect3DDevice.SetStreamSource(this.aLong11450, var1, var3.aLong4723, 0, var3.method4991());
   }

   void method2363(int var1, int var2) throws Exception_Sub4 {
      if(this.aBool11440) {
         if(!this.method10503(this.aClass184_Sub1_2026.method2691(), this.aClass184_Sub1_2026.method2693())) {
            return;
         }

         ((Class184_Sub1_Sub2_Sub1)this.aClass184_Sub1_2026).method365();
      } else {
         IDirect3DDevice.EndScene(this.aLong11450);
      }

      int var3 = this.aClass184_Sub1_2026.method8451();
      if(Class367.method4651(var3)) {
         this.aBool11440 = true;
         this.aClass184_Sub1_2026.method140();
      } else {
         IDirect3DDevice.BeginScene(this.aLong11450);
         if(this.anInterface24_2034 != null) {
            this.anInterface24_2034.method150((byte)1);
         }

      }
   }

   final void method8976(Interface42 var1, Class374 var2, int var3, int var4, int var5, int var6) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawIndexedPrimitiveIB(this.aLong11450, ((Class412)var1).aLong4435, 4, 0, var3, var4, var5, var6);
   }

   public Interface21 method2258(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return new Class419(this, var3, var4, var1, var2, var5);
   }

   public void method2426(long var1) {
   }

   public final void method8925(Class374 var1, int var2, int var3, int var4, int var5) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawIndexedPrimitive(this.aLong11450, method10515(var1), 0, var2, var3, var4, var5);
   }

   public Class184_Sub2 method2346() {
      return new Class184_Sub2_Sub1_Sub2(this);
   }

   public Class184_Sub2 method2467() {
      return new Class184_Sub2_Sub1_Sub2(this);
   }

   public boolean method8898() {
      return (this.aD3DCAPS11468.VertexShaderVersion & '\uffff') >= 257;
   }

   boolean method8927(Class144 var1, Class166 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return Class367.method4652(IDirect3D.GetAdapterDisplayMode(this.aLong11461, this.anInt11436, var3)) && Class367.method4652(IDirect3D.CheckDeviceFormat(this.aLong11461, this.anInt11436, this.anInt11447, var3.Format, 0, 4, method10502(var1, var2)));
   }

   public void method2398() {
   }

   final Interface42 method8965(boolean var1) {
      return new Class412(this, Class166.aClass166_1888, var1);
   }

   void method8772() {
      IDirect3DDevice.method9229(this.aLong11450, 174, this.aBool9686);
   }

   void method8982() {
      IDirect3DDevice.method9229(this.aLong11450, 174, this.aBool9686);
   }

   Interface38 method8985(Class144 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6, var7);
   }

   public final synchronized void method2564(int var1) {
      for(int var2 = 0; var2 < this.anInt11467; ++var2) {
         IUnknown.Release(this.aLongArray11459[var2]);
      }

      this.anInt11467 = 0;
      super.method2234(var1);
   }

   void method8729() {
      for(int var1 = 0; var1 < this.anInt9683; ++var1) {
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 7, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 6, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 5, 2);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 1, 1);
         IDirect3DDevice.SetSamplerState(this.aLong11450, var1, 2, 1);
         this.aClass341Array11477[var1] = Class341.aClass341_3541;
         boolean[] var2 = this.aBoolArray11449;
         this.aBoolArray11446[var1] = true;
         var2[var1] = true;
         this.aBoolArray11448[var1] = false;
         this.anIntArray11445[var1] = 0;
      }

      IDirect3DDevice.SetTextureStageState(this.aLong11450, 0, 6, 1);
      IDirect3DDevice.SetRenderState(this.aLong11450, 9, 2);
      IDirect3DDevice.SetRenderState(this.aLong11450, 23, 4);
      IDirect3DDevice.SetRenderState(this.aLong11450, 25, 5);
      IDirect3DDevice.SetRenderState(this.aLong11450, 24, 0);
      IDirect3DDevice.method9229(this.aLong11450, 206, this.aBool9834);
      IDirect3DDevice.SetRenderState(this.aLong11450, 181, 0);
      this.method10514();
      IDirect3DDevice.SetRenderState(this.aLong11450, 147, 1);
      IDirect3DDevice.SetRenderState(this.aLong11450, 145, 1);
      IDirect3DDevice.method9228(this.aLong11450, 38, 0.95F);
      IDirect3DDevice.SetRenderState(this.aLong11450, 35, 3);
      IDirect3DDevice.method9228(this.aLong11450, 154, 1.0F);
      D3DLIGHT.SetType(this.aLong11441, 3);
      D3DLIGHT.SetType(this.aLong11463, 3);
      D3DLIGHT.SetType(this.aLong11443, 1);
      this.aBool11444 = false;
      super.method8729();
   }

   Interface38 method8983(Class144 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class410_Sub1(this, var1, var2, var3, var4, var5, var6, var7);
   }

   void method8811() {
      IDirect3DDevice.method9229(this.aLong11450, 15, this.aBool9816);
      IDirect3DDevice.SetRenderState(this.aLong11450, 24, this.aByte9824 & 255);
      if(this.aD3DPRESENT_PARAMETERS11437.MultiSampleType > 0) {
         if(this.aBool9816 && this.aByte9824 != 0) {
            if(this.aBool11453) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 181, method8750('\u0053', '\u0053', '\u0041', '\u0041'));
            } else if(this.aBool11462) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 181, method8750('\u0041', '\u0054', '\u004f', '\u0043'));
            } else if(this.aBool11460) {
               IDirect3DDevice.SetRenderState(this.aLong11450, 154, method8750('\u0041', '\u0032', '\u004d', '\u0031'));
            }
         } else if(!this.aBool11453 && !this.aBool11462) {
            if(this.aBool11460) {
               IDirect3DDevice.method9228(this.aLong11450, 154, 1.0F);
            }
         } else {
            IDirect3DDevice.SetRenderState(this.aLong11450, 181, 0);
         }
      }

   }

   void method8915() {
      if(this.aBool9761) {
         D3DLIGHT.SetAmbient(this.aLong11441, this.aFloat9708 * this.aFloat9669, this.aFloat9771 * this.aFloat9669, this.aFloat9760 * this.aFloat9669, 0.0F);
         this.aBool11444 = false;
      }

   }

   public boolean method2401() {
      return true;
   }

   void method8987(Interface42 var1) {
      IDirect3DDevice.SetIndices(this.aLong11450, ((Class412)var1).aLong4435);
   }

   public final void method8783(Class374 var1, int var2, int var3, int var4, int var5) {
      if(this.aClass276_Sub1_11452 != null) {
         this.aClass276_Sub1_11452.method9066();
      }

      IDirect3DDevice.DrawIndexedPrimitive(this.aLong11450, method10515(var1), 0, var2, var3, var4, var5);
   }

   public void method8971(Class335 var1) {
      Class335_Sub1 var2 = (Class335_Sub1)var1;
      IDirect3DDevice.SetVertexDeclaration(this.aLong11450, var2.aLong10123);
   }

   void method8986(Interface42 var1) {
      IDirect3DDevice.SetIndices(this.aLong11450, ((Class412)var1).aLong4435);
   }

   public Class184_Sub2 method2257() {
      return new Class184_Sub2_Sub1_Sub2(this);
   }

   void method8813() {
      IDirect3DDevice.method9229(this.aLong11450, 27, this.aBool9778);
   }

   public void method8761(Class433 var1) {
      var1.method5085(this.aClass433_11451);
   }

   public void method2609() {
      if(this.aLong11470 != 0L) {
         IUnknown.Release(this.aLong11470);
         this.aLong11470 = 0L;
      }

      for(int var1 = 0; var1 < 3; ++var1) {
         if(this.aLongArray11454[var1] != 0L) {
            IUnknown.Release(this.aLongArray11454[var1]);
            this.aLongArray11454[var1] = 0L;
         }

         if(this.aLongArray11472[var1] != 0L) {
            IUnknown.Release(this.aLongArray11472[var1]);
            this.aLongArray11472[var1] = 0L;
         }
      }

      this.anInt11475 = 0;
      this.anInt11474 = 0;
   }

   void method8778() {
      if(this.aBool9761) {
         D3DLIGHT.SetDirection(this.aLong11441, -this.aFloatArray9777[0], -this.aFloatArray9777[1], -this.aFloatArray9777[2]);
         D3DLIGHT.SetDirection(this.aLong11463, -this.aFloatArray9701[0], -this.aFloatArray9701[1], -this.aFloatArray9701[2]);
         this.aBool11444 = false;
      }

   }

   Class184_Sub1 method2286(Canvas var1, int var2, int var3) {
      return new Class184_Sub1_Sub2_Sub1(this, var1, var2, var3, false);
   }

   LinkableObject method10520(Interface52 var1) {
      for(LinkableObject var2 = (LinkableObject)this.aClass702_11439.method8206((byte)61); var2 != null; var2 = (LinkableObject)this.aClass702_11439.method8181(-4292470)) {
         if(var2.anObject10399 == var1) {
            return var2;
         }
      }

      return null;
   }

   public void method8991(Class433 var1) {
      var1.method5085(this.aClass433_11451);
   }

   void method8989(int var1) {
      if(!this.aBool11433) {
         int var2 = (var1 & 2) != 0?2:3;
         IDirect3DDevice.SetRenderState(this.aLong11450, 8, var2);
      }

   }

   public Class178 method2562(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return var3 < 0.5F?var1:var2;
   }

   void method8717(int var1) {
      if(!this.aBool11433) {
         int var2 = (var1 & 2) != 0?2:3;
         IDirect3DDevice.SetRenderState(this.aLong11450, 8, var2);
      }

   }

   byte[] method10521(String var1) {
      return this.method8861("dx", var1);
   }
}
