package com.jagex.twitchtv;

import com.jagex.Class585;
import com.jagex.twitchtv.TwitchEvent;

public class TwitchEventChatMessage extends TwitchEvent {
   public String name;
   public String message;
   public int nameColourARGB;
   public int modes;
   public int subscriptions;
   public boolean isAction;

   public TwitchEventChatMessage(int var1, String var2, String var3, int var4, int var5, int var6, boolean var7) {
      super(var1);
      this.name = var2;
      this.message = var3;
      this.nameColourARGB = var4;
      this.modes = var5;
      this.subscriptions = var6;
      this.isAction = var7;
   }

   public void method4882(int[] var1, long[] var2, Object[] var3) {
      var3[0] = this.name;
      var3[1] = this.message;
   }

   public Class585 method4883() {
      return Class585.aClass585_7787;
   }

   public Class585 method4884() {
      return Class585.aClass585_7787;
   }

   public Class585 method4885() {
      return Class585.aClass585_7787;
   }

   public void method4886(int[] var1, long[] var2, Object[] var3) {
      var3[0] = this.name;
      var3[1] = this.message;
   }

   public void method4887(int[] var1, long[] var2, Object[] var3) {
      var3[0] = this.name;
      var3[1] = this.message;
   }
}
