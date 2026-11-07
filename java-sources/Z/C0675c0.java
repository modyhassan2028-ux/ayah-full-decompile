package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Z.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0675c0 extends p093j0.w implements Parcelable, p093j0.o, X, L0 {
    public static final Parcelable.Creator<C0675c0> CREATOR = new C0671a0(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0 f10653s;

    public C0675c0(int i10) {
        p093j0.i iVarK = p093j0.n.k();
        C0 c10 = new C0(iVarK.g(), i10);
        if (!(iVarK instanceof p093j0.d)) {
            c10.f18696b = new C0(1, i10);
        }
        this.f10653s = c10;
    }

    @Override // p093j0.o
    public final F0 a() {
        return S.f10643w;
    }

    @Override // p093j0.v
    public final p093j0.x b() {
        return this.f10653s;
    }

    @Override // p093j0.w, p093j0.v
    public final p093j0.x c(p093j0.x xVar, p093j0.x xVar2, p093j0.x xVar3) {
        if (((C0) xVar2).f10591c == ((C0) xVar3).f10591c) {
            return xVar2;
        }
        return null;
    }

    @Override // p093j0.v
    public final void d(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f10653s = (C0) xVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((C0) p093j0.n.u(this.f10653s, this)).f10591c;
    }

    @Override // Z.L0
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i10) {
        p093j0.i iVarK;
        C0 c10 = (C0) p093j0.n.i(this.f10653s);
        if (c10.f10591c != i10) {
            C0 c11 = this.f10653s;
            synchronized (p093j0.n.f18661b) {
                iVarK = p093j0.n.k();
                ((C0) p093j0.n.p(c11, this, iVarK, c10)).f10591c = i10;
            }
            p093j0.n.o(iVarK, this);
        }
    }

    @Override // Z.X
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((C0) p093j0.n.i(this.f10653s)).f10591c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(g());
    }
}
