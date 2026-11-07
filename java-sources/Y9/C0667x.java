package Y9;

import java.util.Arrays;

/* JADX INFO: renamed from: Y9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0667x extends O {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10555l;

    public C0667x(String str, C0668y c0668y) {
        super(str, c0668y, 1);
        this.f10555l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k9.g] */
    @Override // Y9.O
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0667x) {
            W9.f fVar = (W9.f) obj;
            if (this.f10473a.equals(fVar.b())) {
                C0667x c0667x = (C0667x) obj;
                if (c0667x.f10555l && Arrays.equals((W9.f[]) this.j.getValue(), (W9.f[]) c0667x.j.getValue())) {
                    int iD = fVar.d();
                    int i10 = this.f10475c;
                    if (i10 == iD) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (p251z9.j.a(j(i11).b(), fVar.j(i11).b()) && p251z9.j.a(j(i11).c(), fVar.j(i11).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // Y9.O, W9.f
    public final boolean f() {
        return this.f10555l;
    }

    @Override // Y9.O
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
