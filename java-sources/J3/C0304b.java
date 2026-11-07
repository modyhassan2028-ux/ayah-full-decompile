package J3;

import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import T1.InterfaceC0491h;
import com.squareup.moshi.JsonAdapter;

/* JADX INFO: renamed from: J3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0304b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0491h f4232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonAdapter f4233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X1.e f4234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0415h f4235d;

    public C0304b(InterfaceC0491h interfaceC0491h, JsonAdapter jsonAdapter) {
        p251z9.j.e(jsonAdapter, "bookmarksJsonAdapter");
        this.f4232a = interfaceC0491h;
        this.f4233b = jsonAdapter;
        this.f4234c = F3.a.f2344a;
        this.f4235d = AbstractC0419l.m(new C4.g(interfaceC0491h.b(), this, 1));
    }
}
