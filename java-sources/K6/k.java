package K6;

import E6.w;
import android.support.v4.media.session.r;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements G6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101j9.a f5278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f5279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f5280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p101j9.a f5281d;

    public k(p101j9.a aVar, p101j9.a aVar2, w wVar, p101j9.a aVar3) {
        this.f5278a = aVar;
        this.f5279b = aVar2;
        this.f5280c = wVar;
        this.f5281d = aVar3;
    }

    @Override // p101j9.a
    public final Object get() {
        return new Aa.a((Executor) this.f5278a.get(), (L6.d) this.f5279b.get(), (r) this.f5280c.get(), (M6.c) this.f5281d.get());
    }
}
