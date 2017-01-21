package com.jagex;

import com.jagex.Class3;
import com.jagex.Class526;
import java.util.Iterator;

public final class Class20 implements Iterable {
   Class526 aClass526_202;
   Class526 aClass526_201;
   int anInt197 = 0;
   int anInt198;
   Class526[] aClass526Array200;
   long aLong199;

   public Iterator method633() {
      return new Class3(this);
   }

   public void method634() {
      for(int var1 = 0; var1 < -2110864949 * this.anInt198; ++var1) {
         Class526 var2 = this.aClass526Array200[var1];

         while(true) {
            Class526 var3 = var2.aClass526_7157;
            if(var3 == var2) {
               break;
            }

            var3.method6332(-1949449864);
         }
      }

      this.aClass526_202 = null;
      this.aClass526_201 = null;
   }

   public Class526 method635(int var1) {
      if(null == this.aClass526_202) {
         return null;
      } else {
         for(Class526 var2 = this.aClass526Array200[(int)(7687895488995481521L * this.aLong199 & (long)(-2110864949 * this.anInt198 - 1))]; var2 != this.aClass526_202; this.aClass526_202 = this.aClass526_202.aClass526_7157) {
            if(7687895488995481521L * this.aLong199 == -6805155999452426801L * this.aClass526_202.aLong7156) {
               Class526 var3 = this.aClass526_202;
               this.aClass526_202 = this.aClass526_202.aClass526_7157;
               return var3;
            }
         }

         this.aClass526_202 = null;
         return null;
      }
   }

   public int method636(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.anInt198 * -2110864949; ++var3) {
         Class526 var4 = this.aClass526Array200[var3];

         for(Class526 var5 = var4.aClass526_7157; var4 != var5; var5 = var5.aClass526_7157) {
            ++var2;
         }
      }

      return var2;
   }

   public void put(Class526 var1, long var2) {
      if(null != var1.aClass526_7158) {
         var1.method6332(-1949449864);
      }

      Class526 var4 = this.aClass526Array200[(int)(var2 & (long)(-2110864949 * this.anInt198 - 1))];
      var1.aClass526_7158 = var4.aClass526_7158;
      var1.aClass526_7157 = var4;
      var1.aClass526_7158.aClass526_7157 = var1;
      var1.aClass526_7157.aClass526_7158 = var1;
      var1.aLong7156 = var2 * -7608595443915499217L;
   }

   public Class20(int var1) {
      this.anInt198 = -1542104093 * var1;
      this.aClass526Array200 = new Class526[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Class526 var3 = this.aClass526Array200[var2] = new Class526();
         var3.aClass526_7157 = var3;
         var3.aClass526_7158 = var3;
      }

   }

   public Class526 method638(int var1) {
      this.anInt197 = 0;
      return this.method639(-1313906343);
   }

   public Class526 method639(int var1) {
      Class526 var2;
      if(1150006515 * this.anInt197 > 0 && this.aClass526_201 != this.aClass526Array200[1150006515 * this.anInt197 - 1]) {
         var2 = this.aClass526_201;
         this.aClass526_201 = var2.aClass526_7157;
         return var2;
      } else {
         do {
            if(this.anInt197 * 1150006515 >= -2110864949 * this.anInt198) {
               return null;
            }

            var2 = this.aClass526Array200[(this.anInt197 += -880769989) * 1150006515 - 1].aClass526_7157;
         } while(this.aClass526Array200[this.anInt197 * 1150006515 - 1] == var2);

         this.aClass526_201 = var2.aClass526_7157;
         return var2;
      }
   }

   public Iterator method640() {
      return new Class3(this);
   }

   public int method641(Class526[] var1, byte var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < -2110864949 * this.anInt198; ++var4) {
         Class526 var5 = this.aClass526Array200[var4];

         for(Class526 var6 = var5.aClass526_7157; var6 != var5; var6 = var6.aClass526_7157) {
            var1[var3++] = var6;
         }
      }

      return var3;
   }

   public Class526 method642() {
      if(null == this.aClass526_202) {
         return null;
      } else {
         for(Class526 var1 = this.aClass526Array200[(int)(7687895488995481521L * this.aLong199 & (long)(-2110864949 * this.anInt198 - 1))]; var1 != this.aClass526_202; this.aClass526_202 = this.aClass526_202.aClass526_7157) {
            if(7687895488995481521L * this.aLong199 == -6805155999452426801L * this.aClass526_202.aLong7156) {
               Class526 var2 = this.aClass526_202;
               this.aClass526_202 = this.aClass526_202.aClass526_7157;
               return var2;
            }
         }

         this.aClass526_202 = null;
         return null;
      }
   }

   public Class526 method643() {
      if(null == this.aClass526_202) {
         return null;
      } else {
         for(Class526 var1 = this.aClass526Array200[(int)(7687895488995481521L * this.aLong199 & (long)(-2110864949 * this.anInt198 - 1))]; var1 != this.aClass526_202; this.aClass526_202 = this.aClass526_202.aClass526_7157) {
            if(7687895488995481521L * this.aLong199 == -6805155999452426801L * this.aClass526_202.aLong7156) {
               Class526 var2 = this.aClass526_202;
               this.aClass526_202 = this.aClass526_202.aClass526_7157;
               return var2;
            }
         }

         this.aClass526_202 = null;
         return null;
      }
   }

   public Class526 method644() {
      if(null == this.aClass526_202) {
         return null;
      } else {
         for(Class526 var1 = this.aClass526Array200[(int)(7687895488995481521L * this.aLong199 & (long)(-2110864949 * this.anInt198 - 1))]; var1 != this.aClass526_202; this.aClass526_202 = this.aClass526_202.aClass526_7157) {
            if(7687895488995481521L * this.aLong199 == -6805155999452426801L * this.aClass526_202.aLong7156) {
               Class526 var2 = this.aClass526_202;
               this.aClass526_202 = this.aClass526_202.aClass526_7157;
               return var2;
            }
         }

         this.aClass526_202 = null;
         return null;
      }
   }

   public int method645() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.anInt198 * -2110864949; ++var2) {
         Class526 var3 = this.aClass526Array200[var2];

         for(Class526 var4 = var3.aClass526_7157; var3 != var4; var4 = var4.aClass526_7157) {
            ++var1;
         }
      }

      return var1;
   }

   public void method646() {
      for(int var1 = 0; var1 < -2110864949 * this.anInt198; ++var1) {
         Class526 var2 = this.aClass526Array200[var1];

         while(true) {
            Class526 var3 = var2.aClass526_7157;
            if(var3 == var2) {
               break;
            }

            var3.method6332(-1949449864);
         }
      }

      this.aClass526_202 = null;
      this.aClass526_201 = null;
   }

   public Iterator iterator() {
      return new Class3(this);
   }

   public void method647(int var1) {
      for(int var2 = 0; var2 < -2110864949 * this.anInt198; ++var2) {
         Class526 var3 = this.aClass526Array200[var2];

         while(true) {
            Class526 var4 = var3.aClass526_7157;
            if(var4 == var3) {
               break;
            }

            var4.method6332(-1949449864);
         }
      }

      this.aClass526_202 = null;
      this.aClass526_201 = null;
   }

   public Class526 get(long var1) {
      this.aLong199 = 8218508369032548689L * var1;
      Class526 var3 = this.aClass526Array200[(int)(var1 & (long)(this.anInt198 * -2110864949 - 1))];

      for(this.aClass526_202 = var3.aClass526_7157; var3 != this.aClass526_202; this.aClass526_202 = this.aClass526_202.aClass526_7157) {
         if(-6805155999452426801L * this.aClass526_202.aLong7156 == var1) {
            Class526 var4 = this.aClass526_202;
            this.aClass526_202 = this.aClass526_202.aClass526_7157;
            return var4;
         }
      }

      this.aClass526_202 = null;
      return null;
   }
}
