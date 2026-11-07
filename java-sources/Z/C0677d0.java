package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Z.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0677d0 extends p093j0.w implements Parcelable, p093j0.o, X, L0 {
    public static final Parcelable.Creator<C0677d0> CREATOR = new C0671a0(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D0 f10656s;

    public C0677d0(long j) {
        p093j0.i iVarK = p093j0.n.k();
        D0 d1 = new D0(iVarK.g(), j);
        if (!(iVarK instanceof p093j0.d)) {
            d1.f18696b = new D0(1, j);
        }
        this.f10656s = d1;
    }

    @Override // p093j0.o
    public final F0 a() {
        return S.f10643w;
    }

    @Override // p093j0.v
    public final p093j0.x b() {
        return this.f10656s;
    }

    @Override // p093j0.w, p093j0.v
    public final p093j0.x c(p093j0.x xVar, p093j0.x xVar2, p093j0.x xVar3) {
        if (((D0) xVar2).f10594c == ((D0) xVar3).f10594c) {
            return xVar2;
        }
        return null;
    }

    @Override // p093j0.v
    public final void d(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f10656s = (D0) xVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j) {
        p093j0.i iVarK;
        D0 d1 = (D0) p093j0.n.i(this.f10656s);
        if (d1.f10594c != j) {
            D0 d5 = this.f10656s;
            synchronized (p093j0.n.f18661b) {
                iVarK = p093j0.n.k();
                ((D0) p093j0.n.p(d5, this, iVarK, d1)).f10594c = j;
            }
            p093j0.n.o(iVarK, this);
        }
    }

    @Override // Z.L0
    public final Object getValue() {
        return Long.valueOf(((D0) p093j0.n.u(this.f10656s, this)).f10594c);
    }

    @Override // Z.X
    public final void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((D0) p093j0.n.i(this.f10656s)).f10594c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(((D0) p093j0.n.u(this.f10656s, this)).f10594c);
    }
}
