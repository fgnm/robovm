/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIListContentView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements UIContentView/*</implements>*/ {

    /*<ptr>*/public static class UIListContentViewPtr extends Ptr<UIListContentView, UIListContentViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIListContentView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIListContentView() {}
    protected UIListContentView(Handle h, long handle) { super(h, handle); }
    protected UIListContentView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:")
    public UIListContentView(UIListContentConfiguration configuration) { super((SkipInit) null); initObject(init(configuration)); }
    @Method(selector = "initWithCoder:")
    public UIListContentView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "configuration")
    public native UIListContentConfiguration getConfiguration();
    @Property(selector = "setConfiguration:")
    public native void setConfiguration(UIListContentConfiguration v);
    @Property(selector = "textLayoutGuide")
    public native UILayoutGuide getTextLayoutGuide();
    @Property(selector = "secondaryTextLayoutGuide")
    public native UILayoutGuide getSecondaryTextLayoutGuide();
    @Property(selector = "imageLayoutGuide")
    public native UILayoutGuide getImageLayoutGuide();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long init(UIListContentConfiguration configuration);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "supportsConfiguration:")
    public native boolean supportsConfiguration(UIContentConfiguration configuration);
    /*</methods>*/

    @Override
    public void setConfiguration(UIContentConfiguration v) {
        setConfiguration((UIListContentConfiguration)v);
    }
}
