package com.jagex;

import com.jagex.InterfaceDef;
import com.jagex.Class526_Sub24;
import com.jagex.client;

public class Class526 {
   public long aLong7156;
   public static String aString7159;
   public Class526 aClass526_7157;
   public Class526 aClass526_7158;

   public boolean method6330(byte var1) {
      return null != this.aClass526_7158;
   }

   public boolean method6331() {
      return null != this.aClass526_7158;
   }

   public void method6332(int var1) {
      if(this.aClass526_7158 != null) {
         this.aClass526_7158.aClass526_7157 = this.aClass526_7157;
         this.aClass526_7157.aClass526_7158 = this.aClass526_7158;
         this.aClass526_7157 = null;
         this.aClass526_7158 = null;
      }
   }

   public void method6333() {
      if(this.aClass526_7158 != null) {
         this.aClass526_7158.aClass526_7157 = this.aClass526_7157;
         this.aClass526_7157.aClass526_7158 = this.aClass526_7158;
         this.aClass526_7157 = null;
         this.aClass526_7158 = null;
      }
   }

   public boolean method6334() {
      return null != this.aClass526_7158;
   }

   public boolean method6335() {
      return null != this.aClass526_7158;
   }

   public boolean method6336() {
      return null != this.aClass526_7158;
   }

   static boolean method6337(InterfaceDef var0, byte var1) {
      Class526_Sub24 var2 = client.method10311(var0);
      return var2.method9462(832703193) > 0?true:(var2.method9458(579546720)?true:null != var0.aClass245_2598);
   }
}
