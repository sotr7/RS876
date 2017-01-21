package com.jagex;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class500 {
   Robot aRobot5631 = new Robot();

   public Class500() throws Exception {
   }

   public void movemouse(int var1, int var2) {
      this.aRobot5631.mouseMove(var1, var2);
   }

   public void setcustomcursor(Component var1, int[] var2, int var3, int var4, Point var5) {
      if(var2 != null) {
         BufferedImage var6 = new BufferedImage(var3, var4, 2);
         var6.setRGB(0, 0, var3, var4, var2, 0, var3);
         var1.setCursor(var1.getToolkit().createCustomCursor(var6, var5, (String)null));
      } else {
         var1.setCursor((Cursor)null);
      }

   }
}
