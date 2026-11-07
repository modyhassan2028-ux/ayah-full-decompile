package K6;

import D6.s;
import E6.w;
import android.content.Context;
import android.support.v4.media.session.r;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j implements G6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101j9.a f5272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f5273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p101j9.a f5274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f5275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p101j9.a f5276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p101j9.a f5277f;
    public final p101j9.a g;

    public j(p101j9.a aVar, p101j9.a aVar2, p101j9.a aVar3, w wVar, p101j9.a aVar4, p101j9.a aVar5, p101j9.a aVar6) {
        this.f5272a = aVar;
        this.f5273b = aVar2;
        this.f5274c = aVar3;
        this.f5275d = wVar;
        this.f5276e = aVar4;
        this.f5277f = aVar5;
        this.g = aVar6;
    }

    @Override // p101j9.a
    public final Object get() {
        Context context = (Context) this.f5272a.get();
        F6.e eVar = (F6.e) this.f5273b.get();
        L6.d dVar = (L6.d) this.f5274c.get();
        r rVar = (r) this.f5275d.get();
        Executor executor = (Executor) this.f5276e.get();
        M6.c cVar = (M6.c) this.f5277f.get();
        R7.f fVar = new R7.f(12);
        H8.e eVar2 = new H8.e(12);
        L6.c cVar2 = (L6.c) this.g.get();
        s sVar = new s();
        sVar.f1308a = context;
        sVar.f1309b = eVar;
        sVar.f1310c = dVar;
        sVar.f1311d = rVar;
        sVar.f1312e = executor;
        sVar.f1313f = cVar;
        sVar.g = fVar;
        sVar.f1314h = eVar2;
        sVar.f1315i = cVar2;
        return sVar;
    }
}
