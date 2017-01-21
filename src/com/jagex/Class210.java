package com.jagex;

import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class317;
import com.jagex.RSByteBuffer;
import com.jagex.Class541;
import com.jagex.Class681;
import com.jagex.Exception_Sub1;
import com.jagex.Interface26;

public class Class210 implements Interface26 {
   static String aString2258;
   public static int anInt2259;
   // $FF: synthetic field
   Class232 this$0;
   int anInt2257;
   int anInt2256;

   Class210(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      int var3 = var2.readUnsignedShort(1694351840);
      if(var3 != '\uffff') {
         this.anInt2257 = var3 * 819166881;
         this.anInt2256 = var2.readInt((byte)5) * -1738409401;
      } else {
         this.anInt2257 = -819166881;
         this.anInt2256 = 0;
      }

   }

   public void method168(Class223 var1, byte var2) {
      if(993518945 * this.anInt2257 != -1) {
         try {
            var1.method3112(-2062819036).method129((Class317)this.this$0.anInterface28_2365.method180(-1114130082).method89(993518945 * this.anInt2257, 54652471), 799117175 * this.anInt2256, 697035061);
         } catch (Exception_Sub1 var4) {
            ;
         }
      }

   }

   public void method166(Class223 var1) {
      if(993518945 * this.anInt2257 != -1) {
         try {
            var1.method3112(-1147286261).method129((Class317)this.this$0.anInterface28_2365.method180(29223386).method89(993518945 * this.anInt2257, -1116704940), 799117175 * this.anInt2256, -227784077);
         } catch (Exception_Sub1 var3) {
            ;
         }
      }

   }

   public void method167(Class223 var1) {
      if(993518945 * this.anInt2257 != -1) {
         try {
            var1.method3112(-485067543).method129((Class317)this.this$0.anInterface28_2365.method180(14040810).method89(993518945 * this.anInt2257, -1510081117), 799117175 * this.anInt2256, 804395084);
         } catch (Exception_Sub1 var3) {
            ;
         }
      }

   }

   public void method165(Class223 var1) {
      if(993518945 * this.anInt2257 != -1) {
         try {
            var1.method3112(-688515456).method129((Class317)this.this$0.anInterface28_2365.method180(-1217020281).method89(993518945 * this.anInt2257, -1453133800), 799117175 * this.anInt2256, 1700070992);
         } catch (Exception_Sub1 var3) {
            ;
         }
      }

   }

   public void method169(Class223 var1) {
      if(993518945 * this.anInt2257 != -1) {
         try {
            var1.method3112(-956221766).method129((Class317)this.this$0.anInterface28_2365.method180(-423204585).method89(993518945 * this.anInt2257, -985885210), 799117175 * this.anInt2256, 1014991457);
         } catch (Exception_Sub1 var3) {
            ;
         }
      }

   }

   static final void method2939(Class681 var0, int var1) {
      Class541 var2 = var0.aClass639_Sub1_Sub2_Sub1_8635.method10790((byte)-83);
      if(null == var2) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.method6459((byte)17);
      }

   }
}
