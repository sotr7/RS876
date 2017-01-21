package com.jagex;

import com.jagex.Class424;
import com.jagex.Interface4;
import com.jagex.Interface53;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class2 implements Interface4 {
   static short aShort18;
   Map aMap17;
   Interface53 anInterface53_16;

   public void method35(int var1, int var2) {
      if(this.aMap17 == null) {
         this.aMap17 = new HashMap();
         this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Integer.valueOf(var2)));
      } else {
         Class424 var3 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null == var3) {
            this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Integer.valueOf(var2)));
         } else {
            var3.anObject4794 = Integer.valueOf(var2);
         }
      }

   }

   public int method33(int var1, byte var2) {
      if(null != this.aMap17) {
         Class424 var3 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null != var3) {
            return ((Integer)var3.anObject4794).intValue();
         }
      }

      return ((Integer)this.anInterface53_16.method368(var1, -1856181089)).intValue();
   }

   public void method23(int var1, int var2, int var3) {
      if(this.aMap17 == null) {
         this.aMap17 = new HashMap();
         this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Integer.valueOf(var2)));
      } else {
         Class424 var4 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null == var4) {
            this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Integer.valueOf(var2)));
         } else {
            var4.anObject4794 = Integer.valueOf(var2);
         }
      }

   }

   public long method24(int var1, int var2) {
      if(null != this.aMap17) {
         Class424 var3 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null != var3) {
            return ((Long)var3.anObject4794).longValue();
         }
      }

      return ((Long)this.anInterface53_16.method368(var1, -2112127194)).longValue();
   }

   public long method36(int var1) {
      if(null != this.aMap17) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null != var2) {
            return ((Long)var2.anObject4794).longValue();
         }
      }

      return ((Long)this.anInterface53_16.method368(var1, -1735523797)).longValue();
   }

   public Object method22(int var1, int var2) {
      if(this.aMap17 != null) {
         Class424 var3 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var3 != null) {
            return var3.anObject4794;
         }
      }

      return this.anInterface53_16.method368(var1, -1865461589);
   }

   public void method27(int var1, Object var2, int var3) {
      if(null == this.aMap17) {
         this.aMap17 = new HashMap();
         this.aMap17.put(Integer.valueOf(var1), new Class424(var1, var2));
      } else {
         Class424 var4 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var4 == null) {
            this.aMap17.put(Integer.valueOf(var1), new Class424(var1, var2));
         } else {
            var4.anObject4794 = var2;
         }
      }

   }

   public void method30(int var1) {
      if(null != this.aMap17) {
         this.aMap17.remove(Integer.valueOf(var1));
      }

   }

   public void method29(int var1, int var2) {
      if(null != this.aMap17) {
         this.aMap17.remove(Integer.valueOf(var1));
      }

   }

   public Iterator iterator() {
      return null == this.aMap17?Collections.emptyList().iterator():this.aMap17.values().iterator();
   }

   public Iterator method520() {
      return null == this.aMap17?Collections.emptyList().iterator():this.aMap17.values().iterator();
   }

   public Class2(Interface53 var1) {
      this.anInterface53_16 = var1;
   }

   public int method39(int var1) {
      if(null != this.aMap17) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null != var2) {
            return ((Integer)var2.anObject4794).intValue();
         }
      }

      return ((Integer)this.anInterface53_16.method368(var1, -1870472837)).intValue();
   }

   public int method31(int var1) {
      if(null != this.aMap17) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null != var2) {
            return ((Integer)var2.anObject4794).intValue();
         }
      }

      return ((Integer)this.anInterface53_16.method368(var1, -1768151263)).intValue();
   }

   public int method32(int var1) {
      if(null != this.aMap17) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null != var2) {
            return ((Integer)var2.anObject4794).intValue();
         }
      }

      return ((Integer)this.anInterface53_16.method368(var1, -1688478947)).intValue();
   }

   public int method26(int var1) {
      if(null != this.aMap17) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null != var2) {
            return ((Integer)var2.anObject4794).intValue();
         }
      }

      return ((Integer)this.anInterface53_16.method368(var1, -2042036374)).intValue();
   }

   public int method34(int var1) {
      if(null != this.aMap17) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(null != var2) {
            return ((Integer)var2.anObject4794).intValue();
         }
      }

      return ((Integer)this.anInterface53_16.method368(var1, -2106542010)).intValue();
   }

   public Object method43(int var1) {
      if(this.aMap17 != null) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var2 != null) {
            return var2.anObject4794;
         }
      }

      return this.anInterface53_16.method368(var1, -1917278484);
   }

   public void method28(int var1) {
      if(null != this.aMap17) {
         this.aMap17.clear();
      }

   }

   public void method37(int var1, long var2) {
      if(null == this.aMap17) {
         this.aMap17 = new HashMap();
         this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Long.valueOf(var2)));
      } else {
         Class424 var4 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var4 == null) {
            this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Long.valueOf(var2)));
         } else {
            var4.anObject4794 = Long.valueOf(var2);
         }
      }

   }

   public void method45(int var1, long var2) {
      if(null == this.aMap17) {
         this.aMap17 = new HashMap();
         this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Long.valueOf(var2)));
      } else {
         Class424 var4 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var4 == null) {
            this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Long.valueOf(var2)));
         } else {
            var4.anObject4794 = Long.valueOf(var2);
         }
      }

   }

   public Object method48(int var1) {
      if(this.aMap17 != null) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var2 != null) {
            return var2.anObject4794;
         }
      }

      return this.anInterface53_16.method368(var1, -1925016976);
   }

   public void method40() {
      if(null != this.aMap17) {
         this.aMap17.clear();
      }

   }

   public Object method41(int var1) {
      if(this.aMap17 != null) {
         Class424 var2 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var2 != null) {
            return var2.anObject4794;
         }
      }

      return this.anInterface53_16.method368(var1, -1732667943);
   }

   public void method42(int var1, Object var2) {
      if(null == this.aMap17) {
         this.aMap17 = new HashMap();
         this.aMap17.put(Integer.valueOf(var1), new Class424(var1, var2));
      } else {
         Class424 var3 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var3 == null) {
            this.aMap17.put(Integer.valueOf(var1), new Class424(var1, var2));
         } else {
            var3.anObject4794 = var2;
         }
      }

   }

   public void method46(int var1, Object var2) {
      if(null == this.aMap17) {
         this.aMap17 = new HashMap();
         this.aMap17.put(Integer.valueOf(var1), new Class424(var1, var2));
      } else {
         Class424 var3 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var3 == null) {
            this.aMap17.put(Integer.valueOf(var1), new Class424(var1, var2));
         } else {
            var3.anObject4794 = var2;
         }
      }

   }

   public Iterator method521() {
      return null == this.aMap17?Collections.emptyList().iterator():this.aMap17.values().iterator();
   }

   public void method44() {
      if(null != this.aMap17) {
         this.aMap17.clear();
      }

   }

   public void method38() {
      if(null != this.aMap17) {
         this.aMap17.clear();
      }

   }

   public void method47(int var1) {
      if(null != this.aMap17) {
         this.aMap17.remove(Integer.valueOf(var1));
      }

   }

   public void method25(int var1, long var2) {
      if(null == this.aMap17) {
         this.aMap17 = new HashMap();
         this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Long.valueOf(var2)));
      } else {
         Class424 var4 = (Class424)this.aMap17.get(Integer.valueOf(var1));
         if(var4 == null) {
            this.aMap17.put(Integer.valueOf(var1), new Class424(var1, Long.valueOf(var2)));
         } else {
            var4.anObject4794 = Long.valueOf(var2);
         }
      }

   }
}
