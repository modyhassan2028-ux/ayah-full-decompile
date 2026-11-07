package i7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: renamed from: i7.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0985h0 extends C0 {
    public static final Pair Q = new Pair("", 0L);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f17384A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0979f0 f17385B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0976e0 f17386C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Ca.r f17387D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Aa.a f17388E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0976e0 f17389F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0979f0 f17390G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0979f0 f17391H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f17392I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0976e0 f17393J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0976e0 f17394K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0979f0 f17395L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Ca.r f17396M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Ca.r f17397N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C0979f0 f17398O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Aa.a f17399P;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences f17400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences f17401u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0982g0 f17402v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0979f0 f17403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Ca.r f17404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f17405y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17406z;

    public C0985h0(C1023u0 c1023u0) {
        super(c1023u0);
        this.f17385B = new C0979f0(this, "session_timeout", 1800000L);
        this.f17386C = new C0976e0(this, "start_new_session", true);
        this.f17390G = new C0979f0(this, "last_pause_time", 0L);
        this.f17391H = new C0979f0(this, "session_id", 0L);
        this.f17387D = new Ca.r(this, "non_personalized_ads");
        this.f17388E = new Aa.a(this, "last_received_uri_timestamps_by_source");
        this.f17389F = new C0976e0(this, "allow_remote_dynamite", false);
        this.f17403w = new C0979f0(this, "first_open_time", 0L);
        U6.y.c("app_install_time");
        this.f17404x = new Ca.r(this, "app_instance_id");
        this.f17393J = new C0976e0(this, "app_backgrounded", false);
        this.f17394K = new C0976e0(this, "deep_link_retrieval_complete", false);
        this.f17395L = new C0979f0(this, "deep_link_retrieval_attempts", 0L);
        this.f17396M = new Ca.r(this, "firebase_feature_rollouts");
        this.f17397N = new Ca.r(this, "deferred_attribution_cache");
        this.f17398O = new C0979f0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f17399P = new Aa.a(this, "default_event_parameters");
    }

    @Override // i7.C0
    public final boolean p() {
        return true;
    }

    public final SharedPreferences s() {
        o();
        q();
        U6.y.f(this.f17400t);
        return this.f17400t;
    }

    public final SharedPreferences t() {
        o();
        q();
        if (this.f17401u == null) {
            C1023u0 c1023u0 = (C1023u0) this.f16104r;
            String strValueOf = String.valueOf(c1023u0.f17579r.getPackageName());
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            V v10 = x9.f17178E;
            String strConcat = strValueOf.concat("_preferences");
            v10.b(strConcat, "Default prefs file");
            this.f17401u = c1023u0.f17579r.getSharedPreferences(strConcat, 0);
        }
        return this.f17401u;
    }

    public final SparseArray u() {
        Bundle bundleL = this.f17388E.L();
        int[] intArray = bundleL.getIntArray("uriSources");
        long[] longArray = bundleL.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final H0 v() {
        o();
        return H0.c(s().getInt("consent_source", 100), s().getString("consent_settings", "G1"));
    }

    public final boolean w(C1 c10) {
        o();
        String string = s().getString("stored_tcf_param", "");
        String strA = c10.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = s().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void x(boolean z10) {
        o();
        X x9 = ((C1023u0) this.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17178E.b(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = s().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final boolean y(long j) {
        return j - this.f17385B.a() > this.f17390G.a();
    }
}
