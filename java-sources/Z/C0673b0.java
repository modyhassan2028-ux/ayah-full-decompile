package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Z.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0673b0 extends p093j0.w implements Parcelable, p093j0.o, X, L0 {
    public static final Parcelable.Creator<C0673b0> CREATOR = new C0671a0(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B0 f10652s;

    public C0673b0(float f3) {
        p093j0.i iVarK = p093j0.n.k();
        B0 b5 = new B0(iVarK.g(), f3);
        if (!(iVarK instanceof p093j0.d)) {
            b5.f18696b = new B0(1, f3);
        }
        this.f10652s = b5;
    }

    @Override // p093j0.o
    public final F0 a() {
        return S.f10643w;
    }

    @Override // p093j0.v
    public final p093j0.x b() {
        return this.f10652s;
    }

    @Override // p093j0.w, p093j0.v
    public final p093j0.x c(p093j0.x xVar, p093j0.x xVar2, p093j0.x xVar3) {
        if (((B0) xVar2).f10587c == ((B0) xVar3).f10587c) {
            return xVar2;
        }
        return null;
    }

    @Override // p093j0.v
    public final void d(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f10652s = (B0) xVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((B0) p093j0.n.u(this.f10652s, this)).f10587c;
    }

    @Override // Z.L0
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f3) {
        p093j0.i iVarK;
        B0 b5 = (B0) p093j0.n.i(this.f10652s);
        if (b5.f10587c == f3) {
            return;
        }
        B0 b10 = this.f10652s;
        synchronized (p093j0.n.f18661b) {
            iVarK = p093j0.n.k();
            ((B0) p093j0.n.p(b10, this, iVarK, b5)).f10587c = f3;
        }
        p093j0.n.o(iVarK, this);
    }

    @Override // Z.X
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((B0) p093j0.n.i(this.f10652s)).f10587c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(g());
    }
}
