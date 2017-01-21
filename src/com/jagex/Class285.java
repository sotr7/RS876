package com.jagex;

import com.jagex.Class143;
import com.jagex.Class20;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class317;
import com.jagex.Class45;
import com.jagex.Class452;
import com.jagex.Class474;
import com.jagex.Class526;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class661;
import com.jagex.Class692;
import com.jagex.Class82;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface17;
import com.jagex.Interface19;
import com.jagex.Interface73;

public class Class285 implements Interface12 {
   public String aString3081;
   public String aString3075;
   int[][] anIntArrayArray3094;
   int[][] anIntArrayArray3077;
   public int anInt3078 = 0;
   public int anInt3079 = 0;
   public boolean aBool3074 = false;
   public int anInt3083;
   int[] anIntArray3082;
   public int[] anIntArray3076;
   public int[][] anIntArrayArray3084;
   public int anInt3085;
   public int anInt3095 = -1125205785;
   public int[] anIntArray3086;
   int[] anIntArray3088;
   int[] anIntArray3073;
   public String[] aStringArray3089;
   public int[] anIntArray3090;
   int[] anIntArray3091;
   int[] anIntArray3092;
   public String[] aStringArray3093;
   Class20 aClass20_3080;
   Interface14 anInterface14_3087;

   public boolean method3783(Interface19 var1, int var2) {
      return Class474.method5648(var1, this.anInterface14_3087, 736210669) >= 523990267 * this.anInt3085;
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1495091477);
         if(0 == var3) {
            return;
         }

         this.method3784(var1, var3, 297481246);
      }
   }

   void method3784(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.aString3081 = var1.method9637(-1495866034);
      } else if(var2 == 2) {
         this.aString3075 = var1.method9637(-1495866034);
      } else {
         int var4;
         int var5;
         if(3 == var2) {
            var4 = var1.readUnsignedByte(-1337056106);
            this.anIntArrayArray3094 = new int[var4][3];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArrayArray3094[var5][0] = var1.readUnsignedShort(418779142);
               this.anIntArrayArray3094[var5][1] = var1.readInt((byte)5);
               this.anIntArrayArray3094[var5][2] = var1.readInt((byte)5);
            }
         } else if(var2 == 4) {
            var4 = var1.readUnsignedByte(1009311703);
            this.anIntArrayArray3077 = new int[var4][3];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArrayArray3077[var5][0] = var1.readUnsignedShort(2062845080);
               this.anIntArrayArray3077[var5][1] = var1.readInt((byte)5);
               this.anIntArrayArray3077[var5][2] = var1.readInt((byte)5);
            }
         } else if(5 == var2) {
            var1.readUnsignedShort(1756847861);
         } else if(var2 == 6) {
            this.anInt3078 = var1.readUnsignedByte(-361651079) * -2084186769;
         } else if(7 == var2) {
            this.anInt3079 = var1.readUnsignedByte(-1121638616) * -1080809475;
         } else if(8 == var2) {
            this.aBool3074 = true;
         } else if(9 == var2) {
            this.anInt3083 = var1.readUnsignedByte(-1301679852) * 1981068385;
         } else if(var2 == 10) {
            var4 = var1.readUnsignedByte(663877698);
            this.anIntArray3082 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray3082[var5] = var1.readInt((byte)5);
            }
         } else if(var2 == 12) {
            var1.readInt((byte)5);
         } else if(var2 == 13) {
            var4 = var1.readUnsignedByte(44367635);
            this.anIntArray3076 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray3076[var5] = var1.readUnsignedShort(792299835);
            }
         } else if(14 == var2) {
            var4 = var1.readUnsignedByte(726488762);
            this.anIntArrayArray3084 = new int[var4][2];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArrayArray3084[var5][0] = var1.readUnsignedByte(-797173449);
               this.anIntArrayArray3084[var5][1] = var1.readUnsignedByte(1903726695);
            }
         } else if(15 == var2) {
            this.anInt3085 = var1.readUnsignedShort(1256628780) * -1594591693;
         } else if(17 == var2) {
            this.anInt3095 = var1.readBigSmart((byte)65) * 1125205785;
         } else if(18 == var2) {
            var4 = var1.readUnsignedByte(2066254062);
            this.anIntArray3086 = new int[var4];
            this.anIntArray3088 = new int[var4];
            this.anIntArray3073 = new int[var4];
            this.aStringArray3089 = new String[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray3086[var5] = var1.readInt((byte)5);
               this.anIntArray3088[var5] = var1.readInt((byte)5);
               this.anIntArray3073[var5] = var1.readInt((byte)5);
               this.aStringArray3089[var5] = var1.readString(595432926);
            }
         } else if(19 == var2) {
            var4 = var1.readUnsignedByte(593952879);
            this.anIntArray3090 = new int[var4];
            this.anIntArray3091 = new int[var4];
            this.anIntArray3092 = new int[var4];
            this.aStringArray3093 = new String[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray3090[var5] = var1.readInt((byte)5);
               this.anIntArray3091[var5] = var1.readInt((byte)5);
               this.anIntArray3092[var5] = var1.readInt((byte)5);
               this.aStringArray3093[var5] = var1.readString(-1178405460);
            }
         } else if(249 == var2) {
            var4 = var1.readUnsignedByte(-581945378);
            if(null == this.aClass20_3080) {
               var5 = Class692.method8110(var4, -1930906054);
               this.aClass20_3080 = new Class20(var5);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               boolean var6 = var1.readUnsignedByte(1906045788) == 1;
               int var7 = var1.read24BitInt(742041327);
               Object var8;
               if(var6) {
                  var8 = new LinkableObject(var1.readString(1093117653));
               } else {
                  var8 = new Class526_Sub25(var1.readInt((byte)5));
               }

               this.aClass20_3080.put((Class526)var8, (long)var7);
            }
         }
      }

   }

   public void method81(int var1) {
      if(null == this.aString3075) {
         this.aString3075 = this.aString3081;
      }

   }

   public int method3785(int var1, int var2, int var3) {
      if(null == this.aClass20_3080) {
         return var2;
      } else {
         Class526_Sub25 var4 = (Class526_Sub25)this.aClass20_3080.get((long)var1);
         return null == var4?var2:var4.anInt10550 * -1044108751;
      }
   }

   public String method3786(int var1, String var2, int var3) {
      if(null == this.aClass20_3080) {
         return var2;
      } else {
         LinkableObject var4 = (LinkableObject)this.aClass20_3080.get((long)var1);
         return var4 == null?var2:(String)var4.anObject10399;
      }
   }

   public boolean method3787(Interface19 var1, byte var2) {
      int var3;
      if(null != this.anIntArrayArray3094) {
         for(var3 = 0; var3 < this.anIntArrayArray3094.length; ++var3) {
            Class143 var4 = ((Interface17)var1).method106(Class452.aClass452_4946, this.anIntArrayArray3094[var3][0], -1866170338);
            if(var1.method114(var4, -698021597) >= this.anIntArrayArray3094[var3][1]) {
               return true;
            }
         }
      }

      if(this.anIntArrayArray3077 != null) {
         for(var3 = 0; var3 < this.anIntArrayArray3077.length; ++var3) {
            Class317 var5 = ((Interface17)var1).method109(this.anIntArrayArray3077[var3][0], '\uff00');
            if(var1.method116(var5, (byte)11) >= this.anIntArrayArray3077[var3][1]) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method3788(Interface19 var1, int var2, int var3) {
      return null != this.anIntArrayArray3084 && var2 >= 0 && var2 < this.anIntArrayArray3084.length?((Interface73)var1).method493(this.anIntArrayArray3084[var2][0], (byte)34) >= this.anIntArrayArray3084[var2][1]:false;
   }

   void method3789(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.aString3081 = var1.method9637(-1495866034);
      } else if(var2 == 2) {
         this.aString3075 = var1.method9637(-1495866034);
      } else {
         int var3;
         int var4;
         if(3 == var2) {
            var3 = var1.readUnsignedByte(1279865721);
            this.anIntArrayArray3094 = new int[var3][3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArrayArray3094[var4][0] = var1.readUnsignedShort(468088004);
               this.anIntArrayArray3094[var4][1] = var1.readInt((byte)5);
               this.anIntArrayArray3094[var4][2] = var1.readInt((byte)5);
            }
         } else if(var2 == 4) {
            var3 = var1.readUnsignedByte(-591590844);
            this.anIntArrayArray3077 = new int[var3][3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArrayArray3077[var4][0] = var1.readUnsignedShort(1635673126);
               this.anIntArrayArray3077[var4][1] = var1.readInt((byte)5);
               this.anIntArrayArray3077[var4][2] = var1.readInt((byte)5);
            }
         } else if(5 == var2) {
            var1.readUnsignedShort(2012663326);
         } else if(var2 == 6) {
            this.anInt3078 = var1.readUnsignedByte(1766391966) * -2084186769;
         } else if(7 == var2) {
            this.anInt3079 = var1.readUnsignedByte(290230470) * -1080809475;
         } else if(8 == var2) {
            this.aBool3074 = true;
         } else if(9 == var2) {
            this.anInt3083 = var1.readUnsignedByte(-1744232437) * 1981068385;
         } else if(var2 == 10) {
            var3 = var1.readUnsignedByte(776867413);
            this.anIntArray3082 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArray3082[var4] = var1.readInt((byte)5);
            }
         } else if(var2 == 12) {
            var1.readInt((byte)5);
         } else if(var2 == 13) {
            var3 = var1.readUnsignedByte(412516083);
            this.anIntArray3076 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArray3076[var4] = var1.readUnsignedShort(1891453853);
            }
         } else if(14 == var2) {
            var3 = var1.readUnsignedByte(2055784016);
            this.anIntArrayArray3084 = new int[var3][2];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArrayArray3084[var4][0] = var1.readUnsignedByte(1836278051);
               this.anIntArrayArray3084[var4][1] = var1.readUnsignedByte(564558547);
            }
         } else if(15 == var2) {
            this.anInt3085 = var1.readUnsignedShort(919248573) * -1594591693;
         } else if(17 == var2) {
            this.anInt3095 = var1.readBigSmart((byte)20) * 1125205785;
         } else if(18 == var2) {
            var3 = var1.readUnsignedByte(257659277);
            this.anIntArray3086 = new int[var3];
            this.anIntArray3088 = new int[var3];
            this.anIntArray3073 = new int[var3];
            this.aStringArray3089 = new String[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArray3086[var4] = var1.readInt((byte)5);
               this.anIntArray3088[var4] = var1.readInt((byte)5);
               this.anIntArray3073[var4] = var1.readInt((byte)5);
               this.aStringArray3089[var4] = var1.readString(731201981);
            }
         } else if(19 == var2) {
            var3 = var1.readUnsignedByte(261158862);
            this.anIntArray3090 = new int[var3];
            this.anIntArray3091 = new int[var3];
            this.anIntArray3092 = new int[var3];
            this.aStringArray3093 = new String[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.anIntArray3090[var4] = var1.readInt((byte)5);
               this.anIntArray3091[var4] = var1.readInt((byte)5);
               this.anIntArray3092[var4] = var1.readInt((byte)5);
               this.aStringArray3093[var4] = var1.readString(280224043);
            }
         } else if(249 == var2) {
            var3 = var1.readUnsignedByte(1947274209);
            if(null == this.aClass20_3080) {
               var4 = Class692.method8110(var3, -184692401);
               this.aClass20_3080 = new Class20(var4);
            }

            for(var4 = 0; var4 < var3; ++var4) {
               boolean var5 = var1.readUnsignedByte(-1895612654) == 1;
               int var6 = var1.read24BitInt(742041327);
               Object var7;
               if(var5) {
                  var7 = new LinkableObject(var1.readString(-254470710));
               } else {
                  var7 = new Class526_Sub25(var1.readInt((byte)5));
               }

               this.aClass20_3080.put((Class526)var7, (long)var6);
            }
         }
      }

   }

   public boolean method3790(Interface19 var1, int var2) {
      int var3;
      if(this.anIntArrayArray3094 != null) {
         for(var3 = 0; var3 < this.anIntArrayArray3094.length; ++var3) {
            Class143 var4 = ((Interface17)var1).method106(Class452.aClass452_4946, this.anIntArrayArray3094[var3][0], -1701410102);
            if(var1.method114(var4, 1802407447) >= this.anIntArrayArray3094[var3][2]) {
               return true;
            }
         }
      }

      if(null != this.anIntArrayArray3077) {
         for(var3 = 0; var3 < this.anIntArrayArray3077.length; ++var3) {
            Class317 var5 = ((Interface17)var1).method109(this.anIntArrayArray3077[var3][0], '\uff00');
            if(var1.method116(var5, (byte)-21) >= this.anIntArrayArray3077[var3][2]) {
               return true;
            }
         }
      }

      return false;
   }

   Class285(int var1, Interface14 var2) {
      this.anInterface14_3087 = var2;
   }

   public boolean method3791(Interface19 var1, int var2, byte var3) {
      if(this.anIntArray3086 != null && var2 >= 0 && var2 < this.anIntArray3086.length) {
         Class143 var4 = ((Interface17)var1).method106(Class452.aClass452_4946, this.anIntArray3086[var2], -735919753);
         int var5 = var1.method114(var4, 1777008342);
         return var5 >= this.anIntArray3088[var2] && var5 <= this.anIntArray3073[var2];
      } else {
         return false;
      }
   }

   public boolean method3792(Interface19 var1, int var2, int var3) {
      if(this.anIntArray3090 != null && var2 >= 0 && var2 < this.anIntArray3090.length) {
         Class317 var4 = ((Interface17)var1).method109(this.anIntArray3090[var2], '\uff00');
         int var5 = var1.method116(var4, (byte)78);
         return var5 >= this.anIntArray3091[var2] && var5 <= this.anIntArray3092[var2];
      } else {
         return false;
      }
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1544608372);
         if(0 == var2) {
            return;
         }

         this.method3784(var1, var2, -2041177641);
      }
   }

   public boolean method3793(Interface19 var1, int var2) {
      if(Class474.method5648(var1, this.anInterface14_3087, 736210669) < this.anInt3085 * 523990267) {
         return false;
      } else {
         int var3;
         if(this.anIntArrayArray3084 != null) {
            for(var3 = 0; var3 < this.anIntArrayArray3084.length; ++var3) {
               if(((Interface73)var1).method493(this.anIntArrayArray3084[var3][0], (byte)-43) < this.anIntArrayArray3084[var3][1]) {
                  return false;
               }
            }
         }

         if(this.anIntArray3076 != null) {
            for(var3 = 0; var3 < this.anIntArray3076.length; ++var3) {
               if(!((Class285)this.anInterface14_3087.method89(this.anIntArray3076[var3], -738501677)).method3790(var1, 1453293452)) {
                  return false;
               }
            }
         }

         int var5;
         if(this.anIntArray3086 != null) {
            for(var3 = 0; var3 < this.anIntArray3086.length; ++var3) {
               Class143 var4 = ((Interface17)var1).method106(Class452.aClass452_4946, this.anIntArray3086[var3], 1623302661);
               var5 = var1.method114(var4, 560394086);
               if(var5 < this.anIntArray3088[var3] || var5 > this.anIntArray3073[var3]) {
                  return false;
               }
            }
         }

         if(this.anIntArray3090 != null) {
            for(var3 = 0; var3 < this.anIntArray3090.length; ++var3) {
               Class317 var6 = ((Interface17)var1).method109(this.anIntArray3090[var3], '\uff00');
               var5 = var1.method116(var6, (byte)5);
               if(var5 < this.anIntArray3091[var3] || var5 > this.anIntArray3092[var3]) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public void method85() {
      if(null == this.aString3075) {
         this.aString3075 = this.aString3081;
      }

   }

   public boolean method3794(Interface19 var1, int var2, int var3) {
      return this.anIntArray3076 != null && var2 >= 0 && var2 < this.anIntArray3076.length?((Class285)this.anInterface14_3087.method89(this.anIntArray3076[var2], -1874553411)).method3790(var1, 1453293452):false;
   }

   public int method3795(int var1, int var2) {
      if(null == this.aClass20_3080) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_3080.get((long)var1);
         return null == var3?var2:var3.anInt10550 * -1044108751;
      }
   }

   public int method3796(int var1, int var2) {
      if(null == this.aClass20_3080) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_3080.get((long)var1);
         return null == var3?var2:var3.anInt10550 * -1044108751;
      }
   }

   public int method3797(int var1, int var2) {
      if(null == this.aClass20_3080) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_3080.get((long)var1);
         return null == var3?var2:var3.anInt10550 * -1044108751;
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1695071268);
         if(0 == var2) {
            return;
         }

         this.method3784(var1, var2, 770566359);
      }
   }

   static final int method3798(Class82 var0, byte var1) {
      if(null == var0) {
         return 12;
      } else {
         switch(396751345 * var0.anInt839) {
         case 3:
            return 20;
         default:
            return 12;
         }
      }
   }

   public static void method3799(int var0, boolean var1, byte var2) {
      Class661.method7926(var0, Class45.aClass45_560.method920(Class26.aClass673_247, -827840379), var1, 1881555211);
   }

   public static void method3800(int var0, int var1) {
      InterfaceDef.aClass192_2489.method2769(var0, (byte)-2);
      InterfaceDef.aClass192_2492.method2769(var0, (byte)-9);
      InterfaceDef.aClass192_2490.method2769(var0, (byte)-90);
      InterfaceDef.aClass192_2559.method2769(var0, (byte)-16);
   }
}
