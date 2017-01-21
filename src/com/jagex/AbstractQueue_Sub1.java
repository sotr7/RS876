package com.jagex;

import com.jagex.Class393;
import com.jagex.Class398;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {
   int anInt11882;
   Class398[] aClass398Array11880;
   Map aMap11883;
   Comparator aComparator11879;
   int anInt11881;

   public Object peek() {
      return 0 == this.anInt11881 * 841670101?null:this.aClass398Array11880[0].anObject4128;
   }

   public AbstractQueue_Sub1(int var1, Comparator var2) {
      this.anInt11882 = 0;
      this.aClass398Array11880 = new Class398[var1];
      this.aMap11883 = new HashMap();
      this.aComparator11879 = var2;
   }

   public Object method10747() {
      return 0 == this.anInt11881 * 841670101?null:this.aClass398Array11880[0].anObject4128;
   }

   public boolean offer(Object var1) {
      if(this.aMap11883.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.anInt11882 += -292161879;
         int var2 = this.anInt11881 * 841670101;
         if(var2 >= this.aClass398Array11880.length) {
            this.method10761((byte)68);
         }

         this.anInt11881 += 138376061;
         if(0 == var2) {
            this.aClass398Array11880[0] = new Class398(var1, 0);
            this.aMap11883.put(var1, this.aClass398Array11880[0]);
         } else {
            this.aClass398Array11880[var2] = new Class398(var1, var2);
            this.aMap11883.put(var1, this.aClass398Array11880[var2]);
            this.method10749(var2, (byte)43);
         }

         return true;
      }
   }

   public AbstractQueue_Sub1(int var1) {
      this(var1, (Comparator)null);
   }

   public Object[] method10748() {
      Object[] var1 = super.toArray();
      if(this.aComparator11879 != null) {
         Arrays.sort(var1, this.aComparator11879);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public boolean remove(Object var1) {
      Class398 var2 = (Class398)this.aMap11883.remove(var1);
      if(var2 == null) {
         return false;
      } else {
         this.anInt11882 += -292161879;
         this.anInt11881 -= 138376061;
         if(var2.anInt4129 * -1594846079 == this.anInt11881 * 841670101) {
            this.aClass398Array11880[841670101 * this.anInt11881] = null;
            return true;
         } else {
            Class398 var3 = this.aClass398Array11880[this.anInt11881 * 841670101];
            this.aClass398Array11880[841670101 * this.anInt11881] = null;
            this.aClass398Array11880[-1594846079 * var2.anInt4129] = var3;
            this.aClass398Array11880[-1594846079 * var2.anInt4129].anInt4129 = 1 * var2.anInt4129;
            this.method10750(-1594846079 * var2.anInt4129, (byte)24);
            if(var3 == this.aClass398Array11880[var2.anInt4129 * -1594846079]) {
               this.method10749(var2.anInt4129 * -1594846079, (byte)-9);
            }

            return true;
         }
      }
   }

   void method10749(int var1, byte var2) {
      Class398 var3;
      int var4;
      for(var3 = this.aClass398Array11880[var1]; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >>> 1;
         Class398 var5 = this.aClass398Array11880[var4];
         if(this.aComparator11879 != null) {
            if(this.aComparator11879.compare(var3.anObject4128, var5.anObject4128) >= 0) {
               break;
            }
         } else if(((Comparable)var3.anObject4128).compareTo(var5.anObject4128) >= 0) {
            break;
         }

         this.aClass398Array11880[var1] = var5;
         this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
      }

      this.aClass398Array11880[var1] = var3;
      this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
   }

   void method10750(int var1, byte var2) {
      Class398 var3 = this.aClass398Array11880[var1];

      int var9;
      for(int var4 = this.anInt11881 * 841670101 >>> 1; var1 < var4; var1 = var9) {
         int var5 = (var1 << 1) + 1;
         Class398 var6 = this.aClass398Array11880[var5];
         int var7 = (var1 << 1) + 2;
         Class398 var8 = this.aClass398Array11880[var7];
         if(this.aComparator11879 != null) {
            if(var7 < 841670101 * this.anInt11881 && this.aComparator11879.compare(var6.anObject4128, var8.anObject4128) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }
         } else if(var7 < 841670101 * this.anInt11881 && ((Comparable)var6.anObject4128).compareTo(var8.anObject4128) > 0) {
            var9 = var7;
         } else {
            var9 = var5;
         }

         if(this.aComparator11879 != null) {
            if(this.aComparator11879.compare(var3.anObject4128, this.aClass398Array11880[var9].anObject4128) <= 0) {
               break;
            }
         } else if(((Comparable)var3.anObject4128).compareTo(this.aClass398Array11880[var9].anObject4128) <= 0) {
            break;
         }

         this.aClass398Array11880[var1] = this.aClass398Array11880[var9];
         this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
      }

      this.aClass398Array11880[var1] = var3;
      this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
   }

   public boolean contains(Object var1) {
      return this.aMap11883.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if(this.aComparator11879 != null) {
         Arrays.sort(var1, this.aComparator11879);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public Iterator iterator() {
      return new Class393(this);
   }

   public Object method10751() {
      if(this.anInt11881 * 841670101 == 0) {
         return null;
      } else {
         this.anInt11882 += -292161879;
         Object var1 = this.aClass398Array11880[0].anObject4128;
         this.aMap11883.remove(var1);
         this.anInt11881 -= 138376061;
         if(0 == 841670101 * this.anInt11881) {
            this.aClass398Array11880[841670101 * this.anInt11881] = null;
         } else {
            this.aClass398Array11880[0] = this.aClass398Array11880[841670101 * this.anInt11881];
            this.aClass398Array11880[0].anInt4129 = 0;
            this.aClass398Array11880[841670101 * this.anInt11881] = null;
            this.method10750(0, (byte)-51);
         }

         return var1;
      }
   }

   public Iterator method10752() {
      return new Class393(this);
   }

   public int method10753() {
      return 841670101 * this.anInt11881;
   }

   void method10754() {
      int var1 = (this.aClass398Array11880.length << 1) + 1;
      this.aClass398Array11880 = (Class398[])((Class398[])Arrays.copyOf(this.aClass398Array11880, var1));
   }

   void method10755() {
      int var1 = (this.aClass398Array11880.length << 1) + 1;
      this.aClass398Array11880 = (Class398[])((Class398[])Arrays.copyOf(this.aClass398Array11880, var1));
   }

   public int size() {
      return 841670101 * this.anInt11881;
   }

   public boolean method10756(Object var1) {
      return this.aMap11883.containsKey(var1);
   }

   public Object poll() {
      if(this.anInt11881 * 841670101 == 0) {
         return null;
      } else {
         this.anInt11882 += -292161879;
         Object var1 = this.aClass398Array11880[0].anObject4128;
         this.aMap11883.remove(var1);
         this.anInt11881 -= 138376061;
         if(0 == 841670101 * this.anInt11881) {
            this.aClass398Array11880[841670101 * this.anInt11881] = null;
         } else {
            this.aClass398Array11880[0] = this.aClass398Array11880[841670101 * this.anInt11881];
            this.aClass398Array11880[0].anInt4129 = 0;
            this.aClass398Array11880[841670101 * this.anInt11881] = null;
            this.method10750(0, (byte)91);
         }

         return var1;
      }
   }

   public Object method10757() {
      if(this.anInt11881 * 841670101 == 0) {
         return null;
      } else {
         this.anInt11882 += -292161879;
         Object var1 = this.aClass398Array11880[0].anObject4128;
         this.aMap11883.remove(var1);
         this.anInt11881 -= 138376061;
         if(0 == 841670101 * this.anInt11881) {
            this.aClass398Array11880[841670101 * this.anInt11881] = null;
         } else {
            this.aClass398Array11880[0] = this.aClass398Array11880[841670101 * this.anInt11881];
            this.aClass398Array11880[0].anInt4129 = 0;
            this.aClass398Array11880[841670101 * this.anInt11881] = null;
            this.method10750(0, (byte)29);
         }

         return var1;
      }
   }

   void method10758() {
      int var1 = (this.aClass398Array11880.length << 1) + 1;
      this.aClass398Array11880 = (Class398[])((Class398[])Arrays.copyOf(this.aClass398Array11880, var1));
   }

   public int method10759() {
      return 841670101 * this.anInt11881;
   }

   void method10760(int var1) {
      Class398 var2;
      int var3;
      for(var2 = this.aClass398Array11880[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         Class398 var4 = this.aClass398Array11880[var3];
         if(this.aComparator11879 != null) {
            if(this.aComparator11879.compare(var2.anObject4128, var4.anObject4128) >= 0) {
               break;
            }
         } else if(((Comparable)var2.anObject4128).compareTo(var4.anObject4128) >= 0) {
            break;
         }

         this.aClass398Array11880[var1] = var4;
         this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
      }

      this.aClass398Array11880[var1] = var2;
      this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
   }

   void method10761(byte var1) {
      int var2 = (this.aClass398Array11880.length << 1) + 1;
      this.aClass398Array11880 = (Class398[])((Class398[])Arrays.copyOf(this.aClass398Array11880, var2));
   }

   void method10762(int var1) {
      Class398 var2;
      int var3;
      for(var2 = this.aClass398Array11880[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         Class398 var4 = this.aClass398Array11880[var3];
         if(this.aComparator11879 != null) {
            if(this.aComparator11879.compare(var2.anObject4128, var4.anObject4128) >= 0) {
               break;
            }
         } else if(((Comparable)var2.anObject4128).compareTo(var4.anObject4128) >= 0) {
            break;
         }

         this.aClass398Array11880[var1] = var4;
         this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
      }

      this.aClass398Array11880[var1] = var2;
      this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
   }

   void method10763(int var1) {
      Class398 var2;
      int var3;
      for(var2 = this.aClass398Array11880[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         Class398 var4 = this.aClass398Array11880[var3];
         if(this.aComparator11879 != null) {
            if(this.aComparator11879.compare(var2.anObject4128, var4.anObject4128) >= 0) {
               break;
            }
         } else if(((Comparable)var2.anObject4128).compareTo(var4.anObject4128) >= 0) {
            break;
         }

         this.aClass398Array11880[var1] = var4;
         this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
      }

      this.aClass398Array11880[var1] = var2;
      this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
   }

   void method10764(int var1) {
      Class398 var2 = this.aClass398Array11880[var1];

      int var8;
      for(int var3 = this.anInt11881 * 841670101 >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         Class398 var5 = this.aClass398Array11880[var4];
         int var6 = (var1 << 1) + 2;
         Class398 var7 = this.aClass398Array11880[var6];
         if(this.aComparator11879 != null) {
            if(var6 < 841670101 * this.anInt11881 && this.aComparator11879.compare(var5.anObject4128, var7.anObject4128) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if(var6 < 841670101 * this.anInt11881 && ((Comparable)var5.anObject4128).compareTo(var7.anObject4128) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if(this.aComparator11879 != null) {
            if(this.aComparator11879.compare(var2.anObject4128, this.aClass398Array11880[var8].anObject4128) <= 0) {
               break;
            }
         } else if(((Comparable)var2.anObject4128).compareTo(this.aClass398Array11880[var8].anObject4128) <= 0) {
            break;
         }

         this.aClass398Array11880[var1] = this.aClass398Array11880[var8];
         this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
      }

      this.aClass398Array11880[var1] = var2;
      this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
   }

   public Object[] method10765() {
      Object[] var1 = super.toArray();
      if(this.aComparator11879 != null) {
         Arrays.sort(var1, this.aComparator11879);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   void method10766(int var1) {
      Class398 var2;
      int var3;
      for(var2 = this.aClass398Array11880[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         Class398 var4 = this.aClass398Array11880[var3];
         if(this.aComparator11879 != null) {
            if(this.aComparator11879.compare(var2.anObject4128, var4.anObject4128) >= 0) {
               break;
            }
         } else if(((Comparable)var2.anObject4128).compareTo(var4.anObject4128) >= 0) {
            break;
         }

         this.aClass398Array11880[var1] = var4;
         this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
      }

      this.aClass398Array11880[var1] = var2;
      this.aClass398Array11880[var1].anInt4129 = var1 * 773041025;
   }

   public boolean method10767(Object var1) {
      return this.aMap11883.containsKey(var1);
   }

   public Iterator method10768() {
      return new Class393(this);
   }
}
