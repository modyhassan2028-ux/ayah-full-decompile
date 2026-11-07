package U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f8132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8133b = 0;

    static {
        p063g1.p[] pVarArr = p063g1.o.f16265b;
        f8132a = p063g1.o.f16266c;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    public static final u a(u uVar, int i10, int i11, long j, p055f1.r rVar, w wVar, p055f1.i iVar, int i12, int i13, p055f1.t tVar) {
        long j10;
        w wVar2;
        int i14 = i10;
        int i15 = i11;
        long j11 = j;
        p055f1.r rVar2 = rVar;
        w wVar3 = wVar;
        p055f1.i iVar2 = iVar;
        int i16 = i12;
        int i17 = i13;
        p055f1.t tVar2 = tVar;
        if (i14 != Integer.MIN_VALUE) {
            j10 = 0;
            if (i14 == uVar.f8124a) {
            }
            p063g1.p[] pVarArr = p063g1.o.f16265b;
            if ((j11 & 1095216660480L) == j10) {
                j11 = uVar.f8126c;
            }
            if (rVar2 == null) {
                rVar2 = uVar.f8127d;
            }
            if (i14 == Integer.MIN_VALUE) {
                i14 = uVar.f8124a;
            }
            if (i15 == Integer.MIN_VALUE) {
                i15 = uVar.f8125b;
            }
            wVar2 = uVar.f8128e;
            if (wVar2 != null && wVar3 == null) {
                wVar3 = wVar2;
            }
            if (iVar2 == null) {
                iVar2 = uVar.f8129f;
            }
            if (i16 == 0) {
                i16 = uVar.g;
            }
            if (i17 == Integer.MIN_VALUE) {
                i17 = uVar.f8130h;
            }
            if (tVar2 == null) {
                tVar2 = uVar.f8131i;
            }
            return new u(i14, i15, j11, rVar2, wVar3, iVar2, i16, i17, tVar2);
        }
        j10 = 0;
        p063g1.p[] pVarArr2 = p063g1.o.f16265b;
        if (((j11 & 1095216660480L) == j10 || p063g1.o.a(j11, uVar.f8126c)) && ((rVar2 == null || rVar2.equals(uVar.f8127d)) && ((i15 == Integer.MIN_VALUE || i15 == uVar.f8125b) && ((wVar3 == null || wVar3.equals(uVar.f8128e)) && ((iVar2 == null || iVar2.equals(uVar.f8129f)) && ((i16 == 0 || i16 == uVar.g) && ((i17 == Integer.MIN_VALUE || i17 == uVar.f8130h) && (tVar2 == null || tVar2.equals(uVar.f8131i))))))))) {
            return uVar;
        }
        p063g1.p[] pVarArr3 = p063g1.o.f16265b;
        if ((j11 & 1095216660480L) == j10) {
            j11 = uVar.f8126c;
        }
        if (rVar2 == null) {
            rVar2 = uVar.f8127d;
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = uVar.f8124a;
        }
        if (i15 == Integer.MIN_VALUE) {
            i15 = uVar.f8125b;
        }
        wVar2 = uVar.f8128e;
        if (wVar2 != null) {
            wVar3 = wVar2;
        }
        if (iVar2 == null) {
            iVar2 = uVar.f8129f;
        }
        if (i16 == 0) {
            i16 = uVar.g;
        }
        if (i17 == Integer.MIN_VALUE) {
            i17 = uVar.f8130h;
        }
        if (tVar2 == null) {
            tVar2 = uVar.f8131i;
        }
        return new u(i14, i15, j11, rVar2, wVar3, iVar2, i16, i17, tVar2);
    }
}
