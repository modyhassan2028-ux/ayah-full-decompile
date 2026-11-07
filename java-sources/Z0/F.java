package Z0;

import U0.C0515g;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f10891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f10892b;

    public F(C0515g c0515g, s sVar) {
        this.f10891a = c0515g;
        this.f10892b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f3 = (F) obj;
        return p251z9.j.a(this.f10891a, f3.f10891a) && p251z9.j.a(this.f10892b, f3.f10892b);
    }

    public final int hashCode() {
        return this.f10892b.hashCode() + (this.f10891a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f10891a) + ", offsetMapping=" + this.f10892b + ')';
    }
}
