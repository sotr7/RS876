package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class261;
import com.jagex.Class476;
import com.jagex.Class55;
import com.jagex.Class604;
import com.jagex.Class612;
import com.jagex.Class679;
import com.jagex.Class681;

public class Class612_Sub1 extends Class612 {
   public String aString10813;
   public int anInt10815;
   public String aString10816;
   int anInt10817;
   String aString10818;
   public int anInt10814 = 1607016147;

   Class604 method9792(int var1) {
      return Class55.aClass604Array672[196310085 * this.anInt8021];
   }

   public String method9793() {
      return this.anInt10817 * 619103275 != 0?this.aString10818:this.method9792(1444176285).aString7892;
   }

   public int method9794(int var1) {
      return 0 != this.anInt10817 * 619103275?this.anInt10817 * 619103275:this.method9792(1444176285).anInt7893 * -1495706367;
   }

   public String method9795(int var1) {
      return this.anInt10817 * 619103275 != 0?this.aString10818:this.method9792(1444176285).aString7892;
   }

   public int method9796() {
      return 0 != this.anInt10817 * 619103275?this.anInt10817 * 619103275:this.method9792(1444176285).anInt7893 * -1495706367;
   }

   public int method9797() {
      return 0 != this.anInt10817 * 619103275?this.anInt10817 * 619103275:this.method9792(1444176285).anInt7893 * -1495706367;
   }

   public String method9798() {
      return this.anInt10817 * 619103275 != 0?this.aString10818:this.method9792(1444176285).aString7892;
   }

   static int method9799(Class612_Sub1 var0, Class612_Sub1 var1, int var2, boolean var3, int var4) {
      int var5;
      int var6;
      if(var2 == 1) {
         var5 = var0.anInt8027 * 285278699;
         var6 = var1.anInt8027 * 285278699;
         if(!var3) {
            if(var5 == -1) {
               var5 = 2001;
            }

            if(var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else if(2 == var2) {
         return Class476.method5660(var0.method9795(-101484739), var1.method9795(-101484739), Class26.aClass673_247, -2131406285);
      } else if(3 == var2) {
         return var0.aString10816.equals("-")?(var1.aString10816.equals("-")?0:(var3?-1:1)):(var1.aString10816.equals("-")?(var3?1:-1):Class476.method5660(var0.aString10816, var1.aString10816, Class26.aClass673_247, -997981549));
      } else if(var2 == 4) {
         return var0.method7219((short)-3631)?(var1.method7219((short)-25324)?0:1):(var1.method7219((short)-19643)?-1:0);
      } else if(var2 == 5) {
         return var0.method7218((byte)-99)?(var1.method7218((byte)-24)?0:1):(var1.method7218((byte)-122)?-1:0);
      } else if(var2 == 6) {
         return var0.method7217(-979040014)?(var1.method7217(-979040014)?0:1):(var1.method7217(-979040014)?-1:0);
      } else if(var2 == 7) {
         return var0.method7226((byte)84)?(var1.method7226((byte)37)?0:1):(var1.method7226((byte)69)?-1:0);
      } else if(var2 == 8) {
         var5 = -2134698331 * var0.anInt10814;
         var6 = -2134698331 * var1.anInt10814;
         if(var3) {
            if(var5 == 1000) {
               var5 = -1;
            }

            if(1000 == var6) {
               var6 = -1;
            }
         } else {
            if(var5 == -1) {
               var5 = 1000;
            }

            if(-1 == var6) {
               var6 = 1000;
            }
         }

         return var5 - var6;
      } else {
         return var0.anInt10815 * 1896291335 - var1.anInt10815 * 1896291335;
      }
   }

   static final void method9800(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class261.method3536(var3, var4, var0, (byte)67);
   }
}
