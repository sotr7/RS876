package com.jagex;

import com.jagex.Class100;
import com.jagex.Class113;
import com.jagex.Class187;
import com.jagex.Class20;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class29;
import com.jagex.Class315_Sub1;
import com.jagex.Class43;
import com.jagex.Class526;
import com.jagex.Class526_Sub14;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class662_Sub1;
import com.jagex.Class681;
import com.jagex.Class692;

public class Class348 {
   static final byte aByte3619 = 0;
   static final int anInt3621 = 6;
   long aLong3622;
   static final byte aByte3645 = 127;
   static final byte aByte3646 = 126;
   static final byte aByte3647 = 125;
   public static final byte aByte3649 = -1;
   public int anInt3638 = -1249943935;
   public int anInt3637 = -1700200997;
   int[] anIntArray3634;
   int anInt3635 = 0;
   public String aString3624 = null;
   int anInt3625 = 0;
   long[] aLongArray3632;
   public String[] aStringArray3642;
   public byte[] aByteArray3643;
   int[] anIntArray3648;
   public int[] anIntArray3630;
   public boolean[] aBoolArray3628;
   public int anInt3631;
   public int anInt3640;
   long[] aLongArray3626;
   public String[] aStringArray3641;
   Class20 aClass20_3644;
   boolean aBool3620;
   boolean aBool3623;
   public boolean aBool3639;
   public byte aByte3627;
   public byte aByte3633;
   public byte aByte3629;
   public byte aByte3636;

   void method4484() {
      if(this.anInt3631 * -1488926957 == 0) {
         this.anInt3638 = -1249943935;
         this.anInt3637 = -1700200997;
      } else {
         this.anInt3638 = -1249943935;
         this.anInt3637 = -1700200997;
         int var1 = 0;
         byte var2 = this.aByteArray3643[0];

         for(int var3 = 1; var3 < this.anInt3631 * -1488926957; ++var3) {
            if(this.aByteArray3643[var3] > var2) {
               if(125 == var2) {
                  this.anInt3637 = 1700200997 * var1;
               }

               var1 = var3;
               var2 = this.aByteArray3643[var3];
            } else if(this.anInt3637 * 420170157 == -1 && this.aByteArray3643[var3] == 125) {
               this.anInt3637 = var3 * 1700200997;
            }
         }

         this.anInt3638 = var1 * 1249943935;
         if(this.anInt3638 * -2076369281 != -1) {
            this.aByteArray3643[-2076369281 * this.anInt3638] = 126;
         }

      }
   }

   public int[] method4485(byte var1) {
      if(null == this.anIntArray3634) {
         String[] var2 = new String[this.anInt3631 * -1488926957];
         this.anIntArray3634 = new int[-1488926957 * this.anInt3631];

         for(int var3 = 0; var3 < -1488926957 * this.anInt3631; this.anIntArray3634[var3] = var3++) {
            var2[var3] = this.aStringArray3642[var3];
            if(var2[var3] != null) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         Class662_Sub1.method9941(var2, this.anIntArray3634, -1457031489);
      }

      return this.anIntArray3634;
   }

   public int method4486(String var1, byte var2) {
      if(null != var1 && var1.length() != 0) {
         for(int var3 = 0; var3 < this.anInt3631 * -1488926957; ++var3) {
            if(this.aStringArray3642[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int method4487(int var1, int var2, int var3, int var4) {
      int var5 = 31 == var3?-1:(1 << var3 + 1) - 1;
      return (this.anIntArray3648[var1] & var5) >>> var2;
   }

   public Long method4488(int var1, byte var2) {
      if(null == this.aClass20_3644) {
         return null;
      } else {
         Class526 var3 = this.aClass20_3644.get((long)var1);
         return var3 != null && var3 instanceof Class526_Sub14?new Long(5599099635928242931L * ((Class526_Sub14)var3).aLong10455):null;
      }
   }

   public Class348(RSByteBuffer var1) {
      this.method4501(var1, -808498231);
   }

   void method4489(int var1, int var2) {
      if(this.aBool3620) {
         if(this.aLongArray3632 != null) {
            System.arraycopy(this.aLongArray3632, 0, this.aLongArray3632 = new long[var1], 0, this.anInt3631 * -1488926957);
         } else {
            this.aLongArray3632 = new long[var1];
         }
      }

      if(this.aBool3623) {
         if(this.aStringArray3642 != null) {
            System.arraycopy(this.aStringArray3642, 0, this.aStringArray3642 = new String[var1], 0, this.anInt3631 * -1488926957);
         } else {
            this.aStringArray3642 = new String[var1];
         }
      }

      if(null != this.aByteArray3643) {
         System.arraycopy(this.aByteArray3643, 0, this.aByteArray3643 = new byte[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.aByteArray3643 = new byte[var1];
      }

      if(this.anIntArray3648 != null) {
         System.arraycopy(this.anIntArray3648, 0, this.anIntArray3648 = new int[var1], 0, this.anInt3631 * -1488926957);
      } else {
         this.anIntArray3648 = new int[var1];
      }

      if(null != this.anIntArray3630) {
         System.arraycopy(this.anIntArray3630, 0, this.anIntArray3630 = new int[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.anIntArray3630 = new int[var1];
      }

      if(this.aBoolArray3628 != null) {
         System.arraycopy(this.aBoolArray3628, 0, this.aBoolArray3628 = new boolean[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.aBoolArray3628 = new boolean[var1];
      }

   }

   void method4490(long var1, String var3, int var4, byte var5) {
      if(var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if(this.aBool3620 != var1 > 0L) {
         throw new RuntimeException("");
      } else if(null != var3 != this.aBool3623) {
         throw new RuntimeException("");
      } else {
         if(var1 > 0L && (null == this.aLongArray3632 || this.anInt3631 * -1488926957 >= this.aLongArray3632.length) || null != var3 && (this.aStringArray3642 == null || this.anInt3631 * -1488926957 >= this.aStringArray3642.length)) {
            this.method4489(5 + -1488926957 * this.anInt3631, -877208869);
         }

         if(this.aLongArray3632 != null) {
            this.aLongArray3632[-1488926957 * this.anInt3631] = var1;
         }

         if(this.aStringArray3642 != null) {
            this.aStringArray3642[this.anInt3631 * -1488926957] = var3;
         }

         if(this.anInt3638 * -2076369281 == -1) {
            this.anInt3638 = -1110067859 * this.anInt3631;
            this.aByteArray3643[this.anInt3631 * -1488926957] = 126;
         } else {
            this.aByteArray3643[-1488926957 * this.anInt3631] = 0;
         }

         this.anIntArray3648[this.anInt3631 * -1488926957] = 0;
         this.anIntArray3630[-1488926957 * this.anInt3631] = var4;
         this.aBoolArray3628[-1488926957 * this.anInt3631] = false;
         this.anInt3631 += -442229989;
         this.anIntArray3634 = null;
      }
   }

   void method4491(int var1, byte var2) {
      if(var1 >= 0 && var1 < this.anInt3631 * -1488926957) {
         this.anInt3631 -= -442229989;
         this.anIntArray3634 = null;
         if(-1488926957 * this.anInt3631 == 0) {
            this.aLongArray3632 = null;
            this.aStringArray3642 = null;
            this.aByteArray3643 = null;
            this.anIntArray3648 = null;
            this.anIntArray3630 = null;
            this.aBoolArray3628 = null;
            this.anInt3638 = -1249943935;
            this.anInt3637 = -1700200997;
         } else {
            System.arraycopy(this.aByteArray3643, 1 + var1, this.aByteArray3643, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3648, 1 + var1, this.anIntArray3648, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3630, 1 + var1, this.anIntArray3630, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.aBoolArray3628, 1 + var1, this.aBoolArray3628, var1, this.anInt3631 * -1488926957 - var1);
            if(this.aLongArray3632 != null) {
               System.arraycopy(this.aLongArray3632, var1 + 1, this.aLongArray3632, var1, -1488926957 * this.anInt3631 - var1);
            }

            if(null != this.aStringArray3642) {
               System.arraycopy(this.aStringArray3642, var1 + 1, this.aStringArray3642, var1, this.anInt3631 * -1488926957 - var1);
            }

            this.method4492(-2136302779);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method4492(int var1) {
      if(this.anInt3631 * -1488926957 == 0) {
         this.anInt3638 = -1249943935;
         this.anInt3637 = -1700200997;
      } else {
         this.anInt3638 = -1249943935;
         this.anInt3637 = -1700200997;
         int var2 = 0;
         byte var3 = this.aByteArray3643[0];

         for(int var4 = 1; var4 < this.anInt3631 * -1488926957; ++var4) {
            if(this.aByteArray3643[var4] > var3) {
               if(125 == var3) {
                  this.anInt3637 = 1700200997 * var2;
               }

               var2 = var4;
               var3 = this.aByteArray3643[var4];
            } else if(this.anInt3637 * 420170157 == -1 && this.aByteArray3643[var4] == 125) {
               this.anInt3637 = var4 * 1700200997;
            }
         }

         this.anInt3638 = var2 * 1249943935;
         if(this.anInt3638 * -2076369281 != -1) {
            this.aByteArray3643[-2076369281 * this.anInt3638] = 126;
         }

      }
   }

   void method4493(long var1, String var3, int var4) {
      if(var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if(var1 > 0L != this.aBool3620) {
         throw new RuntimeException("");
      } else if(var3 != null != this.aBool3623) {
         throw new RuntimeException("");
      } else {
         if(var1 > 0L && (this.aLongArray3626 == null || 1642038069 * this.anInt3640 >= this.aLongArray3626.length) || null != var3 && (null == this.aStringArray3641 || this.anInt3640 * 1642038069 >= this.aStringArray3641.length)) {
            this.method4517(1642038069 * this.anInt3640 + 5, (byte)-86);
         }

         if(this.aLongArray3626 != null) {
            this.aLongArray3626[this.anInt3640 * 1642038069] = var1;
         }

         if(this.aStringArray3641 != null) {
            this.aStringArray3641[1642038069 * this.anInt3640] = var3;
         }

         this.anInt3640 += -1233193187;
      }
   }

   void method4494(int var1, int var2) {
      this.anInt3640 -= -1233193187;
      if(0 == this.anInt3640 * 1642038069) {
         this.aLongArray3626 = null;
         this.aStringArray3641 = null;
      } else {
         if(this.aLongArray3626 != null) {
            System.arraycopy(this.aLongArray3626, var1 + 1, this.aLongArray3626, var1, this.anInt3640 * 1642038069 - var1);
         }

         if(null != this.aStringArray3641) {
            System.arraycopy(this.aStringArray3641, var1 + 1, this.aStringArray3641, var1, 1642038069 * this.anInt3640 - var1);
         }
      }

   }

   void method4495(int var1) {
      if(var1 >= 0 && var1 < this.anInt3631 * -1488926957) {
         this.anInt3631 -= -442229989;
         this.anIntArray3634 = null;
         if(-1488926957 * this.anInt3631 == 0) {
            this.aLongArray3632 = null;
            this.aStringArray3642 = null;
            this.aByteArray3643 = null;
            this.anIntArray3648 = null;
            this.anIntArray3630 = null;
            this.aBoolArray3628 = null;
            this.anInt3638 = -1249943935;
            this.anInt3637 = -1700200997;
         } else {
            System.arraycopy(this.aByteArray3643, 1 + var1, this.aByteArray3643, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3648, 1 + var1, this.anIntArray3648, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3630, 1 + var1, this.anIntArray3630, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.aBoolArray3628, 1 + var1, this.aBoolArray3628, var1, this.anInt3631 * -1488926957 - var1);
            if(this.aLongArray3632 != null) {
               System.arraycopy(this.aLongArray3632, var1 + 1, this.aLongArray3632, var1, -1488926957 * this.anInt3631 - var1);
            }

            if(null != this.aStringArray3642) {
               System.arraycopy(this.aStringArray3642, var1 + 1, this.aStringArray3642, var1, this.anInt3631 * -1488926957 - var1);
            }

            this.method4492(-2083867181);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   boolean method4496(int var1, int var2, byte var3) {
      if(this.aClass20_3644 != null) {
         Class526 var4 = this.aClass20_3644.get((long)var1);
         if(null != var4) {
            if(var4 instanceof Class526_Sub25) {
               Class526_Sub25 var5 = (Class526_Sub25)var4;
               if(var2 == var5.anInt10550 * -1044108751) {
                  return false;
               }

               var5.anInt10550 = var2 * -509546799;
               return true;
            }

            var4.method6332(-1949449864);
         }
      } else {
         this.aClass20_3644 = new Class20(4);
      }

      this.aClass20_3644.put(new Class526_Sub25(var2), (long)var1);
      return true;
   }

   int method4497(int var1, int var2, int var3, int var4, int var5) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31?-1:(1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.anIntArray3648[var1];
      if((var9 & var8) == var2) {
         return -1;
      } else {
         var9 &= ~var8;
         this.anIntArray3648[var1] = var9 | var2;
         return var1;
      }
   }

   void method4498(int var1) {
      this.anInt3640 -= -1233193187;
      if(0 == this.anInt3640 * 1642038069) {
         this.aLongArray3626 = null;
         this.aStringArray3641 = null;
      } else {
         if(this.aLongArray3626 != null) {
            System.arraycopy(this.aLongArray3626, var1 + 1, this.aLongArray3626, var1, this.anInt3640 * 1642038069 - var1);
         }

         if(null != this.aStringArray3641) {
            System.arraycopy(this.aStringArray3641, var1 + 1, this.aStringArray3641, var1, 1642038069 * this.anInt3640 - var1);
         }
      }

   }

   int method4499(int var1, boolean var2, byte var3) {
      if(var2 == this.aBoolArray3628[var1]) {
         return -1;
      } else {
         this.aBoolArray3628[var1] = var2;
         return var1;
      }
   }

   boolean method4500(int var1, String var2, int var3) {
      if(null == var2) {
         var2 = "";
      } else if(var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if(null != this.aClass20_3644) {
         Class526 var4 = this.aClass20_3644.get((long)var1);
         if(var4 != null) {
            if(var4 instanceof LinkableObject) {
               LinkableObject var5 = (LinkableObject)var4;
               if(var5.anObject10399 instanceof String) {
                  if(var2.equals(var5.anObject10399)) {
                     return false;
                  }

                  var5.method6332(-1949449864);
                  this.aClass20_3644.put(new LinkableObject(var2), -6805155999452426801L * var5.aLong7156);
                  return true;
               }
            }

            var4.method6332(-1949449864);
         }
      } else {
         this.aClass20_3644 = new Class20(4);
      }

      this.aClass20_3644.put(new LinkableObject(var2), (long)var1);
      return true;
   }

   void method4501(RSByteBuffer var1, int var2) {
      int var3 = var1.readUnsignedByte(472393858);
      if(var3 >= 1 && var3 <= 6) {
         int var4 = var1.readUnsignedByte(331239723);
         if((var4 & 1) != 0) {
            this.aBool3620 = true;
         }

         if((var4 & 2) != 0) {
            this.aBool3623 = true;
         }

         if(!this.aBool3620) {
            this.aLongArray3632 = null;
            this.aLongArray3626 = null;
         }

         if(!this.aBool3623) {
            this.aStringArray3642 = null;
            this.aStringArray3641 = null;
         }

         this.anInt3635 = var1.readInt((byte)5) * -911768907;
         this.anInt3625 = var1.readInt((byte)5) * 404186549;
         if(var3 <= 3 && 0 != this.anInt3625 * 791683229) {
            this.anInt3625 += 483038752;
         }

         this.anInt3631 = var1.readUnsignedShort(945014641) * -442229989;
         this.anInt3640 = var1.readUnsignedByte(928276638) * -1233193187;
         this.aString3624 = var1.readString(-1788850242);
         if(var3 >= 4) {
            var1.readInt((byte)5);
         }

         this.aBool3639 = var1.readUnsignedByte(1888362244) == 1;
         this.aByte3627 = var1.readByte((byte)36);
         this.aByte3633 = var1.readByte((byte)122);
         this.aByte3629 = var1.readByte((byte)33);
         this.aByte3636 = var1.readByte((byte)34);
         int var5;
         if(-1488926957 * this.anInt3631 > 0) {
            if(this.aBool3620 && (this.aLongArray3632 == null || this.aLongArray3632.length < -1488926957 * this.anInt3631)) {
               this.aLongArray3632 = new long[this.anInt3631 * -1488926957];
            }

            if(this.aBool3623 && (null == this.aStringArray3642 || this.aStringArray3642.length < this.anInt3631 * -1488926957)) {
               this.aStringArray3642 = new String[this.anInt3631 * -1488926957];
            }

            if(this.aByteArray3643 == null || this.aByteArray3643.length < -1488926957 * this.anInt3631) {
               this.aByteArray3643 = new byte[-1488926957 * this.anInt3631];
            }

            if(null == this.anIntArray3648 || this.anIntArray3648.length < this.anInt3631 * -1488926957) {
               this.anIntArray3648 = new int[-1488926957 * this.anInt3631];
            }

            if(null == this.anIntArray3630 || this.anIntArray3630.length < this.anInt3631 * -1488926957) {
               this.anIntArray3630 = new int[-1488926957 * this.anInt3631];
            }

            if(this.aBoolArray3628 == null || this.aBoolArray3628.length < this.anInt3631 * -1488926957) {
               this.aBoolArray3628 = new boolean[this.anInt3631 * -1488926957];
            }

            for(var5 = 0; var5 < -1488926957 * this.anInt3631; ++var5) {
               if(this.aBool3620) {
                  this.aLongArray3632[var5] = var1.method9663(1822967257);
               }

               if(this.aBool3623) {
                  this.aStringArray3642[var5] = var1.method9700((byte)2);
               }

               this.aByteArray3643[var5] = var1.readByte((byte)72);
               if(var3 >= 2) {
                  this.anIntArray3648[var5] = var1.readInt((byte)5);
               }

               if(var3 >= 5) {
                  this.anIntArray3630[var5] = var1.readUnsignedShort(1198342481);
               } else {
                  this.anIntArray3630[var5] = 0;
               }

               if(var3 >= 6) {
                  this.aBoolArray3628[var5] = var1.readUnsignedByte(-210506236) == 1;
               } else {
                  this.aBoolArray3628[var5] = false;
               }
            }

            this.method4492(-2070012865);
         }

         if(this.anInt3640 * 1642038069 > 0) {
            if(this.aBool3620 && (null == this.aLongArray3626 || this.aLongArray3626.length < 1642038069 * this.anInt3640)) {
               this.aLongArray3626 = new long[1642038069 * this.anInt3640];
            }

            if(this.aBool3623 && (this.aStringArray3641 == null || this.aStringArray3641.length < this.anInt3640 * 1642038069)) {
               this.aStringArray3641 = new String[1642038069 * this.anInt3640];
            }

            for(var5 = 0; var5 < this.anInt3640 * 1642038069; ++var5) {
               if(this.aBool3620) {
                  this.aLongArray3626[var5] = var1.method9663(468244768);
               }

               if(this.aBool3623) {
                  this.aStringArray3641[var5] = var1.method9700((byte)2);
               }
            }
         }

         if(var3 >= 3) {
            var5 = var1.readUnsignedShort(975615608);
            if(var5 > 0) {
               this.aClass20_3644 = new Class20(var5 < 16?Class692.method8110(var5, 43656118):16);

               while(var5-- > 0) {
                  int var6 = var1.readInt((byte)5);
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if(0 == var8) {
                     int var9 = var1.readInt((byte)5);
                     this.aClass20_3644.put(new Class526_Sub25(var9), (long)var7);
                  } else if(var8 == 1) {
                     long var10 = var1.method9663(1583250571);
                     this.aClass20_3644.put(new Class526_Sub14(var10), (long)var7);
                  } else if(2 == var8) {
                     String var12 = var1.readString(-1357768967);
                     this.aClass20_3644.put(new LinkableObject(var12), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }

   void method4502(int var1) {
      if(this.aBool3620) {
         if(this.aLongArray3632 != null) {
            System.arraycopy(this.aLongArray3632, 0, this.aLongArray3632 = new long[var1], 0, this.anInt3631 * -1488926957);
         } else {
            this.aLongArray3632 = new long[var1];
         }
      }

      if(this.aBool3623) {
         if(this.aStringArray3642 != null) {
            System.arraycopy(this.aStringArray3642, 0, this.aStringArray3642 = new String[var1], 0, this.anInt3631 * -1488926957);
         } else {
            this.aStringArray3642 = new String[var1];
         }
      }

      if(null != this.aByteArray3643) {
         System.arraycopy(this.aByteArray3643, 0, this.aByteArray3643 = new byte[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.aByteArray3643 = new byte[var1];
      }

      if(this.anIntArray3648 != null) {
         System.arraycopy(this.anIntArray3648, 0, this.anIntArray3648 = new int[var1], 0, this.anInt3631 * -1488926957);
      } else {
         this.anIntArray3648 = new int[var1];
      }

      if(null != this.anIntArray3630) {
         System.arraycopy(this.anIntArray3630, 0, this.anIntArray3630 = new int[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.anIntArray3630 = new int[var1];
      }

      if(this.aBoolArray3628 != null) {
         System.arraycopy(this.aBoolArray3628, 0, this.aBoolArray3628 = new boolean[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.aBoolArray3628 = new boolean[var1];
      }

   }

   void method4503(int var1) {
      if(this.aBool3620) {
         if(this.aLongArray3632 != null) {
            System.arraycopy(this.aLongArray3632, 0, this.aLongArray3632 = new long[var1], 0, this.anInt3631 * -1488926957);
         } else {
            this.aLongArray3632 = new long[var1];
         }
      }

      if(this.aBool3623) {
         if(this.aStringArray3642 != null) {
            System.arraycopy(this.aStringArray3642, 0, this.aStringArray3642 = new String[var1], 0, this.anInt3631 * -1488926957);
         } else {
            this.aStringArray3642 = new String[var1];
         }
      }

      if(null != this.aByteArray3643) {
         System.arraycopy(this.aByteArray3643, 0, this.aByteArray3643 = new byte[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.aByteArray3643 = new byte[var1];
      }

      if(this.anIntArray3648 != null) {
         System.arraycopy(this.anIntArray3648, 0, this.anIntArray3648 = new int[var1], 0, this.anInt3631 * -1488926957);
      } else {
         this.anIntArray3648 = new int[var1];
      }

      if(null != this.anIntArray3630) {
         System.arraycopy(this.anIntArray3630, 0, this.anIntArray3630 = new int[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.anIntArray3630 = new int[var1];
      }

      if(this.aBoolArray3628 != null) {
         System.arraycopy(this.aBoolArray3628, 0, this.aBoolArray3628 = new boolean[var1], 0, -1488926957 * this.anInt3631);
      } else {
         this.aBoolArray3628 = new boolean[var1];
      }

   }

   void method4504(int var1) {
      this.anInt3640 -= -1233193187;
      if(0 == this.anInt3640 * 1642038069) {
         this.aLongArray3626 = null;
         this.aStringArray3641 = null;
      } else {
         if(this.aLongArray3626 != null) {
            System.arraycopy(this.aLongArray3626, var1 + 1, this.aLongArray3626, var1, this.anInt3640 * 1642038069 - var1);
         }

         if(null != this.aStringArray3641) {
            System.arraycopy(this.aStringArray3641, var1 + 1, this.aStringArray3641, var1, 1642038069 * this.anInt3640 - var1);
         }
      }

   }

   public int method4505(String var1) {
      if(null != var1 && var1.length() != 0) {
         for(int var2 = 0; var2 < this.anInt3631 * -1488926957; ++var2) {
            if(this.aStringArray3642[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   int method4506(int var1, byte var2, int var3) {
      if(126 != var2 && var2 != 127) {
         if(var1 != this.anInt3638 * -2076369281 || -1 != this.anInt3637 * 420170157 && this.aByteArray3643[420170157 * this.anInt3637] >= 125) {
            if(this.aByteArray3643[var1] == var2) {
               return -1;
            } else {
               this.aByteArray3643[var1] = var2;
               this.method4492(-2117647317);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   void method4507(int var1) {
      if(var1 >= 0 && var1 < this.anInt3631 * -1488926957) {
         this.anInt3631 -= -442229989;
         this.anIntArray3634 = null;
         if(-1488926957 * this.anInt3631 == 0) {
            this.aLongArray3632 = null;
            this.aStringArray3642 = null;
            this.aByteArray3643 = null;
            this.anIntArray3648 = null;
            this.anIntArray3630 = null;
            this.aBoolArray3628 = null;
            this.anInt3638 = -1249943935;
            this.anInt3637 = -1700200997;
         } else {
            System.arraycopy(this.aByteArray3643, 1 + var1, this.aByteArray3643, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3648, 1 + var1, this.anIntArray3648, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3630, 1 + var1, this.anIntArray3630, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.aBoolArray3628, 1 + var1, this.aBoolArray3628, var1, this.anInt3631 * -1488926957 - var1);
            if(this.aLongArray3632 != null) {
               System.arraycopy(this.aLongArray3632, var1 + 1, this.aLongArray3632, var1, -1488926957 * this.anInt3631 - var1);
            }

            if(null != this.aStringArray3642) {
               System.arraycopy(this.aStringArray3642, var1 + 1, this.aStringArray3642, var1, this.anInt3631 * -1488926957 - var1);
            }

            this.method4492(-1958744014);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method4508(int var1) {
      if(var1 >= 0 && var1 < this.anInt3631 * -1488926957) {
         this.anInt3631 -= -442229989;
         this.anIntArray3634 = null;
         if(-1488926957 * this.anInt3631 == 0) {
            this.aLongArray3632 = null;
            this.aStringArray3642 = null;
            this.aByteArray3643 = null;
            this.anIntArray3648 = null;
            this.anIntArray3630 = null;
            this.aBoolArray3628 = null;
            this.anInt3638 = -1249943935;
            this.anInt3637 = -1700200997;
         } else {
            System.arraycopy(this.aByteArray3643, 1 + var1, this.aByteArray3643, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3648, 1 + var1, this.anIntArray3648, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3630, 1 + var1, this.anIntArray3630, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.aBoolArray3628, 1 + var1, this.aBoolArray3628, var1, this.anInt3631 * -1488926957 - var1);
            if(this.aLongArray3632 != null) {
               System.arraycopy(this.aLongArray3632, var1 + 1, this.aLongArray3632, var1, -1488926957 * this.anInt3631 - var1);
            }

            if(null != this.aStringArray3642) {
               System.arraycopy(this.aStringArray3642, var1 + 1, this.aStringArray3642, var1, this.anInt3631 * -1488926957 - var1);
            }

            this.method4492(-1967396745);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method4509(int var1) {
      if(var1 >= 0 && var1 < this.anInt3631 * -1488926957) {
         this.anInt3631 -= -442229989;
         this.anIntArray3634 = null;
         if(-1488926957 * this.anInt3631 == 0) {
            this.aLongArray3632 = null;
            this.aStringArray3642 = null;
            this.aByteArray3643 = null;
            this.anIntArray3648 = null;
            this.anIntArray3630 = null;
            this.aBoolArray3628 = null;
            this.anInt3638 = -1249943935;
            this.anInt3637 = -1700200997;
         } else {
            System.arraycopy(this.aByteArray3643, 1 + var1, this.aByteArray3643, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3648, 1 + var1, this.anIntArray3648, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.anIntArray3630, 1 + var1, this.anIntArray3630, var1, -1488926957 * this.anInt3631 - var1);
            System.arraycopy(this.aBoolArray3628, 1 + var1, this.aBoolArray3628, var1, this.anInt3631 * -1488926957 - var1);
            if(this.aLongArray3632 != null) {
               System.arraycopy(this.aLongArray3632, var1 + 1, this.aLongArray3632, var1, -1488926957 * this.anInt3631 - var1);
            }

            if(null != this.aStringArray3642) {
               System.arraycopy(this.aStringArray3642, var1 + 1, this.aStringArray3642, var1, this.anInt3631 * -1488926957 - var1);
            }

            this.method4492(-1978575470);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method4510() {
      if(this.anInt3631 * -1488926957 == 0) {
         this.anInt3638 = -1249943935;
         this.anInt3637 = -1700200997;
      } else {
         this.anInt3638 = -1249943935;
         this.anInt3637 = -1700200997;
         int var1 = 0;
         byte var2 = this.aByteArray3643[0];

         for(int var3 = 1; var3 < this.anInt3631 * -1488926957; ++var3) {
            if(this.aByteArray3643[var3] > var2) {
               if(125 == var2) {
                  this.anInt3637 = 1700200997 * var1;
               }

               var1 = var3;
               var2 = this.aByteArray3643[var3];
            } else if(this.anInt3637 * 420170157 == -1 && this.aByteArray3643[var3] == 125) {
               this.anInt3637 = var3 * 1700200997;
            }
         }

         this.anInt3638 = var1 * 1249943935;
         if(this.anInt3638 * -2076369281 != -1) {
            this.aByteArray3643[-2076369281 * this.anInt3638] = 126;
         }

      }
   }

   boolean method4511(int var1, long var2) {
      if(null != this.aClass20_3644) {
         Class526 var4 = this.aClass20_3644.get((long)var1);
         if(null != var4) {
            if(var4 instanceof Class526_Sub14) {
               Class526_Sub14 var5 = (Class526_Sub14)var4;
               if(5599099635928242931L * var5.aLong10455 == var2) {
                  return false;
               }

               var5.aLong10455 = var2 * -5065934963382940101L;
               return true;
            }

            var4.method6332(-1949449864);
         }
      } else {
         this.aClass20_3644 = new Class20(4);
      }

      this.aClass20_3644.put(new Class526_Sub14(var2), (long)var1);
      return true;
   }

   void method4512(int var1) {
      this.anInt3640 -= -1233193187;
      if(0 == this.anInt3640 * 1642038069) {
         this.aLongArray3626 = null;
         this.aStringArray3641 = null;
      } else {
         if(this.aLongArray3626 != null) {
            System.arraycopy(this.aLongArray3626, var1 + 1, this.aLongArray3626, var1, this.anInt3640 * 1642038069 - var1);
         }

         if(null != this.aStringArray3641) {
            System.arraycopy(this.aStringArray3641, var1 + 1, this.aStringArray3641, var1, 1642038069 * this.anInt3640 - var1);
         }
      }

   }

   void method4513(int var1) {
      this.anInt3640 -= -1233193187;
      if(0 == this.anInt3640 * 1642038069) {
         this.aLongArray3626 = null;
         this.aStringArray3641 = null;
      } else {
         if(this.aLongArray3626 != null) {
            System.arraycopy(this.aLongArray3626, var1 + 1, this.aLongArray3626, var1, this.anInt3640 * 1642038069 - var1);
         }

         if(null != this.aStringArray3641) {
            System.arraycopy(this.aStringArray3641, var1 + 1, this.aStringArray3641, var1, 1642038069 * this.anInt3640 - var1);
         }
      }

   }

   void method4514(int var1) {
      this.anInt3640 -= -1233193187;
      if(0 == this.anInt3640 * 1642038069) {
         this.aLongArray3626 = null;
         this.aStringArray3641 = null;
      } else {
         if(this.aLongArray3626 != null) {
            System.arraycopy(this.aLongArray3626, var1 + 1, this.aLongArray3626, var1, this.anInt3640 * 1642038069 - var1);
         }

         if(null != this.aStringArray3641) {
            System.arraycopy(this.aStringArray3641, var1 + 1, this.aStringArray3641, var1, 1642038069 * this.anInt3640 - var1);
         }
      }

   }

   void method4515() {
      if(this.anInt3631 * -1488926957 == 0) {
         this.anInt3638 = -1249943935;
         this.anInt3637 = -1700200997;
      } else {
         this.anInt3638 = -1249943935;
         this.anInt3637 = -1700200997;
         int var1 = 0;
         byte var2 = this.aByteArray3643[0];

         for(int var3 = 1; var3 < this.anInt3631 * -1488926957; ++var3) {
            if(this.aByteArray3643[var3] > var2) {
               if(125 == var2) {
                  this.anInt3637 = 1700200997 * var1;
               }

               var1 = var3;
               var2 = this.aByteArray3643[var3];
            } else if(this.anInt3637 * 420170157 == -1 && this.aByteArray3643[var3] == 125) {
               this.anInt3637 = var3 * 1700200997;
            }
         }

         this.anInt3638 = var1 * 1249943935;
         if(this.anInt3638 * -2076369281 != -1) {
            this.aByteArray3643[-2076369281 * this.anInt3638] = 126;
         }

      }
   }

   boolean method4516(int var1, int var2, int var3, int var4, int var5) {
      int var6 = (1 << var3) - 1;
      int var7 = 31 == var4?-1:(1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if(this.aClass20_3644 != null) {
         Class526 var9 = this.aClass20_3644.get((long)var1);
         if(null != var9) {
            if(var9 instanceof Class526_Sub25) {
               Class526_Sub25 var10 = (Class526_Sub25)var9;
               if((var10.anInt10550 * -1044108751 & var8) == var2) {
                  return false;
               }

               var10.anInt10550 = -509546799 * (-1044108751 * var10.anInt10550 & ~var8);
               var10.anInt10550 = -509546799 * (var10.anInt10550 * -1044108751 | var2);
               return true;
            }

            var9.method6332(-1949449864);
         }
      } else {
         this.aClass20_3644 = new Class20(4);
      }

      this.aClass20_3644.put(new Class526_Sub25(var2), (long)var1);
      return true;
   }

   void method4517(int var1, byte var2) {
      if(this.aBool3620) {
         if(null != this.aLongArray3626) {
            System.arraycopy(this.aLongArray3626, 0, this.aLongArray3626 = new long[var1], 0, this.anInt3640 * 1642038069);
         } else {
            this.aLongArray3626 = new long[var1];
         }
      }

      if(this.aBool3623) {
         if(null != this.aStringArray3641) {
            System.arraycopy(this.aStringArray3641, 0, this.aStringArray3641 = new String[var1], 0, this.anInt3640 * 1642038069);
         } else {
            this.aStringArray3641 = new String[var1];
         }
      }

   }

   boolean method4518(int var1, int var2) {
      if(this.aClass20_3644 != null) {
         Class526 var3 = this.aClass20_3644.get((long)var1);
         if(null != var3) {
            if(var3 instanceof Class526_Sub25) {
               Class526_Sub25 var4 = (Class526_Sub25)var3;
               if(var2 == var4.anInt10550 * -1044108751) {
                  return false;
               }

               var4.anInt10550 = var2 * -509546799;
               return true;
            }

            var3.method6332(-1949449864);
         }
      } else {
         this.aClass20_3644 = new Class20(4);
      }

      this.aClass20_3644.put(new Class526_Sub25(var2), (long)var1);
      return true;
   }

   public Integer method4519(int var1, int var2) {
      if(null == this.aClass20_3644) {
         return null;
      } else {
         Class526 var3 = this.aClass20_3644.get((long)var1);
         return var3 != null && var3 instanceof Class526_Sub25?new Integer(((Class526_Sub25)var3).anInt10550 * -1044108751):null;
      }
   }

   public String method4520(int var1, int var2) {
      if(null == this.aClass20_3644) {
         return null;
      } else {
         Class526 var3 = this.aClass20_3644.get((long)var1);
         return null != var3 && var3 instanceof LinkableObject?(String)((LinkableObject)var3).anObject10399:null;
      }
   }

   void method4521(RSByteBuffer var1) {
      int var2 = var1.readUnsignedByte(1522936480);
      if(var2 >= 1 && var2 <= 6) {
         int var3 = var1.readUnsignedByte(-604841768);
         if((var3 & 1) != 0) {
            this.aBool3620 = true;
         }

         if((var3 & 2) != 0) {
            this.aBool3623 = true;
         }

         if(!this.aBool3620) {
            this.aLongArray3632 = null;
            this.aLongArray3626 = null;
         }

         if(!this.aBool3623) {
            this.aStringArray3642 = null;
            this.aStringArray3641 = null;
         }

         this.anInt3635 = var1.readInt((byte)5) * -911768907;
         this.anInt3625 = var1.readInt((byte)5) * 404186549;
         if(var2 <= 3 && 0 != this.anInt3625 * 791683229) {
            this.anInt3625 += 483038752;
         }

         this.anInt3631 = var1.readUnsignedShort(600322873) * -442229989;
         this.anInt3640 = var1.readUnsignedByte(-50513759) * -1233193187;
         this.aString3624 = var1.readString(1292453663);
         if(var2 >= 4) {
            var1.readInt((byte)5);
         }

         this.aBool3639 = var1.readUnsignedByte(-549716744) == 1;
         this.aByte3627 = var1.readByte((byte)120);
         this.aByte3633 = var1.readByte((byte)56);
         this.aByte3629 = var1.readByte((byte)107);
         this.aByte3636 = var1.readByte((byte)70);
         int var4;
         if(-1488926957 * this.anInt3631 > 0) {
            if(this.aBool3620 && (this.aLongArray3632 == null || this.aLongArray3632.length < -1488926957 * this.anInt3631)) {
               this.aLongArray3632 = new long[this.anInt3631 * -1488926957];
            }

            if(this.aBool3623 && (null == this.aStringArray3642 || this.aStringArray3642.length < this.anInt3631 * -1488926957)) {
               this.aStringArray3642 = new String[this.anInt3631 * -1488926957];
            }

            if(this.aByteArray3643 == null || this.aByteArray3643.length < -1488926957 * this.anInt3631) {
               this.aByteArray3643 = new byte[-1488926957 * this.anInt3631];
            }

            if(null == this.anIntArray3648 || this.anIntArray3648.length < this.anInt3631 * -1488926957) {
               this.anIntArray3648 = new int[-1488926957 * this.anInt3631];
            }

            if(null == this.anIntArray3630 || this.anIntArray3630.length < this.anInt3631 * -1488926957) {
               this.anIntArray3630 = new int[-1488926957 * this.anInt3631];
            }

            if(this.aBoolArray3628 == null || this.aBoolArray3628.length < this.anInt3631 * -1488926957) {
               this.aBoolArray3628 = new boolean[this.anInt3631 * -1488926957];
            }

            for(var4 = 0; var4 < -1488926957 * this.anInt3631; ++var4) {
               if(this.aBool3620) {
                  this.aLongArray3632[var4] = var1.method9663(1410587884);
               }

               if(this.aBool3623) {
                  this.aStringArray3642[var4] = var1.method9700((byte)2);
               }

               this.aByteArray3643[var4] = var1.readByte((byte)55);
               if(var2 >= 2) {
                  this.anIntArray3648[var4] = var1.readInt((byte)5);
               }

               if(var2 >= 5) {
                  this.anIntArray3630[var4] = var1.readUnsignedShort(98397604);
               } else {
                  this.anIntArray3630[var4] = 0;
               }

               if(var2 >= 6) {
                  this.aBoolArray3628[var4] = var1.readUnsignedByte(-1980490108) == 1;
               } else {
                  this.aBoolArray3628[var4] = false;
               }
            }

            this.method4492(-2081847635);
         }

         if(this.anInt3640 * 1642038069 > 0) {
            if(this.aBool3620 && (null == this.aLongArray3626 || this.aLongArray3626.length < 1642038069 * this.anInt3640)) {
               this.aLongArray3626 = new long[1642038069 * this.anInt3640];
            }

            if(this.aBool3623 && (this.aStringArray3641 == null || this.aStringArray3641.length < this.anInt3640 * 1642038069)) {
               this.aStringArray3641 = new String[1642038069 * this.anInt3640];
            }

            for(var4 = 0; var4 < this.anInt3640 * 1642038069; ++var4) {
               if(this.aBool3620) {
                  this.aLongArray3626[var4] = var1.method9663(1634690496);
               }

               if(this.aBool3623) {
                  this.aStringArray3641[var4] = var1.method9700((byte)2);
               }
            }
         }

         if(var2 >= 3) {
            var4 = var1.readUnsignedShort(1082460113);
            if(var4 > 0) {
               this.aClass20_3644 = new Class20(var4 < 16?Class692.method8110(var4, -1030332327):16);

               while(var4-- > 0) {
                  int var5 = var1.readInt((byte)5);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if(0 == var7) {
                     int var8 = var1.readInt((byte)5);
                     this.aClass20_3644.put(new Class526_Sub25(var8), (long)var6);
                  } else if(var7 == 1) {
                     long var9 = var1.method9663(1377859018);
                     this.aClass20_3644.put(new Class526_Sub14(var9), (long)var6);
                  } else if(2 == var7) {
                     String var11 = var1.readString(-1762580234);
                     this.aClass20_3644.put(new LinkableObject(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   static void method4522(byte var0) {
      Class113.aClass192_1369.method2770(1429057933);
   }

   static final void method4523(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-64);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class29.method733(var3, var4, var0, -1924613311);
   }

   static boolean method4524(byte var0) {
      return Class43.aBool457;
   }

   public static boolean method4525(int var0, int[] var1, int var2) {
      if(Class100.aBoolArray1206[var0]) {
         return true;
      } else {
         Class315_Sub1.aClass243Array10033[var0] = Class187.method2725(var0, var1, Class315_Sub1.aClass243Array10033[var0], false, 1749086772);
         if(null == Class315_Sub1.aClass243Array10033[var0]) {
            return false;
         } else {
            Class100.aBoolArray1206[var0] = true;
            return true;
         }
      }
   }

   static final void method4526(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 & 16383;
   }
}
