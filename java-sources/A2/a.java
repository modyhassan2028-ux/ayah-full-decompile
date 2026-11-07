package A2;

import A.C0030l0;
import A.C0039q;
import A.C0040q0;
import B2.f;
import B2.g;
import B2.h;
import K9.AbstractC0405x;
import K9.H;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p039d8.b;
import p150o9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0813f2 f484a;

    public a(AbstractC0813f2 abstractC0813f2) {
        this.f484a = abstractC0813f2;
    }

    public b a(B2.a aVar) {
        j.e(aVar, "deletionRequest");
        throw null;
    }

    public b b() {
        return p171r0.j.c(AbstractC0405x.f(AbstractC0405x.b(H.f5322a), new C0040q0(this, (c) null, 1)));
    }

    public b c(f fVar) {
        j.e(fVar, "request");
        throw null;
    }

    public b d(Uri uri, InputEvent inputEvent) {
        j.e(uri, "attributionSource");
        return p171r0.j.c(AbstractC0405x.f(AbstractC0405x.b(H.f5322a), new C0039q(this, uri, inputEvent, null, 7)));
    }

    public b e(Uri uri) {
        j.e(uri, "trigger");
        return p171r0.j.c(AbstractC0405x.f(AbstractC0405x.b(H.f5322a), new C0030l0(this, uri, null, 4)));
    }

    public b f(g gVar) {
        j.e(gVar, "request");
        throw null;
    }

    public b g(h hVar) {
        j.e(hVar, "request");
        throw null;
    }
}
