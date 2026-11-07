package K;

import Z.AbstractC0700p;
import Z.InterfaceC0674c;
import Z.InterfaceC0686i;
import android.view.View;
import p223x.AbstractC1427p;
import p223x.InterfaceC1433w;
import p223x.InterfaceC1436z;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements InterfaceC0674c, I1.r, p223x.z0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4842s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4843t;

    public y0(InterfaceC0674c interfaceC0674c, int i10) {
        this.f4843t = interfaceC0674c;
        this.f4841r = i10;
    }

    @Override // Z.InterfaceC0674c
    public Object c() {
        return ((InterfaceC0674c) this.f4843t).c();
    }

    @Override // p223x.x0
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // p223x.x0
    public AbstractC1427p e(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return ((Aa.a) this.f4843t).e(j, abstractC1427p, abstractC1427p2, abstractC1427p3);
    }

    @Override // Z.InterfaceC0674c
    public void f(int i10, Object obj) {
        ((InterfaceC0674c) this.f4843t).f(i10 + (this.f4842s == 0 ? this.f4841r : 0), obj);
    }

    @Override // Z.InterfaceC0674c
    public void g(Object obj) {
        this.f4842s++;
        ((InterfaceC0674c) this.f4843t).g(obj);
    }

    @Override // Z.InterfaceC0674c
    public void h(Object obj, p241y9.e eVar) {
        eVar.invoke(c(), obj);
    }

    @Override // p223x.x0
    public long i(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return ((long) (r() + k())) * 1000000;
    }

    @Override // Z.InterfaceC0674c
    public void j() {
        Object objC = c();
        InterfaceC0686i interfaceC0686i = objC instanceof InterfaceC0686i ? (InterfaceC0686i) objC : null;
        if (interfaceC0686i != null) {
            interfaceC0686i.c();
        }
    }

    @Override // p223x.z0
    public int k() {
        return this.f4842s;
    }

    @Override // p223x.x0
    public AbstractC1427p l(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return ((Aa.a) this.f4843t).l(j, abstractC1427p, abstractC1427p2, abstractC1427p3);
    }

    @Override // Z.InterfaceC0674c
    public void m(int i10, Object obj) {
        ((InterfaceC0674c) this.f4843t).m(i10 + (this.f4842s == 0 ? this.f4841r : 0), obj);
    }

    @Override // Z.InterfaceC0674c
    public void n(int i10, int i11, int i12) {
        int i13 = this.f4842s == 0 ? this.f4841r : 0;
        ((InterfaceC0674c) this.f4843t).n(i10 + i13, i11 + i13, i12);
    }

    @Override // Z.InterfaceC0674c
    public void o(int i10, int i11) {
        ((InterfaceC0674c) this.f4843t).o(i10 + (this.f4842s == 0 ? this.f4841r : 0), i11);
    }

    @Override // I1.r
    public I1.B0 p(View view, I1.B0 b5) {
        View view2 = (View) this.f4843t;
        int i10 = b5.f3671a.g(519).f463b;
        int i11 = this.f4841r;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f4842s + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return b5;
    }

    @Override // p223x.z0
    public int r() {
        return this.f4841r;
    }

    @Override // p223x.x0
    public AbstractC1427p s(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return ((Aa.a) this.f4843t).e(i(abstractC1427p, abstractC1427p2, abstractC1427p3), abstractC1427p, abstractC1427p2, abstractC1427p3);
    }

    @Override // Z.InterfaceC0674c
    public void u() {
        if (!(this.f4842s > 0)) {
            AbstractC0700p.c("OffsetApplier up called with no corresponding down");
        }
        this.f4842s--;
        ((InterfaceC0674c) this.f4843t).u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(int i10, int i11, p241y9.a aVar) {
        this.f4841r = i10;
        this.f4842s = i11;
        this.f4843t = (p251z9.k) aVar;
    }

    public y0(View view, int i10, int i11) {
        this.f4841r = i10;
        this.f4843t = view;
        this.f4842s = i11;
    }

    public y0() {
        this.f4843t = new y0[256];
        this.f4841r = 0;
        this.f4842s = 0;
    }

    public y0(int i10, int i11) {
        this.f4843t = null;
        this.f4841r = i10;
        int i12 = i11 & 7;
        this.f4842s = i12 == 0 ? 8 : i12;
    }

    public y0(int i10, int i11, InterfaceC1433w interfaceC1433w) {
        this.f4841r = i10;
        this.f4842s = i11;
        this.f4843t = new Aa.a((InterfaceC1436z) new p223x.B(i10, i11, interfaceC1433w));
    }
}
