package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0899x implements L {
    @Override // com.google.android.gms.internal.measurement.L
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        E0(parcelG, 23);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC0909z.b(parcelG, bundle);
        E0(parcelG, 9);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        E0(parcelG, 24);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void generateEventId(N n6) {
        Parcel parcelG = g();
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 22);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void getCachedAppInstanceId(N n6) {
        Parcel parcelG = g();
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 19);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void getConditionalUserProperties(String str, String str2, N n6) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 10);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void getCurrentScreenClass(N n6) {
        Parcel parcelG = g();
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 17);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void getCurrentScreenName(N n6) {
        Parcel parcelG = g();
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 16);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void getGmpAppId(N n6) {
        Parcel parcelG = g();
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 21);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void getMaxUserProperties(String str, N n6) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 6);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void getUserProperties(String str, String str2, boolean z10, N n6) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = AbstractC0909z.f14514a;
        parcelG.writeInt(z10 ? 1 : 0);
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 5);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void initialize(a7.a aVar, W w9, long j) {
        Parcel parcelG = g();
        AbstractC0909z.c(parcelG, aVar);
        AbstractC0909z.b(parcelG, w9);
        parcelG.writeLong(j);
        E0(parcelG, 1);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC0909z.b(parcelG, bundle);
        parcelG.writeInt(z10 ? 1 : 0);
        parcelG.writeInt(1);
        parcelG.writeLong(j);
        E0(parcelG, 2);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void logHealthData(int i10, String str, a7.a aVar, a7.a aVar2, a7.a aVar3) {
        Parcel parcelG = g();
        parcelG.writeInt(5);
        parcelG.writeString("Error with data collection. Data lost.");
        AbstractC0909z.c(parcelG, aVar);
        AbstractC0909z.c(parcelG, aVar2);
        AbstractC0909z.c(parcelG, aVar3);
        E0(parcelG, 33);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void onActivityCreatedByScionActivityInfo(Y y10, Bundle bundle, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, y10);
        AbstractC0909z.b(parcelG, bundle);
        parcelG.writeLong(j);
        E0(parcelG, 53);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void onActivityDestroyedByScionActivityInfo(Y y10, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, y10);
        parcelG.writeLong(j);
        E0(parcelG, 54);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void onActivityPausedByScionActivityInfo(Y y10, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, y10);
        parcelG.writeLong(j);
        E0(parcelG, 55);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void onActivityResumedByScionActivityInfo(Y y10, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, y10);
        parcelG.writeLong(j);
        E0(parcelG, 56);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void onActivitySaveInstanceStateByScionActivityInfo(Y y10, N n6, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, y10);
        AbstractC0909z.c(parcelG, n6);
        parcelG.writeLong(j);
        E0(parcelG, 57);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void onActivityStartedByScionActivityInfo(Y y10, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, y10);
        parcelG.writeLong(j);
        E0(parcelG, 51);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void onActivityStoppedByScionActivityInfo(Y y10, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, y10);
        parcelG.writeLong(j);
        E0(parcelG, 52);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void registerOnMeasurementEventListener(T t2) {
        Parcel parcelG = g();
        AbstractC0909z.c(parcelG, t2);
        E0(parcelG, 35);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void retrieveAndUploadBatches(P p10) {
        Parcel parcelG = g();
        AbstractC0909z.c(parcelG, p10);
        E0(parcelG, 58);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, bundle);
        parcelG.writeLong(j);
        E0(parcelG, 8);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void setCurrentScreenByScionActivityInfo(Y y10, String str, String str2, long j) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, y10);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeLong(j);
        E0(parcelG, 50);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void setDataCollectionEnabled(boolean z10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, intent);
        E0(parcelG, 48);
    }
}
