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
package org.robovm.apple.webkit;

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
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKUIDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements WKUIDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
    public WKWebView createWebView(WKWebView webView, WKWebViewConfiguration configuration, WKNavigationAction navigationAction, WKWindowFeatures windowFeatures) { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("webViewDidClose:")
    public void didClose(WKWebView webView) {}
    @NotImplemented("webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
    public void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame, @Block Runnable completionHandler) {}
    @NotImplemented("webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
    public void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame, @Block VoidBooleanBlock completionHandler) {}
    @NotImplemented("webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
    public void runJavaScriptTextInputPanel(WKWebView webView, String prompt, String defaultText, WKFrameInfo frame, @Block VoidBlock1<NSString> completionHandler) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("webView:requestMediaCapturePermissionForOrigin:initiatedByFrame:type:decisionHandler:")
    public void requestMediaCapturePermission(WKWebView webView, WKSecurityOrigin origin, WKFrameInfo frame, WKMediaCaptureType type, @Block VoidBlock1<WKPermissionDecision> decisionHandler) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("webView:requestDeviceOrientationAndMotionPermissionForOrigin:initiatedByFrame:decisionHandler:")
    public void requestDeviceOrientationAndMotionPermission(WKWebView webView, WKSecurityOrigin origin, WKFrameInfo frame, @Block VoidBlock1<WKPermissionDecision> decisionHandler) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuConfigurationForElement:completionHandler:
     */
    @Deprecated
    @NotImplemented("webView:shouldPreviewElement:")
    public boolean shouldPreviewElement(WKWebView webView, WKPreviewElementInfo elementInfo) { return false; }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuConfigurationForElement:completionHandler:
     */
    @Deprecated
    @NotImplemented("webView:previewingViewControllerForElement:defaultActions:")
    public UIViewController getPreviewingViewControllerForElement(WKWebView webView, WKPreviewElementInfo elementInfo, NSArray<?> previewActions) { return null; }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuForElement:willCommitWithAnimator:
     */
    @Deprecated
    @NotImplemented("webView:commitPreviewingViewController:")
    public void commitPreviewingViewController(WKWebView webView, UIViewController previewingViewController) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("webView:contextMenuConfigurationForElement:completionHandler:")
    public void getContextMenuConfiguration(WKWebView webView, WKContextMenuElementInfo elementInfo, @Block VoidBlock1<UIContextMenuConfiguration> completionHandler) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("webView:contextMenuWillPresentForElement:")
    public void contextMenuWillPresent(WKWebView webView, WKContextMenuElementInfo elementInfo) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("webView:contextMenuForElement:willCommitWithAnimator:")
    public void getContextMenu(WKWebView webView, WKContextMenuElementInfo elementInfo, UIContextMenuInteractionCommitAnimating animator) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("webView:contextMenuDidEndForElement:")
    public void contextMenuDidEnd(WKWebView webView, WKContextMenuElementInfo elementInfo) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("webView:showLockdownModeFirstUseMessage:completionHandler:")
    public void showLockdownModeFirstUseMessage(WKWebView webView, String message, @Block VoidBlock1<WKDialogResult> completionHandler) {}
    /*</methods>*/
}
