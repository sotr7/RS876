package com.jagex.twitchtv;

import com.jagex.Class585;
import com.jagex.twitchtv.TwitchEvent;

public class TwitchEventLiveStreams extends TwitchEvent {
   public int streamCount;
   public String[] channelUrls;
   public String[] previewUrlTemplates;
   public String[] streamTitles;
   public String[] channelDisplayNames;
   public int[] viewerCounts;

   public TwitchEventLiveStreams(int var1, int var2) {
      super(var1);
      this.streamCount = var2;
      if(this.streamCount > 0) {
         this.channelUrls = new String[this.streamCount];
         this.previewUrlTemplates = new String[this.streamCount];
         this.streamTitles = new String[this.streamCount];
         this.channelDisplayNames = new String[this.streamCount];
         this.viewerCounts = new int[this.streamCount];
      }

   }

   public void SetStream(int var1, String var2, String var3, String var4, String var5, int var6) {
      if(var1 >= 0 && var1 < this.streamCount) {
         this.channelUrls[var1] = var2;
         this.previewUrlTemplates[var1] = var3;
         this.streamTitles[var1] = var4;
         this.channelDisplayNames[var1] = var5;
         this.viewerCounts[var1] = var6;
      }

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
