package androidx.compose.ui.input.pointer;

import D0.O;
import J0.AbstractC0274a0;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointerInputEventHandler f11974c;

    public SuspendPointerInputElement(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i10) {
        obj2 = (i10 & 2) != 0 ? null : obj2;
        this.f11972a = obj;
        this.f11973b = obj2;
        this.f11974c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return j.a(this.f11972a, suspendPointerInputElement.f11972a) && j.a(this.f11973b, suspendPointerInputElement.f11973b) && this.f11974c == suspendPointerInputElement.f11974c;
    }

    public final int hashCode() {
        Object obj = this.f11972a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f11973b;
        return this.f11974c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new O(this.f11972a, this.f11973b, this.f11974c);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        O o10 = (O) qVar;
        Object obj = o10.f1074F;
        Object obj2 = this.f11972a;
        boolean z10 = !j.a(obj, obj2);
        o10.f1074F = obj2;
        Object obj3 = o10.f1075G;
        Object obj4 = this.f11973b;
        if (!j.a(obj3, obj4)) {
            z10 = true;
        }
        o10.f1075G = obj4;
        Class<?> cls = o10.f1077I.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f11974c;
        if (cls == pointerInputEventHandler.getClass() ? z10 : true) {
            o10.x0();
        }
        o10.f1077I = pointerInputEventHandler;
    }
}
