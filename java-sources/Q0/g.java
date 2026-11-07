package Q0;

import V0.o;
import V0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6846c;

    public g(int i10, c cVar) {
        this.f6844a = i10;
        this.f6846c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        r rVar = (r) this.f6846c;
        int i11 = 1;
        if (z10) {
            int iD = o.d(rVar.f8389f, i10, z10);
            int lineStart = rVar.f8389f.getLineStart(iD);
            int iF = rVar.f(iD);
            if (i10 == lineStart || i10 == iF) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        int i12 = i10 * 4;
        if (!z12) {
            i11 = z13 ? 2 : 3;
        } else if (z13) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f6844a == i13) {
            return this.f6845b;
        }
        float fH = z12 ? rVar.h(i10, z10) : rVar.i(i10, z10);
        if (z11) {
            this.f6844a = i13;
            this.f6845b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f3, q9.c cVar) {
        f fVar;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f6843u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f6843u = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objInvoke = fVar.f6841s;
        int i11 = fVar.f6843u;
        if (i11 == 0) {
            p110k9.a.e(objInvoke);
            c cVar2 = (c) this.f6846c;
            Float f7 = new Float(f3);
            fVar.f6840r = this;
            fVar.f6843u = 1;
            objInvoke = cVar2.invoke(f7, fVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objInvoke == aVar) {
                return aVar;
            }
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = fVar.f6840r;
            p110k9.a.e(objInvoke);
        }
        gVar.f6845b += ((Number) objInvoke).floatValue();
        return y.f19095a;
    }

    public g(r rVar) {
        this.f6846c = rVar;
        this.f6844a = -1;
    }
}
