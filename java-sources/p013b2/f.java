package p013b2;

import i7.B;
import java.util.ArrayList;
import p100j8.n;
import p119l8.a;
import p149o8.b;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f13154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f13155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13156c;

    public f(n nVar) {
        b bVar = new b();
        B b5 = new B(9);
        this.f13155b = bVar;
        this.f13156c = new ArrayList();
        this.f13154a = b5;
        nVar.a(new a(this));
    }

    public f(j jVar) {
        this.f13156c = jVar;
    }
}
