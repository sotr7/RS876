package com.jagex;

import com.jagex.Class148;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class186;
import com.jagex.Class192;
import com.jagex.Class195;
import com.jagex.Class210;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class246;
import com.jagex.Class255;
import com.jagex.Class277;
import com.jagex.Class317;
import com.jagex.Class322;
import com.jagex.Class327;
import com.jagex.Class387;
import com.jagex.Class397;
import com.jagex.Class439;
import com.jagex.Class446;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class476;
import com.jagex.Class487;
import com.jagex.Class513;
import com.jagex.Class517;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub6;
import com.jagex.Class547;
import com.jagex.Class576;
import com.jagex.Class596;
import com.jagex.Class610;
import com.jagex.Class650;
import com.jagex.Class651;
import com.jagex.Class662;
import com.jagex.Class667;
import com.jagex.Class675;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Class704;
import com.jagex.IcmpService_Sub1;
import com.jagex.Interface12;
import com.jagex.client;

public class Class670 implements Interface12 {
   static final int anInt8546 = 8224;
   int anInt8539;
   public int anInt8550 = 913880409;
   int anInt8547 = 1257918848;
   int anInt8549 = 139417984;
   int anInt8551 = 0;
   int anInt8541 = 0;
   int anInt8540 = 0;
   public boolean aBool8552 = false;
   byte aByte8553 = 0;
   int anInt8536 = -1433859719;
   short[] aShortArray8548;
   short[] aShortArray8542;
   short[] aShortArray8543;
   short[] aShortArray8544;
   byte[] aByteArray8545;
   byte[] aByteArray8554;
   int anInt8538;
   Class662 aClass662_8537;

   public final boolean method7966(int var1) {
      return -1 == this.anInt8539 * 915258817?true:this.aClass662_8537.aClass466_8519.method5530(this.anInt8539 * 915258817, 0, 1834156713);
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-967008597);
         if(var3 == 0) {
            return;
         }

         this.method7972(var1, var3, (byte)-107);
      }
   }

   final Class168 method7967(Class174 var1, int var2, boolean var3, Class148 var4, Class148 var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class704 var13, byte var14, byte var15) {
      int var16 = var2;
      var3 &= this.aByte8553 != 0;
      if(null != var13) {
         var16 = var2 | var13.method8221((byte)24);
      }

      if(-1546829701 * this.anInt8549 != 128) {
         var16 |= 2;
      }

      if(this.anInt8547 * 729964299 != 128 || 1605370011 * this.anInt8551 != 0 || var9 != 0) {
         var16 |= 5;
      }

      if(var3) {
         var16 |= 7;
      }

      Class192 var17 = this.aClass662_8537.aClass192_8520;
      Class168 var18;
      synchronized(var17) {
         var18 = (Class168)this.aClass662_8537.aClass192_8520.method2765((long)(-1589686339 * this.anInt8538 | var1.anInt2030 * -316183255 << 29));
      }

      if(var18 == null || var1.method2464(var18.method2101(), var16) != 0) {
         if(var18 != null) {
            var16 = var1.method2533(var16, var18.method2101());
         }

         int var24 = var16;
         if(this.aShortArray8548 != null) {
            var24 = var16 | 16384;
         }

         if(this.aShortArray8543 != null) {
            var24 |= '\u8000';
         }

         Class170 var19 = Class170.method2146(this.aClass662_8537.aClass466_8519, this.anInt8539 * 915258817, 0);
         if(var19 == null) {
            return null;
         }

         if(var19.anInt1942 < 13) {
            var19.method2148(2);
         }

         var18 = var1.method2321(var19, var24, this.aClass662_8537.anInt8518 * -1825336461, 64 + this.anInt8541 * -2122758533, 850 + 705506505 * this.anInt8540);
         int var20;
         if(null != this.aShortArray8548) {
            for(var20 = 0; var20 < this.aShortArray8548.length; ++var20) {
               var18.method1940(this.aShortArray8548[var20], this.aShortArray8542[var20]);
            }
         }

         if(null != this.aShortArray8543) {
            for(var20 = 0; var20 < this.aShortArray8543.length; ++var20) {
               var18.method1992(this.aShortArray8543[var20], this.aShortArray8544[var20]);
            }
         }

         var18.method2110(var16);
         Class192 var26 = this.aClass662_8537.aClass192_8520;
         synchronized(var26) {
            this.aClass662_8537.aClass192_8520.method2768(var18, (long)(-1589686339 * this.anInt8538 | var1.anInt2030 * -316183255 << 29));
         }
      }

      Class168 var25 = var18.method1947(var14, var16, true);
      if(var13 != null) {
         var13.method8231(var25, 0, -1606393759);
      }

      if(128 != this.anInt8547 * 729964299 || 128 != this.anInt8549 * -1546829701) {
         var25.method1957(this.anInt8547 * 729964299, this.anInt8549 * -1546829701, this.anInt8547 * 729964299);
      }

      if(0 != this.anInt8551 * 1605370011) {
         if(90 == this.anInt8551 * 1605370011) {
            var9 += 4096;
         }

         if(this.anInt8551 * 1605370011 == 180) {
            var9 += 8192;
         }

         if(1605370011 * this.anInt8551 == 270) {
            var9 += 12288;
         }
      }

      if(0 != var9) {
         var9 &= 16383;
         var25.method1951(var9);
      }

      if(var3) {
         if(null != var4) {
            var25.method2036(this.aByte8553, -877662409 * this.anInt8536, var4, var5, var6, var7, var8);
         } else {
            if(var10 != 0) {
               var25.method2076(var10);
            }

            if(0 != var11) {
               var25.method1954(var11);
            }

            if(0 != var12) {
               var25.method1955(0, var12, 0);
            }
         }
      }

      var25.method2110(var2);
      return var25;
   }

   public final Class168 method7968(Class174 var1, int var2, int var3, int var4, int var5, int var6, Class704 var7, byte var8, byte var9) {
      return this.aByte8553 != 3?this.method7967(var1, var2, false, (Class148)null, (Class148)null, 0, 0, 0, var3, 0, 0, 0, var7, var8, (byte)76):this.method7967(var1, var2, true, (Class148)null, (Class148)null, 0, 0, 0, var3, var4, var5, var6, var7, var8, (byte)47);
   }

   public final Class168 method7969(Class174 var1, int var2, Class704 var3, byte var4, int var5) {
      return this.method7967(var1, var2, false, (Class148)null, (Class148)null, 0, 0, 0, 0, 0, 0, 0, var3, var4, (byte)14);
   }

   public final Class168 method7970(Class174 var1, int var2, int var3, Class148 var4, Class148 var5, int var6, int var7, int var8, Class704 var9, byte var10, int var11) {
      return this.method7967(var1, var2, true, var4, var5, var6, var7, var8, var3, 0, 0, 0, var9, var10, (byte)68);
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1102464604);
         if(var2 == 0) {
            return;
         }

         this.method7972(var1, var2, (byte)-73);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-386576182);
         if(var2 == 0) {
            return;
         }

         this.method7972(var1, var2, (byte)-127);
      }
   }

   public void method85() {
   }

   void method7971(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt8539 = var1.readBigSmart((byte)-80) * 1945850433;
      } else if(var2 == 2) {
         this.anInt8550 = var1.readBigSmart((byte)-35) * -913880409;
      } else if(4 == var2) {
         this.anInt8547 = var1.readUnsignedShort(634802194) * 680916131;
      } else if(var2 == 5) {
         this.anInt8549 = var1.readUnsignedShort(796319524) * -1508860237;
      } else if(var2 == 6) {
         this.anInt8551 = var1.readUnsignedShort(1663957840) * -1174411885;
      } else if(7 == var2) {
         this.anInt8541 = var1.readUnsignedByte(-154431339) * 1961470131;
      } else if(var2 == 8) {
         this.anInt8540 = var1.readUnsignedByte(1734970762) * -1888309895;
      } else if(var2 == 10) {
         this.aBool8552 = true;
      } else if(var2 == 9) {
         this.aByte8553 = 3;
         this.anInt8536 = -1917865760;
      } else if(var2 == 15) {
         this.aByte8553 = 3;
         this.anInt8536 = var1.readUnsignedShort(1951406098) * 1433859719;
      } else if(var2 == 16) {
         this.aByte8553 = 3;
         this.anInt8536 = var1.readInt((byte)5) * 1433859719;
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte(1783867361);
            this.aShortArray8548 = new short[var3];
            this.aShortArray8542 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aShortArray8548[var4] = (short)var1.readUnsignedShort(984638378);
               this.aShortArray8542[var4] = (short)var1.readUnsignedShort(342396566);
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte(-447270693);
            this.aShortArray8543 = new short[var3];
            this.aShortArray8544 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aShortArray8543[var4] = (short)var1.readUnsignedShort(912010365);
               this.aShortArray8544[var4] = (short)var1.readUnsignedShort(345070987);
            }
         } else {
            int var5;
            int var6;
            byte var7;
            if(44 == var2) {
               var3 = var1.readUnsignedShort(2098101519);
               var4 = 0;

               for(var5 = var3; var5 > 0; var5 >>= 1) {
                  ++var4;
               }

               this.aByteArray8545 = new byte[var4];
               var7 = 0;

               for(var6 = 0; var6 < var4; ++var6) {
                  if((var3 & 1 << var6) > 0) {
                     this.aByteArray8545[var6] = var7++;
                  } else {
                     this.aByteArray8545[var6] = -1;
                  }
               }
            } else if(var2 == 45) {
               var3 = var1.readUnsignedShort(1366255072);
               var4 = 0;

               for(var5 = var3; var5 > 0; var5 >>= 1) {
                  ++var4;
               }

               this.aByteArray8554 = new byte[var4];
               var7 = 0;

               for(var6 = 0; var6 < var4; ++var6) {
                  if((var3 & 1 << var6) > 0) {
                     this.aByteArray8554[var6] = var7++;
                  } else {
                     this.aByteArray8554[var6] = -1;
                  }
               }
            } else if(var2 == 46) {
               ;
            }
         }
      }

   }

   void method7972(RSByteBuffer var1, int var2, byte var3) {
      if(1 == var2) {
         this.anInt8539 = var1.readBigSmart((byte)-27) * 1945850433;
      } else if(var2 == 2) {
         this.anInt8550 = var1.readBigSmart((byte)-39) * -913880409;
      } else if(4 == var2) {
         this.anInt8547 = var1.readUnsignedShort(797120149) * 680916131;
      } else if(var2 == 5) {
         this.anInt8549 = var1.readUnsignedShort(1905955609) * -1508860237;
      } else if(var2 == 6) {
         this.anInt8551 = var1.readUnsignedShort(1135046993) * -1174411885;
      } else if(7 == var2) {
         this.anInt8541 = var1.readUnsignedByte(694195398) * 1961470131;
      } else if(var2 == 8) {
         this.anInt8540 = var1.readUnsignedByte(-444516930) * -1888309895;
      } else if(var2 == 10) {
         this.aBool8552 = true;
      } else if(var2 == 9) {
         this.aByte8553 = 3;
         this.anInt8536 = -1917865760;
      } else if(var2 == 15) {
         this.aByte8553 = 3;
         this.anInt8536 = var1.readUnsignedShort(1824895440) * 1433859719;
      } else if(var2 == 16) {
         this.aByte8553 = 3;
         this.anInt8536 = var1.readInt((byte)5) * 1433859719;
      } else {
         int var4;
         int var5;
         if(var2 == 40) {
            var4 = var1.readUnsignedByte(-2056529433);
            this.aShortArray8548 = new short[var4];
            this.aShortArray8542 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray8548[var5] = (short)var1.readUnsignedShort(916810169);
               this.aShortArray8542[var5] = (short)var1.readUnsignedShort(146933761);
            }
         } else if(var2 == 41) {
            var4 = var1.readUnsignedByte(641254426);
            this.aShortArray8543 = new short[var4];
            this.aShortArray8544 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray8543[var5] = (short)var1.readUnsignedShort(1787754328);
               this.aShortArray8544[var5] = (short)var1.readUnsignedShort(1104711738);
            }
         } else {
            int var6;
            int var7;
            byte var8;
            if(44 == var2) {
               var4 = var1.readUnsignedShort(1842907385);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray8545 = new byte[var5];
               var8 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray8545[var7] = var8++;
                  } else {
                     this.aByteArray8545[var7] = -1;
                  }
               }
            } else if(var2 == 45) {
               var4 = var1.readUnsignedShort(445348383);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray8554 = new byte[var5];
               var8 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray8554[var7] = var8++;
                  } else {
                     this.aByteArray8554[var7] = -1;
                  }
               }
            } else if(var2 == 46) {
               ;
            }
         }
      }

   }

   Class670(int var1, Class662 var2) {
      this.anInt8538 = var1 * -2107972715;
      this.aClass662_8537 = var2;
   }

   public void method81(int var1) {
   }

   public final boolean method7973() {
      return -1 == this.anInt8539 * 915258817?true:this.aClass662_8537.aClass466_8519.method5530(this.anInt8539 * 915258817, 0, 1662782828);
   }

   public final boolean method7974() {
      return -1 == this.anInt8539 * 915258817?true:this.aClass662_8537.aClass466_8519.method5530(this.anInt8539 * 915258817, 0, 2014353694);
   }

   public final boolean method7975() {
      return -1 == this.anInt8539 * 915258817?true:this.aClass662_8537.aClass466_8519.method5530(this.anInt8539 * 915258817, 0, 1718651351);
   }

   static final void method7976(Class681 var0, int var1) {
      long var2 = Class255.time((byte)24);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class246.method3391(var2);
   }

   static final void method7977(int var0, int var1) {
      int var2 = client.anInt11012 - client.anInt11148 * -1697662881;
      if(var2 >= 100) {
         Class327.anInt3488 = Class397.method4824((byte)1) * 900443573;
         Class576.anInt7740 = 1775818497;
         Class277.anInt3029 = -1852613725;
      } else {
         float var3 = 1.0F - (float)((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
         int var6;
         if(Class397.method4824((byte)1) == 2) {
            Class526_Sub32 var4 = Class195.aClass292_Sub1_2182.method3941(-75475023).method4211(1450734681);
            Class596 var5 = client.aClass505_11204.method6128(1968210908);
            Class487.anInt5511 = ((int)((double)Class195.aClass292_Sub1_2182.method3918(-765867652) * 2607.5945876176133D) & 16383) * -567045205;
            Class317.anInt3410 = ((int)((double)Class195.aClass292_Sub1_2182.method3919(2099379167) * -2607.5945876176133D) & 16383) * -1157073499;
            Class547.anInt7272 = 0;
            client.anInt11292 = (int)((float)(-1134295917 * Class651.anInt8463) + (float)((int)((double)(553698849 * client.anInt11284) / (4.0D * Math.tan((double)(Class195.aClass292_Sub1_2182.method3924(-1777518966) / 2.0F)))) - -1134295917 * Class651.anInt8463) * var3) * -1144828317;
            Class439.anInt4866 = 1307632361 * (int)((float)(Class517.anInt7041 * 1414735403) + (float)(-1228547407 * var4.anInt10599 - -507706880 * var5.localX - Class517.anInt7041 * 1414735403) * var3);
            Class322.anInt3458 = (int)((float)(912059253 * Class526_Sub6.anInt10398) + (float)(-(var4.anInt10597 * -1299508185) - Class526_Sub6.anInt10398 * 912059253) * var3) * 1608934313;
            Class210.anInt2259 = -2013648709 * (int)(var3 * (float)(524465495 * var4.anInt10600 - var5.localY * 747559424 - Class513.anInt7021 * -1168082711) + (float)(Class513.anInt7021 * -1168082711));
            var6 = -(-871798227 * Class317.anInt3410) - Class667.anInt8531 * -1171933991 & 16383;
            if(var6 > 8192) {
               var6 -= 16384;
            } else if(var6 < -8192) {
               var6 += 16384;
            }
         } else {
            int var8 = (int)client.aFloat11210;
            if(client.anInt11113 * 1723323455 >> 8 > var8) {
               var8 = client.anInt11113 * 1723323455 >> 8;
            }

            if(client.aBoolArray11263[4] && 128 + client.anIntArray11005[4] > var8) {
               var8 = client.anIntArray11005[4] + 128;
            }

            int var9 = (int)client.aFloat11105 + 1729917477 * client.anInt11092 & 16383;
            Class446 var7 = Class451.localPlayer.method7635().aClass446_4816;
            Class675.method8010(Class45.anInt639 * -445020973, Class387.method4762((int)var7.aFloat4917, (int)var7.aFloat4919, -395336755 * Class692.anInt8703, 1103853881) - client.anInt11111 * 1449227059, 1090885877 * Class186.anInt2122, var8, var9, (var8 >> 3) * 3 + 600 << 2, var0, -615696662);
            Class439.anInt4866 = 1307632361 * (int)((float)(Class517.anInt7041 * 1414735403) + (float)(Class439.anInt4866 * 822351193 - Class517.anInt7041 * 1414735403) * var3);
            Class322.anInt3458 = (int)((float)(1323364505 * Class322.anInt3458 - Class526_Sub6.anInt10398 * 912059253) * var3 + (float)(Class526_Sub6.anInt10398 * 912059253)) * 1608934313;
            Class210.anInt2259 = (int)((float)(-1168082711 * Class513.anInt7021) + (float)(Class210.anInt2259 * 1215159411 - Class513.anInt7021 * -1168082711) * var3) * -2013648709;
            Class487.anInt5511 = -567045205 * (int)((float)(-1880855763 * Class476.anInt5388) + (float)(1962594051 * Class487.anInt5511 - -1880855763 * Class476.anInt5388) * var3);
            var6 = -871798227 * Class317.anInt3410 - -1171933991 * Class667.anInt8531;
            if(var6 > 8192) {
               var6 -= 16384;
            } else if(var6 < -8192) {
               var6 += 16384;
            }
         }

         Class317.anInt3410 = (int)((float)(Class667.anInt8531 * -1171933991) + (float)var6 * var3) * -1157073499;
         Class317.anInt3410 = (Class317.anInt3410 * -871798227 & 16383) * -1157073499;
         client.anInt11292 = -1144828317 * (int)(var3 * (float)(client.anInt11292 * -1269456053 - -1134295917 * Class651.anInt8463) + (float)(Class651.anInt8463 * -1134295917));
      }
   }

   static final void method7978(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class610.method7209(var3, var4, var0, -1073660555);
   }

   public static boolean method7979(int var0) {
      try {
         if(!IcmpService_Sub1.available()) {
            return false;
         }
      } catch (Throwable var2) {
         return false;
      }

      if(IcmpService_Sub1.anIcmpService_Sub1_10842 != null) {
         throw new IllegalStateException("");
      } else {
         IcmpService_Sub1.anIcmpService_Sub1_10842 = new IcmpService_Sub1();
         Thread var1 = new Thread(new Class650());
         var1.setDaemon(true);
         var1.start();
         return true;
      }
   }
}
