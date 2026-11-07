package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Z.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0681f0 extends p093j0.w implements Parcelable, p093j0.o {
    public static final Parcelable.Creator<C0681f0> CREATOR = new C0679e0();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F0 f10664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public E0 f10665t;

    public C0681f0(Object obj, F0 f3) {
        this.f10664s = f3;
        p093j0.i iVarK = p093j0.n.k();
        E0 e10 = new E0(iVarK.g(), obj);
        if (!(iVarK instanceof p093j0.d)) {
            e10.f18696b = new E0(1, obj);
        }
        this.f10665t = e10;
    }

    @Override // p093j0.o
    public final F0 a() {
        return this.f10664s;
    }

    @Override // p093j0.v
    public final p093j0.x b() {
        return this.f10665t;
    }

    @Override // p093j0.w, p093j0.v
    public final p093j0.x c(p093j0.x xVar, p093j0.x xVar2, p093j0.x xVar3) {
        if (this.f10664s.a(((E0) xVar2).f10595c, ((E0) xVar3).f10595c)) {
            return xVar2;
        }
        return null;
    }

    @Override // p093j0.v
    public final void d(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f10665t = (E0) xVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Z.L0
    public final Object getValue() {
        return ((E0) p093j0.n.u(this.f10665t, this)).f10595c;
    }

    @Override // Z.X
    public final void setValue(Object obj) {
        p093j0.i iVarK;
        E0 e10 = (E0) p093j0.n.i(this.f10665t);
        if (this.f10664s.a(e10.f10595c, obj)) {
            return;
        }
        E0 e11 = this.f10665t;
        synchronized (p093j0.n.f18661b) {
            iVarK = p093j0.n.k();
            ((E0) p093j0.n.p(e11, this, iVarK, e10)).f10595c = obj;
        }
        p093j0.n.o(iVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((E0) p093j0.n.i(this.f10665t)).f10595c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        S s10 = S.f10640t;
        F0 f3 = this.f10664s;
        if (p251z9.j.a(f3, s10)) {
            i11 = 0;
        } else if (p251z9.j.a(f3, S.f10643w)) {
            i11 = 1;
        } else {
            if (!p251z9.j.a(f3, S.f10641u)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
