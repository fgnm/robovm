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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKContactsPrescription/*</name>*/ 
    extends /*<extends>*/HKVisionPrescription/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKContactsPrescriptionPtr extends Ptr<HKContactsPrescription, HKContactsPrescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKContactsPrescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKContactsPrescription() {}
    protected HKContactsPrescription(Handle h, long handle) { super(h, handle); }
    protected HKContactsPrescription(SkipInit skipInit) { super(skipInit); }
    public HKContactsPrescription(HKContactsLensSpecification rightEyeSpecification, HKContactsLensSpecification leftEyeSpecification, String brand, NSDate dateIssued, NSDate expirationDate, HKDevice device, NSDictionary<NSString, ?> metadata) { super((Handle) null, create(rightEyeSpecification, leftEyeSpecification, brand, dateIssued, expirationDate, device, metadata)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rightEye")
    public native HKContactsLensSpecification getRightEye();
    @Property(selector = "leftEye")
    public native HKContactsLensSpecification getLeftEye();
    @Property(selector = "brand")
    public native String getBrand();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "prescriptionWithRightEyeSpecification:leftEyeSpecification:brand:dateIssued:expirationDate:device:metadata:")
    protected static native @Pointer long create(HKContactsLensSpecification rightEyeSpecification, HKContactsLensSpecification leftEyeSpecification, String brand, NSDate dateIssued, NSDate expirationDate, HKDevice device, NSDictionary<NSString, ?> metadata);
    /*</methods>*/
}
