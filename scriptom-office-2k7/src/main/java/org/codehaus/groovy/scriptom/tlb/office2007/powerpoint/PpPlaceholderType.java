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
public final class PpPlaceholderType
{
  private PpPlaceholderType()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer ppPlaceholderMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer ppPlaceholderTitle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer ppPlaceholderBody = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer ppPlaceholderCenterTitle = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer ppPlaceholderSubtitle = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer ppPlaceholderVerticalTitle = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer ppPlaceholderVerticalBody = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer ppPlaceholderObject = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer ppPlaceholderChart = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer ppPlaceholderBitmap = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer ppPlaceholderMediaClip = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer ppPlaceholderOrgChart = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer ppPlaceholderTable = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer ppPlaceholderSlideNumber = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer ppPlaceholderHeader = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer ppPlaceholderFooter = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer ppPlaceholderDate = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer ppPlaceholderVerticalObject = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer ppPlaceholderPicture = Integer.valueOf(18);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("ppPlaceholderMixed", ppPlaceholderMixed);
    v.put("ppPlaceholderTitle", ppPlaceholderTitle);
    v.put("ppPlaceholderBody", ppPlaceholderBody);
    v.put("ppPlaceholderCenterTitle", ppPlaceholderCenterTitle);
    v.put("ppPlaceholderSubtitle", ppPlaceholderSubtitle);
    v.put("ppPlaceholderVerticalTitle", ppPlaceholderVerticalTitle);
    v.put("ppPlaceholderVerticalBody", ppPlaceholderVerticalBody);
    v.put("ppPlaceholderObject", ppPlaceholderObject);
    v.put("ppPlaceholderChart", ppPlaceholderChart);
    v.put("ppPlaceholderBitmap", ppPlaceholderBitmap);
    v.put("ppPlaceholderMediaClip", ppPlaceholderMediaClip);
    v.put("ppPlaceholderOrgChart", ppPlaceholderOrgChart);
    v.put("ppPlaceholderTable", ppPlaceholderTable);
    v.put("ppPlaceholderSlideNumber", ppPlaceholderSlideNumber);
    v.put("ppPlaceholderHeader", ppPlaceholderHeader);
    v.put("ppPlaceholderFooter", ppPlaceholderFooter);
    v.put("ppPlaceholderDate", ppPlaceholderDate);
    v.put("ppPlaceholderVerticalObject", ppPlaceholderVerticalObject);
    v.put("ppPlaceholderPicture", ppPlaceholderPicture);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
