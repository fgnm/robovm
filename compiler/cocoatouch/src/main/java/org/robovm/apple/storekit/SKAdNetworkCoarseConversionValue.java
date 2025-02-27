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
package org.robovm.apple.storekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SKAdNetworkCoarseConversionValue toObject(Class<SKAdNetworkCoarseConversionValue> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return SKAdNetworkCoarseConversionValue.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(SKAdNetworkCoarseConversionValue o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<SKAdNetworkCoarseConversionValue> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SKAdNetworkCoarseConversionValue> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(SKAdNetworkCoarseConversionValue.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SKAdNetworkCoarseConversionValue> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (SKAdNetworkCoarseConversionValue o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final SKAdNetworkCoarseConversionValue High = new SKAdNetworkCoarseConversionValue("High");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final SKAdNetworkCoarseConversionValue Medium = new SKAdNetworkCoarseConversionValue("Medium");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final SKAdNetworkCoarseConversionValue Low = new SKAdNetworkCoarseConversionValue("Low");
    /*</constants>*/
    
    private static /*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/[] values = new /*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/[] {/*<value_list>*/High, Medium, Low/*</value_list>*/};
    
    /*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/SKAdNetworkCoarseConversionValue/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("StoreKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="SKAdNetworkCoarseConversionValueHigh", optional=true)
        public static native NSString High();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="SKAdNetworkCoarseConversionValueMedium", optional=true)
        public static native NSString Medium();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="SKAdNetworkCoarseConversionValueLow", optional=true)
        public static native NSString Low();
        /*</values>*/
    }
}
