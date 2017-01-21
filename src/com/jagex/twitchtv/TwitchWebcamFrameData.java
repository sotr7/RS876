package com.jagex.twitchtv;

public class TwitchWebcamFrameData {
   public int width = 0;
   public int height = 0;
   public int[] buffer = null;

   public void SetData(int var1, int var2, int[] var3) {
      this.width = var1;
      this.height = var2;
      this.buffer = var3;
   }

   public void method8326() {
      for(int var1 = this.height - 1; var1 >= 0; --var1) {
         int var2 = var1 * this.width;

         for(int var3 = this.width * (var1 + 1); var2 < var3; ++var2) {
            --var3;
            int var4 = this.buffer[var2];
            this.buffer[var2] = this.buffer[var3];
            this.buffer[var3] = var4;
         }
      }

   }

   public void method8327() {
      for(int var1 = (this.height >> 1) - 1; var1 >= 0; --var1) {
         int var2 = this.width * var1;
         int var3 = (this.height - var1 - 1) * this.width;

         for(int var4 = -this.width; var4 < 0; ++var4) {
            int var5 = this.buffer[var2];
            this.buffer[var2] = this.buffer[var3];
            this.buffer[var3] = var5;
            ++var2;
            ++var3;
         }
      }

   }

   public void method8328() {
      for(int var1 = this.height - 1; var1 >= 0; --var1) {
         int var2 = var1 * this.width;

         for(int var3 = this.width * (var1 + 1); var2 < var3; ++var2) {
            --var3;
            int var4 = this.buffer[var2];
            this.buffer[var2] = this.buffer[var3];
            this.buffer[var3] = var4;
         }
      }

   }

   public void method8329() {
      for(int var1 = this.height - 1; var1 >= 0; --var1) {
         int var2 = var1 * this.width;

         for(int var3 = this.width * (var1 + 1); var2 < var3; ++var2) {
            --var3;
            int var4 = this.buffer[var2];
            this.buffer[var2] = this.buffer[var3];
            this.buffer[var3] = var4;
         }
      }

   }

   public void method8330() {
      for(int var1 = (this.height >> 1) - 1; var1 >= 0; --var1) {
         int var2 = this.width * var1;
         int var3 = (this.height - var1 - 1) * this.width;

         for(int var4 = -this.width; var4 < 0; ++var4) {
            int var5 = this.buffer[var2];
            this.buffer[var2] = this.buffer[var3];
            this.buffer[var3] = var5;
            ++var2;
            ++var3;
         }
      }

   }
}
