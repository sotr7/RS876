package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class143;
import com.jagex.Class149;
import com.jagex.Class197;
import com.jagex.Class21;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.OutFrame;
import com.jagex.Class424;
import com.jagex.Class452_Sub4;
import com.jagex.Class458;
import com.jagex.Class466;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class568;
import com.jagex.RenderDef;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class641;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class97_Sub1;
import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class149_Sub1 extends Class149 {
   static final int anInt8890 = 1;
   static int uid;
   boolean aBool8893 = false;
   Class424[] aClass424Array8896;
   long aLong8898 = 1818772671648960059L;
   public boolean aBool8891 = false;
   int anInt8897 = 0;
   public long aLong8892 = 4314740901114900983L;
   Class458[] aClass458Array8894;
   Set aSet8895;

   public void method8339() {
      for(int var1 = 0; var1 < this.aClass458Array8894.length; ++var1) {
         if(this.aClass458Array8894[var1] == Class458.aClass458_5169 || Class458.aClass458_5167 == this.aClass458Array8894[var1]) {
            this.anInterface4_1715.method29(var1, 1893376193);
         }
      }

      this.aSet8895.clear();
      this.aBool8893 = false;
      this.aClass424Array8896 = null;
      this.aLong8898 = 1818772671648960059L;
   }

   public void method111(Class143 var1, int var2, byte var3) {
      if(Class458.aClass458_5168 == this.aClass458Array8894[697078941 * var1.anInt1674]) {
         this.aBool8891 = true;
      } else if(Class458.aClass458_5167 == this.aClass458Array8894[var1.anInt1674 * 697078941] && this.method114(var1, -1025716555) != var2) {
         this.aBool8893 = true;
         this.aSet8895.add(Integer.valueOf(var1.anInt1674 * 697078941));
      }

      super.method111(var1, var2, (byte)24);
   }

   public void method8340(int var1) {
      this.anInt8897 = 0;
   }

   public void method115(Class143 var1, Object var2, byte var3) {
      if(Class458.aClass458_5168 == this.aClass458Array8894[697078941 * var1.anInt1674]) {
         this.aBool8891 = true;
      } else if(this.aClass458Array8894[var1.anInt1674 * 697078941] == Class458.aClass458_5167) {
         if(var2 instanceof String) {
            String var4 = (String)var2;
            if(var4.length() > 80) {
               var2 = var4.substring(0, 80);
            }
         }

         Object var5 = this.method113(var1, (byte)-69);
         if(null != var2 && null != var5 && !var2.equals(var5)) {
            this.aBool8893 = true;
            this.aSet8895.add(Integer.valueOf(var1.anInt1674 * 697078941));
         } else if(null == var5 != (var2 == null)) {
            this.aBool8893 = true;
            this.aSet8895.add(Integer.valueOf(var1.anInt1674 * 697078941));
         }
      }

      super.method115(var1, var2, (byte)2);
   }

   public void method8341(int var1) {
      for(int var2 = 0; var2 < this.aClass458Array8894.length; ++var2) {
         if(this.aClass458Array8894[var2] == Class458.aClass458_5169 || Class458.aClass458_5167 == this.aClass458Array8894[var2]) {
            this.anInterface4_1715.method29(var2, 1893376193);
         }
      }

      this.aSet8895.clear();
      this.aBool8893 = false;
      this.aClass424Array8896 = null;
      this.aLong8898 = 1818772671648960059L;
   }

   public Class149_Sub1(Class97_Sub1 var1) {
      super(var1);
      this.aClass458Array8894 = new Class458[var1.method87(1684106887)];

      for(int var2 = 0; var2 < var1.method87(-2110773063); ++var2) {
         this.aClass458Array8894[var2] = ((Class143)var1.method89(var2, -1624987727)).aClass458_1677;
      }

      this.aSet8895 = new HashSet(var1.method87(-823023576));
   }

   public void method8342(Class21 var1, int var2) {
      try {
         try {
            label197: {
               byte[] var3 = new byte[(int)var1.method658((byte)87)];

               int var5;
               for(int var4 = 0; var4 < var3.length; var4 += var5) {
                  var5 = var1.method653(var3, var4, var3.length - var4, (byte)73);
                  if(var5 == -1) {
                     throw new EOFException();
                  }
               }

               RSByteBuffer var30 = new RSByteBuffer(var3);
               if(var30.buffer.length - 301018015 * var30.pos < 1) {
                  try {
                     var1.method651(519702233);
                  } catch (Exception var25) {
                     ;
                  }

                  return;
               }

               int var6 = var30.readUnsignedByte(555189004);
               if(var6 >= 0 && var6 <= 1) {
                  if(var30.buffer.length - var30.pos * 301018015 < 2) {
                     try {
                        var1.method651(1788699535);
                     } catch (Exception var24) {
                        ;
                     }

                     return;
                  }

                  int var7 = var30.readUnsignedShort(1722359091);
                  if(var30.buffer.length - 301018015 * var30.pos < 6 * var7) {
                     try {
                        var1.method651(145004452);
                     } catch (Exception var23) {
                        ;
                     }

                     return;
                  }

                  int var8 = 0;

                  while(true) {
                     if(var8 >= var7) {
                        break label197;
                     }

                     Class424 var9 = Class641.aClass97_Sub1_Sub2_8349.method8370(var30, -1444112255);
                     if(Class458.aClass458_5168 == this.aClass458Array8894[var9.anInt4793 * 1602756037] && ((Class143)Class641.aClass97_Sub1_Sub2_8349.method89(1602756037 * var9.anInt4793, -660445107)).aClass454_1676.method5389((byte)-56).aClass5463.isAssignableFrom(var9.anObject4794.getClass())) {
                        this.anInterface4_1715.method27(1602756037 * var9.anInt4793, var9.anObject4794, 172204199);
                     }

                     ++var8;
                  }
               }

               try {
                  var1.method651(624786689);
               } catch (Exception var27) {
                  ;
               }

               return;
            }
         } catch (Exception var28) {
            try {
               var1.method651(730190748);
            } catch (Exception var22) {
               ;
            }

            return;
         }

         try {
            var1.method651(1420169204);
         } catch (Exception var26) {
            ;
         }

      } finally {
         try {
            var1.method651(1277197262);
         } catch (Exception var21) {
            ;
         }

      }
   }

   public void method8343(Class21 var1, byte var2) {
      boolean var15 = false;

      try {
         label102: {
            try {
               var15 = true;
               int var3 = 3;
               int var4 = 0;
               Iterator var5 = this.anInterface4_1715.iterator();

               while(true) {
                  if(!var5.hasNext()) {
                     RSByteBuffer var21 = new RSByteBuffer(var3);
                     var21.writeByte(1, -32062925);
                     var21.writeShort(var4, -805078716);
                     Iterator var22 = this.anInterface4_1715.iterator();

                     while(var22.hasNext()) {
                        Class424 var7 = (Class424)var22.next();
                        if(this.aClass458Array8894[1602756037 * var7.anInt4793] == Class458.aClass458_5168) {
                           Class641.aClass97_Sub1_Sub2_8349.method8373(var21, var7, -835263047);
                        }
                     }

                     var1.method650(var21.buffer, 0, var21.pos * 301018015, (byte)-9);
                     break;
                  }

                  Class424 var6 = (Class424)var5.next();
                  if(this.aClass458Array8894[var6.anInt4793 * 1602756037] == Class458.aClass458_5168) {
                     var3 += Class641.aClass97_Sub1_Sub2_8349.method8371(var6, 607809745);
                     ++var4;
                  }
               }
            } catch (Exception var19) {
               try {
                  var1.method651(363410522);
                  var15 = false;
               } catch (Exception var17) {
                  var15 = false;
               }
               break label102;
            }

            try {
               var1.method651(1707384961);
               var15 = false;
            } catch (Exception var18) {
               var15 = false;
            }
         }
      } finally {
         if(var15) {
            try {
               var1.method651(1666016424);
            } catch (Exception var16) {
               ;
            }

         }
      }

      this.aLong8892 = Class255.time((byte)24) * -4314740901114900983L;
      this.aBool8891 = false;
   }

   public void method123(Class143 var1, int var2) {
      if(Class458.aClass458_5168 == this.aClass458Array8894[697078941 * var1.anInt1674]) {
         this.aBool8891 = true;
      } else if(Class458.aClass458_5167 == this.aClass458Array8894[var1.anInt1674 * 697078941] && this.method114(var1, 64348548) != var2) {
         this.aBool8893 = true;
         this.aSet8895.add(Integer.valueOf(var1.anInt1674 * 697078941));
      }

      super.method111(var1, var2, (byte)24);
   }

   public void method8344() {
      for(int var1 = 0; var1 < this.aClass458Array8894.length; ++var1) {
         if(this.aClass458Array8894[var1] == Class458.aClass458_5169 || Class458.aClass458_5167 == this.aClass458Array8894[var1]) {
            this.anInterface4_1715.method29(var1, 1893376193);
         }
      }

      this.aSet8895.clear();
      this.aBool8893 = false;
      this.aClass424Array8896 = null;
      this.aLong8898 = 1818772671648960059L;
   }

   public void method8345() {
      if(Class255.time((byte)24) >= this.aLong8898 * -577347653448145651L) {
         int var3;
         if(this.aClass424Array8896 == null) {
            if(!this.aBool8893) {
               return;
            }

            this.aClass424Array8896 = new Class424[this.aSet8895.size()];
            int var1 = 0;

            for(Iterator var2 = this.aSet8895.iterator(); var2.hasNext(); this.aClass424Array8896[var1++] = new Class424(var3, this.anInterface4_1715.method22(var3, -85946459))) {
               var3 = ((Integer)var2.next()).intValue();
            }

            this.anInt8897 = 0;
            this.aBool8893 = false;
            this.aSet8895.clear();
         }

         if(null != this.aClass424Array8896 && -1771520565 * this.anInt8897 < this.aClass424Array8896.length) {
            Class111 var5 = Class452_Sub4.method9295((byte)110);
            if(-123209119 * var5.anInt1336 > 1200) {
               return;
            }

            OutFrameBuffer var6 = Class115.method1414(OutFrame.aClass405_4165, var5.aClass14_1342, -1714125871);
            var6.out.writeShort(0, -805078716);
            var3 = 301018015 * var6.out.pos;

            for(var6.out.pos += 801976415; -1771520565 * this.anInt8897 < this.aClass424Array8896.length; this.anInt8897 += -1578598429) {
               Class424 var4 = this.aClass424Array8896[-1771520565 * this.anInt8897];
               if(var5.anInt1336 * -123209119 + var6.out.pos * 301018015 + Class641.aClass97_Sub1_Sub2_8349.method8371(var4, 495050796) > 1500) {
                  break;
               }

               Class641.aClass97_Sub1_Sub2_8349.method8373(var6.out, var4, 615912650);
            }

            var6.out.method9620(var6.out.pos * 301018015 - var3, (byte)-1);
            if(this.anInt8897 * -1771520565 >= this.aClass424Array8896.length) {
               var6.out.buffer[var3] = 1;
            } else {
               var6.out.buffer[var3] = 0;
            }

            var5.write(var6, (byte)-40);
            this.aLong8898 = (Class255.time((byte)24) + 1000L) * -1818772671648960059L;
         }

      }
   }

   public void method125(Class143 var1, long var2) {
      if(this.aClass458Array8894[697078941 * var1.anInt1674] == Class458.aClass458_5168) {
         this.aBool8891 = true;
      } else if(this.aClass458Array8894[697078941 * var1.anInt1674] == Class458.aClass458_5167 && this.method121(var1, -1261346585) != var2) {
         this.aBool8893 = true;
         this.aSet8895.add(Integer.valueOf(697078941 * var1.anInt1674));
      }

      super.method110(var1, var2);
   }

   public void method127(Class143 var1, Object var2) {
      if(Class458.aClass458_5168 == this.aClass458Array8894[697078941 * var1.anInt1674]) {
         this.aBool8891 = true;
      } else if(this.aClass458Array8894[var1.anInt1674 * 697078941] == Class458.aClass458_5167) {
         if(var2 instanceof String) {
            String var3 = (String)var2;
            if(var3.length() > 80) {
               var2 = var3.substring(0, 80);
            }
         }

         Object var4 = this.method113(var1, (byte)-55);
         if(null != var2 && null != var4 && !var2.equals(var4)) {
            this.aBool8893 = true;
            this.aSet8895.add(Integer.valueOf(var1.anInt1674 * 697078941));
         } else if(null == var4 != (var2 == null)) {
            this.aBool8893 = true;
            this.aSet8895.add(Integer.valueOf(var1.anInt1674 * 697078941));
         }
      }

      super.method115(var1, var2, (byte)-92);
   }

   public void method110(Class143 var1, long var2) {
      if(this.aClass458Array8894[697078941 * var1.anInt1674] == Class458.aClass458_5168) {
         this.aBool8891 = true;
      } else if(this.aClass458Array8894[697078941 * var1.anInt1674] == Class458.aClass458_5167 && this.method121(var1, -966741333) != var2) {
         this.aBool8893 = true;
         this.aSet8895.add(Integer.valueOf(697078941 * var1.anInt1674));
      }

      super.method110(var1, var2);
   }

   public void method8346() {
      for(int var1 = 0; var1 < this.aClass458Array8894.length; ++var1) {
         if(this.aClass458Array8894[var1] == Class458.aClass458_5169 || Class458.aClass458_5167 == this.aClass458Array8894[var1]) {
            this.anInterface4_1715.method29(var1, 1893376193);
         }
      }

      this.aSet8895.clear();
      this.aBool8893 = false;
      this.aClass424Array8896 = null;
      this.aLong8898 = 1818772671648960059L;
   }

   public void method8347(int var1) {
      if(Class255.time((byte)24) >= this.aLong8898 * -577347653448145651L) {
         int var4;
         if(this.aClass424Array8896 == null) {
            if(!this.aBool8893) {
               return;
            }

            this.aClass424Array8896 = new Class424[this.aSet8895.size()];
            int var2 = 0;

            for(Iterator var3 = this.aSet8895.iterator(); var3.hasNext(); this.aClass424Array8896[var2++] = new Class424(var4, this.anInterface4_1715.method22(var4, -949669166))) {
               var4 = ((Integer)var3.next()).intValue();
            }

            this.anInt8897 = 0;
            this.aBool8893 = false;
            this.aSet8895.clear();
         }

         if(null != this.aClass424Array8896 && -1771520565 * this.anInt8897 < this.aClass424Array8896.length) {
            Class111 var6 = Class452_Sub4.method9295((byte)29);
            if(-123209119 * var6.anInt1336 > 1200) {
               return;
            }

            OutFrameBuffer var7 = Class115.method1414(OutFrame.aClass405_4165, var6.aClass14_1342, -1236753687);
            var7.out.writeShort(0, -805078716);
            var4 = 301018015 * var7.out.pos;

            for(var7.out.pos += 801976415; -1771520565 * this.anInt8897 < this.aClass424Array8896.length; this.anInt8897 += -1578598429) {
               Class424 var5 = this.aClass424Array8896[-1771520565 * this.anInt8897];
               if(var6.anInt1336 * -123209119 + var7.out.pos * 301018015 + Class641.aClass97_Sub1_Sub2_8349.method8371(var5, 365159842) > 1500) {
                  break;
               }

               Class641.aClass97_Sub1_Sub2_8349.method8373(var7.out, var5, -701777356);
            }

            var7.out.method9620(var7.out.pos * 301018015 - var4, (byte)-1);
            if(this.anInt8897 * -1771520565 >= this.aClass424Array8896.length) {
               var7.out.buffer[var4] = 1;
            } else {
               var7.out.buffer[var4] = 0;
            }

            var6.write(var7, (byte)-59);
            this.aLong8898 = (Class255.time((byte)24) + 1000L) * -1818772671648960059L;
         }

      }
   }

   public void method8348() {
      for(int var1 = 0; var1 < this.aClass458Array8894.length; ++var1) {
         if(this.aClass458Array8894[var1] == Class458.aClass458_5169 || Class458.aClass458_5167 == this.aClass458Array8894[var1]) {
            this.anInterface4_1715.method29(var1, 1893376193);
         }
      }

      this.aSet8895.clear();
      this.aBool8893 = false;
      this.aClass424Array8896 = null;
      this.aLong8898 = 1818772671648960059L;
   }

   public void method8349() {
      this.anInt8897 = 0;
   }

   public void method8350() {
      this.anInt8897 = 0;
   }

   public void method8351(byte var1) {
      if(this.aClass424Array8896 != null && -1771520565 * this.anInt8897 >= this.aClass424Array8896.length) {
         this.aClass424Array8896 = null;
         this.anInt8897 = 0;
      }

   }

   public void method8352() {
      if(Class255.time((byte)24) >= this.aLong8898 * -577347653448145651L) {
         int var3;
         if(this.aClass424Array8896 == null) {
            if(!this.aBool8893) {
               return;
            }

            this.aClass424Array8896 = new Class424[this.aSet8895.size()];
            int var1 = 0;

            for(Iterator var2 = this.aSet8895.iterator(); var2.hasNext(); this.aClass424Array8896[var1++] = new Class424(var3, this.anInterface4_1715.method22(var3, -1553568009))) {
               var3 = ((Integer)var2.next()).intValue();
            }

            this.anInt8897 = 0;
            this.aBool8893 = false;
            this.aSet8895.clear();
         }

         if(null != this.aClass424Array8896 && -1771520565 * this.anInt8897 < this.aClass424Array8896.length) {
            Class111 var5 = Class452_Sub4.method9295((byte)25);
            if(-123209119 * var5.anInt1336 > 1200) {
               return;
            }

            OutFrameBuffer var6 = Class115.method1414(OutFrame.aClass405_4165, var5.aClass14_1342, -458855653);
            var6.out.writeShort(0, -805078716);
            var3 = 301018015 * var6.out.pos;

            for(var6.out.pos += 801976415; -1771520565 * this.anInt8897 < this.aClass424Array8896.length; this.anInt8897 += -1578598429) {
               Class424 var4 = this.aClass424Array8896[-1771520565 * this.anInt8897];
               if(var5.anInt1336 * -123209119 + var6.out.pos * 301018015 + Class641.aClass97_Sub1_Sub2_8349.method8371(var4, 2139177652) > 1500) {
                  break;
               }

               Class641.aClass97_Sub1_Sub2_8349.method8373(var6.out, var4, -621779237);
            }

            var6.out.method9620(var6.out.pos * 301018015 - var3, (byte)-1);
            if(this.anInt8897 * -1771520565 >= this.aClass424Array8896.length) {
               var6.out.buffer[var3] = 1;
            } else {
               var6.out.buffer[var3] = 0;
            }

            var5.write(var6, (byte)-16);
            this.aLong8898 = (Class255.time((byte)24) + 1000L) * -1818772671648960059L;
         }

      }
   }

   public void method8353() {
      if(this.aClass424Array8896 != null && -1771520565 * this.anInt8897 >= this.aClass424Array8896.length) {
         this.aClass424Array8896 = null;
         this.anInt8897 = 0;
      }

   }

   static final void method8354(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class568.method6837(var3, var4, var0, (byte)1);
   }

   static int method8355(Class639_Sub1_Sub2_Sub1_Sub1 var0, int var1) {
      int var2 = var0.anInt12177 * 1464497723;
      RenderDef var3 = var0.method10786(-16777216);
      int var4 = var0.aClass704_Sub3_11914.method8220(-1824077736);
      if(var4 != -1 && !var0.aClass704_Sub3_11914.aBool10969) {
         if(var3.runAnimation * 1317568909 != var4 && -1340587369 * var3.runRotate180Animation != var4 && var3.runRotate90CounterAnimation * 84725405 != var4 && 1443182969 * var3.runRotate90Animation != var4) {
            if(455141683 * var3.moveType1Anim == var4 || var4 == -566579917 * var3.type1_180 || var4 == var3.type1_90_counter * -2093545587 || var3.type1_90 * -721906563 == var4) {
               var2 = 1294430513 * var0.anInt12176;
            }
         } else {
            var2 = var0.anInt12178 * -689708659;
         }
      } else {
         var2 = var0.anInt12160 * 745424635;
      }

      return var2;
   }

   static final void method8356(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub11_10609.method9946(-1739294395)?1:0;
   }

   static Class526_Sub21_Sub17 method8357(Class466 var0, int var1, int var2) {
      RSByteBuffer var3 = new RSByteBuffer(var0.method5536(0, var1, (byte)-18));
      return Class197.method2843(var3, var1, 1902670162);
   }
}
