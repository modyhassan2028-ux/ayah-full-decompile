package p013b2;

import B9.a;
import F9.n;
import android.os.Build;
import android.support.v4.media.session.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f13153f;

    public e(f fVar) {
        this.f13153f = fVar;
    }

    @Override // B9.a
    public final void N(Throwable th) {
        ((j) this.f13153f.f13156c).f(th);
    }

    @Override // B9.a
    public final void O(Aa.a aVar) {
        f fVar = this.f13153f;
        fVar.f13155b = aVar;
        Aa.a aVar2 = (Aa.a) fVar.f13155b;
        j jVar = (j) fVar.f13156c;
        fVar.f13154a = new r(aVar2, jVar.g, jVar.f13165i, Build.VERSION.SDK_INT >= 34 ? o.a() : n.x());
        j jVar2 = (j) fVar.f13156c;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f13158a.writeLock().lock();
        try {
            jVar2.f13160c = 1;
            arrayList.addAll(jVar2.f13159b);
            jVar2.f13159b.clear();
            jVar2.f13158a.writeLock().unlock();
            jVar2.f13161d.post(new F1.a(arrayList, jVar2.f13160c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f13158a.writeLock().unlock();
            throw th;
        }
    }
}
