package com.jagex;

import com.jagex.Class378;
import com.jagex.Class413;
import com.jagex.RSByteBuffer;
import com.jagex.Class641;
import com.jagex.Class681;
import com.jagex.Class90;
import com.jagex.client;
import java.io.IOException;

public class Class385 {
   public static final int anInt3962 = 2;
   public static final int anInt3986 = -1;
   public int[] anIntArray3991;
   public static final int anInt4013 = 1;
   static final int anInt4025 = 0;
   public static int anInt4038;
   public short aShort3963;
   public short aShort3964;
   public short aShort3965;
   public short aShort3966;
   public int anInt3967;
   public int anInt3968;
   public int anInt3969 = 0;
   public int anInt4022;
   public int anInt3974;
   public int anInt4020;
   int anInt3977;
   int anInt3999;
   public int anInt4024;
   public int anInt3985;
   public int anInt3983;
   public int anInt3987;
   public int[] anIntArray3973;
   public int[] anIntArray3984;
   public int anInt4035 = -871520678;
   public int anInt3994 = 364707242;
   public int anInt3995 = 0;
   public int anInt3979 = 845474187;
   public int anInt4002 = -1969476791;
   public int anInt3980;
   public boolean aBool3996 = true;
   public int anInt3998 = 16916557;
   public int anInt4004 = 1431288223;
   public int anInt4033 = 0;
   int anInt3981 = -992374380;
   public boolean aBool3997 = true;
   int anInt3982 = -1568336596;
   public int anInt3971 = -812113071;
   int anInt3972 = -1350598748;
   public boolean aBool3960 = true;
   public int[] anIntArray3989;
   public boolean aBool4001 = true;
   public int anInt3975 = -1257650331;
   int anInt4014 = -70468604;
   public boolean aBool4029 = false;
   public int anInt4006 = 0;
   int anInt4007 = 0;
   public boolean aBool4009 = true;
   public boolean aBool3976 = false;
   public boolean aBool4011 = true;
   public boolean aBool4012 = false;
   public int anInt4003 = 0;
   int anInt3988 = 0;
   public int anInt4005 = 0;
   public boolean aBool4021 = false;
   public int anInt4010;
   int anInt4015;
   public int anInt4016;
   public int anInt4017;
   int anInt4018;
   public int anInt4019;
   public int anInt4023;
   int anInt4000;
   public int anInt3961;
   public int anInt3992;
   int anInt3978;
   public int anInt4032;
   public int anInt4026;
   public int anInt4027;
   public int anInt4028;
   public int anInt3990;
   public int anInt4030;
   public int anInt3993;
   public int anInt4031;
   public int anInt3970;
   public int anInt4034;
   public int anInt4036;
   public int anInt4037;
   public int anInt4008;

   void method4732(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(265920032);
         if(0 == var2) {
            return;
         }

         this.method4744(var1, var2, 1018764655);
      }
   }

   void method4733(RSByteBuffer var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(1740647988);
         if(0 == var3) {
            return;
         }

         this.method4744(var1, var3, 1018764655);
      }
   }

   void method4734(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.aShort3963 = (short)var1.readUnsignedShort(537421455);
         this.aShort3964 = (short)var1.readUnsignedShort(52886057);
         this.aShort3965 = (short)var1.readUnsignedShort(196020061);
         this.aShort3966 = (short)var1.readUnsignedShort(967766147);
         byte var3 = 3;
         this.aShort3963 = (short)(this.aShort3963 << var3);
         this.aShort3964 = (short)(this.aShort3964 << var3);
         this.aShort3965 = (short)(this.aShort3965 << var3);
         this.aShort3966 = (short)(this.aShort3966 << var3);
      } else if(2 == var2) {
         var1.readUnsignedByte(-1344167404);
      } else if(3 == var2) {
         this.anInt3967 = var1.readInt((byte)5) * -1939532645;
         this.anInt3968 = var1.readInt((byte)5) * 363550731;
      } else if(var2 == 4) {
         this.anInt3969 = var1.readUnsignedByte(1990153563) * 588073017;
         this.anInt4022 = var1.readByte((byte)112) * 1760371491;
      } else if(var2 == 5) {
         this.anInt4020 = (this.anInt3974 = (var1.readUnsignedShort(1038589774) << 12 << 2) * 90899425) * -1388291973;
      } else if(6 == var2) {
         this.anInt3977 = var1.readInt((byte)5) * -650507995;
         this.anInt3999 = var1.readInt((byte)5) * -1967445647;
      } else if(var2 == 7) {
         this.anInt4024 = var1.readUnsignedShort(431045262) * 972665181;
         this.anInt3985 = var1.readUnsignedShort(785104964) * 1537495981;
      } else if(8 == var2) {
         this.anInt3983 = var1.readUnsignedShort(1303517952) * -1374595275;
         this.anInt3987 = var1.readUnsignedShort(1310641841) * 264765831;
      } else {
         int var4;
         int var5;
         if(var2 == 9) {
            var5 = var1.readUnsignedByte(456402812);
            this.anIntArray3973 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3973[var4] = var1.readUnsignedShort(1048507760);
            }
         } else if(10 == var2) {
            var5 = var1.readUnsignedByte(599654079);
            this.anIntArray3984 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3984[var4] = var1.readUnsignedShort(1284517044);
            }
         } else if(12 == var2) {
            this.anInt4035 = var1.readByte((byte)25) * -1711723309;
         } else if(var2 == 13) {
            this.anInt3994 = var1.readByte((byte)59) * 1965130027;
         } else if(14 == var2) {
            this.anInt3995 = var1.readUnsignedShort(1703560428) * -1172622705;
         } else if(15 == var2) {
            this.anInt3979 = var1.readUnsignedShort(770892730) * -845474187;
         } else if(16 == var2) {
            this.aBool3996 = var1.readUnsignedByte(-1142498516) == 1;
            this.anInt3998 = var1.readUnsignedShort(506351922) * -16916557;
            this.anInt4004 = var1.readUnsignedShort(1669305740) * -1431288223;
            this.aBool3997 = var1.readUnsignedByte(-696854628) == 1;
         } else if(17 == var2) {
            this.anInt4002 = var1.readUnsignedShort(1564957449) * 1969476791;
         } else if(18 == var2) {
            this.anInt3980 = var1.readInt((byte)5) * 734778259;
         } else if(var2 == 19) {
            this.anInt4033 = var1.readUnsignedByte(1035020713) * 2124635611;
         } else if(20 == var2) {
            this.anInt3981 = var1.readUnsignedByte(1751684391) * 204824621;
         } else if(var2 == 21) {
            this.anInt3982 = var1.readUnsignedByte(1247111355) * -1046475517;
         } else if(var2 == 22) {
            this.anInt3971 = var1.readInt((byte)5) * 812113071;
         } else if(23 == var2) {
            this.anInt3972 = var1.readUnsignedByte(2133336635) * 544839761;
         } else if(var2 == 24) {
            this.aBool3960 = false;
         } else if(var2 == 25) {
            var5 = var1.readUnsignedByte(-989164938);
            this.anIntArray3989 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3989[var4] = var1.readUnsignedShort(342743620);
            }
         } else if(var2 == 26) {
            this.aBool4001 = false;
         } else if(27 == var2) {
            this.anInt3975 = (var1.readUnsignedShort(409556034) << 12 << 2) * 1257650331;
         } else if(28 == var2) {
            this.anInt4014 = var1.readUnsignedByte(1905897712) * -1117396183;
         } else if(var2 == 29) {
            if(var1.readUnsignedByte(749990228) == 0) {
               this.anInt4006 = (this.anInt4007 = var1.readShort((byte)1) * 1712293512) * 183614651;
            } else {
               this.anInt4006 = var1.readShort((byte)1) * -366271144;
               this.anInt4007 = var1.readShort((byte)1) * 1712293512;
            }
         } else if(var2 == 30) {
            this.aBool4029 = true;
         } else if(var2 == 31) {
            this.anInt4020 = (var1.readUnsignedShort(429731581) << 12 << 2) * 1761621275;
            this.anInt3974 = (var1.readUnsignedShort(1626616501) << 12 << 2) * 90899425;
         } else if(var2 == 32) {
            this.aBool4009 = false;
         } else if(var2 == 33) {
            this.aBool3976 = true;
         } else if(var2 == 34) {
            this.aBool4011 = false;
         } else if(35 == var2) {
            if(var1.readUnsignedByte(-2061544158) == 0) {
               this.anInt4003 = (this.anInt3988 = var1.readShort((byte)1) * 1107956808) * -255214351;
            } else {
               this.anInt4003 = var1.readShort((byte)1) * -18221112;
               this.anInt3988 = var1.readShort((byte)1) * 1107956808;
               this.anInt4005 = var1.readUnsignedByte(-1140296386) * 1308693291;
            }
         } else if(36 == var2) {
            this.aBool4012 = true;
         }
      }

   }

   void method4735(int var1) {
      if(this.anInt4035 * -2105537701 > -2 || 1876374915 * this.anInt3994 > -2) {
         this.aBool4021 = true;
      }

      this.anInt4010 = 79665249 * (1543301805 * this.anInt3977 >> 16 & 255);
      this.anInt4015 = 1283019065 * (2052749201 * this.anInt3999 >> 16 & 255);
      this.anInt4016 = 1244489199 * this.anInt4015 - -848924521 * this.anInt4010;
      this.anInt4017 = (this.anInt3977 * 1543301805 >> 8 & 255) * -1479244641;
      this.anInt4018 = (this.anInt3999 * 2052749201 >> 8 & 255) * 807677971;
      this.anInt4019 = -543864275 * this.anInt4018 - this.anInt4017 * -1881874359;
      this.anInt4023 = -171706493 * (this.anInt3977 * 1543301805 & 255);
      this.anInt4000 = (this.anInt3999 * 2052749201 & 255) * -1092578747;
      this.anInt3961 = 1694859039 * this.anInt4000 - this.anInt4023 * -531259575;
      this.anInt3992 = -2051839859 * (1543301805 * this.anInt3977 >> 24 & 255);
      this.anInt3978 = (2052749201 * this.anInt3999 >> 24 & 255) * 1677236613;
      this.anInt4032 = this.anInt3978 * 626489705 - 62069761 * this.anInt3992;
      if(-1851178341 * this.anInt3980 != 0) {
         this.anInt4026 = this.anInt3981 * -1033113691 * this.anInt3985 * 1098680357 / 100 * -1316773363;
         this.anInt4027 = 1262422547 * (this.anInt3982 * -245578325 * 1098680357 * this.anInt3985 / 100);
         if(0 == this.anInt4026 * -1064403771) {
            this.anInt4026 = -1316773363;
         }

         this.anInt4028 = ((this.anInt3980 * -1851178341 >> 16 & 255) - (-25742201 * this.anInt4016 / 2 + this.anInt4010 * 1209338785) << 8) / (-1064403771 * this.anInt4026) * 110994567;
         this.anInt3990 = -1019604031 * (((this.anInt3980 * -1851178341 >> 8 & 255) - (1215797087 * this.anInt4017 + -711292313 * this.anInt4019 / 2) << 8) / (-1064403771 * this.anInt4026));
         this.anInt4030 = -2034232179 * (((-1851178341 * this.anInt3980 & 255) - (-815016237 * this.anInt3961 / 2 + this.anInt4023 * 339496747) << 8) / (this.anInt4026 * -1064403771));
         if(343691291 * this.anInt4027 == 0) {
            this.anInt4027 = 1262422547;
         }

         this.anInt4031 = ((-1851178341 * this.anInt3980 >> 24 & 255) - (-571339195 * this.anInt4032 / 2 + this.anInt3992 * 549493317) << 8) / (343691291 * this.anInt4027) * -1444472359;
         this.anInt4028 += (this.anInt4028 * 235004215 > 0?-4:4) * 110994567;
         this.anInt3990 += -1019604031 * (this.anInt3990 * -1164968895 > 0?-4:4);
         this.anInt4030 += -2034232179 * (1857408581 * this.anInt4030 > 0?-4:4);
         this.anInt4031 += (this.anInt4031 * -241969559 > 0?-4:4) * -1444472359;
      }

      if(-1 != -2137982385 * this.anInt3971) {
         this.anInt3993 = this.anInt3972 * 1213640881 * this.anInt3985 * 1098680357 / 100 * -2011347031;
         if(0 == -945140583 * this.anInt3993) {
            this.anInt3993 = -2011347031;
         }

         this.anInt3970 = 1210179609 * ((this.anInt3971 * -2137982385 - ((944665507 * this.anInt3968 - -1736265325 * this.anInt3967) / 2 + -1736265325 * this.anInt3967)) / (-945140583 * this.anInt3993));
      }

      if(this.anInt3975 * 1124265363 != -1) {
         this.anInt4034 = this.anInt4014 * 620325145 * 1098680357 * this.anInt3985 / 100 * 2133435989;
         if(this.anInt4034 * 1519265533 == 0) {
            this.anInt4034 = 2133435989;
         }

         this.anInt4008 = (this.anInt3975 * 1124265363 - ((868515873 * this.anInt3974 - -1805116141 * this.anInt4020) / 2 + this.anInt4020 * -1805116141)) / (1519265533 * this.anInt4034) * 1125494529;
      }

      this.anInt4036 = this.anInt3988 * -559070439 - this.anInt4003 * 890767529;
      this.anInt4037 = -658964465 * this.anInt4007 - -1919131971 * this.anInt4006;
   }

   void method4736() {
      if(this.anInt4035 * -2105537701 > -2 || 1876374915 * this.anInt3994 > -2) {
         this.aBool4021 = true;
      }

      this.anInt4010 = 79665249 * (1543301805 * this.anInt3977 >> 16 & 255);
      this.anInt4015 = 1283019065 * (2052749201 * this.anInt3999 >> 16 & 255);
      this.anInt4016 = 1244489199 * this.anInt4015 - -848924521 * this.anInt4010;
      this.anInt4017 = (this.anInt3977 * 1543301805 >> 8 & 255) * -1479244641;
      this.anInt4018 = (this.anInt3999 * 2052749201 >> 8 & 255) * 807677971;
      this.anInt4019 = -543864275 * this.anInt4018 - this.anInt4017 * -1881874359;
      this.anInt4023 = -171706493 * (this.anInt3977 * 1543301805 & 255);
      this.anInt4000 = (this.anInt3999 * 2052749201 & 255) * -1092578747;
      this.anInt3961 = 1694859039 * this.anInt4000 - this.anInt4023 * -531259575;
      this.anInt3992 = -2051839859 * (1543301805 * this.anInt3977 >> 24 & 255);
      this.anInt3978 = (2052749201 * this.anInt3999 >> 24 & 255) * 1677236613;
      this.anInt4032 = this.anInt3978 * 626489705 - 62069761 * this.anInt3992;
      if(-1851178341 * this.anInt3980 != 0) {
         this.anInt4026 = this.anInt3981 * -1033113691 * this.anInt3985 * 1098680357 / 100 * -1316773363;
         this.anInt4027 = 1262422547 * (this.anInt3982 * -245578325 * 1098680357 * this.anInt3985 / 100);
         if(0 == this.anInt4026 * -1064403771) {
            this.anInt4026 = -1316773363;
         }

         this.anInt4028 = ((this.anInt3980 * -1851178341 >> 16 & 255) - (-25742201 * this.anInt4016 / 2 + this.anInt4010 * 1209338785) << 8) / (-1064403771 * this.anInt4026) * 110994567;
         this.anInt3990 = -1019604031 * (((this.anInt3980 * -1851178341 >> 8 & 255) - (1215797087 * this.anInt4017 + -711292313 * this.anInt4019 / 2) << 8) / (-1064403771 * this.anInt4026));
         this.anInt4030 = -2034232179 * (((-1851178341 * this.anInt3980 & 255) - (-815016237 * this.anInt3961 / 2 + this.anInt4023 * 339496747) << 8) / (this.anInt4026 * -1064403771));
         if(343691291 * this.anInt4027 == 0) {
            this.anInt4027 = 1262422547;
         }

         this.anInt4031 = ((-1851178341 * this.anInt3980 >> 24 & 255) - (-571339195 * this.anInt4032 / 2 + this.anInt3992 * 549493317) << 8) / (343691291 * this.anInt4027) * -1444472359;
         this.anInt4028 += (this.anInt4028 * 235004215 > 0?-4:4) * 110994567;
         this.anInt3990 += -1019604031 * (this.anInt3990 * -1164968895 > 0?-4:4);
         this.anInt4030 += -2034232179 * (1857408581 * this.anInt4030 > 0?-4:4);
         this.anInt4031 += (this.anInt4031 * -241969559 > 0?-4:4) * -1444472359;
      }

      if(-1 != -2137982385 * this.anInt3971) {
         this.anInt3993 = this.anInt3972 * 1213640881 * this.anInt3985 * 1098680357 / 100 * -2011347031;
         if(0 == -945140583 * this.anInt3993) {
            this.anInt3993 = -2011347031;
         }

         this.anInt3970 = 1210179609 * ((this.anInt3971 * -2137982385 - ((944665507 * this.anInt3968 - -1736265325 * this.anInt3967) / 2 + -1736265325 * this.anInt3967)) / (-945140583 * this.anInt3993));
      }

      if(this.anInt3975 * 1124265363 != -1) {
         this.anInt4034 = this.anInt4014 * 620325145 * 1098680357 * this.anInt3985 / 100 * 2133435989;
         if(this.anInt4034 * 1519265533 == 0) {
            this.anInt4034 = 2133435989;
         }

         this.anInt4008 = (this.anInt3975 * 1124265363 - ((868515873 * this.anInt3974 - -1805116141 * this.anInt4020) / 2 + this.anInt4020 * -1805116141)) / (1519265533 * this.anInt4034) * 1125494529;
      }

      this.anInt4036 = this.anInt3988 * -559070439 - this.anInt4003 * 890767529;
      this.anInt4037 = -658964465 * this.anInt4007 - -1919131971 * this.anInt4006;
   }

   void method4737(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-241679529);
         if(0 == var2) {
            return;
         }

         this.method4744(var1, var2, 1018764655);
      }
   }

   void method4738(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1720244830);
         if(0 == var2) {
            return;
         }

         this.method4744(var1, var2, 1018764655);
      }
   }

   void method4739(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.aShort3963 = (short)var1.readUnsignedShort(1490576057);
         this.aShort3964 = (short)var1.readUnsignedShort(1872150437);
         this.aShort3965 = (short)var1.readUnsignedShort(663509960);
         this.aShort3966 = (short)var1.readUnsignedShort(2118839356);
         byte var3 = 3;
         this.aShort3963 = (short)(this.aShort3963 << var3);
         this.aShort3964 = (short)(this.aShort3964 << var3);
         this.aShort3965 = (short)(this.aShort3965 << var3);
         this.aShort3966 = (short)(this.aShort3966 << var3);
      } else if(2 == var2) {
         var1.readUnsignedByte(-909330423);
      } else if(3 == var2) {
         this.anInt3967 = var1.readInt((byte)5) * -1939532645;
         this.anInt3968 = var1.readInt((byte)5) * 363550731;
      } else if(var2 == 4) {
         this.anInt3969 = var1.readUnsignedByte(1439345053) * 588073017;
         this.anInt4022 = var1.readByte((byte)113) * 1760371491;
      } else if(var2 == 5) {
         this.anInt4020 = (this.anInt3974 = (var1.readUnsignedShort(983066523) << 12 << 2) * 90899425) * -1388291973;
      } else if(6 == var2) {
         this.anInt3977 = var1.readInt((byte)5) * -650507995;
         this.anInt3999 = var1.readInt((byte)5) * -1967445647;
      } else if(var2 == 7) {
         this.anInt4024 = var1.readUnsignedShort(844742439) * 972665181;
         this.anInt3985 = var1.readUnsignedShort(1503922716) * 1537495981;
      } else if(8 == var2) {
         this.anInt3983 = var1.readUnsignedShort(1486688341) * -1374595275;
         this.anInt3987 = var1.readUnsignedShort(2027617060) * 264765831;
      } else {
         int var4;
         int var5;
         if(var2 == 9) {
            var5 = var1.readUnsignedByte(-1237814073);
            this.anIntArray3973 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3973[var4] = var1.readUnsignedShort(1962933665);
            }
         } else if(10 == var2) {
            var5 = var1.readUnsignedByte(-1857719186);
            this.anIntArray3984 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3984[var4] = var1.readUnsignedShort(1183236335);
            }
         } else if(12 == var2) {
            this.anInt4035 = var1.readByte((byte)68) * -1711723309;
         } else if(var2 == 13) {
            this.anInt3994 = var1.readByte((byte)69) * 1965130027;
         } else if(14 == var2) {
            this.anInt3995 = var1.readUnsignedShort(475487457) * -1172622705;
         } else if(15 == var2) {
            this.anInt3979 = var1.readUnsignedShort(969556920) * -845474187;
         } else if(16 == var2) {
            this.aBool3996 = var1.readUnsignedByte(175943157) == 1;
            this.anInt3998 = var1.readUnsignedShort(1192358693) * -16916557;
            this.anInt4004 = var1.readUnsignedShort(719469173) * -1431288223;
            this.aBool3997 = var1.readUnsignedByte(828442187) == 1;
         } else if(17 == var2) {
            this.anInt4002 = var1.readUnsignedShort(1178786451) * 1969476791;
         } else if(18 == var2) {
            this.anInt3980 = var1.readInt((byte)5) * 734778259;
         } else if(var2 == 19) {
            this.anInt4033 = var1.readUnsignedByte(-1082037195) * 2124635611;
         } else if(20 == var2) {
            this.anInt3981 = var1.readUnsignedByte(-405453950) * 204824621;
         } else if(var2 == 21) {
            this.anInt3982 = var1.readUnsignedByte(-1262201406) * -1046475517;
         } else if(var2 == 22) {
            this.anInt3971 = var1.readInt((byte)5) * 812113071;
         } else if(23 == var2) {
            this.anInt3972 = var1.readUnsignedByte(2134879778) * 544839761;
         } else if(var2 == 24) {
            this.aBool3960 = false;
         } else if(var2 == 25) {
            var5 = var1.readUnsignedByte(-730181885);
            this.anIntArray3989 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3989[var4] = var1.readUnsignedShort(516528979);
            }
         } else if(var2 == 26) {
            this.aBool4001 = false;
         } else if(27 == var2) {
            this.anInt3975 = (var1.readUnsignedShort(1702584231) << 12 << 2) * 1257650331;
         } else if(28 == var2) {
            this.anInt4014 = var1.readUnsignedByte(1932779783) * -1117396183;
         } else if(var2 == 29) {
            if(var1.readUnsignedByte(2099287058) == 0) {
               this.anInt4006 = (this.anInt4007 = var1.readShort((byte)1) * 1712293512) * 183614651;
            } else {
               this.anInt4006 = var1.readShort((byte)1) * -366271144;
               this.anInt4007 = var1.readShort((byte)1) * 1712293512;
            }
         } else if(var2 == 30) {
            this.aBool4029 = true;
         } else if(var2 == 31) {
            this.anInt4020 = (var1.readUnsignedShort(1253445887) << 12 << 2) * 1761621275;
            this.anInt3974 = (var1.readUnsignedShort(297932022) << 12 << 2) * 90899425;
         } else if(var2 == 32) {
            this.aBool4009 = false;
         } else if(var2 == 33) {
            this.aBool3976 = true;
         } else if(var2 == 34) {
            this.aBool4011 = false;
         } else if(35 == var2) {
            if(var1.readUnsignedByte(-1111577611) == 0) {
               this.anInt4003 = (this.anInt3988 = var1.readShort((byte)1) * 1107956808) * -255214351;
            } else {
               this.anInt4003 = var1.readShort((byte)1) * -18221112;
               this.anInt3988 = var1.readShort((byte)1) * 1107956808;
               this.anInt4005 = var1.readUnsignedByte(-1319380134) * 1308693291;
            }
         } else if(36 == var2) {
            this.aBool4012 = true;
         }
      }

   }

   void method4740(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.aShort3963 = (short)var1.readUnsignedShort(246023764);
         this.aShort3964 = (short)var1.readUnsignedShort(1114350676);
         this.aShort3965 = (short)var1.readUnsignedShort(1490683809);
         this.aShort3966 = (short)var1.readUnsignedShort(1824930152);
         byte var3 = 3;
         this.aShort3963 = (short)(this.aShort3963 << var3);
         this.aShort3964 = (short)(this.aShort3964 << var3);
         this.aShort3965 = (short)(this.aShort3965 << var3);
         this.aShort3966 = (short)(this.aShort3966 << var3);
      } else if(2 == var2) {
         var1.readUnsignedByte(1732567194);
      } else if(3 == var2) {
         this.anInt3967 = var1.readInt((byte)5) * -1939532645;
         this.anInt3968 = var1.readInt((byte)5) * 363550731;
      } else if(var2 == 4) {
         this.anInt3969 = var1.readUnsignedByte(-195227370) * 588073017;
         this.anInt4022 = var1.readByte((byte)39) * 1760371491;
      } else if(var2 == 5) {
         this.anInt4020 = (this.anInt3974 = (var1.readUnsignedShort(128948816) << 12 << 2) * 90899425) * -1388291973;
      } else if(6 == var2) {
         this.anInt3977 = var1.readInt((byte)5) * -650507995;
         this.anInt3999 = var1.readInt((byte)5) * -1967445647;
      } else if(var2 == 7) {
         this.anInt4024 = var1.readUnsignedShort(956238967) * 972665181;
         this.anInt3985 = var1.readUnsignedShort(1080487700) * 1537495981;
      } else if(8 == var2) {
         this.anInt3983 = var1.readUnsignedShort(1574866779) * -1374595275;
         this.anInt3987 = var1.readUnsignedShort(1207898336) * 264765831;
      } else {
         int var4;
         int var5;
         if(var2 == 9) {
            var5 = var1.readUnsignedByte(1898438826);
            this.anIntArray3973 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3973[var4] = var1.readUnsignedShort(1898847003);
            }
         } else if(10 == var2) {
            var5 = var1.readUnsignedByte(2062302194);
            this.anIntArray3984 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3984[var4] = var1.readUnsignedShort(1092684753);
            }
         } else if(12 == var2) {
            this.anInt4035 = var1.readByte((byte)120) * -1711723309;
         } else if(var2 == 13) {
            this.anInt3994 = var1.readByte((byte)27) * 1965130027;
         } else if(14 == var2) {
            this.anInt3995 = var1.readUnsignedShort(1461113968) * -1172622705;
         } else if(15 == var2) {
            this.anInt3979 = var1.readUnsignedShort(1828728060) * -845474187;
         } else if(16 == var2) {
            this.aBool3996 = var1.readUnsignedByte(1445657832) == 1;
            this.anInt3998 = var1.readUnsignedShort(2030420690) * -16916557;
            this.anInt4004 = var1.readUnsignedShort(253829292) * -1431288223;
            this.aBool3997 = var1.readUnsignedByte(-1330439539) == 1;
         } else if(17 == var2) {
            this.anInt4002 = var1.readUnsignedShort(933109071) * 1969476791;
         } else if(18 == var2) {
            this.anInt3980 = var1.readInt((byte)5) * 734778259;
         } else if(var2 == 19) {
            this.anInt4033 = var1.readUnsignedByte(-164252362) * 2124635611;
         } else if(20 == var2) {
            this.anInt3981 = var1.readUnsignedByte(-949351917) * 204824621;
         } else if(var2 == 21) {
            this.anInt3982 = var1.readUnsignedByte(-960501333) * -1046475517;
         } else if(var2 == 22) {
            this.anInt3971 = var1.readInt((byte)5) * 812113071;
         } else if(23 == var2) {
            this.anInt3972 = var1.readUnsignedByte(1931658696) * 544839761;
         } else if(var2 == 24) {
            this.aBool3960 = false;
         } else if(var2 == 25) {
            var5 = var1.readUnsignedByte(251006108);
            this.anIntArray3989 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3989[var4] = var1.readUnsignedShort(1884220377);
            }
         } else if(var2 == 26) {
            this.aBool4001 = false;
         } else if(27 == var2) {
            this.anInt3975 = (var1.readUnsignedShort(1281986629) << 12 << 2) * 1257650331;
         } else if(28 == var2) {
            this.anInt4014 = var1.readUnsignedByte(85299096) * -1117396183;
         } else if(var2 == 29) {
            if(var1.readUnsignedByte(1601463730) == 0) {
               this.anInt4006 = (this.anInt4007 = var1.readShort((byte)1) * 1712293512) * 183614651;
            } else {
               this.anInt4006 = var1.readShort((byte)1) * -366271144;
               this.anInt4007 = var1.readShort((byte)1) * 1712293512;
            }
         } else if(var2 == 30) {
            this.aBool4029 = true;
         } else if(var2 == 31) {
            this.anInt4020 = (var1.readUnsignedShort(364047724) << 12 << 2) * 1761621275;
            this.anInt3974 = (var1.readUnsignedShort(2083143825) << 12 << 2) * 90899425;
         } else if(var2 == 32) {
            this.aBool4009 = false;
         } else if(var2 == 33) {
            this.aBool3976 = true;
         } else if(var2 == 34) {
            this.aBool4011 = false;
         } else if(35 == var2) {
            if(var1.readUnsignedByte(1041125800) == 0) {
               this.anInt4003 = (this.anInt3988 = var1.readShort((byte)1) * 1107956808) * -255214351;
            } else {
               this.anInt4003 = var1.readShort((byte)1) * -18221112;
               this.anInt3988 = var1.readShort((byte)1) * 1107956808;
               this.anInt4005 = var1.readUnsignedByte(-94800398) * 1308693291;
            }
         } else if(36 == var2) {
            this.aBool4012 = true;
         }
      }

   }

   void method4741(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.aShort3963 = (short)var1.readUnsignedShort(904382704);
         this.aShort3964 = (short)var1.readUnsignedShort(1287069067);
         this.aShort3965 = (short)var1.readUnsignedShort(932909163);
         this.aShort3966 = (short)var1.readUnsignedShort(1998006324);
         byte var3 = 3;
         this.aShort3963 = (short)(this.aShort3963 << var3);
         this.aShort3964 = (short)(this.aShort3964 << var3);
         this.aShort3965 = (short)(this.aShort3965 << var3);
         this.aShort3966 = (short)(this.aShort3966 << var3);
      } else if(2 == var2) {
         var1.readUnsignedByte(2078296295);
      } else if(3 == var2) {
         this.anInt3967 = var1.readInt((byte)5) * -1939532645;
         this.anInt3968 = var1.readInt((byte)5) * 363550731;
      } else if(var2 == 4) {
         this.anInt3969 = var1.readUnsignedByte(845188311) * 588073017;
         this.anInt4022 = var1.readByte((byte)35) * 1760371491;
      } else if(var2 == 5) {
         this.anInt4020 = (this.anInt3974 = (var1.readUnsignedShort(142440199) << 12 << 2) * 90899425) * -1388291973;
      } else if(6 == var2) {
         this.anInt3977 = var1.readInt((byte)5) * -650507995;
         this.anInt3999 = var1.readInt((byte)5) * -1967445647;
      } else if(var2 == 7) {
         this.anInt4024 = var1.readUnsignedShort(2040301209) * 972665181;
         this.anInt3985 = var1.readUnsignedShort(871016320) * 1537495981;
      } else if(8 == var2) {
         this.anInt3983 = var1.readUnsignedShort(1591487542) * -1374595275;
         this.anInt3987 = var1.readUnsignedShort(304910455) * 264765831;
      } else {
         int var4;
         int var5;
         if(var2 == 9) {
            var5 = var1.readUnsignedByte(-350238562);
            this.anIntArray3973 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3973[var4] = var1.readUnsignedShort(608315668);
            }
         } else if(10 == var2) {
            var5 = var1.readUnsignedByte(-1481204132);
            this.anIntArray3984 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3984[var4] = var1.readUnsignedShort(1945567006);
            }
         } else if(12 == var2) {
            this.anInt4035 = var1.readByte((byte)59) * -1711723309;
         } else if(var2 == 13) {
            this.anInt3994 = var1.readByte((byte)20) * 1965130027;
         } else if(14 == var2) {
            this.anInt3995 = var1.readUnsignedShort(19805960) * -1172622705;
         } else if(15 == var2) {
            this.anInt3979 = var1.readUnsignedShort(1966058665) * -845474187;
         } else if(16 == var2) {
            this.aBool3996 = var1.readUnsignedByte(1355458298) == 1;
            this.anInt3998 = var1.readUnsignedShort(1368306691) * -16916557;
            this.anInt4004 = var1.readUnsignedShort(1360718306) * -1431288223;
            this.aBool3997 = var1.readUnsignedByte(-2008258038) == 1;
         } else if(17 == var2) {
            this.anInt4002 = var1.readUnsignedShort(108040089) * 1969476791;
         } else if(18 == var2) {
            this.anInt3980 = var1.readInt((byte)5) * 734778259;
         } else if(var2 == 19) {
            this.anInt4033 = var1.readUnsignedByte(-2021596504) * 2124635611;
         } else if(20 == var2) {
            this.anInt3981 = var1.readUnsignedByte(2022310669) * 204824621;
         } else if(var2 == 21) {
            this.anInt3982 = var1.readUnsignedByte(980947289) * -1046475517;
         } else if(var2 == 22) {
            this.anInt3971 = var1.readInt((byte)5) * 812113071;
         } else if(23 == var2) {
            this.anInt3972 = var1.readUnsignedByte(2037958980) * 544839761;
         } else if(var2 == 24) {
            this.aBool3960 = false;
         } else if(var2 == 25) {
            var5 = var1.readUnsignedByte(-1771231400);
            this.anIntArray3989 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3989[var4] = var1.readUnsignedShort(1068381190);
            }
         } else if(var2 == 26) {
            this.aBool4001 = false;
         } else if(27 == var2) {
            this.anInt3975 = (var1.readUnsignedShort(666076465) << 12 << 2) * 1257650331;
         } else if(28 == var2) {
            this.anInt4014 = var1.readUnsignedByte(62513996) * -1117396183;
         } else if(var2 == 29) {
            if(var1.readUnsignedByte(-8312804) == 0) {
               this.anInt4006 = (this.anInt4007 = var1.readShort((byte)1) * 1712293512) * 183614651;
            } else {
               this.anInt4006 = var1.readShort((byte)1) * -366271144;
               this.anInt4007 = var1.readShort((byte)1) * 1712293512;
            }
         } else if(var2 == 30) {
            this.aBool4029 = true;
         } else if(var2 == 31) {
            this.anInt4020 = (var1.readUnsignedShort(1218774064) << 12 << 2) * 1761621275;
            this.anInt3974 = (var1.readUnsignedShort(1401426170) << 12 << 2) * 90899425;
         } else if(var2 == 32) {
            this.aBool4009 = false;
         } else if(var2 == 33) {
            this.aBool3976 = true;
         } else if(var2 == 34) {
            this.aBool4011 = false;
         } else if(35 == var2) {
            if(var1.readUnsignedByte(-1276098157) == 0) {
               this.anInt4003 = (this.anInt3988 = var1.readShort((byte)1) * 1107956808) * -255214351;
            } else {
               this.anInt4003 = var1.readShort((byte)1) * -18221112;
               this.anInt3988 = var1.readShort((byte)1) * 1107956808;
               this.anInt4005 = var1.readUnsignedByte(1395019728) * 1308693291;
            }
         } else if(36 == var2) {
            this.aBool4012 = true;
         }
      }

   }

   void method4742(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.aShort3963 = (short)var1.readUnsignedShort(1818560089);
         this.aShort3964 = (short)var1.readUnsignedShort(1034890821);
         this.aShort3965 = (short)var1.readUnsignedShort(1601984753);
         this.aShort3966 = (short)var1.readUnsignedShort(1662647626);
         byte var3 = 3;
         this.aShort3963 = (short)(this.aShort3963 << var3);
         this.aShort3964 = (short)(this.aShort3964 << var3);
         this.aShort3965 = (short)(this.aShort3965 << var3);
         this.aShort3966 = (short)(this.aShort3966 << var3);
      } else if(2 == var2) {
         var1.readUnsignedByte(1856402028);
      } else if(3 == var2) {
         this.anInt3967 = var1.readInt((byte)5) * -1939532645;
         this.anInt3968 = var1.readInt((byte)5) * 363550731;
      } else if(var2 == 4) {
         this.anInt3969 = var1.readUnsignedByte(1611417068) * 588073017;
         this.anInt4022 = var1.readByte((byte)71) * 1760371491;
      } else if(var2 == 5) {
         this.anInt4020 = (this.anInt3974 = (var1.readUnsignedShort(980867403) << 12 << 2) * 90899425) * -1388291973;
      } else if(6 == var2) {
         this.anInt3977 = var1.readInt((byte)5) * -650507995;
         this.anInt3999 = var1.readInt((byte)5) * -1967445647;
      } else if(var2 == 7) {
         this.anInt4024 = var1.readUnsignedShort(275606101) * 972665181;
         this.anInt3985 = var1.readUnsignedShort(1056591784) * 1537495981;
      } else if(8 == var2) {
         this.anInt3983 = var1.readUnsignedShort(795596439) * -1374595275;
         this.anInt3987 = var1.readUnsignedShort(1655282639) * 264765831;
      } else {
         int var4;
         int var5;
         if(var2 == 9) {
            var5 = var1.readUnsignedByte(2666261);
            this.anIntArray3973 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3973[var4] = var1.readUnsignedShort(2136993457);
            }
         } else if(10 == var2) {
            var5 = var1.readUnsignedByte(609413311);
            this.anIntArray3984 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3984[var4] = var1.readUnsignedShort(937345010);
            }
         } else if(12 == var2) {
            this.anInt4035 = var1.readByte((byte)117) * -1711723309;
         } else if(var2 == 13) {
            this.anInt3994 = var1.readByte((byte)73) * 1965130027;
         } else if(14 == var2) {
            this.anInt3995 = var1.readUnsignedShort(1303015207) * -1172622705;
         } else if(15 == var2) {
            this.anInt3979 = var1.readUnsignedShort(1174397719) * -845474187;
         } else if(16 == var2) {
            this.aBool3996 = var1.readUnsignedByte(827214289) == 1;
            this.anInt3998 = var1.readUnsignedShort(1075591308) * -16916557;
            this.anInt4004 = var1.readUnsignedShort(659120401) * -1431288223;
            this.aBool3997 = var1.readUnsignedByte(-1254866431) == 1;
         } else if(17 == var2) {
            this.anInt4002 = var1.readUnsignedShort(910679386) * 1969476791;
         } else if(18 == var2) {
            this.anInt3980 = var1.readInt((byte)5) * 734778259;
         } else if(var2 == 19) {
            this.anInt4033 = var1.readUnsignedByte(1706849524) * 2124635611;
         } else if(20 == var2) {
            this.anInt3981 = var1.readUnsignedByte(-1412483995) * 204824621;
         } else if(var2 == 21) {
            this.anInt3982 = var1.readUnsignedByte(2077170417) * -1046475517;
         } else if(var2 == 22) {
            this.anInt3971 = var1.readInt((byte)5) * 812113071;
         } else if(23 == var2) {
            this.anInt3972 = var1.readUnsignedByte(1506112037) * 544839761;
         } else if(var2 == 24) {
            this.aBool3960 = false;
         } else if(var2 == 25) {
            var5 = var1.readUnsignedByte(1124376429);
            this.anIntArray3989 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3989[var4] = var1.readUnsignedShort(1438948797);
            }
         } else if(var2 == 26) {
            this.aBool4001 = false;
         } else if(27 == var2) {
            this.anInt3975 = (var1.readUnsignedShort(2071064023) << 12 << 2) * 1257650331;
         } else if(28 == var2) {
            this.anInt4014 = var1.readUnsignedByte(922242195) * -1117396183;
         } else if(var2 == 29) {
            if(var1.readUnsignedByte(-192241329) == 0) {
               this.anInt4006 = (this.anInt4007 = var1.readShort((byte)1) * 1712293512) * 183614651;
            } else {
               this.anInt4006 = var1.readShort((byte)1) * -366271144;
               this.anInt4007 = var1.readShort((byte)1) * 1712293512;
            }
         } else if(var2 == 30) {
            this.aBool4029 = true;
         } else if(var2 == 31) {
            this.anInt4020 = (var1.readUnsignedShort(710181010) << 12 << 2) * 1761621275;
            this.anInt3974 = (var1.readUnsignedShort(1483608239) << 12 << 2) * 90899425;
         } else if(var2 == 32) {
            this.aBool4009 = false;
         } else if(var2 == 33) {
            this.aBool3976 = true;
         } else if(var2 == 34) {
            this.aBool4011 = false;
         } else if(35 == var2) {
            if(var1.readUnsignedByte(-656872274) == 0) {
               this.anInt4003 = (this.anInt3988 = var1.readShort((byte)1) * 1107956808) * -255214351;
            } else {
               this.anInt4003 = var1.readShort((byte)1) * -18221112;
               this.anInt3988 = var1.readShort((byte)1) * 1107956808;
               this.anInt4005 = var1.readUnsignedByte(995806670) * 1308693291;
            }
         } else if(36 == var2) {
            this.aBool4012 = true;
         }
      }

   }

   void method4743(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.aShort3963 = (short)var1.readUnsignedShort(1728365399);
         this.aShort3964 = (short)var1.readUnsignedShort(263879770);
         this.aShort3965 = (short)var1.readUnsignedShort(1293554809);
         this.aShort3966 = (short)var1.readUnsignedShort(889300750);
         byte var3 = 3;
         this.aShort3963 = (short)(this.aShort3963 << var3);
         this.aShort3964 = (short)(this.aShort3964 << var3);
         this.aShort3965 = (short)(this.aShort3965 << var3);
         this.aShort3966 = (short)(this.aShort3966 << var3);
      } else if(2 == var2) {
         var1.readUnsignedByte(-864451414);
      } else if(3 == var2) {
         this.anInt3967 = var1.readInt((byte)5) * -1939532645;
         this.anInt3968 = var1.readInt((byte)5) * 363550731;
      } else if(var2 == 4) {
         this.anInt3969 = var1.readUnsignedByte(657970306) * 588073017;
         this.anInt4022 = var1.readByte((byte)58) * 1760371491;
      } else if(var2 == 5) {
         this.anInt4020 = (this.anInt3974 = (var1.readUnsignedShort(1085854679) << 12 << 2) * 90899425) * -1388291973;
      } else if(6 == var2) {
         this.anInt3977 = var1.readInt((byte)5) * -650507995;
         this.anInt3999 = var1.readInt((byte)5) * -1967445647;
      } else if(var2 == 7) {
         this.anInt4024 = var1.readUnsignedShort(1221612416) * 972665181;
         this.anInt3985 = var1.readUnsignedShort(1086770763) * 1537495981;
      } else if(8 == var2) {
         this.anInt3983 = var1.readUnsignedShort(1975579147) * -1374595275;
         this.anInt3987 = var1.readUnsignedShort(1963862053) * 264765831;
      } else {
         int var4;
         int var5;
         if(var2 == 9) {
            var5 = var1.readUnsignedByte(-405403002);
            this.anIntArray3973 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3973[var4] = var1.readUnsignedShort(1527611933);
            }
         } else if(10 == var2) {
            var5 = var1.readUnsignedByte(-1865708430);
            this.anIntArray3984 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3984[var4] = var1.readUnsignedShort(1053408610);
            }
         } else if(12 == var2) {
            this.anInt4035 = var1.readByte((byte)14) * -1711723309;
         } else if(var2 == 13) {
            this.anInt3994 = var1.readByte((byte)47) * 1965130027;
         } else if(14 == var2) {
            this.anInt3995 = var1.readUnsignedShort(1110593988) * -1172622705;
         } else if(15 == var2) {
            this.anInt3979 = var1.readUnsignedShort(1033118233) * -845474187;
         } else if(16 == var2) {
            this.aBool3996 = var1.readUnsignedByte(-1381758054) == 1;
            this.anInt3998 = var1.readUnsignedShort(1829604378) * -16916557;
            this.anInt4004 = var1.readUnsignedShort(371818655) * -1431288223;
            this.aBool3997 = var1.readUnsignedByte(-1104651733) == 1;
         } else if(17 == var2) {
            this.anInt4002 = var1.readUnsignedShort(1826400798) * 1969476791;
         } else if(18 == var2) {
            this.anInt3980 = var1.readInt((byte)5) * 734778259;
         } else if(var2 == 19) {
            this.anInt4033 = var1.readUnsignedByte(1516382503) * 2124635611;
         } else if(20 == var2) {
            this.anInt3981 = var1.readUnsignedByte(1325459143) * 204824621;
         } else if(var2 == 21) {
            this.anInt3982 = var1.readUnsignedByte(-631714332) * -1046475517;
         } else if(var2 == 22) {
            this.anInt3971 = var1.readInt((byte)5) * 812113071;
         } else if(23 == var2) {
            this.anInt3972 = var1.readUnsignedByte(-2146813952) * 544839761;
         } else if(var2 == 24) {
            this.aBool3960 = false;
         } else if(var2 == 25) {
            var5 = var1.readUnsignedByte(-2017022826);
            this.anIntArray3989 = new int[var5];

            for(var4 = 0; var4 < var5; ++var4) {
               this.anIntArray3989[var4] = var1.readUnsignedShort(345385095);
            }
         } else if(var2 == 26) {
            this.aBool4001 = false;
         } else if(27 == var2) {
            this.anInt3975 = (var1.readUnsignedShort(262205178) << 12 << 2) * 1257650331;
         } else if(28 == var2) {
            this.anInt4014 = var1.readUnsignedByte(-1641203385) * -1117396183;
         } else if(var2 == 29) {
            if(var1.readUnsignedByte(-7563368) == 0) {
               this.anInt4006 = (this.anInt4007 = var1.readShort((byte)1) * 1712293512) * 183614651;
            } else {
               this.anInt4006 = var1.readShort((byte)1) * -366271144;
               this.anInt4007 = var1.readShort((byte)1) * 1712293512;
            }
         } else if(var2 == 30) {
            this.aBool4029 = true;
         } else if(var2 == 31) {
            this.anInt4020 = (var1.readUnsignedShort(1420866189) << 12 << 2) * 1761621275;
            this.anInt3974 = (var1.readUnsignedShort(353321501) << 12 << 2) * 90899425;
         } else if(var2 == 32) {
            this.aBool4009 = false;
         } else if(var2 == 33) {
            this.aBool3976 = true;
         } else if(var2 == 34) {
            this.aBool4011 = false;
         } else if(35 == var2) {
            if(var1.readUnsignedByte(225297863) == 0) {
               this.anInt4003 = (this.anInt3988 = var1.readShort((byte)1) * 1107956808) * -255214351;
            } else {
               this.anInt4003 = var1.readShort((byte)1) * -18221112;
               this.anInt3988 = var1.readShort((byte)1) * 1107956808;
               this.anInt4005 = var1.readUnsignedByte(39141742) * 1308693291;
            }
         } else if(36 == var2) {
            this.aBool4012 = true;
         }
      }

   }

   void method4744(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.aShort3963 = (short)var1.readUnsignedShort(808277912);
         this.aShort3964 = (short)var1.readUnsignedShort(2059566134);
         this.aShort3965 = (short)var1.readUnsignedShort(1805531116);
         this.aShort3966 = (short)var1.readUnsignedShort(2032445961);
         byte var4 = 3;
         this.aShort3963 = (short)(this.aShort3963 << var4);
         this.aShort3964 = (short)(this.aShort3964 << var4);
         this.aShort3965 = (short)(this.aShort3965 << var4);
         this.aShort3966 = (short)(this.aShort3966 << var4);
      } else if(2 == var2) {
         var1.readUnsignedByte(-1506943835);
      } else if(3 == var2) {
         this.anInt3967 = var1.readInt((byte)5) * -1939532645;
         this.anInt3968 = var1.readInt((byte)5) * 363550731;
      } else if(var2 == 4) {
         this.anInt3969 = var1.readUnsignedByte(2001258718) * 588073017;
         this.anInt4022 = var1.readByte((byte)71) * 1760371491;
      } else if(var2 == 5) {
         this.anInt4020 = (this.anInt3974 = (var1.readUnsignedShort(164987344) << 12 << 2) * 90899425) * -1388291973;
      } else if(6 == var2) {
         this.anInt3977 = var1.readInt((byte)5) * -650507995;
         this.anInt3999 = var1.readInt((byte)5) * -1967445647;
      } else if(var2 == 7) {
         this.anInt4024 = var1.readUnsignedShort(1519429818) * 972665181;
         this.anInt3985 = var1.readUnsignedShort(922878334) * 1537495981;
      } else if(8 == var2) {
         this.anInt3983 = var1.readUnsignedShort(1981054503) * -1374595275;
         this.anInt3987 = var1.readUnsignedShort(556556002) * 264765831;
      } else {
         int var5;
         int var6;
         if(var2 == 9) {
            var6 = var1.readUnsignedByte(1233224432);
            this.anIntArray3973 = new int[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.anIntArray3973[var5] = var1.readUnsignedShort(625652913);
            }
         } else if(10 == var2) {
            var6 = var1.readUnsignedByte(1104769421);
            this.anIntArray3984 = new int[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.anIntArray3984[var5] = var1.readUnsignedShort(575932418);
            }
         } else if(12 == var2) {
            this.anInt4035 = var1.readByte((byte)111) * -1711723309;
         } else if(var2 == 13) {
            this.anInt3994 = var1.readByte((byte)78) * 1965130027;
         } else if(14 == var2) {
            this.anInt3995 = var1.readUnsignedShort(991618531) * -1172622705;
         } else if(15 == var2) {
            this.anInt3979 = var1.readUnsignedShort(1398598858) * -845474187;
         } else if(16 == var2) {
            this.aBool3996 = var1.readUnsignedByte(-160269069) == 1;
            this.anInt3998 = var1.readUnsignedShort(1925961756) * -16916557;
            this.anInt4004 = var1.readUnsignedShort(522669260) * -1431288223;
            this.aBool3997 = var1.readUnsignedByte(-417792309) == 1;
         } else if(17 == var2) {
            this.anInt4002 = var1.readUnsignedShort(1948038434) * 1969476791;
         } else if(18 == var2) {
            this.anInt3980 = var1.readInt((byte)5) * 734778259;
         } else if(var2 == 19) {
            this.anInt4033 = var1.readUnsignedByte(1504061625) * 2124635611;
         } else if(20 == var2) {
            this.anInt3981 = var1.readUnsignedByte(1817017385) * 204824621;
         } else if(var2 == 21) {
            this.anInt3982 = var1.readUnsignedByte(-1115619583) * -1046475517;
         } else if(var2 == 22) {
            this.anInt3971 = var1.readInt((byte)5) * 812113071;
         } else if(23 == var2) {
            this.anInt3972 = var1.readUnsignedByte(2005520853) * 544839761;
         } else if(var2 == 24) {
            this.aBool3960 = false;
         } else if(var2 == 25) {
            var6 = var1.readUnsignedByte(-1368658616);
            this.anIntArray3989 = new int[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.anIntArray3989[var5] = var1.readUnsignedShort(1928323783);
            }
         } else if(var2 == 26) {
            this.aBool4001 = false;
         } else if(27 == var2) {
            this.anInt3975 = (var1.readUnsignedShort(279928157) << 12 << 2) * 1257650331;
         } else if(28 == var2) {
            this.anInt4014 = var1.readUnsignedByte(1805931810) * -1117396183;
         } else if(var2 == 29) {
            if(var1.readUnsignedByte(-1969536804) == 0) {
               this.anInt4006 = (this.anInt4007 = var1.readShort((byte)1) * 1712293512) * 183614651;
            } else {
               this.anInt4006 = var1.readShort((byte)1) * -366271144;
               this.anInt4007 = var1.readShort((byte)1) * 1712293512;
            }
         } else if(var2 == 30) {
            this.aBool4029 = true;
         } else if(var2 == 31) {
            this.anInt4020 = (var1.readUnsignedShort(186232095) << 12 << 2) * 1761621275;
            this.anInt3974 = (var1.readUnsignedShort(736894945) << 12 << 2) * 90899425;
         } else if(var2 == 32) {
            this.aBool4009 = false;
         } else if(var2 == 33) {
            this.aBool3976 = true;
         } else if(var2 == 34) {
            this.aBool4011 = false;
         } else if(35 == var2) {
            if(var1.readUnsignedByte(-1946430946) == 0) {
               this.anInt4003 = (this.anInt3988 = var1.readShort((byte)1) * 1107956808) * -255214351;
            } else {
               this.anInt4003 = var1.readShort((byte)1) * -18221112;
               this.anInt3988 = var1.readShort((byte)1) * 1107956808;
               this.anInt4005 = var1.readUnsignedByte(-1237372177) * 1308693291;
            }
         } else if(36 == var2) {
            this.aBool4012 = true;
         }
      }

   }

   void method4745() {
      if(this.anInt4035 * -2105537701 > -2 || 1876374915 * this.anInt3994 > -2) {
         this.aBool4021 = true;
      }

      this.anInt4010 = 79665249 * (1543301805 * this.anInt3977 >> 16 & 255);
      this.anInt4015 = 1283019065 * (2052749201 * this.anInt3999 >> 16 & 255);
      this.anInt4016 = 1244489199 * this.anInt4015 - -848924521 * this.anInt4010;
      this.anInt4017 = (this.anInt3977 * 1543301805 >> 8 & 255) * -1479244641;
      this.anInt4018 = (this.anInt3999 * 2052749201 >> 8 & 255) * 807677971;
      this.anInt4019 = -543864275 * this.anInt4018 - this.anInt4017 * -1881874359;
      this.anInt4023 = -171706493 * (this.anInt3977 * 1543301805 & 255);
      this.anInt4000 = (this.anInt3999 * 2052749201 & 255) * -1092578747;
      this.anInt3961 = 1694859039 * this.anInt4000 - this.anInt4023 * -531259575;
      this.anInt3992 = -2051839859 * (1543301805 * this.anInt3977 >> 24 & 255);
      this.anInt3978 = (2052749201 * this.anInt3999 >> 24 & 255) * 1677236613;
      this.anInt4032 = this.anInt3978 * 626489705 - 62069761 * this.anInt3992;
      if(-1851178341 * this.anInt3980 != 0) {
         this.anInt4026 = this.anInt3981 * -1033113691 * this.anInt3985 * 1098680357 / 100 * -1316773363;
         this.anInt4027 = 1262422547 * (this.anInt3982 * -245578325 * 1098680357 * this.anInt3985 / 100);
         if(0 == this.anInt4026 * -1064403771) {
            this.anInt4026 = -1316773363;
         }

         this.anInt4028 = ((this.anInt3980 * -1851178341 >> 16 & 255) - (-25742201 * this.anInt4016 / 2 + this.anInt4010 * 1209338785) << 8) / (-1064403771 * this.anInt4026) * 110994567;
         this.anInt3990 = -1019604031 * (((this.anInt3980 * -1851178341 >> 8 & 255) - (1215797087 * this.anInt4017 + -711292313 * this.anInt4019 / 2) << 8) / (-1064403771 * this.anInt4026));
         this.anInt4030 = -2034232179 * (((-1851178341 * this.anInt3980 & 255) - (-815016237 * this.anInt3961 / 2 + this.anInt4023 * 339496747) << 8) / (this.anInt4026 * -1064403771));
         if(343691291 * this.anInt4027 == 0) {
            this.anInt4027 = 1262422547;
         }

         this.anInt4031 = ((-1851178341 * this.anInt3980 >> 24 & 255) - (-571339195 * this.anInt4032 / 2 + this.anInt3992 * 549493317) << 8) / (343691291 * this.anInt4027) * -1444472359;
         this.anInt4028 += (this.anInt4028 * 235004215 > 0?-4:4) * 110994567;
         this.anInt3990 += -1019604031 * (this.anInt3990 * -1164968895 > 0?-4:4);
         this.anInt4030 += -2034232179 * (1857408581 * this.anInt4030 > 0?-4:4);
         this.anInt4031 += (this.anInt4031 * -241969559 > 0?-4:4) * -1444472359;
      }

      if(-1 != -2137982385 * this.anInt3971) {
         this.anInt3993 = this.anInt3972 * 1213640881 * this.anInt3985 * 1098680357 / 100 * -2011347031;
         if(0 == -945140583 * this.anInt3993) {
            this.anInt3993 = -2011347031;
         }

         this.anInt3970 = 1210179609 * ((this.anInt3971 * -2137982385 - ((944665507 * this.anInt3968 - -1736265325 * this.anInt3967) / 2 + -1736265325 * this.anInt3967)) / (-945140583 * this.anInt3993));
      }

      if(this.anInt3975 * 1124265363 != -1) {
         this.anInt4034 = this.anInt4014 * 620325145 * 1098680357 * this.anInt3985 / 100 * 2133435989;
         if(this.anInt4034 * 1519265533 == 0) {
            this.anInt4034 = 2133435989;
         }

         this.anInt4008 = (this.anInt3975 * 1124265363 - ((868515873 * this.anInt3974 - -1805116141 * this.anInt4020) / 2 + this.anInt4020 * -1805116141)) / (1519265533 * this.anInt4034) * 1125494529;
      }

      this.anInt4036 = this.anInt3988 * -559070439 - this.anInt4003 * 890767529;
      this.anInt4037 = -658964465 * this.anInt4007 - -1919131971 * this.anInt4006;
   }

   public static boolean method4746(int var0, byte var1) {
      return var0 == 0 || var0 == 14 || 8 == var0 || 6 == var0;
   }

   public static boolean method4747(int var0, int var1, byte var2) {
      if(null != Class641.aClass361_8348 && Class641.aClass361_8348.method4617((byte)110) != null) {
         if(var0 == var1) {
            return true;
         } else {
            Class378 var3 = Class641.aClass361_8348.method4617((byte)89).method4581(var0, (byte)24);
            Class378 var4 = Class641.aClass361_8348.method4617((byte)85).method4581(var1, (byte)-38);
            Class378 var5 = var3;

            do {
               if(var5 == null) {
                  var5 = var4;

                  do {
                     if(null == var5) {
                        return false;
                     }

                     var5 = var5.method4683(-395720737);
                     if(var5 == var3) {
                        return true;
                     }
                  } while(var4 != var5);

                  return false;
               }

               var5 = var5.method4683(-1066072955);
               if(var4 == var5) {
                  return true;
               }
            } while(var3 != var5);

            return false;
         }
      } else {
         return false;
      }
   }

   static void method4748(int var0) {
      if(null != Class90.aFileOutputStream863) {
         try {
            Class90.aFileOutputStream863.close();
         } catch (IOException var2) {
            ;
         }
      }

      Class90.aFileOutputStream863 = null;
   }

   static final void method4749(Class681 var0, int var1) {
      if(client.aBool10981) {
         Class413.aClass413_4443.method4915((byte)1);
      }

   }
}
