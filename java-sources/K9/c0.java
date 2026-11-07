package K9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends h0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f5351t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var) {
        super(true);
        boolean z10 = true;
        K(a0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0.f5372s;
        InterfaceC0392j interfaceC0392j = (InterfaceC0392j) atomicReferenceFieldUpdater.get(this);
        C0393k c0393k = interfaceC0392j instanceof C0393k ? (C0393k) interfaceC0392j : null;
        if (c0393k == null) {
            z10 = false;
            break;
        }
        h0 h0VarJ = c0393k.j();
        while (!h0VarJ.D()) {
            InterfaceC0392j interfaceC0392j2 = (InterfaceC0392j) atomicReferenceFieldUpdater.get(h0VarJ);
            C0393k c0393k2 = interfaceC0392j2 instanceof C0393k ? (C0393k) interfaceC0392j2 : null;
            if (c0393k2 == null) {
                z10 = false;
                break;
            }
            h0VarJ = c0393k2.j();
        }
        this.f5351t = z10;
    }

    @Override // K9.h0
    public final boolean D() {
        return this.f5351t;
    }

    @Override // K9.h0
    public final boolean G() {
        return true;
    }
}
