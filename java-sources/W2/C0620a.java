package W2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: W2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620a extends p {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f9525V;
    public ArrayList T = new ArrayList();
    public boolean U = true;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f9526W = false;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f9527X = 0;

    public C0620a() {
        O(1);
        L(new C0626g(2));
        L(new C0624e());
        L(new C0626g(1));
    }

    @Override // W2.p
    public final void A(View view) {
        super.A(view);
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.T.get(i10)).A(view);
        }
    }

    @Override // W2.p
    public final void B() {
        if (this.T.isEmpty()) {
            J();
            m();
            return;
        }
        u uVar = new u();
        uVar.f9587b = this;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((p) obj).a(uVar);
        }
        this.f9525V = this.T.size();
        if (this.U) {
            ArrayList arrayList2 = this.T;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((p) obj2).B();
            }
            return;
        }
        for (int i12 = 1; i12 < this.T.size(); i12++) {
            ((p) this.T.get(i12 - 1)).a(new u((p) this.T.get(i12), 2));
        }
        p pVar = (p) this.T.get(0);
        if (pVar != null) {
            pVar.B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // W2.p
    public final void C(long j, long j10) {
        long j11;
        long j12 = this.f9568N;
        long j13 = 0;
        if (this.f9578z != null) {
            if (j < 0 && j10 < 0) {
                return;
            }
            if (j > j12 && j10 > j12) {
                return;
            }
        }
        boolean z10 = j < j10;
        if ((j >= 0 && j10 < 0) || (j <= j12 && j10 > j12)) {
            this.f9563I = false;
            w(this, o.f9550c, z10);
        }
        if (!this.U) {
            int size = 1;
            while (true) {
                if (size >= this.T.size()) {
                    size = this.T.size();
                    break;
                } else if (((p) this.T.get(size)).f9569O > j10) {
                    break;
                } else {
                    size++;
                }
            }
            int i10 = size - 1;
            if (j >= j10) {
                while (true) {
                    if (i10 < this.T.size()) {
                        p pVar = (p) this.T.get(i10);
                        long j14 = pVar.f9569O;
                        j11 = j13;
                        long j15 = j - j14;
                        if (j15 < j11) {
                            break;
                        }
                        pVar.C(j15, j10 - j14);
                        i10++;
                        j13 = j11;
                    }
                }
            } else {
                j11 = 0;
                while (i10 >= 0) {
                    p pVar2 = (p) this.T.get(i10);
                    long j16 = pVar2.f9569O;
                    long j17 = j - j16;
                    pVar2.C(j17, j10 - j16);
                    if (j17 >= 0) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            if (this.f9578z != null) {
                if ((j > j12 || j10 > j12) && (j >= 0 || j10 < j11)) {
                    return;
                }
                if (j > j12) {
                    this.f9563I = true;
                }
                w(this, o.f9551d, z10);
            }
        }
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            ((p) this.T.get(i11)).C(j, j10);
        }
        j11 = j13;
        if (this.f9578z != null) {
            if (j > j12) {
                return;
            } else {
                return;
            }
            if (j > j12) {
                this.f9563I = true;
            }
            w(this, o.f9551d, z10);
        }
    }

    @Override // W2.p
    public final void E(va.g gVar) {
        this.f9527X |= 8;
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.T.get(i10)).E(gVar);
        }
    }

    @Override // W2.p
    public final void G(H8.e eVar) {
        super.G(eVar);
        this.f9527X |= 4;
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                ((p) this.T.get(i10)).G(eVar);
            }
        }
    }

    @Override // W2.p
    public final void H() {
        this.f9527X |= 2;
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.T.get(i10)).H();
        }
    }

    @Override // W2.p
    public final void I(long j) {
        this.f9571s = j;
    }

    @Override // W2.p
    public final String K(String str) {
        String strK = super.K(str);
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strK);
            sb.append("\n");
            sb.append(((p) this.T.get(i10)).K(str + "  "));
            strK = sb.toString();
        }
        return strK;
    }

    public final void L(p pVar) {
        this.T.add(pVar);
        pVar.f9578z = this;
        long j = this.f9572t;
        if (j >= 0) {
            pVar.D(j);
        }
        if ((this.f9527X & 1) != 0) {
            pVar.F(this.f9573u);
        }
        if ((this.f9527X & 2) != 0) {
            pVar.H();
        }
        if ((this.f9527X & 4) != 0) {
            pVar.G(this.f9567M);
        }
        if ((this.f9527X & 8) != 0) {
            pVar.E(null);
        }
    }

    @Override // W2.p
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void D(long j) {
        ArrayList arrayList;
        this.f9572t = j;
        if (j < 0 || (arrayList = this.T) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.T.get(i10)).D(j);
        }
    }

    @Override // W2.p
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void F(TimeInterpolator timeInterpolator) {
        this.f9527X |= 1;
        ArrayList arrayList = this.T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p) this.T.get(i10)).F(timeInterpolator);
            }
        }
        this.f9573u = timeInterpolator;
    }

    public final void O(int i10) {
        if (i10 == 0) {
            this.U = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(p123m2.c.r(i10, "Invalid parameter for TransitionSet ordering: "));
            }
            this.U = false;
        }
    }

    @Override // W2.p
    public final void c() {
        super.c();
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.T.get(i10)).c();
        }
    }

    @Override // W2.p
    public final void d(x xVar) {
        View view = xVar.f9590b;
        if (u(view)) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p pVar = (p) obj;
                if (pVar.u(view)) {
                    pVar.d(xVar);
                    xVar.f9591c.add(pVar);
                }
            }
        }
    }

    @Override // W2.p
    public final void f(x xVar) {
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.T.get(i10)).f(xVar);
        }
    }

    @Override // W2.p
    public final void g(x xVar) {
        View view = xVar.f9590b;
        if (u(view)) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p pVar = (p) obj;
                if (pVar.u(view)) {
                    pVar.g(xVar);
                    xVar.f9591c.add(pVar);
                }
            }
        }
    }

    @Override // W2.p
    /* JADX INFO: renamed from: j */
    public final p clone() {
        C0620a c0620a = (C0620a) super.clone();
        c0620a.T = new ArrayList();
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVarClone = ((p) this.T.get(i10)).clone();
            c0620a.T.add(pVarClone);
            pVarClone.f9578z = c0620a;
        }
        return c0620a;
    }

    @Override // W2.p
    public final void l(ViewGroup viewGroup, Aa.a aVar, Aa.a aVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f9571s;
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.T.get(i10);
            if (j > 0 && (this.U || i10 == 0)) {
                long j10 = pVar.f9571s;
                if (j10 > 0) {
                    pVar.I(j10 + j);
                } else {
                    pVar.I(j);
                }
            }
            pVar.l(viewGroup, aVar, aVar2, arrayList, arrayList2);
        }
    }

    @Override // W2.p
    public final boolean s() {
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            if (((p) this.T.get(i10)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // W2.p
    public final void x(View view) {
        super.x(view);
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.T.get(i10)).x(view);
        }
    }

    @Override // W2.p
    public final void y() {
        this.f9568N = 0L;
        int i10 = 0;
        u uVar = new u(this, i10);
        while (i10 < this.T.size()) {
            p pVar = (p) this.T.get(i10);
            pVar.a(uVar);
            pVar.y();
            long j = pVar.f9568N;
            if (this.U) {
                this.f9568N = Math.max(this.f9568N, j);
            } else {
                long j10 = this.f9568N;
                pVar.f9569O = j10;
                this.f9568N = j10 + j;
            }
            i10++;
        }
    }

    @Override // W2.p
    public final p z(m mVar) {
        super.z(mVar);
        return this;
    }
}
