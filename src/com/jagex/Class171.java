package com.jagex;

import com.jagex.Class218;
import com.jagex.Class316;
import com.jagex.Class521;
import com.jagex.RSByteBuffer;
import com.jagex.Class553;
import com.jagex.Class561;
import com.jagex.Class583;
import com.jagex.Class593;
import com.jagex.Class700;
import java.lang.management.GarbageCollectorMXBean;

public class Class171 {
   static final int anInt1964 = 1;
   static final int anInt1965 = 2;
   static final int anInt1967 = 4;
   public static final int anInt1968 = 6;
   static final int anInt1971 = 16;
   static final int anInt1972 = 32;
   static final int anInt1973 = 64;
   static final int anInt1974 = 128;
   static final int anInt1975 = 256;
   static final int anInt1976 = 512;
   public static final byte aByte1977 = 0;
   public static final byte aByte1978 = 1;
   static final int anInt1979 = 1;
   public static final int anInt1980 = 16;
   public static final int anInt1989 = 9;
   static final int anInt1993 = 2;
   public static final int anInt1994 = 1;
   public static final int anInt1995 = 2;
   public static final int anInt1996 = 3;
   public static final int anInt1997 = 4;
   public static final int anInt1998 = 5;
   static final int anInt1999 = 0;
   public static final int anInt2000 = 7;
   public static final int anInt2001 = 8;
   public static final int anInt2003 = 11;
   public static final int anInt2004 = 13;
   public static final int anInt2005 = 0;
   static final int anInt2006 = 2;
   static final int anInt2007 = 1;
   static final int anInt2011 = 16;
   static final int anInt2014 = 3;
   public static Class553 aClass553_2016;
   static GarbageCollectorMXBean aGarbageCollectorMXBean2017;
   public boolean aBool1987 = false;
   boolean aBool1983 = false;
   public boolean aBool1984 = false;
   public byte aByte1986 = 0;
   public byte aByte1963 = 0;
   public boolean aBool2013 = false;
   public Class593 aClass593_1982;
   public byte aByte1990;
   public byte aByte1991;
   public byte aByte1992;
   public byte aByte1966;
   public byte aByte1970;
   public int anInt1988;
   public byte aByte2009;
   public boolean aBool2010;
   public boolean aBool1981;
   public byte aByte2012;
   public byte aByte1969;
   public byte aByte2002;
   public short aShort2015;
   public int anInt2008;
   public int anInt1985;

   Class171() {
      this.aClass593_1982 = Class593.aClass593_7817;
      this.aByte1990 = -1;
      this.aByte1991 = 0;
      this.aByte1992 = 0;
      this.aByte1966 = 0;
      this.aByte1970 = 0;
      this.anInt1988 = 0;
      this.aByte2009 = 0;
      this.aBool2010 = false;
      this.aBool1981 = false;
      this.aByte2012 = 0;
      this.aByte1969 = -1;
      this.aByte2002 = 0;
      this.aShort2015 = 0;
   }

   public static boolean method2151(int var0) {
      return 1 != var0 && 7 != var0;
   }

   public static boolean method2152(int var0) {
      return 1 != var0 && 7 != var0;
   }

   public static boolean method2153(int var0) {
      return 1 != var0 && 7 != var0;
   }

   void method2154(int var1, RSByteBuffer var2, int var3) {
      this.anInt2008 = var1 * -290374391;
      var2.readUnsignedByte(1735742890);
      int var4 = var2.readUnsignedByte(-980035417);
      if(0 == var4) {
         this.anInt1985 = -1703648960;
      } else if(var4 == 1) {
         this.anInt1985 = 887669376;
      } else if(var4 == 2) {
         this.anInt1985 = 1775338752;
      } else if(var4 == 3) {
         this.anInt1985 = -744289792;
      } else if(var4 == 4) {
         this.anInt1985 = -1488579584;
      }

      int var5 = var2.readInt((byte)5);
      this.aBool1987 = (var5 & 1) != 0;
      this.aBool1983 = 0 != (var5 & 2);
      this.aBool1984 = (var5 & 16) != 0;
      byte var6 = (byte)var2.readUnsignedByte(538169150);
      this.aByte1991 = (byte)(var6 & 7);
      this.aByte1992 = (byte)(var6 >> 3 & 7);
      int var7 = var2.readInt((byte)5);
      if((var7 & 16) != 0) {
         var2.method9634((byte)1);
         var2.method9634((byte)1);
      }

      if(this.aBool1983) {
         var2.method9634((byte)1);
      }

      if(0 != (var7 & 32)) {
         var2.readInt((byte)5);
      }

      if(0 != (var7 & 64)) {
         var2.readInt((byte)5);
      }

      if(0 != (var7 & 128)) {
         var2.readInt((byte)5);
      }

      if((var7 & 256) != 0) {
         var2.readInt((byte)5);
      }

      if(0 != (var7 & 512)) {
         var2.readInt((byte)5);
      }

      this.aBool2013 = var2.readUnsignedByte(1057194955) == 1;
      Class561.findIdentifiable(Class521.method6250(454516591), var2.readUnsignedByte(828036005), (byte)3);
      Class561.findIdentifiable(Class218.method3030(884055369), var2.readUnsignedByte(1108917801), (byte)-77);
      this.aClass593_1982 = (Class593)Class561.findIdentifiable(Class316.method4091(-1670914609), var2.readUnsignedByte(1166364511), (byte)-49);
      if(Class593.aClass593_7816 == this.aClass593_1982) {
         this.aByte1990 = (byte)var2.readUnsignedByte(-1450997525);
      }

      int var8 = var2.readUnsignedByte(1706245341);
      if(0 != (var8 & 1)) {
         this.aByte1986 = (byte)var2.readUnsignedByte(-590346482);
      }

      if((var8 & 2) != 0) {
         this.aByte1963 = (byte)var2.readUnsignedByte(1423110803);
      }

      if(var2.readUnsignedByte(-1121574403) == 1) {
         this.aByte1966 = (byte)var2.readUnsignedByte(131547648);
         this.aByte1970 = (byte)var2.readUnsignedByte(-156047593);
         this.anInt1988 = var2.readInt((byte)5) * 955464767;
         this.aByte2002 = (byte)var2.readUnsignedByte(2107013067);
         var2.readUnsignedByte(-2027934136);
         this.aByte2009 = (byte)var2.readUnsignedByte(1214205130);
         this.aBool2010 = var2.readUnsignedByte(-1558832748) == 1;
         this.aBool1981 = var2.readUnsignedByte(-720250864) == 1;
         this.aByte2012 = (byte)var2.readUnsignedByte(-555024986);
         this.aByte1969 = (byte)var2.readUnsignedByte(1885049349);
         this.aShort2015 = (short)var2.readUnsignedShort(453349351);
      }

   }

   public static boolean method2155(int var0) {
      return 1 != var0 && 7 != var0;
   }

   static Class583[] method2156(byte var0) {
      return new Class583[]{Class583.aClass583_7780, Class583.aClass583_7779};
   }

   public static Class700[] method2157(int var0) {
      return new Class700[]{Class700.aClass700_8778, Class700.aClass700_8777, Class700.aClass700_8774, Class700.aClass700_8775, Class700.aClass700_8776};
   }
}
