package i7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f17073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f17074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Bundle f17076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f17078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f17079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Y0 f17080y;

    public Q0(Y0 y10, String str, String str2, long j, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f17073r = str;
        this.f17074s = str2;
        this.f17075t = j;
        this.f17076u = bundle;
        this.f17077v = z10;
        this.f17078w = z11;
        this.f17079x = z12;
        this.f17080y = y10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17080y.x(this.f17073r, this.f17074s, this.f17075t, this.f17076u, this.f17077v, this.f17078w, this.f17079x);
    }
}
