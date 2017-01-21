package com.jagex;

import com.jagex.Class449;
import com.jagex.Class526_Sub21_Sub15;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class526_Sub21_Sub15_Sub3 extends Class526_Sub21_Sub15 {
   Future aFuture12158;
   int anInt12157;

   int method10703(int var1) {
      return null == this.aFuture12158?0:(this.aFuture12158.isDone()?100:0);
   }

   byte[] method10707() {
      if(this.aFuture12158.isDone()) {
         try {
            return ((Class449)this.aFuture12158.get()).method5335((byte)-8);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         } catch (ExecutionException var3) {
            var3.printStackTrace();
         }
      }

      return null;
   }

   int method10708() {
      return null == this.aFuture12158?0:(this.aFuture12158.isDone()?100:0);
   }

   byte[] method10706() {
      if(this.aFuture12158.isDone()) {
         try {
            return ((Class449)this.aFuture12158.get()).method5335((byte)-85);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         } catch (ExecutionException var3) {
            var3.printStackTrace();
         }
      }

      return null;
   }

   int method10705() {
      return null == this.aFuture12158?0:(this.aFuture12158.isDone()?100:0);
   }

   byte[] method10704(int var1) {
      if(this.aFuture12158.isDone()) {
         try {
            return ((Class449)this.aFuture12158.get()).method5335((byte)-96);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         } catch (ExecutionException var4) {
            var4.printStackTrace();
         }
      }

      return null;
   }

   void method10964(Future var1, int var2) {
      this.aFuture12158 = var1;
   }

   Class526_Sub21_Sub15_Sub3(int var1) {
      this.anInt12157 = 970486583 * var1;
   }
}
