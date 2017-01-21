package com.jagex;

import com.jagex.Class526;
import com.jagex.Class695;
import java.util.Collection;
import java.util.Iterator;

public class Class702 implements Iterable, Collection {
   Class526 aClass526_8787;
   public Class526 aClass526_8788 = new Class526();

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(Class526 var3 = this.aClass526_8788.aClass526_7157; var3 != this.aClass526_8788; var3 = var3.aClass526_7157) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public void method8175(Class702 var1, int var2) {
      if(this.aClass526_8788.aClass526_7157 != this.aClass526_8788) {
         this.method8178(var1, this.aClass526_8788.aClass526_7157, 16711935);
      }
   }

   public void method8176(Class526 var1, int var2) {
      if(null != var1.aClass526_7158) {
         var1.method6332(-1949449864);
      }

      var1.aClass526_7158 = this.aClass526_8788.aClass526_7158;
      var1.aClass526_7157 = this.aClass526_8788;
      var1.aClass526_7158.aClass526_7157 = var1;
      var1.aClass526_7157.aClass526_7158 = var1;
   }

   public Class526 method8177(short var1) {
      Class526 var2 = this.aClass526_8788.aClass526_7157;
      if(this.aClass526_8788 == var2) {
         return null;
      } else {
         var2.method6332(-1949449864);
         return var2;
      }
   }

   void method8178(Class702 var1, Class526 var2, int var3) {
      Class526 var4 = this.aClass526_8788.aClass526_7158;
      this.aClass526_8788.aClass526_7158 = var2.aClass526_7158;
      var2.aClass526_7158.aClass526_7157 = this.aClass526_8788;
      if(this.aClass526_8788 != var2) {
         var2.aClass526_7158 = var1.aClass526_8788.aClass526_7158;
         var2.aClass526_7158.aClass526_7157 = var2;
         var4.aClass526_7157 = var1.aClass526_8788;
         var1.aClass526_8788.aClass526_7158 = var4;
      }

   }

   public Object[] toArray() {
      return this.method8185((byte)-57);
   }

   Class526 method8179(Class526 var1, byte var2) {
      Class526 var3;
      if(var1 == null) {
         var3 = this.aClass526_8788.aClass526_7157;
      } else {
         var3 = var1;
      }

      if(this.aClass526_8788 == var3) {
         this.aClass526_8787 = null;
         return null;
      } else {
         this.aClass526_8787 = var3.aClass526_7157;
         return var3;
      }
   }

   public Class526 method8180(byte var1) {
      return this.method8187((Class526)null, -503369145);
   }

   public Class526 method8181(int var1) {
      Class526 var2 = this.aClass526_8787;
      if(var2 == this.aClass526_8788) {
         this.aClass526_8787 = null;
         return null;
      } else {
         this.aClass526_8787 = var2.aClass526_7157;
         return var2;
      }
   }

   public Class526 method8182(int var1) {
      Class526 var2 = this.aClass526_8787;
      if(this.aClass526_8788 == var2) {
         this.aClass526_8787 = null;
         return null;
      } else {
         this.aClass526_8787 = var2.aClass526_7158;
         return var2;
      }
   }

   public int method8183(int var1) {
      int var2 = 0;

      for(Class526 var3 = this.aClass526_8788.aClass526_7157; var3 != this.aClass526_8788; var3 = var3.aClass526_7157) {
         ++var2;
      }

      return var2;
   }

   public Iterator method8184() {
      return new Class695(this);
   }

   Class526[] method8185(byte var1) {
      Class526[] var2 = new Class526[this.method8183(-1127151853)];
      int var3 = 0;

      for(Class526 var4 = this.aClass526_8788.aClass526_7157; var4 != this.aClass526_8788; var4 = var4.aClass526_7157) {
         var2[var3++] = var4;
      }

      return var2;
   }

   public Iterator method8186() {
      return new Class695(this);
   }

   public int size() {
      return this.method8183(-704842034);
   }

   public boolean isEmpty() {
      return this.method8209(1731947395);
   }

   Class526 method8187(Class526 var1, int var2) {
      Class526 var3;
      if(var1 == null) {
         var3 = this.aClass526_8788.aClass526_7158;
      } else {
         var3 = var1;
      }

      if(this.aClass526_8788 == var3) {
         this.aClass526_8787 = null;
         return null;
      } else {
         this.aClass526_8787 = var3.aClass526_7158;
         return var3;
      }
   }

   public void clear() {
      this.method8188(588641051);
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void method8188(int var1) {
      while(this.aClass526_8788 != this.aClass526_8788.aClass526_7157) {
         this.aClass526_8788.aClass526_7157.method6332(-1949449864);
      }

   }

   public boolean add(Object var1) {
      return this.method8191((Class526)var1, -794288507);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean method8189(Object var1) {
      return super.equals(var1);
   }

   public int method8190() {
      return super.hashCode();
   }

   boolean method8191(Class526 var1, int var2) {
      this.method8176(var1, -972201914);
      return true;
   }

   public int method8192() {
      return this.method8183(-692626573);
   }

   public int method8193() {
      return this.method8183(743288866);
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public Object[] method8194() {
      return this.method8185((byte)9);
   }

   public boolean method8195(Object var1) {
      return super.equals(var1);
   }

   public boolean method8196() {
      return this.method8209(-343944088);
   }

   public boolean method8197(Object var1) {
      return super.equals(var1);
   }

   public void method8198() {
      while(this.aClass526_8788 != this.aClass526_8788.aClass526_7157) {
         this.aClass526_8788.aClass526_7157.method6332(-1949449864);
      }

   }

   public Object[] method8199() {
      return this.method8185((byte)-50);
   }

   public Class702() {
      this.aClass526_8788.aClass526_7157 = this.aClass526_8788;
      this.aClass526_8788.aClass526_7158 = this.aClass526_8788;
   }

   public boolean method8200() {
      return this.method8209(1539897821);
   }

   public boolean method8201(Object var1) {
      throw new RuntimeException();
   }

   public int method8202() {
      int var1 = 0;

      for(Class526 var2 = this.aClass526_8788.aClass526_7157; var2 != this.aClass526_8788; var2 = var2.aClass526_7157) {
         ++var1;
      }

      return var1;
   }

   public int method8203() {
      int var1 = 0;

      for(Class526 var2 = this.aClass526_8788.aClass526_7157; var2 != this.aClass526_8788; var2 = var2.aClass526_7157) {
         ++var1;
      }

      return var1;
   }

   public boolean method8204() {
      return this.aClass526_8788 == this.aClass526_8788.aClass526_7157;
   }

   public boolean method8205() {
      return this.aClass526_8788 == this.aClass526_8788.aClass526_7157;
   }

   public Class526 method8206(byte var1) {
      return this.method8179((Class526)null, (byte)9);
   }

   public Iterator iterator() {
      return new Class695(this);
   }

   public void method8207() {
      this.method8188(-2070439082);
   }

   public boolean method8208(Object var1) {
      throw new RuntimeException();
   }

   public boolean method8209(int var1) {
      return this.aClass526_8788 == this.aClass526_8788.aClass526_7157;
   }

   public void method8210() {
      this.method8188(-2030471064);
   }

   public void method8211() {
      this.method8188(-1329386747);
   }

   public int method8212() {
      return super.hashCode();
   }
}
