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
package org.robovm.apple.metal;

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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIntersectionFunctionTableAdapter/*</name>*/ 
    extends /*<extends>*/MTLResourceAdapter/*</extends>*/ 
    /*<implements>*/implements MTLIntersectionFunctionTable/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("gpuResourceID")
    public @ByVal MTLResourceID getGpuResourceID() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setBuffer:offset:atIndex:")
    public void setBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index) {}
    @NotImplemented("setBuffers:offsets:withRange:")
    public void setBuffers(MTLBuffer buffers, MachineSizedUIntPtr offsets, @ByVal NSRange range) {}
    @NotImplemented("setFunction:atIndex:")
    public void setFunction(MTLFunctionHandle function, @MachineSizedUInt long index) {}
    @NotImplemented("setFunctions:withRange:")
    public void setFunctions(MTLFunctionHandle functions, @ByVal NSRange range) {}
    @NotImplemented("setOpaqueTriangleIntersectionFunctionWithSignature:atIndex:")
    public void setOpaqueTriangleIntersectionFunction(MTLIntersectionFunctionSignature signature, @MachineSizedUInt long index) {}
    @NotImplemented("setOpaqueTriangleIntersectionFunctionWithSignature:withRange:")
    public void setOpaqueTriangleIntersectionFunction(MTLIntersectionFunctionSignature signature, @ByVal NSRange range) {}
    @NotImplemented("setVisibleFunctionTable:atBufferIndex:")
    public void setVisibleFunctionTable(MTLVisibleFunctionTable functionTable, @MachineSizedUInt long bufferIndex) {}
    @NotImplemented("setVisibleFunctionTables:withBufferRange:")
    public void setVisibleFunctionTables(MTLVisibleFunctionTable functionTables, @ByVal NSRange bufferRange) {}
    /*</methods>*/
}
