package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface L extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(N n6);

    void getAppInstanceId(N n6);

    void getCachedAppInstanceId(N n6);

    void getConditionalUserProperties(String str, String str2, N n6);

    void getCurrentScreenClass(N n6);

    void getCurrentScreenName(N n6);

    void getGmpAppId(N n6);

    void getMaxUserProperties(String str, N n6);

    void getSessionId(N n6);

    void getTestFlag(N n6, int i10);

    void getUserProperties(String str, String str2, boolean z10, N n6);

    void initForTests(Map map);

    void initialize(a7.a aVar, W w9, long j);

    void isDataCollectionEnabled(N n6);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, N n6, long j);

    void logHealthData(int i10, String str, a7.a aVar, a7.a aVar2, a7.a aVar3);

    void onActivityCreated(a7.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(Y y10, Bundle bundle, long j);

    void onActivityDestroyed(a7.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(Y y10, long j);

    void onActivityPaused(a7.a aVar, long j);

    void onActivityPausedByScionActivityInfo(Y y10, long j);

    void onActivityResumed(a7.a aVar, long j);

    void onActivityResumedByScionActivityInfo(Y y10, long j);

    void onActivitySaveInstanceState(a7.a aVar, N n6, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(Y y10, N n6, long j);

    void onActivityStarted(a7.a aVar, long j);

    void onActivityStartedByScionActivityInfo(Y y10, long j);

    void onActivityStopped(a7.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(Y y10, long j);

    void performAction(Bundle bundle, N n6, long j);

    void registerOnMeasurementEventListener(T t2);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(P p10);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(a7.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(Y y10, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(T t2);

    void setInstanceIdProvider(V v10);

    void setMeasurementEnabled(boolean z10, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, a7.a aVar, boolean z10, long j);

    void unregisterOnMeasurementEventListener(T t2);
}
