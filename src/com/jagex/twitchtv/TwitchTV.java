package com.jagex.twitchtv;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class TwitchTV {
   public static final int anInt8859 = 0;
   public static final int anInt8860 = 12;
   public static final int anInt8861 = 23;
   public static final int anInt8862 = 42;
   public static final int anInt8863 = 2072;
   public static final int anInt8864 = -995;
   public static final int anInt8865 = 7;
   public static final int anInt8866 = 8;
   public static final int anInt8867 = 9;
   public static final int anInt8868 = 10;
   public static final int anInt8869 = 30;
   public static final int anInt8870 = 33;
   public static final int anInt8871 = 34;
   public static final int anInt8872 = 5;
   public static final int anInt8873 = 0;
   public static final int anInt8874 = 1;
   public static final int anInt8875 = 2;

   public native int InitialiseTTV(String var1);

   public native int ShutdownTTV();

   public native int Login(String var1, String var2);

   public native int Logout();

   public native String GetUsername();

   public native TwitchEvent[] Service();

   public native int GetLoginState();

   public native void SetAuthResponse(String var1, int var2, String var3);

   public native int RequestLiveStreams(String var1);

   public native int StartStreaming(int var1, int var2, int var3, int var4, boolean var5, float var6, int var7, boolean var8);

   public native int Pause();

   public native int GetStreamState();

   public native boolean IsStreaming();

   public native boolean IsReadyToStream();

   public native void FlushStreamingEvents();

   public native int StopStreaming();

   public native int RunCommercial();

   public native long GetNextFreeFrameBuffer();

   public native int SubmitFrame(long var1, boolean var3, boolean var4, int var5, int var6);

   public native int SubmitFrameRaw(int[] var1, boolean var2, int var3, int var4);

   public native int[] GetRecommendedSettings(int var1, int var2, int var3, int var4, int var5, float var6, boolean var7);

   public native void SetUserStreamRefreshInterval(int var1);

   public native int GetViewerCount();

   public native int SetStreamTitle(String var1, String var2);

   public native int ChatSendMessage(String var1);

   public native int GetChatState();

   public native int GetWebcamState();

   public native int GetWebcamFrameData(int var1, TwitchWebcamFrameData var2);

   public native int[] GetWebcamFrameResolution(int var1);

   public native int StartWebcamDevice(int var1, int var2);

   public native int StopWebcamDevice(int var1);

   public native TwitchWebcamDevice[] GetWebcamDevices();

   public native void RestartWebcamDevice();
}
