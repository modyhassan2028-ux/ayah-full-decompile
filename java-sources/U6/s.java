package U6;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f8304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0527e f8306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f8308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0527e f8309f;

    public s(AbstractC0527e abstractC0527e, int i10, Bundle bundle) {
        this.f8309f = abstractC0527e;
        Boolean bool = Boolean.TRUE;
        this.f8306c = abstractC0527e;
        this.f8304a = bool;
        this.f8305b = false;
        this.f8307d = i10;
        this.f8308e = bundle;
    }

    public abstract void a(R6.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f8304a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f8306c.f8235l) {
            this.f8306c.f8235l.remove(this);
        }
    }
}
