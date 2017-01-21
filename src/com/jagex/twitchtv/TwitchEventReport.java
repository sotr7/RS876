package com.jagex.twitchtv;

import com.jagex.Class585;
import com.jagex.twitchtv.TwitchEvent;

public class TwitchEventReport extends TwitchEvent {
   public String message;

   public TwitchEventReport(int var1, String var2) {
      super(var1);
      this.message = var2;
   }

   public void method4882(int[] var1, long[] var2, Object[] var3) {
      var1[0] = this.eventType;
      var3[0] = this.message;
   }

   public Class585 method4883() {
      return Class585.aClass585_7789;
   }

   public Class585 method4884() {
      return Class585.aClass585_7789;
   }

   public Class585 method4885() {
      return Class585.aClass585_7789;
   }

   public void method4886(int[] var1, long[] var2, Object[] var3) {
      var1[0] = this.eventType;
      var3[0] = this.message;
   }

   public void method4887(int[] var1, long[] var2, Object[] var3) {
      var1[0] = this.eventType;
      var3[0] = this.message;
   }
}
