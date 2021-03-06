/*
 * Copyright 2009 (C) The Codehaus. All Rights Reserved.
 *
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided that the
 * following conditions are met:
 *  1. Redistributions of source code must retain copyright statements and
 * notices. Redistributions must also contain a copy of this document.
 *  2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *  3. The name "groovy" must not be used to endorse or promote products
 * derived from this Software without prior written permission of The Codehaus.
 * For written permission, please contact info@codehaus.org.
 *  4. Products derived from this Software may not be called "groovy" nor may
 * "groovy" appear in their names without prior written permission of The
 * Codehaus. "groovy" is a registered trademark of The Codehaus.
 *  5. Due credit should be given to The Codehaus - http://groovy.codehaus.org/
 *
 * THIS SOFTWARE IS PROVIDED BY THE CODEHAUS AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE CODEHAUS OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 */
package org.codehaus.groovy.scriptom.tlb.office2007.powerpoint;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class PpSlideLayout
{
  private PpSlideLayout()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer ppLayoutMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer ppLayoutTitle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer ppLayoutText = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer ppLayoutTwoColumnText = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer ppLayoutTable = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer ppLayoutTextAndChart = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer ppLayoutChartAndText = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer ppLayoutOrgchart = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer ppLayoutChart = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer ppLayoutTextAndClipart = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer ppLayoutClipartAndText = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer ppLayoutTitleOnly = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer ppLayoutBlank = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer ppLayoutTextAndObject = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer ppLayoutObjectAndText = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer ppLayoutLargeObject = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer ppLayoutObject = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer ppLayoutTextAndMediaClip = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer ppLayoutMediaClipAndText = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer ppLayoutObjectOverText = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer ppLayoutTextOverObject = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer ppLayoutTextAndTwoObjects = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer ppLayoutTwoObjectsAndText = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer ppLayoutTwoObjectsOverText = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer ppLayoutFourObjects = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer ppLayoutVerticalText = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer ppLayoutClipArtAndVerticalText = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer ppLayoutVerticalTitleAndText = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer ppLayoutVerticalTitleAndTextOverChart = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer ppLayoutTwoObjects = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer ppLayoutObjectAndTwoObjects = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer ppLayoutTwoObjectsAndObject = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer ppLayoutCustom = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer ppLayoutSectionHeader = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer ppLayoutComparison = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer ppLayoutContentWithCaption = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer ppLayoutPictureWithCaption = Integer.valueOf(36);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("ppLayoutMixed", ppLayoutMixed);
    v.put("ppLayoutTitle", ppLayoutTitle);
    v.put("ppLayoutText", ppLayoutText);
    v.put("ppLayoutTwoColumnText", ppLayoutTwoColumnText);
    v.put("ppLayoutTable", ppLayoutTable);
    v.put("ppLayoutTextAndChart", ppLayoutTextAndChart);
    v.put("ppLayoutChartAndText", ppLayoutChartAndText);
    v.put("ppLayoutOrgchart", ppLayoutOrgchart);
    v.put("ppLayoutChart", ppLayoutChart);
    v.put("ppLayoutTextAndClipart", ppLayoutTextAndClipart);
    v.put("ppLayoutClipartAndText", ppLayoutClipartAndText);
    v.put("ppLayoutTitleOnly", ppLayoutTitleOnly);
    v.put("ppLayoutBlank", ppLayoutBlank);
    v.put("ppLayoutTextAndObject", ppLayoutTextAndObject);
    v.put("ppLayoutObjectAndText", ppLayoutObjectAndText);
    v.put("ppLayoutLargeObject", ppLayoutLargeObject);
    v.put("ppLayoutObject", ppLayoutObject);
    v.put("ppLayoutTextAndMediaClip", ppLayoutTextAndMediaClip);
    v.put("ppLayoutMediaClipAndText", ppLayoutMediaClipAndText);
    v.put("ppLayoutObjectOverText", ppLayoutObjectOverText);
    v.put("ppLayoutTextOverObject", ppLayoutTextOverObject);
    v.put("ppLayoutTextAndTwoObjects", ppLayoutTextAndTwoObjects);
    v.put("ppLayoutTwoObjectsAndText", ppLayoutTwoObjectsAndText);
    v.put("ppLayoutTwoObjectsOverText", ppLayoutTwoObjectsOverText);
    v.put("ppLayoutFourObjects", ppLayoutFourObjects);
    v.put("ppLayoutVerticalText", ppLayoutVerticalText);
    v.put("ppLayoutClipArtAndVerticalText", ppLayoutClipArtAndVerticalText);
    v.put("ppLayoutVerticalTitleAndText", ppLayoutVerticalTitleAndText);
    v.put("ppLayoutVerticalTitleAndTextOverChart", ppLayoutVerticalTitleAndTextOverChart);
    v.put("ppLayoutTwoObjects", ppLayoutTwoObjects);
    v.put("ppLayoutObjectAndTwoObjects", ppLayoutObjectAndTwoObjects);
    v.put("ppLayoutTwoObjectsAndObject", ppLayoutTwoObjectsAndObject);
    v.put("ppLayoutCustom", ppLayoutCustom);
    v.put("ppLayoutSectionHeader", ppLayoutSectionHeader);
    v.put("ppLayoutComparison", ppLayoutComparison);
    v.put("ppLayoutContentWithCaption", ppLayoutContentWithCaption);
    v.put("ppLayoutPictureWithCaption", ppLayoutPictureWithCaption);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
