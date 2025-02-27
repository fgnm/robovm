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

/*</javadoc>*/
@ForceLinkClass(HKError.class)
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/HKErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    NoError(0L),
    ErrorHealthDataUnavailable(1L),
    ErrorHealthDataRestricted(2L),
    ErrorInvalidArgument(3L),
    ErrorAuthorizationDenied(4L),
    ErrorAuthorizationNotDetermined(5L),
    ErrorDatabaseInaccessible(6L),
    ErrorUserCanceled(7L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    ErrorAnotherWorkoutSessionStarted(8L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    ErrorUserExitedWorkoutSession(9L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    ErrorRequiredAuthorizationDenied(10L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    ErrorNoData(11L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/HKErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/HKErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/HKErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/HKErrorCode/*</name>*/.class.getName());
    }
}
