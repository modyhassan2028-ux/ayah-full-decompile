package p072ga;

import java.util.ArrayList;
import p083ha.c;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f16371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16372e;

    public d(b bVar, float f3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f16368a = bVar;
        this.f16369b = jCurrentTimeMillis;
        this.f16370c = true;
        this.f16371d = new c(bVar.f16366i, f3);
        this.f16372e = new ArrayList();
    }

    public final boolean a() {
        c cVar = this.f16371d;
        long j = cVar.f16489a.f16487a;
        ArrayList arrayList = this.f16372e;
        if (j <= 0 || cVar.f16492d < j || arrayList.size() != 0) {
            return !this.f16370c && arrayList.size() == 0;
        }
        return true;
    }
}
