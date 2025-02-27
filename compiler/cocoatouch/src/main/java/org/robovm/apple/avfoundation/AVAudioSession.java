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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeInterruption(final VoidBlock1<AVAudioSessionInterruptionNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(InterruptionNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    AVAudioSessionInterruptionNotification data = null;
                    if (userInfo != null) {
                        data = new AVAudioSessionInterruptionNotification(userInfo);
                    }
                    block.invoke(data);
                }
            });
        }
        
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeRouteChange(final VoidBlock1<AVAudioSessionRouteChangeNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(RouteChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    AVAudioSessionRouteChangeNotification data = null;
                    if (userInfo != null) {
                        data = new AVAudioSessionRouteChangeNotification(userInfo);
                    }
                    block.invoke(data);
                }
            });
        }
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeMediaServicesWereLost(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(MediaServicesWereLostNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeMediaServicesWereReset(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(MediaServicesWereResetNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeSilenceSecondaryAudioHint(final VoidBlock1<AVAudioSessionSilenceSecondaryAudioHintType> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(SilenceSecondaryAudioHintNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    AVAudioSessionSilenceSecondaryAudioHintType type = null;
                    if (userInfo.containsKey(SilenceSecondaryAudioHintTypeKey())) {
                        NSNumber val = (NSNumber)userInfo.get(SilenceSecondaryAudioHintTypeKey());
                        type = AVAudioSessionSilenceSecondaryAudioHintType.valueOf(val.intValue());
                    }
                    block.invoke(type);
                }
            });
        }
    }
    
    /*<ptr>*/public static class AVAudioSessionPtr extends Ptr<AVAudioSession, AVAudioSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioSession() {}
    protected AVAudioSession(Handle h, long handle) { super(h, handle); }
    protected AVAudioSession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "availableCategories")
    public native @org.robovm.rt.bro.annotation.Marshaler(AVAudioSessionCategory.AsListMarshaler.class) List<AVAudioSessionCategory> getAvailableCategories();
    @Property(selector = "category")
    public native AVAudioSessionCategory getCategory();
    @Property(selector = "categoryOptions")
    public native AVAudioSessionCategoryOptions getCategoryOptions();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "routeSharingPolicy")
    public native AVAudioSessionRouteSharingPolicy getRouteSharingPolicy();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "availableModes")
    public native @org.robovm.rt.bro.annotation.Marshaler(AVAudioSessionMode.AsListMarshaler.class) List<AVAudioSessionMode> getAvailableModes();
    @Property(selector = "mode")
    public native AVAudioSessionMode getMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "allowHapticsAndSystemSoundsDuringRecording")
    public native boolean isAllowHapticsAndSystemSoundsDuringRecording();
    @Property(selector = "recordPermission")
    public native AVAudioSessionRecordPermission getRecordPermission();
    @Property(selector = "preferredInput")
    public native AVAudioSessionPortDescription getPreferredInput();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "prefersNoInterruptionsFromSystemAlerts")
    public native boolean prefersNoInterruptionsFromSystemAlerts();
    @Property(selector = "preferredSampleRate")
    public native double getPreferredSampleRate();
    @Property(selector = "preferredIOBufferDuration")
    public native double getPreferredIOBufferDuration();
    @Property(selector = "preferredInputNumberOfChannels")
    public native @MachineSizedSInt long getPreferredInputNumberOfChannels();
    @Property(selector = "preferredOutputNumberOfChannels")
    public native @MachineSizedSInt long getPreferredOutputNumberOfChannels();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preferredInputOrientation")
    public native AVAudioStereoOrientation getPreferredInputOrientation();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "inputOrientation")
    public native AVAudioStereoOrientation getInputOrientation();
    @Property(selector = "maximumInputNumberOfChannels")
    public native @MachineSizedSInt long getMaximumInputNumberOfChannels();
    @Property(selector = "maximumOutputNumberOfChannels")
    public native @MachineSizedSInt long getMaximumOutputNumberOfChannels();
    @Property(selector = "inputGain")
    public native float getInputGain();
    @Property(selector = "isInputGainSettable")
    public native boolean isInputGainSettable();
    @Property(selector = "isInputAvailable")
    public native boolean isInputAvailable();
    @Property(selector = "inputDataSources")
    public native NSArray<AVAudioSessionDataSourceDescription> getInputDataSources();
    @Property(selector = "inputDataSource")
    public native AVAudioSessionDataSourceDescription getInputDataSource();
    @Property(selector = "outputDataSources")
    public native NSArray<AVAudioSessionDataSourceDescription> getOutputDataSources();
    @Property(selector = "outputDataSource")
    public native AVAudioSessionDataSourceDescription getOutputDataSource();
    @Property(selector = "sampleRate")
    public native double getSampleRate();
    @Property(selector = "inputNumberOfChannels")
    public native @MachineSizedSInt long getInputNumberOfChannels();
    @Property(selector = "outputNumberOfChannels")
    public native @MachineSizedSInt long getOutputNumberOfChannels();
    @Property(selector = "inputLatency")
    public native double getInputLatency();
    @Property(selector = "outputLatency")
    public native double getOutputLatency();
    @Property(selector = "IOBufferDuration")
    public native double getIOBufferDuration();
    @Property(selector = "isOtherAudioPlaying")
    public native boolean isOtherAudioPlaying();
    @Property(selector = "secondaryAudioShouldBeSilencedHint")
    public native boolean secondaryAudioShouldBeSilencedHint();
    @Property(selector = "outputVolume")
    public native float getOutputVolume();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "promptStyle")
    public native AVAudioSessionPromptStyle getPromptStyle();
    @Property(selector = "availableInputs")
    public native NSArray<AVAudioSessionPortDescription> getAvailableInputs();
    @Property(selector = "currentRoute")
    public native AVAudioSessionRouteDescription getCurrentRoute();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "supportsMultichannelContent")
    public native boolean supportsMultichannelContent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="AVAudioSessionInterruptionNotification", optional=true)
    public static native NSString InterruptionNotification();
    @GlobalValue(symbol="AVAudioSessionRouteChangeNotification", optional=true)
    public static native NSString RouteChangeNotification();
    @GlobalValue(symbol="AVAudioSessionMediaServicesWereLostNotification", optional=true)
    public static native NSString MediaServicesWereLostNotification();
    @GlobalValue(symbol="AVAudioSessionMediaServicesWereResetNotification", optional=true)
    public static native NSString MediaServicesWereResetNotification();
    @GlobalValue(symbol="AVAudioSessionSilenceSecondaryAudioHintNotification", optional=true)
    public static native NSString SilenceSecondaryAudioHintNotification();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVAudioSessionSpatialPlaybackCapabilitiesChangedNotification", optional=true)
    public static native NSString SpatialPlaybackCapabilitiesChangedNotification();
    @GlobalValue(symbol="AVAudioSessionSilenceSecondaryAudioHintTypeKey", optional=true)
    protected static native NSString SilenceSecondaryAudioHintTypeKey();
    @Library("AVFoundation")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVAudioSessionSpatialAudioEnabledKey", optional=true)
        public static native NSString SpatialAudioEnabled();
    }
    
    public boolean setCategory(AVAudioSessionCategory category) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setCategory(category, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setCategory:error:")
    private native boolean setCategory(AVAudioSessionCategory category, NSError.NSErrorPtr outError);
    public boolean setCategory(AVAudioSessionCategory category, AVAudioSessionCategoryOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setCategory(category, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setCategory:withOptions:error:")
    private native boolean setCategory(AVAudioSessionCategory category, AVAudioSessionCategoryOptions options, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public boolean setCategory(AVAudioSessionCategory category, String mode, AVAudioSessionCategoryOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setCategory(category, mode, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setCategory:mode:options:error:")
    private native boolean setCategory(AVAudioSessionCategory category, String mode, AVAudioSessionCategoryOptions options, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public boolean setCategory(AVAudioSessionCategory category, String mode, AVAudioSessionRouteSharingPolicy policy, AVAudioSessionCategoryOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setCategory(category, mode, policy, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setCategory:mode:routeSharingPolicy:options:error:")
    private native boolean setCategory(AVAudioSessionCategory category, String mode, AVAudioSessionRouteSharingPolicy policy, AVAudioSessionCategoryOptions options, NSError.NSErrorPtr outError);
    public boolean setMode(AVAudioSessionMode mode) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setMode(mode, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setMode:error:")
    private native boolean setMode(AVAudioSessionMode mode, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public boolean setAllowHapticsAndSystemSoundsDuringRecording(boolean inValue) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setAllowHapticsAndSystemSoundsDuringRecording(inValue, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "setAllowHapticsAndSystemSoundsDuringRecording:error:")
    private native boolean setAllowHapticsAndSystemSoundsDuringRecording(boolean inValue, NSError.NSErrorPtr outError);
    @Method(selector = "requestRecordPermission:")
    public native void requestRecordPermission(@Block VoidBooleanBlock response);
    public boolean overrideOutputAudioPort(AVAudioSessionPortOverride portOverride) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = overrideOutputAudioPort(portOverride, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "overrideOutputAudioPort:error:")
    private native boolean overrideOutputAudioPort(AVAudioSessionPortOverride portOverride, NSError.NSErrorPtr outError);
    public boolean setPreferredInput(AVAudioSessionPortDescription inPort) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPreferredInput(inPort, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setPreferredInput:error:")
    private native boolean setPreferredInput(AVAudioSessionPortDescription inPort, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 14.5 and later.
     */
    public boolean setPrefersNoInterruptionsFromSystemAlerts(boolean inValue) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPrefersNoInterruptionsFromSystemAlerts(inValue, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "setPrefersNoInterruptionsFromSystemAlerts:error:")
    private native boolean setPrefersNoInterruptionsFromSystemAlerts(boolean inValue, NSError.NSErrorPtr outError);
    @Method(selector = "sharedInstance")
    public static native AVAudioSession getSharedInstance();
    public boolean setActive(boolean active) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setActive(active, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setActive:error:")
    private native boolean setActive(boolean active, NSError.NSErrorPtr outError);
    public boolean setActive(boolean active, AVAudioSessionSetActiveOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setActive(active, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setActive:withOptions:error:")
    private native boolean setActive(boolean active, AVAudioSessionSetActiveOptions options, NSError.NSErrorPtr outError);
    public boolean setPreferredSampleRate(double sampleRate) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPreferredSampleRate(sampleRate, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setPreferredSampleRate:error:")
    private native boolean setPreferredSampleRate(double sampleRate, NSError.NSErrorPtr outError);
    public boolean setPreferredIOBufferDuration(double duration) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPreferredIOBufferDuration(duration, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setPreferredIOBufferDuration:error:")
    private native boolean setPreferredIOBufferDuration(double duration, NSError.NSErrorPtr outError);
    public boolean setPreferredInputNumberOfChannels(@MachineSizedSInt long count) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPreferredInputNumberOfChannels(count, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setPreferredInputNumberOfChannels:error:")
    private native boolean setPreferredInputNumberOfChannels(@MachineSizedSInt long count, NSError.NSErrorPtr outError);
    public boolean setPreferredOutputNumberOfChannels(@MachineSizedSInt long count) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPreferredOutputNumberOfChannels(count, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setPreferredOutputNumberOfChannels:error:")
    private native boolean setPreferredOutputNumberOfChannels(@MachineSizedSInt long count, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public boolean setPreferredInputOrientation(AVAudioStereoOrientation orientation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPreferredInputOrientation(orientation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "setPreferredInputOrientation:error:")
    private native boolean setPreferredInputOrientation(AVAudioStereoOrientation orientation, NSError.NSErrorPtr outError);
    public boolean setInputGain(float gain) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setInputGain(gain, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setInputGain:error:")
    private native boolean setInputGain(float gain, NSError.NSErrorPtr outError);
    public boolean setInputDataSource(AVAudioSessionDataSourceDescription dataSource) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setInputDataSource(dataSource, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setInputDataSource:error:")
    private native boolean setInputDataSource(AVAudioSessionDataSourceDescription dataSource, NSError.NSErrorPtr outError);
    public boolean setOutputDataSource(AVAudioSessionDataSourceDescription dataSource) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setOutputDataSource(dataSource, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setOutputDataSource:error:")
    private native boolean setOutputDataSource(AVAudioSessionDataSourceDescription dataSource, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public boolean setAggregatedIOPreference(AVAudioSessionIOType inIOType) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setAggregatedIOPreference(inIOType, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setAggregatedIOPreference:error:")
    private native boolean setAggregatedIOPreference(AVAudioSessionIOType inIOType, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 15.0 and later.
     */
    public boolean setSupportsMultichannelContent(boolean inValue) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setSupportsMultichannelContent(inValue, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "setSupportsMultichannelContent:error:")
    private native boolean setSupportsMultichannelContent(boolean inValue, NSError.NSErrorPtr outError);
    /*</methods>*/
}
