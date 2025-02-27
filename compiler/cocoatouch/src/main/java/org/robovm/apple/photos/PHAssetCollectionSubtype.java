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
package org.robovm.apple.photos;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/PHAssetCollectionSubtype/*</name>*/ implements ValuedEnum {
    /*<values>*/
    AlbumRegular(2L),
    AlbumSyncedEvent(3L),
    AlbumSyncedFaces(4L),
    AlbumSyncedAlbum(5L),
    AlbumImported(6L),
    AlbumMyPhotoStream(100L),
    AlbumCloudShared(101L),
    SmartAlbumGeneric(200L),
    SmartAlbumPanoramas(201L),
    SmartAlbumVideos(202L),
    SmartAlbumFavorites(203L),
    SmartAlbumTimelapses(204L),
    SmartAlbumAllHidden(205L),
    SmartAlbumRecentlyAdded(206L),
    SmartAlbumBursts(207L),
    SmartAlbumSlomoVideos(208L),
    SmartAlbumUserLibrary(209L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    SmartAlbumSelfPortraits(210L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    SmartAlbumScreenshots(211L),
    /**
     * @since Available in iOS 10.2 and later.
     */
    SmartAlbumDepthEffect(212L),
    /**
     * @since Available in iOS 10.3 and later.
     */
    SmartAlbumLivePhotos(213L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    SmartAlbumAnimated(214L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    SmartAlbumLongExposures(215L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    SmartAlbumUnableToUpload(216L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    SmartAlbumRAW(217L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    SmartAlbumCinematic(218L),
    Any(Bro.IS_32BIT ? Integer.MAX_VALUE : Long.MAX_VALUE);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/PHAssetCollectionSubtype/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/PHAssetCollectionSubtype/*</name>*/ valueOf(long n) {
        for (/*<name>*/PHAssetCollectionSubtype/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/PHAssetCollectionSubtype/*</name>*/.class.getName());
    }
}
