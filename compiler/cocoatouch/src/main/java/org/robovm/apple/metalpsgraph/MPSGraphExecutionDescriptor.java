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
package org.robovm.apple.metalpsgraph;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphExecutionDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphExecutionDescriptorPtr extends Ptr<MPSGraphExecutionDescriptor, MPSGraphExecutionDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphExecutionDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphExecutionDescriptor() {}
    protected MPSGraphExecutionDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphExecutionDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scheduledHandler")
    public native @Block VoidBlock2<NSDictionary<MPSGraphTensor, MPSGraphTensorData>, NSError> getScheduledHandler();
    @Property(selector = "setScheduledHandler:")
    public native void setScheduledHandler(@Block VoidBlock2<NSDictionary<MPSGraphTensor, MPSGraphTensorData>, NSError> v);
    @Property(selector = "completionHandler")
    public native @Block VoidBlock2<NSDictionary<MPSGraphTensor, MPSGraphTensorData>, NSError> getCompletionHandler();
    @Property(selector = "setCompletionHandler:")
    public native void setCompletionHandler(@Block VoidBlock2<NSDictionary<MPSGraphTensor, MPSGraphTensorData>, NSError> v);
    @Property(selector = "waitUntilCompleted")
    public native boolean isWaitUntilCompleted();
    @Property(selector = "setWaitUntilCompleted:")
    public native void setWaitUntilCompleted(boolean v);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "compilationDescriptor")
    public native MPSGraphCompilationDescriptor getCompilationDescriptor();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "setCompilationDescriptor:")
    public native void setCompilationDescriptor(MPSGraphCompilationDescriptor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "waitForEvent:value:")
    public native void waitForEvent(MTLSharedEvent event, long value);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "signalEvent:atExecutionEvent:value:")
    public native void signalEvent(MTLSharedEvent event, MPSGraphExecutionStage executionStage, long value);
    /*</methods>*/
}
