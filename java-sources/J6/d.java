package J6;

import E6.w;
import android.support.v4.media.session.r;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements G6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101j9.a f4361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f4362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f4363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p101j9.a f4364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p101j9.a f4365e;

    public d(p101j9.a aVar, p101j9.a aVar2, w wVar, p101j9.a aVar3, p101j9.a aVar4) {
        this.f4361a = aVar;
        this.f4362b = aVar2;
        this.f4363c = wVar;
        this.f4364d = aVar3;
        this.f4365e = aVar4;
    }

    @Override // p101j9.a
    public final Object get() {
        return new c((Executor) this.f4361a.get(), (F6.e) this.f4362b.get(), (r) this.f4363c.get(), (L6.d) this.f4364d.get(), (M6.c) this.f4365e.get());
    }
}
