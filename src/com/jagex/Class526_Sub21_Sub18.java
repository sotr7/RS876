package com.jagex;

import com.jagex.Class329_Sub3_Sub2;
import com.jagex.Class526_Sub21;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;
import com.jagex.Class69;
import com.jagex.Class91;

public class Class526_Sub21_Sub18 extends Class526_Sub21 {
   public String aString11849;
   public int[] anIntArray11848;
   public char[] aCharArray11850;
   public int[] anIntArray11851;
   public char[] aCharArray11852;

   void method10720(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1999917162);
         if(var2 == 0) {
            return;
         }

         this.method10722(var1, var2, -1482703597);
      }
   }

   void method10721(RSByteBuffer var1, byte var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1276359958);
         if(var3 == 0) {
            return;
         }

         this.method10722(var1, var3, 1795373976);
      }
   }

   void method10722(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.aString11849 = var1.readString(1658398228);
      } else {
         int var4;
         int var5;
         byte var6;
         if(var2 == 2) {
            var4 = var1.readUnsignedByte(78482206);
            this.anIntArray11848 = new int[var4];
            this.aCharArray11850 = new char[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray11848[var5] = var1.readUnsignedShort(748999317);
               var6 = var1.readByte((byte)101);
               this.aCharArray11850[var5] = 0 == var6?0:Class69.method1087(var6, (short)18882);
            }
         } else if(var2 == 3) {
            var4 = var1.readUnsignedByte(730479317);
            this.anIntArray11851 = new int[var4];
            this.aCharArray11852 = new char[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray11851[var5] = var1.readUnsignedShort(1093346697);
               var6 = var1.readByte((byte)53);
               this.aCharArray11852[var5] = var6 == 0?0:Class69.method1087(var6, (short)23499);
            }
         } else if(var2 == 4) {
            ;
         }
      }

   }

   public int method10723(char var1, int var2) {
      if(this.anIntArray11848 == null) {
         return -1;
      } else {
         for(int var3 = 0; var3 < this.anIntArray11848.length; ++var3) {
            if(var1 == this.aCharArray11850[var3]) {
               return this.anIntArray11848[var3];
            }
         }

         return -1;
      }
   }

   void method10724(byte var1) {
      int var2;
      if(null != this.anIntArray11851) {
         for(var2 = 0; var2 < this.anIntArray11851.length; ++var2) {
            this.anIntArray11851[var2] |= '\u8000';
         }
      }

      if(this.anIntArray11848 != null) {
         for(var2 = 0; var2 < this.anIntArray11848.length; ++var2) {
            this.anIntArray11848[var2] |= '\u8000';
         }
      }

   }

   void method10725() {
      int var1;
      if(null != this.anIntArray11851) {
         for(var1 = 0; var1 < this.anIntArray11851.length; ++var1) {
            this.anIntArray11851[var1] |= '\u8000';
         }
      }

      if(this.anIntArray11848 != null) {
         for(var1 = 0; var1 < this.anIntArray11848.length; ++var1) {
            this.anIntArray11848[var1] |= '\u8000';
         }
      }

   }

   void method10726(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1795904194);
         if(var2 == 0) {
            return;
         }

         this.method10722(var1, var2, 1124980491);
      }
   }

   void method10727(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1064252406);
         if(var2 == 0) {
            return;
         }

         this.method10722(var1, var2, 1630274151);
      }
   }

   void method10728() {
      int var1;
      if(null != this.anIntArray11851) {
         for(var1 = 0; var1 < this.anIntArray11851.length; ++var1) {
            this.anIntArray11851[var1] |= '\u8000';
         }
      }

      if(this.anIntArray11848 != null) {
         for(var1 = 0; var1 < this.anIntArray11848.length; ++var1) {
            this.anIntArray11848[var1] |= '\u8000';
         }
      }

   }

   public int method10729(char var1, int var2) {
      if(null == this.anIntArray11851) {
         return -1;
      } else {
         for(int var3 = 0; var3 < this.anIntArray11851.length; ++var3) {
            if(this.aCharArray11852[var3] == var1) {
               return this.anIntArray11851[var3];
            }
         }

         return -1;
      }
   }

   static Class91[] method10730(byte var0) {
      return new Class91[]{Class91.aClass91_866, Class91.aClass91_864, Class91.aClass91_869, Class91.aClass91_884, Class91.aClass91_877, Class91.aClass91_888, Class91.aClass91_890, Class91.aClass91_865, Class91.aClass91_878, Class91.aClass91_871, Class91.aClass91_889, Class91.aClass91_883, Class91.aClass91_891, Class91.aClass91_876, Class91.aClass91_885, Class91.aClass91_879, Class91.aClass91_892, Class91.aClass91_873, Class91.aClass91_882, Class91.aClass91_867, Class91.aClass91_874, Class91.aClass91_881, Class91.aClass91_886, Class91.aClass91_887, Class91.aClass91_893, Class91.aClass91_880, Class91.aClass91_872, Class91.aClass91_868, Class91.aClass91_875, Class91.aClass91_870, Class91.aClass91_894};
   }

   static final void method10731(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class329_Sub3_Sub2.method10493(var2, -1075032121);
   }
}
