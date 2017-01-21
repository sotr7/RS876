package com.jagex.twitchtv;

import com.jagex.Class585;
import com.jagex.twitchtv.TwitchEvent;

public class TwitchEventChatUserInfo extends TwitchEvent {
   public int userState;
   public String displayName;
   public int nameColourARGB;
   public boolean ignore;
   public int modes;
   public int subscriptions;

   public TwitchEventChatUserInfo(int var1, int var2, String var3, int var4, boolean var5, int var6, int var7) {
      super(var1);
      this.userState = var2;
      this.displayName = var3;
      this.nameColourARGB = var4;
      this.ignore = var5;
      this.modes = var6;
      this.subscriptions = var7;
   }

   public Class585 method4883() {
      return null;
   }

   public void method4882(int[] var1, long[] var2, Object[] var3) {
   }

   public Class585 method4884() {
      return null;
   }

   public Class585 method4885() {
      return null;
   }

   public void method4886(int[] var1, long[] var2, Object[] var3) {
   }

   public void method4887(int[] var1, long[] var2, Object[] var3) {
   }
}
