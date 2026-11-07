package p022c1;

import Z.C0681f0;
import Z0.B;
import p013b2.h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0681f0 f13437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f13438s;

    public f(C0681f0 c0681f0, B b5) {
        this.f13437r = c0681f0;
        this.f13438s = b5;
    }

    @Override // p013b2.h
    public final void a() {
        this.f13438s.f10875s = i.f13441a;
    }

    @Override // p013b2.h
    public final void b() {
        this.f13437r.setValue(Boolean.TRUE);
        this.f13438s.f10875s = new j(true);
    }
}
