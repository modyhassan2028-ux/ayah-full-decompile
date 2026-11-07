package androidx.compose.foundation;

import B.j;
import J0.AbstractC0274a0;
import R0.g;
import l0.q;
import p232y.C1462p;
import p232y.O;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f11748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f11751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p241y9.a f11752f;

    public ClickableElement(j jVar, O o10, boolean z10, String str, g gVar, p241y9.a aVar) {
        this.f11747a = jVar;
        this.f11748b = o10;
        this.f11749c = z10;
        this.f11750d = str;
        this.f11751e = gVar;
        this.f11752f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return p251z9.j.a(this.f11747a, clickableElement.f11747a) && p251z9.j.a(this.f11748b, clickableElement.f11748b) && this.f11749c == clickableElement.f11749c && p251z9.j.a(this.f11750d, clickableElement.f11750d) && p251z9.j.a(this.f11751e, clickableElement.f11751e) && this.f11752f == clickableElement.f11752f;
    }

    public final int hashCode() {
        j jVar = this.f11747a;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        O o10 = this.f11748b;
        int iHashCode2 = (((iHashCode + (o10 != null ? o10.hashCode() : 0)) * 31) + (this.f11749c ? 1231 : 1237)) * 31;
        String str = this.f11750d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        g gVar = this.f11751e;
        return this.f11752f.hashCode() + ((iHashCode3 + (gVar != null ? gVar.f7079a : 0)) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new C1462p(this.f11747a, this.f11748b, this.f11749c, this.f11750d, this.f11751e, this.f11752f);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((C1462p) qVar).F0(this.f11747a, this.f11748b, this.f11749c, this.f11750d, this.f11751e, this.f11752f);
    }
}
