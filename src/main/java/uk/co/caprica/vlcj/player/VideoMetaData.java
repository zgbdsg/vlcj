/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Basic video meta data.
 */
public class VideoMetaData {

  /**
   * Video width/height.
   */
  private Dimension videoDimension;
  
  /**
   * 
   */
  private int titleCount;
  
  /**
   * Number of sub-picture/sub-titles.
   */
  private int spuCount;
  
  public Dimension getVideoDimension() {
    return videoDimension;
  }

  public void setVideoDimension(Dimension videoDimension) {
    this.videoDimension = videoDimension;
  }
  
  public int getTitleCount() {
    return titleCount;
  }

  public void setTitleCount(int titleCount) {
    this.titleCount = titleCount;
  }

  public int getSpuCount() {
    return spuCount;
  }

  public void setSpuCount(int spuCount) {
    this.spuCount = spuCount;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder(200);
    sb.append(getClass().getSimpleName()).append('[');
    sb.append("videoDimension=").append(videoDimension).append(',');
    sb.append("titleCount=").append(titleCount).append(',');
    sb.append("spuCount=").append(spuCount).append(']');
    return sb.toString();
  }
}