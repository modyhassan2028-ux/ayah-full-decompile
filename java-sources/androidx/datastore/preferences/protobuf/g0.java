package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f12455b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(long j, Object obj) {
        switch (this.f12455b) {
            case 0:
                return j0.g ? j0.b(j, obj) : j0.c(j, obj);
            default:
                return j0.g ? j0.b(j, obj) : j0.c(j, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(long j, Object obj) {
        switch (this.f12455b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(long j, Object obj) {
        switch (this.f12455b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(Object obj, long j, boolean z10) {
        switch (this.f12455b) {
            case 0:
                if (!j0.g) {
                    j0.l(obj, j, z10 ? (byte) 1 : (byte) 0);
                } else {
                    j0.k(obj, j, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!j0.g) {
                    j0.l(obj, j, z10 ? (byte) 1 : (byte) 0);
                } else {
                    j0.k(obj, j, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(Object obj, long j, byte b5) {
        switch (this.f12455b) {
            case 0:
                if (!j0.g) {
                    j0.l(obj, j, b5);
                } else {
                    j0.k(obj, j, b5);
                }
                break;
            default:
                if (!j0.g) {
                    j0.l(obj, j, b5);
                } else {
                    j0.k(obj, j, b5);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(Object obj, long j, double d5) {
        switch (this.f12455b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d5));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(Object obj, long j, float f3) {
        switch (this.f12455b) {
            case 0:
                n(obj, j, Float.floatToIntBits(f3));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        switch (this.f12455b) {
        }
        return false;
    }
}
