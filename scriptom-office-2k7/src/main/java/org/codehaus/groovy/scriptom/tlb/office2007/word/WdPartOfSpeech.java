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
package org.codehaus.groovy.scriptom.tlb.office2007.word;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class WdPartOfSpeech
{
  private WdPartOfSpeech()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdAdjective = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdNoun = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdAdverb = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdVerb = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdPronoun = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdConjunction = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdPreposition = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdInterjection = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdIdiom = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdOther = Integer.valueOf(9);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdAdjective", wdAdjective);
    v.put("wdNoun", wdNoun);
    v.put("wdAdverb", wdAdverb);
    v.put("wdVerb", wdVerb);
    v.put("wdPronoun", wdPronoun);
    v.put("wdConjunction", wdConjunction);
    v.put("wdPreposition", wdPreposition);
    v.put("wdInterjection", wdInterjection);
    v.put("wdIdiom", wdIdiom);
    v.put("wdOther", wdOther);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
