package com.jagex;

import com.jagex.Class222;
import com.jagex.Class40_Sub14;
import com.jagex.Class499;
import com.jagex.Class526;
import com.jagex.RSByteBuffer;
import com.jagex.Class676;
import com.jagex.Class679;
import com.jagex.Class705;
import com.jagex.Class711;
import com.jagex.Class711_Sub1;
import com.jagex.Class711_Sub10;
import com.jagex.Class711_Sub11;
import com.jagex.Class711_Sub12;
import com.jagex.Class711_Sub13;
import com.jagex.Class711_Sub14;
import com.jagex.Class711_Sub15;
import com.jagex.Class711_Sub16;
import com.jagex.Class711_Sub17;
import com.jagex.Class711_Sub18;
import com.jagex.Class711_Sub19;
import com.jagex.Class711_Sub2;
import com.jagex.Class711_Sub20;
import com.jagex.Class711_Sub21;
import com.jagex.Class711_Sub22;
import com.jagex.Class711_Sub23;
import com.jagex.Class711_Sub24;
import com.jagex.Class711_Sub25;
import com.jagex.Class711_Sub26;
import com.jagex.Class711_Sub27;
import com.jagex.Class711_Sub28;
import com.jagex.Class711_Sub29;
import com.jagex.Class711_Sub3;
import com.jagex.Class711_Sub30;
import com.jagex.Class711_Sub31;
import com.jagex.Class711_Sub32;
import com.jagex.Class711_Sub33;
import com.jagex.Class711_Sub34;
import com.jagex.Class711_Sub35;
import com.jagex.Class711_Sub36;
import com.jagex.Class711_Sub37;
import com.jagex.Class711_Sub38;
import com.jagex.Class711_Sub39;
import com.jagex.Class711_Sub4;
import com.jagex.Class711_Sub40;
import com.jagex.Class711_Sub41;
import com.jagex.Class711_Sub42;
import com.jagex.Class711_Sub43;
import com.jagex.Class711_Sub5;
import com.jagex.Class711_Sub6;
import com.jagex.Class711_Sub7;
import com.jagex.Class711_Sub8;
import com.jagex.Class711_Sub9;

public class Class526_Sub33 extends Class526 {
   static final int anInt10602 = 23;
   public static final int anInt10603 = 245;
   public static final int anInt10604 = 500;
   static final int anInt10624 = 36;
   static final int anInt10658 = 52;
   public static Class40_Sub14 aClass40_Sub14_10659;
   public Class711_Sub42 aClass711_Sub42_10607;
   public Class711_Sub33 aClass711_Sub33_10608;
   Class711_Sub36 aClass711_Sub36_10652;
   public Class711_Sub33 aClass711_Sub33_10645;
   public Class711_Sub26 aClass711_Sub26_10611;
   public Class711_Sub5 aClass711_Sub5_10612;
   public Class711_Sub12 aClass711_Sub12_10613;
   public Class711_Sub22 aClass711_Sub22_10615;
   public Class711_Sub20 aClass711_Sub20_10616;
   public Class711_Sub15 aClass711_Sub15_10610;
   public Class711_Sub31 aClass711_Sub31_10635;
   public Class711_Sub11 aClass711_Sub11_10609;
   public Class711_Sub39 aClass711_Sub39_10617;
   public Class711_Sub9 aClass711_Sub9_10618;
   public Class711_Sub1 aClass711_Sub1_10622;
   public Class711_Sub10 aClass711_Sub10_10623;
   public Class711_Sub13 aClass711_Sub13_10647;
   public Class711_Sub8 aClass711_Sub8_10625;
   public Class711_Sub18 aClass711_Sub18_10619;
   public Class711_Sub18 aClass711_Sub18_10627;
   public Class711_Sub43 aClass711_Sub43_10628;
   public Class711_Sub21 aClass711_Sub21_10629;
   public Class711_Sub3 aClass711_Sub3_10644;
   public Class711_Sub17 aClass711_Sub17_10601;
   public Class711_Sub19 aClass711_Sub19_10632;
   public Class711_Sub19 aClass711_Sub19_10633;
   public Class711_Sub16 aClass711_Sub16_10634;
   public Class711_Sub7 aClass711_Sub7_10637;
   Class711_Sub37 aClass711_Sub37_10638;
   Class711_Sub2 aClass711_Sub2_10639;
   Class711_Sub14 aClass711_Sub14_10640;
   Class711_Sub4 aClass711_Sub4_10650;
   Class711_Sub34 aClass711_Sub34_10641;
   Class711_Sub38 aClass711_Sub38_10642;
   Class711_Sub35 aClass711_Sub35_10643;
   Class711_Sub6 aClass711_Sub6_10646;
   public Class711_Sub7 aClass711_Sub7_10636;
   public Class711_Sub30 aClass711_Sub30_10621;
   public Class711_Sub27 aClass711_Sub27_10648;
   public Class711_Sub28 aClass711_Sub28_10656;
   public Class711_Sub23 aClass711_Sub23_10630;
   public Class711_Sub40 aClass711_Sub40_10649;
   public Class711_Sub25 aClass711_Sub25_10626;
   Class711_Sub32 aClass711_Sub32_10651;
   public Class711_Sub41 aClass711_Sub41_10614;
   public Class711_Sub29 aClass711_Sub29_10605;
   public Class711_Sub29 aClass711_Sub29_10653;
   public Class711_Sub29 aClass711_Sub29_10654;
   public Class711_Sub29 aClass711_Sub29_10655;
   public Class711_Sub29 aClass711_Sub29_10631;
   public Class711_Sub24 aClass711_Sub24_10657;
   Class676 aClass676_10620;
   Class705 aClass705_10606;

   public void method9593(Class711_Sub19 var1, boolean var2, int var3) {
      var1.method10019(var2, 431960124);
      this.method9597(1997934341);
   }

   void method9594(RSByteBuffer var1, int var2) {
      if(var1 != null && var1.buffer != null) {
         int var3 = var1.readUnsignedByte(-863487365);
         if(var3 < 23) {
            try {
               this.method9595(var1, var3, 1734683695);
            } catch (Exception var5) {
               this.method9596(true, true, -435848149);
            }

            this.method9596(false, true, -1500604545);
         } else if(var3 > 36) {
            this.method9596(true, true, 1182651519);
         } else {
            if(var3 >= 29) {
               this.aClass711_Sub42_10607 = new Class711_Sub42(var1.readUnsignedByte(1500137157), this);
            }

            this.aClass711_Sub33_10608 = new Class711_Sub33(var1.readUnsignedByte(1534483704), this);
            if(var3 >= 31) {
               this.aClass711_Sub36_10652 = new Class711_Sub36(var1.readUnsignedByte(782025078), this);
            }

            this.aClass711_Sub33_10645 = new Class711_Sub33(this.aClass711_Sub33_10608.method10135((byte)62), this);
            this.aClass711_Sub26_10611 = new Class711_Sub26(var1.readUnsignedByte(121043831), this);
            this.aClass711_Sub5_10612 = new Class711_Sub5(var1.readUnsignedByte(-1197635718), this);
            this.aClass711_Sub12_10613 = new Class711_Sub12(var1.readUnsignedByte(-881447436), this);
            if(var3 >= 27) {
               this.aClass711_Sub22_10615 = new Class711_Sub22(var1.readUnsignedByte(-425172514), this);
            }

            this.aClass711_Sub20_10616 = new Class711_Sub20(var1.readUnsignedByte(-533085238), this);
            this.aClass711_Sub15_10610 = new Class711_Sub15(var1.readUnsignedByte(1062127400), this);
            this.aClass711_Sub31_10635 = new Class711_Sub31(var1.readUnsignedByte(-1395474375), this);
            this.aClass711_Sub11_10609 = new Class711_Sub11(var1.readUnsignedByte(-362704266), this);
            this.aClass711_Sub39_10617 = new Class711_Sub39(var1.readUnsignedByte(-538963975), this);
            this.aClass711_Sub9_10618 = new Class711_Sub9(var1.readUnsignedByte(-81454206), this);
            this.aClass711_Sub1_10622 = new Class711_Sub1(var1.readUnsignedByte(765265868), this);
            if(var3 >= 33) {
               this.aClass711_Sub10_10623 = new Class711_Sub10(var1.readUnsignedByte(1165279162), this);
            }

            if(var3 >= 34) {
               var1.readUnsignedByte(-993051632);
            }

            if(var3 >= 24) {
               this.aClass711_Sub13_10647 = new Class711_Sub13(var1.readUnsignedByte(-1279529907), this);
            }

            this.aClass711_Sub8_10625 = new Class711_Sub8(var1.readUnsignedByte(1380991304), this);
            this.aClass711_Sub18_10619 = new Class711_Sub18(var1.readUnsignedByte(-1845774023), this);
            this.aClass711_Sub18_10627 = new Class711_Sub18(this.aClass711_Sub18_10619.method10015(1522905654), this);
            this.aClass711_Sub43_10628 = new Class711_Sub43(var1.readUnsignedByte(1684596147), this);
            if(var3 >= 25) {
               this.aClass711_Sub21_10629 = new Class711_Sub21(var1.readUnsignedByte(-1267391139), this);
            }

            this.aClass711_Sub3_10644 = new Class711_Sub3(var1.readUnsignedByte(-1292078122), this);
            if(var3 <= 25) {
               var1.pos += 801976415;
            }

            this.aClass711_Sub17_10601 = new Class711_Sub17(var1.readUnsignedByte(-134151285), this);
            this.aClass711_Sub19_10632 = new Class711_Sub19(var1.readUnsignedByte(1490783761), this);
            this.aClass711_Sub19_10633 = new Class711_Sub19(this.aClass711_Sub19_10632.method10022((byte)-74), this);
            var1.readUnsignedByte(-1751144298);
            this.aClass711_Sub16_10634 = new Class711_Sub16(var1.readUnsignedByte(243217196), this);
            this.aClass711_Sub7_10637 = new Class711_Sub7(var1.readUnsignedByte(-2024052128), this);
            if(var3 >= 35) {
               this.aClass711_Sub37_10638 = new Class711_Sub37(var1.readUnsignedByte(803568618), this);
               this.aClass711_Sub2_10639 = new Class711_Sub2(var1.readUnsignedByte(-784728082), this);
               this.aClass711_Sub14_10640 = new Class711_Sub14(var1.readUnsignedByte(-1890410091), this);
               this.aClass711_Sub4_10650 = new Class711_Sub4(var1.readUnsignedByte(1185534580), this);
               this.aClass711_Sub34_10641 = new Class711_Sub34(var1.readUnsignedByte(642899343), this);
               this.aClass711_Sub38_10642 = new Class711_Sub38(var1.readByte((byte)13), this);
            }

            if(var3 >= 36) {
               this.aClass711_Sub35_10643 = new Class711_Sub35(var1.readUnsignedByte(949571433), this);
               this.aClass711_Sub6_10646 = new Class711_Sub6(var1.readUnsignedByte(-2038779417), this);
            }

            this.aClass711_Sub7_10636 = new Class711_Sub7(this.aClass711_Sub7_10637.method9899((byte)87), this);
            this.aClass711_Sub30_10621 = new Class711_Sub30(var1.readUnsignedByte(-482915437), this);
            this.aClass711_Sub27_10648 = new Class711_Sub27(var1.readUnsignedByte(-180868383), this);
            this.aClass711_Sub28_10656 = new Class711_Sub28(var1.readUnsignedByte(1899792155), this);
            this.aClass711_Sub23_10630 = new Class711_Sub23(var1.readUnsignedByte(1780001164), this);
            this.aClass711_Sub40_10649 = new Class711_Sub40(var1.readUnsignedByte(-1634770279), this);
            if(var3 >= 26) {
               this.aClass711_Sub25_10626 = new Class711_Sub25(var1.readUnsignedByte(-821704879), this);
            }

            if(var3 >= 28) {
               this.aClass711_Sub32_10651 = new Class711_Sub32(var1.readUnsignedByte(-736897751), this);
            }

            if(var3 >= 30) {
               this.aClass711_Sub41_10614 = new Class711_Sub41(var1.readUnsignedByte(237822589), this);
            }

            this.aClass711_Sub29_10605 = new Class711_Sub29(var1.readUnsignedByte(-410340493), this);
            this.aClass711_Sub29_10653 = new Class711_Sub29(var1.readUnsignedByte(1666835421), this);
            this.aClass711_Sub29_10654 = new Class711_Sub29(var1.readUnsignedByte(1535399878), this);
            this.aClass711_Sub29_10655 = new Class711_Sub29(var1.readUnsignedByte(1460587843), this);
            this.aClass711_Sub29_10631 = new Class711_Sub29(var1.readUnsignedByte(-40125665), this);
            this.aClass711_Sub24_10657 = new Class711_Sub24(var1.readUnsignedByte(-1715756775), this);
            this.method9596(false, var3 < 32, 402050789);
         }
      } else {
         this.method9596(true, true, -55456936);
      }

      this.method9597(-617698311);
   }

   public Class526_Sub33(Class676 var1, int var2) {
      this.aClass676_10620 = var1;
      this.aClass705_10606 = new Class705(Class499.anInt5628 * -642600783, Class499.anInt5629 * -536458187, Class679.aString8601.toLowerCase().indexOf("arm") != -1, Class222.aString2308.startsWith("win"), false);
      this.aClass711_Sub19_10633 = new Class711_Sub19(var2, this);
      this.method9596(true, true, -1799745803);
   }

   void method9595(RSByteBuffer var1, int var2, int var3) {
      this.aClass711_Sub5_10612 = new Class711_Sub5(var1.readUnsignedByte(359665466), this);
      var1.pos += 801976415;
      this.aClass711_Sub18_10619 = new Class711_Sub18(var1.readUnsignedByte(237187827) + 1, this);
      this.aClass711_Sub11_10609 = new Class711_Sub11(var1.readUnsignedByte(237234598), this);
      var1.pos += 801976415;
      this.aClass711_Sub39_10617 = new Class711_Sub39(var1.readUnsignedByte(-1405980381), this);
      this.aClass711_Sub20_10616 = new Class711_Sub20(var1.readUnsignedByte(-1081471018), this);
      var1.readUnsignedByte(173586234);
      this.aClass711_Sub3_10644 = new Class711_Sub3(var1.readUnsignedByte(1821963303), this);
      int var4 = var1.readUnsignedByte(1674099115);
      int var5 = 0;
      if(var2 >= 17) {
         var5 = var1.readUnsignedByte(1933505536);
      }

      this.aClass711_Sub1_10622 = new Class711_Sub1(var4 > var5?var4:var5, this);
      boolean var6 = true;
      boolean var7 = true;
      if(var2 >= 2) {
         var6 = var1.readUnsignedByte(-2030921139) == 1;
         if(var2 >= 17) {
            var7 = var1.readUnsignedByte(-683514161) == 1;
         }
      } else {
         var6 = var1.readUnsignedByte(1912649203) == 1;
         var1.readUnsignedByte(-1485205973);
      }

      this.aClass711_Sub9_10618 = new Class711_Sub9(var6 | var7?1:0, this);
      this.aClass711_Sub16_10634 = new Class711_Sub16(var1.readUnsignedByte(1277803255), this);
      this.aClass711_Sub15_10610 = new Class711_Sub15(var1.readUnsignedByte(727152345), this);
      this.aClass711_Sub33_10608 = new Class711_Sub33(var1.readUnsignedByte(994285772), this);
      this.aClass711_Sub24_10657 = new Class711_Sub24(var1.readUnsignedByte(1334565598), this);
      this.aClass711_Sub29_10605 = new Class711_Sub29(var1.readUnsignedByte(908843150), this);
      if(var2 >= 20) {
         this.aClass711_Sub29_10654 = new Class711_Sub29(var1.readUnsignedByte(2084902034), this);
      } else {
         this.aClass711_Sub29_10654 = new Class711_Sub29(this.aClass711_Sub29_10605.method10105((byte)4), this);
      }

      this.aClass711_Sub29_10655 = new Class711_Sub29(var1.readUnsignedByte(-548213099), this);
      this.aClass711_Sub29_10653 = new Class711_Sub29(var1.readUnsignedByte(2139370156), this);
      if(var2 >= 21) {
         this.aClass711_Sub29_10631 = new Class711_Sub29(var1.readUnsignedByte(-1342106370), this);
      } else {
         this.aClass711_Sub29_10631 = new Class711_Sub29(this.aClass711_Sub29_10655.method10105((byte)26), this);
      }

      if(var2 >= 1) {
         var1.readUnsignedShort(1380693221);
         var1.readUnsignedShort(1811620532);
      }

      if(var2 >= 3 && var2 < 6) {
         var1.readUnsignedByte(853818710);
      }

      if(var2 >= 4) {
         this.aClass711_Sub8_10625 = new Class711_Sub8(var1.readUnsignedByte(-440123585), this);
      }

      var1.readInt((byte)5);
      if(var2 >= 6) {
         this.aClass711_Sub7_10637 = new Class711_Sub7(var1.readUnsignedByte(-1086931910), this);
      }

      if(var2 >= 7) {
         this.aClass711_Sub40_10649 = new Class711_Sub40(var1.readUnsignedByte(-522209604), this);
      }

      if(var2 >= 8) {
         var1.readUnsignedByte(-1435988590);
      }

      if(var2 >= 9) {
         this.aClass711_Sub12_10613 = new Class711_Sub12(var1.readUnsignedByte(-1383141300), this);
      }

      if(var2 >= 10) {
         this.aClass711_Sub26_10611 = new Class711_Sub26(var1.readUnsignedByte(373497404), this);
      }

      if(var2 >= 11) {
         this.aClass711_Sub30_10621 = new Class711_Sub30(var1.readUnsignedByte(-1820972335), this);
      }

      if(var2 >= 12) {
         this.aClass711_Sub39_10617 = new Class711_Sub39(var1.readUnsignedByte(-1311829309), this);
      }

      if(var2 >= 13) {
         this.aClass711_Sub31_10635 = new Class711_Sub31(var1.readUnsignedByte(-1749784886), this);
      }

      if(var2 >= 14) {
         this.aClass711_Sub19_10632 = new Class711_Sub19(var1.readUnsignedByte(-597790345), this);
      }

      if(var2 >= 15) {
         this.aClass711_Sub28_10656 = new Class711_Sub28(var1.readUnsignedByte(1202931416), this);
      }

      if(var2 >= 16) {
         this.aClass711_Sub17_10601 = new Class711_Sub17(var1.readUnsignedByte(1771396469), this);
      }

      if(var2 >= 18) {
         this.aClass711_Sub27_10648 = new Class711_Sub27(var1.readUnsignedByte(-569743013), this);
      }

      if(var2 >= 19) {
         this.aClass711_Sub43_10628 = new Class711_Sub43(var1.readUnsignedByte(2049536703), this);
      }

      if(var2 >= 22) {
         this.aClass711_Sub23_10630 = new Class711_Sub23(var1.readUnsignedByte(1754581751), this);
      }

   }

   void method9596(boolean var1, boolean var2, int var3) {
      if(var1 || this.aClass711_Sub42_10607 == null) {
         this.aClass711_Sub42_10607 = new Class711_Sub42(this);
      }

      if(var1 || this.aClass711_Sub33_10608 == null) {
         this.aClass711_Sub33_10608 = new Class711_Sub33(this);
      }

      if(var1 || this.aClass711_Sub36_10652 == null) {
         this.aClass711_Sub36_10652 = new Class711_Sub36(this);
      }

      if(var1 || null == this.aClass711_Sub33_10645) {
         this.aClass711_Sub33_10645 = new Class711_Sub33(this.aClass711_Sub33_10608.method10135((byte)117), this);
      }

      if(var1 || null == this.aClass711_Sub26_10611) {
         this.aClass711_Sub26_10611 = new Class711_Sub26(this);
      }

      if(var1 || null == this.aClass711_Sub5_10612) {
         this.aClass711_Sub5_10612 = new Class711_Sub5(this);
      }

      if(var1 || this.aClass711_Sub12_10613 == null) {
         this.aClass711_Sub12_10613 = new Class711_Sub12(this);
      }

      if(var1 || this.aClass711_Sub22_10615 == null) {
         this.aClass711_Sub22_10615 = new Class711_Sub22(this);
      }

      if(var1 || this.aClass711_Sub20_10616 == null) {
         this.aClass711_Sub20_10616 = new Class711_Sub20(this);
      }

      if(var1 || this.aClass711_Sub15_10610 == null) {
         this.aClass711_Sub15_10610 = new Class711_Sub15(this);
      }

      if(var1 || null == this.aClass711_Sub31_10635) {
         this.aClass711_Sub31_10635 = new Class711_Sub31(this);
      }

      if(var1 || null == this.aClass711_Sub11_10609) {
         this.aClass711_Sub11_10609 = new Class711_Sub11(this);
      }

      if(var1 || this.aClass711_Sub39_10617 == null) {
         this.aClass711_Sub39_10617 = new Class711_Sub39(this);
      }

      if(var1 || this.aClass711_Sub9_10618 == null) {
         this.aClass711_Sub9_10618 = new Class711_Sub9(this);
      }

      if(var1 || this.aClass711_Sub1_10622 == null) {
         this.aClass711_Sub1_10622 = new Class711_Sub1(this);
      }

      if(var1 || null == this.aClass711_Sub10_10623) {
         this.aClass711_Sub10_10623 = new Class711_Sub10(this);
      }

      if(var1 || null == this.aClass711_Sub13_10647) {
         this.aClass711_Sub13_10647 = new Class711_Sub13(this);
      }

      if(var1 || this.aClass711_Sub8_10625 == null) {
         this.aClass711_Sub8_10625 = new Class711_Sub8(this);
      }

      if(var1 || this.aClass711_Sub18_10619 == null) {
         this.aClass711_Sub18_10619 = new Class711_Sub18(this);
      }

      if(var1 || null == this.aClass711_Sub18_10627) {
         this.aClass711_Sub18_10627 = new Class711_Sub18(this.aClass711_Sub18_10619.method10015(-760803324), this);
      }

      if(var1 || this.aClass711_Sub43_10628 == null) {
         this.aClass711_Sub43_10628 = new Class711_Sub43(this);
      }

      if(var1 || null == this.aClass711_Sub21_10629) {
         this.aClass711_Sub21_10629 = new Class711_Sub21(this);
      }

      if(var1 || null == this.aClass711_Sub3_10644) {
         this.aClass711_Sub3_10644 = new Class711_Sub3(this);
      }

      if(var1 || null == this.aClass711_Sub17_10601) {
         this.aClass711_Sub17_10601 = new Class711_Sub17(this);
      }

      if(var1 || null == this.aClass711_Sub19_10632) {
         this.aClass711_Sub19_10632 = new Class711_Sub19(this);
      }

      if(var1 || null == this.aClass711_Sub19_10633) {
         this.aClass711_Sub19_10633 = new Class711_Sub19(this.aClass711_Sub19_10632.method10022((byte)-20), this);
      }

      if(var1 || null == this.aClass711_Sub16_10634) {
         this.aClass711_Sub16_10634 = new Class711_Sub16(this);
      }

      if(var1 || this.aClass711_Sub7_10637 == null) {
         this.aClass711_Sub7_10637 = new Class711_Sub7(this);
      }

      if(var1 || this.aClass711_Sub7_10636 == null) {
         this.aClass711_Sub7_10636 = new Class711_Sub7(this.aClass711_Sub7_10637.method9899((byte)97), this);
      }

      if(var1 || this.aClass711_Sub4_10650 == null) {
         this.aClass711_Sub4_10650 = new Class711_Sub4(this);
      }

      if(var1 || this.aClass711_Sub37_10638 == null) {
         this.aClass711_Sub37_10638 = new Class711_Sub37(this);
      }

      if(var1 || this.aClass711_Sub2_10639 == null) {
         this.aClass711_Sub2_10639 = new Class711_Sub2(this);
      }

      if(var1 || this.aClass711_Sub14_10640 == null) {
         this.aClass711_Sub14_10640 = new Class711_Sub14(this);
      }

      if(var1 || null == this.aClass711_Sub34_10641) {
         this.aClass711_Sub34_10641 = new Class711_Sub34(this);
      }

      if(var1 || this.aClass711_Sub38_10642 == null) {
         this.aClass711_Sub38_10642 = new Class711_Sub38(this);
      }

      if(var1 || null == this.aClass711_Sub35_10643) {
         this.aClass711_Sub35_10643 = new Class711_Sub35(this);
      }

      if(var1 || null == this.aClass711_Sub6_10646) {
         this.aClass711_Sub6_10646 = new Class711_Sub6(this);
      }

      if(var1 || this.aClass711_Sub30_10621 == null) {
         this.aClass711_Sub30_10621 = new Class711_Sub30(this);
      }

      if(var1 || this.aClass711_Sub27_10648 == null) {
         this.aClass711_Sub27_10648 = new Class711_Sub27(this);
      }

      if(var1 || null == this.aClass711_Sub28_10656) {
         this.aClass711_Sub28_10656 = new Class711_Sub28(this);
      }

      if(var1 || null == this.aClass711_Sub23_10630) {
         this.aClass711_Sub23_10630 = new Class711_Sub23(this);
      }

      if(var1 || null == this.aClass711_Sub40_10649) {
         this.aClass711_Sub40_10649 = new Class711_Sub40(this);
      }

      if(var1 || this.aClass711_Sub25_10626 == null) {
         this.aClass711_Sub25_10626 = new Class711_Sub25(this);
      }

      if(var1 || null == this.aClass711_Sub32_10651) {
         this.aClass711_Sub32_10651 = new Class711_Sub32(this);
      }

      if(var1 || this.aClass711_Sub41_10614 == null) {
         this.aClass711_Sub41_10614 = new Class711_Sub41(this);
      }

      if(var1 || var2 || this.aClass711_Sub29_10605 == null) {
         this.aClass711_Sub29_10605 = new Class711_Sub29(this);
      }

      if(var1 || var2 || null == this.aClass711_Sub29_10653) {
         this.aClass711_Sub29_10653 = new Class711_Sub29(this);
      }

      if(var1 || var2 || null == this.aClass711_Sub29_10654) {
         this.aClass711_Sub29_10654 = new Class711_Sub29(this);
      }

      if(var1 || var2 || this.aClass711_Sub29_10655 == null) {
         this.aClass711_Sub29_10655 = new Class711_Sub29(this);
      }

      if(var1 || var2 || null == this.aClass711_Sub29_10631) {
         this.aClass711_Sub29_10631 = new Class711_Sub29(this);
      }

      if(var1 || var2 || this.aClass711_Sub24_10657 == null) {
         this.aClass711_Sub24_10657 = new Class711_Sub24(this);
      }

   }

   void method9597(int var1) {
      this.aClass711_Sub42_10607.method10193(1301085884);
      this.aClass711_Sub33_10608.method10132(-1130182355);
      this.aClass711_Sub36_10652.method10156(-526605928);
      this.aClass711_Sub33_10645.method10132(-1349860170);
      this.aClass711_Sub26_10611.method10078(1999518027);
      this.aClass711_Sub5_10612.method9886(-1233793613);
      this.aClass711_Sub12_10613.method9956(2075528462);
      this.aClass711_Sub22_10615.method10055(-867824331);
      this.aClass711_Sub20_10616.method10036(-1381397044);
      this.aClass711_Sub15_10610.method9984((byte)28);
      this.aClass711_Sub31_10635.method10117(-1413404306);
      this.aClass711_Sub11_10609.method9944((byte)-52);
      this.aClass711_Sub39_10617.method10174(-898898352);
      this.aClass711_Sub9_10618.method9923(801675325);
      this.aClass711_Sub1_10622.method9803(591823821);
      this.aClass711_Sub10_10623.method9932(-1802738540);
      this.aClass711_Sub13_10647.method9970((byte)30);
      this.aClass711_Sub8_10625.method9904(-1695367749);
      this.aClass711_Sub18_10619.method10014((byte)102);
      this.aClass711_Sub18_10627.method10014((byte)72);
      this.aClass711_Sub43_10628.method10224(-1992526479);
      this.aClass711_Sub21_10629.method10043(-2088729297);
      this.aClass711_Sub3_10644.method9872(1357292528);
      this.aClass711_Sub17_10601.method10003(-773889270);
      this.aClass711_Sub19_10632.method10020(-1904104245);
      this.aClass711_Sub19_10633.method10020(-1909065349);
      this.aClass711_Sub16_10634.method9989(944147329);
      this.aClass711_Sub7_10637.method9898((byte)-117);
      this.aClass711_Sub7_10636.method9898((byte)-91);
      this.aClass711_Sub4_10650.method9879(1886887522);
      this.aClass711_Sub37_10638.method10163((byte)1);
      this.aClass711_Sub2_10639.method9816(-1962658757);
      this.aClass711_Sub14_10640.method9976(-267176449);
      this.aClass711_Sub34_10641.method10142((byte)26);
      this.aClass711_Sub38_10642.method10171(790087154);
      this.aClass711_Sub35_10643.method10150(-185846740);
      this.aClass711_Sub6_10646.method9896(1777802464);
      this.aClass711_Sub30_10621.method10112(-2029227145);
      this.aClass711_Sub27_10648.method10088((byte)104);
      this.aClass711_Sub28_10656.method10097(507186440);
      this.aClass711_Sub23_10630.method10060((short)256);
      this.aClass711_Sub40_10649.method10179(-1493149588);
      this.aClass711_Sub25_10626.method10071((byte)2);
      this.aClass711_Sub32_10651.method10124(-1618710654);
      this.aClass711_Sub41_10614.method10185(-2133828219);
      this.aClass711_Sub29_10605.method10103(-1869745151);
      this.aClass711_Sub29_10653.method10103(-1761161911);
      this.aClass711_Sub29_10654.method10103(-1666342415);
      this.aClass711_Sub29_10655.method10103(-1759094072);
      this.aClass711_Sub29_10631.method10103(-1496292067);
      this.aClass711_Sub24_10657.method10069(-1803200165);
   }

   public Class676 method9598(byte var1) {
      return this.aClass676_10620;
   }

   public Class705 method9599(byte var1) {
      return this.aClass705_10606;
   }

   void method9600(RSByteBuffer var1) {
      if(var1 != null && var1.buffer != null) {
         int var2 = var1.readUnsignedByte(645976901);
         if(var2 < 23) {
            try {
               this.method9595(var1, var2, 25787838);
            } catch (Exception var4) {
               this.method9596(true, true, 78619212);
            }

            this.method9596(false, true, -519308775);
         } else if(var2 > 36) {
            this.method9596(true, true, 1779784147);
         } else {
            if(var2 >= 29) {
               this.aClass711_Sub42_10607 = new Class711_Sub42(var1.readUnsignedByte(540000814), this);
            }

            this.aClass711_Sub33_10608 = new Class711_Sub33(var1.readUnsignedByte(-2015693575), this);
            if(var2 >= 31) {
               this.aClass711_Sub36_10652 = new Class711_Sub36(var1.readUnsignedByte(1216619496), this);
            }

            this.aClass711_Sub33_10645 = new Class711_Sub33(this.aClass711_Sub33_10608.method10135((byte)66), this);
            this.aClass711_Sub26_10611 = new Class711_Sub26(var1.readUnsignedByte(1396588767), this);
            this.aClass711_Sub5_10612 = new Class711_Sub5(var1.readUnsignedByte(-374136570), this);
            this.aClass711_Sub12_10613 = new Class711_Sub12(var1.readUnsignedByte(403084058), this);
            if(var2 >= 27) {
               this.aClass711_Sub22_10615 = new Class711_Sub22(var1.readUnsignedByte(1338600691), this);
            }

            this.aClass711_Sub20_10616 = new Class711_Sub20(var1.readUnsignedByte(-1147032577), this);
            this.aClass711_Sub15_10610 = new Class711_Sub15(var1.readUnsignedByte(-848020175), this);
            this.aClass711_Sub31_10635 = new Class711_Sub31(var1.readUnsignedByte(2110235172), this);
            this.aClass711_Sub11_10609 = new Class711_Sub11(var1.readUnsignedByte(-1315130897), this);
            this.aClass711_Sub39_10617 = new Class711_Sub39(var1.readUnsignedByte(1028547953), this);
            this.aClass711_Sub9_10618 = new Class711_Sub9(var1.readUnsignedByte(726087570), this);
            this.aClass711_Sub1_10622 = new Class711_Sub1(var1.readUnsignedByte(2123916078), this);
            if(var2 >= 33) {
               this.aClass711_Sub10_10623 = new Class711_Sub10(var1.readUnsignedByte(90009927), this);
            }

            if(var2 >= 34) {
               var1.readUnsignedByte(-1970316524);
            }

            if(var2 >= 24) {
               this.aClass711_Sub13_10647 = new Class711_Sub13(var1.readUnsignedByte(1306672279), this);
            }

            this.aClass711_Sub8_10625 = new Class711_Sub8(var1.readUnsignedByte(-1591904931), this);
            this.aClass711_Sub18_10619 = new Class711_Sub18(var1.readUnsignedByte(1249402355), this);
            this.aClass711_Sub18_10627 = new Class711_Sub18(this.aClass711_Sub18_10619.method10015(-635136358), this);
            this.aClass711_Sub43_10628 = new Class711_Sub43(var1.readUnsignedByte(2099751378), this);
            if(var2 >= 25) {
               this.aClass711_Sub21_10629 = new Class711_Sub21(var1.readUnsignedByte(1209886275), this);
            }

            this.aClass711_Sub3_10644 = new Class711_Sub3(var1.readUnsignedByte(724404195), this);
            if(var2 <= 25) {
               var1.pos += 801976415;
            }

            this.aClass711_Sub17_10601 = new Class711_Sub17(var1.readUnsignedByte(646144378), this);
            this.aClass711_Sub19_10632 = new Class711_Sub19(var1.readUnsignedByte(1742958505), this);
            this.aClass711_Sub19_10633 = new Class711_Sub19(this.aClass711_Sub19_10632.method10022((byte)-24), this);
            var1.readUnsignedByte(-779297244);
            this.aClass711_Sub16_10634 = new Class711_Sub16(var1.readUnsignedByte(1650281478), this);
            this.aClass711_Sub7_10637 = new Class711_Sub7(var1.readUnsignedByte(-1776820747), this);
            if(var2 >= 35) {
               this.aClass711_Sub37_10638 = new Class711_Sub37(var1.readUnsignedByte(-424616538), this);
               this.aClass711_Sub2_10639 = new Class711_Sub2(var1.readUnsignedByte(1534934876), this);
               this.aClass711_Sub14_10640 = new Class711_Sub14(var1.readUnsignedByte(-1017665766), this);
               this.aClass711_Sub4_10650 = new Class711_Sub4(var1.readUnsignedByte(-772591602), this);
               this.aClass711_Sub34_10641 = new Class711_Sub34(var1.readUnsignedByte(-569800221), this);
               this.aClass711_Sub38_10642 = new Class711_Sub38(var1.readByte((byte)71), this);
            }

            if(var2 >= 36) {
               this.aClass711_Sub35_10643 = new Class711_Sub35(var1.readUnsignedByte(-1336264549), this);
               this.aClass711_Sub6_10646 = new Class711_Sub6(var1.readUnsignedByte(625616004), this);
            }

            this.aClass711_Sub7_10636 = new Class711_Sub7(this.aClass711_Sub7_10637.method9899((byte)126), this);
            this.aClass711_Sub30_10621 = new Class711_Sub30(var1.readUnsignedByte(-756715268), this);
            this.aClass711_Sub27_10648 = new Class711_Sub27(var1.readUnsignedByte(-1418460785), this);
            this.aClass711_Sub28_10656 = new Class711_Sub28(var1.readUnsignedByte(-1467519455), this);
            this.aClass711_Sub23_10630 = new Class711_Sub23(var1.readUnsignedByte(531474360), this);
            this.aClass711_Sub40_10649 = new Class711_Sub40(var1.readUnsignedByte(-1474922360), this);
            if(var2 >= 26) {
               this.aClass711_Sub25_10626 = new Class711_Sub25(var1.readUnsignedByte(-102393115), this);
            }

            if(var2 >= 28) {
               this.aClass711_Sub32_10651 = new Class711_Sub32(var1.readUnsignedByte(-659317824), this);
            }

            if(var2 >= 30) {
               this.aClass711_Sub41_10614 = new Class711_Sub41(var1.readUnsignedByte(-1984733636), this);
            }

            this.aClass711_Sub29_10605 = new Class711_Sub29(var1.readUnsignedByte(-1138155766), this);
            this.aClass711_Sub29_10653 = new Class711_Sub29(var1.readUnsignedByte(1036814130), this);
            this.aClass711_Sub29_10654 = new Class711_Sub29(var1.readUnsignedByte(-1766983976), this);
            this.aClass711_Sub29_10655 = new Class711_Sub29(var1.readUnsignedByte(-1952583262), this);
            this.aClass711_Sub29_10631 = new Class711_Sub29(var1.readUnsignedByte(784645994), this);
            this.aClass711_Sub24_10657 = new Class711_Sub24(var1.readUnsignedByte(-1920326446), this);
            this.method9596(false, var2 < 32, -1106168172);
         }
      } else {
         this.method9596(true, true, 1584952609);
      }

      this.method9597(1837989718);
   }

   public Class526_Sub33(RSByteBuffer var1, Class676 var2, int var3) {
      this.aClass676_10620 = var2;
      this.aClass705_10606 = new Class705(-642600783 * Class499.anInt5628, -536458187 * Class499.anInt5629, Class679.aString8601.indexOf("arm") != -1, Class222.aString2308.startsWith("win"), false);
      this.aClass711_Sub19_10633 = new Class711_Sub19(var3, this);
      this.method9594(var1, -719367534);
   }

   void method9601(boolean var1, boolean var2) {
      if(var1 || this.aClass711_Sub42_10607 == null) {
         this.aClass711_Sub42_10607 = new Class711_Sub42(this);
      }

      if(var1 || this.aClass711_Sub33_10608 == null) {
         this.aClass711_Sub33_10608 = new Class711_Sub33(this);
      }

      if(var1 || this.aClass711_Sub36_10652 == null) {
         this.aClass711_Sub36_10652 = new Class711_Sub36(this);
      }

      if(var1 || null == this.aClass711_Sub33_10645) {
         this.aClass711_Sub33_10645 = new Class711_Sub33(this.aClass711_Sub33_10608.method10135((byte)13), this);
      }

      if(var1 || null == this.aClass711_Sub26_10611) {
         this.aClass711_Sub26_10611 = new Class711_Sub26(this);
      }

      if(var1 || null == this.aClass711_Sub5_10612) {
         this.aClass711_Sub5_10612 = new Class711_Sub5(this);
      }

      if(var1 || this.aClass711_Sub12_10613 == null) {
         this.aClass711_Sub12_10613 = new Class711_Sub12(this);
      }

      if(var1 || this.aClass711_Sub22_10615 == null) {
         this.aClass711_Sub22_10615 = new Class711_Sub22(this);
      }

      if(var1 || this.aClass711_Sub20_10616 == null) {
         this.aClass711_Sub20_10616 = new Class711_Sub20(this);
      }

      if(var1 || this.aClass711_Sub15_10610 == null) {
         this.aClass711_Sub15_10610 = new Class711_Sub15(this);
      }

      if(var1 || null == this.aClass711_Sub31_10635) {
         this.aClass711_Sub31_10635 = new Class711_Sub31(this);
      }

      if(var1 || null == this.aClass711_Sub11_10609) {
         this.aClass711_Sub11_10609 = new Class711_Sub11(this);
      }

      if(var1 || this.aClass711_Sub39_10617 == null) {
         this.aClass711_Sub39_10617 = new Class711_Sub39(this);
      }

      if(var1 || this.aClass711_Sub9_10618 == null) {
         this.aClass711_Sub9_10618 = new Class711_Sub9(this);
      }

      if(var1 || this.aClass711_Sub1_10622 == null) {
         this.aClass711_Sub1_10622 = new Class711_Sub1(this);
      }

      if(var1 || null == this.aClass711_Sub10_10623) {
         this.aClass711_Sub10_10623 = new Class711_Sub10(this);
      }

      if(var1 || null == this.aClass711_Sub13_10647) {
         this.aClass711_Sub13_10647 = new Class711_Sub13(this);
      }

      if(var1 || this.aClass711_Sub8_10625 == null) {
         this.aClass711_Sub8_10625 = new Class711_Sub8(this);
      }

      if(var1 || this.aClass711_Sub18_10619 == null) {
         this.aClass711_Sub18_10619 = new Class711_Sub18(this);
      }

      if(var1 || null == this.aClass711_Sub18_10627) {
         this.aClass711_Sub18_10627 = new Class711_Sub18(this.aClass711_Sub18_10619.method10015(467061625), this);
      }

      if(var1 || this.aClass711_Sub43_10628 == null) {
         this.aClass711_Sub43_10628 = new Class711_Sub43(this);
      }

      if(var1 || null == this.aClass711_Sub21_10629) {
         this.aClass711_Sub21_10629 = new Class711_Sub21(this);
      }

      if(var1 || null == this.aClass711_Sub3_10644) {
         this.aClass711_Sub3_10644 = new Class711_Sub3(this);
      }

      if(var1 || null == this.aClass711_Sub17_10601) {
         this.aClass711_Sub17_10601 = new Class711_Sub17(this);
      }

      if(var1 || null == this.aClass711_Sub19_10632) {
         this.aClass711_Sub19_10632 = new Class711_Sub19(this);
      }

      if(var1 || null == this.aClass711_Sub19_10633) {
         this.aClass711_Sub19_10633 = new Class711_Sub19(this.aClass711_Sub19_10632.method10022((byte)-14), this);
      }

      if(var1 || null == this.aClass711_Sub16_10634) {
         this.aClass711_Sub16_10634 = new Class711_Sub16(this);
      }

      if(var1 || this.aClass711_Sub7_10637 == null) {
         this.aClass711_Sub7_10637 = new Class711_Sub7(this);
      }

      if(var1 || this.aClass711_Sub7_10636 == null) {
         this.aClass711_Sub7_10636 = new Class711_Sub7(this.aClass711_Sub7_10637.method9899((byte)127), this);
      }

      if(var1 || this.aClass711_Sub4_10650 == null) {
         this.aClass711_Sub4_10650 = new Class711_Sub4(this);
      }

      if(var1 || this.aClass711_Sub37_10638 == null) {
         this.aClass711_Sub37_10638 = new Class711_Sub37(this);
      }

      if(var1 || this.aClass711_Sub2_10639 == null) {
         this.aClass711_Sub2_10639 = new Class711_Sub2(this);
      }

      if(var1 || this.aClass711_Sub14_10640 == null) {
         this.aClass711_Sub14_10640 = new Class711_Sub14(this);
      }

      if(var1 || null == this.aClass711_Sub34_10641) {
         this.aClass711_Sub34_10641 = new Class711_Sub34(this);
      }

      if(var1 || this.aClass711_Sub38_10642 == null) {
         this.aClass711_Sub38_10642 = new Class711_Sub38(this);
      }

      if(var1 || null == this.aClass711_Sub35_10643) {
         this.aClass711_Sub35_10643 = new Class711_Sub35(this);
      }

      if(var1 || null == this.aClass711_Sub6_10646) {
         this.aClass711_Sub6_10646 = new Class711_Sub6(this);
      }

      if(var1 || this.aClass711_Sub30_10621 == null) {
         this.aClass711_Sub30_10621 = new Class711_Sub30(this);
      }

      if(var1 || this.aClass711_Sub27_10648 == null) {
         this.aClass711_Sub27_10648 = new Class711_Sub27(this);
      }

      if(var1 || null == this.aClass711_Sub28_10656) {
         this.aClass711_Sub28_10656 = new Class711_Sub28(this);
      }

      if(var1 || null == this.aClass711_Sub23_10630) {
         this.aClass711_Sub23_10630 = new Class711_Sub23(this);
      }

      if(var1 || null == this.aClass711_Sub40_10649) {
         this.aClass711_Sub40_10649 = new Class711_Sub40(this);
      }

      if(var1 || this.aClass711_Sub25_10626 == null) {
         this.aClass711_Sub25_10626 = new Class711_Sub25(this);
      }

      if(var1 || null == this.aClass711_Sub32_10651) {
         this.aClass711_Sub32_10651 = new Class711_Sub32(this);
      }

      if(var1 || this.aClass711_Sub41_10614 == null) {
         this.aClass711_Sub41_10614 = new Class711_Sub41(this);
      }

      if(var1 || var2 || this.aClass711_Sub29_10605 == null) {
         this.aClass711_Sub29_10605 = new Class711_Sub29(this);
      }

      if(var1 || var2 || null == this.aClass711_Sub29_10653) {
         this.aClass711_Sub29_10653 = new Class711_Sub29(this);
      }

      if(var1 || var2 || null == this.aClass711_Sub29_10654) {
         this.aClass711_Sub29_10654 = new Class711_Sub29(this);
      }

      if(var1 || var2 || this.aClass711_Sub29_10655 == null) {
         this.aClass711_Sub29_10655 = new Class711_Sub29(this);
      }

      if(var1 || var2 || null == this.aClass711_Sub29_10631) {
         this.aClass711_Sub29_10631 = new Class711_Sub29(this);
      }

      if(var1 || var2 || this.aClass711_Sub24_10657 == null) {
         this.aClass711_Sub24_10657 = new Class711_Sub24(this);
      }

   }

   public void method9602(Class711 var1, int var2, short var3) {
      var1.method8314(var2, (byte)9);
      this.method9597(1321580367);
   }

   void method9603() {
      this.aClass711_Sub42_10607.method10193(894418742);
      this.aClass711_Sub33_10608.method10132(-853225002);
      this.aClass711_Sub36_10652.method10156(-1869090788);
      this.aClass711_Sub33_10645.method10132(-957227044);
      this.aClass711_Sub26_10611.method10078(1433573352);
      this.aClass711_Sub5_10612.method9886(-487864313);
      this.aClass711_Sub12_10613.method9956(1535986735);
      this.aClass711_Sub22_10615.method10055(-2055901626);
      this.aClass711_Sub20_10616.method10036(-943330766);
      this.aClass711_Sub15_10610.method9984((byte)50);
      this.aClass711_Sub31_10635.method10117(-1413404306);
      this.aClass711_Sub11_10609.method9944((byte)-43);
      this.aClass711_Sub39_10617.method10174(-898898352);
      this.aClass711_Sub9_10618.method9923(319860039);
      this.aClass711_Sub1_10622.method9803(55913588);
      this.aClass711_Sub10_10623.method9932(-1105528305);
      this.aClass711_Sub13_10647.method9970((byte)18);
      this.aClass711_Sub8_10625.method9904(-1695367749);
      this.aClass711_Sub18_10619.method10014((byte)111);
      this.aClass711_Sub18_10627.method10014((byte)100);
      this.aClass711_Sub43_10628.method10224(-2002490937);
      this.aClass711_Sub21_10629.method10043(-2088729297);
      this.aClass711_Sub3_10644.method9872(-1705077401);
      this.aClass711_Sub17_10601.method10003(-1526870960);
      this.aClass711_Sub19_10632.method10020(-1788964314);
      this.aClass711_Sub19_10633.method10020(-1718114369);
      this.aClass711_Sub16_10634.method9989(944147329);
      this.aClass711_Sub7_10637.method9898((byte)-77);
      this.aClass711_Sub7_10636.method9898((byte)-83);
      this.aClass711_Sub4_10650.method9879(1821651191);
      this.aClass711_Sub37_10638.method10163((byte)1);
      this.aClass711_Sub2_10639.method9816(-1962658757);
      this.aClass711_Sub14_10640.method9976(-267176449);
      this.aClass711_Sub34_10641.method10142((byte)122);
      this.aClass711_Sub38_10642.method10171(790087154);
      this.aClass711_Sub35_10643.method10150(-1637004197);
      this.aClass711_Sub6_10646.method9896(356173573);
      this.aClass711_Sub30_10621.method10112(-899864860);
      this.aClass711_Sub27_10648.method10088((byte)10);
      this.aClass711_Sub28_10656.method10097(-750421370);
      this.aClass711_Sub23_10630.method10060((short)256);
      this.aClass711_Sub40_10649.method10179(-1493149588);
      this.aClass711_Sub25_10626.method10071((byte)2);
      this.aClass711_Sub32_10651.method10124(-1618710654);
      this.aClass711_Sub41_10614.method10185(-1853503856);
      this.aClass711_Sub29_10605.method10103(-1493917537);
      this.aClass711_Sub29_10653.method10103(-2124881820);
      this.aClass711_Sub29_10654.method10103(-1623085271);
      this.aClass711_Sub29_10655.method10103(-1851396043);
      this.aClass711_Sub29_10631.method10103(-1450686654);
      this.aClass711_Sub24_10657.method10069(-2118943929);
   }

   void method9604() {
      this.aClass711_Sub42_10607.method10193(279075001);
      this.aClass711_Sub33_10608.method10132(-76803230);
      this.aClass711_Sub36_10652.method10156(945871731);
      this.aClass711_Sub33_10645.method10132(-426253279);
      this.aClass711_Sub26_10611.method10078(1527088638);
      this.aClass711_Sub5_10612.method9886(1375700297);
      this.aClass711_Sub12_10613.method9956(808286653);
      this.aClass711_Sub22_10615.method10055(-96346651);
      this.aClass711_Sub20_10616.method10036(-469260835);
      this.aClass711_Sub15_10610.method9984((byte)38);
      this.aClass711_Sub31_10635.method10117(-1413404306);
      this.aClass711_Sub11_10609.method9944((byte)-7);
      this.aClass711_Sub39_10617.method10174(-898898352);
      this.aClass711_Sub9_10618.method9923(1392102684);
      this.aClass711_Sub1_10622.method9803(630650086);
      this.aClass711_Sub10_10623.method9932(-1069516161);
      this.aClass711_Sub13_10647.method9970((byte)-28);
      this.aClass711_Sub8_10625.method9904(-1695367749);
      this.aClass711_Sub18_10619.method10014((byte)62);
      this.aClass711_Sub18_10627.method10014((byte)40);
      this.aClass711_Sub43_10628.method10224(-1975116720);
      this.aClass711_Sub21_10629.method10043(-2088729297);
      this.aClass711_Sub3_10644.method9872(-914891015);
      this.aClass711_Sub17_10601.method10003(-1512705777);
      this.aClass711_Sub19_10632.method10020(-2080614545);
      this.aClass711_Sub19_10633.method10020(-1672336926);
      this.aClass711_Sub16_10634.method9989(944147329);
      this.aClass711_Sub7_10637.method9898((byte)-26);
      this.aClass711_Sub7_10636.method9898((byte)-26);
      this.aClass711_Sub4_10650.method9879(1845335104);
      this.aClass711_Sub37_10638.method10163((byte)1);
      this.aClass711_Sub2_10639.method9816(-1962658757);
      this.aClass711_Sub14_10640.method9976(-267176449);
      this.aClass711_Sub34_10641.method10142((byte)47);
      this.aClass711_Sub38_10642.method10171(790087154);
      this.aClass711_Sub35_10643.method10150(-375752693);
      this.aClass711_Sub6_10646.method9896(-1080944305);
      this.aClass711_Sub30_10621.method10112(-1882111164);
      this.aClass711_Sub27_10648.method10088((byte)48);
      this.aClass711_Sub28_10656.method10097(1795798353);
      this.aClass711_Sub23_10630.method10060((short)256);
      this.aClass711_Sub40_10649.method10179(-1493149588);
      this.aClass711_Sub25_10626.method10071((byte)2);
      this.aClass711_Sub32_10651.method10124(-1618710654);
      this.aClass711_Sub41_10614.method10185(-1942952978);
      this.aClass711_Sub29_10605.method10103(-2139245195);
      this.aClass711_Sub29_10653.method10103(-1567795024);
      this.aClass711_Sub29_10654.method10103(-2007302885);
      this.aClass711_Sub29_10655.method10103(-1852922737);
      this.aClass711_Sub29_10631.method10103(-1966223437);
      this.aClass711_Sub24_10657.method10069(-1556116307);
   }

   void method9605() {
      this.aClass711_Sub42_10607.method10193(1566097530);
      this.aClass711_Sub33_10608.method10132(-2025207135);
      this.aClass711_Sub36_10652.method10156(-1673981215);
      this.aClass711_Sub33_10645.method10132(-2039941140);
      this.aClass711_Sub26_10611.method10078(1352551533);
      this.aClass711_Sub5_10612.method9886(-2021257780);
      this.aClass711_Sub12_10613.method9956(1651070877);
      this.aClass711_Sub22_10615.method10055(-970580497);
      this.aClass711_Sub20_10616.method10036(393551962);
      this.aClass711_Sub15_10610.method9984((byte)116);
      this.aClass711_Sub31_10635.method10117(-1413404306);
      this.aClass711_Sub11_10609.method9944((byte)-22);
      this.aClass711_Sub39_10617.method10174(-898898352);
      this.aClass711_Sub9_10618.method9923(518251806);
      this.aClass711_Sub1_10622.method9803(-940197368);
      this.aClass711_Sub10_10623.method9932(330950733);
      this.aClass711_Sub13_10647.method9970((byte)87);
      this.aClass711_Sub8_10625.method9904(-1695367749);
      this.aClass711_Sub18_10619.method10014((byte)119);
      this.aClass711_Sub18_10627.method10014((byte)26);
      this.aClass711_Sub43_10628.method10224(86574910);
      this.aClass711_Sub21_10629.method10043(-2088729297);
      this.aClass711_Sub3_10644.method9872(-1005408776);
      this.aClass711_Sub17_10601.method10003(-1355637636);
      this.aClass711_Sub19_10632.method10020(-1763094256);
      this.aClass711_Sub19_10633.method10020(-1955700157);
      this.aClass711_Sub16_10634.method9989(944147329);
      this.aClass711_Sub7_10637.method9898((byte)-29);
      this.aClass711_Sub7_10636.method9898((byte)-13);
      this.aClass711_Sub4_10650.method9879(1715052280);
      this.aClass711_Sub37_10638.method10163((byte)1);
      this.aClass711_Sub2_10639.method9816(-1962658757);
      this.aClass711_Sub14_10640.method9976(-267176449);
      this.aClass711_Sub34_10641.method10142((byte)97);
      this.aClass711_Sub38_10642.method10171(790087154);
      this.aClass711_Sub35_10643.method10150(-1597613970);
      this.aClass711_Sub6_10646.method9896(-811276743);
      this.aClass711_Sub30_10621.method10112(-1337895368);
      this.aClass711_Sub27_10648.method10088((byte)89);
      this.aClass711_Sub28_10656.method10097(2104948424);
      this.aClass711_Sub23_10630.method10060((short)256);
      this.aClass711_Sub40_10649.method10179(-1493149588);
      this.aClass711_Sub25_10626.method10071((byte)2);
      this.aClass711_Sub32_10651.method10124(-1618710654);
      this.aClass711_Sub41_10614.method10185(-2133171001);
      this.aClass711_Sub29_10605.method10103(-1425570067);
      this.aClass711_Sub29_10653.method10103(-1418655327);
      this.aClass711_Sub29_10654.method10103(-1484970699);
      this.aClass711_Sub29_10655.method10103(-1530194560);
      this.aClass711_Sub29_10631.method10103(-1935352638);
      this.aClass711_Sub24_10657.method10069(-1006387927);
   }

   public RSByteBuffer method9606(byte var1) {
      RSByteBuffer var2 = new RSByteBuffer(52);
      var2.writeByte(36, 858903934);
      var2.writeByte(this.aClass711_Sub42_10607.method10199((byte)1), 297055197);
      var2.writeByte(this.aClass711_Sub33_10608.method10135((byte)91), -2113732778);
      var2.writeByte(this.aClass711_Sub36_10652.method10157(-1108584408), -1197543615);
      var2.writeByte(this.aClass711_Sub26_10611.method10079(-1962007408), 2042599155);
      var2.writeByte(this.aClass711_Sub5_10612.method9888(1427294417), -573580367);
      var2.writeByte(this.aClass711_Sub12_10613.method9960(1644184444), -1479723453);
      var2.writeByte(this.aClass711_Sub22_10615.method10054((byte)39), -1780171722);
      var2.writeByte(this.aClass711_Sub20_10616.method10037((byte)-44), 937990651);
      var2.writeByte(this.aClass711_Sub15_10610.method9986((short)255), 2138315755);
      var2.writeByte(this.aClass711_Sub31_10635.method10119(266430267), 1975378286);
      var2.writeByte(this.aClass711_Sub11_10609.method9948((byte)44), 184425038);
      var2.writeByte(this.aClass711_Sub39_10617.method10173(1880564455), -1888289954);
      var2.writeByte(this.aClass711_Sub9_10618.method9924(1244403282), -1141691241);
      var2.writeByte(this.aClass711_Sub1_10622.method9805(-751289147), 1123684297);
      var2.writeByte(this.aClass711_Sub10_10623.method9931(1541793700), 1705223167);
      var2.writeByte(0, -712067399);
      var2.writeByte(this.aClass711_Sub13_10647.method9968(204061164), 1606371605);
      var2.writeByte(this.aClass711_Sub8_10625.method9907(-1935347231), 371051542);
      var2.writeByte(this.aClass711_Sub18_10619.method10015(-1981095213), 1060199438);
      var2.writeByte(this.aClass711_Sub43_10628.method10226(768393344), 629452916);
      var2.writeByte(this.aClass711_Sub21_10629.method10045(-873776852), -23442923);
      var2.writeByte(this.aClass711_Sub3_10644.method9873(509926916), 261211879);
      var2.writeByte(this.aClass711_Sub17_10601.method10004(29768870), 846030740);
      var2.writeByte(this.aClass711_Sub19_10632.method10022((byte)-118), 1920794572);
      var2.writeByte(0, -1127350382);
      var2.writeByte(this.aClass711_Sub16_10634.method9997((byte)3), -450084705);
      var2.writeByte(this.aClass711_Sub7_10637.method9899((byte)96), -1716779017);
      var2.writeByte(this.aClass711_Sub37_10638.method10167(-1013354062), -1408993078);
      var2.writeByte(this.aClass711_Sub2_10639.method9815(664190511), 1096141534);
      var2.writeByte(this.aClass711_Sub14_10640.method9981(-1549926995), -1790626958);
      var2.writeByte(this.aClass711_Sub4_10650.method9882(-1712292149), -1950821140);
      var2.writeByte(this.aClass711_Sub34_10641.method10144(-1754235805), 1442412106);
      var2.writeByte(this.aClass711_Sub38_10642.method10170(-1755878562), 98662549);
      var2.writeByte(this.aClass711_Sub35_10643.method10151(1018982416), 342211937);
      var2.writeByte(this.aClass711_Sub6_10646.method9894(756748128), -1293076870);
      var2.writeByte(this.aClass711_Sub30_10621.method10111(-1903165144), 1636295669);
      var2.writeByte(this.aClass711_Sub27_10648.method10090(-1857342072), -291939672);
      var2.writeByte(this.aClass711_Sub28_10656.method10096((byte)24), -172307906);
      var2.writeByte(this.aClass711_Sub23_10630.method10062(1403459727), -1629741320);
      var2.writeByte(this.aClass711_Sub40_10649.method10182((byte)-88), 568100933);
      var2.writeByte(this.aClass711_Sub25_10626.method10074((byte)-124), 1753981524);
      var2.writeByte(this.aClass711_Sub32_10651.method10125(-2009111721), -344785491);
      var2.writeByte(this.aClass711_Sub41_10614.method10186(-329238195), -704969460);
      var2.writeByte(this.aClass711_Sub29_10605.method10105((byte)71), -466121081);
      var2.writeByte(this.aClass711_Sub29_10653.method10105((byte)117), 1118501414);
      var2.writeByte(this.aClass711_Sub29_10654.method10105((byte)85), 2033179935);
      var2.writeByte(this.aClass711_Sub29_10655.method10105((byte)67), 833625517);
      var2.writeByte(this.aClass711_Sub29_10631.method10105((byte)119), 413907);
      var2.writeByte(this.aClass711_Sub24_10657.method10068(-849756449), 172384256);
      return var2;
   }
}
