package com.jagex;

public class Class4 {
   public Object anObject23;
   public Object anObject24;

   public boolean method537(Object var1) {
      if(var1 != null && var1 instanceof Class4) {
         Class4 var2 = (Class4)var1;
         if(this.anObject23 == null) {
            if(var2.anObject23 != null) {
               return false;
            }
         } else if(!this.anObject23.equals(var2.anObject23)) {
            return false;
         }

         if(this.anObject24 == null) {
            if(var2.anObject24 != null) {
               return false;
            }
         } else if(!this.anObject24.equals(var2.anObject24)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return this.anObject23 + ", " + this.anObject24;
   }

   public boolean method538(Object var1) {
      if(var1 != null && var1 instanceof Class4) {
         Class4 var2 = (Class4)var1;
         if(this.anObject23 == null) {
            if(var2.anObject23 != null) {
               return false;
            }
         } else if(!this.anObject23.equals(var2.anObject23)) {
            return false;
         }

         if(this.anObject24 == null) {
            if(var2.anObject24 != null) {
               return false;
            }
         } else if(!this.anObject24.equals(var2.anObject24)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = 0;
      if(this.anObject23 != null) {
         var1 += this.anObject23.hashCode();
      }

      if(this.anObject24 != null) {
         var1 += 31 * this.anObject24.hashCode();
      }

      return var1;
   }

   public int method539() {
      int var1 = 0;
      if(this.anObject23 != null) {
         var1 += this.anObject23.hashCode();
      }

      if(this.anObject24 != null) {
         var1 += 31 * this.anObject24.hashCode();
      }

      return var1;
   }

   public Class4(Object var1, Object var2) {
      this.anObject23 = var1;
      this.anObject24 = var2;
   }

   public String method540() {
      return this.anObject23 + ", " + this.anObject24;
   }

   public boolean method541(Object var1) {
      if(var1 != null && var1 instanceof Class4) {
         Class4 var2 = (Class4)var1;
         if(this.anObject23 == null) {
            if(var2.anObject23 != null) {
               return false;
            }
         } else if(!this.anObject23.equals(var2.anObject23)) {
            return false;
         }

         if(this.anObject24 == null) {
            if(var2.anObject24 != null) {
               return false;
            }
         } else if(!this.anObject24.equals(var2.anObject24)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Class4) {
         Class4 var2 = (Class4)var1;
         if(this.anObject23 == null) {
            if(var2.anObject23 != null) {
               return false;
            }
         } else if(!this.anObject23.equals(var2.anObject23)) {
            return false;
         }

         if(this.anObject24 == null) {
            if(var2.anObject24 != null) {
               return false;
            }
         } else if(!this.anObject24.equals(var2.anObject24)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int method542() {
      int var1 = 0;
      if(this.anObject23 != null) {
         var1 += this.anObject23.hashCode();
      }

      if(this.anObject24 != null) {
         var1 += 31 * this.anObject24.hashCode();
      }

      return var1;
   }
}
