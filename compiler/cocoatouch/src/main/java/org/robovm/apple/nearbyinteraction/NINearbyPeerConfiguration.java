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
package org.robovm.apple.nearbyinteraction;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NearbyInteraction") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NINearbyPeerConfiguration/*</name>*/ 
    extends /*<extends>*/NIConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NINearbyPeerConfigurationPtr extends Ptr<NINearbyPeerConfiguration, NINearbyPeerConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NINearbyPeerConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NINearbyPeerConfiguration() {}
    protected NINearbyPeerConfiguration(Handle h, long handle) { super(h, handle); }
    protected NINearbyPeerConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPeerToken:")
    public NINearbyPeerConfiguration(NIDiscoveryToken peerToken) { super((SkipInit) null); initObject(init(peerToken)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "peerDiscoveryToken")
    public native NIDiscoveryToken getPeerDiscoveryToken();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isCameraAssistanceEnabled")
    public native boolean isCameraAssistanceEnabled();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setCameraAssistanceEnabled:")
    public native void setCameraAssistanceEnabled(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPeerToken:")
    protected native @Pointer long init(NIDiscoveryToken peerToken);
    /*</methods>*/
}
