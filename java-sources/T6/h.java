package T6;

import com.google.android.gms.internal.measurement.H;

/* JADX INFO: loaded from: classes.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7830a;

    public h(d dVar) {
        this.f7830a = dVar;
    }

    @Override // T6.b
    public final void a(boolean z10) {
        H h7 = this.f7830a.f7828m;
        h7.sendMessage(h7.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
