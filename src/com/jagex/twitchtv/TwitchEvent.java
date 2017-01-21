package com.jagex.twitchtv;

import com.jagex.Class585;

public abstract class TwitchEvent {
   public int eventType;

   public TwitchEvent(int var1) {
      this.eventType = var1;
   }

   public abstract void method4882(int[] var1, long[] var2, Object[] var3);

   public abstract Class585 method4883();

   public abstract Class585 method4884();

   public abstract Class585 method4885();

   public abstract void method4886(int[] var1, long[] var2, Object[] var3);

   public abstract void method4887(int[] var1, long[] var2, Object[] var3);
}
