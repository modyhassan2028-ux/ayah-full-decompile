package z3;

import N9.InterfaceC0415h;
import N9.P;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p198u3.d f24787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p198u3.e f24788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p198u3.f f24789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p144o3.a f24790d;

    public f(p198u3.d dVar, p198u3.e eVar, p198u3.f fVar, p144o3.a aVar) {
        p251z9.j.e(dVar, "bookmarksModel");
        p251z9.j.e(eVar, "favoritesModel");
        p251z9.j.e(fVar, "notesModel");
        p251z9.j.e(aVar, "audioPlaybackModel");
        this.f24787a = dVar;
        this.f24788b = eVar;
        this.f24789c = fVar;
        this.f24790d = aVar;
    }

    public final P a() {
        return new P(new InterfaceC0415h[]{this.f24787a.f22892c, this.f24788b.f22894b, this.f24789c.f22896b, this.f24790d.f20301c}, new G5.d(5, null, 2));
    }
}
