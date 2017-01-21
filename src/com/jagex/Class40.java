package com.jagex;

import com.jagex.Class107;
import com.jagex.Class19;
import com.jagex.Class192;
import com.jagex.Class195;
import com.jagex.Class20;
import com.jagex.Class200;
import com.jagex.Class210;
import com.jagex.Class227;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class312;
import com.jagex.Class318_Sub2;
import com.jagex.Class32;
import com.jagex.Class327;
import com.jagex.Class331;
import com.jagex.Class42;
import com.jagex.Class439;
import com.jagex.Class451;
import com.jagex.Class456;
import com.jagex.Class458;
import com.jagex.Class466;
import com.jagex.Class474;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub38;
import com.jagex.Class526_Sub5;
import com.jagex.Class549;
import com.jagex.Class583;
import com.jagex.Class623;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class642;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class679;
import com.jagex.Class68;
import com.jagex.Class681;
import com.jagex.Class710;
import com.jagex.Class9_Sub1;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface7;
import com.jagex.client;
import java.util.Iterator;

public class Class40 implements Interface14 {
   Class466 aClass466_449;
   Class642 aClass642_445;
   protected Interface7 anInterface7_446;
   public int anInt447;
   Class192 aClass192_448;

   public void method862(int var1) {
      Class192 var2 = this.aClass192_448;
      synchronized(var2) {
         this.aClass192_448.method2772(-1585582968);
      }
   }

   Interface12 method863(int var1, int var2) {
      Class466 var3 = this.aClass466_449;
      byte[] var4;
      synchronized(var3) {
         var4 = Class456.method5409(this.aClass466_449, this.aClass642_445, var1, -994474678);
      }

      Interface12 var7 = this.anInterface7_446.method64(var1, this, -435085044);
      if(null != var4) {
         var7.method82(new RSByteBuffer(var4), -595267770);
      }

      var7.method81(1946881242);
      return var7;
   }

   public int method90() {
      return 483728625 * this.anInt447;
   }

   public int method87(int var1) {
      return 483728625 * this.anInt447;
   }

   public void method864(byte var1) {
      Class192 var2 = this.aClass192_448;
      synchronized(var2) {
         this.aClass192_448.method2770(1503734245);
      }
   }

   public Class40(Class676 var1, Class673 var2, Class466 var3, Class642 var4, int var5, Interface7 var6) {
      this.aClass466_449 = var3;
      this.aClass642_445 = var4;
      this.anInterface7_446 = var6;
      this.anInt447 = Class318_Sub2.method9086(this.aClass466_449, this.aClass642_445, -835071695) * 905597969;
      this.aClass192_448 = new Class192(var5);
   }

   public Iterator iterator() {
      return new Class42(this);
   }

   public Interface12 method88(int var1) {
      Class192 var2 = this.aClass192_448;
      Interface12 var3;
      synchronized(var2) {
         var3 = (Interface12)this.aClass192_448.method2765((long)var1);
      }

      if(var3 != null) {
         return var3;
      } else {
         var3 = this.method863(var1, -1874208291);
         var2 = this.aClass192_448;
         synchronized(var2) {
            this.aClass192_448.method2768(var3, (long)var1);
            return var3;
         }
      }
   }

   public void method865() {
      Class192 var1 = this.aClass192_448;
      synchronized(var1) {
         this.aClass192_448.method2770(658142023);
      }
   }

   public void method866(int var1) {
      Class192 var2 = this.aClass192_448;
      synchronized(var2) {
         this.aClass192_448.method2769(var1, (byte)-98);
      }
   }

   public void method867(int var1) {
      Class192 var2 = this.aClass192_448;
      synchronized(var2) {
         this.aClass192_448.method2769(var1, (byte)-103);
      }
   }

   public void method868() {
      Class192 var1 = this.aClass192_448;
      synchronized(var1) {
         this.aClass192_448.method2770(2034745170);
      }
   }

   public void method869() {
      Class192 var1 = this.aClass192_448;
      synchronized(var1) {
         this.aClass192_448.method2770(1321959369);
      }
   }

   public Interface12 method86(int var1) {
      Class192 var2 = this.aClass192_448;
      Interface12 var3;
      synchronized(var2) {
         var3 = (Interface12)this.aClass192_448.method2765((long)var1);
      }

      if(var3 != null) {
         return var3;
      } else {
         var3 = this.method863(var1, -2082555869);
         var2 = this.aClass192_448;
         synchronized(var2) {
            this.aClass192_448.method2768(var3, (long)var1);
            return var3;
         }
      }
   }

   public void method870(int var1, short var2) {
      Class192 var3 = this.aClass192_448;
      synchronized(var3) {
         this.aClass192_448.method2769(var1, (byte)-106);
      }
   }

   public void method871(int var1) {
      Class192 var2 = this.aClass192_448;
      synchronized(var2) {
         this.aClass192_448.method2769(var1, (byte)-18);
      }
   }

   public void method872(int var1) {
      Class192 var2 = this.aClass192_448;
      synchronized(var2) {
         this.aClass192_448.method2769(var1, (byte)-49);
      }
   }

   public void method873() {
      Class192 var1 = this.aClass192_448;
      synchronized(var1) {
         this.aClass192_448.method2772(1817770278);
      }
   }

   public void method874() {
      Class192 var1 = this.aClass192_448;
      synchronized(var1) {
         this.aClass192_448.method2772(1252143185);
      }
   }

   public void method875() {
      Class192 var1 = this.aClass192_448;
      synchronized(var1) {
         this.aClass192_448.method2772(1716428765);
      }
   }

   public void method876(int var1, byte var2) {
      Class192 var3 = this.aClass192_448;
      synchronized(var3) {
         this.aClass192_448.method2770(1483372428);
         this.aClass192_448 = new Class192(var1);
      }
   }

   public Iterator method877() {
      return new Class42(this);
   }

   public Iterator method878() {
      return new Class42(this);
   }

   public void method879() {
      Class192 var1 = this.aClass192_448;
      synchronized(var1) {
         this.aClass192_448.method2772(2109859083);
      }
   }

   public Interface12 method89(int var1, int var2) {
      Class192 var3 = this.aClass192_448;
      Interface12 var4;
      synchronized(var3) {
         var4 = (Interface12)this.aClass192_448.method2765((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         var4 = this.method863(var1, -2121310069);
         var3 = this.aClass192_448;
         synchronized(var3) {
            this.aClass192_448.method2768(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method880(int var1) {
      Class192 var2 = this.aClass192_448;
      synchronized(var2) {
         this.aClass192_448.method2770(513553700);
         this.aClass192_448 = new Class192(var1);
      }
   }

   public static void method881(boolean var0, int var1) {
      if(var0) {
         if(client.anInt11186 * -327748687 != -1) {
            Class312.method4073(-327748687 * client.anInt11186, (byte)-30);
         }

         for(Class526_Sub38 var2 = (Class526_Sub38)client.aClass20_11187.method638(619132773); var2 != null; var2 = (Class526_Sub38)client.aClass20_11187.method639(516718849)) {
            if(!var2.method6330((byte)22)) {
               var2 = (Class526_Sub38)client.aClass20_11187.method638(-1906312787);
               if(null == var2) {
                  break;
               }
            }

            Class710.method8307(var2, true, false, (byte)-4);
         }

         client.anInt11186 = 1056082607;
         client.aClass20_11187 = new Class20(8);
         Class200.method2868((short)-14459);
         client.anInt11186 = -848711187 * Class331.aClass613_3498.anInt8039;
         if(client.anInt11186 * -327748687 != -1) {
            Class474.method5652(false, (short)18984);
            Class9_Sub1.method10244(1233107299);
            Class107.method1346(-327748687 * client.anInt11186, (int[])null, (byte)114);
         }
      }

      Class623.method7413((byte)-35);
      Class195.aClass292_Sub1_2182.method3888(true, -785023546);
      Class32.aBool358 = false;
      Class68.method1083(993317453);
      client.anInt11178 = 2037720991;
      Class458.method5417(-385022107 * client.anInt11177, -1517124370);
      Class451.localPlayer = new Class639_Sub1_Sub2_Sub1_Sub1((Class549)null);
      client.aMap11156.clear();
      Class451.localPlayer.method7618((float)(client.aClass505_11204.method6056(-1746741811) * 512 / 2), 0.0F, (float)(client.aClass505_11204.method6057(126749238) * 512 / 2));
      Class451.localPlayer.screenX[0] = client.aClass505_11204.method6056(-1746741811) / 2;
      Class451.localPlayer.screenY[0] = client.aClass505_11204.method6057(126749238) / 2;
      Class210.anInt2259 = 0;
      Class439.anInt4866 = 0;
      if(3 == Class327.anInt3488 * -265840483) {
         Class439.anInt4866 = 1307632361 * (1601946085 * Class583.anInt7782 << 9);
         Class210.anInt2259 = -2013648709 * (Class526_Sub5.anInt10388 * 97596415 << 9);
      } else {
         Class19.method632((byte)1);
      }

      client.aClass505_11204.method6100((byte)-35).method7377((byte)0);
   }

   static final void method882(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class227.method3171(var3, var4, var0, (byte)95);
   }

   static final void method883(Class681 var0, int var1) {
      Class526_Sub32 var2 = (Class526_Sub32)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anInt10599 * -1228547407;
   }
}
