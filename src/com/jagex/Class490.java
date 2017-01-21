package com.jagex;

import com.jagex.Class169;
import com.jagex.Class174;
import com.jagex.Class174_Sub3;
import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class319;
import com.jagex.Class466;
import com.jagex.Class520;
import com.jagex.Interface24;
import com.jagex.Interface46;
import com.jagex.Interface47;
import com.jagex.Interface49;
import jaggl.OpenGL;
import java.awt.Canvas;

public class Class490 {
   public static Class174 method5870(Canvas var0, Class169 var1, Interface24 var2, Interface47 var3, Interface49 var4, Interface46 var5, Class466 var6, int var7) {
      try {
         Class174_Sub3.method8718();
         Class520.method6248(-372973635).method403("jaggl", (byte)35);
         Class319.method4128(var0, 1679015421);
         OpenGL var8 = new OpenGL();
         long var9 = var8.init(var0, 8, 8, 8, 24, 0, var7);
         if(var9 == 0L) {
            throw new RuntimeException("");
         } else {
            Class174_Sub3_Sub2 var11 = new Class174_Sub3_Sub2(var8, var0, var9, var1, var2, var3, var4, var5, var6, var7);
            var11.method8728();
            return var11;
         }
      } catch (RuntimeException var12) {
         throw var12;
      } catch (Throwable var13) {
         throw new RuntimeException("");
      }
   }

   public static Class174 method5871(Canvas var0, Class169 var1, Interface24 var2, Interface47 var3, Interface49 var4, Interface46 var5, Class466 var6, int var7) {
      try {
         Class174_Sub3.method8718();
         Class520.method6248(790307926).method403("jaggl", (byte)73);
         Class319.method4128(var0, 1918372963);
         OpenGL var8 = new OpenGL();
         long var9 = var8.init(var0, 8, 8, 8, 24, 0, var7);
         if(var9 == 0L) {
            throw new RuntimeException("");
         } else {
            Class174_Sub3_Sub2 var11 = new Class174_Sub3_Sub2(var8, var0, var9, var1, var2, var3, var4, var5, var6, var7);
            var11.method8728();
            return var11;
         }
      } catch (RuntimeException var12) {
         throw var12;
      } catch (Throwable var13) {
         throw new RuntimeException("");
      }
   }

   Class490() throws Throwable {
      throw new Error();
   }
}
