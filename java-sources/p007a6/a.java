package p007a6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.a f11203b;

    public a(p134n3.a aVar) {
        super(aVar);
        this.f11203b = aVar;
    }

    @Override // p007a6.i
    public final String a() {
        return "basmala";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f11203b, ((a) obj).f11203b);
    }

    public final int hashCode() {
        return this.f11203b.hashCode();
    }

    public final String toString() {
        return "BasmalaRow(row=" + this.f11203b + ")";
    }
}
