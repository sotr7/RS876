package com.jagex;

import com.jagex.Class20;
import com.jagex.Class222;
import com.jagex.Class526_Sub21_Sub16;
import com.jagex.Class526_Sub21_Sub16_Sub1;
import com.jagex.Class526_Sub21_Sub16_Sub2;
import com.jagex.Class696;
import com.jagex.Interface71;

public class Class597 {
   int anInt7854;
   Class696 aClass696_7857 = new Class696();
   int anInt7855;
   Class20 aClass20_7856;

   final void method7061(Interface71 var1) {
      long var2 = var1.method489();

      for(Class526_Sub21_Sub16 var4 = (Class526_Sub21_Sub16)this.aClass20_7856.get(var2); var4 != null; var4 = (Class526_Sub21_Sub16)this.aClass20_7856.method635(-1734407897)) {
         if(var4.anInterface71_11832.method488(var1)) {
            this.method7063(var4);
            break;
         }
      }

   }

   public final void method7062(Object var1, Interface71 var2) {
      this.method7065(var1, var2, 1);
   }

   final void method7063(Class526_Sub21_Sub16 var1) {
      if(var1 != null) {
         var1.method6332(-1949449864);
         var1.uncache(-694993862);
         this.anInt7854 += var1.anInt11831;
      }

   }

   public final Object method7064(Interface71 var1) {
      long var2 = var1.method489();

      for(Class526_Sub21_Sub16 var4 = (Class526_Sub21_Sub16)this.aClass20_7856.get(var2); var4 != null; var4 = (Class526_Sub21_Sub16)this.aClass20_7856.method635(-1734407897)) {
         if(var4.anInterface71_11832.method488(var1)) {
            Object var5 = var4.method10709();
            if(var5 != null) {
               if(var4.method10712()) {
                  Class526_Sub21_Sub16_Sub2 var6 = new Class526_Sub21_Sub16_Sub2(var1, var5, var4.anInt11831);
                  this.aClass20_7856.put(var6, var4.aLong7156 * -6805155999452426801L);
                  this.aClass696_7857.offer(var6, (byte)-55);
                  var6.cachedKey = 0L;
                  var4.method6332(-1949449864);
                  var4.uncache(-122802826);
               } else {
                  this.aClass696_7857.offer(var4, (byte)-118);
                  var4.cachedKey = 0L;
               }

               return var5;
            }

            var4.method6332(-1949449864);
            var4.uncache(-1007774428);
            this.anInt7854 += var4.anInt11831;
         }
      }

      return null;
   }

   final void method7065(Object var1, Interface71 var2, int var3) {
      if(var3 > this.anInt7855) {
         throw new IllegalStateException();
      } else {
         this.method7061(var2);
         this.anInt7854 -= var3;

         while(this.anInt7854 < 0) {
            Class526_Sub21_Sub16 var4 = (Class526_Sub21_Sub16)this.aClass696_7857.poll(1799727216);
            this.method7063(var4);
         }

         Class526_Sub21_Sub16_Sub2 var5 = new Class526_Sub21_Sub16_Sub2(var2, var1, var3);
         this.aClass20_7856.put(var5, var2.method489());
         this.aClass696_7857.offer(var5, (byte)-124);
         var5.cachedKey = 0L;
      }
   }

   public final void method7066(int var1) {
      for(Class526_Sub21_Sub16 var2 = (Class526_Sub21_Sub16)this.aClass696_7857.method8143((byte)-1); var2 != null; var2 = (Class526_Sub21_Sub16)this.aClass696_7857.method8139(68831625)) {
         if(var2.method10712()) {
            if(var2.method10709() == null) {
               var2.method6332(-1949449864);
               var2.uncache(81561593);
               this.anInt7854 += var2.anInt11831;
            }
         } else if((var2.cachedKey += -6405544204082582527L) * 2384869564219888641L > (long)var1) {
            Class526_Sub21_Sub16_Sub1 var3 = new Class526_Sub21_Sub16_Sub1(var2.anInterface71_11832, var2.method10709(), var2.anInt11831);
            this.aClass20_7856.put(var3, var2.aLong7156 * -6805155999452426801L);
            Class222.method3096(var3, var2, (byte)35);
            var2.method6332(-1949449864);
            var2.uncache(-540955686);
         }
      }

   }

   public final void method7067() {
      this.aClass696_7857.method8135((byte)-13);
      this.aClass20_7856.method647(929030154);
      this.anInt7854 = this.anInt7855;
   }

   public Class597(int var1) {
      this.anInt7855 = var1;
      this.anInt7854 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.aClass20_7856 = new Class20(var2);
   }

   public final void method7068() {
      for(Class526_Sub21_Sub16 var1 = (Class526_Sub21_Sub16)this.aClass696_7857.method8143((byte)-1); var1 != null; var1 = (Class526_Sub21_Sub16)this.aClass696_7857.method8139(68831625)) {
         if(var1.method10712()) {
            var1.method6332(-1949449864);
            var1.uncache(999650049);
            this.anInt7854 += var1.anInt11831;
         }
      }

   }

   public final void method7069(int var1) {
      for(Class526_Sub21_Sub16 var2 = (Class526_Sub21_Sub16)this.aClass696_7857.method8143((byte)-1); var2 != null; var2 = (Class526_Sub21_Sub16)this.aClass696_7857.method8139(68831625)) {
         if(var2.method10712()) {
            if(var2.method10709() == null) {
               var2.method6332(-1949449864);
               var2.uncache(688173356);
               this.anInt7854 += var2.anInt11831;
            }
         } else if((var2.cachedKey += -6405544204082582527L) * 2384869564219888641L > (long)var1) {
            Class526_Sub21_Sub16_Sub1 var3 = new Class526_Sub21_Sub16_Sub1(var2.anInterface71_11832, var2.method10709(), var2.anInt11831);
            this.aClass20_7856.put(var3, var2.aLong7156 * -6805155999452426801L);
            Class222.method3096(var3, var2, (byte)126);
            var2.method6332(-1949449864);
            var2.uncache(1781641819);
         }
      }

   }

   public final void method7070(int var1) {
      for(Class526_Sub21_Sub16 var2 = (Class526_Sub21_Sub16)this.aClass696_7857.method8143((byte)-1); var2 != null; var2 = (Class526_Sub21_Sub16)this.aClass696_7857.method8139(68831625)) {
         if(var2.method10712()) {
            if(var2.method10709() == null) {
               var2.method6332(-1949449864);
               var2.uncache(-1130537472);
               this.anInt7854 += var2.anInt11831;
            }
         } else if((var2.cachedKey += -6405544204082582527L) * 2384869564219888641L > (long)var1) {
            Class526_Sub21_Sub16_Sub1 var3 = new Class526_Sub21_Sub16_Sub1(var2.anInterface71_11832, var2.method10709(), var2.anInt11831);
            this.aClass20_7856.put(var3, var2.aLong7156 * -6805155999452426801L);
            Class222.method3096(var3, var2, (byte)113);
            var2.method6332(-1949449864);
            var2.uncache(1523924128);
         }
      }

   }

   public final void method7071(int var1) {
      for(Class526_Sub21_Sub16 var2 = (Class526_Sub21_Sub16)this.aClass696_7857.method8143((byte)-1); var2 != null; var2 = (Class526_Sub21_Sub16)this.aClass696_7857.method8139(68831625)) {
         if(var2.method10712()) {
            if(var2.method10709() == null) {
               var2.method6332(-1949449864);
               var2.uncache(-892449324);
               this.anInt7854 += var2.anInt11831;
            }
         } else if((var2.cachedKey += -6405544204082582527L) * 2384869564219888641L > (long)var1) {
            Class526_Sub21_Sub16_Sub1 var3 = new Class526_Sub21_Sub16_Sub1(var2.anInterface71_11832, var2.method10709(), var2.anInt11831);
            this.aClass20_7856.put(var3, var2.aLong7156 * -6805155999452426801L);
            Class222.method3096(var3, var2, (byte)68);
            var2.method6332(-1949449864);
            var2.uncache(296885976);
         }
      }

   }
}
