package p207v2;

import java.util.Arrays;
import java.util.List;
import p120l9.r;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f23257d = new j0(0, r.f19440r);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23260c;

    public j0(int i10, List list) {
        j.e(list, "data");
        this.f23258a = new int[]{i10};
        this.f23259b = list;
        this.f23260c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Arrays.equals(this.f23258a, j0Var.f23258a) && j.a(this.f23259b, j0Var.f23259b) && this.f23260c == j0Var.f23260c;
    }

    public final int hashCode() {
        return (((this.f23259b.hashCode() + (Arrays.hashCode(this.f23258a) * 31)) * 31) + this.f23260c) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.f23258a));
        sb.append(", data=");
        sb.append(this.f23259b);
        sb.append(", hintOriginalPageOffset=");
        return a.E(sb, this.f23260c, ", hintOriginalIndices=null)");
    }
}
