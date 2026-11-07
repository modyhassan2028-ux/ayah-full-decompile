package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends AbstractBinderC0904y implements L {
    public static L asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0904y
    public final boolean a(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        N m10 = null;
        P o10 = null;
        N m11 = null;
        N m12 = null;
        N m13 = null;
        N m14 = null;
        T q10 = null;
        T q11 = null;
        T q12 = null;
        N m15 = null;
        N m16 = null;
        N m17 = null;
        N m18 = null;
        N m19 = null;
        N m20 = null;
        V u8 = null;
        N m21 = null;
        N m22 = null;
        N m23 = null;
        N m24 = null;
        N m25 = null;
        switch (i10) {
            case 1:
                a7.a aVarF0 = a7.b.F0(parcel.readStrongBinder());
                W w9 = (W) AbstractC0909z.a(parcel, W.CREATOR);
                long j = parcel.readLong();
                AbstractC0909z.d(parcel);
                initialize(aVarF0, w9, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                long j10 = parcel.readLong();
                AbstractC0909z.d(parcel);
                logEvent(string, string2, bundle, z11, z12, j10);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m10 = iInterfaceQueryLocalInterface instanceof N ? (N) iInterfaceQueryLocalInterface : new M(strongBinder);
                }
                N n6 = m10;
                long j11 = parcel.readLong();
                AbstractC0909z.d(parcel);
                logEventAndBundle(string3, string4, bundle2, n6, j11);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                a7.a aVarF1 = a7.b.F0(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC0909z.f14514a;
                z10 = parcel.readInt() != 0;
                long j12 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setUserProperty(string5, string6, aVarF1, z10, j12);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC0909z.f14514a;
                z10 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m25 = iInterfaceQueryLocalInterface2 instanceof N ? (N) iInterfaceQueryLocalInterface2 : new M(strongBinder2);
                }
                AbstractC0909z.d(parcel);
                getUserProperties(string7, string8, z10, m25);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m24 = iInterfaceQueryLocalInterface3 instanceof N ? (N) iInterfaceQueryLocalInterface3 : new M(strongBinder3);
                }
                AbstractC0909z.d(parcel);
                getMaxUserProperties(string9, m24);
                break;
            case 7:
                String string10 = parcel.readString();
                long j13 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setUserId(string10, j13);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                long j14 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setConditionalUserProperty(bundle3, j14);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                AbstractC0909z.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m23 = iInterfaceQueryLocalInterface4 instanceof N ? (N) iInterfaceQueryLocalInterface4 : new M(strongBinder4);
                }
                AbstractC0909z.d(parcel);
                getConditionalUserProperties(string13, string14, m23);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC0909z.f14514a;
                z10 = parcel.readInt() != 0;
                long j15 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setMeasurementEnabled(z10, j15);
                break;
            case 12:
                long j16 = parcel.readLong();
                AbstractC0909z.d(parcel);
                resetAnalyticsData(j16);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                long j17 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setMinimumSessionDuration(j17);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                long j18 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setSessionTimeoutDuration(j18);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                a7.a aVarF2 = a7.b.F0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j19 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setCurrentScreen(aVarF2, string15, string16, j19);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m22 = iInterfaceQueryLocalInterface5 instanceof N ? (N) iInterfaceQueryLocalInterface5 : new M(strongBinder5);
                }
                AbstractC0909z.d(parcel);
                getCurrentScreenName(m22);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m21 = iInterfaceQueryLocalInterface6 instanceof N ? (N) iInterfaceQueryLocalInterface6 : new M(strongBinder6);
                }
                AbstractC0909z.d(parcel);
                getCurrentScreenClass(m21);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    u8 = iInterfaceQueryLocalInterface7 instanceof V ? (V) iInterfaceQueryLocalInterface7 : new U(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                }
                AbstractC0909z.d(parcel);
                setInstanceIdProvider(u8);
                break;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m20 = iInterfaceQueryLocalInterface8 instanceof N ? (N) iInterfaceQueryLocalInterface8 : new M(strongBinder8);
                }
                AbstractC0909z.d(parcel);
                getCachedAppInstanceId(m20);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m19 = iInterfaceQueryLocalInterface9 instanceof N ? (N) iInterfaceQueryLocalInterface9 : new M(strongBinder9);
                }
                AbstractC0909z.d(parcel);
                getAppInstanceId(m19);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m18 = iInterfaceQueryLocalInterface10 instanceof N ? (N) iInterfaceQueryLocalInterface10 : new M(strongBinder10);
                }
                AbstractC0909z.d(parcel);
                getGmpAppId(m18);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m17 = iInterfaceQueryLocalInterface11 instanceof N ? (N) iInterfaceQueryLocalInterface11 : new M(strongBinder11);
                }
                AbstractC0909z.d(parcel);
                generateEventId(m17);
                break;
            case 23:
                String string17 = parcel.readString();
                long j20 = parcel.readLong();
                AbstractC0909z.d(parcel);
                beginAdUnitExposure(string17, j20);
                break;
            case 24:
                String string18 = parcel.readString();
                long j21 = parcel.readLong();
                AbstractC0909z.d(parcel);
                endAdUnitExposure(string18, j21);
                break;
            case 25:
                a7.a aVarF3 = a7.b.F0(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityStarted(aVarF3, j22);
                break;
            case 26:
                a7.a aVarF4 = a7.b.F0(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityStopped(aVarF4, j23);
                break;
            case 27:
                a7.a aVarF5 = a7.b.F0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityCreated(aVarF5, bundle5, j24);
                break;
            case 28:
                a7.a aVarF6 = a7.b.F0(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityDestroyed(aVarF6, j25);
                break;
            case 29:
                a7.a aVarF7 = a7.b.F0(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityPaused(aVarF7, j26);
                break;
            case 30:
                a7.a aVarF8 = a7.b.F0(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityResumed(aVarF8, j27);
                break;
            case 31:
                a7.a aVarF9 = a7.b.F0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m16 = iInterfaceQueryLocalInterface12 instanceof N ? (N) iInterfaceQueryLocalInterface12 : new M(strongBinder12);
                }
                long j28 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivitySaveInstanceState(aVarF9, m16, j28);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m15 = iInterfaceQueryLocalInterface13 instanceof N ? (N) iInterfaceQueryLocalInterface13 : new M(strongBinder13);
                }
                long j29 = parcel.readLong();
                AbstractC0909z.d(parcel);
                performAction(bundle6, m15, j29);
                break;
            case 33:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                a7.a aVarF10 = a7.b.F0(parcel.readStrongBinder());
                a7.a aVarF11 = a7.b.F0(parcel.readStrongBinder());
                a7.a aVarF12 = a7.b.F0(parcel.readStrongBinder());
                AbstractC0909z.d(parcel);
                logHealthData(i11, string19, aVarF10, aVarF11, aVarF12);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    q12 = iInterfaceQueryLocalInterface14 instanceof T ? (T) iInterfaceQueryLocalInterface14 : new Q(strongBinder14);
                }
                AbstractC0909z.d(parcel);
                setEventInterceptor(q12);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    q11 = iInterfaceQueryLocalInterface15 instanceof T ? (T) iInterfaceQueryLocalInterface15 : new Q(strongBinder15);
                }
                AbstractC0909z.d(parcel);
                registerOnMeasurementEventListener(q11);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    q10 = iInterfaceQueryLocalInterface16 instanceof T ? (T) iInterfaceQueryLocalInterface16 : new Q(strongBinder16);
                }
                AbstractC0909z.d(parcel);
                unregisterOnMeasurementEventListener(q10);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(AbstractC0909z.f14514a);
                AbstractC0909z.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m14 = iInterfaceQueryLocalInterface17 instanceof N ? (N) iInterfaceQueryLocalInterface17 : new M(strongBinder17);
                }
                int i12 = parcel.readInt();
                AbstractC0909z.d(parcel);
                getTestFlag(m14, i12);
                break;
            case 39:
                ClassLoader classLoader4 = AbstractC0909z.f14514a;
                z10 = parcel.readInt() != 0;
                AbstractC0909z.d(parcel);
                setDataCollectionEnabled(z10);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m13 = iInterfaceQueryLocalInterface18 instanceof N ? (N) iInterfaceQueryLocalInterface18 : new M(strongBinder18);
                }
                AbstractC0909z.d(parcel);
                isDataCollectionEnabled(m13);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                AbstractC0909z.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j30 = parcel.readLong();
                AbstractC0909z.d(parcel);
                clearMeasurementEnabled(j30);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setConsent(bundle8, j31);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setConsentThirdParty(bundle9, j32);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m12 = iInterfaceQueryLocalInterface19 instanceof N ? (N) iInterfaceQueryLocalInterface19 : new M(strongBinder19);
                }
                AbstractC0909z.d(parcel);
                getSessionId(m12);
                break;
            case 48:
                Intent intent = (Intent) AbstractC0909z.a(parcel, Intent.CREATOR);
                AbstractC0909z.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                Y y10 = (Y) AbstractC0909z.a(parcel, Y.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j33 = parcel.readLong();
                AbstractC0909z.d(parcel);
                setCurrentScreenByScionActivityInfo(y10, string20, string21, j33);
                break;
            case 51:
                Y y11 = (Y) AbstractC0909z.a(parcel, Y.CREATOR);
                long j34 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityStartedByScionActivityInfo(y11, j34);
                break;
            case 52:
                Y y12 = (Y) AbstractC0909z.a(parcel, Y.CREATOR);
                long j35 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityStoppedByScionActivityInfo(y12, j35);
                break;
            case 53:
                Y y13 = (Y) AbstractC0909z.a(parcel, Y.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                long j36 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityCreatedByScionActivityInfo(y13, bundle10, j36);
                break;
            case 54:
                Y y14 = (Y) AbstractC0909z.a(parcel, Y.CREATOR);
                long j37 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityDestroyedByScionActivityInfo(y14, j37);
                break;
            case 55:
                Y y15 = (Y) AbstractC0909z.a(parcel, Y.CREATOR);
                long j38 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityPausedByScionActivityInfo(y15, j38);
                break;
            case 56:
                Y y16 = (Y) AbstractC0909z.a(parcel, Y.CREATOR);
                long j39 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivityResumedByScionActivityInfo(y16, j39);
                break;
            case 57:
                Y y17 = (Y) AbstractC0909z.a(parcel, Y.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m11 = iInterfaceQueryLocalInterface20 instanceof N ? (N) iInterfaceQueryLocalInterface20 : new M(strongBinder20);
                }
                long j40 = parcel.readLong();
                AbstractC0909z.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(y17, m11, j40);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    o10 = iInterfaceQueryLocalInterface21 instanceof P ? (P) iInterfaceQueryLocalInterface21 : new O(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 0);
                }
                AbstractC0909z.d(parcel);
                retrieveAndUploadBatches(o10);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
