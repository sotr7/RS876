package com.jagex.twitchtv;

import com.jagex.Class585;
import com.jagex.twitchtv.TwitchEvent;

public class TwitchEventResult extends TwitchEvent {
   public int result;

   public TwitchEventResult(int var1, int var2) {
      super(var1);
      this.result = var2;
   }

   public void method4882(int[] var1, long[] var2, Object[] var3) {
      var1[0] = this.eventType;
      var1[1] = this.result;
   }

   public Class585 method4883() {
      return Class585.aClass585_7786;
   }

   public Class585 method4884() {
      return Class585.aClass585_7786;
   }

   public Class585 method4885() {
      return Class585.aClass585_7786;
   }

   public void method4886(int[] var1, long[] var2, Object[] var3) {
      var1[0] = this.eventType;
      var1[1] = this.result;
   }

   public void method4887(int[] var1, long[] var2, Object[] var3) {
      var1[0] = this.eventType;
      var1[1] = this.result;
   }
}
