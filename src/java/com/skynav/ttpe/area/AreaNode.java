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

package com.skynav.ttpe.area;

import java.lang.ref.WeakReference;

import org.w3c.dom.Element;

import com.skynav.ttpe.geometry.Dimension;
import com.skynav.ttpe.geometry.WritingMode;
import com.skynav.ttpe.style.Whitespace;

public class AreaNode extends AbstractArea {

    private WeakReference<NonLeafAreaNode> parent;

    public AreaNode(Element e) {
        super(e);
    }

    @Override
    public String getLanguage() {
        String language = super.getLanguage();
        if (language != null) {
            return language;
        } else {
            AreaNode p = getParent();
            if (p != null)
                return p.getLanguage();
            else
                return null;
        }
    }

    @Override
    public Whitespace getWhitespace() {
        Whitespace space = super.getWhitespace();
        if (space != null) {
            return space;
        } else {
            AreaNode p = getParent();
            if (p != null)
                return p.getWhitespace();
            else
                return null;
        }
    }

    @Override
    public WritingMode getWritingMode() {
        WritingMode wm = super.getWritingMode();
        if (wm != null) {
            return wm;
        } else {
            AreaNode p = getParent();
            if (p != null)
                return p.getWritingMode();
            else
                return null;
        }
    }

    @Override
    public double getAvailable(Dimension dimension) {
        for (AreaNode p = getParent(); p != null; p = p.getParent()) {
            if (p instanceof ReferenceArea)
                return p.getAvailable(dimension);
        }
        return super.getAvailable(dimension);
    }

    public void setParent(NonLeafAreaNode parent) {
        this.parent = new WeakReference<NonLeafAreaNode>(parent);
    }

    public NonLeafAreaNode getParent() {
        return (parent != null) ? parent.get() : null;
    }

}