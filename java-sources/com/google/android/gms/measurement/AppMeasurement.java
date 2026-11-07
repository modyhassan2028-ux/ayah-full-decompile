package com.google.android.gms.measurement;

import U6.y;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.W;
import com.google.firebase.analytics.FirebaseAnalytics;
import i7.C1023u0;
import i7.I0;
import i7.Z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p069g7.a;
import p069g7.b;
import p069g7.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f14520b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14521a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(C1023u0 c1023u0) {
        this.f14521a = new a(c1023u0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f14520b == null) {
            synchronized (AppMeasurement.class) {
                if (f14520b == null) {
                    Z0 z10 = (Z0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (z10 != null) {
                        f14520b = new AppMeasurement(z10);
                    } else {
                        f14520b = new AppMeasurement(C1023u0.s(context, new W(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f14520b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f14521a.m(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f14521a.c(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f14521a.j(str);
    }

    @Keep
    public long generateEventId() {
        return this.f14521a.b();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f14521a.i();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listF = this.f14521a.f(str, str2);
        ArrayList arrayList = new ArrayList(listF == null ? 0 : listF.size());
        for (Bundle bundle : listF) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            y.f(bundle);
            conditionalUserProperty.mAppId = (String) I0.e(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) I0.e(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) I0.e(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = I0.e(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) I0.e(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) I0.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) I0.e(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) I0.e(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) I0.e(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) I0.e(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) I0.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) I0.e(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) I0.e(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) I0.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) I0.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) I0.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f14521a.e();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f14521a.d();
    }

    @Keep
    public String getGmpAppId() {
        return this.f14521a.k();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f14521a.h(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f14521a.l(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f14521a.a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        y.f(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            I0.c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f14521a.g(bundle);
    }

    public AppMeasurement(Z0 z10) {
        this.f14521a = new b(z10);
    }
}
