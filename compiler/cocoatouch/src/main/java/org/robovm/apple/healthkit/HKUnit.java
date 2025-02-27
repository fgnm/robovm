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
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKUnit/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKUnitPtr extends Ptr<HKUnit, HKUnitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKUnit.class); }/*</bind>*/
    /*<constants>*/
    public static final double MolarMassBloodGlucose = 180.15588000005408;
    /*</constants>*/
    /*<constructors>*/
    protected HKUnit() {}
    protected HKUnit(Handle h, long handle) { super(h, handle); }
    protected HKUnit(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public HKUnit(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "unitString")
    public native String getUnitString();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isNull")
    public native boolean isNull();
    @Method(selector = "unitFromString:")
    public static native HKUnit fromString(String string);
    @Method(selector = "unitFromMassFormatterUnit:")
    public static native HKUnit fromMassFormatterUnit(NSMassFormatterUnit massFormatterUnit);
    @Method(selector = "massFormatterUnitFromUnit:")
    public static native NSMassFormatterUnit createMassFormatterUnit(HKUnit unit);
    @Method(selector = "unitFromLengthFormatterUnit:")
    public static native HKUnit fromLengthFormatterUnit(NSLengthFormatterUnit lengthFormatterUnit);
    @Method(selector = "lengthFormatterUnitFromUnit:")
    public static native NSLengthFormatterUnit createLengthFormatterUnit(HKUnit unit);
    @Method(selector = "unitFromEnergyFormatterUnit:")
    public static native HKUnit fromEnergyFormatterUnit(NSEnergyFormatterUnit energyFormatterUnit);
    @Method(selector = "energyFormatterUnitFromUnit:")
    public static native NSEnergyFormatterUnit createEnergyFormatterUnit(HKUnit unit);
    @Method(selector = "gramUnitWithMetricPrefix:")
    public static native HKUnit gram(HKMetricPrefix prefix);
    @Method(selector = "gramUnit")
    public static native HKUnit gram();
    @Method(selector = "ounceUnit")
    public static native HKUnit ounce();
    @Method(selector = "poundUnit")
    public static native HKUnit pound();
    @Method(selector = "stoneUnit")
    public static native HKUnit stone();
    @Method(selector = "moleUnitWithMetricPrefix:molarMass:")
    public static native HKUnit mole(HKMetricPrefix prefix, double gramsPerMole);
    @Method(selector = "moleUnitWithMolarMass:")
    public static native HKUnit mole(double gramsPerMole);
    @Method(selector = "meterUnitWithMetricPrefix:")
    public static native HKUnit meter(HKMetricPrefix prefix);
    @Method(selector = "meterUnit")
    public static native HKUnit meter();
    @Method(selector = "inchUnit")
    public static native HKUnit inch();
    @Method(selector = "footUnit")
    public static native HKUnit foot();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "yardUnit")
    public static native HKUnit yard();
    @Method(selector = "mileUnit")
    public static native HKUnit mile();
    @Method(selector = "literUnitWithMetricPrefix:")
    public static native HKUnit liter(HKMetricPrefix prefix);
    @Method(selector = "literUnit")
    public static native HKUnit liter();
    @Method(selector = "fluidOunceUSUnit")
    public static native HKUnit fluidOunceUS();
    @Method(selector = "fluidOunceImperialUnit")
    public static native HKUnit fluidOunceImperial();
    @Method(selector = "pintUSUnit")
    public static native HKUnit pintUS();
    @Method(selector = "pintImperialUnit")
    public static native HKUnit pintImperial();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "cupUSUnit")
    public static native HKUnit cupUS();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "cupImperialUnit")
    public static native HKUnit cupImperial();
    @Method(selector = "pascalUnitWithMetricPrefix:")
    public static native HKUnit pascal(HKMetricPrefix prefix);
    @Method(selector = "pascalUnit")
    public static native HKUnit pascal();
    @Method(selector = "millimeterOfMercuryUnit")
    public static native HKUnit millimeterOfMercury();
    @Method(selector = "centimeterOfWaterUnit")
    public static native HKUnit centimeterOfWater();
    @Method(selector = "atmosphereUnit")
    public static native HKUnit atmosphere();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "decibelAWeightedSoundPressureLevelUnit")
    public static native HKUnit decibelAWeightedSoundPressureLevel();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "inchesOfMercuryUnit")
    public static native HKUnit inchesOfMercury();
    @Method(selector = "secondUnitWithMetricPrefix:")
    public static native HKUnit second(HKMetricPrefix prefix);
    @Method(selector = "secondUnit")
    public static native HKUnit second();
    @Method(selector = "minuteUnit")
    public static native HKUnit minute();
    @Method(selector = "hourUnit")
    public static native HKUnit hour();
    @Method(selector = "dayUnit")
    public static native HKUnit day();
    @Method(selector = "jouleUnitWithMetricPrefix:")
    public static native HKUnit joule(HKMetricPrefix prefix);
    @Method(selector = "jouleUnit")
    public static native HKUnit joule();
    @Method(selector = "kilocalorieUnit")
    public static native HKUnit kilocalorie();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "smallCalorieUnit")
    public static native HKUnit smallCalorie();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "largeCalorieUnit")
    public static native HKUnit largeCalorie();
    /**
     * @deprecated Deprecated in iOS 11.0. Use smallCalorieUnit or largeCalorieUnit, depending on which you mean
     */
    @Deprecated
    @Method(selector = "calorieUnit")
    public static native HKUnit calorie();
    @Method(selector = "degreeCelsiusUnit")
    public static native HKUnit degreeCelsius();
    @Method(selector = "degreeFahrenheitUnit")
    public static native HKUnit degreeFahrenheit();
    @Method(selector = "kelvinUnit")
    public static native HKUnit kelvin();
    @Method(selector = "siemenUnitWithMetricPrefix:")
    public static native HKUnit siemen(HKMetricPrefix prefix);
    @Method(selector = "siemenUnit")
    public static native HKUnit siemen();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "internationalUnit")
    public static native HKUnit international();
    @Method(selector = "countUnit")
    public static native HKUnit count();
    @Method(selector = "percentUnit")
    public static native HKUnit percent();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "decibelHearingLevelUnit")
    public static native HKUnit decibelHearingLevel();
    @Method(selector = "unitMultipliedByUnit:")
    public native HKUnit multiplyBy(HKUnit unit);
    @Method(selector = "unitDividedByUnit:")
    public native HKUnit divideBy(HKUnit unit);
    @Method(selector = "unitRaisedToPower:")
    public native HKUnit raiseToPower(@MachineSizedSInt long power);
    @Method(selector = "reciprocalUnit")
    public native HKUnit reciprocalUnit();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "hertzUnitWithMetricPrefix:")
    public static native HKUnit hertz(HKMetricPrefix prefix);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "hertzUnit")
    public static native HKUnit hertz();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "voltUnitWithMetricPrefix:")
    public static native HKUnit volt(HKMetricPrefix prefix);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "voltUnit")
    public static native HKUnit volt();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "wattUnitWithMetricPrefix:")
    public static native HKUnit watt(HKMetricPrefix prefix);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "wattUnit")
    public static native HKUnit watt();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "diopterUnit")
    public static native HKUnit diopter();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "prismDiopterUnit")
    public static native HKUnit prismDiopter();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "radianAngleUnitWithMetricPrefix:")
    public static native HKUnit radianAngle(HKMetricPrefix prefix);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "radianAngleUnit")
    public static native HKUnit radianAngle();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "degreeAngleUnit")
    public static native HKUnit degreeAngle();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
