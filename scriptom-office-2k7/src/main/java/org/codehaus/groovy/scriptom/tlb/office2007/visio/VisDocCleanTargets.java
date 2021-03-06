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
package org.codehaus.groovy.scriptom.tlb.office2007.visio;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * Flags passed to Document.Clean indicating what objects to examine.
 * @author Jason Smith
 */
public final class VisDocCleanTargets
{
  private VisDocCleanTargets()
  {
  }

  /**
   * Tells Document.Clean to examine foreground pages.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visDocCleanTargFPages = Integer.valueOf(1);

  /**
   * Tells Document.Clean to examine background pages.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visDocCleanTargBPages = Integer.valueOf(2);

  /**
   * Tells Document.Clean to examine masters.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visDocCleanTargMasters = Integer.valueOf(4);

  /**
   * Tells Document.Clean to examine styles.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visDocCleanTargStyles = Integer.valueOf(8);

  /**
   * Tells Document.Clean to examine document sheets.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visDocCleanTargDoc = Integer.valueOf(16);

  /**
   * Tells Document.Clean to examine reviewer pages.<p>
   * Value is 32 (0x20)
   */
  public static final Integer visDocCleanTargRPages = Integer.valueOf(32);

  /**
   * Tells Document.Clean to examine only page sheets.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visDocCleanPageSheet = Integer.valueOf(256);

  /**
   * Tells Document.Clean to examine all objects. [Default value for nTargets]<p>
   * Value is 255 (0xFF)
   */
  public static final Integer visDocCleanTargAll = Integer.valueOf(255);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visDocCleanTargFPages", visDocCleanTargFPages);
    v.put("visDocCleanTargBPages", visDocCleanTargBPages);
    v.put("visDocCleanTargMasters", visDocCleanTargMasters);
    v.put("visDocCleanTargStyles", visDocCleanTargStyles);
    v.put("visDocCleanTargDoc", visDocCleanTargDoc);
    v.put("visDocCleanTargRPages", visDocCleanTargRPages);
    v.put("visDocCleanPageSheet", visDocCleanPageSheet);
    v.put("visDocCleanTargAll", visDocCleanTargAll);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
