/*
 * Copyright 2014-15 Skynav, Inc. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY SKYNAV, INC. AND ITS CONTRIBUTORS “AS IS” AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SKYNAV, INC. OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.skynav.ttpe.layout;

import javax.xml.namespace.QName;

import com.skynav.ttpe.fonts.FontKey;
import com.skynav.ttpe.fonts.FontStyle;
import com.skynav.ttpe.fonts.FontWeight;
import com.skynav.ttpe.geometry.Extent;
import com.skynav.ttpe.geometry.Overflow;
import com.skynav.ttpe.geometry.Point;
import com.skynav.ttpe.geometry.TransformMatrix;
import com.skynav.ttpe.geometry.WritingMode;
import com.skynav.ttpe.style.BlockAlignment;
import com.skynav.ttpe.style.Color;
import com.skynav.ttpe.style.InlineAlignment;
import com.skynav.ttpe.style.Whitespace;
import com.skynav.ttpe.style.Wrap;

import com.skynav.xml.helpers.XML;

import static com.skynav.ttv.model.ttml.TTML.Constants.*;

public class Constants {

    // Namespaces
    public static final String ttNamespace                              = NAMESPACE_TT;
    public static final String ttsNamespace                             = NAMESPACE_TT_STYLE;
    public static final String isdNamespace                             = NAMESPACE_TT_ISD;

    // ISD Element Names
    public static final QName isdSequenceElementName                    = new QName(NAMESPACE_TT_ISD, "sequence");
    public static final QName isdInstanceElementName                    = new QName(NAMESPACE_TT_ISD, "isd");
    public static final QName isdComputedStyleSetElementName            = new QName(NAMESPACE_TT_ISD, "css");
    public static final QName isdRegionElementName                      = new QName(NAMESPACE_TT_ISD, "region");

    // TTML Element Names
    public static final QName ttBodyElementName                         = new QName(NAMESPACE_TT, "body");
    public static final QName ttDivisionElementName                     = new QName(NAMESPACE_TT, "div");
    public static final QName ttParagraphElementName                    = new QName(NAMESPACE_TT, "p");
    public static final QName ttSpanElementName                         = new QName(NAMESPACE_TT, "span");
    public static final QName ttBreakElementName                        = new QName(NAMESPACE_TT, "br");

    // ISD Attribute Names
    public static final QName isdCSSAttrName                            = new QName(NAMESPACE_TT_ISD, "css");

    // TTML Style Attribute Names
    public static final QName ttsColorAttrName                          = new QName(NAMESPACE_TT_STYLE, "color");
    public static final QName ttsDisplayAlignAttrName                   = new QName(NAMESPACE_TT_STYLE, "displayAlign");
    public static final QName ttsExtentAttrName                         = new QName(NAMESPACE_TT_STYLE, "extent");
    public static final QName ttsOriginAttrName                         = new QName(NAMESPACE_TT_STYLE, "origin");
    public static final QName ttsFontFamilyAttrName                     = new QName(NAMESPACE_TT_STYLE, "fontFamily");
    public static final QName ttsFontSizeAttrName                       = new QName(NAMESPACE_TT_STYLE, "fontSize");
    public static final QName ttsFontStyleAttrName                      = new QName(NAMESPACE_TT_STYLE, "fontStyle");
    public static final QName ttsFontWeightAttrName                     = new QName(NAMESPACE_TT_STYLE, "fontWeight");
    public static final QName ttsLineHeightAttrName                     = new QName(NAMESPACE_TT_STYLE, "lineHeight");
    public static final QName ttsOverflowAttrName                       = new QName(NAMESPACE_TT_STYLE, "overflow");
    public static final QName ttsTextAlignAttrName                      = new QName(NAMESPACE_TT_STYLE, "textAlign");
    public static final QName ttsWrapOptionAttrName                     = new QName(NAMESPACE_TT_STYLE, "wrapOption");
    public static final QName ttsWritingModeAttrName                    = new QName(NAMESPACE_TT_STYLE, "writingMode");

    // XML Attribute Names
    public static final QName xmlIdAttrName                             = new QName(XML.xmlNamespace, "id");
    public static final QName xmlLanguageAttrName                       = new QName(XML.xmlNamespace, "lang");
    public static final QName xmlSpaceAttrName                          = new QName(XML.xmlNamespace, "space");

    // Default Style Values
    public static final Color defaultColor                              = Color.YELLOW;
    public static final BlockAlignment defaultDisplayAlign              = BlockAlignment.BEFORE;
    public static final Extent defaultExtent                            = Extent.EMPTY;
    public static final String defaultFontFamily                        = FontKey.DEFAULT_FAMILY;
    public static final Extent defaultFontSize                          = FontKey.DEFAULT_SIZE;
    public static final FontStyle defaultFontStyle                      = FontKey.DEFAULT_STYLE;
    public static final FontWeight defaultFontWeight                    = FontKey.DEFAULT_WEIGHT;
    public static final String defaultLanguage                          = FontKey.DEFAULT_LANGUAGE;
    public static final double defaultLineHeight                        = defaultFontSize.getHeight() * 1.25;
    public static final Point defaultOrigin                             = Point.ZERO;
    public static final Overflow defaultOverflow                        = Overflow.HIDDEN;
    public static final Whitespace defaultWhitespace                    = Whitespace.DEFAULT;
    public static final InlineAlignment defaultTextAlign                = InlineAlignment.START;
    public static final TransformMatrix defaultTransform                = TransformMatrix.IDENTITY;
    public static final WritingMode defaultWritingMode                  = WritingMode.LRTB;
    public static final Wrap defaultWrap                                = Wrap.WRAP;

}