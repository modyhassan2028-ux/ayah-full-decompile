package p007a6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.c f11208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11211e;

    public c(p134n3.c cVar, int i10, boolean z10) {
        super(cVar);
        this.f11208b = cVar;
        this.f11209c = i10;
        this.f11210d = z10;
        this.f11211e = "downloading_" + cVar.f19987a;
    }

    @Override // p007a6.i
    public final String a() {
        return this.f11211e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f11208b, cVar.f11208b) && this.f11209c == cVar.f11209c && this.f11210d == cVar.f11210d;
    }

    public final int hashCode() {
        return (((this.f11208b.f19987a.hashCode() * 31) + this.f11209c) * 31) + (this.f11210d ? 1231 : 1237);
    }

    public final String toString() {
        return "DownloadingRow(row=" + this.f11208b + ", progress=" + this.f11209c + ", isIndeterminate=" + this.f11210d + ")";
    }
}
