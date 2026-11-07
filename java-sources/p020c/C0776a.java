package p020c;

import I1.AbstractC0272z;
import android.support.v4.media.session.p;
import android.window.BackEvent;
import p251z9.j;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0776a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13368d;

    public C0776a(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        float fR = AbstractC0272z.r(backEvent);
        float fS = AbstractC0272z.s(backEvent);
        float fN = AbstractC0272z.n(backEvent);
        int iQ = AbstractC0272z.q(backEvent);
        this.f13365a = fR;
        this.f13366b = fS;
        this.f13367c = fN;
        this.f13368d = iQ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f13365a);
        sb.append(", touchY=");
        sb.append(this.f13366b);
        sb.append(", progress=");
        sb.append(this.f13367c);
        sb.append(", swipeEdge=");
        return p.A(sb, this.f13368d, '}');
    }
}
