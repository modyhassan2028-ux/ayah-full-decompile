package O9;

import N9.Y;
import N9.i0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends Y implements i0 {
    @Override // N9.i0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f6148y;
            p251z9.j.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f6149z + ((long) ((int) ((r() + ((long) this.f6143B)) - this.f6149z)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void y(int i10) {
        synchronized (this) {
            Object[] objArr = this.f6148y;
            p251z9.j.b(objArr);
            g(Integer.valueOf(((Number) objArr[((int) ((this.f6149z + ((long) ((int) ((r() + ((long) this.f6143B)) - this.f6149z)))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
